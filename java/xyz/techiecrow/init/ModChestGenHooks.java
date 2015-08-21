package xyz.techiecrow.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ModChestGenHooks
{

	public static void addDungeonItems()
	{

		// bonus Chest
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Dungeon Chest
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Mineshaft Corridor
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Desert Pyramid Chest
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Jungle Pyramid Chest
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Jungle Pyramid Dispenser
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Stronghold Corridor
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Stronghold Crossing
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Stronghold Library
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));

		// Village Blacksmith Building
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModShovels.xenoriteShovel), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModAxes.coreoriteAxe), 1, 1, 1));

		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModHoes.finoriteHoe), 1, 1, 1));
	}
}