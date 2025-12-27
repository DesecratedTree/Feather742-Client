package deob;

import java.math.BigInteger;

public class Buffer extends Class330 {

	public static int anInt7843 = 5000;

	public static int[] anIntArray7845 = new int[256];

	public static int anInt7847 = -306674912;

	public static long aLong7848 = -3932672073523589310L;

	public static int anInt7849 = 100;

	public static long[] aLongArray7850;

	public byte[] payload;

	public int offset;

	static {
		int var0;
		for (var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			anIntArray7845[var0] = var1;
		}
		aLongArray7850 = new long[256];
		for (var0 = 0; var0 < 256; var0++) {
			long var4 = (long) var0;
			for (int var3 = 0; var3 < 8; var3++) {
				if ((var4 & 0x1L) == 1L) {
					var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var4 >>>= 0x1;
				}
			}
			aLongArray7850[var0] = var4;
		}
	}

	public Buffer(byte[] arg0) {
		this.payload = arg0;
		this.offset = 0;
	}

	public void method3739(byte arg0) {
		try {
			if (this.payload != null) {
				Class50.method631(this.payload, (byte) 56);
			}
			this.payload = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aea.i(" + ')');
		}
	}

	public void addByte(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.p(" + ')');
		}
	}

	public void addShort(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.o(" + ')');
		}
	}

	public void method3742(int arg0, short arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.s(" + ')');
		}
	}

	public void method3743(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.f(" + ')');
		}
	}

	public void addInt(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.z(" + ')');
		}
	}

	public byte readByte(byte arg0) {
		try {
			return this.payload[++this.offset - 1];
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.al(" + ')');
		}
	}

	public String readString(int arg0) {
		try {
			int var2 = this.offset;
			while (this.payload[++this.offset - 1] != 0) {
				if (arg0 <= -1676046053) {
				}
			}
			int var3 = this.offset - var2 - 1;
			if (var3 == 0) {
				return "";
			} else {
				return Class125.method1525(this.payload, var2, var3, (byte) 1);
			}
		} catch (ArrayIndexOutOfBoundsException var4) {
			var4.printStackTrace();
			return "";
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aea.ab(" + ')');
		}
	}

	public void method3747(long arg0, int arg1, byte arg2) {
		try {
			int var7 = arg1 - 1;
			if (var7 < 0 || var7 > 7) {
				throw new IllegalArgumentException();
			}
			for (int var5 = var7 * 8; var5 >= 0; var5 -= 8) {
				this.payload[++this.offset - 1] = (byte) (arg0 >> var5);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.b(" + ')');
		}
	}

	public void addString(String arg0, byte arg1) {
		try {
			int var3 = arg0.indexOf(0);
			if (var3 >= 0) {
				throw new IllegalArgumentException("");
			}
			this.offset += Class275.method2717(arg0, 0, arg0.length(), this.payload, this.offset, 420148766);
			this.payload[++this.offset - 1] = 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.x(" + ')');
		}
	}

	public void method3749(byte[] arg0, int arg1, int arg2, byte arg3) {
		try {
			for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
				this.payload[++this.offset - 1] = arg0[var5];
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.m(" + ')');
		}
	}

	public void method3750(int arg0, int arg1) {
		try {
			this.payload[this.offset - arg0 - 4] = (byte) (arg0 >> 24);
			this.payload[this.offset - arg0 - 3] = (byte) (arg0 >> 16);
			this.payload[this.offset - arg0 - 2] = (byte) (arg0 >> 8);
			this.payload[this.offset - arg0 - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.t(" + ')');
		}
	}

	public void method3751(int arg0, int arg1) {
		try {
			this.payload[this.offset - arg0 - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.y(" + ')');
		}
	}

	public void method3752(int arg0, int arg1) {
		try {
			if (arg0 >= 0 && arg0 < 128) {
				this.addByte(arg0, (byte) 26);
			} else if (arg0 >= 0 && arg0 < 32768) {
				this.addShort(arg0 + 32768, (byte) 24);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.v(" + ')');
		}
	}

	public void method3753(int arg0, int arg1) {
		try {
			if ((arg0 & 0xFFFFFF80) != 0) {
				if ((arg0 & 0xFFFFC000) != 0) {
					if ((arg0 & 0xFFE00000) != 0) {
						if ((arg0 & 0xF0000000) != 0) {
							this.addByte(arg0 >>> 28 | 0x80, (byte) 8);
						}
						this.addByte(arg0 >>> 21 | 0x80, (byte) 113);
					}
					this.addByte(arg0 >>> 14 | 0x80, (byte) 93);
				}
				this.addByte(arg0 >>> 7 | 0x80, (byte) 113);
			}
			this.addByte(arg0 & 0x7F, (byte) 85);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ay(" + ')');
		}
	}

	public void readBytes(byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			for (int var5 = arg1; var5 < arg2 + arg1; var5++) {
				arg0[var5] = this.payload[++this.offset - 1];
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.az(" + ')');
		}
	}

	public int readUnsignedTriByte(int arg0) {
		try {
			this.offset += 3;
			return ((this.payload[this.offset - 2] & 0xFF) << 8) + ((this.payload[this.offset - 3] & 0xFF) << 16) + (this.payload[this.offset - 1] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ap(" + ')');
		}
	}

	public int readInt(byte arg0) {
		try {
			this.offset += 4;
			return ((this.payload[this.offset - 2] & 0xFF) << 8) + ((this.payload[this.offset - 4] & 0xFF) << 24) + ((this.payload[this.offset - 3] & 0xFF) << 16) + (this.payload[this.offset - 1] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.as(" + ')');
		}
	}

	public int readUnsignedByteA(int arg0) {
		try {
			return this.payload[++this.offset - 1] - 128 & 0xFF;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bi(" + ')');
		}
	}

	public long readLong(int arg0) {
		try {
			long var2 = (long) this.readInt((byte) 107) & 0xFFFFFFFFL;
			long var4 = (long) this.readInt((byte) 36) & 0xFFFFFFFFL;
			return var4 + (var2 << 32);
		} catch (ArrayIndexOutOfBoundsException var6) {
			var6.printStackTrace();
			return 0L;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aea.ad(" + ')');
		}
	}

	public long method3759(int arg0, int arg1) {
		try {
			int var8 = arg0 - 1;
			if (var8 < 0 || var8 > 7) {
				throw new IllegalArgumentException();
			}
			int var3 = var8 * 8;
			long var4 = 0L;
			while (var3 >= 0) {
				var4 |= ((long) this.payload[++this.offset - 1] & 0xFFL) << var3;
				var3 -= 8;
			}
			return var4;
		} catch (ArrayIndexOutOfBoundsException var6) {
			var6.printStackTrace();
			return 0L;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aea.af(" + ')');
		}
	}

	public float method3760(int arg0) {
		try {
			return Float.intBitsToFloat(this.readInt((byte) 72));
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0.0F;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.aq(" + ')');
		}
	}

	public String method3761(int arg0) {
		try {
			if (this.payload[this.offset] == 0) {
				this.offset++;
				return null;
			} else {
				return this.readString(2008507607);
			}
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return "";
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.aa(" + ')');
		}
	}

	public Buffer(int arg0) {
		this.payload = Class439.method5596(arg0, 409390889);
		this.offset = 0;
	}

	public String readJagString(byte arg0) {
		try {
			byte var2 = this.payload[++this.offset - 1];
			if (var2 != 0) {
				throw new IllegalStateException("");
			}
			int var3 = this.offset;
			while (this.payload[++this.offset - 1] != 0) {
				if (arg0 != 6) {
					throw new IllegalStateException();
				}
			}
			int var4 = this.offset - var3 - 1;
			return var4 == 0 ? "" : Class125.method1525(this.payload, var3, var4, (byte) 1);
		} catch (ArrayIndexOutOfBoundsException var5) {
			var5.printStackTrace();
			return "";
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.ak(" + ')');
		}
	}

	public void addLEShortA(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 + 128);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bq(" + ')');
		}
	}

	public int method3764(byte arg0) {
		try {
			int var2 = this.payload[this.offset] & 0xFF;
			return var2 < 128 ? this.readUnsignedByte(353609420) - 64 : this.readUnsignedShort(-131807351) - 49152;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ah(" + ')');
		}
	}

	public int readSmart(int arg0) {
		try {
			int var2 = this.payload[this.offset] & 0xFF;
			return var2 < 128 ? this.readUnsignedByte(1405354875) : this.readUnsignedShort(-405188396) - 32768;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.av(" + ')');
		}
	}

	public int method3766(int arg0) {
		try {
			int var2 = this.payload[this.offset] & 0xFF;
			return var2 < 128 ? this.readUnsignedByte(2059111289) - 1 : this.readUnsignedShort(-58714110) - 32769;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ar(" + ')');
		}
	}

	public int method3767(int arg0) {
		try {
			int var2 = 0;
			int var3;
			for (var3 = this.readSmart(-46870897); var3 == 32767; var3 = this.readSmart(-1032069089)) {
				var2 += 32767;
			}
			return var2 + var3;
		} catch (ArrayIndexOutOfBoundsException var4) {
			var4.printStackTrace();
			return 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aea.am(" + ')');
		}
	}

	public int method3768(int arg0) {
		try {
			return this.payload[this.offset] < 0 ? this.readInt((byte) 7) & Integer.MAX_VALUE : this.readUnsignedShort(1163353694);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.au(" + ')');
		}
	}

	public int readBigSmart(int arg0) {
		try {
			if (this.payload[this.offset] < 0) {
				return this.readInt((byte) 9) & Integer.MAX_VALUE;
			} else {
				int var2 = this.readUnsignedShort(1125700821);
				return var2 == 32767 ? -1 : var2;
			}
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ae(" + ')');
		}
	}

	public int method3770(int arg0) {
		try {
			byte var2 = this.payload[++this.offset - 1];
			int var3 = 0;
			while (var2 < 0) {
				var3 = (var3 | var2 & 0x7F) << 7;
				var2 = this.payload[++this.offset - 1];
			}
			return var3 | var2;
		} catch (ArrayIndexOutOfBoundsException var4) {
			var4.printStackTrace();
			return 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aea.ao(" + ')');
		}
	}

	public void method3771(int[] arg0, int arg1) {
		try {
			int var3 = this.offset / 8;
			this.offset = 0;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = this.readInt((byte) 13);
				int var6 = this.readInt((byte) 48);
				int var7 = -957401312;
				int var8 = -1640531527;
				int var9 = 32;
				while (var9-- > 0) {
					var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + arg0[var7 >>> 11 & 0x3];
					var7 -= var8;
					var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + arg0[var7 & 0x3];
				}
				this.offset -= 8;
				this.addInt(var5, 1965508160);
				this.addInt(var6, 1965508160);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "aea.bg(" + ')');
		}
	}

	public void method3772(int arg0, byte arg1) {
		try {
			this.payload[this.offset - arg0 - 2] = (byte) (arg0 >> 8);
			this.payload[this.offset - arg0 - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.h(" + ')');
		}
	}

	public int readUnsignedByte(int arg0) {
		try {
			return this.payload[++this.offset - 1] & 0xFF;
		} catch (ArrayIndexOutOfBoundsException var3) {
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bt(" + ')');
		}
	}

	public void applyRSA(BigInteger arg0, BigInteger arg1, int arg2) {
		try {
			int var4 = this.offset;
			this.offset = 0;
			byte[] var5 = new byte[var4];
			this.readBytes(var5, 0, var4, 1274334002);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = ClientLoader.rsaDisabled ? var6 : var6.modPow(arg0, arg1);
			byte[] var8 = var7.toByteArray();
			this.offset = 0;
			this.addShort(var8.length, (byte) 29);
			this.method3749(var8, 0, var8.length, (byte) 18);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aea.bt(" + ')');
		}
	}

	public int method3775(int arg0, int arg1) {
		try {
			int var3 = Class106.method1325(this.payload, arg0, this.offset, -2053639507);
			this.addInt(var3, 1965508160);
			return var3;
		} catch (ArrayIndexOutOfBoundsException var4) {
			var4.printStackTrace();
			return 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aea.bc(" + ')');
		}
	}

	public boolean method3776(int arg0) {
		try {
			this.offset -= 4;
			int var2 = Class106.method1325(this.payload, 0, this.offset, -2067414759);
			int var3 = this.readInt((byte) 34);
			return var2 == var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bf(" + ')');
		}
	}

	public void method3777(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) -arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bk(" + ')');
		}
	}

	public int readUnsignedByteC(int arg0) {
		try {
			return -this.payload[++this.offset - 1] & 0xFF;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bz(" + ')');
		}
	}

	public int readUnsignedByteS(int arg0) {
		try {
			return 128 - this.payload[++this.offset - 1] & 0xFF;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.be(" + ')');
		}
	}

	public int readShort(int arg0) {
		try {
			this.offset += 2;
			int var2 = (this.payload[this.offset - 1] & 0xFF) + ((this.payload[this.offset - 2] & 0xFF) << 8);
			if (var2 > 32767) {
				var2 -= 65536;
			}
			return var2;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.aw(" + ')');
		}
	}

	public byte readByteS(byte arg0) {
		try {
			return (byte) (128 - this.payload[++this.offset - 1]);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bx(" + ')');
		}
	}

	public void addLEShort(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ba(" + ')');
		}
	}

	public void addShortA(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) (arg0 + 128);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bm(" + ')');
		}
	}

	public int readUnsignedLEShort(int arg0) {
		try {
			this.offset += 2;
			return ((this.payload[this.offset - 1] & 0xFF) << 8) + (this.payload[this.offset - 2] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bn(" + ')');
		}
	}

	public int readUnsignedShortA(byte arg0) {
		try {
			this.offset += 2;
			return ((this.payload[this.offset - 2] & 0xFF) << 8) + (this.payload[this.offset - 1] - 128 & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bu(" + ')');
		}
	}

	public int readUnsignedLEShortA(int arg0) {
		try {
			this.offset += 2;
			return ((this.payload[this.offset - 1] & 0xFF) << 8) + (this.payload[this.offset - 2] - 128 & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bv(" + ')');
		}
	}

	public void method3787(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bd(" + ')');
		}
	}

	public int read24BitUnsignedIntegerV2(byte arg0) {
		try {
			this.offset += 3;
			return (this.payload[this.offset - 2] & 0xFF) + ((this.payload[this.offset - 1] & 0xFF) << 8) + ((this.payload[this.offset - 3] & 0xFF) << 16);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bb(" + ')');
		}
	}

	public void addLEInt(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ch(" + ')');
		}
	}

	public void addInt2(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.cz(" + ')');
		}
	}

	public int readLEInt(int arg0) {
		try {
			this.offset += 4;
			return (this.payload[this.offset - 4] & 0xFF) + ((this.payload[this.offset - 3] & 0xFF) << 8) + ((this.payload[this.offset - 1] & 0xFF) << 24) + ((this.payload[this.offset - 2] & 0xFF) << 16);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.cj(" + ')');
		}
	}

	public int readInt1(byte arg0) {
		try {
			this.offset += 4;
			return ((this.payload[this.offset - 2] & 0xFF) << 24) + ((this.payload[this.offset - 1] & 0xFF) << 16) + ((this.payload[this.offset - 4] & 0xFF) << 8) + (this.payload[this.offset - 3] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.cy(" + ')');
		}
	}

	public int readInt2(int arg0) {
		try {
			this.offset += 4;
			return ((this.payload[this.offset - 3] & 0xFF) << 24) + ((this.payload[this.offset - 4] & 0xFF) << 16) + ((this.payload[this.offset - 1] & 0xFF) << 8) + (this.payload[this.offset - 2] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.cb(" + ')');
		}
	}

	public void method3794(String arg0, int arg1) {
		try {
			int var3 = arg0.indexOf(0);
			if (var3 >= 0) {
				throw new IllegalArgumentException("");
			}
			this.payload[++this.offset - 1] = 0;
			this.offset += Class275.method2717(arg0, 0, arg0.length(), this.payload, this.offset, 420148766);
			this.payload[++this.offset - 1] = 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.a(" + ')');
		}
	}

	public int readUnsignedShort(int arg0) {
		try {
			this.offset += 2;
			return ((this.payload[this.offset - 2] & 0xFF) << 8) + (this.payload[this.offset - 1] & 0xFF);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.at(" + ')');
		}
	}

	public int readUnsignedShort2(int arg0, String arg1, int arg2) {
		try {
			this.offset += 2;
			if (this.offset - 2 < this.payload.length && this.offset - 1 < this.payload.length) {
				return ((this.payload[this.offset - 2] & 0xFF) << 8) + (this.payload[this.offset - 1] & 0xFF);
			} else {
				System.out.println("readUnsignedShort2: " + arg0 + " " + arg1 + " " + this.payload.length);
				return 0;
			}
		} catch (ArrayIndexOutOfBoundsException var5) {
			var5.printStackTrace();
			return 0;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.at(" + ')');
		}
	}

	public void addByteS(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (128 - arg0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.br(" + ')');
		}
	}

	public int method3797(short arg0) {
		try {
			this.offset += 2;
			int var2 = ((this.payload[this.offset - 2] & 0xFF) << 8) + (this.payload[this.offset - 1] - 128 & 0xFF);
			if (var2 > 32767) {
				var2 -= 65536;
			}
			return var2;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bj(" + ')');
		}
	}

	public long method3798(short arg0) {
		try {
			long var2 = (long) this.method3806((byte) 105) & 0xFFFFFFFFL;
			long var4 = (long) this.method3806((byte) 105) & 0xFFFFFFFFL;
			return (var4 << 32) + var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.an(" + ')');
		}
	}

	public void method3799(CharSequence arg0, byte arg1) {
		try {
			int var3 = Class104.method1243(arg0, 233137000);
			this.payload[++this.offset - 1] = 0;
			this.method3753(var3, 1936974000);
			this.offset += Class390.method4602(this.payload, this.offset, arg0, (byte) 12);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.e(" + ')');
		}
	}

	public void addByteA(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 + 128);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bl(" + ')');
		}
	}

	public int method3801(byte arg0) {
		try {
			this.offset += 2;
			int var2 = ((this.payload[this.offset - 1] & 0xFF) << 8) + (this.payload[this.offset - 2] & 0xFF);
			if (var2 > 32767) {
				var2 -= 65536;
			}
			return var2;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bw(" + ')');
		}
	}

	public void method3802(long arg0) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 56);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 48);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 40);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 32);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.l(" + ')');
		}
	}

	public void addInt1(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ce(" + ')');
		}
	}

	public String method3804(int arg0) {
		try {
			byte var2 = this.payload[++this.offset - 1];
			if (var2 != 0) {
				throw new IllegalStateException("");
			}
			int var3 = this.method3770(485008648);
			if (this.offset + var3 > this.payload.length) {
				throw new IllegalStateException("");
			}
			String var4 = Class330.method3257(this.payload, this.offset, var3, 2074148158);
			this.offset += var3;
			return var4;
		} catch (ArrayIndexOutOfBoundsException var5) {
			var5.printStackTrace();
			return "";
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.ag(" + ')');
		}
	}

	public void method3805(int[] arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5 = this.offset;
			this.offset = arg1;
			int var6 = (arg2 - arg1) / 8;
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = this.readInt((byte) 99);
				int var9 = this.readInt((byte) 119);
				int var10 = -957401312;
				int var11 = -1640531527;
				int var12 = 32;
				while (var12-- > 0) {
					var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var10 >>> 11 & 0x3] + var10;
					var10 -= var11;
					var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + arg0[var10 & 0x3];
				}
				this.offset -= 8;
				this.addInt(var8, 1965508160);
				this.addInt(var9, 1965508160);
			}
			this.offset = var5;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "aea.bo(" + ')');
		}
	}

	public int method3806(byte arg0) {
		try {
			this.offset += 4;
			return (this.payload[this.offset - 4] & 0xFF) + ((this.payload[this.offset - 3] & 0xFF) << 8) + ((this.payload[this.offset - 1] & 0xFF) << 24) + ((this.payload[this.offset - 2] & 0xFF) << 16);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.aj(" + ')');
		}
	}

	public void method3807(int[] arg0, int arg1, int arg2, byte arg3) {
		try {
			int var5 = this.offset;
			this.offset = arg1;
			int var6 = (arg2 - arg1) / 8;
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = this.readInt((byte) 126);
				int var9 = this.readInt((byte) 104);
				int var10 = 0;
				int var11 = -1640531527;
				int var12 = 32;
				while (var12-- > 0) {
					var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ arg0[var10 & 0x3] + var10;
					var10 += var11;
					var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + arg0[var10 >>> 11 & 0x3];
				}
				this.offset -= 8;
				this.addInt(var8, 1965508160);
				this.addInt(var9, 1965508160);
			}
			this.offset = var5;
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "aea.bs(" + ')');
		}
	}

	public byte readByteA(int arg0) {
		try {
			return (byte) (this.payload[++this.offset - 1] - 128);
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.by(" + ')');
		}
	}

	public void method3809(int arg0, int arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bh(" + ')');
		}
	}

	public long method3810(int arg0) {
		try {
			long var2 = (long) this.readUnsignedByte(176511032) & 0xFFFFFFFFL;
			long var4 = (long) this.readInt((byte) 119) & 0xFFFFFFFFL;
			return (var2 << 32) + var4;
		} catch (ArrayIndexOutOfBoundsException var6) {
			var6.printStackTrace();
			return 0L;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "aea.ax(" + ')');
		}
	}

	public void method3811(long arg0) {
		try {
			this.payload[++this.offset - 1] = (byte) (arg0 >> 32);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.n(" + ')');
		}
	}

	public int readTriByte(int arg0) {
		try {
			this.offset += 3;
			int var2 = (this.payload[this.offset - 1] & 0xFF) + ((this.payload[this.offset - 2] & 0xFF) << 8) + ((this.payload[this.offset - 3] & 0xFF) << 16);
			if (var2 > 8388607) {
				var2 -= 16777216;
			}
			return var2;
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.ai(" + ')');
		}
	}

	public void method3813(int arg0, byte arg1) {
		try {
			this.payload[++this.offset - 1] = (byte) arg0;
			this.payload[++this.offset - 1] = (byte) (arg0 >> 8);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 16);
			this.payload[++this.offset - 1] = (byte) (arg0 >> 24);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.w(" + ')');
		}
	}

	public byte readByteC(int arg0) {
		try {
			return (byte) -this.payload[++this.offset - 1];
		} catch (ArrayIndexOutOfBoundsException var3) {
			var3.printStackTrace();
			return 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aea.bp(" + ')');
		}
	}

	public static final void method3815(byte arg0) {
		try {
			int[] var1 = Class15.anIntArray187;
			int var2;
			for (var2 = 0; var2 < Class15.anInt192; var2++) {
				Player var3 = client.players[var1[var2]];
				if (var3 != null) {
					var3.method5425(-1549945444);
				}
			}
			for (var2 = 0; var2 < client.anInt9017; var2++) {
				long var7 = (long) client.anIntArray9018[var2];
				Class330_Sub35 var5 = (Class330_Sub35) client.aClass497_9014.method6094(var7);
				if (var5 != null) {
					((Class432_Sub1_Sub1_Sub1) var5.anObject7733).method5425(-1693421866);
				} else if (arg0 == 1) {
				}
			}
			if (client.anInt8987 == 0) {
				for (var2 = 0; var2 < Class96.aClass85Array854.length; var2++) {
					Class85 var8 = Class96.aClass85Array854[var2];
					if (var8.aBoolean705) {
						var8.method973(-1160484525).method5425(-1972668343);
					} else if (arg0 == 1) {
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aea.hz(" + ')');
		}
	}

	public static Class8 method3816(int arg0, int arg1) {
		try {
			if (arg0 == 0) {
				if ((double) Class354_Sub1.aFloat3507 == 3.0D) {
					return Class420.aClass8_4308;
				}
				if ((double) Class354_Sub1.aFloat3507 == 4.0D) {
					return Class440.aClass8_4483;
				}
				if ((double) Class354_Sub1.aFloat3507 == 6.0D) {
					return Class362.aClass8_3799;
				}
				if ((double) Class354_Sub1.aFloat3507 >= 8.0D) {
					return Class354_Sub1.aClass8_7985;
				}
			} else if (arg0 == 1) {
				if ((double) Class354_Sub1.aFloat3507 == 3.0D) {
					return Class362.aClass8_3799;
				}
				if ((double) Class354_Sub1.aFloat3507 == 4.0D) {
					return Class354_Sub1.aClass8_7985;
				}
				if ((double) Class354_Sub1.aFloat3507 == 6.0D) {
					return Class533.aClass8_6915;
				}
				if ((double) Class354_Sub1.aFloat3507 >= 8.0D) {
					return Class255.aClass8_2664;
				}
			} else if (arg0 == 2) {
				if ((double) Class354_Sub1.aFloat3507 == 3.0D) {
					return Class533.aClass8_6915;
				}
				if ((double) Class354_Sub1.aFloat3507 == 4.0D) {
					return Class255.aClass8_2664;
				}
				if ((double) Class354_Sub1.aFloat3507 == 6.0D) {
					return Class555.aClass8_6383;
				}
				if ((double) Class354_Sub1.aFloat3507 >= 8.0D) {
					return Class152.aClass8_1630;
				}
			}
			return null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aea.ct(" + ')');
		}
	}

	public static void method3817(Class340[][][] arg0, byte arg1) {
		try {
			for (int var2 = 0; var2 < arg0.length; var2++) {
				Class340[][] var3 = arg0[var2];
				for (int var4 = 0; var4 < var3.length; var4++) {
					for (int var5 = 0; var5 < var3[var4].length; var5++) {
						Class340 var6 = var3[var4][var5];
						if (var6 != null) {
							if (var6.aClass432_Sub1_Sub4_3386 instanceof Interface2) {
								((Interface2) var6.aClass432_Sub1_Sub4_3386).method23(648722349);
							}
							if (var6.aClass432_Sub1_Sub3_3384 instanceof Interface2) {
								((Interface2) var6.aClass432_Sub1_Sub3_3384).method23(648722349);
							}
							if (var6.aClass432_Sub1_Sub3_3385 instanceof Interface2) {
								((Interface2) var6.aClass432_Sub1_Sub3_3385).method23(648722349);
							}
							if (var6.aClass432_Sub1_Sub5_3382 instanceof Interface2) {
								((Interface2) var6.aClass432_Sub1_Sub5_3382).method23(648722349);
							}
							if (var6.aClass432_Sub1_Sub5_3383 instanceof Interface2) {
								((Interface2) var6.aClass432_Sub1_Sub5_3383).method23(648722349);
							}
							for (Class352 var7 = var6.aClass352_3388; var7 != null; var7 = var7.aClass352_3483) {
								Class432_Sub1_Sub1 var8 = var7.aClass432_Sub1_Sub1_3484;
								if (var8 instanceof Interface2) {
									((Interface2) var8).method23(648722349);
								}
							}
						} else if (arg1 >= 0) {
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "aea.j(" + ')');
		}
	}
}
