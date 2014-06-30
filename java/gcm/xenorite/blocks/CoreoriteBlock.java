package gcm.xenorite.blocks;

import gcm.xenorite.Xenorite;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CoreoriteBlock extends Block {
	public CoreoriteBlock(){
		super(Material.iron);
		this.setCreativeTab(gcm.xenorite.Xenorite.XenoriteTab);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.625F);
		this.setStepSound(this.soundTypeStone);
		this.setBlockName("Block of Coreorite");
		this.setBlockTextureName("xenorite:coreorite_block");
		
	}
	
}