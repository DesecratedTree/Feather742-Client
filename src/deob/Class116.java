package deob;

public class Class116 {

	public int anInt1365;

	public int anInt1366;

	public int anInt1367;

	public int anInt1368;

	public int anInt1369;

	public int anInt1371;

	public int anInt1372;

	public static int anInt1374;

	public static Class61 aClass61_1376;

	public static String aString1375;

	public byte[] aByteArray1370;

	public byte[] aByteArray1373;

	public static final void method1416(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg2.anInt4376 -= 2;
			int var4 = arg2.anIntArray4387[arg2.anInt4376];
			int var5 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			if (var4 == -1 && var5 == -1) {
				arg0.aClass114_1252 = null;
			} else {
				arg0.aClass114_1252 = Class166.method1993(var4, var5, 534399539);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "er.iv(" + ')');
		}
	}

	public static final void method1417(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			int var4 = arg0.anIntArray4387[--arg0.anInt4376];
			int var6 = var4 - 1;
			if (var3.aStringArray1284 == null || var6 >= var3.aStringArray1284.length || var3.aStringArray1284[var6] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aStringArray1284[var6];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "er.qt(" + ')');
		}
	}

	public static final long method1418(int arg0) {
		try {
			return (long) (++Class428.anInt4361 - 1) << 32 | 0xFFFFFFFFL;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "er.qd(" + ')');
		}
	}

	public static int method1419(int arg0, int arg1, int arg2) {
		try {
			return Class476.aClass476_6879.anInt6882 == arg0 || Class476.aClass476_6881.anInt6882 == arg0 ? Class432_Sub1_Sub5_Sub2.anIntArray9979[arg1 & 0x3] : Class432_Sub1_Sub5_Sub2.anIntArray9978[arg1 & 0x3];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "er.bs(" + ')');
		}
	}

	public static final void method1420(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (Class401.method4717(var2, 2029181306) / 60000L);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "er.amo(" + ')');
		}
	}

	public static final void method1421(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1168919348);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.aBoolean1215 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "er.rv(" + ')');
		}
	}
}
