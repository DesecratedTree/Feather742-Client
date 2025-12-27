package deob;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class535 {

	public char aChar6227;

	public int anInt6225;

	public int anInt6226;

	public int anInt6228;

	public void method6308(Buffer arg0, short arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(663941675);
				if (var3 == 0) {
					if (arg1 < 255) {
					}
					return;
				}
				this.method6309(arg0, var3, -1648106698);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "we.r(" + ')');
		}
	}

	public void method6309(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.aChar6227 = Class127.method1546(arg0.readByte((byte) 32), -2146625067);
			} else if (arg1 == 3) {
				this.anInt6226 = arg0.readUnsignedShort(1323145111);
				this.anInt6228 = arg0.readUnsignedByte(837142210);
				this.anInt6225 = arg0.readUnsignedByte(14473167);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "we.j(" + ')');
		}
	}

	public static String method6310(Class330_Sub36_Sub10 arg0, int arg1) {
		try {
			if (Class484.aBoolean5782 || arg0 == null) {
				return "";
			} else {
				int[] var2 = Class22.method471(arg0, 1955685818);
				return var2 == null ? "" : Class431.method5343(var2, -1410668725);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "we.aa(" + ')');
		}
	}

	public static final int method6311(int arg0, int arg1) {
		try {
			return arg0 >> 11 & 0x7F;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "we.p(" + ')');
		}
	}

	public static byte[] method6312(Object arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 == null) {
				return null;
			} else if (arg0 instanceof byte[]) {
				byte[] var7 = (byte[]) arg0;
				return Arrays.copyOfRange(var7, arg1, arg1 + arg2);
			} else if (arg0 instanceof ByteBuffer) {
				ByteBuffer var4 = (ByteBuffer) arg0;
				byte[] var5 = new byte[arg2];
				var4.position(arg1);
				var4.get(var5, 0, arg2);
				return var5;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "we.i(" + ')');
		}
	}

	public static final void method6313(Class430 arg0, byte arg1) {
		try {
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-662919830) != Class136.aClass136_1525) {
				throw new RuntimeException();
			}
			Class166_Sub3 var2 = (Class166_Sub3) Class401_Sub1.aClass145_Sub1_8249.method1707(1915121166);
			var2.method2012(Class374.aClass245_6659, -1, 1379251543);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "we.ahv(" + ')');
		}
	}

	public static void method6314(int arg0, int arg1, IComponentDefinitions arg2, Class122 arg3, int arg4, int arg5, int arg6) {
		try {
			Class3[] var7 = client.aClass3Array8986;
			for (int var8 = 0; var8 < var7.length; var8++) {
				Class3 var9 = var7[var8];
				if (var9 != null && var9.anInt53 != 0 && client.anInt8981 % 20 < 10) {
					int var13;
					if (var9.anInt53 == 1) {
						Class330_Sub35 var10 = (Class330_Sub35) client.aClass497_9014.method6094((long) var9.anInt47);
						if (var10 != null) {
							NPC var11 = (NPC) var10.anObject7733;
							Class260 var12 = var11.method5346().aClass260_2606;
							var13 = (int) var12.aFloat2716 / 128 - arg0 / 128;
							int var14 = (int) var12.aFloat2711 / 128 - arg1 / 128;
							Class201_Sub1.method2169(arg2, arg3, arg4, arg5, var13, var14, var9.anInt46, 360000L);
						}
					}
					if (var9.anInt53 == 2) {
						int var16 = var9.anInt51 / 128 - arg0 / 128;
						int var18 = var9.anInt50 / 128 - arg1 / 128;
						long var20 = (long) (var9.anInt49 << 7);
						long var21 = var20 * var20;
						Class201_Sub1.method2169(arg2, arg3, arg4, arg5, var16, var18, var9.anInt46, var21);
					}
					if (var9.anInt53 == 10 && var9.anInt47 >= 0 && var9.anInt47 < client.players.length) {
						Player var17 = client.players[var9.anInt47];
						if (var17 != null) {
							Class260 var19 = var17.method5346().aClass260_2606;
							int var22 = (int) var19.aFloat2716 / 128 - arg0 / 128;
							var13 = (int) var19.aFloat2711 / 128 - arg1 / 128;
							Class201_Sub1.method2169(arg2, arg3, arg4, arg5, var22, var13, var9.anInt46, 360000L);
						}
					}
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "we.k(" + ')');
		}
	}
}
