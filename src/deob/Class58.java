package deob;

import jaggl.OpenGL;

public class Class58 {

	public Class_ra_Sub1 aClass_ra_Sub1_545;

	public Class_xa_Sub1 aClass_xa_Sub1_543;

	public int anInt544;

	public int anInt547;

	public byte[] aByteArray546;

	public int anInt549;

	public int anInt542;

	public int anInt548;

	public Class30[][] aClass30ArrayArray550;

	public void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
		this.aClass_ra_Sub1_545.method4854(false);
		this.aClass_ra_Sub1_545.method4815(false);
		this.aClass_ra_Sub1_545.method4841(-2);
		this.aClass_ra_Sub1_545.method4836(1);
		this.aClass_ra_Sub1_545.method4859(1);
		float var6 = 1.0F / (float) (this.aClass_ra_Sub1_545.anInt8305 * 128);
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		if (arg4) {
			for (var7 = 0; var7 < this.anInt548; var7++) {
				var8 = var7 << this.anInt549;
				var9 = var7 + 1 << this.anInt549;
				label128: for (var10 = 0; var10 < this.anInt542; var10++) {
					var11 = var10 << this.anInt549;
					var12 = var10 + 1 << this.anInt549;
					for (var13 = var11; var13 < var12; var13++) {
						if (var13 - arg0 >= -arg2 && var13 - arg0 <= arg2) {
							for (int var14 = var8; var14 < var9; var14++) {
								if (var14 - arg1 >= -arg2 && var14 - arg1 <= arg2 && arg3[var13 - arg0 + arg2][var14 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(var6, var6, 1.0F);
									OpenGL.glTranslatef((float) -var10 / var6, (float) -var7 / var6, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass30ArrayArray550[var10][var7].method498();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (var7 = 0; var7 < this.anInt548; var7++) {
				var8 = var7 << this.anInt549;
				var9 = var7 + 1 << this.anInt549;
				for (var10 = 0; var10 < this.anInt542; var10++) {
					var11 = 0;
					var12 = var10 << this.anInt549;
					var13 = var10 + 1 << this.anInt549;
					Class330_Sub46_Sub1 var20 = this.aClass_ra_Sub1_545.aClass330_Sub46_Sub1_8381;
					var20.offset = 0;
					for (int var15 = var8; var15 < var9; var15++) {
						if (var15 - arg1 >= -arg2 && var15 - arg1 <= arg2) {
							int var16 = var15 * this.aClass_xa_Sub1_543.anInt6397 + var12;
							for (int var17 = var12; var17 < var13; var17++) {
								if (var17 - arg0 >= -arg2 && var17 - arg0 <= arg2 && arg3[var17 - arg0 + arg2][var15 - arg1 + arg2]) {
									short[] var18 = this.aClass_xa_Sub1_543.aShortArrayArray8756[var16];
									if (var18 != null) {
										int var19;
										if (this.aClass_ra_Sub1_545.aBoolean8407) {
											for (var19 = 0; var19 < var18.length; var19++) {
												var20.addShort(var18[var19] & 0xFFFF, (byte) 121);
												var11++;
											}
										} else {
											for (var19 = 0; var19 < var18.length; var19++) {
												var20.method3742(var18[var19] & 0xFFFF, (short) 3493);
												var11++;
											}
										}
									}
								}
								var16++;
							}
						}
					}
					if (var11 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(var6, var6, 1.0F);
						OpenGL.glTranslatef((float) -var10 / var6, (float) -var7 / var6, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass30ArrayArray550[var10][var7].method500(var20.payload, var11);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void method661() {
		this.aClass30ArrayArray550 = new Class30[this.anInt542][this.anInt548];
		for (int var1 = 0; var1 < this.anInt548; var1++) {
			for (int var2 = 0; var2 < this.anInt542; var2++) {
				this.aClass30ArrayArray550[var2][var1] = new Class30(this.aClass_ra_Sub1_545, this, this.aClass_xa_Sub1_543, var2, var1, this.anInt549, var2 * 128 + 1, var1 * 128 + 1);
			}
		}
	}

	public void method662(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub2 var4 = (Class_na_Sub2) arg0;
		arg1 += var4.anInt10165 + 1;
		arg2 += var4.anInt10161 + 1;
		int var5 = arg1 + arg2 * this.anInt544;
		int var6 = 0;
		int var7 = var4.anInt10163;
		int var8 = var4.anInt10162;
		int var9 = this.anInt544 - var8;
		int var10 = 0;
		int var11;
		if (arg2 <= 0) {
			var11 = 1 - arg2;
			var7 -= var11;
			var6 += var11 * var8;
			var5 += var11 * this.anInt544;
			arg2 = 1;
		}
		if (arg2 + var7 >= this.anInt547) {
			var11 = arg2 + var7 + 1 - this.anInt547;
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
		if (arg1 + var8 >= this.anInt544) {
			var11 = arg1 + var8 + 1 - this.anInt544;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}
		if (var8 > 0 && var7 > 0) {
			method663(this.aByteArray546, var4.aByteArray10166, var6, var5, var8, var7, var9, var10);
			this.method665(arg1, arg2, var8, var7);
		}
	}

	public static final void method663(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	public boolean method664(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub2 var4 = (Class_na_Sub2) arg0;
		arg1 += var4.anInt10165 + 1;
		arg2 += var4.anInt10161 + 1;
		int var5 = arg1 + arg2 * this.anInt544;
		int var6 = var4.anInt10163;
		int var7 = var4.anInt10162;
		int var8 = this.anInt544 - var7;
		int var9;
		if (arg2 <= 0) {
			var9 = 1 - arg2;
			var6 -= var9;
			var5 += var9 * this.anInt544;
			arg2 = 1;
		}
		if (arg2 + var6 >= this.anInt547) {
			var9 = arg2 + var6 + 1 - this.anInt547;
			var6 -= var9;
		}
		if (arg1 <= 0) {
			var9 = 1 - arg1;
			var7 -= var9;
			var5 += var9;
			var8 += var9;
			arg1 = 1;
		}
		if (arg1 + var7 >= this.anInt544) {
			var9 = arg1 + var7 + 1 - this.anInt544;
			var7 -= var9;
			var8 += var9;
		}
		if (var7 > 0 && var6 > 0) {
			byte var10 = 8;
			var8 += (var10 - 1) * this.anInt544;
			return method666(this.aByteArray546, var5, var7, var6, var8, var10);
		} else {
			return false;
		}
	}

	public void method665(int arg0, int arg1, int arg2, int arg3) {
		if (this.aClass30ArrayArray550 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			Class30[] var10 = this.aClass30ArrayArray550[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				var10[var11].aBoolean342 = true;
			}
		}
	}

	public static final boolean method666(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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

	public Class58(Class_ra_Sub1 arg0, Class_xa_Sub1 arg1) {
		this.aClass_ra_Sub1_545 = arg0;
		this.aClass_xa_Sub1_543 = arg1;
		this.anInt544 = (this.aClass_xa_Sub1_543.anInt6397 * this.aClass_xa_Sub1_543.anInt6395 >> this.aClass_ra_Sub1_545.anInt8296) + 2;
		this.anInt547 = (this.aClass_xa_Sub1_543.anInt6393 * this.aClass_xa_Sub1_543.anInt6395 >> this.aClass_ra_Sub1_545.anInt8296) + 2;
		this.aByteArray546 = new byte[this.anInt544 * this.anInt547];
		this.anInt549 = this.aClass_ra_Sub1_545.anInt8296 + 7 - this.aClass_xa_Sub1_543.anInt6396;
		this.anInt542 = this.aClass_xa_Sub1_543.anInt6397 >> this.anInt549;
		this.anInt548 = this.aClass_xa_Sub1_543.anInt6393 >> this.anInt549;
	}

	public void method667(Class_na arg0, int arg1, int arg2) {
		Class_na_Sub2 var4 = (Class_na_Sub2) arg0;
		arg1 += var4.anInt10165 + 1;
		arg2 += var4.anInt10161 + 1;
		int var5 = arg1 + arg2 * this.anInt544;
		int var6 = 0;
		int var7 = var4.anInt10163;
		int var8 = var4.anInt10162;
		int var9 = this.anInt544 - var8;
		int var10 = 0;
		int var11;
		if (arg2 <= 0) {
			var11 = 1 - arg2;
			var7 -= var11;
			var6 += var11 * var8;
			var5 += var11 * this.anInt544;
			arg2 = 1;
		}
		if (arg2 + var7 >= this.anInt547) {
			var11 = arg2 + var7 + 1 - this.anInt547;
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
		if (arg1 + var8 >= this.anInt544) {
			var11 = arg1 + var8 + 1 - this.anInt544;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}
		if (var8 > 0 && var7 > 0) {
			method668(this.aByteArray546, var4.aByteArray10166, var6, var5, var8, var7, var9, var10);
			this.method665(arg1, arg2, var8, var7);
		}
	}

	public static final void method668(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
}
