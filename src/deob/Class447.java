package deob;

public class Class447 {

	public Class367 aClass367_5551 = new Class367(64);

	public IndexTable aClass280_5550;

	public Class447(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_5550 = arg2;
		if (this.aClass280_5550 != null) {
			this.aClass280_5550.method2763(Class103.aClass103_949.anInt982, -2099005501);
		}
	}

	public Class438 method5621(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_5551;
			Class438 var3;
			synchronized (this.aClass367_5551) {
				var3 = (Class438) this.aClass367_5551.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			byte[] var10 = this.aClass280_5550.getFile(Class103.aClass103_949.anInt982, arg0);
			var3 = new Class438();
			if (var10 != null) {
				var3.method5591(new Buffer(var10), 788801052);
			}
			Class367 var5 = this.aClass367_5551;
			synchronized (this.aClass367_5551) {
				this.aClass367_5551.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "sm.r(" + ')');
		}
	}

	public void method5622(int arg0) {
		try {
			Class367 var2 = this.aClass367_5551;
			synchronized (this.aClass367_5551) {
				this.aClass367_5551.method4296(-1829052930);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sm.p(" + ')');
		}
	}

	public void method5623(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_5551;
			synchronized (this.aClass367_5551) {
				this.aClass367_5551.method4292(arg0, (byte) 6);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "sm.i(" + ')');
		}
	}

	public void method5624(byte arg0) {
		try {
			Class367 var2 = this.aClass367_5551;
			synchronized (this.aClass367_5551) {
				this.aClass367_5551.method4298((byte) 25);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sm.j(" + ')');
		}
	}

	public static final void method5625(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub20_7888.method5807((byte) 101) == 2 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sm.alr(" + ')');
		}
	}

	public static void method5626(Class330_Sub34 arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			arg0.aClass330_Sub46_Sub2_7729.addInt1(arg1, (byte) 15);
			arg0.aClass330_Sub46_Sub2_7729.addLEShortA(arg3, -1450921191);
			arg0.aClass330_Sub46_Sub2_7729.addLEShort(arg2, -676872267);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "sm.kw(" + ')');
		}
	}

	public static byte method5627(int arg0, int arg1, byte arg2) {
		try {
			if (Class476.aClass476_6902.anInt6882 == arg0) {
				return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sm.bs(" + ')');
		}
	}
}
