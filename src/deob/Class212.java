package deob;

public class Class212 implements Interface10 {

	public int anInt6531;

	public static int anInt6532;

	public static String aString6533;

	public Class198 method160() {
		return Class198.aClass198_1914;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1914;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ix.j(" + ')');
		}
	}

	public Class198 method161() {
		return Class198.aClass198_1914;
	}

	public Class212(int arg0) {
		this.anInt6531 = arg0;
	}

	public static final void method2224(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1328 = Class288.method2886(var4, arg2, 1929506200);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ix.nz(" + ')');
		}
	}

	public static final void method2225(int arg0) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub20_7889.method5807((byte) 43) == 2) {
				byte[][][] var1 = client.aClass304_9030.method2999(-580390108);
				byte var2 = (byte) (client.anInt9092 - 4 & 0xFF);
				int var3 = client.anInt9092 % client.aClass304_9030.method2990(-1204303899);
				int var4;
				int var5;
				for (var4 = 0; var4 < 4; var4++) {
					for (var5 = 0; var5 < client.aClass304_9030.method3033((byte) -26); var5++) {
						var1[var4][var3][var5] = var2;
					}
				}
				if (Class85.anInt712 != 3) {
					for (var4 = 0; var4 < 2; var4++) {
						client.anIntArray9108[var4] = -1000000;
						client.anIntArray8973[var4] = 1000000;
						client.anIntArray8952[var4] = 0;
						client.anIntArray9112[var4] = 1000000;
						client.anIntArray9169[var4] = 0;
					}
					Class260 var18 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
					var5 = (int) var18.aFloat2716;
					int var6 = (int) var18.aFloat2711;
					Class281 var7 = client.aClass304_9030.method2995(1488360876);
					Class356 var8 = client.aClass304_9030.method3023(-400722441);
					int var9;
					if (Class147.anInt1621 != 4 && Class457.anInt6844 == -1) {
						var9 = Class431.method5342(Class471.anInt5612, Class325_Sub3.anInt7484, Class85.anInt712, 1996761881);
						if (var9 - Gfx.anInt578 < 3200 && (var7.aByteArrayArrayArray2916[Class85.anInt712][Class471.anInt5612 >> 9][Class325_Sub3.anInt7484 >> 9] & 0x4) != 0) {
							Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, Class471.anInt5612 >> 9, Class325_Sub3.anInt7484 >> 9, false, -1496633717);
						}
					} else {
						if (Class147.anInt1621 != 4) {
							var5 = Class457.anInt6844;
							var6 = Class439.anInt4456;
						}
						if ((var7.aByteArrayArrayArray2916[Class85.anInt712][var5 >> 9][var6 >> 9] & 0x4) == 0) {
							var9 = Class471.anInt5612 >> 9;
							int var10 = Class325_Sub3.anInt7484 >> 9;
							int var11 = var5 >> 9;
							int var12 = var6 >> 9;
							int var13;
							if (var7.method2784(var9, var10, (byte) 99)) {
								var13 = Class431.method5342(Class471.anInt5612, Class325_Sub3.anInt7484, 3, 1996761881);
								if (Gfx.anInt578 >= var13) {
									Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, var9, var10, false, -1496633717);
								}
							} else if (Class321.anInt7018 < 2560) {
								if (var11 > var9) {
									var13 = var11 - var9;
								} else {
									var13 = var9 - var11;
								}
								int var14;
								if (var12 > var10) {
									var14 = var12 - var10;
								} else {
									var14 = var10 - var12;
								}
								if (var13 == 0 && var14 == 0 || var13 <= -client.aClass304_9030.method2990(-1984917279) || var13 >= client.aClass304_9030.method2990(-1827128951) || var14 <= -client.aClass304_9030.method3033((byte) -9) || var14 >= client.aClass304_9030.method3033((byte) -50)) {
									Class381 var15 = client.aClass304_9030.method3022(937096139);
									Class207.method2195(var9 + Class215.aString2081 + var10 + " " + var11 + Class215.aString2081 + var12 + " " + var15.gameSceneBaseX + Class215.aString2081 + var15.gameSceneBaseY, new RuntimeException(), -306254718);
								} else {
									int var16;
									int var19;
									if (var13 > var14) {
										var19 = var14 * 65536 / var13;
										var16 = 32768;
										while (var11 != var9) {
											if (var9 < var11) {
												var9++;
											} else if (var9 > var11) {
												var9--;
											}
											if ((var7.aByteArrayArrayArray2916[Class85.anInt712][var9][var10] & 0x4) != 0) {
												Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, var9, var10, false, -1496633717);
												break;
											}
											var16 += var19;
											if (var16 >= 65536) {
												var16 -= 65536;
												if (var10 < var12) {
													var10++;
												} else if (var10 > var12) {
													var10--;
												}
												if ((var7.aByteArrayArrayArray2916[Class85.anInt712][var9][var10] & 0x4) != 0) {
													Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, var9, var10, false, -1496633717);
													break;
												}
											}
										}
									} else {
										var19 = var13 * 65536 / var14;
										var16 = 32768;
										while (var12 != var10) {
											if (var10 < var12) {
												var10++;
											} else if (var10 > var12) {
												var10--;
											}
											if ((var7.aByteArrayArrayArray2916[Class85.anInt712][var9][var10] & 0x4) != 0) {
												Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, var9, var10, false, -1496633717);
												break;
											}
											var16 += var19;
											if (var16 >= 65536) {
												var16 -= 65536;
												if (var9 < var11) {
													var9++;
												} else if (var9 > var11) {
													var9--;
												}
												if ((var7.aByteArrayArrayArray2916[Class85.anInt712][var9][var10] & 0x4) != 0) {
													Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 1, var9, var10, false, -1496633717);
													break;
												}
											}
										}
									}
								}
							}
						} else {
							Class95_Sub13.method1146(var8.aClass340ArrayArrayArray3653, 0, var5 >> 9, var6 >> 9, false, -1496633717);
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "ix.ig(" + ')');
		}
	}

	public static void method2226(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Class263 arg6, Class524 arg7, String arg8, int arg9) {
		try {
			int var10 = 255 - Class333.anInt3361 - Class484.anInt5809;
			if (var10 < 0) {
				var10 = 0;
			}
			if (Class313.aClass61_6650 == null || Class146.aClass61_1614 == null) {
				if (Class540.aClass280_6249.method2750(Class513.anInt5965, -1962688676) && Class540.aClass280_6249.method2750(Class170.anInt1725, 1982843426)) {
					Class313.aClass61_6650 = arg0.bw(Class53.method643(Class540.aClass280_6249, Class513.anInt5965, 0), true);
					Class87 var11 = Class53.method643(Class540.aClass280_6249, Class170.anInt1725, 0);
					Class146.aClass61_1614 = arg0.bw(var11, true);
					var11.method998();
					Class448.aClass61_5554 = arg0.bw(var11, true);
				} else {
					arg0.B(arg1, arg2, arg3, arg5, var10 << 24 | Class513.anInt5964, 1);
				}
			}
			if (Class313.aClass61_6650 != null && Class146.aClass61_1614 != null) {
				int var14 = (arg3 - Class146.aClass61_1614.method681() * 2) / Class313.aClass61_6650.method681();
				for (int var12 = 0; var12 < var14; var12++) {
					Class313.aClass61_6650.method687(arg1 + Class146.aClass61_1614.method681() + var12 * Class313.aClass61_6650.method681(), arg2);
				}
				Class146.aClass61_1614.method687(arg1, arg2);
				Class448.aClass61_5554.method687(arg3 + arg1 - Class448.aClass61_5554.method681(), arg2);
			}
			arg6.method2594(arg8, arg1 + 3, arg2 + arg7.anInt6033 + (20 - arg7.anInt6033) / 2, Class451.anInt6643 | 0xFF000000, -1, 215745955);
			arg0.B(arg1, arg2 + arg5, arg3, arg4 - arg5, var10 << 24 | Class513.anInt5964, 1);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "ix.ae(" + ')');
		}
	}
}
