package xyz.techiecrow.tools.weapons;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import xyz.techiecrow.handler.ConfigurationHandler;

public class HeavenlyGlintSword extends WeaponXenorite
{
	public HeavenlyGlintSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("heavenlyglintSword");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer EntityPlayer)
	{

		if (EntityPlayer.isSneaking())
		{
			return ItemStack;
		}

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		NBTTagCompound tag = ItemStack.stackTagCompound;
		tag.setBoolean("isActive", !(tag.getBoolean("isActive")));

		if (tag.getBoolean("isActive"))
		{
			ItemStack.setItemDamage(1);
			EntityPlayer.addPotionEffect((new PotionEffect(ConfigurationHandler.swordHeavenlyGlintEffect1, 0, 0)));
		}

		return ItemStack;
	}

	@Override
	public void onUpdate(ItemStack ItemStack, World World, Entity Entity, int par4, boolean par5)
	{
		if (!(Entity instanceof EntityPlayer))
		{
			return;
		}

		EntityPlayer EntityPlayer = (EntityPlayer) Entity;

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		if (World.isDaytime() && (ItemStack.stackTagCompound.getBoolean("isActive")))
		{
			EntityPlayer.addPotionEffect((new PotionEffect(ConfigurationHandler.swordHeavenlyGlintEffect1, 0, 0)));
		}

		return;
	}

	public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par1)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
		{
			{
				List.add(String.format("Right click to activate strength buff."));
				List.add(String.format("It seems to shine as much as a rock."));
			}
		}
		else if (!(ItemStack.getTagCompound() == null))
		{
			if (ItemStack.getTagCompound().getBoolean("isActive"))
			{
				List.add(String.format("\u00A7b\u00A7o\u00A7lHeavenly Sword Activated"));
			}
			else
			{
				List.add(String.format("\u00A7b\u00A7o\u00A7lHeavenly Sword Not Activated"));
			}
		}
		List.add("Hold SHIFT for weird description");
	}
}