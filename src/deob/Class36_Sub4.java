package deob;

import jaggl.OpenGL;

public class Class36_Sub4 extends Class36 {

	public int anInt7031;

	public Class36_Sub4(Class_ra_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, byte[] arg4, Class72 arg5) {
		super(arg0, 3552, arg1, arg2, arg3, false);
		this.anInt7031 = arg3;
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(this.anInt375, 0, Class_ra_Sub1.method4870(this.aClass72_376, this.aClass86_370), this.anInt7031, 0, Class_ra_Sub1.method4864(arg5), 5121, arg4, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method515(true);
	}

	public void method533(boolean arg0) {
		this.aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexParameteri(this.anInt375, 10242, arg0 ? 10497 : 33071);
	}
}
