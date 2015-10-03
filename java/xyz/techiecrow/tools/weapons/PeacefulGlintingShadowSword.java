package xyz.techiecrow.tools.weapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5)
	{
		super.onUpdate(stack, world, entity, par4, par5);
		{
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			if (!world.isDaytime() && equipped == stack)
			{
				player.addPotionEffect((new PotionEffect(5, 10, 1)));
			}
		}
	}
}