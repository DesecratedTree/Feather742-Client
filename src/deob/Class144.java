package deob;

public class Class144 {

	public static Class144 aClass144_1572 = new Class144(0, true);

	public static Class144 aClass144_1576 = new Class144(1, true);

	public static Class144 aClass144_1574 = new Class144(2, false);

	public int anInt1575;

	public boolean aBoolean1573;

	public static int anInt1577;

	public Class144(int arg0, boolean arg1) {
		this.anInt1575 = arg0;
		this.aBoolean1573 = arg1;
	}

	public static final void method1664(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fv.ak(" + ')');
		}
	}

	public static final void method1665(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1157612929);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class120.method1443(var3, var4, arg0, -2001973845);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fv.ks(" + ')');
		}
	}

	public static final void method1666(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class67.method795((char) var2, (short) 32271) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fv.aad(" + ')');
		}
	}

	public static int method1667(int arg0, int arg1, byte arg2) {
		try {
			int var3 = arg0 >> 31 & arg1 - 1;
			return var3 + (arg0 + (arg0 >>> 31)) % arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fv.n(" + ')');
		}
	}

	public static Class117 method1668(int arg0, byte arg1) {
		try {
			return arg0 >= 0 && arg0 < 100 ? Class119.aClass117Array1394[arg0] : null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fv.s(" + ')');
		}
	}

	public static final void method1669(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1400519055);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class138.method1604(var3, var4, arg0, -374277570);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fv.jr(" + ')');
		}
	}

	public static final int method1670(Class463 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		try {
			int var7 = 0;
			Buffer var8 = new Buffer(arg1);
			int var9 = -1;
			label75: do {
				label73: while (true) {
					int var10 = var8.method3767(1558443671);
					if (var10 == 0) {
						if (arg6 <= 1) {
						}
						return var7;
					}
					var9 += var10;
					int var11 = 0;
					boolean var12 = false;
					while (true) {
						int var13;
						while (!var12) {
							var13 = var8.readSmart(-2109338683);
							if (var13 == 0) {
								if (arg6 <= 1) {
								}
								continue label73;
							}
							var11 += var13 - 1;
							int var14 = var11 & 0x3F;
							int var15 = var11 >> 6 & 0x3F;
							int var16 = var8.readUnsignedByte(1396223744) >> 2;
							int var17 = arg2 + var15;
							int var18 = var14 + arg3;
							if (var17 > 0 && var18 > 0 && var17 < arg4 - 1 && var18 < arg5 - 1) {
								Class473 var19 = arg0.method5705(var9, (byte) -12);
								if (Class476.aClass476_6900.anInt6882 != var16 || Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) != 0 || var19.anInt5637 != 0 || var19.anInt5635 == 1 || var19.aBoolean5667) {
									if (!var19.method5896(715560437)) {
										var7++;
									}
									var12 = true;
								} else if (arg6 <= 1) {
								}
							}
						}
						var13 = var8.readSmart(-726812354);
						if (var13 == 0) {
							continue label75;
						}
						var8.readUnsignedByte(2133764591);
					}
				}
			} while (arg6 > 1);
			throw new IllegalStateException();
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "fv.ce(" + ')');
		}
	}

	public static final void method1671(int arg0, int arg1, int arg2, int arg3) {
		try {
			String var4 = "tele " + arg0 + Class215.aString2081 + (arg1 >> 6) + Class215.aString2081 + (arg2 >> 6) + Class215.aString2081 + (arg1 & 0x3F) + Class215.aString2081 + (arg2 & 0x3F);
			System.out.println(var4);
			Console.execute(var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fv.ha(" + ')');
		}
	}
}
