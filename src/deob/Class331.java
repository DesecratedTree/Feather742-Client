package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class331 {

	public static Class331 aClass331_3343 = new Class331();

	public static Class331 aClass331_3344 = new Class331();

	public static Class331 aClass331_3345 = new Class331();

	public static final void method3874(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class372 var3 = Class79.aClass380_666.method4387(var2, (byte) -101);
			if (var3.aString3909 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString3909;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nu.aoc(" + ')');
		}
	}

	public static final void method3875(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			boolean var3 = true;
			if (var2 < 0) {
				var3 = (var2 + 1) % 4 == 0;
			} else if (var2 < 1582) {
				var3 = var2 % 4 == 0;
			} else if (var2 % 4 != 0) {
				var3 = false;
			} else if (var2 % 100 != 0) {
				var3 = true;
			} else if (var2 % 400 != 0) {
				var3 = false;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nu.ams(" + ')');
		}
	}

	public static final void method3876(short arg0) {
		try {
			if (client.anInt9026 > 1) {
				client.anInt9026--;
				client.anInt9208 = client.anInt9268;
			}
			if (client.aClass1_9025.aBoolean37) {
				client.aClass1_9025.aBoolean37 = false;
				Class291_Sub1.method2907(91912557);
			} else {
				if (!Class484.aBoolean5782) {
					Class_ta.method5676(1324006253);
				}
				for (int var1 = 0; var1 < 100; var1++) {
					if (!Class432_Sub1_Sub4_Sub1.method5539(client.aClass1_9025, -1379939382)) {
						if (arg0 >= 255) {
						}
						break;
					}
				}
				if (client.anInt8995 == 1) {
					int var2;
					Class330_Sub34 var15;
					while (Class513.method6196(-895388267)) {
						var15 = Class238.method2377(OutgoingPacket.aClass234_2563, client.aClass1_9025.aClass488_22, 926655254);
						var15.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 62);
						var2 = var15.aClass330_Sub46_Sub2_7729.offset;
						Class12.method435(var15.aClass330_Sub46_Sub2_7729, (byte) 0);
						var15.aClass330_Sub46_Sub2_7729.method3751(var15.aClass330_Sub46_Sub2_7729.offset - var2, -2065658084);
						client.aClass1_9025.method378(var15, -1404587260);
					}
					if (Class95_Sub5.aClass422_7146 == null) {
						if (Class312.method3111((byte) 47) >= Class198.aLong1925) {
							Class95_Sub5.aClass422_7146 = client.aClass423_9029.method5298(Class507.aClass498_5930.aString5886, -1556529629);
						}
					} else if (Class95_Sub5.aClass422_7146.anInt4319 != -1) {
						var15 = Class238.method2377(OutgoingPacket.aClass234_2561, client.aClass1_9025.aClass488_22, 1928404374);
						if (Class412.aGarbageCollectorMXBean4257 == null || !Class412.aGarbageCollectorMXBean4257.isValid()) {
							try {
								Iterator var17 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (var17.hasNext()) {
									GarbageCollectorMXBean var3 = (GarbageCollectorMXBean) var17.next();
									if (var3.isValid()) {
										Class412.aGarbageCollectorMXBean4257 = var3;
										client.aLong9153 = -1L;
										client.aLong9267 = -1L;
									}
								}
							} catch (Throwable var13) {
							}
						}
						long var18 = Class312.method3111((byte) 108);
						int var4 = -1;
						if (Class412.aGarbageCollectorMXBean4257 != null) {
							long var5 = Class412.aGarbageCollectorMXBean4257.getCollectionTime();
							if (client.aLong9267 != -1L) {
								long var7 = var5 - client.aLong9267;
								long var9 = var18 - client.aLong9153;
								if (var9 != 0L) {
									var4 = (int) (var7 * 100L / var9);
								}
							}
							client.aLong9267 = var5;
							client.aLong9153 = var18;
						}
						var15.aClass330_Sub46_Sub2_7729.addByteS(client.anInt6603, 2122635192);
						var15.aClass330_Sub46_Sub2_7729.addByteS(var4, 1314294435);
						var15.aClass330_Sub46_Sub2_7729.addShortA(Class95_Sub5.aClass422_7146.anInt4319, -1157074887);
						client.aClass1_9025.method378(var15, -517901652);
						Class95_Sub5.aClass422_7146 = null;
						Class198.aLong1925 = var18 + 30000L;
					}
					Class198.method2153(1711899375);
					Class462.method5702(1228581246);
					Class330_Sub44 var16 = (Class330_Sub44) client.aClass471_8997.method5869(539664854);
					if (client.aClass304_9030.method3023(-400722441) != null) {
						if (Class147.anInt1621 == 3) {
							Class250.method2520((byte) -99);
						} else if (Class147.anInt1621 == 1) {
							Class353.method4078((byte) 42);
						}
					}
					if (client.aBoolean9074) {
						client.aBoolean9074 = false;
					} else {
						client.aFloat9124 /= 2.0F;
					}
					if (client.aBoolean9075) {
						client.aBoolean9075 = false;
					} else {
						client.aFloat9072 /= 2.0F;
					}
					Class381 var20;
					if (Class353.method4076((byte) -43)) {
						Class108.method1350(316677539);
					} else {
						try {
							if (Class147.anInt1621 != 2) {
								Class401_Sub1.aClass145_Sub1_8249.method1673(Class130.aClass130_1495, (byte) 108);
								if (Class401_Sub1.aClass145_Sub1_8249.method1707(1832355563) == null) {
									Class401_Sub1.aClass145_Sub1_8249.method1674(Class136.aClass136_1524, false, 1213337437);
								}
								if (Class401_Sub1.aClass145_Sub1_8249.method1715(-1340050610) == null) {
									Class401_Sub1.aClass145_Sub1_8249.method1696(Class146.aClass146_1607, false, (byte) -18);
								}
								if (Class401_Sub1.aClass145_Sub1_8249.method1693(-898154364) != Class136.aClass136_1524) {
									Class401_Sub1.aClass145_Sub1_8249.method1674(Class136.aClass136_1524, false, 1147045339);
								}
								Class401_Sub1.aClass145_Sub1_8249.method1678(Class260.method2577(99999.0F, 99999.0F, 99999.0F), (byte) -43);
								Class401_Sub1.aClass145_Sub1_8249.method1684(Class260.method2577(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (byte) -20);
								Class166_Sub1 var19 = (Class166_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1707(1828614637);
								var20 = client.aClass304_9030.method3022(-998954287);
								var19.method1997(Class512.method6189(Class85.anInt712, Class471.anInt5612 + var20.gameSceneBaseX * 512, -Gfx.anInt578, Class325_Sub3.anInt7484 + var20.gameSceneBaseY * 512, 2009420278), (byte) 101);
								if (Class401_Sub1.aClass145_Sub1_8249.method1718(1736826387) != Class146.aClass146_1607) {
									Class401_Sub1.aClass145_Sub1_8249.method1696(Class146.aClass146_1607, false, (byte) -3);
								}
								Class401_Sub1.aClass145_Sub1_8249.method1716(Class260.method2577(99999.0F, 99999.0F, 99999.0F), -398585119);
								Class401_Sub1.aClass145_Sub1_8249.method1676(Class260.method2577(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -224519221);
								Class475_Sub4 var26 = (Class475_Sub4) Class401_Sub1.aClass145_Sub1_8249.method1715(1605914806);
								var26.method5956(Class263_Sub2.myPlayer.method79(694177009), -545306617);
							}
							Class401_Sub1.aClass145_Sub1_8249.method1677((float) (Class312.method3111((byte) 96) - Class483.aLong5774) / 1000.0F, client.aClass304_9030.method2996(Class85.anInt712, 1875135057), client.aClass304_9030.method3001((byte) 124).anIntArrayArrayArray2793, -276171327);
							Class483.aLong5774 = Class312.method3111((byte) 90);
						} catch (Exception_Sub4 var12) {
						}
					}
					Class159_Sub1.method1875(-1375405766);
					if (client.anInt8995 == 1) {
						client.aClass304_9030.method3008(1098521028).method4589(client.aClass304_9030, 293125111);
						Class64.method776(2094664761);
						Class208.method2207(-1935357213);
						if (client.anInt9199 > 10) {
							client.aClass1_9025.anInt30++;
						}
						if (client.aClass1_9025.anInt30 > 2250) {
							Class291_Sub1.method2907(-805603873);
						} else {
							if (client.anInt8987 == 2) {
								Class76_Sub2.method911(655177390);
								Class334.method3933((byte) -100);
							} else if (Class274_Sub1.aClass411_7413.anInterface20_4245.method283(var16, client.anInterface18Array9004, client.anInt9003, Class238.aClass355_2583, (byte) 26)) {
								Class10.method426(false, 609697129);
							} else {
								if (client.anInt8987 == 4 && Class263_Sub2.method2623(client.anInt9265, -2031927868)) {
									client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3212, null), 1977327619);
									client.anInt8987 = 3;
								}
								if (client.anInt8987 == 3 && client.anInt8995 != 16) {
									Class96.aClass497_857.method6100(65280);
									client.anInt8987 = 0;
									client.anInt9040 = client.anInt8981;
									client.anInt9041 = 0;
									Class423.method5301(-1840397717);
								}
								if (client.anInt8987 == 0) {
									var2 = client.anInt8981 - client.anInt9040;
									if (client.anInt9041 < Class467.aClass95Array5599.length) {
										while (true) {
											Class95 var22 = Class467.aClass95Array5599[client.anInt9041];
											if (var22.anInt851 > var2) {
												if (arg0 >= 255) {
												}
												break;
											}
											var22.method1095(2139144293);
											if (client.anInt8987 != 0) {
												break;
											}
											if (++client.anInt9041 >= Class467.aClass95Array5599.length) {
												if (arg0 >= 255) {
													return;
												}
												break;
											}
										}
									}
									if (client.anInt8987 == 0) {
										for (int var24 = 0; var24 < Class96.aClass85Array854.length; var24++) {
											Class85 var27 = Class96.aClass85Array854[var24];
											if (var27.aBoolean705) {
												Class432_Sub1_Sub1_Sub1 var28 = var27.method973(-1160484525);
												Class520.method6223(var28, true, -1427272240);
											} else if (arg0 >= 255) {
											}
										}
									}
								}
							}
							Buffer.method3815((byte) 62);
							Class268.method2663(1719688515);
							Class500.method6122((byte) -59);
							client.anInt9210++;
							if (client.anInt9062 != 0) {
								client.anInt9101 += 20;
								if (client.anInt9101 >= 400) {
									client.anInt9062 = 0;
								}
							}
							if (Class64.aClass114_569 != null) {
								client.anInt9103++;
								if (client.anInt9103 >= 15) {
									Class404.method4738(Class64.aClass114_569, 595623494);
									Class64.aClass114_569 = null;
								}
							}
							client.aClass114_9200 = null;
							client.aBoolean9175 = false;
							client.aBoolean9170 = false;
							Class354_Sub1.aClass114_7976 = null;
							Class198.method2155(null, -1, -1, 325168703);
							if (!client.aBoolean9150) {
								client.anInt9147 = -1;
							}
							Class415.method5247(2022060179);
							client.anInt9268++;
							Class330_Sub34 var21;
							if (client.aBoolean9254) {
								System.out.println("Coordinations:" + Class166.anInt1700 + ", " + Class464_Sub27.anInt8725 + ", " + Class268.anInt2748);
								var21 = Class238.method2377(OutgoingPacket.CLOSE_WORLD_MAP_PACKET, client.aClass1_9025.aClass488_22, 1674283186);
								var21.aClass330_Sub46_Sub2_7729.addInt(Class166.anInt1700 << 28 | Class464_Sub27.anInt8725 << 14 | Class268.anInt2748, 15);
								client.aClass1_9025.method378(var21, -505482364);
								client.aBoolean9254 = false;
							}
							while (true) {
								while (true) {
									Class330_Sub42 var23 = (Class330_Sub42) client.aClass471_9209.method5867((short) 8960);
									IComponentDefinitions var25;
									IComponentDefinitions var29;
									if (var23 == null) {
										if (arg0 >= 255) {
										}
										while (true) {
											while (true) {
												var23 = (Class330_Sub42) client.aClass471_9219.method5867((short) 8960);
												if (var23 == null) {
													if (arg0 >= 255) {
														throw new IllegalStateException();
													}
													while (true) {
														while (true) {
															var23 = (Class330_Sub42) client.aClass471_9280.method5867((short) 8960);
															if (var23 == null) {
																if (arg0 >= 255) {
																	throw new IllegalStateException();
																}
																if (Class354_Sub1.aClass114_7976 == null) {
																	client.anInt9179 = 0;
																}
																if (client.aClass114_9165 != null) {
																	Class138.method1606((byte) 1);
																}
																Class157.method1830(-1404292361);
																if (client.anInt9182 > 0 && Class238.aClass355_2583.isKeyHeld(82, 1087324266) && Class238.aClass355_2583.isKeyHeld(81, 1101561335) && client.mouseNotches != 0) {
																	var2 = Class263_Sub2.myPlayer.aByte8658 - client.mouseNotches;
																	if (var2 < 0) {
																		var2 = 0;
																	} else if (var2 > 3) {
																		var2 = 3;
																	}
																	var20 = client.aClass304_9030.method3022(-1017473696);
																	Class144.method1671(var2, Class263_Sub2.myPlayer.anIntArray10018[0] + var20.gameSceneBaseX, var20.gameSceneBaseY + Class263_Sub2.myPlayer.anIntArray10059[0], -80060749);
																}
																for (var2 = 0; var2 < 5; var2++) {
																	int var10002 = client.anIntArray9046[var2]++;
																}
																if (client.aBoolean9206 && client.aLong8990 < Class312.method3111((byte) 45) - 60000L) {
																	Class330_Sub11.method3291(-1726849227);
																}
																for (Class325_Sub5 var30 = (Class325_Sub5) client.aClass467_9260.method5854(-216609499); var30 != null; var30 = (Class325_Sub5) client.aClass467_9260.method5857(-1964236973)) {
																	if ((long) var30.anInt7487 < Class312.method3111((byte) 94) / 1000L - 5L) {
																		if (var30.aShort7489 > 0) {
																			Class556.method6406(5, 0, "", "", "", var30.aString7488 + Class526.aClass526_6165.method6257(Class429.aClass454_4369, 991479434), -1791250225);
																		}
																		if (var30.aShort7489 == 0) {
																			Class556.method6406(5, 0, "", "", "", var30.aString7488 + Class526.aClass526_6159.method6257(Class429.aClass454_4369, 991479434), -1650728746);
																		}
																		var30.method3204(209569057);
																	}
																}
																client.anInt9197++;
																if (client.anInt9197 > 503) {
																	client.anInt9197 = 0;
																	var2 = (int) (Math.random() * 8.0D);
																	if ((var2 & 0x1) == 1) {
																		client.anInt9156 += client.anInt9055;
																	}
																	if ((var2 & 0x2) == 2) {
																		client.anInt9056 += client.anInt9057;
																	}
																	if ((var2 & 0x4) == 4) {
																		client.anInt9058 += client.anInt9168;
																	}
																}
																if (client.anInt9156 < -52) {
																	client.anInt9055 = 2;
																}
																if (client.anInt9156 > 54) {
																	client.anInt9055 = -2;
																}
																if (client.anInt9056 < -57) {
																	client.anInt9057 = 2;
																}
																if (client.anInt9056 > 64) {
																	client.anInt9057 = -2;
																}
																if (client.anInt9058 < -40) {
																	client.anInt9168 = 1;
																}
																if (client.anInt9058 > 44) {
																	client.anInt9168 = -1;
																}
																client.anInt9131++;
																if (client.anInt9131 > 503) {
																	client.anInt9131 = 0;
																	var2 = (int) (Math.random() * 8.0D);
																	if ((var2 & 0x1) == 1) {
																		client.anInt9149 += client.anInt8978;
																	}
																	if ((var2 & 0x2) == 2) {
																		client.anInt9063 += client.anInt9049;
																	}
																}
																if (client.anInt9149 < -61) {
																	client.anInt8978 = 2;
																}
																if (client.anInt9149 > 64) {
																	client.anInt8978 = -2;
																}
																if (client.anInt9063 < -20) {
																	client.anInt9049 = 1;
																}
																if (client.anInt9063 > 10) {
																	client.anInt9049 = -1;
																}
																client.aClass1_9025.anInt29++;
																if (client.aClass1_9025.anInt29 > 50) {
																	var21 = Class238.method2377(OutgoingPacket.PING_PACKET, client.aClass1_9025.aClass488_22, 475273273);
																	client.aClass1_9025.method378(var21, -51491010);
																}
																if (client.aBoolean9114) {
																	Class419.method5279(-374810341);
																	client.aBoolean9114 = false;
																}
																try {
																	client.aClass1_9025.method381(1544190798);
																} catch (IOException var11) {
																	Class291_Sub1.method2907(-86093097);
																}
																return;
															}
															var25 = var23.aClass114_7809;
															if (var25.anInt1287 >= 0) {
																var29 = Class95.method1101(var25.anInt1211, 452721389);
																if (var29 == null || var29.aClass114Array1347 == null || var25.anInt1287 >= var29.aClass114Array1347.length) {
																	continue;
																}
																if (var29.aClass114Array1347[var25.anInt1287] != var25) {
																	if (arg0 >= 255) {
																		return;
																	}
																	continue;
																}
															}
															Class117.method1423(var23, -1631194987);
														}
													}
												}
												var25 = var23.aClass114_7809;
												if (var25.anInt1287 >= 0) {
													var29 = Class95.method1101(var25.anInt1211, 1681843331);
													if (var29 == null || var29.aClass114Array1347 == null || var25.anInt1287 >= var29.aClass114Array1347.length) {
														continue;
													}
													if (var29.aClass114Array1347[var25.anInt1287] != var25) {
														if (arg0 >= 255) {
															return;
														}
														continue;
													}
												}
												Class117.method1423(var23, -1631194987);
											}
										}
									}
									var25 = var23.aClass114_7809;
									if (var25.anInt1287 >= 0) {
										var29 = Class95.method1101(var25.anInt1211, 2007161054);
										if (var29 == null || var29.aClass114Array1347 == null || var25.anInt1287 >= var29.aClass114Array1347.length) {
											continue;
										}
										if (var25 != var29.aClass114Array1347[var25.anInt1287]) {
											if (arg0 >= 255) {
												return;
											}
											continue;
										}
									}
									Class117.method1423(var23, -1631194987);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "nu.gc(" + ')');
		}
	}

	public static int method3877(CharSequence arg0, int arg1) {
		try {
			int var2 = arg0.length();
			int var3 = 0;
			for (int var4 = 0; var4 < var2; var4++) {
				var3 = (var3 << 5) - var3 + ItemEquipDefinitions.method6216(arg0.charAt(var4), -1709325533);
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nu.n(" + ')');
		}
	}
}
