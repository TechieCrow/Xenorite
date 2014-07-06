package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class FinoriteAxe extends ItemAxe {
	public FinoriteAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:hatchetFinorite");
		this.setUnlocalizedName("Finorite Axe");

	}

}