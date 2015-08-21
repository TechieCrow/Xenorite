package xyz.techiecrow.tools.weapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

public class CoreoriteSword extends WeaponXenorite
{
	public CoreoriteSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("coreoriteSword");

	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("Your enemies blood turns blue"));
				List.add(String.format("When you use this sword."));
				List.add(String.format("How weird!"));
			}
		}
		else
		{
			List.add("Hold SHIFT for weird description");
		}
	}

}