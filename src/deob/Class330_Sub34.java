package deob;

public class Class330_Sub34 extends Class330 {

	public static Class330_Sub34[] aClass330_Sub34Array7731 = new Class330_Sub34[300];

	public static int anInt7727 = 0;

	public int anInt7728;

	public int anInt7730;

	public Class330_Sub46_Sub2 aClass330_Sub46_Sub2_7729;

	public OutgoingPacket aClass234_7732;

	public void method3436(byte arg0) {
		try {
			if (anInt7727 < aClass330_Sub34Array7731.length) {
				aClass330_Sub34Array7731[++anInt7727 - 1] = this;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ado.p(" + ')');
		}
	}

	public static void method3437(Class_ra arg0, int arg1) {
		try {
			if (Class484.aBoolean5807) {
				Class105.method1305(arg0, 604046651);
			} else {
				Class345.method4009(arg0, 251994479);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ado.ag(" + ')');
		}
	}

	public static void method3438(IComponentDefinitions arg0, int arg1, int arg2, byte arg3) {
		try {
			if (client.aBoolean9150) {
				Class537 var4 = OutgoingPacket.anInt2579 == -1 ? null : Class301.aClass543_3059.method6339(OutgoingPacket.anInt2579, -185465328);
				if (client.method3924(arg0).method3262((short) 2183) && (Class503.anInt5916 & 0x20) != 0 && (var4 == null || arg0.method1397(OutgoingPacket.anInt2579, var4.anInt6235, (byte) 75) != var4.anInt6235)) {
					Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + arg0.aString1283, Class271.anInt2756, 58, arg0.anInt1335, 0L, arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
				}
			}
			for (int var8 = 9; var8 >= 5; var8--) {
				String var5 = Class131.method1563(arg0, var8, 428205142);
				if (var5 != null) {
					Class360.method4241(var5, arg0.aString1283, Class213.method2229(arg0, var8, 1987276202), 1007, arg0.anInt1335, (long) (var8 + 1), arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
				}
			}
			String var9 = Class473.method5911(arg0, 13707572);
			if (var9 != null) {
				Class360.method4241(var9, arg0.aString1283, arg0.anInt1250, 25, arg0.anInt1335, 0L, arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
			}
			for (int var10 = 4; var10 >= 0; var10--) {
				String var6 = Class131.method1563(arg0, var10, 709719160);
				if (var6 != null) {
					Class360.method4241(var6, arg0.aString1283, Class213.method2229(arg0, var10, 1871119512), 57, arg0.anInt1335, (long) (var10 + 1), arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
				}
			}
			if (client.method3924(arg0).method3263((byte) -14)) {
				if (arg0.aString1285 == null) {
					Class360.method4241(Class526.aClass526_6051.method6257(Class429.aClass454_4369, 991479434), "", -1, 30, arg0.anInt1335, 0L, arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
				} else {
					Class360.method4241(arg0.aString1285, "", -1, 30, arg0.anInt1335, 0L, arg0.anInt1287, arg0.anInt1196, true, false, (long) (arg0.anInt1287 << 32 | arg0.anInt1196), false, (short) 140);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ado.d(" + ')');
		}
	}
}
