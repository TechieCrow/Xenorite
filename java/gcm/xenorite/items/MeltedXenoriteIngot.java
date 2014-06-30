package gcm.xenorite.items;

import net.minecraft.item.Item;

public class MeltedXenoriteIngot extends Item {
	public MeltedXenoriteIngot() {
		super();
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(64);
		this.setTextureName("xenorite:meltedXenoriteIngot");
		this.setUnlocalizedName("Melted Xenorite Ingot");
	}

}