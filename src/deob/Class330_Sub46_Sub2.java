package deob;

public class Class330_Sub46_Sub2 extends Buffer {

	public static int[] anIntArray9834 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	public int anInt9836;

	public IsaacCipher aClass488_9835;

	public void method3820(int arg0) {
		try {
			this.anInt9836 = this.offset * 8;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajw.if(" + ')');
		}
	}

	public void method3821(IsaacCipher arg0, int arg1) {
		try {
			this.aClass488_9835 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajw.ia(" + ')');
		}
	}

	public void method3822(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 + this.aClass488_9835.method6043(6862074));
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajw.ik(" + ')');
		}
	}

	public int readBits(int arg0) {
		try {
			int var2 = this.anInt9836 >> 3;
			int var3 = 8 - (this.anInt9836 & 0x7);
			int var4 = 0;
			this.anInt9836 += arg0;
			while (arg0 > var3) {
				var4 += (this.payload[var2++] & anIntArray9834[var3]) << arg0 - var3;
				arg0 -= var3;
				var3 = 8;
			}
			if (var3 == arg0) {
				var4 += this.payload[var2] & anIntArray9834[var3];
			} else {
				var4 += this.payload[var2] >> var3 - arg0 & anIntArray9834[arg0];
			}
			return var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ajw.ib(" + ')');
		}
	}

	public void method3824(int arg0) {
		try {
			this.offset = (this.anInt9836 + 7) / 8;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajw.ig(" + ')');
		}
	}

	public boolean method3825(byte arg0) {
		try {
			int var2 = this.payload[this.offset] - this.aClass488_9835.method6042(1184443673) & 0xFF;
			return var2 >= 128;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajw.iz(" + ')');
		}
	}

	public Class330_Sub46_Sub2(int arg0) {
		super(arg0);
	}

	public int method3826(int arg0) {
		try {
			int var2 = this.payload[++this.offset - 1] - this.aClass488_9835.method6043(55465209) & 0xFF;
			return var2 < 128 ? var2 : (var2 - 128 << 8) + (this.payload[++this.offset - 1] - this.aClass488_9835.method6043(-1607658812) & 0xFF);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajw.il(" + ')');
		}
	}

	public int method3827(int arg0, int arg1) {
		try {
			return arg0 * 8 - this.anInt9836;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ajw.ix(" + ')');
		}
	}

	public void method3828(byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			for (int var5 = 0; var5 < arg2; var5++) {
				arg0[var5 + arg1] = (byte) (this.payload[++this.offset - 1] - this.aClass488_9835.method6043(-1897927850));
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ajw.iw(" + ')');
		}
	}
}
