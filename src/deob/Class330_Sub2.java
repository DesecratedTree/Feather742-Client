package deob;

public class Class330_Sub2 extends Class330 {

	public static int anInt7503 = 16;

	public static int anInt7504 = 4;

	public static int anInt7505 = 8;

	public static int anInt7506 = 2;

	public static int anInt7507 = 32;

	public static int anInt7508 = 64;

	public static Class330_Sub2 aClass330_Sub2_7509 = new Class330_Sub2(0, -1);

	public static int anInt7511 = 1;

	public int anInt7510;

	public int anInt7502;

	public final boolean method3262(short arg0) {
		try {
			return (this.anInt7510 >> 22 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.f(" + ')');
		}
	}

	public final boolean method3263(byte arg0) {
		try {
			return (this.anInt7510 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.r(" + ')');
		}
	}

	public final boolean method3264(int arg0, int arg1) {
		try {
			return (this.anInt7510 >> arg0 + 1 & 0x1) != 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "acc.j(" + ')');
		}
	}

	public final int method3265(byte arg0) {
		try {
			return Class535.method6311(this.anInt7510, -119506356);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.i(" + ')');
		}
	}

	public Class330_Sub2(int arg0, int arg1) {
		this.anInt7510 = arg0;
		this.anInt7502 = arg1;
	}

	public final boolean method3266(int arg0) {
		try {
			return (this.anInt7510 >> 21 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.s(" + ')');
		}
	}

	public final boolean method3267(int arg0) {
		try {
			return (this.anInt7510 >> 23 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.z(" + ')');
		}
	}

	public final int method3268(byte arg0) {
		try {
			return this.anInt7510 >> 18 & 0x7;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acc.o(" + ')');
		}
	}

	public static final void method3269(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -830947946);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class212.method2224(var3, var4, arg0, -1542584207);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acc.nn(" + ')');
		}
	}
}
