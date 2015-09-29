package xyz.techiecrow.renderers;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import xyz.techiecrow.reference.Reference;

public class XenBeastRender extends RenderLiving
{

	private static final ResourceLocation textureLocation = new ResourceLocation(Reference.MOD_ID + ":" + "textures/models/entitys/xenBeast.png");

	public XenBeastRender(XenBeastModel model, float shadowSize)
	{
		super(new XenBeastModel(), shadowSize);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return textureLocation;
	}
}