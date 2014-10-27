package gcm.xenorite.blocks;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import gcm.xenorite.crativetab.CreativeTabItems;

public class BlockXenoriteBlock extends BlockXenorite
{
	public BlockXenoriteBlock() {
	super();
	this.setHardness(3.0F);
	this.setResistance(5.0F);
	this.setLightLevel(0.625F);
	this.setBlockName("xenoriteBlock");
	}

}