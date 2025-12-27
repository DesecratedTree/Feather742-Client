package deob;

public class Class503 {

	public static boolean aBoolean5914 = true;

	public static int anInt5916;

	public static String aString5915;

	public Class503() throws Throwable {
		throw new Error();
	}

	public static final void method6133(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class43.method590(var2, -1928689146);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uu.wg(" + ')');
		}
	}

	public static final void method6134(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub12 var3 = Class354.method4083(var2);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9702 >> 14 & 0x3FFF;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9702 & 0x3FFF;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uu.aew(" + ')');
		}
	}

	public static void method6135(Class_ra arg0, Class473 arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			Class522 var6 = Class497.aClass552_5884.method6382(arg1.anInt5652, 1519259108);
			if (var6.anInt6019 != -1) {
				if (arg1.aBoolean5653) {
					int var13 = arg2 + arg1.anInt5654;
					arg2 = var13 & 0x3;
				} else {
					arg2 = 0;
				}
				Class61 var7 = var6.method6227(arg0, arg2, arg1.aBoolean5655, (byte) -6);
				if (var7 != null) {
					int var8 = arg1.anInt5674;
					int var9 = arg1.anInt5680;
					if ((arg2 & 0x1) == 1) {
						var8 = arg1.anInt5680;
						var9 = arg1.anInt5674;
					}
					int var10 = var7.method318();
					int var11 = var7.method683();
					if (var6.aBoolean6018) {
						var10 = var8 * 4;
						var11 = var9 * 4;
					}
					if (var6.anInt6020 == 0) {
						var7.method690(arg3, arg4 - (var9 - 1) * 4, var10, var11);
					} else {
						var7.method691(arg3, arg4 - (var9 - 1) * 4, var10, var11, 0, var6.anInt6020 | 0xFF000000, 1);
					}
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "uu.w(" + ')');
		}
	}
}
