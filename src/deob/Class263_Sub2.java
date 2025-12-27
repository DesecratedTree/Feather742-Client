package deob;

public class Class263_Sub2 extends Class263 {

	public Class_ra_Sub3 aClass_ra_Sub3_7378;

	public int[] anIntArray7375;

	public int[] anIntArray7376;

	public byte[][] aByteArrayArray7374;

	public int[] anIntArray7377;

	public int[] anIntArray7373;

	public static Player myPlayer;

	@ObfuscatedName("Class263_Sub2.UA(CIIIZ)V")
	public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		System.out.println("c: " + this.anIntArray7373[arg0]);
		System.out.println(" " + this.anIntArray7373[arg0]);
		System.out.println(" " + this.anIntArray7377[arg0]);
		arg2 += this.anIntArray7377[arg0];
		int var6 = this.anIntArray7375[arg0];
		int var7 = this.anIntArray7376[arg0];
		int var8 = this.aClass_ra_Sub3_7378.anInt8618;
		int var9 = var8 * arg2 + arg1;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623) {
			var13 = this.aClass_ra_Sub3_7378.anInt8623 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (arg2 + var7 > this.aClass_ra_Sub3_7378.anInt8624) {
			var7 -= arg2 + var7 - this.aClass_ra_Sub3_7378.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621) {
			var13 = this.aClass_ra_Sub3_7378.anInt8621 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7378.anInt8635) {
			var13 = arg1 + var6 - this.aClass_ra_Sub3_7378.anInt8635;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 > 0 && var7 > 0) {
			this.method2621(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		}
	}

	public Class263_Sub2(Class_ra_Sub3 arg0, Class524 arg1, Class87_Sub2[] arg2, int[] arg3, int[] arg4) {
		super(arg0, arg1);
		this.aClass_ra_Sub3_7378 = arg0;
		this.aClass_ra_Sub3_7378 = arg0;
		this.anIntArray7375 = arg3;
		this.anIntArray7376 = arg4;
		this.aByteArrayArray7374 = new byte[arg2.length][];
		this.anIntArray7377 = new int[arg2.length];
		this.anIntArray7373 = new int[arg2.length];
		for (int var6 = 0; var6 < arg2.length; var6++) {
			Class87_Sub2 var7 = arg2[var6];
			if (var7.aByteArray7115 == null) {
				byte[] var8 = var7.aByteArray7114;
				byte[] var9 = this.aByteArrayArray7374[var6] = new byte[var8.length];
				for (int var10 = 0; var10 < var8.length; var10++) {
					var9[var10] = (byte) (var8[var10] == 0 ? 0 : -1);
				}
			} else {
				this.aByteArrayArray7374[var6] = var7.aByteArray7115;
			}
			this.anIntArray7377[var6] = var7.anInt7111;
			this.anIntArray7373[var6] = var7.anInt7109;
			System.out.println(var7.anInt7111);
			System.out.println(var7.anInt7109);
		}
	}

	public void method2620(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, Class_ta arg12, int arg13, int arg14) {
		Class_ta_Sub3 var16 = (Class_ta_Sub3) arg12;
		int[] var17 = var16.anIntArray8661;
		int[] var18 = var16.anIntArray8662;
		int var19 = arg9 - this.aClass_ra_Sub3_7378.anInt8621;
		int var20 = arg10;
		if (arg14 > arg10) {
			var20 = arg14;
			arg4 += (arg14 - arg10) * this.aClass_ra_Sub3_7378.anInt8618;
			arg3 += (arg14 - arg10) * arg11;
		}
		int var21 = arg14 + var17.length < arg10 + arg6 ? var17.length + arg14 : arg10 + arg6;
		for (int var22 = var20; var22 < var21; var22++) {
			int var23 = arg13 + var17[var22 - arg14];
			int var24 = var18[var22 - arg14];
			int var25 = arg5;
			int var26;
			if (var19 > var23) {
				var26 = var19 - var23;
				if (var26 >= var24) {
					arg3 += arg8 + arg5;
					arg4 += arg5 + arg7;
					continue;
				}
				var24 -= var26;
			} else {
				var26 = var23 - var19;
				if (var26 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg7 + arg5;
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
				int var28 = arg0[arg3++] & 0xFF;
				if (var28 == 0) {
					arg4++;
				} else {
					int var29 = ((arg2 & 0xFF00FF) * var28 & 0xFF00FF00) + (var28 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
					var28 = 256 - var28;
					int var30 = arg1[arg4];
					arg1[arg4++] = ((var28 * (var30 & 0xFF00FF) & 0xFF00FF00) + ((var30 & 0xFF00) * var28 & 0xFF0000) >> 8) + var29;
				}
			}
			arg3 += arg8 + var26;
			arg4 += var26 + arg7;
		}
	}

	public void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var9 = this.anIntArray7375[arg0];
		int var10 = this.anIntArray7376[arg0];
		int var11 = this.aClass_ra_Sub3_7378.anInt8618;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623) {
			var16 = this.aClass_ra_Sub3_7378.anInt8623 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7378.anInt8624) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7378.anInt8624;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621) {
			var16 = this.aClass_ra_Sub3_7378.anInt8621 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7378.anInt8635) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7378.anInt8635;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 > 0 && var10 > 0) {
			this.method2620(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7375[arg0], arg5, arg6, arg7);
		}
	}

	public void method2621(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = -arg5; var11 < 0; var11++) {
				int var12 = arg0[arg3++] & 0xFF;
				if (var12 == 0) {
					arg4++;
				} else {
					int var13 = ((arg2 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg2 & 0xFF00) * var12 & 0xFF0000) >> 8;
					var12 = 256 - var12;
					int var14 = arg1[arg4];
					arg1[arg4++] = (((var14 & 0xFF00) * var12 & 0xFF0000) + ((var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8) + var13;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	public void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var9 = this.anIntArray7375[arg0];
		int var10 = this.anIntArray7376[arg0];
		int var11 = this.aClass_ra_Sub3_7378.anInt8618 * -29235085 * -1504772933;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7378.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7378.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7378.anInt8635 * -711985315 * -1071049483;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 > 0 && var10 > 0) {
			this.method2620(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7375[arg0], arg5, arg6, arg7);
		}
	}

	public void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var9 = this.anIntArray7375[arg0];
		int var10 = this.anIntArray7376[arg0];
		int var11 = this.aClass_ra_Sub3_7378.anInt8618 * -29235085 * -1504772933;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7378.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7378.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7378.anInt8635 * -711985315 * -1071049483;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 > 0 && var10 > 0) {
			this.method2620(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7375[arg0], arg5, arg6, arg7);
		}
	}

	public void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var9 = this.anIntArray7375[arg0];
		int var10 = this.anIntArray7376[arg0];
		int var11 = this.aClass_ra_Sub3_7378.anInt8618 * -29235085 * -1504772933;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7378.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7378.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7378.anInt8635 * -711985315 * -1071049483;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 > 0 && var10 > 0) {
			this.method2620(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7375[arg0], arg5, arg6, arg7);
		}
	}

	public void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		if (arg5 == null) {
			this.UA(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var9 = this.anIntArray7375[arg0];
		int var10 = this.anIntArray7376[arg0];
		int var11 = this.aClass_ra_Sub3_7378.anInt8618 * -29235085 * -1504772933;
		int var12 = arg2 * var11 + arg1;
		int var13 = var11 - var9;
		int var14 = 0;
		int var15 = 0;
		int var16;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623 * 766013039 * -1679642481) {
			var16 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039 - arg2;
			var10 -= var16;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039;
			var15 += var16 * var9;
			var12 += var16 * var11;
		}
		if (var10 + arg2 > this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163) {
			var10 -= var10 + arg2 - this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929) {
			var16 = this.aClass_ra_Sub3_7378.anInt8621 * 1907727929 * 512290825 - arg1;
			var9 -= var16;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929;
			var15 += var16;
			var12 += var16;
			var14 += var16;
			var13 += var16;
		}
		if (arg1 + var9 > this.aClass_ra_Sub3_7378.anInt8635 * -1071049483 * -711985315) {
			var16 = arg1 + var9 - this.aClass_ra_Sub3_7378.anInt8635 * -711985315 * -1071049483;
			var9 -= var16;
			var14 += var16;
			var13 += var16;
		}
		if (var9 > 0 && var10 > 0) {
			this.method2620(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var15, var12, var9, var10, var13, var14, arg1, arg2, this.anIntArray7375[arg0], arg5, arg6, arg7);
		}
	}

	@ObfuscatedName("Class263_Sub2.c(CIIIZ)V")
	public void c(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.aClass_ra_Sub3_7378.anIntArray8630 == null) {
			return;
		}
		arg1 += this.anIntArray7373[arg0];
		arg2 += this.anIntArray7377[arg0];
		int var6 = this.anIntArray7375[arg0];
		int var7 = this.anIntArray7376[arg0];
		int var8 = this.aClass_ra_Sub3_7378.anInt8618 * -1504772933 * -29235085;
		int var9 = var8 * arg2 + arg1;
		int var10 = var8 - var6;
		int var11 = 0;
		int var12 = 0;
		int var13;
		if (arg2 < this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039) {
			var13 = this.aClass_ra_Sub3_7378.anInt8623 * 766013039 * -1679642481 - arg2;
			var7 -= var13;
			arg2 = this.aClass_ra_Sub3_7378.anInt8623 * -1679642481 * 766013039;
			var12 += var6 * var13;
			var9 += var13 * var8;
		}
		if (arg2 + var7 > this.aClass_ra_Sub3_7378.anInt8624 * -550983163 * 31822541) {
			var7 -= arg2 + var7 - this.aClass_ra_Sub3_7378.anInt8624 * 31822541 * -550983163;
		}
		if (arg1 < this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929) {
			var13 = this.aClass_ra_Sub3_7378.anInt8621 * 512290825 * 1907727929 - arg1;
			var6 -= var13;
			arg1 = this.aClass_ra_Sub3_7378.anInt8621 * 1907727929 * 512290825;
			var12 += var13;
			var9 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 + arg1 > this.aClass_ra_Sub3_7378.anInt8635 * -711985315 * -1071049483) {
			var13 = arg1 + var6 - this.aClass_ra_Sub3_7378.anInt8635 * -1071049483 * -711985315;
			var6 -= var13;
			var11 += var13;
			var10 += var13;
		}
		if (var6 > 0 && var7 > 0) {
			this.method2621(this.aByteArrayArray7374[arg0], this.aClass_ra_Sub3_7378.anIntArray8630, arg3, var12, var9, var6, var7, var10, var11);
		}
	}

	public static final boolean method2622(int arg0, int arg1, boolean arg2, Class366 arg3, int arg4) {
		try {
			int var5 = myPlayer.anIntArray10018[0];
			int var6 = myPlayer.anIntArray10059[0];
			if (var5 < 0 || var5 >= client.aClass304_9030.method2990(-565027800) || var6 < 0 || var6 >= client.aClass304_9030.method3033((byte) -69)) {
				return false;
			} else if (arg0 >= 0 && arg0 < client.aClass304_9030.method2990(-576109981) && arg1 >= 0 && arg1 < client.aClass304_9030.method3033((byte) 10)) {
				int var7 = Class166_Sub1.method2000(var5, var6, myPlayer.method5453(-1986369767), arg3, client.aClass304_9030.method2996(myPlayer.aByte8658, 1875135057), arg2, client.anIntArray9051, client.anIntArray9052, -1660836904);
				if (var7 < 1) {
					return false;
				}
				Class9.anInt146 = client.anIntArray9051[var7 - 1];
				Class9.anInt151 = client.anIntArray9052[var7 - 1];
				Class9.aBoolean141 = false;
				Class444.method5617(-1805657690);
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "zc.jz(" + ')');
		}
	}

	public static boolean method2623(int arg0, int arg1) {
		try {
			if (arg0 != Class96.anInt852 || Class532.aClass78_6455 == null) {
				Class515.method6204(1029685726);
				Class532.aClass78_6455 = Class78.aClass78_658;
				Class96.anInt852 = arg0;
			}
			int var4;
			int var5;
			int var6;
			if (Class532.aClass78_6455 == Class78.aClass78_658) {
				byte[] var2 = Class76_Sub1.aClass280_7096.method2761(arg0, 1242349452);
				if (var2 == null) {
					return false;
				}
				Buffer var3 = new Buffer(var2);
				Class102.method1221(var3, -1103105312);
				var4 = var3.readUnsignedByte(2127978255);
				for (var5 = 0; var5 < var4; var5++) {
					Class96.aClass471_856.method5878(new Class330_Sub17(var3), (short) 8192);
				}
				var5 = var3.readSmart(33103985);
				Class96.aClass79Array853 = new Class79[var5];
				for (var6 = 0; var6 < var5; var6++) {
					Class96.aClass79Array853[var6] = new Class79(var3);
				}
				var6 = var3.readSmart(-897476786);
				Class96.aClass85Array854 = new Class85[var6];
				int var7;
				for (var7 = 0; var7 < var6; var7++) {
					Class96.aClass85Array854[var7] = new Class85(var3, var7);
				}
				var7 = var3.readSmart(-1937605720);
				Class96.aClass88Array855 = new Class88[var7];
				int var8;
				for (var8 = 0; var8 < var7; var8++) {
					Class96.aClass88Array855[var8] = new Class88(var3);
				}
				var8 = var3.readSmart(-362107676);
				Class96.aClass89Array862 = new Class89[var8];
				int var9;
				for (var9 = 0; var9 < var8; var9++) {
					Class96.aClass89Array862[var9] = new Class89(var3);
				}
				var9 = var3.readSmart(240093679);
				Class467.aClass95Array5599 = new Class95[var9];
				for (int var10 = 0; var10 < var9; var10++) {
					Class467.aClass95Array5599[var10] = Class360.method4243(var3, 1199095423);
				}
				Class532.aClass78_6455 = Class78.aClass78_657;
			}
			if (Class78.aClass78_657 == Class532.aClass78_6455) {
				boolean var12 = true;
				Class85[] var13 = Class96.aClass85Array854;
				for (var4 = 0; var4 < var13.length; var4++) {
					Class85 var15 = var13[var4];
					if (!var15.method969((short) -1939)) {
						var12 = false;
					}
				}
				Class95[] var14 = Class467.aClass95Array5599;
				for (var5 = 0; var5 < var14.length; var5++) {
					Class95 var17 = var14[var5];
					if (!var17.method1097(570286388)) {
						var12 = false;
					}
				}
				Class88[] var16 = Class96.aClass88Array855;
				for (var6 = 0; var6 < var16.length; var6++) {
					Class88 var18 = var16[var6];
					if (!var18.method1050(-898509977)) {
						var12 = false;
					}
				}
				if (!var12) {
					return false;
				}
				Class532.aClass78_6455 = Class78.aClass78_656;
			}
			return true;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "zc.r(" + ')');
		}
	}

	public static String method2624(long arg0, int arg1, int arg2) {
		try {
			Class452.method5637(arg0);
			int var4 = Class528.aCalendar6215.get(5);
			int var5 = Class528.aCalendar6215.get(2);
			int var6 = Class528.aCalendar6215.get(1);
			return arg1 == 3 ? Class343.method4000(arg0, arg1, 1009690702) : Integer.toString(var4 / 10) + var4 % 10 + "-" + Class528.aStringArrayArray6216[arg1][var5] + "-" + var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "zc.r(" + ')');
		}
	}

	public static void method2625(byte arg0) {
		try {
			for (int var1 = 0; var1 < Class333.anInt3360; var1++) {
				Class316 var2 = Class333.aClass316Array3347[var1];
				if (var2.aByte3266 == 3) {
					OutgoingPacket.method2367(var2, -209745817);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zc.t(" + ')');
		}
	}
}
