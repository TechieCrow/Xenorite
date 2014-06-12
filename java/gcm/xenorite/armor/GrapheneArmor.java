package gcm.xenorite.armor;
/*package gcm.xenorite.graphene;

import gcm.xenorite.XenoriteMain;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class GrapheneArmor extends ItemArmor {

	private String [] armourTypes = new String [] {"helmetgraphene", "chestplategraphene", "leggingsgraphene", "bootsgraphene"};

	public GrapheneArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(gcm.xenorite.XenoriteMain.XenoriteTab);
		this.setMaxStackSize(1);
	}
		
		
		@Override
	public void registerIcons(IIconRegister reg){
	if(this == XenoriteMain.grapheneHelmet)
		this.itemIcon = reg.registerIcon("xenorite:helmetGraphene");
	if(this == XenoriteMain.grapheneChestplate)
		this.itemIcon = reg.registerIcon("xenorite:chestplateGraphene");
	if(this == XenoriteMain.grapheneLeggings)
		this.itemIcon = reg.registerIcon("xenorite:leggingsGraphene");
	if(this == XenoriteMain.grapheneBoots)
		this.itemIcon = reg.registerIcon("xenorite:bootsGraphene");
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem() == XenoriteMain.grapheneHelmet
				|| stack.getItem() == XenoriteMain.grapheneChestplate
				|| stack.getItem() == XenoriteMain.grapheneBoots) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/graphene_layer_1.png";
		}
		if (stack.getItem() == XenoriteMain.grapheneLeggings) {
			return XenoriteMain.MODID
					+ ":textures/models/armor/graphene_layer_2.png";
		} else {
			return null;
		}
	}
}*/