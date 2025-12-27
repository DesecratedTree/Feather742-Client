package deob;

public class Class429 {

	public static boolean NEW_SKILLS = Boolean.FALSE;

	public static int[] anIntArray4366 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};

	public static int anInt4367 = 25;

	public static int[] anIntArray4365 = new int[120];

	public static Class454 aClass454_4369;

	public static Class282_Sub1[] aClass282_Sub1Array4368;

	@ObfuscatedName("Class429.N")
	public static int N = 120;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 120; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			anIntArray4365[var1] = var0 / 4;
		}
	}

	public Class429() throws Throwable {
		throw new Error();
	}

	public static final void method5325(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class163.method1922(var3, var4, arg0, (byte) 0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rv.cg(" + ')');
		}
	}

	public static final void method5326(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1320 = Class288.method2886(var4, arg2, 1477813341);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rv.og(" + ')');
		}
	}

	public static void method5327(byte arg0) {
		try {
			Class15.anInt192 = 0;
			for (int var1 = 0; var1 < 2048; var1++) {
				Class15.aClass330_Sub46Array191[var1] = null;
				Class15.aByteArray190[var1] = Class299.aClass299_6807.aByte6805;
				Class15.aClass26Array198[var1] = null;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rv.w(" + ')');
		}
	}

	public static Class201 method5328(Buffer arg0, int arg1) {
		try {
			Class201 var2 = Class315.method3140(arg0, (byte) 1);
			int var3 = arg0.readInt((byte) 111);
			int var4 = arg0.readInt((byte) 101);
			return new Class201_Sub3(var2.aClass195_6507, var2.aClass211_6502, var2.anInt6501, var2.anInt6504, var2.anInt6505, var2.anInt6503, var2.anInt6506, var2.anInt6508, var2.anInt6509, var3, var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rv.s(" + ')');
		}
	}

	public static long method5329(int arg0) {
		try {
			return Class332.aClass315_6604.method3134(657781928);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rv.at(" + ')');
		}
	}

	public static void method5330(String arg0, int arg1) {
		try {
			if (client.anInt8995 == 14) {
				Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.aClass234_2542, client.aClass1_9060.aClass488_22, 270391817);
				var2.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 22);
				int var3 = var2.aClass330_Sub46_Sub2_7729.offset;
				var2.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -9);
				var2.aClass330_Sub46_Sub2_7729.offset += 7;
				var2.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, var3, var2.aClass330_Sub46_Sub2_7729.offset, (byte) -127);
				var2.aClass330_Sub46_Sub2_7729.method3772(var2.aClass330_Sub46_Sub2_7729.offset - var3, (byte) 109);
				client.aClass1_9060.method378(var2, -146333287);
				Class357.aClass468_3702 = Class468.aClass468_6857;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rv.p(" + ')');
		}
	}

	public static final void method5331(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rv.alt(" + ')');
		}
	}
}
