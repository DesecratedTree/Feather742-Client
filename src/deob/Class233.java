package deob;

public class Class233 {

	public static int anInt2464 = 15;

	public static int anInt2465 = 15;

	public static int anInt2466 = 32768;

	public static Class519 aClass519_2467;

	public Class233() throws Throwable {
		throw new Error();
	}

	public static void method2362(byte arg0) {
		try {
			if (Class95_Sub11.aClass296_7171 != null) {
				Class95_Sub11.aClass296_7171.method2932();
			}
			if (Class330_Sub42.aClass296_7818 != null) {
				Class330_Sub42.aClass296_7818.method2932();
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "jt.f(" + ')');
		}
	}

	public static void method2363(Class_ra arg0, IComponentDefinitions arg1, int arg2, int arg3, int arg4) {
		try {
			if (Class263_Sub2.myPlayer != null) {
				arg0.method4804();
				Class122 var5 = arg1.method1396(arg0, (byte) -8);
				if (var5 != null) {
					Class_ta var6 = var5.aClass_ta1408;
					arg0.r(arg2, arg3, arg2 + arg1.anInt1210, arg1.anInt1348 + arg3);
					if (var5.anInt1407 != arg1.anInt1210 || var5.anInt1405 != arg1.anInt1348) {
						throw new IllegalStateException("");
					}
					if (Class9.anInt140 == 2 || Class9.anInt140 == 5 || Class9.aClass61_152 == null) {
						arg0.DA(-16777216, var6, arg2, arg3);
					} else {
						Class381 var7 = client.aClass304_9030.method3022(187429625);
						int var8;
						int var9;
						int var10;
						int var11;
						if (Class147.anInt1621 == 5) {
							var8 = client.anInt9068;
							var9 = client.anInt9069;
							var10 = (int) -client.aFloat9141 & 0x3FFF;
							var11 = 4096;
						} else {
							Class260 var12 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
							var8 = (int) var12.aFloat2716;
							var9 = (int) var12.aFloat2711;
							var10 = (int) -client.aFloat9141 + client.anInt9149 & 0x3FFF;
							var11 = 4096 - client.anInt9063 * 16;
						}
						int var22 = var8 / 128 + 48;
						int var13 = client.aClass304_9030.method3033((byte) -104) * 4 + 48 - var9 / 128;
						Class9.aClass61_152.method734((float) arg1.anInt1210 / 2.0F + (float) arg2, (float) arg3 + (float) arg1.anInt1348 / 2.0F, (float) var22, (float) var13, var11, var10 << 2, var6, arg2, arg3);
						Class351 var14 = client.aClass304_9030.method3031((byte) -104);
						int var16;
						int var17;
						int var18;
						int var19;
						int var20;
						for (Class330_Sub23 var15 = (Class330_Sub23) Class9.aClass471_145.method5869(539664854); var15 != null; var15 = (Class330_Sub23) Class9.aClass471_145.method5873((byte) -92)) {
							var16 = var15.anInt7693;
							var17 = (var14.anIntArray3480[var16] >> 14 & 0x3FFF) - var7.gameSceneBaseX;
							var18 = (var14.anIntArray3480[var16] & 0x3FFF) - var7.gameSceneBaseY;
							var19 = var17 * 4 + 2 - var8 / 128;
							var20 = var18 * 4 + 2 - var9 / 128;
							Class304.method3036(arg0, var6, arg1, arg2, arg3, var19, var20, var14.anIntArray3481[var16], (byte) 23);
						}
						int var23;
						for (var23 = 0; var23 < Class9.anInt142; var23++) {
							var16 = Class9.anIntArray148[var23] * 4 + 2 - var8 / 128;
							var17 = Class9.anIntArray143[var23] * 4 + 2 - var9 / 128;
							Class473 var25 = client.aClass304_9030.method3025((byte) 13).method5705(Class9.anIntArray144[var23], (byte) -126);
							if (var25.anIntArray5678 != null) {
								var25 = var25.method5900(Class158.aClass561_6474, (byte) 100);
								if (var25 == null) {
									continue;
								}
								if (var25.anInt5651 == -1) {
									if (arg4 != -1571986388) {
										return;
									}
									continue;
								}
							}
							Class304.method3036(arg0, var6, arg1, arg2, arg3, var16, var17, var25.anInt5651, (byte) -71);
						}
						for (Class330_Sub9 var24 = (Class330_Sub9) client.aClass497_9138.method6099((byte) -33); var24 != null; var24 = (Class330_Sub9) client.aClass497_9138.method6098((short) -32768)) {
							var16 = (int) (var24.aLong3341 >> 28 & 0x3L);
							if (var16 == Class9.anInt138) {
								var17 = (int) (var24.aLong3341 & 0x3FFFL) - var7.gameSceneBaseX;
								var18 = (int) (var24.aLong3341 >> 14 & 0x3FFFL) - var7.gameSceneBaseY;
								var19 = var17 * 4 + 2 - var8 / 128;
								var20 = var18 * 4 + 2 - var9 / 128;
								Class464_Sub3.method5744(arg1, var6, arg2, arg3, var19, var20, Class76_Sub1.aClass61Array7097[0], (byte) 0);
							}
						}
						Class526.method6263(arg0, var8, var9, arg1, var6, arg2, arg3, (byte) -104);
						Class198.method2158(var8, var9, arg1, var6, arg2, arg3, -2065020355);
						Class535.method6314(var8, var9, arg1, var5, arg2, arg3, 1270800454);
						if (Class147.anInt1621 != 5) {
							if (Class9.anInt146 != 0) {
								var23 = Class9.anInt146 * 4 + 2 - var8 / 128 + (Class263_Sub2.myPlayer.method5453(-1539258713) - 1) * 2;
								var16 = Class9.anInt151 * 4 + 2 - var9 / 128 + (Class263_Sub2.myPlayer.method5453(-713829597) - 1) * 2;
								Class464_Sub3.method5744(arg1, var6, arg2, arg3, var23, var16, Class_v.aClass61Array7960[Class9.aBoolean141 ? 1 : 0], (byte) 0);
							}
							if (!Class263_Sub2.myPlayer.hidden) {
								arg0.method4789(arg1.anInt1210 / 2 + arg2 - 1, arg1.anInt1348 / 2 + arg3 - 1, 3, 3, -1, 463754225);
							}
						}
					}
				}
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "jt.n(" + ')');
		}
	}

	public static final void method2364(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class410.method5221(var3, var4, arg0, -119881137);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jt.gx(" + ')');
		}
	}

	public static final void method2365(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			if (arg0.anIntArray4387[arg0.anInt4376] >= arg0.anIntArray4387[arg0.anInt4376 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jt.ad(" + ')');
		}
	}
}
