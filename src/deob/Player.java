package deob;

public class Player extends Class432_Sub1_Sub1_Sub1 {

	public byte female = 0;

	public int pkIcon = -1;

	public int prayerIcon = -1;

	public int anInt10228 = 0;

	public int anInt10229 = 0;

	public int anInt10230 = -1;

	public int anInt10231 = 0;

	public int anInt10232 = -1;

	public boolean aBoolean10233 = false;

	public int anInt10246 = 0;

	public int anInt10235 = -1;

	public int anInt10241 = -1;

	public int anInt10237 = -1;

	public int anInt10238 = -1;

	public boolean isNPC = false;

	public int anInt10236 = 0;

	public int anInt10239 = 255;

	public boolean aBoolean10243 = false;

	public boolean aBoolean10234 = false;

	public boolean hidden = false;

	public boolean aBoolean10247 = false;

	public Class65 aClass65_10249 = new Class65(16);

	public int anInt10244;

	public int anInt10245;

	public int renderId;

	public Class408 aClass408_10240;

	public static IndexTable aClass280_10250;

	public String aString10221;

	public String aString10223;

	public String displayName;

	public String title;

	public Player(Class356 arg0, int arg1) {
		super(arg0, arg1);
	}

	public Player(Class356 arg0) {
		super(arg0);
	}

	public Class348 method5386(Class_ra arg0) {
		return null;
	}

