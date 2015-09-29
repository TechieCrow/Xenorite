package xyz.techiecrow.renderers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class XenBeastModel extends ModelBase
{
	ModelRenderer lefteye;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer righteye;
	ModelRenderer leftpupil;
	ModelRenderer rightpupil;
	ModelRenderer nose;

	public XenBeastModel()
	{
		textureWidth = 512;
		textureHeight = 512;

		lefteye = new ModelRenderer(this, 0, 0);
		lefteye.addBox(-1F, -1F, -1F, 2, 2, 2);
		lefteye.setRotationPoint(-2F, 9F, -3.5F);
		lefteye.setTextureSize(512, 512);
		lefteye.mirror = true;
		setRotation(lefteye, 0F, 0F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, 15F, 0F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-2F, 0F, -1F, 4, 6, 2);
		body.setRotationPoint(0F, 15F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-1F, 0F, -0.5F, 1, 3, 1);
		rightarm.setRotationPoint(-2F, 15F, 0F);
		rightarm.setTextureSize(64, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(0F, 0F, -0.5F, 1, 3, 1);
		leftarm.setRotationPoint(2F, 15F, 0F);
		leftarm.setTextureSize(64, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		rightleg.setRotationPoint(-1F, 21F, 0F);
		rightleg.setTextureSize(64, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leftleg.setRotationPoint(1F, 21F, 0F);
		leftleg.setTextureSize(64, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		righteye = new ModelRenderer(this, 0, 0);
		righteye.addBox(-1F, -1F, -1F, 2, 2, 2);
		righteye.setRotationPoint(2F, 9F, -3.5F);
		righteye.setTextureSize(512, 512);
		righteye.mirror = true;
		setRotation(righteye, 0F, 0F, 0F);
		leftpupil = new ModelRenderer(this, 0, 0);
		leftpupil.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		leftpupil.setRotationPoint(-2F, 9F, -4.25F);
		leftpupil.setTextureSize(512, 512);
		leftpupil.mirror = true;
		setRotation(leftpupil, 0F, 0F, 0F);
		rightpupil = new ModelRenderer(this, 0, 0);
		rightpupil.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		rightpupil.setRotationPoint(2F, 9F, -4.25F);
		rightpupil.setTextureSize(512, 512);
		rightpupil.mirror = true;
		setRotation(rightpupil, 0F, 0F, 0F);
		nose = new ModelRenderer(this, 0, 0);
		nose.addBox(-0.5F, 0.5F, -0.5F, 1, 1, 1);
		nose.setRotationPoint(0F, 9F, -4F);
		nose.setTextureSize(512, 512);
		nose.mirror = true;
		setRotation(nose, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		lefteye.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		righteye.render(f5);
		leftpupil.render(f5);
		rightpupil.render(f5);
		nose.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
	}

}
