package gcm.xenorite.proxy;

import gcm.xenorite.entitys.EnderPigIncEntity;
import gcm.xenorite.entitys.XenBeastEntity;
import gcm.xenorite.renderers.EnderPigIncRender;
import gcm.xenorite.renderers.XenBeastRender;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
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