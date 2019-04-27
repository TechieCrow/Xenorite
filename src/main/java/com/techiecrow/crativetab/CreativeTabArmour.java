package com.techiecrow.crativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import com.techiecrow.Xenorite;
import com.techiecrow.reference.Reference;

public class CreativeTabArmour
{
	public static final CreativeTabs Xenoritearmour = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Xenorite.xenoriteChestplate;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return StatCollector.translateToLocal("key.categories.xenoritearmour");
		}
	};
}