package deob;

import java.io.IOException;

public class Class288 implements Comparable {

	public Object anObject2951;

	public Object anObject2952;

	public long aLong2953;

	public long aLong2954;

	public static Class330_Sub40_Sub2 aClass330_Sub40_Sub2_2955;

	public static Class469 aClass469_2956;

	public Class288(Object arg0, Object arg1) {
		this.anObject2951 = arg0;
		this.anObject2952 = arg1;
	}

	public int method2884(Class288 arg0, byte arg1) {
		try {
			if (this.aLong2954 < arg0.aLong2954) {
				return -1;
			} else if (this.aLong2954 > arg0.aLong2954) {
				return 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "lz.r(" + ')');
		}
	}

	public boolean equals(Object arg0) {
		try {
			if (!(arg0 instanceof Class288)) {
				throw new IllegalArgumentException();
			}
			return this.anObject2952.equals(((Class288) arg0).anObject2952);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lz.equals(" + ')');
		}
	}

	public int compareTo(Object arg0) {
		try {
			return this.method2884((Class288) arg0, (byte) -59);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lz.compareTo(" + ')');
		}
	}

	public static final void method2885(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			int var4 = arg2.anIntArray4387[--arg2.anInt4376];
			String var5 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			Class537 var6 = Class301.aClass543_3059.method6339(var4, -831030520);
			if (var6.aString6236.equals(var5)) {
				arg0.method1400(var4, -1637743120);
			} else {
				arg0.method1404(var4, var5, 1374414177);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "lz.gz(" + ')');
		}
	}

	public static final Object[] method2886(String arg0, Class430 arg1, int arg2) {
		try {
			Object[] var3 = new Object[arg0.length() + 1];
			int var4;
			for (var4 = var3.length - 1; var4 >= 1; var4--) {
				if (arg0.charAt(var4 - 1) == 's') {
					var3[var4] = arg1.anObjectArray4386[--arg1.anInt4378];
				} else if (arg0.charAt(var4 - 1) == 167) {
					var3[var4] = Long.valueOf(arg1.aLongArray4379[--arg1.anInt4380]);
				} else {
					var3[var4] = Integer.valueOf(arg1.anIntArray4387[--arg1.anInt4376]);
				}
			}
			var4 = arg1.anIntArray4387[--arg1.anInt4376];
			if (var4 == -1) {
				var3 = null;
			} else {
				var3[0] = Integer.valueOf(var4);
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lz.kl(" + ')');
		}
	}

	public static final void method2887(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub26_Sub3.method3396(var2, (byte) 51);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lz.aji(" + ')');
		}
	}

	public static void method2888(int arg0) {
		try {
			IComponentDefinitions.aClass367_1189.method4298((byte) 106);
			IComponentDefinitions.aClass367_1310.method4298((byte) 100);
			IComponentDefinitions.aClass367_1190.method4298((byte) 30);
			IComponentDefinitions.aClass367_1191.method4298((byte) 92);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "lz.c(" + ')');
		}
	}

	public static void method2889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
		try {
			if (arg1 != 0 && arg3 != -1) {
				Class432_Sub1_Sub1_Sub1 var17 = null;
				int var18;
				if (arg1 < 0) {
					var18 = -arg1 - 1;
					if (client.anInt9121 == var18) {
						var17 = Class263_Sub2.myPlayer;
					} else {
						var17 = client.players[var18];
					}
				} else {
					var18 = arg1 - 1;
					Class330_Sub35 var19 = (Class330_Sub35) client.aClass497_9014.method6094((long) var18);
					if (var19 != null) {
						var17 = (Class432_Sub1_Sub1_Sub1) var19.anObject7733;
					}
				}
				if (var17 != null) {
					Class364 var22 = var17.method5436(860056789);
					if (var22.anIntArrayArray3807 != null && var22.anIntArrayArray3807[arg3] != null) {
						arg4 -= var22.anIntArrayArray3807[arg3][1];
					}
					if (var22.anIntArrayArray3845 != null && var22.anIntArrayArray3845[arg3] != null) {
						arg4 -= var22.anIntArrayArray3845[arg3][1];
					}
				}
			}
			Class432_Sub1_Sub1_Sub2 var21 = new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), arg0, Class1.anInt39, Class1.anInt39, arg6, arg7, arg4, arg10 + client.anInt8981, arg11 + client.anInt8981, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
			var21.method5498(arg8, arg9, Class431.method5342(arg8, arg9, Class1.anInt39, 1996761881) - arg5, client.anInt8981 + arg10, 547962577);
			client.aClass471_9139.method5878(new Class330_Sub36_Sub11(var21), (short) 8192);
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "lz.np(" + ')');
		}
	}

	public static void method2890(byte arg0) {
		try {
			if (Class556.aClass562_6386 != null) {
				try {
					short var1;
					if (Class556.anInt6389 == 0) {
						var1 = 250;
					} else {
						var1 = 2000;
					}
					Class556.anInt6387++;
					if (Class556.anInt6387 > var1) {
						Class258.method2542(-850330081);
					}
					int var3;
					if (Class556.aClass562_6386 == Class562.aClass562_6435) {
						client.aClass1_9060.method384(Class330_Sub15.method3320(Class507.aClass498_5937.method6109((byte) 1), 15000, -652783208), Class507.aClass498_5937.aString5886, 744433070);
						client.aClass1_9060.method382(-227823778);
						Class330_Sub34 var2 = Class330_Sub39.method3548(810064148);
						var2.aClass330_Sub46_Sub2_7729.addByte(Class227.aClass227_2419.anInt2422, (byte) 101);
						var2.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 2);
						var3 = var2.aClass330_Sub46_Sub2_7729.offset;
						var2.aClass330_Sub46_Sub2_7729.addShort(742, (byte) 111);
						var2.aClass330_Sub46_Sub2_7729.addShort(1, (byte) 47);
						Class556.anIntArray6385 = IncomingPacket.method2273(var2, (byte) 16);
						int var4 = var2.aClass330_Sub46_Sub2_7729.offset;
						var2.aClass330_Sub46_Sub2_7729.addString(client.aString9126, (byte) -102);
						var2.aClass330_Sub46_Sub2_7729.addShort(client.anInt8956, (byte) 45);
						var2.aClass330_Sub46_Sub2_7729.method3802(client.aLong9079);
						var2.aClass330_Sub46_Sub2_7729.addString(Class18.aString237, (byte) -58);
						var2.aClass330_Sub46_Sub2_7729.addByte(Class429.aClass454_4369.method297((short) -1865), (byte) 15);
						var2.aClass330_Sub46_Sub2_7729.addByte(client.aClass435_9146.anInt4417, (byte) 61);
						Class511.method6182(var2.aClass330_Sub46_Sub2_7729, 1752082262);
						String var5 = client.aString8960;
						var2.aClass330_Sub46_Sub2_7729.addByte(var5 == null ? 0 : 1, (byte) 5);
						if (var5 != null) {
							var2.aClass330_Sub46_Sub2_7729.addString(var5, (byte) -46);
						}
						Class375.aClass330_Sub51_3933.method3863(var2.aClass330_Sub46_Sub2_7729, 1778706370);
						var2.aClass330_Sub46_Sub2_7729.offset += 7;
						var2.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, var4, var2.aClass330_Sub46_Sub2_7729.offset, (byte) -82);
						var2.aClass330_Sub46_Sub2_7729.method3772(var2.aClass330_Sub46_Sub2_7729.offset - var3, (byte) 126);
						client.aClass1_9060.method378(var2, -932336150);
						client.aClass1_9060.method381(1291010172);
						Class556.aClass562_6386 = Class562.aClass562_6436;
					}
					if (Class562.aClass562_6436 == Class556.aClass562_6386) {
						if (client.aClass1_9060.method380(2143824028) == null) {
							Class258.method2542(1514984401);
						} else if (client.aClass1_9060.method380(-1268740841).method4194(1, -1020237123)) {
							client.aClass1_9060.method380(1882873436).method4195(client.aClass1_9060.aClass330_Sub46_Sub2_17.payload, 0, 1, -1443053663);
							Class297.aClass460_3051 = (Class460) Class479.method6015(Class106.method1323(-1475777924), client.aClass1_9060.aClass330_Sub46_Sub2_17.payload[0] & 0xFF, (byte) 3);
							if (Class297.aClass460_3051 == Class460.aClass460_6846) {
								client.aClass1_9060.aClass488_22 = new IsaacCipher(Class556.anIntArray6385);
								int[] var8 = new int[4];
								for (var3 = 0; var3 < 4; var3++) {
									var8[var3] = Class556.anIntArray6385[var3] + 50;
								}
								client.aClass1_9060.aClass488_24 = new IsaacCipher(var8);
								new IsaacCipher(var8);
								client.aClass1_9060.aClass330_Sub46_Sub2_17.method3821(client.aClass1_9060.aClass488_24, -495463826);
								Class227.method2311(14, -1188873169);
								client.aClass1_9060.method382(-1830504489);
								client.aClass1_9060.aClass330_Sub46_Sub2_17.offset = 0;
								client.aClass1_9060.aClass222_20 = null;
								client.aClass1_9060.aClass222_35 = null;
								client.aClass1_9060.aClass222_36 = null;
								client.aClass1_9060.anInt30 = 0;
							} else {
								client.aClass1_9060.method379(1175619289);
							}
							client.aClass1_9060.currentIncomingPacket = null;
							Class556.aClass562_6386 = null;
						}
					}
				} catch (IOException var6) {
					Class258.method2542(-557617389);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "lz.b(" + ')');
		}
	}
}
