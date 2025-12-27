package deob;

public class Class13 {

	public byte aByte173;

	public int anInt169;

	public static Class87 aClass87_174;

	public String aString168;

	public String aString170;

	public String aString171;

	public String aString172;

	public static short aShort175;

	public static final void method438(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class401_Sub1.aClass145_Sub1_8249.method1689(-265730369).anInt1496;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "an.ahp(" + ')');
		}
	}

	public static void method439(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < arg3) {
				int var5 = (arg2 + arg3) / 2;
				int var6 = arg2;
				long var7 = arg0[var5];
				arg0[var5] = arg0[arg3];
				arg0[arg3] = var7;
				Object var9 = arg1[var5];
				arg1[var5] = arg1[arg3];
				arg1[arg3] = var9;
				int var10 = Long.MAX_VALUE == var7 ? 0 : 1;
				for (int var11 = arg2; var11 < arg3; var11++) {
					if (arg0[var11] < var7 + (long) (var11 & var10)) {
						long var12 = arg0[var11];
						arg0[var11] = arg0[var6];
						arg0[var6] = var12;
						Object var14 = arg1[var11];
						arg1[var11] = arg1[var6];
						arg1[var6++] = var14;
					}
				}
				arg0[arg3] = arg0[var6];
				arg0[var6] = var7;
				arg1[arg3] = arg1[var6];
				arg1[var6] = var9;
				method439(arg0, arg1, arg2, var6 - 1, 1930619533);
				method439(arg0, arg1, var6 + 1, arg3, -1110408926);
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "an.l(" + ')');
		}
	}

	public static final void method440(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			int[] var5 = Class278.method2740(var4, arg2, (byte) 0);
			if (var5 != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1312 = Class288.method2886(var4, arg2, 1824237080);
			arg0.anIntArray1313 = var5;
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "an.ou(" + ')');
		}
	}

	public static Class201 method441(Buffer arg0, byte arg1) {
		try {
			Class201 var2 = Class315.method3140(arg0, (byte) 1);
			int var3 = arg0.readInt((byte) 84);
			int var4 = arg0.readInt((byte) 18);
			int var5 = arg0.readBigSmart(-777588283);
			return new Class201_Sub1(var2.aClass195_6507, var2.aClass211_6502, var2.anInt6501, var2.anInt6504, var2.anInt6505, var2.anInt6503, var2.anInt6506, var2.anInt6508, var2.anInt6509, var3, var4, var5);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "an.s(" + ')');
		}
	}
}
