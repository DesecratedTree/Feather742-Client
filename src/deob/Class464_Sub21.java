package deob;

public class Class464_Sub21 extends Class464 {

	public static int anInt8705 = 1;

	public static int anInt8706 = 0;

	public void method5809(int arg0) {
		try {
			if (this.aClass330_Sub50_5589.aClass464_Sub23_7895.method5821(-1953915254) && !Class312.method3114(this.aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-458126647), 1222807169)) {
				this.anInt5587 = 0;
			}
			if (this.anInt5587 < 0 || this.anInt5587 > 1) {
				this.anInt5587 = this.method5715(59437370);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afs.l(" + ')');
		}
	}

	public Class464_Sub21(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public boolean method5810(int arg0) {
		try {
			return Class312.method3114(this.aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-2114809539), 1645534680);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afs.b(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			return Class312.method3114(this.aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(66827234), 1711419475) ? 1 : 3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afs.j(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afs.p(" + ')');
		}
	}

	public int method5811(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afs.k(" + ')');
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5714(int arg0) {
		return Class312.method3114(this.aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-340390552), 1714824564) ? 1 : 3;
	}

	public int method5715(int arg0) {
		try {
			return 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afs.r(" + ')');
		}
	}

	public int method5718() {
		return 0;
	}

	public Class464_Sub21(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public static void method5812(Class_ra arg0, byte[][][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte arg12) {
		try {
			if (arg9 != 0 && arg2 != 0) {
				if (arg9 == 9) {
					arg9 = 1;
					arg10 = arg10 + 1 & 0x3;
				}
				if (arg9 == 10) {
					arg9 = 1;
					arg10 = arg10 + 3 & 0x3;
				}
				if (arg9 == 11) {
					arg9 = 8;
					arg10 = arg10 + 3 & 0x3;
				}
				arg0.N(arg3, arg4, arg7, arg8, arg5, arg6, arg1[arg9 - 1][arg10], arg2, arg11);
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "afs.r(" + ')');
		}
	}

	public static final void method5813(long arg0) {
		try {
			if (arg0 > 0L) {
				if (arg0 % 10L == 0L) {
					Class243.method2414(arg0 - 1L);
					Class243.method2414(1L);
				} else {
					Class243.method2414(arg0);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afs.r(" + ')');
		}
	}
}
