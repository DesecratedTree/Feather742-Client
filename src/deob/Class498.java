package deob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Class498 {

	public int anInt5887 = 1060239026;

	public int anInt5885 = 1;

	public boolean aBoolean5888 = true;

	public boolean aBoolean5890 = false;

	public int anInt5889;

	public String aString5886;

	public void method6107(int arg0) {
		try {
			if (!this.aBoolean5888) {
				this.aBoolean5888 = true;
				this.aBoolean5890 = true;
			} else if (this.aBoolean5890) {
				this.aBoolean5890 = false;
			} else {
				this.aBoolean5888 = false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uo.j(" + ')');
		}
	}

	public boolean method6108(Class498 arg0, byte arg1) {
		try {
			if (arg0 == null) {
				return false;
			} else {
				return arg0.anInt5889 == this.anInt5889 && this.aString5886.equals(arg0.aString5886);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uo.i(" + ')');
		}
	}

	public Socket method6109(byte arg0) throws IOException {
		try {
			return new Socket(InetAddress.getByName(ClientLoader.IP), ClientLoader.PORT);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uo.r(" + ')');
		}
	}

	public static void method6110(int arg0, int arg1, int arg2, String arg3, byte arg4) {
		try {
			IComponentDefinitions var5 = Class166.method1993(arg1, arg2, 534399539);
			if (var5 != null) {
				if (var5.anObjectArray1319 != null) {
					Class330_Sub42 var6 = new Class330_Sub42();
					var6.aClass114_7809 = var5;
					var6.anInt7812 = arg0;
					var6.aString7816 = arg3;
					var6.anObjectArray7817 = var5.anObjectArray1319;
					Class117.method1423(var6, -1631194987);
				}
				if (client.method3924(var5).method3264(arg0 - 1, -979598918)) {
					Class1 var9 = Class426.method5317(1717895677);
					if (client.anInt8995 == 15 || client.anInt8995 == 1) {
						Class330_Sub34 var7;
						if (arg0 == 1) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON1_PACKET, var9.aClass488_22, 1918361696);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1587626110);
							var9.method378(var7, -2007504531);
						}
						if (arg0 == 2) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON2_PACKET, var9.aClass488_22, 45608191);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1960949183);
							var9.method378(var7, -228077706);
						}
						if (arg0 == 3) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON3_PACKET, var9.aClass488_22, 1010035435);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1988907530);
							var9.method378(var7, -1330305779);
						}
						if (arg0 == 4) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON4_PACKET, var9.aClass488_22, 1901538291);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1716256507);
							var9.method378(var7, -691305813);
						}
						if (arg0 == 5) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON5_PACKET, var9.aClass488_22, 644249119);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1259801643);
							var9.method378(var7, -1379609271);
						}
						if (arg0 == 6) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON7_PACKET, var9.aClass488_22, 1189519617);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1022471593);
							var9.method378(var7, -1805809625);
						}
						if (arg0 == 7) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON6_PACKET, var9.aClass488_22, 1115084575);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 2117717665);
							var9.method378(var7, -1377705060);
						}
						if (arg0 == 8) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON8_PACKET, var9.aClass488_22, -600858123);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 1719208623);
							var9.method378(var7, -2100978651);
						}
						if (arg0 == 9) {
							var7 = Class238.method2377(OutgoingPacket.ACTION_BUTTON10_PACKET, var9.aClass488_22, -369787541);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 866592356);
							var9.method378(var7, -2027948185);
						}
						if (arg0 == 10) {
							var7 = Class238.method2377(OutgoingPacket.ITEM_EXAMINE_PACKET, var9.aClass488_22, 252860626);
							Class447.method5626(var7, arg1, arg2, var5.anInt1335, 943654587);
							var9.method378(var7, -1454364363);
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "uo.kx(" + ')');
		}
	}
}
