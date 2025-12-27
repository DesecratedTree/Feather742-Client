package deob;

public class Class146 {

	public static Class146 aClass146_1607 = new Class146(0);

	public static Class146 aClass146_1611 = new Class146(1);

	public static Class146 aClass146_1609 = new Class146(2);

	public static Class146 aClass146_1610 = new Class146(3);

	public static Class146 aClass146_1608 = new Class146(4);

	public static Class146 aClass146_1612 = new Class146(5);

	public int anInt1613;

	public static int anInt1615;

	public static Class61 aClass61_1614;

	public Class146(int arg0) {
		this.anInt1613 = arg0;
	}

	public static int method1730(int arg0) {
		try {
			return Class330_Sub12_Sub1.anInt9498;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "fy.k(" + ')');
		}
	}

	public static Class390 method1731(int arg0, int arg1) {
		try {
			Class390[] var2 = Class356.method4186((byte) 21);
			for (int var3 = 0; var3 < var2.length; var3++) {
				if (arg0 == var2[var3].anInt4048) {
					return var2[var3];
				}
			}
			return null;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fy.j(" + ')');
		}
	}

	public static final void method1732(byte arg0) {
		try {
			Class464_Sub18.anImage8701 = null;
			Class338.aFont3374 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "fy.ax(" + ')');
		}
	}

	public static final void method1733(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class263_Sub2.myPlayer.aClass238_10053.method2370(-190707286) >> 3;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fy.vm(" + ')');
		}
	}

	public static final void method1734(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class458.method5670(var2, var3 >> 14 & 0x3FFF, var3 & 0x3FFF, true, 897167730);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fy.aeu(" + ')');
		}
	}

	public static final void method1735(Class430 arg0, int arg1) {
		try {
			IComponentDefinitions var2 = Class95.method1101(arg0.anIntArray4387[--arg0.anInt4376], 1615041801);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt1335;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fy.sg(" + ')');
		}
	}

	public static boolean method1736(byte[] arg0, int arg1) {
		try {
			Buffer var2 = new Buffer(arg0);
			int var3 = var2.readUnsignedByte(363741929);
			if (var3 != 2) {
				return false;
			}
			boolean var4 = var2.readUnsignedByte(1671393470) == 1;
			if (var4) {
				Class95_Sub5.method1122(var2, (byte) 19);
			}
			Class149.method1759(var2, 65280);
			return true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fy.j(" + ')');
		}
	}

	public static final void method1737(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1234 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1741059543);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fy.fo(" + ')');
		}
	}

	public static String method1738(int arg0, int arg1) {
		try {
			return "<col=" + Integer.toHexString(arg0) + ">";
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fy.j(" + ')');
		}
	}
}
