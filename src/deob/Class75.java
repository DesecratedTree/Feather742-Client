package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class75 {

	public String aString646;

	public String aString647;

	public boolean aBoolean648;

	public static final boolean method847(int arg0, int arg1, Class366 arg2, Class307 arg3, short arg4) {
		try {
			int var5 = arg0;
			int var6 = arg1;
			byte var7 = 64;
			byte var8 = 64;
			int var9 = arg0 - var7;
			int var10 = arg1 - var8;
			Class295.anIntArrayArray3015[var7][var8] = 99;
			Class295.anIntArrayArray3019[var7][var8] = 0;
			byte var11 = 0;
			int var12 = 0;
			Class295.anIntArray3013[var11] = arg0;
			byte var10001 = var11;
			int var20 = var11 + 1;
			Class295.anIntArray3020[var10001] = arg1;
			int[][] var13 = arg3.anIntArrayArray3166;
			while (var20 != var12) {
				var5 = Class295.anIntArray3013[var12];
				var6 = Class295.anIntArray3020[var12];
				var12 = var12 + 1 & 0xFFF;
				int var18 = var5 - var9;
				int var19 = var6 - var10;
				int var14 = var5 - arg3.anInt3162;
				int var15 = var6 - arg3.anInt3163;
				if (arg2.method4274(1, var5, var6, arg3, -1782960669)) {
					Class295.anInt3017 = var5;
					Class202.anInt1936 = var6;
					return true;
				}
				int var16 = Class295.anIntArrayArray3019[var18][var19] + 1;
				if (var18 > 0 && Class295.anIntArrayArray3015[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 0x42240000) == 0) {
					Class295.anIntArray3013[var20] = var5 - 1;
					Class295.anIntArray3020[var20] = var6;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 - 1][var19] = 2;
					Class295.anIntArrayArray3019[var18 - 1][var19] = var16;
				}
				if (var18 < 127 && Class295.anIntArrayArray3015[var18 + 1][var19] == 0 && (var13[var14 + 1][var15] & 0x60240000) == 0) {
					Class295.anIntArray3013[var20] = var5 + 1;
					Class295.anIntArray3020[var20] = var6;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 + 1][var19] = 8;
					Class295.anIntArrayArray3019[var18 + 1][var19] = var16;
				}
				if (var19 > 0 && Class295.anIntArrayArray3015[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 0x40A40000) == 0) {
					Class295.anIntArray3013[var20] = var5;
					Class295.anIntArray3020[var20] = var6 - 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18][var19 - 1] = 1;
					Class295.anIntArrayArray3019[var18][var19 - 1] = var16;
				}
				if (var19 < 127 && Class295.anIntArrayArray3015[var18][var19 + 1] == 0 && (var13[var14][var15 + 1] & 0x48240000) == 0) {
					Class295.anIntArray3013[var20] = var5;
					Class295.anIntArray3020[var20] = var6 + 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18][var19 + 1] = 4;
					Class295.anIntArrayArray3019[var18][var19 + 1] = var16;
				}
				if (var18 > 0 && var19 > 0 && Class295.anIntArrayArray3015[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 0x43A40000) == 0 && (var13[var14 - 1][var15] & 0x42240000) == 0 && (var13[var14][var15 - 1] & 0x40A40000) == 0) {
					Class295.anIntArray3013[var20] = var5 - 1;
					Class295.anIntArray3020[var20] = var6 - 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 - 1][var19 - 1] = 3;
					Class295.anIntArrayArray3019[var18 - 1][var19 - 1] = var16;
				}
				if (var18 < 127 && var19 > 0 && Class295.anIntArrayArray3015[var18 + 1][var19 - 1] == 0 && (var13[var14 + 1][var15 - 1] & 0x60E40000) == 0 && (var13[var14 + 1][var15] & 0x60240000) == 0 && (var13[var14][var15 - 1] & 0x40A40000) == 0) {
					Class295.anIntArray3013[var20] = var5 + 1;
					Class295.anIntArray3020[var20] = var6 - 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 + 1][var19 - 1] = 9;
					Class295.anIntArrayArray3019[var18 + 1][var19 - 1] = var16;
				}
				if (var18 > 0 && var19 < 127 && Class295.anIntArrayArray3015[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + 1] & 0x4E240000) == 0 && (var13[var14 - 1][var15] & 0x42240000) == 0 && (var13[var14][var15 + 1] & 0x48240000) == 0) {
					Class295.anIntArray3013[var20] = var5 - 1;
					Class295.anIntArray3020[var20] = var6 + 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 - 1][var19 + 1] = 6;
					Class295.anIntArrayArray3019[var18 - 1][var19 + 1] = var16;
				}
				if (var18 < 127 && var19 < 127 && Class295.anIntArrayArray3015[var18 + 1][var19 + 1] == 0 && (var13[var14 + 1][var15 + 1] & 0x78240000) == 0 && (var13[var14 + 1][var15] & 0x60240000) == 0 && (var13[var14][var15 + 1] & 0x48240000) == 0) {
					Class295.anIntArray3013[var20] = var5 + 1;
					Class295.anIntArray3020[var20] = var6 + 1;
					var20 = var20 + 1 & 0xFFF;
					Class295.anIntArrayArray3015[var18 + 1][var19 + 1] = 12;
					Class295.anIntArrayArray3019[var18 + 1][var19 + 1] = var16;
				}
			}
			Class295.anInt3017 = var5;
			Class202.anInt1936 = var6;
			return false;
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "d.j(" + ')');
		}
	}

	public static void method848(Class545 arg0, int arg1, int arg2, Class410 arg3, Class432_Sub1_Sub2_Sub1 arg4, byte arg5) {
		try {
			Class430 var6 = Class325_Sub6.method3229((byte) 69);
			var6.aClass432_Sub1_Sub2_Sub1_4390 = arg4;
			Class217.method2252(arg0, arg1, arg2, var6, -1808665712);
			var6.aClass432_Sub1_Sub2_Sub1_4390 = null;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "d.w(" + ')');
		}
	}

	public static final void method849(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.anInt1655;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "d.xz(" + ')');
		}
	}

	public static final void method850(Class430 arg0, int arg1) {
		try {
			Class474.method5921(arg0.anIntArray4387[--arg0.anInt4376], (short) 2954);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "d.aij(" + ')');
		}
	}

	public static final void method851(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4378 -= 2;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class145.method1725((String) arg0.anObjectArray4386[arg0.anInt4378], (String) arg0.anObjectArray4386[arg0.anInt4378 + 1], Class429.aClass454_4369, -1715912811);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "d.aag(" + ')');
		}
	}

	public static void method852(int arg0) {
		try {
			try {
				File var1 = new File(Class291.aString2978, "random.dat");
				int var3;
				if (var1.exists()) {
					Class332.aClass489_6607 = new Class489(new Class490(var1, "rw", 25L), 24, 0);
				} else {
					label37: for (int var2 = 0; var2 < Class22.aStringArray303.length; var2++) {
						for (var3 = 0; var3 < Class455.aStringArray5562.length; var3++) {
							File var4 = new File(Class455.aStringArray5562[var3] + Class22.aStringArray303[var2] + File.separatorChar + "random.dat");
							if (var4.exists()) {
								Class332.aClass489_6607 = new Class489(new Class490(var4, "rw", 25L), 24, 0);
								break label37;
							}
						}
					}
				}
				if (Class332.aClass489_6607 == null) {
					RandomAccessFile var7 = new RandomAccessFile(var1, "rw");
					var3 = var7.read();
					var7.seek(0L);
					var7.write(var3);
					var7.seek(0L);
					var7.close();
					Class332.aClass489_6607 = new Class489(new Class490(var1, "rw", 25L), 24, 0);
				}
			} catch (IOException var5) {
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "d.w(" + ')');
		}
	}

	public static final void method853(int arg0) {
		try {
			for (Class330_Sub36_Sub11 var1 = (Class330_Sub36_Sub11) client.aClass471_9139.method5869(539664854); var1 != null; var1 = (Class330_Sub36_Sub11) client.aClass471_9139.method5873((byte) -82)) {
				Class432_Sub1_Sub1_Sub2 var2 = var1.aClass432_Sub1_Sub1_Sub2_9701;
				if (client.anInt8981 > var2.anInt10182) {
					var1.method3252(-1787429507);
					var2.method5497(9256887);
				} else if (client.anInt8981 >= var2.anInt10179) {
					var2.method5493((byte) -72);
					Class260 var5;
					if (var2.anInt10184 > 0) {
						if (client.anInt8987 == 0) {
							Class432_Sub1_Sub1_Sub1 var3 = Class96.aClass85Array854[var2.anInt10184 - 1].method973(-1160484525);
							if (var3 != null) {
								Class260 var4 = var3.method5346().aClass260_2606;
								if ((int) var4.aFloat2716 >= 0 && (int) var4.aFloat2716 < client.aClass304_9030.method2990(-1697203109) * 512 && (int) var4.aFloat2711 >= 0 && (int) var4.aFloat2711 < client.aClass304_9030.method3033((byte) -70) * 512) {
									var2.method5498((int) var4.aFloat2716, (int) var4.aFloat2711, Class431.method5342((int) var4.aFloat2716, (int) var4.aFloat2711, var3.aByte8658, 1996761881) - var2.anInt10178, client.anInt8981, 1398240737);
								}
							}
						} else {
							Class330_Sub35 var7 = (Class330_Sub35) client.aClass497_9014.method6094((long) (var2.anInt10184 - 1));
							if (var7 != null) {
								NPC var9 = (NPC) var7.anObject7733;
								var5 = var9.method5346().aClass260_2606;
								if ((int) var5.aFloat2716 >= 0 && (int) var5.aFloat2716 < client.aClass304_9030.method2990(-515537512) * 512 && (int) var5.aFloat2711 >= 0 && (int) var5.aFloat2711 < client.aClass304_9030.method3033((byte) -119) * 512) {
									var2.method5498((int) var5.aFloat2716, (int) var5.aFloat2711, Class431.method5342((int) var5.aFloat2716, (int) var5.aFloat2711, var2.aByte8658, 1996761881) - var2.anInt10178, client.anInt8981, 1691767688);
								}
							}
						}
					}
					if (var2.anInt10184 < 0) {
						int var8 = -var2.anInt10184 - 1;
						Player var10;
						if (var8 == client.anInt9121) {
							var10 = Class263_Sub2.myPlayer;
						} else {
							var10 = client.players[var8];
						}
						if (var10 != null) {
							var5 = var10.method5346().aClass260_2606;
							if ((int) var5.aFloat2716 >= 0 && (int) var5.aFloat2716 < client.aClass304_9030.method2990(-1326666353) * 512 && (int) var5.aFloat2711 >= 0 && (int) var5.aFloat2711 < client.aClass304_9030.method3033((byte) -77) * 512) {
								var2.method5498((int) var5.aFloat2716, (int) var5.aFloat2711, Class431.method5342((int) var5.aFloat2716, (int) var5.aFloat2711, var2.aByte8658, 1996761881) - var2.anInt10178, client.anInt8981, 564185227);
							}
						}
					}
					var2.method5494(client.anInt9210, 444801972);
					client.aClass304_9030.method3023(-400722441).method4145(var2, true, 164771788);
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "d.iy(" + ')');
		}
	}

	public static final void method854(Class330_Sub48 arg0, boolean arg1, boolean arg2, int arg3) {
		try {
			int var4 = arg0.anInt7859;
			int var5 = (int) arg0.aLong3341;
			arg0.method3252(305076370);
			if (arg1) {
				Class308.method3091(var4, (byte) 32);
			}
			Class432_Sub1_Sub1_Sub6.method5514(var4, 1965374521);
			IComponentDefinitions var6 = Class95.method1101(var5, 2100183725);
			if (var6 != null) {
				Class404.method4738(var6, 1602850388);
			}
			Class70.method818(-239640105);
			if (!arg2 && client.windowPaneId != -1) {
				Class527.method6268(client.windowPaneId, 1, (byte) 94);
			}
			Class508 var7 = new Class508(client.aClass497_9284);
			for (Class330_Sub48 var8 = (Class330_Sub48) var7.method6156(257803485); var8 != null; var8 = (Class330_Sub48) var7.next()) {
				if (!var8.method3251(122249317)) {
					var8 = (Class330_Sub48) var7.method6156(257803485);
					if (var8 == null) {
						if (arg3 >= 662709241) {
						}
						break;
					}
				}
				if (var8.anInt7860 == 3) {
					int var9 = (int) var8.aLong3341;
					if (var4 == var9 >>> 16) {
						method854(var8, true, arg2, -294851699);
					}
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "d.lg(" + ')');
		}
	}
}
