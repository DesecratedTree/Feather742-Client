package deob;

public class Class502 {

	public static int anInt5900 = 64;

	public static int anInt5901 = 10;

	public static long[][] aLongArrayArray5903 = new long[8][256];

	public static long[] aLongArray5904 = new long[11];

	public static String aString5908 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886";

	public static int anInt5911 = 512;

	public byte[] aByteArray5905 = new byte[32];

	public byte[] aByteArray5906 = new byte[64];

	public int anInt5907 = 0;

	public int anInt5899 = 0;

	public long[] aLongArray5909 = new long[8];

	public long[] aLongArray5910 = new long[8];

	public long[] aLongArray5902 = new long[8];

	public long[] aLongArray5912 = new long[8];

	public long[] aLongArray5913 = new long[8];

	static {
		int var0;
		for (var0 = 0; var0 < 256; var0++) {
			char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
			long var2 = (var0 & 0x1) == 0 ? (long) (var1 >>> 8) : (long) (var1 & 0xFF);
			long var4 = var2 << 1;
			if (var4 >= 256L) {
				var4 ^= 0x11DL;
			}
			long var6 = var4 << 1;
			if (var6 >= 256L) {
				var6 ^= 0x11DL;
			}
			long var8 = var6 ^ var2;
			long var10 = var6 << 1;
			if (var10 >= 256L) {
				var10 ^= 0x11DL;
			}
			long var12 = var10 ^ var2;
			aLongArrayArray5903[0][var0] = var2 << 56 | var2 << 48 | var6 << 40 | var2 << 32 | var10 << 24 | var8 << 16 | var4 << 8 | var12;
			for (int var14 = 1; var14 < 8; var14++) {
				aLongArrayArray5903[var14][var0] = aLongArrayArray5903[var14 - 1][var0] >>> 8 | aLongArrayArray5903[var14 - 1][var0] << 56;
			}
		}
		aLongArray5904[0] = 0L;
		for (var0 = 1; var0 <= 10; var0++) {
			int var15 = (var0 - 1) * 8;
			aLongArray5904[var0] = aLongArrayArray5903[0][var15] & 0xFF00000000000000L ^ aLongArrayArray5903[1][var15 + 1] & 0xFF000000000000L ^ aLongArrayArray5903[2][var15 + 2] & 0xFF0000000000L ^ aLongArrayArray5903[3][var15 + 3] & 0xFF00000000L ^ aLongArrayArray5903[4][var15 + 4] & 0xFF000000L ^ aLongArrayArray5903[5][var15 + 5] & 0xFF0000L ^ aLongArrayArray5903[6][var15 + 6] & 0xFF00L ^ aLongArrayArray5903[7][var15 + 7] & 0xFFL;
		}
	}

	public void method6128(byte[] arg0, long arg1) {
		try {
			int var4 = 0;
			int var5 = 8 - ((int) arg1 & 0x7) & 0x7;
			int var6 = this.anInt5907 & 0x7;
			long var7 = arg1;
			int var9 = 31;
			int var10 = 0;
			while (var9 >= 0) {
				var10 += ((int) var7 & 0xFF) + (this.aByteArray5905[var9] & 0xFF);
				this.aByteArray5905[var9] = (byte) var10;
				var10 >>>= 0x8;
				var7 >>>= 0x8;
				var9--;
			}
			int var11;
			while (arg1 > 8L) {
				var11 = arg0[var4] << var5 & 0xFF | (arg0[var4 + 1] & 0xFF) >>> 8 - var5;
				if (var11 < 0 || var11 >= 256) {
					throw new RuntimeException();
				}
				this.aByteArray5906[this.anInt5899 * 935018147 * -2119539445] = (byte) (this.aByteArray5906[this.anInt5899 * 935018147 * -2119539445] | var11 >>> var6);
				this.anInt5899++;
				this.anInt5907 += 8 - var6;
				if (this.anInt5907 == 512) {
					this.method6129((byte) 79);
					this.anInt5899 = 0;
					this.anInt5907 = 0;
				}
				this.aByteArray5906[this.anInt5899] = (byte) (var11 << 8 - var6 & 0xFF);
				this.anInt5907 += var6;
				arg1 -= 8L;
				var4++;
			}
			if (arg1 > 0L) {
				var11 = arg0[var4] << var5 & 0xFF;
				this.aByteArray5906[this.anInt5899 * 935018147 * -2119539445] = (byte) (this.aByteArray5906[this.anInt5899 * 935018147 * -2119539445] | var11 >>> var6);
			} else {
				var11 = 0;
			}
			if (arg1 + (long) var6 < 8L) {
				this.anInt5907 = (int) ((long) (this.anInt5907 * 1391251059) + arg1 * 1391251059L) * -1728608581;
			} else {
				this.anInt5899++;
				this.anInt5907 += 8 - var6;
				arg1 -= 8 - var6;
				if (this.anInt5907 == 512) {
					this.method6129((byte) 55);
					this.anInt5899 = 0;
					this.anInt5907 = 0;
				}
				this.aByteArray5906[this.anInt5899] = (byte) (var11 << 8 - var6 & 0xFF);
				this.anInt5907 += (int) arg1;
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "us.i(" + ')');
		}
	}

