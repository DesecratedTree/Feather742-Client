package deob;

public class Class127 {

	public int anInt1473 = 8;

	public int anInt1470 = 16777215;

	public int anInt1464;

	public int anInt1465;

	public int anInt1466;

	public int anInt1467;

	public int anInt1468;

	public int anInt1471;

	public int anInt1472;

	public int anInt1474;

	public boolean aBoolean1469;

	public void method1542(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(2077404239);
				if (var3 == 0) {
					if (arg1 > 1222628742) {
					}
					return;
				}
				this.method1543(arg0, var3, -1792281236);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fc.r(" + ')');
		}
	}

	public void method1543(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt1473 = arg0.readUnsignedShort(-65500571);
			} else if (arg1 == 2) {
				this.aBoolean1469 = true;
			} else if (arg1 == 3) {
				this.anInt1466 = arg0.readShort(-1100583751);
				this.anInt1467 = arg0.readShort(-1100583751);
				this.anInt1465 = arg0.readShort(-1100583751);
			} else if (arg1 == 4) {
				this.anInt1468 = arg0.readUnsignedByte(380418872);
			} else if (arg1 == 5) {
				this.anInt1471 = arg0.readBigSmart(-1153386204);
			} else if (arg1 == 6) {
				this.anInt1470 = arg0.readUnsignedTriByte(-1401356047);
			} else if (arg1 == 7) {
				this.anInt1472 = arg0.readShort(-1100583751);
				this.anInt1464 = arg0.readShort(-1100583751);
				this.anInt1474 = arg0.readShort(-1100583751);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fc.j(" + ')');
		}
	}

	public static final void method1544(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			int var4 = 0;
			if (var3 != null) {
				var4 = var3.anInt1380;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fc.acw(" + ')');
		}
	}

	public static final void method1545(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			IComponentDefinitions var5 = Class166.method1993(var2 << 16 | var3, var4, 534399539);
			Class490.method6071(-1799482790);
			Class330_Sub2 var6 = client.method3924(var5);
			Class400.method4708(var5, var6.method3265((byte) 1), var6.anInt7502, -2070960103);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "fc.aot(" + ')');
		}
	}

	public static char method1546(byte arg0, int arg1) {
		try {
			int var2 = arg0 & 0xFF;
			if (var2 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var2, 16));
			}
			if (var2 >= 128 && var2 < 160) {
				char var3 = Class458.aCharArray5564[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}
				var2 = var3;
			}
			return (char) var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fc.p(" + ')');
		}
	}

	public static final void method1547(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class1 var3 = Class426.method5317(2135201871);
			Class330_Sub34 var4 = Class238.method2377(OutgoingPacket.CHAT_TYPE_PACKET, var3.aClass488_22, 1311536182);
			var4.aClass330_Sub46_Sub2_7729.addByte(var2, (byte) 15);
			var3.method378(var4, -1953941913);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fc.aca(" + ')');
		}
	}
}
