package gcm.xenorite.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoriteShovel extends ItemSpade {
	public CoreoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelCoreorite");
		this.setUnlocalizedName("Coreorite Shove");

	}

}