package gcm.xenorite.weapons;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoriteSword extends ItemSword {
	public CoreoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordCoreorite");
		this.setUnlocalizedName("Coreorite Sword");

	}

}