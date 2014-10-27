package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemAxe;

public class HeavenlyGlintAxe extends ItemAxe {
	public HeavenlyGlintAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Axe");

	}

}