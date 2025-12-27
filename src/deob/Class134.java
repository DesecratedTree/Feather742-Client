package deob;

public class Class134 {

	public static Class134 aClass134_1515 = new Class134(0, 104);

	public static Class134 aClass134_1512 = new Class134(1, 120);

	public static Class134 aClass134_1517 = new Class134(2, 136);

	public static Class134 aClass134_1513 = new Class134(3, 168);

	public static Class134 aClass134_1514 = new Class134(4, 72);

	public int anInt1516;

	public int anInt1511;

	public static Class258 aClass258_1518;

	public Class134(int arg0, int arg1) {
		this.anInt1516 = arg0;
		this.anInt1511 = arg1;
	}

	public static int method1573(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var6 = arg2 & 0x3;
			if (var6 == 0) {
				return arg1;
			} else if (var6 == 1) {
				return 4095 - arg0;
			} else if (var6 == 2) {
				return 4095 - arg1;
			} else {
				return arg0;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fj.p(" + ')');
		}
	}

	public static final void method1574(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 < var3 ? var2 : var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fj.or(" + ')');
		}
	}

	public static void method1575(byte arg0) {
		try {
			Class227.method2311(16, -1188873169);
			Class523.method6237((short) -26855);
			System.gc();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "fj.lq(" + ')');
		}
	}

	public static final void method1576(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt8981;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fj.tj(" + ')');
		}
	}

	public static void method1577(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class330_Sub36_Sub3 var5 = Class464_Sub4.method5750(4, (long) arg0);
			var5.method3445((byte) 0);
			var5.anInt9629 = arg1;
			var5.anInt9626 = arg2;
			var5.anInt9627 = arg3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fj.an(" + ')');
		}
	}

	public static final void method1578(Class430 arg0, int arg1) {
		try {
			String var2 = null;
			if (Class101.aClass148_6458 != null) {
				var2 = Class101.aClass148_6458.method1746(860691276);
			}
			if (var2 == null) {
				var2 = "";
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fj.afm(" + ')');
		}
	}
}
