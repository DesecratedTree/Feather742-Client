package deob;

import java.awt.Image;

public class Class464_Sub18 extends Class464 {

	public static Image anImage8701;

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public Class464_Sub18(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5799(int arg0) {
		try {
			int var2 = this.aClass330_Sub50_5589.method3859(1285508377).method6029((byte) 7);
			if (var2 < 245) {
				this.anInt5587 = Class134.aClass134_1515.anInt1516;
			}
			if (Class134.aClass134_1513.anInt1516 == this.anInt5587 && var2 < 500) {
				this.anInt5587 = Class134.aClass134_1517.anInt1516;
			}
			if (this.anInt5587 < Class134.aClass134_1515.anInt1516 || this.anInt5587 > Class134.aClass134_1514.anInt1516) {
				this.anInt5587 = this.method5715(517067876);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afp.l(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			return Class134.aClass134_1515.anInt1516;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afp.r(" + ')');
		}
	}

	public boolean method5800(int arg0) {
		try {
			int var2 = this.aClass330_Sub50_5589.method3859(1575710877).method6029((byte) 7);
			return var2 >= 245;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afp.b(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			int var3 = this.aClass330_Sub50_5589.method3859(1009808499).method6029((byte) 7);
			if (var3 < 245) {
				return 3;
			} else if (Class134.aClass134_1513.anInt1516 == arg0 && var3 < 500) {
				return 3;
			} else {
				return 1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afp.j(" + ')');
		}
	}

	public int method5801(byte arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afp.k(" + ')');
		}
	}

	public int method5718() {
		return Class134.aClass134_1515.anInt1516 * -1961860223 * 683400321;
	}

	public int method5714(int arg0) {
		int var2 = this.aClass330_Sub50_5589.method3859(114810383).method6029((byte) 7);
		if (var2 < 245) {
			return 3;
		} else if (Class134.aClass134_1513.anInt1516 * -1961860223 * 683400321 == arg0 && var2 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	public Class464_Sub18(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afp.p(" + ')');
		}
	}

	public static void method5802(Class330_Sub44 arg0, byte arg1) {
		try {
			if (Class475_Sub5.method5958(client.anInt8995, 885477300)) {
				Class393.aClass397_Sub1_4067.method4673(arg0, (byte) 1);
			} else {
				arg0.method3714(-863715644);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afp.p(" + ')');
		}
	}
}
