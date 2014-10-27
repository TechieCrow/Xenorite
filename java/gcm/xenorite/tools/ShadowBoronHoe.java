package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemHoe;

public class ShadowBoronHoe extends ItemHoe {
	public ShadowBoronHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeShadowBoron");
		this.setUnlocalizedName("ShadowBoron Hoe");

	}

}