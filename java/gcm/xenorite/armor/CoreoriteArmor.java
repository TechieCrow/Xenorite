package gcm.xenorite.armor;

import java.util.List;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.Xenorite;
import gcm.xenorite.crativetab.CreativeTabArmour;
import gcm.xenorite.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CoreoriteArmor extends ItemArmor {

	private String[] armourTypes = new String[] { "helmetcoreorite",
			"chestplatecoreorite", "leggingscoreorite", "bootscoreorite" };

	public CoreoriteArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == Xenorite.coreoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetCoreorite");
		if (this == Xenorite.coreoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateCoreorite");
		if (this == Xenorite.coreoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsCoreorite");
		if (this == Xenorite.coreoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsCoreorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == Xenorite.coreoriteHelmet
				|| stack.getItem() == Xenorite.coreoriteChestplate
				|| stack.getItem() == Xenorite.coreoriteBoots) {
			return Reference.MOD_ID
					+ ":textures/models/armor/coreorite_layer_1.png";
		}
		if (stack.getItem() == Xenorite.coreoriteLeggings) {
			return Reference.MOD_ID
					+ ":textures/models/armor/coreorite_layer_2.png";
		} else {
			return null;
		}
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