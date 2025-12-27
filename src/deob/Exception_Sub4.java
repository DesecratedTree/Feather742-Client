package deob;

public class Exception_Sub4 extends Exception {

	public static final void method344(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anInt4376 -= 2;
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			if (var3 < 0 || var3 >= arg0.anIntArray4373[var2]) {
				throw new RuntimeException();
			}
			arg0.anIntArrayArray4374[var2][var3] = arg0.anIntArray4387[arg0.anInt4376 + 1];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "agy.au(" + ')');
		}
	}
}
