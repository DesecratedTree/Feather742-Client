package deob;

public class Class402 {

	public char aChar4137;

	public int anInt4134;

	public int anInt4135;

	public int anInt4136;

	public void method4723(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.aChar4137 = Class127.method1546(arg0.readByte((byte) 51), -2134722093);
			} else if (arg1 == 2) {
				this.anInt4135 = arg0.readUnsignedShort(733530470);
				this.anInt4136 = arg0.readUnsignedByte(879759853);
				this.anInt4134 = arg0.readUnsignedByte(863127587);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qr.j(" + ')');
		}
	}

	public void method4724(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(180866196);
				if (var3 == 0) {
					if (arg1 >= 232040431) {
					}
					return;
				}
				this.method4723(arg0, var3, -1963315436);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qr.r(" + ')');
		}
	}

	public static void createColorPallette(byte arg0) {
		try {
			if (Console.colorArray == null) {
				Console.colorArray = new int[65536];
				Console.anIntArray4265 = new int[65536];
				double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
				for (int var3 = 0; var3 < 65536; var3++) {
					double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
					double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
					double var8 = (double) (var3 & 0x7F) / 128.0D;
					double var10 = var8;
					double var12 = var8;
					double var14 = var8;
					if (var6 != 0.0D) {
						double var16;
						if (var8 < 0.5D) {
							var16 = (var6 + 1.0D) * var8;
						} else {
							var16 = var8 + var6 - var6 * var8;
						}
						double var18 = var8 * 2.0D - var16;
						double var20 = var4 + 0.3333333333333333D;
						if (var20 > 1.0D) {
							var20--;
						}
						double var24 = var4 - 0.3333333333333333D;
						if (var24 < 0.0D) {
							var24++;
						}
						if (var20 * 6.0D < 1.0D) {
							var10 = var20 * 6.0D * (var16 - var18) + var18;
						} else if (var20 * 2.0D < 1.0D) {
							var10 = var16;
						} else if (var20 * 3.0D < 2.0D) {
							var10 = var18 + (0.6666666666666666D - var20) * 6.0D * (var16 - var18);
						} else {
							var10 = var18;
						}
						if (var4 * 6.0D < 1.0D) {
							var12 = var18 + (var16 - var18) * 6.0D * var4;
						} else if (var4 * 2.0D < 1.0D) {
							var12 = var16;
						} else if (var4 * 3.0D < 2.0D) {
							var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
						} else {
							var12 = var18;
						}
						if (var24 * 6.0D < 1.0D) {
							var14 = var18 + (var16 - var18) * 6.0D * var24;
						} else if (var24 * 2.0D < 1.0D) {
							var14 = var16;
						} else if (var24 * 3.0D < 2.0D) {
							var14 = var18 + (var16 - var18) * (0.6666666666666666D - var24) * 6.0D;
						} else {
							var14 = var18;
						}
					}
					var10 = Math.pow(var10, var1);
					var12 = Math.pow(var12, var1);
					var14 = Math.pow(var14, var1);
					int var27 = (int) (var10 * 256.0D);
					int var17 = (int) (var12 * 256.0D);
					int var28 = (int) (var14 * 256.0D);
					int var19 = var28 + (var17 << 8) + (var27 << 16);
					Console.colorArray[var3] = var19 & 0xFFFFFF;
					int var29 = (var17 << 8) + (var28 << 16) + var27;
					Console.anIntArray4265[var3] = var29;
				}
			}
		} catch (RuntimeException var26) {
			throw Class476.method5964(var26, "qr.p(" + ')');
		}
	}

	public static final void method4726(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Console.anIntArray4263[Class356.modifyColor(var2, (byte) 1) & 0xFFFF];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qr.ze(" + ')');
		}
	}
}
