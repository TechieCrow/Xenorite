package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemAxe;

public class FinoriteAxe extends ItemAxe {
	public FinoriteAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetFinorite");
		this.setUnlocalizedName("Finorite Axe");

	}

}