package deob;

public class Class11 {

	public static Class471 aClass471_166 = new Class471();

	public static Class263 aClass263_165;

	public static Class_ra aClass_ra164;

	public static int[] anIntArray167;

	public Class11() throws Throwable {
		throw new Error();
	}

	public static void method428(Class430 arg0, byte arg1) {
		try {
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[--arg0.anInt4376], -1762749075).aString4084;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "al.r(" + ')');
		}
	}

	public static final void method429(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub12 var3 = Class430.method5334(-2029779553);
			if (var3 != null) {
				boolean var4 = var3.method3484(var2 >> 28 & 0x3, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, Class428.anIntArray4354, (byte) -50);
				if (var4) {
					Class83.method968(Class428.anIntArray4354[1], Class428.anIntArray4354[2], (byte) -25);
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "al.aez(" + ')');
		}
	}

	public static final void method430(Class430 arg0, int arg1) {
		try {
			CacheIndex.method1523(1963242337);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "al.agp(" + ')');
		}
	}

	public static Class371 method431(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readUnsignedByte(602430291);
			int var3 = arg0.readUnsignedByte(464901887);
			return new Class371(var2, var3);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "al.o(" + ')');
		}
	}

	public static final void method432(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aShort9245;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aShort9016;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "al.amd(" + ')');
		}
	}

	public static void method433(Class440 arg0, int arg1, Class432_Sub1 arg2, int arg3) {
		try {
			if (Class333.anInt3360 < 50 && arg0 != null && arg0.anIntArrayArray4463 != null && arg1 < arg0.anIntArrayArray4463.length && arg0.anIntArrayArray4463[arg1] != null && arg2.aByte8658 == Class263_Sub2.myPlayer.aByte8658) {
				int var4 = arg0.anIntArrayArray4463[arg1][0];
				int var5 = var4 >> 8;
				int var6 = var4 >> 5 & 0x7;
				int var7 = var4 & 0x1F;
				int var8;
				if (arg0.anIntArrayArray4463[arg1].length > 1) {
					var8 = (int) (Math.random() * (double) arg0.anIntArrayArray4463[arg1].length);
					if (var8 > 0) {
						var5 = arg0.anIntArrayArray4463[arg1][var8];
					}
				}
				var8 = 256;
				if (arg0.anIntArray4468 != null && arg0.anIntArray4478 != null) {
					var8 = (int) (Math.random() * (double) (arg0.anIntArray4478[arg1] - arg0.anIntArray4468[arg1])) + arg0.anIntArray4468[arg1];
				}
				int var9 = arg0.anIntArray4476 == null ? 255 : arg0.anIntArray4476[arg1];
				if (var7 != 0) {
					if (arg2 == Class263_Sub2.myPlayer) {
						if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2040322733) == 0) {
							return;
						}
					} else if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1841564715) == 0) {
						return;
					}
					if (arg0.anInt4480 != -1) {
						int var10 = 0;
						if (arg2 instanceof Class432_Sub1_Sub1_Sub1) {
							var10 = ((Class432_Sub1_Sub1_Sub1) arg2).method5434(516943081);
						} else if (arg2 instanceof Class432_Sub1_Sub1_Sub4) {
							var10 = ((Class432_Sub1_Sub1_Sub4) arg2).method5504((byte) -11);
						} else if (arg2 instanceof Class432_Sub1_Sub1_Sub2) {
							var10 = ((Class432_Sub1_Sub1_Sub2) arg2).method5492((byte) 2);
						}
						if (var10 != 0 && var10 != Class263_Sub2.myPlayer.method5434(1819133214) && client.anInt9158 != var10) {
							var9 = var9 * arg0.anInt4480 / 100;
							if (var9 < 0) {
								var9 = 0;
							} else if (var9 > 255) {
								var9 = 255;
							}
						}
					}
					Class260 var15 = arg2.method5346().aClass260_2606;
					int var11 = (int) var15.aFloat2716 - 256 >> 9;
					int var12 = (int) var15.aFloat2711 - 256 >> 9;
					int var13 = Class263_Sub2.myPlayer == arg2 ? 0 : (var12 << 8) + (arg2.aByte8658 << 24) + (var11 << 16) + var7;
					Class333.aClass316Array3347[++Class333.anInt3360 - 1] = new Class316((byte) (arg0.aBoolean4475 ? 2 : 1), var5, var6, 0, var9, var13, var8, arg2);
				} else if (arg2 == Class263_Sub2.myPlayer) {
					if (arg0.aBoolean4475) {
						Class197.method2147(var5, var6, 0, var9, false, var8, -1437909969);
					} else {
						Class115.method1415(var5, var6, 0, var9, var8, (byte) -1);
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "al.n(" + ')');
		}
	}
}
