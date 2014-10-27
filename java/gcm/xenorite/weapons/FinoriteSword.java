package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTabWeapons;
import net.minecraft.item.ItemSword;

public class FinoriteSword extends ItemSword {
	public FinoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabWeapons.Xenoriteweapons);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordFinorite");
		this.setUnlocalizedName("Finorite Sword");

	}

}