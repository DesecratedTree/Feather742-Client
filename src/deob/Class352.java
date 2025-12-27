package deob;

public class Class352 {

	public static int anInt3482 = 0;

	public static int anInt3486;

	public Class352 aClass352_3483;

	public static Class352 aClass352_3485;

	public Class432_Sub1_Sub1 aClass432_Sub1_Sub1_3484;

	public void method4070(int arg0) {
		try {
			if (anInt3482 < 500) {
				this.aClass432_Sub1_Sub1_3484 = null;
				this.aClass352_3483 = aClass352_3485;
				aClass352_3485 = this;
				anInt3482++;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "or.j(" + ')');
		}
	}

	public static final void method4071(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = Class2.aClass523_44.method6233(var2, 1516842767).method3452(var3, -805639208).anInt4048;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "or.adc(" + ')');
		}
	}

	public static void method4072(String[] arg0, int arg1) {
		try {
			if (arg0.length > 1) {
				for (int var2 = 0; var2 < arg0.length; var2++) {
					if (arg0[var2].startsWith("pause")) {
						int var3 = 5;
						try {
							var3 = Integer.parseInt(arg0[var2].substring(6));
						} catch (Exception var5) {
						}
						Class56.panelBoxMessage("Pausing for " + var3 + " seconds...", 691120450);
						Class380.aStringArray3960 = arg0;
						Class5.anInt79 = var2 + 1;
						Class5.aLong74 = Class312.method3111((byte) 19) + (long) (var3 * 1000);
						break;
					}
					Class5.aString73 = arg0[var2];
					Class201.method2164(false, (byte) 10);
				}
			} else {
				Class5.aString73 = Class5.aString73 + arg0[0];
				Class5.anInt76 += arg0[0].length();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "or.f(" + ')');
		}
	}
}
