package gcm.xenorite;

import gcm.xenorite.armor.CoreoriteArmor;
import gcm.xenorite.armor.FinoriteArmor;
import gcm.xenorite.armor.XenoriteArmor;
import gcm.xenorite.init.ModBlockOres;
import gcm.xenorite.init.ModBlocks;
import gcm.xenorite.init.ModItems;
import gcm.xenorite.proxy.IProxy;
import gcm.xenorite.reference.Reference;
import gcm.xenorite.tools.CoreoriteAxe;
import gcm.xenorite.tools.CoreoriteHoe;
import gcm.xenorite.tools.CoreoritePickaxe;
import gcm.xenorite.tools.CoreoriteShovel;
import gcm.xenorite.tools.FinoriteAxe;
import gcm.xenorite.tools.FinoriteHoe;
import gcm.xenorite.tools.FinoritePickaxe;
import gcm.xenorite.tools.FinoriteShovel;
import gcm.xenorite.tools.XenoriteAxe;
import gcm.xenorite.tools.XenoriteHoe;
import gcm.xenorite.tools.XenoritePickaxe;
import gcm.xenorite.tools.XenoriteShovel;
import gcm.xenorite.utility.LogHelper;
import gcm.xenorite.weapons.CoreoriteSword;
import gcm.xenorite.weapons.FinoriteSword;
import gcm.xenorite.weapons.XenoriteSword;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Xenorite {

	@Mod.Instance(Reference.MOD_ID)
	public static Xenorite instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
	public static IProxy proxy;

	// Tool And Armor Materials
	public static final Item.ToolMaterial XenoriteToolMaterials = EnumHelper
			.addToolMaterial("XenoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial XenoriteArmorMaterials = EnumHelper
			.addArmorMaterial("XenoriteArmorMaterials", 33, new int[] { 3, 8,
					6, 3 }, 25);

	public static final Item.ToolMaterial CoreoriteToolMaterials = EnumHelper
			.addToolMaterial("CoreoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial CoreoriteArmorMaterials = EnumHelper
			.addArmorMaterial("CoreoriteArmorMaterials", 33, new int[] { 3, 8,
					6, 3 }, 25);

	public static final Item.ToolMaterial FinoriteToolMaterials = EnumHelper
			.addToolMaterial("FinoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial FinoriteArmorMaterials = EnumHelper
			.addArmorMaterial("FinoriteArmorMaterials", 33, new int[] { 3, 8,
					6, 3 }, 25);

	public static final Item.ToolMaterial ItemPlaceHolderToolMaterials = EnumHelper
			.addToolMaterial("ItemPlaceHolderToolMaterials", 3, 655, 8.0F,
					3.0F, 22);

	// Xenorite Sets
	public static ItemSword xenoriteSword;
	public static ItemPickaxe xenoritePickaxe;
	public static ItemSpade xenoriteShovel;
	public static ItemAxe xenoriteAxe;
	public static ItemHoe xenoriteHoe;
	public static Item xenoriteHelmet;
	public static Item xenoriteChestplate;
	public static Item xenoriteLeggings;
	public static Item xenoriteBoots;

	// Coreorite Sets
	public static ItemSword coreoriteSword;
	public static ItemPickaxe coreoritePickaxe;
	public static ItemSpade coreoriteShovel;
	public static ItemAxe coreoriteAxe;
	public static ItemHoe coreoriteHoe;
	public static Item coreoriteHelmet;
	public static Item coreoriteChestplate;
	public static Item coreoriteLeggings;
	public static Item coreoriteBoots;

	// Finorite Sets
	public static ItemSword finoriteSword;
	public static ItemPickaxe finoritePickaxe;
	public static ItemSpade finoriteShovel;
	public static ItemAxe finoriteAxe;
	public static ItemHoe finoriteHoe;
	public static Item finoriteHelmet;
	public static Item finoriteChestplate;
	public static Item finoriteLeggings;
	public static Item finoriteBoots;

	//public static AchievementPage XenoriteAchievements;
	//public static Achievement xenoritePickaxeAchievement;
	//public static Achievement xenoriteShovelAchievement;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		//ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		//FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		//FMLCommonHandler.instance().bus().register(new CraftingHandler());

		GameRegistry.registerWorldGenerator(new EventManager(), 1);
		
		ModBlockOres.init();
		
		ModBlocks.init();
		
		ModItems.init();

		// Xenorite Sets

		xenoriteSword = new XenoriteSword(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteSword, "xenoriteSword");
		OreDictionary
				.registerOre("swordXenorite", new ItemStack(xenoriteSword));

		xenoritePickaxe = new XenoritePickaxe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoritePickaxe, "xenoritePickaxe");
		OreDictionary.registerOre("pickaxeXenorite", new ItemStack(
				xenoritePickaxe));

		xenoriteShovel = new XenoriteShovel(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteShovel, "xenoriteShovel");
		OreDictionary.registerOre("shovelXenorite", new ItemStack(
				xenoriteShovel));

		xenoriteAxe = new XenoriteAxe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteAxe, "xenoriteAxe");
		OreDictionary.registerOre("axeXenorite", new ItemStack(xenoriteAxe));

		xenoriteHoe = new XenoriteHoe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteHoe, "xenoriteHoe");
		OreDictionary.registerOre("hoeXenorite", new ItemStack(xenoriteHoe));

		xenoriteHelmet = new XenoriteArmor(XenoriteArmorMaterials, 5, 0)
				.setUnlocalizedName("Xenorite Helmet");
		GameRegistry.registerItem(xenoriteHelmet, "xenoriteHelmet");
		proxy.addArmor("xenorite");
		OreDictionary.registerOre("helmetXenorite", new ItemStack(
				xenoriteHelmet));

		xenoriteChestplate = new XenoriteArmor(XenoriteArmorMaterials, 5, 1)
				.setUnlocalizedName("Xenorite Chestplate");
		GameRegistry.registerItem(xenoriteChestplate, "xenoriteChestplate");
		OreDictionary.registerOre("chestplateXenorite", new ItemStack(
				xenoriteChestplate));

		xenoriteLeggings = new XenoriteArmor(XenoriteArmorMaterials, 5, 2)
				.setUnlocalizedName("Xenorite Leggings");
		GameRegistry.registerItem(xenoriteLeggings, "xenoriteLeggings");
		OreDictionary.registerOre("leggingsXenorite", new ItemStack(
				xenoriteLeggings));

		xenoriteBoots = new XenoriteArmor(XenoriteArmorMaterials, 5, 3)
				.setUnlocalizedName("Xenorite Boots");
		GameRegistry.registerItem(xenoriteBoots, "xenoriteBoots");
		OreDictionary
				.registerOre("bootsXenorite", new ItemStack(xenoriteBoots));

		// Coreorite Sets

		coreoriteSword = new CoreoriteSword(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteSword, "coreoriteSword");
		OreDictionary.registerOre("swordCoreorite", new ItemStack(
				coreoriteSword));

		coreoritePickaxe = new CoreoritePickaxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoritePickaxe, "coreoritePickaxe");
		OreDictionary.registerOre("pickaxeCoreorite", new ItemStack(
				coreoritePickaxe));

		coreoriteShovel = new CoreoriteShovel(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteShovel, "coreoriteShovel");
		OreDictionary.registerOre("shovelCoreorite", new ItemStack(
				coreoriteShovel));

		coreoriteAxe = new CoreoriteAxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteAxe, "coreoriteAxe");
		OreDictionary.registerOre("axeCoreorite", new ItemStack(coreoriteAxe));

		coreoriteHoe = new CoreoriteHoe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteHoe, "coreoriteHoe");
		OreDictionary.registerOre("hoeCoreorite", new ItemStack(coreoriteHoe));

		coreoriteHelmet = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 0)
				.setUnlocalizedName("Coreorite Helmet");
		GameRegistry.registerItem(coreoriteHelmet, "coreoriteHelmet");
		OreDictionary.registerOre("helmetCoreorite", new ItemStack(
				coreoriteHelmet));

		coreoriteChestplate = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 1)
				.setUnlocalizedName("Coreorite Chestplate");
		GameRegistry.registerItem(coreoriteChestplate, "coreoriteChestplate");
		OreDictionary.registerOre("chestplateCoreorite", new ItemStack(
				coreoriteChestplate));

		coreoriteLeggings = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 2)
				.setUnlocalizedName("Coreorite Leggings");
		GameRegistry.registerItem(coreoriteLeggings, "coreoriteLeggings");
		OreDictionary.registerOre("leggingsCoreorite", new ItemStack(
				coreoriteLeggings));

		coreoriteBoots = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 3)
				.setUnlocalizedName("Coreorite Boots");
		GameRegistry.registerItem(coreoriteBoots, "coreoriteBoots");
		OreDictionary.registerOre("Coreorite", new ItemStack(coreoriteBoots));

		// Finorite Sets

		finoriteSword = new FinoriteSword(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteSword, "finoriteSword");
		OreDictionary
				.registerOre("swordFinorite", new ItemStack(finoriteSword));

		finoritePickaxe = new FinoritePickaxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoritePickaxe, "finoritePickaxe");
		OreDictionary.registerOre("pickaxeFinorite", new ItemStack(
				finoritePickaxe));

		finoriteShovel = new FinoriteShovel(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteShovel, "finoriteShovel");
		OreDictionary.registerOre("shovelFinorite", new ItemStack(
				finoriteShovel));

		finoriteAxe = new FinoriteAxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteAxe, "finoriteAxe");
		OreDictionary.registerOre("axeFinorite", new ItemStack(finoriteAxe));

		finoriteHoe = new FinoriteHoe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteHoe, "finoriteHoe");
		OreDictionary.registerOre("hoeFinorite", new ItemStack(finoriteHoe));

		finoriteHelmet = new FinoriteArmor(FinoriteArmorMaterials, 5, 0)
				.setUnlocalizedName("Finorite Helmet");
		GameRegistry.registerItem(finoriteHelmet, "finoriteHelmet");
		OreDictionary.registerOre("helmetFinorite", new ItemStack(
				finoriteHelmet));

		finoriteChestplate = new FinoriteArmor(FinoriteArmorMaterials, 5, 1)
				.setUnlocalizedName("Finorite Chestplate");
		GameRegistry.registerItem(finoriteChestplate, "finoriteChestplate");
		OreDictionary.registerOre("chestplateFinorite", new ItemStack(
				finoriteChestplate));

		finoriteLeggings = new FinoriteArmor(FinoriteArmorMaterials, 5, 2)
				.setUnlocalizedName("Finorite Leggings");
		GameRegistry.registerItem(finoriteLeggings, "finoriteLeggings");
		OreDictionary.registerOre("leggingsFinorite", new ItemStack(
				finoriteLeggings));

		finoriteBoots = new FinoriteArmor(FinoriteArmorMaterials, 5, 3)
				.setUnlocalizedName("Finorite Boots");
		GameRegistry.registerItem(finoriteBoots, "finoriteBoots");
		OreDictionary
				.registerOre("bootsFinorite", new ItemStack(finoriteBoots));

		//LogHelper.info("Pre Int Complete");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		//Xenorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteSword),

		"I", "I", "S",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoritePickaxe),

		"III", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Shovel
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteShovel),

		"I", "S", "S",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteAxe),

		"II ", "IS ", " S ",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteHoe),

		"II ", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteHelmet),

		"III", "I I", "   ",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Chestplate
		GameRegistry.addShapedRecipe(
				new ItemStack(Xenorite.xenoriteChestplate),

				"I I", "III", "III",

				'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteLeggings),

		"III", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// Xenorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteBoots),

		"   ", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.xenoriteIngot, 'S', Items.stick);

		// coreorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteSword),

		"I", "I", "S",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoritePickaxe),

		"III", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Shovel
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteShovel),

		"I", "S", "S",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteAxe),

		"II ", "IS ", " S ",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteHoe),

		"II ", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteHelmet),

		"III", "I I", "   ",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Chestplate
		GameRegistry.addShapedRecipe(
				new ItemStack(Xenorite.coreoriteChestplate),

				"I I", "III", "III",

				'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteLeggings),

		"III", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// coreorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteBoots),

		"   ", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.coreoriteIngot, 'S', Items.stick);

		// finorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteSword),

		"I", "I", "S",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoritePickaxe),

		"III", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Shovel
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteShovel),

		"I", "S", "S",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteAxe),

		"II ", "IS ", " S ",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteHoe),

		"II ", " S ", " S ",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteHelmet),

		"III", "I I", "   ",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Chestplate
		GameRegistry.addShapedRecipe(
				new ItemStack(Xenorite.finoriteChestplate),

				"I I", "III", "III",

				'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteLeggings),

		"III", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		// finorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteBoots),

		"   ", "I I", "I I",

		'I', gcm.xenorite.init.ModItems.finoriteIngot, 'S', Items.stick);

		//LogHelper.info("Int Complete");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
		//XenoriteAchievements = new AchievementPage("Xenorite", new Achievement[] {xenoritePickaxeAchievement});
		
		//xenoritePickaxeAchievement = new Achievement("achievement.xenoritePickaxe", "xenoritePickaxeAchievement", 0, 0, xenoritePickaxe, (Achievement)null).initIndependentStat();
		
		//xenoriteShovelAchievement = new Achievement("achievement.xenoriteShovel", "xenoriteShovelAchievement", 2, 0, xenoriteShovel, xenoritePickaxeAchievement).registerStat();
		
		//AchievementPage.registerAchievementPage(XenoriteAchievements);

		LogHelper.info("Post Initialization Event Completed! - Time To Mine!");
	}
}
