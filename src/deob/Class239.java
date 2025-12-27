package deob;

import java.net.URL;

public class Class239 {

	public static int[] anIntArray2586 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0 };

	public static int anInt2587 = -1;

	public static boolean aBoolean2593 = false;

	public static int anInt2591 = -1;

	public static long aLong2590;

	public static Class240 aClass240_2592;

	public static Class546 aClass546_2588;

	public static IndexTable aClass280_2589;

	public static IndexTable aClass280_2594;

	public static Class258[] aClass258Array2585;

	public static Interface14[] anInterface14Array2584;

	public Class239() throws Throwable {
		throw new Error();
	}

	public static boolean method2379(String arg0, int arg1, String arg2, byte arg3) {
		try {
			boolean var4;
			if (arg1 == 0) {
				try {
					if (!Class212.aString6533.startsWith("win")) {
						throw new Exception();
					} else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
						String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
						for (int var6 = 0; var6 < arg0.length(); var6++) {
							if (var13.indexOf(arg0.charAt(var6)) == -1) {
								throw new Exception();
							}
						}
						Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
						var4 = true;
						return var4;
					} else {
						throw new Exception();
					}
				} catch (Throwable var11) {
					return false;
				}
			} else if (arg1 == 1) {
				try {
					Object var5 = Class492.method6079(Class293.anApplet6804, arg2, new Object[] { (new URL(Class293.anApplet6804.getCodeBase(), arg0)).toString() }, -1886425584);
					var4 = var5 != null;
				} catch (Throwable var7) {
					return false;
				}
				return var4;
			} else if (arg1 == 2) {
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL(Class293.anApplet6804.getCodeBase(), arg0), "_blank");
					var4 = true;
				} catch (Exception var8) {
					return false;
				}
				return var4;
			} else if (arg1 == 3) {
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable var10) {
				}
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL(Class293.anApplet6804.getCodeBase(), arg0), "_top");
					var4 = true;
				} catch (Exception var9) {
					return false;
				}
				return var4;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ka.p(" + ')');
		}
	}

	public static final void method2380(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1581409337);
			Gfx.method788(var3, arg0, -1887972975);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ka.qy(" + ')');
		}
	}

	public static final void method2381(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5716(var2, 1223382442);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ka.aqb(" + ')');
		}
	}

	public static final void method2382(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class345.method4011(var2, false, -1963513573);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ka.uy(" + ')');
		}
	}

	public static Class330_Sub34 method2383(byte arg0) {
		try {
			return Class330_Sub34.anInt7727 == 0 ? new Class330_Sub34() : Class330_Sub34.aClass330_Sub34Array7731[--Class330_Sub34.anInt7727];
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ka.r(" + ')');
		}
	}
}
