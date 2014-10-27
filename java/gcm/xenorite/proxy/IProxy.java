package gcm.xenorite.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;

public interface IProxy
{
	public void registerRenderers();
	public int addArmor(String xenorite);
}
