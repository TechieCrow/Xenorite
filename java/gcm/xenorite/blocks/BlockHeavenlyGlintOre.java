package gcm.xenorite.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockHeavenlyGlintOre extends BlockOresXenorite
{
	public BlockHeavenlyGlintOre()
	{
	super();
	this.setHardness(3.0F);
	this.setResistance(5.0F);
	this.setBlockName("HeavenlyGlintOre");
	}
		
	public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entity)
	{
		entity.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 300, 0)));
		entity.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 300, 1)));
	}
	
}