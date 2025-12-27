package deob;

public class Class243 implements Interface31 {

	public IndexTable aClass280_6986;

	public String aString6987;

	public static int anInt6988;

	public int method320() {
		return this.aClass280_6986.method2772(this.aString6987, -1832542556) ? 100 : 0;
	}

	public Class513 method324() {
		return Class513.aClass513_5961;
	}

	public Class513 method319(int arg0) {
		try {
			return Class513.aClass513_5961;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ke.j(" + ')');
		}
	}

	public int method322() {
		return this.aClass280_6986.method2772(this.aString6987, -1990576424) ? 100 : 0;
	}

	public int method323() {
		return this.aClass280_6986.method2772(this.aString6987, -1719845844) ? 100 : 0;
	}

	public int method321(byte arg0) {
		try {
			return this.aClass280_6986.method2772(this.aString6987, 874143634) ? 100 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ke.r(" + ')');
		}
	}

	public Class243(IndexTable arg0, String arg1) {
		this.aClass280_6986 = arg0;
		this.aString6987 = arg1;
	}

	public Class513 method325() {
		return Class513.aClass513_5961;
	}

	public static void method2407(int arg0, int arg1) {
	}

	public static final int method2408(Class_ra arg0, Class425 arg1, int arg2) {
		try {
			if (arg1.anInt4340 != -1) {
				return arg1.anInt4340;
			}
			if (arg1.anInt4331 != -1) {
				Class56 var3 = arg0.anInterface_ma4227.method221(arg1.anInt4331, -484034908);
				if (!var3.aBoolean533) {
					return var3.aShort523;
				}
			}
			return arg1.anInt4330;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ke.a(" + ')');
		}
	}

	public static void method2409(String arg0, String arg1, int arg2) {
		try {
			if (arg0.length() <= 320 && Class527.method6269(-1046063144)) {
				client.aClass1_9060.method379(1175619289);
				Class551.method6378(-1288001017);
				Class360.username = arg0;
				Class360.password = arg1;
				Class227.method2311(3, -1188873169);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ke.n(" + ')');
		}
	}

	public static final void method2410(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ((NPC) arg0.aClass432_Sub1_Sub1_Sub1_4396).aClass67_10260.method793(var2, -1666732710);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ke.ap(" + ')');
		}
	}

	public static boolean method2411(boolean arg0, int arg1) {
		try {
			boolean var2 = Class361.aClass_ra3793.cg();
			if (var2 == arg0) {
				return true;
			}
			if (!arg0) {
				Class361.aClass_ra3793.ca();
			} else if (!Class361.aClass_ra3793.cu()) {
				arg0 = false;
			}
			if (arg0 == var2) {
				return false;
			} else {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875, arg0 ? 1 : 0, 365123806);
				Class435.method5568(1706876612);
				return true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ke.gk(" + ')');
		}
	}

	public static final void method2412(Class430 arg0, short arg1) {
		try {
			String var2 = Class258.aStringArray2710[arg0.anIntArray4394[arg0.anInt4397]];
			if (var2 == null) {
				var2 = "";
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ke.ae(" + ')');
		}
	}

	public static void method2413(Class330_Sub36_Sub10 arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg0 != null && Class484.aClass471_5791.aClass330_5611 != arg0) {
				int var4 = arg0.anInt9688;
				int var5 = arg0.anInt9694;
				int var6 = arg0.anInt9699;
				int var7 = (int) arg0.aLong9697;
				long var8 = arg0.aLong9697;
				if (var6 >= 2000) {
					var6 -= 2000;
				}
				Class381 var10 = client.aClass304_9030.method3022(1860854061);
				OutgoingPacket var11 = null;
				if (var6 == 44) {
					var11 = OutgoingPacket.PLAYER_OPTION1_PACKET;
				} else if (var6 == 45) {
					var11 = OutgoingPacket.PLAYER_OPTION2_PACKET;
				} else if (var6 == 46) {
					var11 = OutgoingPacket.aClass234_2518;
				} else if (var6 == 47) {
					var11 = OutgoingPacket.PLAYER_OPTION3_PACKET;
				} else if (var6 == 48) {
					var11 = OutgoingPacket.PLAYER_OPTION4_PACKET;
				} else if (var6 == 49) {
					var11 = OutgoingPacket.PLAYER_OPTION6_PACKET;
				} else if (var6 == 50) {
					var11 = OutgoingPacket.PLAYER_OPTION7_PACKET;
				} else if (var6 == 51) {
					var11 = OutgoingPacket.aClass234_2523;
				} else if (var6 == 52) {
					var11 = OutgoingPacket.PLAYER_OPTION9_PACKET;
				} else if (var6 == 53) {
					var11 = OutgoingPacket.aClass234_2514;
				}
				Class330_Sub34 var13;
				if (var11 != null) {
					Player var12 = client.players[var7];
					if (var12 != null) {
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var13 = Class238.method2377(var11, client.aClass1_9025.aClass488_22, 2030194243);
						var13.aClass330_Sub46_Sub2_7729.addByte(Class356.method4190((byte) 3) ? 1 : 0, (byte) 68);
						var13.aClass330_Sub46_Sub2_7729.addShortA(var7, -1198015597);
						client.aClass1_9025.method378(var13, -1246586180);
						Class263_Sub2.method2622(var12.anIntArray10018[0], var12.anIntArray10059[0], true, Class274.method2704(var12.anIntArray10018[0], var12.anIntArray10059[0], var12.method5453(-690706000), var12.method5453(-1395894687), 0, (short) 8960), 2021620088);
					}
				}
				Class330_Sub34 var14;
				if (var6 == 8) {
					Class330_Sub35 var17 = (Class330_Sub35) client.aClass497_9014.method6094((long) var7);
					if (var17 != null) {
						NPC var20 = (NPC) var17.anObject7733;
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var14 = Class238.method2377(OutgoingPacket.INTERFACE_ON_NPC_PACKET, client.aClass1_9025.aClass488_22, 56337648);
						var14.aClass330_Sub46_Sub2_7729.addShortA(var7, -1123556569);
						var14.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9104, -356941912);
						var14.aClass330_Sub46_Sub2_7729.addShort(client.anInt9151, (byte) 25);
						var14.aClass330_Sub46_Sub2_7729.addByteA(Class356.method4190((byte) 3) ? 1 : 0, (byte) 81);
						var14.aClass330_Sub46_Sub2_7729.addInt(Class368.anInt3869, 1965508160);
						client.aClass1_9025.method378(var14, -2050245453);
						Class263_Sub2.method2622(var20.anIntArray10018[0], var20.anIntArray10059[0], true, Class274.method2704(var20.anIntArray10018[0], var20.anIntArray10059[0], var20.method5453(-899667076), var20.method5453(-2066688713), 0, (short) 8960), 2021620088);
					}
				}
				Class330_Sub34 var18;
				if (var6 == 23) {
					if (client.anInt9182 > 0 && Class367.method4304(-2076835869)) {
						Class144.method1671(Class263_Sub2.myPlayer.aByte8658, var4 + var10.gameSceneBaseX, var10.gameSceneBaseY + var5, -80060749);
					} else {
						var18 = Class293.walking(var4, var5, var7, 306824334);
						if (var7 == 1) {
							var18.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 51);
							var18.aClass330_Sub46_Sub2_7729.addByte(-1, (byte) 127);
							var18.aClass330_Sub46_Sub2_7729.addShort((int) client.aFloat9141, (byte) 14);
							var18.aClass330_Sub46_Sub2_7729.addByte(57, (byte) 85);
							var18.aClass330_Sub46_Sub2_7729.addByte(client.anInt9149, (byte) 109);
							var18.aClass330_Sub46_Sub2_7729.addByte(client.anInt9063, (byte) 114);
							var18.aClass330_Sub46_Sub2_7729.addByte(89, (byte) 6);
							Class260 var21 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
							var18.aClass330_Sub46_Sub2_7729.addShort((int) var21.aFloat2716, (byte) 2);
							var18.aClass330_Sub46_Sub2_7729.addShort((int) var21.aFloat2711, (byte) 61);
							var18.aClass330_Sub46_Sub2_7729.addByte(63, (byte) 80);
						} else {
							client.anInt8988 = arg1;
							client.anInt9100 = arg2;
							client.anInt9062 = 1;
							client.anInt9101 = 0;
						}
						client.aClass1_9025.method378(var18, -2143906727);
						Class263_Sub2.method2622(var4, var5, true, Class147.method1743(var4, var5, 407767097), 2021620088);
					}
				}
				if (var6 == 58) {
					IComponentDefinitions var19 = Class166.method1993(var5, var4, 534399539);
					if (var19 != null) {
						Class438.method5594(var19, 1827014123);
					}
				}
				if (var6 == 59) {
					client.anInt8988 = arg1;
					client.anInt9100 = arg2;
					client.anInt9062 = 1;
					client.anInt9101 = 0;
					var18 = Class238.method2377(OutgoingPacket.aClass234_2567, client.aClass1_9025.aClass488_22, 641580719);
					var18.aClass330_Sub46_Sub2_7729.addLEShort(var10.gameSceneBaseY + var5, -676872267);
					var18.aClass330_Sub46_Sub2_7729.addShort(client.anInt9151, (byte) 34);
					var18.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9104, -676872267);
					var18.aClass330_Sub46_Sub2_7729.addLEShortA(var10.gameSceneBaseX + var4, -566402679);
					var18.aClass330_Sub46_Sub2_7729.addInt1(Class368.anInt3869, (byte) 15);
					client.aClass1_9025.method378(var18, -344469330);
					Class263_Sub2.method2622(var4, var5, true, Class147.method1743(var4, var5, -1011609631), 2021620088);
				}
				OutgoingPacket var22 = null;
				if (var6 == 9) {
					var22 = OutgoingPacket.NPC_CLICK1_PACKET;
				} else if (var6 == 10) {
					var22 = OutgoingPacket.ATTACK_NPC;
				} else if (var6 == 11) {
					var22 = OutgoingPacket.NPC_CLICK2_PACKET;
				} else if (var6 == 12) {
					var22 = OutgoingPacket.NPC_CLICK3_PACKET;
				} else if (var6 == 13) {
					var22 = OutgoingPacket.NPC_CLICK4_PACKET;
				} else if (var6 == 1003) {
					var22 = OutgoingPacket.aClass234_2574;
				}
				Class330_Sub34 var15;
				if (var22 != null) {
					Class330_Sub35 var23 = (Class330_Sub35) client.aClass497_9014.method6094((long) var7);
					if (var23 != null) {
						NPC var24 = (NPC) var23.anObject7733;
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var15 = Class238.method2377(var22, client.aClass1_9025.aClass488_22, 175138450);
						var15.aClass330_Sub46_Sub2_7729.addShort(var7, (byte) 21);
						var15.aClass330_Sub46_Sub2_7729.addByte(Class356.method4190((byte) 3) ? 1 : 0, (byte) 83);
						client.aClass1_9025.method378(var15, -966846392);
						Class263_Sub2.method2622(var24.anIntArray10018[0], var24.anIntArray10059[0], true, Class274.method2704(var24.anIntArray10018[0], var24.anIntArray10059[0], var24.method5453(-1178089775), var24.method5453(-2028245892), 0, (short) 8960), 2021620088);
					}
				}
				if (var6 == 2) {
					client.anInt8988 = arg1;
					client.anInt9100 = arg2;
					client.anInt9062 = 2;
					client.anInt9101 = 0;
					var13 = Class238.method2377(OutgoingPacket.INTERFACE_ON_OBJECT_PACKET, client.aClass1_9025.aClass488_22, 463043113);
					var13.aClass330_Sub46_Sub2_7729.addLEInt(Class368.anInt3869, -2139499715);
					var13.aClass330_Sub46_Sub2_7729.addInt((int) (var8 >>> 32) & Integer.MAX_VALUE, 1965508160);
					var13.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9104, -676872267);
					var13.aClass330_Sub46_Sub2_7729.addLEShortA(var5 + var10.gameSceneBaseY, -996545123);
					var13.aClass330_Sub46_Sub2_7729.addByteS(Class356.method4190((byte) 3) ? 1 : 0, 2016390187);
					var13.aClass330_Sub46_Sub2_7729.addShort(client.anInt9151, (byte) 92);
					var13.aClass330_Sub46_Sub2_7729.addLEShort(var10.gameSceneBaseX + var4, -676872267);
					client.aClass1_9025.method378(var13, -2077304888);
					Class112.method1380(var4, var5, var8);
				}
				if (var6 == 25) {
					IComponentDefinitions var25 = Class166.method1993(var5, var4, 534399539);
					if (var25 != null) {
						Class490.method6071(-1799482790);
						Class330_Sub2 var26 = client.method3924(var25);
						Class400.method4708(var25, var26.method3265((byte) 1), var26.anInt7502, -2135853126);
						client.aString9152 = Class473.method5911(var25, 567830789);
						if (client.aString9152 == null) {
							client.aString9152 = "Null";
						}
						client.aString9154 = var25.aString1283 + Class146.method1738(16777215, -849826454);
					}
				} else {
					if (var6 == 30 && client.aClass114_9078 == null) {
						Class43.method589(var5, var4, (byte) 95);
						client.aClass114_9078 = Class166.method1993(var5, var4, 534399539);
						if (client.aClass114_9078 != null) {
							Class404.method4738(client.aClass114_9078, 1791320608);
						}
					}
					if (var6 == 16) {
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var13 = Class238.method2377(OutgoingPacket.INTERFACE_ON_PLAYER_PACKET, client.aClass1_9025.aClass488_22, 980678939);
						var13.aClass330_Sub46_Sub2_7729.addLEShortA(client.anInt9104, -162095745);
						var13.aClass330_Sub46_Sub2_7729.addInt(Class368.anInt3869, 1965508160);
						var13.aClass330_Sub46_Sub2_7729.addLEShort(Class263_Sub2.myPlayer.anInt10008, -676872267);
						var13.aClass330_Sub46_Sub2_7729.addByteA(Class356.method4190((byte) 3) ? 1 : 0, (byte) -49);
						var13.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9151, -676872267);
						client.aClass1_9025.method378(var13, -498820542);
					}
					if (var6 == 15) {
						Player var27 = client.players[var7];
						if (var27 != null) {
							client.anInt8988 = arg1;
							client.anInt9100 = arg2;
							client.anInt9062 = 2;
							client.anInt9101 = 0;
							var14 = Class238.method2377(OutgoingPacket.INTERFACE_ON_PLAYER_PACKET, client.aClass1_9025.aClass488_22, 1503819581);
							var14.aClass330_Sub46_Sub2_7729.addLEShortA(client.anInt9104, -1110340893);
							var14.aClass330_Sub46_Sub2_7729.addInt(Class368.anInt3869, 1965508160);
							var14.aClass330_Sub46_Sub2_7729.addLEShort(var7, -676872267);
							var14.aClass330_Sub46_Sub2_7729.addByteA(Class356.method4190((byte) 3) ? 1 : 0, (byte) 3);
							var14.aClass330_Sub46_Sub2_7729.addLEShort(client.anInt9151, -676872267);
							client.aClass1_9025.method378(var14, -609415961);
							Class263_Sub2.method2622(var27.anIntArray10018[0], var27.anIntArray10059[0], true, Class274.method2704(var27.anIntArray10018[0], var27.anIntArray10059[0], var27.method5453(-782241052), var27.method5453(-1230810584), 0, (short) 8960), 2021620088);
						}
					}
					if (var6 == 17) {
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var13 = Class238.method2377(OutgoingPacket.aClass234_2470, client.aClass1_9025.aClass488_22, -276080378);
						var13.aClass330_Sub46_Sub2_7729.addByte(Class356.method4190((byte) 3) ? 1 : 0, (byte) 56);
						var13.aClass330_Sub46_Sub2_7729.addLEShortA(var7, -1515167306);
						var13.aClass330_Sub46_Sub2_7729.addLEShortA(var5 + var10.gameSceneBaseY, -1574812967);
						var13.aClass330_Sub46_Sub2_7729.addLEShort(var4 + var10.gameSceneBaseX, -676872267);
						var13.aClass330_Sub46_Sub2_7729.addLEInt(Class368.anInt3869, -2034402542);
						var13.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9104, -1310499929);
						var13.aClass330_Sub46_Sub2_7729.addShort(client.anInt9151, (byte) 42);
						client.aClass1_9025.method378(var13, -526866164);
						Class432_Sub1_Sub1_Sub5.method5509(var4, var5, 1467633752);
					}
					if (var6 == 1008 || var6 == 1009 || var6 == 1010 || var6 == 1011 || var6 == 1012) {
						Class20.method469(var6, var7, var4, 2132255727);
					}
					OutgoingPacket var29 = null;
					if (var6 == 3) {
						var29 = OutgoingPacket.OBJECT_CLICK1_PACKET;
					} else if (var6 == 4) {
						var29 = OutgoingPacket.OBJECT_CLICK2_PACKET;
					} else if (var6 == 5) {
						var29 = OutgoingPacket.OBJECT_CLICK3_PACKET;
					} else if (var6 == 6) {
						var29 = OutgoingPacket.OBJECT_CLICK4_PACKET;
					} else if (var6 == 1001) {
						var29 = OutgoingPacket.OBJECT_CLICK5_PACKET;
					} else if (var6 == 1002) {
						var29 = OutgoingPacket.OBJECT_EXAMINE_PACKET;
					}
					if (var29 != null) {
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var14 = Class238.method2377(var29, client.aClass1_9025.aClass488_22, 1959045186);
						var14.aClass330_Sub46_Sub2_7729.addInt2((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 1);
						var14.aClass330_Sub46_Sub2_7729.addShort(var5 + var10.gameSceneBaseY, (byte) 114);
						var14.aClass330_Sub46_Sub2_7729.addShortA(var4 + var10.gameSceneBaseX, -2014001117);
						var14.aClass330_Sub46_Sub2_7729.addByteS(Class356.method4190((byte) 3) ? 1 : 0, 2143492134);
						client.aClass1_9025.method378(var14, -739636403);
						Class112.method1380(var4, var5, var8);
					}
					OutgoingPacket var28 = null;
					if (var6 == 18) {
						var28 = OutgoingPacket.aClass234_2527;
					} else if (var6 == 19) {
						var28 = OutgoingPacket.aClass234_2519;
					} else if (var6 == 20) {
						var28 = OutgoingPacket.TAKE_FLOOR_ITEM_PACKET;
					} else if (var6 == 21) {
						var28 = OutgoingPacket.aClass234_2495;
					} else if (var6 == 22) {
						var28 = OutgoingPacket.aClass234_2491;
					} else if (var6 == 1004) {
						var28 = OutgoingPacket.aClass234_2510;
					}
					if (var28 != null) {
						client.anInt8988 = arg1;
						client.anInt9100 = arg2;
						client.anInt9062 = 2;
						client.anInt9101 = 0;
						var15 = Class238.method2377(var28, client.aClass1_9025.aClass488_22, 664556487);
						var15.aClass330_Sub46_Sub2_7729.addByte(Class356.method4190((byte) 3) ? 1 : 0, (byte) 26);
						var15.aClass330_Sub46_Sub2_7729.addShortA(var7, -938749837);
						var15.aClass330_Sub46_Sub2_7729.addLEShort(var5 + var10.gameSceneBaseY, -676872267);
						var15.aClass330_Sub46_Sub2_7729.addShortA(var10.gameSceneBaseX + var4, -1344384195);
						client.aClass1_9025.method378(var15, -863443209);
						Class432_Sub1_Sub1_Sub5.method5509(var4, var5, -108219683);
					}
					if (var6 == 57 || var6 == 1007) {
						Class498.method6110(var7, var5, var4, arg0.aString9693, (byte) -12);
					}
					if (var6 == 60) {
						if (client.anInt9182 > 0 && Class367.method4304(-796707537)) {
							Class144.method1671(Class263_Sub2.myPlayer.aByte8658, var10.gameSceneBaseX + var4, var10.gameSceneBaseY + var5, -80060749);
						} else {
							client.anInt8988 = arg1;
							client.anInt9100 = arg2;
							client.anInt9062 = 1;
							client.anInt9101 = 0;
							var15 = Class238.method2377(OutgoingPacket.aClass234_2534, client.aClass1_9025.aClass488_22, -155567233);
							var15.aClass330_Sub46_Sub2_7729.addLEShort(var5 + var10.gameSceneBaseY, -676872267);
							var15.aClass330_Sub46_Sub2_7729.addShort(var10.gameSceneBaseX + var4, (byte) 36);
							client.aClass1_9025.method378(var15, -190070813);
						}
					}
					if (client.aBoolean9150) {
						Class490.method6071(-1799482790);
					}
					if (Class64.aClass114_569 != null && client.anInt9103 == 0) {
						Class404.method4738(Class64.aClass114_569, 615594246);
					}
				}
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "ke.ba(" + ')');
		}
	}

	public static final void method2414(long arg0) {
		try {
			try {
				Thread.sleep(arg0);
			} catch (InterruptedException var3) {
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ke.j(" + ')');
		}
	}
}
