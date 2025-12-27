package deob;

public class Class263_Sub4 extends Class263 {

	public Class_ra_Sub3 aClass_ra_Sub3_7390;

	public int[] anIntArray7393;

	public int[] anIntArray7391;

	public byte[][] aByteArrayArray7388;

	public int[] anIntArray7392;

	public int[] anIntArray7387;

	public int[] anIntArray7389;

	public Class263_Sub4(Class_ra_Sub3 arg0, Class524 arg1, Class87_Sub2[] arg2, int[] arg3, int[] arg4) {
		super(arg0, arg1);
		this.aClass_ra_Sub3_7390 = arg0;
		this.aClass_ra_Sub3_7390 = arg0;
		this.anIntArray7393 = arg3;
		this.anIntArray7391 = arg4;
		this.aByteArrayArray7388 = new byte[arg2.length][];
		this.anIntArray7392 = new int[arg2.length];
		this.anIntArray7387 = new int[arg2.length];
		for (int var6 = 0; var6 < arg2.length; var6++) {
			this.aByteArrayArray7388[var6] = arg2[var6].aByteArray7114;
			this.anIntArray7392[var6] = arg2[var6].anInt7111;
			this.anIntArray7387[var6] = arg2[var6].anInt7109;
		}
		this.anIntArray7389 = arg2[0].anIntArray7113;
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var9 = this.anIntArray7393[arg0];
		int var10 = this.anIntArray7391[arg0];
		int var11 = this.aClass_ra_Sub3_7390.anInt8618 * -1504772933 * -29235085;
		int var12 = arg1 + var11 * arg2;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623 * -1679642481 * 766013039) {
			var16 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7390.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7390.anInt8635 * -711985315 * -1071049483) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7390.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if (arg4) {
			this.method2635(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		} else {
			this.method2634(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		}
	}

	public void method2632(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var15 = -(arg5 & 0x3);
		boolean var11 = false;
		for (int var12 = -arg6; var12 < 0; var12++) {
			int var13;
			for (var13 = var10; var13 < 0; var13++) {
				byte var14;
				if ((var14 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var14 & 0xFF];
				}
				byte var16;
				if ((var16 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var16 & 0xFF];
				}
				byte var17;
				if ((var17 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var17 & 0xFF];
				}
				byte var18;
				if ((var18 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var18 & 0xFF];
				}
			}
			for (var13 = var15; var13 < 0; var13++) {
				byte var19;
				if ((var19 = arg0[arg3++]) == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var19 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method2633(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	public void method2634(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, Class_ta arg13, int arg14, int arg15) {
		Class_ta_Sub3 var17 = (Class_ta_Sub3) arg13;
		int[] var18 = var17.anIntArray8661;
		int[] var19 = var17.anIntArray8662;
		int var20 = arg10 - this.aClass_ra_Sub3_7390.anInt8621;
		int var21 = arg11;
		if (arg15 > arg11) {
			var21 = arg15;
			arg5 += (arg15 - arg11) * this.aClass_ra_Sub3_7390.anInt8618;
			arg4 += (arg15 - arg11) * arg12;
		}
		int var22 = arg15 + var18.length < arg11 + arg7 ? var18.length + arg15 : arg11 + arg7;
		boolean var23 = false;
		for (int var24 = var21; var24 < var22; var24++) {
			int var25 = arg14 + var18[var24 - arg15];
			int var26 = var19[var24 - arg15];
			int var27 = arg6;
			int var28;
			if (var20 > var25) {
				var28 = var20 - var25;
				if (var28 >= var26) {
					arg4 += arg9 + arg6;
					arg5 += arg6 + arg8;
					continue;
				}
				var26 -= var28;
			} else {
				var28 = var25 - var20;
				if (var28 >= arg6) {
					arg4 += arg6 + arg9;
					arg5 += arg8 + arg6;
					continue;
				}
				arg4 += var28;
				var27 = arg6 - var28;
				arg5 += var28;
			}
			var28 = 0;
			if (var27 < var26) {
				var26 = var27;
			} else {
				var28 = var27 - var26;
			}
			for (int var29 = -var26; var29 < 0; var29++) {
				byte var30;
				if ((var30 = arg0[arg4++]) == 0) {
					arg5++;
				} else {
					arg1[arg5++] = arg2[var30 & 0xFF];
				}
			}
			arg4 += var28 + arg9;
			arg5 += var28 + arg8;
		}
	}

	@ObfuscatedName("Class263_Sub4.c(CIIIZ)V")
	public void c(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var6 = this.anIntArray7393[arg0];
		int var7 = this.anIntArray7391[arg0];
		int var8 = this.aClass_ra_Sub3_7390.anInt8618 * -29235085 * -1504772933;
		int var9 = arg1 + arg2 * var8;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481) {
			var13 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623 * -1679642481 * 766013039;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (arg2 + var7 > this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541) {
			var7 -= arg2 + var7 - this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825) {
			var13 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621 * 512290825 * 1907727929;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7390.anInt8635 * -711985315 * -1071049483) {
			var13 = var6 + arg1 - this.aClass_ra_Sub3_7390.anInt8635 * -1071049483 * -711985315;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 <= 0 || var7 <= 0) {
			return;
		}
		if (arg4) {
			this.method2633(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		} else {
			this.method2632(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, var12, var9, var6, var7, var10, var11);
		}
	}

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var9 = this.anIntArray7393[arg0];
		int var10 = this.anIntArray7391[arg0];
		int var11 = this.aClass_ra_Sub3_7390.anInt8618 * -1504772933 * -29235085;
		int var12 = arg1 + var11 * arg2;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623 * -1679642481 * 766013039) {
			var16 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7390.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7390.anInt8635 * -711985315 * -1071049483) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7390.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if (arg4) {
			this.method2635(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		} else {
			this.method2634(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var9 = this.anIntArray7393[arg0];
		int var10 = this.anIntArray7391[arg0];
		int var11 = this.aClass_ra_Sub3_7390.anInt8618;
		int var12 = arg1 + var11 * arg2;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623) {
			var16 = this.aClass_ra_Sub3_7390.anInt8623 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7390.anInt8624) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7390.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621) {
			var16 = this.aClass_ra_Sub3_7390.anInt8621 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7390.anInt8635) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7390.anInt8635;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if (arg4) {
			this.method2635(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		} else {
			this.method2634(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		}
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var9 = this.anIntArray7393[arg0];
		int var10 = this.anIntArray7391[arg0];
		int var11 = this.aClass_ra_Sub3_7390.anInt8618 * -1504772933 * -29235085;
		int var12 = arg1 + var11 * arg2;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623 * -1679642481 * 766013039) {
			var16 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7390.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7390.anInt8635 * -711985315 * -1071049483) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7390.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if (arg4) {
			this.method2635(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		} else {
			this.method2634(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("Class263_Sub4.UA(CIIIZ)V")
	public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var6 = this.anIntArray7393[arg0];
		int var7 = this.anIntArray7391[arg0];
		int var8 = this.aClass_ra_Sub3_7390.anInt8618;
		int var9 = arg1 + arg2 * var8;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623) {
			var13 = this.aClass_ra_Sub3_7390.anInt8623 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (arg2 + var7 > this.aClass_ra_Sub3_7390.anInt8624) {
			var7 -= arg2 + var7 - this.aClass_ra_Sub3_7390.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621) {
			var13 = this.aClass_ra_Sub3_7390.anInt8621 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7390.anInt8635) {
			var13 = var6 + arg1 - this.aClass_ra_Sub3_7390.anInt8635;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 <= 0 || var7 <= 0) {
			return;
		}
		if (arg4) {
			this.method2633(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		} else {
			this.method2632(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, var12, var9, var6, var7, var10, var11);
		}
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7390.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7387[arg0];
		arg2 += this.anIntArray7392[arg0];
		int var9 = this.anIntArray7393[arg0];
		int var10 = this.anIntArray7391[arg0];
		int var11 = this.aClass_ra_Sub3_7390.anInt8618 * -1504772933 * -29235085;
		int var12 = arg1 + var11 * arg2;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7390.anInt8623 * -1679642481 * 766013039) {
			var16 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7390.anInt8623 * 766013039 * -1679642481;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7390.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7390.anInt8624 * -550983163 * 31822541;
		}
		if (arg1 < this.aClass_ra_Sub3_7390.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7390.anInt8621 * 1907727929 * 512290825;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7390.anInt8635 * -711985315 * -1071049483) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7390.anInt8635 * -1071049483 * -711985315;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 <= 0 || var10 <= 0) {
			return;
		}
		if (arg4) {
			this.method2635(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		} else {
			this.method2634(this.aByteArrayArray7388[arg0], this.aClass_ra_Sub3_7390.anIntArray8630, this.anIntArray7389, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7393[arg0], arg5, arg6, arg7);
		}
	}

	public void method2635(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class_ta arg12, int arg13, int arg14) {
		Class_ta_Sub3 var16 = (Class_ta_Sub3) arg12;
		int[] var17 = var16.anIntArray8661;
		int[] var18 = var16.anIntArray8662;
		int var19 = arg9 - this.aClass_ra_Sub3_7390.anInt8621;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += (arg14 - arg10) * this.aClass_ra_Sub3_7390.anInt8618;
			arg3 += (arg14 - arg10) * arg11;
		}
		int var21 = var17.length + arg14 < arg6 + arg10 ? arg14 + var17.length : arg6 + arg10;
		for (int var22 = var20; var22 < var21; var22++) {
			int var23 = var17[var22 - arg14] + arg13;
			int var24 = var18[var22 - arg14];
			int var25 = arg5;
			int var26;
			if (var19 > var23) {
				var26 = var19 - var23;
				if (var26 >= var24) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				var24 -= var26;
			} else {
				var26 = var23 - var19;
				if (var26 >= arg5) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += var26;
				var25 = arg5 - var26;
				arg4 += var26;
			}
			var26 = 0;
			if (var25 < var24) {
				var24 = var25;
			} else {
				var26 = var25 - var24;
			}
			for (int var27 = -var24; var27 < 0; var27++) {
				if (arg0[arg3++] == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2;
				}
			}
			arg3 += var26 + arg3;
			arg4 += arg7 + var26;
		}
	}

	public static final void method2636(Class430 arg0, int arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class263_Sub2.method2624(Class401.method4717(arg0.anIntArray4387[--arg0.anInt4376], 1870636100), Class429.aClass454_4369.method297((short) 18850), -63566236);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zn.aac(" + ')');
		}
	}

	public static short[] method2637(short[] arg0, int arg1) {
		try {
			if (arg0 == null) {
				return null;
			} else {
				short[] var2 = new short[arg0.length];
				System.arraycopy(arg0, 0, var2, 0, arg0.length);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zn.j(" + ')');
		}
	}
}
