package deob;

public class Class507 {

	public static boolean aBoolean5933 = false;

	public static Class401_Sub1[] aClass401_Sub1Array5935 = new Class401_Sub1[0];

	public static int anInt5936 = 1001342;

	public static int anInt5931 = 0;

	public static Class422 aClass422_5938 = null;

	public static boolean aBoolean5939 = false;

	public static long aLong5934;

	public static Class498 aClass498_5929;

	public static Class498 aClass498_5930;

	public static Class498 aClass498_5932;

	public static Class498 aClass498_5937;

	public static Class61[] aClass61Array5940;

	public Class507() throws Throwable {
		throw new Error();
	}

	public static final void method6152(Class430 arg0, int arg1) {
		try {
			if (client.anInt9182 >= 2) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9182;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "uy.up(" + ')');
		}
	}

	public static final void method6153(Class430 arg0, int arg1) {
		try {
			NPC var2 = (NPC) arg0.aClass432_Sub1_Sub1_Sub1_4396;
			boolean var3 = false;
			Class551 var4 = var2.aClass551_10251;
			if (var4.anIntArray6326 != null) {
				var4 = var4.method6371(Class158.aClass561_6474, (byte) 71);
			}
			if (var4 != null) {
				var3 = var4.aBoolean6329;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3 ? 1 : 0;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "uy.ary(" + ')');
		}
	}

	public static Class214 method6154(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readUnsignedByte(-72694872);
			Class195 var3 = Class457.method5665(-1882618819)[arg0.readUnsignedByte(1951832713)];
			Class211 var4 = Class7.method412((byte) -93)[arg0.readUnsignedByte(796351783)];
			int var5 = arg0.readShort(-1100583751);
			int var6 = arg0.readShort(-1100583751);
			int var7 = arg0.readUnsignedShort(-253200869);
			int var8 = arg0.readUnsignedShort(1373876325);
			int var9 = arg0.readInt((byte) 74);
			int var10 = arg0.readInt((byte) 111);
			int var11 = arg0.readInt((byte) 27);
			boolean var12 = arg0.readUnsignedByte(-60870737) == 1;
			return new Class214(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "uy.r(" + ')');
		}
	}
}
