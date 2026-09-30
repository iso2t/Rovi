package iso2t.rovi.datagen;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.datagen.language.RoviEnLangProvider;
import iso2t.rovi.datagen.loot.RoviLootTableProvider;
import iso2t.rovi.datagen.model.BlockModelProvider;
import iso2t.rovi.datagen.model.ItemModelProvider;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

@EventBusSubscriber(modid = Rovi.MODID)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("unused")
public class DataGenerators {

	@SubscribeEvent
	public static void gatherClient (@NotNull GatherDataEvent.Client event) {
		var generator = event.getGenerator();
		var pack = generator.getVanillaPack(true);
		var localization = new RoviEnLangProvider(generator);
		var packOutput = generator.getPackOutput();

		// Loot Table
		event.createReloadableRegistryObjects(new RegistrySetBuilder().add(Registries.LOOT_TABLE, new RoviLootTableProvider()));

		// Models
		pack.addProvider(BlockModelProvider::new);
		pack.addProvider(ItemModelProvider::new);

		// LOCALIZATION MUST RUN LAST
		pack.addProvider(_ -> localization);
	}

	@SubscribeEvent
	public static void gatherServer (@NotNull GatherDataEvent.Server event) {
	}

	@Contract(pure = true)
	private static <T extends DataProvider> DataProvider.Factory<T> bindRegistries (BiFunction<PackOutput, CompletableFuture<HolderLookup.Provider>, T> factory, CompletableFuture<HolderLookup.Provider> factories) {
		return output -> factory.apply(output, factories);
	}

}
