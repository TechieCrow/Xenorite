package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

public class XenoriteSword extends ItemSword {
	public XenoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:xenoriteSword");
		this.setUnlocalizedName("Xenorite Sword");

	}
	
	public void addInformation(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, List List, boolean par3) {
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)
				|| Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			{
				List.add(String.format("..."));
				List.add(String.format("Thats what she said!"));
			}
		} else {
			List.add("Hold SHIFT for weird description");
		}
	}
}