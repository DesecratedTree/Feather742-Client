package deob;

public class Class522 {

	public boolean aBoolean6018 = false;

	public int anInt6019;

	public int anInt6020;

	public Class552 aClass552_6021;

	public void method6226(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.anInt6019 = arg0.readBigSmart(-1963212209);
			} else if (arg1 == 2) {
				this.anInt6020 = arg0.readUnsignedTriByte(-1401356047);
			} else if (arg1 == 3) {
				this.aBoolean6018 = true;
			} else if (arg1 == 4) {
				this.anInt6019 = -1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vo.j(" + ')');
		}
	}

	public Class61 method6227(Class_ra arg0, int arg1, boolean arg2, byte arg3) {
		try {
			long var5 = (long) (this.anInt6019 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt4226 << 19);
			Class61 var7 = (Class61) this.aClass552_6021.aClass367_6363.get(var5);
			if (var7 != null) {
				return var7;
			} else if (this.aClass552_6021.aClass280_6358.method2750(this.anInt6019, -1940970232)) {
				Class87 var8 = Class53.method643(this.aClass552_6021.aClass280_6358, this.anInt6019, 0);
				if (var8 != null) {
					var8.method992();
					if (arg2) {
						var8.method999();
					}
					for (int var9 = 0; var9 < arg1; var9++) {
						var8.method1000();
					}
				}
				var7 = arg0.bw(var8, true);
				if (var7 != null) {
					this.aClass552_6021.aClass367_6363.put(var7, var5);
				}
				return var7;
			} else {
				return null;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "vo.i(" + ')');
		}
	}

	public void method6228(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-235083345);
				if (var3 == 0) {
					if (arg1 != 185624338) {
					}
					return;
				}
				this.method6226(arg0, var3, (byte) 10);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vo.r(" + ')');
		}
	}

	public boolean method6229(int arg0) {
		try {
			return this.aClass552_6021.aClass280_6358.method2750(this.anInt6019, 795135034);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vo.p(" + ')');
		}
	}

	public static boolean method6230(int arg0, int arg1) {
		try {
			return arg0 == 6 || arg0 == 5 || arg0 == 3 || arg0 == 18 || arg0 == 14 || arg0 == 8 || arg0 == 17;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vo.fo(" + ')');
		}
	}

	public static final void method6231(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class537 var4 = Class301.aClass543_3059.method6339(var3, -446667577);
			if (var4.method6321((byte) -19)) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class158_Sub3.aClass553_8875.method6392(var2, 1537817168).method6376(var3, var4.aString6236, 1220901222);
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class158_Sub3.aClass553_8875.method6392(var2, -1322207524).method6370(var3, var4.anInt6235, (byte) 79);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vo.abj(" + ')');
		}
	}
}
