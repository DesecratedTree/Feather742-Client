package deob;

public class Class248 implements Interface14 {

	public static byte[] aByteArray6592 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	public static Class367 aClass367_6588 = new Class367(128, 4);

	public Class542 aClass542_6589;

	public int anInt6587;

	public int anInt6593;

	public Interface7[] anInterface7Array6590;

	public Class_ra aClass_ra6591;

	public boolean aBoolean6594;

	public int method214() {
		return this.anInt6593 * -1544147031 * -1292639079;
	}

	public void method203(int arg0) {
		try {
			if (Class361.aClass_ra3793 != this.aClass_ra6591) {
				this.aClass_ra6591 = Class361.aClass_ra3793;
				this.aBoolean6594 = true;
			}
			this.aClass_ra6591.ba(3, 0);
			Interface7[] var2 = this.anInterface7Array6590;
			for (int var3 = 0; var3 < var2.length; var3++) {
				Interface7 var4 = var2[var3];
				if (var4 != null) {
					var4.method86(-1058552246);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kj.f(" + ')');
		}
	}

	public void method196(boolean arg0, int arg1) {
		try {
			boolean var7 = true;
			Interface7[] var3 = this.anInterface7Array6590;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Interface7 var5 = var3[var4];
				if (var5 != null) {
					var5.method87(var7 || this.aBoolean6594, (byte) 47);
				}
			}
			this.aBoolean6594 = false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "kj.i(" + ')');
		}
	}

	public int method212(int arg0) {
		try {
			int var2 = 0;
			Interface7[] var3 = this.anInterface7Array6590;
			for (int var4 = 0; var4 < var3.length; var4++) {
				Interface7 var5 = var3[var4];
				if (var5 == null || var5.method85(-502421478)) {
					var2++;
				}
			}
			return var2 * 100 / this.anInterface7Array6590.length;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "kj.z(" + ')');
		}
	}

	public void method209(byte arg0) {
	}

	public void method200(boolean arg0) {
		boolean var5 = true;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 != null) {
				var4.method87(var5 || this.aBoolean6594, (byte) 67);
			}
		}
		this.aBoolean6594 = false;
	}

	public void method201(boolean arg0) {
		boolean var5 = true;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 != null) {
				var4.method87(var5 || this.aBoolean6594, (byte) 36);
			}
		}
		this.aBoolean6594 = false;
	}

	public void method202(boolean arg0) {
		boolean var5 = true;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 != null) {
				var4.method87(var5 || this.aBoolean6594, (byte) 23);
			}
		}
		this.aBoolean6594 = false;
	}

	public void method204() {
	}

	public int method210() {
		int var1 = 0;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 == null || var4.method85(-748744890)) {
				var1++;
			}
		}
		return var1 * 100 / this.anInterface7Array6590.length;
	}

	public void method208() {
		if (Class361.aClass_ra3793 != this.aClass_ra6591) {
			this.aClass_ra6591 = Class361.aClass_ra3793;
			this.aBoolean6594 = true;
		}
		this.aClass_ra6591.ba(3, 0);
		Interface7[] var1 = this.anInterface7Array6590;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Interface7 var3 = var1[var2];
			if (var3 != null) {
				var3.method86(-2087584270);
			}
		}
	}

	public void method206() {
		if (Class361.aClass_ra3793 != this.aClass_ra6591) {
			this.aClass_ra6591 = Class361.aClass_ra3793;
			this.aBoolean6594 = true;
		}
		this.aClass_ra6591.ba(3, 0);
		Interface7[] var1 = this.anInterface7Array6590;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Interface7 var3 = var1[var2];
			if (var3 != null) {
				var3.method86(-19812538);
			}
		}
	}

	public boolean method198(long arg0) {
		try {
			return Class312.method3111((byte) 98) >= (long) this.anInt6587 + arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kj.w(" + ')');
		}
	}

	public int method195() {
		int var1 = 0;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 == null || var4.method85(1215195968)) {
				var1++;
			}
		}
		return var1 * 100 / this.anInterface7Array6590.length;
	}

	public int method197() {
		int var1 = 0;
		Interface7[] var2 = this.anInterface7Array6590;
		for (int var3 = 0; var3 < var2.length; var3++) {
			Interface7 var4 = var2[var3];
			if (var4 == null || var4.method85(1333590761)) {
				var1++;
			}
		}
		return var1 * 100 / this.anInterface7Array6590.length;
	}

	public void method207() {
		if (Class361.aClass_ra3793 != this.aClass_ra6591) {
			this.aClass_ra6591 = Class361.aClass_ra3793;
			this.aBoolean6594 = true;
		}
		this.aClass_ra6591.ba(3, 0);
		Interface7[] var1 = this.anInterface7Array6590;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Interface7 var3 = var1[var2];
			if (var3 != null) {
				var3.method86(1632126965);
			}
		}
	}

	public boolean method205(long arg0) {
		return Class312.method3111((byte) 79) >= (long) (this.anInt6587 * 131882845 * -84153099) + arg0;
	}

	public boolean method213(long arg0) {
		return Class312.method3111((byte) 92) >= (long) (this.anInt6587 * 131882845 * -84153099) + arg0;
	}

	public Class248(Class542 arg0, int arg1, int arg2, Class163 arg3) {
		this.aClass542_6589 = arg0;
		this.anInt6587 = arg1;
		this.anInt6593 = arg2;
		this.anInterface7Array6590 = new Interface7[this.aClass542_6589.anInterface10Array6250.length];
		for (int var5 = 0; var5 < this.anInterface7Array6590.length; var5++) {
			this.anInterface7Array6590[var5] = arg3.method1919(this.aClass542_6589.anInterface10Array6250[var5], (byte) 108);
		}
	}

	public void method194() {
		if (Class361.aClass_ra3793 != this.aClass_ra6591) {
			this.aClass_ra6591 = Class361.aClass_ra3793;
			this.aBoolean6594 = true;
		}
		this.aClass_ra6591.ba(3, 0);
		Interface7[] var1 = this.anInterface7Array6590;
		for (int var2 = 0; var2 < var1.length; var2++) {
			Interface7 var3 = var1[var2];
			if (var3 != null) {
				var3.method86(-2077197527);
			}
		}
	}

	public boolean method211(long arg0) {
		return Class312.method3111((byte) 115) >= (long) (this.anInt6587 * 131882845 * -84153099) + arg0;
	}

	public int method199(int arg0) {
		try {
			return this.anInt6593;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kj.n(" + ')');
		}
	}

	public static final void method2479(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1541881718);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class95_Sub17.method1160(var3, var4, arg0, (byte) 0);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kj.ew(" + ')');
		}
	}

	public static final void method2480(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class10.method427(var2, var3, true, false, -1558641914);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kj.ug(" + ')');
		}
	}

	public static final void method2481(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class_na.method3515(var3, var4, arg0, (byte) 110);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kj.gt(" + ')');
		}
	}
}
