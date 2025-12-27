package deob;

public class Class198 {

	public static Class198 aClass198_1915 = new Class198(1);

	public static Class198 aClass198_1919 = new Class198(2);

	public static Class198 aClass198_1922 = new Class198(2);

	public static Class198 aClass198_1917 = new Class198(2);

	public static Class198 aClass198_1918 = new Class198(1);

	public static Class198 aClass198_1920 = new Class198(1);

	public static Class198 aClass198_1916 = new Class198(1);

	public static Class198 aClass198_1921 = new Class198(2);

	public static Class198 aClass198_1914 = new Class198(1);

	public static Class198 aClass198_1923 = new Class198(2);

	public int anInt1924;

	public static long aLong1925;

	public Class198(int arg0) {
		this.anInt1924 = arg0;
	}

	public static void method2153(int arg0) {
		try {
			Class22.method472((byte) 2);
			Class393.aClass397_Sub1_4067.method4656(678720887);
			Class393.aClass397_Sub2_4069.method4656(-1087359649);
			Class330_Sub34 var1;
			int var2;
			if (client.anInt9003 > 0) {
				var1 = Class238.method2377(OutgoingPacket.aClass234_2492, client.aClass1_9025.aClass488_22, 753615513);
				var1.aClass330_Sub46_Sub2_7729.addShort(client.anInt9003 * 4, (byte) 70);
				for (var2 = 0; var2 < client.anInt9003; var2++) {
					Interface18 var3 = client.anInterface18Array9004[var2];
					long var4 = var3.method267(-2028920580) - Class393.aLong4065;
					if (var4 > 16777215L) {
						var4 = 16777215L;
					}
					Class393.aLong4065 = var3.method267(-697234886);
					var1.aClass330_Sub46_Sub2_7729.addByte(var3.method264((byte) 0), (byte) 49);
					var1.aClass330_Sub46_Sub2_7729.method3743((int) var4, -818654182);
				}
				client.aClass1_9025.method378(var1, -663085250);
			}
			if (Class393.anInt4068 > 0) {
				Class393.anInt4068--;
			}
			if (client.aBoolean9038 && Class393.anInt4068 <= 0) {
				Class393.anInt4068 = 20;
				client.aBoolean9038 = false;
				var1 = Class238.method2377(OutgoingPacket.aClass234_2501, client.aClass1_9025.aClass488_22, 356263337);
				var1.aClass330_Sub46_Sub2_7729.addShortA((int) client.aFloat9250 >> 3, -397179662);
				var1.aClass330_Sub46_Sub2_7729.addLEShort((int) client.aFloat9141 >> 3, -676872267);
				client.aClass1_9025.method378(var1, -2077367935);
			}
			if (Class393.aBoolean4066 != Class76_Sub1_Sub3.aBoolean9380) {
				Class393.aBoolean4066 = Class76_Sub1_Sub3.aBoolean9380;
				var1 = Class238.method2377(OutgoingPacket.aClass234_2489, client.aClass1_9025.aClass488_22, 357450712);
				var1.aClass330_Sub46_Sub2_7729.addByte(Class76_Sub1_Sub3.aBoolean9380 ? 1 : 0, (byte) 74);
				client.aClass1_9025.method378(var1, -1813047492);
			}
			if (!client.aBoolean9194) {
				var1 = Class238.method2377(OutgoingPacket.WORLD_MAP_PACKET, client.aClass1_9025.aClass488_22, 863590021);
				var1.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 60);
				var2 = var1.aClass330_Sub46_Sub2_7729.offset;
				Buffer var7 = Class448.aClass330_Sub50_5555.method3861(925699026);
				var1.aClass330_Sub46_Sub2_7729.method3749(var7.payload, 0, var7.offset, (byte) -56);
				var1.aClass330_Sub46_Sub2_7729.method3751(var1.aClass330_Sub46_Sub2_7729.offset - var2, -234039189);
				client.aClass1_9025.method378(var1, -2036283293);
				client.aBoolean9194 = true;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ig.f(" + ')');
		}
	}

	public static final void method2154(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class252.method2527(var3, var4, arg0, (byte) 1);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ig.dj(" + ')');
		}
	}

	public static void method2155(IComponentDefinitions arg0, int arg1, int arg2, int arg3) {
		try {
			Class484.aClass114_5789 = arg0;
			Class484.anInt5798 = arg1;
			Class484.anInt5799 = arg2;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ig.ai(" + ')');
		}
	}

	public static final void method2156(Class430 arg0, short arg1) {
		try {
			Class401_Sub1 var2 = Class100.method1212(-968048749);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 == null ? 0 : var2.anInt4131;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ig.anw(" + ')');
		}
	}

	public static final void method2157(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class65.method784(var3, arg0, -272625435);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ig.kj(" + ')');
		}
	}

	public static void method2158(int arg0, int arg1, IComponentDefinitions arg2, Class_ta arg3, int arg4, int arg5, int arg6) {
		try {
			int var7 = Class15.anInt192;
			int[] var8 = Class15.anIntArray187;
			for (int var9 = 0; var9 < var7; var9++) {
				Player var10 = client.players[var8[var9]];
				if (var10 != null && var10.method5465((byte) 103) && !var10.hidden && var10 != Class263_Sub2.myPlayer && var10.aByte8658 == Class263_Sub2.myPlayer.aByte8658) {
					Class260 var11 = var10.method5346().aClass260_2606;
					int var12 = (int) var11.aFloat2716 / 128 - arg0 / 128;
					int var13 = (int) var11.aFloat2711 / 128 - arg1 / 128;
					boolean var14 = false;
					for (int var15 = 0; var15 < client.anInt9256; var15++) {
						Class99 var16 = client.aClass99Array9259[var15];
						if (var10.aString10221.equals(var16.aString915) && var16.anInt911 != 0) {
							var14 = true;
							break;
						}
					}
					boolean var18 = false;
					for (int var19 = 0; var19 < Class452.anInt5561; var19++) {
						if (var10.aString10221.equals(Class95_Sub22.aClass13Array7210[var19].aString171)) {
							var18 = true;
							break;
						}
					}
					boolean var20 = false;
					if (Class263_Sub2.myPlayer.anInt10246 != 0 && var10.anInt10246 != 0 && var10.anInt10246 == Class263_Sub2.myPlayer.anInt10246) {
						var20 = true;
					}
					if (var10.aBoolean10234) {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[6], (byte) 0);
					} else if (var20) {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[4], (byte) 0);
					} else if (var10.aBoolean10247) {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[7], (byte) 0);
					} else if (var14) {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[3], (byte) 0);
					} else if (var18) {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[5], (byte) 0);
					} else {
						Class464_Sub3.method5744(arg2, arg3, arg4, arg5, var12, var13, Class76_Sub1.aClass61Array7097[2], (byte) 0);
					}
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "ig.b(" + ')');
		}
	}

	public static final void method2159(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			Class555.anIntArray6382[var2] = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub3.method3271(var2, (byte) -99);
			client.aBoolean9206 |= Class330_Sub26.aBooleanArray7696[var2];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ig.av(" + ')');
		}
	}
}
