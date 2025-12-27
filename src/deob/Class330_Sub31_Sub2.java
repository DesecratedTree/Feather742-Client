package deob;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class330_Sub31_Sub2 extends Class330_Sub31 {

	public static int anInt9598 = 0;

	public static int anInt9603 = 128;

	public float aFloat9599;

	public float aFloat9604;

	public int anInt9600;

	public int anInt9601;

	public String aString9602;

	public String aString9605;

	public String aString9606;

	public String method3422(int arg0) {
		try {
			return this.aString9605;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajx.n(" + ')');
		}
	}

	public float method3423(byte arg0) {
		try {
			return this.aFloat9599;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajx.l(" + ')');
		}
	}

	public void method3413(int arg0) {
	}

	public Class330_Sub31_Sub2(OggStreamState arg0) {
		super(arg0);
	}

	public void method3412(OggPacket arg0) {
		if (this.anInt7723 * -983895715 * -818353419 > 0 && !"SUB".equals(this.aString9602)) {
			return;
		}
		Buffer var2 = new Buffer(arg0.getData());
		int var3 = var2.readUnsignedByte(-168325988);
		if (this.anInt7723 * -983895715 * -818353419 <= 8) {
			if ((var3 | 0x80) == 0) {
				throw new IllegalStateException();
			}
			if (this.anInt7723 * -818353419 * -983895715 == 0) {
				var2.offset = (var2.offset * 323600977 + -1147112121) * -824785231;
				this.anInt9600 = var2.method3806((byte) 105) * -1895997225 * 1570083559;
				this.anInt9601 = var2.method3806((byte) 105) * 48056121 * -704284919;
				if (this.anInt9600 * 1570083559 * -1895997225 == 0 || this.anInt9601 * 48056121 * -704284919 == 0) {
					throw new IllegalStateException();
				}
				Buffer var11 = new Buffer(16);
				var2.readBytes(var11.payload, 0, 16, 1274334002);
				this.aString9605 = var11.readString(946459803);
				var11.offset = 0 * -824785231;
				var2.readBytes(var11.payload, 0, 16, 1274334002);
				this.aString9602 = var11.readString(-494726313);
			}
			return;
		}
		if (var3 == 0) {
			long var4 = var2.method3798((short) -614);
			long var6 = var2.method3798((short) 7625);
			long var8 = var2.method3798((short) -14701);
			if (var4 < 0L || var6 < 0L || var8 < 0L || var8 > var4) {
				throw new IllegalStateException();
			}
			this.aFloat9599 = (float) (var4 * (long) (this.anInt9601 * -704284919 * 48056121)) / (float) (this.anInt9600 * -1895997225 * 1570083559);
			this.aFloat9604 = (float) ((var4 + var6) * (long) (this.anInt9601 * -704284919 * 48056121)) / (float) (this.anInt9600 * -1895997225 * 1570083559);
			int var10 = var2.method3806((byte) 105);
			if (var10 < 0 || var10 > var2.payload.length - var2.offset * -824785231 * 323600977) {
				throw new IllegalStateException();
			}
			this.aString9606 = Class330.method3257(var2.payload, var2.offset * 323600977 * -824785231, var10, 2053819586);
		}
		if ((var3 | 0x80) != 0) {
			return;
		}
	}

	public void method3414() {
	}

	public String method3424(byte arg0) {
		try {
			return this.aString9606;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajx.u(" + ')');
		}
	}

	public void method3415() {
	}

	public void method3411(OggPacket arg0, int arg1) {
		try {
			if (this.anInt7723 <= 0 || "SUB".equals(this.aString9602)) {
				Buffer var3 = new Buffer(arg0.getData());
				int var4 = var3.readUnsignedByte(-103232237);
				if (this.anInt7723 <= 8) {
					if ((var4 | 0x80) == 0) {
						throw new IllegalStateException();
					}
					if (this.anInt7723 == 0) {
						var3.offset += 23;
						this.anInt9600 = var3.method3806((byte) 105);
						this.anInt9601 = var3.method3806((byte) 105);
						if (this.anInt9600 == 0 || this.anInt9601 == 0) {
							throw new IllegalStateException();
						}
						Buffer var5 = new Buffer(16);
						var3.readBytes(var5.payload, 0, 16, 1274334002);
						this.aString9605 = var5.readString(995705068);
						var5.offset = 0;
						var3.readBytes(var5.payload, 0, 16, 1274334002);
						this.aString9602 = var5.readString(-1627694041);
					}
				} else {
					if (var4 == 0) {
						long var13 = var3.method3798((short) 2131);
						long var7 = var3.method3798((short) 23229);
						long var9 = var3.method3798((short) 15847);
						if (var13 < 0L || var7 < 0L || var9 < 0L || var9 > var13) {
							throw new IllegalStateException();
						}
						this.aFloat9599 = (float) (var13 * (long) this.anInt9601) / (float) this.anInt9600;
						this.aFloat9604 = (float) ((var13 + var7) * (long) this.anInt9601) / (float) this.anInt9600;
						int var11 = var3.method3806((byte) 105);
						if (var11 < 0 || var11 > var3.payload.length - var3.offset) {
							throw new IllegalStateException();
						}
						this.aString9606 = Class330.method3257(var3.payload, var3.offset, var11, 1825097092);
					}
					if ((var4 | 0x80) != 0) {
						return;
					}
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "ajx.j(" + ')');
		}
	}

	public float method3425(int arg0) {
		try {
			return this.aFloat9604;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ajx.b(" + ')');
		}
	}

	public static String method3426(Throwable arg0, byte arg1) throws IOException {
		try {
			String var2;
			if (arg0 instanceof RuntimeException_Sub2) {
				RuntimeException_Sub2 var3 = (RuntimeException_Sub2) arg0;
				var2 = var3.aString6444 + " | ";
				arg0 = var3.aThrowable6445;
			} else {
				var2 = "";
			}
			StringWriter var14 = new StringWriter();
			PrintWriter var4 = new PrintWriter(var14);
			arg0.printStackTrace(var4);
			var4.close();
			String var5 = var14.toString();
			BufferedReader var6 = new BufferedReader(new StringReader(var5));
			String var7 = var6.readLine();
			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					if (arg1 <= 1) {
						throw new IllegalStateException();
					}
					return var2 + "| " + var7;
				}
				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				String var11;
				if (var9 == -1) {
					var11 = var8;
				} else {
					var11 = var8.substring(0, var9);
				}
				var11 = var11.trim();
				var11 = var11.substring(var11.lastIndexOf(32) + 1);
				var11 = var11.substring(var11.lastIndexOf(9) + 1);
				var2 = var2 + var11;
				if (var9 != -1 && var10 != -1) {
					int var12 = var8.indexOf(".java:", var9);
					if (var12 >= 0) {
						var2 = var2 + var8.substring(var12 + 5, var10);
					}
				}
				var2 = var2 + ' ';
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "ajx.i(" + ')');
		}
	}
}
