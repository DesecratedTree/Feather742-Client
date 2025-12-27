package deob;

import jaggl.OpenGL;

public class Class263_Sub1 extends Class263 {

	public Class_ra_Sub1 aClass_ra_Sub1_7370;

	public Class36_Sub1_Sub1 aClass36_Sub1_Sub1_7371;

	public boolean aBoolean7372;

	public Class33 aClass33_7369;

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		Class_ta_Sub2 var9 = (Class_ta_Sub2) arg5;
		Class36_Sub1_Sub1 var10 = var9.aClass36_Sub1_Sub1_8660;
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		this.aClass_ra_Sub1_7370.method4843(1);
		this.aClass_ra_Sub1_7370.method4844(var10);
		this.aClass_ra_Sub1_7370.method4831(7681, 8448);
		this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.aFloat9362 / (float) var10.anInt9363;
		float var12 = var10.aFloat9361 / (float) var10.anInt9360;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_7370.method4831(8448, 8448);
		this.aClass_ra_Sub1_7370.method4844(null);
		this.aClass_ra_Sub1_7370.method4843(0);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	@ObfuscatedName("Class263_Sub1.UA(CIIIZ)V")
	public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		Class_ta_Sub2 var9 = (Class_ta_Sub2) arg5;
		Class36_Sub1_Sub1 var10 = var9.aClass36_Sub1_Sub1_8660;
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		this.aClass_ra_Sub1_7370.method4843(1);
		this.aClass_ra_Sub1_7370.method4844(var10);
		this.aClass_ra_Sub1_7370.method4831(7681, 8448);
		this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.aFloat9362 / (float) var10.anInt9363;
		float var12 = var10.aFloat9361 / (float) var10.anInt9360;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_7370.method4831(8448, 8448);
		this.aClass_ra_Sub1_7370.method4844(null);
		this.aClass_ra_Sub1_7370.method4843(0);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		Class_ta_Sub2 var9 = (Class_ta_Sub2) arg5;
		Class36_Sub1_Sub1 var10 = var9.aClass36_Sub1_Sub1_8660;
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		this.aClass_ra_Sub1_7370.method4843(1);
		this.aClass_ra_Sub1_7370.method4844(var10);
		this.aClass_ra_Sub1_7370.method4831(7681, 8448);
		this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.aFloat9362 / (float) var10.anInt9363;
		float var12 = var10.aFloat9361 / (float) var10.anInt9360;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_7370.method4831(8448, 8448);
		this.aClass_ra_Sub1_7370.method4844(null);
		this.aClass_ra_Sub1_7370.method4843(0);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		Class_ta_Sub2 var9 = (Class_ta_Sub2) arg5;
		Class36_Sub1_Sub1 var10 = var9.aClass36_Sub1_Sub1_8660;
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		this.aClass_ra_Sub1_7370.method4843(1);
		this.aClass_ra_Sub1_7370.method4844(var10);
		this.aClass_ra_Sub1_7370.method4831(7681, 8448);
		this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.aFloat9362 / (float) var10.anInt9363;
		float var12 = var10.aFloat9361 / (float) var10.anInt9360;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_7370.method4831(8448, 8448);
		this.aClass_ra_Sub1_7370.method4844(null);
		this.aClass_ra_Sub1_7370.method4843(0);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	@ObfuscatedName("Class263_Sub1.c(CIIIZ)V")
	public void c(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}

