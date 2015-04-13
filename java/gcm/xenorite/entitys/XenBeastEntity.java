package gcm.xenorite.entitys;

import gcm.xenorite.Xenorite;
import gcm.xenorite.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIDoorInteract;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class XenBeastEntity extends EntityMob {
	
	World world = null;
	
	public XenBeastEntity(World World) {
		super(World);
		world = World;
		addRandomArmor();
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(1, new EntityAILookIdle(this));
		this.tasks.addTask(1, new EntityAILeapAtTarget(this, 0.8F));
		this.tasks.addTask(1, new EntityAIOpenDoor(this, false));
		
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityLivingBase.class, 2, false));
		
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, 2, true));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
	}
	
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

/*protected void addRandomArmor(){
this.setCurrentItemOrArmor(0, new ItemStack(Xenorite.xenoriteSword));
this.setCurrentItemOrArmor(0, new ItemStack(Xenorite.coreoriteSword));
this.setCurrentItemOrArmor(0, new ItemStack(Xenorite.finoriteSword));
this.setCurrentItemOrArmor(0, new ItemStack(Xenorite.heavenlyglintSword));
this.setCurrentItemOrArmor(0, new ItemStack(Xenorite.shadowboronSword));
this.setCurrentItemOrArmor(4, new ItemStack(Xenorite.xenorite_helmet));
this.setCurrentItemOrArmor(4, new ItemStack(Xenorite.coreoriteHelmet));
this.setCurrentItemOrArmor(4, new ItemStack(Xenorite.finoriteHelmet));
this.setCurrentItemOrArmor(4, new ItemStack(Xenorite.heavenlyglintHelmet));
this.setCurrentItemOrArmor(4, new ItemStack(Xenorite.shadowboronHelmet));
this.setCurrentItemOrArmor(3, new ItemStack(Xenorite.xenorite_chestplate));
this.setCurrentItemOrArmor(3, new ItemStack(Xenorite.coreoriteChestplate));
this.setCurrentItemOrArmor(3, new ItemStack(Xenorite.finoriteChestplate));
this.setCurrentItemOrArmor(3, new ItemStack(Xenorite.heavenlyglintChestplate));
this.setCurrentItemOrArmor(3, new ItemStack(Xenorite.shadowboronChestplate));
this.setCurrentItemOrArmor(2, new ItemStack(Xenorite.xenorite_leggings));
this.setCurrentItemOrArmor(2, new ItemStack(Xenorite.coreoriteLeggings));
this.setCurrentItemOrArmor(2, new ItemStack(Xenorite.finoriteLeggings));
this.setCurrentItemOrArmor(2, new ItemStack(Xenorite.heavenlyglintLeggings));
this.setCurrentItemOrArmor(2, new ItemStack(Xenorite.shadowboronLeggings));
this.setCurrentItemOrArmor(1, new ItemStack(Xenorite.xenorite_boots));
this.setCurrentItemOrArmor(1, new ItemStack(Xenorite.coreoriteBoots));
this.setCurrentItemOrArmor(1, new ItemStack(Xenorite.finoriteBoots));
this.setCurrentItemOrArmor(1, new ItemStack(Xenorite.heavenlyglintBoots));
this.setCurrentItemOrArmor(1, new ItemStack(Xenorite.shadowboronBoots));

}*/

	protected void dropRareDrop(int par1) {
		this.dropItem(ModItems.xenbeastsoulFragment1, 1);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.28D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
	if (this.getEntityAttribute(SharedMonsterAttributes.attackDamage) != null)
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
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