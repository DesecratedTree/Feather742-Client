package deob;

import jaclib.memory.Stream;
import jaggl.OpenGL;

public class Class387_Sub2 extends Class387 {

	public static int anInt8086 = 7;

	public static int anInt8088 = 2;

	public static int anInt8090 = 8;

	public static int anInt8091 = 16;

	public static int anInt8137 = 4;

	public static int anInt8139 = 4;

	public static float[] aFloatArray8152 = new float[2];

	public static int anInt8157 = 1;

	public static int[] anIntArray8103 = new int[8];

	public static int[] anIntArray8154 = new int[8];

	public static int[] anIntArray8155 = new int[8];

	public boolean aBoolean8098 = false;

	public boolean aBoolean8153 = false;

	public int anInt8115 = 0;

	public int anInt8130 = 0;

	public int anInt8107 = 0;

	public int anInt8089 = 0;

	public int anInt8116 = 0;

	public boolean aBoolean8132 = true;

	public boolean aBoolean8126 = false;

	public Class_ra_Sub1 aClass_ra_Sub1_8092;

	public int anInt8093;

	public int anInt8094;

	public Class44 aClass44_8125;

	public Class44 aClass44_8128;

	public Class44 aClass44_8127;

	public Class44 aClass44_8105;

	public Class37 aClass37_8087;

	public int[] anIntArray8143;

	public int[] anIntArray8102;

	public int[] anIntArray8110;

	public int[] anIntArray8104;

	public short[] aShortArray8106;

	public Class93[] aClass93Array8135;

	public Class64[] aClass64Array8146;

	public int anInt8147;

	public Class52[] aClass52Array8148;

	public Class40[] aClass40Array8149;

	public short[] aShortArray8108;

	public short[] aShortArray8109;

	public short[] aShortArray8095;

	public byte[] aByteArray8118;

	public float[] aFloatArray8129;

	public float[] aFloatArray8114;

	public short[] modelColors;

	public byte[] aByteArray8136;

	public short[] aShortArray8119;

	public short[] aShortArray8120;

	public short[] aShortArray8121;

	public short[] modelTextures;

	public short[] aShortArray8124;

	public short aShort8096;

	public short aShort8099;

	public short[] aShortArray8144;

	public int[] anIntArray8142;

	public int[][] anIntArrayArray8113;

	public int[][] anIntArrayArray8150;

	public int[][] anIntArrayArray8123;

	public byte aByte8138;

	public static int anInt8101;

	public static int anInt8111;

	public int anInt8133;

	public int anInt8134;

	public static int anInt8158;

	public Class68 aClass68_8112;

	public Interface1 anInterface1_8131;

	public Interface3 anInterface3_8085;

	public short aShort8097;

	public short aShort8100;

	public short aShort8140;

	public short aShort8141;

	public short aShort8145;

	public short aShort8156;

	public static boolean aBoolean8159;

	public static long[] aLongArray8151;

