package ninja.techiecrow.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ninja.techiecrow.handler.ConfigurationHandler;

public class BlockShadowBoronOre extends BlockOresXenorite
{
	public BlockShadowBoronOre()
	{
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setBlockName("ShadowBoronOre");
		this.setHarvestLevel("pickaxe", 4);
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