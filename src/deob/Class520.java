package deob;

public class Class520 {

	public static Class471 aClass471_6016 = new Class471();

	public static int anInt6017;

	public Class520() throws Throwable {
		throw new Error();
	}

	public static final void method6223(Class432_Sub1_Sub1_Sub1 arg0, boolean arg1, int arg2) {
		try {
			int var3 = Class299.aClass299_6809.aByte6805;
			int var4 = 0;
			if (arg0.anInt10058 > client.anInt8981) {
				Class95_Sub17.method1158(arg0, (byte) 96);
			} else if (arg0.anInt10038 >= client.anInt8981) {
				Class43.method588(arg0, -1042568836);
			} else {
				Class123.method1511(arg0, arg1, 914102349);
				var3 = Class477.anInt5718;
				var4 = Class421.anInt4318;
			}
			Class260 var5 = arg0.method5346().aClass260_2606;
			int var6;
			if ((int) var5.aFloat2716 < 512 || (int) var5.aFloat2711 < 512 || (int) var5.aFloat2716 >= (client.aClass304_9030.method2990(-697721570) - 1) * 512 || (int) var5.aFloat2711 >= (client.aClass304_9030.method3033((byte) -77) - 1) * 512) {
				arg0.aClass477_10032.method5988(-1, (byte) -90);
				for (var6 = 0; var6 < arg0.graphics.length; var6++) {
					arg0.graphics[var6].id = -1;
					arg0.graphics[var6].aClass477_573.method5988(-1, (byte) 14);
				}
				arg0.anIntArray10030 = null;
				arg0.anInt10058 = 0;
				arg0.anInt10038 = 0;
				var3 = Class299.aClass299_6809.aByte6805;
				var4 = 0;
				arg0.method5348((float) (arg0.anIntArray10018[0] * 512 + arg0.method5453(-1424761554) * 256), var5.aFloat2715, (float) (arg0.anIntArray10059[0] * 512 + arg0.method5453(-341394145) * 256));
				arg0.method5416(1913155234);
			}
			if (Class263_Sub2.myPlayer == arg0 && ((int) var5.aFloat2716 < 6144 || (int) var5.aFloat2711 < 6144 || (int) var5.aFloat2716 >= (client.aClass304_9030.method2990(-1829783574) - 12) * 512 || (int) var5.aFloat2711 >= (client.aClass304_9030.method3033((byte) 11) - 12) * 512)) {
				arg0.aClass477_10032.method5988(-1, (byte) -27);
				for (var6 = 0; var6 < arg0.graphics.length; var6++) {
					arg0.graphics[var6].id = -1;
					arg0.graphics[var6].aClass477_573.method5988(-1, (byte) -1);
				}
				arg0.anIntArray10030 = null;
				arg0.anInt10058 = 0;
				arg0.anInt10038 = 0;
				var3 = Class299.aClass299_6809.aByte6805;
				var4 = 0;
				arg0.method5348((float) (arg0.anIntArray10018[0] * 512 + arg0.method5453(-1876249072) * 256), var5.aFloat2715, (float) (arg0.anIntArray10059[0] * 512 + arg0.method5453(-419223416) * 256));
				arg0.method5416(1947521209);
			}
			var6 = Class95_Sub3.method1114(arg0, (byte) -102);
			Class81.method952(arg0, -2134114876);
			Class405.method4747(arg0, var3, var4, var6, -720854742);
			Class285.method2863(arg0, var3, (byte) -120);
			Class95_Sub12.method1135(arg0, -745600378);
			Class244 var7 = Class244.method2428();
			var7.method2420(Class257.method2541(arg0.aClass238_10053.method2370(1168713898)), Class257.method2541(arg0.aClass238_10055.method2370(986325685)), Class257.method2541(arg0.aClass238_10054.method2370(1278417244)));
			arg0.method5356(var7);
			var7.method2417();
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vm.he(" + ')');
		}
	}
}
