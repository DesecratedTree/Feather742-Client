package deob;

public class Class351 {

	public int anInt3479;

	public int[] anIntArray3480;

	public int[] anIntArray3481;

	public Class351(int arg0) {
		this.anInt3479 = arg0;
		this.anIntArray3480 = new int[this.anInt3479];
		this.anIntArray3481 = new int[this.anInt3479];
	}

	public static final void method4068(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 6;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			if (var2 >= 2) {
				throw new RuntimeException();
			}
			client.anInt9013 = var2;
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var3 + 1 >= client.anIntArrayArrayArray9082[client.anInt9013].length >> 1) {
				throw new RuntimeException();
			}
			client.anInt9085 = var3;
			client.anInt9087 = 0;
			client.anInt9088 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			client.anInt9089 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 4];
			if (var4 >= 2) {
				throw new RuntimeException();
			}
			client.anInt9183 = var4;
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 5];
			if (var5 + 1 >= client.anIntArrayArrayArray9082[client.anInt9183].length >> 1) {
				throw new RuntimeException();
			}
			client.anInt9086 = var5;
			Class147.anInt1621 = 1;
			Class439.anInt4456 = -1;
			Class457.anInt6844 = -1;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "oq.agh(" + ')');
		}
	}

	public static final void method4069(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -50).equipType;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oq.abe(" + ')');
		}
	}
}
