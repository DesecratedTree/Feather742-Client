package deob;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Class53 {

	public static int anInt503 = 1;

	public static int anInt504 = 0;

	public static int anInt505 = 1;

	public static Class87[] method639(byte[] arg0) {
		Buffer var1 = new Buffer(arg0);
		var1.offset = arg0.length - 2;
		int var2 = var1.readUnsignedShort(433476571);
		int var5;
		int var6;
		int[] var7;
		int var8;
		int var20;
		if (var2 != 65535) {
			Class87_Sub2[] var17 = new Class87_Sub2[var2];
			int var18;
			for (var18 = 0; var18 < var2; var18++) {
				var17[var18] = new Class87_Sub2();
			}
			var1.offset = arg0.length - 7 - var2 * 8;
			var18 = var1.readUnsignedShort(2049260762);
			var5 = var1.readUnsignedShort(2097747680);
			var6 = (var1.readUnsignedByte(2016598483) & 0xFF) + 1;
			for (var20 = 0; var20 < var2; var20++) {
				var17[var20].anInt7109 = var1.readUnsignedShort(1010877592);
			}
			for (var20 = 0; var20 < var2; var20++) {
				var17[var20].anInt7111 = var1.readUnsignedShort(2056411438);
			}
			for (var20 = 0; var20 < var2; var20++) {
				var17[var20].anInt7112 = var1.readUnsignedShort(-131029458);
			}
			for (var20 = 0; var20 < var2; var20++) {
				var17[var20].anInt7107 = var1.readUnsignedShort(-318233511);
			}
			for (var20 = 0; var20 < var2; var20++) {
				Class87_Sub2 var22 = var17[var20];
				var22.anInt7110 = var18 - var22.anInt7112 - var22.anInt7109;
				var22.anInt7108 = var5 - var22.anInt7107 - var22.anInt7111;
			}
			var1.offset = arg0.length - 7 - var2 * 8 - (var6 - 1) * 3;
			var7 = new int[var6];
			for (var8 = 1; var8 < var6; var8++) {
				var7[var8] = var1.readUnsignedTriByte(-1401356047);
				if (var7[var8] == 0) {
					var7[var8] = 1;
				}
			}
			for (var8 = 0; var8 < var2; var8++) {
				var17[var8].anIntArray7113 = var7;
			}
			var1.offset = 0;
			for (var8 = 0; var8 < var2; var8++) {
				Class87_Sub2 var9 = var17[var8];
				int var10 = var9.anInt7112 * var9.anInt7107;
				var9.aByteArray7114 = new byte[var10];
				int var11 = var1.readUnsignedByte(-81028415);
				int var13;
				if ((var11 & 0x2) == 0) {
					int var23;
					if ((var11 & 0x1) == 0) {
						for (var23 = 0; var23 < var10; var23++) {
							var9.aByteArray7114[var23] = var1.readByte((byte) 49);
						}
					} else {
						for (var23 = 0; var23 < var9.anInt7112; var23++) {
							for (var13 = 0; var13 < var9.anInt7107; var13++) {
								var9.aByteArray7114[var23 + var13 * var9.anInt7112] = var1.readByte((byte) 70);
							}
						}
					}
				} else {
					boolean var12 = false;
					var9.aByteArray7115 = new byte[var10];
					if ((var11 & 0x1) == 0) {
						for (var13 = 0; var13 < var10; var13++) {
							var9.aByteArray7114[var13] = var1.readByte((byte) -80);
						}
						for (var13 = 0; var13 < var10; var13++) {
							byte var14 = var9.aByteArray7115[var13] = var1.readByte((byte) -3);
							var12 |= var14 != -1;
						}
					} else {
						int var24;
						for (var13 = 0; var13 < var9.anInt7112; var13++) {
							for (var24 = 0; var24 < var9.anInt7107; var24++) {
								var9.aByteArray7114[var13 + var24 * var9.anInt7112] = var1.readByte((byte) 32);
							}
						}
						for (var13 = 0; var13 < var9.anInt7112; var13++) {
							for (var24 = 0; var24 < var9.anInt7107; var24++) {
								byte var15 = var9.aByteArray7115[var13 + var24 * var9.anInt7112] = var1.readByte((byte) -98);
								var12 |= var15 != -1;
							}
						}
					}
					if (!var12) {
						var9.aByteArray7115 = null;
					}
				}
			}
			return var17;
		}
		var1.offset = 0;
		int var3 = var1.readUnsignedByte(19842256);
		Class87_Sub1 var21;
		if (var3 == 0) {
			boolean var4 = var1.readUnsignedByte(536901327) == 1;
			var5 = var1.readUnsignedShort(239189594);
			var6 = var1.readUnsignedShort(1510046692);
			var7 = new int[var5 * var6];
			for (var8 = 0; var8 < var5 * var6; var8++) {
				var7[var8] = var1.readUnsignedTriByte(-1401356047) | 0xFF000000;
			}
			if (var4) {
				for (var8 = 0; var8 < var5 * var6; var8++) {
					var7[var8] &= 0xFFFFFF;
					var7[var8] |= var1.readUnsignedByte(-140605281) << 24;
				}
			}
			var21 = new Class87_Sub1(var5, var6, var7);
			return new Class87[] { var21 };
		} else if (var3 == 1) {
			try {
				BufferedImage var19 = ImageIO.read(new ByteArrayInputStream(var1.payload, var1.offset, var1.payload.length - var1.offset));
				var6 = var19.getWidth();
				var20 = var19.getHeight();
				var21 = new Class87_Sub1(var6, var20, var19.getData().getPixels(0, 0, var6, var20, new int[var6 * var20]));
				return new Class87[] { var21 };
			} catch (IOException var16) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}

	public static Class87 method640(IndexTable arg0, int arg1) {
		byte[] var2 = arg0.method2761(arg1, 1342988402);
		return var2 == null ? null : method639(var2)[0];
	}

	public static Class87[] method641(IndexTable arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : method639(var3);
	}

	public static Class87[] method642(IndexTable arg0, int arg1) {
		byte[] var2 = arg0.method2761(arg1, 798173519);
		return var2 == null ? null : method639(var2);
	}

	public Class53() throws Throwable {
		throw new Error();
	}

	public static Class87 method643(IndexTable arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : method639(var3)[0];
	}
}
