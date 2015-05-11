package ninja.techiecrow.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.tools.axes.AxeXenorite;
import ninja.techiecrow.tools.axes.CoreoriteAxe;
import ninja.techiecrow.tools.axes.FinoriteAxe;
import ninja.techiecrow.tools.axes.HeavenlyGlintAxe;
import ninja.techiecrow.tools.axes.ShadowBoronAxe;
import ninja.techiecrow.tools.axes.XenoriteAxe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModAxes
{

	// Tool Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper.addToolMaterial("XenoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper.addToolMaterial("CoreoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper.addToolMaterial("FinoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial HeavenlyGlintToolMaterials = EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial ShadowBoronToolMaterials = EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final AxeXenorite xenoriteAxe = new XenoriteAxe(XenoriteToolMaterials);
	public static final AxeXenorite coreoriteAxe = new CoreoriteAxe(CoreoriteToolMaterials);
	public static final AxeXenorite finoriteAxe = new FinoriteAxe(FinoriteToolMaterials);
	public static final AxeXenorite heavenlyglintAxe = new HeavenlyGlintAxe(HeavenlyGlintToolMaterials);
	public static final AxeXenorite shadowboronAxe = new ShadowBoronAxe(ShadowBoronToolMaterials);

	public static void init()
	{
		GameRegistry.registerItem(xenoriteAxe, "xenoriteAxe");
		OreDictionary.registerOre("axeXenorite", new ItemStack(xenoriteAxe));

		GameRegistry.registerItem(coreoriteAxe, "coreoriteAxe");
		OreDictionary.registerOre("axeCoreorite", new ItemStack(coreoriteAxe));

		GameRegistry.registerItem(finoriteAxe, "finoriteAxe");
		OreDictionary.registerOre("axeFinorite", new ItemStack(finoriteAxe));

		GameRegistry.registerItem(heavenlyglintAxe, "heavenlyglintAxe");
		OreDictionary.registerOre("axeHeavenlyGlint", new ItemStack(heavenlyglintAxe));

		GameRegistry.registerItem(shadowboronAxe, "shadowboronAxe");
		OreDictionary.registerOre("axeShadowBoron", new ItemStack(shadowboronAxe));

	}
}