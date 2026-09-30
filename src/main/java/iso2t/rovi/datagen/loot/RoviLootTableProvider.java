package iso2t.rovi.datagen.loot;

import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class RoviLootTableProvider extends LootTableProvider {

	private static final List<SubProviderEntry> SUB_PROVIDERS = List.of(new SubProviderEntry(DropProvider::new, LootContextParamSets.BLOCK));

	public RoviLootTableProvider () {
		super(Set.of(), SUB_PROVIDERS);
	}

}
