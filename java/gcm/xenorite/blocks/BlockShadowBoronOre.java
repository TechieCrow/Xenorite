package gcm.xenorite.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;


public class BlockShadowBoronOre extends BlockOresXenorite
{
	public BlockShadowBoronOre() {
	super();
	this.setHardness(3.0F);
	this.setResistance(5.0F);
	this.setBlockName("ShadowBoronOre");
	}
	
	public void onBlockClicked(World world, int i, int j, int k,
			EntityPlayer entity) {

		entity.addPotionEffect((new PotionEffect(Potion.blindness.getId(), 300, 0)));
		entity.addPotionEffect((new PotionEffect(Potion.digSlowdown.getId(), 300, 5)));
	}

}