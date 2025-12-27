package deob;

public class Class451 implements Interface17 {

	public static int anInt6642;

	public static int anInt6643;

	public Class_ra aClass_ra6641;

	public Object method262(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return this.aClass_ra6641.bu(arg0, arg1, arg2, arg3, arg4, false);
	}

	public Object method263(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return this.aClass_ra6641.bu(arg0, arg1, arg2, arg3, arg4, false);
	}

	public Object method260(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return this.aClass_ra6641.bu(arg0, arg1, arg2, arg3, arg4, false);
	}

	public Object method261(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			return this.aClass_ra6641.bu(arg0, arg1, arg2, arg3, arg4, false);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "sr.r(" + ')');
		}
	}

	public static String method5631(long arg0, int arg1, boolean arg2, Class454 arg3, int arg4) {
		try {
			char var6 = ',';
			char var7 = '.';
			if (Class454.aClass454_6832 == arg3) {
				var6 = '.';
				var7 = ',';
			}
			if (Class454.aClass454_6830 == arg3) {
				var7 = 160;
			}
			boolean var8 = false;
			if (arg0 < 0L) {
				var8 = true;
				arg0 = -arg0;
			}
			StringBuilder var9 = new StringBuilder(26);
			int var10;
			int var11;
			if (arg1 > 0) {
				for (var10 = 0; var10 < arg1; var10++) {
					var11 = (int) arg0;
					arg0 /= 10L;
					var9.append((char) (var11 + 48 - (int) arg0 * 10));
				}
				var9.append(var6);
			}
			var10 = 0;
			while (true) {
				var11 = (int) arg0;
				arg0 /= 10L;
				var9.append((char) (var11 + 48 - (int) arg0 * 10));
				if (arg0 == 0L) {
					if (arg4 >= 438991284) {
					}
					if (var8) {
						var9.append('-');
					}
					return var9.reverse().toString();
				}
				if (arg2) {
					var10++;
					if (var10 % 3 == 0) {
						var9.append(var7);
					}
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "sr.o(" + ')');
		}
	}

	public static final void method5632(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class152.method1784(var3, var4, arg0, (byte) -103);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sr.dw(" + ')');
		}
	}

	public static void method5633(int arg0) {
		try {
			int var1 = 0;
			if (Class448.aClass330_Sub50_5555 != null) {
				var1 = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5754(-1923330549);
			}
			int var2;
			int var3;
			if (var1 == 2) {
				var2 = client.anInt6609 > 800 ? 800 : client.anInt6609;
				var3 = Class520.anInt6017 > 600 ? 600 : Class520.anInt6017;
				Class300.anInt3058 = var2;
				client.anInt6611 = (client.anInt6609 - var2) / 2;
				Class146.anInt1615 = var3;
				client.anInt6612 = 0;
			} else if (var1 == 1) {
				var2 = client.anInt6609 > 1024 ? 1024 : client.anInt6609;
				var3 = Class520.anInt6017 > 768 ? 768 : Class520.anInt6017;
				Class300.anInt3058 = var2;
				client.anInt6611 = (client.anInt6609 - var2) / 2;
				Class146.anInt1615 = var3;
				client.anInt6612 = 0;
			} else {
				Class300.anInt3058 = client.anInt6609;
				client.anInt6611 = 0;
				Class146.anInt1615 = Class520.anInt6017;
				client.anInt6612 = 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sr.gz(" + ')');
		}
	}

	public static final void method5634(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1518736658);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class153.method1792(var3, var4, arg0, -182537974);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sr.nx(" + ')');
		}
	}
}
