package gcm.xenorite.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class GrapheneAxe extends ItemAxe {
	public GrapheneAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetGraphene");
		this.setUnlocalizedName("Graphene Axe");

	}

}