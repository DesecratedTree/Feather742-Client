package deob;

public class Class289 {

	public int anInt2959;

	public int anInt2957;

	public int[] anIntArray2962;

	public int[] anIntArray2960;

	public float[][] aFloatArrayArray2961;

	public int[] anIntArray2958;

	public static int method2891(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; Class437.method5585(var2, arg1, (byte) 16) > arg0; var2--) {
		}
		return var2;
	}

	public Class289() {
		Class330_Sub41.method3694(24);
		this.anInt2959 = Class330_Sub41.method3694(16);
		this.anInt2957 = Class330_Sub41.method3694(24);
		this.anIntArray2962 = new int[this.anInt2957];
		boolean var1 = Class330_Sub41.method3698() != 0;
		int var2;
		int var3;
		int var5;
		if (var1) {
			var2 = 0;
			var3 = Class330_Sub41.method3694(5) + 1;
			while (var2 < this.anInt2957) {
				int var4 = Class330_Sub41.method3694(Class64.method779(this.anInt2957 - var2, -300060441));
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray2962[var2++] = var3;
				}
				var3++;
			}
		} else {
			boolean var14 = Class330_Sub41.method3698() != 0;
			for (var3 = 0; var3 < this.anInt2957; var3++) {
				if (var14 && Class330_Sub41.method3698() == 0) {
					this.anIntArray2962[var3] = 0;
				} else {
					this.anIntArray2962[var3] = Class330_Sub41.method3694(5) + 1;
				}
			}
		}
		this.method2894();
		var2 = Class330_Sub41.method3694(4);
		if (var2 > 0) {
			float var15 = Class330_Sub41.method3706(Class330_Sub41.method3694(32));
			float var16 = Class330_Sub41.method3706(Class330_Sub41.method3694(32));
			var5 = Class330_Sub41.method3694(4) + 1;
			boolean var6 = Class330_Sub41.method3698() != 0;
			int var7;
			if (var2 == 1) {
				var7 = method2891(this.anInt2957, this.anInt2959);
			} else {
				var7 = this.anInt2957 * this.anInt2959;
			}
			this.anIntArray2960 = new int[var7];
			int var8;
			for (var8 = 0; var8 < var7; var8++) {
				this.anIntArray2960[var8] = Class330_Sub41.method3694(var5);
			}
			this.aFloatArrayArray2961 = new float[this.anInt2957][this.anInt2959];
			float var9;
			int var10;
			int var11;
			if (var2 == 1) {
				for (var8 = 0; var8 < this.anInt2957; var8++) {
					var9 = 0.0F;
					var10 = 1;
					for (var11 = 0; var11 < this.anInt2959; var11++) {
						int var12 = var8 / var10 % var7;
						float var13 = (float) this.anIntArray2960[var12] * var16 + var15 + var9;
						this.aFloatArrayArray2961[var8][var11] = var13;
						if (var6) {
							var9 = var13;
						}
						var10 *= var7;
					}
				}
			} else {
				for (var8 = 0; var8 < this.anInt2957; var8++) {
					var9 = 0.0F;
					var10 = var8 * this.anInt2959;
					for (var11 = 0; var11 < this.anInt2959; var11++) {
						float var17 = (float) this.anIntArray2960[var10] * var16 + var15 + var9;
						this.aFloatArrayArray2961[var8][var11] = var17;
						if (var6) {
							var9 = var17;
						}
						var10++;
					}
				}
			}
		}
	}

	public int method2892() {
		int var1;
		for (var1 = 0; this.anIntArray2958[var1] >= 0; var1 = Class330_Sub41.method3698() == 0 ? var1 + 1 : this.anIntArray2958[var1]) {
		}
		return ~this.anIntArray2958[var1];
	}

	public float[] method2893() {
		return this.aFloatArrayArray2961[this.method2892()];
	}

	public void method2894() {
		int[] var1 = new int[this.anInt2957];
		int[] var2 = new int[33];
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		for (var3 = 0; var3 < this.anInt2957; var3++) {
			var4 = this.anIntArray2962[var3];
			if (var4 != 0) {
				var5 = 0x1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				if ((var6 & var5) == 0) {
					var7 = var6 | var5;
					for (var8 = var4 - 1; var8 >= 1; var8--) {
						var9 = var2[var8];
						if (var9 != var6) {
							break;
						}
						int var10 = 0x1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}
						var2[var8] = var9 | var10;
					}
				} else {
					var7 = var2[var4 - 1];
				}
				var2[var4] = var7;
				for (var8 = var4 + 1; var8 <= 32; var8++) {
					var9 = var2[var8];
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}
		this.anIntArray2958 = new int[8];
		var3 = 0;
		for (var4 = 0; var4 < this.anInt2957; var4++) {
			var5 = this.anIntArray2962[var4];
			if (var5 != 0) {
				var6 = var1[var4];
				var7 = 0;
				for (var8 = 0; var8 < var5; var8++) {
					var9 = Integer.MIN_VALUE >>> var8;
					if ((var6 & var9) == 0) {
						var7++;
					} else {
						if (this.anIntArray2958[var7] == 0) {
							this.anIntArray2958[var7] = var3;
						}
						var7 = this.anIntArray2958[var7];
					}
					if (var7 >= this.anIntArray2958.length) {
						int[] var12 = new int[this.anIntArray2958.length * 2];
						for (int var11 = 0; var11 < this.anIntArray2958.length; var11++) {
							var12[var11] = this.anIntArray2958[var11];
						}
						this.anIntArray2958 = var12;
					}
					var9 >>>= 0x1;
				}
				this.anIntArray2958[var7] = ~var4;
				if (var7 >= var3) {
					var3 = var7 + 1;
				}
			}
		}
	}
}
