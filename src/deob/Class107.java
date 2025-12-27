package deob;

public class Class107 {

	public static int anInt1011 = 0;

	public static int anInt1014 = 500000;

	public static byte[] aByteArray1019 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static int anInt1021 = 1;

	public static int anInt1022 = 2;

	public static int anInt1023 = 1;

	public Buffer aClass330_Sub46_1017 = new Buffer(null);

	public int anInt1013;

	public int anInt1016;

	public long aLong1018;

	public int[] anIntArray1010;

	public int[] anIntArray1012;

	public int[] anIntArray1015;

	public int[] anIntArray1020;

	public int method1328() {
		return this.anIntArray1020.length;
	}

	public void method1329(byte[] arg0) {
		this.aClass330_Sub46_1017.payload = arg0;
		this.aClass330_Sub46_1017.offset = 10;
		int var2 = this.aClass330_Sub46_1017.readUnsignedShort(1408229597);
		this.anInt1013 = this.aClass330_Sub46_1017.readUnsignedShort(-100350412);
		this.anInt1016 = 500000;
		this.anIntArray1010 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.aClass330_Sub46_1017.readInt((byte) 97);
			int var5 = this.aClass330_Sub46_1017.readInt((byte) 78);
			if (var4 == 1297379947) {
				this.anIntArray1010[var3] = this.aClass330_Sub46_1017.offset;
				var3++;
			}
			this.aClass330_Sub46_1017.offset += var5;
		}
		this.aLong1018 = 0L;
		this.anIntArray1020 = new int[var2];
		for (var3 = 0; var3 < var2; var3++) {
			this.anIntArray1020[var3] = this.anIntArray1010[var3];
		}
		this.anIntArray1012 = new int[var2];
		this.anIntArray1015 = new int[var2];
	}

	public void method1330() {
		this.aClass330_Sub46_1017.payload = null;
		this.anIntArray1010 = null;
		this.anIntArray1020 = null;
		this.anIntArray1012 = null;
		this.anIntArray1015 = null;
	}

	public boolean method1331() {
		return this.aClass330_Sub46_1017.payload != null;
	}

	public long method1332(int arg0) {
		return this.aLong1018 + (long) arg0 * (long) this.anInt1016;
	}

	public void method1333(int arg0) {
		this.aClass330_Sub46_1017.offset = this.anIntArray1020[arg0];
	}

	public void method1334(int arg0) {
		int var2 = this.aClass330_Sub46_1017.method3770(485008648);
		this.anIntArray1012[arg0] += var2;
	}

	public int method1335(int arg0) {
		return this.method1342(arg0);
	}

	public int method1336(int arg0, int arg1) {
		int var4;
		if (arg1 != 255) {
			byte var3 = aByteArray1019[arg1 - 128];
			var4 = arg1;
			if (var3 >= 1) {
				var4 = arg1 | this.aClass330_Sub46_1017.readUnsignedByte(2118370422) << 8;
			}
			if (var3 >= 2) {
				var4 |= this.aClass330_Sub46_1017.readUnsignedByte(1186048405) << 16;
			}
			return var4;
		}
		int var7 = this.aClass330_Sub46_1017.readUnsignedByte(2068058038);
		var4 = this.aClass330_Sub46_1017.method3770(485008648);
		if (var7 == 47) {
			this.aClass330_Sub46_1017.offset += var4;
			return 1;
		} else if (var7 == 81) {
			int var5 = this.aClass330_Sub46_1017.readUnsignedTriByte(-1401356047);
			var4 -= 3;
			int var6 = this.anIntArray1012[arg0];
			this.aLong1018 += (long) var6 * (long) (this.anInt1016 - var5);
			this.anInt1016 = var5;
			this.aClass330_Sub46_1017.offset += var4;
			return 2;
		} else {
			this.aClass330_Sub46_1017.offset += var4;
			return 3;
		}
	}

	public void method1337(long arg0) {
		this.aLong1018 = arg0;
		int var3 = this.anIntArray1020.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.anIntArray1012[var4] = 0;
			this.anIntArray1015[var4] = 0;
			this.aClass330_Sub46_1017.offset = this.anIntArray1010[var4];
			this.method1334(var4);
			this.anIntArray1020[var4] = this.aClass330_Sub46_1017.offset;
		}
	}

	public boolean method1338() {
		int var1 = this.anIntArray1020.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.anIntArray1020[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	public int method1339() {
		int var1 = this.anIntArray1020.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.anIntArray1020[var4] >= 0 && this.anIntArray1012[var4] < var3) {
				var2 = var4;
				var3 = this.anIntArray1012[var4];
			}
		}
		return var2;
	}

	public void method1340(int arg0) {
		this.anIntArray1020[arg0] = this.aClass330_Sub46_1017.offset;
	}

	public Class107() {
	}

	public Class107(byte[] arg0) {
		this.method1329(arg0);
	}

	public void method1341() {
		this.aClass330_Sub46_1017.offset = -1;
	}

	public int method1342(int arg0) {
		byte var2 = this.aClass330_Sub46_1017.payload[this.aClass330_Sub46_1017.offset];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 0xFF;
			this.anIntArray1015[arg0] = var5;
			this.aClass330_Sub46_1017.offset++;
		} else {
			var5 = this.anIntArray1015[arg0];
		}
		if (var5 != 240 && var5 != 247) {
			return this.method1336(arg0, var5);
		}
		int var3 = this.aClass330_Sub46_1017.method3770(485008648);
		if (var5 == 247 && var3 > 0) {
			int var4 = this.aClass330_Sub46_1017.payload[this.aClass330_Sub46_1017.offset] & 0xFF;
			if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
				this.aClass330_Sub46_1017.offset++;
				this.anIntArray1015[arg0] = var4;
				return this.method1336(arg0, var4);
			}
		}
		this.aClass330_Sub46_1017.offset += var3;
		return 0;
	}
}
