package deob;

public class Class435 {

	public static Class435 aClass435_4421 = new Class435("elveron", "Elveron", 0);

	public static Class435 aClass435_4416 = new Class435("stellardawn", "Stellar Dawn", 1);

	public static Class435 aClass435_4420 = new Class435("game3", "Game 3", 2);

	public static Class435 aClass435_4418 = new Class435("game4", "Game 4", 3);

	public static Class435 aClass435_4419 = new Class435("game5", "Game 5", 4);

	public String aString4422;

	public String aString4415;

	public int anInt4417;

	public static int anInt4423;

	public static int anInt4424;

	public Class435(String arg0, String arg1, int arg2) {
		this.aString4422 = arg0;
		this.aString4415 = arg1;
		this.anInt4417 = arg2;
	}

	public static void method5568(int arg0) {
		try {
			Class490 var1 = null;
			try {
				var1 = Preferences.loadPreferences("", client.aClass435_9146.aString4422, true, 982021375);
				Buffer var2 = Class448.aClass330_Sub50_5555.method3861(628966525);
				var1.method6068(var2.payload, 0, var2.offset, -1154489731);
			} catch (Exception var4) {
			}
			try {
				if (var1 != null) {
					var1.method6064(-1943010853);
				}
			} catch (Exception var3) {
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sa.j(" + ')');
		}
	}

	public static void method5569(Class430 arg0, int arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[--arg0.anInt4376], -1795220039).aString4091;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sa.j(" + ')');
		}
	}
}
