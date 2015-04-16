package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import org.lwjgl.input.Keyboard;

public class FinoriteSword extends ItemSword
{
	public FinoriteSword(ToolMaterial material)
	{
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordFinorite");
		this.setUnlocalizedName("Finorite Sword");

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