package deob;

public class Class379 {

	public static int anInt3943 = 8;

	public static int anInt3944 = 9;

	public static int anInt3945 = 2;

	public static int anInt3946 = 511;

	public static int anInt3947 = 512;

	public static int anInt3948 = 1024;

	public static int anInt3949 = 256;

	public static int anInt3950 = 128;

	public static int anInt3951 = 7;

	public static int anInt3953;

	public static IComponentDefinitions[] aClass114Array3952;

	static {
		Math.sqrt(131072.0D);
	}

	public Class379() throws Throwable {
		throw new Error();
	}

	public static final void method4382(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			String var3 = arg0.aClass154_4391.method1817(client.aClass435_9146.anInt4417 << 16 | var2, (byte) 73);
			String var4;
			if (var3 == null) {
				var4 = "";
			} else {
				var4 = var3;
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pt.bv(" + ')');
		}
	}

	public static final void method4383(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5811(-1390004513) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pt.alo(" + ')');
		}
	}

	public static final void method4384(Class430 arg0, byte arg1) {
		try {
			if (client.aBoolean9198) {
				Class232.aClass232_2454.method2357(2105004854);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pt.ape(" + ')');
		}
	}

	public static final void method4385(String arg0, boolean arg1, int arg2) {
		try {
			if (arg0 != null) {
				if (client.anInt9261 >= 100) {
					Class475_Sub2.method5952(4, Class526.aClass526_6181.method6257(Class429.aClass454_4369, 991479434), -1812899482);
				} else {
					String var3 = Class531.method6297(arg0, -1632842613);
					if (var3 != null) {
						int var4;
						String var6;
						String var7;
						for (var4 = 0; var4 < client.anInt9261; var4++) {
							Class75 var5 = client.aClass75Array8982[var4];
							var6 = Class531.method6297(var5.aString646, -1774815762);
							if (var6 != null && var6.equals(var3)) {
								Class475_Sub2.method5952(4, arg0 + Class526.aClass526_6182.method6257(Class429.aClass454_4369, 991479434), -1599714438);
								return;
							}
							if (var5.aString647 != null) {
								var7 = Class531.method6297(var5.aString647, -1825451478);
								if (var7 != null && var7.equals(var3)) {
									Class475_Sub2.method5952(4, arg0 + Class526.aClass526_6182.method6257(Class429.aClass454_4369, 991479434), -604857866);
									return;
								}
							}
						}
						for (var4 = 0; var4 < client.anInt9256; var4++) {
							Class99 var9 = client.aClass99Array9259[var4];
							var6 = Class531.method6297(var9.aString915, -2120972691);
							if (var6 != null && var6.equals(var3)) {
								Class475_Sub2.method5952(4, Class526.aClass526_6171.method6257(Class429.aClass454_4369, 991479434) + arg0 + Class526.aClass526_6189.method6257(Class429.aClass454_4369, 991479434), -1894911587);
								return;
							}
							if (var9.aString910 != null) {
								var7 = Class531.method6297(var9.aString910, -1690672382);
								if (var7 != null && var7.equals(var3)) {
									Class475_Sub2.method5952(4, Class526.aClass526_6171.method6257(Class429.aClass454_4369, 991479434) + arg0 + Class526.aClass526_6189.method6257(Class429.aClass454_4369, 991479434), -1034831173);
									return;
								}
							}
						}
						if (Class531.method6297(Class263_Sub2.myPlayer.aString10221, -1846591760).equals(var3)) {
							Class475_Sub2.method5952(4, Class526.aClass526_6167.method6257(Class429.aClass454_4369, 991479434), -876778759);
						} else {
							Class1 var10 = Class426.method5317(1937584472);
							Class330_Sub34 var11 = Class238.method2377(OutgoingPacket.ADD_IGNORE_PACKET, var10.aClass488_22, -58205906);
							var11.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(arg0, -1794486447) + 1, (byte) 63);
							var11.aClass330_Sub46_Sub2_7729.addString(arg0, (byte) 0);
							var11.aClass330_Sub46_Sub2_7729.addByte(arg1 ? 1 : 0, (byte) 16);
							var10.method378(var11, -104655505);
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "pt.my(" + ')');
		}
	}

	public static final void method4386(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class330_Sub36.aBoolean7737 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pt.aoy(" + ')');
		}
	}
}
