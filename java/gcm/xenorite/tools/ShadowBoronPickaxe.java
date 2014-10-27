package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemPickaxe;

public class ShadowBoronPickaxe extends ItemPickaxe {
	public ShadowBoronPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeShadowBoron");
		this.setUnlocalizedName("ShadowBoron Pickaxe");

	}

}