	public Class387_Sub2(Class_ra_Sub1 arg0, Model arg1, int arg2, int arg3, int arg4, int arg5) {
		this.aClass_ra_Sub1_8092 = arg0;
		this.anInt8093 = arg2;
		this.anInt8094 = arg5;
		if (Class41.method573(arg2, arg5)) {
			this.aClass44_8125 = new Class44(null, 5126, 3, 0);
		}
		if (Class41.method559(arg2, arg5)) {
			this.aClass44_8128 = new Class44(null, 5126, 2, 0);
		}
		if (Class41.method562(arg2, arg5)) {
			this.aClass44_8127 = new Class44(null, 5126, 3, 0);
		}
		if (Class41.method558(arg2, arg5)) {
			this.aClass44_8105 = new Class44(null, 5121, 4, 0);
		}
		if (Class41.method560(arg2, arg5)) {
			this.aClass37_8087 = new Class37();
		}
		Interface_ma var7 = arg0.anInterface_ma4227;
		int[] var8 = new int[arg1.anInt904];
		this.anIntArray8143 = new int[arg1.anInt874 + 1];
		for (int var9 = 0; var9 < arg1.anInt904; var9++) {
			if (arg1.aByteArray884 == null || arg1.aByteArray884[var9] != 2) {
				if (arg1.aShortArray896 != null && arg1.aShortArray896[var9] != -1) {
					Class56 var10 = var7.method221(arg1.aShortArray896[var9] & 0xFFFF, -438811300);
					if (((this.anInt8094 & 0x40) == 0 || !var10.aBoolean533) && var10.aBoolean519) {
						continue;
					}
				}
				int var10003 = this.anInt8089 * -1431655765;
				int var10001 = this.anInt8089 * -1431655765;
				this.anInt8089 = (var10003 + 1) * 3;
				var8[var10001] = var9;
				this.anIntArray8143[arg1.aShortArray888[var9]]++;
				this.anIntArray8143[arg1.aShortArray907[var9]]++;
				this.anIntArray8143[arg1.aShortArray883[var9]]++;
			}
		}
		this.anInt8116 = this.anInt8089 * -1431655765;
		long[] var63 = new long[this.anInt8089 * -1431655765];
		boolean var64 = (this.anInt8093 & 0x100) != 0;
		int var12;
		int var14;
		int var19;
		Class56 var22;
		int var68;
		short var76;
		for (int var11 = 0; var11 < this.anInt8089 * -1431655765; var11++) {
			var12 = var8[var11];
			Class56 var13 = null;
			var14 = 0;
			byte var15 = 0;
			byte var16 = 0;
			byte var17 = 0;
			if (arg1.aClass94Array908 != null) {
				boolean var18 = false;
				for (var19 = 0; var19 < arg1.aClass94Array908.length; var19++) {
					Class94 var20 = arg1.aClass94Array908[var19];
					if (var12 == var20.anInt848) {
						Class207 var21 = Class511.method6180(var20.anInt850, (byte) 16);
						if (var21.aBoolean1948) {
							var18 = true;
						}
						if (var21.anInt1950 != -1) {
							var22 = var7.method221(var21.anInt1950, -1471943564);
							if (var22.aClass369_524 == Class369.aClass369_6817) {
								this.aBoolean8098 = true;
							}
						}
					}
				}
				if (var18) {
					var63[var11] = Long.MAX_VALUE;
					this.anInt8116--;
					continue;
				}
			}
			var76 = -1;
			if (arg1.aShortArray896 != null) {
				var76 = arg1.aShortArray896[var12];
				if (var76 != -1) {
					var13 = var7.method221(var76 & 0xFFFF, -1851971027);
					if ((this.anInt8094 & 0x40) != 0 && var13.aBoolean533) {
						var76 = -1;
						var13 = null;
					} else {
						var16 = var13.aByte525;
						var17 = var13.aByte526;
						if (var13.aByte531 != 0 || var13.aByte530 != 0) {
							this.aBoolean8153 = true;
						}
					}
				}
			}
			boolean var77 = arg1.aByteArray876 != null && arg1.aByteArray876[var12] != 0 || var13 != null && var13.aClass369_524 != Class369.aClass369_6818;
			if ((var64 || var77) && arg1.aByteArray885 != null) {
				var14 += arg1.aByteArray885[var12] << 17;
			}
			if (var77) {
				var14 += 65536;
			}
			var14 += (var16 & 0xFF) << 8;
			var14 += var17 & 0xFF;
			var68 = var15 + ((var76 & 0xFFFF) << 16);
			int var69 = var68 + (var11 & 0xFFFF);
			var63[var11] = ((long) var14 << 32) + (long) var69;
			this.aBoolean8098 |= var77;
			this.aBoolean8153 |= var13 != null && (var13.aByte531 != 0 || var13.aByte530 != 0);
		}
		Class390.method4600(var63, var8, (byte) 64);
		this.anInt8115 = arg1.anInt897;
		this.anInt8130 = arg1.anInt874;
		this.anIntArray8102 = arg1.anIntArray875;
		this.anIntArray8110 = arg1.anIntArray889;
		this.anIntArray8104 = arg1.anIntArray877;
		this.aShortArray8106 = arg1.aShortArray879;
		Class45[] var65 = new Class45[this.anInt8130];
		this.aClass93Array8135 = arg1.aClass93Array878;
		this.aClass64Array8146 = arg1.aClass64Array893;
		int var71;
		if (arg1.aClass94Array908 != null) {
			this.anInt8147 = arg1.aClass94Array908.length;
			this.aClass52Array8148 = new Class52[this.anInt8147];
			this.aClass40Array8149 = new Class40[this.anInt8147];
			for (var12 = 0; var12 < this.anInt8147; var12++) {
				Class94 var66 = arg1.aClass94Array908[var12];
				Class207 var70 = Class511.method6180(var66.anInt850, (byte) 65);
				var68 = -1;
				for (var71 = 0; var71 < this.anInt8089 * -1431655765; var71++) {
					if (var8[var71] == var66.anInt848) {
						var68 = var71;
						break;
					}
				}
				var71 = Console.colorArray[arg1.aShortArray873[var66.anInt848] & 0xFFFF] & 0xFFFFFF;
				var71 |= 255 - (arg1.aByteArray876 == null ? 0 : arg1.aByteArray876[var66.anInt848]) << 24;
				this.aClass52Array8148[var12] = new Class52(var68, arg1.aShortArray888[var66.anInt848], arg1.aShortArray907[var66.anInt848], arg1.aShortArray883[var66.anInt848], var70.anInt1945, var70.anInt1946, var70.anInt1950, var70.anInt1941, var70.anInt1947, var70.aBoolean1948, var70.aBoolean1949, var66.anInt849);
				this.aClass40Array8149[var12] = new Class40(var71);
			}
		}
		var12 = this.anInt8089;
		this.aShortArray8108 = new short[var12];
		this.aShortArray8109 = new short[var12];
		this.aShortArray8095 = new short[var12];
		this.aByteArray8118 = new byte[var12];
		this.aFloatArray8129 = new float[var12];
		this.aFloatArray8114 = new float[var12];
		this.modelColors = new short[this.anInt8089 * -1431655765];
		this.aByteArray8136 = new byte[this.anInt8089 * -1431655765];
		this.aShortArray8119 = new short[this.anInt8089 * -1431655765];
		this.aShortArray8120 = new short[this.anInt8089 * -1431655765];
		this.aShortArray8121 = new short[this.anInt8089 * -1431655765];
		this.modelTextures = new short[this.anInt8089 * -1431655765];
		if (arg1.aShortArray892 != null) {
			this.aShortArray8124 = new short[this.anInt8089 * -1431655765];
		}
		this.aShort8096 = (short) arg3;
		this.aShort8099 = (short) arg4;
		this.aShortArray8144 = new short[var12];
		aLongArray8151 = new long[var12];
		int var67 = 0;
		for (var14 = 0; var14 < arg1.anInt874; var14++) {
			var68 = this.anIntArray8143[var14];
			this.anIntArray8143[var14] = var67;
			var67 += var68;
			var65[var14] = new Class45();
		}
		this.anIntArray8143[arg1.anInt874] = var67;
		Class97 var72 = this.method4444(arg1, var8, this.anInt8089 * -1431655765);
		Class39[] var73 = new Class39[arg1.anInt904];
		short var74;
		short var78;
		int var79;
		int var81;
		for (var71 = 0; var71 < arg1.anInt904; var71++) {
			var74 = arg1.aShortArray888[var71];
			var76 = arg1.aShortArray907[var71];
			var78 = arg1.aShortArray883[var71];
			var79 = this.anIntArray8102[var76] - this.anIntArray8102[var74];
			var81 = this.anIntArray8110[var76] - this.anIntArray8110[var74];
			int var83 = this.anIntArray8104[var76] - this.anIntArray8104[var74];
			int var23 = this.anIntArray8102[var78] - this.anIntArray8102[var74];
			int var24 = this.anIntArray8110[var78] - this.anIntArray8110[var74];
			int var25 = this.anIntArray8104[var78] - this.anIntArray8104[var74];
			int var26 = var81 * var25 - var24 * var83;
			int var27 = var83 * var23 - var25 * var79;
			int var28;
			for (var28 = var79 * var24 - var23 * var81; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 0x1) {
				var26 >>= 0x1;
				var27 >>= 0x1;
			}
			int var29 = (int) Math.sqrt((double) (var26 * var26 + var27 * var27 + var28 * var28));
			if (var29 <= 0) {
				var29 = 1;
			}
			var26 = var26 * 256 / var29;
			var27 = var27 * 256 / var29;
			var28 = var28 * 256 / var29;
			byte var30 = arg1.aByteArray884 == null ? 0 : arg1.aByteArray884[var71];
			if (var30 == 0) {
				Class45 var31 = var65[var74];
				var31.anInt446 += var26;
				var31.anInt448 += var27;
				var31.anInt447 += var28;
				var31.anInt445++;
				Class45 var94 = var65[var76];
				var94.anInt446 += var26;
				var94.anInt448 += var27;
				var94.anInt447 += var28;
				var94.anInt445++;
				Class45 var95 = var65[var78];
				var95.anInt446 += var26;
				var95.anInt448 += var27;
				var95.anInt447 += var28;
				var95.anInt445++;
			} else if (var30 == 1) {
				Class39 var96 = var73[var71] = new Class39();
				var96.anInt422 = var26;
				var96.anInt423 = var27;
				var96.anInt421 = var28;
			}
		}
		int var80;
		for (var71 = 0; var71 < this.anInt8089 * -1431655765; var71++) {
			int var75 = var8[var71];
			var80 = arg1.aShortArray873[var75] & 0xFFFF;
			if (arg1.aByteArray887 == null) {
				var19 = -1;
			} else {
				var19 = arg1.aByteArray887[var75];
			}
			if (arg1.aByteArray876 == null) {
				var79 = 0;
			} else {
				var79 = arg1.aByteArray876[var75] & 0xFF;
			}
			short var82 = arg1.aShortArray896 == null ? -1 : arg1.aShortArray896[var75];
			if (var82 != -1 && (this.anInt8094 & 0x40) != 0) {
				var22 = var7.method221(var82 & 0xFFFF, 1002807613);
				if (var22.aBoolean533) {
					var82 = -1;
				}
			}
			float var84 = 0.0F;
			float var86 = 0.0F;
			float var87 = 0.0F;
			float var88 = 0.0F;
			float var89 = 0.0F;
			float var90 = 0.0F;
			byte var91 = 0;
			byte var92 = 0;
			int var93 = 0;
			short var34;
			short var35;
			short var36;
			byte var97;
			if (var82 != -1) {
				if (var19 == -1) {
					var84 = 0.0F;
					var86 = 1.0F;
					var87 = 1.0F;
					var88 = 1.0F;
					var91 = 1;
					var89 = 0.0F;
					var90 = 0.0F;
					var92 = 2;
				} else {
					var19 &= 0xFF;
					var97 = arg1.aByteArray894[var19];
					short var32;
					short var33;
					float var40;
					float var41;
					float var42;
					float var52;
					float var53;
					float var54;
					float var55;
					float var56;
					float var57;
					if (var97 == 0) {
						var32 = arg1.aShortArray888[var75];
						var33 = arg1.aShortArray907[var75];
						var34 = arg1.aShortArray883[var75];
						var35 = arg1.aShortArray895[var19];
						var36 = arg1.aShortArray903[var19];
						short var37 = arg1.aShortArray886[var19];
						float var38 = (float) arg1.anIntArray875[var35];
						float var39 = (float) arg1.anIntArray889[var35];
						var40 = arg1.anIntArray877[var35];
						var41 = (float) arg1.anIntArray875[var36] - var38;
						var42 = (float) arg1.anIntArray889[var36] - var39;
						float var43 = (float) arg1.anIntArray877[var36] - var40;
						float var44 = (float) arg1.anIntArray875[var37] - var38;
						float var45 = (float) arg1.anIntArray889[var37] - var39;
						float var46 = (float) arg1.anIntArray877[var37] - var40;
						float var47 = (float) arg1.anIntArray875[var32] - var38;
						float var48 = (float) arg1.anIntArray889[var32] - var39;
						float var49 = (float) arg1.anIntArray877[var32] - var40;
						float var50 = (float) arg1.anIntArray875[var33] - var38;
						float var51 = (float) arg1.anIntArray889[var33] - var39;
						var52 = (float) arg1.anIntArray877[var33] - var40;
						var53 = (float) arg1.anIntArray875[var34] - var38;
						var54 = (float) arg1.anIntArray889[var34] - var39;
						var55 = (float) arg1.anIntArray877[var34] - var40;
						var56 = var42 * var46 - var43 * var45;
						var57 = var43 * var44 - var41 * var46;
						float var58 = var41 * var45 - var42 * var44;
						float var59 = var45 * var58 - var46 * var57;
						float var60 = var46 * var56 - var44 * var58;
						float var61 = var44 * var57 - var45 * var56;
						float var62 = 1.0F / (var59 * var41 + var60 * var42 + var61 * var43);
						var84 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
						var87 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
						var89 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
						float var118 = var42 * var58 - var43 * var57;
						float var119 = var43 * var56 - var41 * var58;
						float var120 = var41 * var57 - var42 * var56;
						float var121 = 1.0F / (var118 * var44 + var119 * var45 + var120 * var46);
						var86 = (var118 * var47 + var119 * var48 + var120 * var49) * var121;
						var88 = (var118 * var50 + var119 * var51 + var120 * var52) * var121;
						var90 = (var118 * var53 + var119 * var54 + var120 * var55) * var121;
					} else {
						var32 = arg1.aShortArray888[var75];
						var33 = arg1.aShortArray907[var75];
						var34 = arg1.aShortArray883[var75];
						int var101 = var72.anIntArray867[var19];
						int var102 = var72.anIntArray870[var19];
						int var103 = var72.anIntArray869[var19];
						float[] var106 = var72.aFloatArrayArray868[var19];
						byte var108 = arg1.aByteArray905[var19];
						var40 = (float) arg1.anIntArray901[var19] / 256.0F;
						if (var97 == 1) {
							var41 = (float) arg1.anIntArray900[var19] / 1024.0F;
							this.method4492(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var101, var102, var103, var106, var41, var108, var40, aFloatArray8152);
							var84 = aFloatArray8152[0];
							var86 = aFloatArray8152[1];
							this.method4492(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var101, var102, var103, var106, var41, var108, var40, aFloatArray8152);
							var87 = aFloatArray8152[0];
							var88 = aFloatArray8152[1];
							this.method4492(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var101, var102, var103, var106, var41, var108, var40, aFloatArray8152);
							var89 = aFloatArray8152[0];
							var90 = aFloatArray8152[1];
							var42 = var41 / 2.0F;
							if ((var108 & 0x1) == 0) {
								if (var87 - var84 > var42) {
									var87 -= var41;
									var91 = 1;
								} else if (var84 - var87 > var42) {
									var87 += var41;
									var91 = 2;
								}
								if (var89 - var84 > var42) {
									var89 -= var41;
									var92 = 1;
								} else if (var84 - var89 > var42) {
									var89 += var41;
									var92 = 2;
								}
							} else {
								if (var88 - var86 > var42) {
									var88 -= var41;
									var91 = 1;
								} else if (var86 - var88 > var42) {
									var88 += var41;
									var91 = 2;
								}
								if (var90 - var86 > var42) {
									var90 -= var41;
									var92 = 1;
								} else if (var86 - var90 > var42) {
									var90 += var41;
									var92 = 2;
								}
							}
						} else if (var97 == 2) {
							var41 = (float) arg1.anIntArray902[var19] / 256.0F;
							var42 = (float) arg1.anIntArray872[var19] / 256.0F;
							int var109 = arg1.anIntArray875[var33] - arg1.anIntArray875[var32];
							int var110 = arg1.anIntArray889[var33] - arg1.anIntArray889[var32];
							int var111 = arg1.anIntArray877[var33] - arg1.anIntArray877[var32];
							int var112 = arg1.anIntArray875[var34] - arg1.anIntArray875[var32];
							int var113 = arg1.anIntArray889[var34] - arg1.anIntArray889[var32];
							int var114 = arg1.anIntArray877[var34] - arg1.anIntArray877[var32];
							int var115 = var110 * var114 - var113 * var111;
							int var116 = var111 * var112 - var114 * var109;
							int var117 = var109 * var113 - var112 * var110;
							var52 = 64.0F / (float) arg1.anIntArray898[var19];
							var53 = 64.0F / (float) arg1.anIntArray899[var19];
							var54 = 64.0F / (float) arg1.anIntArray900[var19];
							var55 = ((float) var115 * var106[0] + (float) var116 * var106[1] + (float) var117 * var106[2]) / var52;
							var56 = ((float) var115 * var106[3] + (float) var116 * var106[4] + (float) var117 * var106[5]) / var53;
							var57 = ((float) var115 * var106[6] + (float) var116 * var106[7] + (float) var117 * var106[8]) / var54;
							var93 = this.method4442(var55, var56, var57);
							this.method4443(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var101, var102, var103, var93, var106, var108, var40, var41, var42, aFloatArray8152);
							var84 = aFloatArray8152[0];
							var86 = aFloatArray8152[1];
							this.method4443(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var101, var102, var103, var93, var106, var108, var40, var41, var42, aFloatArray8152);
							var87 = aFloatArray8152[0];
							var88 = aFloatArray8152[1];
							this.method4443(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var101, var102, var103, var93, var106, var108, var40, var41, var42, aFloatArray8152);
							var89 = aFloatArray8152[0];
							var90 = aFloatArray8152[1];
						} else if (var97 == 3) {
							this.method4441(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var101, var102, var103, var106, var108, var40, aFloatArray8152);
							var84 = aFloatArray8152[0];
							var86 = aFloatArray8152[1];
							this.method4441(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var101, var102, var103, var106, var108, var40, aFloatArray8152);
							var87 = aFloatArray8152[0];
							var88 = aFloatArray8152[1];
							this.method4441(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var101, var102, var103, var106, var108, var40, aFloatArray8152);
							var89 = aFloatArray8152[0];
							var90 = aFloatArray8152[1];
							if ((var108 & 0x1) == 0) {
								if (var87 - var84 > 0.5F) {
									var87--;
									var91 = 1;
								} else if (var84 - var87 > 0.5F) {
									var87++;
									var91 = 2;
								}
								if (var89 - var84 > 0.5F) {
									var89--;
									var92 = 1;
								} else if (var84 - var89 > 0.5F) {
									var89++;
									var92 = 2;
								}
							} else {
								if (var88 - var86 > 0.5F) {
									var88--;
									var91 = 1;
								} else if (var86 - var88 > 0.5F) {
									var88++;
									var91 = 2;
								}
								if (var90 - var86 > 0.5F) {
									var90--;
									var92 = 1;
								} else if (var86 - var90 > 0.5F) {
									var90++;
									var92 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray884 == null) {
				var97 = 0;
			} else {
				var97 = arg1.aByteArray884[var75];
			}
			if (var97 == 0) {
				long var98 = (long) (var19 << 2) + ((long) (var93 << 24) + (long) (var80 << 8) + (long) var79 << 32);
				var34 = arg1.aShortArray888[var75];
				var35 = arg1.aShortArray907[var75];
				var36 = arg1.aShortArray883[var75];
				Class45 var104 = var65[var34];
				this.aShortArray8119[var71] = this.method4514(arg1, var34, var98, var104.anInt446, var104.anInt448, var104.anInt447, var104.anInt445, var84, var86);
				Class45 var105 = var65[var35];
				this.aShortArray8120[var71] = this.method4514(arg1, var35, var98 + (long) var91, var105.anInt446, var105.anInt448, var105.anInt447, var105.anInt445, var87, var88);
				Class45 var107 = var65[var36];
				this.aShortArray8121[var71] = this.method4514(arg1, var36, var98 + (long) var92, var107.anInt446, var107.anInt448, var107.anInt447, var107.anInt445, var89, var90);
			} else if (var97 == 1) {
				Class39 var99 = var73[var75];
				long var100 = (long) ((var19 << 2) + (var99.anInt422 > 0 ? 1024 : 2048) + (var99.anInt423 + 256 << 12) + (var99.anInt421 + 256 << 22)) + ((long) (var93 << 24) + (long) (var80 << 8) + (long) var79 << 32);
				this.aShortArray8119[var71] = this.method4514(arg1, arg1.aShortArray888[var75], var100, var99.anInt422, var99.anInt423, var99.anInt421, 0, var84, var86);
				this.aShortArray8120[var71] = this.method4514(arg1, arg1.aShortArray907[var75], var100 + (long) var91, var99.anInt422, var99.anInt423, var99.anInt421, 0, var87, var88);
				this.aShortArray8121[var71] = this.method4514(arg1, arg1.aShortArray883[var75], var100 + (long) var92, var99.anInt422, var99.anInt423, var99.anInt421, 0, var89, var90);
			}
			if (arg1.aByteArray876 != null) {
				this.aByteArray8136[var71] = arg1.aByteArray876[var75];
			}
			if (arg1.aShortArray892 != null) {
				this.aShortArray8124[var71] = arg1.aShortArray892[var75];
			}
			this.modelColors[var71] = arg1.aShortArray873[var75];
			this.modelTextures[var71] = var82;
		}
		var71 = 0;
		var74 = -10000;
		for (var80 = 0; var80 < this.anInt8116; var80++) {
			var78 = this.modelTextures[var80];
			if (var78 != var74) {
				var71++;
				var74 = var78;
			}
		}
		this.anIntArray8142 = new int[var71 + 1];
		var71 = 0;
		var74 = -10000;
		for (var80 = 0; var80 < this.anInt8116; var80++) {
			var78 = this.modelTextures[var80];
			if (var78 != var74) {
				this.anIntArray8142[var71++] = var80;
				var74 = var78;
			}
		}
		this.anIntArray8142[var71] = this.anInt8116;
		aLongArray8151 = null;
		this.aShortArray8108 = method4516(this.aShortArray8108, this.anInt8107);
		this.aShortArray8109 = method4516(this.aShortArray8109, this.anInt8107);
		this.aShortArray8095 = method4516(this.aShortArray8095, this.anInt8107);
		this.aByteArray8118 = method4515(this.aByteArray8118, this.anInt8107);
		this.aFloatArray8129 = method4517(this.aFloatArray8129, this.anInt8107);
		this.aFloatArray8114 = method4517(this.aFloatArray8114, this.anInt8107);
		if (arg1.anIntArray880 != null && Class41.method581(arg2, this.anInt8094)) {
			this.anIntArrayArray8113 = arg1.method1197(false);
		}
		if (arg1.aClass94Array908 != null && Class41.method574(arg2, this.anInt8094)) {
			this.anIntArrayArray8150 = arg1.method1193();
		}
		if (arg1.anIntArray890 != null && Class41.method571(arg2, this.anInt8094)) {
			var80 = 0;
			int[] var85 = new int[256];
			for (var79 = 0; var79 < this.anInt8089 * -1431655765; var79++) {
				var81 = arg1.anIntArray890[var8[var79]];
				if (var81 >= 0) {
					int var10002 = var85[var81]++;
					if (var81 > var80) {
						var80 = var81;
					}
				}
			}
			this.anIntArrayArray8123 = new int[var80 + 1][];
			for (var79 = 0; var79 <= var80; var79++) {
				this.anIntArrayArray8123[var79] = new int[var85[var79]];
				var85[var79] = 0;
			}
			for (var79 = 0; var79 < this.anInt8089 * -1431655765; var79++) {
				var81 = arg1.anIntArray890[var8[var79]];
				if (var81 >= 0) {
					this.anIntArrayArray8123[var81][var85[var81]++] = var79;
				}
			}
		}
	}

	public Class387_Sub2(Class_ra_Sub1 arg0) {
		this.aClass_ra_Sub1_8092 = arg0;
		this.aClass44_8125 = new Class44(null, 5126, 3, 0);
		this.aClass44_8128 = new Class44(null, 5126, 2, 0);
		this.aClass44_8127 = new Class44(null, 5126, 3, 0);
		this.aClass44_8105 = new Class44(null, 5121, 4, 0);
		this.aClass37_8087 = new Class37();
	}

	public Class93[] method4464() {
		return this.aClass93Array8135;
	}

	public short method4514(Model arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
		int var11 = this.anIntArray8143[arg1];
		int var12 = this.anIntArray8143[arg1 + 1];
		int var13 = 0;
		for (int var14 = var11; var14 < var12; var14++) {
			short var15 = this.aShortArray8144[var14];
			if (var15 == 0) {
				var13 = var14;
				break;
			}
			if (aLongArray8151[var14] == arg2) {
				return (short) (var15 - 1);
			}
		}
		this.aShortArray8144[var13] = (short) (this.anInt8107 + 1);
		aLongArray8151[var13] = arg2;
		this.aShortArray8108[this.anInt8107] = (short) arg3;
		this.aShortArray8109[this.anInt8107] = (short) arg4;
		this.aShortArray8095[this.anInt8107] = (short) arg5;
		this.aByteArray8118[this.anInt8107] = (byte) arg6;
		this.aFloatArray8129[this.anInt8107] = arg7;
		this.aFloatArray8114[this.anInt8107] = arg8;
		return (short) this.anInt8107++;
	}

	public static byte[] method4515(byte[] arg0, int arg1) {
		byte[] var2 = new byte[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	public static short[] method4516(short[] arg0, int arg1) {
		short[] var2 = new short[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	public static float[] method4517(float[] arg0, int arg1) {
		float[] var2 = new float[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("Class387_Sub2.m()I")
	public int m() {
		return this.anInt8093;
	}

	@ObfuscatedName("Class387_Sub2.KA(I)V")
	public void KA(int arg0) {
		this.anInt8093 = arg0;
		if (this.aClass68_8112 != null && (this.anInt8093 & 0x10000) == 0) {
			this.aShortArray8108 = this.aClass68_8112.aShortArray582;
			this.aShortArray8109 = this.aClass68_8112.aShortArray583;
			this.aShortArray8095 = this.aClass68_8112.aShortArray584;
			this.aByteArray8118 = this.aClass68_8112.aByteArray585;
			this.aClass68_8112 = null;
		}
		this.aBoolean8132 = true;
		this.method4518();
	}

	public void method4479() {
		if (this.anInt8107 <= 0 || this.anInt8116 <= 0) {
			return;
		}
		this.method4527(false);
		if ((this.aByte8138 & 0x10) == 0 && this.aClass37_8087.anInterface3_382 == null) {
			this.method4523(false);
		}
		this.method4518();
	}

	public Class387 method4446(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		Class387_Sub2 var5;
		Class387_Sub2 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass_ra_Sub1_8092.aClass387_Sub2Array8433[arg0 - 1];
			var5 = this.aClass_ra_Sub1_8092.aClass387_Sub2Array8432[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub2(this.aClass_ra_Sub1_8092);
		}
		return this.method4526(var5, var6, arg1, var4, arg2);
	}

	@ObfuscatedName("Class387_Sub2.bs(I)V")
	public void bs(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public void method4518() {
		if (!this.aBoolean8132) {
			return;
		}
		this.aBoolean8132 = false;
		if (this.aClass93Array8135 == null && this.aClass64Array8146 == null && this.aClass52Array8148 == null && !Class41.method552(this.anInt8093, this.anInt8094)) {
			boolean var1 = false;
			boolean var2 = false;
			boolean var3 = false;
			if (this.anIntArray8102 != null && !Class41.method563(this.anInt8093, this.anInt8094)) {
				if (this.aClass44_8125 != null && this.aClass44_8125.anInterface1_441 == null) {
					this.aBoolean8132 = true;
				} else {
					if (!this.aBoolean8126) {
						this.method4528();
					}
					var1 = true;
				}
			}
			if (this.anIntArray8110 != null && !Class41.method565(this.anInt8093, this.anInt8094)) {
				if (this.aClass44_8125 != null && this.aClass44_8125.anInterface1_441 == null) {
					this.aBoolean8132 = true;
				} else {
					if (!this.aBoolean8126) {
						this.method4528();
					}
					var2 = true;
				}
			}
			if (this.anIntArray8104 != null && !Class41.method566(this.anInt8093, this.anInt8094)) {
				if (this.aClass44_8125 != null && this.aClass44_8125.anInterface1_441 == null) {
					this.aBoolean8132 = true;
				} else {
					if (!this.aBoolean8126) {
						this.method4528();
					}
					var3 = true;
				}
			}
			if (var1) {
				this.anIntArray8102 = null;
			}
			if (var2) {
				this.anIntArray8110 = null;
			}
			if (var3) {
				this.anIntArray8104 = null;
			}
		}
		if (this.aShortArray8144 != null && this.anIntArray8102 == null && this.anIntArray8110 == null && this.anIntArray8104 == null) {
			this.aShortArray8144 = null;
			this.anIntArray8143 = null;
		}
		if (this.aByteArray8118 != null && !Class41.method567(this.anInt8093, this.anInt8094)) {
			if (this.aClass44_8127 == null) {
				if (this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null) {
					this.aBoolean8132 = true;
				} else {
					this.aShortArray8095 = null;
					this.aShortArray8109 = null;
					this.aShortArray8108 = null;
					this.aByteArray8118 = null;
				}
			} else if (this.aClass44_8127.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.aShortArray8095 = null;
				this.aShortArray8109 = null;
				this.aShortArray8108 = null;
				this.aByteArray8118 = null;
			}
		}
		if (this.modelColors != null && !Class41.method568(this.anInt8093, this.anInt8094)) {
			if (this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.modelColors = null;
			}
		}
		if (this.aByteArray8136 != null && !Class41.method579(this.anInt8093, this.anInt8094)) {
			if (this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.aByteArray8136 = null;
			}
		}
		if (this.aFloatArray8129 != null && !Class41.method569(this.anInt8093, this.anInt8094)) {
			if (this.aClass44_8128 != null && this.aClass44_8128.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.aFloatArray8114 = null;
				this.aFloatArray8129 = null;
			}
		}
		if (this.modelTextures != null && !Class41.method576(this.anInt8093, this.anInt8094)) {
			if (this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.modelTextures = null;
			}
		}
		if (this.aShortArray8119 != null && !Class41.method572(this.anInt8093, this.anInt8094)) {
			if (this.aClass37_8087 != null && this.aClass37_8087.anInterface3_382 == null || this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null) {
				this.aBoolean8132 = true;
			} else {
				this.aShortArray8121 = null;
				this.aShortArray8120 = null;
				this.aShortArray8119 = null;
			}
		}
		if (this.anIntArrayArray8123 != null && !Class41.method571(this.anInt8093, this.anInt8094)) {
			this.anIntArrayArray8123 = null;
			this.aShortArray8124 = null;
		}
		if (this.anIntArrayArray8113 != null && !Class41.method581(this.anInt8093, this.anInt8094)) {
			this.anIntArrayArray8113 = null;
			this.aShortArray8106 = null;
		}
		if (this.anIntArrayArray8150 != null && !Class41.method574(this.anInt8093, this.anInt8094)) {
			this.anIntArrayArray8150 = null;
		}
		if (this.anIntArray8142 != null && (this.anInt8093 & 0x800) == 0 && (this.anInt8093 & 0x40000) == 0) {
			this.anIntArray8142 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.f(I)V")
	public void f(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.S(I)V")
	public void S(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.t(I)V")
	public void t(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var3 - this.anIntArray8104[var4] * var2 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8110[var4] * var2 + this.anIntArray8104[var4] * var3 >> 14;
			this.anIntArray8110[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.EA(I)V")
	public void EA(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8110[var4] = this.anIntArray8110[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.ia(III)V")
	public void ia(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			if (arg0 != 0) {
				this.anIntArray8102[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8110[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8104[var4] += arg2;
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.cx()I")
	public int cx() {
		return this.aShort8096;
	}

	@ObfuscatedName("Class387_Sub2.cl(I)V")
	public void cl(int arg0) {
		this.aShort8096 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public int method4519(int arg0, short arg1, int arg2, byte arg3) {
		int var5 = Console.colorArray[method4524(arg0, arg2)];
		if (arg1 != -1) {
			Class56 var6 = this.aClass_ra_Sub1_8092.anInterface_ma4227.method221(arg1 & 0xFFFF, -1612467206);
			int var7 = var6.aByte529 & 0xFF;
			int var8;
			int var10;
			if (var7 != 0) {
				if (arg2 < 0) {
					var8 = 0;
				} else if (arg2 > 127) {
					var8 = 16777215;
				} else {
					var8 = arg2 * 131586;
				}
				if (var7 == 256) {
					var5 = var8;
				} else {
					var10 = 256 - var7;
					var5 = ((var8 & 0xFF00FF) * var7 + (var5 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + (var5 & 0xFF00) * var10 & 0xFF0000) >> 8;
				}
			}
			var8 = var6.aByte534 & 0xFF;
			if (var8 != 0) {
				var8 += 256;
				int var9 = (var5 >> 16 & 0xFF) * var8;
				if (var9 > 65535) {
					var9 = 65535;
				}
				var10 = (var5 >> 8 & 0xFF) * var8;
				if (var10 > 65535) {
					var10 = 65535;
				}
				int var11 = (var5 & 0xFF) * var8;
				if (var11 > 65535) {
					var11 = 65535;
				}
				var5 = ((var9 & 0xFF00) << 8) + (var10 & 0xFF00) + (var11 >> 8);
			}
		}
		return var5 << 8 | 255 - (arg3 & 0xFF);
	}

	@ObfuscatedName("Class387_Sub2.dw()Z")
	public boolean dw() {
		return this.aBoolean8153;
	}

	@ObfuscatedName("Class387_Sub2.oa(III)V")
	public void oa(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			if (arg0 != 128) {
				this.anIntArray8102[var4] = this.anIntArray8102[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray8110[var4] = this.anIntArray8110[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray8104[var4] = this.anIntArray8104[var4] * arg2 >> 7;
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.n()I")
	public int n() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8133;
	}

	@ObfuscatedName("Class387_Sub2.RA()I")
	public int RA() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8145;
	}

	@ObfuscatedName("Class387_Sub2.AA()I")
	public int AA() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8140;
	}

	@ObfuscatedName("Class387_Sub2.YA()I")
	public int YA() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8097;
	}

	public void method4520() {
		if (this.anInt8116 == 0) {
			return;
		}
		if (this.aByte8138 != 0) {
			this.method4527(true);
		}
		this.method4527(false);
		if (this.aClass37_8087 != null) {
			if (this.aClass37_8087.anInterface3_382 == null) {
				this.method4523((this.aByte8138 & 0x10) != 0);
			}
			if (this.aClass37_8087.anInterface3_382 != null) {
				this.aClass_ra_Sub1_8092.method4854(this.aClass44_8127 != null);
				this.aClass_ra_Sub1_8092.method4869(this.aClass44_8125, this.aClass44_8127, this.aClass44_8105, this.aClass44_8128);
				int var1 = this.anIntArray8142.length - 1;
				for (int var2 = 0; var2 < var1; var2++) {
					int var3 = this.anIntArray8142[var2];
					int var4 = this.anIntArray8142[var2 + 1];
					int var5 = this.modelTextures[var3] & 0xFFFF;
					if (var5 == 65535) {
						var5 = -1;
					}
					this.aClass_ra_Sub1_8092.method4871(var5, this.aClass44_8127 != null);
					this.aClass_ra_Sub1_8092.method4837(this.aClass37_8087.anInterface3_382, 4, var3 * 3, (var4 - var3) * 3);
				}
			}
		}
		this.method4518();
	}

	@ObfuscatedName("Class387_Sub2.dz()[B")
	public byte[] dz() {
		return this.aByteArray8136;
	}

	@ObfuscatedName("Class387_Sub2.ha()I")
	public int ha() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8141;
	}

	@ObfuscatedName("Class387_Sub2.bg(I)V")
	public void bg(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.Q(I)V")
	public void Q(int arg0) {
		this.aShort8099 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.cn()I")
	public int cn() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8156;
	}

	@ObfuscatedName("Class387_Sub2.Z()I")
	public int Z() {
		return this.aShort8099;
	}

	@ObfuscatedName("Class387_Sub2.p(I)V")
	public void p(int arg0) {
		this.aShort8096 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public void color(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public void method4460(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				this.aByteArray8136[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8136[var3] = (byte) var4;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public boolean method4458(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		Class249 var6 = this.aClass_ra_Sub1_8092.aClass249_8430;
		var6.method2508(arg2);
		var6.method2483(this.aClass_ra_Sub1_8092.aClass249_8422);
		boolean var7 = false;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		int var10 = Integer.MAX_VALUE;
		int var11 = Integer.MIN_VALUE;
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var12 = this.aShort8156 - this.aShort8145 >> 1;
		int var13 = this.aShort8100 - this.aShort8097 >> 1;
		int var14 = this.aShort8141 - this.aShort8140 >> 1;
		int var15 = this.aShort8145 + var12;
		int var16 = this.aShort8097 + var13;
		int var17 = this.aShort8140 + var14;
		int var18 = var15 - (var12 << arg4);
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = var15 + (var12 << arg4);
		int var22 = var16 + (var13 << arg4);
		int var23 = var17 + (var14 << arg4);
		anIntArray8103[0] = var18;
		anIntArray8154[0] = var19;
		anIntArray8155[0] = var20;
		anIntArray8103[1] = var21;
		anIntArray8154[1] = var19;
		anIntArray8155[1] = var20;
		anIntArray8103[2] = var18;
		anIntArray8154[2] = var22;
		anIntArray8155[2] = var20;
		anIntArray8103[3] = var21;
		anIntArray8154[3] = var22;
		anIntArray8155[3] = var20;
		anIntArray8103[4] = var18;
		anIntArray8154[4] = var19;
		anIntArray8155[4] = var23;
		anIntArray8103[5] = var21;
		anIntArray8154[5] = var19;
		anIntArray8155[5] = var23;
		anIntArray8103[6] = var18;
		anIntArray8154[6] = var22;
		anIntArray8155[6] = var23;
		anIntArray8103[7] = var21;
		anIntArray8154[7] = var22;
		anIntArray8155[7] = var23;
		int var26;
		int var27;
		float var30;
		float var31;
		int var32;
		int var33;
		for (int var24 = 0; var24 < 8; var24++) {
			int var25 = anIntArray8103[var24];
			var26 = anIntArray8154[var24];
			var27 = anIntArray8155[var24];
			float var28 = var6.aFloatArray2631[2] * (float) var25 + var6.aFloatArray2631[6] * (float) var26 + var6.aFloatArray2631[10] * (float) var27 + var6.aFloatArray2631[14];
			float var29 = var6.aFloatArray2631[3] * (float) var25 + var6.aFloatArray2631[7] * (float) var26 + var6.aFloatArray2631[11] * (float) var27 + var6.aFloatArray2631[15];
			if (var28 >= -var29) {
				var30 = var6.aFloatArray2631[0] * (float) var25 + var6.aFloatArray2631[4] * (float) var26 + var6.aFloatArray2631[8] * (float) var27 + var6.aFloatArray2631[12];
				var31 = var6.aFloatArray2631[1] * (float) var25 + var6.aFloatArray2631[5] * (float) var26 + var6.aFloatArray2631[9] * (float) var27 + var6.aFloatArray2631[13];
				var32 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var29);
				var33 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var29);
				if (var32 < var8) {
					var8 = var32;
				}
				if (var32 > var9) {
					var9 = var32;
				}
				if (var33 < var10) {
					var10 = var33;
				}
				if (var33 > var11) {
					var11 = var33;
				}
				var7 = true;
			}
		}
		if (var7 && arg0 > var8 && arg0 < var9 && arg1 > var10 && arg1 < var11) {
			if (arg3) {
				return true;
			}
			if (this.aClass_ra_Sub1_8092.anIntArray8291.length < this.anInt8107) {
				this.aClass_ra_Sub1_8092.anIntArray8291 = new int[this.anInt8107];
				this.aClass_ra_Sub1_8092.anIntArray8427 = new int[this.anInt8107];
			}
			int[] var38 = this.aClass_ra_Sub1_8092.anIntArray8291;
			int[] var39 = this.aClass_ra_Sub1_8092.anIntArray8427;
			for (var26 = 0; var26 < this.anInt8130; var26++) {
				var27 = this.anIntArray8102[var26];
				int var40 = this.anIntArray8110[var26];
				int var41 = this.anIntArray8104[var26];
				var30 = var6.aFloatArray2631[2] * (float) var27 + var6.aFloatArray2631[6] * (float) var40 + var6.aFloatArray2631[10] * (float) var41 + var6.aFloatArray2631[14];
				var31 = var6.aFloatArray2631[3] * (float) var27 + var6.aFloatArray2631[7] * (float) var40 + var6.aFloatArray2631[11] * (float) var41 + var6.aFloatArray2631[15];
				int var34;
				int var35;
				if (var30 >= -var31) {
					float var42 = var6.aFloatArray2631[0] * (float) var27 + var6.aFloatArray2631[4] * (float) var40 + var6.aFloatArray2631[8] * (float) var41 + var6.aFloatArray2631[12];
					float var43 = var6.aFloatArray2631[1] * (float) var27 + var6.aFloatArray2631[5] * (float) var40 + var6.aFloatArray2631[9] * (float) var41 + var6.aFloatArray2631[13];
					var34 = this.anIntArray8143[var26];
					var35 = this.anIntArray8143[var26 + 1];
					for (int var36 = var34; var36 < var35; var36++) {
						int var37 = this.aShortArray8144[var36] - 1;
						if (var37 == -1) {
							break;
						}
						var38[var37] = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var42 / var31);
						var39[var37] = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var43 / var31);
					}
				} else {
					var32 = this.anIntArray8143[var26];
					var33 = this.anIntArray8143[var26 + 1];
					for (var34 = var32; var34 < var33; var34++) {
						var35 = this.aShortArray8144[var34] - 1;
						if (var35 == -1) {
							break;
						}
						var38[this.aShortArray8144[var34] - 1] = -999999;
					}
				}
			}
			for (var26 = 0; var26 < this.anInt8089 * -1431655765; var26++) {
				if (var38[this.aShortArray8119[var26]] != -999999 && var38[this.aShortArray8120[var26]] != -999999 && var38[this.aShortArray8121[var26]] != -999999 && this.method4521(arg0, arg1, var39[this.aShortArray8119[var26]], var39[this.aShortArray8120[var26]], var39[this.aShortArray8121[var26]], var38[this.aShortArray8119[var26]], var38[this.aShortArray8120[var26]], var38[this.aShortArray8121[var26]])) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("Class387_Sub2.bo(I)V")
	public void bo(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.i()Z")
	public boolean i() {
		return this.aBoolean8098;
	}

	@ObfuscatedName("Class387_Sub2.u()Z")
	public boolean u() {
		return this.aBoolean8153;
	}

	public void method4481(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8106 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub1_8092.aClass247_8360;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8130; var6++) {
			if ((arg1 & this.aShortArray8106[var6]) != 0) {
				var4.method2465((float) this.anIntArray8102[var6], (float) this.anIntArray8110[var6], (float) this.anIntArray8104[var6], var5);
				this.anIntArray8102[var6] = (int) var5[0];
				this.anIntArray8110[var6] = (int) var5[1];
				this.anIntArray8104[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.el()Z")
	public boolean el() {
		return this.aBoolean8098;
	}

	@ObfuscatedName("Class387_Sub2.ea()Z")
	public boolean ea() {
		if (this.anIntArrayArray8113 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.anInt8115; var1++) {
			this.anIntArray8102[var1] <<= 0x4;
			this.anIntArray8110[var1] <<= 0x4;
			this.anIntArray8104[var1] <<= 0x4;
		}
		anInt8101 = 0;
		anInt8111 = 0;
		anInt8158 = 0;
		return true;
	}

	@ObfuscatedName("Class387_Sub2.e(I[IIIIZI[I)V")
	public void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8113.length) {
					int[] var13 = this.anIntArrayArray8113[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var15]) != 0) {
							anInt8101 += this.anIntArray8102[var15];
							anInt8111 += this.anIntArray8110[var15];
							anInt8158 += this.anIntArray8104[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				anInt8101 = anInt8101 / var10 + arg2;
				anInt8111 = anInt8111 / var10 + arg3;
				anInt8158 = anInt8158 / var10 + arg4;
				aBoolean8159 = true;
			} else {
				anInt8101 = arg2;
				anInt8111 = arg3;
				anInt8158 = arg4;
			}
			return;
		}
		int[] var47;
		int var48;
		if (arg0 == 1) {
			if (arg7 != null) {
				var10 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				var11 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				var12 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = var10;
				arg3 = var11;
				arg4 = var12;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] += arg2;
							this.anIntArray8110[var14] += arg3;
							this.anIntArray8104[var14] += arg4;
						}
					}
				}
			}
			return;
		}
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var26;
		int var27;
		int var28;
		int var30;
		int var32;
		int var33;
		int var34;
		int var36;
		int var37;
		int var38;
		int var39;
		int var40;
		int[] var59;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8113.length) {
						var47 = this.anIntArrayArray8113[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
								this.anIntArray8102[var14] -= anInt8101;
								this.anIntArray8110[var14] -= anInt8111;
								this.anIntArray8104[var14] -= anInt8158;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8110[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = this.anIntArray8110[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8110[var14] * var16 - this.anIntArray8104[var14] * var15 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8110[var14] * var15 + this.anIntArray8104[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8104[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8104[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								this.anIntArray8102[var14] += anInt8101;
								this.anIntArray8110[var14] += anInt8111;
								this.anIntArray8104[var14] += anInt8158;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8113.length) {
							var47 = this.anIntArrayArray8113[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
									var15 = this.anIntArray8143[var14];
									var16 = this.anIntArray8143[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8144[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8109[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8109[var18] = (short) (this.aShortArray8109[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8109[var18] * var20 - this.aShortArray8095[var18] * var19 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8109[var18] * var19 + this.aShortArray8095[var18] * var20 + 16383 >> 14);
											this.aShortArray8109[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8095[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8095[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass44_8127 != null) {
						this.aClass44_8127.anInterface1_441 = null;
					}
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (aBoolean8159) {
					var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
					var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
					var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
					int var51 = var16 + var48;
					int var53 = var17 + var14;
					int var55 = var18 + var15;
					anInt8101 = var51;
					anInt8111 = var53;
					anInt8158 = var55;
					aBoolean8159 = false;
				}
				int[] var52 = new int[9];
				var17 = Class257.anIntArray2684[arg2];
				var18 = Class257.anIntArray2683[arg2];
				var19 = Class257.anIntArray2684[arg3];
				var20 = Class257.anIntArray2683[arg3];
				var21 = Class257.anIntArray2684[arg4];
				var22 = Class257.anIntArray2683[arg4];
				var23 = var18 * var21 + 8192 >> 14;
				var24 = var18 * var22 + 8192 >> 14;
				var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
				var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
				var52[2] = var20 * var17 + 8192 >> 14;
				var52[3] = var17 * var22 + 8192 >> 14;
				var52[4] = var17 * var21 + 8192 >> 14;
				var52[5] = -var18;
				var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
				var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
				var52[8] = var19 * var17 + 8192 >> 14;
				int var25 = var52[0] * -anInt8101 + var52[1] * -anInt8111 + var52[2] * -anInt8158 + 8192 >> 14;
				var26 = var52[3] * -anInt8101 + var52[4] * -anInt8111 + var52[5] * -anInt8158 + 8192 >> 14;
				var27 = var52[6] * -anInt8101 + var52[7] * -anInt8111 + var52[8] * -anInt8158 + 8192 >> 14;
				var28 = var25 + anInt8101;
				int var29 = var26 + anInt8111;
				var30 = var27 + anInt8158;
				int[] var31 = new int[9];
				for (var32 = 0; var32 < 3; var32++) {
					for (var33 = 0; var33 < 3; var33++) {
						var34 = 0;
						for (int var35 = 0; var35 < 3; var35++) {
							var34 += var52[var32 * 3 + var35] * arg7[var33 * 3 + var35];
						}
						var31[var32 * 3 + var33] = var34 + 8192 >> 14;
					}
				}
				var32 = var52[0] * var48 + var52[1] * var14 + var52[2] * var15 + 8192 >> 14;
				var33 = var52[3] * var48 + var52[4] * var14 + var52[5] * var15 + 8192 >> 14;
				var34 = var52[6] * var48 + var52[7] * var14 + var52[8] * var15 + 8192 >> 14;
				var32 += var28;
				var33 += var29;
				var34 += var30;
				var59 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var59[var36 * 3 + var37] = var38 + 8192 >> 14;
					}
				}
				var36 = arg7[0] * var32 + arg7[1] * var33 + arg7[2] * var34 + 8192 >> 14;
				var37 = arg7[3] * var32 + arg7[4] * var33 + arg7[5] * var34 + 8192 >> 14;
				var38 = arg7[6] * var32 + arg7[7] * var33 + arg7[8] * var34 + 8192 >> 14;
				var36 += var10;
				var37 += var11;
				var38 += var12;
				for (var39 = 0; var39 < var9; var39++) {
					var40 = arg1[var39];
					if (var40 < this.anIntArrayArray8113.length) {
						int[] var41 = this.anIntArrayArray8113[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8102[var43] + var59[1] * this.anIntArray8110[var43] + var59[2] * this.anIntArray8104[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8102[var43] + var59[4] * this.anIntArray8110[var43] + var59[5] * this.anIntArray8104[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8102[var43] + var59[7] * this.anIntArray8110[var43] + var59[8] * this.anIntArray8104[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8102[var43] = var60;
								this.anIntArray8110[var43] = var61;
								this.anIntArray8104[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class52 var49;
			Class40 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8123.length) {
							var47 = this.anIntArrayArray8123[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
									var15 = (this.aByteArray8136[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8136[var14] = (byte) var15;
									if (this.aClass44_8105 != null) {
										this.aClass44_8105.anInterface1_441 = null;
									}
								}
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var10 = 0; var10 < this.anInt8147; var10++) {
							var49 = this.aClass52Array8148[var10];
							var50 = this.aClass40Array8149[var10];
							var50.anInt428 = var50.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var49.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var54;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt425 += arg2;
									var54.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt429 = var54.anInt429 * arg2 >> 7;
									var54.anInt426 = var54.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8150.length) {
							var47 = this.anIntArrayArray8150[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var54 = this.aClass40Array8149[var47[var48]];
								var54.anInt424 = var54.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8123.length) {
						var47 = this.anIntArrayArray8123[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3 / 4;
								if (var17 < 0) {
									var17 = 0;
								} else if (var17 > 7) {
									var17 = 7;
								}
								var18 += arg4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 127) {
									var18 = 127;
								}
								this.modelColors[var14] = (short) (var16 << 10 | var17 << 7 | var18);
								if (this.aClass44_8105 != null) {
									this.aClass44_8105.anInterface1_441 = null;
								}
							}
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var10 = 0; var10 < this.anInt8147; var10++) {
						var49 = this.aClass52Array8148[var10];
						var50 = this.aClass40Array8149[var10];
						var50.anInt428 = var50.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var49.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] -= anInt8101;
							this.anIntArray8110[var14] -= anInt8111;
							this.anIntArray8104[var14] -= anInt8158;
							this.anIntArray8102[var14] = this.anIntArray8102[var14] * arg2 >> 7;
							this.anIntArray8110[var14] = this.anIntArray8110[var14] * arg3 >> 7;
							this.anIntArray8104[var14] = this.anIntArray8104[var14] * arg4 >> 7;
							this.anIntArray8102[var14] += anInt8101;
							this.anIntArray8110[var14] += anInt8111;
							this.anIntArray8104[var14] += anInt8158;
						}
					}
				}
			}
		} else {
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (aBoolean8159) {
				var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
				var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
				var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				anInt8101 = var16;
				anInt8111 = var17;
				anInt8158 = var18;
				aBoolean8159 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -anInt8101 + 8192 >> 14;
			var20 = var17 * -anInt8111 + 8192 >> 14;
			var21 = var18 * -anInt8158 + 8192 >> 14;
			var22 = var19 + anInt8101;
			var23 = var20 + anInt8111;
			var24 = var21 + anInt8158;
			int[] var56 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var57 = new int[9];
			int var58;
			for (var30 = 0; var30 < 3; var30++) {
				for (var58 = 0; var58 < 3; var58++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var56[var58 + var33 * 3];
					}
					var57[var30 * 3 + var58] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var58 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var58 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8113.length) {
					var59 = this.anIntArrayArray8113[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8102[var37] + var57[1] * this.anIntArray8110[var37] + var57[2] * this.anIntArray8104[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8102[var37] + var57[4] * this.anIntArray8110[var37] + var57[5] * this.anIntArray8104[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8102[var37] + var57[7] * this.anIntArray8110[var37] + var57[8] * this.anIntArray8104[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8102[var37] = var38;
							this.anIntArray8110[var37] = var39;
							this.anIntArray8104[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.w(IIII)V")
	public void w(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var6 = 0; var6 < this.anInt8130; var6++) {
				anInt8101 += this.anIntArray8102[var6];
				anInt8111 += this.anIntArray8110[var6];
				anInt8158 += this.anIntArray8104[var6];
				var5++;
			}
			if (var5 > 0) {
				anInt8101 = anInt8101 / var5 + arg1;
				anInt8111 = anInt8111 / var5 + arg2;
				anInt8158 = anInt8158 / var5 + arg3;
			} else {
				anInt8101 = arg1;
				anInt8111 = arg2;
				anInt8158 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8130; var5++) {
				this.anIntArray8102[var5] += arg1;
				this.anIntArray8110[var5] += arg2;
				this.anIntArray8104[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8130; var5++) {
					this.anIntArray8102[var5] -= anInt8101;
					this.anIntArray8110[var5] -= anInt8111;
					this.anIntArray8104[var5] -= anInt8158;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8110[var5] * var6 + this.anIntArray8102[var5] * var7 + 16383 >> 14;
						this.anIntArray8110[var5] = this.anIntArray8110[var5] * var7 - this.anIntArray8102[var5] * var6 + 16383 >> 14;
						this.anIntArray8102[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8110[var5] * var7 - this.anIntArray8104[var5] * var6 + 16383 >> 14;
						this.anIntArray8104[var5] = this.anIntArray8110[var5] * var6 + this.anIntArray8104[var5] * var7 + 16383 >> 14;
						this.anIntArray8110[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8104[var5] * var6 + this.anIntArray8102[var5] * var7 + 16383 >> 14;
						this.anIntArray8104[var5] = this.anIntArray8104[var5] * var7 - this.anIntArray8102[var5] * var6 + 16383 >> 14;
						this.anIntArray8102[var5] = var8;
					}
					this.anIntArray8102[var5] += anInt8101;
					this.anIntArray8110[var5] += anInt8111;
					this.anIntArray8104[var5] += anInt8158;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8130; var5++) {
					this.anIntArray8102[var5] -= anInt8101;
					this.anIntArray8110[var5] -= anInt8111;
					this.anIntArray8104[var5] -= anInt8158;
					this.anIntArray8102[var5] = this.anIntArray8102[var5] * arg1 / 128;
					this.anIntArray8110[var5] = this.anIntArray8110[var5] * arg2 / 128;
					this.anIntArray8104[var5] = this.anIntArray8104[var5] * arg3 / 128;
					this.anIntArray8102[var5] += anInt8101;
					this.anIntArray8110[var5] += anInt8111;
					this.anIntArray8104[var5] += anInt8158;
				}
			} else {
				Class40 var10;
				Class52 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
						var6 = (this.aByteArray8136[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8136[var5] = (byte) var6;
					}
					if (this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass52Array8148 != null) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var11 = this.aClass52Array8148[var5];
							var10 = this.aClass40Array8149[var5];
							var10.anInt428 = var10.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var11.modelColorIndex] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
						var6 = this.modelColors[var5] & 0xFFFF;
						var7 = var6 >> 10 & 0x3F;
						var8 = var6 >> 7 & 0x7;
						int var9 = var6 & 0x7F;
						var7 = var7 + arg1 & 0x3F;
						var8 += arg2 / 4;
						if (var8 < 0) {
							var8 = 0;
						} else if (var8 > 7) {
							var8 = 7;
						}
						var9 += arg3;
						if (var9 < 0) {
							var9 = 0;
						} else if (var9 > 127) {
							var9 = 127;
						}
						this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
					}
					if (this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass52Array8148 != null) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var11 = this.aClass52Array8148[var5];
							var10 = this.aClass40Array8149[var5];
							var10.anInt428 = var10.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var11.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					Class40 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt425 += arg1;
							var12.anInt427 += arg2;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt429 = var12.anInt429 * arg1 >> 7;
							var12.anInt426 = var12.anInt426 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt424 = var12.anInt424 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	public void method4470(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var21;
		int var22;
		int var23;
		if (arg0 == 0) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			var9 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					int[] var12 = this.anIntArrayArray8113[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						anInt8101 += this.anIntArray8102[var14];
						anInt8111 += this.anIntArray8110[var14];
						anInt8158 += this.anIntArray8104[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				anInt8101 = anInt8101 / var9 + var21;
				anInt8111 = anInt8111 / var9 + var22;
				anInt8158 = anInt8158 / var9 + var23;
			} else {
				anInt8101 = var21;
				anInt8111 = var22;
				anInt8158 = var23;
			}
			return;
		}
		int[] var24;
		int var25;
		if (arg0 == 1) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] += var21;
						this.anIntArray8110[var13] += var22;
						this.anIntArray8104[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8113.length) {
						var24 = this.anIntArrayArray8113[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8143[var13];
							var15 = this.anIntArray8143[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8144[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var18;
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8109[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8109[var17] = (short) (this.aShortArray8109[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8109[var17] * var19 - this.aShortArray8095[var17] * var18 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8109[var17] * var18 + this.aShortArray8095[var17] * var19 + 16383 >> 14);
									this.aShortArray8109[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8095[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8095[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
							}
						}
					}
				}
				if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
					this.aClass44_8105.anInterface1_441 = null;
				}
				if (this.aClass44_8127 != null) {
					this.aClass44_8127.anInterface1_441 = null;
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] -= anInt8101;
						this.anIntArray8110[var13] -= anInt8111;
						this.anIntArray8104[var13] -= anInt8158;
						this.anIntArray8102[var13] = this.anIntArray8102[var13] * arg2 >> 7;
						this.anIntArray8110[var13] = this.anIntArray8110[var13] * arg3 >> 7;
						this.anIntArray8104[var13] = this.anIntArray8104[var13] * arg4 >> 7;
						this.anIntArray8102[var13] += anInt8101;
						this.anIntArray8110[var13] += anInt8111;
						this.anIntArray8104[var13] += anInt8158;
					}
				}
			}
		} else {
			Class52 var26;
			Class40 var27;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8123.length) {
							var24 = this.anIntArrayArray8123[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var13 = var24[var25];
								var14 = (this.aByteArray8136[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8136[var13] = (byte) var14;
							}
							if (var24.length > 0 && this.aClass44_8105 != null) {
								this.aClass44_8105.anInterface1_441 = null;
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var9 = 0; var9 < this.anInt8147; var9++) {
							var26 = this.aClass52Array8148[var9];
							var27 = this.aClass40Array8149[var9];
							var27.anInt428 = var27.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var26.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var28;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt425 += arg2;
									var28.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt429 = var28.anInt429 * arg2 >> 7;
									var28.anInt426 = var28.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8150.length) {
							var24 = this.anIntArrayArray8150[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var28 = this.aClass40Array8149[var24[var25]];
								var28.anInt424 = var28.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8123.length) {
						var24 = this.anIntArrayArray8123[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3 / 4;
							if (var16 < 0) {
								var16 = 0;
							} else if (var16 > 7) {
								var16 = 7;
							}
							var17 += arg4;
							if (var17 < 0) {
								var17 = 0;
							} else if (var17 > 127) {
								var17 = 127;
							}
							this.modelColors[var13] = (short) (var15 << 10 | var16 << 7 | var17);
						}
						if (var24.length > 0 && this.aClass44_8105 != null) {
							this.aClass44_8105.anInterface1_441 = null;
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var9 = 0; var9 < this.anInt8147; var9++) {
						var26 = this.aClass52Array8148[var9];
						var27 = this.aClass40Array8149[var9];
						var27.anInt428 = var27.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var26.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.co()I")
	public int co() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8097;
	}

	@ObfuscatedName("Class387_Sub2.dt(SS)V")
	public void dt(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public Class64[] method4445() {
		return this.aClass64Array8146;
	}

	@ObfuscatedName("Class387_Sub2.o()I")
	public int o() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8100;
	}

	public void method4463(Class247 arg0) {
		Class249 var2 = this.aClass_ra_Sub1_8092.aClass249_8430;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8135 != null) {
			for (var3 = 0; var3 < this.aClass93Array8135.length; var3++) {
				Class93 var4 = this.aClass93Array8135[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt841] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt841] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt841]);
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt841] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt841] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt841]);
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt841] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt841] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt841]);
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt835] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt835] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt835]);
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt835] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt835] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt835]);
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt835] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt835] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt835]);
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt836] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt836] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt836]);
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt836] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt836] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt836]);
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt836] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt836] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt836]);
			}
		}
		if (this.aClass64Array8146 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8146.length; var3++) {
			Class64 var6 = this.aClass64Array8146[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var6.anInt566] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var6.anInt566] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var6.anInt566]);
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var6.anInt566] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var6.anInt566] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var6.anInt566]);
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var6.anInt566] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var6.anInt566] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var6.anInt566]);
		}
	}

	public boolean method4521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@ObfuscatedName("Class387_Sub2.ga(LClass_na;)LClass_na;")
	public Class_na ga(Class_na arg0) {
		if (this.anInt8107 == 0) {
			return null;
		}
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var2;
		int var3;
		if (this.aClass_ra_Sub1_8092.anInt8410 > 0) {
			var2 = this.aShort8145 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
			var3 = this.aShort8156 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
		} else {
			var2 = this.aShort8145 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
			var3 = this.aShort8156 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
		}
		int var4;
		int var5;
		if (this.aClass_ra_Sub1_8092.anInt8379 > 0) {
			var4 = this.aShort8140 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
			var5 = this.aShort8141 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
		} else {
			var4 = this.aShort8140 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
			var5 = this.aShort8141 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		Class_na_Sub2 var8 = (Class_na_Sub2) arg0;
		Class_na_Sub2 var9;
		if (var8 != null && var8.method3531(var6, var7)) {
			var9 = var8;
			var8.method3532();
		} else {
			var9 = new Class_na_Sub2(this.aClass_ra_Sub1_8092, var6, var7);
		}
		var9.method3530(var2, var4, var3, var5);
		this.method4525(var9);
		return var9;
	}

	@ObfuscatedName("Class387_Sub2.am()I")
	public int am() {
		return this.anInt8093;
	}

	@ObfuscatedName("Class387_Sub2.PA(IIII)V")
	public void PA(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
			int var6 = this.modelColors[var5] & 0xFFFF;
			int var7 = var6 >> 10 & 0x3F;
			int var8 = var6 >> 7 & 0x7;
			int var9 = var6 & 0x7F;
			if (arg0 != -1) {
				var7 += (arg0 - var7) * arg3 >> 7;
			}
			if (arg1 != -1) {
				var8 += (arg1 - var8) * arg3 >> 7;
			}
			if (arg2 != -1) {
				var9 += (arg2 - var9) * arg3 >> 7;
			}
			this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.aClass52Array8148 != null) {
			for (var5 = 0; var5 < this.anInt8147; var5++) {
				Class52 var10 = this.aClass52Array8148[var5];
				Class40 var11 = this.aClass40Array8149[var5];
				var11.anInt428 = var11.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public void method4522(Class249 arg0) {
		if (this.aClass52Array8148 == null) {
			return;
		}
		Class249 var2 = this.aClass_ra_Sub1_8092.aClass249_8269;
		this.aClass_ra_Sub1_8092.method4820();
		this.aClass_ra_Sub1_8092.RA(!this.aBoolean8098);
		this.aClass_ra_Sub1_8092.method4854(false);
		this.aClass_ra_Sub1_8092.method4869(this.aClass_ra_Sub1_8092.aClass44_8336, null, null, this.aClass_ra_Sub1_8092.aClass44_8436);
		for (int var3 = 0; var3 < this.anInt8147; var3++) {
			Class52 var4 = this.aClass52Array8148[var3];
			Class40 var5 = this.aClass40Array8149[var3];
			if (!var4.aBoolean501 || !this.aClass_ra_Sub1_8092.cg()) {
				float var6 = (float) (this.anIntArray8102[var4.anInt502] + this.anIntArray8102[var4.anInt494] + this.anIntArray8102[var4.anInt496]) * 0.3333333F;
				float var7 = (float) (this.anIntArray8110[var4.anInt502] + this.anIntArray8110[var4.anInt494] + this.anIntArray8110[var4.anInt496]) * 0.3333333F;
				float var8 = (float) (this.anIntArray8104[var4.anInt502] + this.anIntArray8104[var4.anInt494] + this.anIntArray8104[var4.anInt496]) * 0.3333333F;
				float var9 = arg0.aFloatArray2631[0] * var6 + arg0.aFloatArray2631[4] * var7 + arg0.aFloatArray2631[8] * var8 + arg0.aFloatArray2631[12];
				float var10 = arg0.aFloatArray2631[1] * var6 + arg0.aFloatArray2631[5] * var7 + arg0.aFloatArray2631[9] * var8 + arg0.aFloatArray2631[13];
				float var11 = arg0.aFloatArray2631[2] * var6 + arg0.aFloatArray2631[6] * var7 + arg0.aFloatArray2631[10] * var8 + arg0.aFloatArray2631[14];
				float var12 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + var11 * var11))) * (float) var4.anInt500;
				var2.method2507(var5.anInt424, var5.anInt429 * var4.aShort497 >> 7, var5.anInt426 * var4.aShort493 >> 7, var9 + (float) var5.anInt425 - var9 * var12, var10 + (float) var5.anInt427 - var10 * var12, var11 - var11 * var12);
				this.aClass_ra_Sub1_8092.method4865(var2);
				int var13 = var5.anInt428;
				OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
				this.aClass_ra_Sub1_8092.method4841(var4.aShort499);
				this.aClass_ra_Sub1_8092.method4859(var4.aByte498);
				this.aClass_ra_Sub1_8092.method4881(7, 0, 4);
			}
		}
		this.aClass_ra_Sub1_8092.RA(true);
		this.aClass_ra_Sub1_8092.method4876();
	}

	public void method4523(boolean arg0) {
		if (this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8116 * 6) {
			this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1((this.anInt8116 + 100) * 6);
		} else {
			this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381.offset = 0;
		}
		Class330_Sub46_Sub1 var2 = this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381;
		int var3;
		if (this.aClass_ra_Sub1_8092.aBoolean8407) {
			for (var3 = 0; var3 < this.anInt8116; var3++) {
				var2.addShort(this.aShortArray8119[var3], (byte) 70);
				var2.addShort(this.aShortArray8120[var3], (byte) 101);
				var2.addShort(this.aShortArray8121[var3], (byte) 97);
			}
		} else {
			for (var3 = 0; var3 < this.anInt8116; var3++) {
				var2.method3742(this.aShortArray8119[var3], (short) 22029);
				var2.method3742(this.aShortArray8120[var3], (short) 14302);
				var2.method3742(this.aShortArray8121[var3], (short) -16810);
			}
		}
		if (var2.offset == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface3_8085 == null) {
				this.anInterface3_8085 = this.aClass_ra_Sub1_8092.method4834(5123, var2.payload, var2.offset, true);
			} else {
				this.anInterface3_8085.method42(5123, var2.payload, var2.offset);
			}
			this.aClass37_8087.anInterface3_382 = this.anInterface3_8085;
		} else {
			this.aClass37_8087.anInterface3_382 = this.aClass_ra_Sub1_8092.method4834(5123, var2.payload, var2.offset, false);
		}
		if (!arg0) {
			this.aBoolean8132 = true;
		}
	}

	public void method4488(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8106 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub1_8092.aClass247_8360;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8130; var6++) {
			if ((arg1 & this.aShortArray8106[var6]) != 0) {
				var4.method2465((float) this.anIntArray8102[var6], (float) this.anIntArray8110[var6], (float) this.anIntArray8104[var6], var5);
				this.anIntArray8102[var6] = (int) var5[0];
				this.anIntArray8110[var6] = (int) var5[1];
				this.anIntArray8104[var6] = (int) var5[2];
			}
		}
	}

	public static final int method4524(int arg0, int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	public void method4480(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub2 var6 = (Class387_Sub2) arg0;
		if (this.anInt8089 * -1431655765 == 0 || var6.anInt8089 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8130;
		int[] var8 = var6.anIntArray8102;
		int[] var9 = var6.anIntArray8110;
		int[] var10 = var6.anIntArray8104;
		short[] var11 = var6.aShortArray8108;
		short[] var12 = var6.aShortArray8109;
		short[] var13 = var6.aShortArray8095;
		byte[] var14 = var6.aByteArray8118;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass68_8112 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass68_8112.aShortArray582;
			var16 = this.aClass68_8112.aShortArray583;
			var17 = this.aClass68_8112.aShortArray584;
			var18 = this.aClass68_8112.aByteArray585;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass68_8112 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass68_8112.aShortArray582;
			var20 = var6.aClass68_8112.aShortArray583;
			var21 = var6.aClass68_8112.aShortArray584;
			var22 = var6.aClass68_8112.aByteArray585;
		}
		int[] var23 = var6.anIntArray8143;
		short[] var24 = var6.aShortArray8144;
		if (!var6.aBoolean8126) {
			var6.method4528();
		}
		short var25 = var6.aShort8097;
		short var26 = var6.aShort8100;
		short var27 = var6.aShort8145;
		short var28 = var6.aShort8156;
		short var29 = var6.aShort8140;
		short var30 = var6.aShort8141;
		for (int var31 = 0; var31 < this.anInt8130; var31++) {
			int var32 = this.anIntArray8110[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8102[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8104[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8143[var31];
						int var37 = this.anIntArray8143[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8144[var38] - 1;
							if (var35 == -1 || this.aByteArray8118[var35] != 0) {
								break;
							}
						}
						if (var35 != -1) {
							for (var38 = 0; var38 < var7; var38++) {
								if (var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
									int var39 = -1;
									var36 = var23[var38];
									var37 = var23[var38 + 1];
									for (int var40 = var36; var40 < var37; var40++) {
										var39 = var24[var40] - 1;
										if (var39 == -1 || var14[var39] != 0) {
											break;
										}
									}
									if (var39 != -1) {
										if (var15 == null) {
											this.aClass68_8112 = new Class68();
											var15 = this.aClass68_8112.aShortArray582 = Class263_Sub4.method2637(this.aShortArray8108, 1711526308);
											var16 = this.aClass68_8112.aShortArray583 = Class263_Sub4.method2637(this.aShortArray8109, 1570998322);
											var17 = this.aClass68_8112.aShortArray584 = Class263_Sub4.method2637(this.aShortArray8095, 1429071895);
											var18 = this.aClass68_8112.aByteArray585 = IcmpService_Sub1.method6479(this.aByteArray8118, (byte) 2);
										}
										if (var19 == null) {
											Class68 var46 = var6.aClass68_8112 = new Class68();
											var19 = var46.aShortArray582 = Class263_Sub4.method2637(var11, 1575198567);
											var20 = var46.aShortArray583 = Class263_Sub4.method2637(var12, 1454524598);
											var21 = var46.aShortArray584 = Class263_Sub4.method2637(var13, 1650715229);
											var22 = var46.aByteArray585 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8108[var35];
										short var41 = this.aShortArray8109[var35];
										short var42 = this.aShortArray8095[var35];
										byte var43 = this.aByteArray8118[var35];
										var36 = var23[var38];
										var37 = var23[var38 + 1];
										int var44;
										int var45;
										for (var44 = var36; var44 < var37; var44++) {
											var45 = var24[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var22[var45] != 0) {
												var19[var45] += var47;
												var20[var45] += var41;
												var21[var45] += var42;
												var22[var45] += var43;
											}
										}
										var47 = var11[var39];
										var41 = var12[var39];
										var42 = var13[var39];
										var43 = var14[var39];
										var36 = this.anIntArray8143[var31];
										var37 = this.anIntArray8143[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8144[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var18[var45] != 0) {
												var15[var45] += var47;
												var16[var45] += var41;
												var17[var45] += var42;
												var18[var45] += var43;
											}
										}
										if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
											this.aClass44_8105.anInterface1_441 = null;
										}
										if (this.aClass44_8127 != null) {
											this.aClass44_8127.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 == null && var6.aClass44_8105 != null) {
											var6.aClass44_8105.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 != null) {
											var6.aClass44_8127.anInterface1_441 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public boolean method4487() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub1_8092.aClass73_8295.method835(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	public void method4467(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub2 var6 = (Class387_Sub2) arg0;
		if (this.anInt8089 * -1431655765 == 0 || var6.anInt8089 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8130;
		int[] var8 = var6.anIntArray8102;
		int[] var9 = var6.anIntArray8110;
		int[] var10 = var6.anIntArray8104;
		short[] var11 = var6.aShortArray8108;
		short[] var12 = var6.aShortArray8109;
		short[] var13 = var6.aShortArray8095;
		byte[] var14 = var6.aByteArray8118;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass68_8112 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass68_8112.aShortArray582;
			var16 = this.aClass68_8112.aShortArray583;
			var17 = this.aClass68_8112.aShortArray584;
			var18 = this.aClass68_8112.aByteArray585;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass68_8112 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass68_8112.aShortArray582;
			var20 = var6.aClass68_8112.aShortArray583;
			var21 = var6.aClass68_8112.aShortArray584;
			var22 = var6.aClass68_8112.aByteArray585;
		}
		int[] var23 = var6.anIntArray8143;
		short[] var24 = var6.aShortArray8144;
		if (!var6.aBoolean8126) {
			var6.method4528();
		}
		short var25 = var6.aShort8097;
		short var26 = var6.aShort8100;
		short var27 = var6.aShort8145;
		short var28 = var6.aShort8156;
		short var29 = var6.aShort8140;
		short var30 = var6.aShort8141;
		for (int var31 = 0; var31 < this.anInt8130; var31++) {
			int var32 = this.anIntArray8110[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8102[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8104[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8143[var31];
						int var37 = this.anIntArray8143[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8144[var38] - 1;
							if (var35 == -1 || this.aByteArray8118[var35] != 0) {
								break;
							}
						}
						if (var35 != -1) {
							for (var38 = 0; var38 < var7; var38++) {
								if (var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
									int var39 = -1;
									var36 = var23[var38];
									var37 = var23[var38 + 1];
									for (int var40 = var36; var40 < var37; var40++) {
										var39 = var24[var40] - 1;
										if (var39 == -1 || var14[var39] != 0) {
											break;
										}
									}
									if (var39 != -1) {
										if (var15 == null) {
											this.aClass68_8112 = new Class68();
											var15 = this.aClass68_8112.aShortArray582 = Class263_Sub4.method2637(this.aShortArray8108, 1993273327);
											var16 = this.aClass68_8112.aShortArray583 = Class263_Sub4.method2637(this.aShortArray8109, 2006989278);
											var17 = this.aClass68_8112.aShortArray584 = Class263_Sub4.method2637(this.aShortArray8095, 2123123843);
											var18 = this.aClass68_8112.aByteArray585 = IcmpService_Sub1.method6479(this.aByteArray8118, (byte) 2);
										}
										if (var19 == null) {
											Class68 var46 = var6.aClass68_8112 = new Class68();
											var19 = var46.aShortArray582 = Class263_Sub4.method2637(var11, 1685405412);
											var20 = var46.aShortArray583 = Class263_Sub4.method2637(var12, 1517185776);
											var21 = var46.aShortArray584 = Class263_Sub4.method2637(var13, 1525886814);
											var22 = var46.aByteArray585 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8108[var35];
										short var41 = this.aShortArray8109[var35];
										short var42 = this.aShortArray8095[var35];
										byte var43 = this.aByteArray8118[var35];
										var36 = var23[var38];
										var37 = var23[var38 + 1];
										int var44;
										int var45;
										for (var44 = var36; var44 < var37; var44++) {
											var45 = var24[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var22[var45] != 0) {
												var19[var45] += var47;
												var20[var45] += var41;
												var21[var45] += var42;
												var22[var45] += var43;
											}
										}
										var47 = var11[var39];
										var41 = var12[var39];
										var42 = var13[var39];
										var43 = var14[var39];
										var36 = this.anIntArray8143[var31];
										var37 = this.anIntArray8143[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8144[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var18[var45] != 0) {
												var15[var45] += var47;
												var16[var45] += var41;
												var17[var45] += var42;
												var18[var45] += var43;
											}
										}
										if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
											this.aClass44_8105.anInterface1_441 = null;
										}
										if (this.aClass44_8127 != null) {
											this.aClass44_8127.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 == null && var6.aClass44_8105 != null) {
											var6.aClass44_8105.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 != null) {
											var6.aClass44_8127.anInterface1_441 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.br(I)V")
	public void br(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8110[var4] = this.anIntArray8110[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.ah()I")
	public int ah() {
		return this.anInt8093;
	}

	@ObfuscatedName("Class387_Sub2.av()I")
	public int av() {
		return this.anInt8093;
	}

	@ObfuscatedName("Class387_Sub2.ar()I")
	public int ar() {
		return this.anInt8093;
	}

	public boolean method4471() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub1_8092.aClass73_8295.method835(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub2.au(I)V")
	public void au(int arg0) {
		this.anInt8093 = arg0;
		if (this.aClass68_8112 != null && (this.anInt8093 & 0x10000) == 0) {
			this.aShortArray8108 = this.aClass68_8112.aShortArray582;
			this.aShortArray8109 = this.aClass68_8112.aShortArray583;
			this.aShortArray8095 = this.aClass68_8112.aShortArray584;
			this.aByteArray8118 = this.aClass68_8112.aByteArray585;
			this.aClass68_8112 = null;
		}
		this.aBoolean8132 = true;
		this.method4518();
	}

	public boolean method4462() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub1_8092.aClass73_8295.method835(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub2.ao(I)V")
	public void ao(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.cz()I")
	public int cz() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8134;
	}

	public void method4475(Class247 arg0, Class80 arg1, int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt8107 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub1_8092.aClass249_8332;
		Class249 var5 = this.aClass_ra_Sub1_8092.aClass249_8430;
		Class249 var6 = this.aClass_ra_Sub1_8092.aClass249_8347;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub1_8092.aClass249_8422);
		if (!this.aBoolean8126) {
			this.method4528();
		}
		float[] var7 = this.aClass_ra_Sub1_8092.aFloatArray8260;
		var5.method2511(0.0F, (float) this.aShort8097, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.aShort8100, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub1_8092.aFloatArrayArray8303[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8134;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8134;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.aShort8145 + this.aShort8156 >> 1;
			int var36 = this.aShort8140 + this.aShort8141 >> 1;
			short var19 = this.aShort8097;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.aShort8100;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var26 / var28);
			} else {
				var33 = true;
			}
			float var29;
			float var30;
			if (var33) {
				if (var23 < -var24 && var27 < -var28) {
					var34 = false;
				} else {
					float var31;
					float var32;
					if (var23 < -var24) {
						var29 = (var23 + var24) / (var27 + var28) - 1.0F;
						var30 = var21 + var29 * (var25 - var21);
						var31 = var22 + var29 * (var26 - var22);
						var32 = var24 + var29 * (var28 - var24);
						arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt669 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt668 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub1_8092.method4840();
		this.aClass_ra_Sub1_8092.method4821(var5);
		this.method4520();
		this.aClass_ra_Sub1_8092.method4876();
		var5.method2483(this.aClass_ra_Sub1_8092.aClass249_8378);
		this.method4522(var5);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void method4525(Class_na_Sub2 arg0) {
		if (this.aClass_ra_Sub1_8092.anIntArray8291.length < this.anInt8107) {
			this.aClass_ra_Sub1_8092.anIntArray8291 = new int[this.anInt8107];
			this.aClass_ra_Sub1_8092.anIntArray8427 = new int[this.anInt8107];
		}
		int[] var2 = this.aClass_ra_Sub1_8092.anIntArray8291;
		int[] var3 = this.aClass_ra_Sub1_8092.anIntArray8427;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = (this.anIntArray8102[var4] - (this.anIntArray8110[var4] * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296) - arg0.anInt10165;
			var6 = (this.anIntArray8104[var4] - (this.anIntArray8110[var4] * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296) - arg0.anInt10161;
			var7 = this.anIntArray8143[var4];
			var8 = this.anIntArray8143[var4 + 1];
			for (var9 = var7; var9 < var8; var9++) {
				var10 = (this.aShortArray8144[var9] & 0xFFFF) - 1;
				if (var10 == -1) {
					break;
				}
				var2[var10] = var5;
				var3[var10] = var6;
			}
		}
		for (var4 = 0; var4 < this.anInt8116; var4++) {
			if (this.aByteArray8136 == null || this.aByteArray8136[var4] <= 128) {
				var5 = this.aShortArray8119[var4] & 0xFFFF;
				var6 = this.aShortArray8120[var4] & 0xFFFF;
				var7 = this.aShortArray8121[var4] & 0xFFFF;
				var8 = var2[var5];
				var9 = var2[var6];
				var10 = var2[var7];
				int var11 = var3[var5];
				int var12 = var3[var6];
				int var13 = var3[var7];
				if ((var8 - var9) * (var12 - var13) - (var12 - var11) * (var10 - var9) > 0) {
					arg0.method3529(var11, var12, var13, var8, var9, var10);
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.bc(I)V")
	public void bc(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var3 - this.anIntArray8104[var4] * var2 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8110[var4] * var2 + this.anIntArray8104[var4] * var3 >> 14;
			this.anIntArray8110[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.bf(I)V")
	public void bf(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8110[var4] = this.anIntArray8110[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.bl(I)V")
	public void bl(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8110[var4] = this.anIntArray8110[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.bk(I)V")
	public void bk(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8110[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8110[var4] = this.anIntArray8110[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.ya()I")
	public int ya() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8156;
	}

	@ObfuscatedName("Class387_Sub2.bi(III)V")
	public void bi(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			if (arg0 != 0) {
				this.anIntArray8102[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8110[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8104[var4] += arg2;
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public void method4491() {
		if (this.anInt8107 <= 0 || this.anInt8116 * 3 * -1431655765 <= 0) {
			return;
		}
		this.method4527(false);
		if ((this.aByte8138 & 0x10) == 0 && this.aClass37_8087.anInterface3_382 == null) {
			this.method4523(false);
		}
		this.method4518();
	}

	@ObfuscatedName("Class387_Sub2.cd()I")
	public int cd() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8156;
	}

	@ObfuscatedName("Class387_Sub2.by(IILClass_xa;LClass_xa;III)V")
	public void by(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var8 = arg4 + this.aShort8145;
		int var9 = arg4 + this.aShort8156;
		int var10 = arg6 + this.aShort8140;
		int var11 = arg6 + this.aShort8141;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6393 * -1805935063 * 24567321)) {
			return;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var9 = var9 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			var10 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var11 = var11 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			if (arg2.method6417(var8, var10, 1669346661) == arg5 && arg2.method6417(var9, var10, 374823114) == arg5 && arg2.method6417(var8, var11, 613202000) == arg5 && arg2.method6417(var9, var11, 1921271324) == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6393 * -1805935063 * 24567321) {
			return;
		}
		int var12;
		if (arg0 == 1) {
			for (var12 = 0; var12 < this.anInt8130; var12++) {
				this.anIntArray8110[var12] = this.anIntArray8110[var12] + arg2.method6416(this.anIntArray8102[var12] + arg4, this.anIntArray8104[var12] + arg6, -1377551655) - arg5;
			}
		} else {
			int var13;
			int var14;
			if (arg0 == 2) {
				short var19 = this.aShort8097;
				if (var19 == 0) {
					return;
				}
				for (var13 = 0; var13 < this.anInt8130; var13++) {
					var14 = (this.anIntArray8110[var13] << 16) / var19;
					if (var14 < arg1) {
						this.anIntArray8110[var13] += (arg2.method6416(this.anIntArray8102[var13] + arg4, this.anIntArray8104[var13] + arg6, 204744446) - arg5) * (arg1 - var14) / arg1;
					}
				}
			} else {
				int var15;
				if (arg0 == 3) {
					var12 = (arg1 & 0xFF) * 4;
					var13 = (arg1 >> 8 & 0xFF) * 4;
					var14 = (arg1 >> 16 & 0xFF) << 6;
					var15 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (var12 >> 1) < 0 || arg4 + (var12 >> 1) + arg2.anInt6395 * -1684509909 * 550173571 >= arg2.anInt6397 * -1250378663 * 1972554729 << arg2.anInt6396 * -786523509 * -1066304221 || arg6 - (var13 >> 1) < 0 || arg6 + (var13 >> 1) + arg2.anInt6395 * -1684509909 * 550173571 >= arg2.anInt6393 * -1805935063 * 24567321 << arg2.anInt6396 * -786523509 * -1066304221) {
						return;
					}
					this.method4447(arg2, arg4, arg5, arg6, var12, var13, var14, var15);
				} else if (arg0 == 4) {
					var12 = this.aShort8100 - this.aShort8097;
					for (var13 = 0; var13 < this.anInt8130; var13++) {
						this.anIntArray8110[var13] = this.anIntArray8110[var13] + (arg3.method6416(this.anIntArray8102[var13] + arg4, this.anIntArray8104[var13] + arg6, -1744871713) - arg5) + var12;
					}
				} else if (arg0 == 5) {
					var12 = this.aShort8100 - this.aShort8097;
					for (var13 = 0; var13 < this.anInt8130; var13++) {
						var14 = this.anIntArray8102[var13] + arg4;
						var15 = this.anIntArray8104[var13] + arg6;
						int var16 = arg2.method6416(var14, var15, -1182302202);
						int var17 = arg3.method6416(var14, var15, -1203357873);
						int var18 = var16 - var17 - arg1;
						this.anIntArray8110[var13] = ((this.anIntArray8110[var13] << 8) / var12 * var18 >> 8) - (arg5 - var16);
					}
				}
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public void method4472() {
	}

	@ObfuscatedName("Class387_Sub2.bx()V")
	public void bx() {
		for (int var1 = 0; var1 < this.anInt8115; var1++) {
			this.anIntArray8102[var1] = this.anIntArray8102[var1] + 7 >> 4;
			this.anIntArray8110[var1] = this.anIntArray8110[var1] + 7 >> 4;
			this.anIntArray8104[var1] = this.anIntArray8104[var1] + 7 >> 4;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public void method4473(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var21;
		int var22;
		int var23;
		if (arg0 == 0) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			var9 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					int[] var12 = this.anIntArrayArray8113[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						anInt8101 += this.anIntArray8102[var14];
						anInt8111 += this.anIntArray8110[var14];
						anInt8158 += this.anIntArray8104[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				anInt8101 = anInt8101 / var9 + var21;
				anInt8111 = anInt8111 / var9 + var22;
				anInt8158 = anInt8158 / var9 + var23;
			} else {
				anInt8101 = var21;
				anInt8111 = var22;
				anInt8158 = var23;
			}
			return;
		}
		int[] var24;
		int var25;
		if (arg0 == 1) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] += var21;
						this.anIntArray8110[var13] += var22;
						this.anIntArray8104[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8113.length) {
						var24 = this.anIntArrayArray8113[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8143[var13];
							var15 = this.anIntArray8143[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8144[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var18;
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8109[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8109[var17] = (short) (this.aShortArray8109[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8109[var17] * var19 - this.aShortArray8095[var17] * var18 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8109[var17] * var18 + this.aShortArray8095[var17] * var19 + 16383 >> 14);
									this.aShortArray8109[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8095[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8095[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
							}
						}
					}
				}
				if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
					this.aClass44_8105.anInterface1_441 = null;
				}
				if (this.aClass44_8127 != null) {
					this.aClass44_8127.anInterface1_441 = null;
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] -= anInt8101;
						this.anIntArray8110[var13] -= anInt8111;
						this.anIntArray8104[var13] -= anInt8158;
						this.anIntArray8102[var13] = this.anIntArray8102[var13] * arg2 >> 7;
						this.anIntArray8110[var13] = this.anIntArray8110[var13] * arg3 >> 7;
						this.anIntArray8104[var13] = this.anIntArray8104[var13] * arg4 >> 7;
						this.anIntArray8102[var13] += anInt8101;
						this.anIntArray8110[var13] += anInt8111;
						this.anIntArray8104[var13] += anInt8158;
					}
				}
			}
		} else {
			Class52 var26;
			Class40 var27;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8123.length) {
							var24 = this.anIntArrayArray8123[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var13 = var24[var25];
								var14 = (this.aByteArray8136[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8136[var13] = (byte) var14;
							}
							if (var24.length > 0 && this.aClass44_8105 != null) {
								this.aClass44_8105.anInterface1_441 = null;
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var9 = 0; var9 < this.anInt8147; var9++) {
							var26 = this.aClass52Array8148[var9];
							var27 = this.aClass40Array8149[var9];
							var27.anInt428 = var27.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var26.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var28;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt425 += arg2;
									var28.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt429 = var28.anInt429 * arg2 >> 7;
									var28.anInt426 = var28.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8150.length) {
							var24 = this.anIntArrayArray8150[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var28 = this.aClass40Array8149[var24[var25]];
								var28.anInt424 = var28.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8123.length) {
						var24 = this.anIntArrayArray8123[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3 / 4;
							if (var16 < 0) {
								var16 = 0;
							} else if (var16 > 7) {
								var16 = 7;
							}
							var17 += arg4;
							if (var17 < 0) {
								var17 = 0;
							} else if (var17 > 127) {
								var17 = 127;
							}
							this.modelColors[var13] = (short) (var15 << 10 | var16 << 7 | var17);
						}
						if (var24.length > 0 && this.aClass44_8105 != null) {
							this.aClass44_8105.anInterface1_441 = null;
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var9 = 0; var9 < this.anInt8147; var9++) {
						var26 = this.aClass52Array8148[var9];
						var27 = this.aClass40Array8149[var9];
						var27.anInt428 = var27.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var26.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	public void method4474(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var21;
		int var22;
		int var23;
		if (arg0 == 0) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			var9 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					int[] var12 = this.anIntArrayArray8113[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						anInt8101 += this.anIntArray8102[var14];
						anInt8111 += this.anIntArray8110[var14];
						anInt8158 += this.anIntArray8104[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				anInt8101 = anInt8101 / var9 + var21;
				anInt8111 = anInt8111 / var9 + var22;
				anInt8158 = anInt8158 / var9 + var23;
			} else {
				anInt8101 = var21;
				anInt8111 = var22;
				anInt8158 = var23;
			}
			return;
		}
		int[] var24;
		int var25;
		if (arg0 == 1) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] += var21;
						this.anIntArray8110[var13] += var22;
						this.anIntArray8104[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8113.length) {
						var24 = this.anIntArrayArray8113[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8143[var13];
							var15 = this.anIntArray8143[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8144[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var18;
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8109[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8109[var17] = (short) (this.aShortArray8109[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8109[var17] * var19 - this.aShortArray8095[var17] * var18 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8109[var17] * var18 + this.aShortArray8095[var17] * var19 + 16383 >> 14);
									this.aShortArray8109[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8095[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8095[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
							}
						}
					}
				}
				if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
					this.aClass44_8105.anInterface1_441 = null;
				}
				if (this.aClass44_8127 != null) {
					this.aClass44_8127.anInterface1_441 = null;
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] -= anInt8101;
						this.anIntArray8110[var13] -= anInt8111;
						this.anIntArray8104[var13] -= anInt8158;
						this.anIntArray8102[var13] = this.anIntArray8102[var13] * arg2 >> 7;
						this.anIntArray8110[var13] = this.anIntArray8110[var13] * arg3 >> 7;
						this.anIntArray8104[var13] = this.anIntArray8104[var13] * arg4 >> 7;
						this.anIntArray8102[var13] += anInt8101;
						this.anIntArray8110[var13] += anInt8111;
						this.anIntArray8104[var13] += anInt8158;
					}
				}
			}
		} else {
			Class52 var26;
			Class40 var27;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8123.length) {
							var24 = this.anIntArrayArray8123[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var13 = var24[var25];
								var14 = (this.aByteArray8136[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8136[var13] = (byte) var14;
							}
							if (var24.length > 0 && this.aClass44_8105 != null) {
								this.aClass44_8105.anInterface1_441 = null;
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var9 = 0; var9 < this.anInt8147; var9++) {
							var26 = this.aClass52Array8148[var9];
							var27 = this.aClass40Array8149[var9];
							var27.anInt428 = var27.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var26.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var28;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt425 += arg2;
									var28.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt429 = var28.anInt429 * arg2 >> 7;
									var28.anInt426 = var28.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8150.length) {
							var24 = this.anIntArrayArray8150[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var28 = this.aClass40Array8149[var24[var25]];
								var28.anInt424 = var28.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8123.length) {
						var24 = this.anIntArrayArray8123[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3 / 4;
							if (var16 < 0) {
								var16 = 0;
							} else if (var16 > 7) {
								var16 = 7;
							}
							var17 += arg4;
							if (var17 < 0) {
								var17 = 0;
							} else if (var17 > 127) {
								var17 = 127;
							}
							this.modelColors[var13] = (short) (var15 << 10 | var16 << 7 | var17);
						}
						if (var24.length > 0 && this.aClass44_8105 != null) {
							this.aClass44_8105.anInterface1_441 = null;
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var9 = 0; var9 < this.anInt8147; var9++) {
						var26 = this.aClass52Array8148[var9];
						var27 = this.aClass40Array8149[var9];
						var27.anInt428 = var27.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var26.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	public void method4451(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var21;
		int var22;
		int var23;
		if (arg0 == 0) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			var9 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					int[] var12 = this.anIntArrayArray8113[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						anInt8101 += this.anIntArray8102[var14];
						anInt8111 += this.anIntArray8110[var14];
						anInt8158 += this.anIntArray8104[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				anInt8101 = anInt8101 / var9 + var21;
				anInt8111 = anInt8111 / var9 + var22;
				anInt8158 = anInt8158 / var9 + var23;
			} else {
				anInt8101 = var21;
				anInt8111 = var22;
				anInt8158 = var23;
			}
			return;
		}
		int[] var24;
		int var25;
		if (arg0 == 1) {
			var21 = arg2 << 4;
			var22 = arg3 << 4;
			var23 = arg4 << 4;
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] += var21;
						this.anIntArray8110[var13] += var22;
						this.anIntArray8104[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8102[var13] -= anInt8101;
							this.anIntArray8110[var13] -= anInt8111;
							this.anIntArray8104[var13] -= anInt8158;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8110[var13] * var15 - this.anIntArray8104[var13] * var14 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8110[var13] * var14 + this.anIntArray8104[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8110[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8110[var13] = this.anIntArray8110[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8104[var13] * var14 + this.anIntArray8102[var13] * var15 + 16383 >> 14;
								this.anIntArray8104[var13] = this.anIntArray8104[var13] * var15 - this.anIntArray8102[var13] * var14 + 16383 >> 14;
								this.anIntArray8102[var13] = var16;
							}
							this.anIntArray8102[var13] += anInt8101;
							this.anIntArray8110[var13] += anInt8111;
							this.anIntArray8104[var13] += anInt8158;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8113.length) {
						var24 = this.anIntArrayArray8113[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8143[var13];
							var15 = this.anIntArray8143[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8144[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var18;
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8109[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8109[var17] = (short) (this.aShortArray8109[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8109[var17] * var19 - this.aShortArray8095[var17] * var18 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8109[var17] * var18 + this.aShortArray8095[var17] * var19 + 16383 >> 14);
									this.aShortArray8109[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8095[var17] * var18 + this.aShortArray8108[var17] * var19 + 16383 >> 14;
									this.aShortArray8095[var17] = (short) (this.aShortArray8095[var17] * var19 - this.aShortArray8108[var17] * var18 + 16383 >> 14);
									this.aShortArray8108[var17] = (short) var20;
								}
							}
						}
					}
				}
				if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
					this.aClass44_8105.anInterface1_441 = null;
				}
				if (this.aClass44_8127 != null) {
					this.aClass44_8127.anInterface1_441 = null;
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8113.length) {
					var24 = this.anIntArrayArray8113[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8102[var13] -= anInt8101;
						this.anIntArray8110[var13] -= anInt8111;
						this.anIntArray8104[var13] -= anInt8158;
						this.anIntArray8102[var13] = this.anIntArray8102[var13] * arg2 >> 7;
						this.anIntArray8110[var13] = this.anIntArray8110[var13] * arg3 >> 7;
						this.anIntArray8104[var13] = this.anIntArray8104[var13] * arg4 >> 7;
						this.anIntArray8102[var13] += anInt8101;
						this.anIntArray8110[var13] += anInt8111;
						this.anIntArray8104[var13] += anInt8158;
					}
				}
			}
		} else {
			Class52 var26;
			Class40 var27;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8123.length) {
							var24 = this.anIntArrayArray8123[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var13 = var24[var25];
								var14 = (this.aByteArray8136[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8136[var13] = (byte) var14;
							}
							if (var24.length > 0 && this.aClass44_8105 != null) {
								this.aClass44_8105.anInterface1_441 = null;
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var9 = 0; var9 < this.anInt8147; var9++) {
							var26 = this.aClass52Array8148[var9];
							var27 = this.aClass40Array8149[var9];
							var27.anInt428 = var27.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var26.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var28;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt425 += arg2;
									var28.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8150.length) {
								var24 = this.anIntArrayArray8150[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var28 = this.aClass40Array8149[var24[var25]];
									var28.anInt429 = var28.anInt429 * arg2 >> 7;
									var28.anInt426 = var28.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8150.length) {
							var24 = this.anIntArrayArray8150[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var28 = this.aClass40Array8149[var24[var25]];
								var28.anInt424 = var28.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8123.length) {
						var24 = this.anIntArrayArray8123[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3 / 4;
							if (var16 < 0) {
								var16 = 0;
							} else if (var16 > 7) {
								var16 = 7;
							}
							var17 += arg4;
							if (var17 < 0) {
								var17 = 0;
							} else if (var17 > 127) {
								var17 = 127;
							}
							this.modelColors[var13] = (short) (var15 << 10 | var16 << 7 | var17);
						}
						if (var24.length > 0 && this.aClass44_8105 != null) {
							this.aClass44_8105.anInterface1_441 = null;
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var9 = 0; var9 < this.anInt8147; var9++) {
						var26 = this.aClass52Array8148[var9];
						var27 = this.aClass40Array8149[var9];
						var27.anInt428 = var27.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var26.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.bu(IIII)V")
	public void bu(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var6 = 0; var6 < this.anInt8130; var6++) {
				anInt8101 += this.anIntArray8102[var6];
				anInt8111 += this.anIntArray8110[var6];
				anInt8158 += this.anIntArray8104[var6];
				var5++;
			}
			if (var5 > 0) {
				anInt8101 = anInt8101 / var5 + arg1;
				anInt8111 = anInt8111 / var5 + arg2;
				anInt8158 = anInt8158 / var5 + arg3;
			} else {
				anInt8101 = arg1;
				anInt8111 = arg2;
				anInt8158 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8130; var5++) {
				this.anIntArray8102[var5] += arg1;
				this.anIntArray8110[var5] += arg2;
				this.anIntArray8104[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8130; var5++) {
					this.anIntArray8102[var5] -= anInt8101;
					this.anIntArray8110[var5] -= anInt8111;
					this.anIntArray8104[var5] -= anInt8158;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8110[var5] * var6 + this.anIntArray8102[var5] * var7 + 16383 >> 14;
						this.anIntArray8110[var5] = this.anIntArray8110[var5] * var7 - this.anIntArray8102[var5] * var6 + 16383 >> 14;
						this.anIntArray8102[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8110[var5] * var7 - this.anIntArray8104[var5] * var6 + 16383 >> 14;
						this.anIntArray8104[var5] = this.anIntArray8110[var5] * var6 + this.anIntArray8104[var5] * var7 + 16383 >> 14;
						this.anIntArray8110[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8104[var5] * var6 + this.anIntArray8102[var5] * var7 + 16383 >> 14;
						this.anIntArray8104[var5] = this.anIntArray8104[var5] * var7 - this.anIntArray8102[var5] * var6 + 16383 >> 14;
						this.anIntArray8102[var5] = var8;
					}
					this.anIntArray8102[var5] += anInt8101;
					this.anIntArray8110[var5] += anInt8111;
					this.anIntArray8104[var5] += anInt8158;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8130; var5++) {
					this.anIntArray8102[var5] -= anInt8101;
					this.anIntArray8110[var5] -= anInt8111;
					this.anIntArray8104[var5] -= anInt8158;
					this.anIntArray8102[var5] = this.anIntArray8102[var5] * arg1 / 128;
					this.anIntArray8110[var5] = this.anIntArray8110[var5] * arg2 / 128;
					this.anIntArray8104[var5] = this.anIntArray8104[var5] * arg3 / 128;
					this.anIntArray8102[var5] += anInt8101;
					this.anIntArray8110[var5] += anInt8111;
					this.anIntArray8104[var5] += anInt8158;
				}
			} else {
				Class40 var10;
				Class52 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
						var6 = (this.aByteArray8136[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8136[var5] = (byte) var6;
					}
					if (this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass52Array8148 != null) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var11 = this.aClass52Array8148[var5];
							var10 = this.aClass40Array8149[var5];
							var10.anInt428 = var10.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var11.modelColorIndex] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
						var6 = this.modelColors[var5] & 0xFFFF;
						var7 = var6 >> 10 & 0x3F;
						var8 = var6 >> 7 & 0x7;
						int var9 = var6 & 0x7F;
						var7 = var7 + arg1 & 0x3F;
						var8 += arg2 / 4;
						if (var8 < 0) {
							var8 = 0;
						} else if (var8 > 7) {
							var8 = 7;
						}
						var9 += arg3;
						if (var9 < 0) {
							var9 = 0;
						} else if (var9 > 127) {
							var9 = 127;
						}
						this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
					}
					if (this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass52Array8148 != null) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var11 = this.aClass52Array8148[var5];
							var10 = this.aClass40Array8149[var5];
							var10.anInt428 = var10.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var11.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					Class40 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt425 += arg1;
							var12.anInt427 += arg2;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt429 = var12.anInt429 * arg1 >> 7;
							var12.anInt426 = var12.anInt426 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8147; var5++) {
							var12 = this.aClass40Array8149[var5];
							var12.anInt424 = var12.anInt424 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	public void method4477(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8106 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub1_8092.aClass247_8360;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8130; var6++) {
			if ((arg1 & this.aShortArray8106[var6]) != 0) {
				var4.method2465((float) this.anIntArray8102[var6], (float) this.anIntArray8110[var6], (float) this.anIntArray8104[var6], var5);
				this.anIntArray8102[var6] = (int) var5[0];
				this.anIntArray8110[var6] = (int) var5[1];
				this.anIntArray8104[var6] = (int) var5[2];
			}
		}
	}

	public void method4478(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8106 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub1_8092.aClass247_8360;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8130; var6++) {
			if ((arg1 & this.aShortArray8106[var6]) != 0) {
				var4.method2465((float) this.anIntArray8102[var6], (float) this.anIntArray8110[var6], (float) this.anIntArray8104[var6], var5);
				this.anIntArray8102[var6] = (int) var5[0];
				this.anIntArray8110[var6] = (int) var5[1];
				this.anIntArray8104[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.ed(I)V")
	public void ed(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			int var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public Class64[] method4452() {
		return this.aClass64Array8146;
	}

	public void method4440(Class247 arg0, Class80 arg1, int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt8107 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub1_8092.aClass249_8332;
		Class249 var5 = this.aClass_ra_Sub1_8092.aClass249_8430;
		Class249 var6 = this.aClass_ra_Sub1_8092.aClass249_8347;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub1_8092.aClass249_8422);
		if (!this.aBoolean8126) {
			this.method4528();
		}
		float[] var7 = this.aClass_ra_Sub1_8092.aFloatArray8260;
		var5.method2511(0.0F, (float) this.aShort8097, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.aShort8100, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub1_8092.aFloatArrayArray8303[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8134;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8134;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.aShort8145 + this.aShort8156 >> 1;
			int var36 = this.aShort8140 + this.aShort8141 >> 1;
			short var19 = this.aShort8097;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.aShort8100;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var26 / var28);
			} else {
				var33 = true;
			}
			float var29;
			float var30;
			if (var33) {
				if (var23 < -var24 && var27 < -var28) {
					var34 = false;
				} else {
					float var31;
					float var32;
					if (var23 < -var24) {
						var29 = (var23 + var24) / (var27 + var28) - 1.0F;
						var30 = var21 + var29 * (var25 - var21);
						var31 = var22 + var29 * (var26 - var22);
						var32 = var24 + var29 * (var28 - var24);
						arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt669 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt668 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub1_8092.method4840();
		this.aClass_ra_Sub1_8092.method4821(var5);
		this.method4520();
		this.aClass_ra_Sub1_8092.method4876();
		var5.method2483(this.aClass_ra_Sub1_8092.aClass249_8378);
		this.method4522(var5);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@ObfuscatedName("Class387_Sub2.wa()V")
	public void wa() {
		int var1;
		for (var1 = 0; var1 < this.anInt8130; var1++) {
			this.anIntArray8104[var1] = -this.anIntArray8104[var1];
		}
		for (var1 = 0; var1 < this.anInt8107; var1++) {
			this.aShortArray8095[var1] = (short) -this.aShortArray8095[var1];
		}
		for (var1 = 0; var1 < this.anInt8089 * -1431655765; var1++) {
			short var2 = this.aShortArray8119[var1];
			this.aShortArray8119[var1] = this.aShortArray8121[var1];
			this.aShortArray8121[var1] = var2;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		if (this.aClass37_8087 != null) {
			this.aClass37_8087.anInterface3_382 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.ce(LClass_na;)LClass_na;")
	public Class_na ce(Class_na arg0) {
		if (this.anInt8107 == 0) {
			return null;
		}
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var2;
		int var3;
		if (this.aClass_ra_Sub1_8092.anInt8410 > 0) {
			var2 = this.aShort8145 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
			var3 = this.aShort8156 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
		} else {
			var2 = this.aShort8145 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
			var3 = this.aShort8156 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8410 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
		}
		int var4;
		int var5;
		if (this.aClass_ra_Sub1_8092.anInt8379 > 0) {
			var4 = this.aShort8140 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
			var5 = this.aShort8141 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
		} else {
			var4 = this.aShort8140 - (this.aShort8097 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
			var5 = this.aShort8141 - (this.aShort8100 * this.aClass_ra_Sub1_8092.anInt8379 >> 8) >> this.aClass_ra_Sub1_8092.anInt8296 * -1431655765 * 3;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		Class_na_Sub2 var8 = (Class_na_Sub2) arg0;
		Class_na_Sub2 var9;
		if (var8 != null && var8.method3531(var6, var7)) {
			var9 = var8;
			var8.method3532();
		} else {
			var9 = new Class_na_Sub2(this.aClass_ra_Sub1_8092, var6, var7);
		}
		var9.method3530(var2, var4, var3, var5);
		this.method4525(var9);
		return var9;
	}

	@ObfuscatedName("Class387_Sub2.c()I")
	public int c() {
		return this.aShort8096;
	}

	@ObfuscatedName("Class387_Sub2.cj()I")
	public int cj() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8133;
	}

	@ObfuscatedName("Class387_Sub2.cy()I")
	public int cy() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8133;
	}

	public void method4466(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub2 var6 = (Class387_Sub2) arg0;
		if (this.anInt8089 * -1431655765 == 0 || var6.anInt8089 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8130;
		int[] var8 = var6.anIntArray8102;
		int[] var9 = var6.anIntArray8110;
		int[] var10 = var6.anIntArray8104;
		short[] var11 = var6.aShortArray8108;
		short[] var12 = var6.aShortArray8109;
		short[] var13 = var6.aShortArray8095;
		byte[] var14 = var6.aByteArray8118;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass68_8112 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass68_8112.aShortArray582;
			var16 = this.aClass68_8112.aShortArray583;
			var17 = this.aClass68_8112.aShortArray584;
			var18 = this.aClass68_8112.aByteArray585;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass68_8112 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass68_8112.aShortArray582;
			var20 = var6.aClass68_8112.aShortArray583;
			var21 = var6.aClass68_8112.aShortArray584;
			var22 = var6.aClass68_8112.aByteArray585;
		}
		int[] var23 = var6.anIntArray8143;
		short[] var24 = var6.aShortArray8144;
		if (!var6.aBoolean8126) {
			var6.method4528();
		}
		short var25 = var6.aShort8097;
		short var26 = var6.aShort8100;
		short var27 = var6.aShort8145;
		short var28 = var6.aShort8156;
		short var29 = var6.aShort8140;
		short var30 = var6.aShort8141;
		for (int var31 = 0; var31 < this.anInt8130; var31++) {
			int var32 = this.anIntArray8110[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8102[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8104[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8143[var31];
						int var37 = this.anIntArray8143[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8144[var38] - 1;
							if (var35 == -1 || this.aByteArray8118[var35] != 0) {
								break;
							}
						}
						if (var35 != -1) {
							for (var38 = 0; var38 < var7; var38++) {
								if (var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
									int var39 = -1;
									var36 = var23[var38];
									var37 = var23[var38 + 1];
									for (int var40 = var36; var40 < var37; var40++) {
										var39 = var24[var40] - 1;
										if (var39 == -1 || var14[var39] != 0) {
											break;
										}
									}
									if (var39 != -1) {
										if (var15 == null) {
											this.aClass68_8112 = new Class68();
											var15 = this.aClass68_8112.aShortArray582 = Class263_Sub4.method2637(this.aShortArray8108, 2033461305);
											var16 = this.aClass68_8112.aShortArray583 = Class263_Sub4.method2637(this.aShortArray8109, 1876535494);
											var17 = this.aClass68_8112.aShortArray584 = Class263_Sub4.method2637(this.aShortArray8095, 1486808295);
											var18 = this.aClass68_8112.aByteArray585 = IcmpService_Sub1.method6479(this.aByteArray8118, (byte) 2);
										}
										if (var19 == null) {
											Class68 var46 = var6.aClass68_8112 = new Class68();
											var19 = var46.aShortArray582 = Class263_Sub4.method2637(var11, 1765560439);
											var20 = var46.aShortArray583 = Class263_Sub4.method2637(var12, 1524089829);
											var21 = var46.aShortArray584 = Class263_Sub4.method2637(var13, 1729817608);
											var22 = var46.aByteArray585 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8108[var35];
										short var41 = this.aShortArray8109[var35];
										short var42 = this.aShortArray8095[var35];
										byte var43 = this.aByteArray8118[var35];
										var36 = var23[var38];
										var37 = var23[var38 + 1];
										int var44;
										int var45;
										for (var44 = var36; var44 < var37; var44++) {
											var45 = var24[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var22[var45] != 0) {
												var19[var45] += var47;
												var20[var45] += var41;
												var21[var45] += var42;
												var22[var45] += var43;
											}
										}
										var47 = var11[var39];
										var41 = var12[var39];
										var42 = var13[var39];
										var43 = var14[var39];
										var36 = this.anIntArray8143[var31];
										var37 = this.anIntArray8143[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8144[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var18[var45] != 0) {
												var15[var45] += var47;
												var16[var45] += var41;
												var17[var45] += var42;
												var18[var45] += var43;
											}
										}
										if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
											this.aClass44_8105.anInterface1_441 = null;
										}
										if (this.aClass44_8127 != null) {
											this.aClass44_8127.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 == null && var6.aClass44_8105 != null) {
											var6.aClass44_8105.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 != null) {
											var6.aClass44_8127.anInterface1_441 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.ct()I")
	public int ct() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8145;
	}

	@ObfuscatedName("Class387_Sub2.ka()V")
	public void ka() {
		for (int var1 = 0; var1 < this.anInt8115; var1++) {
			this.anIntArray8102[var1] = this.anIntArray8102[var1] + 7 >> 4;
			this.anIntArray8110[var1] = this.anIntArray8110[var1] + 7 >> 4;
			this.anIntArray8104[var1] = this.anIntArray8104[var1] + 7 >> 4;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	public void method4490(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub2 var6 = (Class387_Sub2) arg0;
		if (this.anInt8089 * -1431655765 == 0 || var6.anInt8089 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8130;
		int[] var8 = var6.anIntArray8102;
		int[] var9 = var6.anIntArray8110;
		int[] var10 = var6.anIntArray8104;
		short[] var11 = var6.aShortArray8108;
		short[] var12 = var6.aShortArray8109;
		short[] var13 = var6.aShortArray8095;
		byte[] var14 = var6.aByteArray8118;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass68_8112 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass68_8112.aShortArray582;
			var16 = this.aClass68_8112.aShortArray583;
			var17 = this.aClass68_8112.aShortArray584;
			var18 = this.aClass68_8112.aByteArray585;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass68_8112 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass68_8112.aShortArray582;
			var20 = var6.aClass68_8112.aShortArray583;
			var21 = var6.aClass68_8112.aShortArray584;
			var22 = var6.aClass68_8112.aByteArray585;
		}
		int[] var23 = var6.anIntArray8143;
		short[] var24 = var6.aShortArray8144;
		if (!var6.aBoolean8126) {
			var6.method4528();
		}
		short var25 = var6.aShort8097;
		short var26 = var6.aShort8100;
		short var27 = var6.aShort8145;
		short var28 = var6.aShort8156;
		short var29 = var6.aShort8140;
		short var30 = var6.aShort8141;
		for (int var31 = 0; var31 < this.anInt8130; var31++) {
			int var32 = this.anIntArray8110[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8102[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8104[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8143[var31];
						int var37 = this.anIntArray8143[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8144[var38] - 1;
							if (var35 == -1 || this.aByteArray8118[var35] != 0) {
								break;
							}
						}
						if (var35 != -1) {
							for (var38 = 0; var38 < var7; var38++) {
								if (var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
									int var39 = -1;
									var36 = var23[var38];
									var37 = var23[var38 + 1];
									for (int var40 = var36; var40 < var37; var40++) {
										var39 = var24[var40] - 1;
										if (var39 == -1 || var14[var39] != 0) {
											break;
										}
									}
									if (var39 != -1) {
										if (var15 == null) {
											this.aClass68_8112 = new Class68();
											var15 = this.aClass68_8112.aShortArray582 = Class263_Sub4.method2637(this.aShortArray8108, 1943862827);
											var16 = this.aClass68_8112.aShortArray583 = Class263_Sub4.method2637(this.aShortArray8109, 1953356479);
											var17 = this.aClass68_8112.aShortArray584 = Class263_Sub4.method2637(this.aShortArray8095, 1926160390);
											var18 = this.aClass68_8112.aByteArray585 = IcmpService_Sub1.method6479(this.aByteArray8118, (byte) 2);
										}
										if (var19 == null) {
											Class68 var46 = var6.aClass68_8112 = new Class68();
											var19 = var46.aShortArray582 = Class263_Sub4.method2637(var11, 1435030838);
											var20 = var46.aShortArray583 = Class263_Sub4.method2637(var12, 1445247275);
											var21 = var46.aShortArray584 = Class263_Sub4.method2637(var13, 2005637484);
											var22 = var46.aByteArray585 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8108[var35];
										short var41 = this.aShortArray8109[var35];
										short var42 = this.aShortArray8095[var35];
										byte var43 = this.aByteArray8118[var35];
										var36 = var23[var38];
										var37 = var23[var38 + 1];
										int var44;
										int var45;
										for (var44 = var36; var44 < var37; var44++) {
											var45 = var24[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var22[var45] != 0) {
												var19[var45] += var47;
												var20[var45] += var41;
												var21[var45] += var42;
												var22[var45] += var43;
											}
										}
										var47 = var11[var39];
										var41 = var12[var39];
										var42 = var13[var39];
										var43 = var14[var39];
										var36 = this.anIntArray8143[var31];
										var37 = this.anIntArray8143[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8144[var44] - 1;
											if (var45 == -1) {
												break;
											}
											if (var18[var45] != 0) {
												var15[var45] += var47;
												var16[var45] += var41;
												var17[var45] += var42;
												var18[var45] += var43;
											}
										}
										if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
											this.aClass44_8105.anInterface1_441 = null;
										}
										if (this.aClass44_8127 != null) {
											this.aClass44_8127.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 == null && var6.aClass44_8105 != null) {
											var6.aClass44_8105.anInterface1_441 = null;
										}
										if (var6.aClass44_8127 != null) {
											var6.aClass44_8127.anInterface1_441 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void paintTexture(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8089 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, -215101771);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, -1629780249);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8153 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass52Array8148 != null) {
			for (int var13 = 0; var13 < this.anInt8147; var13++) {
				Class52 var9 = this.aClass52Array8148[var13];
				Class40 var10 = this.aClass40Array8149[var13];
				var10.anInt428 = var10.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public Class387 method4526(Class387_Sub2 arg0, Class387_Sub2 arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.aByte8138 = 0;
		arg0.anInt8093 = arg2;
		arg0.anInt8094 = this.anInt8094;
		arg0.aShort8096 = this.aShort8096;
		arg0.aShort8099 = this.aShort8099;
		arg0.anInt8115 = this.anInt8115;
		arg0.anInt8130 = this.anInt8130;
		arg0.anInt8107 = this.anInt8107;
		arg0.anInt8089 = this.anInt8089;
		arg0.anInt8116 = this.anInt8116;
		arg0.anInt8147 = this.anInt8147;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean8098 = this.aBoolean8098;
		} else {
			arg0.aBoolean8098 = true;
		}
		arg0.aBoolean8153 = this.aBoolean8153;
		boolean var6 = Class41.method549(arg2, this.anInt8094);
		boolean var7 = Class41.method550(arg2, this.anInt8094);
		boolean var8 = Class41.method551(arg2, this.anInt8094);
		boolean var9 = var6 | var7 | var8;
		int var10;
		if (var9) {
			if (!var6) {
				arg0.anIntArray8102 = this.anIntArray8102;
			} else if (arg1.anIntArray8102 == null || arg1.anIntArray8102.length < this.anInt8115) {
				arg0.anIntArray8102 = arg1.anIntArray8102 = new int[this.anInt8115];
			} else {
				arg0.anIntArray8102 = arg1.anIntArray8102;
			}
			if (!var7) {
				arg0.anIntArray8110 = this.anIntArray8110;
			} else if (arg1.anIntArray8110 == null || arg1.anIntArray8110.length < this.anInt8115) {
				arg0.anIntArray8110 = arg1.anIntArray8110 = new int[this.anInt8115];
			} else {
				arg0.anIntArray8110 = arg1.anIntArray8110;
			}
			if (!var8) {
				arg0.anIntArray8104 = this.anIntArray8104;
			} else if (arg1.anIntArray8104 == null || arg1.anIntArray8104.length < this.anInt8115) {
				arg0.anIntArray8104 = arg1.anIntArray8104 = new int[this.anInt8115];
			} else {
				arg0.anIntArray8104 = arg1.anIntArray8104;
			}
			for (var10 = 0; var10 < this.anInt8115; var10++) {
				if (var6) {
					arg0.anIntArray8102[var10] = this.anIntArray8102[var10];
				}
				if (var7) {
					arg0.anIntArray8110[var10] = this.anIntArray8110[var10];
				}
				if (var8) {
					arg0.anIntArray8104[var10] = this.anIntArray8104[var10];
				}
			}
		} else {
			arg0.anIntArray8102 = this.anIntArray8102;
			arg0.anIntArray8110 = this.anIntArray8110;
			arg0.anIntArray8104 = this.anIntArray8104;
		}
		if (Class41.method561(arg2, this.anInt8094)) {
			if (arg3) {
				arg0.aByte8138 = (byte) (arg0.aByte8138 | 0x1);
			}
			arg0.aClass44_8125 = arg1.aClass44_8125;
			arg0.aClass44_8125.aByte443 = this.aClass44_8125.aByte443;
			arg0.aClass44_8125.anInterface1_441 = this.aClass44_8125.anInterface1_441;
		} else if (Class41.method573(arg2, this.anInt8094)) {
			arg0.aClass44_8125 = this.aClass44_8125;
		} else {
			arg0.aClass44_8125 = null;
		}
		if (Class41.method554(arg2, this.anInt8094)) {
			if (arg1.modelColors == null || arg1.modelColors.length < this.anInt8089 * -1431655765) {
				arg0.modelColors = arg1.modelColors = new short[this.anInt8089 * -1431655765];
			} else {
				arg0.modelColors = arg1.modelColors;
			}
			for (var10 = 0; var10 < this.anInt8089 * -1431655765; var10++) {
				arg0.modelColors[var10] = this.modelColors[var10];
			}
		} else {
			arg0.modelColors = this.modelColors;
		}
		if (Class41.method570(arg2, this.anInt8094)) {
			if (arg1.aByteArray8136 == null || arg1.aByteArray8136.length < this.anInt8089 * -1431655765) {
				arg0.aByteArray8136 = arg1.aByteArray8136 = new byte[this.anInt8089 * -1431655765];
			} else {
				arg0.aByteArray8136 = arg1.aByteArray8136;
			}
			for (var10 = 0; var10 < this.anInt8089 * -1431655765; var10++) {
				arg0.aByteArray8136[var10] = this.aByteArray8136[var10];
			}
		} else {
			arg0.aByteArray8136 = this.aByteArray8136;
		}
		if (Class41.method575(arg2, this.anInt8094)) {
			if (arg3) {
				arg0.aByte8138 = (byte) (arg0.aByte8138 | 0x2);
			}
			arg0.aClass44_8105 = arg1.aClass44_8105;
			arg0.aClass44_8105.aByte443 = this.aClass44_8105.aByte443;
			arg0.aClass44_8105.anInterface1_441 = this.aClass44_8105.anInterface1_441;
		} else if (Class41.method558(arg2, this.anInt8094)) {
			arg0.aClass44_8105 = this.aClass44_8105;
		} else {
			arg0.aClass44_8105 = null;
		}
		int var11;
		if (Class41.method553(arg2, this.anInt8094)) {
			if (arg1.aShortArray8108 == null || arg1.aShortArray8108.length < this.anInt8107) {
				var10 = this.anInt8107;
				arg0.aShortArray8108 = arg1.aShortArray8108 = new short[var10];
				arg0.aShortArray8109 = arg1.aShortArray8109 = new short[var10];
				arg0.aShortArray8095 = arg1.aShortArray8095 = new short[var10];
			} else {
				arg0.aShortArray8108 = arg1.aShortArray8108;
				arg0.aShortArray8109 = arg1.aShortArray8109;
				arg0.aShortArray8095 = arg1.aShortArray8095;
			}
			if (this.aClass68_8112 == null) {
				for (var10 = 0; var10 < this.anInt8107; var10++) {
					arg0.aShortArray8108[var10] = this.aShortArray8108[var10];
					arg0.aShortArray8109[var10] = this.aShortArray8109[var10];
					arg0.aShortArray8095[var10] = this.aShortArray8095[var10];
				}
			} else {
				if (arg1.aClass68_8112 == null) {
					arg1.aClass68_8112 = new Class68();
				}
				Class68 var12 = arg0.aClass68_8112 = arg1.aClass68_8112;
				if (var12.aShortArray582 == null || var12.aShortArray582.length < this.anInt8107) {
					var11 = this.anInt8107;
					var12.aShortArray582 = new short[var11];
					var12.aShortArray583 = new short[var11];
					var12.aShortArray584 = new short[var11];
					var12.aByteArray585 = new byte[var11];
				}
				for (var11 = 0; var11 < this.anInt8107; var11++) {
					arg0.aShortArray8108[var11] = this.aShortArray8108[var11];
					arg0.aShortArray8109[var11] = this.aShortArray8109[var11];
					arg0.aShortArray8095[var11] = this.aShortArray8095[var11];
					var12.aShortArray582[var11] = this.aClass68_8112.aShortArray582[var11];
					var12.aShortArray583[var11] = this.aClass68_8112.aShortArray583[var11];
					var12.aShortArray584[var11] = this.aClass68_8112.aShortArray584[var11];
					var12.aByteArray585[var11] = this.aClass68_8112.aByteArray585[var11];
				}
			}
			arg0.aByteArray8118 = this.aByteArray8118;
		} else {
			arg0.aClass68_8112 = this.aClass68_8112;
			arg0.aShortArray8108 = this.aShortArray8108;
			arg0.aShortArray8109 = this.aShortArray8109;
			arg0.aShortArray8095 = this.aShortArray8095;
			arg0.aByteArray8118 = this.aByteArray8118;
		}
		if (Class41.method578(arg2, this.anInt8094)) {
			if (arg3) {
				arg0.aByte8138 = (byte) (arg0.aByte8138 | 0x4);
			}
			arg0.aClass44_8127 = arg1.aClass44_8127;
			arg0.aClass44_8127.aByte443 = this.aClass44_8127.aByte443;
			arg0.aClass44_8127.anInterface1_441 = this.aClass44_8127.anInterface1_441;
		} else if (Class41.method562(arg2, this.anInt8094)) {
			arg0.aClass44_8127 = this.aClass44_8127;
		} else {
			arg0.aClass44_8127 = null;
		}
		if (Class41.method555(arg2, this.anInt8094)) {
			if (arg1.aFloatArray8129 == null || arg1.aFloatArray8129.length < this.anInt8089 * -1431655765) {
				var10 = this.anInt8107;
				arg0.aFloatArray8129 = arg1.aFloatArray8129 = new float[var10];
				arg0.aFloatArray8114 = arg1.aFloatArray8114 = new float[var10];
			} else {
				arg0.aFloatArray8129 = arg1.aFloatArray8129;
				arg0.aFloatArray8114 = arg1.aFloatArray8114;
			}
			for (var10 = 0; var10 < this.anInt8107; var10++) {
				arg0.aFloatArray8129[var10] = this.aFloatArray8129[var10];
				arg0.aFloatArray8114[var10] = this.aFloatArray8114[var10];
			}
		} else {
			arg0.aFloatArray8129 = this.aFloatArray8129;
			arg0.aFloatArray8114 = this.aFloatArray8114;
		}
		if (Class41.method577(arg2, this.anInt8094)) {
			if (arg3) {
				arg0.aByte8138 = (byte) (arg0.aByte8138 | 0x8);
			}
			arg0.aClass44_8128 = arg1.aClass44_8128;
			arg0.aClass44_8128.aByte443 = this.aClass44_8128.aByte443;
			arg0.aClass44_8128.anInterface1_441 = this.aClass44_8128.anInterface1_441;
		} else if (Class41.method559(arg2, this.anInt8094)) {
			arg0.aClass44_8128 = this.aClass44_8128;
		} else {
			arg0.aClass44_8128 = null;
		}
		if (Class41.method580(arg2, this.anInt8094)) {
			if (arg1.aShortArray8119 == null || arg1.aShortArray8119.length < this.anInt8089 * -1431655765) {
				var10 = this.anInt8089 * -1431655765;
				arg0.aShortArray8119 = arg1.aShortArray8119 = new short[var10];
				arg0.aShortArray8120 = arg1.aShortArray8120 = new short[var10];
				arg0.aShortArray8121 = arg1.aShortArray8121 = new short[var10];
			} else {
				arg0.aShortArray8119 = arg1.aShortArray8119;
				arg0.aShortArray8120 = arg1.aShortArray8120;
				arg0.aShortArray8121 = arg1.aShortArray8121;
			}
			for (var10 = 0; var10 < this.anInt8089 * -1431655765; var10++) {
				arg0.aShortArray8119[var10] = this.aShortArray8119[var10];
				arg0.aShortArray8120[var10] = this.aShortArray8120[var10];
				arg0.aShortArray8121[var10] = this.aShortArray8121[var10];
			}
		} else {
			arg0.aShortArray8119 = this.aShortArray8119;
			arg0.aShortArray8120 = this.aShortArray8120;
			arg0.aShortArray8121 = this.aShortArray8121;
		}
		if (Class41.method564(arg2, this.anInt8094)) {
			if (arg3) {
				arg0.aByte8138 = (byte) (arg0.aByte8138 | 0x10);
			}
			arg0.aClass37_8087 = arg1.aClass37_8087;
			arg0.aClass37_8087.anInterface3_382 = this.aClass37_8087.anInterface3_382;
		} else if (Class41.method560(arg2, this.anInt8094)) {
			arg0.aClass37_8087 = this.aClass37_8087;
		} else {
			arg0.aClass37_8087 = null;
		}
		if (Class41.method556(arg2, this.anInt8094)) {
			if (arg1.modelTextures == null || arg1.modelTextures.length < this.anInt8089 * -1431655765) {
				var10 = this.anInt8089 * -1431655765;
				arg0.modelTextures = arg1.modelTextures = new short[var10];
			} else {
				arg0.modelTextures = arg1.modelTextures;
			}
			for (var10 = 0; var10 < this.anInt8089 * -1431655765; var10++) {
				arg0.modelTextures[var10] = this.modelTextures[var10];
			}
		} else {
			arg0.modelTextures = this.modelTextures;
		}
		if (!Class41.method557(arg2, this.anInt8094)) {
			arg0.aClass40Array8149 = this.aClass40Array8149;
		} else if (arg1.aClass40Array8149 == null || arg1.aClass40Array8149.length < this.anInt8147) {
			var10 = this.anInt8147;
			arg0.aClass40Array8149 = arg1.aClass40Array8149 = new Class40[var10];
			for (var11 = 0; var11 < this.anInt8147; var11++) {
				arg0.aClass40Array8149[var11] = this.aClass40Array8149[var11].method548();
			}
		} else {
			arg0.aClass40Array8149 = arg1.aClass40Array8149;
			for (var10 = 0; var10 < this.anInt8147; var10++) {
				arg0.aClass40Array8149[var10].method547(this.aClass40Array8149[var10]);
			}
		}
		arg0.aClass52Array8148 = this.aClass52Array8148;
		if (this.aBoolean8126) {
			arg0.anInt8133 = this.anInt8133;
			arg0.anInt8134 = this.anInt8134;
			arg0.aShort8145 = this.aShort8145;
			arg0.aShort8156 = this.aShort8156;
			arg0.aShort8097 = this.aShort8097;
			arg0.aShort8100 = this.aShort8100;
			arg0.aShort8140 = this.aShort8140;
			arg0.aShort8141 = this.aShort8141;
			arg0.aBoolean8126 = true;
		} else {
			arg0.aBoolean8126 = false;
		}
		arg0.anIntArrayArray8113 = this.anIntArrayArray8113;
		arg0.anIntArrayArray8123 = this.anIntArrayArray8123;
		arg0.anIntArrayArray8150 = this.anIntArrayArray8150;
		arg0.aShortArray8144 = this.aShortArray8144;
		arg0.anIntArray8143 = this.anIntArray8143;
		arg0.aShortArray8106 = this.aShortArray8106;
		arg0.aShortArray8124 = this.aShortArray8124;
		arg0.anIntArray8142 = this.anIntArray8142;
		arg0.aClass93Array8135 = this.aClass93Array8135;
		arg0.aClass64Array8146 = this.aClass64Array8146;
		return arg0;
	}

	public void method4455() {
	}

	public Class387 method4468(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		Class387_Sub2 var5;
		Class387_Sub2 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass_ra_Sub1_8092.aClass387_Sub2Array8433[arg0 - 1];
			var5 = this.aClass_ra_Sub1_8092.aClass387_Sub2Array8432[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub2(this.aClass_ra_Sub1_8092);
		}
		return this.method4526(var5, var6, arg1, var4, arg2);
	}

	@ObfuscatedName("Class387_Sub2.ci()I")
	public int ci() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8100;
	}

	@ObfuscatedName("Class387_Sub2.cs()I")
	public int cs() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8140;
	}

	@ObfuscatedName("Class387_Sub2.cr()I")
	public int cr() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8141;
	}

	@ObfuscatedName("Class387_Sub2.cv(I)V")
	public void cv(int arg0) {
		this.aShort8096 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.ck(I)V")
	public void ck(int arg0) {
		this.aShort8096 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.as()[B")
	public byte[] as() {
		return this.aByteArray8136;
	}

	@ObfuscatedName("Class387_Sub2.cp(I)V")
	public void cp(int arg0) {
		this.aShort8096 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.cf(I)V")
	public void cf(int arg0) {
		this.aShort8099 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.cu(I)V")
	public void cu(int arg0) {
		this.aShort8099 = (short) arg0;
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.ca()I")
	public int ca() {
		return this.aShort8096;
	}

	@ObfuscatedName("Class387_Sub2.cg()I")
	public int cg() {
		return this.aShort8096;
	}

	public void method4527(boolean arg0) {
		boolean var2 = this.aClass44_8105 != null && this.aClass44_8105.anInterface1_441 == null;
		boolean var3 = this.aClass44_8127 != null && this.aClass44_8127.anInterface1_441 == null;
		boolean var4 = this.aClass44_8125 != null && this.aClass44_8125.anInterface1_441 == null;
		boolean var5 = this.aClass44_8128 != null && this.aClass44_8128.anInterface1_441 == null;
		if (arg0) {
			var2 &= (this.aByte8138 & 0x2) != 0;
			var3 &= (this.aByte8138 & 0x4) != 0;
			var4 &= (this.aByte8138 & 0x1) != 0;
			var5 &= (this.aByte8138 & 0x8) != 0;
		}
		byte var6 = 0;
		byte var7 = 0;
		byte var8 = 0;
		byte var9 = 0;
		byte var10 = 0;
		if (var4) {
			var7 = var6;
			var6 = (byte) (var6 + 12);
		}
		if (var2) {
			var8 = var6;
			var6 = (byte) (var6 + 4);
		}
		if (var3) {
			var9 = var6;
			var6 = (byte) (var6 + 12);
		}
		if (var5) {
			var10 = var6;
			var6 = (byte) (var6 + 8);
		}
		if (var6 == 0) {
			return;
		}
		if (this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381.payload.length < this.anInt8107 * var6) {
			this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1((this.anInt8107 + 100) * var6);
		} else {
			this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381.offset = 0;
		}
		Class330_Sub46_Sub1 var11 = this.aClass_ra_Sub1_8092.aClass330_Sub46_Sub1_8381;
		int var12;
		int var13;
		int var18;
		int var19;
		if (var4) {
			int var14;
			int var15;
			int var16;
			int var17;
			if (this.aClass_ra_Sub1_8092.aBoolean8407) {
				for (var12 = 0; var12 < this.anInt8130; var12++) {
					var13 = Stream.floatToRawIntBits((float) this.anIntArray8102[var12]);
					var14 = Stream.floatToRawIntBits((float) this.anIntArray8110[var12]);
					var15 = Stream.floatToRawIntBits((float) this.anIntArray8104[var12]);
					var16 = this.anIntArray8143[var12];
					var17 = this.anIntArray8143[var12 + 1];
					for (var18 = var16; var18 < var17; var18++) {
						var19 = this.aShortArray8144[var18] - 1;
						if (var19 == -1) {
							break;
						}
						var11.offset = var19 * var6;
						var11.addInt(var13, 1965508160);
						var11.addInt(var14, 1965508160);
						var11.addInt(var15, 1965508160);
					}
				}
			} else {
				for (var12 = 0; var12 < this.anInt8130; var12++) {
					var13 = Stream.floatToRawIntBits((float) this.anIntArray8102[var12]);
					var14 = Stream.floatToRawIntBits((float) this.anIntArray8110[var12]);
					var15 = Stream.floatToRawIntBits((float) this.anIntArray8104[var12]);
					var16 = this.anIntArray8143[var12];
					var17 = this.anIntArray8143[var12 + 1];
					for (var18 = var16; var18 < var17; var18++) {
						var19 = (this.aShortArray8144[var18] & 0xFFFF) - 1;
						if (var19 == -1) {
							break;
						}
						var11.offset = var19 * var6;
						var11.method3813(var13, (byte) 25);
						var11.method3813(var14, (byte) 16);
						var11.method3813(var15, (byte) 77);
					}
				}
			}
		}
		float var20;
		short[] var34;
		short[] var35;
		short[] var36;
		byte[] var37;
		float var38;
		float var39;
		if (var2) {
			if (this.aClass44_8127 == null) {
				if (this.aClass68_8112 == null) {
					var34 = this.aShortArray8108;
					var35 = this.aShortArray8109;
					var36 = this.aShortArray8095;
					var37 = this.aByteArray8118;
				} else {
					var34 = this.aClass68_8112.aShortArray582;
					var35 = this.aClass68_8112.aShortArray583;
					var36 = this.aClass68_8112.aShortArray584;
					var37 = this.aClass68_8112.aByteArray585;
				}
				var38 = this.aClass_ra_Sub1_8092.aFloatArray8366[0];
				var39 = this.aClass_ra_Sub1_8092.aFloatArray8366[1];
				float var40 = this.aClass_ra_Sub1_8092.aFloatArray8366[2];
				float var41 = this.aClass_ra_Sub1_8092.aFloat8372;
				var20 = this.aClass_ra_Sub1_8092.aFloat8373 * 768.0F / (float) this.aShort8099;
				float var21 = this.aClass_ra_Sub1_8092.aFloat8374 * 768.0F / (float) this.aShort8099;
				for (int var22 = 0; var22 < this.anInt8089 * -1431655765; var22++) {
					int var23 = this.method4519(this.modelColors[var22], this.modelTextures[var22], this.aShort8096, this.aByteArray8136[var22]);
					float var24 = (float) (var23 >>> 24) * this.aClass_ra_Sub1_8092.aFloat8250;
					float var25 = (float) (var23 >> 16 & 0xFF) * this.aClass_ra_Sub1_8092.aFloat8370;
					float var26 = (float) (var23 >> 8 & 0xFF) * this.aClass_ra_Sub1_8092.aFloat8371;
					short var27 = this.aShortArray8119[var22];
					short var28 = (short) var37[var27];
					float var29;
					if (var28 == 0) {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) * 0.0026041667F;
					} else {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) / (float) (var28 * 256);
					}
					float var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
					int var31 = (int) (var24 * var30);
					if (var31 < 0) {
						var31 = 0;
					} else if (var31 > 255) {
						var31 = 255;
					}
					int var32 = (int) (var25 * var30);
					if (var32 < 0) {
						var32 = 0;
					} else if (var32 > 255) {
						var32 = 255;
					}
					int var33 = (int) (var26 * var30);
					if (var33 < 0) {
						var33 = 0;
					} else if (var33 > 255) {
						var33 = 255;
					}
					var11.offset = var8 + var27 * var6;
					var11.addByte(var31, (byte) 41);
					var11.addByte(var32, (byte) 57);
					var11.addByte(var33, (byte) 105);
					var11.addByte(255 - (this.aByteArray8136[var22] & 0xFF), (byte) 47);
					var27 = this.aShortArray8120[var22];
					var28 = var37[var27];
					if (var28 == 0) {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) * 0.0026041667F;
					} else {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) / (float) (var28 * 256);
					}
					var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
					var31 = (int) (var24 * var30);
					if (var31 < 0) {
						var31 = 0;
					} else if (var31 > 255) {
						var31 = 255;
					}
					var32 = (int) (var25 * var30);
					if (var32 < 0) {
						var32 = 0;
					} else if (var32 > 255) {
						var32 = 255;
					}
					var33 = (int) (var26 * var30);
					if (var33 < 0) {
						var33 = 0;
					} else if (var33 > 255) {
						var33 = 255;
					}
					var11.offset = var8 + var27 * var6;
					var11.addByte(var31, (byte) 36);
					var11.addByte(var32, (byte) 31);
					var11.addByte(var33, (byte) 6);
					var11.addByte(255 - (this.aByteArray8136[var22] & 0xFF), (byte) 109);
					var27 = this.aShortArray8121[var22];
					var28 = var37[var27];
					if (var28 == 0) {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) * 0.0026041667F;
					} else {
						var29 = (var38 * (float) var34[var27] + var39 * (float) var35[var27] + var40 * (float) var36[var27]) / (float) (var28 * 256);
					}
					var30 = var41 + var29 * (var29 < 0.0F ? var21 : var20);
					var31 = (int) (var24 * var30);
					if (var31 < 0) {
						var31 = 0;
					} else if (var31 > 255) {
						var31 = 255;
					}
					var32 = (int) (var25 * var30);
					if (var32 < 0) {
						var32 = 0;
					} else if (var32 > 255) {
						var32 = 255;
					}
					var33 = (int) (var26 * var30);
					if (var33 < 0) {
						var33 = 0;
					} else if (var33 > 255) {
						var33 = 255;
					}
					var11.offset = var8 + var27 * var6;
					var11.addByte(var31, (byte) 92);
					var11.addByte(var32, (byte) 117);
					var11.addByte(var33, (byte) 39);
					var11.addByte(255 - (this.aByteArray8136[var22] & 0xFF), (byte) 100);
				}
			} else {
				for (var12 = 0; var12 < this.anInt8089 * -1431655765; var12++) {
					var13 = this.method4519(this.modelColors[var12], this.modelTextures[var12], this.aShort8096, this.aByteArray8136[var12]);
					var11.offset = var8 + (this.aShortArray8119[var12] & 0xFFFF) * var6;
					var11.addInt(var13, 1965508160);
					var11.offset = var8 + (this.aShortArray8120[var12] & 0xFFFF) * var6;
					var11.addInt(var13, 1965508160);
					var11.offset = var8 + (this.aShortArray8121[var12] & 0xFFFF) * var6;
					var11.addInt(var13, 1965508160);
				}
			}
		}
		if (var3) {
			if (this.aClass68_8112 == null) {
				var34 = this.aShortArray8108;
				var35 = this.aShortArray8109;
				var36 = this.aShortArray8095;
				var37 = this.aByteArray8118;
			} else {
				var34 = this.aClass68_8112.aShortArray582;
				var35 = this.aClass68_8112.aShortArray583;
				var36 = this.aClass68_8112.aShortArray584;
				var37 = this.aClass68_8112.aByteArray585;
			}
			var38 = 3.0F / (float) this.aShort8099;
			var39 = 3.0F / (float) (this.aShort8099 + this.aShort8099 / 2);
			var11.offset = var9;
			if (this.aClass_ra_Sub1_8092.aBoolean8407) {
				for (var18 = 0; var18 < this.anInt8107; var18++) {
					var19 = var37[var18] & 0xFF;
					if (var19 == 0) {
						var11.method3819((float) var34[var18] * var39);
						var11.method3819((float) var35[var18] * var39);
						var11.method3819((float) var36[var18] * var39);
					} else {
						var20 = var38 / (float) var19;
						var11.method3819((float) var34[var18] * var20);
						var11.method3819((float) var35[var18] * var20);
						var11.method3819((float) var36[var18] * var20);
					}
					var11.offset += var6 - 12;
				}
			} else {
				for (var18 = 0; var18 < this.anInt8107; var18++) {
					var19 = var37[var18] & 0xFF;
					if (var19 == 0) {
						var11.method3818((float) var34[var18] * var39);
						var11.method3818((float) var35[var18] * var39);
						var11.method3818((float) var36[var18] * var39);
					} else {
						var20 = var38 / (float) var19;
						var11.method3818((float) var34[var18] * var20);
						var11.method3818((float) var35[var18] * var20);
						var11.method3818((float) var36[var18] * var20);
					}
					var11.offset += var6 - 12;
				}
			}
		}
		if (var5) {
			var11.offset = var10;
			if (this.aClass_ra_Sub1_8092.aBoolean8407) {
				for (var12 = 0; var12 < this.anInt8107; var12++) {
					var11.method3819(this.aFloatArray8129[var12]);
					var11.method3819(this.aFloatArray8114[var12]);
					var11.offset += var6 - 8;
				}
			} else {
				for (var12 = 0; var12 < this.anInt8107; var12++) {
					var11.method3818(this.aFloatArray8129[var12]);
					var11.method3818(this.aFloatArray8114[var12]);
					var11.offset += var6 - 8;
				}
			}
		}
		var11.offset = var6 * this.anInt8107;
		Interface1 var42;
		if (arg0) {
			if (this.anInterface1_8131 == null) {
				this.anInterface1_8131 = this.aClass_ra_Sub1_8092.method4835(var6, var11.payload, var11.offset, true);
			} else {
				this.anInterface1_8131.method12(var6, var11.payload, var11.offset);
			}
			var42 = this.anInterface1_8131;
			this.aByte8138 = 0;
		} else {
			var42 = this.aClass_ra_Sub1_8092.method4835(var6, var11.payload, var11.offset, false);
			this.aBoolean8132 = true;
		}
		if (var4) {
			this.aClass44_8125.anInterface1_441 = var42;
			this.aClass44_8125.aByte443 = var7;
		}
		if (var5) {
			this.aClass44_8128.anInterface1_441 = var42;
			this.aClass44_8128.aByte443 = var10;
		}
		if (var2) {
			this.aClass44_8105.anInterface1_441 = var42;
			this.aClass44_8105.aByte443 = var8;
		}
		if (var3) {
			this.aClass44_8127.anInterface1_441 = var42;
			this.aClass44_8127.aByte443 = var9;
		}
	}

	@ObfuscatedName("Class387_Sub2.ei()Z")
	public boolean ei() {
		if (this.anIntArrayArray8113 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.anInt8115; var1++) {
			this.anIntArray8102[var1] <<= 0x4;
			this.anIntArray8110[var1] <<= 0x4;
			this.anIntArray8104[var1] <<= 0x4;
		}
		anInt8101 = 0;
		anInt8111 = 0;
		anInt8158 = 0;
		return true;
	}

	@ObfuscatedName("Class387_Sub2.db()I")
	public int db() {
		return this.aShort8099;
	}

	public void method4528() {
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		int var7 = 0;
		int var8 = 0;
		for (int var9 = 0; var9 < this.anInt8130; var9++) {
			int var10 = this.anIntArray8102[var9];
			int var11 = this.anIntArray8110[var9];
			int var12 = this.anIntArray8104[var9];
			if (var10 < var1) {
				var1 = var10;
			}
			if (var10 > var4) {
				var4 = var10;
			}
			if (var11 < var2) {
				var2 = var11;
			}
			if (var11 > var5) {
				var5 = var11;
			}
			if (var12 < var3) {
				var3 = var12;
			}
			if (var12 > var6) {
				var6 = var12;
			}
			int var13 = var10 * var10 + var12 * var12;
			if (var13 > var7) {
				var7 = var13;
			}
			var13 = var10 * var10 + var12 * var12 + var11 * var11;
			if (var13 > var8) {
				var8 = var13;
			}
		}
		this.aShort8145 = (short) var1;
		this.aShort8156 = (short) var4;
		this.aShort8097 = (short) var2;
		this.aShort8100 = (short) var5;
		this.aShort8140 = (short) var3;
		this.aShort8141 = (short) var6;
		this.anInt8134 = (int) (Math.sqrt((double) var7) + 0.99D);
		this.anInt8133 = (int) (Math.sqrt((double) var8) + 0.99D);
		this.aBoolean8126 = true;
	}

	@ObfuscatedName("Class387_Sub2.dg()[B")
	public byte[] dg() {
		return this.aByteArray8136;
	}

	@ObfuscatedName("Class387_Sub2.pa(IILClass_xa;LClass_xa;III)V")
	public void pa(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var8 = arg4 + this.aShort8145;
		int var9 = arg4 + this.aShort8156;
		int var10 = arg6 + this.aShort8140;
		int var11 = arg6 + this.aShort8141;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6397 || var10 < 0 || var11 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6393)) {
			return;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396;
			var9 = var9 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			var10 >>= arg2.anInt6396;
			var11 = var11 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			if (arg2.method6417(var8, var10, 963349488) == arg5 && arg2.method6417(var9, var10, -198118842) == arg5 && arg2.method6417(var8, var11, -1806710163) == arg5 && arg2.method6417(var9, var11, -1574718359) == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6397 || var10 < 0 || var11 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6393) {
			return;
		}
		int var12;
		if (arg0 == 1) {
			for (var12 = 0; var12 < this.anInt8130; var12++) {
				this.anIntArray8110[var12] = this.anIntArray8110[var12] + arg2.method6416(this.anIntArray8102[var12] + arg4, this.anIntArray8104[var12] + arg6, 1880434010) - arg5;
			}
		} else {
			int var13;
			int var14;
			if (arg0 == 2) {
				short var19 = this.aShort8097;
				if (var19 == 0) {
					return;
				}
				for (var13 = 0; var13 < this.anInt8130; var13++) {
					var14 = (this.anIntArray8110[var13] << 16) / var19;
					if (var14 < arg1) {
						this.anIntArray8110[var13] += (arg2.method6416(this.anIntArray8102[var13] + arg4, this.anIntArray8104[var13] + arg6, -864052559) - arg5) * (arg1 - var14) / arg1;
					}
				}
			} else {
				int var15;
				if (arg0 == 3) {
					var12 = (arg1 & 0xFF) * 4;
					var13 = (arg1 >> 8 & 0xFF) * 4;
					var14 = (arg1 >> 16 & 0xFF) << 6;
					var15 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (var12 >> 1) < 0 || arg4 + (var12 >> 1) + arg2.anInt6395 >= arg2.anInt6397 << arg2.anInt6396 || arg6 - (var13 >> 1) < 0 || arg6 + (var13 >> 1) + arg2.anInt6395 >= arg2.anInt6393 << arg2.anInt6396) {
						return;
					}
					this.method4447(arg2, arg4, arg5, arg6, var12, var13, var14, var15);
				} else if (arg0 == 4) {
					var12 = this.aShort8100 - this.aShort8097;
					for (var13 = 0; var13 < this.anInt8130; var13++) {
						this.anIntArray8110[var13] = this.anIntArray8110[var13] + (arg3.method6416(this.anIntArray8102[var13] + arg4, this.anIntArray8104[var13] + arg6, -1613302016) - arg5) + var12;
					}
				} else if (arg0 == 5) {
					var12 = this.aShort8100 - this.aShort8097;
					for (var13 = 0; var13 < this.anInt8130; var13++) {
						var14 = this.anIntArray8102[var13] + arg4;
						var15 = this.anIntArray8104[var13] + arg6;
						int var16 = arg2.method6416(var14, var15, -884313570);
						int var17 = arg3.method6416(var14, var15, 811146717);
						int var18 = var16 - var17 - arg1;
						this.anIntArray8110[var13] = ((this.anIntArray8110[var13] << 8) / var12 * var18 >> 8) - (arg5 - var16);
					}
				}
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.dr()[B")
	public byte[] dr() {
		return this.aByteArray8136;
	}

	public void method_do(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.da(SS)V")
	public void da(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.dh(SS)V")
	public void dh(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.be(III)V")
	public void be(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			if (arg0 != 128) {
				this.anIntArray8102[var4] = this.anIntArray8102[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray8110[var4] = this.anIntArray8110[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray8104[var4] = this.anIntArray8104[var4] * arg2 >> 7;
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.cm()I")
	public int cm() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8097;
	}

	public void method4482(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				this.aByteArray8136[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8136[var3] = (byte) var4;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public void method4486(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				this.aByteArray8136[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8136[var3] = (byte) var4;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.dj(SS)V")
	public void dj(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8089 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, 691779059);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, 894033081);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8153 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass52Array8148 != null) {
			for (int var13 = 0; var13 < this.anInt8147; var13++) {
				Class52 var9 = this.aClass52Array8148[var13];
				Class40 var10 = this.aClass40Array8149[var13];
				var10.anInt428 = var10.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.dq(SS)V")
	public void dq(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8089 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass52Array8148 != null) {
			for (var3 = 0; var3 < this.anInt8147; var3++) {
				Class52 var4 = this.aClass52Array8148[var3];
				Class40 var5 = this.aClass40Array8149[var3];
				var5.anInt428 = var5.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.dm(IIII)V")
	public void dm(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
			int var6 = this.modelColors[var5] & 0xFFFF;
			int var7 = var6 >> 10 & 0x3F;
			int var8 = var6 >> 7 & 0x7;
			int var9 = var6 & 0x7F;
			if (arg0 != -1) {
				var7 += (arg0 - var7) * arg3 >> 7;
			}
			if (arg1 != -1) {
				var8 += (arg1 - var8) * arg3 >> 7;
			}
			if (arg2 != -1) {
				var9 += (arg2 - var9) * arg3 >> 7;
			}
			this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.aClass52Array8148 != null) {
			for (var5 = 0; var5 < this.anInt8147; var5++) {
				Class52 var10 = this.aClass52Array8148[var5];
				Class40 var11 = this.aClass40Array8149[var5];
				var11.anInt428 = var11.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.du(IIII)V")
	public void du(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
			int var6 = this.modelColors[var5] & 0xFFFF;
			int var7 = var6 >> 10 & 0x3F;
			int var8 = var6 >> 7 & 0x7;
			int var9 = var6 & 0x7F;
			if (arg0 != -1) {
				var7 += (arg0 - var7) * arg3 >> 7;
			}
			if (arg1 != -1) {
				var8 += (arg1 - var8) * arg3 >> 7;
			}
			if (arg2 != -1) {
				var9 += (arg2 - var9) * arg3 >> 7;
			}
			this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.aClass52Array8148 != null) {
			for (var5 = 0; var5 < this.anInt8147; var5++) {
				Class52 var10 = this.aClass52Array8148[var5];
				Class40 var11 = this.aClass40Array8149[var5];
				var11.anInt428 = var11.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.df(IIII)V")
	public void df(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8089 * -1431655765; var5++) {
			int var6 = this.modelColors[var5] & 0xFFFF;
			int var7 = var6 >> 10 & 0x3F;
			int var8 = var6 >> 7 & 0x7;
			int var9 = var6 & 0x7F;
			if (arg0 != -1) {
				var7 += (arg0 - var7) * arg3 >> 7;
			}
			if (arg1 != -1) {
				var8 += (arg1 - var8) * arg3 >> 7;
			}
			if (arg2 != -1) {
				var9 += (arg2 - var9) * arg3 >> 7;
			}
			this.modelColors[var5] = (short) (var7 << 10 | var8 << 7 | var9);
		}
		if (this.aClass52Array8148 != null) {
			for (var5 = 0; var5 < this.anInt8147; var5++) {
				Class52 var10 = this.aClass52Array8148[var5];
				Class40 var11 = this.aClass40Array8149[var5];
				var11.anInt428 = var11.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	public Class93[] method4476() {
		return this.aClass93Array8135;
	}

	public boolean method4469(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		Class249 var6 = this.aClass_ra_Sub1_8092.aClass249_8430;
		var6.method2508(arg2);
		var6.method2483(this.aClass_ra_Sub1_8092.aClass249_8422);
		boolean var7 = false;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		int var10 = Integer.MAX_VALUE;
		int var11 = Integer.MIN_VALUE;
		if (!this.aBoolean8126) {
			this.method4528();
		}
		int var12 = this.aShort8156 - this.aShort8145 >> 1;
		int var13 = this.aShort8100 - this.aShort8097 >> 1;
		int var14 = this.aShort8141 - this.aShort8140 >> 1;
		int var15 = this.aShort8145 + var12;
		int var16 = this.aShort8097 + var13;
		int var17 = this.aShort8140 + var14;
		int var18 = var15 - (var12 << arg4);
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = var15 + (var12 << arg4);
		int var22 = var16 + (var13 << arg4);
		int var23 = var17 + (var14 << arg4);
		anIntArray8103[0] = var18;
		anIntArray8154[0] = var19;
		anIntArray8155[0] = var20;
		anIntArray8103[1] = var21;
		anIntArray8154[1] = var19;
		anIntArray8155[1] = var20;
		anIntArray8103[2] = var18;
		anIntArray8154[2] = var22;
		anIntArray8155[2] = var20;
		anIntArray8103[3] = var21;
		anIntArray8154[3] = var22;
		anIntArray8155[3] = var20;
		anIntArray8103[4] = var18;
		anIntArray8154[4] = var19;
		anIntArray8155[4] = var23;
		anIntArray8103[5] = var21;
		anIntArray8154[5] = var19;
		anIntArray8155[5] = var23;
		anIntArray8103[6] = var18;
		anIntArray8154[6] = var22;
		anIntArray8155[6] = var23;
		anIntArray8103[7] = var21;
		anIntArray8154[7] = var22;
		anIntArray8155[7] = var23;
		int var26;
		int var27;
		float var30;
		float var31;
		int var32;
		int var33;
		for (int var24 = 0; var24 < 8; var24++) {
			int var25 = anIntArray8103[var24];
			var26 = anIntArray8154[var24];
			var27 = anIntArray8155[var24];
			float var28 = var6.aFloatArray2631[2] * (float) var25 + var6.aFloatArray2631[6] * (float) var26 + var6.aFloatArray2631[10] * (float) var27 + var6.aFloatArray2631[14];
			float var29 = var6.aFloatArray2631[3] * (float) var25 + var6.aFloatArray2631[7] * (float) var26 + var6.aFloatArray2631[11] * (float) var27 + var6.aFloatArray2631[15];
			if (var28 >= -var29) {
				var30 = var6.aFloatArray2631[0] * (float) var25 + var6.aFloatArray2631[4] * (float) var26 + var6.aFloatArray2631[8] * (float) var27 + var6.aFloatArray2631[12];
				var31 = var6.aFloatArray2631[1] * (float) var25 + var6.aFloatArray2631[5] * (float) var26 + var6.aFloatArray2631[9] * (float) var27 + var6.aFloatArray2631[13];
				var32 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var29);
				var33 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var29);
				if (var32 < var8) {
					var8 = var32;
				}
				if (var32 > var9) {
					var9 = var32;
				}
				if (var33 < var10) {
					var10 = var33;
				}
				if (var33 > var11) {
					var11 = var33;
				}
				var7 = true;
			}
		}
		if (var7 && arg0 > var8 && arg0 < var9 && arg1 > var10 && arg1 < var11) {
			if (arg3) {
				return true;
			}
			if (this.aClass_ra_Sub1_8092.anIntArray8291.length < this.anInt8107) {
				this.aClass_ra_Sub1_8092.anIntArray8291 = new int[this.anInt8107];
				this.aClass_ra_Sub1_8092.anIntArray8427 = new int[this.anInt8107];
			}
			int[] var38 = this.aClass_ra_Sub1_8092.anIntArray8291;
			int[] var39 = this.aClass_ra_Sub1_8092.anIntArray8427;
			for (var26 = 0; var26 < this.anInt8130; var26++) {
				var27 = this.anIntArray8102[var26];
				int var40 = this.anIntArray8110[var26];
				int var41 = this.anIntArray8104[var26];
				var30 = var6.aFloatArray2631[2] * (float) var27 + var6.aFloatArray2631[6] * (float) var40 + var6.aFloatArray2631[10] * (float) var41 + var6.aFloatArray2631[14];
				var31 = var6.aFloatArray2631[3] * (float) var27 + var6.aFloatArray2631[7] * (float) var40 + var6.aFloatArray2631[11] * (float) var41 + var6.aFloatArray2631[15];
				int var34;
				int var35;
				if (var30 >= -var31) {
					float var42 = var6.aFloatArray2631[0] * (float) var27 + var6.aFloatArray2631[4] * (float) var40 + var6.aFloatArray2631[8] * (float) var41 + var6.aFloatArray2631[12];
					float var43 = var6.aFloatArray2631[1] * (float) var27 + var6.aFloatArray2631[5] * (float) var40 + var6.aFloatArray2631[9] * (float) var41 + var6.aFloatArray2631[13];
					var34 = this.anIntArray8143[var26];
					var35 = this.anIntArray8143[var26 + 1];
					for (int var36 = var34; var36 < var35; var36++) {
						int var37 = this.aShortArray8144[var36] - 1;
						if (var37 == -1) {
							break;
						}
						var38[var37] = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var42 / var31);
						var39[var37] = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var43 / var31);
					}
				} else {
					var32 = this.anIntArray8143[var26];
					var33 = this.anIntArray8143[var26 + 1];
					for (var34 = var32; var34 < var33; var34++) {
						var35 = this.aShortArray8144[var34] - 1;
						if (var35 == -1) {
							break;
						}
						var38[this.aShortArray8144[var34] - 1] = -999999;
					}
				}
			}
			for (var26 = 0; var26 < this.anInt8089 * -1431655765; var26++) {
				if (var38[this.aShortArray8119[var26]] != -999999 && var38[this.aShortArray8120[var26]] != -999999 && var38[this.aShortArray8121[var26]] != -999999 && this.method4521(arg0, arg1, var39[this.aShortArray8119[var26]], var39[this.aShortArray8120[var26]], var39[this.aShortArray8121[var26]], var38[this.aShortArray8119[var26]], var38[this.aShortArray8120[var26]], var38[this.aShortArray8121[var26]])) {
					return true;
				}
			}
		}
		return false;
	}

	public Class64[] method4484() {
		return this.aClass64Array8146;
	}

	public Class64[] method4485() {
		return this.aClass64Array8146;
	}

	@ObfuscatedName("Class387_Sub2.ds()I")
	public int ds() {
		return this.aShort8099;
	}

	@ObfuscatedName("Class387_Sub2.dp()Z")
	public boolean dp() {
		return this.aBoolean8153;
	}

	public void method4448() {
	}

	@ObfuscatedName("Class387_Sub2.bz(III)V")
	public void bz(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8130; var4++) {
			if (arg0 != 0) {
				this.anIntArray8102[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8110[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8104[var4] += arg2;
			}
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.ee(I[IIIIZI[I)V")
	public void ee(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8113.length) {
					int[] var13 = this.anIntArrayArray8113[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var15]) != 0) {
							anInt8101 += this.anIntArray8102[var15];
							anInt8111 += this.anIntArray8110[var15];
							anInt8158 += this.anIntArray8104[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				anInt8101 = anInt8101 / var10 + arg2;
				anInt8111 = anInt8111 / var10 + arg3;
				anInt8158 = anInt8158 / var10 + arg4;
				aBoolean8159 = true;
			} else {
				anInt8101 = arg2;
				anInt8111 = arg3;
				anInt8158 = arg4;
			}
			return;
		}
		int[] var47;
		int var48;
		if (arg0 == 1) {
			if (arg7 != null) {
				var10 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				var11 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				var12 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = var10;
				arg3 = var11;
				arg4 = var12;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] += arg2;
							this.anIntArray8110[var14] += arg3;
							this.anIntArray8104[var14] += arg4;
						}
					}
				}
			}
			return;
		}
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var26;
		int var27;
		int var28;
		int var30;
		int var32;
		int var33;
		int var34;
		int var36;
		int var37;
		int var38;
		int var39;
		int var40;
		int[] var59;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8113.length) {
						var47 = this.anIntArrayArray8113[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
								this.anIntArray8102[var14] -= anInt8101;
								this.anIntArray8110[var14] -= anInt8111;
								this.anIntArray8104[var14] -= anInt8158;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8110[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = this.anIntArray8110[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8110[var14] * var16 - this.anIntArray8104[var14] * var15 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8110[var14] * var15 + this.anIntArray8104[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8104[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8104[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								this.anIntArray8102[var14] += anInt8101;
								this.anIntArray8110[var14] += anInt8111;
								this.anIntArray8104[var14] += anInt8158;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8113.length) {
							var47 = this.anIntArrayArray8113[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
									var15 = this.anIntArray8143[var14];
									var16 = this.anIntArray8143[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8144[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8109[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8109[var18] = (short) (this.aShortArray8109[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8109[var18] * var20 - this.aShortArray8095[var18] * var19 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8109[var18] * var19 + this.aShortArray8095[var18] * var20 + 16383 >> 14);
											this.aShortArray8109[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8095[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8095[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass44_8127 != null) {
						this.aClass44_8127.anInterface1_441 = null;
					}
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (aBoolean8159) {
					var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
					var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
					var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
					int var51 = var16 + var48;
					int var53 = var17 + var14;
					int var55 = var18 + var15;
					anInt8101 = var51;
					anInt8111 = var53;
					anInt8158 = var55;
					aBoolean8159 = false;
				}
				int[] var52 = new int[9];
				var17 = Class257.anIntArray2684[arg2];
				var18 = Class257.anIntArray2683[arg2];
				var19 = Class257.anIntArray2684[arg3];
				var20 = Class257.anIntArray2683[arg3];
				var21 = Class257.anIntArray2684[arg4];
				var22 = Class257.anIntArray2683[arg4];
				var23 = var18 * var21 + 8192 >> 14;
				var24 = var18 * var22 + 8192 >> 14;
				var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
				var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
				var52[2] = var20 * var17 + 8192 >> 14;
				var52[3] = var17 * var22 + 8192 >> 14;
				var52[4] = var17 * var21 + 8192 >> 14;
				var52[5] = -var18;
				var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
				var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
				var52[8] = var19 * var17 + 8192 >> 14;
				int var25 = var52[0] * -anInt8101 + var52[1] * -anInt8111 + var52[2] * -anInt8158 + 8192 >> 14;
				var26 = var52[3] * -anInt8101 + var52[4] * -anInt8111 + var52[5] * -anInt8158 + 8192 >> 14;
				var27 = var52[6] * -anInt8101 + var52[7] * -anInt8111 + var52[8] * -anInt8158 + 8192 >> 14;
				var28 = var25 + anInt8101;
				int var29 = var26 + anInt8111;
				var30 = var27 + anInt8158;
				int[] var31 = new int[9];
				for (var32 = 0; var32 < 3; var32++) {
					for (var33 = 0; var33 < 3; var33++) {
						var34 = 0;
						for (int var35 = 0; var35 < 3; var35++) {
							var34 += var52[var32 * 3 + var35] * arg7[var33 * 3 + var35];
						}
						var31[var32 * 3 + var33] = var34 + 8192 >> 14;
					}
				}
				var32 = var52[0] * var48 + var52[1] * var14 + var52[2] * var15 + 8192 >> 14;
				var33 = var52[3] * var48 + var52[4] * var14 + var52[5] * var15 + 8192 >> 14;
				var34 = var52[6] * var48 + var52[7] * var14 + var52[8] * var15 + 8192 >> 14;
				var32 += var28;
				var33 += var29;
				var34 += var30;
				var59 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var59[var36 * 3 + var37] = var38 + 8192 >> 14;
					}
				}
				var36 = arg7[0] * var32 + arg7[1] * var33 + arg7[2] * var34 + 8192 >> 14;
				var37 = arg7[3] * var32 + arg7[4] * var33 + arg7[5] * var34 + 8192 >> 14;
				var38 = arg7[6] * var32 + arg7[7] * var33 + arg7[8] * var34 + 8192 >> 14;
				var36 += var10;
				var37 += var11;
				var38 += var12;
				for (var39 = 0; var39 < var9; var39++) {
					var40 = arg1[var39];
					if (var40 < this.anIntArrayArray8113.length) {
						int[] var41 = this.anIntArrayArray8113[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8102[var43] + var59[1] * this.anIntArray8110[var43] + var59[2] * this.anIntArray8104[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8102[var43] + var59[4] * this.anIntArray8110[var43] + var59[5] * this.anIntArray8104[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8102[var43] + var59[7] * this.anIntArray8110[var43] + var59[8] * this.anIntArray8104[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8102[var43] = var60;
								this.anIntArray8110[var43] = var61;
								this.anIntArray8104[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class52 var49;
			Class40 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8123.length) {
							var47 = this.anIntArrayArray8123[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
									var15 = (this.aByteArray8136[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8136[var14] = (byte) var15;
									if (this.aClass44_8105 != null) {
										this.aClass44_8105.anInterface1_441 = null;
									}
								}
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var10 = 0; var10 < this.anInt8147; var10++) {
							var49 = this.aClass52Array8148[var10];
							var50 = this.aClass40Array8149[var10];
							var50.anInt428 = var50.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var49.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var54;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt425 += arg2;
									var54.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt429 = var54.anInt429 * arg2 >> 7;
									var54.anInt426 = var54.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8150.length) {
							var47 = this.anIntArrayArray8150[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var54 = this.aClass40Array8149[var47[var48]];
								var54.anInt424 = var54.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8123.length) {
						var47 = this.anIntArrayArray8123[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3 / 4;
								if (var17 < 0) {
									var17 = 0;
								} else if (var17 > 7) {
									var17 = 7;
								}
								var18 += arg4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 127) {
									var18 = 127;
								}
								this.modelColors[var14] = (short) (var16 << 10 | var17 << 7 | var18);
								if (this.aClass44_8105 != null) {
									this.aClass44_8105.anInterface1_441 = null;
								}
							}
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var10 = 0; var10 < this.anInt8147; var10++) {
						var49 = this.aClass52Array8148[var10];
						var50 = this.aClass40Array8149[var10];
						var50.anInt428 = var50.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var49.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] -= anInt8101;
							this.anIntArray8110[var14] -= anInt8111;
							this.anIntArray8104[var14] -= anInt8158;
							this.anIntArray8102[var14] = this.anIntArray8102[var14] * arg2 >> 7;
							this.anIntArray8110[var14] = this.anIntArray8110[var14] * arg3 >> 7;
							this.anIntArray8104[var14] = this.anIntArray8104[var14] * arg4 >> 7;
							this.anIntArray8102[var14] += anInt8101;
							this.anIntArray8110[var14] += anInt8111;
							this.anIntArray8104[var14] += anInt8158;
						}
					}
				}
			}
		} else {
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (aBoolean8159) {
				var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
				var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
				var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				anInt8101 = var16;
				anInt8111 = var17;
				anInt8158 = var18;
				aBoolean8159 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -anInt8101 + 8192 >> 14;
			var20 = var17 * -anInt8111 + 8192 >> 14;
			var21 = var18 * -anInt8158 + 8192 >> 14;
			var22 = var19 + anInt8101;
			var23 = var20 + anInt8111;
			var24 = var21 + anInt8158;
			int[] var56 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var57 = new int[9];
			int var58;
			for (var30 = 0; var30 < 3; var30++) {
				for (var58 = 0; var58 < 3; var58++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var56[var58 + var33 * 3];
					}
					var57[var30 * 3 + var58] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var58 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var58 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8113.length) {
					var59 = this.anIntArrayArray8113[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8102[var37] + var57[1] * this.anIntArray8110[var37] + var57[2] * this.anIntArray8104[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8102[var37] + var57[4] * this.anIntArray8110[var37] + var57[5] * this.anIntArray8104[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8102[var37] + var57[7] * this.anIntArray8110[var37] + var57[8] * this.anIntArray8104[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8102[var37] = var38;
							this.anIntArray8110[var37] = var39;
							this.anIntArray8104[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.ej()V")
	public void ej() {
		int var1;
		for (var1 = 0; var1 < this.anInt8130; var1++) {
			this.anIntArray8104[var1] = -this.anIntArray8104[var1];
		}
		for (var1 = 0; var1 < this.anInt8107; var1++) {
			this.aShortArray8095[var1] = (short) -this.aShortArray8095[var1];
		}
		for (var1 = 0; var1 < this.anInt8089 * -1431655765; var1++) {
			short var2 = this.aShortArray8119[var1];
			this.aShortArray8119[var1] = this.aShortArray8121[var1];
			this.aShortArray8121[var1] = var2;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		if (this.aClass37_8087 != null) {
			this.aClass37_8087.anInterface3_382 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.cq()I")
	public int cq() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8100;
	}

	@ObfuscatedName("Class387_Sub2.cb()I")
	public int cb() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8133;
	}

	@ObfuscatedName("Class387_Sub2.ew()Z")
	public boolean ew() {
		return this.aBoolean8098;
	}

	@ObfuscatedName("Class387_Sub2.cc()I")
	public int cc() {
		return this.aShort8096;
	}

	@ObfuscatedName("Class387_Sub2.em()Z")
	public boolean em() {
		return this.aBoolean8098;
	}

	public void method4489() {
	}

	@ObfuscatedName("Class387_Sub2.dl(SS)V")
	public void dl(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub1_8092.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8089 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, 928757184);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, -2044424200);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8153 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass52Array8148 != null) {
			for (int var13 = 0; var13 < this.anInt8147; var13++) {
				Class52 var9 = this.aClass52Array8148[var13];
				Class40 var10 = this.aClass40Array8149[var13];
				var10.anInt428 = var10.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
	}

	@ObfuscatedName("Class387_Sub2.er(I[IIIIZI[I)V")
	public void er(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8113.length) {
					int[] var13 = this.anIntArrayArray8113[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var15]) != 0) {
							anInt8101 += this.anIntArray8102[var15];
							anInt8111 += this.anIntArray8110[var15];
							anInt8158 += this.anIntArray8104[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				anInt8101 = anInt8101 / var10 + arg2;
				anInt8111 = anInt8111 / var10 + arg3;
				anInt8158 = anInt8158 / var10 + arg4;
				aBoolean8159 = true;
			} else {
				anInt8101 = arg2;
				anInt8111 = arg3;
				anInt8158 = arg4;
			}
			return;
		}
		int[] var47;
		int var48;
		if (arg0 == 1) {
			if (arg7 != null) {
				var10 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				var11 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				var12 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = var10;
				arg3 = var11;
				arg4 = var12;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] += arg2;
							this.anIntArray8110[var14] += arg3;
							this.anIntArray8104[var14] += arg4;
						}
					}
				}
			}
			return;
		}
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var26;
		int var27;
		int var28;
		int var30;
		int var32;
		int var33;
		int var34;
		int var36;
		int var37;
		int var38;
		int var39;
		int var40;
		int[] var59;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8113.length) {
						var47 = this.anIntArrayArray8113[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
								this.anIntArray8102[var14] -= anInt8101;
								this.anIntArray8110[var14] -= anInt8111;
								this.anIntArray8104[var14] -= anInt8158;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8110[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = this.anIntArray8110[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8110[var14] * var16 - this.anIntArray8104[var14] * var15 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8110[var14] * var15 + this.anIntArray8104[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8104[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8104[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								this.anIntArray8102[var14] += anInt8101;
								this.anIntArray8110[var14] += anInt8111;
								this.anIntArray8104[var14] += anInt8158;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8113.length) {
							var47 = this.anIntArrayArray8113[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
									var15 = this.anIntArray8143[var14];
									var16 = this.anIntArray8143[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8144[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8109[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8109[var18] = (short) (this.aShortArray8109[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8109[var18] * var20 - this.aShortArray8095[var18] * var19 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8109[var18] * var19 + this.aShortArray8095[var18] * var20 + 16383 >> 14);
											this.aShortArray8109[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8095[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8095[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass44_8127 != null) {
						this.aClass44_8127.anInterface1_441 = null;
					}
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (aBoolean8159) {
					var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
					var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
					var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
					int var51 = var16 + var48;
					int var53 = var17 + var14;
					int var55 = var18 + var15;
					anInt8101 = var51;
					anInt8111 = var53;
					anInt8158 = var55;
					aBoolean8159 = false;
				}
				int[] var52 = new int[9];
				var17 = Class257.anIntArray2684[arg2];
				var18 = Class257.anIntArray2683[arg2];
				var19 = Class257.anIntArray2684[arg3];
				var20 = Class257.anIntArray2683[arg3];
				var21 = Class257.anIntArray2684[arg4];
				var22 = Class257.anIntArray2683[arg4];
				var23 = var18 * var21 + 8192 >> 14;
				var24 = var18 * var22 + 8192 >> 14;
				var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
				var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
				var52[2] = var20 * var17 + 8192 >> 14;
				var52[3] = var17 * var22 + 8192 >> 14;
				var52[4] = var17 * var21 + 8192 >> 14;
				var52[5] = -var18;
				var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
				var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
				var52[8] = var19 * var17 + 8192 >> 14;
				int var25 = var52[0] * -anInt8101 + var52[1] * -anInt8111 + var52[2] * -anInt8158 + 8192 >> 14;
				var26 = var52[3] * -anInt8101 + var52[4] * -anInt8111 + var52[5] * -anInt8158 + 8192 >> 14;
				var27 = var52[6] * -anInt8101 + var52[7] * -anInt8111 + var52[8] * -anInt8158 + 8192 >> 14;
				var28 = var25 + anInt8101;
				int var29 = var26 + anInt8111;
				var30 = var27 + anInt8158;
				int[] var31 = new int[9];
				for (var32 = 0; var32 < 3; var32++) {
					for (var33 = 0; var33 < 3; var33++) {
						var34 = 0;
						for (int var35 = 0; var35 < 3; var35++) {
							var34 += var52[var32 * 3 + var35] * arg7[var33 * 3 + var35];
						}
						var31[var32 * 3 + var33] = var34 + 8192 >> 14;
					}
				}
				var32 = var52[0] * var48 + var52[1] * var14 + var52[2] * var15 + 8192 >> 14;
				var33 = var52[3] * var48 + var52[4] * var14 + var52[5] * var15 + 8192 >> 14;
				var34 = var52[6] * var48 + var52[7] * var14 + var52[8] * var15 + 8192 >> 14;
				var32 += var28;
				var33 += var29;
				var34 += var30;
				var59 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var59[var36 * 3 + var37] = var38 + 8192 >> 14;
					}
				}
				var36 = arg7[0] * var32 + arg7[1] * var33 + arg7[2] * var34 + 8192 >> 14;
				var37 = arg7[3] * var32 + arg7[4] * var33 + arg7[5] * var34 + 8192 >> 14;
				var38 = arg7[6] * var32 + arg7[7] * var33 + arg7[8] * var34 + 8192 >> 14;
				var36 += var10;
				var37 += var11;
				var38 += var12;
				for (var39 = 0; var39 < var9; var39++) {
					var40 = arg1[var39];
					if (var40 < this.anIntArrayArray8113.length) {
						int[] var41 = this.anIntArrayArray8113[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8102[var43] + var59[1] * this.anIntArray8110[var43] + var59[2] * this.anIntArray8104[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8102[var43] + var59[4] * this.anIntArray8110[var43] + var59[5] * this.anIntArray8104[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8102[var43] + var59[7] * this.anIntArray8110[var43] + var59[8] * this.anIntArray8104[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8102[var43] = var60;
								this.anIntArray8110[var43] = var61;
								this.anIntArray8104[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class52 var49;
			Class40 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8123.length) {
							var47 = this.anIntArrayArray8123[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
									var15 = (this.aByteArray8136[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8136[var14] = (byte) var15;
									if (this.aClass44_8105 != null) {
										this.aClass44_8105.anInterface1_441 = null;
									}
								}
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var10 = 0; var10 < this.anInt8147; var10++) {
							var49 = this.aClass52Array8148[var10];
							var50 = this.aClass40Array8149[var10];
							var50.anInt428 = var50.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var49.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var54;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt425 += arg2;
									var54.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt429 = var54.anInt429 * arg2 >> 7;
									var54.anInt426 = var54.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8150.length) {
							var47 = this.anIntArrayArray8150[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var54 = this.aClass40Array8149[var47[var48]];
								var54.anInt424 = var54.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8123.length) {
						var47 = this.anIntArrayArray8123[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3 / 4;
								if (var17 < 0) {
									var17 = 0;
								} else if (var17 > 7) {
									var17 = 7;
								}
								var18 += arg4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 127) {
									var18 = 127;
								}
								this.modelColors[var14] = (short) (var16 << 10 | var17 << 7 | var18);
								if (this.aClass44_8105 != null) {
									this.aClass44_8105.anInterface1_441 = null;
								}
							}
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var10 = 0; var10 < this.anInt8147; var10++) {
						var49 = this.aClass52Array8148[var10];
						var50 = this.aClass40Array8149[var10];
						var50.anInt428 = var50.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var49.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] -= anInt8101;
							this.anIntArray8110[var14] -= anInt8111;
							this.anIntArray8104[var14] -= anInt8158;
							this.anIntArray8102[var14] = this.anIntArray8102[var14] * arg2 >> 7;
							this.anIntArray8110[var14] = this.anIntArray8110[var14] * arg3 >> 7;
							this.anIntArray8104[var14] = this.anIntArray8104[var14] * arg4 >> 7;
							this.anIntArray8102[var14] += anInt8101;
							this.anIntArray8110[var14] += anInt8111;
							this.anIntArray8104[var14] += anInt8158;
						}
					}
				}
			}
		} else {
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (aBoolean8159) {
				var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
				var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
				var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				anInt8101 = var16;
				anInt8111 = var17;
				anInt8158 = var18;
				aBoolean8159 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -anInt8101 + 8192 >> 14;
			var20 = var17 * -anInt8111 + 8192 >> 14;
			var21 = var18 * -anInt8158 + 8192 >> 14;
			var22 = var19 + anInt8101;
			var23 = var20 + anInt8111;
			var24 = var21 + anInt8158;
			int[] var56 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var57 = new int[9];
			int var58;
			for (var30 = 0; var30 < 3; var30++) {
				for (var58 = 0; var58 < 3; var58++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var56[var58 + var33 * 3];
					}
					var57[var30 * 3 + var58] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var58 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var58 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8113.length) {
					var59 = this.anIntArrayArray8113[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8102[var37] + var57[1] * this.anIntArray8110[var37] + var57[2] * this.anIntArray8104[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8102[var37] + var57[4] * this.anIntArray8110[var37] + var57[5] * this.anIntArray8104[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8102[var37] + var57[7] * this.anIntArray8110[var37] + var57[8] * this.anIntArray8104[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8102[var37] = var38;
							this.anIntArray8110[var37] = var39;
							this.anIntArray8104[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub2.en(I[IIIIZI[I)V")
	public void en(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			anInt8101 = 0;
			anInt8111 = 0;
			anInt8158 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8113.length) {
					int[] var13 = this.anIntArrayArray8113[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var15]) != 0) {
							anInt8101 += this.anIntArray8102[var15];
							anInt8111 += this.anIntArray8110[var15];
							anInt8158 += this.anIntArray8104[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				anInt8101 = anInt8101 / var10 + arg2;
				anInt8111 = anInt8111 / var10 + arg3;
				anInt8158 = anInt8158 / var10 + arg4;
				aBoolean8159 = true;
			} else {
				anInt8101 = arg2;
				anInt8111 = arg3;
				anInt8158 = arg4;
			}
			return;
		}
		int[] var47;
		int var48;
		if (arg0 == 1) {
			if (arg7 != null) {
				var10 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				var11 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				var12 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = var10;
				arg3 = var11;
				arg4 = var12;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] += arg2;
							this.anIntArray8110[var14] += arg3;
							this.anIntArray8104[var14] += arg4;
						}
					}
				}
			}
			return;
		}
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var26;
		int var27;
		int var28;
		int var30;
		int var32;
		int var33;
		int var34;
		int var36;
		int var37;
		int var38;
		int var39;
		int var40;
		int[] var59;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8113.length) {
						var47 = this.anIntArrayArray8113[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
								this.anIntArray8102[var14] -= anInt8101;
								this.anIntArray8110[var14] -= anInt8111;
								this.anIntArray8104[var14] -= anInt8158;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8110[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = this.anIntArray8110[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8110[var14] * var16 - this.anIntArray8104[var14] * var15 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8110[var14] * var15 + this.anIntArray8104[var14] * var16 + 16383 >> 14;
									this.anIntArray8110[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8104[var14] * var15 + this.anIntArray8102[var14] * var16 + 16383 >> 14;
									this.anIntArray8104[var14] = this.anIntArray8104[var14] * var16 - this.anIntArray8102[var14] * var15 + 16383 >> 14;
									this.anIntArray8102[var14] = var17;
								}
								this.anIntArray8102[var14] += anInt8101;
								this.anIntArray8110[var14] += anInt8111;
								this.anIntArray8104[var14] += anInt8158;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8113.length) {
							var47 = this.anIntArrayArray8113[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
									var15 = this.anIntArray8143[var14];
									var16 = this.anIntArray8143[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8144[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8109[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8109[var18] = (short) (this.aShortArray8109[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8109[var18] * var20 - this.aShortArray8095[var18] * var19 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8109[var18] * var19 + this.aShortArray8095[var18] * var20 + 16383 >> 14);
											this.aShortArray8109[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8095[var18] * var19 + this.aShortArray8108[var18] * var20 + 16383 >> 14;
											this.aShortArray8095[var18] = (short) (this.aShortArray8095[var18] * var20 - this.aShortArray8108[var18] * var19 + 16383 >> 14);
											this.aShortArray8108[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
						this.aClass44_8105.anInterface1_441 = null;
					}
					if (this.aClass44_8127 != null) {
						this.aClass44_8127.anInterface1_441 = null;
					}
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (aBoolean8159) {
					var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
					var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
					var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
					int var51 = var16 + var48;
					int var53 = var17 + var14;
					int var55 = var18 + var15;
					anInt8101 = var51;
					anInt8111 = var53;
					anInt8158 = var55;
					aBoolean8159 = false;
				}
				int[] var52 = new int[9];
				var17 = Class257.anIntArray2684[arg2];
				var18 = Class257.anIntArray2683[arg2];
				var19 = Class257.anIntArray2684[arg3];
				var20 = Class257.anIntArray2683[arg3];
				var21 = Class257.anIntArray2684[arg4];
				var22 = Class257.anIntArray2683[arg4];
				var23 = var18 * var21 + 8192 >> 14;
				var24 = var18 * var22 + 8192 >> 14;
				var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
				var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
				var52[2] = var20 * var17 + 8192 >> 14;
				var52[3] = var17 * var22 + 8192 >> 14;
				var52[4] = var17 * var21 + 8192 >> 14;
				var52[5] = -var18;
				var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
				var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
				var52[8] = var19 * var17 + 8192 >> 14;
				int var25 = var52[0] * -anInt8101 + var52[1] * -anInt8111 + var52[2] * -anInt8158 + 8192 >> 14;
				var26 = var52[3] * -anInt8101 + var52[4] * -anInt8111 + var52[5] * -anInt8158 + 8192 >> 14;
				var27 = var52[6] * -anInt8101 + var52[7] * -anInt8111 + var52[8] * -anInt8158 + 8192 >> 14;
				var28 = var25 + anInt8101;
				int var29 = var26 + anInt8111;
				var30 = var27 + anInt8158;
				int[] var31 = new int[9];
				for (var32 = 0; var32 < 3; var32++) {
					for (var33 = 0; var33 < 3; var33++) {
						var34 = 0;
						for (int var35 = 0; var35 < 3; var35++) {
							var34 += var52[var32 * 3 + var35] * arg7[var33 * 3 + var35];
						}
						var31[var32 * 3 + var33] = var34 + 8192 >> 14;
					}
				}
				var32 = var52[0] * var48 + var52[1] * var14 + var52[2] * var15 + 8192 >> 14;
				var33 = var52[3] * var48 + var52[4] * var14 + var52[5] * var15 + 8192 >> 14;
				var34 = var52[6] * var48 + var52[7] * var14 + var52[8] * var15 + 8192 >> 14;
				var32 += var28;
				var33 += var29;
				var34 += var30;
				var59 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var59[var36 * 3 + var37] = var38 + 8192 >> 14;
					}
				}
				var36 = arg7[0] * var32 + arg7[1] * var33 + arg7[2] * var34 + 8192 >> 14;
				var37 = arg7[3] * var32 + arg7[4] * var33 + arg7[5] * var34 + 8192 >> 14;
				var38 = arg7[6] * var32 + arg7[7] * var33 + arg7[8] * var34 + 8192 >> 14;
				var36 += var10;
				var37 += var11;
				var38 += var12;
				for (var39 = 0; var39 < var9; var39++) {
					var40 = arg1[var39];
					if (var40 < this.anIntArrayArray8113.length) {
						int[] var41 = this.anIntArrayArray8113[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8102[var43] + var59[1] * this.anIntArray8110[var43] + var59[2] * this.anIntArray8104[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8102[var43] + var59[4] * this.anIntArray8110[var43] + var59[5] * this.anIntArray8104[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8102[var43] + var59[7] * this.anIntArray8110[var43] + var59[8] * this.anIntArray8104[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8102[var43] = var60;
								this.anIntArray8110[var43] = var61;
								this.anIntArray8104[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class52 var49;
			Class40 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8123 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8123.length) {
							var47 = this.anIntArrayArray8123[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
									var15 = (this.aByteArray8136[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8136[var14] = (byte) var15;
									if (this.aClass44_8105 != null) {
										this.aClass44_8105.anInterface1_441 = null;
									}
								}
							}
						}
					}
					if (this.aClass52Array8148 != null) {
						for (var10 = 0; var10 < this.anInt8147; var10++) {
							var49 = this.aClass52Array8148[var10];
							var50 = this.aClass40Array8149[var10];
							var50.anInt428 = var50.anInt428 & 0xFFFFFF | 255 - (this.aByteArray8136[var49.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class40 var54;
				if (arg0 == 8) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt425 += arg2;
									var54.anInt427 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8150 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8150.length) {
								var47 = this.anIntArrayArray8150[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var54 = this.aClass40Array8149[var47[var48]];
									var54.anInt429 = var54.anInt429 * arg2 >> 7;
									var54.anInt426 = var54.anInt426 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8150 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8150.length) {
							var47 = this.anIntArrayArray8150[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var54 = this.aClass40Array8149[var47[var48]];
								var54.anInt424 = var54.anInt424 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8123 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8123.length) {
						var47 = this.anIntArrayArray8123[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8124 == null || (arg6 & this.aShortArray8124[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3 / 4;
								if (var17 < 0) {
									var17 = 0;
								} else if (var17 > 7) {
									var17 = 7;
								}
								var18 += arg4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 127) {
									var18 = 127;
								}
								this.modelColors[var14] = (short) (var16 << 10 | var17 << 7 | var18);
								if (this.aClass44_8105 != null) {
									this.aClass44_8105.anInterface1_441 = null;
								}
							}
						}
					}
				}
				if (this.aClass52Array8148 != null) {
					for (var10 = 0; var10 < this.anInt8147; var10++) {
						var49 = this.aClass52Array8148[var10];
						var50 = this.aClass40Array8149[var10];
						var50.anInt428 = var50.anInt428 & 0xFF000000 | Console.colorArray[this.modelColors[var49.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8113.length) {
					var47 = this.anIntArrayArray8113[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var14]) != 0) {
							this.anIntArray8102[var14] -= anInt8101;
							this.anIntArray8110[var14] -= anInt8111;
							this.anIntArray8104[var14] -= anInt8158;
							this.anIntArray8102[var14] = this.anIntArray8102[var14] * arg2 >> 7;
							this.anIntArray8110[var14] = this.anIntArray8110[var14] * arg3 >> 7;
							this.anIntArray8104[var14] = this.anIntArray8104[var14] * arg4 >> 7;
							this.anIntArray8102[var14] += anInt8101;
							this.anIntArray8110[var14] += anInt8111;
							this.anIntArray8104[var14] += anInt8158;
						}
					}
				}
			}
		} else {
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (aBoolean8159) {
				var16 = arg7[0] * anInt8101 + arg7[3] * anInt8111 + arg7[6] * anInt8158 + 8192 >> 14;
				var17 = arg7[1] * anInt8101 + arg7[4] * anInt8111 + arg7[7] * anInt8158 + 8192 >> 14;
				var18 = arg7[2] * anInt8101 + arg7[5] * anInt8111 + arg7[8] * anInt8158 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				anInt8101 = var16;
				anInt8111 = var17;
				anInt8158 = var18;
				aBoolean8159 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -anInt8101 + 8192 >> 14;
			var20 = var17 * -anInt8111 + 8192 >> 14;
			var21 = var18 * -anInt8158 + 8192 >> 14;
			var22 = var19 + anInt8101;
			var23 = var20 + anInt8111;
			var24 = var21 + anInt8158;
			int[] var56 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var57 = new int[9];
			int var58;
			for (var30 = 0; var30 < 3; var30++) {
				for (var58 = 0; var58 < 3; var58++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var56[var58 + var33 * 3];
					}
					var57[var30 * 3 + var58] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var58 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var58 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8113.length) {
					var59 = this.anIntArrayArray8113[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8106 == null || (arg6 & this.aShortArray8106[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8102[var37] + var57[1] * this.anIntArray8110[var37] + var57[2] * this.anIntArray8104[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8102[var37] + var57[4] * this.anIntArray8110[var37] + var57[5] * this.anIntArray8104[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8102[var37] + var57[7] * this.anIntArray8110[var37] + var57[8] * this.anIntArray8104[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8102[var37] = var38;
							this.anIntArray8110[var37] = var39;
							this.anIntArray8104[var37] = var40;
						}
					}
				}
			}
		}
	}

	public void method4461(Class247 arg0, Class80 arg1, int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt8107 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub1_8092.aClass249_8332;
		Class249 var5 = this.aClass_ra_Sub1_8092.aClass249_8430;
		Class249 var6 = this.aClass_ra_Sub1_8092.aClass249_8347;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub1_8092.aClass249_8422);
		if (!this.aBoolean8126) {
			this.method4528();
		}
		float[] var7 = this.aClass_ra_Sub1_8092.aFloatArray8260;
		var5.method2511(0.0F, (float) this.aShort8097, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.aShort8100, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub1_8092.aFloatArrayArray8303[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8134;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8134;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.aShort8145 + this.aShort8156 >> 1;
			int var36 = this.aShort8140 + this.aShort8141 >> 1;
			short var19 = this.aShort8097;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.aShort8100;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var26 / var28);
			} else {
				var33 = true;
			}
			float var29;
			float var30;
			if (var33) {
				if (var23 < -var24 && var27 < -var28) {
					var34 = false;
				} else {
					float var31;
					float var32;
					if (var23 < -var24) {
						var29 = (var23 + var24) / (var27 + var28) - 1.0F;
						var30 = var21 + var29 * (var25 - var21);
						var31 = var22 + var29 * (var26 - var22);
						var32 = var24 + var29 * (var28 - var24);
						arg1.anInt669 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 + this.aClass_ra_Sub1_8092.aFloat8338 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub1_8092.aFloat8339 + this.aClass_ra_Sub1_8092.aFloat8340 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt669 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8134 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8134 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub1_8092.aFloat8337 - (float) arg1.anInt668 + this.aClass_ra_Sub1_8092.aFloat8338 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub1_8092.method4840();
		this.aClass_ra_Sub1_8092.method4821(var5);
		this.method4520();
		this.aClass_ra_Sub1_8092.method4876();
		var5.method2483(this.aClass_ra_Sub1_8092.aClass249_8378);
		this.method4522(var5);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@ObfuscatedName("Class387_Sub2.bt(I)V")
	public void bt(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8130; var4++) {
			var5 = this.anIntArray8104[var4] * var2 + this.anIntArray8102[var4] * var3 >> 14;
			this.anIntArray8104[var4] = this.anIntArray8104[var4] * var3 - this.anIntArray8102[var4] * var2 >> 14;
			this.anIntArray8102[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8107; var4++) {
			var5 = this.aShortArray8095[var4] * var2 + this.aShortArray8108[var4] * var3 >> 14;
			this.aShortArray8095[var4] = (short) (this.aShortArray8095[var4] * var3 - this.aShortArray8108[var4] * var2 >> 14);
			this.aShortArray8108[var4] = (short) var5;
		}
		if (this.aClass44_8127 == null && this.aClass44_8105 != null) {
			this.aClass44_8105.anInterface1_441 = null;
		}
		if (this.aClass44_8127 != null) {
			this.aClass44_8127.anInterface1_441 = null;
		}
		if (this.aClass44_8125 != null) {
			this.aClass44_8125.anInterface1_441 = null;
		}
		this.aBoolean8126 = false;
	}

	@ObfuscatedName("Class387_Sub2.cw()I")
	public int cw() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.aShort8100;
	}

	@ObfuscatedName("Class387_Sub2.N()I")
	public int N() {
		if (!this.aBoolean8126) {
			this.method4528();
		}
		return this.anInt8134;
	}

	public Class93[] method4483() {
		return this.aClass93Array8135;
	}

	public void method4465(Class247 arg0) {
		Class249 var2 = this.aClass_ra_Sub1_8092.aClass249_8430;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8135 != null) {
			for (var3 = 0; var3 < this.aClass93Array8135.length; var3++) {
				Class93 var4 = this.aClass93Array8135[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt841 * -575024885 * -1670679901]) * 432673201 * -1343121583;
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt841 * -575024885 * -1670679901]) * -1138862783 * 76626625;
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt841 * -575024885 * -1670679901]) * -555868357 * 214524403;
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt835 * -1090746067 * -614748507]) * -707023853 * -37814757;
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt835 * -1090746067 * -614748507]) * -648890367 * -1964161023;
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt835 * -1090746067 * -614748507]) * -1672139309 * 1731506779;
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var4.anInt836 * 1207374163 * -878748965]) * 488615051 * 599939875;
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var4.anInt836 * 1207374163 * -878748965]) * 197668655 * 1664972751;
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var4.anInt836 * 1207374163 * -878748965]) * 471540135 * 1194030615;
			}
		}
		if (this.aClass64Array8146 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8146.length; var3++) {
			Class64 var6 = this.aClass64Array8146[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8102[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[4] * (float) this.anIntArray8110[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[8] * (float) this.anIntArray8104[var6.anInt566 * 2126578851 * 1669844747]) * -686746519 * -1407861799;
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8102[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[5] * (float) this.anIntArray8110[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[9] * (float) this.anIntArray8104[var6.anInt566 * 2126578851 * 1669844747]) * -635472619 * -1713950147;
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8102[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[6] * (float) this.anIntArray8110[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[10] * (float) this.anIntArray8104[var6.anInt566 * 2126578851 * 1669844747]) * 1225142127 * -1854140529;
		}
	}
}
