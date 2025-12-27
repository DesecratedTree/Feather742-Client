package deob;

public class Class509 {

	public static int anInt5946;

	public static volatile IcmpService_Sub1 anIcmpService_Sub1_5947;

	public long method6161(int arg0) {
		try {
			return System.nanoTime();
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "va.r(" + ')');
		}
	}

	public Class509() {
		System.nanoTime();
	}

	public static ItemEquipDefinitions getModifiedColorDefinitions(ItemDefinitions arg0, Buffer arg1, int arg2) {
		try {
			if (arg0 == null) {
				return new ItemEquipDefinitions(arg0);
			}
			ItemEquipDefinitions var3 = new ItemEquipDefinitions(arg0);
			int var4 = arg1.readUnsignedByte(1925008033);
			boolean var5 = (var4 & 0x1) != 0;
			boolean var6 = (var4 & 0x2) != 0;
			boolean var7 = (var4 & 0x4) != 0;
			boolean var8 = (var4 & 0x8) != 0;
			if (var5) {
				var3.maleEquipIds[0] = arg1.readBigSmart(-2144710502);
				var3.femaleEquipIds[0] = arg1.readBigSmart(-1289610242);
				if (arg0.maleEquip2 != -1 || arg0.femaleEquip2 != -1) {
					var3.maleEquipIds[1] = arg1.readBigSmart(-1755514401);
					var3.femaleEquipIds[1] = arg1.readBigSmart(-2107062975);
				}
				if (arg0.maleEquip3 != -1 || arg0.femaleEquip3 != -1) {
					var3.maleEquipIds[2] = arg1.readBigSmart(-1959522065);
					var3.femaleEquipIds[2] = arg1.readBigSmart(-1943588341);
				}
			}
			if (var6) {
				var3.archiveIds2[0] = arg1.readBigSmart(-528083250);
				var3.archiveIds[0] = arg1.readBigSmart(-1115358399);
				if (arg0.archiveID4 != -1 || arg0.archiveID2 != -1) {
					var3.archiveIds2[1] = arg1.readBigSmart(-1467348242);
					var3.archiveIds[1] = arg1.readBigSmart(-876145807);
				}
			}
			int var9;
			int[] var10;
			int var11;
			if (var7) {
				var9 = arg1.readUnsignedShort(90663243);
				var10 = new int[] { var9 & 0xF, var9 >> 4 & 0xF, var9 >> 8 & 0xF, var9 >> 12 & 0xF };
				for (var11 = 0; var11 < 4; var11++) {
					var3.moreModifiedColors[var11] = (short) arg1.readUnsignedShort(1817368528);
				}
			}
			if (var8) {
				var9 = arg1.readUnsignedByte(1739781758);
				var10 = new int[] { var9 & 0xF, var9 >> 4 & 0xF };
				for (var11 = 0; var11 < 2; var11++) {
					var3.aShortArray6009[var11] = (short) arg1.readUnsignedShort(-242337559);
				}
			}
			return var3;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "va.r(" + ')');
		}
	}

	public static final void method6163(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -638716674);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1248;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "va.rt(" + ')');
		}
	}

	public static final void method6164(Class430 arg0, byte arg1) {
		try {
			Class330_Sub38 var2 = Class325_Sub6.method3228(-1538388090);
			if (var2 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.anInt7755;
				int var3 = var2.anInt7751 << 28 | Class354.anInt3510 + var2.anInt7756 << 14 | var2.anInt7753 + Class354.anInt3516;
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "va.aeb(" + ')');
		}
	}

	public static boolean method6165(int arg0) {
		try {
			return Class556.aClass562_6386 != null;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "va.i(" + ')');
		}
	}
}
