package deob;

public class Class121 {

	public static int volume;

	public Class121() throws Throwable {
		throw new Error();
	}

	public static final void method1445(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1297 = Class288.method2886(var4, arg2, 1174149420);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ew.lt(" + ')');
		}
	}

	public static final void method1446(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1110013953);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class330_Sub48_Sub4.method3848(var3, var4, arg0, 861085587);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ew.lz(" + ')');
		}
	}

	public static Class method1447(String arg0, int arg1) throws ClassNotFoundException {
		try {
			if (arg0.equals("B")) {
				return Byte.TYPE;
			} else if (arg0.equals("I")) {
				return Integer.TYPE;
			} else if (arg0.equals("S")) {
				return Short.TYPE;
			} else if (arg0.equals("J")) {
				return Long.TYPE;
			} else if (arg0.equals("Z")) {
				return Boolean.TYPE;
			} else if (arg0.equals("F")) {
				return Float.TYPE;
			} else if (arg0.equals("D")) {
				return Double.TYPE;
			} else if (arg0.equals("C")) {
				return Character.TYPE;
			} else if (arg0.equals("void")) {
				return Void.TYPE;
			} else {
				return Class.forName(arg0);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ew.o(" + ')');
		}
	}

	public static void method1448(byte arg0) {
		try {
			Class110.anInt1152 = 0;
			Class366.musicFile = null;
			Class57.aClass305_6600 = null;
			Class110.aClass280_1161 = null;
			Class288.aClass330_Sub40_Sub2_2955 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ew.d(" + ')');
		}
	}

	public static Class61 method1449(Class_ra arg0, int arg1, int arg2) {
		try {
			Class330_Sub43 var3 = (Class330_Sub43) Class442.aClass497_4489.method6094((long) arg1);
			if (var3 != null) {
				Class330_Sub31_Sub4 var4 = var3.aClass324_Sub1_7825.method3186((byte) 7);
				var3.aBoolean7821 = true;
				if (var4 != null) {
					Class442.aClass451_4490.aClass_ra6641 = arg0;
					return (Class61) var4.method3432(Class442.aClass451_4490, -2069828812);
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ew.s(" + ')');
		}
	}
}
