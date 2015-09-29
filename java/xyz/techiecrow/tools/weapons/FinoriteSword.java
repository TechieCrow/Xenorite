package xyz.techiecrow.tools.weapons;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class FinoriteSword extends WeaponXenorite
{
	public FinoriteSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("finoriteSword");

	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("You may turn yellow"));
				List.add(String.format("If you stick the pointy"));
				List.add(String.format("End in your mouth!"));
				List.add(String.format("Go ahead and try it!"));
			}
		}
		else
		{
			List.add("Hold SHIFT for weird description");
		}
	}

}