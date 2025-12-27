package deob;

public class Class425 {

	public int anInt4330 = 0;

	public int anInt4331 = -1;

	public boolean aBoolean4332 = true;

	public int anInt4340 = -1;

	public int anInt4334 = 512;

	public boolean aBoolean4335 = true;

	public int anInt4341 = 8;

	public boolean aBoolean4337 = false;

	public int anInt4336 = 1190717;

	public int anInt4339 = 55269184;

	public int anInt4338 = 255;

	public int anInt4327 = 63;

	public int anInt4342 = 0;

	public int anInt4343 = 64;

	public static int anInt4333 = 1;

	public int anInt4329;

	public static Class169 aClass169_4344;

	public Class418 aClass418_4328;

	public void method5309(int arg0) {
		try {
			this.anInt4341 = this.anInt4341 << 8 | this.anInt4329;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rr.i(" + ')');
		}
	}

	public void method5310(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(979818548);
				if (var3 == 0) {
					if (arg1 <= 64) {
					}
					return;
				}
				this.method5311(arg0, var3, -374527980);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rr.r(" + ')');
		}
	}

	public void method5311(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt4330 = Class278.method2739(arg0.readUnsignedTriByte(-1401356047), (byte) 24);
			} else if (arg1 == 2) {
				this.anInt4331 = arg0.readUnsignedByte(148127650);
			} else if (arg1 == 3) {
				this.anInt4331 = arg0.readUnsignedShort(2085970244);
				if (this.anInt4331 == 65535) {
					this.anInt4331 = -1;
				}
			} else if (arg1 == 5) {
				this.aBoolean4332 = false;
			} else if (arg1 == 7) {
				this.anInt4340 = Class278.method2739(arg0.readUnsignedTriByte(-1401356047), (byte) 29);
			} else if (arg1 == 8) {
				this.aClass418_4328.anInt4294 = this.anInt4329;
			} else if (arg1 == 9) {
				this.anInt4334 = arg0.readUnsignedShort(909525846) << 2;
			} else if (arg1 == 10) {
				this.aBoolean4335 = false;
			} else if (arg1 == 11) {
				this.anInt4341 = arg0.readUnsignedByte(1829162676);
			} else if (arg1 == 12) {
				this.aBoolean4337 = true;
			} else if (arg1 == 13) {
				this.anInt4336 = arg0.readUnsignedTriByte(-1401356047);
			} else if (arg1 == 14) {
				this.anInt4339 = (arg0.readUnsignedByte(639877792) << 2) * 1947020637;
			} else if (arg1 == 16) {
				this.anInt4338 = arg0.readUnsignedByte(266253142);
			} else if (arg1 == 20) {
				this.anInt4327 = arg0.readUnsignedShort(427437720);
			} else if (arg1 == 21) {
				this.anInt4342 = arg0.readUnsignedByte(866416037);
			} else if (arg1 == 22) {
				this.anInt4343 = arg0.readUnsignedShort(867975750);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rr.j(" + ')');
		}
	}

	public static final void method5312(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			IOException_Sub1.method339(var3, var4, arg0, -2112709583);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rr.oj(" + ')');
		}
	}
}
