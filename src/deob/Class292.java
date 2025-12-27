package deob;

import java.util.Arrays;
import java.util.Random;

public class Class292 {

	public static int[] anIntArray2985 = new int[32768];

	public static double aDouble3002 = 1.0057929410678534D;

	public static int[] anIntArray3000;

	public static int[] anIntArray2998;

	public static int[] anIntArray2981;

	public static int[] anIntArray3003;

	public static int[] anIntArray2999;

	public static int[] anIntArray3005;

	public static int[] anIntArray3001;

	public int[] anIntArray2989 = new int[] { 0, 0, 0, 0, 0 };

	public int[] anIntArray2990 = new int[] { 0, 0, 0, 0, 0 };

	public int[] anIntArray2991 = new int[] { 0, 0, 0, 0, 0 };

	public int anInt2992 = 0;

	public int anInt2993 = 100;

	public int anInt2996 = 500;

	public int anInt2984 = 0;

	public Class309 aClass309_2982;

	public Class309 aClass309_2983;

	public Class309 aClass309_2986;

	public Class309 aClass309_2987;

	public Class309 aClass309_2988;

	public Class309 aClass309_2995;

	public Class309 aClass309_2997;

	public Class309 aClass309_3004;

	public Class309 aClass309_3006;

	public Class328 aClass328_2994;

