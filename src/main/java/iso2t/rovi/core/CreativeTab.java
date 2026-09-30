package iso2t.rovi.core;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import iso2t.rovi.core.definitions.ItemDefinition;
import iso2t.rovi.core.definitions.RoviItems;
import iso2t.rovi.helpers.resource.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CreativeTab {

	private static final List<ItemDefinition<?>> ITEMS = new ArrayList<>();

	public static void init (Registry<CreativeModeTab> registry) {
		var tab = CreativeModeTab.builder()
				.title(Component.translatable("itemGroup." + Rovi.MODID))
				.icon(RoviItems.ROVI_HEAD::getStack)
				.displayItems(CreativeTab::buildDisplayItems)
				.build();
		Registry.register(registry, ResourceKey.create(Registries.CREATIVE_MODE_TAB, Resource.get("main")), tab);
	}

	public static void add (ItemDefinition<?> item) {
		ITEMS.add(item);
	}

	private static void buildDisplayItems (CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
		for (var definition : ITEMS) {
			var item = definition.asItem();
			output.accept(item);
		}
	}

}
