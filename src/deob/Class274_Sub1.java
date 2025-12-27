package deob;

public class Class274_Sub1 extends Class274 {

	public static int anInt7400 = 2;

	public static int anInt7402 = 0;

	public static int anInt7403 = 1;

	public static int anInt7405 = 1;

	public static boolean aBoolean7410 = false;

	public static boolean aBoolean7401 = false;

	public static int[] anIntArray7406 = new int[] { 1, 0, -1, 0 };

	public static int[] anIntArray7404 = new int[] { 0, -1, 0, 1 };

	public static int[] anIntArray7408 = new int[] { 1, -1, -1, 1 };

	public static int[] anIntArray7412 = new int[] { -1, -1, 1, 1 };

	public int anInt7409 = 99;

	public Class463 aClass463_7407;

	public Class389 aClass389_7411;

	public static Class411 aClass411_7413;

	public Class274_Sub1(Class356 arg0, Class463 arg1, int arg2, int arg3, int arg4, boolean arg5, Class281 arg6, Class389 arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Class141.aClass418_1566, Class478.aClass499_5725, arg6);
		this.aClass463_7407 = arg1;
		this.aClass389_7411 = arg7;
	}

	public void method2706(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, Class307 arg5, int arg6) {
		try {
			Interface2 var8 = this.method2713(arg1, arg2, arg3, arg4, (byte) 81);
			if (var8 != null) {
				Class473 var9 = this.aClass463_7407.method5705(var8.method34((short) -3423), (byte) -111);
				int var10 = var8.method21(1020268653);
				int var11 = var8.method33((byte) -84);
				if (var9.method5907(169244819)) {
					Class250.method2521(arg1, arg3, arg4, var9, 535906678);
				}
				if (var8.method31(1268217323)) {
					var8.method26(arg0, -1090516231);
				}
				if (arg2 == 0) {
					this.aClass356_2767.method4175(arg1, arg3, arg4, -313230374);
					this.aClass356_2767.method4147(arg1, arg3, arg4, (byte) -80);
					if (var9.anInt5635 != 0) {
						arg5.method3057(arg3, arg4, var10, var11, var9.aBoolean5636, !var9.aBoolean5668, -1836235908);
					}
					if (var9.anInt5641 == 1) {
						if (var11 == 0) {
							this.aClass356_2767.aClass358_3649.method4217(1, arg1, arg3, arg4);
						} else if (var11 == 1) {
							this.aClass356_2767.aClass358_3649.method4217(2, arg1, arg3, arg4 + 1);
						} else if (var11 == 2) {
							this.aClass356_2767.aClass358_3649.method4217(1, arg1, arg3 + 1, arg4);
						} else if (var11 == 3) {
							this.aClass356_2767.aClass358_3649.method4217(2, arg1, arg3, arg4);
						}
					}
				} else if (arg2 == 1) {
					this.aClass356_2767.method4148(arg1, arg3, arg4, (byte) 83);
					this.aClass356_2767.method4149(arg1, arg3, arg4, 67881025);
				} else if (arg2 == 2) {
					this.aClass356_2767.method4181(arg1, arg3, arg4, client.anInterface19_9266, (byte) 60);
					if (var9.anInt5635 != 0 && var9.anInt5674 + arg3 < this.anInt2770 && var9.anInt5674 + arg4 < this.anInt2776 && var9.anInt5680 + arg3 < this.anInt2770 && arg4 + var9.anInt5680 < this.anInt2776) {
						arg5.method3062(arg3, arg4, var9.anInt5674, var9.anInt5680, var11, var9.aBoolean5636, !var9.aBoolean5668, (short) 12281);
					}
					if (var10 == Class476.aClass476_6902.anInt6882) {
						if ((var11 & 0x1) == 0) {
							this.aClass356_2767.aClass358_3649.method4217(8, arg1, arg3, arg4);
						} else {
							this.aClass356_2767.aClass358_3649.method4217(16, arg1, arg3, arg4);
						}
					}
				} else if (arg2 == 3) {
					this.aClass356_2767.method4150(arg1, arg3, arg4, -114690229);
					if (var9.anInt5635 == 1) {
						arg5.method3068(arg3, arg4, -362549354);
					}
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "abb.cn(" + ')');
		}
	}

	public final void method2707(Class_ra arg0, Buffer arg1, int arg2, int arg3, byte arg4) {
		try {
			if (!this.aBoolean2777) {
				boolean var6 = false;
				Class394 var7 = null;
				while (true) {
					int var8;
					int var9;
					int var11;
					int var12;
					int var18;
					while (arg1.offset < arg1.payload.length) {
						var8 = arg1.readUnsignedByte(1594183149);
						if (var8 != 0) {
							int var13;
							int var14;
							int var15;
							if (var8 == 1) {
								var9 = arg1.readUnsignedByte(1109076957);
								if (var9 > 0) {
									for (var18 = 0; var18 < var9; var18++) {
										Class349 var20 = new Class349(arg0, this.aClass356_2767.anInt3641, arg1, 2);
										if (var20.anInt3472 == 31) {
											Class512 var21 = Class233.aClass519_2467.method6217(arg1.readUnsignedShort(-107253215), (byte) 0);
											var20.method4022(var21.anInt5959, var21.anInt5956, var21.anInt5958, var21.anInt5957, -1019406119);
										}
										if (arg0.cr() > 0) {
											Class330_Sub14 var22 = var20.aClass330_Sub14_3467;
											var13 = var22.method3318(2110977511) + (arg2 << 9);
											var14 = var22.method3312((short) -3777) + (arg3 << 9);
											var15 = var13 >> 9;
											int var16 = var14 >> 9;
											if (var15 >= 0 && var16 >= 0 && var15 < this.anInt2770 && var16 < this.anInt2776) {
												var22.method3315(var13, this.anIntArrayArrayArray2793[var20.anInt3470][var15][var16] - var22.method3311((byte) 54), var14, (byte) 7);
												this.aClass356_2767.method4170(var20, 589444029);
											}
										}
									}
								}
							} else if (var8 == 2) {
								if (var7 == null) {
									var7 = new Class394();
								}
								var7.method4622(arg1, 305130712);
							} else if (var8 == 128) {
								if (var7 == null) {
									var7 = new Class394();
								}
								var7.method4623(arg1, this.aClass389_7411, (byte) -90);
							} else if (var8 == 129) {
								if (this.aByteArrayArrayArray2824 == null) {
									this.aByteArrayArrayArray2824 = new byte[4][][];
								}
								for (var9 = 0; var9 < 4; var9++) {
									byte var10 = arg1.readByte((byte) -40);
									if (var10 == 0 && this.aByteArrayArrayArray2824[var9] != null) {
										var11 = arg2;
										var12 = arg2 + 64;
										var13 = arg3;
										var14 = arg3 + 64;
										if (arg2 < 0) {
											var11 = 0;
										} else if (arg2 >= this.anInt2770) {
											var11 = this.anInt2770;
										}
										if (var12 < 0) {
											var12 = 0;
										} else if (var12 >= this.anInt2770) {
											var12 = this.anInt2770;
										}
										if (arg3 < 0) {
											var13 = 0;
										} else if (arg3 >= this.anInt2776) {
											var13 = this.anInt2776;
										}
										if (var14 < 0) {
											var14 = 0;
										} else if (var14 >= this.anInt2776) {
											var14 = this.anInt2776;
										}
										while (var11 < var12) {
											while (var13 < var14) {
												this.aByteArrayArrayArray2824[var9][var11][var13] = 0;
												var13++;
											}
											var11++;
										}
									} else if (var10 == 1) {
										if (this.aByteArrayArrayArray2824[var9] == null) {
											this.aByteArrayArrayArray2824[var9] = new byte[this.anInt2770 + 1][this.anInt2776 + 1];
										}
										for (var11 = 0; var11 < 64; var11 += 4) {
											for (var12 = 0; var12 < 64; var12 += 4) {
												byte var19 = arg1.readByte((byte) -97);
												for (var14 = arg2 + var11; var14 < arg2 + var11 + 4; var14++) {
													for (var15 = var12 + arg3; var15 < arg3 + var12 + 4; var15++) {
														if (var14 >= 0 && var14 < this.anInt2770 && var15 >= 0 && var15 < this.anInt2776) {
															this.aByteArrayArrayArray2824[var9][var14][var15] = var19;
														}
													}
												}
											}
										}
									} else if (var10 == 2) {
										if (this.aByteArrayArrayArray2824[var9] == null) {
											this.aByteArrayArrayArray2824[var9] = new byte[this.anInt2770 + 1][this.anInt2776 + 1];
										}
										if (var9 > 0) {
											var11 = arg2;
											var12 = arg2 + 64;
											var13 = arg3;
											var14 = arg3 + 64;
											if (arg2 < 0) {
												var11 = 0;
											} else if (arg2 >= this.anInt2770) {
												var11 = this.anInt2770;
											}
											if (var12 < 0) {
												var12 = 0;
											} else if (var12 >= this.anInt2770) {
												var12 = this.anInt2770;
											}
											if (arg3 < 0) {
												var13 = 0;
											} else if (arg3 >= this.anInt2776) {
												var13 = this.anInt2776;
											}
											if (var14 < 0) {
												var14 = 0;
											} else if (var14 >= this.anInt2776) {
												var14 = this.anInt2776;
											}
											while (var11 < var12) {
												while (var13 < var14) {
													this.aByteArrayArrayArray2824[var9][var11][var13] = this.aByteArrayArrayArray2824[var9 - 1][var11][var13];
													var13++;
												}
												var11++;
											}
										}
									}
								}
								var6 = true;
							} else {
								throw new IllegalStateException("");
							}
						} else if (var7 == null) {
							var7 = new Class394(arg1, this.aClass389_7411);
						} else {
							var7.method4621(arg1, this.aClass389_7411, -1282592518);
						}
					}
					if (var7 != null) {
						for (var8 = 0; var8 < 8; var8++) {
							for (var9 = 0; var9 < 8; var9++) {
								var18 = (arg2 >> 3) + var8;
								var11 = (arg3 >> 3) + var9;
								if (var18 >= 0 && var18 < this.anInt2770 >> 3 && var11 >= 0 && var11 < this.anInt2776 >> 3) {
									this.aClass389_7411.method4586(var18, var11, var7, (byte) 0);
								}
							}
						}
					}
					if (!var6 && this.aByteArrayArrayArray2824 != null) {
						for (var8 = 0; var8 < 4; var8++) {
							if (this.aByteArrayArrayArray2824[var8] != null) {
								for (var9 = 0; var9 < 16; var9++) {
									for (var18 = 0; var18 < 16; var18++) {
										var11 = var9 + (arg2 >> 2);
										var12 = (arg3 >> 2) + var18;
										if (var11 >= 0 && var11 < 26 && var12 >= 0 && var12 < 26) {
											this.aByteArrayArrayArray2824[var8][var11][var12] = 0;
										}
									}
								}
							}
						}
					}
					break;
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "abb.bb(" + ')');
		}
	}

	public final void method2708(Class_ra arg0, Buffer arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			if (!this.aBoolean2777) {
				boolean var11 = false;
				Class394 var12 = null;
				int var13 = (arg6 & 0x7) * 8;
				int var14 = (arg7 & 0x7) * 8;
				while (true) {
					int var15;
					int var16;
					int var18;
					int var26;
					while (arg1.offset < arg1.payload.length) {
						var15 = arg1.readUnsignedByte(204604354);
						if (var15 != 0) {
							int var21;
							int var22;
							int var23;
							int var28;
							if (var15 == 1) {
								var16 = arg1.readUnsignedByte(1379010698);
								if (var16 > 0) {
									for (var26 = 0; var26 < var16; var26++) {
										Class349 var27 = new Class349(arg0, this.aClass356_2767.anInt3641, arg1, 2);
										if (var27.anInt3472 == 31) {
											Class512 var29 = Class233.aClass519_2467.method6217(arg1.readUnsignedShort(-414035857), (byte) 0);
											var27.method4022(var29.anInt5959, var29.anInt5956, var29.anInt5958, var29.anInt5957, 1869280719);
										}
										if (arg0.cr() > 0) {
											Class330_Sub14 var30 = var27.aClass330_Sub14_3467;
											var28 = var30.method3318(417063984) >> 9;
											var21 = var30.method3312((short) -10437) >> 9;
											if (var27.anInt3470 == arg5 && var28 >= var13 && var28 < var13 + 8 && var21 >= var14 && var21 < var14 + 8) {
												var22 = (arg3 << 9) + Class168.method2027(var30.method3318(-2075921429) & 0xFFF, var30.method3312((short) 11988) & 0xFFF, arg8, -1291791072);
												var23 = (arg4 << 9) + Class134.method1573(var30.method3318(-1105776869) & 0xFFF, var30.method3312((short) 2688) & 0xFFF, arg8, 1500917129);
												var28 = var22 >> 9;
												var21 = var23 >> 9;
												if (var28 >= 0 && var21 >= 0 && var28 < this.anInt2770 && var21 < this.anInt2776) {
													var30.method3315(var22, this.anIntArrayArrayArray2793[arg5][var28][var21] - var30.method3311((byte) 5), var23, (byte) 7);
													this.aClass356_2767.method4170(var27, 463740307);
												}
											}
										}
									}
								}
							} else if (var15 == 2) {
								if (var12 == null) {
									var12 = new Class394();
								}
								var12.method4622(arg1, 894280959);
							} else if (var15 == 128) {
								if (var12 == null) {
									var12 = new Class394();
								}
								var12.method4623(arg1, this.aClass389_7411, (byte) -4);
							} else if (var15 == 129) {
								if (this.aByteArrayArrayArray2824 == null) {
									this.aByteArrayArrayArray2824 = new byte[4][][];
								}
								for (var16 = 0; var16 < 4; var16++) {
									byte var17 = arg1.readByte((byte) 49);
									int var19;
									if (var17 == 0 && this.aByteArrayArrayArray2824[arg2] != null) {
										if (var16 <= arg5) {
											var18 = arg3;
											var19 = arg3 + 7;
											var28 = arg4;
											var21 = arg4 + 7;
											if (arg3 < 0) {
												var18 = 0;
											} else if (arg3 >= this.anInt2770) {
												var18 = this.anInt2770;
											}
											if (var19 < 0) {
												var19 = 0;
											} else if (var19 >= this.anInt2770) {
												var19 = this.anInt2770;
											}
											if (arg4 < 0) {
												var28 = 0;
											} else if (arg4 >= this.anInt2776) {
												var28 = this.anInt2776;
											}
											if (var21 < 0) {
												var21 = 0;
											} else if (var21 >= this.anInt2776) {
												var21 = this.anInt2776;
											}
											while (var18 < var19) {
												while (var28 < var21) {
													this.aByteArrayArrayArray2824[arg2][var18][var28] = 0;
													var28++;
												}
												var18++;
											}
										}
									} else if (var17 == 1) {
										if (this.aByteArrayArrayArray2824[arg2] == null) {
											this.aByteArrayArrayArray2824[arg2] = new byte[this.anInt2770 + 1][this.anInt2776 + 1];
										}
										for (var18 = 0; var18 < 64; var18 += 4) {
											for (var19 = 0; var19 < 64; var19 += 4) {
												byte var20 = arg1.readByte((byte) -30);
												if (var16 <= arg5) {
													for (var21 = var18; var21 < var18 + 4; var21++) {
														for (var22 = var19; var22 < var19 + 4; var22++) {
															if (var21 >= var13 && var21 < var13 + 8 && var22 >= var14 && var22 < var14 + 8) {
																var23 = arg3 + Class142.method1649(var21 & 0x7, var22 & 0x7, arg8, -1436891375);
																int var24 = arg4 + Class100.method1211(var21 & 0x7, var22 & 0x7, arg8, (byte) -115);
																if (var23 >= 0 && var23 < this.anInt2770 && var24 >= 0 && var24 < this.anInt2776) {
																	this.aByteArrayArrayArray2824[arg2][var23][var24] = var20;
																	var11 = true;
																}
															}
														}
													}
												}
											}
										}
									} else if (var17 == 2) {
									}
								}
							} else {
								throw new IllegalStateException("");
							}
						} else if (var12 == null) {
							var12 = new Class394(arg1, this.aClass389_7411);
						} else {
							var12.method4621(arg1, this.aClass389_7411, 296572065);
						}
					}
					if (var12 != null) {
						this.aClass389_7411.method4586(arg3 >> 3, arg4 >> 3, var12, (byte) 0);
					}
					if (!var11 && this.aByteArrayArrayArray2824 != null && this.aByteArrayArrayArray2824[arg2] != null) {
						var15 = arg3 + 7;
						var16 = arg4 + 7;
						for (var26 = arg3; var26 < var15; var26++) {
							for (var18 = arg4; var18 < var16; var18++) {
								this.aByteArrayArrayArray2824[arg2][var26][var18] = 0;
							}
						}
					}
					break;
				}
			}
		} catch (RuntimeException var25) {
			throw Class476.method5964(var25, "abb.ch(" + ')');
		}
	}

	public final void method2709(Class_ra arg0, byte[] arg1, int arg2, int arg3, Class307[] arg4, int arg5) {
		try {
			Buffer var7 = new Buffer(arg1);
			int var8 = -1;
			do {
				int var9 = var7.method3767(1558443671);
				if (var9 == 0) {
					if (arg5 <= -1465543556) {
					}
					return;
				}
				var8 += var9;
				int var10 = 0;
				while (true) {
					int var11 = var7.readSmart(-1923126169);
					if (var11 == 0) {
						break;
					}
					var10 += var11 - 1;
					int var12 = var10 & 0x3F;
					int var13 = var10 >> 6 & 0x3F;
					int var14 = var10 >> 12;
					int var15 = var7.readUnsignedByte(1984479636);
					int var16 = var15 >> 2;
					int var17 = var15 & 0x3;
					int var18 = var13 + arg2;
					int var19 = var12 + arg3;
					if (var18 > 0 && var19 > 0 && var18 < this.anInt2770 - 1 && var19 < this.anInt2776 - 1) {
						Class307 var20 = null;
						if (!this.aBoolean2777) {
							int var21 = var14;
							if ((this.aClass281_2811.aByteArrayArrayArray2916[1][var18][var19] & 0x2) == 2) {
								var21 = var14 - 1;
							}
							if (var21 >= 0) {
								var20 = arg4[var21];
							}
						}
						this.method2711(arg0, var14, var14, var18, var19, var8, var17, var16, var20, -1, -2116256852);
					}
				}
			} while (arg5 > -1465543556);
			throw new IllegalStateException();
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "abb.cj(" + ')');
		}
	}

	public final void method2710(Class_ra arg0, boolean arg1, byte arg2) {
		try {
			this.aClass356_2767.method4162();
			if (!arg1) {
				int var4;
				int var5;
				if (this.anInt2774 > 1) {
					for (var4 = 0; var4 < this.anInt2770; var4++) {
						for (var5 = 0; var5 < this.anInt2776; var5++) {
							if ((this.aClass281_2811.aByteArrayArrayArray2916[1][var4][var5] & 0x2) == 2) {
								this.aClass356_2767.method4182(var4, var5, 1238624321);
							}
						}
					}
				}
				for (var4 = 0; var4 < this.anInt2774; var4++) {
					for (var5 = 0; var5 <= this.anInt2776; var5++) {
						for (int var6 = 0; var6 <= this.anInt2770; var6++) {
							if ((this.aByteArrayArrayArray2785[var4][var6][var5] & 0x4) != 0) {
								int var7 = var6;
								int var8 = var6;
								int var9 = var5;
								int var10 = var5;
								while (var9 > 0 && (this.aByteArrayArrayArray2785[var4][var6][var9 - 1] & 0x4) != 0 && var10 - var9 < 10) {
									var9--;
								}
								while (var10 < this.anInt2776 && (this.aByteArrayArrayArray2785[var4][var6][var10 + 1] & 0x4) != 0 && var10 - var9 < 10) {
									var10++;
								}
								int var11;
								label117: while (var7 > 0 && var8 - var7 < 10) {
									for (var11 = var9; var11 <= var10; var11++) {
										if ((this.aByteArrayArrayArray2785[var4][var7 - 1][var11] & 0x4) == 0) {
											if (arg2 != 0) {
											}
											break label117;
										}
									}
									var7--;
								}
								label104: while (var8 < this.anInt2770 && var8 - var7 < 10) {
									for (var11 = var9; var11 <= var10; var11++) {
										if ((this.aByteArrayArrayArray2785[var4][var8 + 1][var11] & 0x4) == 0) {
											if (arg2 != 0) {
												throw new IllegalStateException();
											}
											break label104;
										}
									}
									var8++;
								}
								if ((var8 - var7 + 1) * ((var10 - var9) + 1) >= 4) {
									var11 = this.anIntArrayArrayArray2793[var4][var7][var9];
									this.aClass356_2767.aClass358_3649.method4226(4, var4, var7 << 9, (var8 << 9) + 512, var9 << 9, (var10 << 9) + 512, var11, var11);
									for (int var12 = var7; var12 <= var8; var12++) {
										for (int var13 = var9; var13 <= var10; var13++) {
											this.aByteArrayArrayArray2785[var4][var12][var13] &= 0xFFFFFFFB;
										}
									}
								}
							}
						}
					}
				}
				this.aClass356_2767.aClass358_3649.method4218();
			}
			this.aByteArrayArrayArray2785 = null;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "abb.cm(" + ')');
		}
	}

	public final void method2711(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Class307 arg8, int arg9, int arg10) {
		try {
			if (arg2 < this.anInt7409) {
				this.anInt7409 = arg2;
			}
			Class473 var12 = this.aClass463_7407.method5705(arg5, (byte) -89);
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1116574347) != 0 || !var12.aBoolean5690) {
				int var13;
				int var14;
				if (arg6 == 1 || arg6 == 3) {
					var13 = var12.anInt5680;
					var14 = var12.anInt5674;
				} else {
					var13 = var12.anInt5674;
					var14 = var12.anInt5680;
				}
				int var15;
				int var16;
				if (var13 + arg3 <= this.anInt2770) {
					var15 = (var13 >> 1) + arg3;
					var16 = arg3 + (var13 + 1 >> 1);
				} else {
					var15 = arg3;
					var16 = arg3 + 1;
				}
				int var17;
				int var18;
				if (var14 + arg4 <= this.anInt2776) {
					var17 = arg4 + (var14 >> 1);
					var18 = arg4 + (var14 + 1 >> 1);
				} else {
					var17 = arg4;
					var18 = arg4 + 1;
				}
				Class_xa var19 = this.aClass356_2767.aClass_xaArray3676[arg1];
				int var20 = var19.method6417(var15, var17, -928240312) + var19.method6417(var16, var17, 1838614218) + var19.method6417(var15, var18, -1827714293) + var19.method6417(var16, var18, -129823424) >> 2;
				int var21 = (arg3 << 9) + (var13 << 8);
				int var22 = (arg4 << 9) + (var14 << 8);
				boolean var23 = this.aBoolean2780 && !this.aBoolean2777 && var12.aBoolean5647;
				if (var12.method5907(1145498232)) {
					Class_ra.method4809(arg2, arg3, arg4, arg6, var12, null, null, -1229578866);
				}
				boolean var24 = arg9 == -1 && !var12.method5904((byte) -38) && var12.anIntArray5678 == null && !var12.aBoolean5688 && !var12.aBoolean5692;
				if (!aBoolean7410 || (!Class262.method2593(arg7, -848197694) || var12.anInt5641 == 1) && (!Class141.method1648(arg7, -684657474) || var12.anInt5641 != 0)) {
					if (arg7 == Class476.aClass476_6900.anInt6882) {
						if (Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) != 0 || var12.anInt5637 != 0 || var12.anInt5635 == 1 || var12.aBoolean5667) {
							Class432_Sub1_Sub4 var25;
							if (var24) {
								Class432_Sub1_Sub4_Sub2 var26 = new Class432_Sub1_Sub4_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg6, var23);
								if (var26.method31(1211534700)) {
									var26.method25(arg0, 843961968);
								}
								var25 = var26;
							} else {
								var25 = new Class432_Sub1_Sub4_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg6, arg9);
							}
							this.aClass356_2767.method4142(arg2, arg3, arg4, var25, (byte) 109);
							if (var12.anInt5635 == 1 && arg8 != null) {
								arg8.method3060(arg3, arg4, 1303500119);
							}
						}
					} else if (Class476.aClass476_6898.anInt6882 == arg7 || arg7 == Class476.aClass476_6878.anInt6882) {
						Class432_Sub1_Sub1_Sub6 var31 = null;
						int var27;
						Class432_Sub1_Sub1 var32;
						if (var24) {
							Class432_Sub1_Sub1_Sub6 var28 = new Class432_Sub1_Sub1_Sub6(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg3, var13 + arg3 - 1, arg4, var14 + arg4 - 1, arg7, arg6, var23);
							var27 = var28.method5512(-1238563174);
							var32 = var28;
							var31 = var28;
						} else {
							var32 = new Class432_Sub1_Sub1_Sub5(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg3, arg3 + var13 - 1, arg4, arg4 + var14 - 1, arg7, arg6, arg9);
							var27 = 15;
						}
						if (this.aClass356_2767.method4145(var32, false, -936218714)) {
							if (var31 != null && var31.method31(1009538210)) {
								var31.method25(arg0, 843961968);
							}
							if (var12.aBoolean5669 && this.aBoolean2780) {
								if (var27 > 30) {
									var27 = 30;
								}
								for (int var35 = 0; var35 <= var13; var35++) {
									for (int var29 = 0; var29 <= var14; var29++) {
										var19.LA(var35 + arg3, var29 + arg4, var27);
									}
								}
							}
						}
						if (var12.anInt5635 != 0 && arg8 != null) {
							arg8.method3058(arg3, arg4, var13, var14, var12.aBoolean5636, !var12.aBoolean5668, 1048177648);
						}
					} else if (Class141.method1648(arg7, -51382735) || Class282.method2813(arg7, 807610786)) {
						Class432_Sub1_Sub1 var33;
						if (var24) {
							Class432_Sub1_Sub1_Sub6 var34 = new Class432_Sub1_Sub1_Sub6(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg3, arg3 + var13 - 1, arg4, var14 + arg4 - 1, arg7, arg6, var23);
							if (var34.method31(745790932)) {
								var34.method25(arg0, 843961968);
							}
							var33 = var34;
						} else {
							var33 = new Class432_Sub1_Sub1_Sub5(this.aClass356_2767, arg0, this.aClass463_7407, var12, arg2, arg1, var21, var20, var22, this.aBoolean2777, arg3, var13 + arg3 - 1, arg4, var14 + arg4 - 1, arg7, arg6, arg9);
						}
						this.aClass356_2767.method4145(var33, false, -80772243);
						if (this.aBoolean2780 && !this.aBoolean2777 && Class141.method1648(arg7, -580897730) && arg7 != Class476.aClass476_6889.anInt6882 && arg2 > 0 && var12.anInt5641 != 0) {
							this.aByteArrayArrayArray2785[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray2785[arg2][arg3][arg4] | 0x4);
						}
						if (var12.anInt5635 != 0 && arg8 != null) {
							arg8.method3058(arg3, arg4, var13, var14, var12.aBoolean5636, !var12.aBoolean5668, 291536074);
						}
					} else if (!this.method2715(arg0, arg7, arg6, var24, var12, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, var23, var19, arg8, var13, var14, 923167251) && this.method2714(arg0, arg7, arg6, var24, var12, arg9, arg2, arg1, var21, var20, var22, arg3, arg4, (byte) -84)) {
					}
				}
			}
		} catch (RuntimeException var30) {
			throw Class476.method5964(var30, "abb.cb(" + ')');
		}
	}

	public final void method2712(Class_ra arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Class307[] arg9, int arg10) {
		try {
			Buffer var12 = new Buffer(arg1);
			int var13 = -1;
			while (true) {
				int var14 = var12.method3767(1558443671);
				if (var14 == 0) {
					if (arg10 == 116560950) {
						throw new IllegalStateException();
					}
					return;
				}
				var13 += var14;
				int var15 = 0;
				while (true) {
					int var16 = var12.readSmart(-48285498);
					if (var16 == 0) {
						if (arg10 == 116560950) {
						}
						break;
					}
					var15 += var16 - 1;
					int var17 = var15 & 0x3F;
					int var18 = var15 >> 6 & 0x3F;
					int var19 = var15 >> 12;
					int var20 = var12.readUnsignedByte(2094041054);
					int var21 = var20 >> 2;
					int var22 = var20 & 0x3;
					if (arg5 == var19 && var18 >= arg6 && var18 < arg6 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
						Class473 var23 = this.aClass463_7407.method5705(var13, (byte) 3);
						int var24 = arg3 + Class132.method1569(var18 & 0x7, var17 & 0x7, arg8, var23.anInt5674, var23.anInt5680, var22, (byte) 0);
						int var25 = arg4 + Class467.method5858(var18 & 0x7, var17 & 0x7, arg8, var23.anInt5674, var23.anInt5680, var22, -645347990);
						if (var24 > 0 && var25 > 0 && var24 < this.anInt2770 - 1 && var25 < this.anInt2776 - 1) {
							Class307 var26 = null;
							if (!this.aBoolean2777) {
								int var27 = arg2;
								if ((this.aClass281_2811.aByteArrayArrayArray2916[1][var24][var25] & 0x2) == 2) {
									var27 = arg2 - 1;
								}
								if (var27 >= 0) {
									var26 = arg9[var27];
								}
							}
							this.method2711(arg0, arg2, arg2, var24, var25, var13, arg8 + var22 & 0x3, var21, var26, -1, -220306150);
						}
					}
				}
			}
		} catch (RuntimeException var28) {
			throw Class476.method5964(var28, "abb.cy(" + ')');
		}
	}

	public Interface2 method2713(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			Interface2 var6 = null;
			if (arg1 == 0) {
				var6 = (Interface2) this.aClass356_2767.method4154(arg0, arg2, arg3, -2040838155);
			}
			if (arg1 == 1) {
				var6 = (Interface2) this.aClass356_2767.method4156(arg0, arg2, arg3, 588582562);
			}
			if (arg1 == 2) {
				var6 = (Interface2) this.aClass356_2767.method4158(arg0, arg2, arg3, client.anInterface19_9266, (byte) 102);
			}
			if (arg1 == 3) {
				var6 = (Interface2) this.aClass356_2767.method4177(arg0, arg2, arg3, 1315717432);
			}
			return var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "abb.co(" + ')');
		}
	}

	public boolean method2714(Class_ra arg0, int arg1, int arg2, boolean arg3, Class473 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13) {
		try {
			if (Class476.aClass476_6899.anInt6882 == arg1) {
				Class432_Sub1_Sub3 var26;
				if (arg3) {
					Class432_Sub1_Sub3_Sub1 var28 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, arg2);
					if (var28.method31(1370147630)) {
						var28.method25(arg0, 843961968);
					}
					var26 = var28;
				} else {
					var26 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, arg2, arg5);
				}
				this.aClass356_2767.method4144(arg6, arg11, arg12, var26, null, 260058532);
				return true;
			}
			int var15;
			Class432_Sub1_Sub3 var25;
			Interface2 var27;
			Class432_Sub1_Sub3_Sub1 var29;
			if (Class476.aClass476_6897.anInt6882 == arg1) {
				var15 = 65;
				var27 = (Interface2) this.aClass356_2767.method4154(arg6, arg11, arg12, -2040838155);
				if (var27 != null) {
					var15 = this.aClass463_7407.method5705(var27.method34((short) -1023), (byte) -53).anInt5646 + 1;
				}
				if (arg3) {
					var29 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, var15 * anIntArray7406[arg2], anIntArray7404[arg2] * var15, arg1, arg2);
					if (var29.method31(983909135)) {
						var29.method25(arg0, 843961968);
					}
					var25 = var29;
				} else {
					var25 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, anIntArray7406[arg2] * var15, var15 * anIntArray7404[arg2], arg1, arg2, arg5);
				}
				this.aClass356_2767.method4144(arg6, arg11, arg12, var25, null, 377048580);
				return true;
			} else if (arg1 == Class476.aClass476_6885.anInt6882) {
				var15 = 33;
				var27 = (Interface2) this.aClass356_2767.method4154(arg6, arg11, arg12, -2040838155);
				if (var27 != null) {
					var15 = this.aClass463_7407.method5705(var27.method34((short) -1547), (byte) -38).anInt5646 / 2 + 1;
				}
				if (arg3) {
					var29 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, var15 * anIntArray7406[arg2], var15 * anIntArray7404[arg2], arg1, arg2 + 4);
					if (var29.method31(1741438771)) {
						var29.method25(arg0, 843961968);
					}
					var25 = var29;
				} else {
					var25 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, anIntArray7408[arg2] * var15, var15 * anIntArray7412[arg2], arg1, arg2 + 4, arg5);
				}
				this.aClass356_2767.method4144(arg6, arg11, arg12, var25, null, -1534867012);
				return true;
			} else if (arg1 == Class476.aClass476_6886.anInt6882) {
				var15 = arg2 + 2 & 0x3;
				Class432_Sub1_Sub3 var23;
				if (arg3) {
					Class432_Sub1_Sub3_Sub1 var24 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, var15 + 4);
					if (var24.method31(1906136815)) {
						var24.method25(arg0, 843961968);
					}
					var23 = var24;
				} else {
					var23 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, var15 + 4, arg5);
				}
				this.aClass356_2767.method4144(arg6, arg11, arg12, var23, null, -844156577);
				return true;
			} else if (Class476.aClass476_6887.anInt6882 == arg1) {
				var15 = arg2 + 2 & 0x3;
				int var16 = 33;
				Interface2 var17 = (Interface2) this.aClass356_2767.method4154(arg6, arg11, arg12, -2040838155);
				if (var17 != null) {
					var16 = this.aClass463_7407.method5705(var17.method34((short) -20399), (byte) 17).anInt5646 / 2 + 1;
				}
				Class432_Sub1_Sub3 var18;
				Class432_Sub1_Sub3 var19;
				if (arg3) {
					Class432_Sub1_Sub3_Sub1 var20 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, var16 * anIntArray7408[arg2], anIntArray7412[arg2] * var16, arg1, arg2 + 4);
					Class432_Sub1_Sub3_Sub1 var21 = new Class432_Sub1_Sub3_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, var15 + 4);
					if (var20.method31(1604704468)) {
						var20.method25(arg0, 843961968);
					}
					if (var21.method31(643232993)) {
						var21.method25(arg0, 843961968);
					}
					var18 = var20;
					var19 = var21;
				} else {
					Class432_Sub1_Sub3_Sub2 var30 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, var16 * anIntArray7408[arg2], anIntArray7412[arg2] * var16, arg1, arg2 + 4, arg5);
					Class432_Sub1_Sub3_Sub2 var31 = new Class432_Sub1_Sub3_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, 0, 0, arg1, var15 + 4, arg5);
					var18 = var30;
					var19 = var31;
				}
				this.aClass356_2767.method4144(arg6, arg11, arg12, var18, var19, -2122928068);
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "abb.cd(" + ')');
		}
	}

	public boolean method2715(Class_ra arg0, int arg1, int arg2, boolean arg3, Class473 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, Class_xa arg14, Class307 arg15, int arg16, int arg17, int arg18) {
		try {
			int var28;
			Class432_Sub1_Sub5 var30;
			if (arg1 == Class476.aClass476_6883.anInt6882) {
				var28 = arg4.anInt5641;
				if (aBoolean7401 && arg4.anInt5641 == -1) {
					var28 = 1;
				}
				if (arg3) {
					Class432_Sub1_Sub5_Sub1 var31 = new Class432_Sub1_Sub5_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg13);
					if (var31.method31(807710265)) {
						var31.method25(arg0, 843961968);
					}
					var30 = var31;
				} else {
					var30 = new Class432_Sub1_Sub5_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg5);
				}
				this.aClass356_2767.method4180(arg6, arg11, arg12, var30, null, 1505128875);
				if (arg2 == 0) {
					if (this.aBoolean2780 && arg4.aBoolean5669) {
						arg14.LA(arg11, arg12, 50);
						arg14.LA(arg11, arg12 + 1, 50);
					}
					if (var28 == 1 && !this.aBoolean2777) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
					}
				} else if (arg2 == 1) {
					if (this.aBoolean2780 && arg4.aBoolean5669) {
						arg14.LA(arg11, arg12 + 1, 50);
						arg14.LA(arg11 + 1, arg12 + 1, 50);
					}
					if (var28 == 1 && !this.aBoolean2777) {
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12 + 1, arg4.anInt5642, -arg4.anInt5643);
					}
				} else if (arg2 == 2) {
					if (this.aBoolean2780 && arg4.aBoolean5669) {
						arg14.LA(arg11 + 1, arg12, 50);
						arg14.LA(arg11 + 1, arg12 + 1, 50);
					}
					if (var28 == 1 && !this.aBoolean2777) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11 + 1, arg12, arg4.anInt5642, -arg4.anInt5643);
					}
				} else if (arg2 == 3) {
					if (this.aBoolean2780 && arg4.aBoolean5669) {
						arg14.LA(arg11, arg12, 50);
						arg14.LA(arg11 + 1, arg12, 50);
					}
					if (var28 == 1 && !this.aBoolean2777) {
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
					}
				}
				if (arg4.anInt5635 != 0 && arg15 != null) {
					arg15.method3063(arg11, arg12, arg1, arg2, arg4.aBoolean5636, !arg4.aBoolean5668, -385586251);
				}
				if (arg4.anInt5646 != 64) {
					this.aClass356_2767.method4184(arg6, arg11, arg12, arg4.anInt5646, -1507395092);
				}
				return true;
			}
			Class432_Sub1_Sub5 var26;
			Class432_Sub1_Sub5_Sub1 var29;
			if (arg1 == Class476.aClass476_6879.anInt6882) {
				if (arg3) {
					var29 = new Class432_Sub1_Sub5_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg13);
					if (var29.method31(1298368502)) {
						var29.method25(arg0, 843961968);
					}
					var26 = var29;
				} else {
					var26 = new Class432_Sub1_Sub5_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg5);
				}
				this.aClass356_2767.method4180(arg6, arg11, arg12, var26, null, 1597220367);
				if (arg4.aBoolean5669 && this.aBoolean2780) {
					if (arg2 == 0) {
						arg14.LA(arg11, arg12 + 1, 50);
					} else if (arg2 == 1) {
						arg14.LA(arg11 + 1, arg12 + 1, 50);
					} else if (arg2 == 2) {
						arg14.LA(arg11 + 1, arg12, 50);
					} else if (arg2 == 3) {
						arg14.LA(arg11, arg12, 50);
					}
				}
				if (arg4.anInt5635 != 0 && arg15 != null) {
					arg15.method3063(arg11, arg12, arg1, arg2, arg4.aBoolean5636, !arg4.aBoolean5668, -385586251);
				}
				return true;
			} else if (Class476.aClass476_6880.anInt6882 == arg1) {
				var28 = arg2 + 1 & 0x3;
				Class432_Sub1_Sub5 var22;
				if (arg3) {
					Class432_Sub1_Sub5_Sub1 var23 = new Class432_Sub1_Sub5_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2 + 4, arg13);
					Class432_Sub1_Sub5_Sub1 var24 = new Class432_Sub1_Sub5_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, var28, arg13);
					if (var23.method31(1462264228)) {
						var23.method25(arg0, 843961968);
					}
					if (var24.method31(1550195409)) {
						var24.method25(arg0, 843961968);
					}
					var30 = var23;
					var22 = var24;
				} else {
					var30 = new Class432_Sub1_Sub5_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2 + 4, arg5);
					var22 = new Class432_Sub1_Sub5_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, var28, arg5);
				}
				this.aClass356_2767.method4180(arg6, arg11, arg12, var30, var22, 1248257883);
				if ((arg4.anInt5641 == 1 || aBoolean7401 && arg4.anInt5641 == -1) && !this.aBoolean2777) {
					if (arg2 == 0) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12 + 1, arg4.anInt5642, arg4.anInt5643);
					} else if (arg2 == 1) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11 + 1, arg12, arg4.anInt5642, arg4.anInt5643);
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12 + 1, arg4.anInt5642, arg4.anInt5643);
					} else if (arg2 == 2) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11 + 1, arg12, arg4.anInt5642, arg4.anInt5643);
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
					} else if (arg2 == 3) {
						this.aClass356_2767.aClass358_3649.method4216(1, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
						this.aClass356_2767.aClass358_3649.method4216(2, arg6, arg11, arg12, arg4.anInt5642, arg4.anInt5643);
					}
				}
				if (arg4.anInt5635 != 0 && arg15 != null) {
					arg15.method3063(arg11, arg12, arg1, arg2, arg4.aBoolean5636, !arg4.aBoolean5668, -385586251);
				}
				if (arg4.anInt5646 != 64) {
					this.aClass356_2767.method4184(arg6, arg11, arg12, arg4.anInt5646, -2054214909);
				}
				return true;
			} else if (arg1 == Class476.aClass476_6881.anInt6882) {
				if (arg3) {
					var29 = new Class432_Sub1_Sub5_Sub1(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg13);
					if (var29.method31(1781125525)) {
						var29.method25(arg0, 843961968);
					}
					var26 = var29;
				} else {
					var26 = new Class432_Sub1_Sub5_Sub2(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg1, arg2, arg5);
				}
				this.aClass356_2767.method4180(arg6, arg11, arg12, var26, null, 1298228129);
				if (arg4.aBoolean5669 && this.aBoolean2780) {
					if (arg2 == 0) {
						arg14.LA(arg11, arg12 + 1, 50);
					} else if (arg2 == 1) {
						arg14.LA(arg11 + 1, arg12 + 1, 50);
					} else if (arg2 == 2) {
						arg14.LA(arg11 + 1, arg12, 50);
					} else if (arg2 == 3) {
						arg14.LA(arg11, arg12, 50);
					}
				}
				if (arg4.anInt5635 != 0 && arg15 != null) {
					arg15.method3063(arg11, arg12, arg1, arg2, arg4.aBoolean5636, !arg4.aBoolean5668, -385586251);
				}
				return true;
			} else if (arg1 == Class476.aClass476_6902.anInt6882) {
				Class432_Sub1_Sub1 var20;
				if (arg3) {
					Class432_Sub1_Sub1_Sub6 var21 = new Class432_Sub1_Sub1_Sub6(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg11, arg11, arg12, arg12, arg1, arg2, arg13);
					if (var21.method31(581989413)) {
						var21.method25(arg0, 843961968);
					}
					var20 = var21;
				} else {
					var20 = new Class432_Sub1_Sub1_Sub5(this.aClass356_2767, arg0, this.aClass463_7407, arg4, arg6, arg7, arg8, arg9, arg10, this.aBoolean2777, arg11, arg11 + arg16 - 1, arg12, arg17 + arg12 - 1, arg1, arg2, arg5);
				}
				this.aClass356_2767.method4145(var20, false, 1556130493);
				if (arg4.anInt5641 == 1 && !this.aBoolean2777) {
					byte var27;
					if ((arg2 & 0x1) == 0) {
						var27 = 8;
					} else {
						var27 = 16;
					}
					this.aClass356_2767.aClass358_3649.method4216(var27, arg6, arg11, arg12, arg4.anInt5642, 0);
				}
				if (arg4.anInt5635 != 0 && arg15 != null) {
					arg15.method3058(arg11, arg12, arg16, arg17, arg4.aBoolean5636, !arg4.aBoolean5668, 294543916);
				}
				if (arg4.anInt5646 != 64) {
					this.aClass356_2767.method4184(arg6, arg11, arg12, arg4.anInt5646, -1574216885);
				}
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var25) {
			throw Class476.method5964(var25, "abb.ct(" + ')');
		}
	}
}
