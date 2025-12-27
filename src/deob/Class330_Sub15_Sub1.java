package deob;

public abstract class Class330_Sub15_Sub1 extends Class330_Sub15 {

	public Class109 aClass109_9547;

	public String aString9545;

	public String aString9546;

	public int anInt9544;

	public Class109 aClass109_9548;

	public Class330_Sub15_Sub1(Class104 arg0) {
		this.aClass109_9547 = arg0.aClass109_985;
		this.aString9545 = arg0.aString988;
		this.aString9546 = arg0.aString989;
		this.anInt9544 = arg0.anInt987;
		this.aClass109_9548 = arg0.aClass109_990;
	}

	public Class109 method3323(int arg0) {
		try {
			return this.aClass109_9547;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiy.i(" + ')');
		}
	}

	public String method3324(byte arg0) {
		try {
			return this.aString9545;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiy.j(" + ')');
		}
	}

	public Class109 method3325(int arg0) {
		try {
			return this.aClass109_9548;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiy.p(" + ')');
		}
	}

	public int method3326(int arg0) {
		try {
			if (this.aClass109_9547 != Class109.aClass109_1028) {
				throw new IllegalArgumentException_Sub1(this, this.aClass109_9547.toString().toLowerCase());
			}
			return this.anInt9544;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aiy.o(" + ')');
		}
	}

	public String toString() {
		try {
			String var1 = this.aClass109_9547.toString() + " " + this.aString9545;
			if (this.aString9546 != null && !"".equals(this.aString9546)) {
				var1 = var1 + " : " + this.aString9546;
			}
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "aiy.toString(" + ')');
		}
	}

	public static final void method3332(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class460.method5691(var3, var4, arg0, -706507629);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aiy.cs(" + ')');
		}
	}

	public abstract boolean method3322(int arg0);

	public abstract int method3327(int arg0);

	public abstract int method3328(int arg0);

	public abstract boolean method3329(int arg0);

	public abstract int method3330(int arg0);

	public abstract int method3331(int arg0);
}
