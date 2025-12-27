package deob;

import java.util.Arrays;

public class Class95_Sub21 extends Class95 {

	public int anInt7202;

	public int[] anIntArray7204;

	public int anInt7201;

	public int anInt7203;

	public boolean method1165() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7201 * -538799439 * -850233775, -701440671);
		return var1.method5600(1953180833);
	}

	public void method1095(int arg0) {
		try {
			Class432_Sub1_Sub1_Sub1 var2 = Class96.aClass85Array854[this.anInt7202].method973(-1160484525);
			if (this.anInt7203 == 0) {
				Class150_Sub2.method1772(var2, this.anIntArray7204, 0, false, (byte) 38);
			} else {
				Class110.method1363(var2, new int[] { this.anInt7201 }, new int[] { 0 }, new int[] { this.anInt7203 }, (byte) -69);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zv.j(" + ')');
		}
	}

	public boolean method1166() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7201 * -538799439 * -850233775, -1834761010);
		return var1.method5600(1373059977);
	}

	public void method1100() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7202 * 765632567 * 1110381959].method973(-1160484525);
		if (this.anInt7203 * -1857797837 * -861822469 == 0) {
			Class150_Sub2.method1772(var1, this.anIntArray7204, 0, false, (byte) -44);
		} else {
			Class110.method1363(var1, new int[] { this.anInt7201 * -850233775 * -538799439 }, new int[] { 0 }, new int[] { this.anInt7203 * -861822469 * -1857797837 }, (byte) -16);
		}
	}

	public void method1098() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7202 * 765632567 * 1110381959].method973(-1160484525);
		if (this.anInt7203 * -1857797837 * -861822469 == 0) {
			Class150_Sub2.method1772(var1, this.anIntArray7204, 0, false, (byte) -86);
		} else {
			Class110.method1363(var1, new int[] { this.anInt7201 * -850233775 * -538799439 }, new int[] { 0 }, new int[] { this.anInt7203 * -861822469 * -1857797837 }, (byte) -82);
		}
	}

	public void method1099() {
		Class432_Sub1_Sub1_Sub1 var1 = Class96.aClass85Array854[this.anInt7202 * 765632567 * 1110381959].method973(-1160484525);
		if (this.anInt7203 * -1857797837 * -861822469 == 0) {
			Class150_Sub2.method1772(var1, this.anIntArray7204, 0, false, (byte) 24);
		} else {
			Class110.method1363(var1, new int[] { this.anInt7201 * -850233775 * -538799439 }, new int[] { 0 }, new int[] { this.anInt7203 * -861822469 * -1857797837 }, (byte) -109);
		}
	}

	public boolean method1167() {
		Class440 var1 = Class201.aClass436_6511.method5570(this.anInt7201 * -538799439 * -850233775, -1996585513);
		return var1.method5600(1082453293);
	}

	public boolean method1097(int arg0) {
		try {
			Class440 var2 = Class201.aClass436_6511.method5570(this.anInt7201, -214500980);
			return var2.method5600(740549980);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zv.p(" + ')');
		}
	}

	public Class95_Sub21(Buffer arg0) {
		super(arg0);
		this.anInt7202 = arg0.readUnsignedShort(1155191349);
		this.anIntArray7204 = new int[Class487_Sub1.method6040(-528466801).length];
		this.anInt7201 = arg0.readBigSmart(-1833203582);
		Arrays.fill(this.anIntArray7204, 0, this.anIntArray7204.length, this.anInt7201);
		this.anInt7203 = arg0.readInt((byte) 74);
	}

	public static final void method1168(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			if (client.aClass304_9030.method3023(-400722441) == null) {
				Class361.aClass_ra3793.method4789(arg0, arg1, arg2, arg3, -16777216, 463754225);
			} else {
				Class260 var6 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
				boolean var7 = false;
				if (client.anInt8987 == 2) {
					if ((int) var6.aFloat2716 < 0 || (int) var6.aFloat2716 >= client.aClass304_9030.method2990(-1656097053) * 512 || (int) var6.aFloat2711 < 0 || (int) var6.aFloat2711 >= client.aClass304_9030.method3033((byte) -95) * 512) {
						var7 = true;
					}
					if (Class147.anInt1621 == 2 && !Class401_Sub1.aClass145_Sub1_8249.method1687((byte) 84)) {
						var7 = true;
					}
				} else if (!client.aBoolean9039) {
					var7 = true;
				}
				if (var7) {
					Class361.aClass_ra3793.method4789(arg0, arg1, arg2, arg3, -16777216, 463754225);
				} else {
					client.anInt9092++;
					if (Class263_Sub2.myPlayer != null && (int) var6.aFloat2716 - (Class263_Sub2.myPlayer.method5453(-993854247) - 1) * 256 >> 9 == Class9.anInt146 && (int) var6.aFloat2711 - (Class263_Sub2.myPlayer.method5453(-1517513893) - 1) * 256 >> 9 == Class9.anInt151) {
						Class9.anInt146 = -1;
						Class9.anInt151 = -1;
						Class444.method5617(-1992849135);
					}
					Class95_Sub17.method1159(-2103705992);
					if (!arg4) {
						Class75.method853(-1662819278);
					}
					Class411.method5228(-525411590);
					Class376.method4364(arg0, arg1, arg2, arg3, true, (byte) 0);
					int var19 = client.anInt9251;
					int var20 = client.anInt9166;
					int var21 = client.anInt9255;
					int var22 = client.anInt9102;
					Class_na.method3513(var19, var20, (byte) 13);
					int var8;
					int var9;
					if (Class147.anInt1621 == 4) {
						var8 = (int) client.aFloat9250;
						if (client.anInt9272 >> 8 > var8) {
							var8 = client.anInt9272 >> 8;
						}
						if (client.aBooleanArray9238[4] && client.anIntArray9240[4] + 128 > var8) {
							var8 = client.anIntArray9240[4] + 128;
						}
						var9 = client.anInt9058 + (int) client.aFloat9141 & 0x3FFF;
						Class464.method5725(IndexTable.anInt2906, Class431.method5342((int) var6.aFloat2716, (int) var6.aFloat2711, Class85.anInt712, 1996761881) - client.anInt9077, Class308.anInt3194, var8, var9, SpecialKeys.zoomModifier * (var8 >> 3) + 600 << 2, var22, 1587524396);
					} else if (Class147.anInt1621 == 5) {
						var8 = (int) client.aFloat9250;
						if (client.anInt9272 >> 8 > var8) {
							var8 = client.anInt9272 >> 8;
						}
						if (client.aBooleanArray9238[4] && client.anIntArray9240[4] + 128 > var8) {
							var8 = client.anIntArray9240[4] + 128;
						}
						var9 = (int) client.aFloat9141 & 0x3FFF;
						Class464.method5725(IndexTable.anInt2906, Class431.method5342(client.anInt9068, client.anInt9069, Class85.anInt712, 1996761881) - client.anInt9077, Class308.anInt3194, var8, var9, SpecialKeys.zoomModifier * (var8 >> 3) + 600 << 2, var22, 1587524396);
					} else if (Class147.anInt1621 == 6) {
						Class283.method2827(var22, -76155214);
					}
					var8 = Class471.anInt5612;
					var9 = Gfx.anInt578;
					int var10 = Class325_Sub3.anInt7484;
					int var11 = Class321.anInt7018;
					int var12 = Class145_Sub1.anInt7266;
					int var14;
					for (int var13 = 0; var13 < 5; var13++) {
						if (client.aBooleanArray9238[var13]) {
							var14 = (int) (Math.random() * (double) (client.anIntArray9239[var13] * 2 + 1) - (double) client.anIntArray9239[var13] + Math.sin((double) client.anIntArray9106[var13] / 100.0D * (double) client.anIntArray9046[var13]) * (double) client.anIntArray9240[var13]);
							if (var13 == 0) {
								Class471.anInt5612 += var14 << 2;
							}
							if (var13 == 1) {
								Gfx.anInt578 += var14 << 2;
							}
							if (var13 == 2) {
								Class325_Sub3.anInt7484 += var14 << 2;
							}
							if (var13 == 3) {
								Class145_Sub1.anInt7266 = var14 + Class145_Sub1.anInt7266 & 0x3FFF;
							}
							if (var13 == 4) {
								Class321.anInt7018 += var14;
								if (Class321.anInt7018 < 1024) {
									Class321.anInt7018 = 1024;
								} else if (Class321.anInt7018 > 3072) {
									Class321.anInt7018 = 3072;
								}
							}
						}
					}
					if (Class471.anInt5612 < 0) {
						Class471.anInt5612 = 0;
					}
					if (Class471.anInt5612 > (client.aClass304_9030.method3023(-400722441).anInt3667 << 9) - 1) {
						Class471.anInt5612 = (client.aClass304_9030.method3023(-400722441).anInt3667 << 9) - 1;
					}
					if (Class325_Sub3.anInt7484 < 0) {
						Class325_Sub3.anInt7484 = 0;
					}
					if (Class325_Sub3.anInt7484 > (client.aClass304_9030.method3023(-400722441).anInt3654 << 9) - 1) {
						Class325_Sub3.anInt7484 = (client.aClass304_9030.method3023(-400722441).anInt3654 << 9) - 1;
					}
					Class212.method2225(-86705912);
					Class361.aClass_ra3793.ae(var19, var20, var21, var22);
					Class361.aClass_ra3793.r(var19, var20, var21 + var19, var20 + var22);
					Class394 var23 = client.aClass304_9030.method3008(12777420).method4577(-1531833658);
					var14 = var23.method4628((byte) -54);
					Class138 var15 = new Class138();
					Class381 var16 = client.aClass304_9030.method3022(-203859576);
					if (Class353.method4076((byte) -87)) {
						Class50.aClass145_Sub1_480.method1688(var15, client.aClass247_8975, client.aClass249_9024, var16.gameSceneBaseX << 9, var16.gameSceneBaseY << 9, -281224951);
					} else if (Class147.anInt1621 == 2) {
						Class401_Sub1.aClass145_Sub1_8249.method1688(var15, client.aClass247_8975, client.aClass249_9024, var16.gameSceneBaseX << 9, var16.gameSceneBaseY << 9, -907777840);
					} else {
						client.aClass247_8975.method2476((float) -Class471.anInt5612, (float) -Gfx.anInt578, (float) -Class325_Sub3.anInt7484);
						client.aClass247_8975.method2462(0.0F, -1.0F, 0.0F, Class257.method2541(-Class145_Sub1.anInt7266 & 0x3FFF));
						client.aClass247_8975.method2462(-1.0F, 0.0F, 0.0F, Class257.method2541(-Class321.anInt7018 & 0x3FFF));
						client.aClass247_8975.method2462(0.0F, 0.0F, -1.0F, Class257.method2541(-Class119.anInt1399 & 0x3FFF));
						Preferences.method2927(client.aClass249_9024, true, (float) (var21 / 2), (float) (var22 / 2), (float) (client.anInt9115 << 1), (float) (client.anInt9115 << 1), var21, var22, -441621868);
					}
					Class361.aClass_ra3793.cw(client.aClass247_8975);
					Class361.aClass_ra3793.ci(client.aClass249_9024);
					if (var23.method4625((byte) 97) == null) {
						Class361.aClass_ra3793.ba(3, var14);
					} else {
						Class361.aClass_ra3793.IA(1.0F);
						Class361.aClass_ra3793.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
						var23.method4625((byte) 116).method3082(Class361.aClass_ra3793, Class406.anInt4195 << 3, var19, var20, var21, var22, Class321.anInt7018, Class145_Sub1.anInt7266, Class119.anInt1399, var14, true, false, 218753719);
					}
					Class141.method1645(client.aClass247_8975, client.aClass249_9024, var21, var22, -1055972929);
					client.aClass304_9030.method3008(401875304).method4589(client.aClass304_9030, 169937610);
					byte var17 = Class448.aClass330_Sub50_5555.aClass464_Sub20_7889.method5807((byte) 49) == 2 ? (byte) client.anInt9092 : 1;
					if (Class353.method4076((byte) -73) || Class147.anInt1621 == 2) {
						client.aClass304_9030.method3023(-400722441).method4161(client.anInt8981, var15.anInt1532, var15.anInt1531, var15.anInt1533, client.aClass304_9030.method2999(-580390108), client.anIntArray9108, client.anIntArray8973, client.anIntArray8952, client.anIntArray9169, client.anIntArray9112, Class263_Sub2.myPlayer.aByte8658 + 1, var17, (int) var6.aFloat2716 >> 9, (int) var6.aFloat2711 >> 9, Class448.aClass330_Sub50_5555.aClass464_Sub11_7879.method5778(-1939307354) == 0, true, 0, true);
					} else {
						client.aClass304_9030.method3023(-400722441).method4161(client.anInt8981, Class471.anInt5612, Gfx.anInt578, Class325_Sub3.anInt7484, client.aClass304_9030.method2999(-580390108), client.anIntArray9108, client.anIntArray8973, client.anIntArray8952, client.anIntArray9169, client.anIntArray9112, Class263_Sub2.myPlayer.aByte8658 + 1, var17, (int) var6.aFloat2716 >> 9, (int) var6.aFloat2711 >> 9, Class448.aClass330_Sub50_5555.aClass464_Sub11_7879.method5778(-1870178426) == 0, true, 0, true);
					}
					client.anInt9199++;
					Class233.method2362((byte) -120);
					if (client.anInt8995 == 1) {
						Class464.method5724(var19, var20, var21, var22, 256, 256, 396338323);
						Class158_Sub2.method1854(var19, var20, var21, var22, 256, 256, (byte) 1);
						Class166_Sub2.method2010(var19, var20, var21, var22, 256, 256, -2146272981);
						Class279.method2747(var19, var20, var21, var22, -1794232197);
					}
					client.aClass304_9030.method3023(-400722441).method4146(-2086122693);
					Class471.anInt5612 = var8;
					Gfx.anInt578 = var9;
					Class325_Sub3.anInt7484 = var10;
					Class321.anInt7018 = var11;
					Class145_Sub1.anInt7266 = var12;
					if (client.aBoolean8979 && Class140_Sub1.aClass285_7263.method2835(16777215) == 0) {
						client.aBoolean8979 = false;
					}
					if (client.aBoolean8979) {
						Class361.aClass_ra3793.method4789(var19, var20, var21, var22, -16777216, 463754225);
						Class95_Sub22.method1175(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434), false, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -1220688202);
					}
					Preferences.method2927(client.aClass249_9024, false, (float) (var19 + var21 / 2), (float) (var20 + var22 / 2), (float) (client.anInt9115 << 1), (float) (client.anInt9115 << 1), var21, var22, -656300090);
					Class361.aClass_ra3793.ci(client.aClass249_9024);
					Class217.method2250(client.aClass249_9024, (byte) 0);
				}
			}
		} catch (RuntimeException var18) {
			throw Class476.method5964(var18, "zv.ik(" + ')');
		}
	}

	public static final void method1169(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub30_7894, arg0.anIntArray4387[--arg0.anInt4376], -2135682486);
			Class435.method5568(1806621951);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "zv.akf(" + ')');
		}
	}

	public static final void method1170(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			int var4 = -1;
			if (var3 != null) {
				var4 = var3.anInt1378;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "zv.aci(" + ')');
		}
	}

	public static final void method1171(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			ItemDefinitions var3 = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -89);
			if (var3.notedItemId >= 0 && var3.switchNoteItemId >= 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.switchNoteItemId;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "zv.abf(" + ')');
		}
	}
}
