package deob;

public class Class92_Sub2_Sub1 extends Class92_Sub2 {

	public static int[] anIntArray9420 = new int[6];

	public static int[][] anIntArrayArray9412 = new int[6][];

	public Class_ra_Sub1 aClass_ra_Sub1_9419;

	public int anInt9418;

	public int anInt9417;

	public int anInt9415;

	public int anInt9421;

	public int anInt9414;

	public int anInt9416;

	public Class36_Sub3 aClass36_Sub3_9413;

	public Class36_Sub3 method1082() {
		if (this.aClass36_Sub3_9413 == null) {
			Interface_ma var1 = this.aClass_ra_Sub1_9419.anInterface_ma4227;
			anIntArray9420[0] = this.anInt9414;
			anIntArray9420[1] = this.anInt9416;
			anIntArray9420[2] = this.anInt9418;
			anIntArray9420[3] = this.anInt9417;
			anIntArray9420[4] = this.anInt9415;
			anIntArray9420[5] = this.anInt9421;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9420[var4] < 0) {
					return null;
				}
				var5 = var1.method221(anIntArray9420[var4], -1092727779);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9420[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2135620367)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9412[var4] = var1.method220(anIntArray9420[var4], 1.0F, var3, var3, false, -1803054619);
				if (anIntArrayArray9412[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9420[var4], -288950213);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9412[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9412[var4] = var7;
				}
			}
			this.aClass36_Sub3_9413 = new Class36_Sub3(this.aClass_ra_Sub1_9419, Class72.aClass72_614, Class86.aClass86_714, var3, var2, anIntArrayArray9412);
		}
		return this.aClass36_Sub3_9413;
	}

	public Class36_Sub3 method1079() {
		if (this.aClass36_Sub3_9413 == null) {
			Interface_ma var1 = this.aClass_ra_Sub1_9419.anInterface_ma4227;
			anIntArray9420[0] = this.anInt9414;
			anIntArray9420[1] = this.anInt9416;
			anIntArray9420[2] = this.anInt9418;
			anIntArray9420[3] = this.anInt9417;
			anIntArray9420[4] = this.anInt9415;
			anIntArray9420[5] = this.anInt9421;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9420[var4] < 0) {
					return null;
				}
				var5 = var1.method221(anIntArray9420[var4], 1080113203);
				var6 = var5.anInt532;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9420[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2144900496)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9412[var4] = var1.method220(anIntArray9420[var4], 1.0F, var3, var3, false, -2011151821);
				if (anIntArrayArray9412[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9420[var4], -7680202);
					var6 = var3 / var5.anInt532;
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532; var8++) {
						for (int var9 = 0; var9 < var5.anInt532; var9++) {
							int var10 = var8 + var9 * var5.anInt532;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9412[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9412[var4] = var7;
				}
			}
			this.aClass36_Sub3_9413 = new Class36_Sub3(this.aClass_ra_Sub1_9419, Class72.aClass72_614, Class86.aClass86_714, var3, var2, anIntArrayArray9412);
		}
		return this.aClass36_Sub3_9413;
	}

	public Class36_Sub3 method1078() {
		if (this.aClass36_Sub3_9413 == null) {
			Interface_ma var1 = this.aClass_ra_Sub1_9419.anInterface_ma4227;
			anIntArray9420[0] = this.anInt9414;
			anIntArray9420[1] = this.anInt9416;
			anIntArray9420[2] = this.anInt9418;
			anIntArray9420[3] = this.anInt9417;
			anIntArray9420[4] = this.anInt9415;
			anIntArray9420[5] = this.anInt9421;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9420[var4] < 0) {
					return null;
				}
				var5 = var1.method221(anIntArray9420[var4], -1947721503);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9420[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2136362243)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9412[var4] = var1.method220(anIntArray9420[var4], 1.0F, var3, var3, false, -1886563163);
				if (anIntArrayArray9412[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9420[var4], -991269268);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9412[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9412[var4] = var7;
				}
			}
			this.aClass36_Sub3_9413 = new Class36_Sub3(this.aClass_ra_Sub1_9419, Class72.aClass72_614, Class86.aClass86_714, var3, var2, anIntArrayArray9412);
		}
		return this.aClass36_Sub3_9413;
	}

	public Class36_Sub3 method1080() {
		if (this.aClass36_Sub3_9413 == null) {
			Interface_ma var1 = this.aClass_ra_Sub1_9419.anInterface_ma4227;
			anIntArray9420[0] = this.anInt9414;
			anIntArray9420[1] = this.anInt9416;
			anIntArray9420[2] = this.anInt9418;
			anIntArray9420[3] = this.anInt9417;
			anIntArray9420[4] = this.anInt9415;
			anIntArray9420[5] = this.anInt9421;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9420[var4] < 0) {
					return null;
				}
				var5 = var1.method221(anIntArray9420[var4], -282498682);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9420[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2147368216)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9412[var4] = var1.method220(anIntArray9420[var4], 1.0F, var3, var3, false, -2137060022);
				if (anIntArrayArray9412[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9420[var4], -947161474);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9412[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9412[var4] = var7;
				}
			}
			this.aClass36_Sub3_9413 = new Class36_Sub3(this.aClass_ra_Sub1_9419, Class72.aClass72_614, Class86.aClass86_714, var3, var2, anIntArrayArray9412);
		}
		return this.aClass36_Sub3_9413;
	}

	public Class36_Sub3 method1081() {
		if (this.aClass36_Sub3_9413 == null) {
			Interface_ma var1 = this.aClass_ra_Sub1_9419.anInterface_ma4227;
			anIntArray9420[0] = this.anInt9414;
			anIntArray9420[1] = this.anInt9416;
			anIntArray9420[2] = this.anInt9418;
			anIntArray9420[3] = this.anInt9417;
			anIntArray9420[4] = this.anInt9415;
			anIntArray9420[5] = this.anInt9421;
			boolean var2 = false;
			int var3 = 0;
			int var4;
			Class56 var5;
			int var6;
			for (var4 = 0; var4 < 6; var4++) {
				if (anIntArray9420[var4] < 0) {
					return null;
				}
				var5 = var1.method221(anIntArray9420[var4], 1959699036);
				var6 = var5.anInt532 * -1086060503 * -1963453415;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method237(anIntArray9420[var4], Class377.aClass377_3934, 1.0F, var3, var3, false, 2141025068)) {
					return null;
				}
				if (var5.aByte538 > 0) {
					var2 = true;
				}
			}
			for (var4 = 0; var4 < 6; var4++) {
				anIntArrayArray9412[var4] = var1.method220(anIntArray9420[var4], 1.0F, var3, var3, false, -1610916084);
				if (anIntArrayArray9412[var4].length != var3 * var3) {
					var5 = var1.method221(anIntArray9420[var4], 994199923);
					var6 = var3 / (var5.anInt532 * -1086060503 * -1963453415);
					int[] var7 = new int[var3 * var3];
					for (int var8 = 0; var8 < var5.anInt532 * -1086060503 * -1963453415; var8++) {
						for (int var9 = 0; var9 < var5.anInt532 * -1086060503 * -1963453415; var9++) {
							int var10 = var8 + var9 * var5.anInt532 * -1086060503 * -1963453415;
							int var11 = var6 * (var8 + var9 * var3);
							for (int var12 = 0; var12 < var6; var12++) {
								for (int var13 = 0; var13 < var6; var13++) {
									var7[var11 + var12 + var13 * var6] = anIntArrayArray9412[var4][var10];
								}
							}
						}
					}
					anIntArrayArray9412[var4] = var7;
				}
			}
			this.aClass36_Sub3_9413 = new Class36_Sub3(this.aClass_ra_Sub1_9419, Class72.aClass72_614, Class86.aClass86_714, var3, var2, anIntArrayArray9412);
		}
		return this.aClass36_Sub3_9413;
	}

	public Class92_Sub2_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.aClass_ra_Sub1_9419 = arg0;
		this.anInt9418 = arg3;
		this.anInt9417 = arg4;
		this.anInt9415 = arg5;
		this.anInt9421 = arg6;
		this.anInt9414 = arg1;
		this.anInt9416 = arg2;
	}
}
