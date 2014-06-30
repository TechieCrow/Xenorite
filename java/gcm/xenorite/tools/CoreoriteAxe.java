package gcm.xenorite.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoriteAxe extends ItemAxe {
	public CoreoriteAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetCoreorite");
		this.setUnlocalizedName("Coreorite Axe");

	}

}