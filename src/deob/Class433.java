package deob;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class433 {

	public int anInt4411 = -1;

	public ClientScript aClass330_Sub36_Sub8_4413;

	public int[] anIntArray4412;

	public long[] aLongArray4414;

	public Object[] anObjectArray4410;

	public static final void method5556(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 7;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			int var6 = arg0.anIntArray4387[arg0.anInt4376 + 4];
			boolean var7 = arg0.anIntArray4387[arg0.anInt4376 + 5] == 1;
			int var8 = arg0.anIntArray4387[arg0.anInt4376 + 6];
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(756367168) != Class136.aClass136_1523) {
				throw new RuntimeException();
			}
			Class166_Sub2 var9 = (Class166_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1707(1672742978);
			Class244 var10 = new Class244();
			Class244 var11 = new Class244();
			var10.method2427(0.0F, 1.0F, 0.0F, (float) ((double) var6 * 2.0D * 3.141592653589793D / 16384.0D));
			Class260 var12 = new Class260(1.0F, 0.0F, 0.0F);
			var12.method2570(var10);
			var12.method2556();
			var11.method2425(var12, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
			var10.method2429(var11);
			Player var13 = Class263_Sub2.myPlayer;
			if (var13 != null) {
				var9.method2003(var13, new Class260((float) var2, (float) var3, (float) var4), var10, var7, var8, client.aClass304_9030.method2996(Class85.anInt712, 1875135057), client.aClass304_9030.method3001((byte) 106).anIntArrayArrayArray2793, (short) 255);
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "rz.ahn(" + ')');
		}
	}

	public static Object method5557(byte[] arg0, boolean arg1, byte arg2) {
		try {
			if (arg0 == null) {
				return null;
			} else if (arg0.length > 136) {
				ByteBuffer var3 = ByteBuffer.allocateDirect(arg0.length);
				var3.position(0);
				var3.put(arg0);
				return var3;
			} else if (arg1) {
				return Arrays.copyOf(arg0, arg0.length);
			} else {
				return arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rz.r(" + ')');
		}
	}

	public static final void method5558(Class430 arg0, byte arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = arg0.anObjectArray4375[arg0.anIntArray4394[arg0.anInt4397]];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rz.aq(" + ')');
		}
	}

	public static boolean method5559(int arg0) {
		try {
			try {
				if (!IcmpService_Sub1.available()) {
					boolean var5 = false;
					return var5;
				}
			} catch (Throwable var3) {
				return false;
			}
			if (Class509.anIcmpService_Sub1_5947 != null) {
				throw new IllegalStateException("");
			}
			Class509.anIcmpService_Sub1_5947 = new IcmpService_Sub1();
			Thread var1 = new Thread(new Class431());
			var1.setDaemon(true);
			var1.start();
			return true;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rz.o(" + ')');
		}
	}

	public static void method5560(IndexTable arg0, Interface_ma arg1, int arg2) {
		try {
			Class126_Sub2.aClass280_7229 = arg0;
			Class209.anInterface_ma1984 = arg1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rz.r(" + ')');
		}
	}

	public static final IComponentDefinitions method5561(Class120 arg0, IComponentDefinitions arg1, int arg2) {
		try {
			if (arg1.anInt1211 != -1) {
				return arg0.method1440(arg1.anInt1211, (byte) -22);
			}
			if (!arg0.aBoolean1402) {
				int var3 = arg1.anInt1196 >>> 16;
				Class508 var4 = new Class508(client.aClass497_9284);
				for (Class330_Sub48 var5 = (Class330_Sub48) var4.method6156(257803485); var5 != null; var5 = (Class330_Sub48) var4.next()) {
					if (var3 == var5.anInt7859) {
						return Class95.method1101((int) var5.aLong3341, 1095712662);
					}
				}
			}
			return null;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rz.ko(" + ')');
		}
	}

	public static final void method5562(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class354.aClass330_Sub36_Sub12_3497 == null ? -1 : Class354.aClass330_Sub36_Sub12_3497.anInt9708;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rz.afa(" + ')');
		}
	}
}
