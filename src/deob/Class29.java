package deob;

import jaggl.OpenGL;

public class Class29 {

	public static int[] anIntArray336 = new int[1];

	public static int anInt337 = 34336;

	public Class_ra_Sub1 aClass_ra_Sub1_339;

	public int anInt338;

	public Class29(Class_ra_Sub1 arg0, int arg1, int arg2) {
		this.aClass_ra_Sub1_339 = arg0;
		this.anInt338 = arg2;
	}

	public static Class29 method497(Class_ra_Sub1 arg0, int arg1, String arg2) {
		int var3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, var3);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray336, 0);
		if (anIntArray336[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class29(arg0, arg1, var3);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}
}
