package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;
import net.minecraft.item.ItemSword;

public class CoreoriteSword extends ItemSword {
	public CoreoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordCoreorite");
		this.setUnlocalizedName("Coreorite Sword");

	}

}