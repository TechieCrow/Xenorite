package xyz.techiecrow.init;

import xyz.techiecrow.food.FoodHeavenlyGlintApple;
import xyz.techiecrow.food.FoodShadowBoronApple;
import xyz.techiecrow.items.ItemCoreoriteIngot;
import xyz.techiecrow.items.ItemFinoriteIngot;
import xyz.techiecrow.items.ItemHeavenlyGlintIngot;
import xyz.techiecrow.items.ItemMoltenCoreoriteBlade;
import xyz.techiecrow.items.ItemMoltenFinoriteBlade;
import xyz.techiecrow.items.ItemMoltenXCFMasterBlade;
import xyz.techiecrow.items.ItemMoltenXenoriteBlade;
import xyz.techiecrow.items.ItemShadowBoronIngot;
import xyz.techiecrow.items.ItemUniverseSoulSplit;
import xyz.techiecrow.items.ItemXenBeastSoulFragment;
import xyz.techiecrow.items.ItemXenorite;
import xyz.techiecrow.items.ItemXenoriteIngot;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemXenorite xenoriteIngot = new ItemXenoriteIngot();
	public static final ItemXenorite coreoriteIngot = new ItemCoreoriteIngot();
	public static final ItemXenorite finoriteIngot = new ItemFinoriteIngot();
//	public static final ItemXenorite moltenXenoriteBlade = new ItemMoltenXenoriteBlade();
//	public static final ItemXenorite moltenCoreoriteBlade = new ItemMoltenCoreoriteBlade();
//	public static final ItemXenorite moltenFinoriteBlade = new ItemMoltenFinoriteBlade();
//	public static final ItemXenorite moltenXCFMasterBlade = new ItemMoltenXCFMasterBlade();
	public static final ItemXenorite heavenlyglintIngot = new ItemHeavenlyGlintIngot();
	public static final ItemXenorite shadowboronIngot = new ItemShadowBoronIngot();

	public static final ItemXenorite xenbeastsoulFragment1 = new ItemXenBeastSoulFragment();
	public static final ItemXenorite universesoulSplit = new ItemUniverseSoulSplit();

	public static Item appleHeavenlyGlint;
	public static Item appleShadowBoron;

	public static void init()
	{
		GameRegistry.registerItem(xenoriteIngot, "xenoriteIngot");
		GameRegistry.registerItem(coreoriteIngot, "coreoriteIngot");
		GameRegistry.registerItem(finoriteIngot, "finoriteIngot");
//		GameRegistry.registerItem(moltenXenoriteBlade, "moltenXenoriteBlade");
//		GameRegistry.registerItem(moltenCoreoriteBlade, "moltenCoreoriteBlade");
//		GameRegistry.registerItem(moltenFinoriteBlade, "moltenFinoriteBlade");
//		GameRegistry.registerItem(moltenXCFMasterBlade, "moltenXCFMasterBlade");
		GameRegistry.registerItem(heavenlyglintIngot, "heavenlyglintIngot");
		GameRegistry.registerItem(shadowboronIngot, "shadowboronIngot");

		GameRegistry.registerItem(xenbeastsoulFragment1, "xenbeastsoulFragment1");
		GameRegistry.registerItem(universesoulSplit, "universesoulSplit");

		GameRegistry.registerItem(appleHeavenlyGlint = new FoodHeavenlyGlintApple().setAlwaysEdible(), "appleHeavenlyGlint");
		GameRegistry.registerItem(appleShadowBoron = new FoodShadowBoronApple().setAlwaysEdible(), "appleShadowBoron");

	}
}