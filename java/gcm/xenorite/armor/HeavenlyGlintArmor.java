package gcm.xenorite.armor;

import gcm.xenorite.Xenorite;
import gcm.xenorite.crativetab.CreativeTabArmour;
import gcm.xenorite.handler.ConfigurationHandler;
import gcm.xenorite.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack)
	{
		if (world.isDaytime() && (itemstack.getItem() == Xenorite.heavenlyglintHelmet))
		{
			entity.addPotionEffect((new PotionEffect(ConfigurationHandler.helmetHeavenlyGlintEffect1, 0, 0)));
		}
		else if (world.isDaytime() && (itemstack.getItem() == Xenorite.heavenlyglintChestplate))
		{
			entity.addPotionEffect((new PotionEffect(ConfigurationHandler.chestplateHeavenlyGlintEffect1, 0, 0)));
		}
		else if (world.isDaytime() && (itemstack.getItem() == Xenorite.heavenlyglintLeggings))
		{
			entity.addPotionEffect((new PotionEffect(ConfigurationHandler.leggingsHeavenlyGlintEffect1, 0, 0)));
		}
		else if (world.isDaytime() && (itemstack.getItem() == Xenorite.heavenlyglintBoots))
		{
			entity.addPotionEffect((new PotionEffect(ConfigurationHandler.bootsHeavenlyGlintEffect1, 0, 0)));

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