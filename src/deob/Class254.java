package deob;

public class Class254 {

	public static int anInt2639 = 4;

	public static int anInt2640 = 2;

	public static int anInt2641 = 1;

	public static int anInt2642 = 0;

	public static int anInt2643 = 1;

	public Class254() throws Throwable {
		throw new Error();
	}

	public static final void method2535(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class60.method676(var3, arg0, (byte) 10);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kr.ky(" + ')');
		}
	}

	public static final void method2536(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class3.aClass120Array56[var2] == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class3.aClass120Array56[var2].aClass114Array1400.length;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kr.ann(" + ')');
		}
	}

	public static final void method2537(Class330_Sub10 arg0, boolean arg1, int arg2) {
		try {
			if (arg0.aBoolean7586) {
				if (arg0.anInt7578 < 0 || Class81.method951(client.aClass304_9030.method3025((byte) 13), arg0.anInt7578, arg0.anInt7580, -1749389378)) {
					if (arg1) {
						Class283.method2826(arg0.anInt7581, arg0.anInt7575, arg0.anInt7582, arg0.anInt7577, null, (byte) 12);
					} else {
						Class551.method6379(arg0.anInt7581, arg0.anInt7575, arg0.anInt7582, arg0.anInt7577, arg0.anInt7578, arg0.anInt7579, arg0.anInt7580, -1, 2070447252);
					}
					arg0.method3252(1049266350);
				}
			} else if (arg0.aBoolean7583 && arg0.anInt7582 >= 1 && arg0.anInt7577 >= 1 && arg0.anInt7582 <= client.aClass304_9030.method2990(-1319276962) - 2 && arg0.anInt7577 <= client.aClass304_9030.method3033((byte) -56) - 2 && (arg0.anInt7589 < 0 || Class81.method951(client.aClass304_9030.method3025((byte) 13), arg0.anInt7589, arg0.anInt7585, -1882961035))) {
				if (arg1) {
					Class283.method2826(arg0.anInt7581, arg0.anInt7575, arg0.anInt7582, arg0.anInt7577, arg0.aClass481_7584, (byte) 12);
				} else {
					Class551.method6379(arg0.anInt7581, arg0.anInt7575, arg0.anInt7582, arg0.anInt7577, arg0.anInt7589, arg0.anInt7574, arg0.anInt7585, -1, 2041587757);
				}
				arg0.aBoolean7583 = false;
				if (!arg1 && arg0.anInt7589 == arg0.anInt7578 && arg0.anInt7578 == -1) {
					arg0.method3252(1353884686);
				} else if (!arg1 && arg0.anInt7589 == arg0.anInt7578 && arg0.anInt7574 == arg0.anInt7579 && arg0.anInt7580 == arg0.anInt7585) {
					arg0.method3252(871606302);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kr.s(" + ')');
		}
	}
}
