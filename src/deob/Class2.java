package deob;

import java.math.BigInteger;

public class Class2 {

	public static BigInteger aBigInteger41 = new BigInteger("12078085222384024105620698117867765510964423204659961780763590099890322521539692441899599057211126450706675820242716257986416874032659293703265791703524571");

	public static BigInteger aBigInteger42 = new BigInteger("65537");

	public static BigInteger aBigInteger43 = new BigInteger("65537");

	public static BigInteger aBigInteger40 = new BigInteger("8600992316064978428219182715007727294162502339225275031353164120686951038084308620501867247250446500590920623904733833666995082633856662533411539067162519");

	public static Class523 aClass523_44;

	static {
		new BigInteger("10001", 16);
		new BigInteger("9fbfdd5dafef6afb733604583ba216ac75d2262120143ee262ade85e8cd6f1d349e28062926132d446219b37c99dc0f021b1eec0b8b0f627e19d28ca0299255f", 16);
	}

	public Class2() throws Throwable {
		throw new Error();
	}

	public static final void method390(Class430 arg0, int arg1) {
		try {
			Class458.method5670(arg0.anIntArray4387[--arg0.anInt4376], -1, -1, false, 1036240917);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ac.aeo(" + ')');
		}
	}

	public static final void method391(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class208.method2204(arg0.aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067, var2 & 0xFFFF, var3, var4, arg0.aBoolean4398, arg0, 1429987943);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ac.aqg(" + ')');
		}
	}

	public static final void decodeNpcMasks(int arg0) {
		try {
			Class330_Sub46_Sub2 var1 = client.aClass1_9025.aClass330_Sub46_Sub2_17;
			for (int var2 = 0; var2 < client.anInt9019; var2++) {
				int var3 = client.anIntArray9020[var2];
				NPC var4 = (NPC) ((Class330_Sub35) client.aClass497_9014.method6094((long) var3)).anObject7733;
				int var5 = var1.readUnsignedByte(1771747028);
				if ((var5 & 0x4) != 0) {
					var5 += var1.readUnsignedByte(942427220) << 8;
				}
				if ((var5 & 0x400) != 0) {
					var5 += var1.readUnsignedByte(285386114) << 16;
				}
				if ((var5 & 0x20000) != 0) {
					var5 += var1.readUnsignedByte(50851324) << 24;
				}
				if ((var5 & 0x800000) != 0) {
					var4.anInt10258 = var1.readUnsignedShort(155393609);
					if (var4.anInt10258 == 65535) {
						var4.anInt10258 = var4.aClass551_10251.anInt6348;
					}
				}
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				boolean var11;
				if ((var5 & 0x2000000) != 0) {
					var6 = var1.readUnsignedShort(1890157712);
					var7 = var1.readInt2(-793658723);
					if (var6 == 65535) {
						var6 = -1;
					}
					var8 = var1.readUnsignedByteC(-243015761);
					var9 = var8 & 0x7;
					var10 = var8 >> 3 & 0xF;
					if (var10 == 15) {
						var10 = -1;
					}
					var11 = (var8 >> 7 & 0x1) == 1;
					var4.sendGraphics(var6, var7, var9, var10, var11, 2, (byte) -79);
				}
				if ((var5 & 0x100) != 0) {
					var4.anInt10257 = var1.readUnsignedShortA((byte) -57);
					if (var4.anInt10257 == 65535) {
						var4.anInt10257 = -1;
					}
				}
				int[] var16;
				int[] var17;
				int var20;
				if ((var5 & 0x1000) != 0) {
					var6 = var1.readUnsignedByteC(-243015761);
					var16 = new int[var6];
					var17 = new int[var6];
					int[] var19 = new int[var6];
					for (var10 = 0; var10 < var6; var10++) {
						var20 = var1.readBigSmart(-1509866246);
						var16[var10] = var20;
						var17[var10] = var1.readUnsignedByteA(-741334169);
						var19[var10] = var1.readUnsignedShort(-132390179);
					}
					Class110.method1363(var4, var16, var17, var19, (byte) -84);
				}
				int var12;
				int var13;
				int[] var21;
				short[] var23;
				short[] var25;
				long var26;
				if ((var5 & 0x10000) != 0) {
					var6 = var4.aClass551_10251.anIntArray6297.length;
					var7 = 0;
					if (var4.aClass551_10251.aShortArray6301 != null) {
						var7 = var4.aClass551_10251.aShortArray6301.length;
					}
					byte var18 = 0;
					if (var4.aClass551_10251.aShortArray6349 != null) {
						var7 = var4.aClass551_10251.aShortArray6349.length;
					}
					var9 = var1.readUnsignedByteS(-400233324);
					if ((var9 & 0x1) != 1) {
						var21 = null;
						if ((var9 & 0x2) == 2) {
							var21 = new int[var6];
							for (var20 = 0; var20 < var6; var20++) {
								var21[var20] = var1.readBigSmart(-740799635);
							}
						}
						var23 = null;
						if ((var9 & 0x4) == 4) {
							var23 = new short[var7];
							for (var12 = 0; var12 < var7; var12++) {
								var23[var12] = (short) var1.readUnsignedShortA((byte) -75);
							}
						}
						var25 = null;
						if ((var9 & 0x8) == 8) {
							var25 = new short[var18];
							for (var13 = 0; var13 < var18; var13++) {
								var25[var13] = (short) var1.readUnsignedLEShort(15163594);
							}
						}
						var26 = ++NPC.anInt10256 - 1;
						new Class538(var26, var21, var23, var25);
					} else if (arg0 >= 1395100258) {
						break;
					}
				}
				if ((var5 & 0x80000) != 0) {
					var4.aByte10043 = var1.readByteA(1925295993);
					var4.aByte10044 = var1.readByteA(-2058479998);
					var4.aByte10063 = var1.readByteC(-2071748996);
					var4.aByte10025 = (byte) var1.readUnsignedByteC(-243015761);
					var4.anInt10041 = client.anInt8981 + var1.readUnsignedShort(-293553987);
					var4.anInt10042 = client.anInt8981 + var1.readUnsignedShort(684420173);
				}
				if ((var5 & 0x100000) != 0) {
					var6 = var1.payload[++var1.offset - 1] & 0xFF;
					for (var7 = 0; var7 < var6; var7++) {
						var8 = var1.readUnsignedShortA((byte) -88);
						var9 = var1.readInt2(-793658723);
						var4.aClass67_10260.method791(var8, var9, -1354361898);
					}
				}
				if ((var5 & 0x2000) != 0) {
					var6 = var4.aClass551_10251.anIntArray6296.length;
					var7 = 0;
					if (var4.aClass551_10251.aShortArray6301 != null) {
						var7 = var4.aClass551_10251.aShortArray6301.length;
					}
					var8 = 0;
					if (var4.aClass551_10251.aShortArray6349 != null) {
						var8 = var4.aClass551_10251.aShortArray6349.length;
					}
					var9 = var1.readUnsignedByte(513764726);
					if ((var9 & 0x1) == 1) {
						var4.aClass538_10254 = null;
					} else {
						var21 = null;
						if ((var9 & 0x2) == 2) {
							var21 = new int[var6];
							for (var20 = 0; var20 < var6; var20++) {
								var21[var20] = var1.readBigSmart(-583988213);
							}
						}
						var23 = null;
						if ((var9 & 0x4) == 4) {
							var23 = new short[var7];
							for (var12 = 0; var12 < var7; var12++) {
								var23[var12] = (short) var1.readUnsignedLEShort(15163594);
							}
						}
						var25 = null;
						if ((var9 & 0x8) == 8) {
							var25 = new short[var8];
							for (var13 = 0; var13 < var8; var13++) {
								var25[var13] = (short) var1.readUnsignedLEShortA(1537377029);
							}
						}
						var26 = ++NPC.anInt10253 - 1;
						var4.aClass538_10254 = new Class538(var26, var21, var23, var25);
					}
				}
				if ((var5 & 0x40000) != 0) {
					var4.aString10259 = var1.readString(-1249148465);
					if ("".equals(var4.aString10259) || var4.aString10259.equals(var4.aClass551_10251.aString6323)) {
						var4.aString10259 = var4.aClass551_10251.aString6323;
					}
				}
				if ((var5 & 0x200) != 0) {
					var6 = var1.readUnsignedShort(349897342);
					var7 = var1.readLEInt(-776660178);
					if (var6 == 65535) {
						var6 = -1;
					}
					var8 = var1.readUnsignedByteS(-400233324);
					var9 = var8 & 0x7;
					var10 = var8 >> 3 & 0xF;
					if (var10 == 15) {
						var10 = -1;
					}
					var11 = (var8 >> 7 & 0x1) == 1;
					var4.sendGraphics(var6, var7, var9, var10, var11, 1, (byte) -126);
				}
				if ((var5 & 0x400000) != 0) {
					var4.aClass67_10260.method790(-709981182);
					var6 = var1.payload[++var1.offset - 1] & 0xFF;
					for (var7 = 0; var7 < var6; var7++) {
						var8 = var1.readUnsignedShortA((byte) -110);
						var9 = var1.readInt2(-793658723);
						var4.aClass67_10260.method791(var8, var9, -209685854);
					}
				}
				if ((var5 & 0x80) != 0) {
					if (var4.aClass551_10251.method6372((byte) 22)) {
						Class324.method3202(var4, 1255542902);
					}
					var4.method5475(Class158_Sub3.aClass553_8875.method6392(var1.readBigSmart(-1177087791), 901884994), 1918950667);
					var4.method5420(var4.aClass551_10251.anInt6295, (short) -16240);
					var4.anInt10051 = var4.aClass551_10251.anInt6325 << 3;
					if (var4.aClass551_10251.method6372((byte) 79)) {
						Class_ra.method4809(var4.aByte8658, var4.anIntArray10018[0], var4.anIntArray10059[0], 0, null, var4, null, 199270945);
					}
				}
				if ((var5 & 0x200000) != 0) {
					var6 = var1.payload[++var1.offset - 1] & 0xFF;
					for (var7 = 0; var7 < var6; var7++) {
						var8 = var1.readUnsignedByteS(-400233324);
						var9 = var1.readLEInt(1638088459);
						var10 = var1.read24BitUnsignedIntegerV2((byte) 12);
						var4.method5476(var8, var9, var10, 740069388);
					}
				}
				if ((var5 & 0x8000) != 0) {
					var4.anInt10034 = var1.readByteC(-1908097373);
					var4.anInt10045 = var1.readByteA(-229182089);
					var4.anInt10057 = var1.readByteC(-2021860441);
					var4.anInt10036 = var1.readByte((byte) 40);
					var4.anInt10058 = var1.readUnsignedShort(-270225857) + client.anInt8981;
					var4.anInt10038 = var1.readUnsignedShort(-276686098) + client.anInt8981;
					var4.anInt10040 = var1.readUnsignedShort(-161556373);
					var4.anInt10034 += var4.anIntArray10018[0];
					var4.anInt10045 += var4.anIntArray10059[0];
					var4.anInt10057 += var4.anIntArray10018[0];
					var4.anInt10036 += var4.anIntArray10059[0];
					var4.anInt10056 = 1;
					var4.anInt10006 = 0;
				}
				if ((var5 & 0x4000) != 0) {
					var6 = var1.readUnsignedByteA(-741334169);
					var16 = new int[var6];
					var17 = new int[var6];
					for (var9 = 0; var9 < var6; var9++) {
						var10 = var1.readUnsignedLEShortA(-511039615);
						if ((var10 & 0xC000) == 49152) {
							var20 = var1.readUnsignedLEShort(15163594);
							var16[var9] = var10 << 16 | var20;
						} else {
							var16[var9] = var10;
						}
						var17[var9] = var1.readUnsignedLEShortA(-1757914152);
					}
					var4.method5413(var16, var17, (byte) 16);
				}
				if ((var5 & 0x8) != 0) {
					var6 = var1.readUnsignedByteC(-243015761);
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; var7++) {
							var8 = -1;
							boolean var24 = true;
							var10 = -1;
							var20 = var1.readSmart(-611843192);
							if (var20 == 32767) {
								var20 = var1.readSmart(-795609037);
								var9 = var1.readSmart(-1273759143);
								var8 = var1.readSmart(-632630559);
								var10 = var1.readSmart(92315265);
							} else if (var20 == 32766) {
								var20 = -1;
								var9 = var1.readUnsignedByteC(-243015761);
							} else {
								var9 = var1.readSmart(-1839833324);
							}
							var12 = var1.readSmart(59816641);
							var4.method5423(var20, var9, var8, var10, client.anInt8981, var12, -1401542499);
						}
					}
					var7 = var1.readUnsignedByte(1950737094);
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; var8++) {
							var9 = var1.readSmart(40933834);
							var10 = var1.readSmart(-401044723);
							if (var10 == 32767) {
								var4.method5418(var9, -384448259);
							} else {
								var20 = var1.readSmart(265246854);
								var12 = var1.readUnsignedByteC(-243015761);
								var13 = var10 > 0 ? var1.readUnsignedByteA(-741334169) : var12;
								var4.method5417(var9, client.anInt8981, var10, var20, var12, var13, 1897972712);
							}
						}
					}
				}
				if ((var5 & 0x2) != 0) {
					var4.anInt10261 = var1.readUnsignedShort(866967018);
					var4.anInt10252 = var1.readUnsignedLEShort(15163594);
				}
				if ((var5 & 0x40) != 0) {
					var6 = var1.readUnsignedShortA((byte) -118);
					var7 = var1.readLEInt(49003431);
					if (var6 == 65535) {
						var6 = -1;
					}
					var8 = var1.readUnsignedByteC(-243015761);
					var9 = var8 & 0x7;
					var10 = var8 >> 3 & 0xF;
					if (var10 == 15) {
						var10 = -1;
					}
					var11 = (var8 >> 7 & 0x1) == 1;
					var4.sendGraphics(var6, var7, var9, var10, var11, 0, (byte) 5);
				}
				if ((var5 & 0x20) != 0) {
					var4.anInt10028 = var1.readUnsignedShortA((byte) -79);
					if (var4.anInt10028 == 65535) {
						var4.anInt10028 = -1;
					}
				}
				if ((var5 & 0x10) != 0) {
					var4.method5481(var1.readString(613064676), 0, 0, (byte) -61);
				}
				if ((var5 & 0x1) != 0) {
					int[] var22 = new int[Class487_Sub1.method6040(-335014354).length];
					for (var7 = 0; var7 < Class487_Sub1.method6040(-1455479983).length; var7++) {
						var22[var7] = var1.readBigSmart(-682897967);
					}
					var7 = var1.readUnsignedByteC(-243015761);
					Class150_Sub2.method1772(var4, var22, var7, true, (byte) 75);
				}
				if ((var5 & 0x1000000) != 0) {
					var6 = var1.readUnsignedLEShort(15163594);
					var7 = var1.readLEInt(-1971018838);
					if (var6 == 65535) {
						var6 = -1;
					}
					var8 = var1.readUnsignedByteS(-400233324);
					var9 = var8 & 0x7;
					var10 = var8 >> 3 & 0xF;
					if (var10 == 15) {
						var10 = -1;
					}
					var11 = (var8 >> 7 & 0x1) == 1;
					var4.sendGraphics(var6, var7, var9, var10, var11, 3, (byte) -100);
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ac.kh(" + ')');
		}
	}

