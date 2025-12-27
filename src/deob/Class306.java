package deob;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class306 {

	public Class306() throws Throwable {
		throw new Error();
	}

	public static final void method3051(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var2 > 700 || var3 > 700) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 256;
			}
			double var4 = (Math.random() * (double) (var3 + var2) - (double) var2 + 800.0D) / 100.0D;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (Math.pow(2.0D, var4) + 0.5D);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "mt.zl(" + ')');
		}
	}

	public static Class61 method3052(byte[] arg0, int arg1) {
		try {
			if (arg0 == null) {
				throw new RuntimeException("");
			}
			while (true) {
				Class61 var2;
				try {
					Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
					MediaTracker var4 = new MediaTracker(Class293.anApplet6804);
					var4.addImage(var3, 0);
					var4.waitForAll();
					int var5 = var3.getWidth(Class293.anApplet6804);
					int var6 = var3.getHeight(Class293.anApplet6804);
					if (var4.isErrorAny() || var5 < 0 || var6 < 0) {
						throw new RuntimeException("");
					}
					int[] var7 = new int[var6 * var5];
					PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
					var8.grabPixels();
					var2 = Class361.aClass_ra3793.method4795(var7, 0, var5, var5, var6, (byte) -78);
				} catch (InterruptedException var9) {
					continue;
				}
				return var2;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "mt.o(" + ')');
		}
	}

	public static final void method3053(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			long var5 = Class394.method4631(0, 0, 12, var2, var3, var4, (byte) -87);
			int var7 = Class104.method1246(var5);
			if (var4 < 1970) {
				var7--;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var7;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "mt.amz(" + ')');
		}
	}

	public static final void method3054(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1894008956);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mt.alq(" + ')');
		}
	}

	public static void method3055(int arg0, String arg1, boolean arg2, short arg3) {
		try {
			Class132.method1566((byte) -108);
			Class464_Sub2.method5740(-1549941192);
			Class170.method2043(1414512035);
			Class297.method2968(arg0, arg1, arg2, -1726204187);
			Class219.aClass230_2183.method2328((byte) -59);
			Class219.aClass230_2183.method2332(client.anInterface12_9243, 2076618772);
			Class385.method4423(Class361.aClass_ra3793, 541999997);
			Class76.method866(Class361.aClass_ra3793, Class540.aClass280_6249, 953650434);
			Class112.method1379(-1431934078);
			Class148.method1755(Class57.aClass61Array6599, -2133542290);
			Class464.method5726(-1833811463);
			Class22.method473((byte) -26);
			if (client.anInt8995 == 6) {
				Class227.method2311(5, -1188873169);
			} else if (client.anInt8995 == 15) {
				Class227.method2311(19, -1188873169);
			} else if (client.anInt8995 == 11) {
				Class227.method2311(7, -1188873169);
			} else if (client.anInt8995 == 1) {
				Class227.method2311(16, -1188873169);
			} else if (client.anInt8995 == 2 || client.anInt8995 == 10) {
				Class330_Sub9.method3286(-732857675);
			} else if (client.anInt8995 == 14) {
				Class227.method2311(17, -1188873169);
			} else if (client.anInt8995 == 16) {
				Class481.method6020(false, 1296254468);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mt.fq(" + ')');
		}
	}

	public static final void method3056(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class419.method5276(var3, var4, arg0, 1325668833);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mt.fk(" + ')');
		}
	}
}
