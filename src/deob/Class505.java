package deob;

public class Class505 {

	public Class367 aClass367_5920 = new Class367(128);

	public IndexTable aClass280_5919;

	public Class505(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_5919 = arg2;
		if (this.aClass280_5919 != null) {
			int var4 = this.aClass280_5919.method2764(1877326746) - 1;
			Class103.aClass103_932.method1226((byte) 0);
			this.aClass280_5919.method2763(var4, -2045055152);
		}
	}

	public Class506 method6140(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_5920;
			Class506 var3;
			synchronized (this.aClass367_5920) {
				var3 = (Class506) this.aClass367_5920.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			byte[] var10 = this.aClass280_5919.getFile(Class103.aClass103_932.method1228(arg0, -1867505395), Class103.aClass103_932.method1227(arg0, (byte) 31));
			var3 = new Class506();
			if (var10 != null) {
				var3.method6150(new Buffer(var10), 1505010051);
			}
			Class367 var5 = this.aClass367_5920;
			synchronized (this.aClass367_5920) {
				this.aClass367_5920.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "uw.r(" + ')');
		}
	}

	public static final void method6141(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class70.method817(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(50554890), 200, (byte) -38);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uw.amc(" + ')');
		}
	}
}
