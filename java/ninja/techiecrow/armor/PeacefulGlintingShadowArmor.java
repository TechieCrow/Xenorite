package ninja.techiecrow.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ninja.techiecrow.Xenorite;
import ninja.techiecrow.crativetab.CreativeTabArmour;
import ninja.techiecrow.reference.Reference;

public class PeacefulGlintingShadowArmor extends ItemArmor
{

	private String[] armourTypes = new String[]
	{ "helmetPeacefulGlintingShadow", "chestplatePeacefulGlintingShadow", "leggingsPeacefulGlintingShadow", "bootsPeacefulGlintingShadow" };

	public PeacefulGlintingShadowArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == Xenorite.peacefulGlintingShadowHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetPeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplatePeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsPeacefulGlintingShadow");
		if (this == Xenorite.peacefulGlintingShadowBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsPeacefulGlintingShadow");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == Xenorite.peacefulGlintingShadowHelmet || stack.getItem() == Xenorite.peacefulGlintingShadowChestplate || stack.getItem() == Xenorite.peacefulGlintingShadowBoots)
		{
			return Reference.MOD_ID + ":textures/models/armor/peacefulGlintingShadow_layer_1.png";
		}
		if (stack.getItem() == Xenorite.peacefulGlintingShadowLeggings)
		{
			return Reference.MOD_ID + ":textures/models/armor/peacefulGlintingShadow_layer_2.png";
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