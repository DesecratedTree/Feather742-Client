package deob;

public class Class260 {

	public float aFloat2716;

	public float aFloat2715;

	public float aFloat2711;

	public static Class260[] aClass260Array2714;

	public static int anInt2712;

	public static int anInt2713;

	public static Class260 method2548() {
		Class260[] var0 = aClass260Array2714;
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				return new Class260();
			} else {
				aClass260Array2714[--anInt2713].method2554();
				return aClass260Array2714[anInt2713];
			}
		}
	}

	public static Class260 method2549(Class260 arg0) {
		Class260[] var1 = aClass260Array2714;
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				return new Class260(arg0);
			} else {
				aClass260Array2714[--anInt2713].method2582(arg0);
				return aClass260Array2714[anInt2713];
			}
		}
	}

	public void method2550() {
		Class260[] var1 = aClass260Array2714;
		synchronized (aClass260Array2714) {
			if (anInt2713 < anInt2712 - 1) {
				aClass260Array2714[anInt2713++] = this;
			}
		}
	}

	public Class260() {
	}

	public Class260(float arg0, float arg1, float arg2) {
		this.aFloat2716 = arg0;
		this.aFloat2715 = arg1;
		this.aFloat2711 = arg2;
	}

	public Class260(Class260 arg0) {
		this.aFloat2716 = arg0.aFloat2716;
		this.aFloat2715 = arg0.aFloat2715;
		this.aFloat2711 = arg0.aFloat2711;
	}

	public final void method2551() {
		if (this.aFloat2716 < 0.0F) {
			this.aFloat2716 *= -1.0F;
		}
		if (this.aFloat2715 < 0.0F) {
			this.aFloat2715 *= -1.0F;
		}
		if (this.aFloat2711 < 0.0F) {
			this.aFloat2711 *= -1.0F;
		}
	}

	public void method2552(Buffer arg0) {
		this.aFloat2716 = arg0.method3760(-1279245802);
		this.aFloat2715 = arg0.method3760(-1279245802);
		this.aFloat2711 = arg0.method3760(-1279245802);
	}

	public void method2553(float arg0, float arg1, float arg2) {
		this.aFloat2716 = arg0;
		this.aFloat2715 = arg1;
		this.aFloat2711 = arg2;
	}

	public final void method2554() {
		this.aFloat2711 = 0.0F;
		this.aFloat2715 = 0.0F;
		this.aFloat2716 = 0.0F;
	}

	public boolean method2555(Class260 arg0) {
		return this.aFloat2716 == arg0.aFloat2716 && this.aFloat2715 == arg0.aFloat2715 && this.aFloat2711 == arg0.aFloat2711;
	}

	public final void method2556() {
		this.aFloat2716 = -this.aFloat2716;
		this.aFloat2715 = -this.aFloat2715;
		this.aFloat2711 = -this.aFloat2711;
	}

	public final void method2557() {
		float var1 = 1.0F / this.method2565();
		this.aFloat2716 *= var1;
		this.aFloat2715 *= var1;
		this.aFloat2711 *= var1;
	}

	public final void method2558(Class260 arg0) {
		this.aFloat2716 += arg0.aFloat2716;
		this.aFloat2715 += arg0.aFloat2715;
		this.aFloat2711 += arg0.aFloat2711;
	}

	public Class260(Buffer arg0) {
		this.aFloat2716 = arg0.method3760(-1279245802);
		this.aFloat2715 = arg0.method3760(-1279245802);
		this.aFloat2711 = arg0.method3760(-1279245802);
	}

	public final void method2559(Class260 arg0) {
		this.aFloat2716 -= arg0.aFloat2716;
		this.aFloat2715 -= arg0.aFloat2715;
		this.aFloat2711 -= arg0.aFloat2711;
	}

	public final void method2560(Class260 arg0) {
		this.aFloat2716 /= arg0.aFloat2716;
		this.aFloat2715 /= arg0.aFloat2715;
		this.aFloat2711 /= arg0.aFloat2711;
	}

	public static final Class260 method2561(Class260 arg0, Class260 arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2559(arg1);
		return var2;
	}

	public static final float method2562(Class260 arg0, Class260 arg1) {
		return arg0.method2576(arg1);
	}

	public final void method2563(Class260 arg0) {
		this.method2553(this.aFloat2715 * arg0.aFloat2711 - this.aFloat2711 * arg0.aFloat2715, this.aFloat2711 * arg0.aFloat2716 - this.aFloat2716 * arg0.aFloat2711, this.aFloat2716 * arg0.aFloat2715 - this.aFloat2715 * arg0.aFloat2716);
	}

	public static final Class260 method2564(Class260 arg0, Class260 arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2563(arg1);
		return var2;
	}

	public final float method2565() {
		return (float) Math.sqrt((double) (this.aFloat2716 * this.aFloat2716 + this.aFloat2715 * this.aFloat2715 + this.aFloat2711 * this.aFloat2711));
	}

	public static final Class260 method2566(Class260 arg0, Class260 arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2581(arg1);
		return var2;
	}

	public final void method2567(float arg0) {
		this.aFloat2716 *= arg0;
		this.aFloat2715 *= arg0;
		this.aFloat2711 *= arg0;
	}

	public static final Class260 method2568(Class260 arg0, Class260 arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2560(arg1);
		return var2;
	}

	public final void method2569(float arg0) {
		this.aFloat2716 /= arg0;
		this.aFloat2715 /= arg0;
		this.aFloat2711 /= arg0;
	}

	public final void method2570(Class244 arg0) {
		Class244 var2 = Class244.method2437(this.aFloat2716, this.aFloat2715, this.aFloat2711, 0.0F);
		Class244 var3 = Class244.method2438(arg0);
		Class244 var4 = Class244.method2439(var3, var2);
		var4.method2429(arg0);
		this.method2553(var4.aFloat2608, var4.aFloat2612, var4.aFloat2613);
		var2.method2417();
		var3.method2417();
		var4.method2417();
	}

	public final void method2571(Class260 arg0, float arg1) {
		this.aFloat2716 += arg0.aFloat2716 * arg1;
		this.aFloat2715 += arg0.aFloat2715 * arg1;
		this.aFloat2711 += arg0.aFloat2711 * arg1;
	}

	public final void method2572(Class260 arg0, float arg1) {
		this.method2567(1.0F - arg1);
		this.method2558(method2574(arg0, arg1));
	}

	static {
		new Class260(0.0F, 0.0F, 0.0F);
		aClass260Array2714 = new Class260[0];
	}

	public final void method2573(Class247 arg0) {
		float var2 = this.aFloat2716;
		float var3 = this.aFloat2715;
		this.aFloat2716 = arg0.aFloat2618 * var2 + arg0.aFloat2620 * var3 + arg0.aFloat2626 * this.aFloat2711 + arg0.aFloat2627;
		this.aFloat2715 = arg0.aFloat2619 * var2 + arg0.aFloat2622 * var3 + arg0.aFloat2625 * this.aFloat2711 + arg0.aFloat2628;
		this.aFloat2711 = arg0.aFloat2617 * var2 + arg0.aFloat2623 * var3 + arg0.aFloat2624 * this.aFloat2711 + arg0.aFloat2629;
	}

	public static final Class260 method2574(Class260 arg0, float arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2567(arg1);
		return var2;
	}

	public final void method2575(Class247 arg0) {
		float var2 = this.aFloat2716;
		float var3 = this.aFloat2715;
		this.aFloat2716 = arg0.aFloat2618 * var2 + arg0.aFloat2620 * var3 + arg0.aFloat2626 * this.aFloat2711;
		this.aFloat2715 = arg0.aFloat2619 * var2 + arg0.aFloat2622 * var3 + arg0.aFloat2625 * this.aFloat2711;
		this.aFloat2711 = arg0.aFloat2617 * var2 + arg0.aFloat2623 * var3 + arg0.aFloat2624 * this.aFloat2711;
	}

	public final float method2576(Class260 arg0) {
		return this.aFloat2716 * arg0.aFloat2716 + this.aFloat2715 * arg0.aFloat2715 + this.aFloat2711 * arg0.aFloat2711;
	}

	public String toString() {
		return this.aFloat2716 + ", " + this.aFloat2715 + ", " + this.aFloat2711;
	}

	public static Class260 method2577(float arg0, float arg1, float arg2) {
		Class260[] var3 = aClass260Array2714;
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				return new Class260(arg0, arg1, arg2);
			} else {
				aClass260Array2714[--anInt2713].method2553(arg0, arg1, arg2);
				return aClass260Array2714[anInt2713];
			}
		}
	}

	public static final Class260 method2578(Class260 arg0, Class260 arg1) {
		Class260 var2 = method2549(arg0);
		var2.method2558(arg1);
		return var2;
	}

	public final void method2579(float arg0, float arg1, float arg2) {
		this.aFloat2716 -= arg0;
		this.aFloat2715 -= arg1;
		this.aFloat2711 -= arg2;
	}

	public static void method2580(int arg0) {
		anInt2712 = arg0;
		aClass260Array2714 = new Class260[arg0];
		anInt2713 = 0;
	}

	public final void method2581(Class260 arg0) {
		this.aFloat2716 *= arg0.aFloat2716;
		this.aFloat2715 *= arg0.aFloat2715;
		this.aFloat2711 *= arg0.aFloat2711;
	}

	public void method2582(Class260 arg0) {
		this.method2553(arg0.aFloat2716, arg0.aFloat2715, arg0.aFloat2711);
	}
}
