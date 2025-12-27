package deob;

import java.awt.Canvas;
import java.awt.Dimension;

public class Class95_Sub22 extends Class95 {

	public int anInt7208;

	public int anInt7209;

	public int anInt7207;

	public int anInt7206;

	public int anInt7205;

	public static Class13[] aClass13Array7210;

	public Class95_Sub22(Buffer arg0) {
		super(arg0);
		this.anInt7208 = arg0.readUnsignedShort(500501546);
		int var2 = arg0.readUnsignedByte(307508583);
		if ((var2 & 0x1) == 0) {
			this.anInt7209 = -1;
			this.anInt7207 = -1;
		} else {
			this.anInt7209 = arg0.readUnsignedShort(1319649896);
			this.anInt7207 = arg0.readUnsignedShort(1767418454);
		}
		if ((var2 & 0x2) == 0) {
			this.anInt7206 = -1;
			this.anInt7205 = -1;
		} else {
			this.anInt7206 = arg0.readUnsignedShort(1513092076);
			this.anInt7205 = arg0.readUnsignedShort(281619915);
		}
		if ((var2 & 0x4) != 0) {
			int var3 = arg0.readUnsignedShort(1120305462);
			int var4 = arg0.readUnsignedShort(-284253566);
			int var5 = var3 * 255 / var4;
			if (var3 > 0 && var5 < 1) {
				boolean var6 = true;
			}
		}
	}

