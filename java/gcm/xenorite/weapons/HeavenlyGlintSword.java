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

public class HeavenlyGlintSword extends ItemSword {
	public HeavenlyGlintSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Sword");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer) {

		if (par3EntityPlayer.isSneaking()) {
			return par1ItemStack;
		}

		if (par1ItemStack.stackTagCompound == null) {
			par1ItemStack.setTagCompound(new NBTTagCompound());
		}

		NBTTagCompound tag = par1ItemStack.stackTagCompound;
		tag.setBoolean("isActive", !(tag.getBoolean("isActive")));

		if (tag.getBoolean("isActive")) {
			par1ItemStack.setItemDamage(1);
			par3EntityPlayer.addPotionEffect(new PotionEffect(5, 0, 0, true));
		}

		return par1ItemStack;
	}

	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World,
			Entity par3Entity, int par4, boolean par5) {
		if (!(par3Entity instanceof EntityPlayer)) {
			return;
		}

		EntityPlayer par3EntityPlayer = (EntityPlayer) par3Entity;

		if (par1ItemStack.stackTagCompound == null) {
			par1ItemStack.setTagCompound(new NBTTagCompound());
		}

		if (par1ItemStack.stackTagCompound.getBoolean("isActive")) {
			par3EntityPlayer.addPotionEffect(new PotionEffect(5, 0, 0, true));
		}

		return;
	}

	public void addInformation(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, List List, boolean par3) {
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)
				|| Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			{
				List.add(String
						.format("Right click to activate strength buff."));
				List.add(String.format("It seems to shine as much as a rock."));
			}
		} else {
			List.add("Hold SHIFT for weird description");
		}
	}

}