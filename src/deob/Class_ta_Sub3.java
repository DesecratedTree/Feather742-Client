package deob;

public class Class_ta_Sub3 extends Class_ta {

	public int[] anIntArray8661;

	public int[] anIntArray8662;

	public Class_ta_Sub3(int arg0, int arg1, int[] arg2, int[] arg3) {
		this.anIntArray8661 = arg2;
		this.anIntArray8662 = arg3;
	}

	public static final void method5684(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 == -1) {
				int var3 = var2 >> 14 & 0x3FFF;
				int var4 = var2 & 0x3FFF;
				Class381 var5 = client.aClass304_9030.method3022(2005692921);
				var3 -= var5.gameSceneBaseX;
				if (var3 < 0) {
					var3 = 0;
				} else if (var3 >= client.aClass304_9030.method2990(-1230718412)) {
					var3 = client.aClass304_9030.method2990(-965199704);
				}
				var4 -= var5.gameSceneBaseY;
				if (var4 < 0) {
					var4 = 0;
				} else if (var4 >= client.aClass304_9030.method3033((byte) -38)) {
					var4 = client.aClass304_9030.method3033((byte) -58);
				}
				Class457.anInt6844 = (var3 << 9) + 256;
				Class439.anInt4456 = (var4 << 9) + 256;
			} else {
				Class457.anInt6844 = -1;
				Class439.anInt4456 = -1;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "yq.ahh(" + ')');
		}
	}

	public static final void method5685(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 5;
			Class115.method1415(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], arg0.anIntArray4387[arg0.anInt4376 + 3], arg0.anIntArray4387[arg0.anInt4376 + 4], (byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "yq.tr(" + ')');
		}
	}

	public static String method5686(int arg0, Class454 arg1, int arg2) {
		try {
			if (arg0 < 100000) {
				return "<col=ffff00>" + arg0 + "</col>";
			} else if (arg0 < 10000000) {
				return "<col=ffffff>" + arg0 / 1000 + Class526.aClass526_6177.method6257(arg1, 991479434) + "</col>";
			} else {
				return "<col=00ff80>" + arg0 / 1000000 + Class526.aClass526_6175.method6257(arg1, 991479434) + "</col>";
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "yq.b(" + ')');
		}
	}
}
