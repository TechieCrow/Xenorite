package gcm.xenorite.armor;

import gcm.xenorite.XenoriteMain;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CoreoriteArmor extends ItemArmor {

	private String[] armourTypes = new String[] { "helmetcoreorite",
			"chestplatecoreorite", "leggingscoreorite", "bootscoreorite" };

	public CoreoriteArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == XenoriteMain.coreoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetCoreorite");
		if (this == XenoriteMain.coreoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateCoreorite");
		if (this == XenoriteMain.coreoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsCoreorite");
		if (this == XenoriteMain.coreoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsCoreorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == XenoriteMain.coreoriteHelmet
				|| stack.getItem() == XenoriteMain.coreoriteChestplate
				|| stack.getItem() == XenoriteMain.coreoriteBoots) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/coreorite_layer_1.png";
		}
		if (stack.getItem() == XenoriteMain.coreoriteLeggings) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/coreorite_layer_2.png";
		} else {
			return null;
		}
	}
}