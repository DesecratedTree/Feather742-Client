package deob;

public class Class223_Sub1_Sub1 extends Class223_Sub1 {

	public byte[] aByteArray9484;

	public byte[] method2290(int arg0, int arg1, int arg2) {
		this.aByteArray9484 = new byte[arg0 * arg1 * arg2 * 2];
		this.method2279(arg0, arg1, arg2);
		return this.aByteArray9484;
	}

	public void method2289(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9484[var10001] = var4;
		this.aByteArray9484[var5] = var4;
	}

	public Class223_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	public void method2291(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.aByteArray9484[var10001] = var4;
		this.aByteArray9484[var5] = var4;
	}
}
