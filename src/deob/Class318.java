package deob;

public class Class318 {

	public int anInt3282;

	public int anInt3280;

	public int anInt3279;

	public int anInt3281;

	public String aString3283;

	public String method3153(int arg0) {
		try {
			return this.aString3283;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.o(" + ')');
		}
	}

	public int method3154(int arg0) {
		try {
			return this.anInt3282;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.r(" + ')');
		}
	}

	public int method3155(byte arg0) {
		try {
			return this.anInt3280;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.j(" + ')');
		}
	}

	public int method3156(int arg0) {
		try {
			return this.anInt3279;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.i(" + ')');
		}
	}

	public int method3157(byte arg0) {
		try {
			return this.anInt3281;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.p(" + ')');
		}
	}

	public Class318(int arg0, int arg1, int arg2, int arg3, String arg4) {
		this.anInt3282 = arg0;
		this.anInt3280 = arg1;
		this.anInt3279 = arg2;
		this.anInt3281 = arg3;
		this.aString3283 = arg4;
	}

	public static void method3158(int arg0) {
		try {
			Class367 var1 = Class408.aClass367_4202;
			synchronized (Class408.aClass367_4202) {
				Class408.aClass367_4202.method4298((byte) 24);
			}
			var1 = Class408.aClass367_4207;
			synchronized (Class408.aClass367_4207) {
				Class408.aClass367_4207.method4298((byte) 23);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nf.b(" + ')');
		}
	}

	public static final void method3159(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class195.method2138(var3, var4, arg0, 608192596);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "nf.ob(" + ')');
		}
	}

	public static final void method3160(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -918254695);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1210;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nf.re(" + ')');
		}
	}

	public static final void method3161(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 3;
			int var4 = arg2.anIntArray4387[arg2.anInt4376];
			short var5 = (short) arg2.anIntArray4387[arg2.anInt4376 + 1];
			short var6 = (short) arg2.anIntArray4387[arg2.anInt4376 + 2];
			if (var4 >= 0 && var4 < 5) {
				arg0.method1391(var4, var5, var6, (byte) 7);
				Class404.method4738(arg0, 1171831279);
				if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
					Class337.method3955(arg0.anInt1196, var4, 1716617386);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "nf.gw(" + ')');
		}
	}

	public static final void method3162(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 5;
			Class197.method2147(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], arg0.anIntArray4387[arg0.anInt4376 + 3], false, arg0.anIntArray4387[arg0.anInt4376 + 4], 351842924);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nf.tn(" + ')');
		}
	}

	public static final void method3163(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 0 || var2 >= client.anInt9261) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				Class75 var3 = client.aClass75Array8982[var2];
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString646;
				if (var3.aString647 == null) {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				} else {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString647;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nf.wi(" + ')');
		}
	}

	public static final void method3164(Class430 arg0, int arg1) {
		try {
			boolean var2 = true;
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (client.aBoolean9198) {
				try {
					Object var4 = Class232.aClass232_2459.method2355(new Object[] { var3 }, -1679720050);
					if (var4 != null) {
						var2 = (Boolean) var4;
					}
				} catch (Throwable var5) {
				}
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 ? 1 : 0;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nf.apk(" + ')');
		}
	}

	public static final void method3165(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 952779883);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1264;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nf.sk(" + ')');
		}
	}

	public static void method3166(boolean arg0, boolean arg1, int arg2) {
		try {
			if (arg0) {
				Console.anInt4262++;
				Class393.method4615(-945656868);
			}
			if (arg1) {
				Console.anInt4261++;
				Class402.createColorPallette((byte) 5);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nf.r(" + ')');
		}
	}
}
