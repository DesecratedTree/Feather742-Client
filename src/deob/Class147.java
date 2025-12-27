package deob;

public class Class147 {

	public static Class147 aClass147_1620 = new Class147(0, 4);

	public static Class147 aClass147_1617 = new Class147(1, 5);

	public static Class147 aClass147_1618 = new Class147(2, 6);

	public int anInt1619;

	public int anInt1616;

	public static int anInt1621;

	public Class147(int arg0, int arg1) {
		this.anInt1619 = arg0;
		this.anInt1616 = arg1;
	}

	public static Class331 method1739(byte arg0) {
		try {
			return Class332.aClass331_6632;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "fz.aa(" + ')');
		}
	}

	public static final void method1740(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 743564255);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class220.method2262(var3, var4, arg0, -679189266);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fz.oq(" + ')');
		}
	}

	public static final void method1741(Class430 arg0, int arg1) {
		try {
			Class315_Sub1.method3143((byte) -30);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fz.aiq(" + ')');
		}
	}

	public static void method1742(int arg0, boolean arg1, int arg2) {
		try {
			if (arg1) {
				Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.aClass234_2486, client.aClass1_9025.aClass488_22, 1707405364);
				var3.aClass330_Sub46_Sub2_7729.addShort(arg0, (byte) 7);
				client.aClass1_9025.method378(var3, -1680958893);
			} else {
				Class230.method2339(Class545.aClass545_7001, arg0, -1, 531560327);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fz.p(" + ')');
		}
	}

	public static Class366 method1743(int arg0, int arg1, int arg2) {
		try {
			Class363.aClass366_Sub1_3802.anInt3854 = arg0;
			Class363.aClass366_Sub1_3802.anInt3853 = arg1;
			Class363.aClass366_Sub1_3802.anInt3852 = 1;
			Class363.aClass366_Sub1_3802.anInt3855 = 1;
			return Class363.aClass366_Sub1_3802;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fz.r(" + ')');
		}
	}

	public static void method1744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass304_9030.method2990(-1284629251) - 1 && arg2 < client.aClass304_9030.method3033((byte) -95) - 1 && client.aClass304_9030.method3023(-400722441) != null) {
				Interface2 var8;
				if (arg3 == 0) {
					var8 = (Interface2) client.aClass304_9030.method3023(-400722441).method4154(arg0, arg1, arg2, -2040838155);
					Interface2 var9 = (Interface2) client.aClass304_9030.method3023(-400722441).method4155(arg0, arg1, arg2, 1734131488);
					if (var8 != null && arg4 != 2) {
						if (var8 instanceof Class432_Sub1_Sub5_Sub2) {
							((Class432_Sub1_Sub5_Sub2) var8).aClass70_9977.method802(arg6, 1654052063);
						} else {
							Class551.method6379(arg0, arg3, arg1, arg2, var8.method34((short) -22655), arg5, arg4, arg6, 1185709556);
						}
					}
					if (var9 != null) {
						if (var9 instanceof Class432_Sub1_Sub5_Sub2) {
							((Class432_Sub1_Sub5_Sub2) var9).aClass70_9977.method802(arg6, 1654052063);
						} else {
							Class551.method6379(arg0, arg3, arg1, arg2, var9.method34((short) -18783), arg5, arg4, arg6, 1367086849);
						}
					}
				} else if (arg3 == 1) {
					var8 = (Interface2) client.aClass304_9030.method3023(-400722441).method4156(arg0, arg1, arg2, 2099392181);
					if (var8 != null) {
						if (var8 instanceof Class432_Sub1_Sub3_Sub2) {
							((Class432_Sub1_Sub3_Sub2) var8).aClass70_10002.method802(arg6, 1654052063);
						} else {
							int var11 = var8.method34((short) -13882);
							if (arg4 == 4 || arg4 == 5) {
								Class551.method6379(arg0, arg3, arg1, arg2, var11, arg5, 4, arg6, 1241759411);
							} else if (arg4 == 6) {
								Class551.method6379(arg0, arg3, arg1, arg2, var11, arg5 + 4, 4, arg6, 1293139515);
							} else if (arg4 == 7) {
								Class551.method6379(arg0, arg3, arg1, arg2, var11, (arg5 + 2 & 0x3) + 4, 4, arg6, 1395579419);
							} else if (arg4 == 8) {
								Class551.method6379(arg0, arg3, arg1, arg2, var11, arg5 + 4, 4, arg6, 1796456179);
								Class551.method6379(arg0, arg3, arg1, arg2, var11, (arg5 + 2 & 0x3) + 4, 4, arg6, 1036886944);
							}
						}
					}
				} else if (arg3 == 2) {
					var8 = (Interface2) client.aClass304_9030.method3023(-400722441).method4158(arg0, arg1, arg2, client.anInterface19_9266, (byte) 27);
					if (var8 != null) {
						if (arg4 == 11) {
							arg4 = 10;
						}
						if (var8 instanceof Class432_Sub1_Sub1_Sub5) {
							((Class432_Sub1_Sub1_Sub5) var8).aClass70_9941.method802(arg6, 1654052063);
						} else {
							Class551.method6379(arg0, arg3, arg1, arg2, var8.method34((short) -24669), arg5, arg4, arg6, 1615074904);
						}
					}
				} else if (arg3 == 3) {
					var8 = (Interface2) client.aClass304_9030.method3023(-400722441).method4177(arg0, arg1, arg2, 1315717432);
					if (var8 != null) {
						if (var8 instanceof Class432_Sub1_Sub4_Sub1) {
							((Class432_Sub1_Sub4_Sub1) var8).aClass70_9945.method802(arg6, 1654052063);
						} else {
							Class551.method6379(arg0, arg3, arg1, arg2, var8.method34((short) -8726), arg5, arg4, arg6, 1186711654);
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "fz.kj(" + ')');
		}
	}

	public static final void method1745(Class430 arg0, short arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class542.method6336(var3, var4, arg0, 2098630892);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fz.iw(" + ')');
		}
	}
}
