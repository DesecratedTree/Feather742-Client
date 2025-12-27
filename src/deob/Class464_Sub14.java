package deob;

public class Class464_Sub14 extends Class464 {

	public static int anInt8692 = 0;

	public static int anInt8693 = 1;

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afl.p(" + ')');
		}
	}

	public Class464_Sub14(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5789(int arg0) {
		try {
			if (this.anInt5587 != 1 && this.anInt5587 != 0) {
				this.anInt5587 = this.method5715(-206699548);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afl.l(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			return 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afl.r(" + ')');
		}
	}

	public int method5714(int arg0) {
		return 1;
	}

	public int method5716(int arg0, int arg1) {
		try {
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afl.j(" + ')');
		}
	}

	public int method5718() {
		return 0;
	}

	public int method5790(short arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afl.b(" + ')');
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public Class464_Sub14(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}
}
