package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemPickaxe;

public class FinoritePickaxe extends ItemPickaxe {
	public FinoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeFinorite");
		this.setUnlocalizedName("Finorite Pickaxe");

	}

}