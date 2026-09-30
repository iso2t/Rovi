package iso2t.rovi.core;

import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = Rovi.MODID, dist = Dist.DEDICATED_SERVER)
@SuppressWarnings("unused")
public class RoviServer extends RoviMod {

	public RoviServer (IEventBus bus, ModContainer modContainer) {
		super(bus, modContainer);
		super.init();
	}

	@Override
	public Level getClientLevel () {
		return null;
	}

}
