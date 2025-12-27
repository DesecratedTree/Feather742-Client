package deob;

public class Class220 {

	public static int anInt2184 = 742;

	public static int anInt2185 = 1;

	public static int anInt2186;

	public Class220() throws Throwable {
		throw new Error();
	}

	public static final void method2261(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class208.method2201(var3, var4, arg0, -268308450);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jg.gb(" + ')');
		}
	}

	public static final void method2262(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1334 = Class288.method2886(var4, arg2, 1757100971);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jg.nk(" + ')');
		}
	}

	public static void method2263(Class545 arg0, int arg1, int arg2, Class432_Sub1_Sub1_Sub1 arg3, int arg4, int arg5) {
		try {
			Class430 var6 = Class325_Sub6.method3229((byte) 96);
			var6.aClass432_Sub1_Sub1_Sub1_4396 = arg3;
			var6.anInt4392 = arg4;
			Class217.method2252(arg0, arg1, arg2, var6, -1815664917);
			var6.aClass432_Sub1_Sub1_Sub1_4396 = null;
			var6.anInt4392 = -1;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "jg.f(" + ')');
		}
	}

	public static final int method2264(int arg0, int arg1, int arg2) {
		try {
			if (arg0 == -1) {
				return 12345678;
			}
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jg.l(" + ')');
		}
	}

	public static final void method2265(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class426 var4 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			Class380.method4395(var4.aClass114_4345, var2, var3, (byte) 41);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jg.sm(" + ')');
		}
	}

	public static void method2266(IComponentDefinitions arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0.aByte1200 == 0) {
				arg0.anInt1329 = arg0.anInt1192;
			} else if (arg0.aByte1200 == 1) {
				arg0.anInt1329 = arg0.anInt1192 + (arg1 - arg0.anInt1210) / 2;
			} else if (arg0.aByte1200 == 2) {
				arg0.anInt1329 = arg1 - arg0.anInt1210 - arg0.anInt1192;
			} else if (arg0.aByte1200 == 3) {
				arg0.anInt1329 = arg0.anInt1192 * arg1 >> 14;
			} else if (arg0.aByte1200 == 4) {
				arg0.anInt1329 = (arg0.anInt1192 * arg1 >> 14) + (arg1 - arg0.anInt1210) / 2;
			} else {
				arg0.anInt1329 = arg1 - arg0.anInt1210 - (arg0.anInt1192 * arg1 >> 14);
			}
			if (arg0.aByte1201 == 0) {
				arg0.anInt1209 = arg0.anInt1324;
			} else if (arg0.aByte1201 == 1) {
				arg0.anInt1209 = (arg2 - arg0.anInt1348) / 2 + arg0.anInt1324;
			} else if (arg0.aByte1201 == 2) {
				arg0.anInt1209 = arg2 - arg0.anInt1348 - arg0.anInt1324;
			} else if (arg0.aByte1201 == 3) {
				arg0.anInt1209 = arg0.anInt1324 * arg2 >> 14;
			} else if (arg0.aByte1201 == 4) {
				arg0.anInt1209 = (arg2 - arg0.anInt1348) / 2 + (arg2 * arg0.anInt1324 >> 14);
			} else {
				arg0.anInt1209 = arg2 - arg0.anInt1348 - (arg0.anInt1324 * arg2 >> 14);
			}
			if (client.aBoolean9161 && (client.method3924(arg0).anInt7510 != 0 || arg0.anInt1198 == 0)) {
				if (arg0.anInt1329 < 0) {
					arg0.anInt1329 = 0;
				} else if (arg0.anInt1329 + arg0.anInt1210 > arg1) {
					arg0.anInt1329 = arg1 - arg0.anInt1210;
				}
				if (arg0.anInt1209 < 0) {
					arg0.anInt1209 = 0;
				} else if (arg0.anInt1348 + arg0.anInt1209 > arg2) {
					arg0.anInt1209 = arg2 - arg0.anInt1348;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jg.lo(" + ')');
		}
	}
}
