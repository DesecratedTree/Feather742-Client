package deob;

import jaggl.OpenGL;

public class Class264 implements Interface8_Impl1_Impl2, Interface8_Impl1_Impl1, Interface8_Impl1_Impl2_Impl1 {

	public Class72 aClass72_10267;

	public Class86 aClass86_10268;

	public int anInt10269;

	public int anInt10270;

	public Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_10271;

	public int anInt10272;

	public void method53() {
		if (this.anInt10272 > 0) {
			int[] var1 = new int[] { this.anInt10272 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.anInt10272 = 0;
		}
	}

	public Class264(Class_ra_Sub2_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5) {
		this.aClass72_10267 = arg1;
		this.aClass86_10268 = arg2;
		this.anInt10269 = arg3;
		this.anInt10270 = arg4;
		this.aClass_ra_Sub2_Sub1_10271 = arg0;
		int[] var7 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var7, 0);
		this.anInt10272 = var7[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10272);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class_ra_Sub2_Sub1.method5141(this.aClass72_10267, this.aClass86_10268), arg3, arg4);
	}

	public int method54() {
		return this.anInt10269;
	}

	public void method217(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt10272);
	}

	public Class264(Class_ra_Sub2_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		this.aClass72_10267 = arg1;
		this.aClass86_10268 = arg2;
		this.anInt10269 = arg3;
		this.anInt10270 = arg4;
		this.aClass_ra_Sub2_Sub1_10271 = arg0;
		int[] var6 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var6, 0);
		this.anInt10272 = var6[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt10272);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub2_Sub1.method5141(this.aClass72_10267, this.aClass86_10268), arg3, arg4);
	}

	public void method2644() {
		if (this.anInt10272 > 0) {
			this.aClass_ra_Sub2_Sub1_10271.method5140(this.anInt10272, this.anInt10269 * this.anInt10270 * this.aClass86_10268.anInt724 * -1700895659 * -1615628035 * this.aClass72_10267.anInt609 * 1612989855 * 2145490527);
			this.anInt10272 = 0;
		}
	}

	public int method58() {
		return this.anInt10269;
	}

	public int method55() {
		return this.anInt10270;
	}

	public int method56() {
		return this.anInt10269;
	}

	public int method60() {
		return this.anInt10270;
	}

	public int method61() {
		return this.anInt10270;
	}

	public void method52() {
		if (this.anInt10272 > 0) {
			int[] var1 = new int[] { this.anInt10272 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.anInt10272 = 0;
		}
	}

	public int method59() {
		return this.anInt10270;
	}

	public void method215(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt10272);
	}

	public void method216(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt10272);
	}

	public int method57() {
		return this.anInt10269;
	}
}
