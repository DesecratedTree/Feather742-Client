package deob;

public class Class65 {

	public int anInt571;

	public Class497 aClass497_570;

	public int method780(int arg0, byte arg1) {
		try {
			Class330_Sub23 var3 = (Class330_Sub23) this.aClass497_570.method6094((long) arg0);
			if (var3 == null) {
				Class221 var4 = Class366_Sub4.aClass231_8007.method2346(arg0, -380087586);
				return var4.aChar6673 == 'i' ? 0 : -1;
			} else {
				return var3.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cq.i(" + ')');
		}
	}

	public void method781(int arg0, int arg1, short arg2) {
		try {
			if (this.aClass497_570 == null) {
				this.aClass497_570 = new Class497(this.anInt571);
			}
			Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_570.method6094((long) arg0);
			if (var4 == null) {
				var4 = new Class330_Sub23(arg1);
				this.aClass497_570.method6097(var4, (long) arg0);
			} else {
				var4.anInt7693 = arg1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cq.j(" + ')');
		}
	}

	public Class65(int arg0) {
		this.anInt571 = arg0;
	}

	public int method782(int arg0, byte arg1) {
		try {
			Class382 var3 = Class428.aClass370_4364.method4312(arg0, (byte) -104);
			int var4 = var3.anInt6675;
			int var5 = var3.anInt6677 == 31 ? -1 : (0x1 << var3.anInt6677 + 1) - 1;
			return (this.method780(var4, (byte) 59) & var5) >>> var3.anInt6676;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "cq.p(" + ')');
		}
	}

	public void method783(byte arg0) {
		try {
			if (this.aClass497_570 != null) {
				this.aClass497_570.method6100(65280);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "cq.r(" + ')');
		}
	}

	public static final void method784(IComponentDefinitions arg0, Class430 arg1, int arg2) {
		try {
			arg1.anInt4376 -= 2;
			int var3 = arg1.anIntArray4387[arg1.anInt4376] - 1;
			int var4 = arg1.anIntArray4387[arg1.anInt4376 + 1];
			if (var3 < 0 || var3 > 9) {
				throw new RuntimeException();
			}
			Class431.method5337(arg0, var3, var4, arg1, 1470577267);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cq.kh(" + ')');
		}
	}

	public static final void method785(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class499.method6117(var3, var4, arg0, (byte) -9);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "cq.me(" + ')');
		}
	}

	public static boolean foundPlayer(String arg0, int arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (int var2 = 0; var2 < client.anInt9261; var2++) {
				Class75 var3 = client.aClass75Array8982[var2];
				if (arg0.equalsIgnoreCase(var3.aString646)) {
					return true;
				}
				if (arg0.equalsIgnoreCase(var3.aString647)) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "cq.mx(" + ')');
		}
	}

	public static final void method787(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			StringBuilder var3 = new StringBuilder(var2.length());
			boolean var4 = false;
			for (int var5 = 0; var5 < var2.length(); var5++) {
				char var6 = var2.charAt(var5);
				if (var6 == '<') {
					var4 = true;
				} else if (var6 == '>') {
					var4 = false;
				} else if (!var4) {
					var3.append(var6);
				}
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var3.toString();
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "cq.aao(" + ')');
		}
	}
}
