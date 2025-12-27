package deob;

public class Class330_Sub40_Sub3_Sub2 extends Class330_Sub40_Sub3 {

	public static int anInt10175 = 128;

	public synchronized void method3564(int[] arg0, int arg1, int arg2) throws IllegalStateException {
		if (this.anInt9773 == 0 && this.anInt9771 == 0) {
			this.method3555(arg2);
			return;
		}
		int var4 = this.anInt9777 << 8;
		int var5 = this.anInt9779 << 8;
		int var6 = ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		int var7 = var5 - var4;
		if (var7 <= 0) {
			this.anInt9781 = 0;
		}
		int var8 = arg1;
		int var10 = arg2 + arg1;
		if (this.anInt9782 < 0) {
			if (this.anInt9772 <= 0) {
				this.method3641((short) 23176);
				this.method3252(-913250190);
				return;
			}
			this.anInt9782 = 0;
		}
		if (this.anInt9782 >= var6) {
			if (this.anInt9772 >= 0) {
				this.method3641((short) 20067);
				this.method3252(-1506814629);
				return;
			}
			this.anInt9782 = var6 - 1;
		}
		if (this.anInt9781 >= 0) {
			if (this.anInt9781 > 0) {
				if (this.aBoolean9784) {
					label94: {
						if (this.anInt9772 < 0) {
							var8 = this.method3666(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
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
							var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 - 1]);
							if (this.anInt9782 < var5) {
								return;
							}
							this.anInt9782 = var5 + var5 - 1 - this.anInt9782;
							this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
							if (--this.anInt9781 == 0) {
								break;
							}
							var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
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
							var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 - 1]);
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
							var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
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
				this.method3666(arg0, var8, 0, var10, 0.0F);
				if (this.anInt9782 < 0) {
					this.anInt9782 = -1;
					this.method3641((short) 602);
					this.method3252(-636363635);
				}
			} else {
				this.method3665(arg0, var8, var6, var10, 0.0F);
				if (this.anInt9782 >= var6) {
					this.anInt9782 = var6;
					this.method3641((short) -30769);
					this.method3252(507747260);
				}
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 < 0) {
				var8 = this.method3666(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
				if (this.anInt9782 >= var4) {
					return;
				}
				this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (true) {
				var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 - 1]);
				if (this.anInt9782 < var5) {
					break;
				}
				this.anInt9782 = var5 + var5 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
				if (this.anInt9782 >= var4) {
					break;
				}
				this.anInt9782 = var4 + var4 - 1 - this.anInt9782;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 < 0) {
			while (true) {
				var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 - 1]);
				if (this.anInt9782 >= var4) {
					break;
				}
				this.anInt9782 = var5 - 1 - (var5 - 1 - this.anInt9782) % var7;
			}
		} else {
			while (true) {
				var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777]);
				if (this.anInt9782 < var5) {
					break;
				}
				this.anInt9782 = var4 + (this.anInt9782 - var4) % var7;
			}
		}
	}

	public int method3665(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
		do {
			if (this.anInt9771 <= 0) {
				if (this.anInt9772 == 256 && (this.anInt9782 & 0xFF) == 0) {
					if (Class296.aBoolean3023) {
						return method3667(0.0F, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this);
					}
					return method3679(((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this);
				}
				if (Class296.aBoolean3023) {
					return method3669(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this, this.anInt9772, arg4);
				}
				return method3678(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this, this.anInt9772, arg4);
			}
			int var6 = arg1 + this.anInt9771;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.anInt9771 += arg1;
			if (this.anInt9772 == 256 && (this.anInt9782 & 0xFF) == 0) {
				if (Class296.aBoolean3023) {
					arg1 = method3680(0.0F, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this);
				} else {
					arg1 = method3682(((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this);
				}
			} else if (Class296.aBoolean3023) {
				arg1 = method3674(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this, this.anInt9772, arg4);
			} else {
				arg1 = method3673(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this, this.anInt9772, arg4);
			}
			this.anInt9771 -= arg1;
			if (this.anInt9771 != 0) {
				return arg1;
			}
		} while (!this.method3634(902497150));
		return arg3;
	}

	public int method3666(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
		do {
			if (this.anInt9771 <= 0) {
				if (this.anInt9772 == -256 && (this.anInt9782 & 0xFF) == 0) {
					if (Class296.aBoolean3023) {
						return method3668(0.0F, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this);
					}
					return method3677(((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this);
				}
				if (Class296.aBoolean3023) {
					return method3671(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, 0, arg3, arg2, this, this.anInt9772, arg4);
				}
				return method3670(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, 0, arg3, arg2, this, this.anInt9772, arg4);
			}
			int var6 = arg1 + this.anInt9771;
			if (var6 > arg3) {
				var6 = arg3;
			}
			this.anInt9771 += arg1;
			if (this.anInt9772 == -256 && (this.anInt9782 & 0xFF) == 0) {
				if (Class296.aBoolean3023) {
					arg1 = method3672(0.0F, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this);
				} else {
					arg1 = method3681(((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this);
				}
			} else if (Class296.aBoolean3023) {
				arg1 = method3676(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9783, this.anInt9776, this.anInt9785, this.anInt9780, 0, var6, arg2, this, this.anInt9772, arg4);
			} else {
				arg1 = method3675(0.0F, 0, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408(), arg0, this.anInt9782, arg1, this.anInt9775, this.anInt9778, 0, var6, arg2, this, this.anInt9772, arg4);
			}
			this.anInt9771 -= arg1;
			if (this.anInt9771 != 0) {
				return arg1;
			}
		} while (!this.method3634(-428424081));
		return arg3;
	}

	public static int method3667(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub2 arg10) {
		arg3 >>= 0x8;
		int var30 = arg9 >> 8;
		int var20 = arg5 << 2;
		int var25 = arg6 << 2;
		int var22 = var20 * 128;
		int var27 = var25 * 128;
		int var29;
		if ((var29 = arg4 + var30 - arg3) > arg8) {
			var29 = arg8;
		}
		arg4 <<= 0x1;
		var29 <<= 0x1;
		var29 -= 6;
		float var11;
		int var18;
		while (arg4 < var29) {
			int var15 = arg3 + 1;
			var11 = arg1[arg3];
			var18 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var11 * (float) var22);
			int var19 = var18 + 1;
			arg2[var18] = (int) ((float) arg2[var18] + var11 * (float) var27);
			int var16 = var15 + 1;
			float var12 = arg1[var15];
			int var21 = var19 + 1;
			arg2[var19] = (int) ((float) arg2[var19] + var12 * (float) var22);
			int var23 = var21 + 1;
			arg2[var21] = (int) ((float) arg2[var21] + var12 * (float) var27);
			int var17 = var16 + 1;
			float var13 = arg1[var16];
			int var24 = var23 + 1;
			arg2[var23] = (int) ((float) arg2[var23] + var13 * (float) var22);
			int var26 = var24 + 1;
			arg2[var24] = (int) ((float) arg2[var24] + var13 * (float) var27);
			arg3 = var17 + 1;
			float var14 = arg1[var17];
			int var28 = var26 + 1;
			arg2[var26] = (int) ((float) arg2[var26] + var14 * (float) var22);
			arg4 = var28 + 1;
			arg2[var28] = (int) ((float) arg2[var28] + var14 * (float) var27);
		}
		var29 += 6;
		while (arg4 < var29) {
			var11 = arg1[arg3++];
			var18 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var11 * (float) var22);
			arg4 = var18 + 1;
			arg2[var18] = (int) ((float) arg2[var18] + var11 * (float) var27);
		}
		arg10.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3668(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub2 arg10) {
		arg3 >>= 0x8;
		int var30 = arg9 >> 8;
		int var20 = arg5 << 2;
		int var25 = arg6 << 2;
		int var22 = var20 * 128;
		int var27 = var25 * 128;
		int var29;
		if ((var29 = arg4 + arg3 - (var30 - 1)) > arg8) {
			var29 = arg8;
		}
		arg4 <<= 0x1;
		var29 <<= 0x1;
		var29 -= 6;
		float var11;
		int var18;
		while (arg4 < var29) {
			int var15 = arg3 - 1;
			var11 = arg1[arg3];
			var18 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var11 * (float) var22);
			int var19 = var18 + 1;
			arg2[var18] = (int) ((float) arg2[var18] + var11 * (float) var27);
			int var16 = var15 - 1;
			float var12 = arg1[var15];
			int var21 = var19 + 1;
			arg2[var19] = (int) ((float) arg2[var19] + var12 * (float) var22);
			int var23 = var21 + 1;
			arg2[var21] = (int) ((float) arg2[var21] + var12 * (float) var27);
			int var17 = var16 - 1;
			float var13 = arg1[var16];
			int var24 = var23 + 1;
			arg2[var23] = (int) ((float) arg2[var23] + var13 * (float) var22);
			int var26 = var24 + 1;
			arg2[var24] = (int) ((float) arg2[var24] + var13 * (float) var27);
			arg3 = var17 - 1;
			float var14 = arg1[var17];
			int var28 = var26 + 1;
			arg2[var26] = (int) ((float) arg2[var26] + var14 * (float) var22);
			arg4 = var28 + 1;
			arg2[var28] = (int) ((float) arg2[var28] + var14 * (float) var27);
		}
		var29 += 6;
		while (arg4 < var29) {
			var11 = arg1[arg3--];
			var18 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var11 * (float) var22);
			arg4 = var18 + 1;
			arg2[var18] = (int) ((float) arg2[var18] + var11 * (float) var27);
		}
		arg10.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3669(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub2 arg11, int arg12, float arg13) {
		int var18 = arg6 * 128;
		int var19 = arg7 * 128;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg5 <<= 0x1;
		arg8 <<= 0x1;
		float var14;
		int var10001;
		int var17;
		while (arg5 < arg8) {
			int var16 = arg4 >> 8;
			var14 = arg2[var16];
			float var15 = var14 * 256.0F + (arg2[var16 + 1] - var14) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += (int) (var15 * (float) var18) >> 6;
			int var20 = var17;
			arg5 = var17 + 1;
			arg3[var20] += (int) (var15 * (float) var19) >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg8 <<= 0x1;
		while (arg5 < arg8) {
			var14 = arg2[arg4 >> 8];
			var14 = var14 * 256.0F + (arg13 - var14) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += (int) (var14 * (float) var18) >> 6;
			var10001 = var17;
			arg5 = var17 + 1;
			arg3[var10001] += (int) (var14 * (float) var19) >> 6;
			arg4 += arg12;
		}
		arg11.anInt9782 = arg4;
		return arg5 >> 1;
	}

	public static int method3670(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub2 arg10, int arg11, float arg12) {
		int var15 = arg6 * 128;
		if (arg11 == 0 || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8) {
			arg7 = arg8;
		}
		float var13;
		int var10001;
		while (arg5 < arg7) {
			int var14 = arg4 >> 8;
			var13 = arg2[var14 - 1];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var13 * 256.0F + (arg2[var14] - var13) * (float) (arg4 & 0xFF)) * (float) var15) >> 6;
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8) {
			arg7 = arg8;
		}
		var13 = arg12;
		while (arg5 < arg7) {
			var10001 = arg5++;
			arg3[var10001] += (int) ((var13 * 256.0F + (arg2[arg4 >> 8] - var13) * (float) (arg4 & 0xFF)) * (float) var15) >> 6;
			arg4 += arg11;
		}
		arg10.anInt9782 = arg4;
		return arg5;
	}

	public static int method3671(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub2 arg11, int arg12, float arg13) {
		int var18 = arg6 * 128;
		int var19 = arg7 * 128;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg5 <<= 0x1;
		arg8 <<= 0x1;
		float var14;
		int var10001;
		int var17;
		while (arg5 < arg8) {
			int var16 = arg4 >> 8;
			var14 = arg2[var16 - 1];
			float var15 = var14 * 256.0F + (arg2[var16] - var14) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += (int) (var15 * (float) var18) >> 6;
			int var20 = var17;
			arg5 = var17 + 1;
			arg3[var20] += (int) (var15 * (float) var19) >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		arg8 <<= 0x1;
		while (arg5 < arg8) {
			var14 = arg13 * 256.0F + (arg2[arg4 >> 8] - arg13) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var17 = arg5 + 1;
			arg3[var10001] += (int) (var14 * (float) var18) >> 6;
			var10001 = var17;
			arg5 = var17 + 1;
			arg3[var10001] += (int) (var14 * (float) var19) >> 6;
			arg4 += arg12;
		}
		arg11.anInt9782 = arg4;
		return arg5 >> 1;
	}

	public static int method3672(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class330_Sub40_Sub3_Sub2 arg12) {
		arg3 >>= 0x8;
		int var34 = arg11 >> 8;
		int var22 = arg5 << 2;
		int var26 = arg6 << 2;
		int var29 = arg7 << 2;
		int var31 = arg8 << 2;
		arg5 = var22 * 128;
		int var30 = var29 * 128;
		arg6 = var26 * 128;
		int var32 = var31 * 128;
		int var33;
		if ((var33 = arg4 + arg3 - (var34 - 1)) > arg10) {
			var33 = arg10;
		}
		arg12.anInt9775 += arg12.anInt9778 * (var33 - arg4);
		arg4 <<= 0x1;
		var33 <<= 0x1;
		var33 -= 6;
		float var13;
		int var20;
		while (arg4 < var33) {
			int var17 = arg3 - 1;
			var13 = arg1[arg3];
			var20 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var13 * (float) arg5);
			var22 = arg5 + var30;
			int var21 = var20 + 1;
			arg2[var20] = (int) ((float) arg2[var20] + var13 * (float) arg6);
			var26 = arg6 + var32;
			int var18 = var17 - 1;
			float var14 = arg1[var17];
			int var23 = var21 + 1;
			arg2[var21] = (int) ((float) arg2[var21] + var14 * (float) var22);
			var22 += var30;
			int var24 = var23 + 1;
			arg2[var23] = (int) ((float) arg2[var23] + var14 * (float) var26);
			var26 += var32;
			int var19 = var18 - 1;
			float var15 = arg1[var18];
			int var25 = var24 + 1;
			arg2[var24] = (int) ((float) arg2[var24] + var15 * (float) var22);
			var22 += var30;
			int var27 = var25 + 1;
			arg2[var25] = (int) ((float) arg2[var25] + var15 * (float) var26);
			var26 += var32;
			arg3 = var19 - 1;
			float var16 = arg1[var19];
			int var28 = var27 + 1;
			arg2[var27] = (int) ((float) arg2[var27] + var16 * (float) var22);
			arg5 = var22 + var30;
			arg4 = var28 + 1;
			arg2[var28] = (int) ((float) arg2[var28] + var16 * (float) var26);
			arg6 = var26 + var32;
		}
		var33 += 6;
		while (arg4 < var33) {
			var13 = arg1[arg3--];
			var20 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var13 * (float) arg5);
			arg5 += var30;
			arg4 = var20 + 1;
			arg2[var20] = (int) ((float) arg2[var20] + var13 * (float) arg6);
			arg6 += var32;
		}
		arg12.anInt9783 = arg5 / 128 >> 2;
		arg12.anInt9776 = arg6 / 128 >> 2;
		arg12.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3673(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub2 arg11, int arg12, float arg13) {
		arg6 *= 128;
		int var16 = arg7 * 128;
		arg11.anInt9783 -= arg11.anInt9785 * arg5;
		arg11.anInt9776 -= arg11.anInt9780 * arg5;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9) {
			arg8 = arg9;
		}
		float var14;
		int var10001;
		while (arg5 < arg8) {
			int var15 = arg4 >> 8;
			var14 = arg2[var15];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var14 * 256.0F + (arg2[var15 + 1] - var14) * (float) (arg4 & 0xFF)) * (float) arg6) >> 6;
			arg6 += var16;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
			arg8 = arg9;
		}
		while (arg5 < arg8) {
			var14 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var14 * 256.0F + (arg13 - var14) * (float) (arg4 & 0xFF)) * (float) arg6) >> 6;
			arg6 += var16;
			arg4 += arg12;
		}
		arg11.anInt9783 += arg11.anInt9785 * arg5;
		arg11.anInt9776 += arg11.anInt9780 * arg5;
		arg11.anInt9775 = arg6 / 128;
		arg11.anInt9782 = arg4;
		return arg5;
	}

	public static int method3674(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Class330_Sub40_Sub3_Sub2 arg13, int arg14, float arg15) {
		arg6 *= 128;
		int var20 = arg8 * 128;
		arg7 *= 128;
		int var21 = arg9 * 128;
		arg13.anInt9775 -= arg13.anInt9778 * arg5;
		if (arg14 == 0 || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg5 <<= 0x1;
		arg10 <<= 0x1;
		float var16;
		int var10001;
		int var19;
		while (arg5 < arg10) {
			int var18 = arg4 >> 8;
			var16 = arg2[var18];
			float var17 = var16 * 256.0F + (arg2[var18 + 1] - var16) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += (int) (var17 * (float) arg6) >> 6;
			arg6 += var20;
			int var22 = var19;
			arg5 = var19 + 1;
			arg3[var22] += (int) (var17 * (float) arg7) >> 6;
			arg7 += var21;
			arg4 += arg14;
		}
		if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg10 <<= 0x1;
		while (arg5 < arg10) {
			var16 = arg2[arg4 >> 8];
			var16 = var16 * 256.0F + (arg15 - var16) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += (int) (var16 * (float) arg6) >> 6;
			arg6 += var20;
			var10001 = var19;
			arg5 = var19 + 1;
			arg3[var10001] += (int) (var16 * (float) arg7) >> 6;
			arg7 += var21;
			arg4 += arg14;
		}
		var19 = arg5 >> 1;
		arg13.anInt9775 += arg13.anInt9778 * var19;
		arg13.anInt9783 = arg6 / 128;
		arg13.anInt9776 = arg7 / 128;
		arg13.anInt9782 = arg4;
		return var19;
	}

	public static int method3675(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class330_Sub40_Sub3_Sub2 arg11, int arg12, float arg13) {
		arg6 *= 128;
		int var16 = arg7 * 128;
		arg11.anInt9783 -= arg11.anInt9785 * arg5;
		arg11.anInt9776 -= arg11.anInt9780 * arg5;
		if (arg12 == 0 || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		float var14;
		int var10001;
		while (arg5 < arg8) {
			int var15 = arg4 >> 8;
			var14 = arg2[var15 - 1];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var14 * 256.0F + (arg2[var15] - var14) * (float) (arg4 & 0xFF)) * (float) arg6) >> 6;
			arg6 += var16;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9) {
			arg8 = arg9;
		}
		var14 = arg13;
		while (arg5 < arg8) {
			var10001 = arg5++;
			arg3[var10001] += (int) ((var14 * 256.0F + (arg2[arg4 >> 8] - var14) * (float) (arg4 & 0xFF)) * (float) arg6) >> 6;
			arg6 += var16;
			arg4 += arg12;
		}
		arg11.anInt9783 += arg11.anInt9785 * arg5;
		arg11.anInt9776 += arg11.anInt9780 * arg5;
		arg11.anInt9775 = arg6 / 128;
		arg11.anInt9782 = arg4;
		return arg5;
	}

	public static int method3676(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Class330_Sub40_Sub3_Sub2 arg13, int arg14, float arg15) {
		arg6 *= 128;
		int var20 = arg8 * 128;
		arg7 *= 128;
		int var21 = arg9 * 128;
		arg13.anInt9775 -= arg13.anInt9778 * arg5;
		if (arg14 == 0 || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg5 <<= 0x1;
		arg10 <<= 0x1;
		float var16;
		int var10001;
		int var19;
		while (arg5 < arg10) {
			int var18 = arg4 >> 8;
			var16 = arg2[var18 - 1];
			float var17 = var16 * 256.0F + (arg2[var18] - var16) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += (int) (var17 * (float) arg6) >> 6;
			arg6 += var20;
			int var22 = var19;
			arg5 = var19 + 1;
			arg3[var22] += (int) (var17 * (float) arg7) >> 6;
			arg7 += var21;
			arg4 += arg14;
		}
		if (arg14 == 0 || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
			arg10 = arg11;
		}
		arg10 <<= 0x1;
		while (arg5 < arg10) {
			var16 = arg15 * 256.0F + (arg2[arg4 >> 8] - arg15) * (float) (arg4 & 0xFF);
			var10001 = arg5;
			var19 = arg5 + 1;
			arg3[var10001] += (int) (var16 * (float) arg6) >> 6;
			arg6 += var20;
			var10001 = var19;
			arg5 = var19 + 1;
			arg3[var10001] += (int) (var16 * (float) arg7) >> 6;
			arg7 += var21;
			arg4 += arg14;
		}
		var19 = arg5 >> 1;
		arg13.anInt9775 += arg13.anInt9778 * var19;
		arg13.anInt9783 = arg6 / 128;
		arg13.anInt9776 = arg7 / 128;
		arg13.anInt9782 = arg4;
		return var19;
	}

	public synchronized void method3565(int[] arg0, int arg1, int arg2) throws IllegalStateException {
		if (this.anInt9773 * 1089731647 * 1488581567 == 0 && this.anInt9771 * 807250037 * 424994781 == 0) {
			this.method3555(arg2);
			return;
		}
		int var4 = this.anInt9777 * 1968541983 * 216574687 << 8;
		int var5 = this.anInt9779 * -1955085031 * 2094253865 << 8;
		int var6 = ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3407() << 8;
		int var7 = var5 - var4;
		if (var7 <= 0) {
			this.anInt9781 = 0 * -1618882239;
		}
		int var8 = arg1;
		int var10 = arg2 + arg1;
		if (this.anInt9782 * 2144077895 * -558816905 < 0) {
			if (this.anInt9772 * -542430793 * 598541319 <= 0) {
				this.method3641((short) -3241);
				this.method3252(582241104);
				return;
			}
			this.anInt9782 = 0 * -558816905;
		}
		if (this.anInt9782 * 2144077895 * -558816905 >= var6) {
			if (this.anInt9772 * -542430793 * 598541319 >= 0) {
				this.method3641((short) -769);
				this.method3252(-764524253);
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
							var8 = this.method3666(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
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
							var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 * -1955085031 * 2094253865 - 1]);
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
							var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
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
							var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 * -1955085031 * 2094253865 - 1]);
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
							var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
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
				this.method3666(arg0, var8, 0, var10, 0.0F);
				if (this.anInt9782 * 2144077895 * -558816905 < 0) {
					this.anInt9782 = -558816905 * -2144077895;
					this.method3641((short) 2383);
					this.method3252(1429281465);
				}
			} else {
				this.method3665(arg0, var8, var6, var10, 0.0F);
				if (this.anInt9782 * 2144077895 * -558816905 >= var6) {
					this.anInt9782 = var6 * 2144077895 * -558816905;
					this.method3641((short) 5129);
					this.method3252(-1497588800);
				}
			}
		} else if (this.aBoolean9784) {
			if (this.anInt9772 * -542430793 * 598541319 < 0) {
				var8 = this.method3666(arg0, arg1, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					return;
				}
				this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
			while (true) {
				var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 * -1955085031 * 2094253865 - 1]);
				if (this.anInt9782 * 2144077895 * -558816905 < var5) {
					break;
				}
				this.anInt9782 = (var5 + var5 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
				var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					break;
				}
				this.anInt9782 = (var4 + var4 - 1 - this.anInt9782 * 2144077895 * -558816905) * 2144077895 * -558816905;
				this.anInt9772 = -(this.anInt9772 * -542430793) * 598541319;
			}
		} else if (this.anInt9772 * -542430793 * 598541319 < 0) {
			while (true) {
				var8 = this.method3666(arg0, var8, var4, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9779 * -1955085031 * 2094253865 - 1]);
				if (this.anInt9782 * 2144077895 * -558816905 >= var4) {
					break;
				}
				this.anInt9782 = (var5 - 1 - (var5 - 1 - this.anInt9782 * 2144077895 * -558816905) % var7) * 2144077895 * -558816905;
			}
		} else {
			while (true) {
				var8 = this.method3665(arg0, var8, var5, var10, ((Class330_Sub29_Sub1_Sub1) this.aClass330_Sub29_7770).method3408()[this.anInt9777 * 1968541983 * 216574687]);
				if (this.anInt9782 * 2144077895 * -558816905 < var5) {
					break;
				}
				this.anInt9782 = (var4 + (this.anInt9782 * 2144077895 * -558816905 - var4) % var7) * 2144077895 * -558816905;
			}
		}
	}

	public static int method3677(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Class330_Sub40_Sub3_Sub2 arg8) {
		arg2 >>= 0x8;
		int var15 = arg7 >> 8;
		int var12 = arg4 << 2;
		int var13 = var12 * 128;
		int var14;
		if ((var14 = arg3 + arg2 - (var15 - 1)) > arg6) {
			var14 = arg6;
		}
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			float var10002 = (float) arg1[var10001];
			int var9 = arg2 - 1;
			arg1[var10001] = (int) (var10002 + arg0[arg2] * (float) var13);
			int var16 = arg3++;
			float var19 = (float) arg1[var16];
			int var10 = var9 - 1;
			arg1[var16] = (int) (var19 + arg0[var9] * (float) var13);
			int var17 = arg3++;
			float var20 = (float) arg1[var17];
			int var11 = var10 - 1;
			arg1[var17] = (int) (var20 + arg0[var10] * (float) var13);
			int var18 = arg3++;
			float var21 = (float) arg1[var18];
			arg2 = var11 - 1;
			arg1[var18] = (int) (var21 + arg0[var11] * (float) var13);
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] = (int) ((float) arg1[var10001] + arg0[arg2--] * (float) var13);
		}
		arg8.anInt9782 = arg2 << 8;
		return arg3;
	}

	public Class330_Sub40_Sub3_Sub2(Class330_Sub29_Sub1_Sub1 arg0, int arg1, int arg2, int arg3) {
		this.aClass330_Sub29_7770 = arg0;
		this.anInt9777 = arg0.anInt9588;
		this.anInt9779 = arg0.anInt9587;
		this.aBoolean9784 = arg0.aBoolean9589;
		this.anInt9772 = arg1;
		this.anInt9773 = arg2;
		this.anInt9774 = arg3;
		this.anInt9782 = 0;
		this.method3635((byte) 55);
	}

	public static int method3678(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class330_Sub40_Sub3_Sub2 arg10, int arg11, float arg12) {
		int var15 = arg6 * 128;
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8) {
			arg7 = arg8;
		}
		float var13;
		int var10001;
		while (arg5 < arg7) {
			int var14 = arg4 >> 8;
			var13 = arg2[var14];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var13 * 256.0F + (arg2[var14 + 1] - var13) * (float) (arg4 & 0xFF)) * (float) var15) >> 6;
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8) {
			arg7 = arg8;
		}
		while (arg5 < arg7) {
			var13 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += (int) ((var13 * 256.0F + (arg12 - var13) * (float) (arg4 & 0xFF)) * (float) var15) >> 6;
			arg4 += arg11;
		}
		arg10.anInt9782 = arg4;
		return arg5;
	}

	public static int method3679(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Class330_Sub40_Sub3_Sub2 arg8) {
		arg2 >>= 0x8;
		int var15 = arg7 >> 8;
		int var12 = arg4 << 2;
		int var13 = var12 * 128;
		int var14;
		if ((var14 = arg3 + var15 - arg2) > arg6) {
			var14 = arg6;
		}
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			float var10002 = (float) arg1[var10001];
			int var9 = arg2 + 1;
			arg1[var10001] = (int) (var10002 + arg0[arg2] * (float) var13);
			int var16 = arg3++;
			float var19 = (float) arg1[var16];
			int var10 = var9 + 1;
			arg1[var16] = (int) (var19 + arg0[var9] * (float) var13);
			int var17 = arg3++;
			float var20 = (float) arg1[var17];
			int var11 = var10 + 1;
			arg1[var17] = (int) (var20 + arg0[var10] * (float) var13);
			int var18 = arg3++;
			float var21 = (float) arg1[var18];
			arg2 = var11 + 1;
			arg1[var18] = (int) (var21 + arg0[var11] * (float) var13);
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] = (int) ((float) arg1[var10001] + arg0[arg2++] * (float) var13);
		}
		arg8.anInt9782 = arg2 << 8;
		return arg3;
	}

	public static int method3680(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class330_Sub40_Sub3_Sub2 arg12) {
		arg3 >>= 0x8;
		int var34 = arg11 >> 8;
		int var22 = arg5 << 2;
		int var26 = arg6 << 2;
		int var29 = arg7 << 2;
		int var31 = arg8 << 2;
		arg5 = var22 * 128;
		int var30 = var29 * 128;
		arg6 = var26 * 128;
		int var32 = var31 * 128;
		int var33;
		if ((var33 = arg4 + var34 - arg3) > arg10) {
			var33 = arg10;
		}
		arg12.anInt9775 += arg12.anInt9778 * (var33 - arg4);
		arg4 <<= 0x1;
		var33 <<= 0x1;
		var33 -= 6;
		float var13;
		int var20;
		while (arg4 < var33) {
			int var17 = arg3 + 1;
			var13 = arg1[arg3];
			var20 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var13 * (float) arg5);
			var22 = arg5 + var30;
			int var21 = var20 + 1;
			arg2[var20] = (int) ((float) arg2[var20] + var13 * (float) arg6);
			var26 = arg6 + var32;
			int var18 = var17 + 1;
			float var14 = arg1[var17];
			int var23 = var21 + 1;
			arg2[var21] = (int) ((float) arg2[var21] + var14 * (float) var22);
			var22 += var30;
			int var24 = var23 + 1;
			arg2[var23] = (int) ((float) arg2[var23] + var14 * (float) var26);
			var26 += var32;
			int var19 = var18 + 1;
			float var15 = arg1[var18];
			int var25 = var24 + 1;
			arg2[var24] = (int) ((float) arg2[var24] + var15 * (float) var22);
			var22 += var30;
			int var27 = var25 + 1;
			arg2[var25] = (int) ((float) arg2[var25] + var15 * (float) var26);
			var26 += var32;
			arg3 = var19 + 1;
			float var16 = arg1[var19];
			int var28 = var27 + 1;
			arg2[var27] = (int) ((float) arg2[var27] + var16 * (float) var22);
			arg5 = var22 + var30;
			arg4 = var28 + 1;
			arg2[var28] = (int) ((float) arg2[var28] + var16 * (float) var26);
			arg6 = var26 + var32;
		}
		var33 += 6;
		while (arg4 < var33) {
			var13 = arg1[arg3++];
			var20 = arg4 + 1;
			arg2[arg4] = (int) ((float) arg2[arg4] + var13 * (float) arg5);
			arg5 += var30;
			arg4 = var20 + 1;
			arg2[var20] = (int) ((float) arg2[var20] + var13 * (float) arg6);
			arg6 += var32;
		}
		arg12.anInt9783 = arg5 / 128 >> 2;
		arg12.anInt9776 = arg6 / 128 >> 2;
		arg12.anInt9782 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method3681(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Class330_Sub40_Sub3_Sub2 arg9) {
		arg2 >>= 0x8;
		int var17 = arg8 >> 8;
		int var13 = arg4 << 2;
		int var14 = arg5 << 2;
		arg4 = var13 * 128;
		int var15 = var14 * 128;
		int var16;
		if ((var16 = arg3 + arg2 - (var17 - 1)) > arg7) {
			var16 = arg7;
		}
		arg9.anInt9783 += arg9.anInt9785 * (var16 - arg3);
		arg9.anInt9776 += arg9.anInt9780 * (var16 - arg3);
		var16 -= 3;
		int var10001;
		while (arg3 < var16) {
			var10001 = arg3++;
			float var10002 = (float) arg1[var10001];
			int var10 = arg2 - 1;
			arg1[var10001] = (int) (var10002 + arg0[arg2] * (float) arg4);
			var13 = arg4 + var15;
			int var18 = arg3++;
			float var21 = (float) arg1[var18];
			int var11 = var10 - 1;
			arg1[var18] = (int) (var21 + arg0[var10] * (float) var13);
			var13 += var15;
			int var19 = arg3++;
			float var22 = (float) arg1[var19];
			int var12 = var11 - 1;
			arg1[var19] = (int) (var22 + arg0[var11] * (float) var13);
			var13 += var15;
			int var20 = arg3++;
			float var23 = (float) arg1[var20];
			arg2 = var12 - 1;
			arg1[var20] = (int) (var23 + arg0[var12] * (float) var13);
			arg4 = var13 + var15;
		}
		var16 += 3;
		while (arg3 < var16) {
			var10001 = arg3++;
			arg1[var10001] = (int) ((float) arg1[var10001] + arg0[arg2--] * (float) arg4);
			arg4 += var15;
		}
		arg9.anInt9775 = arg4 / 128 >> 2;
		arg9.anInt9782 = arg2 << 8;
		return arg3;
	}

	public static int method3682(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Class330_Sub40_Sub3_Sub2 arg9) {
		arg2 >>= 0x8;
		int var17 = arg8 >> 8;
		int var13 = arg4 << 2;
		int var14 = arg5 << 2;
		arg4 = var13 * 128;
		int var15 = var14 * 128;
		int var16;
		if ((var16 = arg3 + var17 - arg2) > arg7) {
			var16 = arg7;
		}
		arg9.anInt9783 += arg9.anInt9785 * (var16 - arg3);
		arg9.anInt9776 += arg9.anInt9780 * (var16 - arg3);
		var16 -= 3;
		int var10001;
		while (arg3 < var16) {
			var10001 = arg3++;
			float var10002 = (float) arg1[var10001];
			int var10 = arg2 + 1;
			arg1[var10001] = (int) (var10002 + arg0[arg2] * (float) arg4);
			var13 = arg4 + var15;
			int var18 = arg3++;
			float var21 = (float) arg1[var18];
			int var11 = var10 + 1;
			arg1[var18] = (int) (var21 + arg0[var10] * (float) var13);
			var13 += var15;
			int var19 = arg3++;
			float var22 = (float) arg1[var19];
			int var12 = var11 + 1;
			arg1[var19] = (int) (var22 + arg0[var11] * (float) var13);
			var13 += var15;
			int var20 = arg3++;
			float var23 = (float) arg1[var20];
			arg2 = var12 + 1;
			arg1[var20] = (int) (var23 + arg0[var12] * (float) var13);
			arg4 = var13 + var15;
		}
		var16 += 3;
		while (arg3 < var16) {
			var10001 = arg3++;
			arg1[var10001] = (int) ((float) arg1[var10001] + arg0[arg2++] * (float) arg4);
			arg4 += var15;
		}
		arg9.anInt9775 = arg4 / 128 >> 2;
		arg9.anInt9782 = arg2 << 8;
		return arg3;
	}
}
