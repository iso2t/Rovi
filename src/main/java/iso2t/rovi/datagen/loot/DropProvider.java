package iso2t.rovi.datagen.loot;

import com.google.common.collect.ImmutableMap;
import iso2t.rovi.core.Rovi;
import iso2t.rovi.helpers.resource.Resource;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import org.jspecify.annotations.NonNull;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class DropProvider extends BlockLootSubProvider {

	private final Map<Block, Function<Block, LootTable.Builder>> overrides = createOverrides();

	public DropProvider (LootTableSubProvider.Context output) {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags(), output);
	}

	@Override
	protected @NonNull Iterable<Block> getKnownBlocks () {
		return BuiltInRegistries.BLOCK.stream().filter(entry -> {
			var lootTable = entry.getLootTable().orElse(null);
			return lootTable != null && lootTable.identifier().getNamespace().equals(Rovi.MODID);
		}).toList();
	}

	@Override
	protected void generate () {
		for (var block : getKnownBlocks()) {
			add(block, overrides.getOrDefault(block, this::defaultBuilder).apply(block));
		}
	}

	private LootTable.Builder defaultBuilder (Block block) {
		var entry = LootItem.lootTableItem(block);
		var pool = LootPool.lootPool().setRolls(ContextIntProviders.exactly(1)).add(entry).when(ExplosionCondition.survivesExplosion());
		return LootTable.lootTable().withPool(pool);
	}

	private ImmutableMap<Block, Function<Block, LootTable.Builder>> createOverrides () {
		return ImmutableMap.<Block, Function<Block, LootTable.Builder>>builder().build();
	}

}
