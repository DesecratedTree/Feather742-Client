package deob;

public class Class330_Sub45 extends Class330 {

	public int anInt7836;

	public int anInt7835;

	public int anInt7840;

	public int anInt7841;

	public int anInt7838;

	public int anInt7839;

	public int anInt7834;

	public int anInt7837;

	public int anInt7842;

	public boolean method3732(int arg0, int arg1, byte arg2) {
		try {
			return arg0 >= this.anInt7835 && arg0 <= this.anInt7841 && arg1 >= this.anInt7840 && arg1 <= this.anInt7838;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "adz.r(" + ')');
		}
	}

	public boolean method3733(int arg0, int arg1, int arg2, int arg3) {
		try {
			return this.anInt7836 == arg0 && arg1 >= this.anInt7835 && arg1 <= this.anInt7841 && arg2 >= this.anInt7840 && arg2 <= this.anInt7838;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "adz.j(" + ')');
		}
	}

	public boolean method3734(int arg0, int arg1, byte arg2) {
		try {
			return arg0 >= this.anInt7839 && arg0 <= this.anInt7837 && arg1 >= this.anInt7834 && arg1 <= this.anInt7842;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "adz.i(" + ')');
		}
	}

	public void method3735(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			arg2[0] = this.anInt7836;
			arg2[1] = arg0 + (this.anInt7835 - this.anInt7839);
			arg2[2] = this.anInt7840 - this.anInt7834 + arg1;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "adz.p(" + ')');
		}
	}

	public void method3736(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			arg2[0] = 0;
			arg2[1] = this.anInt7839 - this.anInt7835 + arg0;
			arg2[2] = this.anInt7834 - this.anInt7840 + arg1;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "adz.o(" + ')');
		}
	}

	public Class330_Sub45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.anInt7836 = arg0;
		this.anInt7835 = arg1;
		this.anInt7840 = arg2;
		this.anInt7841 = arg3;
		this.anInt7838 = arg4;
		this.anInt7839 = arg5;
		this.anInt7834 = arg6;
		this.anInt7837 = arg7;
		this.anInt7842 = arg8;
	}

	public static boolean method3737(Class_ra arg0, int arg1, int arg2) {
		try {
			arg0.method4804();
			Class312.method3111((byte) 25);
			if (!arg0.method4790((byte) -2)) {
				return false;
			}
			int var3 = client.aClass304_9030.method2990(-1669415601);
			int var4 = client.aClass304_9030.method3033((byte) -108);
			Class281 var5 = client.aClass304_9030.method2995(1693038642);
			Class356 var6 = client.aClass304_9030.method3023(-400722441);
			int var7 = var3 / 2;
			byte var8 = 0;
			byte var9 = 0;
			boolean var10 = true;
			int var11;
			int var13;
			for (var11 = var8; var11 < var3 + var8; var11++) {
				for (int var12 = var9; var12 < var9 + var4; var12++) {
					for (var13 = arg1; var13 <= 3; var13++) {
						if (var5.method2786(arg1, var13, var11, var12, (byte) -46)) {
							int var14 = var13;
							if (var5.method2788(var11, var12, (byte) -4)) {
								var14 = var13 - 1;
							}
							if (var14 >= 0) {
								var10 &= Class108.method1349(var14, var11, var12, (byte) -10);
							}
						}
					}
				}
			}
			if (!var10) {
				return false;
			}
			var11 = var3 * 4 + 48 + 48;
			int[] var38 = new int[var11 * var11];
			for (var13 = 0; var13 < var38.length; var13++) {
				var38[var13] = -16777216;
			}
			Class76_Sub2 var39 = null;
			byte var40 = 0;
			byte var15 = 0;
			if (Class9.aBoolean139) {
				Class9.aClass61_152 = arg0.bn(var11, var11, false, true);
				var39 = arg0.ag();
				var39.method901(0, Class9.aClass61_152.method684());
				Interface8_Impl1_Impl1 var16 = arg0.ah(var11, var11);
				var39.method900(var16);
				arg0.method4785(var39, (byte) 1);
				var7 = var3;
				var40 = 48;
				var15 = 48;
				arg0.ba(1, 0);
			} else {
				Class9.aClass61_152 = arg0.method4795(var38, 0, var11, var11, var11, (byte) -65);
			}
			client.aClass304_9030.method3008(372460794).method4585((short) -28212);
			int var41 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
			int var17 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
			int var18 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
			boolean[][] var19 = new boolean[2 + 1 + var7][var7 + 2 + 1];
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			int var27;
			int var28;
			int var29;
			int var31;
			int var32;
			int var33;
			int var34;
			for (int var20 = var8; var20 < var8 + var3; var20 += var7) {
				for (var21 = var9; var21 < var4 + var9; var21 += var7) {
					var22 = var40;
					var23 = var15;
					var24 = var20;
					if (var20 > 0) {
						var24 = var20 - 1;
						var22 = var40 + 4;
					}
					var25 = var21;
					if (var21 > 0) {
						var25 = var21 - 1;
					}
					var26 = var7 + var20;
					if (var26 < var3) {
						var26++;
					}
					var27 = var21 + var7;
					if (var27 < var4) {
						var27++;
						var23 = var15 + 4;
					}
					if (Class9.aBoolean150) {
						arg0.L();
					} else {
						arg0.r(0, 0, var7 * 4 + var22, var7 * 4 + var23);
					}
					arg0.ba(3, -16777216);
					var28 = var7;
					if (var7 > var3 - 1) {
						var28 = var3 - 1;
					}
					int var30;
					for (var29 = arg1; var29 <= 3; var29++) {
						for (var30 = 0; var30 <= var28; var30++) {
							for (var31 = 0; var31 <= var28; var31++) {
								var19[var30][var31] = var5.method2786(arg1, var29, var24 + var30, var25 + var31, (byte) -102);
							}
						}
						var6.aClass_xaArray3701[var29].method6415(var40, var15, 1024, var24, var25, var26, var27, var19);
						if (!Class9.aBoolean149) {
							for (var30 = -4; var30 < var7; var30++) {
								for (var31 = -4; var31 < var7; var31++) {
									var32 = var30 + var20;
									var33 = var21 + var31;
									if (var32 >= var8 && var33 >= var9 && var5.method2786(arg1, var29, var32, var33, (byte) -75)) {
										var34 = var29;
										if (var5.method2788(var32, var33, (byte) 77)) {
											var34 = var29 - 1;
										}
										if (var34 >= 0) {
											Class200.method2160(arg0, var34, var32, var33, var30 * 4 + var22, var23 + (var7 - var31) * 4 - 4, var41, var17, 1030987439);
										}
									}
								}
							}
						}
					}
					if (Class9.aBoolean149) {
						Class307 var51 = client.aClass304_9030.method2996(arg1, 1875135057);
						for (var30 = 0; var30 < var7; var30++) {
							for (var31 = 0; var31 < var7; var31++) {
								var32 = var30 + var20;
								var33 = var31 + var21;
								var34 = var51.anIntArrayArray3166[var32 - var51.anInt3162][var33 - var51.anInt3163];
								if ((var34 & 0x40240000) != 0) {
									arg0.method4789(var22 + var30 * 4, var23 + (var7 - var31) * 4 - 4, 4, 4, -1713569622, 463754225);
								} else if ((var34 & 0x800000) != 0) {
									arg0.method4792(var22 + var30 * 4, (var7 - var31) * 4 + var23 - 4, 4, -1713569622, (short) 255);
								} else if ((var34 & 0x2000000) != 0) {
									arg0.method4801(var30 * 4 + 3 + var22, var23 + (var7 - var31) * 4 - 4, 4, -1713569622, 1324152480);
								} else if ((var34 & 0x8000000) != 0) {
									arg0.method4792(var30 * 4 + var22, var23 + (var7 - var31) * 4 - 4 + 3, 4, -1713569622, (short) 255);
								} else if ((var34 & 0x20000000) != 0) {
									arg0.method4801(var22 + var30 * 4, var23 + (var7 - var31) * 4 - 4, 4, -1713569622, -1530530100);
								}
							}
						}
					}
					arg0.B(var22, var23, var7 * 4, var7 * 4, var18, 2);
					arg0.method4804();
					if (!Class9.aBoolean139) {
						Class9.aClass61_152.method737((var20 - var8) * 4 + 48, var4 * 4 + 48 - (var21 - var9) * 4 - var7 * 4, var7 * 4, var7 * 4, var22, var23);
						if (Class9.aBoolean150) {
							Class9.aClass61_152.method687(256, 0);
							try {
								arg0.method4786(1260498047);
								Class464_Sub21.method5813(2000L);
							} catch (Exception var36) {
							}
						}
					}
				}
			}
			if (Class9.aBoolean139) {
				arg0.method4802(var39, (byte) 0);
				if (Class9.aBoolean150) {
					Class9.aClass61_152.method687(256, 0);
					try {
						arg0.method4786(-1145171009);
						Class464_Sub21.method5813(2000L);
					} catch (Exception var35) {
					}
				}
			}
			arg0.L();
			arg0.ba(1, 1);
			Class464.method5726(-1630563614);
			Class463 var42 = client.aClass304_9030.method3025((byte) 13);
			Class9.anInt142 = 0;
			Class9.aClass471_145.method5866(613065745);
			if (!Class9.aBoolean149) {
				for (var21 = var8; var21 < var3 + var8; var21++) {
					for (var22 = var9; var22 < var9 + var4; var22++) {
						for (var23 = arg1; var23 <= arg1 + 1 && var23 <= 3; var23++) {
							if (var5.method2786(arg1, var23, var21, var22, (byte) -13)) {
								Interface2 var44 = (Interface2) var6.method4177(var23, var21, var22, 1315717432);
								if (var44 == null) {
									var44 = (Interface2) var6.method4158(var23, var21, var22, client.anInterface19_9266, (byte) 17);
								}
								if (var44 == null) {
									var44 = (Interface2) var6.method4154(var23, var21, var22, -2040838155);
								}
								if (var44 == null) {
									var44 = (Interface2) var6.method4156(var23, var21, var22, -928440572);
								}
								if (var44 != null) {
									Class473 var46 = var42.method5705(var44.method34((short) -3029), (byte) -67);
									if (!var46.aBoolean5621 || client.aBoolean9123) {
										var26 = var46.anInt5651;
										if (var46.anIntArray5678 != null) {
											for (var27 = 0; var27 < var46.anIntArray5678.length; var27++) {
												if (var46.anIntArray5678[var27] != -1) {
													Class473 var48 = var42.method5705(var46.anIntArray5678[var27], (byte) -125);
													if (var48.anInt5651 >= 0) {
														var26 = var48.anInt5651;
													}
												}
											}
										}
										if (var26 >= 0) {
											boolean var47 = false;
											if (var26 >= 0) {
												Class372 var49 = Class79.aClass380_666.method4387(var26, (byte) -38);
												if (var49 != null && var49.aBoolean3885) {
													var47 = true;
												}
											}
											var28 = var21;
											var29 = var22;
											if (var47) {
												int[][] var52 = client.aClass304_9030.method2996(var23, 1875135057).anIntArrayArray3166;
												var31 = client.aClass304_9030.method2996(var23, 1875135057).anInt3162;
												var32 = client.aClass304_9030.method2996(var23, 1875135057).anInt3163;
												for (var33 = 0; var33 < 10; var33++) {
													var34 = (int) (Math.random() * 4.0D);
													if (var34 == 0 && var28 > var8 && var28 > var21 - 3 && (var52[var28 - 1 - var31][var29 - var32] & 0x2C0108) == 0) {
														var28--;
													}
													if (var34 == 1 && var28 < var8 + var3 - 1 && var28 < var21 + 3 && (var52[var28 + 1 - var31][var29 - var32] & 0x2C0180) == 0) {
														var28++;
													}
													if (var34 == 2 && var29 > var9 && var29 > var22 - 3 && (var52[var28 - var31][var29 - 1 - var32] & 0x2C0102) == 0) {
														var29--;
													}
													if (var34 == 3 && var29 < var9 + var4 - 1 && var29 < var22 + 3 && (var52[var28 - var31][var29 + 1 - var32] & 0x2C0120) == 0) {
														var29++;
													}
												}
											}
											Class9.anIntArray144[Class9.anInt142] = var46.anInt5657;
											Class9.anIntArray148[Class9.anInt142] = var28;
											Class9.anIntArray143[Class9.anInt142] = var29;
											Class9.anInt142++;
										}
									} else if (arg2 >= -1705516168) {
										throw new IllegalStateException();
									}
								}
							}
						}
					}
				}
				Class351 var43 = client.aClass304_9030.method3031((byte) -128);
				if (var43 != null) {
					Class79.aClass380_666.method4391(1024, 64, -1455679088);
					Class381 var45 = client.aClass304_9030.method3022(76581543);
					for (var23 = 0; var23 < var43.anInt3479; var23++) {
						var24 = var43.anIntArray3480[var23];
						if (var24 >> 28 == Class263_Sub2.myPlayer.aByte8658) {
							var25 = (var24 >> 14 & 0x3FFF) - var45.gameSceneBaseX;
							var26 = (var24 & 0x3FFF) - var45.gameSceneBaseY;
							if (var25 >= 0 && var25 < var3 && var26 >= 0 && var26 < var4) {
								Class9.aClass471_145.method5878(new Class330_Sub23(var23), (short) 8192);
							} else {
								Class372 var50 = Class79.aClass380_666.method4387(var43.anIntArray3481[var23], (byte) -76);
								if (var50.anIntArray3897 != null && var50.anInt3870 + var25 >= 0) {
									if (var25 + var50.anInt3898 >= var3) {
										if (arg2 >= -1705516168) {
										}
									} else if (var50.anInt3892 + var26 >= 0) {
										if (var26 + var50.anInt3899 < var4) {
											Class9.aClass471_145.method5878(new Class330_Sub23(var23), (short) 8192);
										} else if (arg2 >= -1705516168) {
										}
									}
								}
							}
						}
					}
					Class79.aClass380_666.method4391(128, 64, -1095042458);
				}
			}
			return true;
		} catch (RuntimeException var37) {
			throw Class476.method5964(var37, "adz.o(" + ')');
		}
	}

	public static final void method3738(Class430 arg0, int arg1) {
		try {
			float var2 = Class257.method2541(arg0.anIntArray4387[--arg0.anInt4376]);
			Class330_Sub36_Sub15_Sub1 var3 = new Class330_Sub36_Sub15_Sub1(Class401_Sub1.aClass145_Sub1_8249.method1728(1009977096), var2);
			Class401_Sub1.aClass145_Sub1_8249.method1702(var3, 1159059609);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9720;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "adz.aid(" + ')');
		}
	}
}
