package deob;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Class102 {

	public static HashMap aHashMap921 = new HashMap();

	public static long aLong923 = 1000L;

	public static Class362 aClass362_924;

	public static Map aMap922;

	static {
		Calendar.getInstance(method1217("Europe/London", 1230343047));
	}

	public static TimeZone method1217(String arg0, int arg1) {
		try {
			HashMap var2 = aHashMap921;
			synchronized (aHashMap921) {
				TimeZone var3 = (TimeZone) aHashMap921.get(arg0);
				if (var3 == null) {
					var3 = TimeZone.getTimeZone(arg0);
					aHashMap921.put(arg0, var3);
				}
				return var3;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ed.p(" + ')');
		}
	}

	public Class102() throws Throwable {
		throw new Error();
	}

	public static String method1218(Date arg0, String arg1, TimeZone arg2, Class454 arg3, byte arg4) {
		try {
			if (aMap922 == null) {
				aMap922 = new HashMap(7);
				Class454[] var5 = Class454.method5650(-1396520753);
				for (int var6 = 0; var6 < var5.length; var6++) {
					Class454 var7 = var5[var6];
					aMap922.put(var7, new ConcurrentLinkedQueue());
				}
			}
			ConcurrentLinkedQueue var9 = (ConcurrentLinkedQueue) aMap922.get(arg3);
			SimpleDateFormat var10 = (SimpleDateFormat) var9.poll();
			if (var10 == null) {
				var10 = new SimpleDateFormat(arg1, arg3.method5645(-1991660151));
			} else {
				var10.applyPattern(arg1);
			}
			var10.setTimeZone(arg2);
			String var11 = var10.format(arg0);
			var9.add(var10);
			return var11;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ed.j(" + ')');
		}
	}

	public static TimeZone method1219(int arg0) {
		try {
			return method1217("Europe/London", 1710912603);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ed.i(" + ')');
		}
	}

	public static String method1220(Date arg0, String arg1, int arg2) {
		try {
			return method1218(arg0, arg1, method1219(1850356846), Class454.aClass454_6832, (byte) 38);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ed.r(" + ')');
		}
	}

	public static void method1221(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var2 = arg0.readUnsignedByte(1846560828);
				switch(var2) {
					case 0:
						Class96.anInt863 = arg0.readUnsignedShort(80314709);
						Class96.anInt860 = arg0.readUnsignedShort(1138881962);
						break;
					case 255:
						return;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ed.j(" + ')');
		}
	}

	public static final void method1222(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5716(var2, 751304830);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ed.aqd(" + ')');
		}
	}

	public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			Class150_Sub2.anInt7270 = arg0;
			Class330_Sub39.anInt7766 = arg1;
			Class366.anInt3856 = arg2;
			Class355.anInt3638 = arg3;
			Class18.anInt238 = arg4;
			if (Class18.anInt238 >= 100) {
				int var6 = Class150_Sub2.anInt7270 * 512 + 256;
				int var7 = Class330_Sub39.anInt7766 * 512 + 256;
				int var8 = Class431.method5342(var6, var7, Class85.anInt712, 1996761881) - Class366.anInt3856;
				int var9 = var6 - Class471.anInt5612;
				int var10 = var8 - Gfx.anInt578;
				int var11 = var7 - Class325_Sub3.anInt7484;
				int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
				Class321.anInt7018 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
				Class145_Sub1.anInt7266 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
				Class119.anInt1399 = 0;
				if (Class321.anInt7018 < 1024) {
					Class321.anInt7018 = 1024;
				}
				if (Class321.anInt7018 > 3072) {
					Class321.anInt7018 = 3072;
				}
			}
			Class147.anInt1621 = 3;
			Class439.anInt4456 = -1;
			Class457.anInt6844 = -1;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "ed.hw(" + ')');
		}
	}

	public static void method1224(int arg0) {
		try {
			Class355_Sub1.anIntArray7999[44] = 71;
			Class355_Sub1.anIntArray7999[45] = 26;
			Class355_Sub1.anIntArray7999[46] = 72;
			Class355_Sub1.anIntArray7999[47] = 73;
			Class355_Sub1.anIntArray7999[59] = 57;
			Class355_Sub1.anIntArray7999[61] = 27;
			Class355_Sub1.anIntArray7999[91] = 42;
			Class355_Sub1.anIntArray7999[92] = 74;
			Class355_Sub1.anIntArray7999[93] = 43;
			Class355_Sub1.anIntArray7999[192] = 28;
			Class355_Sub1.anIntArray7999[222] = 58;
			Class355_Sub1.anIntArray7999[520] = 59;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ed.q(" + ')');
		}
	}

	public static void method1225(Buffer arg0, int arg1) {
		try {
			if (arg0.payload.length - arg0.offset >= 1) {
				int var2 = arg0.readUnsignedByte(1039554122);
				if (var2 >= 0 && var2 <= 1 && arg0.payload.length - arg0.offset >= 2) {
					int var3 = arg0.readUnsignedShort(1601887672);
					if (arg0.payload.length - arg0.offset >= var3 * 6) {
						for (int var4 = 0; var4 < var3; var4++) {
							int var5 = arg0.readUnsignedShort(1828643193);
							int var6 = arg0.readInt((byte) 73);
							if (var5 < Class555.anIntArray6382.length) {
								if (Class330_Sub26.aBooleanArray7696[var5]) {
									if (Class495.aClass515_5872.method6203(var5, (byte) -102).aChar5969 == '1') {
										if (var6 < -1) {
											continue;
										}
										if (var6 > 1) {
											if (arg1 >= -1222107184) {
												throw new IllegalStateException();
											}
											continue;
										}
									}
									Class555.anIntArray6382[var5] = var6;
								} else if (arg1 >= -1222107184) {
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ed.b(" + ')');
		}
	}
}
