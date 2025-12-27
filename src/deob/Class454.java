package deob;

import java.util.Locale;

public class Class454 implements Interface26 {

	public static int anInt6828 = 7;

	public static Class454 aClass454_6832 = new Class454("EN", "en", "English", Class457.aClass457_6834, 0, "GB");

	public static Class454 aClass454_6822 = new Class454("DE", "de", "German", Class457.aClass457_6834, 1, "DE");

	public static Class454 aClass454_6830 = new Class454("FR", "fr", "French", Class457.aClass457_6834, 2, "FR");

	public static Class454 aClass454_6824 = new Class454("PT", "pt", "Portuguese", Class457.aClass457_6834, 3, "BR");

	public static Class454 aClass454_6825 = new Class454("NL", "nl", "Dutch", Class457.aClass457_6839, 4, "NL");

	public static Class454 aClass454_6826 = new Class454("ES", "es", "Spanish", Class457.aClass457_6839, 5, "ES");

	public static Class454[] aClass454Array6821;

	public String aString6827;

	public String aString6829;

	public int anInt6823;

	public Locale aLocale6831;

	static {
		Class454[] var0 = method5650(-869031502);
		aClass454Array6821 = new Class454[var0.length];
		Class454[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Class454 var3 = var1[var2];
			if (aClass454Array6821[var3.anInt6823] != null) {
				throw new IllegalStateException();
			}
			aClass454Array6821[var3.anInt6823] = var3;
		}
	}

	public static final void method5644(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Preferences.method2923(var3, var4, arg0, 1694127020);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "su.fm(" + ')');
		}
	}

	public int method297(short arg0) {
		try {
			return this.anInt6823;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "su.j(" + ')');
		}
	}

	public Locale method5645(int arg0) {
		try {
			return this.aLocale6831;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "su.p(" + ')');
		}
	}

	public static Class454 method5646(int arg0, int arg1) {
		try {
			return arg0 >= 0 && arg0 < aClass454Array6821.length ? aClass454Array6821[arg0] : null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "su.o(" + ')');
		}
	}

	public String toString() {
		try {
			return this.method5648(-512418066).toLowerCase(Locale.ENGLISH);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "su.toString(" + ')');
		}
	}

	public static final void method5647(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (Class503.aBoolean5914) {
				Class96.method1182(3, var2, var3, false, -2000230590);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class130.aFrame1498 == null ? 0 : 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "su.afd(" + ')');
		}
	}

	public int method298() {
		return this.anInt6823 * 114944057 * 2131854857;
	}

	public int method300() {
		return this.anInt6823 * 114944057 * 2131854857;
	}

	public int method301() {
		return this.anInt6823 * 114944057 * 2131854857;
	}

	public Class454(String arg0, String arg1, String arg2, Class457 arg3, int arg4, String arg5) {
		this.aString6827 = arg0;
		this.aString6829 = arg1;
		this.anInt6823 = arg4;
		if (arg5 == null) {
			this.aLocale6831 = new Locale(arg1.substring(0, 2));
		} else {
			this.aLocale6831 = new Locale(arg1.substring(0, 2), arg5);
		}
	}

	public String method5648(int arg0) {
		try {
			return this.aString6829;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "su.i(" + ')');
		}
	}

	public int method299() {
		return this.anInt6823 * 114944057 * 2131854857;
	}

	public static final void method5649(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -229137574);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, false, 2, arg0, (byte) 79);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "su.hr(" + ')');
		}
	}

	public static Class454[] method5650(int arg0) {
		try {
			return new Class454[] { aClass454_6826, aClass454_6824, aClass454_6830, aClass454_6832, aClass454_6822, aClass454_6825 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "su.r(" + ')');
		}
	}

	public static final void method5651(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aByteArray1654[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "su.xn(" + ')');
		}
	}

	public static final void method5652(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1922260102);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class43.method585(var3, var4, arg0, 822953439);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "su.io(" + ')');
		}
	}
}
