package com.techiecrow.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.techiecrow.gui.XenBookVol1GUI;

public class ItemXenBookVol1 extends ItemXenorite
{
	public ItemXenBookVol1()
	{
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("xenBookVol1");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack onItemRightClick(ItemStack ItemStack, World world, EntityPlayer player)
	{
		if (world.isRemote)
		{
			Minecraft.getMinecraft().displayGuiScreen(new XenBookVol1GUI());
		}

		return ItemStack;
	}

	@Override
	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par4)
	{

		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("The Xennical Events"));
				List.add(String.format("Told by"));
				List.add(String.format("Hectic HeYew"));
				List.add(String.format("Volume 1"));
			}
		}
		List.add(String.format("Hold SHIFT for description"));
	}
}