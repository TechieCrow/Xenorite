package gcm.xenorite;

import gcm.xenorite.armor.CoreoriteArmor;
import gcm.xenorite.armor.FinoriteArmor;
import gcm.xenorite.armor.HeavenlyGlintArmor;
import gcm.xenorite.armor.ShadowBoronArmor;
import gcm.xenorite.armor.XenoriteArmor;
import gcm.xenorite.entitys.XenBeastEntity;
import gcm.xenorite.handler.ConfigurationHandler;
import gcm.xenorite.handler.EventHandler;
import gcm.xenorite.handler.UpdateHandler;
import gcm.xenorite.init.ModBlockOres;
import gcm.xenorite.init.ModBlocks;
import gcm.xenorite.init.ModChestGenHooks;
import gcm.xenorite.init.ModItems;
import gcm.xenorite.init.Recipes;
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
import gcm.xenorite.tools.HeavenlyGlintAxe;
import gcm.xenorite.tools.HeavenlyGlintHoe;
import gcm.xenorite.tools.HeavenlyGlintPickaxe;
import gcm.xenorite.tools.HeavenlyGlintShovel;
import gcm.xenorite.tools.ShadowBoronAxe;
import gcm.xenorite.tools.ShadowBoronHoe;
import gcm.xenorite.tools.ShadowBoronPickaxe;
import gcm.xenorite.tools.ShadowBoronShovel;
import gcm.xenorite.tools.XenoriteAxe;
import gcm.xenorite.tools.XenoriteHoe;
import gcm.xenorite.tools.XenoritePickaxe;
import gcm.xenorite.tools.XenoriteShovel;
import gcm.xenorite.utility.CustomDrops;
import gcm.xenorite.utility.LogHelper;
import gcm.xenorite.weapons.CoreoriteSword;
import gcm.xenorite.weapons.FinoriteSword;
import gcm.xenorite.weapons.HeavenlyGlintSword;
import gcm.xenorite.weapons.ShadowBoronSword;
import gcm.xenorite.weapons.XenoriteSword;
import gcm.xenorite.world.gen.Oregen;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Xenorite
{

	@Mod.Instance(Reference.MOD_ID)
	public static Xenorite						instance;

	public static Oregen						Oregen						= new Oregen();

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
	public static IProxy						proxy;

	// Tool And Armor Materials
	public static final Item.ToolMaterial		XenoriteToolMaterials		= EnumHelper.addToolMaterial("XenoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial	XenoriteArmorMaterials		= EnumHelper.addArmorMaterial("XenoriteArmorMaterials", 33, new int[]
																			{ 3, 8, 6, 3 }, 25);

	public static final Item.ToolMaterial		CoreoriteToolMaterials		= EnumHelper.addToolMaterial("CoreoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial	CoreoriteArmorMaterials		= EnumHelper.addArmorMaterial("CoreoriteArmorMaterials", 33, new int[]
																			{ 3, 8, 6, 3 }, 25);

	public static final Item.ToolMaterial		FinoriteToolMaterials		= EnumHelper.addToolMaterial("FinoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial	FinoriteArmorMaterials		= EnumHelper.addArmorMaterial("FinoriteArmorMaterials", 33, new int[]
																			{ 3, 8, 6, 3 }, 25);

	public static final Item.ToolMaterial		HeavenlyGlintToolMaterials	= EnumHelper.addToolMaterial("HeavenlyGlintToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial	HeavenlyGlintArmorMaterials	= EnumHelper.addArmorMaterial("HeavenlyGlintArmorMaterials", 33, new int[]
																			{ 3, 8, 6, 3 }, 25);

	public static final Item.ToolMaterial		ShadowBoronToolMaterials	= EnumHelper.addToolMaterial("ShadowBoronToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial	ShadowBoronArmorMaterials	= EnumHelper.addArmorMaterial("ShadowBoronArmorMaterials", 33, new int[]
																			{ 3, 8, 6, 3 }, 25);

	// Xenorite Sets
	public static ItemSword						xenoriteSword;
	public static ItemPickaxe					xenoritePickaxe;
	public static ItemSpade						xenoriteShovel;
	public static ItemAxe						xenoriteAxe;
	public static ItemHoe						xenoriteHoe;
	public static Item							xenoriteHelmet;
	public static Item							xenoriteChestplate;
	public static Item							xenoriteLeggings;
	public static Item							xenoriteBoots;

	// Coreorite Sets
	public static ItemSword						coreoriteSword;
	public static ItemPickaxe					coreoritePickaxe;
	public static ItemSpade						coreoriteShovel;
	public static ItemAxe						coreoriteAxe;
	public static ItemHoe						coreoriteHoe;
	public static Item							coreoriteHelmet;
	public static Item							coreoriteChestplate;
	public static Item							coreoriteLeggings;
	public static Item							coreoriteBoots;

	// Finorite Sets
	public static ItemSword						finoriteSword;
	public static ItemPickaxe					finoritePickaxe;
	public static ItemSpade						finoriteShovel;
	public static ItemAxe						finoriteAxe;
	public static ItemHoe						finoriteHoe;
	public static Item							finoriteHelmet;
	public static Item							finoriteChestplate;
	public static Item							finoriteLeggings;
	public static Item							finoriteBoots;

	// Heavenly Glint Sets
	public static ItemSword						heavenlyglintSword;
	public static ItemPickaxe					heavenlyglintPickaxe;
	public static ItemSpade						heavenlyglintShovel;
	public static ItemAxe						heavenlyglintAxe;
	public static ItemHoe						heavenlyglintHoe;
	public static Item							heavenlyglintHelmet;
	public static Item							heavenlyglintChestplate;
	public static Item							heavenlyglintLeggings;
	public static Item							heavenlyglintBoots;

	// Shadow Boron Sets
	public static ItemSword						shadowboronSword;
	public static ItemPickaxe					shadowboronPickaxe;
	public static ItemSpade						shadowboronShovel;
	public static ItemAxe						shadowboronAxe;
	public static ItemHoe						shadowboronHoe;
	public static Item							shadowboronHelmet;
	public static Item							shadowboronChestplate;
	public static Item							shadowboronLeggings;
	public static Item							shadowboronBoots;
	public static Entity						XenBeastEntity;

	// Mob Stuff
	public static void registerEntity(Class entityClass, String name)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		Random rand = new Random(seed);
		int primaryColor = rand.nextInt() * 16777215;
		int secondaryColor = rand.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor)); // probablity of space/minimal to spawn/max to spawn
		EntityRegistry.addSpawn(XenBeastEntity.class, 10, 1, 5, EnumCreatureType.monster, new BiomeGenBase[]
		{ BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.forestHills, BiomeGenBase.taigaHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.jungleEdge, BiomeGenBase.deepOcean, BiomeGenBase.stoneBeach, BiomeGenBase.coldBeach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.roofedForest, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.extremeHillsPlus, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau });
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new EventHandler());
		MinecraftForge.EVENT_BUS.register(new CustomDrops());

		proxy.registerRenderers();

		registerEntity(XenBeastEntity.class, "XenBeastEntity");

		ModBlockOres.init();

		ModBlocks.init();

		ModItems.init();

		UpdateHandler.init();

		// Xenorite Sets

		proxy.addArmor("xenorite");

		xenoriteSword = new XenoriteSword(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteSword, "xenoriteSword");
		OreDictionary.registerOre("swordXenorite", new ItemStack(xenoriteSword));

		xenoritePickaxe = new XenoritePickaxe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoritePickaxe, "xenoritePickaxe");
		OreDictionary.registerOre("pickaxeXenorite", new ItemStack(xenoritePickaxe));

		xenoriteShovel = new XenoriteShovel(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteShovel, "xenoriteShovel");
		OreDictionary.registerOre("shovelXenorite", new ItemStack(xenoriteShovel));

		xenoriteAxe = new XenoriteAxe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteAxe, "xenoriteAxe");
		OreDictionary.registerOre("axeXenorite", new ItemStack(xenoriteAxe));

		xenoriteHoe = new XenoriteHoe(XenoriteToolMaterials);
		GameRegistry.registerItem(xenoriteHoe, "xenoriteHoe");
		OreDictionary.registerOre("hoeXenorite", new ItemStack(xenoriteHoe));

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

		coreoriteSword = new CoreoriteSword(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteSword, "coreoriteSword");
		OreDictionary.registerOre("swordCoreorite", new ItemStack(coreoriteSword));

		coreoritePickaxe = new CoreoritePickaxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoritePickaxe, "coreoritePickaxe");
		OreDictionary.registerOre("pickaxeCoreorite", new ItemStack(coreoritePickaxe));

		coreoriteShovel = new CoreoriteShovel(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteShovel, "coreoriteShovel");
		OreDictionary.registerOre("shovelCoreorite", new ItemStack(coreoriteShovel));

		coreoriteAxe = new CoreoriteAxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteAxe, "coreoriteAxe");
		OreDictionary.registerOre("axeCoreorite", new ItemStack(coreoriteAxe));

		coreoriteHoe = new CoreoriteHoe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteHoe, "coreoriteHoe");
		OreDictionary.registerOre("hoeCoreorite", new ItemStack(coreoriteHoe));

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

		finoriteSword = new FinoriteSword(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteSword, "finoriteSword");
		OreDictionary.registerOre("swordFinorite", new ItemStack(finoriteSword));

		finoritePickaxe = new FinoritePickaxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoritePickaxe, "finoritePickaxe");
		OreDictionary.registerOre("pickaxeFinorite", new ItemStack(finoritePickaxe));

		finoriteShovel = new FinoriteShovel(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteShovel, "finoriteShovel");
		OreDictionary.registerOre("shovelFinorite", new ItemStack(finoriteShovel));

		finoriteAxe = new FinoriteAxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteAxe, "finoriteAxe");
		OreDictionary.registerOre("axeFinorite", new ItemStack(finoriteAxe));

		finoriteHoe = new FinoriteHoe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteHoe, "finoriteHoe");
		OreDictionary.registerOre("hoeFinorite", new ItemStack(finoriteHoe));

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

		heavenlyglintSword = new HeavenlyGlintSword(HeavenlyGlintToolMaterials);
		GameRegistry.registerItem(heavenlyglintSword, "heavenlyglintSword");
		OreDictionary.registerOre("swordHeavenlyGlint", new ItemStack(heavenlyglintSword));

		heavenlyglintPickaxe = new HeavenlyGlintPickaxe(HeavenlyGlintToolMaterials);
		GameRegistry.registerItem(heavenlyglintPickaxe, "heavenlyglintPickaxe");
		OreDictionary.registerOre("pickaxeHeavenlyGlint", new ItemStack(heavenlyglintPickaxe));

		heavenlyglintShovel = new HeavenlyGlintShovel(HeavenlyGlintToolMaterials);
		GameRegistry.registerItem(heavenlyglintShovel, "heavenlyglintShovel");
		OreDictionary.registerOre("shovelHeavenlyGlint", new ItemStack(heavenlyglintShovel));

		heavenlyglintAxe = new HeavenlyGlintAxe(HeavenlyGlintToolMaterials);
		GameRegistry.registerItem(heavenlyglintAxe, "heavenlyglintAxe");
		OreDictionary.registerOre("axeHeavenlyGlint", new ItemStack(heavenlyglintAxe));

		heavenlyglintHoe = new HeavenlyGlintHoe(HeavenlyGlintToolMaterials);
		GameRegistry.registerItem(heavenlyglintHoe, "heavenlyglintHoe");
		OreDictionary.registerOre("hoeHeavenlyGlint", new ItemStack(heavenlyglintHoe));

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

		shadowboronSword = new ShadowBoronSword(ShadowBoronToolMaterials);
		GameRegistry.registerItem(shadowboronSword, "shadowboronSword");
		OreDictionary.registerOre("swordShadowBoron", new ItemStack(shadowboronSword));

		shadowboronPickaxe = new ShadowBoronPickaxe(ShadowBoronToolMaterials);
		GameRegistry.registerItem(shadowboronPickaxe, "shadowboronPickaxe");
		OreDictionary.registerOre("pickaxeShadowBoron", new ItemStack(shadowboronPickaxe));

		shadowboronShovel = new ShadowBoronShovel(ShadowBoronToolMaterials);
		GameRegistry.registerItem(shadowboronShovel, "shadowboronShovel");
		OreDictionary.registerOre("shovelShadowBoron", new ItemStack(shadowboronShovel));

		shadowboronAxe = new ShadowBoronAxe(ShadowBoronToolMaterials);
		GameRegistry.registerItem(shadowboronAxe, "shadowboronAxe");
		OreDictionary.registerOre("axeShadowBoron", new ItemStack(shadowboronAxe));

		shadowboronHoe = new ShadowBoronHoe(ShadowBoronToolMaterials);
		GameRegistry.registerItem(shadowboronHoe, "shadowboronHoe");
		OreDictionary.registerOre("hoeShadowBoron", new ItemStack(shadowboronHoe));

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
