package gcm.xenorite.utility;

import gcm.xenorite.handler.ConfigurationHandler;
import gcm.xenorite.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomDrops
{
	public static double	rand;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		if (event.source.getDamageType().equals("player")) // Checks for Damage Type.
		{
			rand = Math.random();
			if (event.entityLiving instanceof EntityLivingBase)
			{
				if (rand < ConfigurationHandler.universesoulSplitDropChance) // Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.)
				{
					event.entityLiving.dropItem(ModItems.universesoulSplit, ConfigurationHandler.universesoulSplitDrop);
				}
			}
		}
	}

	@SubscribeEvent
	public void onDrops(BlockEvent.HarvestDropsEvent event)
	{
		rand = Math.random();
		{
			if (rand < ConfigurationHandler.appleHeavenlyGlintDropChance)
				if (event.block == Blocks.leaves)
					event.drops.add(new ItemStack(ModItems.appleHeavenlyGlint));
		}
	}
}