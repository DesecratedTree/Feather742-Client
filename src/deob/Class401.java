package deob;

public abstract class Class401 {

	public static int anInt4128 = 2;

	public static int anInt4129 = 4;

	public static int anInt4130 = 8;

	public static int anInt4132 = 1;

	public int anInt4127;

	public int anInt4131;

	public int anInt4133;

	public boolean method4709(int arg0) {
		try {
			return (this.anInt4131 & 0x2) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.j(" + ')');
		}
	}

	public boolean method4710(byte arg0) {
		try {
			return (this.anInt4131 & 0x4) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.i(" + ')');
		}
	}

	public boolean method4711(byte arg0) {
		try {
			return (this.anInt4131 & 0x1) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.r(" + ')');
		}
	}

	public boolean method4712(byte arg0) {
		try {
			return (this.anInt4131 & 0x8) != 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.p(" + ')');
		}
	}

	public static final void method4713(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class429.method5326(var3, var4, arg0, -813555107);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qq.oc(" + ')');
		}
	}

	public static final void method4714(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub29_7903.method5839((short) 255) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.alb(" + ')');
		}
	}

	public static String method4715(Class330_Sub36_Sub13 arg0, int arg1) {
		try {
			return arg0.aString9717 + Class146.method1738(16777215, -849826454) + " >";
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.bo(" + ')');
		}
	}

	public static final void method4716(int arg0) {
		try {
			Class1 var1 = Class426.method5317(1908590306);
			Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.JOIN_FRIEND_CHAT_PACKET, var1.aClass488_22, -239204966);
			var2.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 24);
			var1.method378(var2, -1662623356);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.ma(" + ')');
		}
	}

	public static long method4717(int arg0, int arg1) {
		try {
			return (long) (arg0 + 11745) * 86400000L;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qq.n(" + ')');
		}
	}

	public static final void method4718(Class430 arg0, int arg1) {
		try {
			boolean var2 = false;
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.aBoolean9198) {
				try {
					Object var4 = Class232.aClass232_2461.method2355(new Object[] { var3 }, -1424372457);
					if (var4 != null) {
						var2 = (Boolean) var4;
					}
				} catch (Throwable var5) {
				}
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 ? 1 : 0;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qq.apb(" + ')');
		}
	}

	public static void method4719(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(19, (long) arg1 << 32 | (long) arg0);
			var3.method3444(1908091451);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qq.ai(" + ')');
		}
	}
}
