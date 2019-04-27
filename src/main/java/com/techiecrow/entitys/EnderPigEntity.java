package com.techiecrow.entitys;

import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EnderPigEntity extends EntityEnderman
{

	World world = null;

	public EnderPigEntity(World World)
	{
		super(World);
		world = World;
		experienceValue = 5;
		this.isImmuneToFire = true;
	}

	protected void dropFewItems(boolean par1, int par2)
	{
		this.dropItem(Items.ender_pearl, 1);
	}

	protected void dropRareDrop(int par1)
	{
		this.dropItem(Items.ender_eye, 1);
	}
}