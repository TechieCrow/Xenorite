package com.techiecrow.renderers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.techiecrow.reference.Reference;

@SideOnly(Side.CLIENT)
public class EnderPigRender extends RenderLiving
{

	private static final ResourceLocation textureLocation = new ResourceLocation(Reference.MOD_ID + ":" + "textures/models/entitys/EnderPigInc.png");

	public EnderPigRender(ModelBase model, float shadowSize)
	{
		super(model, shadowSize);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return textureLocation;
	}
}