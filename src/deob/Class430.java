package deob;

public class Class430 {

	public int[] anIntArray4373 = new int[5];

	public int[][] anIntArrayArray4374 = new int[5][5000];

	public int[] anIntArray4387 = new int[1000];

	public int anInt4376 = 0;

	public Object[] anObjectArray4386 = new Object[1000];

	public int anInt4378 = 0;

	public long[] aLongArray4379 = new long[1000];

	public int anInt4380 = 0;

	public int anInt4371 = 0;

	public Class433[] aClass433Array4382 = new Class433[50];

	public Class426 aClass426_4370 = new Class426();

	public Class426 aClass426_4384 = new Class426();

	public int anInt4377 = 0;

	public int anInt4397 = -1;

	public int anInt4392;

	public static int anInt4399;

	public Class154 aClass154_4391;

	public Class19 aClass19_4381;

	public Class209 aClass209_4385;

	public Class330_Sub39 aClass330_Sub39_4395;

	public Class432_Sub1_Sub1_Sub1 aClass432_Sub1_Sub1_Sub1_4396;

	public Class432_Sub1_Sub2_Sub1 aClass432_Sub1_Sub2_Sub1_4390;

	public ClientScript aClass330_Sub36_Sub8_4393;

	public Interface2 anInterface2_4389;

	public boolean aBoolean4398;

	public int[] anIntArray4388;

	public int[] anIntArray4394;

	public long[] aLongArray4372;

	public Class445[] aClass445Array4383;

	public Object[] anObjectArray4375;

	public static final void method5332(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int[] var3 = Class139.method1614(var2, 728052048);
			Class453.method5642(var3, 0, arg0.anIntArray4387, arg0.anInt4376, 3);
			arg0.anInt4376 += 3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rw.amp(" + ')');
		}
	}

