package deob;

public class Class211 {

	public static Class211 aClass211_2059 = new Class211();

	public static Class211 aClass211_2060 = new Class211();

	public static Class211 aClass211_2058 = new Class211();

	public static Class505 aClass505_2062;

	public static boolean aBoolean2061;

	public int method2221(int arg0, int arg1, byte arg2) {
		try {
			int var4 = Class146.anInt1615 > arg1 ? Class146.anInt1615 : arg1;
			if (aClass211_2059 == this) {
				return 0;
			} else if (aClass211_2058 == this) {
				return var4 - arg0;
			} else if (aClass211_2060 == this) {
				return (var4 - arg0) / 2;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "iw.j(" + ')');
		}
	}

	public static String method2222(long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return null;
			} else if (arg0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;
				for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
					var2++;
				}
				StringBuilder var9 = new StringBuilder(var2);
				while (arg0 != 0L) {
					long var4 = arg0;
					arg0 /= 37L;
					char var6 = Class443.aCharArray4493[(int) (var4 - arg0 * 37L)];
					if (var6 == '_') {
						int var7 = var9.length() - 1;
						var9.setCharAt(var7, Character.toUpperCase(var9.charAt(var7)));
						var6 = 160;
					}
					var9.append(var6);
				}
				var9.reverse();
				var9.setCharAt(0, Character.toUpperCase(var9.charAt(0)));
				return var9.toString();
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "iw.i(" + ')');
		}
	}

	public static final void method2223(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -781817212);
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString1266;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iw.rx(" + ')');
		}
	}
}
