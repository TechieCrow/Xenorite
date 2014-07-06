package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class FinoritePickaxe extends ItemPickaxe {
	public FinoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeFinorite");
		this.setUnlocalizedName("Finorite Pickaxe");

	}

}