package com.techiecrow;

import java.io.File;

import com.techiecrow.entitys.EnderPigEntity;
import com.techiecrow.entitys.EnderPigRegistry;
import com.techiecrow.entitys.XenBeastRegistry;
import com.techiecrow.handler.ConfigurationHandler;
import com.techiecrow.handler.EventHandler;
import com.techiecrow.handler.UpdateHandler;
import com.techiecrow.proxy.IProxy;
import com.techiecrow.reference.Reference;
import com.techiecrow.utility.CustomDrops;
import com.techiecrow.utility.LogHelper;
import com.techiecrow.world.gen.Oregen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import com.techiecrow.armor.CoreoriteArmor;
import com.techiecrow.armor.FinoriteArmor;
import com.techiecrow.armor.HeavenlyGlintArmor;
import com.techiecrow.armor.PeacefulGlintingShadowArmor;
import com.techiecrow.armor.ShadowBoronArmor;
import com.techiecrow.armor.WorldlyArmor;
import com.techiecrow.armor.XCFMasterArmor;
import com.techiecrow.armor.XenoriteArmor;
import com.techiecrow.init.ModAxes;
import com.techiecrow.init.ModBlockOres;
import com.techiecrow.init.ModBlocks;
import com.techiecrow.init.ModChestGenHooks;
import com.techiecrow.init.ModHoes;
import com.techiecrow.init.ModItems;
import com.techiecrow.init.ModPickaxes;
import com.techiecrow.init.ModShovels;
import com.techiecrow.init.ModWeapons;
import com.techiecrow.init.Recipes;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Xenorite
{

	@Mod.Instance(Reference.MOD_ID)
	public static Xenorite instance;

	public static com.techiecrow.world.gen.Oregen Oregen = new Oregen();

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

	public static final ItemArmor.ArmorMaterial XCFMasterArmorMaterials = EnumHelper.addArmorMaterial("XCFMasterArmorMaterials", 66, new int[]
	{ 6, 16, 12, 6 }, 50);

	public static final ItemArmor.ArmorMaterial PeacefulGlintingShadowArmorMaterials = EnumHelper.addArmorMaterial("PeacefulGlintingShadowArmorMaterials", 66, new int[]
	{ 6, 16, 12, 6 }, 50);

	public static final ItemArmor.ArmorMaterial WorldlyArmorMaterials = EnumHelper.addArmorMaterial("WorldlyArmorMaterials", 132, new int[]
	{ 12, 32, 24, 12 }, 100);

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

	// XCF Master Sets
	public static Item xcfMasterHelmet;
	public static Item xcfMasterChestplate;
	public static Item xcfMasterLeggings;
	public static Item xcfMasterBoots;

	// Peaceful Glinting Shadow Sets
	public static Item peacefulGlintingShadowHelmet;
	public static Item peacefulGlintingShadowChestplate;
	public static Item peacefulGlintingShadowLeggings;
	public static Item peacefulGlintingShadowBoots;

	// Worldly Sets
	public static Item worldlyHelmet;
	public static Item worldlyChestplate;
	public static Item worldlyLeggings;
	public static Item worldlyBoots;

	// Mobs
	public static Entity XenBeastEntity;
	public static Entity EnderPigIncEntity;

	public static File configDirectory;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new CustomDrops());

		proxy.registerRenderers();

		XenBeastRegistry.registerEntity(com.techiecrow.entitys.XenBeastEntity.class, "XenBeastEntity");
		EnderPigRegistry.registerEntity(EnderPigEntity.class, "EnderPigEntity");

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

		// XCF MAster Sets

		xcfMasterHelmet = new XCFMasterArmor(XCFMasterArmorMaterials, 5, 0).setUnlocalizedName("XCF Master Helmet");
		GameRegistry.registerItem(xcfMasterHelmet, "xcfMasterHelmet");
		OreDictionary.registerOre("xcfMasterHelmet", new ItemStack(xcfMasterHelmet));

		xcfMasterChestplate = new XCFMasterArmor(XCFMasterArmorMaterials, 5, 1).setUnlocalizedName("XCF Master Chestplate");
		GameRegistry.registerItem(xcfMasterChestplate, "xcfMasterChestplate");
		OreDictionary.registerOre("xcfMasterChestplate", new ItemStack(xcfMasterChestplate));

		xcfMasterLeggings = new XCFMasterArmor(XCFMasterArmorMaterials, 5, 2).setUnlocalizedName("XCF Master Leggings");
		GameRegistry.registerItem(xcfMasterLeggings, "xcfMasterLeggings");
		OreDictionary.registerOre("xcfMasterLeggings", new ItemStack(xcfMasterLeggings));

		xcfMasterBoots = new XCFMasterArmor(XCFMasterArmorMaterials, 5, 3).setUnlocalizedName("XCF Master Boots");
		GameRegistry.registerItem(xcfMasterBoots, "xcfMasterBoots");
		OreDictionary.registerOre("xcfMasterBoots", new ItemStack(xcfMasterBoots));

		// Peaceful Glinting Shadow Sets

		peacefulGlintingShadowHelmet = new PeacefulGlintingShadowArmor(PeacefulGlintingShadowArmorMaterials, 5, 0).setUnlocalizedName("Peaceful Glinting Shadow Helmet");
		GameRegistry.registerItem(peacefulGlintingShadowHelmet, "peacefulGlintingShadowHelmet");
		OreDictionary.registerOre("peacefulGlintingShadowHelmet", new ItemStack(peacefulGlintingShadowHelmet));

		peacefulGlintingShadowChestplate = new PeacefulGlintingShadowArmor(PeacefulGlintingShadowArmorMaterials, 5, 1).setUnlocalizedName("Peaceful Glinting Shadow Chestplate");
		GameRegistry.registerItem(peacefulGlintingShadowChestplate, "peacefulGlintingShadowChestplate");
		OreDictionary.registerOre("peacefulGlintingShadowChestplate", new ItemStack(peacefulGlintingShadowChestplate));

		peacefulGlintingShadowLeggings = new PeacefulGlintingShadowArmor(PeacefulGlintingShadowArmorMaterials, 5, 2).setUnlocalizedName("Peaceful Glinting Shadow Leggings");
		GameRegistry.registerItem(peacefulGlintingShadowLeggings, "peacefulGlintingShadowLeggings");
		OreDictionary.registerOre("peacefulGlintingShadowLeggings", new ItemStack(peacefulGlintingShadowLeggings));

		peacefulGlintingShadowBoots = new PeacefulGlintingShadowArmor(PeacefulGlintingShadowArmorMaterials, 5, 3).setUnlocalizedName("Peaceful Glinting Shadow Boots");
		GameRegistry.registerItem(peacefulGlintingShadowBoots, "peacefulGlintingShadowBoots");
		OreDictionary.registerOre("peacefulGlintingShadowBoots", new ItemStack(peacefulGlintingShadowBoots));

		// Worldly Sets

		worldlyHelmet = new WorldlyArmor(WorldlyArmorMaterials, 5, 0).setUnlocalizedName("Worldly Helmet");
		GameRegistry.registerItem(worldlyHelmet, "worldlyHelmet");
		OreDictionary.registerOre("worldlyHelmet", new ItemStack(worldlyHelmet));

		worldlyChestplate = new WorldlyArmor(WorldlyArmorMaterials, 5, 1).setUnlocalizedName("Worldly Chestplate");
		GameRegistry.registerItem(worldlyChestplate, "worldlyChestplate");
		OreDictionary.registerOre("worldlyChestplate", new ItemStack(worldlyChestplate));

		worldlyLeggings = new WorldlyArmor(WorldlyArmorMaterials, 5, 2).setUnlocalizedName("Worldly Leggings");
		GameRegistry.registerItem(worldlyLeggings, "worldlyLeggings");
		OreDictionary.registerOre("worldlyLeggings", new ItemStack(worldlyLeggings));

		worldlyBoots = new WorldlyArmor(WorldlyArmorMaterials, 5, 3).setUnlocalizedName("Worldly Boots");
		GameRegistry.registerItem(worldlyBoots, "worldlyBoots");
		OreDictionary.registerOre("worldlyBoots", new ItemStack(worldlyBoots));

		LogHelper.info("Pre-Initialization Completed!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

		proxy.registerRenderers();

		Recipes.init();

		ModChestGenHooks.addDungeonItems();

		GameRegistry.registerWorldGenerator(new Oregen(), 0);

		LogHelper.info("Initialization Completed!");

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

		LogHelper.info("Post Initialization Completed!");
	}
}
