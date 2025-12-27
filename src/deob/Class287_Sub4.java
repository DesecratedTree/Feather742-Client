package deob;

import jaggl.OpenGL;

public class Class287_Sub4 extends Class287 implements Interface11_Impl1 {

	public static int anInt8951 = 1;

	public void method166() {
		super.method166();
	}

	public Class287_Sub4(Class_ra_Sub2_Sub1 arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, 34067, Class72.aClass72_620, Class86.aClass86_714, arg1 * arg1 * 6, arg2);
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		int var5;
		if (arg2) {
			for (var5 = 0; var5 < 6; var5++) {
				this.method2881(var5 + 34069, arg1, arg1, arg3[var5]);
			}
		} else {
			for (var5 = 0; var5 < 6; var5++) {
				OpenGL.glTexImage2Di(var5 + 34069, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg1, arg1, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), this.aClass_ra_Sub2_Sub1_6550.anInt9884, arg3[var5], 0);
			}
		}
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public void method53() {
		super.method53();
	}

	public void method52() {
		super.method53();
	}

	public void method164() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}
}
