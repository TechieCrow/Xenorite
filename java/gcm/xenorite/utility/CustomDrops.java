package gcm.xenorite.utility;

import gcm.xenorite.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
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
				if (rand < 0.05D) // Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.)
				{
					event.entityLiving.dropItem(ModItems.universesoulSplit, 1);
				}
			}
		}
	}
}