package deob;

public class Class330_Sub36_Sub9 extends Class330_Sub36 {

	public String aString9683;

	public char[] aCharArray9685;

	public char[] aCharArray9687;

	public int[] anIntArray9684;

	public int[] anIntArray9686;

	public int method3475(char arg0, int arg1) {
		try {
			if (this.anIntArray9686 == null) {
				return -1;
			}
			for (int var3 = 0; var3 < this.anIntArray9686.length; var3++) {
				if (arg0 == this.aCharArray9687[var3]) {
					return this.anIntArray9686[var3];
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajh.p(" + ')');
		}
	}

	public void method3476(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(44353150);
				if (var3 == 0) {
					if (arg1 == 1) {
					}
					return;
				}
				this.method3478(arg0, var3, (byte) 0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajh.r(" + ')');
		}
	}

	public int method3477(char arg0, int arg1) {
		try {
			if (this.anIntArray9684 == null) {
				return -1;
			}
			for (int var3 = 0; var3 < this.anIntArray9684.length; var3++) {
				if (this.aCharArray9685[var3] == arg0) {
					return this.anIntArray9684[var3];
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajh.i(" + ')');
		}
	}

	public void method3478(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aString9683 = arg0.readString(1344116228);
			} else {
				int var4;
				int var5;
				byte var6;
				if (arg1 == 2) {
					var4 = arg0.readUnsignedByte(888920228);
					this.anIntArray9684 = new int[var4];
					this.aCharArray9685 = new char[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray9684[var5] = arg0.readUnsignedShort(900531876);
						var6 = arg0.readByte((byte) 50);
						this.aCharArray9685[var5] = var6 == 0 ? 0 : Class127.method1546(var6, -2006988968);
					}
				} else if (arg1 == 3) {
					var4 = arg0.readUnsignedByte(1195026007);
					this.anIntArray9686 = new int[var4];
					this.aCharArray9687 = new char[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray9686[var5] = arg0.readUnsignedShort(1233380124);
						var6 = arg0.readByte((byte) 90);
						this.aCharArray9687[var5] = var6 == 0 ? 0 : Class127.method1546(var6, -2113515503);
					}
				} else if (arg1 == 4) {
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ajh.j(" + ')');
		}
	}

	public void method3479(int arg0) {
		try {
			int var2;
			if (this.anIntArray9686 != null) {
				for (var2 = 0; var2 < this.anIntArray9686.length; var2++) {
					this.anIntArray9686[var2] |= 0x8000;
				}
			}
			if (this.anIntArray9684 != null) {
				for (var2 = 0; var2 < this.anIntArray9684.length; var2++) {
					this.anIntArray9684[var2] |= 0x8000;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajh.o(" + ')');
		}
	}
}
