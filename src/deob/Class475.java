package deob;

import java.awt.Canvas;
import java.io.IOException;

public abstract class Class475 {

	public Class145 aClass145_5699;

	public static int anInt5701;

	public static Canvas aCanvas5700;

	public Class475(Class145 arg0) {
		this.aClass145_5699 = arg0;
	}

	public static final void method5937(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anInt4378 -= var2;
			String var3 = Class167.method2023(arg0.anObjectArray4386, arg0.anInt4378, var2, (byte) 70);
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tr.ab(" + ')');
		}
	}

	public static int method5938(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			Class330_Sub1 var4 = Class321.method3178(arg0, arg2, (short) 8716);
			if (var4 == null) {
				return 0;
			} else if (arg1 == -1) {
				return 0;
			} else {
				int var5 = 0;
				for (int var6 = 0; var6 < var4.anIntArray7497.length; var6++) {
					if (var4.anIntArray7500[var6] == arg1) {
						var5 += var4.anIntArray7497[var6];
					}
				}
				return var5;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "tr.i(" + ')');
		}
	}

	public static final void method5939(Class430 arg0, int arg1) {
		try {
			Class401.method4716(-1446426496);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tr.wb(" + ')');
		}
	}

	public static final void method5940(Class430 arg0, int arg1) {
		try {
			NPC var2 = (NPC) arg0.aClass432_Sub1_Sub1_Sub1_4396;
			Class551 var3 = var2.aClass551_10251;
			if (var3.anIntArray6326 != null) {
				var3 = var3.method6371(Class158.aClass561_6474, (byte) 37);
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == null ? 0 : 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tr.arr(" + ')');
		}
	}

	public static void method5941(IndexTable arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, int arg6, int arg7) {
		try {
			Class110.anInt1152 = 1;
			Class110.aClass280_1161 = arg0;
			Class110.musicId = arg1;
			Class369.anInt6819 = arg2;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = arg3;
			Class268.aBoolean2746 = arg4;
			Class457.anInt6843 = 10000;
			Class72.aLong621 = arg5;
			Class559.anInt6433 = arg6;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "tr.o(" + ')');
		}
	}

	public static Class366 method5942(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			Class363.aClass366_Sub4_3804.anInt3854 = arg0;
			Class363.aClass366_Sub4_3804.anInt3853 = arg1;
			Class363.aClass366_Sub4_3804.anInt3852 = arg2;
			Class363.aClass366_Sub4_3804.anInt3855 = arg3;
			return Class363.aClass366_Sub4_3804;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "tr.j(" + ')');
		}
	}

	public static final void method5943(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tr.ag(" + ')');
		}
	}

	public static void method5944(boolean arg0, int arg1) {
		try {
			Class233.method2362((byte) 22);
			if (Class475_Sub5.method5958(client.anInt8995, 885477300)) {
				Class1[] var2 = client.aClass1Array8963;
				for (int var3 = 0; var3 < var2.length; var3++) {
					Class1 var4 = var2[var3];
					var4.anInt29++;
					if (var4.anInt29 < 50 && !arg0) {
						return;
					}
					var4.anInt29 = 0;
					if (!var4.aBoolean37 && var4.method380(-2135214463) != null) {
						Class330_Sub34 var5 = Class238.method2377(OutgoingPacket.PING_PACKET, var4.aClass488_22, 1040295195);
						var4.method378(var5, -1118795869);
						try {
							var4.method381(1975384887);
						} catch (IOException var7) {
							var4.aBoolean37 = true;
						}
					}
				}
				Class233.method2362((byte) -61);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "tr.r(" + ')');
		}
	}

	public abstract void method5922(Class138 arg0, Class247 arg1, int arg2, int arg3, int arg4);

	public abstract void method5923(float arg0, int arg1);

	public abstract boolean method5924(int arg0);

	public abstract void method5925(Buffer arg0, int arg1);

	public abstract boolean method5926();

	public abstract void method5927(float arg0);

	public abstract void method5928(float arg0);

	public abstract void method5929(float arg0);

	public abstract void method5930(float arg0);

	public abstract boolean method5931();

	public abstract Class260 method5932(int arg0);

	public abstract void method5933(Class138 arg0, Class247 arg1, int arg2, int arg3);

	public abstract void method5934(Class138 arg0, Class247 arg1, int arg2, int arg3);

	public abstract Class260 method5935();

	public abstract void method5936(Buffer arg0);
}
