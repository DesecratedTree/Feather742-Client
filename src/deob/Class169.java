package deob;

import java.awt.Component;

public class Class169 implements Interface23 {

	public Class367 aClass367_6762 = new Class367(64);

	public IndexTable aClass280_6760;

	public IndexTable aClass280_6761;

	public Class169(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_6760 = arg2;
		this.aClass280_6761 = arg3;
		this.aClass280_6760.method2763(Class103.aClass103_950.anInt982, -2096614565);
	}

	public void method2028(int arg0, int arg1) {
		try {
			Class367 var3 = this.aClass367_6762;
			synchronized (this.aClass367_6762) {
				this.aClass367_6762.method4292(arg0, (byte) 2);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gx.i(" + ')');
		}
	}

	public void method2029(byte arg0) {
		try {
			Class367 var2 = this.aClass367_6762;
			synchronized (this.aClass367_6762) {
				this.aClass367_6762.method4296(1498518940);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gx.p(" + ')');
		}
	}

	public void method2030(int arg0) {
		try {
			Class367 var2 = this.aClass367_6762;
			synchronized (this.aClass367_6762) {
				this.aClass367_6762.method4298((byte) 56);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gx.j(" + ')');
		}
	}

	public Class151 method2031(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_6762;
			Class151 var3;
			synchronized (this.aClass367_6762) {
				var3 = (Class151) this.aClass367_6762.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_6760;
			byte[] var13;
			synchronized (this.aClass280_6760) {
				var13 = this.aClass280_6760.getFile(Class103.aClass103_950.anInt982, arg0);
			}
			var3 = new Class151();
			var3.aClass169_6661 = this;
			if (var13 != null) {
				var3.method1774(new Buffer(var13), (byte) 70);
			}
			Class367 var12 = this.aClass367_6762;
			synchronized (this.aClass367_6762) {
				this.aClass367_6762.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "gx.r(" + ')');
		}
	}

	public static Class350 method2032(Component arg0, boolean arg1, byte arg2) {
		try {
			return new Class350_Sub1(arg0, arg1);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gx.r(" + ')');
		}
	}

	public static final void method2033(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			IndexTable.method2782(var3, var4, arg0, -1440813916);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gx.np(" + ')');
		}
	}

	public static final void method2034(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class404.method4734(var3, var4, arg0, 2137973521);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gx.ei(" + ')');
		}
	}

	public static final void method2035(Class430 arg0, int arg1) {
		try {
			Class416.method5256(arg0.aClass432_Sub1_Sub2_Sub1_4390, arg0.anIntArray4387[--arg0.anInt4376], 2006105946);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[0];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gx.arj(" + ')');
		}
	}
}
