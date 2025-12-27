package deob;

public class Class281 {

	public static int anInt2909 = 8;

	public static int anInt2910 = 2;

	public static int anInt2911 = 2;

	public static int anInt2912 = 1;

	public static int anInt2913 = 4;

	public static int anInt2915 = 2;

	public static int anInt2917 = 16;

	public byte[][][] aByteArrayArrayArray2916;

	public static int anInt2914;

	public static int anInt2918;

	public boolean method2784(int arg0, int arg1, byte arg2) {
		try {
			if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray2916[3].length && arg1 < this.aByteArrayArrayArray2916[3][arg0].length) {
				return (this.aByteArrayArrayArray2916[3][arg0][arg1] & 0x2) != 0;
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ls.j(" + ')');
		}
	}

	public void method2785(byte arg0) {
		try {
			for (int var2 = 0; var2 < this.aByteArrayArrayArray2916.length; var2++) {
				for (int var3 = 0; var3 < this.aByteArrayArrayArray2916[0].length; var3++) {
					for (int var4 = 0; var4 < this.aByteArrayArrayArray2916[0][0].length; var4++) {
						this.aByteArrayArrayArray2916[var2][var3][var4] = 0;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ls.r(" + ')');
		}
	}

	public boolean method2786(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			if ((this.aByteArrayArrayArray2916[0][arg2][arg3] & 0x2) != 0) {
				return true;
			} else if ((this.aByteArrayArrayArray2916[arg1][arg2][arg3] & 0x10) == 0) {
				return this.method2787(arg1, arg2, arg3, -1692997948) == arg0;
			} else {
				return false;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ls.p(" + ')');
		}
	}

	public int method2787(int arg0, int arg1, int arg2, int arg3) {
		try {
			if ((this.aByteArrayArrayArray2916[arg0][arg1][arg2] & 0x8) == 0) {
				return arg0 <= 0 || (this.aByteArrayArrayArray2916[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ls.o(" + ')');
		}
	}

	public boolean method2788(int arg0, int arg1, byte arg2) {
		try {
			if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray2916[1].length && arg1 < this.aByteArrayArrayArray2916[1][arg0].length) {
				return (this.aByteArrayArrayArray2916[1][arg0][arg1] & 0x2) != 0;
			} else {
				return false;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ls.i(" + ')');
		}
	}

	public Class281(int arg0, int arg1, int arg2) {
		this.aByteArrayArrayArray2916 = new byte[arg0][arg1][arg2];
	}

	public static final void method2789(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.anInt1354 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 406237489);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class330_Sub10.method3288(arg0.anInt1196, (byte) 1);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ls.fi(" + ')');
		}
	}

	public static final void method2790(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			int var4 = -1;
			int var5 = -1;
			Class122 var6 = var3.method1396(Class361.aClass_ra3793, (byte) -81);
			if (var6 != null) {
				var4 = var6.anInt1407;
				var5 = var6.anInt1405;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ls.qp(" + ')');
		}
	}

	public static final void method2791(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			Class208.method2205(arg0, arg1, arg2, 0, arg3, false, 1536669850);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ls.jb(" + ')');
		}
	}

	public static void method2792(int arg0, int arg1) {
		try {
			if (!ClientLoader.LOBBY_ENABLED || Class360.anInt3791 == 108) {
				Class360.anInt3781 = arg0;
			} else if (ClientLoader.LOBBY_ENABLED && Class360.anInt3791 == 288) {
				Class360.anInt3775 = arg0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ls.y(" + ')');
		}
	}
}
