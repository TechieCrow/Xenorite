package ninja.techiecrow.blocks;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import ninja.techiecrow.Xenorite;

public class BlockXenoriteOre extends BlockOresXenorite
{
	public BlockXenoriteOre()
	{
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setBlockName("xenoriteOre");
		this.setHarvestLevel("pickaxe", 2);
	}

	public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entity)
	{

		entity.attackEntityFrom(DamageSource.generic, 2);
	}

	public void onEntityCollidedWithBlock(World world, int i, int j, int k, EntityPlayer entity)
	{

		entity.attackEntityFrom(DamageSource.generic, 2);

	}

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{

		for (int l = 0; l < 2; ++l)
		{
			double d0 = (double) ((float) par2 + par5Random.nextFloat());
			double d1 = (double) ((float) par3 + par5Random.nextFloat());
			double d2 = (double) ((float) par4 + par5Random.nextFloat());
			double d3 = 0.0D;
			double d4 = 0.0D;
			double d5 = 0.0D;
			int i1 = par5Random.nextInt(2) * 2 - 1;
			d3 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
			d4 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
			d5 = ((double) par5Random.nextFloat() - 0.5D) * 0.5D;
			par1World.spawnParticle("fireworksSpark", d0, d1, d2, d3, d4, d5);
		}
	}

}