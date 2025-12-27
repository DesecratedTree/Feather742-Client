package deob;

public class Class131 {

	public Class367 aClass367_1501 = new Class367(16);

	public IndexTable aClass280_1500;

	public static Class407 aClass407_1502;

	public Class131(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_1500 = arg2;
		this.aClass280_1500.method2763(Class103.aClass103_947.anInt982, -2010464000);
	}

	public void method1558(int arg0) {
		try {
			Class367 var2 = this.aClass367_1501;
			synchronized (this.aClass367_1501) {
				this.aClass367_1501.method4298((byte) 81);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fg.j(" + ')');
		}
	}

	public void method1559(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_1501;
			synchronized (this.aClass367_1501) {
				this.aClass367_1501.method4292(arg0, (byte) 37);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fg.i(" + ')');
		}
	}

	public void method1560(int arg0) {
		try {
			Class367 var2 = this.aClass367_1501;
			synchronized (this.aClass367_1501) {
				this.aClass367_1501.method4296(538381811);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fg.p(" + ')');
		}
	}

	public Class127 method1561(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_1501;
			Class127 var3;
			synchronized (this.aClass367_1501) {
				var3 = (Class127) this.aClass367_1501.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_1500;
			byte[] var13;
			synchronized (this.aClass280_1500) {
				var13 = this.aClass280_1500.getFile(Class103.aClass103_947.anInt982, arg0);
			}
			var3 = new Class127();
			if (var13 != null) {
				var3.method1542(new Buffer(var13), 1699875310);
			}
			Class367 var12 = this.aClass367_1501;
			synchronized (this.aClass367_1501) {
				this.aClass367_1501.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "fg.r(" + ')');
		}
	}

	public static final void method1562(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 >= 1 && var2 <= 2) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897, var2, 1529848487);
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub8_7872, var2, 1830516867);
				Class435.method5568(1802265162);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fg.afc(" + ')');
		}
	}

	public static String method1563(IComponentDefinitions arg0, int arg1, int arg2) {
		try {
			if (!client.method3924(arg0).method3264(arg1, -979598918) && arg0.anObjectArray1319 == null) {
				return null;
			} else if (arg0.aStringArray1284 == null || arg0.aStringArray1284.length <= arg1 || arg0.aStringArray1284[arg1] == null || arg0.aStringArray1284[arg1].trim().length() == 0) {
				return client.aBoolean9161 ? "Hidden-" + arg1 : null;
			} else {
				return arg0.aStringArray1284[arg1];
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fg.bp(" + ')');
		}
	}

	public static final void method1564(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aByte9283;
			if (client.aByte9283 != -1) {
				client.aByte9283 = -6;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fg.aco(" + ')');
		}
	}
}
