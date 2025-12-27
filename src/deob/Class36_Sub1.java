package deob;

import jaggl.OpenGL;

public class Class36_Sub1 extends Class36 {

	public int anInt7020;

	public int anInt7019;

	public Class36_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, boolean arg8) {
		super(arg0, arg1, Class72.aClass72_620, Class86.aClass86_714, arg2 * arg3, arg4);
		this.anInt7020 = arg2;
		this.anInt7019 = arg3;
		if (arg8) {
			int[] var10 = new int[arg5.length];
			for (int var11 = 0; var11 < arg3; var11++) {
				int var12 = var11 * arg2;
				int var13 = (arg3 - var11 - 1) * arg2;
				for (int var14 = 0; var14 < arg2; var14++) {
					var10[var12++] = arg5[var13++];
				}
			}
			arg5 = var10;
		}
		this.aClass_ra_Sub1_373.method4844(this);
		if (this.anInt375 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method513(this.anInt375, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7020, this.anInt7019, 32993, this.aClass_ra_Sub1_373.anInt8331, arg5);
			this.method508(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7020, this.anInt7019, 0, 32993, this.aClass_ra_Sub1_373.anInt8331, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method508(false);
		}
		this.method515(true);
	}

	public Class36_Sub1(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, int arg5, boolean arg6, byte[] arg7, Class72 arg8, boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt7020 = arg4;
		this.anInt7019 = arg5;
		if (arg9) {
			byte[] var11 = new byte[arg7.length];
			for (int var12 = 0; var12 < arg5; var12++) {
				int var13 = var12 * arg4;
				int var14 = (arg5 - var12 - 1) * arg4;
				for (int var15 = 0; var15 < arg4; var15++) {
					var11[var13++] = arg7[var14++];
				}
			}
			arg7 = var11;
		}
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.anInt375 != 34037) {
			method514(arg1, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg4, arg5, arg8, arg7);
			this.method508(true);
		} else {
			OpenGL.glTexImage2Dub(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7020, this.anInt7019, 0, Class_ra_Sub1.method4864(arg8), 5121, arg7, 0);
			this.method508(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method515(true);
	}

	public Class36_Sub1(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, int arg5, boolean arg6, float[] arg7, Class72 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt7020 = arg4;
		this.anInt7019 = arg5;
		this.aClass_ra_Sub1_373.method4844(this);
		if (arg6 && this.anInt375 != 34037) {
			method517(arg1, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg4, arg5, arg8, arg7);
			this.method508(true);
		} else {
			OpenGL.glTexImage2Df(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7020, this.anInt7019, 0, Class_ra_Sub1.method4864(arg8), 5126, arg7, 0);
			this.method508(false);
		}
		this.method515(true);
	}

	public void method518(boolean arg0, boolean arg1) {
		if (this.anInt375 == 3553) {
			this.aClass_ra_Sub1_373.method4844(this);
			OpenGL.glTexParameteri(this.anInt375, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt375, 10243, arg1 ? 10497 : 33071);
		}
	}

	public void method519(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7, boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			int var10 = arg5.anInt609;
			int var11 = var10 * arg2;
			int var12 = var10 * arg7;
			byte[] var13 = new byte[var11 * arg3];
			for (int var14 = 0; var14 < arg3; var14++) {
				int var15 = var14 * var11;
				int var16 = (arg3 - var14 - 1) * var12 + arg6;
				for (int var17 = 0; var17 < var11; var17++) {
					var13[var15++] = arg4[var16++];
				}
			}
			arg4 = var13;
		}
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt375, 0, arg0, this.anInt7019 - arg1 - arg3, arg2, arg3, Class_ra_Sub1.method4864(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Class76 var7 = this.aClass_ra_Sub1_373.method4782((byte) 0);
		if (var7 != null) {
			int var8 = var7.method857() - (arg5 + arg3);
			this.aClass_ra_Sub1_373.method4844(this);
			OpenGL.glCopyTexSubImage2D(this.anInt375, 0, arg0, this.anInt7019 - (arg1 + arg3), arg4, var8, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	public Interface8_Impl1_Impl1 method521(int arg0) {
		return new Class54(this, arg0);
	}

	public Class36_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, Class72.aClass72_614, Class86.aClass86_714, arg4 * arg5, false);
		this.anInt7020 = arg4;
		this.anInt7019 = arg5;
		this.aClass_ra_Sub1_373.method4844(this);
		Class76 var7 = this.aClass_ra_Sub1_373.method4782((byte) 0);
		if (var7 != null) {
			int var8 = var7.method857() - (arg3 + arg5);
			int var9 = Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370);
			OpenGL.glCopyTexImage2D(this.anInt375, 0, var9, arg2, var8, arg4, arg5, 0);
		}
		this.method515(true);
	}

	public void method522(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			int[] var9 = new int[arg2 * arg3];
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = var10 * arg2;
				int var12 = (arg3 - var10 - 1) * arg6 + arg5;
				for (int var13 = 0; var13 < arg2; var13++) {
					var9[var11++] = arg4[var12++];
				}
			}
			arg4 = var9;
		}
		this.aClass_ra_Sub1_373.method4844(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt375, 0, arg0, this.anInt7019 - arg1 - arg3, arg2, arg3, 32993, this.aClass_ra_Sub1_373.anInt8331, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public Interface8_Impl1_Impl2 method523(int arg0) {
		return new Class54(this, arg0);
	}

	public Class36_Sub1(Class_ra_Sub1 arg0, int arg1, Class72 arg2, Class86 arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.anInt7020 = arg4;
		this.anInt7019 = arg5;
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexImage2Dub(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg4, arg5, 0, Class_ra_Sub1.method4864(this.aClass72_376), 5121, null, 0);
		this.method515(true);
	}
}
