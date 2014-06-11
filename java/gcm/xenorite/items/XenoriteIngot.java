package gcm.xenorite.items;

import gcm.xenorite.XenoriteMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class XenoriteIngot extends Item {
	
	public XenoriteIngot(){
		super();
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(64);
		this.setTextureName("xenorite:ingotXenorite");
		this.setUnlocalizedName("Xenorite Ingot");
		
	}
	
}