package deob;

public class Class387_Sub3 extends Class387 {

	public boolean aBoolean8161 = false;

	public int anInt8174 = 0;

	public int anInt8185 = 0;

	public int anInt8184 = 0;

	public int anInt8196 = 0;

	public boolean aBoolean8208 = false;

	public boolean aBoolean8212 = false;

	public boolean aBoolean8187 = false;

	public boolean aBoolean8228 = false;

	public boolean aBoolean8229 = false;

	public Class_ra_Sub3 aClass_ra_Sub3_8165;

	public int anInt8172;

	public int anInt8236;

	public int anInt8176;

	public int[] anIntArray8238;

	public int[] anIntArray8195;

	public int[] anIntArray8180;

	public short[] aShortArray8173;

	public short[] aShortArray8186;

	public short[] aShortArray8217;

	public byte[] aByteArray8203;

	public short[] modelColors;

	public byte[] aByteArray8200;

	public short[] aShortArray8181;

	public byte[] aByteArray8230;

	public Class93[] aClass93Array8213;

	public Class64[] aClass64Array8160;

	public short[] aShortArray8242;

	public int anInt8215;

	public Class20[] aClass20Array8216;

	public Class10[] aClass10Array8211;

	public float[][] aFloatArrayArray8188;

	public float[][] aFloatArrayArray8189;

	public int[][] anIntArrayArray8205;

	public int[][] anIntArrayArray8206;

	public int[][] anIntArrayArray8218;

	public short[] aShortArray8201;

	public short[] aShortArray8204;

	public static int anInt8167 = -1;

	public static int anInt8168 = -2;

	public static int anInt8169 = 4;

	public static int anInt8171 = 618520;

	public static int anInt8193 = 0;

	public static int anInt8194 = 1;

	public static int anInt8199 = 2;

	public static int anInt8210 = 7;

	public static int anInt8222 = 4096;

	public static int anInt8237 = 618648;

	public static int anInt8166 = 4096;

	public static int anInt8175 = 0;

	public int anInt8209;

	public int anInt8219;

	public int anInt8221;

	public Class38 aClass38_8164;

	public Class6 aClass6_8162;

	public Class6 aClass6_8163;

	public short aShort8198;

	public short aShort8214;

	public short aShort8220;

	public short aShort8223;

	public short aShort8224;

	public short aShort8225;

	public short aShort8226;

	public short aShort8227;

	public boolean aBoolean8207;

	public float[] aFloatArray8232;

	public float[] aFloatArray8233;

	public float[] aFloatArray8234;

	public float[] aFloatArray8235;

	public int[] anIntArray8177;

	public int[] anIntArray8178;

	public int[] anIntArray8179;

	public int[] anIntArray8190;

	public int[] anIntArray8191;

	public int[] anIntArray8192;

	public int[] anIntArray8231;

	public int[] anIntArray8239;

	public int[] anIntArray8240;

	public int[] anIntArray8241;

	public Class21[] aClass21Array8182;

	public Class21[] aClass21Array8183;

	public Class25[] aClass25Array8197;

	public Class387_Sub3[] aClass387_Sub3Array8170;

	public Class387_Sub3[] aClass387_Sub3Array8243;

