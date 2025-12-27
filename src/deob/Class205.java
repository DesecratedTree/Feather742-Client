package deob;

public class Class205 implements Interface10 {

	public String aString6522;

	public Class195 aClass195_6528;

	public Class211 aClass211_6520;

	public int anInt6529;

	public int anInt6521;

	public int anInt6518;

	public int anInt6524;

	public int anInt6523;

	public int anInt6526;

	public int anInt6527;

	public int anInt6525;

	public int anInt6519;

	public int anInt6530;

	public Class198 method160() {
		return Class198.aClass198_1921;
	}

	public Class198 method159(byte arg0) {
		try {
			return Class198.aClass198_1921;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iq.j(" + ')');
		}
	}

	public Class198 method161() {
		return Class198.aClass198_1921;
	}

	public Class205(String arg0, Class195 arg1, Class211 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		this.aString6522 = arg0;
		this.aClass195_6528 = arg1;
		this.aClass211_6520 = arg2;
		this.anInt6529 = arg3;
		this.anInt6521 = arg4;
		this.anInt6518 = arg5;
		this.anInt6524 = arg6;
		this.anInt6523 = arg7;
		this.anInt6526 = arg8;
		this.anInt6527 = arg9;
		this.anInt6525 = arg10;
		this.anInt6519 = arg11;
		this.anInt6530 = arg12;
	}

	public static final void method2187(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.CAPE_COLOR_PACKET, client.aClass1_9025.aClass488_22, 611887755);
			var3.aClass330_Sub46_Sub2_7729.addShort(var2, (byte) 108);
			client.aClass1_9025.method378(var3, -238830557);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iq.tk(" + ')');
		}
	}

	public static final void method2188(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class360.anInt3756;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iq.ajc(" + ')');
		}
	}

	public static void method2189(int arg0, int arg1) {
		try {
			Class204.anInt6517 = arg0;
			Class354_Sub1.anInt7983 = -1;
			Class354_Sub1.anInt7986 = -1;
			Class541.method6331(1057068811);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iq.cr(" + ')');
		}
	}
}
