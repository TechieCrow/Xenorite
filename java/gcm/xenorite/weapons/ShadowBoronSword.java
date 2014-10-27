package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;
import net.minecraft.item.ItemSword;

public class ShadowBoronSword extends ItemSword {
	public ShadowBoronSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordShadowBoron");
		this.setUnlocalizedName("ShadowBoron Sword");

	}

}