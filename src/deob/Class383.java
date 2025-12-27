package deob;

public class Class383 {

	public Class383() throws Throwable {
		throw new Error();
	}

	public static Class137 method4409(int arg0, byte arg1) {
		try {
			if (arg0 == Class137.aClass137_1530.anInt1528) {
				return Class137.aClass137_1530;
			} else if (Class137.aClass137_1529.anInt1528 == arg0) {
				return Class137.aClass137_1529;
			} else {
				return null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "px.r(" + ')');
		}
	}

	public static final void method4410(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			ItemDefinitions var4 = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -127);
			if (var3 < 1 || var3 > 5 || var4.groundOptions[var3 - 1] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4.groundOptions[var3 - 1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "px.aas(" + ')');
		}
	}

	public static Class469[] method4411(short arg0) {
		try {
			return new Class469[] { Class469.aClass469_5605, Class469.aClass469_5602, Class469.aClass469_5606, Class469.aClass469_5603, Class469.aClass469_5604 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "px.r(" + ')');
		}
	}

	public static void method4412(byte arg0) {
		try {
			Class508.method6158(-752340859);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "px.j(" + ')');
		}
	}

	public static final void method4413(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class429.method5330(var2, -2115076953);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "px.ain(" + ')');
		}
	}

	public static final void method4414(Class330_Sub46_Sub2 arg0, int arg1) {
		try {
			int var2 = 0;
			arg0.method3820(1206919867);
			int var3;
			int var4;
			int var5;
			for (var3 = 0; var3 < Class15.anInt192; var3++) {
				var4 = Class15.anIntArray187[var3];
				if ((Class15.aByteArray189[var4] & 0x1) == 0) {
					if (var2 > 0) {
						var2--;
						Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
					} else {
						var5 = arg0.readBits(1);
						if (var5 == 0) {
							var2 = Class334.method3937(arg0, 1986382750);
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						} else {
							Class499.method6118(arg0, var4, 769528925);
						}
					}
				}
			}
			arg0.method3824(1045571776);
			if (var2 != 0) {
				throw new RuntimeException();
			}
			arg0.method3820(1452352898);
			for (var3 = 0; var3 < Class15.anInt192; var3++) {
				var4 = Class15.anIntArray187[var3];
				if ((Class15.aByteArray189[var4] & 0x1) != 0) {
					if (var2 > 0) {
						var2--;
						Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
					} else {
						var5 = arg0.readBits(1);
						if (var5 == 0) {
							var2 = Class334.method3937(arg0, 1986382750);
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						} else {
							Class499.method6118(arg0, var4, 2101708867);
						}
					}
				}
			}
			arg0.method3824(1585066155);
			if (var2 != 0) {
				throw new RuntimeException();
			}
			arg0.method3820(848105913);
			for (var3 = 0; var3 < Class15.anInt193; var3++) {
				var4 = Class15.anIntArray195[var3];
				if ((Class15.aByteArray189[var4] & 0x1) != 0) {
					if (var2 > 0) {
						var2--;
						Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
					} else {
						var5 = arg0.readBits(1);
						if (var5 == 0) {
							var2 = Class334.method3937(arg0, 1986382750);
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						} else if (Class_ra_Sub3.method5218(arg0, var4, 1076434295)) {
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						}
					}
				}
			}
			arg0.method3824(503132829);
			if (var2 != 0) {
				throw new RuntimeException();
			}
			arg0.method3820(1134751691);
			for (var3 = 0; var3 < Class15.anInt193; var3++) {
				var4 = Class15.anIntArray195[var3];
				if ((Class15.aByteArray189[var4] & 0x1) == 0) {
					if (var2 > 0) {
						var2--;
						Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
					} else {
						var5 = arg0.readBits(1);
						if (var5 == 0) {
							var2 = Class334.method3937(arg0, 1986382750);
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						} else if (Class_ra_Sub3.method5218(arg0, var4, 568755198)) {
							Class15.aByteArray189[var4] = (byte) (Class15.aByteArray189[var4] | 0x2);
						}
					}
				}
			}
			arg0.method3824(-1091019833);
			if (var2 != 0) {
				throw new RuntimeException();
			}
			Class15.anInt192 = 0;
			Class15.anInt193 = 0;
			for (var3 = 1; var3 < 2048; var3++) {
				Class15.aByteArray189[var3] = (byte) (Class15.aByteArray189[var3] >> 1);
				Player var7 = client.players[var3];
				if (var7 == null) {
					Class15.anIntArray195[++Class15.anInt193 - 1] = var3;
				} else {
					Class15.anIntArray187[++Class15.anInt192 - 1] = var3;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "px.i(" + ')');
		}
	}
}
