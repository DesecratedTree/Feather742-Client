package deob;

public class Class72 {

	public static Class72 aClass72_614 = new Class72(9, 3);

	public static Class72 aClass72_620 = new Class72(3, 4);

	public static Class72 aClass72_611 = new Class72(2, 1);

	public static Class72 aClass72_612 = new Class72(4, 1);

	public static Class72 aClass72_613 = new Class72(6, 2);

	public static Class72 aClass72_610 = new Class72(7, 1);

	public static Class72 aClass72_615 = new Class72(5, 3);

	public static Class72 aClass72_616 = new Class72(0, 4);

	public static Class72 aClass72_617 = new Class72(8, 1);

	public static Class72 aClass72_618 = new Class72(1, 1);

	public int anInt619;

	public int anInt609;

	public static long aLong621;

	public Class72(int arg0, int arg1) {
		this.anInt619 = arg0;
		this.anInt609 = arg1;
	}

	public static void method828(int arg0, byte arg1) {
		try {
			if (arg0 == 7) {
				throw new Error();
			} else if (arg0 == 2) {
				throw new OutOfMemoryError();
			} else {
				try {
					if (arg0 == 25) {
						Class26.method488(1123692809);
					} else if (arg0 == 9) {
						Class56.panelBoxMessage("" + Class332.anInt6603, -1893746310);
					} else if (arg0 == 19) {
						Class358 var2 = client.aClass304_9030.method3023(-400722441).aClass358_3649;
						var2.aBoolean3724 = !var2.aBoolean3724;
					} else if (arg0 == 29) {
						client.aBoolean8983 = true;
					} else if (arg0 == 15) {
						client.aBoolean8983 = false;
					} else if (arg0 == 16) {
						client.aClass467_9061.method5851(65536);
					} else {
						int var3;
						int var7;
						Runtime var8;
						if (arg0 == 4) {
							Class317.method3151(1565557914);
							for (var7 = 0; var7 < 10; var7++) {
								System.gc();
							}
							var8 = Runtime.getRuntime();
							var3 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
							Class56.panelBoxMessage("" + var3, -1426354986);
						} else if (arg0 == 6) {
							Class317.method3151(1751858754);
							for (var7 = 0; var7 < 10; var7++) {
								System.gc();
							}
							var8 = Runtime.getRuntime();
							var3 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
							Class56.panelBoxMessage("" + var3, -159316383);
							Class464_Sub20.method5808((byte) 41);
							Class317.method3151(1830977337);
							for (int var4 = 0; var4 < 10; var4++) {
								System.gc();
							}
							var3 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
							Class56.panelBoxMessage("" + var3, -546772254);
						} else if (arg0 == 24) {
							Class56.panelBoxMessage(Class263.aClass321_2734.method332((byte) 93) ? "Success" : "Failure", 1495568406);
						} else if (arg0 == 13) {
							Class507.aClass498_5930.method6107(45333286);
						} else if (arg0 == 14) {
							Class140_Sub1.aClass285_7263.method2840((byte) -36);
						} else if (arg0 == 21) {
							Class140_Sub1.aClass285_7263.method2848(1142070066);
						} else if (arg0 == 11) {
							Class475.aCanvas5700.setLocation(50, 50);
						} else if (arg0 == 17) {
							Class475.aCanvas5700.setLocation(Class332.anInt6611, Class332.anInt6612);
						} else if (arg0 == 8) {
							Class456.method5654(-1616080563);
						} else if (arg0 == 28) {
							client.aClass304_9030.aLong3109 = Class312.method3111((byte) 52);
							client.aClass304_9030.aBoolean3098 = true;
							Class456.method5654(642699565);
						} else {
							Class260 var9;
							if (arg0 == 22) {
								var9 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
								Class56.panelBoxMessage(((int) var9.aFloat2716 >> 9) + " " + ((int) var9.aFloat2711 >> 9), 303048347);
							} else if (arg0 == 26) {
								var9 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
								Class56.panelBoxMessage("" + client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[Class263_Sub2.myPlayer.aByte8658].method6417((int) var9.aFloat2716 >> 9, (int) var9.aFloat2711 >> 9, 279916142), -509174722);
							} else if (arg0 == 1) {
								Class56.panelBoxMessage(IComponentDefinitions.aClass367_1189.method4294(-1386154340) + " " + IComponentDefinitions.aClass367_1189.method4293((byte) -4), -674217801);
								Class56.panelBoxMessage(IComponentDefinitions.aClass367_1310.method4294(1403308757) + " " + IComponentDefinitions.aClass367_1310.method4293((byte) -72), -414993413);
								Class56.panelBoxMessage(Class556.aClass510_6392.aClass399_6780.method4697() + " " + Class556.aClass510_6392.aClass399_6780.method4694(), -2000238023);
							} else if (arg0 == 10) {
								Class50.method632(false, (byte) -16);
							} else if (arg0 == 27) {
								client.aBoolean8984 = !client.aBoolean8984;
								Class361.aClass_ra3793.dh(client.aBoolean8984);
								Class201_Sub1.method2166(1632830751);
							} else if (arg0 == 23) {
								client.anInt8993 = 0;
								client.aClass304_9030.method3032(-1272232072);
							} else if (arg0 == 20) {
								client.anInt8993 = 1;
								client.aClass304_9030.method3032(1463901217);
							} else if (arg0 == 5) {
								client.anInt8993 = 2;
								client.aClass304_9030.method3032(1698562823);
							}
						}
					}
				} catch (Exception var5) {
					Class56.panelBoxMessage(Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434), -446415173);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "cx.g(" + ')');
		}
	}

