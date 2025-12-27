package deob;

public class Class325_Sub2 extends Class325 {

	public int anInt7481;

	public int anInt7479;

	public int anInt7480;

	public int anInt7478;

	public void method3214(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		try {
			this.anInt7481 = arg0;
			this.anInt7479 = arg1;
			this.anInt7480 = arg2;
			this.anInt7478 = arg3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "acd.j(" + ')');
		}
	}

	public Class325_Sub2(int arg0, int arg1, int arg2, int arg3) {
		this.anInt7481 = arg0;
		this.anInt7479 = arg1;
		this.anInt7480 = arg2;
		this.anInt7478 = arg3;
	}

	public static final void method3215(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class83.method968(var2 >> 14 & 0x3FFF, var2 & 0x3FFF, (byte) -15);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acd.aej(" + ')');
		}
	}
}
