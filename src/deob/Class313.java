package deob;

public class Class313 implements Interface19 {

	public static Class61 aClass61_6650;

	public boolean method280(Class432_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface2;
	}

	public boolean method279(Class432_Sub1_Sub1 arg0, int arg1) {
		try {
			return arg0 instanceof Interface2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "n.r(" + ')');
		}
	}

	public boolean method278(Class432_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface2;
	}

	public boolean method281(Class432_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface2;
	}

	public static void method3115(Class440 arg0, int arg1, byte arg2) {
		try {
			if (Class333.anInt3360 < 50 && arg0 != null && arg0.anIntArrayArray4463 != null && arg1 < arg0.anIntArrayArray4463.length && arg0.anIntArrayArray4463[arg1] != null) {
				int var3 = arg0.anIntArrayArray4463[arg1][0];
				int var4 = var3 >> 8;
				int var5 = var3 >> 5 & 0x7;
				int var6;
				if (arg0.anIntArrayArray4463[arg1].length > 1) {
					var6 = (int) (Math.random() * (double) arg0.anIntArrayArray4463[arg1].length);
					if (var6 > 0) {
						var4 = arg0.anIntArrayArray4463[arg1][var6];
					}
				}
				var6 = 256;
				if (arg0.anIntArray4468 != null && arg0.anIntArray4478 != null) {
					var6 = Class340.method3970(arg0.anIntArray4468[arg1], arg0.anIntArray4478[arg1], 1852239889);
				}
				int var7 = arg0.anIntArray4476 == null ? 255 : arg0.anIntArray4476[arg1];
				if (arg0.aBoolean4475) {
					Class197.method2147(var4, var5, 0, var7, false, var6, 828842400);
				} else {
					Class115.method1415(var4, var5, 0, var7, var6, (byte) -1);
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "n.l(" + ')');
		}
	}

	public static final void method3116(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class464_Sub23.aClass350_8712.method4031((short) 18352);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "n.vf(" + ')');
		}
	}

	public static final void method3117(Class330_Sub10 arg0, int arg1) {
		try {
			Class356 var2 = client.aClass304_9030.method3023(-400722441);
			if (var2 != null) {
				Interface2 var3 = null;
				if (arg0.anInt7575 == 0) {
					var3 = (Interface2) var2.method4154(arg0.anInt7581, arg0.anInt7582, arg0.anInt7577, -2040838155);
				}
				if (arg0.anInt7575 == 1) {
					var3 = (Interface2) var2.method4156(arg0.anInt7581, arg0.anInt7582, arg0.anInt7577, 1964913197);
				}
				if (arg0.anInt7575 == 2) {
					var3 = (Interface2) var2.method4158(arg0.anInt7581, arg0.anInt7582, arg0.anInt7577, client.anInterface19_9266, (byte) -87);
				}
				if (arg0.anInt7575 == 3) {
					var3 = (Interface2) var2.method4177(arg0.anInt7581, arg0.anInt7582, arg0.anInt7577, 1315717432);
				}
				if (var3 == null) {
					arg0.anInt7578 = -1;
					arg0.anInt7580 = 0;
					arg0.anInt7579 = 0;
				} else {
					arg0.anInt7578 = var3.method34((short) -985);
					arg0.anInt7580 = var3.method21(1020268653);
					arg0.anInt7579 = var3.method33((byte) -100);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "n.p(" + ')');
		}
	}

	public static void method3118(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(14, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "n.v(" + ')');
		}
	}
}
