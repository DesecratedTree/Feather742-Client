package deob;

public class Class67 {

	public int anInt580;

	public Class497 aClass497_579;

	public static IndexTable aClass280_581;

	public void method790(int arg0) {
		try {
			if (this.aClass497_579 != null) {
				this.aClass497_579.method6100(65280);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cs.r(" + ')');
		}
	}

	public void method791(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_579 == null) {
				this.aClass497_579 = new Class497(this.anInt580);
			}
			Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_579.method6094((long) arg0);
			if (var4 == null) {
				var4 = new Class330_Sub23(arg1);
				this.aClass497_579.method6097(var4, (long) arg0);
			} else {
				var4.anInt7693 = arg1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cs.j(" + ')');
		}
	}

	public int method792(int arg0, byte arg1) {
		try {
			Class330_Sub23 var3 = (Class330_Sub23) this.aClass497_579.method6094((long) arg0);
			if (var3 == null) {
				Class500 var4 = Class499.aClass495_5893.method6086(arg0, (byte) 1);
				return var4.aChar5894 == 'i' ? 0 : -1;
			} else {
				return var3.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cs.i(" + ')');
		}
	}

	public Class67(int arg0) {
		this.anInt580 = arg0;
	}

	public int method793(int arg0, int arg1) {
		try {
			Class438 var3 = Class95_Sub10.aClass447_7170.method5621(arg0, (byte) 3);
			int var4 = var3.anInt4447;
			int var5 = var3.anInt4448 == 31 ? -1 : (0x1 << var3.anInt4448 + 1) - 1;
			return (this.method792(var4, (byte) -39) & var5) >>> var3.anInt4446;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "cs.p(" + ')');
		}
	}

	public static final void method794(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			Class135.method1585(var2, var3, 693051023);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cs.ww(" + ')');
		}
	}

	public static boolean method795(char arg0, short arg1) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cs.q(" + ')');
		}
	}

	public static final void method796(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 >> 28;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cs.uj(" + ')');
		}
	}

	public static final void method797(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cs.uk(" + ')');
		}
	}
}
