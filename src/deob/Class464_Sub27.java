package deob;

public class Class464_Sub27 extends Class464 {

	public static int anInt8723 = 0;

	public static int anInt8724 = 1;

	public static int anInt8725;

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public Class464_Sub27(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5831(int arg0) {
		try {
			if (this.aClass330_Sub50_5589.method3858((byte) 108) != Class435.aClass435_4421) {
				this.anInt5587 = 1;
			}
			if (this.anInt5587 != 0 && this.anInt5587 != 1) {
				this.anInt5587 = this.method5715(1083708794);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afy.l(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afy.r(" + ')');
		}
	}

	public boolean method5832(int arg0) {
		try {
			return this.aClass330_Sub50_5589.method3858((byte) 82) == Class435.aClass435_4421;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afy.b(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			if (this.aClass330_Sub50_5589.method3858((byte) 11) != Class435.aClass435_4421) {
				return 3;
			}
			if (arg0 == 0) {
				if (this.aClass330_Sub50_5589.aClass464_Sub3_7880.method5743((byte) 9) == 1) {
					return 2;
				}
				if (this.aClass330_Sub50_5589.aClass464_Sub13_7893.method5787(1796080686) == 1) {
					return 2;
				}
				if (this.aClass330_Sub50_5589.aClass464_Sub25_7896.method5827(502591542) > 0) {
					return 2;
				}
			}
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afy.j(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afy.p(" + ')');
		}
	}

	public int method5833(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afy.k(" + ')');
		}
	}

	public int method5718() {
		return 1;
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public Class464_Sub27(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5714(int arg0) {
		if (this.aClass330_Sub50_5589.method3858((byte) 93) != Class435.aClass435_4421) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass330_Sub50_5589.aClass464_Sub3_7880.method5743((byte) 9) == 1) {
				return 2;
			}
			if (this.aClass330_Sub50_5589.aClass464_Sub13_7893.method5787(617480118) == 1) {
				return 2;
			}
			if (this.aClass330_Sub50_5589.aClass464_Sub25_7896.method5827(502591542) > 0) {
				return 2;
			}
		}
		return 1;
	}

	public static final void method5834(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].anInt2945;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afy.yr(" + ')');
		}
	}
}
