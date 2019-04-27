//Huge thank you to Shinoow for remaking the if statements in the onItemRightClick method, if it wasn't for him it would be VERY cluttered and hard to read!

package com.techiecrow.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.techiecrow.Xenorite;
import com.techiecrow.init.ModAxes;
import com.techiecrow.init.ModHoes;
import com.techiecrow.init.ModPickaxes;
import com.techiecrow.init.ModShovels;
import com.techiecrow.init.ModWeapons;

public class ItemUniverseSoulSplit extends ItemXenorite
{

	public ItemUniverseSoulSplit()
	{
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("universesoulSplit");
	}

	public boolean hasEffect(ItemStack ItemStack)
	{

		return true;
	}

	// Right clicking consume and give items depending on the following if statments.
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity)
	{
		boolean hasTriggered = false;

		// Swords
		if (entity.inventory.hasItem(ModWeapons.xenoriteSword) && entity.inventory.hasItem(ModWeapons.coreoriteSword) && entity.inventory.hasItem(ModWeapons.finoriteSword))
		{
			entity.inventory.consumeInventoryItem(ModWeapons.xenoriteSword);
			entity.inventory.consumeInventoryItem(ModWeapons.coreoriteSword);
			entity.inventory.consumeInventoryItem(ModWeapons.finoriteSword);
			entity.inventory.addItemStackToInventory(new ItemStack(ModWeapons.xcfMasterSword, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModWeapons.heavenlyglintSword) && entity.inventory.hasItem(ModWeapons.shadowboronSword))
		{

			entity.inventory.consumeInventoryItem(ModWeapons.heavenlyglintSword);
			entity.inventory.consumeInventoryItem(ModWeapons.shadowboronSword);
			entity.inventory.addItemStackToInventory(new ItemStack(ModWeapons.peacefulGlintingShadowSword, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModWeapons.xcfMasterSword) && entity.inventory.hasItem(ModWeapons.peacefulGlintingShadowSword))
		{

			entity.inventory.consumeInventoryItem(ModWeapons.xcfMasterSword);
			entity.inventory.consumeInventoryItem(ModWeapons.peacefulGlintingShadowSword);
			entity.inventory.addItemStackToInventory(new ItemStack(ModWeapons.worldlySword, 1));

			hasTriggered = true;
		}

		// Pickaxes
		if (entity.inventory.hasItem(ModPickaxes.xenoritePickaxe) && entity.inventory.hasItem(ModPickaxes.coreoritePickaxe) && entity.inventory.hasItem(ModPickaxes.finoritePickaxe))
		{
			entity.inventory.consumeInventoryItem(ModPickaxes.xenoritePickaxe);
			entity.inventory.consumeInventoryItem(ModPickaxes.coreoritePickaxe);
			entity.inventory.consumeInventoryItem(ModPickaxes.finoritePickaxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModPickaxes.xcfMasterPickaxe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModPickaxes.heavenlyglintPickaxe) && entity.inventory.hasItem(ModPickaxes.shadowboronPickaxe))
		{

			entity.inventory.consumeInventoryItem(ModPickaxes.heavenlyglintPickaxe);
			entity.inventory.consumeInventoryItem(ModPickaxes.shadowboronPickaxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModPickaxes.peacefulGlintingShadowPickaxe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModPickaxes.xcfMasterPickaxe) && entity.inventory.hasItem(ModPickaxes.peacefulGlintingShadowPickaxe))
		{

			entity.inventory.consumeInventoryItem(ModPickaxes.xcfMasterPickaxe);
			entity.inventory.consumeInventoryItem(ModPickaxes.peacefulGlintingShadowPickaxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModPickaxes.worldlyPickaxe, 1));

			hasTriggered = true;
		}

		// Shovels
		if (entity.inventory.hasItem(ModShovels.xenoriteShovel) && entity.inventory.hasItem(ModShovels.coreoriteShovel) && entity.inventory.hasItem(ModShovels.finoriteShovel))
		{
			entity.inventory.consumeInventoryItem(ModShovels.xenoriteShovel);
			entity.inventory.consumeInventoryItem(ModShovels.coreoriteShovel);
			entity.inventory.consumeInventoryItem(ModShovels.finoriteShovel);
			entity.inventory.addItemStackToInventory(new ItemStack(ModShovels.xcfMasterShovel, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModShovels.heavenlyglintShovel) && entity.inventory.hasItem(ModShovels.shadowboronShovel))
		{

			entity.inventory.consumeInventoryItem(ModShovels.heavenlyglintShovel);
			entity.inventory.consumeInventoryItem(ModShovels.shadowboronShovel);
			entity.inventory.addItemStackToInventory(new ItemStack(ModShovels.peacefulGlintingShadowShovel, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModShovels.xcfMasterShovel) && entity.inventory.hasItem(ModShovels.peacefulGlintingShadowShovel))
		{

			entity.inventory.consumeInventoryItem(ModShovels.xcfMasterShovel);
			entity.inventory.consumeInventoryItem(ModShovels.peacefulGlintingShadowShovel);
			entity.inventory.addItemStackToInventory(new ItemStack(ModShovels.worldlyShovel, 1));

			hasTriggered = true;
		}

		// Axes
		if (entity.inventory.hasItem(ModAxes.xenoriteAxe) && entity.inventory.hasItem(ModAxes.coreoriteAxe) && entity.inventory.hasItem(ModAxes.finoriteAxe))
		{
			entity.inventory.consumeInventoryItem(ModAxes.xenoriteAxe);
			entity.inventory.consumeInventoryItem(ModAxes.coreoriteAxe);
			entity.inventory.consumeInventoryItem(ModAxes.finoriteAxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModAxes.xcfMasterAxe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModAxes.heavenlyglintAxe) && entity.inventory.hasItem(ModAxes.shadowboronAxe))
		{

			entity.inventory.consumeInventoryItem(ModAxes.heavenlyglintAxe);
			entity.inventory.consumeInventoryItem(ModAxes.shadowboronAxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModAxes.peacefulGlintingShadowAxe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModAxes.xcfMasterAxe) && entity.inventory.hasItem(ModAxes.peacefulGlintingShadowAxe))
		{

			entity.inventory.consumeInventoryItem(ModAxes.xcfMasterAxe);
			entity.inventory.consumeInventoryItem(ModAxes.peacefulGlintingShadowAxe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModAxes.worldlyAxe, 1));

			hasTriggered = true;
		}

		// Hoes
		if (entity.inventory.hasItem(ModHoes.xenoriteHoe) && entity.inventory.hasItem(ModHoes.coreoriteHoe) && entity.inventory.hasItem(ModHoes.finoriteHoe))
		{
			entity.inventory.consumeInventoryItem(ModHoes.xenoriteHoe);
			entity.inventory.consumeInventoryItem(ModHoes.coreoriteHoe);
			entity.inventory.consumeInventoryItem(ModHoes.finoriteHoe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModHoes.xcfMasterHoe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModHoes.heavenlyglintHoe) && entity.inventory.hasItem(ModHoes.shadowboronHoe))
		{

			entity.inventory.consumeInventoryItem(ModHoes.heavenlyglintHoe);
			entity.inventory.consumeInventoryItem(ModHoes.shadowboronHoe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModHoes.peacefulGlintingShadowHoe, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(ModHoes.xcfMasterHoe) && entity.inventory.hasItem(ModHoes.peacefulGlintingShadowHoe))
		{

			entity.inventory.consumeInventoryItem(ModHoes.xcfMasterHoe);
			entity.inventory.consumeInventoryItem(ModHoes.peacefulGlintingShadowHoe);
			entity.inventory.addItemStackToInventory(new ItemStack(ModHoes.worldlyHoe, 1));

			hasTriggered = true;
		}

		// Helmets
		if (entity.inventory.hasItem(Xenorite.xenoriteHelmet) && entity.inventory.hasItem(Xenorite.coreoriteHelmet) && entity.inventory.hasItem(Xenorite.finoriteHelmet))
		{
			entity.inventory.consumeInventoryItem(Xenorite.xenoriteHelmet);
			entity.inventory.consumeInventoryItem(Xenorite.coreoriteHelmet);
			entity.inventory.consumeInventoryItem(Xenorite.finoriteHelmet);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.xcfMasterHelmet, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.heavenlyglintHelmet) && entity.inventory.hasItem(Xenorite.shadowboronHelmet))
		{

			entity.inventory.consumeInventoryItem(Xenorite.heavenlyglintHelmet);
			entity.inventory.consumeInventoryItem(Xenorite.shadowboronHelmet);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.peacefulGlintingShadowHelmet, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.xcfMasterHelmet) && entity.inventory.hasItem(Xenorite.peacefulGlintingShadowHelmet))
		{

			entity.inventory.consumeInventoryItem(Xenorite.xcfMasterHelmet);
			entity.inventory.consumeInventoryItem(Xenorite.peacefulGlintingShadowHelmet);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.worldlyHelmet, 1));

			hasTriggered = true;
		}

		// Chestplates
		if (entity.inventory.hasItem(Xenorite.xenoriteChestplate) && entity.inventory.hasItem(Xenorite.coreoriteChestplate) && entity.inventory.hasItem(Xenorite.finoriteChestplate))
		{
			entity.inventory.consumeInventoryItem(Xenorite.xenoriteChestplate);
			entity.inventory.consumeInventoryItem(Xenorite.coreoriteChestplate);
			entity.inventory.consumeInventoryItem(Xenorite.finoriteChestplate);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.xcfMasterChestplate, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.heavenlyglintChestplate) && entity.inventory.hasItem(Xenorite.shadowboronChestplate))
		{

			entity.inventory.consumeInventoryItem(Xenorite.heavenlyglintChestplate);
			entity.inventory.consumeInventoryItem(Xenorite.shadowboronChestplate);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.peacefulGlintingShadowChestplate, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.xcfMasterChestplate) && entity.inventory.hasItem(Xenorite.peacefulGlintingShadowChestplate))
		{

			entity.inventory.consumeInventoryItem(Xenorite.xcfMasterChestplate);
			entity.inventory.consumeInventoryItem(Xenorite.peacefulGlintingShadowChestplate);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.worldlyChestplate, 1));

			hasTriggered = true;
		}

		// Leggingss
		if (entity.inventory.hasItem(Xenorite.xenoriteLeggings) && entity.inventory.hasItem(Xenorite.coreoriteLeggings) && entity.inventory.hasItem(Xenorite.finoriteLeggings))
		{
			entity.inventory.consumeInventoryItem(Xenorite.xenoriteLeggings);
			entity.inventory.consumeInventoryItem(Xenorite.coreoriteLeggings);
			entity.inventory.consumeInventoryItem(Xenorite.finoriteLeggings);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.xcfMasterLeggings, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.heavenlyglintLeggings) && entity.inventory.hasItem(Xenorite.shadowboronLeggings))
		{

			entity.inventory.consumeInventoryItem(Xenorite.heavenlyglintLeggings);
			entity.inventory.consumeInventoryItem(Xenorite.shadowboronLeggings);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.peacefulGlintingShadowLeggings, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.xcfMasterLeggings) && entity.inventory.hasItem(Xenorite.peacefulGlintingShadowLeggings))
		{

			entity.inventory.consumeInventoryItem(Xenorite.xcfMasterLeggings);
			entity.inventory.consumeInventoryItem(Xenorite.peacefulGlintingShadowLeggings);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.worldlyLeggings, 1));

			hasTriggered = true;
		}

		// Bootss
		if (entity.inventory.hasItem(Xenorite.xenoriteBoots) && entity.inventory.hasItem(Xenorite.coreoriteBoots) && entity.inventory.hasItem(Xenorite.finoriteBoots))
		{
			entity.inventory.consumeInventoryItem(Xenorite.xenoriteBoots);
			entity.inventory.consumeInventoryItem(Xenorite.coreoriteBoots);
			entity.inventory.consumeInventoryItem(Xenorite.finoriteBoots);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.xcfMasterBoots, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.heavenlyglintBoots) && entity.inventory.hasItem(Xenorite.shadowboronBoots))
		{

			entity.inventory.consumeInventoryItem(Xenorite.heavenlyglintBoots);
			entity.inventory.consumeInventoryItem(Xenorite.shadowboronBoots);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.peacefulGlintingShadowBoots, 1));

			hasTriggered = true;
		}
		if (entity.inventory.hasItem(Xenorite.xcfMasterBoots) && entity.inventory.hasItem(Xenorite.peacefulGlintingShadowBoots))
		{

			entity.inventory.consumeInventoryItem(Xenorite.xcfMasterBoots);
			entity.inventory.consumeInventoryItem(Xenorite.peacefulGlintingShadowBoots);
			entity.inventory.addItemStackToInventory(new ItemStack(Xenorite.worldlyBoots, 1));

			hasTriggered = true;
		}

		if (hasTriggered)
			itemstack.stackSize--;

		return itemstack;
	}
}