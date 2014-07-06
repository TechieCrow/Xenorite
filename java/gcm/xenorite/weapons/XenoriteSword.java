package gcm.xenorite.weapons;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class XenoriteSword extends ItemSword {
	public XenoriteSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:xenoriteSword");
		this.setUnlocalizedName("Xenorite Sword");

	}

}