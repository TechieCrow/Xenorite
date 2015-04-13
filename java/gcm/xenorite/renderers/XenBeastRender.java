package gcm.xenorite.renderers;

import gcm.xenorite.reference.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class XenBeastRender extends RenderBiped {

	private static final ResourceLocation textureLocation = new ResourceLocation(
			Reference.MOD_ID + ":" + "textures/models/entitys/xenBeast.png");

	public XenBeastRender(ModelBiped model, float shadowSize) {
		super(model, shadowSize);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return textureLocation;
	}
}