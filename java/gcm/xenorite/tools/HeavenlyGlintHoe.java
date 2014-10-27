package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemHoe;

public class HeavenlyGlintHoe extends ItemHoe {
	public HeavenlyGlintHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Hoe");

	}

}