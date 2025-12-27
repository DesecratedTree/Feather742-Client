package deob;

public abstract class Class475_Sub2 extends Class475 {

	public float aFloat8740 = 0.0F;

	public float aFloat8739 = 0.0F;

	public Class245 aClass245_8741;

	public Class475_Sub2(Class145 arg0) {
		super(arg0);
	}

	public void method5948(Class245 arg0, int arg1, short arg2) {
		try {
			this.aClass245_8741 = arg0;
			this.aFloat8740 = 0.0F;
			this.aFloat8739 = 0.0F;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "agg.x(" + ')');
		}
	}

	public void method5923(float arg0, int arg1) {
		try {
			float var3 = this.aClass245_8741.method2447();
			if (!(this.aFloat8740 >= var3)) {
				this.aFloat8739 = this.method5951(var3, this.aFloat8739, arg0, -672608515);
				this.aFloat8740 += this.aFloat8739;
				if (this.aFloat8740 > var3) {
					this.aFloat8740 = var3;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "agg.r(" + ')');
		}
	}

	public boolean method5924(int arg0) {
		try {
			return this.aClass245_8741 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agg.j(" + ')');
		}
	}

	public Class260 method5932(int arg0) {
		try {
			return Class260.method2549(this.aClass245_8741.method2443(this.aFloat8740));
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "agg.i(" + ')');
		}
	}

	public void method5922(Class138 arg0, Class247 arg1, int arg2, int arg3, int arg4) {
		try {
			Class260 var6 = Class260.method2549(this.aClass145_5699.method1705(-14479435));
			var6.aFloat2716 -= arg2;
			var6.aFloat2711 -= arg3;
			Class260 var7 = Class260.method2549(this.aClass245_8741.method2443(this.aFloat8740));
			var7.aFloat2716 -= arg2;
			var7.aFloat2711 -= arg3;
			float var8 = this.aClass245_8741.method2446(this.aFloat8740);
			Class260 var9 = Class260.method2561(var7, var6);
			var9.method2557();
			Class244 var10 = new Class244();
			var10.method2425(var9, var8);
			Class260 var11 = Class260.method2577(0.0F, 1.0F, 0.0F);
			Class260 var12 = Class260.method2564(var9, var11);
			Class260 var14 = Class260.method2564(var12, var9);
			var14.method2570(var10);
			var6.aFloat2715 *= -1.0F;
			var7.aFloat2715 *= -1.0F;
			arg1.method2457(var6.aFloat2716, var6.aFloat2715, var6.aFloat2711, var7.aFloat2716, var7.aFloat2715, var7.aFloat2711, var14.aFloat2716, var14.aFloat2715, var14.aFloat2711);
			var6.method2550();
			var7.method2550();
			var14.method2550();
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "agg.p(" + ')');
		}
	}

	public void method5925(Buffer arg0, int arg1) {
		try {
			this.aClass245_8741 = new Class245(arg0);
			this.aFloat8740 = 0.0F;
			this.aFloat8739 = 0.0F;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "agg.o(" + ')');
		}
	}

	public void method5934(Class138 arg0, Class247 arg1, int arg2, int arg3) {
		Class260 var5 = Class260.method2549(this.aClass145_5699.method1705(1401620435));
		var5.aFloat2716 -= arg2;
		var5.aFloat2711 -= arg3;
		Class260 var6 = Class260.method2549(this.aClass245_8741.method2443(this.aFloat8740));
		var6.aFloat2716 -= arg2;
		var6.aFloat2711 -= arg3;
		float var7 = this.aClass245_8741.method2446(this.aFloat8740);
		Class260 var8 = Class260.method2561(var6, var5);
		var8.method2557();
		Class244 var9 = new Class244();
		var9.method2425(var8, var7);
		Class260 var10 = Class260.method2577(0.0F, 1.0F, 0.0F);
		Class260 var11 = Class260.method2564(var8, var10);
		Class260 var12 = Class260.method2564(var11, var8);
		var12.method2570(var9);
		var5.aFloat2715 *= -1.0F;
		var6.aFloat2715 *= -1.0F;
		arg1.method2457(var5.aFloat2716, var5.aFloat2715, var5.aFloat2711, var6.aFloat2716, var6.aFloat2715, var6.aFloat2711, var12.aFloat2716, var12.aFloat2715, var12.aFloat2711);
		var5.method2550();
		var6.method2550();
		var12.method2550();
	}

	public void method5928(float arg0) {
		float var2 = this.aClass245_8741.method2447();
		if (this.aFloat8740 >= var2) {
			return;
		}
		this.aFloat8739 = this.method5951(var2, this.aFloat8739, arg0, -399834867);
		this.aFloat8740 += this.aFloat8739;
		if (this.aFloat8740 > var2) {
			this.aFloat8740 = var2;
		}
	}

	public void method5927(float arg0) {
		float var2 = this.aClass245_8741.method2447();
		if (this.aFloat8740 >= var2) {
			return;
		}
		this.aFloat8739 = this.method5951(var2, this.aFloat8739, arg0, -1263832036);
		this.aFloat8740 += this.aFloat8739;
		if (this.aFloat8740 > var2) {
			this.aFloat8740 = var2;
		}
	}

	public void method5930(float arg0) {
		float var2 = this.aClass245_8741.method2447();
		if (this.aFloat8740 >= var2) {
			return;
		}
		this.aFloat8739 = this.method5951(var2, this.aFloat8739, arg0, -2127809769);
		this.aFloat8740 += this.aFloat8739;
		if (this.aFloat8740 > var2) {
			this.aFloat8740 = var2;
		}
	}

	public boolean method5931() {
		return this.aClass245_8741 != null;
	}

	public void method5929(float arg0) {
		float var2 = this.aClass245_8741.method2447();
		if (this.aFloat8740 >= var2) {
			return;
		}
		this.aFloat8739 = this.method5951(var2, this.aFloat8739, arg0, -1457196442);
		this.aFloat8740 += this.aFloat8739;
		if (this.aFloat8740 > var2) {
			this.aFloat8740 = var2;
		}
	}

	public void method5933(Class138 arg0, Class247 arg1, int arg2, int arg3) {
		Class260 var5 = Class260.method2549(this.aClass145_5699.method1705(1709764866));
		var5.aFloat2716 -= arg2;
		var5.aFloat2711 -= arg3;
		Class260 var6 = Class260.method2549(this.aClass245_8741.method2443(this.aFloat8740));
		var6.aFloat2716 -= arg2;
		var6.aFloat2711 -= arg3;
		float var7 = this.aClass245_8741.method2446(this.aFloat8740);
		Class260 var8 = Class260.method2561(var6, var5);
		var8.method2557();
		Class244 var9 = new Class244();
		var9.method2425(var8, var7);
		Class260 var10 = Class260.method2577(0.0F, 1.0F, 0.0F);
		Class260 var11 = Class260.method2564(var8, var10);
		Class260 var12 = Class260.method2564(var11, var8);
		var12.method2570(var9);
		var5.aFloat2715 *= -1.0F;
		var6.aFloat2715 *= -1.0F;
		arg1.method2457(var5.aFloat2716, var5.aFloat2715, var5.aFloat2711, var6.aFloat2716, var6.aFloat2715, var6.aFloat2711, var12.aFloat2716, var12.aFloat2715, var12.aFloat2711);
		var5.method2550();
		var6.method2550();
		var12.method2550();
	}

	public boolean method5926() {
		return this.aClass245_8741 != null;
	}

	public void method5936(Buffer arg0) {
		this.aClass245_8741 = new Class245(arg0);
		this.aFloat8740 = 0.0F;
		this.aFloat8739 = 0.0F;
	}

	public Class260 method5935() {
		return Class260.method2549(this.aClass245_8741.method2443(this.aFloat8740));
	}

	public static void method5952(int arg0, String arg1, int arg2) {
		try {
			Class556.method6406(arg0, 0, "", "", "", arg1, -1777247013);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "agg.i(" + ')');
		}
	}

	public abstract float method5949(float arg0, float arg1, float arg2);

	public abstract float method5950(float arg0, float arg1, float arg2);

	public abstract float method5951(float arg0, float arg1, float arg2, int arg3);
}
