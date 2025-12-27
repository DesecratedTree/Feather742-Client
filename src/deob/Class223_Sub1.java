package deob;

public class Class223_Sub1 extends Class223 {

	public int[] anIntArray7359 = new int[this.anInt2361];

	public int anInt7356;

	public int anInt7358;

	public byte[] aByteArray7357;

	public Class223_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (int var7 = 0; var7 < this.anInt2361; var7++) {
			this.anIntArray7359[var7] = (short) (Math.pow((double) arg5, (double) var7) * 4096.0D);
		}
	}

	public void method2285() {
		this.anInt7358 = Math.abs(this.anInt7358);
		if (this.anInt7358 >= 4096) {
			this.anInt7358 = 4095;
		}
		this.method2289(this.anInt7356++, (byte) (this.anInt7358 >> 4));
		this.anInt7358 = 0;
	}

	public void method2275() {
		this.anInt7356 = 0;
		this.anInt7358 = 0;
	}

	public void method2282(int arg0, int arg1) {
		this.anInt7358 += arg1 * this.anIntArray7359[arg0] >> 12;
	}

	public void method2276(int arg0, int arg1) {
		this.anInt7358 += arg1 * this.anIntArray7359[arg0] >> 12;
	}

	public void method2283() {
		this.anInt7356 = 0;
		this.anInt7358 = 0;
	}

	public void method2284() {
		this.anInt7356 = 0;
		this.anInt7358 = 0;
	}

	public void method2281() {
		this.anInt7356 = 0;
		this.anInt7358 = 0;
	}

	public void method2288() {
		this.anInt7358 = Math.abs(this.anInt7358);
		if (this.anInt7358 >= 4096) {
			this.anInt7358 = 4095;
		}
		this.method2289(this.anInt7356++, (byte) (this.anInt7358 >> 4));
		this.anInt7358 = 0;
	}

	public void method2286() {
		this.anInt7358 = Math.abs(this.anInt7358);
		if (this.anInt7358 >= 4096) {
			this.anInt7358 = 4095;
		}
		this.method2289(this.anInt7356++, (byte) (this.anInt7358 >> 4));
		this.anInt7358 = 0;
	}

	public void method2287(int arg0, int arg1) {
		this.anInt7358 += arg1 * this.anIntArray7359[arg0] >> 12;
	}

	public void method2289(int arg0, byte arg1) {
		this.aByteArray7357[this.anInt7356++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
