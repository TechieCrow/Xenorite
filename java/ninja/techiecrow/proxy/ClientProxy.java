package ninja.techiecrow.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import ninja.techiecrow.entitys.EnderPigIncEntity;
import ninja.techiecrow.entitys.XenBeastEntity;
import ninja.techiecrow.renderers.EnderPigIncRender;
import ninja.techiecrow.renderers.XenBeastRender;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(XenBeastEntity.class, new XenBeastRender(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EnderPigIncEntity.class, new EnderPigIncRender(new ModelPig(), 0));
	}

	@Override
	public int addArmor(String xenorite)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}

}