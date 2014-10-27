package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemHoe;

public class FinoriteHoe extends ItemHoe {
	public FinoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeFinorite");
		this.setUnlocalizedName("Finorite Hoe");

	}

}