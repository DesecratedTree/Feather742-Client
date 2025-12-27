package deob;

public class Class125 {

	public static int anInt1451;

	public static int anInt1452;

	public static int anInt1453;

	public static int anInt1455;

	public static int anInt1456;

	public static int anInt1458;

	public static Class263 aClass263_1454;

	public static Class61[] aClass61Array1457;

	public static byte[][][] aByteArrayArrayArray1459;

	public Class125() throws Throwable {
		throw new Error();
	}

	public static final void method1524(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 198067769);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class375.method4354(var3, var4, arg0, (byte) -74);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "f.fe(" + ')');
		}
	}

	public static String method1525(byte[] arg0, int arg1, int arg2, byte arg3) {
		try {
			char[] var4 = new char[arg2];
			int var5 = 0;
			for (int var6 = 0; var6 < arg2; var6++) {
				int var7 = arg0[arg1 + var6] & 0xFF;
				if (var7 != 0) {
					if (var7 >= 128 && var7 < 160) {
						char var8 = Class458.aCharArray5564[var7 - 128];
						if (var8 == 0) {
							var8 = '?';
						}
						var7 = var8;
					}
					var4[var5++] = (char) var7;
				} else if (arg3 != 1) {
				}
			}
			return new String(var4, 0, var5);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "f.z(" + ')');
		}
	}

	public static void method1526(int arg0, int arg1, int arg2, Class330_Sub3 arg3, int arg4) {
		try {
			long var5 = (long) (arg0 << 28 | arg2 << 14 | arg1);
			Class330_Sub9 var7 = (Class330_Sub9) client.aClass497_9138.method6094(var5);
			if (var7 == null) {
				var7 = new Class330_Sub9();
				client.aClass497_9138.method6097(var7, var5);
				var7.aClass471_7573.method5878(arg3, (short) 8192);
			} else {
				ItemDefinitions var8 = Class556.aClass510_6392.getItemDefinitions(arg3.anInt7513, (byte) -4);
				int var9 = var8.value;
				if (var8.anInt6736 == 1) {
					var9 *= arg3.anInt7512 + 1;
				}
				for (Class330_Sub3 var10 = (Class330_Sub3) var7.aClass471_7573.method5869(539664854); var10 != null; var10 = (Class330_Sub3) var7.aClass471_7573.method5873((byte) -22)) {
					var8 = Class556.aClass510_6392.getItemDefinitions(var10.anInt7513, (byte) -99);
					int var11 = var8.value;
					if (var8.anInt6736 == 1) {
						var11 *= var10.anInt7512 + 1;
					}
					if (var9 > var11) {
						Class511.method6186(arg3, var10, -1884670110);
						return;
					}
				}
				var7.aClass471_7573.method5878(arg3, (short) 8192);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "f.jk(" + ')');
		}
	}

	public static void method1527(int arg0, int arg1) {
		try {
			Class128.method1551(new Class462(arg0), -1793814050);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "f.j(" + ')');
		}
	}

	public static int method1528(byte[] arg0, int arg1, int arg2) {
		try {
			return Class106.method1325(arg0, 0, arg1, -2079606110);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "f.j(" + ')');
		}
	}

	public static final void method1529(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class196.method2146(var3, var4, arg0, (byte) -108);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "f.dz(" + ')');
		}
	}

	public static final void method1530(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.anInt4376 -= 3;
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			IsaacCipher.method6048(var2, var3 == 1, var4, var5, -1726056090);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class440.anInt4482;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "f.abg(" + ')');
		}
	}
}
