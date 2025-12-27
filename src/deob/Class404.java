package deob;

public class Class404 {

	public static int anInt4139 = -2;

	public static int anInt4140 = -3;

	public static int anInt4141 = -4;

	public static int anInt4142 = -5;

	public static int anInt4143 = 1;

	public static int anInt4144 = 53;

	public static int anInt4145 = 1;

	public static int anInt4146 = 6;

	public static int anInt4147 = 35;

	public static int anInt4148 = 9;

	public static int anInt4149 = 7;

	public static int anInt4150 = 21;

	public static int anInt4151 = 23;

	public static int anInt4152 = 29;

	public static int anInt4153 = 2;

	public static int anInt4154 = 45;

	public static int anInt4155 = 15;

	public static int anInt4156 = 48;

	public static int anInt4157 = 49;

	public static int anInt4158 = 52;

	public static int anInt4159 = 42;

	public static int anInt4160;

	public static int anInt4161;

	public static Class457 aClass457_4162;

	public Class404() throws Throwable {
		throw new Error();
	}

	public static final void method4734(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1253 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			method4738(arg0, 903695907);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qu.em(" + ')');
		}
	}

	public static final void method4735(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class153.method1792(var3, var4, arg0, -429858330);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qu.na(" + ')');
		}
	}

	public static final void method4736(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1292339506);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1296;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qu.rk(" + ')');
		}
	}

	public static int method4737(CharSequence arg0, char arg1, byte arg2) {
		try {
			int var3 = 0;
			int var4 = arg0.length();
			for (int var5 = 0; var5 < var4; var5++) {
				if (arg0.charAt(var5) == arg1) {
					var3++;
				}
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qu.r(" + ')');
		}
	}

	public static void method4738(IComponentDefinitions arg0, int arg1) {
		try {
			if (arg0.anInt1359 == client.anInt9214) {
				client.aBooleanArray9230[arg0.anInt1358] = true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qu.lz(" + ')');
		}
	}

	public static int method4739(int arg0, int arg1) {
		try {
			double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			double var6 = (double) (arg0 & 0xFF) / 256.0D;
			double var8 = var2;
			if (var4 < var2) {
				var8 = var4;
			}
			if (var6 < var8) {
				var8 = var6;
			}
			double var10 = var2;
			if (var4 > var2) {
				var10 = var4;
			}
			if (var6 > var10) {
				var10 = var6;
			}
			double var12 = 0.0D;
			double var14 = 0.0D;
			double var16 = (var10 + var8) / 2.0D;
			if (var10 != var8) {
				if (var16 < 0.5D) {
					var14 = (var10 - var8) / (var8 + var10);
				}
				if (var16 >= 0.5D) {
					var14 = (var10 - var8) / (2.0D - var10 - var8);
				}
				if (var2 == var10) {
					var12 = (var4 - var6) / (var10 - var8);
				} else if (var4 == var10) {
					var12 = (var6 - var2) / (var10 - var8) + 2.0D;
				} else if (var10 == var6) {
					var12 = (var2 - var4) / (var10 - var8) + 4.0D;
				}
			}
			var12 /= 6.0D;
			int var18 = (int) (var12 * 256.0D);
			int var19 = (int) (var14 * 256.0D);
			int var20 = (int) (var16 * 256.0D);
			if (var19 < 0) {
				var19 = 0;
			} else if (var19 > 255) {
				var19 = 255;
			}
			if (var20 < 0) {
				var20 = 0;
			} else if (var20 > 255) {
				var20 = 255;
			}
			if (var20 > 243) {
				var19 >>= 0x4;
			} else if (var20 > 217) {
				var19 >>= 0x3;
			} else if (var20 > 192) {
				var19 >>= 0x2;
			} else if (var20 > 179) {
				var19 >>= 0x1;
			}
			return (var20 >> 1) + (var19 >> 5 << 7) + ((var18 >> 2 & 0x3F) << 10);
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "qu.n(" + ')');
		}
	}
}
