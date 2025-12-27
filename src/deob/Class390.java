package deob;

public class Class390 {

	public static Class390 aClass390_4034 = new Class390(0, 2, 2, 1);

	public static Class390 aClass390_4051 = new Class390(1, 2, 2, 0);

	public static Class390 aClass390_4045 = new Class390(2, 4, 4, 0);

	public static Class390 aClass390_4037 = new Class390(4, 1, 1, 1);

	public static Class390 aClass390_4038 = new Class390(6, 0, 4, 2);

	public static Class390 aClass390_4036 = new Class390(7, 0, 1, 1);

	public static Class390 aClass390_4040 = new Class390(8, 0, 4, 1);

	public static Class390 aClass390_4041 = new Class390(9, 0, 4, 1);

	public static Class390 aClass390_4042 = new Class390(10, 2, 2, 0);

	public static Class390 aClass390_4043 = new Class390(11, 0, 1, 2);

	public static Class390 aClass390_4044 = new Class390(12, 0, 1, 0);

	public static Class390 aClass390_4035 = new Class390(13, 0, 1, 0);

	public static Class390 aClass390_4046 = new Class390(14, 0, 4, 1);

	public static Class390 aClass390_4047 = new Class390(15, 0, 1, 0);

	public int anInt4048;

	public int anInt4049;

	public int anInt4050;

	public int anInt4039;

	public Class390(int arg0, int arg1, int arg2, int arg3) {
		this.anInt4048 = arg0;
		this.anInt4049 = arg1;
		this.anInt4050 = arg2;
		this.anInt4039 = arg3;
	}

	public static void method4600(long[] arg0, int[] arg1, byte arg2) {
		try {
			Class384.method4415(arg0, arg1, 0, arg0.length - 1, -1442854304);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qd.s(" + ')');
		}
	}

	public static final void method4601(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class147.anInt1621 == 4 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qd.ahf(" + ')');
		}
	}

	public static int method4602(byte[] arg0, int arg1, CharSequence arg2, byte arg3) {
		try {
			int var4 = arg2.length();
			int var5 = arg1;
			for (int var6 = 0; var6 < var4; var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 <= 127) {
					arg0[var5++] = (byte) var7;
				} else if (var7 <= 2047) {
					arg0[var5++] = (byte) (var7 >> 6 | 0xC0);
					arg0[var5++] = (byte) (var7 & 0x3F | 0x80);
				} else {
					arg0[var5++] = (byte) (var7 >> 12 | 0xE0);
					arg0[var5++] = (byte) (var7 >> 6 & 0x3F | 0x80);
					arg0[var5++] = (byte) (var7 & 0x3F | 0x80);
				}
			}
			return var5 - arg1;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "qd.j(" + ')');
		}
	}
}
