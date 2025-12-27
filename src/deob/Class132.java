package deob;

public class Class132 {

	public static Class132 aClass132_1504 = new Class132(0);

	public static Class132 aClass132_1503 = new Class132(1);

	public static int anInt1506;

	public static Class401_Sub1[] aClass401_Sub1Array1505;

	public Class132(int arg0) {
	}

	public static final void method1565(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			Class62.method767(arg0.anIntArray4387[arg0.anInt4376], arg0.anIntArray4387[arg0.anInt4376 + 1], arg0.anIntArray4387[arg0.anInt4376 + 2], -1329357390);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fh.tw(" + ')');
		}
	}

	public static void method1566(byte arg0) {
		try {
			if (Class239.aClass240_2592 != null) {
				Class239.aClass240_2592.method2391(1705635690);
			}
			if (Class330_Sub36_Sub14_Sub1.aThread10138 != null) {
				while (true) {
					try {
						Class330_Sub36_Sub14_Sub1.aThread10138.join();
						break;
					} catch (InterruptedException var2) {
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "fh.u(" + ')');
		}
	}

	public static byte[] method1567(CharSequence arg0, int arg1) {
		try {
			int var2 = arg0.length();
			byte[] var3 = new byte[var2];
			for (int var4 = 0; var4 < var2; var4++) {
				char var5 = arg0.charAt(var4);
				if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
					var3[var4] = (byte) var5;
				} else if (var5 == 8364) {
					var3[var4] = -128;
				} else if (var5 == 8218) {
					var3[var4] = -126;
				} else if (var5 == 402) {
					var3[var4] = -125;
				} else if (var5 == 8222) {
					var3[var4] = -124;
				} else if (var5 == 8230) {
					var3[var4] = -123;
				} else if (var5 == 8224) {
					var3[var4] = -122;
				} else if (var5 == 8225) {
					var3[var4] = -121;
				} else if (var5 == 710) {
					var3[var4] = -120;
				} else if (var5 == 8240) {
					var3[var4] = -119;
				} else if (var5 == 352) {
					var3[var4] = -118;
				} else if (var5 == 8249) {
					var3[var4] = -117;
				} else if (var5 == 338) {
					var3[var4] = -116;
				} else if (var5 == 381) {
					var3[var4] = -114;
				} else if (var5 == 8216) {
					var3[var4] = -111;
				} else if (var5 == 8217) {
					var3[var4] = -110;
				} else if (var5 == 8220) {
					var3[var4] = -109;
				} else if (var5 == 8221) {
					var3[var4] = -108;
				} else if (var5 == 8226) {
					var3[var4] = -107;
				} else if (var5 == 8211) {
					var3[var4] = -106;
				} else if (var5 == 8212) {
					var3[var4] = -105;
				} else if (var5 == 732) {
					var3[var4] = -104;
				} else if (var5 == 8482) {
					var3[var4] = -103;
				} else if (var5 == 353) {
					var3[var4] = -102;
				} else if (var5 == 8250) {
					var3[var4] = -101;
				} else if (var5 == 339) {
					var3[var4] = -100;
				} else if (var5 == 382) {
					var3[var4] = -98;
				} else if (var5 == 376) {
					var3[var4] = -97;
				} else {
					var3[var4] = 63;
				}
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "fh.o(" + ')');
		}
	}

	public static final void method1568(long arg0) {
		try {
			Class260 var2 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
			int var3 = client.anInt9156 + (int) var2.aFloat2716;
			int var4 = client.anInt9056 + (int) var2.aFloat2711;
			if (IndexTable.anInt2906 - var3 < -2000 || IndexTable.anInt2906 - var3 > 2000 || Class308.anInt3194 - var4 < -2000 || Class308.anInt3194 - var4 > 2000) {
				IndexTable.anInt2906 = var3;
				Class308.anInt3194 = var4;
			}
			int var5;
			int var6;
			if (var3 != IndexTable.anInt2906) {
				var5 = var3 - IndexTable.anInt2906;
				var6 = (int) ((long) var5 * arg0 / 320L);
				if (var5 > 0) {
					if (var6 == 0) {
						var6 = 1;
					} else if (var6 > var5) {
						var6 = var5;
					}
				} else if (var6 == 0) {
					var6 = -1;
				} else if (var6 < var5) {
					var6 = var5;
				}
				IndexTable.anInt2906 += var6;
			}
			if (Class308.anInt3194 != var4) {
				var5 = var4 - Class308.anInt3194;
				var6 = (int) (arg0 * (long) var5 / 320L);
				if (var5 > 0) {
					if (var6 == 0) {
						var6 = 1;
					} else if (var6 > var5) {
						var6 = var5;
					}
				} else if (var6 == 0) {
					var6 = -1;
				} else if (var6 < var5) {
					var6 = var5;
				}
				Class308.anInt3194 += var6;
			}
			client.aFloat9141 += (float) arg0 * client.aFloat9072 / 6.0F;
			client.aFloat9250 += client.aFloat9124 * (float) arg0 / 6.0F;
			Class344.method4003(-722522641);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "fh.hk(" + ')');
		}
	}

	public static int method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		try {
			if ((arg5 & 0x1) == 1) {
				int var7 = arg3;
				arg3 = arg4;
				arg4 = var7;
			}
			int var9 = arg2 & 0x3;
			if (var9 == 0) {
				return arg0;
			} else if (var9 == 1) {
				return arg1;
			} else if (var9 == 2) {
				return 7 - arg0 - (arg3 - 1);
			} else {
				return 7 - arg1 - (arg4 - 1);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "fh.o(" + ')');
		}
	}
}
