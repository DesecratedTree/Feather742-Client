package deob;

public class Class325_Sub4 extends Class325 {

	public Class467 aClass467_7486 = new Class467();

	public Class343 aClass343_7485;

	public Class325_Sub4(Class343 arg0) {
		this.aClass343_7485 = arg0;
	}

	public boolean method3222(short arg0) {
		try {
			return this.aClass467_7486.method5855(1671356272);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acj.p(" + ')');
		}
	}

	public Class325_Sub2 method3223(int arg0, int arg1) {
		try {
			Class325_Sub2 var3 = (Class325_Sub2) this.aClass467_7486.method5854(-84367540);
			if (var3 == null || var3.anInt7481 > arg0) {
				return null;
			}
			for (Class325_Sub2 var4 = (Class325_Sub2) this.aClass467_7486.method5857(-1740521876); var4 != null && var4.anInt7481 <= arg0; var4 = (Class325_Sub2) this.aClass467_7486.method5857(-1753340479)) {
				var3.method3204(428757222);
				var3 = var4;
			}
			if (this.aClass343_7485.anInt3408 + var3.anInt7481 + var3.anInt7478 > arg0) {
				return var3;
			} else {
				var3.method3204(-641152913);
				return null;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acj.i(" + ')');
		}
	}

	public void method3224(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class325_Sub2 var6 = null;
			int var7 = 0;
			for (Class325_Sub2 var8 = (Class325_Sub2) this.aClass467_7486.method5854(-888476427); var8 != null; var8 = (Class325_Sub2) this.aClass467_7486.method5857(-1708013574)) {
				var7++;
				if (var8.anInt7481 == arg0) {
					var8.method3214(arg0, arg1, arg2, arg3, (byte) 81);
					return;
				}
				if (var8.anInt7481 <= arg0) {
					var6 = var8;
				}
			}
			if (var6 != null) {
				Class6.method406(new Class325_Sub2(arg0, arg1, arg2, arg3), var6, (byte) 0);
				if (var7 >= Class396.aClass417_4108.anInt4290) {
					this.aClass467_7486.method5854(-144573806).method3204(1996032816);
				}
			} else if (var7 < Class396.aClass417_4108.anInt4290) {
				this.aClass467_7486.method5856(new Class325_Sub2(arg0, arg1, arg2, arg3), 682232543);
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "acj.j(" + ')');
		}
	}

	public static String method3225(int arg0, int arg1) {
		try {
			return "<img=" + arg0 + ">";
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acj.r(" + ')');
		}
	}

	public static Class147 method3226(int arg0, byte arg1) {
		try {
			Class147[] var2 = Class464_Sub10.method5776(850461417);
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class147 var4 = var2[var3];
				if (arg0 == var4.anInt1619) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "acj.j(" + ')');
		}
	}
}
