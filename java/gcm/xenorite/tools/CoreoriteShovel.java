package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class CoreoriteShovel extends ItemSpade {
	public CoreoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelCoreorite");
		this.setUnlocalizedName("Coreorite Shove");

	}

}