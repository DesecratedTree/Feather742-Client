package deob;

public class Class195 {

	public static Class195 aClass195_1889 = new Class195();

	public static Class195 aClass195_1888 = new Class195();

	public static Class195 aClass195_1887 = new Class195();

	public int method2137(int arg0, int arg1, int arg2) {
		try {
			int var4 = Class300.anInt3058 > arg1 ? Class300.anInt3058 : arg1;
			if (aClass195_1889 == this) {
				return 0;
			} else if (aClass195_1887 == this) {
				return var4 - arg0;
			} else if (aClass195_1888 == this) {
				return (var4 - arg0) / 2;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ib.j(" + ')');
		}
	}

	public static final void method2138(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			int[] var5 = Class278.method2740(var4, arg2, (byte) 0);
			if (var5 != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1299 = Class288.method2886(var4, arg2, 1959856176);
			arg0.anIntArray1269 = var5;
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ib.oh(" + ')');
		}
	}

	public static IComponentDefinitions method2139(IComponentDefinitions arg0, byte arg1) {
		try {
			IComponentDefinitions var2 = client.method3926(arg0);
			if (var2 == null) {
				var2 = arg0.aClass114_1252;
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ib.lb(" + ')');
		}
	}

	public static Class330_Sub11 method2140(IndexTable arg0, int arg1, int arg2) {
		try {
			byte[] var3 = arg0.method2761(arg1, 1302438615);
			return var3 == null ? null : new Class330_Sub11(var3);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ib.r(" + ')');
		}
	}
}
