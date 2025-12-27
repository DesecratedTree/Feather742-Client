package deob;

public class Class284 {

	public static int anInt2928;

	public static IndexTable aClass280_2927;

	public Class284() throws Throwable {
		throw new Error();
	}

	public static final void method2829(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(5, var2 << 16 | var3, var4, "", (byte) 7);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lv.ant(" + ')');
		}
	}

	public static final void method2830(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class423.method5303(var2, var3, false, 170698964);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lv.tc(" + ')');
		}
	}
}
