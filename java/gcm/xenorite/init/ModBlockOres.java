package gcm.xenorite.init;

import gcm.xenorite.blocks.BlockCoreoriteBlock;
import gcm.xenorite.blocks.BlockCoreoriteOre;
import gcm.xenorite.blocks.BlockFinoriteBlock;
import gcm.xenorite.blocks.BlockFinoriteOre;
import gcm.xenorite.blocks.BlockOresXenorite;
import gcm.xenorite.blocks.BlockXenorite;
import gcm.xenorite.blocks.BlockXenoriteBlock;
import gcm.xenorite.blocks.BlockXenoriteOre;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockOres
{
	
	public static final BlockOresXenorite xenoriteOre = new BlockXenoriteOre();
	public static final BlockOresXenorite coreoriteOre = new BlockCoreoriteOre();
	public static final BlockOresXenorite finoriteOre = new BlockFinoriteOre();
	
    public static void init()
    {
    	GameRegistry.registerBlock(xenoriteOre, "xenoriteOre");
    	
    	GameRegistry.registerBlock(coreoriteOre, "coreoriteOre");
    	
    	GameRegistry.registerBlock(finoriteOre, "finoriteOre");
    }

}
