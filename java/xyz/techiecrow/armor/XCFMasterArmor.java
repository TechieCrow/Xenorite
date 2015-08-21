package xyz.techiecrow.armor;
//package ninja.techiecrow.armor;
//
//import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.entity.Entity;
//import net.minecraft.item.ItemArmor;
//import net.minecraft.item.ItemStack;
//import ninja.techiecrow.Xenorite;
//import ninja.techiecrow.crativetab.CreativeTabArmour;
//import ninja.techiecrow.reference.Reference;
//
//public class XCFMasterArmor extends ItemArmor
//{
//
//	private String[] armourTypes = new String[]
//	{ "helmetXCFMaster", "chestplateXCFMaster", "leggingsXCFMaster", "bootsXCFMaster" };
//
//	public XCFMasterArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType)
//	{
//		super(armorMaterial, renderIndex, armorType);
//		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
//		this.setMaxStackSize(1);
//	}
//
//	@Override
//	public void registerIcons(IIconRegister reg)
//	{
//		if (this == Xenorite.xcfMasterHelmet)
//			this.itemIcon = reg.registerIcon("xenorite:helmetXCFMaster");
//		if (this == Xenorite.xcfMasterChestplate)
//			this.itemIcon = reg.registerIcon("xenorite:chestplateXCFMaster");
//		if (this == Xenorite.xcfMasterLeggings)
//			this.itemIcon = reg.registerIcon("xenorite:leggingsXCFMaster");
//		if (this == Xenorite.xcfMasterBoots)
//			this.itemIcon = reg.registerIcon("xenorite:bootsXCFMaster");
//	}
//
//	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
//	{
//		if (stack.getItem() == Xenorite.xcfMasterHelmet || stack.getItem() == Xenorite.xcfMasterChestplate || stack.getItem() == Xenorite.xcfMasterBoots)
//		{
//			return Reference.MOD_ID + ":textures/models/armor/xcfMaster_layer_1.png";
//		}
//		if (stack.getItem() == Xenorite.xcfMasterLeggings)
//		{
//			return Reference.MOD_ID + ":textures/models/armor/xcfMaster_layer_2.png";
//		}
//		else
//		{
//			return null;
//		}
//	}
//
//	/*
//	 * public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List List, boolean par3) { if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) { { List.add(String.format("§7Some text.")); } } else { List.add("Hold §l§oSHIFT§r §7for weird description"); } }
//	 */
//
//}