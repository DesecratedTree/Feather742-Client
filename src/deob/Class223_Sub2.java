package deob;

public class Class223_Sub2 extends Class223 {

	public int anInt7366;

	public int anInt7367;

	public int anInt7362;

	public int anInt7361;

	public int anInt7360;

	public int anInt7363;

	public int anInt7364;

	public int anInt7365;

	public byte[] aByteArray7368;

	public void method2275() {
		this.anInt7364 = 0;
		this.anInt7365 = 0;
	}

	public void method2276(int arg0, int arg1) {
		if (arg0 == 0) {
			this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
			this.anInt7363 = 4096;
			this.anInt7365 = this.anInt7360;
			return;
		}
		this.anInt7363 = this.anInt7360 * this.anInt7366 >> 12;
		if (this.anInt7363 < 0) {
			this.anInt7363 = 0;
		} else if (this.anInt7363 > 4096) {
			this.anInt7363 = 4096;
		}
		this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
		this.anInt7360 = this.anInt7360 * this.anInt7363 >> 12;
		this.anInt7365 += this.anInt7360 * this.anInt7361 >> 12;
		this.anInt7361 = this.anInt7361 * this.anInt7362 >> 12;
	}

	public void method2288() {
		this.anInt7361 = this.anInt7362;
		this.anInt7365 >>= 0x4;
		if (this.anInt7365 < 0) {
			this.anInt7365 = 0;
		} else if (this.anInt7365 > 255) {
			this.anInt7365 = 255;
		}
		this.method2294(this.anInt7364++, (byte) this.anInt7365);
		this.anInt7365 = 0;
	}

	public Class223_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7366 = (int) (arg7 * 4096.0F);
		this.anInt7367 = (int) (arg6 * 4096.0F);
		this.anInt7361 = this.anInt7362 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	public void method2287(int arg0, int arg1) {
		if (arg0 == 0) {
			this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
			this.anInt7363 = 4096;
			this.anInt7365 = this.anInt7360;
			return;
		}
		this.anInt7363 = this.anInt7360 * this.anInt7366 >> 12;
		if (this.anInt7363 < 0) {
			this.anInt7363 = 0;
		} else if (this.anInt7363 > 4096) {
			this.anInt7363 = 4096;
		}
		this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
		this.anInt7360 = this.anInt7360 * this.anInt7363 >> 12;
		this.anInt7365 += this.anInt7360 * this.anInt7361 >> 12;
		this.anInt7361 = this.anInt7361 * this.anInt7362 >> 12;
	}

	public void method2283() {
		this.anInt7364 = 0;
		this.anInt7365 = 0;
	}

	public void method2294(int arg0, byte arg1) {
		this.aByteArray7368[arg0] = arg1;
	}

	public void method2281() {
		this.anInt7364 = 0;
		this.anInt7365 = 0;
	}

	public void method2285() {
		this.anInt7361 = this.anInt7362;
		this.anInt7365 >>= 0x4;
		if (this.anInt7365 < 0) {
			this.anInt7365 = 0;
		} else if (this.anInt7365 > 255) {
			this.anInt7365 = 255;
		}
		this.method2294(this.anInt7364++, (byte) this.anInt7365);
		this.anInt7365 = 0;
	}

	public void method2286() {
		this.anInt7361 = this.anInt7362;
		this.anInt7365 >>= 0x4;
		if (this.anInt7365 < 0) {
			this.anInt7365 = 0;
		} else if (this.anInt7365 > 255) {
			this.anInt7365 = 255;
		}
		this.method2294(this.anInt7364++, (byte) this.anInt7365);
		this.anInt7365 = 0;
	}

	public void method2284() {
		this.anInt7364 = 0;
		this.anInt7365 = 0;
	}

	public void method2282(int arg0, int arg1) {
		if (arg0 == 0) {
			this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
			this.anInt7363 = 4096;
			this.anInt7365 = this.anInt7360;
			return;
		}
		this.anInt7363 = this.anInt7360 * this.anInt7366 >> 12;
		if (this.anInt7363 < 0) {
			this.anInt7363 = 0;
		} else if (this.anInt7363 > 4096) {
			this.anInt7363 = 4096;
		}
		this.anInt7360 = this.anInt7367 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt7360 = this.anInt7360 * this.anInt7360 >> 12;
		this.anInt7360 = this.anInt7360 * this.anInt7363 >> 12;
		this.anInt7365 += this.anInt7360 * this.anInt7361 >> 12;
		this.anInt7361 = this.anInt7361 * this.anInt7362 >> 12;
	}
}
