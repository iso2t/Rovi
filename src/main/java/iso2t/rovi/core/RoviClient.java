package iso2t.rovi.core;

import iso2t.rovi.client.renderer.RoviRenderer;
import iso2t.rovi.core.registries.RoviEntities;
import iso2t.rovi.entity.RoviEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(value = Rovi.MODID, dist = Dist.CLIENT)
@SuppressWarnings("unused")
public final class RoviClient extends RoviMod {

	public RoviClient (IEventBus bus, ModContainer modContainer) {
		super(bus, modContainer);
		super.init();
		bus.addListener(this::registerModelLayers);
		bus.addListener(this::registerEntityRenderers);
	}

	private void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(RoviEntity.LAYER_LOCATION, RoviEntity::createBodyLayer);
	}

	private void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RoviEntities.ROVI.get(), RoviRenderer::new);
	}

	@Override
	public Level getClientLevel () {
		return Minecraft.getInstance().level;
	}

}
