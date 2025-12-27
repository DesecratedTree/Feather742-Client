package deob;

public class Class330_Sub40_Sub5 extends Class330_Sub40 {

	public Class471 aClass471_9790 = new Class471();

	public Class330_Sub40_Sub4 aClass330_Sub40_Sub4_9792 = new Class330_Sub40_Sub4();

	public Class330_Sub40_Sub2 aClass330_Sub40_Sub2_9791;

	public Class330_Sub40_Sub5(Class330_Sub40_Sub2 arg0) {
		this.aClass330_Sub40_Sub2_9791 = arg0;
	}

	public int method3560() {
		return 0;
	}

	public Class330_Sub40 method3550() {
		try {
			Class330_Sub5 var1;
			do {
				var1 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -74);
				if (var1 == null) {
					return null;
				}
			} while (var1.aClass330_Sub40_Sub3_7539 == null);
			return var1.aClass330_Sub40_Sub3_7539;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aix.i(" + ')');
		}
	}

	public void method3555(int arg0) {
		try {
			this.aClass330_Sub40_Sub4_9792.method3555(arg0);
			for (Class330_Sub5 var2 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var2 != null; var2 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -33)) {
				if (!this.aClass330_Sub40_Sub2_9791.method3611(var2, -965767348)) {
					int var3 = arg0;
					do {
						if (var3 <= var2.anInt7540) {
							this.method3691(var2, var3, 1560741852);
							var2.anInt7540 -= var3;
							break;
						}
						this.method3691(var2, var2.anInt7540, 1372352093);
						var3 -= var2.anInt7540;
					} while (!this.aClass330_Sub40_Sub2_9791.method3612(var2, null, 0, var3, 2101735582));
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aix.f(" + ')');
		}
	}

	public void method3564(int[] arg0, int arg1, int arg2) {
		try {
			this.aClass330_Sub40_Sub4_9792.method3564(arg0, arg1, arg2);
			for (Class330_Sub5 var4 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var4 != null; var4 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -69)) {
				if (!this.aClass330_Sub40_Sub2_9791.method3611(var4, -1601055801)) {
					int var5 = arg1;
					int var6 = arg2;
					do {
						if (var6 <= var4.anInt7540) {
							this.method3690(var4, arg0, var5, var6, var6 + var5, -1257988015);
							var4.anInt7540 -= var6;
							break;
						}
						this.method3690(var4, arg0, var5, var4.anInt7540, var6 + var5, -1833183526);
						var5 += var4.anInt7540;
						var6 -= var4.anInt7540;
					} while (!this.aClass330_Sub40_Sub2_9791.method3612(var4, arg0, var5, var6, 1991346893));
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aix.s(" + ')');
		}
	}

	public Class330_Sub40 method3559() {
		Class330_Sub5 var1;
		do {
			var1 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -26);
			if (var1 == null) {
				return null;
			}
		} while (var1.aClass330_Sub40_Sub3_7539 == null);
		return var1.aClass330_Sub40_Sub3_7539;
	}

	public void method3690(Class330_Sub5 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if ((this.aClass330_Sub40_Sub2_9791.anIntArray9764[arg0.anInt7536] & 0x4) != 0 && arg0.anInt7535 < 0) {
				int var7 = this.aClass330_Sub40_Sub2_9791.anIntArray9758[arg0.anInt7536] / Class296.anInt3047;
				while (true) {
					int var8 = (var7 + 1048575 - arg0.anInt7542) / var7;
					if (var8 > arg3) {
						if (arg5 >= 736749756) {
							return;
						}
						arg0.anInt7542 += arg3 * var7;
						break;
					}
					arg0.aClass330_Sub40_Sub3_7539.method3564(arg1, arg2, var8);
					arg2 += var8;
					arg3 -= var8;
					arg0.anInt7542 += var8 * var7 - 1048576;
					int var9 = Class296.anInt3047 / 100;
					int var10 = 262144 / var7;
					if (var10 < var9) {
						var9 = var10;
					}
					Class330_Sub40_Sub3 var11 = arg0.aClass330_Sub40_Sub3_7539;
					if (this.aClass330_Sub40_Sub2_9791.anIntArray9766[arg0.anInt7536] == 0) {
						arg0.aClass330_Sub40_Sub3_7539 = arg0.aClass330_Sub29_Sub1_7523.method3403(var11.method3633((byte) 53), var11.method3644(1859454861), var11.method3627((short) 255));
					} else {
						arg0.aClass330_Sub40_Sub3_7539 = arg0.aClass330_Sub29_Sub1_7523.method3403(var11.method3633((byte) 72), 0, var11.method3627((short) 255));
						this.aClass330_Sub40_Sub2_9791.method3599(arg0, arg0.aClass330_Sub11_7522.aShortArray7593[arg0.anInt7526] < 0, 1320231002);
						arg0.aClass330_Sub40_Sub3_7539.method3630(var9, var11.method3644(1859454861), -2134132629);
					}
					if (arg0.aClass330_Sub11_7522.aShortArray7593[arg0.anInt7526] < 0) {
						arg0.aClass330_Sub40_Sub3_7539.method3624(-1, -1139535845);
					}
					var11.method3631(var9, -1246830196);
					var11.method3564(arg1, arg2, arg4 - arg2);
					if (var11.method3623(1036782539)) {
						this.aClass330_Sub40_Sub4_9792.method3684(var11);
					}
				}
			}
			arg0.aClass330_Sub40_Sub3_7539.method3564(arg1, arg2, arg3);
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "aix.ai(" + ')');
		}
	}

	public void method3691(Class330_Sub5 arg0, int arg1, int arg2) {
		try {
			if ((this.aClass330_Sub40_Sub2_9791.anIntArray9764[arg0.anInt7536] & 0x4) != 0 && arg0.anInt7535 < 0) {
				int var4 = this.aClass330_Sub40_Sub2_9791.anIntArray9758[arg0.anInt7536] / Class296.anInt3047;
				int var5 = (var4 + 1048575 - arg0.anInt7542) / var4;
				arg0.anInt7542 = var4 * arg1 + arg0.anInt7542 & 0xFFFFF;
				if (var5 <= arg1) {
					Class330_Sub40_Sub3 var6 = arg0.aClass330_Sub40_Sub3_7539;
					if (this.aClass330_Sub40_Sub2_9791.anIntArray9766[arg0.anInt7536] == 0) {
						arg0.aClass330_Sub40_Sub3_7539 = arg0.aClass330_Sub29_Sub1_7523.method3403(var6.method3633((byte) 85), var6.method3644(1859454861), var6.method3627((short) 255));
					} else {
						arg0.aClass330_Sub40_Sub3_7539 = arg0.aClass330_Sub29_Sub1_7523.method3403(var6.method3633((byte) 13), 0, var6.method3627((short) 255));
						this.aClass330_Sub40_Sub2_9791.method3599(arg0, arg0.aClass330_Sub11_7522.aShortArray7593[arg0.anInt7526] < 0, -456516366);
					}
					if (arg0.aClass330_Sub11_7522.aShortArray7593[arg0.anInt7526] < 0) {
						arg0.aClass330_Sub40_Sub3_7539.method3624(-1, -582230240);
					}
					arg1 = arg0.anInt7542 / var4;
				}
			}
			arg0.aClass330_Sub40_Sub3_7539.method3555(arg1);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aix.as(" + ')');
		}
	}

	public Class330_Sub40 method3556() {
		Class330_Sub5 var1 = (Class330_Sub5) this.aClass471_9790.method5869(539664854);
		if (var1 == null) {
			return null;
		} else if (var1.aClass330_Sub40_Sub3_7539 == null) {
			return this.method3550();
		} else {
			return var1.aClass330_Sub40_Sub3_7539;
		}
	}

	public int method3554() {
		return 0;
	}

	public Class330_Sub40 method3558() {
		Class330_Sub5 var1;
		do {
			var1 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -65);
			if (var1 == null) {
				return null;
			}
		} while (var1.aClass330_Sub40_Sub3_7539 == null);
		return var1.aClass330_Sub40_Sub3_7539;
	}

	public Class330_Sub40 method3557() {
		Class330_Sub5 var1;
		do {
			var1 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -22);
			if (var1 == null) {
				return null;
			}
		} while (var1.aClass330_Sub40_Sub3_7539 == null);
		return var1.aClass330_Sub40_Sub3_7539;
	}

