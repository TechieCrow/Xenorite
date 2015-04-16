package gcm.xenorite.proxy;

import gcm.xenorite.entitys.XenBeastEntity;
import gcm.xenorite.renderers.XenBeastRender;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{

	@Override
	public void registerRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(XenBeastEntity.class, new XenBeastRender(new ModelBiped(), 0));
	}

	@Override
	public int addArmor(String xenorite)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}

}