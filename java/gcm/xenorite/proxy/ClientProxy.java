package gcm.xenorite.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	
	@Override
	public void registerRenderers() {}
	{
	//RenderingRegistry.registerEntityRenderingHandler(XenBeastEntity.class, new XenBeastRender(new ModelBiped(), 0.5F));

	}
	
	@Override
	public int addArmor(String xenorite)
	{
	return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}
	
}