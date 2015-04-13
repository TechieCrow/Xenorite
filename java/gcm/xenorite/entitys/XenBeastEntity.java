package gcm.xenorite.entitys;

import gcm.xenorite.init.ModItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class XenBeastEntity extends EntityMob {
	
	World world = null;
	
	public XenBeastEntity(World World) {
		super(World);
		world = World;
		
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(1, new EntityAILookIdle(this));
		
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 2, true));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityZombie.class, 2, false));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.0D, false));
		this.tasks.addTask(1, new EntityAILeapAtTarget(this, 0.8F));
	}

	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity
	 * has recently been hit by a player. @param par2 - Level of Looting used to
	 * kill this mob.
	 */
	/*protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		int j;
		int k;

		j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

		for (k = 0; k < j; ++k) {
			if (this.isBurning()) {
				this.dropItem(Items.baked_potato, 1);
			} else {
				this.dropItem(Items.potato, 1);
			}
		}
	}*/

	protected void dropRareDrop(int par1) {
		this.dropItem(ModItems.xenbeastsoulFragment1, 1);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
	if (this.getEntityAttribute(SharedMonsterAttributes.attackDamage) != null)
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(300.0D);
	}

	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	protected boolean isValidLightLevel()
	{
	    return true;
	}
}