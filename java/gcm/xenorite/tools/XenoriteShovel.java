package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class XenoriteShovel extends ItemSpade {
	public XenoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelXenorite");
		this.setUnlocalizedName("Xenorite Shove");

	}

}