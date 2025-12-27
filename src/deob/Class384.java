package deob;

public class Class384 {

	public static Class384 aClass384_3968 = new Class384(0);

	public static Class384 aClass384_3965 = new Class384(1);

	public static Class384 aClass384_3967 = new Class384(2);

	public int anInt3966;

	public static Class524 aClass524_3969;

	public Class384(int arg0) {
		this.anInt3966 = arg0;
	}

	public static void method4415(long[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < arg3) {
				int var5 = (arg2 + arg3) / 2;
				int var6 = arg2;
				long var7 = arg0[var5];
				arg0[var5] = arg0[arg3];
				arg0[arg3] = var7;
				int var9 = arg1[var5];
				arg1[var5] = arg1[arg3];
				arg1[arg3] = var9;
				int var10 = Long.MAX_VALUE == var7 ? 0 : 1;
				for (int var11 = arg2; var11 < arg3; var11++) {
					if (arg0[var11] < (long) (var11 & var10) + var7) {
						long var12 = arg0[var11];
						arg0[var11] = arg0[var6];
						arg0[var6] = var12;
						int var14 = arg1[var11];
						arg1[var11] = arg1[var6];
						arg1[var6++] = var14;
					}
				}
				arg0[arg3] = arg0[var6];
				arg0[var6] = var7;
				arg1[arg3] = arg1[var6];
				arg1[var6] = var9;
				method4415(arg0, arg1, arg2, var6 - 1, -1638247890);
				method4415(arg0, arg1, var6 + 1, arg3, -1312530787);
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "py.f(" + ')');
		}
	}

	public static final void method4416(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1245;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "py.pl(" + ')');
		}
	}

	public static final void method4417(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class370.aClass268_6770.method2659(var2, 978025596).aCharArray9687[var3];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "py.ada(" + ')');
		}
	}

	public static final void method4418(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			Class18.method452(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], 366372738);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "py.ts(" + ')');
		}
	}

	public static final void method4419(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class412.method5235(var3, var4, arg0, 1521261276);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "py.eo(" + ')');
		}
	}

	public static final void method4420(Class430 arg0, int arg1) {
		try {
			Class283.method2828(-929934114);
			client.aClass304_9030.method3032(-1160699564);
			Class435.method5568(1181451085);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "py.aoj(" + ')');
		}
	}

	public static boolean method4421(byte arg0) {
		try {
			return Class544.anInterface33_6256 != null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "py.i(" + ')');
		}
	}

	public static final void method4422(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1236 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1947729414);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "py.fl(" + ')');
		}
	}
}
