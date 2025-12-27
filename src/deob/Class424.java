package deob;

public class Class424 {

	public static Class378 aClass378_4326 = new Class378(128);

	public Class424() throws Throwable {
		throw new Error();
	}

	public static char method5305(char arg0, Class454 arg1, byte arg2) {
		try {
			if (arg0 >= 192 && arg0 <= 255) {
				if (arg0 >= 192 && arg0 <= 198) {
					return 'A';
				}
				if (arg0 == 199) {
					return 'C';
				}
				if (arg0 >= 200 && arg0 <= 203) {
					return 'E';
				}
				if (arg0 >= 204 && arg0 <= 207) {
					return 'I';
				}
				if (arg0 == 209 && arg1 != Class454.aClass454_6826) {
					return 'N';
				}
				if (arg0 >= 210 && arg0 <= 214) {
					return 'O';
				}
				if (arg0 >= 217 && arg0 <= 220) {
					return 'U';
				}
				if (arg0 == 221) {
					return 'Y';
				}
				if (arg0 == 223) {
					return 's';
				}
				if (arg0 >= 224 && arg0 <= 230) {
					return 'a';
				}
				if (arg0 == 231) {
					return 'c';
				}
				if (arg0 >= 232 && arg0 <= 235) {
					return 'e';
				}
				if (arg0 >= 236 && arg0 <= 239) {
					return 'i';
				}
				if (arg0 == 241 && arg1 != Class454.aClass454_6826) {
					return 'n';
				}
				if (arg0 >= 242 && arg0 <= 246) {
					return 'o';
				}
				if (arg0 >= 249 && arg0 <= 252) {
					return 'u';
				}
				if (arg0 == 253 || arg0 == 255) {
					return 'y';
				}
			}
			if (arg0 == 338) {
				return 'O';
			} else if (arg0 == 339) {
				return 'o';
			} else if (arg0 == 376) {
				return 'Y';
			} else {
				return arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rq.j(" + ')');
		}
	}

	public static final void method5306(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1316 = Class288.method2886(var4, arg2, 2051033008);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rq.oy(" + ')');
		}
	}

	public static void method5307(Class549_Sub1 arg0, int arg1, int arg2) {
		try {
			arg0.method6362(2, (byte) 8);
			byte var3;
			if (arg1 > 12002) {
				Class283.method2828(116916103);
				var3 = 4;
			} else if (arg1 > 5087) {
				Class95_Sub12_Sub1.method1141(496549938);
				var3 = 3;
			} else if (arg1 > 2071) {
				Class51.method634(1559635556);
				var3 = 2;
			} else {
				Class330_Sub18.method3342(true, 1610528370);
				var3 = 1;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-117764912) == 2) {
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, -448101109);
			} else {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 2, 1960726753);
				Class171.method2046(2, false, 1824985251);
			}
			Class435.method5568(1315555208);
			arg0.method6360(var3, 95955317);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rq.s(" + ')');
		}
	}

	public static final void method5308(IComponentDefinitions arg0, int arg1) {
		try {
			if (arg0.anInt1207 == IComponentDefinitions.anInt1272) {
				if (Class263_Sub2.myPlayer.aString10221 == null) {
					arg0.anInt1239 = 0;
					arg0.anInt1240 = 0;
				} else {
					arg0.anInt1296 = 150;
					arg0.anInt1245 = (int) (Math.sin((double) client.anInt8981 / 40.0D) * 256.0D) & 0x7FF;
					arg0.anInt1238 = 5;
					arg0.anInt1239 = client.anInt9121;
					arg0.anInt1240 = Class96.method1184(Class263_Sub2.myPlayer.aString10221, 1713493636);
					Class477_Sub3 var2 = Class263_Sub2.myPlayer.aClass477_Sub3_10039;
					if (var2 == null) {
						arg0.aClass477_1344 = null;
					} else {
						if (arg0.aClass477_1344 == null) {
							arg0.aClass477_1344 = new Class477_Sub1();
						}
						arg0.anInt1345 = var2.method5967((byte) -21);
						arg0.aClass477_1344.method5965(var2, 2141760373);
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rq.lx(" + ')');
		}
	}
}
