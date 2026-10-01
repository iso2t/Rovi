package iso2t.rovi.client.renderer;

import iso2t.rovi.entity.RoviCompanionEntity;
import iso2t.rovi.entity.RoviEntity;
import iso2t.rovi.helpers.resource.Resource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;

public final class RoviRenderer extends MobRenderer<RoviCompanionEntity, LivingEntityRenderState, RoviEntity<LivingEntityRenderState>> {

	private static final Identifier TEXTURE = Resource.get("textures/entity/rovi.png");

	public RoviRenderer(EntityRendererProvider.Context context) {
		super(context, new RoviEntity<>(context.bakeLayer(RoviEntity.LAYER_LOCATION)), 0.4F);
		addLayer(new FaceLayer(this));
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return TEXTURE;
	}

	private static final class FaceLayer extends EyesLayer<LivingEntityRenderState, RoviEntity<LivingEntityRenderState>> {

		private static final RenderType FACE = RenderTypes.eyes(Resource.get("textures/entity/rovi_face.png"));

		private FaceLayer(RoviRenderer renderer) {
			super(renderer);
		}

		@Override
		public RenderType renderType() {
			return FACE;
		}
	}
}
