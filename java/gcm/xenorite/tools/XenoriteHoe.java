package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemHoe;

public class XenoriteHoe extends ItemHoe {
	public XenoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeXenorite");
		this.setUnlocalizedName("Xenorite Hoe");

	}

}