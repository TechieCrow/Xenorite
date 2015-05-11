package ninja.techiecrow;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import ninja.techiecrow.armor.CoreoriteArmor;
import ninja.techiecrow.armor.FinoriteArmor;
import ninja.techiecrow.armor.HeavenlyGlintArmor;
import ninja.techiecrow.armor.PlaceholderArmor;
import ninja.techiecrow.armor.ShadowBoronArmor;
import ninja.techiecrow.armor.XenoriteArmor;
import ninja.techiecrow.entitys.EnderPigIncEntity;
import ninja.techiecrow.entitys.XenBeastEntity;
import ninja.techiecrow.entitys.XenBeastRegistry;
import ninja.techiecrow.handler.ConfigurationHandler;
import ninja.techiecrow.handler.EventHandler;
import ninja.techiecrow.handler.UpdateHandler;
import ninja.techiecrow.init.ModAxes;
import ninja.techiecrow.init.ModBlockOres;
import ninja.techiecrow.init.ModBlocks;
import ninja.techiecrow.init.ModChestGenHooks;
import ninja.techiecrow.init.ModHoes;
import ninja.techiecrow.init.ModItems;
import ninja.techiecrow.init.ModPickaxes;
import ninja.techiecrow.init.ModShovels;
import ninja.techiecrow.init.ModWeapons;
import ninja.techiecrow.init.Recipes;
import ninja.techiecrow.proxy.IProxy;
import ninja.techiecrow.reference.Reference;
import ninja.techiecrow.utility.CustomDrops;
import ninja.techiecrow.utility.LogHelper;
import ninja.techiecrow.world.gen.Oregen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Xenorite
{

	@Mod.Instance(Reference.MOD_ID)
	public static Xenorite instance;

	public static Oregen Oregen = new Oregen();

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
	public static IProxy proxy;

	// Tool And Armor Materials
	// ("NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability)

	// ("NAME", durability, damageReduction[], enchantability)
	public static final ItemArmor.ArmorMaterial XenoriteArmorMaterials = EnumHelper.addArmorMaterial("XenoriteArmorMaterials", 33, new int[]
	{ 3, 8, 6, 3 }, 25);

	public static final ItemArmor.ArmorMaterial CoreoriteArmorMaterials = EnumHelper.addArmorMaterial("CoreoriteArmorMaterials", 33, new int[]
	{ 3, 8, 6, 3 }, 25);

	public static final ItemArmor.ArmorMaterial FinoriteArmorMaterials = EnumHelper.addArmorMaterial("FinoriteArmorMaterials", 33, new int[]
	{ 3, 8, 6, 3 }, 25);

	public static final ItemArmor.ArmorMaterial HeavenlyGlintArmorMaterials = EnumHelper.addArmorMaterial("HeavenlyGlintArmorMaterials", 33, new int[]
	{ 3, 8, 6, 3 }, 25);

	public static final ItemArmor.ArmorMaterial ShadowBoronArmorMaterials = EnumHelper.addArmorMaterial("ShadowBoronArmorMaterials", 33, new int[]
	{ 3, 8, 6, 3 }, 25);
	
	public static final ItemArmor.ArmorMaterial PlaceholderArmorMaterials = EnumHelper.addArmorMaterial("PlaceholderArmorMaterials", 33, new int[]
			{ 3, 8, 6, 3 }, 25);

	// Xenorite Sets
	public static Item xenoriteHelmet;
	public static Item xenoriteChestplate;
	public static Item xenoriteLeggings;
	public static Item xenoriteBoots;

	// Coreorite Sets
	public static Item coreoriteHelmet;
	public static Item coreoriteChestplate;
	public static Item coreoriteLeggings;
	public static Item coreoriteBoots;

	// Finorite Sets
	public static Item finoriteHelmet;
	public static Item finoriteChestplate;
	public static Item finoriteLeggings;
	public static Item finoriteBoots;

	// Heavenly Glint Sets
	public static Item heavenlyglintHelmet;
	public static Item heavenlyglintChestplate;
	public static Item heavenlyglintLeggings;
	public static Item heavenlyglintBoots;

	// Shadow Boron Sets
	public static Item shadowboronHelmet;
	public static Item shadowboronChestplate;
	public static Item shadowboronLeggings;
	public static Item shadowboronBoots;
	
	// Placeholder Sets
	public static Item placeholderHelmet;
	public static Item placeholderChestplate;
	public static Item placeholderLeggings;
	public static Item placeholderBoots;

	// Mobs
	public static Entity XenBeastEntity;
	public static Entity EnderPigIncEntity;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new CustomDrops());

		proxy.registerRenderers();

		XenBeastRegistry.registerEntity(XenBeastEntity.class, "XenBeastEntity");
		XenBeastRegistry.registerEntity(EnderPigIncEntity.class, "EnderPigIncEntity");

		ModWeapons.init();
		ModPickaxes.init();
		ModShovels.init();
		ModAxes.init();
		ModHoes.init();
		ModBlockOres.init();
		ModBlocks.init();
		ModItems.init();
		UpdateHandler.init();

		// Xenorite Sets

		proxy.addArmor("xenorite");

		xenoriteHelmet = new XenoriteArmor(XenoriteArmorMaterials, 5, 0).setUnlocalizedName("Xenorite Helmet");
		GameRegistry.registerItem(xenoriteHelmet, "xenoriteHelmet");
		OreDictionary.registerOre("xenoriteHelmet", new ItemStack(xenoriteHelmet));

		xenoriteChestplate = new XenoriteArmor(XenoriteArmorMaterials, 5, 1).setUnlocalizedName("Xenorite Chestplate");
		GameRegistry.registerItem(xenoriteChestplate, "xenoriteChestplate");
		OreDictionary.registerOre("xenoriteChestplate", new ItemStack(xenoriteChestplate));

		xenoriteLeggings = new XenoriteArmor(XenoriteArmorMaterials, 5, 2).setUnlocalizedName("Xenorite Leggings");
		GameRegistry.registerItem(xenoriteLeggings, "xenoriteLeggings");
		OreDictionary.registerOre("xenoriteLeggings", new ItemStack(xenoriteLeggings));

		xenoriteBoots = new XenoriteArmor(XenoriteArmorMaterials, 5, 3).setUnlocalizedName("Xenorite Boots");
		GameRegistry.registerItem(xenoriteBoots, "xenoriteBoots");
		OreDictionary.registerOre("xenoriteBoots", new ItemStack(xenoriteBoots));

		// Coreorite Sets

		coreoriteHelmet = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 0).setUnlocalizedName("Coreorite Helmet");
		GameRegistry.registerItem(coreoriteHelmet, "coreoriteHelmet");
		OreDictionary.registerOre("helmetCoreorite", new ItemStack(coreoriteHelmet));

		coreoriteChestplate = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 1).setUnlocalizedName("Coreorite Chestplate");
		GameRegistry.registerItem(coreoriteChestplate, "coreoriteChestplate");
		OreDictionary.registerOre("chestplateCoreorite", new ItemStack(coreoriteChestplate));

		coreoriteLeggings = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 2).setUnlocalizedName("Coreorite Leggings");
		GameRegistry.registerItem(coreoriteLeggings, "coreoriteLeggings");
		OreDictionary.registerOre("leggingsCoreorite", new ItemStack(coreoriteLeggings));

		coreoriteBoots = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 3).setUnlocalizedName("Coreorite Boots");
		GameRegistry.registerItem(coreoriteBoots, "coreoriteBoots");
		OreDictionary.registerOre("Coreorite", new ItemStack(coreoriteBoots));

		// Finorite Sets

		finoriteHelmet = new FinoriteArmor(FinoriteArmorMaterials, 5, 0).setUnlocalizedName("Finorite Helmet");
		GameRegistry.registerItem(finoriteHelmet, "finoriteHelmet");
		OreDictionary.registerOre("helmetFinorite", new ItemStack(finoriteHelmet));

		finoriteChestplate = new FinoriteArmor(FinoriteArmorMaterials, 5, 1).setUnlocalizedName("Finorite Chestplate");
		GameRegistry.registerItem(finoriteChestplate, "finoriteChestplate");
		OreDictionary.registerOre("chestplateFinorite", new ItemStack(finoriteChestplate));

		finoriteLeggings = new FinoriteArmor(FinoriteArmorMaterials, 5, 2).setUnlocalizedName("Finorite Leggings");
		GameRegistry.registerItem(finoriteLeggings, "finoriteLeggings");
		OreDictionary.registerOre("leggingsFinorite", new ItemStack(finoriteLeggings));

		finoriteBoots = new FinoriteArmor(FinoriteArmorMaterials, 5, 3).setUnlocalizedName("Finorite Boots");
		GameRegistry.registerItem(finoriteBoots, "finoriteBoots");
		OreDictionary.registerOre("bootsFinorite", new ItemStack(finoriteBoots));

		// Heavenly Glint Sets

		heavenlyglintHelmet = new HeavenlyGlintArmor(HeavenlyGlintArmorMaterials, 5, 0).setUnlocalizedName("HeavenlyGlint Helmet");
		GameRegistry.registerItem(heavenlyglintHelmet, "heavenlyglintHelmet");
		OreDictionary.registerOre("helmetHeavenlyGlint", new ItemStack(heavenlyglintHelmet));

		heavenlyglintChestplate = new HeavenlyGlintArmor(HeavenlyGlintArmorMaterials, 5, 1).setUnlocalizedName("HeavenlyGlint Chestplate");
		GameRegistry.registerItem(heavenlyglintChestplate, "heavenlyglintChestplate");
		OreDictionary.registerOre("chestplateHeavenlyGlint", new ItemStack(heavenlyglintChestplate));

		heavenlyglintLeggings = new HeavenlyGlintArmor(HeavenlyGlintArmorMaterials, 5, 2).setUnlocalizedName("HeavenlyGlint Leggings");
		GameRegistry.registerItem(heavenlyglintLeggings, "heavenlyglintLeggings");
		OreDictionary.registerOre("leggingsHeavenlyGlint", new ItemStack(heavenlyglintLeggings));

		heavenlyglintBoots = new HeavenlyGlintArmor(HeavenlyGlintArmorMaterials, 5, 3).setUnlocalizedName("HeavenlyGlint Boots");
		GameRegistry.registerItem(heavenlyglintBoots, "heavenlyglintBoots");
		OreDictionary.registerOre("bootsHeavenlyGlint", new ItemStack(heavenlyglintBoots));

		// Shadow Boron Sets

		shadowboronHelmet = new ShadowBoronArmor(ShadowBoronArmorMaterials, 5, 0).setUnlocalizedName("ShadowBoron Helmet");
		GameRegistry.registerItem(shadowboronHelmet, "shadowboronHelmet");
		OreDictionary.registerOre("helmetShadowBoron", new ItemStack(shadowboronHelmet));

		shadowboronChestplate = new ShadowBoronArmor(ShadowBoronArmorMaterials, 5, 1).setUnlocalizedName("ShadowBoron Chestplate");
		GameRegistry.registerItem(shadowboronChestplate, "shadowboronChestplate");
		OreDictionary.registerOre("chestplateShadowBoron", new ItemStack(shadowboronChestplate));

		shadowboronLeggings = new ShadowBoronArmor(ShadowBoronArmorMaterials, 5, 2).setUnlocalizedName("ShadowBoron Leggings");
		GameRegistry.registerItem(shadowboronLeggings, "shadowboronLeggings");
		OreDictionary.registerOre("leggingsShadowBoron", new ItemStack(shadowboronLeggings));

		shadowboronBoots = new ShadowBoronArmor(ShadowBoronArmorMaterials, 5, 3).setUnlocalizedName("ShadowBoron Boots");
		GameRegistry.registerItem(shadowboronBoots, "shadowboronBoots");
		OreDictionary.registerOre("bootsShadowBoron", new ItemStack(shadowboronBoots));
		
		// Placeholder Sets
		
		placeholderHelmet = new PlaceholderArmor(PlaceholderArmorMaterials, 5, 0).setUnlocalizedName("Placeholder Helmet");
		GameRegistry.registerItem(placeholderHelmet, "placeholderHelmet");
		OreDictionary.registerOre("placeholderHelmet", new ItemStack(placeholderHelmet));

		placeholderChestplate = new PlaceholderArmor(PlaceholderArmorMaterials, 5, 1).setUnlocalizedName("Placeholder Chestplate");
		GameRegistry.registerItem(placeholderChestplate, "placeholderChestplate");
		OreDictionary.registerOre("placeholderChestplate", new ItemStack(placeholderChestplate));

		placeholderLeggings = new PlaceholderArmor(PlaceholderArmorMaterials, 5, 2).setUnlocalizedName("Placeholder Leggings");
		GameRegistry.registerItem(placeholderLeggings, "placeholderLeggings");
		OreDictionary.registerOre("placeholderLeggings", new ItemStack(placeholderLeggings));

		placeholderBoots = new PlaceholderArmor(PlaceholderArmorMaterials, 5, 3).setUnlocalizedName("Placeholder Boots");
		GameRegistry.registerItem(placeholderBoots, "placeholderBoots");
		OreDictionary.registerOre("placeholderBoots", new ItemStack(placeholderBoots));

		LogHelper.info("Pre-Initialization Completed - Ready!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.init();

		ModChestGenHooks.addDungeonItems();

		GameRegistry.registerWorldGenerator(new Oregen(), 0);

		LogHelper.info("Initialization Completed - Set!");

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

		LogHelper.info("Post Initialization Completed - Mine!");
	}
}
