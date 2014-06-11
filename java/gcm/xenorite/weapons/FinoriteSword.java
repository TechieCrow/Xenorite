package gcm.xenorite.weapons;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class FinoriteSword extends ItemSword {
	public FinoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordFinorite");
		this.setUnlocalizedName("Finorite Sword");

	}

}