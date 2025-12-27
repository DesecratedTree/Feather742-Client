package deob;

public class Class341 {

	public Class367 aClass367_3395 = new Class367(64);

	public Class367 aClass367_3393 = new Class367(20);

	public IndexTable aClass280_3396;

	public IndexTable aClass280_3394;

	public static Class342 aClass342_3397;

	public Class341(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_3396 = arg3;
		this.aClass280_3394 = arg2;
		this.aClass280_3394.method2763(Class103.aClass103_942.anInt982, -2138473822);
	}

	public Class343 method3972(int arg0, byte arg1) {
		try {
			Class367 var4 = this.aClass367_3395;
			Class343 var3;
			synchronized (this.aClass367_3395) {
				var3 = (Class343) this.aClass367_3395.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_3394;
			byte[] var13;
			synchronized (this.aClass280_3394) {
				var13 = this.aClass280_3394.getFile(Class103.aClass103_942.anInt982, arg0);
			}
			var3 = new Class343();
			var3.aClass341_3406 = this;
			if (var13 != null) {
				var3.method3992(new Buffer(var13), -1942976432);
			}
			Class367 var12 = this.aClass367_3395;
			synchronized (this.aClass367_3395) {
				this.aClass367_3395.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "of.r(" + ')');
		}
	}

	public void method3973(byte arg0) {
		try {
			Class367 var2 = this.aClass367_3395;
			synchronized (this.aClass367_3395) {
				this.aClass367_3395.method4298((byte) 115);
			}
			var2 = this.aClass367_3393;
			synchronized (this.aClass367_3393) {
				this.aClass367_3393.method4298((byte) 119);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "of.j(" + ')');
		}
	}

	public void method3974(int arg0) {
		try {
			Class367 var2 = this.aClass367_3395;
			synchronized (this.aClass367_3395) {
				this.aClass367_3395.method4296(-242876545);
			}
			var2 = this.aClass367_3393;
			synchronized (this.aClass367_3393) {
				this.aClass367_3393.method4296(-1818798287);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "of.p(" + ')');
		}
	}

	public void method3975(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_3395;
			synchronized (this.aClass367_3395) {
				this.aClass367_3395.method4292(arg0, (byte) 56);
			}
			var3 = this.aClass367_3393;
			synchronized (this.aClass367_3393) {
				this.aClass367_3393.method4292(arg0, (byte) 98);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "of.i(" + ')');
		}
	}

