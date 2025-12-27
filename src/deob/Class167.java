package deob;

public class Class167 {

	public long aLong1703 = -1L;

	public Class471 aClass471_1701 = new Class471();

	public static int anInt1704 = 1;

	public static int anInt1705 = 2;

	public static int anInt1706 = 1;

	public static int anInt1707 = 4;

	public long aLong1702;

	public Class167(Buffer arg0) {
		this.method2017(arg0, 1300969322);
	}

	public void method2017(Buffer arg0, int arg1) {
		try {
			this.aLong1702 = arg0.readLong(-321376315);
			this.aLong1703 = arg0.readLong(603441022);
			for (int var3 = arg0.readUnsignedByte(1416651188); var3 != 0; var3 = arg0.readUnsignedByte(419018896)) {
				Class330_Sub26 var4;
				if (var3 == 1) {
					var4 = new Class330_Sub26_Sub2(this);
				} else if (var3 == 4) {
					var4 = new Class330_Sub26_Sub3(this);
				} else if (var3 == 3) {
					var4 = new Class330_Sub26_Sub1(this);
				} else if (var3 == 2) {
					var4 = new Class330_Sub26_Sub4(this);
				} else {
					throw new RuntimeException("");
				}
				var4.method3388(arg0, 1871164005);
				this.aClass471_1701.method5878(var4, (short) 8192);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gv.r(" + ')');
		}
	}

	public void method2018(Class330_Sub39 arg0, int arg1) {
		try {
			if (arg0.aLong3341 != this.aLong1702 || arg0.aLong7762 != this.aLong1703) {
				throw new RuntimeException("");
			}
			for (Class330_Sub26 var3 = (Class330_Sub26) this.aClass471_1701.method5869(539664854); var3 != null; var3 = (Class330_Sub26) this.aClass471_1701.method5873((byte) -99)) {
				var3.method3389(arg0, -119734827);
			}
			arg0.aLong7762++;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gv.j(" + ')');
		}
	}

	public static final void method2019(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			ClientScript var3 = Class327.method3240(var2, (byte) 102);
			if (var3 == null) {
				throw new RuntimeException();
			}
			int[] var4 = new int[var3.anInt9676];
			Object[] var5 = new Object[var3.anInt9672];
			long[] var6 = new long[var3.anInt9671];
			int var7;
			for (var7 = 0; var7 < var3.anInt9678; var7++) {
				var4[var7] = arg0.anIntArray4387[var7 + (arg0.anInt4376 - var3.anInt9678)];
			}
			for (var7 = 0; var7 < var3.anInt9680; var7++) {
				var5[var7] = arg0.anObjectArray4386[arg0.anInt4378 - var3.anInt9680 + var7];
			}
			for (var7 = 0; var7 < var3.anInt9677; var7++) {
				var6[var7] = arg0.aLongArray4379[var7 + (arg0.anInt4380 - var3.anInt9677)];
			}
			arg0.anInt4376 -= var3.anInt9678;
			arg0.anInt4378 -= var3.anInt9680;
			arg0.anInt4380 -= var3.anInt9677;
			Class433 var9 = new Class433();
			var9.aClass330_Sub36_Sub8_4413 = arg0.aClass330_Sub36_Sub8_4393;
			var9.anInt4411 = arg0.anInt4397;
			var9.anIntArray4412 = arg0.anIntArray4388;
			var9.anObjectArray4410 = arg0.anObjectArray4375;
			var9.aLongArray4414 = arg0.aLongArray4372;
			if (arg0.anInt4371 >= arg0.aClass433Array4382.length) {
				throw new RuntimeException();
			}
			arg0.aClass433Array4382[++arg0.anInt4371 - 1] = var9;
			arg0.aClass330_Sub36_Sub8_4393 = var3;
			arg0.aClass445Array4383 = arg0.aClass330_Sub36_Sub8_4393.aClass445Array9670;
			arg0.anIntArray4394 = arg0.aClass330_Sub36_Sub8_4393.anIntArray9673;
			arg0.anInt4397 = -1;
			arg0.anIntArray4388 = var4;
			arg0.anObjectArray4375 = var5;
			arg0.aLongArray4372 = var6;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "gv.az(" + ')');
		}
	}

	public static final void method2020(Class430 arg0, short arg1) {
		try {
			Class166_Sub1.method1998((byte) 89);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gv.ahm(" + ')');
		}
	}

	public static final void method2021(Class430 arg0, int arg1) {
		try {
			int var2 = client.anIntArrayArrayArray9082[arg0.anIntArray4387[--arg0.anInt4376]].length >> 1;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gv.afy(" + ')');
		}
	}

	public static final void method2022(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			boolean var3 = arg0.anIntArray4387[--arg0.anInt4376] == 1;
			Class2.method393(var2, var3, -769212662);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class440.anInt4482;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gv.adk(" + ')');
		}
	}

	public static String method2023(Object[] arg0, int arg1, int arg2, byte arg3) {
		try {
			if (arg2 == 0) {
				return "";
			} else if (arg2 == 1) {
				CharSequence var10 = (CharSequence) arg0[arg1];
				return var10 == null ? "null" : var10.toString();
			} else {
				int var4 = arg1 + arg2;
				int var5 = 0;
				for (int var6 = arg1; var6 < var4; var6++) {
					CharSequence var7 = (CharSequence) arg0[var6];
					if (var7 == null) {
						var5 += 4;
					} else {
						var5 += var7.length();
					}
				}
				StringBuilder var11 = new StringBuilder(var5);
				for (int var12 = arg1; var12 < var4; var12++) {
					CharSequence var8 = (CharSequence) arg0[var12];
					if (var8 == null) {
						var11.append("null");
					} else {
						var11.append(var8);
					}
				}
				return var11.toString();
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "gv.j(" + ')');
		}
	}

	public static Class330_Sub36_Sub3 method2024(int arg0) {
		try {
			Class330_Sub36_Sub3 var1 = (Class330_Sub36_Sub3) Class330_Sub36_Sub3.aClass472_9625.method5884((byte) 73);
			if (var1 != null) {
				var1.method3252(-2102594038);
				var1.method3439((byte) -110);
				return var1;
			}
			if (arg0 != -848220559) {
			}
			do {
				var1 = (Class330_Sub36_Sub3) Class330_Sub36_Sub3.aClass472_9652.method5884((byte) 53);
				if (var1 == null) {
					return null;
				}
				if (var1.method3447((byte) 1) > Class312.method3111((byte) 47)) {
					return null;
				}
				var1.method3252(1574058307);
				var1.method3439((byte) -112);
			} while ((var1.aLong7734 & Long.MIN_VALUE) == 0L);
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "gv.i(" + ')');
		}
	}
}
