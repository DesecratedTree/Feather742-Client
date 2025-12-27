package deob;

public class Class382 implements Interface21 {

	public int anInt6675;

	public int anInt6676;

	public int anInt6677;

	public static int anInt6680;

	public static IndexTable aClass280_6679;

	public static boolean[] aBooleanArray6678;

	public void method4403(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt6675 = arg0.readUnsignedShort(1059879321);
				this.anInt6676 = arg0.readUnsignedByte(2147295822);
				this.anInt6677 = arg0.readUnsignedByte(433529772);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pw.j(" + ')');
		}
	}

	public void method4404(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-244810126);
				if (var3 == 0) {
					if (arg1 <= -1309826898) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method4403(arg0, var3, -1865790399);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pw.r(" + ')');
		}
	}

	public static final void method4405(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1215593542);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Preferences.method2923(var3, var4, arg0, 1553537538);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pw.ft(" + ')');
		}
	}

	public static final void method4406(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -119).anInt6705;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pw.abq(" + ')');
		}
	}

	public static final void method4407(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 431425382);
			Class60.method676(var3, arg0, (byte) 10);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pw.km(" + ')');
		}
	}

	public static float method4408(float arg0, float arg1, int arg2) {
		try {
			double var3 = Math.atan2((double) arg0, (double) arg1);
			if (var3 < 0.0D) {
				var3 = var3 + 3.141592653589793D + 3.141592653589793D;
			}
			return (float) var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pw.j(" + ')');
		}
	}
}
