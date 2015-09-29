package xyz.techiecrow.tools.weapons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import xyz.techiecrow.handler.ConfigurationHandler;

public class XCFMasterSword extends WeaponXenorite
{

	public static double rand;

	public XCFMasterSword(ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName("xcfMasterSword");
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
			rand = Math.random();
			{
				if (rand < 0.5)
					EntityPlayer.addPotionEffect(new PotionEffect(5, 600, 1));
				else
					EntityPlayer.addPotionEffect(new PotionEffect(4, 600, 1));
			}
		}

		return ItemStack;
	}

	@Override
	public void onUpdate(ItemStack ItemStack, World World, Entity Entity, int par1, boolean par2)
	{
		if (!(Entity instanceof EntityPlayer))
		{
			return;
		}

		EntityPlayer par3EntityPlayer = (EntityPlayer) Entity;

		if (ItemStack.stackTagCompound == null)
		{
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		if (!World.isDaytime() && ItemStack.stackTagCompound.getBoolean("isActive"))
		{
			par3EntityPlayer.addPotionEffect((new PotionEffect(ConfigurationHandler.swordShadowBoronEffect1, 0, 0)));
		}

		return;
	}
}