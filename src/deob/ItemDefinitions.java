package deob;

import java.util.Arrays;

public class ItemDefinitions implements Interface21 {

	public static boolean OLD_ITEMS = false;

	public static int anInt6682 = 1;

	public static int anInt6683 = 2;

	public static int anInt6685 = 1;

	public static short[] otherModifiedModelColors = new short[256];

	public static int anInt6710 = 6;

	public static int anInt6740 = 0;

	public static int color = 0;

	public String name = "null";

	public int modelZoom = 2000;

	public int modelRotation1 = 0;

	public int oldInvModel = -1;

	public int oldInvZoom = -1;

	public int oldModelRotation1 = -1;

	public int oldModelRotation2 = -1;

	public int oldModelOffset1 = -1;

	public int oldModelOffset2 = -1;

	public int oldMaleEquip1 = -1;

	public int oldMaleEquip2 = -1;

	public int oldMaleEquip3 = -1;

	public int oldFemaleEquip1 = -1;

	public int oldFemaleEquip2 = -1;

	public int oldFemaleEquip3 = -1;

	public int oldEquipType = -1;

	public int modelRotation2 = 0;

	public int anInt6717 = 0;

	public int modelOffset1 = 0;

	public int modelOffset2 = 0;

	public int anInt6736 = 0;

	public int anInt6705 = -1;

	public int value = 1;

	public boolean aBoolean6707 = false;

	public int anInt6751 = -1;

	public int equipType = -1;

	public int anInt6714 = -1;

	public int maleEquip1 = -1;

	public int maleEquip2 = -1;

	public int femaleEquip1 = -1;

	public int femaleEquip2 = -1;

	public int maleEquip3 = -1;

	public int femaleEquip3 = -1;

	public int anInt6721 = 0;

	public int anInt6722 = 0;

	public int anInt6723 = 0;

	public int anInt6724 = 0;

	public int anInt6725 = 0;

	public int anInt6726 = 0;

	public int archiveID3 = -1;

	public int archiveID4 = -1;

	public int archiveID = -1;

	public int archiveID2 = -1;

	public int switchNoteItemId = -1;

	public int notedItemId = -1;

	public int anInt6735 = -1;

	public int anInt6720 = -1;

	public int anInt6737 = 128;

	public int anInt6738 = 128;

	public int anInt6692 = 128;

	public int anInt6739 = 0;

	public int anInt6741 = 0;

	public int anInt6742 = 0;

	public boolean aBoolean6702 = false;

	public int anInt6744 = 0;

	public int anInt6747 = 0;

	public int anInt6748 = -1;

	public int anInt6728 = -1;

	public boolean aBoolean6716 = false;

	public int anInt6688;

	public int anInt6713;

	public int modelId;

	public Class497 aClass497_6745;

	public Class510 aClass510_6712;

	public static IndexTable aClass280_6752;

	public byte[] aByteArray6696;

	public byte[] aByteArray6697;

	public byte[] otherModifiedModelColorsAmount;

	public int[] anIntArray6689;

	public int[] anIntArray6701;

	public int[] anIntArray6711;

	public int[] stackAmounts;

	public int[] stackIds;

	public String[] groundOptions;

	public String[] inventoryOptions;

	public short[] modelColors;

	public short[] modelTextures;

	public short[] modifiedModelColors;

	public short[] modifiedModelTextures;

	public short[] oldModelColors;

	public short[] oldModelTextures;

	public short[] oldModifiedModelColors;

	public short[] oldModifiedModelTextures;

	public void method6277(byte arg0) {
	}

