package deob;

import jaggl.OpenGL;

public class Class49_Sub1 extends Class49 {

	public static char aChar7032 = 0;

	public static char aChar7034 = 1;

	public static float[] aFloatArray7037 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	public Class47 aClass47_7033;

	public Class36_Sub4 aClass36_Sub4_7036;

	public Class33 aClass33_7035;

	public void method621(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public boolean method601() {
		return true;
	}

	public void method602(boolean arg0) {
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			float var2 = -0.5F / (float) this.aClass_ra_Sub1_478.anInt8382;
			this.aClass_ra_Sub1_478.method4843(1);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = var2;
			aFloatArray7037[3] = this.aClass_ra_Sub1_478.aFloat8298 * var2 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray7037, 0);
			OpenGL.glPopMatrix();
			this.aClass_ra_Sub1_478.method4867(0.5F, (float) this.aClass_ra_Sub1_478.anInt8382);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub4_7036);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass33_7035.method503('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	public void method620(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public void method600(Class36 arg0, int arg1) {
	}

	public void method606(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public void method608(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(260, 8448);
	}

	public void method622() {
		this.aClass33_7035 = new Class33(this.aClass_ra_Sub1_478, 2);
		this.aClass33_7035.method504(0);
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4831(7681, 260);
		this.aClass_ra_Sub1_478.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		this.aClass_ra_Sub1_478.method4843(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass47_7033.aBoolean462) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass33_7035.method502();
		this.aClass33_7035.method504(1);
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aClass_ra_Sub1_478.method4847(0, 5890, 768);
		OpenGL.glDisable(3168);
		this.aClass_ra_Sub1_478.method4843(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass47_7033.aBoolean462) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass33_7035.method502();
	}

	public void method613() {
		this.aClass33_7035.method503('\u0001');
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	public boolean method605() {
		return true;
	}

	public boolean method611() {
		return true;
	}

	public void method609(boolean arg0) {
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			float var2 = -0.5F / (float) this.aClass_ra_Sub1_478.anInt8382;
			this.aClass_ra_Sub1_478.method4843(1);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = var2;
			aFloatArray7037[3] = this.aClass_ra_Sub1_478.aFloat8298 * var2 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray7037, 0);
			OpenGL.glPopMatrix();
			this.aClass_ra_Sub1_478.method4867(0.5F, (float) this.aClass_ra_Sub1_478.anInt8382);
			this.aClass_ra_Sub1_478.method4844(this.aClass36_Sub4_7036);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass33_7035.method503('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	public void method604() {
		this.aClass33_7035.method503('\u0001');
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	public void method607(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(260, 8448);
	}

	public void method612(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(260, 8448);
	}

	public void method614() {
		this.aClass33_7035.method503('\u0001');
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	public void method603() {
		this.aClass33_7035.method503('\u0001');
		if (this.aClass_ra_Sub1_478.anInt8382 > 0) {
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			this.aClass_ra_Sub1_478.method4843(0);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	public void method615(Class36 arg0, int arg1) {
	}

	public void method616(Class36 arg0, int arg1) {
	}

	public void method617(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public void method618(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public void method619(int arg0, int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass47_7033.aBoolean462) {
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) (this.aClass_ra_Sub1_478.anInt8304 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int var3 = this.aClass_ra_Sub1_478.anInt8304 % 4000 * 16 / 4000;
				this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[var3]);
			}
		} else if (this.aClass47_7033.aBoolean462) {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else {
			this.aClass_ra_Sub1_478.method4844(this.aClass47_7033.aClass36_Sub1Array461[0]);
		}
	}

	public Class49_Sub1(Class_ra_Sub1 arg0, Class47 arg1) {
		super(arg0);
		this.aClass47_7033 = arg1;
		this.method622();
		this.aClass36_Sub4_7036 = new Class36_Sub4(this.aClass_ra_Sub1_478, Class72.aClass72_611, Class86.aClass86_714, 2, new byte[] { 0, -1 }, Class72.aClass72_611);
		this.aClass36_Sub4_7036.method533(false);
	}

	public void method610(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(260, 8448);
	}
}
