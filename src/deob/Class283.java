package deob;

public class Class283 {

	public static int anInt2919 = 6;

	public static int anInt2920 = 1;

	public static int anInt2921 = 2;

	public static int anInt2922 = 1;

	public static int anInt2923 = 4;

	public static int anInt2924 = 0;

	public static int anInt2925 = 7;

	public static IndexTable aClass280_2926;

	public Class283() throws Throwable {
		throw new Error();
	}

	public static void method2825(String arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5, int arg6) {
		try {
			String var16 = arg0.toLowerCase();
			short[] var7 = new short[16];
			int var8 = -1;
			String var9 = null;
			if (arg2 != -1) {
				Class537 var10 = Class301.aClass543_3059.method6339(arg2, -433138073);
				if (var10 == null || var10.method6321((byte) -25) != arg5) {
					return;
				}
				if (var10.method6321((byte) 5)) {
					var9 = var10.aString6236;
				} else {
					var8 = var10.anInt6235;
				}
			}
			int var17 = 0;
			for (int var11 = 0; var11 < Class556.aClass510_6392.anInt6777; var11++) {
				ItemDefinitions var12 = Class556.aClass510_6392.getItemDefinitions(var11, (byte) -4);
				if (arg1 && !var12.aBoolean6702) {
					if (arg6 == 510874262) {
						return;
					}
				} else if (var12.notedItemId == -1 && var12.anInt6720 == -1 && var12.anInt6728 == -1) {
					if (var12.anInt6744 == 0) {
						if (var12.name.toLowerCase().indexOf(var16) != -1) {
							if (arg2 != -1) {
								if (arg5) {
									if (!arg4.equals(var12.method6288(arg2, var9, (byte) 0))) {
										if (arg6 == 510874262) {
											return;
										}
										continue;
									}
								} else if (arg3 != var12.method6287(arg2, var8, 1943601657)) {
									if (arg6 == 510874262) {
									}
									continue;
								}
							}
							if (var17 >= 250) {
								Class440.anInt4482 = -1;
								Class282_Sub1.aShortArray7443 = null;
								return;
							}
							if (var17 >= var7.length) {
								short[] var13 = new short[var7.length * 2];
								for (int var14 = 0; var14 < var17; var14++) {
									var13[var14] = var7[var14];
								}
								var7 = var13;
							}
							var7[var17++] = (short) var11;
						} else if (arg6 == 510874262) {
						}
					} else if (arg6 == 510874262) {
					}
				}
			}
			Class282_Sub1.aShortArray7443 = var7;
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
			Class440.anInt4482 = var17;
			String[] var18 = new String[Class440.anInt4482];
			for (int var19 = 0; var19 < Class440.anInt4482; var19++) {
				var18[var19] = Class556.aClass510_6392.getItemDefinitions(var7[var19], (byte) -107).name;
			}
			Class389.method4592(var18, Class282_Sub1.aShortArray7443, -579037688);
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "lu.nq(" + ')');
		}
	}

	public static final void method2826(int arg0, int arg1, int arg2, int arg3, Class481 arg4, byte arg5) {
		try {
			if (arg2 >= 1 && arg3 >= 1 && arg2 <= client.aClass304_9030.method2990(-1877316391) - 2 && arg3 <= client.aClass304_9030.method3033((byte) -103) - 2 && client.aClass304_9030.method3023(-400722441) != null) {
				Interface2 var6 = client.aClass304_9030.method3001((byte) 120).method2713(arg0, arg1, arg2, arg3, (byte) -106);
				if (var6 != null) {
					if (var6 instanceof Class432_Sub1_Sub1_Sub5) {
						((Class432_Sub1_Sub1_Sub5) var6).method5506(arg4, 2023590196);
					} else if (var6 instanceof Class432_Sub1_Sub4_Sub1) {
						((Class432_Sub1_Sub4_Sub1) var6).method5536(arg4, (byte) 13);
					} else if (var6 instanceof Class432_Sub1_Sub5_Sub2) {
						((Class432_Sub1_Sub5_Sub2) var6).method5550(arg4, 1948013395);
					} else if (var6 instanceof Class432_Sub1_Sub3_Sub2) {
						((Class432_Sub1_Sub3_Sub2) var6).method5530(arg4, (byte) 0);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "lu.z(" + ')');
		}
	}

	public static final void method2827(int arg0, int arg1) {
		try {
			int var2 = client.anInt8981 - client.anInt9235;
			if (var2 >= 100) {
				Class147.anInt1621 = 4;
				Class439.anInt4456 = -1;
				Class457.anInt6844 = -1;
			} else {
				int var3 = (int) client.aFloat9250;
				if (client.anInt9272 >> 8 > var3) {
					var3 = client.anInt9272 >> 8;
				}
				if (client.aBooleanArray9238[4] && client.anIntArray9240[4] + 128 > var3) {
					var3 = client.anIntArray9240[4] + 128;
				}
				int var4 = client.anInt9058 + (int) client.aFloat9141 & 0x3FFF;
				Class260 var5 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
				Class464.method5725(IndexTable.anInt2906, Class431.method5342((int) var5.aFloat2716, (int) var5.aFloat2711, Class85.anInt712, 1996761881) - client.anInt9077, Class308.anInt3194, var3, var4, (var3 >> 3) * 3 + 600 << 2, arg0, 1587524396);
				float var6 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
				Class471.anInt5612 = (int) ((float) Class420.anInt4309 + var6 * (float) (Class471.anInt5612 - Class420.anInt4309));
				Gfx.anInt578 = (int) ((float) (Gfx.anInt578 - Class344.anInt6814) * var6 + (float) Class344.anInt6814);
				Class325_Sub3.anInt7484 = (int) ((float) Class357.anInt3704 + var6 * (float) (Class325_Sub3.anInt7484 - Class357.anInt3704));
				Class321.anInt7018 = (int) ((float) Class95_Sub13.anInt7180 + var6 * (float) (Class321.anInt7018 - Class95_Sub13.anInt7180));
				int var7 = Class145_Sub1.anInt7266 - Class455.anInt5563;
				if (var7 > 8192) {
					var7 -= 16384;
				} else if (var7 < -8192) {
					var7 += 16384;
				}
				Class145_Sub1.anInt7266 = (int) ((float) var7 * var6 + (float) Class455.anInt5563);
				Class145_Sub1.anInt7266 &= 0x3FFF;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lu.hq(" + ')');
		}
	}

	public static void method2828(int arg0) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7888, 2, -833547019);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, 2, 1765268723);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, 1, 788419869);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub27_7881, 1, 1083350640);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub4_7883, 1, 1737615771);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub11_7879, 1, -710295154);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub22_7892, 1, -1747373849);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893, 1, -191916304);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885, 2, 1762894261);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868, 1, 175434723);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896, 2, 1581280780);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub3_7880, 1, -2082501651);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899, 0, 1871267670);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874, 0, 2099071835);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub12_7906, 2, 500913001);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877, Class134.aClass134_1515.anInt1516, -342676777);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875, 0, 297820833);
			if (Class361.aClass_ra3793 != null && Class361.aClass_ra3793.v() && Class361.aClass_ra3793.cg()) {
				Class361.aClass_ra3793.ca();
			}
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub7_7891, 1, -957275153);
			Class325.method3212(1971858432);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub5_7890, 0, -40143126);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 4, 390868653);
			Class22.method473((byte) -39);
			client.aClass304_9030.method3008(732744027).method4582(802539110);
			client.aBoolean8992 = true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "lu.z(" + ')');
		}
	}
}
