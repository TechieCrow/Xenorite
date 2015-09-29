package xyz.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import xyz.techiecrow.blocks.BlockCoreoriteOre;
import xyz.techiecrow.blocks.BlockFinoriteOre;
import xyz.techiecrow.blocks.BlockHeavenlyGlintOre;
import xyz.techiecrow.blocks.BlockOresXenorite;
import xyz.techiecrow.blocks.BlockShadowBoronOre;
import xyz.techiecrow.blocks.BlockXenoriteOre;

public class ModBlockOres
{

	public static final BlockOresXenorite xenoriteOre = new BlockXenoriteOre();
	public static final BlockOresXenorite coreoriteOre = new BlockCoreoriteOre();
	public static final BlockOresXenorite finoriteOre = new BlockFinoriteOre();
	public static final BlockOresXenorite HeavenlyGlintOre = new BlockHeavenlyGlintOre();
	public static final BlockOresXenorite ShadowBoronOre = new BlockShadowBoronOre();

	public static void init()
	{
		GameRegistry.registerBlock(xenoriteOre, "xenoriteOre");
		GameRegistry.registerBlock(coreoriteOre, "coreoriteOre");
		GameRegistry.registerBlock(finoriteOre, "finoriteOre");
		GameRegistry.registerBlock(HeavenlyGlintOre, "HeavenlyGlintOre");
		GameRegistry.registerBlock(ShadowBoronOre, "ShadowBoronOre");
	}

}
