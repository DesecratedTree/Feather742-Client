package deob;

import java.util.Random;

public abstract class Class223 {

	public static int anInt2352 = 4096;

	public static int anInt2354 = 4095;

	public static int anInt2357 = 12;

	public static int[] anIntArray2362 = new int[4096];

	public short[] aShortArray2356 = new short[512];

	public int anInt2353 = 0;

	public int anInt2358 = 4;

	public int anInt2359 = 4;

	public int anInt2360 = 4;

	public int anInt2361 = 4;

	public short[] aShortArray2355;

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			anIntArray2362[var0] = method2278(var0);
		}
	}

	public Class223(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.anInt2353 = arg0;
		this.anInt2358 = arg2;
		this.anInt2359 = arg3;
		this.anInt2360 = arg4;
		this.anInt2361 = arg1;
		this.method2274();
		this.method2280();
	}

	public void method2274() {
		this.aShortArray2355 = new short[this.anInt2361];
		for (int var1 = 0; var1 < this.anInt2361; var1++) {
			this.aShortArray2355[var1] = (short) Math.pow(2.0D, (double) var1);
		}
	}

	public static int method2277(int arg0, int arg1, int arg2, int arg3) {
		int var4 = arg0 & 0xF;
		int var5 = var4 < 8 ? arg1 : arg2;
		int var6 = var4 < 4 ? arg2 : var4 == 12 || var4 == 14 ? arg1 : arg3;
		return ((var4 & 0x1) == 0 ? var5 : -var5) + ((var4 & 0x2) == 0 ? var6 : -var6);
	}

	public static final int method2278(int arg0) {
		int var1 = arg0 * (arg0 * arg0 >> 12) >> 12;
		int var2 = arg0 * 6 - 61440;
		int var3 = (var2 * arg0 >> 12) + 40960;
		return var3 * var1 >> 12;
	}

	public void method2279(int arg0, int arg1, int arg2) {
		int[] var4 = new int[arg0];
		int[] var5 = new int[arg1];
		int[] var6 = new int[arg2];
		int var7;
		for (var7 = 0; var7 < arg0; var7++) {
			var4[var7] = (var7 << 12) / arg0;
		}
		for (var7 = 0; var7 < arg1; var7++) {
			var5[var7] = (var7 << 12) / arg1;
		}
		for (var7 = 0; var7 < arg2; var7++) {
			var6[var7] = (var7 << 12) / arg2;
		}
		this.method2275();
		for (var7 = 0; var7 < arg2; var7++) {
			for (int var8 = 0; var8 < arg1; var8++) {
				for (int var9 = 0; var9 < arg0; var9++) {
					for (int var10 = 0; var10 < this.anInt2361; var10++) {
						int var11 = this.aShortArray2355[var10] << 12;
						int var12 = this.anInt2358 * var11 >> 12;
						int var13 = this.anInt2359 * var11 >> 12;
						int var14 = this.anInt2360 * var11 >> 12;
						int var15 = var4[var9] * var11 >> 12;
						int var16 = var5[var8] * var11 >> 12;
						int var17 = var6[var7] * var11 >> 12;
						int var42 = var15 * this.anInt2358;
						int var43 = var16 * this.anInt2359;
						int var44 = var17 * this.anInt2360;
						int var18 = var42 >> 12;
						int var19 = var18 + 1;
						int var45 = var18 & 0xFF;
						int var20 = var43 >> 12;
						int var21 = var20 + 1;
						int var46 = var20 & 0xFF;
						int var22 = var44 >> 12;
						int var23 = var22 + 1;
						int var47 = var22 & 0xFF;
						if (var19 >= var12) {
							var19 = 0;
						} else {
							var19 &= 0xFF;
						}
						if (var21 >= var13) {
							var21 = 0;
						} else {
							var21 &= 0xFF;
						}
						if (var23 >= var14) {
							var23 = 0;
						} else {
							var23 &= 0xFF;
						}
						var15 = var42 & 0xFFF;
						var16 = var43 & 0xFFF;
						var17 = var44 & 0xFFF;
						int var24 = anIntArray2362[var15];
						int var25 = anIntArray2362[var16];
						int var26 = anIntArray2362[var17];
						int var27 = var15 - 4096;
						int var28 = var16 - 4096;
						int var29 = var17 - 4096;
						short var30 = this.aShortArray2356[var47];
						short var31 = this.aShortArray2356[var23];
						short var32 = this.aShortArray2356[var46 + var30];
						short var33 = this.aShortArray2356[var21 + var30];
						short var34 = this.aShortArray2356[var46 + var31];
						short var35 = this.aShortArray2356[var21 + var31];
						int var36 = method2277(this.aShortArray2356[var45 + var32], var15, var16, var17);
						int var37 = method2277(this.aShortArray2356[var19 + var32], var27, var16, var17);
						int var38 = var36 + (var24 * (var37 - var36) >> 12);
						int var48 = method2277(this.aShortArray2356[var45 + var33], var15, var28, var17);
						int var51 = method2277(this.aShortArray2356[var19 + var33], var27, var28, var17);
						int var39 = var48 + (var24 * (var51 - var48) >> 12);
						int var40 = var38 + (var25 * (var39 - var38) >> 12);
						int var49 = method2277(this.aShortArray2356[var45 + var34], var15, var16, var29);
						int var52 = method2277(this.aShortArray2356[var19 + var34], var27, var16, var29);
						int var54 = var49 + (var24 * (var52 - var49) >> 12);
						int var50 = method2277(this.aShortArray2356[var45 + var35], var15, var28, var29);
						int var53 = method2277(this.aShortArray2356[var19 + var35], var27, var28, var29);
						int var55 = var50 + (var24 * (var53 - var50) >> 12);
						int var41 = var54 + (var25 * (var55 - var54) >> 12);
						this.method2276(var10, var40 + (var26 * (var41 - var40) >> 12));
					}
					this.method2288();
				}
			}
		}
	}

	public void method2280() {
		Random var1 = new Random((long) this.anInt2353);
		int var2;
		for (var2 = 0; var2 < 255; var2++) {
			this.aShortArray2356[var2] = (short) var2;
		}
		for (var2 = 0; var2 < 255; var2++) {
			int var3 = 255 - var2;
			int var4 = Class9.method423(var1, var3, (byte) 30);
			short var5 = this.aShortArray2356[var4];
			this.aShortArray2356[var4] = this.aShortArray2356[var3];
			this.aShortArray2356[var3] = this.aShortArray2356[var3 + 256] = var5;
		}
	}

	public abstract void method2275();

	public abstract void method2276(int arg0, int arg1);

	public abstract void method2281();

	public abstract void method2282(int arg0, int arg1);

	public abstract void method2283();

	public abstract void method2284();

	public abstract void method2285();

	public abstract void method2286();

	public abstract void method2287(int arg0, int arg1);

	public abstract void method2288();
}
