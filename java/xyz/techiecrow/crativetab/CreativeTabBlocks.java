package xyz.techiecrow.crativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import xyz.techiecrow.init.ModBlocks;
import xyz.techiecrow.reference.Reference;

public class CreativeTabBlocks
{
	public static final CreativeTabs Xenoriteblocks = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ModBlocks.xenoriteBlock);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return StatCollector.translateToLocal("key.categories.xenoriteblocks");
		}
	};
}