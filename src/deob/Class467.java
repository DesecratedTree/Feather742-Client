package deob;

public class Class467 {

	public Class325 aClass325_5601 = new Class325();

	public Class325 aClass325_5600;

	public static Class95[] aClass95Array5599;

	public Class467() {
		this.aClass325_5601.aClass325_3314 = this.aClass325_5601;
		this.aClass325_5601.aClass325_3315 = this.aClass325_5601;
	}

	public void method5851(int arg0) {
		try {
			while (true) {
				Class325 var2 = this.aClass325_5601.aClass325_3314;
				if (var2 == this.aClass325_5601) {
					if (arg0 != 65536) {
					}
					this.aClass325_5600 = null;
					return;
				}
				var2.method3204(664523);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tj.r(" + ')');
		}
	}

	public void method5852(Class325 arg0, byte arg1) {
		try {
			if (arg0.aClass325_3315 != null) {
				arg0.method3204(-64237813);
			}
			arg0.aClass325_3315 = this.aClass325_5601.aClass325_3315;
			arg0.aClass325_3314 = this.aClass325_5601;
			arg0.aClass325_3315.aClass325_3314 = arg0;
			arg0.aClass325_3314.aClass325_3315 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tj.j(" + ')');
		}
	}

	public Class325 method5853(byte arg0) {
		try {
			Class325 var2 = this.aClass325_5601.aClass325_3314;
			if (this.aClass325_5601 == var2) {
				return null;
			} else {
				var2.method3204(2036236452);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tj.o(" + ')');
		}
	}

	public Class325 method5854(int arg0) {
		try {
			Class325 var2 = this.aClass325_5601.aClass325_3314;
			if (var2 == this.aClass325_5601) {
				this.aClass325_5600 = null;
				return null;
			} else {
				this.aClass325_5600 = var2.aClass325_3314;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tj.s(" + ')');
		}
	}

	public boolean method5855(int arg0) {
		try {
			return this.aClass325_5601 == this.aClass325_5601.aClass325_3314;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tj.z(" + ')');
		}
	}

	public void method5856(Class325 arg0, int arg1) {
		try {
			if (arg0.aClass325_3315 != null) {
				arg0.method3204(480412354);
			}
			arg0.aClass325_3315 = this.aClass325_5601;
			arg0.aClass325_3314 = this.aClass325_5601.aClass325_3314;
			arg0.aClass325_3315.aClass325_3314 = arg0;
			arg0.aClass325_3314.aClass325_3315 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tj.i(" + ')');
		}
	}

	public Class325 method5857(int arg0) {
		try {
			Class325 var2 = this.aClass325_5600;
			if (var2 == this.aClass325_5601) {
				this.aClass325_5600 = null;
				return null;
			} else {
				this.aClass325_5600 = var2.aClass325_3314;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tj.f(" + ')');
		}
	}

	public static int method5858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if ((arg5 & 0x1) == 1) {
				int var7 = arg3;
				arg3 = arg4;
				arg4 = var7;
			}
			int var9 = arg2 & 0x3;
			if (var9 == 0) {
				return arg1;
			} else if (var9 == 1) {
				return 7 - arg0 - (arg3 - 1);
			} else if (var9 == 2) {
				return 7 - arg1 - (arg4 - 1);
			} else {
				return arg0;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "tj.s(" + ')');
		}
	}

	public static void method5859(int arg0) {
		try {
			if (Class95_Sub11.aClass296_7171 != null) {
				Class95_Sub11.aClass296_7171.method2937();
			}
			if (Class330_Sub42.aClass296_7818 != null) {
				Class330_Sub42.aClass296_7818.method2937();
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "tj.o(" + ')');
		}
	}
}
