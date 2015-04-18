package gcm.xenorite.entitys;

import gcm.xenorite.Xenorite;
import gcm.xenorite.handler.ConfigurationHandler;
import gcm.xenorite.init.ModItems;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class XenBeastEntity extends EntityMob
{

	World	world	= null;

	public XenBeastEntity(World World)
	{
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

		//attacks EVERYTHING "living".
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityLivingBase.class, 2, false));

		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, 2, true));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
		
		//Attacks players. (players should have a higher priority.)
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 2, false));

		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 2, true));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
	}

	protected void dropRareDrop(int par1)
	{
		this.dropItem(ModItems.xenbeastsoulFragment1, 1);
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

	protected void addRandomArmor()
	{
		if (this.rand.nextFloat() < 0.15F * this.worldObj.func_147462_b(this.posX, this.posY, this.posZ))
		{
			int i = this.rand.nextInt(2);
			float f = this.worldObj.difficultySetting == EnumDifficulty.HARD ? 0.1F : 0.25F;

			if (this.rand.nextFloat() < 0.095F)
			{
				++i;
			}

			if (this.rand.nextFloat() < 0.095F)
			{
				++i;
			}

			if (this.rand.nextFloat() < 0.095F)
			{
				++i;
			}

			for (int j = 3; j >= 0; --j)
			{
				ItemStack itemstack = this.func_130225_q(j);

				if (j < 3 && this.rand.nextFloat() < f)
				{
					break;
				}

				if (itemstack == null)
				{
					Item item = getArmorItemForSlot(j + 1, i);

					if (item != null)
					{
						this.setCurrentItemOrArmor(j + 1, new ItemStack(item));
					}
				}
			}
		}
	}

	public static int getArmorPosition(ItemStack p_82159_0_)
	{
		if (p_82159_0_.getItem() != Item.getItemFromBlock(Blocks.pumpkin) && p_82159_0_.getItem() != Items.skull)
		{
			if (p_82159_0_.getItem() instanceof ItemArmor)
			{
				switch (((ItemArmor) p_82159_0_.getItem()).armorType)
				{
				case 0:
					return 4;
				case 1:
					return 3;
				case 2:
					return 2;
				case 3:
					return 1;
				}
			}

			return 0;
		}
		else
		{
			return 4;
		}
	}

	public static Item getArmorItemForSlot(int p_82161_0_, int p_82161_1_)
	{
		switch (p_82161_0_)
		{
		case 4:
			if (p_82161_1_ == 0)
			{
				return Xenorite.xenoriteHelmet;
			}
			else if (p_82161_1_ == 1)
			{
				return Xenorite.coreoriteHelmet;
			}
			else if (p_82161_1_ == 2)
			{
				return Xenorite.finoriteHelmet;
			}
			else if (p_82161_1_ == 3)
			{
				return Xenorite.heavenlyglintHelmet;
			}
			else if (p_82161_1_ == 4)
			{
				return Xenorite.shadowboronHelmet;
			}
		case 3:
			if (p_82161_1_ == 0)
			{
				return Xenorite.xenoriteChestplate;
			}
			else if (p_82161_1_ == 1)
			{
				return Xenorite.coreoriteChestplate;
			}
			else if (p_82161_1_ == 2)
			{
				return Xenorite.finoriteChestplate;
			}
			else if (p_82161_1_ == 3)
			{
				return Xenorite.heavenlyglintChestplate;
			}
			else if (p_82161_1_ == 4)
			{
				return Xenorite.shadowboronChestplate;
			}
		case 2:
			if (p_82161_1_ == 0)
			{
				return Xenorite.xenoriteLeggings;
			}
			else if (p_82161_1_ == 1)
			{
				return Xenorite.coreoriteLeggings;
			}
			else if (p_82161_1_ == 2)
			{
				return Xenorite.finoriteLeggings;
			}
			else if (p_82161_1_ == 3)
			{
				return Xenorite.heavenlyglintLeggings;
			}
			else if (p_82161_1_ == 4)
			{
				return Xenorite.shadowboronLeggings;
			}
		case 1:
			if (p_82161_1_ == 0)
			{
				return Xenorite.xenoriteBoots;
			}
			else if (p_82161_1_ == 1)
			{
				return Xenorite.coreoriteBoots;
			}
			else if (p_82161_1_ == 2)
			{
				return Xenorite.finoriteBoots;
			}
			else if (p_82161_1_ == 3)
			{
				return Xenorite.heavenlyglintBoots;
			}
			else if (p_82161_1_ == 4)
			{
				return Xenorite.shadowboronBoots;
			}
		default:
			return null;
		}
	}
}