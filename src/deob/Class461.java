package deob;

public class Class461 {

	public Class325_Sub3 aClass325_Sub3_5569 = new Class325_Sub3();

	public Class325_Sub3 aClass325_Sub3_5570;

	public Class461() {
		this.aClass325_Sub3_5569.aClass325_Sub3_7483 = this.aClass325_Sub3_5569;
		this.aClass325_Sub3_5569.aClass325_Sub3_7482 = this.aClass325_Sub3_5569;
	}

	public void method5693(Class325_Sub3 arg0, int arg1) {
		try {
			if (arg0.aClass325_Sub3_7482 != null) {
				arg0.method3216((byte) -31);
			}
			arg0.aClass325_Sub3_7482 = this.aClass325_Sub3_5569.aClass325_Sub3_7482;
			arg0.aClass325_Sub3_7483 = this.aClass325_Sub3_5569;
			arg0.aClass325_Sub3_7482.aClass325_Sub3_7483 = arg0;
			arg0.aClass325_Sub3_7483.aClass325_Sub3_7482 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tc.r(" + ')');
		}
	}

	public Class325_Sub3 method5694(int arg0) {
		try {
			Class325_Sub3 var2 = this.aClass325_Sub3_5569.aClass325_Sub3_7483;
			if (this.aClass325_Sub3_5569 == var2) {
				this.aClass325_Sub3_5570 = null;
				return null;
			} else {
				this.aClass325_Sub3_5570 = var2.aClass325_Sub3_7483;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tc.j(" + ')');
		}
	}

	public Class325_Sub3 method5695(int arg0) {
		try {
			Class325_Sub3 var2 = this.aClass325_Sub3_5570;
			if (this.aClass325_Sub3_5569 == var2) {
				this.aClass325_Sub3_5570 = null;
				return null;
			} else {
				this.aClass325_Sub3_5570 = var2.aClass325_Sub3_7483;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tc.i(" + ')');
		}
	}

	public void method5696(int arg0) {
		try {
			while (true) {
				Class325_Sub3 var2 = this.aClass325_Sub3_5569.aClass325_Sub3_7483;
				if (this.aClass325_Sub3_5569 == var2) {
					if (arg0 == -923633274) {
						throw new IllegalStateException();
					}
					this.aClass325_Sub3_5570 = null;
					return;
				}
				var2.method3216((byte) -46);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tc.p(" + ')');
		}
	}

	public int method5697(int arg0) {
		try {
			int var2 = 0;
			for (Class325_Sub3 var3 = this.aClass325_Sub3_5569.aClass325_Sub3_7483; var3 != this.aClass325_Sub3_5569; var3 = var3.aClass325_Sub3_7483) {
				var2++;
			}
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tc.o(" + ')');
		}
	}

	public boolean method5698(int arg0) {
		try {
			return this.aClass325_Sub3_5569 == this.aClass325_Sub3_5569.aClass325_Sub3_7483;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tc.s(" + ')');
		}
	}

	public static Class524 method5699(IndexTable arg0, int arg1, int arg2, int arg3) {
		try {
			byte[] var4 = arg0.getFile(arg1, arg2);
			return var4 == null ? null : new Class524(var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tc.r(" + ')');
		}
	}

	public static final void method5700(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5743((byte) 9) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tc.alu(" + ')');
		}
	}

	public static void method5701(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(6, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tc.aq(" + ')');
		}
	}
}
