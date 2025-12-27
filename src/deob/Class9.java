package deob;

import java.util.Random;

public class Class9 {

	public static int anInt147 = 48;

	public static boolean aBoolean150 = false;

	public static boolean aBoolean139 = false;

	public static int anInt138 = -1;

	public static int anInt142 = 0;

	public static int[] anIntArray148 = new int[1006];

	public static int[] anIntArray143 = new int[1003];

	public static int[] anIntArray144 = new int[1001];

	public static Class471 aClass471_145 = new Class471();

	public static int anInt146 = -1;

	public static int anInt151 = -1;

	public static boolean aBoolean141 = true;

	public static boolean aBoolean149 = false;

	public static int anInt140 = 0;

	public static Class61 aClass61_152;

	public Class9() throws Throwable {
		throw new Error();
	}

	public static final void method421(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1379380608);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class24.method485(var3, var4, arg0, (byte) 87);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aj.kk(" + ')');
		}
	}

	public static final void method422(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class214.method2235(var2, var3, 2122034671) ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aj.age(" + ')');
		}
	}

	public static int method423(Random arg0, int arg1, byte arg2) {
		try {
			if (arg1 <= 0) {
				throw new IllegalArgumentException();
			} else if (Class380.method4393(arg1, 276315040)) {
				return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
			} else {
				int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
				int var4;
				do {
					var4 = arg0.nextInt();
				} while (var4 >= var3);
				if (arg2 == 3) {
				}
				return Class144.method1667(var4, arg1, (byte) 2);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aj.l(" + ')');
		}
	}
}