	public Class387_Sub3(Class_ra_Sub3 arg0, Model arg1, int arg2, int arg3, int arg4, int arg5) {
		this.aClass_ra_Sub3_8165 = arg0;
		this.anInt8172 = arg2;
		this.anInt8236 = arg3;
		this.anInt8176 = arg4;
		Interface_ma var7 = this.aClass_ra_Sub3_8165.anInterface_ma4227;
		this.anInt8174 = arg1.anInt897;
		this.anInt8185 = arg1.anInt874;
		this.anIntArray8238 = arg1.anIntArray875;
		this.anIntArray8195 = arg1.anIntArray889;
		this.anIntArray8180 = arg1.anIntArray877;
		this.anInt8184 = arg1.anInt904;
		this.aShortArray8173 = arg1.aShortArray888;
		this.aShortArray8186 = arg1.aShortArray907;
		this.aShortArray8217 = arg1.aShortArray883;
		this.aByteArray8203 = arg1.aByteArray885;
		this.modelColors = arg1.aShortArray873;
		this.aByteArray8200 = arg1.aByteArray876;
		this.aShortArray8181 = arg1.aShortArray892;
		this.aByteArray8230 = arg1.aByteArray884;
		this.aClass93Array8213 = arg1.aClass93Array878;
		this.aClass64Array8160 = arg1.aClass64Array893;
		this.aShortArray8242 = arg1.aShortArray879;
		int[] var8 = new int[this.anInt8184];
		int var9 = 0;
		while (var9 < this.anInt8184) {
			var8[var9] = var9++;
		}
		long[] var54 = new long[this.anInt8184];
		boolean var10 = (this.anInt8172 & 0x100) != 0;
		int var11;
		int var14;
		byte var17;
		int var60;
		short var65;
		for (var11 = 0; var11 < this.anInt8184; var11++) {
			int var12 = var8[var11];
			Class56 var13 = null;
			var14 = 0;
			byte var15 = 0;
			byte var16 = 0;
			var17 = 0;
			if (arg1.aClass94Array908 != null) {
				boolean var18 = false;
				for (int var19 = 0; var19 < arg1.aClass94Array908.length; var19++) {
					Class94 var20 = arg1.aClass94Array908[var19];
					if (var12 == var20.anInt848) {
						Class207 var21 = Class511.method6180(var20.anInt850, (byte) 119);
						if (var21.aBoolean1948) {
							var18 = true;
						}
						if (var21.anInt1950 != -1) {
							Class56 var22 = var7.method221(var21.anInt1950, 2051030540);
							if (var22.aClass369_524 == Class369.aClass369_6817) {
								this.aBoolean8228 = true;
							}
						}
					}
				}
				if (var18) {
					var54[var11] = Long.MAX_VALUE;
				}
			}
			var65 = -1;
			if (arg1.aShortArray896 != null) {
				var65 = arg1.aShortArray896[var12];
				if (var65 != -1) {
					var13 = var7.method221(var65 & 0xFFFF, 1516633017);
					if ((arg5 & 0x40) != 0 && var13.aBoolean533) {
						var65 = -1;
					} else {
						var16 = var13.aByte525;
						var17 = var13.aByte526;
					}
				}
			}
			boolean var68 = this.aByteArray8200 != null && this.aByteArray8200[var12] != 0 || var13 != null && var13.aClass369_524 == Class369.aClass369_6817;
			if ((var10 || var68) && this.aByteArray8203 != null) {
				var14 += this.aByteArray8203[var12] << 17;
			}
			if (var68) {
				var14 += 65536;
			}
			var14 += (var16 & 0xFF) << 8;
			var14 += var17 & 0xFF;
			var60 = var15 + ((var65 & 0xFFFF) << 16);
			int var61 = var60 + (var11 & 0xFFFF);
			var54[var11] = ((long) var14 << 32) + (long) var61;
			this.aBoolean8228 |= var68;
		}
		Class390.method4600(var54, var8, (byte) 4);
		if (arg1.aClass94Array908 != null) {
			this.anInt8215 = arg1.aClass94Array908.length;
			this.aClass20Array8216 = new Class20[this.anInt8215];
			this.aClass10Array8211 = new Class10[this.anInt8215];
			for (var11 = 0; var11 < arg1.aClass94Array908.length; var11++) {
				Class94 var56 = arg1.aClass94Array908[var11];
				Class207 var58 = Class511.method6180(var56.anInt850, (byte) 91);
				var14 = Console.anIntArray4263[arg1.aShortArray873[var56.anInt848] & 0xFFFF] & 0xFFFFFF;
				var14 |= 255 - (arg1.aByteArray876 == null ? 0 : arg1.aByteArray876[var56.anInt848] & 0xFF) << 24;
				this.aClass20Array8216[var11] = new Class20(var56.anInt848, arg1.aShortArray888[var56.anInt848], arg1.aShortArray907[var56.anInt848], arg1.aShortArray883[var56.anInt848], var58.anInt1945, var58.anInt1946, var58.anInt1950, var58.anInt1941, var58.anInt1947, var58.aBoolean1948, var56.anInt849);
				this.aClass10Array8211[var11] = new Class10(var14);
			}
		}
		this.aFloatArrayArray8188 = new float[this.anInt8184][];
		this.aFloatArrayArray8189 = new float[this.anInt8184][];
		Class97 var55 = this.method4444(arg1, var8, this.anInt8184);
		Class6 var57 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		float[] var59 = var57.aFloatArray97;
		boolean var63 = false;
		int var64;
		for (var60 = 0; var60 < this.anInt8184; var60++) {
			var64 = var8[var60];
			if (arg1.aByteArray887 == null) {
				var17 = -1;
			} else {
				var17 = arg1.aByteArray887[var64];
			}
			var65 = arg1.aShortArray896 == null ? -1 : arg1.aShortArray896[var64];
			if (var65 != -1 && (arg5 & 0x40) != 0) {
				Class56 var69 = var7.method221(var65 & 0xFFFF, 1617049978);
				if (var69.aBoolean533) {
					var65 = -1;
				}
			}
			if (var65 != -1) {
				var63 = true;
				float[] var70 = this.aFloatArrayArray8188[var64] = new float[3];
				float[] var71 = this.aFloatArrayArray8189[var64] = new float[3];
				boolean var73 = false;
				if (var17 == -1) {
					var70[0] = 0.0F;
					var71[0] = 1.0F;
					var70[1] = 1.0F;
					var71[1] = 1.0F;
					var70[2] = 0.0F;
					var71[2] = 0.0F;
				} else {
					int var66 = var17 & 0xFF;
					byte var74 = arg1.aByteArray894[var66];
					short var23;
					short var24;
					short var25;
					float var31;
					float var32;
					float var33;
					float var43;
					float var44;
					float var45;
					float var46;
					float var47;
					float var48;
					if (var74 == 0) {
						var23 = this.aShortArray8173[var64];
						var24 = this.aShortArray8186[var64];
						var25 = this.aShortArray8217[var64];
						short var26 = arg1.aShortArray895[var66];
						short var27 = arg1.aShortArray903[var66];
						short var28 = arg1.aShortArray886[var66];
						float var29 = (float) this.anIntArray8238[var26];
						float var30 = (float) this.anIntArray8195[var26];
						var31 = this.anIntArray8180[var26];
						var32 = (float) this.anIntArray8238[var27] - var29;
						var33 = (float) this.anIntArray8195[var27] - var30;
						float var34 = (float) this.anIntArray8180[var27] - var31;
						float var35 = (float) this.anIntArray8238[var28] - var29;
						float var36 = (float) this.anIntArray8195[var28] - var30;
						float var37 = (float) this.anIntArray8180[var28] - var31;
						float var38 = (float) this.anIntArray8238[var23] - var29;
						float var39 = (float) this.anIntArray8195[var23] - var30;
						float var40 = (float) this.anIntArray8180[var23] - var31;
						float var41 = (float) this.anIntArray8238[var24] - var29;
						float var42 = (float) this.anIntArray8195[var24] - var30;
						var43 = (float) this.anIntArray8180[var24] - var31;
						var44 = (float) this.anIntArray8238[var25] - var29;
						var45 = (float) this.anIntArray8195[var25] - var30;
						var46 = (float) this.anIntArray8180[var25] - var31;
						var47 = var33 * var37 - var34 * var36;
						var48 = var34 * var35 - var32 * var37;
						float var49 = var32 * var36 - var33 * var35;
						float var50 = var36 * var49 - var37 * var48;
						float var51 = var37 * var47 - var35 * var49;
						float var52 = var35 * var48 - var36 * var47;
						float var53 = 1.0F / (var50 * var32 + var51 * var33 + var52 * var34);
						var70[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
						var70[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
						var70[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
						float var90 = var33 * var49 - var34 * var48;
						float var91 = var34 * var47 - var32 * var49;
						float var92 = var32 * var48 - var33 * var47;
						float var93 = 1.0F / (var90 * var35 + var91 * var36 + var92 * var37);
						var71[0] = (var90 * var38 + var91 * var39 + var92 * var40) * var93;
						var71[1] = (var90 * var41 + var91 * var42 + var92 * var43) * var93;
						var71[2] = (var90 * var44 + var91 * var45 + var92 * var46) * var93;
					} else {
						var23 = this.aShortArray8173[var64];
						var24 = this.aShortArray8186[var64];
						var25 = this.aShortArray8217[var64];
						int var75 = var55.anIntArray867[var66];
						int var76 = var55.anIntArray870[var66];
						int var77 = var55.anIntArray869[var66];
						float[] var78 = var55.aFloatArrayArray868[var66];
						byte var79 = arg1.aByteArray905[var66];
						var31 = (float) arg1.anIntArray901[var66] / 256.0F;
						if (var74 == 1) {
							var32 = (float) arg1.anIntArray900[var66] / 1024.0F;
							this.method4492(this.anIntArray8238[var23], this.anIntArray8195[var23], this.anIntArray8180[var23], var75, var76, var77, var78, var32, var79, var31, var59);
							var70[0] = var59[0];
							var71[0] = var59[1];
							this.method4492(this.anIntArray8238[var24], this.anIntArray8195[var24], this.anIntArray8180[var24], var75, var76, var77, var78, var32, var79, var31, var59);
							var70[1] = var59[0];
							var71[1] = var59[1];
							this.method4492(this.anIntArray8238[var25], this.anIntArray8195[var25], this.anIntArray8180[var25], var75, var76, var77, var78, var32, var79, var31, var59);
							var70[2] = var59[0];
							var71[2] = var59[1];
							var33 = var32 / 2.0F;
							if ((var79 & 0x1) == 0) {
								if (var70[1] - var70[0] > var33) {
									var70[1] -= var32;
								} else if (var70[0] - var70[1] > var33) {
									var70[1] += var32;
								}
								if (var70[2] - var70[0] > var33) {
									var70[2] -= var32;
								} else if (var70[0] - var70[2] > var33) {
									var70[2] += var32;
								}
							} else {
								if (var71[1] - var71[0] > var33) {
									var71[1] -= var32;
								} else if (var71[0] - var71[1] > var33) {
									var71[1] += var32;
								}
								if (var71[2] - var71[0] > var33) {
									var71[2] -= var32;
								} else if (var71[0] - var71[2] > var33) {
									var71[2] += var32;
								}
							}
						} else if (var74 == 2) {
							var32 = (float) arg1.anIntArray902[var66] / 256.0F;
							var33 = (float) arg1.anIntArray872[var66] / 256.0F;
							int var80 = this.anIntArray8238[var24] - this.anIntArray8238[var23];
							int var81 = this.anIntArray8195[var24] - this.anIntArray8195[var23];
							int var82 = this.anIntArray8180[var24] - this.anIntArray8180[var23];
							int var83 = this.anIntArray8238[var25] - this.anIntArray8238[var23];
							int var84 = this.anIntArray8195[var25] - this.anIntArray8195[var23];
							int var85 = this.anIntArray8180[var25] - this.anIntArray8180[var23];
							int var86 = var81 * var85 - var84 * var82;
							int var87 = var82 * var83 - var85 * var80;
							int var88 = var80 * var84 - var83 * var81;
							var43 = 64.0F / (float) arg1.anIntArray898[var66];
							var44 = 64.0F / (float) arg1.anIntArray899[var66];
							var45 = 64.0F / (float) arg1.anIntArray900[var66];
							var46 = ((float) var86 * var78[0] + (float) var87 * var78[1] + (float) var88 * var78[2]) / var43;
							var47 = ((float) var86 * var78[3] + (float) var87 * var78[4] + (float) var88 * var78[5]) / var44;
							var48 = ((float) var86 * var78[6] + (float) var87 * var78[7] + (float) var88 * var78[8]) / var45;
							int var89 = this.method4442(var46, var47, var48);
							this.method4443(this.anIntArray8238[var23], this.anIntArray8195[var23], this.anIntArray8180[var23], var75, var76, var77, var89, var78, var79, var31, var32, var33, var59);
							var70[0] = var59[0];
							var71[0] = var59[1];
							this.method4443(this.anIntArray8238[var24], this.anIntArray8195[var24], this.anIntArray8180[var24], var75, var76, var77, var89, var78, var79, var31, var32, var33, var59);
							var70[1] = var59[0];
							var71[1] = var59[1];
							this.method4443(this.anIntArray8238[var25], this.anIntArray8195[var25], this.anIntArray8180[var25], var75, var76, var77, var89, var78, var79, var31, var32, var33, var59);
							var70[2] = var59[0];
							var71[2] = var59[1];
						} else if (var74 == 3) {
							this.method4441(this.anIntArray8238[var23], this.anIntArray8195[var23], this.anIntArray8180[var23], var75, var76, var77, var78, var79, var31, var59);
							var70[0] = var59[0];
							var71[0] = var59[1];
							this.method4441(this.anIntArray8238[var24], this.anIntArray8195[var24], this.anIntArray8180[var24], var75, var76, var77, var78, var79, var31, var59);
							var70[1] = var59[0];
							var71[1] = var59[1];
							this.method4441(this.anIntArray8238[var25], this.anIntArray8195[var25], this.anIntArray8180[var25], var75, var76, var77, var78, var79, var31, var59);
							var70[2] = var59[0];
							var71[2] = var59[1];
							int var10002;
							/*if ((var79 & 0x1) == 0) {
								if (var70[1] - var70[0] > 0.5F) {
									var10002 = var70[1]--;
								} else if (var70[0] - var70[1] > 0.5F) {
									var10002 = var70[1]++;
								}
								if (var70[2] - var70[0] > 0.5F) {
									var10002 = var70[2]--;
								} else if (var70[0] - var70[2] > 0.5F) {
									var10002 = var70[2]++;
								}
							} else {
								if (var71[1] - var71[0] > 0.5F) {
									var10002 = var71[1]--;
								} else if (var71[0] - var71[1] > 0.5F) {
									var10002 = var71[1]++;
								}
								if (var71[2] - var71[0] > 0.5F) {
									var10002 = var71[2]--;
								} else if (var71[0] - var71[2] > 0.5F) {
									var10002 = var71[2]++;
								}
							}*/
						}
					}
				}
			}
		}
		if (!var63) {
			this.aFloatArrayArray8189 = null;
			this.aFloatArrayArray8188 = null;
		}
		if (arg1.anIntArray880 != null && (this.anInt8172 & 0x20) != 0) {
			this.anIntArrayArray8205 = arg1.method1197(true);
		}
		if (arg1.anIntArray890 != null && (this.anInt8172 & 0x180) != 0) {
			this.anIntArrayArray8206 = arg1.method1192();
		}
		if (arg1.aClass94Array908 != null && (this.anInt8172 & 0x400) != 0) {
			this.anIntArrayArray8218 = arg1.method1193();
		}
		if (arg1.aShortArray896 == null) {
			this.aShortArray8201 = null;
		} else {
			this.aShortArray8201 = new short[this.anInt8184];
			boolean var62 = false;
			for (var64 = 0; var64 < this.anInt8184; var64++) {
				short var67 = arg1.aShortArray896[var64];
				if (var67 == -1) {
					this.aShortArray8201[var64] = -1;
				} else {
					Class56 var72 = this.aClass_ra_Sub3_8165.anInterface_ma4227.method221(var67, -1249236205);
					if ((arg5 & 0x40) != 0 && var72.aBoolean533) {
						this.aShortArray8201[var64] = -1;
					} else {
						this.aShortArray8201[var64] = var67;
						var62 = true;
						if (var72.aClass369_524 == Class369.aClass369_6817) {
							this.aBoolean8228 = true;
						}
						if (var72.aByte531 != 0 || var72.aByte530 != 0) {
							this.aBoolean8229 = true;
						}
					}
				}
			}
			if (!var62) {
				this.aShortArray8201 = null;
			}
		}
		if (this.aBoolean8228 || this.aClass20Array8216 != null) {
			this.aShortArray8204 = new short[this.anInt8184];
			for (var60 = 0; var60 < this.anInt8184; var60++) {
				this.aShortArray8204[var60] = (short) var8[var60];
			}
		}
	}

	public Class387_Sub3(Class_ra_Sub3 arg0) {
		this.aClass_ra_Sub3_8165 = arg0;
	}

	public void method4488(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8242 == null) {
			return;
		}
		Class6 var4 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		Class247 var5 = var4.aClass247_98;
		var5.method2454(arg0);
		if (arg2) {
			var5.method2459();
		}
		Class249 var6 = var4.aClass249_99;
		var6.method2508(var5);
		float[] var7 = new float[3];
		for (int var8 = 0; var8 < this.anInt8185; var8++) {
			if ((arg1 & this.aShortArray8242[var8]) != 0) {
				var6.method2511((float) this.anIntArray8238[var8], (float) this.anIntArray8195[var8], (float) this.anIntArray8180[var8], var7);
				this.anIntArray8238[var8] = (int) var7[0];
				this.anIntArray8195[var8] = (int) var7[1];
				this.anIntArray8180[var8] = (int) var7[2];
			}
		}
	}

	public void method4529(Class6 arg0) {
		this.aClass38_8164 = arg0.aClass38_94;
		if (arg0 == this.aClass6_8162) {
			return;
		}
		this.aClass6_8162 = arg0;
		this.anIntArray8231 = this.aClass6_8162.anIntArray123;
		this.aFloatArray8232 = this.aClass6_8162.aFloatArray117;
		this.aFloatArray8233 = this.aClass6_8162.aFloatArray103;
		this.aFloatArray8234 = this.aClass6_8162.aFloatArray120;
		this.aFloatArray8235 = this.aClass6_8162.aFloatArray105;
		this.anIntArray8177 = this.aClass6_8162.anIntArray106;
		this.anIntArray8178 = this.aClass6_8162.anIntArray107;
		this.anIntArray8179 = this.aClass6_8162.anIntArray108;
		this.anIntArray8239 = this.aClass6_8162.anIntArray109;
		this.anIntArray8240 = this.aClass6_8162.anIntArray110;
		this.anIntArray8241 = this.aClass6_8162.anIntArray96;
	}

	public void method4530(Thread arg0) {
		Class6 var2 = this.aClass_ra_Sub3_8165.method5206(arg0);
		if (var2 != this.aClass6_8163) {
			this.aClass6_8163 = var2;
			this.aClass387_Sub3Array8170 = this.aClass6_8163.aClass387_Sub3Array121;
			this.aClass387_Sub3Array8243 = this.aClass6_8163.aClass387_Sub3Array102;
		}
	}

	public void method4531() {
		this.aClass21Array8182 = new Class21[this.anInt8185];
		int var1;
		for (var1 = 0; var1 < this.anInt8185; var1++) {
			this.aClass21Array8182[var1] = new Class21();
		}
		for (var1 = 0; var1 < this.anInt8184; var1++) {
			short var2 = this.aShortArray8173[var1];
			short var3 = this.aShortArray8186[var1];
			short var4 = this.aShortArray8217[var1];
			int var5 = this.anIntArray8238[var3] - this.anIntArray8238[var2];
			int var6 = this.anIntArray8195[var3] - this.anIntArray8195[var2];
			int var7 = this.anIntArray8180[var3] - this.anIntArray8180[var2];
			int var8 = this.anIntArray8238[var4] - this.anIntArray8238[var2];
			int var9 = this.anIntArray8195[var4] - this.anIntArray8195[var2];
			int var10 = this.anIntArray8180[var4] - this.anIntArray8180[var2];
			int var11 = var6 * var10 - var9 * var7;
			int var12 = var7 * var8 - var10 * var5;
			int var13;
			for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 0x1) {
				var11 >>= 0x1;
				var12 >>= 0x1;
			}
			int var14 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
			if (var14 <= 0) {
				var14 = 1;
			}
			var11 = var11 * 256 / var14;
			var12 = var12 * 256 / var14;
			var13 = var13 * 256 / var14;
			byte var15;
			if (this.aByteArray8230 == null) {
				var15 = 0;
			} else {
				var15 = this.aByteArray8230[var1];
			}
			if (var15 == 0) {
				Class21 var16 = this.aClass21Array8182[var2];
				var16.anInt252 += var11;
				var16.anInt253 += var12;
				var16.anInt254 += var13;
				var16.anInt255++;
				Class21 var17 = this.aClass21Array8182[var3];
				var17.anInt252 += var11;
				var17.anInt253 += var12;
				var17.anInt254 += var13;
				var17.anInt255++;
				Class21 var18 = this.aClass21Array8182[var4];
				var18.anInt252 += var11;
				var18.anInt253 += var12;
				var18.anInt254 += var13;
				var18.anInt255++;
			} else if (var15 == 1) {
				if (this.aClass25Array8197 == null) {
					this.aClass25Array8197 = new Class25[this.anInt8184];
				}
				Class25 var19 = this.aClass25Array8197[var1] = new Class25();
				var19.anInt306 = var11;
				var19.anInt307 = var12;
				var19.anInt308 = var13;
			}
		}
	}

	public void method4532(boolean arg0) {
		if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				this.method4549(arg0);
			}
		} else {
			this.method4549(arg0);
		}
	}

	@ObfuscatedName("Class387_Sub3.PA(IIII)V")
	public void PA(int arg0, int arg1, int arg2, int arg3) {
		if ((this.anInt8172 & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		int var5;
		for (var5 = 0; var5 < this.anInt8184; var5++) {
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
		if (this.aClass20Array8216 != null) {
			for (var5 = 0; var5 < this.anInt8215; var5++) {
				Class20 var10 = this.aClass20Array8216[var5];
				Class10 var11 = this.aClass10Array8211[var5];
				var11.anInt163 = var11.anInt163 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var10.modelColorIndex] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4473(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var18;
		int var19;
		int var20;
		if (arg0 == 0) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var9 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					int[] var12 = this.anIntArrayArray8205[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8209 += this.anIntArray8238[var14];
						this.anInt8219 += this.anIntArray8195[var14];
						this.anInt8221 += this.anIntArray8180[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8209 = this.anInt8209 / var9 + var18;
				this.anInt8219 = this.anInt8219 / var9 + var19;
				this.anInt8221 = this.anInt8221 / var9 + var20;
			} else {
				this.anInt8209 = var18;
				this.anInt8219 = var19;
				this.anInt8221 = var20;
			}
			return;
		}
		int[] var21;
		int var23;
		if (arg0 == 1) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] += var18;
						this.anIntArray8195[var13] += var19;
						this.anIntArray8180[var13] += var20;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					if ((arg5 & 0x1) == 0) {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					} else {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					}
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] -= this.anInt8209;
						this.anIntArray8195[var13] -= this.anInt8219;
						this.anIntArray8180[var13] -= this.anInt8221;
						this.anIntArray8238[var13] = this.anIntArray8238[var13] * arg2 / 128;
						this.anIntArray8195[var13] = this.anIntArray8195[var13] * arg3 / 128;
						this.anIntArray8180[var13] = this.anIntArray8180[var13] * arg4 / 128;
						this.anIntArray8238[var13] += this.anInt8209;
						this.anIntArray8195[var13] += this.anInt8219;
						this.anIntArray8180[var13] += this.anInt8221;
					}
				}
			}
		} else {
			Class20 var22;
			Class10 var24;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8206.length) {
							var21 = this.anIntArrayArray8206[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var13 = var21[var23];
								var14 = (this.aByteArray8200[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8200[var13] = (byte) var14;
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var9 = 0; var9 < this.anInt8215; var9++) {
							var22 = this.aClass20Array8216[var9];
							var24 = this.aClass10Array8211[var9];
							var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var25;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.anInt159 = (var25.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var25.anInt157 = (var25.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.aFloat154 = var25.aFloat154 * (float) arg2 / 128.0F;
									var25.aFloat155 = var25.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8218.length) {
							var21 = this.anIntArrayArray8218[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var25 = this.aClass10Array8211[var21[var23]];
								var25.anInt158 = (var25.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8206.length) {
						var21 = this.anIntArrayArray8206[var10];
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							int var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3;
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
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var9 = 0; var9 < this.anInt8215; var9++) {
						var22 = this.aClass20Array8216[var9];
						var24 = this.aClass10Array8211[var9];
						var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
					}
				}
			}
		}
	}

	public int method4533(int arg0, int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	public void method4534() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.anInt8174; var2++) {
				int var3 = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = -var3;
			}
			this.method4540();
		}
	}

	public void method4490(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub3 var6 = (Class387_Sub3) arg0;
		if ((this.anInt8172 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((var6.anInt8172 & 0x10000) == 65536) {
			this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
			this.method4547();
			this.method4551();
			var6.method4547();
			var6.method4551();
			anInt8175++;
			int var7 = 0;
			int[] var8 = var6.anIntArray8238;
			int var9 = var6.anInt8185;
			int var10;
			for (var10 = 0; var10 < this.anInt8185; var10++) {
				Class21 var11 = this.aClass21Array8182[var10];
				if (var11.anInt255 != 0) {
					int var12 = this.anIntArray8195[var10] - arg2;
					if (var12 >= var6.aShort8214 && var12 <= var6.aShort8223) {
						int var13 = this.anIntArray8238[var10] - arg1;
						if (var13 >= var6.aShort8224 && var13 <= var6.aShort8225) {
							int var14 = this.anIntArray8180[var10] - arg3;
							if (var14 >= var6.aShort8226 && var14 <= var6.aShort8227) {
								for (int var15 = 0; var15 < var9; var15++) {
									Class21 var16 = var6.aClass21Array8182[var15];
									if (var13 == var8[var15] && var14 == var6.anIntArray8180[var15] && var12 == var6.anIntArray8195[var15] && var16.anInt255 != 0) {
										if (this.aClass21Array8183 == null) {
											this.aClass21Array8183 = new Class21[this.anInt8185];
										}
										if (var6.aClass21Array8183 == null) {
											var6.aClass21Array8183 = new Class21[var9];
										}
										Class21 var17 = this.aClass21Array8183[var10];
										if (var17 == null) {
											var17 = this.aClass21Array8183[var10] = new Class21(var11);
										}
										Class21 var18 = var6.aClass21Array8183[var15];
										if (var18 == null) {
											var18 = var6.aClass21Array8183[var15] = new Class21(var16);
										}
										var17.anInt252 += var16.anInt252;
										var17.anInt253 += var16.anInt253;
										var17.anInt254 += var16.anInt254;
										var17.anInt255 += var16.anInt255;
										var18.anInt252 += var11.anInt252;
										var18.anInt253 += var11.anInt253;
										var18.anInt254 += var11.anInt254;
										var18.anInt255 += var11.anInt255;
										var7++;
										this.anIntArray8239[var10] = anInt8175;
										this.anIntArray8240[var15] = anInt8175;
									}
								}
							}
						}
					}
				}
			}
			if (var7 >= 3 && arg4) {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					if (this.anIntArray8239[this.aShortArray8173[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8186[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8217[var10]] == anInt8175) {
						if (this.aByteArray8230 == null) {
							this.aByteArray8230 = new byte[this.anInt8184];
						}
						this.aByteArray8230[var10] = 2;
					}
				}
				for (var10 = 0; var10 < var6.anInt8184; var10++) {
					if (this.anIntArray8240[var6.aShortArray8173[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8186[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8217[var10]] == anInt8175) {
						if (var6.aByteArray8230 == null) {
							var6.aByteArray8230 = new byte[var6.anInt8184];
						}
						var6.aByteArray8230[var10] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	public void method4535() {
		for (int var1 = 0; var1 < this.anInt8184; var1++) {
			short var2 = this.aShortArray8201 == null ? -1 : this.aShortArray8201[var1];
			if (var2 == -1) {
				int var3 = this.modelColors[var1] & 0xFFFF;
				int var4 = (var3 & 0x7F) * this.anInt8236 >> 7;
				short var5 = Class356.modifyColor(var3 & 0xFFFFFF80 | var4, (byte) 1);
				int var6;
				if (this.anIntArray8192[var1] == -1) {
					var6 = this.anIntArray8190[var1] & 0xFFFE0000;
					this.anIntArray8190[var1] = var6 | Class330_Sub26_Sub1.method3395(var5, var6 >> 17, -866457710);
				} else if (this.anIntArray8192[var1] != -2) {
					var6 = this.anIntArray8190[var1] & 0xFFFE0000;
					this.anIntArray8190[var1] = var6 | Class330_Sub26_Sub1.method3395(var5, var6 >> 17, -1475304128);
					var6 = this.anIntArray8191[var1] & 0xFFFE0000;
					this.anIntArray8191[var1] = var6 | Class330_Sub26_Sub1.method3395(var5, var6 >> 17, -2144126028);
					var6 = this.anIntArray8192[var1] & 0xFFFE0000;
					this.anIntArray8192[var1] = var6 | Class330_Sub26_Sub1.method3395(var5, var6 >> 17, -430594482);
				}
			}
		}
		this.anInt8196 = 2;
	}

	public void method4475(Class247 arg0, Class80 arg1, int arg2) {
		this.method4541(arg0, arg1, arg2);
	}

	public Class387 method4536(Class387_Sub3 arg0, Class387_Sub3 arg1, int arg2, boolean arg3, boolean arg4) {
		arg0.aBoolean8187 = this.aBoolean8187;
		if (this.aBoolean8187) {
			arg0.aShort8225 = this.aShort8225;
			arg0.aShort8223 = this.aShort8223;
			arg0.aShort8227 = this.aShort8227;
			arg0.aShort8224 = this.aShort8224;
			arg0.aShort8214 = this.aShort8214;
			arg0.aShort8226 = this.aShort8226;
			arg0.aShort8220 = this.aShort8220;
			arg0.aShort8198 = this.aShort8198;
		}
		arg0.anInt8236 = this.anInt8236;
		arg0.anInt8176 = this.anInt8176;
		arg0.anInt8174 = this.anInt8174;
		arg0.anInt8185 = this.anInt8185;
		arg0.anInt8184 = this.anInt8184;
		arg0.anInt8215 = this.anInt8215;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean8228 = this.aBoolean8228;
		} else {
			arg0.aBoolean8228 = true;
		}
		arg0.aBoolean8229 = this.aBoolean8229;
		boolean var6 = (arg2 & 0x7) == 7 | (arg2 & 0x20) != 0;
		boolean var7 = var6 || (arg2 & 0x1) != 0;
		boolean var8 = var6 || (arg2 & 0x2) != 0;
		boolean var9 = var6 || (arg2 & 0x4) != 0 || (arg2 & 0x10) != 0;
		int var10;
		if (var7 || var8 || var9) {
			if (var7) {
				if (arg1.anIntArray8238 == null || arg1.anIntArray8238.length < this.anInt8174) {
					arg0.anIntArray8238 = arg1.anIntArray8238 = new int[this.anInt8174];
				} else {
					arg0.anIntArray8238 = arg1.anIntArray8238;
				}
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					arg0.anIntArray8238[var10] = this.anIntArray8238[var10];
				}
			} else {
				arg0.anIntArray8238 = this.anIntArray8238;
			}
			if (var8) {
				if (arg1.anIntArray8195 == null || arg1.anIntArray8195.length < this.anInt8174) {
					arg0.anIntArray8195 = arg1.anIntArray8195 = new int[this.anInt8174];
				} else {
					arg0.anIntArray8195 = arg1.anIntArray8195;
				}
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					arg0.anIntArray8195[var10] = this.anIntArray8195[var10];
				}
			} else {
				arg0.anIntArray8195 = this.anIntArray8195;
			}
			if (var9) {
				if (arg1.anIntArray8180 == null || arg1.anIntArray8180.length < this.anInt8174) {
					arg0.anIntArray8180 = arg1.anIntArray8180 = new int[this.anInt8174];
				} else {
					arg0.anIntArray8180 = arg1.anIntArray8180;
				}
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					arg0.anIntArray8180[var10] = this.anIntArray8180[var10];
				}
			} else {
				arg0.anIntArray8180 = this.anIntArray8180;
			}
		} else {
			arg0.anIntArray8238 = this.anIntArray8238;
			arg0.anIntArray8195 = this.anIntArray8195;
			arg0.anIntArray8180 = this.anIntArray8180;
		}
		if ((arg2 & 0x84080) == 0) {
			arg0.modelColors = this.modelColors;
		} else {
			if (arg1.modelColors == null || arg1.modelColors.length < this.anInt8184) {
				var10 = this.anInt8184;
				arg0.modelColors = arg1.modelColors = new short[var10];
			} else {
				arg0.modelColors = arg1.modelColors;
			}
			for (var10 = 0; var10 < this.anInt8184; var10++) {
				arg0.modelColors[var10] = this.modelColors[var10];
			}
		}
		if ((arg2 & 0x97018) != 0) {
			arg0.anInt8196 = 0;
			arg0.anIntArray8192 = null;
			arg0.anIntArray8191 = null;
			arg0.anIntArray8190 = null;
		} else if ((arg2 & 0x80) == 0) {
			if (arg4) {
				this.method4532(false);
			}
			arg0.anIntArray8190 = this.anIntArray8190;
			arg0.anIntArray8191 = this.anIntArray8191;
			arg0.anIntArray8192 = this.anIntArray8192;
			arg0.anInt8196 = this.anInt8196;
		} else {
			if (arg4) {
				this.method4532(false);
			}
			if (this.anIntArray8190 != null) {
				if (arg1.anIntArray8190 == null || arg1.anIntArray8190.length < this.anInt8184) {
					var10 = this.anInt8184;
					arg0.anIntArray8190 = arg1.anIntArray8190 = new int[var10];
					arg0.anIntArray8191 = arg1.anIntArray8191 = new int[var10];
					arg0.anIntArray8192 = arg1.anIntArray8192 = new int[var10];
				} else {
					arg0.anIntArray8190 = arg1.anIntArray8190;
					arg0.anIntArray8191 = arg1.anIntArray8191;
					arg0.anIntArray8192 = arg1.anIntArray8192;
				}
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					arg0.anIntArray8190[var10] = this.anIntArray8190[var10];
					arg0.anIntArray8191[var10] = this.anIntArray8191[var10];
					arg0.anIntArray8192[var10] = this.anIntArray8192[var10];
				}
			}
			arg0.anInt8196 = this.anInt8196;
		}
		if ((arg2 & 0x100) == 0) {
			arg0.aByteArray8200 = this.aByteArray8200;
		} else {
			if (arg1.aByteArray8200 == null || arg1.aByteArray8200.length < this.anInt8184) {
				var10 = this.anInt8184;
				arg0.aByteArray8200 = arg1.aByteArray8200 = new byte[var10];
			} else {
				arg0.aByteArray8200 = arg1.aByteArray8200;
			}
			if (this.aByteArray8200 == null) {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					arg0.aByteArray8200[var10] = 0;
				}
			} else {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					arg0.aByteArray8200[var10] = this.aByteArray8200[var10];
				}
			}
		}
		if ((arg2 & 0x8) == 0 && (arg2 & 0x10) == 0) {
			if (arg4) {
				this.method4551();
			}
			arg0.aClass21Array8182 = this.aClass21Array8182;
			arg0.aClass25Array8197 = this.aClass25Array8197;
		} else {
			if (arg1.aClass21Array8182 == null || arg1.aClass21Array8182.length < this.anInt8185) {
				var10 = this.anInt8185;
				arg0.aClass21Array8182 = arg1.aClass21Array8182 = new Class21[var10];
			} else {
				arg0.aClass21Array8182 = arg1.aClass21Array8182;
			}
			if (this.aClass21Array8182 == null) {
				arg0.aClass21Array8182 = null;
			} else {
				for (var10 = 0; var10 < this.anInt8185; var10++) {
					arg0.aClass21Array8182[var10] = new Class21(this.aClass21Array8182[var10]);
				}
			}
			if (this.aClass25Array8197 == null) {
				arg0.aClass25Array8197 = null;
			} else {
				if (arg1.aClass25Array8197 == null || arg1.aClass25Array8197.length < this.anInt8184) {
					var10 = this.anInt8184;
					arg0.aClass25Array8197 = arg1.aClass25Array8197 = new Class25[var10];
				} else {
					arg0.aClass25Array8197 = arg1.aClass25Array8197;
				}
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					arg0.aClass25Array8197[var10] = this.aClass25Array8197[var10] == null ? null : new Class25(this.aClass25Array8197[var10]);
				}
			}
		}
		if ((arg2 & 0x8000) == 0) {
			arg0.aShortArray8201 = this.aShortArray8201;
		} else if (this.aShortArray8201 == null) {
			arg0.aShortArray8201 = null;
		} else {
			if (arg1.aShortArray8201 == null || arg1.aShortArray8201.length < this.anInt8184) {
				var10 = this.anInt8184;
				arg0.aShortArray8201 = arg1.aShortArray8201 = new short[var10];
			} else {
				arg0.aShortArray8201 = arg1.aShortArray8201;
			}
			for (var10 = 0; var10 < this.anInt8184; var10++) {
				arg0.aShortArray8201[var10] = this.aShortArray8201[var10];
			}
		}
		if ((arg2 & 0x10000) == 0) {
			arg0.aByteArray8230 = this.aByteArray8230;
		} else if (this.aByteArray8230 == null) {
			arg0.aByteArray8230 = null;
		} else {
			if (arg1.aByteArray8230 == null || arg1.aByteArray8230.length < this.anInt8184) {
				var10 = arg3 ? this.anInt8184 + 100 : this.anInt8184;
				arg0.aByteArray8230 = arg1.aByteArray8230 = new byte[var10];
			} else {
				arg0.aByteArray8230 = arg1.aByteArray8230;
			}
			for (var10 = 0; var10 < this.anInt8184; var10++) {
				arg0.aByteArray8230[var10] = this.aByteArray8230[var10];
			}
		}
		if ((arg2 & 0xC580) == 0) {
			arg0.aClass10Array8211 = this.aClass10Array8211;
		} else if (arg1.aClass10Array8211 == null || arg1.aClass10Array8211.length < this.anInt8215) {
			var10 = this.anInt8215;
			arg0.aClass10Array8211 = arg1.aClass10Array8211 = new Class10[var10];
			for (int var11 = 0; var11 < this.anInt8215; var11++) {
				arg0.aClass10Array8211[var11] = this.aClass10Array8211[var11].method424(-1936012664);
			}
		} else {
			arg0.aClass10Array8211 = arg1.aClass10Array8211;
			for (var10 = 0; var10 < this.anInt8215; var10++) {
				arg0.aClass10Array8211[var10].method425(this.aClass10Array8211[var10], 707409334);
			}
		}
		if (this.aFloatArrayArray8188 == null || (arg2 & 0x10) == 0) {
			arg0.aFloatArrayArray8188 = this.aFloatArrayArray8188;
			arg0.aFloatArrayArray8189 = this.aFloatArrayArray8189;
		} else {
			if (arg1.aFloatArrayArray8188 == null || arg1.aFloatArrayArray8188.length < this.anInt8184) {
				var10 = arg3 ? this.anInt8184 + 100 : this.anInt8184;
				arg0.aFloatArrayArray8188 = arg1.aFloatArrayArray8188 = new float[var10][3];
			} else {
				arg0.aFloatArrayArray8188 = arg1.aFloatArrayArray8188;
			}
			for (var10 = 0; var10 < this.anInt8184; var10++) {
				if (this.aFloatArrayArray8188[var10] != null) {
					arg0.aFloatArrayArray8188[var10][0] = this.aFloatArrayArray8188[var10][0];
					arg0.aFloatArrayArray8188[var10][1] = this.aFloatArrayArray8188[var10][1];
					arg0.aFloatArrayArray8188[var10][2] = this.aFloatArrayArray8188[var10][2];
				}
			}
			if (arg1.aFloatArrayArray8189 == null || arg1.aFloatArrayArray8189.length < this.anInt8184) {
				var10 = arg3 ? this.anInt8184 + 100 : this.anInt8184;
				arg0.aFloatArrayArray8189 = arg1.aFloatArrayArray8189 = new float[var10][3];
			} else {
				arg0.aFloatArrayArray8189 = arg1.aFloatArrayArray8189;
			}
			for (var10 = 0; var10 < this.anInt8184; var10++) {
				if (this.aFloatArrayArray8189[var10] != null) {
					arg0.aFloatArrayArray8189[var10][0] = this.aFloatArrayArray8189[var10][0];
					arg0.aFloatArrayArray8189[var10][1] = this.aFloatArrayArray8189[var10][1];
					arg0.aFloatArrayArray8189[var10][2] = this.aFloatArrayArray8189[var10][2];
				}
			}
		}
		arg0.anIntArrayArray8205 = this.anIntArrayArray8205;
		arg0.anIntArrayArray8206 = this.anIntArrayArray8206;
		arg0.anIntArrayArray8218 = this.anIntArrayArray8218;
		arg0.aShortArray8242 = this.aShortArray8242;
		arg0.aShortArray8181 = this.aShortArray8181;
		arg0.aByteArray8203 = this.aByteArray8203;
		arg0.aShortArray8173 = this.aShortArray8173;
		arg0.aShortArray8186 = this.aShortArray8186;
		arg0.aShortArray8217 = this.aShortArray8217;
		arg0.aClass93Array8213 = this.aClass93Array8213;
		arg0.aClass64Array8160 = this.aClass64Array8160;
		arg0.aClass20Array8216 = this.aClass20Array8216;
		arg0.aShortArray8204 = this.aShortArray8204;
		arg0.anInt8172 = arg2;
		return arg0;
	}

	@ObfuscatedName("Class387_Sub3.m()I")
	public int m() {
		return this.anInt8172;
	}

	@ObfuscatedName("Class387_Sub3.f(I)V")
	public void f(int arg0) {
		if ((this.anInt8172 & 0x5) != 5) {
			throw new IllegalStateException();
		} else if (arg0 == 4096) {
			this.method4534();
		} else if (arg0 == 8192) {
			this.method4537();
		} else if (arg0 == 12288) {
			this.method4538();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					int var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.method4540();
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.S(I)V")
	public void S(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.KA(I)V")
	public void KA(int arg0) {
		if (this.aClass_ra_Sub3_8165.anInt8650 <= 1) {
			if ((this.anInt8172 & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method4532(true);
			}
			this.anInt8172 = arg0;
			return;
		}
		synchronized (this) {
			if ((this.anInt8172 & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method4532(true);
			}
			this.anInt8172 = arg0;
		}
	}

	public void method4537() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.anInt8174; var2++) {
				this.anIntArray8238[var2] = -this.anIntArray8238[var2];
				this.anIntArray8180[var2] = -this.anIntArray8180[var2];
			}
			this.method4540();
		}
	}

	public void method4538() {
		synchronized (this) {
			for (int var2 = 0; var2 < this.anInt8174; var2++) {
				int var3 = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = -var3;
			}
			this.method4540();
		}
	}

	public Class64[] method4485() {
		return this.aClass64Array8160;
	}

	public void method4539() {
		synchronized (this) {
			int var2;
			for (var2 = 0; var2 < this.anInt8185; var2++) {
				this.anIntArray8238[var2] = -this.anIntArray8238[var2];
				this.anIntArray8180[var2] = -this.anIntArray8180[var2];
				if (this.aClass21Array8182[var2] != null) {
					this.aClass21Array8182[var2].anInt252 = -this.aClass21Array8182[var2].anInt252;
					this.aClass21Array8182[var2].anInt254 = -this.aClass21Array8182[var2].anInt254;
				}
			}
			if (this.aClass25Array8197 != null) {
				for (var2 = 0; var2 < this.anInt8184; var2++) {
					if (this.aClass25Array8197[var2] != null) {
						this.aClass25Array8197[var2].anInt306 = -this.aClass25Array8197[var2].anInt306;
						this.aClass25Array8197[var2].anInt308 = -this.aClass25Array8197[var2].anInt308;
					}
				}
			}
			for (var2 = this.anInt8185; var2 < this.anInt8174; var2++) {
				this.anIntArray8238[var2] = -this.anIntArray8238[var2];
				this.anIntArray8180[var2] = -this.anIntArray8180[var2];
			}
			this.anInt8196 = 0;
			this.aBoolean8187 = false;
		}
	}

	@ObfuscatedName("Class387_Sub3.e(I[IIIIZI[I)V")
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8205.length) {
					int[] var13 = this.anIntArrayArray8205[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var15]) != 0) {
							this.anInt8209 += this.anIntArray8238[var15];
							this.anInt8219 += this.anIntArray8195[var15];
							this.anInt8221 += this.anIntArray8180[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8209 = this.anInt8209 / var10 + arg2;
				this.anInt8219 = this.anInt8219 / var10 + arg3;
				this.anInt8221 = this.anInt8221 / var10 + arg4;
				this.aBoolean8212 = true;
			} else {
				this.anInt8209 = arg2;
				this.anInt8219 = arg3;
				this.anInt8221 = arg4;
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] += arg2;
							this.anIntArray8195[var14] += arg3;
							this.anIntArray8180[var14] += arg4;
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
					if (var11 < this.anIntArrayArray8205.length) {
						var47 = this.anIntArrayArray8205[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
								this.anIntArray8238[var14] -= this.anInt8209;
								this.anIntArray8195[var14] -= this.anInt8219;
								this.anIntArray8180[var14] -= this.anInt8221;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8195[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = this.anIntArray8195[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8195[var14] * var16 - this.anIntArray8180[var14] * var15 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8195[var14] * var15 + this.anIntArray8180[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8180[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8180[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								this.anIntArray8238[var14] += this.anInt8209;
								this.anIntArray8195[var14] += this.anInt8219;
								this.anIntArray8180[var14] += this.anInt8221;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean8208) {
					for (var10 = 0; var10 < this.anInt8174; var10++) {
						this.anIntArray8238[var10] <<= 0x4;
						this.anIntArray8195[var10] <<= 0x4;
						this.anIntArray8180[var10] <<= 0x4;
					}
					this.aBoolean8208 = true;
				}
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8212) {
					var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var55 = var18 + var15;
					this.anInt8209 = var51;
					this.anInt8219 = var54;
					this.anInt8221 = var55;
					this.aBoolean8212 = false;
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
				int var25 = var52[0] * -this.anInt8209 + var52[1] * -this.anInt8219 + var52[2] * -this.anInt8221 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8209 + var52[4] * -this.anInt8219 + var52[5] * -this.anInt8221 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8209 + var52[7] * -this.anInt8219 + var52[8] * -this.anInt8221 + 8192 >> 14;
				var28 = var25 + this.anInt8209;
				int var29 = var26 + this.anInt8219;
				var30 = var27 + this.anInt8221;
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
					if (var40 < this.anIntArrayArray8205.length) {
						int[] var41 = this.anIntArrayArray8205[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8238[var43] + var59[1] * this.anIntArray8195[var43] + var59[2] * this.anIntArray8180[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8238[var43] + var59[4] * this.anIntArray8195[var43] + var59[5] * this.anIntArray8180[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8238[var43] + var59[7] * this.anIntArray8195[var43] + var59[8] * this.anIntArray8180[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8238[var43] = var60;
								this.anIntArray8195[var43] = var61;
								this.anIntArray8180[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class20 var49;
			Class10 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8206.length) {
							var47 = this.anIntArrayArray8206[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
									var15 = (this.aByteArray8200[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8200[var14] = (byte) var15;
								}
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var10 = 0; var10 < this.anInt8215; var10++) {
							var49 = this.aClass20Array8216[var10];
							var50 = this.aClass10Array8211[var10];
							var50.anInt163 = var50.anInt163 & 0xFFFFFF | 255 - (this.aByteArray8200[var49.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var53;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.anInt159 += arg2;
									var53.anInt157 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.aFloat154 = var53.aFloat154 * (float) arg2 / 128.0F;
									var53.aFloat155 = var53.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8218.length) {
							var47 = this.anIntArrayArray8218[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var53 = this.aClass10Array8211[var47[var48]];
								var53.anInt158 = var53.anInt158 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8206.length) {
						var47 = this.anIntArrayArray8206[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3;
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
						}
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var10 = 0; var10 < this.anInt8215; var10++) {
						var49 = this.aClass20Array8216[var10];
						var50 = this.aClass10Array8211[var10];
						var50.anInt163 = var50.anInt163 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var49.modelColorIndex] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] -= this.anInt8209;
							this.anIntArray8195[var14] -= this.anInt8219;
							this.anIntArray8180[var14] -= this.anInt8221;
							this.anIntArray8238[var14] = this.anIntArray8238[var14] * arg2 / 128;
							this.anIntArray8195[var14] = this.anIntArray8195[var14] * arg3 / 128;
							this.anIntArray8180[var14] = this.anIntArray8180[var14] * arg4 / 128;
							this.anIntArray8238[var14] += this.anInt8209;
							this.anIntArray8195[var14] += this.anInt8219;
							this.anIntArray8180[var14] += this.anInt8221;
						}
					}
				}
			}
		} else {
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (this.aBoolean8212) {
				var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8209 = var16;
				this.anInt8219 = var17;
				this.anInt8221 = var18;
				this.aBoolean8212 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8209 + 8192 >> 14;
			var20 = var17 * -this.anInt8219 + 8192 >> 14;
			var21 = var18 * -this.anInt8221 + 8192 >> 14;
			var22 = var19 + this.anInt8209;
			var23 = var20 + this.anInt8219;
			var24 = var21 + this.anInt8221;
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
				if (var34 < this.anIntArrayArray8205.length) {
					var59 = this.anIntArrayArray8205[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8238[var37] + var57[1] * this.anIntArray8195[var37] + var57[2] * this.anIntArray8180[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8238[var37] + var57[4] * this.anIntArray8195[var37] + var57[5] * this.anIntArray8180[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8238[var37] + var57[7] * this.anIntArray8195[var37] + var57[8] * this.anIntArray8180[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8238[var37] = var38;
							this.anIntArray8195[var37] = var39;
							this.anIntArray8180[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.t(I)V")
	public void t(int arg0) {
		if ((this.anInt8172 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var3 - this.anIntArray8180[var5] * var2 >> 14;
				this.anIntArray8180[var5] = this.anIntArray8195[var5] * var2 + this.anIntArray8180[var5] * var3 >> 14;
				this.anIntArray8195[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.EA(I)V")
	public void EA(int arg0) {
		if ((this.anInt8172 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
				this.anIntArray8195[var5] = this.anIntArray8195[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
				this.anIntArray8238[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.cv(I)V")
	public void cv(int arg0) {
		if ((this.anInt8172 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt8236 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.oa(III)V")
	public void oa(int arg0, int arg1, int arg2) {
		if (arg0 != 128 && (this.anInt8172 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 128 && (this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 128 || (this.anInt8172 & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] = this.anIntArray8238[var5] * arg0 >> 7;
					this.anIntArray8195[var5] = this.anIntArray8195[var5] * arg1 >> 7;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * arg2 >> 7;
				}
				this.aBoolean8187 = false;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("Class387_Sub3.el()Z")
	public boolean el() {
		return this.aBoolean8228;
	}

	public void method4540() {
		this.aClass21Array8182 = null;
		this.aClass21Array8183 = null;
		this.aClass25Array8197 = null;
		this.aBoolean8187 = false;
	}

	public Class387 method4446(byte arg0, int arg1, boolean arg2) {
		this.method4530(Thread.currentThread());
		boolean var4 = false;
		Class387_Sub3 var5;
		Class387_Sub3 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass387_Sub3Array8243[arg0 - 1];
			var5 = this.aClass387_Sub3Array8170[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub3(this.aClass_ra_Sub3_8165);
		}
		return this.method4536(var5, var6, arg1, var4, arg2);
	}

	public void method4448() {
		if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				this.aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.ea()Z")
	public boolean ea() {
		if (this.anIntArrayArray8205 == null) {
			return false;
		} else {
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			return true;
		}
	}

	@ObfuscatedName("Class387_Sub3.ka()V")
	public void ka() {
		if (this.aBoolean8208) {
			for (int var1 = 0; var1 < this.anInt8174; var1++) {
				this.anIntArray8238[var1] = this.anIntArray8238[var1] + 7 >> 4;
				this.anIntArray8195[var1] = this.anIntArray8195[var1] + 7 >> 4;
				this.anIntArray8180[var1] = this.anIntArray8180[var1] + 7 >> 4;
			}
			this.aBoolean8208 = false;
		}
		if (this.aBoolean8207) {
			this.method4553();
			this.aBoolean8207 = false;
		}
		this.aBoolean8187 = false;
	}

	public void method4470(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var18;
		int var19;
		int var20;
		if (arg0 == 0) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var9 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					int[] var12 = this.anIntArrayArray8205[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8209 += this.anIntArray8238[var14];
						this.anInt8219 += this.anIntArray8195[var14];
						this.anInt8221 += this.anIntArray8180[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8209 = this.anInt8209 / var9 + var18;
				this.anInt8219 = this.anInt8219 / var9 + var19;
				this.anInt8221 = this.anInt8221 / var9 + var20;
			} else {
				this.anInt8209 = var18;
				this.anInt8219 = var19;
				this.anInt8221 = var20;
			}
			return;
		}
		int[] var21;
		int var23;
		if (arg0 == 1) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] += var18;
						this.anIntArray8195[var13] += var19;
						this.anIntArray8180[var13] += var20;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					if ((arg5 & 0x1) == 0) {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					} else {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					}
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] -= this.anInt8209;
						this.anIntArray8195[var13] -= this.anInt8219;
						this.anIntArray8180[var13] -= this.anInt8221;
						this.anIntArray8238[var13] = this.anIntArray8238[var13] * arg2 / 128;
						this.anIntArray8195[var13] = this.anIntArray8195[var13] * arg3 / 128;
						this.anIntArray8180[var13] = this.anIntArray8180[var13] * arg4 / 128;
						this.anIntArray8238[var13] += this.anInt8209;
						this.anIntArray8195[var13] += this.anInt8219;
						this.anIntArray8180[var13] += this.anInt8221;
					}
				}
			}
		} else {
			Class20 var22;
			Class10 var24;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8206.length) {
							var21 = this.anIntArrayArray8206[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var13 = var21[var23];
								var14 = (this.aByteArray8200[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8200[var13] = (byte) var14;
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var9 = 0; var9 < this.anInt8215; var9++) {
							var22 = this.aClass20Array8216[var9];
							var24 = this.aClass10Array8211[var9];
							var24.anInt163 = var24.anInt163 & 0xFFFFFF | 255 - (this.aByteArray8200[var22.modelColorIndex] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var25;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.anInt159 += arg2;
									var25.anInt157 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.aFloat154 = var25.aFloat154 * (float) arg2 / 128.0F;
									var25.aFloat155 = var25.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8218.length) {
							var21 = this.anIntArrayArray8218[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var25 = this.aClass10Array8211[var21[var23]];
								var25.anInt158 = var25.anInt158 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8206.length) {
						var21 = this.anIntArrayArray8206[var10];
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							int var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3;
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
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var9 = 0; var9 < this.anInt8215; var9++) {
						var22 = this.aClass20Array8216[var9];
						var24 = this.aClass10Array8211[var9];
						var24.anInt163 = var24.anInt163 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var22.modelColorIndex] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	public Class93[] method4483() {
		return this.aClass93Array8213;
	}

	@ObfuscatedName("Class387_Sub3.w(IIII)V")
	public void w(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var6 = 0; var6 < this.anInt8174; var6++) {
				this.anInt8209 += this.anIntArray8238[var6];
				this.anInt8219 += this.anIntArray8195[var6];
				this.anInt8221 += this.anIntArray8180[var6];
				var5++;
			}
			if (var5 > 0) {
				this.anInt8209 = this.anInt8209 / var5 + arg1;
				this.anInt8219 = this.anInt8219 / var5 + arg2;
				this.anInt8221 = this.anInt8221 / var5 + arg3;
			} else {
				this.anInt8209 = arg1;
				this.anInt8219 = arg2;
				this.anInt8221 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8174; var5++) {
				this.anIntArray8238[var5] += arg1;
				this.anIntArray8195[var5] += arg2;
				this.anIntArray8180[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] -= this.anInt8209;
					this.anIntArray8195[var5] -= this.anInt8219;
					this.anIntArray8180[var5] -= this.anInt8221;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8195[var5] * var6 + this.anIntArray8238[var5] * var7 + 16383 >> 14;
						this.anIntArray8195[var5] = this.anIntArray8195[var5] * var7 - this.anIntArray8238[var5] * var6 + 16383 >> 14;
						this.anIntArray8238[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8195[var5] * var7 - this.anIntArray8180[var5] * var6 + 16383 >> 14;
						this.anIntArray8180[var5] = this.anIntArray8195[var5] * var6 + this.anIntArray8180[var5] * var7 + 16383 >> 14;
						this.anIntArray8195[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8180[var5] * var6 + this.anIntArray8238[var5] * var7 + 16383 >> 14;
						this.anIntArray8180[var5] = this.anIntArray8180[var5] * var7 - this.anIntArray8238[var5] * var6 + 16383 >> 14;
						this.anIntArray8238[var5] = var8;
					}
					this.anIntArray8238[var5] += this.anInt8209;
					this.anIntArray8195[var5] += this.anInt8219;
					this.anIntArray8180[var5] += this.anInt8221;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] -= this.anInt8209;
					this.anIntArray8195[var5] -= this.anInt8219;
					this.anIntArray8180[var5] -= this.anInt8221;
					this.anIntArray8238[var5] = this.anIntArray8238[var5] * arg1 / 128;
					this.anIntArray8195[var5] = this.anIntArray8195[var5] * arg2 / 128;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * arg3 / 128;
					this.anIntArray8238[var5] += this.anInt8209;
					this.anIntArray8195[var5] += this.anInt8219;
					this.anIntArray8180[var5] += this.anInt8221;
				}
			} else {
				Class10 var10;
				Class20 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						var6 = (this.aByteArray8200[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8200[var5] = (byte) var6;
					}
					if (this.aClass20Array8216 != null) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var11 = this.aClass20Array8216[var5];
							var10 = this.aClass10Array8211[var5];
							var10.anInt163 = var10.anInt163 & 0xFFFFFF | 255 - (this.aByteArray8200[var11.modelColorIndex] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						var6 = this.modelColors[var5] & 0xFFFF;
						var7 = var6 >> 10 & 0x3F;
						var8 = var6 >> 7 & 0x7;
						int var9 = var6 & 0x7F;
						var7 = var7 + arg1 & 0x3F;
						var8 += arg2;
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
					this.aBoolean8207 = true;
					if (this.aClass20Array8216 != null) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var11 = this.aClass20Array8216[var5];
							var10 = this.aClass10Array8211[var5];
							var10.anInt163 = var10.anInt163 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var11.modelColorIndex] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					Class10 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.anInt159 += arg1;
							var12.anInt157 += arg2;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.aFloat154 = var12.aFloat154 * (float) arg1 / 128.0F;
							var12.aFloat155 = var12.aFloat155 * (float) arg2 / 128.0F;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.anInt158 = var12.anInt158 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	public void method4467(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub3 var6 = (Class387_Sub3) arg0;
		if ((this.anInt8172 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((var6.anInt8172 & 0x10000) == 65536) {
			this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
			this.method4547();
			this.method4551();
			var6.method4547();
			var6.method4551();
			anInt8175++;
			int var7 = 0;
			int[] var8 = var6.anIntArray8238;
			int var9 = var6.anInt8185;
			int var10;
			for (var10 = 0; var10 < this.anInt8185; var10++) {
				Class21 var11 = this.aClass21Array8182[var10];
				if (var11.anInt255 != 0) {
					int var12 = this.anIntArray8195[var10] - arg2;
					if (var12 >= var6.aShort8214 && var12 <= var6.aShort8223) {
						int var13 = this.anIntArray8238[var10] - arg1;
						if (var13 >= var6.aShort8224 && var13 <= var6.aShort8225) {
							int var14 = this.anIntArray8180[var10] - arg3;
							if (var14 >= var6.aShort8226 && var14 <= var6.aShort8227) {
								for (int var15 = 0; var15 < var9; var15++) {
									Class21 var16 = var6.aClass21Array8182[var15];
									if (var13 == var8[var15] && var14 == var6.anIntArray8180[var15] && var12 == var6.anIntArray8195[var15] && var16.anInt255 != 0) {
										if (this.aClass21Array8183 == null) {
											this.aClass21Array8183 = new Class21[this.anInt8185];
										}
										if (var6.aClass21Array8183 == null) {
											var6.aClass21Array8183 = new Class21[var9];
										}
										Class21 var17 = this.aClass21Array8183[var10];
										if (var17 == null) {
											var17 = this.aClass21Array8183[var10] = new Class21(var11);
										}
										Class21 var18 = var6.aClass21Array8183[var15];
										if (var18 == null) {
											var18 = var6.aClass21Array8183[var15] = new Class21(var16);
										}
										var17.anInt252 += var16.anInt252;
										var17.anInt253 += var16.anInt253;
										var17.anInt254 += var16.anInt254;
										var17.anInt255 += var16.anInt255;
										var18.anInt252 += var11.anInt252;
										var18.anInt253 += var11.anInt253;
										var18.anInt254 += var11.anInt254;
										var18.anInt255 += var11.anInt255;
										var7++;
										this.anIntArray8239[var10] = anInt8175;
										this.anIntArray8240[var15] = anInt8175;
									}
								}
							}
						}
					}
				}
			}
			if (var7 >= 3 && arg4) {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					if (this.anIntArray8239[this.aShortArray8173[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8186[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8217[var10]] == anInt8175) {
						if (this.aByteArray8230 == null) {
							this.aByteArray8230 = new byte[this.anInt8184];
						}
						this.aByteArray8230[var10] = 2;
					}
				}
				for (var10 = 0; var10 < var6.anInt8184; var10++) {
					if (this.anIntArray8240[var6.aShortArray8173[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8186[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8217[var10]] == anInt8175) {
						if (var6.aByteArray8230 == null) {
							var6.aByteArray8230 = new byte[var6.anInt8184];
						}
						var6.aByteArray8230[var10] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	public void method4541(Class247 arg0, Class80 arg1, int arg2) {
		if (this.anInt8185 < 1) {
			return;
		}
		Class6 var4 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		Class249 var5 = var4.aClass249_99;
		var5.method2508(arg0);
		Class249 var6 = this.aClass_ra_Sub3_8165.aClass249_8632;
		Class249 var7 = this.aClass_ra_Sub3_8165.aClass249_8633;
		if (!this.aBoolean8187) {
			this.method4547();
		}
		boolean var8 = var5.method2487();
		float[] var9 = var4.aFloatArray89;
		var5.method2511(0.0F, (float) this.aShort8214, 0.0F, var9);
		float var10 = var9[0];
		float var11 = var9[1];
		float var12 = var9[2];
		var5.method2511(0.0F, (float) this.aShort8223, 0.0F, var9);
		float var13 = var9[0];
		float var14 = var9[1];
		float var15 = var9[2];
		float var18;
		float var19;
		for (int var16 = 0; var16 < 6; var16++) {
			float[] var17 = this.aClass_ra_Sub3_8165.aFloatArrayArray8617[var16];
			var18 = var17[0] * var10 + var17[1] * var11 + var17[2] * var12 + var17[3] + (float) this.aShort8220;
			var19 = var17[0] * var13 + var17[1] * var14 + var17[2] * var15 + var17[3] + (float) this.aShort8220;
			if (var18 < 0.0F && var19 < 0.0F) {
				return;
			}
		}
		float var51;
		float var52;
		if (var8) {
			var51 = var6.aFloatArray2631[14];
			var52 = var6.aFloatArray2631[6];
		} else {
			var51 = var5.aFloatArray2631[12] * var6.aFloatArray2631[2] + var5.aFloatArray2631[13] * var6.aFloatArray2631[6] + var5.aFloatArray2631[14] * var6.aFloatArray2631[10] + var6.aFloatArray2631[14];
			var52 = var5.aFloatArray2631[4] * var6.aFloatArray2631[2] + var5.aFloatArray2631[5] * var6.aFloatArray2631[6] + var5.aFloatArray2631[6] * var6.aFloatArray2631[10];
		}
		var18 = var51 + (float) this.aShort8214 * var52;
		var19 = var51 + (float) this.aShort8223 * var52;
		float var20 = var18 > var19 ? var18 + (float) this.aShort8220 : var19 + (float) this.aShort8220;
		float var21 = var7.aFloatArray2631[10] * var20 + var7.aFloatArray2631[14];
		if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				while (this.aBoolean8161) {
					try {
						this.wait();
					} catch (InterruptedException var48) {
					}
				}
				this.aBoolean8161 = true;
			}
		}
		this.method4529(var4);
		Class249 var22 = this.aClass6_8162.aClass249_100;
		var22.method2510(var5);
		var22.method2483(this.aClass_ra_Sub3_8165.aClass249_8634);
		if ((arg2 & 0x2) == 0) {
			this.aClass38_8164.method536(false);
		} else {
			this.aClass38_8164.method536(true);
		}
		boolean var23 = false;
		this.aClass6_8162.aFloat112 = this.aClass38_8164.aFloat391;
		this.aClass6_8162.aFloat114 = this.aClass38_8164.aFloat420;
		this.aClass6_8162.aFloat116 = this.aClass38_8164.aFloat395;
		this.aClass6_8162.aFloat118 = 1.0F / this.aClass38_8164.aFloat395;
		this.aClass6_8162.aFloat113 = this.aClass38_8164.aFloat411;
		this.aClass6_8162.aFloat115 = this.aClass38_8164.aFloat392;
		this.aClass6_8162.aFloat124 = this.aClass38_8164.aFloat394;
		this.aClass6_8162.anInt119 = this.aClass38_8164.anInt396;
		int var24;
		int var26;
		int var27;
		float var31;
		for (var24 = 0; var24 < this.anInt8174; var24++) {
			int var25 = this.anIntArray8238[var24];
			var26 = this.anIntArray8195[var24];
			var27 = this.anIntArray8180[var24];
			float var28 = var22.aFloatArray2631[0] * (float) var25 + var22.aFloatArray2631[4] * (float) var26 + var22.aFloatArray2631[8] * (float) var27 + var22.aFloatArray2631[12];
			float var29 = var22.aFloatArray2631[1] * (float) var25 + var22.aFloatArray2631[5] * (float) var26 + var22.aFloatArray2631[9] * (float) var27 + var22.aFloatArray2631[13];
			float var30 = var22.aFloatArray2631[2] * (float) var25 + var22.aFloatArray2631[6] * (float) var26 + var22.aFloatArray2631[10] * (float) var27 + var22.aFloatArray2631[14];
			var31 = var22.aFloatArray2631[3] * (float) var25 + var22.aFloatArray2631[7] * (float) var26 + var22.aFloatArray2631[11] * (float) var27 + var22.aFloatArray2631[15];
			this.aFloatArray8234[var24] = this.aClass6_8162.aFloat124 + this.aClass6_8162.aFloat116 * var30 / var31;
			this.aFloatArray8235[var24] = var31;
			if (var30 >= -var31) {
				this.aFloatArray8232[var24] = (float) (this.aClass6_8162.aFloat113 + this.aClass6_8162.aFloat112 * var28 / var31);
				this.aFloatArray8233[var24] = (float) (this.aClass6_8162.aFloat115 + this.aClass6_8162.aFloat114 * var29 / var31);
			} else {
				this.aFloatArray8232[var24] = -5000.0F;
				var23 = true;
			}
			if (this.aClass6_8162.aBoolean91) {
				this.anIntArray8231[var24] = (int) (var5.aFloatArray2631[13] + var5.aFloatArray2631[1] * (float) var25 + var5.aFloatArray2631[5] * (float) var26 + var5.aFloatArray2631[9] * (float) var27);
			}
		}
		float var33;
		float var34;
		float var35;
		float var36;
		float var37;
		float var38;
		float var39;
		float var40;
		float var41;
		float var42;
		short var59;
		if (this.aClass20Array8216 != null) {
			for (var24 = 0; var24 < this.anInt8215; var24++) {
				Class20 var54 = this.aClass20Array8216[var24];
				Class10 var56 = this.aClass10Array8211[var24];
				short var57 = this.aShortArray8173[var54.modelColorIndex];
				short var58 = this.aShortArray8186[var54.modelColorIndex];
				var59 = this.aShortArray8217[var54.modelColorIndex];
				int var60 = (this.anIntArray8238[var57] + this.anIntArray8238[var58] + this.anIntArray8238[var59]) / 3;
				int var61 = (this.anIntArray8195[var57] + this.anIntArray8195[var58] + this.anIntArray8195[var59]) / 3;
				int var32 = (this.anIntArray8180[var57] + this.anIntArray8180[var58] + this.anIntArray8180[var59]) / 3;
				var33 = var22.aFloatArray2631[0] * (float) var60 + var22.aFloatArray2631[4] * (float) var61 + var22.aFloatArray2631[8] * (float) var32 + var22.aFloatArray2631[12];
				var34 = var22.aFloatArray2631[1] * (float) var60 + var22.aFloatArray2631[5] * (float) var61 + var22.aFloatArray2631[9] * (float) var32 + var22.aFloatArray2631[13];
				var35 = var22.aFloatArray2631[2] * (float) var60 + var22.aFloatArray2631[6] * (float) var61 + var22.aFloatArray2631[10] * (float) var32 + var22.aFloatArray2631[14];
				var36 = var22.aFloatArray2631[3] * (float) var60 + var22.aFloatArray2631[7] * (float) var61 + var22.aFloatArray2631[11] * (float) var32 + var22.aFloatArray2631[15];
				float var63 = var35 + var7.aFloatArray2631[2] * (float) var56.anInt159 + var7.aFloatArray2631[6] * (float) var56.anInt157;
				float var64 = var36 + var7.aFloatArray2631[3] * (float) var56.anInt159 + var7.aFloatArray2631[7] * (float) var56.anInt157;
				if (var63 > -var64) {
					var33 += var7.aFloatArray2631[0] * (float) var56.anInt159 + var7.aFloatArray2631[4] * (float) var56.anInt157;
					var34 += var7.aFloatArray2631[1] * (float) var56.anInt159 + var7.aFloatArray2631[5] * (float) var56.anInt157;
					var37 = this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var33 / var64;
					var38 = this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var34 / var64;
					var39 = var56.aFloat154 * (float) var54.aShort250;
					var40 = var56.aFloat155 * (float) var54.aShort246;
					var41 = var33 + var7.aFloatArray2631[0] * var39 + var7.aFloatArray2631[4] * var40;
					var42 = var34 + var7.aFloatArray2631[1] * var39 + var7.aFloatArray2631[5] * var40;
					float var43 = var64 + var7.aFloatArray2631[3] * var39 + var7.aFloatArray2631[7] * var40;
					float var44 = this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var41 / var43;
					float var45 = this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var42 / var43;
					var56.anInt156 = (int) var37;
					var56.anInt160 = (int) var38;
					var56.aFloat161 = this.aClass_ra_Sub3_8165.aFloat8639 + this.aClass_ra_Sub3_8165.aFloat8637 * (var63 - var7.aFloatArray2631[10] * (float) var54.anInt251) / var64;
					var56.anInt162 = (int) (var44 < var37 ? var37 - var44 : var44 - var37);
					var56.anInt153 = (int) (var45 < var38 ? var38 - var45 : var45 - var38);
				} else {
					var56.anInt153 = 0;
					var56.anInt162 = 0;
				}
			}
		}
		if (arg1 != null) {
			boolean var53 = false;
			boolean var55 = true;
			var26 = this.aShort8224 + this.aShort8225 >> 1;
			var27 = this.aShort8226 + this.aShort8227 >> 1;
			var59 = this.aShort8214;
			var31 = var22.aFloatArray2631[0] * (float) var26 + var22.aFloatArray2631[4] * (float) var59 + var22.aFloatArray2631[8] * (float) var27 + var22.aFloatArray2631[12];
			float var62 = var22.aFloatArray2631[1] * (float) var26 + var22.aFloatArray2631[5] * (float) var59 + var22.aFloatArray2631[9] * (float) var27 + var22.aFloatArray2631[13];
			var33 = var22.aFloatArray2631[2] * (float) var26 + var22.aFloatArray2631[6] * (float) var59 + var22.aFloatArray2631[10] * (float) var27 + var22.aFloatArray2631[14];
			var34 = var22.aFloatArray2631[3] * (float) var26 + var22.aFloatArray2631[7] * (float) var59 + var22.aFloatArray2631[11] * (float) var27 + var22.aFloatArray2631[15];
			if (var33 >= -var34) {
				arg1.anInt669 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var31 / var34);
				arg1.anInt670 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var62 / var34);
			} else {
				var53 = true;
			}
			var59 = this.aShort8223;
			var35 = var22.aFloatArray2631[0] * (float) var26 + var22.aFloatArray2631[4] * (float) var59 + var22.aFloatArray2631[8] * (float) var27 + var22.aFloatArray2631[12];
			var36 = var22.aFloatArray2631[1] * (float) var26 + var22.aFloatArray2631[5] * (float) var59 + var22.aFloatArray2631[9] * (float) var27 + var22.aFloatArray2631[13];
			var37 = var22.aFloatArray2631[2] * (float) var26 + var22.aFloatArray2631[6] * (float) var59 + var22.aFloatArray2631[10] * (float) var27 + var22.aFloatArray2631[14];
			var38 = var22.aFloatArray2631[3] * (float) var26 + var22.aFloatArray2631[7] * (float) var59 + var22.aFloatArray2631[11] * (float) var27 + var22.aFloatArray2631[15];
			if (var37 >= -var38) {
				arg1.anInt668 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var35 / var38);
				arg1.anInt672 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var36 / var38);
			} else {
				var53 = true;
			}
			if (var53) {
				if (var33 < -var34 && var37 < -var38) {
					var55 = false;
				} else if (var33 < -var34) {
					var39 = (var33 + var34) / (var37 + var38) - 1.0F;
					var40 = var31 + var39 * (var35 - var31);
					var41 = var62 + var39 * (var36 - var62);
					var42 = var34 + var39 * (var38 - var34);
					arg1.anInt669 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var40 / var42);
					arg1.anInt670 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var41 / var42);
				} else if (var37 < -var38) {
					var39 = (var37 + var38) / (var33 + var34) - 1.0F;
					var40 = var35 + var39 * (var31 - var35);
					var41 = var36 + var39 * (var62 - var36);
					var42 = var38 + var39 * (var34 - var38);
					arg1.anInt668 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var40 / var42);
					arg1.anInt672 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var41 / var42);
				}
			}
			if (var55) {
				if (var33 / var34 > var37 / var38) {
					var39 = var31 + var7.aFloatArray2631[0] * (float) this.aShort8220 + var7.aFloatArray2631[12];
					var40 = var34 + var7.aFloatArray2631[3] * (float) this.aShort8220 + var7.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 - (float) arg1.anInt669 + this.aClass_ra_Sub3_8165.aFloat8640 * var39 / var40);
				} else {
					var39 = var35 + var7.aFloatArray2631[0] * (float) this.aShort8220 + var7.aFloatArray2631[12];
					var40 = var38 + var7.aFloatArray2631[3] * (float) this.aShort8220 + var7.aFloatArray2631[15];
					arg1.anInt673 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 - (float) arg1.anInt668 + this.aClass_ra_Sub3_8165.aFloat8640 * var39 / var40);
				}
				arg1.aBoolean671 = true;
			}
		}
		this.method4532(true);
		this.aClass38_8164.aBoolean384 = (arg2 & 0x1) == 0;
		this.aClass38_8164.aBoolean383 = false;
		try {
			this.method4542(this.aClass_ra_Sub3_8165.anIntArray8630 != null, this.aClass_ra_Sub3_8165.aFloatArray8620 != null, (arg2 & 0x4) != 0, var23, this.aClass6_8162.aBoolean86 && var21 > this.aClass6_8162.aFloat87 || this.aClass6_8162.aBoolean91);
		} catch (Exception var49) {
		}
		if (this.aClass20Array8216 != null) {
			for (var24 = 0; var24 < this.anInt8184; var24++) {
				this.anIntArray8241[var24] = -1;
			}
		}
		this.aClass38_8164 = null;
		if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				this.aBoolean8161 = false;
				this.notifyAll();
			}
		}
	}

	public final void method4542(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		int var6;
		if (this.aClass20Array8216 != null) {
			var6 = 0;
			while (var6 < this.anInt8215) {
				Class20 var7 = this.aClass20Array8216[var6];
				this.anIntArray8241[var7.modelColorIndex] = var6++;
			}
		}
		if (!this.aBoolean8228 && this.aClass20Array8216 == null) {
			for (var6 = 0; var6 < this.anInt8184; var6++) {
				this.method4544(arg0, arg1, arg2, var6, arg3, arg4);
			}
		} else if ((this.anInt8172 & 0x100) == 0 && this.aShortArray8204 != null) {
			for (var6 = 0; var6 < this.anInt8184; var6++) {
				short var9 = this.aShortArray8204[var6];
				this.method4544(arg0, arg1, arg2, var9, arg3, arg4);
			}
		} else {
			for (var6 = 0; var6 < this.anInt8184; var6++) {
				if (!this.method4555(var6) && !this.method4543(var6)) {
					this.method4544(arg0, arg1, arg2, var6, arg3, arg4);
				}
			}
			if (this.aByteArray8203 == null) {
				for (var6 = 0; var6 < this.anInt8184; var6++) {
					if (this.method4555(var6) || this.method4543(var6)) {
						this.method4544(arg0, arg1, arg2, var6, arg3, arg4);
					}
				}
			} else {
				for (var6 = 0; var6 < 12; var6++) {
					for (int var8 = 0; var8 < this.anInt8184; var8++) {
						if (this.aByteArray8203[var8] == var6 && (this.method4555(var8) || this.method4543(var8))) {
							this.method4544(arg0, arg1, arg2, var8, arg3, arg4);
						}
					}
				}
			}
		}
	}

	public final boolean method4543(int arg0) {
		if (this.anIntArray8241 == null) {
			return false;
		} else {
			return this.anIntArray8241[arg0] != -1;
		}
	}

	public final void method4544(boolean arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, boolean arg5) {
		if (this.anIntArray8192[arg3] == -2) {
			return;
		}
		short var7 = this.aShortArray8173[arg3];
		short var8 = this.aShortArray8186[arg3];
		short var9 = this.aShortArray8217[arg3];
		float var10 = this.aFloatArray8232[var7];
		float var11 = this.aFloatArray8232[var8];
		float var12 = this.aFloatArray8232[var9];
		if (arg4 && (var10 == -5000.0F || var11 == -5000.0F || var12 == -5000.0F)) {
			return;
		}
		float var13 = this.aFloatArray8233[var7];
		float var14 = this.aFloatArray8233[var8];
		float var15 = this.aFloatArray8233[var9];
		if (this.anIntArray8241[arg3] == -1 && (var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) <= 0.0F) {
			return;
		}
		if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float) this.aClass6_8162.anInt119 || var11 > (float) this.aClass6_8162.anInt119 || var12 > (float) this.aClass6_8162.anInt119) {
			this.aClass38_8164.aBoolean387 = true;
		} else {
			this.aClass38_8164.aBoolean387 = false;
		}
		int var16;
		if (arg5) {
			var16 = this.anIntArray8241[arg3];
			if (var16 == -1 || !this.aClass20Array8216[var16].aBoolean245) {
				this.method4545(arg0, arg1, arg2, arg3);
			}
			return;
		}
		var16 = this.anIntArray8241[arg3];
		if (var16 == -1) {
			this.method4554(arg0, arg1, arg2, arg3);
			return;
		}
		Class20 var17 = this.aClass20Array8216[var16];
		Class10 var18 = this.aClass10Array8211[var16];
		if (!var17.aBoolean245) {
			this.method4554(arg0, arg1, arg2, arg3);
		}
		this.aClass_ra_Sub3_8165.method5201(arg0, arg1, arg2, var18.anInt156, var18.anInt160, var18.aFloat161, var18.anInt162, var18.anInt153, var17.aShort247 & 0xFFFF, var18.anInt163, var17.aByte249, var17.aByte248);
	}

	public final void method4545(boolean arg0, boolean arg1, boolean arg2, int arg3) {
		short var5;
		short var6;
		short var7;
		float var9;
		float var10;
		if (this.aClass6_8162.aBoolean91) {
			var5 = this.aShortArray8173[arg3];
			var6 = this.aShortArray8186[arg3];
			var7 = this.aShortArray8217[arg3];
			float var26 = 0.0F;
			var9 = 0.0F;
			var10 = 0.0F;
			if (this.anIntArray8231[var5] > this.aClass6_8162.anInt93) {
				var26 = 1.0F;
			} else if (this.anIntArray8231[var5] > this.aClass6_8162.anInt92) {
				var26 = (float) (this.aClass6_8162.anInt92 - this.anIntArray8231[var5]) * 1.0F / (float) (this.aClass6_8162.anInt92 - this.aClass6_8162.anInt93);
			}
			if (this.anIntArray8231[var6] > this.aClass6_8162.anInt93) {
				var9 = 1.0F;
			} else if (this.anIntArray8231[var6] > this.aClass6_8162.anInt92) {
				var9 = (float) (this.aClass6_8162.anInt92 - this.anIntArray8231[var6]) * 1.0F / (float) (this.aClass6_8162.anInt92 - this.aClass6_8162.anInt93);
			}
			if (this.anIntArray8231[var7] > this.aClass6_8162.anInt93) {
				var10 = 1.0F;
			} else if (this.anIntArray8231[var7] > this.aClass6_8162.anInt92) {
				var10 = (float) (this.aClass6_8162.anInt92 - this.anIntArray8231[var7]) * 1.0F / (float) (this.aClass6_8162.anInt92 - this.aClass6_8162.anInt93);
			}
			if (this.aByteArray8200 == null) {
				this.aClass38_8164.anInt402 = 0;
			} else {
				this.aClass38_8164.anInt402 = this.aByteArray8200[arg3] & 0xFF;
			}
			if (this.aShortArray8201 != null && this.aShortArray8201[arg3] != -1) {
				int var27 = -16777216;
				if (this.aByteArray8200 != null) {
					var27 = 255 - (this.aByteArray8200[arg3] & 0xFF) << 24;
				}
				if (this.anIntArray8192[arg3] == -1) {
					int var28 = var27 | this.anIntArray8190[arg3] & 0xFFFFFF;
					this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var28, var28, var28, this.aClass6_8162.anInt88, var26 * 255.0F, var9 * 255.0F, var10 * 255.0F, this.aShortArray8201[arg3]);
				} else {
					this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var27 | this.anIntArray8190[arg3] & 0xFFFFFF, var27 | this.anIntArray8191[arg3] & 0xFFFFFF, var27 | this.anIntArray8192[arg3] & 0xFFFFFF, this.aClass6_8162.anInt88, var26 * 255.0F, var9 * 255.0F, var10 * 255.0F, this.aShortArray8201[arg3]);
				}
			} else if (this.anIntArray8192[arg3] == -1) {
				this.aClass38_8164.method538(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var26 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var9 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var10 * 255.0F, -1027106511));
			} else {
				this.aClass38_8164.method538(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var26 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8191[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var9 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8192[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var10 * 255.0F, -1027106511));
			}
			return;
		}
		var5 = this.aShortArray8173[arg3];
		var6 = this.aShortArray8186[arg3];
		var7 = this.aShortArray8217[arg3];
		Class249 var8 = this.aClass_ra_Sub3_8165.aClass249_8633;
		var9 = var8.aFloatArray2631[10];
		var10 = var8.aFloatArray2631[14];
		float var11 = var8.aFloatArray2631[11];
		float var12 = var8.aFloatArray2631[15];
		float var13 = var10 * var11 - var9 * var12;
		float var14 = (this.aFloatArray8234[var5] - this.aClass6_8162.aFloat124) * this.aClass6_8162.aFloat118;
		float var15 = (this.aFloatArray8234[var6] - this.aClass6_8162.aFloat124) * this.aClass6_8162.aFloat118;
		float var16 = (this.aFloatArray8234[var7] - this.aClass6_8162.aFloat124) * this.aClass6_8162.aFloat118;
		float var17 = var14 * var13 / (var14 * var11 - var9);
		float var18 = var15 * var13 / (var15 * var11 - var9);
		float var19 = var16 * var13 / (var16 * var11 - var9);
		float var20 = (var17 - this.aClass6_8162.aFloat87) / this.aClass6_8162.aFloat104;
		if (var20 > 1.0F) {
			var20 = 1.0F;
		} else if (var20 < 0.0F) {
			var20 = 0.0F;
		}
		float var21 = (var18 - this.aClass6_8162.aFloat87) / this.aClass6_8162.aFloat104;
		if (var21 > 1.0F) {
			var21 = 1.0F;
		} else if (var21 < 0.0F) {
			var21 = 0.0F;
		}
		float var22 = (var19 - this.aClass6_8162.aFloat87) / this.aClass6_8162.aFloat104;
		if (var22 > 1.0F) {
			var22 = 1.0F;
		} else if (var22 < 0.0F) {
			var22 = 0.0F;
		}
		float var23 = var20 + var21 + var22;
		if (var23 >= 3.0F) {
			return;
		}
		if (var23 <= 0.0F) {
			this.method4554(arg0, arg1, arg2, arg3);
			return;
		}
		if (this.aByteArray8200 == null) {
			this.aClass38_8164.anInt402 = 0;
		} else {
			this.aClass38_8164.anInt402 = this.aByteArray8200[arg3] & 0xFF;
		}
		if (this.aShortArray8201 != null && this.aShortArray8201[arg3] != -1) {
			int var24 = -16777216;
			if (this.aByteArray8200 != null) {
				var24 = 255 - (this.aByteArray8200[arg3] & 0xFF) << 24;
			}
			if (this.anIntArray8192[arg3] == -1) {
				int var25 = var24 | this.anIntArray8190[arg3] & 0xFFFFFF;
				this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var25, var25, var25, this.aClass6_8162.anInt88, var20 * 255.0F, var21 * 255.0F, var22 * 255.0F, this.aShortArray8201[arg3]);
			} else {
				this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var24 | this.anIntArray8190[arg3] & 0xFFFFFF, var24 | this.anIntArray8191[arg3] & 0xFFFFFF, var24 | this.anIntArray8192[arg3] & 0xFFFFFF, this.aClass6_8162.anInt88, var20 * 255.0F, var21 * 255.0F, var22 * 255.0F, this.aShortArray8201[arg3]);
			}
		} else if (this.anIntArray8192[arg3] == -1) {
			this.aClass38_8164.method538(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var20 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var21 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var22 * 255.0F, -1027106511));
		} else {
			this.aClass38_8164.method538(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], Class442.method5612(Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var20 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8191[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var21 * 255.0F, -1027106511), Class442.method5612(Console.anIntArray4263[this.anIntArray8192[arg3] & 0xFFFF], this.aClass6_8162.anInt88, var22 * 255.0F, -1027106511));
		}
	}

	public boolean method4458(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 var6 = this.aClass6_8162.aClass249_99;
		var6.method2508(arg2);
		Class249 var7 = this.aClass6_8162.aClass249_100;
		var7.method2510(var6);
		var7.method2483(this.aClass_ra_Sub3_8165.aClass249_8634);
		boolean var8 = false;
		int var9 = Integer.MAX_VALUE;
		int var10 = Integer.MIN_VALUE;
		int var11 = Integer.MAX_VALUE;
		int var12 = Integer.MIN_VALUE;
		if (!this.aBoolean8187) {
			this.method4547();
		}
		int var13 = this.aShort8225 - this.aShort8224 >> 1;
		int var14 = this.aShort8223 - this.aShort8214 >> 1;
		int var15 = this.aShort8227 - this.aShort8226 >> 1;
		int var16 = this.aShort8224 + var13;
		int var17 = this.aShort8214 + var14;
		int var18 = this.aShort8226 + var15;
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = var18 - (var15 << arg4);
		int var22 = var16 + (var13 << arg4);
		int var23 = var17 + (var14 << arg4);
		int var24 = var18 + (var15 << arg4);
		this.anIntArray8177[0] = var19;
		this.anIntArray8178[0] = var20;
		this.anIntArray8179[0] = var21;
		this.anIntArray8177[1] = var22;
		this.anIntArray8178[1] = var20;
		this.anIntArray8179[1] = var21;
		this.anIntArray8177[2] = var19;
		this.anIntArray8178[2] = var23;
		this.anIntArray8179[2] = var21;
		this.anIntArray8177[3] = var22;
		this.anIntArray8178[3] = var23;
		this.anIntArray8179[3] = var21;
		this.anIntArray8177[4] = var19;
		this.anIntArray8178[4] = var20;
		this.anIntArray8179[4] = var24;
		this.anIntArray8177[5] = var22;
		this.anIntArray8178[5] = var20;
		this.anIntArray8179[5] = var24;
		this.anIntArray8177[6] = var19;
		this.anIntArray8178[6] = var23;
		this.anIntArray8179[6] = var24;
		this.anIntArray8177[7] = var22;
		this.anIntArray8178[7] = var23;
		this.anIntArray8179[7] = var24;
		int var25;
		int var26;
		int var27;
		int var28;
		float var29;
		float var30;
		float var31;
		float var32;
		for (var25 = 0; var25 < 8; var25++) {
			var26 = this.anIntArray8177[var25];
			var27 = this.anIntArray8178[var25];
			var28 = this.anIntArray8179[var25];
			var29 = var7.aFloatArray2631[2] * (float) var26 + var7.aFloatArray2631[6] * (float) var27 + var7.aFloatArray2631[10] * (float) var28 + var7.aFloatArray2631[14];
			var30 = var7.aFloatArray2631[3] * (float) var26 + var7.aFloatArray2631[7] * (float) var27 + var7.aFloatArray2631[11] * (float) var28 + var7.aFloatArray2631[15];
			if (var29 >= -var30) {
				var31 = var7.aFloatArray2631[0] * (float) var26 + var7.aFloatArray2631[4] * (float) var27 + var7.aFloatArray2631[8] * (float) var28 + var7.aFloatArray2631[12];
				var32 = var7.aFloatArray2631[1] * (float) var26 + var7.aFloatArray2631[5] * (float) var27 + var7.aFloatArray2631[9] * (float) var28 + var7.aFloatArray2631[13];
				int var33 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var31 / var30);
				int var34 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var32 / var30);
				if (var33 < var9) {
					var9 = var33;
				}
				if (var33 > var10) {
					var10 = var33;
				}
				if (var34 < var11) {
					var11 = var34;
				}
				if (var34 > var12) {
					var12 = var34;
				}
				var8 = true;
			}
		}
		if (var8 && arg0 > var9 && arg0 < var10 && arg1 > var11 && arg1 < var12) {
			if (arg3) {
				return true;
			}
			for (var25 = 0; var25 < this.anInt8174; var25++) {
				var26 = this.anIntArray8238[var25];
				var27 = this.anIntArray8195[var25];
				var28 = this.anIntArray8180[var25];
				var29 = var7.aFloatArray2631[2] * (float) var26 + var7.aFloatArray2631[6] * (float) var27 + var7.aFloatArray2631[10] * (float) var28 + var7.aFloatArray2631[14];
				var30 = var7.aFloatArray2631[3] * (float) var26 + var7.aFloatArray2631[7] * (float) var27 + var7.aFloatArray2631[11] * (float) var28 + var7.aFloatArray2631[15];
				if (var29 >= -var30) {
					var31 = var7.aFloatArray2631[0] * (float) var26 + var7.aFloatArray2631[4] * (float) var27 + var7.aFloatArray2631[8] * (float) var28 + var7.aFloatArray2631[12];
					var32 = var7.aFloatArray2631[1] * (float) var26 + var7.aFloatArray2631[5] * (float) var27 + var7.aFloatArray2631[9] * (float) var28 + var7.aFloatArray2631[13];
					this.aFloatArray8232[var25] = (float) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var31 / var30);
					this.aFloatArray8233[var25] = (float) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var32 / var30);
				} else {
					this.aFloatArray8232[var25] = -999999.0F;
				}
			}
			for (var25 = 0; var25 < this.anInt8184; var25++) {
				if (this.aFloatArray8232[this.aShortArray8173[var25]] != -999999.0F && this.aFloatArray8232[this.aShortArray8186[var25]] != -999999.0F && this.aFloatArray8232[this.aShortArray8217[var25]] != -999999.0F && this.method4546(arg0, arg1, this.aFloatArray8233[this.aShortArray8173[var25]], this.aFloatArray8233[this.aShortArray8186[var25]], this.aFloatArray8233[this.aShortArray8217[var25]], this.aFloatArray8232[this.aShortArray8173[var25]], this.aFloatArray8232[this.aShortArray8186[var25]], this.aFloatArray8232[this.aShortArray8217[var25]])) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean method4546(int arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
		if ((float) arg1 < arg2 && (float) arg1 < arg3 && (float) arg1 < arg4) {
			return false;
		} else if ((float) arg1 > arg2 && (float) arg1 > arg3 && (float) arg1 > arg4) {
			return false;
		} else if ((float) arg0 < arg5 && (float) arg0 < arg6 && (float) arg0 < arg7) {
			return false;
		} else {
			return !((float) arg0 > arg5) || !((float) arg0 > arg6) || !((float) arg0 > arg7);
		}
	}

	public void method4463(Class247 arg0) {
		this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 var2 = this.aClass6_8162.aClass249_99;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8213 != null) {
			for (var3 = 0; var3 < this.aClass93Array8213.length; var3++) {
				Class93 var4 = this.aClass93Array8213[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt841] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt841] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt841]);
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt841] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt841] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt841]);
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt841] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt841] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt841]);
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt835] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt835] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt835]);
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt835] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt835] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt835]);
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt835] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt835] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt835]);
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt836] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt836] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt836]);
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt836] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt836] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt836]);
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt836] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt836] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt836]);
			}
		}
		if (this.aClass64Array8160 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8160.length; var3++) {
			Class64 var6 = this.aClass64Array8160[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var6.anInt566] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var6.anInt566] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var6.anInt566]);
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var6.anInt566] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var6.anInt566] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var6.anInt566]);
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var6.anInt566] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var6.anInt566] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var6.anInt566]);
		}
	}

	@ObfuscatedName("Class387_Sub3.dm(IIII)V")
	public void dm(int arg0, int arg1, int arg2, int arg3) {
		if ((this.anInt8172 & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		int var5;
		for (var5 = 0; var5 < this.anInt8184; var5++) {
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
		if (this.aClass20Array8216 != null) {
			for (var5 = 0; var5 < this.anInt8215; var5++) {
				Class20 var10 = this.aClass20Array8216[var5];
				Class10 var11 = this.aClass10Array8211[var5];
				var11.anInt163 = (var11.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var10.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4547() {
		if (this.aBoolean8187) {
			return;
		}
		int var1 = 0;
		int var2 = 0;
		int var3 = 32767;
		int var4 = 32767;
		int var5 = 32767;
		int var6 = -32768;
		int var7 = -32768;
		int var8 = -32768;
		for (int var9 = 0; var9 < this.anInt8185; var9++) {
			int var10 = this.anIntArray8238[var9];
			int var11 = this.anIntArray8195[var9];
			int var12 = this.anIntArray8180[var9];
			if (var10 < var3) {
				var3 = var10;
			}
			if (var10 > var6) {
				var6 = var10;
			}
			if (var11 < var4) {
				var4 = var11;
			}
			if (var11 > var7) {
				var7 = var11;
			}
			if (var12 < var5) {
				var5 = var12;
			}
			if (var12 > var8) {
				var8 = var12;
			}
			int var13 = var10 * var10 + var12 * var12;
			if (var13 > var1) {
				var1 = var13;
			}
			var13 += var11 * var11;
			if (var13 > var2) {
				var2 = var13;
			}
		}
		this.aShort8224 = (short) var3;
		this.aShort8225 = (short) var6;
		this.aShort8214 = (short) var4;
		this.aShort8223 = (short) var7;
		this.aShort8226 = (short) var5;
		this.aShort8227 = (short) var8;
		this.aShort8220 = (short) (Math.sqrt((double) var1) + 0.99D);
		this.aShort8198 = (short) (Math.sqrt((double) var2) + 0.99D);
		this.aBoolean8187 = true;
	}

	@ObfuscatedName("Class387_Sub3.N()I")
	public int N() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8220;
	}

	@ObfuscatedName("Class387_Sub3.n()I")
	public int n() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8198;
	}

	@ObfuscatedName("Class387_Sub3.ya()I")
	public int ya() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8225;
	}

	@ObfuscatedName("Class387_Sub3.cr()I")
	public int cr() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8227;
	}

	@ObfuscatedName("Class387_Sub3.ga(LClass_na;)LClass_na;")
	public Class_na ga(Class_na arg0) {
		return null;
	}

	@ObfuscatedName("Class387_Sub3.ha()I")
	public int ha() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8227;
	}

	@ObfuscatedName("Class387_Sub3.p(I)V")
	public void p(int arg0) {
		if ((this.anInt8172 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt8236 = arg0;
		this.anInt8196 = 0;
	}

	public Class387 method4468(byte arg0, int arg1, boolean arg2) {
		this.method4530(Thread.currentThread());
		boolean var4 = false;
		Class387_Sub3 var5;
		Class387_Sub3 var6;
		if (arg0 > 0 && arg0 <= 7) {
			var6 = this.aClass387_Sub3Array8243[arg0 - 1];
			var5 = this.aClass387_Sub3Array8170[arg0 - 1];
			var4 = true;
		} else {
			var5 = var6 = new Class387_Sub3(this.aClass_ra_Sub3_8165);
		}
		return this.method4536(var5, var6, arg1, var4, arg2);
	}

	@ObfuscatedName("Class387_Sub3.c()I")
	public int c() {
		return this.anInt8236;
	}

	@ObfuscatedName("Class387_Sub3.cc()I")
	public int cc() {
		return this.anInt8236;
	}

	@ObfuscatedName("Class387_Sub3.as()[B")
	public byte[] as() {
		return this.aByteArray8200;
	}

	public void color(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = var5.anInt163 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex], (byte) 1) & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4460(byte arg0, byte[] arg1) {
		if ((this.anInt8172 & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (this.aByteArray8200 == null) {
			this.aByteArray8200 = new byte[this.anInt8184];
		}
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				this.aByteArray8200[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8200[var3] = (byte) var4;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public int method4548(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	public void method4440(Class247 arg0, Class80 arg1, int arg2) {
		this.method4541(arg0, arg1, arg2);
	}

	public Class93[] method4464() {
		return this.aClass93Array8213;
	}

	public Class64[] method4445() {
		return this.aClass64Array8160;
	}

	@ObfuscatedName("Class387_Sub3.i()Z")
	public boolean i() {
		return this.aBoolean8228;
	}

	public void method4472() {
		if (this.aClass_ra_Sub3_8165.anInt8650 * -76798145 * -595900225 > 1) {
			synchronized (this) {
				this.aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	public void method4549(boolean arg0) {
		if (this.anInt8196 == 1) {
			this.method4553();
		} else if (this.anInt8196 == 2) {
			if ((this.anInt8172 & 0x97098) == 0 && this.aFloatArrayArray8188 == null) {
				this.modelColors = null;
			}
			if (arg0) {
				this.aByteArray8230 = null;
			}
		} else {
			this.method4551();
			int var2 = this.aClass_ra_Sub3_8165.anInt8625;
			int var3 = this.aClass_ra_Sub3_8165.anInt8626;
			int var4 = this.aClass_ra_Sub3_8165.anInt8627;
			int var5 = this.aClass_ra_Sub3_8165.anInt8645 >> 8;
			int var6 = 0;
			int var7 = 0;
			if (this.anInt8176 != 0) {
				var6 = this.aClass_ra_Sub3_8165.anInt8628 * 768 / this.anInt8176;
				var7 = this.aClass_ra_Sub3_8165.anInt8646 * 768 / this.anInt8176;
			}
			if (this.anIntArray8190 == null) {
				this.anIntArray8190 = new int[this.anInt8184];
				this.anIntArray8191 = new int[this.anInt8184];
				this.anIntArray8192 = new int[this.anInt8184];
			}
			for (int var8 = 0; var8 < this.anInt8184; var8++) {
				byte var9;
				if (this.aByteArray8230 == null) {
					var9 = 0;
				} else {
					var9 = this.aByteArray8230[var8];
				}
				byte var10;
				if (this.aByteArray8200 == null) {
					var10 = 0;
				} else {
					var10 = this.aByteArray8200[var8];
				}
				short var11;
				if (this.aShortArray8201 == null) {
					var11 = -1;
				} else {
					var11 = this.aShortArray8201[var8];
				}
				if (var10 == -2) {
					var9 = 3;
				}
				if (var10 == -1) {
					var9 = 2;
				}
				int var12;
				int var16;
				if (var11 == -1) {
					int var17;
					int var18;
					short var19;
					int var21;
					if (var9 == 0) {
						var12 = this.modelColors[var8] & 0xFFFF;
						var21 = (var12 & 0x7F) * this.anInt8236 >> 7;
						var19 = Class356.modifyColor(var12 & 0xFFFFFF80 | var21, (byte) 1);
						Class21 var22;
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8173[var8]] == null) {
							var22 = this.aClass21Array8182[this.aShortArray8173[var8]];
						} else {
							var22 = this.aClass21Array8183[this.aShortArray8173[var8]];
						}
						var16 = (var2 * var22.anInt252 + var3 * var22.anInt253 + var4 * var22.anInt254) / var22.anInt255 >> 16;
						var17 = var16 > 256 ? var6 : var7;
						var18 = (var5 >> 1) + (var17 * var16 >> 17);
						this.anIntArray8190[var8] = var18 << 17 | Class330_Sub26_Sub1.method3395(var19, var18, -577928050);
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8186[var8]] == null) {
							var22 = this.aClass21Array8182[this.aShortArray8186[var8]];
						} else {
							var22 = this.aClass21Array8183[this.aShortArray8186[var8]];
						}
						var16 = (var2 * var22.anInt252 + var3 * var22.anInt253 + var4 * var22.anInt254) / var22.anInt255 >> 16;
						var17 = var16 > 256 ? var6 : var7;
						var18 = (var5 >> 1) + (var17 * var16 >> 17);
						this.anIntArray8191[var8] = var18 << 17 | Class330_Sub26_Sub1.method3395(var19, var18, -1343514986);
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8217[var8]] == null) {
							var22 = this.aClass21Array8182[this.aShortArray8217[var8]];
						} else {
							var22 = this.aClass21Array8183[this.aShortArray8217[var8]];
						}
						var16 = (var2 * var22.anInt252 + var3 * var22.anInt253 + var4 * var22.anInt254) / var22.anInt255 >> 16;
						var17 = var16 > 256 ? var6 : var7;
						var18 = (var5 >> 1) + (var17 * var16 >> 17);
						this.anIntArray8192[var8] = var18 << 17 | Class330_Sub26_Sub1.method3395(var19, var18, -2072299664);
					} else if (var9 == 1) {
						var12 = this.modelColors[var8] & 0xFFFF;
						var21 = (var12 & 0x7F) * this.anInt8236 >> 7;
						var19 = Class356.modifyColor(var12 & 0xFFFFFF80 | var21, (byte) 1);
						Class25 var23 = this.aClass25Array8197[var8];
						var16 = var2 * var23.anInt306 + var3 * var23.anInt307 + var4 * var23.anInt308 >> 16;
						var17 = var16 > 256 ? var6 : var7;
						var18 = (var5 >> 1) + (var17 * var16 >> 17);
						this.anIntArray8190[var8] = var18 << 17 | Class330_Sub26_Sub1.method3395(var19, var18, -761124492);
						this.anIntArray8192[var8] = -1;
					} else if (var9 == 3) {
						this.anIntArray8190[var8] = 128;
						this.anIntArray8192[var8] = -1;
					} else {
						this.anIntArray8192[var8] = -2;
					}
				} else {
					var12 = this.modelColors[var8] & 0xFFFF;
					int var14;
					int var15;
					if (var9 == 0) {
						Class21 var13;
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8173[var8]] == null) {
							var13 = this.aClass21Array8182[this.aShortArray8173[var8]];
						} else {
							var13 = this.aClass21Array8183[this.aShortArray8173[var8]];
						}
						var14 = (var2 * var13.anInt252 + var3 * var13.anInt253 + var4 * var13.anInt254) / var13.anInt255 >> 16;
						var15 = var14 > 256 ? var6 : var7;
						var16 = this.method4548((var5 >> 2) + (var15 * var14 >> 18));
						this.anIntArray8190[var8] = var16 << 24 | this.method4552(var12, var11, var16);
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8186[var8]] == null) {
							var13 = this.aClass21Array8182[this.aShortArray8186[var8]];
						} else {
							var13 = this.aClass21Array8183[this.aShortArray8186[var8]];
						}
						var14 = (var2 * var13.anInt252 + var3 * var13.anInt253 + var4 * var13.anInt254) / var13.anInt255 >> 16;
						var15 = var14 > 256 ? var6 : var7;
						var16 = this.method4548((var5 >> 2) + (var15 * var14 >> 18));
						this.anIntArray8191[var8] = var16 << 24 | this.method4552(var12, var11, var16);
						if (this.aClass21Array8183 == null || this.aClass21Array8183[this.aShortArray8217[var8]] == null) {
							var13 = this.aClass21Array8182[this.aShortArray8217[var8]];
						} else {
							var13 = this.aClass21Array8183[this.aShortArray8217[var8]];
						}
						var14 = (var2 * var13.anInt252 + var3 * var13.anInt253 + var4 * var13.anInt254) / var13.anInt255 >> 16;
						var15 = var14 > 256 ? var6 : var7;
						var16 = this.method4548((var5 >> 2) + (var15 * var14 >> 18));
						this.anIntArray8192[var8] = var16 << 24 | this.method4552(var12, var11, var16);
					} else if (var9 == 1) {
						Class25 var20 = this.aClass25Array8197[var8];
						var14 = var2 * var20.anInt306 + var3 * var20.anInt307 + var4 * var20.anInt308 >> 16;
						var15 = var14 > 256 ? var6 : var7;
						var16 = this.method4548((var5 >> 2) + (var15 * var14 >> 18));
						this.anIntArray8190[var8] = var16 << 24 | this.method4552(var12, var11, var16);
						this.anIntArray8192[var8] = -1;
					} else {
						this.anIntArray8192[var8] = -2;
					}
				}
			}
			this.aClass21Array8182 = null;
			this.aClass21Array8183 = null;
			this.aClass25Array8197 = null;
			if ((this.anInt8172 & 0x97098) == 0 && this.aFloatArrayArray8188 == null) {
				this.modelColors = null;
			}
			if (arg0) {
				this.aByteArray8230 = null;
			}
			this.anInt8196 = 2;
		}
	}

	@ObfuscatedName("Class387_Sub3.YA()I")
	public int YA() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8214;
	}

	@ObfuscatedName("Class387_Sub3.cm()I")
	public int cm() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8214;
	}

	@ObfuscatedName("Class387_Sub3.Z()I")
	public int Z() {
		return this.anInt8176;
	}

	@ObfuscatedName("Class387_Sub3.da(SS)V")
	public void da(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = (var5.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex * 1028839953 * 1557092081], (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	@ObfuscatedName("Class387_Sub3.bx()V")
	public void bx() {
		if (this.aBoolean8208) {
			for (int var1 = 0; var1 < this.anInt8174; var1++) {
				this.anIntArray8238[var1] = this.anIntArray8238[var1] + 7 >> 4;
				this.anIntArray8195[var1] = this.anIntArray8195[var1] + 7 >> 4;
				this.anIntArray8180[var1] = this.anIntArray8180[var1] + 7 >> 4;
			}
			this.aBoolean8208 = false;
		}
		if (this.aBoolean8207) {
			this.method4553();
			this.aBoolean8207 = false;
		}
		this.aBoolean8187 = false;
	}

	@ObfuscatedName("Class387_Sub3.AA()I")
	public int AA() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8226;
	}

	@ObfuscatedName("Class387_Sub3.dg()[B")
	public byte[] dg() {
		return this.aByteArray8200;
	}

	public void method4480(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub3 var6 = (Class387_Sub3) arg0;
		if ((this.anInt8172 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((var6.anInt8172 & 0x10000) == 65536) {
			this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
			this.method4547();
			this.method4551();
			var6.method4547();
			var6.method4551();
			anInt8175++;
			int var7 = 0;
			int[] var8 = var6.anIntArray8238;
			int var9 = var6.anInt8185;
			int var10;
			for (var10 = 0; var10 < this.anInt8185; var10++) {
				Class21 var11 = this.aClass21Array8182[var10];
				if (var11.anInt255 != 0) {
					int var12 = this.anIntArray8195[var10] - arg2;
					if (var12 >= var6.aShort8214 && var12 <= var6.aShort8223) {
						int var13 = this.anIntArray8238[var10] - arg1;
						if (var13 >= var6.aShort8224 && var13 <= var6.aShort8225) {
							int var14 = this.anIntArray8180[var10] - arg3;
							if (var14 >= var6.aShort8226 && var14 <= var6.aShort8227) {
								for (int var15 = 0; var15 < var9; var15++) {
									Class21 var16 = var6.aClass21Array8182[var15];
									if (var13 == var8[var15] && var14 == var6.anIntArray8180[var15] && var12 == var6.anIntArray8195[var15] && var16.anInt255 != 0) {
										if (this.aClass21Array8183 == null) {
											this.aClass21Array8183 = new Class21[this.anInt8185];
										}
										if (var6.aClass21Array8183 == null) {
											var6.aClass21Array8183 = new Class21[var9];
										}
										Class21 var17 = this.aClass21Array8183[var10];
										if (var17 == null) {
											var17 = this.aClass21Array8183[var10] = new Class21(var11);
										}
										Class21 var18 = var6.aClass21Array8183[var15];
										if (var18 == null) {
											var18 = var6.aClass21Array8183[var15] = new Class21(var16);
										}
										var17.anInt252 += var16.anInt252;
										var17.anInt253 += var16.anInt253;
										var17.anInt254 += var16.anInt254;
										var17.anInt255 += var16.anInt255;
										var18.anInt252 += var11.anInt252;
										var18.anInt253 += var11.anInt253;
										var18.anInt254 += var11.anInt254;
										var18.anInt255 += var11.anInt255;
										var7++;
										this.anIntArray8239[var10] = anInt8175;
										this.anIntArray8240[var15] = anInt8175;
									}
								}
							}
						}
					}
				}
			}
			if (var7 >= 3 && arg4) {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					if (this.anIntArray8239[this.aShortArray8173[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8186[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8217[var10]] == anInt8175) {
						if (this.aByteArray8230 == null) {
							this.aByteArray8230 = new byte[this.anInt8184];
						}
						this.aByteArray8230[var10] = 2;
					}
				}
				for (var10 = 0; var10 < var6.anInt8184; var10++) {
					if (this.anIntArray8240[var6.aShortArray8173[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8186[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8217[var10]] == anInt8175) {
						if (var6.aByteArray8230 == null) {
							var6.aByteArray8230 = new byte[var6.anInt8184];
						}
						var6.aByteArray8230[var10] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	public void method4466(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4) {
		Class387_Sub3 var6 = (Class387_Sub3) arg0;
		if ((this.anInt8172 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((var6.anInt8172 & 0x10000) == 65536) {
			this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
			this.method4547();
			this.method4551();
			var6.method4547();
			var6.method4551();
			anInt8175++;
			int var7 = 0;
			int[] var8 = var6.anIntArray8238;
			int var9 = var6.anInt8185;
			int var10;
			for (var10 = 0; var10 < this.anInt8185; var10++) {
				Class21 var11 = this.aClass21Array8182[var10];
				if (var11.anInt255 != 0) {
					int var12 = this.anIntArray8195[var10] - arg2;
					if (var12 >= var6.aShort8214 && var12 <= var6.aShort8223) {
						int var13 = this.anIntArray8238[var10] - arg1;
						if (var13 >= var6.aShort8224 && var13 <= var6.aShort8225) {
							int var14 = this.anIntArray8180[var10] - arg3;
							if (var14 >= var6.aShort8226 && var14 <= var6.aShort8227) {
								for (int var15 = 0; var15 < var9; var15++) {
									Class21 var16 = var6.aClass21Array8182[var15];
									if (var13 == var8[var15] && var14 == var6.anIntArray8180[var15] && var12 == var6.anIntArray8195[var15] && var16.anInt255 != 0) {
										if (this.aClass21Array8183 == null) {
											this.aClass21Array8183 = new Class21[this.anInt8185];
										}
										if (var6.aClass21Array8183 == null) {
											var6.aClass21Array8183 = new Class21[var9];
										}
										Class21 var17 = this.aClass21Array8183[var10];
										if (var17 == null) {
											var17 = this.aClass21Array8183[var10] = new Class21(var11);
										}
										Class21 var18 = var6.aClass21Array8183[var15];
										if (var18 == null) {
											var18 = var6.aClass21Array8183[var15] = new Class21(var16);
										}
										var17.anInt252 += var16.anInt252;
										var17.anInt253 += var16.anInt253;
										var17.anInt254 += var16.anInt254;
										var17.anInt255 += var16.anInt255;
										var18.anInt252 += var11.anInt252;
										var18.anInt253 += var11.anInt253;
										var18.anInt254 += var11.anInt254;
										var18.anInt255 += var11.anInt255;
										var7++;
										this.anIntArray8239[var10] = anInt8175;
										this.anIntArray8240[var15] = anInt8175;
									}
								}
							}
						}
					}
				}
			}
			if (var7 >= 3 && arg4) {
				for (var10 = 0; var10 < this.anInt8184; var10++) {
					if (this.anIntArray8239[this.aShortArray8173[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8186[var10]] == anInt8175 && this.anIntArray8239[this.aShortArray8217[var10]] == anInt8175) {
						if (this.aByteArray8230 == null) {
							this.aByteArray8230 = new byte[this.anInt8184];
						}
						this.aByteArray8230[var10] = 2;
					}
				}
				for (var10 = 0; var10 < var6.anInt8184; var10++) {
					if (this.anIntArray8240[var6.aShortArray8173[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8186[var10]] == anInt8175 && this.anIntArray8240[var6.aShortArray8217[var10]] == anInt8175) {
						if (var6.aByteArray8230 == null) {
							var6.aByteArray8230 = new byte[var6.anInt8184];
						}
						var6.aByteArray8230[var10] = 2;
					}
				}
			}
		} else {
			throw new IllegalStateException("");
		}
	}

	@ObfuscatedName("Class387_Sub3.db()I")
	public int db() {
		return this.anInt8176;
	}

	public void method4550() {
		synchronized (this) {
			int var2;
			int var3;
			for (var2 = 0; var2 < this.anInt8185; var2++) {
				var3 = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = -var3;
				if (this.aClass21Array8182[var2] != null) {
					var3 = this.aClass21Array8182[var2].anInt252;
					this.aClass21Array8182[var2].anInt252 = this.aClass21Array8182[var2].anInt254;
					this.aClass21Array8182[var2].anInt254 = -var3;
				}
			}
			if (this.aClass25Array8197 != null) {
				for (var2 = 0; var2 < this.anInt8184; var2++) {
					if (this.aClass25Array8197[var2] != null) {
						var3 = this.aClass25Array8197[var2].anInt306;
						this.aClass25Array8197[var2].anInt306 = this.aClass25Array8197[var2].anInt308;
						this.aClass25Array8197[var2].anInt308 = -var3;
					}
				}
			}
			for (var2 = this.anInt8185; var2 < this.anInt8174; var2++) {
				var3 = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = -var3;
			}
			this.anInt8196 = 0;
			this.aBoolean8187 = false;
		}
	}

	@ObfuscatedName("Class387_Sub3.bt(I)V")
	public void bt(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.ah()I")
	public int ah() {
		return this.anInt8172;
	}

	@ObfuscatedName("Class387_Sub3.av()I")
	public int av() {
		return this.anInt8172;
	}

	@ObfuscatedName("Class387_Sub3.ar()I")
	public int ar() {
		return this.anInt8172;
	}

	public void method4478(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8242 == null) {
			return;
		}
		Class6 var4 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		Class247 var5 = var4.aClass247_98;
		var5.method2454(arg0);
		if (arg2) {
			var5.method2459();
		}
		Class249 var6 = var4.aClass249_99;
		var6.method2508(var5);
		float[] var7 = new float[3];
		for (int var8 = 0; var8 < this.anInt8185; var8++) {
			if ((arg1 & this.aShortArray8242[var8]) != 0) {
				var6.method2511((float) this.anIntArray8238[var8], (float) this.anIntArray8195[var8], (float) this.anIntArray8180[var8], var7);
				this.anIntArray8238[var8] = (int) var7[0];
				this.anIntArray8195[var8] = (int) var7[1];
				this.anIntArray8180[var8] = (int) var7[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.au(I)V")
	public void au(int arg0) {
		if (this.aClass_ra_Sub3_8165.anInt8650 * -76798145 * -595900225 <= 1) {
			if ((this.anInt8172 & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method4532(true);
			}
			this.anInt8172 = arg0;
			return;
		}
		synchronized (this) {
			if ((this.anInt8172 & 0x10000) == 65536 && (arg0 & 0x10000) == 0) {
				this.method4532(true);
			}
			this.anInt8172 = arg0;
		}
	}

	public void method4491() {
	}

	public void method4551() {
		if (this.anInt8196 != 0 || this.aClass21Array8182 != null) {
			return;
		}
		if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				this.method4531();
			}
		} else {
			this.method4531();
		}
	}

	@ObfuscatedName("Class387_Sub3.bg(I)V")
	public void bg(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.bo(I)V")
	public void bo(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	public int method4552(int arg0, short arg1, int arg2) {
		int var4 = Console.colorArray[this.method4533(arg0, arg2)];
		Class56 var5 = this.aClass_ra_Sub3_8165.anInterface_ma4227.method221(arg1 & 0xFFFF, 1089038157);
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
		return var4;
	}

	@ObfuscatedName("Class387_Sub3.cg()I")
	public int cg() {
		return this.anInt8236;
	}

	@ObfuscatedName("Class387_Sub3.ca()I")
	public int ca() {
		return this.anInt8236;
	}

	@ObfuscatedName("Class387_Sub3.cu(I)V")
	public void cu(int arg0) {
		if ((this.anInt8172 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		this.anInt8176 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.cz()I")
	public int cz() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8220;
	}

	@ObfuscatedName("Class387_Sub3.bc(I)V")
	public void bc(int arg0) {
		if ((this.anInt8172 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var3 - this.anIntArray8180[var5] * var2 >> 14;
				this.anIntArray8180[var5] = this.anIntArray8195[var5] * var2 + this.anIntArray8180[var5] * var3 >> 14;
				this.anIntArray8195[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.bf(I)V")
	public void bf(int arg0) {
		if ((this.anInt8172 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
				this.anIntArray8195[var5] = this.anIntArray8195[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
				this.anIntArray8238[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.bl(I)V")
	public void bl(int arg0) {
		if ((this.anInt8172 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
				this.anIntArray8195[var5] = this.anIntArray8195[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
				this.anIntArray8238[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.cf(I)V")
	public void cf(int arg0) {
		if ((this.anInt8172 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		this.anInt8176 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.br(I)V")
	public void br(int arg0) {
		if ((this.anInt8172 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
				this.anIntArray8195[var5] = this.anIntArray8195[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
				this.anIntArray8238[var5] = var6;
			}
			this.method4540();
		}
	}

	@ObfuscatedName("Class387_Sub3.bi(III)V")
	public void bi(int arg0, int arg1, int arg2) {
		if (arg0 != 0 && (this.anInt8172 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 0 && (this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 0 || (this.anInt8172 & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] += arg0;
					this.anIntArray8195[var5] += arg1;
					this.anIntArray8180[var5] += arg2;
				}
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("Class387_Sub3.bz(III)V")
	public void bz(int arg0, int arg1, int arg2) {
		if (arg0 != 0 && (this.anInt8172 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 0 && (this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 0 || (this.anInt8172 & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] += arg0;
					this.anIntArray8195[var5] += arg1;
					this.anIntArray8180[var5] += arg2;
				}
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("Class387_Sub3.be(III)V")
	public void be(int arg0, int arg1, int arg2) {
		if (arg0 != 128 && (this.anInt8172 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 128 && (this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 128 || (this.anInt8172 & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] = this.anIntArray8238[var5] * arg0 >> 7;
					this.anIntArray8195[var5] = this.anIntArray8195[var5] * arg1 >> 7;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * arg2 >> 7;
				}
				this.aBoolean8187 = false;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("Class387_Sub3.by(IILClass_xa;LClass_xa;III)V")
	public void by(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (arg0 == 3) {
			if ((this.anInt8172 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean8187) {
			this.method4547();
		}
		int var8 = arg4 + this.aShort8224;
		int var9 = arg4 + this.aShort8225;
		int var10 = arg6 + this.aShort8226;
		int var11 = arg6 + this.aShort8227;
		if (arg0 != 4 && (var8 < 0 || var9 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg2.anInt6395 * -1684509909 * 550173571 >> arg2.anInt6396 * -786523509 * -1066304221 >= arg2.anInt6393 * -1805935063 * 24567321)) {
			return;
		}
		int[][] var12 = arg2.anIntArrayArray6394;
		int[][] var13 = null;
		if (arg3 != null) {
			var13 = arg3.anIntArrayArray6394;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var9 = var9 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			var10 >>= arg2.anInt6396 * -786523509 * -1066304221;
			var11 = var11 + (arg2.anInt6395 * -1684509909 * 550173571 - 1) >> arg2.anInt6396 * -786523509 * -1066304221;
			if (var12[var8][var10] == arg5 && var12[var9][var10] == arg5 && var12[var8][var11] == arg5 && var12[var9][var11] == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6397 * -1250378663 * 1972554729 || var10 < 0 || var11 + arg3.anInt6395 * -1684509909 * 550173571 >> arg3.anInt6396 * -786523509 * -1066304221 >= arg3.anInt6393 * -1805935063 * 24567321) {
			return;
		}
		synchronized (this) {
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			if (arg0 == 1) {
				var15 = arg2.anInt6395 * -1684509909 * 550173571 - 1;
				for (var16 = 0; var16 < this.anInt8185; var16++) {
					var17 = this.anIntArray8238[var16] + arg4;
					var18 = this.anIntArray8180[var16] + arg6;
					var19 = var17 & var15;
					var20 = var18 & var15;
					var21 = var17 >> arg2.anInt6396 * -786523509 * -1066304221;
					var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
					var23 = var12[var21][var22] * (arg2.anInt6395 * -1684509909 * 550173571 - var19) + var12[var21 + 1][var22] * var19 >> arg2.anInt6396 * -786523509 * -1066304221;
					var24 = var12[var21][var22 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var19) + var12[var21 + 1][var22 + 1] * var19 >> arg2.anInt6396 * -786523509 * -1066304221;
					var25 = var23 * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var24 * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
					this.anIntArray8195[var16] = this.anIntArray8195[var16] + var25 - arg5;
				}
				for (var16 = this.anInt8185; var16 < this.anInt8174; var16++) {
					var17 = this.anIntArray8238[var16] + arg4;
					var18 = this.anIntArray8180[var16] + arg6;
					var19 = var17 & var15;
					var20 = var18 & var15;
					var21 = var17 >> arg2.anInt6396 * -786523509 * -1066304221;
					var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
					if (var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
						var23 = var12[var21][var22] * (arg2.anInt6395 * -1684509909 * 550173571 - var19) + var12[var21 + 1][var22] * var19 >> arg2.anInt6396 * -786523509 * -1066304221;
						var24 = var12[var21][var22 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var19) + var12[var21 + 1][var22 + 1] * var19 >> arg2.anInt6396 * -786523509 * -1066304221;
						var25 = var23 * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var24 * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
						this.anIntArray8195[var16] = this.anIntArray8195[var16] + var25 - arg5;
					}
				}
			} else {
				int var26;
				if (arg0 == 2) {
					if (this.aShort8214 == 0) {
						return;
					}
					var15 = arg2.anInt6395 * -1684509909 * 550173571 - 1;
					for (var16 = 0; var16 < this.anInt8185; var16++) {
						var17 = (this.anIntArray8195[var16] << 16) / this.aShort8214;
						if (var17 < arg1) {
							var18 = this.anIntArray8238[var16] + arg4;
							var19 = this.anIntArray8180[var16] + arg6;
							var20 = var18 & var15;
							var21 = var19 & var15;
							var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
							var23 = var19 >> arg2.anInt6396 * -786523509 * -1066304221;
							var24 = var12[var22][var23] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
							var25 = var12[var22][var23 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
							var26 = var24 * (arg2.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg2.anInt6396 * -786523509 * -1066304221;
							this.anIntArray8195[var16] += (var26 - arg5) * (arg1 - var17) / arg1;
						} else {
							this.anIntArray8195[var16] = this.anIntArray8195[var16];
						}
					}
					for (var16 = this.anInt8185; var16 < this.anInt8174; var16++) {
						var17 = (this.anIntArray8195[var16] << 16) / this.aShort8214;
						if (var17 < arg1) {
							var18 = this.anIntArray8238[var16] + arg4;
							var19 = this.anIntArray8180[var16] + arg6;
							var20 = var18 & var15;
							var21 = var19 & var15;
							var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
							var23 = var19 >> arg2.anInt6396 * -786523509 * -1066304221;
							if (var22 >= 0 && var22 < arg2.anInt6397 * -1250378663 * 1972554729 - 1 && var23 >= 0 && var23 < arg2.anInt6393 * -1805935063 * 24567321 - 1) {
								var24 = var12[var22][var23] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
								var25 = var12[var22][var23 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
								var26 = var24 * (arg2.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg2.anInt6396 * -786523509 * -1066304221;
								this.anIntArray8195[var16] += (var26 - arg5) * (arg1 - var17) / arg1;
							}
						} else {
							this.anIntArray8195[var16] = this.anIntArray8195[var16];
						}
					}
				} else if (arg0 == 3) {
					var15 = (arg1 & 0xFF) * 4;
					var16 = (arg1 >> 8 & 0xFF) * 4;
					var17 = (arg1 >> 16 & 0xFF) << 6;
					var18 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (var15 >> 1) < 0 || arg4 + (var15 >> 1) + arg2.anInt6395 * -1684509909 * 550173571 >= arg2.anInt6397 * -1250378663 * 1972554729 << arg2.anInt6396 * -786523509 * -1066304221 || arg6 - (var16 >> 1) < 0 || arg6 + (var16 >> 1) + arg2.anInt6395 * -1684509909 * 550173571 >= arg2.anInt6393 * -1805935063 * 24567321 << arg2.anInt6396 * -786523509 * -1066304221) {
						return;
					}
					this.method4447(arg2, arg4, arg5, arg6, var15, var16, var17, var18);
				} else if (arg0 == 4) {
					var15 = arg3.anInt6395 * -1684509909 * 550173571 - 1;
					var16 = this.aShort8223 - this.aShort8214;
					for (var17 = 0; var17 < this.anInt8185; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg3.anInt6396 * -786523509 * -1066304221;
						var23 = var19 >> arg3.anInt6396 * -786523509 * -1066304221;
						var24 = var13[var22][var23] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
						var25 = var13[var22][var23 + 1] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
						var26 = var24 * (arg3.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg3.anInt6396 * -786523509 * -1066304221;
						this.anIntArray8195[var17] = this.anIntArray8195[var17] + (var26 - arg5) + var16;
					}
					for (var17 = this.anInt8185; var17 < this.anInt8174; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg3.anInt6396 * -786523509 * -1066304221;
						var23 = var19 >> arg3.anInt6396 * -786523509 * -1066304221;
						if (var22 >= 0 && var22 < arg3.anInt6397 * -1250378663 * 1972554729 - 1 && var23 >= 0 && var23 < arg3.anInt6393 * -1805935063 * 24567321 - 1) {
							var24 = var13[var22][var23] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
							var25 = var13[var22][var23 + 1] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
							var26 = var24 * (arg3.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg3.anInt6396 * -786523509 * -1066304221;
							this.anIntArray8195[var17] = this.anIntArray8195[var17] + (var26 - arg5) + var16;
						}
					}
				} else if (arg0 == 5) {
					var15 = arg3.anInt6395 * -1684509909 * 550173571 - 1;
					var16 = this.aShort8223 - this.aShort8214;
					int var27;
					int var28;
					for (var17 = 0; var17 < this.anInt8185; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
						var23 = var19 >> arg2.anInt6396 * -786523509 * -1066304221;
						var24 = var12[var22][var23] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
						var25 = var12[var22][var23 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
						var26 = var24 * (arg2.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg2.anInt6396 * -786523509 * -1066304221;
						var24 = var13[var22][var23] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
						var25 = var13[var22][var23 + 1] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
						var27 = var24 * (arg3.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg3.anInt6396 * -786523509 * -1066304221;
						var28 = var26 - var27 - arg1;
						this.anIntArray8195[var17] = ((this.anIntArray8195[var17] << 8) / var16 * var28 >> 8) - (arg5 - var26);
					}
					for (var17 = this.anInt8185; var17 < this.anInt8174; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg2.anInt6396 * -786523509 * -1066304221;
						var23 = var19 >> arg2.anInt6396 * -786523509 * -1066304221;
						if (var22 >= 0 && var22 < arg2.anInt6397 * -1250378663 * 1972554729 - 1 && var22 < arg3.anInt6397 * -1250378663 * 1972554729 - 1 && var23 >= 0 && var23 < arg2.anInt6393 * -1805935063 * 24567321 - 1 && var23 < arg3.anInt6393 * -1805935063 * 24567321 - 1) {
							var24 = var12[var22][var23] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
							var25 = var12[var22][var23 + 1] * (arg2.anInt6395 * -1684509909 * 550173571 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396 * -786523509 * -1066304221;
							var26 = var24 * (arg2.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg2.anInt6396 * -786523509 * -1066304221;
							var24 = var13[var22][var23] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
							var25 = var13[var22][var23 + 1] * (arg3.anInt6395 * -1684509909 * 550173571 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396 * -786523509 * -1066304221;
							var27 = var24 * (arg3.anInt6395 * -1684509909 * 550173571 - var21) + var25 * var21 >> arg3.anInt6396 * -786523509 * -1066304221;
							var28 = var26 - var27 - arg1;
							this.anIntArray8195[var17] = ((this.anIntArray8195[var17] << 8) / var16 * var28 >> 8) - (arg5 - var26);
						}
					}
				}
			}
			this.aBoolean8187 = false;
		}
	}

	@ObfuscatedName("Class387_Sub3.u()Z")
	public boolean u() {
		return this.aBoolean8229;
	}

	@ObfuscatedName("Class387_Sub3.pa(IILClass_xa;LClass_xa;III)V")
	public void pa(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6) {
		if (arg0 == 3) {
			if ((this.anInt8172 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean8187) {
			this.method4547();
		}
		int var8 = arg4 + this.aShort8224;
		int var9 = arg4 + this.aShort8225;
		int var10 = arg6 + this.aShort8226;
		int var11 = arg6 + this.aShort8227;
		if (arg0 != 4 && (var8 < 0 || var9 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6397 || var10 < 0 || var11 + arg2.anInt6395 >> arg2.anInt6396 >= arg2.anInt6393)) {
			return;
		}
		int[][] var12 = arg2.anIntArrayArray6394;
		int[][] var13 = null;
		if (arg3 != null) {
			var13 = arg3.anIntArrayArray6394;
		}
		if (arg0 != 4 && arg0 != 5) {
			var8 >>= arg2.anInt6396;
			var9 = var9 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			var10 >>= arg2.anInt6396;
			var11 = var11 + (arg2.anInt6395 - 1) >> arg2.anInt6396;
			if (var12[var8][var10] == arg5 && var12[var9][var10] == arg5 && var12[var8][var11] == arg5 && var12[var9][var11] == arg5) {
				return;
			}
		} else if (arg3 == null || var8 < 0 || var9 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6397 || var10 < 0 || var11 + arg3.anInt6395 >> arg3.anInt6396 >= arg3.anInt6393) {
			return;
		}
		synchronized (this) {
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			if (arg0 == 1) {
				var15 = arg2.anInt6395 - 1;
				for (var16 = 0; var16 < this.anInt8185; var16++) {
					var17 = this.anIntArray8238[var16] + arg4;
					var18 = this.anIntArray8180[var16] + arg6;
					var19 = var17 & var15;
					var20 = var18 & var15;
					var21 = var17 >> arg2.anInt6396;
					var22 = var18 >> arg2.anInt6396;
					var23 = var12[var21][var22] * (arg2.anInt6395 - var19) + var12[var21 + 1][var22] * var19 >> arg2.anInt6396;
					var24 = var12[var21][var22 + 1] * (arg2.anInt6395 - var19) + var12[var21 + 1][var22 + 1] * var19 >> arg2.anInt6396;
					var25 = var23 * (arg2.anInt6395 - var20) + var24 * var20 >> arg2.anInt6396;
					this.anIntArray8195[var16] = this.anIntArray8195[var16] + var25 - arg5;
				}
				for (var16 = this.anInt8185; var16 < this.anInt8174; var16++) {
					var17 = this.anIntArray8238[var16] + arg4;
					var18 = this.anIntArray8180[var16] + arg6;
					var19 = var17 & var15;
					var20 = var18 & var15;
					var21 = var17 >> arg2.anInt6396;
					var22 = var18 >> arg2.anInt6396;
					if (var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
						var23 = var12[var21][var22] * (arg2.anInt6395 - var19) + var12[var21 + 1][var22] * var19 >> arg2.anInt6396;
						var24 = var12[var21][var22 + 1] * (arg2.anInt6395 - var19) + var12[var21 + 1][var22 + 1] * var19 >> arg2.anInt6396;
						var25 = var23 * (arg2.anInt6395 - var20) + var24 * var20 >> arg2.anInt6396;
						this.anIntArray8195[var16] = this.anIntArray8195[var16] + var25 - arg5;
					}
				}
			} else {
				int var26;
				if (arg0 == 2) {
					if (this.aShort8214 == 0) {
						return;
					}
					var15 = arg2.anInt6395 - 1;
					for (var16 = 0; var16 < this.anInt8185; var16++) {
						var17 = (this.anIntArray8195[var16] << 16) / this.aShort8214;
						if (var17 < arg1) {
							var18 = this.anIntArray8238[var16] + arg4;
							var19 = this.anIntArray8180[var16] + arg6;
							var20 = var18 & var15;
							var21 = var19 & var15;
							var22 = var18 >> arg2.anInt6396;
							var23 = var19 >> arg2.anInt6396;
							var24 = var12[var22][var23] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396;
							var25 = var12[var22][var23 + 1] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396;
							var26 = var24 * (arg2.anInt6395 - var21) + var25 * var21 >> arg2.anInt6396;
							this.anIntArray8195[var16] += (var26 - arg5) * (arg1 - var17) / arg1;
						} else {
							this.anIntArray8195[var16] = this.anIntArray8195[var16];
						}
					}
					for (var16 = this.anInt8185; var16 < this.anInt8174; var16++) {
						var17 = (this.anIntArray8195[var16] << 16) / this.aShort8214;
						if (var17 < arg1) {
							var18 = this.anIntArray8238[var16] + arg4;
							var19 = this.anIntArray8180[var16] + arg6;
							var20 = var18 & var15;
							var21 = var19 & var15;
							var22 = var18 >> arg2.anInt6396;
							var23 = var19 >> arg2.anInt6396;
							if (var22 >= 0 && var22 < arg2.anInt6397 - 1 && var23 >= 0 && var23 < arg2.anInt6393 - 1) {
								var24 = var12[var22][var23] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396;
								var25 = var12[var22][var23 + 1] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396;
								var26 = var24 * (arg2.anInt6395 - var21) + var25 * var21 >> arg2.anInt6396;
								this.anIntArray8195[var16] += (var26 - arg5) * (arg1 - var17) / arg1;
							}
						} else {
							this.anIntArray8195[var16] = this.anIntArray8195[var16];
						}
					}
				} else if (arg0 == 3) {
					var15 = (arg1 & 0xFF) * 4;
					var16 = (arg1 >> 8 & 0xFF) * 4;
					var17 = (arg1 >> 16 & 0xFF) << 6;
					var18 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (var15 >> 1) < 0 || arg4 + (var15 >> 1) + arg2.anInt6395 >= arg2.anInt6397 << arg2.anInt6396 || arg6 - (var16 >> 1) < 0 || arg6 + (var16 >> 1) + arg2.anInt6395 >= arg2.anInt6393 << arg2.anInt6396) {
						return;
					}
					this.method4447(arg2, arg4, arg5, arg6, var15, var16, var17, var18);
				} else if (arg0 == 4) {
					var15 = arg3.anInt6395 - 1;
					var16 = this.aShort8223 - this.aShort8214;
					for (var17 = 0; var17 < this.anInt8185; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg3.anInt6396;
						var23 = var19 >> arg3.anInt6396;
						var24 = var13[var22][var23] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396;
						var25 = var13[var22][var23 + 1] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396;
						var26 = var24 * (arg3.anInt6395 - var21) + var25 * var21 >> arg3.anInt6396;
						this.anIntArray8195[var17] = this.anIntArray8195[var17] + (var26 - arg5) + var16;
					}
					for (var17 = this.anInt8185; var17 < this.anInt8174; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg3.anInt6396;
						var23 = var19 >> arg3.anInt6396;
						if (var22 >= 0 && var22 < arg3.anInt6397 - 1 && var23 >= 0 && var23 < arg3.anInt6393 - 1) {
							var24 = var13[var22][var23] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396;
							var25 = var13[var22][var23 + 1] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396;
							var26 = var24 * (arg3.anInt6395 - var21) + var25 * var21 >> arg3.anInt6396;
							this.anIntArray8195[var17] = this.anIntArray8195[var17] + (var26 - arg5) + var16;
						}
					}
				} else if (arg0 == 5) {
					var15 = arg3.anInt6395 - 1;
					var16 = this.aShort8223 - this.aShort8214;
					int var27;
					int var28;
					for (var17 = 0; var17 < this.anInt8185; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg2.anInt6396;
						var23 = var19 >> arg2.anInt6396;
						var24 = var12[var22][var23] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396;
						var25 = var12[var22][var23 + 1] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396;
						var26 = var24 * (arg2.anInt6395 - var21) + var25 * var21 >> arg2.anInt6396;
						var24 = var13[var22][var23] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396;
						var25 = var13[var22][var23 + 1] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396;
						var27 = var24 * (arg3.anInt6395 - var21) + var25 * var21 >> arg3.anInt6396;
						var28 = var26 - var27 - arg1;
						this.anIntArray8195[var17] = ((this.anIntArray8195[var17] << 8) / var16 * var28 >> 8) - (arg5 - var26);
					}
					for (var17 = this.anInt8185; var17 < this.anInt8174; var17++) {
						var18 = this.anIntArray8238[var17] + arg4;
						var19 = this.anIntArray8180[var17] + arg6;
						var20 = var18 & var15;
						var21 = var19 & var15;
						var22 = var18 >> arg2.anInt6396;
						var23 = var19 >> arg2.anInt6396;
						if (var22 >= 0 && var22 < arg2.anInt6397 - 1 && var22 < arg3.anInt6397 - 1 && var23 >= 0 && var23 < arg2.anInt6393 - 1 && var23 < arg3.anInt6393 - 1) {
							var24 = var12[var22][var23] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23] * var20 >> arg2.anInt6396;
							var25 = var12[var22][var23 + 1] * (arg2.anInt6395 - var20) + var12[var22 + 1][var23 + 1] * var20 >> arg2.anInt6396;
							var26 = var24 * (arg2.anInt6395 - var21) + var25 * var21 >> arg2.anInt6396;
							var24 = var13[var22][var23] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23] * var20 >> arg3.anInt6396;
							var25 = var13[var22][var23 + 1] * (arg3.anInt6395 - var20) + var13[var22 + 1][var23 + 1] * var20 >> arg3.anInt6396;
							var27 = var24 * (arg3.anInt6395 - var21) + var25 * var21 >> arg3.anInt6396;
							var28 = var26 - var27 - arg1;
							this.anIntArray8195[var17] = ((this.anIntArray8195[var17] << 8) / var16 * var28 >> 8) - (arg5 - var26);
						}
					}
				}
			}
			this.aBoolean8187 = false;
		}
	}

	@ObfuscatedName("Class387_Sub3.Q(I)V")
	public void Q(int arg0) {
		if ((this.anInt8172 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		this.anInt8176 = arg0;
		this.anInt8196 = 0;
	}

	public void method4474(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		int var8 = arg1.length;
		int var9;
		int var10;
		int var13;
		int var14;
		int var18;
		int var19;
		int var20;
		if (arg0 == 0) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var9 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					int[] var12 = this.anIntArrayArray8205[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8209 += this.anIntArray8238[var14];
						this.anInt8219 += this.anIntArray8195[var14];
						this.anInt8221 += this.anIntArray8180[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8209 = this.anInt8209 / var9 + var18;
				this.anInt8219 = this.anInt8219 / var9 + var19;
				this.anInt8221 = this.anInt8221 / var9 + var20;
			} else {
				this.anInt8209 = var18;
				this.anInt8219 = var19;
				this.anInt8221 = var20;
			}
			return;
		}
		int[] var21;
		int var23;
		if (arg0 == 1) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] += var18;
						this.anIntArray8195[var13] += var19;
						this.anIntArray8180[var13] += var20;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					if ((arg5 & 0x1) == 0) {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					} else {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					}
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] -= this.anInt8209;
						this.anIntArray8195[var13] -= this.anInt8219;
						this.anIntArray8180[var13] -= this.anInt8221;
						this.anIntArray8238[var13] = this.anIntArray8238[var13] * arg2 / 128;
						this.anIntArray8195[var13] = this.anIntArray8195[var13] * arg3 / 128;
						this.anIntArray8180[var13] = this.anIntArray8180[var13] * arg4 / 128;
						this.anIntArray8238[var13] += this.anInt8209;
						this.anIntArray8195[var13] += this.anInt8219;
						this.anIntArray8180[var13] += this.anInt8221;
					}
				}
			}
		} else {
			Class20 var22;
			Class10 var24;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8206.length) {
							var21 = this.anIntArrayArray8206[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var13 = var21[var23];
								var14 = (this.aByteArray8200[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8200[var13] = (byte) var14;
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var9 = 0; var9 < this.anInt8215; var9++) {
							var22 = this.aClass20Array8216[var9];
							var24 = this.aClass10Array8211[var9];
							var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var25;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.anInt159 = (var25.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var25.anInt157 = (var25.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.aFloat154 = var25.aFloat154 * (float) arg2 / 128.0F;
									var25.aFloat155 = var25.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8218.length) {
							var21 = this.anIntArrayArray8218[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var25 = this.aClass10Array8211[var21[var23]];
								var25.anInt158 = (var25.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8206.length) {
						var21 = this.anIntArrayArray8206[var10];
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							int var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3;
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
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var9 = 0; var9 < this.anInt8215; var9++) {
						var22 = this.aClass20Array8216[var9];
						var24 = this.aClass10Array8211[var9];
						var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
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
		int var18;
		int var19;
		int var20;
		if (arg0 == 0) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var9 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var10 = 0; var10 < var8; var10++) {
				int var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					int[] var12 = this.anIntArrayArray8205[var11];
					for (var13 = 0; var13 < var12.length; var13++) {
						var14 = var12[var13];
						this.anInt8209 += this.anIntArray8238[var14];
						this.anInt8219 += this.anIntArray8195[var14];
						this.anInt8221 += this.anIntArray8180[var14];
						var9++;
					}
				}
			}
			if (var9 > 0) {
				this.anInt8209 = this.anInt8209 / var9 + var18;
				this.anInt8219 = this.anInt8219 / var9 + var19;
				this.anInt8221 = this.anInt8221 / var9 + var20;
			} else {
				this.anInt8209 = var18;
				this.anInt8219 = var19;
				this.anInt8221 = var20;
			}
			return;
		}
		int[] var21;
		int var23;
		if (arg0 == 1) {
			var18 = arg2 << 4;
			var19 = arg3 << 4;
			var20 = arg4 << 4;
			if (!this.aBoolean8208) {
				for (var9 = 0; var9 < this.anInt8174; var9++) {
					this.anIntArray8238[var9] <<= 0x4;
					this.anIntArray8195[var9] <<= 0x4;
					this.anIntArray8180[var9] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] += var18;
						this.anIntArray8195[var13] += var19;
						this.anIntArray8180[var13] += var20;
					}
				}
			}
			return;
		}
		int var15;
		int var16;
		if (arg0 == 2) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					if ((arg5 & 0x1) == 0) {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					} else {
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							this.anIntArray8238[var13] -= this.anInt8209;
							this.anIntArray8195[var13] -= this.anInt8219;
							this.anIntArray8180[var13] -= this.anInt8221;
							if (arg2 != 0) {
								var14 = Class257.anIntArray2683[arg2];
								var15 = Class257.anIntArray2684[arg2];
								var16 = this.anIntArray8195[var13] * var15 - this.anIntArray8180[var13] * var14 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8195[var13] * var14 + this.anIntArray8180[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = var16;
							}
							if (arg4 != 0) {
								var14 = Class257.anIntArray2683[arg4];
								var15 = Class257.anIntArray2684[arg4];
								var16 = this.anIntArray8195[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8195[var13] = this.anIntArray8195[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							if (arg3 != 0) {
								var14 = Class257.anIntArray2683[arg3];
								var15 = Class257.anIntArray2684[arg3];
								var16 = this.anIntArray8180[var13] * var14 + this.anIntArray8238[var13] * var15 + 16383 >> 14;
								this.anIntArray8180[var13] = this.anIntArray8180[var13] * var15 - this.anIntArray8238[var13] * var14 + 16383 >> 14;
								this.anIntArray8238[var13] = var16;
							}
							this.anIntArray8238[var13] += this.anInt8209;
							this.anIntArray8195[var13] += this.anInt8219;
							this.anIntArray8180[var13] += this.anInt8221;
						}
					}
				}
			}
		} else if (arg0 == 3) {
			for (var9 = 0; var9 < var8; var9++) {
				var10 = arg1[var9];
				if (var10 < this.anIntArrayArray8205.length) {
					var21 = this.anIntArrayArray8205[var10];
					for (var23 = 0; var23 < var21.length; var23++) {
						var13 = var21[var23];
						this.anIntArray8238[var13] -= this.anInt8209;
						this.anIntArray8195[var13] -= this.anInt8219;
						this.anIntArray8180[var13] -= this.anInt8221;
						this.anIntArray8238[var13] = this.anIntArray8238[var13] * arg2 / 128;
						this.anIntArray8195[var13] = this.anIntArray8195[var13] * arg3 / 128;
						this.anIntArray8180[var13] = this.anIntArray8180[var13] * arg4 / 128;
						this.anIntArray8238[var13] += this.anInt8209;
						this.anIntArray8195[var13] += this.anInt8219;
						this.anIntArray8180[var13] += this.anInt8221;
					}
				}
			}
		} else {
			Class20 var22;
			Class10 var24;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8206.length) {
							var21 = this.anIntArrayArray8206[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var13 = var21[var23];
								var14 = (this.aByteArray8200[var13] & 0xFF) + arg2 * 8;
								if (var14 < 0) {
									var14 = 0;
								} else if (var14 > 255) {
									var14 = 255;
								}
								this.aByteArray8200[var13] = (byte) var14;
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var9 = 0; var9 < this.anInt8215; var9++) {
							var22 = this.aClass20Array8216[var9];
							var24 = this.aClass10Array8211[var9];
							var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var25;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.anInt159 = (var25.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var25.anInt157 = (var25.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var9 = 0; var9 < var8; var9++) {
							var10 = arg1[var9];
							if (var10 < this.anIntArrayArray8218.length) {
								var21 = this.anIntArrayArray8218[var10];
								for (var23 = 0; var23 < var21.length; var23++) {
									var25 = this.aClass10Array8211[var21[var23]];
									var25.aFloat154 = var25.aFloat154 * (float) arg2 / 128.0F;
									var25.aFloat155 = var25.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var9 = 0; var9 < var8; var9++) {
						var10 = arg1[var9];
						if (var10 < this.anIntArrayArray8218.length) {
							var21 = this.anIntArrayArray8218[var10];
							for (var23 = 0; var23 < var21.length; var23++) {
								var25 = this.aClass10Array8211[var21[var23]];
								var25.anInt158 = (var25.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var9 = 0; var9 < var8; var9++) {
					var10 = arg1[var9];
					if (var10 < this.anIntArrayArray8206.length) {
						var21 = this.anIntArrayArray8206[var10];
						for (var23 = 0; var23 < var21.length; var23++) {
							var13 = var21[var23];
							var14 = this.modelColors[var13] & 0xFFFF;
							var15 = var14 >> 10 & 0x3F;
							var16 = var14 >> 7 & 0x7;
							int var17 = var14 & 0x7F;
							var15 = var15 + arg2 & 0x3F;
							var16 += arg3;
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
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var9 = 0; var9 < this.anInt8215; var9++) {
						var22 = this.aClass20Array8216[var9];
						var24 = this.aClass10Array8211[var9];
						var24.anInt163 = (var24.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var22.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.bu(IIII)V")
	public void bu(int arg0, int arg1, int arg2, int arg3) {
		int var5;
		int var6;
		if (arg0 == 0) {
			var5 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var6 = 0; var6 < this.anInt8174; var6++) {
				this.anInt8209 += this.anIntArray8238[var6];
				this.anInt8219 += this.anIntArray8195[var6];
				this.anInt8221 += this.anIntArray8180[var6];
				var5++;
			}
			if (var5 > 0) {
				this.anInt8209 = this.anInt8209 / var5 + arg1;
				this.anInt8219 = this.anInt8219 / var5 + arg2;
				this.anInt8221 = this.anInt8221 / var5 + arg3;
			} else {
				this.anInt8209 = arg1;
				this.anInt8219 = arg2;
				this.anInt8221 = arg3;
			}
		} else if (arg0 == 1) {
			for (var5 = 0; var5 < this.anInt8174; var5++) {
				this.anIntArray8238[var5] += arg1;
				this.anIntArray8195[var5] += arg2;
				this.anIntArray8180[var5] += arg3;
			}
		} else {
			int var7;
			int var8;
			if (arg0 == 2) {
				for (var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] -= this.anInt8209;
					this.anIntArray8195[var5] -= this.anInt8219;
					this.anIntArray8180[var5] -= this.anInt8221;
					if (arg3 != 0) {
						var6 = Class257.anIntArray2683[arg3];
						var7 = Class257.anIntArray2684[arg3];
						var8 = this.anIntArray8195[var5] * var6 + this.anIntArray8238[var5] * var7 + 16383 >> 14;
						this.anIntArray8195[var5] = this.anIntArray8195[var5] * var7 - this.anIntArray8238[var5] * var6 + 16383 >> 14;
						this.anIntArray8238[var5] = var8;
					}
					if (arg1 != 0) {
						var6 = Class257.anIntArray2683[arg1];
						var7 = Class257.anIntArray2684[arg1];
						var8 = this.anIntArray8195[var5] * var7 - this.anIntArray8180[var5] * var6 + 16383 >> 14;
						this.anIntArray8180[var5] = this.anIntArray8195[var5] * var6 + this.anIntArray8180[var5] * var7 + 16383 >> 14;
						this.anIntArray8195[var5] = var8;
					}
					if (arg2 != 0) {
						var6 = Class257.anIntArray2683[arg2];
						var7 = Class257.anIntArray2684[arg2];
						var8 = this.anIntArray8180[var5] * var6 + this.anIntArray8238[var5] * var7 + 16383 >> 14;
						this.anIntArray8180[var5] = this.anIntArray8180[var5] * var7 - this.anIntArray8238[var5] * var6 + 16383 >> 14;
						this.anIntArray8238[var5] = var8;
					}
					this.anIntArray8238[var5] += this.anInt8209;
					this.anIntArray8195[var5] += this.anInt8219;
					this.anIntArray8180[var5] += this.anInt8221;
				}
			} else if (arg0 == 3) {
				for (var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] -= this.anInt8209;
					this.anIntArray8195[var5] -= this.anInt8219;
					this.anIntArray8180[var5] -= this.anInt8221;
					this.anIntArray8238[var5] = this.anIntArray8238[var5] * arg1 / 128;
					this.anIntArray8195[var5] = this.anIntArray8195[var5] * arg2 / 128;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * arg3 / 128;
					this.anIntArray8238[var5] += this.anInt8209;
					this.anIntArray8195[var5] += this.anInt8219;
					this.anIntArray8180[var5] += this.anInt8221;
				}
			} else {
				Class10 var10;
				Class20 var11;
				if (arg0 == 5) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						var6 = (this.aByteArray8200[var5] & 0xFF) + arg1 * 8;
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 255) {
							var6 = 255;
						}
						this.aByteArray8200[var5] = (byte) var6;
					}
					if (this.aClass20Array8216 != null) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var11 = this.aClass20Array8216[var5];
							var10 = this.aClass10Array8211[var5];
							var10.anInt163 = (var10.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var11.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				} else if (arg0 == 7) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						var6 = this.modelColors[var5] & 0xFFFF;
						var7 = var6 >> 10 & 0x3F;
						var8 = var6 >> 7 & 0x7;
						int var9 = var6 & 0x7F;
						var7 = var7 + arg1 & 0x3F;
						var8 += arg2;
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
					this.aBoolean8207 = true;
					if (this.aClass20Array8216 != null) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var11 = this.aClass20Array8216[var5];
							var10 = this.aClass10Array8211[var5];
							var10.anInt163 = (var10.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var11.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
						}
					}
				} else {
					Class10 var12;
					if (arg0 == 8) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.anInt159 = (var12.anInt159 * 1013441605 + arg1 * 1013441605) * 647335565;
							var12.anInt157 = (var12.anInt157 * 1685996777 + arg2 * 1685996777) * 1511969625;
						}
					} else if (arg0 == 10) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.aFloat154 = var12.aFloat154 * (float) arg1 / 128.0F;
							var12.aFloat155 = var12.aFloat155 * (float) arg2 / 128.0F;
						}
					} else if (arg0 == 9) {
						for (var5 = 0; var5 < this.anInt8215; var5++) {
							var12 = this.aClass10Array8211[var5];
							var12.anInt158 = (var12.anInt158 * 800091467 * -492325789 + arg1 & 0x3FFF) * 800091467 * -492325789;
						}
					}
				}
			}
		}
	}

	public void method4477(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8242 == null) {
			return;
		}
		Class6 var4 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		Class247 var5 = var4.aClass247_98;
		var5.method2454(arg0);
		if (arg2) {
			var5.method2459();
		}
		Class249 var6 = var4.aClass249_99;
		var6.method2508(var5);
		float[] var7 = new float[3];
		for (int var8 = 0; var8 < this.anInt8185; var8++) {
			if ((arg1 & this.aShortArray8242[var8]) != 0) {
				var6.method2511((float) this.anIntArray8238[var8], (float) this.anIntArray8195[var8], (float) this.anIntArray8180[var8], var7);
				this.anIntArray8238[var8] = (int) var7[0];
				this.anIntArray8195[var8] = (int) var7[1];
				this.anIntArray8180[var8] = (int) var7[2];
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.ed(I)V")
	public void ed(int arg0) {
		if ((this.anInt8172 & 0x5) != 5) {
			throw new IllegalStateException();
		} else if (arg0 == 4096) {
			this.method4534();
		} else if (arg0 == 8192) {
			this.method4537();
		} else if (arg0 == 12288) {
			this.method4538();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					int var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.method4540();
			}
		}
	}

	public void method4481(Class247 arg0, int arg1, boolean arg2) {
		if (this.aShortArray8242 == null) {
			return;
		}
		Class6 var4 = this.aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		Class247 var5 = var4.aClass247_98;
		var5.method2454(arg0);
		if (arg2) {
			var5.method2459();
		}
		Class249 var6 = var4.aClass249_99;
		var6.method2508(var5);
		float[] var7 = new float[3];
		for (int var8 = 0; var8 < this.anInt8185; var8++) {
			if ((arg1 & this.aShortArray8242[var8]) != 0) {
				var6.method2511((float) this.anIntArray8238[var8], (float) this.anIntArray8195[var8], (float) this.anIntArray8180[var8], var7);
				this.anIntArray8238[var8] = (int) var7[0];
				this.anIntArray8195[var8] = (int) var7[1];
				this.anIntArray8180[var8] = (int) var7[2];
			}
		}
	}

	public void method4461(Class247 arg0, Class80 arg1, int arg2) {
		this.method4541(arg0, arg1, arg2);
	}

	@ObfuscatedName("Class387_Sub3.ao(I)V")
	public void ao(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	public void method4479() {
	}

	public void method4553() {
		if (this.anInt8196 == 0) {
			this.method4532(false);
		} else if (this.aClass_ra_Sub3_8165.anInt8650 > 1) {
			synchronized (this) {
				this.method4535();
			}
		} else {
			this.method4535();
		}
	}

	@ObfuscatedName("Class387_Sub3.ia(III)V")
	public void ia(int arg0, int arg1, int arg2) {
		if (arg0 != 0 && (this.anInt8172 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (arg1 != 0 && (this.anInt8172 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (arg2 == 0 || (this.anInt8172 & 0x4) == 4) {
			synchronized (this) {
				for (int var5 = 0; var5 < this.anInt8174; var5++) {
					this.anIntArray8238[var5] += arg0;
					this.anIntArray8195[var5] += arg1;
					this.anIntArray8180[var5] += arg2;
				}
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("Class387_Sub3.wa()V")
	public void wa() {
		if ((this.anInt8172 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			int var2;
			for (var2 = 0; var2 < this.anInt8174; var2++) {
				this.anIntArray8180[var2] = -this.anIntArray8180[var2];
			}
			if (this.aClass21Array8182 != null) {
				for (var2 = 0; var2 < this.anInt8185; var2++) {
					if (this.aClass21Array8182[var2] != null) {
						this.aClass21Array8182[var2].anInt254 = -this.aClass21Array8182[var2].anInt254;
					}
				}
			}
			if (this.aClass21Array8183 != null) {
				for (var2 = 0; var2 < this.anInt8185; var2++) {
					if (this.aClass21Array8183[var2] != null) {
						this.aClass21Array8183[var2].anInt254 = -this.aClass21Array8183[var2].anInt254;
					}
				}
			}
			if (this.aClass25Array8197 != null) {
				for (var2 = 0; var2 < this.anInt8184; var2++) {
					if (this.aClass25Array8197[var2] != null) {
						this.aClass25Array8197[var2].anInt308 = -this.aClass25Array8197[var2].anInt308;
					}
				}
			}
			short[] var7 = this.aShortArray8173;
			this.aShortArray8173 = this.aShortArray8217;
			this.aShortArray8217 = var7;
			if (this.aFloatArrayArray8188 != null) {
				for (int var3 = 0; var3 < this.anInt8184; var3++) {
					float var4;
					if (this.aFloatArrayArray8188[var3] != null) {
						var4 = this.aFloatArrayArray8188[var3][0];
						this.aFloatArrayArray8188[var3][0] = this.aFloatArrayArray8188[var3][2];
						this.aFloatArrayArray8188[var3][2] = var4;
					}
					if (this.aFloatArrayArray8189[var3] != null) {
						var4 = this.aFloatArrayArray8189[var3][0];
						this.aFloatArrayArray8189[var3][0] = this.aFloatArrayArray8189[var3][2];
						this.aFloatArrayArray8189[var3][2] = var4;
					}
				}
			}
			this.aBoolean8187 = false;
			this.anInt8196 = 0;
		}
	}

	public boolean method4469(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4) {
		this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 var6 = this.aClass6_8162.aClass249_99;
		var6.method2508(arg2);
		Class249 var7 = this.aClass6_8162.aClass249_100;
		var7.method2510(var6);
		var7.method2483(this.aClass_ra_Sub3_8165.aClass249_8634);
		boolean var8 = false;
		int var9 = Integer.MAX_VALUE;
		int var10 = Integer.MIN_VALUE;
		int var11 = Integer.MAX_VALUE;
		int var12 = Integer.MIN_VALUE;
		if (!this.aBoolean8187) {
			this.method4547();
		}
		int var13 = this.aShort8225 - this.aShort8224 >> 1;
		int var14 = this.aShort8223 - this.aShort8214 >> 1;
		int var15 = this.aShort8227 - this.aShort8226 >> 1;
		int var16 = this.aShort8224 + var13;
		int var17 = this.aShort8214 + var14;
		int var18 = this.aShort8226 + var15;
		int var19 = var16 - (var13 << arg4);
		int var20 = var17 - (var14 << arg4);
		int var21 = var18 - (var15 << arg4);
		int var22 = var16 + (var13 << arg4);
		int var23 = var17 + (var14 << arg4);
		int var24 = var18 + (var15 << arg4);
		this.anIntArray8177[0] = var19;
		this.anIntArray8178[0] = var20;
		this.anIntArray8179[0] = var21;
		this.anIntArray8177[1] = var22;
		this.anIntArray8178[1] = var20;
		this.anIntArray8179[1] = var21;
		this.anIntArray8177[2] = var19;
		this.anIntArray8178[2] = var23;
		this.anIntArray8179[2] = var21;
		this.anIntArray8177[3] = var22;
		this.anIntArray8178[3] = var23;
		this.anIntArray8179[3] = var21;
		this.anIntArray8177[4] = var19;
		this.anIntArray8178[4] = var20;
		this.anIntArray8179[4] = var24;
		this.anIntArray8177[5] = var22;
		this.anIntArray8178[5] = var20;
		this.anIntArray8179[5] = var24;
		this.anIntArray8177[6] = var19;
		this.anIntArray8178[6] = var23;
		this.anIntArray8179[6] = var24;
		this.anIntArray8177[7] = var22;
		this.anIntArray8178[7] = var23;
		this.anIntArray8179[7] = var24;
		int var25;
		int var26;
		int var27;
		int var28;
		float var29;
		float var30;
		float var31;
		float var32;
		for (var25 = 0; var25 < 8; var25++) {
			var26 = this.anIntArray8177[var25];
			var27 = this.anIntArray8178[var25];
			var28 = this.anIntArray8179[var25];
			var29 = var7.aFloatArray2631[2] * (float) var26 + var7.aFloatArray2631[6] * (float) var27 + var7.aFloatArray2631[10] * (float) var28 + var7.aFloatArray2631[14];
			var30 = var7.aFloatArray2631[3] * (float) var26 + var7.aFloatArray2631[7] * (float) var27 + var7.aFloatArray2631[11] * (float) var28 + var7.aFloatArray2631[15];
			if (var29 >= -var30) {
				var31 = var7.aFloatArray2631[0] * (float) var26 + var7.aFloatArray2631[4] * (float) var27 + var7.aFloatArray2631[8] * (float) var28 + var7.aFloatArray2631[12];
				var32 = var7.aFloatArray2631[1] * (float) var26 + var7.aFloatArray2631[5] * (float) var27 + var7.aFloatArray2631[9] * (float) var28 + var7.aFloatArray2631[13];
				int var33 = (int) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var31 / var30);
				int var34 = (int) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var32 / var30);
				if (var33 < var9) {
					var9 = var33;
				}
				if (var33 > var10) {
					var10 = var33;
				}
				if (var34 < var11) {
					var11 = var34;
				}
				if (var34 > var12) {
					var12 = var34;
				}
				var8 = true;
			}
		}
		if (var8 && arg0 > var9 && arg0 < var10 && arg1 > var11 && arg1 < var12) {
			if (arg3) {
				return true;
			}
			for (var25 = 0; var25 < this.anInt8174; var25++) {
				var26 = this.anIntArray8238[var25];
				var27 = this.anIntArray8195[var25];
				var28 = this.anIntArray8180[var25];
				var29 = var7.aFloatArray2631[2] * (float) var26 + var7.aFloatArray2631[6] * (float) var27 + var7.aFloatArray2631[10] * (float) var28 + var7.aFloatArray2631[14];
				var30 = var7.aFloatArray2631[3] * (float) var26 + var7.aFloatArray2631[7] * (float) var27 + var7.aFloatArray2631[11] * (float) var28 + var7.aFloatArray2631[15];
				if (var29 >= -var30) {
					var31 = var7.aFloatArray2631[0] * (float) var26 + var7.aFloatArray2631[4] * (float) var27 + var7.aFloatArray2631[8] * (float) var28 + var7.aFloatArray2631[12];
					var32 = var7.aFloatArray2631[1] * (float) var26 + var7.aFloatArray2631[5] * (float) var27 + var7.aFloatArray2631[9] * (float) var28 + var7.aFloatArray2631[13];
					this.aFloatArray8232[var25] = (float) (this.aClass_ra_Sub3_8165.aFloat8641 + this.aClass_ra_Sub3_8165.aFloat8640 * var31 / var30);
					this.aFloatArray8233[var25] = (float) (this.aClass_ra_Sub3_8165.aFloat8643 + this.aClass_ra_Sub3_8165.aFloat8642 * var32 / var30);
				} else {
					this.aFloatArray8232[var25] = -999999.0F;
				}
			}
			for (var25 = 0; var25 < this.anInt8184; var25++) {
				if (this.aFloatArray8232[this.aShortArray8173[var25]] != -999999.0F && this.aFloatArray8232[this.aShortArray8186[var25]] != -999999.0F && this.aFloatArray8232[this.aShortArray8217[var25]] != -999999.0F && this.method4546(arg0, arg1, this.aFloatArray8233[this.aShortArray8173[var25]], this.aFloatArray8233[this.aShortArray8186[var25]], this.aFloatArray8233[this.aShortArray8217[var25]], this.aFloatArray8232[this.aShortArray8173[var25]], this.aFloatArray8232[this.aShortArray8186[var25]], this.aFloatArray8232[this.aShortArray8217[var25]])) {
					return true;
				}
			}
		}
		return false;
	}

	public void method4465(Class247 arg0) {
		this.method4529(this.aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 var2 = this.aClass6_8162.aClass249_99;
		var2.method2508(arg0);
		int var3;
		if (this.aClass93Array8213 != null) {
			for (var3 = 0; var3 < this.aClass93Array8213.length; var3++) {
				Class93 var4 = this.aClass93Array8213[var3];
				Class93 var5 = var4;
				if (var4.aClass93_833 != null) {
					var5 = var4.aClass93_833;
				}
				var5.anInt838 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt841 * -575024885 * -1670679901]) * 432673201 * -1343121583;
				var5.anInt832 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt841 * -575024885 * -1670679901]) * -1138862783 * 76626625;
				var5.anInt840 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt841 * -575024885 * -1670679901] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt841 * -575024885 * -1670679901]) * -555868357 * 214524403;
				var5.anInt837 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt835 * -1090746067 * -614748507]) * -707023853 * -37814757;
				var5.anInt842 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt835 * -1090746067 * -614748507]) * -648890367 * -1964161023;
				var5.anInt845 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt835 * -1090746067 * -614748507] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt835 * -1090746067 * -614748507]) * -1672139309 * 1731506779;
				var5.anInt839 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var4.anInt836 * 1207374163 * -878748965]) * 488615051 * 599939875;
				var5.anInt844 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var4.anInt836 * 1207374163 * -878748965]) * 197668655 * 1664972751;
				var5.anInt846 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var4.anInt836 * 1207374163 * -878748965] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var4.anInt836 * 1207374163 * -878748965]) * 471540135 * 1194030615;
			}
		}
		if (this.aClass64Array8160 == null) {
			return;
		}
		for (var3 = 0; var3 < this.aClass64Array8160.length; var3++) {
			Class64 var6 = this.aClass64Array8160[var3];
			Class64 var7 = var6;
			if (var6.aClass64_562 != null) {
				var7 = var6.aClass64_562;
			}
			if (var6.aClass249_568 == null) {
				var6.aClass249_568 = new Class249(var2);
			} else {
				var6.aClass249_568.method2510(var2);
			}
			var7.anInt565 = (int) (var2.aFloatArray2631[12] + var2.aFloatArray2631[0] * (float) this.anIntArray8238[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[4] * (float) this.anIntArray8195[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[8] * (float) this.anIntArray8180[var6.anInt566 * 2126578851 * 1669844747]) * -686746519 * -1407861799;
			var7.anInt563 = (int) (var2.aFloatArray2631[13] + var2.aFloatArray2631[1] * (float) this.anIntArray8238[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[5] * (float) this.anIntArray8195[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[9] * (float) this.anIntArray8180[var6.anInt566 * 2126578851 * 1669844747]) * -635472619 * -1713950147;
			var7.anInt567 = (int) (var2.aFloatArray2631[14] + var2.aFloatArray2631[2] * (float) this.anIntArray8238[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[6] * (float) this.anIntArray8195[var6.anInt566 * 2126578851 * 1669844747] + var2.aFloatArray2631[10] * (float) this.anIntArray8180[var6.anInt566 * 2126578851 * 1669844747]) * 1225142127 * -1854140529;
		}
	}

	@ObfuscatedName("Class387_Sub3.ce(LClass_na;)LClass_na;")
	public Class_na ce(Class_na arg0) {
		return null;
	}

	public boolean method4462() {
		if (this.aShortArray8201 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.aShortArray8201.length; var1++) {
			if (this.aShortArray8201[var1] != -1 && !this.aClass_ra_Sub3_8165.method5189(this.aShortArray8201[var1])) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub3.cj()I")
	public int cj() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8198;
	}

	@ObfuscatedName("Class387_Sub3.cy()I")
	public int cy() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8198;
	}

	@ObfuscatedName("Class387_Sub3.cb()I")
	public int cb() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8198;
	}

	@ObfuscatedName("Class387_Sub3.ct()I")
	public int ct() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8224;
	}

	@ObfuscatedName("Class387_Sub3.cd()I")
	public int cd() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8225;
	}

	@ObfuscatedName("Class387_Sub3.o()I")
	public int o() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8223;
	}

	@ObfuscatedName("Class387_Sub3.co()I")
	public int co() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8214;
	}

	@ObfuscatedName("Class387_Sub3.RA()I")
	public int RA() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8224;
	}

	@ObfuscatedName("Class387_Sub3.cw()I")
	public int cw() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8223;
	}

	@ObfuscatedName("Class387_Sub3.cq()I")
	public int cq() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8223;
	}

	@ObfuscatedName("Class387_Sub3.ci()I")
	public int ci() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8223;
	}

	@ObfuscatedName("Class387_Sub3.cs()I")
	public int cs() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8226;
	}

	@ObfuscatedName("Class387_Sub3.dz()[B")
	public byte[] dz() {
		return this.aByteArray8200;
	}

	@ObfuscatedName("Class387_Sub3.ck(I)V")
	public void ck(int arg0) {
		if ((this.anInt8172 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt8236 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.cl(I)V")
	public void cl(int arg0) {
		if ((this.anInt8172 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt8236 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.cp(I)V")
	public void cp(int arg0) {
		if ((this.anInt8172 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		this.anInt8236 = arg0;
		this.anInt8196 = 0;
	}

	@ObfuscatedName("Class387_Sub3.er(I[IIIIZI[I)V")
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8205.length) {
					int[] var13 = this.anIntArrayArray8205[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var15]) != 0) {
							this.anInt8209 += this.anIntArray8238[var15];
							this.anInt8219 += this.anIntArray8195[var15];
							this.anInt8221 += this.anIntArray8180[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8209 = this.anInt8209 / var10 + arg2;
				this.anInt8219 = this.anInt8219 / var10 + arg3;
				this.anInt8221 = this.anInt8221 / var10 + arg4;
				this.aBoolean8212 = true;
			} else {
				this.anInt8209 = arg2;
				this.anInt8219 = arg3;
				this.anInt8221 = arg4;
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] += arg2;
							this.anIntArray8195[var14] += arg3;
							this.anIntArray8180[var14] += arg4;
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
					if (var11 < this.anIntArrayArray8205.length) {
						var47 = this.anIntArrayArray8205[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
								this.anIntArray8238[var14] -= this.anInt8209;
								this.anIntArray8195[var14] -= this.anInt8219;
								this.anIntArray8180[var14] -= this.anInt8221;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8195[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = this.anIntArray8195[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8195[var14] * var16 - this.anIntArray8180[var14] * var15 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8195[var14] * var15 + this.anIntArray8180[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8180[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8180[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								this.anIntArray8238[var14] += this.anInt8209;
								this.anIntArray8195[var14] += this.anInt8219;
								this.anIntArray8180[var14] += this.anInt8221;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean8208) {
					for (var10 = 0; var10 < this.anInt8174; var10++) {
						this.anIntArray8238[var10] <<= 0x4;
						this.anIntArray8195[var10] <<= 0x4;
						this.anIntArray8180[var10] <<= 0x4;
					}
					this.aBoolean8208 = true;
				}
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8212) {
					var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var55 = var18 + var15;
					this.anInt8209 = var51;
					this.anInt8219 = var54;
					this.anInt8221 = var55;
					this.aBoolean8212 = false;
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
				int var25 = var52[0] * -this.anInt8209 + var52[1] * -this.anInt8219 + var52[2] * -this.anInt8221 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8209 + var52[4] * -this.anInt8219 + var52[5] * -this.anInt8221 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8209 + var52[7] * -this.anInt8219 + var52[8] * -this.anInt8221 + 8192 >> 14;
				var28 = var25 + this.anInt8209;
				int var29 = var26 + this.anInt8219;
				var30 = var27 + this.anInt8221;
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
					if (var40 < this.anIntArrayArray8205.length) {
						int[] var41 = this.anIntArrayArray8205[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8238[var43] + var59[1] * this.anIntArray8195[var43] + var59[2] * this.anIntArray8180[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8238[var43] + var59[4] * this.anIntArray8195[var43] + var59[5] * this.anIntArray8180[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8238[var43] + var59[7] * this.anIntArray8195[var43] + var59[8] * this.anIntArray8180[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8238[var43] = var60;
								this.anIntArray8195[var43] = var61;
								this.anIntArray8180[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class20 var49;
			Class10 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8206.length) {
							var47 = this.anIntArrayArray8206[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
									var15 = (this.aByteArray8200[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8200[var14] = (byte) var15;
								}
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var10 = 0; var10 < this.anInt8215; var10++) {
							var49 = this.aClass20Array8216[var10];
							var50 = this.aClass10Array8211[var10];
							var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var53;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.anInt159 = (var53.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var53.anInt157 = (var53.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.aFloat154 = var53.aFloat154 * (float) arg2 / 128.0F;
									var53.aFloat155 = var53.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8218.length) {
							var47 = this.anIntArrayArray8218[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var53 = this.aClass10Array8211[var47[var48]];
								var53.anInt158 = (var53.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8206.length) {
						var47 = this.anIntArrayArray8206[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3;
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
						}
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var10 = 0; var10 < this.anInt8215; var10++) {
						var49 = this.aClass20Array8216[var10];
						var50 = this.aClass10Array8211[var10];
						var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] -= this.anInt8209;
							this.anIntArray8195[var14] -= this.anInt8219;
							this.anIntArray8180[var14] -= this.anInt8221;
							this.anIntArray8238[var14] = this.anIntArray8238[var14] * arg2 / 128;
							this.anIntArray8195[var14] = this.anIntArray8195[var14] * arg3 / 128;
							this.anIntArray8180[var14] = this.anIntArray8180[var14] * arg4 / 128;
							this.anIntArray8238[var14] += this.anInt8209;
							this.anIntArray8195[var14] += this.anInt8219;
							this.anIntArray8180[var14] += this.anInt8221;
						}
					}
				}
			}
		} else {
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (this.aBoolean8212) {
				var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8209 = var16;
				this.anInt8219 = var17;
				this.anInt8221 = var18;
				this.aBoolean8212 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8209 + 8192 >> 14;
			var20 = var17 * -this.anInt8219 + 8192 >> 14;
			var21 = var18 * -this.anInt8221 + 8192 >> 14;
			var22 = var19 + this.anInt8209;
			var23 = var20 + this.anInt8219;
			var24 = var21 + this.anInt8221;
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
				if (var34 < this.anIntArrayArray8205.length) {
					var59 = this.anIntArrayArray8205[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8238[var37] + var57[1] * this.anIntArray8195[var37] + var57[2] * this.anIntArray8180[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8238[var37] + var57[4] * this.anIntArray8195[var37] + var57[5] * this.anIntArray8180[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8238[var37] + var57[7] * this.anIntArray8195[var37] + var57[8] * this.anIntArray8180[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8238[var37] = var38;
							this.anIntArray8195[var37] = var39;
							this.anIntArray8180[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.bk(I)V")
	public void bk(int arg0) {
		if ((this.anInt8172 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int var2 = Class257.anIntArray2683[arg0];
		int var3 = Class257.anIntArray2684[arg0];
		synchronized (this) {
			for (int var5 = 0; var5 < this.anInt8174; var5++) {
				int var6 = this.anIntArray8195[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
				this.anIntArray8195[var5] = this.anIntArray8195[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
				this.anIntArray8238[var5] = var6;
			}
			this.method4540();
		}
	}

	public void method4455() {
		if (this.aClass_ra_Sub3_8165.anInt8650 <= 1) {
			return;
		}
		synchronized (this) {
			while (this.aBoolean3990) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.aBoolean3990 = true;
		}
	}

	public Class93[] method4476() {
		return this.aClass93Array8213;
	}

	@ObfuscatedName("Class387_Sub3.cx()I")
	public int cx() {
		return this.anInt8236;
	}

	@ObfuscatedName("Class387_Sub3.cn()I")
	public int cn() {
		if (!this.aBoolean8187) {
			this.method4547();
		}
		return this.aShort8225;
	}

	@ObfuscatedName("Class387_Sub3.ew()Z")
	public boolean ew() {
		return this.aBoolean8228;
	}

	@ObfuscatedName("Class387_Sub3.ds()I")
	public int ds() {
		return this.anInt8176;
	}

	public Class64[] method4452() {
		return this.aClass64Array8160;
	}

	public void method_do(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = (var5.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex * 1028839953 * 1557092081], (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public final void method4554(boolean arg0, boolean arg1, boolean arg2, int arg3) {
		short var5 = this.aShortArray8173[arg3];
		short var6 = this.aShortArray8186[arg3];
		short var7 = this.aShortArray8217[arg3];
		if (this.aShortArray8201 != null && this.aShortArray8201[arg3] != -1) {
			int var8 = -16777216;
			if (this.aByteArray8200 != null) {
				var8 = 255 - (this.aByteArray8200[arg3] & 0xFF) << 24;
			}
			if (this.anIntArray8192[arg3] == -1) {
				int var9 = var8 | this.anIntArray8190[arg3] & 0xFFFFFF;
				this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var9, var9, var9, this.aClass6_8162.anInt88, 0.0F, 0.0F, 0.0F, this.aShortArray8201[arg3]);
			} else {
				this.aClass38_8164.method541(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], this.aFloatArray8235[var5], this.aFloatArray8235[var6], this.aFloatArray8235[var7], this.aFloatArrayArray8188[arg3][0], this.aFloatArrayArray8188[arg3][1], this.aFloatArrayArray8188[arg3][2], this.aFloatArrayArray8189[arg3][0], this.aFloatArrayArray8189[arg3][1], this.aFloatArrayArray8189[arg3][2], var8 | this.anIntArray8190[arg3] & 0xFFFFFF, var8 | this.anIntArray8191[arg3] & 0xFFFFFF, var8 | this.anIntArray8192[arg3] & 0xFFFFFF, this.aClass6_8162.anInt88, 0.0F, 0.0F, 0.0F, this.aShortArray8201[arg3]);
			}
			return;
		}
		if (this.aByteArray8200 == null) {
			this.aClass38_8164.anInt402 = 0;
		} else {
			this.aClass38_8164.anInt402 = this.aByteArray8200[arg3] & 0xFF;
		}
		if (this.anIntArray8192[arg3] == -1) {
			this.aClass38_8164.method539(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], Console.anIntArray4263[this.anIntArray8190[arg3] & 0xFFFF]);
		} else {
			this.aClass38_8164.method544(arg0, arg1, arg2, this.aFloatArray8233[var5], this.aFloatArray8233[var6], this.aFloatArray8233[var7], this.aFloatArray8232[var5], this.aFloatArray8232[var6], this.aFloatArray8232[var7], this.aFloatArray8234[var5], this.aFloatArray8234[var6], this.aFloatArray8234[var7], (float) (this.anIntArray8190[arg3] & 0xFFFF), (float) (this.anIntArray8191[arg3] & 0xFFFF), (float) (this.anIntArray8192[arg3] & 0xFFFF));
		}
	}

	@ObfuscatedName("Class387_Sub3.dh(SS)V")
	public void dh(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = (var5.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex * 1028839953 * 1557092081], (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	@ObfuscatedName("Class387_Sub3.dt(SS)V")
	public void dt(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = (var5.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex * 1028839953 * 1557092081], (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	@ObfuscatedName("Class387_Sub3.dq(SS)V")
	public void dq(short arg0, short arg1) {
		int var3;
		for (var3 = 0; var3 < this.anInt8184; var3++) {
			if (this.modelColors[var3] == arg0) {
				this.modelColors[var3] = arg1;
			}
		}
		if (this.aClass20Array8216 != null) {
			for (var3 = 0; var3 < this.anInt8215; var3++) {
				Class20 var4 = this.aClass20Array8216[var3];
				Class10 var5 = this.aClass10Array8211[var3];
				var5.anInt163 = (var5.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var4.modelColorIndex * 1028839953 * 1557092081], (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4482(byte arg0, byte[] arg1) {
		if ((this.anInt8172 & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (this.aByteArray8200 == null) {
			this.aByteArray8200 = new byte[this.anInt8184];
		}
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				this.aByteArray8200[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8200[var3] = (byte) var4;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4486(byte arg0, byte[] arg1) {
		if ((this.anInt8172 & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (this.aByteArray8200 == null) {
			this.aByteArray8200 = new byte[this.anInt8184];
		}
		int var3;
		if (arg1 == null) {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				this.aByteArray8200[var3] = arg0;
			}
		} else {
			for (var3 = 0; var3 < this.anInt8184; var3++) {
				int var4 = 255 - (255 - (arg1[var3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8200[var3] = (byte) var4;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	@ObfuscatedName("Class387_Sub3.dj(SS)V")
	public void dj(short arg0, short arg1) {
		if (this.aShortArray8201 == null) {
			return;
		}
		if (!this.aBoolean8229 && arg1 >= 0) {
			Class56 var3 = this.aClass_ra_Sub3_8165.anInterface_ma4227.method221(arg1 & 0xFFFF, 927426409);
			if (var3.aByte531 != 0 || var3.aByte530 != 0) {
				this.aBoolean8229 = true;
			}
		}
		for (int var4 = 0; var4 < this.anInt8184; var4++) {
			if (this.aShortArray8201[var4] == arg0) {
				this.aShortArray8201[var4] = arg1;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.dl(SS)V")
	public void dl(short arg0, short arg1) {
		if (this.aShortArray8201 == null) {
			return;
		}
		if (!this.aBoolean8229 && arg1 >= 0) {
			Class56 var3 = this.aClass_ra_Sub3_8165.anInterface_ma4227.method221(arg1 & 0xFFFF, -1924332833);
			if (var3.aByte531 != 0 || var3.aByte530 != 0) {
				this.aBoolean8229 = true;
			}
		}
		for (int var4 = 0; var4 < this.anInt8184; var4++) {
			if (this.aShortArray8201[var4] == arg0) {
				this.aShortArray8201[var4] = arg1;
			}
		}
	}

	public final boolean method4555(int arg0) {
		if (this.aByteArray8200 == null) {
			return false;
		} else {
			return this.aByteArray8200[arg0] != 0;
		}
	}

	@ObfuscatedName("Class387_Sub3.du(IIII)V")
	public void du(int arg0, int arg1, int arg2, int arg3) {
		if ((this.anInt8172 & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		int var5;
		for (var5 = 0; var5 < this.anInt8184; var5++) {
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
		if (this.aClass20Array8216 != null) {
			for (var5 = 0; var5 < this.anInt8215; var5++) {
				Class20 var10 = this.aClass20Array8216[var5];
				Class10 var11 = this.aClass10Array8211[var5];
				var11.anInt163 = (var11.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var10.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	@ObfuscatedName("Class387_Sub3.df(IIII)V")
	public void df(int arg0, int arg1, int arg2, int arg3) {
		if ((this.anInt8172 & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		int var5;
		for (var5 = 0; var5 < this.anInt8184; var5++) {
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
		if (this.aClass20Array8216 != null) {
			for (var5 = 0; var5 < this.anInt8215; var5++) {
				Class20 var10 = this.aClass20Array8216[var5];
				Class10 var11 = this.aClass10Array8211[var5];
				var11.anInt163 = (var11.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var10.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
			}
		}
		if (this.anInt8196 == 2) {
			this.anInt8196 = 1;
		}
	}

	public void method4556() {
		synchronized (this) {
			int var2;
			int var3;
			for (var2 = 0; var2 < this.anInt8185; var2++) {
				var3 = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = -var3;
				if (this.aClass21Array8182[var2] != null) {
					var3 = this.aClass21Array8182[var2].anInt254;
					this.aClass21Array8182[var2].anInt254 = this.aClass21Array8182[var2].anInt252;
					this.aClass21Array8182[var2].anInt252 = -var3;
				}
			}
			if (this.aClass25Array8197 != null) {
				for (var2 = 0; var2 < this.anInt8184; var2++) {
					if (this.aClass25Array8197[var2] != null) {
						var3 = this.aClass25Array8197[var2].anInt308;
						this.aClass25Array8197[var2].anInt308 = this.aClass25Array8197[var2].anInt306;
						this.aClass25Array8197[var2].anInt306 = -var3;
					}
				}
			}
			for (var2 = this.anInt8185; var2 < this.anInt8174; var2++) {
				var3 = this.anIntArray8180[var2];
				this.anIntArray8180[var2] = this.anIntArray8238[var2];
				this.anIntArray8238[var2] = -var3;
			}
			this.anInt8196 = 0;
			this.aBoolean8187 = false;
		}
	}

	@ObfuscatedName("Class387_Sub3.am()I")
	public int am() {
		return this.anInt8172;
	}

	public Class64[] method4484() {
		return this.aClass64Array8160;
	}

	@ObfuscatedName("Class387_Sub3.dr()[B")
	public byte[] dr() {
		return this.aByteArray8200;
	}

	public boolean method4487() {
		if (this.aShortArray8201 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.aShortArray8201.length; var1++) {
			if (this.aShortArray8201[var1] != -1 && !this.aClass_ra_Sub3_8165.method5189(this.aShortArray8201[var1])) {
				return false;
			}
		}
		return true;
	}

	public boolean method4471() {
		if (this.aShortArray8201 == null) {
			return true;
		}
		for (int var1 = 0; var1 < this.aShortArray8201.length; var1++) {
			if (this.aShortArray8201[var1] != -1 && !this.aClass_ra_Sub3_8165.method5189(this.aShortArray8201[var1])) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("Class387_Sub3.dw()Z")
	public boolean dw() {
		return this.aBoolean8229;
	}

	@ObfuscatedName("Class387_Sub3.bs(I)V")
	public void bs(int arg0) {
		if ((this.anInt8172 & 0xD) != 13) {
			throw new IllegalStateException();
		} else if (this.aClass21Array8182 == null) {
			this.f(arg0);
		} else if (arg0 == 4096) {
			this.method4550();
		} else if (arg0 == 8192) {
			this.method4539();
		} else if (arg0 == 12288) {
			this.method4556();
		} else {
			int var2 = Class257.anIntArray2683[arg0];
			int var3 = Class257.anIntArray2684[arg0];
			synchronized (this) {
				int var5;
				int var6;
				for (var5 = 0; var5 < this.anInt8185; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
					if (this.aClass21Array8182[var5] != null) {
						var6 = this.aClass21Array8182[var5].anInt254 * var2 + this.aClass21Array8182[var5].anInt252 * var3 >> 14;
						this.aClass21Array8182[var5].anInt254 = this.aClass21Array8182[var5].anInt254 * var3 - this.aClass21Array8182[var5].anInt252 * var2 >> 14;
						this.aClass21Array8182[var5].anInt252 = var6;
					}
				}
				if (this.aClass25Array8197 != null) {
					for (var5 = 0; var5 < this.anInt8184; var5++) {
						if (this.aClass25Array8197[var5] != null) {
							var6 = this.aClass25Array8197[var5].anInt308 * var2 + this.aClass25Array8197[var5].anInt306 * var3 >> 14;
							this.aClass25Array8197[var5].anInt308 = this.aClass25Array8197[var5].anInt308 * var3 - this.aClass25Array8197[var5].anInt306 * var2 >> 14;
							this.aClass25Array8197[var5].anInt306 = var6;
						}
					}
				}
				for (var5 = this.anInt8185; var5 < this.anInt8174; var5++) {
					var6 = this.anIntArray8180[var5] * var2 + this.anIntArray8238[var5] * var3 >> 14;
					this.anIntArray8180[var5] = this.anIntArray8180[var5] * var3 - this.anIntArray8238[var5] * var2 >> 14;
					this.anIntArray8238[var5] = var6;
				}
				this.anInt8196 = 0;
				this.aBoolean8187 = false;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.ej()V")
	public void ej() {
		if ((this.anInt8172 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			int var2;
			for (var2 = 0; var2 < this.anInt8174; var2++) {
				this.anIntArray8180[var2] = -this.anIntArray8180[var2];
			}
			if (this.aClass21Array8182 != null) {
				for (var2 = 0; var2 < this.anInt8185; var2++) {
					if (this.aClass21Array8182[var2] != null) {
						this.aClass21Array8182[var2].anInt254 = -this.aClass21Array8182[var2].anInt254;
					}
				}
			}
			if (this.aClass21Array8183 != null) {
				for (var2 = 0; var2 < this.anInt8185; var2++) {
					if (this.aClass21Array8183[var2] != null) {
						this.aClass21Array8183[var2].anInt254 = -this.aClass21Array8183[var2].anInt254;
					}
				}
			}
			if (this.aClass25Array8197 != null) {
				for (var2 = 0; var2 < this.anInt8184; var2++) {
					if (this.aClass25Array8197[var2] != null) {
						this.aClass25Array8197[var2].anInt308 = -this.aClass25Array8197[var2].anInt308;
					}
				}
			}
			short[] var7 = this.aShortArray8173;
			this.aShortArray8173 = this.aShortArray8217;
			this.aShortArray8217 = var7;
			if (this.aFloatArrayArray8188 != null) {
				for (int var3 = 0; var3 < this.anInt8184; var3++) {
					float var4;
					if (this.aFloatArrayArray8188[var3] != null) {
						var4 = this.aFloatArrayArray8188[var3][0];
						this.aFloatArrayArray8188[var3][0] = this.aFloatArrayArray8188[var3][2];
						this.aFloatArrayArray8188[var3][2] = var4;
					}
					if (this.aFloatArrayArray8189[var3] != null) {
						var4 = this.aFloatArrayArray8189[var3][0];
						this.aFloatArrayArray8189[var3][0] = this.aFloatArrayArray8189[var3][2];
						this.aFloatArrayArray8189[var3][2] = var4;
					}
				}
			}
			this.aBoolean8187 = false;
			this.anInt8196 = 0;
		}
	}

	@ObfuscatedName("Class387_Sub3.dp()Z")
	public boolean dp() {
		return this.aBoolean8229;
	}

	@ObfuscatedName("Class387_Sub3.em()Z")
	public boolean em() {
		return this.aBoolean8228;
	}

	public void method4489() {
		if (this.aClass_ra_Sub3_8165.anInt8650 * -76798145 * -595900225 <= 1) {
			return;
		}
		synchronized (this) {
			while (this.aBoolean3990) {
				try {
					this.wait();
				} catch (InterruptedException var4) {
				}
			}
			this.aBoolean3990 = true;
		}
	}

	@ObfuscatedName("Class387_Sub3.ei()Z")
	public boolean ei() {
		if (this.anIntArrayArray8205 == null) {
			return false;
		} else {
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			return true;
		}
	}

	public void paintTexture(short arg0, short arg1) {
		if (this.aShortArray8201 == null) {
			return;
		}
		if (!this.aBoolean8229 && arg1 >= 0) {
			Class56 var3 = this.aClass_ra_Sub3_8165.anInterface_ma4227.method221(arg1 & 0xFFFF, 1052663566);
			if (var3.aByte531 != 0 || var3.aByte530 != 0) {
				this.aBoolean8229 = true;
			}
		}
		for (int var4 = 0; var4 < this.anInt8184; var4++) {
			if (this.aShortArray8201[var4] == arg0) {
				this.aShortArray8201[var4] = arg1;
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.en(I[IIIIZI[I)V")
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8205.length) {
					int[] var13 = this.anIntArrayArray8205[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var15]) != 0) {
							this.anInt8209 += this.anIntArray8238[var15];
							this.anInt8219 += this.anIntArray8195[var15];
							this.anInt8221 += this.anIntArray8180[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8209 = this.anInt8209 / var10 + arg2;
				this.anInt8219 = this.anInt8219 / var10 + arg3;
				this.anInt8221 = this.anInt8221 / var10 + arg4;
				this.aBoolean8212 = true;
			} else {
				this.anInt8209 = arg2;
				this.anInt8219 = arg3;
				this.anInt8221 = arg4;
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] += arg2;
							this.anIntArray8195[var14] += arg3;
							this.anIntArray8180[var14] += arg4;
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
					if (var11 < this.anIntArrayArray8205.length) {
						var47 = this.anIntArrayArray8205[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
								this.anIntArray8238[var14] -= this.anInt8209;
								this.anIntArray8195[var14] -= this.anInt8219;
								this.anIntArray8180[var14] -= this.anInt8221;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8195[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = this.anIntArray8195[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8195[var14] * var16 - this.anIntArray8180[var14] * var15 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8195[var14] * var15 + this.anIntArray8180[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8180[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8180[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								this.anIntArray8238[var14] += this.anInt8209;
								this.anIntArray8195[var14] += this.anInt8219;
								this.anIntArray8180[var14] += this.anInt8221;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean8208) {
					for (var10 = 0; var10 < this.anInt8174; var10++) {
						this.anIntArray8238[var10] <<= 0x4;
						this.anIntArray8195[var10] <<= 0x4;
						this.anIntArray8180[var10] <<= 0x4;
					}
					this.aBoolean8208 = true;
				}
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8212) {
					var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var55 = var18 + var15;
					this.anInt8209 = var51;
					this.anInt8219 = var54;
					this.anInt8221 = var55;
					this.aBoolean8212 = false;
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
				int var25 = var52[0] * -this.anInt8209 + var52[1] * -this.anInt8219 + var52[2] * -this.anInt8221 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8209 + var52[4] * -this.anInt8219 + var52[5] * -this.anInt8221 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8209 + var52[7] * -this.anInt8219 + var52[8] * -this.anInt8221 + 8192 >> 14;
				var28 = var25 + this.anInt8209;
				int var29 = var26 + this.anInt8219;
				var30 = var27 + this.anInt8221;
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
					if (var40 < this.anIntArrayArray8205.length) {
						int[] var41 = this.anIntArrayArray8205[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8238[var43] + var59[1] * this.anIntArray8195[var43] + var59[2] * this.anIntArray8180[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8238[var43] + var59[4] * this.anIntArray8195[var43] + var59[5] * this.anIntArray8180[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8238[var43] + var59[7] * this.anIntArray8195[var43] + var59[8] * this.anIntArray8180[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8238[var43] = var60;
								this.anIntArray8195[var43] = var61;
								this.anIntArray8180[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class20 var49;
			Class10 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8206.length) {
							var47 = this.anIntArrayArray8206[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
									var15 = (this.aByteArray8200[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8200[var14] = (byte) var15;
								}
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var10 = 0; var10 < this.anInt8215; var10++) {
							var49 = this.aClass20Array8216[var10];
							var50 = this.aClass10Array8211[var10];
							var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var53;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.anInt159 = (var53.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var53.anInt157 = (var53.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.aFloat154 = var53.aFloat154 * (float) arg2 / 128.0F;
									var53.aFloat155 = var53.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8218.length) {
							var47 = this.anIntArrayArray8218[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var53 = this.aClass10Array8211[var47[var48]];
								var53.anInt158 = (var53.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8206.length) {
						var47 = this.anIntArrayArray8206[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3;
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
						}
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var10 = 0; var10 < this.anInt8215; var10++) {
						var49 = this.aClass20Array8216[var10];
						var50 = this.aClass10Array8211[var10];
						var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] -= this.anInt8209;
							this.anIntArray8195[var14] -= this.anInt8219;
							this.anIntArray8180[var14] -= this.anInt8221;
							this.anIntArray8238[var14] = this.anIntArray8238[var14] * arg2 / 128;
							this.anIntArray8195[var14] = this.anIntArray8195[var14] * arg3 / 128;
							this.anIntArray8180[var14] = this.anIntArray8180[var14] * arg4 / 128;
							this.anIntArray8238[var14] += this.anInt8209;
							this.anIntArray8195[var14] += this.anInt8219;
							this.anIntArray8180[var14] += this.anInt8221;
						}
					}
				}
			}
		} else {
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (this.aBoolean8212) {
				var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8209 = var16;
				this.anInt8219 = var17;
				this.anInt8221 = var18;
				this.aBoolean8212 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8209 + 8192 >> 14;
			var20 = var17 * -this.anInt8219 + 8192 >> 14;
			var21 = var18 * -this.anInt8221 + 8192 >> 14;
			var22 = var19 + this.anInt8209;
			var23 = var20 + this.anInt8219;
			var24 = var21 + this.anInt8221;
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
				if (var34 < this.anIntArrayArray8205.length) {
					var59 = this.anIntArrayArray8205[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8238[var37] + var57[1] * this.anIntArray8195[var37] + var57[2] * this.anIntArray8180[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8238[var37] + var57[4] * this.anIntArray8195[var37] + var57[5] * this.anIntArray8180[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8238[var37] + var57[7] * this.anIntArray8195[var37] + var57[8] * this.anIntArray8180[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8238[var37] = var38;
							this.anIntArray8195[var37] = var39;
							this.anIntArray8180[var37] = var40;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("Class387_Sub3.ee(I[IIIIZI[I)V")
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = 0;
			this.anInt8209 = 0;
			this.anInt8219 = 0;
			this.anInt8221 = 0;
			for (var11 = 0; var11 < var9; var11++) {
				var12 = arg1[var11];
				if (var12 < this.anIntArrayArray8205.length) {
					int[] var13 = this.anIntArrayArray8205[var12];
					for (var14 = 0; var14 < var13.length; var14++) {
						var15 = var13[var14];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var15]) != 0) {
							this.anInt8209 += this.anIntArray8238[var15];
							this.anInt8219 += this.anIntArray8195[var15];
							this.anInt8221 += this.anIntArray8180[var15];
							var10++;
						}
					}
				}
			}
			if (var10 > 0) {
				this.anInt8209 = this.anInt8209 / var10 + arg2;
				this.anInt8219 = this.anInt8219 / var10 + arg3;
				this.anInt8221 = this.anInt8221 / var10 + arg4;
				this.aBoolean8212 = true;
			} else {
				this.anInt8209 = arg2;
				this.anInt8219 = arg3;
				this.anInt8221 = arg4;
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
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] += arg2;
							this.anIntArray8195[var14] += arg3;
							this.anIntArray8180[var14] += arg4;
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
					if (var11 < this.anIntArrayArray8205.length) {
						var47 = this.anIntArrayArray8205[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
								this.anIntArray8238[var14] -= this.anInt8209;
								this.anIntArray8195[var14] -= this.anInt8219;
								this.anIntArray8180[var14] -= this.anInt8221;
								if (arg4 != 0) {
									var15 = Class257.anIntArray2683[arg4];
									var16 = Class257.anIntArray2684[arg4];
									var17 = this.anIntArray8195[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = this.anIntArray8195[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								if (arg2 != 0) {
									var15 = Class257.anIntArray2683[arg2];
									var16 = Class257.anIntArray2684[arg2];
									var17 = this.anIntArray8195[var14] * var16 - this.anIntArray8180[var14] * var15 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8195[var14] * var15 + this.anIntArray8180[var14] * var16 + 16383 >> 14;
									this.anIntArray8195[var14] = var17;
								}
								if (arg3 != 0) {
									var15 = Class257.anIntArray2683[arg3];
									var16 = Class257.anIntArray2684[arg3];
									var17 = this.anIntArray8180[var14] * var15 + this.anIntArray8238[var14] * var16 + 16383 >> 14;
									this.anIntArray8180[var14] = this.anIntArray8180[var14] * var16 - this.anIntArray8238[var14] * var15 + 16383 >> 14;
									this.anIntArray8238[var14] = var17;
								}
								this.anIntArray8238[var14] += this.anInt8209;
								this.anIntArray8195[var14] += this.anInt8219;
								this.anIntArray8180[var14] += this.anInt8221;
							}
						}
					}
				}
			} else {
				if (!this.aBoolean8208) {
					for (var10 = 0; var10 < this.anInt8174; var10++) {
						this.anIntArray8238[var10] <<= 0x4;
						this.anIntArray8195[var10] <<= 0x4;
						this.anIntArray8180[var10] <<= 0x4;
					}
					this.aBoolean8208 = true;
				}
				var10 = arg7[9] << 4;
				var11 = arg7[10] << 4;
				var12 = arg7[11] << 4;
				var48 = arg7[12] << 4;
				var14 = arg7[13] << 4;
				var15 = arg7[14] << 4;
				if (this.aBoolean8212) {
					var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
					var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
					var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
					int var51 = var16 + var48;
					int var54 = var17 + var14;
					int var55 = var18 + var15;
					this.anInt8209 = var51;
					this.anInt8219 = var54;
					this.anInt8221 = var55;
					this.aBoolean8212 = false;
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
				int var25 = var52[0] * -this.anInt8209 + var52[1] * -this.anInt8219 + var52[2] * -this.anInt8221 + 8192 >> 14;
				var26 = var52[3] * -this.anInt8209 + var52[4] * -this.anInt8219 + var52[5] * -this.anInt8221 + 8192 >> 14;
				var27 = var52[6] * -this.anInt8209 + var52[7] * -this.anInt8219 + var52[8] * -this.anInt8221 + 8192 >> 14;
				var28 = var25 + this.anInt8209;
				int var29 = var26 + this.anInt8219;
				var30 = var27 + this.anInt8221;
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
					if (var40 < this.anIntArrayArray8205.length) {
						int[] var41 = this.anIntArrayArray8205[var40];
						for (int var42 = 0; var42 < var41.length; var42++) {
							int var43 = var41[var42];
							if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var43]) != 0) {
								int var44 = var59[0] * this.anIntArray8238[var43] + var59[1] * this.anIntArray8195[var43] + var59[2] * this.anIntArray8180[var43] + 8192 >> 14;
								int var45 = var59[3] * this.anIntArray8238[var43] + var59[4] * this.anIntArray8195[var43] + var59[5] * this.anIntArray8180[var43] + 8192 >> 14;
								int var46 = var59[6] * this.anIntArray8238[var43] + var59[7] * this.anIntArray8195[var43] + var59[8] * this.anIntArray8180[var43] + 8192 >> 14;
								int var60 = var44 + var36;
								int var61 = var45 + var37;
								int var62 = var46 + var38;
								this.anIntArray8238[var43] = var60;
								this.anIntArray8195[var43] = var61;
								this.anIntArray8180[var43] = var62;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			Class20 var49;
			Class10 var50;
			if (arg0 == 5) {
				if (this.anIntArrayArray8206 != null && this.aByteArray8200 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8206.length) {
							var47 = this.anIntArrayArray8206[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var14 = var47[var48];
								if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
									var15 = (this.aByteArray8200[var14] & 0xFF) + arg2 * 8;
									if (var15 < 0) {
										var15 = 0;
									} else if (var15 > 255) {
										var15 = 255;
									}
									this.aByteArray8200[var14] = (byte) var15;
								}
							}
						}
					}
					if (this.aClass20Array8216 != null) {
						for (var10 = 0; var10 < this.anInt8215; var10++) {
							var49 = this.aClass20Array8216[var10];
							var50 = this.aClass10Array8211[var10];
							var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFFFFFF | 255 - (this.aByteArray8200[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFF) << 24) * 680837181 * 1548605205;
						}
					}
				}
			} else if (arg0 != 7) {
				Class10 var53;
				if (arg0 == 8) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.anInt159 = (var53.anInt159 * 1013441605 + arg2 * 1013441605) * 647335565;
									var53.anInt157 = (var53.anInt157 * 1685996777 + arg3 * 1685996777) * 1511969625;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8218 != null) {
						for (var10 = 0; var10 < var9; var10++) {
							var11 = arg1[var10];
							if (var11 < this.anIntArrayArray8218.length) {
								var47 = this.anIntArrayArray8218[var11];
								for (var48 = 0; var48 < var47.length; var48++) {
									var53 = this.aClass10Array8211[var47[var48]];
									var53.aFloat154 = var53.aFloat154 * (float) arg2 / 128.0F;
									var53.aFloat155 = var53.aFloat155 * (float) arg3 / 128.0F;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8218 != null) {
					for (var10 = 0; var10 < var9; var10++) {
						var11 = arg1[var10];
						if (var11 < this.anIntArrayArray8218.length) {
							var47 = this.anIntArrayArray8218[var11];
							for (var48 = 0; var48 < var47.length; var48++) {
								var53 = this.aClass10Array8211[var47[var48]];
								var53.anInt158 = (var53.anInt158 * 800091467 * -492325789 + arg2 & 0x3FFF) * 800091467 * -492325789;
							}
						}
					}
				}
			} else if (this.anIntArrayArray8206 != null) {
				for (var10 = 0; var10 < var9; var10++) {
					var11 = arg1[var10];
					if (var11 < this.anIntArrayArray8206.length) {
						var47 = this.anIntArrayArray8206[var11];
						for (var48 = 0; var48 < var47.length; var48++) {
							var14 = var47[var48];
							if (this.aShortArray8181 == null || (arg6 & this.aShortArray8181[var14]) != 0) {
								var15 = this.modelColors[var14] & 0xFFFF;
								var16 = var15 >> 10 & 0x3F;
								var17 = var15 >> 7 & 0x7;
								var18 = var15 & 0x7F;
								var16 = var16 + arg2 & 0x3F;
								var17 += arg3;
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
						}
						this.aBoolean8207 = true;
					}
				}
				if (this.aClass20Array8216 != null) {
					for (var10 = 0; var10 < this.anInt8215; var10++) {
						var49 = this.aClass20Array8216[var10];
						var50 = this.aClass10Array8211[var10];
						var50.anInt163 = (var50.anInt163 * 680837181 * 1548605205 & 0xFF000000 | Console.anIntArray4263[Class356.modifyColor(this.modelColors[var49.modelColorIndex * 1028839953 * 1557092081] & 0xFFFF, (byte) 1) & 0xFFFF] & 0xFFFFFF) * 680837181 * 1548605205;
					}
				}
			}
		} else if (arg7 == null) {
			for (var10 = 0; var10 < var9; var10++) {
				var11 = arg1[var10];
				if (var11 < this.anIntArrayArray8205.length) {
					var47 = this.anIntArrayArray8205[var11];
					for (var48 = 0; var48 < var47.length; var48++) {
						var14 = var47[var48];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var14]) != 0) {
							this.anIntArray8238[var14] -= this.anInt8209;
							this.anIntArray8195[var14] -= this.anInt8219;
							this.anIntArray8180[var14] -= this.anInt8221;
							this.anIntArray8238[var14] = this.anIntArray8238[var14] * arg2 / 128;
							this.anIntArray8195[var14] = this.anIntArray8195[var14] * arg3 / 128;
							this.anIntArray8180[var14] = this.anIntArray8180[var14] * arg4 / 128;
							this.anIntArray8238[var14] += this.anInt8209;
							this.anIntArray8195[var14] += this.anInt8219;
							this.anIntArray8180[var14] += this.anInt8221;
						}
					}
				}
			}
		} else {
			if (!this.aBoolean8208) {
				for (var10 = 0; var10 < this.anInt8174; var10++) {
					this.anIntArray8238[var10] <<= 0x4;
					this.anIntArray8195[var10] <<= 0x4;
					this.anIntArray8180[var10] <<= 0x4;
				}
				this.aBoolean8208 = true;
			}
			var10 = arg7[9] << 4;
			var11 = arg7[10] << 4;
			var12 = arg7[11] << 4;
			var48 = arg7[12] << 4;
			var14 = arg7[13] << 4;
			var15 = arg7[14] << 4;
			if (this.aBoolean8212) {
				var16 = arg7[0] * this.anInt8209 + arg7[3] * this.anInt8219 + arg7[6] * this.anInt8221 + 8192 >> 14;
				var17 = arg7[1] * this.anInt8209 + arg7[4] * this.anInt8219 + arg7[7] * this.anInt8221 + 8192 >> 14;
				var18 = arg7[2] * this.anInt8209 + arg7[5] * this.anInt8219 + arg7[8] * this.anInt8221 + 8192 >> 14;
				var16 += var48;
				var17 += var14;
				var18 += var15;
				this.anInt8209 = var16;
				this.anInt8219 = var17;
				this.anInt8221 = var18;
				this.aBoolean8212 = false;
			}
			var16 = arg2 << 15 >> 7;
			var17 = arg3 << 15 >> 7;
			var18 = arg4 << 15 >> 7;
			var19 = var16 * -this.anInt8209 + 8192 >> 14;
			var20 = var17 * -this.anInt8219 + 8192 >> 14;
			var21 = var18 * -this.anInt8221 + 8192 >> 14;
			var22 = var19 + this.anInt8209;
			var23 = var20 + this.anInt8219;
			var24 = var21 + this.anInt8221;
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
				if (var34 < this.anIntArrayArray8205.length) {
					var59 = this.anIntArrayArray8205[var34];
					for (var36 = 0; var36 < var59.length; var36++) {
						var37 = var59[var36];
						if (this.aShortArray8242 == null || (arg6 & this.aShortArray8242[var37]) != 0) {
							var38 = var57[0] * this.anIntArray8238[var37] + var57[1] * this.anIntArray8195[var37] + var57[2] * this.anIntArray8180[var37] + 8192 >> 14;
							var39 = var57[3] * this.anIntArray8238[var37] + var57[4] * this.anIntArray8195[var37] + var57[5] * this.anIntArray8180[var37] + 8192 >> 14;
							var40 = var57[6] * this.anIntArray8238[var37] + var57[7] * this.anIntArray8195[var37] + var57[8] * this.anIntArray8180[var37] + 8192 >> 14;
							var38 += var30;
							var39 += var58;
							var40 += var32;
							this.anIntArray8238[var37] = var38;
							this.anIntArray8195[var37] = var39;
							this.anIntArray8180[var37] = var40;
						}
					}
				}
			}
		}
	}
}
