package deob;

import java.util.LinkedList;
import java.util.Queue;

public class Class393 {

	public static long aLong4065 = -1L;

	public static int anInt4068 = 0;

	public static boolean aBoolean4066 = true;

	public static Class397_Sub1 aClass397_Sub1_4067 = new Class397_Sub1();

	public static Class397_Sub2 aClass397_Sub2_4069 = new Class397_Sub2();

	public static Queue aQueue4064 = new LinkedList();

	public Class393() throws Throwable {
		throw new Error();
	}

	public static void method4615(int arg0) {
		try {
			if (Console.anIntArray4263 == null) {
				Console.anIntArray4263 = new int[65536];
				double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
				int var3 = 0;
				for (int var4 = 0; var4 < 512; var4++) {
					float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
					float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
					for (int var7 = 0; var7 < 128; var7++) {
						float var8 = (float) var7 / 128.0F;
						float var9 = 0.0F;
						float var10 = 0.0F;
						float var11 = 0.0F;
						float var12 = var5 / 60.0F;
						int var13 = (int) var12;
						int var14 = var13 % 6;
						float var15 = var12 - (float) var13;
						float var16 = var8 * (1.0F - var6);
						float var17 = (1.0F - var6 * var15) * var8;
						float var18 = var8 * (1.0F - (1.0F - var15) * var6);
						if (var14 == 0) {
							var9 = var8;
							var10 = var18;
							var11 = var16;
						} else if (var14 == 1) {
							var9 = var17;
							var10 = var8;
							var11 = var16;
						} else if (var14 == 2) {
							var9 = var16;
							var10 = var8;
							var11 = var18;
						} else if (var14 == 3) {
							var9 = var16;
							var10 = var17;
							var11 = var8;
						} else if (var14 == 4) {
							var9 = var18;
							var10 = var16;
							var11 = var8;
						} else if (var14 == 5) {
							var9 = var8;
							var10 = var16;
							var11 = var17;
						}
						var9 = (float) Math.pow((double) var9, var1);
						var10 = (float) Math.pow((double) var10, var1);
						var11 = (float) Math.pow((double) var11, var1);
						int var19 = (int) (var9 * 256.0F);
						int var20 = (int) (var10 * 256.0F);
						int var21 = (int) (var11 * 256.0F);
						int var22 = (var19 << 16) + -16777216 + (var20 << 8) + var21;
						Console.anIntArray4263[var3++] = var22;
					}
				}
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "qg.i(" + ')');
		}
	}

	public static final void method4616(Class330_Sub36_Sub10 arg0, Class430 arg1, int arg2) {
		try {
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = Class51.method633(arg0, 1619014583);
			arg1.anObjectArray4386[++arg1.anInt4378 - 1] = Class477_Sub2.method6000(arg0, -548389464);
			arg1.anObjectArray4386[++arg1.anInt4378 - 1] = Class_ta.method5679(arg0, (short) 15152);
			arg1.anObjectArray4386[++arg1.anInt4378 - 1] = Class535.method6310(arg0, 1234456048);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qg.d(" + ')');
		}
	}

	public static final void method4617(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(10, var2 << 16 | var3, var4, "", (byte) 25);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qg.anj(" + ')');
		}
	}

	public static final void method4618(Class430 arg0, int arg1) {
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
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4.method5315(arg0.aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067, var2, var3, (byte) 22) ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qg.aqo(" + ')');
		}
	}

	public static final void method4619(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class401_Sub1.aClass145_Sub1_8249.method1696(Class96.method1180(var2, 83075234), true, (byte) -119);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qg.ahu(" + ')');
		}
	}
}
