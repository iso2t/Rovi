package iso2t.rovi.datagen.model;

import iso2t.rovi.core.Rovi;
import iso2t.rovi.core.definitions.BlockDefinition;
import iso2t.rovi.core.definitions.RoviBlocks;
import iso2t.rovi.helpers.models.IManualModel;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.stream.Stream;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public final class BlockModelProvider extends ModelProviders {

	private BlockModelGenerators generators;

	public BlockModelProvider (PackOutput output) {
		super(output);
	}

	@Override
	public @NonNull String getName () {
		return "Model Definitions - " + Rovi.MODID + " (blocks)";
	}

	@Override
	protected @NotNull Stream<? extends Holder<Item>> getKnownItems () {
		return BuiltInRegistries.ITEM.listElements().filter(holder -> holder.getKey().identifier().getNamespace().equals(Rovi.MODID)).filter(holder -> holder.value() instanceof BlockItem);
	}

	@Override
	protected void registerModels (@NonNull BlockModelGenerators blockModels, @NonNull ItemModelGenerators itemModels) {
		this.generators = blockModels;
		for (var block : RoviBlocks.getBlocks()) {
			if (!(block.get() instanceof IManualModel)) blockWithItem(block);
		}
	}

	private void blockWithItem (BlockDefinition<?> block) {
		var model = TexturedModel.CUBE.create(block.get(), generators.modelOutput);
		registerBlockState(block, model);
		generators.registerSimpleItemModel(block.get(), model);
	}

	private void registerBlockState (BlockDefinition<?> block, Identifier model) {
		var variant = plainVariant(model);
		generators.blockStateOutput.accept(createSimpleBlock(block.get(), variant));
	}

}
