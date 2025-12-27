package deob;

public class Class84 {

	public static int anInt688 = 2;

	public static int anInt701 = 1;

	public static short[] aShortArray702 = new short[500];

	public static int anInt703 = 2;

	public static short[] aShortArray684 = new short[500];

	public static short[] aShortArray690 = new short[500];

	public static short[] aShortArray687 = new short[500];

	public static short[] aShortArray685 = new short[500];

	public static byte[] aByteArray689 = new byte[500];

	public Class330_Sub18 aClass330_Sub18_692 = null;

	public int anInt686 = 0;

	public boolean aBoolean698 = false;

	public boolean aBoolean699 = false;

	public boolean aBoolean700 = false;

	public short[] aShortArray696;

	public short[] aShortArray691;

	public short[] aShortArray694;

	public short[] aShortArray695;

	public short[] aShortArray693;

	public byte[] aByteArray697;

	public Class84(byte[] arg0, Class330_Sub18 arg1) {
		this.aClass330_Sub18_692 = arg1;
		try {
			Buffer var3 = new Buffer(arg0);
			Buffer var4 = new Buffer(arg0);
			var3.readUnsignedByte(691373128);
			var3.offset += 2;
			int var5 = var3.readUnsignedShort(1609296968);
			int var6 = 0;
			int var7 = -1;
			int var8 = -1;
			var4.offset = var3.offset + var5;
			int var9;
			for (var9 = 0; var9 < var5; var9++) {
				int var10 = this.aClass330_Sub18_692.anIntArray7642[var9];
				if (var10 == 0) {
					var7 = var9;
				}
				int var11 = var3.readUnsignedByte(-68632903);
				if (var11 > 0) {
					if (var10 == 0) {
						var8 = var9;
					}
					aShortArray702[var6] = (short) var9;
					short var12 = 0;
					if (var10 == 3 || var10 == 10) {
						var12 = 128;
					}
					if ((var11 & 0x1) == 0) {
						aShortArray684[var6] = var12;
					} else {
						aShortArray684[var6] = (short) var4.method3764((byte) -109);
					}
					if ((var11 & 0x2) == 0) {
						aShortArray690[var6] = var12;
					} else {
						aShortArray690[var6] = (short) var4.method3764((byte) -55);
					}
					if ((var11 & 0x4) == 0) {
						aShortArray687[var6] = var12;
					} else {
						aShortArray687[var6] = (short) var4.method3764((byte) -68);
					}
					aByteArray689[var6] = (byte) (var11 >>> 3 & 0x3);
					if (var10 == 2 || var10 == 9) {
						aShortArray684[var6] = (short) (aShortArray684[var6] << 2 & 0x3FFF);
						aShortArray690[var6] = (short) (aShortArray690[var6] << 2 & 0x3FFF);
						aShortArray687[var6] = (short) (aShortArray687[var6] << 2 & 0x3FFF);
					}
					aShortArray685[var6] = -1;
					if (var10 == 1 || var10 == 2 || var10 == 3) {
						if (var7 > var8) {
							aShortArray685[var6] = (short) var7;
							var8 = var7;
						}
					} else if (var10 == 5) {
						this.aBoolean698 = true;
					} else if (var10 == 7) {
						this.aBoolean699 = true;
					} else if (var10 == 9 || var10 == 10 || var10 == 8) {
						this.aBoolean700 = true;
					}
					var6++;
				}
			}
			if (var4.offset != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt686 = var6;
			this.aShortArray696 = new short[var6];
			this.aShortArray691 = new short[var6];
			this.aShortArray694 = new short[var6];
			this.aShortArray695 = new short[var6];
			this.aShortArray693 = new short[var6];
			this.aByteArray697 = new byte[var6];
			for (var9 = 0; var9 < var6; var9++) {
				this.aShortArray696[var9] = aShortArray702[var9];
				this.aShortArray691[var9] = aShortArray684[var9];
				this.aShortArray694[var9] = aShortArray690[var9];
				this.aShortArray695[var9] = aShortArray687[var9];
				this.aShortArray693[var9] = aShortArray685[var9];
				this.aByteArray697[var9] = aByteArray689[var9];
			}
		} catch (Exception var13) {
			this.anInt686 = 0;
			this.aBoolean698 = false;
			this.aBoolean699 = false;
		}
	}
}
