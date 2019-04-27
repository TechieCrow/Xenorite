package com.techiecrow.tools.weapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class WorldlySword extends WeaponXenorite
{

	public static double rand;

	public WorldlySword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("worldlySword");

	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5)
	{
		super.onUpdate(stack, world, entity, par4, par5);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			if (equipped == stack)
			{
				player.addPotionEffect((new PotionEffect(5, 10, 2)));
			}
		}
	}
}