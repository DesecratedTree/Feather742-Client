package deob;

public class Class418 {

	public Class367 aClass367_4296 = new Class367(64);

	public int anInt4294 = 0;

	public IndexTable aClass280_4297;

	public int anInt4295;

	public static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_4298;

	public Class418(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_4297 = arg2;
		this.anInt4295 = this.aClass280_4297.method2763(Class103.aClass103_928.anInt982, -2098324567);
	}

	public void method5269(byte arg0) {
		try {
			Class367 var2 = this.aClass367_4296;
			synchronized (this.aClass367_4296) {
				this.aClass367_4296.method4298((byte) 51);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rj.j(" + ')');
		}
	}

	public void method5270(int arg0) {
		try {
			Class367 var2 = this.aClass367_4296;
			synchronized (this.aClass367_4296) {
				this.aClass367_4296.method4296(973048429);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rj.p(" + ')');
		}
	}

	public Class425 method5271(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_4296;
			Class425 var3;
			synchronized (this.aClass367_4296) {
				var3 = (Class425) this.aClass367_4296.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_4297;
			byte[] var12;
			synchronized (this.aClass280_4297) {
				var12 = this.aClass280_4297.getFile(Class103.aClass103_928.anInt982, arg0);
			}
			var3 = new Class425();
			var3.aClass418_4328 = this;
			var3.anInt4329 = arg0;
			if (var12 != null) {
				var3.method5310(new Buffer(var12), (byte) 98);
			}
			var3.method5309(1962440064);
			Class367 var13 = this.aClass367_4296;
			synchronized (this.aClass367_4296) {
				this.aClass367_4296.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "rj.r(" + ')');
		}
	}

	public void method5272(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_4296;
			synchronized (this.aClass367_4296) {
				this.aClass367_4296.method4292(arg0, (byte) 62);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rj.i(" + ')');
		}
	}

	public static void method5273(byte arg0) {
		try {
			Class3.aClass367_45.method4298((byte) 49);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rj.i(" + ')');
		}
	}

	public static Class212 method5274(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readBigSmart(-2010908410);
			return new Class212(var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rj.r(" + ')');
		}
	}

	public static void method5275(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(16, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rj.am(" + ')');
		}
	}
}
