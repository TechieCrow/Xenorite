package xyz.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import xyz.techiecrow.blocks.BlockCoreoriteBlock;
import xyz.techiecrow.blocks.BlockFinoriteBlock;
import xyz.techiecrow.blocks.BlockHeavenlyGlintBlock;
import xyz.techiecrow.blocks.BlockShadowBoronBlock;
import xyz.techiecrow.blocks.BlockXenorite;
import xyz.techiecrow.blocks.BlockXenoriteBlock;

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
		GameRegistry.registerBlock(coreoriteBlock, "coreoriteBlock");
		GameRegistry.registerBlock(finoriteBlock, "finoriteBlock");
		GameRegistry.registerBlock(heavenlyglintBlock, "heavenlyglintBlock");
		GameRegistry.registerBlock(shadowboronBlock, "shadowboronBlock");
	}
}