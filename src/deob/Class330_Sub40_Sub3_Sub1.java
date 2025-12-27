package deob;

public class Class330_Sub40_Sub3_Sub1 extends Class330_Sub40_Sub3 {

	public int method3647(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.anInt9771 <= 0) {
				if (this.anInt9772 == 256 && (this.anInt9782 & 0xFF) == 0) {
					if (Class296.aBoolean3023) {
						return method3649(0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this);
					}
					return method3663(((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this);
				}
				if (Class296.aBoolean3023) {
					return method3657(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this, this.anInt9772, arg4);
				}
				return method3652(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this, this.anInt9772, arg4);
			}
			int var6 = arg1 + this.anInt9771;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.anInt9771 += arg1;
			if (this.anInt9772 == 256 && (this.anInt9782 & 0xFF) == 0) {
				if (Class296.aBoolean3023) {
					arg1 = method3653(0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this);
				} else {
					arg1 = method3655(((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this);
				}
			} else if (Class296.aBoolean3023) {
				arg1 = method3659(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this, this.anInt9772, arg4);
			} else {
				arg1 = method3658(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this, this.anInt9772, arg4);
			}
			this.anInt9771 -= arg1;
			if (this.anInt9771 != 0) {
				return arg1;
			}
		} while (!this.method3634(-966758736));
		return arg3;
	}

	public synchronized void method3564(int[] arg0, int arg1, int arg2) {
		if (this.anInt9773 == 0 && this.anInt9771 == 0) {
			this.method3555(arg2);
			return;
		}
		int var4 = this.anInt9777 << 8;
		int var5 = this.anInt9779 << 8;
		int var6 = ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135.length << 8;
		int var7 = var5 - var4;
		if (var7 <= 0) {
			this.anInt9781 = 0;
		}
		int var8 = arg1;
		int var10 = arg2 + arg1;
		if (this.anInt9782 < 0) {
			if (this.anInt9772 <= 0) {
				this.method3641((short) -11306);
				this.method3252(-1216290921);
				return;
			}
			this.anInt9782 = 0;
		}
		if (this.anInt9782 >= var6) {
			if (this.anInt9772 >= 0) {
				this.method3641((short) -10318);
				this.method3252(-1856722525);
				return;
			}
			this.anInt9782 = var6 - 1;
		}
		if (this.anInt9781 >= 0) {
			if (this.anInt9781 > 0) {
				if (this.aBoolean9784) {
					label94: {
						if (this.anInt9772 < 0) {
							var8 = this.method3648(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
							if (this.anInt9782 >= var4) {
								return;
							}
							this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							if (--this.anInt9781 == 0) {
								break label94;
							}
						}
						do {
							var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 - 1]);
							if (this.anInt9782 < var5) {
								return;
							}
							this.anInt9782 = var5 + var5 - 1 - this.anInt9782;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							if (--this.anInt9781 == 0) {
								break;
							}
							var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
							if (this.anInt9782 >= var4) {
								return;
							}
							this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
						} while (--this.anInt9781 != 0);
					}
				} else {
					int var9;
					if (this.anInt9772 < 0) {
						while (true) {
							var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 - 1]);
							if (this.anInt9782 >= var4) {
								return;
							}
							var9 = (var5 - 1 - this.anInt9782) / var7;
							if (var9 >= this.anInt9781) {
								this.anInt9782 += var7 * this.anInt9781;
								this.anInt9781 = 0;
								break;
							}
							this.anInt9782 += var7 * var9;
							this.anInt9781 -= var9;
						}
					} else {
						while (true) {
							var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
							if (this.anInt9782 < var5) {
								return;
							}
							var9 = (this.anInt9782 - var4) / var7;
							if (var9 >= this.anInt9781) {
								this.anInt9782 -= var7 * this.anInt9781;
								this.anInt9781 = 0;
								break;
							}
							this.anInt9782 -= var7 * var9;
							this.anInt9781 -= var9;
						}
					}
				}
			}
			if (this.anInt9772 < 0) {
				this.method3648(arg0, var8, 0, var10, 0);
				if (this.anInt9782 < 0) {
					this.anInt9782 = -1;
					this.method3641((short) 12391);
					this.method3252(-991108961);
				}
			} else {
				this.method3647(arg0, var8, var6, var10, 0);
				if (this.anInt9782 >= var6) {
					this.anInt9782 = var6;
					this.method3641((short) 1096);
					this.method3252(1175825406);
				}
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 < 0) {
				var8 = this.method3648(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
				if (this.anInt9782 >= var4) {
					return;
				}
				this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (true) {
				var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 - 1]);
				if (this.anInt9782 < var5) {
					break;
				}
				this.anInt9782 = var5 + var5 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
				if (this.anInt9782 >= var4) {
					break;
				}
				this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 < 0) {
			while (true) {
				var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 - 1]);
				if (this.anInt9782 >= var4) {
					break;
				}
				this.anInt9782 = var5 - 1 - (var5 - 1 - this.anInt9782) % var7;
			}
		} else {
			while (true) {
				var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777]);
				if (this.anInt9782 < var5) {
					break;
				}
				this.anInt9782 = var4 + (this.anInt9782 - var4) % var7;
			}
		}
	}

	public int method3648(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		do {
			if (this.anInt9771 <= 0) {
				if (this.anInt9772 == -256 && (this.anInt9782 & 0xFF) == 0) {
					if (Class296.aBoolean3023) {
						return method3651(0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this);
					}
					return method3664(((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this);
				}
				if (Class296.aBoolean3023) {
					return method3654(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this, this.anInt9772, arg4);
				}
				return method3650(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this, this.anInt9772, arg4);
			}
			int var6 = arg1 + this.anInt9771;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.anInt9771 += arg1;
			if (this.anInt9772 == -256 && (this.anInt9782 & 0xFF) == 0) {
				if (Class296.aBoolean3023) {
					arg1 = method3662(0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this);
				} else {
					arg1 = method3656(((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this);
				}
			} else if (Class296.aBoolean3023) {
				arg1 = method3661(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this, this.anInt9772, arg4);
			} else {
				arg1 = method3660(0, 0, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135, arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this, this.anInt9772, arg4);
			}
			this.anInt9771 -= arg1;
			if (this.anInt9771 != 0) {
				return arg1;
			}
		} while (!this.method3634(-2096043319));
		return arg3;
	}

	public static int method3649(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub1 arg10) {
		arg3 >>= 0x8;
		int var28 = arg9 >> 8;
		int var20 = arg5 << 2;
		int var24 = arg6 << 2;
		int var27;
		if ((var27 = arg4 + var28 - arg3) > arg8) {
			var27 = arg8;
		}
		arg4 <<= 0x1;
		var27 <<= 0x1;
		var27 -= 6;
		byte var11;
		int var18;
		while (arg4 < var27) {
			int var15 = arg3 + 1;
			var11 = arg1[arg3];
			var18 = arg4 + 1;
			arg2[arg4] += var11 * var20;
			int var19 = var18 + 1;
			arg2[var18] += var11 * var24;
			int var16 = var15 + 1;
			byte var12 = arg1[var15];
			int var21 = var19 + 1;
			arg2[var19] += var12 * var20;
			int var22 = var21 + 1;
			arg2[var21] += var12 * var24;
			int var17 = var16 + 1;
			byte var13 = arg1[var16];
			int var23 = var22 + 1;
			arg2[var22] += var13 * var20;
			int var25 = var23 + 1;
			arg2[var23] += var13 * var24;
			arg3 = var17 + 1;
			byte var14 = arg1[var17];
			int var26 = var25 + 1;
			arg2[var25] += var14 * var20;
			arg4 = var26 + 1;
			arg2[var26] += var14 * var24;
		}
		var27 += 6;
		while (arg4 < var27) {
			var11 = arg1[arg3++];
			var18 = arg4 + 1;
			arg2[arg4] += var11 * var20;
			arg4 = var18 + 1;
			arg2[var18] += var11 * var24;
		}
		arg10.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3650(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub1 arg10, int arg11, int arg12) {
		if (arg11 == 0 || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8) {
			arg7 = arg8;
		}
		int var15;
		int var10001;
		while (arg5 < arg7) {
			var15 = arg4 >> 8;
			byte var13 = arg2[var15 - 1];
			var10001 = arg5++;
			arg3[var10001] += ((var13 << 8) + (arg2[var15] - var13) * (arg4 & 0xFF)) * arg6 >> 6;
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8) {
			arg7 = arg8;
		}
		int var14 = arg12;
		var15 = arg11;
		while (arg5 < arg7) {
			var10001 = arg5++;
			arg3[var10001] += ((var14 << 8) + (arg2[arg4 >> 8] - var14) * (arg4 & 0xFF)) * arg6 >> 6;
			arg4 += var15;
		}
		arg10.anInt9782 = arg4;
		return arg5;
	}

	public static int method3651(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub1 arg10) {
		arg3 >>= 0x8;
		int var28 = arg9 >> 8;
		int var20 = arg5 << 2;
		int var24 = arg6 << 2;
		int var27;
		if ((var27 = arg4 + arg3 - (var28 - 1)) > arg8) {
			var27 = arg8;
		}
		arg4 <<= 0x1;
		var27 <<= 0x1;
		var27 -= 6;
		byte var11;
		int var18;
		while (arg4 < var27) {
			int var15 = arg3 - 1;
			var11 = arg1[arg3];
			var18 = arg4 + 1;
			arg2[arg4] += var11 * var20;
			int var19 = var18 + 1;
			arg2[var18] += var11 * var24;
			int var16 = var15 - 1;
			byte var12 = arg1[var15];
			int var21 = var19 + 1;
			arg2[var19] += var12 * var20;
			int var22 = var21 + 1;
			arg2[var21] += var12 * var24;
			int var17 = var16 - 1;
			byte var13 = arg1[var16];
			int var23 = var22 + 1;
			arg2[var22] += var13 * var20;
			int var25 = var23 + 1;
			arg2[var23] += var13 * var24;
			arg3 = var17 - 1;
			byte var14 = arg1[var17];
			int var26 = var25 + 1;
			arg2[var25] += var14 * var20;
			arg4 = var26 + 1;
			arg2[var26] += var14 * var24;
		}
		var27 += 6;
		while (arg4 < var27) {
			var11 = arg1[arg3--];
			var18 = arg4 + 1;
			arg2[arg4] += var11 * var20;
			arg4 = var18 + 1;
			arg2[var18] += var11 * var24;
		}
		arg10.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub1 arg10, int arg11, int arg12) {
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8) {
			arg7 = arg8;
		}
		byte var13;
		int var14;
		int var10001;
		while (arg5 < arg7) {
			var14 = arg4 >> 8;
			var13 = arg2[var14];
			var10001 = arg5++;
			arg3[var10001] += ((var13 << 8) + (arg2[var14 + 1] - var13) * (arg4 & 0xFF)) * arg6 >> 6;
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8) {
			arg7 = arg8;
		}
		var14 = arg12;
		while (arg5 < arg7) {
			var13 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += ((var13 << 8) + (var14 - var13) * (arg4 & 0xFF)) * arg6 >> 6;
			arg4 += arg11;
		}
		arg10.anInt9782 = arg4;
		return arg5;
	}

	public static int method3653(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class330_Sub40_Sub3_Sub1 arg12) {
		arg3 >>= 0x8;
		int var36 = arg11 >> 8;
		arg5 <<= 0x2;
		arg6 <<= 0x2;
		int var32 = arg7 << 2;
		int var34 = arg8 << 2;
		int var35;
		if ((var35 = arg4 + var36 - arg3) > arg10) {
			var35 = arg10;
		}
		arg12.anInt9775 += arg12.anInt9778 * (var35 - arg4);
		arg4 <<= 0x1;
		var35 <<= 0x1;
		var35 -= 6;
		byte var13;
		int var20;
		while (arg4 < var35) {
			int var17 = arg3 + 1;
			var13 = arg1[arg3];
			var20 = arg4 + 1;
			arg2[arg4] += var13 * arg5;
			int var23 = arg5 + var32;
			int var21 = var20 + 1;
			arg2[var20] += var13 * arg6;
			int var29 = arg6 + var34;
			int var18 = var17 + 1;
			byte var14 = arg1[var17];
			int var22 = var21 + 1;
			arg2[var21] += var14 * var23;
			int var25 = var23 + var32;
			int var24 = var22 + 1;
			arg2[var22] += var14 * var29;
			int var31 = var29 + var34;
			int var19 = var18 + 1;
			byte var15 = arg1[var18];
			int var26 = var24 + 1;
			arg2[var24] += var15 * var25;
			int var27 = var25 + var32;
			int var28 = var26 + 1;
			arg2[var26] += var15 * var31;
			int var33 = var31 + var34;
			arg3 = var19 + 1;
			byte var16 = arg1[var19];
			int var30 = var28 + 1;
			arg2[var28] += var16 * var27;
			arg5 = var27 + var32;
			arg4 = var30 + 1;
			arg2[var30] += var16 * var33;
			arg6 = var33 + var34;
		}
		var35 += 6;
		while (arg4 < var35) {
			var13 = arg1[arg3++];
			var20 = arg4 + 1;
			arg2[arg4] += var13 * arg5;
			arg5 += var32;
			arg4 = var20 + 1;
			arg2[var20] += var13 * arg6;
			arg6 += var34;
		}
		arg12.anInt9783 = arg5 >> 2;
		arg12.anInt9776 = arg6 >> 2;
		arg12.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public Class330_Sub40_Sub3_Sub1(Class330_Sub29_Sub1_Sub2 arg0, int arg1, int arg2, int arg3) {
		this.aClass330_Sub29_7770 = arg0;
		this.anInt9777 = arg0.anInt9588;
		this.anInt9779 = arg0.anInt9587;
		this.aBoolean9784 = arg0.aBoolean9589;
		this.anInt9772 = arg1;
		this.anInt9773 = arg2;
		this.anInt9774 = arg3;
		this.anInt9782 = 0;
		this.method3635((byte) 26);
	}

	public static int method3654(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub1 arg11, int arg12, int arg13) {
		if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg5 <<= 0x1;
		arg8 <<= 0x1;
		int var15;
		int var16;
		int var10001;
		int var17;
		while (arg5 < arg8) {
			var16 = arg4 >> 8;
			byte var14 = arg2[var16 - 1];
			var15 = (var14 << 8) + (arg2[var16] - var14) * (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += var15 * arg6 >> 6;
			int var18 = var17;
			arg5 = var17 + 1;
			arg3[var18] += var15 * arg7 >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg8 <<= 0x1;
		var16 = arg13;
		while (arg5 < arg8) {
			var15 = (var16 << 8) + (arg2[arg4 >> 8] - var16) * (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += var15 * arg6 >> 6;
			var10001 = var17;
			arg5 = var17 + 1;
			arg3[var10001] += var15 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt9782 = arg4;
		return arg5 >> 1;
	}

	public static int method3655(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Class330_Sub40_Sub3_Sub1 arg9) {
		arg2 >>= 0x8;
		int var18 = arg8 >> 8;
		arg4 <<= 0x2;
		int var15 = arg5 << 2;
		int var17;
		if ((var17 = arg3 + var18 - arg2) > arg7) {
			var17 = arg7;
		}
		arg9.anInt9783 += arg9.anInt9785 * (var17 - arg3);
		arg9.anInt9776 += arg9.anInt9780 * (var17 - arg3);
		var17 -= 3;
		int var10001;
		while (arg3 < var17) {
			var10001 = arg3++;
			int var10002 = arg1[var10001];
			int var10 = arg2 + 1;
			arg1[var10001] = var10002 + arg0[arg2] * arg4;
			int var13 = arg4 + var15;
			int var19 = arg3++;
			int var22 = arg1[var19];
			int var11 = var10 + 1;
			arg1[var19] = var22 + arg0[var10] * var13;
			int var14 = var13 + var15;
			int var20 = arg3++;
			int var23 = arg1[var20];
			int var12 = var11 + 1;
			arg1[var20] = var23 + arg0[var11] * var14;
			int var16 = var14 + var15;
			int var21 = arg3++;
			int var24 = arg1[var21];
			arg2 = var12 + 1;
			arg1[var21] = var24 + arg0[var12] * var16;
			arg4 = var16 + var15;
		}
		var17 += 3;
		while (arg3 < var17) {
			var10001 = arg3++;
			arg1[var10001] += arg0[arg2++] * arg4;
			arg4 += var15;
		}
		arg9.anInt9775 = arg4 >> 2;
		arg9.anInt9782 = arg2 << 8;
		return arg3;
	}

	public static int method3656(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Class330_Sub40_Sub3_Sub1 arg9) {
		arg2 >>= 0x8;
		int var18 = arg8 >> 8;
		arg4 <<= 0x2;
		int var15 = arg5 << 2;
		int var17;
		if ((var17 = arg3 + arg2 - (var18 - 1)) > arg7) {
			var17 = arg7;
		}
		arg9.anInt9783 += arg9.anInt9785 * (var17 - arg3);
		arg9.anInt9776 += arg9.anInt9780 * (var17 - arg3);
		var17 -= 3;
		int var10001;
		while (arg3 < var17) {
			var10001 = arg3++;
			int var10002 = arg1[var10001];
			int var10 = arg2 - 1;
			arg1[var10001] = var10002 + arg0[arg2] * arg4;
			int var13 = arg4 + var15;
			int var19 = arg3++;
			int var22 = arg1[var19];
			int var11 = var10 - 1;
			arg1[var19] = var22 + arg0[var10] * var13;
			int var14 = var13 + var15;
			int var20 = arg3++;
			int var23 = arg1[var20];
			int var12 = var11 - 1;
			arg1[var20] = var23 + arg0[var11] * var14;
			int var16 = var14 + var15;
			int var21 = arg3++;
			int var24 = arg1[var21];
			arg2 = var12 - 1;
			arg1[var21] = var24 + arg0[var12] * var16;
			arg4 = var16 + var15;
		}
		var17 += 3;
		while (arg3 < var17) {
			var10001 = arg3++;
			arg1[var10001] += arg0[arg2--] * arg4;
			arg4 += var15;
		}
		arg9.anInt9775 = arg4 >> 2;
		arg9.anInt9782 = arg2 << 8;
		return arg3;
	}

	public static int method3657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub1 arg11, int arg12, int arg13) {
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg5 <<= 0x1;
		arg8 <<= 0x1;
		byte var14;
		int var15;
		int var16;
		int var10001;
		int var17;
		while (arg5 < arg8) {
			var16 = arg4 >> 8;
			var14 = arg2[var16];
			var15 = (var14 << 8) + (arg2[var16 + 1] - var14) * (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += var15 * arg6 >> 6;
			int var18 = var17;
			arg5 = var17 + 1;
			arg3[var18] += var15 * arg7 >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg8 <<= 0x1;
		var16 = arg13;
		while (arg5 < arg8) {
			var14 = arg2[arg4 >> 8];
			var15 = (var14 << 8) + (var16 - var14) * (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += var15 * arg6 >> 6;
			var10001 = var17;
			arg5 = var17 + 1;
			arg3[var10001] += var15 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt9782 = arg4;
		return arg5 >> 1;
	}

	public static int method3658(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub1 arg11, int arg12, int arg13) {
		arg11.anInt9783 -= arg11.anInt9785 * arg5;
		arg11.anInt9776 -= arg11.anInt9780 * arg5;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
			arg8 = arg9;
		}
		byte var14;
		int var15;
		int var10001;
		while (arg5 < arg8) {
			var15 = arg4 >> 8;
			var14 = arg2[var15];
			var10001 = arg5++;
			arg3[var10001] += ((var14 << 8) + (arg2[var15 + 1] - var14) * (arg4 & 0xFF)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
			arg8 = arg9;
		}
		var15 = arg13;
		while (arg5 < arg8) {
			var14 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += ((var14 << 8) + (var15 - var14) * (arg4 & 0xFF)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		arg11.anInt9783 += arg11.anInt9785 * arg5;
		arg11.anInt9776 += arg11.anInt9780 * arg5;
		arg11.anInt9775 = arg6;
		arg11.anInt9782 = arg4;
		return arg5;
	}

	public static int method3659(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Class330_Sub40_Sub3_Sub1 arg13, int arg14, int arg15) {
		arg13.anInt9775 -= arg13.anInt9778 * arg5;
		if (arg14 == 0 || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg5 <<= 0x1;
		arg10 <<= 0x1;
		byte var16;
		int var17;
		int var10001;
		int var18;
		int var19;
		while (arg5 < arg10) {
			var18 = arg4 >> 8;
			var16 = arg2[var18];
			var17 = (var16 << 8) + (arg2[var18 + 1] - var16) * (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += var17 * arg6 >> 6;
			arg6 += arg8;
			int var20 = var19;
			arg5 = var19 + 1;
			arg3[var20] += var17 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg10 <<= 0x1;
		var18 = arg15;
		while (arg5 < arg10) {
			var16 = arg2[arg4 >> 8];
			var17 = (var16 << 8) + (var18 - var16) * (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += var17 * arg6 >> 6;
			arg6 += arg8;
			var10001 = var19;
			arg5 = var19 + 1;
			arg3[var10001] += var17 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		var19 = arg5 >> 1;
		arg13.anInt9775 += arg13.anInt9778 * var19;
		arg13.anInt9783 = arg6;
		arg13.anInt9776 = arg7;
		arg13.anInt9782 = arg4;
		return var19;
	}

	public static int method3660(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub1 arg11, int arg12, int arg13) {
		arg11.anInt9783 -= arg11.anInt9785 * arg5;
		arg11.anInt9776 -= arg11.anInt9780 * arg5;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		int var16;
		int var10001;
		while (arg5 < arg8) {
			var16 = arg4 >> 8;
			byte var14 = arg2[var16 - 1];
			var10001 = arg5++;
			arg3[var10001] += ((var14 << 8) + (arg2[var16] - var14) * (arg4 & 0xFF)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		int var15 = arg13;
		var16 = arg12;
		while (arg5 < arg8) {
			var10001 = arg5++;
			arg3[var10001] += ((var15 << 8) + (arg2[arg4 >> 8] - var15) * (arg4 & 0xFF)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += var16;
		}
		arg11.anInt9783 += arg11.anInt9785 * arg5;
		arg11.anInt9776 += arg11.anInt9780 * arg5;
		arg11.anInt9775 = arg6;
		arg11.anInt9782 = arg4;
		return arg5;
	}

	public static int method3661(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Class330_Sub40_Sub3_Sub1 arg13, int arg14, int arg15) {
		arg13.anInt9775 -= arg13.anInt9778 * arg5;
		if (arg14 == 0 || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg5 <<= 0x1;
		arg10 <<= 0x1;
		int var17;
		int var10001;
		int var18;
		int var19;
		while (arg5 < arg10) {
			var18 = arg4 >> 8;
			byte var16 = arg2[var18 - 1];
			var17 = (var16 << 8) + (arg2[var18] - var16) * (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += var17 * arg6 >> 6;
			arg6 += arg8;
			int var20 = var19;
			arg5 = var19 + 1;
			arg3[var20] += var17 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg10 <<= 0x1;
		var18 = arg15;
		while (arg5 < arg10) {
			var17 = (var18 << 8) + (arg2[arg4 >> 8] - var18) * (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += var17 * arg6 >> 6;
			arg6 += arg8;
			var10001 = var19;
			arg5 = var19 + 1;
			arg3[var10001] += var17 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		var19 = arg5 >> 1;
		arg13.anInt9775 += arg13.anInt9778 * var19;
		arg13.anInt9783 = arg6;
		arg13.anInt9776 = arg7;
		arg13.anInt9782 = arg4;
		return var19;
	}

	public static int method3662(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class330_Sub40_Sub3_Sub1 arg12) {
		arg3 >>= 0x8;
		int var36 = arg11 >> 8;
		arg5 <<= 0x2;
		arg6 <<= 0x2;
		int var32 = arg7 << 2;
		int var34 = arg8 << 2;
		int var35;
		if ((var35 = arg4 + arg3 - (var36 - 1)) > arg10) {
			var35 = arg10;
		}
		arg12.anInt9775 += arg12.anInt9778 * (var35 - arg4);
		arg4 <<= 0x1;
		var35 <<= 0x1;
		var35 -= 6;
		byte var13;
		int var20;
		while (arg4 < var35) {
			int var17 = arg3 - 1;
			var13 = arg1[arg3];
			var20 = arg4 + 1;
			arg2[arg4] += var13 * arg5;
			int var23 = arg5 + var32;
			int var21 = var20 + 1;
			arg2[var20] += var13 * arg6;
			int var29 = arg6 + var34;
			int var18 = var17 - 1;
			byte var14 = arg1[var17];
			int var22 = var21 + 1;
			arg2[var21] += var14 * var23;
			int var25 = var23 + var32;
			int var24 = var22 + 1;
			arg2[var22] += var14 * var29;
			int var31 = var29 + var34;
			int var19 = var18 - 1;
			byte var15 = arg1[var18];
			int var26 = var24 + 1;
			arg2[var24] += var15 * var25;
			int var27 = var25 + var32;
			int var28 = var26 + 1;
			arg2[var26] += var15 * var31;
			int var33 = var31 + var34;
			arg3 = var19 - 1;
			byte var16 = arg1[var19];
			int var30 = var28 + 1;
			arg2[var28] += var16 * var27;
			arg5 = var27 + var32;
			arg4 = var30 + 1;
			arg2[var30] += var16 * var33;
			arg6 = var33 + var34;
		}
		var35 += 6;
		while (arg4 < var35) {
			var13 = arg1[arg3--];
			var20 = arg4 + 1;
			arg2[arg4] += var13 * arg5;
			arg5 += var32;
			arg4 = var20 + 1;
			arg2[var20] += var13 * arg6;
			arg6 += var34;
		}
		arg12.anInt9783 = arg5 >> 2;
		arg12.anInt9776 = arg6 >> 2;
		arg12.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3663(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Class330_Sub40_Sub3_Sub1 arg8) {
		arg2 >>= 0x8;
		int var14 = arg7 >> 8;
		int var12 = arg4 << 2;
		int var13;
		if ((var13 = arg3 + var14 - arg2) > arg6) {
			var13 = arg6;
		}
		var13 -= 3;
		int var10001;
		while (arg3 < var13) {
			var10001 = arg3++;
			int var10002 = arg1[var10001];
			int var9 = arg2 + 1;
			arg1[var10001] = var10002 + arg0[arg2] * var12;
			int var15 = arg3++;
			int var18 = arg1[var15];
			int var10 = var9 + 1;
			arg1[var15] = var18 + arg0[var9] * var12;
			int var16 = arg3++;
			int var19 = arg1[var16];
			int var11 = var10 + 1;
			arg1[var16] = var19 + arg0[var10] * var12;
			int var17 = arg3++;
			int var20 = arg1[var17];
			arg2 = var11 + 1;
			arg1[var17] = var20 + arg0[var11] * var12;
		}
		var13 += 3;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[arg2++] * var12;
		}
		arg8.anInt9782 = arg2 << 8;
		return arg3;
	}

	public static int method3664(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Class330_Sub40_Sub3_Sub1 arg8) {
		arg2 >>= 0x8;
		int var14 = arg7 >> 8;
		int var12 = arg4 << 2;
		int var13;
		if ((var13 = arg3 + arg2 - (var14 - 1)) > arg6) {
			var13 = arg6;
		}
		var13 -= 3;
		int var10001;
		while (arg3 < var13) {
			var10001 = arg3++;
			int var10002 = arg1[var10001];
			int var9 = arg2 - 1;
			arg1[var10001] = var10002 + arg0[arg2] * var12;
			int var15 = arg3++;
			int var18 = arg1[var15];
			int var10 = var9 - 1;
			arg1[var15] = var18 + arg0[var9] * var12;
			int var16 = arg3++;
			int var19 = arg1[var16];
			int var11 = var10 - 1;
			arg1[var16] = var19 + arg0[var10] * var12;
			int var17 = arg3++;
			int var20 = arg1[var17];
			arg2 = var11 - 1;
			arg1[var17] = var20 + arg0[var11] * var12;
		}
		var13 += 3;
		while (arg3 < var13) {
			var10001 = arg3++;
			arg1[var10001] += arg0[arg2--] * var12;
		}
		arg8.anInt9782 = arg2 << 8;
		return arg3;
	}

	public synchronized void method3565(int[] arg0, int arg1, int arg2) {
		if (this.anInt9773 * 1089731647 * 1488581567 == 0 && this.anInt9771 * 807250037 * 424994781 == 0) {
			this.method3555(arg2);
			return;
		}
		int var4 = this.anInt9777 * 1968541983 * 216574687 << 8;
		int var5 = this.anInt9779 * -1955085031 * 2094253865 << 8;
		int var6 = ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135.length << 8;
		int var7 = var5 - var4;
		if (var7 <= 0) {
			this.anInt9781 = 0 * -1618882239;
		}
		int var8 = arg1;
		int var10 = arg2 + arg1;
		if (this.anInt9782 * 2144077895 * -558816905 < 0) {
			if (this.anInt9772 * -542430793 * 598541319 <= 0) {
				this.method3641((short) -26880);
				this.method3252(-649091226);
				return;
			}
			this.anInt9782 = 0 * -558816905;
		}
		if (this.anInt9782 * 2144077895 * -558816905 >= var6) {
			if (this.anInt9772 * -542430793 * 598541319 >= 0) {
				this.method3641((short) -624);
				this.method3252(-703831708);
				return;
			}
			this.anInt9782 = (var6 - 1) * 2144077895 * -558816905;
		}
		if (this.anInt9781 * 1578352321 * -1618882239 >= 0) {
			if (this.anInt9781 * 1578352321 * -1618882239 > 0) {
				if (this.aBoolean9784) {
					label94: {
						int var10002;
						if (this.anInt9772 * -542430793 * 598541319 < 0) {
							var8 = this.method3648(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
							if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
								return;
							}
							this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break label94;
							}
						}
						do {
							var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 * -1955085031 * 2094253865 - 1]);
							if (this.anInt9782 * 2144077895 * -558816905 < var5) {
								return;
							}
							this.anInt9782 = (var5 + var5 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
							if (var10002 * -1618882239 == 0) {
								break;
							}
							var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
							if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
								return;
							}
							this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							var10002 = this.anInt9781 * 1578352321 - 1578352321;
							this.anInt9781 = (this.anInt9781 * 1578352321 - 1578352321) * -1618882239;
						} while (var10002 * -1618882239 != 0);
					}
				} else {
					int var9;
					if (this.anInt9772 * -542430793 * 598541319 < 0) {
						while (true) {
							var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 * -1955085031 * 2094253865 - 1]);
							if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
								return;
							}
							var9 = (var5 - 1 - this.anInt9782 * 2144077895 * -558816905) / var7;
							if (var9 >= this.anInt9781 * 1578352321 * -1618882239) {
								this.anInt9782 = (this.anInt9782 * 2144077895 + var7 * this.anInt9781 * 1578352321 * -1618882239 * 2144077895) * -558816905;
								this.anInt9781 = 0 * -1618882239;
								break;
							}
							this.anInt9782 = (this.anInt9782 * 2144077895 + var7 * var9 * 2144077895) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var9 * 1578352321) * -1618882239;
						}
					} else {
						while (true) {
							var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
							if (this.anInt9782 * 2144077895 * -558816905 < var5) {
								return;
							}
							var9 = (this.anInt9782 * 2144077895 * -558816905 - var4) / var7;
							if (var9 >= this.anInt9781 * 1578352321 * -1618882239) {
								this.anInt9782 = (this.anInt9782 * 2144077895 - var7 * this.anInt9781 * 1578352321 * -1618882239 * 2144077895) * -558816905;
								this.anInt9781 = 0 * -1618882239;
								break;
							}
							this.anInt9782 = (this.anInt9782 * 2144077895 - var7 * var9 * 2144077895) * -558816905;
							this.anInt9781 = (this.anInt9781 * 1578352321 - var9 * 1578352321) * -1618882239;
						}
					}
				}
			}
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				this.method3648(arg0, var8, 0, var10, 0);
				if (this.anInt9782 * 2144077895 * -558816905 < 0) {
					this.anInt9782 = -558816905 * -2144077895;
					this.method3641((short) -8032);
					this.method3252(433347538);
				}
			} else {
				this.method3647(arg0, var8, var6, var10, 0);
				if (this.anInt9782 * 2144077895 * -558816905 >= var6) {
					this.anInt9782 = var6 * 2144077895 * -558816905;
					this.method3641((short) -12541);
					this.method3252(-1268888036);
				}
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				var8 = this.method3648(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					return;
				}
				this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (true) {
				var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 * -1955085031 * 2094253865 - 1]);
				if (this.anInt9782 * 2144077895 * -558816905 < var5) {
					break;
				}
				this.anInt9782 = (var5 + var5 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					break;
				}
				this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 * -542430793 * 598541319 < 0) {
			while (true) {
				var8 = this.method3648(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9779 * -1955085031 * 2094253865 - 1]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					break;
				}
				this.anInt9782 = (var5 - 1 - (var5 - 1 - this.anInt9782 * 2144077895 * -558816905) % var7) * 2144077895 * -558816905;
			}
		} else {
			while (true) {
				var8 = this.method3647(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub2) this.aClass330_Sub29_7770).aByteArray10135[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 < var5) {
					break;
				}
				this.anInt9782 = (var4 + (this.anInt9782 * 2144077895 * -558816905 - var4) % var7) * 2144077895 * -558816905;
			}
		}
	}
}
