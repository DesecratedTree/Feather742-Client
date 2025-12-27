package deob;

import java.nio.ByteBuffer;

public class Class183 {

	public Class_ra_Sub2 aClass_ra_Sub2_1813;

	public Class_xa_Sub2 aClass_xa_Sub2_1806;

	public int anInt1807;

	public int anInt1805;

	public byte[] aByteArray1809;

	public int anInt1812;

	public int anInt1810;

	public int anInt1808;

	public Class182[][] aClass182ArrayArray1811;

	public void method2066(Class140 arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
		this.aClass_ra_Sub2_1813.RA(false);
		float var7 = 1.0F / (float) (this.aClass_ra_Sub2_1813.anInt8539 * 128);
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		if (arg5) {
			for (int var8 = 0; var8 < this.anInt1808; var8++) {
				int var9 = var8 << this.anInt1812;
				var10 = var8 + 1 << this.anInt1812;
				label143: for (var11 = 0; var11 < this.anInt1810; var11++) {
					if (this.aClass182ArrayArray1811[var11][var8] != null) {
						var12 = var11 << this.anInt1812;
						var13 = var11 + 1 << this.anInt1812;
						for (var14 = var12; var14 < var13; var14++) {
							if (var14 - arg1 >= -arg3 && var14 - arg1 <= arg3) {
								for (var15 = var9; var15 < var10; var15++) {
									if (var15 - arg2 >= -arg3 && var15 - arg2 <= arg3 && arg4[var14 - arg1 + arg3][var15 - arg2 + arg3]) {
										arg0.aClass249_1546.method2486(var7, var7, 1.0F, 1.0F);
										arg0.aClass249_1546.aFloatArray2631[12] = -var11;
										arg0.aClass249_1546.aFloatArray2631[13] = -var8;
										this.aClass182ArrayArray1811[var11][var8].method2063(arg0);
										continue label143;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] var24 = new int[this.anInt1808 * this.anInt1810];
			ByteBuffer var25 = this.aClass_ra_Sub2_1813.aByteBuffer8458;
			var25.clear();
			var10 = 0;
			for (var11 = 0; var11 < this.anInt1808; var11++) {
				var12 = var11 << this.anInt1812;
				var13 = var11 + 1 << this.anInt1812;
				for (var14 = 0; var14 < this.anInt1810; var14++) {
					Class182 var27 = this.aClass182ArrayArray1811[var14][var11];
					int var16 = 0;
					if (var27 != null) {
						int var17 = var14 << this.anInt1812;
						int var18 = var14 + 1 << this.anInt1812;
						for (int var19 = var12; var19 < var13; var19++) {
							if (var19 - arg2 >= -arg3 && var19 - arg2 <= arg3) {
								int var20 = var19 * this.aClass_xa_Sub2_1806.anInt6397 + var17;
								for (int var21 = var17; var21 < var18; var21++) {
									if (var21 - arg1 >= -arg3 && var21 - arg1 <= arg3 && arg4[var21 - arg1 + arg3][var19 - arg2 + arg3]) {
										short[] var22 = this.aClass_xa_Sub2_1806.aShortArrayArray8798[var20];
										if (var22 != null) {
											for (int var23 = 0; var23 < var22.length; var23++) {
												var25.putShort(var22[var23]);
												var16++;
											}
										}
									}
									var20++;
								}
							}
						}
					}
					var24[var10] = var16;
					var10++;
				}
			}
			if (var25.position() != 0) {
				var11 = var25.position();
				Interface9_Impl2 var26 = this.aClass_ra_Sub2_1813.method4909(var11 / 2);
				var26.method97(0, var11, this.aClass_ra_Sub2_1813.aLong8459);
				var13 = 0;
				var10 = 0;
				for (var14 = 0; var14 < this.anInt1808; var14++) {
					for (var15 = 0; var15 < this.anInt1810; var15++) {
						if (var24[var10] != 0) {
							arg0.aClass249_1546.method2486(var7, var7, 1.0F, 1.0F);
							arg0.aClass249_1546.aFloatArray2631[12] = -var15;
							arg0.aClass249_1546.aFloatArray2631[13] = -var14;
							this.aClass182ArrayArray1811[var15][var14].method2064(arg0, var26, var13, var24[var10] / 3);
							var13 += var24[var10];
						}
						var10++;
					}
				}
			}
		}
		this.aClass_ra_Sub2_1813.RA(true);
	}

	public void method2067() {
		this.aClass182ArrayArray1811 = new Class182[this.anInt1810][this.anInt1808];
		for (int var1 = 0; var1 < this.anInt1808; var1++) {
			for (int var2 = 0; var2 < this.anInt1810; var2++) {
				this.aClass182ArrayArray1811[var2][var1] = new Class182(this.aClass_ra_Sub2_1813, this, this.aClass_xa_Sub2_1806, var2, var1, this.anInt1812, var2 * 128 + 1, var1 * 128 + 1);
				if (this.aClass182ArrayArray1811[var2][var1].anInt1798 == 0) {
					this.aClass182ArrayArray1811[var2][var1] = null;
				}
			}
		}
	}

	public void method2068(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub1 var4 = (Class_na_Sub1) arg0;
		arg1 += var4.anInt10158 + 1;
		arg2 += var4.anInt10156 + 1;
		int var5 = arg1 + arg2 * this.anInt1807;
		int var6 = 0;
		int var7 = var4.anInt10159;
		int var8 = var4.anInt10157;
		int var9 = this.anInt1807 - var8;
		int var10 = 0;
		int var11;
		if (arg2 <= 0) {
			var11 = 1 - arg2;
			var7 -= var11;
			var6 += var11 * var8;
			var5 += var11 * this.anInt1807;
			arg2 = 1;
		}
		if (arg2 + var7 >= this.anInt1805) {
			var11 = arg2 + var7 + 1 - this.anInt1805;
			var7 -= var11;
		}
		if (arg1 <= 0) {
			var11 = 1 - arg1;
			var8 -= var11;
			var6 += var11;
			var5 += var11;
			var10 += var11;
			var9 += var11;
			arg1 = 1;
		}
		if (arg1 + var8 >= this.anInt1807) {
			var11 = arg1 + var8 + 1 - this.anInt1807;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}
		if (var8 > 0 && var7 > 0) {
			method2071(this.aByteArray1809, var4.aByteArray10160, var6, var5, var8, var7, var9, var10);
			this.method2073(arg1, arg2, var8, var7);
		}
	}

	public void method2069(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub1 var4 = (Class_na_Sub1) arg0;
		arg1 += var4.anInt10158 + 1;
		arg2 += var4.anInt10156 + 1;
		int var5 = arg1 + arg2 * this.anInt1807;
		int var6 = 0;
		int var7 = var4.anInt10159;
		int var8 = var4.anInt10157;
		int var9 = this.anInt1807 - var8;
		int var10 = 0;
		int var11;
		if (arg2 <= 0) {
			var11 = 1 - arg2;
			var7 -= var11;
			var6 += var11 * var8;
			var5 += var11 * this.anInt1807;
			arg2 = 1;
		}
		if (arg2 + var7 >= this.anInt1805) {
			var11 = arg2 + var7 + 1 - this.anInt1805;
			var7 -= var11;
		}
		if (arg1 <= 0) {
			var11 = 1 - arg1;
			var8 -= var11;
			var6 += var11;
			var5 += var11;
			var10 += var11;
			var9 += var11;
			arg1 = 1;
		}
		if (arg1 + var8 >= this.anInt1807) {
			var11 = arg1 + var8 + 1 - this.anInt1807;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}
		if (var8 > 0 && var7 > 0) {
			method2074(this.aByteArray1809, var4.aByteArray10160, var6, var5, var8, var7, var9, var10);
			this.method2073(arg1, arg2, var8, var7);
		}
	}

	public boolean method2070(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub1 var4 = (Class_na_Sub1) arg0;
		arg1 += var4.anInt10158 + 1;
		arg2 += var4.anInt10156 + 1;
		int var5 = arg1 + arg2 * this.anInt1807;
		int var6 = var4.anInt10159;
		int var7 = var4.anInt10157;
		int var8 = this.anInt1807 - var7;
		int var9;
		if (arg2 <= 0) {
			var9 = 1 - arg2;
			var6 -= var9;
			var5 += var9 * this.anInt1807;
			arg2 = 1;
		}
		if (arg2 + var6 >= this.anInt1805) {
			var9 = arg2 + var6 + 1 - this.anInt1805;
			var6 -= var9;
		}
		if (arg1 <= 0) {
			var9 = 1 - arg1;
			var7 -= var9;
			var5 += var9;
			var8 += var9;
			arg1 = 1;
		}
		if (arg1 + var7 >= this.anInt1807) {
			var9 = arg1 + var7 + 1 - this.anInt1807;
			var7 -= var9;
			var8 += var9;
		}
		if (var7 > 0 && var6 > 0) {
			byte var10 = 8;
			var8 += (var10 - 1) * this.anInt1807;
			return method2072(this.aByteArray1809, var5, var7, var6, var8, var10);
		} else {
			return false;
		}
	}

	public static final void method2071(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var11 = -(arg4 & 0x3);
		for (int var9 = -arg5; var9 < 0; var9++) {
			int var10;
			int var10001;
			for (var10 = var8; var10 < 0; var10++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
				int var12 = arg3++;
				arg0[var12] += arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] += arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] += arg1[arg2++];
			}
			for (var10 = var11; var10 < 0; var10++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public static final boolean method2072(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 % arg5;
		int var7;
		if (var6 == 0) {
			var7 = 0;
		} else {
			var7 = arg5 - var6;
		}
		int var8 = -((arg3 + arg5 - 1) / arg5);
		int var9 = -((arg2 + arg5 - 1) / arg5);
		for (int var10 = var8; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= var7;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	public void method2073(int arg0, int arg1, int arg2, int arg3) {
		if (this.aClass182ArrayArray1811 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			Class182[] var10 = this.aClass182ArrayArray1811[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				if (var10[var11] != null) {
					var10[var11].aBoolean1794 = true;
				}
			}
		}
	}

	public Class183(Class_ra_Sub2 arg0, Class_xa_Sub2 arg1) {
		this.aClass_ra_Sub2_1813 = arg0;
		this.aClass_xa_Sub2_1806 = arg1;
		this.anInt1807 = (this.aClass_xa_Sub2_1806.anInt6397 * this.aClass_xa_Sub2_1806.anInt6395 >> this.aClass_ra_Sub2_1813.anInt8536) + 2;
		this.anInt1805 = (this.aClass_xa_Sub2_1806.anInt6393 * this.aClass_xa_Sub2_1806.anInt6395 >> this.aClass_ra_Sub2_1813.anInt8536) + 2;
		this.aByteArray1809 = new byte[this.anInt1807 * this.anInt1805];
		this.anInt1812 = this.aClass_ra_Sub2_1813.anInt8536 + 7 - this.aClass_xa_Sub2_1806.anInt6396;
		this.anInt1810 = this.aClass_xa_Sub2_1806.anInt6397 >> this.anInt1812;
		this.anInt1808 = this.aClass_xa_Sub2_1806.anInt6393 >> this.anInt1812;
	}

	public static final void method2074(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var11 = -(arg4 & 0x3);
		for (int var9 = -arg5; var9 < 0; var9++) {
			int var10;
			int var10001;
			for (var10 = var8; var10 < 0; var10++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
				int var12 = arg3++;
				arg0[var12] -= arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] -= arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] -= arg1[arg2++];
			}
			for (var10 = var11; var10 < 0; var10++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}
}
