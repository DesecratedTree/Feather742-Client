package deob;

import java.net.Socket;

public class Class200 implements Interface10 {

	public int anInt6499;

	public static Socket aSocket6500;

	public Class200(int arg0) {
		this.anInt6499 = arg0;
	}

	public Class198 method161() {
		return Class198.aClass198_1915;
	}

	public Class198 method160() {
		return Class198.aClass198_1915;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1915;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ik.j(" + ')');
		}
	}

	public static void method2160(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			Class356 var9 = client.aClass304_9030.method3023(-400722441);
			Interface2 var10 = (Interface2) var9.method4154(arg1, arg2, arg3, -2040838155);
			Class473 var11;
			int var12;
			int var13;
			int var14;
			if (var10 != null) {
				var11 = client.aClass304_9030.method3025((byte) 13).method5705(var10.method34((short) -24174), (byte) -49);
				var12 = var10.method33((byte) -60) & 0x3;
				var13 = var10.method21(1020268653);
				if (var11.anInt5652 == -1) {
					var14 = arg6;
					if (var11.anInt5637 > 0) {
						var14 = arg7;
					}
					if (Class476.aClass476_6883.anInt6882 == var13 || Class476.aClass476_6880.anInt6882 == var13) {
						if (var12 == 0) {
							arg0.method4801(arg4, arg5, 4, var14, -1069480736);
						} else if (var12 == 1) {
							arg0.method4792(arg4, arg5, 4, var14, (short) 255);
						} else if (var12 == 2) {
							arg0.method4801(arg4 + 3, arg5, 4, var14, 1523652092);
						} else if (var12 == 3) {
							arg0.method4792(arg4, arg5 + 3, 4, var14, (short) 255);
						}
					}
					if (Class476.aClass476_6881.anInt6882 == var13) {
						if (var12 == 0) {
							arg0.method4789(arg4, arg5, 1, 1, var14, 463754225);
						} else if (var12 == 1) {
							arg0.method4789(arg4 + 3, arg5, 1, 1, var14, 463754225);
						} else if (var12 == 2) {
							arg0.method4789(arg4 + 3, arg5 + 3, 1, 1, var14, 463754225);
						} else if (var12 == 3) {
							arg0.method4789(arg4, arg5 + 3, 1, 1, var14, 463754225);
						}
					}
					if (var13 == Class476.aClass476_6880.anInt6882) {
						if (var12 == 0) {
							arg0.method4792(arg4, arg5, 4, var14, (short) 255);
						} else if (var12 == 1) {
							arg0.method4801(arg4 + 3, arg5, 4, var14, -1247675111);
						} else if (var12 == 2) {
							arg0.method4792(arg4, arg5 + 3, 4, var14, (short) 255);
						} else if (var12 == 3) {
							arg0.method4801(arg4, arg5, 4, var14, -901910703);
						}
					}
				} else {
					Class503.method6135(arg0, var11, var12, arg4, arg5, (byte) -106);
				}
			}
			var10 = (Interface2) var9.method4158(arg1, arg2, arg3, client.anInterface19_9266, (byte) 46);
			if (var10 != null) {
				var11 = client.aClass304_9030.method3025((byte) 13).method5705(var10.method34((short) -21493), (byte) -63);
				var12 = var10.method33((byte) -108) & 0x3;
				var13 = var10.method21(1020268653);
				if (var11.anInt5652 != -1) {
					Class503.method6135(arg0, var11, var12, arg4, arg5, (byte) -79);
				} else if (Class476.aClass476_6902.anInt6882 == var13) {
					var14 = -1118482;
					if (var11.anInt5637 > 0) {
						var14 = -1179648;
					}
					if (var12 == 0 || var12 == 2) {
						arg0.method4791(arg4, arg5 + 3, arg4 + 3, arg5, var14, (byte) -94);
					} else {
						arg0.method4791(arg4, arg5, arg4 + 3, arg5 + 3, var14, (byte) -94);
					}
				}
			}
			var10 = (Interface2) var9.method4177(arg1, arg2, arg3, 1315717432);
			if (var10 != null) {
				var11 = client.aClass304_9030.method3025((byte) 13).method5705(var10.method34((short) -19202), (byte) -13);
				var12 = var10.method33((byte) -119) & 0x3;
				if (var11.anInt5652 != -1) {
					Class503.method6135(arg0, var11, var12, arg4, arg5, (byte) -10);
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ik.z(" + ')');
		}
	}

	public static void sendGlobalConfig(int arg0, int arg1, byte arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(1, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ik.as(" + ')');
		}
	}
}
