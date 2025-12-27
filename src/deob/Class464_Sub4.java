package deob;

public class Class464_Sub4 extends Class464 {

	public static int anInt8667 = 0;

	public static int anInt8668 = 1;

	public static int anInt8669 = 2;

	public static String aString8670;

	public Class464_Sub4(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public int method5718() {
		return 1;
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5716(int arg0, int arg1) {
		try {
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afb.j(" + ')');
		}
	}

	public int method5714(int arg0) {
		return 1;
	}

	public int method5748(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afb.b(" + ')');
		}
	}

	public Class464_Sub4(Class330_Sub50 arg0) {
		super(arg0);
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afb.r(" + ')');
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5749(int arg0) {
		try {
			if (this.aClass330_Sub50_5589.method3858((byte) 98) == Class435.aClass435_4416) {
				this.anInt5587 = 2;
			}
			if (this.anInt5587 < 0 || this.anInt5587 > 2) {
				this.anInt5587 = this.method5715(-1811419069);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afb.l(" + ')');
		}
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afb.p(" + ')');
		}
	}

	public static Class330_Sub36_Sub3 method5750(int arg0, long arg1) {
		try {
			Class330_Sub36_Sub3 var3 = (Class330_Sub36_Sub3) Class330_Sub36_Sub3.aClass497_9653.method6094((long) arg0 << 56 | arg1);
			if (var3 == null) {
				var3 = new Class330_Sub36_Sub3(arg0, arg1);
				Class330_Sub36_Sub3.aClass497_9653.method6097(var3, var3.aLong3341);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afb.r(" + ')');
		}
	}

	public static final void method5751(Class430 arg0, int arg1) {
		try {
			if (client.anInt8995 == 15) {
				Class507.aBoolean5939 = arg0.anIntArray4387[--arg0.anInt4376] == 1;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afb.anv(" + ')');
		}
	}
}
