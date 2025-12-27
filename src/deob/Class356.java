package deob;

import java.util.Iterator;

public class Class356 {

	public int anInt3644 = 16;

	public int anInt3661 = 0;

	public int anInt3666 = 10080;

	public int anInt3668 = 5006;

	public int anInt3687 = 5046;

	public int anInt3692 = 1;

	public float[] aFloatArray3690;

	public Class330_Sub14[] aClass330_Sub14Array3691;

	public Class_ra aClass_ra3645;

	public boolean aBoolean3647;

	public int anInt3641;

	public int anInt3656;

	public int anInt3643;

	public int anInt3650;

	public int anInt3667;

	public int anInt3654;

	public int anInt3673;

	public Class509 aClass509_3646;

	public Class358 aClass358_3649;

	public Class340[][][] aClass340ArrayArrayArray3655;

	public Class_xa[] aClass_xaArray3701;

	public int[][] anIntArrayArray3683;

	public byte[][] aByteArrayArray3669;

	public short[][] aShortArrayArray3695;

	public byte[][] aByteArrayArray3662;

	public byte[][] aByteArrayArray3663;

	public byte[][] aByteArrayArray3664;

	public Class340[][][] aClass340ArrayArrayArray3657;

	public Class_xa[] aClass_xaArray3658;

	public long[][][] aLongArrayArrayArray3652;

	public Class349[] aClass349Array3679;

	public boolean[] aBooleanArray3659;

	public int anInt3693;

	public Class432_Sub1[] aClass432_Sub1Array3671;

	public Class432_Sub1[] aClass432_Sub1Array3670;

	public Class432_Sub1[] aClass432_Sub1Array3678;

	public Class432_Sub1[] aClass432_Sub1Array3675;

	public int anInt3672;

	public Class432_Sub1[] aClass432_Sub1Array3674;

	public int anInt3681;

	public Class432_Sub1_Sub1[] aClass432_Sub1_Sub1Array3685;

	public boolean[][] aBooleanArrayArray3700;

	public boolean[][] aBooleanArrayArray3698;

	public int[] anIntArray3699;

	public Class338 aClass338_3697;

	public static boolean aBoolean3694 = true;

	public int anInt3640;

	public int anInt3642;

	public int anInt3651;

	public int anInt3665;

	public int anInt3677;

	public int anInt3680;

	public int anInt3682;

	public int anInt3684;

	public int anInt3686;

	public int anInt3688;

	public int anInt3689;

	public int anInt3696;

	public boolean aBoolean3648;

	public Class_xa[] aClass_xaArray3676;

	public boolean[][] aBooleanArrayArray3660;

	public Class340[][][] aClass340ArrayArrayArray3653;

	public Class356(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		this.anInt3668 = 5006;
		this.aFloatArray3690 = new float[3];
		this.aClass330_Sub14Array3691 = new Class330_Sub14[8];
		this.anInt3692 = 1;
		this.aClass_ra3645 = arg0;
		this.aBoolean3647 = this.aClass_ra3645.cr() > 0;
		this.anInt3641 = arg1;
		this.anInt3656 = 0x1 << this.anInt3641;
		this.anInt3643 = this.anInt3656 >> 1;
		this.anInt3650 = arg2;
		this.anInt3667 = arg3;
		this.anInt3654 = arg4;
		this.anInt3673 = arg5;
		this.aClass509_3646 = new Class509();
		this.aClass358_3649 = new Class358(this);
		this.aClass340ArrayArrayArray3655 = new Class340[arg2][this.anInt3667][this.anInt3654];
		this.aClass_xaArray3701 = new Class_xa[arg2];
		if (arg6) {
			this.anIntArrayArray3683 = new int[this.anInt3667][this.anInt3654];
			this.aByteArrayArray3669 = new byte[this.anInt3667][this.anInt3654];
			this.aShortArrayArray3695 = new short[this.anInt3667][this.anInt3654];
			this.aByteArrayArray3662 = new byte[this.anInt3667][this.anInt3654];
			this.aByteArrayArray3663 = new byte[this.anInt3667][this.anInt3654];
			this.aByteArrayArray3664 = new byte[this.anInt3667][this.anInt3654];
			this.aClass340ArrayArrayArray3657 = new Class340[1][this.anInt3667][this.anInt3654];
			this.aClass_xaArray3658 = new Class_xa[1];
		}
		if (arg7) {
			this.aLongArrayArrayArray3652 = new long[arg2][arg3][arg4];
			this.aClass349Array3679 = new Class349[65361];
			this.aBooleanArray3659 = new boolean[65361];
			this.anInt3693 = 0;
		}
		this.method4134(false, (byte) 38);
		this.aClass432_Sub1Array3671 = new Class432_Sub1[2];
		this.aClass432_Sub1Array3670 = new Class432_Sub1[2];
		this.aClass432_Sub1Array3678 = new Class432_Sub1[2];
		this.aClass432_Sub1Array3675 = new Class432_Sub1[10080];
		this.anInt3672 = 0;
		this.aClass432_Sub1Array3674 = new Class432_Sub1[5046];
		this.anInt3681 = 0;
		this.aClass432_Sub1_Sub1Array3685 = new Class432_Sub1_Sub1[5006];
		this.anInt3661 = 0;
		this.aBooleanArrayArray3700 = new boolean[this.anInt3673 + this.anInt3673 + 1][this.anInt3673 + this.anInt3673 + 1];
		this.aBooleanArrayArray3698 = new boolean[this.anInt3673 + 2 + this.anInt3673][this.anInt3673 + 2 + this.anInt3673];
		this.anIntArray3699 = new int[this.anInt3673 + 2 + this.anInt3673];
		this.aClass338_3697 = new Class338(false);
	}

	public void method4132(int arg0, int arg1) {
	}

	public void method4133(Class263 arg0, byte arg1) {
	}

