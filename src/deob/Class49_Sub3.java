package deob;

import jaggl.OpenGL;

public class Class49_Sub3 extends Class49 {

	public static char aChar7052 = 0;

	public static char aChar7055 = 1;

	public boolean aBoolean7053 = false;

	public Class33 aClass33_7054;

	public Class49_Sub3(Class_ra_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean8420) {
			this.aClass33_7054 = new Class33(arg0, 2);
			this.aClass33_7054.method504(0);
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4831(34165, 7681);
			this.aClass_ra_Sub1_478.method4847(2, 34168, 770);
			this.aClass_ra_Sub1_478.method4848(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7054.method502();
			this.aClass33_7054.method504(1);
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4831(8448, 8448);
			this.aClass_ra_Sub1_478.method4847(2, 34166, 770);
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aClass_ra_Sub1_478.method4843(0);
			this.aClass33_7054.method502();
		}
	}

	public void method620(int arg0, int arg1) {
	}

	public boolean method601() {
		return true;
	}

	public void method602(boolean arg0) {
		Class36_Sub3 var2 = this.aClass_ra_Sub1_478.method4832();
		if (this.aClass33_7054 == null || var2 == null || !arg0) {
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			return;
		}
		this.aClass33_7054.method503('\u0000');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(var2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass_ra_Sub1_478.aClass249_8359.method2502(this.aClass_ra_Sub1_478.aFloatArray8348), 0);
		OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aBoolean7053 = true;
	}

	public void method608(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method604() {
		if (this.aBoolean7053) {
			this.aClass33_7054.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aBoolean7053 = false;
	}

	public void method600(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public boolean method605() {
		return true;
	}

	public void method607(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method609(boolean arg0) {
		Class36_Sub3 var2 = this.aClass_ra_Sub1_478.method4832();
		if (this.aClass33_7054 == null || var2 == null || !arg0) {
			this.aClass_ra_Sub1_478.method4848(0, 34168, 770);
			return;
		}
		this.aClass33_7054.method503('\u0000');
		this.aClass_ra_Sub1_478.method4843(1);
		this.aClass_ra_Sub1_478.method4844(var2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass_ra_Sub1_478.aClass249_8359.method2502(this.aClass_ra_Sub1_478.aFloatArray8348), 0);
		OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass_ra_Sub1_478.method4843(0);
		this.aBoolean7053 = true;
	}

	public void method610(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method619(int arg0, int arg1) {
	}

	public void method612(boolean arg0) {
		this.aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	public void method614() {
		if (this.aBoolean7053) {
			this.aClass33_7054.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aBoolean7053 = false;
	}

	public boolean method611() {
		return true;
	}

	public void method603() {
		if (this.aBoolean7053) {
			this.aClass33_7054.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aBoolean7053 = false;
	}

	public void method615(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method616(Class36 arg0, int arg1) {
		this.aClass_ra_Sub1_478.method4844(arg0);
		this.aClass_ra_Sub1_478.method4836(arg1);
	}

	public void method617(int arg0, int arg1) {
	}

	public void method618(int arg0, int arg1) {
	}

	public void method613() {
		if (this.aBoolean7053) {
			this.aClass33_7054.method503('\u0001');
			this.aClass_ra_Sub1_478.method4843(1);
			this.aClass_ra_Sub1_478.method4844(null);
			this.aClass_ra_Sub1_478.method4843(0);
		} else {
			this.aClass_ra_Sub1_478.method4848(0, 5890, 770);
		}
		this.aClass_ra_Sub1_478.method4831(8448, 8448);
		this.aBoolean7053 = false;
	}

	public void method621(int arg0, int arg1) {
	}

	public void method606(int arg0, int arg1) {
	}
}
