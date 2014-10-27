package gcm.xenorite.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class FinoriteHoe extends ItemHoe {
	public FinoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeFinorite");
		this.setUnlocalizedName("Finorite Hoe");

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