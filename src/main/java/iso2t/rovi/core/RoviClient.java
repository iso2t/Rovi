package iso2t.rovi.core;

import net.minecraft.client.Minecraft;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = Rovi.MODID, dist = Dist.CLIENT)
@SuppressWarnings("unused")
public final class RoviClient extends RoviMod {

	public RoviClient (IEventBus bus, ModContainer modContainer) {
		super(bus, modContainer);
		super.init();
	}

	@Override
	public Level getClientLevel () {
		return Minecraft.getInstance().level;
	}

}
