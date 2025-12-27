package deob;

public class Class534 implements Interface23 {

	public Class367 aClass367_6786 = new Class367(64);

	public IndexTable aClass280_6787;

	public static Class412 aClass412_6788;

	public Class534(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_6787 = arg2;
		this.aClass280_6787.method2763(Class103.aClass103_929.anInt982, -2024541320);
	}

	public Class330_Sub36_Sub1 method6305(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_6786;
			Class330_Sub36_Sub1 var3;
			synchronized (this.aClass367_6786) {
				var3 = (Class330_Sub36_Sub1) this.aClass367_6786.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6787;
			byte[] var13;
			synchronized (this.aClass280_6787) {
				var13 = this.aClass280_6787.getFile(Class103.aClass103_929.anInt982, arg0);
			}
			var3 = new Class330_Sub36_Sub1();
			if (var13 != null) {
				var3.method3441(new Buffer(var13), (byte) 0);
			}
			Class367 var12 = this.aClass367_6786;
			synchronized (this.aClass367_6786) {
				this.aClass367_6786.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "wd.r(" + ')');
		}
	}

	public static void method6306(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
		try {
			Class512.method6192(0, Class507.aClass401_Sub1Array5935.length - 1, arg0, arg1, arg2, arg3, -2071045247);
			Class507.anInt5931 = 0;
			Class507.aClass422_5938 = null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wd.w(" + ')');
		}
	}

	public static final void method6307(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			ItemDefinitions var3 = Class556.aClass510_6392.getItemDefinitions(var2, (byte) 7);
			int var4;
			if (var3.aBoolean6716) {
				var4 = var3.anInt6713;
			} else if (var3.aBoolean6707) {
				var4 = aClass412_6788.anInt4253;
			} else {
				var4 = aClass412_6788.anInt4254;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wd.aba(" + ')');
		}
	}
}
