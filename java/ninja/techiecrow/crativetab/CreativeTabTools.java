package ninja.techiecrow.crativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import ninja.techiecrow.init.ModPickaxes;
import ninja.techiecrow.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabTools
{
	public static final CreativeTabs Xenoritetools = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModPickaxes.xenoritePickaxe;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return StatCollector.translateToLocal("key.categories.xenoritetools");
		}
	};
}