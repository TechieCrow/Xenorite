package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class HeavenlyGlintShovel extends ItemSpade {
	public HeavenlyGlintShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Shovel");

	}

}