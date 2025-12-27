package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class556 {

	public static int anInt6387 = 0;

	public static int anInt6388 = 1;

	public static int anInt6389 = 0;

	public static Class470 aClass470_6390;

	public static Class510 aClass510_6392;

	public static Class562 aClass562_6386;

	public static String aString6391;

	public static int[] anIntArray6385;

	public Class556() throws Throwable {
		throw new Error();
	}

	public static final void method6403(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 758503054);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class424.method5306(var3, var4, arg0, (byte) 0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "x.om(" + ')');
		}
	}

	public static final void method6404(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 < 0 || var2 > 5) {
				var2 = 2;
			}
			Class171.method2046(var2, false, -680623927);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "x.akp(" + ')');
		}
	}

	public static final void method6405(Class430 arg0, int arg1) {
		try {
			long var2 = Class312.method3111((byte) 64);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (var2 / 86400000L) - 11745;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "x.amx(" + ')');
		}
	}

	public static void method6406(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6) {
		try {
			Class81.sendSpeech(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, (byte) 55);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "x.p(" + ')');
		}
	}

	public static final void method6407(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -570367591);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class515.method6205(var3, var4, arg0, -1137296399);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "x.hz(" + ')');
		}
	}

	public static final void method6408(IComponentDefinitions[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		try {
			Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
			for (int var11 = 0; var11 < arg0.length; var11++) {
				IComponentDefinitions var12 = arg0[var11];
				if (var12 != null) {
					if (var12.anInt1211 != arg1) {
						if (arg1 != -1412584499) {
							continue;
						}
						if (var12 != client.aClass114_9165) {
							if (arg10 == -1426748510) {
								break;
							}
							continue;
						}
					}
					int var13;
					if (arg8 == -1) {
						client.aRectangleArray9252[client.anInt9213].setBounds(arg6 + var12.anInt1329, arg7 + var12.anInt1209, var12.anInt1210, var12.anInt1348);
						var13 = ++client.anInt9213 - 1;
					} else {
						var13 = arg8;
					}
					var12.anInt1358 = var13;
					var12.anInt1359 = client.anInt8981;
					if (!client.method3918(var12)) {
						if (var12.anInt1207 != 0) {
							Class424.method5308(var12, -745732592);
						}
						int var14 = var12.anInt1329 + arg6;
						int var15 = arg7 + var12.anInt1209;
						int var16 = var12.anInt1226;
						if (client.aBoolean9161 && (client.method3924(var12).anInt7510 != 0 || var12.anInt1198 == 0) && var16 > 127) {
							var16 = 127;
						}
						int var17;
						int var18;
						if (var12 == client.aClass114_9165) {
							if (arg1 != -1412584499 && (IComponentDefinitions.anInt1174 == var12.anInt1291 || IComponentDefinitions.anInt1327 == var12.anInt1291 || client.method3924(var12).method3267(516693227))) {
								Class379.aClass114Array3952 = arg0;
								Class430.anInt4399 = arg6;
								Class550.anInt6289 = arg7;
								continue;
							}
							if (client.aBoolean9178 && client.aBoolean9170) {
								var17 = Class464_Sub23.aClass350_8712.method4030(34823472);
								var18 = Class464_Sub23.aClass350_8712.method4031((short) 24758);
								var17 -= client.anInt8994;
								var18 -= client.anInt9054;
								if (var17 < client.anInt9171) {
									var17 = client.anInt9171;
								}
								if (var12.anInt1210 + var17 > client.anInt9171 + client.anInt9173) {
									var17 = client.anInt9171 + client.anInt9173 - var12.anInt1210;
								}
								if (var18 < client.anInt9172) {
									var18 = client.anInt9172;
								}
								if (var18 + var12.anInt1348 > client.anInt9172 + client.anInt9174) {
									var18 = client.anInt9174 + client.anInt9172 - var12.anInt1348;
								}
								if (client.method3924(var12).method3267(516693227)) {
									Class524.method6252(var17, var18, var12.anInt1210, var12.anInt1348, (byte) 38);
								}
								var14 = var17;
								var15 = var18;
							}
							if (var12.anInt1291 == IComponentDefinitions.anInt1327) {
								var16 = 128;
							}
						}
						int var19;
						int var20;
						int var21;
						int var22;
						if (var12.anInt1198 == 2) {
							var17 = arg2;
							var18 = arg3;
							var19 = arg4;
							var20 = arg5;
						} else {
							var21 = var14 + var12.anInt1210;
							var22 = var12.anInt1348 + var15;
							if (var12.anInt1198 == 9) {
								var21++;
								var22++;
							}
							var17 = var14 > arg2 ? var14 : arg2;
							var18 = var15 > arg3 ? var15 : arg3;
							var19 = var21 < arg4 ? var21 : arg4;
							var20 = var22 < arg5 ? var22 : arg5;
						}
						if (var17 < var19) {
							if (var18 < var20) {
								if (var12.anInt1207 != 0) {
									if (var12.anInt1207 == IComponentDefinitions.anInt1307 || var12.anInt1207 == IComponentDefinitions.anInt1341) {
										Class361.aClass_ra3793.method4804();
										Class95_Sub21.method1168(var14, var15, var12.anInt1210, var12.anInt1348, IComponentDefinitions.anInt1341 == var12.anInt1207, -704632228);
										Class95_Sub1.method1107(var13, var17, var18, var19, var20, var14, var15, 446343493);
										Class361.aClass_ra3793.au();
										Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
										client.aBooleanArray9230[var13] = true;
										continue;
									}
									if (IComponentDefinitions.anInt1178 == var12.anInt1207 && client.anInt8987 == 2) {
										if (var12.method1396(Class361.aClass_ra3793, (byte) -97) != null) {
											Class233.method2362((byte) -18);
											Class233.method2363(Class361.aClass_ra3793, var12, var14, var15, -1571986388);
											Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
										} else if (arg10 == -1426748510) {
											throw new IllegalStateException();
										}
										continue;
									}
									if (IComponentDefinitions.anInt1185 == var12.anInt1207) {
										Class473.method5914(Class361.aClass_ra3793, var14, var15, var12, 1973099486);
										continue;
									}
									if (IComponentDefinitions.anInt1186 == var12.anInt1207) {
										Class375.method4358(Class361.aClass_ra3793, var14, var15, var12, var12.anInt1224 % 64, 571378317);
										continue;
									}
									if (IComponentDefinitions.anInt1179 == var12.anInt1207) {
										if (var12.method1396(Class361.aClass_ra3793, (byte) -96) != null) {
											Class361.aClass_ra3793.method4804();
											Class432_Sub1_Sub1_Sub6.method5516(var12, var14, var15, (byte) 103);
											Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
										} else if (arg10 == -1426748510) {
											break;
										}
										continue;
									}
									if (var12.anInt1207 == IComponentDefinitions.anInt1180) {
										Class238.method2375(Class361.aClass_ra3793, Class230.anInterface_ma2446, var14, var15, var12.anInt1210, var12.anInt1348, (short) 7513);
										client.aBooleanArray9230[var13] = true;
										Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
										continue;
									}
									if (IComponentDefinitions.anInt1181 == var12.anInt1207) {
										Class516.method6206(Class361.aClass_ra3793, var14, var15, var12.anInt1210, var12.anInt1348, -627186632);
										client.aBooleanArray9230[var13] = true;
										Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
										continue;
									}
									if (IComponentDefinitions.anInt1343 == var12.anInt1207) {
										if (client.aBoolean8983 || client.aBoolean8984) {
											Class118.method1430(var14, var15, var12, -808973908);
											client.aBooleanArray9230[var13] = true;
										}
										continue;
									}
								}
								int var23;
								int var24;
								int var25;
								if (var12.anInt1198 == 0) {
									if (var12.anInt1207 == IComponentDefinitions.anInt1197 && Class361.aClass_ra3793.cg()) {
										Class361.aClass_ra3793.db(0, 0, Class300.anInt3058, Class146.anInt1615);
									}
									method6408(arg0, var12.anInt1196, var17, var18, var19, var20, var14 - var12.anInt1220, var15 - var12.anInt1221, var13, arg9, 1478353689);
									if (var12.aClass114Array1219 != null) {
										method6408(var12.aClass114Array1219, var12.anInt1196, var17, var18, var19, var20, var14 - var12.anInt1220, var15 - var12.anInt1221, var13, arg9, 737385419);
									}
									Class330_Sub48 var34 = (Class330_Sub48) client.aClass497_9284.method6094((long) var12.anInt1196);
									if (var34 != null) {
										Class330_Sub38.method3541(var34.anInt7859, var17, var18, var19, var20, var14, var15, var13, (byte) 3);
									}
									if (var12.anInt1207 == IComponentDefinitions.anInt1197) {
										if (Class361.aClass_ra3793.cg()) {
											Class361.aClass_ra3793.ds();
										}
										if (client.anInt8987 == 0) {
											var22 = client.anInt9044;
											var23 = client.anInt9045;
											var24 = client.anInt9070;
											var25 = client.anInt9047;
											if (client.anInt8981 < client.anInt9043) {
												float var26 = (float) (client.anInt8981 - client.anInt8969) * 1.0F / (float) (client.anInt9043 - client.anInt8969);
												var22 = (int) ((float) Class119.anInt1398 * (1.0F - var26) + var26 * (float) client.anInt9044);
												var23 = (int) ((float) client.anInt9045 * var26 + (float) Class166_Sub1.anInt7324 * (1.0F - var26));
												var24 = (int) (var26 * (float) client.anInt9070 + (1.0F - var26) * (float) Class404.anInt4160);
												var25 = (int) (var26 * (float) client.anInt9047 + (1.0F - var26) * (float) Class554.anInt6378);
											}
											if (var22 > 0) {
												Class361.aClass_ra3793.method4789(var17, var18, var19 - var17, var20 - var18, var22 << 24 | var23 << 16 | var24 << 8 | var25, 463754225);
											}
										}
									}
									Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
								}
								if (client.aBooleanArray9263[var13] || client.anInt9218 > 1) {
									if (var12.anInt1198 == 3) {
										if (var16 == 0) {
											if (var12.aBoolean1225) {
												Class361.aClass_ra3793.B(var14, var15, var12.anInt1210, var12.anInt1348, var12.anInt1224 | 0xFF000000, 0);
											} else {
												Class361.aClass_ra3793.bl(var14, var15, var12.anInt1210, var12.anInt1348, var12.anInt1224 | 0xFF000000, 0);
											}
										} else if (var12.aBoolean1225) {
											Class361.aClass_ra3793.B(var14, var15, var12.anInt1210, var12.anInt1348, 255 - (var16 & 0xFF) << 24 | var12.anInt1224 & 0xFFFFFF, 1);
										} else {
											Class361.aClass_ra3793.bl(var14, var15, var12.anInt1210, var12.anInt1348, 255 - (var16 & 0xFF) << 24 | var12.anInt1224 & 0xFFFFFF, 1);
										}
									} else if (var12.anInt1198 == 4) {
										var21 = 255 - (var16 & 0xFF);
										if (var21 != 0) {
											Class263 var36 = var12.method1390(Class219.aClass230_2183, client.anInterface12_9243, 1114693815);
											if (var36 != null) {
												var23 = var12.anInt1224;
												String var39 = var12.aString1266;
												if (var12.anInt1335 != -1) {
													ItemDefinitions var40 = aClass510_6392.getItemDefinitions(var12.anInt1335, (byte) -115);
													var39 = var40.name;
													if (var39 == null) {
														var39 = "null";
													}
													if ((var40.anInt6736 == 1 || var12.anInt1336 != 1) && var12.anInt1336 != -1) {
														var39 = Class146.method1738(16748608, -849826454) + var39 + Class215.aString2079 + " x" + Class143.method1663(var12.anInt1336, 1807333950);
													}
												}
												if (var12.anInt1292 != -1) {
													var39 = Class337.method3956(var12.anInt1292, 1444458195);
													if (var39 == null) {
														var39 = "";
													}
												}
												if (var12 == client.aClass114_9078) {
													var39 = Class526.aClass526_6188.method6257(Class429.aClass454_4369, 991479434);
													var23 = var12.anInt1224;
												}
												if (client.aBoolean9164) {
													Class361.aClass_ra3793.o(var14, var15, var12.anInt1210 + var14, var12.anInt1348 + var15);
												}
												var21 <<= 0x18;
												if (var12.aBoolean1357) {
													var36.method2611(var39, var14, var15, var12.anInt1210, var12.anInt1348, var21 | var23, var12.aBoolean1270 ? var21 : -1, var12.anInt1268, var12.anInt1279, client.aRandom9066, Class382.anInt6680, client.anIntArray8955, Class57.aClass61Array6599, null, -2097010758);
												} else {
													var36.method2596(var39, var14, var15, var12.anInt1210, var12.anInt1348, var21 | var23, var12.aBoolean1270 ? var21 : -1, var12.anInt1268, var12.anInt1279, var12.anInt1267, var12.anInt1271, Class57.aClass61Array6599, null, null, 0, 0, (byte) 29);
												}
												if (client.aBoolean9164) {
													Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
												}
											} else if (IComponentDefinitions.aBoolean1193) {
												Class404.method4738(var12, 833366986);
											}
										} else if (arg10 == -1426748510) {
										}
									} else {
										int var27;
										int var29;
										int var30;
										if (var12.anInt1198 == 5) {
											if (var12.anInt1275 >= 0) {
												var12.method1392(Class341.aClass342_3397, Class446.aClass131_5549, (byte) 14).method3080(Class361.aClass_ra3793, 0, var14, var15, var12.anInt1210, var12.anInt1348, var12.anInt1259 << 3, var12.anInt1340 << 3, 0, 0, (byte) 12);
											} else {
												Class61 var35;
												if (var12.anInt1335 != -1) {
													Class408 var38 = var12.aBoolean1337 ? Class263_Sub2.myPlayer.aClass408_10240 : null;
													var35 = aClass510_6392.method6167(Class361.aClass_ra3793, var12.anInt1335, var12.anInt1336, var12.anInt1232, var12.anInt1233 | 0xFF000000, var12.anInt1255, var38, 1555805803);
												} else if (var12.anInt1292 == -1) {
													var35 = var12.method1406(Class361.aClass_ra3793, 1844998142);
												} else {
													var35 = Class121.method1449(Class361.aClass_ra3793, var12.anInt1292, -1266115092);
												}
												if (var35 != null) {
													var22 = var35.method318();
													var23 = var35.method683();
													var24 = 255 - (var16 & 0xFF);
													if (var24 != 0) {
														if (var12.anInt1224 == -1) {
															var25 = 16777215;
														} else {
															var25 = var12.anInt1224 & 0xFFFFFF;
															if (var25 == 0) {
																var25 = 16777215;
															}
														}
														var25 |= var24 << 24;
														boolean var41 = var25 != -1;
														if (var12.aBoolean1355) {
															Class361.aClass_ra3793.o(var14, var15, var14 + var12.anInt1210, var15 + var12.anInt1348);
															if (var12.anInt1184 != 0) {
																var27 = (var22 - 1 + var12.anInt1210) / var22;
																int var28 = (var12.anInt1348 + (var23 - 1)) / var23;
																for (var29 = 0; var29 < var27; var29++) {
																	for (var30 = 0; var30 < var28; var30++) {
																		if (var41) {
																			var35.method686((float) var22 / 2.0F + (float) (var29 * var22 + var14), (float) var23 / 2.0F + (float) (var23 * var30 + var15), 4096, var12.anInt1184, 0, var25, 1);
																		} else {
																			var35.method695((float) var22 / 2.0F + (float) (var22 * var29 + var14), (float) (var15 + var30 * var23) + (float) var23 / 2.0F, 4096, var12.anInt1184);
																		}
																	}
																}
															} else if (var41) {
																var35.method694(var14, var15, var12.anInt1210, var12.anInt1348, 0, var25, 1);
															} else {
																var35.method721(var14, var15, var12.anInt1210, var12.anInt1348);
															}
															Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
														} else if (var41) {
															if (var12.anInt1184 != 0) {
																var35.method686((float) var12.anInt1210 / 2.0F + (float) var14, (float) var15 + (float) var12.anInt1348 / 2.0F, var12.anInt1210 * 4096 / var22, var12.anInt1184, 0, var25, 1);
															} else if (var12.anInt1210 == var22 && var12.anInt1348 == var23) {
																var35.method688(var14, var15, 0, var25, 1);
															} else {
																var35.method691(var14, var15, var12.anInt1210, var12.anInt1348, 0, var25, 1);
															}
														} else if (var12.anInt1184 != 0) {
															var35.method695((float) var14 + (float) var12.anInt1210 / 2.0F, (float) var15 + (float) var12.anInt1348 / 2.0F, var12.anInt1210 * 4096 / var22, var12.anInt1184);
														} else if (var12.anInt1210 == var22 && var23 == var12.anInt1348) {
															var35.method687(var14, var15);
														} else {
															var35.method690(var14, var15, var12.anInt1210, var12.anInt1348);
														}
													}
												} else if (IComponentDefinitions.aBoolean1193) {
													Class404.method4738(var12, 1169416470);
												}
											}
										} else if (var12.anInt1198 == 6) {
											Class361.aClass_ra3793.method4804();
											client.aClass304_9030.method3008(334372619).method4585((short) -22033);
											Class387 var37 = null;
											var22 = 2048;
											if (var12.anInt1199 != 0) {
												var22 |= 0x80000;
											}
											var23 = 0;
											if (var12.anInt1335 == -1) {
												Player var43;
												if (var12.anInt1238 == 3) {
													var24 = var12.anInt1239;
													if (var24 >= 0 && var24 < 2048) {
														var43 = client.players[var24];
														if (var43 != null && (client.anInt9121 == var24 || Class96.method1184(var43.aString10221, 1826545490) == var12.anInt1240)) {
															var37 = var12.method1402(Class361.aClass_ra3793, var22, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, var12.aClass477_1344, var43.aClass408_10240, (byte) 52);
															if (var37 == null && IComponentDefinitions.aBoolean1193) {
																Class404.method4738(var12, 624206877);
															}
														}
													}
												} else if (var12.anInt1238 == 5) {
													var24 = var12.anInt1239;
													if (var24 >= 0 && var24 < 2048) {
														var43 = client.players[var24];
														if (var43 != null && (var24 == client.anInt9121 || Class96.method1184(var43.aString10221, 1497860706) == var12.anInt1240)) {
															var37 = var43.aClass408_10240.method4762(Class361.aClass_ra3793, var22, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, var12.aClass477_1344, null, null, null, 0, true, Console.aClass421_4266, (byte) -123);
														}
													}
												} else if (var12.anInt1238 == 8 || var12.anInt1238 == 9) {
													Class330_Sub1 var45 = Class321.method3178(var12.anInt1239, false, (short) 19528);
													if (var45 != null) {
														var37 = var45.method3260(Class361.aClass_ra3793, var22, var12.aClass477_1344, var12.anInt1240, var12.anInt1238 == 9, var12.aBoolean1337 ? Class263_Sub2.myPlayer.aClass408_10240 : null, (byte) 125);
													}
												} else if (var12.aClass477_1344 != null && var12.aClass477_1344.method5966(513571361)) {
													var37 = var12.method1402(Class361.aClass_ra3793, var22, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, var12.aClass477_1344, Class263_Sub2.myPlayer.aClass408_10240, (byte) 26);
													if (var37 == null && IComponentDefinitions.aBoolean1193) {
														Class404.method4738(var12, 734388074);
													}
												} else {
													var37 = var12.method1402(Class361.aClass_ra3793, var22, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, null, Class263_Sub2.myPlayer.aClass408_10240, (byte) 98);
													if (var37 == null && IComponentDefinitions.aBoolean1193) {
														Class404.method4738(var12, 1316518348);
													}
												}
											} else {
												ItemDefinitions var46 = aClass510_6392.getItemDefinitions(var12.anInt1335, (byte) -27);
												if (var46 != null) {
													var46 = var46.method6282(var12.anInt1336, (byte) -1);
													var37 = var46.method6281(Class361.aClass_ra3793, var22, 1, var12.aBoolean1337 ? Class263_Sub2.myPlayer.aClass408_10240 : null, var12.aClass477_1344, 0, 0, 0, 0, 1681056721);
													if (var37 == null) {
														Class404.method4738(var12, 390168423);
													} else {
														var23 = -var37.YA() >> 1;
													}
												}
											}
											if (var37 != null) {
												if (var12.anInt1199 != 0) {
													var37.PA(var12.anInt1260, var12.anInt1205, var12.anInt1262, var12.anInt1199);
												}
												if (var12.anInt1290 > 0) {
													var24 = (var12.anInt1210 << 9) / var12.anInt1290;
												} else {
													var24 = 512;
												}
												if (var12.anInt1256 > 0) {
													var25 = (var12.anInt1348 << 9) / var12.anInt1256;
												} else {
													var25 = 512;
												}
												int var42 = var14 + var12.anInt1210 / 2;
												var27 = var12.anInt1348 / 2 + var15;
												if (!var12.aBoolean1241) {
													var42 += var24 * var12.anInt1247 >> 9;
													var27 += var25 * var12.anInt1315 >> 9;
												}
												client.aClass247_8975.method2460();
												Class361.aClass_ra3793.cw(client.aClass247_8975);
												Class249 var44 = Class361.aClass_ra3793.cz();
												var29 = client.aClass304_9030.method2992(1403532609);
												var30 = client.aClass304_9030.method2993(-809701857);
												var30 += var12.anInt1354;
												if (var12.aBoolean1253) {
													if (Class147.anInt1621 == 2) {
														if (var12.aBoolean1241) {
															var44.method2494((float) var42, (float) var27, (float) var24, (float) var25, Class401_Sub1.aClass145_Sub1_8249.method1703(-1917350593), Class401_Sub1.aClass145_Sub1_8249.method1704(2115258158), (float) Class300.anInt3058, (float) Class146.anInt1615, (float) var12.anInt1354);
														} else {
															var44.method2494((float) var42, (float) var27, (float) var24, (float) var25, Class401_Sub1.aClass145_Sub1_8249.method1703(-1856856284), Class401_Sub1.aClass145_Sub1_8249.method1704(-940909231), (float) Class300.anInt3058, (float) Class146.anInt1615, (float) (var12.anInt1354 << 2));
														}
													} else if (var12.aBoolean1241) {
														var44.method2494((float) var42, (float) var27, (float) var24, (float) var25, (float) var29, (float) var30, (float) Class300.anInt3058, (float) Class146.anInt1615, (float) var12.anInt1354);
													} else {
														var44.method2494((float) var42, (float) var27, (float) var24, (float) var25, (float) var29, (float) var30, (float) Class300.anInt3058, (float) Class146.anInt1615, (float) (var12.anInt1354 << 2));
													}
												} else if (Class147.anInt1621 == 2) {
													var44.method2493((float) var42, (float) var27, (float) var24, (float) var25, Class401_Sub1.aClass145_Sub1_8249.method1703(-1996713254), Class401_Sub1.aClass145_Sub1_8249.method1704(509964639), (float) Class300.anInt3058, (float) Class146.anInt1615);
												} else {
													var44.method2493((float) var42, (float) var27, (float) var24, (float) var25, (float) var29, (float) var30, (float) Class300.anInt3058, (float) Class146.anInt1615);
												}
												Class361.aClass_ra3793.ci(var44);
												Class361.aClass_ra3793.ba(2, 0);
												if (var12.aBoolean1254) {
													Class361.aClass_ra3793.RA(false);
												}
												if (var12.aBoolean1241) {
													client.aClass247_8976.method2473(1.0F, 0.0F, 0.0F, Class257.method2541(var12.anInt1296));
													client.aClass247_8976.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(var12.anInt1245));
													client.aClass247_8976.method2462(0.0F, 0.0F, 1.0F, Class257.method2541(var12.anInt1248));
													client.aClass247_8976.method2474((float) var12.anInt1247, (float) var12.anInt1315, (float) var12.anInt1208);
												} else {
													int var31 = Class257.anIntArray2683[var12.anInt1296 << 3] * (var12.anInt1354 << 2) >> 14;
													int var32 = Class257.anIntArray2684[var12.anInt1296 << 3] * (var12.anInt1354 << 2) >> 14;
													client.aClass247_8976.method2473(0.0F, 0.0F, 1.0F, Class257.method2541(-var12.anInt1248 << 3));
													client.aClass247_8976.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(var12.anInt1245 << 3));
													client.aClass247_8976.method2474((float) (var12.anInt1321 << 2), (float) (var23 + (var12.anInt1243 << 2) + var31), (float) ((var12.anInt1243 << 2) + var32));
													client.aClass247_8976.method2462(1.0F, 0.0F, 0.0F, Class257.method2541(var12.anInt1296 << 3));
												}
												var12.method1403(Class361.aClass_ra3793, var37, client.aClass247_8976, client.anInt8981, -851394769);
												Class361.aClass_ra3793.method4787(true);
												Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
												if (client.aBoolean9164) {
													Class361.aClass_ra3793.o(var14, var15, var14 + var12.anInt1210, var15 + var12.anInt1348);
												}
												var37.method4475(client.aClass247_8976, null, 1);
												if (!var12.aBoolean1253 && var12.aClass388_1361 != null) {
													Class361.aClass_ra3793.cm(var12.aClass388_1361.method4574());
												}
												if (client.aBoolean9164) {
													Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
												}
												Class361.aClass_ra3793.method4787(false);
												Class361.aClass_ra3793.L();
												Class361.aClass_ra3793.r(arg2, arg3, arg4, arg5);
												if (var12.aBoolean1254) {
													Class361.aClass_ra3793.RA(true);
												}
											}
										} else if (var12.anInt1198 == 9) {
											if (var12.aBoolean1228) {
												var21 = var14;
												var22 = var12.anInt1348 + var15;
												var23 = var14 + var12.anInt1210;
												var24 = var15;
											} else {
												var21 = var14;
												var22 = var15;
												var23 = var14 + var12.anInt1210;
												var24 = var15 + var12.anInt1348;
											}
											if (var12.anInt1227 == 1) {
												Class361.aClass_ra3793.br(var21, var22, var23, var24, var12.anInt1224 | 0xFF000000, 0);
											} else {
												Class361.aClass_ra3793.by(var21, var22, var23, var24, var12.anInt1224 | 0xFF000000, var12.anInt1227, 0);
											}
										}
									}
								} else if (arg10 == -1426748510) {
								}
							} else if (arg10 == -1426748510) {
							}
						}
					} else if (arg10 == -1426748510) {
					}
				} else if (arg10 == -1426748510) {
				}
			}
		} catch (RuntimeException var33) {
			throw Class476.method5964(var33, "x.kq(" + ')');
		}
	}

	public static final void method6409(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 875740189);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class215.method2237(var3, var4, arg0, (short) 24667);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "x.cc(" + ')');
		}
	}

	public static void method6410(Buffer arg0, int arg1, byte arg2) {
		try {
			Class330_Sub47 var3 = new Class330_Sub47();
			var3.anInt7852 = arg0.readUnsignedByte(1733084739);
			var3.anInt7856 = arg0.readInt((byte) 78);
			var3.anIntArray7853 = new int[var3.anInt7852];
			var3.anIntArray7851 = new int[var3.anInt7852];
			var3.aFieldArray7855 = new Field[var3.anInt7852];
			var3.anIntArray7854 = new int[var3.anInt7852];
			var3.aMethodArray7857 = new Method[var3.anInt7852];
			var3.aByteArrayArrayArray7858 = new byte[var3.anInt7852][][];
			for (int var4 = 0; var4 < var3.anInt7852; var4++) {
				try {
					int var5 = arg0.readUnsignedByte(1325383721);
					String var6;
					String var7;
					int var8;
					if (var5 == 0 || var5 == 1 || var5 == 2) {
						var6 = arg0.readString(-117351309);
						var7 = arg0.readString(-1162434101);
						var8 = 0;
						if (var5 == 1) {
							var8 = arg0.readInt((byte) 108);
						}
						var3.anIntArray7853[var4] = var5;
						var3.anIntArray7854[var4] = var8;
						if (Class121.method1447(var6, 1689565292).getClassLoader() == null) {
							throw new SecurityException();
						}
						var3.aFieldArray7855[var4] = Class121.method1447(var6, 1893627833).getDeclaredField(var7);
					} else if (var5 == 3 || var5 == 4) {
						var6 = arg0.readString(993611143);
						var7 = arg0.readString(1483275269);
						var8 = arg0.readUnsignedByte(209844017);
						String[] var9 = new String[var8];
						for (int var10 = 0; var10 < var8; var10++) {
							var9[var10] = arg0.readString(-688144962);
						}
						String var27 = arg0.readString(107419023);
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; var12++) {
								var13 = arg0.readInt((byte) 33);
								var11[var12] = new byte[var13];
								arg0.readBytes(var11[var12], 0, var13, 1274334002);
							}
						}
						var3.anIntArray7853[var4] = var5;
						Class[] var28 = new Class[var8];
						for (var13 = 0; var13 < var8; var13++) {
							var28[var13] = Class121.method1447(var9[var13], 1726089807);
						}
						Class var29 = Class121.method1447(var27, 2142212688);
						if (Class121.method1447(var6, 1783643801).getClassLoader() == null) {
							throw new SecurityException();
						}
						Method[] var14 = Class121.method1447(var6, 1767355687).getDeclaredMethods();
						Method[] var15 = var14;
						for (int var16 = 0; var16 < var15.length; var16++) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var28.length) {
									boolean var19 = true;
									for (int var20 = 0; var20 < var28.length; var20++) {
										if (var18[var20] != var28[var20]) {
											var19 = false;
											break;
										}
									}
									if (var19 && var29 == var17.getReturnType()) {
										var3.aMethodArray7857[var4] = var17;
									}
								}
							}
						}
						var3.aByteArrayArrayArray7858[var4] = var11;
					}
				} catch (ClassNotFoundException var21) {
					var3.anIntArray7851[var4] = -1;
				} catch (SecurityException var22) {
					var3.anIntArray7851[var4] = -2;
				} catch (NullPointerException var23) {
					var3.anIntArray7851[var4] = -3;
				} catch (Exception var24) {
					var3.anIntArray7851[var4] = -4;
				} catch (Throwable var25) {
					var3.anIntArray7851[var4] = -5;
				}
			}
			Class520.aClass471_6016.method5878(var3, (short) 8192);
		} catch (RuntimeException var26) {
			throw Class476.method5964(var26, "x.p(" + ')');
		}
	}
}
