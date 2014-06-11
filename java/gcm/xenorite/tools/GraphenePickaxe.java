package gcm.xenorite.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class GraphenePickaxe extends ItemPickaxe {
	public GraphenePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeGraphene");
		this.setUnlocalizedName("Graphene Pickaxe");

	}

}