package gcm.xenorite.tools;

import net.minecraft.item.ItemPickaxe;

public class XenoritePickaxe extends ItemPickaxe {
	public XenoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeXenorite");
		this.setUnlocalizedName("Xenorite Pickaxe");

	}

}