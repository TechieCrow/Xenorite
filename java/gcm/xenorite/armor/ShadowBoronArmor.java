package gcm.xenorite.armor;

import java.util.List;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.Xenorite;
import gcm.xenorite.crativetab.CreativeTabArmour;
import gcm.xenorite.crativetab.CreativeTabItems;
import gcm.xenorite.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ShadowBoronArmor extends ItemArmor {

	private String[] armourTypes = new String[] { "helmetshadowboron",
			"chestplateshadowboron", "leggingsshadowboron", "bootsshadowboron" };

	public ShadowBoronArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == Xenorite.shadowboronHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetShadowBoron");
		if (this == Xenorite.shadowboronChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateShadowBoron");
		if (this == Xenorite.shadowboronLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsShadowBoron");
		if (this == Xenorite.shadowboronBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsShadowBoron");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == Xenorite.shadowboronHelmet
				|| stack.getItem() == Xenorite.shadowboronChestplate
				|| stack.getItem() == Xenorite.shadowboronBoots) {
			return Reference.MOD_ID
					+ ":textures/models/armor/shadowboron_layer_1.png";
		}
		if (stack.getItem() == Xenorite.shadowboronLeggings) {
			return Reference.MOD_ID
					+ ":textures/models/armor/shadowboron_layer_2.png";
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