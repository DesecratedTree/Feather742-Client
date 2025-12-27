package deob;

public class Class330_Sub36_Sub1 extends Class330_Sub36 implements Interface21 {

	public int anInt9289 = 0;

	public int anInt9290 = 0;

	public int[] anIntArray9287;

	public int[] anIntArray9288;

	public void method3440(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 2) {
				this.anInt9290 = arg0.readUnsignedShort(1106068410);
			} else if (arg1 == 4) {
				this.anInt9289 = arg0.readUnsignedByte(162202350);
				this.anIntArray9288 = new int[this.anInt9289];
				this.anIntArray9287 = new int[this.anInt9289];
				for (int var4 = 0; var4 < this.anInt9289; var4++) {
					this.anIntArray9288[var4] = arg0.readUnsignedShort(-395269504);
					this.anIntArray9287[var4] = arg0.readUnsignedShort(1642513968);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aev.j(" + ')');
		}
	}

	public void method3441(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1736631748);
				if (var3 == 0) {
					if (arg1 != 0) {
					}
					return;
				}
				this.method3440(arg0, var3, -1721968349);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aev.r(" + ')');
		}
	}

	public static void method3442(int arg0, int arg1) {
		try {
			Class354_Sub1.anInt7987 = -1;
			Class354_Sub1.anInt7980 = arg0;
			Class448.anInt5556 = 3;
			Class101.anInt6456 = 100;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aev.cu(" + ')');
		}
	}
}
