package deob;

public class Class552 {

	public static int anInt6360 = 64;

	public static int anInt6361 = 64;

	public Class367 aClass367_6362 = new Class367(64);

	public Class367 aClass367_6363 = new Class367(64);

	public IndexTable aClass280_6359;

	public IndexTable aClass280_6358;

	public Class552(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_6359 = arg2;
		this.aClass280_6358 = arg3;
		this.aClass280_6359.method2763(Class103.aClass103_958.anInt982, -2066884456);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	public Class522 method6382(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6362;
			Class522 var3;
			synchronized (this.aClass367_6362) {
				var3 = (Class522) this.aClass367_6362.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6359;
			byte[] var13;
			synchronized (this.aClass280_6359) {
				var13 = this.aClass280_6359.getFile(Class103.aClass103_958.anInt982, arg0);
			}
			var3 = new Class522();
			var3.aClass552_6021 = this;
			if (var13 != null) {
				var3.method6228(new Buffer(var13), 185624338);
			}
			Class367 var12 = this.aClass367_6362;
			synchronized (this.aClass367_6362) {
				this.aClass367_6362.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "wv.r(" + ')');
		}
	}

	public void method6383(int arg0, int arg1, byte arg2) {
		try {
			this.aClass367_6362 = new Class367(arg0);
			this.aClass367_6363 = new Class367(arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wv.j(" + ')');
		}
	}

	public void method6384(int arg0, short arg1) {
		try {
			Class367 var3 = this.aClass367_6362;
			synchronized (this.aClass367_6362) {
				this.aClass367_6362.method4292(arg0, (byte) 121);
			}
			var3 = this.aClass367_6363;
			synchronized (this.aClass367_6363) {
				this.aClass367_6363.method4292(arg0, (byte) 8);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "wv.p(" + ')');
		}
	}

	public void method6385(int arg0) {
		try {
			Class367 var2 = this.aClass367_6362;
			synchronized (this.aClass367_6362) {
				this.aClass367_6362.method4296(872790673);
			}
			var2 = this.aClass367_6363;
			synchronized (this.aClass367_6363) {
				this.aClass367_6363.method4296(1187205773);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wv.o(" + ')');
		}
	}

	public void method6386(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6362;
			synchronized (this.aClass367_6362) {
				this.aClass367_6362.method4298((byte) 113);
			}
			var2 = this.aClass367_6363;
			synchronized (this.aClass367_6363) {
				this.aClass367_6363.method4298((byte) 103);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "wv.i(" + ')');
		}
	}
}
