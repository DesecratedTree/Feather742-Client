package deob;

public class Class316 {

	public static byte aByte3260 = 3;

	public static byte aByte3263 = 2;

	public static byte aByte3267 = 1;

	public int anInt3261 = -1;

	public int anInt3273 = -1;

	public byte aByte3266;

	public int anInt3262;

	public int anInt3258;

	public int anInt3264;

	public int anInt3272;

	public int anInt3265;

	public int anInt3259;

	public Class302 aClass302_3268;

	public Class330_Sub29_Sub1_Sub1 aClass330_Sub29_Sub1_Sub1_3270;

	public Class330_Sub40_Sub3 aClass330_Sub40_Sub3_3271;

	public Class330_Sub41 aClass330_Sub41_3269;

	public Class316(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Class432_Sub1 arg7) {
		this.aByte3266 = arg0;
		this.anInt3262 = arg1;
		this.anInt3258 = arg2;
		this.anInt3264 = arg3;
		this.anInt3272 = arg4;
		this.anInt3265 = arg5;
		this.anInt3259 = arg6;
		if (arg7 != null && arg7 instanceof Class432_Sub1_Sub1) {
			Class432_Sub1_Sub1 var9 = (Class432_Sub1_Sub1) arg7;
			this.anInt3261 = var9.aShort9922;
			this.anInt3273 = var9.aShort9921;
		}
	}

	public boolean method3145(int arg0) {
		try {
			return this.aByte3266 == 2 || this.aByte3266 == 3;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nd.r(" + ')');
		}
	}

	public static final void method3146(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass99Array9259[var2].anInt913;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nd.wh(" + ')');
		}
	}

	public static final void method3147(byte arg0) {
		try {
			Class428.anInt4360--;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nd.j(" + ')');
		}
	}
}
