package ninja.techiecrow.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.tools.pickaxes.CoreoritePickaxe;
import ninja.techiecrow.tools.pickaxes.FinoritePickaxe;
import ninja.techiecrow.tools.pickaxes.HeavenlyGlintPickaxe;
import ninja.techiecrow.tools.pickaxes.PeacefulGlintingShadowPickaxe;
import ninja.techiecrow.tools.pickaxes.PickaxeXenorite;
import ninja.techiecrow.tools.pickaxes.ShadowBoronPickaxe;
import ninja.techiecrow.tools.pickaxes.WorldlyPickaxe;
import ninja.techiecrow.tools.pickaxes.XCFMasterPickaxe;
import ninja.techiecrow.tools.pickaxes.XenoritePickaxe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModPickaxes
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

	public static final PickaxeXenorite xenoritePickaxe = new XenoritePickaxe(XenoriteToolMaterials);
	public static final PickaxeXenorite coreoritePickaxe = new CoreoritePickaxe(CoreoriteToolMaterials);
	public static final PickaxeXenorite finoritePickaxe = new FinoritePickaxe(FinoriteToolMaterials);
	public static final PickaxeXenorite heavenlyglintPickaxe = new HeavenlyGlintPickaxe(HeavenlyGlintToolMaterials);
	public static final PickaxeXenorite shadowboronPickaxe = new ShadowBoronPickaxe(ShadowBoronToolMaterials);
	public static final PickaxeXenorite xcfMasterPickaxe = new XCFMasterPickaxe(XCFMasterToolMaterials);
	public static final PickaxeXenorite peacefulGlintingShadowPickaxe = new PeacefulGlintingShadowPickaxe(PeacefulGlintingShadowToolMaterials);
	public static final PickaxeXenorite worldlyPickaxe = new WorldlyPickaxe(WorldlyToolMaterials);

	public static void init()
	{
		GameRegistry.registerItem(xenoritePickaxe, "xenoritePickaxe");
		OreDictionary.registerOre("pickaxeXenorite", new ItemStack(xenoritePickaxe));

		GameRegistry.registerItem(coreoritePickaxe, "coreoritePickaxe");
		OreDictionary.registerOre("pickaxeCoreorite", new ItemStack(coreoritePickaxe));

		GameRegistry.registerItem(finoritePickaxe, "finoritePickaxe");
		OreDictionary.registerOre("pickaxeFinorite", new ItemStack(finoritePickaxe));

		GameRegistry.registerItem(heavenlyglintPickaxe, "heavenlyglintPickaxe");
		OreDictionary.registerOre("pickaxeHeavenlyGlint", new ItemStack(heavenlyglintPickaxe));

		GameRegistry.registerItem(shadowboronPickaxe, "shadowboronPickaxe");
		OreDictionary.registerOre("pickaxeShadowBoron", new ItemStack(shadowboronPickaxe));

		GameRegistry.registerItem(xcfMasterPickaxe, "xcfMasterPickaxe");
		OreDictionary.registerOre("pickaxeXCFMaster", new ItemStack(xcfMasterPickaxe));

		GameRegistry.registerItem(peacefulGlintingShadowPickaxe, "peacefulGlintingShadowPickaxe");
		OreDictionary.registerOre("pickaxePeacefulGlintingShadow", new ItemStack(peacefulGlintingShadowPickaxe));

		GameRegistry.registerItem(worldlyPickaxe, "worldlyPickaxe");
		OreDictionary.registerOre("pickaxeWorldly", new ItemStack(worldlyPickaxe));

	}
}