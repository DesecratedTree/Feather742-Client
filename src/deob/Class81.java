package deob;

public class Class81 {

	public Class461 aClass461_675 = new Class461();

	public static int anInt674 = 8191;

	public static void method945(int arg0, int arg1) {
		try {
			Class542.anInt6251 = arg0;
			IComponentDefinitions.aClass367_1310.method4298((byte) 4);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dg.d(" + ')');
		}
	}

	public static final void method946(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class439.method5599(var3, var4, false, 1, arg0, (byte) 51);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dg.hj(" + ')');
		}
	}

	public static final void method947(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			String var4 = "";
			if (var3 != null && var3.aString1386 != null) {
				var4 = var3.aString1386;
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dg.acg(" + ')');
		}
	}

	public static final void method948(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 595113170);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class246.method2453(var3, var4, arg0, -1328366066);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dg.mu(" + ')');
		}
	}

	public static final void method949(Class430 arg0, int arg1) {
		try {
			boolean var2 = arg0.anIntArray4387[--arg0.anInt4376] == 1;
			if (var2) {
				Class147.anInt1621 = 2;
			} else {
				Class340.method3971(998972413);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dg.aio(" + ')');
		}
	}

	public static int method950(int arg0, int arg1, byte arg2) {
		try {
			int var3 = arg0 >>> 31;
			return (var3 + arg0) / arg1 - var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dg.w(" + ')');
		}
	}

	public static final boolean method951(Class463 arg0, int arg1, int arg2, int arg3) {
		try {
			Class473 var4 = arg0.method5705(arg1, (byte) -95);
			if (arg2 == 11) {
				arg2 = 10;
			}
			if (arg2 >= 5 && arg2 <= 8) {
				arg2 = 4;
			}
			return var4.method5895(arg2, (byte) -78);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dg.cz(" + ')');
		}
	}

	public static final void method952(Class432_Sub1_Sub1_Sub1 arg0, int arg1) {
		try {
			if (arg0.anIntArray10029 != null || arg0.anIntArray10049 != null) {
				boolean var2 = true;
				Class381 var3 = client.aClass304_9030.method3022(1417101658);
				for (int var4 = 0; var4 < arg0.anIntArray10029.length; var4++) {
					int var5 = -1;
					if (arg0.anIntArray10029 != null) {
						var5 = arg0.anIntArray10029[var4];
					}
					if (var5 != -1) {
						var2 = false;
						boolean var6 = false;
						boolean var7 = false;
						Class260 var8 = arg0.method5346().aClass260_2606;
						int var9;
						int var10;
						int var11;
						if ((var5 & -1073741824) == -1073741824) {
							var11 = var5 & 0xFFFFFFF;
							int var12 = var11 >> 14;
							int var13 = var11 & 0x3FFF;
							var9 = (int) var8.aFloat2716 - ((var12 - var3.gameSceneBaseX) * 512 + 256);
							var10 = (int) var8.aFloat2711 - ((var13 - var3.gameSceneBaseY) * 512 + 256);
						} else {
							Class260 var18;
							if ((var5 & 0x8000) == 0) {
								Class330_Sub35 var15 = (Class330_Sub35) client.aClass497_9014.method6094((long) var5);
								if (var15 == null) {
									arg0.method5454(var4, -1, (byte) 114);
									continue;
								}
								NPC var17 = (NPC) var15.anObject7733;
								var18 = var17.method5346().aClass260_2606;
								var9 = (int) var8.aFloat2716 - (int) var18.aFloat2716;
								var10 = (int) var8.aFloat2711 - (int) var18.aFloat2711;
							} else {
								var11 = var5 & 0x7FFF;
								Player var16 = client.players[var11];
								if (var16 == null) {
									arg0.method5454(var4, -1, (byte) 95);
									continue;
								}
								var18 = var16.method5346().aClass260_2606;
								var9 = (int) var8.aFloat2716 - (int) var18.aFloat2716;
								var10 = (int) var8.aFloat2711 - (int) var18.aFloat2711;
							}
						}
						if (var9 != 0 || var10 != 0) {
							arg0.method5454(var4, (int) (Math.atan2((double) var9, (double) var10) * 2607.5945876176133D) & 0x3FFF, (byte) 82);
						}
					} else if (!arg0.method5454(var4, -1, (byte) 122)) {
						var2 = false;
					}
				}
				if (var2) {
					arg0.anIntArray10029 = null;
					arg0.anIntArray10049 = null;
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "dg.hh(" + ')');
		}
	}

	public static void method953(int arg0, byte arg1) {
		try {
			Class367 var2 = Class459.aClass367_5566;
			synchronized (Class459.aClass367_5566) {
				Class459.aClass367_5566.method4292(arg0, (byte) 6);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dg.p(" + ')');
		}
	}

	public static void sendSpeech(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, byte arg8) {
		try {
			Class117 var9 = Class119.aClass117Array1394[99];
			for (int var10 = 99; var10 > 0; var10--) {
				Class119.aClass117Array1394[var10] = Class119.aClass117Array1394[var10 - 1];
			}
			if (var9 == null) {
				var9 = new Class117(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
			} else {
				var9.method1422(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, 1381524931);
			}
			Class119.aClass117Array1394[0] = var9;
			Class119.anInt1395++;
			client.anInt9028 = client.anInt9268;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "dg.o(" + ')');
		}
	}

	public static Buffer method955(int arg0) {
		try {
			Buffer var1 = Class336.method3945((byte) -40);
			var1.method3802(0L);
			var1.addString(Class360.password, (byte) -13);
			var1.method3802(Class360.aLong3776);
			var1.method3802(client.aLong8991);
			var1.applyRSA(Class2.aBigInteger43, Class2.aBigInteger41, -1219170947);
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "dg.h(" + ')');
		}
	}
}
