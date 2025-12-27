package deob;

import jaggl.OpenGL;

public class Class49_Sub5 extends Class49 {

	public static float[] aFloatArray7066 = new float[4];

	public static char aChar7069 = 0;

	public static char aChar7070 = 1;

	public Class47 aClass47_7067;

	public Class33 aClass33_7068;

	public void method610(boolean arg0) {
	}

	public boolean method601() {
		return true;
	}

	public void method602(boolean arg0) {
		this.aClass33_7068.method503('\u0000');
		if (this.aClass47_7067.aBoolean462) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub2_466);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method608(boolean arg0) {
	}

	public void method609(boolean arg0) {
		this.aClass33_7068.method503('\u0000');
		if (this.aClass47_7067.aBoolean462) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub2_466);
			this.aClass_ra_Sub1_478.method4843(0);
		}
	}

	public void method606(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method600(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method604() {
		this.aClass33_7068.method503('\u0001');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public boolean method605() {
		return true;
	}

	public boolean method611() {
		return true;
	}

	public void method618(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method603() {
		this.aClass33_7068.method503('\u0001');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method607(boolean arg0) {
	}

	public void method612(boolean arg0) {
	}

	public void method615(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method613() {
		this.aClass33_7068.method503('\u0001');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public Class49_Sub5(Class_ra_Sub1 arg0, Class47 arg1) {
		super(arg0);
		this.aClass47_7067 = arg1;
		this.aClass33_7068 = new Class33(arg0, 2);
		this.aClass33_7068.method504(0);
		this.aClass_ra_Sub1_478.method4843(1);
		if (this.aClass47_7067.aBoolean462) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass33_7068.method502();
		this.aClass33_7068.method504(1);
		this.aClass_ra_Sub1_478.method4843(1);
		if (this.aClass47_7067.aBoolean462) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aClass33_7068.method502();
	}

	public void method616(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method617(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method614() {
		this.aClass33_7068.method503('\u0001');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(null);
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method619(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method620(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}

	public void method621(int arg0, int arg1) {
		float var3 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		this.aClass_ra_Sub1_478.method4843(1);
		if (var6) {
			aFloatArray7066[0] = var5;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = var5;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = var5;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var3 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (this.aClass47_7067.aBoolean462) {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = (float) this.aClass_ra_Sub1_478.anInt8304 * var4 % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		} else {
			int var7 = (int) (var4 * (float) this.aClass_ra_Sub1_478.anInt8304 * 16.0F);
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7067.aClass36_Sub1Array465[var7 % 16]);
		}
		this.aClass_ra_Sub1_478.method4843(0);
	}
}
