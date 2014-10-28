package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class CoreoriteSword extends ItemSword {
	public CoreoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordCoreorite");
		this.setUnlocalizedName("Coreorite Sword");

	}
	
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
        {
            {
            	List.add(String.format("Your enemies blood turns blue"));
            	List.add(String.format("When you use this sword."));
            	List.add(String.format("How weird!"));
            }
        } else
        {
            List.add("Hold SHIFT for weird description");
        }
    }

}