package deob;

public class Class38 {

	public boolean aBoolean414 = false;

	public boolean aBoolean384 = true;

	public boolean aBoolean383 = false;

	public int anInt402 = 0;

	public boolean aBoolean387 = false;

	public boolean aBoolean419 = false;

	public int[] anIntArray389 = new int[4096];

	public float aFloat394 = 0.0F;

	public float aFloat395 = 1.0F;

	public int anInt404 = -1;

	public int[] anIntArray399 = null;

	public int anInt406 = 0;

	public int anInt407 = 0;

	public float aFloat408 = 0.0F;

	public boolean aBoolean410 = true;

	public int anInt413 = -1;

	public int[] anIntArray412 = null;

	public int anInt409 = 0;

	public int anInt393 = 0;

	public float aFloat390 = 0.0F;

	public int anInt416 = -1;

	public int[] anIntArray385 = null;

	public int anInt418 = 0;

	public int anInt405 = 0;

	public float aFloat386 = 0.0F;

	public Class_ra_Sub3 aClass_ra_Sub3_398;

	public Class6 aClass6_415;

	public int anInt400;

	public int[] anIntArray401;

	public float[] aFloatArray388;

	public Class369 aClass369_417;

	public float aFloat391;

	public float aFloat392;

	public float aFloat411;

	public float aFloat420;

	public int anInt396;

	public int anInt397;

	public int anInt403;

	public int method534() {
		return this.anIntArray389[0] % this.anInt400;
	}

