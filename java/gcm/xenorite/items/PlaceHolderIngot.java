package gcm.xenorite.items;

import net.minecraft.item.Item;

public class PlaceHolderIngot extends Item {
	public PlaceHolderIngot() {
		super();
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(64);
		this.setTextureName("xenorite:ingotPlaceholder");
		this.setUnlocalizedName("PlaceHolder Ingot");
	}

}