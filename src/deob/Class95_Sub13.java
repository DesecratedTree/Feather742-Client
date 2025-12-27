package deob;

public class Class95_Sub13 extends Class95 {

	public int anInt7178;

	public int anInt7179;

	public static int anInt7180;

	public static int anInt7181;

	public boolean method1142() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7179 * -1273520597 * -1077530493, 937821806);
		return var1.method5600(1970323974);
	}

	public boolean method1143() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7179 * -1273520597 * -1077530493, -627420196);
		return var1.method5600(1356117566);
	}

	public void method1095(int arg0) {
		try {
			Class88 var2 = Class96.aClass88Array855[this.anInt7178];
			Class147.method1744(var2.anInt725, var2.anInt727, var2.anInt729, var2.aClass476_726.anInt6901, var2.aClass476_726.anInt6882, var2.anInt730, this.anInt7179, -1888601790);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zm.j(" + ')');
		}
	}

	public Class95_Sub13(Buffer arg0) {
		super(arg0);
		this.anInt7178 = arg0.readUnsignedShort(979544814);
		this.anInt7179 = arg0.readBigSmart(-1752227383);
	}

	public void method1098() {
		Class88 var1 = Class96.aClass88Array855[this.anInt7178 * -1041051015 * -403245111];
		Class147.method1744(var1.anInt725 * -116947565 * 421093531, var1.anInt727 * -807907255 * 591176185, var1.anInt729 * 1710076125 * -1122588811, var1.aClass476_726.anInt6901 * -2015466917 * -130763309, var1.aClass476_726.anInt6882 * -266033331 * -344921723, var1.anInt730 * -761944079 * -1559336687, this.anInt7179 * -1273520597 * -1077530493, -1469013054);
	}

	public void method1099() {
		Class88 var1 = Class96.aClass88Array855[this.anInt7178 * -1041051015 * -403245111];
		Class147.method1744(var1.anInt725 * -116947565 * 421093531, var1.anInt727 * -807907255 * 591176185, var1.anInt729 * 1710076125 * -1122588811, var1.aClass476_726.anInt6901 * -2015466917 * -130763309, var1.aClass476_726.anInt6882 * -266033331 * -344921723, var1.anInt730 * -761944079 * -1559336687, this.anInt7179 * -1273520597 * -1077530493, -2022058328);
	}

	public void method1100() {
		Class88 var1 = Class96.aClass88Array855[this.anInt7178 * -1041051015 * -403245111];
		Class147.method1744(var1.anInt725 * -116947565 * 421093531, var1.anInt727 * -807907255 * 591176185, var1.anInt729 * 1710076125 * -1122588811, var1.aClass476_726.anInt6901 * -2015466917 * -130763309, var1.aClass476_726.anInt6882 * -266033331 * -344921723, var1.anInt730 * -761944079 * -1559336687, this.anInt7179 * -1273520597 * -1077530493, -1267266752);
	}

	public boolean method1144() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7179 * -1273520597 * -1077530493, 1353050092);
		return var1.method5600(736320696);
	}

	public boolean method1097(int arg0) {
		try {
			Class440 var2 = Class201.aClass436_6511.method5570(this.anInt7179, -1406900897);
			return var2.method5600(1574653534);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zm.p(" + ')');
		}
	}

	public static void method1145(Player arg0, byte arg1) {
		try {
			Class330_Sub20 var2 = (Class330_Sub20) Class330_Sub20.aClass497_7651.method6094((long) arg0.anInt10008);
			if (var2 != null) {
				if (var2.aClass330_Sub40_Sub3_7675 != null) {
					Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7675);
					var2.aClass330_Sub40_Sub3_7675 = null;
				}
				var2.method3252(-1805293750);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zm.f(" + ')');
		}
	}

	public static final boolean method1146(Class340[][][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			byte[][][] var6 = client.aClass304_9030.method2999(-580390108);
			byte var7 = arg4 ? 1 : (byte) (client.anInt9092 & 0xFF);
			if (var7 == var6[Class85.anInt712][arg2][arg3]) {
				return false;
			}
			Class281 var8 = client.aClass304_9030.method2995(1296490404);
			if ((var8.aByteArrayArrayArray2916[Class85.anInt712][arg2][arg3] & 0x4) == 0) {
				return false;
			}
			byte var9 = 0;
			int var10 = 0;
			client.anIntArray9065[var9] = arg2;
			int var27 = var9 + 1;
			client.anIntArray9050[var9] = arg3;
			var6[Class85.anInt712][arg2][arg3] = var7;
			while (var10 != var27) {
				int var11 = client.anIntArray9065[var10] & 0xFFFF;
				int var12 = client.anIntArray9065[var10] >> 16 & 0xFF;
				int var13 = client.anIntArray9065[var10] >> 24 & 0xFF;
				int var14 = client.anIntArray9050[var10] & 0xFFFF;
				int var15 = client.anIntArray9050[var10] >> 16 & 0xFF;
				var10 = var10 + 1 & 0xFFF;
				boolean var16 = false;
				if ((var8.aByteArrayArrayArray2916[Class85.anInt712][var11][var14] & 0x4) == 0) {
					var16 = true;
				}
				boolean var17 = false;
				int var18;
				int var19;
				int var20;
				if (arg0 != null) {
					label269: for (var18 = Class85.anInt712 + 1; var18 <= 3; var18++) {
						if (arg0[var18] == null) {
							if (arg5 != -1496633717) {
								throw new IllegalStateException();
							}
						} else if ((var8.aByteArrayArrayArray2916[var18][var11][var14] & 0x8) == 0) {
							Class432_Sub1_Sub1 var21;
							int var23;
							Class340 var28;
							Class352 var29;
							if (var16 && arg0[var18][var11][var14] != null) {
								if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3382 != null) {
									var19 = Class330_Sub40_Sub1.method3578(var12, -1509477333);
									if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3382.aShort9931 == var19) {
										continue;
									}
									if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383 != null && var19 == arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383.aShort9931) {
										if (arg5 != -1496633717) {
										}
										continue;
									}
									if (var13 != 0) {
										var20 = Class330_Sub40_Sub1.method3578(var13, -1509477333);
										if (var20 == arg0[var18][var11][var14].aClass432_Sub1_Sub5_3382.aShort9931) {
											continue;
										}
										if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383 != null && arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383.aShort9931 == var20) {
											if (arg5 != -1496633717) {
											}
											continue;
										}
									}
									if (var15 != 0) {
										var20 = Class330_Sub40_Sub1.method3578(var15, -1509477333);
										if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3382.aShort9931 == var20) {
											continue;
										}
										if (arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383 != null && arg0[var18][var11][var14].aClass432_Sub1_Sub5_3383.aShort9931 == var20) {
											if (arg5 != -1496633717) {
												throw new IllegalStateException();
											}
											continue;
										}
									}
								}
								var28 = arg0[var18][var11][var14];
								if (var28.aClass352_3388 != null) {
									for (var29 = var28.aClass352_3388; var29 != null; var29 = var29.aClass352_3483) {
										var21 = var29.aClass432_Sub1_Sub1_3484;
										if (var21 instanceof Interface2) {
											Interface2 var22 = (Interface2) var21;
											var23 = var22.method21(1020268653);
											int var24 = var22.method33((byte) -5);
											if (var23 == 21) {
												var23 = 19;
											}
											int var25 = var23 | var24 << 6;
											if (var25 == var12) {
												if (arg5 != -1496633717) {
													throw new IllegalStateException();
												}
												continue label269;
											}
											if (var13 != 0 && var25 == var13) {
												if (arg5 != -1496633717) {
													throw new IllegalStateException();
												}
												continue label269;
											}
											if (var15 != 0 && var15 == var25) {
												if (arg5 != -1496633717) {
												}
												continue label269;
											}
										}
									}
								}
							}
							var28 = arg0[var18][var11][var14];
							if (var28 != null && var28.aClass352_3388 != null) {
								for (var29 = var28.aClass352_3388; var29 != null; var29 = var29.aClass352_3483) {
									var21 = var29.aClass432_Sub1_Sub1_3484;
									if (var21.aShort9920 != var21.aShort9922 || var21.aShort9923 != var21.aShort9921) {
										for (int var30 = var21.aShort9922; var30 <= var21.aShort9920; var30++) {
											for (var23 = var21.aShort9921; var23 <= var21.aShort9923; var23++) {
												var6[var18][var30][var23] = var7;
											}
										}
									}
								}
							}
							var6[var18][var11][var14] = var7;
							var17 = true;
						}
					}
				}
				if (var17) {
					var18 = client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[Class85.anInt712 + 1].method6417(var11, var14, 280598206);
					if (client.anIntArray9108[arg1] < var18) {
						client.anIntArray9108[arg1] = var18;
					}
					var19 = var11 << 9;
					var20 = var14 << 9;
					if (client.anIntArray8973[arg1] > var19) {
						client.anIntArray8973[arg1] = var19;
					} else if (client.anIntArray8952[arg1] < var19) {
						client.anIntArray8952[arg1] = var19;
					}
					if (client.anIntArray9112[arg1] > var20) {
						client.anIntArray9112[arg1] = var20;
					} else if (client.anIntArray9169[arg1] < var20) {
						client.anIntArray9169[arg1] = var20;
					}
				}
				if (!var16) {
					if (var11 >= 1 && var6[Class85.anInt712][var11 - 1][var14] != var7) {
						client.anIntArray9065[var27] = var11 - 1 | 0x120000 | 0xD3000000;
						client.anIntArray9050[var27] = var14 | 0x130000;
						var27 = var27 + 1 & 0xFFF;
						var6[Class85.anInt712][var11 - 1][var14] = var7;
					}
					var14++;
					if (var14 < client.aClass304_9030.method3033((byte) -92)) {
						if (var11 - 1 >= 0 && var6[Class85.anInt712][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11][var14] & 0x4) == 0 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11 - 1][var14 - 1] & 0x4) == 0) {
							client.anIntArray9065[var27] = var11 - 1 | 0x120000 | 0x52000000;
							client.anIntArray9050[var27] = var14 | 0x130000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11 - 1][var14] = var7;
						}
						if (var6[Class85.anInt712][var11][var14] != var7) {
							client.anIntArray9065[var27] = var11 | 0x520000 | 0x13000000;
							client.anIntArray9050[var27] = var14 | 0x530000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11][var14] = var7;
						}
						if (var11 + 1 < client.aClass304_9030.method2990(-1486452349) && var7 != var6[Class85.anInt712][var11 + 1][var14] && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11][var14] & 0x4) == 0 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11 + 1][var14 - 1] & 0x4) == 0) {
							client.anIntArray9065[var27] = var11 + 1 | 0x520000 | 0x92000000;
							client.anIntArray9050[var27] = var14 | 0x530000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11 + 1][var14] = var7;
						}
					}
					var14--;
					if (var11 + 1 < client.aClass304_9030.method2990(-1834484623) && var6[Class85.anInt712][var11 + 1][var14] != var7) {
						client.anIntArray9065[var27] = var11 + 1 | 0x920000 | 0x53000000;
						client.anIntArray9050[var27] = var14 | 0x930000;
						var27 = var27 + 1 & 0xFFF;
						var6[Class85.anInt712][var11 + 1][var14] = var7;
					}
					var14--;
					if (var14 >= 0) {
						if (var11 - 1 >= 0 && var6[Class85.anInt712][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11][var14] & 0x4) == 0 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11 - 1][var14 + 1] & 0x4) == 0) {
							client.anIntArray9065[var27] = var11 - 1 | 0xD20000 | 0x12000000;
							client.anIntArray9050[var27] = var14 | 0xD30000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11 - 1][var14] = var7;
						}
						if (var7 != var6[Class85.anInt712][var11][var14]) {
							client.anIntArray9065[var27] = var11 | 0xD20000 | 0x93000000;
							client.anIntArray9050[var27] = var14 | 0xD30000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11][var14] = var7;
						}
						if (var11 + 1 < client.aClass304_9030.method2990(-1677778006) && var7 != var6[Class85.anInt712][var11 + 1][var14] && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11][var14] & 0x4) == 0 && (var8.aByteArrayArrayArray2916[Class85.anInt712][var11 + 1][var14 + 1] & 0x4) == 0) {
							client.anIntArray9065[var27] = var11 + 1 | 0x920000 | 0xD2000000;
							client.anIntArray9050[var27] = var14 | 0x930000;
							var27 = var27 + 1 & 0xFFF;
							var6[Class85.anInt712][var11 + 1][var14] = var7;
						}
					}
				} else if (arg5 != -1496633717) {
					throw new IllegalStateException();
				}
			}
			if (client.anIntArray9108[arg1] != -1000000) {
				client.anIntArray9108[arg1] += 40;
				client.anIntArray8973[arg1] -= 512;
				client.anIntArray8952[arg1] += 512;
				client.anIntArray9169[arg1] += 512;
				client.anIntArray9112[arg1] -= 512;
			}
			return true;
		} catch (RuntimeException var26) {
			throw Class476.method5964(var26, "zm.ix(" + ')');
		}
	}

	public static void method1147(Class348 arg0, int arg1, int arg2, int arg3, Class387 arg4, int arg5) {
		try {
			if (arg4 != null) {
				arg0.method4020(arg1, arg2, arg3, arg4.N(), arg4.RA(), arg4.ya(), arg4.YA(), arg4.o(), arg4.AA(), arg4.ha());
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "zm.ga(" + ')');
		}
	}
}
