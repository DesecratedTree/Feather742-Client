package deob;

public class Class221 implements Interface21 {

	public int anInt6672 = 0;

	public char aChar6673;

	public static int anInt6674;

	public void method2267(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1099544411);
				if (var3 == 0) {
					if (arg1 >= 0) {
					}
					return;
				}
				this.method2268(arg0, var3, (byte) 1);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jh.r(" + ')');
		}
	}

	public void method2268(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aChar6673 = Class127.method1546(arg0.readByte((byte) -57), -2082122036);
			} else if (arg1 == 5) {
				this.anInt6672 = arg0.readUnsignedShort(1908218697);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jh.j(" + ')');
		}
	}

	public static final void method2269(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int var3 = client.aClass286Array9234[var2].method2868(238704630);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == 1 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jh.yz(" + ')');
		}
	}

	public static final void method2270(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var2 >= 0 && var2 < 2) {
				client.anIntArrayArrayArray9082[var2] = new int[var3 << 1][4];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "jh.afg(" + ')');
		}
	}

	public static void method2271(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 2] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -1340533401).method4641(Class158.aClass561_6474, arg0.anIntArray4387[arg0.anInt4376 - 1], 2092109083) ? 1 : 0;
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jh.e(" + ')');
		}
	}
}
