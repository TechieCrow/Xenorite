package gcm.xenorite;

import gcm.xenorite.armor.CoreoriteArmor;
import gcm.xenorite.armor.FinoriteArmor;
import gcm.xenorite.armor.XenoriteArmor;
import gcm.xenorite.blocks.CoreoriteBlock;
import gcm.xenorite.blocks.CoreoriteOre;
import gcm.xenorite.blocks.FinoriteBlock;
import gcm.xenorite.blocks.FinoriteOre;
import gcm.xenorite.blocks.XenoriteBlock;
import gcm.xenorite.blocks.XenoriteOre;
import gcm.xenorite.items.CoreoriteIngot;
import gcm.xenorite.items.FinoriteIngot;
import gcm.xenorite.items.XenoriteIngot;
import gcm.xenorite.proxy.XenoriteCommonProxy;
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
import gcm.xenorite.weapons.CoreoriteSword;
import gcm.xenorite.weapons.FinoriteSword;
import gcm.xenorite.weapons.XenoriteSword;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
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
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Xenorite", name = "Xenorite Mod", version = "MC 1.7.2")
public class XenoriteMain {
	public static String MODID = "Xenorite";
	public static String VERSION = "MC 1.7.2";

	@SidedProxy(clientSide = "gcm.xenorite.proxy.XenoriteClientProxy", serverSide = "gcm.xenorite.proxy.XenoriteCommonProxy")
	public static XenoriteCommonProxy proxy;

	@Mod.Instance("Xenorite")
	public static XenoriteMain instance;

