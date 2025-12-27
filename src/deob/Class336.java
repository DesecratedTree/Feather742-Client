package deob;

import java.util.Arrays;

public class Class336 implements Interface19 {

	public Class432_Sub1_Sub1_Sub3 aClass432_Sub1_Sub1_Sub3_6651;

	public static IndexTable aClass280_6652;

	public Class336(Class432_Sub1_Sub1_Sub3 arg0) {
		this.aClass432_Sub1_Sub1_Sub3_6651 = arg0;
	}

	public boolean method279(Class432_Sub1_Sub1 arg0, int arg1) {
		try {
			return arg0 == this.aClass432_Sub1_Sub1_Sub3_6651;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nz.r(" + ')');
		}
	}

	public boolean method280(Class432_Sub1_Sub1 arg0) {
		return arg0 == this.aClass432_Sub1_Sub1_Sub3_6651;
	}

	public boolean method281(Class432_Sub1_Sub1 arg0) {
		return arg0 == this.aClass432_Sub1_Sub1_Sub3_6651;
	}

	public boolean method278(Class432_Sub1_Sub1 arg0) {
		return arg0 == this.aClass432_Sub1_Sub1_Sub3_6651;
	}

	public static Class384 method3943(int arg0, int arg1) {
		try {
			Class384[] var2 = Class112.method1373(-314133676);
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class384 var4 = var2[var3];
				if (var4.anInt3966 == arg0) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nz.j(" + ')');
		}
	}

	public static void method3944(Player arg0, int arg1, int arg2, int arg3) {
		try {
			int[] var4 = new int[Class487_Sub1.method6040(1981547477).length];
			Arrays.fill(var4, 0, var4.length, arg1);
			Class150_Sub2.method1772(arg0, var4, arg2, false, (byte) -59);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nz.io(" + ')');
		}
	}

	public static Buffer method3945(byte arg0) {
		try {
			Buffer var1 = new Buffer(518);
			Canvas_Sub1.anIntArray10 = new int[4];
			Canvas_Sub1.anIntArray10[0] = (int) (Math.random() * 9.9999999E7D);
			Canvas_Sub1.anIntArray10[1] = (int) (Math.random() * 9.9999999E7D);
			Canvas_Sub1.anIntArray10[2] = (int) (Math.random() * 9.9999999E7D);
			Canvas_Sub1.anIntArray10[3] = (int) (Math.random() * 9.9999999E7D);
			var1.addByte(10, (byte) 103);
			var1.addInt(Canvas_Sub1.anIntArray10[0], 1965508160);
			var1.addInt(Canvas_Sub1.anIntArray10[1], 1965508160);
			var1.addInt(Canvas_Sub1.anIntArray10[2], 1965508160);
			var1.addInt(Canvas_Sub1.anIntArray10[3], 1965508160);
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "nz.t(" + ')');
		}
	}

	public static final void method3946(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			int var4 = -1;
			if (var3 != null) {
				var4 = var3.anInt1379;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nz.acj(" + ')');
		}
	}
}
