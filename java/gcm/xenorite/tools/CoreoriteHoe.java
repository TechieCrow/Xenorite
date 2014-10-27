package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemHoe;

public class CoreoriteHoe extends ItemHoe {
	public CoreoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeCoreorite");
		this.setUnlocalizedName("Coreorite Hoe");

	}

}