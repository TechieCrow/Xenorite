package com.techiecrow.armor;

import com.techiecrow.crativetab.CreativeTabArmour;
import com.techiecrow.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import com.techiecrow.Xenorite;

public class XCFMasterArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetXCFMaster", "chestplateXCFMaster", "leggingsXCFMaster", "bootsXCFMaster" };

	public XCFMasterArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{
		if (world.isDaytime() && player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(Xenorite.heavenlyglintHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(Xenorite.heavenlyglintChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(Xenorite.heavenlyglintLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(Xenorite.heavenlyglintBoots))
		{
			player.addPotionEffect(new PotionEffect(8, 0, 1));
			player.addPotionEffect(new PotionEffect(13, 0, 1));
			player.addPotionEffect(new PotionEffect(23, 0, 1));
			player.addPotionEffect(new PotionEffect(21, 0, 0));
		}
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.xcfMasterHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetXCFMaster");
		if (this == Xenorite.xcfMasterChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateXCFMaster");
		if (this == Xenorite.xcfMasterLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsXCFMaster");
		if (this == Xenorite.xcfMasterBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsXCFMaster");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.xcfMasterHelmet || stack.getItem() == Xenorite.xcfMasterChestplate || stack.getItem() == Xenorite.xcfMasterBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/xcfMaster_layer_1.png";
		}
		if (stack.getItem() == Xenorite.xcfMasterLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/xcfMaster_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}