package deob;

public class Class325_Sub5 extends Class325 {

	public int anInt7487 = (int) (Class312.method3111((byte) 86) / 1000L);

	public String aString7488;

	public short aShort7489;

	public Class325_Sub5(String arg0, int arg1) {
		this.aString7488 = arg0;
		this.aShort7489 = (short) arg1;
	}

	public static final void method3227(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			int var3 = client.aClass286Array9234[var2].method2868(402539080);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 == 5 ? 1 : 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "acm.yv(" + ')');
		}
	}
}