	public void method6278(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.modelId = arg0.readBigSmart(-1613790124);
			} else if (arg1 == 2) {
				this.name = arg0.readString(-622109814);
			} else if (arg1 == 4) {
				this.modelZoom = arg0.readUnsignedShort(-148876235);
			} else if (arg1 == 5) {
				this.modelRotation1 = arg0.readUnsignedShort(1684233619);
			} else if (arg1 == 6) {
				this.modelRotation2 = arg0.readUnsignedShort(738803449);
			} else if (arg1 == 7) {
				this.modelOffset1 = arg0.readUnsignedShort(54632649);
				if (this.modelOffset1 > 32767) {
					this.modelOffset1 -= 65536;
				}
			} else if (arg1 == 8) {
				this.modelOffset2 = arg0.readUnsignedShort(1464543210);
				if (this.modelOffset2 > 32767) {
					this.modelOffset2 -= 65536;
				}
			} else if (arg1 == 11) {
				this.anInt6736 = 1;
			} else if (arg1 == 12) {
				this.value = arg0.readInt((byte) 59);
			} else if (arg1 == 13) {
				this.anInt6751 = arg0.readUnsignedByte(-84505818);
			} else if (arg1 == 14) {
				this.equipType = arg0.readUnsignedByte(1027080989);
			} else if (arg1 == 16) {
				this.aBoolean6707 = true;
			} else if (arg1 == 18) {
				this.anInt6705 = arg0.readUnsignedShort(408025704);
			} else if (arg1 == 23) {
				this.maleEquip1 = arg0.readBigSmart(-496276360);
			} else if (arg1 == 24) {
				this.maleEquip2 = arg0.readBigSmart(-1925997134);
			} else if (arg1 == 25) {
				this.femaleEquip1 = arg0.readBigSmart(-777686532);
			} else if (arg1 == 26) {
				this.femaleEquip2 = arg0.readBigSmart(-1971120789);
			} else if (arg1 == 27) {
				this.anInt6714 = arg0.readUnsignedByte(1772243667);
			} else if (arg1 >= 30 && arg1 < 35) {
				this.groundOptions[arg1 - 30] = arg0.readString(-331564843);
			} else if (arg1 >= 35 && arg1 < 40) {
				this.inventoryOptions[arg1 - 35] = arg0.readString(-85715624);
			} else {
				int var4;
				int var5;
				if (arg1 == 40) {
					var4 = arg0.readUnsignedByte(758252286);
					this.modelColors = new short[var4];
					this.modifiedModelColors = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.modelColors[var5] = (short) arg0.readUnsignedShort(987130499);
						short var6 = (short) arg0.readUnsignedShort(1594018709);
						this.modifiedModelColors[var5] = var6;
					}
				} else if (arg1 == 41) {
					var4 = arg0.readUnsignedByte(1860039806);
					this.modelTextures = new short[var4];
					this.modifiedModelTextures = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.modelTextures[var5] = (short) arg0.readUnsignedShort(1650149039);
						this.modifiedModelTextures[var5] = (short) arg0.readUnsignedShort(437062664);
					}
				} else if (arg1 == 42) {
					var4 = arg0.readUnsignedByte(1152898340);
					this.otherModifiedModelColorsAmount = new byte[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.otherModifiedModelColorsAmount[var5] = arg0.readByte((byte) -3);
					}
				} else if (arg1 == 43) {
					this.anInt6713 = arg0.readInt((byte) 31);
					this.aBoolean6716 = true;
				} else {
					int var7;
					int var10;
					byte var11;
					if (arg1 == 44) {
						var4 = arg0.readUnsignedShort(247305726);
						var5 = 0;
						for (var10 = var4; var10 > 0; var10 >>= 0x1) {
							var5++;
						}
						this.aByteArray6696 = new byte[var5];
						var11 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray6696[var7] = var11++;
							} else {
								this.aByteArray6696[var7] = -1;
							}
						}
					} else if (arg1 == 45) {
						var4 = arg0.readUnsignedShort(1208804691);
						var5 = 0;
						for (var10 = var4; var10 > 0; var10 >>= 0x1) {
							var5++;
						}
						this.aByteArray6697 = new byte[var5];
						var11 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray6697[var7] = var11++;
							} else {
								this.aByteArray6697[var7] = -1;
							}
						}
					} else if (arg1 == 65) {
						this.aBoolean6702 = true;
					} else if (arg1 == 78) {
						this.maleEquip3 = arg0.readBigSmart(-1704693689);
					} else if (arg1 == 79) {
						this.femaleEquip3 = arg0.readBigSmart(-1822951487);
					} else if (arg1 == 90) {
						this.archiveID3 = arg0.readBigSmart(-559153014);
					} else if (arg1 == 91) {
						this.archiveID = arg0.readBigSmart(-739062506);
					} else if (arg1 == 92) {
						this.archiveID4 = arg0.readBigSmart(-897563730);
					} else if (arg1 == 93) {
						this.archiveID2 = arg0.readBigSmart(-1921407615);
					} else if (arg1 == 95) {
						this.anInt6717 = arg0.readUnsignedShort(1362853391);
					} else if (arg1 == 96) {
						this.anInt6744 = arg0.readUnsignedByte(2029250804);
					} else if (arg1 == 97) {
						this.switchNoteItemId = arg0.readUnsignedShort(-138150219);
					} else if (arg1 == 98) {
						this.notedItemId = arg0.readUnsignedShort(1217514548);
					} else if (arg1 >= 100 && arg1 < 110) {
						if (this.stackIds == null) {
							this.stackIds = new int[10];
							this.stackAmounts = new int[10];
						}
						this.stackIds[arg1 - 100] = arg0.readUnsignedShort(1043545976);
						this.stackAmounts[arg1 - 100] = arg0.readUnsignedShort(1781818998);
					} else if (arg1 == 110) {
						this.anInt6737 = arg0.readUnsignedShort(476812583);
					} else if (arg1 == 111) {
						this.anInt6738 = arg0.readUnsignedShort(1313433291);
					} else if (arg1 == 112) {
						this.anInt6692 = arg0.readUnsignedShort(1670514410);
					} else if (arg1 == 113) {
						this.anInt6739 = arg0.readByte((byte) -52);
					} else if (arg1 == 114) {
						this.anInt6741 = arg0.readByte((byte) -80);
					} else if (arg1 == 115) {
						this.anInt6742 = arg0.readUnsignedByte(585137420);
					} else if (arg1 == 121) {
						this.anInt6735 = arg0.readUnsignedShort(-261448121);
					} else if (arg1 == 122) {
						this.anInt6720 = arg0.readUnsignedShort(1391954987);
					} else if (arg1 == 125) {
						this.anInt6721 = arg0.readByte((byte) -43) << 2;
						this.anInt6723 = arg0.readByte((byte) 52) << 2;
						this.anInt6725 = arg0.readByte((byte) 34) << 2;
					} else if (arg1 == 126) {
						this.anInt6722 = arg0.readByte((byte) 16) << 2;
						this.anInt6724 = arg0.readByte((byte) 1) << 2;
						this.anInt6726 = arg0.readByte((byte) 29) << 2;
					} else if (arg1 == 127 || arg1 == 128 || arg1 == 129 || arg1 == 130) {
						arg0.readUnsignedByte(683614788);
						arg0.readUnsignedShort(-347986364);
					} else if (arg1 == 132) {
						var4 = arg0.readUnsignedByte(1074439978);
						this.anIntArray6701 = new int[var4];
						for (var5 = 0; var5 < var4; var5++) {
							this.anIntArray6701[var5] = arg0.readUnsignedShort(909770562);
						}
					} else if (arg1 == 134) {
						this.anInt6747 = arg0.readUnsignedByte(1023172850);
					} else if (arg1 == 139) {
						this.anInt6748 = arg0.readUnsignedShort(1284695047);
					} else if (arg1 == 140) {
						this.anInt6728 = arg0.readUnsignedShort(1772400168);
					} else if (arg1 >= 142 && arg1 < 147) {
						if (this.anIntArray6689 == null) {
							this.anIntArray6689 = new int[6];
							Arrays.fill(this.anIntArray6689, -1);
						}
						this.anIntArray6689[arg1 - 142] = arg0.readUnsignedShort(1064131342);
					} else if (arg1 >= 150 && arg1 < 155) {
						if (this.anIntArray6711 == null) {
							this.anIntArray6711 = new int[5];
							Arrays.fill(this.anIntArray6711, -1);
						}
						this.anIntArray6711[arg1 - 150] = arg0.readUnsignedShort(1379296576);
					} else if (arg1 == 242) {
						this.oldInvModel = arg0.readBigSmart(-1613790124);
						this.oldInvZoom = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 243) {
						this.oldMaleEquip3 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 244) {
						this.oldFemaleEquip3 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 245) {
						this.oldMaleEquip2 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 246) {
						this.oldFemaleEquip2 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 247) {
						this.oldMaleEquip1 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 248) {
						this.oldFemaleEquip1 = arg0.readBigSmart(-1613790124);
					} else if (arg1 == 250) {
						this.oldEquipType = arg0.readUnsignedByte(611610382);
					} else if (arg1 == 251) {
						var4 = arg0.readUnsignedByte(611610382);
						this.oldModelColors = new short[var4];
						this.oldModifiedModelColors = new short[var4];
						for (var5 = 0; var5 < var4; var5++) {
							this.oldModelColors[var5] = (short) arg0.readUnsignedShort(1064131342);
							this.oldModifiedModelColors[var5] = (short) arg0.readUnsignedShort(1064131342);
						}
					} else if (arg1 == 252) {
						var4 = arg0.readUnsignedByte(611610382);
						this.oldModelTextures = new short[var4];
						this.oldModifiedModelTextures = new short[var4];
						for (var5 = 0; var5 < var4; var5++) {
							this.oldModelTextures[var5] = (short) arg0.readUnsignedShort(1064131342);
							this.oldModifiedModelTextures[var5] = (short) arg0.readUnsignedShort(1064131342);
						}
					} else if (arg1 == 253) {
						this.oldModelRotation1 = arg0.readUnsignedShort(1772400168);
						this.oldModelRotation2 = arg0.readUnsignedShort(1772400168);
						this.oldModelOffset1 = arg0.readUnsignedShort(1772400168);
						this.oldModelOffset2 = arg0.readUnsignedShort(1772400168);
					} else if (arg1 == 249) {
						var4 = arg0.readUnsignedByte(611610382);
						if (this.aClass497_6745 == null) {
							var5 = Class136.method1594(var4, 1720258284);
							this.aClass497_6745 = new Class497(var5);
						}
						for (var5 = 0; var5 < var4; var5++) {
							boolean var12 = arg0.readUnsignedByte(86814745) == 1;
							var7 = arg0.readUnsignedTriByte(-1401356047);
							Class330 var8;
							if (var12) {
								var8 = new Class330_Sub35(arg0.readString(400565905));
							} else {
								var8 = new Class330_Sub23(arg0.readInt((byte) 45));
							}
							this.aClass497_6745.method6097(var8, (long) var7);
						}
					} else {
						System.out.println("Opcode missing? " + arg1);
					}
				}
			}
			if (this.name != null && !this.name.equals("null")) {
				this.value = ItemPrices.getValue(this.name, this.modelId, this.value);
				if (this.name.equals("Dragonfire shield")) {
				}
				if (this.getItemId() == 1205) {
					System.out.println("dagger opcode: " + arg1);
				} else if (!this.name.contains("longsword") && this.getItemId() == 1333) {
					System.out.println("scim opcode: " + arg1);
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vy.i(" + ')');
		}
	}

	public int[] method6279(Class_ra arg0, Class_ra arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, Class263 arg7, Class408 arg8, byte arg9) {
		try {
			Model var11 = Model.loadModel(this.aClass510_6712.modelIndex, this.modelId, 0);
			if (var11 == null) {
				return null;
			}
			if (var11.anInt881 < 13) {
				var11.method1196(2);
			}
			int var12;
			if (this.modelColors != null) {
				for (var12 = 0; var12 < this.modelColors.length; var12++) {
					if (this.otherModifiedModelColorsAmount == null || var12 >= this.otherModifiedModelColorsAmount.length) {
						var11.color(this.modelColors[var12], this.modifiedModelColors[var12]);
					} else {
						var11.color(this.modelColors[var12], otherModifiedModelColors[this.otherModifiedModelColorsAmount[var12] & 0xFF]);
					}
				}
			}
			if (this.modelTextures != null) {
				for (var12 = 0; var12 < this.modelTextures.length; var12++) {
					var11.method1200(this.modelTextures[var12], this.modifiedModelTextures[var12]);
				}
			}
			if (arg8 != null) {
				for (var12 = 0; var12 < 10; var12++) {
					for (int var13 = 0; var13 < Class408.modelColors[var12].length; var13++) {
						if (arg8.anIntArray4205[var12] < Class408.modifiedModelColors[var12][var13].length) {
							var11.color(Class408.modelColors[var12][var13], Class408.modifiedModelColors[var12][var13][arg8.anIntArray4205[var12]]);
						}
					}
				}
			}
			var12 = 2048;
			boolean var24 = false;
			if (this.anInt6737 != 128 || this.anInt6738 != 128 || this.anInt6692 != 128) {
				var24 = true;
				var12 |= 0x7;
			}
			Class387 var14 = arg0.cb(var11, var12, 64, this.anInt6739 + 64, this.anInt6741 * 5 + 768);
			if (!var14.method4462()) {
				return null;
			}
			if (var24) {
				var14.oa(this.anInt6737, this.anInt6738, this.anInt6692);
			}
			Class61 var15 = null;
			if (this.notedItemId != -1) {
				var15 = this.aClass510_6712.method6168(arg0, arg1, this.switchNoteItemId, 10, 1, 0, true, true, 0, arg7, arg8, (short) 1759);
				if (var15 == null) {
					return null;
				}
			} else if (this.anInt6720 != -1) {
				var15 = this.aClass510_6712.method6168(arg0, arg1, this.anInt6735, arg2, arg3, arg4, false, true, 0, arg7, arg8, (short) -1197);
				if (var15 == null) {
					return null;
				}
			} else if (this.anInt6728 != -1) {
				var15 = this.aClass510_6712.method6168(arg0, arg1, this.anInt6748, arg2, arg3, arg4, false, true, 0, arg7, arg8, (short) -345);
				if (var15 == null) {
					return null;
				}
			}
			int var16;
			if (arg5) {
				var16 = (int) ((double) this.modelZoom * 1.5D) << 2;
			} else if (arg3 == 2) {
				var16 = (int) ((double) this.modelZoom * 1.04D) << 2;
			} else {
				var16 = this.modelZoom << 2;
			}
			Class249 var17 = arg0.cs();
			Class249 var18 = arg0.cz();
			var18.method2493(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.1474836E9F, (float) arg0.method4782((byte) 0).method856(), (float) arg0.method4782((byte) 0).method857());
			arg0.ci(var18);
			arg0.ae(0, 0, arg0.method4782((byte) 0).method856(), arg0.method4782((byte) 0).method857());
			Class247 var19 = new Class247();
			arg0.cw(var19);
			arg0.IA((float) (Math.random() / 10.0D) + 0.95F);
			arg0.m(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
			Class247 var20 = arg0.cj();
			var20.method2473(0.0F, 0.0F, 1.0F, Class257.method2541(-this.anInt6717 << 3));
			var20.method2462(0.0F, 1.0F, 0.0F, Class257.method2541(this.modelRotation2 << 3));
			var20.method2474((float) (this.modelOffset1 << 2), (float) ((var16 * Class257.anIntArray2683[this.modelRotation1 << 3] >> 14) - var14.YA() / 2 + (this.modelOffset2 << 2)), (float) ((this.modelOffset2 << 2) + (Class257.anIntArray2684[this.modelRotation1 << 3] * var16 >> 14)));
			var20.method2462(1.0F, 0.0F, 0.0F, Class257.method2541(this.modelRotation1 << 3));
			arg0.r(0, 0, 36, 32);
			arg0.ba(2, 0);
			arg0.B(0, 0, 36, 32, 0, 0);
			arg0.c(0, -1, 0);
			var14.method4475(var20, null, 1);
			arg0.ci(var17);
			int[] var21 = arg0.ar(0, 0, 36, 32);
			if (arg3 >= 1) {
				var21 = this.method6284(var21, -16777214, 719425834);
				if (arg3 >= 2) {
					var21 = this.method6284(var21, -1, 276442950);
				}
			}
			if (arg4 != 0) {
				this.method6285(var21, arg4, 116650912);
			}
			if (this.anInt6720 != -1) {
				var15.method687(0, 0);
			} else if (this.anInt6728 != -1) {
				var15.method687(0, 0);
			}
			arg0.method4795(var21, 0, 36, 36, 32, (byte) -84).method687(0, 0);
			if (this.notedItemId != -1) {
				var15.method687(0, 0);
			}
			if (arg6 == 1 || arg6 == 2 && (this.anInt6736 == 1 || arg2 != 1) && arg2 != -1) {
				arg7.method2594(Class_ta_Sub3.method5686(arg2, this.aClass510_6712.aClass454_6785, 2103862546), 0, 9, -256, -16777215, 1465945162);
			}
			var21 = arg0.ar(0, 0, 36, 32);
			for (int var22 = 0; var22 < var21.length; var22++) {
				if ((var21[var22] & 0xFFFFFF) == 0) {
					var21[var22] = 0;
				} else {
					var21[var22] |= 0xFF000000;
				}
			}
			return var21;
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "vy.w(" + ')');
		}
	}

	public void method6280(ItemDefinitions arg0, ItemDefinitions arg1, int arg2) {
		try {
			this.value = 0;
			this.modelId = arg0.modelId;
			this.modelZoom = arg0.modelZoom;
			this.modelRotation1 = arg0.modelRotation1;
			this.modelRotation2 = arg0.modelRotation2;
			this.anInt6717 = arg0.anInt6717;
			this.modelOffset1 = arg0.modelOffset1;
			this.modelOffset2 = arg0.modelOffset2;
			this.modelColors = arg1.modelColors;
			this.modifiedModelColors = arg1.modifiedModelColors;
			this.otherModifiedModelColorsAmount = arg1.otherModifiedModelColorsAmount;
			this.modelTextures = arg1.modelTextures;
			this.modifiedModelTextures = arg1.modifiedModelTextures;
			this.name = arg1.name;
			this.aBoolean6707 = arg1.aBoolean6707;
			this.anInt6751 = arg1.anInt6751;
			this.equipType = arg1.equipType;
			this.anInt6714 = arg1.anInt6714;
			this.maleEquip1 = arg1.maleEquip1;
			this.maleEquip2 = arg1.maleEquip2;
			this.maleEquip3 = arg1.maleEquip3;
			this.femaleEquip1 = arg1.femaleEquip1;
			this.femaleEquip2 = arg1.femaleEquip2;
			this.femaleEquip3 = arg1.femaleEquip3;
			this.anInt6721 = arg1.anInt6721;
			this.anInt6722 = arg1.anInt6722;
			this.anInt6723 = arg1.anInt6723;
			this.anInt6724 = arg1.anInt6724;
			this.anInt6725 = arg1.anInt6725;
			this.anInt6726 = arg1.anInt6726;
			this.archiveID3 = arg1.archiveID3;
			this.archiveID4 = arg1.archiveID4;
			this.archiveID = arg1.archiveID;
			this.archiveID2 = arg1.archiveID2;
			this.anInt6742 = arg1.anInt6742;
			this.groundOptions = arg1.groundOptions;
			this.aClass497_6745 = arg1.aClass497_6745;
			this.inventoryOptions = new String[5];
			if (arg1.inventoryOptions != null) {
				for (int var4 = 0; var4 < 4; var4++) {
					this.inventoryOptions[var4] = arg1.inventoryOptions[var4];
				}
			}
			this.inventoryOptions[4] = Class526.aClass526_6045.method6257(this.aClass510_6712.aClass454_6785, 991479434);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.o(" + ')');
		}
	}

	public static final void changePrice(int arg0, int arg1) {
		ItemDefinitions var2 = Class556.aClass510_6392.getItemDefinitions(arg0, (byte) -51);
		var2.value = arg1;
	}

	public static final void changeColors(int arg0, int arg1) {
		color = arg1;
		Class556.aClass510_6392.itemDefinitions.put(null, (long) arg0);
		ItemDefinitions var2 = Class556.aClass510_6392.getItemDefinitions(arg0, (byte) -51);
		if (var2 == null) {
			SpecialKeys.sendConsoleMessage("Defs are null.");
		}
		if (var2 != null && var2.modelColors == null) {
			SpecialKeys.sendConsoleMessage("Model Colors are null.");
		}
		SpecialKeys.sendConsoleMessage("Model Colors Before: " + Arrays.toString(var2.modelTextures));
		SpecialKeys.sendConsoleMessage("Model Colors Before: " + Arrays.toString(var2.modelColors));
		SpecialKeys.sendConsoleMessage("M-Model Colors Before: " + Arrays.toString(var2.modifiedModelColors));
		SpecialKeys.sendConsoleMessage("Model Colors After: " + Arrays.toString(var2.modelColors));
		SpecialKeys.sendConsoleMessage("M-Model Colors After: " + Arrays.toString(var2.modifiedModelColors));
		var2.method6281(Class361.aClass_ra3793, 131072, -2, null, null, 0, 0, 0, 0, 1863127057);
	}

	public final Class387 method6281(Class_ra arg0, int arg1, int arg2, Class408 arg3, Class477 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11;
			if (this.stackIds != null && arg2 > 1) {
				var11 = -1;
				for (int var12 = 0; var12 < 10; var12++) {
					if (arg2 >= this.stackAmounts[var12] && this.stackAmounts[var12] != 0) {
						var11 = this.stackIds[var12];
					}
				}
				if (var11 != -1) {
					return this.aClass510_6712.getItemDefinitions(var11, (byte) -72).method6281(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8, 1863127057);
				}
			}
			var11 = arg1;
			if (arg4 != null) {
				var11 = arg1 | arg4.method5975(-536499054);
			}
			Class367 var13 = this.aClass510_6712.aClass367_6773;
			Class387 var21;
			synchronized (this.aClass510_6712.aClass367_6773) {
				var21 = (Class387) this.aClass510_6712.aClass367_6773.get((long) (this.anInt6688 | arg0.anInt4226 << 29));
			}
			if (var21 == null || arg0.ct(var21.m(), var11) != 0) {
				if (var21 != null) {
					var11 = arg0.cd(var11, var21.m());
				}
				int var22 = var11;
				if (this.modelTextures != null) {
					var22 = var11 | 0x8000;
				}
				if (this.modelColors != null || arg3 != null) {
					var22 |= 0x4000;
				}
				if (this.anInt6737 != 128) {
					var22 |= 0x1;
				}
				if (this.anInt6737 != 128) {
					var22 |= 0x2;
				}
				if (this.anInt6737 != 128) {
					var22 |= 0x4;
				}
				Model var14 = Model.loadModel(this.aClass510_6712.modelIndex, this.modelId, 0);
				if (var14 == null) {
					return null;
				}
				if (var14.anInt881 < 13) {
					var14.method1196(2);
				}
				var21 = arg0.cb(var14, var22, this.aClass510_6712.anInt6783, this.anInt6739 + 64, this.anInt6741 * 5 + 850);
				if (this.anInt6737 != 128 || this.anInt6738 != 128 || this.anInt6692 != 128) {
					var21.oa(this.anInt6737, this.anInt6738, this.anInt6692);
				}
				int var15;
				if (this.modelColors != null) {
					for (var15 = 0; var15 < this.modelColors.length; var15++) {
						if (this.otherModifiedModelColorsAmount == null || var15 >= this.otherModifiedModelColorsAmount.length) {
							var21.color(this.modelColors[var15], this.modifiedModelColors[var15]);
						} else {
							var21.color(this.modelColors[var15], otherModifiedModelColors[this.otherModifiedModelColorsAmount[var15] & 0xFF]);
						}
					}
				}
				if (this.modelTextures != null) {
					for (var15 = 0; var15 < this.modelTextures.length; var15++) {
						var21.paintTexture(this.modelTextures[var15], this.modifiedModelTextures[var15]);
					}
				}
				if (arg3 != null) {
					for (var15 = 0; var15 < 10; var15++) {
						for (int var16 = 0; var16 < Class408.modelColors[var15].length; var16++) {
							if (arg3.anIntArray4205[var15] < Class408.modifiedModelColors[var15][var16].length) {
								var21.color(Class408.modelColors[var15][var16], Class408.modifiedModelColors[var15][var16][arg3.anIntArray4205[var15]]);
							}
						}
					}
				}
				var21.KA(var11);
				Class367 var23 = this.aClass510_6712.aClass367_6773;
				synchronized (this.aClass510_6712.aClass367_6773) {
					this.aClass510_6712.aClass367_6773.put(var21, (long) (this.anInt6688 | arg0.anInt4226 << 29));
				}
			}
			if (arg4 != null || arg8 != 0) {
				var21 = var21.method4446((byte) 1, var11, true);
				if (arg4 != null) {
					arg4.method5976(var21, 0, -1785935258);
				}
				if (arg8 != 0) {
					var21.PA(arg5, arg6, arg7, arg8);
				}
			}
			var21.KA(arg1);
			return var21;
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "vy.f(" + ')');
		}
	}

	public ItemDefinitions method6282(int arg0, byte arg1) {
		try {
			if (this.stackIds != null && arg0 > 1) {
				int var3 = -1;
				for (int var4 = 0; var4 < 10; var4++) {
					if (arg0 >= this.stackAmounts[var4] && this.stackAmounts[var4] != 0) {
						var3 = this.stackIds[var4];
					}
				}
				if (var3 != -1) {
					return this.aClass510_6712.getItemDefinitions(var3, (byte) -7);
				}
			}
			return this;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.z(" + ')');
		}
	}

	public void method6283(ItemDefinitions arg0, ItemDefinitions arg1, int arg2) {
		try {
			this.value = 0;
			this.modelId = arg0.modelId;
			this.modelZoom = arg0.modelZoom;
			this.modelRotation1 = arg0.modelRotation1;
			this.modelRotation2 = arg0.modelRotation2;
			this.anInt6717 = arg0.anInt6717;
			this.modelOffset1 = arg0.modelOffset1;
			this.modelOffset2 = arg0.modelOffset2;
			this.modelColors = arg1.modelColors;
			this.modifiedModelColors = arg1.modifiedModelColors;
			this.otherModifiedModelColorsAmount = arg1.otherModifiedModelColorsAmount;
			this.modelTextures = arg1.modelTextures;
			this.modifiedModelTextures = arg1.modifiedModelTextures;
			this.name = arg1.name;
			this.aBoolean6707 = arg1.aBoolean6707;
			this.anInt6751 = arg1.anInt6751;
			this.equipType = arg1.equipType;
			this.anInt6714 = arg1.anInt6714;
			this.maleEquip1 = arg1.maleEquip1;
			this.maleEquip2 = arg1.maleEquip2;
			this.maleEquip3 = arg1.maleEquip3;
			this.femaleEquip1 = arg1.femaleEquip1;
			this.femaleEquip2 = arg1.femaleEquip2;
			this.femaleEquip3 = arg1.femaleEquip3;
			this.anInt6721 = arg1.anInt6721;
			this.anInt6722 = arg1.anInt6722;
			this.anInt6723 = arg1.anInt6723;
			this.anInt6724 = arg1.anInt6724;
			this.anInt6725 = arg1.anInt6725;
			this.anInt6726 = arg1.anInt6726;
			this.archiveID3 = arg1.archiveID3;
			this.archiveID4 = arg1.archiveID4;
			this.archiveID = arg1.archiveID;
			this.archiveID2 = arg1.archiveID2;
			this.anInt6742 = arg1.anInt6742;
			this.groundOptions = arg1.groundOptions;
			this.aClass497_6745 = arg1.aClass497_6745;
			this.anInt6736 = arg1.anInt6736;
			this.inventoryOptions = new String[5];
			if (arg1.inventoryOptions != null) {
				for (int var4 = 0; var4 < 4; var4++) {
					this.inventoryOptions[var4] = arg1.inventoryOptions[var4];
				}
			}
			this.inventoryOptions[4] = Class526.aClass526_6107.method6257(this.aClass510_6712.aClass454_6785, 991479434);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.s(" + ')');
		}
	}

	public int[] method6284(int[] arg0, int arg1, int arg2) {
		try {
			int[] var4 = new int[1152];
			int var5 = 0;
			for (int var6 = 0; var6 < 32; var6++) {
				for (int var7 = 0; var7 < 36; var7++) {
					int var8 = arg0[var5];
					if (var8 == 0) {
						if (var7 > 0 && arg0[var5 - 1] != 0) {
							var8 = arg1;
						} else if (var6 > 0 && arg0[var5 - 36] != 0) {
							var8 = arg1;
						} else if (var7 < 35 && arg0[var5 + 1] != 0) {
							var8 = arg1;
						} else if (var6 < 31 && arg0[var5 + 36] != 0) {
							var8 = arg1;
						}
					}
					var4[var5++] = var8;
				}
			}
			return var4;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vy.n(" + ')');
		}
	}

	public void method6285(int[] arg0, int arg1, int arg2) {
		try {
			for (int var4 = 31; var4 > 0; var4--) {
				int var5 = var4 * 36;
				for (int var6 = 35; var6 > 0; var6--) {
					if (arg0[var5 + var6] == 0 && arg0[var5 + var6 - 1 - 36] != 0) {
						arg0[var6 + var5] = arg1;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vy.l(" + ')');
		}
	}

	public final boolean method6286(boolean arg0, ItemEquipDefinitions arg1, int arg2) {
		try {
			int var4;
			int var5;
			if (arg0) {
				if (arg1 == null || arg1.archiveIds == null) {
					var4 = this.archiveID;
					var5 = this.archiveID2;
				} else {
					var4 = arg1.archiveIds[0];
					var5 = arg1.archiveIds[1];
				}
			} else if (arg1 == null || arg1.archiveIds2 == null) {
				var4 = this.archiveID3;
				var5 = this.archiveID4;
			} else {
				var4 = arg1.archiveIds2[0];
				var5 = arg1.archiveIds2[1];
			}
			if (var4 == -1) {
				return true;
			}
			boolean var6 = true;
			if (!this.aClass510_6712.modelIndex.hasStoredFile(var4, 0, (byte) 32)) {
				var6 = false;
			}
			if (var5 != -1 && !this.aClass510_6712.modelIndex.hasStoredFile(var5, 0, (byte) 32)) {
				var6 = false;
			}
			return var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "vy.u(" + ')');
		}
	}

	public int method6287(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_6745 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_6745.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.g(" + ')');
		}
	}

	public String method6288(int arg0, String arg1, byte arg2) {
		try {
			if (this.aClass497_6745 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_6745.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.d(" + ')');
		}
	}

	public int method6289(int arg0, int arg1) {
		try {
			return this.anIntArray6689 == null ? -1 : this.anIntArray6689[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vy.c(" + ')');
		}
	}

	public int method6290(int arg0, int arg1) {
		try {
			return this.anIntArray6711 == null ? -1 : this.anIntArray6711[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "vy.a(" + ')');
		}
	}

	public final boolean missingFile(boolean arg0, ItemEquipDefinitions arg1, int arg2) {
		try {
			int var4;
			int var5;
			int var6;
			if (arg0) {
				if (arg1 == null || arg1.femaleEquipIds == null) {
					var4 = this.femaleEquip1;
					var5 = this.femaleEquip2;
					var6 = this.femaleEquip3;
				} else {
					var4 = arg1.femaleEquipIds[0];
					var5 = arg1.femaleEquipIds[1];
					var6 = arg1.femaleEquipIds[2];
				}
			} else if (arg1 == null || arg1.maleEquipIds == null) {
				var4 = this.maleEquip1;
				var5 = this.maleEquip2;
				var6 = this.maleEquip3;
			} else {
				var4 = arg1.maleEquipIds[0];
				var5 = arg1.maleEquipIds[1];
				var6 = arg1.maleEquipIds[2];
			}
			if (var4 == -1) {
				return true;
			}
			boolean var7 = true;
			if (!this.aClass510_6712.modelIndex.hasStoredFile(var4, 0, (byte) 32)) {
				var7 = false;
			}
			if (var5 != -1 && !this.aClass510_6712.modelIndex.hasStoredFile(var5, 0, (byte) 32)) {
				var7 = false;
			}
			if (var6 != -1 && !this.aClass510_6712.modelIndex.hasStoredFile(var6, 0, (byte) 32)) {
				var7 = false;
			}
			return var7;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "vy.k(" + ')');
		}
	}

	public final Model getEquipmentInformation(boolean arg0, ItemEquipDefinitions arg1, int arg2) {
		try {
			int var4;
			int var5;
			int var6;
			if (arg0) {
				if (arg1 == null || arg1.femaleEquipIds == null) {
					var4 = this.femaleEquip1;
					var5 = this.femaleEquip2;
					var6 = this.femaleEquip3;
				} else {
					var4 = arg1.femaleEquipIds[0];
					var5 = arg1.femaleEquipIds[1];
					var6 = arg1.femaleEquipIds[2];
				}
			} else if (arg1 == null || arg1.maleEquipIds == null) {
				var4 = this.maleEquip1;
				var5 = this.maleEquip2;
				var6 = this.maleEquip3;
			} else {
				var4 = arg1.maleEquipIds[0];
				var5 = arg1.maleEquipIds[1];
				var6 = arg1.maleEquipIds[2];
			}
			if (var4 == -1) {
				return null;
			}
			Model var7 = Model.loadModel(this.aClass510_6712.modelIndex, var4, 0);
			if (var7 == null) {
				return null;
			}
			if (var7.anInt881 < 13) {
				var7.method1196(2);
			}
			if (var5 != -1) {
				Model var8 = Model.loadModel(this.aClass510_6712.modelIndex, var5, 0);
				if (var8.anInt881 < 13) {
					var8.method1196(2);
				}
				if (var6 == -1) {
					Model[] var13 = new Model[] { var7, var8 };
					var7 = new Model(var13, 2);
				} else {
					Model var9 = Model.loadModel(this.aClass510_6712.modelIndex, var6, 0);
					if (var9.anInt881 < 13) {
						var9.method1196(2);
					}
					Model[] var10 = new Model[] { var7, var8, var9 };
					var7 = new Model(var10, 3);
				}
			}
			if (!arg0 && (this.anInt6721 != 0 || this.anInt6723 != 0 || this.anInt6725 != 0)) {
				var7.method1194(this.anInt6721, this.anInt6723, this.anInt6725);
			}
			if (arg0 && (this.anInt6722 != 0 || this.anInt6724 != 0 || this.anInt6726 != 0)) {
				var7.method1194(this.anInt6722, this.anInt6724, this.anInt6726);
			}
			short[] var12;
			int var14;
			if (this.modelColors != null) {
				if (arg1 == null || arg1.moreModifiedColors == null) {
					var12 = this.modifiedModelColors;
				} else {
					var12 = arg1.moreModifiedColors;
				}
				for (var14 = 0; var14 < this.modelColors.length; var14++) {
					var7.color(this.modelColors[var14], var12[var14]);
				}
			}
			if (this.modelTextures != null) {
				if (arg1 == null || arg1.aShortArray6009 == null) {
					var12 = this.modifiedModelTextures;
				} else {
					var12 = arg1.aShortArray6009;
				}
				for (var14 = 0; var14 < this.modelTextures.length; var14++) {
					var7.method1200(this.modelTextures[var14], var12[var14]);
				}
			}
			return var7;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "vy.q(" + ')');
		}
	}

	public void method6293(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-178251306);
				if (var3 == 0) {
					if (arg1 <= -1682046256) {
						throw new IllegalStateException();
					}
					if (OLD_ITEMS) {
						String var6 = this.name.toLowerCase();
						if (var6.contains("d'hide body") || var6.contains("dragonhide body") || var6.equals("stripy pirate shirt") || var6.contains("chainbody") && (var6.contains("iron") || var6.contains("bronze") || var6.contains("steel") || var6.contains("black") || var6.contains("mithril") || var6.contains("adamant") || var6.contains("rune") || var6.contains("white")) || var6.equals("leather body") || var6.equals("hardleather body") || var6.contains("studded body")) {
							return;
						}
						int[] var4 = OldItems.getOldItemData(this.getItemId());
						if (var4 == null || var4.length == 0) {
							return;
						}
						this.oldInvModel = var4[0];
						this.oldInvZoom = var4[1];
						this.oldModelRotation1 = var4[2];
						this.oldModelRotation2 = var4[3];
						this.oldModelOffset1 = var4[4];
						this.oldModelOffset2 = var4[5];
						this.oldMaleEquip1 = var4[6];
						this.oldMaleEquip2 = var4[7];
						this.oldMaleEquip3 = var4[8];
						this.oldFemaleEquip1 = var4[9];
						this.oldFemaleEquip2 = var4[10];
						this.oldFemaleEquip3 = var4[11];
						this.oldEquipType = var4[12];
						if (this.oldInvModel != -1) {
							this.modelId = this.oldInvModel;
						}
						if (this.oldInvZoom != -1) {
							this.modelZoom = this.oldInvZoom;
						}
						if (this.oldModelRotation1 != -1) {
							this.modelRotation1 = this.oldModelRotation1;
						}
						if (this.oldModelRotation2 != -1) {
							this.modelRotation2 = this.oldModelRotation2;
						}
						if (this.oldModelOffset1 != -1) {
							this.modelOffset1 = this.oldModelOffset1;
							if (this.modelOffset1 > 32767) {
								this.modelOffset1 -= 65536;
							}
						}
						if (this.oldModelOffset2 != -1) {
							this.modelOffset2 = this.oldModelOffset2;
							if (this.modelOffset2 > 32767) {
								this.modelOffset2 -= 65536;
							}
						}
						if (this.oldMaleEquip1 != -1) {
							this.maleEquip1 = this.oldMaleEquip1;
						}
						if (this.oldMaleEquip2 != -1) {
							this.maleEquip2 = this.oldMaleEquip2;
						}
						if (this.oldMaleEquip3 != -1) {
							this.maleEquip3 = this.oldMaleEquip3;
						}
						if (this.oldFemaleEquip1 != -1) {
							this.femaleEquip1 = this.oldFemaleEquip1;
						}
						if (this.oldFemaleEquip2 != -1) {
							this.femaleEquip2 = this.oldFemaleEquip2;
						}
						if (this.oldFemaleEquip3 != -1) {
							this.femaleEquip3 = this.oldFemaleEquip3;
						}
						if (this.oldEquipType != -1) {
							this.equipType = this.oldEquipType;
						}
						if (this.oldModelColors != null) {
							this.modelColors = this.oldModelColors;
							this.modifiedModelColors = this.oldModifiedModelColors;
						}
						if (this.oldModelTextures != null) {
							this.modelTextures = this.oldModelTextures;
							this.modifiedModelTextures = this.oldModifiedModelTextures;
						}
					}
					return;
				}
				this.method6278(arg0, var3, 1876120180);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.j(" + ')');
		}
	}

	public int getItemId() {
		return this.anInt6688;
	}

	public void method6294(ItemDefinitions arg0, ItemDefinitions arg1, byte arg2) {
		try {
			this.modelId = arg0.modelId;
			this.modelZoom = arg0.modelZoom;
			this.modelRotation1 = arg0.modelRotation1;
			this.modelRotation2 = arg0.modelRotation2;
			this.anInt6717 = arg0.anInt6717;
			this.modelOffset1 = arg0.modelOffset1;
			this.modelOffset2 = arg0.modelOffset2;
			this.modelColors = arg0.modelColors;
			this.modifiedModelColors = arg0.modifiedModelColors;
			this.otherModifiedModelColorsAmount = arg0.otherModifiedModelColorsAmount;
			this.modelTextures = arg0.modelTextures;
			this.modifiedModelTextures = arg0.modifiedModelTextures;
			this.name = arg1.name;
			this.aBoolean6707 = arg1.aBoolean6707;
			this.value = arg1.value;
			this.anInt6736 = 1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "vy.p(" + ')');
		}
	}

	public final Model getEquipmentInformation2(boolean arg0, ItemEquipDefinitions arg1, byte arg2) {
		try {
			int var4;
			int var5;
			if (arg0) {
				if (arg1 == null || arg1.archiveIds == null) {
					var4 = this.archiveID;
					var5 = this.archiveID2;
				} else {
					var4 = arg1.archiveIds[0];
					var5 = arg1.archiveIds[1];
				}
			} else if (arg1 == null || arg1.archiveIds2 == null) {
				var4 = this.archiveID3;
				var5 = this.archiveID4;
			} else {
				var4 = arg1.archiveIds2[0];
				var5 = arg1.archiveIds2[1];
			}
			if (var4 == -1) {
				return null;
			}
			Model var6 = Model.loadModel(this.aClass510_6712.modelIndex, var4, 0);
			if (var6.anInt881 < 13) {
				var6.method1196(2);
			}
			if (var5 != -1) {
				Model var7 = Model.loadModel(this.aClass510_6712.modelIndex, var5, 0);
				if (var7.anInt881 < 13) {
					var7.method1196(2);
				}
				Model[] var8 = new Model[] { var6, var7 };
				var6 = new Model(var8, 2);
			}
			short[] var10;
			int var11;
			if (this.modelColors != null) {
				if (arg1 == null || arg1.moreModifiedColors == null) {
					var10 = this.modifiedModelColors;
				} else {
					var10 = arg1.moreModifiedColors;
				}
				for (var11 = 0; var11 < this.modelColors.length; var11++) {
					var6.color(this.modelColors[var11], var10[var11]);
				}
			}
			if (this.modelTextures != null) {
				if (arg1 == null || arg1.aShortArray6009 == null) {
					var10 = this.modifiedModelTextures;
				} else {
					var10 = arg1.aShortArray6009;
				}
				for (var11 = 0; var11 < this.modelTextures.length; var11++) {
					var6.method1200(this.modelTextures[var11], var10[var11]);
				}
			}
			return var6;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "vy.x(" + ')');
		}
	}
}
