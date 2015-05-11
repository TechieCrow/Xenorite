package ninja.techiecrow.tools.weapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

public class XenoriteSword extends WeaponXenorite
{
	public XenoriteSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("xenoriteSword");

	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("..."));
				List.add(String.format("Thats what she said!"));
			}
		}
		else
		{
			List.add("Hold SHIFT for weird description");
		}
	}
}