package deob;

public class Class133 {

	public static Class133 aClass133_1508 = new Class133(0);

	public static Class133 aClass133_1509 = new Class133(1);

	public static Class133 aClass133_1507 = new Class133(2);

	public int anInt1510;

	public Class133(int arg0) {
		this.anInt1510 = arg0;
	}

	public static final void method1570(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2.toLowerCase();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fi.zp(" + ')');
		}
	}

	public static final void method1571(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			if (arg0.anIntArray4387[--arg0.anInt4376] == 1) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2;
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fi.aav(" + ')');
		}
	}

	public static final void method1572(Class430 arg0, int arg1) {
		try {
			arg0.aClass209_4385 = new Class209();
			arg0.aClass209_4385.anInt1981 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.aClass209_4385.aClass330_Sub36_Sub4_1982 = Class2.aClass523_44.method6233(arg0.aClass209_4385.anInt1981, 1413024155);
			arg0.aClass209_4385.anIntArray1983 = new int[arg0.aClass209_4385.aClass330_Sub36_Sub4_1982.method3455(184148206)];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fi.ado(" + ')');
		}
	}
}
