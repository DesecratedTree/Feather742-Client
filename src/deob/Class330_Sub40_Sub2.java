package deob;

public class Class330_Sub40_Sub2 extends Class330_Sub40 {

	public int anInt9737 = 256;

	public int anInt9738 = 256;

	public int anInt9739 = 1000000;

	public int[] anIntArray9740 = new int[16];

	public int[] anIntArray9741 = new int[16];

	public int[] anIntArray9757 = new int[16];

	public int[] anIntArray9742 = new int[16];

	public int[] anIntArray9744 = new int[16];

	public int[] anIntArray9745 = new int[16];

	public int[] anIntArray9746 = new int[16];

	public int[] anIntArray9747 = new int[16];

	public int[] anIntArray9748 = new int[16];

	public int[] anIntArray9763 = new int[16];

	public int[] anIntArray9764 = new int[16];

	public int[] anIntArray9754 = new int[16];

	public int[] anIntArray9755 = new int[16];

	public int[] anIntArray9766 = new int[16];

	public int[] anIntArray9743 = new int[16];

	public int[] anIntArray9758 = new int[16];

	public Class330_Sub5[][] aClass330_Sub5ArrayArray9759 = new Class330_Sub5[16][128];

	public Class330_Sub5[][] aClass330_Sub5ArrayArray9749 = new Class330_Sub5[16][128];

	public Class107 aClass107_9761 = new Class107();

	public Class330_Sub40_Sub5 aClass330_Sub40_Sub5_9756 = new Class330_Sub40_Sub5(this);

	public Class497 aClass497_9767;

	public static int anInt9750 = 1;

	public static int anInt9752 = 4;

	public static int anInt9762 = 2;

	public int anInt9751;

	public int anInt9760;

	public int anInt9769;

	public long aLong9753;

	public long aLong9765;

	public Class330_Sub6 aClass330_Sub6_9768;

	public boolean aBoolean9736;

	public boolean aBoolean9770;

	public Class330_Sub40_Sub2(Class330_Sub40_Sub2 arg0) {
		this.aClass497_9767 = arg0.aClass497_9767;
		this.method3589(-1, 256, 744353348);
		this.method3605(true, 2144742246);
	}

	public Class330_Sub40_Sub2() {
		this.aClass497_9767 = new Class497(128);
		this.method3589(-1, 256, 1641518982);
		this.method3605(true, 2098730628);
	}

