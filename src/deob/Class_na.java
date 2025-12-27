package deob;

public abstract class Class_na extends Class330_Sub36 {

	public static int anInt9724;

	public static Class61[] aClass61Array9725;

	public static void method3513(int arg0, int arg1, byte arg2) {
		try {
			Class484.anInt5800 = arg0;
			Class484.anInt5820 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "na.ap(" + ')');
		}
	}

	public static void method3514(Class430 arg0, int arg1) {
		try {
			Class395 var2 = Class131.aClass407_1502.method4752(arg0.anIntArray4387[--arg0.anInt4376], -1601054334);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anIntArray4089 == null ? 0 : var2.anIntArray4089.length;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "na.f(" + ')');
		}
	}

	public static final void method3515(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg2.anInt4376 -= 3;
			int var4 = arg2.anIntArray4387[arg2.anInt4376];
			short var5 = (short) arg2.anIntArray4387[arg2.anInt4376 + 1];
			short var6 = (short) arg2.anIntArray4387[arg2.anInt4376 + 2];
			if (var4 >= 0 && var4 < 5) {
				arg0.method1401(var4, var5, var6, 2002592125);
				Class404.method4738(arg0, 446437526);
				if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
					Class401.method4719(arg0.anInt1196, var4, 2043124248);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "na.gp(" + ')');
		}
	}

	public static final void method3516(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub9 var3 = Class370.aClass268_6770.method2659(var2, 1070679971);
			if (var3.anIntArray9686 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anIntArray9686.length;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "na.acr(" + ')');
		}
	}

	public static final void method3517(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class422.method5295(var3, var4, arg0, (byte) 52);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "na.kp(" + ')');
		}
	}

	public static void method3518(Class195 arg0, Class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			Class18.aClass195_233 = arg0;
			Class18.aClass211_231 = arg1;
			Class156.anInt6464 = arg2;
			Class18.anInt232 = arg3;
			Class18.anInt230 = arg4;
			Class18.anInt234 = arg5;
			Class221.anInt6674 = arg6;
			Class362.anInt3796 = arg7;
			Exception_Sub2.anInt14 = arg8;
			Class536.aClass87_6233 = null;
			Class18.aClass87_235 = null;
			Class13.aClass87_174 = null;
			Class463.anInt5585 = arg9;
			Class95_Sub18.anInt7196 = arg10;
			Class532.method6299((byte) 13);
			Class227.aBoolean2424 = true;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "na.r(" + ')');
		}
	}

	public static final void method3519(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 / var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "na.zg(" + ')');
		}
	}

	public static final void method3520(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			String var4 = "";
			if (var3 != null && var3.aString1383 != null) {
				var4 = var3.aString1383;
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "na.acy(" + ')');
		}
	}

	public static final void method3521(boolean arg0, int arg1) {
		try {
			Class330_Sub34 var2 = Class238.method2377(OutgoingPacket.CLOSE_INTERFACE_PACKET, client.aClass1_9025.aClass488_22, 138788458);
			client.aClass1_9025.method378(var2, -396117810);
			for (Class330_Sub48 var3 = (Class330_Sub48) client.aClass497_9284.method6099((byte) 96); var3 != null; var3 = (Class330_Sub48) client.aClass497_9284.method6098((short) -32768)) {
				if (!var3.method3251(122249317)) {
					var3 = (Class330_Sub48) client.aClass497_9284.method6099((byte) 5);
					if (var3 == null) {
						if (arg1 >= -1667441567) {
							throw new IllegalStateException();
						}
						break;
					}
				}
				if (var3.anInt7860 == 0) {
					Class75.method854(var3, true, arg0, 644533666);
				}
			}
			if (client.aClass114_9078 != null) {
				Class404.method4738(client.aClass114_9078, 1536310152);
				client.aClass114_9078 = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "na.ll(" + ')');
		}
	}
}
