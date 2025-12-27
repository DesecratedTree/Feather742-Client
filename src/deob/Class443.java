package deob;

public class Class443 {

	public static char[] aCharArray4493 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static long[] aLongArray4492 = new long[12];

	static {
		for (int var0 = 0; var0 < aLongArray4492.length; var0++) {
			aLongArray4492[var0] = (long) Math.pow(37.0D, (double) var0);
		}
	}

	public Class443() throws Throwable {
		throw new Error();
	}

	public static final void method5613(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class246.method2453(var3, var4, arg0, -828851911);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "si.mo(" + ')');
		}
	}

	public static boolean method5614(byte arg0) {
		try {
			if (Class422.aClass330_Sub36_Sub10_4321 == null) {
				return false;
			} else {
				if (Class422.aClass330_Sub36_Sub10_4321.anInt9699 >= 2000) {
					Class422.aClass330_Sub36_Sub10_4321.anInt9699 -= 2000;
				}
				return Class422.aClass330_Sub36_Sub10_4321.anInt9699 == 1007;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "si.w(" + ')');
		}
	}

	public static void method5615(int arg0, String arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(3, (long) arg0);
			var3.method3445((byte) 0);
			var3.aString9649 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "si.ax(" + ')');
		}
	}
}
