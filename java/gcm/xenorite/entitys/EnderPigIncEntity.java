package gcm.xenorite.entitys;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EnderPigIncEntity extends EntityEnderman
{

	World world = null;

	public EnderPigIncEntity(World World)
	{
		super(World);
		world = World;
		experienceValue = 5;
		this.isImmuneToFire = true;
	}
}