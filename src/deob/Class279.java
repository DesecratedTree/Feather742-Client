package deob;

public class Class279 {

	public static int anInt2886 = 1;

	public static int anInt2887 = 4;

	public static int anInt2888 = 2;

	public static int anInt2889 = 1;

	public static int anInt2890 = 6;

	public static int anInt2891 = 1;

	public Class279() throws Throwable {
		throw new Error();
	}

	public static final void method2743(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5833(16777215) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lp.alc(" + ')');
		}
	}

	public static final void method2744(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			float var2 = (float) arg0.anIntArray4387[arg0.anInt4376];
			float var3 = (float) arg0.anIntArray4387[arg0.anInt4376 + 1];
			float var4 = (float) arg0.anIntArray4387[arg0.anInt4376 + 2];
			float var5 = (float) arg0.anIntArray4387[arg0.anInt4376 + 3] / 1000.0F;
			Class401_Sub1.aClass145_Sub1_8249.method1679(Class260.method2577(var2, var3, var4), var5, -1549003866);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lp.aim(" + ')');
		}
	}

	public static void method2745(Class330_Sub41 arg0, int arg1) {
		try {
			if (!Class297.aLinkedList3050.contains(arg0)) {
				Class297.aLinkedList3050.add(arg0);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lp.j(" + ')');
		}
	}

	public static void method2746(Class470 arg0, int arg1) {
		try {
			Class556.aClass470_6390 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lp.n(" + ')');
		}
	}

	public static final void method2747(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			int var5 = client.anInt8988;
			int var6 = client.anInt9100;
			Class61 var7;
			if (client.anInt9062 == 1) {
				var7 = Class507.aClass61Array5940[client.anInt9101 / 100];
				var7.method687(var5 - 8, var6 - 8);
			}
			if (client.anInt9062 == 2) {
				var7 = Class507.aClass61Array5940[client.anInt9101 / 100 + 4];
				var7.method687(var5 - 8, var6 - 8);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lp.jt(" + ')');
		}
	}

	public static final void method2748(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 689139900);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class341.method3976(var3, var4, arg0, 1805343138);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lp.nf(" + ')');
		}
	}

	public static void method2749(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			float var5 = (float) Class354_Sub1.anInt3513 / (float) Class354_Sub1.anInt3524;
			int var6 = arg2;
			int var7 = arg3;
			if (var5 < 1.0F) {
				var7 = (int) ((float) arg2 * var5);
			} else {
				var6 = (int) ((float) arg3 / var5);
			}
			int var9 = arg0 - (arg2 - var6) / 2;
			int var10 = arg1 - (arg3 - var7) / 2;
			Class204.anInt6517 = var9 * Class354_Sub1.anInt3524 / var6;
			Class149_Sub1.anInt8867 = Class354_Sub1.anInt3513 - var10 * Class354_Sub1.anInt3513 / var7;
			Class354_Sub1.anInt7983 = -1;
			Class354_Sub1.anInt7986 = -1;
			Class541.method6331(1200698421);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "lp.cl(" + ')');
		}
	}
}
