package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class FinoriteShovel extends ItemSpade {
	public FinoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelFinorite");
		this.setUnlocalizedName("Finorite Shove");

	}

}