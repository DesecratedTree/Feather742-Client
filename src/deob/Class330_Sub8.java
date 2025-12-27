package deob;

public class Class330_Sub8 extends Class330 {

	public Class_ra_Sub1 aClass_ra_Sub1_7561;

	public Class330_Sub14 aClass330_Sub14_7559;

	public Class_xa_Sub1 aClass_xa_Sub1_7555;

	public int anInt7557;

	public int anInt7558;

	public int anInt7556;

	public int anInt7560;

	public float[][] aFloatArrayArray7567;

	public float[][] aFloatArrayArray7554;

	public float[][] aFloatArrayArray7569;

	public int anInt7562;

	public Buffer aClass330_Sub46_7570;

	public Class330_Sub46_Sub1 aClass330_Sub46_Sub1_7571;

	public Class497 aClass497_7572;

	public Interface3 anInterface3_7563;

	public Interface1 anInterface1_7564;

	public Class44 aClass44_7568;

	public Class44 aClass44_7566;

	public int anInt7565;

	public void method3279(int arg0, int arg1, int arg2, boolean[][] arg3) {
		if (this.anInterface3_7563 == null || this.anInt7557 > arg0 + arg2 || this.anInt7558 < arg0 - arg2 || this.anInt7556 > arg1 + arg2 || this.anInt7560 < arg1 - arg2) {
			return;
		}
		for (int var5 = this.anInt7556; var5 <= this.anInt7560; var5++) {
			for (int var6 = this.anInt7557; var6 <= this.anInt7558; var6++) {
				int var7 = var6 - arg0;
				int var8 = var5 - arg1;
				if (var7 > -arg2 && var7 < arg2 && var8 > -arg2 && var8 < arg2 && arg3[var7 + arg2][var8 + arg2]) {
					this.aClass_ra_Sub1_7561.method4849((int) (this.aClass330_Sub14_7559.method3317(-573553228) * 255.0F) << 24);
					this.aClass_ra_Sub1_7561.method4869(this.aClass44_7568, null, this.aClass44_7566, null);
					this.aClass_ra_Sub1_7561.method4837(this.anInterface3_7563, 4, 0, this.anInt7562);
					return;
				}
			}
		}
	}

