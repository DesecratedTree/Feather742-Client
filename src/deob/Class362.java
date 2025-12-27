package deob;

public class Class362 {

	public static Class364 aClass364_3794 = new Class364();

	public Class367 aClass367_3795 = new Class367(64);

	public IndexTable aClass280_3798;

	public Class421 aClass421_3797;

	public static int anInt3796;

	public static Class8 aClass8_3799;

	public Class362(Class435 arg0, Class454 arg1, IndexTable arg2, Class421 arg3) {
		this.aClass280_3798 = arg2;
		this.aClass280_3798.method2763(Class103.aClass103_956.anInt982, -2135927003);
		this.aClass421_3797 = arg3;
	}

	public void method4251(byte arg0) {
		try {
			Class367 var2 = this.aClass367_3795;
			synchronized (this.aClass367_3795) {
				this.aClass367_3795.method4296(-582320513);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pb.p(" + ')');
		}
	}

	public void method4252(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_3795;
			synchronized (this.aClass367_3795) {
				this.aClass367_3795.method4292(arg0, (byte) 43);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pb.i(" + ')');
		}
	}

	public void method4253(int arg0) {
		try {
			Class367 var2 = this.aClass367_3795;
			synchronized (this.aClass367_3795) {
				this.aClass367_3795.method4298((byte) 44);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pb.j(" + ')');
		}
	}

	public Class364 method4254(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_3795;
			Class364 var3;
			synchronized (this.aClass367_3795) {
				var3 = (Class364) this.aClass367_3795.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_3798;
			byte[] var13;
			synchronized (this.aClass280_3798) {
				var13 = this.aClass280_3798.getFile(Class103.aClass103_956.anInt982, arg0);
			}
			var3 = new Class364();
			var3.aClass362_3810 = this;
			if (var13 != null) {
				var3.method4267(new Buffer(var13), (byte) -1);
			}
			Class367 var12 = this.aClass367_3795;
			synchronized (this.aClass367_3795) {
				this.aClass367_3795.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "pb.r(" + ')');
		}
	}

	public static final void method4255(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			Class385.method4427(var2, var3 == 1, 1560581462);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class440.anInt4482;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pb.abp(" + ')');
		}
	}

	public static final void method4256(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Character.toLowerCase((char) var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pb.aaq(" + ')');
		}
	}

	public static final int method4257(int arg0) {
		try {
			return (int) (1000000000L / Class332.aLong6602);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pb.ac(" + ')');
		}
	}
}
