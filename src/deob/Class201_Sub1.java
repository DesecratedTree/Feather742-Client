package deob;

public class Class201_Sub1 extends Class201 {

	public int anInt8936;

	public int anInt8935;

	public Class198 method161() {
		return Class198.aClass198_1922;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1922;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "abg.j(" + ')');
		}
	}

	public Class198 method160() {
		return Class198.aClass198_1922;
	}

	public Class201_Sub1(Class195 arg0, Class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8936 = arg10;
		this.anInt8935 = arg11;
	}

	public static void method2166(int arg0) {
	}

	public static final void method2167(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 798051424);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class154.method1818(var3, var4, arg0, (byte) 6);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "abg.mv(" + ')');
		}
	}

	public static final void method2168(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			if (var3.anInt1335 == -1) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1336;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "abg.qq(" + ')');
		}
	}

	public static void method2169(IComponentDefinitions arg0, Class122 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
		try {
			int var9 = arg4 * arg4 + arg5 * arg5;
			if ((long) var9 <= arg7) {
				int var10;
				if (Class147.anInt1621 == 5) {
					var10 = (int) client.aFloat9141 & 0x3FFF;
				} else {
					var10 = client.anInt9149 + (int) client.aFloat9141 & 0x3FFF;
				}
				int var11 = Class257.anIntArray2683[var10];
				int var12 = Class257.anIntArray2684[var10];
				if (Class147.anInt1621 != 5) {
					var11 = var11 * 256 / (client.anInt9063 + 256);
					var12 = var12 * 256 / (client.anInt9063 + 256);
				}
				int var13 = var11 * arg5 + arg4 * var12 >> 14;
				int var14 = arg5 * var12 - var11 * arg4 >> 14;
				Class61 var15 = Class12.aClass61Array10077[arg6];
				int var16 = var15.method681();
				int var17 = var15.method682();
				int var18 = var13 + arg0.anInt1210 / 2 - var16 / 2;
				int var19 = var16 + var18;
				int var20 = -var14 + arg0.anInt1348 / 2 - var17;
				int var21 = var17 + var20;
				if (arg1.method1450(var18, var20, (byte) 111) && arg1.method1450(var19, var20, (byte) -55) && arg1.method1450(var18, var21, (byte) -22) && arg1.method1450(var19, var21, (byte) 17)) {
					var15.method689(arg2 + var18, var20 + arg3, arg1.aClass_ta1408, arg2, arg3);
				} else {
					double var22 = Math.atan2((double) var13, (double) var14);
					int var24 = Math.min(arg0.anInt1210 / 2, arg0.anInt1348 / 2);
					int var28 = var24 - 6;
					int var25 = (int) (Math.sin(var22) * (double) var28);
					int var26 = (int) (Math.cos(var22) * (double) var28);
					Class231.aClass61Array6766[arg6].method695((float) var25 + (float) arg2 + (float) arg0.anInt1210 / 2.0F, (float) arg0.anInt1348 / 2.0F + (float) arg3 - (float) var26, 4096, (int) (-var22 / 6.283185307179586D * 65535.0D));
				}
			}
		} catch (RuntimeException var27) {
			throw Class476.method5964(var27, "abg.u(" + ')');
		}
	}
}
