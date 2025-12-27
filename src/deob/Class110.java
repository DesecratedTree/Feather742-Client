package deob;

import java.util.Stack;

public class Class110 {

	public static int anInt1152 = 0;

	public static int anInt1156 = 2;

	public static int anInt1157 = 1;

	public static int anInt1159 = 1;

	public static int anInt1162 = 0;

	public static int musicId;

	public static Class330_Sub40_Sub2 aClass330_Sub40_Sub2_1155;

	public static Class531 aClass531_1163;

	public static IndexTable aClass280_1153;

	public static IndexTable aClass280_1154;

	public static IndexTable aClass280_1160;

	public static IndexTable aClass280_1161;

	public Class110() throws Throwable {
		throw new Error();
	}

	public static Class344[] method1356(int arg0) {
		try {
			return new Class344[] { Class344.aClass344_6811, Class344.aClass344_6813 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "el.r(" + ')');
		}
	}

	public static void method1357(byte arg0) {
		try {
			Stack var1 = Class353.aStack3488;
			synchronized (Class353.aStack3488) {
				Class353.aStack3488 = new Stack();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "el.i(" + ')');
		}
	}

	public static void method1358(int arg0) {
		try {
			Class424.aClass378_4326.method4379(1988507329);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "el.r(" + ')');
		}
	}

	public static final void method1359(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class170.method2044(var3, var4, arg0, -1191354716);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "el.ly(" + ')');
		}
	}

	public static final void method1360(Class430 arg0, byte arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			Class260 var6 = Class260.method2577((float) var2, (float) var3, (float) var4);
			if (-1.0F == var6.aFloat2716) {
				var6.aFloat2716 = Float.POSITIVE_INFINITY;
			}
			if (var6.aFloat2715 == -1.0F) {
				var6.aFloat2715 = Float.POSITIVE_INFINITY;
			}
			if (-1.0F == var6.aFloat2711) {
				var6.aFloat2711 = Float.POSITIVE_INFINITY;
			}
			Class401_Sub1.aClass145_Sub1_8249.method1676(var6, -1767383005);
			Class401_Sub1.aClass145_Sub1_8249.method1675((float) var5 / 1000.0F, 1410416661);
			var6.method2550();
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "el.aii(" + ')');
		}
	}

	public static final void method1361(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class263_Sub2.myPlayer.aClass408_10240 != null && Class263_Sub2.myPlayer.aClass408_10240.aBoolean4213 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "el.uq(" + ')');
		}
	}

	public static final void method1362(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1319 = Class288.method2886(var4, arg2, 1596860548);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "el.lm(" + ')');
		}
	}

	public static void method1363(Class432_Sub1_Sub1_Sub1 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
		try {
			for (int var5 = 0; var5 < arg1.length; var5++) {
				int var6 = arg1[var5];
				int var7 = arg3[var5];
				int var8 = arg2[var5];
				int var9 = 0;
				while (var7 != 0 && var9 < arg0.aClass477_Sub2_Sub1Array10019.length) {
					if ((var7 & 0x1) == 0) {
						if (arg4 >= 1) {
						}
					} else if (var6 == -1) {
						arg0.aClass477_Sub2_Sub1Array10019[var9] = null;
					} else {
						Class440 var10 = Class201.aClass436_6511.method5570(var6, 1513096957);
						int var11 = var10.anInt4472;
						Class477_Sub2_Sub1 var12 = arg0.aClass477_Sub2_Sub1Array10019[var9];
						if (var12 != null && var12.method5966(-894265972)) {
							if (var6 == var12.method5967((byte) -98)) {
								if (var11 == 0) {
									arg0.aClass477_Sub2_Sub1Array10019[var9] = null;
									var12 = null;
								} else if (var11 == 1) {
									var12.method5979((byte) 16);
									var12.anInt9940 = var8;
								} else if (var11 == 2) {
									var12.method5980((byte) 18);
								}
							} else if (var10.anInt4470 >= var12.method5986((byte) -35).anInt4470) {
								arg0.aClass477_Sub2_Sub1Array10019[var9] = null;
								var12 = null;
							}
						}
						if (var12 == null || !var12.method5966(2030690102)) {
							var12 = arg0.aClass477_Sub2_Sub1Array10019[var9] = new Class477_Sub2_Sub1(arg0);
							var12.method5988(var6, (byte) -15);
							var12.anInt9940 = var8;
						}
					}
					var9++;
					var7 >>>= 0x1;
				}
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "el.ic(" + ')');
		}
	}
}
