package deob;

public class Class96 {

	public static Class471 aClass471_856 = new Class471();

	public static Class497 aClass497_857 = new Class497(32);

	public static int anInt858 = 1;

	public static int anInt863 = 0;

	public static int anInt860 = 0;

	public static boolean aBoolean861 = false;

	public static int anInt864 = -1;

	public static int anInt852 = -1;

	public static Interface29 anInterface29_866 = new Class83();

	public static short aShort859;

	public static short aShort865;

	public static Class79[] aClass79Array853;

	public static Class85[] aClass85Array854;

	public static Class88[] aClass88Array855;

	public static Class89[] aClass89Array862;

	public Class96() throws Throwable {
		throw new Error();
	}

	public static final void method1177(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class136.method1587(var3, var4, arg0, 1351069292);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dx.go(" + ')');
		}
	}

	public static final void method1178(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class354_Sub1.aBoolean7989 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dx.aex(" + ')');
		}
	}

	public static long method1179(CharSequence arg0, int arg1) {
		try {
			long var2 = 0L;
			int var4 = arg0.length();
			for (int var5 = 0; var5 < var4; var5++) {
				var2 *= 37L;
				char var6 = arg0.charAt(var5);
				if (var6 >= 'A' && var6 <= 'Z') {
					var2 += var6 + 1 - 65;
				} else if (var6 >= 'a' && var6 <= 'z') {
					var2 += var6 + 1 - 97;
				} else if (var6 >= '0' && var6 <= '9') {
					var2 += var6 + 27 - 48;
				}
				if (var2 >= 177917621779460413L) {
					if (arg1 != -1842608537) {
					}
					break;
				}
			}
			while (var2 % 37L == 0L && var2 != 0L) {
				var2 /= 37L;
			}
			return var2;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "dx.r(" + ')');
		}
	}

	public static Class146 method1180(int arg0, int arg1) {
		try {
			if (Class146.aClass146_1607.anInt1613 == arg0) {
				return Class146.aClass146_1607;
			} else if (Class146.aClass146_1611.anInt1613 == arg0) {
				return Class146.aClass146_1611;
			} else if (arg0 == Class146.aClass146_1609.anInt1613) {
				return Class146.aClass146_1609;
			} else if (Class146.aClass146_1610.anInt1613 == arg0) {
				return Class146.aClass146_1610;
			} else if (arg0 == Class146.aClass146_1608.anInt1613) {
				return Class146.aClass146_1608;
			} else if (Class146.aClass146_1612.anInt1613 == arg0) {
				return Class146.aClass146_1612;
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dx.r(" + ')');
		}
	}

	public static Class374 method1181(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readUnsignedByte(1405242760);
			int var3 = arg0.readUnsignedByte(-305227508);
			int var4 = arg0.readUnsignedByte(210292791);
			int[] var5 = new int[var4];
			for (int var6 = 0; var6 < var4; var6++) {
				var5[var6] = arg0.readUnsignedByte(1928197893);
			}
			return new Class374(var2, var3, var5);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "dx.o(" + ')');
		}
	}

	public static void method1182(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		try {
			client.aLong9113 = 0L;
			int var5 = Class545.method6347(1079239502);
			if (arg0 == 3 || var5 == 3) {
				arg3 = true;
			}
			if (!Class361.aClass_ra3793.t()) {
				arg3 = true;
			}
			Class86.method980(var5, arg0, arg1, arg2, arg3, -681123409);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "dx.gd(" + ')');
		}
	}

	public static final void method1183(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class481.method6023(var3, var4, arg0, -573710888);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dx.ee(" + ')');
		}
	}

	public static int method1184(CharSequence arg0, int arg1) {
		try {
			int var2 = arg0.length();
			int var3 = 0;
			for (int var4 = 0; var4 < var2; var4++) {
				var3 = (var3 << 5) - var3 + arg0.charAt(var4);
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dx.l(" + ')');
		}
	}
}
