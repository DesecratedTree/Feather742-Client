package deob;

public class Class358 {

	public static float aFloat3705 = 3.0F;

	public static int anInt3709 = 100;

	public static int anInt3734 = 10;

	public boolean aBoolean3724 = true;

	public boolean aBoolean3706 = true;

	public boolean aBoolean3712 = false;

	public int anInt3726 = 0;

	public float[] aFloatArray3731 = new float[3];

	public int[] anIntArray3732 = new int[2];

	public int anInt3733 = -1;

	public int anInt3725 = -1;

	public boolean aBoolean3735 = true;

	public int anInt3728;

	public int anInt3714;

	public Class356 aClass356_3710;

	public Class385[] aClass385Array3730;

	public int anInt3715;

	public Class385[] aClass385Array3719;

	public int anInt3718;

	public Class385[] aClass385Array3721;

	public int anInt3720;

	public Class385[] aClass385Array3723;

	public int[][][] anIntArrayArrayArray3713;

	public Class347 aClass347_3711;

	public static Class_ra aClass_ra3716;

	public int[] anIntArray3707;

	public int[] anIntArray3708;

	public int[] anIntArray3717;

	public int[] anIntArray3722;

	public int[] anIntArray3727;

	public int[] anIntArray3729;

	public Class358(Class356 arg0) {
		this.anInt3728 = arg0.anInt3656;
		this.anInt3714 = arg0.anInt3656;
		this.aClass356_3710 = arg0;
		this.aClass385Array3730 = new Class385[549];
		this.anInt3715 = 0;
		this.aClass385Array3719 = new Class385[2049];
		this.anInt3718 = 0;
		this.aClass385Array3721 = new Class385[1001];
		this.anInt3720 = 0;
		this.aClass385Array3723 = new Class385[1049];
		this.anInt3726 = 0;
		this.anIntArrayArrayArray3713 = new int[this.aClass356_3710.anInt3650][this.aClass356_3710.anInt3667 + 1][this.aClass356_3710.anInt3654 + 1];
		this.aBoolean3712 = false;
		if (this.aClass356_3710.aClass_ra3645 instanceof ja) {
			this.aBoolean3724 = false;
		} else {
			this.aBoolean3724 = true;
		}
		if (this.aBoolean3724) {
			this.aClass347_3711 = new Class347(this);
		}
	}

