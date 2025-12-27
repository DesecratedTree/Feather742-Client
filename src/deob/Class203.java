package deob;

public class Class203 implements Interface24 {

	public static Buffer aClass330_Sub46_6789;

	public static Class504 aClass504_6790;

	public static Class61[] aClass61Array6791;

	public String method290(Class390 arg0, int[] arg1, long arg2) {
		if (Class390.aClass390_4034 == arg0) {
			Class506 var6 = Class211.aClass505_2062.method6140(arg1[0], 1697895982);
			return var6.method6144((int) arg2, (byte) -54);
		} else if (arg0 == Class390.aClass390_4051 || arg0 == Class390.aClass390_4042) {
			ItemDefinitions var5 = Class556.aClass510_6392.getItemDefinitions((int) arg2, (byte) -78);
			return var5.name;
		} else if (arg0 == Class390.aClass390_4038 || Class390.aClass390_4036 == arg0 || arg0 == Class390.aClass390_4043) {
			return Class211.aClass505_2062.method6140(arg1[0], 1412353003).method6144((int) arg2, (byte) 79);
		} else {
			return null;
		}
	}

	public String method291(Class390 arg0, int[] arg1, long arg2) {
		try {
			if (Class390.aClass390_4034 == arg0) {
				Class506 var7 = Class211.aClass505_2062.method6140(arg1[0], 1625686710);
				return var7.method6144((int) arg2, (byte) 37);
			} else if (arg0 == Class390.aClass390_4051 || arg0 == Class390.aClass390_4042) {
				ItemDefinitions var5 = Class556.aClass510_6392.getItemDefinitions((int) arg2, (byte) -79);
				return var5.name;
			} else if (arg0 == Class390.aClass390_4038 || Class390.aClass390_4036 == arg0 || arg0 == Class390.aClass390_4043) {
				return Class211.aClass505_2062.method6140(arg1[0], 1731209743).method6144((int) arg2, (byte) -29);
			} else {
				return null;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "in.r(" + ')');
		}
	}

	public static final void method2175(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 2050339336);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class109.method1352(var3, var4, arg0, (byte) 6);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "in.cv(" + ')');
		}
	}

	public static final void method2176(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1279930889);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class252.method2527(var3, var4, arg0, (byte) 110);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "in.dc(" + ')');
		}
	}

	public static void method2177(int arg0) {
		try {
			for (Class330_Sub43 var1 = (Class330_Sub43) Class442.aClass497_4489.method6099((byte) -8); var1 != null; var1 = (Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768)) {
				if (var1.aBoolean7821) {
					var1.aBoolean7821 = false;
				} else {
					Class502.method6132(var1.anInt7819, (byte) -71);
				}
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "in.z(" + ')');
		}
	}

	public static final void method2178(Class330_Sub46_Sub2 arg0, int arg1) {
		try {
			arg0.method3820(1371286187);
			int var2 = client.anInt9121;
			Player var3 = Class263_Sub2.myPlayer = client.players[var2] = new Player(client.aClass304_9030.method3023(-400722441));
			var3.anInt10008 = var2;
			int var4 = arg0.readBits(30);
			byte var5 = (byte) (var4 >> 28);
			int var6 = var4 >> 14 & 0x3FFF;
			int var7 = var4 & 0x3FFF;
			Class381 var8 = client.aClass304_9030.method3022(-454820308);
			var3.anIntArray10018[0] = var6 - var8.gameSceneBaseX;
			var3.anIntArray10059[0] = var7 - var8.gameSceneBaseY;
			var3.method5348((float) ((var3.anIntArray10018[0] << 9) + (var3.method5453(-1303913055) << 8)), var3.method5345().aClass260_2606.aFloat2715, (float) ((var3.anIntArray10059[0] << 9) + (var3.method5453(-1422727669) << 8)));
			Class85.anInt712 = var3.aByte8658 = var3.aByte8654 = var5;
			if (client.aClass304_9030.method2995(967830627).method2788(var3.anIntArray10018[0], var3.anIntArray10059[0], (byte) 51)) {
				var3.aByte8654++;
			}
			if (Class15.aClass330_Sub46Array191[var2] != null) {
				var3.sendAppearance(Class15.aClass330_Sub46Array191[var2], 127724991);
			}
			Class15.anInt192 = 0;
			Class15.anIntArray187[++Class15.anInt192 - 1] = var2;
			Class15.aByteArray189[var2] = 0;
			Class15.anInt193 = 0;
			for (int var9 = 1; var9 < 2048; var9++) {
				if (var9 != var2) {
					int var10 = arg0.readBits(18);
					int var11 = var10 >> 16;
					int var12 = var10 >> 8 & 0xFF;
					int var13 = var10 & 0xFF;
					Class26 var14 = Class15.aClass26Array198[var9] = new Class26();
					var14.anInt313 = (var12 << 14) + (var11 << 28) + var13;
					var14.anInt310 = 0;
					var14.anInt309 = -1;
					var14.aBoolean312 = false;
					var14.aBoolean311 = false;
					Class15.anIntArray195[++Class15.anInt193 - 1] = var9;
					Class15.aByteArray189[var9] = 0;
				} else if (arg1 == -2103875213) {
					throw new IllegalStateException();
				}
			}
			arg0.method3824(-1960504320);
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "in.r(" + ')');
		}
	}

	public static final void method2179(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class243.anInt6988;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "in.aoh(" + ')');
		}
	}
}
