package deob;

public abstract class Class432_Sub1_Sub1_Sub1 extends Class432_Sub1_Sub1 implements Interface6 {

	public int anInt10009;

	public int anInt10007;

	public boolean aBoolean10012;

	public int anInt10013;

	public int anInt10014;

	public int anInt10052;

	public int anInt10037;

	public byte aByte10021;

	public int[] anIntArray10022;

	public int[] anIntArray10047;

	public int[] anIntArray10024;

	public int[] anIntArray10061;

	public int[] anIntArray10026;

	public Class467 aClass467_10027;

	public int anInt10028;

	public int[] anIntArray10030;

	public Class477_Sub3 aClass477_Sub3_10039;

	public Class477 aClass477_10032;

	public int anInt10041;

	public int anInt10042;

	public byte aByte10025;

	public int anInt10069;

	public int anInt10050;

	public int anInt10051;

	public Class238 aClass238_10053;

	public Class238 aClass238_10054;

	public Class238 aClass238_10055;

	public int anInt10056;

	public int anInt10060;

	public int anInt10006;

	public int anInt10062;

	public boolean aBoolean10064;

	public boolean aBoolean10011;

	public int anInt10068;

	public int anInt10016;

	public int[] anIntArray10018;

	public int[] anIntArray10059;

	public byte[] aByteArray10017;

	public Class387[] aClass387Array10066;

	public Gfx[] graphics;

	public Class477_Sub2_Sub1[] aClass477_Sub2_Sub1Array10019;

	public static int anInt10031 = 20;

	public static int anInt10065 = 1;

	public byte aByte10043;

	public byte aByte10044;

	public byte aByte10063;

	public int anInt10008;

	public int anInt10010;

	public int anInt10015;

	public int anInt10023;

	public int anInt10034;

	public int anInt10035;

	public int anInt10036;

	public int anInt10038;

	public int anInt10040;

	public int anInt10045;

	public int anInt10046;

	public int anInt10057;

	public int anInt10058;

	public Class120 aClass120_10067;

	public Class388 aClass388_10048;

	public Class60 aClass60_10020;

	public int[] anIntArray10029;

	public int[] anIntArray10049;

