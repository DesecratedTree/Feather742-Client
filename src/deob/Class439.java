package deob;

public class Class439 {

	public static int anInt4449 = 0;

	public static int anInt4450 = 0;

	public static int anInt4451 = 0;

	public static byte[][] aByteArrayArray4452 = new byte[1000][];

	public static byte[][] aByteArrayArray4453 = new byte[250][];

	public static byte[][] aByteArrayArray4454 = new byte[50][];

	public static int anInt4456;

	public static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_4455;

	public static synchronized byte[] method5596(int arg0, int arg1) {
		try {
			byte[] var5;
			if (arg0 == 100 && anInt4449 > 0) {
				var5 = aByteArrayArray4452[--anInt4449];
				aByteArrayArray4452[anInt4449] = null;
				return var5;
			} else if (arg0 == 5000 && anInt4450 > 0) {
				var5 = aByteArrayArray4453[--anInt4450];
				aByteArrayArray4453[anInt4450] = null;
				return var5;
			} else if (arg0 == 30000 && anInt4451 > 0) {
				var5 = aByteArrayArray4454[--anInt4451];
				aByteArrayArray4454[anInt4451] = null;
				return var5;
			} else {
				if (Class125.aByteArrayArrayArray1459 != null) {
					for (int var2 = 0; var2 < Class458.anIntArray5565.length; var2++) {
						if (Class458.anIntArray5565[var2] == arg0 && Class11.anIntArray167[var2] > 0) {
							byte[] var3 = Class125.aByteArrayArrayArray1459[var2][--Class11.anIntArray167[var2]];
							Class125.aByteArrayArrayArray1459[var2][Class11.anIntArray167[var2]] = null;
							return var3;
						}
					}
				}
				return new byte[arg0];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "se.j(" + ')');
		}
	}

	public Class439() throws Throwable {
		throw new Error();
	}

	public static void method5597(int arg0, String arg1, int arg2) {
		try {
			int var3 = Class15.anInt192;
			int[] var4 = Class15.anIntArray187;
			boolean var5 = false;
			for (int var6 = 0; var6 < var3; var6++) {
				Player var7 = client.players[var4[var6]];
				if (var7 != null && Class263_Sub2.myPlayer != var7 && var7.aString10221 != null && var7.aString10221.equalsIgnoreCase(arg1)) {
					OutgoingPacket var8 = null;
					if (arg0 == 1) {
						var8 = OutgoingPacket.PLAYER_OPTION1_PACKET;
					} else if (arg0 == 4) {
						var8 = OutgoingPacket.PLAYER_OPTION3_PACKET;
					} else if (arg0 == 5) {
						var8 = OutgoingPacket.PLAYER_OPTION4_PACKET;
					} else if (arg0 == 6) {
						var8 = OutgoingPacket.PLAYER_OPTION6_PACKET;
					} else if (arg0 == 7) {
						var8 = OutgoingPacket.PLAYER_OPTION7_PACKET;
					} else if (arg0 == 9) {
						var8 = OutgoingPacket.PLAYER_OPTION9_PACKET;
					}
					if (var8 != null) {
						Class330_Sub34 var9 = Class238.method2377(var8, client.aClass1_9025.aClass488_22, 76114328);
						var9.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 119);
						var9.aClass330_Sub46_Sub2_7729.addShortA(var4[var6], -1722903839);
						client.aClass1_9025.method378(var9, -959598633);
					}
					var5 = true;
					break;
				}
			}
			if (!var5) {
				Class475_Sub2.method5952(4, Class526.aClass526_6201.method6257(Class429.aClass454_4369, 991479434) + arg1, -1817856742);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "se.km(" + ')');
		}
	}

	public static boolean method5598(Interface20 arg0, Class330_Sub44 arg1, int arg2) {
		try {
			return arg0 != null && arg0.method283(arg1, client.anInterface18Array9004, client.anInt9003, Class238.aClass355_2583, (byte) 46);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "se.o(" + ')');
		}
	}

	public static final void method5599(IComponentDefinitions arg0, Class120 arg1, boolean arg2, int arg3, Class430 arg4, byte arg5) {
		try {
			arg4.anInt4376 -= 2;
			int var6 = arg4.anIntArray4387[arg4.anInt4376];
			int var7 = arg4.anIntArray4387[arg4.anInt4376 + 1];
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class465.method5842(arg0.anInt1196, -680748183);
				Class330_Sub10.method3288(arg0.anInt1196, (byte) 1);
				Class149_Sub1.method1767(arg0.anInt1196, 1056791926);
			}
			if (var6 == -1) {
				arg0.anInt1238 = 1;
				arg0.anInt1239 = -1;
				arg0.anInt1335 = -1;
			} else {
				arg0.anInt1335 = var6;
				arg0.anInt1336 = var7;
				arg0.aBoolean1337 = arg2;
				ItemDefinitions var8 = Class556.aClass510_6392.getItemDefinitions(var6, (byte) -105);
				arg0.anInt1296 = var8.modelRotation1;
				arg0.anInt1245 = var8.modelRotation2;
				arg0.anInt1248 = var8.anInt6717;
				arg0.anInt1321 = var8.modelOffset1;
				arg0.anInt1243 = var8.modelOffset2;
				arg0.anInt1354 = var8.modelZoom;
				arg0.anInt1255 = arg3;
				if (arg0.anInt1290 > 0) {
					arg0.anInt1354 = arg0.anInt1354 * 32 / arg0.anInt1290;
				} else if (arg0.anInt1346 > 0) {
					arg0.anInt1354 = arg0.anInt1354 * 32 / arg0.anInt1346;
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "se.hu(" + ')');
		}
	}
}
