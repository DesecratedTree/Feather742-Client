package deob;

public abstract class Class464 {

	public static int anInt5586 = 2;

	public static int anInt5588 = 1;

	public static int anInt5590 = 1;

	public int anInt5587;

	public Class330_Sub50 aClass330_Sub50_5589;

	public Class464(int arg0, Class330_Sub50 arg1) {
		this.anInt5587 = arg0;
		this.aClass330_Sub50_5589 = arg1;
	}

	public void method5717(int arg0, int arg1) {
		try {
			if (this.method5716(arg0, 1342763126) != 3) {
				this.method5722(arg0, (byte) -78);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tg.i(" + ')');
		}
	}

	public Class464(Class330_Sub50 arg0) {
		this.aClass330_Sub50_5589 = arg0;
		this.anInt5587 = this.method5715(-1311375066);
	}

	public static final void method5723(int arg0, byte arg1) {
		try {
			client.anIntArray9108 = new int[arg0];
			client.anIntArray8973 = new int[arg0];
			client.anIntArray8952 = new int[arg0];
			client.anIntArray9169 = new int[arg0];
			client.anIntArray9112 = new int[arg0];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tg.if(" + ')');
		}
	}

	public static final void method5724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			for (Class325_Sub6 var7 = (Class325_Sub6) client.aClass467_9061.method5854(-247660382); var7 != null; var7 = (Class325_Sub6) client.aClass467_9061.method5857(-1623155263)) {
				if (client.anInt8981 >= var7.anInt7494) {
					var7.method3204(-936336537);
				} else {
					Class281.method2791(var7.anInt7491, (var7.anInt7490 << 9) + 256, (var7.anInt7492 << 9) + 256, var7.anInt7493 * 2, (byte) -14);
					Class166_Sub3_Sub2.aClass263_9483.method2595(var7.aString7496, (int) ((float) arg0 + client.aFloatArray9253[0]), (int) ((float) arg1 + client.aFloatArray9253[1]), var7.anInt7495 | 0xFF000000, 0, 972363368);
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "tg.jn(" + ')');
		}
	}

	public static final void method5725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var8 = arg6 - 334;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 100) {
				var8 = 100;
			}
			int var9 = client.aShort9245 + (client.aShort9016 - client.aShort9245) * var8 / 100;
			int var16 = var9 * arg5 >> 8;
			int var10 = 16384 - arg3 & 0x3FFF;
			int var11 = 16384 - arg4 & 0x3FFF;
			int var12 = 0;
			int var13 = 0;
			int var14 = var16;
			if (var10 != 0) {
				var13 = Class257.anIntArray2683[var10] * -var16 >> 14;
				var14 = Class257.anIntArray2684[var10] * var16 >> 14;
			}
			if (var11 != 0) {
				var12 = Class257.anIntArray2683[var11] * var14 >> 14;
				var14 = Class257.anIntArray2684[var11] * var14 >> 14;
			}
			Class471.anInt5612 = arg0 - var12;
			Gfx.anInt578 = arg1 - var13;
			Class325_Sub3.anInt7484 = arg2 - var14;
			Class321.anInt7018 = arg3;
			Class145_Sub1.anInt7266 = arg4;
			Class119.anInt1399 = 0;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "tg.jh(" + ')');
		}
	}

	public static void method5726(int arg0) {
		try {
			for (int var1 = 0; var1 < 113; var1++) {
				client.aBooleanArray9230[var1] = true;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tg.lj(" + ')');
		}
	}

	public static final void method5727(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub26_7901.method5830(574708379);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tg.amh(" + ')');
		}
	}

	public static String method5728(String arg0, int arg1) {
		try {
			String var2 = null;
			int var3 = arg0.indexOf("--> ");
			if (var3 >= 0) {
				var2 = arg0.substring(0, var3 + 4);
				arg0 = arg0.substring(var3 + 4);
			}
			if (arg0.startsWith("directlogin ")) {
				int var4 = arg0.indexOf(" ", "directlogin ".length());
				if (var4 >= 0) {
					int var5 = arg0.length();
					arg0 = arg0.substring(0, var4) + " ";
					for (int var6 = var4 + 1; var6 < var5; var6++) {
						arg0 = arg0 + "*";
					}
				}
			}
			return var2 == null ? arg0 : var2 + arg0;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "tg.q(" + ')');
		}
	}

	public static void method5729(Class_ra arg0, int arg1) {
		try {
			if ((Class484.anInt5786 >= 2 || client.aBoolean9150) && client.aClass114_9165 == null) {
				String var2;
				if (client.aBoolean9150 && Class484.anInt5786 < 2) {
					var2 = client.aString9152 + Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434) + client.aString9154 + " " + Class215.aString2082;
				} else if (Class366.method4277(2065958819) && Class484.anInt5786 > 2) {
					var2 = Class50.method627(Class418.aClass330_Sub36_Sub10_4298, 1378307875);
				} else {
					Class330_Sub36_Sub10 var3 = Class418.aClass330_Sub36_Sub10_4298;
					if (var3 == null) {
						return;
					}
					var2 = Class50.method627(var3, -1119774512);
					int[] var4 = Class22.method471(var3, 1955685818);
					if (var4 != null) {
						var2 = var2 + Class431.method5343(var4, 615974039);
					}
				}
				if (Class484.anInt5786 > 2) {
					var2 = var2 + Class146.method1738(16777215, -849826454) + " / " + (Class484.anInt5786 - 2) + Class526.aClass526_6178.method6257(Class429.aClass454_4369, 991479434);
				}
				if (Class484.aClass114_5789 != null) {
					Class263 var6 = Class484.aClass114_5789.method1390(Class219.aClass230_2183, client.anInterface12_9243, -228156246);
					if (var6 == null) {
						var6 = Class166_Sub3_Sub2.aClass263_9483;
					}
					var6.method2611(var2, Class484.anInt5798, Class484.anInt5799, Class484.aClass114_5789.anInt1210, Class484.aClass114_5789.anInt1348, Class484.aClass114_5789.anInt1224, Class484.aClass114_5789.anInt1233, Class484.aClass114_5789.anInt1268, Class484.aClass114_5789.anInt1279, client.aRandom9066, Class382.anInt6680, client.anIntArray8955, Class_na.aClass61Array9725, Class444.anIntArray4495, -1762763703);
					Class524.method6252(client.anIntArray8955[0], client.anIntArray8955[1], client.anIntArray8955[2], client.anIntArray8955[3], (byte) -55);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tg.az(" + ')');
		}
	}

	public abstract int method5714(int arg0);

	public abstract int method5715(int arg0);

	public abstract int method5716(int arg0, int arg1);

	public abstract int method5718();

	public abstract void method5719(int arg0);

	public abstract void method5720(int arg0);

	public abstract void method5721(int arg0);

	public abstract void method5722(int arg0, byte arg1);
}
