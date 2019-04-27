package com.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import com.techiecrow.blocks.BlockCoreoriteBlock;
import com.techiecrow.blocks.BlockFinoriteBlock;
import com.techiecrow.blocks.BlockHeavenlyGlintBlock;
import com.techiecrow.blocks.BlockShadowBoronBlock;
import com.techiecrow.blocks.BlockXenorite;
import com.techiecrow.blocks.BlockXenoriteBlock;

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