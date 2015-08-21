package xyz.techiecrow.proxy;

import xyz.techiecrow.entitys.EnderPigIncEntity;
import xyz.techiecrow.entitys.XenBeastEntity;
import xyz.techiecrow.renderers.EnderPigIncRender;
import xyz.techiecrow.renderers.XenBeastModel;
import xyz.techiecrow.renderers.XenBeastRender;
import net.minecraft.client.model.ModelPig;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(XenBeastEntity.class, new XenBeastRender(new XenBeastModel(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EnderPigIncEntity.class, new EnderPigIncRender(new ModelPig(), 0));
	}

	@Override
	public int addArmor(String xenorite)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}

}