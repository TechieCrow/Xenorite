package com.techiecrow.items;

import java.util.List;

import com.techiecrow.handler.ConfigurationHandler;
import org.lwjgl.input.Keyboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemXenBeastSoulFragment extends ItemXenorite
{
	public ItemXenBeastSoulFragment()
	{
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("xenbeastsoulFragment1");
	}

	public boolean hasEffect(ItemStack ItemStack)
	{

		return true;
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
			EntityPlayer.addPotionEffect(new PotionEffect(ConfigurationHandler.xenbeastSoulFragmenteffect, 0, 0, true));
		}

		return ItemStack;
	}

	@Override
	public void onUpdate(ItemStack ItemStack, World World, Entity Entity, int par4, boolean par5)
	{
		if (!(Entity instanceof EntityPlayer))
		{
			return;
		}

		EntityPlayer EntityPlayer = (EntityPlayer) Entity;

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		if ((ItemStack.stackTagCompound.getBoolean("isActive")))
		{
			EntityPlayer.addPotionEffect(new PotionEffect(ConfigurationHandler.xenbeastSoulFragmenteffect, 0, 0, true));
		}

		return;
	}

	@Override
	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	{

		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("A small fragment of a Xen Beasts soul."));
				List.add(String.format("Activating & carrying this with you"));
				List.add(String.format("Will grant the ablilty to run faster!"));
			}
		}
		else if (!(ItemStack.getTagCompound() == null))
		{
			if (ItemStack.getTagCompound().getBoolean("isActive"))
			{
				List.add(String.format("�b�o�lFragment Activated"));
			}
			else
			{
				List.add(String.format("�b�o�lFragment Not Activated"));
			}
		}
		List.add(String.format("Hold SHIFT for weird description"));
	}
}