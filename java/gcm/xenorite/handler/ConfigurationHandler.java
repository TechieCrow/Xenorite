package gcm.xenorite.handler;

import gcm.xenorite.reference.Reference;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{
    public static Configuration configuration;
    
    //TO-DO LIST
    //Move default values to a separate class for easier readability.
    //Add things like block hardness, resistance, light levels and tool materials. (how fast tools can break blocks, etc)
    
    //Overworld Ore Spawn Height Values.
    public static int oreXenoriteSpawnHeight = 20;
    public static int oreCoreoriteSpawnHeight = 20;
    public static int oreFinoriteSpawnHeight = 20;
    
    //Nether Ore Spawn Height Values.
    public static int oreHeavenlyGlintSpawnHeight = 256;
    public static int oreShadowBoronSpawnHeight = 256;
    
    //Overworld Ore Spawns Per Vein Values.
    public static int oreXenoriteSpawnsPerVein = 5;
    public static int oreCoreoriteSpawnsPerVein = 5;
    public static int oreFinoriteSpawnsPerVein = 5;
    
    //Nether Ore Spawns Per Vein Values.
    public static int oreHeavenlyGlintSpawnsPerVein = 5;
    public static int oreShadowBoronSpawnsPerVein = 5;
    
    //Overworld Ore Effect Values.
    
    //Nether Ore effect Values.
    public static int oreHeavenlyGlintEffect1 = 5;
    public static int oreHeavenlyGlintEffect2 = 3;
    public static int oreHeavenlyGlintEffect3 = 1;
    public static int oreHeavenlyGlintEffect4 = 13;
    public static int oreHeavenlyGlintEffect5 = 12;
    public static int oreHeavenlyGlintEffect6 = 8;
    
    public static int oreShadowBoronEffect1 = 5;
    public static int oreShadowBoronEffect2 = 3;
    public static int oreShadowBoronEffect3 = 1;
    public static int oreShadowBoronEffect4 = 13;
    public static int oreShadowBoronEffect5 = 12;
    public static int oreShadowBoronEffect6 = 8;
    
    public static int swordHeavenlyGlintEffect1 = 5;
    public static int swordShadowBoronEffect1 = 5;
    
    public static int pickaxeHeavenlyGlintEffect1 = 3;
    public static int pickaxeShadowBoronEffect1 = 3;
    
    //Custom config category.. I think.
    //Ore Spawns
    public static String overworldorespawns = "Overworld Ore Spawns";
    public static String netherorespawns = "Nether Ore Spawns";
    
    //Ore Effects
    public static String overworldoreeffects = "Overworld Ore Effects";
    public static String netheroreeffects = "Nether Ore Effects";
    
    //Sword Effects
    public static String overworldswordeffects = "Overworld Sword Effects";
    public static String netherswordeffects = "Nether Sword Effects";
    
    //Pickaxe Effects
    public static String overworldpickaxeeffects = "Overworld Pickaxe Effects";
    public static String netherpickaxeeffects = "Nether Pickaxe Effects";
    
    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
    	//Overworld Ore Spawn Height
    	oreXenoriteSpawnHeight = configuration.get("1) Overworld Ores Spawns", "Max Xenorite Ore Spawn Height", 20).getInt();
    	oreCoreoriteSpawnHeight = configuration.get("1) Overworld Ores Spawns", "Max Coreorite Ore Spawn Height", 20).getInt();
    	oreFinoriteSpawnHeight = configuration.get("1) Overworld Ores Spawns", "Max Finorite Ore Spawn Height", 20).getInt();
    	
    	//Nether Ore Spawn Height
    	oreHeavenlyGlintSpawnHeight = configuration.get("2) Nether Ores Spawns", "Max Heavenly Glint Ore Spawn Height", 256).getInt();
    	oreShadowBoronSpawnHeight = configuration.get("2) Nether Ores Spawns", "Max Shadow Boron Ore Spawn Height", 256).getInt();
    	
    	//Overworld Ore Sapwns Per Vein
    	oreXenoriteSpawnsPerVein = configuration.get("1) Overworld Ores Spawns", "Max Xenorite Ore Spawns Per Vein", 5).getInt();
    	oreCoreoriteSpawnsPerVein = configuration.get("1) Overworld Ores Spawns", "Max Coreorite Ore Spawns Per Vein", 5).getInt();
    	oreFinoriteSpawnsPerVein = configuration.get("1) Overworld Ores Spawns", "Max Finorite Ore Spawns Per Vein", 5).getInt();
    	
    	//Nether Sapwns Per Vein
    	oreHeavenlyGlintSpawnsPerVein = configuration.get("2) Nether Ores Spawns", "Max Heavenly Glint Ore Spawns Per Vein", 5).getInt();
    	oreShadowBoronSpawnsPerVein = configuration.get("2) Nether Ores Spawns", "Max Shadow Boron Ore Spawns Per Vein", 5).getInt();
    	
    	//Overworld Ore Effects
    	//Empty For now
    	
    	//Nether Ore Effects
    	//Heavenly Glint Ore Effects
    	oreHeavenlyGlintEffect1 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 1", 5).getInt();
    	oreHeavenlyGlintEffect2 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 2", 3).getInt();
    	oreHeavenlyGlintEffect3 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 3", 1).getInt();
    	oreHeavenlyGlintEffect4 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 4", 13).getInt();
    	oreHeavenlyGlintEffect5 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 5", 12).getInt();
    	oreHeavenlyGlintEffect6 = configuration.get("4) Nether Ore Effects", "Heavenly Glint Ore Effect ID 6", 8).getInt();
    	
    	//Shadow Boron Ore Effects
    	oreShadowBoronEffect1 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 1", 5).getInt();
    	oreShadowBoronEffect2 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 2", 3).getInt();
    	oreShadowBoronEffect3 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 3", 1).getInt();
    	oreShadowBoronEffect4 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 4", 13).getInt();
    	oreShadowBoronEffect5 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 5", 12).getInt();
    	oreShadowBoronEffect6 = configuration.get("4) Nether Ore Effects", "Shadow Boron Ore Effect ID 6", 8).getInt();
    	
    	//Heavenly Glint Sword Effects
    	swordHeavenlyGlintEffect1 = configuration.get("6) Nether Sword Effects", "Heavenly Glint Sword Effect ID 6", 5).getInt();
    	
    	//Shadow Boron Sword Effects
    	swordShadowBoronEffect1 = configuration.get("6) Nether Sword Effects", "Shadow Boron Sword Effect ID 6", 5).getInt();
    	
    	//Heavenly Glint Pickaxe Effects
    	pickaxeHeavenlyGlintEffect1 = configuration.get("8) Nether Pickaxe Effects", "Heavenly Glint Pickaxe Effect ID 6", 3).getInt();
    	
    	//Shadow Boron Pickaxe Effects
    	pickaxeShadowBoronEffect1 = configuration.get("8) Nether Pickaxe Effects", "Shadow Boron Pickaxe Effect ID 6", 3).getInt();
    	
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