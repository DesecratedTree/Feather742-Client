package deob;

public class Class464_Sub11 extends Class464 {

	public static int anInt8685 = 1;

	public static int anInt8686 = 0;

	public int method5716(int arg0, int arg1) {
		try {
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afi.j(" + ')');
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5777(byte arg0) {
		try {
			if (this.anInt5587 != 1 && this.anInt5587 != 0) {
				this.anInt5587 = this.method5715(-1494571780);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afi.l(" + ')');
		}
	}

	public Class464_Sub11(Class330_Sub50 arg0) {
		super(arg0);
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afi.r(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afi.p(" + ')');
		}
	}

	public int method5778(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afi.b(" + ')');
		}
	}

	public int method5718() {
		return 1;
	}

	public Class464_Sub11(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5714(int arg0) {
		return 1;
	}

	public static final void method5779(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -59403653);
			int var4 = -1;
			int var5 = -1;
			Class122 var6 = var3.method1396(Class361.aClass_ra3793, (byte) -110);
			if (var6 != null) {
				var4 = var6.anInt1407;
				var5 = var6.anInt1405;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "afi.sf(" + ')');
		}
	}

	public static final void method5780(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class95_Sub22.aClass13Array7210 == null || var2 >= Class452.anInt5561 || !Class95_Sub22.aClass13Array7210[var2].aString171.equalsIgnoreCase(Class263_Sub2.myPlayer.aString10221)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afi.wl(" + ')');
		}
	}

	public static final void method5781(Class430 arg0, int arg1) {
		try {
			IComponentDefinitions var2 = Class95.method1101(arg0.anIntArray4387[--arg0.anInt4376], -9012085);
			var2.aClass114Array1347 = null;
			var2.aClass114Array1219 = null;
			Class404.method4738(var2, 374188322);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afi.bh(" + ')');
		}
	}
}
