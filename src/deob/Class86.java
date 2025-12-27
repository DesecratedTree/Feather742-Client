package deob;

import java.awt.Container;
import java.awt.Insets;

public class Class86 {

	public static Class86 aClass86_715 = new Class86(7, 1);

	public static Class86 aClass86_721 = new Class86(0, 2);

	public static Class86 aClass86_723 = new Class86(4, 4);

	public static Class86 aClass86_714 = new Class86(1, 1);

	public static Class86 aClass86_718 = new Class86(6, 2);

	public static Class86 aClass86_719 = new Class86(2, 3);

	public static Class86 aClass86_720 = new Class86(3, 4);

	public static Class86 aClass86_716 = new Class86(8, 2);

	public static Class86 aClass86_717 = new Class86(5, 4);

	public int anInt722;

	public int anInt724;

	public Class86(int arg0, int arg1) {
		this.anInt722 = arg0;
		this.anInt724 = arg1;
	}

	public static final void method978(Class430 arg0, int arg1) {
		try {
			arg0.aLongArray4372[arg0.anIntArray4394[arg0.anInt4397]] = arg0.aLongArray4379[--arg0.anInt4380];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dl.bc(" + ')');
		}
	}

	public static final void method979(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 600884783);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class195.method2138(var3, var4, arg0, 608192596);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dl.of(" + ')');
		}
	}

	public static void method980(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null && (arg1 != 3 || arg2 != client.anInt6635 || arg3 != Class536.anInt6229)) {
				Class417.method5268(Class203.aClass504_6790, Class130.aFrame1498, 2099655266);
				Class130.aFrame1498 = null;
			}
			if (Class503.aBoolean5914 && arg1 == 3 && Class130.aFrame1498 == null) {
				Class130.aFrame1498 = Class105.method1309(Class203.aClass504_6790, arg2, arg3, 0, 0, -1971924557);
				if (Class130.aFrame1498 != null) {
					client.anInt6635 = arg2;
					Class536.anInt6229 = arg3;
					Class435.method5568(1320026430);
				}
			}
			if (arg1 == 3 && (!Class503.aBoolean5914 || Class130.aFrame1498 == null)) {
				method980(arg0, Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-126324947), -1, -1, true, -681123409);
			} else {
				Container var6 = Class432_Sub1_Sub3_Sub1.method5526((byte) 77);
				Insets var7;
				if (Class130.aFrame1498 != null) {
					client.anInt6609 = arg2;
					Class520.anInt6017 = arg3;
				} else if (Class267.aFrame2740 == null) {
					client.anInt6609 = var6.getSize().width;
					Class520.anInt6017 = var6.getSize().height;
				} else {
					var7 = Class267.aFrame2740.getInsets();
					int var10001 = var7.left + var7.right;
					client.anInt6609 = Class267.aFrame2740.getSize().width - var10001;
					int var10 = var7.top + var7.bottom;
					Class520.anInt6017 = Class267.aFrame2740.getSize().height - var10;
				}
				if (client.anInt6609 <= 0) {
					client.anInt6609 = 1;
				}
				if (Class520.anInt6017 <= 0) {
					Class520.anInt6017 = 1;
				}
				if (arg1 == 1) {
					Class300.anInt3058 = client.anInt9207;
					client.anInt6611 = (client.anInt6609 - client.anInt9207) / 2;
					Class146.anInt1615 = client.anInt9118;
					client.anInt6612 = 0;
				} else {
					Class451.method5633(399066082);
				}
				if (Class404.aClass457_4162 != Class457.aClass457_6834 && Class300.anInt3058 < 1024 && Class146.anInt1615 >= 768) {
				}
				if (arg4) {
					Class83.method967(512638721);
				} else {
					Class475.aCanvas5700.setSize(Class300.anInt3058, Class146.anInt1615);
					Class361.aClass_ra3793.method4806(Class475.aCanvas5700, Class300.anInt3058, Class146.anInt1615, (byte) -86);
					if (Class267.aFrame2740 == var6) {
						var7 = Class267.aFrame2740.getInsets();
						Class475.aCanvas5700.setLocation(client.anInt6611 + var7.left, var7.top + client.anInt6612);
					} else {
						Class475.aCanvas5700.setLocation(client.anInt6611, client.anInt6612);
					}
				}
				if (arg1 >= 2) {
					client.aBoolean9033 = true;
				} else {
					client.aBoolean9033 = false;
				}
				Class158_Sub2.method1852(-891496377);
				if (client.windowPaneId != -1) {
					Class476.method5960(true, (short) 7340);
				}
				if (client.aClass1_9025.method380(90350409) != null && Class475_Sub5.method5958(client.anInt8995, 885477300)) {
					Class19.method462(-1806030557);
				}
				for (int var9 = 0; var9 < 113; var9++) {
					client.aBooleanArray9230[var9] = true;
				}
				client.aBoolean6619 = true;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "dl.gx(" + ')');
		}
	}

	public static void method981(int arg0, int arg1, int[] arg2, int[] arg3, float[] arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		try {
			int var13 = arg6 + arg0 * arg7;
			int var14 = arg8 + arg1 * arg9;
			int var15 = arg0 - arg10;
			int var16 = arg1 - arg10;
			int var17;
			int var18;
			if (arg2 == null) {
				for (var17 = 0; var17 < arg11; var17++) {
					var18 = arg10 + var13;
					while (var13 < var18) {
						arg5[var14++] = arg4[var13++];
					}
					var13 += var15;
					var14 += var16;
				}
			} else if (arg4 == null) {
				for (var17 = 0; var17 < arg11; var17++) {
					var18 = arg10 + var13;
					while (var13 < var18) {
						arg3[var14++] = arg2[var13++];
					}
					var13 += var15;
					var14 += var16;
				}
			} else {
				for (var17 = 0; var17 < arg11; var17++) {
					var18 = var13 + arg10;
					while (var13 < var18) {
						arg3[var14] = arg2[var13];
						arg5[var14++] = arg4[var13++];
					}
					var13 += var15;
					var14 += var16;
				}
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "dl.ai(" + ')');
		}
	}

	public static final void method982(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -599491848);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class281.method2789(var3, var4, arg0, 343282612);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dl.fn(" + ')');
		}
	}
}
