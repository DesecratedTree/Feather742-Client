package deob;

public abstract class Class76_Sub2 extends Class76 {

	public static int anInt7098 = 4;

	public static final void method911(int arg0) {
		try {
			int var1 = Class15.anInt192;
			int[] var2 = Class15.anIntArray187;
			for (int var3 = 0; var3 < var1; var3++) {
				Player var4 = client.players[var2[var3]];
				if (var4 != null) {
					Class520.method6223(var4, false, 1434126461);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yu.hg(" + ')');
		}
	}

	public static final void method912(Class330_Sub46_Sub2 arg0, byte arg1) {
		try {
			for (int var2 = 0; var2 < Class15.anInt197; var2++) {
				int var3 = Class15.anIntArray196[var2];
				Player var4 = client.players[var3];
				int var5 = arg0.readUnsignedByte(692596640);
				if ((var5 & 0x8) != 0) {
					var5 += arg0.readUnsignedByte(-227538399) << 8;
				}
				if ((var5 & 0x2000) != 0) {
					var5 += arg0.readUnsignedByte(942202636) << 16;
				}
				Class103.decodePlayerMasks(arg0, var3, var4, var5, -235483894);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "yu.f(" + ')');
		}
	}

	public static void method913(IndexTable arg0, IndexTable arg1, int arg2, int arg3) {
		try {
			Class330_Sub36_Sub5.aClass280_9664 = arg0;
			Class469.aClass280_5609 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "yu.r(" + ')');
		}
	}

	public static final void method914(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub12 var3 = Class354.method4083(var2);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt9710;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "yu.aee(" + ')');
		}
	}

	public abstract boolean method899();

	public abstract void method900(Interface8_Impl1_Impl1 arg0);

	public abstract void method901(int arg0, Interface8_Impl1_Impl2 arg1);

	public abstract boolean method902();

	public abstract void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7);

	public abstract boolean method904();

	public abstract void method905(int arg0, Interface8_Impl1_Impl2 arg1);

	public abstract void method906(Interface8_Impl1_Impl1 arg0);

	public abstract boolean method907();

	public abstract boolean method908();

	public abstract void method909(int arg0, Interface8_Impl1_Impl2 arg1);

	public abstract void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7);
}
