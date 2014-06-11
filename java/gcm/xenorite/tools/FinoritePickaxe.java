package gcm.xenorite.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class FinoritePickaxe extends ItemPickaxe {
	public FinoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeFinorite");
		this.setUnlocalizedName("Finorite Pickaxe");

	}

}