package deob;

public class Class128 {

	public static Class128 aClass128_1477 = new Class128(0);

	public static Class128 aClass128_1475 = new Class128(1);

	public int anInt1476;

	public static Class400 aClass400_1478;

	public Class128(int arg0) {
		this.anInt1476 = arg0;
	}

	public static final void method1548(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class20.method467(var3, var4, arg0, (byte) 36);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fd.jn(" + ')');
		}
	}

	public static final void method1549(Class430 arg0, int arg1) {
		try {
			if (client.anInt9125 >= 5 && client.anInt9125 <= 9) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9125;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fd.us(" + ')');
		}
	}

	public static final void method1550(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 < 0) {
				var2 = 0;
			}
			client.anInt9077 = client.anInt9076 + var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fd.ahz(" + ')');
		}
	}

	public static void method1551(Interface27 arg0, int arg1) {
		try {
			while (Class493.aLinkedList5864.size() > 10) {
				Class493.aLinkedList5864.remove();
			}
			Class493.aLinkedList5864.add(arg0);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fd.p(" + ')');
		}
	}

	public static final void method1552(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class214.method2234(var3, var4, arg0, 1265678132);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fd.du(" + ')');
		}
	}

	public static final void method1553(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.aString8968 == null || var2 >= Class452.anInt5561) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class95_Sub22.aClass13Array7210[var2].aString168;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fd.wa(" + ')');
		}
	}

	public static final void method1554(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1177 = arg2.anIntArray4387[--arg2.anInt4376];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fd.jg(" + ')');
		}
	}
}
