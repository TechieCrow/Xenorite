package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class XenoriteShovel extends ItemSpade {
	public XenoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelXenorite");
		this.setUnlocalizedName("Xenorite Shove");

	}

}