package deob;

import java.io.IOException;
import java.util.Date;

public class Class56 {

	public static int anInt509 = 12;

	public static int anInt510 = 2;

	public static int anInt511 = 1;

	public static int anInt512 = 6;

	public static int anInt513 = 1;

	public static int anInt515 = 7;

	public static int anInt516 = 8;

	public static int anInt518 = 10;

	public static int anInt521 = 13;

	public static int anInt522 = 16;

	public static int anInt528 = 4;

	public static int anInt535 = 1;

	public static int anInt539 = 0;

	public static int anInt540 = 11;

	public static int anInt541 = 9;

	public byte aByte525;

	public byte aByte526;

	public byte aByte529;

	public byte aByte530;

	public byte aByte531;

	public byte aByte534;

	public byte aByte538;

	public int anInt520;

	public int anInt527;

	public int anInt532;

	public Class369 aClass369_524;

	public short aShort523;

	public boolean aBoolean508;

	public boolean aBoolean514;

	public boolean aBoolean517;

	public boolean aBoolean519;

	public boolean aBoolean533;

	public boolean aBoolean536;

	public boolean aBoolean537;

	public static final void method644(Class430 arg0, int arg1) {
		try {
			Class1 var2 = Class426.method5317(2025825147);
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, var2.aClass488_22, 1609917803);
			var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 91);
			int var4 = var3.aClass330_Sub46_Sub2_7729.offset;
			var3.aClass330_Sub46_Sub2_7729.addByte(3, (byte) 20);
			var3.aClass330_Sub46_Sub2_7729.addShort(arg0.aClass209_4385.anInt1981, (byte) 76);
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(var3.aClass330_Sub46_Sub2_7729, arg0.aClass209_4385.anIntArray1983, (byte) -64);
			var3.aClass330_Sub46_Sub2_7729.method3751(var3.aClass330_Sub46_Sub2_7729.offset - var4, -342963442);
			var2.method378(var3, -841909620);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cf.ady(" + ')');
		}
	}

	public static void method645(int arg0) {
		try {
			for (Class330_Sub43 var1 = (Class330_Sub43) Class442.aClass497_4489.method6099((byte) 28); var1 != null; var1 = (Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768)) {
				if (var1.aClass324_Sub1_7825.method3197(-910967411)) {
					Class502.method6132(var1.anInt7819, (byte) -116);
				} else {
					var1.aClass324_Sub1_7825.method3203(1329866319);
					try {
						var1.aClass324_Sub1_7825.method3199((byte) -63);
					} catch (Exception var4) {
						Class207.method2195("" + var1.anInt7819, var4, -306254718);
						Class502.method6132(var1.anInt7819, (byte) -56);
					}
					if (!var1.aBoolean7824 && !var1.aBoolean7823) {
						Class330_Sub31_Sub1 var2 = var1.aClass324_Sub1_7825.method3187(1833021121);
						if (var2 != null) {
							Class330_Sub40_Sub1 var3 = var2.method3419(-1844920295);
							if (var3 != null) {
								var3.method3572(var1.anInt7820, 1418061320);
								Class511.aClass330_Sub40_Sub4_5951.method3684(var3);
								var1.aBoolean7824 = true;
							}
						}
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cf.f(" + ')');
		}
	}

	public static final void method646(Class430 arg0, int arg1) {
		try {
			Class392.method4610(arg0.aClass432_Sub1_Sub2_Sub1_4390, arg0, 164038384);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cf.arh(" + ')');
		}
	}

	public static void panelBoxMessage(String arg0, int arg1) {
		try {
			if (Class5.aStringArray68 == null) {
				Class118.method1429(-468270409);
			}
			client.aCalendar9098.setTime(new Date(Class312.method3111((byte) 108)));
			int var2 = client.aCalendar9098.get(11);
			int var3 = client.aCalendar9098.get(12);
			int var4 = client.aCalendar9098.get(13);
			String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
			String[] var6 = Class226.method2309(arg0, '\n', (byte) -55);
			for (int var7 = 0; var7 < var6.length; var7++) {
				for (int var8 = Class5.anInt71; var8 > 0; var8--) {
					Class5.aStringArray68[var8] = Class5.aStringArray68[var8 - 1];
				}
				Class5.aStringArray68[0] = var5 + ": " + var6[var7];
				if (Class215.aFileOutputStream2086 != null) {
					try {
						Class215.aFileOutputStream2086.write(Class132.method1567(Class5.aStringArray68[0] + "\n", -1433749028));
					} catch (IOException var9) {
					}
				}
				if (Class5.anInt71 < Class5.aStringArray68.length - 1) {
					Class5.anInt71++;
					if (Class5.anInt77 > 0) {
						Class5.anInt77++;
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "cf.b(" + ')');
		}
	}
}
