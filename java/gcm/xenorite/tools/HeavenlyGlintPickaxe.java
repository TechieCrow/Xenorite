package gcm.xenorite.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.crativetab.CreativeTabTools;
import gcm.xenorite.handler.ConfigurationHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HeavenlyGlintPickaxe extends ItemPickaxe {
	public HeavenlyGlintPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Pickaxe");

	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer EntityPlayer) {

		if (EntityPlayer.isSneaking()) {
			return ItemStack;
		}

		if (ItemStack.stackTagCompound == null) {
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		NBTTagCompound tag = ItemStack.stackTagCompound;
		tag.setBoolean("isActive", !(tag.getBoolean("isActive")));

		if (tag.getBoolean("isActive")) {
			ItemStack.setItemDamage(1);
			EntityPlayer.addPotionEffect(new PotionEffect(5, 0, 0, true));
		}

		return ItemStack;
	}

	@Override
	public void onUpdate(ItemStack ItemStack, World World, Entity Entity, int par1, boolean par2) {
		if (!(Entity instanceof EntityPlayer)) {
			return;
		}

		EntityPlayer par3EntityPlayer = (EntityPlayer) Entity;

		if (ItemStack.stackTagCompound == null) {
			ItemStack.setTagCompound(new NBTTagCompound());
		}

		if (World.isDaytime() && ItemStack.stackTagCompound.getBoolean("isActive")) {
			par3EntityPlayer.addPotionEffect((new PotionEffect(ConfigurationHandler.swordHeavenlyGlintEffect1, 0, 0, true)));
		}

		return;
	}
	
	/*public void addInformation(ItemStack ItemStack, EntityPlayer EntityPlayer, List List, boolean par1)
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