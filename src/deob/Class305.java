package deob;

public class Class305 {

	public Class497 aClass497_3113 = new Class497(256);

	public Class497 aClass497_3111 = new Class497(256);

	public Class497 aClass497_3114 = new Class497(256);

	public IndexTable aClass280_3115;

	public IndexTable aClass280_3112;

	public Class305(IndexTable arg0, IndexTable arg1) {
		this.aClass280_3115 = arg0;
		this.aClass280_3112 = arg1;
	}

	public Class330_Sub29_Sub1_Sub1 method3038(int arg0, int[] arg1, int arg2) {
		try {
			if (this.aClass280_3112.method2764(2092385061) == 1) {
				return this.method3040(0, arg0, arg1, -764071908);
			} else if (this.aClass280_3112.method2763(arg0, -2118834573) == 1) {
				return this.method3040(arg0, 0, arg1, -1000741302);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.p(" + ')');
		}
	}

	public Class330_Sub29_Sub1_Sub2 method3039(int arg0, int arg1, int[] arg2, byte arg3) {
		try {
			int var5 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
			int var11 = var5 | arg0 << 16;
			long var6 = (long) var11;
			Class330_Sub29_Sub1_Sub2 var8 = (Class330_Sub29_Sub1_Sub2) this.aClass497_3114.method6094(var6);
			if (var8 != null) {
				return var8;
			} else if (arg2 == null || arg2[0] > 0) {
				Class302 var9 = Class302.method2982(this.aClass280_3115, arg0, arg1);
				if (var9 == null) {
					return null;
				}
				var8 = var9.method2981();
				this.aClass497_3114.method6097(var8, var6);
				if (arg2 != null) {
					arg2[0] -= var8.aByteArray10135.length;
				}
				return var8;
			} else {
				return null;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ms.r(" + ')');
		}
	}

	public Class330_Sub29_Sub1_Sub1 method3040(int arg0, int arg1, int[] arg2, int arg3) {
		try {
			int var5 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
			int var11 = var5 | arg0 << 16;
			long var6 = (long) var11 ^ 0x100000000L;
			Class330_Sub29_Sub1_Sub1 var8 = (Class330_Sub29_Sub1_Sub1) this.aClass497_3111.method6094(var6);
			if (var8 != null) {
				return var8;
			} else if (arg2 == null || arg2[0] > 0) {
				Class330_Sub41 var9 = (Class330_Sub41) this.aClass497_3113.method6094(var6);
				if (var9 == null) {
					var9 = Class330_Sub41.method3703(this.aClass280_3112, arg0, arg1);
					if (var9 == null) {
						return null;
					}
					this.aClass497_3113.method6097(var9, var6);
				}
				var8 = var9.method3699();
				if (var8 == null) {
					return null;
				} else {
					var9.method3252(-1134314534);
					this.aClass497_3111.method6097(var8, var6);
					return var8;
				}
			} else {
				return null;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ms.j(" + ')');
		}
	}

	public Class330_Sub29_Sub1_Sub2 method3041(int arg0, int[] arg1, int arg2) {
		try {
			if (this.aClass280_3115.method2764(1887647912) == 1) {
				return this.method3039(0, arg0, arg1, (byte) 83);
			} else if (this.aClass280_3115.method2763(arg0, -2074988742) == 1) {
				return this.method3039(arg0, 0, arg1, (byte) 101);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.i(" + ')');
		}
	}

	public static void method3042(int arg0, int arg1) {
		try {
			Class367 var2 = Class408.aClass367_4202;
			synchronized (Class408.aClass367_4202) {
				Class408.aClass367_4202.method4292(arg0, (byte) 99);
			}
			var2 = Class408.aClass367_4207;
			synchronized (Class408.aClass367_4207) {
				Class408.aClass367_4207.method4292(arg0, (byte) 103);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ms.k(" + ')');
		}
	}

	public static final void method3043(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1101403893);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class215.method2236(var3, var4, arg0, (byte) 112);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.cp(" + ')');
		}
	}

	public static final void method3044(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class367.method4300(var3, var4, arg0, -2012052883);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.on(" + ')');
		}
	}

	public static final void method3045(Class430 arg0, byte arg1) {
		try {
			Class134.method1575((byte) 12);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ms.afj(" + ')');
		}
	}

	public static final void method3046(Class430 arg0, byte arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, -1259491564);
			Class435.method5568(2054427381);
			Class22.method473((byte) 54);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ms.akl(" + ')');
		}
	}

	public static final void method3047(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class89.method1059(var3, var4, arg0, (byte) 17);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.oa(" + ')');
		}
	}

	public static final void method3048(byte arg0) {
		try {
			Class330_Sub10 var1;
			for (var1 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); var1 != null; var1 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -42)) {
				if (var1.aBoolean7586) {
					var1.method3252(-1026808937);
				} else {
					var1.aBoolean7583 = true;
					if (var1.anInt7582 >= 0 && var1.anInt7577 >= 0 && var1.anInt7582 < client.aClass304_9030.method2990(-1180802296) && var1.anInt7577 < client.aClass304_9030.method3033((byte) -40)) {
						Class313.method3117(var1, 740296243);
					}
				}
			}
			for (var1 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); var1 != null; var1 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -16)) {
				if (var1.aBoolean7586) {
					var1.method3252(-830253156);
				} else {
					var1.aBoolean7583 = true;
				}
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ms.i(" + ')');
		}
	}

	public static void method3049(Class_ra arg0, byte arg1) {
		try {
			if (Class484.aBoolean5782) {
				Class330_Sub34.method3437(arg0, -1809584510);
			} else {
				Class464.method5729(arg0, -427290244);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ms.v(" + ')');
		}
	}

	public static void method3050(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class330_Sub36_Sub3 var4 = Class464_Sub4.method5750(11, (long) arg0);
			var4.method3445((byte) 0);
			var4.anInt9629 = arg1;
			var4.anInt9626 = arg2;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ms.az(" + ')');
		}
	}
}
