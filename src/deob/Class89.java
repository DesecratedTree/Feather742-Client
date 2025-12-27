package deob;

public class Class89 {

	public static int anInt732 = 2;

	public static int anInt733 = 0;

	public int[] anIntArray731;

	public int[] anIntArray734;

	public static int anInt736;

	public static IndexTable aClass280_735;

	public Class89(Buffer arg0) {
		int var2 = arg0.readSmart(-1046710252);
		this.anIntArray731 = new int[var2];
		this.anIntArray734 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = arg0.readUnsignedByte(1441521738);
			this.anIntArray731[var3] = var4;
			int var5 = arg0.readUnsignedShort(-378099376);
			int var6 = arg0.readUnsignedShort(-93361015);
			this.anIntArray734[var3] = var6 + (var5 << 16);
		}
	}

	public void method1056(Class85 arg0, int arg1, int arg2) {
		try {
			int var4 = this.anIntArray734[0];
			arg0.method971(arg1, var4 >>> 16, var4 & 0xFFFF, (byte) -37);
			Class432_Sub1_Sub1_Sub1 var5 = arg0.method973(-1160484525);
			var5.anInt10056 = 0;
			for (int var6 = this.anIntArray731.length - 1; var6 >= 0; var6--) {
				int var7 = this.anIntArray731[var6];
				int var8 = this.anIntArray734[var6];
				var5.anIntArray10018[var5.anInt10056] = var8 >> 16;
				var5.anIntArray10059[var5.anInt10056] = var8 & 0xFFFF;
				byte var9 = Class299.aClass299_6807.aByte6805;
				if (var7 == 0) {
					var9 = Class299.aClass299_6806.aByte6805;
				} else if (var7 == 2) {
					var9 = Class299.aClass299_6808.aByte6805;
				}
				var5.aByteArray10017[var5.anInt10056] = var9;
				var5.anInt10056++;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "dp.r(" + ')');
		}
	}

	public static final void method1057(Class430 arg0, int arg1) {
		try {
			arg0.anInt4380 -= 2;
			if (arg0.aLongArray4379[arg0.anInt4380] != arg0.aLongArray4379[arg0.anInt4380 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dp.bf(" + ')');
		}
	}

	public static void method1058(IndexTable arg0, int arg1, int arg2, int arg3, boolean arg4, Class330_Sub40_Sub2 arg5, short arg6) {
		try {
			Class217.method2255(arg0, arg1, arg2, arg3, arg4, -1739353578);
			Class288.aClass330_Sub40_Sub2_2955 = arg5;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "dp.i(" + ')');
		}
	}

	public static final void method1059(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1332 = Class288.method2886(var4, arg2, 2049457508);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dp.ot(" + ')');
		}
	}

	public static void method1060(byte arg0) {
		try {
			if (Class239.aClass258Array2585 == null) {
				Class239.aClass258Array2585 = Class258.method2543((byte) 80);
				Class134.aClass258_1518 = Class239.aClass258Array2585[0];
				Class239.aLong2590 = Class312.method3111((byte) 37);
			}
			if (Class239.aClass240_2592 == null) {
				Class532.method6302((byte) 96);
			}
			Class258 var1 = Class134.aClass258_1518;
			int var2 = IComponentDefinitions.method1412((byte) 4);
			if (Class134.aClass258_1518 == var1) {
				Class163.aString1693 = Class134.aClass258_1518.aClass526_2685.method6257(Class429.aClass454_4369, 991479434);
				if (Class134.aClass258_1518.aBoolean2704) {
					Class230.anInt2445 = var2 * (Class134.aClass258_1518.anInt2707 - Class134.aClass258_1518.anInt2706) / 100 + Class134.aClass258_1518.anInt2706;
				}
				if (Class134.aClass258_1518.aBoolean2709) {
					Class163.aString1693 = Class163.aString1693 + Class230.anInt2445 + "%";
				}
			} else if (Class134.aClass258_1518 == Class258.aClass258_2702) {
				Class239.aClass240_2592 = null;
				Class227.method2311(6, -1188873169);
				if (Class239.aBoolean2593) {
					Class239.aBoolean2593 = false;
					Class138.method1605(Class367.aString3863, Class464_Sub4.aString8670, 1801272631);
				}
			} else {
				Class163.aString1693 = var1.aClass526_2705.method6257(Class429.aClass454_4369, 991479434);
				if (Class134.aClass258_1518.aBoolean2709) {
					Class163.aString1693 = Class163.aString1693 + var1.anInt2707 + "%";
				}
				Class230.anInt2445 = var1.anInt2707;
				if (Class134.aClass258_1518.aBoolean2704 || var1.aBoolean2704) {
					Class239.aLong2590 = Class312.method3111((byte) 19);
				}
			}
			if (Class239.aClass240_2592 != null) {
				Class239.aClass240_2592.method2386(Class239.aLong2590, Class163.aString1693, Class230.anInt2445, Class134.aClass258_1518, 1495621861);
				if (Class239.anInterface14Array2584 != null) {
					for (int var3 = Class239.anInt2587 + 1; var3 < Class239.anInterface14Array2584.length; var3++) {
						if (Class239.anInterface14Array2584[var3].method212(2107876108) >= 100 && var3 - 1 == Class239.anInt2587 && client.anInt8995 != 12 && Class239.aClass240_2592.method2394(-1376454977)) {
							try {
								Class239.anInterface14Array2584[var3].method203(-141535543);
							} catch (Exception var5) {
								Class239.anInterface14Array2584 = null;
								break;
							}
							Class239.aClass240_2592.method2385(Class239.anInterface14Array2584[var3], -1891566874);
							Class239.anInt2587++;
							if (Class239.anInt2587 >= Class239.anInterface14Array2584.length - 1 && Class239.anInterface14Array2584.length > 1) {
								Class239.anInt2587 = Class239.aClass546_2588.method6353(1419887250) ? 0 : -1;
							}
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "dp.j(" + ')');
		}
	}

	public static final void method1061(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class379.method4385(var2, false, -1987119509);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dp.wz(" + ')');
		}
	}
}
