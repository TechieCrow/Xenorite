package gcm.xenorite.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public int addArmor(String xenorite) {
	return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}

}