package deob;

public class Class495 {

	public Class367 aClass367_5870 = new Class367(64);

	public IndexTable aClass280_5871;

	public static Class515 aClass515_5872;

	public Class495(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_5871 = arg2;
		if (this.aClass280_5871 != null) {
			this.aClass280_5871.method2763(Class103.aClass103_948.anInt982, -2037121268);
		}
	}

	public Class500 method6086(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_5870;
			Class500 var3;
			synchronized (this.aClass367_5870) {
				var3 = (Class500) this.aClass367_5870.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			byte[] var10 = this.aClass280_5871.getFile(Class103.aClass103_948.anInt982, arg0);
			var3 = new Class500();
			if (var10 != null) {
				var3.method6120(new Buffer(var10), (byte) 49);
			}
			Class367 var5 = this.aClass367_5870;
			synchronized (this.aClass367_5870) {
				this.aClass367_5870.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ul.r(" + ')');
		}
	}

	public void method6087(int arg0) {
		try {
			Class367 var2 = this.aClass367_5870;
			synchronized (this.aClass367_5870) {
				this.aClass367_5870.method4298((byte) 67);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ul.j(" + ')');
		}
	}

	public void method6088(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_5870;
			synchronized (this.aClass367_5870) {
				this.aClass367_5870.method4292(arg0, (byte) 108);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ul.i(" + ')');
		}
	}

	public void method6089(int arg0) {
		try {
			Class367 var2 = this.aClass367_5870;
			synchronized (this.aClass367_5870) {
				this.aClass367_5870.method4296(-1880836915);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ul.p(" + ')');
		}
	}

	public static final void method6090(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2 == -1) {
				throw new RuntimeException();
			}
			Class506 var4 = Class211.aClass505_2062.method6140(var2, 1402864961);
			if (var4.aChar5921 != 's') {
				throw new RuntimeException();
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4.method6146(var3, (byte) 1) ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ul.vh(" + ')');
		}
	}

	public static boolean method6091(int arg0, short arg1) {
		try {
			return arg0 == 15 || arg0 == 11;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ul.fz(" + ')');
		}
	}
}
