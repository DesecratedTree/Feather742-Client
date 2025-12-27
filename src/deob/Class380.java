package deob;

public class Class380 {

	public static int anInt3954 = 128;

	public static int anInt3957 = 64;

	public Class367 aClass367_3958 = new Class367(128);

	public Class367 aClass367_3956 = new Class367(64);

	public IndexTable aClass280_3959;

	public IndexTable aClass280_3955;

	public static String[] aStringArray3960;

	public Class380(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_3959 = arg2;
		this.aClass280_3955 = arg3;
		this.aClass280_3959.method2763(Class103.aClass103_960.anInt982, -2088833459);
	}

	public Class372 method4387(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_3958;
			Class372 var3;
			synchronized (this.aClass367_3958) {
				var3 = (Class372) this.aClass367_3958.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_3959;
			byte[] var12;
			synchronized (this.aClass280_3959) {
				var12 = this.aClass280_3959.getFile(Class103.aClass103_960.anInt982, arg0);
			}
			var3 = new Class372();
			var3.anInt3871 = arg0;
			var3.aClass380_3904 = this;
			if (var12 != null) {
				var3.method4323(new Buffer(var12), 50990247);
			}
			var3.method4324((byte) 56);
			Class367 var13 = this.aClass367_3958;
			synchronized (this.aClass367_3958) {
				this.aClass367_3958.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "pu.r(" + ')');
		}
	}

	public void method4388(int arg0) {
		try {
			Class367 var2 = this.aClass367_3958;
			synchronized (this.aClass367_3958) {
				this.aClass367_3958.method4298((byte) 27);
			}
			var2 = this.aClass367_3956;
			synchronized (this.aClass367_3956) {
				this.aClass367_3956.method4298((byte) 59);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pu.i(" + ')');
		}
	}

	public void method4389(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_3958;
			synchronized (this.aClass367_3958) {
				this.aClass367_3958.method4292(arg0, (byte) 39);
			}
			var3 = this.aClass367_3956;
			synchronized (this.aClass367_3956) {
				this.aClass367_3956.method4292(arg0, (byte) 83);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "pu.p(" + ')');
		}
	}

	public void method4390(int arg0) {
		try {
			Class367 var2 = this.aClass367_3958;
			synchronized (this.aClass367_3958) {
				this.aClass367_3958.method4296(1289706930);
			}
			var2 = this.aClass367_3956;
			synchronized (this.aClass367_3956) {
				this.aClass367_3956.method4296(919831944);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "pu.o(" + ')');
		}
	}

	public void method4391(int arg0, int arg1, int arg2) {
		try {
			this.aClass367_3958 = new Class367(arg0);
			this.aClass367_3956 = new Class367(arg1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pu.j(" + ')');
		}
	}

	public static final void method4392(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class162.method1915((char) var2, -2138245903) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pu.aam(" + ')');
		}
	}

	public static boolean method4393(int arg0, int arg1) {
		try {
			return (arg0 & -arg0) == arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pu.s(" + ')');
		}
	}

	public static void method4394(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -2125645711).method4638(Class158.aClass561_6474, 1579238983) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pu.l(" + ')');
		}
	}

	public static final void method4395(IComponentDefinitions arg0, int arg1, int arg2, byte arg3) {
		try {
			if (client.aClass114_9165 == null && !Class484.aBoolean5782 && arg0 != null && Class497.method6102(arg0, 972705327)) {
				client.aClass114_9165 = arg0;
				client.aClass114_9242 = Class195.method2139(arg0, (byte) 8);
				client.anInt8994 = arg1;
				client.anInt9054 = arg2;
				Class307.anInt3169 = 0;
				client.aBoolean9178 = false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pu.le(" + ')');
		}
	}
}
