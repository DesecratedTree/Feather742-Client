package deob;

public class Class371 implements Interface20 {

	public int anInt6654;

	public int anInt6655;

	public boolean method285(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			Interface18 var6 = arg1[var5];
			if (var6 != null && var6.method264((byte) 0) == this.anInt6654 * -1269129971 * 733116869 && var6.method268((byte) -127) == this.anInt6655 * 485870675 * -800172069) {
				return true;
			}
		}
		return false;
	}

	public boolean method282(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			Interface18 var6 = arg1[var5];
			if (var6 != null && var6.method264((byte) 0) == this.anInt6654 * -1269129971 * 733116869 && var6.method268((byte) -81) == this.anInt6655 * 485870675 * -800172069) {
				return true;
			}
		}
		return false;
	}

	public boolean method284(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			Interface18 var6 = arg1[var5];
			if (var6 != null && var6.method264((byte) 0) == this.anInt6654 * -1269129971 * 733116869 && var6.method268((byte) -125) == this.anInt6655 * 485870675 * -800172069) {
				return true;
			}
		}
		return false;
	}

	public boolean method283(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3, byte arg4) {
		try {
			for (int var6 = 0; var6 < arg2 && var6 < arg1.length; var6++) {
				Interface18 var7 = arg1[var6];
				if (var7 == null) {
					if (arg4 <= 0) {
					}
				} else if (var7.method264((byte) 0) == this.anInt6654 && var7.method268((byte) -38) == this.anInt6655) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "pl.r(" + ')');
		}
	}

	public Class371(int arg0, int arg1) {
		this.anInt6654 = arg0;
		this.anInt6655 = arg1;
	}

	public static final void method4319(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class196.method2144(var3, var4, arg0, (byte) 0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pl.mk(" + ')');
		}
	}

	public static final void method4320(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(6, var2 << 16 | var3, var4, "", (byte) 67);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pl.ane(" + ')');
		}
	}

	public static boolean method4321(int arg0) {
		try {
			if (client.aByteArray8959 == null) {
				return Class360.anInt3749 == -1 ? Class209.method2210(Class360.username, Class360.password, 185547004) : Class232.method2360(-904052712);
			} else {
				return Class395.method4647(-1865505322);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pl.r(" + ')');
		}
	}

	public static final void method4322(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class475.method5938(var2, var3, false, -1356996440);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pl.tv(" + ')');
		}
	}
}
