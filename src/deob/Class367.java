package deob;

public class Class367 {

	public Class472 aClass472_3860;

	public int anInt3859;

	public int anInt3862;

	public Class497 aClass497_3861;

	public static int anInt3864;

	public static String aString3863;

	public Class367(int arg0, int arg1) {
		this.aClass472_3860 = new Class472();
		this.anInt3859 = arg0;
		this.anInt3862 = arg0;
		int var3;
		for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
		}
		this.aClass497_3861 = new Class497(var3);
	}

	public Object method4287(int arg0) {
		try {
			Class330_Sub36_Sub14 var2 = (Class330_Sub36_Sub14) this.aClass497_3861.method6099((byte) -1);
			while (var2 != null) {
				Object var3 = var2.method3489(39876787);
				if (var3 != null) {
					return var3;
				}
				Class330_Sub36_Sub14 var4 = var2;
				var2 = (Class330_Sub36_Sub14) this.aClass497_3861.method6098((short) -32768);
				var4.method3252(-903786983);
				var4.method3439((byte) -40);
				this.anInt3862 += var4.anInt9718;
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ph.b(" + ')');
		}
	}

	public Object get(long arg0) {
		try {
			Class330_Sub36_Sub14 var3 = (Class330_Sub36_Sub14) this.aClass497_3861.method6094(arg0);
			if (var3 == null) {
				return null;
			}
			Object var4 = var3.method3489(160833472);
			if (var4 == null) {
				var3.method3252(-1310593850);
				var3.method3439((byte) -45);
				this.anInt3862 += var3.anInt9718;
				return null;
			}
			if (var3.method3490(-1650916970)) {
				Class330_Sub36_Sub14_Sub2 var5 = new Class330_Sub36_Sub14_Sub2(var4, var3.anInt9718);
				this.aClass497_3861.method6097(var5, var3.aLong3341);
				this.aClass472_3860.method5883(var5, -647674440);
				var5.aLong7734 = 0L;
				var3.method3252(-1080578218);
				var3.method3439((byte) -117);
			} else {
				this.aClass472_3860.method5883(var3, -2014311118);
				var3.aLong7734 = 0L;
			}
			return var4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ph.r(" + ')');
		}
	}

	public void method4289(long arg0) {
		try {
			Class330_Sub36_Sub14 var3 = (Class330_Sub36_Sub14) this.aClass497_3861.method6094(arg0);
			this.method4290(var3, (byte) 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ph.j(" + ')');
		}
	}

	public void method4290(Class330_Sub36_Sub14 arg0, byte arg1) {
		try {
			if (arg0 != null) {
				arg0.method3252(-941120784);
				arg0.method3439((byte) -13);
				this.anInt3862 += arg0.anInt9718;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ph.i(" + ')');
		}
	}

	public Object method4291(int arg0) {
		try {
			Class330_Sub36_Sub14 var2 = (Class330_Sub36_Sub14) this.aClass497_3861.method6098((short) -32768);
			while (var2 != null) {
				Object var3 = var2.method3489(1632710086);
				if (var3 != null) {
					return var3;
				}
				Class330_Sub36_Sub14 var4 = var2;
				var2 = (Class330_Sub36_Sub14) this.aClass497_3861.method6098((short) -32768);
				var4.method3252(-835515086);
				var4.method3439((byte) -10);
				this.anInt3862 += var4.anInt9718;
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ph.k(" + ')');
		}
	}

	public void method4292(int arg0, byte arg1) {
		try {
			for (Class330_Sub36_Sub14 var3 = (Class330_Sub36_Sub14) this.aClass472_3860.method5884((byte) 126); var3 != null; var3 = (Class330_Sub36_Sub14) this.aClass472_3860.method5886((short) 8192)) {
				if (var3.method3490(-1650916970)) {
					if (var3.method3489(1322009729) == null) {
						var3.method3252(-475970251);
						var3.method3439((byte) -30);
						this.anInt3862 += var3.anInt9718;
					}
				} else if (++var3.aLong7734 > (long) arg0) {
					Class330_Sub36_Sub14_Sub1 var4 = new Class330_Sub36_Sub14_Sub1(var3.method3489(1171863118), var3.anInt9718);
					this.aClass497_3861.method6097(var4, var3.aLong3341);
					Class215.method2239(var4, var3, -1953705961);
					var3.method3252(-1263088041);
					var3.method3439((byte) -39);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ph.s(" + ')');
		}
	}

	public Class367(int arg0) {
		this(arg0, arg0);
	}

	public int method4293(byte arg0) {
		try {
			return this.anInt3859;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.z(" + ')');
		}
	}

	public int method4294(int arg0) {
		try {
			return this.anInt3862;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.w(" + ')');
		}
	}

	public int method4295(int arg0) {
		try {
			int var2 = 0;
			for (Class330_Sub36_Sub14 var3 = (Class330_Sub36_Sub14) this.aClass472_3860.method5884((byte) 89); var3 != null; var3 = (Class330_Sub36_Sub14) this.aClass472_3860.method5886((short) 8192)) {
				if (!var3.method3490(-1650916970)) {
					var2++;
				}
			}
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ph.n(" + ')');
		}
	}

	public void method4296(int arg0) {
		try {
			for (Class330_Sub36_Sub14 var2 = (Class330_Sub36_Sub14) this.aClass472_3860.method5884((byte) 46); var2 != null; var2 = (Class330_Sub36_Sub14) this.aClass472_3860.method5886((short) 8192)) {
				if (var2.method3490(-1650916970)) {
					var2.method3252(-982780256);
					var2.method3439((byte) -46);
					this.anInt3862 += var2.anInt9718;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.l(" + ')');
		}
	}

	public void put(Object arg0, long arg1) {
		try {
			this.method4299(arg0, arg1, 1, (byte) -3);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ph.p(" + ')');
		}
	}

	public void method4298(byte arg0) {
		try {
			this.aClass472_3860.method5889(224403267);
			this.aClass497_3861.method6100(65280);
			this.anInt3862 = this.anInt3859;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.f(" + ')');
		}
	}

	public void method4299(Object arg0, long arg1, int arg2, byte arg3) {
		try {
			if (arg2 > this.anInt3859) {
				throw new IllegalStateException();
			}
			this.method4289(arg1);
			this.anInt3862 -= arg2;
			while (this.anInt3862 < 0) {
				Class330_Sub36_Sub14 var6 = (Class330_Sub36_Sub14) this.aClass472_3860.method5888(-1935111118);
				this.method4290(var6, (byte) 0);
			}
			Class330_Sub36_Sub14_Sub2 var8 = new Class330_Sub36_Sub14_Sub2(arg0, arg2);
			this.aClass497_3861.method6097(var8, arg1);
			this.aClass472_3860.method5883(var8, -1123220319);
			var8.aLong7734 = 0L;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ph.o(" + ')');
		}
	}

	public static final void method4300(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1176 = Class288.method2886(var4, arg2, 1825064044);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ph.os(" + ')');
		}
	}

	public static final void method4301(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aByte1635;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.xv(" + ')');
		}
	}

	public static final void method4302(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass432_Sub1_Sub1_Sub1_4396.anInt10068;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ph.aqy(" + ')');
		}
	}

	public static void method4303(int arg0) {
		try {
			if (client.anInt8995 == 15 && !Class434.method5564(-1749513897) && !Class509.method6165(47374417)) {
				Class227.method2311(11, -1188873169);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ph.b(" + ')');
		}
	}

	public static boolean method4304(int arg0) {
		try {
			return Class476.method5961(Class534.aClass412_6788.aClass365_4246, (short) 128);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ph.i(" + ')');
		}
	}
}
