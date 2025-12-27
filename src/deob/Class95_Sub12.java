package deob;

public abstract class Class95_Sub12 extends Class95 {

	public int anInt7176;

	public int anInt7175;

	public int anInt7174;

	public static IndexTable aClass280_7177;

	public boolean method1132() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7176 * 2026016083 * 493698779, -2051419548);
		boolean var2 = var1.method5584((byte) -18);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, -1707515884);
		return var2 & var3.method5600(717167219);
	}

	public Class95_Sub12(Buffer arg0) {
		super(arg0);
		this.anInt7176 = arg0.readUnsignedShort(939973073);
		this.anInt7175 = arg0.readUnsignedShort(898769995);
		this.anInt7174 = arg0.readUnsignedByte(1059618174);
	}

	public boolean method1133() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7176 * 2026016083 * 493698779, 1942311935);
		boolean var2 = var1.method5584((byte) -33);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, 1930515879);
		return var2 & var3.method5600(1196794637);
	}

	public boolean method1097(int arg0) {
		try {
			Class437 var2 = Class136.aClass416_1527.method5254(this.anInt7176, 868130108);
			boolean var3 = var2.method5584((byte) -4);
			Class440 var4 = Class201.aClass436_6511.method5570(var2.anInt4431, 1598878754);
			return var3 & var4.method5600(1435413824);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "zl.p(" + ')');
		}
	}

	public boolean method1134() {
		Class437 var1 = Class136.aClass416_1527.method5254(this.anInt7176 * 2026016083 * 493698779, -2071246942);
		boolean var2 = var1.method5584((byte) -122);
		Class440 var3 = Class201.aClass436_6511.method5570(var1.anInt4431 * -872235369 * 1258856743, -2121257239);
		return var2 & var3.method5600(847791562);
	}

	public static final void method1135(Class432_Sub1_Sub1_Sub1 arg0, int arg1) {
		try {
			Class477_Sub3 var2 = arg0.aClass477_Sub3_10039;
			if (var2.method5966(-860204256) && var2.method5981(1, 1433823948) && var2.method5978((byte) -121)) {
				if (var2.aBoolean8752) {
					var2.method5969(arg0.method5436(-2062547966).method4268(2096709438), false, true, 926576130);
					var2.aBoolean8752 = var2.method5966(13928949);
				}
				var2.method5979((byte) -17);
			}
			for (int var3 = 0; var3 < arg0.graphics.length; var3++) {
				if (arg0.graphics[var3].id != -1) {
					Class477 var4 = arg0.graphics[var3].aClass477_573;
					if (var4.method5972(-776556553)) {
						Class437 var5 = Class136.aClass416_1527.method5254(arg0.graphics[var3].id, -734727840);
						Class440 var6 = var4.method5986((byte) -104);
						if (var5.aBoolean4443) {
							if (var6.anInt4477 == 3) {
								if (arg0.anInt10006 > 0 && arg0.anInt10058 <= client.anInt8981 && arg0.anInt10038 < client.anInt8981) {
									var4.method5988(-1, (byte) -18);
									arg0.graphics[var3].id = -1;
									continue;
								}
							} else if (var6.anInt4477 == 1 && arg0.anInt10006 > 0 && arg0.anInt10058 <= client.anInt8981 && arg0.anInt10038 < client.anInt8981) {
								if (arg1 != -745600378) {
								}
								continue;
							}
						}
					}
					if (var4.method5981(1, 1269566725) && var4.method5978((byte) -14)) {
						var4.method5988(-1, (byte) 63);
						arg0.graphics[var3].id = -1;
					}
				}
			}
			Class477 var8 = arg0.aClass477_10032;
			if (var8.method5966(-840889294)) {
				label94: {
					Class440 var9 = var8.method5986((byte) -60);
					if (var9.anInt4477 == 3) {
						if (arg0.anInt10006 > 0 && arg0.anInt10058 <= client.anInt8981 && arg0.anInt10038 < client.anInt8981) {
							arg0.anIntArray10030 = null;
							var8.method5988(-1, (byte) -111);
							break label94;
						}
					} else if (var9.anInt4477 == 1) {
						if (arg0.anInt10006 > 0 && arg0.anInt10058 <= client.anInt8981 && arg0.anInt10038 < client.anInt8981) {
							var8.method5968(1, -1958240973);
							break label94;
						}
						var8.method5968(0, -1958240973);
					}
					if (var8.method5981(1, 865939858) && var8.method5978((byte) -41)) {
						arg0.anIntArray10030 = null;
						var8.method5988(-1, (byte) -72);
					}
				}
			}
			for (int var10 = 0; var10 < arg0.aClass477_Sub2_Sub1Array10019.length; var10++) {
				Class477_Sub2_Sub1 var11 = arg0.aClass477_Sub2_Sub1Array10019[var10];
				if (var11 == null) {
					if (arg1 != -745600378) {
						break;
					}
				} else if (var11.anInt9940 > 0) {
					var11.anInt9940--;
				} else if (var11.method5981(1, 699629043) && var11.method5978((byte) -30)) {
					arg0.aClass477_Sub2_Sub1Array10019[var10] = null;
				}
			}
		} catch (NullPointerException var7) {
			System.out.println("oops");
		}
	}

	public static final void method1136(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			int var7 = var2 + (var3 << 14);
			int var8 = var7 + (var4 << 28);
			int var9 = var8 + var5;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var9;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "zl.uw(" + ')');
		}
	}

	public static void method1137(boolean arg0, boolean arg1, int arg2) {
		try {
			if (arg0) {
				Console.anInt4262--;
				if (Console.anInt4262 == 0) {
					Console.anIntArray4263 = null;
				}
			}
			if (arg1) {
				Console.anInt4261--;
				if (Console.anInt4261 == 0) {
					Console.colorArray = null;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zl.j(" + ')');
		}
	}

	public static final boolean method1138(int arg0, int arg1, Class366 arg2, Class307 arg3, int arg4) {
		try {
			int var5 = arg0;
			int var6 = arg1;
			byte var7 = 64;
			byte var8 = 64;
			int var9 = arg0 - var7;
			int var10 = arg1 - var8;
			Class295.anIntArrayArray3015[var7][var8] = 99;
			Class295.anIntArrayArray3019[var7][var8] = 0;
			byte var11 = 0;
			int var12 = 0;
			Class295.anIntArray3013[var11] = arg0;
			byte var10001 = var11;
			int var20 = var11 + 1;
			Class295.anIntArray3020[var10001] = arg1;
			int[][] var13 = arg3.anIntArrayArray3166;
			while (var20 != var12) {
				var5 = Class295.anIntArray3013[var12];
				var6 = Class295.anIntArray3020[var12];
				var12 = var12 + 1 & 0xFFF;
				int var18 = var5 - var9;
				int var19 = var6 - var10;
				int var14 = var5 - arg3.anInt3162;
				int var15 = var6 - arg3.anInt3163;
				if (arg2.method4274(2, var5, var6, arg3, -1070448394)) {
					Class295.anInt3017 = var5;
					Class202.anInt1936 = var6;
					return true;
				}
				int var16 = Class295.anIntArrayArray3019[var18][var19] + 1;
				if (var18 > 0) {
					if (Class295.anIntArrayArray3015[var18 - 1][var19] == 0) {
						if ((var13[var14 - 1][var15] & 0x43A40000) == 0) {
							if ((var13[var14 - 1][var15 + 1] & 0x4E240000) == 0) {
								Class295.anIntArray3013[var20] = var5 - 1;
								Class295.anIntArray3020[var20] = var6;
								var20 = var20 + 1 & 0xFFF;
								Class295.anIntArrayArray3015[var18 - 1][var19] = 2;
								Class295.anIntArrayArray3019[var18 - 1][var19] = var16;
							} else if (arg4 == -1183709625) {
								throw new IllegalStateException();
							}
						} else if (arg4 == -1183709625) {
							throw new IllegalStateException();
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
				if (var18 < 126) {
					if (Class295.anIntArrayArray3015[var18 + 1][var19] == 0) {
						if ((var13[var14 + 2][var15] & 0x60E40000) == 0) {
							if ((var13[var14 + 2][var15 + 1] & 0x78240000) == 0) {
								Class295.anIntArray3013[var20] = var5 + 1;
								Class295.anIntArray3020[var20] = var6;
								var20 = var20 + 1 & 0xFFF;
								Class295.anIntArrayArray3015[var18 + 1][var19] = 8;
								Class295.anIntArrayArray3019[var18 + 1][var19] = var16;
							} else if (arg4 == -1183709625) {
							}
						} else if (arg4 == -1183709625) {
							throw new IllegalStateException();
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
				if (var19 > 0) {
					if (Class295.anIntArrayArray3015[var18][var19 - 1] == 0) {
						if ((var13[var14][var15 - 1] & 0x43A40000) == 0) {
							if ((var13[var14 + 1][var15 - 1] & 0x60E40000) == 0) {
								Class295.anIntArray3013[var20] = var5;
								Class295.anIntArray3020[var20] = var6 - 1;
								var20 = var20 + 1 & 0xFFF;
								Class295.anIntArrayArray3015[var18][var19 - 1] = 1;
								Class295.anIntArrayArray3019[var18][var19 - 1] = var16;
							} else if (arg4 == -1183709625) {
								throw new IllegalStateException();
							}
						} else if (arg4 == -1183709625) {
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
				if (var19 < 126) {
					if (Class295.anIntArrayArray3015[var18][var19 + 1] == 0) {
						if ((var13[var14][var15 + 2] & 0x4E240000) == 0) {
							if ((var13[var14 + 1][var15 + 2] & 0x78240000) == 0) {
								Class295.anIntArray3013[var20] = var5;
								Class295.anIntArray3020[var20] = var6 + 1;
								var20 = var20 + 1 & 0xFFF;
								Class295.anIntArrayArray3015[var18][var19 + 1] = 4;
								Class295.anIntArrayArray3019[var18][var19 + 1] = var16;
							} else if (arg4 == -1183709625) {
							}
						} else if (arg4 == -1183709625) {
							throw new IllegalStateException();
						}
					} else if (arg4 == -1183709625) {
					}
				}
				if (var18 > 0 && var19 > 0) {
					if (Class295.anIntArrayArray3015[var18 - 1][var19 - 1] == 0) {
						if ((var13[var14 - 1][var15] & 0x4FA40000) == 0) {
							if ((var13[var14 - 1][var15 - 1] & 0x43A40000) == 0) {
								if ((var13[var14][var15 - 1] & 0x63E40000) == 0) {
									Class295.anIntArray3013[var20] = var5 - 1;
									Class295.anIntArray3020[var20] = var6 - 1;
									var20 = var20 + 1 & 0xFFF;
									Class295.anIntArrayArray3015[var18 - 1][var19 - 1] = 3;
									Class295.anIntArrayArray3019[var18 - 1][var19 - 1] = var16;
								} else if (arg4 == -1183709625) {
									throw new IllegalStateException();
								}
							} else if (arg4 == -1183709625) {
								throw new IllegalStateException();
							}
						} else if (arg4 == -1183709625) {
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
				if (var18 < 126 && var19 > 0) {
					if (Class295.anIntArrayArray3015[var18 + 1][var19 - 1] == 0) {
						if ((var13[var14 + 1][var15 - 1] & 0x63E40000) == 0) {
							if ((var13[var14 + 2][var15 - 1] & 0x60E40000) == 0) {
								if ((var13[var14 + 2][var15] & 0x78E40000) == 0) {
									Class295.anIntArray3013[var20] = var5 + 1;
									Class295.anIntArray3020[var20] = var6 - 1;
									var20 = var20 + 1 & 0xFFF;
									Class295.anIntArrayArray3015[var18 + 1][var19 - 1] = 9;
									Class295.anIntArrayArray3019[var18 + 1][var19 - 1] = var16;
								} else if (arg4 == -1183709625) {
									throw new IllegalStateException();
								}
							} else if (arg4 == -1183709625) {
							}
						} else if (arg4 == -1183709625) {
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
				if (var18 > 0 && var19 < 126) {
					if (Class295.anIntArrayArray3015[var18 - 1][var19 + 1] == 0) {
						if ((var13[var14 - 1][var15 + 1] & 0x4FA40000) == 0) {
							if ((var13[var14 - 1][var15 + 2] & 0x4E240000) == 0) {
								if ((var13[var14][var15 + 2] & 0x7E240000) == 0) {
									Class295.anIntArray3013[var20] = var5 - 1;
									Class295.anIntArray3020[var20] = var6 + 1;
									var20 = var20 + 1 & 0xFFF;
									Class295.anIntArrayArray3015[var18 - 1][var19 + 1] = 6;
									Class295.anIntArrayArray3019[var18 - 1][var19 + 1] = var16;
								} else if (arg4 == -1183709625) {
								}
							} else if (arg4 == -1183709625) {
								throw new IllegalStateException();
							}
						} else if (arg4 == -1183709625) {
						}
					} else if (arg4 == -1183709625) {
					}
				}
				if (var18 < 126 && var19 < 126) {
					if (Class295.anIntArrayArray3015[var18 + 1][var19 + 1] == 0) {
						if ((var13[var14 + 1][var15 + 2] & 0x7E240000) == 0) {
							if ((var13[var14 + 2][var15 + 2] & 0x78240000) == 0) {
								if ((var13[var14 + 2][var15 + 1] & 0x78E40000) == 0) {
									Class295.anIntArray3013[var20] = var5 + 1;
									Class295.anIntArray3020[var20] = var6 + 1;
									var20 = var20 + 1 & 0xFFF;
									Class295.anIntArrayArray3015[var18 + 1][var19 + 1] = 12;
									Class295.anIntArrayArray3019[var18 + 1][var19 + 1] = var16;
								} else if (arg4 == -1183709625) {
									throw new IllegalStateException();
								}
							} else if (arg4 == -1183709625) {
							}
						} else if (arg4 == -1183709625) {
							throw new IllegalStateException();
						}
					} else if (arg4 == -1183709625) {
						throw new IllegalStateException();
					}
				}
			}
			Class295.anInt3017 = var5;
			Class202.anInt1936 = var6;
			return false;
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "zl.i(" + ')');
		}
	}
}
