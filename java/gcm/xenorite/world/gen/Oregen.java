package gcm.xenorite.world.gen;

import gcm.xenorite.handler.ConfigurationHandler;
import gcm.xenorite.world.gen.feature.NetherGenMinable;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class Oregen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{

		switch (world.provider.dimensionId)
		{
		case -1:
			generateInNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateInEnd(world, random, chunkX * 16, chunkZ * 16);
			break;

		}

	}

	public void generateInEnd(World world, Random random, int x, int y)
	{
		//The End oregen. - Empty for now, nothing to add to it.

	}

	public void generateInOverworld(World world, Random random, int x, int z)
	{
		for (int i = 0; i < 1; i++) //The number after i (in this case 6) is how many veins spawn per chunk (16*16*16 area)
		{
			//DO NOT CHANGE
			int xcoord = x + random.nextInt(16); //DO NOT CHANGE
			int ycoord = random.nextInt(ConfigurationHandler.oreXenoriteSpawnHeight); //Set In The Config file (ore spawn height)
			int zcoord = z + random.nextInt(16); //DO NOT CHANGE
			//Generates it (the number in the World Gen Minable function (in this case 5) is the max amount of blocks in each vein).
			new WorldGenMinable(gcm.xenorite.init.ModBlockOres.xenoriteOre, ConfigurationHandler.oreXenoriteSpawnsPerVein).generate(world, random, xcoord, ycoord, zcoord);
			
			int x1coord = x + random.nextInt(16);
			int y1coord = random.nextInt(ConfigurationHandler.oreCoreoriteSpawnHeight);
			int z1coord = z + random.nextInt(16);
			new WorldGenMinable(gcm.xenorite.init.ModBlockOres.coreoriteOre, ConfigurationHandler.oreCoreoriteSpawnsPerVein).generate(world, random, xcoord, ycoord, zcoord);
			
			int x2coord = x + random.nextInt(16);
			int y2coord = random.nextInt(ConfigurationHandler.oreFinoriteSpawnHeight);
			int z2coord = z + random.nextInt(16);
			new WorldGenMinable(gcm.xenorite.init.ModBlockOres.finoriteOre, ConfigurationHandler.oreFinoriteSpawnsPerVein).generate(world, random, xcoord, ycoord, zcoord);
			// System.out.println("Spawned at: " + world + " " + xcoord + " " + ycoord + " " + zcoord);

		}
	}

	public void generateInNether(World world, Random random, int x, int y)
	{
		for (int i = 0; i < 1; i++)
		{
			int xcoord = x + random.nextInt(16);
			int ycoord = random.nextInt(256);
			int zcoord = y + random.nextInt(16);
			
			new NetherGenMinable(gcm.xenorite.init.ModBlockOres.ShadowBoronOre, 5).generate(world, random, xcoord, ycoord, zcoord);
			new NetherGenMinable(gcm.xenorite.init.ModBlockOres.HeavenlyGlintOre, 5).generate(world, random, xcoord, ycoord, zcoord);
			// System.out.println("Spawned at: " + world + " " + xcoord + " " + ycoord + " " + zcoord);
		}
	}
}