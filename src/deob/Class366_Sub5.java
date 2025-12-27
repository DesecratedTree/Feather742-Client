package deob;

import java.io.File;

public class Class366_Sub5 extends Class366 {

	public int anInt8008;

	public boolean method4274(int arg0, int arg1, int arg2, Class307 arg3, int arg4) {
		try {
			return arg3.method3069(arg1, arg2, arg0, arg0, this.anInt3854, this.anInt3853, this.anInt3852, this.anInt3855, this.anInt8008, (byte) -9);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aem.r(" + ')');
		}
	}

	public boolean method4275(int arg0, int arg1, int arg2, Class307 arg3) {
		return arg3.method3069(arg1, arg2, arg0, arg0, this.anInt3854 * -216790319 * -1089827279, this.anInt3853 * 1307742219 * 1420524451, this.anInt3852 * -1343825313 * 1706819999, this.anInt3855 * -1402089255 * 1343860585, this.anInt8008 * 292058949 * -359234675, (byte) -115);
	}

	public boolean method4273(int arg0, int arg1, int arg2, Class307 arg3) {
		return arg3.method3069(arg1, arg2, arg0, arg0, this.anInt3854 * -216790319 * -1089827279, this.anInt3853 * 1307742219 * 1420524451, this.anInt3852 * -1343825313 * 1706819999, this.anInt3855 * -1402089255 * 1343860585, this.anInt8008 * 292058949 * -359234675, (byte) -73);
	}

	public static final void method4280(Class430 arg0, int arg1) {
		try {
			String var2 = null;
			if (Class101.aClass148_6458 != null) {
				var2 = Class101.aClass148_6458.method1746(369318015);
			}
			if (var2 == null) {
				var2 = "";
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aem.aos(" + ')');
		}
	}

	public static final void method4281(Class430 arg0, int arg1) {
		try {
			long var2 = Class312.method3111((byte) 35);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class291.method2905(var2);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aem.ama(" + ')');
		}
	}

	public static String method4282(String arg0, byte arg1) {
		try {
			StringBuilder var2 = new StringBuilder();
			int var3 = arg0.length();
			for (int var4 = 0; var4 < var3; var4++) {
				char var5 = arg0.charAt(var4);
				if (var5 == '%' && var3 > var4 + 2) {
					var5 = arg0.charAt(var4 + 1);
					boolean var6 = false;
					int var7;
					if (var5 >= '0' && var5 <= '9') {
						var7 = var5 - '0';
					} else if (var5 >= 'a' && var5 <= 'f') {
						var7 = var5 + '\n' - 97;
					} else {
						if (var5 < 'A' || var5 > 'F') {
							var2.append('%');
							continue;
						}
						var7 = var5 + '\n' - 65;
					}
					var7 *= 16;
					char var8 = arg0.charAt(var4 + 2);
					if (var8 >= '0' && var8 <= '9') {
						var7 += var8 - '0';
					} else if (var8 >= 'a' && var8 <= 'f') {
						var7 += var8 + '\n' - 97;
					} else {
						if (var8 < 'A' || var8 > 'F') {
							var2.append('%');
							continue;
						}
						var7 += var8 + '\n' - 65;
					}
					if (var7 != 0 && Class230.method2342((byte) var7, -1801160988)) {
						var2.append(Class127.method1546((byte) var7, -2112614321));
					}
					var4 += 2;
				} else if (var5 == '+') {
					var2.append(' ');
				} else {
					var2.append(var5);
				}
			}
			return var2.toString();
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aem.r(" + ')');
		}
	}

	public static final void method4283(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3787;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aem.ajw(" + ')');
		}
	}

	public static File method4284(byte arg0) {
		try {
			return Class60.aFile559;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aem.f(" + ')');
		}
	}
}
