package deob;

public class Class51 {

	public static int anInt485 = 4098;

	public static int anInt486 = 32902;

	public static int anInt487 = -1;

	public static int anInt489 = 4318;

	public static int anInt491 = 0;

	public int anInt488;

	public String aString483;

	public int anInt490;

	public String aString484;

	public long aLong492;

	public Class51(int arg0, String arg1, int arg2, String arg3, long arg4) {
		this.anInt488 = arg0;
		this.aString483 = arg1;
		this.anInt490 = arg2;
		this.aString484 = arg3;
		this.aLong492 = arg4;
	}

	public static int method633(Class330_Sub36_Sub10 arg0, int arg1) {
		try {
			if (Class484.aBoolean5782) {
				return 6;
			} else if (arg0 == null) {
				return 0;
			} else {
				int var2 = arg0.anInt9699;
				if (Class228.method2313(var2, (byte) 37)) {
					return 1;
				} else if (Class487_Sub1.method6041(var2, 536870912)) {
					return 2;
				} else if (Class391.method4607(var2, (byte) 117)) {
					return 3;
				} else if (Class531.method6298(var2, 1481449874)) {
					return 4;
				} else if (Class119.method1437(var2, -2041984243)) {
					return 7;
				} else if (var2 == 16) {
					return 8;
				} else {
					return 5;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ca.aq(" + ')');
		}
	}

	public static void method634(int arg0) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7888, 1, 2701663);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, 1, -897573921);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, 1, -1072082305);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub27_7881, 1, -1814357451);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub4_7883, 0, -697445989);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub11_7879, 0, 1334843040);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub22_7892, 0, -1104165862);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885, 0, -1249793062);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893, 0, -747517208);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868, 0, 782433921);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896, 0, 1121071485);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub3_7880, 0, 205116080);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899, 0, -1636997640);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874, 0, 1577216649);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub12_7906, 0, -817503708);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877, Class134.aClass134_1515.anInt1516, -1427587640);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875, 0, 728208785);
			if (Class361.aClass_ra3793 != null && Class361.aClass_ra3793.v() && Class361.aClass_ra3793.cg()) {
				Class361.aClass_ra3793.ca();
			}
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub7_7891, 0, 1840486995);
			Class325.method3212(1304623711);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub5_7890, 2, -1117921123);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 2, 1714896324);
			Class22.method473((byte) -11);
			client.aClass304_9030.method3008(1464687066).method4582(-278080136);
			client.aBoolean8992 = true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ca.n(" + ')');
		}
	}

	public static int method635(String arg0, byte[] arg1, int arg2, int arg3) {
		try {
			int var4 = arg2;
			int var5 = arg0.length();
			for (int var6 = 0; var6 < var5; var6 += 4) {
				int var7 = Class470.method5864(arg0.charAt(var6), (byte) -118);
				int var8 = var6 + 1 < var5 ? Class470.method5864(arg0.charAt(var6 + 1), (byte) 62) : -1;
				int var9 = var6 + 2 < var5 ? Class470.method5864(arg0.charAt(var6 + 2), (byte) -23) : -1;
				int var10 = var6 + 3 < var5 ? Class470.method5864(arg0.charAt(var6 + 3), (byte) -3) : -1;
				arg1[arg2++] = (byte) (var7 << 2 | var8 >>> 4);
				if (var9 == -1) {
					break;
				}
				arg1[arg2++] = (byte) ((var8 & 0xF) << 4 | var9 >>> 2);
				if (var10 == -1) {
					break;
				}
				arg1[arg2++] = (byte) ((var9 & 0x3) << 6 | var10);
			}
			return arg2 - var4;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ca.j(" + ')');
		}
	}

	public static final void method636(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1238 == 1 ? var3.anInt1239 : -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ca.pr(" + ')');
		}
	}

	public static final void method637(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5832(2004126510) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ca.aph(" + ')');
		}
	}

	public static void method638(int arg0, int arg1) {
		try {
			Class354_Sub1.anInt7987 = arg0;
			Class354_Sub1.anInt7980 = -1;
			Class448.anInt5556 = 3;
			Class101.anInt6456 = 100;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ca.cf(" + ')');
		}
	}
}
