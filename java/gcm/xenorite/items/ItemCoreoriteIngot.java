package gcm.xenorite.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

public class ItemCoreoriteIngot extends ItemXenorite
	{
	    public ItemCoreoriteIngot()
	    {
	        super();
	        this.setMaxStackSize(64);
	        this.setUnlocalizedName("coreoriteIngot");
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