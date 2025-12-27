package deob;

public abstract class Class76 {

	public static void method866(Class_ra arg0, IndexTable arg1, int arg2) {
		try {
			Class87[] var3 = Class53.method641(arg1, Class95_Sub8.anInt7158, 0);
			Class203.aClass61Array6791 = new Class61[var3.length];
			int var4;
			for (var4 = 0; var4 < var3.length; var4++) {
				Class203.aClass61Array6791[var4] = arg0.bw(var3[var4], true);
			}
			var3 = Class53.method641(arg1, Class212.anInt6532, 0);
			Class434.aClass61Array6559 = new Class61[var3.length];
			for (var4 = 0; var4 < var3.length; var4++) {
				Class434.aClass61Array6559[var4] = arg0.bw(var3[var4], true);
			}
			var3 = Class53.method641(arg1, OutputStream_Sub1.anInt12, 0);
			Class125.aClass61Array1457 = new Class61[var3.length];
			for (var4 = 0; var4 < var3.length; var4++) {
				Class125.aClass61Array1457[var4] = arg0.bw(var3[var4], true);
			}
			var3 = Class53.method641(arg1, Class508.anInt5945, 0);
			Class12.aClass61Array10077 = new Class61[var3.length];
			for (var4 = 0; var4 < var3.length; var4++) {
				Class12.aClass61Array10077[var4] = arg0.bw(var3[var4], true);
			}
			var3 = Class53.method641(arg1, Class367.anInt3864, 0);
			Class_v.aClass61Array7960 = new Class61[var3.length];
			byte var7 = 25;
			int var5;
			for (var5 = 0; var5 < var3.length; var5++) {
				var3[var5].method996(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
				Class_v.aClass61Array7960[var5] = arg0.bw(var3[var5], true);
			}
			var3 = Class53.method641(arg1, Class_ta.anInt5568, 0);
			Class507.aClass61Array5940 = new Class61[var3.length];
			for (var5 = 0; var5 < var3.length; var5++) {
				Class507.aClass61Array5940[var5] = arg0.bw(var3[var5], true);
			}
			var3 = Class53.method641(arg1, Class125.anInt1455, 0);
			Class76_Sub1.aClass61Array7097 = new Class61[var3.length];
			var7 = 12;
			for (var5 = 0; var5 < var3.length; var5++) {
				var3[var5].method996(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
				Class76_Sub1.aClass61Array7097[var5] = arg0.bw(var3[var5], true);
			}
			var3 = Class53.method641(arg1, Class220.anInt2186, 0);
			Class57.aClass61Array6599 = new Class61[var3.length];
			var7 = 12;
			for (var5 = 0; var5 < var3.length; var5++) {
				var3[var5].method996(-var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D), -var7 + (int) (Math.random() * (double) var7 * 2.0D));
				Class57.aClass61Array6599[var5] = arg0.bw(var3[var5], true);
			}
			Class116.aClass61_1376 = arg0.bw(Class53.method643(arg1, Class125.anInt1456, 0), true);
			Class271.aClass61_2757 = arg0.bw(Class53.method643(arg1, Class101.anInt6457, 0), true);
			var3 = Class53.method641(arg1, Class537.anInt6238, 0);
			Class231.aClass61Array6766 = new Class61[var3.length];
			for (var5 = 0; var5 < var3.length; var5++) {
				Class231.aClass61Array6766[var5] = arg0.bw(var3[var5], true);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "db.f(" + ')');
		}
	}

	public static void method867(Class120 arg0, IComponentDefinitions arg1, int arg2) {
		try {
			if (arg1 != null) {
				int var4;
				if (arg1.anInt1287 == -1) {
					IComponentDefinitions[] var7 = arg0.method1441(889022062);
					for (var4 = 0; var4 < var7.length; var4++) {
						if (arg1 == var7[var4]) {
							if (arg2 >= 16711935) {
							}
							break;
						}
					}
					if (var4 < var7.length) {
						Class453.method5641(var7, 0, var7, 1, var4);
						var7[0] = arg1;
					}
				} else {
					IComponentDefinitions var3 = arg0.aClass114Array1400[arg1.anInt1211 & 0xFFFF];
					if (var3 != null) {
						if (var3.aClass114Array1347 == var3.aClass114Array1219) {
							var3.aClass114Array1219 = new IComponentDefinitions[var3.aClass114Array1347.length];
							var3.aClass114Array1219[0] = arg1;
							Class453.method5641(var3.aClass114Array1347, 0, var3.aClass114Array1219, 1, arg1.anInt1287);
							Class453.method5641(var3.aClass114Array1347, arg1.anInt1287 + 1, var3.aClass114Array1219, arg1.anInt1287 + 1, var3.aClass114Array1347.length - arg1.anInt1287 - 1);
						} else {
							var4 = 0;
							IComponentDefinitions[] var5 = var3.aClass114Array1219;
							while (var4 < var5.length) {
								if (var5[var4] == arg1) {
									if (arg2 >= 16711935) {
										throw new IllegalStateException();
									}
									break;
								}
								var4++;
							}
							if (var4 < var5.length) {
								Class453.method5641(var5, 0, var5, 1, var4);
								var5[0] = arg1;
							}
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "db.x(" + ')');
		}
	}

	public static final void method868(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1131309815);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class20.method467(var3, var4, arg0, (byte) 68);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "db.ju(" + ')');
		}
	}

	public static final void method869(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1077289156);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1209;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "db.rd(" + ')');
		}
	}

	public static final void method870(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub4 var3 = Class2.aClass523_44.method6233(var2, 1876775533);
			if (var3.anIntArray9661 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anIntArray9661.length;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "db.adr(" + ')');
		}
	}

	public static final void method871(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, 80503668);
			Class22.method473((byte) 73);
			client.aClass304_9030.method3008(1829482511).method4582(1284915251);
			Class435.method5568(1140387205);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "db.ake(" + ')');
		}
	}

	public static final void method872(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class432_Sub1_Sub5_Sub1.method5547(2109592419).method297((short) 7361);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "db.ajn(" + ')');
		}
	}

	public abstract int method855();

	public abstract int method856();

	public abstract int method857();

	public abstract void method179();

	public abstract boolean method174();

	public abstract void method180();

	public abstract int method858();

	public abstract int method859();

	public abstract int method860();

	public abstract boolean method176();

	public abstract int method861();

	public abstract boolean method862();

	public abstract boolean method182();

	public abstract boolean method178();

	public abstract boolean method863();

	public abstract int method864();

	public abstract void method185();

	public abstract void method183();

	public abstract void method181();

	public abstract boolean method865();
}
