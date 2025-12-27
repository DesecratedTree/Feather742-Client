package deob;

import java.awt.Dimension;

public class Class70 {

	public boolean aBoolean593 = false;

	public int anInt586 = -1;

	public int anInt598 = 0;

	public boolean aBoolean597 = false;

	public boolean aBoolean602 = false;

	public Class463 aClass463_599;

	public int anInt590;

	public int anInt591;

	public int anInt604;

	public Class432_Sub1 aClass432_Sub1_605;

	public byte aByte587;

	public byte aByte588;

	public boolean aBoolean600;

	public Class477 aClass477_595;

	public int anInt596;

	public Class387 aClass387_594;

	public Class388 aClass388_603;

	public Class481 aClass481_592;

	public Class_na aClass_na601;

	public boolean[] aBooleanArray589;

	public Class70(Class_ra arg0, Class463 arg1, Class473 arg2, int arg3, int arg4, int arg5, int arg6, Class432_Sub1 arg7, boolean arg8, int arg9) {
		this.aClass463_599 = arg1;
		this.anInt590 = arg2.anInt5657;
		this.anInt591 = arg3;
		this.anInt604 = arg4;
		this.aClass432_Sub1_605 = arg7;
		this.aBoolean597 = arg9 != -1;
		this.aByte587 = (byte) arg5;
		this.aByte588 = (byte) arg6;
		this.aBoolean593 = arg8;
		this.aBoolean600 = arg0.y() && arg2.aBoolean5685 && !this.aBoolean593;
		this.aClass477_595 = new Class477_Sub2(arg7, false);
		this.method807(false, arg9, 1, -1679742491);
	}

