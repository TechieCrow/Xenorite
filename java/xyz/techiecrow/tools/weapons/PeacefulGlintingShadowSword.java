package xyz.techiecrow.tools.weapons;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PeacefulGlintingShadowSword extends WeaponXenorite
{

	public static double rand;

	public PeacefulGlintingShadowSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("peacefulGlintingShadowSword");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer EntityPlayer)
	{

		if (EntityPlayer.isSneaking())
		{
			return ItemStack;
		}

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		NBTTagCompound tag = ItemStack.stackTagCompound;
		tag.setBoolean("isActive", !(tag.getBoolean("isActive")));

		if (tag.getBoolean("isActive"))
		{
			ItemStack.setItemDamage(1);
			rand = Math.random();
			{
				if (rand < 0.5)
					EntityPlayer.addPotionEffect(new PotionEffect(5, 0, 1));
			}
		}

		return ItemStack;
	}

	@Override
	public void onUpdate(ItemStack ItemStack, World World, Entity Entity, int par1, boolean par2)
	{
		if (!(Entity instanceof EntityPlayer))
		{
			return;
		}

		EntityPlayer par3EntityPlayer = (EntityPlayer) Entity;

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		if (!World.isDaytime() && ItemStack.stackTagCompound.getBoolean("isActive"))
		{
			par3EntityPlayer.addPotionEffect((new PotionEffect(5, 0, 1)));
		}

		return;
	}

	@Override
	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	{

		if (!(ItemStack.getTagCompound() == null))
		{
			if (ItemStack.getTagCompound().getBoolean("isActive"))
			{
				List.add(String.format("\u00A7b\u00A7o\u00A7lPeaceful Glinting Shadow Sword Activated"));
			}
			else
			{
				List.add(String.format("\u00A7b\u00A7o\u00A7lPeaceful Glinting Shadow Sword Not Activated"));
			}
		}
	}
}