package deob;

public class Class368 {

	public Class367 aClass367_3868 = new Class367(20);

	public Class367 aClass367_3865 = new Class367(64);

	public IndexTable aClass280_3866;

	public IndexTable aClass280_3867;

	public static int anInt3869;

	public Class368(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_3866 = arg3;
		this.aClass280_3867 = arg2;
		this.aClass280_3867.method2763(Class103.aClass103_954.anInt982, -2051003570);
	}

	public Class375 method4305(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_3865;
			Class375 var3;
			synchronized (this.aClass367_3865) {
				var3 = (Class375) this.aClass367_3865.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_3867;
			byte[] var13;
			synchronized (this.aClass280_3867) {
				var13 = this.aClass280_3867.getFile(Class103.aClass103_954.anInt982, arg0);
			}
			var3 = new Class375();
			var3.aClass368_3928 = this;
			if (var13 != null) {
				var3.method4346(new Buffer(var13), (byte) 1);
			}
			Class367 var12 = this.aClass367_3865;
			synchronized (this.aClass367_3865) {
				this.aClass367_3865.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "pi.r(" + ')');
		}
	}

	public void method4306(short arg0) {
		try {
			Class367 var2 = this.aClass367_3865;
			synchronized (this.aClass367_3865) {
				this.aClass367_3865.method4298((byte) 20);
			}
			var2 = this.aClass367_3868;
			synchronized (this.aClass367_3868) {
				this.aClass367_3868.method4298((byte) 127);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pi.j(" + ')');
		}
	}

	public void method4307(int arg0, short arg1) {
		try {
			Class367 var3 = this.aClass367_3865;
			synchronized (this.aClass367_3865) {
				this.aClass367_3865.method4292(arg0, (byte) 104);
			}
			var3 = this.aClass367_3868;
			synchronized (this.aClass367_3868) {
				this.aClass367_3868.method4292(arg0, (byte) 44);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "pi.i(" + ')');
		}
	}

	public void method4308(int arg0) {
		try {
			Class367 var2 = this.aClass367_3865;
			synchronized (this.aClass367_3865) {
				this.aClass367_3865.method4296(169879179);
			}
			var2 = this.aClass367_3868;
			synchronized (this.aClass367_3868) {
				this.aClass367_3868.method4296(-477658572);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pi.p(" + ')');
		}
	}

	public static final void method4309(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1184;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pi.pt(" + ')');
		}
	}

	public static final void method4310(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.anInt1653;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pi.xc(" + ')');
		}
	}
}
