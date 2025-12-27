package deob;

public class ItemEquipDefinitions {

	public int[] maleEquipIds = new int[3];

	public int[] femaleEquipIds = new int[3];

	public short[] aShortArray6009 = new short[2];

	public int[] archiveIds2 = new int[2];

	public int[] archiveIds = new int[2];

	public short[] moreModifiedColors = new short[4];

	public static int anInt6005 = 2;

	public static int anInt6006 = 4;

	public static int anInt6008 = 8;

	public static int anInt6013 = 1;

	public ItemEquipDefinitions(ItemDefinitions arg0) {
		if (arg0 != null) {
			this.maleEquipIds[0] = arg0.maleEquip1;
			this.maleEquipIds[1] = arg0.maleEquip2;
			this.maleEquipIds[2] = arg0.maleEquip3;
			this.femaleEquipIds[0] = arg0.femaleEquip1;
			this.femaleEquipIds[1] = arg0.femaleEquip2;
			this.femaleEquipIds[2] = arg0.femaleEquip3;
			this.archiveIds2[0] = arg0.archiveID3;
			this.archiveIds2[1] = arg0.archiveID4;
			this.archiveIds[0] = arg0.archiveID;
			this.archiveIds[1] = arg0.archiveID2;
			if (arg0.modifiedModelColors != null) {
				this.moreModifiedColors = new short[arg0.modifiedModelColors.length];
				System.arraycopy(arg0.modifiedModelColors, 0, this.moreModifiedColors, 0, this.moreModifiedColors.length);
			}
			if (arg0.modifiedModelTextures != null) {
				this.aShortArray6009 = new short[arg0.modifiedModelTextures.length];
				System.arraycopy(arg0.modifiedModelTextures, 0, this.aShortArray6009, 0, this.aShortArray6009.length);
			}
		}
	}

	public static final void method6213(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.aString8968 == null || var2 >= Class452.anInt5561) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class95_Sub22.aClass13Array7210[var2].aByte173;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vk.wd(" + ')');
		}
	}

	public static void method6214(IComponentDefinitions[] arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
		try {
			for (int var6 = 0; var6 < arg0.length; var6++) {
				IComponentDefinitions var7 = arg0[var6];
				if (var7 == null) {
					if (arg5 <= 1) {
						break;
					}
				} else if (arg1 == var7.anInt1211) {
					Class432_Sub1_Sub3_Sub1.method5527(var7, arg2, arg3, arg4, (byte) 63);
					Class220.method2266(var7, arg2, arg3, 65280);
					if (var7.anInt1220 > var7.anInt1222 - var7.anInt1210) {
						var7.anInt1220 = var7.anInt1222 - var7.anInt1210;
					}
					if (var7.anInt1220 < 0) {
						var7.anInt1220 = 0;
					}
					if (var7.anInt1221 > var7.anInt1223 - var7.anInt1348) {
						var7.anInt1221 = var7.anInt1223 - var7.anInt1348;
					}
					if (var7.anInt1221 < 0) {
						var7.anInt1221 = 0;
					}
					if (var7.anInt1198 == 0) {
						Class540.method6327(arg0, var7, arg4, -1373642655);
					}
				} else if (arg5 <= 1) {
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vk.lp(" + ')');
		}
	}

	public static void method6215(byte arg0) {
		try {
			Class360.aClass1_3783.method382(-204240300);
			Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
			Class360.aClass1_3783.aClass222_20 = null;
			Class360.aClass1_3783.aClass222_35 = null;
			Class360.aClass1_3783.aClass222_36 = null;
			Class360.aClass1_3783.anInt30 = 0;
			client.anInt9026 = 0;
			Class24.method484(-308227103);
			client.anInt9257 = 0;
			client.anInt9256 = 0;
			client.anInt9261 = 0;
			client.aString8968 = null;
			Class452.anInt5561 = 0;
			Class95_Sub22.aClass13Array7210 = null;
			Class412.aClass154_4258 = null;
			CacheIndex.aClass154_1450 = null;
			Class457.method5663((short) 255);
			for (int var1 = 0; var1 < 25; var1++) {
				client.anIntArray9117[var1] = 0;
				client.anIntArray9143[var1] = 0;
				client.anIntArray9144[var1] = 0;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "vk.ac(" + ')');
		}
	}

	public static byte method6216(char arg0, int arg1) {
		try {
			byte var2;
			if (arg0 > 0 && arg0 < 128 || !(arg0 < 160 || arg0 > 255)) {
				var2 = (byte) arg0;
			} else if (arg0 == 8364) {
				var2 = -128;
			} else if (arg0 == 8218) {
				var2 = -126;
			} else if (arg0 == 402) {
				var2 = -125;
			} else if (arg0 == 8222) {
				var2 = -124;
			} else if (arg0 == 8230) {
				var2 = -123;
			} else if (arg0 == 8224) {
				var2 = -122;
			} else if (arg0 == 8225) {
				var2 = -121;
			} else if (arg0 == 710) {
				var2 = -120;
			} else if (arg0 == 8240) {
				var2 = -119;
			} else if (arg0 == 352) {
				var2 = -118;
			} else if (arg0 == 8249) {
				var2 = -117;
			} else if (arg0 == 338) {
				var2 = -116;
			} else if (arg0 == 381) {
				var2 = -114;
			} else if (arg0 == 8216) {
				var2 = -111;
			} else if (arg0 == 8217) {
				var2 = -110;
			} else if (arg0 == 8220) {
				var2 = -109;
			} else if (arg0 == 8221) {
				var2 = -108;
			} else if (arg0 == 8226) {
				var2 = -107;
			} else if (arg0 == 8211) {
				var2 = -106;
			} else if (arg0 == 8212) {
				var2 = -105;
			} else if (arg0 == 732) {
				var2 = -104;
			} else if (arg0 == 8482) {
				var2 = -103;
			} else if (arg0 == 353) {
				var2 = -102;
			} else if (arg0 == 8250) {
				var2 = -101;
			} else if (arg0 == 339) {
				var2 = -100;
			} else if (arg0 == 382) {
				var2 = -98;
			} else if (arg0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "vk.r(" + ')');
		}
	}
}
