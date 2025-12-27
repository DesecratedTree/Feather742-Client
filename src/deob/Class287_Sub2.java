package deob;

import jaggl.OpenGL;

public class Class287_Sub2 extends Class287 implements Interface11_Impl2 {

	public int anInt8948;

	public int anInt8949;

	public int anInt8950;

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public void method166() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public void method53() {
		super.method53();
	}

	public void method52() {
		super.method53();
	}

	public Class287_Sub2(Class_ra_Sub2_Sub1 arg0, Class72 arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, 32879, arg1, Class86.aClass86_714, arg2 * arg3 * arg4, arg5);
		this.anInt8948 = arg2;
		this.anInt8949 = arg3;
		this.anInt8950 = arg4;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), this.anInt8948, this.anInt8949, this.anInt8950, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method115();
		}
	}

	public void method164() {
		super.method166();
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}
}
