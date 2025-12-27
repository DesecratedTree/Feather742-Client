package deob;

public class Class153 {

	public byte aByte1632;

	public int anInt1631;

	public static int anInt1634;

	public String aString1633;

	public static void method1791(int arg0, int arg1) {
		try {
			Class132.anInt1506 = arg0;
			Class367 var2 = Class408.aClass367_4207;
			synchronized (Class408.aClass367_4207) {
				Class408.aClass367_4207.method4298((byte) 104);
			}
			var2 = Class408.aClass367_4202;
			synchronized (Class408.aClass367_4202) {
				Class408.aClass367_4202.method4298((byte) 106);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gf.l(" + ')');
		}
	}

	public static final void method1792(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1288 = Class288.method2886(var4, arg2, 1134276852);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gf.nm(" + ')');
		}
	}

	public static void method1793(Class330_Sub36_Sub10 arg0, byte arg1) {
		try {
			if (arg0 != null) {
				Class484.aClass471_5791.method5878(arg0, (short) 8192);
				Class484.anInt5786++;
				Object var2 = null;
				Class330_Sub36_Sub13 var3;
				if (arg0.aBoolean9698 || "".equals(arg0.aString9693)) {
					var3 = new Class330_Sub36_Sub13(arg0.aString9693);
					Class484.anInt5790++;
				} else {
					long var4 = arg0.aLong9695;
					for (var3 = (Class330_Sub36_Sub13) Class484.aClass497_5803.method6094(var4); var3 != null; var3 = (Class330_Sub36_Sub13) Class484.aClass497_5803.method6095(490067088)) {
						if (var3.aString9717.equals(arg0.aString9693)) {
							if (arg1 <= 0) {
								return;
							}
							break;
						}
					}
					if (var3 == null) {
						var3 = (Class330_Sub36_Sub13) Class484.aClass367_5796.get(var4);
						if (var3 != null && !var3.aString9717.equals(arg0.aString9693)) {
							var3 = null;
						}
						if (var3 == null) {
							var3 = new Class330_Sub36_Sub13(arg0.aString9693);
						}
						Class484.aClass497_5803.method6097(var3, var4);
						Class484.anInt5790++;
					}
				}
				if (var3.method3486(arg0, -1669217168)) {
					Class408.method4768(var3, -1067157786);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gf.x(" + ')');
		}
	}

	public static final void method1794(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class10.method427(var2, var3, false, false, -1558641914);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gf.uc(" + ')');
		}
	}

	public static final void method1795(Class430 arg0, int arg1) {
		try {
			if (CacheIndex.aClass154_1450 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
				arg0.aClass154_4391 = CacheIndex.aClass154_1450;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gf.xj(" + ')');
		}
	}

	public static Class330_Sub36_Sub15 method1796(int arg0, Class137 arg1, Buffer arg2, int arg3) {
		try {
			if (Class137.aClass137_1530 == arg1) {
				return new Class330_Sub36_Sub15_Sub2(arg0, arg2);
			} else if (Class137.aClass137_1529 == arg1) {
				return new Class330_Sub36_Sub15_Sub1(arg0, arg2);
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gf.r(" + ')');
		}
	}
}
