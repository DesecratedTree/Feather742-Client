package deob;

public class Class481 {

	public long aLong5767;

	public int[] anIntArray5768;

	public short[] aShortArray5769;

	public short[] aShortArray5770;

	public Class481(long arg0, int[] arg1, short[] arg2, short[] arg3) {
		this.aLong5767 = arg0;
		this.anIntArray5768 = arg1;
		this.aShortArray5769 = arg2;
		this.aShortArray5770 = arg3;
	}

	public static void method6019(Class436 arg0, byte arg1) {
		try {
			Class477.aClass436_5715 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tx.r(" + ')');
		}
	}

	public static void method6020(boolean arg0, int arg1) {
		try {
			Class330_Sub20 var2;
			for (var2 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5869(539664854); var2 != null; var2 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5873((byte) -21)) {
				if (var2.aClass330_Sub40_Sub3_7675 != null) {
					Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7675);
					var2.aClass330_Sub40_Sub3_7675 = null;
				}
				if (var2.aClass330_Sub40_Sub3_7683 != null) {
					Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7683);
					var2.aClass330_Sub40_Sub3_7683 = null;
				}
				var2.method3252(952619978);
			}
			if (arg0) {
				for (var2 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5869(539664854); var2 != null; var2 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5873((byte) 11)) {
					if (var2.aClass330_Sub40_Sub3_7675 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7675);
						var2.aClass330_Sub40_Sub3_7675 = null;
					}
					var2.method3252(836255713);
				}
				for (var2 = (Class330_Sub20) Class330_Sub20.aClass497_7651.method6099((byte) -33); var2 != null; var2 = (Class330_Sub20) Class330_Sub20.aClass497_7651.method6098((short) -32768)) {
					if (var2.aClass330_Sub40_Sub3_7675 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(var2.aClass330_Sub40_Sub3_7675);
						var2.aClass330_Sub40_Sub3_7675 = null;
					}
					var2.method3252(-323982112);
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tx.r(" + ')');
		}
	}

	public static void method6021(IndexTable arg0, int arg1) {
		try {
			Class210.aClass280_2033 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tx.r(" + ')');
		}
	}

	public static void method6022(byte[] arg0, byte arg1) {
		try {
			Buffer var2 = new Buffer(arg0);
			while (true) {
				int var3 = var2.readUnsignedByte(236309058);
				if (var3 == 0) {
					if (arg1 >= 0) {
					}
					return;
				}
				if (var3 == 1) {
					int var4 = var2.readUnsignedShort(1309439148);
					if (Class333.anInt3346 == -1) {
						Class333.anInt3346 = var4;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tx.n(" + ')');
		}
	}

	public static final void method6023(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 4;
			arg0.anInt1260 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1205 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			arg0.anInt1262 = arg2.anIntArray4387[arg2.anInt4376 + 2];
			arg0.anInt1199 = arg2.anIntArray4387[arg2.anInt4376 + 3];
			Class404.method4738(arg0, 2043758349);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tx.er(" + ')');
		}
	}

	public static final void method6024(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (Class263_Sub2.myPlayer.aClass408_10240 != null) {
				Class263_Sub2.myPlayer.aClass408_10240.method4758(var2, var3, -2042368520);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tx.ct(" + ')');
		}
	}
}
