package ninja.techiecrow.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.tools.hoes.CoreoriteHoe;
import ninja.techiecrow.tools.hoes.FinoriteHoe;
import ninja.techiecrow.tools.hoes.HeavenlyGlintHoe;
import ninja.techiecrow.tools.hoes.HoeXenorite;
import ninja.techiecrow.tools.hoes.ShadowBoronHoe;
import ninja.techiecrow.tools.hoes.XenoriteHoe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModHoes
{

	// Tool Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper.addToolMaterial("XenoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper.addToolMaterial("CoreoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper.addToolMaterial("FinoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial HeavenlyGlintToolMaterials = EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial ShadowBoronToolMaterials = EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final HoeXenorite xenoriteHoe = new XenoriteHoe(XenoriteToolMaterials);
	public static final HoeXenorite coreoriteHoe = new CoreoriteHoe(CoreoriteToolMaterials);
	public static final HoeXenorite finoriteHoe = new FinoriteHoe(FinoriteToolMaterials);
	public static final HoeXenorite heavenlyglintHoe = new HeavenlyGlintHoe(HeavenlyGlintToolMaterials);
	public static final HoeXenorite shadowboronHoe = new ShadowBoronHoe(ShadowBoronToolMaterials);

	public static void init()
	{
		GameRegistry.registerItem(xenoriteHoe, "xenoriteHoe");
		OreDictionary.registerOre("hoeXenorite", new ItemStack(xenoriteHoe));

		GameRegistry.registerItem(coreoriteHoe, "coreoriteHoe");
		OreDictionary.registerOre("hoeCoreorite", new ItemStack(coreoriteHoe));

		GameRegistry.registerItem(finoriteHoe, "finoriteHoe");
		OreDictionary.registerOre("hoeFinorite", new ItemStack(finoriteHoe));

		GameRegistry.registerItem(heavenlyglintHoe, "heavenlyglintHoe");
		OreDictionary.registerOre("hoeHeavenlyGlint", new ItemStack(heavenlyglintHoe));

		GameRegistry.registerItem(shadowboronHoe, "shadowboronHoe");
		OreDictionary.registerOre("hoeShadowBoron", new ItemStack(shadowboronHoe));

	}
}