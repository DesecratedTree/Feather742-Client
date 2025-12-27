package deob;

public class Class536 {

	public Class367 aClass367_6231 = new Class367(64);

	public IndexTable aClass280_6232;

	public int anInt6230;

	public static int anInt6229;

	public static Class87 aClass87_6233;

	public Class536(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6232 = arg2;
		if (this.aClass280_6232 == null) {
			this.anInt6230 = 0;
		} else {
			this.anInt6230 = this.aClass280_6232.method2763(Class103.aClass103_975.anInt982, -2034493731);
		}
	}

	public Class535 method6315(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_6231;
			Class535 var3;
			synchronized (this.aClass367_6231) {
				var3 = (Class535) this.aClass367_6231.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6232;
			byte[] var13;
			synchronized (this.aClass280_6232) {
				var13 = this.aClass280_6232.getFile(Class103.aClass103_975.anInt982, arg0);
			}
			var3 = new Class535();
			if (var13 != null) {
				var3.method6308(new Buffer(var13), (short) -7132);
			}
			Class367 var12 = this.aClass367_6231;
			synchronized (this.aClass367_6231) {
				this.aClass367_6231.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "wf.r(" + ')');
		}
	}

	public void method6316(int arg0) {
		try {
			Class367 var2 = this.aClass367_6231;
			synchronized (this.aClass367_6231) {
				this.aClass367_6231.method4298((byte) 119);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wf.j(" + ')');
		}
	}

	public void method6317(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_6231;
			synchronized (this.aClass367_6231) {
				this.aClass367_6231.method4292(arg0, (byte) 6);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wf.i(" + ')');
		}
	}

	public void method6318(int arg0) {
		try {
			Class367 var2 = this.aClass367_6231;
			synchronized (this.aClass367_6231) {
				this.aClass367_6231.method4296(-1816250764);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wf.p(" + ')');
		}
	}

	public static final void method6319(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 > var3 ? var2 : var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wf.zj(" + ')');
		}
	}
}
