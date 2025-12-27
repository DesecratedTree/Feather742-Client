package deob;

public class Class478 {

	public boolean aBoolean5722 = false;

	public int anInt5719;

	public int anInt5720;

	public int anInt5721;

	public Class330_Sub36_Sub5 aClass330_Sub36_Sub5_5723;

	public Class330_Sub36_Sub5 aClass330_Sub36_Sub5_5724;

	public static Class499 aClass499_5725;

	public final boolean method6005(Class436 arg0, Class440 arg1, int arg2, int arg3, int[] arg4, byte arg5) {
		try {
			if (this.aBoolean5722) {
				return true;
			} else if (arg2 >= arg4.length) {
				return false;
			} else {
				this.anInt5720 = arg4[arg2];
				this.aClass330_Sub36_Sub5_5724 = arg0.method5574(this.anInt5720 >> 16, 1847913673);
				this.anInt5720 &= 0xFFFF;
				if (this.aClass330_Sub36_Sub5_5724 == null) {
					return false;
				}
				if (arg1.aBoolean4479 && arg3 != -1 && arg3 < arg4.length) {
					this.anInt5719 = arg4[arg3];
					this.aClass330_Sub36_Sub5_5723 = arg0.method5574(this.anInt5719 >> 16, 689385543);
					this.anInt5719 &= 0xFFFF;
				}
				if (arg1.aBoolean4473) {
					this.anInt5721 |= 0x200;
				}
				if (this.aClass330_Sub36_Sub5_5724.method3459(this.anInt5720, -1884426096)) {
					this.anInt5721 |= 0x80;
				}
				if (this.aClass330_Sub36_Sub5_5724.method3461(this.anInt5720, -2105702940)) {
					this.anInt5721 |= 0x100;
				}
				if (this.aClass330_Sub36_Sub5_5724.method3460(this.anInt5720, -2044283094)) {
					this.anInt5721 |= 0x400;
				}
				if (this.aClass330_Sub36_Sub5_5723 != null) {
					if (this.aClass330_Sub36_Sub5_5723.method3459(this.anInt5719, -1575691487)) {
						this.anInt5721 |= 0x80;
					}
					if (this.aClass330_Sub36_Sub5_5723.method3461(this.anInt5719, 906931948)) {
						this.anInt5721 |= 0x100;
					}
					if (this.aClass330_Sub36_Sub5_5723.method3460(this.anInt5719, -2069271692)) {
						this.anInt5721 |= 0x400;
					}
				}
				this.anInt5721 |= 0x20;
				this.aBoolean5722 = true;
				return true;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "tu.r(" + ')');
		}
	}

	public final void method6006(byte arg0) {
		try {
			this.aBoolean5722 = false;
			this.anInt5721 = 0;
			this.aClass330_Sub36_Sub5_5723 = null;
			this.aClass330_Sub36_Sub5_5724 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tu.j(" + ')');
		}
	}

	public static final void method6007(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			if (arg0.anIntArray4387[arg0.anInt4376] <= arg0.anIntArray4387[arg0.anInt4376 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tu.ax(" + ')');
		}
	}

	public static final void method6008(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 4;
			client.aShort9191 = (short) arg0.anIntArray4387[arg0.anInt4376];
			if (client.aShort9191 <= 0) {
				client.aShort9191 = 1;
			}
			client.aShort9203 = (short) arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (client.aShort9203 <= 0) {
				client.aShort9203 = 32767;
			} else if (client.aShort9203 < client.aShort9191) {
				client.aShort9203 = client.aShort9191;
			}
			client.aShort9249 = (short) arg0.anIntArray4387[arg0.anInt4376 + 2];
			if (client.aShort9249 <= 0) {
				client.aShort9249 = 1;
			}
			client.aShort8965 = (short) arg0.anIntArray4387[arg0.anInt4376 + 3];
			if (client.aShort8965 <= 0) {
				client.aShort8965 = 32767;
			} else if (client.aShort8965 < client.aShort9249) {
				client.aShort8965 = client.aShort9249;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tu.amq(" + ')');
		}
	}

	public static final void method6009(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1357 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1235808731);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class64.method778(arg0.anInt1196, (byte) 122);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tu.ef(" + ')');
		}
	}
}
