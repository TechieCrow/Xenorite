package xyz.techiecrow.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import xyz.techiecrow.Xenorite;

public class Recipes
{
	public static void init()
	{

		// Shaped Recipes

		// Xenorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.xenoriteBlock), "III", "III", "III", 'I', xyz.techiecrow.init.ModItems.xenoriteIngot);
		// Coreorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.coreoriteBlock), "III", "III", "III", 'I', xyz.techiecrow.init.ModItems.coreoriteIngot);
		// Finorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.finoriteBlock), "III", "III", "III", 'I', xyz.techiecrow.init.ModItems.finoriteIngot);
		// HeavenlyGlint Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.heavenlyglintBlock), "III", "III", "III", 'I', xyz.techiecrow.init.ModItems.heavenlyglintIngot);
		// ShadowBoron Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.shadowboronBlock), "III", "III", "III", 'I', xyz.techiecrow.init.ModItems.shadowboronIngot);

		// Xenorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.xenoriteSword), "I", "I", "S", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.xenoritePickaxe), "III", " S ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.xenoriteShovel), "I", "S", "S", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.xenoriteAxe), "II ", "IS ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.xenoriteHoe), "II ", " S ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteHelmet), "III", "I I", "   ", 'I', ModItems.xenoriteIngot);

		// Xenorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteChestplate), "I I", "III", "III", 'I', ModItems.xenoriteIngot);

		// Xenorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteLeggings), "III", "I I", "I I", 'I', ModItems.xenoriteIngot);

		// Xenorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteBoots), "   ", "I I", "I I", 'I', ModItems.xenoriteIngot);

		// coreorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.coreoriteSword), "I", "I", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.coreoritePickaxe), "III", " S ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.coreoriteShovel), "I", "S", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.coreoriteAxe), "II ", "IS ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.coreoriteHoe), "II ", " S ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteHelmet), "III", "I I", "   ", 'I', ModItems.coreoriteIngot);

		// coreorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteChestplate), "I I", "III", "III", 'I', ModItems.coreoriteIngot);

		// coreorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteLeggings), "III", "I I", "I I", 'I', ModItems.coreoriteIngot);

		// coreorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteBoots), "   ", "I I", "I I", 'I', ModItems.coreoriteIngot);

		// finorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.finoriteSword), "I", "I", "S", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.finoritePickaxe), "III", " S ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.finoriteShovel), "I", "S", "S", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.finoriteAxe), "II ", "IS ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.finoriteHoe), "II ", " S ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteHelmet), "III", "I I", "   ", 'I', ModItems.finoriteIngot);

		// finorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteChestplate), "I I", "III", "III", 'I', ModItems.finoriteIngot);

		// finorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteLeggings), "III", "I I", "I I", 'I', ModItems.finoriteIngot);

		// finorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteBoots), "   ", "I I", "I I", 'I', ModItems.finoriteIngot);

		// heavenlyglint Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.heavenlyglintSword), "I", "I", "S", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.heavenlyglintPickaxe), "III", " S ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.heavenlyglintShovel), "I", "S", "S", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.heavenlyglintAxe), "II ", "IS ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.heavenlyglintHoe), "II ", " S ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintHelmet), "III", "I I", "   ", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintChestplate), "I I", "III", "III", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintLeggings), "III", "I I", "I I", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintBoots), "   ", "I I", "I I", 'I', ModItems.heavenlyglintIngot);

		// shadowboron Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.shadowboronSword), "I", "I", "S", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.shadowboronPickaxe), "III", " S ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.shadowboronShovel), "I", "S", "S", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.shadowboronAxe), "II ", "IS ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.shadowboronHoe), "II ", " S ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronHelmet), "III", "I I", "   ", 'I', ModItems.shadowboronIngot);

		// shadowboron Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronChestplate), "I I", "III", "III", 'I', ModItems.shadowboronIngot);

		// shadowboron Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronLeggings), "III", "I I", "I I", 'I', ModItems.shadowboronIngot);

		// shadowboron Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronBoots), "   ", "I I", "I I", 'I', ModItems.shadowboronIngot);

		// XCF Master Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.xcfMasterSword), " X ", " C ", "SFS", 'X', ModWeapons.xenoriteSword, 'C', ModWeapons.coreoriteSword, 'F', ModWeapons.finoriteSword, 'S', ModItems.universesoulSplit));

		// XCF Master Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.xcfMasterPickaxe), "XCF", " S ", " S ", 'X', ModPickaxes.xenoritePickaxe, 'C', ModPickaxes.coreoritePickaxe, 'F', ModPickaxes.finoritePickaxe, 'S', ModItems.universesoulSplit));

		// XCF Master Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.xcfMasterShovel), "SXS", " C ", " F ", 'X', ModShovels.xenoriteShovel, 'C', ModShovels.coreoriteShovel, 'F', ModShovels.finoriteShovel, 'S', ModItems.universesoulSplit));

		// XCF Master Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.xcfMasterAxe), "XC ", "FS ", " S ", 'X', ModAxes.xenoriteAxe, 'C', ModAxes.coreoriteAxe, 'F', ModAxes.finoriteAxe, 'S', ModItems.universesoulSplit));

		// XCF Master Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.xcfMasterHoe), " X ", "CS ", "FS ", 'X', ModHoes.xenoriteHoe, 'C', ModHoes.coreoriteHoe, 'F', ModHoes.finoriteHoe, 'S', ModItems.universesoulSplit));

		// XCF Master Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xcfMasterHelmet), "SXS", "C F", "   ", 'X', Xenorite.xenoriteHelmet, 'C', Xenorite.coreoriteHelmet, 'F', Xenorite.finoriteHelmet, 'S', ModItems.universesoulSplit));

		// XCF Master Chestplate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xcfMasterChestplate), "S S", "XCF", "FCX", 'X', Xenorite.xenoriteChestplate, 'C', Xenorite.coreoriteChestplate, 'F', Xenorite.finoriteChestplate, 'S', ModItems.universesoulSplit));

		// XCF Master Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xcfMasterLeggings), "XCF", "FCX", "S S", 'X', Xenorite.xenoriteLeggings, 'C', Xenorite.coreoriteLeggings, 'F', Xenorite.finoriteLeggings, 'S', ModItems.universesoulSplit));

		// XCF Master Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xcfMasterBoots), "XCF", "FCX", " S ", 'X', Xenorite.xenoriteBoots, 'C', Xenorite.coreoriteBoots, 'F', Xenorite.finoriteBoots, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.peacefulGlintingShadowSword), " X ", " C ", "SDS", 'X', ModWeapons.heavenlyglintSword, 'C', ModWeapons.shadowboronSword, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.peacefulGlintingShadowPickaxe), "XCD", " S ", " S ", 'X', ModPickaxes.heavenlyglintPickaxe, 'C', ModPickaxes.shadowboronPickaxe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.peacefulGlintingShadowShovel), "SXS", " C ", " D ", 'X', ModShovels.heavenlyglintShovel, 'C', ModShovels.shadowboronShovel, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.peacefulGlintingShadowAxe), "XC ", "DS ", " S ", 'X', ModAxes.heavenlyglintAxe, 'C', ModAxes.shadowboronAxe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.peacefulGlintingShadowHoe), " X ", "CS ", "DS ", 'X', ModHoes.heavenlyglintHoe, 'C', ModHoes.shadowboronHoe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.peacefulGlintingShadowHelmet), "SXS", "C D", "   ", 'X', Xenorite.heavenlyglintHelmet, 'C', Xenorite.shadowboronHelmet, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Chestplate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.peacefulGlintingShadowChestplate), "S S", "XCD", "DCX", 'X', Xenorite.heavenlyglintChestplate, 'C', Xenorite.shadowboronChestplate, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.peacefulGlintingShadowLeggings), "XCD", "DCX", "S S", 'X', Xenorite.heavenlyglintLeggings, 'C', Xenorite.shadowboronLeggings, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Peaceful Glinting Shadow Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.peacefulGlintingShadowBoots), "XCD", "DCX", " S ", 'X', Xenorite.heavenlyglintBoots, 'C', Xenorite.shadowboronBoots, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModWeapons.worldlySword), " X ", " C ", "SDS", 'X', ModWeapons.xcfMasterSword, 'C', ModWeapons.peacefulGlintingShadowSword, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModPickaxes.worldlyPickaxe), "XCD", " S ", " S ", 'X', ModPickaxes.xcfMasterPickaxe, 'C', ModPickaxes.peacefulGlintingShadowPickaxe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModShovels.worldlyShovel), "SXS", " C ", " D ", 'X', ModShovels.xcfMasterShovel, 'C', ModShovels.peacefulGlintingShadowShovel, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModAxes.worldlyAxe), "XC ", "DS ", " S ", 'X', ModAxes.xcfMasterAxe, 'C', ModAxes.peacefulGlintingShadowAxe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModHoes.worldlyHoe), " X ", "CS ", "DS ", 'X', ModHoes.xcfMasterHoe, 'C', ModHoes.peacefulGlintingShadowHoe, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Helmet
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.worldlyHelmet), "SXS", "C D", "   ", 'X', Xenorite.xcfMasterHelmet, 'C', Xenorite.peacefulGlintingShadowHelmet, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Chestplate
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.worldlyChestplate), "S S", "XCD", "DCX", 'X', Xenorite.xcfMasterChestplate, 'C', Xenorite.peacefulGlintingShadowChestplate, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Leggings
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.worldlyLeggings), "XCD", "DCX", "S S", 'X', Xenorite.xcfMasterLeggings, 'C', Xenorite.peacefulGlintingShadowLeggings, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Worldly Boots
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.worldlyBoots), "XCD", "DCX", " S ", 'X', Xenorite.xcfMasterBoots, 'C', Xenorite.peacefulGlintingShadowBoots, 'D', Items.diamond, 'S', ModItems.universesoulSplit));

		// Heavenly Glint Apple
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.appleHeavenlyGlint), "IXI", "XAX", "III", 'I', ModItems.heavenlyglintIngot, 'X', ModItems.universesoulSplit, 'A', Items.apple);

		// Shadow Boron Apple
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.appleShadowBoron), "IXI", "XAX", "III", 'I', ModItems.shadowboronIngot, 'X', ModItems.universesoulSplit, 'A', Items.apple);

		// Smelting
		// Xenorite Ingot
		GameRegistry.addSmelting(ModBlockOres.xenoriteOre, new ItemStack(ModItems.xenoriteIngot), 2.0F);

		// Coreorite Ingot
		GameRegistry.addSmelting(ModBlockOres.coreoriteOre, new ItemStack(ModItems.coreoriteIngot), 2.0F);

		// Finorite Ingot
		GameRegistry.addSmelting(ModBlockOres.finoriteOre, new ItemStack(ModItems.finoriteIngot), 2.0F);

		// Heavenly Glint Ingot
		GameRegistry.addSmelting(ModBlockOres.HeavenlyGlintOre, new ItemStack(ModItems.heavenlyglintIngot), 2.0F);

		// Shadow Boron Ingot
		GameRegistry.addSmelting(ModBlockOres.ShadowBoronOre, new ItemStack(ModItems.shadowboronIngot), 2.0F);

		// Universe Soul Split
		GameRegistry.addSmelting(ModItems.universesoulSplit, new ItemStack(Items.coal, 10), 5.0F);

		// Xen Beast Soul Fragment
		GameRegistry.addSmelting(ModItems.xenbeastsoulFragment1, new ItemStack(Items.coal, 10), 5.0F);
	}
}