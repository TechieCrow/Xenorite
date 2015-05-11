package ninja.techiecrow.init;

import ninja.techiecrow.blocks.BlockCoreoriteOre;
import ninja.techiecrow.blocks.BlockFinoriteOre;
import ninja.techiecrow.blocks.BlockHeavenlyGlintOre;
import ninja.techiecrow.blocks.BlockOresXenorite;
import ninja.techiecrow.blocks.BlockShadowBoronOre;
import ninja.techiecrow.blocks.BlockXenoriteOre;
import cpw.mods.fml.common.registry.GameRegistry;

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
