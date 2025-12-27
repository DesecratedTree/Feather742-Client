package deob;

public class Class512 {

	public int anInt5959 = 0;

	public int anInt5957 = 0;

	public int anInt5958 = 2048;

	public int anInt5956 = 2048;

	public void method6187(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-72560018);
				if (var3 == 0) {
					if (arg1 != -225890361) {
					}
					return;
				}
				this.method6188(arg0, var3, (byte) 4);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ve.r(" + ')');
		}
	}

	public void method6188(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.anInt5959 = arg0.readUnsignedByte(1226877042);
			} else if (arg1 == 2) {
				this.anInt5956 = arg0.readUnsignedShort(-375074735);
			} else if (arg1 == 3) {
				this.anInt5958 = arg0.readUnsignedShort(1251378150);
			} else if (arg1 == 4) {
				this.anInt5957 = arg0.readShort(-1100583751);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ve.j(" + ')');
		}
	}

	public static Class330_Sub28 method6189(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class330_Sub28[] var5 = Class330_Sub28.aClass330_Sub28Array7718;
			synchronized (Class330_Sub28.aClass330_Sub28Array7718) {
				if (Class330_Sub28.anInt7715 == 0) {
					return new Class330_Sub28(arg0, arg1, arg2, arg3);
				} else {
					Class330_Sub28.aClass330_Sub28Array7718[--Class330_Sub28.anInt7715].method3401(arg0, arg1, arg2, arg3, 1633883814);
					return Class330_Sub28.aClass330_Sub28Array7718[Class330_Sub28.anInt7715];
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ve.r(" + ')');
		}
	}

	public static final void method6190(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class337.method3953(var3, arg0, -245717078);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ve.rg(" + ')');
		}
	}

	public static void method6191(int arg0, int arg1, byte arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(12, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ve.ah(" + ')');
		}
	}

	public static void method6192(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
		try {
			if (arg0 < arg1) {
				int var7 = (arg0 + arg1) / 2;
				int var8 = arg0;
				Class401_Sub1 var9 = Class507.aClass401_Sub1Array5935[var7];
				Class507.aClass401_Sub1Array5935[var7] = Class507.aClass401_Sub1Array5935[arg1];
				Class507.aClass401_Sub1Array5935[arg1] = var9;
				for (int var10 = arg0; var10 < arg1; var10++) {
					if (Class143.method1661(Class507.aClass401_Sub1Array5935[var10], var9, arg2, arg3, arg4, arg5, (short) 5384) <= 0) {
						Class401_Sub1 var11 = Class507.aClass401_Sub1Array5935[var10];
						Class507.aClass401_Sub1Array5935[var10] = Class507.aClass401_Sub1Array5935[var8];
						Class507.aClass401_Sub1Array5935[var8++] = var11;
					}
				}
				Class507.aClass401_Sub1Array5935[arg1] = Class507.aClass401_Sub1Array5935[var8];
				Class507.aClass401_Sub1Array5935[var8] = var9;
				method6192(arg0, var8 - 1, arg2, arg3, arg4, arg5, 695721163);
				method6192(var8 + 1, arg1, arg2, arg3, arg4, arg5, -2025203205);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ve.n(" + ')');
		}
	}

	public static final void method6193(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1287;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ve.ql(" + ')');
		}
	}
}
