package gcm.xenorite.tools;

import gcm.xenorite.crativetab.CreativeTabTools;
import net.minecraft.item.ItemSpade;

public class CoreoriteShovel extends ItemSpade
{
	public CoreoriteShovel(ToolMaterial material)
	{
		super(material);
		this.setCreativeTab(CreativeTabTools.Xenoritetools);
		this.setMaxStackSize(1);
		this.setTextureName("xenorite:shovelCoreorite");
		this.setUnlocalizedName("Coreorite Shove");

	}

	/*
	 * public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3) { if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) { { List.add(String.format("§7Some text.")); } } else { List.add("Hold §l§oSHIFT§r §7for weird description"); } }
	 */

}