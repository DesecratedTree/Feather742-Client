package deob;

public abstract class Class166 {

	public Class145 aClass145_1699;

	public static int anInt1700;

	public Class166(Class145 arg0) {
		this.aClass145_1699 = arg0;
	}

	public static final void method1988(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			IComponentDefinitions var5 = Class95.method1101(var4, 891872934);
			Class380.method4395(var5, var2, var3, (byte) -42);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gu.sd(" + ')');
		}
	}

	public static final void method1989(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class545.method6349(var2, -1679642481);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gu.wx(" + ')');
		}
	}

	public static final void method1990(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2.startsWith(Class325_Sub4.method3225(0, 934024603)) || var2.startsWith(Class325_Sub4.method3225(1, 1886328877))) {
				var2 = var2.substring(7);
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class419.method5280(var2, (byte) 0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gu.xf(" + ')');
		}
	}

	public static final void method1991(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2 + var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gu.za(" + ')');
		}
	}

	public static final void method1992(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class401_Sub1.aClass145_Sub1_8249.method1690((float) (2.0D * 3.141592653589793D * (double) var2 / 16384.0D), (float) (2.0D * 3.141592653589793D * (double) var3 / 16384.0D), -1943771105);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gu.aht(" + ')');
		}
	}

	public static IComponentDefinitions method1993(int arg0, int arg1, int arg2) {
		try {
			IComponentDefinitions var3 = Class95.method1101(arg0, 1413571311);
			if (arg1 == -1) {
				return var3;
			} else if (var3 == null || var3.aClass114Array1347 == null || arg1 >= var3.aClass114Array1347.length) {
				return null;
			} else {
				return var3.aClass114Array1347[arg1];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gu.p(" + ')');
		}
	}

	public static final void method1994(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class372.method4335((byte) 99);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gu.ud(" + ')');
		}
	}

	public static String method1995(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			if (arg1 < 2 || arg1 > 36) {
				throw new IllegalArgumentException("" + arg1);
			} else if (arg2 && arg0 >= 0) {
				int var4 = 2;
				int var5 = arg0 / arg1;
				while (var5 != 0) {
					var5 /= arg1;
					var4++;
				}
				char[] var6 = new char[var4];
				var6[0] = '+';
				for (int var7 = var4 - 1; var7 > 0; var7--) {
					int var8 = arg0;
					arg0 /= arg1;
					int var9 = var8 - arg0 * arg1;
					if (var9 >= 10) {
						var6[var7] = (char) (var9 + 87);
					} else {
						var6[var7] = (char) (var9 + 48);
					}
				}
				return new String(var6);
			} else {
				return Integer.toString(arg0, arg1);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "gu.w(" + ')');
		}
	}

	public static void method1996(byte arg0) {
		try {
			Class9.anInt140 = 0;
			Class9.anInt146 = -1;
			Class9.anInt151 = -1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "gu.j(" + ')');
		}
	}

	public abstract void method1965(Buffer arg0);

	public abstract void method1966(float arg0, Class307 arg1, int[][][] arg2, int arg3);

	public abstract void method1967(Class138 arg0, int arg1, int arg2);

	public abstract Class260 method1968(byte arg0);

	public abstract Class330_Sub28 method1969(byte arg0);

	public abstract void method1970(Class138 arg0, int arg1, int arg2, byte arg3);

	public abstract boolean method1971();

	public abstract void method1972(float arg0, Class307 arg1, int[][][] arg2);

	public abstract void method1973(float arg0, Class307 arg1, int[][][] arg2);

	public abstract void method1974(Buffer arg0, short arg1);

	public abstract boolean method1975();

	public abstract boolean method1976();

	public abstract void method1977(Class138 arg0, int arg1, int arg2);

	public abstract boolean method1978();

	public abstract Class260 method1979();

	public abstract Class330_Sub28 method1980();

	public abstract Class330_Sub28 method1981();

	public abstract Class330_Sub28 method1982();

	public abstract void method1983(float arg0, Class307 arg1, int[][][] arg2);

	public abstract Class330_Sub28 method1984();

	public abstract boolean method1985(int arg0);

	public abstract void method1986(Class138 arg0, int arg1, int arg2);

	public abstract Class330_Sub28 method1987();
}