	public Class263_Sub1(Class_ra_Sub1 arg0, Class524 arg1, Class87_Sub2[] arg2, boolean arg3) {
		super(arg0, arg1);
		this.aClass_ra_Sub1_7370 = arg0;
		int var5 = 0;
		int var6;
		for (var6 = 0; var6 < 256; var6++) {
			Class87_Sub2 var7 = arg2[var6];
			if (var7.anInt7107 > var5) {
				var5 = var7.anInt7107;
			}
			if (var7.anInt7112 > var5) {
				var5 = var7.anInt7112;
			}
		}
		var6 = var5 * 16;
		int var8;
		Class87_Sub2 var9;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var17;
		int var18;
		if (arg3) {
			byte[] var22 = new byte[var6 * var6];
			for (var8 = 0; var8 < 256; var8++) {
				var9 = arg2[var8];
				int var10 = var9.anInt7107;
				var11 = var9.anInt7112;
				var12 = var8 % 16 * var5;
				var13 = var8 / 16 * var5;
				var14 = var13 * var6 + var12;
				var15 = 0;
				byte[] var16;
				if (var9.aByteArray7115 == null) {
					var16 = var9.aByteArray7114;
					for (var17 = 0; var17 < var10; var17++) {
						for (var18 = 0; var18 < var11; var18++) {
							var22[var14++] = (byte) (var16[var15++] == 0 ? 0 : -1);
						}
						var14 += var6 - var11;
					}
				} else {
					var16 = var9.aByteArray7115;
					for (var17 = 0; var17 < var10; var17++) {
						for (var18 = 0; var18 < var11; var18++) {
							var22[var14++] = var16[var15++];
						}
						var14 += var6 - var11;
					}
				}
			}
			this.aClass36_Sub1_Sub1_7371 = Class36_Sub1_Sub1.method526(arg0, Class72.aClass72_611, Class86.aClass86_714, var6, var6, false, var22, Class72.aClass72_611);
			this.aBoolean7372 = true;
		} else {
			int[] var23 = new int[var6 * var6];
			for (var8 = 0; var8 < 256; var8++) {
				var9 = arg2[var8];
				int[] var27 = var9.anIntArray7113;
				byte[] var29 = var9.aByteArray7115;
				byte[] var30 = var9.aByteArray7114;
				var13 = var9.anInt7107;
				var14 = var9.anInt7112;
				var15 = var8 % 16 * var5;
				int var32 = var8 / 16 * var5;
				var17 = var32 * var6 + var15;
				var18 = 0;
				int var19;
				int var20;
				if (var29 == null) {
					for (var19 = 0; var19 < var13; var19++) {
						for (var20 = 0; var20 < var14; var20++) {
							byte var21;
							if ((var21 = var30[var18++]) == 0) {
								var17++;
							} else {
								var23[var17++] = var27[var21 & 0xFF] | 0xFF000000;
							}
						}
						var17 += var6 - var14;
					}
				} else {
					for (var19 = 0; var19 < var13; var19++) {
						for (var20 = 0; var20 < var14; var20++) {
							var23[var17++] = var29[var18] << 24 | var27[var30[var18] & 0xFF];
							var18++;
						}
						var17 += var6 - var14;
					}
				}
			}
			this.aClass36_Sub1_Sub1_7371 = Class36_Sub1_Sub1.method524(arg0, var6, var6, false, var23, 0, 0);
			this.aBoolean7372 = false;
		}
		this.aClass36_Sub1_Sub1_7371.method515(false);
		this.aClass33_7369 = new Class33(arg0, 256);
		float var24 = this.aClass36_Sub1_Sub1_7371.aFloat9362 / (float) this.aClass36_Sub1_Sub1_7371.anInt9363;
		float var25 = this.aClass36_Sub1_Sub1_7371.aFloat9361 / (float) this.aClass36_Sub1_Sub1_7371.anInt9360;
		for (int var26 = 0; var26 < 256; var26++) {
			Class87_Sub2 var28 = arg2[var26];
			var11 = var28.anInt7107;
			var12 = var28.anInt7112;
			var13 = var28.anInt7111;
			var14 = var28.anInt7109;
			float var31 = (float) (var26 % 16 * var5);
			float var33 = (float) (var26 / 16 * var5);
			float var34 = var31 * var24;
			float var35 = var33 * var25;
			float var36 = (var31 + (float) var12) * var24;
			float var37 = (var33 + (float) var11) * var25;
			this.aClass33_7369.method504(var26);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(var34, this.aClass36_Sub1_Sub1_7371.aFloat9361 - var35);
			OpenGL.glVertex2i(var14, var13);
			OpenGL.glTexCoord2f(var34, this.aClass36_Sub1_Sub1_7371.aFloat9361 - var37);
			OpenGL.glVertex2i(var14, var13 + var11);
			OpenGL.glTexCoord2f(var36, this.aClass36_Sub1_Sub1_7371.aFloat9361 - var37);
			OpenGL.glVertex2i(var14 + var12, var13 + var11);
			OpenGL.glTexCoord2f(var36, this.aClass36_Sub1_Sub1_7371.aFloat9361 - var35);
			OpenGL.glVertex2i(var14 + var12, var13);
			OpenGL.glEnd();
			this.aClass33_7369.method502();
		}
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		Class_ta_Sub2 var9 = (Class_ta_Sub2) arg5;
		Class36_Sub1_Sub1 var10 = var9.aClass36_Sub1_Sub1_8660;
		this.aClass_ra_Sub1_7370.method4839();
		this.aClass_ra_Sub1_7370.method4844(this.aClass36_Sub1_Sub1_7371);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4831(7681, 8448);
			this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else {
			this.aClass_ra_Sub1_7370.method4831(7681, 7681);
		}
		this.aClass_ra_Sub1_7370.method4843(1);
		this.aClass_ra_Sub1_7370.method4844(var10);
		this.aClass_ra_Sub1_7370.method4831(7681, 8448);
		this.aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float var11 = var10.aFloat9362 / (float) var10.anInt9363;
		float var12 = var10.aFloat9361 / (float) var10.anInt9360;
		OpenGL.glTexGenfv(8192, 9474, new float[] { var11, 0.0F, 0.0F, (float) -arg6 * var11 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, var12, 0.0F, (float) -arg7 * var12 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass33_7369.method503(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		this.aClass_ra_Sub1_7370.method4831(8448, 8448);
		this.aClass_ra_Sub1_7370.method4844(null);
		this.aClass_ra_Sub1_7370.method4843(0);
		if (this.aBoolean7372 || arg4) {
			this.aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		}
	}
}
