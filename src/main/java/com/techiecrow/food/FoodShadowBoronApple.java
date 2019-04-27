package com.techiecrow.food;

import com.techiecrow.crativetab.CreativeTabItems;
import com.techiecrow.handler.ConfigurationHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodShadowBoronApple extends ItemFood
{

	public static double rand;

	public FoodShadowBoronApple()
	{
		super(ConfigurationHandler.appleShadowBoronHungerAmount, ConfigurationHandler.appleShadowBoronSaturationAmount, ConfigurationHandler.appleShadowBoronWolvesFavoriteFood);
		this.setMaxStackSize(100);
		this.setTextureName("xenorite:appleShadowBoron");
		this.setUnlocalizedName("appleShadowBoron");
		this.setCreativeTab(CreativeTabItems.Xenoriteitems);
	}

	@Override
	protected void onFoodEaten(ItemStack item, World world, EntityPlayer player)
	{
		if (!world.isRemote && !world.isDaytime())
		{

			rand = Math.random();
			{
				if (rand < 0.5)
					player.addPotionEffect(new PotionEffect(ConfigurationHandler.appleShadowBoronEffect1, ConfigurationHandler.appleShadowBoronEffectTime1, 0));
				else
					player.addPotionEffect(new PotionEffect(ConfigurationHandler.appleShadowBoronEffect2, ConfigurationHandler.appleShadowBoronEffectTime2, 0));
			}
		}
		else
		{
			super.onFoodEaten(item, world, player);
		}
	}
}