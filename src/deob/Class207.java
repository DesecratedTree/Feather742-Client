package deob;

import java.io.DataInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;

public class Class207 {

	public static Class367 aClass367_1943 = new Class367(64);

	public static int anInt1944 = 0;

	public int anInt1950 = -1;

	public int anInt1945 = 64;

	public int anInt1946 = 64;

	public int anInt1947 = 2;

	public int anInt1941 = 1;

	public boolean aBoolean1949 = false;

	public boolean aBoolean1948 = false;

	public static Class339 aClass339_1952;

	public static IndexTable aClass280_1942;

	public static boolean aBoolean1951;

	public void method2190(Buffer arg0, int arg1, int arg2) {
		try {
			while (true) {
				int var4 = arg0.readUnsignedByte(1027581275);
				if (var4 == 0) {
					if (arg2 >= -1066304221) {
					}
					return;
				}
				this.method2191(arg0, var4, arg1, -1599540272);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "is.i(" + ')');
		}
	}

	public void method2191(Buffer arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 == 1) {
				this.anInt1950 = arg0.readUnsignedShort(2082800370);
				if (this.anInt1950 == 65535) {
					this.anInt1950 = -1;
				}
			} else if (arg1 == 2) {
				this.anInt1945 = arg0.readUnsignedShort(120847192) + 1;
				this.anInt1946 = arg0.readUnsignedShort(24504865) + 1;
			} else if (arg1 == 3) {
				arg0.readByte((byte) 32);
			} else if (arg1 == 4) {
				this.anInt1947 = arg0.readUnsignedByte(1515200924);
			} else if (arg1 == 5) {
				this.anInt1941 = arg0.readUnsignedByte(1079274087);
			} else if (arg1 == 6) {
				this.aBoolean1949 = true;
			} else if (arg1 == 7) {
				this.aBoolean1948 = true;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "is.p(" + ')');
		}
	}

	public static File method2192(String arg0, int arg1) {
		try {
			if (!Class317.aBoolean3275) {
				throw new RuntimeException("");
			}
			File var2 = (File) Class317.aHashtable3277.get(arg0);
			if (var2 != null) {
				return var2;
			}
			File var3 = new File(Class317.aFile3276, arg0);
			RandomAccessFile var4 = null;
			File var5;
			try {
				File var6 = new File(var3.getParent());
				if (!var6.exists()) {
					throw new RuntimeException("");
				}
				var4 = new RandomAccessFile(var3, "rw");
				int var11 = var4.read();
				var4.seek(0L);
				var4.write(var11);
				var4.seek(0L);
				var4.close();
				Class317.aHashtable3277.put(arg0, var3);
				var5 = var3;
			} catch (Exception var9) {
				try {
					if (var4 != null) {
						var4.close();
						Object var7 = null;
					}
				} catch (Exception var8) {
				}
				throw new RuntimeException();
			}
			return var5;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "is.j(" + ')');
		}
	}

	public static final void method2193(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1591206865);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class152.method1784(var3, var4, arg0, (byte) -62);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "is.dk(" + ')');
		}
	}

	public static final void method2194(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			client.aShort8962 = (short) arg0.anIntArray4387[arg0.anInt4376];
			if (client.aShort8962 <= 0) {
				client.aShort8962 = 256;
			}
			client.aShort9067 = (short) arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (client.aShort9067 <= 0) {
				client.aShort9067 = 205;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "is.amn(" + ')');
		}
	}

	public static void method2195(String arg0, Throwable arg1, int arg2) {
		try {
			try {
				String var3 = "";
				if (arg1 != null) {
					var3 = Class330_Sub31_Sub2.method3426(arg1, (byte) 103);
				}
				if (arg0 != null) {
					if (arg1 != null) {
						var3 = var3 + " | ";
					}
					var3 = var3 + arg0;
				}
				Class477_Sub2.method6001(var3, (byte) 5);
				var3 = Class411.method5226(var3, (byte) -76);
				if (RuntimeException_Sub2.anApplet6443 != null) {
					String var4 = "Unknown";
					String var5 = "1.1";
					try {
						var4 = System.getProperty("java.vendor");
						var5 = System.getProperty("java.version");
					} catch (Exception var8) {
					}
					URL var6 = new URL(RuntimeException_Sub2.anApplet6443.getCodeBase(), "clienterror.ws?c=" + Exception_Sub2.anInt15 + "&cs=" + RuntimeException_Sub2.anInt6441 + "&u=" + (RuntimeException_Sub2.aString6440 == null ? "" + RuntimeException_Sub2.aLong6442 : Class411.method5226(RuntimeException_Sub2.aString6440, (byte) -19)) + "&v1=" + Class411.method5226(var4, (byte) -95) + "&v2=" + Class411.method5226(var5, (byte) -15) + "&e=" + var3);
					DataInputStream var7 = new DataInputStream(var6.openStream());
					var7.read();
					var7.close();
				}
			} catch (Exception var9) {
				var9.printStackTrace();
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "is.r(" + ')');
		}
	}
}