	public synchronized void method3586(int arg0, int arg1) {
		try {
			this.anInt9737 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.ai(" + ')');
		}
	}

	public int method3587(int arg0) {
		try {
			return this.anInt9737;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ain.as(" + ')');
		}
	}

	public synchronized void method3588(int arg0, int arg1) {
		try {
			this.anInt9738 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.aj(" + ')');
		}
	}

	public synchronized void method3589(int arg0, int arg1, int arg2) {
		try {
			if (arg0 < 0) {
				for (int var4 = 0; var4 < 16; var4++) {
					this.anIntArray9740[var4] = arg1;
				}
			} else {
				this.anIntArray9740[arg0] = arg1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.ax(" + ')');
		}
	}

	public int method3590(Class330_Sub5 arg0, byte arg1) {
		try {
			int var3 = (arg0.anInt7533 * arg0.anInt7530 >> 12) + arg0.anInt7529;
			var3 += this.anIntArray9755[arg0.anInt7536] * (this.anIntArray9747[arg0.anInt7536] - 8192) >> 12;
			Class116 var4 = arg0.aClass116_7531;
			int var5;
			if (var4.anInt1372 > 0 && (var4.anInt1371 > 0 || this.anIntArray9748[arg0.anInt7536] > 0)) {
				var5 = var4.anInt1371 << 2;
				int var6 = var4.anInt1369 << 1;
				if (arg0.anInt7537 < var6) {
					var5 = arg0.anInt7537 * var5 / var6;
				}
				var5 += this.anIntArray9748[arg0.anInt7536] >> 7;
				double var7 = Math.sin((double) (arg0.anInt7521 & 0x1FF) * 0.01227184630308513D);
				var3 += (int) (var7 * (double) var5);
			}
			var5 = (int) ((double) (arg0.aClass330_Sub29_Sub1_7523.anInt9586 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Class296.anInt3047 + 0.5D);
			return var5 < 1 ? 1 : var5;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ain.bz(" + ')');
		}
	}

	public synchronized void method3591(Class330_Sub6 arg0, boolean arg1, int arg2) {
		try {
			this.method3592(arg0, arg1, true, (byte) 104);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.aq(" + ')');
		}
	}

	public synchronized void method3592(Class330_Sub6 arg0, boolean arg1, boolean arg2, byte arg3) {
		try {
			this.method3620(arg2, -2108397146);
			this.aClass107_9761.method1329(arg0.aByteArray7543);
			this.aBoolean9736 = arg1;
			this.aLong9765 = 0L;
			int var5 = this.aClass107_9761.method1328();
			for (int var6 = 0; var6 < var5; var6++) {
				this.aClass107_9761.method1333(var6);
				this.aClass107_9761.method1334(var6);
				this.aClass107_9761.method1340(var6);
			}
			this.anInt9751 = this.aClass107_9761.method1339();
			this.anInt9760 = this.aClass107_9761.anIntArray1012[this.anInt9751];
			this.aLong9753 = this.aClass107_9761.method1332(this.anInt9760);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ain.aa(" + ')');
		}
	}

	public synchronized void method3593(Class330_Sub6 arg0, boolean arg1, boolean arg2, long arg3) {
		try {
			this.method3592(arg0, arg1, arg2, (byte) 11);
			this.method3609(arg3 * (long) this.aClass107_9761.anInt1013);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ain.ab(" + ')');
		}
	}

	public synchronized void method3594(int arg0) {
		try {
			this.method3620(true, -2108397146);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ain.ak(" + ')');
		}
	}

	public synchronized boolean method3595(int arg0) {
		try {
			return this.aClass107_9761.method1331();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ain.az(" + ')');
		}
	}

	public synchronized void method3596(int arg0, int arg1, int arg2) {
		try {
			this.method3597(arg0, arg1, -1626946909);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.ah(" + ')');
		}
	}

	public void method3597(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray9744[arg0] = arg1;
			this.anIntArray9746[arg0] = arg1 & 0xFFFFFF80;
			this.method3616(arg0, arg1, -1896697049);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.av(" + ')');
		}
	}

	public void method3598(int arg0, int arg1, int arg2, int arg3) {
		try {
			this.method3614(arg0, arg1, 64, -1043637677);
			if ((this.anIntArray9764[arg0] & 0x2) != 0) {
				for (Class330_Sub5 var5 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5871((byte) -87); var5 != null; var5 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5874(1019206629)) {
					if (arg0 == var5.anInt7536 && var5.anInt7535 < 0) {
						this.aClass330_Sub5ArrayArray9759[arg0][var5.anInt7526] = null;
						this.aClass330_Sub5ArrayArray9759[arg0][arg1] = var5;
						int var6 = (var5.anInt7530 * var5.anInt7533 >> 12) + var5.anInt7529;
						var5.anInt7529 += arg1 - var5.anInt7526 << 8;
						var5.anInt7530 = var6 - var5.anInt7529;
						var5.anInt7533 = 4096;
						var5.anInt7526 = arg1;
						return;
					}
				}
			}
			Class330_Sub11 var10 = (Class330_Sub11) this.aClass497_9767.method6094((long) this.anIntArray9745[arg0]);
			if (var10 != null) {
				Class330_Sub29_Sub1 var11 = var10.aClass330_Sub29_Sub1Array7592[arg1];
				if (var11 != null) {
					Class330_Sub5 var7 = new Class330_Sub5();
					var7.anInt7536 = arg0;
					var7.aClass330_Sub11_7522 = var10;
					var7.aClass330_Sub29_Sub1_7523 = var11;
					var7.aClass116_7531 = var10.aClass116Array7591[arg1];
					var7.anInt7525 = var10.aByteArray7596[arg1];
					var7.anInt7526 = arg1;
					var7.anInt7527 = arg2 * arg2 * var10.anInt7594 * var10.aByteArray7597[arg1] + 1024 >> 11;
					var7.anInt7538 = var10.aByteArray7595[arg1] & 0xFF;
					var7.anInt7529 = (arg1 << 8) - (var10.aShortArray7593[arg1] & 0x7FFF);
					var7.anInt7524 = 0;
					var7.anInt7528 = 0;
					var7.anInt7534 = 0;
					var7.anInt7535 = -1;
					var7.anInt7532 = 0;
					if (this.anIntArray9766[arg0] == 0) {
						var7.aClass330_Sub40_Sub3_7539 = var11.method3403(this.method3590(var7, (byte) 8), this.method3608(var7, -221001374), this.method3621(var7, (byte) -53));
					} else {
						var7.aClass330_Sub40_Sub3_7539 = var11.method3403(this.method3590(var7, (byte) -22), 0, this.method3621(var7, (byte) -20));
						this.method3599(var7, var10.aShortArray7593[arg1] < 0, 348178353);
					}
					if (var10.aShortArray7593[arg1] < 0) {
						var7.aClass330_Sub40_Sub3_7539.method3624(-1, -1238554450);
					}
					if (var7.anInt7525 >= 0) {
						Class330_Sub5 var8 = this.aClass330_Sub5ArrayArray9749[arg0][var7.anInt7525];
						if (var8 != null && var8.anInt7535 < 0) {
							this.aClass330_Sub5ArrayArray9759[arg0][var8.anInt7526] = null;
							var8.anInt7535 = 0;
						}
						this.aClass330_Sub5ArrayArray9749[arg0][var7.anInt7525] = var7;
					}
					this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5878(var7, (short) 8192);
					this.aClass330_Sub5ArrayArray9759[arg0][arg1] = var7;
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ain.am(" + ')');
		}
	}

	public void method3599(Class330_Sub5 arg0, boolean arg1, int arg2) {
		try {
			int var4 = arg0.aClass330_Sub29_Sub1_7523.method3407();
			int var5;
			if (arg1 && arg0.aClass330_Sub29_Sub1_7523.aBoolean9589) {
				int var6 = var4 + var4 - arg0.aClass330_Sub29_Sub1_7523.anInt9588;
				var5 = (int) ((long) var6 * (long) this.anIntArray9766[arg0.anInt7536] >> 6);
				var4 <<= 0x8;
				if (var5 >= var4) {
					var5 = var4 + var4 - 1 - var5;
					arg0.aClass330_Sub40_Sub3_7539.method3628(true, (byte) 31);
				}
			} else {
				var5 = (int) ((long) var4 * (long) this.anIntArray9766[arg0.anInt7536] >> 6);
			}
			arg0.aClass330_Sub40_Sub3_7539.method3645(var5, -2121251920);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ain.au(" + ')');
		}
	}

	public void method3600(int arg0, int arg1, int arg2, int arg3) {
	}

	public void method3601(int arg0, int arg1, int arg2) {
	}

	public void method3602(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray9747[arg0] = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.bs(" + ')');
		}
	}

	public void method3603(int arg0, int arg1) {
		try {
			if (arg0 < 0) {
				for (int var5 = 0; var5 < 16; var5++) {
					this.method3603(var5, -34576043);
				}
			} else {
				this.anIntArray9741[arg0] = 12800;
				this.anIntArray9757[arg0] = 8192;
				this.anIntArray9742[arg0] = 16383;
				this.anIntArray9747[arg0] = 8192;
				this.anIntArray9748[arg0] = 0;
				this.anIntArray9763[arg0] = 8192;
				this.method3606(arg0, 1695567865);
				this.method3617(arg0, (byte) 98);
				this.anIntArray9764[arg0] = 0;
				this.anIntArray9754[arg0] = 32767;
				this.anIntArray9755[arg0] = 256;
				this.anIntArray9766[arg0] = 0;
				this.method3607(arg0, 8192, -2077280771);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bt(" + ')');
		}
	}

	public void method3604(int arg0, int arg1) {
		try {
			for (Class330_Sub5 var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5869(539664854); var3 != null; var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5873((byte) -107)) {
				if ((arg0 < 0 || arg0 == var3.anInt7536) && var3.anInt7535 < 0) {
					this.aClass330_Sub5ArrayArray9759[var3.anInt7536][var3.anInt7526] = null;
					var3.anInt7535 = 0;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bc(" + ')');
		}
	}

	public void method3605(boolean arg0, int arg1) {
		try {
			if (arg0) {
				this.method3622(-1, (byte) 67);
			} else {
				this.method3604(-1, -1297998913);
			}
			this.method3603(-1, 497195832);
			int var3;
			for (var3 = 0; var3 < 16; var3++) {
				this.anIntArray9745[var3] = this.anIntArray9744[var3];
			}
			for (var3 = 0; var3 < 16; var3++) {
				this.anIntArray9746[var3] = this.anIntArray9744[var3] & 0xFFFFFF80;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bf(" + ')');
		}
	}

	public void method3606(int arg0, int arg1) {
		try {
			if ((this.anIntArray9764[arg0] & 0x2) != 0) {
				for (Class330_Sub5 var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5869(539664854); var3 != null; var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5873((byte) -70)) {
					if (arg0 == var3.anInt7536 && this.aClass330_Sub5ArrayArray9759[arg0][var3.anInt7526] == null && var3.anInt7535 < 0) {
						var3.anInt7535 = 0;
					}
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bl(" + ')');
		}
	}

	public void method3607(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray9743[arg0] = arg1;
			this.anIntArray9758[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.bi(" + ')');
		}
	}

	public int method3608(Class330_Sub5 arg0, int arg1) {
		try {
			if (this.anIntArray9740[arg0.anInt7536] == 0) {
				return 0;
			}
			Class116 var3 = arg0.aClass116_7531;
			int var4 = this.anIntArray9741[arg0.anInt7536] * this.anIntArray9742[arg0.anInt7536] + 4096 >> 13;
			int var10 = var4 * var4 + 16384 >> 15;
			int var11 = var10 * arg0.anInt7527 + 16384 >> 15;
			int var12 = this.anInt9737 * var11 + 128 >> 8;
			int var13 = var12 * this.anInt9738 >> 8;
			var4 = var13 * this.anIntArray9740[arg0.anInt7536] + 128 >> 8;
			if (var3.anInt1367 > 0) {
				var4 = (int) ((double) var4 * Math.pow(0.5D, (double) arg0.anInt7524 * 1.953125E-5D * (double) var3.anInt1367) + 0.5D);
			}
			int var5;
			int var6;
			int var7;
			int var8;
			if (var3.aByteArray1373 != null) {
				var5 = arg0.anInt7528;
				var6 = var3.aByteArray1373[arg0.anInt7534 + 1];
				if (arg0.anInt7534 < var3.aByteArray1373.length - 2) {
					var7 = (var3.aByteArray1373[arg0.anInt7534] & 0xFF) << 8;
					var8 = (var3.aByteArray1373[arg0.anInt7534 + 2] & 0xFF) << 8;
					var6 += (var5 - var7) * (var3.aByteArray1373[arg0.anInt7534 + 3] - var6) / (var8 - var7);
				}
				var4 = var6 * var4 + 32 >> 6;
			}
			if (arg0.anInt7535 > 0 && var3.aByteArray1370 != null) {
				var5 = arg0.anInt7535;
				var6 = var3.aByteArray1370[arg0.anInt7532 + 1];
				if (arg0.anInt7532 < var3.aByteArray1370.length - 2) {
					var7 = (var3.aByteArray1370[arg0.anInt7532] & 0xFF) << 8;
					var8 = (var3.aByteArray1370[arg0.anInt7532 + 2] & 0xFF) << 8;
					var6 += (var5 - var7) * (var3.aByteArray1370[arg0.anInt7532 + 3] - var6) / (var8 - var7);
				}
				var4 = var4 * var6 + 32 >> 6;
			}
			return var4;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ain.be(" + ')');
		}
	}

	public synchronized Class330_Sub40 method3552() {
		try {
			return this.aClass330_Sub40_Sub5_9756;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ain.j(" + ')');
		}
	}

	public synchronized Class330_Sub40 method3550() {
		try {
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ain.i(" + ')');
		}
	}

	public synchronized int method3562() {
		try {
			return 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ain.p(" + ')');
		}
	}

	public void method3609(long arg0) {
		try {
			while (this.aLong9753 <= arg0) {
				int var5 = this.anInt9751;
				int var6 = this.anInt9760;
				long var3 = this.aLong9753;
				while (this.anInt9760 == var6) {
					while (var6 == this.aClass107_9761.anIntArray1012[var5]) {
						this.aClass107_9761.method1333(var5);
						int var7 = this.aClass107_9761.method1335(var5);
						if (var7 == 1) {
							this.aClass107_9761.method1341();
							this.aClass107_9761.method1340(var5);
							if (this.aClass107_9761.method1338()) {
								if (!this.aBoolean9736 || var6 == 0) {
									this.method3605(true, 2034842088);
									this.aClass107_9761.method1330();
									return;
								}
								this.aClass107_9761.method1337(var3);
							}
							break;
						}
						if ((var7 & 0x80) != 0 && (var7 & 0xF0) != 144) {
							this.method3619(var7, (byte) 4);
						}
						this.aClass107_9761.method1334(var5);
						this.aClass107_9761.method1340(var5);
					}
					this.aLong9765 = var3;
					var5 = this.aClass107_9761.method1339();
					var6 = this.aClass107_9761.anIntArray1012[var5];
					var3 = this.aClass107_9761.method1332(var6);
				}
				this.anInt9751 = var5;
				this.anInt9760 = var6;
				this.aLong9753 = var3;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ain.bp(" + ')');
		}
	}

	public void method3610(byte arg0) {
		try {
			int var2 = this.anInt9751;
			int var3 = this.anInt9760;
			long var4 = this.aLong9753;
			if (this.aClass330_Sub6_9768 != null && var3 == this.anInt9769) {
				this.method3592(this.aClass330_Sub6_9768, this.aBoolean9736, this.aBoolean9770, (byte) 127);
				this.method3610((byte) 22);
			} else {
				while (true) {
					if (this.anInt9760 != var3) {
						this.anInt9751 = var2;
						this.anInt9760 = var3;
						this.aLong9753 = var4;
						if (this.aClass330_Sub6_9768 != null && this.anInt9769 < var3) {
							this.anInt9751 = -1;
							this.anInt9760 = this.anInt9769;
							this.aLong9753 = this.aClass107_9761.method1332(this.anInt9760);
						}
						break;
					}
					while (true) {
						if (this.aClass107_9761.anIntArray1012[var2] == var3) {
							this.aClass107_9761.method1333(var2);
							int var6 = this.aClass107_9761.method1335(var2);
							if (var6 != 1) {
								if ((var6 & 0x80) != 0) {
									this.method3619(var6, (byte) 4);
								}
								this.aClass107_9761.method1334(var2);
								this.aClass107_9761.method1340(var2);
								continue;
							}
							this.aClass107_9761.method1341();
							this.aClass107_9761.method1340(var2);
							if (this.aClass107_9761.method1338()) {
								if (this.aClass330_Sub6_9768 != null) {
									this.method3591(this.aClass330_Sub6_9768, this.aBoolean9736, -1698285491);
									this.method3610((byte) 22);
									return;
								}
								if (!this.aBoolean9736 || var3 == 0) {
									this.method3605(true, 2039860600);
									this.aClass107_9761.method1330();
									return;
								}
								this.aClass107_9761.method1337(var4);
							} else if (arg0 != 22) {
								throw new IllegalStateException();
							}
						}
						var2 = this.aClass107_9761.method1339();
						var3 = this.aClass107_9761.anIntArray1012[var2];
						var4 = this.aClass107_9761.method1332(var3);
						break;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ain.bx(" + ')');
		}
	}

	public boolean method3611(Class330_Sub5 arg0, int arg1) {
		try {
			if (arg0.aClass330_Sub40_Sub3_7539 != null) {
				return false;
			}
			if (arg0.anInt7535 >= 0) {
				arg0.method3252(137599044);
				if (arg0.anInt7525 > 0 && this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525] == arg0) {
					this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525] = null;
				}
			}
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.ba(" + ')');
		}
	}

	public boolean method3612(Class330_Sub5 arg0, int[] arg1, int arg2, int arg3, int arg4) {
		try {
			arg0.anInt7540 = Class296.anInt3047 / 100;
			if (arg0.anInt7535 >= 0 && (arg0.aClass330_Sub40_Sub3_7539 == null || arg0.aClass330_Sub40_Sub3_7539.method3629(1454400254))) {
				arg0.method3272(-1723150271);
				arg0.method3252(251364423);
				if (arg0.anInt7525 > 0 && this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525] == arg0) {
					this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525] = null;
				}
				return true;
			}
			int var6 = arg0.anInt7533;
			if (var6 > 0) {
				var6 -= (int) (Math.pow(2.0D, (double) this.anIntArray9763[arg0.anInt7536] * 4.921259842519685E-4D) * 16.0D + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}
				arg0.anInt7533 = var6;
			}
			arg0.aClass330_Sub40_Sub3_7539.method3632(this.method3590(arg0, (byte) 33), (byte) -24);
			Class116 var7 = arg0.aClass116_7531;
			boolean var8 = false;
			arg0.anInt7537++;
			arg0.anInt7521 += var7.anInt1372;
			double var9 = (double) ((arg0.anInt7526 - 60 << 8) + (arg0.anInt7530 * arg0.anInt7533 >> 12)) * 5.086263020833333E-6D;
			if (var7.anInt1367 > 0) {
				if (var7.anInt1365 > 0) {
					arg0.anInt7524 += (int) (Math.pow(2.0D, var9 * (double) var7.anInt1365) * 128.0D + 0.5D);
				} else {
					arg0.anInt7524 += 128;
				}
				if (var7.anInt1367 * arg0.anInt7524 >= 819200) {
					var8 = true;
				}
			}
			if (var7.aByteArray1373 != null) {
				if (var7.anInt1366 > 0) {
					arg0.anInt7528 += (int) (Math.pow(2.0D, var9 * (double) var7.anInt1366) * 128.0D + 0.5D);
				} else {
					arg0.anInt7528 += 128;
				}
				while (arg0.anInt7534 < var7.aByteArray1373.length - 2 && arg0.anInt7528 > (var7.aByteArray1373[arg0.anInt7534 + 2] & 0xFF) << 8) {
					arg0.anInt7534 += 2;
				}
				if (var7.aByteArray1373.length - 2 == arg0.anInt7534 && var7.aByteArray1373[arg0.anInt7534 + 1] == 0) {
					var8 = true;
				}
			}
			if (arg0.anInt7535 >= 0 && var7.aByteArray1370 != null && (this.anIntArray9764[arg0.anInt7536] & 0x1) == 0 && (arg0.anInt7525 < 0 || arg0 != this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525])) {
				if (var7.anInt1368 > 0) {
					arg0.anInt7535 += (int) (Math.pow(2.0D, var9 * (double) var7.anInt1368) * 128.0D + 0.5D);
				} else {
					arg0.anInt7535 += 128;
				}
				while (arg0.anInt7532 < var7.aByteArray1370.length - 2 && arg0.anInt7535 > (var7.aByteArray1370[arg0.anInt7532 + 2] & 0xFF) << 8) {
					arg0.anInt7532 += 2;
				}
				if (var7.aByteArray1370.length - 2 == arg0.anInt7532) {
					var8 = true;
				}
			}
			if (!var8) {
				arg0.aClass330_Sub40_Sub3_7539.method3642(arg0.anInt7540, this.method3608(arg0, 1441327624), this.method3621(arg0, (byte) -58), (byte) -101);
				return false;
			}
			arg0.aClass330_Sub40_Sub3_7539.method3631(arg0.anInt7540, -1246830196);
			if (arg1 == null) {
				arg0.aClass330_Sub40_Sub3_7539.method3555(arg3);
			} else {
				arg0.aClass330_Sub40_Sub3_7539.method3564(arg1, arg2, arg3);
			}
			if (arg0.aClass330_Sub40_Sub3_7539.method3623(1036782539)) {
				this.aClass330_Sub40_Sub5_9756.aClass330_Sub40_Sub4_9792.method3684(arg0.aClass330_Sub40_Sub3_7539);
			}
			arg0.method3272(-1861968610);
			if (arg0.anInt7535 >= 0) {
				arg0.method3252(-726051442);
				if (arg0.anInt7525 > 0 && arg0 == this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525]) {
					this.aClass330_Sub5ArrayArray9749[arg0.anInt7536][arg0.anInt7525] = null;
				}
			}
			return true;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ain.bm(" + ')');
		}
	}

	public synchronized Class330_Sub40 method3557() {
		return null;
	}

	public synchronized void method3613(int arg0) {
		try {
			for (Class330_Sub11 var2 = (Class330_Sub11) this.aClass497_9767.method6099((byte) -28); var2 != null; var2 = (Class330_Sub11) this.aClass497_9767.method6098((short) -32768)) {
				var2.method3289(1411951474);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ain.an(" + ')');
		}
	}

	public synchronized int method3560() {
		return 0;
	}

	public synchronized int method3570() {
		return 0;
	}

	public synchronized void method3564(int[] arg0, int arg1, int arg2) {
		try {
			if (this.aClass107_9761.method1331()) {
				int var4 = this.aClass107_9761.anInt1013 * this.anInt9739 / Class296.anInt3047;
				do {
					long var5 = this.aLong9765 + (long) var4 * (long) arg2;
					if (this.aLong9753 - var5 >= 0L) {
						this.aLong9765 = var5;
						break;
					}
					int var7 = (int) (((long) var4 + (this.aLong9753 - this.aLong9765) - 1L) / (long) var4);
					this.aLong9765 += (long) var7 * (long) var4;
					this.aClass330_Sub40_Sub5_9756.method3564(arg0, arg1, var7);
					arg1 += var7;
					arg2 -= var7;
					this.method3610((byte) 22);
				} while (this.aClass107_9761.method1331());
			}
			this.aClass330_Sub40_Sub5_9756.method3564(arg0, arg1, arg2);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ain.s(" + ')');
		}
	}

	public synchronized int method3567() {
		return 0;
	}

	public synchronized int method3554() {
		return 0;
	}

	public synchronized int method3561() {
		return 0;
	}

	public synchronized void method3565(int[] arg0, int arg1, int arg2) {
		if (this.aClass107_9761.method1331()) {
			int var4 = this.aClass107_9761.anInt1013 * -710324601 * this.anInt9739 * -883026121 / Class296.anInt3047;
			do {
				long var5 = this.aLong9765 * 8715236228919510299L * 5161194382673644819L + (long) var4 * (long) arg2;
				if (this.aLong9753 * 7878286834071986607L * -1357640544086747825L - var5 >= 0L) {
					this.aLong9765 = var5 * 8715236228919510299L * 5161194382673644819L;
					break;
				}
				int var7 = (int) (((long) var4 + (this.aLong9753 * -1357640544086747825L * 7878286834071986607L - this.aLong9765 * 5161194382673644819L * 8715236228919510299L) - 1L) / (long) var4);
				this.aLong9765 = (this.aLong9765 * 8715236228919510299L + (long) var7 * (long) var4 * 8715236228919510299L) * 5161194382673644819L;
				this.aClass330_Sub40_Sub5_9756.method3564(arg0, arg1, var7);
				arg1 += var7;
				arg2 -= var7;
				this.method3610((byte) 22);
			} while (this.aClass107_9761.method1331());
		}
		this.aClass330_Sub40_Sub5_9756.method3564(arg0, arg1, arg2);
	}

	public synchronized void method3566(int arg0) {
		if (this.aClass107_9761.method1331()) {
			int var2 = this.aClass107_9761.anInt1013 * -710324601 * this.anInt9739 * -883026121 / Class296.anInt3047;
			do {
				long var3 = this.aLong9765 * 5161194382673644819L * 8715236228919510299L + (long) var2 * (long) arg0;
				if (this.aLong9753 * 7878286834071986607L * -1357640544086747825L - var3 >= 0L) {
					this.aLong9765 = var3 * 8715236228919510299L * 5161194382673644819L;
					break;
				}
				int var5 = (int) ((this.aLong9753 * -1357640544086747825L * 7878286834071986607L - this.aLong9765 * 8715236228919510299L * 5161194382673644819L + (long) var2 - 1L) / (long) var2);
				this.aLong9765 = (this.aLong9765 * 8715236228919510299L + (long) var5 * 8715236228919510299L * (long) var2) * 5161194382673644819L;
				this.aClass330_Sub40_Sub5_9756.method3555(var5);
				arg0 -= var5;
				this.method3610((byte) 22);
			} while (this.aClass107_9761.method1331());
		}
		this.aClass330_Sub40_Sub5_9756.method3555(arg0);
	}

	public synchronized void method3569(int arg0) {
		if (this.aClass107_9761.method1331()) {
			int var2 = this.aClass107_9761.anInt1013 * -710324601 * this.anInt9739 * -883026121 / Class296.anInt3047;
			do {
				long var3 = this.aLong9765 * 5161194382673644819L * 8715236228919510299L + (long) var2 * (long) arg0;
				if (this.aLong9753 * 7878286834071986607L * -1357640544086747825L - var3 >= 0L) {
					this.aLong9765 = var3 * 8715236228919510299L * 5161194382673644819L;
					break;
				}
				int var5 = (int) ((this.aLong9753 * -1357640544086747825L * 7878286834071986607L - this.aLong9765 * 8715236228919510299L * 5161194382673644819L + (long) var2 - 1L) / (long) var2);
				this.aLong9765 = (this.aLong9765 * 8715236228919510299L + (long) var5 * 8715236228919510299L * (long) var2) * 5161194382673644819L;
				this.aClass330_Sub40_Sub5_9756.method3555(var5);
				arg0 -= var5;
				this.method3610((byte) 22);
			} while (this.aClass107_9761.method1331());
		}
		this.aClass330_Sub40_Sub5_9756.method3555(arg0);
	}

	public synchronized void method3568(int arg0) {
		if (this.aClass107_9761.method1331()) {
			int var2 = this.aClass107_9761.anInt1013 * -710324601 * this.anInt9739 * -883026121 / Class296.anInt3047;
			do {
				long var3 = this.aLong9765 * 5161194382673644819L * 8715236228919510299L + (long) var2 * (long) arg0;
				if (this.aLong9753 * 7878286834071986607L * -1357640544086747825L - var3 >= 0L) {
					this.aLong9765 = var3 * 8715236228919510299L * 5161194382673644819L;
					break;
				}
				int var5 = (int) ((this.aLong9753 * -1357640544086747825L * 7878286834071986607L - this.aLong9765 * 8715236228919510299L * 5161194382673644819L + (long) var2 - 1L) / (long) var2);
				this.aLong9765 = (this.aLong9765 * 8715236228919510299L + (long) var5 * 8715236228919510299L * (long) var2) * 5161194382673644819L;
				this.aClass330_Sub40_Sub5_9756.method3555(var5);
				arg0 -= var5;
				this.method3610((byte) 22);
			} while (this.aClass107_9761.method1331());
		}
		this.aClass330_Sub40_Sub5_9756.method3555(arg0);
	}

	public synchronized Class330_Sub40 method3559() {
		return null;
	}

	public void method3614(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class330_Sub5 var5 = this.aClass330_Sub5ArrayArray9759[arg0][arg1];
			if (var5 != null) {
				this.aClass330_Sub5ArrayArray9759[arg0][arg1] = null;
				if ((this.anIntArray9764[arg0] & 0x2) == 0) {
					var5.anInt7535 = 0;
				} else {
					for (Class330_Sub5 var6 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5869(539664854); var6 != null; var6 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5873((byte) -37)) {
						if (var6.anInt7536 == var5.anInt7536 && var6.anInt7535 < 0 && var6 != var5) {
							var5.anInt7535 = 0;
							break;
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ain.ae(" + ')');
		}
	}

	public synchronized boolean method3615(Class330_Sub6 arg0, IndexTable arg1, Class305 arg2, int arg3, short arg4) {
		try {
			arg0.method3274();
			boolean var6 = true;
			int[] var7 = null;
			if (arg3 > 0) {
				var7 = new int[] { arg3 };
			}
			for (Class330_Sub35 var8 = (Class330_Sub35) arg0.aClass497_7544.method6099((byte) 59); var8 != null; var8 = (Class330_Sub35) arg0.aClass497_7544.method6098((short) -32768)) {
				int var9 = (int) var8.aLong3341;
				Class330_Sub11 var10 = (Class330_Sub11) this.aClass497_9767.method6094((long) var9);
				if (var10 == null) {
					var10 = Class195.method2140(arg1, var9, 1755280364);
					if (var10 == null) {
						var6 = false;
						continue;
					}
					this.aClass497_9767.method6097(var10, (long) var9);
				}
				if (!var10.method3290(arg2, (byte[]) var8.anObject7733, var7, -1879384450)) {
					var6 = false;
				}
			}
			if (var6) {
				arg0.method3275();
			}
			return var6;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ain.ad(" + ')');
		}
	}

	public synchronized void method3555(int arg0) {
		try {
			if (this.aClass107_9761.method1331()) {
				int var2 = this.aClass107_9761.anInt1013 * this.anInt9739 / Class296.anInt3047;
				do {
					long var3 = this.aLong9765 + (long) var2 * (long) arg0;
					if (this.aLong9753 - var3 >= 0L) {
						this.aLong9765 = var3;
						break;
					}
					int var5 = (int) ((this.aLong9753 - this.aLong9765 + (long) var2 - 1L) / (long) var2);
					this.aLong9765 += (long) var5 * (long) var2;
					this.aClass330_Sub40_Sub5_9756.method3555(var5);
					arg0 -= var5;
					this.method3610((byte) 22);
				} while (this.aClass107_9761.method1331());
			}
			this.aClass330_Sub40_Sub5_9756.method3555(arg0);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ain.f(" + ')');
		}
	}

	public void method3616(int arg0, int arg1, int arg2) {
		try {
			if (arg1 != this.anIntArray9745[arg0]) {
				this.anIntArray9745[arg0] = arg1;
				for (int var4 = 0; var4 < 128; var4++) {
					this.aClass330_Sub5ArrayArray9749[arg0][var4] = null;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ain.ar(" + ')');
		}
	}

	public synchronized Class330_Sub40 method3558() {
		return null;
	}

	public void method3617(int arg0, byte arg1) {
		try {
			if ((this.anIntArray9764[arg0] & 0x4) != 0) {
				for (Class330_Sub5 var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5869(539664854); var3 != null; var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5873((byte) -90)) {
					if (var3.anInt7536 == arg0) {
						var3.anInt7542 = 0;
					}
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bk(" + ')');
		}
	}

	public synchronized int method3553() {
		return 0;
	}

	public synchronized Class330_Sub40 method3556() {
		return this.aClass330_Sub40_Sub5_9756;
	}

	public synchronized void method3618(int arg0) {
		try {
			for (Class330_Sub11 var2 = (Class330_Sub11) this.aClass497_9767.method6099((byte) -20); var2 != null; var2 = (Class330_Sub11) this.aClass497_9767.method6098((short) -32768)) {
				var2.method3252(-1358551604);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ain.af(" + ')');
		}
	}

	public void method3619(int arg0, byte arg1) {
		try {
			int var3 = arg0 & 0xF0;
			int var4;
			int var5;
			int var6;
			if (var3 == 128) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				var6 = arg0 >> 16 & 0x7F;
				this.method3614(var4, var5, var6, -1584464563);
			} else if (var3 == 144) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				var6 = arg0 >> 16 & 0x7F;
				if (var6 > 0) {
					this.method3598(var4, var5, var6, -675847140);
				} else {
					this.method3614(var4, var5, 64, -2146318723);
				}
			} else if (var3 == 160) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				var6 = arg0 >> 16 & 0x7F;
				this.method3600(var4, var5, var6, 1225502755);
			} else if (var3 == 176) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				var6 = arg0 >> 16 & 0x7F;
				if (var5 == 0) {
					this.anIntArray9746[var4] = (this.anIntArray9746[var4] & 0xFFE03FFF) + (var6 << 14);
				}
				if (var5 == 32) {
					this.anIntArray9746[var4] = (this.anIntArray9746[var4] & 0xFFFFC07F) + (var6 << 7);
				}
				if (var5 == 1) {
					this.anIntArray9748[var4] = (this.anIntArray9748[var4] & 0xFFFFC07F) + (var6 << 7);
				}
				if (var5 == 33) {
					this.anIntArray9748[var4] = (this.anIntArray9748[var4] & 0xFFFFFF80) + var6;
				}
				if (var5 == 5) {
					this.anIntArray9763[var4] = (var6 << 7) + (this.anIntArray9763[var4] & 0xFFFFC07F);
				}
				if (var5 == 37) {
					this.anIntArray9763[var4] = var6 + (this.anIntArray9763[var4] & 0xFFFFFF80);
				}
				if (var5 == 7) {
					this.anIntArray9741[var4] = (var6 << 7) + (this.anIntArray9741[var4] & 0xFFFFC07F);
				}
				if (var5 == 39) {
					this.anIntArray9741[var4] = (this.anIntArray9741[var4] & 0xFFFFFF80) + var6;
				}
				if (var5 == 10) {
					this.anIntArray9757[var4] = (this.anIntArray9757[var4] & 0xFFFFC07F) + (var6 << 7);
				}
				if (var5 == 42) {
					this.anIntArray9757[var4] = (this.anIntArray9757[var4] & 0xFFFFFF80) + var6;
				}
				if (var5 == 11) {
					this.anIntArray9742[var4] = (var6 << 7) + (this.anIntArray9742[var4] & 0xFFFFC07F);
				}
				if (var5 == 43) {
					this.anIntArray9742[var4] = var6 + (this.anIntArray9742[var4] & 0xFFFFFF80);
				}
				if (var5 == 64) {
					if (var6 >= 64) {
						this.anIntArray9764[var4] |= 0x1;
					} else {
						this.anIntArray9764[var4] &= 0xFFFFFFFE;
					}
				}
				if (var5 == 65) {
					if (var6 >= 64) {
						this.anIntArray9764[var4] |= 0x2;
					} else {
						this.method3606(var4, 1311863896);
						this.anIntArray9764[var4] &= 0xFFFFFFFD;
					}
				}
				if (var5 == 99) {
					this.anIntArray9754[var4] = (var6 << 7) + (this.anIntArray9754[var4] & 0x7F);
				}
				if (var5 == 98) {
					this.anIntArray9754[var4] = (this.anIntArray9754[var4] & 0x3F80) + var6;
				}
				if (var5 == 101) {
					this.anIntArray9754[var4] = (var6 << 7) + (this.anIntArray9754[var4] & 0x7F) + 16384;
				}
				if (var5 == 100) {
					this.anIntArray9754[var4] = (this.anIntArray9754[var4] & 0x3F80) + 16384 + var6;
				}
				if (var5 == 120) {
					this.method3622(var4, (byte) 64);
				}
				if (var5 == 121) {
					this.method3603(var4, -489383446);
				}
				if (var5 == 123) {
					this.method3604(var4, -2135354059);
				}
				int var7;
				if (var5 == 6) {
					var7 = this.anIntArray9754[var4];
					if (var7 == 16384) {
						this.anIntArray9755[var4] = (this.anIntArray9755[var4] & 0xFFFFC07F) + (var6 << 7);
					}
				}
				if (var5 == 38) {
					var7 = this.anIntArray9754[var4];
					if (var7 == 16384) {
						this.anIntArray9755[var4] = (this.anIntArray9755[var4] & 0xFFFFFF80) + var6;
					}
				}
				if (var5 == 16) {
					this.anIntArray9766[var4] = (this.anIntArray9766[var4] & 0xFFFFC07F) + (var6 << 7);
				}
				if (var5 == 48) {
					this.anIntArray9766[var4] = var6 + (this.anIntArray9766[var4] & 0xFFFFFF80);
				}
				if (var5 == 81) {
					if (var6 >= 64) {
						this.anIntArray9764[var4] |= 0x4;
					} else {
						this.method3617(var4, (byte) 92);
						this.anIntArray9764[var4] &= 0xFFFFFFFB;
					}
				}
				if (var5 == 17) {
					this.method3607(var4, (this.anIntArray9743[var4] & 0xFFFFC07F) + (var6 << 7), -2118283474);
				}
				if (var5 == 49) {
					this.method3607(var4, (this.anIntArray9743[var4] & 0xFFFFFF80) + var6, -2135645013);
				}
			} else if (var3 == 192) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				this.method3616(var4, this.anIntArray9746[var4] + var5, -1609940274);
			} else if (var3 == 208) {
				var4 = arg0 & 0xF;
				var5 = arg0 >> 8 & 0x7F;
				this.method3601(var4, var5, -1988860675);
			} else if (var3 == 224) {
				var4 = arg0 & 0xF;
				var5 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
				this.method3602(var4, var5, 1852962849);
			} else {
				var3 = arg0 & 0xFF;
				if (var3 == 255) {
					this.method3605(true, 2046502405);
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ain.br(" + ')');
		}
	}

	public synchronized void method3620(boolean arg0, int arg1) {
		try {
			this.aClass107_9761.method1330();
			this.aClass330_Sub6_9768 = null;
			this.method3605(arg0, 2034105594);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.ag(" + ')');
		}
	}

	public int method3621(Class330_Sub5 arg0, byte arg1) {
		try {
			int var3 = this.anIntArray9757[arg0.anInt7536];
			return var3 < 8192 ? var3 * arg0.anInt7538 + 32 >> 6 : 16384 - ((128 - arg0.anInt7538) * (16384 - var3) + 32 >> 6);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.by(" + ')');
		}
	}

	public void method3622(int arg0, byte arg1) {
		try {
			for (Class330_Sub5 var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5869(539664854); var3 != null; var3 = (Class330_Sub5) this.aClass330_Sub40_Sub5_9756.aClass471_9790.method5873((byte) -50)) {
				if (arg0 < 0 || var3.anInt7536 == arg0) {
					if (var3.aClass330_Sub40_Sub3_7539 != null) {
						var3.aClass330_Sub40_Sub3_7539.method3631(Class296.anInt3047 / 100, -1246830196);
						if (var3.aClass330_Sub40_Sub3_7539.method3623(1036782539)) {
							this.aClass330_Sub40_Sub5_9756.aClass330_Sub40_Sub4_9792.method3684(var3.aClass330_Sub40_Sub3_7539);
						}
						var3.method3272(581628466);
					}
					if (var3.anInt7535 < 0) {
						this.aClass330_Sub5ArrayArray9759[var3.anInt7536][var3.anInt7526] = null;
					}
					var3.method3252(66524092);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ain.bo(" + ')');
		}
	}
}
