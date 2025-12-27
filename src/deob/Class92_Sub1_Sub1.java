package deob;

public class Class92_Sub1_Sub1 extends Class92_Sub1 {

	public static int[] anIntArray9405 = new int[6];

	public static int[][] anIntArrayArray9411 = new int[6][];

	public Class_ra_Sub2 aClass_ra_Sub2_9410;

	public int anInt9402;

	public int anInt9406;

	public int anInt9408;

	public int anInt9409;

	public int anInt9404;

	public int anInt9407;

	public Interface11_Impl1 anInterface11_Impl1_9403;

	public Interface11_Impl1 method1074() {
		if (this.anInterface11_Impl1_9403 == null) {
			Interface_ma var1 = this.aClass_ra_Sub2_9410.anInterface_ma4227;
			anIntArray9405[0] = this.anInt9404;
			anIntArray9405[1] = this.anInt9407;
			anIntArray9405[2] = this.anInt9402;
			anIntArray9405[3] = this.anInt9406;
			anIntArray9405[4] = this.anInt9408;
			anIntArray9405[5] = this.anInt9409;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9405[var4] == -1) {
					return null;
				}
				var5 = var1.method221(anIntArray9405[var4], 1190575891);
				var6 = var5.anInt532;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9405[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2147085590)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9411[var4] = var1.method220(anIntArray9405[var4], 1.0F, var3, var3, false, -1894102536);
				if (anIntArrayArray9411[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9405[var4], -689657793);
					var6 = var3 / var5.anInt532;
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532; var8++) {
						for (int var9 = 0; var9 < var5.anInt532; var9++) {
							int var10 = var8 + var9 * var5.anInt532;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9411[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9411[var4] = var7;
				}
			}
			this.anInterface11_Impl1_9403 = this.aClass_ra_Sub2_9410.method4951(var3, var2, anIntArrayArray9411);
		}
		return this.anInterface11_Impl1_9403;
	}

	public Interface11_Impl1 method1076() {
		if (this.anInterface11_Impl1_9403 == null) {
			Interface_ma var1 = this.aClass_ra_Sub2_9410.anInterface_ma4227;
			anIntArray9405[0] = this.anInt9404;
			anIntArray9405[1] = this.anInt9407;
			anIntArray9405[2] = this.anInt9402;
			anIntArray9405[3] = this.anInt9406;
			anIntArray9405[4] = this.anInt9408;
			anIntArray9405[5] = this.anInt9409;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9405[var4] == -1) {
					return null;
				}
				var5 = var1.method221(anIntArray9405[var4], 71234552);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9405[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2147213867)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9411[var4] = var1.method220(anIntArray9405[var4], 1.0F, var3, var3, false, -1911735993);
				if (anIntArrayArray9411[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9405[var4], 1321744831);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9411[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9411[var4] = var7;
				}
			}
			this.anInterface11_Impl1_9403 = this.aClass_ra_Sub2_9410.method4951(var3, var2, anIntArrayArray9411);
		}
		return this.anInterface11_Impl1_9403;
	}

	public Interface11_Impl1 method1075() {
		if (this.anInterface11_Impl1_9403 == null) {
			Interface_ma var1 = this.aClass_ra_Sub2_9410.anInterface_ma4227;
			anIntArray9405[0] = this.anInt9404;
			anIntArray9405[1] = this.anInt9407;
			anIntArray9405[2] = this.anInt9402;
			anIntArray9405[3] = this.anInt9406;
			anIntArray9405[4] = this.anInt9408;
			anIntArray9405[5] = this.anInt9409;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9405[var4] == -1) {
					return null;
				}
				var5 = var1.method221(anIntArray9405[var4], -1531546835);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9405[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2145144388)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9411[var4] = var1.method220(anIntArray9405[var4], 1.0F, var3, var3, false, -2065174361);
				if (anIntArrayArray9411[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9405[var4], 1208992243);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9411[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9411[var4] = var7;
				}
			}
			this.anInterface11_Impl1_9403 = this.aClass_ra_Sub2_9410.method4951(var3, var2, anIntArrayArray9411);
		}
		return this.anInterface11_Impl1_9403;
	}

	public Interface11_Impl1 method1077() {
		if (this.anInterface11_Impl1_9403 == null) {
			Interface_ma var1 = this.aClass_ra_Sub2_9410.anInterface_ma4227;
			anIntArray9405[0] = this.anInt9404;
			anIntArray9405[1] = this.anInt9407;
			anIntArray9405[2] = this.anInt9402;
			anIntArray9405[3] = this.anInt9406;
			anIntArray9405[4] = this.anInt9408;
			anIntArray9405[5] = this.anInt9409;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9405[var4] == -1) {
					return null;
				}
				var5 = var1.method221(anIntArray9405[var4], -1071204092);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9405[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2145093420)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9411[var4] = var1.method220(anIntArray9405[var4], 1.0F, var3, var3, false, -2063001588);
				if (anIntArrayArray9411[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9405[var4], 1969649761);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9411[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9411[var4] = var7;
				}
			}
			this.anInterface11_Impl1_9403 = this.aClass_ra_Sub2_9410.method4951(var3, var2, anIntArrayArray9411);
		}
		return this.anInterface11_Impl1_9403;
	}

	public Class92_Sub1_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.aClass_ra_Sub2_9410 = arg0;
		this.anInt9402 = arg3;
		this.anInt9406 = arg4;
		this.anInt9408 = arg5;
		this.anInt9409 = arg6;
		this.anInt9404 = arg1;
		this.anInt9407 = arg2;
	}
}
