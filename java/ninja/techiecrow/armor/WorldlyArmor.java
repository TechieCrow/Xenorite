package ninja.techiecrow.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ninja.techiecrow.Xenorite;
import ninja.techiecrow.crativetab.CreativeTabArmour;
import ninja.techiecrow.reference.Reference;

public class WorldlyArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetWorldly", "chestplateWorldly", "leggingsWorldly", "bootsWorldly" };

	public WorldlyArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.worldlyHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetWorldly");
		if (this == Xenorite.worldlyChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateWorldly");
		if (this == Xenorite.worldlyLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsWorldly");
		if (this == Xenorite.worldlyBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsWorldly");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.worldlyHelmet || stack.getItem() == Xenorite.worldlyChestplate || stack.getItem() == Xenorite.worldlyBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/worldly_layer_1.png";
		}
		if (stack.getItem() == Xenorite.worldlyLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/worldly_layer_2.png";
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