package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class XenoriteSword extends ItemSword {
	public XenoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:xenoriteSword");
		this.setUnlocalizedName("Xenorite Sword");

	}
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
        {
            {
            	List.add(String.format("§kit's hard"));
            	List.add(String.format("§7Thats what she said!"));
            }
        } else
        {
            List.add("Hold §l§oSHIFT§r §7for weird description");
        }
    }
}