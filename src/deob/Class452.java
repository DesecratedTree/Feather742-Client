package deob;

import java.util.Date;

public class Class452 {

	public static char[] aCharArray5559 = new char[64];

	public static char[] aCharArray5558;

	public static int[] anIntArray5557;

	public static int anInt5560;

	public static int anInt5561;

	static {
		int var0;
		for (var0 = 0; var0 < 26; var0++) {
			aCharArray5559[var0] = (char) (var0 + 65);
		}
		for (var0 = 26; var0 < 52; var0++) {
			aCharArray5559[var0] = (char) (var0 + 97 - 26);
		}
		for (var0 = 52; var0 < 62; var0++) {
			aCharArray5559[var0] = (char) (var0 + 48 - 52);
		}
		aCharArray5559[62] = '+';
		aCharArray5559[63] = '/';
		aCharArray5558 = new char[64];
		for (var0 = 0; var0 < 26; var0++) {
			aCharArray5558[var0] = (char) (var0 + 65);
		}
		for (var0 = 26; var0 < 52; var0++) {
			aCharArray5558[var0] = (char) (var0 + 97 - 26);
		}
		for (var0 = 52; var0 < 62; var0++) {
			aCharArray5558[var0] = (char) (var0 + 48 - 52);
		}
		aCharArray5558[62] = '*';
		aCharArray5558[63] = '-';
		anIntArray5557 = new int[128];
		for (var0 = 0; var0 < anIntArray5557.length; var0++) {
			anIntArray5557[var0] = -1;
		}
		for (var0 = 65; var0 <= 90; var0++) {
			anIntArray5557[var0] = var0 - 65;
		}
		for (var0 = 97; var0 <= 122; var0++) {
			anIntArray5557[var0] = var0 - 97 + 26;
		}
		for (var0 = 48; var0 <= 57; var0++) {
			anIntArray5557[var0] = var0 - 48 + 52;
		}
		int[] var2 = anIntArray5557;
		anIntArray5557[43] = 62;
		var2[42] = 62;
		int[] var1 = anIntArray5557;
		anIntArray5557[47] = 63;
		var1[45] = 63;
	}

	public Class452() throws Throwable {
		throw new Error();
	}

	public static Class435 method5635(int arg0, int arg1) {
		try {
			Class435[] var2 = InputStream_Sub1.method338((byte) 108);
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class435 var4 = var2[var3];
				if (arg0 == var4.anInt4417) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ss.j(" + ')');
		}
	}

	public static final void method5636(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean9150 ? 1 : 0;
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aString9154 == null ? "" : client.aString9154;
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aString9152 == null ? "" : client.aString9152;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ss.vc(" + ')');
		}
	}

	public static void method5637(long arg0) {
		try {
			Class528.aCalendar6215.setTime(new Date(arg0));
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ss.f(" + ')');
		}
	}
}
