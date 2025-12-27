package deob;

public class Class223_Sub1_Sub2 extends Class223_Sub1 {

	public byte[] aByteArray9485;

	public byte[] method2292(int arg0, int arg1, int arg2) {
		this.aByteArray9485 = new byte[arg0 * arg1 * arg2 * 2];
		this.method2279(arg0, arg1, arg2);
		return this.aByteArray9485;
	}

	public Class223_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	public void method2289(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9485[var10001] = var4;
		this.aByteArray9485[var5] = var4;
	}

	public void method2293(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9485[var10001] = var4;
		this.aByteArray9485[var5] = var4;
	}
}
