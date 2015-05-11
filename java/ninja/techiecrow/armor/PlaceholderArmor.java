package ninja.techiecrow.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ninja.techiecrow.Xenorite;
import ninja.techiecrow.crativetab.CreativeTabArmour;
import ninja.techiecrow.reference.Reference;

public class PlaceholderArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetPlaceholder", "chestplatePlaceholder", "leggingsPlaceholder", "bootsPlaceholder" };

	public PlaceholderArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.placeholderHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetPlaceholder");
		if (this == Xenorite.placeholderChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplatePlaceholder");
		if (this == Xenorite.placeholderLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsPlaceholder");
		if (this == Xenorite.placeholderBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsPlaceholder");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.placeholderHelmet || stack.getItem() == Xenorite.placeholderChestplate || stack.getItem() == Xenorite.placeholderBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/placeholder_layer_1.png";
		}
		if (stack.getItem() == Xenorite.placeholderLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/placeholder_layer_2.png";
		}
		else
		{
			return null;
		}
	}

	/*
	 * public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3) { if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) { { List.add(String.format("§7Some text.")); } } else { List.add("Hold §l§oSHIFT§r §7for weird description"); } }
	 */

}