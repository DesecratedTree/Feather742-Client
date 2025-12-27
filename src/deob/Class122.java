package deob;

public class Class122 {

	public int anInt1407;

	public int anInt1405;

	public int[] anIntArray1406;

	public int[] anIntArray1404;

	public Class_ta aClass_ta1408;

	public int anInt1409;

	public boolean method1450(int arg0, int arg1, byte arg2) {
		try {
			if (arg1 >= 0 && arg1 < this.anIntArray1404.length) {
				int var4 = this.anIntArray1404[arg1];
				if (arg0 >= var4 && arg0 <= var4 + this.anIntArray1406[arg1]) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ex.r(" + ')');
		}
	}

	public Class122(int arg0, int arg1, int[] arg2, int[] arg3, Class_ta arg4, int arg5) {
		this.anInt1407 = arg0;
		this.anInt1405 = arg1;
		this.anIntArray1406 = arg2;
		this.anIntArray1404 = arg3;
		this.aClass_ta1408 = arg4;
		this.anInt1409 = arg5;
	}

	public static final void method1451(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			int[] var5 = Class278.method2740(var4, arg2, (byte) 0);
			if (var5 != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1306 = Class288.method2886(var4, arg2, 1955551114);
			arg0.anIntArray1230 = var5;
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ex.lc(" + ')');
		}
	}
}