	public void method3566(int arg0) {
		this.aClass330_Sub40_Sub4_9792.method3555(arg0);
		for (Class330_Sub5 var2 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var2 != null; var2 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -64)) {
			if (!this.aClass330_Sub40_Sub2_9791.method3611(var2, 462527280)) {
				int var3 = arg0;
				do {
					if (var3 <= var2.anInt7540 * 1803195735 * 800400999) {
						this.method3691(var2, var3, 2097970565);
						var2.anInt7540 = (var2.anInt7540 * 800400999 - var3 * 800400999) * 1803195735;
						break;
					}
					this.method3691(var2, var2.anInt7540 * 1803195735 * 800400999, 1388443797);
					var3 -= var2.anInt7540 * 1803195735 * 800400999;
				} while (!this.aClass330_Sub40_Sub2_9791.method3612(var2, null, 0, var3, 2087698757));
			}
		}
	}

	public int method3570() {
		return 0;
	}

	public int method3553() {
		return 0;
	}

	public int method3562() {
		try {
			return 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aix.p(" + ')');
		}
	}

	public void method3569(int arg0) {
		this.aClass330_Sub40_Sub4_9792.method3555(arg0);
		for (Class330_Sub5 var2 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var2 != null; var2 = (Class330_Sub5) this.aClass471_9790.method5873((byte) 7)) {
			if (!this.aClass330_Sub40_Sub2_9791.method3611(var2, 1479685115)) {
				int var3 = arg0;
				do {
					if (var3 <= var2.anInt7540 * 1803195735 * 800400999) {
						this.method3691(var2, var3, 1954500226);
						var2.anInt7540 = (var2.anInt7540 * 800400999 - var3 * 800400999) * 1803195735;
						break;
					}
					this.method3691(var2, var2.anInt7540 * 1803195735 * 800400999, 1026875439);
					var3 -= var2.anInt7540 * 1803195735 * 800400999;
				} while (!this.aClass330_Sub40_Sub2_9791.method3612(var2, null, 0, var3, 2120604415));
			}
		}
	}

	public int method3561() {
		return 0;
	}

	public void method3565(int[] arg0, int arg1, int arg2) {
		this.aClass330_Sub40_Sub4_9792.method3564(arg0, arg1, arg2);
		for (Class330_Sub5 var4 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var4 != null; var4 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -106)) {
			if (!this.aClass330_Sub40_Sub2_9791.method3611(var4, 55499316)) {
				int var5 = arg1;
				int var6 = arg2;
				do {
					if (var6 <= var4.anInt7540 * 800400999 * 1803195735) {
						this.method3690(var4, arg0, var5, var6, var6 + var5, -2100751959);
						var4.anInt7540 = (var4.anInt7540 * 800400999 - var6 * 800400999) * 1803195735;
						break;
					}
					this.method3690(var4, arg0, var5, var4.anInt7540 * 800400999 * 1803195735, var6 + var5, -144222394);
					var5 += var4.anInt7540 * 1803195735 * 800400999;
					var6 -= var4.anInt7540 * 800400999 * 1803195735;
				} while (!this.aClass330_Sub40_Sub2_9791.method3612(var4, arg0, var5, var6, 2132514001));
			}
		}
	}

	public int method3567() {
		return 0;
	}

	public Class330_Sub40 method3552() {
		try {
			Class330_Sub5 var1 = (Class330_Sub5) this.aClass471_9790.method5869(539664854);
			if (var1 == null) {
				return null;
			} else if (var1.aClass330_Sub40_Sub3_7539 == null) {
				return this.method3550();
			} else {
				return var1.aClass330_Sub40_Sub3_7539;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aix.j(" + ')');
		}
	}

	public void method3568(int arg0) {
		this.aClass330_Sub40_Sub4_9792.method3555(arg0);
		for (Class330_Sub5 var2 = (Class330_Sub5) this.aClass471_9790.method5869(539664854); var2 != null; var2 = (Class330_Sub5) this.aClass471_9790.method5873((byte) -90)) {
			if (!this.aClass330_Sub40_Sub2_9791.method3611(var2, 1936310998)) {
				int var3 = arg0;
				do {
					if (var3 <= var2.anInt7540 * 1803195735 * 800400999) {
						this.method3691(var2, var3, 2139688655);
						var2.anInt7540 = (var2.anInt7540 * 800400999 - var3 * 800400999) * 1803195735;
						break;
					}
					this.method3691(var2, var2.anInt7540 * 1803195735 * 800400999, 1830218343);
					var3 -= var2.anInt7540 * 1803195735 * 800400999;
				} while (!this.aClass330_Sub40_Sub2_9791.method3612(var2, null, 0, var3, 2016203598));
			}
		}
	}
}
