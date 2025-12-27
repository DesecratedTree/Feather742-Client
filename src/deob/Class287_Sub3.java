package deob;

import jaggl.OpenGL;

public class Class287_Sub3 extends Class287 implements Interface11_Impl3_Impl1 {

	public int anInt10082;

	public int anInt10081;

	public void method117(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method112(float arg0) {
		return arg0;
	}

	public Class287_Sub3(Class_ra_Sub2_Sub1 arg0, Class72 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
		super(arg0, 34037, arg1, Class86.aClass86_714, arg2 * arg3, false);
		this.anInt10082 = arg2;
		this.anInt10081 = arg3;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg2, arg3, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method109(boolean arg0, boolean arg1) {
	}

	public int method137() {
		return this.anInt10082;
	}

	public void method128(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method52() {
		super.method53();
	}

	public float method104(float arg0) {
		return arg0;
	}

	public float method132(float arg0) {
		return arg0;
	}

	public float method114() {
		return 1.0F;
	}

	public boolean method113() {
		return false;
	}

	public boolean method115() {
		return super.method115();
	}

	public void method118(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public boolean method121() {
		return false;
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public Interface8_Impl1_Impl2 method169(int arg0) {
		return new Class265(this, arg0);
	}

	public Class287_Sub3(Class_ra_Sub2_Sub1 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		super(arg0, 34037, Class72.aClass72_620, Class86.aClass86_714, arg1 * arg2, false);
		this.anInt10082 = arg1;
		this.anInt10081 = arg2;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(this.anInt6554, 0, 6408, this.anInt10082, this.anInt10081, 0, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method123() {
		return 1.0F;
	}

	public void method127(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method53() {
		super.method53();
	}

	public float method134() {
		return 1.0F;
	}

	public int method116() {
		return this.anInt10082;
	}

	public float method105(float arg0) {
		return arg0;
	}

	public boolean method136() {
		return super.method115();
	}

	public int method138() {
		return this.anInt10081;
	}

	public boolean method120() {
		return false;
	}

	public Class287_Sub3(Class_ra_Sub2_Sub1 arg0, Class72 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
		super(arg0, 34037, arg1, Class86.aClass86_717, arg2 * arg3, false);
		this.anInt10082 = arg2;
		this.anInt10081 = arg3;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg2, arg3, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method122(boolean arg0, boolean arg1) {
	}

	public void method111(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884 * -1466767273 * 33639, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public void method129(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884 * -1466767273 * 33639, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public void method125(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method126(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}

	public void method131(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10082 * this.anInt10081];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10082, arg4, arg5 + var8 * arg2, arg2);
		}
	}

	public void method107(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method130(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method108() {
		return this.anInt10081;
	}

	public void method119(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10082 * this.anInt10081];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10082, arg4, arg5 + var8 * arg2, arg2);
		}
	}

	public float method133() {
		return 1.0F;
	}

	public Class287_Sub3(Class_ra_Sub2_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt10082 = arg3;
		this.anInt10081 = arg4;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexImage2Dub(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg3, arg4, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), Class_ra_Sub2_Sub1.method5147(this.aClass86_6545), null, 0);
	}

	public float method135() {
		return 1.0F;
	}

	public void method110(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10082 * this.anInt10081];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10082, arg4, arg5 + var8 * arg2, arg2);
		}
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

	public int method141() {
		return this.anInt10081;
	}

	public int method124() {
		return this.anInt10081;
	}

	public void method166() {
		super.method166();
	}

	public int method139() {
		return this.anInt10081;
	}

	public int method140() {
		return this.anInt10081;
	}

	public float method106(float arg0) {
		return arg0;
	}

	public Interface8_Impl1_Impl2 method168(int arg0) {
		return new Class265(this, arg0);
	}
}
