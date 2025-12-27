package deob;

public class Class464_Sub1 extends Class464 {

	public int method5716(int arg0, int arg1) {
		try {
			return 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aep.j(" + ')');
		}
	}

	public Class464_Sub1(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5730(byte arg0) {
		try {
			if (this.anInt5587 < 0 || this.anInt5587 > 4) {
				this.anInt5587 = this.method5715(1334354020);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aep.l(" + ')');
		}
	}

	public int method5731(int arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aep.b(" + ')');
		}
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aep.p(" + ')');
		}
	}

	public Class464_Sub1(Class330_Sub50 arg0) {
		super(arg0);
	}

	public int method5718() {
		return 3;
	}

	public int method5714(int arg0) {
		return 1;
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5715(int arg0) {
		try {
			return 3;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aep.r(" + ')');
		}
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public static final void method5732(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			Class115.method1415(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], 255, 256, (byte) -1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aep.tz(" + ')');
		}
	}

	public static final void method5733(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub4_7883.method5748(1597057040);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aep.aln(" + ')');
		}
	}

	public static final void method5734(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376];
			if (arg0.anInt1292 != var4) {
				arg0.anInt1292 = var4;
				Class404.method4738(arg0, 399117740);
			}
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class100.method1213(arg0.anInt1196, -856520285);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aep.gq(" + ')');
		}
	}

	public static void method5735(byte[] arg0, int arg1) {
		try {
			Buffer var2 = new Buffer(arg0);
			while (true) {
				int var3 = var2.readUnsignedByte(1490304110);
				if (var3 == 0) {
					if (arg1 >= 1069841275) {
						throw new IllegalStateException();
					}
					return;
				}
				if (var3 == 1) {
					int[] var4 = Class389.anIntArray4010 = new int[6];
					var4[0] = var2.readUnsignedShort(1981934226);
					var4[1] = var2.readUnsignedShort(1570219692);
					var4[2] = var2.readUnsignedShort(1907138289);
					var4[3] = var2.readUnsignedShort(805397526);
					var4[4] = var2.readUnsignedShort(1517623436);
					var4[5] = var2.readUnsignedShort(792729344);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aep.w(" + ')');
		}
	}
}
