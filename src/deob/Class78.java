package deob;

public class Class78 {

	public static Class78 aClass78_658 = new Class78();

	public static Class78 aClass78_657 = new Class78();

	public static Class78 aClass78_656 = new Class78();

	public static void method931(Class330_Sub36_Sub10 arg0, int arg1) {
		try {
			if (!Class484.aBoolean5782) {
				arg0.method3252(-1347819975);
				Class484.anInt5786--;
				if (arg0.aBoolean9698) {
					for (Class330_Sub36_Sub13 var6 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 107); var6 != null; var6 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
						if (var6.aString9717.equals(arg0.aString9693)) {
							boolean var3 = false;
							for (Class330_Sub36_Sub10 var7 = (Class330_Sub36_Sub10) var6.aClass472_9716.method5884((byte) 81); var7 != null; var7 = (Class330_Sub36_Sub10) var6.aClass472_9716.method5886((short) 8192)) {
								if (arg0 == var7) {
									if (var6.method3487(arg0, (byte) -15)) {
										Class408.method4768(var6, -1067157786);
									}
									var3 = true;
									break;
								}
							}
							if (var3) {
								if (arg1 <= 1117283012) {
								}
								break;
							}
						}
					}
				} else {
					long var2 = arg0.aLong9695;
					Class330_Sub36_Sub13 var4;
					for (var4 = (Class330_Sub36_Sub13) Class484.aClass497_5803.method6094(var2); var4 != null; var4 = (Class330_Sub36_Sub13) Class484.aClass497_5803.method6095(2010926682)) {
						if (var4.aString9717.equals(arg0.aString9693)) {
							if (arg1 <= 1117283012) {
							}
							break;
						}
					}
					if (var4 != null && var4.method3487(arg0, (byte) 21)) {
						Class408.method4768(var4, -1067157786);
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dd.m(" + ')');
		}
	}

	public static boolean method932(int arg0) {
		try {
			return !CacheIndex.method1522(client.anInt8995, (byte) -93);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "dd.r(" + ')');
		}
	}

	public static final void method933(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -296583018);
			if (var4.method6321((byte) -28)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class110.aClass531_1163.method6296(var2, -228682338).method3464(var3, var4.aString6236, 192995208);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class110.aClass531_1163.method6296(var2, -868162886).method3466(var3, var4.anInt6235, -330090520);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dd.abu(" + ')');
		}
	}

	public static final void method934(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1300 = Class288.method2886(var4, arg2, 1723533590);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dd.mi(" + ')');
		}
	}

	public static final void method935(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class121.method1445(var3, var4, arg0, 1894885259);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dd.lu(" + ')');
		}
	}

	public static final void method936(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub23_7908.method5819(-1860043831);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dd.alh(" + ')');
		}
	}
}
