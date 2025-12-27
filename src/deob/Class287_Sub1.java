package deob;

import jaggl.OpenGL;

public class Class287_Sub1 extends Class287 implements Interface11_Impl3_Impl1 {

	public int anInt10079;

	public int anInt10080;

	public void method109(boolean arg0, boolean arg1) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexParameteri(this.anInt6554, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt6554, 10243, arg1 ? 10497 : 33071);
	}

	public float method105(float arg0) {
		return arg0 / (float) this.anInt10079;
	}

	public Class287_Sub1(Class_ra_Sub2_Sub1 arg0, Class72 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, Class86.aClass86_714, arg2 * arg3, arg4);
		this.anInt10079 = arg2;
		this.anInt10080 = arg3;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method2878(this.anInt6554, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			Class72 var9 = this.aClass72_6546;
			if (this.aClass72_6546 != null) {
			}
			if (var9 == Class72.aClass72_617) {
				OpenGL.glCompressedTexImage2Dub(this.anInt6554, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else {
				Class72 var10 = this.aClass72_6546;
				if (this.aClass72_6546 != null) {
				}
				if (var10 == Class72.aClass72_618) {
					OpenGL.glCompressedTexImage2Dub(this.anInt6554, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
				} else {
					OpenGL.glTexImage2Dub(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg2, arg3, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5121, arg5, arg6);
				}
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public Class287_Sub1(Class_ra_Sub2_Sub1 arg0, Class72 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, Class86.aClass86_717, arg2 * arg3, arg4);
		this.anInt10079 = arg2;
		this.anInt10080 = arg3;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method2882(this.anInt6554, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg2, arg3, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public int method137() {
		return this.anInt10079;
	}

	public int method108() {
		return this.anInt10080;
	}

	public Class287_Sub1(Class_ra_Sub2_Sub1 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, 3553, Class72.aClass72_620, Class86.aClass86_714, arg1 * arg2, arg3);
		this.anInt10079 = arg1;
		this.anInt10080 = arg2;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method2881(this.anInt6554, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt6554, 0, 6408, this.anInt10079, this.anInt10080, 0, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public void method165() {
		super.method166();
	}

	public float method123() {
		return 1.0F;
	}

	public float method114() {
		return 1.0F;
	}

	public boolean method113() {
		return true;
	}

	public Interface8_Impl1_Impl2 method168(int arg0) {
		return new Class272(this, arg0);
	}

	public void method118(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	public int method116() {
		return this.anInt10079;
	}

	public int method140() {
		return this.anInt10080;
	}

	public void method110(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10079 * this.anInt10080];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10079, arg4, arg5 + var8 * arg2, arg2);
		}
	}

	public void method131(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10079 * this.anInt10080];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10079, arg4, arg5 + var8 * arg2, arg2);
		}
	}

	public void method122(boolean arg0, boolean arg1) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexParameteri(this.anInt6554, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.anInt6554, 10243, arg1 ? 10497 : 33071);
	}

	public void method166() {
		super.method166();
	}

	public void method163(Class189 arg0) {
		super.method163(arg0);
	}

	public void method53() {
		super.method53();
	}

	public void method52() {
		super.method53();
	}

	public float method106(float arg0) {
		return arg0 / (float) this.anInt10079;
	}

	public boolean method115() {
		return super.method115();
	}

	public float method112(float arg0) {
		return arg0 / (float) this.anInt10080;
	}

	public float method132(float arg0) {
		return arg0 / (float) this.anInt10080;
	}

	public void method117(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public boolean method120() {
		return true;
	}

	public int method141() {
		return this.anInt10080;
	}

	public void method111(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884 * -1466767273 * 33639, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method129(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.anInt6554, 0, arg0, arg1, arg2, arg3, 32993, this.aClass_ra_Sub2_Sub1_6550.anInt9884 * -1466767273 * 33639, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method125(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method2883(int arg0, int arg1, int arg2, int arg3, float[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Df(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method127(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method128(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method107(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method130(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method139() {
		return this.anInt10080;
	}

	public void method119(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.anInt10079 * this.anInt10080];
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(this.anInt6554, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg1 + (arg3 - 1) - var8) * this.anInt10079, arg4, arg5 + var8 * arg2, arg2);
		}
	}

	public Interface8_Impl1_Impl2 method169(int arg0) {
		return new Class272(this, arg0);
	}

	public float method134() {
		return 1.0F;
	}

	public float method135() {
		return 1.0F;
	}

	public boolean method136() {
		return super.method115();
	}

	public void method164() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public float method104(float arg0) {
		return arg0 / (float) this.anInt10080;
	}

	public void method167(Class189 arg0) {
		super.method163(arg0);
	}

	public int method124() {
		return this.anInt10080;
	}

	public int method138() {
		return this.anInt10080;
	}

	public Class287_Sub1(Class_ra_Sub2_Sub1 arg0, Class72 arg1, Class86 arg2, int arg3, int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt10079 = arg3;
		this.anInt10080 = arg4;
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexImage2Dub(this.anInt6554, 0, Class_ra_Sub2_Sub1.method5141(this.aClass72_6546, this.aClass86_6545), arg3, arg4, 0, Class_ra_Sub2_Sub1.method5152(this.aClass72_6546), Class_ra_Sub2_Sub1.method5147(this.aClass86_6545), null, 0);
	}

	public boolean method121() {
		return true;
	}

	public float method133() {
		return 1.0F;
	}

	public void method126(int arg0, int arg1, int arg2, int arg3, byte[] arg4, Class72 arg5, int arg6, int arg7) {
		this.aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.anInt6554, 0, arg0, arg1, arg2, arg3, Class_ra_Sub2_Sub1.method5152(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