	public Class432_Sub1_Sub1_Sub1(Class356 arg0, int arg1) {
		super(arg0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		this.anInt10009 = 1;
		this.anInt10007 = -32768;
		this.aBoolean10012 = true;
		this.anInt10013 = 0;
		this.anInt10014 = -1;
		this.anInt10052 = 0;
		this.anInt10037 = 0;
		this.aByte10021 = 0;
		this.anIntArray10022 = new int[Class396.aClass417_4108.anInt4273];
		this.anIntArray10047 = new int[Class396.aClass417_4108.anInt4273];
		this.anIntArray10024 = new int[Class396.aClass417_4108.anInt4273];
		this.anIntArray10061 = new int[Class396.aClass417_4108.anInt4273];
		this.anIntArray10026 = new int[Class396.aClass417_4108.anInt4273];
		this.aClass467_10027 = new Class467();
		this.anInt10028 = -1;
		this.anIntArray10030 = null;
		this.aClass477_Sub3_10039 = new Class477_Sub3(this, false);
		this.aClass477_10032 = new Class477_Sub2(this, false);
		this.anInt10041 = -1;
		this.anInt10042 = -1;
		this.aByte10025 = 0;
		this.anInt10069 = 0;
		this.anInt10050 = 0;
		this.anInt10051 = 256;
		this.aClass238_10053 = new Class238();
		this.aClass238_10054 = new Class238();
		this.aClass238_10055 = new Class238();
		this.anInt10056 = 0;
		this.anInt10060 = 0;
		this.anInt10006 = 0;
		this.anInt10062 = 0;
		this.aBoolean10064 = false;
		this.aBoolean10011 = false;
		this.anInt10068 = -1;
		this.anInt10016 = -1;
		this.anIntArray10018 = new int[arg1];
		this.anIntArray10059 = new int[arg1];
		this.aByteArray10017 = new byte[arg1];
		this.aClass387Array10066 = new Class387[5];
		this.graphics = new Gfx[4];
		for (int var3 = 0; var3 < 4; var3++) {
			this.graphics[var3] = new Gfx(this);
		}
		this.aClass477_Sub2_Sub1Array10019 = new Class477_Sub2_Sub1[Console.aClass421_4266.disabledEquipmentSlots.length];
	}

	public void method5409(Class_ra arg0, Class387[] arg1, Class247 arg2, boolean arg3, int arg4) {
		try {
			if (!arg3) {
				int var6 = 0;
				int var7 = 0;
				int var8 = 0;
				int var9 = 0;
				int var10 = -1;
				int var11 = -1;
				Class93[][] var12 = new Class93[arg1.length][];
				Class64[][] var13 = new Class64[arg1.length][];
				for (int var14 = 0; var14 < arg1.length; var14++) {
					if (arg1[var14] != null) {
						arg1[var14].method4463(arg2);
						var12[var14] = arg1[var14].method4464();
						var13[var14] = arg1[var14].method4445();
						if (var12[var14] != null) {
							var10 = var14;
							var7++;
							var6 += var12[var14].length;
						}
						if (var13[var14] != null) {
							var11 = var14;
							var9++;
							var8 += var13[var14].length;
						}
					}
				}
				if ((this.aClass388_10048 == null || this.aClass388_10048.aBoolean3992) && (var7 > 0 || var9 > 0)) {
					this.aClass388_10048 = Class388.method4571(client.anInt8981, true);
				}
				if (this.aClass388_10048 != null) {
					Object var21 = null;
					Class93[] var15;
					if (var7 == 1) {
						var15 = var12[var10];
					} else {
						var15 = new Class93[var6];
						int var16 = 0;
						for (int var17 = 0; var17 < arg1.length; var17++) {
							if (var12[var17] != null) {
								System.arraycopy(var12[var17], 0, var15, var16, var12[var17].length);
								var16 += var12[var17].length;
							}
						}
					}
					Object var22 = null;
					Class64[] var23;
					if (var9 == 1) {
						var23 = var13[var11];
					} else {
						var23 = new Class64[var8];
						int var18 = 0;
						for (int var19 = 0; var19 < arg1.length; var19++) {
							if (var13[var19] != null) {
								System.arraycopy(var13[var19], 0, var23, var18, var13[var19].length);
								var18 += var13[var19].length;
							}
						}
					}
					this.aClass388_10048.method4568(arg0, (long) client.anInt8981, var15, var23, false);
					this.aBoolean10064 = true;
				}
			} else if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4565((long) client.anInt8981);
			}
			if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4573(this.aByte8658, this.aShort9922, this.aShort9920, this.aShort9921, this.aShort9923);
			}
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "aab.c(" + ')');
		}
	}

	public boolean method5382(int arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.ao(" + ')');
		}
	}

	public boolean method5395(int arg0) {
		try {
			return this.aBoolean10011;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.bg(" + ')');
		}
	}

	public void method5410(int arg0, byte arg1) {
		try {
			Class364 var3 = this.method5436(-1347452953);
			if (var3.anInt3841 != 0 || this.anInt10051 != 0) {
				this.aClass238_10053.method2371(-1408508694);
				int var4 = arg0 - this.aClass238_10053.anInt2581 & 0x3FFF;
				if (var4 > 8192) {
					this.anInt10015 = this.aClass238_10053.anInt2581 - (16384 - var4);
				} else {
					this.anInt10015 = this.aClass238_10053.anInt2581 + var4;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aab.q(" + ')');
		}
	}

	public void method5411(int arg0, boolean arg1, int arg2) {
		try {
			Class364 var4 = this.method5436(345708333);
			if (arg1 || var4.anInt3841 != 0 || this.anInt10051 != 0) {
				this.anInt10015 = arg0 & 0x3FFF;
				this.aClass238_10053.method2369(this.anInt10015, -1621322213);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aab.u(" + ')');
		}
	}

	public int method5412(int arg0) {
		try {
			Class364 var2 = this.method5436(1742314241);
			int var3 = this.aClass238_10053.anInt2581;
			boolean var4;
			if (var2.anInt3841 == 0) {
				var4 = this.aClass238_10053.method2372(this.anInt10015, this.anInt10051, this.anInt10051, -311035554);
			} else {
				var4 = this.aClass238_10053.method2372(this.anInt10015, var2.anInt3841, var2.anInt3842, -2002828831);
			}
			int var5 = this.aClass238_10053.anInt2581 - var3;
			if (var5 == 0) {
				this.anInt10050 = 0;
				this.aClass238_10053.method2369(this.anInt10015, -756949144);
			} else {
				this.anInt10050++;
			}
			if (var4) {
				if (var2.anInt3843 != 0) {
					if (var5 > 0) {
						this.aClass238_10054.method2372(var2.anInt3816, var2.anInt3843, var2.anInt3838, -1093599923);
					} else {
						this.aClass238_10054.method2372(-var2.anInt3816, var2.anInt3843, var2.anInt3838, -287960438);
					}
				}
				if (var2.anInt3839 != 0) {
					this.aClass238_10055.method2372(var2.anInt3848, var2.anInt3839, var2.anInt3847, -2113259361);
				}
			} else {
				if (var2.anInt3843 == 0) {
					this.aClass238_10054.method2369(0, -1175658972);
				} else {
					this.aClass238_10054.method2372(0, var2.anInt3843, var2.anInt3838, 1829400304);
				}
				if (var2.anInt3839 == 0) {
					this.aClass238_10055.method2369(0, -1146187852);
				} else {
					this.aClass238_10055.method2372(0, var2.anInt3839, var2.anInt3847, 641214297);
				}
			}
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aab.x(" + ')');
		}
	}

	public void method5413(int[] arg0, int[] arg1, byte arg2) {
		try {
			if (this.anIntArray10029 == null && arg0 != null) {
				this.anIntArray10029 = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
			} else if (arg0 == null) {
				this.anIntArray10029 = null;
				return;
			}
			int var4;
			for (var4 = 0; var4 < this.anIntArray10029.length; var4++) {
				this.anIntArray10029[var4] = -1;
			}
			for (var4 = 0; var4 < arg0.length; var4++) {
				int var5 = arg1[var4];
				int var6 = 0;
				while (var6 < this.anIntArray10029.length) {
					if ((var5 & 0x1) != 0) {
						this.anIntArray10029[var6] = arg0[var4];
					}
					var6++;
					var5 >>= 0x1;
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aab.g(" + ')');
		}
	}

	public int method5414() {
		Class364 var1 = this.method5436(417051079);
		int var2;
		if (-701222927 * var1.anInt3850 * 348578065 != -1) {
			var2 = var1.anInt3850 * 348578065 * -701222927;
		} else if (this.anInt10007 * 947831309 * -2053612347 == -32768) {
			var2 = 200;
		} else {
			var2 = -(this.anInt10007 * 947831309 * -2053612347);
		}
		Class241 var3 = this.method5346();
		int var4 = (int) var3.aClass260_2606.aFloat2716 >> 9;
		int var5 = (int) var3.aClass260_2606.aFloat2711 >> 9;
		if (this.aClass356_8655 != null && var4 >= 1 && var5 >= 1 && var4 <= client.aClass304_9030.method2990(-713811601) - 1 && var5 <= client.aClass304_9030.method3033((byte) -70) - 1) {
			Class340 var6 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][var4][var5];
			if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null) {
				return var6.aClass432_Sub1_Sub4_3386.aShort9927 + var2;
			}
		}
		return var2;
	}

	public final void sendGraphics(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
		try {
			Gfx var8 = this.graphics[arg5];
			int var9 = var8.id;
			if (arg0 != -1 && var9 != -1) {
				Class437 var10;
				if (arg0 == var9) {
					var10 = Class136.aClass416_1527.method5254(arg0, -1733627848);
					if (var10.aBoolean4443 && var10.anInt4431 != -1) {
						Class440 var11 = Class201.aClass436_6511.method5570(var10.anInt4431, 1850891820);
						int var12 = var11.anInt4472;
						if (var12 == 0) {
							return;
						}
						if (var12 == 2) {
							var8.aClass477_573.method5980((byte) 51);
							return;
						}
					}
				} else {
					var10 = Class136.aClass416_1527.method5254(arg0, 15599428);
					Class437 var16 = Class136.aClass416_1527.method5254(var9, 358750657);
					if (var10.anInt4431 != -1 && var16.anInt4431 != -1) {
						Class440 var17 = Class201.aClass436_6511.method5570(var10.anInt4431, -1953165768);
						Class440 var13 = Class201.aClass436_6511.method5570(var16.anInt4431, 707470478);
						if (var17.anInt4470 < var13.anInt4470) {
							return;
						}
					}
				}
			}
			byte var15 = 0;
			if (arg0 != -1 && !Class136.aClass416_1527.method5254(arg0, 50173823).aBoolean4443) {
				var15 = 2;
			}
			if (arg0 != -1 && arg4) {
				var15 = 1;
			}
			var8.id = arg0;
			var8.anInt572 = arg3;
			var8.height = arg1 >> 16;
			var8.anInt575 = arg2;
			var8.aClass477_573.method5970(arg0 == -1 ? -1 : Class136.aClass416_1527.method5254(arg0, 1992434143).anInt4431, arg1 & 0xFFFF, var15, false, -2104192346);
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "aab.a(" + ')');
		}
	}

	public final void method5416(int arg0) {
		try {
			this.anInt10056 = 0;
			this.anInt10006 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.e(" + ')');
		}
	}

	public Class432_Sub1_Sub1_Sub1(Class356 arg0) {
		this(arg0, 10);
	}

	public final void method5417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			Class343 var8 = OutgoingPacket.aClass341_2578.method3972(arg0, (byte) 104);
			Class325_Sub4 var9 = null;
			Class325_Sub4 var10 = null;
			int var11 = var8.anInt3410;
			int var12 = 0;
			Class325_Sub4 var13;
			for (var13 = (Class325_Sub4) this.aClass467_10027.method5854(-247950509); var13 != null; var13 = (Class325_Sub4) this.aClass467_10027.method5857(-2136399523)) {
				var12++;
				if (var8 == var13.aClass343_7485) {
					var13.method3224(arg1 + arg3, arg4, arg5, arg2, 390449265);
					return;
				}
				if (var13.aClass343_7485.anInt3402 <= var8.anInt3402) {
					var9 = var13;
				}
				if (var13.aClass343_7485.anInt3410 > var11) {
					var10 = var13;
					var11 = var13.aClass343_7485.anInt3410;
				}
			}
			if (var10 != null || var12 < Class396.aClass417_4108.anInt4278) {
				var13 = new Class325_Sub4(var8);
				if (var9 == null) {
					this.aClass467_10027.method5856(var13, 682232543);
				} else {
					Class6.method406(var13, var9, (byte) 0);
				}
				var13.method3224(arg3 + arg1, arg4, arg5, arg2, -960188539);
				if (var12 >= Class396.aClass417_4108.anInt4278) {
					var10.method3204(1239277349);
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "aab.bs(" + ')');
		}
	}

	public final void method5418(int arg0, int arg1) {
		try {
			Class343 var3 = OutgoingPacket.aClass341_2578.method3972(arg0, (byte) 3);
			for (Class325_Sub4 var4 = (Class325_Sub4) this.aClass467_10027.method5854(-1332963436); var4 != null; var4 = (Class325_Sub4) this.aClass467_10027.method5857(-1991669461)) {
				if (var4.aClass343_7485 == var3) {
					var4.method3204(986915706);
					break;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aab.bk(" + ')');
		}
	}

	public void method5419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (this.method5429(414417032)) {
				Class556.method6408(this.aClass120_10067.method1442((byte) 73), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg0, false, 1628989560);
			} else if (arg0 == -1) {
				for (int var9 = 0; var9 < 113; var9++) {
					client.aBooleanArray9230[var9] = true;
				}
			} else {
				client.aBooleanArray9230[arg0] = true;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aab.da(" + ')');
		}
	}

	public void method5420(int arg0, short arg1) {
		try {
			this.anInt10009 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aab.bn(" + ')');
		}
	}

	public void method5406(int arg0) {
		try {
			int var2 = (this.anInt10009 - 1 << 8) + 240;
			Class260 var3 = this.method5346().aClass260_2606;
			this.aShort9922 = (short) ((int) var3.aFloat2716 - var2 >> 9);
			this.aShort9921 = (short) ((int) var3.aFloat2711 - var2 >> 9);
			this.aShort9920 = (short) (var2 + (int) var3.aFloat2716 >> 9);
			this.aShort9923 = (short) ((int) var3.aFloat2711 + var2 >> 9);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aab.ca(" + ')');
		}
	}

	public void method5421(Class387 arg0, int arg1) {
		try {
			int var3 = this.aClass238_10054.anInt2581;
			int var4 = this.aClass238_10055.anInt2581;
			if (var3 != 0 || var4 != 0) {
				int var5 = arg0.YA() / 2;
				arg0.ia(0, -var5, 0);
				arg0.EA(var3 & 0x3FFF);
				arg0.t(var4 & 0x3FFF);
				arg0.ia(0, var5, 0);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aab.ct(" + ')');
		}
	}

	public int method5363(int arg0) {
		try {
			Class364 var2 = this.method5436(1491582545);
			int var3;
			if (var2.anInt3850 != -1) {
				var3 = var2.anInt3850;
			} else if (this.anInt10007 == -32768) {
				var3 = 200;
			} else {
				var3 = -this.anInt10007;
			}
			Class241 var4 = this.method5346();
			int var5 = (int) var4.aClass260_2606.aFloat2716 >> 9;
			int var6 = (int) var4.aClass260_2606.aFloat2711 >> 9;
			if (this.aClass356_8655 != null && var5 >= 1 && var6 >= 1 && var5 <= client.aClass304_9030.method2990(-595056193) - 1 && var6 <= client.aClass304_9030.method3033((byte) -91) - 1) {
				Class340 var7 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][var5][var6];
				if (var7 != null && var7.aClass432_Sub1_Sub4_3386 != null) {
					return var7.aClass432_Sub1_Sub4_3386.aShort9927 + var3;
				}
			}
			return var3;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "aab.bc(" + ')');
		}
	}

	public final void method5423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			boolean var8 = true;
			boolean var9 = true;
			int var10;
			for (var10 = 0; var10 < Class396.aClass417_4108.anInt4273; var10++) {
				if (this.anIntArray10024[var10] > arg4) {
					var8 = false;
				} else {
					var9 = false;
				}
			}
			var10 = -1;
			int var11 = -1;
			int var12 = 0;
			if (arg0 >= 0) {
				Class375 var13 = Class142.aClass368_1568.method4305(arg0, -2064329575);
				var11 = var13.anInt3931;
				var12 = var13.anInt3922;
			}
			int var16;
			if (var9) {
				if (var11 == -1) {
					return;
				}
				var10 = 0;
				var16 = 0;
				if (var11 == 0) {
					var16 = this.anIntArray10024[0];
				} else if (var11 == 1) {
					var16 = this.anIntArray10047[0];
				}
				for (int var14 = 1; var14 < Class396.aClass417_4108.anInt4273; var14++) {
					if (var11 == 0) {
						if (this.anIntArray10024[var14] < var16) {
							var10 = var14;
							var16 = this.anIntArray10024[var14];
						}
					} else if (var11 == 1 && this.anIntArray10047[var14] < var16) {
						var10 = var14;
						var16 = this.anIntArray10047[var14];
					}
				}
				if (var11 == 1 && var16 >= arg1) {
					return;
				}
			} else {
				if (var8) {
					this.aByte10021 = 0;
				}
				for (var16 = 0; var16 < Class396.aClass417_4108.anInt4273; var16++) {
					byte var17 = this.aByte10021;
					this.aByte10021 = (byte) ((this.aByte10021 + 1) % Class396.aClass417_4108.anInt4273);
					if (this.anIntArray10024[var17] <= arg4) {
						var10 = var17;
						break;
					}
				}
			}
			if (var10 >= 0) {
				this.anIntArray10022[var10] = arg0;
				this.anIntArray10047[var10] = arg1;
				this.anIntArray10061[var10] = arg2;
				this.anIntArray10026[var10] = arg3;
				this.anIntArray10024[var10] = arg5 + var12 + arg4;
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "aab.m(" + ')');
		}
	}

	public void method5425(int arg0) {
		try {
			if (this.aClass60_10020 != null && this.aClass60_10020.aString556 != null) {
				this.aClass60_10020.anInt558--;
				if (this.aClass60_10020.anInt558 == 0) {
					this.aClass60_10020.aString556 = null;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.cg(" + ')');
		}
	}

	public void method5426() {
		int var1 = (this.anInt10009 * -32272369 * 1589206767 - 1 << 8) + 240;
		Class260 var2 = this.method5346().aClass260_2606;
		this.aShort9922 = (short) ((int) var2.aFloat2716 - var1 >> 9);
		this.aShort9921 = (short) ((int) var2.aFloat2711 - var1 >> 9);
		this.aShort9920 = (short) (var1 + (int) var2.aFloat2716 >> 9);
		this.aShort9923 = (short) ((int) var2.aFloat2711 + var1 >> 9);
	}

	public void method5427(String arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			if (this.aClass60_10020 == null) {
				this.aClass60_10020 = new Class60();
			}
			this.aClass60_10020.aString556 = arg0;
			this.aClass60_10020.anInt555 = arg1;
			this.aClass60_10020.anInt554 = arg2;
			this.aClass60_10020.anInt558 = this.aClass60_10020.anInt557 = arg3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aab.db(" + ')');
		}
	}

	public boolean method5429(int arg0) {
		try {
			return this.anInt10016 == -1 ? false : this.method5430(this.anInt10016, (byte) -94);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.dg(" + ')');
		}
	}

	public boolean method5430(int arg0, byte arg1) {
		try {
			if (this.anInt10068 == arg0) {
				return true;
			}
			this.aClass120_10067 = Class139.method1613(arg0, null, null, true, 158913463);
			if (this.aClass120_10067 == null) {
				return false;
			} else {
				this.anInt10068 = arg0;
				Class94.method1091(this.aClass120_10067.aClass114Array1400, (byte) -18);
				return true;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aab.dz(" + ')');
		}
	}

	public void method5431(byte arg0) {
		try {
			if (this.anInt10068 != -1) {
				Class152.method1790(this.anInt10068, -577035539);
				this.aClass120_10067 = null;
				this.anInt10068 = -1;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.dr(" + ')');
		}
	}

	public void method5432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			if (this.method5429(-1715224994)) {
				client.method3917(this.aClass120_10067, this.aClass120_10067.method1442((byte) -24), -1, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aab.do(" + ')');
		}
	}

	public void method5433(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			if (this.method5429(-745247645)) {
				ItemEquipDefinitions.method6214(this.aClass120_10067.aClass114Array1400, -1, arg0, arg1, arg2, (byte) 24);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aab.dh(" + ')');
		}
	}

	public boolean method5374() {
		return false;
	}

	public boolean method5376() {
		return false;
	}

	public boolean method5377() {
		return this.aBoolean10011;
	}

	public boolean method5378() {
		return this.aBoolean10011;
	}

	public Class364 method5436(int arg0) {
		try {
			int var2 = this.method5424((byte) -70);
			return var2 == -1 ? Class362.aClass364_3794 : Class102.aClass362_924.method4254(var2, 1312631242);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.co(" + ')');
		}
	}

	public int method5394() {
		return this.anInt10007 * 947831309 * -2053612347 == -32768 ? 0 : this.anInt10007 * -2053612347 * 947831309;
	}

	public int method5381() {
		return this.anInt10007 * 947831309 * -2053612347 == -32768 ? 0 : this.anInt10007 * -2053612347 * 947831309;
	}

	public int method5366() {
		return this.anInt10007 * 947831309 * -2053612347 == -32768 ? 0 : this.anInt10007 * -2053612347 * 947831309;
	}

	public void method5438(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
		try {
			Class260 var7 = this.method5346().aClass260_2606;
			int var8 = this.aShort9920 + this.aShort9922 >> 1;
			int var9 = this.aShort9923 + this.aShort9921 >> 1;
			int var10 = Class257.anIntArray2683[arg0];
			int var11 = Class257.anIntArray2684[arg0];
			int var12 = -arg1 / 2;
			int var13 = -arg2 / 2;
			int var14 = var10 * var13 + var12 * var11 >> 14;
			int var15 = var13 * var11 - var12 * var10 >> 14;
			int var16 = Class166_Sub1.method1999((int) var7.aFloat2716 + var14, var15 + (int) var7.aFloat2711, var8, var9, this.aByte8658, (byte) 73);
			int var17 = arg1 / 2;
			int var18 = -arg2 / 2;
			int var19 = var11 * var17 + var18 * var10 >> 14;
			int var20 = var11 * var18 - var10 * var17 >> 14;
			int var21 = Class166_Sub1.method1999(var19 + (int) var7.aFloat2716, (int) var7.aFloat2711 + var20, var8, var9, this.aByte8658, (byte) 49);
			int var22 = -arg1 / 2;
			int var23 = arg2 / 2;
			int var24 = var22 * var11 + var23 * var10 >> 14;
			int var25 = var23 * var11 - var10 * var22 >> 14;
			int var26 = Class166_Sub1.method1999((int) var7.aFloat2716 + var24, (int) var7.aFloat2711 + var25, var8, var9, this.aByte8658, (byte) 123);
			int var27 = arg1 / 2;
			int var28 = arg2 / 2;
			int var29 = var10 * var28 + var11 * var27 >> 14;
			int var30 = var28 * var11 - var10 * var27 >> 14;
			int var31 = Class166_Sub1.method1999((int) var7.aFloat2716 + var29, (int) var7.aFloat2711 + var30, var8, var9, this.aByte8658, (byte) 79);
			int var32 = var16 < var21 ? var16 : var21;
			int var33 = var26 < var31 ? var26 : var31;
			int var34 = var21 < var31 ? var21 : var31;
			int var35 = var16 < var26 ? var16 : var26;
			this.anInt10023 = (int) (Math.atan2((double) (var32 - var33), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			this.anInt10035 = (int) (Math.atan2((double) (var35 - var34), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			int var36;
			if (this.anInt10023 != 0 && arg3 != 0) {
				var36 = 16384 - arg3;
				if (this.anInt10023 > 8192) {
					if (this.anInt10023 < var36) {
						this.anInt10023 = var36;
					}
				} else if (this.anInt10023 > arg3) {
					this.anInt10023 = arg3;
				}
			}
			if (this.anInt10035 != 0 && arg4 != 0) {
				var36 = 16384 - arg4;
				if (this.anInt10035 > 8192) {
					if (this.anInt10035 < var36) {
						this.anInt10035 = var36;
					}
				} else if (this.anInt10035 > arg4) {
					this.anInt10035 = arg4;
				}
			}
			this.anInt10046 = var16 + var31;
			if (var21 + var26 < this.anInt10046) {
				this.anInt10046 = var26 + var21;
			}
			this.anInt10046 = (this.anInt10046 >> 1) - (int) var7.aFloat2715;
		} catch (RuntimeException var37) {
			throw Class476.method5964(var37, "aab.cn(" + ')');
		}
	}

	public int method5440() {
		Class364 var1 = this.method5436(1581967567);
		int var2;
		if (-701222927 * var1.anInt3850 * 348578065 != -1) {
			var2 = var1.anInt3850 * 348578065 * -701222927;
		} else if (this.anInt10007 * 947831309 * -2053612347 == -32768) {
			var2 = 200;
		} else {
			var2 = -(this.anInt10007 * 947831309 * -2053612347);
		}
		Class241 var3 = this.method5346();
		int var4 = (int) var3.aClass260_2606.aFloat2716 >> 9;
		int var5 = (int) var3.aClass260_2606.aFloat2711 >> 9;
		if (this.aClass356_8655 != null && var4 >= 1 && var5 >= 1 && var4 <= client.aClass304_9030.method2990(-1148204811) - 1 && var5 <= client.aClass304_9030.method3033((byte) -127) - 1) {
			Class340 var6 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][var4][var5];
			if (var6 != null && var6.aClass432_Sub1_Sub4_3386 != null) {
				return var6.aClass432_Sub1_Sub4_3386.aShort9927 + var2;
			}
		}
		return var2;
	}

	public void method5443() {
		int var1 = (this.anInt10009 * -32272369 * 1589206767 - 1 << 8) + 240;
		Class260 var2 = this.method5346().aClass260_2606;
		this.aShort9922 = (short) ((int) var2.aFloat2716 - var1 >> 9);
		this.aShort9921 = (short) ((int) var2.aFloat2711 - var1 >> 9);
		this.aShort9920 = (short) (var1 + (int) var2.aFloat2716 >> 9);
		this.aShort9923 = (short) ((int) var2.aFloat2711 + var1 >> 9);
	}

	public void method5445(int arg0, int arg1) {
		try {
			if (this.anInt10016 != this.anInt10068) {
				this.method5431((byte) -120);
			}
			this.anInt10016 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aab.ds(" + ')');
		}
	}

	public boolean method5379() {
		return this.aBoolean10011;
	}

	public int method5364() {
		return this.anInt10007 * 947831309 * -2053612347 == -32768 ? 0 : this.anInt10007 * -2053612347 * 947831309;
	}

	public void method5449(Class_ra arg0, Class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			for (int var8 = 0; var8 < this.graphics.length; var8++) {
				byte var9 = 0;
				if (var8 == 0) {
					var9 = 2;
				} else if (var8 == 1) {
					var9 = 5;
				} else if (var8 == 2) {
					var9 = 1;
				} else if (var8 == 3) {
					var9 = 7;
				}
				Gfx var10 = this.graphics[var8];
				if (var10.id == -1 || var10.aClass477_573.method5972(-776556553)) {
					this.aClass387Array10066[var8 + 1] = null;
				} else {
					Class437 var11 = Class136.aClass416_1527.method5254(var10.id, -501311522);
					boolean var12 = var11.aByte4444 == 3 && (arg3 != 0 || arg4 != 0);
					int var13 = arg2;
					if (var12) {
						var13 = arg2 | 0x7;
					} else {
						if (var10.anInt575 != 0) {
							var13 = arg2 | 0x5;
						}
						if (var10.height != 0) {
							var13 |= 0x2;
						}
						if (var10.anInt572 >= 0) {
							var13 |= 0x7;
						}
					}
					Class387 var14 = this.aClass387Array10066[var8 + 1] = var11.method5583(arg0, var13, var10.aClass477_573, var9, -1713910521);
					if (var14 != null) {
						if (var10.anInt572 >= 0 && arg1.anIntArrayArray3807 != null && arg1.anIntArrayArray3807[var10.anInt572] != null) {
							int var15 = 0;
							int var16 = 0;
							int var17 = 0;
							if (arg1.anIntArrayArray3807 != null && arg1.anIntArrayArray3807[var10.anInt572] != null) {
								var15 += arg1.anIntArrayArray3807[var10.anInt572][0];
								var16 += arg1.anIntArrayArray3807[var10.anInt572][1];
								var17 += arg1.anIntArrayArray3807[var10.anInt572][2];
							}
							if (arg1.anIntArrayArray3845 != null && arg1.anIntArrayArray3845[var10.anInt572] != null) {
								var15 += arg1.anIntArrayArray3845[var10.anInt572][0];
								var16 += arg1.anIntArrayArray3845[var10.anInt572][1];
								var17 += arg1.anIntArrayArray3845[var10.anInt572][2];
							}
							if (var17 != 0 || var15 != 0) {
								int var18 = arg5;
								if (this.anIntArray10049 != null && this.anIntArray10049[var10.anInt572] != -1) {
									var18 = this.anIntArray10049[var10.anInt572];
								}
								int var19 = var10.anInt575 * 2048 + var18 - arg5 & 0x3FFF;
								if (var19 != 0) {
									var14.f(var19);
								}
								int var20 = Class257.anIntArray2683[var19];
								int var21 = Class257.anIntArray2684[var19];
								int var22 = var15 * var21 + var20 * var17 >> 14;
								var17 = var17 * var21 - var20 * var15 >> 14;
								var15 = var22;
							}
							var14.ia(var15, var16, var17);
						} else if (var10.anInt575 != 0) {
							var14.f(var10.anInt575 * 2048);
						}
						if (var10.height != 0) {
							var14.ia(0, -var10.height << 2, 0);
						}
						if (var12) {
							if (this.anInt10023 != 0) {
								var14.t(this.anInt10023);
							}
							if (this.anInt10035 != 0) {
								var14.EA(this.anInt10035);
							}
							if (this.anInt10046 != 0) {
								var14.ia(0, this.anInt10046, 0);
							}
						}
					}
				}
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "aab.cd(" + ')');
		}
	}

	public boolean method5375() {
		return false;
	}

	public int method5370(int arg0) {
		try {
			return this.anInt10007 == -32768 ? 0 : this.anInt10007;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.bo(" + ')');
		}
	}

	public int method5453(int arg0) {
		try {
			return this.anInt10009;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.bu(" + ')');
		}
	}

	public boolean method5454(int arg0, int arg1, byte arg2) {
		try {
			if (this.anIntArray10049 == null) {
				if (arg1 == -1) {
					return true;
				}
				this.anIntArray10049 = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
				for (int var4 = 0; var4 < Console.aClass421_4266.disabledEquipmentSlots.length; var4++) {
					this.anIntArray10049[var4] = -1;
				}
			}
			Class364 var11 = this.method5436(1099929383);
			int var5 = 256;
			if (var11.anIntArray3835 != null && var11.anIntArray3835[arg0] > 0) {
				var5 = var11.anIntArray3835[arg0];
			}
			int var6;
			int var7;
			if (arg1 != -1) {
				if (this.anIntArray10049[arg0] == -1) {
					this.anIntArray10049[arg0] = this.aClass238_10053.method2370(1437066561);
				}
				var6 = this.anIntArray10049[arg0];
				var7 = arg1 - var6;
				if (var7 >= -var5 && var7 <= var5) {
					this.anIntArray10049[arg0] = arg1;
					return true;
				}
				if ((var7 <= 0 || var7 > 8192) && var7 > -8192) {
					this.anIntArray10049[arg0] = var6 - var5 & 0x3FFF;
				} else {
					this.anIntArray10049[arg0] = var6 + var5 & 0x3FFF;
				}
				return false;
			} else if (this.anIntArray10049[arg0] == -1) {
				return true;
			} else {
				var6 = this.aClass238_10053.method2370(784491199);
				var7 = this.anIntArray10049[arg0];
				int var8 = var6 - var7;
				if (var8 < -var5 || var8 > var5) {
					if ((var8 <= 0 || var8 > 8192) && var8 > -8192) {
						this.anIntArray10049[arg0] = var7 - var5 & 0x3FFF;
					} else {
						this.anIntArray10049[arg0] = var7 + var5 & 0x3FFF;
					}
					return false;
				}
				this.anIntArray10049[arg0] = -1;
				for (int var9 = 0; var9 < Console.aClass421_4266.disabledEquipmentSlots.length; var9++) {
					if (this.anIntArray10049[var9] != -1) {
						return true;
					}
				}
				this.anIntArray10049 = null;
				return true;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aab.d(" + ')');
		}
	}

	public static boolean method5458(String arg0, int arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (int var2 = 0; var2 < client.anInt9256; var2++) {
				if (arg0.equalsIgnoreCase(client.aClass99Array9259[var2].aString915)) {
					return true;
				}
			}
			if (arg0.equalsIgnoreCase(Class263_Sub2.myPlayer.aString10221)) {
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.mr(" + ')');
		}
	}

	public static boolean method5459(int arg0, byte arg1) {
		try {
			return arg0 >= Class476.aClass476_6899.anInt6882 && arg0 <= Class476.aClass476_6887.anInt6882;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aab.p(" + ')');
		}
	}

	public abstract Class60 method5408();

	public abstract int method5422();

	public abstract int method5424(byte arg0);

	public abstract int method5428();

	public abstract int method5434(int arg0);

	public abstract int method5435(int arg0);

	public abstract Class60 method5437(byte arg0);

	public abstract boolean method5439();

	public abstract boolean method5441(byte arg0);

	public abstract boolean method5442();

	public abstract boolean method5444();

	public abstract int method5446();

	public abstract int method5447();

	public abstract int method5448();

	public abstract boolean method5450();

	public abstract boolean method5451();

	public abstract Class60 method5452();

	public abstract int method5455();

	public abstract int method5456();

	public abstract Class60 method5457();
}
