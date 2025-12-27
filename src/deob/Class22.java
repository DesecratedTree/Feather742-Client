package deob;

import java.awt.Point;
import java.util.Date;
import java.util.Queue;

public class Class22 {

	public static short aShort256 = 1008;

	public static short aShort257 = 6;

	public static short aShort258 = 4;

	public static short aShort259 = 5;

	public static short aShort260 = 46;

	public static short aShort261 = 8;

	public static short aShort262 = 20;

	public static short aShort263 = 10;

	public static short aShort264 = 1009;

	public static short aShort265 = 12;

	public static short aShort266 = 13;

	public static short aShort267 = 50;

	public static short aShort268 = 11;

	public static short aShort269 = 17;

	public static short aShort270 = 57;

	public static short aShort271 = 3;

	public static short aShort272 = 15;

	public static short aShort273 = 21;

	public static short aShort274 = 2;

	public static short aShort275 = 23;

	public static short aShort276 = 1004;

	public static short aShort277 = 30;

	public static short aShort278 = 1002;

	public static short aShort279 = 18;

	public static short aShort280 = 9;

	public static short aShort281 = 47;

	public static short aShort282 = 48;

	public static short aShort283 = 49;

	public static short aShort284 = 44;

	public static short aShort285 = 51;

	public static short aShort286 = 52;

	public static short aShort287 = 53;

	public static short aShort288 = 16;

	public static short aShort289 = 58;

	public static short aShort290 = 59;

	public static short aShort291 = 60;

	public static short aShort292 = 1001;

	public static short aShort293 = 19;

	public static short aShort294 = 45;

	public static short aShort295 = 25;

	public static short aShort296 = 1006;

	public static short aShort297 = 1007;

	public static short aShort298 = 1003;

	public static short aShort299 = 22;

	public static short aShort300 = 1010;

	public static short aShort301 = 1011;

	public static short aShort302 = 1012;

	public static String[] aStringArray303;

	public Class22() throws Throwable {
		throw new Error();
	}

	public static int[] method471(Class330_Sub36_Sub10 arg0, int arg1) {
		try {
			int[] var2 = null;
			if (Class487_Sub1.method6041(arg0.anInt9699, 536870912)) {
				var2 = Class556.aClass510_6392.getItemDefinitions((int) arg0.aLong9697, (byte) -14).anIntArray6701;
			} else if (arg0.anInt9691 != -1) {
				var2 = Class556.aClass510_6392.getItemDefinitions(arg0.anInt9691, (byte) -68).anIntArray6701;
			} else if (Class531.method6298(arg0.anInt9699, 1262689693)) {
				Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg0.aLong9697);
				if (var3 != null) {
					NPC var4 = (NPC) var3.anObject7733;
					Class551 var5 = var4.aClass551_10251;
					if (var5.anIntArray6326 != null) {
						var5 = var5.method6371(Class158.aClass561_6474, (byte) 10);
					}
					if (var5 != null) {
						var2 = var5.anIntArray6336;
					}
				}
			} else if (Class391.method4607(arg0.anInt9699, (byte) 67)) {
				Class473 var7 = client.aClass304_9030.method3025((byte) 13).method5705((int) (arg0.aLong9697 >>> 32 & 0x7FFFFFFFL), (byte) -63);
				if (var7.anIntArray5678 != null) {
					var7 = var7.method5900(Class158.aClass561_6474, (byte) -4);
				}
				if (var7 != null) {
					var2 = var7.anIntArray5693;
				}
			}
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aw.av(" + ')');
		}
	}

	public static void method472(byte arg0) {
		try {
			Queue var1 = Class393.aQueue4064;
			synchronized (Class393.aQueue4064) {
				Point var2;
				if (Class475.aCanvas5700.isShowing()) {
					var2 = Class475.aCanvas5700.getLocationOnScreen();
				} else {
					var2 = null;
				}
				while (true) {
					while (true) {
						Class330_Sub44_Sub1 var3 = (Class330_Sub44_Sub1) Class393.aQueue4064.poll();
						if (var3 == null) {
							return;
						}
						if (var2 != null && Class475.aCanvas5700.isShowing() && Class76_Sub1_Sub3.aBoolean9380) {
							var3.method3731(var2, 675074469);
							if (var3.method3730(1776611133)) {
								if (arg0 != 2) {
								}
							} else if (var3.method3710((byte) 1) < Class300.anInt3058 && var3.method3711(401996786) < Class146.anInt1615 && var3.method3710((byte) -23) >= 0) {
								if (var3.method3711(1680615750) >= 0) {
									int var4 = var3.method3709((short) 10244);
									if (var3.method3709((short) -3353) == -1) {
										Class393.aClass397_Sub2_4069.method4673(var3, (byte) 1);
									} else if (Class391.method4606(var4, (byte) 16)) {
										Class393.aClass397_Sub2_4069.method4683(var3, -1718037057);
									}
								} else if (arg0 != 2) {
								}
							}
						} else {
							var3.method3714(-963265081);
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aw.o(" + ')');
		}
	}

	public static void method473(byte arg0) {
		try {
			int var1 = 0;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1) {
				var1 |= 0x1;
				var1 |= 0x10;
				var1 |= 0x20;
				var1 |= 0x2;
				var1 |= 0x4;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(730115580) == 0) {
				var1 |= 0x40;
			}
			Class81.method945(var1, -1209679014);
			client.aClass304_9030.method3025((byte) 13).method5710(var1, (byte) 2);
			Class43.aClass276_10073.method2721((byte) 125).method3025((byte) 13).method5710(var1, (byte) 2);
			Class556.aClass510_6392.method6175(var1, 1522181389);
			Class158_Sub3.aClass553_8875.method6390(var1, 942776811);
			Class136.aClass416_1527.method5251(var1, 1494177708);
			Class389.method4596(var1, (byte) 0);
			Class119.method1439(var1, (byte) -32);
			Class216.method2246(var1, 564595847);
			Class153.method1791(var1, 2094901066);
			Class_ta.method5681(var1, (byte) -86);
			client.aClass304_9030.method3032(-397345413);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aw.ge(" + ')');
		}
	}

	public static final void method474(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class95_Sub6.method1123(var3, var4, arg0, (byte) 57);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aw.fw(" + ')');
		}
	}

	public static void method475(long arg0) {
		try {
			Class528.aCalendar6217.setTime(new Date(arg0));
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aw.s(" + ')');
		}
	}
}
