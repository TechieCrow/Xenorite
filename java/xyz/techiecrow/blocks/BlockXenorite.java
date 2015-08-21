package xyz.techiecrow.blocks;

import xyz.techiecrow.crativetab.CreativeTabBlocks;
import xyz.techiecrow.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockXenorite extends Block
{
	public BlockXenorite()
	{
		this(Material.iron);
	}

	public BlockXenorite(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabBlocks.Xenoriteblocks);
		this.setStepSound(this.soundTypeStone);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}