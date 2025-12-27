package deob;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class_xa_Sub1 extends Class_xa {

	public Class471 aClass471_8765 = new Class471();

	public Class_ra_Sub1 aClass_ra_Sub1_8757;

	public int anInt8779;

	public int anInt8759;

	public int anInt8760;

	public int anInt8761;

	public int[][][] anIntArrayArrayArray8770;

	public Class330_Sub16[][][] aClass330_Sub16ArrayArrayArray8764;

	public int[][][] anIntArrayArrayArray8786;

	public int[][][] anIntArrayArrayArray8769;

	public int[][][] anIntArrayArrayArray8762;

	public int[][][] anIntArrayArrayArray8772;

	public short[][] aShortArrayArray8756;

	public byte[][] aByteArrayArray8755;

	public byte[][] aByteArrayArray8766;

	public float[][] aFloatArrayArray8784;

	public float[][] aFloatArrayArray8785;

	public float[][] aFloatArrayArray8758;

	public Class497 aClass497_8763;

	public Class58 aClass58_8773;

	public static int anInt8768 = 1;

	public static int anInt8787 = 74;

	public static float[] aFloatArray8788 = new float[16];

	public int anInt8774;

	public int anInt8781;

	public int anInt8782;

	public int anInt8783;

	public Class44 aClass44_8767;

	public Class44 aClass44_8777;

	public Class44 aClass44_8778;

	public Class44 aClass44_8780;

	public Interface1 anInterface1_8776;

	public Class330[] aClass330Array8775;

	public int[][][] anIntArrayArrayArray8771;

	public Class_xa_Sub1(Class_ra_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass_ra_Sub1_8757 = arg0;
		this.anInt8779 = this.anInt6396 - 2;
		this.anInt8759 = 0x1 << this.anInt8779;
		this.anInt8760 = arg1;
		this.anInt8761 = arg2;
		this.anIntArrayArrayArray8770 = new int[arg3][arg4][];
		this.aClass330_Sub16ArrayArrayArray8764 = new Class330_Sub16[arg3][arg4][];
		this.anIntArrayArrayArray8786 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8769 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8762 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8772 = new int[arg3][arg4][];
		this.aShortArrayArray8756 = new short[arg3 * arg4][];
		this.aByteArrayArray8755 = new byte[arg3][arg4];
		this.aByteArrayArray8766 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8784 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		this.aFloatArrayArray8785 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		this.aFloatArrayArray8758 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		for (int var9 = 1; var9 < this.anInt6393; var9++) {
			for (int var10 = 1; var10 < this.anInt6397; var10++) {
				int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
				int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
				float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
				this.aFloatArrayArray8784[var10][var9] = (float) var11 * var13;
				this.aFloatArrayArray8785[var10][var9] = (float) (-arg7 * 2) * var13;
				this.aFloatArrayArray8758[var10][var9] = (float) var12 * var13;
			}
		}
		this.aClass497_8763 = new Class497(128);
		if ((this.anInt8761 & 0x10) != 0) {
			this.aClass58_8773 = new Class58(this.aClass_ra_Sub1_8757, this);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.ac(LClass_na;IIIIZ)V")
	public void ac(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method662(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.LA(III)V")
	public void LA(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8766[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8766[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub1_8757.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8771 == null) {
			this.anIntArrayArrayArray8771 = new int[this.anInt6397][this.anInt6393][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8770 == null) {
			this.anIntArrayArrayArray8770 = new int[this.anInt6397][this.anInt6393][];
		}
		this.anIntArrayArrayArray8786[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8769[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8762[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8772[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8771 != null) {
			this.anIntArrayArrayArray8771[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8770 != null) {
			this.anIntArrayArrayArray8770[arg0][arg1] = arg3;
		}
		Class330_Sub16[] var14 = this.aClass330_Sub16ArrayArrayArray8764[arg0][arg1] = new Class330_Sub16[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8761 & 0x20) != 0 && var16 != -1 && var13.method221(var16, 928735036).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) arg10.anInt651 << 48 | (long) arg10.anInt650 << 42 | (long) arg10.anInt652 << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8763.method6094(var18); var20 != null; var20 = this.aClass497_8763.method6095(107460649)) {
				Class330_Sub16 var21 = (Class330_Sub16) var20;
				if (var21.anInt7617 == var16 && var21.aFloat7618 == (float) var17 && var21.aClass77_7615.method925(arg10, 215970799)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub16(this, var16, var17, arg10);
				this.aClass497_8763.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub16) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8755[arg0][arg1] = (byte) (this.aByteArrayArray8755[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8782) {
			this.anInt8782 = arg6.length;
		}
		this.anInt8781 += arg6.length;
	}

	public void method6413(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = arg10 == null ? null : new int[var16 * 3];
		int[] var21 = new int[var16 * 3];
		int[] var22 = new int[var16 * 3];
		int[] var23 = arg3 == null ? null : new int[var16 * 3];
		int[] var24 = arg5 == null ? null : new int[var16 * 3];
		int var25 = 0;
		for (int var26 = 0; var26 < var16; var26++) {
			int var27 = arg6[var26];
			int var28 = arg7[var26];
			int var29 = arg8[var26];
			var17[var25] = arg2[var27];
			var18[var25] = arg4[var27];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var27];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var27];
			}
			var25++;
			var17[var25] = arg2[var28];
			var18[var25] = arg4[var28];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var28];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var28];
			}
			var25++;
			var17[var25] = arg2[var29];
			var18[var25] = arg4[var29];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var29];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var29];
			}
			var25++;
		}
		this.method6425(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
	}

	@ObfuscatedName("Class_xa_Sub1.SA()V")
	public void SA() {
		if (this.anInt8781 > 0) {
			byte[][] var1 = new byte[this.anInt6397 + 1][this.anInt6393 + 1];
			int var2;
			for (var2 = 1; var2 < this.anInt6397; var2++) {
				for (int var3 = 1; var3 < this.anInt6393; var3++) {
					var1[var2][var3] = (byte) ((this.aByteArrayArray8766[var2 - 1][var3] >> 2) + (this.aByteArrayArray8766[var2 + 1][var3] >> 3) + (this.aByteArrayArray8766[var2][var3 - 1] >> 2) + (this.aByteArrayArray8766[var2][var3 + 1] >> 3) + (this.aByteArrayArray8766[var2][var3] >> 1));
				}
			}
			this.aClass330Array8775 = new Class330[this.aClass497_8763.method6096(-1268504533)];
			this.aClass497_8763.method6093(this.aClass330Array8775, 23740248);
			for (var2 = 0; var2 < this.aClass330Array8775.length; var2++) {
				((Class330_Sub16) this.aClass330Array8775[var2]).method3337(this.anInt8781);
			}
			var2 = 24;
			if (this.anIntArrayArrayArray8771 != null) {
				var2 += 4;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				var2 += 12;
			}
			NativeHeapBuffer var64 = this.aClass_ra_Sub1_8757.aNativeHeap8308.j(this.anInt8781 * var2, false);
			Stream var4 = new Stream(var64);
			Class330_Sub16[] var5 = new Class330_Sub16[this.anInt8781];
			int var6 = Class385.method4425(this.anInt8781 / 4, (short) 23141);
			if (var6 < 1) {
				var6 = 1;
			}
			Class497 var7 = new Class497(var6);
			Class330_Sub16[] var8 = new Class330_Sub16[this.anInt8782];
			int var9;
			int var10;
			for (var9 = 0; var9 < this.anInt6397; var9++) {
				for (var10 = 0; var10 < this.anInt6393; var10++) {
					if (this.anIntArrayArrayArray8762[var9][var10] != null) {
						Class330_Sub16[] var11 = this.aClass330_Sub16ArrayArrayArray8764[var9][var10];
						int[] var12 = this.anIntArrayArrayArray8786[var9][var10];
						int[] var13 = this.anIntArrayArrayArray8769[var9][var10];
						int[] var14 = this.anIntArrayArrayArray8772[var9][var10];
						int[] var15 = this.anIntArrayArrayArray8762[var9][var10];
						int[] var16 = this.anIntArrayArrayArray8770 == null ? null : this.anIntArrayArrayArray8770[var9][var10];
						int[] var17 = this.anIntArrayArrayArray8771 == null ? null : this.anIntArrayArrayArray8771[var9][var10];
						if (var14 == null) {
							var14 = var15;
						}
						float var18 = this.aFloatArrayArray8784[var9][var10];
						float var19 = this.aFloatArrayArray8785[var9][var10];
						float var20 = this.aFloatArrayArray8758[var9][var10];
						float var21 = this.aFloatArrayArray8784[var9][var10 + 1];
						float var22 = this.aFloatArrayArray8785[var9][var10 + 1];
						float var23 = this.aFloatArrayArray8758[var9][var10 + 1];
						float var24 = this.aFloatArrayArray8784[var9 + 1][var10 + 1];
						float var25 = this.aFloatArrayArray8785[var9 + 1][var10 + 1];
						float var26 = this.aFloatArrayArray8758[var9 + 1][var10 + 1];
						float var27 = this.aFloatArrayArray8784[var9 + 1][var10];
						float var28 = this.aFloatArrayArray8785[var9 + 1][var10];
						float var29 = this.aFloatArrayArray8758[var9 + 1][var10];
						int var30 = var1[var9][var10] & 0xFF;
						int var31 = var1[var9][var10 + 1] & 0xFF;
						int var32 = var1[var9 + 1][var10 + 1] & 0xFF;
						int var33 = var1[var9 + 1][var10] & 0xFF;
						int var34 = 0;
						int var37;
						label345: for (int var35 = 0; var35 < var15.length; var35++) {
							Class330_Sub16 var36 = var11[var35];
							for (var37 = 0; var37 < var34; var37++) {
								if (var8[var37] == var36) {
									continue label345;
								}
							}
							var8[var34++] = var36;
						}
						short[] var80 = this.aShortArrayArray8756[var10 * this.anInt6397 + var9] = new short[var15.length];
						for (int var81 = 0; var81 < var15.length; var81++) {
							var37 = (var9 << this.anInt6396) + var12[var81];
							int var38 = (var10 << this.anInt6396) + var13[var81];
							int var39 = var37 >> this.anInt8779;
							int var40 = var38 >> this.anInt8779;
							int var41 = var15[var81];
							int var42 = var14[var81];
							int var43 = var16 == null ? 0 : var16[var81];
							long var44 = (long) var42 << 48 | (long) var41 << 32 | (long) (var39 << 16) | (long) var40;
							int var46 = var12[var81];
							int var47 = var13[var81];
							byte var48 = 74;
							int var49 = 0;
							float var50 = 1.0F;
							float var51;
							float var52;
							float var53;
							float var58;
							int var82;
							if (var46 == 0 && var47 == 0) {
								var51 = var18;
								var52 = var19;
								var53 = var20;
								var82 = var48 - var30;
							} else if (var46 == 0 && var47 == this.anInt6395) {
								var51 = var21;
								var52 = var22;
								var53 = var23;
								var82 = var48 - var31;
							} else if (var46 == this.anInt6395 && var47 == this.anInt6395) {
								var51 = var24;
								var52 = var25;
								var53 = var26;
								var82 = var48 - var32;
							} else if (var46 == this.anInt6395 && var47 == 0) {
								var51 = var27;
								var52 = var28;
								var53 = var29;
								var82 = var48 - var33;
							} else {
								float var54 = (float) var46 / (float) this.anInt6395;
								float var55 = (float) var47 / (float) this.anInt6395;
								float var56 = var18 + (var27 - var18) * var54;
								float var57 = var19 + (var28 - var19) * var54;
								var58 = var20 + (var29 - var20) * var54;
								float var59 = var21 + (var24 - var21) * var54;
								float var60 = var22 + (var25 - var22) * var54;
								float var61 = var23 + (var26 - var23) * var54;
								var51 = var56 + (var59 - var56) * var55;
								var52 = var57 + (var60 - var57) * var55;
								var53 = var58 + (var61 - var58) * var55;
								int var62 = var30 + ((var33 - var30) * var46 >> this.anInt6396);
								int var63 = var31 + ((var32 - var31) * var46 >> this.anInt6396);
								var82 = var48 - (var62 + ((var63 - var62) * var47 >> this.anInt6396));
							}
							if (var41 != -1) {
								int var83 = (var41 & 0x7F) * var82 >> 7;
								if (var83 < 2) {
									var83 = 2;
								} else if (var83 > 126) {
									var83 = 126;
								}
								var49 = Console.colorArray[var41 & 0xFF80 | var83];
								if ((this.anInt8761 & 0x7) == 0) {
									var50 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
									var50 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
								}
							}
							Class330 var85 = null;
							if ((var37 & this.anInt8759 - 1) == 0 && (var38 & this.anInt8759 - 1) == 0) {
								var85 = var7.method6094(var44);
							}
							int var84;
							int var86;
							if (var85 == null) {
								if (var42 == var41) {
									var86 = var49;
								} else {
									int var87 = (var42 & 0x7F) * var82 >> 7;
									if (var87 < 2) {
										var87 = 2;
									} else if (var87 > 126) {
										var87 = 126;
									}
									var86 = Console.colorArray[var42 & 0xFF80 | var87];
									if ((this.anInt8761 & 0x7) == 0) {
										float var10000 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
										var58 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
										int var88 = var86 >> 16 & 0xFF;
										int var89 = var86 >> 8 & 0xFF;
										int var90 = var86 & 0xFF;
										var88 = (int) ((float) var88 * var58);
										if (var88 < 0) {
											var88 = 0;
										} else if (var88 > 255) {
											var88 = 255;
										}
										var89 = (int) ((float) var89 * var58);
										if (var89 < 0) {
											var89 = 0;
										} else if (var89 > 255) {
											var89 = 255;
										}
										var90 = (int) ((float) var90 * var58);
										if (var90 < 0) {
											var90 = 0;
										} else if (var90 > 255) {
											var90 = 255;
										}
										var86 = var88 << 16 | var89 << 8 | var90;
									}
								}
								if (this.aClass_ra_Sub1_8757.aBoolean8407) {
									var4.o((float) var37);
									var4.o((float) (this.method6416(var37, var38, 2074629282) + var43));
									var4.o((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.o((float) var37);
									var4.o((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.o(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.o(var51);
										var4.o(var52);
										var4.o(var53);
									}
								} else {
									var4.s((float) var37);
									var4.s((float) (this.method6416(var37, var38, 310380952) + var43));
									var4.s((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.s((float) var37);
									var4.s((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.s(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.s(var51);
										var4.s(var52);
										var4.s(var53);
									}
								}
								var84 = this.anInt8774++;
								var80[var81] = (short) var84;
								if (var41 != -1) {
									var5[var84] = var11[var81];
								}
								var7.method6097(new Class330_Sub24(var80[var81]), var44);
							} else {
								var80[var81] = ((Class330_Sub24) var85).aShort7694;
								var84 = var80[var81] & 0xFFFF;
								if (var41 != -1 && var11[var81].aLong3341 < var5[var84].aLong3341) {
									var5[var84] = var11[var81];
								}
							}
							for (var86 = 0; var86 < var34; var86++) {
								var8[var86].method3336(var84, var49, var82, var50);
							}
							this.anInt8783++;
						}
					}
				}
			}
			for (var9 = 0; var9 < this.anInt8774; var9++) {
				Class330_Sub16 var65 = var5[var9];
				if (var65 != null) {
					var65.method3338(var9);
				}
			}
			for (var9 = 0; var9 < this.anInt6397; var9++) {
				for (var10 = 0; var10 < this.anInt6393; var10++) {
					short[] var67 = this.aShortArrayArray8756[var10 * this.anInt6397 + var9];
					if (var67 != null) {
						int var70 = 0;
						int var72 = 0;
						while (var72 < var67.length) {
							int var73 = var67[var72++] & 0xFFFF;
							int var74 = var67[var72++] & 0xFFFF;
							int var75 = var67[var72++] & 0xFFFF;
							Class330_Sub16 var76 = var5[var73];
							Class330_Sub16 var77 = var5[var74];
							Class330_Sub16 var78 = var5[var75];
							Class330_Sub16 var79 = null;
							if (var76 != null) {
								var76.method3339(var9, var10, var70);
								var79 = var76;
							}
							if (var77 != null) {
								var77.method3339(var9, var10, var70);
								if (var79 == null || var77.aLong3341 < var79.aLong3341) {
									var79 = var77;
								}
							}
							if (var78 != null) {
								var78.method3339(var9, var10, var70);
								if (var79 == null || var78.aLong3341 < var79.aLong3341) {
									var79 = var78;
								}
							}
							if (var79 != null) {
								if (var76 != null) {
									var79.method3338(var73);
								}
								if (var77 != null) {
									var79.method3338(var74);
								}
								if (var78 != null) {
									var79.method3338(var75);
								}
								var79.method3339(var9, var10, var70);
							}
							var70++;
						}
					}
				}
			}
			var4.f();
			this.anInterface1_8776 = this.aClass_ra_Sub1_8757.method4872(var2, var64, var4.j(), false);
			if (this.anInterface1_8776 instanceof Class46_Sub1) {
				var64.n();
			}
			this.aClass44_8777 = new Class44(this.anInterface1_8776, 5126, 3, 0);
			this.aClass44_8778 = new Class44(this.anInterface1_8776, 5121, 4, 12);
			byte var66;
			if (this.anIntArrayArrayArray8771 == null) {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 2, 16);
				var66 = 24;
			} else {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 3, 16);
				var66 = 28;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				this.aClass44_8767 = new Class44(this.anInterface1_8776, 5126, 3, var66);
			}
			long[] var68 = new long[this.aClass330Array8775.length];
			for (int var69 = 0; var69 < this.aClass330Array8775.length; var69++) {
				Class330_Sub16 var71 = (Class330_Sub16) this.aClass330Array8775[var69];
				var68[var69] = var71.aLong3341;
				var71.method3341(this.anInt8774);
			}
			Class330_Sub40_Sub1.method3584(var68, this.aClass330Array8775, (byte) 16);
			if (this.aClass58_8773 != null) {
				this.aClass58_8773.method661();
			}
		} else {
			this.aClass58_8773 = null;
		}
		if ((this.anInt8760 & 0x2) == 0) {
			this.anIntArrayArrayArray8769 = null;
			this.anIntArrayArrayArray8786 = null;
			this.anIntArrayArrayArray8762 = null;
		}
		this.anIntArrayArrayArray8771 = null;
		this.anIntArrayArrayArray8772 = null;
		this.anIntArrayArrayArray8770 = null;
		this.aClass330_Sub16ArrayArrayArray8764 = null;
		this.aByteArrayArray8766 = null;
		this.aClass497_8763 = null;
		this.aFloatArrayArray8758 = null;
		this.aFloatArrayArray8785 = null;
		this.aFloatArrayArray8784 = null;
	}

	public void method6423(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		this.method6436(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method6436(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.aClass330Array8775 == null) {
			return;
		}
		int var7 = arg2 + arg2 + 1;
		int var20 = var7 * var7;
		if (this.aClass_ra_Sub1_8757.anIntArray8301.length < var20) {
			this.aClass_ra_Sub1_8757.anIntArray8301 = new int[var20];
		}
		if (this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8783 * 2) {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(this.anInt8783 * 2);
		}
		int var8 = arg0 - arg2;
		int var9 = var8;
		if (var8 < 0) {
			var8 = 0;
		}
		int var10 = arg1 - arg2;
		int var11 = var10;
		if (var10 < 0) {
			var10 = 0;
		}
		int var12 = arg0 + arg2;
		if (var12 > this.anInt6397 - 1) {
			var12 = this.anInt6397 - 1;
		}
		int var13 = arg1 + arg2;
		if (var13 > this.anInt6393 - 1) {
			var13 = this.anInt6393 - 1;
		}
		int var14 = 0;
		int[] var15 = this.aClass_ra_Sub1_8757.anIntArray8301;
		int var16;
		for (var16 = var8; var16 <= var12; var16++) {
			boolean[] var17 = arg3[var16 - var9];
			for (int var18 = var10; var18 <= var13; var18++) {
				if (var17[var18 - var11]) {
					var15[var14++] = var18 * this.anInt6397 + var16;
				}
			}
		}
		this.aClass_ra_Sub1_8757.method4840();
		this.aClass_ra_Sub1_8757.method4854((this.anInt8761 & 0x7) != 0);
		for (var16 = 0; var16 < this.aClass330Array8775.length; var16++) {
			((Class330_Sub16) this.aClass330Array8775[var16]).method3340(var15, var14);
		}
		if (!this.aClass471_8765.method5876(-1146234440)) {
			var16 = this.aClass_ra_Sub1_8757.anInt8320;
			int var21 = this.aClass_ra_Sub1_8757.anInt8382;
			this.aClass_ra_Sub1_8757.c(0, var21, this.aClass_ra_Sub1_8757.anInt8286);
			this.aClass_ra_Sub1_8757.method4854(false);
			this.aClass_ra_Sub1_8757.method4815(false);
			this.aClass_ra_Sub1_8757.method4859(128);
			this.aClass_ra_Sub1_8757.method4841(-2);
			this.aClass_ra_Sub1_8757.method4844(this.aClass_ra_Sub1_8757.aClass36_Sub1_8400);
			this.aClass_ra_Sub1_8757.method4831(8448, 7681);
			this.aClass_ra_Sub1_8757.method4847(0, 34166, 770);
			this.aClass_ra_Sub1_8757.method4848(0, 34167, 770);
			for (Class330 var22 = this.aClass471_8765.method5869(539664854); var22 != null; var22 = this.aClass471_8765.method5873((byte) -97)) {
				Class330_Sub8 var19 = (Class330_Sub8) var22;
				var19.method3279(arg0, arg1, arg2, arg3);
			}
			this.aClass_ra_Sub1_8757.method4847(0, 5890, 768);
			this.aClass_ra_Sub1_8757.method4848(0, 5890, 770);
			this.aClass_ra_Sub1_8757.method4844(null);
			this.aClass_ra_Sub1_8757.c(var16, var21, this.aClass_ra_Sub1_8757.anInt8286);
		}
		if (this.aClass58_8773 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass_ra_Sub1_8757.method4869(this.aClass44_8777, null, null, this.aClass44_8780);
		this.aClass58_8773.method660(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@ObfuscatedName("Class_xa_Sub1.y(IILClass_na;)LClass_na;")
	public Class_na y(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8755[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 * -1684509909 * 550173571 >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
		Class_na_Sub2 var5 = (Class_na_Sub2) arg2;
		Class_na_Sub2 var6;
		if (var5 != null && var5.method3531(var4, var4)) {
			var6 = var5;
			var5.method3532();
		} else {
			var6 = new Class_na_Sub2(this.aClass_ra_Sub1_8757, var4, var4);
		}
		var6.method3530(0, 0, var4, var4);
		this.method6437(var6, arg0, arg1);
		return var6;
	}

	public void method6411(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = arg10 == null ? null : new int[var16 * 3];
		int[] var21 = new int[var16 * 3];
		int[] var22 = new int[var16 * 3];
		int[] var23 = arg3 == null ? null : new int[var16 * 3];
		int[] var24 = arg5 == null ? null : new int[var16 * 3];
		int var25 = 0;
		for (int var26 = 0; var26 < var16; var26++) {
			int var27 = arg6[var26];
			int var28 = arg7[var26];
			int var29 = arg8[var26];
			var17[var25] = arg2[var27];
			var18[var25] = arg4[var27];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var27];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var27];
			}
			var25++;
			var17[var25] = arg2[var28];
			var18[var25] = arg4[var28];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var28];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var28];
			}
			var25++;
			var17[var25] = arg2[var29];
			var18[var25] = arg4[var29];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var29];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var29];
			}
			var25++;
		}
		this.method6425(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
	}

	public void method6427(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8765.method5878(new Class330_Sub8(this.aClass_ra_Sub1_8757, this, arg0, arg1), (short) 8192);
	}

	public boolean method6418(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			return this.aClass58_8773.method664(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.UA(LClass_na;IIIIZ)V")
	public void UA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			this.aClass58_8773.method667(arg0, var7, var8);
		}
	}

	public boolean method6424(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			return this.aClass58_8773.method664(arg0, var7, var8);
		}
	}

	public void method6421(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		this.method6436(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void method6420(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8765.method5878(new Class330_Sub8(this.aClass_ra_Sub1_8757, this, arg0, arg1), (short) 8192);
	}

	@ObfuscatedName("Class_xa_Sub1.n(III)V")
	public void n(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8766[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8766[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub1.l(III)V")
	public void l(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8766[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8766[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub1.b(III)V")
	public void b(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8766[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8766[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = arg10 == null ? null : new int[var16 * 3];
		int[] var21 = new int[var16 * 3];
		int[] var22 = new int[var16 * 3];
		int[] var23 = arg3 == null ? null : new int[var16 * 3];
		int[] var24 = arg5 == null ? null : new int[var16 * 3];
		int var25 = 0;
		for (int var26 = 0; var26 < var16; var26++) {
			int var27 = arg6[var26];
			int var28 = arg7[var26];
			int var29 = arg8[var26];
			var17[var25] = arg2[var27];
			var18[var25] = arg4[var27];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var27];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var27];
			}
			var25++;
			var17[var25] = arg2[var28];
			var18[var25] = arg4[var28];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var28];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var28];
			}
			var25++;
			var17[var25] = arg2[var29];
			var18[var25] = arg4[var29];
			var19[var25] = arg9[var26];
			var21[var25] = arg11[var26];
			var22[var25] = arg12[var26];
			if (arg10 != null) {
				var20[var25] = arg10[var26];
			}
			if (arg3 != null) {
				var23[var25] = arg3[var29];
			}
			if (arg5 != null) {
				var24[var25] = arg5[var29];
			}
			var25++;
		}
		this.method6425(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
	}

	public void method6428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class76 var9 = this.aClass_ra_Sub1_8757.method4782((byte) 0);
		if (this.anInt8781 <= 0 || var9 == null) {
			return;
		}
		this.aClass_ra_Sub1_8757.method4874();
		this.aClass_ra_Sub1_8757.method4853(false);
		this.aClass_ra_Sub1_8757.method4854(false);
		this.aClass_ra_Sub1_8757.method4816(false);
		this.aClass_ra_Sub1_8757.method4815(false);
		this.aClass_ra_Sub1_8757.method4859(0);
		this.aClass_ra_Sub1_8757.method4841(-2);
		this.aClass_ra_Sub1_8757.method4844(null);
		aFloatArray8788[0] = (float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 128.0F * (float) var9.method856());
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = (float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 128.0F * (float) var9.method857());
		aFloatArray8788[6] = 0.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 0.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) var9.method856();
		aFloatArray8788[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) var9.method857();
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		aFloatArray8788[0] = 1.0F;
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = 0.0F;
		aFloatArray8788[6] = 1.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 1.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = 0.0F;
		aFloatArray8788[13] = 0.0F;
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		if ((this.anInt8761 & 0x7) == 0) {
			this.aClass_ra_Sub1_8757.method4854(false);
		} else {
			this.aClass_ra_Sub1_8757.method4854(true);
			this.aClass_ra_Sub1_8757.method4878();
		}
		this.aClass_ra_Sub1_8757.method4869(this.aClass44_8777, this.aClass44_8767, this.aClass44_8778, this.aClass44_8780);
		if (this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8783 * 2) {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(this.anInt8783 * 2);
		} else {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.offset = 0 * -824785231;
		}
		int var10 = 0;
		Class330_Sub46_Sub1 var11 = this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381;
		int var12;
		int var13;
		int var14;
		short[] var15;
		int var16;
		if (this.aClass_ra_Sub1_8757.aBoolean8407) {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.addShort(var15[var16] & 0xFFFF, (byte) 11);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		} else {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.method3742(var15[var16] & 0xFFFF, (short) 30331);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		}
		if (var10 > 0) {
			Class34_Sub1 var17 = new Class34_Sub1(this.aClass_ra_Sub1_8757, 5123, var11.payload, var11.offset * 323600977 * -824785231);
			this.aClass_ra_Sub1_8757.method4837(var17, 4, 0, var10);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.al(LClass_na;IIIIZ)V")
	public void al(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method662(arg0, var7, var8);
		}
	}

	public void method6437(Class_na_Sub2 arg0, int arg1, int arg2) {
		int[] var4 = this.anIntArrayArrayArray8786[arg1][arg2];
		int[] var5 = this.anIntArrayArrayArray8769[arg1][arg2];
		int var6 = var4.length;
		if (this.aClass_ra_Sub1_8757.anIntArray8291.length < var6) {
			this.aClass_ra_Sub1_8757.anIntArray8291 = new int[var6];
			this.aClass_ra_Sub1_8757.anIntArray8427 = new int[var6];
		}
		int[] var7 = this.aClass_ra_Sub1_8757.anIntArray8291;
		int[] var8 = this.aClass_ra_Sub1_8757.anIntArray8427;
		int var9;
		for (var9 = 0; var9 < var6; var9++) {
			var7[var9] = var4[var9] >> this.aClass_ra_Sub1_8757.anInt8296;
			var8[var9] = var5[var9] >> this.aClass_ra_Sub1_8757.anInt8296;
		}
		var9 = 0;
		while (var9 < var6) {
			int var10 = var7[var9];
			int var11 = var8[var9++];
			int var12 = var7[var9];
			int var13 = var8[var9++];
			int var14 = var7[var9];
			int var15 = var8[var9++];
			if ((var10 - var12) * (var13 - var15) - (var13 - var11) * (var14 - var12) > 0) {
				arg0.method3529(var11, var13, var15, var10, var12, var14);
			}
		}
	}

	@ObfuscatedName("Class_xa_Sub1.d()V")
	public void d() {
		if (this.anInt8781 > 0) {
			byte[][] var1 = new byte[this.anInt6397 * -1250378663 * 1972554729 + 1][this.anInt6393 * -1805935063 * 24567321 + 1];
			int var2;
			for (var2 = 1; var2 < this.anInt6397 * -1250378663 * 1972554729; var2++) {
				for (int var3 = 1; var3 < this.anInt6393 * -1805935063 * 24567321; var3++) {
					var1[var2][var3] = (byte) ((this.aByteArrayArray8766[var2 - 1][var3] >> 2) + (this.aByteArrayArray8766[var2 + 1][var3] >> 3) + (this.aByteArrayArray8766[var2][var3 - 1] >> 2) + (this.aByteArrayArray8766[var2][var3 + 1] >> 3) + (this.aByteArrayArray8766[var2][var3] >> 1));
				}
			}
			this.aClass330Array8775 = new Class330[this.aClass497_8763.method6096(1779567136)];
			this.aClass497_8763.method6093(this.aClass330Array8775, 2054339509);
			for (var2 = 0; var2 < this.aClass330Array8775.length; var2++) {
				((Class330_Sub16) this.aClass330Array8775[var2]).method3337(this.anInt8781);
			}
			var2 = 24;
			if (this.anIntArrayArrayArray8771 != null) {
				var2 += 4;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				var2 += 12;
			}
			NativeHeapBuffer var64 = this.aClass_ra_Sub1_8757.aNativeHeap8308.j(this.anInt8781 * var2, false);
			Stream var4 = new Stream(var64);
			Class330_Sub16[] var5 = new Class330_Sub16[this.anInt8781];
			int var6 = Class385.method4425(this.anInt8781 / 4, (short) 23547);
			if (var6 < 1) {
				var6 = 1;
			}
			Class497 var7 = new Class497(var6);
			Class330_Sub16[] var8 = new Class330_Sub16[this.anInt8782];
			int var9;
			int var10;
			for (var9 = 0; var9 < this.anInt6397 * -1250378663 * 1972554729; var9++) {
				for (var10 = 0; var10 < this.anInt6393 * -1805935063 * 24567321; var10++) {
					if (this.anIntArrayArrayArray8762[var9][var10] != null) {
						Class330_Sub16[] var11 = this.aClass330_Sub16ArrayArrayArray8764[var9][var10];
						int[] var12 = this.anIntArrayArrayArray8786[var9][var10];
						int[] var13 = this.anIntArrayArrayArray8769[var9][var10];
						int[] var14 = this.anIntArrayArrayArray8772[var9][var10];
						int[] var15 = this.anIntArrayArrayArray8762[var9][var10];
						int[] var16 = this.anIntArrayArrayArray8770 == null ? null : this.anIntArrayArrayArray8770[var9][var10];
						int[] var17 = this.anIntArrayArrayArray8771 == null ? null : this.anIntArrayArrayArray8771[var9][var10];
						if (var14 == null) {
							var14 = var15;
						}
						float var18 = this.aFloatArrayArray8784[var9][var10];
						float var19 = this.aFloatArrayArray8785[var9][var10];
						float var20 = this.aFloatArrayArray8758[var9][var10];
						float var21 = this.aFloatArrayArray8784[var9][var10 + 1];
						float var22 = this.aFloatArrayArray8785[var9][var10 + 1];
						float var23 = this.aFloatArrayArray8758[var9][var10 + 1];
						float var24 = this.aFloatArrayArray8784[var9 + 1][var10 + 1];
						float var25 = this.aFloatArrayArray8785[var9 + 1][var10 + 1];
						float var26 = this.aFloatArrayArray8758[var9 + 1][var10 + 1];
						float var27 = this.aFloatArrayArray8784[var9 + 1][var10];
						float var28 = this.aFloatArrayArray8785[var9 + 1][var10];
						float var29 = this.aFloatArrayArray8758[var9 + 1][var10];
						int var30 = var1[var9][var10] & 0xFF;
						int var31 = var1[var9][var10 + 1] & 0xFF;
						int var32 = var1[var9 + 1][var10 + 1] & 0xFF;
						int var33 = var1[var9 + 1][var10] & 0xFF;
						int var34 = 0;
						int var37;
						label345: for (int var35 = 0; var35 < var15.length; var35++) {
							Class330_Sub16 var36 = var11[var35];
							for (var37 = 0; var37 < var34; var37++) {
								if (var8[var37] == var36) {
									continue label345;
								}
							}
							var8[var34++] = var36;
						}
						short[] var80 = this.aShortArrayArray8756[var10 * this.anInt6397 * -1250378663 * 1972554729 + var9] = new short[var15.length];
						for (int var81 = 0; var81 < var15.length; var81++) {
							var37 = (var9 << this.anInt6396 * -786523509 * -1066304221) + var12[var81];
							int var38 = (var10 << this.anInt6396 * -786523509 * -1066304221) + var13[var81];
							int var39 = var37 >> this.anInt8779;
							int var40 = var38 >> this.anInt8779;
							int var41 = var15[var81];
							int var42 = var14[var81];
							int var43 = var16 == null ? 0 : var16[var81];
							long var44 = (long) var42 << 48 | (long) var41 << 32 | (long) (var39 << 16) | (long) var40;
							int var46 = var12[var81];
							int var47 = var13[var81];
							byte var48 = 74;
							int var49 = 0;
							float var50 = 1.0F;
							float var51;
							float var52;
							float var53;
							float var58;
							int var82;
							if (var46 == 0 && var47 == 0) {
								var51 = var18;
								var52 = var19;
								var53 = var20;
								var82 = var48 - var30;
							} else if (var46 == 0 && var47 == this.anInt6395 * -1684509909 * 550173571) {
								var51 = var21;
								var52 = var22;
								var53 = var23;
								var82 = var48 - var31;
							} else if (var46 == this.anInt6395 * -1684509909 * 550173571 && var47 == this.anInt6395 * -1684509909 * 550173571) {
								var51 = var24;
								var52 = var25;
								var53 = var26;
								var82 = var48 - var32;
							} else if (var46 == this.anInt6395 * -1684509909 * 550173571 && var47 == 0) {
								var51 = var27;
								var52 = var28;
								var53 = var29;
								var82 = var48 - var33;
							} else {
								float var54 = (float) var46 / (float) (this.anInt6395 * -1684509909 * 550173571);
								float var55 = (float) var47 / (float) (this.anInt6395 * -1684509909 * 550173571);
								float var56 = var18 + (var27 - var18) * var54;
								float var57 = var19 + (var28 - var19) * var54;
								var58 = var20 + (var29 - var20) * var54;
								float var59 = var21 + (var24 - var21) * var54;
								float var60 = var22 + (var25 - var22) * var54;
								float var61 = var23 + (var26 - var23) * var54;
								var51 = var56 + (var59 - var56) * var55;
								var52 = var57 + (var60 - var57) * var55;
								var53 = var58 + (var61 - var58) * var55;
								int var62 = var30 + ((var33 - var30) * var46 >> this.anInt6396 * -786523509 * -1066304221);
								int var63 = var31 + ((var32 - var31) * var46 >> this.anInt6396 * -786523509 * -1066304221);
								var82 = var48 - (var62 + ((var63 - var62) * var47 >> this.anInt6396 * -786523509 * -1066304221));
							}
							if (var41 != -1) {
								int var83 = (var41 & 0x7F) * var82 >> 7;
								if (var83 < 2) {
									var83 = 2;
								} else if (var83 > 126) {
									var83 = 126;
								}
								var49 = Console.colorArray[var41 & 0xFF80 | var83];
								if ((this.anInt8761 & 0x7) == 0) {
									var50 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
									var50 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
								}
							}
							Class330 var85 = null;
							if ((var37 & this.anInt8759 - 1) == 0 && (var38 & this.anInt8759 - 1) == 0) {
								var85 = var7.method6094(var44);
							}
							int var84;
							int var86;
							if (var85 == null) {
								if (var42 == var41) {
									var86 = var49;
								} else {
									int var87 = (var42 & 0x7F) * var82 >> 7;
									if (var87 < 2) {
										var87 = 2;
									} else if (var87 > 126) {
										var87 = 126;
									}
									var86 = Console.colorArray[var42 & 0xFF80 | var87];
									if ((this.anInt8761 & 0x7) == 0) {
										float var10000 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
										var58 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
										int var88 = var86 >> 16 & 0xFF;
										int var89 = var86 >> 8 & 0xFF;
										int var90 = var86 & 0xFF;
										var88 = (int) ((float) var88 * var58);
										if (var88 < 0) {
											var88 = 0;
										} else if (var88 > 255) {
											var88 = 255;
										}
										var89 = (int) ((float) var89 * var58);
										if (var89 < 0) {
											var89 = 0;
										} else if (var89 > 255) {
											var89 = 255;
										}
										var90 = (int) ((float) var90 * var58);
										if (var90 < 0) {
											var90 = 0;
										} else if (var90 > 255) {
											var90 = 255;
										}
										var86 = var88 << 16 | var89 << 8 | var90;
									}
								}
								if (this.aClass_ra_Sub1_8757.aBoolean8407) {
									var4.o((float) var37);
									var4.o((float) (this.method6416(var37, var38, -1078462647) + var43));
									var4.o((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.o((float) var37);
									var4.o((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.o(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.o(var51);
										var4.o(var52);
										var4.o(var53);
									}
								} else {
									var4.s((float) var37);
									var4.s((float) (this.method6416(var37, var38, -307482130) + var43));
									var4.s((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.s((float) var37);
									var4.s((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.s(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.s(var51);
										var4.s(var52);
										var4.s(var53);
									}
								}
								var84 = this.anInt8774++;
								var80[var81] = (short) var84;
								if (var41 != -1) {
									var5[var84] = var11[var81];
								}
								var7.method6097(new Class330_Sub24(var80[var81]), var44);
							} else {
								var80[var81] = ((Class330_Sub24) var85).aShort7694;
								var84 = var80[var81] & 0xFFFF;
								if (var41 != -1 && var11[var81].aLong3341 * -1420004262915178823L * -6154793640677333111L < var5[var84].aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var5[var84] = var11[var81];
								}
							}
							for (var86 = 0; var86 < var34; var86++) {
								var8[var86].method3336(var84, var49, var82, var50);
							}
							this.anInt8783++;
						}
					}
				}
			}
			for (var9 = 0; var9 < this.anInt8774; var9++) {
				Class330_Sub16 var65 = var5[var9];
				if (var65 != null) {
					var65.method3338(var9);
				}
			}
			for (var9 = 0; var9 < this.anInt6397 * -1250378663 * 1972554729; var9++) {
				for (var10 = 0; var10 < this.anInt6393 * -1805935063 * 24567321; var10++) {
					short[] var67 = this.aShortArrayArray8756[var10 * this.anInt6397 * -1250378663 * 1972554729 + var9];
					if (var67 != null) {
						int var70 = 0;
						int var72 = 0;
						while (var72 < var67.length) {
							int var73 = var67[var72++] & 0xFFFF;
							int var74 = var67[var72++] & 0xFFFF;
							int var75 = var67[var72++] & 0xFFFF;
							Class330_Sub16 var76 = var5[var73];
							Class330_Sub16 var77 = var5[var74];
							Class330_Sub16 var78 = var5[var75];
							Class330_Sub16 var79 = null;
							if (var76 != null) {
								var76.method3339(var9, var10, var70);
								var79 = var76;
							}
							if (var77 != null) {
								var77.method3339(var9, var10, var70);
								if (var79 == null || var77.aLong3341 * -1420004262915178823L * -6154793640677333111L < var79.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var79 = var77;
								}
							}
							if (var78 != null) {
								var78.method3339(var9, var10, var70);
								if (var79 == null || var78.aLong3341 * -1420004262915178823L * -6154793640677333111L < var79.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var79 = var78;
								}
							}
							if (var79 != null) {
								if (var76 != null) {
									var79.method3338(var73);
								}
								if (var77 != null) {
									var79.method3338(var74);
								}
								if (var78 != null) {
									var79.method3338(var75);
								}
								var79.method3339(var9, var10, var70);
							}
							var70++;
						}
					}
				}
			}
			var4.f();
			this.anInterface1_8776 = this.aClass_ra_Sub1_8757.method4872(var2, var64, var4.j(), false);
			if (this.anInterface1_8776 instanceof Class46_Sub1) {
				var64.n();
			}
			this.aClass44_8777 = new Class44(this.anInterface1_8776, 5126, 3, 0);
			this.aClass44_8778 = new Class44(this.anInterface1_8776, 5121, 4, 12);
			byte var66;
			if (this.anIntArrayArrayArray8771 == null) {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 2, 16);
				var66 = 24;
			} else {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 3, 16);
				var66 = 28;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				this.aClass44_8767 = new Class44(this.anInterface1_8776, 5126, 3, var66);
			}
			long[] var68 = new long[this.aClass330Array8775.length];
			for (int var69 = 0; var69 < this.aClass330Array8775.length; var69++) {
				Class330_Sub16 var71 = (Class330_Sub16) this.aClass330Array8775[var69];
				var68[var69] = var71.aLong3341 * -1420004262915178823L * -6154793640677333111L;
				var71.method3341(this.anInt8774);
			}
			Class330_Sub40_Sub1.method3584(var68, this.aClass330Array8775, (byte) 16);
			if (this.aClass58_8773 != null) {
				this.aClass58_8773.method661();
			}
		} else {
			this.aClass58_8773 = null;
		}
		if ((this.anInt8760 & 0x2) == 0) {
			this.anIntArrayArrayArray8769 = null;
			this.anIntArrayArrayArray8786 = null;
			this.anIntArrayArrayArray8762 = null;
		}
		this.anIntArrayArrayArray8771 = null;
		this.anIntArrayArrayArray8772 = null;
		this.anIntArrayArrayArray8770 = null;
		this.aClass330_Sub16ArrayArrayArray8764 = null;
		this.aByteArrayArray8766 = null;
		this.aClass497_8763 = null;
		this.aFloatArrayArray8758 = null;
		this.aFloatArrayArray8785 = null;
		this.aFloatArrayArray8784 = null;
	}

	@ObfuscatedName("Class_xa_Sub1.c()V")
	public void c() {
		if (this.anInt8781 > 0) {
			byte[][] var1 = new byte[this.anInt6397 * -1250378663 * 1972554729 + 1][this.anInt6393 * -1805935063 * 24567321 + 1];
			int var2;
			for (var2 = 1; var2 < this.anInt6397 * -1250378663 * 1972554729; var2++) {
				for (int var3 = 1; var3 < this.anInt6393 * -1805935063 * 24567321; var3++) {
					var1[var2][var3] = (byte) ((this.aByteArrayArray8766[var2 - 1][var3] >> 2) + (this.aByteArrayArray8766[var2 + 1][var3] >> 3) + (this.aByteArrayArray8766[var2][var3 - 1] >> 2) + (this.aByteArrayArray8766[var2][var3 + 1] >> 3) + (this.aByteArrayArray8766[var2][var3] >> 1));
				}
			}
			this.aClass330Array8775 = new Class330[this.aClass497_8763.method6096(662711022)];
			this.aClass497_8763.method6093(this.aClass330Array8775, 496217807);
			for (var2 = 0; var2 < this.aClass330Array8775.length; var2++) {
				((Class330_Sub16) this.aClass330Array8775[var2]).method3337(this.anInt8781);
			}
			var2 = 24;
			if (this.anIntArrayArrayArray8771 != null) {
				var2 += 4;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				var2 += 12;
			}
			NativeHeapBuffer var64 = this.aClass_ra_Sub1_8757.aNativeHeap8308.j(this.anInt8781 * var2, false);
			Stream var4 = new Stream(var64);
			Class330_Sub16[] var5 = new Class330_Sub16[this.anInt8781];
			int var6 = Class385.method4425(this.anInt8781 / 4, (short) 20316);
			if (var6 < 1) {
				var6 = 1;
			}
			Class497 var7 = new Class497(var6);
			Class330_Sub16[] var8 = new Class330_Sub16[this.anInt8782];
			int var9;
			int var10;
			for (var9 = 0; var9 < this.anInt6397 * -1250378663 * 1972554729; var9++) {
				for (var10 = 0; var10 < this.anInt6393 * -1805935063 * 24567321; var10++) {
					if (this.anIntArrayArrayArray8762[var9][var10] != null) {
						Class330_Sub16[] var11 = this.aClass330_Sub16ArrayArrayArray8764[var9][var10];
						int[] var12 = this.anIntArrayArrayArray8786[var9][var10];
						int[] var13 = this.anIntArrayArrayArray8769[var9][var10];
						int[] var14 = this.anIntArrayArrayArray8772[var9][var10];
						int[] var15 = this.anIntArrayArrayArray8762[var9][var10];
						int[] var16 = this.anIntArrayArrayArray8770 == null ? null : this.anIntArrayArrayArray8770[var9][var10];
						int[] var17 = this.anIntArrayArrayArray8771 == null ? null : this.anIntArrayArrayArray8771[var9][var10];
						if (var14 == null) {
							var14 = var15;
						}
						float var18 = this.aFloatArrayArray8784[var9][var10];
						float var19 = this.aFloatArrayArray8785[var9][var10];
						float var20 = this.aFloatArrayArray8758[var9][var10];
						float var21 = this.aFloatArrayArray8784[var9][var10 + 1];
						float var22 = this.aFloatArrayArray8785[var9][var10 + 1];
						float var23 = this.aFloatArrayArray8758[var9][var10 + 1];
						float var24 = this.aFloatArrayArray8784[var9 + 1][var10 + 1];
						float var25 = this.aFloatArrayArray8785[var9 + 1][var10 + 1];
						float var26 = this.aFloatArrayArray8758[var9 + 1][var10 + 1];
						float var27 = this.aFloatArrayArray8784[var9 + 1][var10];
						float var28 = this.aFloatArrayArray8785[var9 + 1][var10];
						float var29 = this.aFloatArrayArray8758[var9 + 1][var10];
						int var30 = var1[var9][var10] & 0xFF;
						int var31 = var1[var9][var10 + 1] & 0xFF;
						int var32 = var1[var9 + 1][var10 + 1] & 0xFF;
						int var33 = var1[var9 + 1][var10] & 0xFF;
						int var34 = 0;
						int var37;
						label345: for (int var35 = 0; var35 < var15.length; var35++) {
							Class330_Sub16 var36 = var11[var35];
							for (var37 = 0; var37 < var34; var37++) {
								if (var8[var37] == var36) {
									continue label345;
								}
							}
							var8[var34++] = var36;
						}
						short[] var80 = this.aShortArrayArray8756[var10 * this.anInt6397 * -1250378663 * 1972554729 + var9] = new short[var15.length];
						for (int var81 = 0; var81 < var15.length; var81++) {
							var37 = (var9 << this.anInt6396 * -786523509 * -1066304221) + var12[var81];
							int var38 = (var10 << this.anInt6396 * -786523509 * -1066304221) + var13[var81];
							int var39 = var37 >> this.anInt8779;
							int var40 = var38 >> this.anInt8779;
							int var41 = var15[var81];
							int var42 = var14[var81];
							int var43 = var16 == null ? 0 : var16[var81];
							long var44 = (long) var42 << 48 | (long) var41 << 32 | (long) (var39 << 16) | (long) var40;
							int var46 = var12[var81];
							int var47 = var13[var81];
							byte var48 = 74;
							int var49 = 0;
							float var50 = 1.0F;
							float var51;
							float var52;
							float var53;
							float var58;
							int var82;
							if (var46 == 0 && var47 == 0) {
								var51 = var18;
								var52 = var19;
								var53 = var20;
								var82 = var48 - var30;
							} else if (var46 == 0 && var47 == this.anInt6395 * -1684509909 * 550173571) {
								var51 = var21;
								var52 = var22;
								var53 = var23;
								var82 = var48 - var31;
							} else if (var46 == this.anInt6395 * -1684509909 * 550173571 && var47 == this.anInt6395 * -1684509909 * 550173571) {
								var51 = var24;
								var52 = var25;
								var53 = var26;
								var82 = var48 - var32;
							} else if (var46 == this.anInt6395 * -1684509909 * 550173571 && var47 == 0) {
								var51 = var27;
								var52 = var28;
								var53 = var29;
								var82 = var48 - var33;
							} else {
								float var54 = (float) var46 / (float) (this.anInt6395 * -1684509909 * 550173571);
								float var55 = (float) var47 / (float) (this.anInt6395 * -1684509909 * 550173571);
								float var56 = var18 + (var27 - var18) * var54;
								float var57 = var19 + (var28 - var19) * var54;
								var58 = var20 + (var29 - var20) * var54;
								float var59 = var21 + (var24 - var21) * var54;
								float var60 = var22 + (var25 - var22) * var54;
								float var61 = var23 + (var26 - var23) * var54;
								var51 = var56 + (var59 - var56) * var55;
								var52 = var57 + (var60 - var57) * var55;
								var53 = var58 + (var61 - var58) * var55;
								int var62 = var30 + ((var33 - var30) * var46 >> this.anInt6396 * -786523509 * -1066304221);
								int var63 = var31 + ((var32 - var31) * var46 >> this.anInt6396 * -786523509 * -1066304221);
								var82 = var48 - (var62 + ((var63 - var62) * var47 >> this.anInt6396 * -786523509 * -1066304221));
							}
							if (var41 != -1) {
								int var83 = (var41 & 0x7F) * var82 >> 7;
								if (var83 < 2) {
									var83 = 2;
								} else if (var83 > 126) {
									var83 = 126;
								}
								var49 = Console.colorArray[var41 & 0xFF80 | var83];
								if ((this.anInt8761 & 0x7) == 0) {
									var50 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
									var50 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
								}
							}
							Class330 var85 = null;
							if ((var37 & this.anInt8759 - 1) == 0 && (var38 & this.anInt8759 - 1) == 0) {
								var85 = var7.method6094(var44);
							}
							int var84;
							int var86;
							if (var85 == null) {
								if (var42 == var41) {
									var86 = var49;
								} else {
									int var87 = (var42 & 0x7F) * var82 >> 7;
									if (var87 < 2) {
										var87 = 2;
									} else if (var87 > 126) {
										var87 = 126;
									}
									var86 = Console.colorArray[var42 & 0xFF80 | var87];
									if ((this.anInt8761 & 0x7) == 0) {
										float var10000 = this.aClass_ra_Sub1_8757.aFloatArray8366[0] * var51 + this.aClass_ra_Sub1_8757.aFloatArray8366[1] * var52 + this.aClass_ra_Sub1_8757.aFloatArray8366[2] * var53;
										var58 = this.aClass_ra_Sub1_8757.aFloat8372 + var50 * (var50 > 0.0F ? this.aClass_ra_Sub1_8757.aFloat8373 : this.aClass_ra_Sub1_8757.aFloat8374);
										int var88 = var86 >> 16 & 0xFF;
										int var89 = var86 >> 8 & 0xFF;
										int var90 = var86 & 0xFF;
										var88 = (int) ((float) var88 * var58);
										if (var88 < 0) {
											var88 = 0;
										} else if (var88 > 255) {
											var88 = 255;
										}
										var89 = (int) ((float) var89 * var58);
										if (var89 < 0) {
											var89 = 0;
										} else if (var89 > 255) {
											var89 = 255;
										}
										var90 = (int) ((float) var90 * var58);
										if (var90 < 0) {
											var90 = 0;
										} else if (var90 > 255) {
											var90 = 255;
										}
										var86 = var88 << 16 | var89 << 8 | var90;
									}
								}
								if (this.aClass_ra_Sub1_8757.aBoolean8407) {
									var4.o((float) var37);
									var4.o((float) (this.method6416(var37, var38, 1269688705) + var43));
									var4.o((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.o((float) var37);
									var4.o((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.o(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.o(var51);
										var4.o(var52);
										var4.o(var53);
									}
								} else {
									var4.s((float) var37);
									var4.s((float) (this.method6416(var37, var38, 1061843319) + var43));
									var4.s((float) var38);
									var4.p((byte) (var86 >> 16));
									var4.p((byte) (var86 >> 8));
									var4.p((byte) var86);
									var4.p(-1);
									var4.s((float) var37);
									var4.s((float) var38);
									if (this.anIntArrayArrayArray8771 != null) {
										var4.s(var17 == null ? 0.0F : (float) (var17[var81] - 1));
									}
									if ((this.anInt8761 & 0x7) != 0) {
										var4.s(var51);
										var4.s(var52);
										var4.s(var53);
									}
								}
								var84 = this.anInt8774++;
								var80[var81] = (short) var84;
								if (var41 != -1) {
									var5[var84] = var11[var81];
								}
								var7.method6097(new Class330_Sub24(var80[var81]), var44);
							} else {
								var80[var81] = ((Class330_Sub24) var85).aShort7694;
								var84 = var80[var81] & 0xFFFF;
								if (var41 != -1 && var11[var81].aLong3341 * -1420004262915178823L * -6154793640677333111L < var5[var84].aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var5[var84] = var11[var81];
								}
							}
							for (var86 = 0; var86 < var34; var86++) {
								var8[var86].method3336(var84, var49, var82, var50);
							}
							this.anInt8783++;
						}
					}
				}
			}
			for (var9 = 0; var9 < this.anInt8774; var9++) {
				Class330_Sub16 var65 = var5[var9];
				if (var65 != null) {
					var65.method3338(var9);
				}
			}
			for (var9 = 0; var9 < this.anInt6397 * -1250378663 * 1972554729; var9++) {
				for (var10 = 0; var10 < this.anInt6393 * -1805935063 * 24567321; var10++) {
					short[] var67 = this.aShortArrayArray8756[var10 * this.anInt6397 * -1250378663 * 1972554729 + var9];
					if (var67 != null) {
						int var70 = 0;
						int var72 = 0;
						while (var72 < var67.length) {
							int var73 = var67[var72++] & 0xFFFF;
							int var74 = var67[var72++] & 0xFFFF;
							int var75 = var67[var72++] & 0xFFFF;
							Class330_Sub16 var76 = var5[var73];
							Class330_Sub16 var77 = var5[var74];
							Class330_Sub16 var78 = var5[var75];
							Class330_Sub16 var79 = null;
							if (var76 != null) {
								var76.method3339(var9, var10, var70);
								var79 = var76;
							}
							if (var77 != null) {
								var77.method3339(var9, var10, var70);
								if (var79 == null || var77.aLong3341 * -1420004262915178823L * -6154793640677333111L < var79.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var79 = var77;
								}
							}
							if (var78 != null) {
								var78.method3339(var9, var10, var70);
								if (var79 == null || var78.aLong3341 * -1420004262915178823L * -6154793640677333111L < var79.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
									var79 = var78;
								}
							}
							if (var79 != null) {
								if (var76 != null) {
									var79.method3338(var73);
								}
								if (var77 != null) {
									var79.method3338(var74);
								}
								if (var78 != null) {
									var79.method3338(var75);
								}
								var79.method3339(var9, var10, var70);
							}
							var70++;
						}
					}
				}
			}
			var4.f();
			this.anInterface1_8776 = this.aClass_ra_Sub1_8757.method4872(var2, var64, var4.j(), false);
			if (this.anInterface1_8776 instanceof Class46_Sub1) {
				var64.n();
			}
			this.aClass44_8777 = new Class44(this.anInterface1_8776, 5126, 3, 0);
			this.aClass44_8778 = new Class44(this.anInterface1_8776, 5121, 4, 12);
			byte var66;
			if (this.anIntArrayArrayArray8771 == null) {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 2, 16);
				var66 = 24;
			} else {
				this.aClass44_8780 = new Class44(this.anInterface1_8776, 5126, 3, 16);
				var66 = 28;
			}
			if ((this.anInt8761 & 0x7) != 0) {
				this.aClass44_8767 = new Class44(this.anInterface1_8776, 5126, 3, var66);
			}
			long[] var68 = new long[this.aClass330Array8775.length];
			for (int var69 = 0; var69 < this.aClass330Array8775.length; var69++) {
				Class330_Sub16 var71 = (Class330_Sub16) this.aClass330Array8775[var69];
				var68[var69] = var71.aLong3341 * -1420004262915178823L * -6154793640677333111L;
				var71.method3341(this.anInt8774);
			}
			Class330_Sub40_Sub1.method3584(var68, this.aClass330Array8775, (byte) 16);
			if (this.aClass58_8773 != null) {
				this.aClass58_8773.method661();
			}
		} else {
			this.aClass58_8773 = null;
		}
		if ((this.anInt8760 & 0x2) == 0) {
			this.anIntArrayArrayArray8769 = null;
			this.anIntArrayArrayArray8786 = null;
			this.anIntArrayArrayArray8762 = null;
		}
		this.anIntArrayArrayArray8771 = null;
		this.anIntArrayArrayArray8772 = null;
		this.anIntArrayArrayArray8770 = null;
		this.aClass330_Sub16ArrayArrayArray8764 = null;
		this.aByteArrayArray8766 = null;
		this.aClass497_8763 = null;
		this.aFloatArrayArray8758 = null;
		this.aFloatArrayArray8785 = null;
		this.aFloatArrayArray8784 = null;
	}

	public void method6419(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub1_8757.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8771 == null) {
			this.anIntArrayArrayArray8771 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8770 == null) {
			this.anIntArrayArrayArray8770 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		this.anIntArrayArrayArray8786[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8769[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8762[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8772[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8771 != null) {
			this.anIntArrayArrayArray8771[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8770 != null) {
			this.anIntArrayArrayArray8770[arg0][arg1] = arg3;
		}
		Class330_Sub16[] var14 = this.aClass330_Sub16ArrayArrayArray8764[arg0][arg1] = new Class330_Sub16[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8761 & 0x20) != 0 && var16 != -1 && var13.method221(var16, -581082045).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) (arg10.anInt651 * -533215263 * -892945375) << 48 | (long) (arg10.anInt650 * -2010008277 * -348036733) << 42 | (long) (arg10.anInt652 * -1037349593 * -576105833) << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8763.method6094(var18); var20 != null; var20 = this.aClass497_8763.method6095(1632506727)) {
				Class330_Sub16 var21 = (Class330_Sub16) var20;
				if (var21.anInt7617 == var16 && var21.aFloat7618 == (float) var17 && var21.aClass77_7615.method925(arg10, 910515191)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub16(this, var16, var17, arg10);
				this.aClass497_8763.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub16) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8755[arg0][arg1] = (byte) (this.aByteArrayArray8755[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8782) {
			this.anInt8782 = arg6.length;
		}
		this.anInt8781 += arg6.length;
	}

	public void method6412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class76 var9 = this.aClass_ra_Sub1_8757.method4782((byte) 0);
		if (this.anInt8781 <= 0 || var9 == null) {
			return;
		}
		this.aClass_ra_Sub1_8757.method4874();
		this.aClass_ra_Sub1_8757.method4853(false);
		this.aClass_ra_Sub1_8757.method4854(false);
		this.aClass_ra_Sub1_8757.method4816(false);
		this.aClass_ra_Sub1_8757.method4815(false);
		this.aClass_ra_Sub1_8757.method4859(0);
		this.aClass_ra_Sub1_8757.method4841(-2);
		this.aClass_ra_Sub1_8757.method4844(null);
		aFloatArray8788[0] = (float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 128.0F * (float) var9.method856());
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = (float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 128.0F * (float) var9.method857());
		aFloatArray8788[6] = 0.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 0.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) var9.method856();
		aFloatArray8788[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) var9.method857();
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		aFloatArray8788[0] = 1.0F;
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = 0.0F;
		aFloatArray8788[6] = 1.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 1.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = 0.0F;
		aFloatArray8788[13] = 0.0F;
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		if ((this.anInt8761 & 0x7) == 0) {
			this.aClass_ra_Sub1_8757.method4854(false);
		} else {
			this.aClass_ra_Sub1_8757.method4854(true);
			this.aClass_ra_Sub1_8757.method4878();
		}
		this.aClass_ra_Sub1_8757.method4869(this.aClass44_8777, this.aClass44_8767, this.aClass44_8778, this.aClass44_8780);
		if (this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8783 * 2) {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(this.anInt8783 * 2);
		} else {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.offset = 0 * -824785231;
		}
		int var10 = 0;
		Class330_Sub46_Sub1 var11 = this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381;
		int var12;
		int var13;
		int var14;
		short[] var15;
		int var16;
		if (this.aClass_ra_Sub1_8757.aBoolean8407) {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.addShort(var15[var16] & 0xFFFF, (byte) 120);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		} else {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.method3742(var15[var16] & 0xFFFF, (short) 2527);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		}
		if (var10 > 0) {
			Class34_Sub1 var17 = new Class34_Sub1(this.aClass_ra_Sub1_8757, 5123, var11.payload, var11.offset * 323600977 * -824785231);
			this.aClass_ra_Sub1_8757.method4837(var17, 4, 0, var10);
		}
	}

	public void method6415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class76 var9 = this.aClass_ra_Sub1_8757.method4782((byte) 0);
		if (this.anInt8781 <= 0 || var9 == null) {
			return;
		}
		this.aClass_ra_Sub1_8757.method4874();
		this.aClass_ra_Sub1_8757.method4853(false);
		this.aClass_ra_Sub1_8757.method4854(false);
		this.aClass_ra_Sub1_8757.method4816(false);
		this.aClass_ra_Sub1_8757.method4815(false);
		this.aClass_ra_Sub1_8757.method4859(0);
		this.aClass_ra_Sub1_8757.method4841(-2);
		this.aClass_ra_Sub1_8757.method4844(null);
		aFloatArray8788[0] = (float) arg2 / ((float) this.anInt6395 * 128.0F * (float) var9.method856());
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = (float) arg2 / ((float) this.anInt6395 * 128.0F * (float) var9.method857());
		aFloatArray8788[6] = 0.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 0.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) var9.method856();
		aFloatArray8788[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) var9.method857();
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		aFloatArray8788[0] = 1.0F;
		aFloatArray8788[1] = 0.0F;
		aFloatArray8788[2] = 0.0F;
		aFloatArray8788[3] = 0.0F;
		aFloatArray8788[4] = 0.0F;
		aFloatArray8788[5] = 0.0F;
		aFloatArray8788[6] = 1.0F;
		aFloatArray8788[7] = 0.0F;
		aFloatArray8788[8] = 0.0F;
		aFloatArray8788[9] = 1.0F;
		aFloatArray8788[10] = 0.0F;
		aFloatArray8788[11] = 0.0F;
		aFloatArray8788[12] = 0.0F;
		aFloatArray8788[13] = 0.0F;
		aFloatArray8788[14] = 0.0F;
		aFloatArray8788[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray8788, 0);
		if ((this.anInt8761 & 0x7) == 0) {
			this.aClass_ra_Sub1_8757.method4854(false);
		} else {
			this.aClass_ra_Sub1_8757.method4854(true);
			this.aClass_ra_Sub1_8757.method4878();
		}
		this.aClass_ra_Sub1_8757.method4869(this.aClass44_8777, this.aClass44_8767, this.aClass44_8778, this.aClass44_8780);
		if (this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8783 * 2) {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(this.anInt8783 * 2);
		} else {
			this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381.offset = 0;
		}
		int var10 = 0;
		Class330_Sub46_Sub1 var11 = this.aClass_ra_Sub1_8757.aClass330_Sub46_Sub1_8381;
		int var12;
		int var13;
		int var14;
		short[] var15;
		int var16;
		if (this.aClass_ra_Sub1_8757.aBoolean8407) {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.addShort(var15[var16] & 0xFFFF, (byte) 98);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		} else {
			for (var12 = arg4; var12 < arg6; var12++) {
				var13 = var12 * this.anInt6397 + arg3;
				for (var14 = arg3; var14 < arg5; var14++) {
					if (arg7[var14 - arg3][var12 - arg4]) {
						var15 = this.aShortArrayArray8756[var13];
						if (var15 != null) {
							for (var16 = 0; var16 < var15.length; var16++) {
								var11.method3742(var15[var16] & 0xFFFF, (short) 8682);
								var10++;
							}
						}
					}
					var13++;
				}
			}
		}
		if (var10 > 0) {
			Class34_Sub1 var17 = new Class34_Sub1(this.aClass_ra_Sub1_8757, 5123, var11.payload, var11.offset);
			this.aClass_ra_Sub1_8757.method4837(var17, 4, 0, var10);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.h(IILClass_na;)LClass_na;")
	public Class_na h(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8755[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 * -1684509909 * 550173571 >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
		Class_na_Sub2 var5 = (Class_na_Sub2) arg2;
		Class_na_Sub2 var6;
		if (var5 != null && var5.method3531(var4, var4)) {
			var6 = var5;
			var5.method3532();
		} else {
			var6 = new Class_na_Sub2(this.aClass_ra_Sub1_8757, var4, var4);
		}
		var6.method3530(0, 0, var4, var4);
		this.method6437(var6, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_xa_Sub1.w(IILClass_na;)LClass_na;")
	public Class_na w(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8755[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 >> this.aClass_ra_Sub1_8757.anInt8296;
		Class_na_Sub2 var5 = (Class_na_Sub2) arg2;
		Class_na_Sub2 var6;
		if (var5 != null && var5.method3531(var4, var4)) {
			var6 = var5;
			var5.method3532();
		} else {
			var6 = new Class_na_Sub2(this.aClass_ra_Sub1_8757, var4, var4);
		}
		var6.method3530(0, 0, var4, var4);
		this.method6437(var6, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_xa_Sub1.ay(LClass_na;IIIIZ)V")
	public void ay(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method662(arg0, var7, var8);
		}
	}

	public void method6422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub1_8757.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8771 == null) {
			this.anIntArrayArrayArray8771 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8770 == null) {
			this.anIntArrayArrayArray8770 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		this.anIntArrayArrayArray8786[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8769[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8762[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8772[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8771 != null) {
			this.anIntArrayArrayArray8771[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8770 != null) {
			this.anIntArrayArrayArray8770[arg0][arg1] = arg3;
		}
		Class330_Sub16[] var14 = this.aClass330_Sub16ArrayArrayArray8764[arg0][arg1] = new Class330_Sub16[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8761 & 0x20) != 0 && var16 != -1 && var13.method221(var16, 1506652255).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) (arg10.anInt651 * -533215263 * -892945375) << 48 | (long) (arg10.anInt650 * -2010008277 * -348036733) << 42 | (long) (arg10.anInt652 * -1037349593 * -576105833) << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8763.method6094(var18); var20 != null; var20 = this.aClass497_8763.method6095(1719602318)) {
				Class330_Sub16 var21 = (Class330_Sub16) var20;
				if (var21.anInt7617 == var16 && var21.aFloat7618 == (float) var17 && var21.aClass77_7615.method925(arg10, 143744024)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub16(this, var16, var17, arg10);
				this.aClass497_8763.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub16) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8755[arg0][arg1] = (byte) (this.aByteArrayArray8755[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8782) {
			this.anInt8782 = arg6.length;
		}
		this.anInt8781 += arg6.length;
	}

	public void method6426(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8765.method5878(new Class330_Sub8(this.aClass_ra_Sub1_8757, this, arg0, arg1), (short) 8192);
	}

	@ObfuscatedName("Class_xa_Sub1.ai(LClass_na;IIIIZ)V")
	public void ai(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method667(arg0, var7, var8);
		}
	}

	public void method6429(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8765.method5878(new Class330_Sub8(this.aClass_ra_Sub1_8757, this, arg0, arg1), (short) 8192);
	}

	@ObfuscatedName("Class_xa_Sub1.NA(LClass_na;IIIIZ)V")
	public void NA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296;
			this.aClass58_8773.method662(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.as(LClass_na;IIIIZ)V")
	public void as(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method667(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub1.aj(LClass_na;IIIIZ)V")
	public void aj(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass58_8773 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub1_8757.anInt8410 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub1_8757.anInt8379 >> 8) >> this.aClass_ra_Sub1_8757.anInt8296 * -1431655765 * 3;
			this.aClass58_8773.method667(arg0, var7, var8);
		}
	}
}
