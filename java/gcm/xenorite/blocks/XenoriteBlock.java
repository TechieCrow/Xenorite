package gcm.xenorite.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class XenoriteBlock extends Block {

	public XenoriteBlock() {
		super(Material.iron);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setStepSound(this.soundTypeStone);
		this.setBlockName("Xenorite Block");
		this.setBlockTextureName("xenorite:xenorite_block");
	}
}