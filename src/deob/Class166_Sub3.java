package deob;

public abstract class Class166_Sub3 extends Class166 {

	public float aFloat7335 = 0.0F;

	public float aFloat7337 = 0.0F;

	public Class245 aClass245_7336;

	public Class166_Sub3(Class145 arg0) {
		super(arg0);
	}

	public Class260 method1968(byte arg0) {
		try {
			return Class260.method2549(this.aClass245_7336.method2443(this.aFloat7335));
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aas.i(" + ')');
		}
	}

	public void method2012(Class245 arg0, int arg1, int arg2) {
		try {
			this.aClass245_7336 = arg0;
			this.aFloat7335 = 0.0F;
			this.aFloat7337 = 0.0F;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aas.h(" + ')');
		}
	}

	public void method1966(float arg0, Class307 arg1, int[][][] arg2, int arg3) {
		try {
			float var5 = this.aClass245_7336.method2447();
			if (!(this.aFloat7335 >= var5)) {
				this.aFloat7337 = this.method2014(var5, this.aFloat7337, arg0, 263075199);
				this.aFloat7335 += this.aFloat7337;
				if (this.aFloat7335 > var5) {
					this.aFloat7335 = var5;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aas.r(" + ')');
		}
	}

	public boolean method1976() {
		return this.aClass245_7336 != null;
	}

	public Class260 method1979() {
		return Class260.method2549(this.aClass245_7336.method2443(this.aFloat7335));
	}

	public Class330_Sub28 method1969(byte arg0) {
		try {
			Class260 var2 = this.aClass245_7336.method2443(this.aFloat7335);
			return new Class330_Sub28(0, (int) var2.aFloat2716, (int) var2.aFloat2715, (int) var2.aFloat2711);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aas.p(" + ')');
		}
	}

	public boolean method1985(int arg0) {
		try {
			return this.aClass245_7336 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aas.j(" + ')');
		}
	}

	public void method1970(Class138 arg0, int arg1, int arg2, byte arg3) {
		try {
			Class260 var5 = this.aClass245_7336.method2443(this.aFloat7335);
			arg0.anInt1532 = (int) var5.aFloat2716 - arg1;
			arg0.anInt1531 = (int) -var5.aFloat2715;
			arg0.anInt1533 = (int) var5.aFloat2711 - arg2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aas.o(" + ')');
		}
	}

	public void method1974(Buffer arg0, short arg1) {
		try {
			this.aClass245_7336 = new Class245(arg0);
			this.aFloat7335 = 0.0F;
			this.aFloat7337 = 0.0F;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aas.s(" + ')');
		}
	}

	public void method1972(float arg0, Class307 arg1, int[][][] arg2) {
		float var4 = this.aClass245_7336.method2447();
		if (this.aFloat7335 >= var4) {
			return;
		}
		this.aFloat7337 = this.method2014(var4, this.aFloat7337, arg0, 813429827);
		this.aFloat7335 += this.aFloat7337;
		if (this.aFloat7335 > var4) {
			this.aFloat7335 = var4;
		}
	}

	public void method1973(float arg0, Class307 arg1, int[][][] arg2) {
		float var4 = this.aClass245_7336.method2447();
		if (this.aFloat7335 >= var4) {
			return;
		}
		this.aFloat7337 = this.method2014(var4, this.aFloat7337, arg0, 1019213278);
		this.aFloat7335 += this.aFloat7337;
		if (this.aFloat7335 > var4) {
			this.aFloat7335 = var4;
		}
	}

	public void method1983(float arg0, Class307 arg1, int[][][] arg2) {
		float var4 = this.aClass245_7336.method2447();
		if (this.aFloat7335 >= var4) {
			return;
		}
		this.aFloat7337 = this.method2014(var4, this.aFloat7337, arg0, 1171438837);
		this.aFloat7335 += this.aFloat7337;
		if (this.aFloat7335 > var4) {
			this.aFloat7335 = var4;
		}
	}

	public boolean method1975() {
		return this.aClass245_7336 != null;
	}

	public boolean method1978() {
		return this.aClass245_7336 != null;
	}

	public boolean method1971() {
		return this.aClass245_7336 != null;
	}

	public Class330_Sub28 method1980() {
		Class260 var1 = this.aClass245_7336.method2443(this.aFloat7335);
		return new Class330_Sub28(0, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
	}

	public Class330_Sub28 method1981() {
		Class260 var1 = this.aClass245_7336.method2443(this.aFloat7335);
		return new Class330_Sub28(0, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
	}

	public void method1986(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.aClass245_7336.method2443(this.aFloat7335);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
	}

	public Class330_Sub28 method1982() {
		Class260 var1 = this.aClass245_7336.method2443(this.aFloat7335);
		return new Class330_Sub28(0, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
	}

	public Class330_Sub28 method1984() {
		Class260 var1 = this.aClass245_7336.method2443(this.aFloat7335);
		return new Class330_Sub28(0, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
	}

	public void method1967(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.aClass245_7336.method2443(this.aFloat7335);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
	}

	public void method1977(Class138 arg0, int arg1, int arg2) {
		Class260 var4 = this.aClass245_7336.method2443(this.aFloat7335);
		arg0.anInt1532 = ((int) var4.aFloat2716 - arg1) * -581921585 * -1708658129;
		arg0.anInt1531 = (int) -var4.aFloat2715 * 1868671083 * -1724005309;
		arg0.anInt1533 = ((int) var4.aFloat2711 - arg2) * -950728209 * 1914258703;
	}

	public void method1965(Buffer arg0) {
		this.aClass245_7336 = new Class245(arg0);
		this.aFloat7335 = 0.0F;
		this.aFloat7337 = 0.0F;
	}

	public float method2015(int arg0) {
		try {
			return this.aClass245_7336.method2444(this.aFloat7335);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aas.v(" + ')');
		}
	}

	public Class330_Sub28 method1987() {
		Class260 var1 = this.aClass245_7336.method2443(this.aFloat7335);
		return new Class330_Sub28(0, (int) var1.aFloat2716, (int) var1.aFloat2715, (int) var1.aFloat2711);
	}

	public abstract float method2013(float arg0, float arg1, float arg2);

	public abstract float method2014(float arg0, float arg1, float arg2, int arg3);
}
