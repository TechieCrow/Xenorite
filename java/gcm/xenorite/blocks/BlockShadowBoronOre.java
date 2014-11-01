package gcm.xenorite.blocks;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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

		entity.addPotionEffect((new PotionEffect(5, 300, 0))); // Sword
		entity.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 300, 0))); // Pickaxe

		// Armour Effects
		entity.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 300, 0))); // Boots
		entity.addPotionEffect((new PotionEffect(Potion.waterBreathing.getId(), 300, 0))); // Chestplate
		entity.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 300, 0))); // Helmet
		entity.addPotionEffect((new PotionEffect(Potion.jump.getId(), 300, 0))); // Leggings
	}

}