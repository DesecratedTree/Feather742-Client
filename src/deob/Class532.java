package deob;

public class Class532 implements Interface4 {

	public static Class78 aClass78_6455;

	public Interface6 method63(Class128 arg0, int arg1) {
		if (arg0 == Class128.aClass128_1477) {
			return client.players[arg1];
		}
		if (arg0 == Class128.aClass128_1475) {
			Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg1);
			if (var3 != null) {
				return (Interface6) var3.anObject7733;
			}
		}
		return null;
	}

	public Interface6 method62(Class128 arg0, int arg1) {
		if (arg0 == Class128.aClass128_1477) {
			return client.players[arg1];
		}
		if (arg0 == Class128.aClass128_1475) {
			Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg1);
			if (var3 != null) {
				return (Interface6) var3.anObject7733;
			}
		}
		return null;
	}

	public Interface6 method64(Class128 arg0, int arg1) {
		if (arg0 == Class128.aClass128_1477) {
			return client.players[arg1];
		}
		if (arg0 == Class128.aClass128_1475) {
			Class330_Sub35 var3 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg1);
			if (var3 != null) {
				return (Interface6) var3.anObject7733;
			}
		}
		return null;
	}

	public Interface6 method65(Class128 arg0, int arg1, byte arg2) {
		try {
			if (arg0 == Class128.aClass128_1477) {
				return client.players[arg1];
			}
			if (arg0 == Class128.aClass128_1475) {
				Class330_Sub35 var4 = (Class330_Sub35) client.aClass497_9014.method6094((long) arg1);
				if (var4 != null) {
					return (Interface6) var4.anObject7733;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "w.r(" + ')');
		}
	}

	public static boolean method6299(byte arg0) {
		try {
			boolean var1 = true;
			if (Class536.aClass87_6233 == null) {
				if (Class540.aClass280_6249.method2750(Class221.anInt6674, -1278095955)) {
					Class536.aClass87_6233 = Class53.method640(Class540.aClass280_6249, Class221.anInt6674);
				} else {
					var1 = false;
				}
			}
			if (Class18.aClass87_235 == null) {
				if (Class540.aClass280_6249.method2750(Class362.anInt3796, -1724500745)) {
					Class18.aClass87_235 = Class53.method640(Class540.aClass280_6249, Class362.anInt3796);
				} else {
					var1 = false;
				}
			}
			if (Class13.aClass87_174 == null) {
				if (Class540.aClass280_6249.method2750(Exception_Sub2.anInt14, -854415424)) {
					Class13.aClass87_174 = Class53.method640(Class540.aClass280_6249, Exception_Sub2.anInt14);
				} else {
					var1 = false;
				}
			}
			if (Class18.aClass524_236 == null) {
				if (Class484.aClass280_5822.method2750(Class95_Sub18.anInt7196, -1615231295)) {
					Class18.aClass524_236 = Class375.method4356(Class484.aClass280_5822, Class95_Sub18.anInt7196, -1641316415);
				} else {
					var1 = false;
				}
			}
			if (Class366.aClass87_Sub2Array3857 == null) {
				if (Class540.aClass280_6249.method2750(Class95_Sub18.anInt7196, -389649851)) {
					Class366.aClass87_Sub2Array3857 = (Class87_Sub2[]) Class53.method642(Class540.aClass280_6249, Class95_Sub18.anInt7196);
				} else {
					var1 = false;
				}
			}
			return var1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "w.j(" + ')');
		}
	}

	public static void openLink(String arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, int arg5) {
		try {
			if (arg0.contains("passwordchoice.ws")) {
				arg0 = "http://elveron.org/community/index.php?app=core&module=global&section=lostpass";
			}
			Class562.method6471(arg0, arg1, arg2, "openjs", arg3, arg4, (byte) 1);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "w.r(" + ')');
		}
	}

	public static final void method6301(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 0 || var2 >= client.anInt9261) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aClass75Array8982[var2].aString646;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "w.xp(" + ')');
		}
	}

	public static void method6302(byte arg0) {
		try {
			if (Class134.aClass258_1518 != null) {
				Class239.aClass240_2592 = new Class240();
				Class239.aClass240_2592.method2386(Class239.aLong2590, Class134.aClass258_1518.aClass526_2685.method6257(Class429.aClass454_4369, 991479434), Class134.aClass258_1518.anInt2706, Class134.aClass258_1518, 1495621861);
				Class330_Sub36_Sub14_Sub1.aThread10138 = new Thread(Class239.aClass240_2592, "");
				Class330_Sub36_Sub14_Sub1.aThread10138.start();
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "w.i(" + ')');
		}
	}

	public static final void method6303(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class513.aByte5966;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "w.wf(" + ')');
		}
	}
}
