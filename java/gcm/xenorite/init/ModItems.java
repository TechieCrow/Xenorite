package gcm.xenorite.init;

import gcm.xenorite.items.ItemCoreoriteIngot;
import gcm.xenorite.items.ItemCoreoriteMeltedIngot;
import gcm.xenorite.items.ItemFinoriteIngot;
import gcm.xenorite.items.ItemFinoriteMeltedIngot;
import gcm.xenorite.items.ItemHeavenlyGlintIngot;
import gcm.xenorite.items.ItemShadowBoronIngot;
import gcm.xenorite.items.ItemUniverseSoulSplit;
import gcm.xenorite.items.ItemXenBeastSoulFragment;
import gcm.xenorite.items.ItemXenorite;
import gcm.xenorite.items.ItemXenoriteIngot;
import gcm.xenorite.items.ItemXenoriteMeltedIngot;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemXenorite	xenoriteIngot			= new ItemXenoriteIngot();
	public static final ItemXenorite	coreoriteIngot			= new ItemCoreoriteIngot();
	public static final ItemXenorite	finoriteIngot			= new ItemFinoriteIngot();
	public static final ItemXenorite	xenoriteMeltedIngot		= new ItemXenoriteMeltedIngot();
	public static final ItemXenorite	coreoriteMeltedIngot	= new ItemCoreoriteMeltedIngot();
	public static final ItemXenorite	finoriteMeltedIngot		= new ItemFinoriteMeltedIngot();
	public static final ItemXenorite	heavenlyglintIngot		= new ItemHeavenlyGlintIngot();
	public static final ItemXenorite	shadowboronIngot		= new ItemShadowBoronIngot();

	public static final ItemXenorite	xenbeastsoulFragment1	= new ItemXenBeastSoulFragment();
	public static final ItemXenorite	universesoulSplit		= new ItemUniverseSoulSplit();

	public static void init()
	{
		GameRegistry.registerItem(xenoriteIngot, "xenoriteIngot");
		GameRegistry.registerItem(coreoriteIngot, "coreoriteIngot");
		GameRegistry.registerItem(finoriteIngot, "finoriteIngot");
		GameRegistry.registerItem(xenoriteMeltedIngot, "xenoriteMeltedIngot");
		GameRegistry.registerItem(coreoriteMeltedIngot, "coreoriteMeltedIngot");
		GameRegistry.registerItem(finoriteMeltedIngot, "finoriteMeltedIngot");
		GameRegistry.registerItem(heavenlyglintIngot, "heavenlyglintIngot");
		GameRegistry.registerItem(shadowboronIngot, "shadowboronIngot");

		GameRegistry.registerItem(xenbeastsoulFragment1, "xenbeastsoulFragment1");
		GameRegistry.registerItem(universesoulSplit, "universesoulSplit");

	}
}