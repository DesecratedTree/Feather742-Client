package deob;

public class CacheIndex {

	public static CacheIndex aClass124_1426 = new CacheIndex(0, "", false, false);

	public static CacheIndex INDEX_1 = new CacheIndex(1, "", false, false);

	public static CacheIndex INDEX_2 = new CacheIndex(2, "", true, false);

	public static CacheIndex INDEX_3 = new CacheIndex(3, "", true, false);

	public static CacheIndex INDEX_4 = new CacheIndex(4, "", false, false);

	public static CacheIndex INDEX_5 = new CacheIndex(5, "", false, false);

	public static CacheIndex INDEX_6 = new CacheIndex(6, "", false, false);

	public static CacheIndex INDEX_7 = new CacheIndex(7, "", false, false);

	public static CacheIndex INDEX_8 = new CacheIndex(8, "", false, false);

	public static CacheIndex INDEX_9 = new CacheIndex(9, "", false, false);

	public static CacheIndex INDEX_10 = new CacheIndex(10, "", false, false);

	public static CacheIndex INDEX_11 = new CacheIndex(11, "", false, false);

	public static CacheIndex INDEX_12 = new CacheIndex(12, "", false, false);

	public static CacheIndex INDEX_13 = new CacheIndex(13, "", false, false);

	public static CacheIndex INDEX_14 = new CacheIndex(14, "", false, false);

	public static CacheIndex INDEX_15 = new CacheIndex(15, "", false, false);

	public static CacheIndex INDEX_16 = new CacheIndex(16, "", true, false);

	public static CacheIndex INDEX_17 = new CacheIndex(17, "", true, false);

	public static CacheIndex INDEX_18 = new CacheIndex(18, "", true, false);

	public static CacheIndex INDEX_19 = new CacheIndex(19, "", true, false);

	public static CacheIndex INDEX_20 = new CacheIndex(20, "", true, false);

	public static CacheIndex INDEX_21 = new CacheIndex(21, "", true, false);

	public static CacheIndex INDEX_22 = new CacheIndex(22, "", true, false);

	public static CacheIndex INDEX_23 = new CacheIndex(23, "", true, false);

	public static CacheIndex INDEX_24 = new CacheIndex(24, "", true, false);

	public static CacheIndex INDEX_25 = new CacheIndex(25, "", true, false);

	public static CacheIndex INDEX_26 = new CacheIndex(26, "", false, false);

	public static CacheIndex INDEX_27 = new CacheIndex(27, "", false, false);

	public static CacheIndex INDEX_28 = new CacheIndex(28, "", false, false);

	public static CacheIndex INDEX_29 = new CacheIndex(29, "", false, false);

	public static CacheIndex INDEX_30 = new CacheIndex(30, "", false, false);

	public static CacheIndex INDEX_31 = new CacheIndex(31, "", false, false);

	public static CacheIndex INDEX_32 = new CacheIndex(32, "", false, false);

	public static CacheIndex INDEX_33 = new CacheIndex(33, "", false, false);

	public static CacheIndex INDEX_34 = new CacheIndex(34, "", false, false);

	public static CacheIndex INDEX_35 = new CacheIndex(35, "", true, false);

	public static CacheIndex INDEX_36 = new CacheIndex(36, "", false, false);

	public static CacheIndex INDEX_37 = new CacheIndex(37, "", false, false);

	public static int cacheIndex = -1;

	public int anInt1448;

	public static Class154 aClass154_1450;

	public CacheIndex(int arg0, String arg1, boolean arg2, boolean arg3) {
		this.anInt1448 = arg0;
	}

	public int method1519(byte arg0) {
		try {
			return this.anInt1448;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ez.j(" + ')');
		}
	}

	public static final void method1520(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class354.anInt3510 + Class204.anInt6517;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class149_Sub1.anInt8867 + Class354.anInt3516;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ez.aec(" + ')');
		}
	}

	public static String method1521(CharSequence arg0, Class547 arg1, int arg2) {
		try {
			if (arg0 == null) {
				return null;
			}
			int var3 = 0;
			int var4 = arg0.length();
			while (var3 < var4 && Class162.method1916(arg0.charAt(var3), -1061652348)) {
				var3++;
			}
			while (var4 > var3 && Class162.method1916(arg0.charAt(var4 - 1), -1972760693)) {
				var4--;
			}
			int var5 = var4 - var3;
			if (var5 < 1 || var5 > Class391.method4605(arg1, (byte) 27)) {
				return null;
			}
			StringBuilder var6 = new StringBuilder(var5);
			for (int var7 = var3; var7 < var4; var7++) {
				char var8 = arg0.charAt(var7);
				if (Class95.method1106(var8, (byte) 6)) {
					char var9 = Class72.method831(var8, (byte) -103);
					if (var9 != 0) {
						var6.append(var9);
					} else if (arg2 == -677627593) {
					}
				} else if (arg2 == -677627593) {
					throw new IllegalStateException();
				}
			}
			if (var6.length() == 0) {
				return null;
			} else {
				return var6.toString();
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "ez.o(" + ')');
		}
	}

	public static boolean method1522(int arg0, byte arg1) {
		try {
			return arg0 == 12 || arg0 == 2 || arg0 == 10;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ez.fm(" + ')');
		}
	}

	public static final void method1523(int arg0) {
		try {
			if (!client.aBoolean9075) {
				client.aFloat9072 += (-24.0F - client.aFloat9072) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9075 = true;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "ez.hy(" + ')');
		}
	}
}
