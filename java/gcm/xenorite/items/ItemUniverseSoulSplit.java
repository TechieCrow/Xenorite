package gcm.xenorite.items;

import net.minecraft.item.ItemStack;

public class ItemUniverseSoulSplit extends ItemXenorite
{
	public ItemUniverseSoulSplit()
	{
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("universesoulSplit");
	}

	public boolean hasEffect(ItemStack ItemStack)
	{

		return true;
	}
}