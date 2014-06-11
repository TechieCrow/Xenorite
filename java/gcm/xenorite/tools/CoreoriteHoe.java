package gcm.xenorite.tools;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoriteHoe extends ItemHoe {
	public CoreoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeCoreorite");
		this.setUnlocalizedName("Coreorite Hoe");

	}

}