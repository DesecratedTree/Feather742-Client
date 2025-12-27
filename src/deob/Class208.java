package deob;

public class Class208 {

	public static int anInt1955 = 0;

	public static int anInt1956 = 1;

	public static int anInt1957 = 2;

	public static int anInt1958 = 0;

	public static int anInt1960 = 1;

	public static int anInt1961 = 1;

	public static Class208[] aClass208Array1963 = new Class208[16];

	public static int anInt1971 = 0;

	public static int anInt1973 = 1;

	public static int anInt1975 = 2;

	public static int anInt1979 = 0;

	public static Class497 aClass497_1964 = new Class497(16);

	public static Class367 aClass367_1966 = new Class367(64);

	public int anInt1965 = 0;

	public int anInt1976 = 0;

	public boolean aBoolean1977 = false;

	public int anInt1953;

	public int anInt1959;

	public int anInt1962;

	public int anInt1967;

	public int anInt1968;

	public int anInt1969;

	public int anInt1970;

	public int anInt1972;

	public int anInt1974;

	public int anInt1980;

	public long aLong1978;

	public static IndexTable aClass280_1954;

	public void method2196(int arg0) {
		try {
			this.anInt1980 = Class257.anIntArray2684[this.anInt1969 << 3];
			long var2 = (long) this.anInt1970;
			long var4 = (long) this.anInt1953;
			long var6 = (long) this.anInt1972;
			this.anInt1962 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
			if (this.anInt1974 == 0) {
				this.anInt1974 = 1;
			}
			if (this.anInt1959 == 0) {
				this.aLong1978 = 2147483647L;
			} else if (this.anInt1959 == 1) {
				this.aLong1978 = this.anInt1962 * 8 / this.anInt1974;
				this.aLong1978 *= this.aLong1978;
			} else if (this.anInt1959 == 2) {
				this.aLong1978 = this.anInt1962 * 8 / this.anInt1974;
			}
			if (this.aBoolean1977) {
				this.anInt1962 *= -1;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "it.o(" + ')');
		}
	}

