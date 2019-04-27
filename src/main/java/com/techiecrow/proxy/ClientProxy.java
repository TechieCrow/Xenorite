package com.techiecrow.proxy;

import com.techiecrow.entitys.EnderPigEntity;
import com.techiecrow.entitys.XenBeastEntity;
import com.techiecrow.renderers.EnderPigRender;
import com.techiecrow.renderers.XenBeastModel;
import com.techiecrow.renderers.XenBeastRender;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelPig;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(XenBeastEntity.class, new XenBeastRender(new XenBeastModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EnderPigEntity.class, new EnderPigRender(new ModelPig(), 0));
	}

	@Override
	public int addArmor(String xenorite)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}
}