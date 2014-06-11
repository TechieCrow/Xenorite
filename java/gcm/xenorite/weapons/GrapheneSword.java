package gcm.xenorite.weapons;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class GrapheneSword extends ItemSword {
	public GrapheneSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordGraphene");
		this.setUnlocalizedName("Graphene Sword");

	}

}