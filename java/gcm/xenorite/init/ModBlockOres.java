package gcm.xenorite.init;

import gcm.xenorite.blocks.BlockCoreoriteOre;
import gcm.xenorite.blocks.BlockFinoriteOre;
import gcm.xenorite.blocks.BlockHeavenlyGlintOre;
import gcm.xenorite.blocks.BlockOresXenorite;
import gcm.xenorite.blocks.BlockShadowBoronOre;
import gcm.xenorite.blocks.BlockXenoriteOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockOres
{

	public static final BlockOresXenorite	xenoriteOre			= new BlockXenoriteOre();
	public static final BlockOresXenorite	coreoriteOre		= new BlockCoreoriteOre();
	public static final BlockOresXenorite	finoriteOre			= new BlockFinoriteOre();
	public static final BlockOresXenorite	HeavenlyGlintOre	= new BlockHeavenlyGlintOre();
	public static final BlockOresXenorite	ShadowBoronOre		= new BlockShadowBoronOre();

	public static void init()
	{
		GameRegistry.registerBlock(xenoriteOre, "xenoriteOre");
		GameRegistry.registerBlock(coreoriteOre, "coreoriteOre");
		GameRegistry.registerBlock(finoriteOre, "finoriteOre");
		GameRegistry.registerBlock(HeavenlyGlintOre, "HeavenlyGlintOre");
		GameRegistry.registerBlock(ShadowBoronOre, "ShadowBoronOre");
	}

}
