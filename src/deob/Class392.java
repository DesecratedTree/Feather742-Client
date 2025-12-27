package deob;

import java.util.Queue;

public class Class392 implements Interface25 {

	public static int anInt6792;

	public static Class357 aClass357_6793;

	public void method295(boolean arg0) {
	}

	public void method293(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = arg0 >> 16;
			int var6 = arg0 & 0xFFFF;
			Queue var7 = Class393.aQueue4064;
			synchronized (Class393.aQueue4064) {
				Class393.aQueue4064.add(Class386.method4439(var5, var6, arg1, arg2, -2034517636));
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "qf.j(" + ')');
		}
	}

	public void method294(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = arg0 & 0xFFFF;
		Queue var6 = Class393.aQueue4064;
		synchronized (Class393.aQueue4064) {
			Class393.aQueue4064.add(Class386.method4439(var4, var5, arg1, arg2, -1917561549));
		}
	}

	public void method292(boolean arg0, int arg1) {
	}

	public void method296(boolean arg0) {
	}

	public static final void method4608(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376];
			if (var4 == IComponentDefinitions.anInt1327 || var4 == IComponentDefinitions.anInt1173 || var4 == IComponentDefinitions.anInt1174) {
				arg0.anInt1291 = var4;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qf.im(" + ')');
		}
	}

	public static final void method4609(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class1 var3 = Class426.method5317(1780618600);
			Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.FRIEND_QUICK_CHAT_PACKET, var3.aClass488_22, 1657658158);
			var4.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 32);
			int var5 = var4.aClass330_Sub46_Sub2_7729.offset;
			var4.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -119);
			var4.aClass330_Sub46_Sub2_7729.addShort(arg0.aClass209_4385.anInt1981, (byte) 117);
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(var4.aClass330_Sub46_Sub2_7729, arg0.aClass209_4385.anIntArray1983, (byte) 59);
			var4.aClass330_Sub46_Sub2_7729.method3751(var4.aClass330_Sub46_Sub2_7729.offset - var5, -386967251);
			var3.method378(var4, -1125676812);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qf.adf(" + ')');
		}
	}

	public static final void method4610(Class432_Sub1 arg0, Class430 arg1, int arg2) {
		try {
			boolean var3 = false;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (arg0.aClass80Array8656 != null) {
				for (int var8 = 0; var8 < arg0.aClass80Array8656.length; var8++) {
					Class80 var9 = arg0.aClass80Array8656[var8];
					if (var9.aBoolean671) {
						int var10;
						int var11;
						if (var9.anInt668 < var9.anInt669) {
							var10 = var9.anInt668 - var9.anInt673;
							var11 = var9.anInt673 + var9.anInt669;
						} else {
							var10 = var9.anInt669 - var9.anInt673;
							var11 = var9.anInt668 + var9.anInt673;
						}
						int var12;
						int var13;
						if (var9.anInt672 < var9.anInt670) {
							var12 = var9.anInt672 - var9.anInt673;
							var13 = var9.anInt673 + var9.anInt670;
						} else {
							var12 = var9.anInt670 - var9.anInt673;
							var13 = var9.anInt673 + var9.anInt672;
						}
						if (!var3 || var10 < var4) {
							var4 = var10;
						}
						if (!var3 || var12 < var5) {
							var5 = var12;
						}
						if (!var3 || var11 > var6) {
							var6 = var11;
						}
						if (!var3 || var13 > var7) {
							var7 = var13;
						}
						var3 = true;
					}
				}
			}
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var3 ? 1 : 0;
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var4;
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var5;
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var6;
			arg1.anIntArray4387[++arg1.anInt4376 - 1] = var7;
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "qf.ari(" + ')');
		}
	}

	public static final void method4611(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class301.method2978(var3, var4, arg0, (byte) 5);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qf.ih(" + ')');
		}
	}

	public static final void method4612(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			Class401_Sub1.aClass145_Sub1_8249.method1719((float) arg0.anIntArray4387[--arg0.anInt4376] / 1000.0F, -88299728);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qf.aic(" + ')');
		}
	}

	public static void method4613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Class330_Sub36_Sub13 arg7, Class263 arg8, Class524 arg9, int arg10, int arg11, int arg12) {
		try {
			if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt6033 - 1 && arg1 < arg6 + arg9.anInt6035) {
				arg10 = arg11;
			}
			String var13 = Class401.method4715(arg7, 817335418);
			arg8.method2606(var13, arg2 + 3, arg6, arg10, 0, client.aRandom9066, Class382.anInt6680, Class_na.aClass61Array9725, Class444.anIntArray4495, -1490561740);
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "qf.am(" + ')');
		}
	}

	public static final void method4614(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -636062148);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class_na.method3515(var3, var4, arg0, (byte) 30);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qf.gc(" + ')');
		}
	}
}
