package deob;

public class Class543 {

	public Class367 aClass367_6252 = new Class367(64);

	public IndexTable aClass280_6253;

	public static Class524 aClass524_6254;

	public static IndexTable aClass280_6255;

	public Class543(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6253 = arg2;
		if (this.aClass280_6253 != null) {
			this.aClass280_6253.method2763(Class103.aClass103_935.anInt982, -2042945303);
		}
	}

	public Class537 method6339(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6252;
			Class537 var3;
			synchronized (this.aClass367_6252) {
				var3 = (Class537) this.aClass367_6252.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6253;
			byte[] var13;
			synchronized (this.aClass280_6253) {
				var13 = this.aClass280_6253.getFile(Class103.aClass103_935.anInt982, arg0);
			}
			var3 = new Class537();
			if (var13 != null) {
				var3.method6320(new Buffer(var13), (byte) 1);
			}
			Class367 var12 = this.aClass367_6252;
			synchronized (this.aClass367_6252) {
				this.aClass367_6252.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "wm.r(" + ')');
		}
	}

	public void method6340(int arg0) {
		try {
			Class367 var2 = this.aClass367_6252;
			synchronized (this.aClass367_6252) {
				this.aClass367_6252.method4298((byte) 80);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wm.j(" + ')');
		}
	}

	public void method6341(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_6252;
			synchronized (this.aClass367_6252) {
				this.aClass367_6252.method4292(arg0, (byte) 100);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wm.i(" + ')');
		}
	}

	public void method6342(int arg0) {
		try {
			Class367 var2 = this.aClass367_6252;
			synchronized (this.aClass367_6252) {
				this.aClass367_6252.method4296(1485805794);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wm.p(" + ')');
		}
	}

	public static final void method6343(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			if (client.method3924(arg0).method3263((byte) -100) && client.aClass114_9078 == null) {
				Class43.method589(arg0.anInt1196, arg0.anInt1287, (byte) 50);
				client.aClass114_9078 = Class166.method1993(arg0.anInt1196, arg0.anInt1287, 534399539);
				Class404.method4738(client.aClass114_9078, 598354517);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wm.cy(" + ')');
		}
	}

	public static final void method6344(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1553533397);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1223;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wm.rq(" + ')');
		}
	}
}
