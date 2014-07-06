package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class FinoriteHoe extends ItemHoe {
	public FinoriteHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hoeFinorite");
		this.setUnlocalizedName("Finorite Hoe");

	}

}