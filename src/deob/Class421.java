package deob;

public class Class421 {

	public static int anInt4311 = 1;

	public static int anInt4312 = 2;

	public static int anInt4315 = 0;

	public int anInt4316 = -1;

	public int anInt4310 = -1;

	public int[] disabledEquipmentSlots;

	public static int anInt4318;

	public int[] anIntArray4314;

	public int[] anIntArray4317;

	public Class421(IndexTable arg0) {
		byte[] var2 = arg0.method2761(Class420.aClass420_4304.anInt4307, 138881788);
		this.method5290(new Buffer(var2), (byte) 93);
		if (this.disabledEquipmentSlots == null) {
			throw new RuntimeException("");
		}
	}

	public void method5290(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-281673718);
				if (var3 == 0) {
					if (arg1 <= 48) {
						throw new IllegalStateException();
					}
					return;
				}
				int var4;
				if (var3 == 1) {
					var4 = arg0.readUnsignedByte(1084570019);
					this.disabledEquipmentSlots = new int[var4];
					for (int var5 = 0; var5 < this.disabledEquipmentSlots.length; var5++) {
						this.disabledEquipmentSlots[var5] = arg0.readUnsignedByte(1417909650);
						if (this.disabledEquipmentSlots[var5] == 0) {
							if (arg1 <= 48) {
								throw new IllegalStateException();
							}
						} else if (this.disabledEquipmentSlots[var5] == 2) {
						}
					}
				} else if (var3 == 3) {
					this.anInt4316 = arg0.readUnsignedByte(1714233563);
				} else if (var3 == 4) {
					this.anInt4310 = arg0.readUnsignedByte(1654635025);
				} else if (var3 == 5) {
					this.anIntArray4314 = new int[arg0.readUnsignedByte(1358843741)];
					for (var4 = 0; var4 < this.anIntArray4314.length; var4++) {
						this.anIntArray4314[var4] = arg0.readUnsignedByte(1853410600);
					}
				} else if (var3 == 6) {
					this.anIntArray4317 = new int[arg0.readUnsignedByte(871826655)];
					for (var4 = 0; var4 < this.anIntArray4317.length; var4++) {
						this.anIntArray4317[var4] = arg0.readUnsignedByte(811767119);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rn.r(" + ')');
		}
	}

	public static String method5291(String arg0, char arg1, String arg2, int arg3) {
		try {
			int var4 = arg0.length();
			int var5 = arg2.length();
			int var6 = var4;
			int var7 = var5 - 1;
			if (var7 != 0) {
				int var8 = 0;
				while (true) {
					var8 = arg0.indexOf(arg1, var8);
					if (var8 < 0) {
						if (arg3 == -1390004513) {
						}
						break;
					}
					var8++;
					var6 += var7;
				}
			}
			StringBuilder var12 = new StringBuilder(var6);
			int var9 = 0;
			while (true) {
				int var10 = arg0.indexOf(arg1, var9);
				if (var10 < 0) {
					if (arg3 == -1390004513) {
					}
					var12.append(arg0.substring(var9));
					return var12.toString();
				}
				var12.append(arg0.substring(var9, var10));
				var12.append(arg2);
				var9 = var10 + 1;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "rn.x(" + ')');
		}
	}

	public static final void method5292(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1531826820);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class403.method4733(var3, var4, arg0, 474610730);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rn.fc(" + ')');
		}
	}

	public static void method5293(byte arg0) {
		try {
			if (Class352.anInt3486 != -1) {
				Class458.method5670(Class352.anInt3486, -1, -1, false, -527208967);
				Class352.anInt3486 = -1;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rn.ci(" + ')');
		}
	}

	public static final void method5294(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ((Player) arg0.aClass432_Sub1_Sub1_Sub1_4396).aClass65_10249.method782(var2, (byte) 18);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rn.at(" + ')');
		}
	}
}
