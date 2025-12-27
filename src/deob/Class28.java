package deob;

import jaggl.OpenGL;

public class Class28 {

	public static int[] anIntArray335 = new int[2];

	public Class_ra_Sub1 aClass_ra_Sub1_334;

	public int anInt333;

	public Class28(Class_ra_Sub1 arg0, int arg1, Class35[] arg2) {
		this.aClass_ra_Sub1_334 = arg0;
		this.anInt333 = arg1;
	}

	public static Class28 method496(Class_ra_Sub1 arg0, Class35[] arg1) {
		int var2;
		for (var2 = 0; var2 < arg1.length; var2++) {
			if (arg1[var2] == null || arg1[var2].anInt366 <= 0) {
				return null;
			}
		}
		var2 = OpenGL.glCreateProgram();
		int var3;
		for (var3 = 0; var3 < arg1.length; var3++) {
			OpenGL.glAttachShader(var2, arg1[var3].anInt366);
		}
		OpenGL.glLinkProgram(var2);
		OpenGL.glGetProgramiv(var2, 35714, anIntArray335, 0);
		if (anIntArray335[0] == 0) {
			OpenGL.glGetProgramiv(var2, 35716, anIntArray335, 1);
			if (anIntArray335[1] > 1) {
				byte[] var4 = new byte[anIntArray335[1]];
				OpenGL.glGetProgramInfoLog(var2, anIntArray335[1], anIntArray335, 0, var4, 0);
				System.out.println(new String(var4));
			}
			if (anIntArray335[0] == 0) {
				for (var3 = 0; var3 < arg1.length; var3++) {
					OpenGL.glDetachShader(var2, arg1[var3].anInt366);
				}
				OpenGL.glDeleteProgram(var2);
				return null;
			}
		}
		return new Class28(arg0, var2, arg1);
	}
}
