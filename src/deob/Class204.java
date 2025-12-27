package deob;

public class Class204 implements Interface10 {

	public int anInt6513;

	public Class195 aClass195_6512;

	public Class211 aClass211_6514;

	public int anInt6515;

	public int anInt6516;

	public static int anInt6517;

	public Class198 method161() {
		return Class198.aClass198_1920;
	}

	public Class204(int arg0, Class195 arg1, Class211 arg2, int arg3, int arg4) {
		this.anInt6513 = arg0;
		this.aClass195_6512 = arg1;
		this.aClass211_6514 = arg2;
		this.anInt6515 = arg3;
		this.anInt6516 = arg4;
	}

	public Class198 method160() {
		return Class198.aClass198_1920;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1920;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.j(" + ')');
		}
	}

	public static final void method2180(Class430 arg0, short arg1) {
		try {
			arg0.anInt4380--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.bo(" + ')');
		}
	}

	public static final void method2181(Class430 arg0, int arg1) {
		try {
			Class232.aClass232_2458.method2357(1367286494);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.agj(" + ')');
		}
	}

	public static final void method2182(Class213 arg0, int arg1) {
		try {
			Class330_Sub46_Sub2 var2 = client.aClass1_9025.aClass330_Sub46_Sub2_17;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var12;
			int var13;
			int var31;
			if (arg0 == Class213.aClass213_2075) {
				var3 = var2.readUnsignedByte(687968312);
				var4 = Class153.anInt1634 + (var3 >> 4 & 0x7);
				var5 = (var3 & 0x7) + IsaacCipher.anInt5837;
				var6 = var2.readUnsignedShort(1753745904);
				if (var6 == 65535) {
					var6 = -1;
				}
				var7 = var2.readUnsignedShort(12386264);
				var8 = var2.readUnsignedShort(481364777);
				var9 = var2.readUnsignedByte(646921925);
				var10 = var2.readShort(-1100583751);
				if (client.aClass304_9030.method2985(-2000724256) != OutgoingPacketManager.aClass310_3212 && var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-561354872) && var5 < client.aClass304_9030.method3033((byte) 8)) {
					if (var6 == -1) {
						Class330_Sub36_Sub2 var11 = (Class330_Sub36_Sub2) client.aClass497_9216.method6094((long) (var4 << 16 | var5));
						if (var11 != null) {
							var11.aClass432_Sub1_Sub1_Sub4_9624.method5503(888749273);
							var11.method3252(1331464088);
						}
					} else {
						var31 = var4 * 512 + 256;
						var12 = var5 * 512 + 256;
						var13 = Class1.anInt39;
						if (var13 < 3 && client.aClass304_9030.method2995(2120248897).method2788(var4, var5, (byte) -22)) {
							var13++;
						}
						Class432_Sub1_Sub1_Sub4 var14 = new Class432_Sub1_Sub1_Sub4(client.aClass304_9030.method3023(-400722441), var6, var8, Class1.anInt39, var13, var31, Class431.method5342(var31, var12, Class1.anInt39, 1996761881) - var7, var12, var4, var4, var5, var5, var9, false, var10);
						client.aClass497_9216.method6097(new Class330_Sub36_Sub2(var14), (long) (var4 << 16 | var5));
					}
				}
			} else if (arg0 == Class213.aClass213_2067) {
				var3 = var2.readInt1((byte) 2);
				var4 = var2.readUnsignedByteS(-400233324);
				var5 = var4 >> 2;
				var6 = var4 & 0x3;
				var7 = client.anIntArray9036[var5];
				var8 = var2.readUnsignedByte(-234562340);
				var9 = (var8 >> 4 & 0x7) + Class153.anInt1634;
				var10 = (var8 & 0x7) + IsaacCipher.anInt5837;
				if (client.aClass304_9030.method2985(-2130248212) != OutgoingPacketManager.aClass310_3212) {
					Class147.method1744(Class1.anInt39, var9, var10, var7, var5, var6, var3, -1319057223);
				}
			} else {
				Class381 var24;
				if (arg0 == Class213.aClass213_2072) {
					var3 = var2.readUnsignedLEShort(15163594);
					var4 = var2.readUnsignedByteS(-400233324);
					var24 = client.aClass304_9030.method3022(1280086314);
					var6 = IsaacCipher.anInt5837 + (var4 & 0x7);
					var7 = var24.gameSceneBaseY + var6;
					var8 = Class153.anInt1634 + (var4 >> 4 & 0x7);
					var9 = var8 + var24.gameSceneBaseX;
					Class330_Sub9 var28 = (Class330_Sub9) client.aClass497_9138.method6094((long) (Class1.anInt39 << 28 | var7 << 14 | var9));
					if (var28 != null) {
						for (Class330_Sub3 var33 = (Class330_Sub3) var28.aClass471_7573.method5869(539664854); var33 != null; var33 = (Class330_Sub3) var28.aClass471_7573.method5873((byte) -23)) {
							if (var33.anInt7513 == (var3 & 0x7FFF)) {
								var33.method3252(-415448584);
								break;
							}
						}
						if (var28.aClass471_7573.method5876(-1286769633)) {
							var28.method3252(-845971576);
						}
						if (var8 >= 0 && var6 >= 0 && var8 < client.aClass304_9030.method2990(-1360696539) && var6 < client.aClass304_9030.method3033((byte) -126)) {
							Class343.method4001(Class1.anInt39, var8, var6, -334637075);
						}
					}
				} else if (Class213.aClass213_2076 == arg0) {
					var2.readUnsignedByte(2071169702);
					var3 = var2.readUnsignedByte(1213079441);
					var4 = Class153.anInt1634 + (var3 >> 4 & 0x7);
					var5 = IsaacCipher.anInt5837 + (var3 & 0x7);
					var6 = var2.readUnsignedShort(-130816981);
					var7 = var2.readUnsignedByte(281468919);
					var8 = var2.readUnsignedTriByte(-1401356047);
					String var25 = var2.readString(1682728244);
					if (client.aClass304_9030.method2985(-1980492469) != OutgoingPacketManager.aClass310_3212) {
						Class297.method2970(Class1.anInt39, var4, var5, var7, var6, var8, var25, (byte) 48);
					}
				} else {
					int var15;
					int var16;
					int var17;
					int var34;
					if (arg0 == Class213.aClass213_2065) {
						var3 = var2.readUnsignedByte(994647971);
						boolean var23 = (var3 & 0x80) != 0;
						var5 = Class153.anInt1634 + (var3 >> 3 & 0x7);
						var6 = IsaacCipher.anInt5837 + (var3 & 0x7);
						var7 = var5 + var2.readByte((byte) -7);
						var8 = var6 + var2.readByte((byte) -51);
						var9 = var2.readShort(-1100583751);
						var10 = var2.readUnsignedShort(1464139792);
						var31 = var2.readUnsignedByte(989418380) * 4;
						var12 = var2.readUnsignedByte(545566562) * 4;
						var13 = var2.readUnsignedShort(2097670185);
						var34 = var2.readUnsignedShort(1594795378);
						var15 = var2.readUnsignedByte(1617674320);
						var16 = var2.readUnsignedShort(1262907969);
						var17 = var2.readShort(-1100583751);
						if (var15 == 255) {
							var15 = -1;
						}
						if (client.aClass304_9030.method2985(-2016462332) != OutgoingPacketManager.aClass310_3212 && var5 >= 0 && var6 >= 0 && var5 < client.aClass304_9030.method2990(-1678145578) && var6 < client.aClass304_9030.method3033((byte) 15) && var7 >= 0 && var8 >= 0 && var7 < client.aClass304_9030.method2990(-1548117869) && var8 < client.aClass304_9030.method3033((byte) -62) && var10 != 65535) {
							var5 = var5 * 512 + 256;
							var6 = var6 * 512 + 256;
							var7 = var7 * 512 + 256;
							var8 = var8 * 512 + 256;
							var31 <<= 0x2;
							var12 <<= 0x2;
							var16 <<= 0x2;
							Class432_Sub1_Sub1_Sub2 var18 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), var10, Class1.anInt39, Class1.anInt39, var5, var6, var31, var13 + client.anInt8981, var34 + client.anInt8981, var15, var16, 0, var9, var12, var23, -1, var17);
							var18.method5498(var7, var8, Class431.method5342(var7, var8, Class1.anInt39, 1996761881) - var12, client.anInt8981 + var13, -1340068339);
							client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var18), (short) 8192);
						}
					} else if (Class213.aClass213_2071 == arg0) {
						var3 = var2.readUnsignedByte(2080808108);
						var4 = Class153.anInt1634 + (var3 >> 4 & 0x7);
						var5 = (var3 & 0x7) + IsaacCipher.anInt5837;
						var6 = var2.readUnsignedShort(276332810);
						if (var6 == 65535) {
							var6 = -1;
						}
						var7 = var2.readUnsignedByte(1428271957);
						var8 = var7 >> 4 & 0xF;
						var9 = var7 & 0x7;
						var10 = var2.readUnsignedByte(1539914928);
						var31 = var2.readUnsignedByte(1188858785);
						var12 = var2.readUnsignedShort(-113903355);
						if (client.aClass304_9030.method2985(-2090344282) != OutgoingPacketManager.aClass310_3212 && var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-1979964386) && var5 < client.aClass304_9030.method3033((byte) -19)) {
							var13 = var8 + 1;
							if (Class263_Sub2.myPlayer.anIntArray10018[0] >= var4 - var13 && Class263_Sub2.myPlayer.anIntArray10018[0] <= var13 + var4 && Class263_Sub2.myPlayer.anIntArray10059[0] >= var5 - var13 && Class263_Sub2.myPlayer.anIntArray10059[0] <= var5 + var13) {
								Class258.method2544(var6, var9, var10, var31, var8 + (var5 << 8) + (Class1.anInt39 << 24) + (var4 << 16), var12, (short) -6127);
							}
						}
					} else if (arg0 == Class213.aClass213_2064) {
						var3 = var2.readUnsignedByteC(-243015761);
						var4 = Class153.anInt1634 + (var3 >> 4 & 0x7);
						var5 = (var3 & 0x7) + IsaacCipher.anInt5837;
						var6 = var2.readUnsignedByteA(-741334169);
						var7 = var6 >> 2;
						var8 = var6 & 0x3;
						var9 = client.anIntArray9036[var7];
						if (client.aClass304_9030.method2985(-2027100634).method3097((short) -12872) || var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-1198931324) && var5 < client.aClass304_9030.method3033((byte) -38)) {
							IncomingPacket.method2272(Class1.anInt39, var4, var5, var9, -1, var7, var8, -1421433272);
						}
					} else if (Class213.aClass213_2069 == arg0) {
						var3 = var2.readInt2(-793658723);
						var4 = var2.readUnsignedByteS(-400233324);
						var5 = (var4 >> 4 & 0x7) + Class153.anInt1634;
						var6 = IsaacCipher.anInt5837 + (var4 & 0x7);
						var7 = var2.readUnsignedByteA(-741334169);
						var8 = var7 >> 2;
						var9 = var7 & 0x3;
						var10 = client.anIntArray9036[var8];
						if (client.aClass304_9030.method2985(-2142827734).method3097((short) -2470) || var5 >= 0 && var6 >= 0 && var5 < client.aClass304_9030.method2990(-1718029859) && var6 < client.aClass304_9030.method3033((byte) -117)) {
							IncomingPacket.method2272(Class1.anInt39, var5, var6, var10, var3, var8, var9, -614543416);
						}
					} else {
						int var42;
						if (arg0 == Class213.aClass213_2070) {
							var3 = var2.readUnsignedByte(678342501);
							var4 = Class153.anInt1634 * 2 + (var3 >> 4 & 0xF);
							var5 = (var3 & 0xF) + IsaacCipher.anInt5837 * 2;
							var6 = var2.readUnsignedByte(536311338);
							boolean var26 = (var6 & 0x1) != 0;
							boolean var29 = (var6 & 0x2) != 0;
							var9 = var29 ? var6 >> 2 : -1;
							var10 = var4 + var2.readByte((byte) 45);
							var31 = var5 + var2.readByte((byte) 14);
							var12 = var2.readShort(-1100583751);
							var13 = var2.readShort(-1100583751);
							var34 = var2.readUnsignedShort(-272595655);
							var15 = var2.readUnsignedByte(38470525);
							if (var29) {
								var15 = (byte) var15;
							} else {
								var15 *= 4;
							}
							var16 = var2.readUnsignedByte(302079796) * 4;
							var17 = var2.readUnsignedShort(1347614744);
							var42 = var2.readUnsignedShort(422530978);
							int var19 = var2.readUnsignedByte(415506371);
							int var20 = var2.readUnsignedShort(1151781696);
							if (var19 == 255) {
								var19 = -1;
							}
							int var21 = var2.readShort(-1100583751);
							if (client.aClass304_9030.method2985(-2099247709) != OutgoingPacketManager.aClass310_3212 && var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-550340860) * 2 && var5 < client.aClass304_9030.method2990(-1077753913) * 2 && var10 >= 0 && var31 >= 0 && var10 < client.aClass304_9030.method3033((byte) -115) * 2 && var31 < client.aClass304_9030.method3033((byte) -50) * 2 && var34 != 65535) {
								var4 = var4 * 256;
								var5 *= 256;
								var10 *= 256;
								var31 *= 256;
								var15 <<= 0x2;
								var16 <<= 0x2;
								var20 <<= 0x2;
								Class288.method2889(var34, var12, var13, var9, var15, var16, var4, var5, var10, var31, var17, var42, var19, var20, var26, var21, -1810287182);
							}
						} else if (arg0 == Class213.aClass213_2068) {
							var3 = var2.readUnsignedByteS(-400233324);
							var4 = var3 >> 2;
							var5 = client.anIntArray9036[var4];
							var6 = var2.readUnsignedByteS(-400233324);
							var7 = var2.readInt2(-793658723);
							Class473 var32 = client.aClass304_9030.method3025((byte) 13).method5705(var7, (byte) -80);
							var9 = var2.readUnsignedByteS(-400233324);
							var10 = Class153.anInt1634 + (var9 >> 4 & 0x7);
							var31 = (var9 & 0x7) + IsaacCipher.anInt5837;
							if (Class476.aClass476_6878.anInt6882 == var4) {
								var4 = Class476.aClass476_6898.anInt6882;
							}
							var12 = 0;
							if (var32.aByteArray5633 != null) {
								var13 = -1;
								for (var34 = 0; var34 < var32.aByteArray5633.length; var34++) {
									if (var4 == var32.aByteArray5633[var34]) {
										var13 = var34;
										break;
									}
								}
								var12 = var32.anIntArrayArray5684[var13].length;
							}
							var13 = 0;
							if (var32.aShortArray5623 != null) {
								var13 = var32.aShortArray5623.length;
							}
							var34 = 0;
							if (var32.aShortArray5626 != null) {
								var34 = var32.aShortArray5626.length;
							}
							if ((var6 & 0x1) == 1) {
								Class381.method4401(Class1.anInt39, var10, var31, var5, var7, var4, null, -1970273708);
							} else {
								int[] var40 = null;
								if ((var6 & 0x2) == 2) {
									var40 = new int[var12];
									for (var16 = 0; var16 < var12; var16++) {
										var40[var16] = var2.readInt((byte) 77);
									}
								}
								short[] var41 = null;
								if ((var6 & 0x4) == 4) {
									var41 = new short[var13];
									for (var17 = 0; var17 < var13; var17++) {
										var41[var17] = (short) var2.readUnsignedShort(294691930);
									}
								}
								short[] var43 = null;
								if ((var6 & 0x8) == 8) {
									var43 = new short[var34];
									for (var42 = 0; var42 < var34; var42++) {
										var43[var42] = (short) var2.readUnsignedShort(748460200);
									}
								}
								Class381.method4401(Class1.anInt39, var10, var31, var5, var7, var4, new Class481(Class330_Sub10.aLong7576, var40, var41, var43), -1686855103);
								Class330_Sub10.aLong7576++;
							}
						} else if (Class213.aClass213_2073 == arg0) {
							var3 = var2.readInt((byte) 29);
							var4 = var2.readUnsignedByte(2026672900);
							client.aClass304_9030.method3025((byte) 13).method5705(var3, (byte) -96).method5895(var4, (byte) -77);
						} else if (arg0 == Class213.aClass213_2074) {
							var3 = var2.readUnsignedLEShort(15163594);
							var4 = var2.readUnsignedLEShort(15163594);
							var5 = var2.readUnsignedByteC(-243015761);
							Class381 var30 = client.aClass304_9030.method3022(-596690517);
							var7 = IsaacCipher.anInt5837 + (var5 & 0x7);
							var8 = var30.gameSceneBaseY + var7;
							var9 = (var5 >> 4 & 0x7) + Class153.anInt1634;
							var10 = var30.gameSceneBaseX + var9;
							boolean var35 = var9 >= 0 && var7 >= 0 && var9 < client.aClass304_9030.method2990(-1897460985) && var7 < client.aClass304_9030.method3033((byte) -80);
							if (var35 || client.aClass304_9030.method2985(-2067239322).method3097((short) -1717)) {
								Class125.method1526(Class1.anInt39, var10, var8, new Class330_Sub3(var4, var3), 289486883);
								if (var35) {
									Class343.method4001(Class1.anInt39, var9, var7, -334637075);
								}
							}
						} else if (Class213.aClass213_2063 == arg0) {
							var3 = var2.readUnsignedByte(1647062437);
							var4 = (var3 >> 4 & 0x7) + Class153.anInt1634;
							var5 = (var3 & 0x7) + IsaacCipher.anInt5837;
							var6 = var2.readUnsignedShort(1268600414);
							if (var6 == 65535) {
								var6 = -1;
							}
							var7 = var2.readUnsignedByte(912349719);
							var8 = var7 >> 4 & 0xF;
							var9 = var7 & 0x7;
							var10 = var2.readUnsignedByte(1305333233);
							var31 = var2.readUnsignedByte(1554160902);
							var12 = var2.readUnsignedShort(882666397);
							boolean var38 = var2.readUnsignedByte(2042061478) == 1;
							if (client.aClass304_9030.method2985(-2082337438) != OutgoingPacketManager.aClass310_3212 && var4 >= 0 && var5 >= 0 && var4 < client.aClass304_9030.method2990(-1436368713) && var5 < client.aClass304_9030.method3033((byte) 11)) {
								var34 = var8 + 1;
								if (Class263_Sub2.myPlayer.anIntArray10018[0] >= var4 - var34 && Class263_Sub2.myPlayer.anIntArray10018[0] <= var34 + var4 && Class263_Sub2.myPlayer.anIntArray10059[0] >= var5 - var34 && Class263_Sub2.myPlayer.anIntArray10059[0] <= var5 + var34) {
									Class157.method1833(var6, var9, var10, var31, (var5 << 8) + (Class1.anInt39 << 24) + (var4 << 16) + var8, var38, var12, 373696947);
								}
							}
						} else if (arg0 == Class213.aClass213_2077) {
							var3 = var2.readUnsignedByte(17999475);
							Class381 var27 = client.aClass304_9030.method3022(-1366657133);
							var5 = (var3 & 0x7) + IsaacCipher.anInt5837;
							var6 = var27.gameSceneBaseY + var5;
							var7 = Class153.anInt1634 + (var3 >> 4 & 0x7);
							var8 = var27.gameSceneBaseX + var7;
							var9 = var2.readUnsignedShort(1626437268);
							var10 = var2.readUnsignedShort(1070207259);
							var31 = var2.readUnsignedShort(1966794586);
							if (client.aClass497_9138 != null) {
								Class330_Sub9 var36 = (Class330_Sub9) client.aClass497_9138.method6094((long) (Class1.anInt39 << 28 | var6 << 14 | var8));
								if (var36 != null) {
									for (Class330_Sub3 var39 = (Class330_Sub3) var36.aClass471_7573.method5869(539664854); var39 != null; var39 = (Class330_Sub3) var36.aClass471_7573.method5873((byte) -84)) {
										if (var39.anInt7513 == (var9 & 0x7FFF) && var39.anInt7512 == var10) {
											var39.method3252(-1303332432);
											var39.anInt7512 = var31;
											Class125.method1526(Class1.anInt39, var8, var6, var39, 209291836);
											break;
										}
									}
									if (var7 >= 0 && var5 >= 0 && var7 < client.aClass304_9030.method2990(-1708538371) && var5 < client.aClass304_9030.method3033((byte) -47)) {
										Class343.method4001(Class1.anInt39, var7, var5, -334637075);
									}
								}
							}
						} else if (arg0 == Class213.aClass213_2066) {
							var3 = var2.readUnsignedLEShort(15163594);
							var4 = var2.readUnsignedByteA(-741334169);
							var24 = client.aClass304_9030.method3022(1148738300);
							var6 = (var4 & 0x7) + IsaacCipher.anInt5837;
							var7 = var24.gameSceneBaseY + var6;
							var8 = (var4 >> 4 & 0x7) + Class153.anInt1634;
							var9 = var24.gameSceneBaseX + var8;
							var10 = var2.readUnsignedLEShort(15163594);
							var31 = var2.readUnsignedShort(1083997210);
							if (client.anInt9121 != var10) {
								boolean var37 = var8 >= 0 && var6 >= 0 && var8 < client.aClass304_9030.method2990(-1604667338) && var6 < client.aClass304_9030.method3033((byte) -118);
								if (var37 || client.aClass304_9030.method2985(-2064977687).method3097((short) -22342)) {
									Class125.method1526(Class1.anInt39, var9, var7, new Class330_Sub3(var31, var3), -380736688);
									if (var37) {
										Class343.method4001(Class1.anInt39, var8, var6, -334637075);
									}
								}
							}
						} else {
							Class207.method2195("" + arg0, new RuntimeException(), -306254718);
							Class330_Sub31.logout(false, 1433475490);
						}
					}
				}
			}
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "ip.jp(" + ')');
		}
	}

	public static void method2183(IComponentDefinitions arg0, int arg1) {
		try {
			if (arg0.anInt1198 == 5 && arg0.anInt1335 != -1) {
				Class136.method1596(Class361.aClass_ra3793, arg0, 1348212927);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.ls(" + ')');
		}
	}

	public static final void method2184(Class430 arg0, int arg1) {
		try {
			IComponentDefinitions var2 = arg0.aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067.method1440(arg0.anIntArray4387[--arg0.anInt4376], (byte) -62);
			var2.aClass114Array1347 = null;
			var2.aClass114Array1219 = null;
			Class404.method4738(var2, 765240590);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.arg(" + ')');
		}
	}

	public static int method2185(CharSequence arg0, byte arg1) {
		try {
			return Class240.method2399(arg0, 10, true, -2016724024);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ip.o(" + ')');
		}
	}
}