	static {
		Random var0 = new Random(0L);
		int var1;
		for (var1 = 0; var1 < 32768; var1++) {
			anIntArray2985[var1] = (var0.nextInt() & 0x2) - 1;
		}
		anIntArray3000 = new int[32768];
		for (var1 = 0; var1 < 32768; var1++) {
			anIntArray3000[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		anIntArray2998 = new int[220500];
		anIntArray2981 = new int[5];
		anIntArray3003 = new int[5];
		anIntArray2999 = new int[5];
		anIntArray3005 = new int[5];
		anIntArray3001 = new int[5];
	}

	public final int[] method2909(int arg0, int arg1) {
		Arrays.fill(anIntArray2998, 0, arg0, 0);
		if (arg1 < 10) {
			return anIntArray2998;
		}
		double var3 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass309_2983.method3096();
		this.aClass309_2982.method3096();
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		if (this.aClass309_2988 != null) {
			this.aClass309_2988.method3096();
			this.aClass309_3004.method3096();
			var5 = (int) ((double) (this.aClass309_2988.anInt3197 - this.aClass309_2988.anInt3198) * 32.768D / var3);
			var6 = (int) ((double) this.aClass309_2988.anInt3198 * 32.768D / var3);
		}
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (this.aClass309_2997 != null) {
			this.aClass309_2997.method3096();
			this.aClass309_2986.method3096();
			var8 = (int) ((double) (this.aClass309_2997.anInt3197 - this.aClass309_2997.anInt3198) * 32.768D / var3);
			var9 = (int) ((double) this.aClass309_2997.anInt3198 * 32.768D / var3);
		}
		int var11;
		for (var11 = 0; var11 < 5; var11++) {
			if (this.anIntArray2989[var11] != 0) {
				anIntArray2981[var11] = 0;
				anIntArray3003[var11] = (int) ((double) this.anIntArray2991[var11] * var3);
				anIntArray2999[var11] = (this.anIntArray2989[var11] << 14) / 100;
				anIntArray3005[var11] = (int) ((double) (this.aClass309_2983.anInt3197 - this.aClass309_2983.anInt3198) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray2990[var11]) / var3);
				anIntArray3001[var11] = (int) ((double) this.aClass309_2983.anInt3198 * 32.768D / var3);
			}
		}
		int var12;
		int var13;
		int var14;
		int var15;
		for (var11 = 0; var11 < arg0; var11++) {
			var12 = this.aClass309_2983.method3095(arg0);
			var13 = this.aClass309_2982.method3095(arg0);
			if (this.aClass309_2988 != null) {
				var14 = this.aClass309_2988.method3095(arg0);
				var15 = this.aClass309_3004.method3095(arg0);
				var12 += this.method2910(var7, var15, this.aClass309_2988.anInt3196) >> 1;
				var7 += (var14 * var5 >> 16) + var6;
			}
			if (this.aClass309_2997 != null) {
				var14 = this.aClass309_2997.method3095(arg0);
				var15 = this.aClass309_2986.method3095(arg0);
				var13 = var13 * ((this.method2910(var10, var15, this.aClass309_2997.anInt3196) >> 1) + 32768) >> 15;
				var10 += (var14 * var8 >> 16) + var9;
			}
			for (var14 = 0; var14 < 5; var14++) {
				if (this.anIntArray2989[var14] != 0) {
					var15 = var11 + anIntArray3003[var14];
					if (var15 < arg0) {
						anIntArray2998[var15] += this.method2910(anIntArray2981[var14], var13 * anIntArray2999[var14] >> 15, this.aClass309_2983.anInt3196);
						anIntArray2981[var14] += (var12 * anIntArray3005[var14] >> 16) + anIntArray3001[var14];
					}
				}
			}
		}
		int var16;
		int var17;
		if (this.aClass309_2987 != null) {
			this.aClass309_2987.method3096();
			this.aClass309_3006.method3096();
			var11 = 0;
			boolean var18 = false;
			boolean var19 = true;
			for (var14 = 0; var14 < arg0; var14++) {
				var15 = this.aClass309_2987.method3095(arg0);
				var16 = this.aClass309_3006.method3095(arg0);
				if (var19) {
					var17 = this.aClass309_2987.anInt3198 + ((this.aClass309_2987.anInt3197 - this.aClass309_2987.anInt3198) * var15 >> 8);
				} else {
					var17 = this.aClass309_2987.anInt3198 + ((this.aClass309_2987.anInt3197 - this.aClass309_2987.anInt3198) * var16 >> 8);
				}
				var11 += 256;
				if (var11 >= var17) {
					var11 = 0;
					var19 = !var19;
				}
				if (var19) {
					anIntArray2998[var14] = 0;
				}
			}
		}
		if (this.anInt2992 > 0 && this.anInt2993 > 0) {
			var11 = (int) ((double) this.anInt2992 * var3);
			for (var12 = var11; var12 < arg0; var12++) {
				anIntArray2998[var12] += anIntArray2998[var12 - var11] * this.anInt2993 / 100;
			}
		}
		if (this.aClass328_2994.anIntArray3328[0] > 0 || this.aClass328_2994.anIntArray3328[1] > 0) {
			this.aClass309_2995.method3096();
			var11 = this.aClass309_2995.method3095(arg0 + 1);
			var12 = this.aClass328_2994.method3245(0, (float) var11 / 65536.0F);
			var13 = this.aClass328_2994.method3245(1, (float) var11 / 65536.0F);
			if (arg0 >= var12 + var13) {
				var14 = 0;
				var15 = var13;
				if (var13 > arg0 - var12) {
					var15 = arg0 - var12;
				}
				while (var14 < var15) {
					var16 = (int) ((long) anIntArray2998[var14 + var12] * (long) Class328.anInt3336 >> 16);
					for (var17 = 0; var17 < var12; var17++) {
						var16 += (int) ((long) anIntArray2998[var14 + var12 - 1 - var17] * (long) Class328.anIntArrayArray3339[0][var17] >> 16);
					}
					for (var17 = 0; var17 < var14; var17++) {
						var16 -= (int) ((long) anIntArray2998[var14 - 1 - var17] * (long) Class328.anIntArrayArray3339[1][var17] >> 16);
					}
					anIntArray2998[var14] = var16;
					var11 = this.aClass309_2995.method3095(arg0 + 1);
					var14++;
				}
				var15 = 128;
				while (true) {
					if (var15 > arg0 - var12) {
						var15 = arg0 - var12;
					}
					while (var14 < var15) {
						var16 = (int) ((long) anIntArray2998[var14 + var12] * (long) Class328.anInt3336 >> 16);
						for (var17 = 0; var17 < var12; var17++) {
							var16 += (int) ((long) anIntArray2998[var14 + var12 - 1 - var17] * (long) Class328.anIntArrayArray3339[0][var17] >> 16);
						}
						for (var17 = 0; var17 < var13; var17++) {
							var16 -= (int) ((long) anIntArray2998[var14 - 1 - var17] * (long) Class328.anIntArrayArray3339[1][var17] >> 16);
						}
						anIntArray2998[var14] = var16;
						var11 = this.aClass309_2995.method3095(arg0 + 1);
						var14++;
					}
					if (var14 >= arg0 - var12) {
						while (var14 < arg0) {
							var16 = 0;
							for (var17 = var14 + var12 - arg0; var17 < var12; var17++) {
								var16 += (int) ((long) anIntArray2998[var14 + var12 - 1 - var17] * (long) Class328.anIntArrayArray3339[0][var17] >> 16);
							}
							for (var17 = 0; var17 < var13; var17++) {
								var16 -= (int) ((long) anIntArray2998[var14 - 1 - var17] * (long) Class328.anIntArrayArray3339[1][var17] >> 16);
							}
							anIntArray2998[var14] = var16;
							this.aClass309_2995.method3095(arg0 + 1);
							var14++;
						}
						break;
					}
					var12 = this.aClass328_2994.method3245(0, (float) var11 / 65536.0F);
					var13 = this.aClass328_2994.method3245(1, (float) var11 / 65536.0F);
					var15 += 128;
				}
			}
		}
		for (var11 = 0; var11 < arg0; var11++) {
			if (anIntArray2998[var11] < -32768) {
				anIntArray2998[var11] = -32768;
			}
			if (anIntArray2998[var11] > 32767) {
				anIntArray2998[var11] = 32767;
			}
		}
		return anIntArray2998;
	}

	public final int method2910(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray3000[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray2985[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	public final void method2911(Buffer arg0) {
		this.aClass309_2983 = new Class309();
		this.aClass309_2983.method3093(arg0);
		this.aClass309_2982 = new Class309();
		this.aClass309_2982.method3093(arg0);
		int var2 = arg0.readUnsignedByte(242092668);
		if (var2 != 0) {
			arg0.offset--;
			this.aClass309_2988 = new Class309();
			this.aClass309_2988.method3093(arg0);
			this.aClass309_3004 = new Class309();
			this.aClass309_3004.method3093(arg0);
		}
		var2 = arg0.readUnsignedByte(565383669);
		if (var2 != 0) {
			arg0.offset--;
			this.aClass309_2997 = new Class309();
			this.aClass309_2997.method3093(arg0);
			this.aClass309_2986 = new Class309();
			this.aClass309_2986.method3093(arg0);
		}
		var2 = arg0.readUnsignedByte(1791202577);
		if (var2 != 0) {
			arg0.offset--;
			this.aClass309_2987 = new Class309();
			this.aClass309_2987.method3093(arg0);
			this.aClass309_3006 = new Class309();
			this.aClass309_3006.method3093(arg0);
		}
		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = arg0.readSmart(-1554194529);
			if (var4 == 0) {
				break;
			}
			this.anIntArray2989[var3] = var4;
			this.anIntArray2990[var3] = arg0.method3764((byte) -38);
			this.anIntArray2991[var3] = arg0.readSmart(-322243806);
		}
		this.anInt2992 = arg0.readSmart(-1949455388);
		this.anInt2993 = arg0.readSmart(-1410893461);
		this.anInt2996 = arg0.readUnsignedShort(-69470865);
		this.anInt2984 = arg0.readUnsignedShort(1678664623);
		this.aClass328_2994 = new Class328();
		this.aClass309_2995 = new Class309();
		this.aClass328_2994.method3246(arg0, this.aClass309_2995);
	}
}
