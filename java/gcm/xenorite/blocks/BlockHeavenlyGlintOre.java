package gcm.xenorite.blocks;

import gcm.xenorite.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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

	public void onBlockClicked(World world, int i, int j, int k,
			EntityPlayer entity)
	{
		// Weapon Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect1, 300, 0))); // Sword
		
		//Tool Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect2, 300, 0))); // Pickaxe

		// Armour Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect3, 300, 0))); // Boots
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect4, 300, 0))); // Chestplate
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect5, 300, 0))); // Helmet
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreHeavenlyGlintEffect6, 300, 0))); // Leggings
	}

}