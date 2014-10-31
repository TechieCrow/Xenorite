package gcm.xenorite.armor;

import gcm.xenorite.Xenorite;
import gcm.xenorite.crativetab.CreativeTabArmour;
import gcm.xenorite.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FinoriteArmor extends ItemArmor {

	private String[] armourTypes = new String[] { "helmetfinorite",
			"chestplatefinorite", "leggingsfinorite", "bootsfinorite" };

	public FinoriteArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabArmour.Xenoritearmour);
		this.setMaxStackSize(1);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer entity,
			ItemStack itemstack) {
		if (world.isDaytime()
				&& (itemstack.getItem() == Xenorite.heavenlyglintHelmet)) {
			entity.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(),
					0, 0)));
		} else if (world.isDaytime()
				&& (itemstack.getItem() == Xenorite.heavenlyglintChestplate)) {
			entity.addPotionEffect((new PotionEffect(Potion.digSpeed.getId(),
					0, 0)));
		} else if (world.isDaytime()
				&& (itemstack.getItem() == Xenorite.heavenlyglintLeggings)) {
			entity.addPotionEffect((new PotionEffect(Potion.jump.getId(), 0, 0)));
		} else if (world.isDaytime()
				&& (itemstack.getItem() == Xenorite.heavenlyglintBoots)) {
			entity.addPotionEffect((new PotionEffect(Potion.fireResistance
					.getId(), 0, 0)));

		}
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == Xenorite.finoriteHelmet)
			this.itemIcon = reg.registerIcon("xenorite:helmetFinorite");
		if (this == Xenorite.finoriteChestplate)
			this.itemIcon = reg.registerIcon("xenorite:chestplateFinorite");
		if (this == Xenorite.finoriteLeggings)
			this.itemIcon = reg.registerIcon("xenorite:leggingsFinorite");
		if (this == Xenorite.finoriteBoots)
			this.itemIcon = reg.registerIcon("xenorite:bootsFinorite");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == Xenorite.finoriteHelmet
				|| stack.getItem() == Xenorite.finoriteChestplate
				|| stack.getItem() == Xenorite.finoriteBoots) {
			return Reference.MOD_ID
					+ ":textures/models/armor/finorite_layer_1.png";
		}
		if (stack.getItem() == Xenorite.finoriteLeggings) {
			return Reference.MOD_ID
					+ ":textures/models/armor/finorite_layer_2.png";
		} else {
			return null;
		}
	}

	/*
	 * public void addInformation(ItemStack par1ItemStack, EntityPlayer
	 * par2EntityPlayer, List List, boolean par3) { if
	 * (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) ||
	 * Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) { {
	 * List.add(String.format("§7Some text.")); } } else {
	 * List.add("Hold §l§oSHIFT§r §7for weird description"); } }
	 */
}