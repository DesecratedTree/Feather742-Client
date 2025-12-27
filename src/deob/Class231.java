package deob;

public class Class231 implements Interface23 {

	public Class367 aClass367_6765 = new Class367(64);

	public IndexTable aClass280_6764;

	public int anInt6763;

	public static Class61[] aClass61Array6766;

	public Class231(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6764 = arg2;
		if (this.aClass280_6764 == null) {
			this.anInt6763 = 0;
		} else {
			this.anInt6763 = this.aClass280_6764.method2763(Class103.aClass103_933.anInt982, -2030891108);
		}
	}

	public Class221 method2346(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6765;
			Class221 var3;
			synchronized (this.aClass367_6765) {
				var3 = (Class221) this.aClass367_6765.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6764;
			byte[] var13;
			synchronized (this.aClass280_6764) {
				var13 = this.aClass280_6764.getFile(Class103.aClass103_933.anInt982, arg0);
			}
			var3 = new Class221();
			if (var13 != null) {
				var3.method2267(new Buffer(var13), (byte) -74);
			}
			Class367 var12 = this.aClass367_6765;
			synchronized (this.aClass367_6765) {
				this.aClass367_6765.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "jr.r(" + ')');
		}
	}

	public void method2347(int arg0) {
		try {
			Class367 var2 = this.aClass367_6765;
			synchronized (this.aClass367_6765) {
				this.aClass367_6765.method4298((byte) 122);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jr.j(" + ')');
		}
	}

	public void method2348(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6765;
			synchronized (this.aClass367_6765) {
				this.aClass367_6765.method4292(arg0, (byte) 101);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "jr.i(" + ')');
		}
	}

	public void method2349(int arg0) {
		try {
			Class367 var2 = this.aClass367_6765;
			synchronized (this.aClass367_6765) {
				this.aClass367_6765.method4296(1103333332);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "jr.p(" + ')');
		}
	}

	public static void method2350(int arg0, byte arg1) {
		try {
			Exception_Sub1.method342(arg0, 1232021218);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jr.j(" + ')');
		}
	}

	public static final void method2351(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5835((byte) 89) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "jr.apq(" + ')');
		}
	}

	public static byte[] method2352(String arg0, int arg1) {
		try {
			int var2 = arg0.length();
			if (var2 == 0) {
				return new byte[0];
			}
			int var3 = var2 + 3 & 0xFFFFFFFC;
			int var4 = var3 / 4 * 3;
			if (var3 - 2 >= var2 || Class470.method5864(arg0.charAt(var3 - 2), (byte) -37) == -1) {
				var4 -= 2;
			} else if (var3 - 1 >= var2 || Class470.method5864(arg0.charAt(var3 - 1), (byte) -26) == -1) {
				var4--;
			}
			byte[] var5 = new byte[var4];
			Class51.method635(arg0, var5, 0, 410839024);
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "jr.i(" + ')');
		}
	}
}
