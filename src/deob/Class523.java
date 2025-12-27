package deob;

import java.util.Queue;

public class Class523 {

	public static int anInt6027 = 1;

	public static int anInt6029 = 32768;

	public int anInt6028 = 0;

	public int anInt6025 = 0;

	public Class367 aClass367_6026 = new Class367(64);

	public Interface24 anInterface24_6024 = null;

	public IndexTable aClass280_6023;

	public IndexTable aClass280_6022;

	public Class523(Class454 arg0, IndexTable arg1, IndexTable arg2, Interface24 arg3) {
		this.aClass280_6023 = arg1;
		this.aClass280_6022 = arg2;
		this.anInterface24_6024 = arg3;
		if (this.aClass280_6023 != null) {
			this.anInt6028 = this.aClass280_6023.method2763(1, -2011177170);
		}
		if (this.aClass280_6022 != null) {
			this.anInt6025 = this.aClass280_6022.method2763(1, -2144968860);
		}
	}

	public String method6232(Class390 arg0, int[] arg1, long arg2) {
		try {
			if (this.anInterface24_6024 != null) {
				String var5 = this.anInterface24_6024.method291(arg0, arg1, arg2);
				if (var5 != null) {
					return var5;
				}
			}
			return Long.toString(arg2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "vq.j(" + ')');
		}
	}

	public Class330_Sub36_Sub4 method6233(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub4 var3 = (Class330_Sub36_Sub4) this.aClass367_6026.get((long) arg0);
			if (var3 != null) {
				return var3;
			}
			byte[] var4;
			if (arg0 >= 32768) {
				var4 = this.aClass280_6022.getFile(1, arg0 & 0x7FFF);
			} else {
				var4 = this.aClass280_6023.getFile(1, arg0);
			}
			var3 = new Class330_Sub36_Sub4();
			var3.aClass523_9657 = this;
			if (var4 != null) {
				var3.method3456(new Buffer(var4), (byte) 16);
			}
			if (arg0 >= 32768) {
				var3.method3454(-1156308730);
			}
			this.aClass367_6026.put(var3, (long) arg0);
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vq.r(" + ')');
		}
	}

	public static final void method6234(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Integer var3 = (Integer) Class332.anObjectArray6640[var2];
			if (var3 == null) {
				Class535 var4 = Class95_Sub7.aClass536_7157.method6315(var2, -1210051099);
				if (var4.aChar6227 == 'i' || var4.aChar6227 == '1') {
					arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
				} else {
					arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
				}
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vq.bp(" + ')');
		}
	}

	public static final void method6235(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1226;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vq.py(" + ')');
		}
	}

	public static final int method6236(int arg0, int arg1, int arg2) {
		try {
			if (arg0 == -2) {
				return 12345678;
			} else if (arg0 == -1) {
				if (arg1 < 2) {
					arg1 = 2;
				} else if (arg1 > 126) {
					arg1 = 126;
				}
				return arg1;
			} else {
				arg1 = (arg0 & 0x7F) * arg1 >> 7;
				if (arg1 < 2) {
					arg1 = 2;
				} else if (arg1 > 126) {
					arg1 = 126;
				}
				return (arg0 & 0xFF80) + arg1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vq.b(" + ')');
		}
	}

	public static void method6237(short arg0) {
		try {
			Class517.method6212(false, -609754562);
			if (Class354_Sub1.anInt7979 >= 0 && Class354_Sub1.anInt7979 != 0) {
				Class171.method2046(Class354_Sub1.anInt7979, false, 1961370808);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(1171803612) != Class354_Sub1.anInt7979) {
					switch(Class354_Sub1.anInt7979) {
						case 1:
							Class136.method1591(Class533.aClass533_6907, -1186656177);
							break;
						case 2:
							Class136.method1591(Class533.aClass533_6908, -1053212406);
							break;
						case 3:
							Class136.method1591(Class533.aClass533_6912, 1305710235);
					}
				}
				Class354_Sub1.anInt7979 = -1;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vq.cq(" + ')');
		}
	}

	public static void method6238(int arg0) {
		try {
			Queue var1 = Class393.aQueue4064;
			synchronized (Class393.aQueue4064) {
				while (true) {
					Class330_Sub44_Sub1 var2 = (Class330_Sub44_Sub1) Class393.aQueue4064.poll();
					if (var2 == null) {
						return;
					}
					var2.method3714(-1378139739);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vq.s(" + ')');
		}
	}

	public static final void method6239(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class506 var4 = Class211.aClass505_2062.method6140(var2, 2000983847);
			if (var4.aChar5921 == 's') {
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4.method6144(var3, (byte) -9);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vq.vi(" + ')');
		}
	}
}
