package deob;

public class Class337 {

	public int anInt3365 = -1;

	public int anInt3369 = -1;

	public Class344 aClass344_3368 = Class344.aClass344_6813;

	public int anInt3366 = -1;

	public int[] anIntArray3367;

	public void method3947(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-166017067);
				if (var3 == 0) {
					if (arg1 > -1197289649) {
					}
					return;
				}
				this.method3948(arg0, var3, -1071056791);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ob.r(" + ')');
		}
	}

	public void method3948(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt3365 = arg0.readUnsignedShort(512166737);
			} else if (arg1 == 2) {
				this.anIntArray3367 = new int[arg0.readUnsignedByte(1036720484)];
				for (int var4 = 0; var4 < this.anIntArray3367.length; var4++) {
					this.anIntArray3367[var4] = arg0.readUnsignedShort(1563351465);
				}
			} else if (arg1 == 3) {
				this.anInt3369 = arg0.readUnsignedByte(1565105694);
			} else if (arg1 == 4) {
				this.aClass344_3368 = (Class344) Class479.method6015(Class110.method1356(1932880863), arg0.readUnsignedByte(97519518), (byte) 31);
			} else if (arg1 == 5) {
				this.anInt3366 = arg0.readBigSmart(-1227765511);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ob.j(" + ')');
		}
	}

	public static final void method3949(Class430 arg0, int arg1) {
		try {
			arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ob.h(" + ')');
		}
	}

	public static final void method3950(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1323 = Class288.method2886(var4, arg2, 1640999832);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ob.mf(" + ')');
		}
	}

	public static final void method3951(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			client.anInt9215 = arg0.anIntArray4387[arg0.anInt4376];
			client.anInt9148 = arg0.anIntArray4387[arg0.anInt4376 + 1];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ob.afo(" + ')');
		}
	}

	public static final void method3952(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class108.method1343((byte) 32).method297((short) 4024);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ob.ajm(" + ')');
		}
	}

	public static final void method3953(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			int var3 = arg1.anIntArray4387[--arg1.anInt4376];
			int var4 = arg1.anIntArray4387[--arg1.anInt4376] - 1;
			int var5 = var4;
			if (arg0.anInt1238 != 6 && arg0.anInt1238 != 2) {
				throw new RuntimeException("");
			}
			Class551 var6 = Class158_Sub3.aClass553_8875.method6392(arg0.anInt1239, -150553249);
			if (arg0.aClass538_1362 == null) {
				arg0.aClass538_1362 = new Class538(var6, arg0.anInt1238 == 6);
			}
			arg0.aClass538_1362.aLong6242 = Class116.method1418(735911697);
			if (var6.aByteArray6306 != null) {
				if (var4 < 0 || var4 >= var6.aByteArray6306.length) {
					throw new RuntimeException("");
				}
				var5 = var6.aByteArray6306[var4];
			}
			if (var6.aShortArray6349 == null || var5 < 0 || var5 >= var6.aShortArray6349.length) {
				throw new RuntimeException("");
			}
			arg0.aClass538_1362.aShortArray6239[var5] = (short) var3;
			Class404.method4738(arg0, 1470484612);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ob.rr(" + ')');
		}
	}

	public static final void method3954(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class24.method485(var3, var4, arg0, (byte) 78);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ob.kq(" + ')');
		}
	}

	public static void method3955(int arg0, int arg1, int arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(18, (long) arg1 << 32 | (long) arg0);
			var3.method3444(1908091451);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ob.ap(" + ')');
		}
	}

	public static String method3956(int arg0, int arg1) {
		try {
			Class330_Sub43 var2 = (Class330_Sub43) Class442.aClass497_4489.method6094((long) arg0);
			if (var2 != null) {
				Class330_Sub31_Sub2 var3 = var2.aClass324_Sub1_7825.method3188(429349842);
				if (var3 != null) {
					double var4 = var2.aClass324_Sub1_7825.method3191(1225599839);
					if ((double) var3.method3423((byte) -70) <= var4 && (double) var3.method3425(-2125491368) >= var4) {
						return var3.method3424((byte) 0);
					}
				}
			}
			return null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ob.o(" + ')');
		}
	}

	public static final void method3957(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (Class354_Sub1.aClass497_7991 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				Class330 var3 = Class354_Sub1.aClass497_7991.method6094((long) var2);
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == null ? 0 : 1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ob.aep(" + ')');
		}
	}
}
