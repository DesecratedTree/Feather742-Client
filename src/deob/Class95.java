package deob;

public abstract class Class95 {

	public int anInt851;

	public void method1096(int arg0) {
	}

	public boolean method1097(int arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dw.p(" + ')');
		}
	}

	public Class95(Buffer arg0) {
		this.anInt851 = arg0.readUnsignedShort(1646851144);
	}

	public static IComponentDefinitions method1101(int arg0, int arg1) {
		try {
			int var2 = arg0 >> 16;
			if (Class3.aClass120Array56[var2] == null || Class3.aClass120Array56[var2].method1440(arg0, (byte) -8) == null) {
				boolean var3 = Class397_Sub1.method4681(var2, null, -2075253874);
				if (!var3) {
					return null;
				}
			}
			return Class3.aClass120Array56[var2].method1440(arg0, (byte) 15);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dw.j(" + ')');
		}
	}

	public static final void method1102(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var3 < 0 || var3 >= arg0.anIntArray4373[var2]) {
				throw new RuntimeException();
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.anIntArrayArray4374[var2][var3];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dw.am(" + ')');
		}
	}

	public static final void method1103(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class439.method5599(var3, var4, true, 1, arg0, (byte) 69);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dw.hp(" + ')');
		}
	}

	public static final void method1104(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub1.method3442(var2, 51521806);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dw.aet(" + ')');
		}
	}

	public static void method1105(int arg0, int arg1, byte arg2) {
		try {
			Class330_Sub36_Sub3 var3 = Class464_Sub4.method5750(17, (long) arg0);
			var3.method3445((byte) 0);
			var3.anInt9629 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dw.ae(" + ')');
		}
	}

	public static final boolean method1106(char arg0, byte arg1) {
		try {
			if (Character.isISOControl(arg0)) {
				return false;
			} else if (Class263.method2614(arg0, -1633725316)) {
				return true;
			} else {
				char[] var2 = Class554.aCharArray6377;
				int var3;
				char var4;
				for (var3 = 0; var3 < var2.length; var3++) {
					var4 = var2[var3];
					if (arg0 == var4) {
						return true;
					}
				}
				var2 = Class554.aCharArray6374;
				for (var3 = 0; var3 < var2.length; var3++) {
					var4 = var2[var3];
					if (arg0 == var4) {
						return true;
					}
				}
				return false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dw.j(" + ')');
		}
	}

	public abstract void method1095(int arg0);

	public abstract void method1098();

	public abstract void method1099();

	public abstract void method1100();
}
