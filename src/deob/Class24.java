package deob;

public class Class24 {

	public static IndexTable aClass280_305;

	public Class24() throws Throwable {
		throw new Error();
	}

	public static final void method481(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class498.method6110(4, var2 << 16 | var3, var4, "", (byte) -17);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ay.anz(" + ')');
		}
	}

	public static final void method482(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1395653637);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class511.method6185(var3, var4, arg0, 568948775);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ay.in(" + ')');
		}
	}

	public static final void method483(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			if (arg1.anInt4377 >= 10) {
				throw new RuntimeException();
			} else if (arg0.anObjectArray1333 != null) {
				Class330_Sub42 var3 = new Class330_Sub42();
				var3.aClass114_7809 = arg0;
				var3.anObjectArray7817 = arg0.anObjectArray1333;
				var3.anInt7810 = arg1.anInt4377 + 1;
				client.aClass471_9280.method5878(var3, (short) 8192);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ay.qw(" + ')');
		}
	}

	public static void method484(int arg0) {
		try {
			for (int var1 = 0; var1 < 100; var1++) {
				Class119.aClass117Array1394[var1] = null;
			}
			Class119.anInt1395 = 0;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ay.z(" + ')');
		}
	}

	public static final void method485(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1218 = arg2.anIntArray4387[--arg2.anInt4376];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ay.kn(" + ')');
		}
	}
}
