package gcm.xenorite.init;

import gcm.xenorite.Xenorite;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{

		// Shaped Recipes

		// Xenorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.xenoriteBlock), "III", "III", "III", 'I', gcm.xenorite.init.ModItems.xenoriteIngot);
		// Coreorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.coreoriteBlock), "III", "III", "III", 'I', gcm.xenorite.init.ModItems.coreoriteIngot);
		// Finorite Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.finoriteBlock), "III", "III", "III", 'I', gcm.xenorite.init.ModItems.finoriteIngot);
		// HeavenlyGlint Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.heavenlyglintBlock), "III", "III", "III", 'I', gcm.xenorite.init.ModItems.heavenlyglintIngot);
		// ShadowBoron Block
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.shadowboronBlock), "III", "III", "III", 'I', gcm.xenorite.init.ModItems.shadowboronIngot);

		// Xenorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xenoriteSword), "I", "I", "S", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xenoritePickaxe), "III", " S ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xenoriteShovel), "I", "S", "S", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xenoriteAxe), "II ", "IS ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.xenoriteHoe), "II ", " S ", " S ", 'I', ModItems.xenoriteIngot, 'S', "stickWood"));

		// Xenorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteHelmet), "III", "I I", "   ", 'I', ModItems.xenoriteIngot);

		// Xenorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteChestplate), "I I", "III", "III", 'I', ModItems.xenoriteIngot);

		// Xenorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteLeggings), "III", "I I", "I I", 'I', ModItems.xenoriteIngot);

		// Xenorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenoriteBoots), "   ", "I I", "I I", 'I', ModItems.xenoriteIngot);

		// coreorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteSword), "I", "I", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoritePickaxe), "III", " S ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteShovel), "I", "S", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteAxe), "II ", "IS ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteHoe), "II ", " S ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

		// coreorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteHelmet), "III", "I I", "   ", 'I', ModItems.coreoriteIngot);

		// coreorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteChestplate), "I I", "III", "III", 'I', ModItems.coreoriteIngot);

		// coreorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteLeggings), "III", "I I", "I I", 'I', ModItems.coreoriteIngot);

		// coreorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.coreoriteBoots), "   ", "I I", "I I", 'I', ModItems.coreoriteIngot);

		// finorite Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.finoriteSword), "I", "I", "S", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.finoritePickaxe), "III", " S ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.finoriteShovel), "I", "S", "S", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.finoriteAxe), "II ", "IS ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.finoriteHoe), "II ", " S ", " S ", 'I', ModItems.finoriteIngot, 'S', "stickWood"));

		// finorite Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteHelmet), "III", "I I", "   ", 'I', ModItems.finoriteIngot);

		// finorite Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteChestplate), "I I", "III", "III", 'I', ModItems.finoriteIngot);

		// finorite Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteLeggings), "III", "I I", "I I", 'I', ModItems.finoriteIngot);

		// finorite Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.finoriteBoots), "   ", "I I", "I I", 'I', ModItems.finoriteIngot);

		// heavenlyglint Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.heavenlyglintSword), "I", "I", "S", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.heavenlyglintPickaxe), "III", " S ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.heavenlyglintShovel), "I", "S", "S", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.heavenlyglintAxe), "II ", "IS ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.heavenlyglintHoe), "II ", " S ", " S ", 'I', ModItems.heavenlyglintIngot, 'S', "stickWood"));

		// heavenlyglint Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintHelmet), "III", "I I", "   ", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintChestplate), "I I", "III", "III", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintLeggings), "III", "I I", "I I", 'I', ModItems.heavenlyglintIngot);

		// heavenlyglint Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.heavenlyglintBoots), "   ", "I I", "I I", 'I', ModItems.heavenlyglintIngot);

		// shadowboron Sword
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.shadowboronSword), "I", "I", "S", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Pickaxe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.shadowboronPickaxe), "III", " S ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// finorite Shovel
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.shadowboronShovel), "I", "S", "S", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Axe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.shadowboronAxe), "II ", "IS ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Hoe
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.shadowboronHoe), "II ", " S ", " S ", 'I', ModItems.shadowboronIngot, 'S', "stickWood"));

		// shadowboron Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronHelmet), "III", "I I", "   ", 'I', ModItems.shadowboronIngot);

		// shadowboron Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronChestplate), "I I", "III", "III", 'I', ModItems.shadowboronIngot);

		// shadowboron Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronLeggings), "III", "I I", "I I", 'I', ModItems.shadowboronIngot);

		// shadowboron Boots
		GameRegistry.addShapedRecipe(new ItemStack(Xenorite.shadowboronBoots), "   ", "I I", "I I", 'I', ModItems.shadowboronIngot);

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

		// Xenorite Melted Ingot
		GameRegistry.addSmelting(ModItems.xenoriteIngot, new ItemStack(ModItems.xenoriteMeltedIngot), 0.5F);

		// Coreorite Melted Ingot
		GameRegistry.addSmelting(ModItems.coreoriteIngot, new ItemStack(ModItems.coreoriteMeltedIngot), 0.5F);

		// Finorite Melted Ingot
		GameRegistry.addSmelting(ModItems.finoriteIngot, new ItemStack(ModItems.finoriteMeltedIngot), 0.5F);

		// Universe Soul Split
		GameRegistry.addSmelting(ModItems.universesoulSplit, new ItemStack(Items.coal, 10), 5.0F);

		// Xen Beast Soul Fragment
		GameRegistry.addSmelting(ModItems.xenbeastsoulFragment1, new ItemStack(Items.coal, 10), 5.0F);
	}
}