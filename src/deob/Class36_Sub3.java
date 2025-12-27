package deob;

import jaggl.OpenGL;

public class Class36_Sub3 extends Class36 {

	public static int anInt7024 = 1;

	public static int anInt7025 = 34074;

	public static int anInt7026 = 1;

	public static int anInt7027 = 34072;

	public static int anInt7028 = 1;

	public static int anInt7029 = 34070;

	public int anInt7030;

	public Class36_Sub3(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, boolean arg4, int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt7030 = arg3;
		this.aClass_ra_Sub1_373.method4844(this);
		int var7;
		if (arg4) {
			for (var7 = 0; var7 < 6; var7++) {
				method513(var7 + 34069, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg3, arg3, 32993, this.aClass_ra_Sub1_373.anInt8331, arg5[var7]);
			}
		} else {
			for (var7 = 0; var7 < 6; var7++) {
				OpenGL.glTexImage2Di(var7 + 34069, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg3, arg3, 0, 32993, this.aClass_ra_Sub1_373.anInt8331, arg5[var7], 0);
			}
		}
		this.method515(true);
	}

	public Class36_Sub3(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.anInt7030 = arg3;
		this.aClass_ra_Sub1_373.method4844(this);
		for (int var5 = 0; var5 < 6; var5++) {
			OpenGL.glTexImage2Dub(var5 + 34069, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg3, arg3, 0, Class_ra_Sub1.method4864(this.aClass72_376), 5121, null, 0);
		}
		this.method515(true);
	}

	public Class36_Sub3(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, boolean arg4, byte[][] arg5, Class72 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt7030 = arg3;
		this.aClass_ra_Sub1_373.method4844(this);
		for (int var8 = 0; var8 < 6; var8++) {
			OpenGL.glTexImage2Dub(var8 + 34069, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), arg3, arg3, 0, Class_ra_Sub1.method4864(arg6), 5121, arg5[var8], 0);
		}
		this.method515(true);
	}

	public Interface8_Impl1_Impl2 method532(int arg0, int arg1) {
		return new Class32(this, arg0, arg1);
	}
}
