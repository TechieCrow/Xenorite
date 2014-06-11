package gcm.xenorite.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoritePickaxe extends ItemPickaxe {
	public CoreoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeCoreorite");
		this.setUnlocalizedName("Coreorite Pickaxe");

	}

}