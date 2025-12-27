package deob;

public class Class79 {

	public int[] anIntArray659;

	public int[] anIntArray664;

	public int[] anIntArray661;

	public int[] anIntArray662;

	public int[] anIntArray663;

	public int[] anIntArray660;

	public int[] anIntArray665;

	public static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_667;

	public static Class380 aClass380_666;

	public Class79(Buffer arg0) {
		int var2 = arg0.readSmart(-1399287914);
		this.anIntArray659 = new int[var2];
		this.anIntArray664 = new int[var2];
		this.anIntArray661 = new int[var2];
		this.anIntArray662 = new int[var2];
		this.anIntArray663 = new int[var2];
		this.anIntArray660 = new int[var2];
		this.anIntArray665 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.anIntArray659[var3] = arg0.readUnsignedShort(-192297881) - 5120;
			this.anIntArray661[var3] = arg0.readUnsignedShort(1513719678) - 5120;
			this.anIntArray664[var3] = arg0.readShort(-1100583751);
			this.anIntArray663[var3] = arg0.readUnsignedShort(1659671482) - 5120;
			this.anIntArray665[var3] = arg0.readUnsignedShort(1028345551) - 5120;
			this.anIntArray660[var3] = arg0.readShort(-1100583751);
			this.anIntArray662[var3] = arg0.readShort(-1100583751);
		}
	}

	public void method937(int arg0, byte arg1) {
		try {
			int[][] var3 = new int[this.anIntArray659.length << 1][4];
			for (int var4 = 0; var4 < this.anIntArray659.length; var4++) {
				var3[var4 * 2][0] = this.anIntArray659[var4];
				var3[var4 * 2][1] = this.anIntArray664[var4];
				var3[var4 * 2][2] = this.anIntArray661[var4];
				var3[var4 * 2][3] = this.anIntArray662[var4];
				var3[var4 * 2 + 1][0] = this.anIntArray663[var4];
				var3[var4 * 2 + 1][1] = this.anIntArray660[var4];
				var3[var4 * 2 + 1][2] = this.anIntArray665[var4];
				var3[var4 * 2 + 1][3] = this.anIntArray662[var4];
			}
			client.anIntArrayArrayArray9082[arg0] = var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "de.r(" + ')');
		}
	}

	public static final void method938(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (Math.random() * (double) var2);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "de.zb(" + ')');
		}
	}

	public static final void method939(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub11_7879.method5778(-1804246572) == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "de.alf(" + ')');
		}
	}

	public static final void method940(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub11_7879, arg0.anIntArray4387[--arg0.anInt4376] == 1 ? 1 : 0, 578342775);
			Class435.method5568(1842100498);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "de.akn(" + ')');
		}
	}

	public static final void method941(Class430 arg0, byte arg1) {
		try {
			if (Class147.anInt1621 == 2) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) ((double) Class401_Sub1.aClass145_Sub1_8249.method1713(1747463346) * 2607.5945876176133D) >> 3;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) client.aFloat9141 >> 3;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "de.agu(" + ')');
		}
	}

	public static final void method942(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -752494825);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class462.method5704(var3, var4, arg0, (byte) -43);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "de.ec(" + ')');
		}
	}

	public static void method943(Buffer arg0, int arg1, int arg2) {
		try {
			if (Class332.aClass489_6607 != null) {
				try {
					Class332.aClass489_6607.method6055(0L);
					Class332.aClass489_6607.method6053(arg0.payload, arg1, 24, -2105283850);
				} catch (Exception var4) {
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "de.u(" + ')');
		}
	}
}
