package deob;

import java.io.IOException;

public class IOException_Sub1 extends IOException {

	public IOException_Sub1(String arg0) {
		super(arg0);
	}

	public static final void method339(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1333 = Class288.method2886(var4, arg2, 1314260191);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "akm.od(" + ')');
		}
	}
}
