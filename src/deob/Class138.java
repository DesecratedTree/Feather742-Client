package deob;

public class Class138 {

	public int anInt1531;

	public int anInt1532;

	public int anInt1533;

	public static final void method1603(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			Class470.method5863((String) arg0.anObjectArray4386[arg0.anInt4378], (String) arg0.anObjectArray4386[arg0.anInt4378 + 1], "", arg0.anIntArray4387[--arg0.anInt4376] == 1, false, (byte) -83);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fn.afe(" + ')');
		}
	}

	public static final void method1604(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1217 = arg2.anIntArray4387[--arg2.anInt4376];
			arg0.anInt1216 = arg2.anIntArray4387[--arg2.anInt4376];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fn.jh(" + ')');
		}
	}

	public static void method1605(String arg0, String arg1, int arg2) {
		try {
			if (arg0.length() <= 320 && Class527.method6269(1239485372)) {
				Class551.method6378(180439552);
				Class360.username = arg0;
				Class360.password = arg1;
				Class227.method2311(18, -1188873169);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fn.z(" + ')');
		}
	}

	public static final void method1606(byte arg0) {
		try {
			Class404.method4738(client.aClass114_9165, 2073589874);
			Class307.anInt3169++;
			if (client.aBoolean9175 && client.aBoolean9170) {
				int var1 = Class464_Sub23.aClass350_8712.method4030(34823472);
				int var2 = Class464_Sub23.aClass350_8712.method4031((short) 24938);
				var1 -= client.anInt8994;
				var2 -= client.anInt9054;
				if (var1 < client.anInt9171) {
					var1 = client.anInt9171;
				}
				if (var1 + client.aClass114_9165.anInt1210 > client.anInt9171 + client.anInt9173) {
					var1 = client.anInt9173 + client.anInt9171 - client.aClass114_9165.anInt1210;
				}
				if (var2 < client.anInt9172) {
					var2 = client.anInt9172;
				}
				if (client.aClass114_9165.anInt1348 + var2 > client.anInt9172 + client.anInt9174) {
					var2 = client.anInt9174 + client.anInt9172 - client.aClass114_9165.anInt1348;
				}
				int var3;
				int var4;
				if (IsaacCipher.aClass114_5838 == client.aClass114_9242) {
					var3 = var1;
					var4 = var2;
				} else {
					var3 = client.aClass114_9242.anInt1220 + (var1 - client.anInt9171);
					var4 = var2 - client.anInt9172 + client.aClass114_9242.anInt1221;
				}
				Class330_Sub42 var5;
				if (Class464_Sub23.aClass350_8712.method4054((byte) 51)) {
					if (Class307.anInt3169 > client.aClass114_9165.anInt1177) {
						int var8 = var1 - client.anInt9176;
						int var6 = var2 - client.anInt9177;
						if (var8 > client.aClass114_9165.anInt1289 || var8 < -client.aClass114_9165.anInt1289 || var6 > client.aClass114_9165.anInt1289 || var6 < -client.aClass114_9165.anInt1289) {
							client.aBoolean9178 = true;
						}
					}
					if (client.aClass114_9165.anObjectArray1172 != null && client.aBoolean9178) {
						var5 = new Class330_Sub42();
						var5.aClass114_7809 = client.aClass114_9165;
						var5.anInt7807 = var3;
						var5.anInt7811 = var4;
						var5.anObjectArray7817 = client.aClass114_9165.anObjectArray1172;
						Class117.method1423(var5, -1631194987);
					}
				} else {
					if (client.aBoolean9178) {
						Class490.method6071(-1799482790);
						if (client.aClass114_9165.anObjectArray1303 != null) {
							var5 = new Class330_Sub42();
							var5.aClass114_7809 = client.aClass114_9165;
							var5.anInt7807 = var3;
							var5.anInt7811 = var4;
							var5.aClass114_7813 = client.aClass114_9200;
							var5.anObjectArray7817 = client.aClass114_9165.anObjectArray1303;
							Class117.method1423(var5, -1631194987);
						}
						if (client.aClass114_9200 != null && client.method3926(client.aClass114_9165) != null) {
							Class12.method436(client.aClass114_9165, client.aClass114_9200, 1027298749);
						}
					} else if ((client.anInt9145 == 1 || Class443.method5614((byte) -75)) && Class484.anInt5786 > 2) {
						Class345.method4010(client.anInt8994 + client.anInt9176, client.anInt9054 + client.anInt9177, -1794401787);
					} else if (Class458.method5668((byte) 0)) {
						Class345.method4010(client.anInt8994 + client.anInt9176, client.anInt9054 + client.anInt9177, -1152391534);
					}
					client.aClass114_9165 = null;
					client.aClass114_9242 = null;
				}
			} else if (Class307.anInt3169 > 1) {
				client.aClass114_9165 = null;
				client.aClass114_9242 = null;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "fn.lh(" + ')');
		}
	}
}
