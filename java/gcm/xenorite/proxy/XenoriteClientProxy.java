package gcm.xenorite.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class XenoriteClientProxy extends XenoriteCommonProxy {
	
	@Override
	public int addArmor(String xenorite) {
	return RenderingRegistry.addNewArmourRendererPrefix(xenorite);
	}

}