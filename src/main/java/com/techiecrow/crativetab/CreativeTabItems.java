package com.techiecrow.crativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import com.techiecrow.init.ModItems;
import com.techiecrow.reference.Reference;

public class CreativeTabItems
{
	public static final CreativeTabs Xenoriteitems = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.xenoriteIngot;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return StatCollector.translateToLocal("key.categories.xenoriteitems");
		}
	};
}