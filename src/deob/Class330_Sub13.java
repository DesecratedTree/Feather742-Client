package deob;

public class Class330_Sub13 extends Class330 {

	public int anInt7601;

	public int anInt7599;

	public int[] anIntArray7603;

	public int anInt7604;

	public boolean aBoolean7602;

	public static int[] anIntArray7600;

	public int[] method3309() {
		return this.anIntArray7603;
	}

	public void method3310(int arg0, int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			return;
		}
		if (anIntArray7600 == null || anIntArray7600.length != this.anIntArray7603.length) {
			anIntArray7600 = new int[this.anIntArray7603.length];
		}
		int var3 = this.anIntArray7603.length;
		int var4 = arg0;
		int var5 = this.anInt7599 - 1;
		int var6 = this.anInt7599 * arg1;
		int var7 = var3 - 1;
		for (int var8 = 0; var8 < var3; var8 += this.anInt7599) {
			int var9 = var8 + var6 & var7;
			for (int var10 = 0; var10 < this.anInt7599; var10++) {
				int var11 = var8 + var10;
				int var12 = var9 + (var10 + var4 & var5);
				anIntArray7600[var11] = this.anIntArray7603[var12];
			}
		}
		int[] var13 = this.anIntArray7603;
		this.anIntArray7603 = anIntArray7600;
		anIntArray7600 = var13;
	}

	public Class330_Sub13(int arg0, int arg1, int[] arg2, boolean arg3) {
		this.anInt7601 = arg0;
		this.anInt7599 = arg1;
		this.anIntArray7603 = arg2;
		if (arg3) {
			int[] var5 = new int[this.anInt7599];
			int[] var6 = new int[this.anInt7599];
			int[] var7 = new int[this.anInt7599];
			int[] var8 = new int[this.anInt7599];
			if (anIntArray7600 == null || anIntArray7600.length != this.anIntArray7603.length) {
				anIntArray7600 = new int[this.anIntArray7603.length];
			}
			int var9 = this.anInt7599;
			int var10 = this.anInt7599;
			int var11 = var9 - 1;
			int var12 = var10 - 1;
			int var13 = var9 * var10;
			int var14 = var9;
			int var15 = var9;
			int var16;
			int var17;
			int var18;
			for (var16 = 2; var16 >= 0; var16--) {
				for (var17 = var11; var17 >= 0; var17--) {
					var14--;
					var18 = this.anIntArray7603[var14];
					var5[var17] += var18 >> 24 & 0xFF;
					var6[var17] += var18 >> 16 & 0xFF;
					var7[var17] += var18 >> 8 & 0xFF;
					var8[var17] += var18 & 0xFF;
				}
				if (var14 == 0) {
					var14 = var13;
				}
			}
			var16 = var13;
			for (var17 = var12; var17 >= 0; var17--) {
				var18 = 1;
				int var19 = 1;
				int var20 = 0;
				int var21 = 0;
				int var22 = 0;
				int var23 = 0;
				int var24;
				for (var24 = 2; var24 >= 0; var24--) {
					var19--;
					var23 += var5[var19];
					var22 += var6[var19];
					var20 += var7[var19];
					var21 += var8[var19];
					if (var19 == 0) {
						var19 = var9;
					}
				}
				int var25;
				int var26;
				for (var24 = var11; var24 >= 0; var24--) {
					var19--;
					var18--;
					var25 = var23 / 9;
					var26 = var22 / 9;
					int var27 = var20 / 9;
					int var28 = var21 / 9;
					var16--;
					anIntArray7600[var16] = var25 << 24 | var26 << 16 | var27 << 8 | var28;
					var23 += var5[var19] - var5[var18];
					var22 += var6[var19] - var6[var18];
					var21 += var8[var19] - var8[var18];
					var20 += var7[var19] - var7[var18];
					if (var19 == 0) {
						var19 = var9;
					}
					if (var18 == 0) {
						var18 = var9;
					}
				}
				for (var24 = var11; var24 >= 0; var24--) {
					var14--;
					var25 = this.anIntArray7603[var14];
					var15--;
					var26 = this.anIntArray7603[var15];
					var5[var24] += (var25 >> 24 & 0xFF) - (var26 >> 24 & 0xFF);
					var6[var24] += (var25 >> 16 & 0xFF) - (var26 >> 16 & 0xFF);
					var7[var24] += (var25 >> 8 & 0xFF) - (var26 >> 8 & 0xFF);
					var8[var24] += (var25 & 0xFF) - (var26 & 0xFF);
				}
				if (var14 == 0) {
					var14 = var13;
				}
				if (var15 == 0) {
					var15 = var13;
				}
			}
			int[] var29 = this.anIntArray7603;
			this.anIntArray7603 = anIntArray7600;
			anIntArray7600 = var29;
		}
	}
}
