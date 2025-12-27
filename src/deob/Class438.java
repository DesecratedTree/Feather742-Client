package deob;

public class Class438 {

	public int anInt4446;

	public int anInt4447;

	public int anInt4448;

	public void method5591(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1047134759);
				if (var3 == 0) {
					if (arg1 <= 445883621) {
					}
					return;
				}
				this.method5592(arg0, var3, (byte) -2);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sd.r(" + ')');
		}
	}

	public void method5592(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.anInt4447 = arg0.readUnsignedShort(749305349);
				this.anInt4446 = arg0.readUnsignedByte(229662354);
				this.anInt4448 = arg0.readUnsignedByte(-98296263);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sd.j(" + ')');
		}
	}

	public static boolean method5593(int arg0, int arg1) {
		try {
			return arg0 == 5 || arg0 == 19 || arg0 == 16 || arg0 == 7 || arg0 == 17;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sd.fk(" + ')');
		}
	}

	public static void method5594(IComponentDefinitions arg0, int arg1) {
		try {
			if (client.aBoolean9150) {
				if (arg0.anObjectArray1320 != null) {
					IComponentDefinitions var2 = Class166.method1993(Class368.anInt3869, client.anInt9151, 534399539);
					if (var2 != null) {
						Class330_Sub42 var3 = new Class330_Sub42();
						var3.aClass114_7809 = arg0;
						var3.aClass114_7813 = var2;
						var3.anObjectArray7817 = arg0.anObjectArray1320;
						Class117.method1423(var3, -1631194987);
					}
				}
				Class330_Sub34 var5 = Class238.method2377(OutgoingPacket.ITEM_ON_ITEM_PACKET, client.aClass1_9025.aClass488_22, -448561751);
				var5.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9151, -1853989465);
				var5.aClass330_Sub46_Sub2_7729.addLEInt(arg0.anInt1196, -2049848719);
				var5.aClass330_Sub46_Sub2_7729.addShort(arg0.anInt1335, (byte) 104);
				var5.aClass330_Sub46_Sub2_7729.addLEShort(arg0.anInt1287, -676872267);
				var5.aClass330_Sub46_Sub2_7729.addShortA(client.anInt9104, -1322880411);
				var5.aClass330_Sub46_Sub2_7729.addInt(Class368.anInt3869, 1965508160);
				client.aClass1_9025.method378(var5, -2007498610);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sd.kf(" + ')');
		}
	}

	public static void method5595(int arg0) {
		try {
			Class50.aClass145_Sub1_480 = new Class145_Sub1(client.aClass532_9236);
			Class50.aClass145_Sub1_480.method1673(Class130.aClass130_1495, (byte) 34);
			try {
				Class166_Sub1 var1 = (Class166_Sub1) Class50.aClass145_Sub1_480.method1674(Class136.aClass136_1524, false, 561271987);
				Class475_Sub3 var2 = (Class475_Sub3) Class50.aClass145_Sub1_480.method1696(Class146.aClass146_1610, false, (byte) -63);
				var1.method1997(Class401_Sub1.aClass145_Sub1_8249.method1694(65280), (byte) 12);
				var2.method5953(new Class244(0.0F, 0.0F, 0.0F), -1660529443);
			} catch (Exception_Sub4 var3) {
			}
			Class50.anInt481 = Class464_Sub23.aClass350_8712.method4030(34823472);
			Class242.anInt6984 = Class464_Sub23.aClass350_8712.method4031((short) 31180);
			Class50.aBoolean479 = true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sd.r(" + ')');
		}
	}
}
