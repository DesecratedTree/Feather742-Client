package deob;

import jaclib.ping.Ping;
import java.util.Iterator;
import java.util.List;

public class Class494 {

	public int anInt5867;

	public int anInt5866;

	public int anInt5869;

	public int anInt5868;

	public int anInt5865;

	public int hashCode() {
		try {
			return this.anInt5867;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uk.hashCode(" + ')');
		}
	}

	public Class494(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.anInt5867 = arg0;
		this.anInt5866 = arg1;
		this.anInt5869 = arg2;
		this.anInt5868 = arg3;
		this.anInt5865 = arg4;
	}

	public static final void method6082(Class430 arg0, int arg1) {
		try {
			boolean var2 = arg0.anIntArray4387[--arg0.anInt4376] == 1;
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7888, var2 ? 2 : 1, 1501590547);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, var2 ? 2 : 1, 1551167623);
			Class282.method2812(1470552195);
			Class435.method5568(1856911935);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uk.ajt(" + ')');
		}
	}

	public static int method6083(int arg0) {
		try {
			if (Class250.anInt2632 == 0) {
				Class517.aClass517_5979.method6210(new Class242("jaclib"), -1522230600);
				if (Class517.aClass517_5979.method6211(-1620246412).method321((byte) -118) != 100) {
					return 1;
				}
				if (!((Class242) Class517.aClass517_5979.method6211(-1846665524)).method2403((short) -28194)) {
					Class394.aClient4082.method3902((short) 255);
					Class373.method4338(-1934900879);
					try {
						Ping.init();
					} catch (Throwable var9) {
					}
				}
				Class250.anInt2632 = 1;
			}
			int var1;
			int var5;
			if (Class250.anInt2632 == 1) {
				Class250.aClass517Array2633 = Class517.method6207(304846430);
				Class517.aClass517_5991.method6210(new Class252(Class382.aClass280_6679), -1522230600);
				Class517.aClass517_5977.method6210(new Class242("jaggl"), -1522230600);
				Class517.aClass517_5978.method6210(new Class242("jagdx"), -1522230600);
				Class517.aClass517_5985.method6210(new Class242("sw3d"), -1522230600);
				Class517.aClass517_5980.method6210(new Class242("hw3d"), -1522230600);
				Class517.aClass517_5981.method6210(new Class242("jagtheora"), -1522230600);
				Class517.aClass517_5982.method6210(new Class252(Class117.aClass280_1387), -1522230600);
				Class517.aClass517_6002.method6210(new Class252(client.aClass280_9286), -1522230600);
				Class517.aClass517_5984.method6210(new Class252(Class283.aClass280_2926), -1522230600);
				Class517.aClass517_5983.method6210(new Class252(Class355.aClass280_3637), -1522230600);
				Class517.aClass517_5986.method6210(new Class252(Class95_Sub11.clientScriptMap), -1522230600);
				Class517.aClass517_5975.method6210(new Class252(Class239.aClass280_2594), -1522230600);
				Class517.aClass517_5988.method6210(new Class252(Class24.aClass280_305), -1522230600);
				Class517.aClass517_5989.method6210(new Class252(Class307.animationDefinitions), -1522230600);
				Class517.aClass517_5990.method6210(new Class252(Player.aClass280_10250), -1522230600);
				Class517.aClass517_6003.method6210(new Class252(Class400.clientVarpBitDefinitions), -1522230600);
				Class517.aClass517_5992.method6210(new Class252(Class62.aClass280_560), -1522230600);
				Class517.aClass517_5993.method6210(new Class252(Class549.aClass280_6285), -1522230600);
				Class517.aClass517_5994.method6210(new Class252(Class330_Sub36_Sub14.aClass280_9719), -1522230600);
				Class517.aClass517_5995.method6210(new Class252(Class538.aClass280_6243), -1522230600);
				Class517.aClass517_5999.method6210(new Class243(Class562.aClass280_6437, "huffman"), -1522230600);
				Class517.aClass517_5996.method6210(new Class252(Class118.aClass280_1393), -1522230600);
				Class517.aClass517_5998.method6210(new Class252(Class543.aClass280_6255), -1522230600);
				Class517.aClass517_5976.method6210(new Class252(Class484.aClass280_5822), -1522230600);
				Class517.aClass517_6000.method6210(new Class262(Class434.aClass280_6560, "details"), -1522230600);
				for (var1 = 0; var1 < Class250.aClass517Array2633.length; var1++) {
					if (Class250.aClass517Array2633[var1].method6211(-1728141082) == null) {
						throw new RuntimeException();
					}
				}
				var1 = 0;
				Class517[] var2 = Class250.aClass517Array2633;
				for (int var3 = 0; var3 < var2.length; var3++) {
					Class517 var4 = var2[var3];
					var5 = var4.method6208(-1138381574);
					int var6 = var4.method6211(2108498894).method321((byte) -97);
					var1 += var6 * var5 / 100;
				}
				Class250.anInt2634 = var1;
				Class250.anInt2632 = 2;
			}
			if (Class250.aClass517Array2633 == null) {
				return 100;
			}
			var1 = 0;
			int var11 = 0;
			boolean var12 = true;
			Class517[] var13 = Class250.aClass517Array2633;
			for (var5 = 0; var5 < var13.length; var5++) {
				Class517 var14 = var13[var5];
				int var7 = var14.method6208(-1138381574);
				int var8 = var14.method6211(2007119373).method321((byte) -22);
				if (var8 < 100) {
					var12 = false;
				}
				var1 += var7;
				var11 += var7 * var8 / 100;
			}
			if (var12) {
				if (!((Class242) Class517.aClass517_5981.method6211(2135121500)).method2403((short) -22634)) {
					client.aBoolean9231 = Class394.aClient4082.method3891((byte) -26);
				}
				Class250.aClass517Array2633 = null;
			}
			var11 -= Class250.anInt2634;
			var1 -= Class250.anInt2634;
			var5 = var1 > 0 ? var11 * 100 / var1 : 100;
			if (!var12 && var5 > 99) {
				var5 = 99;
			}
			return var5;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "uk.r(" + ')');
		}
	}

	public static void method6084(Class_ra arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 >= 0 && arg2 >= 0 && Class484.aClass249_5804 != null) {
				Class381 var4 = client.aClass304_9030.method3022(1776686218);
				Class249 var5 = arg0.cz();
				arg0.ci(Class484.aClass249_5804);
				arg0.cw(Class484.aClass247_5794);
				arg0.r(Class484.anInt5800, Class484.anInt5820, Class484.anInt5802 + Class484.anInt5800, Class484.anInt5820 + Class484.anInt5817);
				arg0.ae(Class484.anInt5800, Class484.anInt5820, Class484.anInt5802, Class484.anInt5817);
				var5.method2508(Class484.aClass247_5794);
				var5.method2483(Class484.aClass249_5804);
				var5.method2485();
				int var6 = arg1 - Class484.anInt5800;
				int var7 = arg2 - Class484.anInt5820;
				int var9;
				int var21;
				int var22;
				int var54;
				if (client.aClass304_9030.method3023(-400722441) != null && (!client.aBoolean9150 || (Class503.anInt5916 & 0x40) != 0)) {
					int var8 = -1;
					var9 = -1;
					float var10 = (float) var6 * 2.0F / (float) Class484.anInt5802 - 1.0F;
					float var11 = (float) var7 * 2.0F / (float) Class484.anInt5817 - 1.0F;
					var5.method2511(var10, var11, -1.0F, Class484.aFloatArray5812);
					float var12 = Class484.aFloatArray5812[0] / Class484.aFloatArray5812[3];
					float var13 = Class484.aFloatArray5812[1] / Class484.aFloatArray5812[3];
					float var14 = Class484.aFloatArray5812[2] / Class484.aFloatArray5812[3];
					var5.method2511(var10, var11, 1.0F, Class484.aFloatArray5812);
					float var15 = Class484.aFloatArray5812[0] / Class484.aFloatArray5812[3];
					float var16 = Class484.aFloatArray5812[1] / Class484.aFloatArray5812[3];
					float var17 = Class484.aFloatArray5812[2] / Class484.aFloatArray5812[3];
					float var18 = Class562.method6476(var12, var13, var14, var15, var16, var17, 4, -775125961);
					if (var18 > 0.0F) {
						float var19 = var15 - var12;
						float var20 = var17 - var14;
						var21 = (int) (var19 * var18 + var12);
						var22 = (int) (var14 + var18 * var20);
						var8 = var21 + (Class263_Sub2.myPlayer.method5453(-597496462) - 1 << 8) >> 9;
						var9 = var22 + (Class263_Sub2.myPlayer.method5453(-1029143523) - 1 << 8) >> 9;
						byte var23 = Class263_Sub2.myPlayer.aByte8658;
						if (var23 < 3 && (client.aClass304_9030.method2995(2000997556).aByteArrayArrayArray2916[1][var21 >> 9][var22 >> 9] & 0x2) != 0) {
							var54 = var23 + 1;
						}
					}
					if (var8 != -1 && var9 != -1) {
						if (client.aBoolean9150 && (Class503.anInt5916 & 0x40) != 0) {
							IComponentDefinitions var43 = Class166.method1993(Class368.anInt3869, client.anInt9151, 534399539);
							if (var43 == null) {
								Class490.method6071(-1799482790);
							} else {
								Class360.method4241(client.aString9152, " " + Class215.aString2082 + " ", Class271.anInt2756, 59, -1, 0L, var8, var9, true, false, (long) (var8 << 32 | var9), true, (short) 140);
							}
						} else {
							if (Class211.aBoolean2061) {
								Class360.method4241(Class526.aClass526_6145.method6257(Class429.aClass454_4369, 991479434), "", -1, 60, -1, 0L, var8, var9, true, false, (long) (var8 << 32 | var9), true, (short) 140);
							}
							Class360.method4241(Class276.aString2861, "", client.anInt9137, 23, -1, 0L, var8, var9, true, false, (long) (var8 << 32 | var9), true, (short) 140);
						}
					}
				}
				Class338 var31 = client.aClass304_9030.method3023(-400722441).aClass338_3697;
				var9 = arg1;
				int var32 = arg2;
				List var33 = var31.aList3373;
				Iterator var34 = var33.iterator();
				label438: do {
					while (var34.hasNext()) {
						Class353 var35 = (Class353) var34.next();
						if (!client.aBoolean9157 && var35.aClass432_Sub1_3489.aByte8658 != Class263_Sub2.myPlayer.aByte8658) {
							continue label438;
						}
						if (var35.method4073(arg0, var9, var32, -1561223091)) {
							boolean var36 = false;
							boolean var37 = false;
							int var38;
							int var39;
							if (var35.aClass432_Sub1_3489 instanceof Class432_Sub1_Sub1) {
								var38 = ((Class432_Sub1_Sub1) var35.aClass432_Sub1_3489).aShort9922;
								var39 = ((Class432_Sub1_Sub1) var35.aClass432_Sub1_3489).aShort9921;
							} else {
								Class260 var40 = var35.aClass432_Sub1_3489.method5346().aClass260_2606;
								var38 = (int) var40.aFloat2716 >> 9;
								var39 = (int) var40.aFloat2711 >> 9;
							}
							Class260 var26;
							int var27;
							int var28;
							int var29;
							int var45;
							if (var35.aClass432_Sub1_3489 instanceof Player) {
								Player var41 = (Player) var35.aClass432_Sub1_3489;
								var45 = var41.method5453(-1711773220);
								Class260 var48 = var41.method5346().aClass260_2606;
								if ((var45 & 0x1) == 0 && ((int) var48.aFloat2716 & 0x1FF) == 0 && ((int) var48.aFloat2711 & 0x1FF) == 0 || (var45 & 0x1) == 1 && ((int) var48.aFloat2716 & 0x1FF) == 256 && ((int) var48.aFloat2711 & 0x1FF) == 256) {
									var21 = (int) var48.aFloat2716 - (var41.method5453(-1771618144) - 1 << 8);
									var22 = (int) var48.aFloat2711 - (var41.method5453(-1728918309) - 1 << 8);
									for (var54 = 0; var54 < client.anInt9017; var54++) {
										Class330_Sub35 var24 = (Class330_Sub35) client.aClass497_9014.method6094((long) client.anIntArray9018[var54]);
										if (var24 != null) {
											NPC var25 = (NPC) var24.anObject7733;
											if (client.anInt8981 != var25.anInt10014) {
												if (var25.aBoolean10012) {
													var26 = var25.method5346().aClass260_2606;
													var27 = (int) var26.aFloat2716 - (var25.aClass551_10251.anInt6295 - 1 << 8);
													var28 = (int) var26.aFloat2711 - (var25.aClass551_10251.anInt6295 - 1 << 8);
													if (var27 >= var21 && var25.aClass551_10251.anInt6295 <= var41.method5453(-1082033193) - (var27 - var21 >> 9) && var28 >= var22 && var25.aClass551_10251.anInt6295 <= var41.method5453(-2048326713) - (var28 - var22 >> 9)) {
														Class411.method5233(var25, Class263_Sub2.myPlayer.aByte8658 != var35.aClass432_Sub1_3489.aByte8658, -48366217);
														var25.anInt10014 = client.anInt8981;
													}
												} else if (arg3 != 571238882) {
													return;
												}
											}
										} else if (arg3 != 571238882) {
										}
									}
									var54 = Class15.anInt192;
									int[] var56 = Class15.anIntArray187;
									for (int var62 = 0; var62 < var54; var62++) {
										Player var65 = client.players[var56[var62]];
										if (var65 != null && var65.anInt10014 != client.anInt8981 && var65 != var41) {
											if (var65.aBoolean10012) {
												Class260 var70 = var65.method5346().aClass260_2606;
												var28 = (int) var70.aFloat2716 - (var65.method5453(-1540154324) - 1 << 8);
												var29 = (int) var70.aFloat2711 - (var65.method5453(-974930706) - 1 << 8);
												if (var28 >= var21 && var65.method5453(-299636042) <= var41.method5453(-1465405001) - (var28 - var21 >> 9) && var29 >= var22 && var65.method5453(-1955704316) <= var41.method5453(-1017325845) - (var29 - var22 >> 9)) {
													Class497.method6103(var65, var35.aClass432_Sub1_3489.aByte8658 != Class263_Sub2.myPlayer.aByte8658, 1461262869);
													var65.anInt10014 = client.anInt8981;
												}
											} else if (arg3 != 571238882) {
												return;
											}
										}
									}
								}
								if (var41.anInt10014 == client.anInt8981) {
									if (arg3 != 571238882) {
										return;
									}
									continue;
								}
								Class497.method6103(var41, var35.aClass432_Sub1_3489.aByte8658 != Class263_Sub2.myPlayer.aByte8658, 1703070625);
								var41.anInt10014 = client.anInt8981;
							}
							int var61;
							int var68;
							if (var35.aClass432_Sub1_3489 instanceof NPC) {
								NPC var42 = (NPC) var35.aClass432_Sub1_3489;
								if (var42.aClass551_10251 != null) {
									Class260 var47 = var42.method5346().aClass260_2606;
									if ((var42.aClass551_10251.anInt6295 & 0x1) == 0 && ((int) var47.aFloat2716 & 0x1FF) == 0 && ((int) var47.aFloat2711 & 0x1FF) == 0 || (var42.aClass551_10251.anInt6295 & 0x1) == 1 && ((int) var47.aFloat2716 & 0x1FF) == 256 && ((int) var47.aFloat2711 & 0x1FF) == 256) {
										int var49 = (int) var47.aFloat2716 - (var42.aClass551_10251.anInt6295 - 1 << 8);
										var21 = (int) var47.aFloat2711 - (var42.aClass551_10251.anInt6295 - 1 << 8);
										for (var22 = 0; var22 < client.anInt9017; var22++) {
											Class330_Sub35 var58 = (Class330_Sub35) client.aClass497_9014.method6094((long) client.anIntArray9018[var22]);
											if (var58 != null) {
												NPC var59 = (NPC) var58.anObject7733;
												if (client.anInt8981 != var59.anInt10014 && var42 != var59) {
													if (var59.aBoolean10012) {
														Class260 var64 = var59.method5346().aClass260_2606;
														var68 = (int) var64.aFloat2716 - (var59.aClass551_10251.anInt6295 - 1 << 8);
														var27 = (int) var64.aFloat2711 - (var59.aClass551_10251.anInt6295 - 1 << 8);
														if (var68 >= var49 && var59.aClass551_10251.anInt6295 <= var42.aClass551_10251.anInt6295 - (var68 - var49 >> 9) && var27 >= var21 && var59.aClass551_10251.anInt6295 <= var42.aClass551_10251.anInt6295 - (var27 - var21 >> 9)) {
															Class411.method5233(var59, var35.aClass432_Sub1_3489.aByte8658 != Class263_Sub2.myPlayer.aByte8658, -1208420560);
															var59.anInt10014 = client.anInt8981;
														}
													} else if (arg3 != 571238882) {
														throw new IllegalStateException();
													}
												}
											} else if (arg3 != 571238882) {
												throw new IllegalStateException();
											}
										}
										var22 = Class15.anInt192;
										int[] var60 = Class15.anIntArray187;
										for (var61 = 0; var61 < var22; var61++) {
											Player var66 = client.players[var60[var61]];
											if (var66 != null && var66.anInt10014 != client.anInt8981) {
												if (var66.aBoolean10012) {
													var26 = var66.method5346().aClass260_2606;
													var27 = (int) var26.aFloat2716 - (var66.method5453(-1968581438) - 1 << 8);
													var28 = (int) var26.aFloat2711 - (var66.method5453(-1950825666) - 1 << 8);
													if (var27 >= var49 && var66.method5453(-643151750) <= var42.aClass551_10251.anInt6295 - (var27 - var49 >> 9) && var28 >= var21 && var66.method5453(-598492352) <= var42.aClass551_10251.anInt6295 - (var28 - var21 >> 9)) {
														Class497.method6103(var66, Class263_Sub2.myPlayer.aByte8658 != var35.aClass432_Sub1_3489.aByte8658, 1129218400);
														var66.anInt10014 = client.anInt8981;
													}
												} else if (arg3 != 571238882) {
													throw new IllegalStateException();
												}
											}
										}
									}
									if (client.anInt8981 == var42.anInt10014) {
										if (arg3 != 571238882) {
											throw new IllegalStateException();
										}
										continue;
									}
									Class411.method5233(var42, var35.aClass432_Sub1_3489.aByte8658 != Class263_Sub2.myPlayer.aByte8658, -655767776);
									var42.anInt10014 = client.anInt8981;
								}
							}
							if (var35.aClass432_Sub1_3489 instanceof Class432_Sub1_Sub2_Sub1) {
								int var44 = var38 + var4.gameSceneBaseX;
								var45 = var39 + var4.gameSceneBaseY;
								Class330_Sub9 var51 = (Class330_Sub9) client.aClass497_9138.method6094((long) (var35.aClass432_Sub1_3489.aByte8658 << 28 | var45 << 14 | var44));
								if (var51 != null) {
									var21 = 0;
									Class330_Sub3 var55 = (Class330_Sub3) var51.aClass471_7573.method5871((byte) -113);
									while (var55 != null) {
										ItemDefinitions var63 = Class556.aClass510_6392.getItemDefinitions(var55.anInt7513, (byte) -44);
										if (var63.aBoolean6716) {
											var61 = var63.anInt6713;
										} else if (var63.aBoolean6707) {
											var61 = Class534.aClass412_6788.anInt4253;
										} else {
											var61 = Class534.aClass412_6788.anInt4254;
										}
										if (client.aBoolean9150 && var35.aClass432_Sub1_3489.aByte8658 == Class263_Sub2.myPlayer.aByte8658) {
											Class537 var67 = OutgoingPacket.anInt2579 == -1 ? null : Class301.aClass543_3059.method6339(OutgoingPacket.anInt2579, -876957206);
											if ((Class503.anInt5916 & 0x1) != 0 && (var67 == null || var63.method6287(OutgoingPacket.anInt2579, var67.anInt6235, 1309923611) != var67.anInt6235)) {
												Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + Class146.method1738(var61, -849826454) + var63.name, Class271.anInt2756, 17, -1, (long) var55.anInt7513, var38, var39, true, false, (long) var21, false, (short) 140);
											}
										}
										if (Class263_Sub2.myPlayer.aByte8658 == var35.aClass432_Sub1_3489.aByte8658) {
											String[] var69 = var63.groundOptions;
											for (var68 = var69.length - 1; var68 >= 0; var68--) {
												if (var69[var68] != null) {
													short var71 = 0;
													var28 = client.anInt9148;
													if (var68 == 0) {
														var71 = 18;
													}
													if (var68 == 1) {
														var71 = 19;
													}
													if (var68 == 2) {
														var71 = 20;
													}
													if (var68 == 3) {
														var71 = 21;
													}
													if (var68 == 4) {
														var71 = 22;
													}
													if (var68 == 5) {
														var71 = 1004;
													}
													var29 = var63.method6289(var68, 1135555263);
													if (var29 != -1) {
														var28 = var29;
													}
													Class360.method4241(var69[var68], Class146.method1738(var61, -849826454) + var63.name, var28, var71, -1, (long) var55.anInt7513, var38, var39, true, false, (long) var21, false, (short) 140);
												}
											}
										}
										var55 = (Class330_Sub3) var51.aClass471_7573.method5874(-1661705827);
										var21++;
									}
								}
							}
							if (var35.aClass432_Sub1_3489 instanceof Interface2) {
								Interface2 var46 = (Interface2) var35.aClass432_Sub1_3489;
								Class473 var50 = client.aClass304_9030.method3025((byte) 13).method5705(var46.method34((short) -28471), (byte) -78);
								if (var50.anIntArray5678 != null) {
									var50 = var50.method5900(Class158.aClass561_6474, (byte) -72);
								}
								if (var50 != null) {
									if (client.aBoolean9150 && var35.aClass432_Sub1_3489.aByte8658 == Class263_Sub2.myPlayer.aByte8658) {
										Class537 var52 = OutgoingPacket.anInt2579 == -1 ? null : Class301.aClass543_3059.method6339(OutgoingPacket.anInt2579, -254533846);
										if ((Class503.anInt5916 & 0x4) != 0 && (var52 == null || var50.method5901(OutgoingPacket.anInt2579, var52.anInt6235, 1580513929) != var52.anInt6235)) {
											Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + Class146.method1738(65535, -849826454) + var50.aString5618, Class271.anInt2756, 2, -1, Class112.method1372(var46, var38, var39, 1450998092), var38, var39, true, false, (long) var46.hashCode(), false, (short) 140);
										}
									}
									if (Class263_Sub2.myPlayer.aByte8658 == var35.aClass432_Sub1_3489.aByte8658) {
										String[] var53 = var50.aStringArray5649;
										if (var53 != null) {
											for (var21 = var53.length - 1; var21 >= 0; var21--) {
												if (var53[var21] != null) {
													short var57 = 0;
													var54 = client.anInt9148;
													if (var21 == 0) {
														var57 = 3;
													}
													if (var21 == 1) {
														var57 = 4;
													}
													if (var21 == 2) {
														var57 = 5;
													}
													if (var21 == 3) {
														var57 = 6;
													}
													if (var21 == 4) {
														var57 = 1001;
													}
													if (var21 == 5) {
														var57 = 1002;
													}
													var61 = var50.method5908(var21, -1655813558);
													if (var61 != -1) {
														var54 = var61;
													}
													Class360.method4241(var53[var21], Class146.method1738(65535, -849826454) + var50.aString5618, var54, var57, -1, Class112.method1372(var46, var38, var39, 1132960312), var38, var39, true, false, (long) var46.hashCode(), false, (short) 140);
												}
											}
										}
									}
								} else if (arg3 != 571238882) {
								}
							}
						} else if (arg3 != 571238882) {
						}
					}
					return;
				} while (arg3 == 571238882);
			}
		} catch (RuntimeException var30) {
			throw Class476.method5964(var30, "uk.a(" + ')');
		}
	}

	public static void method6085(Class549_Sub1 arg0, byte arg1) {
		try {
			arg0.method6362(0, (byte) 57);
			byte var2;
			if (Class332.anInt6617 >= 96) {
				int var3 = Class372.method4335((byte) 107);
				if (var3 <= 103) {
					Class283.method2828(-817082595);
					var2 = 4;
				} else if (var3 <= 500) {
					Class95_Sub12_Sub1.method1141(-1892843887);
					var2 = 3;
				} else if (var3 <= 1001) {
					Class51.method634(1235653257);
					var2 = 2;
				} else {
					Class330_Sub18.method3342(true, 1275568489);
					var2 = 1;
				}
				arg0.method6363(0, var3, (byte) 91);
			} else {
				Class330_Sub18.method3342(true, -659284292);
				var2 = 1;
				arg0.method6361(64, -2144652853);
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(581894501) == 0) {
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, 1712482685);
			} else {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 0, -1652825798);
				Class171.method2046(0, false, 1920957857);
			}
			Class435.method5568(2089116244);
			arg0.method6360(var2, 95955317);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uk.o(" + ')');
		}
	}
}
