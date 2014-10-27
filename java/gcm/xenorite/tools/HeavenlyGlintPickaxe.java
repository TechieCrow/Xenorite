package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemPickaxe;

public class HeavenlyGlintPickaxe extends ItemPickaxe {
	public HeavenlyGlintPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Pickaxe");

	}

}