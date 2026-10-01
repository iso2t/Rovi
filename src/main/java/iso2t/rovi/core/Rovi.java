package iso2t.rovi.core;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public interface Rovi {

	String MODID = "rovi";
	String NAME  = "Rovi";

	Logger LOGGER = LoggerFactory.getLogger(NAME);

	static Rovi getInstance() {
		return RoviMod.INSTANCE;
	}

	Collection<ServerPlayer> getPlayers ();

	Level getClientLevel ();

	MinecraftServer getCurrentServer ();

}
