package deob;

public class Class171 {

	public String aString1726;

	public String aString1729;

	public String aString1728;

	public static int anInt1727;

	public static Class471 aClass471_1730;

	public Class171(String arg0, String arg1, String arg2) {
		this.aString1726 = arg0;
		this.aString1729 = arg1;
		this.aString1728 = arg2;
	}

	public static final void method2045(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class354_Sub1.aClass497_7990 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				Class330 var3 = Class354_Sub1.aClass497_7990.method6094((long) var2);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == null ? 0 : 1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gz.afk(" + ')');
		}
	}

	public static void method2046(int arg0, boolean arg1, int arg2) {
		try {
			Class306.method3055(arg0, Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434), arg1, (short) 860);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gz.fn(" + ')');
		}
	}

	public static void method2047(Class330_Sub20 arg0, int arg1, int arg2, int arg3, int arg4, short arg5) {
		try {
			if (arg0.anInt7655 != -1 || arg0.anIntArray7678 != null) {
				int var6 = 0;
				int var7 = arg0.anInt7659 * Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1968550516) >> 8;
				if (arg2 > arg0.anInt7656) {
					var6 += arg2 - arg0.anInt7656;
				} else if (arg2 < arg0.anInt7671) {
					var6 += arg0.anInt7671 - arg2;
				}
				if (arg3 > arg0.anInt7668) {
					var6 += arg3 - arg0.anInt7668;
				} else if (arg3 < arg0.anInt7654) {
					var6 += arg0.anInt7654 - arg3;
				}
				if (arg0.anInt7658 == 0 || var6 - 256 > arg0.anInt7658 || Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-2062338575) == 0 || arg0.anInt7652 != arg1) {
					if (arg0.aClass330_Sub40_Sub3_7675 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(arg0.aClass330_Sub40_Sub3_7675);
						arg0.aClass330_Sub40_Sub3_7675 = null;
						arg0.aClass330_Sub29_Sub1_Sub1_7674 = null;
						arg0.aClass330_Sub41_7648 = null;
					}
					if (arg0.aClass330_Sub40_Sub3_7683 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(arg0.aClass330_Sub40_Sub3_7683);
						arg0.aClass330_Sub40_Sub3_7683 = null;
						arg0.aClass330_Sub41_7673 = null;
						arg0.aClass330_Sub29_Sub1_Sub1_7681 = null;
					}
				} else {
					var6 -= 256;
					if (var6 < 0) {
						var6 = 0;
					}
					int var8 = arg0.anInt7658 - arg0.anInt7679;
					if (var8 < 0) {
						var8 = arg0.anInt7658;
					}
					int var9 = var7;
					int var10 = var6 - arg0.anInt7679;
					if (var10 > 0 && var8 > 0) {
						var9 = var7 * (var8 - var10) / var8;
					}
					Class263_Sub2.myPlayer.method5453(-1494581090);
					int var11 = 8192;
					int var12 = (arg0.anInt7671 + arg0.anInt7656) / 2 - arg2;
					int var13 = (arg0.anInt7654 + arg0.anInt7668) / 2 - arg3;
					if (var12 != 0 || var13 != 0) {
						int var14 = -Class145_Sub1.anInt7266 - (int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (var14 > 8192) {
							var14 = 16384 - var14;
						}
						int var15;
						if (var6 <= 0) {
							var15 = 8192;
						} else if (var6 >= 4096) {
							var15 = 16384;
						} else {
							var15 = var6 * 8192 / 4096 + 8192;
						}
						var11 = var15 * var14 / 8192 + (16384 - var15 >> 1);
					}
					Class330_Sub40_Sub3_Sub1 var16;
					Class330_Sub40_Sub3_Sub2 var18;
					Class302 var19;
					Class330_Sub29_Sub1_Sub2 var20;
					if (arg0.aClass330_Sub40_Sub3_7675 != null) {
						arg0.aClass330_Sub40_Sub3_7675.method3625(var9, (byte) 10);
						arg0.aClass330_Sub40_Sub3_7675.method3636(var11, 1173339310);
					} else if (arg0.anInt7655 >= 0) {
						var12 = arg0.anInt7680 == 256 && arg0.anInt7669 == 256 ? 256 : Class340.method3970(arg0.anInt7669, arg0.anInt7680, 1598024373);
						if (arg0.aBoolean7672) {
							if (arg0.aClass330_Sub41_7648 == null) {
								arg0.aClass330_Sub41_7648 = Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, arg0.anInt7655);
							}
							if (arg0.aClass330_Sub41_7648 != null) {
								if (arg0.aClass330_Sub29_Sub1_Sub1_7674 == null) {
									arg0.aClass330_Sub29_Sub1_Sub1_7674 = arg0.aClass330_Sub41_7648.method3699();
								}
								if (arg0.aClass330_Sub29_Sub1_Sub1_7674 != null) {
									var18 = (Class330_Sub40_Sub3_Sub2) arg0.aClass330_Sub29_Sub1_Sub1_7674.method3403(var12, var9 << 6, var11);
									var18.method3624(-1, -1821201893);
									Class511.aClass330_Sub40_Sub4_5951.method3684(var18);
									arg0.aClass330_Sub40_Sub3_7675 = var18;
								}
							}
						} else {
							var19 = Class302.method2982(Class428.aClass280_4362, arg0.anInt7655, 0);
							if (var19 != null) {
								var20 = var19.method2981().method3409(Class427.aClass294_4350);
								var16 = (Class330_Sub40_Sub3_Sub1) var20.method3403(var12, var9 << 6, var11);
								var16.method3624(-1, -1536427511);
								Class511.aClass330_Sub40_Sub4_5951.method3684(var16);
								arg0.aClass330_Sub40_Sub3_7675 = var16;
							}
						}
					}
					if (arg0.aClass330_Sub40_Sub3_7683 != null) {
						arg0.aClass330_Sub40_Sub3_7683.method3625(var9, (byte) 80);
						arg0.aClass330_Sub40_Sub3_7683.method3636(var11, -1556240809);
						if (!arg0.aClass330_Sub40_Sub3_7683.method3251(122249317)) {
							arg0.aClass330_Sub40_Sub3_7683 = null;
							arg0.aClass330_Sub41_7673 = null;
							arg0.aClass330_Sub29_Sub1_Sub1_7681 = null;
						}
					} else if (arg0.anIntArray7678 != null && (arg0.anInt7670 -= arg4) <= 0) {
						var12 = arg0.anInt7680 == 256 && arg0.anInt7669 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt7680 - arg0.anInt7669)) + arg0.anInt7669;
						if (arg0.aBoolean7662) {
							if (arg0.aClass330_Sub41_7673 == null) {
								var13 = (int) (Math.random() * (double) arg0.anIntArray7678.length);
								arg0.aClass330_Sub41_7673 = Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, arg0.anIntArray7678[var13]);
							}
							if (arg0.aClass330_Sub41_7673 != null) {
								if (arg0.aClass330_Sub29_Sub1_Sub1_7681 == null) {
									arg0.aClass330_Sub29_Sub1_Sub1_7681 = arg0.aClass330_Sub41_7673.method3699();
								}
								if (arg0.aClass330_Sub29_Sub1_Sub1_7681 != null) {
									var18 = (Class330_Sub40_Sub3_Sub2) arg0.aClass330_Sub29_Sub1_Sub1_7681.method3403(var12, var9 << 6, var11);
									var18.method3624(0, -1454651790);
									Class511.aClass330_Sub40_Sub4_5951.method3684(var18);
									arg0.aClass330_Sub40_Sub3_7683 = var18;
									arg0.anInt7670 = arg0.anInt7676 + (int) (Math.random() * (double) (arg0.anInt7677 - arg0.anInt7676));
								}
							}
						} else {
							var13 = (int) (Math.random() * (double) arg0.anIntArray7678.length);
							var19 = Class302.method2982(Class428.aClass280_4362, arg0.anIntArray7678[var13], 0);
							if (var19 != null) {
								var20 = var19.method2981().method3409(Class427.aClass294_4350);
								var16 = (Class330_Sub40_Sub3_Sub1) var20.method3403(var12, var9 << 6, var11);
								var16.method3624(0, -1639123202);
								Class511.aClass330_Sub40_Sub4_5951.method3684(var16);
								arg0.aClass330_Sub40_Sub3_7683 = var16;
								arg0.anInt7670 = arg0.anInt7676 + (int) (Math.random() * (double) (arg0.anInt7677 - arg0.anInt7676));
							}
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "gz.b(" + ')');
		}
	}
}
