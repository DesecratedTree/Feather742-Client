package deob;

public class Class515 {

	public Class367 aClass367_5971 = new Class367(64);

	public IndexTable aClass280_5972;

	public int anInt5973;

	public Class515(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_5972 = arg2;
		this.anInt5973 = this.aClass280_5972.method2763(Class103.aClass103_937.anInt982, -2110543536);
	}

	public Class514 method6203(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_5971;
			Class514 var3;
			synchronized (this.aClass367_5971) {
				var3 = (Class514) this.aClass367_5971.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_5972;
			byte[] var13;
			synchronized (this.aClass280_5972) {
				var13 = this.aClass280_5972.getFile(Class103.aClass103_937.anInt982, arg0);
			}
			var3 = new Class514();
			if (var13 != null) {
				var3.method6199(new Buffer(var13), -1724361798);
			}
			Class367 var12 = this.aClass367_5971;
			synchronized (this.aClass367_5971) {
				this.aClass367_5971.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "vh.r(" + ')');
		}
	}

	public static void method6204(int arg0) {
		try {
			Class96.aClass497_857.method6100(65280);
			Class96.aClass471_856.method5866(613065745);
			Class96.aClass79Array853 = null;
			Class96.aClass85Array854 = null;
			Class96.aClass88Array855 = null;
			Class96.aClass89Array862 = null;
			Class467.aClass95Array5599 = null;
			Class96.anInt858 = 1;
			Class96.anInt863 = 0;
			Class96.anInt860 = 0;
			Class532.aClass78_6455 = null;
			Class96.anInt852 = -1;
			Class96.anInt864 = -1;
			if (Class96.aBoolean861) {
				client.aShort9249 = Class96.aShort865;
				client.aShort8965 = Class13.aShort175;
				client.aShort9191 = Class96.aShort859;
				client.aShort9203 = Class139.aShort1535;
				Class96.aBoolean861 = false;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vh.i(" + ')');
		}
	}

	public static final void method6205(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1265 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 394346896);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class149.method1764(arg0.anInt1196, 1329699269);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vh.gm(" + ')');
		}
	}
}
