package deob;

import jaggl.OpenGL;

public class Class61_Sub2 extends Class61 {

	public int anInt9317 = 0;

	public boolean aBoolean9314 = false;

	public int anInt9322 = 0;

	public int anInt9320 = 0;

	public int anInt9321 = 0;

	public int anInt9318 = 0;

	public Class_ra_Sub1 aClass_ra_Sub1_9315;

	public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_9319;

	public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_9316;

	public Class61_Sub2(Class_ra_Sub1 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.aClass_ra_Sub1_9315 = arg0;
		this.aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method524(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	public Class61_Sub2(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4) {
		this.aClass_ra_Sub1_9315 = arg0;
		this.aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method527(arg0, arg1, arg2, arg3, arg4);
	}

	public Class61_Sub2(Class_ra_Sub1 arg0, int arg1, int arg2, boolean arg3) {
		this.aClass_ra_Sub1_9315 = arg0;
		this.aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method525(arg0, arg3 ? Class72.aClass72_620 : Class72.aClass72_614, Class86.aClass86_714, arg1, arg2);
	}

	public void method680(int[] arg0) {
		arg0[0] = this.anInt9320;
		arg0[1] = this.anInt9322;
		arg0[2] = this.anInt9318;
		arg0[3] = this.anInt9321;
	}

	public void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass36_Sub1_Sub1_9319.method515((arg7 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9314) {
			float var9 = (float) arg2 / (float) this.method318();
			float var10 = (float) arg3 / (float) this.method683();
			float var11 = (float) arg0 + (float) this.anInt9320 * var9;
			float var12 = (float) arg1 + (float) this.anInt9322 * var10;
			float var13 = var11 + (float) this.aClass36_Sub1_Sub1_9319.anInt9363 * var9;
			float var14 = var12 + (float) this.aClass36_Sub1_Sub1_9319.anInt9360 * var10;
			if (this.aClass36_Sub1_Sub1_9316 == null) {
				this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
				this.aClass_ra_Sub1_9315.method4836(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method740(arg4);
				this.aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method741();
			}
		} else if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method740(arg4);
			this.aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method741();
		}
	}

	public void method717(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9320 = arg0;
		this.anInt9322 = arg1;
		this.anInt9318 = arg2;
		this.anInt9321 = arg3;
		this.aBoolean9314 = this.anInt9320 != 0 || this.anInt9322 != 0 || this.anInt9318 != 0 || this.anInt9321 != 0;
	}

	public void method701(int arg0, int arg1, int arg2, int arg3) {
		this.anInt9320 = arg0;
		this.anInt9322 = arg1;
		this.anInt9318 = arg2;
		this.anInt9321 = arg3;
		this.aBoolean9314 = this.anInt9320 != 0 || this.anInt9322 != 0 || this.anInt9318 != 0 || this.anInt9321 != 0;
	}

	public int method318() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363 + this.anInt9320 + this.anInt9318;
	}

	public int method682() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360;
	}