	public static boolean method829(CharSequence arg0, int arg1) {
		try {
			return Class117.method1424(arg0, 10, true, 1537138453);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cx.i(" + ')');
		}
	}

	public static final void method830(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean9273 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cx.ajd(" + ')');
		}
	}

	public static char method831(char arg0, byte arg1) {
		try {
			switch(arg0) {
				case ' ':
				case '-':
				case '_':
				case ' ':
					return '_';
				case '#':
				case '[':
				case ']':
					return arg0;
				case 'À':
				case 'Á':
				case 'Â':
				case 'Ã':
				case 'Ä':
				case 'à':
				case 'á':
				case 'â':
				case 'ã':
				case 'ä':
					return 'a';
				case 'Ç':
				case 'ç':
					return 'c';
				case 'È':
				case 'É':
				case 'Ê':
				case 'Ë':
				case 'è':
				case 'é':
				case 'ê':
				case 'ë':
					return 'e';
				case 'Í':
				case 'Î':
				case 'Ï':
				case 'í':
				case 'î':
				case 'ï':
					return 'i';
				case 'Ñ':
				case 'ñ':
					return 'n';
				case 'Ò':
				case 'Ó':
				case 'Ô':
				case 'Õ':
				case 'Ö':
				case 'ò':
				case 'ó':
				case 'ô':
				case 'õ':
				case 'ö':
					return 'o';
				case 'Ù':
				case 'Ú':
				case 'Û':
				case 'Ü':
				case 'ù':
				case 'ú':
				case 'û':
				case 'ü':
					return 'u';
				case 'ß':
					return 'b';
				case 'ÿ':
				case 'Ÿ':
					return 'y';
				default:
					return Character.toLowerCase(arg0);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cx.s(" + ')');
		}
	}

	public static final void method832(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 4;
			Class197.method2147(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], arg0.anIntArray4387[arg0.anInt4376 + 3], true, 256, -980353334);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cx.tl(" + ')');
		}
	}

	public static void method833(boolean arg0, byte arg1) {
		try {
			if (Class239.aClass240_2592 == null) {
				Class532.method6302((byte) 84);
			}
			if (arg0) {
				Class239.aClass240_2592.method2392((byte) 1);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cx.p(" + ')');
		}
	}
}
