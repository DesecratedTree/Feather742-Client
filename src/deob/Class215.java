package deob;

import java.io.FileOutputStream;

public class Class215 {

	public static String aString2085 = "true";

	public static String aString2081 = ",";

	public static String aString2080 = " (";

	public static String aString2078 = ")";

	public static String aString2082 = "->";

	public static String aString2083 = "127.0.0.1";

	public static String aString2084 = "<br>";

	public static String aString2079 = "</col>";

	public static FileOutputStream aFileOutputStream2086;

	public Class215() throws Throwable {
		throw new Error();
	}

	public static final void method2236(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg2.anInt4376 -= 2;
			arg0.anInt1263 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1231 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			Class404.method4738(arg0, 822238978);
			Class544.method6345(arg1, arg0, (byte) 7);
			if (arg0.anInt1198 == 0) {
				Class156.method1829(arg1, arg0, false, -1636606630);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "j.cl(" + ')');
		}
	}

	public static final void method2237(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, short arg3) {
		try {
			arg2.anInt4376 -= 2;
			arg0.anInt1220 = arg2.anIntArray4387[arg2.anInt4376];
			if (arg0.anInt1220 > arg0.anInt1222 - arg0.anInt1210) {
				arg0.anInt1220 = arg0.anInt1222 - arg0.anInt1210;
			}
			if (arg0.anInt1220 < 0) {
				arg0.anInt1220 = 0;
			}
			arg0.anInt1221 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			if (arg0.anInt1221 > arg0.anInt1223 - arg0.anInt1348) {
				arg0.anInt1221 = arg0.anInt1223 - arg0.anInt1348;
			}
			if (arg0.anInt1221 < 0) {
				arg0.anInt1221 = 0;
			}
			Class404.method4738(arg0, 862962042);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class197.method2151(arg0.anInt1196, -1219490982);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "j.cx(" + ')');
		}
	}

	public static final void method2238(Class430 arg0, byte arg1) {
		try {
			if (client.aString8968 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class349.method4026(client.aString8968, -713335394);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "j.wo(" + ')');
		}
	}

	public static void method2239(Class330_Sub36 arg0, Class330_Sub36 arg1, int arg2) {
		try {
			if (arg0.aClass330_Sub36_7736 != null) {
				arg0.method3439((byte) -89);
			}
			arg0.aClass330_Sub36_7736 = arg1;
			arg0.aClass330_Sub36_7735 = arg1.aClass330_Sub36_7735;
			arg0.aClass330_Sub36_7736.aClass330_Sub36_7735 = arg0;
			arg0.aClass330_Sub36_7735.aClass330_Sub36_7736 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "j.p(" + ')');
		}
	}

	public static final void method2240(Class430 arg0, short arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.anInt9182 != 0 || (!client.aBoolean9083 || client.aBoolean9228) && !client.aBoolean9073) {
				String var3 = var2.toLowerCase();
				byte var4 = 0;
				if (var3.startsWith(Class526.aClass526_6190.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 0;
					var2 = var2.substring(Class526.aClass526_6190.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6038.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 1;
					var2 = var2.substring(Class526.aClass526_6038.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6043.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 2;
					var2 = var2.substring(Class526.aClass526_6043.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6117.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 3;
					var2 = var2.substring(Class526.aClass526_6117.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6088.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 4;
					var2 = var2.substring(Class526.aClass526_6088.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6075.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 5;
					var2 = var2.substring(Class526.aClass526_6075.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6196.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 6;
					var2 = var2.substring(Class526.aClass526_6196.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6114.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 7;
					var2 = var2.substring(Class526.aClass526_6114.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6202.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 8;
					var2 = var2.substring(Class526.aClass526_6202.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6199.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 9;
					var2 = var2.substring(Class526.aClass526_6199.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6200.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 10;
					var2 = var2.substring(Class526.aClass526_6200.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6049.method6257(Class454.aClass454_6832, 991479434))) {
					var4 = 11;
					var2 = var2.substring(Class526.aClass526_6049.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (Class429.aClass454_4369 != Class454.aClass454_6832) {
					if (var3.startsWith(Class526.aClass526_6190.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 0;
						var2 = var2.substring(Class526.aClass526_6190.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6038.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 1;
						var2 = var2.substring(Class526.aClass526_6038.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6043.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 2;
						var2 = var2.substring(Class526.aClass526_6043.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6117.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 3;
						var2 = var2.substring(Class526.aClass526_6117.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6088.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 4;
						var2 = var2.substring(Class526.aClass526_6088.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6075.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 5;
						var2 = var2.substring(Class526.aClass526_6075.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6196.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 6;
						var2 = var2.substring(Class526.aClass526_6196.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6114.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 7;
						var2 = var2.substring(Class526.aClass526_6114.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6202.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 8;
						var2 = var2.substring(Class526.aClass526_6202.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6199.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 9;
						var2 = var2.substring(Class526.aClass526_6199.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6200.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 10;
						var2 = var2.substring(Class526.aClass526_6200.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6049.method6257(Class429.aClass454_4369, 991479434))) {
						var4 = 11;
						var2 = var2.substring(Class526.aClass526_6049.method6257(Class429.aClass454_4369, 991479434).length());
					}
				}
				var3 = var2.toLowerCase();
				byte var5 = 0;
				if (var3.startsWith(Class526.aClass526_6146.method6257(Class454.aClass454_6832, 991479434))) {
					var5 = 1;
					var2 = var2.substring(Class526.aClass526_6146.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6191.method6257(Class454.aClass454_6832, 991479434))) {
					var5 = 2;
					var2 = var2.substring(Class526.aClass526_6191.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6050.method6257(Class454.aClass454_6832, 991479434))) {
					var5 = 3;
					var2 = var2.substring(Class526.aClass526_6050.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6160.method6257(Class454.aClass454_6832, 991479434))) {
					var5 = 4;
					var2 = var2.substring(Class526.aClass526_6160.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (var3.startsWith(Class526.aClass526_6206.method6257(Class454.aClass454_6832, 991479434))) {
					var5 = 5;
					var2 = var2.substring(Class526.aClass526_6206.method6257(Class454.aClass454_6832, 991479434).length());
				} else if (Class429.aClass454_4369 != Class454.aClass454_6832) {
					if (var3.startsWith(Class526.aClass526_6146.method6257(Class429.aClass454_4369, 991479434))) {
						var5 = 1;
						var2 = var2.substring(Class526.aClass526_6146.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6191.method6257(Class429.aClass454_4369, 991479434))) {
						var5 = 2;
						var2 = var2.substring(Class526.aClass526_6191.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6050.method6257(Class429.aClass454_4369, 991479434))) {
						var5 = 3;
						var2 = var2.substring(Class526.aClass526_6050.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6160.method6257(Class429.aClass454_4369, 991479434))) {
						var5 = 4;
						var2 = var2.substring(Class526.aClass526_6160.method6257(Class429.aClass454_4369, 991479434).length());
					} else if (var3.startsWith(Class526.aClass526_6206.method6257(Class429.aClass454_4369, 991479434))) {
						var5 = 5;
						var2 = var2.substring(Class526.aClass526_6206.method6257(Class429.aClass454_4369, 991479434).length());
					}
				}
				Class1 var6 = Class426.method5317(1855047238);
				Class330_Sub34 var7 = Class238.method2377(OutgoingPacket.CHAT_PACKET, var6.aClass488_22, 1630121644);
				var7.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 44);
				int var8 = var7.aClass330_Sub46_Sub2_7729.offset;
				var7.aClass330_Sub46_Sub2_7729.addByte(var4, (byte) 16);
				var7.aClass330_Sub46_Sub2_7729.addByte(var5, (byte) 115);
				Class210.method2220(var7.aClass330_Sub46_Sub2_7729, var2, -97722941);
				var7.aClass330_Sub46_Sub2_7729.method3751(var7.aClass330_Sub46_Sub2_7729.offset - var8, 1763857069);
				var6.method378(var7, -1410953032);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "j.acp(" + ')');
		}
	}
}
