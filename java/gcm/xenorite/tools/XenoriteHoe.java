package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class XenoriteHoe extends ItemHoe {
	public XenoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeXenorite");
		this.setUnlocalizedName("Xenorite Hoe");

	}

}