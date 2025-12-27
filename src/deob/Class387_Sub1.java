package deob;

import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class387_Sub1 extends Class387 {

	public static int anInt8011 = 7;

	public static int anInt8019 = 4;

	public int anInt8014;

	public int anInt8044;

	public int anInt8038;

	public int anInt8034;

	public int anInt8035;

	public boolean aBoolean8049;

	public boolean aBoolean8066;

	public boolean aBoolean8067;

	public boolean aBoolean8042;

	public boolean aBoolean8043;

	public float[] aFloatArray8074;

	public int[] anIntArray8010;

	public int[] anIntArray8076;

	public int[] anIntArray8077;

	public int[] anIntArray8029;

	public int[] anIntArray8079;

	public Class_ra_Sub2 aClass_ra_Sub2_8012;

	public int anInt8013;

	public int anInt8081;

	public Class173 aClass173_8045;

	public Class173 aClass173_8021;

	public Class173 aClass173_8046;

	public Class173 aClass173_8047;

	public Class165 aClass165_8050;

	public int[] anIntArray8082;

	public int[] anIntArray8065;

	public int[] anIntArray8020;

	public int[] anIntArray8051;

	public short[] aShortArray8023;

	public Class93[] aClass93Array8026;

	public Class64[] aClass64Array8068;

	public int anInt8069;

	public Class185[] aClass185Array8070;

	public Class177[] aClass177Array8071;

	public short[] aShortArray8025;

	public short[] aShortArray8075;

	public short[] aShortArray8032;

	public short[] aShortArray8028;

	public short[] aShortArray8024;

	public byte[] aByteArray8030;

	public float[] aFloatArray8031;

	public float[] aFloatArray8053;

	public short[] modelColors;

	public byte[] aByteArray8037;

	public short[] aShortArray8016;

	public short[] aShortArray8039;

	public short[] aShortArray8040;

	public short[] modelTextures;

	public short[] aShortArray8018;

	public short aShort8015;

	public short aShort8083;

	public short[] aShortArray8052;

	public long[] aLongArray8073;

	public int[] anIntArray8063;

	public int[] anIntArray8064;

	public int[] anIntArray8062;

	public int[][] anIntArrayArray8022;

	public int[][] anIntArrayArray8072;

	public int[][] anIntArrayArray8017;

	public int anInt8027;

	public int anInt8054;

	public int anInt8055;

	public int anInt8056;

	public int anInt8057;

	public int anInt8058;

	public int anInt8059;

	public int anInt8060;

	public int anInt8061;

	public int anInt8078;

	public int anInt8080;

	public static Class172 aClass172_8084;

	public Class206 aClass206_8033;

	public boolean aBoolean8048;

	public Class387_Sub1(Class_ra_Sub2 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		this.anInt8014 = 0;
		this.anInt8044 = 0;
		this.anInt8038 = 0;
		this.anInt8034 = 0;
		this.anInt8035 = 0;
		this.aBoolean8049 = false;
		this.aBoolean8066 = true;
		this.aBoolean8067 = false;
		this.aBoolean8042 = false;
		this.aBoolean8043 = false;
		this.aFloatArray8074 = new float[2];
		this.anIntArray8010 = new int[1];
		this.anIntArray8076 = new int[1];
		this.anIntArray8077 = new int[8];
		this.anIntArray8029 = new int[8];
		this.anIntArray8079 = new int[8];
		this.aClass_ra_Sub2_8012 = arg0;
		this.anInt8013 = arg1;
		this.anInt8081 = arg2;
		this.aBoolean8049 = arg4;
		if (arg3 || Class160.method1899(this.anInt8013, this.anInt8081)) {
			this.aClass173_8045 = new Class173(Class160.method1892(this.anInt8013, this.anInt8081));
		}
		if (arg3 || Class160.method1890(this.anInt8013, this.anInt8081)) {
			this.aClass173_8021 = new Class173(Class160.method1894(this.anInt8013, this.anInt8081));
		}
		if (arg3 || Class160.method1889(this.anInt8013, this.anInt8081)) {
			this.aClass173_8046 = new Class173(Class160.method1908(this.anInt8013, this.anInt8081));
		}
		if (arg3 || Class160.method1888(this.anInt8013, this.anInt8081)) {
			this.aClass173_8047 = new Class173(Class160.method1893(this.anInt8013, this.anInt8081));
		}
		if (arg3 || Class160.method1891(this.anInt8013, this.anInt8081)) {
			this.aClass165_8050 = new Class165(Class160.method1895(this.anInt8013, this.anInt8081));
		}
		if (arg3 && arg4) {
			this.aClass173_8045.anInterface9_Impl1_1734 = this.aClass173_8045.anInterface9_Impl1_1733 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			this.aClass173_8021.anInterface9_Impl1_1734 = this.aClass173_8021.anInterface9_Impl1_1733 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			this.aClass173_8046.anInterface9_Impl1_1734 = this.aClass173_8046.anInterface9_Impl1_1733 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			this.aClass173_8047.anInterface9_Impl1_1734 = this.aClass173_8047.anInterface9_Impl1_1733 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
		}
	}

	public Class387_Sub1(Class_ra_Sub2 arg0, Model arg1, int arg2, int arg3, int arg4, int arg5) {
		this(arg0, arg2, arg5, true, false);
		Interface_ma var7 = arg0.anInterface_ma4227;
		int[] var8 = new int[arg1.anInt904];
		this.anIntArray8082 = new int[arg1.anInt874 + 1];
		for (int var9 = 0; var9 < arg1.anInt904; var9++) {
			if (arg1.aByteArray884 == null || arg1.aByteArray884[var9] != 2) {
				if (arg1.aShortArray896 != null && arg1.aShortArray896[var9] != -1) {
					Class56 var10 = var7.method221(arg1.aShortArray896[var9] & 0xFFFF, -639060841);
					if (((this.anInt8081 & 0x40) == 0 || !var10.aBoolean533) && var10.aBoolean519) {
						continue;
					}
				}
				int var10003 = this.anInt8034 * -1431655765;
				int var10001 = this.anInt8034 * -1431655765;
				this.anInt8034 = (var10003 + 1) * 3;
				var8[var10001] = var9;
				this.anIntArray8082[arg1.aShortArray888[var9]]++;
				this.anIntArray8082[arg1.aShortArray907[var9]]++;
				this.anIntArray8082[arg1.aShortArray883[var9]]++;
			}
		}
		this.anInt8035 = this.anInt8034 * -1431655765;
		long[] var63 = new long[this.anInt8034 * -1431655765];
		boolean var64 = (this.anInt8013 & 0x100) != 0;
		int var12;
		int var14;
		int var19;
		Class56 var22;
		int var68;
		short var76;
		for (int var11 = 0; var11 < this.anInt8034 * -1431655765; var11++) {
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
						Class207 var21 = Class511.method6180(var20.anInt850, (byte) 94);
						if (var21.aBoolean1948) {
							var18 = true;
						}
						if (var21.anInt1950 != -1) {
							var22 = var7.method221(var21.anInt1950, -1696547101);
							if (var22.aClass369_524 == Class369.aClass369_6817) {
								this.aBoolean8067 = true;
							}
						}
					}
				}
				if (var18) {
					var63[var11] = Long.MAX_VALUE;
					this.anInt8035--;
					continue;
				}
			}
			var76 = -1;
			if (arg1.aShortArray896 != null) {
				var76 = arg1.aShortArray896[var12];
				if (var76 != -1) {
					var13 = var7.method221(var76 & 0xFFFF, 459494880);
					if ((this.anInt8081 & 0x40) != 0 && var13.aBoolean533) {
						var76 = -1;
						var13 = null;
					} else {
						var16 = var13.aByte525;
						var17 = var13.aByte526;
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
			this.aBoolean8067 |= var77;
			this.aBoolean8042 |= var13 != null && (var13.aByte531 != 0 || var13.aByte530 != 0);
		}
		Class390.method4600(var63, var8, (byte) -12);
		this.anInt8014 = arg1.anInt897;
		this.anInt8044 = arg1.anInt874;
		this.anIntArray8065 = arg1.anIntArray875;
		this.anIntArray8020 = arg1.anIntArray889;
		this.anIntArray8051 = arg1.anIntArray877;
		this.aShortArray8023 = arg1.aShortArray879;
		Class194[] var65 = new Class194[this.anInt8044];
		this.aClass93Array8026 = arg1.aClass93Array878;
		this.aClass64Array8068 = arg1.aClass64Array893;
		int var71;
		if (arg1.aClass94Array908 != null) {
			this.anInt8069 = arg1.aClass94Array908.length;
			this.aClass185Array8070 = new Class185[this.anInt8069];
			this.aClass177Array8071 = new Class177[this.anInt8069];
			for (var12 = 0; var12 < this.anInt8069; var12++) {
				Class94 var66 = arg1.aClass94Array908[var12];
				Class207 var70 = Class511.method6180(var66.anInt850, (byte) 55);
				var68 = -1;
				for (var71 = 0; var71 < this.anInt8034 * -1431655765; var71++) {
					if (var8[var71] == var66.anInt848) {
						var68 = var71;
						break;
					}
				}
				var71 = Console.colorArray[arg1.aShortArray873[var66.anInt848] & 0xFFFF] & 0xFFFFFF;
				var71 |= 255 - (arg1.aByteArray876 == null ? 0 : arg1.aByteArray876[var66.anInt848]) << 24;
				this.aClass185Array8070[var12] = new Class185(var68, arg1.aShortArray888[var66.anInt848], arg1.aShortArray907[var66.anInt848], arg1.aShortArray883[var66.anInt848], var70.anInt1945, var70.anInt1946, var70.anInt1950, var70.anInt1941, var70.anInt1947, var70.aBoolean1948, var70.aBoolean1949, var66.anInt849);
				this.aClass177Array8071[var12] = new Class177(var71);
			}
		}
		var12 = this.anInt8034;
		this.aShortArray8025 = new short[var12];
		this.aShortArray8075 = new short[var12];
		this.aShortArray8032 = new short[var12];
		this.aShortArray8028 = new short[var12];
		this.aShortArray8024 = new short[var12];
		this.aByteArray8030 = new byte[var12];
		this.aFloatArray8031 = new float[var12];
		this.aFloatArray8053 = new float[var12];
		this.modelColors = new short[this.anInt8034 * -1431655765];
		this.aByteArray8037 = new byte[this.anInt8034 * -1431655765];
		this.aShortArray8016 = new short[this.anInt8034 * -1431655765];
		this.aShortArray8039 = new short[this.anInt8034 * -1431655765];
		this.aShortArray8040 = new short[this.anInt8034 * -1431655765];
		this.modelTextures = new short[this.anInt8034 * -1431655765];
		if (arg1.aShortArray892 != null) {
			this.aShortArray8018 = new short[this.anInt8034 * -1431655765];
		}
		this.aShort8015 = (short) arg3;
		this.aShort8083 = (short) arg4;
		this.aShortArray8052 = new short[var12];
		this.aLongArray8073 = new long[var12];
		int var67 = 0;
		for (var14 = 0; var14 < arg1.anInt874; var14++) {
			var68 = this.anIntArray8082[var14];
			this.anIntArray8082[var14] = var67;
			var67 += var68;
			var65[var14] = new Class194();
		}
		this.anIntArray8082[arg1.anInt874] = var67;
		Class97 var72 = this.method4444(arg1, var8, this.anInt8034 * -1431655765);
		Class190[] var73 = new Class190[arg1.anInt904];
		short var74;
		short var78;
		int var80;
		for (var71 = 0; var71 < arg1.anInt904; var71++) {
			var74 = arg1.aShortArray888[var71];
			var76 = arg1.aShortArray907[var71];
			var78 = arg1.aShortArray883[var71];
			var80 = this.anIntArray8065[var76] - this.anIntArray8065[var74];
			int var82 = this.anIntArray8020[var76] - this.anIntArray8020[var74];
			int var84 = this.anIntArray8051[var76] - this.anIntArray8051[var74];
			int var23 = this.anIntArray8065[var78] - this.anIntArray8065[var74];
			int var24 = this.anIntArray8020[var78] - this.anIntArray8020[var74];
			int var25 = this.anIntArray8051[var78] - this.anIntArray8051[var74];
			int var26 = var82 * var25 - var24 * var84;
			int var27 = var84 * var23 - var25 * var80;
			int var28;
			for (var28 = var80 * var24 - var23 * var82; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 0x1) {
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
				Class194 var31 = var65[var74];
				var31.anInt1886 += var26;
				var31.anInt1884 += var27;
				var31.anInt1885 += var28;
				var31.anInt1883++;
				Class194 var95 = var65[var76];
				var95.anInt1886 += var26;
				var95.anInt1884 += var27;
				var95.anInt1885 += var28;
				var95.anInt1883++;
				Class194 var96 = var65[var78];
				var96.anInt1886 += var26;
				var96.anInt1884 += var27;
				var96.anInt1885 += var28;
				var96.anInt1883++;
			} else if (var30 == 1) {
				Class190 var97 = var73[var71] = new Class190();
				var97.anInt1859 = var26;
				var97.anInt1857 = var27;
				var97.anInt1858 = var28;
			}
		}
		int var81;
		short var83;
		for (var71 = 0; var71 < this.anInt8034 * -1431655765; var71++) {
			int var75 = var8[var71];
			var81 = arg1.aShortArray873[var75] & 0xFFFF;
			if (arg1.aByteArray887 == null) {
				var19 = -1;
			} else {
				var19 = arg1.aByteArray887[var75];
			}
			if (arg1.aByteArray876 == null) {
				var80 = 0;
			} else {
				var80 = arg1.aByteArray876[var75] & 0xFF;
			}
			var83 = arg1.aShortArray896 == null ? -1 : arg1.aShortArray896[var75];
			if (var83 != -1 && (this.anInt8081 & 0x40) != 0) {
				var22 = var7.method221(var83 & 0xFFFF, 643017709);
				if (var22.aBoolean533) {
					var83 = -1;
				}
			}
			float var85 = 0.0F;
			float var86 = 0.0F;
			float var87 = 0.0F;
			float var88 = 0.0F;
			float var90 = 0.0F;
			float var91 = 0.0F;
			byte var92 = 0;
			byte var93 = 0;
			int var94 = 0;
			short var34;
			short var35;
			short var36;
			byte var98;
			if (var83 != -1) {
				if (var19 == -1) {
					var85 = 0.0F;
					var86 = 1.0F;
					var87 = 1.0F;
					var88 = 1.0F;
					var92 = 1;
					var90 = 0.0F;
					var91 = 0.0F;
					var93 = 2;
				} else {
					var19 &= 0xFF;
					var98 = arg1.aByteArray894[var19];
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
					if (var98 == 0) {
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
						var85 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
						var87 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
						var90 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
						float var119 = var42 * var58 - var43 * var57;
						float var120 = var43 * var56 - var41 * var58;
						float var121 = var41 * var57 - var42 * var56;
						float var122 = 1.0F / (var119 * var44 + var120 * var45 + var121 * var46);
						var86 = (var119 * var47 + var120 * var48 + var121 * var49) * var122;
						var88 = (var119 * var50 + var120 * var51 + var121 * var52) * var122;
						var91 = (var119 * var53 + var120 * var54 + var121 * var55) * var122;
					} else {
						var32 = arg1.aShortArray888[var75];
						var33 = arg1.aShortArray907[var75];
						var34 = arg1.aShortArray883[var75];
						int var102 = var72.anIntArray867[var19];
						int var103 = var72.anIntArray870[var19];
						int var104 = var72.anIntArray869[var19];
						float[] var107 = var72.aFloatArrayArray868[var19];
						byte var109 = arg1.aByteArray905[var19];
						var40 = (float) arg1.anIntArray901[var19] / 256.0F;
						if (var98 == 1) {
							var41 = (float) arg1.anIntArray900[var19] / 1024.0F;
							this.method4492(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var102, var103, var104, var107, var41, var109, var40, this.aFloatArray8074);
							var85 = this.aFloatArray8074[0];
							var86 = this.aFloatArray8074[1];
							this.method4492(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var102, var103, var104, var107, var41, var109, var40, this.aFloatArray8074);
							var87 = this.aFloatArray8074[0];
							var88 = this.aFloatArray8074[1];
							this.method4492(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var102, var103, var104, var107, var41, var109, var40, this.aFloatArray8074);
							var90 = this.aFloatArray8074[0];
							var91 = this.aFloatArray8074[1];
							var42 = var41 / 2.0F;
							if ((var109 & 0x1) == 0) {
								if (var87 - var85 > var42) {
									var87 -= var41;
									var92 = 1;
								} else if (var85 - var87 > var42) {
									var87 += var41;
									var92 = 2;
								}
								if (var90 - var85 > var42) {
									var90 -= var41;
									var93 = 1;
								} else if (var85 - var90 > var42) {
									var90 += var41;
									var93 = 2;
								}
							} else {
								if (var88 - var86 > var42) {
									var88 -= var41;
									var92 = 1;
								} else if (var86 - var88 > var42) {
									var88 += var41;
									var92 = 2;
								}
								if (var91 - var86 > var42) {
									var91 -= var41;
									var93 = 1;
								} else if (var86 - var91 > var42) {
									var91 += var41;
									var93 = 2;
								}
							}
						} else if (var98 == 2) {
							var41 = (float) arg1.anIntArray902[var19] / 256.0F;
							var42 = (float) arg1.anIntArray872[var19] / 256.0F;
							int var110 = arg1.anIntArray875[var33] - arg1.anIntArray875[var32];
							int var111 = arg1.anIntArray889[var33] - arg1.anIntArray889[var32];
							int var112 = arg1.anIntArray877[var33] - arg1.anIntArray877[var32];
							int var113 = arg1.anIntArray875[var34] - arg1.anIntArray875[var32];
							int var114 = arg1.anIntArray889[var34] - arg1.anIntArray889[var32];
							int var115 = arg1.anIntArray877[var34] - arg1.anIntArray877[var32];
							int var116 = var111 * var115 - var114 * var112;
							int var117 = var112 * var113 - var115 * var110;
							int var118 = var110 * var114 - var113 * var111;
							var52 = 64.0F / (float) arg1.anIntArray898[var19];
							var53 = 64.0F / (float) arg1.anIntArray899[var19];
							var54 = 64.0F / (float) arg1.anIntArray900[var19];
							var55 = ((float) var116 * var107[0] + (float) var117 * var107[1] + (float) var118 * var107[2]) / var52;
							var56 = ((float) var116 * var107[3] + (float) var117 * var107[4] + (float) var118 * var107[5]) / var53;
							var57 = ((float) var116 * var107[6] + (float) var117 * var107[7] + (float) var118 * var107[8]) / var54;
							var94 = this.method4442(var55, var56, var57);
							this.method4443(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var102, var103, var104, var94, var107, var109, var40, var41, var42, this.aFloatArray8074);
							var85 = this.aFloatArray8074[0];
							var86 = this.aFloatArray8074[1];
							this.method4443(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var102, var103, var104, var94, var107, var109, var40, var41, var42, this.aFloatArray8074);
							var87 = this.aFloatArray8074[0];
							var88 = this.aFloatArray8074[1];
							this.method4443(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var102, var103, var104, var94, var107, var109, var40, var41, var42, this.aFloatArray8074);
							var90 = this.aFloatArray8074[0];
							var91 = this.aFloatArray8074[1];
						} else if (var98 == 3) {
							this.method4441(arg1.anIntArray875[var32], arg1.anIntArray889[var32], arg1.anIntArray877[var32], var102, var103, var104, var107, var109, var40, this.aFloatArray8074);
							var85 = this.aFloatArray8074[0];
							var86 = this.aFloatArray8074[1];
							this.method4441(arg1.anIntArray875[var33], arg1.anIntArray889[var33], arg1.anIntArray877[var33], var102, var103, var104, var107, var109, var40, this.aFloatArray8074);
							var87 = this.aFloatArray8074[0];
							var88 = this.aFloatArray8074[1];
							this.method4441(arg1.anIntArray875[var34], arg1.anIntArray889[var34], arg1.anIntArray877[var34], var102, var103, var104, var107, var109, var40, this.aFloatArray8074);
							var90 = this.aFloatArray8074[0];
							var91 = this.aFloatArray8074[1];
							if ((var109 & 0x1) == 0) {
								if (var87 - var85 > 0.5F) {
									var87--;
									var92 = 1;
								} else if (var85 - var87 > 0.5F) {
									var87++;
									var92 = 2;
								}
								if (var90 - var85 > 0.5F) {
									var90--;
									var93 = 1;
								} else if (var85 - var90 > 0.5F) {
									var90++;
									var93 = 2;
								}
							} else {
								if (var88 - var86 > 0.5F) {
									var88--;
									var92 = 1;
								} else if (var86 - var88 > 0.5F) {
									var88++;
									var92 = 2;
								}
								if (var91 - var86 > 0.5F) {
									var91--;
									var93 = 1;
								} else if (var86 - var91 > 0.5F) {
									var91++;
									var93 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray884 == null) {
				var98 = 0;
			} else {
				var98 = arg1.aByteArray884[var75];
			}
			if (var98 == 0) {
				long var99 = (long) (var19 << 2) + ((long) (var94 << 24) + (long) (var81 << 8) + (long) var80 << 32);
				var34 = arg1.aShortArray888[var75];
				var35 = arg1.aShortArray907[var75];
				var36 = arg1.aShortArray883[var75];
				Class194 var105 = var65[var34];
				this.aShortArray8016[var71] = this.method4493(arg1, var34, var71, var99, var105.anInt1886, var105.anInt1884, var105.anInt1885, var105.anInt1883, var85, var86);
				Class194 var106 = var65[var35];
				this.aShortArray8039[var71] = this.method4493(arg1, var35, var71, var99 + (long) var92, var106.anInt1886, var106.anInt1884, var106.anInt1885, var106.anInt1883, var87, var88);
				Class194 var108 = var65[var36];
				this.aShortArray8040[var71] = this.method4493(arg1, var36, var71, var99 + (long) var93, var108.anInt1886, var108.anInt1884, var108.anInt1885, var108.anInt1883, var90, var91);
			} else if (var98 == 1) {
				Class190 var100 = var73[var75];
				long var101 = (long) ((var19 << 2) + (var100.anInt1859 > 0 ? 1024 : 2048) + (var100.anInt1857 + 256 << 12) + (var100.anInt1858 + 256 << 22)) + ((long) (var94 << 24) + (long) (var81 << 8) + (long) var80 << 32);
				this.aShortArray8016[var71] = this.method4493(arg1, arg1.aShortArray888[var75], var71, var101, var100.anInt1859, var100.anInt1857, var100.anInt1858, 0, var85, var86);
				this.aShortArray8039[var71] = this.method4493(arg1, arg1.aShortArray907[var75], var71, var101 + (long) var92, var100.anInt1859, var100.anInt1857, var100.anInt1858, 0, var87, var88);
				this.aShortArray8040[var71] = this.method4493(arg1, arg1.aShortArray883[var75], var71, var101 + (long) var93, var100.anInt1859, var100.anInt1857, var100.anInt1858, 0, var90, var91);
			}
			if (arg1.aByteArray876 != null) {
				this.aByteArray8037[var71] = arg1.aByteArray876[var75];
			}
			if (arg1.aShortArray892 != null) {
				this.aShortArray8018[var71] = arg1.aShortArray892[var75];
			}
			this.modelColors[var71] = arg1.aShortArray873[var75];
			this.modelTextures[var71] = var83;
		}
		if (this.anInt8035 > 0) {
			var71 = 1;
			var74 = this.modelTextures[0];
			for (var81 = 0; var81 < this.anInt8035; var81++) {
				var78 = this.modelTextures[var81];
				if (var78 != var74) {
					var71++;
					var74 = var78;
				}
			}
			this.anIntArray8063 = new int[var71];
			this.anIntArray8064 = new int[var71];
			this.anIntArray8062 = new int[var71 + 1];
			this.anIntArray8062[0] = 0;
			var81 = this.anInt8038;
			var78 = 0;
			var71 = 0;
			var74 = this.modelTextures[0];
			for (var80 = 0; var80 < this.anInt8035; var80++) {
				var83 = this.modelTextures[var80];
				if (var83 != var74) {
					this.anIntArray8063[var71] = var81;
					this.anIntArray8064[var71] = var78 - var81 + 1;
					var71++;
					this.anIntArray8062[var71] = var80;
					var81 = this.anInt8038;
					var78 = 0;
					var74 = var83;
				}
				short var89 = this.aShortArray8016[var80];
				if (var89 < var81) {
					var81 = var89;
				}
				if (var89 > var78) {
					var78 = var89;
				}
				var89 = this.aShortArray8039[var80];
				if (var89 < var81) {
					var81 = var89;
				}
				if (var89 > var78) {
					var78 = var89;
				}
				var89 = this.aShortArray8040[var80];
				if (var89 < var81) {
					var81 = var89;
				}
				if (var89 > var78) {
					var78 = var89;
				}
			}
			this.anIntArray8063[var71] = var81;
			this.anIntArray8064[var71] = var78 - var81 + 1;
			var71++;
			this.anIntArray8062[var71] = this.anInt8035;
		}
		this.aLongArray8073 = null;
		this.aShortArray8025 = method4494(this.aShortArray8025, this.anInt8038);
		this.aShortArray8075 = method4494(this.aShortArray8075, this.anInt8038);
		this.aShortArray8032 = method4494(this.aShortArray8032, this.anInt8038);
		this.aShortArray8028 = method4494(this.aShortArray8028, this.anInt8038);
		this.aShortArray8024 = method4494(this.aShortArray8024, this.anInt8038);
		this.aByteArray8030 = method4496(this.aByteArray8030, this.anInt8038);
		this.aFloatArray8031 = method4495(this.aFloatArray8031, this.anInt8038);
		this.aFloatArray8053 = method4495(this.aFloatArray8053, this.anInt8038);
		if (arg1.anIntArray880 != null && Class160.method1903(arg2, this.anInt8081)) {
			this.anIntArrayArray8022 = arg1.method1197(false);
		}
		if (arg1.aClass94Array908 != null && Class160.method1904(arg2, this.anInt8081)) {
			this.anIntArrayArray8072 = arg1.method1193();
		}
		if (arg1.anIntArray890 != null && Class160.method1902(arg2, this.anInt8081)) {
			var71 = 0;
			int[] var79 = new int[256];
			for (var81 = 0; var81 < this.anInt8034 * -1431655765; var81++) {
				var19 = arg1.anIntArray890[var8[var81]];
				if (var19 >= 0) {
					int var10002 = var79[var19]++;
					if (var19 > var71) {
						var71 = var19;
					}
				}
			}
			this.anIntArrayArray8017 = new int[var71 + 1][];
			for (var81 = 0; var81 <= var71; var81++) {
				this.anIntArrayArray8017[var81] = new int[var79[var81]];
				var79[var81] = 0;
			}
			for (var81 = 0; var81 < this.anInt8034 * -1431655765; var81++) {
				var19 = arg1.anIntArray890[var8[var81]];
				if (var19 >= 0) {
					this.anIntArrayArray8017[var19][var79[var19]++] = var81;
				}
			}
		}
	}

	public short method4493(Model arg0, int arg1, int arg2, long arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9) {
		int var12 = this.anIntArray8082[arg1];
		int var13 = this.anIntArray8082[arg1 + 1];
		int var14 = 0;
		for (int var15 = var12; var15 < var13; var15++) {
			short var16 = this.aShortArray8052[var15];
			if (var16 == 0) {
				var14 = var15;
				break;
			}
			if (this.aLongArray8073[var15] == arg3) {
				return (short) (var16 - 1);
			}
		}
		this.aShortArray8052[var14] = (short) (this.anInt8038 + 1);
		this.aLongArray8073[var14] = arg3;
		this.aShortArray8075[this.anInt8038] = (short) arg2;
		this.aShortArray8025[this.anInt8038] = (short) arg1;
		this.aShortArray8032[this.anInt8038] = (short) arg4;
		this.aShortArray8028[this.anInt8038] = (short) arg5;
		this.aShortArray8024[this.anInt8038] = (short) arg6;
		this.aByteArray8030[this.anInt8038] = (byte) arg7;
		this.aFloatArray8031[this.anInt8038] = arg8;
		this.aFloatArray8053[this.anInt8038] = arg9;
		return (short) this.anInt8038++;
	}

	@ObfuscatedName("Class387_Sub1.RA()I")
	public int RA() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8058;
	}

	public static short[] method4494(short[] arg0, int arg1) {
		short[] var2 = new short[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	public static float[] method4495(float[] arg0, int arg1) {
		float[] var2 = new float[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	public static byte[] method4496(byte[] arg0, int arg1) {
		byte[] var2 = new byte[arg1];
		System.arraycopy(arg0, 0, var2, 0, arg1);
		return var2;
	}

	@ObfuscatedName("Class387_Sub1.bf(I)V")
	public void bf(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8020[var4] = this.anIntArray8020[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	public Class387 method4446(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		Class387_Sub1 var5;
		Class387_Sub1 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass_ra_Sub2_8012.aClass387_Sub1Array8609[arg0 - 1];
			var5 = this.aClass_ra_Sub2_8012.aClass387_Sub1Array8534[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub1(this.aClass_ra_Sub2_8012, 0, 0, true, false);
		}
		return this.method4497(var5, var6, arg1, var4, arg2);
	}

	public Class387 method4497(Class387_Sub1 arg0, Class387_Sub1 arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.anInt8013 = arg2;
		arg0.anInt8081 = this.anInt8081;
		arg0.aShort8015 = this.aShort8015;
		arg0.aShort8083 = this.aShort8083;
		arg0.anInt8014 = this.anInt8014;
		arg0.anInt8044 = this.anInt8044;
		arg0.anInt8038 = this.anInt8038;
		arg0.anInt8034 = this.anInt8034;
		arg0.anInt8035 = this.anInt8035;
		arg0.anInt8069 = this.anInt8069;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean8067 = this.aBoolean8067;
		} else {
			arg0.aBoolean8067 = true;
		}
		arg0.aBoolean8042 = this.aBoolean8042;
		boolean var6 = Class160.method1878(arg2, this.anInt8081);
		boolean var7 = Class160.method1879(arg2, this.anInt8081);
		boolean var8 = Class160.method1880(arg2, this.anInt8081);
		boolean var9 = var6 | var7 | var8;
		int var10;
		if (var9) {
			if (!var6) {
				arg0.anIntArray8065 = this.anIntArray8065;
			} else if (arg1.anIntArray8065 == null || arg1.anIntArray8065.length < this.anInt8014) {
				arg0.anIntArray8065 = arg1.anIntArray8065 = new int[this.anInt8014];
			} else {
				arg0.anIntArray8065 = arg1.anIntArray8065;
			}
			if (!var7) {
				arg0.anIntArray8020 = this.anIntArray8020;
			} else if (arg1.anIntArray8020 == null || arg1.anIntArray8020.length < this.anInt8014) {
				arg0.anIntArray8020 = arg1.anIntArray8020 = new int[this.anInt8014];
			} else {
				arg0.anIntArray8020 = arg1.anIntArray8020;
			}
			if (!var8) {
				arg0.anIntArray8051 = this.anIntArray8051;
			} else if (arg1.anIntArray8051 == null || arg1.anIntArray8051.length < this.anInt8014) {
				arg0.anIntArray8051 = arg1.anIntArray8051 = new int[this.anInt8014];
			} else {
				arg0.anIntArray8051 = arg1.anIntArray8051;
			}
			for (var10 = 0; var10 < this.anInt8014; var10++) {
				if (var6) {
					arg0.anIntArray8065[var10] = this.anIntArray8065[var10];
				}
				if (var7) {
					arg0.anIntArray8020[var10] = this.anIntArray8020[var10];
				}
				if (var8) {
					arg0.anIntArray8051[var10] = this.anIntArray8051[var10];
				}
			}
		} else {
			arg0.anIntArray8065 = this.anIntArray8065;
			arg0.anIntArray8020 = this.anIntArray8020;
			arg0.anIntArray8051 = this.anIntArray8051;
		}
		if (Class160.method1892(arg2, this.anInt8081)) {
			arg0.aClass173_8045 = arg1.aClass173_8045;
			arg0.aClass173_8045.anInterface9_Impl1_1733 = this.aClass173_8045.anInterface9_Impl1_1733;
			arg0.aClass173_8045.aBoolean1732 = this.aClass173_8045.aBoolean1732;
			arg0.aClass173_8045.aBoolean1731 = true;
		} else if (Class160.method1899(arg2, this.anInt8081)) {
			arg0.aClass173_8045 = this.aClass173_8045;
		} else {
			arg0.aClass173_8045 = null;
		}
		if (Class160.method1883(arg2, this.anInt8081)) {
			if (arg1.modelColors == null || arg1.modelColors.length < this.anInt8034 * -1431655765) {
				arg0.modelColors = arg1.modelColors = new short[this.anInt8034 * -1431655765];
			} else {
				arg0.modelColors = arg1.modelColors;
			}
			for (var10 = 0; var10 < this.anInt8034 * -1431655765; var10++) {
				arg0.modelColors[var10] = this.modelColors[var10];
			}
		} else {
			arg0.modelColors = this.modelColors;
		}
		if (Class160.method1884(arg2, this.anInt8081)) {
			if (arg1.aByteArray8037 == null || arg1.aByteArray8037.length < this.anInt8034 * -1431655765) {
				arg0.aByteArray8037 = arg1.aByteArray8037 = new byte[this.anInt8034 * -1431655765];
			} else {
				arg0.aByteArray8037 = arg1.aByteArray8037;
			}
			for (var10 = 0; var10 < this.anInt8034 * -1431655765; var10++) {
				arg0.aByteArray8037[var10] = this.aByteArray8037[var10];
			}
		} else {
			arg0.aByteArray8037 = this.aByteArray8037;
		}
		if (Class160.method1908(arg2, this.anInt8081)) {
			arg0.aClass173_8046 = arg1.aClass173_8046;
			arg0.aClass173_8046.anInterface9_Impl1_1733 = this.aClass173_8046.anInterface9_Impl1_1733;
			arg0.aClass173_8046.aBoolean1732 = this.aClass173_8046.aBoolean1732;
			arg0.aClass173_8046.aBoolean1731 = true;
		} else if (Class160.method1889(arg2, this.anInt8081)) {
			arg0.aClass173_8046 = this.aClass173_8046;
		} else {
			arg0.aClass173_8046 = null;
		}
		int var11;
		if (Class160.method1882(arg2, this.anInt8081)) {
			if (arg1.aShortArray8032 == null || arg1.aShortArray8032.length < this.anInt8038) {
				var10 = this.anInt8038;
				arg0.aShortArray8032 = arg1.aShortArray8032 = new short[var10];
				arg0.aShortArray8028 = arg1.aShortArray8028 = new short[var10];
				arg0.aShortArray8024 = arg1.aShortArray8024 = new short[var10];
			} else {
				arg0.aShortArray8032 = arg1.aShortArray8032;
				arg0.aShortArray8028 = arg1.aShortArray8028;
				arg0.aShortArray8024 = arg1.aShortArray8024;
			}
			if (this.aClass206_8033 == null) {
				arg0.aClass206_8033 = null;
				for (var10 = 0; var10 < this.anInt8038; var10++) {
					arg0.aShortArray8032[var10] = this.aShortArray8032[var10];
					arg0.aShortArray8028[var10] = this.aShortArray8028[var10];
					arg0.aShortArray8024[var10] = this.aShortArray8024[var10];
				}
			} else {
				if (arg1.aClass206_8033 == null) {
					arg1.aClass206_8033 = new Class206();
				}
				Class206 var12 = arg0.aClass206_8033 = arg1.aClass206_8033;
				if (var12.aShortArray1938 == null || var12.aShortArray1938.length < this.anInt8038) {
					var11 = this.anInt8038;
					var12.aShortArray1938 = new short[var11];
					var12.aShortArray1937 = new short[var11];
					var12.aShortArray1939 = new short[var11];
					var12.aByteArray1940 = new byte[var11];
				}
				for (var11 = 0; var11 < this.anInt8038; var11++) {
					arg0.aShortArray8032[var11] = this.aShortArray8032[var11];
					arg0.aShortArray8028[var11] = this.aShortArray8028[var11];
					arg0.aShortArray8024[var11] = this.aShortArray8024[var11];
					var12.aShortArray1938[var11] = this.aClass206_8033.aShortArray1938[var11];
					var12.aShortArray1937[var11] = this.aClass206_8033.aShortArray1937[var11];
					var12.aShortArray1939[var11] = this.aClass206_8033.aShortArray1939[var11];
					var12.aByteArray1940[var11] = this.aClass206_8033.aByteArray1940[var11];
				}
			}
			arg0.aByteArray8030 = this.aByteArray8030;
		} else {
			arg0.aClass206_8033 = this.aClass206_8033;
			arg0.aShortArray8032 = this.aShortArray8032;
			arg0.aShortArray8028 = this.aShortArray8028;
			arg0.aShortArray8024 = this.aShortArray8024;
			arg0.aByteArray8030 = this.aByteArray8030;
		}
		if (Class160.method1893(arg2, this.anInt8081)) {
			arg0.aClass173_8047 = arg1.aClass173_8047;
			arg0.aClass173_8047.anInterface9_Impl1_1733 = this.aClass173_8047.anInterface9_Impl1_1733;
			arg0.aClass173_8047.aBoolean1732 = this.aClass173_8047.aBoolean1732;
			arg0.aClass173_8047.aBoolean1731 = true;
		} else if (Class160.method1888(arg2, this.anInt8081)) {
			arg0.aClass173_8047 = this.aClass173_8047;
		} else {
			arg0.aClass173_8047 = null;
		}
		if (Class160.method1906(arg2, this.anInt8081)) {
			if (arg1.aFloatArray8031 == null || arg1.aFloatArray8031.length < this.anInt8034 * -1431655765) {
				var10 = this.anInt8038;
				arg0.aFloatArray8031 = arg1.aFloatArray8031 = new float[var10];
				arg0.aFloatArray8053 = arg1.aFloatArray8053 = new float[var10];
			} else {
				arg0.aFloatArray8031 = arg1.aFloatArray8031;
				arg0.aFloatArray8053 = arg1.aFloatArray8053;
			}
			for (var10 = 0; var10 < this.anInt8038; var10++) {
				arg0.aFloatArray8031[var10] = this.aFloatArray8031[var10];
				arg0.aFloatArray8053[var10] = this.aFloatArray8053[var10];
			}
		} else {
			arg0.aFloatArray8031 = this.aFloatArray8031;
			arg0.aFloatArray8053 = this.aFloatArray8053;
		}
		if (Class160.method1894(arg2, this.anInt8081)) {
			arg0.aClass173_8021 = arg1.aClass173_8021;
			arg0.aClass173_8021.anInterface9_Impl1_1733 = this.aClass173_8021.anInterface9_Impl1_1733;
			arg0.aClass173_8021.aBoolean1732 = this.aClass173_8021.aBoolean1732;
			arg0.aClass173_8021.aBoolean1731 = true;
		} else if (Class160.method1890(arg2, this.anInt8081)) {
			arg0.aClass173_8021 = this.aClass173_8021;
		} else {
			arg0.aClass173_8021 = null;
		}
		if (Class160.method1910(arg2, this.anInt8081)) {
			if (arg1.aShortArray8016 == null || arg1.aShortArray8016.length < this.anInt8034 * -1431655765) {
				var10 = this.anInt8034 * -1431655765;
				arg0.aShortArray8016 = arg1.aShortArray8016 = new short[var10];
				arg0.aShortArray8039 = arg1.aShortArray8039 = new short[var10];
				arg0.aShortArray8040 = arg1.aShortArray8040 = new short[var10];
			} else {
				arg0.aShortArray8016 = arg1.aShortArray8016;
				arg0.aShortArray8039 = arg1.aShortArray8039;
				arg0.aShortArray8040 = arg1.aShortArray8040;
			}
			for (var10 = 0; var10 < this.anInt8034 * -1431655765; var10++) {
				arg0.aShortArray8016[var10] = this.aShortArray8016[var10];
				arg0.aShortArray8039[var10] = this.aShortArray8039[var10];
				arg0.aShortArray8040[var10] = this.aShortArray8040[var10];
			}
		} else {
			arg0.aShortArray8016 = this.aShortArray8016;
			arg0.aShortArray8039 = this.aShortArray8039;
			arg0.aShortArray8040 = this.aShortArray8040;
		}
		if (Class160.method1895(arg2, this.anInt8081)) {
			arg0.aClass165_8050 = arg1.aClass165_8050;
			arg0.aClass165_8050.anInterface9_Impl2_1698 = this.aClass165_8050.anInterface9_Impl2_1698;
			arg0.aClass165_8050.aBoolean1697 = this.aClass165_8050.aBoolean1697;
			arg0.aClass165_8050.aBoolean1696 = true;
		} else if (Class160.method1891(arg2, this.anInt8081)) {
			arg0.aClass165_8050 = this.aClass165_8050;
		} else {
			arg0.aClass165_8050 = null;
		}
		if (Class160.method1898(arg2, this.anInt8081)) {
			if (arg1.modelTextures == null || arg1.modelTextures.length < this.anInt8034 * -1431655765) {
				var10 = this.anInt8034 * -1431655765;
				arg0.modelTextures = arg1.modelTextures = new short[var10];
			} else {
				arg0.modelTextures = arg1.modelTextures;
			}
			for (var10 = 0; var10 < this.anInt8034 * -1431655765; var10++) {
				arg0.modelTextures[var10] = this.modelTextures[var10];
			}
		} else {
			arg0.modelTextures = this.modelTextures;
		}
		if (!Class160.method1886(arg2, this.anInt8081)) {
			arg0.aClass177Array8071 = this.aClass177Array8071;
		} else if (arg1.aClass177Array8071 == null || arg1.aClass177Array8071.length < this.anInt8069) {
			var10 = this.anInt8069;
			arg0.aClass177Array8071 = arg1.aClass177Array8071 = new Class177[var10];
			for (var11 = 0; var11 < this.anInt8069; var11++) {
				arg0.aClass177Array8071[var11] = this.aClass177Array8071[var11].method2052();
			}
		} else {
			arg0.aClass177Array8071 = arg1.aClass177Array8071;
			for (var10 = 0; var10 < this.anInt8069; var10++) {
				arg0.aClass177Array8071[var10].method2051(this.aClass177Array8071[var10]);
			}
		}
		arg0.aClass185Array8070 = this.aClass185Array8070;
		if (this.aBoolean8043) {
			arg0.anInt8027 = this.anInt8027;
			arg0.anInt8054 = this.anInt8054;
			arg0.anInt8058 = this.anInt8058;
			arg0.anInt8059 = this.anInt8059;
			arg0.anInt8056 = this.anInt8056;
			arg0.anInt8057 = this.anInt8057;
			arg0.anInt8060 = this.anInt8060;
			arg0.anInt8078 = this.anInt8078;
			arg0.aBoolean8043 = true;
		} else {
			arg0.aBoolean8043 = false;
		}
		arg0.anIntArrayArray8022 = this.anIntArrayArray8022;
		arg0.anIntArrayArray8017 = this.anIntArrayArray8017;
		arg0.anIntArrayArray8072 = this.anIntArrayArray8072;
		arg0.aShortArray8052 = this.aShortArray8052;
		arg0.anIntArray8082 = this.anIntArray8082;
		arg0.aShortArray8025 = this.aShortArray8025;
		arg0.aShortArray8075 = this.aShortArray8075;
		arg0.aShortArray8023 = this.aShortArray8023;
		arg0.aShortArray8018 = this.aShortArray8018;
		arg0.anIntArray8062 = this.anIntArray8062;
		arg0.anIntArray8064 = this.anIntArray8064;
		arg0.anIntArray8063 = this.anIntArray8063;
		arg0.aClass93Array8026 = this.aClass93Array8026;
		arg0.aClass64Array8068 = this.aClass64Array8068;
		return arg0;
	}

	public void method4489() {
	}

	public void method4498() {
		if (this.aClass173_8045 != null) {
			this.aClass173_8045.aBoolean1732 = false;
		}
	}

	@ObfuscatedName("Class387_Sub1.EA(I)V")
	public void EA(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8020[var4] = this.anIntArray8020[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	public void method4499() {
		if ((this.anInt8081 & 0x37) == 0) {
			if (this.aClass173_8046 != null) {
				this.aClass173_8046.aBoolean1732 = false;
			}
		} else if (this.aClass173_8047 != null) {
			this.aClass173_8047.aBoolean1732 = false;
		}
	}

	public void method4500() {
		if (this.aClass165_8050 != null) {
			this.aClass165_8050.aBoolean1697 = false;
		}
	}

	@ObfuscatedName("Class387_Sub1.f(I)V")
	public void f(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.n()I")
	public int n() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8027;
	}

	@ObfuscatedName("Class387_Sub1.t(I)V")
	public void t(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var3 - this.anIntArray8051[var4] * var2 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8020[var4] * var2 + this.anIntArray8051[var4] * var3 >> 14;
			this.anIntArray8020[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.i()Z")
	public boolean i() {
		return this.aBoolean8067;
	}

	@ObfuscatedName("Class387_Sub1.ia(III)V")
	public void ia(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			if (arg0 != 0) {
				this.anIntArray8065[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8020[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8051[var4] += arg2;
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.wa()V")
	public void wa() {
		int var1;
		for (var1 = 0; var1 < this.anInt8044; var1++) {
			this.anIntArray8051[var1] = -this.anIntArray8051[var1];
		}
		for (var1 = 0; var1 < this.anInt8038; var1++) {
			this.aShortArray8024[var1] = (short) -this.aShortArray8024[var1];
		}
		for (var1 = 0; var1 < this.anInt8034 * -1431655765; var1++) {
			short var2 = this.aShortArray8016[var1];
			this.aShortArray8016[var1] = this.aShortArray8040[var1];
			this.aShortArray8040[var1] = var2;
		}
		this.method4498();
		this.method4499();
		this.method4500();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.pa(IILClass_xa;LClass_xa;III)V")
	public void pa(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		int var8 = arg4 + this.anInt8058;
		int var9 = arg4 + this.anInt8059;
		int var10 = arg6 + this.anInt8060;
		int var11 = arg6 + this.anInt8078;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6397 || var10 < 0 || var11 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6393)) {
			return;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396;
			var9 = var9 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			var10 >>= arg2.anInt6396;
			var11 = var11 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			if (arg2.method6417(var8, var10, -775390957) == arg5 && arg2.method6417(var9, var10, -1902262142) == arg5 && arg2.method6417(var8, var11, 495253824) == arg5 && arg2.method6417(var9, var11, 1365236568) == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6397 || var10 < 0 || var11 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6393) {
			return;
		}
		int var12;
		if (arg0 == 1) {
			for (var12 = 0; var12 < this.anInt8044; var12++) {
				this.anIntArray8020[var12] = this.anIntArray8020[var12] + arg2.method6416(this.anIntArray8065[var12] + arg4, this.anIntArray8051[var12] + arg6, -61158529) - arg5;
			}
		} else {
			int var13;
			int var14;
			if (arg0 == 2) {
				var12 = this.anInt8056;
				if (var12 == 0) {
					return;
				}
				for (var13 = 0; var13 < this.anInt8044; var13++) {
					var14 = (this.anIntArray8020[var13] << 16) / var12;
					if (var14 < arg1) {
						this.anIntArray8020[var13] += (arg2.method6416(this.anIntArray8065[var13] + arg4, this.anIntArray8051[var13] + arg6, -1919827665) - arg5) * (arg1 - var14) / arg1;
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
					var12 = this.anInt8057 - this.anInt8056;
					for (var13 = 0; var13 < this.anInt8044; var13++) {
						this.anIntArray8020[var13] = this.anIntArray8020[var13] + (arg3.method6416(this.anIntArray8065[var13] + arg4, this.anIntArray8051[var13] + arg6, 1797138981) - arg5) + var12;
					}
				} else if (arg0 == 5) {
					var12 = this.anInt8057 - this.anInt8056;
					for (var13 = 0; var13 < this.anInt8044; var13++) {
						var14 = this.anIntArray8065[var13] + arg4;
						var15 = this.anIntArray8051[var13] + arg6;
						int var16 = arg2.method6416(var14, var15, -1872441530);
						int var17 = arg3.method6416(var14, var15, -1339832005);
						int var18 = var16 - var17 - arg1;
						this.anIntArray8020[var13] = ((this.anIntArray8020[var13] << 8) / var12 * var18 >> 8) - (arg5 - var16);
					}
				}
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	public void method4501() {
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		int var7 = 0;
		int var8 = 0;
		for (int var9 = 0; var9 < this.anInt8044; var9++) {
			int var10 = this.anIntArray8065[var9];
			int var11 = this.anIntArray8020[var9];
			int var12 = this.anIntArray8051[var9];
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
		this.anInt8058 = var1;
		this.anInt8059 = var4;
		this.anInt8056 = var2;
		this.anInt8057 = var5;
		this.anInt8060 = var3;
		this.anInt8078 = var6;
		this.anInt8054 = (int) (Math.sqrt((double) var7) + 0.99D);
		this.anInt8027 = (int) (Math.sqrt((double) var8) + 0.99D);
		this.aBoolean8043 = true;
	}

	public boolean method4502(int arg0, int arg1, int arg2, int arg3, Class247 arg4, boolean arg5, int arg6) {
		Class249 var8 = this.aClass_ra_Sub2_8012.aClass249_8576;
		var8.method2508(arg4);
		var8.method2483(this.aClass_ra_Sub2_8012.aClass249_8492);
		boolean var9 = false;
		float var10 = Float.MAX_VALUE;
		float var11 = -3.4028235E38F;
		float var12 = Float.MAX_VALUE;
		float var13 = -3.4028235E38F;
		if (!this.aBoolean8043) {
			this.method4501();
		}
		int var14 = this.anInt8059 - this.anInt8058 >> 1;
		int var15 = this.anInt8057 - this.anInt8056 >> 1;
		int var16 = this.anInt8078 - this.anInt8060 >> 1;
		int var17 = this.anInt8058 + var14;
		int var18 = this.anInt8056 + var15;
		int var19 = this.anInt8060 + var16;
		int var20 = var17 - (var14 << arg6);
		int var21 = var18 - (var15 << arg6);
		int var22 = var19 - (var16 << arg6);
		int var23 = var17 + (var14 << arg6);
		int var24 = var18 + (var15 << arg6);
		int var25 = var19 + (var16 << arg6);
		this.anIntArray8077[0] = var20;
		this.anIntArray8029[0] = var21;
		this.anIntArray8079[0] = var22;
		this.anIntArray8077[1] = var23;
		this.anIntArray8029[1] = var21;
		this.anIntArray8079[1] = var22;
		this.anIntArray8077[2] = var20;
		this.anIntArray8029[2] = var24;
		this.anIntArray8079[2] = var22;
		this.anIntArray8077[3] = var23;
		this.anIntArray8029[3] = var24;
		this.anIntArray8079[3] = var22;
		this.anIntArray8077[4] = var20;
		this.anIntArray8029[4] = var21;
		this.anIntArray8079[4] = var25;
		this.anIntArray8077[5] = var23;
		this.anIntArray8029[5] = var21;
		this.anIntArray8079[5] = var25;
		this.anIntArray8077[6] = var20;
		this.anIntArray8029[6] = var24;
		this.anIntArray8079[6] = var25;
		this.anIntArray8077[7] = var23;
		this.anIntArray8029[7] = var24;
		this.anIntArray8079[7] = var25;
		int var26;
		float var29;
		float var30;
		float var31;
		float var32;
		float var33;
		float var34;
		float var35;
		for (var26 = 0; var26 < 8; var26++) {
			float var27 = (float) this.anIntArray8077[var26];
			float var28 = (float) this.anIntArray8029[var26];
			var29 = this.anIntArray8079[var26];
			var30 = var8.aFloatArray2631[2] * var27 + var8.aFloatArray2631[6] * var28 + var8.aFloatArray2631[10] * var29 + var8.aFloatArray2631[14];
			var31 = var8.aFloatArray2631[3] * var27 + var8.aFloatArray2631[7] * var28 + var8.aFloatArray2631[11] * var29 + var8.aFloatArray2631[15];
			if (var30 >= -var31) {
				var32 = var8.aFloatArray2631[0] * var27 + var8.aFloatArray2631[4] * var28 + var8.aFloatArray2631[8] * var29 + var8.aFloatArray2631[12];
				var33 = var8.aFloatArray2631[1] * var27 + var8.aFloatArray2631[5] * var28 + var8.aFloatArray2631[9] * var29 + var8.aFloatArray2631[13];
				var34 = this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var32 / var31;
				var35 = this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var33 / var31;
				if (var34 < var10) {
					var10 = var34;
				}
				if (var34 > var11) {
					var11 = var34;
				}
				if (var35 < var12) {
					var12 = var35;
				}
				if (var35 > var13) {
					var13 = var35;
				}
				var9 = true;
			}
		}
		var26 = arg0 + arg2;
		int var40 = arg1 + arg3;
		if (var9 && (float) var26 > var10 && (float) arg0 < var11 && (float) var40 > var12 && (float) arg1 < var13) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray8010.length < this.anInt8038) {
				this.anIntArray8010 = new int[this.anInt8038];
				this.anIntArray8076 = new int[this.anInt8038];
			}
			int var41;
			for (var41 = 0; var41 < this.anInt8044; var41++) {
				var29 = this.anIntArray8065[var41];
				var30 = this.anIntArray8020[var41];
				var31 = this.anIntArray8051[var41];
				var32 = var8.aFloatArray2631[2] * var29 + var8.aFloatArray2631[6] * var30 + var8.aFloatArray2631[10] * var31 + var8.aFloatArray2631[14];
				var33 = var8.aFloatArray2631[3] * var29 + var8.aFloatArray2631[7] * var30 + var8.aFloatArray2631[11] * var31 + var8.aFloatArray2631[15];
				int var36;
				int var37;
				if (var32 >= -var33) {
					var34 = var8.aFloatArray2631[0] * var29 + var8.aFloatArray2631[4] * var30 + var8.aFloatArray2631[8] * var31 + var8.aFloatArray2631[12];
					var35 = var8.aFloatArray2631[1] * var29 + var8.aFloatArray2631[5] * var30 + var8.aFloatArray2631[9] * var31 + var8.aFloatArray2631[13];
					var36 = this.anIntArray8082[var41];
					var37 = this.anIntArray8082[var41 + 1];
					for (int var38 = var36; var38 < var37; var38++) {
						int var39 = this.aShortArray8052[var38] - 1;
						if (var39 == -1) {
							break;
						}
						this.anIntArray8010[var39] = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var34 / var33);
						this.anIntArray8076[var39] = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var35 / var33);
					}
				} else {
					int var42 = this.anIntArray8082[var41];
					int var43 = this.anIntArray8082[var41 + 1];
					for (var36 = var42; var36 < var43; var36++) {
						var37 = this.aShortArray8052[var36] - 1;
						if (var37 == -1) {
							break;
						}
						this.anIntArray8010[this.aShortArray8052[var36] - 1] = -999999;
					}
				}
			}
			for (var41 = 0; var41 < this.anInt8034 * -1431655765; var41++) {
				if (this.anIntArray8010[this.aShortArray8016[var41]] != -999999 && this.anIntArray8010[this.aShortArray8039[var41]] != -999999 && this.anIntArray8010[this.aShortArray8040[var41]] != -999999 && this.method4513(arg0, arg1, var26, var40, this.anIntArray8076[this.aShortArray8016[var41]], this.anIntArray8076[this.aShortArray8039[var41]], this.anIntArray8076[this.aShortArray8040[var41]], this.anIntArray8010[this.aShortArray8016[var41]], this.anIntArray8010[this.aShortArray8039[var41]], this.anIntArray8010[this.aShortArray8040[var41]])) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("Class387_Sub1.dp()Z")
	public boolean dp() {
		return this.aBoolean8042;
	}

	@ObfuscatedName("Class387_Sub1.KA(I)V")
	public void KA(int arg0) {
		if (this.aClass173_8045 != null) {
			this.aClass173_8045.aBoolean1731 = Class160.method1892(arg0, this.anInt8081);
		}
		if (this.aClass173_8021 != null) {
			this.aClass173_8021.aBoolean1731 = Class160.method1894(arg0, this.anInt8081);
		}
		if (this.aClass173_8046 != null) {
			this.aClass173_8046.aBoolean1731 = Class160.method1908(arg0, this.anInt8081);
		}
		if (this.aClass173_8047 != null) {
			this.aClass173_8047.aBoolean1731 = Class160.method1893(arg0, this.anInt8081);
		}
		this.anInt8013 = arg0;
		if (this.aClass206_8033 != null && (this.anInt8013 & 0x10000) == 0) {
			this.aShortArray8032 = this.aClass206_8033.aShortArray1938;
			this.aShortArray8028 = this.aClass206_8033.aShortArray1937;
			this.aShortArray8024 = this.aClass206_8033.aShortArray1939;
			this.aByteArray8030 = this.aClass206_8033.aByteArray1940;
			this.aClass206_8033 = null;
		}
		this.aBoolean8066 = true;
		this.method4510();
	}

	public void method4491() {
		if (this.anInt8038 > 0 && this.anInt8035 * 3 * -1431655765 > 0) {
			this.method4512();
			this.method4504();
			this.method4510();
		}
	}

	@ObfuscatedName("Class387_Sub1.dh(SS)V")
	public void dh(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.cs()I")
	public int cs() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8060;
	}

	@ObfuscatedName("Class387_Sub1.AA()I")
	public int AA() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8060;
	}

	@ObfuscatedName("Class387_Sub1.ha()I")
	public int ha() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8078;
	}

	public void method4490(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub1 var6 = (Class387_Sub1) arg0;
		if (this.anInt8034 * -1431655765 == 0 || var6.anInt8034 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8044;
		int[] var8 = var6.anIntArray8065;
		int[] var9 = var6.anIntArray8020;
		int[] var10 = var6.anIntArray8051;
		short[] var11 = var6.aShortArray8032;
		short[] var12 = var6.aShortArray8028;
		short[] var13 = var6.aShortArray8024;
		byte[] var14 = var6.aByteArray8030;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass206_8033 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass206_8033.aShortArray1938;
			var16 = this.aClass206_8033.aShortArray1937;
			var17 = this.aClass206_8033.aShortArray1939;
			var18 = this.aClass206_8033.aByteArray1940;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass206_8033 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass206_8033.aShortArray1938;
			var20 = var6.aClass206_8033.aShortArray1937;
			var21 = var6.aClass206_8033.aShortArray1939;
			var22 = var6.aClass206_8033.aByteArray1940;
		}
		int[] var23 = var6.anIntArray8082;
		short[] var24 = var6.aShortArray8052;
		if (!var6.aBoolean8043) {
			var6.method4501();
		}
		int var25 = var6.anInt8056;
		int var26 = var6.anInt8057;
		int var27 = var6.anInt8058;
		int var28 = var6.anInt8059;
		int var29 = var6.anInt8060;
		int var30 = var6.anInt8078;
		for (int var31 = 0; var31 < this.anInt8044; var31++) {
			int var32 = this.anIntArray8020[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8065[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8051[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8082[var31];
						int var37 = this.anIntArray8082[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8052[var38] - 1;
							if (var35 == -1 || this.aByteArray8030[var35] != 0) {
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
											this.aClass206_8033 = new Class206();
											var15 = this.aClass206_8033.aShortArray1938 = Class263_Sub4.method2637(this.aShortArray8032, 1950115293);
											var16 = this.aClass206_8033.aShortArray1937 = Class263_Sub4.method2637(this.aShortArray8028, 1814615697);
											var17 = this.aClass206_8033.aShortArray1939 = Class263_Sub4.method2637(this.aShortArray8024, 1468741137);
											var18 = this.aClass206_8033.aByteArray1940 = IcmpService_Sub1.method6479(this.aByteArray8030, (byte) 2);
										}
										if (var19 == null) {
											Class206 var46 = var6.aClass206_8033 = new Class206();
											var19 = var46.aShortArray1938 = Class263_Sub4.method2637(var11, 2132385099);
											var20 = var46.aShortArray1937 = Class263_Sub4.method2637(var12, 2075427839);
											var21 = var46.aShortArray1939 = Class263_Sub4.method2637(var13, 2147380625);
											var22 = var46.aByteArray1940 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8032[var35];
										short var41 = this.aShortArray8028[var35];
										short var42 = this.aShortArray8024[var35];
										byte var43 = this.aByteArray8030[var35];
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
										var36 = this.anIntArray8082[var31];
										var37 = this.anIntArray8082[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8052[var44] - 1;
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
										var6.method4499();
										this.method4499();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.p(I)V")
	public void p(int arg0) {
		this.aShort8015 = (short) arg0;
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.Q(I)V")
	public void Q(int arg0) {
		this.aShort8083 = (short) arg0;
		this.method4498();
		this.method4499();
	}

	@ObfuscatedName("Class387_Sub1.c()I")
	public int c() {
		return this.aShort8015;
	}

	@ObfuscatedName("Class387_Sub1.bs(I)V")
	public void bs(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	public void method4472() {
	}

	public boolean method4487() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub2_8012.aClass188_8552.method2095(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	public void paintTexture(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8034 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, -724901614);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, -1426124732);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8042 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass185Array8070 != null) {
			for (int var13 = 0; var13 < this.anInt8069; var13++) {
				Class185 var9 = this.aClass185Array8070[var13];
				Class177 var10 = this.aClass177Array8071[var13];
				var10.anInt1750 = var10.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.N()I")
	public int N() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8054;
	}

	public boolean method4462() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub2_8012.aClass188_8552.method2095(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub1.ya()I")
	public int ya() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8059;
	}

	public void method4455() {
	}

	public void method4448() {
	}

	@ObfuscatedName("Class387_Sub1.ea()Z")
	public boolean ea() {
		if (this.anIntArrayArray8022 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.anInt8014; var1++) {
			this.anIntArray8065[var1] <<= 0x4;
			this.anIntArray8020[var1] <<= 0x4;
			this.anIntArray8051[var1] <<= 0x4;
		}
		this.anInt8080 = 0;
		this.anInt8061 = 0;
		this.anInt8055 = 0;
		return true;
	}

	@ObfuscatedName("Class387_Sub1.ca()I")
	public int ca() {
		return this.aShort8015;
	}

	@ObfuscatedName("Class387_Sub1.w(IIII)V")
	public void w(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var6 = 0; var6 < this.anInt8044; var6++) {
				this.anInt8080 += this.anIntArray8065[var6];
				this.anInt8061 += this.anIntArray8020[var6];
				this.anInt8055 += this.anIntArray8051[var6];
				var5++;
			}
			if (var5 > 0) {
				this.anInt8080 = this.anInt8080 / var5 + arg1;
				this.anInt8061 = this.anInt8061 / var5 + arg2;
				this.anInt8055 = this.anInt8055 / var5 + arg3;
			} else {
				this.anInt8080 = arg1;
				this.anInt8061 = arg2;
				this.anInt8055 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8044; var5++) {
				this.anIntArray8065[var5] += arg1;
				this.anIntArray8020[var5] += arg2;
				this.anIntArray8051[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8044; var5++) {
					this.anIntArray8065[var5] -= this.anInt8080;
					this.anIntArray8020[var5] -= this.anInt8061;
					this.anIntArray8051[var5] -= this.anInt8055;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8020[var5] * var6 + this.anIntArray8065[var5] * var7 + 16383 >> 14;
						this.anIntArray8020[var5] = this.anIntArray8020[var5] * var7 - this.anIntArray8065[var5] * var6 + 16383 >> 14;
						this.anIntArray8065[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8020[var5] * var7 - this.anIntArray8051[var5] * var6 + 16383 >> 14;
						this.anIntArray8051[var5] = this.anIntArray8020[var5] * var6 + this.anIntArray8051[var5] * var7 + 16383 >> 14;
						this.anIntArray8020[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8051[var5] * var6 + this.anIntArray8065[var5] * var7 + 16383 >> 14;
						this.anIntArray8051[var5] = this.anIntArray8051[var5] * var7 - this.anIntArray8065[var5] * var6 + 16383 >> 14;
						this.anIntArray8065[var5] = var8;
					}
					this.anIntArray8065[var5] += this.anInt8080;
					this.anIntArray8020[var5] += this.anInt8061;
					this.anIntArray8051[var5] += this.anInt8055;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8044; var5++) {
					this.anIntArray8065[var5] -= this.anInt8080;
					this.anIntArray8020[var5] -= this.anInt8061;
					this.anIntArray8051[var5] -= this.anInt8055;
					this.anIntArray8065[var5] = this.anIntArray8065[var5] * arg1 / 128;
					this.anIntArray8020[var5] = this.anIntArray8020[var5] * arg2 / 128;
					this.anIntArray8051[var5] = this.anIntArray8051[var5] * arg3 / 128;
					this.anIntArray8065[var5] += this.anInt8080;
					this.anIntArray8020[var5] += this.anInt8061;
					this.anIntArray8051[var5] += this.anInt8055;
				}
			} else {
				Class177 var10;
				Class185 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
						var6 = (this.aByteArray8037[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8037[var5] = (byte) var6;
					}
					if (this.aClass185Array8070 != null) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var11 = this.aClass185Array8070[var5];
							var10 = this.aClass177Array8071[var5];
							var10.anInt1750 = var10.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var11.modelColorIndex] & 0xFF) << 24;
						}
					}
					this.method4507();
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
					if (this.aClass185Array8070 != null) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var11 = this.aClass185Array8070[var5];
							var10 = this.aClass177Array8071[var5];
							var10.anInt1750 = var10.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var11.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				} else {
					Class177 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1751 += arg1;
							var12.anInt1748 += arg2;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1752 = var12.anInt1752 * arg1 >> 7;
							var12.anInt1749 = var12.anInt1749 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1753 = var12.anInt1753 + arg1 & 0x3FFF;
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
		int var11;
		int[] var12;
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
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var12 = this.anIntArrayArray8022[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8080 += this.anIntArray8065[var14];
						this.anInt8061 += this.anIntArray8020[var14];
						this.anInt8055 += this.anIntArray8051[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8080 = this.anInt8080 / var9 + var21;
				this.anInt8061 = this.anInt8061 / var9 + var22;
				this.anInt8055 = this.anInt8055 / var9 + var23;
			} else {
				this.anInt8080 = var21;
				this.anInt8061 = var22;
				this.anInt8055 = var23;
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
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] += var21;
						this.anIntArray8020[var13] += var22;
						this.anIntArray8051[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8022.length) {
						var24 = this.anIntArrayArray8022[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8082[var13];
							var15 = this.anIntArray8082[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8052[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8028[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8028[var17] = (short) (this.aShortArray8028[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8028[var17] * var19 - this.aShortArray8024[var17] * var18 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8028[var17] * var18 + this.aShortArray8024[var17] * var19 + 16383 >> 14);
									this.aShortArray8028[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8024[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8024[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
							}
						}
					}
				}
				this.method4499();
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] -= this.anInt8080;
						this.anIntArray8020[var13] -= this.anInt8061;
						this.anIntArray8051[var13] -= this.anInt8055;
						this.anIntArray8065[var13] = this.anIntArray8065[var13] * arg2 >> 7;
						this.anIntArray8020[var13] = this.anIntArray8020[var13] * arg3 >> 7;
						this.anIntArray8051[var13] = this.anIntArray8051[var13] * arg4 >> 7;
						this.anIntArray8065[var13] += this.anInt8080;
						this.anIntArray8020[var13] += this.anInt8061;
						this.anIntArray8051[var13] += this.anInt8055;
					}
				}
			}
		} else {
			boolean var26;
			Class185 var27;
			Class177 var28;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var26 = false;
					for (var10 = 0; var10 < var8; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8017.length) {
							var12 = this.anIntArrayArray8017[var11];
							for (var13 = 0; var13 < var12.length; var13++) {
								var14 = var12[var13];
								var15 = (this.aByteArray8037[var14] & 0xFF) + arg2 * 8;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 255) {
									var15 = 255;
								}
								this.aByteArray8037[var14] = (byte) var15;
							}
							var26 |= var12.length > 0;
						}
					}
					if (var26) {
						if (this.aClass185Array8070 != null) {
							for (var10 = 0; var10 < this.anInt8069; var10++) {
								var27 = this.aClass185Array8070[var10];
								var28 = this.aClass177Array8071[var10];
								var28.anInt1750 = var28.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var27.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var29;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1751 += arg2;
									var29.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1752 = var29.anInt1752 * arg2 >> 7;
									var29.anInt1749 = var29.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8072.length) {
							var24 = this.anIntArrayArray8072[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var29 = this.aClass177Array8071[var24[var25]];
								var29.anInt1753 = var29.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var26 = false;
				for (var10 = 0; var10 < var8; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8017.length) {
						var12 = this.anIntArrayArray8017[var11];
						for (var13 = 0; var13 < var12.length; var13++) {
							var14 = var12[var13];
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
						}
						var26 |= var12.length > 0;
					}
				}
				if (var26) {
					if (this.aClass185Array8070 != null) {
						for (var10 = 0; var10 < this.anInt8069; var10++) {
							var27 = this.aClass185Array8070[var10];
							var28 = this.aClass177Array8071[var10];
							var28.anInt1750 = var28.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var27.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.cm()I")
	public int cm() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8056;
	}

	public void method4488(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8023 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub2_8012.aClass247_8513;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8044; var6++) {
			if ((arg1 & this.aShortArray8023[var6]) != 0) {
				var4.method2465((float) this.anIntArray8065[var6], (float) this.anIntArray8020[var6], (float) this.anIntArray8051[var6], var5);
				this.anIntArray8065[var6] = (int) var5[0];
				this.anIntArray8020[var6] = (int) var5[1];
				this.anIntArray8051[var6] = (int) var5[2];
			}
		}
	}

	public Class64[] method4445() {
		return this.aClass64Array8068;
	}

	@ObfuscatedName("Class387_Sub1.ah()I")
	public int ah() {
		return this.anInt8013;
	}

	public void method4463(Class247 arg0) {
		Class249 var2 = this.aClass_ra_Sub2_8012.aClass249_8576;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8026 != null) {
			for (var3 = 0; var3 < this.aClass93Array8026.length; var3++) {
				Class93 var4 = this.aClass93Array8026[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt841] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt841] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt841]);
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt841] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt841] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt841]);
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt841] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt841] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt841]);
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt835] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt835] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt835]);
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt835] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt835] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt835]);
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt835] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt835] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt835]);
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt836] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt836] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt836]);
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt836] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt836] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt836]);
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt836] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt836] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt836]);
			}
		}
		if (this.aClass64Array8068 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8068.length; var3++) {
			Class64 var6 = this.aClass64Array8068[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var6.anInt566] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var6.anInt566] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var6.anInt566]);
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var6.anInt566] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var6.anInt566] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var6.anInt566]);
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var6.anInt566] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var6.anInt566] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var6.anInt566]);
		}
	}

	public boolean method4458(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		return this.method4502(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@ObfuscatedName("Class387_Sub1.cl(I)V")
	public void cl(int arg0) {
		this.aShort8015 = (short) arg0;
		this.method4507();
	}

	public void method4460(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				this.aByteArray8037[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8037[var3] = (byte) var4;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.ga(LClass_na;)LClass_na;")
	public Class_na ga(Class_na arg0) {
		if (this.anInt8038 == 0) {
			return null;
		}
		if (!this.aBoolean8043) {
			this.method4501();
		}
		int var2;
		int var3;
		if (this.aClass_ra_Sub2_8012.anInt8541 > 0) {
			var2 = this.anInt8058 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
			var3 = this.anInt8059 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
		} else {
			var2 = this.anInt8058 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
			var3 = this.anInt8059 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
		}
		int var4;
		int var5;
		if (this.aClass_ra_Sub2_8012.anInt8599 > 0) {
			var4 = this.anInt8060 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
			var5 = this.anInt8078 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
		} else {
			var4 = this.anInt8060 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
			var5 = this.anInt8078 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		Class_na_Sub1 var8 = (Class_na_Sub1) arg0;
		Class_na_Sub1 var9;
		if (var8 != null && var8.method3528(var6, var7)) {
			var9 = var8;
			var8.method3525();
		} else {
			var9 = new Class_na_Sub1(this.aClass_ra_Sub2_8012, var6, var7);
		}
		var9.method3524(var2, var4, var3, var5);
		this.method4508(var9);
		return var9;
	}

	public void method4475(Class247 arg0, Class80 arg1, int arg2) {
		if (aClass172_8084 != null) {
			aClass172_8084.method2048();
		}
		if (arg1 != null) {
			arg1.aBoolean671 = false;
		}
		if (this.anInt8038 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub2_8012.aClass249_8488;
		Class249 var5 = this.aClass_ra_Sub2_8012.aClass249_8576;
		Class249 var6 = this.aClass_ra_Sub2_8012.aClass249_8479;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub2_8012.aClass249_8492);
		if (!this.aBoolean8043) {
			this.method4501();
		}
		float[] var7 = this.aClass_ra_Sub2_8012.aFloatArray8481;
		var5.method2511(0.0F, (float) this.anInt8056, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.anInt8057, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub2_8012.aFloatArrayArray8494[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8054;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8054;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.anInt8058 + this.anInt8059 >> 1;
			int var36 = this.anInt8060 + this.anInt8078 >> 1;
			int var19 = this.anInt8056;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.anInt8057;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var26 / var28);
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
						arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt669 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt668 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub2_8012.method4990(arg2);
		this.method4509(arg0);
		this.aClass_ra_Sub2_8012.method4990(0);
		var5.method2508(arg0);
		var5.method2483(this.aClass_ra_Sub2_8012.aClass249_8472);
		this.method4503(var5);
	}

	public void method4503(Class249 arg0) {
		if (this.aClass185Array8070 == null) {
			return;
		}
		this.aClass_ra_Sub2_8012.RA(!this.aBoolean8067);
		Class247 var2 = this.aClass_ra_Sub2_8012.aClass247_8513;
		Class126 var3 = this.aClass_ra_Sub2_8012.aClass126_8562;
		for (int var4 = 0; var4 < this.anInt8069; var4++) {
			Class185 var5 = this.aClass185Array8070[var4];
			Class177 var6 = this.aClass177Array8071[var4];
			if (!var5.aBoolean1821 || !this.aClass_ra_Sub2_8012.cg()) {
				float var7 = (float) (this.anIntArray8065[var5.anInt1816] + this.anIntArray8065[var5.anInt1815] + this.anIntArray8065[var5.anInt1814]) * 0.3333333F;
				float var8 = (float) (this.anIntArray8020[var5.anInt1816] + this.anIntArray8020[var5.anInt1815] + this.anIntArray8020[var5.anInt1814]) * 0.3333333F;
				float var9 = (float) (this.anIntArray8051[var5.anInt1816] + this.anIntArray8051[var5.anInt1815] + this.anIntArray8051[var5.anInt1814]) * 0.3333333F;
				float var10 = arg0.aFloatArray2631[0] * var7 + arg0.aFloatArray2631[4] * var8 + arg0.aFloatArray2631[8] * var9 + arg0.aFloatArray2631[12];
				float var11 = arg0.aFloatArray2631[1] * var7 + arg0.aFloatArray2631[5] * var8 + arg0.aFloatArray2631[9] * var9 + arg0.aFloatArray2631[13];
				float var12 = arg0.aFloatArray2631[2] * var7 + arg0.aFloatArray2631[6] * var8 + arg0.aFloatArray2631[10] * var9 + arg0.aFloatArray2631[14];
				float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11 + var12 * var12))) * (float) var5.anInt1822;
				var2.method2475(var6.anInt1753, var6.anInt1752 * var5.aShort1818 >> 7, var6.anInt1749 * var5.aShort1819 >> 7, var10 + (float) var6.anInt1751 - var10 * var13, var11 + (float) var6.anInt1748 - var11 * var13, var12 - var12 * var13);
				var2.method2467(this.aClass_ra_Sub2_8012.aClass247_8596);
				this.aClass_ra_Sub2_8012.aClass249_8479.method2508(var2);
				var3.method1532(this.aClass_ra_Sub2_8012.aClass249_8479);
				var3.aClass249_1460.method2516();
				var3.anInt1462 = var6.anInt1750;
				var3.anInterface11_Impl3_1461 = this.aClass_ra_Sub2_8012.aClass188_8552.method2093(var5.aShort1820);
				var3.method1533();
			}
		}
		this.aClass_ra_Sub2_8012.RA(true);
	}

	public boolean method4504() {
		if (this.aClass165_8050.aBoolean1697) {
			return true;
		}
		if (this.aClass165_8050.anInterface9_Impl2_1695 == null) {
			this.aClass165_8050.anInterface9_Impl2_1695 = this.aClass_ra_Sub2_8012.method4975(false);
		}
		Interface9_Impl2 var1 = this.aClass165_8050.anInterface9_Impl2_1695;
		var1.method148(this.anInt8035 * 6);
		Unsafe var2 = this.aClass_ra_Sub2_8012.anUnsafe8461;
		if (var2 != null) {
			int var7 = this.anInt8035 * 6;
			long var8 = var1.method94(0, var7);
			if (var8 == 0L) {
				return false;
			}
			for (int var6 = 0; var6 < this.anInt8035; var6++) {
				var2.putShort(var8, this.aShortArray8016[var6]);
				var8 += 2L;
				var2.putShort(var8, this.aShortArray8039[var6]);
				var8 += 2L;
				var2.putShort(var8, this.aShortArray8040[var6]);
				var8 += 2L;
			}
			var1.method95();
			this.aClass165_8050.anInterface9_Impl2_1698 = var1;
			this.aClass165_8050.aBoolean1697 = true;
			this.aBoolean8066 = true;
			return true;
		}
		ByteBuffer var3 = this.aClass_ra_Sub2_8012.aByteBuffer8458;
		var3.clear();
		for (int var4 = 0; var4 < this.anInt8035; var4++) {
			var3.putShort(this.aShortArray8016[var4]);
			var3.putShort(this.aShortArray8039[var4]);
			var3.putShort(this.aShortArray8040[var4]);
		}
		if (var1.method97(0, var3.position(), this.aClass_ra_Sub2_8012.aLong8459)) {
			this.aClass165_8050.anInterface9_Impl2_1698 = var1;
			this.aClass165_8050.aBoolean1697 = true;
			this.aBoolean8066 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("Class387_Sub1.o()I")
	public int o() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8057;
	}

	public Class64[] method4452() {
		return this.aClass64Array8068;
	}

	public int method4505(int arg0, int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	public int method4506(int arg0, short arg1, int arg2) {
		int var4 = this.aClass_ra_Sub2_8012.anIntArray8467[this.method4505(arg0, arg2)];
		if (arg1 != -1) {
			Class56 var5 = this.aClass_ra_Sub2_8012.anInterface_ma4227.method221(arg1 & 0xFFFF, 1811558887);
			int var6 = var5.aByte529 & 0xFF;
			int var7;
			int var9;
			if (var6 != 0) {
				var7 = arg2 * 131586;
				if (var6 == 256) {
					var4 = var7;
				} else {
					var9 = 256 - var6;
					var4 = ((var7 & 0xFF00FF) * var6 + (var4 & 0xFF00FF) * var9 & 0xFF00FF00) + ((var7 & 0xFF00) * var6 + (var4 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			var7 = var5.aByte534 & 0xFF;
			if (var7 != 0) {
				var7 += 256;
				int var8 = (var4 >> 16 & 0xFF) * var7;
				if (var8 > 65535) {
					var8 = 65535;
				}
				var9 = (var4 >> 8 & 0xFF) * var7;
				if (var9 > 65535) {
					var9 = 65535;
				}
				int var10 = (var4 & 0xFF) * var7;
				if (var10 > 65535) {
					var10 = 65535;
				}
				var4 = ((var8 & 0xFF00) << 8) + (var9 & 0xFF00) + (var10 >> 8);
			}
		}
		return var4 & 0xFFFFFF;
	}

	@ObfuscatedName("Class387_Sub1.bi(III)V")
	public void bi(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			if (arg0 != 0) {
				this.anIntArray8065[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8020[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8051[var4] += arg2;
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	public void method4466(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub1 var6 = (Class387_Sub1) arg0;
		if (this.anInt8034 * -1431655765 == 0 || var6.anInt8034 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8044;
		int[] var8 = var6.anIntArray8065;
		int[] var9 = var6.anIntArray8020;
		int[] var10 = var6.anIntArray8051;
		short[] var11 = var6.aShortArray8032;
		short[] var12 = var6.aShortArray8028;
		short[] var13 = var6.aShortArray8024;
		byte[] var14 = var6.aByteArray8030;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass206_8033 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass206_8033.aShortArray1938;
			var16 = this.aClass206_8033.aShortArray1937;
			var17 = this.aClass206_8033.aShortArray1939;
			var18 = this.aClass206_8033.aByteArray1940;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass206_8033 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass206_8033.aShortArray1938;
			var20 = var6.aClass206_8033.aShortArray1937;
			var21 = var6.aClass206_8033.aShortArray1939;
			var22 = var6.aClass206_8033.aByteArray1940;
		}
		int[] var23 = var6.anIntArray8082;
		short[] var24 = var6.aShortArray8052;
		if (!var6.aBoolean8043) {
			var6.method4501();
		}
		int var25 = var6.anInt8056;
		int var26 = var6.anInt8057;
		int var27 = var6.anInt8058;
		int var28 = var6.anInt8059;
		int var29 = var6.anInt8060;
		int var30 = var6.anInt8078;
		for (int var31 = 0; var31 < this.anInt8044; var31++) {
			int var32 = this.anIntArray8020[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8065[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8051[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8082[var31];
						int var37 = this.anIntArray8082[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8052[var38] - 1;
							if (var35 == -1 || this.aByteArray8030[var35] != 0) {
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
											this.aClass206_8033 = new Class206();
											var15 = this.aClass206_8033.aShortArray1938 = Class263_Sub4.method2637(this.aShortArray8032, 1762849454);
											var16 = this.aClass206_8033.aShortArray1937 = Class263_Sub4.method2637(this.aShortArray8028, 1940891339);
											var17 = this.aClass206_8033.aShortArray1939 = Class263_Sub4.method2637(this.aShortArray8024, 2080051765);
											var18 = this.aClass206_8033.aByteArray1940 = IcmpService_Sub1.method6479(this.aByteArray8030, (byte) 2);
										}
										if (var19 == null) {
											Class206 var46 = var6.aClass206_8033 = new Class206();
											var19 = var46.aShortArray1938 = Class263_Sub4.method2637(var11, 1412897576);
											var20 = var46.aShortArray1937 = Class263_Sub4.method2637(var12, 1954935584);
											var21 = var46.aShortArray1939 = Class263_Sub4.method2637(var13, 1726172372);
											var22 = var46.aByteArray1940 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8032[var35];
										short var41 = this.aShortArray8028[var35];
										short var42 = this.aShortArray8024[var35];
										byte var43 = this.aByteArray8030[var35];
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
										var36 = this.anIntArray8082[var31];
										var37 = this.anIntArray8082[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8052[var44] - 1;
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
										var6.method4499();
										this.method4499();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method4467(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub1 var6 = (Class387_Sub1) arg0;
		if (this.anInt8034 * -1431655765 == 0 || var6.anInt8034 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8044;
		int[] var8 = var6.anIntArray8065;
		int[] var9 = var6.anIntArray8020;
		int[] var10 = var6.anIntArray8051;
		short[] var11 = var6.aShortArray8032;
		short[] var12 = var6.aShortArray8028;
		short[] var13 = var6.aShortArray8024;
		byte[] var14 = var6.aByteArray8030;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass206_8033 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass206_8033.aShortArray1938;
			var16 = this.aClass206_8033.aShortArray1937;
			var17 = this.aClass206_8033.aShortArray1939;
			var18 = this.aClass206_8033.aByteArray1940;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass206_8033 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass206_8033.aShortArray1938;
			var20 = var6.aClass206_8033.aShortArray1937;
			var21 = var6.aClass206_8033.aShortArray1939;
			var22 = var6.aClass206_8033.aByteArray1940;
		}
		int[] var23 = var6.anIntArray8082;
		short[] var24 = var6.aShortArray8052;
		if (!var6.aBoolean8043) {
			var6.method4501();
		}
		int var25 = var6.anInt8056;
		int var26 = var6.anInt8057;
		int var27 = var6.anInt8058;
		int var28 = var6.anInt8059;
		int var29 = var6.anInt8060;
		int var30 = var6.anInt8078;
		for (int var31 = 0; var31 < this.anInt8044; var31++) {
			int var32 = this.anIntArray8020[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8065[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8051[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8082[var31];
						int var37 = this.anIntArray8082[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8052[var38] - 1;
							if (var35 == -1 || this.aByteArray8030[var35] != 0) {
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
											this.aClass206_8033 = new Class206();
											var15 = this.aClass206_8033.aShortArray1938 = Class263_Sub4.method2637(this.aShortArray8032, 1837889535);
											var16 = this.aClass206_8033.aShortArray1937 = Class263_Sub4.method2637(this.aShortArray8028, 1678772099);
											var17 = this.aClass206_8033.aShortArray1939 = Class263_Sub4.method2637(this.aShortArray8024, 1481146845);
											var18 = this.aClass206_8033.aByteArray1940 = IcmpService_Sub1.method6479(this.aByteArray8030, (byte) 2);
										}
										if (var19 == null) {
											Class206 var46 = var6.aClass206_8033 = new Class206();
											var19 = var46.aShortArray1938 = Class263_Sub4.method2637(var11, 1824430421);
											var20 = var46.aShortArray1937 = Class263_Sub4.method2637(var12, 1483035051);
											var21 = var46.aShortArray1939 = Class263_Sub4.method2637(var13, 1549000936);
											var22 = var46.aByteArray1940 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8032[var35];
										short var41 = this.aShortArray8028[var35];
										short var42 = this.aShortArray8024[var35];
										byte var43 = this.aByteArray8030[var35];
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
										var36 = this.anIntArray8082[var31];
										var37 = this.anIntArray8082[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8052[var44] - 1;
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
										var6.method4499();
										this.method4499();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Class387 method4468(byte arg0, int arg1, boolean arg2) {
		boolean var4 = false;
		Class387_Sub1 var5;
		Class387_Sub1 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass_ra_Sub2_8012.aClass387_Sub1Array8609[arg0 - 1];
			var5 = this.aClass_ra_Sub2_8012.aClass387_Sub1Array8534[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub1(this.aClass_ra_Sub2_8012, 0, 0, true, false);
		}
		return this.method4497(var5, var6, arg1, var4, arg2);
	}

	@ObfuscatedName("Class387_Sub1.ck(I)V")
	public void ck(int arg0) {
		this.aShort8015 = (short) arg0;
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.av()I")
	public int av() {
		return this.anInt8013;
	}

	@ObfuscatedName("Class387_Sub1.dm(IIII)V")
	public void dm(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
		if (this.aClass185Array8070 != null) {
			for (var5 = 0; var5 < this.anInt8069; var5++) {
				Class185 var10 = this.aClass185Array8070[var5];
				Class177 var11 = this.aClass177Array8071[var5];
				var11.anInt1750 = var11.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.am()I")
	public int am() {
		return this.anInt8013;
	}

	@ObfuscatedName("Class387_Sub1.au(I)V")
	public void au(int arg0) {
		if (this.aClass173_8045 != null) {
			this.aClass173_8045.aBoolean1731 = Class160.method1892(arg0, this.anInt8081);
		}
		if (this.aClass173_8021 != null) {
			this.aClass173_8021.aBoolean1731 = Class160.method1894(arg0, this.anInt8081);
		}
		if (this.aClass173_8046 != null) {
			this.aClass173_8046.aBoolean1731 = Class160.method1908(arg0, this.anInt8081);
		}
		if (this.aClass173_8047 != null) {
			this.aClass173_8047.aBoolean1731 = Class160.method1893(arg0, this.anInt8081);
		}
		this.anInt8013 = arg0;
		if (this.aClass206_8033 != null && (this.anInt8013 & 0x10000) == 0) {
			this.aShortArray8032 = this.aClass206_8033.aShortArray1938;
			this.aShortArray8028 = this.aClass206_8033.aShortArray1937;
			this.aShortArray8024 = this.aClass206_8033.aShortArray1939;
			this.aByteArray8030 = this.aClass206_8033.aByteArray1940;
			this.aClass206_8033 = null;
		}
		this.aBoolean8066 = true;
		this.method4510();
	}

	@ObfuscatedName("Class387_Sub1.PA(IIII)V")
	public void PA(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
		if (this.aClass185Array8070 != null) {
			for (var5 = 0; var5 < this.anInt8069; var5++) {
				Class185 var10 = this.aClass185Array8070[var5];
				Class177 var11 = this.aClass177Array8071[var5];
				var11.anInt1750 = var11.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.ao(I)V")
	public void ao(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.bg(I)V")
	public void bg(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	public void method4465(Class247 arg0) {
		Class249 var2 = this.aClass_ra_Sub2_8012.aClass249_8576;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8026 != null) {
			for (var3 = 0; var3 < this.aClass93Array8026.length; var3++) {
				Class93 var4 = this.aClass93Array8026[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt841 * -575024885 * -1670679901]) * 432673201 * -1343121583;
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt841 * -575024885 * -1670679901]) * -1138862783 * 76626625;
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt841 * -575024885 * -1670679901]) * -555868357 * 214524403;
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt835 * -1090746067 * -614748507]) * -707023853 * -37814757;
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt835 * -1090746067 * -614748507]) * -648890367 * -1964161023;
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt835 * -1090746067 * -614748507]) * -1672139309 * 1731506779;
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var4.anInt836 * 1207374163 * -878748965]) * 488615051 * 599939875;
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var4.anInt836 * 1207374163 * -878748965]) * 197668655 * 1664972751;
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var4.anInt836 * 1207374163 * -878748965]) * 471540135 * 1194030615;
			}
		}
		if (this.aClass64Array8068 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8068.length; var3++) {
			Class64 var6 = this.aClass64Array8068[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8065[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[4] * (float) this.anIntArray8020[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[8] * (float) this.anIntArray8051[var6.anInt566 * 2126578851 * 1669844747]) * -686746519 * -1407861799;
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8065[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[5] * (float) this.anIntArray8020[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[9] * (float) this.anIntArray8051[var6.anInt566 * 2126578851 * 1669844747]) * -635472619 * -1713950147;
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8065[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[6] * (float) this.anIntArray8020[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[10] * (float) this.anIntArray8051[var6.anInt566 * 2126578851 * 1669844747]) * 1225142127 * -1854140529;
		}
	}

	@ObfuscatedName("Class387_Sub1.bo(I)V")
	public void bo(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.bt(I)V")
	public void bt(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.bc(I)V")
	public void bc(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var3 - this.anIntArray8051[var4] * var2 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8020[var4] * var2 + this.anIntArray8051[var4] * var3 >> 14;
			this.anIntArray8020[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.by(IILClass_xa;LClass_xa;III)V")
	public void by(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		int var8 = arg4 + this.anInt8058;
		int var9 = arg4 + this.anInt8059;
		int var10 = arg6 + this.anInt8060;
		int var11 = arg6 + this.anInt8078;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6393 * -1805935063 * 24567321)) {
			return;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var9 = var9 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			var10 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var11 = var11 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			if (arg2.method6417(var8, var10, 1008467058) == arg5 && arg2.method6417(var9, var10, -1889681399) == arg5 && arg2.method6417(var8, var11, -1060142183) == arg5 && arg2.method6417(var9, var11, -525258275) == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6393 * -1805935063 * 24567321) {
			return;
		}
		int var12;
		if (arg0 == 1) {
			for (var12 = 0; var12 < this.anInt8044; var12++) {
				this.anIntArray8020[var12] = this.anIntArray8020[var12] + arg2.method6416(this.anIntArray8065[var12] + arg4, this.anIntArray8051[var12] + arg6, 1800833256) - arg5;
			}
		} else {
			int var13;
			int var14;
			if (arg0 == 2) {
				var12 = this.anInt8056;
				if (var12 == 0) {
					return;
				}
				for (var13 = 0; var13 < this.anInt8044; var13++) {
					var14 = (this.anIntArray8020[var13] << 16) / var12;
					if (var14 < arg1) {
						this.anIntArray8020[var13] += (arg2.method6416(this.anIntArray8065[var13] + arg4, this.anIntArray8051[var13] + arg6, -1539177000) - arg5) * (arg1 - var14) / arg1;
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
					var12 = this.anInt8057 - this.anInt8056;
					for (var13 = 0; var13 < this.anInt8044; var13++) {
						this.anIntArray8020[var13] = this.anIntArray8020[var13] + (arg3.method6416(this.anIntArray8065[var13] + arg4, this.anIntArray8051[var13] + arg6, -1158412862) - arg5) + var12;
					}
				} else if (arg0 == 5) {
					var12 = this.anInt8057 - this.anInt8056;
					for (var13 = 0; var13 < this.anInt8044; var13++) {
						var14 = this.anIntArray8065[var13] + arg4;
						var15 = this.anIntArray8051[var13] + arg6;
						int var16 = arg2.method6416(var14, var15, -2139982536);
						int var17 = arg3.method6416(var14, var15, -62007628);
						int var18 = var16 - var17 - arg1;
						this.anIntArray8020[var13] = ((this.anIntArray8020[var13] << 8) / var12 * var18 >> 8) - (arg5 - var16);
					}
				}
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.bl(I)V")
	public void bl(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8020[var4] = this.anIntArray8020[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.cg()I")
	public int cg() {
		return this.aShort8015;
	}

	@ObfuscatedName("Class387_Sub1.da(SS)V")
	public void da(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.dg()[B")
	public byte[] dg() {
		return this.aByteArray8037;
	}

	@ObfuscatedName("Class387_Sub1.be(III)V")
	public void be(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			if (arg0 != 128) {
				this.anIntArray8065[var4] = this.anIntArray8065[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray8020[var4] = this.anIntArray8020[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray8051[var4] = this.anIntArray8051[var4] * arg2 >> 7;
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	public void method4479() {
		if (this.anInt8038 > 0 && this.anInt8035 > 0) {
			this.method4512();
			this.method4504();
			this.method4510();
		}
	}

	@ObfuscatedName("Class387_Sub1.cw()I")
	public int cw() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8057;
	}

	@ObfuscatedName("Class387_Sub1.e(I[IIIIZI[I)V")
	public void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int[] var13;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8022.length) {
					var13 = this.anIntArrayArray8022[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var15]) != 0) {
							this.anInt8080 += this.anIntArray8065[var15];
							this.anInt8061 += this.anIntArray8020[var15];
							this.anInt8055 += this.anIntArray8051[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8080 = this.anInt8080 / var10 + arg2;
				this.anInt8061 = this.anInt8061 / var10 + arg3;
				this.anInt8055 = this.anInt8055 / var10 + arg4;
				this.aBoolean8048 = true;
			} else {
				this.anInt8080 = arg2;
				this.anInt8061 = arg3;
				this.anInt8055 = arg4;
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
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] += arg2;
							this.anIntArray8020[var14] += arg3;
							this.anIntArray8051[var14] += arg4;
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
		int[] var60;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8022.length) {
						var47 = this.anIntArrayArray8022[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
								this.anIntArray8065[var14] -= this.anInt8080;
								this.anIntArray8020[var14] -= this.anInt8061;
								this.anIntArray8051[var14] -= this.anInt8055;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8020[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = this.anIntArray8020[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8020[var14] * var16 - this.anIntArray8051[var14] * var15 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8020[var14] * var15 + this.anIntArray8051[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8051[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8051[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								this.anIntArray8065[var14] += this.anInt8080;
								this.anIntArray8020[var14] += this.anInt8061;
								this.anIntArray8051[var14] += this.anInt8055;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8022.length) {
							var47 = this.anIntArrayArray8022[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
									var15 = this.anIntArray8082[var14];
									var16 = this.anIntArray8082[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8052[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8028[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8028[var18] = (short) (this.aShortArray8028[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8028[var18] * var20 - this.aShortArray8024[var18] * var19 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8028[var18] * var19 + this.aShortArray8024[var18] * var20 + 16383 >> 14);
											this.aShortArray8028[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8024[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8024[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					this.method4499();
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8048) {
					var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var56 = var18 + var15;
					this.anInt8080 = var51;
					this.anInt8061 = var54;
					this.anInt8055 = var56;
					this.aBoolean8048 = false;
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
				int var25 = var52[0] * -this.anInt8080 + var52[1] * -this.anInt8061 + var52[2] * -this.anInt8055 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8080 + var52[4] * -this.anInt8061 + var52[5] * -this.anInt8055 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8080 + var52[7] * -this.anInt8061 + var52[8] * -this.anInt8055 + 8192 >> 14;
				var28 = var25 + this.anInt8080;
				int var29 = var26 + this.anInt8061;
				var30 = var27 + this.anInt8055;
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
				var60 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var60[var36 * 3 + var37] = var38 + 8192 >> 14;
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
					if (var40 < this.anIntArrayArray8022.length) {
						int[] var41 = this.anIntArrayArray8022[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var43]) != 0) {
								int var44 = var60[0] * this.anIntArray8065[var43] + var60[1] * this.anIntArray8020[var43] + var60[2] * this.anIntArray8051[var43] + 8192 >> 14;
								int var45 = var60[3] * this.anIntArray8065[var43] + var60[4] * this.anIntArray8020[var43] + var60[5] * this.anIntArray8051[var43] + 8192 >> 14;
								int var46 = var60[6] * this.anIntArray8065[var43] + var60[7] * this.anIntArray8020[var43] + var60[8] * this.anIntArray8051[var43] + 8192 >> 14;
								int var61 = var44 + var36;
								int var62 = var45 + var37;
								int var63 = var46 + var38;
								this.anIntArray8065[var43] = var61;
								this.anIntArray8020[var43] = var62;
								this.anIntArray8051[var43] = var63;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			boolean var49;
			Class185 var50;
			Class177 var53;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var49 = false;
					for (var11 = 0; var11 < var9; var11++) {
						var12 = arg1[var11];
						if (var12 < this.anIntArrayArray8017.length) {
							var13 = this.anIntArrayArray8017[var12];
							for (var14 = 0; var14 < var13.length; var14++) {
								var15 = var13[var14];
								if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
									var16 = (this.aByteArray8037[var15] & 0xFF) + arg2 * 8;
									if (var16 < 0) {
										var16 = 0;
									} else if (var16 > 255) {
										var16 = 255;
									}
									this.aByteArray8037[var15] = (byte) var16;
								}
							}
							var49 |= var13.length > 0;
						}
					}
					if (var49) {
						if (this.aClass185Array8070 != null) {
							for (var11 = 0; var11 < this.anInt8069; var11++) {
								var50 = this.aClass185Array8070[var11];
								var53 = this.aClass177Array8071[var11];
								var53.anInt1750 = var53.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var50.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var55;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1751 += arg2;
									var55.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1752 = var55.anInt1752 * arg2 >> 7;
									var55.anInt1749 = var55.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8072.length) {
							var47 = this.anIntArrayArray8072[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var55 = this.aClass177Array8071[var47[var48]];
								var55.anInt1753 = var55.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var49 = false;
				for (var11 = 0; var11 < var9; var11++) {
					var12 = arg1[var11];
					if (var12 < this.anIntArrayArray8017.length) {
						var13 = this.anIntArrayArray8017[var12];
						for (var14 = 0; var14 < var13.length; var14++) {
							var15 = var13[var14];
							if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
								var16 = this.modelColors[var15] & 0xFFFF;
								var17 = var16 >> 10 & 0x3F;
								var18 = var16 >> 7 & 0x7;
								var19 = var16 & 0x7F;
								var17 = var17 + arg2 & 0x3F;
								var18 += arg3 / 4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 7) {
									var18 = 7;
								}
								var19 += arg4;
								if (var19 < 0) {
									var19 = 0;
								} else if (var19 > 127) {
									var19 = 127;
								}
								this.modelColors[var15] = (short) (var17 << 10 | var18 << 7 | var19);
							}
						}
						var49 |= var13.length > 0;
					}
				}
				if (var49) {
					if (this.aClass185Array8070 != null) {
						for (var11 = 0; var11 < this.anInt8069; var11++) {
							var50 = this.aClass185Array8070[var11];
							var53 = this.aClass177Array8071[var11];
							var53.anInt1750 = var53.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var50.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] -= this.anInt8080;
							this.anIntArray8020[var14] -= this.anInt8061;
							this.anIntArray8051[var14] -= this.anInt8055;
							this.anIntArray8065[var14] = this.anIntArray8065[var14] * arg2 >> 7;
							this.anIntArray8020[var14] = this.anIntArray8020[var14] * arg3 >> 7;
							this.anIntArray8051[var14] = this.anIntArray8051[var14] * arg4 >> 7;
							this.anIntArray8065[var14] += this.anInt8080;
							this.anIntArray8020[var14] += this.anInt8061;
							this.anIntArray8051[var14] += this.anInt8055;
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
			if (this.aBoolean8048) {
				var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8080 = var16;
				this.anInt8061 = var17;
				this.anInt8055 = var18;
				this.aBoolean8048 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8080 + 8192 >> 14;
			var20 = var17 * -this.anInt8061 + 8192 >> 14;
			var21 = var18 * -this.anInt8055 + 8192 >> 14;
			var22 = var19 + this.anInt8080;
			var23 = var20 + this.anInt8061;
			var24 = var21 + this.anInt8055;
			int[] var57 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var58 = new int[9];
			int var59;
			for (var30 = 0; var30 < 3; var30++) {
				for (var59 = 0; var59 < 3; var59++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var57[var59 + var33 * 3];
					}
					var58[var30 * 3 + var59] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var59 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var59 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8022.length) {
					var60 = this.anIntArrayArray8022[var34];
					for (var36 = 0; var36 < var60.length; var36++) {
						var37 = var60[var36];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var37]) != 0) {
							var38 = var58[0] * this.anIntArray8065[var37] + var58[1] * this.anIntArray8020[var37] + var58[2] * this.anIntArray8051[var37] + 8192 >> 14;
							var39 = var58[3] * this.anIntArray8065[var37] + var58[4] * this.anIntArray8020[var37] + var58[5] * this.anIntArray8051[var37] + 8192 >> 14;
							var40 = var58[6] * this.anIntArray8065[var37] + var58[7] * this.anIntArray8020[var37] + var58[8] * this.anIntArray8051[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var59;
							var40 += var32;
							this.anIntArray8065[var37] = var38;
							this.anIntArray8020[var37] = var39;
							this.anIntArray8051[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.dj(SS)V")
	public void dj(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8034 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, 1227065629);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, -676681102);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8042 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass185Array8070 != null) {
			for (int var13 = 0; var13 < this.anInt8069; var13++) {
				Class185 var9 = this.aClass185Array8070[var13];
				Class177 var10 = this.aClass177Array8071[var13];
				var10.anInt1750 = var10.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	public void method4474(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var11;
		int[] var12;
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
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var12 = this.anIntArrayArray8022[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8080 += this.anIntArray8065[var14];
						this.anInt8061 += this.anIntArray8020[var14];
						this.anInt8055 += this.anIntArray8051[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8080 = this.anInt8080 / var9 + var21;
				this.anInt8061 = this.anInt8061 / var9 + var22;
				this.anInt8055 = this.anInt8055 / var9 + var23;
			} else {
				this.anInt8080 = var21;
				this.anInt8061 = var22;
				this.anInt8055 = var23;
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
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] += var21;
						this.anIntArray8020[var13] += var22;
						this.anIntArray8051[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8022.length) {
						var24 = this.anIntArrayArray8022[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8082[var13];
							var15 = this.anIntArray8082[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8052[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8028[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8028[var17] = (short) (this.aShortArray8028[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8028[var17] * var19 - this.aShortArray8024[var17] * var18 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8028[var17] * var18 + this.aShortArray8024[var17] * var19 + 16383 >> 14);
									this.aShortArray8028[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8024[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8024[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
							}
						}
					}
				}
				this.method4499();
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] -= this.anInt8080;
						this.anIntArray8020[var13] -= this.anInt8061;
						this.anIntArray8051[var13] -= this.anInt8055;
						this.anIntArray8065[var13] = this.anIntArray8065[var13] * arg2 >> 7;
						this.anIntArray8020[var13] = this.anIntArray8020[var13] * arg3 >> 7;
						this.anIntArray8051[var13] = this.anIntArray8051[var13] * arg4 >> 7;
						this.anIntArray8065[var13] += this.anInt8080;
						this.anIntArray8020[var13] += this.anInt8061;
						this.anIntArray8051[var13] += this.anInt8055;
					}
				}
			}
		} else {
			boolean var26;
			Class185 var27;
			Class177 var28;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var26 = false;
					for (var10 = 0; var10 < var8; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8017.length) {
							var12 = this.anIntArrayArray8017[var11];
							for (var13 = 0; var13 < var12.length; var13++) {
								var14 = var12[var13];
								var15 = (this.aByteArray8037[var14] & 0xFF) + arg2 * 8;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 255) {
									var15 = 255;
								}
								this.aByteArray8037[var14] = (byte) var15;
							}
							var26 |= var12.length > 0;
						}
					}
					if (var26) {
						if (this.aClass185Array8070 != null) {
							for (var10 = 0; var10 < this.anInt8069; var10++) {
								var27 = this.aClass185Array8070[var10];
								var28 = this.aClass177Array8071[var10];
								var28.anInt1750 = var28.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var27.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var29;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1751 += arg2;
									var29.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1752 = var29.anInt1752 * arg2 >> 7;
									var29.anInt1749 = var29.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8072.length) {
							var24 = this.anIntArrayArray8072[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var29 = this.aClass177Array8071[var24[var25]];
								var29.anInt1753 = var29.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var26 = false;
				for (var10 = 0; var10 < var8; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8017.length) {
						var12 = this.anIntArrayArray8017[var11];
						for (var13 = 0; var13 < var12.length; var13++) {
							var14 = var12[var13];
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
						}
						var26 |= var12.length > 0;
					}
				}
				if (var26) {
					if (this.aClass185Array8070 != null) {
						for (var10 = 0; var10 < this.anInt8069; var10++) {
							var27 = this.aClass185Array8070[var10];
							var28 = this.aClass177Array8071[var10];
							var28.anInt1750 = var28.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var27.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		}
	}

	public void method4451(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var11;
		int[] var12;
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
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var12 = this.anIntArrayArray8022[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8080 += this.anIntArray8065[var14];
						this.anInt8061 += this.anIntArray8020[var14];
						this.anInt8055 += this.anIntArray8051[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8080 = this.anInt8080 / var9 + var21;
				this.anInt8061 = this.anInt8061 / var9 + var22;
				this.anInt8055 = this.anInt8055 / var9 + var23;
			} else {
				this.anInt8080 = var21;
				this.anInt8061 = var22;
				this.anInt8055 = var23;
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
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] += var21;
						this.anIntArray8020[var13] += var22;
						this.anIntArray8051[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8022.length) {
						var24 = this.anIntArrayArray8022[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8082[var13];
							var15 = this.anIntArray8082[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8052[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8028[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8028[var17] = (short) (this.aShortArray8028[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8028[var17] * var19 - this.aShortArray8024[var17] * var18 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8028[var17] * var18 + this.aShortArray8024[var17] * var19 + 16383 >> 14);
									this.aShortArray8028[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8024[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8024[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
							}
						}
					}
				}
				this.method4499();
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] -= this.anInt8080;
						this.anIntArray8020[var13] -= this.anInt8061;
						this.anIntArray8051[var13] -= this.anInt8055;
						this.anIntArray8065[var13] = this.anIntArray8065[var13] * arg2 >> 7;
						this.anIntArray8020[var13] = this.anIntArray8020[var13] * arg3 >> 7;
						this.anIntArray8051[var13] = this.anIntArray8051[var13] * arg4 >> 7;
						this.anIntArray8065[var13] += this.anInt8080;
						this.anIntArray8020[var13] += this.anInt8061;
						this.anIntArray8051[var13] += this.anInt8055;
					}
				}
			}
		} else {
			boolean var26;
			Class185 var27;
			Class177 var28;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var26 = false;
					for (var10 = 0; var10 < var8; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8017.length) {
							var12 = this.anIntArrayArray8017[var11];
							for (var13 = 0; var13 < var12.length; var13++) {
								var14 = var12[var13];
								var15 = (this.aByteArray8037[var14] & 0xFF) + arg2 * 8;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 255) {
									var15 = 255;
								}
								this.aByteArray8037[var14] = (byte) var15;
							}
							var26 |= var12.length > 0;
						}
					}
					if (var26) {
						if (this.aClass185Array8070 != null) {
							for (var10 = 0; var10 < this.anInt8069; var10++) {
								var27 = this.aClass185Array8070[var10];
								var28 = this.aClass177Array8071[var10];
								var28.anInt1750 = var28.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var27.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var29;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1751 += arg2;
									var29.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1752 = var29.anInt1752 * arg2 >> 7;
									var29.anInt1749 = var29.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8072.length) {
							var24 = this.anIntArrayArray8072[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var29 = this.aClass177Array8071[var24[var25]];
								var29.anInt1753 = var29.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var26 = false;
				for (var10 = 0; var10 < var8; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8017.length) {
						var12 = this.anIntArrayArray8017[var11];
						for (var13 = 0; var13 < var12.length; var13++) {
							var14 = var12[var13];
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
						}
						var26 |= var12.length > 0;
					}
				}
				if (var26) {
					if (this.aClass185Array8070 != null) {
						for (var10 = 0; var10 < this.anInt8069; var10++) {
							var27 = this.aClass185Array8070[var10];
							var28 = this.aClass177Array8071[var10];
							var28.anInt1750 = var28.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var27.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.ct()I")
	public int ct() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8058;
	}

	public void method4477(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8023 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub2_8012.aClass247_8513;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8044; var6++) {
			if ((arg1 & this.aShortArray8023[var6]) != 0) {
				var4.method2465((float) this.anIntArray8065[var6], (float) this.anIntArray8020[var6], (float) this.anIntArray8051[var6], var5);
				this.anIntArray8065[var6] = (int) var5[0];
				this.anIntArray8020[var6] = (int) var5[1];
				this.anIntArray8051[var6] = (int) var5[2];
			}
		}
	}

	public void method4478(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8023 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub2_8012.aClass247_8513;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8044; var6++) {
			if ((arg1 & this.aShortArray8023[var6]) != 0) {
				var4.method2465((float) this.anIntArray8065[var6], (float) this.anIntArray8020[var6], (float) this.anIntArray8051[var6], var5);
				this.anIntArray8065[var6] = (int) var5[0];
				this.anIntArray8020[var6] = (int) var5[1];
				this.anIntArray8051[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.en(I[IIIIZI[I)V")
	public void en(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int[] var13;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8022.length) {
					var13 = this.anIntArrayArray8022[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var15]) != 0) {
							this.anInt8080 += this.anIntArray8065[var15];
							this.anInt8061 += this.anIntArray8020[var15];
							this.anInt8055 += this.anIntArray8051[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8080 = this.anInt8080 / var10 + arg2;
				this.anInt8061 = this.anInt8061 / var10 + arg3;
				this.anInt8055 = this.anInt8055 / var10 + arg4;
				this.aBoolean8048 = true;
			} else {
				this.anInt8080 = arg2;
				this.anInt8061 = arg3;
				this.anInt8055 = arg4;
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
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] += arg2;
							this.anIntArray8020[var14] += arg3;
							this.anIntArray8051[var14] += arg4;
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
		int[] var60;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8022.length) {
						var47 = this.anIntArrayArray8022[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
								this.anIntArray8065[var14] -= this.anInt8080;
								this.anIntArray8020[var14] -= this.anInt8061;
								this.anIntArray8051[var14] -= this.anInt8055;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8020[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = this.anIntArray8020[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8020[var14] * var16 - this.anIntArray8051[var14] * var15 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8020[var14] * var15 + this.anIntArray8051[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8051[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8051[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								this.anIntArray8065[var14] += this.anInt8080;
								this.anIntArray8020[var14] += this.anInt8061;
								this.anIntArray8051[var14] += this.anInt8055;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8022.length) {
							var47 = this.anIntArrayArray8022[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
									var15 = this.anIntArray8082[var14];
									var16 = this.anIntArray8082[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8052[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8028[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8028[var18] = (short) (this.aShortArray8028[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8028[var18] * var20 - this.aShortArray8024[var18] * var19 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8028[var18] * var19 + this.aShortArray8024[var18] * var20 + 16383 >> 14);
											this.aShortArray8028[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8024[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8024[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					this.method4499();
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8048) {
					var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var56 = var18 + var15;
					this.anInt8080 = var51;
					this.anInt8061 = var54;
					this.anInt8055 = var56;
					this.aBoolean8048 = false;
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
				int var25 = var52[0] * -this.anInt8080 + var52[1] * -this.anInt8061 + var52[2] * -this.anInt8055 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8080 + var52[4] * -this.anInt8061 + var52[5] * -this.anInt8055 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8080 + var52[7] * -this.anInt8061 + var52[8] * -this.anInt8055 + 8192 >> 14;
				var28 = var25 + this.anInt8080;
				int var29 = var26 + this.anInt8061;
				var30 = var27 + this.anInt8055;
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
				var60 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var60[var36 * 3 + var37] = var38 + 8192 >> 14;
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
					if (var40 < this.anIntArrayArray8022.length) {
						int[] var41 = this.anIntArrayArray8022[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var43]) != 0) {
								int var44 = var60[0] * this.anIntArray8065[var43] + var60[1] * this.anIntArray8020[var43] + var60[2] * this.anIntArray8051[var43] + 8192 >> 14;
								int var45 = var60[3] * this.anIntArray8065[var43] + var60[4] * this.anIntArray8020[var43] + var60[5] * this.anIntArray8051[var43] + 8192 >> 14;
								int var46 = var60[6] * this.anIntArray8065[var43] + var60[7] * this.anIntArray8020[var43] + var60[8] * this.anIntArray8051[var43] + 8192 >> 14;
								int var61 = var44 + var36;
								int var62 = var45 + var37;
								int var63 = var46 + var38;
								this.anIntArray8065[var43] = var61;
								this.anIntArray8020[var43] = var62;
								this.anIntArray8051[var43] = var63;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			boolean var49;
			Class185 var50;
			Class177 var53;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var49 = false;
					for (var11 = 0; var11 < var9; var11++) {
						var12 = arg1[var11];
						if (var12 < this.anIntArrayArray8017.length) {
							var13 = this.anIntArrayArray8017[var12];
							for (var14 = 0; var14 < var13.length; var14++) {
								var15 = var13[var14];
								if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
									var16 = (this.aByteArray8037[var15] & 0xFF) + arg2 * 8;
									if (var16 < 0) {
										var16 = 0;
									} else if (var16 > 255) {
										var16 = 255;
									}
									this.aByteArray8037[var15] = (byte) var16;
								}
							}
							var49 |= var13.length > 0;
						}
					}
					if (var49) {
						if (this.aClass185Array8070 != null) {
							for (var11 = 0; var11 < this.anInt8069; var11++) {
								var50 = this.aClass185Array8070[var11];
								var53 = this.aClass177Array8071[var11];
								var53.anInt1750 = var53.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var50.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var55;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1751 += arg2;
									var55.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1752 = var55.anInt1752 * arg2 >> 7;
									var55.anInt1749 = var55.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8072.length) {
							var47 = this.anIntArrayArray8072[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var55 = this.aClass177Array8071[var47[var48]];
								var55.anInt1753 = var55.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var49 = false;
				for (var11 = 0; var11 < var9; var11++) {
					var12 = arg1[var11];
					if (var12 < this.anIntArrayArray8017.length) {
						var13 = this.anIntArrayArray8017[var12];
						for (var14 = 0; var14 < var13.length; var14++) {
							var15 = var13[var14];
							if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
								var16 = this.modelColors[var15] & 0xFFFF;
								var17 = var16 >> 10 & 0x3F;
								var18 = var16 >> 7 & 0x7;
								var19 = var16 & 0x7F;
								var17 = var17 + arg2 & 0x3F;
								var18 += arg3 / 4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 7) {
									var18 = 7;
								}
								var19 += arg4;
								if (var19 < 0) {
									var19 = 0;
								} else if (var19 > 127) {
									var19 = 127;
								}
								this.modelColors[var15] = (short) (var17 << 10 | var18 << 7 | var19);
							}
						}
						var49 |= var13.length > 0;
					}
				}
				if (var49) {
					if (this.aClass185Array8070 != null) {
						for (var11 = 0; var11 < this.anInt8069; var11++) {
							var50 = this.aClass185Array8070[var11];
							var53 = this.aClass177Array8071[var11];
							var53.anInt1750 = var53.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var50.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] -= this.anInt8080;
							this.anIntArray8020[var14] -= this.anInt8061;
							this.anIntArray8051[var14] -= this.anInt8055;
							this.anIntArray8065[var14] = this.anIntArray8065[var14] * arg2 >> 7;
							this.anIntArray8020[var14] = this.anIntArray8020[var14] * arg3 >> 7;
							this.anIntArray8051[var14] = this.anIntArray8051[var14] * arg4 >> 7;
							this.anIntArray8065[var14] += this.anInt8080;
							this.anIntArray8020[var14] += this.anInt8061;
							this.anIntArray8051[var14] += this.anInt8055;
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
			if (this.aBoolean8048) {
				var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8080 = var16;
				this.anInt8061 = var17;
				this.anInt8055 = var18;
				this.aBoolean8048 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8080 + 8192 >> 14;
			var20 = var17 * -this.anInt8061 + 8192 >> 14;
			var21 = var18 * -this.anInt8055 + 8192 >> 14;
			var22 = var19 + this.anInt8080;
			var23 = var20 + this.anInt8061;
			var24 = var21 + this.anInt8055;
			int[] var57 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var58 = new int[9];
			int var59;
			for (var30 = 0; var30 < 3; var30++) {
				for (var59 = 0; var59 < 3; var59++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var57[var59 + var33 * 3];
					}
					var58[var30 * 3 + var59] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var59 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var59 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8022.length) {
					var60 = this.anIntArrayArray8022[var34];
					for (var36 = 0; var36 < var60.length; var36++) {
						var37 = var60[var36];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var37]) != 0) {
							var38 = var58[0] * this.anIntArray8065[var37] + var58[1] * this.anIntArray8020[var37] + var58[2] * this.anIntArray8051[var37] + 8192 >> 14;
							var39 = var58[3] * this.anIntArray8065[var37] + var58[4] * this.anIntArray8020[var37] + var58[5] * this.anIntArray8051[var37] + 8192 >> 14;
							var40 = var58[6] * this.anIntArray8065[var37] + var58[7] * this.anIntArray8020[var37] + var58[8] * this.anIntArray8051[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var59;
							var40 += var32;
							this.anIntArray8065[var37] = var38;
							this.anIntArray8020[var37] = var39;
							this.anIntArray8051[var37] = var40;
						}
					}
				}
			}
		}
	}

	public void method4461(Class247 arg0, Class80 arg1, int arg2) {
		if (aClass172_8084 != null) {
			aClass172_8084.method2048();
		}
		if (arg1 != null) {
			arg1.aBoolean671 = false;
		}
		if (this.anInt8038 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub2_8012.aClass249_8488;
		Class249 var5 = this.aClass_ra_Sub2_8012.aClass249_8576;
		Class249 var6 = this.aClass_ra_Sub2_8012.aClass249_8479;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub2_8012.aClass249_8492);
		if (!this.aBoolean8043) {
			this.method4501();
		}
		float[] var7 = this.aClass_ra_Sub2_8012.aFloatArray8481;
		var5.method2511(0.0F, (float) this.anInt8056, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.anInt8057, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub2_8012.aFloatArrayArray8494[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8054;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8054;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.anInt8058 + this.anInt8059 >> 1;
			int var36 = this.anInt8060 + this.anInt8078 >> 1;
			int var19 = this.anInt8056;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.anInt8057;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var26 / var28);
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
						arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt669 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt668 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub2_8012.method4990(arg2);
		this.method4509(arg0);
		this.aClass_ra_Sub2_8012.method4990(0);
		var5.method2508(arg0);
		var5.method2483(this.aClass_ra_Sub2_8012.aClass249_8472);
		this.method4503(var5);
	}

	public void method4440(Class247 arg0, Class80 arg1, int arg2) {
		if (aClass172_8084 != null) {
			aClass172_8084.method2048();
		}
		if (arg1 != null) {
			arg1.aBoolean671 = false;
		}
		if (this.anInt8038 == 0) {
			return;
		}
		Class249 var4 = this.aClass_ra_Sub2_8012.aClass249_8488;
		Class249 var5 = this.aClass_ra_Sub2_8012.aClass249_8576;
		Class249 var6 = this.aClass_ra_Sub2_8012.aClass249_8479;
		var5.method2508(arg0);
		var6.method2510(var5);
		var6.method2483(this.aClass_ra_Sub2_8012.aClass249_8492);
		if (!this.aBoolean8043) {
			this.method4501();
		}
		float[] var7 = this.aClass_ra_Sub2_8012.aFloatArray8481;
		var5.method2511(0.0F, (float) this.anInt8056, 0.0F, var7);
		float var8 = var7[0];
		float var9 = var7[1];
		float var10 = var7[2];
		var5.method2511(0.0F, (float) this.anInt8057, 0.0F, var7);
		float var11 = var7[0];
		float var12 = var7[1];
		float var13 = var7[2];
		for (int var14 = 0; var14 < 6; var14++) {
			float[] var15 = this.aClass_ra_Sub2_8012.aFloatArrayArray8494[var14];
			float var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float) this.anInt8054;
			float var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float) this.anInt8054;
			if (var16 < 0.0F && var17 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			boolean var33 = false;
			boolean var34 = true;
			int var35 = this.anInt8058 + this.anInt8059 >> 1;
			int var36 = this.anInt8060 + this.anInt8078 >> 1;
			int var19 = this.anInt8056;
			float var21 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var22 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var23 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var24 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var23 >= -var24) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var21 / var24);
				arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var22 / var24);
			} else {
				var33 = true;
			}
			var19 = this.anInt8057;
			float var25 = var6.aFloatArray2631[0] * (float) var35 + var6.aFloatArray2631[4] * (float) var19 + var6.aFloatArray2631[8] * (float) var36 + var6.aFloatArray2631[12];
			float var26 = var6.aFloatArray2631[1] * (float) var35 + var6.aFloatArray2631[5] * (float) var19 + var6.aFloatArray2631[9] * (float) var36 + var6.aFloatArray2631[13];
			float var27 = var6.aFloatArray2631[2] * (float) var35 + var6.aFloatArray2631[6] * (float) var19 + var6.aFloatArray2631[10] * (float) var36 + var6.aFloatArray2631[14];
			float var28 = var6.aFloatArray2631[3] * (float) var35 + var6.aFloatArray2631[7] * (float) var19 + var6.aFloatArray2631[11] * (float) var36 + var6.aFloatArray2631[15];
			if (var27 >= -var28) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var25 / var28);
				arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var26 / var28);
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
						arg1.anInt669 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt670 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					} else if (var27 < -var28) {
						var29 = (var27 + var28) / (var23 + var24) - 1.0F;
						var30 = var25 + var29 * (var21 - var25);
						var31 = var26 + var29 * (var22 - var26);
						var32 = var28 + var29 * (var24 - var28);
						arg1.anInt668 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 + this.aClass_ra_Sub2_8012.aFloat8505 * var30 / var32);
						arg1.anInt672 = (int) (this.aClass_ra_Sub2_8012.aFloat8497 + this.aClass_ra_Sub2_8012.aFloat8498 * var31 / var32);
					}
				}
			}
			if (var34) {
				if (var23 / var24 > var27 / var28) {
					var29 = var21 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var24 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt669 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				} else {
					var29 = var25 + var4.aFloatArray2631[0] * (float) this.anInt8054 + var4.aFloatArray2631[12];
					var30 = var28 + var4.aFloatArray2631[3] * (float) this.anInt8054 + var4.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub2_8012.aFloat8495 - (float) arg1.anInt668 + this.aClass_ra_Sub2_8012.aFloat8505 * var29 / var30);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.aClass_ra_Sub2_8012.method4990(arg2);
		this.method4509(arg0);
		this.aClass_ra_Sub2_8012.method4990(0);
		var5.method2508(arg0);
		var5.method2483(this.aClass_ra_Sub2_8012.aClass249_8472);
		this.method4503(var5);
	}

	public boolean method4469(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		return this.method4502(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	public void method4481(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8023 == null) {
			return;
		}
		Class247 var4 = arg0;
		if (arg2) {
			var4 = this.aClass_ra_Sub2_8012.aClass247_8513;
			var4.method2458(arg0);
		}
		float[] var5 = new float[3];
		for (int var6 = 0; var6 < this.anInt8044; var6++) {
			if ((arg1 & this.aShortArray8023[var6]) != 0) {
				var4.method2465((float) this.anIntArray8065[var6], (float) this.anIntArray8020[var6], (float) this.anIntArray8051[var6], var5);
				this.anIntArray8065[var6] = (int) var5[0];
				this.anIntArray8020[var6] = (int) var5[1];
				this.anIntArray8051[var6] = (int) var5[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.ce(LClass_na;)LClass_na;")
	public Class_na ce(Class_na arg0) {
		if (this.anInt8038 == 0) {
			return null;
		}
		if (!this.aBoolean8043) {
			this.method4501();
		}
		int var2;
		int var3;
		if (this.aClass_ra_Sub2_8012.anInt8541 > 0) {
			var2 = this.anInt8058 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
			var3 = this.anInt8059 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
		} else {
			var2 = this.anInt8058 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
			var3 = this.anInt8059 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
		}
		int var4;
		int var5;
		if (this.aClass_ra_Sub2_8012.anInt8599 > 0) {
			var4 = this.anInt8060 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
			var5 = this.anInt8078 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
		} else {
			var4 = this.anInt8060 - (this.anInt8056 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
			var5 = this.anInt8078 - (this.anInt8057 * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536 * -1431655765 * 3;
		}
		int var6 = var3 - var2 + 1;
		int var7 = var5 - var4 + 1;
		Class_na_Sub1 var8 = (Class_na_Sub1) arg0;
		Class_na_Sub1 var9;
		if (var8 != null && var8.method3528(var6, var7)) {
			var9 = var8;
			var8.method3525();
		} else {
			var9 = new Class_na_Sub1(this.aClass_ra_Sub2_8012, var6, var7);
		}
		var9.method3524(var2, var4, var3, var5);
		this.method4508(var9);
		return var9;
	}

	@ObfuscatedName("Class387_Sub1.cz()I")
	public int cz() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8054;
	}

	@ObfuscatedName("Class387_Sub1.cj()I")
	public int cj() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8027;
	}

	@ObfuscatedName("Class387_Sub1.cy()I")
	public int cy() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8027;
	}

	@ObfuscatedName("Class387_Sub1.cb()I")
	public int cb() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8027;
	}

	@ObfuscatedName("Class387_Sub1.bk(I)V")
	public void bk(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8020[var4] = this.anIntArray8020[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.cd()I")
	public int cd() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8059;
	}

	@ObfuscatedName("Class387_Sub1.co()I")
	public int co() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8056;
	}

	@ObfuscatedName("Class387_Sub1.br(I)V")
	public void br(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8020[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8020[var4] = this.anIntArray8020[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.cq()I")
	public int cq() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8057;
	}

	@ObfuscatedName("Class387_Sub1.ci()I")
	public int ci() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8057;
	}

	public void method4507() {
		if (this.aClass173_8046 != null) {
			this.aClass173_8046.aBoolean1732 = false;
		}
	}

	@ObfuscatedName("Class387_Sub1.cr()I")
	public int cr() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8078;
	}

	@ObfuscatedName("Class387_Sub1.cv(I)V")
	public void cv(int arg0) {
		this.aShort8015 = (short) arg0;
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.ka()V")
	public void ka() {
		for (int var1 = 0; var1 < this.anInt8014; var1++) {
			this.anIntArray8065[var1] = this.anIntArray8065[var1] + 7 >> 4;
			this.anIntArray8020[var1] = this.anIntArray8020[var1] + 7 >> 4;
			this.anIntArray8051[var1] = this.anIntArray8051[var1] + 7 >> 4;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.cp(I)V")
	public void cp(int arg0) {
		this.aShort8015 = (short) arg0;
		this.method4507();
	}

	public void method4508(Class_na_Sub1 arg0) {
		if (this.anIntArray8010.length < this.anInt8038) {
			this.anIntArray8010 = new int[this.anInt8038];
			this.anIntArray8076 = new int[this.anInt8038];
		}
		int var2;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < this.anInt8044; var2++) {
			int var3 = (this.anIntArray8065[var2] - (this.anIntArray8020[var2] * this.aClass_ra_Sub2_8012.anInt8541 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536) - arg0.anInt10158;
			int var4 = (this.anIntArray8051[var2] - (this.anIntArray8020[var2] * this.aClass_ra_Sub2_8012.anInt8599 >> 8) >> this.aClass_ra_Sub2_8012.anInt8536) - arg0.anInt10156;
			int var5 = this.anIntArray8082[var2];
			var6 = this.anIntArray8082[var2 + 1];
			for (var7 = var5; var7 < var6; var7++) {
				var8 = this.aShortArray8052[var7] - 1;
				if (var8 == -1) {
					break;
				}
				this.anIntArray8010[var8] = var3;
				this.anIntArray8076[var8] = var4;
			}
		}
		for (var2 = 0; var2 < this.anInt8035; var2++) {
			if (this.aByteArray8037 == null || this.aByteArray8037[var2] <= 128) {
				short var12 = this.aShortArray8016[var2];
				short var13 = this.aShortArray8039[var2];
				short var14 = this.aShortArray8040[var2];
				var6 = this.anIntArray8010[var12];
				var7 = this.anIntArray8010[var13];
				var8 = this.anIntArray8010[var14];
				int var9 = this.anIntArray8076[var12];
				int var10 = this.anIntArray8076[var13];
				int var11 = this.anIntArray8076[var14];
				if ((var6 - var7) * (var10 - var11) - (var10 - var9) * (var8 - var7) > 0) {
					arg0.method3527(var9, var10, var11, var6, var7, var8);
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.cu(I)V")
	public void cu(int arg0) {
		this.aShort8083 = (short) arg0;
		this.method4498();
		this.method4499();
	}

	public Class64[] method4484() {
		return this.aClass64Array8068;
	}

	@ObfuscatedName("Class387_Sub1.cf(I)V")
	public void cf(int arg0) {
		this.aShort8083 = (short) arg0;
		this.method4498();
		this.method4499();
	}

	@ObfuscatedName("Class387_Sub1.cx()I")
	public int cx() {
		return this.aShort8015;
	}

	@ObfuscatedName("Class387_Sub1.cc()I")
	public int cc() {
		return this.aShort8015;
	}

	@ObfuscatedName("Class387_Sub1.db()I")
	public int db() {
		return this.aShort8083;
	}

	@ObfuscatedName("Class387_Sub1.ds()I")
	public int ds() {
		return this.aShort8083;
	}

	public void method4509(Class247 arg0) {
		if (this.anInt8035 == 0 || !this.method4512() || !this.method4504()) {
			return;
		}
		if (aClass172_8084 == null) {
		}
		this.aClass_ra_Sub2_8012.method5013();
		Class140 var2 = this.aClass_ra_Sub2_8012.aClass140_8474;
		this.aClass_ra_Sub2_8012.method5081(0, this.aClass173_8045.anInterface9_Impl1_1733);
		this.aClass_ra_Sub2_8012.method5081(1, this.aClass173_8046.anInterface9_Impl1_1733);
		this.aClass_ra_Sub2_8012.method5081(2, this.aClass173_8021.anInterface9_Impl1_1733);
		this.aClass_ra_Sub2_8012.method4979(this.aClass165_8050.anInterface9_Impl2_1698);
		this.aClass_ra_Sub2_8012.aClass249_8576.method2508(arg0);
		var2.method1618(this.aClass_ra_Sub2_8012.aClass249_8576);
		var2.aClass249_1546.method2516();
		if (this.aClass_ra_Sub2_8012.aBoolean8571) {
			Class77 var3 = this.aClass_ra_Sub2_8012.method4969();
			var2.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, (float) -this.aClass_ra_Sub2_8012.anInt8573);
			var2.aClass261_1551.method2583(3.0F / (float) var3.anInt650);
			var2.aClass260_1547.method2553((float) (var3.anInt652 >> 16 & 0xFF) / 255.0F, (float) (var3.anInt652 >> 8 & 0xFF) / 255.0F, (float) (var3.anInt652 >> 0 & 0xFF) / 255.0F);
		} else {
			var2.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
			var2.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass_ra_Sub2_8012.anInt8578 > 0) {
			var2.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -this.aClass_ra_Sub2_8012.aFloat8580);
			var2.aClass260_1549.method2553((float) (this.aClass_ra_Sub2_8012.anInt8476 >> 16 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8012.anInt8476 >> 8 & 0xFF) / 255.0F, (float) (this.aClass_ra_Sub2_8012.anInt8476 >> 0 & 0xFF) / 255.0F);
			this.aClass_ra_Sub2_8012.aClass249_8576.method2508(arg0);
			this.aClass_ra_Sub2_8012.aClass249_8576.method2501();
			var2.aClass261_1551.method2589(this.aClass_ra_Sub2_8012.aClass249_8576);
			this.aClass_ra_Sub2_8012.aClass249_8576.method2508(arg0);
			this.aClass_ra_Sub2_8012.aClass249_8576.method2483(this.aClass_ra_Sub2_8012.aClass249_8472);
			this.aClass_ra_Sub2_8012.aClass249_8576.method2501();
			var2.aClass261_1548.method2589(this.aClass_ra_Sub2_8012.aClass249_8576);
			var2.aClass261_1548.method2583(1.0F / (this.aClass_ra_Sub2_8012.aFloat8581 - this.aClass_ra_Sub2_8012.aFloat8580));
		} else {
			var2.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
			var2.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
		}
		int var4;
		int var6;
		int var14;
		if ((this.anInt8081 & 0x37) == 0) {
			this.aClass_ra_Sub2_8012.method4978(this.aClass_ra_Sub2_8012.aClass184_8604);
			if (this.aClass_ra_Sub2_8012.aBoolean8601) {
				this.aClass_ra_Sub2_8012.method4995(false);
			}
			for (int var13 = 0; var13 < this.anIntArray8063.length; var13++) {
				var4 = this.anIntArray8062[var13];
				var14 = this.anIntArray8062[var13 + 1];
				var6 = this.modelTextures[var4] & 0xFFFF;
				boolean var16 = false;
				if (var6 == 65535) {
					var2.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8012.anInterface11_Impl3_8551;
					float[] var18 = var2.aClass249_1546.aFloatArray2631;
					var2.aClass249_1546.aFloatArray2631[13] = 0.0F;
					var18[12] = 0.0F;
				} else {
					var2.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8012.aClass188_8552.method2093(var6);
					Class56 var17 = this.aClass_ra_Sub2_8012.anInterface_ma4227.method221(var6, -679695367);
					var16 = !Class376.method4368(var17.aByte525, -1500938962);
					var2.aClass249_1546.aFloatArray2631[12] = (float) (this.aClass_ra_Sub2_8012.anInt8588 % 128000) / 1000.0F * (float) var17.aByte531 / 64.0F % 1.0F;
					var2.aClass249_1546.aFloatArray2631[13] = (float) (this.aClass_ra_Sub2_8012.anInt8588 % 128000) / 1000.0F * (float) var17.aByte530 / 64.0F % 1.0F;
				}
				var2.anInt1555 = this.anIntArray8063[var13];
				var2.anInt1556 = this.anIntArray8064[var13];
				var2.anInt1557 = var4 * 3;
				var2.anInt1552 = var14 - var4;
				var2.method1619(var16);
			}
		} else {
			this.aClass_ra_Sub2_8012.method5081(3, this.aClass173_8047.anInterface9_Impl1_1733);
			this.aClass_ra_Sub2_8012.method4978(this.aClass_ra_Sub2_8012.aClass184_8605);
			Class247 var12 = this.aClass_ra_Sub2_8012.aClass247_8513;
			var12.method2454(arg0);
			var12.method2459();
			var4 = 0;
			int var8;
			if (this.aClass_ra_Sub2_8012.aBoolean8601) {
				this.aClass_ra_Sub2_8012.method4995(true);
			} else {
				var2.aClass260_1542.method2553(this.aClass_ra_Sub2_8012.aFloatArray8525[0], this.aClass_ra_Sub2_8012.aFloatArray8525[1], this.aClass_ra_Sub2_8012.aFloatArray8525[2]);
				var2.aClass260_1542.method2575(var12);
				var2.aClass260_1544.method2553(this.aClass_ra_Sub2_8012.aFloat8489 * this.aClass_ra_Sub2_8012.aFloat8530, this.aClass_ra_Sub2_8012.aFloat8489 * this.aClass_ra_Sub2_8012.aFloat8500, this.aClass_ra_Sub2_8012.aFloat8489 * this.aClass_ra_Sub2_8012.aFloat8532);
				var2.aClass260_1543.method2553(-this.aClass_ra_Sub2_8012.aFloat8535 * this.aClass_ra_Sub2_8012.aFloat8530, -this.aClass_ra_Sub2_8012.aFloat8535 * this.aClass_ra_Sub2_8012.aFloat8500, -this.aClass_ra_Sub2_8012.aFloat8535 * this.aClass_ra_Sub2_8012.aFloat8532);
				var2.aClass260_1553.method2553(this.aClass_ra_Sub2_8012.aFloat8533 * this.aClass_ra_Sub2_8012.aFloat8530, this.aClass_ra_Sub2_8012.aFloat8533 * this.aClass_ra_Sub2_8012.aFloat8500, this.aClass_ra_Sub2_8012.aFloat8533 * this.aClass_ra_Sub2_8012.aFloat8532);
				if (this.aClass_ra_Sub2_8012.anInt8537 > 0) {
					var4 = this.aClass_ra_Sub2_8012.anInt8537;
					Class260 var5 = this.aClass_ra_Sub2_8012.aClass260_8544;
					for (var6 = 0; var6 < var4; var6++) {
						Class330_Sub14 var7 = this.aClass_ra_Sub2_8012.aClass330_Sub14Array8607[var6];
						var8 = var7.method3313(-1528495372);
						var5.method2582(var7.aClass260_7608);
						var5.method2573(var12);
						var2.aFloatArray1539[var6 * 4] = var5.aFloat2716;
						var2.aFloatArray1539[var6 * 4 + 1] = var5.aFloat2715;
						var2.aFloatArray1539[var6 * 4 + 2] = var5.aFloat2711;
						var2.aFloatArray1539[var6 * 4 + 3] = var7.method3316((byte) -11) * var7.method3316((byte) -10);
						float var9 = var7.method3317(1109174114) / 255.0F;
						var2.aFloatArray1538[var6 * 4] = (float) (var8 >> 16 & 0xFF) * var9;
						var2.aFloatArray1538[var6 * 4 + 1] = (float) (var8 >> 8 & 0xFF) * var9;
						var2.aFloatArray1538[var6 * 4 + 2] = (float) (var8 & 0xFF) * var9;
						var2.aFloatArray1538[var6 * 4 + 3] = 1.0F;
					}
				}
			}
			for (var14 = 0; var14 < this.anIntArray8063.length; var14++) {
				var6 = this.anIntArray8062[var14];
				int var15 = this.anIntArray8062[var14 + 1];
				var8 = this.modelTextures[var6] & 0xFFFF;
				byte var19 = 11;
				if (var8 == 65535) {
					var2.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8012.anInterface11_Impl3_8551;
					float[] var20 = var2.aClass249_1546.aFloatArray2631;
					var2.aClass249_1546.aFloatArray2631[13] = 0.0F;
					var20[12] = 0.0F;
				} else {
					var2.anInterface11_Impl3_1540 = this.aClass_ra_Sub2_8012.aClass188_8552.method2093(var8);
					Class56 var10 = this.aClass_ra_Sub2_8012.anInterface_ma4227.method221(var8, 1186661787);
					var19 = var10.aByte525;
					var2.method1617(var10);
					var2.aClass249_1546.aFloatArray2631[12] = (float) (this.aClass_ra_Sub2_8012.anInt8588 % 128000) / 1000.0F * (float) var10.aByte531 / 64.0F % 1.0F;
					var2.aClass249_1546.aFloatArray2631[13] = (float) (this.aClass_ra_Sub2_8012.anInt8588 % 128000) / 1000.0F * (float) var10.aByte530 / 64.0F % 1.0F;
				}
				var2.anInt1555 = this.anIntArray8063[var14];
				var2.anInt1556 = this.anIntArray8064[var14];
				var2.anInt1557 = var6 * 3;
				var2.anInt1552 = var15 - var6;
				switch(var19) {
					case 1:
						var2.aClass260_1536.method2553(this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[14]);
						var2.aClass260_1536.method2573(var12);
						var2.method1621(var4);
						break;
					case 2:
					case 3:
					case 4:
					default:
						var2.method1620(var4);
						break;
					case 5:
						if (this.aClass_ra_Sub2_8012.aBoolean8601) {
							var2.method1620(var4);
						} else {
							Class164_Sub1_Sub1 var21 = this.aClass_ra_Sub2_8012.aClass164_Sub1_Sub1_8565;
							Class56 var11 = this.aClass_ra_Sub2_8012.anInterface_ma4227.method221(var8, -985508744);
							var21.method1952(var11.aByte526, var11.anInt527, 203281509);
							var21.aClass249_9446.method2508(arg0);
							var21.aClass249_9437.method2508(arg0);
							var21.aClass249_9437.method2483(this.aClass_ra_Sub2_8012.aClass249_8493);
							var21.anInt9445 = this.anIntArray8063[var14];
							var21.anInt9431 = this.anIntArray8064[var14];
							var21.anInt9447 = var6;
							var21.anInt9448 = var15 - var6;
							var21.method1953(16711935);
						}
						break;
					case 6:
						var2.method1619(!Class376.method4368(var19, -1929117257));
						break;
					case 7:
						var2.aClass260_1536.method2553(this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[12], this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[13], this.aClass_ra_Sub2_8012.aClass249_8473.aFloatArray2631[14]);
						var2.aClass260_1536.method2573(var12);
						var2.aClass249_1554.method2508(arg0);
						var2.anInterface11_Impl1_1550 = this.aClass_ra_Sub2_8012.method5012();
						var2.method1622(var4);
				}
			}
		}
		this.method4510();
	}

	public void method4473(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var11;
		int[] var12;
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
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var12 = this.anIntArrayArray8022[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8080 += this.anIntArray8065[var14];
						this.anInt8061 += this.anIntArray8020[var14];
						this.anInt8055 += this.anIntArray8051[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8080 = this.anInt8080 / var9 + var21;
				this.anInt8061 = this.anInt8061 / var9 + var22;
				this.anInt8055 = this.anInt8055 / var9 + var23;
			} else {
				this.anInt8080 = var21;
				this.anInt8061 = var22;
				this.anInt8055 = var23;
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
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] += var21;
						this.anIntArray8020[var13] += var22;
						this.anIntArray8051[var13] += var23;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		int var17;
		int var18;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					if ((arg5 & 0x1) == 0) {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					} else {
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							this.anIntArray8065[var13] -= this.anInt8080;
							this.anIntArray8020[var13] -= this.anInt8061;
							this.anIntArray8051[var13] -= this.anInt8055;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8020[var13] * var15 - this.anIntArray8051[var13] * var14 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8020[var13] * var14 + this.anIntArray8051[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8020[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8020[var13] = this.anIntArray8020[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8051[var13] * var14 + this.anIntArray8065[var13] * var15 + 16383 >> 14;
								this.anIntArray8051[var13] = this.anIntArray8051[var13] * var15 - this.anIntArray8065[var13] * var14 + 16383 >> 14;
								this.anIntArray8065[var13] = var16;
							}
							this.anIntArray8065[var13] += this.anInt8080;
							this.anIntArray8020[var13] += this.anInt8061;
							this.anIntArray8051[var13] += this.anInt8055;
						}
					}
				}
			}
			if (arg6) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8022.length) {
						var24 = this.anIntArrayArray8022[var10];
						for (var25 = 0; var25 < var24.length; var25++) {
							var13 = var24[var25];
							var14 = this.anIntArray8082[var13];
							var15 = this.anIntArray8082[var13 + 1];
							for (var16 = var14; var16 < var15; var16++) {
								var17 = this.aShortArray8052[var16] - 1;
								if (var17 == -1) {
									break;
								}
								int var19;
								int var20;
								if (arg4 != 0) {
									var18 = Class257.anIntArray2683[arg4];
									var19 = Class257.anIntArray2684[arg4];
									var20 = this.aShortArray8028[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8028[var17] = (short) (this.aShortArray8028[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
								if (arg2 != 0) {
									var18 = Class257.anIntArray2683[arg2];
									var19 = Class257.anIntArray2684[arg2];
									var20 = this.aShortArray8028[var17] * var19 - this.aShortArray8024[var17] * var18 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8028[var17] * var18 + this.aShortArray8024[var17] * var19 + 16383 >> 14);
									this.aShortArray8028[var17] = (short) var20;
								}
								if (arg3 != 0) {
									var18 = Class257.anIntArray2683[arg3];
									var19 = Class257.anIntArray2684[arg3];
									var20 = this.aShortArray8024[var17] * var18 + this.aShortArray8032[var17] * var19 + 16383 >> 14;
									this.aShortArray8024[var17] = (short) (this.aShortArray8024[var17] * var19 - this.aShortArray8032[var17] * var18 + 16383 >> 14);
									this.aShortArray8032[var17] = (short) var20;
								}
							}
						}
					}
				}
				this.method4499();
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8022.length) {
					var24 = this.anIntArrayArray8022[var10];
					for (var25 = 0; var25 < var24.length; var25++) {
						var13 = var24[var25];
						this.anIntArray8065[var13] -= this.anInt8080;
						this.anIntArray8020[var13] -= this.anInt8061;
						this.anIntArray8051[var13] -= this.anInt8055;
						this.anIntArray8065[var13] = this.anIntArray8065[var13] * arg2 >> 7;
						this.anIntArray8020[var13] = this.anIntArray8020[var13] * arg3 >> 7;
						this.anIntArray8051[var13] = this.anIntArray8051[var13] * arg4 >> 7;
						this.anIntArray8065[var13] += this.anInt8080;
						this.anIntArray8020[var13] += this.anInt8061;
						this.anIntArray8051[var13] += this.anInt8055;
					}
				}
			}
		} else {
			boolean var26;
			Class185 var27;
			Class177 var28;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var26 = false;
					for (var10 = 0; var10 < var8; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8017.length) {
							var12 = this.anIntArrayArray8017[var11];
							for (var13 = 0; var13 < var12.length; var13++) {
								var14 = var12[var13];
								var15 = (this.aByteArray8037[var14] & 0xFF) + arg2 * 8;
								if (var15 < 0) {
									var15 = 0;
								} else if (var15 > 255) {
									var15 = 255;
								}
								this.aByteArray8037[var14] = (byte) var15;
							}
							var26 |= var12.length > 0;
						}
					}
					if (var26) {
						if (this.aClass185Array8070 != null) {
							for (var10 = 0; var10 < this.anInt8069; var10++) {
								var27 = this.aClass185Array8070[var10];
								var28 = this.aClass177Array8071[var10];
								var28.anInt1750 = var28.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var27.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var29;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1751 += arg2;
									var29.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8072.length) {
								var24 = this.anIntArrayArray8072[var10];
								for (var25 = 0; var25 < var24.length; var25++) {
									var29 = this.aClass177Array8071[var24[var25]];
									var29.anInt1752 = var29.anInt1752 * arg2 >> 7;
									var29.anInt1749 = var29.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8072.length) {
							var24 = this.anIntArrayArray8072[var10];
							for (var25 = 0; var25 < var24.length; var25++) {
								var29 = this.aClass177Array8071[var24[var25]];
								var29.anInt1753 = var29.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var26 = false;
				for (var10 = 0; var10 < var8; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8017.length) {
						var12 = this.anIntArrayArray8017[var11];
						for (var13 = 0; var13 < var12.length; var13++) {
							var14 = var12[var13];
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
						}
						var26 |= var12.length > 0;
					}
				}
				if (var26) {
					if (this.aClass185Array8070 != null) {
						for (var10 = 0; var10 < this.anInt8069; var10++) {
							var27 = this.aClass185Array8070[var10];
							var28 = this.aClass177Array8071[var10];
							var28.anInt1750 = var28.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var27.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		}
	}

	public void method4510() {
		if (!this.aBoolean8066) {
			return;
		}
		this.aBoolean8066 = false;
		if (this.aClass93Array8026 == null && this.aClass64Array8068 == null && this.aClass185Array8070 == null && !Class160.method1881(this.anInt8013, this.anInt8081)) {
			boolean var1 = false;
			boolean var2 = false;
			boolean var3 = false;
			if (this.anIntArray8065 != null && !Class160.method1896(this.anInt8013, this.anInt8081)) {
				if (this.aClass173_8045 == null || this.aClass173_8045.method2050()) {
					if (!this.aBoolean8043) {
						this.method4501();
					}
					var1 = true;
				} else {
					this.aBoolean8066 = true;
				}
			}
			if (this.anIntArray8020 != null && !Class160.method1897(this.anInt8013, this.anInt8081)) {
				if (this.aClass173_8045 == null || this.aClass173_8045.method2050()) {
					if (!this.aBoolean8043) {
						this.method4501();
					}
					var2 = true;
				} else {
					this.aBoolean8066 = true;
				}
			}
			if (this.anIntArray8051 != null && !Class160.method1909(this.anInt8013, this.anInt8081)) {
				if (this.aClass173_8045 == null || this.aClass173_8045.method2050()) {
					if (!this.aBoolean8043) {
						this.method4501();
					}
					var3 = true;
				} else {
					this.aBoolean8066 = true;
				}
			}
			if (var1) {
				this.anIntArray8065 = null;
			}
			if (var2) {
				this.anIntArray8020 = null;
			}
			if (var3) {
				this.anIntArray8051 = null;
			}
		}
		if (this.aShortArray8052 != null && this.anIntArray8065 == null && this.anIntArray8020 == null && this.anIntArray8051 == null) {
			this.aShortArray8052 = null;
			this.anIntArray8082 = null;
		}
		if (this.aByteArray8030 != null && !Class160.method1885(this.anInt8013, this.anInt8081)) {
			label275: {
				label218: {
					if ((this.anInt8081 & 0x37) == 0) {
						if (this.aClass173_8046 == null || this.aClass173_8046.method2050()) {
							break label218;
						}
					} else if (this.aClass173_8047 == null || this.aClass173_8047.method2050()) {
						break label218;
					}
					this.aBoolean8066 = true;
					break label275;
				}
				this.aShortArray8024 = null;
				this.aShortArray8028 = null;
				this.aShortArray8032 = null;
				this.aByteArray8030 = null;
			}
		}
		if (this.modelColors != null && !Class160.method1911(this.anInt8013, this.anInt8081)) {
			if (this.aClass173_8046 == null || this.aClass173_8046.method2050()) {
				this.modelColors = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.aByteArray8037 != null && !Class160.method1900(this.anInt8013, this.anInt8081)) {
			if (this.aClass173_8046 == null || this.aClass173_8046.method2050()) {
				this.aByteArray8037 = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.aFloatArray8031 != null && !Class160.method1901(this.anInt8013, this.anInt8081)) {
			if (this.aClass173_8021 == null || this.aClass173_8021.method2050()) {
				this.aFloatArray8053 = null;
				this.aFloatArray8031 = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.modelTextures != null && !Class160.method1905(this.anInt8013, this.anInt8081)) {
			if (this.aClass173_8046 == null || this.aClass173_8046.method2050()) {
				this.modelTextures = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.aShortArray8016 != null && !Class160.method1907(this.anInt8013, this.anInt8081)) {
			if ((this.aClass165_8050 == null || this.aClass165_8050.method1963()) && (this.aClass173_8046 == null || this.aClass173_8046.method2050())) {
				this.aShortArray8040 = null;
				this.aShortArray8039 = null;
				this.aShortArray8016 = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.aShortArray8025 != null) {
			if (this.aClass173_8045 == null || this.aClass173_8045.method2050()) {
				this.aShortArray8025 = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.aShortArray8075 != null) {
			if (this.aClass173_8046 == null || this.aClass173_8046.method2050()) {
				this.aShortArray8075 = null;
			} else {
				this.aBoolean8066 = true;
			}
		}
		if (this.anIntArrayArray8017 != null && !Class160.method1902(this.anInt8013, this.anInt8081)) {
			this.anIntArrayArray8017 = null;
			this.aShortArray8018 = null;
		}
		if (this.anIntArrayArray8022 != null && !Class160.method1903(this.anInt8013, this.anInt8081)) {
			this.anIntArrayArray8022 = null;
			this.aShortArray8023 = null;
		}
		if (this.anIntArrayArray8072 != null && !Class160.method1904(this.anInt8013, this.anInt8081)) {
			this.anIntArrayArray8072 = null;
		}
		if (this.anIntArray8062 != null && (this.anInt8013 & 0x800) == 0 && (this.anInt8013 & 0x40000) == 0) {
			this.anIntArray8062 = null;
			this.anIntArray8064 = null;
			this.anIntArray8063 = null;
		}
	}

	public void method_do(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	public Class93[] method4476() {
		return this.aClass93Array8026;
	}

	@ObfuscatedName("Class387_Sub1.cn()I")
	public int cn() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8059;
	}

	@ObfuscatedName("Class387_Sub1.dt(SS)V")
	public void dt(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.dq(SS)V")
	public void dq(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	public void method4482(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				this.aByteArray8037[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8037[var3] = (byte) var4;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.YA()I")
	public int YA() {
		if (!this.aBoolean8043) {
			this.method4501();
		}
		return this.anInt8056;
	}

	@ObfuscatedName("Class387_Sub1.u()Z")
	public boolean u() {
		return this.aBoolean8042;
	}

	public void color(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass185Array8070 != null) {
			for (var3 = 0; var3 < this.anInt8069; var3++) {
				Class185 var4 = this.aClass185Array8070[var3];
				Class177 var5 = this.aClass177Array8071[var3];
				var5.anInt1750 = var5.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var4.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.du(IIII)V")
	public void du(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
		if (this.aClass185Array8070 != null) {
			for (var5 = 0; var5 < this.anInt8069; var5++) {
				Class185 var10 = this.aClass185Array8070[var5];
				Class177 var11 = this.aClass177Array8071[var5];
				var11.anInt1750 = var11.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.df(IIII)V")
	public void df(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
		if (this.aClass185Array8070 != null) {
			for (var5 = 0; var5 < this.anInt8069; var5++) {
				Class185 var10 = this.aClass185Array8070[var5];
				Class177 var11 = this.aClass177Array8071[var5];
				var11.anInt1750 = var11.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var10.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	public Class64[] method4485() {
		return this.aClass64Array8068;
	}

	public Class93[] method4483() {
		return this.aClass93Array8026;
	}

	public void method4511() {
		if (this.aClass173_8045 != null) {
			this.aClass173_8045.method2049();
		}
		if (this.aClass173_8021 != null) {
			this.aClass173_8021.method2049();
		}
		if (this.aClass173_8046 != null) {
			this.aClass173_8046.method2049();
		}
		if (this.aClass173_8047 != null) {
			this.aClass173_8047.method2049();
		}
		if (this.aClass165_8050 != null) {
			this.aClass165_8050.method1964();
		}
	}

	public boolean method4512() {
		boolean var1 = !this.aClass173_8046.aBoolean1732;
		boolean var2 = (this.anInt8081 & 0x37) != 0 && !this.aClass173_8047.aBoolean1732;
		boolean var3 = !this.aClass173_8045.aBoolean1732;
		boolean var4 = !this.aClass173_8021.aBoolean1732;
		if (!var3 && !var1 && !var2 && !var4) {
			return true;
		}
		boolean var5 = true;
		Interface9_Impl1 var6;
		Unsafe var7;
		ByteBuffer var8;
		int var9;
		int var11;
		short var12;
		int var30;
		long var32;
		if (var3 && this.aShortArray8025 != null) {
			if (this.aClass173_8045.anInterface9_Impl1_1734 == null) {
				this.aClass173_8045.anInterface9_Impl1_1734 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			}
			var6 = this.aClass173_8045.anInterface9_Impl1_1734;
			var6.method142(this.anInt8038 * 12, 12);
			var7 = this.aClass_ra_Sub2_8012.anUnsafe8461;
			if (var7 == null) {
				var8 = this.aClass_ra_Sub2_8012.aByteBuffer8458;
				var8.clear();
				for (var9 = 0; var9 < this.anInt8038; var9++) {
					var8.putFloat((float) this.anIntArray8065[this.aShortArray8025[var9]]);
					var8.putFloat((float) this.anIntArray8020[this.aShortArray8025[var9]]);
					var8.putFloat((float) this.anIntArray8051[this.aShortArray8025[var9]]);
				}
				var6.method97(0, var8.position(), this.aClass_ra_Sub2_8012.aLong8459);
			} else {
				var30 = this.anInt8038 * 12;
				var32 = var6.method94(0, var30);
				for (var11 = 0; var11 < this.anInt8038; var11++) {
					var12 = this.aShortArray8025[var11];
					var7.putFloat(var32, (float) this.anIntArray8065[var12]);
					var32 += 4L;
					var7.putFloat(var32, (float) this.anIntArray8020[var12]);
					var32 += 4L;
					var7.putFloat(var32, (float) this.anIntArray8051[var12]);
					var32 += 4L;
				}
				var6.method95();
			}
			this.aClass173_8045.anInterface9_Impl1_1733 = var6;
			this.aClass173_8045.aBoolean1732 = true;
		}
		int var15;
		int var17;
		float var18;
		float var19;
		float var20;
		short[] var33;
		float var48;
		float var53;
		if (var1) {
			if (this.aClass173_8046.anInterface9_Impl1_1734 == null) {
				this.aClass173_8046.anInterface9_Impl1_1734 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			}
			var6 = this.aClass173_8046.anInterface9_Impl1_1734;
			var6.method142(this.anInt8038 * 4, 4);
			var7 = this.aClass_ra_Sub2_8012.anUnsafe8461;
			float var22;
			int var26;
			short[] var36;
			if (var7 == null) {
				var8 = this.aClass_ra_Sub2_8012.aByteBuffer8458;
				var8.clear();
				if ((this.anInt8081 & 0x37) == 0) {
					short[] var10;
					byte[] var37;
					if (this.aClass206_8033 == null) {
						var33 = this.aShortArray8032;
						var10 = this.aShortArray8028;
						var36 = this.aShortArray8024;
						var37 = this.aByteArray8030;
					} else {
						var33 = this.aClass206_8033.aShortArray1938;
						var10 = this.aClass206_8033.aShortArray1937;
						var36 = this.aClass206_8033.aShortArray1939;
						var37 = this.aClass206_8033.aByteArray1940;
					}
					float var13 = this.aClass_ra_Sub2_8012.aFloat8489 * 768.0F / (float) this.aShort8083;
					float var14 = this.aClass_ra_Sub2_8012.aFloat8535 * 768.0F / (float) this.aShort8083;
					for (var15 = 0; var15 < this.anInt8038; var15++) {
						short var16 = this.aShortArray8075[var15];
						var17 = this.method4506(this.modelColors[var16] & 0xFFFF, this.modelTextures[var16], this.aShort8015);
						var18 = (float) (var17 >> 16 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8530;
						var19 = (float) (var17 >> 8 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8500;
						var20 = (float) (var17 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8532;
						byte var21 = var37[var15];
						if (var21 == 0) {
							var22 = (this.aClass_ra_Sub2_8012.aFloatArray8525[0] * (float) var33[var15] + this.aClass_ra_Sub2_8012.aFloatArray8525[1] * (float) var10[var15] + this.aClass_ra_Sub2_8012.aFloatArray8525[2] * (float) var36[var15]) * 0.0026041667F;
						} else {
							var22 = (this.aClass_ra_Sub2_8012.aFloatArray8525[0] * (float) var33[var15] + this.aClass_ra_Sub2_8012.aFloatArray8525[1] * (float) var10[var15] + this.aClass_ra_Sub2_8012.aFloatArray8525[2] * (float) var36[var15]) / ((float) var21 * 256.0F);
						}
						float var23 = this.aClass_ra_Sub2_8012.aFloat8533 + var22 * (var22 < 0.0F ? var14 : var13);
						int var24 = (int) (var18 * var23);
						if (var24 < 0) {
							var24 = 0;
						} else if (var24 > 255) {
							var24 = 255;
						}
						int var25 = (int) (var19 * var23);
						if (var25 < 0) {
							var25 = 0;
						} else if (var25 > 255) {
							var25 = 255;
						}
						var26 = (int) (var20 * var23);
						if (var26 < 0) {
							var26 = 0;
						} else if (var26 > 255) {
							var26 = 255;
						}
						var8.putInt(255 - this.aByteArray8037[var16] << 24 | var24 << 16 | var25 << 8 | var26);
					}
				} else {
					for (var9 = 0; var9 < this.anInt8038; var9++) {
						short var34 = this.aShortArray8075[var9];
						var11 = 255 - this.aByteArray8037[var34] << 24 | this.method4506(this.modelColors[var34] & 0xFFFF, this.modelTextures[var34], this.aShort8015);
						var8.putInt(var11);
					}
				}
				var6.method97(0, var8.position(), this.aClass_ra_Sub2_8012.aLong8459);
			} else {
				var30 = this.anInt8038 * 4;
				var32 = var6.method94(0, var30);
				if ((this.anInt8081 & 0x37) == 0) {
					short[] var38;
					short[] var39;
					byte[] var40;
					if (this.aClass206_8033 == null) {
						var36 = this.aShortArray8032;
						var38 = this.aShortArray8028;
						var39 = this.aShortArray8024;
						var40 = this.aByteArray8030;
					} else {
						var36 = this.aClass206_8033.aShortArray1938;
						var38 = this.aClass206_8033.aShortArray1937;
						var39 = this.aClass206_8033.aShortArray1939;
						var40 = this.aClass206_8033.aByteArray1940;
					}
					float var46 = this.aClass_ra_Sub2_8012.aFloat8489 * 768.0F / (float) this.aShort8083;
					var48 = this.aClass_ra_Sub2_8012.aFloat8535 * 768.0F / (float) this.aShort8083;
					for (var17 = 0; var17 < this.anInt8038; var17++) {
						short var51 = this.aShortArray8075[var17];
						int var52 = this.method4506(this.modelColors[var51] & 0xFFFF, this.modelTextures[var51], this.aShort8015);
						var20 = (float) (var52 >> 16 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8530;
						var53 = (float) (var52 >> 8 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8500;
						var22 = (float) (var52 & 0xFF) * this.aClass_ra_Sub2_8012.aFloat8532;
						byte var54 = var40[var17];
						float var55;
						if (var54 == 0) {
							var55 = (this.aClass_ra_Sub2_8012.aFloatArray8525[0] * (float) var36[var17] + this.aClass_ra_Sub2_8012.aFloatArray8525[1] * (float) var38[var17] + this.aClass_ra_Sub2_8012.aFloatArray8525[2] * (float) var39[var17]) * 0.0026041667F;
						} else {
							var55 = (this.aClass_ra_Sub2_8012.aFloatArray8525[0] * (float) var36[var17] + this.aClass_ra_Sub2_8012.aFloatArray8525[1] * (float) var38[var17] + this.aClass_ra_Sub2_8012.aFloatArray8525[2] * (float) var39[var17]) / ((float) var54 * 256.0F);
						}
						float var56 = this.aClass_ra_Sub2_8012.aFloat8533 + var55 * (var55 < 0.0F ? var48 : var46);
						var26 = (int) (var20 * var56);
						if (var26 < 0) {
							var26 = 0;
						} else if (var26 > 255) {
							var26 = 255;
						}
						int var27 = (int) (var53 * var56);
						if (var27 < 0) {
							var27 = 0;
						} else if (var27 > 255) {
							var27 = 255;
						}
						int var28 = (int) (var22 * var56);
						if (var28 < 0) {
							var28 = 0;
						} else if (var28 > 255) {
							var28 = 255;
						}
						var7.putInt(var32, 255 - this.aByteArray8037[var51] << 24 | var26 << 16 | var27 << 8 | var28);
						var32 += 4L;
					}
				} else {
					for (var11 = 0; var11 < this.anInt8038; var11++) {
						var12 = this.aShortArray8075[var11];
						int var41 = 255 - this.aByteArray8037[var12] << 24 | this.method4506(this.modelColors[var12] & 0xFFFF, this.modelTextures[var12], this.aShort8015);
						var7.putInt(var32, var41);
						var32 += 4L;
					}
				}
				var6.method95();
			}
			this.aClass173_8046.anInterface9_Impl1_1733 = var6;
			this.aClass173_8046.aBoolean1732 = true;
		}
		if (var2) {
			if (this.aClass173_8047.anInterface9_Impl1_1734 == null) {
				this.aClass173_8047.anInterface9_Impl1_1734 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			}
			var6 = this.aClass173_8047.anInterface9_Impl1_1734;
			var6.method142(this.anInt8038 * 12, 12);
			short[] var29;
			short[] var31;
			byte[] var35;
			if (this.aClass206_8033 == null) {
				var29 = this.aShortArray8032;
				var31 = this.aShortArray8028;
				var33 = this.aShortArray8024;
				var35 = this.aByteArray8030;
			} else {
				var29 = this.aClass206_8033.aShortArray1938;
				var31 = this.aClass206_8033.aShortArray1937;
				var33 = this.aClass206_8033.aShortArray1939;
				var35 = this.aClass206_8033.aByteArray1940;
			}
			float var44 = 3.0F / (float) this.aShort8083;
			float var42 = 3.0F / (float) (this.aShort8083 + this.aShort8083 / 2);
			Unsafe var43 = this.aClass_ra_Sub2_8012.anUnsafe8461;
			if (var43 == null) {
				ByteBuffer var45 = this.aClass_ra_Sub2_8012.aByteBuffer8458;
				var45.clear();
				for (var15 = 0; var15 < this.anInt8038; var15++) {
					var48 = var35[var15] == 0 ? var42 : var44 / (float) var35[var15];
					float var50 = (float) var29[var15] * var48;
					var18 = (float) var31[var15] * var48;
					var19 = (float) var33[var15] * var48;
					var45.putFloat(var50);
					var45.putFloat(var18);
					var45.putFloat(var19);
				}
				var6.method97(0, var45.position(), this.aClass_ra_Sub2_8012.aLong8459);
			} else {
				int var47 = this.anInt8038 * 12;
				long var49 = var6.method94(0, var47);
				for (var17 = 0; var17 < this.anInt8038; var17++) {
					var18 = var35[var17] == 0 ? var42 : var44 / (float) var35[var17];
					var19 = (float) var29[var17] * var18;
					var20 = (float) var31[var17] * var18;
					var53 = (float) var33[var17] * var18;
					var43.putFloat(var49, var19);
					var49 += 4L;
					var43.putFloat(var49, var20);
					var49 += 4L;
					var43.putFloat(var49, var53);
					var49 += 4L;
				}
				var6.method95();
			}
			this.aClass173_8047.anInterface9_Impl1_1733 = var6;
			this.aClass173_8047.aBoolean1732 = true;
		}
		if (var4) {
			if (this.aClass173_8021.anInterface9_Impl1_1734 == null) {
				this.aClass173_8021.anInterface9_Impl1_1734 = this.aClass_ra_Sub2_8012.method4976(this.aBoolean8049);
			}
			var6 = this.aClass173_8021.anInterface9_Impl1_1734;
			var6.method142(this.anInt8038 * 8, 8);
			var7 = this.aClass_ra_Sub2_8012.anUnsafe8461;
			if (var7 == null) {
				var8 = this.aClass_ra_Sub2_8012.aByteBuffer8458;
				var8.clear();
				for (var9 = 0; var9 < this.anInt8038; var9++) {
					var8.putFloat(this.aFloatArray8031[var9]);
					var8.putFloat(this.aFloatArray8053[var9]);
				}
				var6.method97(0, var8.position(), this.aClass_ra_Sub2_8012.aLong8459);
			} else {
				var30 = this.anInt8038 * 8;
				var32 = var6.method94(0, var30);
				for (var11 = 0; var11 < this.anInt8038; var11++) {
					var7.putFloat(var32, this.aFloatArray8031[var11]);
					var32 += 4L;
					var7.putFloat(var32, this.aFloatArray8053[var11]);
					var32 += 4L;
				}
				var6.method95();
			}
			this.aClass173_8021.anInterface9_Impl1_1733 = var6;
			this.aClass173_8021.aBoolean1732 = true;
		}
		return var5;
	}

	@ObfuscatedName("Class387_Sub1.S(I)V")
	public void S(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		int var4;
		int var5;
		for (var4 = 0; var4 < this.anInt8044; var4++) {
			var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		for (var4 = 0; var4 < this.anInt8038; var4++) {
			var5 = this.aShortArray8024[var4] * var2 + this.aShortArray8032[var4] * var3 >> 14;
			this.aShortArray8024[var4] = (short) (this.aShortArray8024[var4] * var3 - this.aShortArray8032[var4] * var2 >> 14);
			this.aShortArray8032[var4] = (short) var5;
		}
		this.method4498();
		this.method4499();
		this.aBoolean8043 = false;
	}

	public boolean method4471() {
		if (this.modelTextures == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.modelTextures.length; var1++) {
			if (this.modelTextures[var1] != -1 && !this.aClass_ra_Sub2_8012.aClass188_8552.method2095(this.modelTextures[var1], -1)) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub1.dw()Z")
	public boolean dw() {
		return this.aBoolean8042;
	}

	@ObfuscatedName("Class387_Sub1.ed(I)V")
	public void ed(int arg0) {
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			int var5 = this.anIntArray8051[var4] * var2 + this.anIntArray8065[var4] * var3 >> 14;
			this.anIntArray8051[var4] = this.anIntArray8051[var4] * var3 - this.anIntArray8065[var4] * var2 >> 14;
			this.anIntArray8065[var4] = var5;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.ej()V")
	public void ej() {
		int var1;
		for (var1 = 0; var1 < this.anInt8044; var1++) {
			this.anIntArray8051[var1] = -this.anIntArray8051[var1];
		}
		for (var1 = 0; var1 < this.anInt8038; var1++) {
			this.aShortArray8024[var1] = (short) -this.aShortArray8024[var1];
		}
		for (var1 = 0; var1 < this.anInt8034 * -1431655765; var1++) {
			short var2 = this.aShortArray8016[var1];
			this.aShortArray8016[var1] = this.aShortArray8040[var1];
			this.aShortArray8040[var1] = var2;
		}
		this.method4498();
		this.method4499();
		this.method4500();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.ew()Z")
	public boolean ew() {
		return this.aBoolean8067;
	}

	@ObfuscatedName("Class387_Sub1.m()I")
	public int m() {
		return this.anInt8013;
	}

	@ObfuscatedName("Class387_Sub1.em()Z")
	public boolean em() {
		return this.aBoolean8067;
	}

	public boolean method4513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@ObfuscatedName("Class387_Sub1.ei()Z")
	public boolean ei() {
		if (this.anIntArrayArray8022 == null) {
			return false;
		}
		for (int var1 = 0; var1 < this.anInt8014; var1++) {
			this.anIntArray8065[var1] <<= 0x4;
			this.anIntArray8020[var1] <<= 0x4;
			this.anIntArray8051[var1] <<= 0x4;
		}
		this.anInt8080 = 0;
		this.anInt8061 = 0;
		this.anInt8055 = 0;
		return true;
	}

	@ObfuscatedName("Class387_Sub1.er(I[IIIIZI[I)V")
	public void er(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int[] var13;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8022.length) {
					var13 = this.anIntArrayArray8022[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var15]) != 0) {
							this.anInt8080 += this.anIntArray8065[var15];
							this.anInt8061 += this.anIntArray8020[var15];
							this.anInt8055 += this.anIntArray8051[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8080 = this.anInt8080 / var10 + arg2;
				this.anInt8061 = this.anInt8061 / var10 + arg3;
				this.anInt8055 = this.anInt8055 / var10 + arg4;
				this.aBoolean8048 = true;
			} else {
				this.anInt8080 = arg2;
				this.anInt8061 = arg3;
				this.anInt8055 = arg4;
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
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] += arg2;
							this.anIntArray8020[var14] += arg3;
							this.anIntArray8051[var14] += arg4;
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
		int[] var60;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8022.length) {
						var47 = this.anIntArrayArray8022[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
								this.anIntArray8065[var14] -= this.anInt8080;
								this.anIntArray8020[var14] -= this.anInt8061;
								this.anIntArray8051[var14] -= this.anInt8055;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8020[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = this.anIntArray8020[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8020[var14] * var16 - this.anIntArray8051[var14] * var15 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8020[var14] * var15 + this.anIntArray8051[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8051[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8051[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								this.anIntArray8065[var14] += this.anInt8080;
								this.anIntArray8020[var14] += this.anInt8061;
								this.anIntArray8051[var14] += this.anInt8055;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8022.length) {
							var47 = this.anIntArrayArray8022[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
									var15 = this.anIntArray8082[var14];
									var16 = this.anIntArray8082[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8052[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8028[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8028[var18] = (short) (this.aShortArray8028[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8028[var18] * var20 - this.aShortArray8024[var18] * var19 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8028[var18] * var19 + this.aShortArray8024[var18] * var20 + 16383 >> 14);
											this.aShortArray8028[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8024[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8024[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					this.method4499();
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8048) {
					var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var56 = var18 + var15;
					this.anInt8080 = var51;
					this.anInt8061 = var54;
					this.anInt8055 = var56;
					this.aBoolean8048 = false;
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
				int var25 = var52[0] * -this.anInt8080 + var52[1] * -this.anInt8061 + var52[2] * -this.anInt8055 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8080 + var52[4] * -this.anInt8061 + var52[5] * -this.anInt8055 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8080 + var52[7] * -this.anInt8061 + var52[8] * -this.anInt8055 + 8192 >> 14;
				var28 = var25 + this.anInt8080;
				int var29 = var26 + this.anInt8061;
				var30 = var27 + this.anInt8055;
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
				var60 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var60[var36 * 3 + var37] = var38 + 8192 >> 14;
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
					if (var40 < this.anIntArrayArray8022.length) {
						int[] var41 = this.anIntArrayArray8022[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var43]) != 0) {
								int var44 = var60[0] * this.anIntArray8065[var43] + var60[1] * this.anIntArray8020[var43] + var60[2] * this.anIntArray8051[var43] + 8192 >> 14;
								int var45 = var60[3] * this.anIntArray8065[var43] + var60[4] * this.anIntArray8020[var43] + var60[5] * this.anIntArray8051[var43] + 8192 >> 14;
								int var46 = var60[6] * this.anIntArray8065[var43] + var60[7] * this.anIntArray8020[var43] + var60[8] * this.anIntArray8051[var43] + 8192 >> 14;
								int var61 = var44 + var36;
								int var62 = var45 + var37;
								int var63 = var46 + var38;
								this.anIntArray8065[var43] = var61;
								this.anIntArray8020[var43] = var62;
								this.anIntArray8051[var43] = var63;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			boolean var49;
			Class185 var50;
			Class177 var53;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var49 = false;
					for (var11 = 0; var11 < var9; var11++) {
						var12 = arg1[var11];
						if (var12 < this.anIntArrayArray8017.length) {
							var13 = this.anIntArrayArray8017[var12];
							for (var14 = 0; var14 < var13.length; var14++) {
								var15 = var13[var14];
								if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
									var16 = (this.aByteArray8037[var15] & 0xFF) + arg2 * 8;
									if (var16 < 0) {
										var16 = 0;
									} else if (var16 > 255) {
										var16 = 255;
									}
									this.aByteArray8037[var15] = (byte) var16;
								}
							}
							var49 |= var13.length > 0;
						}
					}
					if (var49) {
						if (this.aClass185Array8070 != null) {
							for (var11 = 0; var11 < this.anInt8069; var11++) {
								var50 = this.aClass185Array8070[var11];
								var53 = this.aClass177Array8071[var11];
								var53.anInt1750 = var53.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var50.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var55;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1751 += arg2;
									var55.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1752 = var55.anInt1752 * arg2 >> 7;
									var55.anInt1749 = var55.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8072.length) {
							var47 = this.anIntArrayArray8072[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var55 = this.aClass177Array8071[var47[var48]];
								var55.anInt1753 = var55.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var49 = false;
				for (var11 = 0; var11 < var9; var11++) {
					var12 = arg1[var11];
					if (var12 < this.anIntArrayArray8017.length) {
						var13 = this.anIntArrayArray8017[var12];
						for (var14 = 0; var14 < var13.length; var14++) {
							var15 = var13[var14];
							if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
								var16 = this.modelColors[var15] & 0xFFFF;
								var17 = var16 >> 10 & 0x3F;
								var18 = var16 >> 7 & 0x7;
								var19 = var16 & 0x7F;
								var17 = var17 + arg2 & 0x3F;
								var18 += arg3 / 4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 7) {
									var18 = 7;
								}
								var19 += arg4;
								if (var19 < 0) {
									var19 = 0;
								} else if (var19 > 127) {
									var19 = 127;
								}
								this.modelColors[var15] = (short) (var17 << 10 | var18 << 7 | var19);
							}
						}
						var49 |= var13.length > 0;
					}
				}
				if (var49) {
					if (this.aClass185Array8070 != null) {
						for (var11 = 0; var11 < this.anInt8069; var11++) {
							var50 = this.aClass185Array8070[var11];
							var53 = this.aClass177Array8071[var11];
							var53.anInt1750 = var53.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var50.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] -= this.anInt8080;
							this.anIntArray8020[var14] -= this.anInt8061;
							this.anIntArray8051[var14] -= this.anInt8055;
							this.anIntArray8065[var14] = this.anIntArray8065[var14] * arg2 >> 7;
							this.anIntArray8020[var14] = this.anIntArray8020[var14] * arg3 >> 7;
							this.anIntArray8051[var14] = this.anIntArray8051[var14] * arg4 >> 7;
							this.anIntArray8065[var14] += this.anInt8080;
							this.anIntArray8020[var14] += this.anInt8061;
							this.anIntArray8051[var14] += this.anInt8055;
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
			if (this.aBoolean8048) {
				var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8080 = var16;
				this.anInt8061 = var17;
				this.anInt8055 = var18;
				this.aBoolean8048 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8080 + 8192 >> 14;
			var20 = var17 * -this.anInt8061 + 8192 >> 14;
			var21 = var18 * -this.anInt8055 + 8192 >> 14;
			var22 = var19 + this.anInt8080;
			var23 = var20 + this.anInt8061;
			var24 = var21 + this.anInt8055;
			int[] var57 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var58 = new int[9];
			int var59;
			for (var30 = 0; var30 < 3; var30++) {
				for (var59 = 0; var59 < 3; var59++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var57[var59 + var33 * 3];
					}
					var58[var30 * 3 + var59] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var59 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var59 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8022.length) {
					var60 = this.anIntArrayArray8022[var34];
					for (var36 = 0; var36 < var60.length; var36++) {
						var37 = var60[var36];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var37]) != 0) {
							var38 = var58[0] * this.anIntArray8065[var37] + var58[1] * this.anIntArray8020[var37] + var58[2] * this.anIntArray8051[var37] + 8192 >> 14;
							var39 = var58[3] * this.anIntArray8065[var37] + var58[4] * this.anIntArray8020[var37] + var58[5] * this.anIntArray8051[var37] + 8192 >> 14;
							var40 = var58[6] * this.anIntArray8065[var37] + var58[7] * this.anIntArray8020[var37] + var58[8] * this.anIntArray8051[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var59;
							var40 += var32;
							this.anIntArray8065[var37] = var38;
							this.anIntArray8020[var37] = var39;
							this.anIntArray8051[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.dz()[B")
	public byte[] dz() {
		return this.aByteArray8037;
	}

	@ObfuscatedName("Class387_Sub1.ee(I[IIIIZI[I)V")
	public void ee(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
		int var9 = arg1.length;
		int var10;
		int var11;
		int var12;
		int[] var13;
		int var14;
		int var15;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			var10 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8022.length) {
					var13 = this.anIntArrayArray8022[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var15]) != 0) {
							this.anInt8080 += this.anIntArray8065[var15];
							this.anInt8061 += this.anIntArray8020[var15];
							this.anInt8055 += this.anIntArray8051[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8080 = this.anInt8080 / var10 + arg2;
				this.anInt8061 = this.anInt8061 / var10 + arg3;
				this.anInt8055 = this.anInt8055 / var10 + arg4;
				this.aBoolean8048 = true;
			} else {
				this.anInt8080 = arg2;
				this.anInt8061 = arg3;
				this.anInt8055 = arg4;
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
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] += arg2;
							this.anIntArray8020[var14] += arg3;
							this.anIntArray8051[var14] += arg4;
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
		int[] var60;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8022.length) {
						var47 = this.anIntArrayArray8022[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
								this.anIntArray8065[var14] -= this.anInt8080;
								this.anIntArray8020[var14] -= this.anInt8061;
								this.anIntArray8051[var14] -= this.anInt8055;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8020[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = this.anIntArray8020[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8020[var14] * var16 - this.anIntArray8051[var14] * var15 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8020[var14] * var15 + this.anIntArray8051[var14] * var16 + 16383 >> 14;
									this.anIntArray8020[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8051[var14] * var15 + this.anIntArray8065[var14] * var16 + 16383 >> 14;
									this.anIntArray8051[var14] = this.anIntArray8051[var14] * var16 - this.anIntArray8065[var14] * var15 + 16383 >> 14;
									this.anIntArray8065[var14] = var17;
								}
								this.anIntArray8065[var14] += this.anInt8080;
								this.anIntArray8020[var14] += this.anInt8061;
								this.anIntArray8051[var14] += this.anInt8055;
							}
						}
					}
				}
				if (arg5) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8022.length) {
							var47 = this.anIntArrayArray8022[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
									var15 = this.anIntArray8082[var14];
									var16 = this.anIntArray8082[var14 + 1];
									for (var17 = var15; var17 < var16; var17++) {
										var18 = this.aShortArray8052[var17] - 1;
										if (var18 == -1) {
											break;
										}
										if (arg4 != 0) {
											var19 = Class257.anIntArray2683[arg4];
											var20 = Class257.anIntArray2684[arg4];
											var21 = this.aShortArray8028[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8028[var18] = (short) (this.aShortArray8028[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
										if (arg2 != 0) {
											var19 = Class257.anIntArray2683[arg2];
											var20 = Class257.anIntArray2684[arg2];
											var21 = this.aShortArray8028[var18] * var20 - this.aShortArray8024[var18] * var19 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8028[var18] * var19 + this.aShortArray8024[var18] * var20 + 16383 >> 14);
											this.aShortArray8028[var18] = (short) var21;
										}
										if (arg3 != 0) {
											var19 = Class257.anIntArray2683[arg3];
											var20 = Class257.anIntArray2684[arg3];
											var21 = this.aShortArray8024[var18] * var19 + this.aShortArray8032[var18] * var20 + 16383 >> 14;
											this.aShortArray8024[var18] = (short) (this.aShortArray8024[var18] * var20 - this.aShortArray8032[var18] * var19 + 16383 >> 14);
											this.aShortArray8032[var18] = (short) var21;
										}
									}
								}
							}
						}
					}
					this.method4499();
				}
			} else {
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8048) {
					var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var56 = var18 + var15;
					this.anInt8080 = var51;
					this.anInt8061 = var54;
					this.anInt8055 = var56;
					this.aBoolean8048 = false;
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
				int var25 = var52[0] * -this.anInt8080 + var52[1] * -this.anInt8061 + var52[2] * -this.anInt8055 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8080 + var52[4] * -this.anInt8061 + var52[5] * -this.anInt8055 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8080 + var52[7] * -this.anInt8061 + var52[8] * -this.anInt8055 + 8192 >> 14;
				var28 = var25 + this.anInt8080;
				int var29 = var26 + this.anInt8061;
				var30 = var27 + this.anInt8055;
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
				var60 = new int[9];
				for (var36 = 0; var36 < 3; var36++) {
					for (var37 = 0; var37 < 3; var37++) {
						var38 = 0;
						for (var39 = 0; var39 < 3; var39++) {
							var38 += arg7[var36 * 3 + var39] * var31[var37 + var39 * 3];
						}
						var60[var36 * 3 + var37] = var38 + 8192 >> 14;
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
					if (var40 < this.anIntArrayArray8022.length) {
						int[] var41 = this.anIntArrayArray8022[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var43]) != 0) {
								int var44 = var60[0] * this.anIntArray8065[var43] + var60[1] * this.anIntArray8020[var43] + var60[2] * this.anIntArray8051[var43] + 8192 >> 14;
								int var45 = var60[3] * this.anIntArray8065[var43] + var60[4] * this.anIntArray8020[var43] + var60[5] * this.anIntArray8051[var43] + 8192 >> 14;
								int var46 = var60[6] * this.anIntArray8065[var43] + var60[7] * this.anIntArray8020[var43] + var60[8] * this.anIntArray8051[var43] + 8192 >> 14;
								int var61 = var44 + var36;
								int var62 = var45 + var37;
								int var63 = var46 + var38;
								this.anIntArray8065[var43] = var61;
								this.anIntArray8020[var43] = var62;
								this.anIntArray8051[var43] = var63;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			boolean var49;
			Class185 var50;
			Class177 var53;
			if (arg0 == 5) {
				if (this.anIntArrayArray8017 != null) {
					var49 = false;
					for (var11 = 0; var11 < var9; var11++) {
						var12 = arg1[var11];
						if (var12 < this.anIntArrayArray8017.length) {
							var13 = this.anIntArrayArray8017[var12];
							for (var14 = 0; var14 < var13.length; var14++) {
								var15 = var13[var14];
								if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
									var16 = (this.aByteArray8037[var15] & 0xFF) + arg2 * 8;
									if (var16 < 0) {
										var16 = 0;
									} else if (var16 > 255) {
										var16 = 255;
									}
									this.aByteArray8037[var15] = (byte) var16;
								}
							}
							var49 |= var13.length > 0;
						}
					}
					if (var49) {
						if (this.aClass185Array8070 != null) {
							for (var11 = 0; var11 < this.anInt8069; var11++) {
								var50 = this.aClass185Array8070[var11];
								var53 = this.aClass177Array8071[var11];
								var53.anInt1750 = var53.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var50.modelColorIndex] & 0xFF) << 24;
							}
						}
						this.method4507();
					}
				}
			} else if (arg0 != 7) {
				Class177 var55;
				if (arg0 == 8) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1751 += arg2;
									var55.anInt1748 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8072 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8072.length) {
								var47 = this.anIntArrayArray8072[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var55 = this.aClass177Array8071[var47[var48]];
									var55.anInt1752 = var55.anInt1752 * arg2 >> 7;
									var55.anInt1749 = var55.anInt1749 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8072 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8072.length) {
							var47 = this.anIntArrayArray8072[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var55 = this.aClass177Array8071[var47[var48]];
								var55.anInt1753 = var55.anInt1753 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8017 != null) {
				var49 = false;
				for (var11 = 0; var11 < var9; var11++) {
					var12 = arg1[var11];
					if (var12 < this.anIntArrayArray8017.length) {
						var13 = this.anIntArrayArray8017[var12];
						for (var14 = 0; var14 < var13.length; var14++) {
							var15 = var13[var14];
							if (this.aShortArray8018 == null || (arg6 & this.aShortArray8018[var15]) != 0) {
								var16 = this.modelColors[var15] & 0xFFFF;
								var17 = var16 >> 10 & 0x3F;
								var18 = var16 >> 7 & 0x7;
								var19 = var16 & 0x7F;
								var17 = var17 + arg2 & 0x3F;
								var18 += arg3 / 4;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 7) {
									var18 = 7;
								}
								var19 += arg4;
								if (var19 < 0) {
									var19 = 0;
								} else if (var19 > 127) {
									var19 = 127;
								}
								this.modelColors[var15] = (short) (var17 << 10 | var18 << 7 | var19);
							}
						}
						var49 |= var13.length > 0;
					}
				}
				if (var49) {
					if (this.aClass185Array8070 != null) {
						for (var11 = 0; var11 < this.anInt8069; var11++) {
							var50 = this.aClass185Array8070[var11];
							var53 = this.aClass177Array8071[var11];
							var53.anInt1750 = var53.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var50.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8022.length) {
					var47 = this.anIntArrayArray8022[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var14]) != 0) {
							this.anIntArray8065[var14] -= this.anInt8080;
							this.anIntArray8020[var14] -= this.anInt8061;
							this.anIntArray8051[var14] -= this.anInt8055;
							this.anIntArray8065[var14] = this.anIntArray8065[var14] * arg2 >> 7;
							this.anIntArray8020[var14] = this.anIntArray8020[var14] * arg3 >> 7;
							this.anIntArray8051[var14] = this.anIntArray8051[var14] * arg4 >> 7;
							this.anIntArray8065[var14] += this.anInt8080;
							this.anIntArray8020[var14] += this.anInt8061;
							this.anIntArray8051[var14] += this.anInt8055;
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
			if (this.aBoolean8048) {
				var16 = arg7[0] * this.anInt8080 + arg7[3] * this.anInt8061 + arg7[6] * this.anInt8055 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8080 + arg7[4] * this.anInt8061 + arg7[7] * this.anInt8055 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8080 + arg7[5] * this.anInt8061 + arg7[8] * this.anInt8055 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8080 = var16;
				this.anInt8061 = var17;
				this.anInt8055 = var18;
				this.aBoolean8048 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8080 + 8192 >> 14;
			var20 = var17 * -this.anInt8061 + 8192 >> 14;
			var21 = var18 * -this.anInt8055 + 8192 >> 14;
			var22 = var19 + this.anInt8080;
			var23 = var20 + this.anInt8061;
			var24 = var21 + this.anInt8055;
			int[] var57 = new int[] { var16 * arg7[0] + 8192 >> 14, var16 * arg7[3] + 8192 >> 14, var16 * arg7[6] + 8192 >> 14, var17 * arg7[1] + 8192 >> 14, var17 * arg7[4] + 8192 >> 14, var17 * arg7[7] + 8192 >> 14, var18 * arg7[2] + 8192 >> 14, var18 * arg7[5] + 8192 >> 14, var18 * arg7[8] + 8192 >> 14 };
			var26 = var16 * var48 + 8192 >> 14;
			var27 = var17 * var14 + 8192 >> 14;
			var28 = var18 * var15 + 8192 >> 14;
			var26 += var22;
			var27 += var23;
			var28 += var24;
			int[] var58 = new int[9];
			int var59;
			for (var30 = 0; var30 < 3; var30++) {
				for (var59 = 0; var59 < 3; var59++) {
					var32 = 0;
					for (var33 = 0; var33 < 3; var33++) {
						var32 += arg7[var30 * 3 + var33] * var57[var59 + var33 * 3];
					}
					var58[var30 * 3 + var59] = var32 + 8192 >> 14;
				}
			}
			var30 = arg7[0] * var26 + arg7[1] * var27 + arg7[2] * var28 + 8192 >> 14;
			var59 = arg7[3] * var26 + arg7[4] * var27 + arg7[5] * var28 + 8192 >> 14;
			var32 = arg7[6] * var26 + arg7[7] * var27 + arg7[8] * var28 + 8192 >> 14;
			var30 += var10;
			var59 += var11;
			var32 += var12;
			for (var33 = 0; var33 < var9; var33++) {
				var34 = arg1[var33];
				if (var34 < this.anIntArrayArray8022.length) {
					var60 = this.anIntArrayArray8022[var34];
					for (var36 = 0; var36 < var60.length; var36++) {
						var37 = var60[var36];
						if (this.aShortArray8023 == null || (arg6 & this.aShortArray8023[var37]) != 0) {
							var38 = var58[0] * this.anIntArray8065[var37] + var58[1] * this.anIntArray8020[var37] + var58[2] * this.anIntArray8051[var37] + 8192 >> 14;
							var39 = var58[3] * this.anIntArray8065[var37] + var58[4] * this.anIntArray8020[var37] + var58[5] * this.anIntArray8051[var37] + 8192 >> 14;
							var40 = var58[6] * this.anIntArray8065[var37] + var58[7] * this.anIntArray8020[var37] + var58[8] * this.anIntArray8051[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var59;
							var40 += var32;
							this.anIntArray8065[var37] = var38;
							this.anIntArray8020[var37] = var39;
							this.anIntArray8051[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.el()Z")
	public boolean el() {
		return this.aBoolean8067;
	}

	@ObfuscatedName("Class387_Sub1.as()[B")
	public byte[] as() {
		return this.aByteArray8037;
	}

	public void method4480(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub1 var6 = (Class387_Sub1) arg0;
		if (this.anInt8034 * -1431655765 == 0 || var6.anInt8034 * -1431655765 == 0) {
			return;
		}
		int var7 = var6.anInt8044;
		int[] var8 = var6.anIntArray8065;
		int[] var9 = var6.anIntArray8020;
		int[] var10 = var6.anIntArray8051;
		short[] var11 = var6.aShortArray8032;
		short[] var12 = var6.aShortArray8028;
		short[] var13 = var6.aShortArray8024;
		byte[] var14 = var6.aByteArray8030;
		short[] var15;
		short[] var16;
		short[] var17;
		byte[] var18;
		if (this.aClass206_8033 == null) {
			var15 = null;
			var16 = null;
			var17 = null;
			var18 = null;
		} else {
			var15 = this.aClass206_8033.aShortArray1938;
			var16 = this.aClass206_8033.aShortArray1937;
			var17 = this.aClass206_8033.aShortArray1939;
			var18 = this.aClass206_8033.aByteArray1940;
		}
		short[] var19;
		short[] var20;
		short[] var21;
		byte[] var22;
		if (var6.aClass206_8033 == null) {
			var19 = null;
			var20 = null;
			var21 = null;
			var22 = null;
		} else {
			var19 = var6.aClass206_8033.aShortArray1938;
			var20 = var6.aClass206_8033.aShortArray1937;
			var21 = var6.aClass206_8033.aShortArray1939;
			var22 = var6.aClass206_8033.aByteArray1940;
		}
		int[] var23 = var6.anIntArray8082;
		short[] var24 = var6.aShortArray8052;
		if (!var6.aBoolean8043) {
			var6.method4501();
		}
		int var25 = var6.anInt8056;
		int var26 = var6.anInt8057;
		int var27 = var6.anInt8058;
		int var28 = var6.anInt8059;
		int var29 = var6.anInt8060;
		int var30 = var6.anInt8078;
		for (int var31 = 0; var31 < this.anInt8044; var31++) {
			int var32 = this.anIntArray8020[var31] - arg2;
			if (var32 >= var25 && var32 <= var26) {
				int var33 = this.anIntArray8065[var31] - arg1;
				if (var33 >= var27 && var33 <= var28) {
					int var34 = this.anIntArray8051[var31] - arg3;
					if (var34 >= var29 && var34 <= var30) {
						int var35 = -1;
						int var36 = this.anIntArray8082[var31];
						int var37 = this.anIntArray8082[var31 + 1];
						int var38;
						for (var38 = var36; var38 < var37; var38++) {
							var35 = this.aShortArray8052[var38] - 1;
							if (var35 == -1 || this.aByteArray8030[var35] != 0) {
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
											this.aClass206_8033 = new Class206();
											var15 = this.aClass206_8033.aShortArray1938 = Class263_Sub4.method2637(this.aShortArray8032, 2139551579);
											var16 = this.aClass206_8033.aShortArray1937 = Class263_Sub4.method2637(this.aShortArray8028, 1998022131);
											var17 = this.aClass206_8033.aShortArray1939 = Class263_Sub4.method2637(this.aShortArray8024, 1723588614);
											var18 = this.aClass206_8033.aByteArray1940 = IcmpService_Sub1.method6479(this.aByteArray8030, (byte) 2);
										}
										if (var19 == null) {
											Class206 var46 = var6.aClass206_8033 = new Class206();
											var19 = var46.aShortArray1938 = Class263_Sub4.method2637(var11, 1566623775);
											var20 = var46.aShortArray1937 = Class263_Sub4.method2637(var12, 1512013429);
											var21 = var46.aShortArray1939 = Class263_Sub4.method2637(var13, 1903748505);
											var22 = var46.aByteArray1940 = IcmpService_Sub1.method6479(var14, (byte) 2);
										}
										short var47 = this.aShortArray8032[var35];
										short var41 = this.aShortArray8028[var35];
										short var42 = this.aShortArray8024[var35];
										byte var43 = this.aByteArray8030[var35];
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
										var36 = this.anIntArray8082[var31];
										var37 = this.anIntArray8082[var31 + 1];
										for (var44 = var36; var44 < var37; var44++) {
											var45 = this.aShortArray8052[var44] - 1;
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
										var6.method4499();
										this.method4499();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub1.ar()I")
	public int ar() {
		return this.anInt8013;
	}

	@ObfuscatedName("Class387_Sub1.oa(III)V")
	public void oa(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			if (arg0 != 128) {
				this.anIntArray8065[var4] = this.anIntArray8065[var4] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray8020[var4] = this.anIntArray8020[var4] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray8051[var4] = this.anIntArray8051[var4] * arg2 >> 7;
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.dr()[B")
	public byte[] dr() {
		return this.aByteArray8037;
	}

	@ObfuscatedName("Class387_Sub1.dl(SS)V")
	public void dl(short arg0, short arg1) {
		Interface_ma var3 = this.aClass_ra_Sub2_8012.anInterface_ma4227;
		for (int var4 = 0; var4 < this.anInt8034 * -1431655765; var4++) {
			if (this.modelTextures[var4] == arg0) {
				this.modelTextures[var4] = arg1;
			}
		}
		byte var11 = 0;
		byte var5 = 0;
		if (arg0 != -1) {
			Class56 var6 = var3.method221(arg0 & 0xFFFF, 528599723);
			var11 = var6.aByte529;
			var5 = var6.aByte534;
		}
		byte var12 = 0;
		byte var7 = 0;
		if (arg1 != -1) {
			Class56 var8 = var3.method221(arg1 & 0xFFFF, -802687006);
			var12 = var8.aByte529;
			var7 = var8.aByte534;
			if (var8.aByte531 != 0 || var8.aByte530 != 0) {
				this.aBoolean8042 = true;
			}
		}
		if (!(var11 != var12 | var5 != var7)) {
			return;
		}
		if (this.aClass185Array8070 != null) {
			for (int var13 = 0; var13 < this.anInt8069; var13++) {
				Class185 var9 = this.aClass185Array8070[var13];
				Class177 var10 = this.aClass177Array8071[var13];
				var10.anInt1750 = var10.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var9.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.bx()V")
	public void bx() {
		for (int var1 = 0; var1 < this.anInt8014; var1++) {
			this.anIntArray8065[var1] = this.anIntArray8065[var1] + 7 >> 4;
			this.anIntArray8020[var1] = this.anIntArray8020[var1] + 7 >> 4;
			this.anIntArray8051[var1] = this.anIntArray8051[var1] + 7 >> 4;
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.Z()I")
	public int Z() {
		return this.aShort8083;
	}

	public void method4486(byte arg0, byte[] arg1) {
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				this.aByteArray8037[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8034 * -1431655765; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8037[var3] = (byte) var4;
			}
		}
		this.method4507();
	}

	@ObfuscatedName("Class387_Sub1.bz(III)V")
	public void bz(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt8044; var4++) {
			if (arg0 != 0) {
				this.anIntArray8065[var4] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray8020[var4] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray8051[var4] += arg2;
			}
		}
		this.method4498();
		this.aBoolean8043 = false;
	}

	@ObfuscatedName("Class387_Sub1.bu(IIII)V")
	public void bu(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			this.anInt8080 = 0;
			this.anInt8061 = 0;
			this.anInt8055 = 0;
			for (var6 = 0; var6 < this.anInt8044; var6++) {
				this.anInt8080 += this.anIntArray8065[var6];
				this.anInt8061 += this.anIntArray8020[var6];
				this.anInt8055 += this.anIntArray8051[var6];
				var5++;
			}
			if (var5 > 0) {
				this.anInt8080 = this.anInt8080 / var5 + arg1;
				this.anInt8061 = this.anInt8061 / var5 + arg2;
				this.anInt8055 = this.anInt8055 / var5 + arg3;
			} else {
				this.anInt8080 = arg1;
				this.anInt8061 = arg2;
				this.anInt8055 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8044; var5++) {
				this.anIntArray8065[var5] += arg1;
				this.anIntArray8020[var5] += arg2;
				this.anIntArray8051[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8044; var5++) {
					this.anIntArray8065[var5] -= this.anInt8080;
					this.anIntArray8020[var5] -= this.anInt8061;
					this.anIntArray8051[var5] -= this.anInt8055;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8020[var5] * var6 + this.anIntArray8065[var5] * var7 + 16383 >> 14;
						this.anIntArray8020[var5] = this.anIntArray8020[var5] * var7 - this.anIntArray8065[var5] * var6 + 16383 >> 14;
						this.anIntArray8065[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8020[var5] * var7 - this.anIntArray8051[var5] * var6 + 16383 >> 14;
						this.anIntArray8051[var5] = this.anIntArray8020[var5] * var6 + this.anIntArray8051[var5] * var7 + 16383 >> 14;
						this.anIntArray8020[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8051[var5] * var6 + this.anIntArray8065[var5] * var7 + 16383 >> 14;
						this.anIntArray8051[var5] = this.anIntArray8051[var5] * var7 - this.anIntArray8065[var5] * var6 + 16383 >> 14;
						this.anIntArray8065[var5] = var8;
					}
					this.anIntArray8065[var5] += this.anInt8080;
					this.anIntArray8020[var5] += this.anInt8061;
					this.anIntArray8051[var5] += this.anInt8055;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8044; var5++) {
					this.anIntArray8065[var5] -= this.anInt8080;
					this.anIntArray8020[var5] -= this.anInt8061;
					this.anIntArray8051[var5] -= this.anInt8055;
					this.anIntArray8065[var5] = this.anIntArray8065[var5] * arg1 / 128;
					this.anIntArray8020[var5] = this.anIntArray8020[var5] * arg2 / 128;
					this.anIntArray8051[var5] = this.anIntArray8051[var5] * arg3 / 128;
					this.anIntArray8065[var5] += this.anInt8080;
					this.anIntArray8020[var5] += this.anInt8061;
					this.anIntArray8051[var5] += this.anInt8055;
				}
			} else {
				Class177 var10;
				Class185 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
						var6 = (this.aByteArray8037[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8037[var5] = (byte) var6;
					}
					if (this.aClass185Array8070 != null) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var11 = this.aClass185Array8070[var5];
							var10 = this.aClass177Array8071[var5];
							var10.anInt1750 = var10.anInt1750 & 0xFFFFFF | 255 - (this.aByteArray8037[var11.modelColorIndex] & 0xFF) << 24;
						}
					}
					this.method4507();
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8034 * -1431655765; var5++) {
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
					if (this.aClass185Array8070 != null) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var11 = this.aClass185Array8070[var5];
							var10 = this.aClass177Array8071[var5];
							var10.anInt1750 = var10.anInt1750 & 0xFF000000 | Console.colorArray[this.modelColors[var11.modelColorIndex] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method4507();
				} else {
					Class177 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1751 += arg1;
							var12.anInt1748 += arg2;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1752 = var12.anInt1752 * arg1 >> 7;
							var12.anInt1749 = var12.anInt1749 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8069; var5++) {
							var12 = this.aClass177Array8071[var5];
							var12.anInt1753 = var12.anInt1753 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	public Class93[] method4464() {
		return this.aClass93Array8026;
	}
}
