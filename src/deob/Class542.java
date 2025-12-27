package deob;

public class Class542 {

	public static int anInt6251;

	public Interface10[] anInterface10Array6250;

	public Interface10 method6334(Buffer arg0, Class198 arg1, byte arg2) {
		try {
			if (arg1 == Class198.aClass198_1915) {
				return Class170.method2038(arg0, (short) -18889);
			} else if (Class198.aClass198_1919 == arg1) {
				return Class429.method5328(arg0, -2141656043);
			} else if (arg1 == Class198.aClass198_1918) {
				return Class507.method6154(arg0, 19415266);
			} else if (Class198.aClass198_1916 == arg1) {
				return Class69.method800(arg0, (byte) 11);
			} else if (Class198.aClass198_1920 == arg1) {
				return Class511.method6177(arg0, -1604289230);
			} else if (Class198.aClass198_1922 == arg1) {
				return Class13.method441(arg0, (byte) 1);
			} else if (arg1 == Class198.aClass198_1917) {
				return Class137.method1602(arg0, (byte) -51);
			} else if (arg1 == Class198.aClass198_1921) {
				return Class103.method1231(arg0, 2045966557);
			} else if (arg1 == Class198.aClass198_1914) {
				return Class418.method5274(arg0, 6422146);
			} else if (arg1 == Class198.aClass198_1923) {
				return Class464_Sub10.method5774(arg0, -664606417);
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wl.j(" + ')');
		}
	}

	public void method6335(Buffer arg0, int arg1) {
		try {
			this.anInterface10Array6250 = new Interface10[arg0.readUnsignedByte(451114767)];
			Class198[] var3 = Class477.method5991(-1197746030);
			for (int var4 = 0; var4 < this.anInterface10Array6250.length; var4++) {
				this.anInterface10Array6250[var4] = this.method6334(arg0, var3[arg0.readUnsignedByte(-300090015)], (byte) -1);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wl.r(" + ')');
		}
	}

	public static final void method6336(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 2;
			arg0.anInt1259 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1340 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			Class404.method4738(arg0, 501971637);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wl.iz(" + ')');
		}
	}

	public static final void method6337(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				Class99 var3 = client.aClass99Array9259[var2];
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString915;
				if (var3.aString910 == null) {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				} else {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.aString910;
				}
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wl.vo(" + ')');
		}
	}

	public static final void method6338(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 962911393);
			Class376.method4360(var3, arg0, (byte) 25);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wl.qi(" + ')');
		}
	}
}
