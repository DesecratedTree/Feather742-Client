package deob;

import java.awt.Canvas;

public class Class330_Sub9 extends Class330 {

	public Class471 aClass471_7573 = new Class471();

	public static final void method3282(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.anInt4376 -= 2;
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2.substring(var3, var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acn.aau(" + ')');
		}
	}

	public static Class_ra method3283(Canvas arg0, Interface_ma arg1, int arg2, int arg3, int arg4) {
		try {
			return new ja(arg0, arg1, arg2, arg3);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "acn.r(" + ')');
		}
	}

	public static final void method3284(Class430 arg0, byte arg1) {
		try {
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acn.adz(" + ')');
		}
	}

	public static int method3285(char arg0, Class454 arg1, int arg2) {
		try {
			int var3 = arg0 << 4;
			if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
				char var4 = Character.toLowerCase(arg0);
				var3 = (var4 << 4) + 1;
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acn.p(" + ')');
		}
	}

	public static void method3286(int arg0) {
		try {
			if (Class239.anInterface14Array2584 != null) {
				Interface14[] var1 = Class239.anInterface14Array2584;
				for (int var2 = 0; var2 < var1.length; var2++) {
					Interface14 var3 = var1[var2];
					var3.method203(-942418178);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "acn.s(" + ')');
		}
	}
}
