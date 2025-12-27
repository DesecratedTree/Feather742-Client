package deob;

public class Class91 {

	public static int anInt818 = 16;

	public static int anInt820 = 8;

	public static int[] anIntArray821 = new int[] { 3, 7, 15 };

	public static int anInt822 = 32;

	public static int anInt823 = 8191;

	public static int anInt824 = 32;

	public static int anInt825 = 8;

	public static int anInt826 = 0;

	public static int anInt827 = 1;

	public static int anInt828 = 0;

	public static int anInt829 = 2;

	public static int anInt830 = 1023;

	public static int anInt831 = 2;

	public static int[] anIntArray819 = new int[] { 2047, 16383, 65535 };

	public Class91() throws Throwable {
		throw new Error();
	}

	public static final void method1065(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class439.method5599(var3, var4, true, 2, arg0, (byte) -38);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dr.hg(" + ')');
		}
	}

	public static final void method1066(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.anInt1647;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dr.xy(" + ')');
		}
	}

	public static final void method1067(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 & -1 - (0x1 << var3);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dr.zx(" + ')');
		}
	}

	public static final void method1068(Class430 arg0, int arg1) {
		try {
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-686621812) != Class136.aClass136_1523) {
				throw new RuntimeException();
			}
			Class166_Sub2 var2 = (Class166_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1707(1716458890);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) ((double) var2.method2007(-82091181) * 2607.5945876176133D) & 0x3FFF;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) ((double) var2.method2008(1614810815) * 2607.5945876176133D) & 0x3FFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dr.ahs(" + ')');
		}
	}

	public static final void method1069(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 6;
			arg0.anInt1321 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1243 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			arg0.anInt1296 = arg2.anIntArray4387[arg2.anInt4376 + 2];
			arg0.anInt1245 = arg2.anIntArray4387[arg2.anInt4376 + 3];
			arg0.anInt1248 = arg2.anIntArray4387[arg2.anInt4376 + 4];
			arg0.anInt1354 = arg2.anIntArray4387[arg2.anInt4376 + 5];
			Class404.method4738(arg0, 1606405371);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class330_Sub10.method3288(arg0.anInt1196, (byte) 1);
				Class149_Sub1.method1767(arg0.anInt1196, 654698132);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "dr.dp(" + ')');
		}
	}
}