	public final void method535(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11) {
		if (this.aBoolean387) {
			if (arg7 > this.anInt396) {
				arg7 = this.anInt396;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		float var18;
		float var19;
		int var20;
		if (this.aClass6_415.aBoolean111) {
			if (this.aBoolean384) {
				var20 = arg7 - arg6 >> 2;
				var18 = arg9 * 4.0F;
				if (this.anInt402 == 0) {
					if (var20 > 0) {
						do {
							var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
							arg8 += var18;
							var16 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray388[var16]) {
								arg2[var16] = var17;
								if (arg0) {
									this.aFloatArray388[var16] = arg10;
								}
							}
							var19 = arg10 + arg11;
							var16++;
							if (!arg0 || var19 < this.aFloatArray388[var16]) {
								arg2[var16] = var17;
								if (arg0) {
									this.aFloatArray388[var16] = var19;
								}
							}
							var19 += arg11;
							var16++;
							if (!arg0 || var19 < this.aFloatArray388[var16]) {
								arg2[var16] = var17;
								if (arg0) {
									this.aFloatArray388[var16] = var19;
								}
							}
							var19 += arg11;
							arg3 = var16 + 1;
							if (!arg0 || var19 < this.aFloatArray388[arg3]) {
								arg2[arg3] = var17;
								if (arg0) {
									this.aFloatArray388[arg3] = var19;
								}
							}
							arg10 = var19 + arg11;
							var20--;
						} while (var20 > 0);
					}
					var20 = arg7 - arg6 & 0x3;
					if (var20 > 0) {
						var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
								arg2[arg3] = var17;
								if (arg0) {
									this.aFloatArray388[arg3] = arg10;
								}
							}
							arg10 += arg11;
							var20--;
						} while (var20 > 0);
					}
				} else {
					var13 = this.anInt402;
					var14 = 256 - this.anInt402;
					if (var20 > 0) {
						do {
							var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
							arg8 += var18;
							var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
							var16 = arg3 + 1;
							if (!arg0 || arg10 < this.aFloatArray388[var16]) {
								var15 = arg2[var16];
								if (arg1) {
									arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								} else {
									arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var16] = arg10;
								}
							}
							var19 = arg10 + arg11;
							var16++;
							if (!arg0 || var19 < this.aFloatArray388[var16]) {
								var15 = arg2[var16];
								if (arg1) {
									arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								} else {
									arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var16] = var19;
								}
							}
							var19 += arg11;
							var16++;
							if (!arg0 || var19 < this.aFloatArray388[var16]) {
								var15 = arg2[var16];
								if (arg1) {
									arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								} else {
									arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var16] = var19;
								}
							}
							var19 += arg11;
							arg3 = var16 + 1;
							if (!arg0 || var19 < this.aFloatArray388[arg3]) {
								var15 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[arg3] = var19;
								}
							}
							arg10 = var19 + arg11;
							var20--;
						} while (var20 > 0);
					}
					var20 = arg7 - arg6 & 0x3;
					if (var20 > 0) {
						var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
						var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
								var15 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[arg3] = arg10;
								}
							}
							arg10 += arg11;
							var20--;
						} while (var20 > 0);
					}
				}
			} else {
				var20 = arg7 - arg6;
				if (this.anInt402 == 0) {
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
							arg2[arg3] = Console.anIntArray4263[(int) arg8 & 0xFFFF];
							if (arg0) {
								this.aFloatArray388[arg3] = arg10;
							}
						}
						arg10 += arg11;
						arg8 += arg9;
						var20--;
					} while (var20 > 0);
				} else {
					var13 = this.anInt402;
					var14 = 256 - this.anInt402;
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
							var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
							var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
							var15 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray388[arg3] = arg10;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						var20--;
					} while (var20 > 0);
				}
			}
		} else if (this.aBoolean384) {
			var20 = arg7 - arg6 >> 2;
			var18 = arg9 * 4.0F;
			if (this.anInt402 == 0) {
				if (var20 > 0) {
					do {
						var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
						arg8 += var18;
						var16 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray388[var16]) {
							arg2[var16] = var17;
						}
						var19 = arg10 + arg11;
						var16++;
						if (!arg0 || var19 < this.aFloatArray388[var16]) {
							arg2[var16] = var17;
						}
						var19 += arg11;
						var16++;
						if (!arg0 || var19 < this.aFloatArray388[var16]) {
							arg2[var16] = var17;
						}
						var19 += arg11;
						arg3 = var16 + 1;
						if (!arg0 || var19 < this.aFloatArray388[arg3]) {
							arg2[arg3] = var17;
						}
						arg10 = var19 + arg11;
						var20--;
					} while (var20 > 0);
				}
				var20 = arg7 - arg6 & 0x3;
				if (var20 > 0) {
					var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
							arg2[arg3] = var17;
						}
						arg10 += arg11;
						var20--;
					} while (var20 > 0);
				}
			} else {
				var13 = this.anInt402;
				var14 = 256 - this.anInt402;
				if (var20 > 0) {
					do {
						var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
						arg8 += var18;
						var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
						var16 = arg3 + 1;
						if (!arg0 || arg10 < this.aFloatArray388[var16]) {
							var15 = arg2[var16];
							if (arg1) {
								arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
						}
						var19 = arg10 + arg11;
						var16++;
						if (!arg0 || var19 < this.aFloatArray388[var16]) {
							var15 = arg2[var16];
							if (arg1) {
								arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
						}
						var19 += arg11;
						var16++;
						if (!arg0 || var19 < this.aFloatArray388[var16]) {
							var15 = arg2[var16];
							if (arg1) {
								arg2[var16] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[var16] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
						}
						var19 += arg11;
						arg3 = var16 + 1;
						if (!arg0 || var19 < this.aFloatArray388[arg3]) {
							var15 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
						}
						arg10 = var19 + arg11;
						var20--;
					} while (var20 > 0);
				}
				var20 = arg7 - arg6 & 0x3;
				if (var20 > 0) {
					var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
					var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
							var15 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
							}
						}
						arg10 += arg11;
						var20--;
					} while (var20 > 0);
				}
			}
		} else {
			var20 = arg7 - arg6;
			if (this.anInt402 == 0) {
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
						arg2[arg3] = Console.anIntArray4263[(int) arg8 & 0xFFFF];
					}
					arg10 += arg11;
					arg8 += arg9;
					var20--;
				} while (var20 > 0);
			} else {
				var13 = this.anInt402;
				var14 = 256 - this.anInt402;
				do {
					arg3++;
					if (!arg0 || arg10 < this.aFloatArray388[arg3]) {
						var17 = Console.anIntArray4263[(int) arg8 & 0xFFFF];
						var17 = ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var14 >> 8 & 0xFF00);
						var15 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (var14 | var15 >> 24) << 24 | var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = var17 + ((var15 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var13 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					var20--;
				} while (var20 > 0);
			}
		}
	}

	public final void method536(boolean arg0) {
		this.aBoolean414 = arg0;
	}

	public Class38(Class_ra_Sub3 arg0, Class6 arg1) {
		this.aClass_ra_Sub3_398 = arg0;
		this.aClass6_415 = arg1;
		this.anInt400 = this.aClass_ra_Sub3_398.anInt8618;
		this.anIntArray401 = this.aClass_ra_Sub3_398.anIntArray8630;
		this.aFloatArray388 = this.aClass_ra_Sub3_398.aFloatArray8620;
		this.aClass369_417 = Class369.aClass369_6818;
	}

	public int method537() {
		return this.anIntArray389[0] / this.anInt400;
	}

	public final void method538(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12, int arg13, int arg14) {
		if (!arg0) {
			this.method539(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean414) {
			this.aClass_ra_Sub3_398.method4791((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000, (byte) -59);
			this.aClass_ra_Sub3_398.method4791((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000, (byte) -19);
			this.aClass_ra_Sub3_398.method4791((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000, (byte) -33);
		} else {
			float var16 = arg7 - arg6;
			float var17 = arg4 - arg3;
			float var18 = arg8 - arg6;
			float var19 = arg5 - arg3;
			float var20 = arg10 - arg9;
			float var21 = arg11 - arg9;
			float var22 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			float var23 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			float var24 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			float var25 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			float var26 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			float var27 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			float var28;
			if (arg5 == arg4) {
				var28 = 0.0F;
			} else {
				var28 = (arg8 - arg7) / (arg5 - arg4);
			}
			float var29;
			if (arg4 == arg3) {
				var29 = 0.0F;
			} else {
				var29 = var16 / var17;
			}
			float var30;
			if (arg5 == arg3) {
				var30 = 0.0F;
			} else {
				var30 = var18 / var19;
			}
			float var31 = var16 * var19 - var18 * var17;
			if (var31 != 0.0F) {
				float var32 = (var20 * var19 - var21 * var17) / var31;
				float var33 = (var21 * var16 - var20 * var18) / var31;
				float var34 = (var22 * var19 - var23 * var17) / var31;
				float var35 = (var23 * var16 - var22 * var18) / var31;
				float var36 = (var24 * var19 - var25 * var17) / var31;
				float var37 = (var25 * var16 - var24 * var18) / var31;
				float var38 = (var26 * var19 - var27 * var17) / var31;
				float var39 = (var27 * var16 - var26 * var18) / var31;
				float var40;
				float var41;
				float var42;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt397)) {
						if (arg4 > (float) this.anInt397) {
							arg4 = this.anInt397;
						}
						if (arg5 > (float) this.anInt397) {
							arg5 = this.anInt397;
						}
						arg9 = arg9 - var32 * arg6 + var32;
						var40 = (float) (arg12 & 0xFF0000) - var34 * arg6 + var34;
						var41 = (float) (arg12 & 0xFF00) - var36 * arg6 + var36;
						var42 = (float) (arg12 & 0xFF) - var38 * arg6 + var38;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - var30 * arg3;
								arg6 -= var29 * arg3;
								arg9 -= var33 * arg3;
								var40 -= var35 * arg3;
								var41 -= var37 * arg3;
								var42 -= var39 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= var28 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && var30 < var29 || arg3 == arg4 && var30 > var28) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var30;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var30;
									arg7 += var28;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var30;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var30;
									arg7 += var28;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - var30 * arg3;
								arg6 -= var29 * arg3;
								arg9 -= var33 * arg3;
								var40 -= var35 * arg3;
								var41 -= var37 * arg3;
								var42 -= var39 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= var28 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && var30 < var29 || arg3 == arg5 && var28 > var29) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg7 += var30;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
								while (--arg4 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var28;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg7 += var30;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
								while (--arg4 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg9, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var28;
									arg6 += var29;
									arg9 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg3 += this.anInt400;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt397)) {
						if (arg5 > (float) this.anInt397) {
							arg5 = this.anInt397;
						}
						if (arg3 > (float) this.anInt397) {
							arg3 = this.anInt397;
						}
						arg10 = arg10 - var32 * arg7 + var32;
						var40 = (float) (arg13 & 0xFF0000) - var34 * arg7 + var34;
						var41 = (float) (arg13 & 0xFF00) - var36 * arg7 + var36;
						var42 = (float) (arg13 & 0xFF) - var38 * arg7 + var38;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - var29 * arg4;
								arg7 -= var28 * arg4;
								arg10 -= var33 * arg4;
								var40 -= var35 * arg4;
								var41 -= var37 * arg4;
								var42 -= var39 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= var30 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && var29 < var28 || arg4 == arg5 && var29 > var30) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var29;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
								while (--arg3 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var29;
									arg8 += var30;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var29;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
								while (--arg3 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var29;
									arg8 += var30;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - var29 * arg4;
								arg7 -= var28 * arg4;
								arg10 -= var33 * arg4;
								var40 -= var35 * arg4;
								var41 -= var37 * arg4;
								var42 -= var39 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= var30 * arg3;
								arg3 = 0.0F;
							}
							if (var29 < var28) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var29;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var30;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg8 += var29;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method545(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg10, var32, var40, var34, var41, var36, var42, var38);
									arg6 += var30;
									arg7 += var28;
									arg10 += var33;
									var40 += var35;
									var41 += var37;
									var42 += var39;
									arg4 += this.anInt400;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt397)) {
					if (arg3 > (float) this.anInt397) {
						arg3 = this.anInt397;
					}
					if (arg4 > (float) this.anInt397) {
						arg4 = this.anInt397;
					}
					arg11 = arg11 - var32 * arg8 + var32;
					var40 = (float) (arg14 & 0xFF0000) - var34 * arg8 + var34;
					var41 = (float) (arg14 & 0xFF00) - var36 * arg8 + var36;
					var42 = (float) (arg14 & 0xFF) - var38 * arg8 + var38;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - var28 * arg5;
							arg8 -= var30 * arg5;
							arg11 -= var33 * arg5;
							var40 -= var35 * arg5;
							var41 -= var37 * arg5;
							var42 -= var39 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= var29 * arg3;
							arg3 = 0.0F;
						}
						if (var28 < var30) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var28;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
							while (--arg4 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var28;
								arg6 += var29;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var28;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
							while (--arg4 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var28;
								arg6 += var29;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - var28 * arg5;
							arg8 -= var30 * arg5;
							arg11 -= var33 * arg5;
							var40 -= var35 * arg5;
							var41 -= var37 * arg5;
							var42 -= var39 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= var29 * arg4;
							arg4 = 0.0F;
						}
						if (var28 < var30) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg6 += var28;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
							while (--arg3 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var29;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg6 += var28;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
							while (--arg3 >= 0.0F) {
								this.method545(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg11, var32, var40, var34, var41, var36, var42, var38);
								arg7 += var29;
								arg8 += var30;
								arg11 += var33;
								var40 += var35;
								var41 += var37;
								var42 += var39;
								arg5 += this.anInt400;
							}
						}
					}
				}
			}
		}
	}

	public final void method539(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, int arg12) {
		if (this.aBoolean414) {
			this.aClass_ra_Sub3_398.method4791((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12, (byte) -119);
			this.aClass_ra_Sub3_398.method4791((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12, (byte) -90);
			this.aClass_ra_Sub3_398.method4791((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12, (byte) -76);
			return;
		}
		float var14 = arg7 - arg6;
		float var15 = arg4 - arg3;
		float var16 = arg8 - arg6;
		float var17 = arg5 - arg3;
		float var18 = arg10 - arg9;
		float var19 = arg11 - arg9;
		float var20 = 0.0F;
		if (arg4 != arg3) {
			var20 = (arg7 - arg6) / (arg4 - arg3);
		}
		float var21 = 0.0F;
		if (arg5 != arg4) {
			var21 = (arg8 - arg7) / (arg5 - arg4);
		}
		float var22 = 0.0F;
		if (arg5 != arg3) {
			var22 = (arg6 - arg8) / (arg3 - arg5);
		}
		float var23 = var14 * var17 - var16 * var15;
		if (var23 == 0.0F) {
			return;
		}
		float var24 = (var18 * var17 - var19 * var15) / var23;
		float var25 = (var19 * var14 - var18 * var16) / var23;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt397)) {
				if (arg4 > (float) this.anInt397) {
					arg4 = this.anInt397;
				}
				if (arg5 > (float) this.anInt397) {
					arg5 = this.anInt397;
				}
				arg9 = arg9 - var24 * arg6 + var24;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - var22 * arg3;
						arg6 -= var20 * arg3;
						arg9 -= var25 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= var21 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && var22 < var20 || arg3 == arg4 && var22 > var21) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray389[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, var24);
							arg8 += var22;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg8, (int) arg7, arg9, var24);
							arg8 += var22;
							arg7 += var21;
							arg9 += var25;
							arg3 += this.anInt400;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray389[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, var24);
							arg8 += var22;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg7, (int) arg8, arg9, var24);
							arg8 += var22;
							arg7 += var21;
							arg9 += var25;
							arg3 += this.anInt400;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - var22 * arg3;
						arg6 -= var20 * arg3;
						arg9 -= var25 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= var21 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(var22 < var20)) && (arg3 != arg5 || !(var21 > var20))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray389[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg6, (int) arg7, arg9, var24);
							arg7 += var22;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
						while (--arg4 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg6, (int) arg8, arg9, var24);
							arg8 += var21;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray389[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg7, (int) arg6, arg9, var24);
							arg7 += var22;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
						while (--arg4 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg3, arg12, 0, (int) arg8, (int) arg6, arg9, var24);
							arg8 += var21;
							arg6 += var20;
							arg9 += var25;
							arg3 += this.anInt400;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt397)) {
				if (arg5 > (float) this.anInt397) {
					arg5 = this.anInt397;
				}
				if (arg3 > (float) this.anInt397) {
					arg3 = this.anInt397;
				}
				arg10 = arg10 - var24 * arg7 + var24;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - var20 * arg4;
						arg7 -= var21 * arg4;
						arg10 -= var25 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= var22 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && var20 < var21 || arg4 == arg5 && var20 > var22) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray389[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, var24);
							arg6 += var20;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
						while (--arg3 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg6, (int) arg8, arg10, var24);
							arg6 += var20;
							arg8 += var22;
							arg10 += var25;
							arg4 += this.anInt400;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray389[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, var24);
							arg6 += var20;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
						while (--arg3 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg8, (int) arg6, arg10, var24);
							arg6 += var20;
							arg8 += var22;
							arg10 += var25;
							arg4 += this.anInt400;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - var20 * arg4;
						arg7 -= var21 * arg4;
						arg10 -= var25 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= var22 * arg3;
						arg3 = 0.0F;
					}
					if (var20 < var21) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray389[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg8, (int) arg7, arg10, var24);
							arg8 += var20;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg6, (int) arg7, arg10, var24);
							arg6 += var22;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray389[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg7, (int) arg8, arg10, var24);
							arg8 += var20;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
						while (--arg5 >= 0.0F) {
							this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg4, arg12, 0, (int) arg7, (int) arg6, arg10, var24);
							arg6 += var22;
							arg7 += var21;
							arg10 += var25;
							arg4 += this.anInt400;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt397)) {
			if (arg3 > (float) this.anInt397) {
				arg3 = this.anInt397;
			}
			if (arg4 > (float) this.anInt397) {
				arg4 = this.anInt397;
			}
			arg11 = arg11 - var24 * arg8 + var24;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - var21 * arg5;
					arg8 -= var22 * arg5;
					arg11 -= var25 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= var20 * arg3;
					arg3 = 0.0F;
				}
				if (var21 < var22) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray389[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, var24);
						arg7 += var21;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
					while (--arg4 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg7, (int) arg6, arg11, var24);
						arg7 += var21;
						arg6 += var20;
						arg11 += var25;
						arg5 += this.anInt400;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray389[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, var24);
						arg7 += var21;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
					while (--arg4 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg6, (int) arg7, arg11, var24);
						arg7 += var21;
						arg6 += var20;
						arg11 += var25;
						arg5 += this.anInt400;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - var21 * arg5;
					arg8 -= var22 * arg5;
					arg11 -= var25 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= var20 * arg4;
					arg4 = 0.0F;
				}
				if (var21 < var22) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray389[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg6, (int) arg8, arg11, var24);
						arg6 += var21;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
					while (--arg3 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg7, (int) arg8, arg11, var24);
						arg7 += var20;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray389[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg8, (int) arg6, arg11, var24);
						arg6 += var21;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
					while (--arg3 >= 0.0F) {
						this.method540(arg0, arg1, arg2, this.anIntArray401, (int) arg5, arg12, 0, (int) arg8, (int) arg7, arg11, var24);
						arg7 += var20;
						arg8 += var22;
						arg11 += var25;
						arg5 += this.anInt400;
					}
				}
			}
		}
	}

	public final void method540(boolean arg0, boolean arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10) {
		if (this.aBoolean387) {
			if (arg8 > this.anInt396) {
				arg8 = this.anInt396;
			}
			if (arg7 < 0) {
				arg7 = 0;
			}
		}
		if (arg7 >= arg8) {
			return;
		}
		arg4 += arg7 - 1;
		int var18 = arg8 - arg7 >> 2;
		arg9 += arg10 * (float) arg7;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		float var17;
		if (this.aClass6_415.aBoolean111) {
			if (this.anInt402 == 0) {
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray388[arg4]) {
								if (arg0) {
									arg3[arg4] = arg5;
								}
								if (arg1) {
									this.aFloatArray388[arg4] = arg9;
								}
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray388[var15]) {
						if (arg0) {
							arg3[var15] = arg5;
						}
						if (arg1) {
							this.aFloatArray388[var15] = arg9;
						}
					}
					var17 = arg9 + arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						if (arg0) {
							arg3[var15] = arg5;
						}
						if (arg1) {
							this.aFloatArray388[var15] = var17;
						}
					}
					var17 += arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						if (arg0) {
							arg3[var15] = arg5;
						}
						if (arg1) {
							this.aFloatArray388[var15] = var17;
						}
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if (!arg1 || !(var17 >= this.aFloatArray388[arg4])) {
						if (arg0) {
							arg3[arg4] = arg5;
						}
						if (arg1) {
							this.aFloatArray388[arg4] = var17;
						}
					}
					arg9 = var17 + arg10;
				}
			} else if (this.anInt402 != 254) {
				var12 = this.anInt402;
				var13 = 256 - this.anInt402;
				var16 = ((arg5 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * var13 >> 8 & 0xFF00);
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray388[arg4]) {
								if (arg0) {
									var14 = arg3[arg4];
									if (arg2) {
										arg3[arg4] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
									} else {
										arg3[arg4] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
									}
								}
								if (arg1) {
									this.aFloatArray388[arg4] = arg9;
								}
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray388[var15]) {
						if (arg0) {
							var14 = arg3[var15];
							if (arg2) {
								arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							} else {
								arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray388[var15] = arg9;
						}
					}
					var17 = arg9 + arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						if (arg0) {
							var14 = arg3[var15];
							if (arg2) {
								arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							} else {
								arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray388[var15] = var17;
						}
					}
					var17 += arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						if (arg0) {
							var14 = arg3[var15];
							if (arg2) {
								arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							} else {
								arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray388[var15] = var17;
						}
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if (!arg1 || !(var17 >= this.aFloatArray388[arg4])) {
						if (arg0) {
							var14 = arg3[arg4];
							if (arg2) {
								arg3[arg4] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							} else {
								arg3[arg4] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray388[arg4] = var17;
						}
					}
					arg9 = var17 + arg10;
				}
			} else if (arg7 != 0 && arg8 <= this.anInt396 - 1) {
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if ((!arg1 || arg9 < this.aFloatArray388[arg4]) && arg0) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if ((!arg1 || arg9 < this.aFloatArray388[var15]) && arg0) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 = arg9 + arg10;
					var15++;
					if ((!arg1 || var17 < this.aFloatArray388[var15]) && arg0) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 += arg10;
					var15++;
					if ((!arg1 || var17 < this.aFloatArray388[var15]) && arg0) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if ((!arg1 || var17 < this.aFloatArray388[arg4]) && arg0) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg9 = var17 + arg10;
				}
			}
		} else if (arg0) {
			if (this.anInt402 == 0) {
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray388[arg4]) {
								arg3[arg4] = arg5;
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray388[var15]) {
						arg3[var15] = arg5;
					}
					var17 = arg9 + arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						arg3[var15] = arg5;
					}
					var17 += arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						arg3[var15] = arg5;
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if (!arg1 || var17 < this.aFloatArray388[arg4]) {
						arg3[arg4] = arg5;
					}
					arg9 = var17 + arg10;
				}
			} else if (this.anInt402 != 254) {
				var12 = this.anInt402;
				var13 = 256 - this.anInt402;
				var16 = ((arg5 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * var13 >> 8 & 0xFF00);
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || !(arg9 >= this.aFloatArray388[arg4])) {
								var14 = arg3[arg4];
								if (arg2) {
									arg3[arg4] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
								} else {
									arg3[arg4] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
								}
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray388[var15]) {
						var14 = arg3[var15];
						if (arg2) {
							arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						} else {
							arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						}
					}
					var17 = arg9 + arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						var14 = arg3[var15];
						if (arg2) {
							arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						} else {
							arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						}
					}
					var17 += arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						var14 = arg3[var15];
						if (arg2) {
							arg3[var15] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						} else {
							arg3[var15] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						}
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if (!arg1 || !(var17 >= this.aFloatArray388[arg4])) {
						var14 = arg3[arg4];
						if (arg2) {
							arg3[arg4] = (var13 | var14 >> 24) << 24 | var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						} else {
							arg3[arg4] = var16 + ((var14 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var12 >> 8 & 0xFF00);
						}
					}
					arg9 = var17 + arg10;
				}
			} else if (arg7 != 0 && arg8 <= this.anInt396 - 1) {
				while (true) {
					var18--;
					if (var18 < 0) {
						var18 = arg8 - arg7 & 0x3;
						while (true) {
							var18--;
							if (var18 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg9 < this.aFloatArray388[arg4]) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg9 += arg10;
						}
					}
					var15 = arg4 + 1;
					if (!arg1 || arg9 < this.aFloatArray388[var15]) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 = arg9 + arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 += arg10;
					var15++;
					if (!arg1 || var17 < this.aFloatArray388[var15]) {
						arg3[var15 - 1] = arg3[var15];
					}
					var17 += arg10;
					arg4 = var15 + 1;
					if (!arg1 || var17 < this.aFloatArray388[arg4]) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg9 = var17 + arg10;
				}
			}
		}
	}

	public final void method541(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28) {
		if (!arg0) {
			this.method539(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		int var31;
		if (arg28 != this.anInt404) {
			this.anIntArray399 = this.aClass_ra_Sub3_398.method5209(arg28);
			if (this.anIntArray399 == null) {
				this.anInt402 = 255 - (arg21 >> 24 & 0xFF);
				int var83 = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_398.method5192(arg28), (byte) 1) & 0xFFFF];
				var31 = ((arg21 >> 16 & 0xFF) * (var83 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var83 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var83 & 0xFF) >> 8;
				this.method538(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class442.method5612(var31, arg24, arg25, -1027106511), Class442.method5612(var31, arg24, arg26, -1027106511), Class442.method5612(var31, arg24, arg27, -1027106511));
				return;
			}
			this.anInt406 = this.aClass_ra_Sub3_398.method5190(arg28);
			this.anInt407 = this.anInt406 - 1;
			this.aClass369_417 = this.aClass_ra_Sub3_398.method5191(arg28);
			this.aBoolean410 = this.aClass_ra_Sub3_398.method5193(arg28);
		}
		this.anInt403 = arg24;
		float var30;
		if (arg3 > arg4 || arg3 > arg5) {
			if (arg4 <= arg5) {
				var30 = arg6;
				arg6 = arg7;
				arg7 = var30;
				float var76 = arg3;
				arg3 = arg4;
				arg4 = var76;
				float var77 = arg9;
				arg9 = arg10;
				arg10 = var77;
				float var78 = arg15;
				arg15 = arg16;
				arg16 = var78;
				float var79 = arg18;
				arg18 = arg19;
				arg19 = var79;
				float var81 = arg12;
				arg12 = arg13;
				arg13 = var81;
				float var82 = arg25;
				arg25 = arg26;
				arg26 = var82;
				var31 = arg21;
				arg21 = arg22;
				arg22 = var31;
			} else {
				var30 = arg6;
				arg6 = arg8;
				arg8 = var30;
				var30 = arg3;
				arg3 = arg5;
				arg5 = var30;
				var30 = arg9;
				arg9 = arg11;
				arg11 = var30;
				var30 = arg15;
				arg15 = arg17;
				arg17 = var30;
				var30 = arg18;
				arg18 = arg20;
				arg20 = var30;
				var30 = arg12;
				arg12 = arg14;
				arg14 = var30;
				var30 = arg25;
				arg25 = arg27;
				arg27 = var30;
				var31 = arg21;
				arg21 = arg23;
				arg23 = var31;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		var30 = arg21 >> 24 & 0xFF;
		float var80 = (float) (arg22 >> 24 & 0xFF);
		float var32 = (float) (arg23 >> 24 & 0xFF);
		float var33 = (float) (arg21 >> 16 & 0xFF);
		float var34 = (float) (arg22 >> 16 & 0xFF);
		float var35 = (float) (arg23 >> 16 & 0xFF);
		float var36 = (float) (arg21 >> 8 & 0xFF);
		float var37 = (float) (arg22 >> 8 & 0xFF);
		float var38 = (float) (arg23 >> 8 & 0xFF);
		float var39 = (float) (arg21 & 0xFF);
		float var40 = (float) (arg22 & 0xFF);
		float var41 = (float) (arg23 & 0xFF);
		float var42 = 0.0F;
		float var43 = 0.0F;
		float var44 = 0.0F;
		float var45 = 0.0F;
		float var46 = 0.0F;
		float var47 = 0.0F;
		float var48 = 0.0F;
		float var49 = 0.0F;
		float var50 = 0.0F;
		float var51 = 0.0F;
		float var52;
		if (arg4 != arg3) {
			var52 = arg4 - arg3;
			var42 = (arg7 - arg6) / var52;
			var43 = (arg10 - arg9) / var52;
			var44 = (arg13 - arg12) / var52;
			var45 = (arg16 - arg15) / var52;
			var46 = (arg19 - arg18) / var52;
			var47 = (arg26 - arg25) / var52;
			var48 = (var80 - var30) / var52;
			var49 = (var34 - var33) / var52;
			var50 = (var37 - var36) / var52;
			var51 = (var40 - var39) / var52;
		}
		var52 = 0.0F;
		float var53 = 0.0F;
		float var54 = 0.0F;
		float var55 = 0.0F;
		float var56 = 0.0F;
		float var57 = 0.0F;
		float var58 = 0.0F;
		float var59 = 0.0F;
		float var60 = 0.0F;
		float var61 = 0.0F;
		float var62;
		if (arg5 != arg4) {
			var62 = arg5 - arg4;
			var52 = (arg8 - arg7) / var62;
			var53 = (arg11 - arg10) / var62;
			var54 = (arg14 - arg13) / var62;
			var55 = (arg17 - arg16) / var62;
			var56 = (arg20 - arg19) / var62;
			var57 = (arg27 - arg26) / var62;
			var58 = (var32 - var80) / var62;
			var59 = (var35 - var34) / var62;
			var60 = (var38 - var37) / var62;
			var61 = (var41 - var40) / var62;
		}
		var62 = 0.0F;
		float var63 = 0.0F;
		float var64 = 0.0F;
		float var65 = 0.0F;
		float var66 = 0.0F;
		float var67 = 0.0F;
		float var68 = 0.0F;
		float var69 = 0.0F;
		float var70 = 0.0F;
		float var71 = 0.0F;
		float var72;
		if (arg3 != arg5) {
			var72 = arg3 - arg5;
			var62 = (arg6 - arg8) / var72;
			var63 = (arg9 - arg11) / var72;
			var64 = (arg12 - arg14) / var72;
			var65 = (arg15 - arg17) / var72;
			var66 = (arg18 - arg20) / var72;
			var67 = (arg25 - arg27) / var72;
			var68 = (var30 - var32) / var72;
			var69 = (var33 - var35) / var72;
			var70 = (var36 - var38) / var72;
			var71 = (var39 - var41) / var72;
		}
		if (arg3 >= (float) this.anInt397) {
			return;
		}
		if (arg4 > (float) this.anInt397) {
			arg4 = this.anInt397;
		}
		if (arg5 > (float) this.anInt397) {
			arg5 = this.anInt397;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			var72 = var30;
			float var73 = var33;
			float var74 = var36;
			float var75 = var39;
			if (arg3 < 0.0F) {
				arg6 -= var42 * arg3;
				arg7 -= var62 * arg3;
				arg9 -= var43 * arg3;
				arg10 -= var63 * arg3;
				arg12 -= var44 * arg3;
				arg13 -= var64 * arg3;
				arg15 -= var45 * arg3;
				arg16 -= var65 * arg3;
				arg18 -= var46 * arg3;
				arg19 -= var66 * arg3;
				arg25 -= var47 * arg3;
				arg26 -= var67 * arg3;
				var30 -= var48 * arg3;
				var72 -= var68 * arg3;
				var33 -= var48 * arg3;
				var73 -= var68 * arg3;
				var36 -= var48 * arg3;
				var74 -= var68 * arg3;
				var39 -= var48 * arg3;
				var75 -= var68 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= var52 * arg5;
				arg11 -= var53 * arg5;
				arg14 -= var54 * arg5;
				arg17 -= var55 * arg5;
				arg20 -= var56 * arg5;
				arg27 -= var57 * arg5;
				var32 -= var58 * arg5;
				var35 -= var59 * arg5;
				var38 -= var60 * arg5;
				var41 -= var61 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && var62 < var42 || arg3 == arg5 && var52 > var42) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray389[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, var72, var30, var73, var33, var74, var36, var75, var39);
					arg6 += var42;
					arg7 += var62;
					arg9 += var43;
					arg10 += var63;
					arg12 += var44;
					arg13 += var64;
					arg15 += var45;
					arg16 += var65;
					arg18 += var46;
					arg19 += var66;
					arg25 += var47;
					arg26 += var67;
					var30 += var48;
					var72 += var68;
					var33 += var49;
					var73 += var69;
					var36 += var50;
					var74 += var70;
					var39 += var51;
					var75 += var71;
					arg3 += this.anInt400;
				}
				while (--arg4 >= 0.0F) {
					this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, var32, var30, var35, var33, var38, var36, var41, var39);
					arg8 += var52;
					arg6 += var42;
					arg11 += var53;
					arg9 += var43;
					arg14 += var54;
					arg12 += var44;
					arg17 += var55;
					arg15 += var45;
					arg20 += var56;
					arg18 += var46;
					arg27 += var57;
					arg25 += var47;
					var32 += var58;
					var30 += var48;
					var35 += var59;
					var33 += var49;
					var38 += var60;
					var36 += var50;
					var41 += var61;
					var39 += var51;
					arg3 += this.anInt400;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray389[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, var30, var72, var33, var73, var36, var74, var39, var75);
					arg7 += var62;
					arg6 += var42;
					arg10 += var63;
					arg9 += var43;
					arg13 += var64;
					arg12 += var44;
					arg16 += var65;
					arg15 += var45;
					arg19 += var66;
					arg18 += var46;
					arg26 += var67;
					arg25 += var47;
					var72 += var68;
					var30 += var48;
					var73 += var69;
					var33 += var49;
					var74 += var70;
					var36 += var50;
					var75 += var71;
					var39 += var51;
					arg3 += this.anInt400;
				}
				while (--arg4 >= 0.0F) {
					this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, var30, var32, var33, var35, var36, var38, var39, var41);
					arg6 += var42;
					arg8 += var52;
					arg9 += var43;
					arg11 += var53;
					arg12 += var44;
					arg14 += var54;
					arg15 += var45;
					arg17 += var55;
					arg18 += var46;
					arg20 += var56;
					arg25 += var47;
					arg27 += var57;
					var30 += var48;
					var32 += var58;
					var33 += var49;
					var35 += var59;
					var36 += var50;
					var38 += var60;
					var39 += var51;
					var41 += var61;
					arg3 += this.anInt400;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		var32 = var30;
		var35 = var33;
		var38 = var36;
		var41 = var39;
		if (arg3 < 0.0F) {
			arg6 -= var42 * arg3;
			arg8 -= var62 * arg3;
			arg9 -= var43 * arg3;
			arg11 -= var63 * arg3;
			arg12 -= var44 * arg3;
			arg14 -= var64 * arg3;
			arg15 -= var45 * arg3;
			arg17 -= var65 * arg3;
			arg18 -= var46 * arg3;
			arg20 -= var66 * arg3;
			arg25 -= var47 * arg3;
			arg27 -= var67 * arg3;
			var30 -= var48 * arg3;
			var32 -= var68 * arg3;
			var33 -= var48 * arg3;
			var35 -= var68 * arg3;
			var36 -= var48 * arg3;
			var38 -= var68 * arg3;
			var39 -= var48 * arg3;
			var41 -= var68 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= var52 * arg4;
			arg10 -= var53 * arg4;
			arg13 -= var54 * arg4;
			arg16 -= var55 * arg4;
			arg19 -= var56 * arg4;
			arg26 -= var57 * arg4;
			var80 -= var58 * arg4;
			var34 -= var59 * arg4;
			var37 -= var60 * arg4;
			var40 -= var61 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || var62 >= var42) && (arg3 != arg4 || var62 <= var52)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray389[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, var30, var32, var33, var35, var36, var38, var39, var41);
				arg6 += var42;
				arg8 += var62;
				arg9 += var43;
				arg11 += var63;
				arg12 += var44;
				arg14 += var64;
				arg15 += var45;
				arg17 += var65;
				arg18 += var46;
				arg20 += var66;
				arg25 += var47;
				arg27 += var67;
				var30 += var48;
				var32 += var68;
				var33 += var49;
				var35 += var69;
				var36 += var50;
				var38 += var70;
				var39 += var51;
				var41 += var71;
				arg3 += this.anInt400;
			}
			while (--arg5 >= 0.0F) {
				this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, var80, var32, var34, var35, var37, var38, var40, var41);
				arg7 += var52;
				arg8 += var62;
				arg10 += var53;
				arg11 += var63;
				arg13 += var54;
				arg14 += var64;
				arg16 += var55;
				arg17 += var65;
				arg19 += var56;
				arg20 += var66;
				arg26 += var57;
				arg27 += var67;
				var80 += var58;
				var32 += var68;
				var34 += var59;
				var35 += var69;
				var37 += var60;
				var38 += var70;
				var40 += var61;
				var41 += var71;
				arg3 += this.anInt400;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray389[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, var32, var30, var35, var33, var38, var36, var41, var39);
			arg6 += var42;
			arg8 += var62;
			arg9 += var43;
			arg11 += var63;
			arg12 += var44;
			arg14 += var64;
			arg15 += var45;
			arg17 += var65;
			arg18 += var46;
			arg20 += var66;
			arg25 += var47;
			arg27 += var67;
			var30 += var48;
			var32 += var68;
			var33 += var49;
			var35 += var69;
			var36 += var50;
			var38 += var70;
			var39 += var51;
			var41 += var71;
			arg3 += this.anInt400;
		}
		while (--arg5 >= 0.0F) {
			this.method542(arg1, arg2, this.anIntArray401, this.anIntArray399, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, var32, var80, var35, var34, var38, var37, var41, var40);
			arg7 += var52;
			arg8 += var62;
			arg10 += var53;
			arg11 += var63;
			arg13 += var54;
			arg14 += var64;
			arg16 += var55;
			arg17 += var65;
			arg19 += var56;
			arg20 += var66;
			arg26 += var57;
			arg27 += var67;
			var80 += var58;
			var32 += var68;
			var34 += var59;
			var35 += var69;
			var37 += var60;
			var38 += var70;
			var40 += var61;
			var41 += var71;
			arg3 += this.anInt400;
		}
	}

	public final void method542(boolean arg0, boolean arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24) {
		int var26 = arg6 - arg5;
		float var27 = 1.0F / (float) var26;
		float var28 = (arg8 - arg7) * var27;
		float var29 = (arg10 - arg9) * var27;
		float var30 = (arg12 - arg11) * var27;
		float var31 = (arg14 - arg13) * var27;
		float var32 = (arg16 - arg15) * var27;
		float var33 = (arg18 - arg17) * var27;
		float var34 = (arg20 - arg19) * var27;
		float var35 = (arg22 - arg21) * var27;
		float var36 = (arg24 - arg23) * var27;
		if (this.aBoolean387) {
			if (arg6 > this.anInt396) {
				arg6 = this.anInt396;
			}
			if (arg5 < 0) {
				arg7 -= var28 * (float) arg5;
				arg9 -= var29 * (float) arg5;
				arg11 -= var30 * (float) arg5;
				arg13 -= var31 * (float) arg5;
				arg15 -= var32 * (float) arg5;
				arg17 -= var33 * (float) arg5;
				arg19 -= var34 * (float) arg5;
				arg21 -= var35 * (float) arg5;
				arg23 -= var36 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		var26 = arg6 - arg5;
		int var47 = arg4 + arg5;
		while (var26-- > 0) {
			float var37 = 1.0F / arg7;
			float var38 = 1.0F / arg9;
			if (!arg0 || var37 < this.aFloatArray388[var47]) {
				int var39 = (int) (arg11 * var38 * (float) this.anInt406);
				if (this.aBoolean410) {
					var39 &= this.anInt407;
				} else if (var39 < 0) {
					var39 = 0;
				} else if (var39 > this.anInt407) {
					var39 = this.anInt407;
				}
				int var40 = (int) (arg13 * var38 * (float) this.anInt406);
				if (this.aBoolean410) {
					var40 &= this.anInt407;
				} else if (var40 < 0) {
					var40 = 0;
				} else if (var40 > this.anInt407) {
					var40 = this.anInt407;
				}
				int var41 = this.anIntArray399[var40 * this.anInt406 + var39];
				boolean var42 = true;
				int var46;
				if (this.aClass369_417 == Class369.aClass369_6817) {
					var46 = (int) ((float) (var41 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass369_417 == Class369.aClass369_6815) {
					var46 = var41 == 0 ? 0 : 255;
				} else {
					var46 = (int) arg17;
				}
				if (var46 != 0) {
					int var43;
					int var44;
					int var45;
					if (var46 == 255) {
						var43 = ((int) (arg19 * (float) (var41 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (var41 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (var41 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							var44 = (int) (255.0F - arg15);
							var45 = ((this.anInt403 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt403 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							var43 = (((var43 & 0xFF00FF) * var44 & 0xFF00FF00 | (var43 & 0xFF00) * var44 & 0xFF0000) >>> 8) + var45;
						}
						if (arg1) {
							arg2[var47] = var46 << 24 | var43;
						} else {
							arg2[var47] = var43;
						}
						if (arg0) {
							this.aFloatArray388[var47] = var37;
						}
					} else {
						var43 = ((int) (arg19 * (float) (var41 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (var41 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (var41 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							var44 = (int) (255.0F - arg15);
							var45 = ((this.anInt403 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt403 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							var43 = (((var43 & 0xFF00FF) * var44 & 0xFF00FF00 | (var43 & 0xFF00) * var44 & 0xFF0000) >>> 8) + var45;
						}
						var44 = arg2[var47];
						var45 = 255 - var46;
						var43 = ((var44 & 0xFF00FF) * var45 + (var43 & 0xFF00FF) * var46 & 0xFF00FF00) + ((var44 & 0xFF00) * var45 + (var43 & 0xFF00) * var46 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[var47] = (var46 | arg2[var47] >> 24) << 24 | var43;
						} else {
							arg2[var47] = var43;
						}
						if (arg0) {
							this.aFloatArray388[var47] = var37;
						}
					}
				}
			}
			var47++;
			arg7 += var28;
			arg9 += var29;
			arg11 += var30;
			arg13 += var31;
			arg15 += var32;
			arg17 += var33;
			arg19 += var34;
			arg21 += var35;
			arg23 += var36;
		}
	}

	public final void method543(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, float arg21, float arg22, float arg23, float arg24, float arg25, float arg26, float arg27) {
		int var29 = arg5 - arg4;
		float var30 = 1.0F / (float) var29;
		float var31 = (arg7 - arg6) * var30;
		float var32 = (arg9 - arg8) * var30;
		float var33 = (arg11 - arg10) * var30;
		float var34 = (arg13 - arg12) * var30;
		float var35 = (arg15 - arg14) * var30;
		float var36 = (arg17 - arg16) * var30;
		float var37 = (arg19 - arg18) * var30;
		float var38 = (arg21 - arg20) * var30;
		float var39 = (arg23 - arg22) * var30;
		float var40 = (arg25 - arg24) * var30;
		float var41 = (arg27 - arg26) * var30;
		if (this.aBoolean387) {
			if (arg5 > this.anInt396) {
				arg5 = this.anInt396;
			}
			if (arg4 < 0) {
				arg6 -= var31 * (float) arg4;
				arg8 -= var32 * (float) arg4;
				arg10 -= var33 * (float) arg4;
				arg12 -= var34 * (float) arg4;
				arg14 -= var35 * (float) arg4;
				arg16 -= var36 * (float) arg4;
				arg18 -= var37 * (float) arg4;
				arg20 -= var38 * (float) arg4;
				arg22 -= var39 * (float) arg4;
				arg24 -= var40 * (float) arg4;
				arg26 -= var41 * (float) arg4;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		var29 = arg5 - arg4;
		int var63 = arg3 + arg4;
		while (var29-- > 0) {
			float var42 = 1.0F / arg6;
			float var43 = 1.0F / arg8;
			if (!arg0 || var42 < this.aFloatArray388[var63]) {
				float var44 = arg10 * var43;
				float var45 = arg12 * var43;
				int var46 = (int) (var44 * (float) this.anInt406 * this.aFloat408) & this.anInt407;
				int var47 = (int) (var45 * (float) this.anInt406 * this.aFloat408) & this.anInt407;
				int var48 = this.anIntArray399[var47 * this.anInt406 + var46];
				int var56 = (int) (var44 * (float) this.anInt409 * this.aFloat390) & this.anInt393;
				int var58 = (int) (var45 * (float) this.anInt409 * this.aFloat390) & this.anInt393;
				int var49 = this.anIntArray412[var58 * this.anInt409 + var56];
				int var57 = (int) (var44 * (float) this.anInt418 * this.aFloat386) & this.anInt405;
				int var59 = (int) (var45 * (float) this.anInt418 * this.aFloat386) & this.anInt405;
				int var50 = this.anIntArray385[var59 * this.anInt418 + var57];
				float var51 = 1.0F - (arg24 + arg26);
				int var60 = ((int) (arg24 * (float) (var48 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg24 * (float) (var48 >> 8 & 0xFF)) << 8 | (int) (arg24 * (float) (var48 & 0xFF));
				int var61 = ((int) (arg26 * (float) (var49 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg26 * (float) (var49 >> 8 & 0xFF)) << 8 | (int) (arg26 * (float) (var49 & 0xFF));
				int var62 = ((int) (var51 * (float) (var50 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (var51 * (float) (var50 >> 8 & 0xFF)) << 8 | (int) (var51 * (float) (var50 & 0xFF));
				int var52 = var60 + var61 + var62;
				int var53 = ((int) (arg18 * (float) (var52 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg20 * (float) (var52 >> 8 & 0xFF)) & 0xFF00 | (int) (arg22 * (float) (var52 & 0xFF)) >> 8;
				if (arg14 != 0.0F) {
					int var54 = (int) (255.0F - arg14);
					int var55 = ((this.anInt403 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.anInt403 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					var53 = (((var53 & 0xFF00FF) * var54 & 0xFF00FF00 | (var53 & 0xFF00) * var54 & 0xFF0000) >>> 8) + var55;
				}
				if (arg1) {
					arg2[var63] = ((int) arg16 | arg2[var63] >> 24) << 24 | var53;
				} else {
					arg2[var63] = var53;
				}
				if (arg0) {
					this.aFloatArray388[var63] = var42;
				}
			}
			var63++;
			arg6 += var31;
			arg8 += var32;
			arg10 += var33;
			arg12 += var34;
			arg14 += var35;
			arg16 += var36;
			arg18 += var37;
			arg20 += var38;
			arg22 += var39;
			arg24 += var40;
			arg26 += var41;
		}
	}

	public final void method544(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14) {
		if (!arg0) {
			this.method539(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean414) {
			this.aClass_ra_Sub3_398.method4791((int) arg6, (int) arg3, (int) arg7, (int) arg4, Console.anIntArray4263[(int) arg12 & 0xFFFF], (byte) -91);
			this.aClass_ra_Sub3_398.method4791((int) arg7, (int) arg4, (int) arg8, (int) arg5, Console.anIntArray4263[(int) arg12 & 0xFFFF], (byte) -49);
			this.aClass_ra_Sub3_398.method4791((int) arg8, (int) arg5, (int) arg6, (int) arg3, Console.anIntArray4263[(int) arg12 & 0xFFFF], (byte) -37);
		} else {
			float var16 = arg7 - arg6;
			float var17 = arg4 - arg3;
			float var18 = arg8 - arg6;
			float var19 = arg5 - arg3;
			float var20 = arg13 - arg12;
			float var21 = arg14 - arg12;
			float var22 = arg10 - arg9;
			float var23 = arg11 - arg9;
			float var24;
			if (arg5 == arg4) {
				var24 = 0.0F;
			} else {
				var24 = (arg8 - arg7) / (arg5 - arg4);
			}
			float var25;
			if (arg4 == arg3) {
				var25 = 0.0F;
			} else {
				var25 = var16 / var17;
			}
			float var26;
			if (arg5 == arg3) {
				var26 = 0.0F;
			} else {
				var26 = var18 / var19;
			}
			float var27 = var16 * var19 - var18 * var17;
			if (var27 != 0.0F) {
				float var28 = (var20 * var19 - var21 * var17) / var27;
				float var29 = (var21 * var16 - var20 * var18) / var27;
				float var30 = (var22 * var19 - var23 * var17) / var27;
				float var31 = (var23 * var16 - var22 * var18) / var27;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt397)) {
						if (arg4 > (float) this.anInt397) {
							arg4 = this.anInt397;
						}
						if (arg5 > (float) this.anInt397) {
							arg5 = this.anInt397;
						}
						arg12 = arg12 - var28 * arg6 + var28;
						arg9 = arg9 - var30 * arg6 + var30;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - var26 * arg3;
								arg6 -= var25 * arg3;
								arg12 -= var29 * arg3;
								arg9 -= var31 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= var24 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && var26 < var25 || arg3 == arg4 && var26 > var24) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, var28, arg9, var30);
									arg8 += var26;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg7, arg12, var28, arg9, var30);
									arg8 += var26;
									arg7 += var24;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, var28, arg9, var30);
									arg8 += var26;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg7, (int) arg8, arg12, var28, arg9, var30);
									arg8 += var26;
									arg7 += var24;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - var26 * arg3;
								arg6 -= var25 * arg3;
								arg12 -= var29 * arg3;
								arg9 -= var31 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= var24 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && var26 < var25 || arg3 == arg5 && var24 > var25) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg7, (int) arg6, arg12, var28, arg9, var30);
									arg7 += var26;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
								while (--arg4 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg8, (int) arg6, arg12, var28, arg9, var30);
									arg8 += var24;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray389[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg7, arg12, var28, arg9, var30);
									arg7 += var26;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
								while (--arg4 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg3, 0, 0, (int) arg6, (int) arg8, arg12, var28, arg9, var30);
									arg8 += var24;
									arg6 += var25;
									arg12 += var29;
									arg9 += var31;
									arg3 += this.anInt400;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt397)) {
						if (arg5 > (float) this.anInt397) {
							arg5 = this.anInt397;
						}
						if (arg3 > (float) this.anInt397) {
							arg3 = this.anInt397;
						}
						arg13 = arg13 - var28 * arg7 + var28;
						arg10 = arg10 - var30 * arg7 + var30;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - var25 * arg4;
								arg7 -= var24 * arg4;
								arg13 -= var29 * arg4;
								arg10 -= var31 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= var26 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && var25 < var24 || arg4 == arg5 && var25 > var26) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, var28, arg10, var30);
									arg6 += var25;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
								while (--arg3 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg8, arg13, var28, arg10, var30);
									arg6 += var25;
									arg8 += var26;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, var28, arg10, var30);
									arg6 += var25;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
								while (--arg3 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg8, (int) arg6, arg13, var28, arg10, var30);
									arg6 += var25;
									arg8 += var26;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - var25 * arg4;
								arg7 -= var24 * arg4;
								arg13 -= var29 * arg4;
								arg10 -= var31 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= var26 * arg3;
								arg3 = 0.0F;
							}
							if (var25 < var24) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg8, (int) arg7, arg13, var28, arg10, var30);
									arg8 += var25;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg6, (int) arg7, arg13, var28, arg10, var30);
									arg6 += var26;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray389[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg8, arg13, var28, arg10, var30);
									arg8 += var25;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
								while (--arg5 >= 0.0F) {
									this.method535(arg1, arg2, this.anIntArray401, (int) arg4, 0, 0, (int) arg7, (int) arg6, arg13, var28, arg10, var30);
									arg6 += var26;
									arg7 += var24;
									arg13 += var29;
									arg10 += var31;
									arg4 += this.anInt400;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt397)) {
					if (arg3 > (float) this.anInt397) {
						arg3 = this.anInt397;
					}
					if (arg4 > (float) this.anInt397) {
						arg4 = this.anInt397;
					}
					arg14 = arg14 - var28 * arg8 + var28;
					arg11 = arg11 - var30 * arg8 + var30;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - var24 * arg5;
							arg8 -= var26 * arg5;
							arg14 -= var29 * arg5;
							arg11 -= var31 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= var25 * arg3;
							arg3 = 0.0F;
						}
						if (var24 < var26) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, var28, arg11, var30);
								arg7 += var24;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
							while (--arg4 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg6, arg14, var28, arg11, var30);
								arg7 += var24;
								arg6 += var25;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, var28, arg11, var30);
								arg7 += var24;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
							while (--arg4 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg6, (int) arg7, arg14, var28, arg11, var30);
								arg7 += var24;
								arg6 += var25;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - var24 * arg5;
							arg8 -= var26 * arg5;
							arg14 -= var29 * arg5;
							arg11 -= var31 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= var25 * arg4;
							arg4 = 0.0F;
						}
						if (var24 < var26) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg6, (int) arg8, arg14, var28, arg11, var30);
								arg6 += var24;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
							while (--arg3 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg7, (int) arg8, arg14, var28, arg11, var30);
								arg7 += var25;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray389[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg6, arg14, var28, arg11, var30);
								arg6 += var24;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
							while (--arg3 >= 0.0F) {
								this.method535(arg1, arg2, this.anIntArray401, (int) arg5, 0, 0, (int) arg8, (int) arg7, arg14, var28, arg11, var30);
								arg7 += var25;
								arg8 += var26;
								arg14 += var29;
								arg11 += var31;
								arg5 += this.anInt400;
							}
						}
					}
				}
			}
		}
	}

	public final void method545(boolean arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) {
		if (this.aBoolean387) {
			if (arg7 > this.anInt396) {
				arg7 = this.anInt396;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var35;
		int var36;
		float var39;
		float var40;
		float var41;
		int var54;
		if (this.aBoolean419) {
			arg3 += arg6;
			arg10 += arg11 * (float) arg6;
			arg12 += arg13 * (float) arg6;
			arg14 += arg15 * (float) arg6;
			if (this.aBoolean384) {
				var54 = arg7 - arg6 >> 2;
				var39 = arg11 * 4.0F;
				var40 = arg13 * 4.0F;
				var41 = arg15 * 4.0F;
				if (this.anInt402 == 0) {
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var36 = arg3 + 1;
							arg2[arg3] = var35;
							arg2[var36++] = var35;
							arg2[var36++] = var35;
							arg3 = var36 + 1;
							arg2[var36] = var35;
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg2[arg3++] = var35;
							var54--;
						} while (var54 > 0);
					}
				} else if (this.aBoolean383) {
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var36 = arg3 + 1;
							var20 = arg2[arg3];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
							var21 = var36++;
							int var24 = arg2[var21];
							int var25 = var35 + var24;
							int var26 = (var35 & 0xFF00FF) + (var24 & 0xFF00FF);
							int var43 = (var26 & 0x1000100) + (var25 - var26 & 0x10000);
							arg2[var21] = var25 - var43 | 0xFF000000 | var43 - (var43 >>> 8);
							int var44 = var36++;
							int var28 = arg2[var44];
							int var29 = var35 + var28;
							int var30 = (var35 & 0xFF00FF) + (var28 & 0xFF00FF);
							int var45 = (var30 & 0x1000100) + (var29 - var30 & 0x10000);
							arg2[var44] = var29 - var45 | 0xFF000000 | var45 - (var45 >>> 8);
							arg3 = var36 + 1;
							int var32 = arg2[var36];
							int var33 = var35 + var32;
							int var34 = (var35 & 0xFF00FF) + (var32 & 0xFF00FF);
							int var47 = (var34 & 0x1000100) + (var33 - var34 & 0x10000);
							arg2[var36] = var33 - var47 | 0xFF000000 | var47 - (var47 >>> 8);
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							var18 = arg3++;
							var20 = arg2[var18];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[var18] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
							var54--;
						} while (var54 > 0);
					}
				} else {
					var17 = this.anInt402;
					var18 = 256 - this.anInt402;
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
							var19 = arg2[arg3];
							if (arg1) {
								var36 = arg3 + 1;
								arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg2[var36++] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg2[var36++] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg3 = var36 + 1;
								arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								var36 = arg3 + 1;
								arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg2[var36++] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg2[var36++] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								var19 = arg2[var36];
								arg3 = var36 + 1;
								arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
						do {
							var19 = arg2[arg3];
							if (arg1) {
								arg2[arg3++] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[arg3++] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
							var54--;
						} while (var54 > 0);
					}
				}
			} else {
				var54 = arg7 - arg6;
				if (this.anInt402 == 0) {
					do {
						arg2[arg3++] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var54--;
					} while (var54 > 0);
				} else if (this.aBoolean383) {
					do {
						var18 = arg3++;
						var19 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						var20 = arg2[var18];
						var21 = var19 + var20;
						var22 = (var19 & 0xFF00FF) + (var20 & 0xFF00FF);
						var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
						arg2[var18] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var54--;
					} while (var54 > 0);
				} else {
					var17 = this.anInt402;
					var18 = 256 - this.anInt402;
					do {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
						var19 = arg2[arg3];
						if (arg1) {
							arg2[arg3++] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
						} else {
							arg2[arg3++] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
						}
						var54--;
					} while (var54 > 0);
				}
			}
			return;
		}
		arg3 += arg6 - 1;
		arg8 += arg9 * (float) arg6;
		arg10 += arg11 * (float) arg6;
		arg12 += arg13 * (float) arg6;
		arg14 += arg15 * (float) arg6;
		float var38;
		if (this.aClass6_415.aBoolean111) {
			if (this.aBoolean384) {
				var54 = arg7 - arg6 >> 2;
				var39 = arg11 * 4.0F;
				var40 = arg13 * 4.0F;
				var41 = arg15 * 4.0F;
				if (this.anInt402 == 0) {
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var36 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray388[var36]) {
								arg2[var36] = var35;
								if (arg0) {
									this.aFloatArray388[var36] = arg8;
								}
							}
							var38 = arg8 + arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								arg2[var36] = var35;
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								arg2[var36] = var35;
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							arg3 = var36 + 1;
							if (!arg0 || var38 < this.aFloatArray388[arg3]) {
								arg2[arg3] = var35;
								if (arg0) {
									this.aFloatArray388[arg3] = var38;
								}
							}
							arg8 = var38 + arg9;
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
								arg2[arg3] = var35;
								if (arg0) {
									this.aFloatArray388[arg3] = arg8;
								}
							}
							arg8 += arg9;
							var54--;
						} while (var54 > 0);
					}
				} else if (this.aBoolean383) {
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var36 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray388[var36]) {
								var20 = arg2[var36];
								var21 = var35 + var20;
								var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
								var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
								arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
								if (arg0) {
									this.aFloatArray388[var36] = arg8;
								}
							}
							var38 = arg8 + arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								var20 = arg2[var36];
								var21 = var35 + var20;
								var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
								var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
								arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								var20 = arg2[var36];
								var21 = var35 + var20;
								var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
								var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
								arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							arg3 = var36 + 1;
							if (!arg0 || var38 < this.aFloatArray388[arg3]) {
								var20 = arg2[arg3];
								var21 = var35 + var20;
								var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
								var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
								arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
								if (arg0) {
									this.aFloatArray388[arg3] = var38;
								}
							}
							arg8 = var38 + arg9;
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
								var20 = arg2[arg3];
								var21 = var35 + var20;
								var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
								var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
								arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
								if (arg0) {
									this.aFloatArray388[arg3] = arg8;
								}
							}
							arg8 += arg9;
							var54--;
						} while (var54 > 0);
					}
				} else {
					var17 = this.anInt402;
					var18 = 256 - this.anInt402;
					if (var54 > 0) {
						do {
							var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							arg10 += var39;
							arg12 += var40;
							arg14 += var41;
							var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
							var36 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray388[var36]) {
								var19 = arg2[var36];
								if (arg1) {
									arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								} else {
									arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var36] = arg8;
								}
							}
							var38 = arg8 + arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								var19 = arg2[var36];
								if (arg1) {
									arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								} else {
									arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							var36++;
							if (!arg0 || var38 < this.aFloatArray388[var36]) {
								var19 = arg2[var36];
								if (arg1) {
									arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								} else {
									arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[var36] = var38;
								}
							}
							var38 += arg9;
							arg3 = var36 + 1;
							if (!arg0 || var38 < this.aFloatArray388[arg3]) {
								var19 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[arg3] = var38;
								}
							}
							arg8 = var38 + arg9;
							var54--;
						} while (var54 > 0);
					}
					var54 = arg7 - arg6 & 0x3;
					if (var54 > 0) {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
								var19 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray388[arg3] = arg8;
								}
							}
							arg8 += arg9;
							var54--;
						} while (var54 > 0);
					}
				}
			} else {
				var54 = arg7 - arg6;
				if (this.anInt402 == 0) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							if (arg0) {
								this.aFloatArray388[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var54--;
					} while (var54 > 0);
				} else if (this.aBoolean383) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							var19 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							var20 = arg2[arg3];
							var21 = var19 + var20;
							var22 = (var19 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
							if (arg0) {
								this.aFloatArray388[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var54--;
					} while (var54 > 0);
				} else {
					var17 = this.anInt402;
					var18 = 256 - this.anInt402;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
							var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
							var19 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray388[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						arg14 += arg15;
						var54--;
					} while (var54 > 0);
				}
			}
		} else if (this.aBoolean384) {
			var54 = arg7 - arg6 >> 2;
			var39 = arg11 * 4.0F;
			var40 = arg13 * 4.0F;
			var41 = arg15 * 4.0F;
			if (this.anInt402 == 0) {
				if (var54 > 0) {
					do {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += var39;
						arg12 += var40;
						arg14 += var41;
						var36 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray388[var36]) {
							arg2[var36] = var35;
						}
						var38 = arg8 + arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							arg2[var36] = var35;
						}
						var38 += arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							arg2[var36] = var35;
						}
						var38 += arg9;
						arg3 = var36 + 1;
						if (!arg0 || var38 < this.aFloatArray388[arg3]) {
							arg2[arg3] = var35;
						}
						arg8 = var38 + arg9;
						var54--;
					} while (var54 > 0);
				}
				var54 = arg7 - arg6 & 0x3;
				if (var54 > 0) {
					var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							arg2[arg3] = var35;
						}
						arg8 += arg9;
						var54--;
					} while (var54 > 0);
				}
			} else if (this.aBoolean383) {
				if (var54 > 0) {
					do {
						var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += var39;
						arg12 += var40;
						arg14 += var41;
						var36 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray388[var36]) {
							var20 = arg2[var36];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						}
						var38 = arg8 + arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							var20 = arg2[var36];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						}
						var38 += arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							var20 = arg2[var36];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[var36] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						}
						var38 += arg9;
						arg3 = var36 + 1;
						if (!arg0 || var38 < this.aFloatArray388[arg3]) {
							var20 = arg2[arg3];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						}
						arg8 = var38 + arg9;
						var54--;
					} while (var54 > 0);
				}
				var54 = arg7 - arg6 & 0x3;
				if (var54 > 0) {
					var35 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							var20 = arg2[arg3];
							var21 = var35 + var20;
							var22 = (var35 & 0xFF00FF) + (var20 & 0xFF00FF);
							var20 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
							arg2[arg3] = var21 - var20 | 0xFF000000 | var20 - (var20 >>> 8);
						}
						arg8 += arg9;
						var54--;
					} while (var54 > 0);
				}
			} else {
				var17 = this.anInt402;
				var18 = 256 - this.anInt402;
				if (var54 > 0) {
					do {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						arg10 += var39;
						arg12 += var40;
						arg14 += var41;
						var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
						var36 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray388[var36]) {
							var19 = arg2[var36];
							if (arg1) {
								arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
						}
						var38 = arg8 + arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							var19 = arg2[var36];
							if (arg1) {
								arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
						}
						var38 += arg9;
						var36++;
						if (!arg0 || var38 < this.aFloatArray388[var36]) {
							var19 = arg2[var36];
							if (arg1) {
								arg2[var36] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[var36] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
						}
						var38 += arg9;
						arg3 = var36 + 1;
						if (!arg0 || var38 < this.aFloatArray388[arg3]) {
							var19 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
						}
						arg8 = var38 + arg9;
						var54--;
					} while (var54 > 0);
				}
				var54 = arg7 - arg6 & 0x3;
				if (var54 > 0) {
					var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					var35 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
							var19 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (var18 | var19 >> 24) << 24 | var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = var35 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
							}
						}
						arg8 += arg9;
						var54--;
					} while (var54 > 0);
				}
			}
		} else {
			var54 = arg7 - arg6;
			if (this.anInt402 == 0) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
						arg2[arg3] = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					var54--;
				} while (var54 > 0);
			} else if (this.aBoolean383) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
						var19 = (int) arg10 & 0xFF0000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						var20 = arg2[arg3];
						var21 = var19 + var20;
						var22 = (var19 & 0xFF00FF) + (var20 & 0xFF00FF);
						int var42 = (var22 & 0x1000100) + (var21 - var22 & 0x10000);
						arg2[arg3] = var21 - var42 | 0xFF000000 | var42 - (var42 >>> 8);
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					var54--;
				} while (var54 > 0);
			} else {
				var17 = this.anInt402;
				var18 = 256 - this.anInt402;
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray388[arg3]) {
						var35 = (int) arg10 & 0xFF0000 | 0xFF000000 | (int) arg12 & 0xFF00 | (int) arg14 & 0xFF;
						int var37 = ((var35 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var35 & 0xFF00) * var18 >> 8 & 0xFF00);
						var19 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (var18 | var19 >> 24) << 24 | var37 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = var37 + ((var19 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var17 >> 8 & 0xFF00);
						}
					}
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					arg14 += arg15;
					var54--;
				} while (var54 > 0);
			}
		}
	}

	public final void method546(boolean arg0, boolean arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, float arg16, float arg17, float arg18, float arg19, float arg20, int arg21, int arg22, int arg23, int arg24, float arg25, float arg26, float arg27, int arg28, float arg29, int arg30, float arg31, int arg32, float arg33) {
		if (!arg0) {
			this.method539(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt403 = arg24;
		float var35;
		int var36;
		if (arg3 > arg4 || arg3 > arg5) {
			if (arg4 <= arg5) {
				var35 = arg6;
				arg6 = arg7;
				arg7 = var35;
				float var95 = arg3;
				arg3 = arg4;
				arg4 = var95;
				float var96 = arg9;
				arg9 = arg10;
				arg10 = var96;
				float var97 = arg15;
				arg15 = arg16;
				arg16 = var97;
				float var98 = arg18;
				arg18 = arg19;
				arg19 = var98;
				float var100 = arg12;
				arg12 = arg13;
				arg13 = var100;
				float var101 = arg25;
				arg25 = arg26;
				arg26 = var101;
				float var102 = arg29;
				arg29 = arg31;
				arg31 = var102;
				var36 = arg21;
				arg21 = arg22;
				arg22 = var36;
				int var99 = arg28;
				arg28 = arg30;
				arg30 = var99;
			} else {
				var35 = arg6;
				arg6 = arg8;
				arg8 = var35;
				var35 = arg3;
				arg3 = arg5;
				arg5 = var35;
				var35 = arg9;
				arg9 = arg11;
				arg11 = var35;
				var35 = arg15;
				arg15 = arg17;
				arg17 = var35;
				var35 = arg18;
				arg18 = arg20;
				arg20 = var35;
				var35 = arg12;
				arg12 = arg14;
				arg14 = var35;
				var35 = arg25;
				arg25 = arg27;
				arg27 = var35;
				var35 = arg29;
				arg29 = arg33;
				arg33 = var35;
				var36 = arg21;
				arg21 = arg23;
				arg23 = var36;
				var36 = arg28;
				arg28 = arg32;
				arg32 = var36;
			}
		}
		int var104;
		if (arg28 != this.anInt404) {
			this.anIntArray399 = this.aClass_ra_Sub3_398.method5209(arg28);
			if (this.anIntArray399 == null) {
				this.anInt402 = 255 - (arg21 >> 24 & 0xFF);
				var104 = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_398.method5192(arg28), (byte) 1) & 0xFFFF];
				var36 = ((arg21 >> 16 & 0xFF) * (var104 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var104 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var104 & 0xFF) >> 8;
				this.method538(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class442.method5612(var36, arg24, arg25, -1027106511), Class442.method5612(var36, arg24, arg26, -1027106511), Class442.method5612(var36, arg24, arg27, -1027106511));
				return;
			}
			this.anInt406 = this.aClass_ra_Sub3_398.method5190(arg28);
			this.anInt407 = this.anInt406 - 1;
			this.aClass369_417 = this.aClass_ra_Sub3_398.method5191(arg28);
		}
		this.aFloat408 = arg29;
		if (arg30 != this.anInt413) {
			this.anIntArray412 = this.aClass_ra_Sub3_398.method5209(arg30);
			if (this.anIntArray412 == null) {
				this.anInt402 = 255 - (arg21 >> 24 & 0xFF);
				var104 = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_398.method5192(arg30), (byte) 1) & 0xFFFF];
				var36 = ((arg21 >> 16 & 0xFF) * (var104 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var104 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var104 & 0xFF) >> 8;
				this.method538(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class442.method5612(var36, arg24, arg25, -1027106511), Class442.method5612(var36, arg24, arg26, -1027106511), Class442.method5612(var36, arg24, arg27, -1027106511));
				return;
			}
			this.anInt409 = this.aClass_ra_Sub3_398.method5190(arg30);
			this.anInt393 = this.anInt409 - 1;
		}
		this.aFloat390 = arg31;
		if (arg32 != this.anInt416) {
			this.anIntArray385 = this.aClass_ra_Sub3_398.method5209(arg32);
			if (this.anIntArray385 == null) {
				this.anInt402 = 255 - (arg21 >> 24 & 0xFF);
				var104 = Console.anIntArray4263[Class356.modifyColor(this.aClass_ra_Sub3_398.method5192(arg32), (byte) 1) & 0xFFFF];
				var36 = ((arg21 >> 16 & 0xFF) * (var104 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (var104 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (var104 & 0xFF) >> 8;
				this.method538(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class442.method5612(var36, arg24, arg25, -1027106511), Class442.method5612(var36, arg24, arg26, -1027106511), Class442.method5612(var36, arg24, arg27, -1027106511));
				return;
			}
			this.anInt418 = this.aClass_ra_Sub3_398.method5190(arg32);
			this.anInt405 = this.anInt418 - 1;
		}
		this.aFloat386 = arg33;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		var35 = arg21 >> 24 & 0xFF;
		float var103 = (float) (arg22 >> 24 & 0xFF);
		float var37 = (float) (arg23 >> 24 & 0xFF);
		float var38 = (float) (arg21 >> 16 & 0xFF);
		float var39 = (float) (arg22 >> 16 & 0xFF);
		float var40 = (float) (arg23 >> 16 & 0xFF);
		float var41 = (float) (arg21 >> 8 & 0xFF);
		float var42 = (float) (arg22 >> 8 & 0xFF);
		float var43 = (float) (arg23 >> 8 & 0xFF);
		float var44 = (float) (arg21 & 0xFF);
		float var45 = (float) (arg22 & 0xFF);
		float var46 = (float) (arg23 & 0xFF);
		float var47 = 1.0F;
		float var48 = 0.0F;
		float var49 = 0.0F;
		float var50 = 0.0F;
		float var51 = 1.0F;
		float var52 = 0.0F;
		float var53 = 0.0F;
		float var54 = 0.0F;
		float var55 = 0.0F;
		float var56 = 0.0F;
		float var57 = 0.0F;
		float var58 = 0.0F;
		float var59 = 0.0F;
		float var60 = 0.0F;
		float var61 = 0.0F;
		float var62 = 0.0F;
		float var63 = 0.0F;
		float var64 = 0.0F;
		float var65;
		if (arg4 != arg3) {
			var65 = arg4 - arg3;
			var53 = (arg7 - arg6) / var65;
			var54 = (arg10 - arg9) / var65;
			var55 = (arg13 - arg12) / var65;
			var56 = (arg16 - arg15) / var65;
			var57 = (arg19 - arg18) / var65;
			var58 = (arg26 - arg25) / var65;
			var59 = (var103 - var35) / var65;
			var60 = (var39 - var38) / var65;
			var61 = (var42 - var41) / var65;
			var62 = (var45 - var44) / var65;
			var63 = (var48 - var47) / var65;
			var64 = (var51 - var50) / var65;
		}
		var65 = 0.0F;
		float var66 = 0.0F;
		float var67 = 0.0F;
		float var68 = 0.0F;
		float var69 = 0.0F;
		float var70 = 0.0F;
		float var71 = 0.0F;
		float var72 = 0.0F;
		float var73 = 0.0F;
		float var74 = 0.0F;
		float var75 = 0.0F;
		float var76 = 0.0F;
		float var77;
		if (arg5 != arg4) {
			var77 = arg5 - arg4;
			var65 = (arg8 - arg7) / var77;
			var66 = (arg11 - arg10) / var77;
			var67 = (arg14 - arg13) / var77;
			var68 = (arg17 - arg16) / var77;
			var69 = (arg20 - arg19) / var77;
			var70 = (arg27 - arg26) / var77;
			var71 = (var37 - var103) / var77;
			var72 = (var40 - var39) / var77;
			var73 = (var43 - var42) / var77;
			var74 = (var46 - var45) / var77;
			var75 = (var49 - var48) / var77;
			var76 = (var52 - var51) / var77;
		}
		var77 = 0.0F;
		float var78 = 0.0F;
		float var79 = 0.0F;
		float var80 = 0.0F;
		float var81 = 0.0F;
		float var82 = 0.0F;
		float var83 = 0.0F;
		float var84 = 0.0F;
		float var85 = 0.0F;
		float var86 = 0.0F;
		float var87 = 0.0F;
		float var88 = 0.0F;
		float var89;
		if (arg3 != arg5) {
			var89 = arg3 - arg5;
			var77 = (arg6 - arg8) / var89;
			var78 = (arg9 - arg11) / var89;
			var79 = (arg12 - arg14) / var89;
			var80 = (arg15 - arg17) / var89;
			var81 = (arg18 - arg20) / var89;
			var82 = (arg25 - arg27) / var89;
			var83 = (var35 - var37) / var89;
			var84 = (var38 - var40) / var89;
			var85 = (var41 - var43) / var89;
			var86 = (var44 - var46) / var89;
			var87 = (var47 - var49) / var89;
			var88 = (var50 - var52) / var89;
		}
		if (arg3 >= (float) this.anInt397) {
			return;
		}
		if (arg4 > (float) this.anInt397) {
			arg4 = this.anInt397;
		}
		if (arg5 > (float) this.anInt397) {
			arg5 = this.anInt397;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			var89 = var35;
			float var90 = var38;
			float var91 = var41;
			float var92 = var44;
			float var93 = var47;
			float var94 = var50;
			if (arg3 < 0.0F) {
				arg6 -= var53 * arg3;
				arg7 -= var77 * arg3;
				arg9 -= var54 * arg3;
				arg10 -= var78 * arg3;
				arg12 -= var55 * arg3;
				arg13 -= var79 * arg3;
				arg15 -= var56 * arg3;
				arg16 -= var80 * arg3;
				arg18 -= var57 * arg3;
				arg19 -= var81 * arg3;
				arg25 -= var58 * arg3;
				arg26 -= var82 * arg3;
				var35 -= var59 * arg3;
				var89 -= var83 * arg3;
				var38 -= var60 * arg3;
				var90 -= var84 * arg3;
				var41 -= var61 * arg3;
				var91 -= var85 * arg3;
				var44 -= var62 * arg3;
				var92 -= var86 * arg3;
				var47 -= var63 * arg3;
				var93 -= var87 * arg3;
				var50 -= var64 * arg3;
				var94 -= var88 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= var65 * arg5;
				arg11 -= var66 * arg5;
				arg14 -= var67 * arg5;
				arg17 -= var68 * arg5;
				arg20 -= var69 * arg5;
				arg27 -= var70 * arg5;
				var37 -= var71 * arg5;
				var40 -= var72 * arg5;
				var43 -= var73 * arg5;
				var46 -= var74 * arg5;
				var49 -= var75 * arg5;
				var52 -= var76 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && var77 < var53 || arg3 == arg5 && var65 > var53) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray389[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, var89, var35, var90, var38, var91, var41, var92, var44, var93, var47, var94, var50);
					arg6 += var53;
					arg7 += var77;
					arg9 += var54;
					arg10 += var78;
					arg12 += var55;
					arg13 += var79;
					arg15 += var56;
					arg16 += var80;
					arg18 += var57;
					arg19 += var81;
					arg25 += var58;
					arg26 += var82;
					var35 += var59;
					var89 += var83;
					var38 += var60;
					var90 += var84;
					var41 += var61;
					var91 += var85;
					var44 += var62;
					var92 += var86;
					var47 += var63;
					var93 += var87;
					var50 += var64;
					var94 += var88;
					arg3 += this.anInt400;
				}
				while (--arg4 >= 0.0F) {
					this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50);
					arg8 += var65;
					arg6 += var53;
					arg11 += var66;
					arg9 += var54;
					arg14 += var67;
					arg12 += var55;
					arg17 += var68;
					arg15 += var56;
					arg20 += var69;
					arg18 += var57;
					arg27 += var70;
					arg25 += var58;
					var37 += var71;
					var35 += var59;
					var40 += var72;
					var38 += var60;
					var43 += var73;
					var41 += var61;
					var46 += var74;
					var44 += var62;
					var49 += var75;
					var47 += var63;
					var52 += var76;
					var50 += var64;
					arg3 += this.anInt400;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray389[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, var35, var89, var38, var90, var41, var91, var44, var92, var47, var93, var50, var94);
					arg7 += var77;
					arg6 += var53;
					arg10 += var78;
					arg9 += var54;
					arg13 += var79;
					arg12 += var55;
					arg16 += var80;
					arg15 += var56;
					arg19 += var81;
					arg18 += var57;
					arg26 += var82;
					arg25 += var58;
					var89 += var83;
					var35 += var59;
					var90 += var84;
					var38 += var60;
					var91 += var85;
					var41 += var61;
					var92 += var86;
					var44 += var62;
					var93 += var87;
					var47 += var63;
					var94 += var88;
					var50 += var64;
					arg3 += this.anInt400;
				}
				while (--arg4 >= 0.0F) {
					this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52);
					arg6 += var53;
					arg8 += var65;
					arg9 += var54;
					arg11 += var66;
					arg12 += var55;
					arg14 += var67;
					arg15 += var56;
					arg17 += var68;
					arg18 += var57;
					arg20 += var69;
					arg25 += var58;
					arg27 += var70;
					var35 += var59;
					var37 += var71;
					var38 += var60;
					var40 += var72;
					var41 += var61;
					var43 += var73;
					var44 += var62;
					var46 += var74;
					var47 += var63;
					var49 += var75;
					var50 += var64;
					var52 += var76;
					arg3 += this.anInt400;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		var37 = var35;
		var40 = var38;
		var43 = var41;
		var46 = var44;
		var49 = var47;
		var52 = var50;
		if (arg3 < 0.0F) {
			arg6 -= var53 * arg3;
			arg8 -= var77 * arg3;
			arg9 -= var54 * arg3;
			arg11 -= var78 * arg3;
			arg12 -= var55 * arg3;
			arg14 -= var79 * arg3;
			arg15 -= var56 * arg3;
			arg17 -= var80 * arg3;
			arg18 -= var57 * arg3;
			arg20 -= var81 * arg3;
			arg25 -= var58 * arg3;
			arg27 -= var82 * arg3;
			var35 -= var59 * arg3;
			var37 -= var83 * arg3;
			var38 -= var60 * arg3;
			var40 -= var84 * arg3;
			var41 -= var61 * arg3;
			var43 -= var85 * arg3;
			var44 -= var62 * arg3;
			var46 -= var86 * arg3;
			var47 -= var63 * arg3;
			var49 -= var87 * arg3;
			var50 -= var64 * arg3;
			var52 -= var88 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= var65 * arg4;
			arg10 -= var66 * arg4;
			arg13 -= var67 * arg4;
			arg16 -= var68 * arg4;
			arg19 -= var69 * arg4;
			arg26 -= var70 * arg4;
			var103 -= var71 * arg4;
			var39 -= var72 * arg4;
			var42 -= var73 * arg4;
			var45 -= var74 * arg4;
			var48 -= var75 * arg4;
			var51 -= var76 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || var77 >= var53) && (arg3 != arg4 || var77 <= var65)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray389[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52);
				arg6 += var53;
				arg8 += var77;
				arg9 += var54;
				arg11 += var78;
				arg12 += var55;
				arg14 += var79;
				arg15 += var56;
				arg17 += var80;
				arg18 += var57;
				arg20 += var81;
				arg25 += var58;
				arg27 += var82;
				var35 += var59;
				var37 += var83;
				var38 += var60;
				var40 += var84;
				var41 += var61;
				var43 += var85;
				var44 += var62;
				var46 += var86;
				var47 += var63;
				var49 += var87;
				var50 += var64;
				var52 += var88;
				arg3 += this.anInt400;
			}
			while (--arg5 >= 0.0F) {
				this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, var103, var37, var39, var40, var42, var43, var45, var46, var48, var49, var51, var52);
				arg7 += var65;
				arg8 += var77;
				arg10 += var66;
				arg11 += var78;
				arg13 += var67;
				arg14 += var79;
				arg16 += var68;
				arg17 += var80;
				arg19 += var69;
				arg20 += var81;
				arg26 += var70;
				arg27 += var82;
				var103 += var71;
				var37 += var83;
				var39 += var72;
				var40 += var84;
				var42 += var73;
				var43 += var85;
				var45 += var74;
				var46 += var86;
				var48 += var75;
				var49 += var87;
				var51 += var76;
				var52 += var88;
				arg3 += this.anInt400;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray389[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50);
			arg6 += var53;
			arg8 += var77;
			arg9 += var54;
			arg11 += var78;
			arg12 += var55;
			arg14 += var79;
			arg15 += var56;
			arg17 += var80;
			arg18 += var57;
			arg20 += var81;
			arg25 += var58;
			arg27 += var82;
			var35 += var59;
			var37 += var83;
			var38 += var60;
			var40 += var84;
			var41 += var61;
			var43 += var85;
			var44 += var62;
			var46 += var86;
			var47 += var63;
			var49 += var87;
			var50 += var64;
			var52 += var88;
			arg3 += this.anInt400;
		}
		while (--arg5 >= 0.0F) {
			this.method543(arg1, arg2, this.anIntArray401, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, var37, var103, var40, var39, var43, var42, var46, var45, var49, var48, var52, var51);
			arg7 += var65;
			arg8 += var77;
			arg10 += var66;
			arg11 += var78;
			arg13 += var67;
			arg14 += var79;
			arg16 += var68;
			arg17 += var80;
			arg19 += var69;
			arg20 += var81;
			arg26 += var70;
			arg27 += var82;
			var103 += var71;
			var37 += var83;
			var39 += var72;
			var40 += var84;
			var42 += var73;
			var43 += var85;
			var45 += var74;
			var46 += var86;
			var48 += var75;
			var49 += var87;
			var51 += var76;
			var52 += var88;
			arg3 += this.anInt400;
		}
	}
}
