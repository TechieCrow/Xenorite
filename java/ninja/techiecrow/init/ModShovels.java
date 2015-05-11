package ninja.techiecrow.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.tools.shovels.CoreoriteShovel;
import ninja.techiecrow.tools.shovels.FinoriteShovel;
import ninja.techiecrow.tools.shovels.HeavenlyGlintShovel;
import ninja.techiecrow.tools.shovels.ShadowBoronShovel;
import ninja.techiecrow.tools.shovels.ShovelXenorite;
import ninja.techiecrow.tools.shovels.XenoriteShovel;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModShovels
{

	// Tool Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper.addToolMaterial("XenoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper.addToolMaterial("CoreoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper.addToolMaterial("FinoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial HeavenlyGlintToolMaterials = EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial ShadowBoronToolMaterials = EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final ShovelXenorite xenoriteShovel = new XenoriteShovel(XenoriteToolMaterials);
	public static final ShovelXenorite coreoriteShovel = new CoreoriteShovel(CoreoriteToolMaterials);
	public static final ShovelXenorite finoriteShovel = new FinoriteShovel(FinoriteToolMaterials);
	public static final ShovelXenorite heavenlyglintShovel = new HeavenlyGlintShovel(HeavenlyGlintToolMaterials);
	public static final ShovelXenorite shadowboronShovel = new ShadowBoronShovel(ShadowBoronToolMaterials);

	public static void init()
	{
		GameRegistry.registerItem(xenoriteShovel, "xenoriteShovel");
		OreDictionary.registerOre("shovelXenorite", new ItemStack(xenoriteShovel));

		GameRegistry.registerItem(coreoriteShovel, "coreoriteShovel");
		OreDictionary.registerOre("shovelCoreorite", new ItemStack(coreoriteShovel));

		GameRegistry.registerItem(finoriteShovel, "finoriteShovel");
		OreDictionary.registerOre("shovelFinorite", new ItemStack(finoriteShovel));

		GameRegistry.registerItem(heavenlyglintShovel, "heavenlyglintShovel");
		OreDictionary.registerOre("shovelHeavenlyGlint", new ItemStack(heavenlyglintShovel));

		GameRegistry.registerItem(shadowboronShovel, "shadowboronShovel");
		OreDictionary.registerOre("shovelShadowBoron", new ItemStack(shadowboronShovel));

	}
}