	public void method2197(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1599201044);
				if (var3 == 0) {
					if (arg1 == 2) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method2198(arg0, var3, 1069103436);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "it.i(" + ')');
		}
	}

	public void method2198(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt1969 = arg0.readUnsignedShort(-406949323);
			} else if (arg1 == 2) {
				arg0.readUnsignedByte(483040893);
			} else if (arg1 == 3) {
				this.anInt1970 = arg0.readInt((byte) 119);
				this.anInt1953 = arg0.readInt((byte) 61);
				this.anInt1972 = arg0.readInt((byte) 56);
			} else if (arg1 == 4) {
				this.anInt1959 = arg0.readUnsignedByte(434602612);
				this.anInt1974 = arg0.readInt((byte) 84);
			} else if (arg1 == 6) {
				this.anInt1968 = arg0.readUnsignedByte(528832674);
			} else if (arg1 == 8) {
				this.anInt1965 = 1;
			} else if (arg1 == 9) {
				this.anInt1976 = 1;
			} else if (arg1 == 10) {
				this.aBoolean1977 = true;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "it.p(" + ')');
		}
	}

	public static Class330_Sub36_Sub10 method2199(int arg0) {
		try {
			return Class418.aClass330_Sub36_Sub10_4298;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "it.ax(" + ')');
		}
	}

	public static final void method2200(Class430 arg0, byte arg1) {
		try {
			Class497 var2 = arg0.aClass330_Sub36_Sub8_4393.aClass497Array9682[arg0.anIntArray4394[arg0.anInt4397]];
			Class330_Sub23 var3 = (Class330_Sub23) var2.method6094((long) arg0.anIntArray4387[--arg0.anInt4376]);
			if (var3 != null) {
				arg0.anInt4397 += var3.anInt7693;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "it.bg(" + ')');
		}
	}

	public static final void method2201(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 2;
			arg0.anInt1247 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1315 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			Class404.method4738(arg0, 499051052);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "it.fp(" + ')');
		}
	}

	public static final void method2202(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 905641405);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class_xa.method6431(var3, var4, arg0, 1695046565);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "it.gj(" + ')');
		}
	}

	public static final void method2203(Class430 arg0, int arg1) {
		try {
			client.aBoolean9273 = true;
			Class62.method768(1574861703);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "it.ajo(" + ')');
		}
	}

	public static void method2204(Class120 arg0, int arg1, int arg2, int arg3, boolean arg4, Class430 arg5, int arg6) {
		try {
			if (arg2 == 0) {
				throw new RuntimeException();
			}
			IComponentDefinitions var7 = arg0.aClass114Array1400[arg1];
			if (var7.aClass114Array1347 == null) {
				var7.aClass114Array1347 = new IComponentDefinitions[arg3 + 1];
				var7.aClass114Array1219 = var7.aClass114Array1347;
			}
			if (var7.aClass114Array1347.length <= arg3) {
				IComponentDefinitions[] var8;
				if (var7.aClass114Array1219 == var7.aClass114Array1347) {
					var8 = new IComponentDefinitions[arg3 + 1];
					for (int var9 = 0; var9 < var7.aClass114Array1347.length; var9++) {
						var8[var9] = var7.aClass114Array1347[var9];
					}
					var7.aClass114Array1347 = var7.aClass114Array1219 = var8;
				} else {
					var8 = new IComponentDefinitions[arg3 + 1];
					IComponentDefinitions[] var13 = new IComponentDefinitions[arg3 + 1];
					for (int var10 = 0; var10 < var7.aClass114Array1347.length; var10++) {
						var8[var10] = var7.aClass114Array1347[var10];
						var13[var10] = var7.aClass114Array1219[var10];
					}
					var7.aClass114Array1347 = var8;
					var7.aClass114Array1219 = var13;
				}
			}
			if (arg3 > 0 && var7.aClass114Array1347[arg3 - 1] == null) {
				throw new RuntimeException("" + (arg3 - 1));
			}
			IComponentDefinitions var12 = new IComponentDefinitions();
			var12.anInt1198 = arg2;
			var12.anInt1211 = var12.anInt1196 = var7.anInt1196;
			var12.anInt1287 = arg3;
			var7.aClass114Array1347[arg3] = var12;
			if (var7.aClass114Array1347 != var7.aClass114Array1219) {
				var7.aClass114Array1219[arg3] = var12;
			}
			Class426 var14;
			if (arg4) {
				var14 = arg5.aClass426_4384;
			} else {
				var14 = arg5.aClass426_4370;
			}
			var14.aClass120_4346 = arg0;
			var14.aClass114_4345 = var12;
			Class404.method4738(var7, 1821643867);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "it.q(" + ')');
		}
	}

	public static final void method2205(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
		try {
			if (arg5 || arg1 >= 512 && arg2 >= 512 && arg1 <= (client.aClass304_9030.method2990(-1665273385) - 2) * 512 && arg2 <= (client.aClass304_9030.method3033((byte) -85) - 2) * 512) {
				int var7 = Class431.method5342(arg1, arg2, arg0, 1996761881) - arg4;
				client.aClass247_8975.method2454(Class361.aClass_ra3793.cq());
				client.aClass247_8975.method2474((float) arg3, 0.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				if (arg5) {
					Class361.aClass_ra3793.method_do((float) arg1, (float) var7, (float) arg2, client.aFloatArray9253);
				} else {
					Class361.aClass_ra3793.dr((float) arg1, (float) var7, (float) arg2, client.aFloatArray9253);
				}
				client.aClass247_8975.method2474((float) -arg3, 0.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				client.aFloatArray9253[0] -= client.anInt9251;
				client.aFloatArray9253[1] -= client.anInt9166;
			} else {
				float[] var9 = client.aFloatArray9253;
				client.aFloatArray9253[1] = -1.0F;
				var9[0] = -1.0F;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "it.jj(" + ')');
		}
	}

	public static void method2206(String[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < arg3) {
				int var5 = (arg2 + arg3) / 2;
				int var6 = arg2;
				String var7 = arg0[var5];
				arg0[var5] = arg0[arg3];
				arg0[arg3] = var7;
				int var8 = arg1[var5];
				arg1[var5] = arg1[arg3];
				arg1[arg3] = var8;
				for (int var9 = arg2; var9 < arg3; var9++) {
					if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
						String var10 = arg0[var9];
						arg0[var9] = arg0[var6];
						arg0[var6] = var10;
						int var11 = arg1[var9];
						arg1[var9] = arg1[var6];
						arg1[var6++] = var11;
					}
				}
				arg0[arg3] = arg0[var6];
				arg0[var6] = var7;
				arg1[arg3] = arg1[var6];
				arg1[var6] = var8;
				method2206(arg0, arg1, arg2, var6 - 1, -202997718);
				method2206(arg0, arg1, var6 + 1, arg3, -121027225);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "it.p(" + ')');
		}
	}

	public static final void method2207(int arg0) {
		try {
			Class62.method766((byte) -2);
			for (int var1 = 0; var1 < Class333.anInt3360; var1++) {
				Class316 var2 = Class333.aClass316Array3347[var1];
				boolean var3 = false;
				int var4;
				if (var2.aClass330_Sub40_Sub3_3271 == null) {
					var2.anInt3264--;
					if (var2.anInt3264 >= (var2.method3145(2086045403) ? -1500 : -10)) {
						if (var2.aByte3266 == 1 && var2.aClass302_3268 == null) {
							var2.aClass302_3268 = Class302.method2982(Class428.aClass280_4362, var2.anInt3262, 0);
							if (var2.aClass302_3268 == null) {
								if (arg0 >= 16777215) {
								}
								continue;
							}
							var2.anInt3264 += var2.aClass302_3268.method2983();
						} else if (var2.method3145(1793106358) && (var2.aClass330_Sub41_3269 == null || var2.aClass330_Sub29_Sub1_Sub1_3270 == null)) {
							if (var2.aClass330_Sub41_3269 == null) {
								var2.aClass330_Sub41_3269 = Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, var2.anInt3262);
							}
							if (var2.aClass330_Sub41_3269 == null) {
								if (arg0 >= 16777215) {
								}
								continue;
							}
							if (var2.aClass330_Sub29_Sub1_Sub1_3270 == null) {
								var2.aClass330_Sub29_Sub1_Sub1_3270 = var2.aClass330_Sub41_3269.method3699();
								if (var2.aClass330_Sub29_Sub1_Sub1_3270 == null) {
									if (arg0 >= 16777215) {
										throw new IllegalStateException();
									}
									continue;
								}
							}
						}
						if (var2.anInt3264 < 0) {
							var4 = 8192;
							int var5;
							if (var2.anInt3265 == 0) {
								var5 = var2.anInt3272 * (var2.aByte3266 == 3 ? Class448.aClass330_Sub50_5555.aClass464_Sub30_7907.method5841(-2048920843) : Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2001447348)) >> 2;
							} else {
								int var6 = var2.anInt3265 >> 24 & 0x3;
								if (Class263_Sub2.myPlayer.aByte8658 == var6) {
									int var7 = (var2.anInt3265 & 0xFF) << 9;
									int var8 = Class263_Sub2.myPlayer.method5453(-1353821625) << 8;
									Class260 var9 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
									int var10 = var2.anInt3265 >> 16 & 0xFF;
									int var11 = var8 + ((var10 << 9) + 256 - (int) var9.aFloat2716);
									int var12 = var2.anInt3265 >> 8 & 0xFF;
									int var13 = var8 + ((var12 << 9) + 256 - (int) var9.aFloat2711);
									int var14 = Math.abs(var11) + Math.abs(var13) - 512;
									if (var14 > var7) {
										var2.anInt3264 = -99999;
										continue;
									}
									if (var14 < 0) {
										var14 = 0;
									}
									var5 = (var7 - var14) * Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1864678409) * var2.anInt3272 / var7 >> 2;
									if (var2.anInt3261 != -1) {
										var10 = var2.anInt3261;
										var12 = var2.anInt3273;
									}
									if (var11 != 0 || var13 != 0) {
										int var15 = -Class145_Sub1.anInt7266 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
										if (var15 > 8192) {
											var15 = 16384 - var15;
										}
										int var16;
										if (var14 <= 0) {
											var16 = 8192;
										} else if (var14 >= 4096) {
											var16 = 16384;
										} else {
											var16 = (8192 - var14) / 4096 + 8192;
										}
										var4 = (16384 - var16 >> 1) + var15 * var16 / 8192;
									}
								} else {
									var5 = 0;
								}
							}
							if (var5 > 0) {
								if (var2.aByte3266 == 1) {
									Object var19 = null;
									Class330_Sub29_Sub1_Sub2 var20 = var2.aClass302_3268.method2981().method3409(Class427.aClass294_4350);
									var2.aClass330_Sub40_Sub3_3271 = var20.method3403(var2.anInt3259, var5, var4);
								} else if (var2.method3145(1906833804)) {
									var2.aClass330_Sub40_Sub3_3271 = var2.aClass330_Sub29_Sub1_Sub1_3270.method3403(var2.anInt3259, var5, var4);
								}
								var2.aClass330_Sub40_Sub3_3271.method3624(var2.anInt3258 - 1, -754472311);
								Class511.aClass330_Sub40_Sub4_5951.method3684(var2.aClass330_Sub40_Sub3_3271);
							}
						}
					} else {
						var3 = true;
					}
				} else if (!var2.aClass330_Sub40_Sub3_3271.method3251(122249317)) {
					var3 = true;
				}
				if (var3) {
					Class333.anInt3360--;
					for (var4 = var1; var4 < Class333.anInt3360; var4++) {
						Class333.aClass316Array3347[var4] = Class333.aClass316Array3347[var4 + 1];
					}
					var1--;
				}
			}
			if (Class333.aBoolean3354 && !Class416.method5259((byte) 7)) {
				if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1940531327) != 0 && Class333.musicId != -1) {
					if (Class333.aClass330_Sub40_Sub2_3355 == null) {
						Class217.method2255(Class89.aClass280_735, Class333.musicId, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1997820516), false, -656286804);
					} else {
						Class89.method1058(Class89.aClass280_735, Class333.musicId, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2098873436), false, Class333.aClass330_Sub40_Sub2_3355, (short) 15325);
					}
				}
				Class333.aBoolean3354 = false;
				Class333.aClass330_Sub40_Sub2_3355 = null;
			} else if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2024757429) != 0 && Class333.musicId != -1 && !Class416.method5259((byte) 7)) {
				Class330_Sub34 var18 = Class238.method2377(OutgoingPacket.aClass234_2487, client.aClass1_9025.aClass488_22, 763602888);
				var18.aClass330_Sub46_Sub2_7729.addInt(Class333.musicId, 1965508160);
				client.aClass1_9025.method378(var18, -2072392183);
				Class333.musicId = -1;
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "it.w(" + ')');
		}
	}
}
