package deob;

public abstract class Class315 {

	public static Class396[] aClass396Array3257;

	public final int method3135(long arg0) {
		try {
			long var3 = this.method3125((byte) 1);
			if (var3 > 0L) {
				Class464_Sub21.method5813(var3);
			}
			return this.method3126(arg0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nc.j(" + ')');
		}
	}

	public static final void method3136(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class128.method1554(var3, var4, arg0, 2001768343);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nc.js(" + ')');
		}
	}

	public static final void method3137(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 | var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nc.zq(" + ')');
		}
	}

	public static final void method3138(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var4)) * 2.0D);
			float var6 = (float) (Math.atan((double) ((float) var3 / 2.0F / (float) var4)) * 2.0D);
			Class401_Sub1.aClass145_Sub1_8249.method1690(var5, var6, -1943771105);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "nc.ahe(" + ')');
		}
	}

	public static void method3139(IComponentDefinitions arg0, Class_ta arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, Class263 arg8, Class524 arg9, int arg10, int arg11) {
		try {
			int var12;
			if (Class147.anInt1621 == 5) {
				var12 = (int) client.aFloat9141 & 0x3FFF;
			} else {
				var12 = (int) client.aFloat9141 + client.anInt9149 & 0x3FFF;
			}
			int var13 = Math.max(arg0.anInt1210 / 2, arg0.anInt1348 / 2) + 10;
			int var14 = arg4 * arg4 + arg5 * arg5;
			if (var14 <= var13 * var13) {
				int var15 = Class257.anIntArray2683[var12];
				int var16 = Class257.anIntArray2684[var12];
				if (Class147.anInt1621 != 5) {
					var15 = var15 * 256 / (client.anInt9063 + 256);
					var16 = var16 * 256 / (client.anInt9063 + 256);
				}
				int var17 = var16 * arg4 + var15 * arg5 >> 14;
				int var18 = var16 * arg5 - arg4 * var15 >> 14;
				int var19 = arg9.method6246(arg7, 100, null, (byte) 63);
				int var20 = arg9.method6247(arg7, 100, 0, null, 992044790);
				int var22 = var17 - var19 / 2;
				if (var22 >= -arg0.anInt1210 && var22 <= arg0.anInt1210 && var18 >= -arg0.anInt1348 && var18 <= arg0.anInt1348) {
					arg8.method2613(arg7, arg0.anInt1210 / 2 + arg2 + var22, arg3 + arg0.anInt1348 / 2 - var18 - arg6 - var20, var19, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3, (byte) 7);
				}
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "nc.g(" + ')');
		}
	}

	public static Class201 method3140(Buffer arg0, byte arg1) {
		try {
			Class195 var2 = Class457.method5665(-1882618819)[arg0.readUnsignedByte(1574690307)];
			Class211 var3 = Class7.method412((byte) -11)[arg0.readUnsignedByte(-313066287)];
			int var4 = arg0.readShort(-1100583751);
			int var5 = arg0.readShort(-1100583751);
			int var6 = arg0.readUnsignedShort(1726962080);
			int var7 = arg0.readUnsignedShort(-47446329);
			int var8 = arg0.readShort(-1100583751);
			int var9 = arg0.readBigSmart(-1494086047);
			int var10 = arg0.readInt((byte) 13);
			return new Class201(var2, var3, var4, var5, var6, var7, var8, var9, var10);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "nc.r(" + ')');
		}
	}

	public abstract void method3122();

	public abstract long method3123();

	public abstract void method3124(byte arg0);

	public abstract long method3125(byte arg0);

	public abstract int method3126(long arg0);

	public abstract void method3127();

	public abstract void method3128();

	public abstract void method3129();

	public abstract long method3130();

	public abstract long method3131();

	public abstract int method3132(long arg0);

	public abstract long method3133();

	public abstract long method3134(int arg0);
}
