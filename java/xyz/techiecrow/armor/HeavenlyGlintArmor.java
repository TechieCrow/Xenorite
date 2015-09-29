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

public class HeavenlyGlintArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetheavenlyglint", "chestplateheavenlyglint", "leggingsheavenlyglint", "bootsheavenlyglint" };

	public HeavenlyGlintArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
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
			player.addPotionEffect(new PotionEffect(10, 0, 0));
		}
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.heavenlyglintHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetHeavenlyGlint");
		if (this == Xenorite.heavenlyglintChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateHeavenlyGlint");
		if (this == Xenorite.heavenlyglintLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsHeavenlyGlint");
		if (this == Xenorite.heavenlyglintBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsHeavenlyGlint");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.heavenlyglintHelmet || stack.getItem() == Xenorite.heavenlyglintChestplate || stack.getItem() == Xenorite.heavenlyglintBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/heavenlyglint_layer_1.png";
		}
		if (stack.getItem() == Xenorite.heavenlyglintLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/heavenlyglint_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}