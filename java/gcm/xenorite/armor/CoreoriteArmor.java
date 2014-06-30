package gcm.xenorite.armor;

import gcm.xenorite.Xenorite;
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
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
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
			return Xenorite.MODID
					+ ":textures/models/armor/coreorite_layer_1.png";
		}
		if (stack.getItem() == Xenorite.coreoriteLeggings) {
			return Xenorite.MODID
					+ ":textures/models/armor/coreorite_layer_2.png";
		} else {
			return null;
		}
	}
}