package xyz.techiecrow.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import xyz.techiecrow.Xenorite;
import xyz.techiecrow.crativetab.CreativeTabArmour;
import xyz.techiecrow.reference.Reference;

public class FinoriteArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetfinorite", "chestplatefinorite", "leggingsfinorite", "bootsfinorite" };

	public FinoriteArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(Xenorite.heavenlyglintHelmet) && player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(Xenorite.heavenlyglintChestplate) && player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(Xenorite.heavenlyglintLeggings) && player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(Xenorite.heavenlyglintBoots))
		{
			player.addPotionEffect(new PotionEffect(8, 0, 0));
		}
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.finoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetFinorite");
		if (this == Xenorite.finoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateFinorite");
		if (this == Xenorite.finoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsFinorite");
		if (this == Xenorite.finoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsFinorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.finoriteHelmet || stack.getItem() == Xenorite.finoriteChestplate || stack.getItem() == Xenorite.finoriteBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/finorite_layer_1.png";
		}
		if (stack.getItem() == Xenorite.finoriteLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/finorite_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}