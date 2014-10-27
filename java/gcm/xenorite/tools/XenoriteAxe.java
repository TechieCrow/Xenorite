package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemAxe;

public class XenoriteAxe extends ItemAxe {
	public XenoriteAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetXenorite");
		this.setUnlocalizedName("Xenorite Axe");

	}

}