	public String method5460(boolean arg0, int arg1) {
		try {
			return arg0 ? this.displayName : this.aString10221;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahg.hk(" + ')');
		}
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			if (this.aClass408_10240 == null || !this.method5461(arg0, 2048, -1003715179)) {
				return null;
			}
			Class247 var3 = arg0.cj();
			Class247 var4 = this.method5355();
			Class241 var5 = this.method5346();
			int var6 = this.aClass238_10053.method2370(1553527579);
			Class340 var7 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][(int) var5.aClass260_2606.aFloat2716 >> 9][(int) var5.aClass260_2606.aFloat2711 >> 9];
			if (var7 == null || var7.aClass432_Sub1_Sub4_3386 == null) {
				this.anInt10037 = (int) ((float) this.anInt10037 - (float) this.anInt10037 / 10.0F);
			} else {
				int var8 = this.anInt10037 - var7.aClass432_Sub1_Sub4_3386.aShort9927;
				this.anInt10037 = (int) ((float) this.anInt10037 - (float) var8 / 10.0F);
			}
			var3.method2454(var4);
			var3.method2474(0.0F, (float) (-20 - this.anInt10037), 0.0F);
			Class353 var19 = null;
			this.aBoolean10011 = false;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -68) == 1) {
				Class364 var9 = this.method5436(863604007);
				if (var9.aBoolean3820 && (this.aClass408_10240.anInt4210 == -1 || Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210, -804288586).aBoolean6331)) {
					Class477 var10 = this.aClass477_10032.method5966(461368510) && this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
					Class477_Sub3 var11 = this.aClass477_Sub3_10039.method5966(1577780919) && (!this.aClass477_Sub3_10039.aBoolean8752 || var10 == null) ? this.aClass477_Sub3_10039 : null;
					Class387 var12 = Class436.method5575(arg0, var6, this.anInt10023, this.anInt10035, this.anInt10046, 1, this.aClass387Array10066[0], 0, 0, 160, 240, var11 == null ? var10 : var11, (byte) -42);
					if (var12 != null) {
						if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length + 1) {
							this.method5373(this.aClass387Array10066.length + 1, 519636417);
						}
						var19 = Class497.method6105(true, (byte) 16);
						this.aBoolean10011 = true;
						arg0.RA(false);
						var12.method4475(var3, this.aClass80Array8656[this.aClass387Array10066.length], 0);
						arg0.RA(true);
					}
				}
			}
			int var20;
			if (Class263_Sub2.myPlayer == this) {
				for (var20 = client.aClass3Array8986.length - 1; var20 >= 0; var20--) {
					Class3 var21 = client.aClass3Array8986[var20];
					if (var21 != null && var21.anInt52 != -1) {
						int var14;
						if (var21.anInt53 == 1) {
							Class330_Sub35 var23 = (Class330_Sub35) client.aClass497_9014.method6094((long) var21.anInt47);
							if (var23 != null) {
								NPC var26 = (NPC) var23.anObject7733;
								Class260 var13 = Class260.method2561(var26.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606);
								var14 = (int) var13.aFloat2716;
								int var15 = (int) var13.aFloat2711;
								this.method5473(arg0, var3, this.aClass387Array10066[0], (long) var14, (long) var15, var21.anInt52, 92160000L);
							}
						}
						if (var21.anInt53 == 2) {
							Class260 var24 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
							long var27 = (long) (var21.anInt51 - (int) var24.aFloat2716);
							long var30 = (long) (var21.anInt50 - (int) var24.aFloat2711);
							long var16 = (long) (var21.anInt49 << 9);
							long var31 = var16 * var16;
							this.method5473(arg0, var3, this.aClass387Array10066[0], var27, var30, var21.anInt52, var31);
						}
						if (var21.anInt53 == 10 && var21.anInt47 >= 0 && var21.anInt47 < client.players.length) {
							Player var25 = client.players[var21.anInt47];
							if (var25 != null) {
								Class260 var28 = Class260.method2561(var25.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606);
								int var29 = (int) var28.aFloat2716;
								var14 = (int) var28.aFloat2711;
								this.method5473(arg0, var3, this.aClass387Array10066[0], (long) var29, (long) var14, var21.anInt52, 92160000L);
							}
						}
					}
				}
			}
			var3.method2454(var4);
			var3.method2474(0.0F, (float) (-5 - this.anInt10037), 0.0F);
			if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length) {
				this.method5373(this.aClass387Array10066.length, 1916828018);
			}
			if (var19 == null) {
				var19 = Class497.method6105(true, (byte) 16);
			}
			this.method5409(arg0, this.aClass387Array10066, var3, false, -1010551968);
			for (var20 = 0; var20 < this.aClass387Array10066.length; var20++) {
				if (this.aClass387Array10066[var20] != null) {
					this.aClass387Array10066[var20].method4475(var3, this.aClass80Array8656[var20], Class263_Sub2.myPlayer == this ? 1 : 0);
				}
			}
			if (this.aClass388_10048 != null) {
				Class81 var22 = this.aClass388_10048.method4570();
				arg0.cm(var22);
			}
			for (var20 = 0; var20 < this.aClass387Array10066.length; var20++) {
				if (this.aClass387Array10066[var20] != null) {
					this.aBoolean10011 |= this.aClass387Array10066[var20].i();
				}
				this.aClass387Array10066[var20] = null;
			}
			this.anInt10010 = client.anInt9092;
			return var19;
		} catch (RuntimeException var18) {
			throw Class476.method5964(var18, "ahg.bf(" + ')');
		}
	}

	public void method5404(Class_ra arg0, int arg1) {
		try {
			if (this.aClass408_10240 != null && (this.aBoolean10064 || this.method5461(arg0, 0, -1137651797))) {
				Class247 var3 = arg0.cj();
				var3.method2455(this.method5346());
				var3.method2474(0.0F, -5.0F, 0.0F);
				this.method5409(arg0, this.aClass387Array10066, var3, this.aBoolean10064, -614967942);
				for (int var4 = 0; var4 < this.aClass387Array10066.length; var4++) {
					this.aClass387Array10066[var4] = null;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ahg.bl(" + ')');
		}
	}

	public boolean method5461(Class_ra arg0, int arg1, int arg2) {
		try {
			int var4 = arg1;
			Class364 var5 = this.method5436(-1829126070);
			Class477 var6 = this.aClass477_10032.method5966(1219746848) && !this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
			Class477_Sub3 var7 = !this.aClass477_Sub3_10039.method5966(417704895) || this.aBoolean10233 || this.aClass477_Sub3_10039.aBoolean8752 && var6 != null ? null : this.aClass477_Sub3_10039;
			int var8 = var5.anInt3832;
			int var9 = var5.anInt3844;
			if (var8 != 0 || var9 != 0 || var5.anInt3816 != 0 || var5.anInt3848 != 0) {
				arg1 |= 0x7;
			}
			int var10 = this.aClass238_10053.method2370(1015116997);
			boolean var11 = this.aByte10025 != 0 && client.anInt8981 >= this.anInt10041 && client.anInt8981 < this.anInt10042;
			if (var11) {
				arg1 |= 0x80000;
			}
			Class387 var12 = this.aClass387Array10066[0] = this.aClass408_10240.method4762(arg0, arg1, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, Class556.aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, var6, var7, this.aClass477_Sub2_Sub1Array10019, this.anIntArray10049, var10, true, Console.aClass421_4266, (byte) -113);
			int var13 = Class99.method1203((byte) -67);
			if (Class332.anInt6617 < 96 && var13 > 50) {
				Class464_Sub20.method5808((byte) 71);
			}
			if (Class457.aClass457_6834 != Class404.aClass457_4162 && var13 < 50) {
				int var14 = 50 - var13;
				while (var14 > client.anInt8980) {
					Class230.aByteArrayArray2447[client.anInt8980] = new byte[102400];
					client.anInt8980++;
				}
				while (var14 < client.anInt8980) {
					client.anInt8980--;
					Class230.aByteArrayArray2447[client.anInt8980] = null;
				}
			} else if (Class457.aClass457_6834 != Class404.aClass457_4162) {
				Class230.aByteArrayArray2447 = new byte[50][];
				client.anInt8980 = 0;
			}
			if (var12 == null) {
				return false;
			}
			this.anInt10007 = var12.YA();
			var12.n();
			this.method5421(var12, -776036997);
			if (var8 == 0 && var9 == 0) {
				this.method5438(var10, this.method5453(-909169994) << 9, this.method5453(-1416511966) << 9, 0, 0, (byte) 46);
			} else {
				this.method5438(var10, var8, var9, var5.anInt3834, var5.anInt3837, (byte) 105);
				if (this.anInt10023 != 0) {
					var12.t(this.anInt10023);
				}
				if (this.anInt10035 != 0) {
					var12.EA(this.anInt10035);
				}
				if (this.anInt10046 != 0) {
					var12.ia(0, this.anInt10046, 0);
				}
			}
			if (var11) {
				var12.PA(this.aByte10043, this.aByte10044, this.aByte10063, this.aByte10025 & 0xFF);
			}
			if (!this.aBoolean10233) {
				this.method5449(arg0, var5, var4, var8, var9, var10, -711203220);
			}
			return true;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ahg.hi(" + ')');
		}
	}

	public Class260 method78() {
		return Class260.method2548();
	}

	public final void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public final void method5462(int arg0, int arg1, byte arg2, int arg3) {
		try {
			if (this.aClass477_10032.method5966(-1590974360) && this.aClass477_10032.method5986((byte) -89).anInt4460 == 1) {
				this.anIntArray10030 = null;
				this.aClass477_10032.method5988(-1, (byte) 35);
			}
			for (int var5 = 0; var5 < this.graphics.length; var5++) {
				if (this.graphics[var5].id != -1) {
					Class437 var6 = Class136.aClass416_1527.method5254(this.graphics[var5].id, 101012129);
					if (var6.aBoolean4443 && var6.anInt4431 != -1 && Class201.aClass436_6511.method5570(var6.anInt4431, -510246995).anInt4460 == 1) {
						this.graphics[var5].aClass477_573.method5988(-1, (byte) 13);
						this.graphics[var5].id = -1;
					}
				}
			}
			this.anInt10232 = -1;
			if (arg0 < 0 || arg0 >= client.aClass304_9030.method2990(-1508793626) || arg1 < 0 || arg1 >= client.aClass304_9030.method3033((byte) -53)) {
				this.method5463(arg0, arg1, (short) 1007);
			} else if (this.anIntArray10018[0] >= 0 && this.anIntArray10018[0] < client.aClass304_9030.method2990(-1841443466) && this.anIntArray10059[0] >= 0 && this.anIntArray10059[0] < client.aClass304_9030.method3033((byte) -42)) {
				if (Class299.aClass299_6808.aByte6805 == arg2) {
					Class90.method1064(this, arg0, arg1, Class299.aClass299_6808.aByte6805, -1052550139);
				}
				this.method5464(arg0, arg1, arg2, (byte) 0);
			} else {
				this.method5463(arg0, arg1, (short) 1007);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ahg.hl(" + ')');
		}
	}

	public void method5463(int arg0, int arg1, short arg2) {
		try {
			this.anInt10056 = 0;
			this.anInt10006 = 0;
			this.anInt10060 = 0;
			this.anIntArray10018[0] = arg0;
			this.anIntArray10059[0] = arg1;
			int var4 = this.method5453(-1349282652);
			Class260 var5 = Class260.method2549(this.method5346().aClass260_2606);
			var5.aFloat2716 = this.anIntArray10018[0] * 512 + var4 * 256;
			var5.aFloat2711 = this.anIntArray10059[0] * 512 + var4 * 256;
			this.method5349(var5);
			var5.method2550();
			if (Class263_Sub2.myPlayer == this) {
				client.aClass304_9030.method3008(241630128).method4582(575659132);
			}
			if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4563();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ahg.hf(" + ')');
		}
	}

	public final void method5464(int arg0, int arg1, byte arg2, byte arg3) {
		try {
			if (this.anInt10056 < this.anIntArray10018.length - 1) {
				this.anInt10056++;
			}
			for (int var5 = this.anInt10056; var5 > 0; var5--) {
				this.anIntArray10018[var5] = this.anIntArray10018[var5 - 1];
				this.anIntArray10059[var5] = this.anIntArray10059[var5 - 1];
				this.aByteArray10017[var5] = this.aByteArray10017[var5 - 1];
			}
			this.anIntArray10018[0] = arg0;
			this.anIntArray10059[0] = arg1;
			this.aByteArray10017[0] = arg2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ahg.ht(" + ')');
		}
	}

	public boolean method5450() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahg.bt(" + ')');
		}
	}

	public final boolean method5465(byte arg0) {
		try {
			return this.aClass408_10240 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.hc(" + ')');
		}
	}

	public int method5435(int arg0) {
		try {
			return -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.cu(" + ')');
		}
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			if (this.aClass408_10240 == null || !this.method5461(arg0, 131072, -2055251511)) {
				return false;
			}
			Class247 var5 = this.method5355();
			boolean var6 = false;
			int var7;
			for (var7 = 0; var7 < this.aClass387Array10066.length; var7++) {
				if (this.aClass387Array10066[var7] != null && this.aClass387Array10066[var7].method4458(arg1, arg2, var5, true, 0)) {
					var6 = true;
					break;
				}
			}
			for (var7 = 0; var7 < this.aClass387Array10066.length; var7++) {
				this.aClass387Array10066[var7] = null;
			}
			return var6;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ahg.br(" + ')');
		}
	}

	public final boolean method5360(short arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.bi(" + ')');
		}
	}

	public final void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ahg.bz(" + ')');
		}
	}

	public final void method5393(int arg0) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.be(" + ')');
		}
	}

	public boolean method5441(byte arg0) {
		try {
			return Class396.aClass417_4108.aBoolean4276;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.cx(" + ')');
		}
	}

	public Class60 method5437(byte arg0) {
		try {
			if (this.aClass60_10020 != null) {
				if (this.aClass60_10020.aString556 == null) {
					return null;
				}
				if (client.anInt9227 == 0 || client.anInt9227 == 3 || client.anInt9227 == 1 && Class432_Sub1_Sub1_Sub1.method5458(this.aString10221, -47306769)) {
					return this.aClass60_10020;
				}
			}
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.cc(" + ')');
		}
	}

	public void method5466(String arg0, int arg1, int arg2, int arg3) {
		try {
			this.method5427(arg0, arg1, arg2, Class362.method4257(1095252149) * Class396.aClass417_4108.anInt4283, (byte) 47);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ahg.hy(" + ')');
		}
	}

	public Class330_Sub28 method79(int arg0) {
		try {
			Class381 var2 = client.aClass304_9030.method3022(-913150236);
			return Class512.method6189(this.aByte8658, (int) this.method5346().aClass260_2606.aFloat2716 + var2.gameSceneBaseX * 512, -((int) this.method5346().aClass260_2606.aFloat2715), (int) this.method5346().aClass260_2606.aFloat2711 + var2.gameSceneBaseY * 512, 2009420278);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.r(" + ')');
		}
	}

	public Class244 method72(int arg0) {
		try {
			Class244 var2 = Class244.method2428();
			var2.method2420(Class257.method2541(this.aClass238_10053.anInt2581), 0.0F, 0.0F);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.j(" + ')');
		}
	}

	public Class260 method73(int arg0) {
		try {
			return Class260.method2548();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.i(" + ')');
		}
	}

	public int method5434(int arg0) {
		try {
			return -this.anInt10008 - 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.dt(" + ')');
		}
	}

	public int method5422() {
		return this.renderId * 1813242273 * 550257249;
	}

	public Class348 method5385(Class_ra arg0) {
		return null;
	}

	public Class244 method76() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public Class260 method81() {
		return Class260.method2548();
	}

	public Class348 method5388(Class_ra arg0) {
		return null;
	}

	public Class353 method5380(Class_ra arg0) {
		if (this.aClass408_10240 == null || !this.method5461(arg0, 2048, -1257184497)) {
			return null;
		}
		Class247 var2 = arg0.cj();
		Class247 var3 = this.method5355();
		Class241 var4 = this.method5346();
		int var5 = this.aClass238_10053.method2370(-461289761);
		Class340 var6 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][(int) var4.aClass260_2606.aFloat2716 >> 9][(int) var4.aClass260_2606.aFloat2711 >> 9];
		if (var6 == null || var6.aClass432_Sub1_Sub4_3386 == null) {
			this.anInt10037 = (int) ((float) (this.anInt10037 * -311619403 * -692101731) - (float) (this.anInt10037 * -692101731 * -311619403) / 10.0F) * -692101731 * -311619403;
		} else {
			int var7 = this.anInt10037 * -692101731 * -311619403 - var6.aClass432_Sub1_Sub4_3386.aShort9927;
			this.anInt10037 = (int) ((float) (this.anInt10037 * -692101731 * -311619403) - (float) var7 / 10.0F) * -692101731 * -311619403;
		}
		var2.method2454(var3);
		var2.method2474(0.0F, (float) (-20 - this.anInt10037 * -692101731 * -311619403), 0.0F);
		Class353 var17 = null;
		this.aBoolean10011 = false;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -106) == 1) {
			Class364 var8 = this.method5436(-996774346);
			if (var8.aBoolean3820 && (this.aClass408_10240.anInt4210 * 1218194931 * 1648243515 == -1 || Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210 * 1218194931 * 1648243515, -2000117426).aBoolean6331)) {
				Class477 var9 = this.aClass477_10032.method5966(470991555) && this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
				Class477_Sub3 var10 = this.aClass477_Sub3_10039.method5966(2128014906) && (!this.aClass477_Sub3_10039.aBoolean8752 || var9 == null) ? this.aClass477_Sub3_10039 : null;
				Class387 var11 = Class436.method5575(arg0, var5, this.anInt10023 * -1612642091 * 385609853, this.anInt10035 * 2131353697 * 1088471969, this.anInt10046 * -566693559 * 335728889, 1, this.aClass387Array10066[0], 0, 0, 160, 240, var10 == null ? var9 : var10, (byte) -16);
				if (var11 != null) {
					if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length + 1) {
						this.method5373(this.aClass387Array10066.length + 1, 1015273004);
					}
					var17 = Class497.method6105(true, (byte) 16);
					this.aBoolean10011 = true;
					arg0.RA(false);
					var11.method4475(var2, this.aClass80Array8656[this.aClass387Array10066.length], 0);
					arg0.RA(true);
				}
			}
		}
		int var18;
		if (Class263_Sub2.myPlayer == this) {
			for (var18 = client.aClass3Array8986.length - 1; var18 >= 0; var18--) {
				Class3 var19 = client.aClass3Array8986[var18];
				if (var19 != null && var19.anInt52 * 424526809 * -671052695 != -1) {
					int var13;
					if (var19.anInt53 * 137241975 * -1598012345 == 1) {
						Class330_Sub35 var21 = (Class330_Sub35) client.aClass497_9014.method6094((long) (var19.anInt47 * 539258015 * -1092243617));
						if (var21 != null) {
							NPC var24 = (NPC) var21.anObject7733;
							Class260 var12 = Class260.method2561(var24.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606);
							var13 = (int) var12.aFloat2716;
							int var14 = (int) var12.aFloat2711;
							this.method5473(arg0, var2, this.aClass387Array10066[0], (long) var13, (long) var14, var19.anInt52 * 424526809 * -671052695, 92160000L);
						}
					}
					if (var19.anInt53 * 137241975 * -1598012345 == 2) {
						Class260 var22 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
						long var25 = (long) (var19.anInt51 * 1614944949 * -729840739 - (int) var22.aFloat2716);
						long var28 = (long) (var19.anInt50 * -848947047 * 200457129 - (int) var22.aFloat2711);
						long var15 = (long) (var19.anInt49 * -1788953349 * -1507987917 << 9);
						long var29 = var15 * var15;
						this.method5473(arg0, var2, this.aClass387Array10066[0], var25, var28, var19.anInt52 * 424526809 * -671052695, var29);
					}
					if (var19.anInt53 * -1598012345 * 137241975 == 10 && var19.anInt47 * 539258015 * -1092243617 >= 0 && var19.anInt47 * -1092243617 * 539258015 < client.players.length) {
						Player var23 = client.players[var19.anInt47 * -1092243617 * 539258015];
						if (var23 != null) {
							Class260 var26 = Class260.method2561(var23.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606);
							int var27 = (int) var26.aFloat2716;
							var13 = (int) var26.aFloat2711;
							this.method5473(arg0, var2, this.aClass387Array10066[0], (long) var27, (long) var13, var19.anInt52 * -671052695 * 424526809, 92160000L);
						}
					}
				}
			}
		}
		var2.method2454(var3);
		var2.method2474(0.0F, (float) (-5 - this.anInt10037 * -692101731 * -311619403), 0.0F);
		if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length) {
			this.method5373(this.aClass387Array10066.length, 572838718);
		}
		if (var17 == null) {
			var17 = Class497.method6105(true, (byte) 16);
		}
		this.method5409(arg0, this.aClass387Array10066, var2, false, 757149189);
		for (var18 = 0; var18 < this.aClass387Array10066.length; var18++) {
			if (this.aClass387Array10066[var18] != null) {
				this.aClass387Array10066[var18].method4475(var2, this.aClass80Array8656[var18], Class263_Sub2.myPlayer == this ? 1 : 0);
			}
		}
		if (this.aClass388_10048 != null) {
			Class81 var20 = this.aClass388_10048.method4570();
			arg0.cm(var20);
		}
		for (var18 = 0; var18 < this.aClass387Array10066.length; var18++) {
			if (this.aClass387Array10066[var18] != null) {
				this.aBoolean10011 |= this.aClass387Array10066[var18].i();
			}
			this.aClass387Array10066[var18] = null;
		}
		this.anInt10010 = client.anInt9092 * 1833919797 * -740803425 * -381310781;
		return var17;
	}

	public void method5361(Class_ra arg0) {
		if (this.aClass408_10240 == null || !this.aBoolean10064 && !this.method5461(arg0, 0, -1190335429)) {
			return;
		}
		Class247 var2 = arg0.cj();
		var2.method2455(this.method5346());
		var2.method2474(0.0F, -5.0F, 0.0F);
		this.method5409(arg0, this.aClass387Array10066, var2, this.aBoolean10064, 678970274);
		for (int var3 = 0; var3 < this.aClass387Array10066.length; var3++) {
			this.aClass387Array10066[var3] = null;
		}
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		if (this.aClass408_10240 == null || !this.method5461(arg0, 131072, -1649144417)) {
			return false;
		}
		Class247 var4 = this.method5355();
		boolean var5 = false;
		int var6;
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			if (this.aClass387Array10066[var6] != null && this.aClass387Array10066[var6].method4458(arg1, arg2, var4, true, 0)) {
				var5 = true;
				break;
			}
		}
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			this.aClass387Array10066[var6] = null;
		}
		return var5;
	}

	public final boolean method5391() {
		return false;
	}

	public final void method5387() {
		throw new IllegalStateException();
	}

	public final void method5384() {
		throw new IllegalStateException();
	}

	public int method5467() {
		return this.aClass408_10240 == null || this.aClass408_10240.anInt4210 * 1218194931 * 1648243515 == -1 ? super.method5453(-1812300211) : Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210 * 1648243515 * 1218194931, -459672421).anInt6295 * -510585889 * -1943771105;
	}

	public int method5468() {
		return this.aClass408_10240 == null || this.aClass408_10240.anInt4210 * 1218194931 * 1648243515 == -1 ? super.method5453(-1326643592) : Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210 * 1648243515 * 1218194931, 1256217860).anInt6295 * -510585889 * -1943771105;
	}

	public int method5469() {
		return this.aClass408_10240 == null || this.aClass408_10240.anInt4210 * 1218194931 * 1648243515 == -1 ? super.method5453(-1987141837) : Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210 * 1648243515 * 1218194931, -445287415).anInt6295 * -510585889 * -1943771105;
	}

	public int method5470() {
		return this.aClass408_10240 == null || this.aClass408_10240.anInt4210 * 1218194931 * 1648243515 == -1 ? super.method5453(-1078024714) : Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210 * 1648243515 * 1218194931, -2110455100).anInt6295 * -510585889 * -1943771105;
	}

	public int method5446() {
		return this.renderId * 1813242273 * 550257249;
	}

	public Class348 method5401(Class_ra arg0) {
		return null;
	}

	public int method5447() {
		return -1;
	}

	public int method5448() {
		return -1;
	}

	public int method5455() {
		return -1;
	}

	public Class60 method5452() {
		if (this.aClass60_10020 != null) {
			if (this.aClass60_10020.aString556 == null) {
				return null;
			}
			if (client.anInt9227 * 1708636109 * 742657285 == 0 || client.anInt9227 * 742657285 * 1708636109 == 3 || client.anInt9227 * 742657285 * 1708636109 == 1 && Class432_Sub1_Sub1_Sub1.method5458(this.aString10221, 343202080)) {
				return this.aClass60_10020;
			}
		}
		return null;
	}

	public boolean method5442() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class244 method77() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public boolean method5451() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public boolean method5439() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class60 method5408() {
		if (this.aClass60_10020 != null) {
			if (this.aClass60_10020.aString556 == null) {
				return null;
			}
			if (client.anInt9227 * 1708636109 * 742657285 == 0 || client.anInt9227 * 742657285 * 1708636109 == 3 || client.anInt9227 * 742657285 * 1708636109 == 1 && Class432_Sub1_Sub1_Sub1.method5458(this.aString10221, 1204891282)) {
				return this.aClass60_10020;
			}
		}
		return null;
	}

	public String method5471(boolean arg0, int arg1) {
		try {
			String var3 = "";
			if (this.title != null) {
				var3 = this.title;
			}
			if (arg0) {
				var3 = var3 + this.displayName;
			} else {
				var3 = var3 + this.aString10221;
			}
			if (this.aString10223 != null) {
				var3 = var3 + this.aString10223;
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ahg.hq(" + ')');
		}
	}

	public Class330_Sub28 method80() {
		Class381 var1 = client.aClass304_9030.method3022(1274822907);
		return Class512.method6189(this.aByte8658, (int) this.method5346().aClass260_2606.aFloat2716 + var1.gameSceneBaseX * -1401159168 * 170770945, -((int) this.method5346().aClass260_2606.aFloat2715), (int) this.method5346().aClass260_2606.aFloat2711 + var1.gameSceneBaseY * 470868480 * -71518063, 2009420278);
	}

	public int method5428() {
		return -(this.anInt10008 * 662194221 * -1654044763) - 1;
	}

	public final void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public final void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public Class60 method5457() {
		if (this.aClass60_10020 != null) {
			if (this.aClass60_10020.aString556 == null) {
				return null;
			}
			if (client.anInt9227 * 1708636109 * 742657285 == 0 || client.anInt9227 * 742657285 * 1708636109 == 3 || client.anInt9227 * 742657285 * 1708636109 == 1 && Class432_Sub1_Sub1_Sub1.method5458(this.aString10221, -229316765)) {
				return this.aClass60_10020;
			}
		}
		return null;
	}

	public Class348 method5362(Class_ra arg0) {
		return null;
	}

	public int method5424(byte arg0) {
		try {
			return this.renderId;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.cf(" + ')');
		}
	}

	public Class244 method74() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		if (this.aClass408_10240 == null || !this.method5461(arg0, 131072, -1141969707)) {
			return false;
		}
		Class247 var4 = this.method5355();
		boolean var5 = false;
		int var6;
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			if (this.aClass387Array10066[var6] != null && this.aClass387Array10066[var6].method4458(arg1, arg2, var4, true, 0)) {
				var5 = true;
				break;
			}
		}
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			this.aClass387Array10066[var6] = null;
		}
		return var5;
	}

	public int method5456() {
		return -(this.anInt10008 * 662194221 * -1654044763) - 1;
	}

	public final void sendAppearance(Buffer arg0, int arg1) {
		try {
			arg0.offset = 0;
			int var3 = arg0.readUnsignedByte(909197228);
			this.female = (byte) (var3 & 0x1);
			boolean var4 = this.isNPC;
			this.isNPC = (var3 & 0x2) != 0;
			boolean var5 = (var3 & 0x4) != 0;
			int var6 = super.method5453(-1832128296);
			this.method5420((var3 >> 3 & 0x7) + 1, (short) -23720);
			boolean var7 = (var3 & 0x40) != 0;
			boolean var8 = (var3 & 0x80) != 0;
			Class260 var9 = Class260.method2549(this.method5346().aClass260_2606);
			var9.aFloat2716 += this.method5453(-614699555) - var6 << 8;
			var9.aFloat2711 += this.method5453(-807456602) - var6 << 8;
			this.method5349(var9);
			var9.method2550();
			if (var7) {
				this.title = arg0.readJagString((byte) 6);
			} else {
				this.title = null;
			}
			if (var8) {
				this.aString10223 = arg0.readJagString((byte) 6);
			} else {
				this.aString10223 = null;
			}
			this.pkIcon = arg0.readByte((byte) 2);
			this.prayerIcon = arg0.readByte((byte) -64);
			this.hidden = arg0.readByte((byte) -77) == 1;
			if (Class404.aClass457_4162 == Class457.aClass457_6834 && client.anInt9182 >= 2) {
				this.hidden = false;
			}
			int var10 = -1;
			this.anInt10246 = 0;
			int[] var11 = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
			ItemEquipDefinitions[] var12 = new ItemEquipDefinitions[Console.aClass421_4266.disabledEquipmentSlots.length];
			ItemDefinitions[] var13 = new ItemDefinitions[Console.aClass421_4266.disabledEquipmentSlots.length];
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			for (var14 = 0; var14 < Console.aClass421_4266.disabledEquipmentSlots.length; var14++) {
				if (Console.aClass421_4266.disabledEquipmentSlots[var14] != 1) {
					var15 = arg0.readUnsignedByte(1563560306);
					if (var15 == 0) {
						var11[var14] = 0;
					} else {
						var16 = arg0.readUnsignedByte(1239789401);
						var17 = var16 + (var15 << 8);
						if (var14 == 0 && var17 == 65535) {
							var10 = arg0.readBigSmart(-1914076770);
							this.anInt10246 = arg0.readUnsignedByte(1631974157);
							break;
						}
						if (var17 >= 16384) {
							var17 -= 16384;
							var11[var14] = var17 | 0x40000000;
							var13[var14] = Class556.aClass510_6392.getItemDefinitions(var17, (byte) -119);
							var18 = var13[var14].anInt6742;
							if (var18 != 0) {
								this.anInt10246 = var18;
							}
						} else {
							var11[var14] = var17 - 256 | Integer.MIN_VALUE;
						}
					}
				}
			}
			if (var10 == -1) {
				var14 = arg0.readUnsignedShort(1778963863);
				var15 = 0;
				for (var16 = 0; var16 < Console.aClass421_4266.disabledEquipmentSlots.length; var16++) {
					if (Console.aClass421_4266.disabledEquipmentSlots[var16] == 0) {
						if ((var14 & 0x1 << var15) != 0 && var13[var16] != null) {
							var12[var16] = Class509.getModifiedColorDefinitions(var13[var16], arg0, -266430554);
						}
						var15++;
					} else if (arg1 >= 917947717) {
						throw new IllegalStateException();
					}
				}
			}
			int[] var22 = new int[10];
			for (var15 = 0; var15 < 10; var15++) {
				var16 = arg0.readUnsignedByte(1543362293);
				if (Class408.modifiedModelColors.length < 1 || var16 < 0 || var16 >= Class408.modifiedModelColors[var15][0].length) {
					var16 = 0;
				}
				var22[var15] = var16;
			}
			this.renderId = arg0.readUnsignedShort(1132209300);
			this.displayName = arg0.readString(-111554441);
			this.aString10221 = this.displayName;
			if (Class263_Sub2.myPlayer == this) {
				RuntimeException_Sub2.aString6440 = this.displayName;
			}
			this.anInt10228 = arg0.readUnsignedByte(-154374674);
			if (var5) {
				this.anInt10231 = arg0.readUnsignedShort(1990974442);
				if (this.anInt10231 == 65535) {
					this.anInt10231 = -1;
				}
				this.anInt10229 = this.anInt10228;
				this.anInt10230 = -1;
			} else {
				this.anInt10231 = 0;
				this.anInt10229 = arg0.readUnsignedByte(1450162969);
				this.anInt10230 = arg0.readUnsignedByte(1039107854);
				if (this.anInt10230 == 255) {
					this.anInt10230 = -1;
				}
			}
			var15 = this.anInt10236;
			this.anInt10236 = arg0.readUnsignedByte(110031962);
			if (this.anInt10236 == 0) {
				Class95_Sub13.method1145(this, (byte) -51);
			} else {
				var16 = this.anInt10235;
				var17 = this.anInt10241;
				var18 = this.anInt10237;
				int var19 = this.anInt10238;
				int var20 = this.anInt10239;
				this.anInt10235 = arg0.readUnsignedShort(84175290);
				this.anInt10241 = arg0.readUnsignedShort(3843677);
				this.anInt10237 = arg0.readUnsignedShort(-66796915);
				this.anInt10238 = arg0.readUnsignedShort(1929763777);
				this.anInt10239 = arg0.readUnsignedByte(502435342);
				if (this.isNPC != var4 || var15 != this.anInt10236 || this.anInt10235 != var16 || var17 != this.anInt10241 || var18 != this.anInt10237 || this.anInt10238 != var19 || this.anInt10239 != var20) {
					Class_ra_Sub3.method5212(this, 629226878);
				}
			}
			if (this.aClass408_10240 == null) {
				this.aClass408_10240 = new Class408();
			}
			var16 = this.aClass408_10240.anInt4210;
			int[] var23 = this.aClass408_10240.anIntArray4205;
			this.aClass408_10240.method4757(this.method5424((byte) -55), var11, var12, var22, this.female == 1, var10, -377076171);
			if (var10 != var16) {
				var9 = Class260.method2549(this.method5346().aClass260_2606);
				var9.aFloat2716 = (this.anIntArray10018[0] << 9) + (this.method5453(-1355739283) << 8);
				var9.aFloat2711 = (this.anIntArray10059[0] << 9) + (this.method5453(-284022228) << 8);
				this.method5349(var9);
				var9.method2550();
			}
			if (client.anInt9121 == this.anInt10008 && var23 != null) {
				for (var18 = 0; var18 < var22.length; var18++) {
					if (var23[var18] != var22[var18]) {
						Class556.aClass510_6392.method6171(2067341806);
						break;
					}
				}
			}
			if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4563();
			}
			if (this.aClass477_Sub3_10039.method5966(434597075) && this.aClass477_Sub3_10039.aBoolean8752) {
				Class364 var24 = this.method5436(17272628);
				if (!var24.method4264(this.aClass477_Sub3_10039.method5967((byte) -6), 1984042108)) {
					this.aClass477_Sub3_10039.method5988(-1, (byte) 11);
					this.aClass477_Sub3_10039.aBoolean8752 = false;
				}
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "ahg.hm(" + ')');
		}
	}

	public void method5473(Class_ra arg0, Class247 arg1, Class387 arg2, long arg3, long arg4, int arg5, long arg6) {
		try {
			long var11 = arg3 * arg3 + arg4 * arg4;
			if (var11 >= 262144L && var11 <= arg6) {
				int var13 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass238_10053.method2370(454576520)) & 0x3FFF;
				Class387 var14 = Class526.method6258(arg0, var13, this.anInt10023, this.anInt10035, this.anInt10046, arg5, -317256750);
				if (var14 != null) {
					arg0.RA(false);
					var14.method4475(arg1, null, 0);
					arg0.RA(true);
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ahg.hv(" + ')');
		}
	}

	public static int getVolumeDistance(Player arg0) {
		int var1 = Class263_Sub2.myPlayer.anIntArray10018[0];
		int var2 = Class263_Sub2.myPlayer.anIntArray10059[0];
		int var3 = arg0.anIntArray10018[0];
		int var4 = arg0.anIntArray10059[0];
		System.out.println(var1 + ", " + var2 + ", " + var3 + ", " + var4);
		System.out.println(Class263_Sub2.myPlayer + ", " + arg0);
		System.out.println(Class263_Sub2.myPlayer == arg0);
		int var5 = (int) Math.sqrt(Math.pow((double) (var3 - var1), 2.0D) + Math.pow((double) (var4 - var2), 2.0D));
		System.out.println(var5);
		return var5 > 30 ? 1 : 100 - var5 * 3;
	}

	public boolean method5444() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class244 method71() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public int method5453(int arg0) {
		try {
			return this.aClass408_10240 == null || this.aClass408_10240.anInt4210 == -1 ? super.method5453(-1794093608) : Class158_Sub3.aClass553_8875.method6392(this.aClass408_10240.anInt4210, 227471962).anInt6295;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ahg.bu(" + ')');
		}
	}

	public Class244 method83() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public Class244 method75() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 142833127 * 1218629079), 0.0F, 0.0F);
		return var1;
	}

	public Class260 method82() {
		return Class260.method2548();
	}

	public Class348 method5357(Class_ra arg0) {
		return null;
	}
}
