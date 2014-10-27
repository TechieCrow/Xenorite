package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemAxe;

public class ShadowBoronAxe extends ItemAxe {
	public ShadowBoronAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetShadowBoron");
		this.setUnlocalizedName("ShadowBoron Axe");

	}

}