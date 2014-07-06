package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTab;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class CoreoritePickaxe extends ItemPickaxe {
	public CoreoritePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTab.Xenorite);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:pickaxeCoreorite");
		this.setUnlocalizedName("Coreorite Pickaxe");

	}

}