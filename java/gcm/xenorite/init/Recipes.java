package gcm.xenorite.init;

import gcm.xenorite.Xenorite;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		
		//Shaped Recipes
		
				//Xenorite Sword
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
				GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenorite_helmet), "III", "I I", "   ", 'I', ModItems.xenoriteIngot);

				// Xenorite Chestplate
				GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenorite_chestplate), "I I", "III", "III", 'I', ModItems.xenoriteIngot);

				// Xenorite Leggings
				GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenorite_leggings), "III", "I I", "I I", 'I', ModItems.xenoriteIngot);

				// Xenorite Boots
				GameRegistry.addShapedRecipe(new ItemStack(Xenorite.xenorite_boots), "   ", "I I", "I I", 'I', ModItems.xenoriteIngot);

				// coreorite Sword
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteSword), "I", "I", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

				// coreorite Pickaxe
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoritePickaxe), "III", " S ", " S ", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

				// coreorite Shovel
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteShovel), "I", "S", "S", 'I', ModItems.coreoriteIngot, 'S', "stickWood"));

				// coreorite Axe
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Xenorite.coreoriteAxe), "II ", "IS ", " S ",	'I', ModItems.coreoriteIngot, 'S', "stickWood"));

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
	}
}