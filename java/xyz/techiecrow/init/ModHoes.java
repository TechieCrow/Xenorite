package xyz.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import xyz.techiecrow.tools.hoes.CoreoriteHoe;
import xyz.techiecrow.tools.hoes.FinoriteHoe;
import xyz.techiecrow.tools.hoes.HeavenlyGlintHoe;
import xyz.techiecrow.tools.hoes.HoeXenorite;
import xyz.techiecrow.tools.hoes.PeacefulGlintingShadowHoe;
import xyz.techiecrow.tools.hoes.ShadowBoronHoe;
import xyz.techiecrow.tools.hoes.WorldlyHoe;
import xyz.techiecrow.tools.hoes.XCFMasterHoe;
import xyz.techiecrow.tools.hoes.XenoriteHoe;

public class ModHoes
{

	// Tool Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper.addToolMaterial("XenoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper.addToolMaterial("CoreoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper.addToolMaterial("FinoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial HeavenlyGlintToolMaterials = EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial ShadowBoronToolMaterials = EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial XCFMasterToolMaterials = EnumHelper.addToolMaterial("XCFMasterToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial PeacefulGlintingShadowToolMaterials = EnumHelper.addToolMaterial("PeacefulGlintingShadowToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial WorldlyToolMaterials = EnumHelper.addToolMaterial("WorldlyToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final HoeXenorite xenoriteHoe = new XenoriteHoe(XenoriteToolMaterials);
	public static final HoeXenorite coreoriteHoe = new CoreoriteHoe(CoreoriteToolMaterials);
	public static final HoeXenorite finoriteHoe = new FinoriteHoe(FinoriteToolMaterials);
	public static final HoeXenorite heavenlyglintHoe = new HeavenlyGlintHoe(HeavenlyGlintToolMaterials);
	public static final HoeXenorite shadowboronHoe = new ShadowBoronHoe(ShadowBoronToolMaterials);
	public static final HoeXenorite xcfMasterHoe = new XCFMasterHoe(XCFMasterToolMaterials);
	public static final HoeXenorite peacefulGlintingShadowHoe = new PeacefulGlintingShadowHoe(PeacefulGlintingShadowToolMaterials);
	public static final HoeXenorite worldlyHoe = new WorldlyHoe(WorldlyToolMaterials);

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

		GameRegistry.registerItem(xcfMasterHoe, "xcfMasterHoe");
		OreDictionary.registerOre("hoeXCFMaster", new ItemStack(xcfMasterHoe));

		GameRegistry.registerItem(peacefulGlintingShadowHoe, "peacefulGlintingShadowHoe");
		OreDictionary.registerOre("hoePeacefulGlintingShadow", new ItemStack(peacefulGlintingShadowHoe));

		GameRegistry.registerItem(worldlyHoe, "worldlyHoe");
		OreDictionary.registerOre("hoeWorldly", new ItemStack(worldlyHoe));

	}
}