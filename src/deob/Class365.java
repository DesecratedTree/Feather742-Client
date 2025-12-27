package deob;

public class Class365 implements Interface20 {

	public int[] anIntArray6653;

	public boolean method283(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3, byte arg4) {
		try {
			int[] var6 = this.anIntArray6653;
			for (int var7 = 0; var7 < var6.length; var7++) {
				int var8 = var6[var7];
				if (!arg3.isKeyHeld(var8, 619938802)) {
					return false;
				}
			}
			return true;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "pf.r(" + ')');
		}
	}

	public Class365(int[] arg0) {
		this.anIntArray6653 = arg0;
	}

	public boolean method282(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		int[] var5 = this.anIntArray6653;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.isKeyHeld(var7, -951889871)) {
				return false;
			}
		}
		return true;
	}

	public boolean method284(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		int[] var5 = this.anIntArray6653;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.isKeyHeld(var7, 881274768)) {
				return false;
			}
		}
		return true;
	}

	public boolean method285(Class330_Sub44 arg0, Interface18[] arg1, int arg2, Class355 arg3) {
		int[] var5 = this.anIntArray6653;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.isKeyHeld(var7, -1963222194)) {
				return false;
			}
		}
		return true;
	}

	public static final void method4269(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class304.method3035(var3, var4, arg0, (byte) -23);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pf.jm(" + ')');
		}
	}

	public static final void method4270(Class430 arg0, short arg1) {
		try {
			arg0.anInt4376 -= 2;
			if (arg0.anIntArray4387[arg0.anInt4376] != arg0.anIntArray4387[arg0.anInt4376 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pf.y(" + ')');
		}
	}

	public static void method4271(int arg0) {
		try {
			Class110.aClass330_Sub40_Sub2_1155.method3594(-1636338413);
			Class110.anInt1152 = 1;
			Class110.aClass280_1161 = null;
			Class288.aClass330_Sub40_Sub2_2955 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pf.w(" + ')');
		}
	}

	public static final void method4272(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1898737865);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class274.method2705(var3, var4, arg0, 447127941);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pf.mq(" + ')');
		}
	}
}
