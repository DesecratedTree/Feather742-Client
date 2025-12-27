package deob;

import java.applet.Applet;

public class Class293 implements Interface26 {

	public static Class293 aClass293_6803 = new Class293(3, 0);

	public static Class293 aClass293_6799 = new Class293(7, 1);

	public static Class293 aClass293_6796 = new Class293(6, 2);

	public static Class293 aClass293_6797 = new Class293(1, 3);

	public static Class293 aClass293_6798 = new Class293(4, 4);

	public static Class293 aClass293_6794 = new Class293(2, 5);

	public static Class293 aClass293_6795 = new Class293(5, 6);

	public static Class293 aClass293_6801 = new Class293(0, 7);

	public int anInt6802;

	public int anInt6800;

	public static Applet anApplet6804;

	public Class293 method2912(byte arg0) {
		try {
			switch(this.anInt6802) {
				case 0:
					return aClass293_6797;
				case 1:
					return aClass293_6801;
				case 2:
					return aClass293_6799;
				case 3:
					return aClass293_6798;
				case 4:
					return aClass293_6803;
				case 5:
					return aClass293_6796;
				case 6:
					return aClass293_6795;
				case 7:
					return aClass293_6794;
				default:
					throw new IllegalStateException();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mg.i(" + ')');
		}
	}

	public int method298() {
		return this.anInt6800 * 611650261 * 371318397;
	}

	public int method300() {
		return this.anInt6800 * 611650261 * 371318397;
	}

	public int method297(short arg0) {
		try {
			return this.anInt6800;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mg.j(" + ')');
		}
	}

	public int method299() {
		return this.anInt6800 * 611650261 * 371318397;
	}

	public Class293(int arg0, int arg1) {
		this.anInt6802 = arg0;
		this.anInt6800 = arg1;
	}

	public int method301() {
		return this.anInt6800 * 611650261 * 371318397;
	}

	public static void method2913(int arg0, int arg1) {
		try {
			if (arg0 < 0 || arg0 > 2) {
				arg0 = 0;
			}
			Class391.anInt4053 = arg0;
			Class50.aClass388Array482 = new Class388[Class91.anIntArray821[Class391.anInt4053] + 1];
			Class391.anInt4060 = 0;
			Class391.anInt4057 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mg.o(" + ')');
		}
	}

	public static final void method2914(Class430 arg0, int arg1) {
		try {
			if (arg0.anIntArray4387[--arg0.anInt4376] == 0) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mg.by(" + ')');
		}
	}

	public static Class330_Sub34 walking(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class330_Sub34 var4 = null;
			if (arg2 == 0) {
				var4 = Class238.method2377(OutgoingPacket.WALKING_PACKET, client.aClass1_9025.aClass488_22, 1812486596);
			}
			if (arg2 == 1) {
				var4 = Class238.method2377(OutgoingPacket.WALKING_MINIMAP_PACKET, client.aClass1_9025.aClass488_22, -12731468);
			}
			Class381 var5 = client.aClass304_9030.method3022(997312965);
			var4.aClass330_Sub46_Sub2_7729.addByte(Class356.method4190((byte) 3) ? 1 : 0, (byte) 32);
			var4.aClass330_Sub46_Sub2_7729.addLEShortA(var5.gameSceneBaseX + arg0, 149091030);
			var4.aClass330_Sub46_Sub2_7729.addShort(arg1 + var5.gameSceneBaseY, (byte) 112);
			Class9.anInt146 = arg0;
			Class9.anInt151 = arg1;
			Class9.aBoolean141 = false;
			Class444.method5617(-1898159781);
			return var4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "mg.bm(" + ')');
		}
	}

	public static final void method2916(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			int var4 = arg0.anIntArray4387[--arg0.anInt4376];
			Class537 var5 = Class301.aClass543_3059.method6339(var4, -1887426214);
			if (var5.method6321((byte) -42)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.method1398(var4, var5.aString6236, 276821900);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.method1397(var4, var5.anInt6235, (byte) 52);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "mg.pv(" + ')');
		}
	}

	public static boolean method2917(int arg0, short arg1) {
		try {
			return arg0 == 0 || arg0 == 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mg.s(" + ')');
		}
	}
}
