package gcm.xenorite.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

public class ItemXenoriteIngot extends ItemXenorite
{
    public ItemXenoriteIngot()
    {
        super();
        this.setMaxStackSize(64);
        this.setUnlocalizedName("xenoriteIngot");
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