	public static CreativeTabs XenoriteTab = new CreativeTabs("Xenorite Tab") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(XenoriteMain.xenoriteOre);
		}
	};

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

	public static final Item.ToolMaterial GrapheneToolMaterials = EnumHelper
			.addToolMaterial("FinoriteToolMaterials", 3, 655, 8.0F, 3.0F, 22);

	public static final ItemArmor.ArmorMaterial GrapheneArmorMaterials = EnumHelper
			.addArmorMaterial("GrapheneArmorMaterials", 33, new int[] { 3, 8,
					6, 3 }, 25);

	// Xenorite Sets
	public static Block xenoriteOre;
	public static Block xenoriteBlock;
	public static Item xenoriteIngot;
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
	public static Block coreoriteOre;
	public static Block coreoriteBlock;
	public static Item coreoriteIngot;
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
	public static Block finoriteOre;
	public static Block finoriteBlock;
	public static Item finoriteIngot;
	public static ItemSword finoriteSword;
	public static ItemPickaxe finoritePickaxe;
	public static ItemSpade finoriteShovel;
	public static ItemAxe finoriteAxe;
	public static ItemHoe finoriteHoe;
	public static Item finoriteHelmet;
	public static Item finoriteChestplate;
	public static Item finoriteLeggings;
	public static Item finoriteBoots;

	// Graphene Sets

	// public static Block grapheneOre;
	// public static Block grapheneBlock;
	// public static Item grapheneIngot;
	// public static ItemSword grapheneSword;
	// public static ItemPickaxe graphenePickaxe;
	// public static ItemSpade grapheneShovel;
	// public static ItemAxe grapheneAxe;
	// public static ItemHoe grapheneHoe;
	// public static Item grapheneHelmet;
	// public static Item grapheneChestplate;
	// public static Item grapheneLeggings;
	// public static Item grapheneBoots;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		GameRegistry.registerWorldGenerator(new EventManager(), 1);

		// Xenorite Sets
		xenoriteOre = new XenoriteOre();
		GameRegistry.registerBlock(xenoriteOre, "xenoriteOre");
		OreDictionary.registerOre("oreXenorite", new ItemStack(xenoriteOre));

		xenoriteBlock = new XenoriteBlock();
		GameRegistry.registerBlock(xenoriteBlock, "xenoriteBlock");
		OreDictionary
				.registerOre("blockXenorite", new ItemStack(xenoriteBlock));

		xenoriteIngot = new XenoriteIngot();
		GameRegistry.registerItem(xenoriteIngot, "xenoriteIngot");
		OreDictionary
				.registerOre("ingotXenorite", new ItemStack(xenoriteIngot));

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
		coreoriteOre = new CoreoriteOre();
		GameRegistry.registerBlock(coreoriteOre, "coreoriteOre");

		coreoriteBlock = new CoreoriteBlock();
		GameRegistry.registerBlock(coreoriteBlock, "coreoriteBlock");

		coreoriteIngot = new CoreoriteIngot();
		GameRegistry.registerItem(coreoriteIngot, "coreoriteIngot");

		coreoriteSword = new CoreoriteSword(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteSword, "coreoriteSword");

		coreoritePickaxe = new CoreoritePickaxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoritePickaxe, "coreoritePickaxe");

		coreoriteShovel = new CoreoriteShovel(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteShovel, "coreoriteShovel");

		coreoriteAxe = new CoreoriteAxe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteAxe, "coreoriteAxe");

		coreoriteHoe = new CoreoriteHoe(CoreoriteToolMaterials);
		GameRegistry.registerItem(coreoriteHoe, "coreoriteHoe");

		coreoriteHelmet = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 0)
				.setUnlocalizedName("coreorite Helmet");
		GameRegistry.registerItem(coreoriteHelmet, "coreoriteHelmet");

		coreoriteChestplate = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 1)
				.setUnlocalizedName("coreorite Chestplate");
		GameRegistry.registerItem(coreoriteChestplate, "coreoriteChestplate");

		coreoriteLeggings = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 2)
				.setUnlocalizedName("coreorite Leggings");
		GameRegistry.registerItem(coreoriteLeggings, "coreoriteLeggings");

		coreoriteBoots = new CoreoriteArmor(CoreoriteArmorMaterials, 5, 3)
				.setUnlocalizedName("coreorite Boots");
		GameRegistry.registerItem(coreoriteBoots, "coreoriteBoots");

		// Finorite Sets
		finoriteOre = new FinoriteOre();
		GameRegistry.registerBlock(finoriteOre, "finoriteOre");

		finoriteBlock = new FinoriteBlock();
		GameRegistry.registerBlock(finoriteBlock, "finoriteBlock");

		finoriteIngot = new FinoriteIngot();
		GameRegistry.registerItem(finoriteIngot, "finoriteIngot");

		finoriteSword = new FinoriteSword(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteSword, "finoriteSword");

		finoritePickaxe = new FinoritePickaxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoritePickaxe, "finoritePickaxe");

		finoriteShovel = new FinoriteShovel(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteShovel, "finoriteShovel");

		finoriteAxe = new FinoriteAxe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteAxe, "finoriteAxe");

		finoriteHoe = new FinoriteHoe(FinoriteToolMaterials);
		GameRegistry.registerItem(finoriteHoe, "finoriteHoe");

		finoriteHelmet = new FinoriteArmor(FinoriteArmorMaterials, 5, 0)
				.setUnlocalizedName("finorite Helmet");
		GameRegistry.registerItem(finoriteHelmet, "finoriteHelmet");

		finoriteChestplate = new FinoriteArmor(FinoriteArmorMaterials, 5, 1)
				.setUnlocalizedName("finorite Chestplate");
		GameRegistry.registerItem(finoriteChestplate, "finoriteChestplate");

		finoriteLeggings = new FinoriteArmor(FinoriteArmorMaterials, 5, 2)
				.setUnlocalizedName("finorite Leggings");
		GameRegistry.registerItem(finoriteLeggings, "finoriteLeggings");

		finoriteBoots = new FinoriteArmor(FinoriteArmorMaterials, 5, 3)
				.setUnlocalizedName("finorite Boots");
		GameRegistry.registerItem(finoriteBoots, "finoriteBoots");

		// Graphene Sets
		// grapheneOre = new GrapheneOre();
		// GameRegistry.registerBlock(grapheneOre,"grapheneOre");
		// grapheneBlock = new GrapheneBlock();
		// GameRegistry.registerBlock(grapheneBlock, "grapheneBlock");
		// grapheneIngot = new GrapheneIngot();
		// GameRegistry.registerItem(grapheneIngot, "grapheneIngot");
		// grapheneSword = new GrapheneSword(GrapheneToolMaterials);
		// GameRegistry.registerItem(grapheneSword, "grapheneSword");
		// graphenePickaxe = new GraphenePickaxe(GrapheneToolMaterials);
		// GameRegistry.registerItem(graphenePickaxe, "graphenePickaxe");
		// grapheneShovel = new GrapheneShovel(GrapheneToolMaterials);
		// GameRegistry.registerItem(grapheneShovel, "grapheneShovel");
		// grapheneAxe = new GrapheneAxe(GrapheneToolMaterials);
		// GameRegistry.registerItem(grapheneAxe, "grapheneAxe");
		// grapheneHoe = new GrapheneHoe(GrapheneToolMaterials);
		// GameRegistry.registerItem(grapheneHoe, "grapheneHoe");
		// grapheneHelmet = new GrapheneArmor(GrapheneArmorMaterials, 5,
		// 0).setUnlocalizedName("graphene Helmet");
		// GameRegistry.registerItem(grapheneHelmet, "grapheneHelmet");
		// grapheneChestplate = new GrapheneArmor(GrapheneArmorMaterials, 5,
		// 1).setUnlocalizedName("graphene Chestplate");
		// GameRegistry.registerItem(grapheneChestplate, "grapheneChestplate");
		// grapheneLeggings = new GrapheneArmor(GrapheneArmorMaterials, 5,
		// 2).setUnlocalizedName("graphene Leggings");
		// GameRegistry.registerItem(grapheneLeggings, "grapheneLeggings");
		// grapheneBoots = new GrapheneArmor(GrapheneArmorMaterials, 5,
		// 3).setUnlocalizedName("graphene Boots");
		// GameRegistry.registerItem(grapheneBoots, "grapheneBoots");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

		GameRegistry.addSmelting(xenoriteOre, new ItemStack(xenoriteIngot),
				0.1F);

		// Xenorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteSword),

		"I", "I", "S",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Pickaxe
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoritePickaxe),

				"III", " S ", " S ",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Shovel
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoriteShovel),

				"I", "S", "S",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteAxe),

		"II ", "IS ", " S ",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteHoe),

		"II ", " S ", " S ",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoriteHelmet),

				"III", "I I", "   ",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.xenoriteChestplate),

		"I I", "III", "III",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.xenoriteLeggings),

		"III", "I I", "I I",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteBoots),

		"   ", "I I", "I I",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// ////////**********coreorite Recipes**********//////////

		GameRegistry.addSmelting(XenoriteMain.coreoriteOre, new ItemStack(
				XenoriteMain.coreoriteIngot), 0.1F);

		// coreorite Sword
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteSword),

				"I", "I", "S",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoritePickaxe),

		"III", " S ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Shovel
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteShovel),

				"I", "S", "S",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.coreoriteAxe),

		"II ", "IS ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.coreoriteHoe),

		"II ", " S ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteHelmet),

				"III", "I I", "   ",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoriteChestplate),

		"I I", "III", "III",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoriteLeggings),

		"III", "I I", "I I",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Boots
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteBoots),

				"   ", "I I", "I I",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// ////////**********Xenorite Recipes**********//////////

		GameRegistry.addSmelting(XenoriteMain.xenoriteOre, new ItemStack(
				XenoriteMain.xenoriteIngot), 0.1F);

		// Xenorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteSword),

		"I", "I", "S",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Pickaxe
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoritePickaxe),

				"III", " S ", " S ",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Shovel
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoriteShovel),

				"I", "S", "S",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteAxe),

		"II ", "IS ", " S ",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteHoe),

		"II ", " S ", " S ",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.xenoriteHelmet),

				"III", "I I", "   ",

				'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.xenoriteChestplate),

		"I I", "III", "III",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.xenoriteLeggings),

		"III", "I I", "I I",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// Xenorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.xenoriteBoots),

		"   ", "I I", "I I",

		'I', XenoriteMain.xenoriteIngot, 'S', Items.stick);

		// ////////**********coreorite Recipes**********//////////

		GameRegistry.addSmelting(XenoriteMain.coreoriteOre, new ItemStack(
				XenoriteMain.coreoriteIngot), 0.1F);

		// coreorite Sword
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteSword),

				"I", "I", "S",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoritePickaxe),

		"III", " S ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Shovel
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteShovel),

				"I", "S", "S",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.coreoriteAxe),

		"II ", "IS ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.coreoriteHoe),

		"II ", " S ", " S ",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteHelmet),

				"III", "I I", "   ",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoriteChestplate),

		"I I", "III", "III",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.coreoriteLeggings),

		"III", "I I", "I I",

		'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// coreorite Boots
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.coreoriteBoots),

				"   ", "I I", "I I",

				'I', XenoriteMain.coreoriteIngot, 'S', Items.stick);

		// ////////**********finorite Recipes**********//////////

		GameRegistry.addSmelting(XenoriteMain.finoriteOre, new ItemStack(
				XenoriteMain.finoriteIngot), 0.1F);

		// finorite Sword
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.finoriteSword),

		"I", "I", "S",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Pickaxe
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.finoritePickaxe),

				"III", " S ", " S ",

				'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Shovel
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.finoriteShovel),

				"I", "S", "S",

				'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Axe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.finoriteAxe),

		"II ", "IS ", " S ",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Hoe
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.finoriteHoe),

		"II ", " S ", " S ",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(XenoriteMain.finoriteHelmet),

				"III", "I I", "   ",

				'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.finoriteChestplate),

		"I I", "III", "III",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(
				XenoriteMain.finoriteLeggings),

		"III", "I I", "I I",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// finorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(XenoriteMain.finoriteBoots),

		"   ", "I I", "I I",

		'I', XenoriteMain.finoriteIngot, 'S', Items.stick);

		// ////////**********graphene Recipes**********//////////

		/*
		 * GameRegistry.addSmelting(XenoriteMain.grapheneOre, new
		 * ItemStack(XenoriteMain.grapheneIngot), 0.1F);
		 * 
		 * // graphene Sword GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneSword),
		 * 
		 * "I", "I", "S",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Pickaxe GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.graphenePickaxe),
		 * 
		 * "III", " S ", " S ",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Shovel GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneShovel),
		 * 
		 * "I", "S", "S",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Axe GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneAxe),
		 * 
		 * "II ", "IS ", " S ",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Hoe GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneHoe),
		 * 
		 * "II ", " S ", " S ",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Helmet GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneHelmet),
		 * 
		 * "III", "I I", "   ",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Chestplate GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneChestplate),
		 * 
		 * "I I", "III", "III",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Leggings GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneLeggings),
		 * 
		 * "III", "I I", "I I",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 * 
		 * // graphene Boots GameRegistry.addShapedRecipe(new
		 * ItemStack(XenoriteMain.grapheneBoots),
		 * 
		 * "   ", "I I", "I I",
		 * 
		 * 'I', XenoriteMain.grapheneIngot, 'S', Items.stick);
		 */
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
