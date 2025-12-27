package deob;

import java.io.File;

public class Class550 {

	public static String OSName;

	public static String processorName;

	public static int anInt6288;

	public static int anInt6289;

	public Class550() throws Throwable {
		throw new Error();
	}

	static {
		String var0 = "Unknown";
		try {
			var0 = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception var7) {
		}
		var0.toLowerCase();
		var0 = "Unknown";
		try {
			var0 = System.getProperty("java.version").toLowerCase();
		} catch (Exception var6) {
		}
		var0.toLowerCase();
		var0 = "Unknown";
		try {
			var0 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var5) {
		}
		OSName = var0.toLowerCase();
		var0 = "Unknown";
		try {
			var0 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var4) {
		}
		processorName = var0.toLowerCase();
		var0 = "Unknown";
		try {
			var0 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var3) {
		}
		var0.toLowerCase();
		var0 = "~/";
		try {
			var0 = System.getProperty("user.home").toLowerCase();
		} catch (Exception var2) {
		}
		new File(var0);
	}

	public static void method6364(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -427810018);
			if (var4.method6321((byte) -8)) {
				String var5 = var4.aString6236;
				if (var2 == -1) {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var5;
				} else {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class131.aClass407_1502.method4752(var2, -1251902841).method4634(var3, var5, -443192170);
				}
			} else {
				int var7 = var4.anInt6235;
				if (var2 == -1) {
					arg0.anIntArray4387[++arg0.anInt4376 - 1] = var7;
				} else {
					arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(var2, -1524386741).method4642(var3, var7, 1695370655);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wt.y(" + ')');
		}
	}
}
