package deob;

public abstract class Class387 {

	public boolean aBoolean3990 = false;

	public static float aFloat3991 = 3.1415927F;

	public void method4441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, float[] arg9) {
		int var18 = arg0 - arg3;
		int var19 = arg1 - arg4;
		int var20 = arg2 - arg5;
		float var11 = (float) var18 * arg6[0] + (float) var19 * arg6[1] + (float) var20 * arg6[2];
		float var12 = (float) var18 * arg6[3] + (float) var19 * arg6[4] + (float) var20 * arg6[5];
		float var13 = (float) var18 * arg6[6] + (float) var19 * arg6[7] + (float) var20 * arg6[8];
		float var14 = (float) Math.sqrt((double) (var11 * var11 + var12 * var12 + var13 * var13));
		float var15 = (float) Math.atan2((double) var11, (double) var13) / 6.2831855F + 0.5F;
		float var16 = (float) Math.asin((double) (var12 / var14)) / 3.1415927F + 0.5F + arg8;
		float var17;
		if (arg7 == 1) {
			var17 = var15;
			var15 = -var16;
			var16 = var17;
		} else if (arg7 == 2) {
			var15 = -var15;
			var16 = -var16;
		} else if (arg7 == 3) {
			var17 = var15;
			var15 = var16;
			var16 = -var17;
		}
		arg9[0] = var15;
		arg9[1] = var16;
	}

	public int method4442(float arg0, float arg1, float arg2) {
		float var4 = arg0 < 0.0F ? -arg0 : arg0;
		float var5 = arg1 < 0.0F ? -arg1 : arg1;
		float var6 = arg2 < 0.0F ? -arg2 : arg2;
		if (var5 > var4 && var5 > var6) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (var6 > var4 && var6 > var5) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	public void method4443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11, float[] arg12) {
		int var20 = arg0 - arg3;
		int var21 = arg1 - arg4;
		int var22 = arg2 - arg5;
		float var14 = (float) var20 * arg7[0] + (float) var21 * arg7[1] + (float) var22 * arg7[2];
		float var15 = (float) var20 * arg7[3] + (float) var21 * arg7[4] + (float) var22 * arg7[5];
		float var16 = (float) var20 * arg7[6] + (float) var21 * arg7[7] + (float) var22 * arg7[8];
		float var17;
		float var18;
		if (arg6 == 0) {
			var17 = var14 + arg9 + 0.5F;
			var18 = -var16 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			var17 = var14 + arg9 + 0.5F;
			var18 = var16 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			var17 = -var14 + arg9 + 0.5F;
			var18 = -var15 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			var17 = var14 + arg9 + 0.5F;
			var18 = -var15 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			var17 = var16 + arg11 + 0.5F;
			var18 = -var15 + arg10 + 0.5F;
		} else {
			var17 = -var16 + arg11 + 0.5F;
			var18 = -var15 + arg10 + 0.5F;
		}
		float var19;
		if (arg8 == 1) {
			var19 = var17;
			var17 = -var18;
			var18 = var19;
		} else if (arg8 == 2) {
			var17 = -var17;
			var18 = -var18;
		} else if (arg8 == 3) {
			var19 = var17;
			var17 = var18;
			var18 = -var19;
		}
		arg12[0] = var17;
		arg12[1] = var18;
	}

	public Class97 method4444(Model arg0, int[] arg1, int arg2) {
		int[] var4 = null;
		int[] var5 = null;
		int[] var6 = null;
		float[][] var7 = null;
		if (arg0.aByteArray887 != null) {
			int var8 = arg0.anInt882;
			int[] var9 = new int[var8];
			int[] var10 = new int[var8];
			int[] var11 = new int[var8];
			int[] var12 = new int[var8];
			int[] var13 = new int[var8];
			int[] var14 = new int[var8];
			int var15;
			for (var15 = 0; var15 < var8; var15++) {
				var9[var15] = Integer.MAX_VALUE;
				var10[var15] = -2147483647;
				var11[var15] = Integer.MAX_VALUE;
				var12[var15] = -2147483647;
				var13[var15] = Integer.MAX_VALUE;
				var14[var15] = -2147483647;
			}
			int var20;
			for (var15 = 0; var15 < arg2; var15++) {
				int var16 = arg1[var15];
				if (arg0.aByteArray887[var16] != -1) {
					int var17 = arg0.aByteArray887[var16] & 0xFF;
					for (int var18 = 0; var18 < 3; var18++) {
						short var19;
						if (var18 == 0) {
							var19 = arg0.aShortArray888[var16];
						} else if (var18 == 1) {
							var19 = arg0.aShortArray907[var16];
						} else {
							var19 = arg0.aShortArray883[var16];
						}
						var20 = arg0.anIntArray875[var19];
						int var21 = arg0.anIntArray889[var19];
						int var22 = arg0.anIntArray877[var19];
						if (var20 < var9[var17]) {
							var9[var17] = var20;
						}
						if (var20 > var10[var17]) {
							var10[var17] = var20;
						}
						if (var21 < var11[var17]) {
							var11[var17] = var21;
						}
						if (var21 > var12[var17]) {
							var12[var17] = var21;
						}
						if (var22 < var13[var17]) {
							var13[var17] = var22;
						}
						if (var22 > var14[var17]) {
							var14[var17] = var22;
						}
					}
				}
			}
			var4 = new int[var8];
			var5 = new int[var8];
			var6 = new int[var8];
			var7 = new float[var8][];
			for (var15 = 0; var15 < var8; var15++) {
				byte var23 = arg0.aByteArray894[var15];
				if (var23 > 0) {
					var4[var15] = (var9[var15] + var10[var15]) / 2;
					var5[var15] = (var11[var15] + var12[var15]) / 2;
					var6[var15] = (var13[var15] + var14[var15]) / 2;
					float var24;
					float var25;
					float var26;
					if (var23 == 1) {
						var20 = arg0.anIntArray898[var15];
						if (var20 == 0) {
							var24 = 1.0F;
							var26 = 1.0F;
						} else if (var20 > 0) {
							var24 = 1.0F;
							var26 = (float) var20 / 1024.0F;
						} else {
							var26 = 1.0F;
							var24 = (float) -var20 / 1024.0F;
						}
						var25 = 64.0F / (float) arg0.anIntArray899[var15];
					} else if (var23 == 2) {
						var24 = 64.0F / (float) arg0.anIntArray898[var15];
						var25 = 64.0F / (float) arg0.anIntArray899[var15];
						var26 = 64.0F / (float) arg0.anIntArray900[var15];
					} else {
						var24 = (float) arg0.anIntArray898[var15] / 1024.0F;
						var25 = (float) arg0.anIntArray899[var15] / 1024.0F;
						var26 = (float) arg0.anIntArray900[var15] / 1024.0F;
					}
					var7[var15] = this.method4459(arg0.aShortArray895[var15], arg0.aShortArray903[var15], arg0.aShortArray886[var15], arg0.aByteArray906[var15] & 0xFF, var24, var25, var26);
				}
			}
		}
		return new Class97(this, var4, var5, var6, var7);
	}

	public void method4447(Class_xa arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		int var12 = -arg4 / 2;
		int var13 = -arg5 / 2;
		int var14 = arg0.method6416(arg1 + var12, arg3 + var13, 413516870);
		int var15 = arg4 / 2;
		int var16 = -arg5 / 2;
		int var17 = arg0.method6416(arg1 + var15, arg3 + var16, 983756267);
		int var18 = -arg4 / 2;
		int var19 = arg5 / 2;
		int var20 = arg0.method6416(arg1 + var18, arg3 + var19, 328284671);
		int var21 = arg4 / 2;
		int var22 = arg5 / 2;
		int var23 = arg0.method6416(arg1 + var21, arg3 + var22, -16503745);
		int var24 = var14 < var17 ? var14 : var17;
		int var25 = var20 < var23 ? var20 : var23;
		int var26 = var17 < var23 ? var17 : var23;
		int var27 = var14 < var20 ? var14 : var20;
		int var28;
		int var29;
		if (arg5 != 0) {
			var28 = (int) (Math.atan2((double) (var24 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (var28 != 0) {
				if (arg6 != 0) {
					if (var28 > 8192) {
						var29 = 16384 - arg6;
						if (var28 < var29) {
							var28 = var29;
						}
					} else if (var28 > arg6) {
						var28 = arg6;
					}
				}
				this.t(var28);
			}
		}
		if (arg4 != 0) {
			var28 = (int) (Math.atan2((double) (var27 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (var28 != 0) {
				if (arg7 != 0) {
					if (var28 > 8192) {
						var29 = 16384 - arg7;
						if (var28 < var29) {
							var28 = var29;
						}
					} else if (var28 > arg7) {
						var28 = arg7;
					}
				}
				this.EA(var28);
			}
		}
		var28 = var14 + var23;
		if (var17 + var20 < var28) {
			var28 = var17 + var20;
		}
		var28 = (var28 >> 1) - arg2;
		if (var28 != 0) {
			this.ia(0, var28, 0);
		}
	}

	public final void method4449(Class330_Sub36_Sub5 arg0, int arg1, Class330_Sub36_Sub5 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method4455();
		if (!this.ea()) {
			this.method4448();
			return;
		}
		Class84 var9 = arg0.aClass84Array9665[arg1];
		Class330_Sub18 var10 = var9.aClass330_Sub18_692;
		Class84 var11 = null;
		if (arg2 != null) {
			var11 = arg2.aClass84Array9665[arg3];
			if (var11.aClass330_Sub18_692 != var10) {
				var11 = null;
			}
		}
		this.method4453(var10, var9, var11, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.ka();
		this.method4448();
	}

	public final void method4450(Class330_Sub36_Sub5 arg0, int arg1, Class330_Sub36_Sub5 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method4455();
		if (!this.ea()) {
			this.method4448();
			return;
		}
		Class84 var11 = arg0.aClass84Array9665[arg1];
		Class330_Sub18 var12 = var11.aClass330_Sub18_692;
		Class84 var13 = null;
		if (arg2 != null) {
			var13 = arg2.aClass84Array9665[arg3];
			if (var13.aClass330_Sub18_692 != var12) {
				var13 = null;
			}
		}
		this.method4453(var12, var11, var13, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.ka();
		this.method4448();
	}

	public void method4453(Class330_Sub18 arg0, Class84 arg1, Class84 arg2, int arg3, int arg4, int arg5, boolean[] arg6, boolean arg7, boolean arg8, int arg9, int[] arg10) {
		int var12;
		if (arg2 == null || arg3 == 0) {
			for (var12 = 0; var12 < arg1.anInt686; var12++) {
				short var13 = arg1.aShortArray696[var12];
				if (arg6 == null || arg6[var13] == arg7 || arg0.anIntArray7642[var13] == 0) {
					short var14 = arg1.aShortArray693[var12];
					if (var14 != -1) {
						this.method4454(0, arg0.anIntArrayArray7643[var14], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray7641[var14], arg10);
					}
					this.method4454(arg0.anIntArray7642[var13], arg0.anIntArrayArray7643[var13], arg1.aShortArray691[var12], arg1.aShortArray694[var12], arg1.aShortArray695[var12], arg5, arg8, arg9 & arg0.anIntArray7641[var13], arg10);
				}
			}
			return;
		}
		var12 = 0;
		int var35 = 0;
		for (int var36 = 0; var36 < arg0.anInt7640; var36++) {
			boolean var15 = false;
			if (var12 < arg1.anInt686 && arg1.aShortArray696[var12] == var36) {
				var15 = true;
			}
			boolean var16 = false;
			if (var35 < arg2.anInt686 && arg2.aShortArray696[var35] == var36) {
				var16 = true;
			}
			if (var15 || var16) {
				if (arg6 == null || arg6[var36] == arg7 || arg0.anIntArray7642[var36] == 0) {
					short var17 = 0;
					int var18 = arg0.anIntArray7642[var36];
					if (var18 == 3 || var18 == 10) {
						var17 = 128;
					}
					short var19;
					short var20;
					short var21;
					short var22;
					byte var23;
					if (var15) {
						var19 = arg1.aShortArray691[var12];
						var20 = arg1.aShortArray694[var12];
						var21 = arg1.aShortArray695[var12];
						var22 = arg1.aShortArray693[var12];
						var23 = arg1.aByteArray697[var12];
						var12++;
					} else {
						var19 = var17;
						var20 = var17;
						var21 = var17;
						var22 = -1;
						var23 = 0;
					}
					short var24;
					short var25;
					short var26;
					short var27;
					byte var28;
					if (var16) {
						var24 = arg2.aShortArray691[var35];
						var25 = arg2.aShortArray694[var35];
						var26 = arg2.aShortArray695[var35];
						var27 = arg2.aShortArray693[var35];
						var28 = arg2.aByteArray697[var35];
						var35++;
					} else {
						var24 = var17;
						var25 = var17;
						var26 = var17;
						var27 = -1;
						var28 = 0;
					}
					int var29;
					int var30;
					int var31;
					if ((var23 & 0x2) == 0 && (var28 & 0x1) == 0) {
						int var32;
						if (var18 == 2) {
							var32 = var24 - var19 & 0x3FFF;
							int var33 = var25 - var20 & 0x3FFF;
							int var34 = var26 - var21 & 0x3FFF;
							if (var32 >= 8192) {
								var32 -= 16384;
							}
							if (var33 >= 8192) {
								var33 -= 16384;
							}
							if (var34 >= 8192) {
								var34 -= 16384;
							}
							var29 = var19 + var32 * arg3 / arg4 & 0x3FFF;
							var30 = var20 + var33 * arg3 / arg4 & 0x3FFF;
							var31 = var21 + var34 * arg3 / arg4 & 0x3FFF;
						} else if (var18 == 9) {
							var32 = var24 - var19 & 0x3FFF;
							if (var32 >= 8192) {
								var32 -= 16384;
							}
							var29 = var19 + var32 * arg3 / arg4 & 0x3FFF;
							var31 = 0;
							var30 = 0;
						} else if (var18 == 7) {
							var32 = var24 - var19 & 0x3F;
							if (var32 >= 32) {
								var32 -= 64;
							}
							var29 = var19 + var32 * arg3 / arg4 & 0x3F;
							var30 = var20 + (var25 - var20) * arg3 / arg4;
							var31 = var21 + (var26 - var21) * arg3 / arg4;
						} else {
							var29 = var19 + (var24 - var19) * arg3 / arg4;
							var30 = var20 + (var25 - var20) * arg3 / arg4;
							var31 = var21 + (var26 - var21) * arg3 / arg4;
						}
					} else {
						var29 = var19;
						var30 = var20;
						var31 = var21;
					}
					if (var22 != -1) {
						this.method4454(0, arg0.anIntArrayArray7643[var22], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray7641[var22], arg10);
					} else if (var27 != -1) {
						this.method4454(0, arg0.anIntArrayArray7643[var27], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray7641[var27], arg10);
					}
					this.method4454(var18, arg0.anIntArrayArray7643[var36], var29, var30, var31, arg5, arg8, arg9 & arg0.anIntArray7641[var36], arg10);
				} else {
					if (var15) {
						var12++;
					}
					if (var16) {
						var35++;
					}
				}
			}
		}
	}

	public void method4454(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8) {
		int var10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				var10 = -arg2;
				arg2 = arg4;
				arg4 = var10;
			} else if (arg0 == 3) {
				var10 = arg2;
				arg2 = arg4;
				arg4 = var10;
			} else if (arg0 == 2) {
				var10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = var10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				var10 = arg2;
				arg2 = -arg4;
				arg4 = var10;
			} else if (arg0 == 3) {
				var10 = arg2;
				arg2 = arg4;
				arg4 = var10;
			} else if (arg0 == 2) {
				var10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -var10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method4470(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.e(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	public final void method4456(Class330_Sub36_Sub5 arg0, int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method4455();
		if (!this.ea()) {
			this.method4448();
			return;
		}
		Class84 var3 = arg0.aClass84Array9665[arg1];
		Class330_Sub18 var4 = var3.aClass330_Sub18_692;
		for (int var5 = 0; var5 < var3.anInt686; var5++) {
			short var6 = var3.aShortArray696[var5];
			if (var4.aBooleanArray7644[var6]) {
				if (var3.aShortArray693[var5] != -1) {
					this.w(0, 0, 0, 0);
				}
				this.w(var4.anIntArray7642[var6], var3.aShortArray691[var5], var3.aShortArray694[var5], var3.aShortArray695[var5]);
			}
		}
		this.ka();
		this.method4448();
	}

	public final void method4457(Class330_Sub36_Sub5 arg0, int arg1, Class330_Sub36_Sub5 arg2, int arg3, int arg4, int arg5, Class330_Sub36_Sub5 arg6, int arg7, Class330_Sub36_Sub5 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method4449(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method4455();
		if (!this.ea()) {
			this.method4448();
			return;
		}
		Class84 var15 = arg0.aClass84Array9665[arg1];
		Class330_Sub18 var16 = var15.aClass330_Sub18_692;
		Class84 var17 = null;
		if (arg2 != null) {
			var17 = arg2.aClass84Array9665[arg3];
			if (var17.aClass330_Sub18_692 != var16) {
				var17 = null;
			}
		}
		this.method4453(var16, var15, var17, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		Class84 var18 = arg6.aClass84Array9665[arg7];
		Class84 var19 = null;
		if (arg8 != null) {
			var19 = arg8.aClass84Array9665[arg9];
			if (var19.aClass330_Sub18_692 != var16) {
				var19 = null;
			}
		}
		this.method4470(0, new int[0], 0, 0, 0, 0, arg13);
		this.method4453(var18.aClass330_Sub18_692, var18, var19, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.ka();
		this.method4448();
	}

	public float[] method4459(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
		float[] var8 = new float[9];
		float[] var9 = new float[9];
		float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		float var12 = 1.0F - var10;
		var8[0] = var10;
		var8[1] = 0.0F;
		var8[2] = var11;
		var8[3] = 0.0F;
		var8[4] = 1.0F;
		var8[5] = 0.0F;
		var8[6] = -var11;
		var8[7] = 0.0F;
		var8[8] = var10;
		float[] var13 = new float[9];
		float var14 = 1.0F;
		float var15 = 0.0F;
		float var17 = (float) arg1 / 32767.0F;
		float var18 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
		float var19 = 1.0F - var17;
		float var16 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (var16 == 0.0F && var17 == 0.0F) {
			var9 = var8;
		} else {
			if (var16 != 0.0F) {
				var14 = (float) -arg2 / var16;
				var15 = (float) arg0 / var16;
			}
			var13[0] = var17 + var14 * var14 * var19;
			var13[1] = var15 * var18;
			var13[2] = var15 * var14 * var19;
			var13[3] = -var15 * var18;
			var13[4] = var17;
			var13[5] = var14 * var18;
			var13[6] = var14 * var15 * var19;
			var13[7] = -var14 * var18;
			var13[8] = var17 + var15 * var15 * var19;
			var9[0] = var8[0] * var13[0] + var8[1] * var13[3] + var8[2] * var13[6];
			var9[1] = var8[0] * var13[1] + var8[1] * var13[4] + var8[2] * var13[7];
			var9[2] = var8[0] * var13[2] + var8[1] * var13[5] + var8[2] * var13[8];
			var9[3] = var8[3] * var13[0] + var8[4] * var13[3] + var8[5] * var13[6];
			var9[4] = var8[3] * var13[1] + var8[4] * var13[4] + var8[5] * var13[7];
			var9[5] = var8[3] * var13[2] + var8[4] * var13[5] + var8[5] * var13[8];
			var9[6] = var8[6] * var13[0] + var8[7] * var13[3] + var8[8] * var13[6];
			var9[7] = var8[6] * var13[1] + var8[7] * var13[4] + var8[8] * var13[7];
			var9[8] = var8[6] * var13[2] + var8[7] * var13[5] + var8[8] * var13[8];
		}
		var9[0] *= arg4;
		var9[1] *= arg4;
		var9[2] *= arg4;
		var9[3] *= arg5;
		var9[4] *= arg5;
		var9[5] *= arg5;
		var9[6] *= arg6;
		var9[7] *= arg6;
		var9[8] *= arg6;
		return var9;
	}

	public void method4492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, float[] arg10) {
		int var18 = arg0 - arg3;
		int var19 = arg1 - arg4;
		int var20 = arg2 - arg5;
		float var12 = (float) var18 * arg6[0] + (float) var19 * arg6[1] + (float) var20 * arg6[2];
		float var13 = (float) var18 * arg6[3] + (float) var19 * arg6[4] + (float) var20 * arg6[5];
		float var14 = (float) var18 * arg6[6] + (float) var19 * arg6[7] + (float) var20 * arg6[8];
		float var15 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			var15 *= arg7;
		}
		float var16 = var13 + 0.5F + arg9;
		float var17;
		if (arg8 == 1) {
			var17 = var15;
			var15 = -var16;
			var16 = var17;
		} else if (arg8 == 2) {
			var15 = -var15;
			var16 = -var16;
		} else if (arg8 == 3) {
			var17 = var15;
			var15 = var16;
			var16 = -var17;
		}
		arg10[0] = var15;
		arg10[1] = var16;
	}

	public abstract void method4440(Class247 arg0, Class80 arg1, int arg2);

	public abstract Class64[] method4445();

	public abstract Class387 method4446(byte arg0, int arg1, boolean arg2);

	@ObfuscatedName("Class387.KA(I)V")
	public abstract void KA(int arg0);

	@ObfuscatedName("Class387.m()I")
	public abstract int m();

	@ObfuscatedName("Class387.bu(IIII)V")
	public abstract void bu(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class387.N()I")
	public abstract int N();

	@ObfuscatedName("Class387.ah()I")
	public abstract int ah();

	@ObfuscatedName("Class387.t(I)V")
	public abstract void t(int arg0);

	@ObfuscatedName("Class387.EA(I)V")
	public abstract void EA(int arg0);

	@ObfuscatedName("Class387.bo(I)V")
	public abstract void bo(int arg0);

	@ObfuscatedName("Class387.c()I")
	public abstract int c();

	@ObfuscatedName("Class387.oa(III)V")
	public abstract void oa(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class387.pa(IILClass_xa;LClass_xa;III)V")
	public abstract void pa(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6);

	public abstract void method4448();

	public abstract void method4451(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	public abstract Class64[] method4452();

	@ObfuscatedName("Class387.ea()Z")
	public abstract boolean ea();

	@ObfuscatedName("Class387.ia(III)V")
	public abstract void ia(int arg0, int arg1, int arg2);

	public abstract void method4455();

	@ObfuscatedName("Class387.w(IIII)V")
	public abstract void w(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class387.ka()V")
	public abstract void ka();

	public abstract boolean method4458(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4);

	@ObfuscatedName("Class387.df(IIII)V")
	public abstract void df(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class387.n()I")
	public abstract int n();

	@ObfuscatedName("Class387.ck(I)V")
	public abstract void ck(int arg0);

	@ObfuscatedName("Class387.ya()I")
	public abstract int ya();

	@ObfuscatedName("Class387.YA()I")
	public abstract int YA();

	@ObfuscatedName("Class387.o()I")
	public abstract int o();

	@ObfuscatedName("Class387.AA()I")
	public abstract int AA();

	@ObfuscatedName("Class387.ha()I")
	public abstract int ha();

	@ObfuscatedName("Class387.S(I)V")
	public abstract void S(int arg0);

	@ObfuscatedName("Class387.bg(I)V")
	public abstract void bg(int arg0);

	public abstract void method4460(byte arg0, byte[] arg1);

	public abstract void color(short arg0, short arg1);

	public abstract void method4461(Class247 arg0, Class80 arg1, int arg2);

	public abstract void paintTexture(short arg0, short arg1);

	@ObfuscatedName("Class387.PA(IIII)V")
	public abstract void PA(int arg0, int arg1, int arg2, int arg3);

	public abstract boolean method4462();

	@ObfuscatedName("Class387.i()Z")
	public abstract boolean i();

	@ObfuscatedName("Class387.u()Z")
	public abstract boolean u();

	public abstract void method4463(Class247 arg0);

	public abstract Class93[] method4464();

	@ObfuscatedName("Class387.da(SS)V")
	public abstract void da(short arg0, short arg1);

	public abstract void method4465(Class247 arg0);

	@ObfuscatedName("Class387.cg()I")
	public abstract int cg();

	public abstract void method4466(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4);

	public abstract void method4467(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4);

	public abstract Class387 method4468(byte arg0, int arg1, boolean arg2);

	public abstract boolean method4469(int arg0, int arg1, Class247 arg2, boolean arg3, int arg4);

	@ObfuscatedName("Class387.p(I)V")
	public abstract void p(int arg0);

	@ObfuscatedName("Class387.ar()I")
	public abstract int ar();

	@ObfuscatedName("Class387.am()I")
	public abstract int am();

	@ObfuscatedName("Class387.ej()V")
	public abstract void ej();

	public abstract void method4470(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("Class387.ao(I)V")
	public abstract void ao(int arg0);

	@ObfuscatedName("Class387.ct()I")
	public abstract int ct();

	@ObfuscatedName("Class387.bs(I)V")
	public abstract void bs(int arg0);

	@ObfuscatedName("Class387.au(I)V")
	public abstract void au(int arg0);

	@ObfuscatedName("Class387.RA()I")
	public abstract int RA();

	@ObfuscatedName("Class387.bc(I)V")
	public abstract void bc(int arg0);

	@ObfuscatedName("Class387.bf(I)V")
	public abstract void bf(int arg0);

	@ObfuscatedName("Class387.bl(I)V")
	public abstract void bl(int arg0);

	@ObfuscatedName("Class387.bk(I)V")
	public abstract void bk(int arg0);

	@ObfuscatedName("Class387.br(I)V")
	public abstract void br(int arg0);

	@ObfuscatedName("Class387.bi(III)V")
	public abstract void bi(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class387.bz(III)V")
	public abstract void bz(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class387.bt(I)V")
	public abstract void bt(int arg0);

	public abstract boolean method4471();

	public abstract void method4472();

	@ObfuscatedName("Class387.bx()V")
	public abstract void bx();

	public abstract void method4473(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	public abstract void method4474(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	public abstract void method4475(Class247 arg0, Class80 arg1, int arg2);

	public abstract Class93[] method4476();

	public abstract void method4477(Class247 arg0, int arg1, boolean arg2);

	public abstract void method4478(Class247 arg0, int arg1, boolean arg2);

	@ObfuscatedName("Class387.cd()I")
	public abstract int cd();

	@ObfuscatedName("Class387.by(IILClass_xa;LClass_xa;III)V")
	public abstract void by(int arg0, int arg1, Class_xa arg2, Class_xa arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("Class387.co()I")
	public abstract int co();

	@ObfuscatedName("Class387.er(I[IIIIZI[I)V")
	public abstract void er(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("Class387.ce(LClass_na;)LClass_na;")
	public abstract Class_na ce(Class_na arg0);

	@ObfuscatedName("Class387.cz()I")
	public abstract int cz();

	@ObfuscatedName("Class387.cj()I")
	public abstract int cj();

	@ObfuscatedName("Class387.dm(IIII)V")
	public abstract void dm(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class387.cb()I")
	public abstract int cb();

	public abstract void method4479();

	public abstract void method4480(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class387.cy()I")
	public abstract int cy();

	@ObfuscatedName("Class387.cm()I")
	public abstract int cm();

	@ObfuscatedName("Class387.cw()I")
	public abstract int cw();

	public abstract void method4481(Class247 arg0, int arg1, boolean arg2);

	@ObfuscatedName("Class387.ci()I")
	public abstract int ci();

	@ObfuscatedName("Class387.f(I)V")
	public abstract void f(int arg0);

	@ObfuscatedName("Class387.cr()I")
	public abstract int cr();

	@ObfuscatedName("Class387.ee(I[IIIIZI[I)V")
	public abstract void ee(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("Class387.Q(I)V")
	public abstract void Q(int arg0);

	@ObfuscatedName("Class387.cl(I)V")
	public abstract void cl(int arg0);

	@ObfuscatedName("Class387.cp(I)V")
	public abstract void cp(int arg0);

	@ObfuscatedName("Class387.cf(I)V")
	public abstract void cf(int arg0);

	@ObfuscatedName("Class387.cv(I)V")
	public abstract void cv(int arg0);

	@ObfuscatedName("Class387.ca()I")
	public abstract int ca();

	@ObfuscatedName("Class387.e(I[IIIIZI[I)V")
	public abstract void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("Class387.cx()I")
	public abstract int cx();

	@ObfuscatedName("Class387.cc()I")
	public abstract int cc();

	@ObfuscatedName("Class387.db()I")
	public abstract int db();

	@ObfuscatedName("Class387.dg()[B")
	public abstract byte[] dg();

	@ObfuscatedName("Class387.dz()[B")
	public abstract byte[] dz();

	@ObfuscatedName("Class387.as()[B")
	public abstract byte[] as();

	public abstract void method_do(short arg0, short arg1);

	@ObfuscatedName("Class387.Z()I")
	public abstract int Z();

	@ObfuscatedName("Class387.dh(SS)V")
	public abstract void dh(short arg0, short arg1);

	@ObfuscatedName("Class387.dt(SS)V")
	public abstract void dt(short arg0, short arg1);

	@ObfuscatedName("Class387.dq(SS)V")
	public abstract void dq(short arg0, short arg1);

	public abstract void method4482(byte arg0, byte[] arg1);

	@ObfuscatedName("Class387.cn()I")
	public abstract int cn();

	@ObfuscatedName("Class387.dj(SS)V")
	public abstract void dj(short arg0, short arg1);

	@ObfuscatedName("Class387.dl(SS)V")
	public abstract void dl(short arg0, short arg1);

	@ObfuscatedName("Class387.ds()I")
	public abstract int ds();

	@ObfuscatedName("Class387.du(IIII)V")
	public abstract void du(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("Class387.dr()[B")
	public abstract byte[] dr();

	public abstract Class93[] method4483();

	public abstract Class64[] method4484();

	public abstract Class64[] method4485();

	public abstract void method4486(byte arg0, byte[] arg1);

	public abstract boolean method4487();

	public abstract void method4488(Class247 arg0, int arg1, boolean arg2);

	@ObfuscatedName("Class387.dw()Z")
	public abstract boolean dw();

	@ObfuscatedName("Class387.dp()Z")
	public abstract boolean dp();

	@ObfuscatedName("Class387.ed(I)V")
	public abstract void ed(int arg0);

	@ObfuscatedName("Class387.ga(LClass_na;)LClass_na;")
	public abstract Class_na ga(Class_na arg0);

	@ObfuscatedName("Class387.ew()Z")
	public abstract boolean ew();

	@ObfuscatedName("Class387.el()Z")
	public abstract boolean el();

	@ObfuscatedName("Class387.em()Z")
	public abstract boolean em();

	public abstract void method4489();

	@ObfuscatedName("Class387.ei()Z")
	public abstract boolean ei();

	@ObfuscatedName("Class387.en(I[IIIIZI[I)V")
	public abstract void en(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("Class387.av()I")
	public abstract int av();

	public abstract void method4490(Class387 arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class387.wa()V")
	public abstract void wa();

	public abstract void method4491();

	@ObfuscatedName("Class387.cq()I")
	public abstract int cq();

	@ObfuscatedName("Class387.cs()I")
	public abstract int cs();

	@ObfuscatedName("Class387.be(III)V")
	public abstract void be(int arg0, int arg1, int arg2);

	@ObfuscatedName("Class387.cu(I)V")
	public abstract void cu(int arg0);
}
