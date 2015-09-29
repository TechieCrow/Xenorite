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

public class PeacefulGlintingShadowArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetPeacefulGlintingShadow", "chestplatePeacefulGlintingShadow", "leggingsPeacefulGlintingShadow", "bootsPeacefulGlintingShadow" };

	public PeacefulGlintingShadowArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
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
			player.addPotionEffect(new PotionEffect(10, 1, 0));
			player.addPotionEffect(new PotionEffect(11, 0, 0));
		}
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.peacefulGlintingShadowHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetPeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplatePeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsPeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsPeacefulGlintingShadow");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.peacefulGlintingShadowHelmet || stack.getItem() == Xenorite.peacefulGlintingShadowChestplate || stack.getItem() == Xenorite.peacefulGlintingShadowBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/peacefulGlintingShadow_layer_1.png";
		}
		if (stack.getItem() == Xenorite.peacefulGlintingShadowLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/peacefulGlintingShadow_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}