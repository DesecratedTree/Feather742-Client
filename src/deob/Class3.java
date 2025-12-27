package deob;

import java.awt.Canvas;

public class Class3 {

	public static Class367 aClass367_45 = new Class367(4);

	public int anInt52 = -1;

	public int anInt46;

	public int anInt47;

	public int anInt48;

	public int anInt49;

	public int anInt50;

	public int anInt51;

	public int anInt53;

	public int anInt54;

	public int anInt55;

	public static Class120[] aClass120Array56;

	public static void method395(int arg0) {
		try {
			try {
				int var1;
				if (Class110.anInt1152 == 1) {
					var1 = Class110.aClass330_Sub40_Sub2_1155.method3587(403726384);
					if (var1 > 0 && Class110.aClass330_Sub40_Sub2_1155.method3595(-321319511)) {
						var1 -= Class457.anInt6843;
						if (var1 < 0) {
							var1 = 0;
						}
						Class110.aClass330_Sub40_Sub2_1155.method3586(var1, 1952336281);
						return;
					}
					Class110.aClass330_Sub40_Sub2_1155.method3594(-1751696781);
					Class110.aClass330_Sub40_Sub2_1155.method3618(-563589403);
					if (Class110.aClass280_1161 == null) {
						Class110.anInt1152 = 0;
					} else {
						Class110.anInt1152 = 2;
					}
					Class366.musicFile = null;
					Class57.aClass305_6600 = null;
				}
				if (Class110.anInt1152 == 3) {
					var1 = Class110.aClass330_Sub40_Sub2_1155.method3587(421276588);
					if (var1 < Class121.volume && Class110.aClass330_Sub40_Sub2_1155.method3595(-1279566032)) {
						var1 += Class559.anInt6433;
						if (var1 > Class121.volume) {
							var1 = Class121.volume;
						}
						Class110.aClass330_Sub40_Sub2_1155.method3586(var1, 2044039117);
					} else {
						Class559.anInt6433 = 0;
						Class110.anInt1152 = 0;
					}
				}
			} catch (Exception var2) {
				var2.printStackTrace();
				Class110.aClass330_Sub40_Sub2_1155.method3594(-2054639592);
				Class121.method1448((byte) -102);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ad.u(" + ')');
		}
	}

	public static Class501[] method396(Class504 arg0, int arg1) {
		try {
			int[] var2 = arg0.method6136(-1963123436);
			Class501[] var3 = new Class501[var2.length >> 2];
			for (int var4 = 0; var4 < var3.length; var4++) {
				Class501 var5 = new Class501();
				var3[var4] = var5;
				var5.anInt5897 = var2[var4 << 2];
				var5.anInt5896 = var2[(var4 << 2) + 1];
				var5.anInt5895 = var2[(var4 << 2) + 2];
				var5.anInt5898 = var2[(var4 << 2) + 3];
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ad.r(" + ')');
		}
	}

	public static synchronized Class_ra method397(int arg0, Canvas arg1, Interface_ma arg2, IndexTable arg3, int arg4, int arg5, int arg6, byte arg7) {
		try {
			if (arg0 == 0) {
				return Class553.method6395(arg1, arg2, arg5, arg6, -211584025);
			} else if (arg0 == 2) {
				return Class330_Sub9.method3283(arg1, arg2, arg5, arg6, 1328829902);
			} else if (arg0 == 1) {
				return Class63.method770(arg1, arg2, arg4);
			} else if (arg0 == 5) {
				return Class269.method2664(arg1, arg2, arg3, arg4);
			} else if (arg0 == 3) {
				return Class225.method2304(arg1, arg2, arg3, arg4);
			} else {
				throw new IllegalArgumentException("");
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ad.i(" + ')');
		}
	}
}