	public static final void method3976(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1261 = Class288.method2886(var4, arg2, 1147081971);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "of.nr(" + ')');
		}
	}

	public static final void method3977(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class230.method2344(var2, (byte) 69);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "of.wm(" + ')');
		}
	}

	public static final void method3978(Class430 arg0, int arg1) {
		try {
			Class525.method6255(-232055034);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "of.ang(" + ')');
		}
	}

	public static void method3979(int[] arg0, int[] arg1, int arg2) {
		try {
			if (arg0 == null || arg1 == null) {
				Class458.anIntArray5565 = null;
				Class11.anIntArray167 = null;
				Class125.aByteArrayArrayArray1459 = null;
			} else {
				Class458.anIntArray5565 = arg0;
				Class11.anIntArray167 = new int[arg0.length];
				Class125.aByteArrayArrayArray1459 = new byte[arg0.length][][];
				for (int var3 = 0; var3 < Class458.anIntArray5565.length; var3++) {
					Class125.aByteArrayArrayArray1459[var3] = new byte[arg1[var3]][];
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "of.r(" + ')');
		}
	}

	public static final void method3980(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass330_Sub39_4395.aClass153Array7759[var2].anInt1631;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "of.yd(" + ')');
		}
	}

	public static final void method3981(Class430 arg0, byte arg1) {
		try {
			boolean var2 = arg0.anIntArray4387[--arg0.anInt4376] != 0;
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class451.method5631((long) var3, 0, var2, Class429.aClass454_4369, -1348038301);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "of.aan(" + ')');
		}
	}

	public static void method3982(Class_ra arg0, Class330_Sub38 arg1, Class372 arg2, int arg3) {
		try {
			Class61 var4 = arg2.method4326(arg0, -2045573393);
			if (var4 != null) {
				int var5 = var4.method681();
				if (var4.method682() > var5) {
					var5 = var4.method682();
				}
				byte var6 = 10;
				int var7 = arg1.anInt7754;
				int var8 = arg1.anInt7750;
				int var9 = 0;
				int var10 = 0;
				int var11 = 0;
				int var12;
				int var14;
				if (arg2.aString3909 != null) {
					var9 = Class543.aClass524_6254.method6244(arg2.aString3909, null, Class354_Sub1.aStringArray7988, null, 1400145808);
					for (var12 = 0; var12 < var9; var12++) {
						String var13 = Class354_Sub1.aStringArray7988[var12];
						if (var12 < var9 - 1) {
							var13 = var13.substring(0, var13.length() - 4);
						}
						var14 = Class362.aClass8_3799.method417(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}
					var11 = Class362.aClass8_3799.method420() * var9 + Class362.aClass8_3799.method415() / 2;
				}
				var12 = arg1.anInt7754 + var5 / 2;
				int var22 = arg1.anInt7750;
				if (var7 < Class354_Sub1.anInt3527 + var5) {
					var7 = Class354_Sub1.anInt3527;
					var12 = var10 / 2 + var6 + var5 / 2 + Class354_Sub1.anInt3527 + 5;
				} else if (var7 > Class354_Sub1.anInt3511 - var5) {
					var7 = Class354_Sub1.anInt3511 - var5;
					var12 = Class354_Sub1.anInt3511 - var5 / 2 - var6 - var10 / 2 - 5;
				}
				if (var8 < var5 + Class354_Sub1.anInt3528) {
					var8 = Class354_Sub1.anInt3528;
					var22 = var6 + Class354_Sub1.anInt3528 + var5 / 2;
				} else if (var8 > Class354_Sub1.anInt3530 - var5) {
					var8 = Class354_Sub1.anInt3530 - var5;
					var22 = Class354_Sub1.anInt3530 - var5 / 2 - var6 - var11;
				}
				var14 = (int) (Math.atan2((double) (var7 - arg1.anInt7754), (double) (var8 - arg1.anInt7750)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
				var4.method695((float) var7 + (float) var5 / 2.0F, (float) var5 / 2.0F + (float) var8, 4096, var14);
				int var15 = -2;
				int var16 = -2;
				int var17 = -2;
				int var18 = -2;
				if (arg2.aString3909 != null) {
					var15 = var12 - var10 / 2 - 5;
					var16 = var22;
					var17 = var15 + 10 + var10;
					var18 = var22 + Class362.aClass8_3799.method420() * var9 + 3;
					if (arg2.anInt3902 != 0) {
						arg0.method4789(var15, var22, var17 - var15, var18 - var22, arg2.anInt3902, 463754225);
					}
					if (arg2.anInt3882 != 0) {
						arg0.method4788(var15, var22, var17 - var15, var18 - var22, arg2.anInt3882, (byte) -58);
					}
					for (int var19 = 0; var19 < var9; var19++) {
						String var20 = Class354_Sub1.aStringArray7988[var19];
						if (var19 < var9 - 1) {
							var20 = var20.substring(0, var20.length() - 4);
						}
						Class362.aClass8_3799.method418(arg0, var20, var12, var22, arg2.anInt3903, true);
						var22 += Class362.aClass8_3799.method420();
					}
				}
				if (arg2.anInt3872 != -1 || arg2.aString3909 != null) {
					Class330_Sub7 var23 = new Class330_Sub7(arg1);
					var5 >>= 0x1;
					var23.anInt7546 = var7 - var5;
					var23.anInt7553 = var7 + var5;
					var23.anInt7548 = var8 - var5;
					var23.anInt7545 = var5 + var8;
					var23.anInt7549 = var15;
					var23.anInt7550 = var17;
					var23.anInt7551 = var16;
					var23.anInt7547 = var18;
					Class171.aClass471_1730.method5878(var23, (short) 8192);
				}
			}
		} catch (RuntimeException var21) {
			throw Class476.method5964(var21, "of.cb(" + ')');
		}
	}
}
