package deob;

public class Class213 {

	public static Class213 aClass213_2063 = new Class213(9);

	public static Class213 aClass213_2064 = new Class213(2);

	public static Class213 aClass213_2074 = new Class213(5);

	public static Class213 aClass213_2066 = new Class213(7);

	public static Class213 aClass213_2067 = new Class213(6);

	public static Class213 aClass213_2065 = new Class213(18);

	public static Class213 aClass213_2069 = new Class213(6);

	public static Class213 aClass213_2070 = new Class213(21);

	public static Class213 aClass213_2071 = new Class213(8);

	public static Class213 aClass213_2072 = new Class213(3);

	public static Class213 aClass213_2073 = new Class213(5);

	public static Class213 aClass213_2068 = new Class213(-1);

	public static Class213 aClass213_2075 = new Class213(10);

	public static Class213 aClass213_2076 = new Class213(-1);

	public static Class213 aClass213_2077 = new Class213(7);

	public Class213(int arg0) {
	}

	public static final void method2227(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			String var3 = (String) Class332.anObjectArray6640[var2];
			if (var3 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iy.bm(" + ')');
		}
	}

	public static final void method2228(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 348059583);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class420.method5287(var3, var4, arg0, 683541547);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "iy.do(" + ')');
		}
	}

	public static int method2229(IComponentDefinitions arg0, int arg1, int arg2) {
		try {
			if (!client.method3924(arg0).method3264(arg1, -979598918) && arg0.anObjectArray1319 == null) {
				return -1;
			} else if (arg0.anIntArray1286 == null || arg0.anIntArray1286.length <= arg1) {
				return -1;
			} else {
				return arg0.anIntArray1286[arg1];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iy.mj(" + ')');
		}
	}

	public static Class330_Sub36_Sub10 method2230(int arg0) {
		try {
			return Class439.aClass330_Sub36_Sub10_4455;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "iy.ad(" + ')');
		}
	}

	public static final void method2231(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class364 var3 = Class102.aClass362_924.method4254(var2, -136862227);
			if (var3.anIntArray3809 == null || var3.anIntArray3809.length <= 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt3808;
			} else {
				int var4 = 0;
				int var5 = var3.anIntArray3833[0];
				for (int var6 = 1; var6 < var3.anIntArray3809.length; var6++) {
					if (var3.anIntArray3833[var6] > var5) {
						var4 = var6;
						var5 = var3.anIntArray3833[var6];
					}
				}
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anIntArray3809[var4];
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "iy.abb(" + ')');
		}
	}

	public static void method2232(Class430 arg0, int arg1) {
		try {
			Class395 var2 = Class131.aClass407_1502.method4752(arg0.anIntArray4387[--arg0.anInt4376], -1227984827);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anIntArrayArray4094 == null ? 0 : var2.anIntArrayArray4094.length;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iy.b(" + ')');
		}
	}
}
