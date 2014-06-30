package gcm.xenorite.items;

import gcm.xenorite.Xenorite;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FinoriteIngot extends Item {
	public FinoriteIngot(){
		super();
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setMaxStackSize(64);
		this.setTextureName("xenorite:ingotFinorite");
		this.setUnlocalizedName("Finorite Ingot");
		
	}
	
}