	public void method802(int arg0, int arg1) {
		try {
			this.aBoolean597 = true;
			this.method807(false, arg0, 1, -1448432559);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cv.r(" + ')');
		}
	}

	public int method803(byte arg0) {
		try {
			return this.anInt598;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.j(" + ')');
		}
	}

	public void method804(Class481 arg0, byte arg1) {
		try {
			this.aClass481_592 = arg0;
			this.aClass387_594 = null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cv.i(" + ')');
		}
	}

	public int method805(int arg0) {
		try {
			return -this.method803((byte) -5);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.p(" + ')');
		}
	}

	public final Class387 method806(Class_ra arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
		try {
			Class473 var6 = this.aClass463_599.method5705(this.anInt590, (byte) -119);
			if (var6.anIntArray5678 != null) {
				var6 = var6.method5900(client.anInt8987 == 0 ? Class96.anInterface29_866 : Class158.aClass561_6474, (byte) -64);
			}
			if (var6 == null) {
				this.method810(arg0, 512290825);
				this.anInt586 = -1;
				return null;
			}
			if (!this.aBoolean597 && this.anInt586 != var6.anInt5657) {
				this.method807(true, -1, 0, -1992154865);
				this.aBoolean602 = false;
				this.aClass387_594 = null;
			}
			this.method811(this.aClass432_Sub1_605, -968435666);
			if (arg3) {
				arg3 &= this.aBoolean600 & !this.aBoolean602 & Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(1578516356) != 0;
			}
			if (arg2 && !arg3) {
				this.anInt586 = var6.anInt5657;
				return null;
			}
			Class260 var7 = this.aClass432_Sub1_605.method5346().aClass260_2606;
			Class356 var8 = client.aClass304_9030.method3023(-400722441);
			if (arg3) {
				var8.method4167(this.aClass_na601, this.aByte588, (int) var7.aFloat2716, (int) var7.aFloat2711, this.aBooleanArray589, (byte) 8);
				this.aBoolean602 = false;
			}
			Class_xa var9 = var8.aClass_xaArray3676[this.aByte588];
			Class_xa var10;
			if (this.aBoolean593) {
				var10 = var8.aClass_xaArray3701[0];
			} else {
				var10 = this.aByte588 < 3 ? var8.aClass_xaArray3676[this.aByte588 + 1] : null;
			}
			Class387 var11 = null;
			if (this.aClass477_595.method5966(-572934831)) {
				if (arg3) {
					arg1 |= 0x40000;
				}
				var11 = var6.method5898(arg0, arg1, this.anInt591 == 11 ? 10 : this.anInt591, this.anInt591 == 11 ? this.anInt604 + 4 : this.anInt604, var9, var10, (int) var7.aFloat2716, var9.method6416((int) var7.aFloat2716, (int) var7.aFloat2711, 1159002493), (int) var7.aFloat2711, this.aClass477_595, this.aClass481_592, -459744035);
				if (var11 == null) {
					this.aBooleanArray589 = null;
					this.aClass_na601 = null;
					this.anInt598 = 0;
				} else {
					if (arg3) {
						if (this.aBooleanArray589 == null) {
							this.aBooleanArray589 = new boolean[4];
						}
						this.aClass_na601 = var11.ga(this.aClass_na601);
						var8.method4185(this.aClass_na601, this.aByte588, (int) var7.aFloat2716, (int) var7.aFloat2711, this.aBooleanArray589, (byte) -29);
						this.aBoolean602 = true;
					}
					this.anInt598 = var11.YA();
					var11.n();
				}
				this.aClass387_594 = null;
			} else if (this.aClass387_594 != null && (this.aClass387_594.m() & arg1) == arg1 && var6.anInt5657 == this.anInt586) {
				var11 = this.aClass387_594;
			} else {
				if (this.aClass387_594 != null) {
					arg1 |= this.aClass387_594.m();
				}
				Class485 var12 = var6.method5897(arg0, arg1, this.anInt591 == 11 ? 10 : this.anInt591, this.anInt591 == 11 ? this.anInt604 + 4 : this.anInt604, var9, var10, (int) var7.aFloat2716, var9.method6416((int) var7.aFloat2716, (int) var7.aFloat2711, 700060381), (int) var7.aFloat2711, arg3, this.aClass481_592, (byte) -65);
				if (var12 == null) {
					this.aBooleanArray589 = null;
					this.aClass_na601 = null;
					this.aClass387_594 = null;
					this.anInt598 = 0;
				} else {
					this.aClass387_594 = var11 = (Class387) var12.anObject5824;
					if (arg3) {
						this.aClass_na601 = (Class_na) var12.anObject5823;
						this.aBooleanArray589 = null;
						var8.method4185(this.aClass_na601, this.aByte588, (int) var7.aFloat2716, (int) var7.aFloat2711, null, (byte) -6);
						this.aBoolean602 = true;
					}
					this.anInt598 = var11.YA();
					var11.n();
				}
			}
			this.anInt586 = var6.anInt5657;
			return var11;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "cv.o(" + ')');
		}
	}

	public void method807(boolean arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = arg1;
			boolean var6 = false;
			if (arg1 == -1) {
				Class473 var7 = this.aClass463_599.method5705(this.anInt590, (byte) -60);
				Class473 var8 = var7;
				if (var7.anIntArray5678 != null) {
					var7 = var7.method5900(client.anInt8987 == 0 ? Class96.anInterface29_866 : Class158.aClass561_6474, (byte) 115);
				}
				if (var7 == null) {
					return;
				}
				if (var7 == var8) {
					var8 = null;
				}
				if (var7.method5904((byte) -99)) {
					if (arg0 && this.aClass477_595.method5966(-1718429659) && var7.method5906(this.aClass477_595.method5967((byte) -58), -754593398)) {
						return;
					}
					if (var7.anInt5657 != this.anInt586) {
						var6 = var7.aBoolean5648;
					}
					var5 = var7.method5903(-1132870413);
					if (var7.method5909((byte) 39)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				} else if (var8 != null && var8.method5904((byte) -88)) {
					if (arg0 && this.aClass477_595.method5966(1185661519) && var8.method5906(this.aClass477_595.method5967((byte) -79), -754593398)) {
						return;
					}
					if (var7.anInt5657 != this.anInt586) {
						var6 = var8.aBoolean5648;
					}
					var5 = var8.method5903(-1132870413);
					if (var8.method5909((byte) -2)) {
						arg2 = 0;
					} else {
						arg2 = 1;
					}
				}
			}
			if (var5 == -1) {
				this.aClass477_595.method5987(-1, false, 789226672);
			} else {
				this.aClass477_595.method5970(var5, 0, arg2, var6, -2046551360);
				this.anInt596 = client.anInt8981;
				this.aBoolean602 = false;
				this.aClass387_594 = null;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "cv.l(" + ')');
		}
	}

	public boolean method808(int arg0) {
		try {
			return this.aBoolean600;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.f(" + ')');
		}
	}

	public void method809(Class_ra arg0, Class387 arg1, Class247 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		try {
			Class93[] var10 = arg1.method4464();
			Class64[] var11 = arg1.method4445();
			if ((this.aClass388_603 == null || this.aClass388_603.aBoolean3992) && (var10 != null || var11 != null)) {
				Class473 var12 = this.aClass463_599.method5705(this.anInt590, (byte) 3);
				if (var12.anIntArray5678 != null) {
					var12 = var12.method5900(client.anInt8987 == 0 ? Class96.anInterface29_866 : Class158.aClass561_6474, (byte) -14);
				}
				if (var12 != null) {
					this.aClass388_603 = Class388.method4571(client.anInt8981, true);
				}
			}
			if (this.aClass388_603 != null) {
				arg1.method4463(arg2);
				if (arg7) {
					this.aClass388_603.method4568(arg0, (long) client.anInt8981, var10, var11, false);
				} else {
					this.aClass388_603.method4565((long) client.anInt8981);
				}
				this.aClass388_603.method4573(this.aByte587, arg3, arg4, arg5, arg6);
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "cv.s(" + ')');
		}
	}

	public void method810(Class_ra arg0, int arg1) {
		try {
			if (this.aClass_na601 != null) {
				Class260 var3 = this.aClass432_Sub1_605.method5346().aClass260_2606;
				client.aClass304_9030.method3023(-400722441).method4167(this.aClass_na601, this.aByte588, (int) var3.aFloat2716, (int) var3.aFloat2711, this.aBooleanArray589, (byte) 19);
				this.aBooleanArray589 = null;
				this.aClass_na601 = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cv.w(" + ')');
		}
	}

	public void method811(Class432_Sub1 arg0, int arg1) {
		try {
			if (!this.aClass477_595.method5966(-26358226)) {
				this.method807(false, -1, 0, -2068590899);
			} else if (this.aClass477_595.method5981(client.anInt8981 - this.anInt596, 1836638831)) {
				if (Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(408206836) == 2) {
					this.aBoolean602 = false;
				}
				if (this.aClass477_595.method5978((byte) -69)) {
					this.aClass477_595.method5988(-1, (byte) 7);
					this.aBoolean597 = false;
					this.method807(false, -1, 0, -1540076211);
				}
			}
			this.anInt596 = client.anInt8981;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cv.n(" + ')');
		}
	}

	public void method812(Class_ra arg0, int arg1) {
		try {
			this.method806(arg0, 262144, true, true, -1378875437);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cv.z(" + ')');
		}
	}

	public static Class134[] method813(int arg0) {
		try {
			return new Class134[] { Class134.aClass134_1513, Class134.aClass134_1515, Class134.aClass134_1512, Class134.aClass134_1517, Class134.aClass134_1514 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cv.r(" + ')');
		}
	}

	public static String method814(String arg0, int arg1) {
		try {
			if (Class550.OSName.startsWith("win")) {
				return arg0 + ".dll";
			} else if (Class550.OSName.startsWith("linux")) {
				return "lib" + arg0 + ".so";
			} else if (Class550.OSName.startsWith("mac")) {
				return "lib" + arg0 + ".dylib";
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.r(" + ')');
		}
	}

	public static final void method815(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -2039756334);
			if (var4.method6321((byte) -4)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aClass304_9030.method3025((byte) 13).method5705(var2, (byte) -28).method5902(var3, var4.aString6236, -470612980);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass304_9030.method3025((byte) 13).method5705(var2, (byte) -55).method5901(var3, var4.anInt6235, -1587675004);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cv.abo(" + ')');
		}
	}

	public static final void method816(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -8) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.alp(" + ')');
		}
	}

	public static int method817(int arg0, int arg1, byte arg2) {
		try {
			if (Class396.aClass417_4108.anInt4282 == -1) {
				return 1;
			}
			if (arg0 != Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(172214214)) {
				Class306.method3055(arg0, Class526.aClass526_6132.method6257(Class429.aClass454_4369, 991479434), true, (short) 27778);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-766574404) != arg0) {
					return -1;
				}
			}
			int var3;
			try {
				Dimension var4 = Class475.aCanvas5700.getSize();
				Class95_Sub22.method1175(Class526.aClass526_6132.method6257(Class429.aClass454_4369, 991479434), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -485441382);
				Model var5 = Model.loadModel(Class95_Sub12.aClass280_7177, Class396.aClass417_4108.anInt4282, 0);
				long var6 = Class312.method3111((byte) 82);
				Class361.aClass_ra3793.L();
				client.aClass247_8975.method2476(0.0F, 256.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				Class249 var8 = Class361.aClass_ra3793.cz();
				var8.method2493((float) (var4.width / 2), (float) (var4.height / 2), 512.0F, 512.0F, (float) client.aClass304_9030.method2992(1403532609), (float) client.aClass304_9030.method2993(-678427375), (float) var4.width, (float) var4.height);
				Class361.aClass_ra3793.ci(var8);
				Class361.aClass_ra3793.IA(1.0F);
				Class361.aClass_ra3793.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				Class387 var9 = Class361.aClass_ra3793.cb(var5, 2048, 64, 64, 768);
				int var10 = 0;
				label56: for (int var11 = 0; var11 < 500; var11++) {
					Class361.aClass_ra3793.ba(3, 0);
					for (int var12 = 15; var12 >= 0; var12--) {
						for (int var13 = 0; var13 <= var12; var13++) {
							client.aClass247_8976.method2476((float) (((float) var13 - (float) var12 / 2.0F) * 512.0F), 0.0F, (float) ((var12 + 1) * 512));
							var9.method4475(client.aClass247_8976, null, 0);
							var10++;
							if (Class312.method3111((byte) 31) - var6 >= (long) arg1) {
								if (arg2 == 0) {
									throw new IllegalStateException();
								}
								break label56;
							}
						}
					}
				}
				Class361.aClass_ra3793.l();
				long var16 = (long) (var10 * 1000) / (Class312.method3111((byte) 11) - var6);
				Class361.aClass_ra3793.ba(3, 0);
				var3 = (int) var16;
			} catch (Throwable var14) {
				var14.printStackTrace();
				return -1;
			}
			return var3;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "cv.gb(" + ')');
		}
	}

	public static void method818(int arg0) {
		try {
			for (Class330_Sub36_Sub10 var1 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var1 != null; var1 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -115)) {
				if (Class228.method2313(var1.anInt9699, (byte) 31)) {
					Class78.method931(var1, 2084800754);
				}
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cv.t(" + ')');
		}
	}

	public static final void method819(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].anInt2948;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.yk(" + ')');
		}
	}

	public static Class213[] method820(byte arg0) {
		try {
			return new Class213[] { Class213.aClass213_2063, Class213.aClass213_2064, Class213.aClass213_2074, Class213.aClass213_2066, Class213.aClass213_2067, Class213.aClass213_2065, Class213.aClass213_2069, Class213.aClass213_2070, Class213.aClass213_2071, Class213.aClass213_2072, Class213.aClass213_2073, Class213.aClass213_2068, Class213.aClass213_2075, Class213.aClass213_2076, Class213.aClass213_2077 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cv.r(" + ')');
		}
	}

	public static Class366 method821(int arg0, int arg1, int arg2, int arg3, Class476 arg4, int arg5, int arg6) {
		try {
			Class363.aClass366_Sub3_3801.anInt3854 = arg0;
			Class363.aClass366_Sub3_3801.anInt3853 = arg1;
			Class363.aClass366_Sub3_3801.anInt3852 = arg2;
			Class363.aClass366_Sub3_3801.anInt3855 = arg3;
			Class363.aClass366_Sub3_3801.aClass476_8005 = arg4;
			Class363.aClass366_Sub3_3801.anInt8006 = arg5;
			return Class363.aClass366_Sub3_3801;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "cv.o(" + ')');
		}
	}

	public static void method822(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(4, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cv.z(" + ')');
		}
	}
}
