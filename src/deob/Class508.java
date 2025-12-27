package deob;

import java.util.Iterator;

public class Class508 implements Iterator {

	public Class330 aClass330_5941 = null;

	public Class497 aClass497_5943;

	public int anInt5944;

	public static int anInt5945;

	public Class330 aClass330_5942;

	public Class508(Class497 arg0) {
		this.aClass497_5943 = arg0;
		this.method6155(-1898712553);
	}

	public Object next() {
		try {
			Class330 var1;
			if (this.aClass330_5942 != this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1]) {
				var1 = this.aClass330_5942;
				this.aClass330_5942 = var1.aClass330_3340;
				this.aClass330_5941 = var1;
				return var1;
			}
			while (this.anInt5944 < this.aClass497_5943.anInt5882) {
				var1 = this.aClass497_5943.aClass330Array5878[++this.anInt5944 - 1].aClass330_3340;
				if (this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1] != var1) {
					this.aClass330_5942 = var1.aClass330_3340;
					this.aClass330_5941 = var1;
					return var1;
				}
			}
			return null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uz.next(" + ')');
		}
	}

	public void method6155(int arg0) {
		try {
			this.aClass330_5942 = this.aClass497_5943.aClass330Array5878[0].aClass330_3340;
			this.anInt5944 = 1;
			this.aClass330_5941 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uz.f(" + ')');
		}
	}

	public void remove() {
		try {
			if (this.aClass330_5941 == null) {
				throw new IllegalStateException();
			}
			this.aClass330_5941.method3252(-698906095);
			this.aClass330_5941 = null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uz.remove(" + ')');
		}
	}

	public boolean hasNext() {
		try {
			if (this.aClass330_5942 != this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1]) {
				return true;
			}
			while (this.anInt5944 < this.aClass497_5943.anInt5882) {
				if (this.aClass497_5943.aClass330Array5878[++this.anInt5944 - 1].aClass330_3340 != this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1]) {
					this.aClass330_5942 = this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1].aClass330_3340;
					return true;
				}
				this.aClass330_5942 = this.aClass497_5943.aClass330Array5878[this.anInt5944 - 1];
			}
			return false;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uz.hasNext(" + ')');
		}
	}

	public Class330 method6156(int arg0) {
		try {
			this.method6155(2053645685);
			return (Class330) this.next();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uz.z(" + ')');
		}
	}

	public static Class219[] method6157(int arg0) {
		try {
			return new Class219[] { Class219.aClass219_2159, Class219.aClass219_2168, Class219.aClass219_2154, Class219.aClass219_2151, Class219.aClass219_2153, Class219.aClass219_2173, Class219.aClass219_2174, Class219.aClass219_2150, Class219.aClass219_2155, Class219.aClass219_2149, Class219.aClass219_2163, Class219.aClass219_2170, Class219.aClass219_2182, Class219.aClass219_2156, Class219.aClass219_2160, Class219.aClass219_2157, Class219.aClass219_2164, Class219.aClass219_2152, Class219.aClass219_2171, Class219.aClass219_2177, Class219.aClass219_2161, Class219.aClass219_2167, Class219.aClass219_2178, Class219.aClass219_2166, Class219.aClass219_2148, Class219.aClass219_2158, Class219.aClass219_2169, Class219.aClass219_2162, Class219.aClass219_2172, Class219.aClass219_2165, Class219.aClass219_2181, Class219.aClass219_2179, Class219.aClass219_2180, Class219.aClass219_2176 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uz.r(" + ')');
		}
	}

	public static void method6158(int arg0) {
		try {
			if (Class509.anIcmpService_Sub1_5947 != null) {
				try {
					Class509.anIcmpService_Sub1_5947.quit();
				} catch (Throwable var2) {
				}
				Class509.anIcmpService_Sub1_5947 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uz.s(" + ')');
		}
	}

	public static final void method6159(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 563094173);
			if (var3.aString1283 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString1283;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uz.sr(" + ')');
		}
	}

	public static void method6160(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 1], -1356066537).method4636(Class158.aClass561_6474, -1125970624) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uz.h(" + ')');
		}
	}
}
