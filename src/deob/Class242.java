package deob;

public class Class242 implements Interface31 {

	public String aString6985;

	public static int anInt6984;

	public boolean aBoolean6983;

	public int method321(byte arg0) {
		try {
			if (this.aBoolean6983) {
				return 100;
			}
			int var2 = Class263.aClass321_2734.method3171(this.aString6985, (byte) -55);
			if (var2 >= 0 && var2 <= 100) {
				return var2;
			} else {
				this.aBoolean6983 = true;
				return 100;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kd.r(" + ')');
		}
	}

	public Class242(String arg0) {
		this.aString6985 = arg0;
	}

	public Class513 method319(int arg0) {
		try {
			return Class513.aClass513_5963;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kd.j(" + ')');
		}
	}

	public int method322() {
		if (this.aBoolean6983) {
			return 100;
		}
		int var1 = Class263.aClass321_2734.method3171(this.aString6985, (byte) -81);
		if (var1 >= 0 && var1 <= 100) {
			return var1;
		} else {
			this.aBoolean6983 = true;
			return 100;
		}
	}

	public int method323() {
		if (this.aBoolean6983) {
			return 100;
		}
		int var1 = Class263.aClass321_2734.method3171(this.aString6985, (byte) 11);
		if (var1 >= 0 && var1 <= 100) {
			return var1;
		} else {
			this.aBoolean6983 = true;
			return 100;
		}
	}

	public Class513 method324() {
		return Class513.aClass513_5963;
	}

	public Class513 method325() {
		return Class513.aClass513_5963;
	}

	public int method320() {
		if (this.aBoolean6983) {
			return 100;
		}
		int var1 = Class263.aClass321_2734.method3171(this.aString6985, (byte) -42);
		if (var1 >= 0 && var1 <= 100) {
			return var1;
		} else {
			this.aBoolean6983 = true;
			return 100;
		}
	}

	public boolean method2403(short arg0) {
		try {
			return this.aBoolean6983;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kd.z(" + ')');
		}
	}

	public static final void method2404(Class430 arg0, short arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub22_7892, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, 111225986);
			Class435.method5568(1963696193);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kd.aki(" + ')');
		}
	}

	public static final void method2405(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 523199475);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1354;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "kd.rz(" + ')');
		}
	}

	public static final void method2406(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1379234975);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Gfx.method789(var3, var4, arg0, 48470572);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kd.jf(" + ')');
		}
	}
}
