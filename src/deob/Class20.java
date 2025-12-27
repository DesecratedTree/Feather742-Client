package deob;

public class Class20 {

	public int modelColorIndex;

	public short aShort250;

	public short aShort246;

	public short aShort247;

	public byte aByte249;

	public byte aByte248;

	public boolean aBoolean245;

	public int anInt251;

	public Class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		this.modelColorIndex = arg0;
		this.aShort250 = (short) arg4;
		this.aShort246 = (short) arg5;
		this.aShort247 = (short) arg6;
		this.aByte249 = (byte) arg7;
		this.aByte248 = (byte) arg8;
		this.aBoolean245 = arg9;
		this.anInt251 = arg10;
	}

	public static Class61 method464(IndexTable arg0, int arg1, int arg2) {
		try {
			Class61 var3 = (Class61) Class248.aClass367_6588.get((long) arg1);
			if (var3 == null) {
				if (Class207.aBoolean1951) {
					var3 = Class361.aClass_ra3793.bw(Class53.method640(arg0, arg1), true);
				} else {
					var3 = Class306.method3052(arg0.method2761(arg1, 2140313693), -410643814);
				}
				Class248.aClass367_6588.put(var3, (long) arg1);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "au.j(" + ')');
		}
	}

	public static int method465(Class330_Sub36_Sub13 arg0, Class524 arg1, byte arg2) {
		try {
			String var3 = Class401.method4715(arg0, -1160642131);
			return arg1.method6248(var3, Class_na.aClass61Array9725, -1708509606);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "au.bt(" + ')');
		}
	}

	public static final int method466(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			int var5 = 65536 - Class257.anIntArray2684[arg2 * 8192 / arg3] >> 1;
			return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "au.h(" + ')');
		}
	}

	public static final void method467(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1289 = arg2.anIntArray4387[--arg2.anInt4376];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "au.jc(" + ')');
		}
	}

	public static final void method468(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1338 = Class288.method2886(var4, arg2, 2081714739);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "au.mj(" + ')');
		}
	}

	public static void method469(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 == 1008) {
				Class230.method2339(Class545.aClass545_6995, arg1, arg2, 535391737);
			} else if (arg0 == 1009) {
				Class230.method2339(Class545.aClass545_7000, arg1, arg2, -1249606309);
			} else if (arg0 == 1010) {
				Class230.method2339(Class545.aClass545_6996, arg1, arg2, -1479277575);
			} else if (arg0 == 1011) {
				Class230.method2339(Class545.aClass545_6997, arg1, arg2, 979838879);
			} else if (arg0 == 1012) {
				Class230.method2339(Class545.aClass545_7013, arg1, arg2, 533945711);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "au.cm(" + ')');
		}
	}

	public static final void method470(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class426 var4;
			if (arg0.aBoolean4398) {
				var4 = arg0.aClass426_4384;
			} else {
				var4 = arg0.aClass426_4370;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 != -1 && var4.method5316(var2, var3, (byte) -88) ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "au.bd(" + ')');
		}
	}
}
