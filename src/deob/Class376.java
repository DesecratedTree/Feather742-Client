package deob;

public class Class376 {

	public Class376() throws Throwable {
		throw new Error();
	}

	public static void method4359(Class430 arg0, int arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -1607557005).aStringArray4103[arg0.anIntArray4387[arg0.anInt4376 - 1]];
			arg0.anInt4376 -= 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pq.a(" + ')');
		}
	}

	public static final void method4360(IComponentDefinitions arg0, Class430 arg1, byte arg2) {
		try {
			int var3 = arg1.anIntArray4387[--arg1.anInt4376];
			int var4 = arg1.anIntArray4387[--arg1.anInt4376] - 1;
			int var5 = var4;
			if (arg0.anInt1238 != 6 && arg0.anInt1238 != 2) {
				throw new RuntimeException("");
			}
			Class551 var6 = Class158_Sub3.aClass553_8875.method6392(arg0.anInt1239, 1133312203);
			if (arg0.aClass538_1362 == null) {
				arg0.aClass538_1362 = new Class538(var6, arg0.anInt1238 == 6);
			}
			arg0.aClass538_1362.aLong6242 = Class116.method1418(735911697);
			if (var6.aByteArray6291 != null) {
				if (var4 < 0 || var4 >= var6.aByteArray6291.length) {
					throw new RuntimeException("");
				}
				var5 = var6.aByteArray6291[var4];
			}
			if (var6.aShortArray6301 == null || var5 < 0 || var5 >= var6.aShortArray6301.length) {
				throw new RuntimeException("");
			}
			arg0.aClass538_1362.aShortArray6241[var5] = (short) var3;
			Class404.method4738(arg0, 573069468);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pq.qx(" + ')');
		}
	}

	public static final void method4361(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			Class330_Sub36_Sub1 var2 = OutgoingPacket.aClass534_2580.method6305(arg0.anIntArray4387[arg0.anInt4376], (byte) 38);
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = -1;
			for (int var5 = 0; var5 < var2.anInt9289; var5++) {
				if (var3 == var2.anIntArray9288[var5]) {
					var4 = var2.anIntArray9287[var5];
					break;
				}
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pq.tt(" + ')');
		}
	}

	public static final void method4362(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5766((byte) 1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pq.ala(" + ')');
		}
	}

	public static final void method4363(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2.startsWith(Class325_Sub4.method3225(0, 596449850)) || var2.startsWith(Class325_Sub4.method3225(1, -893574549))) {
				var2 = var2.substring(7);
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class432_Sub1_Sub1_Sub1.method5458(var2, 332783019) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pq.wy(" + ')');
		}
	}

	public static final void method4364(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
		try {
			if (arg2 < 1) {
				arg2 = 1;
			}
			if (arg3 < 1) {
				arg3 = 1;
			}
			int var6 = arg3 - 334;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 100) {
				var6 = 100;
			}
			int var7 = client.aShort8962 + (client.aShort9067 - client.aShort8962) * var6 / 100;
			int var8 = var7 * 512 * arg3 / (arg2 * 334);
			int var9;
			int var10;
			short var12;
			if (var8 < client.aShort9249) {
				var12 = client.aShort9249;
				var7 = var12 * arg2 * 334 / (arg3 * 512);
				if (var7 > client.aShort9203) {
					var7 = client.aShort9203;
					var9 = var7 * arg3 * 512 / (var12 * 334);
					var10 = (arg2 - var9) / 2;
					if (arg4) {
						Class361.aClass_ra3793.L();
						Class361.aClass_ra3793.method4789(arg0, arg1, var10, arg3, -16777216, 463754225);
						Class361.aClass_ra3793.method4789(arg0 + arg2 - var10, arg1, var10, arg3, -16777216, 463754225);
					}
					arg0 += var10;
					arg2 -= var10 * 2;
				}
			} else if (var8 > client.aShort8965) {
				var12 = client.aShort8965;
				var7 = arg2 * 334 * var12 / (arg3 * 512);
				if (var7 < client.aShort9191) {
					var7 = client.aShort9191;
					var9 = arg2 * 334 * var12 / (var7 * 512);
					var10 = (arg3 - var9) / 2;
					if (arg4) {
						Class361.aClass_ra3793.L();
						Class361.aClass_ra3793.method4789(arg0, arg1, arg2, var10, -16777216, 463754225);
						Class361.aClass_ra3793.method4789(arg0, arg3 + arg1 - var10, arg2, var10, -16777216, 463754225);
					}
					arg1 += var10;
					arg3 -= var10 * 2;
				}
			}
			client.anInt9115 = var7 * arg3 / 334;
			client.anInt9251 = arg0;
			client.anInt9166 = arg1;
			client.anInt9255 = (short) arg2;
			client.anInt9102 = (short) arg3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "pq.iz(" + ')');
		}
	}

	public static int method4365(int arg0) {
		try {
			return 12;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pq.s(" + ')');
		}
	}

	public static void method4366(byte arg0) {
		try {
			Class467.method5859(-1914900388);
			Class296.method2933(22050, Class448.aClass330_Sub50_5555.aClass464_Sub17_7910.method5798((byte) -6) == 1, 2);
			Class95_Sub11.aClass296_7171 = Class296.method2934(Class475.aCanvas5700, 0, 22050);
			Class338.method3960(true, Class457.method5660(null, 232703028), (byte) 125);
			Class330_Sub42.aClass296_7818 = Class296.method2934(Class475.aCanvas5700, 1, 2048);
			Class330_Sub42.aClass296_7818.method2935(Class511.aClass330_Sub40_Sub4_5951);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pq.i(" + ')');
		}
	}

	public static final void method4367(byte arg0) {
		try {
			Class332.aClass315_6604.method3124((byte) 1);
			int var1;
			for (var1 = 0; var1 < 32; var1++) {
				Class332.aLongArray6606[var1] = 0L;
			}
			for (var1 = 0; var1 < 32; var1++) {
				Class332.aLongArray6616[var1] = 0L;
			}
			Class332.anInt6636 = 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pq.al(" + ')');
		}
	}

	public static boolean method4368(int arg0, int arg1) {
		try {
			return arg0 != 1 && arg0 != 7;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pq.j(" + ')');
		}
	}

	public static final void method4369(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class250.method2517(var3, var4, arg0, (byte) 3);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pq.dx(" + ')');
		}
	}
}
