package iso2t.rovi.core;

import iso2t.rovi.core.definitions.RoviBlocks;
import iso2t.rovi.core.definitions.RoviItems;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.server.ServerLifecycleHooks;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;

@AllArgsConstructor
public abstract sealed class RoviMod implements Rovi permits RoviClient, RoviServer {

	@Getter
	public IEventBus eventBus;

	@Getter
	public ModContainer modContainer;

	public final void init () {
		RoviBlocks.REGISTRY.register(getEventBus());
		RoviItems.REGISTRY.register(getEventBus());

		getEventBus().addListener((RegisterEvent event) -> {
			if (event.getRegistryKey() == Registries.CREATIVE_MODE_TAB) CreativeTab.init(BuiltInRegistries.CREATIVE_MODE_TAB);
		});
	}

	@Override
	public Collection<ServerPlayer> getPlayers () {
		var server = getCurrentServer();

		if (server != null) return server.getPlayerList().getPlayers();
		return Collections.emptyList();
	}

	@Nullable
	@Override
	public MinecraftServer getCurrentServer () {
		return ServerLifecycleHooks.getCurrentServer();
	}

}
