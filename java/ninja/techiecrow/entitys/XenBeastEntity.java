package ninja.techiecrow.entitys;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ninja.techiecrow.handler.ConfigurationHandler;
import ninja.techiecrow.init.ModItems;

public class XenBeastEntity extends EntityMob
{

	World world = null;

	public XenBeastEntity(World World)
	{
		super(World);
		world = World;
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(6, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.tasks.addTask(2, new EntityAILeapAtTarget(this, 0.8F));
		this.tasks.addTask(1, new EntityAIOpenDoor(this, true));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));

		// attacks EVERYTHING "living".
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityLivingBase.class, 2, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, 2, true));

		// Attacks players. (players should have a higher priority.)
		this.tasks.addTask(100, new EntityAIAttackOnCollide(this, EntityPlayer.class, 2, false));
		this.targetTasks.addTask(100, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 2, true));
	}

	protected void dropRareDrop(int par1)
	{
		this.dropItem(ModItems.xenbeastsoulFragment1, ConfigurationHandler.xenbeastSoulFragmentDrop);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(ConfigurationHandler.xenbeastHealth);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(ConfigurationHandler.xenbeastknockbackResistance);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(ConfigurationHandler.xenbeastSpeed);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(ConfigurationHandler.xenbeastFollowRange);
		if (this.getEntityAttribute(SharedMonsterAttributes.attackDamage) != null)
			this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(ConfigurationHandler.xenbeastDamage);
	}

	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected boolean isValidLightLevel()
	{
		return true;
	}

	protected String getLivingSound()
	{
		return "xenorite:xenbeast.idle";
	}

	protected String getHurtSound()
	{
		return "xenorite:xenbeast.hurt";
	}

	protected String getDeathSound()
	{
		return "xenorite:xenbeast.death";
	}
}