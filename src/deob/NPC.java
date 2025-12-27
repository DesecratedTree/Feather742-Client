package deob;

@ObfuscatedName("NPC")
public class NPC extends Class432_Sub1_Sub1_Sub1 {

	public static int anInt10253 = 1;

	public static int anInt10256 = 1;

	public int anInt10261 = -1;

	public int anInt10252 = -1;

	public int anInt10257 = -1;

	public Class67 aClass67_10260 = new Class67(32);

	public int[] anIntArray10263 = new int[6];

	public int[] anIntArray10262 = new int[6];

	public int anInt10255;

	public int anInt10258;

	public int anInt10264;

	public int anInt10265;

	public int anInt10266;

	public Class538 aClass538_10254;

	public Class551 aClass551_10251;

	public String aString10259;

	public NPC(Class356 arg0, int arg1) {
		super(arg0, arg1);
		this.method5474(-1463297950);
	}

	public NPC(Class356 arg0) {
		super(arg0);
		this.method5474(-851137745);
	}

	public Class244 method75() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public void method5474(int arg0) {
		try {
			this.anInt10266 = (int) (Math.random() * 4.0D) + 32;
			this.anInt10264 = (int) (Math.random() * 2.0D) + 3;
			this.anInt10265 = (int) (Math.random() * 3.0D) + 16;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(601409658) == 1) {
				this.anInt10255 = (int) (Math.random() * 6.0D);
			} else {
				this.anInt10255 = (int) (Math.random() * 12.0D);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.hm(" + ')');
		}
	}

	public void method5475(Class551 arg0, int arg1) {
		try {
			if (arg0 != this.aClass551_10251 && Class484.aBoolean5782 && Class378.method4380(this.anInt10008, -1137361974)) {
				Class513.method6194((byte) -37);
			}
			this.aClass551_10251 = arg0;
			if (this.aClass551_10251 != null) {
				this.aString10259 = this.aClass551_10251.aString6323;
				this.anInt10258 = this.aClass551_10251.anInt6348;
			}
			if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4563();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aho.hv(" + ')');
		}
	}

	public Class348 method5383(Class_ra arg0, int arg1) {
		try {
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aho.bt(" + ')');
		}
	}

	public final void method5397(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public void method5476(int arg0, int arg1, int arg2, int arg3) {
		try {
			this.anIntArray10263[arg0] = arg1;
			this.anIntArray10262[arg0] = arg2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aho.hy(" + ')');
		}
	}

	public final void method5477(Class293 arg0, int arg1, byte arg2) {
		try {
			int var4 = this.anIntArray10018[0];
			int var5 = this.anIntArray10059[0];
			switch(arg0.anInt6802) {
				case 0:
					var4--;
					var5++;
					break;
				case 1:
					var4++;
					var5--;
					break;
				case 2:
					var4--;
					var5--;
					break;
				case 3:
					var5++;
					break;
				case 4:
					var5--;
					break;
				case 5:
					var4--;
					break;
				case 6:
					var4++;
					break;
				case 7:
					var4++;
					var5++;
			}
			if (this.aClass477_10032.method5966(-179328072) && this.aClass477_10032.method5986((byte) -104).anInt4460 == 1) {
				this.anIntArray10030 = null;
				this.aClass477_10032.method5988(-1, (byte) -92);
			}
			int var6;
			for (var6 = 0; var6 < this.graphics.length; var6++) {
				if (this.graphics[var6].id != -1) {
					Class437 var7 = Class136.aClass416_1527.method5254(this.graphics[var6].id, 1331355162);
					if (var7.aBoolean4443 && var7.anInt4431 != -1 && Class201.aClass436_6511.method5570(var7.anInt4431, -407001567).anInt4460 == 1) {
						this.graphics[var6].aClass477_573.method5988(-1, (byte) -2);
						this.graphics[var6].id = -1;
					}
				}
			}
			if (this.anInt10056 < this.anIntArray10018.length - 1) {
				this.anInt10056++;
			}
			for (var6 = this.anInt10056; var6 > 0; var6--) {
				this.anIntArray10018[var6] = this.anIntArray10018[var6 - 1];
				this.anIntArray10059[var6] = this.anIntArray10059[var6 - 1];
				this.aByteArray10017[var6] = this.aByteArray10017[var6 - 1];
			}
			this.anIntArray10018[0] = var4;
			this.anIntArray10059[0] = var5;
			this.aByteArray10017[0] = (byte) arg1;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "aho.hq(" + ')');
		}
	}

	public void method5478(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		try {
			this.aByte8658 = this.aByte8654 = (byte) arg0;
			if (client.aClass304_9030.method2995(1217564503).method2788(arg1, arg2, (byte) -14)) {
				this.aByte8654++;
			}
			if (this.aClass477_10032.method5966(1324837661) && this.aClass477_10032.method5986((byte) -17).anInt4460 == 1) {
				this.anIntArray10030 = null;
				this.aClass477_10032.method5988(-1, (byte) -71);
			}
			int var7;
			for (var7 = 0; var7 < this.graphics.length; var7++) {
				if (this.graphics[var7].id != -1) {
					Class437 var8 = Class136.aClass416_1527.method5254(this.graphics[var7].id, -1730035429);
					if (var8.aBoolean4443 && var8.anInt4431 != -1 && Class201.aClass436_6511.method5570(var8.anInt4431, -1355671259).anInt4460 == 1) {
						this.graphics[var7].aClass477_573.method5988(-1, (byte) -38);
						this.graphics[var7].id = -1;
					}
				}
			}
			if (!arg3) {
				var7 = arg1 - this.anIntArray10018[0];
				int var12 = arg2 - this.anIntArray10059[0];
				if (var7 >= -8 && var7 <= 8 && var12 >= -8 && var12 <= 8) {
					if (this.anInt10056 < this.anIntArray10018.length - 1) {
						this.anInt10056++;
					}
					for (int var9 = this.anInt10056; var9 > 0; var9--) {
						this.anIntArray10018[var9] = this.anIntArray10018[var9 - 1];
						this.anIntArray10059[var9] = this.anIntArray10059[var9 - 1];
						this.aByteArray10017[var9] = this.aByteArray10017[var9 - 1];
					}
					this.anIntArray10018[0] = arg1;
					this.anIntArray10059[0] = arg2;
					this.aByteArray10017[0] = Class299.aClass299_6807.aByte6805;
					return;
				}
			}
			this.anInt10056 = 0;
			this.anInt10006 = 0;
			this.anInt10060 = 0;
			this.anIntArray10018[0] = arg1;
			this.anIntArray10059[0] = arg2;
			Class260 var11 = Class260.method2549(this.method5346().aClass260_2606);
			var11.aFloat2716 = (this.anIntArray10018[0] << 9) + (arg4 << 8);
			var11.aFloat2711 = (this.anIntArray10059[0] << 9) + (arg4 << 8);
			this.method5349(var11);
			var11.method2550();
			if (this.aClass388_10048 != null) {
				this.aClass388_10048.method4563();
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aho.hk(" + ')');
		}
	}

	public int method5479() {
		return this.aClass551_10251 == null ? 0 : this.aClass551_10251.anInt6356 * -1813147045 * 1282493907;
	}

	public Class353 method5405(Class_ra arg0, int arg1) {
		try {
			if (this.aClass551_10251 == null || !this.method5483(arg0, 526336, (byte) 24)) {
				return null;
			}
			Class247 var3 = this.method5355();
			Class241 var4 = this.method5346();
			Class247 var5 = arg0.cj();
			int var6 = this.aClass238_10053.method2370(1559042988);
			Class340 var7 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][(int) var4.aClass260_2606.aFloat2716 >> 9][(int) var4.aClass260_2606.aFloat2711 >> 9];
			if (var7 == null || var7.aClass432_Sub1_Sub4_3386 == null) {
				this.anInt10037 = (int) ((float) this.anInt10037 - (float) this.anInt10037 / 10.0F);
			} else {
				int var8 = this.anInt10037 - var7.aClass432_Sub1_Sub4_3386.aShort9927;
				this.anInt10037 = (int) ((float) this.anInt10037 - (float) var8 / 10.0F);
			}
			var5.method2454(var3);
			var5.method2474(0.0F, (float) (-20 - this.anInt10037), 0.0F);
			Class364 var15 = this.method5436(2048037895);
			Class551 var9 = this.aClass551_10251.anIntArray6326 == null ? this.aClass551_10251 : this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 106);
			this.aBoolean10011 = false;
			Class353 var10 = null;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -29) == 1 && var9.aBoolean6331 && var15.aBoolean3820) {
				Class477 var11 = this.aClass477_10032.method5966(-264528540) && this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
				Class477_Sub3 var12 = this.aClass477_Sub3_10039.method5966(959965011) && (!this.aClass477_Sub3_10039.aBoolean8752 || var11 == null) ? this.aClass477_Sub3_10039 : null;
				Class387 var13 = Class436.method5575(arg0, var6, this.anInt10023, this.anInt10035, this.anInt10046, this.aClass551_10251.anInt6295, this.aClass387Array10066[0], this.aClass551_10251.aShort6332 & 0xFFFF, this.aClass551_10251.aShort6333 & 0xFFFF, this.aClass551_10251.aByte6334 & 0xFF, this.aClass551_10251.aByte6335 & 0xFF, var12 == null ? var11 : var12, (byte) -14);
				if (var13 != null) {
					if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length + 1) {
						this.method5373(this.aClass387Array10066.length + 1, 1188701298);
					}
					var10 = Class497.method6105(this.method5486(-2083112399), (byte) 16);
					this.aBoolean10011 = true;
					arg0.RA(false);
					var13.method4475(var5, this.aClass80Array8656[this.aClass387Array10066.length], 0);
					arg0.RA(true);
				}
			}
			if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length) {
				this.method5373(this.aClass387Array10066.length, 570139356);
			}
			if (var10 == null) {
				var10 = Class497.method6105(this.method5486(-2094339524), (byte) 16);
			}
			this.method5409(arg0, this.aClass387Array10066, var5, false, -232994275);
			int var16;
			for (var16 = 0; var16 < this.aClass387Array10066.length; var16++) {
				if (this.aClass387Array10066[var16] != null) {
					if (this.aClass551_10251.aBoolean6357) {
						this.aClass387Array10066[var16].PA(this.anInt10266, this.anInt10264, this.anInt10265, this.anInt10255);
					}
					this.aClass387Array10066[var16].method4475(var5, this.aClass80Array8656[var16], 0);
				}
			}
			if (this.aClass388_10048 != null) {
				Class81 var17 = this.aClass388_10048.method4570();
				arg0.cm(var17);
			}
			for (var16 = 0; var16 < this.aClass387Array10066.length; var16++) {
				if (this.aClass387Array10066[var16] != null) {
					this.aBoolean10011 |= this.aClass387Array10066[var16].i();
				}
				this.aClass387Array10066[var16] = null;
			}
			this.anInt10010 = client.anInt9092;
			return var10;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "aho.bf(" + ')');
		}
	}

	public int method5363(int arg0) {
		try {
			if (this.aClass551_10251.anIntArray6326 != null) {
				Class551 var2 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 67);
				if (var2 != null && var2.anInt6299 != -1) {
					return var2.anInt6299;
				}
			}
			return this.aClass551_10251.anInt6299 == -1 ? super.method5363(-1774023018) : this.aClass551_10251.anInt6299;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.bc(" + ')');
		}
	}

	public int method5359(int arg0) {
		try {
			return this.aClass551_10251 == null ? 0 : this.aClass551_10251.anInt6356;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.fp(" + ')');
		}
	}

	public boolean method5358(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			if (this.aClass551_10251 == null || !this.method5483(arg0, 131072, (byte) -11)) {
				return false;
			}
			Class247 var5 = this.method5355();
			boolean var6 = false;
			int var7;
			for (var7 = 0; var7 < this.aClass387Array10066.length; var7++) {
				if (this.aClass387Array10066[var7] != null) {
					boolean var8;
					label67: {
						if (this.aClass551_10251.anInt6356 <= 0) {
							label66: {
								if (this.aClass551_10251.anInt6353 == -1) {
									if (this.aClass551_10251.anInt6295 == 1) {
										if (arg3 >= 90742394) {
											throw new IllegalStateException();
										}
										break label66;
									}
								} else if (this.aClass551_10251.anInt6353 == 1) {
									break label66;
								}
								var8 = false;
								break label67;
							}
						}
						var8 = true;
					}
					boolean var10 = this.aClass387Array10066[var7].method4458(arg1, arg2, var5, var8, this.aClass551_10251.anInt6356);
					if (var10) {
						var6 = true;
						break;
					}
				}
			}
			for (var7 = 0; var7 < this.aClass387Array10066.length; var7++) {
				this.aClass387Array10066[var7] = null;
			}
			return var6;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "aho.br(" + ')');
		}
	}

	public final boolean method5360(short arg0) {
		try {
			return false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.bi(" + ')');
		}
	}

	public final void method5392(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aho.bz(" + ')');
		}
	}

	public Class348 method5386(Class_ra arg0) {
		return null;
	}

	public int method5480(int arg0, int arg1) {
		try {
			return this.anIntArray10263[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aho.ht(" + ')');
		}
	}

	public void method5481(String arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5 = Class362.method4257(-1634342689) * Class396.aClass417_4108.anInt4289;
			this.method5427(arg0, arg1, arg2, var5, (byte) -5);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aho.hu(" + ')');
		}
	}

	public Class60 method5408() {
		return this.aClass60_10020 != null && this.aClass60_10020.aString556 == null ? null : this.aClass60_10020;
	}

	public Class60 method5437(byte arg0) {
		try {
			return this.aClass60_10020 != null && this.aClass60_10020.aString556 == null ? null : this.aClass60_10020;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.cc(" + ')');
		}
	}

	public void method5404(Class_ra arg0, int arg1) {
		try {
			if (this.aClass551_10251 != null && (this.aBoolean10064 || this.method5483(arg0, 0, (byte) 79))) {
				Class247 var3 = arg0.cj();
				var3.method2454(this.method5355());
				var3.method2474(0.0F, -5.0F, 0.0F);
				this.method5409(arg0, this.aClass387Array10066, var3, this.aBoolean10064, 900974383);
				for (int var4 = 0; var4 < this.aClass387Array10066.length; var4++) {
					this.aClass387Array10066[var4] = null;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aho.bl(" + ')');
		}
	}

	public Class330_Sub28 method79(int arg0) {
		try {
			Class381 var2 = client.aClass304_9030.method3022(-1949930154);
			return Class512.method6189(this.aByte8658, (int) this.method5346().aClass260_2606.aFloat2716 + var2.gameSceneBaseX * 512, -((int) this.method5346().aClass260_2606.aFloat2715), (int) this.method5346().aClass260_2606.aFloat2711 + var2.gameSceneBaseY * 512, 2009420278);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.r(" + ')');
		}
	}

	public Class244 method72(int arg0) {
		try {
			Class244 var2 = Class244.method2428();
			var2.method2420(Class257.method2541(this.aClass238_10053.anInt2581), 0.0F, 0.0F);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.j(" + ')');
		}
	}

	public Class244 method74() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public Class348 method5401(Class_ra arg0) {
		return null;
	}

	public Class348 method5357(Class_ra arg0) {
		return null;
	}

	public Class348 method5385(Class_ra arg0) {
		return null;
	}

	public int method5434(int arg0) {
		try {
			return this.anInt10008 + 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.dt(" + ')');
		}
	}

	public Class348 method5362(Class_ra arg0) {
		return null;
	}

	public final void method5384() {
		throw new IllegalStateException();
	}

	public Class353 method5380(Class_ra arg0) {
		if (this.aClass551_10251 == null || !this.method5483(arg0, 526336, (byte) 61)) {
			return null;
		}
		Class247 var2 = this.method5355();
		Class241 var3 = this.method5346();
		Class247 var4 = arg0.cj();
		int var5 = this.aClass238_10053.method2370(1544938548);
		Class340 var6 = this.aClass356_8655.aClass340ArrayArrayArray3653[this.aByte8658][(int) var3.aClass260_2606.aFloat2716 >> 9][(int) var3.aClass260_2606.aFloat2711 >> 9];
		if (var6 == null || var6.aClass432_Sub1_Sub4_3386 == null) {
			this.anInt10037 = (int) ((float) (this.anInt10037 * -692101731 * -311619403) - (float) (this.anInt10037 * -692101731 * -311619403) / 10.0F) * -692101731 * -311619403;
		} else {
			int var7 = this.anInt10037 * -311619403 * -692101731 - var6.aClass432_Sub1_Sub4_3386.aShort9927;
			this.anInt10037 = (int) ((float) (this.anInt10037 * -692101731 * -311619403) - (float) var7 / 10.0F) * -692101731 * -311619403;
		}
		var4.method2454(var2);
		var4.method2474(0.0F, (float) (-20 - -311619403 * this.anInt10037 * -692101731), 0.0F);
		Class364 var13 = this.method5436(-2056145666);
		Class551 var8 = this.aClass551_10251.anIntArray6326 == null ? this.aClass551_10251 : this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 39);
		this.aBoolean10011 = false;
		Class353 var9 = null;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -41) == 1 && var8.aBoolean6331 && var13.aBoolean3820) {
			Class477 var10 = this.aClass477_10032.method5966(-2112440070) && this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
			Class477_Sub3 var11 = this.aClass477_Sub3_10039.method5966(291661312) && (!this.aClass477_Sub3_10039.aBoolean8752 || var10 == null) ? this.aClass477_Sub3_10039 : null;
			Class387 var12 = Class436.method5575(arg0, var5, this.anInt10023 * -1612642091 * 385609853, this.anInt10035 * 1088471969 * 2131353697, this.anInt10046 * -566693559 * 335728889, this.aClass551_10251.anInt6295 * -1943771105 * -510585889, this.aClass387Array10066[0], this.aClass551_10251.aShort6332 & 0xFFFF, this.aClass551_10251.aShort6333 & 0xFFFF, this.aClass551_10251.aByte6334 & 0xFF, this.aClass551_10251.aByte6335 & 0xFF, var11 == null ? var10 : var11, (byte) -122);
			if (var12 != null) {
				if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length + 1) {
					this.method5373(this.aClass387Array10066.length + 1, 1237114248);
				}
				var9 = Class497.method6105(this.method5486(-2115514083), (byte) 16);
				this.aBoolean10011 = true;
				arg0.RA(false);
				var12.method4475(var4, this.aClass80Array8656[this.aClass387Array10066.length], 0);
				arg0.RA(true);
			}
		}
		if (this.aClass80Array8656 == null || this.aClass80Array8656.length < this.aClass387Array10066.length) {
			this.method5373(this.aClass387Array10066.length, 329510369);
		}
		if (var9 == null) {
			var9 = Class497.method6105(this.method5486(-2045673194), (byte) 16);
		}
		this.method5409(arg0, this.aClass387Array10066, var4, false, 1702265034);
		int var14;
		for (var14 = 0; var14 < this.aClass387Array10066.length; var14++) {
			if (this.aClass387Array10066[var14] != null) {
				if (this.aClass551_10251.aBoolean6357) {
					this.aClass387Array10066[var14].PA(this.anInt10266 * 1134855901 * 1294827893, this.anInt10264 * -1167628083 * 1723253765, this.anInt10265 * -1195730921 * -1769726041, this.anInt10255 * 1250140911 * -1363293169);
				}
				this.aClass387Array10066[var14].method4475(var4, this.aClass80Array8656[var14], 0);
			}
		}
		if (this.aClass388_10048 != null) {
			Class81 var15 = this.aClass388_10048.method4570();
			arg0.cm(var15);
		}
		for (var14 = 0; var14 < this.aClass387Array10066.length; var14++) {
			if (this.aClass387Array10066[var14] != null) {
				this.aBoolean10011 |= this.aClass387Array10066[var14].i();
			}
			this.aClass387Array10066[var14] = null;
		}
		this.anInt10010 = client.anInt9092 * -740803425 * 1833919797 * -381310781;
		return var9;
	}

	public void method5361(Class_ra arg0) {
		if (this.aClass551_10251 == null || !this.aBoolean10064 && !this.method5483(arg0, 0, (byte) 45)) {
			return;
		}
		Class247 var2 = arg0.cj();
		var2.method2454(this.method5355());
		var2.method2474(0.0F, -5.0F, 0.0F);
		this.method5409(arg0, this.aClass387Array10066, var2, this.aBoolean10064, -1589845729);
		for (int var3 = 0; var3 < this.aClass387Array10066.length; var3++) {
			this.aClass387Array10066[var3] = null;
		}
	}

	public final boolean method5482(byte arg0) {
		try {
			return this.aClass551_10251 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.hl(" + ')');
		}
	}

	public boolean method5390(Class_ra arg0, int arg1, int arg2) {
		if (this.aClass551_10251 == null || !this.method5483(arg0, 131072, (byte) 23)) {
			return false;
		}
		Class247 var4 = this.method5355();
		boolean var5 = false;
		int var6;
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			if (this.aClass387Array10066[var6] != null) {
				boolean var7;
				label57: {
					if (this.aClass551_10251.anInt6356 * 1282493907 * -1813147045 <= 0) {
						label56: {
							if (this.aClass551_10251.anInt6353 * 601162125 * -1468847803 == -1) {
								if (this.aClass551_10251.anInt6295 * -1943771105 * -510585889 == 1) {
									break label56;
								}
							} else if (this.aClass551_10251.anInt6353 * -1468847803 * 601162125 == 1) {
								break label56;
							}
							var7 = false;
							break label57;
						}
					}
					var7 = true;
				}
				boolean var9 = this.aClass387Array10066[var6].method4458(arg1, arg2, var4, var7, this.aClass551_10251.anInt6356 * -1813147045 * 1282493907);
				if (var9) {
					var5 = true;
					break;
				}
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

	public int method5414() {
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 123);
			if (var1 != null && -1461448351 * var1.anInt6299 * -1694477663 != -1) {
				return var1.anInt6299 * -1694477663 * -1461448351;
			}
		}
		return this.aClass551_10251.anInt6299 * -1461448351 * -1694477663 == -1 ? super.method5363(-1911269869) : this.aClass551_10251.anInt6299 * -1694477663 * -1461448351;
	}

	public int method5440() {
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 89);
			if (var1 != null && -1461448351 * var1.anInt6299 * -1694477663 != -1) {
				return var1.anInt6299 * -1694477663 * -1461448351;
			}
		}
		return this.aClass551_10251.anInt6299 * -1461448351 * -1694477663 == -1 ? super.method5363(-1789010117) : this.aClass551_10251.anInt6299 * -1694477663 * -1461448351;
	}

	public int method5446() {
		if (this.anInt10257 * 1164465883 * 423212371 != -1) {
			return this.anInt10257 * 423212371 * 1164465883;
		}
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 98);
			if (var1 != null && -1303151019 * var1.anInt6338 * 1288015613 != -1) {
				return var1.anInt6338 * 1288015613 * -1303151019;
			}
		}
		return this.aClass551_10251.anInt6338 * 1288015613 * -1303151019;
	}

	public int method5422() {
		if (this.anInt10257 * 1164465883 * 423212371 != -1) {
			return this.anInt10257 * 423212371 * 1164465883;
		}
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 7);
			if (var1 != null && -1303151019 * var1.anInt6338 * 1288015613 != -1) {
				return var1.anInt6338 * 1288015613 * -1303151019;
			}
		}
		return this.aClass551_10251.anInt6338 * 1288015613 * -1303151019;
	}

	public int method5447() {
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 43);
			if (var1 != null && var1.anInt6324 * 682471325 * -1339732299 != -1) {
				return var1.anInt6324 * 682471325 * -1339732299;
			}
		}
		return this.aClass551_10251.anInt6324 * 682471325 * -1339732299;
	}

	public int method5448() {
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 121);
			if (var1 != null && var1.anInt6324 * 682471325 * -1339732299 != -1) {
				return var1.anInt6324 * 682471325 * -1339732299;
			}
		}
		return this.aClass551_10251.anInt6324 * 682471325 * -1339732299;
	}

	public boolean method5483(Class_ra arg0, int arg1, byte arg2) {
		try {
			int var4 = arg1;
			Class364 var5 = this.method5436(1142603878);
			Class477 var6 = this.aClass477_10032.method5966(130027514) && !this.aClass477_10032.method5972(-776556553) ? this.aClass477_10032 : null;
			Class477_Sub3 var7 = this.aClass477_Sub3_10039.method5966(-1916993430) && (!this.aClass477_Sub3_10039.aBoolean8752 || var6 == null) ? this.aClass477_Sub3_10039 : null;
			int var8 = var5.anInt3832;
			int var9 = var5.anInt3844;
			if (var8 != 0 || var9 != 0 || var5.anInt3816 != 0 || var5.anInt3848 != 0) {
				arg1 |= 0x7;
			}
			boolean var10 = this.aByte10025 != 0 && client.anInt8981 >= this.anInt10041 && client.anInt8981 < this.anInt10042;
			if (var10) {
				arg1 |= 0x80000;
			}
			int var11 = this.aClass238_10053.method2370(1954034407);
			Class387 var12 = this.aClass387Array10066[0] = this.aClass551_10251.method6367(arg0, arg1, Class102.aClass362_924, Class158.aClass561_6474, var6, var7, this.aClass477_Sub2_Sub1Array10019, this.anIntArray10049, var11, this.aClass538_10254, this.method5424((byte) -32), false, -1355404431);
			if (var12 == null) {
				return false;
			}
			this.anInt10007 = var12.YA();
			var12.n();
			this.method5421(var12, -776036997);
			if (var8 == 0 && var9 == 0) {
				this.method5438(var11, this.method5453(-890018159) << 9, this.method5453(-1494009283) << 9, 0, 0, (byte) 17);
			} else {
				this.method5438(var11, var8, var9, var5.anInt3834, var5.anInt3837, (byte) 76);
				if (this.anInt10023 != 0) {
					this.aClass387Array10066[0].t(this.anInt10023);
				}
				if (this.anInt10035 != 0) {
					this.aClass387Array10066[0].EA(this.anInt10035);
				}
				if (this.anInt10046 != 0) {
					this.aClass387Array10066[0].ia(0, this.anInt10046, 0);
				}
			}
			if (var10) {
				var12.PA(this.aByte10043, this.aByte10044, this.aByte10063, this.aByte10025 & 0xFF);
			}
			this.method5449(arg0, var5, var4, var8, var9, var11, -711203220);
			return true;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "aho.hi(" + ')');
		}
	}

	public boolean method5444() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public Class260 method73(int arg0) {
		try {
			return Class260.method2548();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.i(" + ')');
		}
	}

	public boolean method5450() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public boolean method5451() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public Class244 method77() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public Class60 method5452() {
		return this.aClass60_10020 != null && this.aClass60_10020.aString556 == null ? null : this.aClass60_10020;
	}

	public Class60 method5457() {
		return this.aClass60_10020 != null && this.aClass60_10020.aString556 == null ? null : this.aClass60_10020;
	}

	public int method5456() {
		return this.anInt10008 * 662194221 * -1654044763 + 1;
	}

	public int method5428() {
		return this.anInt10008 * 662194221 * -1654044763 + 1;
	}

	public int method5484() {
		return this.aClass551_10251 == null ? 0 : this.aClass551_10251.anInt6356 * -1813147045 * 1282493907;
	}

	public boolean method5442() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public final void method5369(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public final void method5396(Class_ra arg0, Class432_Sub1 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	public int method5485() {
		return this.aClass551_10251 == null ? 0 : this.aClass551_10251.anInt6356 * -1813147045 * 1282493907;
	}

	public Class330_Sub28 method80() {
		Class381 var1 = client.aClass304_9030.method3022(-1159179877);
		return Class512.method6189(this.aByte8658, (int) this.method5346().aClass260_2606.aFloat2716 + var1.gameSceneBaseX * -1401159168 * 170770945, -((int) this.method5346().aClass260_2606.aFloat2715), (int) this.method5346().aClass260_2606.aFloat2711 + var1.gameSceneBaseY * 470868480 * -71518063, 2009420278);
	}

	public Class244 method71() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public Class244 method76() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public int method5435(int arg0) {
		try {
			if (this.aClass551_10251.anIntArray6326 != null) {
				Class551 var2 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 115);
				if (var2 != null && var2.anInt6324 != -1) {
					return var2.anInt6324;
				}
			}
			return this.aClass551_10251.anInt6324;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.cu(" + ')');
		}
	}

	public Class244 method83() {
		Class244 var1 = Class244.method2428();
		var1.method2420(Class257.method2541(this.aClass238_10053.anInt2581 * 1218629079 * 142833127), 0.0F, 0.0F);
		return var1;
	}

	public Class348 method5388(Class_ra arg0) {
		return null;
	}

	public boolean method5389(Class_ra arg0, int arg1, int arg2) {
		if (this.aClass551_10251 == null || !this.method5483(arg0, 131072, (byte) 39)) {
			return false;
		}
		Class247 var4 = this.method5355();
		boolean var5 = false;
		int var6;
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			if (this.aClass387Array10066[var6] != null) {
				boolean var7;
				label57: {
					if (this.aClass551_10251.anInt6356 * 1282493907 * -1813147045 <= 0) {
						label56: {
							if (this.aClass551_10251.anInt6353 * 601162125 * -1468847803 == -1) {
								if (this.aClass551_10251.anInt6295 * -1943771105 * -510585889 == 1) {
									break label56;
								}
							} else if (this.aClass551_10251.anInt6353 * -1468847803 * 601162125 == 1) {
								break label56;
							}
							var7 = false;
							break label57;
						}
					}
					var7 = true;
				}
				boolean var9 = this.aClass387Array10066[var6].method4458(arg1, arg2, var4, var7, this.aClass551_10251.anInt6356 * -1813147045 * 1282493907);
				if (var9) {
					var5 = true;
					break;
				}
			}
		}
		for (var6 = 0; var6 < this.aClass387Array10066.length; var6++) {
			this.aClass387Array10066[var6] = null;
		}
		return var5;
	}

	public boolean method5439() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public Class260 method82() {
		return Class260.method2548();
	}

	public final void method5387() {
		throw new IllegalStateException();
	}

	public final void method5393(int arg0) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.be(" + ')');
		}
	}

	public boolean method5486(int arg0) {
		try {
			return this.aClass551_10251.aBoolean6329;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.hf(" + ')');
		}
	}

	public Class260 method78() {
		return Class260.method2548();
	}

	public int method5424(byte arg0) {
		try {
			if (this.anInt10257 != -1) {
				return this.anInt10257;
			}
			if (this.aClass551_10251.anIntArray6326 != null) {
				Class551 var2 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 86);
				if (var2 != null && var2.anInt6338 != -1) {
					return var2.anInt6338;
				}
			}
			return this.aClass551_10251.anInt6338;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.cf(" + ')');
		}
	}

	public boolean method5441(byte arg0) {
		try {
			return Class396.aClass417_4108.aBoolean4288;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.cx(" + ')');
		}
	}

	public int method5455() {
		if (this.aClass551_10251.anIntArray6326 != null) {
			Class551 var1 = this.aClass551_10251.method6371(Class158.aClass561_6474, (byte) 115);
			if (var1 != null && var1.anInt6324 * 682471325 * -1339732299 != -1) {
				return var1.anInt6324 * 682471325 * -1339732299;
			}
		}
		return this.aClass551_10251.anInt6324 * 682471325 * -1339732299;
	}

	public Class260 method81() {
		return Class260.method2548();
	}

	public int method5487(int arg0, byte arg1) {
		try {
			return this.anIntArray10262[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aho.hc(" + ')');
		}
	}

	public static int method5488(int arg0) {
		try {
			Class549_Sub1 var1 = Class403.method4732(-469849646);
			Class345.method4012(var1, (short) 442);
			return var1.method6359((short) -24919);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aho.i(" + ')');
		}
	}

	public static final void method5489(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 12;
			Class513.method6194((byte) -41);
			Class258.method2545(987427245);
			Class513.anInt5964 = arg0.anIntArray4387[arg0.anInt4376];
			Class333.anInt3361 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class_na.anInt9724 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class452.anInt5560 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			Class513.anInt5965 = arg0.anIntArray4387[arg0.anInt4376 + 4];
			Class170.anInt1725 = arg0.anIntArray4387[arg0.anInt4376 + 5];
			Class486.anInt5825 = arg0.anIntArray4387[arg0.anInt4376 + 6];
			IndexTable.anInt2908 = arg0.anIntArray4387[arg0.anInt4376 + 7];
			Class484.anInt5808 = arg0.anIntArray4387[arg0.anInt4376 + 8];
			Class451.anInt6643 = arg0.anIntArray4387[arg0.anInt4376 + 9];
			Class171.anInt1727 = arg0.anIntArray4387[arg0.anInt4376 + 10];
			Class457.anInt6842 = arg0.anIntArray4387[arg0.anInt4376 + 11];
			Class540.aClass280_6249.method2750(Class513.anInt5965, -630136309);
			Class540.aClass280_6249.method2750(Class170.anInt1725, -530857321);
			Class540.aClass280_6249.method2750(Class486.anInt5825, -1477095284);
			Class540.aClass280_6249.method2750(IndexTable.anInt2908, 977885231);
			Class540.aClass280_6249.method2750(Class484.anInt5808, -746057900);
			Class540.aClass280_6249.method2750(Class457.anInt6842, 1877905592);
			Class484.aClass280_5822.method2750(Class457.anInt6842, 656599113);
			Class326.aClass61_3321 = null;
			Class150_Sub2.aClass61_7271 = null;
			Class291.aClass61_2980 = null;
			Class448.aClass61_5554 = null;
			Class146.aClass61_1614 = null;
			Class313.aClass61_6650 = null;
			Class99.aClass61_918 = null;
			Class330_Sub36_Sub12.aClass61_9714 = null;
			Class484.aBoolean5807 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aho.afl(" + ')');
		}
	}
}
