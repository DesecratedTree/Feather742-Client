package deob;

public class Class422 {

	public volatile int anInt4319 = -1;

	public volatile String aString4320;

	public static Class277 aClass277_4322;

	public static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_4321;

	public Class422(String arg0) {
		this.aString4320 = arg0;
	}

	public static final void method5295(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1250 = arg2.anIntArray4387[--arg2.anInt4376];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ro.jv(" + ')');
		}
	}

	public static final void method5296(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 4;
			arg0.anInt1239 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1240 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			if (arg2.anIntArray4387[arg2.anInt4376 + 2] == 1) {
				arg0.anInt1238 = 9;
			} else {
				arg0.anInt1238 = 8;
			}
			if (arg2.anIntArray4387[arg2.anInt4376 + 3] == 1) {
				arg0.aBoolean1337 = true;
			} else {
				arg0.aBoolean1337 = false;
			}
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class70.method822(arg0.anInt1196, 1368542776);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ro.if(" + ')');
		}
	}

	public static final void method5297(Class430 arg0, byte arg1) {
		try {
			Class232.aClass232_2451.method2357(1191464430);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ro.agc(" + ')');
		}
	}
}
