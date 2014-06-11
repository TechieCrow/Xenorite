package gcm.xenorite.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class XenoriteOre extends Block {
	public static boolean fallInstantly = false;

	public XenoriteOre() {
		super(Material.iron);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setStepSound(this.soundTypeStone);
		this.setBlockName("Xenorite Ore");
		this.setBlockTextureName("xenorite:oreXenorite");
	}

	public void onBlockClicked(World world, int i, int j, int k,
			EntityPlayer entity) {

		entity.attackEntityFrom(DamageSource.generic, 2);
	}

	public void onEntityCollidedWithBlock(World world, int i, int j, int k,
			EntityPlayer entity) {

		entity.attackEntityFrom(DamageSource.generic, 2);

	}

}