	public void method1095(int arg0) {
		try {
			Class432_Sub1_Sub1_Sub1 var2 = Class96.aClass85Array854[this.anInt7208].method973(-1160484525);
			var2.method5423(this.anInt7209, this.anInt7207, this.anInt7206, this.anInt7205, client.anInt8981, 0, -152047037);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zw.j(" + ')');
		}
	}

	public void method1099() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7208 * 1852195273 * -1710774151].method973(-1160484525);
		var1.method5423(this.anInt7209 * 688460305 * 282599153, this.anInt7207 * -1977595469 * -771256965, this.anInt7206 * 916383967 * -949038305, this.anInt7205 * 438070755 * -1374797877, client.anInt8981 * 822953439 * 659076639, 0, 905153212);
	}

	public void method1098() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7208 * 1852195273 * -1710774151].method973(-1160484525);
		var1.method5423(this.anInt7209 * 688460305 * 282599153, this.anInt7207 * -1977595469 * -771256965, this.anInt7206 * 916383967 * -949038305, this.anInt7205 * 438070755 * -1374797877, client.anInt8981 * 822953439 * 659076639, 0, -1317730056);
	}

	public void method1100() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7208 * 1852195273 * -1710774151].method973(-1160484525);
		var1.method5423(this.anInt7209 * 688460305 * 282599153, this.anInt7207 * -1977595469 * -771256965, this.anInt7206 * 916383967 * -949038305, this.anInt7205 * 438070755 * -1374797877, client.anInt8981 * 822953439 * 659076639, 0, 1941356402);
	}

	public static final void method1172(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5742(481121493) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zw.aqj(" + ')');
		}
	}

	public static Class_ra method1173(int arg0, Canvas arg1, Interface_ma arg2, IndexTable arg3, int arg4, int arg5) {
		try {
			int var6 = 0;
			int var7 = 0;
			if (arg1 != null) {
				Dimension var8 = arg1.getSize();
				var6 = var8.width;
				var7 = var8.height;
			}
			return Class3.method397(arg0, arg1, arg2, arg3, arg4, var6, var7, (byte) -3);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "zw.j(" + ')');
		}
	}

	public static final void method1174(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.GE_SELECT_PACKET, client.aClass1_9025.aClass488_22, 1289794868);
			var3.aClass330_Sub46_Sub2_7729.addShort(var2, (byte) 100);
			client.aClass1_9025.method378(var3, -1505831772);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zw.sv(" + ')');
		}
	}

	public static void method1175(String arg0, boolean arg1, Class_ra arg2, Class263 arg3, Class524 arg4, int arg5) {
		try {
			boolean var6 = !Class227.aBoolean2424 || Class532.method6299((byte) 13);
			if (var6) {
				int var7;
				int var8;
				int var10;
				int var11;
				if (Class227.aBoolean2424 && var6) {
					Class524 var16 = Class18.aClass524_236;
					Class263 var15 = arg2.ce(var16, Class366.aClass87_Sub2Array3857, true);
					var7 = var16.method6246(arg0, 250, null, (byte) 21);
					var8 = var16.method6247(arg0, 250, var16.anInt6030, null, 1274617093);
					int var17 = Class18.aClass87_235.method986();
					var10 = var17 + 4;
					var7 += var10 * 2;
					var8 += var10 * 2;
					if (var7 < Class18.anInt230) {
						var7 = Class18.anInt230;
					}
					if (var8 < Class18.anInt234) {
						var8 = Class18.anInt234;
					}
					var11 = Class18.aClass195_233.method2137(var7, client.anInt9207, 1097467466) + Class156.anInt6464;
					int var12 = Class18.aClass211_231.method2221(var8, client.anInt9118, (byte) -113) + Class18.anInt232;
					arg2.bw(Class13.aClass87_174, false).method694(var11 + Class536.aClass87_6233.method986(), var12 + Class536.aClass87_6233.method994(), var7 - Class536.aClass87_6233.method986() * 2, var8 - Class536.aClass87_6233.method994() * 2, 1, -1, 0);
					arg2.bw(Class536.aClass87_6233, true).method687(var11, var12);
					Class536.aClass87_6233.method998();
					arg2.bw(Class536.aClass87_6233, true).method687(var7 + var11 - var17, var12);
					Class536.aClass87_6233.method999();
					arg2.bw(Class536.aClass87_6233, true).method687(var11 + var7 - var17, var8 + var12 - var17);
					Class536.aClass87_6233.method998();
					arg2.bw(Class536.aClass87_6233, true).method687(var11, var8 + var12 - var17);
					Class536.aClass87_6233.method999();
					arg2.bw(Class18.aClass87_235, true).method721(var11, var12 + Class536.aClass87_6233.method994(), var17, var8 - Class536.aClass87_6233.method994() * 2);
					Class18.aClass87_235.method1000();
					arg2.bw(Class18.aClass87_235, true).method721(var11 + Class536.aClass87_6233.method986(), var12, var7 - Class536.aClass87_6233.method986() * 2, var17);
					Class18.aClass87_235.method1000();
					arg2.bw(Class18.aClass87_235, true).method721(var11 + var7 - var17, var12 + Class536.aClass87_6233.method994(), var17, var8 - Class536.aClass87_6233.method994() * 2);
					Class18.aClass87_235.method1000();
					arg2.bw(Class18.aClass87_235, true).method721(var11 + Class536.aClass87_6233.method986(), var12 + var8 - var17, var7 - Class536.aClass87_6233.method986() * 2, var17);
					Class18.aClass87_235.method1000();
					var15.method2613(arg0, var10 + var11, var12 + var10, var7 - var10 * 2, var8 - var10 * 2, Class463.anInt5585 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 90);
					Class524.method6252(var11, var12, var7, var8, (byte) 49);
				} else {
					var7 = arg4.method6246(arg0, 250, null, (byte) 81);
					var8 = arg4.method6251(arg0, 250, null, -2036792645) * 13;
					byte var9 = 4;
					var10 = var9 + 6;
					var11 = var9 + 6;
					arg2.B(var10 - var9, var11 - var9, var9 + var7 + var9, var9 + var8 + var9, -16777216, 0);
					arg2.bl(var10 - var9, var11 - var9, var7 + var9 + var9, var8 + var9 + var9, -1, 0);
					arg3.method2613(arg0, var10, var11, var7, var8, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 88);
					Class524.method6252(var10 - var9, var11 - var9, var9 + var7 + var9, var9 + var9 + var8, (byte) -17);
				}
				if (arg1) {
					try {
						arg2.method4804();
						arg2.method4786(421463875);
					} catch (Exception_Sub1 var13) {
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "zw.i(" + ')');
		}
	}
}
