package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;
import net.minecraft.item.ItemSword;

public class HeavenlyGlintSword extends ItemSword {
	public HeavenlyGlintSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordHeavenlyGlint");
		this.setUnlocalizedName("HeavenlyGlint Sword");

	}

}