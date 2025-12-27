package deob;

public class Class23 {

	public static boolean aBoolean304 = false;

	public Class23() throws Throwable {
		throw new Error();
	}

	public static Class401_Sub1 method476(int arg0, byte arg1) {
		try {
			return Class398.aBoolean4117 && arg0 >= Class125.anInt1458 && arg0 <= Class509.anInt5946 ? Class132.aClass401_Sub1Array1505[arg0 - Class125.anInt1458] : null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ax.r(" + ')');
		}
	}

	public static final void method477(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int var3 = var2 >> 14 & 0x3FFF;
			int var4 = var2 & 0x3FFF;
			Class381 var5 = client.aClass304_9030.method3022(1197725750);
			var3 -= var5.gameSceneBaseX;
			if (var3 < 0) {
				var3 = 0;
			} else if (var3 >= client.aClass304_9030.method2990(-624021327)) {
				var3 = client.aClass304_9030.method2990(-666472452);
			}
			var4 -= var5.gameSceneBaseY;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 >= client.aClass304_9030.method3033((byte) -18)) {
				var4 = client.aClass304_9030.method3033((byte) -64);
			}
			client.anInt9068 = (var3 << 9) + 256;
			client.anInt9069 = (var4 << 9) + 256;
			Class147.anInt1621 = 5;
			Class439.anInt4456 = -1;
			Class457.anInt6844 = -1;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ax.ahx(" + ')');
		}
	}

	public static final void method478(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class240.anInt2605;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ax.aow(" + ')');
		}
	}

	public static final void method479(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Class402 var3 = Class128.aClass400_1478.method4700(var2, -644739134);
			if (var3 == null) {
				throw new RuntimeException();
			}
			Integer var4 = arg0.aClass154_4391.method1806(client.aClass435_9146.anInt4417 << 16 | var2, (byte) 6);
			int var5;
			if (var4 != null) {
				var5 = var4;
			} else if (var3.aChar4137 == 'i' || var3.aChar4137 == '1') {
				var5 = 0;
			} else {
				var5 = -1;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ax.bq(" + ')');
		}
	}

	public static final void method480(Class430 arg0, byte arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = arg0.aClass330_Sub39_4395.aString7757;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ax.ys(" + ')');
		}
	}
}
