package gcm.xenorite.items;

import gcm.xenorite.handler.ConfigurationHandler;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

public class ItemUniverseSoulSplit extends ItemXenorite
{
    public ItemUniverseSoulSplit()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("universesoulSplit");
    }
}