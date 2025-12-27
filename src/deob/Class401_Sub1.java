package deob;

public class Class401_Sub1 extends Class401 {

	public int anInt8248 = -1;

	public int anInt8245;

	public static Class145_Sub1 aClass145_Sub1_8249;

	public String aString8246;

	public String aString8247;

	public Class396 method4720(int arg0) {
		try {
			return Class315.aClass396Array3257[this.anInt4127];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aef.x(" + ')');
		}
	}

	public static final void method4721(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -978002415);
			if (var4.method6321((byte) 11)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -50).method6288(var3, var4.aString6236, (byte) 0);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -48).method6287(var3, var4.anInt6235, 341133455);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aef.abc(" + ')');
		}
	}

	public static final void method4722(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (client.aLong9079 >> 32);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (client.aLong9079 & 0xFFFFFFFFFFFFFFFFL);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aef.aja(" + ')');
		}
	}
}
