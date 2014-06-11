package gcm.xenorite.blocks;

import gcm.xenorite.XenoriteMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FinoriteBlock extends Block {
	public FinoriteBlock(){
		super(Material.iron);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setStepSound(this.soundTypeStone);
		this.setBlockName("Block of Finorite");
		this.setBlockTextureName("xenorite:finorite_block");
		
	}
	
}