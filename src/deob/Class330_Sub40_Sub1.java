package deob;

import java.util.Calendar;

public class Class330_Sub40_Sub1 extends Class330_Sub40 {

	public static Class273 aClass273_9727 = new Class273(64, Class271.aClass271_2755);

	public static int anInt9730 = 100;

	public Class471 aClass471_9735 = new Class471();

	public int anInt9726 = 0;

	public int anInt9732 = 256;

	public int anInt9733 = 256;

	public int anInt9729;

	public int anInt9731;

	public boolean aBoolean9728;

	public boolean aBoolean9734;

	public Class330_Sub40_Sub1(int arg0) {
		this.anInt9729 = arg0;
	}

	public static final void method3571(long arg0) {
		try {
			int var2 = client.anInt9068;
			int var3 = client.anInt9069;
			int var4;
			int var5;
			if (var2 != IndexTable.anInt2906) {
				var4 = var2 - IndexTable.anInt2906;
				var5 = (int) (arg0 * (long) var4 / 320L);
				if (var4 > 0) {
					if (var5 == 0) {
						var5 = 1;
					} else if (var5 > var4) {
						var5 = var4;
					}
				} else if (var5 == 0) {
					var5 = -1;
				} else if (var5 < var4) {
					var5 = var4;
				}
				IndexTable.anInt2906 += var5;
			}
			if (var3 != Class308.anInt3194) {
				var4 = var3 - Class308.anInt3194;
				var5 = (int) (arg0 * (long) var4 / 320L);
				if (var4 > 0) {
					if (var5 == 0) {
						var5 = 1;
					} else if (var5 > var4) {
						var5 = var4;
					}
				} else if (var5 == 0) {
					var5 = -1;
				} else if (var5 < var4) {
					var5 = var4;
				}
				Class308.anInt3194 += var5;
			}
			client.aFloat9141 += client.aFloat9072 * (float) arg0 / 40.0F * 8.0F;
			client.aFloat9250 += client.aFloat9124 * (float) arg0 / 40.0F * 8.0F;
			Class344.method4003(575222518);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aij.hl(" + ')');
		}
	}

	public void method3572(int arg0, int arg1) {
		try {
			this.anInt9732 = arg0;
			this.anInt9733 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aij.ai(" + ')');
		}
	}

	public synchronized void method3564(int[] arg0, int arg1, int arg2) {
		try {
			if (!this.aBoolean9728) {
				if (this.method3573(-1408375895) != null) {
					int var4 = arg1 + arg2;
					if (Class296.aBoolean3023) {
						var4 <<= 0x1;
					}
					byte var5 = 0;
					byte var6 = 0;
					if (this.anInt9729 == 2) {
						var6 = 1;
					}
					while (arg1 < var4) {
						Class330_Sub32 var7 = this.method3573(-1408375895);
						if (var7 == null) {
							break;
						}
						short[][] var8 = var7.aShortArrayArray7725;
						while (arg1 < var4 && this.anInt9731 < var8[0].length) {
							if (Class296.aBoolean3023) {
								arg0[arg1++] = this.anInt9732 * var8[var5][this.anInt9731];
								arg0[arg1++] = var8[var6][this.anInt9731] * this.anInt9733;
							} else {
								int var10001 = arg1++;
								arg0[var10001] += this.anInt9733 * var8[var6][this.anInt9731] + this.anInt9732 * var8[var5][this.anInt9731];
							}
							this.anInt9731++;
						}
						if (this.anInt9731 >= var8[0].length) {
							this.method3580(237299714);
						}
					}
				} else if (this.aBoolean9734) {
					this.method3252(-1628430281);
					aClass273_9727.method2678(-2107149980);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aij.s(" + ')');
		}
	}

	public synchronized void method3555(int arg0) {
		try {
			if (!this.aBoolean9728) {
				while (true) {
					Class330_Sub32 var2 = this.method3573(-1408375895);
					if (var2 == null) {
						if (this.aBoolean9734) {
							this.method3252(-1646245803);
							aClass273_9727.method2678(1543289822);
						}
						break;
					}
					if (var2.aShortArrayArray7725[0].length - this.anInt9731 > arg0) {
						this.anInt9731 += arg0;
						break;
					}
					arg0 -= var2.aShortArrayArray7725[0].length - this.anInt9731;
					this.method3580(237299714);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.f(" + ')');
		}
	}

	public synchronized void method3569(int arg0) {
		if (this.aBoolean9728) {
			return;
		}
		while (true) {
			Class330_Sub32 var2 = this.method3573(-1408375895);
			if (var2 == null) {
				if (this.aBoolean9734) {
					this.method3252(581268329);
					aClass273_9727.method2678(-1490920972);
				}
				break;
			}
			if (var2.aShortArrayArray7725[0].length - this.anInt9731 * -775205259 * -1271295523 > arg0) {
				this.anInt9731 = (this.anInt9731 * -1271295523 + arg0 * -1271295523) * -775205259;
				break;
			}
			arg0 -= var2.aShortArrayArray7725[0].length - this.anInt9731 * -1271295523 * -775205259;
			this.method3580(237299714);
		}
	}

	public synchronized Class330_Sub32 method3573(int arg0) {
		try {
			return (Class330_Sub32) this.aClass471_9735.method5869(539664854);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.aj(" + ')');
		}
	}

	public synchronized void method3565(int[] arg0, int arg1, int arg2) {
		if (this.aBoolean9728) {
			return;
		}
		if (this.method3573(-1408375895) != null) {
			int var4 = arg1 + arg2;
			if (Class296.aBoolean3023) {
				var4 <<= 0x1;
			}
			byte var5 = 0;
			byte var6 = 0;
			if (this.anInt9729 * 2051112119 * -470933241 == 2) {
				var6 = 1;
			}
			while (arg1 < var4) {
				Class330_Sub32 var7 = this.method3573(-1408375895);
				if (var7 == null) {
					break;
				}
				short[][] var8 = var7.aShortArrayArray7725;
				while (arg1 < var4 && this.anInt9731 * -1271295523 * -775205259 < var8[0].length) {
					if (Class296.aBoolean3023) {
						arg0[arg1++] = this.anInt9732 * 334356537 * -580907511 * var8[var5][this.anInt9731 * -775205259 * -1271295523];
						arg0[arg1++] = var8[var6][this.anInt9731 * -775205259 * -1271295523] * this.anInt9733 * 1276003891 * -849992453;
					} else {
						int var10001 = arg1++;
						arg0[var10001] += this.anInt9733 * -849992453 * 1276003891 * var8[var6][this.anInt9731 * -1271295523 * -775205259] + this.anInt9732 * 334356537 * -580907511 * var8[var5][this.anInt9731 * -1271295523 * -775205259];
					}
					this.anInt9731 = (this.anInt9731 * -1271295523 + -1271295523) * -775205259;
				}
				if (this.anInt9731 * -775205259 * -1271295523 >= var8[0].length) {
					this.method3580(237299714);
				}
			}
		} else if (this.aBoolean9734) {
			this.method3252(167456154);
			aClass273_9727.method2678(-443268378);
		}
	}

	public Class330_Sub32 method3574(int arg0, double arg1) {
		try {
			long var4 = (long) (this.anInt9729 << 32 | arg0);
			Class330_Sub32 var6 = (Class330_Sub32) aClass273_9727.method2680(var4, -2120731619);
			if (var6 == null) {
				var6 = new Class330_Sub32(new short[this.anInt9729][arg0], arg1);
			} else {
				var6.aDouble7726 = arg1;
				aClass273_9727.method2674(var4, -314619036);
			}
			return var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aij.ad(" + ')');
		}
	}

	public synchronized void method3575(Class330_Sub32 arg0, byte arg1) {
		try {
			while (this.anInt9726 >= 100) {
				this.aClass471_9735.method5867((short) 8960);
				this.anInt9726--;
			}
			this.aClass471_9735.method5878(arg0, (short) 8192);
			this.anInt9726++;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aij.an(" + ')');
		}
	}

	public synchronized double method3576(int arg0) {
		try {
			if (this.anInt9726 < 1) {
				return -1.0D;
			} else {
				Class330_Sub32 var2 = (Class330_Sub32) this.aClass471_9735.method5869(539664854);
				return var2 == null ? -1.0D : var2.aDouble7726 - (double) ((float) var2.aShortArrayArray7725[0].length / (float) Class296.anInt3047);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.af(" + ')');
		}
	}

	public synchronized void method3577(byte arg0) {
		try {
			this.aBoolean9734 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.aq(" + ')');
		}
	}

	public Class330_Sub40 method3558() {
		return null;
	}

	public Class330_Sub40 method3552() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aij.j(" + ')');
		}
	}

	public static final int method3578(int arg0, int arg1) {
		try {
			int var2 = arg0 & 0x3F;
			int var3 = arg0 >> 6 & 0x3;
			if (var2 == 18) {
				if (var3 == 0) {
					return 1;
				}
				if (var3 == 1) {
					return 2;
				}
				if (var3 == 2) {
					return 4;
				}
				if (var3 == 3) {
					return 8;
				}
			} else if (var2 == 19 || var2 == 21) {
				if (var3 == 0) {
					return 16;
				}
				if (var3 == 1) {
					return 32;
				}
				if (var3 == 2) {
					return 64;
				}
				if (var3 == 3) {
					return 128;
				}
			}
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aij.iq(" + ')');
		}
	}

	public Class330_Sub40 method3557() {
		return null;
	}

	public Class330_Sub40 method3559() {
		return null;
	}

	public int method3560() {
		return 1;
	}

	public int method3570() {
		return 1;
	}

	public int method3553() {
		return 1;
	}

	public int method3567() {
		return 1;
	}

	public int method3554() {
		return 1;
	}

	public int method3561() {
		return 1;
	}

	public synchronized void method3566(int arg0) {
		if (this.aBoolean9728) {
			return;
		}
		while (true) {
			Class330_Sub32 var2 = this.method3573(-1408375895);
			if (var2 == null) {
				if (this.aBoolean9734) {
					this.method3252(-9247384);
					aClass273_9727.method2678(1961593559);
				}
				break;
			}
			if (var2.aShortArrayArray7725[0].length - this.anInt9731 * -775205259 * -1271295523 > arg0) {
				this.anInt9731 = (this.anInt9731 * -1271295523 + arg0 * -1271295523) * -775205259;
				break;
			}
			arg0 -= var2.aShortArrayArray7725[0].length - this.anInt9731 * -1271295523 * -775205259;
			this.method3580(237299714);
		}
	}

	public synchronized int method3579(int arg0) {
		try {
			return this.anInt9726;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.as(" + ')');
		}
	}

	public Class330_Sub40 method3556() {
		return null;
	}

	public synchronized void method3568(int arg0) {
		if (this.aBoolean9728) {
			return;
		}
		while (true) {
			Class330_Sub32 var2 = this.method3573(-1408375895);
			if (var2 == null) {
				if (this.aBoolean9734) {
					this.method3252(-749221245);
					aClass273_9727.method2678(-37338157);
				}
				break;
			}
			if (var2.aShortArrayArray7725[0].length - this.anInt9731 * -775205259 * -1271295523 > arg0) {
				this.anInt9731 = (this.anInt9731 * -1271295523 + arg0 * -1271295523) * -775205259;
				break;
			}
			arg0 -= var2.aShortArrayArray7725[0].length - this.anInt9731 * -1271295523 * -775205259;
			this.method3580(237299714);
		}
	}

	public synchronized void method3580(int arg0) {
		try {
			Class330_Sub32 var2 = this.method3573(-1408375895);
			if (var2 != null) {
				var2.method3252(-2026732080);
				this.anInt9731 = 0;
				this.anInt9726--;
				aClass273_9727.method2676(var2.method3433(1150698309), var2, -270625351);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.ax(" + ')');
		}
	}

	public Class330_Sub40 method3550() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aij.i(" + ')');
		}
	}

	public static String method3581(long arg0, int arg1, boolean arg2, int arg3) {
		try {
			Calendar var5;
			if (arg2) {
				Class22.method475(arg0);
				var5 = Class528.aCalendar6217;
			} else {
				Class452.method5637(arg0);
				var5 = Class528.aCalendar6215;
			}
			int var6 = var5.get(5);
			int var7 = var5.get(2);
			int var8 = var5.get(1);
			int var9 = var5.get(11);
			int var10 = var5.get(12);
			return arg1 == 3 ? Class95_Sub2.method1109(arg0, arg1, arg2, -1393544315) : Integer.toString(var6 / 10) + var6 % 10 + "-" + Class528.aStringArrayArray6216[arg1][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aij.j(" + ')');
		}
	}

	public static final void method3582(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5716(var2, -1030808461);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.aqw(" + ')');
		}
	}

	public int method3562() {
		try {
			return 1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aij.p(" + ')');
		}
	}

	public synchronized void method3583(boolean arg0, int arg1) {
		try {
			this.aBoolean9728 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aij.aa(" + ')');
		}
	}

	public static void method3584(long[] arg0, Object[] arg1, byte arg2) {
		try {
			Class13.method439(arg0, arg1, 0, arg0.length - 1, 776512794);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aij.n(" + ')');
		}
	}

	public static final void method3585(Class430 arg0, int arg1) {
		try {
			arg0.anInt4380 -= 2;
			if (arg0.aLongArray4379[arg0.anInt4380] > arg0.aLongArray4379[arg0.anInt4380 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aij.br(" + ')');
		}
	}
}
