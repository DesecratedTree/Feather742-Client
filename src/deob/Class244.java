package deob;

public class Class244 {

	public static Class244[] aClass244Array2611 = new Class244[0];

	public float aFloat2608;

	public float aFloat2612;

	public float aFloat2613;

	public float aFloat2614;

	public static int anInt2609;

	public static int anInt2610;

	static {
		new Class244();
	}

	public final void method2415(Class244 arg0) {
		this.aFloat2608 += arg0.aFloat2608;
		this.aFloat2612 += arg0.aFloat2612;
		this.aFloat2613 += arg0.aFloat2613;
		this.aFloat2614 += arg0.aFloat2614;
	}

	public Class244(Class244 arg0) {
		this.method2419(arg0);
	}

	public static Class244 method2416(Class244 arg0) {
		Class244[] var1 = aClass244Array2611;
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				return new Class244(arg0);
			} else {
				aClass244Array2611[--anInt2610].method2419(arg0);
				return aClass244Array2611[anInt2610];
			}
		}
	}

	public void method2417() {
		Class244[] var1 = aClass244Array2611;
		synchronized (aClass244Array2611) {
			if (anInt2610 < anInt2609 - 1) {
				aClass244Array2611[anInt2610++] = this;
			}
		}
	}

	public Class244() {
		this.method2421();
	}

	public Class244(float arg0, float arg1, float arg2) {
		this.method2420(arg0, arg1, arg2);
	}

	public void method2418(float arg0, float arg1, float arg2, float arg3) {
		this.aFloat2608 = arg0;
		this.aFloat2612 = arg1;
		this.aFloat2613 = arg2;
		this.aFloat2614 = arg3;
	}

	public void method2419(Class244 arg0) {
		this.aFloat2608 = arg0.aFloat2608;
		this.aFloat2612 = arg0.aFloat2612;
		this.aFloat2613 = arg0.aFloat2613;
		this.aFloat2614 = arg0.aFloat2614;
	}

	public void method2420(float arg0, float arg1, float arg2) {
		this.method2427(0.0F, 1.0F, 0.0F, arg0);
		Class244 var4 = method2428();
		var4.method2427(1.0F, 0.0F, 0.0F, arg1);
		this.method2429(var4);
		var4.method2427(0.0F, 0.0F, 1.0F, arg2);
		this.method2429(var4);
		var4.method2417();
	}

	public final void method2421() {
		this.aFloat2613 = 0.0F;
		this.aFloat2612 = 0.0F;
		this.aFloat2608 = 0.0F;
		this.aFloat2614 = 1.0F;
	}

	public final void method2422() {
		this.aFloat2608 = -this.aFloat2608;
		this.aFloat2612 = -this.aFloat2612;
		this.aFloat2613 = -this.aFloat2613;
		this.aFloat2614 = -this.aFloat2614;
	}

	public final void method2423() {
		this.aFloat2608 = -this.aFloat2608;
		this.aFloat2612 = -this.aFloat2612;
		this.aFloat2613 = -this.aFloat2613;
	}

	public final void method2424() {
		float var1 = 1.0F / method2433(this);
		this.aFloat2608 *= var1;
		this.aFloat2612 *= var1;
		this.aFloat2613 *= var1;
		this.aFloat2614 *= var1;
	}

	public void method2425(Class260 arg0, float arg1) {
		this.method2427(arg0.aFloat2716, arg0.aFloat2715, arg0.aFloat2711, arg1);
	}

	public final float method2426(Class244 arg0) {
		return this.aFloat2608 * arg0.aFloat2608 + this.aFloat2612 * arg0.aFloat2612 + this.aFloat2613 * arg0.aFloat2613 + this.aFloat2614 * arg0.aFloat2614;
	}

	public void method2427(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.sin((double) (arg3 * 0.5F));
		float var6 = (float) Math.cos((double) (arg3 * 0.5F));
		this.aFloat2608 = arg0 * var5;
		this.aFloat2612 = arg1 * var5;
		this.aFloat2613 = arg2 * var5;
		this.aFloat2614 = var6;
	}

	public static Class244 method2428() {
		Class244[] var0 = aClass244Array2611;
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				return new Class244();
			} else {
				aClass244Array2611[--anInt2610].method2421();
				return aClass244Array2611[anInt2610];
			}
		}
	}

	public final void method2429(Class244 arg0) {
		this.method2418(arg0.aFloat2614 * this.aFloat2608 + arg0.aFloat2608 * this.aFloat2614 + arg0.aFloat2612 * this.aFloat2613 - arg0.aFloat2613 * this.aFloat2612, arg0.aFloat2614 * this.aFloat2612 - arg0.aFloat2608 * this.aFloat2613 + arg0.aFloat2612 * this.aFloat2614 + arg0.aFloat2613 * this.aFloat2608, arg0.aFloat2614 * this.aFloat2613 + arg0.aFloat2608 * this.aFloat2612 - arg0.aFloat2612 * this.aFloat2608 + arg0.aFloat2613 * this.aFloat2614, arg0.aFloat2614 * this.aFloat2614 - arg0.aFloat2608 * this.aFloat2608 - arg0.aFloat2612 * this.aFloat2612 - arg0.aFloat2613 * this.aFloat2613);
	}

	public final void method2430(float arg0) {
		this.aFloat2608 *= arg0;
		this.aFloat2612 *= arg0;
		this.aFloat2613 *= arg0;
		this.aFloat2614 *= arg0;
	}

	public static final Class244 method2431(Class244 arg0, float arg1) {
		Class244 var2 = method2416(arg0);
		var2.method2430(arg1);
		return var2;
	}

	public final void method2432(Class244 arg0, float arg1) {
		if (this.method2426(arg0) < 0.0F) {
			this.method2422();
		}
		this.method2430(1.0F - arg1);
		Class244 var3 = method2431(arg0, arg1);
		this.method2415(var3);
		var3.method2417();
		this.method2424();
	}

	public String toString() {
		return this.aFloat2608 + "," + this.aFloat2612 + "," + this.aFloat2613 + "," + this.aFloat2614;
	}

	public static final float method2433(Class244 arg0) {
		return (float) Math.sqrt((double) method2435(arg0, arg0));
	}

	public void method2434(Buffer arg0) {
		this.aFloat2608 = arg0.method3760(-1279245802);
		this.aFloat2612 = arg0.method3760(-1279245802);
		this.aFloat2613 = arg0.method3760(-1279245802);
		this.aFloat2614 = arg0.method3760(-1279245802);
	}

	public static final float method2435(Class244 arg0, Class244 arg1) {
		return arg0.method2426(arg1);
	}

	public static void method2436(int arg0) {
		anInt2609 = arg0;
		aClass244Array2611 = new Class244[arg0];
		anInt2610 = 0;
	}

	public static Class244 method2437(float arg0, float arg1, float arg2, float arg3) {
		Class244[] var4 = aClass244Array2611;
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				return new Class244(arg0, arg1, arg2, arg3);
			} else {
				aClass244Array2611[--anInt2610].method2418(arg0, arg1, arg2, arg3);
				return aClass244Array2611[anInt2610];
			}
		}
	}

	public Class244(float arg0, float arg1, float arg2, float arg3) {
		this.method2418(arg0, arg1, arg2, arg3);
	}

	public static final Class244 method2438(Class244 arg0) {
		Class244 var1 = method2416(arg0);
		var1.method2423();
		return var1;
	}

	public static final Class244 method2439(Class244 arg0, Class244 arg1) {
		Class244 var2 = method2416(arg0);
		var2.method2429(arg1);
		return var2;
	}
}
