package deob;

public class Class201 implements Interface10 {

	public Class195 aClass195_6507;

	public Class211 aClass211_6502;

	public int anInt6501;

	public int anInt6504;

	public int anInt6505;

	public int anInt6503;

	public int anInt6506;

	public int anInt6508;

	public int anInt6509;

	public static Class436 aClass436_6511;

	public static Class463 aClass463_6510;

	public Class198 method159(byte arg0) {
		try {
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "il.j(" + ')');
		}
	}

	public Class198 method160() {
		return null;
	}

	public Class201(Class195 arg0, Class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.aClass195_6507 = arg0;
		this.aClass211_6502 = arg1;
		this.anInt6501 = arg2;
		this.anInt6504 = arg3;
		this.anInt6505 = arg4;
		this.anInt6503 = arg5;
		this.anInt6506 = arg6;
		this.anInt6508 = arg7;
		this.anInt6509 = arg8;
	}

	public Class198 method161() {
		return null;
	}

	public static void method2162(String[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < arg3) {
				int var5 = (arg3 + arg2) / 2;
				int var6 = arg2;
				String var7 = arg0[var5];
				arg0[var5] = arg0[arg3];
				arg0[arg3] = var7;
				short var8 = arg1[var5];
				arg1[var5] = arg1[arg3];
				arg1[arg3] = var8;
				for (int var9 = arg2; var9 < arg3; var9++) {
					if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
						String var10 = arg0[var9];
						arg0[var9] = arg0[var6];
						arg0[var6] = var10;
						short var11 = arg1[var9];
						arg1[var9] = arg1[var6];
						arg1[var6++] = var11;
					}
				}
				arg0[arg3] = arg0[var6];
				arg0[var6] = var7;
				arg1[arg3] = arg1[var6];
				arg1[var6] = var8;
				method2162(arg0, arg1, arg2, var6 - 1, 568290200);
				method2162(arg0, arg1, var6 + 1, arg3, -1045454460);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "il.j(" + ')');
		}
	}

	public static final void method2163(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874, arg0.anIntArray4387[--arg0.anInt4376], -1584894524);
			Class171.method2046(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1155813826), false, -1681519333);
			Class435.method5568(1758556281);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "il.akc(" + ')');
		}
	}

	public static void method2164(boolean arg0, byte arg1) {
		try {
			Class5.aString73 = Class5.aString73.trim();
			if (Class5.aString73.length() != 0) {
				Class56.panelBoxMessage("--> " + Class5.aString73, -1622987561);
				Console.execute(Class5.aString73);
				Class5.anInt72 = 0;
				if (arg0) {
					Class5.anInt76 = Class5.aString73.length();
				} else {
					Class5.anInt76 = 0;
					Class5.aString73 = "";
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "il.l(" + ')');
		}
	}

	public static final void method2165(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1625237497);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class478.method6009(var3, var4, arg0, 178880377);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "il.eu(" + ')');
		}
	}
}
