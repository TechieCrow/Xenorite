package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemPickaxe;

public class XenoritePickaxe extends ItemPickaxe {
	public XenoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeXenorite");
		this.setUnlocalizedName("Xenorite Pickaxe");

	}

}