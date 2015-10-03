package xyz.techiecrow.tools.weapons;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ShadowBoronSword extends WeaponXenorite
{
	public ShadowBoronSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("shadowboronSword");

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
				player.addPotionEffect((new PotionEffect(5, 10, 0)));
			}
		}
	}

	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par1)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("Right click to activate strength buff."));
				List.add(String.format("It's almost as dark as a torch."));
			}
		}
		else
		{
			List.add("Hold SHIFT for weird description");
		}
	}
}