package deob;

public class Class118 {

	public static IndexTable aClass280_1393;

	public String aString1388;

	public String aString1390;

	public String aString1391;

	public Class100[] aClass100Array1389;

	public Class100[] aClass100Array1392;

	public void method1427(Class115 arg0, int arg1) {
		try {
			this.aString1391 = arg0.method1414(846343736);
			this.aString1388 = arg0.method1414(-68171735);
			this.aString1390 = arg0.method1414(585111168);
			int var3 = arg0.method1413(1630714172);
			int var4 = arg0.method1413(1108362256);
			this.aClass100Array1392 = var3 == 0 ? null : new Class100[var3];
			this.aClass100Array1389 = var4 == 0 ? null : new Class100[var4];
			int var5;
			for (var5 = 0; var5 < var3; var5++) {
				this.aClass100Array1392[var5] = new Class100();
				this.aClass100Array1392[var5].method1207(arg0, 2020142979);
			}
			for (var5 = 0; var5 < var4; var5++) {
				this.aClass100Array1389[var5] = new Class100();
				this.aClass100Array1389[var5].method1207(arg0, -1884275068);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "et.r(" + ')');
		}
	}

	public static final void method1428(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-2110490215);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "et.ami(" + ')');
		}
	}

	public static void method1429(int arg0) {
		try {
			Class392.anInt6792 = Class477_Sub1.aClass524_8749.anInt6033 + 2 + Class477_Sub1.aClass524_8749.anInt6035;
			Class5.anInt69 = Class386.aClass524_3989.anInt6035 + Class386.aClass524_3989.anInt6033 + 2;
			Class5.aStringArray68 = new String[500];
			for (int var1 = 0; var1 < Class5.aStringArray68.length; var1++) {
				Class5.aStringArray68[var1] = "";
			}
			Class56.panelBoxMessage(Class526.aClass526_6151.method6257(Class429.aClass454_4369, 991479434), -898820198);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "et.i(" + ')');
		}
	}

	public static void method1430(int arg0, int arg1, IComponentDefinitions arg2, int arg3) {
		try {
			int var4 = arg0 + arg2.anInt1210;
			int var5 = arg1 + 15;
			if (client.aBoolean8983) {
				int var6 = -256;
				if (client.anInt6603 < 20) {
					var6 = -65536;
				}
				Class464_Sub22.aClass263_8709.method2612("Fps:" + client.anInt6603, var4, var5, var6, -1, (short) 18074);
				var5 += 15;
				Runtime var7 = Runtime.getRuntime();
				long var8 = var7.totalMemory() / 1024L;
				long var10 = var8 - var7.freeMemory() / 1024L;
				int var12 = -256;
				if (var10 > 262144L) {
					var12 = -65536;
				}
				Class464_Sub22.aClass263_8709.method2612("Mem:" + var10 + "/" + var8 + "k", var4, var5, var12, -1, (short) 32013);
				var5 += 15;
				long var13 = client.aClass1_9025.aClass409_38.method4771(-1398988283);
				String var15 = "N/A";
				if (var13 != -1L) {
					var15 = var13 + "ms";
					if (var13 > 500L) {
						var15 = Class146.method1738(16711680, -849826454) + var15 + Class146.method1738(16776960, -849826454);
					}
				}
				Class464_Sub22.aClass263_8709.method2612("Game: In:" + client.aClass1_9025.anInt18 + "B/s " + "Out:" + client.aClass1_9025.anInt28 + "B/s " + "Ping:" + var15, var4, var5, -256, -1, (short) 14136);
				var5 += 15;
				long var16 = client.aClass1_9060.aClass409_38.method4771(-1398988283);
				String var18 = "N/A";
				if (var16 != -1L) {
					var18 = var16 + "ms";
					if (var16 > 500L) {
						var18 = Class146.method1738(16711680, -849826454) + var18 + Class146.method1738(16776960, -849826454);
					}
				}
				Class464_Sub22.aClass263_8709.method2612("Lobby: In:" + client.aClass1_9060.anInt18 + "B/s " + "Out:" + client.aClass1_9060.anInt28 + "B/s " + "Ping:" + var18, var4, var5, -256, -1, (short) 19043);
				var5 += 15;
				int var19 = Class361.aClass_ra3793.za() / 1024;
				Class464_Sub22.aClass263_8709.method2612("Offheap:" + var19 + "k", var4, var5, var19 > 65536 ? -65536 : -256, -1, (short) 24532);
				var5 += 15;
				int var20 = 0;
				int var21 = 0;
				int var22 = 0;
				int var23;
				for (var23 = 0; var23 < Class429.aClass282_Sub1Array4368.length; var23++) {
					if (Class429.aClass282_Sub1Array4368[var23] != null) {
						var20 += Class429.aClass282_Sub1Array4368[var23].method2814(1610520599);
						var21 += Class429.aClass282_Sub1Array4368[var23].method2817(1004334918);
						var22 += Class429.aClass282_Sub1Array4368[var23].method2818(-1852062028);
					} else if (arg3 == -1641994381) {
						return;
					}
				}
				var23 = var22 * 100 / var20;
				int var24 = var21 * 10000 / var20;
				String var25 = "Cache:" + Class451.method5631((long) var24, 2, true, Class454.aClass454_6832, -820604780) + "% (" + var23 + "%)";
				Class125.aClass263_1454.method2612(var25, var4, var5, -256, -1, (short) 15903);
				var5 += 12;
			}
		} catch (RuntimeException var26) {
			throw Class476.method5964(var26, "et.kg(" + ')');
		}
	}
}
