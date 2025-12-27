package deob;

public class Class117 {

	public int anInt1381 = Class99.method1202(476297814);

	public int anInt1378 = client.anInt8981;

	public int anInt1379;

	public int anInt1380;

	public String aString1377;

	public String aString1383;

	public String aString1382;

	public String aString1384;

	public int anInt1385;

	public String aString1386;

	public static IndexTable aClass280_1387;

	public Class117(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
		this.anInt1379 = arg0;
		this.anInt1380 = arg1;
		this.aString1377 = arg2;
		this.aString1383 = arg3;
		this.aString1382 = arg4;
		this.aString1384 = arg5;
		this.anInt1385 = arg6;
		this.aString1386 = arg7;
	}

	public void method1422(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, int arg8) {
		try {
			this.anInt1381 = Class99.method1202(476297814);
			this.anInt1378 = client.anInt8981;
			this.anInt1379 = arg0;
			this.anInt1380 = arg1;
			this.aString1377 = arg2;
			this.aString1383 = arg3;
			this.aString1382 = arg4;
			this.aString1384 = arg5;
			this.anInt1385 = arg6;
			this.aString1386 = arg7;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "es.r(" + ')');
		}
	}

	public static void method1423(Class330_Sub42 arg0, int arg1) {
		try {
			Class163.method1921(arg0, 200000, (byte) -38);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "es.i(" + ')');
		}
	}

	public static boolean method1424(CharSequence arg0, int arg1, boolean arg2, int arg3) {
		try {
			if (arg1 < 2 || arg1 > 36) {
				throw new IllegalArgumentException("" + arg1);
			}
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = arg0.length();
			for (int var8 = 0; var8 < var7; var8++) {
				char var9 = arg0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}
					if (var9 == '+' && arg2) {
						if (arg3 == -1201022853) {
							throw new IllegalStateException();
						}
						continue;
					}
				}
				int var12;
				if (var9 >= '0' && var9 <= '9') {
					var12 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var12 = var9 - '7';
				} else if (var9 >= 'a' && var9 <= 'z') {
					var12 = var9 - 'W';
				} else {
					return false;
				}
				if (var12 >= arg1) {
					return false;
				}
				if (var4) {
					var12 = -var12;
				}
				int var10 = var6 * arg1 + var12;
				if (var6 != var10 / arg1) {
					return false;
				}
				var6 = var10;
				var5 = true;
			}
			return var5;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "es.p(" + ')');
		}
	}

	public static Class496[] method1425(int arg0) {
		try {
			return new Class496[] { Class496.aClass496_5874, Class496.aClass496_5875, Class496.aClass496_5873 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "es.r(" + ')');
		}
	}

	public static String method1426(String arg0, int arg1) {
		try {
			int var2 = arg0.length();
			int var3 = 0;
			for (int var4 = 0; var4 < var2; var4++) {
				char var5 = arg0.charAt(var4);
				if (var5 == '<' || var5 == '>') {
					var3 += 3;
				}
			}
			StringBuilder var8 = new StringBuilder(var2 + var3);
			for (int var9 = 0; var9 < var2; var9++) {
				char var6 = arg0.charAt(var9);
				if (var6 == '<') {
					var8.append("<lt>");
				} else if (var6 == '>') {
					var8.append("<gt>");
				} else {
					var8.append(var6);
				}
			}
			return var8.toString();
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "es.r(" + ')');
		}
	}
}