	public int method683() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360 + this.anInt9322 + this.anInt9321;
	}

	public void method703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		Class36_Sub1_Sub1 var11 = ((Class_ta_Sub2) arg7).aClass36_Sub1_Sub1_8660;
		float var12;
		float var13;
		float var14;
		float var15;
		if (this.aBoolean9314) {
			var12 = this.method318();
			var13 = this.method683();
			var14 = (arg2 - arg0) / var12;
			var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var17 * (float) this.anInt9322;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = var15 * (float) this.anInt9320;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9318;
			float var24 = -var16 * (float) this.anInt9321;
			float var25 = -var17 * (float) this.anInt9321;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		var12 = arg4 + (arg2 - arg0);
		var13 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg6 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var11);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		var14 = var11.aFloat9362 / (float) var11.anInt9363;
		var15 = var11.aFloat9361 / (float) var11.anInt9360;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg0 - (float) arg8), var11.aFloat9361 - var15 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg4 - (float) arg8), var11.aFloat9361 - var15 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float) arg8), var11.aFloat9361 - var15 * (var13 - (float) arg9));
		OpenGL.glVertex2f(var12, var13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg2 - (float) arg8), var11.aFloat9361 - var15 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!this.aClass_ra_Sub1_9315.aBoolean8408) {
			this.aClass36_Sub1_Sub1_9319.method520(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		int[] var7 = this.aClass_ra_Sub1_9315.ar(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method739(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	public void method722(int arg0, int arg1, int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass36_Sub1_Sub1_9316 = Class36_Sub1_Sub1.method527(this.aClass_ra_Sub1_9315, arg0, arg1, this.aClass36_Sub1_Sub1_9319.anInt9363, this.aClass36_Sub1_Sub1_9319.anInt9360);
		this.anInt9317 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method731(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		Class36_Sub1_Sub1 var11 = ((Class_ta_Sub2) arg7).aClass36_Sub1_Sub1_8660;
		float var12;
		float var13;
		float var14;
		float var15;
		if (this.aBoolean9314) {
			var12 = this.method318();
			var13 = this.method683();
			var14 = (arg2 - arg0) / var12;
			var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var17 * (float) this.anInt9322;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = var15 * (float) this.anInt9320;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9318;
			float var24 = -var16 * (float) this.anInt9321;
			float var25 = -var17 * (float) this.anInt9321;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		var12 = arg4 + (arg2 - arg0);
		var13 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg6 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var11);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		var14 = var11.aFloat9362 / (float) var11.anInt9363;
		var15 = var11.aFloat9361 / (float) var11.anInt9360;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg0 - (float) arg8), var11.aFloat9361 - var15 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg4 - (float) arg8), var11.aFloat9361 - var15 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float) arg8), var11.aFloat9361 - var15 * (var13 - (float) arg9));
		OpenGL.glVertex2f(var12, var13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg2 - (float) arg8), var11.aFloat9361 - var15 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public void method739(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.aClass36_Sub1_Sub1_9319.method522(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	public void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!this.aClass_ra_Sub1_9315.aBoolean8408) {
			this.aClass36_Sub1_Sub1_9319.method520(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		int[] var7 = this.aClass_ra_Sub1_9315.ar(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method739(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	public void method740(int arg0) {
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4831(this.aClass_ra_Sub1_9315.method4846(arg0), 7681);
		this.aClass_ra_Sub1_9315.method4847(1, 34167, 768);
		this.aClass_ra_Sub1_9315.method4848(0, 34168, 770);
		this.aClass_ra_Sub1_9315.method4843(0);
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9316);
		this.aClass_ra_Sub1_9315.method4831(34479, 7681);
		this.aClass_ra_Sub1_9315.method4847(1, 34166, 768);
		if (this.anInt9317 == 0) {
			this.aClass_ra_Sub1_9315.method4850(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt9317 == 1) {
			this.aClass_ra_Sub1_9315.method4850(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt9317 == 2) {
			this.aClass_ra_Sub1_9315.method4850(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt9317 == 3) {
			this.aClass_ra_Sub1_9315.method4850(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	public void method689(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		Class_ta_Sub2 var6 = (Class_ta_Sub2) arg2;
		Class36_Sub1_Sub1 var7 = var6.aClass36_Sub1_Sub1_8660;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var7);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		int var16 = arg0 + this.anInt9320;
		int var17 = arg1 + this.anInt9322;
		int var8 = var16 + this.aClass36_Sub1_Sub1_9319.anInt9363;
		int var9 = var17 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		float var10 = var7.aFloat9362 / (float) var7.anInt9363;
		float var11 = var7.aFloat9361 / (float) var7.anInt9360;
		float var12 = (float) (var16 - arg3) * var10;
		float var13 = (float) (var8 - arg3) * var10;
		float var14 = var7.aFloat9361 - (float) (var17 - arg4) * var11;
		float var15 = var7.aFloat9361 - (float) (var9 - arg4) * var11;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var12, var14);
		OpenGL.glVertex2i(var16, var17);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var12, var15);
		OpenGL.glVertex2i(var16, var17 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var13, var15);
		OpenGL.glVertex2i(var16 + this.aClass36_Sub1_Sub1_9319.anInt9363, var17 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var13, var14);
		OpenGL.glVertex2i(var16 + this.aClass36_Sub1_Sub1_9319.anInt9363, var17);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public int method681() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363;
	}

	public void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg6);
		this.aClass_ra_Sub1_9315.method4836(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass36_Sub1_Sub1_9319.aBoolean9364 && !this.aBoolean9314) {
			float var18 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) arg3 / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			float var19 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) arg2 / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var19, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var19, var18);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9320, (float) this.anInt9322, 0.0F);
		int var10 = this.method318();
		int var11 = this.method683();
		int var12 = arg1 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		OpenGL.glBegin(7);
		int var13 = arg1;
		int var15;
		while (var12 <= var9) {
			int var14 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			var15 = arg0;
			while (var14 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2i(var14, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var14, var13);
				var14 += var10;
				var15 += var10;
			}
			if (var15 < var8) {
				float var16 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var15) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(var16, 0.0F);
				OpenGL.glVertex2i(var8, var12);
				OpenGL.glTexCoord2f(var16, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
			var13 += var11;
			var12 += var11;
		}
		if (var13 < var9) {
			float var20 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) (this.aClass36_Sub1_Sub1_9319.anInt9360 - (var9 - var13)) / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			var15 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			int var21 = arg0;
			while (var15 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, var20);
				OpenGL.glVertex2i(var15, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				var15 += var10;
				var21 += var10;
			}
			if (var21 < var8) {
				float var17 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var21) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var17, var20);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var17, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	public void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		float var11;
		float var12;
		if (this.aBoolean9314) {
			var11 = this.method318();
			var12 = this.method683();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9322;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var13 * (float) this.anInt9320;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = -var13 * (float) this.anInt9318;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9321;
			float var24 = -var16 * (float) this.anInt9321;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		var11 = arg4 + (arg2 - arg0);
		var12 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg9 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg8);
		this.aClass_ra_Sub1_9315.method4836(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2f(var11, var12);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	public Interface8_Impl1_Impl2 method684() {
		return this.aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method713() {
		return this.aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method729() {
		return this.aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method707() {
		return this.aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method678() {
		return this.aClass36_Sub1_Sub1_9319.method523(0);
	}

	public void method700(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		int var6 = arg0 + this.anInt9320;
		int var7 = arg1 + this.anInt9322;
		if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6, var7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
			OpenGL.glEnd();
			return;
		}
		this.method740(arg2);
		this.aClass36_Sub1_Sub1_9316.method515(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6, var7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
		OpenGL.glEnd();
		this.method741();
	}

	public void method685(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		int var6 = arg0 + this.anInt9320;
		int var7 = arg1 + this.anInt9322;
		if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6, var7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
			OpenGL.glEnd();
			return;
		}
		this.method740(arg2);
		this.aClass36_Sub1_Sub1_9316.method515(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6, var7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
		OpenGL.glEnd();
		this.method741();
	}

	public void method708(int arg0, int arg1, Class_ta arg2, int arg3, int arg4) {
		Class_ta_Sub2 var6 = (Class_ta_Sub2) arg2;
		Class36_Sub1_Sub1 var7 = var6.aClass36_Sub1_Sub1_8660;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var7);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		int var16 = arg0 + this.anInt9320;
		int var17 = arg1 + this.anInt9322;
		int var8 = var16 + this.aClass36_Sub1_Sub1_9319.anInt9363;
		int var9 = var17 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		float var10 = var7.aFloat9362 / (float) var7.anInt9363;
		float var11 = var7.aFloat9361 / (float) var7.anInt9360;
		float var12 = (float) (var16 - arg3) * var10;
		float var13 = (float) (var8 - arg3) * var10;
		float var14 = var7.aFloat9361 - (float) (var17 - arg4) * var11;
		float var15 = var7.aFloat9361 - (float) (var9 - arg4) * var11;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var12, var14);
		OpenGL.glVertex2i(var16, var17);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var12, var15);
		OpenGL.glVertex2i(var16, var17 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var13, var15);
		OpenGL.glVertex2i(var16 + this.aClass36_Sub1_Sub1_9319.anInt9363, var17 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var13, var14);
		OpenGL.glVertex2i(var16 + this.aClass36_Sub1_Sub1_9319.anInt9363, var17);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass36_Sub1_Sub1_9319.method515((arg7 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9314) {
			float var9 = (float) arg2 / (float) this.method318();
			float var10 = (float) arg3 / (float) this.method683();
			float var11 = (float) arg0 + (float) this.anInt9320 * var9;
			float var12 = (float) arg1 + (float) this.anInt9322 * var10;
			float var13 = var11 + (float) this.aClass36_Sub1_Sub1_9319.anInt9363 * var9;
			float var14 = var12 + (float) this.aClass36_Sub1_Sub1_9319.anInt9360 * var10;
			if (this.aClass36_Sub1_Sub1_9316 == null) {
				this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
				this.aClass_ra_Sub1_9315.method4836(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method740(arg4);
				this.aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method741();
			}
		} else if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method740(arg4);
			this.aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method741();
		}
	}

	public void method705(int arg0, int arg1, int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass36_Sub1_Sub1_9316 = Class36_Sub1_Sub1.method527(this.aClass_ra_Sub1_9315, arg0, arg1, this.aClass36_Sub1_Sub1_9319.anInt9363, this.aClass36_Sub1_Sub1_9319.anInt9360);
		this.anInt9317 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass36_Sub1_Sub1_9319.method515((arg7 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9314) {
			float var9 = (float) arg2 / (float) this.method318();
			float var10 = (float) arg3 / (float) this.method683();
			float var11 = (float) arg0 + (float) this.anInt9320 * var9;
			float var12 = (float) arg1 + (float) this.anInt9322 * var10;
			float var13 = var11 + (float) this.aClass36_Sub1_Sub1_9319.anInt9363 * var9;
			float var14 = var12 + (float) this.aClass36_Sub1_Sub1_9319.anInt9360 * var10;
			if (this.aClass36_Sub1_Sub1_9316 == null) {
				this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
				this.aClass_ra_Sub1_9315.method4836(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method740(arg4);
				this.aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method741();
			}
		} else if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method740(arg4);
			this.aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method741();
		}
	}

	public int method317() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363 + this.anInt9320 + this.anInt9318;
	}

	public void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass36_Sub1_Sub1_9319.method515((arg7 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9314) {
			float var9 = (float) arg2 / (float) this.method318();
			float var10 = (float) arg3 / (float) this.method683();
			float var11 = (float) arg0 + (float) this.anInt9320 * var9;
			float var12 = (float) arg1 + (float) this.anInt9322 * var10;
			float var13 = var11 + (float) this.aClass36_Sub1_Sub1_9319.anInt9363 * var9;
			float var14 = var12 + (float) this.aClass36_Sub1_Sub1_9319.anInt9360 * var10;
			if (this.aClass36_Sub1_Sub1_9316 == null) {
				this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
				this.aClass_ra_Sub1_9315.method4836(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method740(arg4);
				this.aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method741();
			}
		} else if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method740(arg4);
			this.aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method741();
		}
	}

	public int method702() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363;
	}

	public int method714() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363;
	}

	public int method716() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363;
	}

	public void method741() {
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4831(8448, 8448);
		this.aClass_ra_Sub1_9315.method4847(1, 34168, 768);
		this.aClass_ra_Sub1_9315.method4848(0, 5890, 770);
		this.aClass_ra_Sub1_9315.method4843(0);
		this.aClass_ra_Sub1_9315.method4847(1, 34168, 768);
	}

	public void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass36_Sub1_Sub1_9319.method515((arg7 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9314) {
			float var9 = (float) arg2 / (float) this.method318();
			float var10 = (float) arg3 / (float) this.method683();
			float var11 = (float) arg0 + (float) this.anInt9320 * var9;
			float var12 = (float) arg1 + (float) this.anInt9322 * var10;
			float var13 = var11 + (float) this.aClass36_Sub1_Sub1_9319.anInt9363 * var9;
			float var14 = var12 + (float) this.aClass36_Sub1_Sub1_9319.anInt9360 * var10;
			if (this.aClass36_Sub1_Sub1_9316 == null) {
				this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
				this.aClass_ra_Sub1_9315.method4836(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method740(arg4);
				this.aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method741();
			}
		} else if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method740(arg4);
			this.aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method741();
		}
	}

	public int method718() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360;
	}

	public int method719() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360;
	}

	public int method316() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363 + this.anInt9320 + this.anInt9318;
	}

	public int method315() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363 + this.anInt9320 + this.anInt9318;
	}

	public int method693() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360;
	}

	public int method724() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360 + this.anInt9322 + this.anInt9321;
	}

	public int method723() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360 + this.anInt9322 + this.anInt9321;
	}

	public void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg6);
		this.aClass_ra_Sub1_9315.method4836(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass36_Sub1_Sub1_9319.aBoolean9364 && !this.aBoolean9314) {
			float var18 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) arg3 / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			float var19 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) arg2 / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var19, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var19, var18);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9320, (float) this.anInt9322, 0.0F);
		int var10 = this.method318();
		int var11 = this.method683();
		int var12 = arg1 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		OpenGL.glBegin(7);
		int var13 = arg1;
		int var15;
		while (var12 <= var9) {
			int var14 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			var15 = arg0;
			while (var14 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2i(var14, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var14, var13);
				var14 += var10;
				var15 += var10;
			}
			if (var15 < var8) {
				float var16 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var15) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(var16, 0.0F);
				OpenGL.glVertex2i(var8, var12);
				OpenGL.glTexCoord2f(var16, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
			var13 += var11;
			var12 += var11;
		}
		if (var13 < var9) {
			float var20 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) (this.aClass36_Sub1_Sub1_9319.anInt9360 - (var9 - var13)) / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			var15 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			int var21 = arg0;
			while (var15 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, var20);
				OpenGL.glVertex2i(var15, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				var15 += var10;
				var21 += var10;
			}
			if (var21 < var8) {
				float var17 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var21) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var17, var20);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var17, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	public void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg6);
		this.aClass_ra_Sub1_9315.method4836(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass36_Sub1_Sub1_9319.aBoolean9364 && !this.aBoolean9314) {
			float var18 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) arg3 / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			float var19 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) arg2 / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var19, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var19, var18);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9320, (float) this.anInt9322, 0.0F);
		int var10 = this.method318();
		int var11 = this.method683();
		int var12 = arg1 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		OpenGL.glBegin(7);
		int var13 = arg1;
		int var15;
		while (var12 <= var9) {
			int var14 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			var15 = arg0;
			while (var14 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2i(var14, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var14, var13);
				var14 += var10;
				var15 += var10;
			}
			if (var15 < var8) {
				float var16 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var15) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(var16, 0.0F);
				OpenGL.glVertex2i(var8, var12);
				OpenGL.glTexCoord2f(var16, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
			var13 += var11;
			var12 += var11;
		}
		if (var13 < var9) {
			float var20 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) (this.aClass36_Sub1_Sub1_9319.anInt9360 - (var9 - var13)) / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			var15 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			int var21 = arg0;
			while (var15 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, var20);
				OpenGL.glVertex2i(var15, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				var15 += var10;
				var21 += var10;
			}
			if (var21 < var8) {
				float var17 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var21) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var17, var20);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var17, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	public int method699() {
		return this.aClass36_Sub1_Sub1_9319.anInt9363;
	}

	public void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg6);
		this.aClass_ra_Sub1_9315.method4836(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass36_Sub1_Sub1_9319.aBoolean9364 && !this.aBoolean9314) {
			float var18 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) arg3 / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			float var19 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) arg2 / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var19, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var19, var18);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9320, (float) this.anInt9322, 0.0F);
		int var10 = this.method318();
		int var11 = this.method683();
		int var12 = arg1 + this.aClass36_Sub1_Sub1_9319.anInt9360;
		OpenGL.glBegin(7);
		int var13 = arg1;
		int var15;
		while (var12 <= var9) {
			int var14 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			var15 = arg0;
			while (var14 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
				OpenGL.glVertex2i(var14, var12);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var14, var13);
				var14 += var10;
				var15 += var10;
			}
			if (var15 < var8) {
				float var16 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var15) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var15, var12);
				OpenGL.glTexCoord2f(var16, 0.0F);
				OpenGL.glVertex2i(var8, var12);
				OpenGL.glTexCoord2f(var16, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
			var13 += var11;
			var12 += var11;
		}
		if (var13 < var9) {
			float var20 = this.aClass36_Sub1_Sub1_9319.aFloat9361 * (float) (this.aClass36_Sub1_Sub1_9319.anInt9360 - (var9 - var13)) / (float) this.aClass36_Sub1_Sub1_9319.anInt9360;
			var15 = arg0 + this.aClass36_Sub1_Sub1_9319.anInt9363;
			int var21 = arg0;
			while (var15 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, var20);
				OpenGL.glVertex2i(var15, var9);
				OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var15, var13);
				var15 += var10;
				var21 += var10;
			}
			if (var21 < var8) {
				float var17 = this.aClass36_Sub1_Sub1_9319.aFloat9362 * (float) (var8 - var21) / (float) this.aClass36_Sub1_Sub1_9319.anInt9363;
				OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var21, var13);
				OpenGL.glTexCoord2f(0.0F, var20);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var17, var20);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var17, this.aClass36_Sub1_Sub1_9319.aFloat9361);
				OpenGL.glVertex2i(var8, var13);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	public void method730(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		float var11;
		float var12;
		if (this.aBoolean9314) {
			var11 = this.method318();
			var12 = this.method683();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9322;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var13 * (float) this.anInt9320;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = -var13 * (float) this.anInt9318;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9321;
			float var24 = -var16 * (float) this.anInt9321;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		var11 = arg4 + (arg2 - arg0);
		var12 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg9 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg8);
		this.aClass_ra_Sub1_9315.method4836(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2f(var11, var12);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	public void method728(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		float var11;
		float var12;
		if (this.aBoolean9314) {
			var11 = this.method318();
			var12 = this.method683();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = var15 * (float) this.anInt9322;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var13 * (float) this.anInt9320;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = -var13 * (float) this.anInt9318;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9321;
			float var24 = -var16 * (float) this.anInt9321;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		var11 = arg4 + (arg2 - arg0);
		var12 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg9 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4859(arg8);
		this.aClass_ra_Sub1_9315.method4836(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2f(var11, var12);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	public void method692(int[] arg0) {
		arg0[0] = this.anInt9320;
		arg0[1] = this.anInt9322;
		arg0[2] = this.anInt9318;
		arg0[3] = this.anInt9321;
	}

	public int method696() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360 + this.anInt9322 + this.anInt9321;
	}

	public void method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.aClass36_Sub1_Sub1_9319.method515(false);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4859(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		int var6 = arg0 + this.anInt9320;
		int var7 = arg1 + this.anInt9322;
		if (this.aClass36_Sub1_Sub1_9316 == null) {
			this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
			this.aClass_ra_Sub1_9315.method4836(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6, var7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
			OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
			OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
			OpenGL.glEnd();
			return;
		}
		this.method740(arg2);
		this.aClass36_Sub1_Sub1_9316.method515(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6, var7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(var6, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7 + this.aClass36_Sub1_Sub1_9319.anInt9360);
		OpenGL.glMultiTexCoord2f(33985, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glTexCoord2f(this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glVertex2i(var6 + this.aClass36_Sub1_Sub1_9319.anInt9363, var7);
		OpenGL.glEnd();
		this.method741();
	}

	public void method720(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		Class36_Sub1_Sub1 var11 = ((Class_ta_Sub2) arg7).aClass36_Sub1_Sub1_8660;
		float var12;
		float var13;
		float var14;
		float var15;
		if (this.aBoolean9314) {
			var12 = this.method318();
			var13 = this.method683();
			var14 = (arg2 - arg0) / var12;
			var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var17 * (float) this.anInt9322;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = var15 * (float) this.anInt9320;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9318;
			float var24 = -var16 * (float) this.anInt9321;
			float var25 = -var17 * (float) this.anInt9321;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		var12 = arg4 + (arg2 - arg0);
		var13 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg6 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var11);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		var14 = var11.aFloat9362 / (float) var11.anInt9363;
		var15 = var11.aFloat9361 / (float) var11.anInt9360;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg0 - (float) arg8), var11.aFloat9361 - var15 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg4 - (float) arg8), var11.aFloat9361 - var15 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float) arg8), var11.aFloat9361 - var15 * (var13 - (float) arg9));
		OpenGL.glVertex2f(var12, var13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg2 - (float) arg8), var11.aFloat9361 - var15 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public int method711() {
		return this.aClass36_Sub1_Sub1_9319.anInt9360 + this.anInt9322 + this.anInt9321;
	}

	public void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		Class36_Sub1_Sub1 var11 = ((Class_ta_Sub2) arg7).aClass36_Sub1_Sub1_8660;
		float var12;
		float var13;
		float var14;
		float var15;
		if (this.aBoolean9314) {
			var12 = this.method318();
			var13 = this.method683();
			var14 = (arg2 - arg0) / var12;
			var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var17 * (float) this.anInt9322;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = var15 * (float) this.anInt9320;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9318;
			float var24 = -var16 * (float) this.anInt9321;
			float var25 = -var17 * (float) this.anInt9321;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		var12 = arg4 + (arg2 - arg0);
		var13 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg6 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var11);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		var14 = var11.aFloat9362 / (float) var11.anInt9363;
		var15 = var11.aFloat9361 / (float) var11.anInt9360;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg0 - (float) arg8), var11.aFloat9361 - var15 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg4 - (float) arg8), var11.aFloat9361 - var15 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float) arg8), var11.aFloat9361 - var15 * (var13 - (float) arg9));
		OpenGL.glVertex2f(var12, var13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg2 - (float) arg8), var11.aFloat9361 - var15 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}

	public void method733(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9) {
		Class36_Sub1_Sub1 var11 = ((Class_ta_Sub2) arg7).aClass36_Sub1_Sub1_8660;
		float var12;
		float var13;
		float var14;
		float var15;
		if (this.aBoolean9314) {
			var12 = this.method318();
			var13 = this.method683();
			var14 = (arg2 - arg0) / var12;
			var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = var16 * (float) this.anInt9322;
			float var19 = var17 * (float) this.anInt9322;
			float var20 = var14 * (float) this.anInt9320;
			float var21 = var15 * (float) this.anInt9320;
			float var22 = -var14 * (float) this.anInt9318;
			float var23 = -var15 * (float) this.anInt9318;
			float var24 = -var16 * (float) this.anInt9321;
			float var25 = -var17 * (float) this.anInt9321;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		var12 = arg4 + (arg2 - arg0);
		var13 = arg3 + (arg5 - arg1);
		this.aClass36_Sub1_Sub1_9319.method515((arg6 & 0x1) != 0);
		this.aClass_ra_Sub1_9315.method4838();
		this.aClass_ra_Sub1_9315.method4844(this.aClass36_Sub1_Sub1_9319);
		this.aClass_ra_Sub1_9315.method4836(1);
		this.aClass_ra_Sub1_9315.method4843(1);
		this.aClass_ra_Sub1_9315.method4844(var11);
		this.aClass_ra_Sub1_9315.method4831(7681, 8448);
		this.aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		this.aClass_ra_Sub1_9315.method4859(1);
		var14 = var11.aFloat9362 / (float) var11.anInt9363;
		var15 = var11.aFloat9361 / (float) var11.anInt9360;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg0 - (float) arg8), var11.aFloat9361 - var15 * (arg1 - (float) arg9));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg4 - (float) arg8), var11.aFloat9361 - var15 * (arg5 - (float) arg9));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float) arg8), var11.aFloat9361 - var15 * (var13 - (float) arg9));
		OpenGL.glVertex2f(var12, var13);
		OpenGL.glMultiTexCoord2f(33984, this.aClass36_Sub1_Sub1_9319.aFloat9362, this.aClass36_Sub1_Sub1_9319.aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, var14 * (arg2 - (float) arg8), var11.aFloat9361 - var15 * (arg3 - (float) arg9));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_9315.method4836(0);
		this.aClass_ra_Sub1_9315.method4844(null);
		this.aClass_ra_Sub1_9315.method4843(0);
	}
}
