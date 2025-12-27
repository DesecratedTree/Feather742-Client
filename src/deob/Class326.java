package deob;

public class Class326 {

	public int anInt3319;

	public int anInt3317;

	public int anInt3318;

	public int anInt3316;

	public int anInt3320;

	public static Class61 aClass61_3321;

	public Class326(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.anInt3319 = arg1;
		this.anInt3317 = arg2;
		this.anInt3318 = arg3;
		this.anInt3316 = arg4;
		this.anInt3320 = this.anInt3316 - this.anInt3318;
	}

	public static final void method3230(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 4;
			Class115.method1415(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], arg0.anIntArray4387[arg0.anInt4376 + 3], 256, (byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "no.tf(" + ')');
		}
	}

	public static final void method3231(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 2041098355);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class324.method3201(var3, var4, arg0, 854119690);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "no.gf(" + ')');
		}
	}
}
