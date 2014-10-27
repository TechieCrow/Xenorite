package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemAxe;

public class CoreoriteAxe extends ItemAxe {
	public CoreoriteAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetCoreorite");
		this.setUnlocalizedName("Coreorite Axe");

	}

}