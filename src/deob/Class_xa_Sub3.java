package deob;

public class Class_xa_Sub3 extends Class_xa {

	public static int anInt8833 = -1694498816;

	public static int anInt8834 = 1;

	public static int anInt8835 = 2;

	public static int anInt8837 = 64;

	public static boolean aBoolean8841 = false;

	public static boolean aBoolean8851 = true;

	public static int anInt8856 = 4;

	public static boolean aBoolean8862 = true;

	public Class_ra_Sub3 aClass_ra_Sub3_8848;

	public int anInt8838;

	public byte[][] aByteArrayArray8860;

	public byte[][] aByteArrayArray8858;

	public float aFloat8836;

	public float aFloat8844;

	public float aFloat8845;

	public float aFloat8846;

	public float aFloat8847;

	public float aFloat8849;

	public float aFloat8850;

	public float aFloat8852;

	public float aFloat8853;

	public float aFloat8854;

	public float aFloat8855;

	public float aFloat8857;

	public float aFloat8859;

	public float aFloat8861;

	public float aFloat8863;

	public float aFloat8864;

	public Class14[][] aClass14ArrayArray8842;

	public Class17[][] aClass17ArrayArray8840;

	public Class31[][] aClass31ArrayArray8839;

	public Class42[][] aClass42ArrayArray8843;

	public Class4[][] aClass4ArrayArray8832;

