package deob;

import java.awt.event.ActionEvent;

public abstract class Class285 {

	public static int anInt2929 = 50;

	public static int anInt2931 = 20;

	public static int anInt2939 = 512;

	public static int anInt2942 = 1;

	public Class472 aClass472_2933 = new Class472();

	public Class472 aClass472_2934 = new Class472();

	public Class472 aClass472_2944 = new Class472();

	public Class472 aClass472_2936 = new Class472();

	public Buffer aClass330_Sub46_2935 = new Buffer(6);

	public byte aByte2940 = 0;

	public volatile int anInt2941 = 0;

	public volatile int anInt2932 = 0;

	public Buffer aClass330_Sub46_2930 = new Buffer(10);

	public int anInt2937;

	public long aLong2938;

	public Class330_Sub36_Sub16_Sub2 aClass330_Sub36_Sub16_Sub2_2943;

	public Class330_Sub36_Sub16_Sub2 method2832(int arg0, int arg1, byte arg2, boolean arg3, byte arg4) {
		try {
			long var6 = (long) arg1 + ((long) arg0 << 32);
			Class330_Sub36_Sub16_Sub2 var8 = new Class330_Sub36_Sub16_Sub2();
			var8.aLong7734 = var6;
			var8.aByte10152 = arg2;
			var8.aBoolean9723 = arg3;
			if (arg3) {
				if (this.method2835(16777215) >= 50) {
					throw new RuntimeException();
				}
				this.aClass472_2933.method5883(var8, -498619459);
			} else if (this.method2842(539917268) < 20) {
				this.aClass472_2944.method5883(var8, -477021642);
			} else {
				throw new RuntimeException();
			}
			return var8;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "lw.r(" + ')');
		}
	}

	public boolean method2833(byte arg0) {
		try {
			return this.method2835(16777215) >= 50;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lw.i(" + ')');
		}
	}

	public int method2835(int arg0) {
		try {
			return this.aClass472_2933.method5887(-588880570) + this.aClass472_2934.method5887(-2039613917);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lw.o(" + ')');
		}
	}

	public int method2842(int arg0) {
		try {
			return this.aClass472_2944.method5887(-1069369281) + this.aClass472_2936.method5887(-374935562);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lw.p(" + ')');
		}
	}

	public boolean method2844(byte arg0) {
		try {
			return this.method2842(-1170115806) >= 20;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lw.j(" + ')');
		}
	}

	public static void method2859(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 2] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -1929591661).method4639(client.anIntArray9143, arg0.anIntArray4387[arg0.anInt4376 - 1], (byte) 18) ? 1 : 0;
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lw.u(" + ')');
		}
	}

	public static final void method2860(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 162169918);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class412.method5235(var3, var4, arg0, 650556859);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lw.eg(" + ')');
		}
	}

	public static final void method2861(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1249 = Class288.method2886(var4, arg2, 1530994362);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lw.la(" + ')');
		}
	}

	public static void method2862(Object arg0, int arg1) {
		try {
			if (Class170.anEventQueue1724 != null) {
				for (int var2 = 0; var2 < 50 && Class170.anEventQueue1724.peekEvent() != null; var2++) {
					Class464_Sub21.method5813(1L);
				}
				try {
					if (arg0 != null) {
						Class170.anEventQueue1724.postEvent(new ActionEvent(arg0, 1001, "dummy"));
					}
				} catch (Exception var3) {
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lw.t(" + ')');
		}
	}

	public static void method2863(Class432_Sub1_Sub1_Sub1 arg0, int arg1, byte arg2) {
		try {
			if (arg0.anIntArray10030 != null) {
				Class299 var3 = (Class299) Class479.method6015(Class487_Sub1.method6040(-139826911), arg1, (byte) 102);
				int var4 = arg0.anIntArray10030[var3.method2971((byte) -62)];
				if (var4 != arg0.aClass477_10032.method5967((byte) -80)) {
					arg0.aClass477_10032.method5984(var4, arg0.aClass477_10032.method5973((byte) 1), (short) -1528);
					arg0.anInt10006 = arg0.anInt10056;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lw.ii(" + ')');
		}
	}

	public abstract void method2831(int arg0);

	public abstract void method2834();

	public abstract void method2836(int arg0);

	public abstract boolean method2837(byte arg0);

	public abstract void method2838(Object arg0, boolean arg1, byte arg2);

	public abstract void method2839(boolean arg0, int arg1);

	public abstract void method2840(byte arg0);

	public abstract boolean method2841();

	public abstract void method2843(Object arg0, boolean arg1);

	public abstract void method2845();

	public abstract void method2846();

	public abstract void method2847(Object arg0, boolean arg1);

	public abstract void method2848(int arg0);

	public abstract void method2849();

	public abstract void method2850(boolean arg0);

	public abstract void method2851(boolean arg0);

	public abstract void method2852(boolean arg0);

	public abstract void method2853();

	public abstract void method2854();

	public abstract void method2855();

	public abstract void method2856();

	public abstract void method2857();

	public abstract void method2858();
}
