package deob;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class330_Sub27 extends Class330 {

	public int anInt7704 = 0;

	public int anInt7711 = 0;

	public int anInt7713 = 0;

	public Class_ra_Sub2 aClass_ra_Sub2_7705;

	public Class330_Sub14 aClass330_Sub14_7697;

	public Class_xa_Sub2 aClass_xa_Sub2_7698;

	public int anInt7700;

	public int anInt7701;

	public int anInt7702;

	public int anInt7703;

	public float[][] aFloatArrayArray7709;

	public float[][] aFloatArrayArray7706;

	public float[][] aFloatArrayArray7699;

	public Class497 aClass497_7712;

	public ByteBuffer aByteBuffer7710;

	public Interface9_Impl1 anInterface9_Impl1_7708;

	public Interface9_Impl2 anInterface9_Impl2_7707;

	public Class330_Sub27(Class_ra_Sub2 arg0, Class_xa_Sub2 arg1, Class330_Sub14 arg2, int[] arg3) {
		this.aClass_ra_Sub2_7705 = arg0;
		this.aClass330_Sub14_7697 = arg2;
		this.aClass_xa_Sub2_7698 = arg1;
		int var5 = this.aClass330_Sub14_7697.method3316((byte) 39) - (arg1.anInt6395 >> 1);
		this.anInt7700 = this.aClass330_Sub14_7697.method3318(-687155497) - var5 >> arg1.anInt6396;
		this.anInt7701 = this.aClass330_Sub14_7697.method3318(-411472448) + var5 >> arg1.anInt6396;
		this.anInt7702 = this.aClass330_Sub14_7697.method3312((short) 22389) - var5 >> arg1.anInt6396;
		this.anInt7703 = this.aClass330_Sub14_7697.method3312((short) -7225) + var5 >> arg1.anInt6396;
		int var6 = this.anInt7701 - this.anInt7700 + 1;
		int var7 = this.anInt7703 - this.anInt7702 + 1;
		this.aFloatArrayArray7709 = new float[var6 + 1][var7 + 1];
		this.aFloatArrayArray7706 = new float[var6 + 1][var7 + 1];
		this.aFloatArrayArray7699 = new float[var6 + 1][var7 + 1];
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var8 = 0; var8 <= var7; var8++) {
			var9 = var8 + this.anInt7702;
			if (var9 > 0 && var9 < this.aClass_xa_Sub2_7698.anInt6393 - 1) {
				for (var10 = 0; var10 <= var6; var10++) {
					var11 = var10 + this.anInt7700;
					if (var11 > 0 && var11 < this.aClass_xa_Sub2_7698.anInt6397 - 1) {
						var12 = arg1.method6417(var11 + 1, var9, 1570940250) - arg1.method6417(var11 - 1, var9, 1382589808);
						var13 = arg1.method6417(var11, var9 + 1, 1158323969) - arg1.method6417(var11, var9 - 1, 1362477030);
						float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + 65536 + var13 * var13)));
						this.aFloatArrayArray7709[var10][var8] = (float) var12 * var14;
						this.aFloatArrayArray7706[var10][var8] = -256.0F * var14;
						this.aFloatArrayArray7699[var10][var8] = (float) var13 * var14;
					}
				}
			}
		}
		var8 = 0;
		for (var9 = this.anInt7702; var9 <= this.anInt7703; var9++) {
			if (var9 >= 0 && var9 < arg1.anInt6393) {
				for (var10 = this.anInt7700; var10 <= this.anInt7701; var10++) {
					if (var10 >= 0 && var10 < arg1.anInt6397) {
						var11 = arg3[var8];
						int[] var18 = arg1.anIntArrayArrayArray8802[var10][var9];
						if (var18 != null && var11 != 0) {
							if (var11 == 1) {
								for (var13 = 0; var13 < var18.length; var13 += 3) {
									if (var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
										this.anInt7711 += 3;
									}
								}
							} else {
								this.anInt7711 += 3;
							}
						}
					}
					var8++;
				}
			} else {
				var8 += this.anInt7701 - this.anInt7700;
			}
		}
		if (this.anInt7711 > 0) {
			this.aClass497_7712 = new Class497(Class136.method1594(this.anInt7711, 1897633489));
			this.aByteBuffer7710 = this.aClass_ra_Sub2_7705.aByteBuffer8458;
			this.aByteBuffer7710.clear();
			this.aByteBuffer7710.position(2097152);
			this.aByteBuffer7710.slice();
			this.aByteBuffer7710.position(0);
			this.aByteBuffer7710.limit(2097152);
			var9 = 0;
			var8 = 0;
			for (var10 = this.anInt7702; var10 <= this.anInt7703; var10++) {
				if (var10 >= 0 && var10 < arg1.anInt6393) {
					var11 = 0;
					for (var12 = this.anInt7700; var12 <= this.anInt7701; var12++) {
						if (var12 >= 0 && var12 < arg1.anInt6397) {
							var13 = arg3[var8];
							int[] var19 = arg1.anIntArrayArrayArray8802[var12][var10];
							if (var19 != null && var13 != 0) {
								if (var13 == 1) {
									int[] var15 = arg1.anIntArrayArrayArray8813[var12][var10];
									int[] var16 = arg1.anIntArrayArrayArray8805[var12][var10];
									int var17 = 0;
									label110: while (true) {
										while (true) {
											if (var17 >= var19.length) {
												break label110;
											}
											if (var19[var17] == -1 || var19[var17 + 1] == -1 || var19[var17 + 2] == -1) {
												var17 += 3;
											} else {
												this.method3399(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
												this.method3399(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
												this.method3399(var11, var9, var12, var10, var15[var17], var16[var17]);
												var17++;
											}
										}
									}
								} else if (var13 == 3) {
									this.method3399(var11, var9, var12, var10, 0, 0);
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, 0);
									this.method3399(var11, var9, var12, var10, 0, arg1.anInt6395);
								} else if (var13 == 2) {
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, 0);
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
									this.method3399(var11, var9, var12, var10, 0, 0);
								} else if (var13 == 5) {
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
									this.method3399(var11, var9, var12, var10, 0, arg1.anInt6395);
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, 0);
								} else if (var13 == 4) {
									this.method3399(var11, var9, var12, var10, 0, arg1.anInt6395);
									this.method3399(var11, var9, var12, var10, 0, 0);
									this.method3399(var11, var9, var12, var10, arg1.anInt6395, arg1.anInt6395);
								}
							}
						}
						var8++;
						var11++;
					}
				} else {
					var8 += this.anInt7701 - this.anInt7700;
				}
				var9++;
			}
			this.method3398();
		} else {
			this.anInterface9_Impl1_7708 = null;
			this.anInterface9_Impl2_7707 = null;
		}
		this.aClass497_7712 = null;
		this.aFloatArrayArray7699 = null;
		this.aFloatArrayArray7706 = null;
		this.aFloatArrayArray7709 = null;
	}

	public void method3398() {
		this.anInterface9_Impl2_7707 = this.aClass_ra_Sub2_7705.method4975(false);
		this.anInterface9_Impl2_7707.method148(this.anInt7713);
		this.anInterface9_Impl1_7708 = this.aClass_ra_Sub2_7705.method4976(false);
		this.anInterface9_Impl1_7708.method142(this.anInt7704 * 16, 16);
		this.anInterface9_Impl1_7708.method97(0, this.anInt7704 * 16, this.aClass_ra_Sub2_7705.aLong8459);
		this.anInterface9_Impl2_7707.method97(0, this.anInt7713 * 2, this.aClass_ra_Sub2_7705.aLong8459 + 2097152L);
	}

	public void method3399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = -1L;
		int var9 = arg4 + (arg2 << this.aClass_xa_Sub2_7698.anInt6396);
		int var10 = arg5 + (arg3 << this.aClass_xa_Sub2_7698.anInt6396);
		int var11 = this.aClass_xa_Sub2_7698.method6416(var9, var10, -803574198);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
			Class330 var12 = this.aClass497_7712.method6094(var7);
			if (var12 != null) {
				Unsafe var31 = this.aClass_ra_Sub2_7705.anUnsafe8461;
				var31.putShort(this.aClass_ra_Sub2_7705.aLong8459 + 2097152L + (long) (this.anInt7713 * 2), ((Class330_Sub24) var12).aShort7694);
				this.anInt7713++;
				return;
			}
		}
		short var30 = (short) this.anInt7704;
		if (var7 != -1L) {
			this.aClass497_7712.method6097(new Class330_Sub24(var30), var7);
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
			var13 = this.aFloatArrayArray7709[arg0][arg1];
			var14 = this.aFloatArrayArray7706[arg0][arg1];
			var15 = this.aFloatArrayArray7699[arg0][arg1];
		} else if (arg4 == this.aClass_xa_Sub2_7698.anInt6395 && arg5 == 0) {
			var13 = this.aFloatArrayArray7709[arg0 + 1][arg1];
			var14 = this.aFloatArrayArray7706[arg0 + 1][arg1];
			var15 = this.aFloatArrayArray7699[arg0 + 1][arg1];
		} else if (arg4 == this.aClass_xa_Sub2_7698.anInt6395 && arg5 == this.aClass_xa_Sub2_7698.anInt6395) {
			var13 = this.aFloatArrayArray7709[arg0 + 1][arg1 + 1];
			var14 = this.aFloatArrayArray7706[arg0 + 1][arg1 + 1];
			var15 = this.aFloatArrayArray7699[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass_xa_Sub2_7698.anInt6395) {
			var13 = this.aFloatArrayArray7709[arg0][arg1 + 1];
			var14 = this.aFloatArrayArray7706[arg0][arg1 + 1];
			var15 = this.aFloatArrayArray7699[arg0][arg1 + 1];
		} else {
			var16 = (float) arg4 / (float) this.aClass_xa_Sub2_7698.anInt6395;
			var17 = (float) arg5 / (float) this.aClass_xa_Sub2_7698.anInt6395;
			var18 = this.aFloatArrayArray7709[arg0][arg1];
			var19 = this.aFloatArrayArray7706[arg0][arg1];
			var20 = this.aFloatArrayArray7699[arg0][arg1];
			var21 = this.aFloatArrayArray7709[arg0 + 1][arg1];
			var22 = this.aFloatArrayArray7706[arg0 + 1][arg1];
			var23 = this.aFloatArrayArray7699[arg0 + 1][arg1];
			float var32 = var18 + (this.aFloatArrayArray7709[arg0][arg1 + 1] - var18) * var16;
			float var33 = var19 + (this.aFloatArrayArray7706[arg0][arg1 + 1] - var19) * var16;
			float var34 = var20 + (this.aFloatArrayArray7699[arg0][arg1 + 1] - var20) * var16;
			float var35 = var21 + (this.aFloatArrayArray7709[arg0 + 1][arg1 + 1] - var21) * var16;
			float var36 = var22 + (this.aFloatArrayArray7706[arg0 + 1][arg1 + 1] - var22) * var16;
			float var37 = var23 + (this.aFloatArrayArray7699[arg0 + 1][arg1 + 1] - var23) * var16;
			var13 = var32 + (var35 - var32) * var17;
			var14 = var33 + (var36 - var33) * var17;
			var15 = var34 + (var37 - var34) * var17;
		}
		var16 = this.aClass330_Sub14_7697.method3318(-503878945) - var9;
		var17 = this.aClass330_Sub14_7697.method3311((byte) -3) - var11;
		var18 = this.aClass330_Sub14_7697.method3312((short) -23129) - var10;
		var19 = (float) Math.sqrt((double) (var16 * var16 + var17 * var17 + var18 * var18));
		var20 = 1.0F / var19;
		var16 *= var20;
		var17 *= var20;
		var18 *= var20;
		var21 = var19 / (float) this.aClass330_Sub14_7697.method3316((byte) 56);
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
		int var25 = this.aClass330_Sub14_7697.method3313(-1056161123);
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
		Unsafe var29 = this.aClass_ra_Sub2_7705.anUnsafe8461;
		var29.putFloat(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16), (float) var9);
		var29.putFloat(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 4L, (float) var11);
		var29.putFloat(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 8L, (float) var10);
		if (this.aClass_ra_Sub2_7705.anInt8591 == 0) {
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 12L, (byte) var28);
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 13L, (byte) var27);
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 14L, (byte) var26);
		} else {
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 12L, (byte) var26);
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 13L, (byte) var27);
			var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 14L, (byte) var28);
		}
		var29.putByte(this.aClass_ra_Sub2_7705.aLong8459 + (long) (this.anInt7704 * 16) + 15L, (byte) -1);
		this.anInt7704++;
		var29.putShort(this.aClass_ra_Sub2_7705.aLong8459 + 2097152L + (long) (this.anInt7713 * 2), var30);
		this.anInt7713++;
	}
}
