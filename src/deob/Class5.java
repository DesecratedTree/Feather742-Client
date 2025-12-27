package deob;

import java.io.File;

public class Class5 {

	public static int anInt71 = 0;

	public static int anInt77 = 0;

	public static int anInt78 = 350;

	public static String aString80 = "\\/.:, _-+[]~@";

	public static String aString81 = "Success";

	public static String aString82 = "Failure";

	public static String aString73 = "";

	public static int anInt72 = 0;

	public static int anInt76 = 0;

	public static int anInt75 = 0;

	public static boolean aBoolean70 = false;

	public static int anInt79 = -1;

	public static int anInt69;

	public static long aLong74;

	public static String[] aStringArray68;

	public Class5() throws Throwable {
		throw new Error();
	}

	public static final void method398(Class430 arg0, int arg1) {
		try {
			boolean var2 = false;
			String var3 = "";
			if (arg0.aClass19_4381 != null && arg0.aClass19_4381.method454(-780346076)) {
				File var4 = arg0.aClass19_4381.method455(1867432488);
				if (var4 != null) {
					var3 = var4.getPath();
					if (var3 == null) {
						var3 = "";
					}
				}
				var2 = true;
				arg0.aClass19_4381 = null;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 ? 1 : 0;
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "af.agr(" + ')');
		}
	}

	public static final void method399(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			Class381 var6 = client.aClass304_9030.method3022(1698033768);
			Class102.method1223((var2 >> 14 & 0x3FFF) - var6.gameSceneBaseX, (var2 & 0x3FFF) - var6.gameSceneBaseY, var3 << 2, var4, var5, -1397321747);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "af.agl(" + ')');
		}
	}

	public static final void method400(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class439.method5599(var3, var4, true, 0, arg0, (byte) -42);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "af.he(" + ')');
		}
	}
}
