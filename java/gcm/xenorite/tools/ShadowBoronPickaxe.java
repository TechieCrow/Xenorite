package gcm.xenorite.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ShadowBoronPickaxe extends ItemPickaxe {
	public ShadowBoronPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeShadowBoron");
		this.setUnlocalizedName("ShadowBoron Pickaxe");

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

		if (!par2World.isDaytime() && par1ItemStack.stackTagCompound.getBoolean("isActive")) {
			par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(), 0, 0, true)));
		}

		return;
	}
	
	/*public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
        {
            {
            	List.add(String.format("§7Some text."));
            }
        } else
        {
            List.add("Hold §l§oSHIFT§r §7for weird description");
        }
    }*/

}