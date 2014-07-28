package gcm.xenorite.weapons;

import java.util.List;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
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