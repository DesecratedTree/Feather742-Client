package deob;

public class Class531 {

	public IndexTable aClass280_6224;

	public int anInt6223;

	public Class330_Sub36_Sub6[] aClass330_Sub36_Sub6Array6222;

	public Class531(Class435 arg0, Class454 arg1, IndexTable arg2, boolean arg3) {
		this.aClass280_6224 = arg2;
		this.anInt6223 = this.aClass280_6224.method2763(Class103.aClass103_963.anInt982, -2041512686);
		if (arg3) {
			this.aClass330_Sub36_Sub6Array6222 = new Class330_Sub36_Sub6[this.anInt6223];
			for (int var5 = 0; var5 < this.anInt6223; var5++) {
				IndexTable var7 = this.aClass280_6224;
				byte[] var6;
				synchronized (this.aClass280_6224) {
					var6 = this.aClass280_6224.getFile(Class103.aClass103_963.anInt982, var5);
				}
				Class330_Sub36_Sub6 var10 = new Class330_Sub36_Sub6();
				if (var6 != null) {
					var10.method3463(new Buffer(var6), -2142942579);
				}
				this.aClass330_Sub36_Sub6Array6222[var5] = var10;
			}
		}
	}

	public Class330_Sub36_Sub6 method6296(int arg0, int arg1) {
		try {
			return arg0 < 0 ? new Class330_Sub36_Sub6() : this.aClass330_Sub36_Sub6Array6222[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vz.r(" + ')');
		}
	}

	public static String method6297(CharSequence arg0, int arg1) {
		try {
			return CacheIndex.method1521(arg0, null, -239647845);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vz.p(" + ')');
		}
	}

	public static boolean method6298(int arg0, int arg1) {
		try {
			if (arg0 == 9 || arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 1003) {
				return true;
			} else {
				return arg0 == 8;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vz.br(" + ')');
		}
	}
}
