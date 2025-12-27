package deob;

public class Class18 {

	public static int anInt230;

	public static int anInt232;

	public static int anInt234;

	public static int anInt238;

	public static Class195 aClass195_233;

	public static Class211 aClass211_231;

	public static Class524 aClass524_236;

	public static Class87 aClass87_235;

	public static String aString237;

	public Class18() throws Throwable {
		throw new Error();
	}

	public static void method452(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (Class333.aClass106_3352 != null && Class333.aClass106_3352.method1318(-1442034309) && Class333.aClass106_3352.anInt1007 == arg0) {
				Class315_Sub1.method3142(Class333.aClass106_3352, arg1, 103871697);
				Class333.musicId = arg0;
				Class333.aClass106_3352 = null;
				Class333.aClass330_Sub40_Sub2_3355 = null;
				Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.aClass234_2516, client.aClass1_9025.aClass488_22, 294710162);
				var4.aClass330_Sub46_Sub2_7729.addInt(-1, 1965508160);
				client.aClass1_9025.method378(var4, -16143513);
			} else {
				int var6 = arg1 * Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2026607593) >> 8;
				if (arg0 == -1 && !Class333.aBoolean3354) {
					Class365.method4271(-1759134545);
				} else if (arg0 != -1 && (Class333.musicId != arg0 || !Class416.method5259((byte) 7)) && var6 != 0 && !Class333.aBoolean3354) {
					Class276.method2730(arg2, Class89.aClass280_735, arg0, 0, var6, false, new Class111_Sub1(), 77784715);
					Class479.method6014(-1695091035);
				}
				if (arg0 != Class333.musicId) {
					Class333.aClass330_Sub40_Sub2_3355 = null;
				}
				Class333.musicId = arg0;
				Class333.aClass326_3363 = null;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "as.c(" + ')');
		}
	}

	public static final void method453(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub4_7883, arg0.anIntArray4387[--arg0.anInt4376], 291056700);
			Class435.method5568(1339202391);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "as.akj(" + ')');
		}
	}
}
