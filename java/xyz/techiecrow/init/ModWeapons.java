package xyz.techiecrow.init;

import xyz.techiecrow.tools.weapons.CoreoriteSword;
import xyz.techiecrow.tools.weapons.FinoriteSword;
import xyz.techiecrow.tools.weapons.HeavenlyGlintSword;
import xyz.techiecrow.tools.weapons.PeacefulGlintingShadowSword;
import xyz.techiecrow.tools.weapons.ShadowBoronSword;
import xyz.techiecrow.tools.weapons.WeaponXenorite;
import xyz.techiecrow.tools.weapons.WorldlySword;
import xyz.techiecrow.tools.weapons.XCFMasterSword;
import xyz.techiecrow.tools.weapons.XenoriteSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWeapons
{

	// Tool Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper.addToolMaterial("XenoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper.addToolMaterial("CoreoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper.addToolMaterial("FinoriteToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial HeavenlyGlintToolMaterials = EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 4, 780, 8.0F, 1.5F, 22);

	public static final Item.ToolMaterial ShadowBoronToolMaterials = EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 4, 780, 8.0F, 1.5F, 22);

//	public static final Item.ToolMaterial XCFMasterToolMaterials = EnumHelper.addToolMaterial("XCFMasterToolMaterials", 8, 960, 16.0F, 3.0F, 44);
//
//	public static final Item.ToolMaterial PeacefulGlintingShadowToolMaterials = EnumHelper.addToolMaterial("PeacefulGlintingShadowToolMaterials", 8, 960, 16.0F, 3.0F, 44);
//
//	public static final Item.ToolMaterial WorldlyToolMaterials = EnumHelper.addToolMaterial("WorldlyToolMaterials", 16, 1920, 32.0F, 6.0F, 88);

	public static final WeaponXenorite xenoriteSword = new XenoriteSword(XenoriteToolMaterials);
	public static final WeaponXenorite coreoriteSword = new CoreoriteSword(CoreoriteToolMaterials);
	public static final WeaponXenorite finoriteSword = new FinoriteSword(FinoriteToolMaterials);
	public static final WeaponXenorite heavenlyglintSword = new HeavenlyGlintSword(HeavenlyGlintToolMaterials);
	public static final WeaponXenorite shadowboronSword = new ShadowBoronSword(ShadowBoronToolMaterials);
//	public static final WeaponXenorite xcfMasterSword = new XCFMasterSword(XCFMasterToolMaterials);
//	public static final WeaponXenorite peacefulGlintingShadowSword = new PeacefulGlintingShadowSword(PeacefulGlintingShadowToolMaterials);
//	public static final WeaponXenorite worldlySword = new WorldlySword(WorldlyToolMaterials);

	public static void init()
	{
		GameRegistry.registerItem(xenoriteSword, "xenoriteSword");
		OreDictionary.registerOre("swordXenorite", new ItemStack(xenoriteSword));

		GameRegistry.registerItem(coreoriteSword, "coreoriteSword");
		OreDictionary.registerOre("swordCoreorite", new ItemStack(coreoriteSword));

		GameRegistry.registerItem(finoriteSword, "finoriteSword");
		OreDictionary.registerOre("swordFinorite", new ItemStack(finoriteSword));

		GameRegistry.registerItem(heavenlyglintSword, "heavenlyglintSword");
		OreDictionary.registerOre("swordHeavenlyGlint", new ItemStack(heavenlyglintSword));

		GameRegistry.registerItem(shadowboronSword, "shadowboronSword");
		OreDictionary.registerOre("swordShadowBoron", new ItemStack(shadowboronSword));

//		GameRegistry.registerItem(xcfMasterSword, "xcfMasterSword");
//		OreDictionary.registerOre("swordXCFMaster", new ItemStack(xcfMasterSword));
//
//		GameRegistry.registerItem(peacefulGlintingShadowSword, "peacefulGlintingShadowSword");
//		OreDictionary.registerOre("swordPeacefulGlintingShadow", new ItemStack(peacefulGlintingShadowSword));
//
//		GameRegistry.registerItem(worldlySword, "worldlySword");
//		OreDictionary.registerOre("swordWorldly", new ItemStack(worldlySword));

	}
}