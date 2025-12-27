package deob;

public class Class413 {

	public static int anInt4259 = 6;

	public static int anInt4260;

	public Class413() throws Throwable {
		throw new Error();
	}

	public static final void method5238(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -97701783);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1243;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "re.rs(" + ')');
		}
	}

	public static final int method5239(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 == arg0) {
				return arg0;
			}
			int var4 = 128 - arg2;
			int var5 = arg2 * (arg1 & 0x7F) + var4 * (arg0 & 0x7F) >> 7;
			int var6 = (arg0 & 0x380) * var4 + arg2 * (arg1 & 0x380) >> 7;
			int var7 = (arg1 & 0xFC00) * arg2 + var4 * (arg0 & 0xFC00) >> 7;
			return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "re.e(" + ')');
		}
	}
}
