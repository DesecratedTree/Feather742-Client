package deob;

import java.awt.Color;
import java.awt.EventQueue;

public class Class170 {

	public static int anInt1708 = 11;

	public static int anInt1709 = 9;

	public static int anInt1710 = 1;

	public static int anInt1711 = 1;

	public static int anInt1712 = 2;

	public static int anInt1714 = 4;

	public static int anInt1715 = 1;

	public static int anInt1716 = 6;

	public static int anInt1717 = 7;

	public static int anInt1718 = 8;

	public static int anInt1719 = 10;

	public static int anInt1722 = 12;

	public static int anInt1723 = 13;

	public int anInt1720 = -1;

	public Class471 aClass471_1721 = new Class471();

	public static int anInt1725;

	public long aLong1713;

	public static EventQueue anEventQueue1724;

	public Class170(Buffer arg0) {
		this.method2036(arg0, -1725070830);
	}

	public void method2036(Buffer arg0, int arg1) {
		try {
			this.aLong1713 = arg0.readLong(438481095);
			this.anInt1720 = arg0.readInt((byte) 44);
			for (int var3 = arg0.readUnsignedByte(-128977343); var3 != 0; var3 = arg0.readUnsignedByte(2004497547)) {
				Class330_Sub12 var4;
				if (var3 == 3) {
					var4 = new Class330_Sub12_Sub1(this);
				} else if (var3 == 1) {
					var4 = new Class330_Sub12_Sub6(this);
				} else if (var3 == 13) {
					var4 = new Class330_Sub12_Sub8(this);
				} else if (var3 == 4) {
					var4 = new Class330_Sub12_Sub5(this);
				} else if (var3 == 6) {
					var4 = new Class330_Sub12_Sub12(this);
				} else if (var3 == 5) {
					var4 = new Class330_Sub12_Sub11(this);
				} else if (var3 == 2) {
					var4 = new Class330_Sub12_Sub13(this);
				} else if (var3 == 7) {
					var4 = new Class330_Sub12_Sub9(this);
				} else if (var3 == 8) {
					var4 = new Class330_Sub12_Sub7(this);
				} else if (var3 == 9) {
					var4 = new Class330_Sub12_Sub4(this);
				} else if (var3 == 10) {
					var4 = new Class330_Sub12_Sub3(this);
				} else if (var3 == 11) {
					var4 = new Class330_Sub12_Sub2(this);
				} else if (var3 == 12) {
					var4 = new Class330_Sub12_Sub10(this);
				} else {
					throw new RuntimeException("");
				}
				var4.method3294(arg0, (byte) 64);
				this.aClass471_1721.method5878(var4, (short) 8192);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gy.r(" + ')');
		}
	}

	public void method2037(Class154 arg0, int arg1) {
		try {
			if (arg0.aLong1648 != this.aLong1713 || this.anInt1720 != arg0.anInt1643) {
				throw new RuntimeException("");
			}
			for (Class330_Sub12 var3 = (Class330_Sub12) this.aClass471_1721.method5869(539664854); var3 != null; var3 = (Class330_Sub12) this.aClass471_1721.method5873((byte) -58)) {
				var3.method3293(arg0, -1845348264);
			}
			arg0.anInt1643++;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gy.j(" + ')');
		}
	}

	public static Class200 method2038(Buffer arg0, short arg1) {
		try {
			int var2 = arg0.readInt((byte) 7);
			return new Class200(var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gy.r(" + ')');
		}
	}

	public static final int method2039(int arg0, int arg1, byte arg2) {
		try {
			int var3 = AbstractQueue_Sub1.method6486(arg0 - 1, arg1 - 1, (byte) -122) + AbstractQueue_Sub1.method6486(arg0 + 1, arg1 - 1, (byte) -6) + AbstractQueue_Sub1.method6486(arg0 - 1, arg1 + 1, (byte) -31) + AbstractQueue_Sub1.method6486(arg0 + 1, arg1 + 1, (byte) -35);
			int var4 = AbstractQueue_Sub1.method6486(arg0 - 1, arg1, (byte) -64) + AbstractQueue_Sub1.method6486(arg0 + 1, arg1, (byte) -60) + AbstractQueue_Sub1.method6486(arg0, arg1 - 1, (byte) -115) + AbstractQueue_Sub1.method6486(arg0, arg1 + 1, (byte) -57);
			int var5 = AbstractQueue_Sub1.method6486(arg0, arg1, (byte) -41);
			return var4 / 8 + var3 / 16 + var5 / 4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gy.y(" + ')');
		}
	}

	public static final void method2040(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1240263334);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class481.method6023(var3, var4, arg0, -2050555881);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gy.en(" + ')');
		}
	}

	public static final void method2041(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.anInt7760;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gy.yb(" + ')');
		}
	}

	public static final void method2042(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1640917394);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class116.method1416(var3, var4, arg0, (byte) 63);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gy.it(" + ')');
		}
	}

	public static void method2043(int arg0) {
		try {
			Class238.aClass355_2583.method4110((byte) -25);
			Class464_Sub23.aClass350_8712.method4033((byte) 0);
			Class394.aClient4082.method3901((byte) -4);
			Class475.aCanvas5700.setBackground(Color.black);
			client.anInt9201 = -1;
			Class238.aClass355_2583 = Class386.method4436(Class475.aCanvas5700, (short) -17625);
			Class464_Sub23.aClass350_8712 = Class169.method2032(Class475.aCanvas5700, true, (byte) 91);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "gy.fp(" + ')');
		}
	}

	public static final void method2044(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1305 = Class288.method2886(var4, arg2, 1101762745);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gy.lb(" + ')');
		}
	}
}
