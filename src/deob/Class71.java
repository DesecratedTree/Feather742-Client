package deob;

public class Class71 {

	public static int anInt606 = 0;

	public static boolean aBoolean607 = false;

	public static Class471 aClass471_608 = new Class471();

	public static synchronized void method823(short arg0) {
		try {
			anInt606++;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cw.i(" + ')');
		}
	}

	public static synchronized void method824(int arg0) {
		try {
			anInt606--;
			if (anInt606 == 0) {
				method826(-1783116152);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cw.p(" + ')');
		}
	}

	public static synchronized void method825(boolean arg0, short arg1) {
		try {
			aBoolean607 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cw.o(" + ')');
		}
	}

	public Class71() throws Throwable {
		throw new Error();
	}

	public static synchronized void method826(int arg0) {
		try {
			while (true) {
				Class330_Sub35 var1 = (Class330_Sub35) aClass471_608.method5867((short) 8960);
				if (var1 == null) {
					if (arg0 >= 2000000) {
					}
					return;
				}
				((Interface28) var1.anObject7733).ma(true);
				var1.method3252(1344262325);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "cw.j(" + ')');
		}
	}

	public static synchronized void method827(Interface28 arg0, int arg1) {
		try {
			if (!aBoolean607) {
				if (anInt606 > 0) {
					Class330_Sub35 var2 = new Class330_Sub35(arg0);
					aClass471_608.method5878(var2, (short) 8192);
				} else {
					arg0.ma(false);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cw.r(" + ')');
		}
	}
}
