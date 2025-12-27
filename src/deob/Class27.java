package deob;

import jaggl.OpenGL;

public class Class27 {

	public int anInt315 = 1600;

	public int anInt317 = 64;

	public int anInt321 = 64;

	public int anInt323 = 768;

	public float[] aFloatArray325 = new float[16];

	public Class330_Sub46_Sub1 aClass330_Sub46_Sub1_316 = new Class330_Sub46_Sub1(786336);

	public int anInt324;

	public int[] anIntArray326;

	public int[] anIntArray322;

	public int[] anIntArray330;

	public Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray329;

	public Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray319;

	public int anInt331;

	public static float aFloat332;

	public Class44 aClass44_318;

	public Class44 aClass44_320;

	public Class44 aClass44_327;

	public Interface1 anInterface1_328;

	public Class27() {
		this.anInt321 = 64;
		this.anInt323 = 768;
		this.anInt315 = 1600;
		this.anInt324 = Class64.method779(1600, -1102929761);
		this.anInt317 = 64;
		this.anIntArray326 = new int[8191];
		this.anIntArray322 = new int[1600];
		this.anIntArray330 = new int[64];
		this.aClass325_Sub3_Sub1ArrayArray329 = new Class325_Sub3_Sub1[1600][64];
		this.aClass325_Sub3_Sub1ArrayArray319 = new Class325_Sub3_Sub1[64][768];
		this.anInt331 = 0;
	}

	public void method491(Class_ra_Sub1 arg0, Class81 arg1) {
		if (arg0.aClass249_8378 == null) {
			return;
		}
		this.method493(arg0);
		float var3 = arg0.aClass249_8378.aFloatArray2631[2];
		float var4 = arg0.aClass249_8378.aFloatArray2631[6];
		float var5 = arg0.aClass249_8378.aFloatArray2631[10];
		float var6 = arg0.aClass249_8378.aFloatArray2631[14];
		try {
			int var7 = 0;
			int var8 = Integer.MAX_VALUE;
			int var9 = 0;
			Class325_Sub3 var10 = arg1.aClass461_675.aClass325_Sub3_5569;
			for (Class325_Sub3 var11 = var10.aClass325_Sub3_7483; var11 != var10; var11 = var11.aClass325_Sub3_7483) {
				Class325_Sub3_Sub1 var12 = (Class325_Sub3_Sub1) var11;
				int var13 = (int) (var3 * (float) (var12.anInt9497 >> 12) + var4 * (float) (var12.anInt9493 >> 12) + var5 * (float) (var12.anInt9489 >> 12) + var6);
				if (var13 > var9) {
					var9 = var13;
				}
				if (var13 < var8) {
					var8 = var13;
				}
				this.anIntArray326[var7++] = var13;
			}
			int var20 = var9 - var8;
			int var21;
			if (var20 + 2 > 1600) {
				var21 = Class64.method779(var20, -1147535038) + 1 - this.anInt324;
				var20 = (var20 >> var21) + 2;
			} else {
				var21 = 0;
				var20 += 2;
			}
			Class325_Sub3 var22 = var10.aClass325_Sub3_7483;
			var7 = 0;
			int var14 = -2;
			boolean var15 = true;
			boolean var16 = true;
			while (var22 != var10) {
				this.anInt331 = 0;
				int var17;
				for (var17 = 0; var17 < var20; var17++) {
					this.anIntArray322[var17] = 0;
				}
				for (var17 = 0; var17 < 64; var17++) {
					this.anIntArray330[var17] = 0;
				}
				while (var22 != var10) {
					Class325_Sub3_Sub1 var23 = (Class325_Sub3_Sub1) var22;
					if (var16) {
						var14 = var23.anInt9492;
						var15 = var23.aBoolean9496;
						var16 = false;
					}
					if (var7 > 0 && (var14 != var23.anInt9492 || var15 != var23.aBoolean9496)) {
						var16 = true;
						break;
					}
					int var18 = this.anIntArray326[var7++] - var8 >> var21;
					if (var18 < 1600) {
						if (this.anIntArray322[var18] < 64) {
							this.aClass325_Sub3_Sub1ArrayArray329[var18][this.anIntArray322[var18]++] = var23;
						} else {
							label97: {
								if (this.anIntArray322[var18] == 64) {
									if (this.anInt331 == 64) {
										break label97;
									}
									this.anIntArray322[var18] += this.anInt331++ + 1;
								}
								this.aClass325_Sub3_Sub1ArrayArray319[this.anIntArray322[var18] - 64 - 1][this.anIntArray330[this.anIntArray322[var18] - 64 - 1]++] = var23;
							}
						}
					}
					var22 = var22.aClass325_Sub3_7483;
				}
				if (var14 >= 0) {
					arg0.method4841(var14);
				} else {
					arg0.method4841(-1);
				}
				if (var15 && arg0.aFloat8372 != aFloat332) {
					arg0.IA(aFloat332);
				} else if (arg0.aFloat8372 != 1.0F) {
					arg0.IA(1.0F);
				}
				this.method495(arg0, var20);
			}
		} catch (Exception var19) {
		}
		this.method494(arg0);
	}

