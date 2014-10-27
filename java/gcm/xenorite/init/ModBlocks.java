package gcm.xenorite.init;

import gcm.xenorite.blocks.BlockCoreoriteBlock;
import gcm.xenorite.blocks.BlockFinoriteBlock;
import gcm.xenorite.blocks.BlockHeavenlyGlintBlock;
import gcm.xenorite.blocks.BlockShadowBoronBlock;
import gcm.xenorite.blocks.BlockXenorite;
import gcm.xenorite.blocks.BlockXenoriteBlock;
import gcm.xenorite.items.ItemCoreoriteIngot;
import gcm.xenorite.items.ItemFinoriteIngot;
import gcm.xenorite.items.ItemXenoriteIngot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{

	public static final BlockXenorite xenoriteBlock = new BlockXenoriteBlock();
	public static final BlockXenorite coreoriteBlock = new BlockCoreoriteBlock();
	public static final BlockXenorite finoriteBlock = new BlockFinoriteBlock();
	public static final BlockXenorite heavenlyglintBlock = new BlockHeavenlyGlintBlock();
	public static final BlockXenorite shadowboronBlock = new BlockShadowBoronBlock();
	
    public static void init()
    {
    	GameRegistry.registerBlock(xenoriteBlock, "xenoriteBlock");
    	
    	GameRegistry.addShapedRecipe(new ItemStack(xenoriteBlock),
    			"III",
    			"III",
    			"III",
    			'I', gcm.xenorite.init.ModItems.xenoriteIngot);
    	
    	GameRegistry.registerBlock(coreoriteBlock, "coreoriteBlock");
    	GameRegistry.addShapedRecipe(new ItemStack(coreoriteBlock),
    			"III",
    			"III",
    			"III",
    			'I', gcm.xenorite.init.ModItems.coreoriteIngot);
    	
    	GameRegistry.registerBlock(finoriteBlock, "finoriteBlock");
    	GameRegistry.addShapedRecipe(new ItemStack(finoriteBlock),
    			"III",
    			"III",
    			"III",
    			'I', gcm.xenorite.init.ModItems.finoriteIngot);
    	
    	GameRegistry.registerBlock(heavenlyglintBlock, "heavenlyglintBlock");
    	GameRegistry.addShapedRecipe(new ItemStack(heavenlyglintBlock),
    			"III",
    			"III",
    			"III",
    			'I', gcm.xenorite.init.ModItems.heavenlyglintIngot);
    	
    	GameRegistry.registerBlock(shadowboronBlock, "shadowboronBlock");
    	GameRegistry.addShapedRecipe(new ItemStack(shadowboronBlock),
    			"III",
    			"III",
    			"III",
    			'I', gcm.xenorite.init.ModItems.shadowboronIngot);
    }
}