package deob;

public class Class519 {

	public Class367 aClass367_6014 = new Class367(64);

	public IndexTable aClass280_6015;

	public Class519(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6015 = arg2;
		this.aClass280_6015.method2763(Class103.aClass103_955.anInt982, -2063994006);
	}

	public Class512 method6217(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_6014;
			Class512 var3;
			synchronized (this.aClass367_6014) {
				var3 = (Class512) this.aClass367_6014.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6015;
			byte[] var13;
			synchronized (this.aClass280_6015) {
				var13 = this.aClass280_6015.getFile(Class103.aClass103_955.anInt982, arg0);
			}
			var3 = new Class512();
			if (var13 != null) {
				var3.method6187(new Buffer(var13), -225890361);
			}
			Class367 var12 = this.aClass367_6014;
			synchronized (this.aClass367_6014) {
				this.aClass367_6014.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "vl.r(" + ')');
		}
	}

	public void method6218(int arg0) {
		try {
			Class367 var2 = this.aClass367_6014;
			synchronized (this.aClass367_6014) {
				this.aClass367_6014.method4296(-1255623053);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vl.p(" + ')');
		}
	}

	public void method6219(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6014;
			synchronized (this.aClass367_6014) {
				this.aClass367_6014.method4298((byte) 58);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vl.j(" + ')');
		}
	}

	public void method6220(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6014;
			synchronized (this.aClass367_6014) {
				this.aClass367_6014.method4292(arg0, (byte) 6);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vl.i(" + ')');
		}
	}

	public static final void method6221(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 5;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			int var6 = arg0.anIntArray4387[arg0.anInt4376 + 4];
			if (var4 == -1) {
				throw new RuntimeException();
			}
			Class506 var7 = Class211.aClass505_2062.method6140(var4, 1419283240);
			if (var3 != var7.aChar5926) {
				throw new RuntimeException();
			} else if (var7.aChar5921 == var2) {
				int[] var8 = var7.method6147(var5, 16777472);
				if (var6 < 0 || var8 == null || var8.length <= var6) {
					throw new RuntimeException();
				}
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var8[var6];
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vl.vb(" + ')');
		}
	}

	public static final void method6222(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aClass99Array9259[var2].aString912;
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vl.wn(" + ')');
		}
	}
}
