package deob;

import java.util.Iterator;

public class Class370 implements Interface23 {

	public static int anInt6768 = 64;

	public Class367 aClass367_6769 = new Class367(64);

	public IndexTable aClass280_6767;

	public static Class268 aClass268_6770;

	public static boolean aBoolean6771;

	public Class370(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6767 = arg2;
		if (this.aClass280_6767 != null) {
			int var4 = this.aClass280_6767.method2764(1385616754) - 1;
			Class103.aClass103_938.method1226((byte) 0);
			this.aClass280_6767.method2763(var4, -2032717100);
		}
	}

	public Class382 method4312(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_6769;
			Class382 var3;
			synchronized (this.aClass367_6769) {
				var3 = (Class382) this.aClass367_6769.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6767;
			byte[] var12;
			synchronized (this.aClass280_6767) {
				var12 = this.aClass280_6767.getFile(Class103.aClass103_938.method1228(arg0, -934693615), Class103.aClass103_938.method1227(arg0, (byte) 5));
			}
			var3 = new Class382();
			if (var12 != null) {
				var3.method4404(new Buffer(var12), 574694921);
			}
			Class367 var13 = this.aClass367_6769;
			synchronized (this.aClass367_6769) {
				this.aClass367_6769.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "pk.r(" + ')');
		}
	}

	public void method4313(int arg0) {
		try {
			Class367 var2 = this.aClass367_6769;
			synchronized (this.aClass367_6769) {
				this.aClass367_6769.method4298((byte) 60);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pk.j(" + ')');
		}
	}

	public void method4314(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6769;
			synchronized (this.aClass367_6769) {
				this.aClass367_6769.method4292(arg0, (byte) 66);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pk.i(" + ')');
		}
	}

	public void method4315(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6769;
			synchronized (this.aClass367_6769) {
				this.aClass367_6769.method4296(264903264);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pk.p(" + ')');
		}
	}

	public void method4316(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_6769;
			synchronized (this.aClass367_6769) {
				this.aClass367_6769.method4298((byte) 25);
				this.aClass367_6769 = new Class367(arg0);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pk.o(" + ')');
		}
	}

	public static final void method4317(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean8961 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pk.amg(" + ')');
		}
	}

	public static void method4318(Class356 arg0, Class_ra arg1, int arg2) {
		try {
			Iterator var3 = Class391.aList4056.iterator();
			while (var3.hasNext()) {
				Class388 var4 = (Class388) var3.next();
				if (var4.aBoolean4003) {
					var4.method4567(arg0, arg1);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pk.i(" + ')');
		}
	}
}
