package deob;

import java.io.File;

public class Class464_Sub2 extends Class464 {

	public static int anInt8663 = 0;

	public static int anInt8664 = 1;

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5718() {
		return 1;
	}

	public Class464_Sub2(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5716(int arg0, int arg1) {
		try {
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aey.j(" + ')');
		}
	}

	public int method5736(byte arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aey.b(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aey.r(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aey.p(" + ')');
		}
	}

	public int method5714(int arg0) {
		return 1;
	}

	public void method5737(int arg0) {
		try {
			if (this.anInt5587 != 1 && this.anInt5587 != 0) {
				this.anInt5587 = this.method5715(582265491);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aey.l(" + ')');
		}
	}

	public Class464_Sub2(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public static final void method5738(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1273143978);
			Class307.method3076(var3, arg0, (byte) 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aey.qn(" + ')');
		}
	}

	public static void method5739(File arg0, int arg1) {
		try {
			Class317.aFile3276 = arg0;
			if (!Class317.aFile3276.exists()) {
				throw new RuntimeException("");
			}
			Class317.aBoolean3275 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aey.r(" + ')');
		}
	}

	public static void method5740(int arg0) {
		try {
			if (Class361.aClass_ra3793 != null) {
				client.aClass304_9030.method3003(50776472);
				Class_ta.method5674((byte) 1);
				Class112.method1379(51990841);
				Class110.method1357((byte) 42);
				client.aClass304_9030.method3005(-2047823349);
				Class285_Sub1.method2865((short) -12399);
				Class50.method632(false, (byte) -12);
				Class95_Sub7.method1124(553546010);
				Class517.method6212(true, 1271174264);
				Class421.method5293((byte) 122);
				Class330_Sub9.method3286(1199215044);
				int var1;
				for (var1 = 0; var1 < client.aClass327Array8999.length; var1++) {
					if (client.aClass327Array8999[var1] == null) {
					}
				}
				int var3;
				for (var1 = 0; var1 < 2048; var1++) {
					Player var2 = client.players[var1];
					if (var2 != null) {
						for (var3 = 0; var3 < var2.aClass387Array10066.length; var3++) {
							var2.aClass387Array10066[var3] = null;
						}
					}
				}
				for (var1 = 0; var1 < client.anInt9232; var1++) {
					NPC var5 = (NPC) client.aClass330_Sub35Array9015[var1].anObject7733;
					if (var5 != null) {
						for (var3 = 0; var3 < var5.aClass387Array10066.length; var3++) {
							var5.aClass387Array10066[var3] = null;
						}
					}
				}
				client.aClass497_9216.method6100(65280);
				Class361.aClass_ra3793.method4781(628001038);
				Class361.aClass_ra3793 = null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aey.fw(" + ')');
		}
	}
}
