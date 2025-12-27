package deob;

public class Class112 {

	public static String aString1164 = "#";

	public Class112() throws Throwable {
		throw new Error();
	}

	public static long method1372(Interface2 arg0, int arg1, int arg2, int arg3) {
		try {
			long var4 = 4194304L;
			long var6 = Long.MIN_VALUE;
			Class473 var8 = client.aClass304_9030.method3025((byte) 13).method5705(arg0.method34((short) -22708), (byte) -102);
			long var9 = (long) (arg1 | arg2 << 7 | arg0.method21(1020268653) << 14 | arg0.method33((byte) -75) << 20 | 0x40000000);
			if (var8.anInt5637 == 0) {
				var9 |= var6;
			}
			if (var8.anInt5640 == 1) {
				var9 |= var4;
			}
			return var9 | (long) arg0.method34((short) -28342) << 32;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "en.e(" + ')');
		}
	}

	public static Class384[] method1373(int arg0) {
		try {
			return new Class384[] { Class384.aClass384_3968, Class384.aClass384_3967, Class384.aClass384_3965 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "en.r(" + ')');
		}
	}

	public static final void method1374(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1298 = Class288.method2886(var4, arg2, 1661671007);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "en.lp(" + ')');
		}
	}

	public static final void method1375(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -2039143643);
			Class24.method483(var3, arg0, -267729105);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "en.qe(" + ')');
		}
	}

	public static void method1376(int arg0) {
		try {
			Class360.aClass1_3783.method382(-1270232737);
			Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
			Class360.aClass1_3783.currentIncomingPacket = null;
			Class360.aClass1_3783.aClass222_20 = null;
			Class360.aClass1_3783.aClass222_35 = null;
			Class360.aClass1_3783.aClass222_36 = null;
			Class360.aClass1_3783.anInt26 = 0;
			Class360.aClass1_3783.anInt30 = 0;
			client.anInt9026 = 0;
			Class330_Sub14.method3319((byte) 0);
			Class166.method1996((byte) 124);
			int var1;
			for (var1 = 0; var1 < 2048; var1++) {
				client.players[var1] = null;
			}
			Class263_Sub2.myPlayer = null;
			for (var1 = 0; var1 < client.anInt9232; var1++) {
				Class432_Sub1_Sub1_Sub1 var2 = (Class432_Sub1_Sub1_Sub1) client.aClass330_Sub35Array9015[var1].anObject7733;
				if (var2 != null) {
					var2.anInt10028 = -1;
				}
			}
			Class356.method4191(-1637768143);
			Class147.anInt1621 = 4;
			Class439.anInt4456 = -1;
			Class457.anInt6844 = -1;
			Class227.method2311(1, -1188873169);
			for (var1 = 0; var1 < 113; var1++) {
				client.aBooleanArray9230[var1] = true;
			}
			Class19.method462(-956639064);
			Class95_Sub5.aClass422_7146 = null;
			Class198.aLong1925 = 0L;
			Class490.method6070(535805781);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "en.aw(" + ')');
		}
	}

	public static int method1377(int arg0, int arg1, int arg2) {
		try {
			return arg0 == Class476.aClass476_6879.anInt6882 || arg0 == Class476.aClass476_6881.anInt6882 ? Class432_Sub1_Sub5_Sub1.anIntArray9951[arg1 & 0x3] : Class432_Sub1_Sub5_Sub1.anIntArray9959[arg1 & 0x3];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "en.bs(" + ')');
		}
	}

	public static final void method1378(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1914646308);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "en.ale(" + ')');
		}
	}

	public static void method1379(int arg0) {
		try {
			Class258.method2545(687976851);
			Class_na.aClass61Array9725 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "en.at(" + ')');
		}
	}

	public static final void method1380(int arg0, int arg1, long arg2) {
		try {
			int var4 = (int) arg2 >> 14 & 0x1F;
			int var5 = (int) arg2 >> 20 & 0x3;
			int var6 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
			Class476 var7 = (Class476) Class479.method6015(Class329.method3250(1661064181), var4, (byte) 33);
			Class366 var8;
			if (Class476.aClass476_6898 == var7 || Class476.aClass476_6878 == var7 || var7 == Class476.aClass476_6900) {
				Class473 var9 = client.aClass304_9030.method3025((byte) 13).method5705(var6, (byte) -107);
				int var10;
				int var11;
				if (var5 == 0 || var5 == 2) {
					var10 = var9.anInt5674;
					var11 = var9.anInt5680;
				} else {
					var10 = var9.anInt5680;
					var11 = var9.anInt5674;
				}
				if (var5 == 0) {
				}
				var8 = Class70.method821(arg0, arg1, var10, var11, Class476.aClass476_6883, 0, -1077326088);
			} else if (Class262.method2593(var7.anInt6882, -858625560)) {
				var8 = Class70.method821(arg0, arg1, 0, 0, var7, var5, 801239256);
			} else {
				var8 = Class291_Sub1.method2908(arg0, arg1, 0, 0, var7, var5, -1313895967);
			}
			Class263_Sub2.method2622(arg0, arg1, true, var8, 2021620088);
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "en.jr(" + ')');
		}
	}

	public static final void method1381(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aByte1638;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "en.xb(" + ')');
		}
	}
}
