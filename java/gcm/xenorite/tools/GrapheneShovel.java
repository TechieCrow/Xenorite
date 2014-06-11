package gcm.xenorite.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class GrapheneShovel extends ItemSpade {
	public GrapheneShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelGraphene");
		this.setUnlocalizedName("Graphene Shovel");

	}

}