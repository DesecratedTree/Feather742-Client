package deob;

public class Class385 {

	public static int anInt3970 = 2;

	public static int anInt3973 = 8;

	public static int anInt3974 = 16;

	public static int anInt3976 = 1;

	public static int anInt3984 = 4;

	public byte aByte3975;

	public byte aByte3972;

	public int[] anIntArray3979;

	public int[] anIntArray3982;

	public int[] anIntArray3983;

	public short aShort3977;

	public short aShort3978;

	public short aShort3971;

	public short aShort3980;

	public short[] aShortArray3981;

	public short[] aShortArray3985;

	public short[] aShortArray3986;

	public Class385(Class356 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		this.aByte3975 = (byte) arg1;
		this.aByte3972 = (byte) arg2;
		this.anIntArray3979 = new int[4];
		this.anIntArray3982 = new int[4];
		this.anIntArray3983 = new int[4];
		this.anIntArray3979[0] = arg3;
		this.anIntArray3979[1] = arg4;
		this.anIntArray3979[2] = arg5;
		this.anIntArray3979[3] = arg6;
		this.anIntArray3982[0] = arg7;
		this.anIntArray3982[1] = arg8;
		this.anIntArray3982[2] = arg9;
		this.anIntArray3982[3] = arg10;
		this.anIntArray3983[0] = arg11;
		this.anIntArray3983[1] = arg12;
		this.anIntArray3983[2] = arg13;
		this.anIntArray3983[3] = arg14;
		this.aShort3977 = (short) (arg3 >> arg0.anInt3641);
		this.aShort3978 = (short) (arg5 >> arg0.anInt3641);
		this.aShort3971 = (short) (arg11 >> arg0.anInt3641);
		this.aShort3980 = (short) (arg13 >> arg0.anInt3641);
		this.aShortArray3981 = new short[4];
		this.aShortArray3985 = new short[4];
		this.aShortArray3986 = new short[4];
	}

	public static void method4423(Class_ra arg0, int arg1) {
		try {
			Class125.aClass263_1454 = (Class263) Class219.aClass230_2183.method2331(client.anInterface12_9243, Class125.anInt1451, true, true, (byte) -45);
			Class543.aClass524_6254 = Class219.aClass230_2183.method2333(client.anInterface12_9243, Class125.anInt1451, -1963893190);
			Class464_Sub22.aClass263_8709 = (Class263) Class219.aClass230_2183.method2331(client.anInterface12_9243, Class125.anInt1452, true, true, (byte) -45);
			Class386.aClass524_3989 = Class219.aClass230_2183.method2333(client.anInterface12_9243, Class125.anInt1452, -1567207500);
			Class166_Sub3_Sub2.aClass263_9483 = (Class263) Class219.aClass230_2183.method2331(client.anInterface12_9243, Class125.anInt1453, true, true, (byte) -35);
			Class477_Sub1.aClass524_8749 = Class219.aClass230_2183.method2333(client.anInterface12_9243, Class125.anInt1453, 347590955);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pz.p(" + ')');
		}
	}

	public static boolean method4424(byte arg0) {
		try {
			Class360.anInt3791 = 108;
			Class360.aClass1_3783 = client.aClass1_9060;
			if (client.aByteArray8959 != null) {
				Buffer var1 = new Buffer(client.aByteArray8959);
				Class360.aLong3750 = var1.readLong(-154213383);
				Class360.aLong3776 = var1.readLong(820749694);
			}
			if (Class360.aLong3750 < 0L) {
				Class281.method2792(35, 650655718);
				return false;
			} else {
				return Class528.method6272(false, true, "", "", Class360.aLong3750);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pz.u(" + ')');
		}
	}

	public static int method4425(int arg0, short arg1) {
		try {
			int var2 = arg0 >>> 1;
			int var4 = var2 | var2 >>> 1;
			int var5 = var4 | var4 >>> 2;
			int var6 = var5 | var5 >>> 4;
			int var7 = var6 | var6 >>> 8;
			int var8 = var7 | var7 >>> 16;
			return arg0 & ~var8;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pz.o(" + ')');
		}
	}

	public static Class460 method4426(int arg0) {
		try {
			return Class297.aClass460_3051 == null ? Class460.aClass460_6847 : Class297.aClass460_3051;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pz.f(" + ')');
		}
	}

	public static void method4427(String arg0, boolean arg1, int arg2) {
		try {
			IsaacCipher.method6048(arg0, arg1, -1, -1, -1804817956);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pz.mb(" + ')');
		}
	}

	public static void method4428(int arg0) {
		try {
			Class330_Sub1.aClass367_7498.method4298((byte) 59);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pz.x(" + ')');
		}
	}

	public static void method4429(int arg0, int arg1) {
		try {
			Class3.aClass367_45.method4292(arg0, (byte) 73);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pz.p(" + ')');
		}
	}
}
