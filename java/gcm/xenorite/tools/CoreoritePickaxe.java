package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemPickaxe;

public class CoreoritePickaxe extends ItemPickaxe {
	public CoreoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeCoreorite");
		this.setUnlocalizedName("Coreorite Pickaxe");

	}

}