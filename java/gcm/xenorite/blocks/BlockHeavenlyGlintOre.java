package gcm.xenorite.blocks;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;


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
		
		entity.addChatMessage((new ChatComponentText("The heavens watch over the ore as it breaks.")));
	}
	
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
			{
				
			}

}