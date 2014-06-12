package gcm.xenorite.armor;

import gcm.xenorite.XenoriteMain;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class XenoriteArmor extends ItemArmor {

	private String[] armourTypes = new String[] { "helmetXenorite",
			"chestplateXenorite", "leggingsXenorite", "bootsXenorite" };

	public XenoriteArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == XenoriteMain.xenoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetXenorite");
		if (this == XenoriteMain.xenoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateXenorite");
		if (this == XenoriteMain.xenoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsXenorite");
		if (this == XenoriteMain.xenoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsXenorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == XenoriteMain.xenoriteHelmet
				|| stack.getItem() == XenoriteMain.xenoriteChestplate
				|| stack.getItem() == XenoriteMain.xenoriteBoots) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/xenorite_layer_1.png";
		}
		if (stack.getItem() == XenoriteMain.xenoriteLeggings) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/xenorite_layer_2.png";
		} else {
			return null;
		}
	}
}