package deob;

public class Class263_Sub3 extends Class263 {

	public Class_ra_Sub3 aClass_ra_Sub3_7380;

	public int[] anIntArray7384;

	public int[] anIntArray7383;

	public byte[][] aByteArrayArray7381;

	public int[] anIntArray7382;

	public int[] anIntArray7385;

	public static int anInt7386;

	@ObfuscatedName("Class263_Sub3.c(CIIIZ)V")
	public void c(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var6 = this.anIntArray7384[arg0];
		int var7 = this.anIntArray7383[arg0];
		int var8 = this.aClass_ra_Sub3_7380.anInt8618 * -29235085 * -1504772933;
		int var9 = var8 * arg2 + arg1;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039) {
			var13 = this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (var7 + arg2 > this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163) {
			var7 -= var7 + arg2 - this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929) {
			var13 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315) {
			var13 = arg1 + var6 - this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 <= 0 || var7 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2626(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method2627(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		}
	}

	@ObfuscatedName("Class263_Sub3.UA(CIIIZ)V")
	public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var6 = this.anIntArray7384[arg0];
		int var7 = this.anIntArray7383[arg0];
		int var8 = this.aClass_ra_Sub3_7380.anInt8618;
		int var9 = var8 * arg2 + arg1;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623) {
			var13 = this.aClass_ra_Sub3_7380.anInt8623 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (var7 + arg2 > this.aClass_ra_Sub3_7380.anInt8624) {
			var7 -= var7 + arg2 - this.aClass_ra_Sub3_7380.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621) {
			var13 = this.aClass_ra_Sub3_7380.anInt8621 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7380.anInt8635) {
			var13 = arg1 + var6 - this.aClass_ra_Sub3_7380.anInt8635;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 <= 0 || var7 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2626(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		} else if ((arg3 & 0xFF000000) != 0) {
			this.method2627(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		}
	}

	public void method2626(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var13 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			int var12;
			for (var12 = var10; var12 < 0; var12++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			for (var12 = var13; var12 < 0; var12++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method2627(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg2 >>> 24;
		int var11 = 255 - var10;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					int var14 = (var10 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 & 0xFF0000) >> 8;
					int var15 = arg1[arg4];
					arg1[arg4++] = var14 + (((var15 & 0xFF00) * var11 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 & 0xFF00FF00) >> 8);
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var9 = this.anIntArray7384[arg0];
		int var10 = this.anIntArray7383[arg0];
		int var11 = this.aClass_ra_Sub3_7380.anInt8618;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623) {
			var16 = this.aClass_ra_Sub3_7380.anInt8623 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623;
			var15 += var9 * var16;
			var12 += var11 * var16;
		}
		if (arg2 + var10 > this.aClass_ra_Sub3_7380.anInt8624) {
			var10 -= arg2 + var10 - this.aClass_ra_Sub3_7380.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621) {
			var16 = this.aClass_ra_Sub3_7380.anInt8621 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7380.anInt8635) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7380.anInt8635;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2628(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		} else {
			this.method2629(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		}
	}

	public void method2628(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class_ta arg12, int arg13, int arg14) {
		Class_ta_Sub3 var16 = (Class_ta_Sub3) arg12;
		int[] var17 = var16.anIntArray8661;
		int[] var18 = var16.anIntArray8662;
		int var19 = arg10;
		if (arg14 > arg10) {
			var19 = arg14;
			arg4 += (arg14 - arg10) * this.aClass_ra_Sub3_7380.anInt8618;
			arg3 += arg11 * (arg14 - arg10);
		}
		int var20 = arg14 + var17.length < arg10 + arg6 ? var17.length + arg14 : arg6 + arg10;
		for (int var21 = var19; var21 < var20; var21++) {
			int var22 = var17[var21 - arg14] + arg13;
			int var23 = var18[var21 - arg14];
			int var24 = arg5;
			int var25;
			if (arg9 > var22) {
				var25 = arg9 - var22;
				if (var25 >= var23) {
					arg3 += arg8 + arg5;
					arg4 += arg7 + arg5;
					continue;
				}
				var23 -= var25;
			} else {
				var25 = var22 - arg9;
				if (var25 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += var25;
				var24 = arg5 - var25;
				arg4 += var25;
			}
			var25 = 0;
			if (var24 < var23) {
				var23 = var24;
			} else {
				var25 = var24 - var23;
			}
			for (int var26 = 0; var26 < var23; var26++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += arg8 + var25;
			arg4 += var25 + arg7;
		}
	}

	public Class263_Sub3(Class_ra_Sub3 arg0, Class524 arg1, Class87_Sub2[] arg2, int[] arg3, int[] arg4) {
		super(arg0, arg1);
		this.aClass_ra_Sub3_7380 = arg0;
		this.anIntArray7384 = arg3;
		this.anIntArray7383 = arg4;
		this.aByteArrayArray7381 = new byte[arg2.length][];
		this.anIntArray7382 = new int[arg2.length];
		this.anIntArray7385 = new int[arg2.length];
		for (int var6 = 0; var6 < arg2.length; var6++) {
			this.aByteArrayArray7381[var6] = arg2[var6].aByteArray7114;
			this.anIntArray7382[var6] = arg2[var6].anInt7111;
			this.anIntArray7385[var6] = arg2[var6].anInt7109;
		}
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var9 = this.anIntArray7384[arg0];
		int var10 = this.anIntArray7383[arg0];
		int var11 = this.aClass_ra_Sub3_7380.anInt8618 * -1504772933 * -29235085;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039;
			var15 += var9 * var16;
			var12 += var11 * var16;
		}
		if (arg2 + var10 > this.aClass_ra_Sub3_7380.anInt8624 * -550983163 * 31822541) {
			var10 -= arg2 + var10 - this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2628(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		} else {
			this.method2629(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		}
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var9 = this.anIntArray7384[arg0];
		int var10 = this.anIntArray7383[arg0];
		int var11 = this.aClass_ra_Sub3_7380.anInt8618 * -1504772933 * -29235085;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039;
			var15 += var9 * var16;
			var12 += var11 * var16;
		}
		if (arg2 + var10 > this.aClass_ra_Sub3_7380.anInt8624 * -550983163 * 31822541) {
			var10 -= arg2 + var10 - this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2628(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		} else {
			this.method2629(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		}
	}

	public void method2629(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class_ta arg12, int arg13, int arg14) {
		Class_ta_Sub3 var16 = (Class_ta_Sub3) arg12;
		int[] var17 = var16.anIntArray8661;
		int[] var18 = var16.anIntArray8662;
		int var19 = arg9 - this.aClass_ra_Sub3_7380.anInt8621;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += (arg14 - arg10) * this.aClass_ra_Sub3_7380.anInt8618;
			arg3 += (arg14 - arg10) * arg11;
		}
		int var21 = arg14 + var17.length < arg6 + arg10 ? arg14 + var17.length : arg6 + arg10;
		int var22 = arg2 >>> 24;
		int var23 = 255 - var22;
		for (int var24 = var20; var24 < var21; var24++) {
			int var25 = var17[var24 - arg14] + arg13;
			int var26 = var18[var24 - arg14];
			int var27 = arg5;
			int var28;
			if (var19 > var25) {
				var28 = var19 - var25;
				if (var28 >= var26) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				var26 -= var28;
			} else {
				var28 = var25 - var19;
				if (var28 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
					continue;
				}
				arg3 += var28;
				var27 = arg5 - var28;
				arg4 += var28;
			}
			var28 = 0;
			if (var27 < var26) {
				var26 = var27;
			} else {
				var28 = var27 - var26;
			}
			for (int var29 = -var26; var29 < 0; var29++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					int var30 = ((arg2 & 0xFF00FF) * var22 & 0xFF00FF00) + ((arg2 & 0xFF00) * var22 & 0xFF0000) >> 8;
					int var31 = arg1[arg4];
					arg1[arg4++] = var30 + ((var23 * (var31 & 0xFF00FF) & 0xFF00FF00) + (var23 * (var31 & 0xFF00) & 0xFF0000) >> 8);
				}
			}
			arg3 += arg8 + var28;
			arg4 += var28 + arg7;
		}
	}

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var9 = this.anIntArray7384[arg0];
		int var10 = this.anIntArray7383[arg0];
		int var11 = this.aClass_ra_Sub3_7380.anInt8618 * -1504772933 * -29235085;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039;
			var15 += var9 * var16;
			var12 += var11 * var16;
		}
		if (arg2 + var10 > this.aClass_ra_Sub3_7380.anInt8624 * -550983163 * 31822541) {
			var10 -= arg2 + var10 - this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2628(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		} else {
			this.method2629(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		}
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7380.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7385[arg0];
		arg2 += this.anIntArray7382[arg0];
		int var9 = this.anIntArray7384[arg0];
		int var10 = this.anIntArray7383[arg0];
		int var11 = this.aClass_ra_Sub3_7380.anInt8618 * -1504772933 * -29235085;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7380.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7380.anInt8623 * -1679642481 * 766013039;
			var15 += var9 * var16;
			var12 += var11 * var16;
		}
		if (arg2 + var10 > this.aClass_ra_Sub3_7380.anInt8624 * -550983163 * 31822541) {
			var10 -= arg2 + var10 - this.aClass_ra_Sub3_7380.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7380.anInt8621 * 512290825 * 1907727929 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7380.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7380.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if ((arg3 & -16777216) == -16777216) {
			this.method2628(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		} else {
			this.method2629(this.aByteArrayArray7381[arg0], this.aClass_ra_Sub3_7380.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7384[arg0], arg5, arg6, arg7);
		}
	}

	public static boolean method2630(byte arg0) {
		try {
			client.anInt9027++;
			client.aBoolean9114 = true;
			return true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "zg.ml(" + ')');
		}
	}

	public static void method2631(String arg0, String arg1, int arg2, boolean arg3, int arg4) {
		try {
			if (client.anInt8995 == 14) {
				Class330_Sub34 var5 = Class238.method2377(OutgoingPacket.aClass234_2525, client.aClass1_9060.aClass488_22, 1030038407);
				var5.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 46);
				int var6 = var5.aClass330_Sub46_Sub2_7729.offset;
				var5.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) -94);
				var5.aClass330_Sub46_Sub2_7729.addString(arg1, (byte) -38);
				var5.aClass330_Sub46_Sub2_7729.addByte(arg2, (byte) 66);
				var5.aClass330_Sub46_Sub2_7729.addByte(arg3 ? 1 : 0, (byte) 4);
				var5.aClass330_Sub46_Sub2_7729.offset += 7;
				var5.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, var6, var5.aClass330_Sub46_Sub2_7729.offset, (byte) -51);
				var5.aClass330_Sub46_Sub2_7729.method3772(var5.aClass330_Sub46_Sub2_7729.offset - var6, (byte) 38);
				client.aClass1_9060.method378(var5, -1868114792);
				if (arg2 < 13) {
					client.aBoolean9273 = true;
					Class62.method768(1929139439);
				}
				Class556.aClass470_6390 = Class470.aClass470_6864;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "zg.o(" + ')');
		}
	}
}
