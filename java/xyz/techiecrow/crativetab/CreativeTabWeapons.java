package xyz.techiecrow.crativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import xyz.techiecrow.init.ModWeapons;
import xyz.techiecrow.reference.Reference;

public class CreativeTabWeapons
{
	public static final CreativeTabs Xenoriteweapons = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModWeapons.xenoriteSword;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return StatCollector.translateToLocal("key.categories.xenoriteweapons");
		}
	};
}