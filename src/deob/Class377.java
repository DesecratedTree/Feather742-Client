package deob;

import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;

public class Class377 {

	public static Class377 aClass377_3934 = new Class377(0);

	public static Class377 aClass377_3935 = new Class377(1);

	public static Class377 aClass377_3936 = new Class377(2);

	public Class377(int arg0) {
	}

	public static final void method4370(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class337.method3950(var3, var4, arg0, 1237899383);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pr.nc(" + ')');
		}
	}

	public static final void method4371(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			boolean var3 = Class394.aClient4082.method3880(new File(var2), 1028025223);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pr.agz(" + ')');
		}
	}

	public static final void method4372(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class401_Sub1.aClass145_Sub1_8249.method1682((float) var2, (float) var3, (byte) 1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pr.ahc(" + ')');
		}
	}

	public static final void method4373(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1243;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pr.ph(" + ')');
		}
	}

	public static final void method4374(Class430 arg0, byte arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub29_7903, arg0.anIntArray4387[--arg0.anInt4376] == 0 ? 0 : 1, -47477687);
			Class435.method5568(1278809449);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pr.akm(" + ')');
		}
	}

	public static void method4375(Canvas arg0, int arg1) {
		try {
			try {
				Class var2 = Class.forName("java.awt.Canvas");
				Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
				var3.invoke(arg0, Boolean.TRUE);
			} catch (Exception var4) {
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pr.ap(" + ')');
		}
	}

	public static final void method4376(int arg0, int arg1) {
		try {
			if (Class106.aClass330_Sub39_1009 != null && arg0 >= 0 && arg0 < Class106.aClass330_Sub39_1009.anInt7760) {
				Class153 var2 = Class106.aClass330_Sub39_1009.aClass153Array7759[arg0];
				if (var2.aByte1632 == -1) {
					Class1 var3 = Class426.method5317(2128738654);
					Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.aClass234_2484, var3.aClass488_22, -75396883);
					var4.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(var2.aString1633, -1333763837) + 2, (byte) 50);
					var4.aClass330_Sub46_Sub2_7729.addShort(arg0, (byte) 97);
					var4.aClass330_Sub46_Sub2_7729.addString(var2.aString1633, (byte) -13);
					var3.method378(var4, -503865983);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pr.mm(" + ')');
		}
	}
}
