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

public class CoreoriteArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetcoreorite", "chestplatecoreorite", "leggingscoreorite", "bootscoreorite" };

	public CoreoriteArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
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
			player.addPotionEffect(new PotionEffect(13, 0, 0));
		}
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.coreoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetCoreorite");
		if (this == Xenorite.coreoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateCoreorite");
		if (this == Xenorite.coreoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsCoreorite");
		if (this == Xenorite.coreoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsCoreorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.coreoriteHelmet || stack.getItem() == Xenorite.coreoriteChestplate || stack.getItem() == Xenorite.coreoriteBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/coreorite_layer_1.png";
		}
		if (stack.getItem() == Xenorite.coreoriteLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/coreorite_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}