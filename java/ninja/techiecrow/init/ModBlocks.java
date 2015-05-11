package ninja.techiecrow.init;

import ninja.techiecrow.blocks.BlockCoreoriteBlock;
import ninja.techiecrow.blocks.BlockFinoriteBlock;
import ninja.techiecrow.blocks.BlockHeavenlyGlintBlock;
import ninja.techiecrow.blocks.BlockShadowBoronBlock;
import ninja.techiecrow.blocks.BlockXenorite;
import ninja.techiecrow.blocks.BlockXenoriteBlock;
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
		GameRegistry.registerBlock(coreoriteBlock, "coreoriteBlock");
		GameRegistry.registerBlock(finoriteBlock, "finoriteBlock");
		GameRegistry.registerBlock(heavenlyglintBlock, "heavenlyglintBlock");
		GameRegistry.registerBlock(shadowboronBlock, "shadowboronBlock");
	}
}