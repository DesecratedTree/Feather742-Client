package deob;

public class Class302 {

	public Class292[] aClass292Array3060 = new Class292[10];

	public int anInt3062;

	public int anInt3063;

	public static int anInt3061 = 22050;

	public Class302(Buffer arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.readUnsignedByte(758774001);
			if (var3 != 0) {
				arg0.offset--;
				this.aClass292Array3060[var2] = new Class292();
				this.aClass292Array3060[var2].method2911(arg0);
			}
		}
		this.anInt3062 = arg0.readUnsignedShort(312501223);
		this.anInt3063 = arg0.readUnsignedShort(1227152724);
	}

	public Class330_Sub29_Sub1_Sub2 method2981() {
		byte[] var1 = this.method2984();
		return new Class330_Sub29_Sub1_Sub2(22050, var1, this.anInt3062 * 22050 / 1000, this.anInt3063 * 22050 / 1000);
	}

	public static Class302 method2982(IndexTable arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : new Class302(new Buffer(var3));
	}

	public final int method2983() {
		int var1 = 9999999;
		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (this.aClass292Array3060[var2] != null && this.aClass292Array3060[var2].anInt2984 / 20 < var1) {
				var1 = this.aClass292Array3060[var2].anInt2984 / 20;
			}
		}
		if (this.anInt3062 < this.anInt3063 && this.anInt3062 / 20 < var1) {
			var1 = this.anInt3062 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (var2 = 0; var2 < 10; var2++) {
			if (this.aClass292Array3060[var2] != null) {
				this.aClass292Array3060[var2].anInt2984 -= var1 * 20;
			}
		}
		if (this.anInt3062 < this.anInt3063) {
			this.anInt3062 -= var1 * 20;
			this.anInt3063 -= var1 * 20;
		}
		return var1;
	}

	public final byte[] method2984() {
		int var1 = 0;
		int var2;
		for (var2 = 0; var2 < 10; var2++) {
			if (this.aClass292Array3060[var2] != null && this.aClass292Array3060[var2].anInt2996 + this.aClass292Array3060[var2].anInt2984 > var1) {
				var1 = this.aClass292Array3060[var2].anInt2996 + this.aClass292Array3060[var2].anInt2984;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		var2 = var1 * 22050 / 1000;
		byte[] var3 = new byte[var2];
		for (int var4 = 0; var4 < 10; var4++) {
			if (this.aClass292Array3060[var4] != null) {
				int var5 = this.aClass292Array3060[var4].anInt2996 * 22050 / 1000;
				int var6 = this.aClass292Array3060[var4].anInt2984 * 22050 / 1000;
				int[] var7 = this.aClass292Array3060[var4].method2909(var5, this.aClass292Array3060[var4].anInt2996);
				for (int var8 = 0; var8 < var5; var8++) {
					int var9 = var3[var8 + var6] + (var7[var8] >> 8);
					if ((var9 + 128 & 0xFFFFFF00) != 0) {
						var9 = var9 >> 31 ^ 0x7F;
					}
					var3[var8 + var6] = (byte) var9;
				}
			}
		}
		return var3;
	}
}
