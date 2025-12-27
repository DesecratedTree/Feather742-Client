package deob;

public class Class527 {

	public Class367 aClass367_6211 = new Class367(64);

	public Class367 aClass367_6212 = new Class367(2);

	public IndexTable aClass280_6210;

	public IndexTable aClass280_6209;

	public static int anInt6213;

	public Class527(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_6210 = arg2;
		this.aClass280_6209 = arg3;
		this.aClass280_6210.method2763(Class103.aClass103_957.anInt982, -2134875129);
	}

	public Class529 method6264(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6211;
			Class529 var3;
			synchronized (this.aClass367_6211) {
				var3 = (Class529) this.aClass367_6211.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6210;
			byte[] var13;
			synchronized (this.aClass280_6210) {
				var13 = this.aClass280_6210.getFile(Class103.aClass103_957.anInt982, arg0);
			}
			var3 = new Class529();
			var3.aClass527_6220 = this;
			if (var13 != null) {
				var3.method6273(new Buffer(var13), 1298888433);
			}
			Class367 var12 = this.aClass367_6211;
			synchronized (this.aClass367_6211) {
				this.aClass367_6211.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "vv.r(" + ')');
		}
	}

	public void method6265(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6211;
			synchronized (this.aClass367_6211) {
				this.aClass367_6211.method4298((byte) 28);
			}
			var2 = this.aClass367_6212;
			synchronized (this.aClass367_6212) {
				this.aClass367_6212.method4298((byte) 103);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vv.j(" + ')');
		}
	}

	public void method6266(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6211;
			synchronized (this.aClass367_6211) {
				this.aClass367_6211.method4292(arg0, (byte) 85);
			}
			var3 = this.aClass367_6212;
			synchronized (this.aClass367_6212) {
				this.aClass367_6212.method4292(arg0, (byte) 50);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vv.i(" + ')');
		}
	}

	public void method6267(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6211;
			synchronized (this.aClass367_6211) {
				this.aClass367_6211.method4296(1279169151);
			}
			var2 = this.aClass367_6212;
			synchronized (this.aClass367_6212) {
				this.aClass367_6212.method4296(1319245621);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vv.p(" + ')');
		}
	}

	public static final void method6268(int arg0, int arg1, byte arg2) {
		try {
			if (Class397_Sub1.method4681(arg0, null, 1269754919)) {
				Class562.method6475(Class3.aClass120Array56[arg0].aClass114Array1400, arg1, (byte) -17);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vv.lv(" + ')');
		}
	}

	public static boolean method6269(int arg0) {
		try {
			if (client.anInt8995 == 6) {
				return !Class434.method5564(-1557921116) && !Class509.method6165(47374417);
			} else {
				return false;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vv.ap(" + ')');
		}
	}

	public static final boolean method6270(int arg0, int arg1, int arg2, Class366 arg3, Class307 arg4, int arg5) {
		try {
			int var6 = arg0;
			int var7 = arg1;
			byte var8 = 64;
			byte var9 = 64;
			int var10 = arg0 - var8;
			int var11 = arg1 - var9;
			Class295.anIntArrayArray3015[var8][var9] = 99;
			Class295.anIntArrayArray3019[var8][var9] = 0;
			byte var12 = 0;
			int var13 = 0;
			Class295.anIntArray3013[var12] = arg0;
			int var22 = var12 + 1;
			Class295.anIntArray3020[var12] = arg1;
			int[][] var14 = arg4.anIntArrayArray3166;
			do {
				label331: while (true) {
					int var15;
					int var16;
					int var17;
					int var18;
					int var20;
					int var21;
					do {
						label312: do {
							if (var13 == var22) {
								Class295.anInt3017 = var6;
								Class202.anInt1936 = var7;
								return false;
							}
							var6 = Class295.anIntArray3013[var13];
							var7 = Class295.anIntArray3020[var13];
							var13 = var13 + 1 & 0xFFF;
							var20 = var6 - var10;
							var21 = var7 - var11;
							var15 = var6 - arg4.anInt3162;
							var16 = var7 - arg4.anInt3163;
							if (arg3.method4274(arg2, var6, var7, arg4, -1816537952)) {
								Class295.anInt3017 = var6;
								Class202.anInt1936 = var7;
								return true;
							}
							var17 = Class295.anIntArrayArray3019[var20][var21] + 1;
							if (var20 > 0) {
								if (Class295.anIntArrayArray3015[var20 - 1][var21] == 0) {
									if ((var14[var15 - 1][var16] & 0x43A40000) == 0) {
										if ((var14[var15 - 1][arg2 + var16 - 1] & 0x4E240000) == 0) {
											var18 = 1;
											while (true) {
												if (var18 >= arg2 - 1) {
													Class295.anIntArray3013[var22] = var6 - 1;
													Class295.anIntArray3020[var22] = var7;
													var22 = var22 + 1 & 0xFFF;
													Class295.anIntArrayArray3015[var20 - 1][var21] = 2;
													Class295.anIntArrayArray3019[var20 - 1][var21] = var17;
													break;
												}
												if ((var14[var15 - 1][var18 + var16] & 0x4FA40000) != 0) {
													if (arg5 != 1001616597) {
													}
													break;
												}
												var18++;
											}
										} else if (arg5 != 1001616597) {
											throw new IllegalStateException();
										}
									} else if (arg5 != 1001616597) {
									}
								} else if (arg5 != 1001616597) {
								}
							}
							if (var20 < 128 - arg2) {
								if (Class295.anIntArrayArray3015[var20 + 1][var21] == 0) {
									if ((var14[var15 + arg2][var16] & 0x60E40000) == 0) {
										if ((var14[var15 + arg2][var16 + arg2 - 1] & 0x78240000) == 0) {
											var18 = 1;
											while (true) {
												if (var18 >= arg2 - 1) {
													Class295.anIntArray3013[var22] = var6 + 1;
													Class295.anIntArray3020[var22] = var7;
													var22 = var22 + 1 & 0xFFF;
													Class295.anIntArrayArray3015[var20 + 1][var21] = 8;
													Class295.anIntArrayArray3019[var20 + 1][var21] = var17;
													break;
												}
												if ((var14[var15 + arg2][var16 + var18] & 0x78E40000) != 0) {
													if (arg5 != 1001616597) {
														throw new IllegalStateException();
													}
													break;
												}
												var18++;
											}
										} else if (arg5 != 1001616597) {
											throw new IllegalStateException();
										}
									} else if (arg5 != 1001616597) {
										throw new IllegalStateException();
									}
								} else if (arg5 != 1001616597) {
									throw new IllegalStateException();
								}
							}
							if (var21 > 0) {
								if (Class295.anIntArrayArray3015[var20][var21 - 1] == 0) {
									if ((var14[var15][var16 - 1] & 0x43A40000) == 0) {
										if ((var14[arg2 + var15 - 1][var16 - 1] & 0x60E40000) == 0) {
											var18 = 1;
											while (true) {
												if (var18 >= arg2 - 1) {
													Class295.anIntArray3013[var22] = var6;
													Class295.anIntArray3020[var22] = var7 - 1;
													var22 = var22 + 1 & 0xFFF;
													Class295.anIntArrayArray3015[var20][var21 - 1] = 1;
													Class295.anIntArrayArray3019[var20][var21 - 1] = var17;
													break;
												}
												if ((var14[var15 + var18][var16 - 1] & 0x63E40000) != 0) {
													if (arg5 != 1001616597) {
													}
													break;
												}
												var18++;
											}
										} else if (arg5 != 1001616597) {
										}
									} else if (arg5 != 1001616597) {
										throw new IllegalStateException();
									}
								} else if (arg5 != 1001616597) {
									throw new IllegalStateException();
								}
							}
							if (var21 < 128 - arg2) {
								if (Class295.anIntArrayArray3015[var20][var21 + 1] == 0) {
									if ((var14[var15][arg2 + var16] & 0x4E240000) == 0) {
										if ((var14[arg2 + var15 - 1][arg2 + var16] & 0x78240000) == 0) {
											var18 = 1;
											while (true) {
												if (var18 >= arg2 - 1) {
													Class295.anIntArray3013[var22] = var6;
													Class295.anIntArray3020[var22] = var7 + 1;
													var22 = var22 + 1 & 0xFFF;
													Class295.anIntArrayArray3015[var20][var21 + 1] = 4;
													Class295.anIntArrayArray3019[var20][var21 + 1] = var17;
													break;
												}
												if ((var14[var18 + var15][arg2 + var16] & 0x7E240000) != 0) {
													if (arg5 != 1001616597) {
													}
													break;
												}
												var18++;
											}
										} else if (arg5 != 1001616597) {
											throw new IllegalStateException();
										}
									} else if (arg5 != 1001616597) {
										throw new IllegalStateException();
									}
								} else if (arg5 != 1001616597) {
									throw new IllegalStateException();
								}
							}
							if (var20 > 0 && var21 > 0) {
								if (Class295.anIntArrayArray3015[var20 - 1][var21 - 1] == 0) {
									if ((var14[var15 - 1][var16 - 1] & 0x43A40000) == 0) {
										var18 = 1;
										while (true) {
											if (var18 >= arg2) {
												Class295.anIntArray3013[var22] = var6 - 1;
												Class295.anIntArray3020[var22] = var7 - 1;
												var22 = var22 + 1 & 0xFFF;
												Class295.anIntArrayArray3015[var20 - 1][var21 - 1] = 3;
												Class295.anIntArrayArray3019[var20 - 1][var21 - 1] = var17;
												break;
											}
											if ((var14[var15 - 1][var18 + (var16 - 1)] & 0x4FA40000) != 0) {
												if (arg5 != 1001616597) {
													throw new IllegalStateException();
												}
												break;
											}
											if ((var14[var15 - 1 + var18][var16 - 1] & 0x63E40000) != 0) {
												if (arg5 != 1001616597) {
													throw new IllegalStateException();
												}
												break;
											}
											var18++;
										}
									} else if (arg5 != 1001616597) {
									}
								} else if (arg5 != 1001616597) {
								}
							}
							if (var20 < 128 - arg2 && var21 > 0) {
								if (Class295.anIntArrayArray3015[var20 + 1][var21 - 1] == 0) {
									if ((var14[arg2 + var15][var16 - 1] & 0x60E40000) == 0) {
										var18 = 1;
										while (true) {
											if (var18 >= arg2) {
												Class295.anIntArray3013[var22] = var6 + 1;
												Class295.anIntArray3020[var22] = var7 - 1;
												var22 = var22 + 1 & 0xFFF;
												Class295.anIntArrayArray3015[var20 + 1][var21 - 1] = 9;
												Class295.anIntArrayArray3019[var20 + 1][var21 - 1] = var17;
												break;
											}
											if ((var14[var15 + arg2][var18 + (var16 - 1)] & 0x78E40000) != 0) {
												if (arg5 != 1001616597) {
												}
												break;
											}
											if ((var14[var15 + var18][var16 - 1] & 0x63E40000) != 0) {
												if (arg5 != 1001616597) {
													throw new IllegalStateException();
												}
												break;
											}
											var18++;
										}
									} else if (arg5 != 1001616597) {
									}
								} else if (arg5 != 1001616597) {
									throw new IllegalStateException();
								}
							}
							if (var20 > 0 && var21 < 128 - arg2) {
								if (Class295.anIntArrayArray3015[var20 - 1][var21 + 1] == 0) {
									if ((var14[var15 - 1][var16 + arg2] & 0x4E240000) == 0) {
										for (var18 = 1; var18 < arg2; var18++) {
											if ((var14[var15 - 1][var18 + var16] & 0x4FA40000) != 0) {
												if (arg5 != 1001616597) {
													throw new IllegalStateException();
												}
												continue label312;
											}
											if ((var14[var15 - 1 + var18][var16 + arg2] & 0x7E240000) != 0) {
												if (arg5 != 1001616597) {
													throw new IllegalStateException();
												}
												continue label312;
											}
										}
										Class295.anIntArray3013[var22] = var6 - 1;
										Class295.anIntArray3020[var22] = var7 + 1;
										var22 = var22 + 1 & 0xFFF;
										Class295.anIntArrayArray3015[var20 - 1][var21 + 1] = 6;
										Class295.anIntArrayArray3019[var20 - 1][var21 + 1] = var17;
									} else if (arg5 != 1001616597) {
										throw new IllegalStateException();
									}
								} else if (arg5 != 1001616597) {
								}
							}
						} while (var20 >= 128 - arg2);
					} while (var21 >= 128 - arg2);
					if (Class295.anIntArrayArray3015[var20 + 1][var21 + 1] != 0) {
						break;
					}
					if ((var14[var15 + arg2][arg2 + var16] & 0x78240000) == 0) {
						for (var18 = 1; var18 < arg2; var18++) {
							if ((var14[var18 + var15][var16 + arg2] & 0x7E240000) != 0) {
								if (arg5 != 1001616597) {
								}
								continue label331;
							}
							if ((var14[var15 + arg2][var18 + var16] & 0x78E40000) != 0) {
								if (arg5 != 1001616597) {
								}
								continue label331;
							}
						}
						Class295.anIntArray3013[var22] = var6 + 1;
						Class295.anIntArray3020[var22] = var7 + 1;
						var22 = var22 + 1 & 0xFFF;
						Class295.anIntArrayArray3015[var20 + 1][var21 + 1] = 12;
						Class295.anIntArrayArray3019[var20 + 1][var21 + 1] = var17;
					} else if (arg5 != 1001616597) {
						throw new IllegalStateException();
					}
				}
			} while (arg5 == 1001616597);
			throw new IllegalStateException();
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "vv.p(" + ')');
		}
	}
}
