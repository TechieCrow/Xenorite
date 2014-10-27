package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;
import net.minecraft.item.ItemSword;

public class XenoriteSword extends ItemSword {
	public XenoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:xenoriteSword");
		this.setUnlocalizedName("Xenorite Sword");

	}

}