package gcm.xenorite.blocks;

import gcm.xenorite.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockShadowBoronOre extends BlockOresXenorite
{
	public BlockShadowBoronOre()
	{
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setBlockName("ShadowBoronOre");
	}

	public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entity)
	{
		// Weapon Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect1, 300, 0))); // Sword

		// Tool Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect2, 300, 0))); // Pickaxe

		// Armour Effects
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect3, 300, 0))); // Boots
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect4, 300, 0))); // Chestplate
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect5, 300, 0))); // Helmet
		entity.addPotionEffect((new PotionEffect(ConfigurationHandler.oreShadowBoronEffect6, 300, 0))); // Leggings
	}

}