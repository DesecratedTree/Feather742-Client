package deob;

import java.io.IOException;

public class Class324_Sub1 extends Class324 {

	public byte[][] aByteArrayArray7464 = new byte[10][];

	public Buffer aClass330_Sub46_7465 = new Buffer(null);

	public Buffer aClass330_Sub46_7470 = new Buffer(null);

	public IndexTable aClass280_7463;

	public int anInt7466;

	public static int anInt7469 = 10;

	public int anInt7468;

	public int[] anIntArray7467;

	public Class324_Sub1(int arg0, IndexTable arg1, int arg2) {
		super(arg0);
		this.aClass280_7463 = arg1;
		this.anInt7466 = arg2;
	}

	public int method3193(byte[] arg0) throws IOException {
		int var3;
		int var4;
		if (this.anIntArray7467 == null) {
			if (!this.aClass280_7463.hasStoredFile(this.anInt7466 * 1124771241 * 768462489, 0, (byte) 32)) {
				return 0;
			}
			byte[] var2 = this.aClass280_7463.getFile(this.anInt7466 * 768462489 * 1124771241, 0);
			if (var2 == null) {
				throw new IllegalStateException("");
			}
			this.aClass330_Sub46_7470.payload = var2;
			this.aClass330_Sub46_7470.offset = 0 * -824785231;
			var3 = var2.length >> 1;
			this.anIntArray7467 = new int[var3];
			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray7467[var4] = this.aClass330_Sub46_7470.readUnsignedShort(1525848161);
			}
		}
		if (this.anInt7468 * -646405669 * -1032818093 >= this.anIntArray7467.length) {
			return -1;
		}
		this.method3203(-928633477);
		this.aClass330_Sub46_7470.payload = arg0;
		this.aClass330_Sub46_7470.offset = 0 * -824785231;
		do {
			if (this.aClass330_Sub46_7470.offset * 323600977 * -824785231 >= this.aClass330_Sub46_7470.payload.length) {
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			if (this.aClass330_Sub46_7465.payload == null) {
				if (this.aByteArrayArray7464[0] == null) {
					this.aClass330_Sub46_7470.payload = null;
					return this.aClass330_Sub46_7470.offset * 323600977 * -824785231;
				}
				this.aClass330_Sub46_7465.payload = this.aByteArrayArray7464[0];
			}
			int var5 = this.aClass330_Sub46_7470.payload.length - this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
			var3 = this.aClass330_Sub46_7465.payload.length - this.aClass330_Sub46_7465.offset * -824785231 * 323600977;
			if (var5 < var3) {
				this.aClass330_Sub46_7465.readBytes(this.aClass330_Sub46_7470.payload, this.aClass330_Sub46_7470.offset * 323600977 * -824785231, var5, 1274334002);
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			this.aClass330_Sub46_7470.method3749(this.aClass330_Sub46_7465.payload, this.aClass330_Sub46_7465.offset * -824785231 * 323600977, var3, (byte) -93);
			this.aClass330_Sub46_7465.payload = null;
			this.aClass330_Sub46_7465.offset = 0 * -824785231;
			this.anInt7468 = (this.anInt7468 * -1032818093 + -1032818093) * -646405669;
			for (var4 = 0; var4 < 9; var4++) {
				this.aByteArrayArray7464[var4] = this.aByteArrayArray7464[var4 + 1];
			}
			this.aByteArrayArray7464[9] = null;
		} while (this.anInt7468 * -646405669 * -1032818093 < this.anIntArray7467.length);
		this.aClass330_Sub46_7470.payload = null;
		return this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
	}

	public int method3194(byte[] arg0) throws IOException {
		int var3;
		int var4;
		if (this.anIntArray7467 == null) {
			if (!this.aClass280_7463.hasStoredFile(this.anInt7466 * 1124771241 * 768462489, 0, (byte) 32)) {
				return 0;
			}
			byte[] var2 = this.aClass280_7463.getFile(this.anInt7466 * 768462489 * 1124771241, 0);
			if (var2 == null) {
				throw new IllegalStateException("");
			}
			this.aClass330_Sub46_7470.payload = var2;
			this.aClass330_Sub46_7470.offset = 0 * -824785231;
			var3 = var2.length >> 1;
			this.anIntArray7467 = new int[var3];
			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray7467[var4] = this.aClass330_Sub46_7470.readUnsignedShort(1514042031);
			}
		}
		if (this.anInt7468 * -646405669 * -1032818093 >= this.anIntArray7467.length) {
			return -1;
		}
		this.method3203(-604233515);
		this.aClass330_Sub46_7470.payload = arg0;
		this.aClass330_Sub46_7470.offset = 0 * -824785231;
		do {
			if (this.aClass330_Sub46_7470.offset * 323600977 * -824785231 >= this.aClass330_Sub46_7470.payload.length) {
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			if (this.aClass330_Sub46_7465.payload == null) {
				if (this.aByteArrayArray7464[0] == null) {
					this.aClass330_Sub46_7470.payload = null;
					return this.aClass330_Sub46_7470.offset * 323600977 * -824785231;
				}
				this.aClass330_Sub46_7465.payload = this.aByteArrayArray7464[0];
			}
			int var5 = this.aClass330_Sub46_7470.payload.length - this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
			var3 = this.aClass330_Sub46_7465.payload.length - this.aClass330_Sub46_7465.offset * -824785231 * 323600977;
			if (var5 < var3) {
				this.aClass330_Sub46_7465.readBytes(this.aClass330_Sub46_7470.payload, this.aClass330_Sub46_7470.offset * 323600977 * -824785231, var5, 1274334002);
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			this.aClass330_Sub46_7470.method3749(this.aClass330_Sub46_7465.payload, this.aClass330_Sub46_7465.offset * -824785231 * 323600977, var3, (byte) -76);
			this.aClass330_Sub46_7465.payload = null;
			this.aClass330_Sub46_7465.offset = 0 * -824785231;
			this.anInt7468 = (this.anInt7468 * -1032818093 + -1032818093) * -646405669;
			for (var4 = 0; var4 < 9; var4++) {
				this.aByteArrayArray7464[var4] = this.aByteArrayArray7464[var4 + 1];
			}
			this.aByteArrayArray7464[9] = null;
		} while (this.anInt7468 * -646405669 * -1032818093 < this.anIntArray7467.length);
		this.aClass330_Sub46_7470.payload = null;
		return this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
	}

	public int method3181(byte[] arg0, byte arg1) throws IOException {
		try {
			int var4;
			int var5;
			if (this.anIntArray7467 == null) {
				if (!this.aClass280_7463.hasStoredFile(this.anInt7466, 0, (byte) 32)) {
					return 0;
				}
				byte[] var3 = this.aClass280_7463.getFile(this.anInt7466, 0);
				if (var3 == null) {
					throw new IllegalStateException("");
				}
				this.aClass330_Sub46_7470.payload = var3;
				this.aClass330_Sub46_7470.offset = 0;
				var4 = var3.length >> 1;
				this.anIntArray7467 = new int[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray7467[var5] = this.aClass330_Sub46_7470.readUnsignedShort(1692619087);
				}
			}
			if (this.anInt7468 >= this.anIntArray7467.length) {
				return -1;
			}
			this.method3203(306486370);
			this.aClass330_Sub46_7470.payload = arg0;
			this.aClass330_Sub46_7470.offset = 0;
			do {
				if (this.aClass330_Sub46_7470.offset >= this.aClass330_Sub46_7470.payload.length) {
					this.aClass330_Sub46_7470.payload = null;
					return arg0.length;
				}
				if (this.aClass330_Sub46_7465.payload == null) {
					if (this.aByteArrayArray7464[0] == null) {
						this.aClass330_Sub46_7470.payload = null;
						return this.aClass330_Sub46_7470.offset;
					}
					this.aClass330_Sub46_7465.payload = this.aByteArrayArray7464[0];
				}
				int var7 = this.aClass330_Sub46_7470.payload.length - this.aClass330_Sub46_7470.offset;
				var4 = this.aClass330_Sub46_7465.payload.length - this.aClass330_Sub46_7465.offset;
				if (var7 < var4) {
					this.aClass330_Sub46_7465.readBytes(this.aClass330_Sub46_7470.payload, this.aClass330_Sub46_7470.offset, var7, 1274334002);
					this.aClass330_Sub46_7470.payload = null;
					return arg0.length;
				}
				this.aClass330_Sub46_7470.method3749(this.aClass330_Sub46_7465.payload, this.aClass330_Sub46_7465.offset, var4, (byte) -35);
				this.aClass330_Sub46_7465.payload = null;
				this.aClass330_Sub46_7465.offset = 0;
				this.anInt7468++;
				for (var5 = 0; var5 < 9; var5++) {
					this.aByteArrayArray7464[var5] = this.aByteArrayArray7464[var5 + 1];
				}
				this.aByteArrayArray7464[9] = null;
			} while (this.anInt7468 < this.anIntArray7467.length);
			this.aClass330_Sub46_7470.payload = null;
			return this.aClass330_Sub46_7470.offset;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aen.r(" + ')');
		}
	}

	public int method3192(byte[] arg0) throws IOException {
		int var3;
		int var4;
		if (this.anIntArray7467 == null) {
			if (!this.aClass280_7463.hasStoredFile(this.anInt7466 * 1124771241 * 768462489, 0, (byte) 32)) {
				return 0;
			}
			byte[] var2 = this.aClass280_7463.getFile(this.anInt7466 * 768462489 * 1124771241, 0);
			if (var2 == null) {
				throw new IllegalStateException("");
			}
			this.aClass330_Sub46_7470.payload = var2;
			this.aClass330_Sub46_7470.offset = 0 * -824785231;
			var3 = var2.length >> 1;
			this.anIntArray7467 = new int[var3];
			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray7467[var4] = this.aClass330_Sub46_7470.readUnsignedShort(1824220363);
			}
		}
		if (this.anInt7468 * -646405669 * -1032818093 >= this.anIntArray7467.length) {
			return -1;
		}
		this.method3203(957942079);
		this.aClass330_Sub46_7470.payload = arg0;
		this.aClass330_Sub46_7470.offset = 0 * -824785231;
		do {
			if (this.aClass330_Sub46_7470.offset * 323600977 * -824785231 >= this.aClass330_Sub46_7470.payload.length) {
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			if (this.aClass330_Sub46_7465.payload == null) {
				if (this.aByteArrayArray7464[0] == null) {
					this.aClass330_Sub46_7470.payload = null;
					return this.aClass330_Sub46_7470.offset * 323600977 * -824785231;
				}
				this.aClass330_Sub46_7465.payload = this.aByteArrayArray7464[0];
			}
			int var5 = this.aClass330_Sub46_7470.payload.length - this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
			var3 = this.aClass330_Sub46_7465.payload.length - this.aClass330_Sub46_7465.offset * -824785231 * 323600977;
			if (var5 < var3) {
				this.aClass330_Sub46_7465.readBytes(this.aClass330_Sub46_7470.payload, this.aClass330_Sub46_7470.offset * 323600977 * -824785231, var5, 1274334002);
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			this.aClass330_Sub46_7470.method3749(this.aClass330_Sub46_7465.payload, this.aClass330_Sub46_7465.offset * -824785231 * 323600977, var3, (byte) -67);
			this.aClass330_Sub46_7465.payload = null;
			this.aClass330_Sub46_7465.offset = 0 * -824785231;
			this.anInt7468 = (this.anInt7468 * -1032818093 + -1032818093) * -646405669;
			for (var4 = 0; var4 < 9; var4++) {
				this.aByteArrayArray7464[var4] = this.aByteArrayArray7464[var4 + 1];
			}
			this.aByteArrayArray7464[9] = null;
		} while (this.anInt7468 * -646405669 * -1032818093 < this.anIntArray7467.length);
		this.aClass330_Sub46_7470.payload = null;
		return this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
	}

	public void method3203(int arg0) {
		try {
			if (this.anIntArray7467 != null) {
				for (int var2 = 0; var2 < 10 && var2 + this.anInt7468 < this.anIntArray7467.length; var2++) {
					if (this.aByteArrayArray7464[var2] == null && this.aClass280_7463.hasStoredFile(this.anIntArray7467[this.anInt7468 + var2], 0, (byte) 32)) {
						this.aByteArrayArray7464[var2] = this.aClass280_7463.getFile(this.anIntArray7467[this.anInt7468 + var2], 0);
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aen.ah(" + ')');
		}
	}

	public int method3195(byte[] arg0) throws IOException {
		int var3;
		int var4;
		if (this.anIntArray7467 == null) {
			if (!this.aClass280_7463.hasStoredFile(this.anInt7466 * 1124771241 * 768462489, 0, (byte) 32)) {
				return 0;
			}
			byte[] var2 = this.aClass280_7463.getFile(this.anInt7466 * 768462489 * 1124771241, 0);
			if (var2 == null) {
				throw new IllegalStateException("");
			}
			this.aClass330_Sub46_7470.payload = var2;
			this.aClass330_Sub46_7470.offset = 0 * -824785231;
			var3 = var2.length >> 1;
			this.anIntArray7467 = new int[var3];
			for (var4 = 0; var4 < var3; var4++) {
				this.anIntArray7467[var4] = this.aClass330_Sub46_7470.readUnsignedShort(-285198389);
			}
		}
		if (this.anInt7468 * -646405669 * -1032818093 >= this.anIntArray7467.length) {
			return -1;
		}
		this.method3203(-580793514);
		this.aClass330_Sub46_7470.payload = arg0;
		this.aClass330_Sub46_7470.offset = 0 * -824785231;
		do {
			if (this.aClass330_Sub46_7470.offset * 323600977 * -824785231 >= this.aClass330_Sub46_7470.payload.length) {
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			if (this.aClass330_Sub46_7465.payload == null) {
				if (this.aByteArrayArray7464[0] == null) {
					this.aClass330_Sub46_7470.payload = null;
					return this.aClass330_Sub46_7470.offset * 323600977 * -824785231;
				}
				this.aClass330_Sub46_7465.payload = this.aByteArrayArray7464[0];
			}
			int var5 = this.aClass330_Sub46_7470.payload.length - this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
			var3 = this.aClass330_Sub46_7465.payload.length - this.aClass330_Sub46_7465.offset * -824785231 * 323600977;
			if (var5 < var3) {
				this.aClass330_Sub46_7465.readBytes(this.aClass330_Sub46_7470.payload, this.aClass330_Sub46_7470.offset * 323600977 * -824785231, var5, 1274334002);
				this.aClass330_Sub46_7470.payload = null;
				return arg0.length;
			}
			this.aClass330_Sub46_7470.method3749(this.aClass330_Sub46_7465.payload, this.aClass330_Sub46_7465.offset * -824785231 * 323600977, var3, (byte) -43);
			this.aClass330_Sub46_7465.payload = null;
			this.aClass330_Sub46_7465.offset = 0 * -824785231;
			this.anInt7468 = (this.anInt7468 * -1032818093 + -1032818093) * -646405669;
			for (var4 = 0; var4 < 9; var4++) {
				this.aByteArrayArray7464[var4] = this.aByteArrayArray7464[var4 + 1];
			}
			this.aByteArrayArray7464[9] = null;
		} while (this.anInt7468 * -646405669 * -1032818093 < this.anIntArray7467.length);
		this.aClass330_Sub46_7470.payload = null;
		return this.aClass330_Sub46_7470.offset * -824785231 * 323600977;
	}
}