	public static void method393(String arg0, boolean arg1, int arg2) {
		try {
			String var12 = arg0.toLowerCase();
			short[] var3 = new short[16];
			int var4 = 0;
			int var5 = arg1 ? 32768 : 0;
			int var6 = var5 + (arg1 ? aClass523_44.anInt6025 : aClass523_44.anInt6028);
			for (int var7 = var5; var7 < var6; var7++) {
				Class330_Sub36_Sub4 var8 = aClass523_44.method6233(var7, 1487140002);
				if (var8.aBoolean9662) {
					if (var8.method3451((byte) -58).toLowerCase().indexOf(var12) != -1) {
						if (var4 >= 50) {
							Class440.anInt4482 = -1;
							Class282_Sub1.aShortArray7443 = null;
							return;
						}
						if (var4 >= var3.length) {
							short[] var9 = new short[var3.length * 2];
							for (int var10 = 0; var10 < var4; var10++) {
								var9[var10] = var3[var10];
							}
							var3 = var9;
						}
						var3[var4++] = (short) var7;
					} else if (arg2 == -834257506) {
						throw new IllegalStateException();
					}
				} else if (arg2 == -834257506) {
					return;
				}
			}
			Class282_Sub1.aShortArray7443 = var3;
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
			Class440.anInt4482 = var4;
			String[] var13 = new String[Class440.anInt4482];
			for (int var14 = 0; var14 < Class440.anInt4482; var14++) {
				var13[var14] = aClass523_44.method6233(var3[var14], 1987320441).method3451((byte) -49);
			}
			Class389.method4592(var13, Class282_Sub1.aShortArray7443, -2075931773);
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ac.nc(" + ')');
		}
	}

	public static void method394(Class330_Sub36_Sub13 arg0, int arg1, int arg2) {
		try {
			if (Class484.aBoolean5782) {
				Class524 var3 = Class359.method4239((byte) 79);
				int var4 = 0;
				int var6;
				for (Class330_Sub36_Sub10 var5 = (Class330_Sub36_Sub10) arg0.aClass472_9716.method5884((byte) 64); var5 != null; var5 = (Class330_Sub36_Sub10) arg0.aClass472_9716.method5886((short) 8192)) {
					var6 = Class7.method409(var5, var3, 936672521);
					if (var6 > var4) {
						var4 = var6;
					}
				}
				var4 += 8;
				int var10 = arg0.anInt9715 * Class484.anInt5779 + 21;
				Class95_Sub13.anInt7181 = (Class484.aBoolean5807 ? 26 : 22) + Class484.anInt5779 * arg0.anInt9715;
				var6 = Class89.anInt736 + Class550.anInt6288;
				if (var6 + var4 > Class300.anInt3058) {
					var6 = Class89.anInt736 - var4;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				int var7 = Class484.aBoolean5807 ? var3.anInt6033 + 1 + 20 : 31;
				int var8 = var3.anInt6033 + 1 + (arg1 - var7);
				if (var8 + var10 > Class146.anInt1615) {
					var8 = Class146.anInt1615 - var10;
				}
				if (var8 < 0) {
					var8 = 0;
				}
				Class62.anInt561 = var6;
				Class246.anInt6586 = var8;
				Class116.anInt1374 = var4;
				Class484.aClass330_Sub36_Sub13_5784 = arg0;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ac.l(" + ')');
		}
	}
}
