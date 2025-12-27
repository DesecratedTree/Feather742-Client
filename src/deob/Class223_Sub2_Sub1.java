package deob;

public class Class223_Sub2_Sub1 extends Class223_Sub2 {

	public byte[] aByteArray9486;

	public byte[] method2295(int arg0, int arg1, int arg2) {
		this.aByteArray9486 = new byte[arg0 * arg1 * arg2 * 2];
		this.method2279(arg0, arg1, arg2);
		return this.aByteArray9486;
	}

	public void method2294(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9486[var10001] = -1;
		this.aByteArray9486[var5] = (byte) (var4 * 3 >> 5);
	}

	public Class223_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	public void method2296(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9486[var10001] = -1;
		this.aByteArray9486[var5] = (byte) (var4 * 3 >> 5);
	}
}
