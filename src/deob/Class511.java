package deob;

import java.io.IOException;
import java.util.Random;

public class Class511 {

	public static int anInt5952 = 12;

	public static Class273 aClass273_5953 = new Class273(16, Class271.aClass271_2755);

	public static int anInt5948;

	public static int anInt5950;

	public static int anInt5955;

	public static Class330_Sub40_Sub4 aClass330_Sub40_Sub4_5951;

	public static int[] anIntArray5949;

	public static int[] anIntArray5954;

	public static byte[] method6176(int arg0, byte arg1) {
		try {
			byte[] var2 = (byte[]) aClass273_5953.method2680(arg0, -1987371737);
			if (var2 == null) {
				var2 = new byte[512];
				Random var3 = new Random((long) arg0);
				int var4;
				for (var4 = 0; var4 < 255; var4++) {
					var2[var4] = (byte) var4;
				}
				for (var4 = 0; var4 < 255; var4++) {
					int var5 = 255 - var4;
					int var6 = Class9.method423(var3, var5, (byte) -76);
					byte var7 = var2[var6];
					var2[var6] = var2[var5];
					var2[var5] = var2[511 - var4] = var7;
				}
				aClass273_5953.method2676(arg0, var2, -1635122196);
			}
			return var2;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vd.j(" + ')');
		}
	}

	public static Class204 method6177(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readBigSmart(-1760047126);
			Class195 var3 = Class457.method5665(-1882618819)[arg0.readUnsignedByte(2012445262)];
			Class211 var4 = Class7.method412((byte) -108)[arg0.readUnsignedByte(83864914)];
			int var5 = arg0.readShort(-1100583751);
			int var6 = arg0.readShort(-1100583751);
			return new Class204(var2, var3, var4, var5, var6);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vd.r(" + ')');
		}
	}

	public static void method6178(int arg0, int arg1, byte arg2) {
		try {
			int var3;
			if (arg0 != anInt5948) {
				anIntArray5949 = new int[arg0];
				for (var3 = 0; var3 < arg0; var3++) {
					anIntArray5949[var3] = (var3 << 12) / arg0;
				}
				anInt5948 = arg0;
			}
			if (arg1 != anInt5950) {
				if (anInt5948 == arg1) {
					anIntArray5954 = anIntArray5949;
				} else {
					anIntArray5954 = new int[arg1];
					for (var3 = 0; var3 < arg1; var3++) {
						anIntArray5954[var3] = (var3 << 12) / arg1;
					}
				}
				anInt5950 = arg1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vd.r(" + ')');
		}
	}

	public static void method6179(IndexTable arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5) {
		try {
			Class475.method5941(arg0, arg1, arg2, arg3, arg4, arg5, 0, 1020645039);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vd.p(" + ')');
		}
	}

	public Class511() throws Throwable {
		throw new Error();
	}

	public static Class207 method6180(int arg0, byte arg1) {
		try {
			Class207 var2 = (Class207) Class207.aClass367_1943.get((long) arg0);
			if (var2 != null) {
				return var2;
			}
			byte[] var3 = Class207.aClass280_1942.getFile(0, arg0);
			var2 = new Class207();
			if (var3 != null) {
				var2.method2190(new Buffer(var3), arg0, -1524880943);
			}
			Class207.aClass367_1943.put(var2, (long) arg0);
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vd.j(" + ')');
		}
	}

	public static final void method6181(int arg0, Class497 arg1, byte arg2) {
		try {
			if (arg0 != -1 && arg1.method6094((long) arg0) == null) {
				arg1.method6097(new Class330(), (long) arg0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vd.f(" + ')');
		}
	}

	public static void method6182(Buffer arg0, int arg1) {
		try {
			byte[] var2 = new byte[24];
			try {
				Class332.aClass489_6607.method6055(0L);
				Class332.aClass489_6607.method6060(var2, (short) 255);
				int var3;
				for (var3 = 0; var3 < 24; var3++) {
					if (var2[var3] != 0) {
						if (arg1 == 1130245832) {
							throw new IllegalStateException();
						}
						break;
					}
				}
				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var5) {
				for (int var4 = 0; var4 < 24; var4++) {
					var2[var4] = -1;
				}
			}
			arg0.method3749(var2, 0, 24, (byte) 14);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vd.n(" + ')');
		}
	}

	public static final void method6183(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class422.method5296(var3, var4, arg0, -341598374);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vd.ig(" + ')');
		}
	}

	public static boolean method6184(int arg0) {
		try {
			return Class5.aBoolean70;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vd.s(" + ')');
		}
	}

	public static final void method6185(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376] - 1;
			if (var4 >= 0 && var4 <= 9) {
				arg0.method1394(var4, (String) arg2.anObjectArray4386[--arg2.anInt4378], 86971073);
			} else {
				arg2.anInt4378--;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vd.iu(" + ')');
		}
	}

	public static void method6186(Class330 arg0, Class330 arg1, int arg2) {
		try {
			if (arg0.aClass330_3342 != null) {
				arg0.method3252(-2098604255);
			}
			arg0.aClass330_3342 = arg1.aClass330_3342;
			arg0.aClass330_3340 = arg1;
			arg0.aClass330_3342.aClass330_3340 = arg0;
			arg0.aClass330_3340.aClass330_3342 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vd.p(" + ')');
		}
	}
}
