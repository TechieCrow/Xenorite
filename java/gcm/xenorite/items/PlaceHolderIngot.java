package gcm.xenorite.items;

import net.minecraft.item.Item;

public class PlaceHolderIngot extends Item {
	public PlaceHolderIngot() {
		super();
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(64);
		this.setTextureName("xenorite:PlaceHolderIngot");
		this.setUnlocalizedName("PlaceHolder Ingot");
	}

}