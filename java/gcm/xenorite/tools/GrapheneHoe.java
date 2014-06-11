package gcm.xenorite.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class GrapheneHoe extends ItemHoe {
	public GrapheneHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeGraphene");
		this.setUnlocalizedName("Graphenes Hoe");

	}

}