	@ObfuscatedName("Class_xa_Sub3.LA(III)V")
	public void LA(int arg0, int arg1, int arg2) {
		if (this.aByteArrayArray8858[arg0][arg1] < arg2) {
			this.aByteArrayArray8858[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6413(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		if (this.aClass31ArrayArray8839 == null) {
			this.aClass31ArrayArray8839 = new Class31[this.anInt6397][this.anInt6393];
			this.aClass17ArrayArray8840 = new Class17[this.anInt6397][this.anInt6393];
		} else if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			throw new IllegalStateException();
		}
		boolean var16 = false;
		int var18;
		int var19;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			var16 = true;
			for (int var17 = 1; var17 < 2; var17++) {
				var18 = arg2[arg6[var17]];
				var19 = arg4[arg6[var17]];
				if (var18 != 0 && var18 != this.anInt6395 || var19 != 0 && var19 != this.anInt6395) {
					var16 = false;
					break;
				}
			}
		}
		if (!var16) {
			Class17 var25 = new Class17();
			short var27 = (short) arg2.length;
			short var28 = (short) arg9.length;
			var25.aShort217 = var27;
			var25.aShortArray222 = new short[var27];
			var25.aShortArray227 = new short[var27];
			var25.aShortArray218 = new short[var27];
			var25.aShortArray221 = new short[var27];
			int var21;
			int var22;
			int var23;
			for (int var20 = 0; var20 < var27; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				int var24;
				if (var21 == 0 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				} else if (var21 == 0 && var22 == this.anInt6395) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				} else if (var21 == this.anInt6395 && var22 == this.anInt6395) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				} else if (var21 == this.anInt6395 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				} else {
					var23 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var24 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var25.aShortArray222[var20] = (short) (var23 * (this.anInt6395 - var22) + var24 * var22 >> this.anInt6396 * 2);
				}
				var23 = (arg0 << this.anInt6396) + var21;
				var24 = (arg1 << this.anInt6396) + var22;
				var25.aShortArray227[var20] = (short) var21;
				var25.aShortArray221[var20] = (short) var22;
				var25.aShortArray218[var20] = (short) (this.method6416(var23, var24, 778721202) + (arg3 == null ? 0 : arg3[var20]));
				if (var25.aShortArray222[var20] < 2) {
					var25.aShortArray222[var20] = 2;
				}
			}
			boolean var29 = false;
			var21 = 0;
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					var21++;
				}
				var23 = arg11[var22];
				if (var23 != -1) {
					Class56 var32 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var23, 1261224992);
					if (!var32.aBoolean533) {
						var29 = true;
						if (this.method6447(var32.aByte525) || var32.aByte531 != 0 || var32.aByte530 != 0) {
							var25.aByte216 = (byte) (var25.aByte216 | 0x4);
						}
					}
				}
			}
			var25.anIntArray228 = new int[var21];
			if (arg10 != null) {
				var25.anIntArray229 = new int[var21];
			}
			var25.aShortArray223 = new short[var21];
			var25.aShortArray224 = new short[var21];
			var25.aShortArray225 = new short[var21];
			if (var29) {
				var25.aShortArray226 = new short[var21];
				var25.aShortArray219 = new short[var21];
			}
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					if (arg9[var22] >= 0) {
						var25.anIntArray228[var25.aShort220] = Class356.modifyColor(arg9[var22], (byte) 1);
					} else {
						var25.anIntArray228[var25.aShort220] = -1;
					}
					if (arg10 != null) {
						if (arg10[var22] == -1) {
							var25.anIntArray229[var25.aShort220] = -1;
						} else {
							var25.anIntArray229[var25.aShort220] = Class356.modifyColor(arg10[var22], (byte) 1);
						}
					}
					var25.aShortArray223[var25.aShort220] = (short) arg6[var22];
					var25.aShortArray224[var25.aShort220] = (short) arg7[var22];
					var25.aShortArray225[var25.aShort220] = (short) arg8[var22];
					if (var29) {
						if (arg11[var22] == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg11[var22], -246846698).aBoolean533) {
							var25.aShortArray226[var25.aShort220] = -1;
						} else {
							var25.aShortArray226[var25.aShort220] = (short) arg11[var22];
							var25.aShortArray219[var25.aShort220] = (short) arg12[var22];
						}
					}
					var25.aShort220++;
				}
			}
			this.aClass17ArrayArray8840[arg0][arg1] = var25;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			Class31 var26 = new Class31();
			var18 = arg9[0];
			var19 = arg11[0];
			if (arg10 != null) {
				var26.anInt357 = Class330_Sub26_Sub1.method3395(Class356.modifyColor(arg10[0], (byte) 1), this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -1494179361);
				if (var18 == -1) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x2);
				}
			}
			if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
				var26.aByte355 = (byte) (var26.aByte355 | 0x1);
			}
			Class56 var30 = null;
			if (var19 != -1) {
				var30 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var19, -707547549);
			}
			if (var30 == null || (var26.aByte355 & 0x2) != 0 || var30.aBoolean533) {
				short var31 = Class356.modifyColor(var18, (byte) 1);
				var26.aShort353 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -786580447);
				var26.aShort354 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1], -1057315487);
				var26.aShort352 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1], -1356452566);
				var26.aShort356 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1], -1496865034);
				var26.aShort358 = -1;
			} else {
				var26.aShort353 = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				var26.aShort354 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				var26.aShort352 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				var26.aShort356 = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				var26.aShort358 = (short) var19;
				if (this.method6447(var30.aByte525) || var30.aByte531 != 0 || var30.aByte530 != 0) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x4);
				}
			}
			this.aClass31ArrayArray8839[arg0][arg1] = var26;
		}
	}

	public void method6411(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		if (this.aClass31ArrayArray8839 == null) {
			this.aClass31ArrayArray8839 = new Class31[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
			this.aClass17ArrayArray8840 = new Class17[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			throw new IllegalStateException();
		}
		boolean var16 = false;
		int var18;
		int var19;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			var16 = true;
			for (int var17 = 1; var17 < 2; var17++) {
				var18 = arg2[arg6[var17]];
				var19 = arg4[arg6[var17]];
				if (var18 != 0 && var18 != this.anInt6395 * -1684509909 * 550173571 || var19 != 0 && var19 != this.anInt6395 * -1684509909 * 550173571) {
					var16 = false;
					break;
				}
			}
		}
		if (!var16) {
			Class17 var25 = new Class17();
			short var27 = (short) arg2.length;
			short var28 = (short) arg9.length;
			var25.aShort217 = var27;
			var25.aShortArray222 = new short[var27];
			var25.aShortArray227 = new short[var27];
			var25.aShortArray218 = new short[var27];
			var25.aShortArray221 = new short[var27];
			int var21;
			int var22;
			int var23;
			for (int var20 = 0; var20 < var27; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				int var24;
				if (var21 == 0 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				} else if (var21 == 0 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				} else {
					var23 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var24 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var25.aShortArray222[var20] = (short) (var23 * (this.anInt6395 * -1684509909 * 550173571 - var22) + var24 * var22 >> this.anInt6396 * -786523509 * -2132608442);
				}
				var23 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var21;
				var24 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var22;
				var25.aShortArray227[var20] = (short) var21;
				var25.aShortArray221[var20] = (short) var22;
				var25.aShortArray218[var20] = (short) (this.method6416(var23, var24, 1254823433) + (arg3 == null ? 0 : arg3[var20]));
				if (var25.aShortArray222[var20] < 2) {
					var25.aShortArray222[var20] = 2;
				}
			}
			boolean var29 = false;
			var21 = 0;
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					var21++;
				}
				var23 = arg11[var22];
				if (var23 != -1) {
					Class56 var32 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var23, -1311016614);
					if (!var32.aBoolean533) {
						var29 = true;
						if (this.method6447(var32.aByte525) || var32.aByte531 != 0 || var32.aByte530 != 0) {
							var25.aByte216 = (byte) (var25.aByte216 | 0x4);
						}
					}
				}
			}
			var25.anIntArray228 = new int[var21];
			if (arg10 != null) {
				var25.anIntArray229 = new int[var21];
			}
			var25.aShortArray223 = new short[var21];
			var25.aShortArray224 = new short[var21];
			var25.aShortArray225 = new short[var21];
			if (var29) {
				var25.aShortArray226 = new short[var21];
				var25.aShortArray219 = new short[var21];
			}
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					if (arg9[var22] >= 0) {
						var25.anIntArray228[var25.aShort220] = Class356.modifyColor(arg9[var22], (byte) 1);
					} else {
						var25.anIntArray228[var25.aShort220] = -1;
					}
					if (arg10 != null) {
						if (arg10[var22] == -1) {
							var25.anIntArray229[var25.aShort220] = -1;
						} else {
							var25.anIntArray229[var25.aShort220] = Class356.modifyColor(arg10[var22], (byte) 1);
						}
					}
					var25.aShortArray223[var25.aShort220] = (short) arg6[var22];
					var25.aShortArray224[var25.aShort220] = (short) arg7[var22];
					var25.aShortArray225[var25.aShort220] = (short) arg8[var22];
					if (var29) {
						if (arg11[var22] == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg11[var22], 501755662).aBoolean533) {
							var25.aShortArray226[var25.aShort220] = -1;
						} else {
							var25.aShortArray226[var25.aShort220] = (short) arg11[var22];
							var25.aShortArray219[var25.aShort220] = (short) arg12[var22];
						}
					}
					var25.aShort220++;
				}
			}
			this.aClass17ArrayArray8840[arg0][arg1] = var25;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			Class31 var26 = new Class31();
			var18 = arg9[0];
			var19 = arg11[0];
			if (arg10 != null) {
				var26.anInt357 = Class330_Sub26_Sub1.method3395(Class356.modifyColor(arg10[0], (byte) 1), this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -1749159568);
				if (var18 == -1) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x2);
				}
			}
			if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
				var26.aByte355 = (byte) (var26.aByte355 | 0x1);
			}
			Class56 var30 = null;
			if (var19 != -1) {
				var30 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var19, 474600756);
			}
			if (var30 == null || (var26.aByte355 & 0x2) != 0 || var30.aBoolean533) {
				short var31 = Class356.modifyColor(var18, (byte) 1);
				var26.aShort353 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -569129609);
				var26.aShort354 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1], -1500544324);
				var26.aShort352 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1], -1737398457);
				var26.aShort356 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1], -1977156237);
				var26.aShort358 = -1;
			} else {
				var26.aShort353 = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				var26.aShort354 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				var26.aShort352 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				var26.aShort356 = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				var26.aShort358 = (short) var19;
				if (this.method6447(var30.aByte525) || var30.aByte531 != 0 || var30.aByte530 != 0) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x4);
				}
			}
			this.aClass31ArrayArray8839[arg0][arg1] = var26;
		}
	}

	public static int method6442(int arg0, int arg1) {
		int var2 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 253) {
			var2 = 253;
		}
		int var3 = (arg0 & 0xFF00) * arg1 >> 15;
		if (var3 < 2) {
			var3 = 2;
		} else if (var3 > 253) {
			var3 = 253;
		}
		int var4 = (arg0 & 0xFF) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 253) {
			var4 = 253;
		}
		return var2 << 16 | var3 << 8 | var4;
	}

	@ObfuscatedName("Class_xa_Sub3.ac(LClass_na;IIIIZ)V")
	public void ac(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	public void method6423(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.aClass_ra_Sub3_8848.anIntArray8630 == null || this.aClass_ra_Sub3_8848.aFloatArray8620 == null) {
			throw new IllegalStateException("");
		}
		Class249 var7 = this.aClass_ra_Sub3_8848.aClass249_8634;
		this.aFloat8844 = var7.aFloatArray2631[0];
		this.aFloat8845 = var7.aFloatArray2631[1];
		this.aFloat8836 = var7.aFloatArray2631[2];
		this.aFloat8846 = var7.aFloatArray2631[3];
		this.aFloat8861 = var7.aFloatArray2631[4];
		this.aFloat8849 = var7.aFloatArray2631[5];
		this.aFloat8850 = var7.aFloatArray2631[6];
		this.aFloat8864 = var7.aFloatArray2631[7];
		this.aFloat8852 = var7.aFloatArray2631[8];
		this.aFloat8853 = var7.aFloatArray2631[9];
		this.aFloat8854 = var7.aFloatArray2631[10];
		this.aFloat8855 = var7.aFloatArray2631[11];
		this.aFloat8863 = var7.aFloatArray2631[12];
		this.aFloat8847 = var7.aFloatArray2631[13];
		this.aFloat8857 = var7.aFloatArray2631[14];
		this.aFloat8859 = var7.aFloatArray2631[15];
		for (int var8 = 0; var8 < arg2 + arg2; var8++) {
			for (int var9 = 0; var9 < arg2 + arg2; var9++) {
				if (arg3[var8][var9]) {
					int var10 = arg0 - arg2 + var8;
					int var11 = arg1 - arg2 + var9;
					if (var10 >= 0 && var10 < this.anInt6397 && var11 >= 0 && var11 < this.anInt6393) {
						this.method6443(var10, var11, arg5);
					}
				}
			}
		}
	}

	public void method6443(int arg0, int arg1, int arg2) {
		Class6 var4 = this.aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		var4.aClass38_94.anInt402 = 0;
		if (this.aClass4ArrayArray8832 != null) {
			this.method6449(arg0, arg1, var4.aBoolean91, var4, var4.aClass38_94, var4.aFloatArray84, var4.aFloatArray122, var4.aFloatArray125, var4.aFloatArray126, var4.aFloatArray127, arg2);
		} else if (this.aClass31ArrayArray8839 != null) {
			this.method6444(arg0, arg1, var4.aClass38_94, var4.aFloatArray84, var4.aFloatArray122, var4.aFloatArray125, var4.aFloatArray126, var4.aFloatArray127, arg2);
		} else if (this.aClass42ArrayArray8843 != null) {
			this.method6445(arg0, arg1, var4.aBoolean91, var4, var4.aClass38_94, var4.aFloatArray84, var4.aFloatArray122, var4.aFloatArray125, var4.aFloatArray126, var4.aFloatArray127, arg2);
		}
	}

	public void method6444(int arg0, int arg1, Class38 arg2, float[] arg3, float[] arg4, float[] arg5, float[] arg6, float[] arg7, int arg8) {
		Class31 var10 = this.aClass31ArrayArray8839[arg0][arg1];
		int var12;
		int var13;
		float var16;
		float var17;
		float var18;
		float var19;
		float var20;
		float var21;
		if (var10 == null) {
			Class17 var48 = this.aClass17ArrayArray8840[arg0][arg1];
			if (var48 != null) {
				if (arg8 != 0) {
					if ((var48.aByte216 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				short var50;
				for (var12 = 0; var12 < var48.aShort217; var12++) {
					var13 = var48.aShortArray227[var12] + (arg0 << this.anInt6396);
					var50 = var48.aShortArray218[var12];
					int var51 = var48.aShortArray221[var12] + (arg1 << this.anInt6396);
					var16 = this.aFloat8857 + this.aFloat8836 * (float) var13 + this.aFloat8850 * (float) var50 + this.aFloat8854 * (float) var51;
					var17 = this.aFloat8859 + this.aFloat8846 * (float) var13 + this.aFloat8864 * (float) var50 + this.aFloat8855 * (float) var51;
					if (var16 < -var17) {
						return;
					}
					var18 = this.aFloat8863 + this.aFloat8844 * (float) var13 + this.aFloat8861 * (float) var50 + this.aFloat8852 * (float) var51;
					var19 = this.aFloat8847 + this.aFloat8845 * (float) var13 + this.aFloat8849 * (float) var50 + this.aFloat8853 * (float) var51;
					arg3[var12] = arg2.aFloat411 + arg2.aFloat391 * var18 / var17;
					arg4[var12] = arg2.aFloat392 + arg2.aFloat420 * var19 / var17;
					arg5[var12] = arg2.aFloat394 + arg2.aFloat395 * var16 / var17;
					arg6[var12] = var17;
				}
				short var49;
				short var52;
				if (var48.aShortArray226 == null) {
					for (var12 = 0; var12 < var48.aShort220; var12++) {
						var49 = var48.aShortArray223[var12];
						var50 = var48.aShortArray224[var12];
						var52 = var48.aShortArray225[var12];
						var16 = arg3[var49];
						var17 = arg3[var50];
						var18 = arg3[var52];
						var19 = arg4[var49];
						var20 = arg4[var50];
						var21 = arg4[var52];
						if ((var16 - var17) * (var21 - var20) - (var19 - var20) * (var18 - var17) > 0.0F) {
							int var54 = var48.anIntArray228[var12];
							if (var54 != -1) {
								arg2.aBoolean387 = var16 < 0.0F || var17 < 0.0F || var18 < 0.0F || var16 > (float) arg2.anInt396 || var17 > (float) arg2.anInt396 || var18 > (float) arg2.anInt396;
								arg2.method544(true, true, false, var19, var20, var21, var16, var17, var18, arg5[var49], arg5[var50], arg5[var52], (float) Class330_Sub26_Sub1.method3395(var54, var48.aShortArray222[var49], -924777541), (float) Class330_Sub26_Sub1.method3395(var54, var48.aShortArray222[var50], -1482298670), (float) Class330_Sub26_Sub1.method3395(var54, var48.aShortArray222[var52], -603231994));
							}
						}
					}
				} else {
					for (var12 = 0; var12 < var48.aShort220; var12++) {
						var49 = var48.aShortArray223[var12];
						var50 = var48.aShortArray224[var12];
						var52 = var48.aShortArray225[var12];
						var16 = arg3[var49];
						var17 = arg3[var50];
						var18 = arg3[var52];
						var19 = arg4[var49];
						var20 = arg4[var50];
						var21 = arg4[var52];
						if ((var16 - var17) * (var21 - var20) - (var19 - var20) * (var18 - var17) > 0.0F) {
							arg2.aBoolean387 = var16 < 0.0F || var17 < 0.0F || var18 < 0.0F || var16 > (float) arg2.anInt396 || var17 > (float) arg2.anInt396 || var18 > (float) arg2.anInt396;
							short var53 = var48.aShortArray226[var12];
							if (var53 == -1) {
								int var55 = var48.anIntArray228[var12];
								if (var55 != -1) {
									arg2.method544(true, true, false, var19, var20, var21, var16, var17, var18, arg5[var49], arg5[var50], arg5[var52], (float) Class330_Sub26_Sub1.method3395(var55, var48.aShortArray222[var49], -1614100959), (float) Class330_Sub26_Sub1.method3395(var55, var48.aShortArray222[var50], -499171606), (float) Class330_Sub26_Sub1.method3395(var55, var48.aShortArray222[var52], -1536577299));
								}
							} else {
								arg2.method541(true, true, false, var19, var20, var21, var16, var17, var18, arg5[var49], arg5[var50], arg5[var52], arg6[var49], arg6[var50], arg6[var52], (float) var48.aShortArray227[var49] / (float) this.anInt6395, (float) var48.aShortArray227[var50] / (float) this.anInt6395, (float) var48.aShortArray227[var52] / (float) this.anInt6395, (float) var48.aShortArray221[var49] / (float) this.anInt6395, (float) var48.aShortArray221[var50] / (float) this.anInt6395, (float) var48.aShortArray221[var52] / (float) this.anInt6395, Console.anIntArray4263[var48.aShortArray222[var49] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var48.aShortArray222[var50] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var48.aShortArray222[var52] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var53);
							}
						}
					}
				}
			}
		} else if ((var10.aByte355 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((var10.aByte355 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			int var11 = arg0 * this.anInt6395;
			var12 = var11 + this.anInt6395;
			var13 = arg1 * this.anInt6395;
			int var14 = var13 + this.anInt6395;
			float var15;
			float var22;
			float var23;
			float var24;
			float var25;
			float var26;
			float var27;
			float var28;
			float var29;
			float var30;
			int var31;
			float var35;
			float var36;
			float var37;
			float var38;
			float var39;
			float var40;
			float var41;
			float var42;
			float var43;
			float var44;
			float var45;
			float var46;
			if ((var10.aByte355 & 0x1) == 0) {
				var31 = this.anIntArrayArray6394[arg0][arg1];
				int var56 = this.anIntArrayArray6394[arg0 + 1][arg1];
				int var57 = this.anIntArrayArray6394[arg0 + 1][arg1 + 1];
				int var58 = this.anIntArrayArray6394[arg0][arg1 + 1];
				var35 = this.aFloat8857 + this.aFloat8836 * (float) var11 + this.aFloat8850 * (float) var31 + this.aFloat8854 * (float) var13;
				var15 = this.aFloat8859 + this.aFloat8846 * (float) var11 + this.aFloat8864 * (float) var31 + this.aFloat8855 * (float) var13;
				if (var35 < -var15) {
					return;
				}
				var36 = this.aFloat8857 + this.aFloat8836 * (float) var12 + this.aFloat8850 * (float) var56 + this.aFloat8854 * (float) var13;
				var16 = this.aFloat8859 + this.aFloat8846 * (float) var12 + this.aFloat8864 * (float) var56 + this.aFloat8855 * (float) var13;
				if (var36 < -var16) {
					return;
				}
				var37 = this.aFloat8857 + this.aFloat8836 * (float) var12 + this.aFloat8850 * (float) var57 + this.aFloat8854 * (float) var14;
				var17 = this.aFloat8859 + this.aFloat8846 * (float) var12 + this.aFloat8864 * (float) var57 + this.aFloat8855 * (float) var14;
				if (var37 < -var17) {
					return;
				}
				var38 = this.aFloat8857 + this.aFloat8836 * (float) var11 + this.aFloat8850 * (float) var58 + this.aFloat8854 * (float) var14;
				var18 = this.aFloat8859 + this.aFloat8846 * (float) var11 + this.aFloat8864 * (float) var58 + this.aFloat8855 * (float) var14;
				if (var38 < -var18) {
					return;
				}
				var39 = this.aFloat8863 + this.aFloat8844 * (float) var11 + this.aFloat8861 * (float) var31 + this.aFloat8852 * (float) var13;
				var19 = arg2.aFloat411 + arg2.aFloat391 * var39 / var15;
				var40 = this.aFloat8847 + this.aFloat8845 * (float) var11 + this.aFloat8849 * (float) var31 + this.aFloat8853 * (float) var13;
				var20 = arg2.aFloat392 + arg2.aFloat420 * var40 / var15;
				var21 = arg2.aFloat394 + arg2.aFloat395 * var35 / var15;
				var41 = this.aFloat8863 + this.aFloat8844 * (float) var12 + this.aFloat8861 * (float) var56 + this.aFloat8852 * (float) var13;
				var22 = arg2.aFloat411 + arg2.aFloat391 * var41 / var16;
				var42 = this.aFloat8847 + this.aFloat8845 * (float) var12 + this.aFloat8849 * (float) var56 + this.aFloat8853 * (float) var13;
				var23 = arg2.aFloat392 + arg2.aFloat420 * var42 / var16;
				var24 = arg2.aFloat394 + arg2.aFloat395 * var36 / var16;
				var43 = this.aFloat8863 + this.aFloat8844 * (float) var12 + this.aFloat8861 * (float) var57 + this.aFloat8852 * (float) var14;
				var25 = arg2.aFloat411 + arg2.aFloat391 * var43 / var17;
				var44 = this.aFloat8847 + this.aFloat8845 * (float) var12 + this.aFloat8849 * (float) var57 + this.aFloat8853 * (float) var14;
				var26 = arg2.aFloat392 + arg2.aFloat420 * var44 / var17;
				var27 = arg2.aFloat394 + arg2.aFloat395 * var37 / var17;
				var45 = this.aFloat8863 + this.aFloat8844 * (float) var11 + this.aFloat8861 * (float) var58 + this.aFloat8852 * (float) var14;
				var28 = arg2.aFloat411 + arg2.aFloat391 * var45 / var18;
				var46 = this.aFloat8847 + this.aFloat8845 * (float) var11 + this.aFloat8849 * (float) var58 + this.aFloat8853 * (float) var14;
				var29 = arg2.aFloat392 + arg2.aFloat420 * var46 / var18;
				var30 = arg2.aFloat394 + arg2.aFloat395 * var38 / var18;
			} else {
				var31 = this.anIntArrayArray6394[arg0][arg1];
				float var32 = this.aFloat8850 * (float) var31;
				float var33 = this.aFloat8864 * (float) var31;
				float var34 = this.aFloat8857 + this.aFloat8836 * (float) var11 + var32 + this.aFloat8854 * (float) var13;
				var15 = this.aFloat8859 + this.aFloat8846 * (float) var11 + var33 + this.aFloat8855 * (float) var13;
				if (var34 < -var15) {
					return;
				}
				var35 = this.aFloat8857 + this.aFloat8836 * (float) var12 + var32 + this.aFloat8854 * (float) var13;
				var16 = this.aFloat8859 + this.aFloat8846 * (float) var12 + var33 + this.aFloat8855 * (float) var13;
				if (var35 < -var16) {
					return;
				}
				var36 = this.aFloat8857 + this.aFloat8836 * (float) var12 + var32 + this.aFloat8854 * (float) var14;
				var17 = this.aFloat8859 + this.aFloat8846 * (float) var12 + var33 + this.aFloat8855 * (float) var14;
				if (var36 < -var17) {
					return;
				}
				var37 = this.aFloat8857 + this.aFloat8836 * (float) var11 + var32 + this.aFloat8854 * (float) var14;
				var18 = this.aFloat8859 + this.aFloat8846 * (float) var11 + var33 + this.aFloat8855 * (float) var14;
				if (var37 < -var18) {
					return;
				}
				var38 = this.aFloat8861 * (float) var31;
				var39 = this.aFloat8849 * (float) var31;
				var40 = this.aFloat8863 + this.aFloat8844 * (float) var11 + var38 + this.aFloat8852 * (float) var13;
				var19 = arg2.aFloat411 + arg2.aFloat391 * var40 / var15;
				var41 = this.aFloat8847 + this.aFloat8845 * (float) var11 + var39 + this.aFloat8853 * (float) var13;
				var20 = arg2.aFloat392 + arg2.aFloat420 * var41 / var15;
				var21 = arg2.aFloat394 + arg2.aFloat395 * var34 / var15;
				var42 = this.aFloat8863 + this.aFloat8844 * (float) var12 + var38 + this.aFloat8852 * (float) var13;
				var22 = arg2.aFloat411 + arg2.aFloat391 * var42 / var16;
				var43 = this.aFloat8847 + this.aFloat8845 * (float) var12 + var39 + this.aFloat8853 * (float) var13;
				var23 = arg2.aFloat392 + arg2.aFloat420 * var43 / var16;
				var24 = arg2.aFloat394 + arg2.aFloat395 * var35 / var16;
				var44 = this.aFloat8863 + this.aFloat8844 * (float) var12 + var38 + this.aFloat8852 * (float) var14;
				var25 = arg2.aFloat411 + arg2.aFloat391 * var44 / var17;
				var45 = this.aFloat8847 + this.aFloat8845 * (float) var12 + var39 + this.aFloat8853 * (float) var14;
				var26 = arg2.aFloat392 + arg2.aFloat420 * var45 / var17;
				var27 = arg2.aFloat394 + arg2.aFloat395 * var36 / var17;
				var46 = this.aFloat8863 + this.aFloat8844 * (float) var11 + var38 + this.aFloat8852 * (float) var14;
				var28 = arg2.aFloat411 + arg2.aFloat391 * var46 / var18;
				float var47 = this.aFloat8847 + this.aFloat8845 * (float) var11 + var39 + this.aFloat8853 * (float) var14;
				var29 = arg2.aFloat392 + arg2.aFloat420 * var47 / var18;
				var30 = arg2.aFloat394 + arg2.aFloat395 * var37 / var18;
			}
			if ((var25 - var28) * (var23 - var29) - (var26 - var29) * (var22 - var28) > 0.0F) {
				arg2.aBoolean387 = var25 < 0.0F || var28 < 0.0F || var22 < 0.0F || var25 > (float) arg2.anInt396 || var28 > (float) arg2.anInt396 || var22 > (float) arg2.anInt396;
				if (var10.aShort358 >= 0) {
					arg2.method541(true, true, false, var26, var29, var23, var25, var28, var22, var27, var30, var24, var17, var18, var16, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Console.anIntArray4263[var10.aShort352 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var10.aShort356 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var10.aShort354 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.aShort358);
				} else {
					arg2.method544(true, true, false, var26, var29, var23, var25, var28, var22, var27, var30, var24, (float) (var10.aShort352 & 0xFFFF), (float) (var10.aShort356 & 0xFFFF), (float) (var10.aShort354 & 0xFFFF));
				}
			}
			if ((var19 - var22) * (var29 - var23) - (var20 - var23) * (var28 - var22) > 0.0F) {
				arg2.aBoolean387 = var19 < 0.0F || var22 < 0.0F || var28 < 0.0F || var19 > (float) arg2.anInt396 || var22 > (float) arg2.anInt396 || var28 > (float) arg2.anInt396;
				if (var10.aShort358 >= 0) {
					arg2.method541(true, true, false, var20, var23, var29, var19, var22, var28, var21, var24, var30, var15, var16, var18, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Console.anIntArray4263[var10.aShort353 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var10.aShort354 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Console.anIntArray4263[var10.aShort356 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.aShort358);
				} else {
					arg2.method544(true, true, false, var20, var23, var29, var19, var22, var28, var21, var24, var30, (float) (var10.aShort353 & 0xFFFF), (float) (var10.aShort354 & 0xFFFF), (float) (var10.aShort356 & 0xFFFF));
				}
			}
		}
	}

	@ObfuscatedName("Class_xa_Sub3.NA(LClass_na;IIIIZ)V")
	public void NA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	public void method6445(int arg0, int arg1, boolean arg2, Class6 arg3, Class38 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		Class42 var12 = this.aClass42ArrayArray8843[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || var12 == null) {
			return;
		}
		int var14;
		int var15;
		int var16;
		float var18;
		float var19;
		float var28;
		for (int var13 = 0; var13 < var12.aShort433; var13++) {
			var14 = var12.aShortArray432[var13] + (arg0 << this.anInt6396);
			var15 = var12.aShortArray431[var13];
			var16 = var12.aShortArray434[var13] + (arg1 << this.anInt6396);
			float var17 = this.aFloat8857 + this.aFloat8836 * (float) var14 + this.aFloat8850 * (float) var15 + this.aFloat8854 * (float) var16;
			var18 = this.aFloat8859 + this.aFloat8846 * (float) var14 + this.aFloat8864 * (float) var15 + this.aFloat8855 * (float) var16;
			if (var17 < -var18) {
				return;
			}
			arg9[var13] = 0.0F;
			if (arg2) {
				var19 = var17 - arg3.aFloat87;
				if (var19 > 0.0F) {
					var19 /= arg3.aFloat104;
					if (var19 > 1.0F) {
						var19 = 1.0F;
					}
					arg9[var13] = var19;
					int var20 = (int) ((float) var12.aShortArray440[var13] * var19);
					if (var20 > 0) {
						var15 -= var20;
					}
				}
			} else if (arg3.aBoolean86) {
				var19 = var17 - arg3.aFloat87;
				if (var19 > 0.0F) {
					arg9[var13] = var19 / arg3.aFloat104;
					if (arg9[var13] > 1.0F) {
						arg9[var13] = 1.0F;
					}
				}
			}
			var19 = this.aFloat8863 + this.aFloat8844 * (float) var14 + this.aFloat8861 * (float) var15 + this.aFloat8852 * (float) var16;
			var28 = this.aFloat8847 + this.aFloat8845 * (float) var14 + this.aFloat8849 * (float) var15 + this.aFloat8853 * (float) var16;
			arg5[var13] = arg4.aFloat411 + arg4.aFloat391 * var19 / var18;
			arg6[var13] = arg4.aFloat392 + arg4.aFloat420 * var28 / var18;
			arg7[var13] = arg4.aFloat394 + arg4.aFloat395 * var17 / var18;
			arg8[var13] = var18;
		}
		float var26 = (float) this.anInt6395;
		for (var14 = 0; var14 < var12.aShort430; var14++) {
			var15 = var14 * 3;
			var16 = var15 + 1;
			int var27 = var16 + 1;
			var18 = arg5[var15];
			var19 = arg5[var16];
			var28 = arg5[var27];
			float var21 = arg6[var15];
			float var22 = arg6[var16];
			float var23 = arg6[var27];
			if ((var18 - var19) * (var23 - var22) - (var21 - var22) * (var28 - var19) > 0.0F) {
				arg4.aBoolean387 = var18 < 0.0F || var19 < 0.0F || var28 < 0.0F || var18 > (float) arg4.anInt396 || var19 > (float) arg4.anInt396 || var28 > (float) arg4.anInt396;
				if (arg9[var15] + arg9[var16] + arg9[var27] < 3.0F) {
					int var24 = arg0 << this.anInt6396;
					int var25 = arg1 << this.anInt6396;
					if ((var12.anIntArray438[var15] & 0xFFFFFF) != 0) {
						if (var12.aShortArray436[var15] == var12.aShortArray436[var16] && var12.aShortArray436[var15] == var12.aShortArray436[var27] && var12.aShortArray437[var15] == var12.aShortArray437[var16] && var12.aShortArray437[var15] == var12.aShortArray437[var27]) {
							arg4.method541(true, true, false, var21, var22, var23, var18, var19, var28, arg7[var15], arg7[var16], arg7[var27], arg8[var15], arg8[var16], arg8[var27], (float) (var24 + var12.aShortArray432[var15]) / (float) var12.aShortArray437[var15], (float) (var24 + var12.aShortArray432[var16]) / (float) var12.aShortArray437[var16], (float) (var24 + var12.aShortArray432[var27]) / (float) var12.aShortArray437[var27], (float) (var25 + var12.aShortArray434[var15]) / (float) var12.aShortArray437[var15], (float) (var25 + var12.aShortArray434[var16]) / (float) var12.aShortArray437[var16], (float) (var25 + var12.aShortArray434[var27]) / (float) var12.aShortArray437[var27], var12.anIntArray438[var15], var12.anIntArray438[var16], var12.anIntArray438[var27], arg3.anInt88, arg9[var15] * 255.0F, arg9[var16] * 255.0F, arg9[var27] * 255.0F, var12.aShortArray436[var15]);
						} else {
							arg4.method546(true, true, false, var21, var22, var23, var18, var19, var28, arg7[var15], arg7[var16], arg7[var27], arg8[var15], arg8[var16], arg8[var27], (float) (var24 + var12.aShortArray432[var15]) / var26, (float) (var24 + var12.aShortArray432[var16]) / var26, (float) (var24 + var12.aShortArray432[var27]) / var26, (float) (var25 + var12.aShortArray434[var15]) / var26, (float) (var25 + var12.aShortArray434[var16]) / var26, (float) (var25 + var12.aShortArray434[var27]) / var26, var12.anIntArray438[var15], var12.anIntArray438[var16], var12.anIntArray438[var27], arg3.anInt88, arg9[var15] * 255.0F, arg9[var16] * 255.0F, arg9[var27] * 255.0F, var12.aShortArray436[var15], var26 / (float) var12.aShortArray437[var15], var12.aShortArray436[var16], var26 / (float) var12.aShortArray437[var16], var12.aShortArray436[var27], var26 / (float) var12.aShortArray437[var27]);
						}
					}
				} else {
					arg4.method539(true, true, false, var21, var22, var23, var18, var19, var28, arg7[var15], arg7[var16], arg7[var27], arg3.anInt88);
				}
			}
		}
	}

	@ObfuscatedName("Class_xa_Sub3.w(IILClass_na;)LClass_na;")
	public Class_na w(int arg0, int arg1, Class_na arg2) {
		return null;
	}

	public void method6415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class6 var9 = this.aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 var10 = var9.aClass38_94;
		var10.anInt402 = 0;
		var10.aBoolean387 = true;
		this.aClass_ra_Sub3_8848.method5197();
		if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			this.method6448(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		} else if (this.aClass31ArrayArray8839 != null) {
			this.method6446(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		}
	}

	@ObfuscatedName("Class_xa_Sub3.ai(LClass_na;IIIIZ)V")
	public void ai(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("Class_xa_Sub3.ay(LClass_na;IIIIZ)V")
	public void ay(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	public boolean method6424(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return false;
	}

	public boolean method6418(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return false;
	}

	public void method6429(Class330_Sub14 arg0, int[] arg1) {
	}

	public void method6420(Class330_Sub14 arg0, int[] arg1) {
	}

	@ObfuscatedName("Class_xa_Sub3.n(III)V")
	public void n(int arg0, int arg1, int arg2) {
		if (this.aByteArrayArray8858[arg0][arg1] < arg2) {
			this.aByteArrayArray8858[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub3.l(III)V")
	public void l(int arg0, int arg1, int arg2) {
		if (this.aByteArrayArray8858[arg0][arg1] < arg2) {
			this.aByteArrayArray8858[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("Class_xa_Sub3.b(III)V")
	public void b(int arg0, int arg1, int arg2) {
		if (this.aByteArrayArray8858[arg0][arg1] < arg2) {
			this.aByteArrayArray8858[arg0][arg1] = (byte) arg2;
		}
	}

	public void method6414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, Class77 arg13, boolean arg14) {
		if (this.aClass31ArrayArray8839 == null) {
			this.aClass31ArrayArray8839 = new Class31[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
			this.aClass17ArrayArray8840 = new Class17[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			throw new IllegalStateException();
		}
		boolean var16 = false;
		int var18;
		int var19;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			var16 = true;
			for (int var17 = 1; var17 < 2; var17++) {
				var18 = arg2[arg6[var17]];
				var19 = arg4[arg6[var17]];
				if (var18 != 0 && var18 != this.anInt6395 * -1684509909 * 550173571 || var19 != 0 && var19 != this.anInt6395 * -1684509909 * 550173571) {
					var16 = false;
					break;
				}
			}
		}
		if (!var16) {
			Class17 var25 = new Class17();
			short var27 = (short) arg2.length;
			short var28 = (short) arg9.length;
			var25.aShort217 = var27;
			var25.aShortArray222 = new short[var27];
			var25.aShortArray227 = new short[var27];
			var25.aShortArray218 = new short[var27];
			var25.aShortArray221 = new short[var27];
			int var21;
			int var22;
			int var23;
			for (int var20 = 0; var20 < var27; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				int var24;
				if (var21 == 0 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				} else if (var21 == 0 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == 0) {
					var25.aShortArray222[var20] = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				} else {
					var23 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var24 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var25.aShortArray222[var20] = (short) (var23 * (this.anInt6395 * -1684509909 * 550173571 - var22) + var24 * var22 >> this.anInt6396 * -786523509 * -2132608442);
				}
				var23 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var21;
				var24 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var22;
				var25.aShortArray227[var20] = (short) var21;
				var25.aShortArray221[var20] = (short) var22;
				var25.aShortArray218[var20] = (short) (this.method6416(var23, var24, 1243910374) + (arg3 == null ? 0 : arg3[var20]));
				if (var25.aShortArray222[var20] < 2) {
					var25.aShortArray222[var20] = 2;
				}
			}
			boolean var29 = false;
			var21 = 0;
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					var21++;
				}
				var23 = arg11[var22];
				if (var23 != -1) {
					Class56 var32 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var23, 1138989349);
					if (!var32.aBoolean533) {
						var29 = true;
						if (this.method6447(var32.aByte525) || var32.aByte531 != 0 || var32.aByte530 != 0) {
							var25.aByte216 = (byte) (var25.aByte216 | 0x4);
						}
					}
				}
			}
			var25.anIntArray228 = new int[var21];
			if (arg10 != null) {
				var25.anIntArray229 = new int[var21];
			}
			var25.aShortArray223 = new short[var21];
			var25.aShortArray224 = new short[var21];
			var25.aShortArray225 = new short[var21];
			if (var29) {
				var25.aShortArray226 = new short[var21];
				var25.aShortArray219 = new short[var21];
			}
			for (var22 = 0; var22 < var28; var22++) {
				if (arg9[var22] >= 0 || arg10 != null && arg10[var22] >= 0) {
					if (arg9[var22] >= 0) {
						var25.anIntArray228[var25.aShort220] = Class356.modifyColor(arg9[var22], (byte) 1);
					} else {
						var25.anIntArray228[var25.aShort220] = -1;
					}
					if (arg10 != null) {
						if (arg10[var22] == -1) {
							var25.anIntArray229[var25.aShort220] = -1;
						} else {
							var25.anIntArray229[var25.aShort220] = Class356.modifyColor(arg10[var22], (byte) 1);
						}
					}
					var25.aShortArray223[var25.aShort220] = (short) arg6[var22];
					var25.aShortArray224[var25.aShort220] = (short) arg7[var22];
					var25.aShortArray225[var25.aShort220] = (short) arg8[var22];
					if (var29) {
						if (arg11[var22] == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg11[var22], -1175095151).aBoolean533) {
							var25.aShortArray226[var25.aShort220] = -1;
						} else {
							var25.aShortArray226[var25.aShort220] = (short) arg11[var22];
							var25.aShortArray219[var25.aShort220] = (short) arg12[var22];
						}
					}
					var25.aShort220++;
				}
			}
			this.aClass17ArrayArray8840[arg0][arg1] = var25;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			Class31 var26 = new Class31();
			var18 = arg9[0];
			var19 = arg11[0];
			if (arg10 != null) {
				var26.anInt357 = Class330_Sub26_Sub1.method3395(Class356.modifyColor(arg10[0], (byte) 1), this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -1233293600);
				if (var18 == -1) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x2);
				}
			}
			if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
				var26.aByte355 = (byte) (var26.aByte355 | 0x1);
			}
			Class56 var30 = null;
			if (var19 != -1) {
				var30 = this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var19, 682812971);
			}
			if (var30 == null || (var26.aByte355 & 0x2) != 0 || var30.aBoolean533) {
				short var31 = Class356.modifyColor(var18, (byte) 1);
				var26.aShort353 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1], -970386991);
				var26.aShort354 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1], -539895228);
				var26.aShort352 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1], -449633141);
				var26.aShort356 = (short) Class330_Sub26_Sub1.method3395(var31, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1], -1839105251);
				var26.aShort358 = -1;
			} else {
				var26.aShort353 = (short) (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]);
				var26.aShort354 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]);
				var26.aShort352 = (short) (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]);
				var26.aShort356 = (short) (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]);
				var26.aShort358 = (short) var19;
				if (this.method6447(var30.aByte525) || var30.aByte531 != 0 || var30.aByte530 != 0) {
					var26.aByte355 = (byte) (var26.aByte355 | 0x4);
				}
			}
			this.aClass31ArrayArray8839[arg0][arg1] = var26;
		}
	}

	@ObfuscatedName("Class_xa_Sub3.UA(LClass_na;IIIIZ)V")
	public void UA(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	public void method6422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		boolean var13 = (this.anInt8838 & 0x20) == 0;
		if (this.aClass4ArrayArray8832 == null && !var13) {
			this.aClass4ArrayArray8832 = new Class4[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
			this.aClass14ArrayArray8842 = new Class14[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass42ArrayArray8843 == null && var13) {
			this.aClass42ArrayArray8843 = new Class42[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass31ArrayArray8839 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		int var14;
		for (var14 = 0; var14 < arg6.length; var14++) {
			if (arg6[var14] == -1) {
				arg6[var14] = 0;
			} else {
				arg6[var14] = Console.anIntArray4263[Class356.modifyColor(arg6[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (var14 = 0; var14 < arg7.length; var14++) {
				if (arg7[var14] == -1) {
					arg7[var14] = 0;
				} else {
					arg7[var14] = Console.anIntArray4263[Class356.modifyColor(arg7[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		int var15;
		int var16;
		int var17;
		int var19;
		int var20;
		int var21;
		int var22;
		int var33;
		if (var13) {
			Class42 var29 = new Class42();
			var29.aShort433 = (short) arg2.length;
			var29.aShort430 = (short) (arg2.length / 3);
			var29.aShortArray432 = new short[var29.aShort433];
			var29.aShortArray431 = new short[var29.aShort433];
			var29.aShortArray434 = new short[var29.aShort433];
			var29.anIntArray438 = new int[var29.aShort433];
			var29.aShortArray436 = new short[var29.aShort433];
			var29.aShortArray437 = new short[var29.aShort433];
			var29.aByteArray439 = new byte[var29.aShort433];
			if (arg5 != null) {
				var29.aShortArray440 = new short[var29.aShort433];
			}
			for (var15 = 0; var15 < var29.aShort433; var15++) {
				var16 = arg2[var15];
				var17 = arg4[var15];
				boolean var18 = false;
				if (var16 == 0 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var16 == 0 && var17 == this.anInt6395 * -1684509909 * 550173571) {
					var19 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var16 == this.anInt6395 * -1684509909 * 550173571 && var17 == this.anInt6395 * -1684509909 * 550173571) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var16 == this.anInt6395 * -1684509909 * 550173571 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var20 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var16;
					var21 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var16;
					var19 = var20 * (this.anInt6395 * -1684509909 * 550173571 - var17) + var21 * var17 >> this.anInt6396 * -786523509 * -2132608442;
				}
				var20 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var16;
				var21 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var17;
				var29.aShortArray432[var15] = (short) var16;
				var29.aShortArray434[var15] = (short) var17;
				var29.aShortArray431[var15] = (short) (this.method6416(var20, var21, -860909987) + (arg3 == null ? 0 : arg3[var15]));
				if (var19 < 0) {
					var19 = 0;
				}
				if (arg6[var15] == 0) {
					var29.anIntArray438[var15] = 0;
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				} else {
					var22 = 0;
					if (arg5 != null) {
						short var23 = var29.aShortArray440[var15] = (short) arg5[var15];
						if (arg10.anInt650 * -2010008277 * -348036733 != 0) {
							var22 = var23 * 255 / (arg10.anInt650 * -2010008277 * -348036733);
							if (var22 < 0) {
								var22 = 0;
							} else if (var22 > 255) {
								var22 = 255;
							}
						}
					}
					var33 = -16777216;
					if (arg8[var15] != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var15], 2099636472).aByte525)) {
						var33 = -1694498816;
					}
					var29.anIntArray438[var15] = var33 | Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, var19), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 24);
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				}
				var29.aShortArray436[var15] = (short) arg8[var15];
				var29.aShortArray437[var15] = (short) arg9[var15];
			}
			if (arg7 != null) {
				var29.anIntArray435 = new int[var29.aShort430];
			}
			for (var15 = 0; var15 < var29.aShort430; var15++) {
				var16 = var15 * 3;
				if (arg7 != null && arg7[var16] != 0) {
					var29.anIntArray435[var15] = arg7[var16] >> 8 | 0xFF000000;
				}
			}
			this.aClass42ArrayArray8843[arg0][arg1] = var29;
			return;
		}
		boolean var30 = true;
		var15 = -1;
		var16 = -1;
		var17 = -1;
		int var31 = -1;
		if (arg2.length == 6) {
			for (var19 = 0; var19 < 6; var19++) {
				if (arg2[var19] == 0 && arg4[var19] == 0) {
					if (var15 != -1 && arg6[var15] != arg6[var19]) {
						var30 = false;
						break;
					}
					var15 = var19;
				} else if (arg2[var19] == this.anInt6395 * -1684509909 * 550173571 && arg4[var19] == 0) {
					if (var16 != -1 && arg6[var16] != arg6[var19]) {
						var30 = false;
						break;
					}
					var16 = var19;
				} else if (arg2[var19] == this.anInt6395 * -1684509909 * 550173571 && arg4[var19] == this.anInt6395 * -1684509909 * 550173571) {
					if (var17 != -1 && arg6[var17] != arg6[var19]) {
						var30 = false;
						break;
					}
					var17 = var19;
				} else if (arg2[var19] == 0 && arg4[var19] == this.anInt6395 * -1684509909 * 550173571) {
					if (var31 != -1 && arg6[var31] != arg6[var19]) {
						var30 = false;
						break;
					}
					var31 = var19;
				}
			}
			if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
				var30 = false;
			}
			if (var30) {
				if (arg3 != null) {
					for (var19 = 0; var19 < 4; var19++) {
						if (arg3[var19] != 0) {
							var30 = false;
							break;
						}
					}
				}
				if (var30) {
					for (var19 = 1; var19 < 4; var19++) {
						if (arg2[var19] != arg2[0] && arg2[var19] != arg2[0] + this.anInt6395 * -1684509909 * 550173571 && arg2[var19] != arg2[0] - this.anInt6395 * -1684509909 * 550173571) {
							var30 = false;
							break;
						}
						if (arg4[var19] != arg4[0] && arg4[var19] != arg4[0] + this.anInt6395 * -1684509909 * 550173571 && arg4[var19] != arg4[0] - this.anInt6395 * -1684509909 * 550173571) {
							var30 = false;
							break;
						}
					}
				}
			}
		} else {
			var30 = false;
		}
		if (!var30) {
			Class14 var35 = new Class14();
			var35.aShort177 = (short) arg2.length;
			var35.aShort185 = (short) (arg2.length / 3);
			var35.aShortArray179 = new short[var35.aShort177];
			var35.aShortArray180 = new short[var35.aShort177];
			var35.aShortArray181 = new short[var35.aShort177];
			var35.anIntArray183 = new int[var35.aShort177];
			if (arg5 != null) {
				var35.aShortArray182 = new short[var35.aShort177];
			}
			int var24;
			int var27;
			for (var20 = 0; var20 < var35.aShort177; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				boolean var36 = false;
				int var25;
				int var26;
				if (var21 == 0 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var21 == 0 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var24 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var25 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var26 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var24 = var25 * (this.anInt6395 * -1684509909 * 550173571 - var22) + var26 * var22 >> this.anInt6396 * -786523509 * -2132608442;
				}
				var25 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var21;
				var26 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var22;
				var35.aShortArray179[var20] = (short) var21;
				var35.aShortArray181[var20] = (short) var22;
				var35.aShortArray180[var20] = (short) (this.method6416(var25, var26, 1383068495) + (arg3 == null ? 0 : arg3[var20]));
				if (var24 < 0) {
					var24 = 0;
				}
				if (arg6[var20] != 0) {
					var27 = 0;
					if (arg5 != null) {
						short var28 = var35.aShortArray182[var20] = (short) arg5[var20];
						if (arg10.anInt650 * -2010008277 * -348036733 != 0) {
							var27 = var28 * 255 / (arg10.anInt650 * -2010008277 * -348036733);
							if (var27 < 0) {
								var27 = 0;
							} else if (var27 > 255) {
								var27 = 255;
							}
						}
					}
					var35.anIntArray183[var20] = Class95_Sub12_Sub1.method1139(method6442(arg6[var20] >> 8, var24), arg10.anInt652 * -1037349593 * -576105833, var27, (byte) 39);
					if (arg7 != null) {
						var35.anIntArray183[var20] |= var24 << 25;
					}
				} else if (arg7 == null) {
					var35.anIntArray183[var20] = 0;
				} else {
					var35.anIntArray183[var20] = var24 << 25;
				}
			}
			boolean var32 = false;
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				if (arg8[var21 * 3] != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var21 * 3], -1315395319).aBoolean533) {
					var32 = true;
				}
			}
			if (arg7 != null) {
				var35.anIntArray186 = new int[var35.aShort185];
			}
			if (var32) {
				var35.aShortArray176 = new short[var35.aShort185];
				var35.aShortArray184 = new short[var35.aShort185];
			}
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				var22 = var21 * 3;
				if (arg7 != null && arg7[var22] != 0) {
					var35.anIntArray186[var21] = arg7[var22] >> 8;
				}
				if (var32) {
					var33 = var22 + 1;
					var24 = var33 + 1;
					boolean var37 = false;
					boolean var38 = true;
					var27 = arg8[var22];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 867500621).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var33];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -800945425).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var24];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 432820356).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					if (var38) {
						var35.aShortArray176[var21] = (short) var27;
						var35.aShortArray184[var21] = (short) arg9[var22];
					} else {
						if (var37) {
							var27 = arg8[var22];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1087139946).aBoolean533) {
								var35.anIntArray183[var22] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -2082580768).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var33];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1992403432).aBoolean533) {
								var35.anIntArray183[var33] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -987148408).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var24];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1255381007).aBoolean533) {
								var35.anIntArray183[var24] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1401574915).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
						}
						var35.aShortArray176[var21] = -1;
					}
				}
			}
			this.aClass14ArrayArray8842[arg0][arg1] = var35;
			return;
		}
		Class4 var34 = new Class4();
		var20 = arg6[0];
		var21 = arg8[0];
		if (arg7 != null) {
			var34.anInt66 = arg7[0] >> 8;
			if (var20 == 0) {
				var34.aByte65 = (byte) (var34.aByte65 | 0x2);
			}
		} else if (var20 == 0) {
			return;
		}
		if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
			var34.aByte65 = (byte) (var34.aByte65 | 0x1);
		}
		if (var21 == -1 || (var34.aByte65 & 0x2) != 0 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var21, -1981010076).aBoolean533) {
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 109);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 49);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 103);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 41);
			if (var34.anInt66 != 0) {
				var34.anInt58 |= 255 - (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) << 25;
			}
			var34.aShort67 = -1;
		} else {
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 55);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 8);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 81);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 47);
			var34.aShort67 = (short) var21;
		}
		if (arg5 != null) {
			var34.aShort57 = (short) arg5[var17];
			var34.aShort63 = (short) arg5[var31];
			var34.aShort61 = (short) arg5[var16];
			var34.aShort62 = (short) arg5[var15];
		}
		this.aClass4ArrayArray8832[arg0][arg1] = var34;
	}

	public void method6419(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		boolean var13 = (this.anInt8838 & 0x20) == 0;
		if (this.aClass4ArrayArray8832 == null && !var13) {
			this.aClass4ArrayArray8832 = new Class4[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
			this.aClass14ArrayArray8842 = new Class14[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass42ArrayArray8843 == null && var13) {
			this.aClass42ArrayArray8843 = new Class42[this.anInt6397 * -1250378663 * 1972554729][this.anInt6393 * -1805935063 * 24567321];
		} else if (this.aClass31ArrayArray8839 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		int var14;
		for (var14 = 0; var14 < arg6.length; var14++) {
			if (arg6[var14] == -1) {
				arg6[var14] = 0;
			} else {
				arg6[var14] = Console.anIntArray4263[Class356.modifyColor(arg6[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (var14 = 0; var14 < arg7.length; var14++) {
				if (arg7[var14] == -1) {
					arg7[var14] = 0;
				} else {
					arg7[var14] = Console.anIntArray4263[Class356.modifyColor(arg7[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		int var15;
		int var16;
		int var17;
		int var19;
		int var20;
		int var21;
		int var22;
		int var33;
		if (var13) {
			Class42 var29 = new Class42();
			var29.aShort433 = (short) arg2.length;
			var29.aShort430 = (short) (arg2.length / 3);
			var29.aShortArray432 = new short[var29.aShort433];
			var29.aShortArray431 = new short[var29.aShort433];
			var29.aShortArray434 = new short[var29.aShort433];
			var29.anIntArray438 = new int[var29.aShort433];
			var29.aShortArray436 = new short[var29.aShort433];
			var29.aShortArray437 = new short[var29.aShort433];
			var29.aByteArray439 = new byte[var29.aShort433];
			if (arg5 != null) {
				var29.aShortArray440 = new short[var29.aShort433];
			}
			for (var15 = 0; var15 < var29.aShort433; var15++) {
				var16 = arg2[var15];
				var17 = arg4[var15];
				boolean var18 = false;
				if (var16 == 0 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var16 == 0 && var17 == this.anInt6395 * -1684509909 * 550173571) {
					var19 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var16 == this.anInt6395 * -1684509909 * 550173571 && var17 == this.anInt6395 * -1684509909 * 550173571) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var16 == this.anInt6395 * -1684509909 * 550173571 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var20 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var16;
					var21 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var16;
					var19 = var20 * (this.anInt6395 * -1684509909 * 550173571 - var17) + var21 * var17 >> this.anInt6396 * -786523509 * -2132608442;
				}
				var20 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var16;
				var21 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var17;
				var29.aShortArray432[var15] = (short) var16;
				var29.aShortArray434[var15] = (short) var17;
				var29.aShortArray431[var15] = (short) (this.method6416(var20, var21, 93619635) + (arg3 == null ? 0 : arg3[var15]));
				if (var19 < 0) {
					var19 = 0;
				}
				if (arg6[var15] == 0) {
					var29.anIntArray438[var15] = 0;
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				} else {
					var22 = 0;
					if (arg5 != null) {
						short var23 = var29.aShortArray440[var15] = (short) arg5[var15];
						if (arg10.anInt650 * -2010008277 * -348036733 != 0) {
							var22 = var23 * 255 / (arg10.anInt650 * -2010008277 * -348036733);
							if (var22 < 0) {
								var22 = 0;
							} else if (var22 > 255) {
								var22 = 255;
							}
						}
					}
					var33 = -16777216;
					if (arg8[var15] != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var15], -1240738228).aByte525)) {
						var33 = -1694498816;
					}
					var29.anIntArray438[var15] = var33 | Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, var19), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 14);
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				}
				var29.aShortArray436[var15] = (short) arg8[var15];
				var29.aShortArray437[var15] = (short) arg9[var15];
			}
			if (arg7 != null) {
				var29.anIntArray435 = new int[var29.aShort430];
			}
			for (var15 = 0; var15 < var29.aShort430; var15++) {
				var16 = var15 * 3;
				if (arg7 != null && arg7[var16] != 0) {
					var29.anIntArray435[var15] = arg7[var16] >> 8 | 0xFF000000;
				}
			}
			this.aClass42ArrayArray8843[arg0][arg1] = var29;
			return;
		}
		boolean var30 = true;
		var15 = -1;
		var16 = -1;
		var17 = -1;
		int var31 = -1;
		if (arg2.length == 6) {
			for (var19 = 0; var19 < 6; var19++) {
				if (arg2[var19] == 0 && arg4[var19] == 0) {
					if (var15 != -1 && arg6[var15] != arg6[var19]) {
						var30 = false;
						break;
					}
					var15 = var19;
				} else if (arg2[var19] == this.anInt6395 * -1684509909 * 550173571 && arg4[var19] == 0) {
					if (var16 != -1 && arg6[var16] != arg6[var19]) {
						var30 = false;
						break;
					}
					var16 = var19;
				} else if (arg2[var19] == this.anInt6395 * -1684509909 * 550173571 && arg4[var19] == this.anInt6395 * -1684509909 * 550173571) {
					if (var17 != -1 && arg6[var17] != arg6[var19]) {
						var30 = false;
						break;
					}
					var17 = var19;
				} else if (arg2[var19] == 0 && arg4[var19] == this.anInt6395 * -1684509909 * 550173571) {
					if (var31 != -1 && arg6[var31] != arg6[var19]) {
						var30 = false;
						break;
					}
					var31 = var19;
				}
			}
			if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
				var30 = false;
			}
			if (var30) {
				if (arg3 != null) {
					for (var19 = 0; var19 < 4; var19++) {
						if (arg3[var19] != 0) {
							var30 = false;
							break;
						}
					}
				}
				if (var30) {
					for (var19 = 1; var19 < 4; var19++) {
						if (arg2[var19] != arg2[0] && arg2[var19] != arg2[0] + this.anInt6395 * -1684509909 * 550173571 && arg2[var19] != arg2[0] - this.anInt6395 * -1684509909 * 550173571) {
							var30 = false;
							break;
						}
						if (arg4[var19] != arg4[0] && arg4[var19] != arg4[0] + this.anInt6395 * -1684509909 * 550173571 && arg4[var19] != arg4[0] - this.anInt6395 * -1684509909 * 550173571) {
							var30 = false;
							break;
						}
					}
				}
			}
		} else {
			var30 = false;
		}
		if (!var30) {
			Class14 var35 = new Class14();
			var35.aShort177 = (short) arg2.length;
			var35.aShort185 = (short) (arg2.length / 3);
			var35.aShortArray179 = new short[var35.aShort177];
			var35.aShortArray180 = new short[var35.aShort177];
			var35.aShortArray181 = new short[var35.aShort177];
			var35.anIntArray183 = new int[var35.aShort177];
			if (arg5 != null) {
				var35.aShortArray182 = new short[var35.aShort177];
			}
			int var24;
			int var27;
			for (var20 = 0; var20 < var35.aShort177; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				boolean var36 = false;
				int var25;
				int var26;
				if (var21 == 0 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var21 == 0 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var24 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == this.anInt6395 * -1684509909 * 550173571) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var21 == this.anInt6395 * -1684509909 * 550173571 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var25 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var26 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 * -1684509909 * 550173571 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var24 = var25 * (this.anInt6395 * -1684509909 * 550173571 - var22) + var26 * var22 >> this.anInt6396 * -786523509 * -2132608442;
				}
				var25 = (arg0 << this.anInt6396 * -786523509 * -1066304221) + var21;
				var26 = (arg1 << this.anInt6396 * -786523509 * -1066304221) + var22;
				var35.aShortArray179[var20] = (short) var21;
				var35.aShortArray181[var20] = (short) var22;
				var35.aShortArray180[var20] = (short) (this.method6416(var25, var26, 394582232) + (arg3 == null ? 0 : arg3[var20]));
				if (var24 < 0) {
					var24 = 0;
				}
				if (arg6[var20] != 0) {
					var27 = 0;
					if (arg5 != null) {
						short var28 = var35.aShortArray182[var20] = (short) arg5[var20];
						if (arg10.anInt650 * -2010008277 * -348036733 != 0) {
							var27 = var28 * 255 / (arg10.anInt650 * -2010008277 * -348036733);
							if (var27 < 0) {
								var27 = 0;
							} else if (var27 > 255) {
								var27 = 255;
							}
						}
					}
					var35.anIntArray183[var20] = Class95_Sub12_Sub1.method1139(method6442(arg6[var20] >> 8, var24), arg10.anInt652 * -1037349593 * -576105833, var27, (byte) 92);
					if (arg7 != null) {
						var35.anIntArray183[var20] |= var24 << 25;
					}
				} else if (arg7 == null) {
					var35.anIntArray183[var20] = 0;
				} else {
					var35.anIntArray183[var20] = var24 << 25;
				}
			}
			boolean var32 = false;
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				if (arg8[var21 * 3] != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var21 * 3], 514621033).aBoolean533) {
					var32 = true;
				}
			}
			if (arg7 != null) {
				var35.anIntArray186 = new int[var35.aShort185];
			}
			if (var32) {
				var35.aShortArray176 = new short[var35.aShort185];
				var35.aShortArray184 = new short[var35.aShort185];
			}
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				var22 = var21 * 3;
				if (arg7 != null && arg7[var22] != 0) {
					var35.anIntArray186[var21] = arg7[var22] >> 8;
				}
				if (var32) {
					var33 = var22 + 1;
					var24 = var33 + 1;
					boolean var37 = false;
					boolean var38 = true;
					var27 = arg8[var22];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 2095980761).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var33];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 954668308).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var24];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1494848954).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					if (var38) {
						var35.aShortArray176[var21] = (short) var27;
						var35.aShortArray184[var21] = (short) arg9[var22];
					} else {
						if (var37) {
							var27 = arg8[var22];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1837870968).aBoolean533) {
								var35.anIntArray183[var22] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -1774245736).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var33];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 257614280).aBoolean533) {
								var35.anIntArray183[var33] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -883188782).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var24];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1035863759).aBoolean533) {
								var35.anIntArray183[var24] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 633806980).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
						}
						var35.aShortArray176[var21] = -1;
					}
				}
			}
			this.aClass14ArrayArray8842[arg0][arg1] = var35;
			return;
		}
		Class4 var34 = new Class4();
		var20 = arg6[0];
		var21 = arg8[0];
		if (arg7 != null) {
			var34.anInt66 = arg7[0] >> 8;
			if (var20 == 0) {
				var34.aByte65 = (byte) (var34.aByte65 | 0x2);
			}
		} else if (var20 == 0) {
			return;
		}
		if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
			var34.aByte65 = (byte) (var34.aByte65 | 0x1);
		}
		if (var21 == -1 || (var34.aByte65 & 0x2) != 0 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var21, -1162183605).aBoolean533) {
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 88);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 123);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 21);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 27);
			if (var34.anInt66 != 0) {
				var34.anInt58 |= 255 - (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) << 25;
			}
			var34.aShort67 = -1;
		} else {
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 43);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 12);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 7);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 * -2010008277 * -348036733 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / (arg10.anInt650 * -2010008277 * -348036733);
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652 * -1037349593 * -576105833, var22, (byte) 3);
			var34.aShort67 = (short) var21;
		}
		if (arg5 != null) {
			var34.aShort57 = (short) arg5[var17];
			var34.aShort63 = (short) arg5[var31];
			var34.aShort61 = (short) arg5[var16];
			var34.aShort62 = (short) arg5[var15];
		}
		this.aClass4ArrayArray8832[arg0][arg1] = var34;
	}

	@ObfuscatedName("Class_xa_Sub3.d()V")
	public void d() {
		this.aByteArrayArray8860 = null;
		this.aByteArrayArray8858 = null;
	}

	@ObfuscatedName("Class_xa_Sub3.c()V")
	public void c() {
		this.aByteArrayArray8860 = null;
		this.aByteArrayArray8858 = null;
	}

	public void method6425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, Class77 arg10, boolean arg11) {
		boolean var13 = (this.anInt8838 & 0x20) == 0;
		if (this.aClass4ArrayArray8832 == null && !var13) {
			this.aClass4ArrayArray8832 = new Class4[this.anInt6397][this.anInt6393];
			this.aClass14ArrayArray8842 = new Class14[this.anInt6397][this.anInt6393];
		} else if (this.aClass42ArrayArray8843 == null && var13) {
			this.aClass42ArrayArray8843 = new Class42[this.anInt6397][this.anInt6393];
		} else if (this.aClass31ArrayArray8839 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		int var14;
		for (var14 = 0; var14 < arg6.length; var14++) {
			if (arg6[var14] == -1) {
				arg6[var14] = 0;
			} else {
				arg6[var14] = Console.anIntArray4263[Class356.modifyColor(arg6[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (var14 = 0; var14 < arg7.length; var14++) {
				if (arg7[var14] == -1) {
					arg7[var14] = 0;
				} else {
					arg7[var14] = Console.anIntArray4263[Class356.modifyColor(arg7[var14], (byte) 1) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		int var15;
		int var16;
		int var17;
		int var19;
		int var20;
		int var21;
		int var22;
		int var33;
		if (var13) {
			Class42 var29 = new Class42();
			var29.aShort433 = (short) arg2.length;
			var29.aShort430 = (short) (arg2.length / 3);
			var29.aShortArray432 = new short[var29.aShort433];
			var29.aShortArray431 = new short[var29.aShort433];
			var29.aShortArray434 = new short[var29.aShort433];
			var29.anIntArray438 = new int[var29.aShort433];
			var29.aShortArray436 = new short[var29.aShort433];
			var29.aShortArray437 = new short[var29.aShort433];
			var29.aByteArray439 = new byte[var29.aShort433];
			if (arg5 != null) {
				var29.aShortArray440 = new short[var29.aShort433];
			}
			for (var15 = 0; var15 < var29.aShort433; var15++) {
				var16 = arg2[var15];
				var17 = arg4[var15];
				boolean var18 = false;
				if (var16 == 0 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var16 == 0 && var17 == this.anInt6395) {
					var19 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var16 == this.anInt6395 && var17 == this.anInt6395) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var16 == this.anInt6395 && var17 == 0) {
					var19 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var20 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var16;
					var21 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 - var16) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var16;
					var19 = var20 * (this.anInt6395 - var17) + var21 * var17 >> this.anInt6396 * 2;
				}
				var20 = (arg0 << this.anInt6396) + var16;
				var21 = (arg1 << this.anInt6396) + var17;
				var29.aShortArray432[var15] = (short) var16;
				var29.aShortArray434[var15] = (short) var17;
				var29.aShortArray431[var15] = (short) (this.method6416(var20, var21, -642653786) + (arg3 == null ? 0 : arg3[var15]));
				if (var19 < 0) {
					var19 = 0;
				}
				if (arg6[var15] == 0) {
					var29.anIntArray438[var15] = 0;
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				} else {
					var22 = 0;
					if (arg5 != null) {
						short var23 = var29.aShortArray440[var15] = (short) arg5[var15];
						if (arg10.anInt650 != 0) {
							var22 = var23 * 255 / arg10.anInt650;
							if (var22 < 0) {
								var22 = 0;
							} else if (var22 > 255) {
								var22 = 255;
							}
						}
					}
					var33 = -16777216;
					if (arg8[var15] != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var15], -1560832540).aByte525)) {
						var33 = -1694498816;
					}
					var29.anIntArray438[var15] = var33 | Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, var19), arg10.anInt652, var22, (byte) 3);
					if (arg7 != null) {
						var29.aByteArray439[var15] = (byte) var19;
					}
				}
				var29.aShortArray436[var15] = (short) arg8[var15];
				var29.aShortArray437[var15] = (short) arg9[var15];
			}
			if (arg7 != null) {
				var29.anIntArray435 = new int[var29.aShort430];
			}
			for (var15 = 0; var15 < var29.aShort430; var15++) {
				var16 = var15 * 3;
				if (arg7 != null && arg7[var16] != 0) {
					var29.anIntArray435[var15] = arg7[var16] >> 8 | 0xFF000000;
				}
			}
			this.aClass42ArrayArray8843[arg0][arg1] = var29;
			return;
		}
		boolean var30 = true;
		var15 = -1;
		var16 = -1;
		var17 = -1;
		int var31 = -1;
		if (arg2.length == 6) {
			for (var19 = 0; var19 < 6; var19++) {
				if (arg2[var19] == 0 && arg4[var19] == 0) {
					if (var15 != -1 && arg6[var15] != arg6[var19]) {
						var30 = false;
						break;
					}
					var15 = var19;
				} else if (arg2[var19] == this.anInt6395 && arg4[var19] == 0) {
					if (var16 != -1 && arg6[var16] != arg6[var19]) {
						var30 = false;
						break;
					}
					var16 = var19;
				} else if (arg2[var19] == this.anInt6395 && arg4[var19] == this.anInt6395) {
					if (var17 != -1 && arg6[var17] != arg6[var19]) {
						var30 = false;
						break;
					}
					var17 = var19;
				} else if (arg2[var19] == 0 && arg4[var19] == this.anInt6395) {
					if (var31 != -1 && arg6[var31] != arg6[var19]) {
						var30 = false;
						break;
					}
					var31 = var19;
				}
			}
			if (var15 == -1 || var16 == -1 || var17 == -1 || var31 == -1) {
				var30 = false;
			}
			if (var30) {
				if (arg3 != null) {
					for (var19 = 0; var19 < 4; var19++) {
						if (arg3[var19] != 0) {
							var30 = false;
							break;
						}
					}
				}
				if (var30) {
					for (var19 = 1; var19 < 4; var19++) {
						if (arg2[var19] != arg2[0] && arg2[var19] != arg2[0] + this.anInt6395 && arg2[var19] != arg2[0] - this.anInt6395) {
							var30 = false;
							break;
						}
						if (arg4[var19] != arg4[0] && arg4[var19] != arg4[0] + this.anInt6395 && arg4[var19] != arg4[0] - this.anInt6395) {
							var30 = false;
							break;
						}
					}
				}
			}
		} else {
			var30 = false;
		}
		if (!var30) {
			Class14 var35 = new Class14();
			var35.aShort177 = (short) arg2.length;
			var35.aShort185 = (short) (arg2.length / 3);
			var35.aShortArray179 = new short[var35.aShort177];
			var35.aShortArray180 = new short[var35.aShort177];
			var35.aShortArray181 = new short[var35.aShort177];
			var35.anIntArray183 = new int[var35.aShort177];
			if (arg5 != null) {
				var35.aShortArray182 = new short[var35.aShort177];
			}
			int var24;
			int var27;
			for (var20 = 0; var20 < var35.aShort177; var20++) {
				var21 = arg2[var20];
				var22 = arg4[var20];
				boolean var36 = false;
				int var25;
				int var26;
				if (var21 == 0 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1];
				} else if (var21 == 0 && var22 == this.anInt6395) {
					var24 = this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1];
				} else if (var21 == this.anInt6395 && var22 == this.anInt6395) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1];
				} else if (var21 == this.anInt6395 && var22 == 0) {
					var24 = this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1];
				} else {
					var25 = (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) * (this.anInt6395 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) * var21;
					var26 = (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) * (this.anInt6395 - var21) + (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) * var21;
					var24 = var25 * (this.anInt6395 - var22) + var26 * var22 >> this.anInt6396 * 2;
				}
				var25 = (arg0 << this.anInt6396) + var21;
				var26 = (arg1 << this.anInt6396) + var22;
				var35.aShortArray179[var20] = (short) var21;
				var35.aShortArray181[var20] = (short) var22;
				var35.aShortArray180[var20] = (short) (this.method6416(var25, var26, -1034659155) + (arg3 == null ? 0 : arg3[var20]));
				if (var24 < 0) {
					var24 = 0;
				}
				if (arg6[var20] != 0) {
					var27 = 0;
					if (arg5 != null) {
						short var28 = var35.aShortArray182[var20] = (short) arg5[var20];
						if (arg10.anInt650 != 0) {
							var27 = var28 * 255 / arg10.anInt650;
							if (var27 < 0) {
								var27 = 0;
							} else if (var27 > 255) {
								var27 = 255;
							}
						}
					}
					var35.anIntArray183[var20] = Class95_Sub12_Sub1.method1139(method6442(arg6[var20] >> 8, var24), arg10.anInt652, var27, (byte) 12);
					if (arg7 != null) {
						var35.anIntArray183[var20] |= var24 << 25;
					}
				} else if (arg7 == null) {
					var35.anIntArray183[var20] = 0;
				} else {
					var35.anIntArray183[var20] = var24 << 25;
				}
			}
			boolean var32 = false;
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				if (arg8[var21 * 3] != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(arg8[var21 * 3], -1003064196).aBoolean533) {
					var32 = true;
				}
			}
			if (arg7 != null) {
				var35.anIntArray186 = new int[var35.aShort185];
			}
			if (var32) {
				var35.aShortArray176 = new short[var35.aShort185];
				var35.aShortArray184 = new short[var35.aShort185];
			}
			for (var21 = 0; var21 < var35.aShort185; var21++) {
				var22 = var21 * 3;
				if (arg7 != null && arg7[var22] != 0) {
					var35.anIntArray186[var21] = arg7[var22] >> 8;
				}
				if (var32) {
					var33 = var22 + 1;
					var24 = var33 + 1;
					boolean var37 = false;
					boolean var38 = true;
					var27 = arg8[var22];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -2010794146).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var33];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -478928567).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					var27 = arg8[var24];
					if (var27 == -1 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -2046969811).aBoolean533) {
						var38 = false;
					} else {
						var37 = true;
					}
					if (var38) {
						var35.aShortArray176[var21] = (short) var27;
						var35.aShortArray184[var21] = (short) arg9[var22];
					} else {
						if (var37) {
							var27 = arg8[var22];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1649154611).aBoolean533) {
								var35.anIntArray183[var22] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, 1475639993).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var33];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -1854515274).aBoolean533) {
								var35.anIntArray183[var33] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -23480291).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
							var27 = arg8[var24];
							if (var27 != -1 && !this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -1409891090).aBoolean533) {
								var35.anIntArray183[var24] = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var27, -1149372548).aShort523 & 0xFFFF, (byte) 1) & 0xFFFF];
							}
						}
						var35.aShortArray176[var21] = -1;
					}
				}
			}
			this.aClass14ArrayArray8842[arg0][arg1] = var35;
			return;
		}
		Class4 var34 = new Class4();
		var20 = arg6[0];
		var21 = arg8[0];
		if (arg7 != null) {
			var34.anInt66 = arg7[0] >> 8;
			if (var20 == 0) {
				var34.aByte65 = (byte) (var34.aByte65 | 0x2);
			}
		} else if (var20 == 0) {
			return;
		}
		if (this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0 + 1][arg1 + 1] && this.anIntArrayArray6394[arg0][arg1] == this.anIntArrayArray6394[arg0][arg1 + 1]) {
			var34.aByte65 = (byte) (var34.aByte65 | 0x1);
		}
		if (var21 == -1 || (var34.aByte65 & 0x2) != 0 || this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var21, 2008329902).aBoolean533) {
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652, var22, (byte) 108);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652, var22, (byte) 111);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652, var22, (byte) 123);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652, var22, (byte) 7);
			if (var34.anInt66 != 0) {
				var34.anInt58 |= 255 - (this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]) << 25;
			}
			var34.aShort67 = -1;
		} else {
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var15] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt59 = Class95_Sub12_Sub1.method1139(method6442(arg6[var15] >> 8, this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]), arg10.anInt652, var22, (byte) 60);
			if (var34.anInt66 != 0) {
				var34.anInt59 |= 255 - (this.aByteArrayArray8860[arg0][arg1] - this.aByteArrayArray8858[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var16] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt64 = Class95_Sub12_Sub1.method1139(method6442(arg6[var16] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]), arg10.anInt652, var22, (byte) 54);
			if (var34.anInt66 != 0) {
				var34.anInt64 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1] - this.aByteArrayArray8858[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var17] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt60 = Class95_Sub12_Sub1.method1139(method6442(arg6[var17] >> 8, this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]), arg10.anInt652, var22, (byte) 74);
			if (var34.anInt66 != 0) {
				var34.anInt60 |= 255 - (this.aByteArrayArray8860[arg0 + 1][arg1 + 1] - this.aByteArrayArray8858[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt650 == 0) {
				var22 = 0;
			} else {
				var22 = arg5[var31] * 255 / arg10.anInt650;
				if (var22 < 0) {
					var22 = 0;
				} else if (var22 > 255) {
					var22 = 255;
				}
			}
			var34.anInt58 = Class95_Sub12_Sub1.method1139(method6442(arg6[var31] >> 8, this.aByteArrayArray8860[arg0][arg1 + 1] - this.aByteArrayArray8858[arg0][arg1 + 1]), arg10.anInt652, var22, (byte) 115);
			var34.aShort67 = (short) var21;
		}
		if (arg5 != null) {
			var34.aShort57 = (short) arg5[var17];
			var34.aShort63 = (short) arg5[var31];
			var34.aShort61 = (short) arg5[var16];
			var34.aShort62 = (short) arg5[var15];
		}
		this.aClass4ArrayArray8832[arg0][arg1] = var34;
	}

	public void method6446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, Class6 arg8, Class38 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.aBoolean111;
		this.aClass_ra_Sub3_8848.RA(false);
		arg9.aBoolean384 = false;
		arg9.aBoolean383 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					int var21;
					if (this.aClass31ArrayArray8839[var18][var19] != null) {
						Class31 var32 = this.aClass31ArrayArray8839[var18][var19];
						if (var32.aShort358 != -1 && (var32.aByte355 & 0x2) == 0 && var32.anInt357 == -1) {
							var21 = this.aClass_ra_Sub3_8848.method5192(var32.aShort358);
							arg9.method544(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort352 & 0xFFFF, -929632453), (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort356 & 0xFFFF, -2002385742), (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort354 & 0xFFFF, -2017523924));
							arg9.method544(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort353 & 0xFFFF, -975672290), (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort354 & 0xFFFF, -1889442372), (float) Class330_Sub26_Sub1.method3395(var21, var32.aShort356 & 0xFFFF, -432331062));
						} else if (var32.anInt357 == -1) {
							arg9.method544(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, (float) (var32.aShort352 & 0xFFFF), (float) (var32.aShort356 & 0xFFFF), (float) (var32.aShort354 & 0xFFFF));
							arg9.method544(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var32.aShort353 & 0xFFFF), (float) (var32.aShort354 & 0xFFFF), (float) (var32.aShort356 & 0xFFFF));
						} else {
							var21 = var32.anInt357;
							arg9.method544(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, (float) var21, (float) var21, (float) var21);
							arg9.method544(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, (float) var21, (float) var21, (float) var21);
						}
					} else if (this.aClass17ArrayArray8840[var18][var19] != null) {
						Class17 var20 = this.aClass17ArrayArray8840[var18][var19];
						for (var21 = 0; var21 < var20.aShort217; var21++) {
							arg10[var21] = var16 + var20.aShortArray227[var21] * var14 / this.anInt6395;
							arg11[var21] = var17 - var20.aShortArray221[var21] * var14 / this.anInt6395;
						}
						for (var21 = 0; var21 < var20.aShort220; var21++) {
							short var22 = var20.aShortArray223[var21];
							short var23 = var20.aShortArray224[var21];
							short var24 = var20.aShortArray225[var21];
							float var25 = arg10[var22];
							float var26 = arg10[var23];
							float var27 = arg10[var24];
							float var28 = arg11[var22];
							float var29 = arg11[var23];
							float var30 = arg11[var24];
							int var31;
							if (var20.anIntArray229 != null && var20.anIntArray229[var21] != -1) {
								var31 = var20.anIntArray229[var21];
								arg9.method544(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var22], -2115240740), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var23], -1108589641), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var24], -1143954343));
							} else if (var20.aShortArray226 == null || var20.aShortArray226[var21] == -1) {
								var31 = var20.anIntArray228[var21];
								arg9.method544(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var22], -1881528283), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var23], -1267683334), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var24], -1121038589));
							} else {
								var31 = this.aClass_ra_Sub3_8848.method5192(var20.aShortArray226[var21]);
								arg9.method544(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var22], -786729625), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var23], -1514840218), (float) Class330_Sub26_Sub1.method3395(var31, var20.aShortArray222[var24], -1858352889));
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.aBoolean384 = true;
		this.aClass_ra_Sub3_8848.RA(var15);
	}

	public boolean method6447(int arg0) {
		if ((this.anInt8838 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@ObfuscatedName("Class_xa_Sub3.h(IILClass_na;)LClass_na;")
	public Class_na h(int arg0, int arg1, Class_na arg2) {
		return null;
	}

	@ObfuscatedName("Class_xa_Sub3.al(LClass_na;IIIIZ)V")
	public void al(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	public void method6428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class6 var9 = this.aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 var10 = var9.aClass38_94;
		var10.anInt402 = 0;
		var10.aBoolean387 = true;
		this.aClass_ra_Sub3_8848.method5197();
		if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			this.method6448(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		} else if (this.aClass31ArrayArray8839 != null) {
			this.method6446(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		}
	}

	@ObfuscatedName("Class_xa_Sub3.SA()V")
	public void SA() {
		this.aByteArrayArray8860 = null;
		this.aByteArrayArray8858 = null;
	}

	@ObfuscatedName("Class_xa_Sub3.y(IILClass_na;)LClass_na;")
	public Class_na y(int arg0, int arg1, Class_na arg2) {
		return null;
	}

	public void method6448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, Class6 arg8, Class38 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.aBoolean111;
		this.aClass_ra_Sub3_8848.RA(false);
		arg9.aBoolean384 = false;
		arg9.aBoolean383 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					int var21;
					int var22;
					int var23;
					int var24;
					float var25;
					float var26;
					float var27;
					float var28;
					float var29;
					float var30;
					int var31;
					if (this.aClass4ArrayArray8832 == null) {
						if (this.aClass42ArrayArray8843[var18][var19] != null) {
							Class42 var20 = this.aClass42ArrayArray8843[var18][var19];
							for (var21 = 0; var21 < var20.aShort433; var21++) {
								arg10[var21] = var16 + var20.aShortArray432[var21] * var14 / this.anInt6395;
								arg11[var21] = var17 - var20.aShortArray434[var21] * var14 / this.anInt6395;
							}
							for (var21 = 0; var21 < var20.aShort430; var21++) {
								var22 = var21 * 3;
								var23 = var22 + 1;
								var24 = var23 + 1;
								var25 = arg10[var22];
								var26 = arg10[var23];
								var27 = arg10[var24];
								var28 = arg11[var22];
								var29 = arg11[var23];
								var30 = arg11[var24];
								if (var20.anIntArray435 == null || var20.anIntArray435[var21] == 0) {
									arg9.method538(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var20.anIntArray438[var22], var20.anIntArray438[var23], var20.anIntArray438[var24]);
								} else {
									var31 = var20.anIntArray435[var21];
									arg9.method538(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var31, var31, var31);
								}
							}
						}
					} else if (this.aClass4ArrayArray8832[var18][var19] != null) {
						Class4 var33 = this.aClass4ArrayArray8832[var18][var19];
						if (var33.aShort67 != -1 && (var33.aByte65 & 0x2) == 0 && var33.anInt66 == 0) {
							var21 = this.aClass_ra_Sub3_8848.method5192(var33.aShort67);
							arg9.method544(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt60, -1102852190), (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt58, -1383035213), (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt64, -437984137));
							arg9.method544(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt59, -2069241891), (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt64, -1210876116), (float) Class330_Sub26_Sub1.method3395(var21, var33.anInt58, -1801226598));
						} else if (var33.anInt66 == 0) {
							arg9.method538(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, var33.anInt60, var33.anInt58, var33.anInt64);
							arg9.method538(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, var33.anInt59, var33.anInt64, var33.anInt58);
						} else {
							var21 = var33.anInt66;
							arg9.method538(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var16 + var14), (float) var16, (float) (var16 + var14), 100.0F, 100.0F, 100.0F, Class355.method4125(var21, var33.anInt60 & 0xFF000000, -680411139), Class355.method4125(var21, var33.anInt58 & 0xFF000000, -680411139), Class355.method4125(var21, var33.anInt64 & 0xFF000000, -680411139));
							arg9.method538(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var16 + var14), (float) var16, 100.0F, 100.0F, 100.0F, Class355.method4125(var21, var33.anInt59 & 0xFF000000, -680411139), Class355.method4125(var21, var33.anInt64 & 0xFF000000, -680411139), Class355.method4125(var21, var33.anInt58 & 0xFF000000, -680411139));
						}
					} else if (this.aClass14ArrayArray8842[var18][var19] != null) {
						Class14 var32 = this.aClass14ArrayArray8842[var18][var19];
						for (var21 = 0; var21 < var32.aShort177; var21++) {
							arg10[var21] = var16 + var32.aShortArray179[var21] * var14 / this.anInt6395;
							arg11[var21] = var17 - var32.aShortArray181[var21] * var14 / this.anInt6395;
						}
						for (var21 = 0; var21 < var32.aShort185; var21++) {
							var22 = var21 * 3;
							var23 = var22 + 1;
							var24 = var23 + 1;
							var25 = arg10[var22];
							var26 = arg10[var23];
							var27 = arg10[var24];
							var28 = arg11[var22];
							var29 = arg11[var23];
							var30 = arg11[var24];
							if (var32.anIntArray186 != null && var32.anIntArray186[var21] != 0 && (var32.aShortArray176 == null || var32.aShortArray176 != null && var32.aShortArray176[var21] == -1)) {
								var31 = var32.anIntArray186[var21];
								arg9.method538(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, Class355.method4125(var31, -16777216 - (var32.anIntArray183[var22] & -16777216), -680411139), Class355.method4125(var31, -16777216 - (var32.anIntArray183[var23] & -16777216), -680411139), Class355.method4125(var31, -16777216 - (var32.anIntArray183[var24] & -16777216), -680411139));
							} else if (var32.aShortArray176 == null || var32.aShortArray176[var21] == -1) {
								arg9.method538(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var32.anIntArray183[var22], var32.anIntArray183[var23], var32.anIntArray183[var24]);
							} else {
								var31 = this.aClass_ra_Sub3_8848.method5192(var32.aShortArray176[var21]);
								arg9.method544(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float) var31, (float) var31, (float) var31);
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.aBoolean384 = true;
		this.aClass_ra_Sub3_8848.RA(var15);
	}

	public Class_xa_Sub3(Class_ra_Sub3 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass_ra_Sub3_8848 = arg0;
		this.anInt8838 = arg2;
		this.aByteArrayArray8860 = new byte[arg3 + 1][arg4 + 1];
		int var9 = this.aClass_ra_Sub3_8848.anInt8645 >> 9;
		for (int var10 = 1; var10 < arg4; var10++) {
			for (int var11 = 1; var11 < arg3; var11++) {
				int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
				int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
				int var15 = (int) Math.sqrt((double) (var13 * var13 + arg7 * 512 + var14 * var14));
				int var16 = (var13 << 8) / var15;
				int var17 = arg7 * -512 / var15;
				int var18 = (var14 << 8) / var15;
				int var12 = var9 + (this.aClass_ra_Sub3_8848.anInt8625 * var16 + this.aClass_ra_Sub3_8848.anInt8626 * var17 + this.aClass_ra_Sub3_8848.anInt8627 * var18 >> 17);
				var12 >>= 0x1;
				if (var12 < 2) {
					var12 = 2;
				} else if (var12 > 126) {
					var12 = 126;
				}
				this.aByteArrayArray8860[var11][var10] = (byte) var12;
			}
		}
		this.aByteArrayArray8858 = new byte[arg3 + 1][arg4 + 1];
	}

	public void method6449(int arg0, int arg1, boolean arg2, Class6 arg3, Class38 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		Class4 var12 = this.aClass4ArrayArray8832[arg0][arg1];
		int var14;
		int var15;
		int var16;
		float var18;
		float var19;
		float var20;
		float var21;
		float var22;
		float var23;
		float var24;
		if (var12 == null) {
			Class14 var54 = this.aClass14ArrayArray8842[arg0][arg1];
			if (var54 != null) {
				if (arg10 != 0) {
					if ((var54.aByte178 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				int var55;
				for (var14 = 0; var14 < var54.aShort177; var14++) {
					var15 = var54.aShortArray179[var14] + (arg0 << this.anInt6396);
					var16 = var54.aShortArray180[var14];
					var55 = var54.aShortArray181[var14] + (arg1 << this.anInt6396);
					var18 = this.aFloat8857 + this.aFloat8836 * (float) var15 + this.aFloat8850 * (float) var16 + this.aFloat8854 * (float) var55;
					var19 = this.aFloat8859 + this.aFloat8846 * (float) var15 + this.aFloat8864 * (float) var16 + this.aFloat8855 * (float) var55;
					if (var18 < -var19) {
						return;
					}
					var20 = arg4.aFloat394 + arg4.aFloat395 * var18 / var19;
					arg9[var14] = 0.0F;
					if (arg2) {
						var21 = var18 - arg3.aFloat87;
						if (var21 > 0.0F) {
							var21 /= arg3.aFloat104;
							if (var21 > 1.0F) {
								var21 = 1.0F;
							}
							arg9[var14] = var21;
							int var56 = (int) ((float) var54.aShortArray182[var14] * var21);
							if (var56 > 0) {
								var16 -= var56;
							}
						}
					} else if (arg3.aBoolean86) {
						var21 = var18 - arg3.aFloat87;
						if (var21 > 0.0F) {
							arg9[var14] = var21 / arg3.aFloat104;
							if (arg9[var14] > 1.0F) {
								arg9[var14] = 1.0F;
							}
						}
					}
					var21 = this.aFloat8863 + this.aFloat8844 * (float) var15 + this.aFloat8861 * (float) var16 + this.aFloat8852 * (float) var55;
					var22 = this.aFloat8847 + this.aFloat8845 * (float) var15 + this.aFloat8849 * (float) var16 + this.aFloat8853 * (float) var55;
					arg5[var14] = arg4.aFloat411 + arg4.aFloat391 * var21 / var19;
					arg6[var14] = arg4.aFloat392 + arg4.aFloat420 * var22 / var19;
					arg7[var14] = var20;
					arg8[var14] = var19;
				}
				if (var54.aShortArray176 == null) {
					for (var14 = 0; var14 < var54.aShort185; var14++) {
						var15 = var14 * 3;
						var16 = var15 + 1;
						var55 = var16 + 1;
						var18 = arg5[var15];
						var19 = arg5[var16];
						var20 = arg5[var55];
						var21 = arg6[var15];
						var22 = arg6[var16];
						var23 = arg6[var55];
						var24 = arg9[var15] + arg9[var16] + arg9[var55];
						if ((var18 - var19) * (var23 - var22) - (var21 - var22) * (var20 - var19) > 0.0F) {
							arg4.aBoolean387 = var18 < 0.0F || var19 < 0.0F || var20 < 0.0F || var18 > (float) arg4.anInt396 || var19 > (float) arg4.anInt396 || var20 > (float) arg4.anInt396;
							if (var24 >= 3.0F) {
								arg4.method539(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], arg3.anInt88);
							} else if (var24 > 0.0F) {
								if ((var54.anIntArray183[var15] & 0xFFFFFF) != 0) {
									arg4.method538(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], Class442.method5612(var54.anIntArray183[var15], arg3.anInt88, arg9[var15] * 255.0F, -1027106511), Class442.method5612(var54.anIntArray183[var16], arg3.anInt88, arg9[var16] * 255.0F, -1027106511), Class442.method5612(var54.anIntArray183[var55], arg3.anInt88, arg9[var55] * 255.0F, -1027106511));
								}
							} else if ((var54.anIntArray183[var15] & 0xFFFFFF) != 0) {
								arg4.method538(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], var54.anIntArray183[var15], var54.anIntArray183[var16], var54.anIntArray183[var55]);
							}
						}
					}
				} else {
					for (var14 = 0; var14 < var54.aShort185; var14++) {
						var15 = var14 * 3;
						var16 = var15 + 1;
						var55 = var16 + 1;
						var18 = arg5[var15];
						var19 = arg5[var16];
						var20 = arg5[var55];
						var21 = arg6[var15];
						var22 = arg6[var16];
						var23 = arg6[var55];
						var24 = arg9[var15] + arg9[var16] + arg9[var55];
						if ((var18 - var19) * (var23 - var22) - (var21 - var22) * (var20 - var19) > 0.0F) {
							arg4.aBoolean387 = var18 < 0.0F || var19 < 0.0F || var20 < 0.0F || var18 > (float) arg4.anInt396 || var19 > (float) arg4.anInt396 || var20 > (float) arg4.anInt396;
							short var57 = var54.aShortArray176[var14];
							if (var24 < 3.0F) {
								int var58;
								if (var24 > 0.0F) {
									if (var57 != -1) {
										var58 = -16777216;
										if (var57 != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var57, 104908176).aByte525)) {
											var58 = -1694498816;
										}
										arg4.method541(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], arg8[var15], arg8[var16], arg8[var55], (float) var54.aShortArray179[var15] / (float) this.anInt6395, (float) var54.aShortArray179[var16] / (float) this.anInt6395, (float) var54.aShortArray179[var55] / (float) this.anInt6395, (float) var54.aShortArray181[var15] / (float) this.anInt6395, (float) var54.aShortArray181[var16] / (float) this.anInt6395, (float) var54.aShortArray181[var55] / (float) this.anInt6395, var58 | var54.anIntArray183[var15] & 0xFFFFFF, var58 | var54.anIntArray183[var16] & 0xFFFFFF, var58 | var54.anIntArray183[var55] & 0xFFFFFF, arg3.anInt88, arg9[var15] * 255.0F, arg9[var16] * 255.0F, arg9[var55] * 255.0F, var57);
									} else if ((var54.anIntArray183[var15] & 0xFFFFFF) != 0) {
										if (var57 != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var57, 567185265).aByte525)) {
											arg4.anInt402 = -1694498816;
										}
										arg4.method538(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], Class355.method4125(var54.anIntArray183[var15], (int) (arg9[var15] * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var54.anIntArray183[var16], (int) (arg9[var16] * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var54.anIntArray183[var55], (int) (arg9[var55] * 255.0F) << 24 | arg3.anInt88, -680411139));
										arg4.anInt402 = 0;
									}
								} else if (var57 != -1) {
									var58 = -16777216;
									if (var57 != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var57, -1780427458).aByte525)) {
										var58 = -1694498816;
									}
									arg4.method541(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], arg8[var15], arg8[var16], arg8[var55], (float) var54.aShortArray179[var15] / (float) this.anInt6395, (float) var54.aShortArray179[var16] / (float) this.anInt6395, (float) var54.aShortArray179[var55] / (float) this.anInt6395, (float) var54.aShortArray181[var15] / (float) this.anInt6395, (float) var54.aShortArray181[var16] / (float) this.anInt6395, (float) var54.aShortArray181[var55] / (float) this.anInt6395, var58 | var54.anIntArray183[var15] & 0xFFFFFF, var58 | var54.anIntArray183[var16] & 0xFFFFFF, var58 | var54.anIntArray183[var55] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var57);
								} else if ((var54.anIntArray183[var15] & 0xFFFFFF) != 0) {
									if (var57 != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var57, 1024870057).aByte525)) {
										arg4.anInt402 = -1694498816;
									}
									arg4.method538(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], var54.anIntArray183[var15], var54.anIntArray183[var16], var54.anIntArray183[var55]);
									arg4.anInt402 = 0;
								}
							} else {
								arg4.method539(true, true, false, var21, var22, var23, var18, var19, var20, arg7[var15], arg7[var16], arg7[var55], arg3.anInt88);
							}
						}
					}
				}
			}
		} else if ((var12.aByte65 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((var12.aByte65 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			int var13 = arg0 * this.anInt6395;
			var14 = var13 + this.anInt6395;
			var15 = arg1 * this.anInt6395;
			var16 = var15 + this.anInt6395;
			float var17 = 0.0F;
			var18 = 0.0F;
			var19 = 0.0F;
			var20 = 0.0F;
			float var25;
			float var26;
			float var27;
			float var28;
			float var29;
			float var30;
			float var31;
			float var32;
			float var33;
			float var34;
			float var35;
			float var36;
			int var37;
			int var39;
			float var41;
			float var42;
			float var43;
			float var44;
			float var45;
			float var47;
			float var48;
			float var49;
			float var50;
			float var51;
			float var52;
			float var60;
			float var63;
			if ((var12.aByte65 & 0x1) == 0 || arg2) {
				var37 = this.anIntArrayArray6394[arg0][arg1];
				int var38 = this.anIntArrayArray6394[arg0 + 1][arg1];
				var39 = this.anIntArrayArray6394[arg0 + 1][arg1 + 1];
				int var40 = this.anIntArrayArray6394[arg0][arg1 + 1];
				var41 = this.aFloat8857 + this.aFloat8836 * (float) var13 + this.aFloat8850 * (float) var37 + this.aFloat8854 * (float) var15;
				var21 = this.aFloat8859 + this.aFloat8846 * (float) var13 + this.aFloat8864 * (float) var37 + this.aFloat8855 * (float) var15;
				if (var41 < -var21) {
					return;
				}
				var42 = this.aFloat8857 + this.aFloat8836 * (float) var14 + this.aFloat8850 * (float) var38 + this.aFloat8854 * (float) var15;
				var22 = this.aFloat8859 + this.aFloat8846 * (float) var14 + this.aFloat8864 * (float) var38 + this.aFloat8855 * (float) var15;
				if (var42 < -var22) {
					return;
				}
				var43 = this.aFloat8857 + this.aFloat8836 * (float) var14 + this.aFloat8850 * (float) var39 + this.aFloat8854 * (float) var16;
				var23 = this.aFloat8859 + this.aFloat8846 * (float) var14 + this.aFloat8864 * (float) var39 + this.aFloat8855 * (float) var16;
				if (var43 < -var23) {
					return;
				}
				var44 = this.aFloat8857 + this.aFloat8836 * (float) var13 + this.aFloat8850 * (float) var40 + this.aFloat8854 * (float) var16;
				var24 = this.aFloat8859 + this.aFloat8846 * (float) var13 + this.aFloat8864 * (float) var40 + this.aFloat8855 * (float) var16;
				if (var44 < -var24) {
					return;
				}
				var25 = arg4.aFloat394 + arg4.aFloat395 * var41 / var21;
				var26 = arg4.aFloat394 + arg4.aFloat395 * var42 / var22;
				var27 = arg4.aFloat394 + arg4.aFloat395 * var43 / var23;
				var28 = arg4.aFloat394 + arg4.aFloat395 * var44 / var24;
				if (arg2) {
					var45 = var41 - arg3.aFloat87;
					int var46;
					if (var45 > 0.0F) {
						var45 /= arg3.aFloat104;
						if (var45 > 1.0F) {
							var45 = 1.0F;
						}
						var17 = var45;
						var46 = (int) ((float) var12.aShort62 * var45);
						if (var46 > 0) {
							var37 -= var46;
						}
					}
					var45 = var42 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var45 /= arg3.aFloat104;
						if (var45 > 1.0F) {
							var45 = 1.0F;
						}
						var18 = var45;
						var46 = (int) ((float) var12.aShort61 * var45);
						if (var46 > 0) {
							var38 -= var46;
						}
					}
					var45 = var43 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var45 /= arg3.aFloat104;
						if (var45 > 1.0F) {
							var45 = 1.0F;
						}
						var19 = var45;
						var46 = (int) ((float) var12.aShort57 * var45);
						if (var46 > 0) {
							var39 -= var46;
						}
					}
					var45 = var44 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var45 /= arg3.aFloat104;
						if (var45 > 1.0F) {
							var45 = 1.0F;
						}
						var20 = var45;
						var46 = (int) ((float) var12.aShort63 * var45);
						if (var46 > 0) {
							var40 -= var46;
						}
					}
				} else if (arg3.aBoolean86) {
					var45 = var41 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var17 = var45 / arg3.aFloat104;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					var45 = var42 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var18 = var45 / arg3.aFloat104;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					var45 = var43 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var19 = var45 / arg3.aFloat104;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					var45 = var44 - arg3.aFloat87;
					if (var45 > 0.0F) {
						var20 = var45 / arg3.aFloat104;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				var45 = this.aFloat8863 + this.aFloat8844 * (float) var13 + this.aFloat8861 * (float) var37 + this.aFloat8852 * (float) var15;
				var29 = arg4.aFloat411 + arg4.aFloat391 * var45 / var21;
				var63 = this.aFloat8847 + this.aFloat8845 * (float) var13 + this.aFloat8849 * (float) var37 + this.aFloat8853 * (float) var15;
				var30 = arg4.aFloat392 + arg4.aFloat420 * var63 / var21;
				var47 = this.aFloat8863 + this.aFloat8844 * (float) var14 + this.aFloat8861 * (float) var38 + this.aFloat8852 * (float) var15;
				var31 = arg4.aFloat411 + arg4.aFloat391 * var47 / var22;
				var48 = this.aFloat8847 + this.aFloat8845 * (float) var14 + this.aFloat8849 * (float) var38 + this.aFloat8853 * (float) var15;
				var32 = arg4.aFloat392 + arg4.aFloat420 * var48 / var22;
				var49 = this.aFloat8863 + this.aFloat8844 * (float) var14 + this.aFloat8861 * (float) var39 + this.aFloat8852 * (float) var16;
				var33 = arg4.aFloat411 + arg4.aFloat391 * var49 / var23;
				var50 = this.aFloat8847 + this.aFloat8845 * (float) var14 + this.aFloat8849 * (float) var39 + this.aFloat8853 * (float) var16;
				var34 = arg4.aFloat392 + arg4.aFloat420 * var50 / var23;
				var51 = this.aFloat8863 + this.aFloat8844 * (float) var13 + this.aFloat8861 * (float) var40 + this.aFloat8852 * (float) var16;
				var35 = arg4.aFloat411 + arg4.aFloat391 * var51 / var24;
				var52 = this.aFloat8847 + this.aFloat8845 * (float) var13 + this.aFloat8849 * (float) var40 + this.aFloat8853 * (float) var16;
				var36 = arg4.aFloat392 + arg4.aFloat420 * var52 / var24;
			} else {
				var37 = this.anIntArrayArray6394[arg0][arg1];
				var60 = this.aFloat8850 * (float) var37;
				float var61 = this.aFloat8864 * (float) var37;
				float var62 = this.aFloat8857 + this.aFloat8836 * (float) var13 + var60 + this.aFloat8854 * (float) var15;
				var21 = this.aFloat8859 + this.aFloat8846 * (float) var13 + var61 + this.aFloat8855 * (float) var15;
				if (var62 < -var21) {
					return;
				}
				var41 = this.aFloat8857 + this.aFloat8836 * (float) var14 + var60 + this.aFloat8854 * (float) var15;
				var22 = this.aFloat8859 + this.aFloat8846 * (float) var14 + var61 + this.aFloat8855 * (float) var15;
				if (var41 < -var22) {
					return;
				}
				var42 = this.aFloat8857 + this.aFloat8836 * (float) var14 + var60 + this.aFloat8854 * (float) var16;
				var23 = this.aFloat8859 + this.aFloat8846 * (float) var14 + var61 + this.aFloat8855 * (float) var16;
				if (var42 < -var23) {
					return;
				}
				var43 = this.aFloat8857 + this.aFloat8836 * (float) var13 + var60 + this.aFloat8854 * (float) var16;
				var24 = this.aFloat8859 + this.aFloat8846 * (float) var13 + var61 + this.aFloat8855 * (float) var16;
				if (var43 < -var24) {
					return;
				}
				var25 = arg4.aFloat394 + arg4.aFloat395 * var62 / var21;
				var26 = arg4.aFloat394 + arg4.aFloat395 * var41 / var22;
				var27 = arg4.aFloat394 + arg4.aFloat395 * var42 / var23;
				var28 = arg4.aFloat394 + arg4.aFloat395 * var43 / var24;
				if (arg3.aBoolean86) {
					var44 = var62 - arg3.aFloat87;
					if (var44 > 0.0F) {
						var17 = var44 / arg3.aFloat104;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					var44 = var41 - arg3.aFloat87;
					if (var44 > 0.0F) {
						var18 = var44 / arg3.aFloat104;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					var44 = var42 - arg3.aFloat87;
					if (var44 > 0.0F) {
						var19 = var44 / arg3.aFloat104;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					var44 = var43 - arg3.aFloat87;
					if (var44 > 0.0F) {
						var20 = var44 / arg3.aFloat104;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				var44 = this.aFloat8861 * (float) var37;
				var45 = this.aFloat8849 * (float) var37;
				var63 = this.aFloat8863 + this.aFloat8844 * (float) var13 + var44 + this.aFloat8852 * (float) var15;
				var29 = arg4.aFloat411 + arg4.aFloat391 * var63 / var21;
				var47 = this.aFloat8847 + this.aFloat8845 * (float) var13 + var45 + this.aFloat8853 * (float) var15;
				var30 = arg4.aFloat392 + arg4.aFloat420 * var47 / var21;
				var48 = this.aFloat8863 + this.aFloat8844 * (float) var14 + var44 + this.aFloat8852 * (float) var15;
				var31 = arg4.aFloat411 + arg4.aFloat391 * var48 / var22;
				var49 = this.aFloat8847 + this.aFloat8845 * (float) var14 + var45 + this.aFloat8853 * (float) var15;
				var32 = arg4.aFloat392 + arg4.aFloat420 * var49 / var22;
				var50 = this.aFloat8863 + this.aFloat8844 * (float) var14 + var44 + this.aFloat8852 * (float) var16;
				var33 = arg4.aFloat411 + arg4.aFloat391 * var50 / var23;
				var51 = this.aFloat8847 + this.aFloat8845 * (float) var14 + var45 + this.aFloat8853 * (float) var16;
				var34 = arg4.aFloat392 + arg4.aFloat420 * var51 / var23;
				var52 = this.aFloat8863 + this.aFloat8844 * (float) var13 + var44 + this.aFloat8852 * (float) var16;
				var35 = arg4.aFloat411 + arg4.aFloat391 * var52 / var24;
				float var53 = this.aFloat8847 + this.aFloat8845 * (float) var13 + var45 + this.aFloat8853 * (float) var16;
				var36 = arg4.aFloat392 + arg4.aFloat420 * var53 / var24;
			}
			boolean var59 = var12.aShort67 != -1 && this.method6447(this.aClass_ra_Sub3_8848.anInterface_ma4227.method221(var12.aShort67, 898771112).aByte525);
			var60 = var18 + var19 + var20;
			if ((var33 - var35) * (var32 - var36) - (var34 - var36) * (var31 - var35) > 0.0F) {
				arg4.aBoolean387 = var33 < 0.0F || var35 < 0.0F || var31 < 0.0F || var33 > (float) arg4.anInt396 || var35 > (float) arg4.anInt396 || var31 > (float) arg4.anInt396;
				if (var60 >= 3.0F) {
					arg4.method539(true, true, false, var34, var36, var32, var33, var35, var31, var27, var28, var26, arg3.anInt88);
				} else if (var60 > 0.0F) {
					if (var12.aShort67 >= 0) {
						var39 = -16777216;
						if (var59) {
							var39 = -1694498816;
						}
						arg4.method541(true, true, false, var34, var36, var32, var33, var35, var31, var27, var28, var26, var23, var24, var22, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var39 | var12.anInt60 & 0xFFFFFF, var39 | var12.anInt58 & 0xFFFFFF, var39 | var12.anInt64 & 0xFFFFFF, arg3.anInt88, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.aShort67);
					} else {
						if (var59) {
							arg4.anInt402 = 100;
						}
						arg4.method538(true, true, false, var34, var36, var32, var33, var35, var31, var27, var28, var26, Class355.method4125(var12.anInt60, (int) (var19 * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var12.anInt58, (int) (var20 * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var12.anInt64, (int) (var18 * 255.0F) << 24 | arg3.anInt88, -680411139));
						arg4.anInt402 = 0;
					}
				} else if (var12.aShort67 >= 0) {
					var39 = -16777216;
					if (var59) {
						var39 = -1694498816;
					}
					arg4.method541(true, true, false, var34, var36, var32, var33, var35, var31, var27, var28, var26, var23, var24, var22, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var39 | var12.anInt60 & 0xFFFFFF, var39 | var12.anInt58 & 0xFFFFFF, var39 | var12.anInt64 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.aShort67);
				} else {
					if (var59) {
						arg4.anInt402 = 100;
					}
					arg4.method538(true, true, false, var34, var36, var32, var33, var35, var31, var27, var28, var26, var12.anInt60, var12.anInt58, var12.anInt64);
					arg4.anInt402 = 0;
				}
			}
			var60 = var17 + var18 + var20;
			if ((var29 - var31) * (var36 - var32) - (var30 - var32) * (var35 - var31) > 0.0F) {
				arg4.aBoolean387 = var29 < 0.0F || var31 < 0.0F || var35 < 0.0F || var29 > (float) arg4.anInt396 || var31 > (float) arg4.anInt396 || var35 > (float) arg4.anInt396;
				if (var60 < 3.0F) {
					if (var59) {
						arg4.anInt402 = -1694498816;
					}
					if (var60 > 0.0F) {
						if (var12.aShort67 >= 0) {
							var39 = -16777216;
							if (var59) {
								var39 = -1694498816;
							}
							arg4.method541(true, true, false, var30, var32, var36, var29, var31, var35, var25, var26, var28, var21, var22, var24, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var39 | var12.anInt59 & 0xFFFFFF, var39 | var12.anInt64 & 0xFFFFFF, var39 | var12.anInt58 & 0xFFFFFF, arg3.anInt88, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.aShort67);
						} else {
							if (var59) {
								arg4.anInt402 = 100;
							}
							arg4.method538(true, true, false, var30, var32, var36, var29, var31, var35, var25, var26, var28, Class355.method4125(var12.anInt59, (int) (var17 * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var12.anInt64, (int) (var18 * 255.0F) << 24 | arg3.anInt88, -680411139), Class355.method4125(var12.anInt58, (int) (var20 * 255.0F) << 24 | arg3.anInt88, -680411139));
							arg4.anInt402 = 0;
						}
					} else if (var12.aShort67 >= 0) {
						var39 = -16777216;
						if (var59) {
							var39 = -1694498816;
						}
						arg4.method541(true, true, false, var30, var32, var36, var29, var31, var35, var25, var26, var28, var21, var22, var24, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var39 | var12.anInt59 & 0xFFFFFF, var39 | var12.anInt64 & 0xFFFFFF, var39 | var12.anInt58 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.aShort67);
					} else {
						if (var59) {
							arg4.anInt402 = 100;
						}
						arg4.method538(true, true, false, var30, var32, var36, var29, var31, var35, var25, var26, var28, var12.anInt59, var12.anInt64, var12.anInt58);
						arg4.anInt402 = 0;
					}
				} else {
					arg4.method539(true, true, false, var30, var32, var36, var29, var31, var35, var25, var26, var28, arg3.anInt88);
				}
			}
		}
	}

	public void method6426(Class330_Sub14 arg0, int[] arg1) {
	}

	public void method6427(Class330_Sub14 arg0, int[] arg1) {
	}

	public void method6412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		Class6 var9 = this.aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 var10 = var9.aClass38_94;
		var10.anInt402 = 0;
		var10.aBoolean387 = true;
		this.aClass_ra_Sub3_8848.method5197();
		if (this.aClass4ArrayArray8832 != null || this.aClass42ArrayArray8843 != null) {
			this.method6448(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		} else if (this.aClass31ArrayArray8839 != null) {
			this.method6446(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.aFloatArray84, var9.aFloatArray122);
		}
	}

	public void method6421(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.aClass_ra_Sub3_8848.anIntArray8630 == null || this.aClass_ra_Sub3_8848.aFloatArray8620 == null) {
			throw new IllegalStateException("");
		}
		Class249 var7 = this.aClass_ra_Sub3_8848.aClass249_8634;
		this.aFloat8844 = var7.aFloatArray2631[0];
		this.aFloat8845 = var7.aFloatArray2631[1];
		this.aFloat8836 = var7.aFloatArray2631[2];
		this.aFloat8846 = var7.aFloatArray2631[3];
		this.aFloat8861 = var7.aFloatArray2631[4];
		this.aFloat8849 = var7.aFloatArray2631[5];
		this.aFloat8850 = var7.aFloatArray2631[6];
		this.aFloat8864 = var7.aFloatArray2631[7];
		this.aFloat8852 = var7.aFloatArray2631[8];
		this.aFloat8853 = var7.aFloatArray2631[9];
		this.aFloat8854 = var7.aFloatArray2631[10];
		this.aFloat8855 = var7.aFloatArray2631[11];
		this.aFloat8863 = var7.aFloatArray2631[12];
		this.aFloat8847 = var7.aFloatArray2631[13];
		this.aFloat8857 = var7.aFloatArray2631[14];
		this.aFloat8859 = var7.aFloatArray2631[15];
		for (int var8 = 0; var8 < arg2 + arg2; var8++) {
			for (int var9 = 0; var9 < arg2 + arg2; var9++) {
				if (arg3[var8][var9]) {
					int var10 = arg0 - arg2 + var8;
					int var11 = arg1 - arg2 + var9;
					if (var10 >= 0 && var10 < this.anInt6397 * -1250378663 * 1972554729 && var11 >= 0 && var11 < this.anInt6393 * -1805935063 * 24567321) {
						this.method6443(var10, var11, arg5);
					}
				}
			}
		}
	}

	@ObfuscatedName("Class_xa_Sub3.as(LClass_na;IIIIZ)V")
	public void as(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("Class_xa_Sub3.aj(LClass_na;IIIIZ)V")
	public void aj(Class_na arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}
}
