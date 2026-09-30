package iso2t.rovi.core.definitions;

import com.google.common.base.Preconditions;
import iso2t.rovi.core.CreativeTab;
import iso2t.rovi.core.Rovi;
import iso2t.rovi.helpers.registry.RegistryString;
import iso2t.rovi.helpers.resource.Resource;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RoviBlocks {

	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(Rovi.MODID);

	private static final List<BlockDefinition<?>> BLOCKS = new ArrayList<>();
	private static final BlockBehaviour.StateArgumentPredicate<EntityType<?>> NEVER_ALLOW_SPAWN = (state, level, pos, entity) -> false;

	public static final BlockDefinition<Block> ASSEMBLER = block("Assembler", Block::new);
	public static final BlockDefinition<Block> GARAGE = block("Garage", Block::new);

	public static List<BlockDefinition<?>> getBlocks() {
		return Collections.unmodifiableList(BLOCKS);
	}

	private static <T extends Block> BlockDefinition<T> block (String englishName, Function<BlockBehaviour.Properties, T> supplier) {
		var registry = new RegistryString(englishName);
		return block(englishName, Resource.get(registry.getRegistryName()), supplier);
	}

	private static <T extends Block> BlockDefinition<T> block (String englishName, Identifier id, Function<BlockBehaviour.Properties, T> supplier) {
		return block(englishName, id, supplier, null);
	}

	private static <T extends Block> BlockDefinition<T> block (String englishName, Identifier id, Function<BlockBehaviour.Properties, T> supplier, @Nullable BiFunction<Block, Item.Properties, BlockItem> itemSupplier) {
		Preconditions.checkArgument(id.getNamespace().equals(Rovi.MODID));

		var deferredBlock = REGISTRY.registerBlock(id.getPath(), supplier);
		var deferredItem = RoviItems.REGISTRY.register(id.getPath(), () -> {
			var block = deferredBlock.get();
			var itemProperties = new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix();
			if (itemSupplier != null) {
				var item = itemSupplier.apply(block, itemProperties);
				if (item == null) throw new IllegalArgumentException("BlockItem factory for " + id + " returned null");
				return item;
			} else {
				return new BlockItem(block, itemProperties);
			}
		});

		var itemDefinition = new ItemDefinition<>(englishName, deferredItem);
		CreativeTab.add(itemDefinition);
		BlockDefinition<T> definition = new BlockDefinition<>(englishName, deferredBlock, itemDefinition);
		BLOCKS.add(definition);
		return definition;
	}

}
