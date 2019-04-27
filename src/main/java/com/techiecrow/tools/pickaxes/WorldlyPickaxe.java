package com.techiecrow.tools.pickaxes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class WorldlyPickaxe extends PickaxeXenorite
{
	public WorldlyPickaxe(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("worldlyPickaxe");

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
				player.addPotionEffect((new PotionEffect(3, 10, 2)));
			}
		}
	}
}