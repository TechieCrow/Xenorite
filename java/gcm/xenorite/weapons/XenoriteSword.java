package gcm.xenorite.weapons;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class XenoriteSword extends ItemSword {
	public XenoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:swordXenorite");
		this.setUnlocalizedName("Xenorite Sword");

	}

}