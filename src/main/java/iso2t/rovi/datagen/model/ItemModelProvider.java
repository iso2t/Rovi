package iso2t.rovi.datagen.model;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.core.registries.RoviItems;
import iso2t.rovi.helpers.models.IManualModel;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.stream.Stream;

public final class ItemModelProvider extends ModelProviders {

	public ItemModelProvider (PackOutput output) {
		super(output);
	}

	@Override
	protected void registerModels (@NonNull BlockModelGenerators blockModels, @NonNull ItemModelGenerators itemModels) {
		for (var item : RoviItems.getItems()) {
			if (!(item.get() instanceof IManualModel)) {
				itemModels.generateFlatItem(item.get(), item.get() instanceof SpawnEggItem
						? ModelTemplates.FLAT_ITEM : ModelTemplates.FLAT_HANDHELD_ITEM);
			}
		}
	}

	@Override
	protected @NotNull Stream<? extends Holder<Block>> getKnownBlocks () {
		return Stream.empty();
	}

	@Override
	protected @NotNull Stream<? extends Holder<Item>> getKnownItems () {
		return BuiltInRegistries.ITEM.listElements().filter(holder -> holder.getKey().identifier().getNamespace().equals(Rovi.MODID)).filter(holder -> !(holder.value() instanceof BlockItem) && !(holder.value() instanceof IManualModel));
	}

}
