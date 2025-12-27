package deob;

public class Class64 {

	public int anInt564;

	public int anInt566;

	public int anInt563;

	public int anInt565;

	public int anInt567;

	public Class249 aClass249_568;

	public Class64 aClass64_562;

	public static IComponentDefinitions aClass114_569;

	public Class208 method771(int arg0) {
		try {
			return Class539.method6326(this.anInt564, -1856459371);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cp.r(" + ')');
		}
	}

	public Class64 method772(int arg0, int arg1) {
		try {
			return new Class64(this.anInt564, arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cp.j(" + ')');
		}
	}

	public Class64(int arg0, int arg1) {
		this.anInt564 = arg0;
		this.anInt566 = arg1;
	}

	public static void method773(int arg0) {
		try {
			if (Class5.anInt72 > 0) {
				int var1 = 0;
				for (int var2 = 0; var2 < Class5.aStringArray68.length; var2++) {
					if (Class5.aStringArray68[var2].indexOf("--> ") != -1) {
						var1++;
						if (var1 == Class5.anInt72) {
							Class5.aString73 = Class5.aStringArray68[var2].substring(Class5.aStringArray68[var2].indexOf(62) + 2);
							break;
						}
					}
				}
			} else {
				Class5.aString73 = "";
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cp.w(" + ')');
		}
	}

	public static final void method774(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 0, 732304971);
			Class435.method5568(1628276159);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cp.apl(" + ')');
		}
	}

	public static final void method775(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class109.method1352(var3, var4, arg0, (byte) 6);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cp.ck(" + ')');
		}
	}

	public static final void method776(int arg0) {
		try {
			Class330_Sub10 var1;
			for (var1 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); var1 != null; var1 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -59)) {
				Class254.method2537(var1, false, 2044632032);
			}
			for (var1 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); var1 != null; var1 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -115)) {
				Class254.method2537(var1, true, 2088858046);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cp.o(" + ')');
		}
	}

	public static void method777(int arg0) {
		try {
			Class484.aClass330_Sub36_Sub10_5778 = new Class330_Sub36_Sub10(Class526.aClass526_6041.method6257(Class429.aClass454_4369, 991479434), "", client.anInt9147, 1006, -1, 0L, 0, 0, true, false, 0L, true);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cp.s(" + ')');
		}
	}

	public static void method778(int arg0, byte arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(22, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cp.f(" + ')');
		}
	}

	public static int method779(int arg0, int arg1) {
		try {
			int var2 = 0;
			if (arg0 < 0 || arg0 >= 65536) {
				arg0 >>>= 0x10;
				var2 += 16;
			}
			if (arg0 >= 256) {
				arg0 >>>= 0x8;
				var2 += 8;
			}
			if (arg0 >= 16) {
				arg0 >>>= 0x4;
				var2 += 4;
			}
			if (arg0 >= 4) {
				arg0 >>>= 0x2;
				var2 += 2;
			}
			if (arg0 >= 1) {
				arg0 >>>= 0x1;
				var2++;
			}
			return var2 + arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cp.f(" + ')');
		}
	}
}
