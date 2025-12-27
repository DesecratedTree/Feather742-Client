package deob;

public class Class561 implements Interface29 {

	public static long aLong6974 = 500L;

	public static long aLong6975 = 1L;

	public static long aLong6976 = 4611686018427387904L;

	public static long aLong6977 = 1L;

	public static int[] anIntArray6979 = new int[32];

	public Class497 aClass497_6981 = new Class497(128);

	public int[] anIntArray6978 = new int[Class366_Sub4.aClass231_8007.anInt6763];

	public int[] anIntArray6980 = new int[Class366_Sub4.aClass231_8007.anInt6763];

	public static boolean aBoolean6982;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			anIntArray6979[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public int method6462(boolean arg0, int arg1) {
		try {
			long var3 = Class312.method3111((byte) 64);
			for (Class330_Sub22 var5 = (Class330_Sub22) (arg0 ? this.aClass497_6981.method6099((byte) -51) : this.aClass497_6981.method6098((short) -32768)); var5 != null; var5 = (Class330_Sub22) this.aClass497_6981.method6098((short) -32768)) {
				if ((var5.aLong7692 & 0x3FFFFFFFFFFFFFFFL) < var3) {
					if ((var5.aLong7692 & 0x4000000000000000L) != 0L) {
						int var6 = (int) var5.aLong3341;
						this.anIntArray6980[var6] = this.anIntArray6978[var6];
						var5.method3252(1488561806);
						return var6;
					}
					var5.method3252(160597995);
				}
			}
			return -1;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "y.r(" + ')');
		}
	}

	public void method6463(short arg0) {
		try {
			for (int var2 = 0; var2 < Class366_Sub4.aClass231_8007.anInt6763; var2++) {
				this.anIntArray6978[var2] = 0;
				this.anIntArray6980[var2] = 0;
			}
			this.aClass497_6981 = new Class497(128);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "y.j(" + ')');
		}
	}

	public void method6464(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray6980[arg0] = arg1;
			Class330_Sub22 var4 = (Class330_Sub22) this.aClass497_6981.method6094((long) arg0);
			if (var4 == null) {
				var4 = new Class330_Sub22(Class312.method3111((byte) 38) + 500L);
				this.aClass497_6981.method6097(var4, (long) arg0);
			} else {
				var4.aLong7692 = Class312.method3111((byte) 40) + 500L;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "y.i(" + ')');
		}
	}

	public void method6465(int arg0, int arg1, short arg2) {
		try {
			Class382 var4 = Class428.aClass370_4364.method4312(arg0, (byte) 20);
			int var5 = var4.anInt6675;
			int var6 = var4.anInt6676;
			int var7 = var4.anInt6677;
			int var8 = anIntArray6979[var7 - var6];
			if (arg1 < 0 || arg1 > var8) {
				arg1 = 0;
			}
			var8 <<= var6;
			this.method6464(var5, this.anIntArray6980[var5] & ~var8 | arg1 << var6 & var8, 244452946);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "y.o(" + ')');
		}
	}

	public void sendConfigByFile(int arg0, int arg1, int arg2) {
		try {
			Class382 var4 = Class428.aClass370_4364.method4312(arg0, (byte) -49);
			int var5 = var4.anInt6675;
			int var6 = var4.anInt6676;
			int var7 = var4.anInt6677;
			int var8 = anIntArray6979[var7 - var6];
			if (arg1 < 0 || arg1 > var8) {
				arg1 = 0;
			}
			var8 <<= var6;
			this.sendConfig(var5, this.anIntArray6978[var5] & ~var8 | arg1 << var6 & var8, -1099000711);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "y.s(" + ')');
		}
	}

	public int method306(int arg0, int arg1) {
		try {
			return this.anIntArray6980[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "y.f(" + ')');
		}
	}

	public int method310(int arg0, int arg1) {
		try {
			Class382 var3 = Class428.aClass370_4364.method4312(arg0, (byte) -60);
			int var4 = var3.anInt6675;
			int var5 = var3.anInt6676;
			int var6 = var3.anInt6677;
			int var7 = anIntArray6979[var6 - var5];
			return this.anIntArray6980[var4] >> var5 & var7;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "y.z(" + ')');
		}
	}

	public int method308(int arg0) {
		return this.anIntArray6980[arg0];
	}

	public int method312(int arg0) {
		Class382 var2 = Class428.aClass370_4364.method4312(arg0, (byte) -5);
		int var3 = var2.anInt6675 * 1842397823 * -1094124161;
		int var4 = var2.anInt6676 * 1502596399 * 946379215;
		int var5 = var2.anInt6677 * 1415793203 * 151044347;
		int var6 = anIntArray6979[var5 - var4];
		return this.anIntArray6980[var3] >> var4 & var6;
	}

	public int method309(int arg0) {
		return this.anIntArray6980[arg0];
	}

	public int method314(int arg0) {
		return this.anIntArray6980[arg0];
	}

	public int method311(int arg0) {
		return this.anIntArray6980[arg0];
	}

	public void sendConfig(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray6978[arg0] = arg1;
			Class330_Sub22 var4 = (Class330_Sub22) this.aClass497_6981.method6094((long) arg0);
			if (var4 == null) {
				var4 = new Class330_Sub22(4611686018427387905L);
				this.aClass497_6981.method6097(var4, (long) arg0);
			} else if (var4.aLong7692 != 4611686018427387905L) {
				var4.aLong7692 = Class312.method3111((byte) 22) + 500L | 0x4000000000000000L;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "y.p(" + ')');
		}
	}

	public int method313(int arg0) {
		Class382 var2 = Class428.aClass370_4364.method4312(arg0, (byte) -70);
		int var3 = var2.anInt6675 * 1842397823 * -1094124161;
		int var4 = var2.anInt6676 * 1502596399 * 946379215;
		int var5 = var2.anInt6677 * 1415793203 * 151044347;
		int var6 = anIntArray6979[var5 - var4];
		return this.anIntArray6980[var3] >> var4 & var6;
	}

	public int method307(int arg0) {
		Class382 var2 = Class428.aClass370_4364.method4312(arg0, (byte) -38);
		int var3 = var2.anInt6675 * 1842397823 * -1094124161;
		int var4 = var2.anInt6676 * 1502596399 * 946379215;
		int var5 = var2.anInt6677 * 1415793203 * 151044347;
		int var6 = anIntArray6979[var5 - var4];
		return this.anIntArray6980[var3] >> var4 & var6;
	}

	public static final void method6468(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3786;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "y.aib(" + ')');
		}
	}

	public static final void method6469(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class426 var3;
			if (arg0.aBoolean4398) {
				var3 = arg0.aClass426_4384;
			} else {
				var3 = arg0.aClass426_4370;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.method5315(arg0.aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067, var2, -1, (byte) -81) ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "y.ara(" + ')');
		}
	}

	public static final void method6470(Class430 arg0, byte arg1) {
		try {
			Class392.method4610(arg0.aClass432_Sub1_Sub1_Sub1_4396, arg0, 462768199);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "y.aro(" + ')');
		}
	}
}