	public void method6129(byte arg0) {
		try {
			int var2 = 0;
			int var3 = 0;
			while (var2 < 8) {
				this.aLongArray5912[var2] = (long) this.aByteArray5906[var3] << 56 ^ ((long) this.aByteArray5906[var3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray5906[var3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray5906[var3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray5906[var3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray5906[var3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray5906[var3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray5906[var3 + 7] & 0xFFL;
				var2++;
				var3 += 8;
			}
			for (var2 = 0; var2 < 8; var2++) {
				this.aLongArray5913[var2] = this.aLongArray5912[var2] ^ (this.aLongArray5910[var2] = this.aLongArray5909[var2]);
			}
			for (var2 = 1; var2 <= 10; var2++) {
				int var4;
				int var5;
				for (var3 = 0; var3 < 8; var3++) {
					this.aLongArray5902[var3] = 0L;
					var4 = 0;
					var5 = 56;
					while (var4 < 8) {
						this.aLongArray5902[var3] ^= aLongArrayArray5903[var4][(int) (this.aLongArray5910[var3 - var4 & 0x7] >>> var5) & 0xFF];
						var4++;
						var5 -= 8;
					}
				}
				for (var3 = 0; var3 < 8; var3++) {
					this.aLongArray5910[var3] = this.aLongArray5902[var3];
				}
				this.aLongArray5910[0] ^= aLongArray5904[var2];
				for (var3 = 0; var3 < 8; var3++) {
					this.aLongArray5902[var3] = this.aLongArray5910[var3];
					var4 = 0;
					var5 = 56;
					while (var4 < 8) {
						this.aLongArray5902[var3] ^= aLongArrayArray5903[var4][(int) (this.aLongArray5913[var3 - var4 & 0x7] >>> var5) & 0xFF];
						var4++;
						var5 -= 8;
					}
				}
				for (var3 = 0; var3 < 8; var3++) {
					this.aLongArray5913[var3] = this.aLongArray5902[var3];
				}
			}
			for (var2 = 0; var2 < 8; var2++) {
				this.aLongArray5909[var2] ^= this.aLongArray5913[var2] ^ this.aLongArray5912[var2];
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "us.r(" + ')');
		}
	}

	public void method6130(int arg0) {
		try {
			int var2;
			for (var2 = 0; var2 < 32; var2++) {
				this.aByteArray5905[var2] = 0;
			}
			this.anInt5899 = 0;
			this.anInt5907 = 0;
			this.aByteArray5906[0] = 0;
			for (var2 = 0; var2 < 8; var2++) {
				this.aLongArray5909[var2] = 0L;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "us.j(" + ')');
		}
	}

	public void method6131(byte[] arg0, int arg1, int arg2) {
		try {
			this.aByteArray5906[this.anInt5899 * -2119539445 * 935018147] = (byte) (this.aByteArray5906[this.anInt5899 * -2119539445 * 935018147] | 0x80 >>> (this.anInt5907 & 0x7));
			this.anInt5899++;
			if (this.anInt5899 > 32) {
				while (true) {
					if (this.anInt5899 >= 64) {
						this.method6129((byte) 63);
						this.anInt5899 = 0;
						break;
					}
					this.aByteArray5906[++this.anInt5899 - 1] = 0;
				}
			}
			while (this.anInt5899 < 32) {
				this.aByteArray5906[++this.anInt5899 - 1] = 0;
			}
			System.arraycopy(this.aByteArray5905, 0, this.aByteArray5906, 32, 32);
			this.method6129((byte) 8);
			int var4 = 0;
			int var5 = arg1;
			while (var4 < 8) {
				long var6 = this.aLongArray5909[var4];
				arg0[var5] = (byte) (var6 >>> 56);
				arg0[var5 + 1] = (byte) (var6 >>> 48);
				arg0[var5 + 2] = (byte) (var6 >>> 40);
				arg0[var5 + 3] = (byte) (var6 >>> 32);
				arg0[var5 + 4] = (byte) (var6 >>> 24);
				arg0[var5 + 5] = (byte) (var6 >>> 16);
				arg0[var5 + 6] = (byte) (var6 >>> 8);
				arg0[var5 + 7] = (byte) var6;
				var4++;
				var5 += 8;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "us.p(" + ')');
		}
	}

	public static void method6132(int arg0, byte arg1) {
		try {
			Class330_Sub43 var2 = (Class330_Sub43) Class442.aClass497_4489.method6094((long) arg0);
			if (var2 != null) {
				var2.aClass324_Sub1_7825.method3185(1439950216);
				Class147.method1742(var2.anInt7819, var2.aBoolean7822, 841015966);
				var2.method3252(-1936698621);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "us.i(" + ')');
		}
	}
}
