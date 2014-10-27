package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class FinoriteShovel extends ItemSpade {
	public FinoriteShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelFinorite");
		this.setUnlocalizedName("Finorite Shove");

	}

}