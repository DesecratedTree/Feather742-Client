package deob;

public class Class300 {

	public OutgoingPacketManager aClass310_3057;

	public Class330_Sub46_Sub2 aClass330_Sub46_Sub2_3056;

	public static int anInt3058;

	public Class300(OutgoingPacketManager arg0, Class330_Sub46_Sub2 arg1) {
		this.aClass310_3057 = arg0;
		this.aClass330_Sub46_Sub2_3056 = arg1;
	}

	public static Class369[] method2974(int arg0) {
		try {
			return new Class369[] { Class369.aClass369_6818, Class369.aClass369_6815, Class369.aClass369_6817 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "mn.r(" + ')');
		}
	}

	public static final void method2975(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1348;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mn.pg(" + ')');
		}
	}

	public static final void method2976(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class3.aClass120Array56[var2] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				String var3 = Class3.aClass120Array56[var2].aClass114Array1400[0].aString1360;
				if (var3 == null) {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				} else {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.substring(0, var3.indexOf(58));
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mn.ans(" + ')');
		}
	}

	public static String method2977(byte[] arg0, byte arg1) {
		try {
			return Class125.method1525(arg0, 0, arg0.length, (byte) 1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mn.f(" + ')');
		}
	}
}