	public void method4134(boolean arg0, byte arg1) {
		try {
			if (arg0) {
				this.aClass340ArrayArrayArray3653 = this.aClass340ArrayArrayArray3657;
				this.aClass_xaArray3676 = this.aClass_xaArray3658;
			} else {
				this.aClass340ArrayArrayArray3653 = this.aClass340ArrayArrayArray3655;
				this.aClass_xaArray3676 = this.aClass_xaArray3701;
			}
			this.anInt3650 = this.aClass340ArrayArrayArray3653.length;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ow.i(" + ')');
		}
	}

	public void method4135(byte arg0) {
		try {
			for (int var2 = 0; var2 < this.anInt3667; var2++) {
				for (int var3 = 0; var3 < this.anInt3654; var3++) {
					if (this.aClass340ArrayArrayArray3653[0][var2][var3] == null) {
						this.aClass340ArrayArrayArray3653[0][var2][var3] = new Class340(0);
					}
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ow.p(" + ')');
		}
	}

	public Class340 method4136(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (this.aClass340ArrayArrayArray3653[arg0][arg1][arg2] == null) {
				boolean var5 = this.aClass340ArrayArrayArray3653[0][arg1][arg2] != null && this.aClass340ArrayArrayArray3653[0][arg1][arg2].aClass340_3380 != null;
				if (var5 && arg0 >= this.anInt3650 - 1) {
					return null;
				}
				this.method4137(arg0, arg1, arg2, (byte) -53);
			}
			return this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.s(" + ')');
		}
	}

	public void method4137(int arg0, int arg1, int arg2, byte arg3) {
		try {
			boolean var5 = this.aClass340ArrayArrayArray3653[0][arg1][arg2] != null && this.aClass340ArrayArrayArray3653[0][arg1][arg2].aClass340_3380 != null;
			for (int var6 = arg0; var6 >= 0; var6--) {
				if (this.aClass340ArrayArrayArray3653[var6][arg1][arg2] == null) {
					Class340 var7 = this.aClass340ArrayArrayArray3653[var6][arg1][arg2] = new Class340(var6);
					if (var5) {
						var7.aByte3381++;
					}
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ow.f(" + ')');
		}
	}

	public int method4138(int arg0, int arg1, int arg2) {
		try {
			return this.anIntArrayArray3683 == null ? 0 : this.anIntArrayArray3683[arg0][arg1] & 0xFFFFFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.n(" + ')');
		}
	}

	public int method4139(int arg0, int arg1, byte arg2) {
		try {
			return this.aByteArrayArray3662 == null ? 0 : this.aByteArrayArray3662[arg0][arg1] & 0xFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.b(" + ')');
		}
	}

	public int method4140(int arg0, int arg1, int arg2) {
		try {
			return this.aByteArrayArray3663 == null ? 0 : this.aByteArrayArray3663[arg0][arg1] & 0xFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.k(" + ')');
		}
	}

	public void method4141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			if (this.anIntArrayArray3683 != null) {
				this.anIntArrayArray3683[arg0][arg1] = arg2 | 0xFF000000;
			}
			if (this.aShortArrayArray3695 != null) {
				this.aShortArrayArray3695[arg0][arg1] = (short) arg3;
			}
			if (this.aByteArrayArray3669 != null) {
				this.aByteArrayArray3669[arg0][arg1] = (byte) arg4;
			}
			if (this.aByteArrayArray3662 != null) {
				this.aByteArrayArray3662[arg0][arg1] = (byte) arg5;
			}
			if (this.aByteArrayArray3663 != null) {
				this.aByteArrayArray3663[arg0][arg1] = (byte) arg6;
			}
			if (this.aByteArrayArray3664 != null) {
				this.aByteArrayArray3664[arg0][arg1] = (byte) arg7;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ow.u(" + ')');
		}
	}

	public void method4142(int arg0, int arg1, int arg2, Class432_Sub1_Sub4 arg3, byte arg4) {
		try {
			Class340 var6 = this.method4136(arg0, arg1, arg2, (byte) 16);
			if (var6 != null) {
				var6.aClass432_Sub1_Sub4_3386 = arg3;
				int var7 = this.aClass_xaArray3676 == this.aClass_xaArray3658 ? 1 : 0;
				if (!arg3.method5382(93762500)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var7];
					this.aClass432_Sub1Array3678[var7] = arg3;
				} else if (arg3.method5395(1002424431)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var7];
					this.aClass432_Sub1Array3670[var7] = arg3;
				} else {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var7];
					this.aClass432_Sub1Array3671[var7] = arg3;
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ow.x(" + ')');
		}
	}

	public void method4143(int arg0, int arg1, int arg2, int arg3, Class432_Sub1_Sub2 arg4, int arg5) {
		try {
			Class340 var7 = this.method4136(arg0, arg1, arg2, (byte) 16);
			if (var7 != null) {
				arg4.method5349(new Class260((float) (this.anInt3643 + (arg1 << this.anInt3641)), (float) arg3, (float) (this.anInt3643 + (arg2 << this.anInt3641))));
				var7.aClass432_Sub1_Sub2_3391 = arg4;
				int var8 = this.aClass_xaArray3676 == this.aClass_xaArray3658 ? 1 : 0;
				if (!arg4.method5382(-31326851)) {
					arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var8];
					this.aClass432_Sub1Array3678[var8] = arg4;
				} else if (arg4.method5395(1526445933)) {
					arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var8];
					this.aClass432_Sub1Array3670[var8] = arg4;
				} else {
					arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var8];
					this.aClass432_Sub1Array3671[var8] = arg4;
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.g(" + ')');
		}
	}

	public void method4144(int arg0, int arg1, int arg2, Class432_Sub1_Sub3 arg3, Class432_Sub1_Sub3 arg4, int arg5) {
		try {
			Class340 var7 = this.method4136(arg0, arg1, arg2, (byte) 16);
			if (var7 != null) {
				var7.aClass432_Sub1_Sub3_3384 = arg3;
				var7.aClass432_Sub1_Sub3_3385 = arg4;
				int var8 = this.aClass_xaArray3676 == this.aClass_xaArray3658 ? 1 : 0;
				if (!arg3.method5382(-677214342)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var8];
					this.aClass432_Sub1Array3678[var8] = arg3;
				} else if (arg3.method5395(895152694)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var8];
					this.aClass432_Sub1Array3670[var8] = arg3;
				} else {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var8];
					this.aClass432_Sub1Array3671[var8] = arg3;
				}
				if (arg4 != null) {
					if (!arg4.method5382(495914029)) {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var8];
						this.aClass432_Sub1Array3678[var8] = arg4;
					} else if (arg4.method5395(1669573265)) {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var8];
						this.aClass432_Sub1Array3670[var8] = arg4;
					} else {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var8];
						this.aClass432_Sub1Array3671[var8] = arg4;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.c(" + ')');
		}
	}

	public boolean method4145(Class432_Sub1_Sub1 arg0, boolean arg1, int arg2) {
		try {
			boolean var4 = this.aClass_xaArray3676 == this.aClass_xaArray3658;
			int var5 = 0;
			short var6 = 0;
			byte var7 = 0;
			arg0.method5406(987620598);
			if (arg0.aShort9922 < 0 || arg0.aShort9921 < 0 || arg0.aShort9920 >= this.anInt3667 || arg0.aShort9923 >= this.anInt3654) {
				return false;
			}
			short var8 = 0;
			int var9;
			int var10;
			for (var9 = arg0.aShort9922; var9 <= arg0.aShort9920; var9++) {
				for (var10 = arg0.aShort9921; var10 <= arg0.aShort9923; var10++) {
					Class340 var11 = this.method4136(arg0.aByte8658, var9, var10, (byte) 16);
					if (var11 != null) {
						Class352 var12 = Class95_Sub2.method1110(arg0, -772456061);
						Class352 var13 = var11.aClass352_3388;
						if (var13 == null) {
							var11.aClass352_3388 = var12;
						} else {
							while (var13.aClass352_3483 != null) {
								var13 = var13.aClass352_3483;
							}
							var13.aClass352_3483 = var12;
						}
						if (var4 && (this.anIntArrayArray3683[var9][var10] & 0xFF000000) != 0) {
							var5 = this.anIntArrayArray3683[var9][var10];
							var6 = this.aShortArrayArray3695[var9][var10];
							var7 = this.aByteArrayArray3669[var9][var10];
						}
						if (!arg1 && var11.aClass432_Sub1_Sub4_3386 != null && var11.aClass432_Sub1_Sub4_3386.aShort9927 > var8) {
							var8 = var11.aClass432_Sub1_Sub4_3386.aShort9927;
						}
					}
				}
			}
			if (var4 && (var5 & 0xFF000000) != 0) {
				for (var9 = arg0.aShort9922; var9 <= arg0.aShort9920; var9++) {
					for (var10 = arg0.aShort9921; var10 <= arg0.aShort9923; var10++) {
						if ((this.anIntArrayArray3683[var9][var10] & 0xFF000000) == 0) {
							this.anIntArrayArray3683[var9][var10] = var5;
							this.aShortArrayArray3695[var9][var10] = var6;
							this.aByteArrayArray3669[var9][var10] = var7;
						}
					}
				}
			}
			if (arg1) {
				this.aClass432_Sub1_Sub1Array3685[++this.anInt3661 - 1] = arg0;
				arg0.aClass356_8655 = this;
			} else {
				var9 = this.aClass_xaArray3658 == this.aClass_xaArray3676 ? 1 : 0;
				if (!arg0.method5382(-1773334886)) {
					arg0.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var9];
					this.aClass432_Sub1Array3678[var9] = arg0;
				} else if (arg0.method5395(512281498)) {
					arg0.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var9];
					this.aClass432_Sub1Array3670[var9] = arg0;
				} else {
					arg0.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var9];
					this.aClass432_Sub1Array3671[var9] = arg0;
				}
			}
			if (arg1) {
				Class260 var15 = Class260.method2549(arg0.method5346().aClass260_2606);
				var15.aFloat2715 -= var8;
				arg0.method5349(var15);
				var15.method2550();
			}
			return true;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "ow.a(" + ')');
		}
	}

	public void method4146(int arg0) {
		try {
			for (int var2 = 0; var2 < this.anInt3661; var2++) {
				Class432_Sub1_Sub1 var3 = this.aClass432_Sub1_Sub1Array3685[var2];
				this.method4152(var3, true, -1916595763);
				this.aClass432_Sub1_Sub1Array3685[var2] = null;
			}
			this.anInt3661 = 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ow.m(" + ')');
		}
	}

	public Class432_Sub1_Sub5 method4147(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 != null) {
				this.method4153(var5.aClass432_Sub1_Sub5_3383, -177336810);
				if (var5.aClass432_Sub1_Sub5_3383 != null) {
					Class432_Sub1_Sub5 var6 = var5.aClass432_Sub1_Sub5_3383;
					var5.aClass432_Sub1_Sub5_3383 = null;
					return var6;
				}
			}
			return null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.h(" + ')');
		}
	}

	public Class432_Sub1_Sub3 method4148(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 != null) {
				this.method4153(var5.aClass432_Sub1_Sub3_3384, -171560969);
				if (var5.aClass432_Sub1_Sub3_3384 != null) {
					Class432_Sub1_Sub3 var6 = var5.aClass432_Sub1_Sub3_3384;
					var5.aClass432_Sub1_Sub3_3384 = null;
					return var6;
				}
			}
			return null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.y(" + ')');
		}
	}

	public Class432_Sub1_Sub3 method4149(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 != null) {
				this.method4153(var5.aClass432_Sub1_Sub3_3385, 306199611);
				if (var5.aClass432_Sub1_Sub3_3385 != null) {
					Class432_Sub1_Sub3 var6 = var5.aClass432_Sub1_Sub3_3385;
					var5.aClass432_Sub1_Sub3_3385 = null;
					return var6;
				}
			}
			return null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.v(" + ')');
		}
	}

	public Class432_Sub1_Sub4 method4150(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 == null) {
				return null;
			}
			this.method4153(var5.aClass432_Sub1_Sub4_3386, 501510921);
			if (var5.aClass432_Sub1_Sub4_3386 == null) {
				return null;
			} else {
				Class432_Sub1_Sub4 var6 = var5.aClass432_Sub1_Sub4_3386;
				var5.aClass432_Sub1_Sub4_3386 = null;
				return var6;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.ay(" + ')');
		}
	}

	public Class432_Sub1_Sub2 method4151(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 == null) {
				return null;
			} else {
				Class432_Sub1_Sub2 var6 = var5.aClass432_Sub1_Sub2_3391;
				var5.aClass432_Sub1_Sub2_3391 = null;
				this.method4153(var6, 699142012);
				return var6;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.ac(" + ')');
		}
	}

	public void method4152(Class432_Sub1_Sub1 arg0, boolean arg1, int arg2) {
		try {
			for (int var4 = arg0.aShort9922; var4 <= arg0.aShort9920; var4++) {
				for (int var5 = arg0.aShort9921; var5 <= arg0.aShort9923; var5++) {
					Class340 var6 = this.aClass340ArrayArrayArray3653[arg0.aByte8658][var4][var5];
					if (var6 != null) {
						Class352 var7 = var6.aClass352_3388;
						Class352 var8 = null;
						while (var7 != null) {
							if (arg0 == var7.aClass432_Sub1_Sub1_3484) {
								if (var8 == null) {
									var6.aClass352_3388 = var7.aClass352_3483;
								} else {
									var8.aClass352_3483 = var7.aClass352_3483;
								}
								var7.method4070(1161161265);
								break;
							}
							var8 = var7;
							var7 = var7.aClass352_3483;
						}
					}
				}
			}
			if (!arg1) {
				this.method4153(arg0, -176937891);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.at(" + ')');
		}
	}

	public void method4153(Class432_Sub1 arg0, int arg1) {
		try {
			if (arg0 != null) {
				arg0.method5352();
				for (int var3 = 0; var3 < 2; var3++) {
					Class432_Sub1 var4 = null;
					Class432_Sub1 var5;
					for (var5 = this.aClass432_Sub1Array3671[var3]; var5 != null; var5 = var5.aClass432_Sub1_8653) {
						if (arg0 == var5) {
							if (var4 == null) {
								this.aClass432_Sub1Array3671[var3] = var5.aClass432_Sub1_8653;
							} else {
								var4.aClass432_Sub1_8653 = var5.aClass432_Sub1_8653;
							}
							return;
						}
						var4 = var5;
					}
					var4 = null;
					for (var5 = this.aClass432_Sub1Array3670[var3]; var5 != null; var5 = var5.aClass432_Sub1_8653) {
						if (arg0 == var5) {
							if (var4 == null) {
								this.aClass432_Sub1Array3670[var3] = var5.aClass432_Sub1_8653;
							} else {
								var4.aClass432_Sub1_8653 = var5.aClass432_Sub1_8653;
							}
							return;
						}
						var4 = var5;
					}
					var4 = null;
					for (var5 = this.aClass432_Sub1Array3678[var3]; var5 != null; var5 = var5.aClass432_Sub1_8653) {
						if (var5 == arg0) {
							if (var4 == null) {
								this.aClass432_Sub1Array3678[var3] = var5.aClass432_Sub1_8653;
							} else {
								var4.aClass432_Sub1_8653 = var5.aClass432_Sub1_8653;
							}
							return;
						}
						var4 = var5;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.aw(" + ')');
		}
	}

	public Class432_Sub1_Sub5 method4154(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null ? null : var5.aClass432_Sub1_Sub5_3382;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.ap(" + ')');
		}
	}

	public Class432_Sub1_Sub5 method4155(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null ? null : var5.aClass432_Sub1_Sub5_3383;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.ai(" + ')');
		}
	}

	public Class432_Sub1_Sub3 method4156(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null ? null : var5.aClass432_Sub1_Sub3_3384;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.as(" + ')');
		}
	}

	public int method4157(int arg0, int arg1, int arg2) {
		try {
			return this.aShortArrayArray3695 == null ? 0 : this.aShortArrayArray3695[arg0][arg1] & 0xFFFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.w(" + ')');
		}
	}

	public Class432_Sub1_Sub1 method4158(int arg0, int arg1, int arg2, Interface19 arg3, byte arg4) {
		try {
			Class340 var6 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var6 == null) {
				return null;
			}
			for (Class352 var7 = var6.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
				Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
				if ((arg3 == null || arg3.method279(var8, 1106846753)) && var8.aShort9922 == arg1 && var8.aShort9921 == arg2) {
					return var8;
				}
			}
			return null;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.ax(" + ')');
		}
	}

	public Class352 method4159(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null ? null : var5.aClass352_3388;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.ad(" + ')');
		}
	}

	public void method4160(Class432_Sub1 arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class340 var6;
			int var7;
			if (arg2 < this.anInt3667) {
				var6 = this.aClass340ArrayArrayArray3653[arg1][arg2 + 1][arg3];
				if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null && var6.aClass432_Sub1_Sub4_3386.method5360((short) 15410)) {
					var7 = (this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, -523616061) + this.aClass_xaArray3676[arg1].method6417(1 + 1 + arg2, arg3, 810075607) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -786187269) + this.aClass_xaArray3676[arg1].method6417(1 + 1 + arg2, arg3 + 1, -1596412967)) / 4 - (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, 2129660045) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, 2139283459) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1, 161730017) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -1642592970)) / 4;
					arg0.method5392(this.aClass_ra3645, var6.aClass432_Sub1_Sub4_3386, this.anInt3656, var7, 0, true, 1198125389);
				}
			}
			if (arg3 < this.anInt3667) {
				var6 = this.aClass340ArrayArrayArray3653[arg1][arg2][arg3 + 1];
				if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null && var6.aClass432_Sub1_Sub4_3386.method5360((short) 13910)) {
					var7 = (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, -615730710) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -101013461) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1 + 1, 1674810612) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1 + 1, -828381251)) / 4 - (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, 341097088) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, -1404022210) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1, 2061479686) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -958969916)) / 4;
					arg0.method5392(this.aClass_ra3645, var6.aClass432_Sub1_Sub4_3386, 0, var7, this.anInt3656, true, 1198125389);
				}
			}
			if (arg2 < this.anInt3667 && arg3 < this.anInt3654) {
				var6 = this.aClass340ArrayArrayArray3653[arg1][arg2 + 1][arg3 + 1];
				if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null && var6.aClass432_Sub1_Sub4_3386.method5360((short) 29716)) {
					var7 = (this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -2143438130) + this.aClass_xaArray3676[arg1].method6417(1 + 1 + arg2, arg3 + 1, 1516515705) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1 + 1, -1837452871) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1 + 1, 1 + 1 + arg3, -1547313680)) / 4 - (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, -1529286629) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, 1901941357) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1, -577350527) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, 145383739)) / 4;
					arg0.method5392(this.aClass_ra3645, var6.aClass432_Sub1_Sub4_3386, this.anInt3656, var7, this.anInt3656, true, 1198125389);
				}
			}
			if (arg2 < this.anInt3667 && arg3 > 0) {
				var6 = this.aClass340ArrayArrayArray3653[arg1][arg2 + 1][arg3 - 1];
				if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null && var6.aClass432_Sub1_Sub4_3386.method5360((short) 18875)) {
					var7 = (this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 - 1, -663419260) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1 + 1, arg3 - 1, -1775676169) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1 - 1, -1353196899) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1 + 1, arg3 + 1 - 1, 2136867048)) / 4 - (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, 1835999986) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, -295860667) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1, -361775837) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, 1340939918)) / 4;
					arg0.method5392(this.aClass_ra3645, var6.aClass432_Sub1_Sub4_3386, this.anInt3656, var7, -this.anInt3656, true, 1198125389);
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ow.aq(" + ')');
		}
	}

	public void method4161(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, boolean arg17) {
		this.aClass358_3649.aBoolean3706 = true;
		this.aBoolean3648 = arg15;
		this.anInt3640 = arg1 >> this.anInt3641;
		this.anInt3651 = arg3 >> this.anInt3641;
		this.anInt3665 = arg1;
		this.anInt3680 = arg3;
		this.anInt3677 = arg2;
		this.anInt3686 = this.anInt3640 - this.anInt3673;
		if (this.anInt3686 < 0) {
			this.anInt3684 = -(this.anInt3686 * 1253771849) * -193787911;
			this.anInt3686 = 0;
		} else {
			this.anInt3684 = 0;
		}
		this.anInt3688 = this.anInt3651 - this.anInt3673;
		if (this.anInt3688 < 0) {
			this.anInt3642 = -(this.anInt3688 * 1375504775) * -1847923657;
			this.anInt3688 = 0;
		} else {
			this.anInt3642 = 0;
		}
		this.anInt3689 = this.anInt3640 + this.anInt3673;
		if (this.anInt3689 > this.anInt3667) {
			this.anInt3689 = this.anInt3667;
		}
		this.anInt3696 = this.anInt3651 + this.anInt3673;
		if (this.anInt3696 > this.anInt3654) {
			this.anInt3696 = this.anInt3654;
		}
		boolean[][] var19 = this.aBooleanArrayArray3700;
		boolean[][] var20 = this.aBooleanArrayArray3698;
		int var21;
		int var22;
		if (this.aBoolean3648) {
			for (var21 = 0; var21 < this.anInt3673 + 2 + this.anInt3673; var21++) {
				var22 = 0;
				int var23 = 0;
				for (int var24 = 0; var24 < this.anInt3673 + this.anInt3673 + 2; var24++) {
					if (var24 > 1) {
						this.anIntArray3699[var24 - 2] = var22;
					}
					var22 = var23;
					int var25 = var21 + (this.anInt3640 - this.anInt3673);
					int var26 = var24 + (this.anInt3651 - this.anInt3673);
					int var27;
					if (var25 >= 0 && var26 >= 0 && var25 < this.anInt3667 && var26 < this.anInt3654) {
						var27 = var25 << this.anInt3641;
						int var28 = var26 << this.anInt3641;
						int var29 = this.aClass_xaArray3701[this.aClass_xaArray3701.length - 1].method6417(var25, var26, -205589578) - (0x3E8 << this.anInt3641 - 7);
						int var30 = (this.aClass_xaArray3658 == null ? this.aClass_xaArray3701[0].method6417(var25, var26, -1149869294) + this.anInt3656 : this.aClass_xaArray3658[0].method6417(var25, var26, 1875738700) + this.anInt3656) + (0x3E8 << this.anInt3641 - 7);
						var23 = this.aClass_ra3645.bp(var27, var29, var28, var27, var30, var28);
						this.aBooleanArrayArray3698[var21][var24] = var23 == 0;
					} else {
						var23 = -1;
						this.aBooleanArrayArray3698[var21][var24] = false;
					}
					if (var21 > 0 && var24 > 0) {
						var27 = this.anIntArray3699[var24 - 1] & this.anIntArray3699[var24] & var22 & var23;
						this.aBooleanArrayArray3700[var21 - 1][var24 - 1] = var27 == 0;
					}
				}
				this.anIntArray3699[this.anInt3673 + this.anInt3673] = var22;
				this.anIntArray3699[this.anInt3673 + 1 + this.anInt3673] = var23;
			}
			if (arg17) {
				this.aClass358_3649.anIntArray3708 = arg5;
				this.aClass358_3649.anIntArray3722 = arg6;
				this.aClass358_3649.anIntArray3707 = arg7;
				this.aClass358_3649.anIntArray3727 = arg8;
				this.aClass358_3649.anIntArray3729 = arg9;
				this.aClass358_3649.method4222(this.aClass_ra3645, arg10);
			} else {
				this.aClass358_3649.aBoolean3706 = false;
			}
		} else {
			if (this.aBooleanArrayArray3660 == null) {
				this.aBooleanArrayArray3660 = new boolean[this.anInt3673 + 2 + this.anInt3673][this.anInt3673 + 2 + this.anInt3673];
			}
			for (var21 = 0; var21 < this.aBooleanArrayArray3660.length; var21++) {
				for (var22 = 0; var22 < this.aBooleanArrayArray3660[0].length; var22++) {
					this.aBooleanArrayArray3660[var21][var22] = true;
				}
			}
			this.aBooleanArrayArray3698 = this.aBooleanArrayArray3660;
			this.aBooleanArrayArray3700 = this.aBooleanArrayArray3660;
			this.anInt3686 = 0;
			this.anInt3688 = 0;
			this.anInt3689 = this.anInt3667;
			this.anInt3696 = this.anInt3654;
			this.aClass358_3649.aBoolean3706 = false;
		}
		Class370.method4318(this, this.aClass_ra3645, -1200572325);
		if (!this.aClass338_3697.aBoolean3370) {
			Iterator var31 = this.aClass338_3697.aList3373.iterator();
			while (var31.hasNext()) {
				Class353 var32 = (Class353) var31.next();
				var31.remove();
				Class227.method2312(var32, 1251898116);
			}
		}
		if (this.aBoolean3647) {
			for (var21 = 0; var21 < this.anInt3693; var21++) {
				this.aClass349Array3679[var21].method4024(arg0, arg14, 614058570);
			}
		}
		if (this.aClass340ArrayArrayArray3657 != null) {
			this.method4134(true, (byte) 124);
			this.aClass_ra3645.dg(-1, new Class77(1583160, 40, 127, 63, 0, 0, 0));
			this.method4164(true, arg4, arg10, arg11, arg16);
			this.aClass_ra3645.O();
			this.method4134(false, (byte) 65);
		}
		this.method4164(false, arg4, arg10, arg11, arg16);
		if (!this.aBoolean3648) {
			this.aBooleanArrayArray3700 = var19;
			this.aBooleanArrayArray3698 = var20;
		}
	}

	public void method4162() {
		for (int var1 = 0; var1 < this.anInt3650; var1++) {
			for (int var2 = 0; var2 < this.anInt3667; var2++) {
				for (int var3 = 0; var3 < this.anInt3654; var3++) {
					Class340 var4 = this.aClass340ArrayArrayArray3653[var1][var2][var3];
					if (var4 != null) {
						Class432_Sub1_Sub5 var5 = var4.aClass432_Sub1_Sub5_3382;
						Class432_Sub1_Sub5 var6 = var4.aClass432_Sub1_Sub5_3383;
						if (var5 != null && var5.method5360((short) 19724)) {
							this.method4171(var5, var1, var2, var3, 1, 1);
							if (var6 != null && var6.method5360((short) 27474)) {
								this.method4171(var6, var1, var2, var3, 1, 1);
								var6.method5392(this.aClass_ra3645, var5, 0, 0, 0, false, 1198125389);
								var6.method5393(77834862);
							}
							var5.method5393(1108987533);
						}
						for (Class352 var7 = var4.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
							Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
							if (var8 != null && var8.method5360((short) 20567)) {
								this.method4171(var8, var1, var2, var3, var8.aShort9920 - var8.aShort9922 + 1, var8.aShort9923 - var8.aShort9921 + 1);
								var8.method5393(-85457232);
							}
						}
						Class432_Sub1_Sub4 var9 = var4.aClass432_Sub1_Sub4_3386;
						if (var9 != null && var9.method5360((short) 16744)) {
							this.method4160(var9, var1, var2, var3, -307989589);
							var9.method5393(-47635591);
						}
					}
				}
			}
		}
	}

	public void method4163(Class432_Sub1 arg0, int arg1) {
		try {
			Class260 var3 = arg0.method5346().aClass260_2606;
			this.aClass_ra3645.method_do((float) var3.aFloat2716, (float) ((int) var3.aFloat2715 + (arg0.method5370(1175606023) >> 1)), (float) var3.aFloat2711, this.aFloatArray3690);
			arg0.anInt8657 = (int) this.aFloatArray3690[2];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ow.ag(" + ')');
		}
	}

	public void method4164(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
		int var6 = arg0 ? 1 : 0;
		this.anInt3672 = 0;
		this.anInt3681 = 0;
		this.anInt3682++;
		Class432_Sub1 var7;
		if ((arg4 & 0x2) == 0) {
			for (var7 = this.aClass432_Sub1Array3671[var6]; var7 != null; var7 = var7.aClass432_Sub1_8653) {
				this.method4163(var7, 2065572003);
				if (var7.anInt8657 != -1 && !this.method4165(var7, arg0, arg1, arg2, arg3)) {
					this.aClass432_Sub1Array3675[++this.anInt3672 - 1] = var7;
				}
			}
		}
		int var16;
		if ((arg4 & 0x1) == 0) {
			for (var7 = this.aClass432_Sub1Array3670[var6]; var7 != null; var7 = var7.aClass432_Sub1_8653) {
				this.method4163(var7, 1839996469);
				if (var7.anInt8657 != -1 && !this.method4165(var7, arg0, arg1, arg2, arg3)) {
					this.aClass432_Sub1Array3674[++this.anInt3681 - 1] = var7;
				}
			}
			for (var7 = this.aClass432_Sub1Array3678[var6]; var7 != null; var7 = var7.aClass432_Sub1_8653) {
				this.method4163(var7, 1341385006);
				if (var7.anInt8657 != -1 && !this.method4165(var7, arg0, arg1, arg2, arg3)) {
					if (var7.method5395(1473684780)) {
						this.aClass432_Sub1Array3674[++this.anInt3681 - 1] = var7;
					} else {
						this.aClass432_Sub1Array3675[++this.anInt3672 - 1] = var7;
					}
				}
			}
			if (!arg0) {
				for (var16 = 0; var16 < this.anInt3661; var16++) {
					this.method4163(this.aClass432_Sub1_Sub1Array3685[var16], 1130270948);
					if (this.aClass432_Sub1_Sub1Array3685[var16].anInt8657 != -1 && !this.method4165(this.aClass432_Sub1_Sub1Array3685[var16], arg0, arg1, arg2, arg3)) {
						if (this.aClass432_Sub1_Sub1Array3685[var16].method5395(1102195927)) {
							this.aClass432_Sub1Array3674[++this.anInt3681 - 1] = this.aClass432_Sub1_Sub1Array3685[var16];
						} else {
							this.aClass432_Sub1Array3675[++this.anInt3672 - 1] = this.aClass432_Sub1_Sub1Array3685[var16];
						}
					}
				}
			}
		}
		if (this.anInt3672 > 0) {
			this.method4172(this.aClass432_Sub1Array3675, 0, this.anInt3672 - 1);
			for (var16 = 0; var16 < this.anInt3672; var16++) {
				this.method4166(this.aClass432_Sub1Array3675[var16], this.aClass330_Sub14Array3691);
			}
		}
		if (this.aBoolean3647) {
			this.aClass_ra3645.ck(0, null);
		}
		if ((arg4 & 0x2) == 0) {
			for (var16 = 0; var16 < this.anInt3650; var16++) {
				int var8;
				int var9;
				boolean[][] var10;
				int var11;
				int var12;
				int var13;
				if (var16 < arg2 || arg1 == null) {
					var8 = this.aBooleanArrayArray3700.length;
					if (this.aBooleanArrayArray3700.length + this.anInt3686 > this.anInt3667) {
						var8 -= this.aBooleanArrayArray3700.length + this.anInt3686 - this.anInt3667;
					}
					var9 = this.aBooleanArrayArray3700[0].length;
					if (this.aBooleanArrayArray3700[0].length + this.anInt3688 > this.anInt3654) {
						var9 -= this.anInt3688 + this.aBooleanArrayArray3700[0].length - this.anInt3654;
					}
					var10 = this.aBooleanArrayArray3698;
					if (this.aBoolean3648) {
						for (var11 = this.anInt3684; var11 < var8; var11++) {
							var12 = this.anInt3686 + var11 - this.anInt3684;
							for (var13 = this.anInt3642; var13 < var9; var13++) {
								if (this.aBooleanArrayArray3700[var11][var13] && !this.aClass358_3649.method4219(var16, var12, this.anInt3688 + var13 - this.anInt3642)) {
									var10[var11][var13] = true;
								} else {
									var10[var11][var13] = false;
								}
							}
						}
					}
					this.aClass_xaArray3676[var16].method6423(this.anInt3640, this.anInt3651, this.anInt3673, this.aBooleanArrayArray3698, true, arg4);
				} else {
					var8 = this.aBooleanArrayArray3700.length;
					if (this.anInt3686 + this.aBooleanArrayArray3700.length > this.anInt3667) {
						var8 -= this.aBooleanArrayArray3700.length + this.anInt3686 - this.anInt3667;
					}
					var9 = this.aBooleanArrayArray3700[0].length;
					if (this.aBooleanArrayArray3700[0].length + this.anInt3688 > this.anInt3654) {
						var9 -= this.aBooleanArrayArray3700[0].length + this.anInt3688 - this.anInt3654;
					}
					var10 = this.aBooleanArrayArray3698;
					if (this.aBoolean3648) {
						for (var11 = this.anInt3684; var11 < var8; var11++) {
							var12 = var11 + this.anInt3686 - this.anInt3684;
							for (var13 = this.anInt3642; var13 < var9; var13++) {
								var10[var11][var13] = false;
								if (this.aBooleanArrayArray3700[var11][var13]) {
									int var14 = var13 + this.anInt3688 - this.anInt3642;
									for (int var15 = var16; var15 >= 0; var15--) {
										if (this.aClass340ArrayArrayArray3653[var15][var12][var14] != null && this.aClass340ArrayArrayArray3653[var15][var12][var14].aByte3381 == var16) {
											if ((var15 < arg2 || arg3 != arg1[var15][var12][var14]) && !this.aClass358_3649.method4219(var16, var12, var14)) {
												var10[var11][var13] = true;
												break;
											}
											var10[var11][var13] = false;
											break;
										}
									}
								}
							}
						}
					}
					this.aClass_xaArray3676[var16].method6423(this.anInt3640, this.anInt3651, this.anInt3673, this.aBooleanArrayArray3698, false, arg4);
				}
			}
		}
		if (this.anInt3681 > 0) {
			this.method4173(this.aClass432_Sub1Array3674, 0, this.anInt3681 - 1);
			for (var16 = 0; var16 < this.anInt3681; var16++) {
				this.method4166(this.aClass432_Sub1Array3674[var16], this.aClass330_Sub14Array3691);
			}
		}
	}

	public boolean method4165(Class432_Sub1 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
		if (!this.aBoolean3648) {
			return false;
		} else if (arg0 instanceof Class432_Sub1_Sub1) {
			short var12 = ((Class432_Sub1_Sub1) arg0).aShort9920;
			short var13 = ((Class432_Sub1_Sub1) arg0).aShort9923;
			short var14 = ((Class432_Sub1_Sub1) arg0).aShort9922;
			short var9 = ((Class432_Sub1_Sub1) arg0).aShort9921;
			for (int var10 = var14; var10 <= var12; var10++) {
				for (int var11 = var9; var11 <= var13; var11++) {
					if (arg0.aByte8654 < this.anInt3650 && var10 >= this.anInt3686 && var10 < this.anInt3689 && var11 >= this.anInt3688 && var11 < this.anInt3696) {
						if ((arg2 == null || arg0.aByte8658 < arg3 || arg4 != arg2[arg0.aByte8658][var10][var11]) && arg0.method5367((byte) -115) && !arg0.method5372(this.aClass_ra3645, 33230288)) {
							return false;
						}
						if (!arg1 && var10 >= this.anInt3640 - 16 && var10 <= this.anInt3640 + 16 && var11 >= this.anInt3651 - 16 && var11 <= this.anInt3651 + 16) {
							arg0.method5404(this.aClass_ra3645, -317112783);
						}
						return true;
					}
				}
			}
			return true;
		} else {
			Class260 var6 = arg0.method5346().aClass260_2606;
			int var7 = (int) var6.aFloat2716 >> this.anInt3641;
			int var8 = (int) var6.aFloat2711 >> this.anInt3641;
			if (arg0.aByte8654 >= this.anInt3650 || var7 < this.anInt3686 || var7 >= this.anInt3689 || var8 < this.anInt3688 || var8 >= this.anInt3696) {
				return true;
			} else if ((arg2 == null || arg0.aByte8658 < arg3 || arg4 != arg2[arg0.aByte8658][var7][var8]) && arg0.method5367((byte) -83) && !arg0.method5372(this.aClass_ra3645, 418007110)) {
				return false;
			} else {
				if (!arg1 && var7 >= this.anInt3640 - 16 && var7 <= this.anInt3640 + 16 && var8 >= this.anInt3651 - 16 && var8 <= this.anInt3651 + 16) {
					arg0.method5404(this.aClass_ra3645, -406227126);
				}
				return true;
			}
		}
	}

	public void method4166(Class432_Sub1 arg0, Class330_Sub14[] arg1) {
		if (this.aBoolean3647) {
			int var3 = arg0.method5368(arg1, (byte) -16);
			this.aClass_ra3645.ck(var3, arg1);
		}
		if (this.aClass_xaArray3676 == this.aClass_xaArray3658) {
			boolean var9 = false;
			boolean var4 = false;
			Class260 var5 = arg0.method5346().aClass260_2606;
			int var6;
			int var7;
			if (arg0 instanceof Class432_Sub1_Sub1) {
				var6 = ((Class432_Sub1_Sub1) arg0).aShort9922;
				var7 = ((Class432_Sub1_Sub1) arg0).aShort9921;
			} else {
				var6 = (int) var5.aFloat2716 >> this.anInt3641;
				var7 = (int) var5.aFloat2711 >> this.anInt3641;
			}
			Class77 var8 = new Class77();
			var8.anInt652 = this.method4138(var6, var7, 360305750);
			var8.anInt650 = this.method4157(var6, var7, -498689986);
			var8.anInt651 = this.method4183(var6, var7, 1622515706);
			var8.anInt653 = this.method4139(var6, var7, (byte) 1);
			var8.anInt654 = this.method4140(var6, var7, -2062399867);
			var8.anInt655 = this.method4179(var6, var7, (byte) 0);
			this.aClass_ra3645.dz(this.aClass_xaArray3701[0].method6416((int) var5.aFloat2716, (int) var5.aFloat2711, -1925907639), var8);
		}
		Class353 var10 = arg0.method5405(this.aClass_ra3645, 12826234);
		if (var10 == null) {
			return;
		}
		if (var10.aBoolean3487) {
			var10.aClass432_Sub1_3489 = arg0;
			this.aClass338_3697.method3958(var10, (byte) 8);
		} else {
			Class227.method2312(var10, 1103186905);
		}
	}

	public void method4167(Class_na arg0, int arg1, int arg2, int arg3, boolean[] arg4, byte arg5) {
		try {
			if (this.aClass_xaArray3658 != this.aClass_xaArray3676) {
				int var7 = this.aClass_xaArray3701[arg1].method6416(arg2, arg3, -1091474854);
				for (int var8 = 0; var8 <= arg1; var8++) {
					if (arg4 == null || arg4[var8]) {
						Class_xa var9 = this.aClass_xaArray3701[var8];
						if (var9 != null) {
							var9.NA(arg0, arg2, var7 - var9.method6416(arg2, arg3, -1670787251), arg3, 0, false);
						} else if (arg5 <= 0) {
							throw new IllegalStateException();
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ow.au(" + ')');
		}
	}

	public void method4168(int arg0, int arg1, int arg2) {
		try {
			Class_na var4 = null;
			for (int var5 = arg0; var5 < arg1; var5++) {
				Class_xa var6 = this.aClass_xaArray3701[var5];
				if (var6 != null) {
					for (int var7 = 0; var7 < this.anInt3654; var7++) {
						for (int var8 = 0; var8 < this.anInt3667; var8++) {
							var4 = var6.w(var8, var7, var4);
							if (var4 != null) {
								int var9 = var8 << this.anInt3641;
								int var10 = var7 << this.anInt3641;
								for (int var11 = var5 - 1; var11 >= 0; var11--) {
									Class_xa var12 = this.aClass_xaArray3701[var11];
									if (var12 != null) {
										int var13 = var6.method6417(var8, var7, 724922351) - var12.method6417(var8, var7, -2059376734);
										int var14 = var6.method6417(var8 + 1, var7, -1631745858) - var12.method6417(var8 + 1, var7, -511777741);
										int var15 = var6.method6417(var8 + 1, var7 + 1, -950685282) - var12.method6417(var8 + 1, var7 + 1, 1949994073);
										int var16 = var6.method6417(var8, var7 + 1, -1503561844) - var12.method6417(var8, var7 + 1, 1162347593);
										var12.UA(var4, var9, (var14 + var13 + var15 + var16) / 4, var10, 0, false);
									} else if (arg2 <= 621744729) {
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "ow.ae(" + ')');
		}
	}

	public void method4169(int arg0) {
		try {
			for (int var2 = 0; var2 < this.anInt3693; var2++) {
				if (!this.aBooleanArray3659[var2]) {
					Class349 var3 = this.aClass349Array3679[var2];
					Class330_Sub14 var4 = var3.aClass330_Sub14_3467;
					int var5 = var3.anInt3470;
					int var6 = var4.method3316((byte) 16) - this.anInt3643;
					int var7 = (var6 * 2 >> this.anInt3641) + 1;
					int var8 = 0;
					int[] var9 = new int[var7 * var7];
					int var10 = var4.method3318(1603365177) - var6 >> this.anInt3641;
					int var11 = var4.method3312((short) -15802) - var6 >> this.anInt3641;
					int var12 = var4.method3312((short) -12112) + var6 >> this.anInt3641;
					if (var11 < 0) {
						var8 -= var11;
						var11 = 0;
					}
					if (var12 >= this.anInt3654) {
						var12 = this.anInt3654 - 1;
					}
					for (int var13 = var11; var13 <= var12; var13++) {
						short var14 = var3.aShortArray3454[var8];
						int var15 = var14 >>> 8;
						int var16 = var8 * var7 + var15;
						int var17 = (var14 >>> 8) + var10;
						int var18 = (var14 & 0xFF) + var17 - 1;
						if (var17 < 0) {
							var16 -= var17;
							var17 = 0;
						}
						if (var18 >= this.anInt3667) {
							var18 = this.anInt3667 - 1;
						}
						for (int var19 = var17; var19 <= var18; var19++) {
							byte var20 = 1;
							Class432_Sub1_Sub1 var21 = this.method4158(var5, var19, var13, null, (byte) -40);
							if (var21 != null && var21.aByte9919 != 0) {
								boolean var22;
								boolean var23;
								short var24;
								int var25;
								int var26;
								if (var21.aByte9919 == 1) {
									var22 = var19 - 1 >= var17;
									var23 = var19 + 1 <= var18;
									if (!var22 && var13 + 1 <= var12) {
										var24 = var3.aShortArray3454[var8 + 1];
										var25 = var10 + (var24 >>> 8);
										var26 = (var24 & 0xFF) + var25;
										var22 = var19 > var25 && var19 < var26;
									}
									if (!var23 && var13 - 1 >= var11) {
										var24 = var3.aShortArray3454[var8 - 1];
										var25 = (var24 >>> 8) + var10;
										var26 = (var24 & 0xFF) + var25;
										var23 = var19 > var25 && var19 < var26;
									}
									if (var22 && !var23) {
										var20 = 4;
									} else if (var23 && !var22) {
										var20 = 2;
									}
								} else {
									var22 = var19 - 1 >= var17;
									var23 = var19 + 1 <= var18;
									if (!var22 && var13 - 1 >= var11) {
										var24 = var3.aShortArray3454[var8 - 1];
										var25 = (var24 >>> 8) + var10;
										var26 = var25 + (var24 & 0xFF);
										var22 = var19 > var25 && var19 < var26;
									}
									if (!var23 && var13 + 1 <= var12) {
										var24 = var3.aShortArray3454[var8 + 1];
										var25 = (var24 >>> 8) + var10;
										var26 = (var24 & 0xFF) + var25;
										var23 = var19 > var25 && var19 < var26;
									}
									if (var22 && !var23) {
										var20 = 3;
									} else if (var23 && !var22) {
										var20 = 5;
									}
								}
							}
							var9[var16++] = var20;
						}
						var8++;
					}
					this.aBooleanArray3659[var2] = true;
					if (aBoolean3694) {
						this.aClass_xaArray3676[var5].method6420(var4, var9);
					}
				}
			}
		} catch (RuntimeException var27) {
			throw Class476.method5964(var27, "ow.bs(" + ')');
		}
	}

	public void method4170(Class349 arg0, int arg1) {
		try {
			if (this.anInt3693 < 65361) {
				Class330_Sub14 var3 = arg0.aClass330_Sub14_3467;
				this.aClass349Array3679[this.anInt3693] = arg0;
				this.aBooleanArray3659[this.anInt3693] = false;
				this.anInt3693++;
				int var4 = arg0.anInt3470;
				if (arg0.aBoolean3469) {
					var4 = 0;
				}
				int var5 = arg0.anInt3470;
				if (arg0.aBoolean3456) {
					var5 = this.anInt3650 - 1;
				}
				for (int var6 = var4; var6 <= var5; var6++) {
					int var7 = 0;
					int var8 = var3.method3312((short) 7506) - var3.method3316((byte) 86) + this.anInt3643 >> this.anInt3641;
					if (var8 < 0) {
						var7 -= var8;
						var8 = 0;
					}
					int var9 = var3.method3312((short) -28879) + var3.method3316((byte) 43) - this.anInt3643 >> this.anInt3641;
					if (var9 >= this.anInt3654) {
						var9 = this.anInt3654 - 1;
					}
					for (int var10 = var8; var10 <= var9; var10++) {
						short var11 = arg0.aShortArray3454[var7++];
						int var12 = (var3.method3318(-1940570454) - var3.method3316((byte) 23) + this.anInt3643 >> this.anInt3641) + (var11 >>> 8);
						int var13 = var12 + (var11 & 0xFF) - 1;
						if (var12 < 0) {
							var12 = 0;
						}
						if (var13 >= this.anInt3667) {
							var13 = this.anInt3667 - 1;
						}
						for (int var14 = var12; var14 <= var13; var14++) {
							long var15 = this.aLongArrayArrayArray3652[var6][var14][var10];
							if ((var15 & 0xFFFFL) == 0L) {
								this.aLongArrayArrayArray3652[var6][var14][var10] = var15 | (long) this.anInt3693;
							} else if ((var15 & 0xFFFF0000L) == 0L) {
								this.aLongArrayArrayArray3652[var6][var14][var10] = var15 | (long) this.anInt3693 << 16;
							} else if ((var15 & 0xFFFF00000000L) == 0L) {
								this.aLongArrayArrayArray3652[var6][var14][var10] = var15 | (long) this.anInt3693 << 32;
							} else if ((var15 & 0xFFFF000000000000L) == 0L) {
								this.aLongArrayArrayArray3652[var6][var14][var10] = var15 | (long) this.anInt3693 << 48;
							}
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "ow.bg(" + ')');
		}
	}

	public void method4171(Class432_Sub1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg3 - 1;
		int var11 = arg5 + arg3;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (var12 != this.anInt3650) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < this.anInt3667) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < this.anInt3654 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
								Class340 var15 = this.aClass340ArrayArrayArray3653[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.aClass_xaArray3676[var12].method6417(var13, var14, -686084832) + this.aClass_xaArray3676[var12].method6417(var13 + 1, var14, 375470806) + this.aClass_xaArray3676[var12].method6417(var13, var14 + 1, 1610388724) + this.aClass_xaArray3676[var12].method6417(var13 + 1, var14 + 1, 147671061)) / 4 - (this.aClass_xaArray3676[arg1].method6417(arg2, arg3, 1672173976) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3, 751396985) + this.aClass_xaArray3676[arg1].method6417(arg2, arg3 + 1, -870234941) + this.aClass_xaArray3676[arg1].method6417(arg2 + 1, arg3 + 1, -1239912013)) / 4;
									Class432_Sub1_Sub5 var17 = var15.aClass432_Sub1_Sub5_3382;
									Class432_Sub1_Sub5 var18 = var15.aClass432_Sub1_Sub5_3383;
									if (var17 != null && var17.method5360((short) 16856)) {
										arg0.method5392(this.aClass_ra3645, var17, this.anInt3656 * (var13 - arg2) + this.anInt3643 * (1 - arg4), var16, this.anInt3643 * (1 - arg5) + this.anInt3656 * (var14 - arg3), var7, 1198125389);
									}
									if (var18 != null && var18.method5360((short) 8984)) {
										arg0.method5392(this.aClass_ra3645, var18, (1 - arg4) * this.anInt3643 + this.anInt3656 * (var13 - arg2), var16, (var14 - arg3) * this.anInt3656 + (1 - arg5) * this.anInt3643, var7, 1198125389);
									}
									for (Class352 var19 = var15.aClass352_3388; var19 != null; var19 = var19.aClass352_3483) {
										Class432_Sub1_Sub1 var20 = var19.aClass432_Sub1_Sub1_3484;
										if (var20 != null && var20.method5360((short) 13248) && (var13 == var20.aShort9922 || var13 == var8) && (var20.aShort9921 == var14 || var10 == var14)) {
											int var21 = var20.aShort9920 - var20.aShort9922 + 1;
											int var22 = var20.aShort9923 - var20.aShort9921 + 1;
											arg0.method5392(this.aClass_ra3645, var20, (var21 - arg4) * this.anInt3643 + this.anInt3656 * (var20.aShort9922 - arg2), var16, (var20.aShort9921 - arg3) * this.anInt3656 + (var22 - arg5) * this.anInt3643, var7, 1198125389);
										}
									}
								}
							}
						}
					}
				}
				var8--;
				var7 = false;
			}
		}
	}

	public void method4172(Class432_Sub1[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg1 + arg2) / 2;
		int var5 = arg1;
		Class432_Sub1 var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.anInt8657;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].anInt8657 < (var8 & 0x1) + var7) {
				Class432_Sub1 var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method4172(arg0, arg1, var5 - 1);
		this.method4172(arg0, var5 + 1, arg2);
	}

	public void method4173(Class432_Sub1[] arg0, int arg1, int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		int var4 = (arg2 + arg1) / 2;
		int var5 = arg1;
		Class432_Sub1 var6 = arg0[var4];
		arg0[var4] = arg0[arg2];
		arg0[arg2] = var6;
		int var7 = var6.anInt8657;
		for (int var8 = arg1; var8 < arg2; var8++) {
			if (arg0[var8].anInt8657 > (var8 & 0x1) + var7) {
				Class432_Sub1 var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5++] = var9;
			}
		}
		arg0[arg2] = arg0[var5];
		arg0[var5] = var6;
		this.method4173(arg0, arg1, var5 - 1);
		this.method4173(arg0, var5 + 1, arg2);
	}

	public void method4174(int arg0, Class_xa arg1, byte arg2) {
		try {
			this.aClass_xaArray3676[arg0] = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.z(" + ')');
		}
	}

	public Class432_Sub1_Sub5 method4175(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var5 != null) {
				this.method4153(var5.aClass432_Sub1_Sub5_3382, 1191940480);
				if (var5.aClass432_Sub1_Sub5_3382 != null) {
					Class432_Sub1_Sub5 var6 = var5.aClass432_Sub1_Sub5_3382;
					var5.aClass432_Sub1_Sub5_3382 = null;
					return var6;
				}
			}
			return null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ow.t(" + ')');
		}
	}

	public void method4176(byte arg0) {
		try {
			this.method4168(1, this.anInt3650, 1525613311);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ow.ao(" + ')');
		}
	}

	public Class432_Sub1_Sub4 method4177(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null || var5.aClass432_Sub1_Sub4_3386 == null ? null : var5.aClass432_Sub1_Sub4_3386;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.an(" + ')');
		}
	}

	public Class432_Sub1_Sub2 method4178(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class340 var5 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			return var5 == null ? null : var5.aClass432_Sub1_Sub2_3391;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ow.aj(" + ')');
		}
	}

	public int method4179(int arg0, int arg1, byte arg2) {
		try {
			return this.aByteArrayArray3664 == null ? 0 : this.aByteArrayArray3664[arg0][arg1] & 0xFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.q(" + ')');
		}
	}

	public void method4180(int arg0, int arg1, int arg2, Class432_Sub1_Sub5 arg3, Class432_Sub1_Sub5 arg4, int arg5) {
		try {
			Class340 var7 = this.method4136(arg0, arg1, arg2, (byte) 16);
			if (var7 != null) {
				var7.aClass432_Sub1_Sub5_3382 = arg3;
				var7.aClass432_Sub1_Sub5_3383 = arg4;
				int var8 = this.aClass_xaArray3676 == this.aClass_xaArray3658 ? 1 : 0;
				if (!arg3.method5382(1893573760)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var8];
					this.aClass432_Sub1Array3678[var8] = arg3;
				} else if (arg3.method5395(1319252997)) {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var8];
					this.aClass432_Sub1Array3670[var8] = arg3;
				} else {
					arg3.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var8];
					this.aClass432_Sub1Array3671[var8] = arg3;
				}
				if (arg4 != null) {
					if (!arg4.method5382(206516734)) {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3678[var8];
						this.aClass432_Sub1Array3678[var8] = arg4;
					} else if (arg4.method5395(822469189)) {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3670[var8];
						this.aClass432_Sub1Array3670[var8] = arg4;
					} else {
						arg4.aClass432_Sub1_8653 = this.aClass432_Sub1Array3671[var8];
						this.aClass432_Sub1Array3671[var8] = arg4;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.d(" + ')');
		}
	}

	public Class432_Sub1_Sub1 method4181(int arg0, int arg1, int arg2, Interface19 arg3, byte arg4) {
		try {
			Class340 var6 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var6 == null) {
				return null;
			}
			for (Class352 var7 = var6.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
				Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
				if ((arg3 == null || arg3.method279(var8, -1272911133)) && var8.aShort9922 == arg1 && var8.aShort9921 == arg2) {
					this.method4152(var8, false, -107809328);
					return var8;
				}
			}
			return null;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.al(" + ')');
		}
	}

	public void method4182(int arg0, int arg1, int arg2) {
		try {
			Class340 var4 = this.aClass340ArrayArrayArray3653[0][arg0][arg1];
			for (int var5 = 0; var5 < 3; var5++) {
				Class340 var6 = this.aClass340ArrayArrayArray3653[var5][arg0][arg1] = this.aClass340ArrayArrayArray3653[var5 + 1][arg0][arg1];
				if (var6 != null) {
					for (Class352 var7 = var6.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
						Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
						if (arg0 == var8.aShort9922 && arg1 == var8.aShort9921) {
							var8.aByte8658--;
						}
					}
					if (var6.aClass432_Sub1_Sub4_3386 != null) {
						var6.aClass432_Sub1_Sub4_3386.aByte8658--;
					}
					if (var6.aClass432_Sub1_Sub5_3382 != null) {
						var6.aClass432_Sub1_Sub5_3382.aByte8658--;
					}
					if (var6.aClass432_Sub1_Sub5_3383 != null) {
						var6.aClass432_Sub1_Sub5_3383.aByte8658--;
					}
					if (var6.aClass432_Sub1_Sub3_3384 != null) {
						var6.aClass432_Sub1_Sub3_3384.aByte8658--;
					}
					if (var6.aClass432_Sub1_Sub3_3385 != null) {
						var6.aClass432_Sub1_Sub3_3385.aByte8658--;
					}
				}
			}
			if (this.aClass340ArrayArrayArray3653[0][arg0][arg1] == null) {
				this.aClass340ArrayArrayArray3653[0][arg0][arg1] = new Class340(0);
				this.aClass340ArrayArrayArray3653[0][arg0][arg1].aByte3381 = 1;
			}
			this.aClass340ArrayArrayArray3653[0][arg0][arg1].aClass340_3380 = var4;
			this.aClass340ArrayArrayArray3653[3][arg0][arg1] = null;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.o(" + ')');
		}
	}

	public int method4183(int arg0, int arg1, int arg2) {
		try {
			return this.aByteArrayArray3669 == null ? 0 : this.aByteArrayArray3669[arg0][arg1] & 0xFF;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.l(" + ')');
		}
	}

	public void method4184(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class340 var6 = this.aClass340ArrayArrayArray3653[arg0][arg1][arg2];
			if (var6 != null) {
				Class432_Sub1_Sub3 var7 = var6.aClass432_Sub1_Sub3_3384;
				Class432_Sub1_Sub3 var8 = var6.aClass432_Sub1_Sub3_3385;
				if (var7 != null) {
					var7.aShort9925 = (short) (var7.aShort9925 * arg3 / (0x10 << this.anInt3641 - 7));
					var7.aShort9926 = (short) (var7.aShort9926 * arg3 / (0x10 << this.anInt3641 - 7));
				}
				if (var8 != null) {
					var8.aShort9925 = (short) (arg3 * var8.aShort9925 / (0x10 << this.anInt3641 - 7));
					var8.aShort9926 = (short) (arg3 * var8.aShort9926 / (0x10 << this.anInt3641 - 7));
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ow.e(" + ')');
		}
	}

	public boolean method4185(Class_na arg0, int arg1, int arg2, int arg3, boolean[] arg4, byte arg5) {
		try {
			boolean var7 = false;
			if (this.aClass_xaArray3658 != this.aClass_xaArray3676) {
				int var8 = this.aClass_xaArray3701[arg1].method6416(arg2, arg3, 1313874386);
				for (int var9 = 0; var9 <= arg1; var9++) {
					Class_xa var10 = this.aClass_xaArray3701[var9];
					if (var10 != null) {
						int var11 = var8 - var10.method6416(arg2, arg3, -1482993169);
						if (arg4 != null) {
							arg4[var9] = var10.method6418(arg0, arg2, var11, arg3, 0, false);
							if (!arg4[var9]) {
								if (arg5 == 2) {
								}
								continue;
							}
						}
						var10.UA(arg0, arg2, var11, arg3, 0, false);
						var7 = true;
					} else if (arg5 == 2) {
						throw new IllegalStateException();
					}
				}
			}
			return var7;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ow.am(" + ')');
		}
	}

	public static Class390[] method4186(byte arg0) {
		try {
			return new Class390[] { Class390.aClass390_4035, Class390.aClass390_4043, Class390.aClass390_4047, Class390.aClass390_4037, Class390.aClass390_4044, Class390.aClass390_4038, Class390.aClass390_4034, Class390.aClass390_4040, Class390.aClass390_4041, Class390.aClass390_4036, Class390.aClass390_4051, Class390.aClass390_4045, Class390.aClass390_4046, Class390.aClass390_4042 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ow.r(" + ')');
		}
	}

	public static short modifyColor(int arg0, byte arg1) {
		try {
			int var2 = arg0 >> 10 & 0x3F;
			int var3 = arg0 >> 3 & 0x70;
			int var4 = arg0 & 0x7F;
			int var9 = var4 <= 64 ? var3 * var4 >> 7 : var3 * (127 - var4) >> 7;
			int var5 = var9 + var4;
			int var6;
			if (var5 == 0) {
				var6 = var9 << 1;
			} else {
				var6 = (var9 << 8) / var5;
			}
			return (short) (var2 << 10 | var6 >> 4 << 7 | var5);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ow.o(" + ')');
		}
	}

	public static final void method4188(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class330_Sub10.anInt7590;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ow.aoe(" + ')');
		}
	}

	public static Class469 method4189(int arg0, byte arg1) {
		try {
			Class469[] var2 = Class383.method4411((short) -12027);
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class469 var4 = var2[var3];
				if (var4.anInt5608 == arg0) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.j(" + ')');
		}
	}

	public static boolean method4190(byte arg0) {
		try {
			return Class476.method5961(Class534.aClass412_6788.aClass365_4252, (short) 128);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ow.r(" + ')');
		}
	}

	public static void method4191(int arg0) {
		try {
			Class330_Sub1.aClass497_7501.method6100(65280);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ow.n(" + ')');
		}
	}

	public static final void method4192(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			int var4 = -1;
			if (var3 != null) {
				var4 = var3.anInt1381;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ow.acx(" + ')');
		}
	}
}