	public Class330_Sub8(Class_ra_Sub1 arg0, Class_xa_Sub1 arg1, Class330_Sub14 arg2, int[] arg3) {
		this.aClass_ra_Sub1_7561 = arg0;
		this.aClass330_Sub14_7559 = arg2;
		this.aClass_xa_Sub1_7555 = arg1;
		int var5 = this.aClass330_Sub14_7559.method3316((byte) -82) - (arg1.anInt6395 >> 1);
		this.anInt7557 = this.aClass330_Sub14_7559.method3318(1037288690) - var5 >> arg1.anInt6396;
		this.anInt7558 = this.aClass330_Sub14_7559.method3318(2048257960) + var5 >> arg1.anInt6396;
		this.anInt7556 = this.aClass330_Sub14_7559.method3312((short) 210) - var5 >> arg1.anInt6396;
		this.anInt7560 = this.aClass330_Sub14_7559.method3312((short) -7947) + var5 >> arg1.anInt6396;
		int var6 = this.anInt7558 - this.anInt7557 + 1;
		int var7 = this.anInt7560 - this.anInt7556 + 1;
		this.aFloatArrayArray7567 = new float[var6 + 1][var7 + 1];
		this.aFloatArrayArray7554 = new float[var6 + 1][var7 + 1];
		this.aFloatArrayArray7569 = new float[var6 + 1][var7 + 1];
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var8 = 0; var8 <= var7; var8++) {
			var9 = var8 + this.anInt7556;
			if (var9 > 0 && var9 < this.aClass_xa_Sub1_7555.anInt6393 - 1) {
				for (var10 = 0; var10 <= var6; var10++) {
					var11 = var10 + this.anInt7557;
					if (var11 > 0 && var11 < this.aClass_xa_Sub1_7555.anInt6397 - 1) {
						var12 = arg1.method6417(var11 + 1, var9, -1692667187) - arg1.method6417(var11 - 1, var9, -275241126);
						var13 = arg1.method6417(var11, var9 + 1, -1492783542) - arg1.method6417(var11, var9 - 1, -209019013);
						float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + 65536 + var13 * var13)));
						this.aFloatArrayArray7567[var10][var8] = (float) var12 * var14;
						this.aFloatArrayArray7554[var10][var8] = -256.0F * var14;
						this.aFloatArrayArray7569[var10][var8] = (float) var13 * var14;
					}
				}
			}
		}
		var8 = 0;
		for (var9 = this.anInt7556; var9 <= this.anInt7560; var9++) {
			if (var9 >= 0 && var9 < arg1.anInt6393) {
				for (var10 = this.anInt7557; var10 <= this.anInt7558; var10++) {
					if (var10 >= 0 && var10 < arg1.anInt6397) {
						var11 = arg3[var8];
						int[] var18 = arg1.anIntArrayArrayArray8762[var10][var9];
						if (var18 != null && var11 != 0) {
							if (var11 == 1) {
								for (var13 = 0; var13 < var18.length; var13 += 3) {
									if (var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
										this.anInt7562 += 3;
									}
								}
							} else {
								this.anInt7562 += 3;
							}
						}
					}
					var8++;
				}
			} else {
				var8 += this.anInt7558 - this.anInt7557;
			}
		}
		if (this.anInt7562 > 0) {
			this.aClass330_Sub46_7570 = new Buffer(this.anInt7562 * 2);
			this.aClass330_Sub46_Sub1_7571 = new Class330_Sub46_Sub1(this.anInt7562 * 16);
			this.aClass497_7572 = new Class497(Class136.method1594(this.anInt7562, 1714050274));
			var9 = 0;
			var8 = 0;
			for (var10 = this.anInt7556; var10 <= this.anInt7560; var10++) {
				if (var10 >= 0 && var10 < arg1.anInt6393) {
					var11 = 0;
					for (var12 = this.anInt7557; var12 <= this.anInt7558; var12++) {
						if (var12 >= 0 && var12 < arg1.anInt6397) {
							var13 = arg3[var8];
							int[] var19 = arg1.anIntArrayArrayArray8762[var12][var10];
							if (var19 != null && var13 != 0) {
								if (var13 == 1) {
									int[] var15 = arg1.anIntArrayArrayArray8786[var12][var10];
									int[] var16 = arg1.anIntArrayArrayArray8769[var12][var10];
									int var17 = 0;
									label110: while (true) {
										while (true) {
											if (var17 >= var19.length) {
												break label110;
											}
											if (var19[var17] == -1 || var19[var17 + 1] == -1 || var19[var17 + 2] == -1) {
												var17 += 3;
											} else {
												this.method3280(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
												this.method3280(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
												this.method3280(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
											}
										}
									}
								} else if (var13 == 3) {
									this.method3280(var11, var9, var12, var10, 0, 0);
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, 0);
									this.method3280(var11, var9, var12, var10, 0, arg1.anInt6395);
								} else if (var13 == 2) {
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, 0);
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
									this.method3280(var11, var9, var12, var10, 0, 0);
								} else if (var13 == 5) {
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
									this.method3280(var11, var9, var12, var10, 0, arg1.anInt6395);
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, 0);
								} else if (var13 == 4) {
									this.method3280(var11, var9, var12, var10, 0, arg1.anInt6395);
									this.method3280(var11, var9, var12, var10, 0, 0);
									this.method3280(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
								}
							}
						}
						var8++;
						var11++;
					}
				} else {
					var8 += this.anInt7558 - this.anInt7557;
				}
				var9++;
			}
			this.anInterface3_7563 = this.aClass_ra_Sub1_7561.method4834(5123, this.aClass330_Sub46_7570.payload, this.aClass330_Sub46_7570.offset, false);
			this.anInterface1_7564 = this.aClass_ra_Sub1_7561.method4835(16, this.aClass330_Sub46_Sub1_7571.payload, this.aClass330_Sub46_Sub1_7571.offset, false);
			this.aClass44_7568 = new Class44(this.anInterface1_7564, 5126, 3, 0);
			this.aClass44_7566 = new Class44(this.anInterface1_7564, 5121, 4, 12);
		} else {
			this.anInterface3_7563 = null;
			this.anInterface1_7564 = null;
			this.aClass44_7568 = null;
			this.aClass44_7566 = null;
		}
		this.aClass330_Sub46_Sub1_7571 = null;
		this.aClass330_Sub46_7570 = null;
		this.aClass497_7572 = null;
		this.aFloatArrayArray7569 = null;
		this.aFloatArrayArray7554 = null;
		this.aFloatArrayArray7567 = null;
	}

	public void method3280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = -1L;
		int var9 = arg4 + (arg2 << this.aClass_xa_Sub1_7555.anInt6396);
		int var10 = arg5 + (arg3 << this.aClass_xa_Sub1_7555.anInt6396);
		int var11 = this.aClass_xa_Sub1_7555.method6416(var9, var10, 537880928);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
			Class330_Sub24 var12 = (Class330_Sub24) this.aClass497_7572.method6094(var7);
			if (var12 != null) {
				this.method3281(var12.aShort7694);
				return;
			}
		}
		short var29 = (short) this.anInt7565++;
		if (var7 != -1L) {
			this.aClass497_7572.method6097(new Class330_Sub24(var29), var7);
		}
		float var13;
		float var14;
		float var15;
		float var16;
		float var17;
		float var18;
		float var19;
		float var20;
		float var21;
		float var22;
		float var23;
		if (arg4 == 0 && arg5 == 0) {
			var13 = this.aFloatArrayArray7567[arg0][arg1];
			var14 = this.aFloatArrayArray7554[arg0][arg1];
			var15 = this.aFloatArrayArray7569[arg0][arg1];
		} else if (arg4 == this.aClass_xa_Sub1_7555.anInt6395 && arg5 == 0) {
			var13 = this.aFloatArrayArray7567[arg0 + 1][arg1];
			var14 = this.aFloatArrayArray7554[arg0 + 1][arg1];
			var15 = this.aFloatArrayArray7569[arg0 + 1][arg1];
		} else if (arg4 == this.aClass_xa_Sub1_7555.anInt6395 && arg5 == this.aClass_xa_Sub1_7555.anInt6395) {
			var13 = this.aFloatArrayArray7567[arg0 + 1][arg1 + 1];
			var14 = this.aFloatArrayArray7554[arg0 + 1][arg1 + 1];
			var15 = this.aFloatArrayArray7569[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass_xa_Sub1_7555.anInt6395) {
			var13 = this.aFloatArrayArray7567[arg0][arg1 + 1];
			var14 = this.aFloatArrayArray7554[arg0][arg1 + 1];
			var15 = this.aFloatArrayArray7569[arg0][arg1 + 1];
		} else {
			var16 = (float) arg4 / (float) this.aClass_xa_Sub1_7555.anInt6395;
			var17 = (float) arg5 / (float) this.aClass_xa_Sub1_7555.anInt6395;
			var18 = this.aFloatArrayArray7567[arg0][arg1];
			var19 = this.aFloatArrayArray7554[arg0][arg1];
			var20 = this.aFloatArrayArray7569[arg0][arg1];
			var21 = this.aFloatArrayArray7567[arg0 + 1][arg1];
			var22 = this.aFloatArrayArray7554[arg0 + 1][arg1];
			var23 = this.aFloatArrayArray7569[arg0 + 1][arg1];
			float var30 = var18 + (this.aFloatArrayArray7567[arg0][arg1 + 1] - var18) * var16;
			float var31 = var19 + (this.aFloatArrayArray7554[arg0][arg1 + 1] - var19) * var16;
			float var32 = var20 + (this.aFloatArrayArray7569[arg0][arg1 + 1] - var20) * var16;
			float var33 = var21 + (this.aFloatArrayArray7567[arg0 + 1][arg1 + 1] - var21) * var16;
			float var34 = var22 + (this.aFloatArrayArray7554[arg0 + 1][arg1 + 1] - var22) * var16;
			float var35 = var23 + (this.aFloatArrayArray7569[arg0 + 1][arg1 + 1] - var23) * var16;
			var13 = var30 + (var33 - var30) * var17;
			var14 = var31 + (var34 - var31) * var17;
			var15 = var32 + (var35 - var32) * var17;
		}
		var16 = this.aClass330_Sub14_7559.method3318(-380290935) - var9;
		var17 = this.aClass330_Sub14_7559.method3311((byte) 10) - var11;
		var18 = this.aClass330_Sub14_7559.method3312((short) -9821) - var10;
		var19 = (float) Math.sqrt((double) (var16 * var16 + var17 * var17 + var18 * var18));
		var20 = 1.0F / var19;
		var16 *= var20;
		var17 *= var20;
		var18 *= var20;
		var21 = var19 / (float) this.aClass330_Sub14_7559.method3316((byte) -72);
		var22 = 1.0F - var21 * var21;
		if (var22 < 0.0F) {
			var22 = 0.0F;
		}
		var23 = var16 * var13 + var17 * var14 + var18 * var15;
		if (var23 < 0.0F) {
			var23 = 0.0F;
		}
		float var24 = var23 * var22 * 2.0F;
		if (var24 > 1.0F) {
			var24 = 1.0F;
		}
		int var25 = this.aClass330_Sub14_7559.method3313(-383719469);
		int var26 = (int) (var24 * (float) (var25 >> 16 & 0xFF));
		if (var26 > 255) {
			var26 = 255;
		}
		int var27 = (int) (var24 * (float) (var25 >> 8 & 0xFF));
		if (var27 > 255) {
			var27 = 255;
		}
		int var28 = (int) (var24 * (float) (var25 & 0xFF));
		if (var28 > 255) {
			var28 = 255;
		}
		if (this.aClass_ra_Sub1_7561.aBoolean8407) {
			this.aClass330_Sub46_Sub1_7571.method3819((float) var9);
			this.aClass330_Sub46_Sub1_7571.method3819((float) var11);
			this.aClass330_Sub46_Sub1_7571.method3819((float) var10);
		} else {
			this.aClass330_Sub46_Sub1_7571.method3818((float) var9);
			this.aClass330_Sub46_Sub1_7571.method3818((float) var11);
			this.aClass330_Sub46_Sub1_7571.method3818((float) var10);
		}
		this.aClass330_Sub46_Sub1_7571.addByte(var26, (byte) 10);
		this.aClass330_Sub46_Sub1_7571.addByte(var27, (byte) 3);
		this.aClass330_Sub46_Sub1_7571.addByte(var28, (byte) 11);
		this.aClass330_Sub46_Sub1_7571.addByte(255, (byte) 79);
		this.method3281(var29);
	}

	public void method3281(short arg0) {
		if (this.aClass_ra_Sub1_7561.aBoolean8407) {
			this.aClass330_Sub46_7570.addShort(arg0, (byte) 124);
		} else {
			this.aClass330_Sub46_7570.method3742(arg0, (short) 2025);
		}
	}
}
