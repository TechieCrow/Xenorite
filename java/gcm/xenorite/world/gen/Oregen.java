package gcm.xenorite.world.gen;

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
      
                        //Do different things to generate / not generate in the overworld, the nether and the end
         switch(world.provider.dimensionId) {
         case -1 :
            generateInNether(world,random, chunkX*16, chunkZ*16);
            break;
         case 0 :
            generateInOverworld(world,random, chunkX*16, chunkZ*16);
            break;
         case 1 :
            generateInEnd(world,random, chunkX*16, chunkZ*16);
            break;
         
         }
      
   }

   public void generateInEnd(World world, Random random, int x, int y)
   {
      //Since we don't want it in the end, this is empty
      
   }

   public void generateInOverworld(World world, Random random, int x, int z)
   {
      for(int i=0; i<6; i++) { //The number after i (in this case 6) is how many veins spawn per chunk (16*16*16 area)
         int xcoord = x + random.nextInt(16); //Sets random coords for the x axis
         int ycoord =  random.nextInt(40); //Sets random coords for the y axis
         int zcoord = z + random.nextInt(16); //Sets random coords for the z axis 
         new WorldGenMinable(gcm.xenorite.init.ModBlockOres.xenoriteOre, 5).generate(world, random, xcoord, ycoord, zcoord); //Generates it (the number in the World Gen Minable function (in this case 15) is the max amount of blocks in each vein).
         new WorldGenMinable(gcm.xenorite.init.ModBlockOres.coreoriteOre, 5).generate(world, random, xcoord, ycoord, zcoord);
         new WorldGenMinable(gcm.xenorite.init.ModBlockOres.finoriteOre, 5).generate(world, random, xcoord, ycoord, zcoord);
         new WorldGenMinable(gcm.xenorite.init.ModBlockOres.HeavenlyGlintOre, 5).generate(world, random, xcoord, ycoord, zcoord);
         //System.out.println("Spawned at: " + world + " " + xcoord + " " + ycoord + " " + zcoord);
         
      }
      
   }

   public void generateInNether(World world, Random random, int x, int y)
   {
	  for(int i=0; i<6; i++) { //The number after i (in this case 6) is how many veins spawn per chunk (16*16*16 area)
		  int xcoord = x + random.nextInt(16); //Sets random coords for the x axis
		  int ycoord =  random.nextInt(256); //Sets random coords for the y axis
		  int zcoord = y + random.nextInt(16); //Sets random coords for the z axis
		  new NetherGenMinable(gcm.xenorite.init.ModBlockOres.ShadowBoronOre, 5).generate(world, random, xcoord, ycoord, zcoord);
		  //System.out.println("Spawned at: " + world + " " + xcoord + " " + ycoord + " " + zcoord);
   }
   }
}

//this.addOreSpawn(gcm.xenorite.init.ModBlockOres.xenoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
//this.addOreSpawn(gcm.xenorite.init.ModBlockOres.coreoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
//this.addOreSpawn(gcm.xenorite.init.ModBlockOres.finoriteOre, world, random, chunkX, chunkZ, 2, 6, 5, 1, 40);
//this.addOreSpawn(gcm.xenorite.init.ModBlockOres.HeavenlyGlintOre, world, random, chunkX, chunkZ, 2, 6, 2, 1, 15);
//this.addOreSpawn(gcm.xenorite.init.ModBlockOres.ShadowBoronOre, world, random, chunkX, chunkZ, 2, 6, 2, 1, 15);