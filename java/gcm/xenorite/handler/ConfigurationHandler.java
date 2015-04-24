package gcm.xenorite.handler;

import gcm.xenorite.reference.Reference;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{

	public static Configuration	configuration;

	public static int			oreXenoriteSpawnHeight;
	public static int			oreCoreoriteSpawnHeight;
	public static int			oreFinoriteSpawnHeight;

	public static int			oreHeavenlyGlintSpawnHeight;
	public static int			oreShadowBoronSpawnHeight;

	public static int			oreXenoriteSpawnsPerVein;
	public static int			oreCoreoriteSpawnsPerVein;
	public static int			oreFinoriteSpawnsPerVein;

	public static int			oreHeavenlyGlintSpawnsPerVein;
	public static int			oreShadowBoronSpawnsPerVein;

	public static int			oreHeavenlyGlintEffect1;
	public static int			oreHeavenlyGlintEffect2;
	public static int			oreHeavenlyGlintEffect3;
	public static int			oreHeavenlyGlintEffect4;
	public static int			oreHeavenlyGlintEffect5;
	public static int			oreHeavenlyGlintEffect6;

	public static int			oreShadowBoronEffect1;
	public static int			oreShadowBoronEffect2;
	public static int			oreShadowBoronEffect3;
	public static int			oreShadowBoronEffect4;
	public static int			oreShadowBoronEffect5;
	public static int			oreShadowBoronEffect6;

	public static int			swordHeavenlyGlintEffect1;
	public static int			swordShadowBoronEffect1;

	public static int			pickaxeHeavenlyGlintEffect1;
	public static int			pickaxeShadowBoronEffect1;

	public static int			helmetHeavenlyGlintEffect1;
	public static int			helmetShadowBoronEffect1;

	public static int			chestplateHeavenlyGlintEffect1;
	public static int			chestplateShadowBoronEffect1;

	public static int			leggingsHeavenlyGlintEffect1;
	public static int			leggingsShadowBoronEffect1;

	public static int			bootsHeavenlyGlintEffect1;
	public static int			bootsShadowBoronEffect1;

	public static double		xenbeastHealth;
	public static double		xenbeastDamage;
	public static double		xenbeastSpeed;
	public static double		xenbeastknockbackResistance;
	public static double		xenbeastFollowRange;
	public static int			xenbeastSpawnRate;
	public static int			xenbeastMinSpawn;
	public static int			xenbeastMaxSpawn;

	public static int			xenbeastSoulFragmentDrop;
	public static int			xenbeastSoulFragmenteffect;

	public static double		universesoulSplitDropChance;
	public static int			universesoulSplitDrop;

	public static double		appleHeavenlyGlintDropChance;
	public static int			appleHeavenlyGlintHungerAmount;
	public static int			appleHeavenlyGlintSaturationAmount;
	public static boolean		appleHeavenlyGlintWolvesFavoriteFood;
	public static int			appleHeavenlyGlintEffect1;
	public static int			appleHeavenlyGlintEffect2;
	public static int			appleHeavenlyGlintEffectTime1;
	public static int			appleHeavenlyGlintEffectTime2;

	public static double		appleShadowBoronDropChance;
	public static int			appleShadowBoronHungerAmount;
	public static int			appleShadowBoronSaturationAmount;
	public static boolean		appleShadowBoronWolvesFavoriteFood;
	public static int			appleShadowBoronEffect1;
	public static int			appleShadowBoronEffect2;
	public static int			appleShadowBoronEffectTime1;
	public static int			appleShadowBoronEffectTime2;

	public static void init(File configFile)
	{
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}

	private static void loadConfiguration()
	{
		String category;

		category = "Overworld Ore Spawn Height";
		oreXenoriteSpawnHeight = configuration.get(category, "Max Xenorite Ore Spawn Height", 20, "(Default: 20)").getInt(20);
		oreCoreoriteSpawnHeight = configuration.get(category, "Max Coreorite Ore Spawn Height", 20, "(Default: 20)").getInt(20);
		oreFinoriteSpawnHeight = configuration.get(category, "Max Finorite Ore Spawn Height", 20, "(Default: 20)").getInt(20);

		category = "Nether Ore Spawn Height";
		oreHeavenlyGlintSpawnHeight = configuration.get(category, "Max Heavenly Glint Ore Spawn Height", 256, "(Default: 256)").getInt(256);
		oreShadowBoronSpawnHeight = configuration.get(category, "Max Shadow Boron Ore Spawn Height", 256, "(Default: 256)").getInt(256);

		category = "Overworld Ore Sapwns Per Vein";
		oreXenoriteSpawnsPerVein = configuration.get(category, "Max Xenorite Ore Spawns Per Vein", 5, "(Default: 5)").getInt(5);
		oreCoreoriteSpawnsPerVein = configuration.get(category, "Max Coreorite Ore Spawns Per Vein", 5, "(Default: 5)").getInt(5);
		oreFinoriteSpawnsPerVein = configuration.get(category, "Max Finorite Ore Spawns Per Vein", 5, "(Default: 5)").getInt(5);

		category = "Nether Sapwns Per Vein";
		oreHeavenlyGlintSpawnsPerVein = configuration.get(category, "Max Heavenly Glint Ore Spawns Per Vein", 5, "(Default: 5)").getInt(5);
		oreShadowBoronSpawnsPerVein = configuration.get(category, "Max Shadow Boron Ore Spawns Per Vein", 5, "(Default: 5)").getInt(5);

		category = "Heavenly Glint Ore Effects";
		oreHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Ore Effect 1#", 5, "(Default: 5 (Strength))").getInt(5);
		oreHeavenlyGlintEffect2 = configuration.get(category, "Heavenly Glint Ore Effect 2#", 3, "(Default: 3 (Haste))").getInt(3);
		oreHeavenlyGlintEffect3 = configuration.get(category, "Heavenly Glint Ore Effect 3#", 1, "(Default: 1 (Speed Boost))").getInt(1);
		oreHeavenlyGlintEffect4 = configuration.get(category, "Heavenly Glint Ore Effect 4#", 13, "(Default: 13 (Water Breathing))").getInt(13);
		oreHeavenlyGlintEffect5 = configuration.get(category, "Heavenly Glint Ore Effect 5#", 12, "(Default: 12 Fire Resistance))").getInt(12);
		oreHeavenlyGlintEffect6 = configuration.get(category, "Heavenly Glint Ore Effect 6#", 8, "(Default: 8 (Jump Boost))").getInt(8);

		category = "Shadow Boron Ore Effects";
		oreShadowBoronEffect1 = configuration.get(category, "Shadow Boron Ore Effect 1#", 5, "(Default: 5 (Strength))").getInt(5);
		oreShadowBoronEffect2 = configuration.get(category, "Shadow Boron Ore Effect 2#", 3, "(Default: 3 (Haste))").getInt(3);
		oreShadowBoronEffect3 = configuration.get(category, "Shadow Boron Ore Effect 3#", 1, "(Default: 1 (Speed Boost))").getInt(1);
		oreShadowBoronEffect4 = configuration.get(category, "Shadow Boron Ore Effect 4#", 13, "(Default: 13 (Water Breathing))").getInt(13);
		oreShadowBoronEffect5 = configuration.get(category, "Shadow Boron Ore Effect 5#", 12, "(Default: 12 (Fire Resistance))").getInt(12);
		oreShadowBoronEffect6 = configuration.get(category, "Shadow Boron Ore Effect 6#", 8, "(Default: 8 (Jump Boost))").getInt(8);

		category = "Heavenly Glint Sword Effects";
		swordHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Sword Effect", 5, "(Default: 5)").getInt(5);

		category = "Shadow Boron Sword Effects";
		swordShadowBoronEffect1 = configuration.get(category, "Shadow Boron Sword Effect", 5, "(Default: 5)").getInt(5);

		category = "Heavenly Glint Pickaxe Effects";
		pickaxeHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Pickaxe Effect", 3, "(Default: 3)").getInt(3);

		category = "Shadow Boron Pickaxe Effects";
		pickaxeShadowBoronEffect1 = configuration.get(category, "Shadow Boron Pickaxe Effect", 3, "(Default: 3)").getInt(3);

		category = "Heavenly Glint Armour Effects";
		helmetHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Helmet Effect", 13, "(Default: 13)").getInt(13);
		chestplateHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Chestplate Effect", 12, "(Default: 12)").getInt(12);
		leggingsHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Leggings Effect", 8, "(Default: 8)").getInt(8);
		bootsHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Boots Effect", 1, "(Default: 1)").getInt(1);

		category = "Shadow Boron Armour Effects";
		helmetShadowBoronEffect1 = configuration.get(category, "Shadow Boron Helmet Effect", 13, "(Default: 13)").getInt(13);
		chestplateShadowBoronEffect1 = configuration.get(category, "Shadow Boron Chestplate Effect", 12, "(Default: 12)").getInt(12);
		leggingsShadowBoronEffect1 = configuration.get(category, "Shadow Boron Leggings Effect", 8, "(Default: 8)").getInt(8);
		bootsShadowBoronEffect1 = configuration.get(category, "Shadow Boron Boots Effect", 1, "(Default: 1)").getInt(1);

		category = "Xen Beast Attributes";
		xenbeastHealth = configuration.get(category, "Xen Beast Health", 40.0, "(Default: 40.0)").getDouble(40.0);
		xenbeastDamage = configuration.get(category, "Xen Beast Damage", 5.0, "(Default: 5.0)").getDouble(5.0);
		xenbeastSpeed = configuration.get(category, "Xen Beast Speed", 0.28, "(Default: 0.28)").getDouble(0.28);
		xenbeastknockbackResistance = configuration.get(category, "Xen Beast Knockback Resistance", 0.5, "(Default: 0.5)").getDouble(0.5);
		xenbeastFollowRange = configuration.get(category, "Xen Beast Follow Range", 50.0, "(Default: 50.0)").getDouble(50.0);
		xenbeastSpawnRate = configuration.get(category, "Xen Beast Spawn Rate", 10, "(Default: 10)").getInt(10);
		xenbeastMinSpawn = configuration.get(category, "Xen Beast Minimal To Spawn", 1, "(Default: 1)").getInt(1);
		xenbeastMaxSpawn = configuration.get(category, "Xen Beast Maximum To Spawn", 5, "(Default: 5)").getInt(5);
		xenbeastSoulFragmentDrop = configuration.get(category, "Xen Beast Soul Fragment Drop", 1, "How many Xen Beast soul fragments it drops. (Default: 1)").getInt(1);
		xenbeastSoulFragmenteffect = configuration.get(category, "Xen Beast Soul Fragment Effect", 1, "(Default: 1 (Speed Boost))").getInt(1);

		category = "Global Mob Drop";
		universesoulSplitDropChance = configuration.get(category, "Universe Soul Split Drop Chance", 0.01, "0.01 = 1%, 1.0 = 100%, etc. (Default: 0.01)").getDouble(0.01);
		universesoulSplitDrop = configuration.get(category, "Universe Soul Split Drop", 1, "How many Universe Soul Split drops. (Default: 1)").getInt(1);

		category = "Apple Values";
		appleHeavenlyGlintDropChance = configuration.get(category, "Heavenly Glint Apple Drop Chance", 0.01, "0.01 = 1%, 1.0 = 100%, etc. (Default: 0.01)").getDouble(0.01);
		appleHeavenlyGlintSaturationAmount = configuration.get(category, "Heavenly Glint Apple Saturation Amount", 1, "(Default: 1)").getInt(1);
		appleHeavenlyGlintHungerAmount = configuration.get(category, "Heavenly Glint Apple Hunger Amount", 4, "(Default: 4)").getInt(4);
		appleHeavenlyGlintWolvesFavoriteFood = configuration.get(category, "Heavenly Glint Apple Wolves Favorite Food", false, "(Default: flase)").getBoolean(false);
		appleHeavenlyGlintEffect1 = configuration.get(category, "Heavenly Glint Apple Effect 1", 16, "(Default: 16)").getInt(16);
		appleHeavenlyGlintEffect2 = configuration.get(category, "Heavenly Glint Apple Effect 2", 15, "(Default: 15)").getInt(15);
		appleHeavenlyGlintEffectTime1 = configuration.get(category, "Heavenly Glint Apple Effect 1 Time", 1800, "200 = 10 Seconds, 1200 = 1 Minute (Default: 1800)").getInt(1800);
		appleHeavenlyGlintEffectTime2 = configuration.get(category, "Heavenly Glint Apple Effect 2 Time", 1800, "200 = 10 Seconds, 1200 = 1 Minute (Default: 1800)").getInt(1800);

		appleShadowBoronDropChance = configuration.get(category, "Shadow Boron Apple Drop Chance", 0.01, "0.01 = 1%, 1.0 = 100%, etc. (Default: 0.01)").getDouble(0.01);
		appleShadowBoronSaturationAmount = configuration.get(category, "Shadow Boron Apple Saturation Amount", 1, "(Default: 1)").getInt(1);
		appleShadowBoronHungerAmount = configuration.get(category, "Shadow Boron Apple Hunger Amount", 4, "(Default: 4)").getInt(4);
		appleShadowBoronWolvesFavoriteFood = configuration.get(category, "Shadow Boron Apple Wolves Favorite Food", false, "(Default: flase)").getBoolean(false);
		appleShadowBoronEffect1 = configuration.get(category, "Shadow Boron Apple Effect 1", 16, "(Default: 16)").getInt(16);
		appleShadowBoronEffect2 = configuration.get(category, "Shadow Boron Apple Effect 2", 15, "(Default: 15)").getInt(15);
		appleShadowBoronEffectTime1 = configuration.get(category, "Shadow Boron Apple Effect 1 Time", 1800, "200 = 10 Seconds, 1200 = 1 Minute (Default: 1800)").getInt(1800);
		appleShadowBoronEffectTime2 = configuration.get(category, "Shadow Boron Apple Effect 2 Time", 1800, "200 = 10 Seconds, 1200 = 1 Minute (Default: 1800)").getInt(1800);

		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
}