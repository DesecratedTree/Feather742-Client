package deob;

public class Class320 {

	public int anInt3287 = Class330_Sub41.method3694(16);

	public int anInt3288 = Class330_Sub41.method3694(24);

	public int anInt3286 = Class330_Sub41.method3694(24);

	public int anInt3285 = Class330_Sub41.method3694(24) + 1;

	public int anInt3284 = Class330_Sub41.method3694(6) + 1;

	public int anInt3289 = Class330_Sub41.method3694(8);

	public int[] anIntArray3290;

	public Class320() {
		int[] var1 = new int[this.anInt3284];
		int var2;
		for (var2 = 0; var2 < this.anInt3284; var2++) {
			int var3 = 0;
			int var4 = Class330_Sub41.method3694(3);
			boolean var5 = Class330_Sub41.method3698() != 0;
			if (var5) {
				var3 = Class330_Sub41.method3694(5);
			}
			var1[var2] = var3 << 3 | var4;
		}
		this.anIntArray3290 = new int[this.anInt3284 * 8];
		for (var2 = 0; var2 < this.anInt3284 * 8; var2++) {
			this.anIntArray3290[var2] = (var1[var2 >> 3] & 0x1 << (var2 & 0x7)) == 0 ? -1 : Class330_Sub41.method3694(8);
		}
	}

	public void method3170(float[] arg0, int arg1, boolean arg2) {
		int var4;
		for (var4 = 0; var4 < arg1; var4++) {
			arg0[var4] = 0.0F;
		}
		if (arg2) {
			return;
		}
		var4 = Class330_Sub41.aClass289Array7783[this.anInt3289].anInt2959;
		int var5 = this.anInt3286 - this.anInt3288;
		int var6 = var5 / this.anInt3285;
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < 8; var8++) {
			int var9 = 0;
			while (var9 < var6) {
				int var10;
				int var11;
				if (var8 == 0) {
					var10 = Class330_Sub41.aClass289Array7783[this.anInt3289].method2892();
					for (var11 = var4 - 1; var11 >= 0; var11--) {
						if (var9 + var11 < var6) {
							var7[var9 + var11] = var10 % this.anInt3284;
						}
						var10 /= this.anInt3284;
					}
				}
				for (var10 = 0; var10 < var4; var10++) {
					var11 = var7[var9];
					int var12 = this.anIntArray3290[var11 * 8 + var8];
					if (var12 >= 0) {
						int var13 = this.anInt3288 + var9 * this.anInt3285;
						Class289 var14 = Class330_Sub41.aClass289Array7783[var12];
						int var15;
						if (this.anInt3287 == 0) {
							var15 = this.anInt3285 / var14.anInt2959;
							for (int var19 = 0; var19 < var15; var19++) {
								float[] var20 = var14.method2893();
								for (int var18 = 0; var18 < var14.anInt2959; var18++) {
									arg0[var13 + var19 + var18 * var15] += var20[var18];
								}
							}
						} else {
							var15 = 0;
							while (var15 < this.anInt3285) {
								float[] var16 = var14.method2893();
								for (int var17 = 0; var17 < var14.anInt2959; var17++) {
									arg0[var13 + var15] += var16[var17];
									var15++;
								}
							}
						}
					}
					var9++;
					if (var9 >= var6) {
						break;
					}
				}
			}
		}
	}
}
