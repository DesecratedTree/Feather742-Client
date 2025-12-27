package deob;

public abstract class Class61 implements Interface30 {

	public final void method679(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, Class_ta arg6, int arg7, int arg8) {
		this.method703(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
	}

	public final void method686(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.method697(arg0, arg1, (float) this.method318() / 2.0F, (float) this.method683() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method687(int arg0, int arg1) {
		this.method688(arg0, arg1, 1, -1, 1);
	}

	public final void method690(int arg0, int arg1, int arg2, int arg3) {
		this.method736(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
	}

	public final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.method736(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
	}

	public final void method695(float arg0, float arg1, int arg2, int arg3) {
		this.method697(arg0, arg1, (float) this.method318() / 2.0F, (float) this.method683() / 2.0F, arg2, arg3, 1, -1, 1);
	}

	public final void method697(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg4 == 0) {
			return;
		}
		double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		float var12 = (float) Math.sin(var10) * (float) arg4;
		float var13 = (float) Math.cos(var10) * (float) arg4;
		float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var20;
		float var15 = ((var20 = arg2 - 1.0F) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var16 = (((float) this.method318() - var20) * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var17 = (-((float) this.method318() - var20) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var18 = (-var20 * var13 + ((float) this.method683() - arg3) * var12) / 4096.0F + arg0;
		float var21;
		float var19 = ((var21 = var20 - 1.0F) * var12 + ((float) this.method683() - arg3) * var13) / 4096.0F + arg1;
		this.method715(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
	}

	public final void method698(float arg0, float arg1, int arg2, int arg3, Class_ta arg4, int arg5, int arg6) {
		this.method734(arg0, arg1, (float) this.method318() / 2.0F, (float) this.method683() / 2.0F, arg2, arg3, arg4, arg5, arg6);
	}

	public final void method715(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
		this.method735(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
	}

	public final void method721(int arg0, int arg1, int arg2, int arg3) {
		this.method694(arg0, arg1, arg2, arg3, 1, -1, 1);
	}

	public final void method734(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, Class_ta arg6, int arg7, int arg8) {
		if (arg4 == 0) {
			return;
		}
		double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
		float var12 = (float) Math.sin(var10) * (float) arg4;
		float var13 = (float) Math.cos(var10) * (float) arg4;
		float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var20;
		float var15 = ((var20 = arg2 - 1.0F) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var16 = (((float) this.method318() - var20) * var13 + -arg3 * var12) / 4096.0F + arg0;
		float var17 = (-((float) this.method318() - var20) * var12 + -arg3 * var13) / 4096.0F + arg1;
		float var18 = (-var20 * var13 + ((float) this.method683() - arg3) * var12) / 4096.0F + arg0;
		float var21;
		float var19 = ((var21 = var20 - 1.0F) * var12 + ((float) this.method683() - arg3) * var13) / 4096.0F + arg1;
		this.method679(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
	}

	public abstract Interface8_Impl1_Impl2 method678();

	public abstract void method680(int[] arg0);

	public abstract int method681();

	public abstract int method318();

	public abstract int method682();

	public abstract int method683();

	public abstract Interface8_Impl1_Impl2 method684();

	public abstract void method685(int arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method689(int arg0, int arg1, Class_ta arg2, int arg3, int arg4);

	public abstract void method692(int[] arg0);

	public abstract int method693();

	public abstract void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public abstract int method696();

	public abstract int method699();

	public abstract void method700(int arg0, int arg1, int arg2, int arg3, int arg4);

	public abstract void method701(int arg0, int arg1, int arg2, int arg3);

	public abstract int method702();

	public abstract void method703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9);

	public abstract void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	public abstract void method705(int arg0, int arg1, int arg2);

	public abstract void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract Interface8_Impl1_Impl2 method707();

	public abstract void method708(int arg0, int arg1, Class_ta arg2, int arg3, int arg4);

	public abstract void method709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract int method711();

	public abstract void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract Interface8_Impl1_Impl2 method713();

	public abstract int method714();

	public abstract int method716();

	public abstract void method717(int arg0, int arg1, int arg2, int arg3);

	public abstract int method718();

	public abstract int method719();

	public abstract int method316();

	public abstract int method315();

	public abstract void method720(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9);

	public abstract void method722(int arg0, int arg1, int arg2);

	public abstract int method723();

	public abstract int method724();

	public abstract void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public abstract void method726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public abstract void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public abstract void method728(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

	public abstract Interface8_Impl1_Impl2 method729();

	public abstract void method730(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

	public abstract void method731(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9);

	public abstract void method732(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9);

	public abstract void method733(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, Class_ta arg7, int arg8, int arg9);

	public abstract void method735(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

	public abstract void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public abstract int method317();

	public abstract void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
