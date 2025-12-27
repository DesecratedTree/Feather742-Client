package deob;

import jaggl.OpenGL;

public class Class36_Sub2 extends Class36 {

	public int anInt7022;

	public int anInt7021;

	public int anInt7023;

	public void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glCopyTexSubImage3D(this.anInt375, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
		OpenGL.glFlush();
	}

	public Class36_Sub2(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5, byte[] arg6, Class72 arg7) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt7022 = arg3;
		this.anInt7021 = arg4;
		this.anInt7023 = arg5;
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7022, this.anInt7021, this.anInt7023, 0, Class_ra_Sub1.method4864(arg7), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method515(true);
	}

	public Class36_Sub2(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4, int arg5) {
		super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
		this.anInt7022 = arg3;
		this.anInt7021 = arg4;
		this.anInt7023 = arg5;
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexImage3Dub(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7022, this.anInt7021, this.anInt7023, 0, Class_ra_Sub1.method4864(this.aClass72_376), 5121, null, 0);
		this.method515(true);
	}
}
