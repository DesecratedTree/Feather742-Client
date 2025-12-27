package deob;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class_xa_Sub2 extends Class_xa {

	public static int anInt8789 = 74;

	public static int anInt8819 = 1;

	public float aFloat8799 = Float.MAX_VALUE;

	public float aFloat8800 = -3.4028235E38F;

	public Class471 aClass471_8804 = new Class471();

	public int[] anIntArray8828 = new int[1];

	public int[] anIntArray8829 = new int[1];

	public int[] anIntArray8831 = new int[1];

	public Class_ra_Sub2 aClass_ra_Sub2_8791;

	public int anInt8792;

	public int anInt8790;

	public int anInt8794;

	public int anInt8795;

	public int[][][] anIntArrayArrayArray8793;

	public Class330_Sub37[][][] aClass330_Sub37ArrayArrayArray8801;

	public int[][][] anIntArrayArrayArray8813;

	public int[][][] anIntArrayArrayArray8805;

	public int[][][] anIntArrayArrayArray8802;

	public int[][][] anIntArrayArrayArray8814;

	public short[][] aShortArrayArray8798;

	public byte[][] aByteArrayArray8808;

	public byte[][] aByteArrayArray8803;

	public float[][] aFloatArrayArray8822;

	public float[][] aFloatArrayArray8817;

	public float[][] aFloatArrayArray8820;

	public Class497 aClass497_8821;

	public Class183 aClass183_8809;

	public int anInt8796;

	public int anInt8815;

	public int anInt8816;

	public int anInt8818;

	public int anInt8823;

	public int anInt8827;

	public int anInt8830;

	public long aLong8824;

	public long aLong8825;

	public long aLong8826;

	public Class184 aClass184_8810;

	public Interface9_Impl1 anInterface9_Impl1_8806;

	public Interface9_Impl1 anInterface9_Impl1_8812;

	public Class330[] aClass330Array8797;

	public Class330[] aClass330Array8811;

	public int[][][] anIntArrayArrayArray8807;

	public Class_xa_Sub2(Class_ra_Sub2 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass_ra_Sub2_8791 = arg0;
		this.anInt8792 = this.anInt6396 - 2;
		this.anInt8790 = 0x1 << this.anInt8792;
		this.anInt8794 = arg1;
		this.anInt8795 = arg2;
		this.anIntArrayArrayArray8793 = new int[arg3][arg4][];
		this.aClass330_Sub37ArrayArrayArray8801 = new Class330_Sub37[arg3][arg4][];
		this.anIntArrayArrayArray8813 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8805 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8802 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8814 = new int[arg3][arg4][];
		this.aShortArrayArray8798 = new short[arg3 * arg4][];
		this.aByteArrayArray8808 = new byte[arg3][arg4];
		this.aByteArrayArray8803 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8822 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		this.aFloatArrayArray8817 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		this.aFloatArrayArray8820 = new float[this.anInt6397 + 1][this.anInt6393 + 1];
		for (int var9 = 0; var9 <= this.anInt6393; var9++) {
			for (int var10 = 0; var10 <= this.anInt6397; var10++) {
				int var11 = this.anIntArrayArray6394[var10][var9];
				if ((float) var11 < this.aFloat8799) {
					this.aFloat8799 = var11;
				}
				if ((float) var11 > this.aFloat8800) {
					this.aFloat8800 = var11;
				}
				if (var10 > 0 && var9 > 0 && var10 < this.anInt6397 && var9 < this.anInt6393) {
					int var12 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
					int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
					float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
					this.aFloatArrayArray8822[var10][var9] = (float) var12 * var14;
					this.aFloatArrayArray8817[var10][var9] = (float) (-arg7 * 2) * var14;
					this.aFloatArrayArray8820[var10][var9] = (float) var13 * var14;
				}
			}
		}
		this.aFloat8799--;
		this.aFloat8800++;
		this.aClass497_8821 = new Class497(128);
		if ((this.anInt8795 & 0x10) != 0) {
			this.aClass183_8809 = new Class183(this.aClass_ra_Sub2_8791, this);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.LA(III)V")
	public void LA(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8803[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8803[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub2.n(III)V")
	public void n(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8803[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8803[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6426(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8804.method5878(new Class330_Sub27(this.aClass_ra_Sub2_8791, this, arg0, arg1), (short) 8192);
	}

	@ObfuscatedName("Class_xa_Sub2.SA()V")
	public void SA() {
		if (this.anInt8815 <= 0) {
			this.aClass183_8809 = null;
			this.method6438();
			return;
		}
		byte[][] var1 = new byte[this.anInt6397 + 1][this.anInt6393 + 1];
		int var2;
		int var3;
		for (var2 = 1; var2 < this.anInt6397; var2++) {
			for (var3 = 1; var3 < this.anInt6393; var3++) {
				var1[var2][var3] = (byte) ((this.aByteArrayArray8803[var2 - 1][var3] >> 2) + (this.aByteArrayArray8803[var2 + 1][var3] >> 3) + (this.aByteArrayArray8803[var2][var3 - 1] >> 2) + (this.aByteArrayArray8803[var2][var3 + 1] >> 3) + (this.aByteArrayArray8803[var2][var3] >> 1));
			}
		}
		this.aClass330Array8797 = new Class330[this.aClass497_8821.method6096(1533245757)];
		this.aClass497_8821.method6093(this.aClass330Array8797, -87003541);
		for (var2 = 0; var2 < this.aClass330Array8797.length; var2++) {
			((Class330_Sub37) this.aClass330Array8797[var2]).method3537(this.anInt8815);
		}
		this.anInt8827 = 20;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anInt8827 += 4;
		}
		if ((this.anInt8795 & 0x7) != 0) {
			this.anInt8827 += 12;
		}
		this.aLong8826 = this.aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (this.anInt8815 * 4 + this.anInt8815 * this.anInt8827));
		this.aLong8824 = this.aLong8826;
		this.aLong8825 = this.aLong8826 + (long) (this.anInt8815 * 4);
		Class330_Sub37[] var18 = new Class330_Sub37[this.anInt8815];
		var3 = Class385.method4425(this.anInt8815 / 4, (short) 17119);
		if (var3 < 1) {
			var3 = 1;
		}
		Class497 var4 = new Class497(var3);
		Class330_Sub37[] var5 = new Class330_Sub37[this.anInt8818];
		int var6;
		int var7;
		for (var6 = 0; var6 < this.anInt6397; var6++) {
			for (var7 = 0; var7 < this.anInt6393; var7++) {
				this.method6441(var6, var7, var1, var5, var4, var18);
			}
		}
		Class330_Sub37 var19;
		for (var6 = 0; var6 < this.anInt8796; var6++) {
			var19 = var18[var6];
			if (var19 != null) {
				var19.method3536(var6);
			}
		}
		for (var6 = 0; var6 < this.anInt6397; var6++) {
			for (var7 = 0; var7 < this.anInt6393; var7++) {
				short[] var8 = this.aShortArrayArray8798[var7 * this.anInt6397 + var6];
				if (var8 != null) {
					int var9 = 0;
					int var10 = 0;
					while (var10 < var8.length) {
						int var11 = var8[var10++] & 0xFFFF;
						int var12 = var8[var10++] & 0xFFFF;
						int var13 = var8[var10++] & 0xFFFF;
						Class330_Sub37 var14 = var18[var11];
						Class330_Sub37 var15 = var18[var12];
						Class330_Sub37 var16 = var18[var13];
						Class330_Sub37 var17 = null;
						if (var14 != null) {
							var14.method3540(var6, var7, var9);
							var17 = var14;
						}
						if (var15 != null) {
							var15.method3540(var6, var7, var9);
							if (var17 == null || var15.aLong3341 < var17.aLong3341) {
								var17 = var15;
							}
						}
						if (var16 != null) {
							var16.method3540(var6, var7, var9);
							if (var17 == null || var16.aLong3341 < var17.aLong3341) {
								var17 = var16;
							}
						}
						if (var17 != null) {
							if (var14 != null) {
								var17.method3536(var11);
							}
							if (var15 != null) {
								var17.method3536(var12);
							}
							if (var16 != null) {
								var17.method3536(var13);
							}
							var17.method3540(var6, var7, var9);
						}
						var9++;
					}
				}
			}
		}
		this.anInt8823 = 0;
		for (var6 = 0; var6 < this.aClass330Array8797.length; var6++) {
			var19 = (Class330_Sub37) this.aClass330Array8797[var6];
			if (var19.anInt7738 > 0) {
				this.aClass330Array8797[this.anInt8823++] = var19;
			}
		}
		this.aClass330Array8811 = new Class330[this.anInt8823];
		long[] var21 = new long[this.anInt8823];
		for (var7 = 0; var7 < this.anInt8823; var7++) {
			Class330_Sub37 var20 = (Class330_Sub37) this.aClass330Array8797[var7];
			var21[var7] = var20.aLong3341;
			this.aClass330Array8811[var7] = var20;
		}
		Class330_Sub40_Sub1.method3584(var21, this.aClass330Array8811, (byte) 16);
		this.method6440();
	}

	public void method6438() {
		if ((this.anInt8794 & 0x2) == 0) {
			this.anIntArrayArrayArray8805 = null;
			this.anIntArrayArrayArray8813 = null;
			this.anIntArrayArrayArray8802 = null;
		}
		this.anIntArrayArrayArray8807 = null;
		this.anIntArrayArrayArray8814 = null;
		this.anIntArrayArrayArray8793 = null;
		this.aClass330_Sub37ArrayArrayArray8801 = null;
		this.aByteArrayArray8803 = null;
		this.aClass497_8821 = null;
		this.aClass330Array8797 = null;
		this.aFloatArrayArray8820 = null;
		this.aFloatArrayArray8817 = null;
		this.aFloatArrayArray8822 = null;
	}

	public void method6423(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.aClass330Array8811 == null) {
			return;
		}
		int var7 = arg2 + arg2 + 1;
		int var24 = var7 * var7;
		if (this.anIntArray8831.length < var24) {
			this.anIntArray8831 = new int[var24];
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
		this.anInt8830 = 0;
		for (int var14 = var8; var14 <= var12; var14++) {
			boolean[] var15 = arg3[var14 - var9];
			for (int var16 = var10; var16 <= var13; var16++) {
				if (var15[var16 - var11]) {
					this.anIntArray8831[this.anInt8830++] = var16 * this.anInt6397 + var14;
				}
			}
		}
		ByteBuffer var25 = this.aClass_ra_Sub2_8791.aByteBuffer8458;
		var25.clear();
		int var26;
		for (var26 = 0; var26 < this.aClass330Array8811.length; var26++) {
			Class330_Sub37 var27 = (Class330_Sub37) this.aClass330Array8811[var26];
			var27.method3535(this.anIntArray8831, this.anInt8830);
		}
		var26 = var25.position();
		Class140 var28 = this.aClass_ra_Sub2_8791.aClass140_8474;
		if (var26 != 0) {
			Interface9_Impl2 var17 = this.aClass_ra_Sub2_8791.method4909(var26 / 2);
			var17.method97(0, var26, this.aClass_ra_Sub2_8791.aLong8459);
			this.aClass_ra_Sub2_8791.method5013();
			this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
			this.aClass_ra_Sub2_8791.method4979(var17);
			var28.method1618(Class249.aClass249_2630);
			if (this.aClass_ra_Sub2_8791.anInt8578 > 0) {
				var28.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -this.aClass_ra_Sub2_8791.aFloat8580);
				var28.aClass260_1549.method2553((float) (this.aClass_ra_Sub2_8791.anInt8476 >> 16 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8791.anInt8476 >> 8 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8791.anInt8476 >> 0 & 0xFF) / 255.0F);
				this.aClass_ra_Sub2_8791.aClass249_8576.method2510(this.aClass_ra_Sub2_8791.aClass249_8472);
				this.aClass_ra_Sub2_8791.aClass249_8576.method2501();
				var28.aClass261_1548.method2589(this.aClass_ra_Sub2_8791.aClass249_8576);
				var28.aClass261_1548.method2583(1.0F / (this.aClass_ra_Sub2_8791.aFloat8581 - this.aClass_ra_Sub2_8791.aFloat8580));
			} else {
				var28.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				var28.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
			}
			int var18;
			int var19;
			Class330_Sub37 var20;
			Class56 var22;
			if ((this.anInt8795 & 0x7) == 0) {
				var18 = 0;
				for (var19 = 0; var19 < this.aClass330Array8811.length; var19++) {
					var20 = (Class330_Sub37) this.aClass330Array8811[var19];
					if (var20.anInt7746 != 0) {
						if (this.aClass_ra_Sub2_8791.aBoolean8571) {
							this.aClass_ra_Sub2_8791.dz(0, var20.aClass77_7745);
							var28.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, (float) this.aClass_ra_Sub2_8791.anInt8573 + (float) var20.aClass77_7745.anInt651 / 255.0F * (float) var20.aClass77_7745.anInt650);
							var28.aClass261_1551.method2583(1.0F / (float) var20.aClass77_7745.anInt650);
							var28.aClass260_1547.method2553((float) (var20.aClass77_7745.anInt652 >> 16 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 >> 8 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 >> 0 & 0xFF) / 255.0F);
						} else {
							var28.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
							var28.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
						}
						boolean var30 = false;
						if (var20.anInt7740 == -1) {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
						} else {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.aClass188_8552.method2093(var20.anInt7740);
							var22 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, 103695321);
							var30 = !Class376.method4368(var22.aByte525, -1575787075);
						}
						this.aClass_ra_Sub2_8791.method5081(1, var20.anInterface9_Impl1_7743);
						this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
						var28.aClass249_1546.method2486(1.0F / var20.aFloat7741, 1.0F / var20.aFloat7741, 1.0F, 1.0F);
						var28.anInt1555 = var20.anInt7747;
						var28.anInt1556 = var20.anInt7748 - var20.anInt7747 + 1;
						var28.anInt1557 = var18;
						var28.anInt1552 = var20.anInt7746 / 3;
						var28.method1619(var30);
						var18 += var20.anInt7746;
					}
				}
			} else {
				var28.aClass260_1542.method2553(this.aClass_ra_Sub2_8791.aFloatArray8525[0], this.aClass_ra_Sub2_8791.aFloatArray8525[1], this.aClass_ra_Sub2_8791.aFloatArray8525[2]);
				var28.aClass260_1544.method2553(this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8530, this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8500, this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8532);
				var28.aClass260_1543.method2553(-this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8530, -this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8500, -this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8532);
				var28.aClass260_1553.method2553(this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8530, this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8500, this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8532);
				var18 = 0;
				for (var19 = 0; var19 < this.aClass330Array8811.length; var19++) {
					var20 = (Class330_Sub37) this.aClass330Array8811[var19];
					if (var20.anInt7746 > 0) {
						if (this.aClass_ra_Sub2_8791.aBoolean8571) {
							this.aClass_ra_Sub2_8791.dz(0, var20.aClass77_7745);
							float var21 = 0.15F;
							var28.aClass261_1551.method2588(0.0F, 1.0F / ((float) var20.aClass77_7745.anInt650 * var21), 0.0F, 256.0F / ((float) var20.aClass77_7745.anInt650 * var21));
							var28.aClass260_1547.method2553((float) (var20.aClass77_7745.anInt652 >> 16 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 >> 8 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 >> 0 & 0xFF) / 255.0F);
						} else {
							var28.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
							var28.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
						}
						byte var29 = 11;
						if (var20.anInt7740 == -1) {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
						} else {
							var22 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, -297731703);
							var29 = var22.aByte525;
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.aClass188_8552.method2093(var20.anInt7740);
							var28.method1617(var22);
						}
						this.aClass_ra_Sub2_8791.method5081(1, var20.anInterface9_Impl1_7743);
						this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
						var28.aClass249_1546.method2486(1.0F / var20.aFloat7741, 1.0F / var20.aFloat7741, 1.0F, 1.0F);
						var28.anInt1555 = var20.anInt7747;
						var28.anInt1556 = var20.anInt7748 - var20.anInt7747 + 1;
						var28.anInt1557 = var18;
						var28.anInt1552 = var20.anInt7746 / 3;
						switch(var29) {
							case 1:
								var28.aClass260_1536.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
								if (this.aClass_ra_Sub2_8791.aBoolean8571) {
									var28.method1636();
								} else {
									var28.method1621(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass_ra_Sub2_8791.aBoolean8601 || (this.anInt8795 & 0x8) == 0 || !this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8564.method1956(220396046)) {
									var28.method1620(0);
								} else {
									Class164_Sub1_Sub2 var31 = this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8564;
									if (var29 == 2) {
										var31 = this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8563;
									}
									var31.aClass249_9454.method2510(this.aClass_ra_Sub2_8791.aClass249_8493);
									var31.aClass249_9465.method2486(1.0F / (var20.aFloat7741 * (float) var20.aClass77_7745.anInt653), 1.0F / (var20.aFloat7741 * (float) var20.aClass77_7745.anInt653), 1.0F, 1.0F);
									var31.aClass260_9463.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
									Class56 var23 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, -1259117841);
									var31.anInt9459 = var23.aByte526;
									var31.anInt9474 = var20.anInt7747;
									var31.anInt9475 = var20.anInt7748 - var20.anInt7747 + 1;
									var31.anInt9476 = var18;
									var31.anInt9449 = var20.anInt7746 / 3;
									var31.aClass261_9467.method2584(var28.aClass261_1551);
									var31.aClass260_9469.method2582(var28.aClass260_1547);
									var31.aClass261_9471.method2584(var28.aClass261_1548);
									var31.aClass260_9473.method2582(var28.aClass260_1549);
									var31.method1959((short) 15420);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass_ra_Sub2_8791.aBoolean8571) {
									var28.method1640();
								} else {
									var28.method1620(0);
								}
								break;
							case 6:
								var28.method1619(!Class376.method4368(var29, -1871807413));
								break;
							case 7:
								var28.aClass260_1536.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
								var28.aClass249_1554.method2516();
								var28.anInterface11_Impl1_1550 = this.aClass_ra_Sub2_8791.method5012();
								var28.method1622(0);
						}
						var18 += var20.anInt7746;
					}
				}
			}
		}
		if (this.aClass183_8809 == null) {
			return;
		}
		this.aClass_ra_Sub2_8791.method4970(1);
		this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
		this.aClass_ra_Sub2_8791.method5081(1, this.anInterface9_Impl1_8806);
		this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
		this.aClass183_8809.method2066(var28, arg0, arg1, arg2, arg3, arg4);
	}

	public void method6415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		if (this.anInt8815 <= 0) {
			return;
		}
		Interface9_Impl2 var9 = this.aClass_ra_Sub2_8791.method4909(this.anInt8816);
		int var10 = 0;
		int var11 = 32767;
		int var12 = -32768;
		ByteBuffer var13 = this.aClass_ra_Sub2_8791.aByteBuffer8458;
		var13.clear();
		for (int var14 = arg4; var14 < arg6; var14++) {
			int var15 = var14 * this.anInt6397 + arg3;
			for (int var16 = arg3; var16 < arg5; var16++) {
				if (arg7[var16 - arg3][var14 - arg4]) {
					short[] var17 = this.aShortArrayArray8798[var15];
					if (var17 != null) {
						for (int var18 = 0; var18 < var17.length; var18++) {
							int var19 = var17[var18] & 0xFFFF;
							if (var19 > var12) {
								var12 = var19;
							}
							if (var19 < var11) {
								var11 = var19;
							}
							var13.putShort((short) var19);
							var10++;
						}
					}
				}
				var15++;
			}
		}
		var9.method97(0, var13.position(), this.aClass_ra_Sub2_8791.aLong8459);
		if (var10 <= 0) {
			return;
		}
		this.aClass_ra_Sub2_8791.method5013();
		Class140 var20 = this.aClass_ra_Sub2_8791.aClass140_8474;
		this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
		this.aClass_ra_Sub2_8791.method5081(1, this.anInterface9_Impl1_8806);
		this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
		this.aClass_ra_Sub2_8791.method4979(var9);
		this.aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
		float var21 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method856();
		float var22 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method857();
		Class247 var23 = new Class247();
		Class247 var24 = new Class247();
		var23.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		var24.method2463((float) arg2 / ((float) this.anInt6395 * 256.0F), (float) -arg2 / ((float) this.anInt6395 * 256.0F), 1.0F / (this.aFloat8800 - this.aFloat8799));
		var24.method2474((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat8799 / (this.aFloat8800 - this.aFloat8799));
		var24.method2468(2.0F / var21, 2.0F / var22, 1.0F);
		var24.method2474(-1.0F, -1.0F, 0.0F);
		this.aClass_ra_Sub2_8791.aClass247_8513.method2478(var23, var24);
		this.aClass_ra_Sub2_8791.aClass249_8576.method2508(this.aClass_ra_Sub2_8791.aClass247_8513);
		this.aClass_ra_Sub2_8791.ci(this.aClass_ra_Sub2_8791.aClass249_8576);
		var20.method1618(Class249.aClass249_2630);
		var20.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
		var20.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
		var20.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
		var20.aClass249_1546.method2516();
		var20.anInt1555 = var11;
		var20.anInt1556 = var12 - var11 + 1;
		var20.anInt1557 = 0;
		var20.anInt1552 = var10 / 3;
		if (this.aClass_ra_Sub2_8791.aBoolean8519) {
			this.aClass_ra_Sub2_8791.RA(false);
			var20.method1619(false);
			this.aClass_ra_Sub2_8791.RA(true);
		} else {
			var20.method1619(false);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.w(IILClass_na;)LClass_na;")
	public Class_na w(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8808[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 >> this.aClass_ra_Sub2_8791.anInt8536;
		Class_na_Sub1 var5 = (Class_na_Sub1) arg2;
		Class_na_Sub1 var6;
		if (var5 != null && var5.method3528(var4, var4)) {
			var6 = var5;
			var5.method3525();
		} else {
			var6 = new Class_na_Sub1(this.aClass_ra_Sub2_8791, var4, var4);
		}
		var6.method3524(0, 0, var4, var4);
		this.method6439(var6, arg0, arg1);
		return var6;
	}

	public void method6439(Class_na_Sub1 arg0, int arg1, int arg2) {
		int[] var4 = this.anIntArrayArrayArray8813[arg1][arg2];
		int[] var5 = this.anIntArrayArrayArray8805[arg1][arg2];
		int var6 = var4.length;
		if (this.anIntArray8828.length < var6) {
			this.anIntArray8828 = new int[var6];
			this.anIntArray8829 = new int[var6];
		}
		int var7;
		for (var7 = 0; var7 < var6; var7++) {
			this.anIntArray8828[var7] = var4[var7] >> this.aClass_ra_Sub2_8791.anInt8536;
			this.anIntArray8829[var7] = var5[var7] >> this.aClass_ra_Sub2_8791.anInt8536;
		}
		var7 = 0;
		while (var7 < var6) {
			int var8 = this.anIntArray8828[var7];
			int var9 = this.anIntArray8829[var7++];
			int var10 = this.anIntArray8828[var7];
			int var11 = this.anIntArray8829[var7++];
			int var12 = this.anIntArray8828[var7];
			int var13 = this.anIntArray8829[var7++];
			if ((var8 - var10) * (var11 - var13) - (var11 - var9) * (var12 - var10) > 0) {
				arg0.method3527(var9, var11, var13, var8, var10, var12);
			}
		}
	}

	public boolean method6418(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			return this.aClass183_8809.method2070(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.UA(LClass_na;IIIIZ)V")
	public void UA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			this.aClass183_8809.method2068(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.NA(LClass_na;IIIIZ)V")
	public void NA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536;
			this.aClass183_8809.method2069(arg0, var7, var8);
		}
	}

	public void method6420(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8804.method5878(new Class330_Sub27(this.aClass_ra_Sub2_8791, this, arg0, arg1), (short) 8192);
	}

	public boolean method6424(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 == null || arg0 == null) {
			return false;
		} else {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			return this.aClass183_8809.method2070(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.ai(LClass_na;IIIIZ)V")
	public void ai(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2068(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.b(III)V")
	public void b(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8803[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8803[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6419(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub2_8791.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8807 == null) {
			this.anIntArrayArrayArray8807 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8793 == null) {
			this.anIntArrayArrayArray8793 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		this.anIntArrayArrayArray8813[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8805[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8802[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8814[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anIntArrayArrayArray8807[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8793 != null) {
			this.anIntArrayArrayArray8793[arg0][arg1] = arg3;
		}
		Class330_Sub37[] var14 = this.aClass330_Sub37ArrayArrayArray8801[arg0][arg1] = new Class330_Sub37[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8795 & 0x20) != 0 && var16 != -1 && var13.method221(var16, 2097268655).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) (arg10.anInt651 * -533215263 * -892945375) << 48 | (long) (arg10.anInt650 * -2010008277 * -348036733) << 42 | (long) (arg10.anInt652 * -1037349593 * -576105833) << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8821.method6094(var18); var20 != null; var20 = this.aClass497_8821.method6095(1111331497)) {
				Class330_Sub37 var21 = (Class330_Sub37) var20;
				if (var21.anInt7740 == var16 && var21.aFloat7741 == (float) var17 && var21.aClass77_7745.method925(arg10, -759438844)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub37(this, var16, var17, arg10);
				this.aClass497_8821.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub37) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8808[arg0][arg1] = (byte) (this.aByteArrayArray8808[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8818) {
			this.anInt8818 = arg6.length;
		}
		this.anInt8815 += arg6.length;
	}

	public void method6411(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = new int[var16 * 3];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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

	public void method6422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub2_8791.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8807 == null) {
			this.anIntArrayArrayArray8807 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8793 == null) {
			this.anIntArrayArrayArray8793 = new int[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321][];
		}
		this.anIntArrayArrayArray8813[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8805[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8802[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8814[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anIntArrayArrayArray8807[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8793 != null) {
			this.anIntArrayArrayArray8793[arg0][arg1] = arg3;
		}
		Class330_Sub37[] var14 = this.aClass330_Sub37ArrayArrayArray8801[arg0][arg1] = new Class330_Sub37[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8795 & 0x20) != 0 && var16 != -1 && var13.method221(var16, 1108732967).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) (arg10.anInt651 * -533215263 * -892945375) << 48 | (long) (arg10.anInt650 * -2010008277 * -348036733) << 42 | (long) (arg10.anInt652 * -1037349593 * -576105833) << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8821.method6094(var18); var20 != null; var20 = this.aClass497_8821.method6095(145775766)) {
				Class330_Sub37 var21 = (Class330_Sub37) var20;
				if (var21.anInt7740 == var16 && var21.aFloat7741 == (float) var17 && var21.aClass77_7745.method925(arg10, 657239472)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub37(this, var16, var17, arg10);
				this.aClass497_8821.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub37) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8808[arg0][arg1] = (byte) (this.aByteArrayArray8808[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8818) {
			this.anInt8818 = arg6.length;
		}
		this.anInt8815 += arg6.length;
	}

	@ObfuscatedName("Class_xa_Sub2.l(III)V")
	public void l(int arg0, int arg1, int arg2) {
		if ((this.aByteArrayArray8803[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8803[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub2.d()V")
	public void d() {
		if (this.anInt8815 <= 0) {
			this.aClass183_8809 = null;
			this.method6438();
			return;
		}
		byte[][] var1 = new byte[this.anInt6397 * -1250378663 * 1972554729 + 1][this.anInt6393 * -1805935063 * 24567321 + 1];
		int var2;
		int var3;
		for (var2 = 1; var2 < this.anInt6397 * -1250378663 * 1972554729; var2++) {
			for (var3 = 1; var3 < this.anInt6393 * -1805935063 * 24567321; var3++) {
				var1[var2][var3] = (byte) ((this.aByteArrayArray8803[var2 - 1][var3] >> 2) + (this.aByteArrayArray8803[var2 + 1][var3] >> 3) + (this.aByteArrayArray8803[var2][var3 - 1] >> 2) + (this.aByteArrayArray8803[var2][var3 + 1] >> 3) + (this.aByteArrayArray8803[var2][var3] >> 1));
			}
		}
		this.aClass330Array8797 = new Class330[this.aClass497_8821.method6096(-2067187467)];
		this.aClass497_8821.method6093(this.aClass330Array8797, -1217156764);
		for (var2 = 0; var2 < this.aClass330Array8797.length; var2++) {
			((Class330_Sub37) this.aClass330Array8797[var2]).method3537(this.anInt8815);
		}
		this.anInt8827 = 20;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anInt8827 += 4;
		}
		if ((this.anInt8795 & 0x7) != 0) {
			this.anInt8827 += 12;
		}
		this.aLong8826 = this.aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (this.anInt8815 * 4 + this.anInt8815 * this.anInt8827));
		this.aLong8824 = this.aLong8826;
		this.aLong8825 = this.aLong8826 + (long) (this.anInt8815 * 4);
		Class330_Sub37[] var18 = new Class330_Sub37[this.anInt8815];
		var3 = Class385.method4425(this.anInt8815 / 4, (short) 26192);
		if (var3 < 1) {
			var3 = 1;
		}
		Class497 var4 = new Class497(var3);
		Class330_Sub37[] var5 = new Class330_Sub37[this.anInt8818];
		int var6;
		int var7;
		for (var6 = 0; var6 < this.anInt6397 * -1250378663 * 1972554729; var6++) {
			for (var7 = 0; var7 < this.anInt6393 * -1805935063 * 24567321; var7++) {
				this.method6441(var6, var7, var1, var5, var4, var18);
			}
		}
		Class330_Sub37 var19;
		for (var6 = 0; var6 < this.anInt8796; var6++) {
			var19 = var18[var6];
			if (var19 != null) {
				var19.method3536(var6);
			}
		}
		for (var6 = 0; var6 < this.anInt6397 * -1250378663 * 1972554729; var6++) {
			for (var7 = 0; var7 < this.anInt6393 * -1805935063 * 24567321; var7++) {
				short[] var8 = this.aShortArrayArray8798[var7 * this.anInt6397 * -1250378663 * 1972554729 + var6];
				if (var8 != null) {
					int var9 = 0;
					int var10 = 0;
					while (var10 < var8.length) {
						int var11 = var8[var10++] & 0xFFFF;
						int var12 = var8[var10++] & 0xFFFF;
						int var13 = var8[var10++] & 0xFFFF;
						Class330_Sub37 var14 = var18[var11];
						Class330_Sub37 var15 = var18[var12];
						Class330_Sub37 var16 = var18[var13];
						Class330_Sub37 var17 = null;
						if (var14 != null) {
							var14.method3540(var6, var7, var9);
							var17 = var14;
						}
						if (var15 != null) {
							var15.method3540(var6, var7, var9);
							if (var17 == null || var15.aLong3341 * -1420004262915178823L * -6154793640677333111L < var17.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
								var17 = var15;
							}
						}
						if (var16 != null) {
							var16.method3540(var6, var7, var9);
							if (var17 == null || var16.aLong3341 * -1420004262915178823L * -6154793640677333111L < var17.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
								var17 = var16;
							}
						}
						if (var17 != null) {
							if (var14 != null) {
								var17.method3536(var11);
							}
							if (var15 != null) {
								var17.method3536(var12);
							}
							if (var16 != null) {
								var17.method3536(var13);
							}
							var17.method3540(var6, var7, var9);
						}
						var9++;
					}
				}
			}
		}
		this.anInt8823 = 0;
		for (var6 = 0; var6 < this.aClass330Array8797.length; var6++) {
			var19 = (Class330_Sub37) this.aClass330Array8797[var6];
			if (var19.anInt7738 > 0) {
				this.aClass330Array8797[this.anInt8823++] = var19;
			}
		}
		this.aClass330Array8811 = new Class330[this.anInt8823];
		long[] var21 = new long[this.anInt8823];
		for (var7 = 0; var7 < this.anInt8823; var7++) {
			Class330_Sub37 var20 = (Class330_Sub37) this.aClass330Array8797[var7];
			var21[var7] = var20.aLong3341 * -1420004262915178823L * -6154793640677333111L;
			this.aClass330Array8811[var7] = var20;
		}
		Class330_Sub40_Sub1.method3584(var21, this.aClass330Array8811, (byte) 16);
		this.method6440();
	}

	public void method6425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		Interface_ma var13 = this.aClass_ra_Sub2_8791.anInterface_ma4227;
		if (arg5 != null && this.anIntArrayArrayArray8807 == null) {
			this.anIntArrayArrayArray8807 = new int[this.anInt6397][this.anInt6393][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8793 == null) {
			this.anIntArrayArrayArray8793 = new int[this.anInt6397][this.anInt6393][];
		}
		this.anIntArrayArrayArray8813[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8805[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8802[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8814[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anIntArrayArrayArray8807[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8793 != null) {
			this.anIntArrayArrayArray8793[arg0][arg1] = arg3;
		}
		Class330_Sub37[] var14 = this.aClass330_Sub37ArrayArrayArray8801[arg0][arg1] = new Class330_Sub37[arg6.length];
		for (int var15 = 0; var15 < arg6.length; var15++) {
			int var16 = arg8[var15];
			int var17 = arg9[var15];
			if ((this.anInt8795 & 0x20) != 0 && var16 != -1 && var13.method221(var16, -1288860881).aBoolean533) {
				var17 = 128;
				var16 = -1;
			}
			long var18 = (long) arg10.anInt651 << 48 | (long) arg10.anInt650 << 42 | (long) arg10.anInt652 << 28 | (long) (var17 << 14) | (long) var16;
			Class330 var20;
			for (var20 = this.aClass497_8821.method6094(var18); var20 != null; var20 = this.aClass497_8821.method6095(974601910)) {
				Class330_Sub37 var21 = (Class330_Sub37) var20;
				if (var21.anInt7740 == var16 && var21.aFloat7741 == (float) var17 && var21.aClass77_7745.method925(arg10, -1229239605)) {
					break;
				}
			}
			if (var20 == null) {
				var14[var15] = new Class330_Sub37(this, var16, var17, arg10);
				this.aClass497_8821.method6097(var14[var15], var18);
			} else {
				var14[var15] = (Class330_Sub37) var20;
			}
		}
		if (arg11) {
			this.aByteArrayArray8808[arg0][arg1] = (byte) (this.aByteArrayArray8808[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8818) {
			this.anInt8818 = arg6.length;
		}
		this.anInt8815 += arg6.length;
	}

	public void method6421(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.aClass330Array8811 == null) {
			return;
		}
		int var7 = arg2 + arg2 + 1;
		int var24 = var7 * var7;
		if (this.anIntArray8831.length < var24) {
			this.anIntArray8831 = new int[var24];
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
		if (var12 > this.anInt6397 * -1250378663 * 1972554729 - 1) {
			var12 = this.anInt6397 * -1250378663 * 1972554729 - 1;
		}
		int var13 = arg1 + arg2;
		if (var13 > this.anInt6393 * -1805935063 * 24567321 - 1) {
			var13 = this.anInt6393 * -1805935063 * 24567321 - 1;
		}
		this.anInt8830 = 0;
		for (int var14 = var8; var14 <= var12; var14++) {
			boolean[] var15 = arg3[var14 - var9];
			for (int var16 = var10; var16 <= var13; var16++) {
				if (var15[var16 - var11]) {
					this.anIntArray8831[this.anInt8830++] = var16 * this.anInt6397 * -1250378663 * 1972554729 + var14;
				}
			}
		}
		ByteBuffer var25 = this.aClass_ra_Sub2_8791.aByteBuffer8458;
		var25.clear();
		int var26;
		for (var26 = 0; var26 < this.aClass330Array8811.length; var26++) {
			Class330_Sub37 var27 = (Class330_Sub37) this.aClass330Array8811[var26];
			var27.method3535(this.anIntArray8831, this.anInt8830);
		}
		var26 = var25.position();
		Class140 var28 = this.aClass_ra_Sub2_8791.aClass140_8474;
		if (var26 != 0) {
			Interface9_Impl2 var17 = this.aClass_ra_Sub2_8791.method4909(var26 / 2);
			var17.method97(0, var26, this.aClass_ra_Sub2_8791.aLong8459);
			this.aClass_ra_Sub2_8791.method5013();
			this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
			this.aClass_ra_Sub2_8791.method4979(var17);
			var28.method1618(Class249.aClass249_2630);
			if (this.aClass_ra_Sub2_8791.anInt8578 > 0) {
				var28.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -this.aClass_ra_Sub2_8791.aFloat8580);
				var28.aClass260_1549.method2553((float) (this.aClass_ra_Sub2_8791.anInt8476 >> 16 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8791.anInt8476 >> 8 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8791.anInt8476 >> 0 & 0xFF) / 255.0F);
				this.aClass_ra_Sub2_8791.aClass249_8576.method2510(this.aClass_ra_Sub2_8791.aClass249_8472);
				this.aClass_ra_Sub2_8791.aClass249_8576.method2501();
				var28.aClass261_1548.method2589(this.aClass_ra_Sub2_8791.aClass249_8576);
				var28.aClass261_1548.method2583(1.0F / (this.aClass_ra_Sub2_8791.aFloat8581 - this.aClass_ra_Sub2_8791.aFloat8580));
			} else {
				var28.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				var28.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
			}
			int var18;
			int var19;
			Class330_Sub37 var20;
			Class56 var22;
			if ((this.anInt8795 & 0x7) == 0) {
				var18 = 0;
				for (var19 = 0; var19 < this.aClass330Array8811.length; var19++) {
					var20 = (Class330_Sub37) this.aClass330Array8811[var19];
					if (var20.anInt7746 * -1431655765 * 3 != 0) {
						if (this.aClass_ra_Sub2_8791.aBoolean8571) {
							this.aClass_ra_Sub2_8791.dz(0, var20.aClass77_7745);
							var28.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, (float) this.aClass_ra_Sub2_8791.anInt8573 + (float) (var20.aClass77_7745.anInt651 * -533215263 * -892945375) / 255.0F * (float) (var20.aClass77_7745.anInt650 * -2010008277 * -348036733));
							var28.aClass261_1551.method2583(1.0F / (float) (var20.aClass77_7745.anInt650 * -2010008277 * -348036733));
							var28.aClass260_1547.method2553((float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 16 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 8 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 0 & 0xFF) / 255.0F);
						} else {
							var28.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
							var28.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
						}
						boolean var30 = false;
						if (var20.anInt7740 == -1) {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
						} else {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.aClass188_8552.method2093(var20.anInt7740);
							var22 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, -873506084);
							var30 = !Class376.method4368(var22.aByte525, -1828380143);
						}
						this.aClass_ra_Sub2_8791.method5081(1, var20.anInterface9_Impl1_7743);
						this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
						var28.aClass249_1546.method2486(1.0F / var20.aFloat7741, 1.0F / var20.aFloat7741, 1.0F, 1.0F);
						var28.anInt1555 = var20.anInt7747 * 25568277 * -634746051 * 25568277 * -634746051;
						var28.anInt1556 = var20.anInt7748 - var20.anInt7747 * 25568277 * -634746051 + 1;
						var28.anInt1557 = var18 * -1431655765 * 3;
						var28.anInt1552 = var20.anInt7746 * -1431655765 * 3 / 3;
						var28.method1619(var30);
						var18 += var20.anInt7746 * -1431655765 * 3;
					}
				}
			} else {
				var28.aClass260_1542.method2553(this.aClass_ra_Sub2_8791.aFloatArray8525[0], this.aClass_ra_Sub2_8791.aFloatArray8525[1], this.aClass_ra_Sub2_8791.aFloatArray8525[2]);
				var28.aClass260_1544.method2553(this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8530, this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8500, this.aClass_ra_Sub2_8791.aFloat8489 * this.aClass_ra_Sub2_8791.aFloat8532);
				var28.aClass260_1543.method2553(-this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8530, -this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8500, -this.aClass_ra_Sub2_8791.aFloat8535 * this.aClass_ra_Sub2_8791.aFloat8532);
				var28.aClass260_1553.method2553(this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8530, this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8500, this.aClass_ra_Sub2_8791.aFloat8533 * this.aClass_ra_Sub2_8791.aFloat8532);
				var18 = 0;
				for (var19 = 0; var19 < this.aClass330Array8811.length; var19++) {
					var20 = (Class330_Sub37) this.aClass330Array8811[var19];
					if (var20.anInt7746 * -1431655765 * 3 > 0) {
						if (this.aClass_ra_Sub2_8791.aBoolean8571) {
							this.aClass_ra_Sub2_8791.dz(0, var20.aClass77_7745);
							float var21 = 0.15F;
							var28.aClass261_1551.method2588(0.0F, 1.0F / ((float) (var20.aClass77_7745.anInt650 * -2010008277 * -348036733) * var21), 0.0F, 256.0F / ((float) (var20.aClass77_7745.anInt650 * -2010008277 * -348036733) * var21));
							var28.aClass260_1547.method2553((float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 16 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 8 & 0xFF) / 255.0F, (float) (var20.aClass77_7745.anInt652 * -1037349593 * -576105833 >> 0 & 0xFF) / 255.0F);
						} else {
							var28.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
							var28.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
						}
						byte var29 = 11;
						if (var20.anInt7740 == -1) {
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
						} else {
							var22 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, -1391109253);
							var29 = var22.aByte525;
							var28.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.aClass188_8552.method2093(var20.anInt7740);
							var28.method1617(var22);
						}
						this.aClass_ra_Sub2_8791.method5081(1, var20.anInterface9_Impl1_7743);
						this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
						var28.aClass249_1546.method2486(1.0F / var20.aFloat7741, 1.0F / var20.aFloat7741, 1.0F, 1.0F);
						var28.anInt1555 = var20.anInt7747 * 25568277 * -634746051 * 25568277 * -634746051;
						var28.anInt1556 = var20.anInt7748 - var20.anInt7747 * 25568277 * -634746051 + 1;
						var28.anInt1557 = var18 * -1431655765 * 3;
						var28.anInt1552 = var20.anInt7746 * -1431655765 * 3 / 3;
						switch(var29) {
							case 1:
								var28.aClass260_1536.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
								if (this.aClass_ra_Sub2_8791.aBoolean8571) {
									var28.method1636();
								} else {
									var28.method1621(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass_ra_Sub2_8791.aBoolean8601 || (this.anInt8795 & 0x8) == 0 || !this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8564.method1956(-368309109)) {
									var28.method1620(0);
								} else {
									Class164_Sub1_Sub2 var31 = this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8564;
									if (var29 == 2) {
										var31 = this.aClass_ra_Sub2_8791.aClass164_Sub1_Sub2_8563;
									}
									var31.aClass249_9454.method2510(this.aClass_ra_Sub2_8791.aClass249_8493);
									var31.aClass249_9465.method2486(1.0F / (var20.aFloat7741 * (float) (var20.aClass77_7745.anInt653 * -1441052161 * -1132415489)), 1.0F / (var20.aFloat7741 * (float) (var20.aClass77_7745.anInt653 * -1441052161 * -1132415489)), 1.0F, 1.0F);
									var31.aClass260_9463.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
									Class56 var23 = this.aClass_ra_Sub2_8791.anInterface_ma4227.method221(var20.anInt7740, 2005138726);
									var31.anInt9459 = var23.aByte526 * -967254259 * -456194107;
									var31.anInt9474 = var20.anInt7747 * 25568277 * -634746051 * 25568277 * -634746051;
									var31.anInt9475 = (var20.anInt7748 - var20.anInt7747 * 25568277 * -634746051 + 1) * -1024039475 * 488443653;
									var31.anInt9476 = var18 * -463050011 * 354435821;
									var31.anInt9449 = var20.anInt7746 * -1431655765 * 3 / 3 * -1604072367 * -404685647;
									var31.aClass261_9467.method2584(var28.aClass261_1551);
									var31.aClass260_9469.method2582(var28.aClass260_1547);
									var31.aClass261_9471.method2584(var28.aClass261_1548);
									var31.aClass260_9473.method2582(var28.aClass260_1549);
									var31.method1959((short) 7495);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass_ra_Sub2_8791.aBoolean8571) {
									var28.method1640();
								} else {
									var28.method1620(0);
								}
								break;
							case 6:
								var28.method1619(!Class376.method4368(var29, -1558748913));
								break;
							case 7:
								var28.aClass260_1536.method2553(this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8791.aClass249_8473.aFloatArray2631[14]);
								var28.aClass249_1554.method2516();
								var28.anInterface11_Impl1_1550 = this.aClass_ra_Sub2_8791.method5012();
								var28.method1622(0);
						}
						var18 += var20.anInt7746 * -1431655765 * 3;
					}
				}
			}
		}
		if (this.aClass183_8809 == null) {
			return;
		}
		this.aClass_ra_Sub2_8791.method4970(1);
		this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
		this.aClass_ra_Sub2_8791.method5081(1, this.anInterface9_Impl1_8806);
		this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
		this.aClass183_8809.method2066(var28, arg0, arg1, arg2, arg3, arg4);
	}

	public void method6412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		if (this.anInt8815 <= 0) {
			return;
		}
		Interface9_Impl2 var9 = this.aClass_ra_Sub2_8791.method4909(this.anInt8816);
		int var10 = 0;
		int var11 = 32767;
		int var12 = -32768;
		ByteBuffer var13 = this.aClass_ra_Sub2_8791.aByteBuffer8458;
		var13.clear();
		for (int var14 = arg4; var14 < arg6; var14++) {
			int var15 = var14 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
			for (int var16 = arg3; var16 < arg5; var16++) {
				if (arg7[var16 - arg3][var14 - arg4]) {
					short[] var17 = this.aShortArrayArray8798[var15];
					if (var17 != null) {
						for (int var18 = 0; var18 < var17.length; var18++) {
							int var19 = var17[var18] & 0xFFFF;
							if (var19 > var12) {
								var12 = var19;
							}
							if (var19 < var11) {
								var11 = var19;
							}
							var13.putShort((short) var19);
							var10++;
						}
					}
				}
				var15++;
			}
		}
		var9.method97(0, var13.position(), this.aClass_ra_Sub2_8791.aLong8459);
		if (var10 <= 0) {
			return;
		}
		this.aClass_ra_Sub2_8791.method5013();
		Class140 var20 = this.aClass_ra_Sub2_8791.aClass140_8474;
		this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
		this.aClass_ra_Sub2_8791.method5081(1, this.anInterface9_Impl1_8806);
		this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
		this.aClass_ra_Sub2_8791.method4979(var9);
		this.aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
		float var21 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method856();
		float var22 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method857();
		Class247 var23 = new Class247();
		Class247 var24 = new Class247();
		var23.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		var24.method2463((float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 256.0F), (float) -arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 256.0F), 1.0F / (this.aFloat8800 - this.aFloat8799));
		var24.method2474((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat8799 / (this.aFloat8800 - this.aFloat8799));
		var24.method2468(2.0F / var21, 2.0F / var22, 1.0F);
		var24.method2474(-1.0F, -1.0F, 0.0F);
		this.aClass_ra_Sub2_8791.aClass247_8513.method2478(var23, var24);
		this.aClass_ra_Sub2_8791.aClass249_8576.method2508(this.aClass_ra_Sub2_8791.aClass247_8513);
		this.aClass_ra_Sub2_8791.ci(this.aClass_ra_Sub2_8791.aClass249_8576);
		var20.method1618(Class249.aClass249_2630);
		var20.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
		var20.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
		var20.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
		var20.aClass249_1546.method2516();
		var20.anInt1555 = var11 * 25568277 * -634746051;
		var20.anInt1556 = var12 - var11 + 1;
		var20.anInt1557 = 0 * -1431655765 * 3;
		var20.anInt1552 = var10 / 3;
		if (this.aClass_ra_Sub2_8791.aBoolean8519) {
			this.aClass_ra_Sub2_8791.RA(false);
			var20.method1619(false);
			this.aClass_ra_Sub2_8791.RA(true);
		} else {
			var20.method1619(false);
		}
	}

	public void method6414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = new int[var16 * 3];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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

	@ObfuscatedName("Class_xa_Sub2.h(IILClass_na;)LClass_na;")
	public Class_na h(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8808[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 * -1684509909 * 550173571 >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
		Class_na_Sub1 var5 = (Class_na_Sub1) arg2;
		Class_na_Sub1 var6;
		if (var5 != null && var5.method3528(var4, var4)) {
			var6 = var5;
			var5.method3525();
		} else {
			var6 = new Class_na_Sub1(this.aClass_ra_Sub2_8791, var4, var4);
		}
		var6.method3524(0, 0, var4, var4);
		this.method6439(var6, arg0, arg1);
		return var6;
	}

	@ObfuscatedName("Class_xa_Sub2.y(IILClass_na;)LClass_na;")
	public Class_na y(int arg0, int arg1, Class_na arg2) {
		if ((this.aByteArrayArray8808[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		int var4 = this.anInt6395 * -1684509909 * 550173571 >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
		Class_na_Sub1 var5 = (Class_na_Sub1) arg2;
		Class_na_Sub1 var6;
		if (var5 != null && var5.method3528(var4, var4)) {
			var6 = var5;
			var5.method3525();
		} else {
			var6 = new Class_na_Sub1(this.aClass_ra_Sub2_8791, var4, var4);
		}
		var6.method3524(0, 0, var4, var4);
		this.method6439(var6, arg0, arg1);
		return var6;
	}

	public void method6440() {
		this.anInterface9_Impl1_8806 = this.aClass_ra_Sub2_8791.method4976(false);
		this.anInterface9_Impl1_8806.method142(this.anInt8796 * 4, 4);
		this.anInterface9_Impl1_8806.method97(0, this.anInt8796 * 4, this.aLong8826);
		this.anInterface9_Impl1_8812 = this.aClass_ra_Sub2_8791.method4976(false);
		this.anInterface9_Impl1_8812.method142(this.anInt8796 * this.anInt8827, this.anInt8827);
		this.anInterface9_Impl1_8812.method97(0, this.anInt8796 * this.anInt8827, this.aLong8826 + (long) (this.anInt8815 * 4));
		this.aClass_ra_Sub2_8791.anUnsafe8461.freeMemory(this.aLong8826);
		if ((this.anInt8795 & 0x7) == 0) {
			if (this.anIntArrayArrayArray8807 == null) {
				this.aClass184_8810 = this.aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864 }), new Class193(Class191.aClass191_1862) });
			} else {
				this.aClass184_8810 = this.aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1861 }), new Class193(Class191.aClass191_1862) });
			}
		} else if (this.anIntArrayArrayArray8807 == null) {
			this.aClass184_8810 = this.aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1872 }), new Class193(Class191.aClass191_1862) });
		} else {
			this.aClass184_8810 = this.aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1861, Class191.aClass191_1872 }), new Class193(Class191.aClass191_1862) });
		}
		for (int var1 = 0; var1 < this.anInt8823; var1++) {
			Class330_Sub37 var2 = (Class330_Sub37) this.aClass330Array8797[var1];
			var2.method3538(this.anInt8796);
		}
		if (this.aClass183_8809 != null) {
			this.aClass183_8809.method2067();
		}
		this.method6438();
	}

	@ObfuscatedName("Class_xa_Sub2.ac(LClass_na;IIIIZ)V")
	public void ac(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2069(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.al(LClass_na;IIIIZ)V")
	public void al(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2069(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.ay(LClass_na;IIIIZ)V")
	public void ay(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2069(arg0, var7, var8);
		}
	}

	public void method6427(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8804.method5878(new Class330_Sub27(this.aClass_ra_Sub2_8791, this, arg0, arg1), (short) 8192);
	}

	public void method6429(Class330_Sub14 arg0, int[] arg1) {
		this.aClass471_8804.method5878(new Class330_Sub27(this.aClass_ra_Sub2_8791, this, arg0, arg1), (short) 8192);
	}

	public void method6428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		if (this.anInt8815 <= 0) {
			return;
		}
		Interface9_Impl2 var9 = this.aClass_ra_Sub2_8791.method4909(this.anInt8816);
		int var10 = 0;
		int var11 = 32767;
		int var12 = -32768;
		ByteBuffer var13 = this.aClass_ra_Sub2_8791.aByteBuffer8458;
		var13.clear();
		for (int var14 = arg4; var14 < arg6; var14++) {
			int var15 = var14 * this.anInt6397 * -1250378663 * 1972554729 + arg3;
			for (int var16 = arg3; var16 < arg5; var16++) {
				if (arg7[var16 - arg3][var14 - arg4]) {
					short[] var17 = this.aShortArrayArray8798[var15];
					if (var17 != null) {
						for (int var18 = 0; var18 < var17.length; var18++) {
							int var19 = var17[var18] & 0xFFFF;
							if (var19 > var12) {
								var12 = var19;
							}
							if (var19 < var11) {
								var11 = var19;
							}
							var13.putShort((short) var19);
							var10++;
						}
					}
				}
				var15++;
			}
		}
		var9.method97(0, var13.position(), this.aClass_ra_Sub2_8791.aLong8459);
		if (var10 <= 0) {
			return;
		}
		this.aClass_ra_Sub2_8791.method5013();
		Class140 var20 = this.aClass_ra_Sub2_8791.aClass140_8474;
		this.aClass_ra_Sub2_8791.method5081(0, this.anInterface9_Impl1_8812);
		this.aClass_ra_Sub2_8791.method5081(1, this.anInterface9_Impl1_8806);
		this.aClass_ra_Sub2_8791.method4978(this.aClass184_8810);
		this.aClass_ra_Sub2_8791.method4979(var9);
		this.aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
		float var21 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method856();
		float var22 = (float) this.aClass_ra_Sub2_8791.method4782((byte) 0).method857();
		Class247 var23 = new Class247();
		Class247 var24 = new Class247();
		var23.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		var24.method2463((float) arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 256.0F), (float) -arg2 / ((float) (this.anInt6395 * -1684509909 * 550173571) * 256.0F), 1.0F / (this.aFloat8800 - this.aFloat8799));
		var24.method2474((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat8799 / (this.aFloat8800 - this.aFloat8799));
		var24.method2468(2.0F / var21, 2.0F / var22, 1.0F);
		var24.method2474(-1.0F, -1.0F, 0.0F);
		this.aClass_ra_Sub2_8791.aClass247_8513.method2478(var23, var24);
		this.aClass_ra_Sub2_8791.aClass249_8576.method2508(this.aClass_ra_Sub2_8791.aClass247_8513);
		this.aClass_ra_Sub2_8791.ci(this.aClass_ra_Sub2_8791.aClass249_8576);
		var20.method1618(Class249.aClass249_2630);
		var20.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
		var20.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
		var20.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
		var20.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8791.anInterface11_Impl3_8551;
		var20.aClass249_1546.method2516();
		var20.anInt1555 = var11 * 25568277 * -634746051;
		var20.anInt1556 = var12 - var11 + 1;
		var20.anInt1557 = 0 * -1431655765 * 3;
		var20.anInt1552 = var10 / 3;
		if (this.aClass_ra_Sub2_8791.aBoolean8519) {
			this.aClass_ra_Sub2_8791.RA(false);
			var20.method1619(false);
			this.aClass_ra_Sub2_8791.RA(true);
		} else {
			var20.method1619(false);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.as(LClass_na;IIIIZ)V")
	public void as(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2068(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.aj(LClass_na;IIIIZ)V")
	public void aj(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (this.aClass183_8809 != null && arg0 != null) {
			int var7 = arg1 - (arg2 * this.aClass_ra_Sub2_8791.anInt8541 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			int var8 = arg3 - (arg2 * this.aClass_ra_Sub2_8791.anInt8599 >> 8) >> this.aClass_ra_Sub2_8791.anInt8536 * -1431655765 * 3;
			this.aClass183_8809.method2068(arg0, var7, var8);
		}
	}

	@ObfuscatedName("Class_xa_Sub2.c()V")
	public void c() {
		if (this.anInt8815 <= 0) {
			this.aClass183_8809 = null;
			this.method6438();
			return;
		}
		byte[][] var1 = new byte[this.anInt6397 * -1250378663 * 1972554729 + 1][this.anInt6393 * -1805935063 * 24567321 + 1];
		int var2;
		int var3;
		for (var2 = 1; var2 < this.anInt6397 * -1250378663 * 1972554729; var2++) {
			for (var3 = 1; var3 < this.anInt6393 * -1805935063 * 24567321; var3++) {
				var1[var2][var3] = (byte) ((this.aByteArrayArray8803[var2 - 1][var3] >> 2) + (this.aByteArrayArray8803[var2 + 1][var3] >> 3) + (this.aByteArrayArray8803[var2][var3 - 1] >> 2) + (this.aByteArrayArray8803[var2][var3 + 1] >> 3) + (this.aByteArrayArray8803[var2][var3] >> 1));
			}
		}
		this.aClass330Array8797 = new Class330[this.aClass497_8821.method6096(-1212412297)];
		this.aClass497_8821.method6093(this.aClass330Array8797, 1134841397);
		for (var2 = 0; var2 < this.aClass330Array8797.length; var2++) {
			((Class330_Sub37) this.aClass330Array8797[var2]).method3537(this.anInt8815);
		}
		this.anInt8827 = 20;
		if (this.anIntArrayArrayArray8807 != null) {
			this.anInt8827 += 4;
		}
		if ((this.anInt8795 & 0x7) != 0) {
			this.anInt8827 += 12;
		}
		this.aLong8826 = this.aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (this.anInt8815 * 4 + this.anInt8815 * this.anInt8827));
		this.aLong8824 = this.aLong8826;
		this.aLong8825 = this.aLong8826 + (long) (this.anInt8815 * 4);
		Class330_Sub37[] var18 = new Class330_Sub37[this.anInt8815];
		var3 = Class385.method4425(this.anInt8815 / 4, (short) 4437);
		if (var3 < 1) {
			var3 = 1;
		}
		Class497 var4 = new Class497(var3);
		Class330_Sub37[] var5 = new Class330_Sub37[this.anInt8818];
		int var6;
		int var7;
		for (var6 = 0; var6 < this.anInt6397 * -1250378663 * 1972554729; var6++) {
			for (var7 = 0; var7 < this.anInt6393 * -1805935063 * 24567321; var7++) {
				this.method6441(var6, var7, var1, var5, var4, var18);
			}
		}
		Class330_Sub37 var19;
		for (var6 = 0; var6 < this.anInt8796; var6++) {
			var19 = var18[var6];
			if (var19 != null) {
				var19.method3536(var6);
			}
		}
		for (var6 = 0; var6 < this.anInt6397 * -1250378663 * 1972554729; var6++) {
			for (var7 = 0; var7 < this.anInt6393 * -1805935063 * 24567321; var7++) {
				short[] var8 = this.aShortArrayArray8798[var7 * this.anInt6397 * -1250378663 * 1972554729 + var6];
				if (var8 != null) {
					int var9 = 0;
					int var10 = 0;
					while (var10 < var8.length) {
						int var11 = var8[var10++] & 0xFFFF;
						int var12 = var8[var10++] & 0xFFFF;
						int var13 = var8[var10++] & 0xFFFF;
						Class330_Sub37 var14 = var18[var11];
						Class330_Sub37 var15 = var18[var12];
						Class330_Sub37 var16 = var18[var13];
						Class330_Sub37 var17 = null;
						if (var14 != null) {
							var14.method3540(var6, var7, var9);
							var17 = var14;
						}
						if (var15 != null) {
							var15.method3540(var6, var7, var9);
							if (var17 == null || var15.aLong3341 * -1420004262915178823L * -6154793640677333111L < var17.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
								var17 = var15;
							}
						}
						if (var16 != null) {
							var16.method3540(var6, var7, var9);
							if (var17 == null || var16.aLong3341 * -1420004262915178823L * -6154793640677333111L < var17.aLong3341 * -1420004262915178823L * -6154793640677333111L) {
								var17 = var16;
							}
						}
						if (var17 != null) {
							if (var14 != null) {
								var17.method3536(var11);
							}
							if (var15 != null) {
								var17.method3536(var12);
							}
							if (var16 != null) {
								var17.method3536(var13);
							}
							var17.method3540(var6, var7, var9);
						}
						var9++;
					}
				}
			}
		}
		this.anInt8823 = 0;
		for (var6 = 0; var6 < this.aClass330Array8797.length; var6++) {
			var19 = (Class330_Sub37) this.aClass330Array8797[var6];
			if (var19.anInt7738 > 0) {
				this.aClass330Array8797[this.anInt8823++] = var19;
			}
		}
		this.aClass330Array8811 = new Class330[this.anInt8823];
		long[] var21 = new long[this.anInt8823];
		for (var7 = 0; var7 < this.anInt8823; var7++) {
			Class330_Sub37 var20 = (Class330_Sub37) this.aClass330Array8797[var7];
			var21[var7] = var20.aLong3341 * -1420004262915178823L * -6154793640677333111L;
			this.aClass330Array8811[var7] = var20;
		}
		Class330_Sub40_Sub1.method3584(var21, this.aClass330Array8811, (byte) 16);
		this.method6440();
	}

	public void method6441(int arg0, int arg1, byte[][] arg2, Class330_Sub37[] arg3, Class497 arg4, Class330_Sub37[] arg5) {
		if (this.anIntArrayArrayArray8802[arg0][arg1] == null) {
			return;
		}
		Class330_Sub37[] var7 = this.aClass330_Sub37ArrayArrayArray8801[arg0][arg1];
		int[] var8 = this.anIntArrayArrayArray8813[arg0][arg1];
		int[] var9 = this.anIntArrayArrayArray8805[arg0][arg1];
		int[] var10 = this.anIntArrayArrayArray8814[arg0][arg1];
		int[] var11 = this.anIntArrayArrayArray8802[arg0][arg1];
		int[] var12 = this.anIntArrayArrayArray8793 == null ? null : this.anIntArrayArrayArray8793[arg0][arg1];
		int[] var13 = this.anIntArrayArrayArray8807 == null ? null : this.anIntArrayArrayArray8807[arg0][arg1];
		if (var10 == null) {
			var10 = var11;
		}
		float var14 = this.aFloatArrayArray8822[arg0][arg1];
		float var15 = this.aFloatArrayArray8817[arg0][arg1];
		float var16 = this.aFloatArrayArray8820[arg0][arg1];
		float var17 = this.aFloatArrayArray8822[arg0][arg1 + 1];
		float var18 = this.aFloatArrayArray8817[arg0][arg1 + 1];
		float var19 = this.aFloatArrayArray8820[arg0][arg1 + 1];
		float var20 = this.aFloatArrayArray8822[arg0 + 1][arg1 + 1];
		float var21 = this.aFloatArrayArray8817[arg0 + 1][arg1 + 1];
		float var22 = this.aFloatArrayArray8820[arg0 + 1][arg1 + 1];
		float var23 = this.aFloatArrayArray8822[arg0 + 1][arg1];
		float var24 = this.aFloatArrayArray8817[arg0 + 1][arg1];
		float var25 = this.aFloatArrayArray8820[arg0 + 1][arg1];
		int var26 = arg2[arg0][arg1] & 0xFF;
		int var27 = arg2[arg0][arg1 + 1] & 0xFF;
		int var28 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		int var29 = arg2[arg0 + 1][arg1] & 0xFF;
		int var30 = 0;
		int var33;
		label184: for (int var31 = 0; var31 < var11.length; var31++) {
			Class330_Sub37 var32 = var7[var31];
			for (var33 = 0; var33 < var30; var33++) {
				if (arg3[var33] == var32) {
					continue label184;
				}
			}
			arg3[var30++] = var32;
		}
		short[] var60 = this.aShortArrayArray8798[arg1 * this.anInt6397 + arg0] = new short[var11.length];
		for (int var61 = 0; var61 < var11.length; var61++) {
			var33 = (arg0 << this.anInt6396) + var8[var61];
			int var34 = (arg1 << this.anInt6396) + var9[var61];
			int var35 = var33 >> this.anInt8792;
			int var36 = var34 >> this.anInt8792;
			int var37 = var11[var61];
			int var38 = var10[var61];
			int var39 = var12 == null ? 0 : var12[var61];
			long var40 = (long) var38 << 48 | (long) var37 << 32 | (long) (var35 << 16) | (long) var36;
			int var42 = var8[var61];
			int var43 = var9[var61];
			byte var44 = 74;
			int var45 = 0;
			float var46 = 1.0F;
			float var47;
			float var48;
			float var49;
			float var54;
			int var62;
			if (var42 == 0 && var43 == 0) {
				var47 = var14;
				var48 = var15;
				var49 = var16;
				var62 = var44 - var26;
			} else if (var42 == 0 && var43 == this.anInt6395) {
				var47 = var17;
				var48 = var18;
				var49 = var19;
				var62 = var44 - var27;
			} else if (var42 == this.anInt6395 && var43 == this.anInt6395) {
				var47 = var20;
				var48 = var21;
				var49 = var22;
				var62 = var44 - var28;
			} else if (var42 == this.anInt6395 && var43 == 0) {
				var47 = var23;
				var48 = var24;
				var49 = var25;
				var62 = var44 - var29;
			} else {
				float var50 = (float) var42 / (float) this.anInt6395;
				float var51 = (float) var43 / (float) this.anInt6395;
				float var52 = var14 + (var23 - var14) * var50;
				float var53 = var15 + (var24 - var15) * var50;
				var54 = var16 + (var25 - var16) * var50;
				float var55 = var17 + (var20 - var17) * var50;
				float var56 = var18 + (var21 - var18) * var50;
				float var57 = var19 + (var22 - var19) * var50;
				var47 = var52 + (var55 - var52) * var51;
				var48 = var53 + (var56 - var53) * var51;
				var49 = var54 + (var57 - var54) * var51;
				int var58 = var26 + ((var29 - var26) * var42 >> this.anInt6396);
				int var59 = var27 + ((var28 - var27) * var42 >> this.anInt6396);
				var62 = var44 - (var58 + ((var59 - var58) * var43 >> this.anInt6396));
			}
			if (var37 != -1) {
				int var63 = (var37 & 0x7F) * var62 >> 7;
				if (var63 < 2) {
					var63 = 2;
				} else if (var63 > 126) {
					var63 = 126;
				}
				var45 = Console.anIntArray4265[var37 & 0xFF80 | var63];
				if ((this.anInt8795 & 0x7) == 0) {
					var46 = this.aClass_ra_Sub2_8791.aFloatArray8525[0] * var47 + this.aClass_ra_Sub2_8791.aFloatArray8525[1] * var48 + this.aClass_ra_Sub2_8791.aFloatArray8525[2] * var49;
					var46 = this.aClass_ra_Sub2_8791.aFloat8533 + var46 * (var46 > 0.0F ? this.aClass_ra_Sub2_8791.aFloat8489 : this.aClass_ra_Sub2_8791.aFloat8535);
				}
			}
			Class330 var65 = null;
			if ((var33 & this.anInt8790 - 1) == 0 && (var34 & this.anInt8790 - 1) == 0) {
				var65 = arg4.method6094(var40);
			}
			int var64;
			int var66;
			if (var65 == null) {
				if (var38 == var37) {
					var66 = var45;
				} else {
					int var67 = (var38 & 0x7F) * var62 >> 7;
					if (var67 < 2) {
						var67 = 2;
					} else if (var67 > 126) {
						var67 = 126;
					}
					var66 = Console.anIntArray4265[var38 & 0xFF80 | var67];
					if ((this.anInt8795 & 0x7) == 0) {
						float var10000 = this.aClass_ra_Sub2_8791.aFloatArray8525[0] * var47 + this.aClass_ra_Sub2_8791.aFloatArray8525[1] * var48 + this.aClass_ra_Sub2_8791.aFloatArray8525[2] * var49;
						var54 = this.aClass_ra_Sub2_8791.aFloat8533 + var46 * (var46 > 0.0F ? this.aClass_ra_Sub2_8791.aFloat8489 : this.aClass_ra_Sub2_8791.aFloat8535);
						int var71 = var66 >> 16 & 0xFF;
						int var73 = var66 >> 8 & 0xFF;
						int var74 = var66 & 0xFF;
						var71 = (int) ((float) var71 * var54);
						if (var71 < 0) {
							var71 = 0;
						} else if (var71 > 255) {
							var71 = 255;
						}
						var73 = (int) ((float) var73 * var54);
						if (var73 < 0) {
							var73 = 0;
						} else if (var73 > 255) {
							var73 = 255;
						}
						var74 = (int) ((float) var74 * var54);
						if (var74 < 0) {
							var74 = 0;
						} else if (var74 > 255) {
							var74 = 255;
						}
						var66 = var71 << 16 | var73 << 8 | var74;
					}
				}
				Unsafe var68 = this.aClass_ra_Sub2_8791.anUnsafe8461;
				var68.putFloat(this.aLong8825, (float) var33);
				this.aLong8825 += 4L;
				var68.putFloat(this.aLong8825, (float) (this.method6416(var33, var34, 485117218) + var39));
				this.aLong8825 += 4L;
				var68.putFloat(this.aLong8825, (float) var34);
				this.aLong8825 += 4L;
				var68.putFloat(this.aLong8825, (float) var33);
				this.aLong8825 += 4L;
				var68.putFloat(this.aLong8825, (float) var34);
				this.aLong8825 += 4L;
				if (this.anIntArrayArrayArray8807 != null) {
					var68.putFloat(this.aLong8825, var13 == null ? 0.0F : (float) (var13[var61] - 1));
					this.aLong8825 += 4L;
				}
				if ((this.anInt8795 & 0x7) != 0) {
					var68.putFloat(this.aLong8825, var47);
					this.aLong8825 += 4L;
					var68.putFloat(this.aLong8825, var48);
					this.aLong8825 += 4L;
					var68.putFloat(this.aLong8825, var49);
					this.aLong8825 += 4L;
				}
				if (this.aClass_ra_Sub2_8791.anInt8591 == 0) {
					int var69 = var66 & 0xFF00FF00;
					int var70 = var69 | var66 >> 16 & 0xFF;
					int var72 = var70 | (var66 & 0xFF) << 16;
					var66 = var72;
				}
				var68.putInt(this.aLong8824, var66 | 0xFF000000);
				this.aLong8824 += 4L;
				var64 = this.anInt8796++;
				var60[var61] = (short) var64;
				if (var37 != -1) {
					arg5[var64] = var7[var61];
				}
				arg4.method6097(new Class330_Sub24(var60[var61]), var40);
			} else {
				var60[var61] = ((Class330_Sub24) var65).aShort7694;
				var64 = var60[var61] & 0xFFFF;
				if (var37 != -1 && var7[var61].aLong3341 < arg5[var64].aLong3341) {
					arg5[var64] = var7[var61];
				}
			}
			for (var66 = 0; var66 < var30; var66++) {
				arg3[var66].method3539(var64, var45, var62, var46);
			}
			this.anInt8816++;
		}
	}

	public void method6413(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		int var16 = arg9.length;
		int[] var17 = new int[var16 * 3];
		int[] var18 = new int[var16 * 3];
		int[] var19 = new int[var16 * 3];
		int[] var20 = new int[var16 * 3];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
			var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
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
}
