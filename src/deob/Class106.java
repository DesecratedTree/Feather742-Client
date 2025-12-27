package deob;

import java.io.IOException;

public class Class106 {

	public static int anInt1001 = 1;

	public static int anInt1002 = 2;

	public static int anInt1003 = 0;

	public Class305 aClass305_1004 = null;

	public int anInt1008 = 0;

	public IndexTable aClass280_1000;

	public int anInt1007;

	public Class330_Sub40_Sub2 aClass330_Sub40_Sub2_1006;

	public static Class330_Sub39 aClass330_Sub39_1009;

	public Class330_Sub6 aClass330_Sub6_1005;

	public Class106(IndexTable arg0, int arg1) {
		this.aClass280_1000 = arg0;
		this.anInt1007 = arg1;
		this.aClass330_Sub40_Sub2_1006 = new Class330_Sub40_Sub2();
		this.aClass330_Sub40_Sub2_1006.method3596(9, 128, -1706195171);
	}

	public Class330_Sub40_Sub2 method1316(int arg0) {
		try {
			return this.aClass330_Sub40_Sub2_1006;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.r(" + ')');
		}
	}

	public boolean method1317(int arg0) {
		try {
			Class121.method1448((byte) -43);
			if (this.anInt1008 == 0) {
				this.aClass330_Sub6_1005 = Class330_Sub6.getFile(this.aClass280_1000, this.anInt1007, 0);
				if (this.aClass330_Sub6_1005 == null) {
					return false;
				}
				this.aClass305_1004 = new Class305(Class110.aClass280_1154, Class110.aClass280_1153);
				this.anInt1008 = 1;
			}
			if (this.anInt1008 == 1) {
				if (!this.aClass330_Sub40_Sub2_1006.method3615(this.aClass330_Sub6_1005, Class110.aClass280_1160, this.aClass305_1004, 22050, (short) 4394)) {
					return false;
				}
				this.anInt1008 = 2;
			}
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.i(" + ')');
		}
	}

	public boolean method1318(int arg0) {
		try {
			return this.anInt1008 == 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.p(" + ')');
		}
	}

	public Class330_Sub6 method1319(int arg0) {
		try {
			return this.aClass330_Sub6_1005;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.j(" + ')');
		}
	}

	public static void method1320(int arg0) {
		try {
			Class360.password = "";
			Class360.username = "";
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "eh.k(" + ')');
		}
	}

	public static final void method1321(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			Class336.method3944(Class263_Sub2.myPlayer, arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], 1491184698);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.sw(" + ')');
		}
	}

	public static Class330_Sub50 method1322(byte arg0) {
		try {
			Class490 var1 = null;
			Class330_Sub50 var2 = new Class330_Sub50(client.aClass435_9146, 0);
			try {
				var1 = Preferences.loadPreferences("", client.aClass435_9146.aString4422, false, 1838828905);
				byte[] var3 = new byte[(int) var1.method6066(1742373643)];
				int var4;
				for (int var5 = 0; var5 < var3.length; var5 += var4) {
					var4 = var1.method6067(var3, var5, var3.length - var5, (byte) 26);
					if (var4 == -1) {
						throw new IOException();
					}
				}
				var2 = new Class330_Sub50(new Buffer(var3), client.aClass435_9146, 0);
			} catch (Exception var7) {
			}
			try {
				if (var1 != null) {
					var1.method6064(-1999184267);
				}
			} catch (Exception var6) {
			}
			return var2;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "eh.r(" + ')');
		}
	}

	public static Class460[] method1323(int arg0) {
		try {
			return new Class460[] { Class460.aClass460_6847, Class460.aClass460_6853, Class460.aClass460_6849, Class460.aClass460_6845, Class460.aClass460_6846, Class460.aClass460_6854, Class460.aClass460_6850, Class460.aClass460_6848, Class460.aClass460_6851, Class460.aClass460_6852 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "eh.r(" + ')');
		}
	}

	public static final void method1324(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = arg0.aClass154_4391.aStringArray1657[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.xx(" + ')');
		}
	}

	public static int method1325(byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			int var4 = -1;
			for (int var5 = arg1; var5 < arg2; var5++) {
				var4 = var4 >>> 8 ^ Buffer.anIntArray7845[(var4 ^ arg0[var5]) & 0xFF];
			}
			return ~var4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "eh.r(" + ')');
		}
	}

	public static final void method1326(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub5_7890.method5753((byte) -33) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "eh.aqu(" + ')');
		}
	}

	public static final void method1327(Class430 arg0, int arg1) {
		try {
			IComponentDefinitions var2 = Class95.method1101(arg0.anIntArray4387[--arg0.anInt4376], 1925508587);
			if (var2.aClass114Array1347 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				int var3 = var2.aClass114Array1347.length;
				for (int var4 = 0; var4 < var2.aClass114Array1347.length; var4++) {
					if (var2.aClass114Array1347[var4] == null) {
						var3 = var4;
						break;
					}
				}
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "eh.sn(" + ')');
		}
	}
}
