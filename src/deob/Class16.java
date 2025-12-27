package deob;

import java.awt.Container;
import java.awt.Insets;

public class Class16 {

	public static int anInt199 = 12002;

	public static float aFloat200 = 1.3F;

	public static float aFloat201 = 1.1F;

	public static int anInt202 = 500;

	public static int anInt203 = 5025;

	public static int anInt205 = 5087;

	public static int anInt206 = 20049;

	public static int anInt207 = 2071;

	public static int anInt208 = 103;

	public static int anInt209 = 1001;

	public static long aLong210 = 64425238954L;

	public static long aLong211 = 1L;

	public static boolean aBoolean212 = false;

	public static int anInt213 = 10036;

	public static boolean aBoolean204 = false;

	public static boolean aBoolean214 = false;

	public static long aLong215;

	public Class16() throws Throwable {
		throw new Error();
	}

	public static final void method447(Class430 arg0, int arg1) {
		try {
			if (Class282_Sub1.aShortArray7443 == null || Class432_Sub1_Sub4_Sub2.anInt10001 >= Class440.anInt4482) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class282_Sub1.aShortArray7443[++Class432_Sub1_Sub4_Sub2.anInt10001 - 1] & 0xFFFF;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aq.ads(" + ')');
		}
	}

	public static final void method448(Class430 arg0, int arg1) {
		try {
			if (Class238.aClass355_2583.isKeyHeld(86, -107362717)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aq.adi(" + ')');
		}
	}

	public static int method449(CharSequence arg0, int arg1, int arg2) {
		try {
			return Class240.method2399(arg0, arg1, true, -1798249579);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aq.s(" + ')');
		}
	}

	public static void method450(int arg0) {
		try {
			client var1 = Class394.aClient4082;
			synchronized (Class394.aClient4082) {
				if (Class130.aFrame1498 == null) {
					Container var2 = Class432_Sub1_Sub3_Sub1.method5526((byte) 13);
					if (var2 != null) {
						client.anInt6609 = var2.getSize().width;
						Class520.anInt6017 = var2.getSize().height;
						Insets var3;
						if (Class267.aFrame2740 == var2) {
							var3 = Class267.aFrame2740.getInsets();
							client.anInt6609 -= var3.right + var3.left;
							Class520.anInt6017 -= var3.bottom + var3.top;
						}
						if (client.anInt6609 <= 0) {
							client.anInt6609 = 1;
						}
						if (Class520.anInt6017 <= 0) {
							Class520.anInt6017 = 1;
						}
						if (Class545.method6347(1079239502) == 1) {
							Class300.anInt3058 = client.anInt9207;
							client.anInt6611 = (client.anInt6609 - client.anInt9207) / 2;
							Class146.anInt1615 = client.anInt9118;
							client.anInt6612 = 0;
						} else {
							Class451.method5633(399066082);
						}
						if (Class457.aClass457_6834 != Class404.aClass457_4162 && Class300.anInt3058 < 1024 && Class146.anInt1615 >= 768) {
						}
						Class475.aCanvas5700.setSize(Class300.anInt3058, Class146.anInt1615);
						if (Class361.aClass_ra3793 != null) {
							Class361.aClass_ra3793.method4806(Class475.aCanvas5700, Class300.anInt3058, Class146.anInt1615, (byte) -19);
						}
						if (var2 == Class267.aFrame2740) {
							var3 = Class267.aFrame2740.getInsets();
							Class475.aCanvas5700.setLocation(client.anInt6611 + var3.left, var3.top + client.anInt6612);
						} else {
							Class475.aCanvas5700.setLocation(client.anInt6611, client.anInt6612);
						}
						Class158_Sub2.method1852(-891496377);
						if (client.windowPaneId != -1) {
							Class476.method5960(true, (short) -13435);
						}
						Class113.method1384(-1949719547);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aq.gj(" + ')');
		}
	}

	public static final void method451(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class361.aClass_ra3793.v()) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5716(var2, -966768485);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 3;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aq.aql(" + ')');
		}
	}
}
