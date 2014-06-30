package gcm.xenorite;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import scala.tools.nsc.settings.AdvancedScalaSettings.X;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case 0: generateSurface(random, chunkX*16, chunkZ*16, world); break;
            case 1: generateEnd(random, chunkX*16, chunkZ*16, world); break;
            case -1: generateNether(random, chunkX*16, chunkZ*16, world); break;
            default:;
        }
    }

	 public void generateSurface(Random random, int chunkX, int chunkZ, World world)
	    {
         addOreSpawn(Xenorite.xenoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
		 addOreSpawn(Xenorite.coreoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
         addOreSpawn(Xenorite.finoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
	    }

	    public void generateEnd(Random random, int chunkX, int chunkZ, World world)
	    {
	        //Add End Generation
	    }

	    public void generateNether(Random random, int chunkX, int chunkZ, World world)
	    {
	        //Add Nether Generation
	    }

	/**
	 * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with
	 * this method in your Generation method in your IWorldGeneration extending
	 * Class
	 *
	 * @param The
	 *            Block to spawn
	 * @param The
	 *            World to spawn in
	 * @param A
	 *            Random object for retrieving random positions within the world
	 *            to spawn the Block
	 * @param An
	 *            int for passing the X-Coordinate for the Generation method
	 * @param An
	 *            int for passing the Z-Coordinate for the Generation method
	 * @param An
	 *            int for setting the maximum X-Coordinate values for spawning
	 *            on the X-Axis on a Per-Chunk basis
	 * @param An
	 *            int for setting the maximum Z-Coordinate values for spawning
	 *            on the Z-Axis on a Per-Chunk basis
	 * @param An
	 *            int for setting the maximum size of a vein
	 * @param An
	 *            int for the Number of chances available for the Block to spawn
	 *            per-chunk
	 * @param An
	 *            int for the minimum Y-Coordinate height at which this block
	 *            may spawn
	 * @param An
	 *            int for the maximum Y-Coordinate height at which this block
	 *            may spawn
	 **/
	    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY )
	    {
	        for(int i = 0; i<chancesToSpawn; i++)
	        {
	            int posX = blockXPos + random.nextInt(16);
	            int posY = minY + random.nextInt(maxY - minY);
	            int posZ = blockZPos + random.nextInt(16);
	            new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone).generate(world, random, posX, posY, posZ);
	        }
	    }
}