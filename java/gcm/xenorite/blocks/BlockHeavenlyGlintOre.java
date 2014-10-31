package gcm.xenorite.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockHeavenlyGlintOre extends BlockOresXenorite {
	public BlockHeavenlyGlintOre() {
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setBlockName("HeavenlyGlintOre");
	}

	public void onBlockClicked(World world, int i, int j, int k,
			EntityPlayer entity) {
		// Tool Effects
		entity.addPotionEffect((new PotionEffect(5, 300, 0))); // Sword

		// Armour Effects
		entity.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 300,
				0))); // Boots
		entity.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 300,
				0))); // Chestplate
		entity.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(),
				300, 0))); // Helmet
		entity.addPotionEffect((new PotionEffect(Potion.jump.getId(), 300, 0))); // Leggings
	}

}