	public void method4216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			Class340 var13 = this.aClass356_3710.aClass340ArrayArrayArray3653[arg1][arg2][arg3];
			if (var13 == null) {
				this.aClass356_3710.aClass340ArrayArrayArray3653[arg1][arg2][arg3] = var13 = new Class340(arg1);
			}
			if (arg0 == 1) {
				var13.aShort3392 = (short) arg4;
				var13.aShort3387 = (short) arg5;
			} else if (arg0 == 2) {
				var13.aShort3389 = (short) arg4;
				var13.aShort3390 = (short) arg5;
			}
			if (this.aBoolean3712) {
				this.method4221();
			}
			return;
		}
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		if (arg0 != 8) {
			var7 = (arg2 << this.aClass356_3710.anInt3641) + this.aClass356_3710.anInt3656;
			var8 = var7 - this.aClass356_3710.anInt3656;
			var9 = arg3 << this.aClass356_3710.anInt3641;
			var10 = var9 + this.aClass356_3710.anInt3656;
			var11 = this.aClass356_3710.aClass_xaArray3701[arg1].method6417(arg2 + 1, arg3, 1333662320);
			var12 = this.aClass356_3710.aClass_xaArray3701[arg1].method6417(arg2, arg3 + 1, -1656362526);
			this.aClass385Array3721[this.anInt3720++] = new Class385(this.aClass356_3710, arg0, arg1, var7, var8, var8, var7, var11, var12, var12 - arg4, var11 - arg4, var9, var10, var10, var9);
			return;
		}
		var7 = arg2 << this.aClass356_3710.anInt3641;
		var8 = var7 + this.aClass356_3710.anInt3656;
		var9 = arg3 << this.aClass356_3710.anInt3641;
		var10 = var9 + this.aClass356_3710.anInt3656;
		var11 = this.aClass356_3710.aClass_xaArray3701[arg1].method6417(arg2, arg3, -497011610);
		var12 = this.aClass356_3710.aClass_xaArray3701[arg1].method6417(arg2 + 1, arg3 + 1, -2047706292);
		this.aClass385Array3721[this.anInt3720++] = new Class385(this.aClass356_3710, arg0, arg1, var7, var8, var8, var7, var11, var12, var12 - arg4, var11 - arg4, var9, var10, var10, var9);
	}

	public void method4217(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			Class340 var7 = this.aClass356_3710.aClass340ArrayArrayArray3653[arg1][arg2][arg3];
			if (var7 != null) {
				if (arg0 == 1) {
					var7.aShort3392 = 0;
				} else if (arg0 == 2) {
					var7.aShort3389 = 0;
				}
			}
			this.method4221();
			return;
		}
		for (int var5 = 0; var5 < this.anInt3720; var5++) {
			Class385 var6 = this.aClass385Array3721[var5];
			if (var6.aByte3975 == arg0 && var6.aByte3972 == arg1 && (var6.aShort3977 == arg2 && var6.aShort3971 == arg3 || var6.aShort3978 == arg2 && var6.aShort3980 == arg3)) {
				if (var5 != this.anInt3720) {
					System.arraycopy(this.aClass385Array3721, var5 + 1, this.aClass385Array3721, var5, this.aClass385Array3721.length - (var5 + 1));
				}
				this.anInt3720--;
				break;
			}
		}
	}

	public void method4218() {
		this.method4221();
	}

	public boolean method4219(int arg0, int arg1, int arg2) {
		if (!this.aBoolean3724 || !this.aBoolean3706) {
			return false;
		} else if (this.aClass347_3711.anInt3432 < 100) {
			return false;
		} else {
			int var4 = this.anIntArrayArrayArray3713[arg0][arg1][arg2];
			if (var4 == -this.aClass356_3710.anInt3682) {
				return false;
			} else if (var4 == this.aClass356_3710.anInt3682) {
				return true;
			} else if (this.aClass356_3710.aClass_xaArray3676 == this.aClass356_3710.aClass_xaArray3658) {
				return false;
			} else {
				int var5 = arg1 << this.aClass356_3710.anInt3641;
				int var6 = arg2 << this.aClass356_3710.anInt3641;
				if (this.method4229(var5 + 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1, arg2, -810122471), var6 + 1, var5 + this.aClass356_3710.anInt3656 - 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1 + 1, arg2 + 1, 1686219418), var6 + this.aClass356_3710.anInt3656 - 1, var5 + 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1, arg2 + 1, 1387631521), var6 + this.aClass356_3710.anInt3656 - 1) && this.method4229(var5 + 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1, arg2, -135559782), var6 + 1, var5 + this.aClass356_3710.anInt3656 - 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1 + 1, arg2, 1906630126), var6 + 1, var5 + this.aClass356_3710.anInt3656 - 1, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1 + 1, arg2 + 1, -738347726), var6 + this.aClass356_3710.anInt3656 - 1)) {
					this.anIntArrayArrayArray3713[arg0][arg1][arg2] = this.aClass356_3710.anInt3682;
					return true;
				} else {
					this.anIntArrayArrayArray3713[arg0][arg1][arg2] = -this.aClass356_3710.anInt3682;
					return false;
				}
			}
		}
	}

	public final boolean method4220(int arg0, int arg1, int arg2) {
		aClass_ra3716.method_do((float) arg0, (float) arg1, (float) arg2, this.aFloatArray3731);
		if (this.aFloatArray3731[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray3731[0] /= 3.0F;
			this.aFloatArray3731[1] /= 3.0F;
			return true;
		}
	}

	public void method4221() {
		int var1;
		for (var1 = 0; var1 < this.anInt3718; var1++) {
			this.aClass385Array3719[var1] = null;
		}
		this.anInt3718 = 0;
		int var2;
		int var3;
		Class340 var4;
		for (var1 = 0; var1 < this.aClass356_3710.anInt3650; var1++) {
			for (var2 = 0; var2 < this.aClass356_3710.anInt3667; var2++) {
				for (var3 = 0; var3 < this.aClass356_3710.anInt3654; var3++) {
					var4 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var2];
					if (var4 != null) {
						if (var4.aShort3392 > 0) {
							var4.aShort3392 = (short) (var4.aShort3392 * -1);
						}
						if (var4.aShort3389 > 0) {
							var4.aShort3389 = (short) (var4.aShort3389 * -1);
						}
					}
				}
			}
		}
		for (var1 = 0; var1 < this.aClass356_3710.anInt3650; var1++) {
			for (var2 = 0; var2 < this.aClass356_3710.anInt3667; var2++) {
				for (var3 = 0; var3 < this.aClass356_3710.anInt3654; var3++) {
					var4 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var2];
					if (var4 != null) {
						boolean var5 = this.aClass356_3710.aClass340ArrayArrayArray3653[0][var3][var2] != null && this.aClass356_3710.aClass340ArrayArrayArray3653[0][var3][var2].aClass340_3380 != null;
						int var6;
						int var7;
						int var9;
						Class340 var10;
						int var11;
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int var17;
						int var18;
						int var19;
						int var20;
						int var21;
						if (var4.aShort3392 < 0) {
							var6 = var2;
							var7 = var2;
							var9 = var1;
							var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var2 - 1];
							var11 = this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var2, 898360984);
							while (var6 > 0 && var10 != null && var10.aShort3392 < 0 && var10.aShort3392 == var4.aShort3392 && var10.aShort3387 == var4.aShort3387 && var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var6 - 1, 2137212182) && (var6 - 1 <= 0 || var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var6 - 2, 1401278260)) && var7 - var6 <= 10) {
								var6--;
								var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var6 - 1];
							}
							for (var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var7 + 1]; var7 < this.aClass356_3710.anInt3654 && var10 != null && var10.aShort3392 < 0 && var10.aShort3392 == var4.aShort3392 && var10.aShort3387 == var4.aShort3387 && var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var7 + 1, 2047896844) && (var7 + 1 >= this.aClass356_3710.anInt3654 || var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var7 + 2, -533453240)) && var7 - var6 <= 10; var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3][var7 + 1]) {
								var7++;
							}
							var12 = var1 - var1 + 1;
							var13 = this.aClass356_3710.aClass_xaArray3701[var5 ? var1 + 1 : var1].method6417(var3, var6, -49512996);
							var14 = var13 + var4.aShort3392 * var12;
							var15 = this.aClass356_3710.aClass_xaArray3701[var5 ? var1 + 1 : var1].method6417(var3, var7 + 1, 2110811991);
							var16 = var15 + var4.aShort3392 * var12;
							var17 = var3 << this.aClass356_3710.anInt3641;
							var18 = var6 << this.aClass356_3710.anInt3641;
							var19 = (var7 << this.aClass356_3710.anInt3641) + this.aClass356_3710.anInt3656;
							this.aClass385Array3719[this.anInt3718++] = new Class385(this.aClass356_3710, 1, var1, var17 + var4.aShort3387, var17 + var4.aShort3387, var17 + var4.aShort3387, var17 + var4.aShort3387, var13, var15, var16, var14, var18, var19, var19, var18);
							for (var20 = var1; var20 <= var9; var20++) {
								for (var21 = var6; var21 <= var7; var21++) {
									this.aClass356_3710.aClass340ArrayArrayArray3653[var20][var3][var21].aShort3392 = (short) (this.aClass356_3710.aClass340ArrayArrayArray3653[var20][var3][var21].aShort3392 * -1);
								}
							}
						}
						if (var4.aShort3389 < 0) {
							var6 = var3;
							var7 = var3;
							var9 = var1;
							var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var3 - 1][var2];
							var11 = this.aClass356_3710.aClass_xaArray3701[var1].method6417(var3, var2, 1744796133);
							while (var6 > 0 && var10 != null && var10.aShort3389 < 0 && var10.aShort3389 == var4.aShort3389 && var10.aShort3390 == var4.aShort3390 && var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var6 - 1, var2, 737759792) && (var6 - 1 <= 0 || var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var6 - 2, var2, 492325148)) && var7 - var6 <= 10) {
								var6--;
								var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var6 - 1][var2];
							}
							for (var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var7 + 1][var2]; var7 < this.aClass356_3710.anInt3667 && var10 != null && var10.aShort3389 < 0 && var10.aShort3389 == var4.aShort3389 && var10.aShort3390 == var4.aShort3390 && var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var7 + 1, var2, -1363578179) && (var7 + 1 >= this.aClass356_3710.anInt3667 || var11 == this.aClass356_3710.aClass_xaArray3701[var1].method6417(var7 + 2, var2, 914971992)) && var7 - var6 <= 10; var10 = this.aClass356_3710.aClass340ArrayArrayArray3653[var1][var7 + 1][var2]) {
								var7++;
							}
							var12 = var1 - var1 + 1;
							var13 = this.aClass356_3710.aClass_xaArray3701[var5 ? var1 + 1 : var1].method6417(var6, var2, -1210976807);
							var14 = var13 + var4.aShort3389 * var12;
							var15 = this.aClass356_3710.aClass_xaArray3701[var5 ? var1 + 1 : var1].method6417(var7 + 1, var2, 1791576999);
							var16 = var15 + var4.aShort3389 * var12;
							var17 = var6 << this.aClass356_3710.anInt3641;
							var18 = (var7 << this.aClass356_3710.anInt3641) + this.aClass356_3710.anInt3656;
							var19 = var2 << this.aClass356_3710.anInt3641;
							this.aClass385Array3719[this.anInt3718++] = new Class385(this.aClass356_3710, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.aShort3390, var19 + var4.aShort3390, var19 + var4.aShort3390, var19 + var4.aShort3390);
							for (var20 = var1; var20 <= var9; var20++) {
								for (var21 = var6; var21 <= var7; var21++) {
									this.aClass356_3710.aClass340ArrayArrayArray3653[var20][var21][var2].aShort3389 = (short) (this.aClass356_3710.aClass340ArrayArrayArray3653[var20][var21][var2].aShort3389 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean3712 = true;
	}

	public void method4222(Class_ra arg0, int arg1) {
		aClass_ra3716 = arg0;
		if (!this.aBoolean3724 || !this.aBoolean3706) {
			this.anInt3726 = 0;
			return;
		}
		if (this.aBoolean3735) {
			this.aClass356_3710.aClass509_3646.method6161(1688032175);
		}
		aClass_ra3716.method4803(this.anIntArray3732);
		if (this.anInt3733 != (int) ((float) this.anIntArray3732[0] / 3.0F) || this.anInt3725 != (int) ((float) this.anIntArray3732[1] / 3.0F)) {
			this.anInt3733 = (int) ((float) this.anIntArray3732[0] / 3.0F);
			this.anInt3725 = (int) ((float) this.anIntArray3732[1] / 3.0F);
			this.anIntArray3717 = new int[this.anInt3733 * this.anInt3725];
		}
		this.anInt3726 = 0;
		int var3;
		for (var3 = 0; var3 < this.anInt3715; var3++) {
			this.method4231(aClass_ra3716, this.aClass385Array3730[var3], arg1);
		}
		for (var3 = 0; var3 < this.anInt3718; var3++) {
			this.method4231(aClass_ra3716, this.aClass385Array3719[var3], arg1);
		}
		for (var3 = 0; var3 < this.anInt3720; var3++) {
			this.method4231(aClass_ra3716, this.aClass385Array3721[var3], arg1);
		}
		this.aClass347_3711.anInt3432 = 0;
		if (this.anInt3726 > 0) {
			var3 = this.anIntArray3717.length;
			int var4 = var3 - var3 & 0x7;
			int var5 = 0;
			while (var5 < var4) {
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
			}
			while (var5 < var3) {
				this.anIntArray3717[var5++] = Integer.MAX_VALUE;
			}
			this.aClass347_3711.anInt3431 = 1;
			for (int var6 = 0; var6 < this.anInt3726; var6++) {
				Class385 var7 = this.aClass385Array3723[var6];
				this.aClass347_3711.method4017(var7.aShortArray3985[0], var7.aShortArray3985[1], var7.aShortArray3985[3], var7.aShortArray3981[0], var7.aShortArray3981[1], var7.aShortArray3981[3], var7.aShortArray3986[0], var7.aShortArray3986[1], var7.aShortArray3986[3]);
				this.aClass347_3711.method4017(var7.aShortArray3985[1], var7.aShortArray3985[2], var7.aShortArray3985[3], var7.aShortArray3981[1], var7.aShortArray3981[2], var7.aShortArray3981[3], var7.aShortArray3986[1], var7.aShortArray3986[2], var7.aShortArray3986[3]);
			}
			this.aClass347_3711.anInt3431 = 2;
		}
		if (this.aBoolean3735) {
			this.aClass356_3710.aClass509_3646.method6161(1688032175);
		}
	}

	public boolean method4223(int arg0, int arg1, int arg2, int arg3) {
		if (!this.aBoolean3724 || !this.aBoolean3706) {
			return false;
		} else if (this.aClass347_3711.anInt3432 < 100) {
			return false;
		} else if (this.method4219(arg0, arg1, arg2)) {
			int var5 = arg1 << this.aClass356_3710.anInt3641;
			int var6 = arg2 << this.aClass356_3710.anInt3641;
			return this.method4225(var5, this.aClass356_3710.aClass_xaArray3676[arg0].method6417(arg1, arg2, 314993764), var6, this.aClass356_3710.anInt3656, arg3, this.aClass356_3710.anInt3656);
		} else {
			return false;
		}
	}

	public final boolean method4224(Class348 arg0) {
		return arg0 == null ? false : this.method4225(arg0.anInt3439, arg0.anInt3435, arg0.anInt3440, arg0.anInt3441 - arg0.anInt3439, arg0.anInt3443 - arg0.anInt3435, arg0.anInt3444 - arg0.anInt3440);
	}

	public final boolean method4225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 + arg3;
		int var8 = arg1 + arg4;
		int var9 = arg2 + arg5;
		if (!this.method4229(arg0, var8, arg2, var7, var8, var9, arg0, var8, var9)) {
			return false;
		} else if (this.method4229(arg0, var8, arg2, var7, var8, arg2, var7, var8, var9)) {
			if (arg0 < this.aClass356_3710.anInt3665) {
				if (!this.method4229(arg0, arg1, var9, arg0, var8, arg2, arg0, var8, var9)) {
					return false;
				}
				if (!this.method4229(arg0, arg1, var9, arg0, arg1, arg2, arg0, var8, arg2)) {
					return false;
				}
			} else if (!this.method4229(var7, arg1, var9, var7, var8, arg2, var7, var8, var9)) {
				return false;
			} else if (!this.method4229(var7, arg1, var9, var7, arg1, arg2, var7, var8, arg2)) {
				return false;
			}
			if (arg2 < this.aClass356_3710.anInt3680) {
				if (!this.method4229(arg0, arg1, arg2, var7, var8, arg2, arg0, var8, arg2)) {
					return false;
				}
				if (!this.method4229(arg0, arg1, arg2, var7, arg1, arg2, var7, var8, arg2)) {
					return false;
				}
			} else if (!this.method4229(arg0, arg1, var9, var7, var8, var9, arg0, var8, var9)) {
				return false;
			} else if (!this.method4229(arg0, arg1, var9, var7, arg1, var9, var7, var8, var9)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public void method4226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.aClass385Array3730[this.anInt3715++] = new Class385(this.aClass356_3710, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	public boolean method4227(int arg0, int arg1, int arg2, int arg3, int arg4, Class348 arg5) {
		if (!this.aBoolean3724 || !this.aBoolean3706) {
			return false;
		} else if (this.aClass347_3711.anInt3432 < 100) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (int var7 = arg1; var7 <= arg2; var7++) {
				for (int var8 = arg3; var8 <= arg4; var8++) {
					if (this.anIntArrayArrayArray3713[arg0][var7][var8] == -this.aClass356_3710.anInt3682) {
						return false;
					}
				}
			}
			if (this.method4224(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method4219(arg0, arg1, arg3)) {
			return this.method4224(arg5);
		} else {
			return false;
		}
	}

	public boolean method4228(Class385 arg0, int arg1) {
		if (this.method4220(arg0.anIntArray3979[arg1], arg0.anIntArray3982[arg1], arg0.anIntArray3983[arg1])) {
			arg0.aShortArray3981[arg1] = (short) this.aFloatArray3731[0];
			arg0.aShortArray3985[arg1] = (short) this.aFloatArray3731[1];
			arg0.aShortArray3986[arg1] = (short) this.aFloatArray3731[2];
			return true;
		} else {
			return false;
		}
	}

	public final boolean method4229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (!this.method4220(arg0, arg1, arg2)) {
			return false;
		}
		int var10 = (int) this.aFloatArray3731[0];
		int var11 = (int) this.aFloatArray3731[1];
		int var12 = (int) this.aFloatArray3731[2];
		if (!this.method4220(arg3, arg4, arg5)) {
			return false;
		}
		int var13 = (int) this.aFloatArray3731[0];
		int var14 = (int) this.aFloatArray3731[1];
		int var15 = (int) this.aFloatArray3731[2];
		if (this.method4220(arg6, arg7, arg8)) {
			int var16 = (int) this.aFloatArray3731[0];
			int var17 = (int) this.aFloatArray3731[1];
			int var18 = (int) this.aFloatArray3731[2];
			return this.aClass347_3711.method4017(var11, var14, var17, var10, var13, var16, var12, var15, var18);
		} else {
			return false;
		}
	}

	public boolean method4230(Class432_Sub1_Sub5 arg0, int arg1, int arg2, int arg3) {
		if (!this.aBoolean3724 || !this.aBoolean3706) {
			return false;
		} else if (this.aClass347_3711.anInt3432 < 100) {
			return false;
		} else if (this.method4219(arg1, arg2, arg3)) {
			int var5 = arg2 << this.aClass356_3710.anInt3641;
			int var6 = arg3 << this.aClass356_3710.anInt3641;
			int var7 = this.aClass356_3710.aClass_xaArray3676[arg1].method6417(arg2, arg3, 1897311919) - 1;
			int var8 = var7 + arg0.method5370(-1863971100);
			if (arg0.aShort9931 == 1) {
				if (this.method4229(var5, var7, var6, var5, var8, var6, var5, var8, var6 + this.aClass356_3710.anInt3656)) {
					return this.method4229(var5, var7, var6, var5, var8, var6 + this.aClass356_3710.anInt3656, var5, var7, var6 + this.aClass356_3710.anInt3656);
				} else {
					return false;
				}
			} else if (arg0.aShort9931 == 2) {
				if (this.method4229(var5, var7, var6 + this.aClass356_3710.anInt3656, var5 + this.aClass356_3710.anInt3656, var8, var6 + this.aClass356_3710.anInt3656, var5, var8, var6 + this.aClass356_3710.anInt3656)) {
					return this.method4229(var5, var7, var6 + this.aClass356_3710.anInt3656, var5 + this.aClass356_3710.anInt3656, var7, var6 + this.aClass356_3710.anInt3656, var5 + this.aClass356_3710.anInt3656, var8, var6 + this.aClass356_3710.anInt3656);
				} else {
					return false;
				}
			} else if (arg0.aShort9931 == 4) {
				if (this.method4229(var5 + this.aClass356_3710.anInt3656, var7, var6, var5 + this.aClass356_3710.anInt3656, var8, var6, var5 + this.aClass356_3710.anInt3656, var8, var6 + this.aClass356_3710.anInt3656)) {
					return this.method4229(var5 + this.aClass356_3710.anInt3656, var7, var6, var5 + this.aClass356_3710.anInt3656, var8, var6 + this.aClass356_3710.anInt3656, var5 + this.aClass356_3710.anInt3656, var7, var6 + this.aClass356_3710.anInt3656);
				} else {
					return false;
				}
			} else if (arg0.aShort9931 == 8) {
				if (this.method4229(var5, var7, var6, var5 + this.aClass356_3710.anInt3656, var8, var6, var5, var8, var6)) {
					return this.method4229(var5, var7, var6, var5 + this.aClass356_3710.anInt3656, var7, var6, var5 + this.aClass356_3710.anInt3656, var8, var6);
				} else {
					return false;
				}
			} else if (arg0.aShort9931 == 16) {
				return this.method4225(var5, var7, var6 + this.aClass356_3710.anInt3643, this.aClass356_3710.anInt3643, var8, this.aClass356_3710.anInt3643);
			} else if (arg0.aShort9931 == 32) {
				return this.method4225(var5 + this.aClass356_3710.anInt3643, var7, var6 + this.aClass356_3710.anInt3643, this.aClass356_3710.anInt3643, var8, this.aClass356_3710.anInt3643);
			} else if (arg0.aShort9931 == 64) {
				return this.method4225(var5 + this.aClass356_3710.anInt3643, var7, var6, this.aClass356_3710.anInt3643, var8, this.aClass356_3710.anInt3643);
			} else if (arg0.aShort9931 == 128) {
				return this.method4225(var5, var7, var6, this.aClass356_3710.anInt3643, var8, this.aClass356_3710.anInt3643);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public void method4231(Class_ra arg0, Class385 arg1, int arg2) {
		aClass_ra3716 = arg0;
		int var4;
		if (this.anIntArray3708 != null && arg1.aByte3972 >= arg2) {
			for (var4 = 0; var4 < this.anIntArray3708.length; var4++) {
				if (this.anIntArray3708[var4] != -1000000 && (arg1.anIntArray3982[0] <= this.anIntArray3708[var4] || arg1.anIntArray3982[1] <= this.anIntArray3708[var4] || arg1.anIntArray3982[2] <= this.anIntArray3708[var4] || arg1.anIntArray3982[3] <= this.anIntArray3708[var4]) && (arg1.anIntArray3979[0] <= this.anIntArray3707[var4] || arg1.anIntArray3979[1] <= this.anIntArray3707[var4] || arg1.anIntArray3979[2] <= this.anIntArray3707[var4] || arg1.anIntArray3979[3] <= this.anIntArray3707[var4]) && (arg1.anIntArray3979[0] >= this.anIntArray3722[var4] || arg1.anIntArray3979[1] >= this.anIntArray3722[var4] || arg1.anIntArray3979[2] >= this.anIntArray3722[var4] || arg1.anIntArray3979[3] >= this.anIntArray3722[var4]) && (arg1.anIntArray3983[0] <= this.anIntArray3727[var4] || arg1.anIntArray3983[1] <= this.anIntArray3727[var4] || arg1.anIntArray3983[2] <= this.anIntArray3727[var4] || arg1.anIntArray3983[3] <= this.anIntArray3727[var4]) && (arg1.anIntArray3983[0] >= this.anIntArray3729[var4] || arg1.anIntArray3983[1] >= this.anIntArray3729[var4] || arg1.anIntArray3983[2] >= this.anIntArray3729[var4] || arg1.anIntArray3983[3] >= this.anIntArray3729[var4])) {
					return;
				}
			}
		}
		int var5;
		int var6;
		boolean var7;
		float var8;
		if (arg1.aByte3975 == 1) {
			var4 = arg1.aShort3977 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
			if (var4 >= 0 && var4 <= this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
				var5 = arg1.aShort3971 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					return;
				}
				var6 = arg1.aShort3980 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
				if (var6 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					var6 = this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673;
				} else if (var6 < 0) {
					return;
				}
				var7 = false;
				while (var5 <= var6) {
					if (this.aClass356_3710.aBooleanArrayArray3700[var4][var5++]) {
						var7 = true;
						break;
					}
				}
				if (var7) {
					var8 = this.aClass356_3710.anInt3665 - arg1.anIntArray3979[0];
					if (var8 < 0.0F) {
						var8 *= -1.0F;
					}
					if (!(var8 < (float) this.anInt3728) && this.method4228(arg1, 0) && this.method4228(arg1, 1) && this.method4228(arg1, 2) && this.method4228(arg1, 3)) {
						this.aClass385Array3723[this.anInt3726++] = arg1;
					}
				}
			}
		} else if (arg1.aByte3975 == 2) {
			var4 = arg1.aShort3971 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
			if (var4 >= 0 && var4 <= this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
				var5 = arg1.aShort3977 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					return;
				}
				var6 = arg1.aShort3978 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
				if (var6 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					var6 = this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673;
				} else if (var6 < 0) {
					return;
				}
				var7 = false;
				while (var5 <= var6) {
					if (this.aClass356_3710.aBooleanArrayArray3700[var5++][var4]) {
						var7 = true;
						break;
					}
				}
				if (var7) {
					var8 = this.aClass356_3710.anInt3680 - arg1.anIntArray3983[0];
					if (var8 < 0.0F) {
						var8 *= -1.0F;
					}
					if (!(var8 < (float) this.anInt3728) && this.method4228(arg1, 0) && this.method4228(arg1, 1) && this.method4228(arg1, 2) && this.method4228(arg1, 3)) {
						this.aClass385Array3723[this.anInt3726++] = arg1;
					}
				}
			}
		} else if (arg1.aByte3975 == 16 || arg1.aByte3975 == 8) {
			var4 = arg1.aShort3977 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
			if (var4 >= 0 && var4 <= this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
				var5 = arg1.aShort3971 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
				if (var5 >= 0 && var5 <= this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673 && this.aClass356_3710.aBooleanArrayArray3700[var4][var5]) {
					float var13 = (float) (this.aClass356_3710.anInt3665 - arg1.anIntArray3979[0]);
					if (var13 < 0.0F) {
						var13 *= -1.0F;
					}
					float var14 = (float) (this.aClass356_3710.anInt3680 - arg1.anIntArray3983[0]);
					if (var14 < 0.0F) {
						var14 *= -1.0F;
					}
					if ((!(var13 < (float) this.anInt3728) || !(var14 < (float) this.anInt3728)) && this.method4228(arg1, 0) && this.method4228(arg1, 1) && this.method4228(arg1, 2) && this.method4228(arg1, 3)) {
						this.aClass385Array3723[this.anInt3726++] = arg1;
					}
				}
			}
		} else if (arg1.aByte3975 == 4) {
			float var12 = (float) (arg1.anIntArray3982[0] - this.aClass356_3710.anInt3677);
			if (!(var12 <= (float) this.anInt3714)) {
				var5 = arg1.aShort3971 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					return;
				}
				var6 = arg1.aShort3980 - this.aClass356_3710.anInt3651 + this.aClass356_3710.anInt3673;
				if (var6 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					var6 = this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673;
				} else if (var6 < 0) {
					return;
				}
				int var15 = arg1.aShort3977 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					return;
				}
				int var16 = arg1.aShort3978 - this.aClass356_3710.anInt3640 + this.aClass356_3710.anInt3673;
				if (var16 > this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673) {
					var16 = this.aClass356_3710.anInt3673 + this.aClass356_3710.anInt3673;
				} else if (var16 < 0) {
					return;
				}
				boolean var9 = false;
				label214: for (int var10 = var15; var10 <= var16; var10++) {
					for (int var11 = var5; var11 <= var6; var11++) {
						if (this.aClass356_3710.aBooleanArrayArray3700[var10][var11]) {
							var9 = true;
							break label214;
						}
					}
				}
				if (var9 && this.method4228(arg1, 0) && this.method4228(arg1, 1) && this.method4228(arg1, 2) && this.method4228(arg1, 3)) {
					this.aClass385Array3723[this.anInt3726++] = arg1;
				}
			}
		}
	}
}