	public static final void method5333(int arg0, int arg1, int arg2) {
		try {
			if (Class354_Sub1.aFloat3507 < Class354_Sub1.aFloat3520) {
				Class354_Sub1.aFloat3507 = (float) ((double) Class354_Sub1.aFloat3507 + (double) Class354_Sub1.aFloat3507 / 30.0D);
				if (Class354_Sub1.aFloat3507 > Class354_Sub1.aFloat3520) {
					Class354_Sub1.aFloat3507 = Class354_Sub1.aFloat3520;
				}
				Class541.method6331(-105475259);
				Class354_Sub1.anInt3521 = (int) Class354_Sub1.aFloat3507 >> 1;
				Class354_Sub1.aByteArrayArrayArray3502 = Class142.method1656(Class354_Sub1.anInt3521, 1283373020);
			} else if (Class354_Sub1.aFloat3507 > Class354_Sub1.aFloat3520) {
				Class354_Sub1.aFloat3507 = (float) ((double) Class354_Sub1.aFloat3507 - (double) Class354_Sub1.aFloat3507 / 30.0D);
				if (Class354_Sub1.aFloat3507 < Class354_Sub1.aFloat3520) {
					Class354_Sub1.aFloat3507 = Class354_Sub1.aFloat3520;
				}
				Class541.method6331(441343491);
				Class354_Sub1.anInt3521 = (int) Class354_Sub1.aFloat3507 >> 1;
				Class354_Sub1.aByteArrayArrayArray3502 = Class142.method1656(Class354_Sub1.anInt3521, 1404626485);
			}
			if (Class354_Sub1.anInt7983 != -1 && Class354_Sub1.anInt7986 != -1) {
				int var3 = Class354_Sub1.anInt7983 - Class204.anInt6517;
				if (var3 < 2 || var3 > 2) {
					var3 /= 8;
				}
				int var4 = Class354_Sub1.anInt7986 - Class149_Sub1.anInt8867;
				if (var4 < 2 || var4 > 2) {
					var4 /= 8;
				}
				Class204.anInt6517 += var3;
				Class149_Sub1.anInt8867 += var4;
				if (var3 == 0 && var4 == 0) {
					Class354_Sub1.anInt7983 = -1;
					Class354_Sub1.anInt7986 = -1;
				}
				Class541.method6331(1371695400);
			}
			if (Class448.anInt5556 > 0) {
				Class101.anInt6456--;
				if (Class101.anInt6456 == 0) {
					Class448.anInt5556--;
					Class101.anInt6456 = 100;
				}
			} else {
				Class354_Sub1.anInt7987 = -1;
				Class354_Sub1.anInt7980 = -1;
			}
			if (Class354_Sub1.aBoolean7981 && Class171.aClass471_1730 != null) {
				for (Class330_Sub7 var6 = (Class330_Sub7) Class171.aClass471_1730.method5869(539664854); var6 != null; var6 = (Class330_Sub7) Class171.aClass471_1730.method5873((byte) -38)) {
					Class372 var7 = Class354_Sub1.aClass380_3529.method4387(var6.aClass330_Sub38_7552.anInt7755, (byte) -25);
					if (var6.method3277(arg0, arg1, (short) -20939)) {
						if (var7.aStringArray3886 != null) {
							if (var7.aStringArray3886[4] != null) {
								Class360.method4241(var7.aStringArray3886[4], var7.aString3887, -1, 1012, -1, (long) var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 0, true, false, (long) var6.aClass330_Sub38_7552.anInt7755, false, (short) 140);
							}
							if (var7.aStringArray3886[3] != null) {
								Class360.method4241(var7.aStringArray3886[3], var7.aString3887, -1, 1011, -1, (long) var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 0, true, false, (long) var6.aClass330_Sub38_7552.anInt7755, false, (short) 140);
							}
							if (var7.aStringArray3886[2] != null) {
								Class360.method4241(var7.aStringArray3886[2], var7.aString3887, -1, 1010, -1, (long) var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 0, true, false, (long) var6.aClass330_Sub38_7552.anInt7755, false, (short) 140);
							}
							if (var7.aStringArray3886[1] != null) {
								Class360.method4241(var7.aStringArray3886[1], var7.aString3887, -1, 1009, -1, (long) var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 0, true, false, (long) var6.aClass330_Sub38_7552.anInt7755, false, (short) 140);
							}
							if (var7.aStringArray3886[0] != null) {
								Class360.method4241(var7.aStringArray3886[0], var7.aString3887, -1, 1008, -1, (long) var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 0, true, false, (long) var6.aClass330_Sub38_7552.anInt7755, false, (short) 140);
							}
						}
						if (!var6.aClass330_Sub38_7552.aBoolean7752) {
							var6.aClass330_Sub38_7552.aBoolean7752 = true;
							Class230.method2339(Class545.aClass545_6998, var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, -2057528903);
						}
						if (var6.aClass330_Sub38_7552.aBoolean7752) {
							Class230.method2339(Class545.aClass545_6999, var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, -1303713810);
						}
					} else if (var6.aClass330_Sub38_7552.aBoolean7752) {
						var6.aClass330_Sub38_7552.aBoolean7752 = false;
						Class230.method2339(Class545.aClass545_7002, var6.aClass330_Sub38_7552.anInt7755, var7.anInt3911, 1114813185);
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rw.co(" + ')');
		}
	}

	public static Class330_Sub36_Sub12 method5334(int arg0) {
		try {
			return Class354_Sub1.aClass330_Sub36_Sub12_3497;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rw.cs(" + ')');
		}
	}

	public static final void method5335(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.aClass153Array7759[var2].aByte1632;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rw.yj(" + ')');
		}
	}

	public static Class468[] method5336(int arg0) {
		try {
			return new Class468[] { Class468.aClass468_6856, Class468.aClass468_6861, Class468.aClass468_6858, Class468.aClass468_6857, Class468.aClass468_6860, Class468.aClass468_6862 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rw.r(" + ')');
		}
	}
}
