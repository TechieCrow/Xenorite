package ninja.techiecrow.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.tools.weapons.CoreoriteSword;
import ninja.techiecrow.tools.weapons.FinoriteSword;
import ninja.techiecrow.tools.weapons.HeavenlyGlintSword;
import ninja.techiecrow.tools.weapons.ShadowBoronSword;
import ninja.techiecrow.tools.weapons.WeaponXenorite;
import ninja.techiecrow.tools.weapons.XenoriteSword;
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

	public static final WeaponXenorite xenoriteSword = new XenoriteSword(XenoriteToolMaterials);
	public static final WeaponXenorite coreoriteSword = new CoreoriteSword(CoreoriteToolMaterials);
	public static final WeaponXenorite finoriteSword = new FinoriteSword(FinoriteToolMaterials);
	public static final WeaponXenorite heavenlyglintSword = new HeavenlyGlintSword(HeavenlyGlintToolMaterials);
	public static final WeaponXenorite shadowboronSword = new ShadowBoronSword(ShadowBoronToolMaterials);

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

	}
}