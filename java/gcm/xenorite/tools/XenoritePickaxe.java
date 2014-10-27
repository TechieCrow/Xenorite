package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemPickaxe;

public class XenoritePickaxe extends ItemPickaxe {
	public XenoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeXenorite");
		this.setUnlocalizedName("Xenorite Pickaxe");

	}

}