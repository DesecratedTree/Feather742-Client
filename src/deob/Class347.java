package deob;

public class Class347 {

	public static int anInt3425 = -2000;

	public static int anInt3426 = 8;

	public static int anInt3427 = 39424;

	public static int anInt3428 = 1;

	public static int anInt3429 = 2;

	public static int anInt3430 = 12;

	public static int anInt3433 = 2000;

	public int anInt3432 = 0;

	public Class358 aClass358_3434;

	public int anInt3431;

	public Class347(Class358 arg0) {
		this.aClass358_3434 = arg0;
	}

	public final boolean method4017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 > 2000 || arg1 > 2000 || arg2 > 2000 || arg3 > 2000 || arg4 > 2000 || arg5 > 2000) {
			return false;
		} else if (arg0 >= -2000 && arg1 >= -2000 && arg2 >= -2000 && arg3 >= -2000 && arg4 >= -2000 && arg5 >= -2000) {
			int var10;
			if (this.anInt3431 == 2) {
				var10 = arg3 + arg0 * this.aClass358_3434.anInt3733;
				if (var10 >= 0 && var10 < this.aClass358_3434.anIntArray3717.length && (arg6 << 8) - 39424 < this.aClass358_3434.anIntArray3717[var10]) {
					return false;
				}
				var10 = arg4 + arg1 * this.aClass358_3434.anInt3733;
				if (var10 >= 0 && var10 < this.aClass358_3434.anIntArray3717.length && (arg7 << 8) - 39424 < this.aClass358_3434.anIntArray3717[var10]) {
					return false;
				}
				var10 = arg5 + arg2 * this.aClass358_3434.anInt3733;
				if (var10 >= 0 && var10 < this.aClass358_3434.anIntArray3717.length && (arg8 << 8) - 39424 < this.aClass358_3434.anIntArray3717[var10]) {
					return false;
				}
			}
			var10 = arg4 - arg3;
			int var11 = arg1 - arg0;
			int var12 = arg5 - arg3;
			int var13 = arg2 - arg0;
			int var14 = arg7 - arg6;
			int var15 = arg8 - arg6;
			if (arg0 < arg1 && arg0 < arg2) {
				arg0--;
				if (arg1 > arg2) {
					arg1++;
				} else {
					arg2++;
				}
			} else if (arg1 < arg2) {
				arg1--;
				if (arg0 > arg2) {
					arg0++;
				} else {
					arg2++;
				}
			} else {
				arg2--;
				if (arg0 > arg1) {
					arg0++;
				} else {
					arg1++;
				}
			}
			int var16 = 0;
			if (arg1 != arg0) {
				var16 = (arg4 - arg3 << 12) / (arg1 - arg0);
			}
			int var17 = 0;
			if (arg2 != arg1) {
				var17 = (arg5 - arg4 << 12) / (arg2 - arg1);
			}
			int var18 = 0;
			if (arg2 != arg0) {
				var18 = (arg3 - arg5 << 12) / (arg0 - arg2);
			}
			int var19 = var10 * var13 - var12 * var11;
			if (var19 == 0) {
				return false;
			}
			int var20 = (var14 * var13 - var15 * var11 << 8) / var19;
			int var21 = (var15 * var10 - var14 * var12 << 8) / var19;
			if (arg0 <= arg1 && arg0 <= arg2) {
				if (arg0 >= this.aClass358_3434.anInt3725) {
					return true;
				}
				if (arg1 > this.aClass358_3434.anInt3725) {
					arg1 = this.aClass358_3434.anInt3725;
				}
				if (arg2 > this.aClass358_3434.anInt3725) {
					arg2 = this.aClass358_3434.anInt3725;
				}
				arg6 = (arg6 << 8) - var20 * arg3 + var20;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0xC;
					if (arg0 < 0) {
						arg5 -= var18 * arg0;
						arg3 -= var16 * arg0;
						arg6 -= var21 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= var17 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || var18 >= var16) && (arg0 != arg1 || var18 <= var17)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg5 += var18;
									arg4 += var17;
									arg6 += var21;
									arg0 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg5 += var18;
							arg3 += var16;
							arg6 += var21;
							arg0 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg5 += var18;
									arg4 += var17;
									arg6 += var21;
									arg0 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg5 += var18;
							arg3 += var16;
							arg6 += var21;
							arg0 += this.aClass358_3434.anInt3733;
						}
					}
				} else {
					arg4 = arg3 <<= 0xC;
					if (arg0 < 0) {
						arg4 -= var18 * arg0;
						arg3 -= var16 * arg0;
						arg6 -= var21 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0xC;
					if (arg2 < 0) {
						arg5 -= var17 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && var18 < var16 || arg0 == arg2 && var17 > var16) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg5 += var17;
									arg3 += var16;
									arg6 += var21;
									arg0 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg4 += var18;
							arg3 += var16;
							arg6 += var21;
							arg0 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg5 += var17;
									arg3 += var16;
									arg6 += var21;
									arg0 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg0, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg6, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg4 += var18;
							arg3 += var16;
							arg6 += var21;
							arg0 += this.aClass358_3434.anInt3733;
						}
					}
				}
			} else if (arg1 > arg2) {
				if (arg2 >= this.aClass358_3434.anInt3725) {
					return true;
				}
				if (arg0 > this.aClass358_3434.anInt3725) {
					arg0 = this.aClass358_3434.anInt3725;
				}
				if (arg1 > this.aClass358_3434.anInt3725) {
					arg1 = this.aClass358_3434.anInt3725;
				}
				arg8 = (arg8 << 8) - var20 * arg5 + var20;
				if (arg0 < arg1) {
					arg4 = arg5 <<= 0xC;
					if (arg2 < 0) {
						arg4 -= var17 * arg2;
						arg5 -= var18 * arg2;
						arg8 -= var21 * arg2;
						arg2 = 0;
					}
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= var16 * arg0;
						arg0 = 0;
					}
					if (var17 < var18) {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg4 += var17;
									arg3 += var16;
									arg8 += var21;
									arg2 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg4 += var17;
							arg5 += var18;
							arg8 += var21;
							arg2 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg4 += var17;
									arg3 += var16;
									arg8 += var21;
									arg2 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg4 += var17;
							arg5 += var18;
							arg8 += var21;
							arg2 += this.aClass358_3434.anInt3733;
						}
					}
				} else {
					arg3 = arg5 <<= 0xC;
					if (arg2 < 0) {
						arg3 -= var17 * arg2;
						arg5 -= var18 * arg2;
						arg8 -= var21 * arg2;
						arg2 = 0;
					}
					arg4 <<= 0xC;
					if (arg1 < 0) {
						arg4 -= var16 * arg1;
						arg1 = 0;
					}
					if (var17 < var18) {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg4 += var16;
									arg5 += var18;
									arg8 += var21;
									arg2 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg3 += var17;
							arg5 += var18;
							arg8 += var21;
							arg2 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg4 += var16;
									arg5 += var18;
									arg8 += var21;
									arg2 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg2, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg8, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg3 += var17;
							arg5 += var18;
							arg8 += var21;
							arg2 += this.aClass358_3434.anInt3733;
						}
					}
				}
			} else if (arg1 >= this.aClass358_3434.anInt3725) {
				return true;
			} else {
				if (arg2 > this.aClass358_3434.anInt3725) {
					arg2 = this.aClass358_3434.anInt3725;
				}
				if (arg0 > this.aClass358_3434.anInt3725) {
					arg0 = this.aClass358_3434.anInt3725;
				}
				arg7 = (arg7 << 8) - var20 * arg4 + var20;
				if (arg2 >= arg0) {
					arg5 = arg4 <<= 0xC;
					if (arg1 < 0) {
						arg5 -= var16 * arg1;
						arg4 -= var17 * arg1;
						arg7 -= var21 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0xC;
					if (arg0 < 0) {
						arg3 -= var18 * arg0;
						arg0 = 0;
					}
					if (var16 < var17) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg3 += var18;
									arg4 += var17;
									arg7 += var21;
									arg1 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg5 >> 12) - 1, (arg4 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg5 += var16;
							arg4 += var17;
							arg7 += var21;
							arg1 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg3 += var18;
									arg4 += var17;
									arg7 += var21;
									arg1 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg4 >> 12) - 1, (arg5 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg5 += var16;
							arg4 += var17;
							arg7 += var21;
							arg1 += this.aClass358_3434.anInt3733;
						}
					}
				} else {
					arg3 = arg4 <<= 0xC;
					if (arg1 < 0) {
						arg3 -= var16 * arg1;
						arg4 -= var17 * arg1;
						arg7 -= var21 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0xC;
					if (arg2 < 0) {
						arg5 -= var18 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || var16 >= var17) && (arg1 != arg2 || var16 <= var18)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg5 >> 12) - 1, (arg3 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg3 += var16;
									arg5 += var18;
									arg7 += var21;
									arg1 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg4 >> 12) - 1, (arg3 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg3 += var16;
							arg4 += var17;
							arg7 += var21;
							arg1 += this.aClass358_3434.anInt3733;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 *= this.aClass358_3434.anInt3733;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return true;
									}
									if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg3 >> 12) - 1, (arg5 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
										return false;
									}
									arg3 += var16;
									arg5 += var18;
									arg7 += var21;
									arg1 += this.aClass358_3434.anInt3733;
								}
							}
							if (!this.method4018(this.aClass358_3434.anIntArray3717, arg1, 0, (arg3 >> 12) - 1, (arg4 >> 12) + 1, arg7, var20, this.aClass358_3434.anInt3733)) {
								return false;
							}
							arg3 += var16;
							arg4 += var17;
							arg7 += var21;
							arg1 += this.aClass358_3434.anInt3733;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	public final boolean method4018(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg4 > arg7) {
			arg4 = arg7;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg3 >= arg4) {
			return true;
		}
		arg1 += arg3 - 1;
		int var11 = arg4 - arg3 >> 2;
		arg5 += arg6 * arg3;
		int var9;
		int var10;
		if (this.anInt3431 == 1) {
			this.anInt3432 += var11;
			while (true) {
				var11--;
				if (var11 < 0) {
					var11 = arg4 - arg3 & 0x3;
					while (true) {
						var11--;
						if (var11 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							arg0[arg1] = arg5;
						}
						arg5 += arg6;
					}
				}
				var9 = arg1 + 1;
				if (arg5 < arg0[var9]) {
					arg0[var9] = arg5;
				}
				var10 = arg5 + arg6;
				var9++;
				if (var10 < arg0[var9]) {
					arg0[var9] = var10;
				}
				var10 += arg6;
				var9++;
				if (var10 < arg0[var9]) {
					arg0[var9] = var10;
				}
				var10 += arg6;
				arg1 = var9 + 1;
				if (var10 < arg0[arg1]) {
					arg0[arg1] = var10;
				}
				arg5 = var10 + arg6;
			}
		} else {
			arg5 -= 39424;
			while (true) {
				var11--;
				if (var11 < 0) {
					var11 = arg4 - arg3 & 0x3;
					while (true) {
						var11--;
						if (var11 < 0) {
							return true;
						}
						arg1++;
						if (arg5 < arg0[arg1]) {
							return false;
						}
						arg5 += arg6;
					}
				}
				var9 = arg1 + 1;
				if (arg5 < arg0[var9]) {
					return false;
				}
				var10 = arg5 + arg6;
				var9++;
				if (var10 < arg0[var9]) {
					return false;
				}
				var10 += arg6;
				var9++;
				if (var10 < arg0[var9]) {
					return false;
				}
				var10 += arg6;
				arg1 = var9 + 1;
				if (var10 < arg0[arg1]) {
					return false;
				}
				arg5 = var10 + arg6;
			}
		}
	}
}
