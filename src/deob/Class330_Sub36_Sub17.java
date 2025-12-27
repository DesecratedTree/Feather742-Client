package deob;

import jaggl.OpenGL;

public class Class330_Sub36_Sub17 extends Class330_Sub36 implements Interface8_Impl1_Impl2_Impl2 {

	public static int[] anIntArray10174 = new int[1];

	public Class_ra_Sub1 aClass_ra_Sub1_10169;

	public int anInt10173;

	public int anInt10170;

	public Class72 aClass72_10172;

	public Class86 aClass86_10171;

	public int anInt10168;

	public int anInt10167;

	public Class330_Sub36_Sub17(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5) {
		this.aClass_ra_Sub1_10169 = arg0;
		this.anInt10173 = arg3;
		this.anInt10170 = arg4;
		this.aClass72_10172 = arg1;
		this.aClass86_10171 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10174, 0);
		this.anInt10168 = anIntArray10174[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10168);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class_ra_Sub1.method4870(this.aClass72_10172, this.aClass86_10171), this.anInt10173, this.anInt10170);
		this.anInt10167 = this.anInt10173 * this.anInt10170 * this.aClass72_10172.anInt609 * this.aClass86_10171.anInt724;
	}

	public int method60() {
		return this.anInt10170;
	}

	public int method55() {
		return this.anInt10170;
	}

	public int method61() {
		return this.anInt10170;
	}

	public void method53() {
		if (this.anInt10168 > 0) {
			int[] var1 = new int[] { this.anInt10168 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.anInt10168 = 0;
		}
	}

	public void method3534() {
		if (this.anInt10168 > 0) {
			this.aClass_ra_Sub1_10169.method4861(this.anInt10168, this.anInt10167);
			this.anInt10168 = 0;
		}
	}

	public void method1(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt10168);
	}

	public int method58() {
		return this.anInt10173;
	}

	public int method57() {
		return this.anInt10173;
	}

	public int method56() {
		return this.anInt10173;
	}

	public int method59() {
		return this.anInt10170;
	}

	public int method54() {
		return this.anInt10173;
	}

	public void method52() {
		if (this.anInt10168 > 0) {
			int[] var1 = new int[] { this.anInt10168 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.anInt10168 = 0;
		}
	}

	public Class330_Sub36_Sub17(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		this.aClass_ra_Sub1_10169 = arg0;
		this.anInt10173 = arg3;
		this.anInt10170 = arg4;
		this.aClass72_10172 = arg1;
		this.aClass86_10171 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10174, 0);
		this.anInt10168 = anIntArray10174[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10168);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub1.method4870(this.aClass72_10172, this.aClass86_10171), this.anInt10173, this.anInt10170);
		this.anInt10167 = this.anInt10173 * this.anInt10170 * this.aClass72_10172.anInt609 * this.aClass86_10171.anInt724;
	}

	public void method2(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt10168);
	}
}
