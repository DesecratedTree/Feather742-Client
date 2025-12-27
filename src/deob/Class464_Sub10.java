package deob;

import java.awt.Canvas;

public class Class464_Sub10 extends Class464 {

	public static int anInt8683 = 0;

	public static int anInt8684 = 2;

	public Class464_Sub10(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public Class464_Sub10(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5770(byte arg0) {
		try {
			if (this.anInt5587 < 0 || this.anInt5587 > 2) {
				this.anInt5587 = this.method5715(-1089154750);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afh.l(" + ')');
		}
	}

	public int method5718() {
		return 0;
	}

	public boolean method5771(int arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afh.b(" + ')');
		}
	}

	public int method5772(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afh.k(" + ')');
		}
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afh.p(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			return 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afh.r(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			return arg0 == 2 ? 2 : 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afh.j(" + ')');
		}
	}

	public int method5714(int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public static void method5773(Class_ra arg0, int arg1) {
		try {
			if (Class11.aClass471_166.method5875(199545075) != 0) {
				Class330_Sub4 var2;
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1224060363) == 0) {
					for (var2 = (Class330_Sub4) Class11.aClass471_166.method5869(539664854); var2 != null; var2 = (Class330_Sub4) Class11.aClass471_166.method5873((byte) -120)) {
						Class556.aClass510_6392.method6168(arg0, arg0, var2.anInt7515, var2.anInt7518, var2.anInt7517, var2.anInt7516, false, false, var2.anInt7519, Class125.aClass263_1454, var2.aBoolean7520 ? Class263_Sub2.myPlayer.aClass408_10240 : null, (short) 31681);
						var2.method3252(-198505217);
					}
					Class464.method5726(-981602160);
				} else {
					if (Class11.aClass_ra164 == null) {
						Canvas var4 = new Canvas();
						var4.setSize(36, 32);
						Class11.aClass_ra164 = Class95_Sub22.method1173(0, var4, Class230.anInterface_ma2446, Class117.aClass280_1387, 0, -1380432110);
						Class11.aClass263_165 = Class11.aClass_ra164.ce(Class461.method5699(Class484.aClass280_5822, Class125.anInt1451, 0, 1479980784), (Class87_Sub2[]) Class53.method641(Class540.aClass280_6249, Class125.anInt1451, 0), true);
					}
					for (var2 = (Class330_Sub4) Class11.aClass471_166.method5869(539664854); var2 != null; var2 = (Class330_Sub4) Class11.aClass471_166.method5873((byte) -81)) {
						Class556.aClass510_6392.method6168(Class11.aClass_ra164, arg0, var2.anInt7515, var2.anInt7518, var2.anInt7517, var2.anInt7516, false, false, var2.anInt7519, Class11.aClass263_165, var2.aBoolean7520 ? Class263_Sub2.myPlayer.aClass408_10240 : null, (short) 3966);
						var2.method3252(-1041039529);
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afh.j(" + ')');
		}
	}

	public static Class201 method5774(Buffer arg0, int arg1) {
		try {
			Class201_Sub2 var2 = (Class201_Sub2) Class137.method1602(arg0, (byte) 10);
			int var3 = arg0.readShort(-1100583751);
			return new Class201_Sub2_Sub1(var2.aClass195_6507, var2.aClass211_6502, var2.anInt6501, var2.anInt6504, var2.anInt6505, var2.anInt6503, var2.anInt6506, var2.anInt6508, var2.anInt6509, var2.anInt8938, var2.anInt8937, var2.anInt8939, var2.anInt8940, var2.anInt8941, var2.anInt8942, var3);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afh.n(" + ')');
		}
	}

	public static void method5775(int arg0, int arg1, int arg2) {
		try {
			Class95_Sub11.method1129(arg0, arg1, 1671399552);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afh.v(" + ')');
		}
	}

	public static Class147[] method5776(int arg0) {
		try {
			return new Class147[] { Class147.aClass147_1618, Class147.aClass147_1617, Class147.aClass147_1620 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "afh.r(" + ')');
		}
	}
}
