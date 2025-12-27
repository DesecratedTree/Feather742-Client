package deob;

public class Class541 {

	public Class541() throws Throwable {
		throw new Error();
	}

	public static final void method6329(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9227;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wk.acb(" + ')');
		}
	}

	public static void method6330(IndexTable arg0, byte arg1) {
		try {
			Class207.aClass280_1942 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wk.r(" + ')');
		}
	}

	public static void method6331(int arg0) {
		try {
			if (Class204.anInt6517 < 0) {
				Class204.anInt6517 = 0;
				Class354_Sub1.anInt7983 = -1;
				Class354_Sub1.anInt7986 = -1;
			}
			if (Class204.anInt6517 > Class354_Sub1.anInt3524) {
				Class204.anInt6517 = Class354_Sub1.anInt3524;
				Class354_Sub1.anInt7983 = -1;
				Class354_Sub1.anInt7986 = -1;
			}
			if (Class149_Sub1.anInt8867 < 0) {
				Class149_Sub1.anInt8867 = 0;
				Class354_Sub1.anInt7983 = -1;
				Class354_Sub1.anInt7986 = -1;
			}
			if (Class149_Sub1.anInt8867 > Class354_Sub1.anInt3513) {
				Class149_Sub1.anInt8867 = Class354_Sub1.anInt3513;
				Class354_Sub1.anInt7983 = -1;
				Class354_Sub1.anInt7986 = -1;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "wk.bd(" + ')');
		}
	}

	public static final void method6332(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1577885476);
			Class120 var4 = Class3.aClass120Array56[var2 >>> 16];
			IComponentDefinitions var5 = Class433.method5561(var4, var3, 1447154864);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5 == null ? -1 : var5.anInt1196;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wk.ri(" + ')');
		}
	}

	public static final void method6333(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1212 = Class288.method2886(var4, arg2, 1872739389);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wk.ld(" + ')');
		}
	}
}
