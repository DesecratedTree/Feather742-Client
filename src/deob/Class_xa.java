package deob;

public abstract class Class_xa {

	public int anInt6397;

	public int anInt6393;

	public int anInt6395;

	public int anInt6396;

	public int[][] anIntArrayArray6394;

	public final int method6416(int arg0, int arg1, int arg2) {
		try {
			int var4 = arg0 >> this.anInt6396;
			int var5 = arg1 >> this.anInt6396;
			if (var4 < 0 || var5 < 0 || var4 > this.anInt6397 - 1 || var5 > this.anInt6393 - 1) {
				return 0;
			}
			int var6 = arg0 & this.anInt6395 - 1;
			int var7 = arg1 & this.anInt6395 - 1;
			int var8 = this.anIntArrayArray6394[var4][var5] * (this.anInt6395 - var6) + this.anIntArrayArray6394[var4 + 1][var5] * var6 >> this.anInt6396;
			int var9 = (this.anInt6395 - var6) * this.anIntArrayArray6394[var4][var5 + 1] + var6 * this.anIntArrayArray6394[var4 + 1][var5 + 1] >> this.anInt6396;
			return var9 * var7 + var8 * (this.anInt6395 - var7) >> this.anInt6396;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "xa.o(" + ')');
		}
	}

	public final int method6417(int arg0, int arg1, int arg2) {
		try {
			return this.anIntArrayArray6394[arg0][arg1];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "xa.s(" + ')');
		}
	}

	public Class_xa(int arg0, int arg1, int arg2, int[][] arg3) {
		this.anInt6397 = arg0;
		this.anInt6393 = arg1;
		int var5 = 0;
		while (arg2 > 1) {
			var5++;
			arg2 >>= 0x1;
		}
		this.anInt6395 = 0x1 << var5;
		this.anInt6396 = var5;
		this.anIntArrayArray6394 = arg3;
	}

	public static final void method6430(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class1.method386(var3, var4, arg0, 1969204520);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "xa.ek(" + ')');
		}
	}

	public static final void method6431(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 2;
			int var4 = arg2.anIntArray4387[arg2.anInt4376];
			int var5 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			Class537 var6 = Class301.aClass543_3059.method6339(var4, -1788071695);
			if (var5 == var6.anInt6235) {
				arg0.method1400(var4, -2068597246);
			} else {
				arg0.method1399(var4, var5, -1900517257);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "xa.ga(" + ')');
		}
	}

	public static final void method6432(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 != -1) {
				Class95_Sub12_Sub1.method1140(var2, 1432202105);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "xa.apa(" + ')');
		}
	}

	public static final void method6433(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class385.method4426(1148279720).method297((short) -2247);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "xa.ajq(" + ')');
		}
	}

	public static final void method6434(Class430 arg0, int arg1) {
		try {
			if (Class282_Sub1.aShortArray7443 == null || Class432_Sub1_Sub4_Sub2.anInt10001 >= Class440.anInt4482) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class282_Sub1.aShortArray7443[++Class432_Sub1_Sub4_Sub2.anInt10001 - 1] & 0xFFFF;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "xa.abl(" + ')');
		}
	}

	public static final void method6435(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 231822046);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class318.method3161(var3, var4, arg0, 300502301);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "xa.ge(" + ')');
		}
	}

	public abstract void method6411(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14);

	@ObfuscatedName("Class_xa.LA(III)V")
	public abstract void LA(int arg0, int arg1, int arg2);

	public abstract void method6412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

	public abstract void method6413(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14);

	@ObfuscatedName("Class_xa.SA()V")
	public abstract void SA();

	public abstract void method6414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14);

	public abstract void method6415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

	@ObfuscatedName("Class_xa.w(IILClass_na;)LClass_na;")
	public abstract Class_na w(int arg0, int arg1, Class_na arg2);

	@ObfuscatedName("Class_xa.ay(LClass_na;IIIIZ)V")
	public abstract void ay(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.NA(LClass_na;IIIIZ)V")
	public abstract void NA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract boolean method6418(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.al(LClass_na;IIIIZ)V")
	public abstract void al(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.n(III)V")
	public abstract void n(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_xa.l(III)V")
	public abstract void l(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_xa.b(III)V")
	public abstract void b(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class_xa.c()V")
	public abstract void c();

	public abstract void method6419(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11);

	@ObfuscatedName("Class_xa.d()V")
	public abstract void d();

	public abstract void method6420(Class330_Sub14 arg0, int[] arg1);

	public abstract void method6421(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

	public abstract void method6422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11);

	@ObfuscatedName("Class_xa.y(IILClass_na;)LClass_na;")
	public abstract Class_na y(int arg0, int arg1, Class_na arg2);

	@ObfuscatedName("Class_xa.h(IILClass_na;)LClass_na;")
	public abstract Class_na h(int arg0, int arg1, Class_na arg2);

	public abstract void method6423(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

	public abstract boolean method6424(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.as(LClass_na;IIIIZ)V")
	public abstract void as(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.ac(LClass_na;IIIIZ)V")
	public abstract void ac(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract void method6425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11);

	public abstract void method6426(Class330_Sub14 arg0, int[] arg1);

	public abstract void method6427(Class330_Sub14 arg0, int[] arg1);

	public abstract void method6428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

	@ObfuscatedName("Class_xa.ai(LClass_na;IIIIZ)V")
	public abstract void ai(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.UA(LClass_na;IIIIZ)V")
	public abstract void UA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("Class_xa.aj(LClass_na;IIIIZ)V")
	public abstract void aj(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

	public abstract void method6429(Class330_Sub14 arg0, int[] arg1);
}
