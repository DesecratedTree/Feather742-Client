package deob;

public class Class163 {

	public IndexTable aClass280_1690;

	public IndexTable aClass280_1691;

	public Class152 aClass152_1692;

	public static String aString1693;

	public Interface7 method1919(Interface10 arg0, byte arg1) {
		try {
			if (arg0 == null) {
				return null;
			}
			Class198 var3 = arg0.method159((byte) 0);
			if (Class198.aClass198_1915 == var3) {
				return new Class168((Class200) arg0);
			} else if (var3 == Class198.aClass198_1918) {
				return new Class156(this.method1920((short) 11339), (Class214) arg0);
			} else if (var3 == Class198.aClass198_1920) {
				return new Class149(this.aClass280_1690, (Class204) arg0);
			} else if (var3 == Class198.aClass198_1916) {
				return new Class149_Sub1(this.aClass280_1690, (Class204_Sub1) arg0);
			} else if (var3 == Class198.aClass198_1919) {
				return new Class158_Sub1(this.aClass280_1690, this.aClass280_1691, (Class201_Sub3) arg0);
			} else if (var3 == Class198.aClass198_1922) {
				return new Class158_Sub2(this.aClass280_1690, this.aClass280_1691, (Class201_Sub1) arg0);
			} else if (var3 == Class198.aClass198_1917) {
				return new Class158_Sub3(this.aClass280_1690, this.aClass280_1691, (Class201_Sub2) arg0);
			} else if (var3 == Class198.aClass198_1921) {
				return new Class162(this.aClass280_1690, this.aClass280_1691, (Class205) arg0);
			} else if (Class198.aClass198_1914 == var3) {
				return new Class157(this.aClass280_1690, (Class212) arg0);
			} else if (var3 == Class198.aClass198_1923) {
				return new Class158_Sub3_Sub1(this.aClass280_1690, this.aClass280_1691, (Class201_Sub2_Sub1) arg0);
			} else {
				return null;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gr.r(" + ')');
		}
	}

	public Class152 method1920(short arg0) {
		try {
			if (this.aClass152_1692 == null) {
				this.aClass152_1692 = new Class152();
			}
			return this.aClass152_1692;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gr.j(" + ')');
		}
	}

	public Class163(IndexTable arg0, IndexTable arg1) {
		this.aClass280_1690 = arg0;
		this.aClass280_1691 = arg1;
	}

	public static void method1921(Class330_Sub42 arg0, int arg1, byte arg2) {
		try {
			Object[] var3 = arg0.anObjectArray7817;
			int var4 = (Integer) var3[0];
			ClientScript var5 = Class327.method3240(var4, (byte) 48);
			if (var5 != null) {
				Class430 var6 = Class325_Sub6.method3229((byte) 105);
				var6.anIntArray4388 = new int[var5.anInt9676];
				int var7 = 0;
				var6.anObjectArray4375 = new String[var5.anInt9672];
				int var8 = 0;
				var6.aLongArray4372 = new long[var5.anInt9671];
				int var9 = 0;
				for (int var10 = 1; var10 < var3.length; var10++) {
					if (var3[var10] instanceof Integer) {
						int var11 = (Integer) var3[var10];
						if (var11 == -2147483647) {
							var11 = arg0.anInt7807;
						}
						if (var11 == -2147483646) {
							var11 = arg0.anInt7811;
						}
						if (var11 == -2147483645) {
							var11 = arg0.aClass114_7809 == null ? -1 : arg0.aClass114_7809.anInt1196;
						}
						if (var11 == -2147483644) {
							var11 = arg0.anInt7812;
						}
						if (var11 == -2147483643) {
							var11 = arg0.aClass114_7809 == null ? -1 : arg0.aClass114_7809.anInt1287;
						}
						if (var11 == -2147483642) {
							var11 = arg0.aClass114_7813 == null ? -1 : arg0.aClass114_7813.anInt1196;
						}
						if (var11 == -2147483641) {
							var11 = arg0.aClass114_7813 == null ? -1 : arg0.aClass114_7813.anInt1287;
						}
						if (var11 == -2147483640) {
							var11 = arg0.anInt7814;
						}
						if (var11 == -2147483639) {
							var11 = arg0.anInt7815;
						}
						var6.anIntArray4388[var7++] = var11;
					} else if (var3[var10] instanceof String) {
						String var14 = (String) var3[var10];
						if (var14.equals("event_opbase")) {
							var14 = arg0.aString7816;
						}
						var6.anObjectArray4375[var8++] = var14;
					} else if (var3[var10] instanceof Long) {
						long var15 = (Long) var3[var10];
						var6.aLongArray4372[var9++] = var15;
					}
				}
				var6.anInt4377 = arg0.anInt7810;
				Class330_Sub12.method3302(var5, arg1, var6, -1350615529);
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "gr.s(" + ')');
		}
	}

	public static final void method1922(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.aBoolean1251 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gr.cu(" + ')');
		}
	}

	public static final void method1923(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class372 var3 = Class79.aClass380_666.method4387(var2, (byte) -4);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt3872;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gr.aoq(" + ')');
		}
	}

	public static final void method1924(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class146.method1737(var3, var4, arg0, -591748167);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gr.fa(" + ')');
		}
	}

	public static final void method1925(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Gfx.method789(var3, var4, arg0, 153316994);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gr.jb(" + ')');
		}
	}

	public static final void method1926(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1499078895);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class110.method1362(var3, var4, arg0, (byte) 93);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gr.lg(" + ')');
		}
	}
}
