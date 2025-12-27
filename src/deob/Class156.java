package deob;

public class Class156 implements Interface7 {

	public Class214 aClass214_6462;

	public Class152 aClass152_6463;

	public static int anInt6464;

	public void method87(boolean arg0, byte arg1) {
		try {
			Class171 var3 = this.aClass152_6463.method1782(this.aClass214_6462.anInt6534, -350040517);
			if (var3 != null) {
				int var4 = this.aClass214_6462.aClass195_6535.method2137(this.aClass214_6462.anInt6541, client.anInt9207, 2136965159) + this.aClass214_6462.anInt6537;
				int var5 = this.aClass214_6462.aClass211_6536.method2221(this.aClass214_6462.anInt6542, client.anInt9118, (byte) -75) + this.aClass214_6462.anInt6543;
				if (this.aClass214_6462.aBoolean6544) {
					Class361.aClass_ra3793.bl(var4, var5, this.aClass214_6462.anInt6541, this.aClass214_6462.anInt6542, this.aClass214_6462.anInt6540, 0);
				}
				var5 += this.method1826(Class166_Sub3_Sub2.aClass263_9483, var3.aString1726, var4, var5, 5, -1185531240) * 12;
				var5 += 8;
				if (this.aClass214_6462.aBoolean6544) {
					Class361.aClass_ra3793.br(var4, var5, var4 + this.aClass214_6462.anInt6541 - 1, var5, this.aClass214_6462.anInt6540, 0);
				}
				var5++;
				var5 += this.method1826(Class166_Sub3_Sub2.aClass263_9483, var3.aString1729, var4, var5, 5, -761872606) * 12;
				var5 += 5;
				int var10000 = var5 + this.method1826(Class166_Sub3_Sub2.aClass263_9483, var3.aString1728, var4, var5, 5, -1042739983) * 12;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "gj.j(" + ')');
		}
	}

	public boolean method85(int arg0) {
		try {
			return this.aClass152_6463.method1783((byte) 25);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gj.i(" + ')');
		}
	}

	public void method86(int arg0) {
	}

	public void method84() {
	}

	public void method89() {
	}

	public void method90(boolean arg0) {
		Class171 var2 = this.aClass152_6463.method1782(this.aClass214_6462.anInt6534 * -679470563 * 1923184693, -1628631272);
		if (var2 == null) {
			return;
		}
		int var3 = this.aClass214_6462.aClass195_6535.method2137(this.aClass214_6462.anInt6541 * 636233519 * 337936335, client.anInt9207 * -1156626901 * 64571523, 1259600447) + this.aClass214_6462.anInt6537 * 1556904719 * 479794159;
		int var4 = this.aClass214_6462.aClass211_6536.method2221(this.aClass214_6462.anInt6542 * -394692083 * -1002937147, client.anInt9118 * -1702167293 * 1108170155, (byte) -26) + this.aClass214_6462.anInt6543 * -1744249647 * -638518223;
		if (this.aClass214_6462.aBoolean6544) {
			Class361.aClass_ra3793.bl(var3, var4, this.aClass214_6462.anInt6541 * 636233519 * 337936335, this.aClass214_6462.anInt6542 * -394692083 * -1002937147, this.aClass214_6462.anInt6540 * 555214917 * 885975693, 0);
		}
		var4 += this.method1826(Class166_Sub3_Sub2.aClass263_9483, var2.aString1726, var3, var4, 5, -1910671938) * 12;
		var4 += 8;
		if (this.aClass214_6462.aBoolean6544) {
			Class361.aClass_ra3793.br(var3, var4, var3 + this.aClass214_6462.anInt6541 * 337936335 * 636233519 - 1, var4, this.aClass214_6462.anInt6540 * 885975693 * 555214917, 0);
		}
		var4++;
		var4 += this.method1826(Class166_Sub3_Sub2.aClass263_9483, var2.aString1729, var3, var4, 5, 1748524422) * 12;
		var4 += 5;
		int var10000 = var4 + this.method1826(Class166_Sub3_Sub2.aClass263_9483, var2.aString1728, var3, var4, 5, 334071159) * 12;
	}

	public void method88() {
	}

	public int method1826(Class263 arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			return arg0.method2613(arg1, arg4 + arg2, arg4 + arg3, this.aClass214_6462.anInt6541 - arg4 * 2, this.aClass214_6462.anInt6542 - arg4 * 2, this.aClass214_6462.anInt6538, this.aClass214_6462.anInt6539, 0, 0, 0, null, null, null, 0, 0, (byte) 13);
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "gj.w(" + ')');
		}
	}

	public Class156(Class152 arg0, Class214 arg1) {
		this.aClass214_6462 = arg1;
		this.aClass152_6463 = arg0;
	}

	public boolean method91() {
		return this.aClass152_6463.method1783((byte) 83);
	}

	public static final int method1827(int arg0, int arg1, short arg2) {
		try {
			int var3 = Class57.method652(arg0 + 45365, arg1 + 91923, 4, 1664562506) - 128 + (Class57.method652(arg0 + 10294, arg1 + 37821, 2, -1740482142) - 128 >> 1) + (Class57.method652(arg0, arg1, 1, 710807822) - 128 >> 2);
			var3 = (int) ((double) var3 * 0.3D) + 35;
			if (var3 < 10) {
				var3 = 10;
			} else if (var3 > 60) {
				var3 = 60;
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gj.m(" + ')');
		}
	}

	public static final void method1828(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Integer.toString(var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gj.aaj(" + ')');
		}
	}

	public static void method1829(Class120 arg0, IComponentDefinitions arg1, boolean arg2, int arg3) {
		try {
			Class540.method6327(arg0.aClass114Array1400, arg1, arg2, 30186933);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "gj.kd(" + ')');
		}
	}
}
