package deob;

public class Class431 implements Runnable {

	public void run() {
		try {
			try {
				Class509.anIcmpService_Sub1_5947.run();
			} catch (Throwable var2) {
			}
			Class509.anIcmpService_Sub1_5947 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rx.run(" + ')');
		}
	}

	public static final void method5337(IComponentDefinitions arg0, int arg1, int arg2, Class430 arg3, int arg4) {
		try {
			if (arg0.anIntArray1278 == null) {
				if (arg2 <= 0) {
					return;
				}
				arg0.aByteArrayArray1351 = new byte[11][];
				arg0.aByteArrayArray1276 = new byte[11][];
				arg0.anIntArray1277 = new int[11];
				arg0.anIntArray1278 = new int[11];
			}
			arg0.anIntArray1278[arg1] = arg2;
			if (arg2 > 0) {
				arg0.aBoolean1274 = true;
			} else {
				arg0.aBoolean1274 = false;
				for (int var5 = 0; var5 < arg0.aByteArrayArray1351.length; var5++) {
					if (arg0.aByteArrayArray1351[var5] != null || arg0.anIntArray1278[var5] > 0) {
						arg0.aBoolean1274 = true;
						break;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rx.kb(" + ')');
		}
	}

	public static final void method5338(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class122.method1451(var3, var4, arg0, (byte) 110);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rx.lf(" + ')');
		}
	}

	public static final void method5339(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 130375010);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1224;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rx.rn(" + ')');
		}
	}

	public static final void method5340(Class430 arg0, short arg1) {
		try {
			if (client.anInt9257 == 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9261;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rx.ws(" + ')');
		}
	}

	public static final void method5341(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 % var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rx.zt(" + ')');
		}
	}

	public static final int method5342(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (client.aClass304_9030.method3023(-400722441) == null) {
				return 0;
			}
			int var4 = arg0 >> 9;
			int var5 = arg1 >> 9;
			if (var4 < 0 || var5 < 0 || var4 > client.aClass304_9030.method2990(-2036253777) - 1 || var5 > client.aClass304_9030.method3033((byte) -51) - 1) {
				return 0;
			}
			int var6 = arg2;
			if (arg2 < 3 && (client.aClass304_9030.method2995(1762355482).aByteArrayArrayArray2916[1][var4][var5] & 0x2) != 0) {
				var6 = arg2 + 1;
			}
			return client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[var6].method6416(arg0, arg1, -885579250);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "rx.je(" + ')');
		}
	}

	public static String method5343(int[] arg0, int arg1) {
		try {
			StringBuilder var2 = new StringBuilder();
			int var3 = Class144.anInt1577;
			for (int var4 = 0; var4 < arg0.length; var4++) {
				Class395 var5 = Class131.aClass407_1502.method4752(arg0[var4], -1254118809);
				if (var5.anInt4105 != -1) {
					Class61 var6 = (Class61) Class484.aClass367_5788.get((long) var5.anInt4105);
					if (var6 == null) {
						Class87 var7 = Class53.method643(Class540.aClass280_6249, var5.anInt4105, 0);
						if (var7 != null) {
							var6 = Class361.aClass_ra3793.bw(var7, true);
							Class484.aClass367_5788.put(var6, (long) var5.anInt4105);
						}
					}
					if (var6 != null) {
						Class_na.aClass61Array9725[var3] = var6;
						var2.append(" <img=").append(var3).append(">");
						var3++;
					}
				} else if (arg1 >= 1142890664) {
					throw new IllegalStateException();
				}
			}
			return var2.toString();
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "rx.bf(" + ')');
		}
	}

	public static final void method5344(Class430 arg0, short arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class428.anInt4353;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rx.aof(" + ')');
		}
	}
}