	public void method492(Class_ra_Sub1 arg0) {
		this.anInterface1_328 = arg0.method4835(24, null, 196584, true);
		this.aClass44_320 = new Class44(this.anInterface1_328, 5126, 2, 0);
		this.aClass44_318 = new Class44(this.anInterface1_328, 5126, 3, 8);
		this.aClass44_327 = new Class44(this.anInterface1_328, 5121, 4, 20);
	}

	public void method493(Class_ra_Sub1 arg0) {
		aFloat332 = arg0.aFloat8372;
		arg0.method4840();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4815(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	public void method494(Class_ra_Sub1 arg0) {
		arg0.method4815(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat8372 != aFloat332) {
			arg0.IA(aFloat332);
		}
	}

	public void method495(Class_ra_Sub1 arg0, int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray325, 0);
		float var3 = this.aFloatArray325[0];
		float var4 = this.aFloatArray325[4];
		float var5 = this.aFloatArray325[8];
		float var6 = this.aFloatArray325[1];
		float var7 = this.aFloatArray325[5];
		float var8 = this.aFloatArray325[9];
		float var9 = var3 + var6;
		float var10 = var4 + var7;
		float var11 = var5 + var8;
		float var12 = var3 - var6;
		float var13 = var4 - var7;
		float var14 = var5 - var8;
		float var15 = var6 - var3;
		float var16 = var7 - var4;
		float var17 = var8 - var5;
		this.aClass330_Sub46_Sub1_316.offset = 0;
		int var18;
		int var19;
		int var20;
		Class325_Sub3_Sub1 var21;
		int var22;
		byte var23;
		byte var24;
		byte var25;
		byte var26;
		float var27;
		float var28;
		float var29;
		int var30;
		int var31;
		int var32;
		Class325_Sub3_Sub1 var33;
		int var34;
		byte var35;
		float var36;
		if (arg0.aBoolean8407) {
			for (var18 = arg1 - 1; var18 >= 0; var18--) {
				var19 = this.anIntArray322[var18] > 64 ? 64 : this.anIntArray322[var18];
				if (var19 > 0) {
					for (var20 = var19 - 1; var20 >= 0; var20--) {
						var21 = this.aClass325_Sub3_Sub1ArrayArray329[var18][var20];
						var22 = var21.anInt9490;
						var23 = (byte) (var22 >> 16);
						var24 = (byte) (var22 >> 8);
						var25 = (byte) var22;
						var26 = (byte) (var22 >>> 24);
						var27 = var21.anInt9497 >> 12;
						var28 = var21.anInt9493 >> 12;
						var29 = var21.anInt9489 >> 12;
						var30 = var21.anInt9494 >> 12;
						this.aClass330_Sub46_Sub1_316.method3819(0.0F);
						this.aClass330_Sub46_Sub1_316.method3819(0.0F);
						this.aClass330_Sub46_Sub1_316.method3819(var27 + var9 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.method3819(var28 + var10 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.method3819(var29 + var11 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 1);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 50);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 125);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 32);
						this.aClass330_Sub46_Sub1_316.method3819(0.0F);
						this.aClass330_Sub46_Sub1_316.method3819(1.0F);
						this.aClass330_Sub46_Sub1_316.method3819(var27 + var15 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var28 + var16 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var29 + var17 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 111);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 10);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 85);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 35);
						this.aClass330_Sub46_Sub1_316.method3819(1.0F);
						this.aClass330_Sub46_Sub1_316.method3819(1.0F);
						this.aClass330_Sub46_Sub1_316.method3819(var27 + var9 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var28 + var10 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var29 + var11 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 45);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 125);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 21);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 125);
						this.aClass330_Sub46_Sub1_316.method3819(1.0F);
						this.aClass330_Sub46_Sub1_316.method3819(0.0F);
						this.aClass330_Sub46_Sub1_316.method3819(var27 + var12 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var28 + var13 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3819(var29 + var14 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 68);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 39);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 11);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 23);
					}
					if (this.anIntArray322[var18] > 64) {
						var20 = this.anIntArray322[var18] - 64 - 1;
						for (var32 = this.anIntArray330[var20] - 1; var32 >= 0; var32--) {
							var33 = this.aClass325_Sub3_Sub1ArrayArray319[var20][var32];
							var34 = var33.anInt9490;
							var24 = (byte) (var34 >> 16);
							var25 = (byte) (var34 >> 8);
							var26 = (byte) var34;
							var35 = (byte) (var34 >>> 24);
							var28 = var33.anInt9497 >> 12;
							var29 = var33.anInt9493 >> 12;
							var36 = var33.anInt9489 >> 12;
							var31 = var33.anInt9494 >> 12;
							this.aClass330_Sub46_Sub1_316.method3819(0.0F);
							this.aClass330_Sub46_Sub1_316.method3819(0.0F);
							this.aClass330_Sub46_Sub1_316.method3819(var28 + var9 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.method3819(var29 + var10 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.method3819(var36 + var11 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 110);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 77);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 49);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 53);
							this.aClass330_Sub46_Sub1_316.method3819(0.0F);
							this.aClass330_Sub46_Sub1_316.method3819(1.0F);
							this.aClass330_Sub46_Sub1_316.method3819(var28 + var15 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var29 + var16 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var36 + var17 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 13);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 46);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 46);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 64);
							this.aClass330_Sub46_Sub1_316.method3819(1.0F);
							this.aClass330_Sub46_Sub1_316.method3819(1.0F);
							this.aClass330_Sub46_Sub1_316.method3819(var28 + var9 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var29 + var10 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var36 + var11 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 73);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 73);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 25);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 68);
							this.aClass330_Sub46_Sub1_316.method3819(1.0F);
							this.aClass330_Sub46_Sub1_316.method3819(0.0F);
							this.aClass330_Sub46_Sub1_316.method3819(var28 + var12 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var29 + var13 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3819(var36 + var14 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 109);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 33);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 54);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 15);
						}
					}
				}
			}
		} else {
			for (var18 = arg1 - 1; var18 >= 0; var18--) {
				var19 = this.anIntArray322[var18] > 64 ? 64 : this.anIntArray322[var18];
				if (var19 > 0) {
					for (var20 = var19 - 1; var20 >= 0; var20--) {
						var21 = this.aClass325_Sub3_Sub1ArrayArray329[var18][var20];
						var22 = var21.anInt9490;
						var23 = (byte) (var22 >> 16);
						var24 = (byte) (var22 >> 8);
						var25 = (byte) var22;
						var26 = (byte) (var22 >>> 24);
						var27 = var21.anInt9497 >> 12;
						var28 = var21.anInt9493 >> 12;
						var29 = var21.anInt9489 >> 12;
						var30 = var21.anInt9494 >> 12;
						this.aClass330_Sub46_Sub1_316.method3818(0.0F);
						this.aClass330_Sub46_Sub1_316.method3818(0.0F);
						this.aClass330_Sub46_Sub1_316.method3818(var27 + var9 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.method3818(var28 + var10 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.method3818(var29 + var11 * (float) -var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 107);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 3);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 38);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 22);
						this.aClass330_Sub46_Sub1_316.method3818(0.0F);
						this.aClass330_Sub46_Sub1_316.method3818(1.0F);
						this.aClass330_Sub46_Sub1_316.method3818(var27 + var15 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var28 + var16 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var29 + var17 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 34);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 122);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 66);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 51);
						this.aClass330_Sub46_Sub1_316.method3818(1.0F);
						this.aClass330_Sub46_Sub1_316.method3818(1.0F);
						this.aClass330_Sub46_Sub1_316.method3818(var27 + var9 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var28 + var10 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var29 + var11 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 79);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 55);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 38);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 90);
						this.aClass330_Sub46_Sub1_316.method3818(1.0F);
						this.aClass330_Sub46_Sub1_316.method3818(0.0F);
						this.aClass330_Sub46_Sub1_316.method3818(var27 + var12 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var28 + var13 * (float) var30);
						this.aClass330_Sub46_Sub1_316.method3818(var29 + var14 * (float) var30);
						this.aClass330_Sub46_Sub1_316.addByte(var23, (byte) 88);
						this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 95);
						this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 92);
						this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 9);
					}
					if (this.anIntArray322[var18] > 64) {
						var20 = this.anIntArray322[var18] - 64 - 1;
						for (var32 = this.anIntArray330[var20] - 1; var32 >= 0; var32--) {
							var33 = this.aClass325_Sub3_Sub1ArrayArray319[var20][var32];
							var34 = var33.anInt9490;
							var24 = (byte) (var34 >> 16);
							var25 = (byte) (var34 >> 8);
							var26 = (byte) var34;
							var35 = (byte) (var34 >>> 24);
							var28 = var33.anInt9497 >> 12;
							var29 = var33.anInt9493 >> 12;
							var36 = var33.anInt9489 >> 12;
							var31 = var33.anInt9494 >> 12;
							this.aClass330_Sub46_Sub1_316.method3818(0.0F);
							this.aClass330_Sub46_Sub1_316.method3818(0.0F);
							this.aClass330_Sub46_Sub1_316.method3818(var28 + var9 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.method3818(var29 + var10 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.method3818(var36 + var11 * (float) -var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 32);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 73);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 15);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 61);
							this.aClass330_Sub46_Sub1_316.method3818(0.0F);
							this.aClass330_Sub46_Sub1_316.method3818(1.0F);
							this.aClass330_Sub46_Sub1_316.method3818(var28 + var15 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var29 + var16 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var36 + var17 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 39);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 46);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 70);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 33);
							this.aClass330_Sub46_Sub1_316.method3818(1.0F);
							this.aClass330_Sub46_Sub1_316.method3818(1.0F);
							this.aClass330_Sub46_Sub1_316.method3818(var28 + var9 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var29 + var10 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var36 + var11 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 32);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 48);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 47);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 103);
							this.aClass330_Sub46_Sub1_316.method3818(1.0F);
							this.aClass330_Sub46_Sub1_316.method3818(0.0F);
							this.aClass330_Sub46_Sub1_316.method3818(var28 + var12 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var29 + var13 * (float) var31);
							this.aClass330_Sub46_Sub1_316.method3818(var36 + var14 * (float) var31);
							this.aClass330_Sub46_Sub1_316.addByte(var24, (byte) 41);
							this.aClass330_Sub46_Sub1_316.addByte(var25, (byte) 112);
							this.aClass330_Sub46_Sub1_316.addByte(var26, (byte) 109);
							this.aClass330_Sub46_Sub1_316.addByte(var35, (byte) 26);
						}
					}
				}
			}
		}
		if (this.aClass330_Sub46_Sub1_316.offset != 0) {
			this.anInterface1_328.method12(24, this.aClass330_Sub46_Sub1_316.payload, this.aClass330_Sub46_Sub1_316.offset);
			arg0.method4869(this.aClass44_318, null, this.aClass44_327, this.aClass44_320);
			arg0.method4881(7, 0, this.aClass330_Sub46_Sub1_316.offset / 24);
		}
	}
}
