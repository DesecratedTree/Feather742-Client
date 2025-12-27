package deob;

public class Class139 {

	public int[] anIntArray1534;

	public static short aShort1535;

	public Class139(int[] arg0) {
		int var2;
		for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
		}
		this.anIntArray1534 = new int[var2 + var2];
		int var3;
		for (var3 = 0; var3 < var2 + var2; var3++) {
			this.anIntArray1534[var3] = -1;
		}
		var3 = 0;
		while (var3 < arg0.length) {
			int var4;
			for (var4 = arg0[var3] & var2 - 1; this.anIntArray1534[var4 + 1 + var4] != -1; var4 = var4 + 1 & var2 - 1) {
			}
			this.anIntArray1534[var4 + var4] = arg0[var3];
			this.anIntArray1534[var4 + var4 + 1] = var3++;
		}
	}

	public int getArchiveFileId(int arg0, int arg1) {
		try {
			int var3 = (this.anIntArray1534.length >> 1) - 1;
			int var4 = arg0 & var3;
			while (true) {
				int var5 = this.anIntArray1534[var4 + var4 + 1];
				if (var5 == -1) {
					return -1;
				}
				if (this.anIntArray1534[var4 + var4] == arg0) {
					return var5;
				}
				var4 = var4 + 1 & var3;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fo.r(" + ')');
		}
	}

	public static final void method1608(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass99Array9259[var2].aBoolean909 ? 1 : 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fo.xs(" + ')');
		}
	}

	public static final void method1609(Class430 arg0, int arg1) {
		try {
			if (Class106.aClass330_Sub39_1009 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
				arg0.aClass330_Sub39_4395 = Class106.aClass330_Sub39_1009;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fo.yh(" + ')');
		}
	}

	public static final void method1610(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var3 == -1) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class370.aClass268_6770.method2659(var2, 1272082105).method3477((char) var3, -1625646287);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fo.adp(" + ')');
		}
	}

	public static final void method1611(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, 1776378129);
			client.aClass304_9030.method3032(-1899581580);
			Class435.method5568(2055925381);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fo.ajf(" + ')');
		}
	}

	public static final void method1612(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class435.anInt4424;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fo.aok(" + ')');
		}
	}

	public static Class120 method1613(int arg0, int[] arg1, Class120 arg2, boolean arg3, int arg4) {
		try {
			if (!Class330_Sub12_Sub9.aClass280_9534.method2777(arg0, (byte) -3)) {
				return null;
			}
			int var5 = Class330_Sub12_Sub9.aClass280_9534.method2763(arg0, -2079977606);
			IComponentDefinitions[] var6;
			if (var5 == 0) {
				var6 = new IComponentDefinitions[0];
			} else if (arg2 == null) {
				var6 = new IComponentDefinitions[var5];
			} else {
				var6 = arg2.aClass114Array1400;
			}
			if (arg2 == null) {
				arg2 = new Class120(arg3, var6);
			} else {
				arg2.aClass114Array1400 = var6;
				arg2.aBoolean1402 = arg3;
			}
			for (int var7 = 0; var7 < var5; var7++) {
				if (arg2.aClass114Array1400[var7] == null) {
					byte[] var8 = Class330_Sub12_Sub9.aClass280_9534.method2756(arg0, var7, arg1, -1664100359);
					if (var8 != null) {
						IComponentDefinitions var9 = arg2.aClass114Array1400[var7] = new IComponentDefinitions();
						var9.anInt1196 = var7 + (arg0 << 16);
						var9.method1387(new Buffer(var8), (byte) 28);
						if (arg0 == 506) {
							if (var9.aStringArray1284 != null) {
								var9.aStringArray1284[0] = "Select";
							}
						} else if (arg0 == 791 && var9.aStringArray1284 != null) {
							for (int var10 = 0; var10 < var9.aStringArray1284.length; var10++) {
								if (var9.aStringArray1284[var10].equals("Kill 'em all")) {
									var9.aStringArray1284[var10] = "Yes";
								} else if (var9.aStringArray1284[var10].equals("Ignore 5")) {
									var9.aStringArray1284[var10] = "No";
								}
							}
						}
					}
				}
			}
			return arg2;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "fo.s(" + ')');
		}
	}

	public static int[] method1614(int arg0, int arg1) {
		try {
			int[] var2 = new int[3];
			Class452.method5637(Class401.method4717(arg0, 2135510359));
			var2[0] = Class528.aCalendar6215.get(5);
			var2[1] = Class528.aCalendar6215.get(2);
			var2[2] = Class528.aCalendar6215.get(1);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fo.z(" + ')');
		}
	}

	public static final void method1615(Class430 arg0, short arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class2.aClass523_44.method6233(var2, 1930306781).anIntArray9661[var3];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fo.adh(" + ')');
		}
	}
}
