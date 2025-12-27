package deob;

public class Class464_Sub23 extends Class464 {

	public boolean aBoolean8711 = true;

	public boolean aBoolean8710 = false;

	public static Class350 aClass350_8712;

	public Class464_Sub23(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public Class464_Sub23(Class330_Sub50 arg0) {
		super(arg0);
	}

	public void method5817(int arg0) {
		try {
			if (this.anInt5587 < 0 || this.anInt5587 > 5) {
				this.anInt5587 = this.method5715(-2113362178);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afu.l(" + ')');
		}
	}

	public int method5715(int arg0) {
		try {
			this.aBoolean8710 = true;
			return 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afu.r(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			return arg0 == 3 && !Class489.method6063(-1102372689).method331("jagdx", 640260927) ? 3 : 2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afu.j(" + ')');
		}
	}

	public void method5720(int arg0) {
		this.aBoolean8710 = false;
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.aBoolean8710 = false;
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afu.p(" + ')');
		}
	}

	public void method5818(boolean arg0, int arg1) {
		try {
			this.aBoolean8711 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afu.u(" + ')');
		}
	}

	public int method5819(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afu.k(" + ')');
		}
	}

	public int method5718() {
		this.aBoolean8710 = true;
		return 2;
	}

	public int method5714(int arg0) {
		return arg0 == 3 && !Class489.method6063(-1102372689).method331("jagdx", 1638075024) ? 3 : 2;
	}

	public void method5719(int arg0) {
		this.aBoolean8710 = false;
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5721(int arg0) {
		this.aBoolean8710 = false;
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public boolean method5820(int arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afu.b(" + ')');
		}
	}

	public boolean method5821(int arg0) {
		try {
			return this.aBoolean8711;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afu.q(" + ')');
		}
	}

	public static final void method5822(Class430 arg0, int arg1) {
		try {
			Class330_Sub28 var2 = (Class330_Sub28) arg0.anObjectArray4386[--arg0.anInt4378];
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-706036662) != Class136.aClass136_1524) {
				throw new RuntimeException();
			}
			Class166_Sub1 var3 = (Class166_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1707(2102816052);
			var3.method1997(var2, (byte) 41);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afu.ahw(" + ')');
		}
	}

	public static final void method5823(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397] >> 16;
			int var3 = arg0.anIntArray4394[arg0.anInt4397] & 0xFFFF;
			int var4 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var4 < 0 || var4 > 5000) {
				throw new RuntimeException();
			}
			arg0.anIntArray4373[var2] = var4;
			byte var5 = -1;
			if (var3 == 105) {
				var5 = 0;
			}
			for (int var6 = 0; var6 < var4; var6++) {
				arg0.anIntArrayArray4374[var2][var6] = var5;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "afu.ar(" + ')');
		}
	}
}
