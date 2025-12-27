package deob;

import java.awt.Canvas;

public class Class553 {

	public Class367 aClass367_6371 = new Class367(64);

	public Class367 aClass367_6370 = new Class367(50);

	public Class367 aClass367_6367 = new Class367(5);

	public Class435 aClass435_6369;

	public Class454 aClass454_6365;

	public boolean aBoolean6366;

	public IndexTable aClass280_6364;

	public IndexTable aClass280_6368;

	public String[] aStringArray6373;

	public int anInt6372;

	public Class553(Class435 arg0, Class454 arg1, boolean arg2, IndexTable arg3, IndexTable arg4) {
		this.aClass435_6369 = arg0;
		this.aClass454_6365 = arg1;
		this.aBoolean6366 = arg2;
		this.aClass280_6364 = arg3;
		this.aClass280_6368 = arg4;
		if (this.aClass280_6364 != null) {
			int var6 = this.aClass280_6364.method2764(1866904367) - 1;
			Class103.aClass103_940.method1226((byte) 0);
			this.aClass280_6364.method2763(var6, -2145797577);
		}
		if (this.aClass435_6369 == Class435.aClass435_4421) {
			this.aStringArray6373 = new String[] { null, null, null, null, null, Class526.aClass526_6068.method6257(this.aClass454_6365, 991479434) };
		} else {
			this.aStringArray6373 = new String[] { null, null, null, null, null, null };
		}
	}

	public void method6387(boolean arg0, int arg1) {
		try {
			if (this.aBoolean6366 != arg0) {
				this.aBoolean6366 = arg0;
				this.method6388((byte) 10);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ww.j(" + ')');
		}
	}

	public void method6388(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6371;
			synchronized (this.aClass367_6371) {
				this.aClass367_6371.method4298((byte) 99);
			}
			var2 = this.aClass367_6370;
			synchronized (this.aClass367_6370) {
				this.aClass367_6370.method4298((byte) 112);
			}
			var2 = this.aClass367_6367;
			synchronized (this.aClass367_6367) {
				this.aClass367_6367.method4298((byte) 21);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ww.p(" + ')');
		}
	}

	public void method6389(int arg0) {
		try {
			Class367 var2 = this.aClass367_6370;
			synchronized (this.aClass367_6370) {
				this.aClass367_6370.method4298((byte) 72);
			}
			var2 = this.aClass367_6367;
			synchronized (this.aClass367_6367) {
				this.aClass367_6367.method4298((byte) 45);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ww.o(" + ')');
		}
	}

	public void method6390(int arg0, int arg1) {
		try {
			this.anInt6372 = arg0;
			Class367 var3 = this.aClass367_6370;
			synchronized (this.aClass367_6370) {
				this.aClass367_6370.method4298((byte) 71);
			}
			var3 = this.aClass367_6367;
			synchronized (this.aClass367_6367) {
				this.aClass367_6367.method4298((byte) 111);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ww.i(" + ')');
		}
	}

	public void method6391(int arg0) {
		try {
			Class367 var2 = this.aClass367_6371;
			synchronized (this.aClass367_6371) {
				this.aClass367_6371.method4296(-1334914376);
			}
			var2 = this.aClass367_6370;
			synchronized (this.aClass367_6370) {
				this.aClass367_6370.method4296(-1053665866);
			}
			var2 = this.aClass367_6367;
			synchronized (this.aClass367_6367) {
				this.aClass367_6367.method4296(-78016161);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ww.f(" + ')');
		}
	}

	public Class551 method6392(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6371;
			Class551 var3;
			synchronized (this.aClass367_6371) {
				var3 = (Class551) this.aClass367_6371.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6364;
			byte[] var12;
			synchronized (this.aClass280_6364) {
				var12 = this.aClass280_6364.getFile(Class103.aClass103_940.method1228(arg0, -1572263562), Class103.aClass103_940.method1227(arg0, (byte) -77));
			}
			var3 = new Class551();
			var3.anInt6293 = arg0;
			var3.aClass553_6292 = this;
			var3.aStringArray6311 = (String[]) this.aStringArray6373.clone();
			if (var12 != null) {
				var3.method6365(new Buffer(var12), (short) 27252);
			}
			var3.method6375(-1810737051);
			Class367 var13 = this.aClass367_6371;
			synchronized (this.aClass367_6371) {
				this.aClass367_6371.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ww.r(" + ')');
		}
	}

	public void method6393(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6371;
			synchronized (this.aClass367_6371) {
				this.aClass367_6371.method4292(arg0, (byte) 96);
			}
			var3 = this.aClass367_6370;
			synchronized (this.aClass367_6370) {
				this.aClass367_6370.method4292(arg0, (byte) 75);
			}
			var3 = this.aClass367_6367;
			synchronized (this.aClass367_6367) {
				this.aClass367_6367.method4292(arg0, (byte) 26);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ww.s(" + ')');
		}
	}

	public static final void method6394(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class91.method1069(var3, var4, arg0, 454213422);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ww.ea(" + ')');
		}
	}

	public static Class_ra method6395(Canvas arg0, Interface_ma arg1, int arg2, int arg3, int arg4) {
		try {
			return new Class_ra_Sub3(arg0, arg1, arg2, arg3);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ww.r(" + ')');
		}
	}
}
