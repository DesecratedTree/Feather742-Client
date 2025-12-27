package deob;

import java.util.LinkedList;

public abstract class Class111 {

	public static final void method1366(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass286Array9234[var2].anInt2946;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "em.yp(" + ')');
		}
	}

	public static final void method1367(Class430 arg0, int arg1) {
		try {
			Class1 var2 = Class426.method5317(1874055843);
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, var2.aClass488_22, -369591258);
			var3.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 74);
			int var4 = var3.aClass330_Sub46_Sub2_7729.offset;
			var3.aClass330_Sub46_Sub2_7729.addByte(2, (byte) 37);
			var3.aClass330_Sub46_Sub2_7729.addShort(arg0.aClass209_4385.anInt1981, (byte) 112);
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(var3.aClass330_Sub46_Sub2_7729, arg0.aClass209_4385.anIntArray1983, (byte) 62);
			var3.aClass330_Sub46_Sub2_7729.method3751(var3.aClass330_Sub46_Sub2_7729.offset - var4, 777860853);
			var2.method378(var3, -1448177194);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "em.adn(" + ')');
		}
	}

	public static final void method1368(Class387 arg0, Class477 arg1, Class477 arg2, int arg3) {
		try {
			if (arg1.method5974(600210523) && arg2.method5974(830552530)) {
				Class440 var4 = arg1.aClass440_5705;
				Class440 var5 = arg2.aClass440_5705;
				arg0.method4457(arg1.aClass478_5712.aClass330_Sub36_Sub5_5724, arg1.aClass478_5712.anInt5720, arg1.aClass478_5712.aClass330_Sub36_Sub5_5723, arg1.aClass478_5712.anInt5719, arg1.anInt5706, var4.anIntArray4466[arg1.anInt5714], arg2.aClass478_5712.aClass330_Sub36_Sub5_5724, arg2.aClass478_5712.anInt5720, arg2.aClass478_5712.aClass330_Sub36_Sub5_5723, arg2.aClass478_5712.anInt5719, arg2.anInt5706, var5.anIntArray4466[arg2.anInt5714], var4.aBooleanArray4465, var4.aBoolean4473 | var5.aBoolean4473);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "em.c(" + ')');
		}
	}

	public static void method1369(IndexTable arg0, int arg1) {
		try {
			Class391.anInt4054 = 0;
			Class391.anInt4055 = 0;
			Class391.aList4056 = new LinkedList();
			Class391.aClass325_Sub3_Sub1_Sub1Array4052 = new Class325_Sub3_Sub1_Sub1[1024];
			Class50.aClass388Array482 = new Class388[Class91.anIntArray821[Class391.anInt4053] + 1];
			Class391.anInt4060 = 0;
			Class391.anInt4057 = 0;
			Class481.method6021(arg0, -561137076);
			Class43.method583(arg0, -1156445430);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "em.r(" + ')');
		}
	}

	public abstract void method1364(int arg0);

	public abstract void method1365();
}
