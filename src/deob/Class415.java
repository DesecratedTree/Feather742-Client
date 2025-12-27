package deob;

public class Class415 {

	public Class415() throws Throwable {
		throw new Error();
	}

	public static final void method5244(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9159;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rg.uz(" + ')');
		}
	}

	public static final void method5245(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.aClass234_2570, client.aClass1_9060.aClass488_22, -453269778);
			var4.aClass330_Sub46_Sub2_7729.addShort(Class57.method659(var2, -1138392062) + Class57.method659(var3, -773808679), (byte) 53);
			var4.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -62);
			var4.aClass330_Sub46_Sub2_7729.addString(var3, (byte) -80);
			client.aClass1_9060.method378(var4, -2007508958);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rg.vt(" + ')');
		}
	}

	public static void method5246(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			if (Class442.aClass497_4489.method6094((long) arg0) == null) {
				if (client.aBoolean9231) {
					Class330_Sub43 var4 = new Class330_Sub43(arg0, new Class324_Sub1(4096, Class307.aClass280_3167, arg0), arg1, arg2);
					var4.aClass324_Sub1_7825.method3190(Class429.aClass454_4369.method5648(-512418066), 1940574113);
					Class442.aClass497_4489.method6097(var4, (long) arg0);
				} else {
					Class147.method1742(arg0, arg2, 1389682987);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rg.r(" + ')');
		}
	}

	public static final void method5247(int arg0) {
		try {
			if (client.windowPaneId != -1) {
				int var1 = Class464_Sub23.aClass350_8712.method4030(34823472);
				int var2 = Class464_Sub23.aClass350_8712.method4031((short) 20447);
				Class330_Sub44 var3 = (Class330_Sub44) client.aClass471_8997.method5869(539664854);
				if (var3 != null) {
					var1 = var3.method3710((byte) 28);
					var2 = var3.method3711(1949948629);
				}
				if (client.aClass114_9165 != null && IsaacCipher.aClass114_5838 == client.aClass114_9242) {
					client.aBoolean9170 = true;
					client.anInt9171 = 0;
					client.anInt9172 = 0;
					client.anInt9173 = Class300.anInt3058;
					client.anInt9174 = Class146.anInt1615;
				}
				Class145.method1726(null, client.windowPaneId, 0, 0, Class300.anInt3058, Class146.anInt1615, 0, 0, var1, var2, (short) 2182);
				if (Class354_Sub1.aClass114_7976 != null) {
					Class430.method5333(var1, var2, 166016387);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rg.lu(" + ')');
		}
	}

	public static final void method5248(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class401_Sub1 var3 = Class23.method476(var2, (byte) 35);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt4131;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString8246;
				Class396 var4 = var3.method4720(-1023134731);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4.anInt4106;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4.aString4107;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt4133;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt8248;
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString8247;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rg.ana(" + ')');
		}
	}

	public static final void method5249(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString1266;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rg.pi(" + ')');
		}
	}
}
