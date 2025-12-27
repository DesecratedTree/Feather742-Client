package deob;

public class Class538 {

	public long aLong6242;

	public int[] anIntArray6240;

	public short[] aShortArray6241;

	public short[] aShortArray6239;

	public static IndexTable aClass280_6243;

	public Class538(long arg0, int[] arg1, short[] arg2, short[] arg3) {
		this.aLong6242 = arg0;
		this.anIntArray6240 = arg1;
		this.aShortArray6241 = arg2;
		this.aShortArray6239 = arg3;
	}

	public Class538(Class551 arg0, boolean arg1) {
		if (arg1) {
			this.anIntArray6240 = new int[arg0.anIntArray6296.length];
			System.arraycopy(arg0.anIntArray6296, 0, this.anIntArray6240, 0, this.anIntArray6240.length);
		} else {
			this.anIntArray6240 = new int[arg0.anIntArray6297.length];
			System.arraycopy(arg0.anIntArray6297, 0, this.anIntArray6240, 0, this.anIntArray6240.length);
		}
		if (arg0.aShortArray6301 != null) {
			this.aShortArray6241 = new short[arg0.aShortArray6301.length];
			System.arraycopy(arg0.aShortArray6301, 0, this.aShortArray6241, 0, this.aShortArray6241.length);
		}
		if (arg0.aShortArray6349 != null) {
			this.aShortArray6239 = new short[arg0.aShortArray6349.length];
			System.arraycopy(arg0.aShortArray6349, 0, this.aShortArray6239, 0, this.aShortArray6239.length);
		}
	}

	public static void method6324(int arg0) {
	}

	public static void method6325(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -1471193697).anInt4097;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wh.p(" + ')');
		}
	}
}
