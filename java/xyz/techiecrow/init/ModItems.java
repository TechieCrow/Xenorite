package xyz.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import xyz.techiecrow.food.FoodHeavenlyGlintApple;
import xyz.techiecrow.food.FoodShadowBoronApple;
import xyz.techiecrow.items.ItemCoreoriteIngot;
import xyz.techiecrow.items.ItemFinoriteIngot;
import xyz.techiecrow.items.ItemHeavenlyGlintIngot;
import xyz.techiecrow.items.ItemShadowBoronIngot;
import xyz.techiecrow.items.ItemUniverseSoulSplit;
import xyz.techiecrow.items.ItemXenBeastSoulFragment;
import xyz.techiecrow.items.ItemXenBookVol1;
import xyz.techiecrow.items.ItemXenorite;
import xyz.techiecrow.items.ItemXenoriteIngot;

public class ModItems
{
	public static final ItemXenorite xenoriteIngot = new ItemXenoriteIngot();
	public static final ItemXenorite coreoriteIngot = new ItemCoreoriteIngot();
	public static final ItemXenorite finoriteIngot = new ItemFinoriteIngot();
	public static final ItemXenorite heavenlyglintIngot = new ItemHeavenlyGlintIngot();
	public static final ItemXenorite shadowboronIngot = new ItemShadowBoronIngot();

	public static final ItemXenorite xenbeastsoulFragment1 = new ItemXenBeastSoulFragment();
	public static final ItemXenorite universesoulSplit = new ItemUniverseSoulSplit();

	public static final ItemXenorite xenBookVol1 = new ItemXenBookVol1();
	// public static final ItemXenorite xenBookVol2 = new ItemxenBookVol2();
	// public static final ItemXenorite xenBookVol3 = new ItemxenBookVol3();

	public static Item appleHeavenlyGlint;
	public static Item appleShadowBoron;

	public static void init()
	{
		GameRegistry.registerItem(xenoriteIngot, "xenoriteIngot");
		GameRegistry.registerItem(coreoriteIngot, "coreoriteIngot");
		GameRegistry.registerItem(finoriteIngot, "finoriteIngot");
		GameRegistry.registerItem(heavenlyglintIngot, "heavenlyglintIngot");
		GameRegistry.registerItem(shadowboronIngot, "shadowboronIngot");

		GameRegistry.registerItem(xenbeastsoulFragment1, "xenbeastsoulFragment1");
		GameRegistry.registerItem(universesoulSplit, "universesoulSplit");

		GameRegistry.registerItem(xenBookVol1, "xenBookVol1");
		// GameRegistry.registerItem(xenBookVol2, "xenBookVol2");
		// GameRegistry.registerItem(xenBookVol3, "xenBookVol3");

		GameRegistry.registerItem(appleHeavenlyGlint = new FoodHeavenlyGlintApple().setAlwaysEdible(), "appleHeavenlyGlint");
		GameRegistry.registerItem(appleShadowBoron = new FoodShadowBoronApple().setAlwaysEdible(), "appleShadowBoron");

	}
}