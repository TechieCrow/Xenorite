package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class ShadowBoronShovel extends ItemSpade {
	public ShadowBoronShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelShadowBoron");
		this.setUnlocalizedName("ShadowBoron Shovel");

	}

}