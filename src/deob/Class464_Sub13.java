package deob;

public class Class464_Sub13 extends Class464 {

	public static int anInt8690 = 1;

	public static int anInt8691 = 0;

	public boolean method5785(int arg0) {
		try {
			return this.aClass330_Sub50_5589.method3858((byte) 123) == Class435.aClass435_4421;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afk.b(" + ')');
		}
	}

	public Class464_Sub13(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5786(int arg0) {
		try {
			if (this.aClass330_Sub50_5589.method3858((byte) 25) != Class435.aClass435_4421) {
				this.anInt5587 = 1;
			}
			if (this.anInt5587 != 0 && this.anInt5587 != 1) {
				this.anInt5587 = this.method5715(-702458835);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afk.l(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afk.p(" + ')');
		}
	}

	public int method5718() {
		return 1;
	}

	public int method5716(int arg0, int arg1) {
		try {
			if (this.aClass330_Sub50_5589.method3858((byte) 106) == Class435.aClass435_4421) {
				return arg0 == 0 || this.aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1 ? 1 : 2;
			} else {
				return 3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afk.j(" + ')');
		}
	}

	public int method5714(int arg0) {
		if (this.aClass330_Sub50_5589.method3858((byte) 90) == Class435.aClass435_4421) {
			return arg0 == 0 || this.aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afk.r(" + ')');
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5787(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afk.k(" + ')');
		}
	}

	public Class464_Sub13(Class330_Sub50 arg0) {
		super(arg0);
	}

	public static final void method5788(Class430 arg0, int arg1) {
		try {
			NPC var2 = (NPC) arg0.aClass432_Sub1_Sub1_Sub1_4396;
			String var3 = var2.aString10259;
			Class551 var4 = var2.aClass551_10251;
			if (var4.anIntArray6326 != null) {
				var4 = var4.method6371(Class158.aClass561_6474, (byte) 19);
				if (var4 == null) {
					var3 = "";
				} else {
					var3 = var4.aString6323;
				}
			}
			if (var3 == null) {
				var3 = "";
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "afk.arx(" + ')');
		}
	}
}
