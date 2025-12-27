package deob;

public class Class136 {

	public static Class136 aClass136_1524 = new Class136(0);

	public static Class136 aClass136_1523 = new Class136(1);

	public static Class136 aClass136_1525 = new Class136(2);

	public static Class136 aClass136_1526 = new Class136(3);

	public int anInt1522;

	public static Class416 aClass416_1527;

	public Class136(int arg0) {
		this.anInt1522 = arg0;
	}

	public static final void method1587(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			if (arg0.anInt1198 == 4) {
				Class464_Sub1.method5734(arg0, arg1, arg2, -700379507);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fl.gi(" + ')');
		}
	}

	public static final void method1588(Class430 arg0, int arg1) {
		try {
			if (client.aString8968 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class452.anInt5561;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fl.wc(" + ')');
		}
	}

	public static final void method1589(Class430 arg0, int arg1) {
		try {
			Class484.anInt5810 = arg0.anIntArray4387[--arg0.anInt4376];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fl.ags(" + ')');
		}
	}

	public static void method1590(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[arg0.anInt4376 - 3];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 - 2];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 - 1];
			arg0.anInt4376 -= 3;
			if (var2 > arg0.anIntArray4373[var3]) {
				throw new RuntimeException();
			} else if (var2 > arg0.anIntArray4373[var4]) {
				throw new RuntimeException();
			} else if (var3 == var4) {
				throw new RuntimeException();
			} else {
				Class297.method2969(arg0.anIntArrayArray4374[var3], arg0.anIntArrayArray4374[var4], 0, var2 - 1, -1943771105);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fl.arw(" + ')');
		}
	}

	public static void method1591(Class533 arg0, int arg1) {
		try {
			Class128.method1551(new Class465(arg0), -69548430);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fl.i(" + ')');
		}
	}

	public static final void method1592(byte arg0, int arg1) {
		try {
			byte[][][] var2 = client.aClass304_9030.method2999(-580390108);
			if (var2 == null) {
				var2 = new byte[4][client.aClass304_9030.method2990(-1143713339)][client.aClass304_9030.method3033((byte) -92)];
				client.aClass304_9030.method3000(var2, 1301910551);
			}
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < client.aClass304_9030.method2990(-808895625); var4++) {
					for (int var5 = 0; var5 < client.aClass304_9030.method3033((byte) -126); var5++) {
						var2[var3][var4][var5] = arg0;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fl.iw(" + ')');
		}
	}

	public static final void method1593(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			int var3 = 0;
			if (Class72.method829(var2, -1858918960)) {
				var3 = Class204.method2185(var2, (byte) -95);
			}
			Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.ENTER_INTEGER_PACKET, client.aClass1_9025.aClass488_22, 296806092);
			var4.aClass330_Sub46_Sub2_7729.addInt(var3, 1965508160);
			client.aClass1_9025.method378(var4, -1777139108);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fl.sy(" + ')');
		}
	}

	public static int method1594(int arg0, int arg1) {
		try {
			int var4 = arg0 - 1;
			int var5 = var4 | var4 >>> 1;
			int var6 = var5 | var5 >>> 2;
			int var7 = var6 | var6 >>> 4;
			int var8 = var7 | var7 >>> 8;
			int var9 = var8 | var8 >>> 16;
			return var9 + 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fl.p(" + ')');
		}
	}

	public static final void method1595(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 38209760);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class78.method934(var3, var4, arg0, (byte) 7);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fl.ma(" + ')');
		}
	}

	public static void method1596(Class_ra arg0, IComponentDefinitions arg1, int arg2) {
		try {
            boolean var3 = Class556.aClass510_6392.method6167(arg0, arg1.anInt1335, arg1.anInt1336, arg1.anInt1232, arg1.anInt1233 | 0xFF000000, arg1.anInt1255, arg1.aBoolean1337 ? Class263_Sub2.myPlayer.aClass408_10240 : null, 1803167499) == null;
			if (var3) {
				Class11.aClass471_166.method5878(new Class330_Sub4(arg1.anInt1335, arg1.anInt1336, arg1.anInt1232, arg1.anInt1233 | 0xFF000000, arg1.anInt1255, arg1.aBoolean1337), (short) 8192);
				Class404.method4738(arg1, 2030219023);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fl.r(" + ')');
		}
	}
}
