package deob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;

public class Class457 implements Interface26 {

	public static Class457 aClass457_6837 = new Class457("", 4);

	public static Class457 aClass457_6839 = new Class457("", 3);

	public static Class457 aClass457_6835 = new Class457("", 5);

	public static Class457 aClass457_6836 = new Class457("", 8);

	public static Class457 aClass457_6840 = new Class457("", 2);

	public static Class457 aClass457_6838 = new Class457("", 1);

	public static Class457 aClass457_6833 = new Class457("", 6);

	public static Class457 aClass457_6834 = new Class457("", 0);

	public int anInt6841;

	public static int anInt6842;

	public static int anInt6843;

	public static int anInt6844;

	static {
		method5658((short) -1630);
	}

	public int method299() {
		return this.anInt6841 * 1625450705 * 1166471217;
	}

	public Class457(String arg0, int arg1) {
		this.anInt6841 = arg1;
	}

	public int method297(short arg0) {
		try {
			return this.anInt6841;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sx.j(" + ')');
		}
	}

	public int method298() {
		return this.anInt6841 * 1625450705 * 1166471217;
	}

	public static final void method5657(Class430 arg0, byte arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.aClass19_4381 = new Class19(var2, true);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sx.agf(" + ')');
		}
	}

	public int method301() {
		return this.anInt6841 * 1625450705 * 1166471217;
	}

	public int method300() {
		return this.anInt6841 * 1625450705 * 1166471217;
	}

	public static Class457[] method5658(short arg0) {
		try {
			return new Class457[] { aClass457_6837, aClass457_6833, aClass457_6835, aClass457_6839, aClass457_6838, aClass457_6840, aClass457_6834, aClass457_6836 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "sx.r(" + ')');
		}
	}

	public static final void processLoginSequence() {
		try {
			if (Class360.anInt3769 != 1 && Class360.anInt3769 != 103) {
				try {
					short var0;
					if (Class360.anInt3780 == 0) {
						var0 = 500;
					} else {
						var0 = 2000;
					}
					if (Class360.aBoolean3748 && Class360.anInt3769 >= 68) {
						var0 = 6000;
					}
					if (Class360.anInt3791 == 288 && Class360.anInt3769 != 204 && Class360.anInt3775 != 42 || Class360.anInt3791 == 108 && Class360.anInt3781 != 49 && Class360.anInt3781 != 52) {
						Class360.anInt3779++;
					}
					if (Class360.anInt3779 > var0) {
						Class360.aClass1_3783.method379(1175619289);
						if (Class360.anInt3780 >= 3) {
							Class360.anInt3769 = 1;
							Class281.method2792(-5, -1699826914);
							Class325_Sub1.method3213(-1643716484);
							return;
						}
						if (Class360.anInt3791 == 288) {
							Class507.aClass498_5930.method6107(1167948936);
						} else {
							Class507.aClass498_5937.method6107(-748103942);
						}
						Class360.anInt3779 = 0;
						Class360.anInt3780++;
						Class360.anInt3769 = 12;
					}
					Class330_Sub34 var1;
					int var2;
					int var4;
					if (Class360.anInt3769 == 12) {
						if (Class360.anInt3791 == 288) {
							Class360.aClass1_3783.method384(Class330_Sub15.method3320(Class507.aClass498_5930.method6109((byte) 1), 15000, -652783208), Class507.aClass498_5930.aString5886, 1965738602);
						} else {
							Class360.aClass1_3783.method384(Class330_Sub15.method3320(Class507.aClass498_5937.method6109((byte) 1), 15000, -652783208), Class507.aClass498_5937.aString5886, 1406479787);
						}
						Class360.aClass1_3783.method382(-858736251);
						var1 = Class330_Sub39.method3548(810064148);
						if (Class360.aBoolean3748) {
							var1.aClass330_Sub46_Sub2_7729.addByte(Class227.aClass227_2420.anInt2422, (byte) 43);
							var1.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 120);
							var2 = var1.aClass330_Sub46_Sub2_7729.offset;
							var1.aClass330_Sub46_Sub2_7729.addInt(742, 1965508160);
							var1.aClass330_Sub46_Sub2_7729.addInt(3, 1965508160);
							System.out.println("test3");
							if (Class360.anInt3791 == 288) {
								var1.aClass330_Sub46_Sub2_7729.addByte(client.anInt8995 == 9 ? 1 : 0, (byte) 99);
							}
							Buffer var3 = Class336.method3945((byte) -20);
							var3.addByte(Class360.anInt3749, (byte) 94);
							var3.addShort((int) (Math.random() * 9.9999999E7D), (byte) 74);
							var3.addByte(Class429.aClass454_4369.method297((short) -18408), (byte) 44);
							var3.addInt(client.anInt8956, 1965508160);
							for (var4 = 0; var4 < 6; var4++) {
								var3.addInt((int) (Math.random() * 9.9999999E7D), 1965508160);
							}
							var3.method3802(client.aLong8991);
							var3.addByte(client.aClass435_9146.anInt4417, (byte) 33);
							var3.addByte((int) (Math.random() * 9.9999999E7D), (byte) 10);
							var3.applyRSA(Class2.aBigInteger43, Class2.aBigInteger41, 143377158);
							var1.aClass330_Sub46_Sub2_7729.method3749(var3.payload, 0, var3.offset, (byte) 109);
							var1.aClass330_Sub46_Sub2_7729.method3772(var1.aClass330_Sub46_Sub2_7729.offset - var2, (byte) 100);
						} else {
							var1.aClass330_Sub46_Sub2_7729.addByte(Class227.aClass227_2413.anInt2422, (byte) 52);
						}
						Class360.aClass1_3783.method378(var1, -171482175);
						Class360.aClass1_3783.method381(-779616895);
						Class360.anInt3769 = 34;
					}
					int var14;
					if (Class360.anInt3769 == 34) {
						if (!Class360.aClass1_3783.method380(-121955237).method4194(1, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(-973309693).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -824564680);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						var14 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readUnsignedByte(1963355756);
						if (var14 != 0) {
							Class360.anInt3769 = 1;
							Class243.method2407(var14, 2049826734);
							Class281.method2792(var14, 494298641);
							Class360.aClass1_3783.method379(1175619289);
							Class325_Sub1.method3213(800857783);
							return;
						}
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						if (Class360.aBoolean3748) {
							Class360.anInt3769 = 40;
						} else {
							Class360.anInt3769 = 87;
						}
					}
					if (Class360.anInt3769 == 40) {
						if (!Class360.aClass1_3783.method380(193585112).method4194(2, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(1277966608).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 2, -1895068997);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readUnsignedShort(2132995981);
						Class360.anInt3769 = 55;
					}
					if (Class360.anInt3769 == 55) {
						if (!Class360.aClass1_3783.method380(-1499363797).method4194(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(-140889163).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset, -1439307026);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.method3771(Canvas_Sub1.anIntArray10, -670251967);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						String var15 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readJagString((byte) 6);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						String var16 = Class232.aClass232_2457.method2354((byte) -26);
						if (!client.aBoolean9198 || !Class239.method2379(var15, 1, var16, (byte) 0)) {
							Class562.method6471(var15, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1741178892) == 5, var16, client.aBoolean9042, client.aBoolean8966, (byte) 1);
						}
						Class360.anInt3769 = 68;
					}
					if (Class360.anInt3769 == 68) {
						if (!Class360.aClass1_3783.method380(-528417644).method4194(1, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(914901775).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -1964250716);
						if ((Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF) == 1) {
							Class360.anInt3769 = 78;
						}
					}
					if (Class360.anInt3769 == 78) {
						if (!Class360.aClass1_3783.method380(-1600048989).method4194(16, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(849707729).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 16, -1690884192);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 16;
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.method3771(Canvas_Sub1.anIntArray10, -1449179342);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						Class360.aLong3750 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readLong(-280520097);
						Class360.aLong3776 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readLong(379415513);
						Class360.anInt3769 = 87;
					}
					Class330_Sub46_Sub2 var17;
					if (Class360.anInt3769 == 87) {
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						Class360.aClass1_3783.method382(-335779556);
						var1 = Class330_Sub39.method3548(810064148);
						var17 = var1.aClass330_Sub46_Sub2_7729;
						int var5;
						Buffer var6;
						Buffer var7;
						Class227 var18;
						if (Class360.anInt3791 == 288) {
							if (Class360.aBoolean3748) {
								var18 = Class227.aClass227_2421;
							} else {
								var18 = Class227.aClass227_2416;
							}
							var17.addByte(var18.anInt2422, (byte) 27);
							var17.addShort(0, (byte) 72);
							var4 = var17.offset;
							var5 = var17.offset;
							if (!Class360.aBoolean3748) {
								var17.addInt(742, 1965508160);
								var17.addInt(3, 1965508160);
								var17.addByte(client.anInt8995 == 9 ? 1 : 0, (byte) 99);
								var5 = var17.offset;
								var6 = Class81.method955(1545584434);
								var17.method3749(var6.payload, 0, var6.offset, (byte) -17);
								var5 = var17.offset;
								var17.addByte(Class360.aLong3750 == -1L ? 1 : 0, (byte) 98);
								if (Class360.aLong3750 == -1L) {
									var17.addString(Class360.username, (byte) -93);
								} else {
									var17.method3802(Class360.aLong3750);
								}
								var17.addString(Class457.CreateUID.generateUID(), (byte) -1);
								var17.addString(method5659(), (byte) -1);
							}
							var17.addByte(Class545.method6347(1079239502), (byte) 99);
							var17.addShort(Class300.anInt3058, (byte) 21);
							var17.addShort(Class146.anInt1615, (byte) 87);
							var17.addByte(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874.method5766((byte) 1), (byte) 78);
							Class511.method6182(var17, 1007942315);
							var17.addString(client.aString9111, (byte) -25);
							var17.addInt(client.anInt8956, 1965508160);
							var6 = Class448.aClass330_Sub50_5555.method3861(499329363);
							var17.addByte(var6.offset, (byte) 102);
							var17.method3749(var6.payload, 0, var6.offset, (byte) -60);
							client.aBoolean9194 = true;
							var7 = new Buffer(Class375.aClass330_Sub51_3933.method3864(2042072520));
							Class375.aClass330_Sub51_3933.method3863(var7, 1137947322);
							var17.method3749(var7.payload, 0, var7.payload.length, (byte) -18);
							var17.addInt(client.anInt9027, 1965508160);
							var17.method3802(client.aLong9079);
							var17.addString(Class18.aString237, (byte) -23);
							var17.addByte(client.aString8960 == null ? 0 : 1, (byte) 28);
							if (client.aString8960 != null) {
								var17.addString(client.aString8960, (byte) -70);
							}
							var17.addByte(Class263.aClass321_2734.method3173("jagtheora", 934230400) ? 1 : 0, (byte) 40);
							var17.addByte(client.aBoolean9198 ? 1 : 0, (byte) 3);
							var17.addByte(client.aBoolean8967 ? 1 : 0, (byte) 22);
							var17.addByte(Class516.anInt5974, (byte) 1);
							var17.addInt(client.anInt8970, 1965508160);
							var17.addString(client.aString9126, (byte) -55);
							var17.addByte(Class507.aClass498_5929 != null && Class507.aClass498_5929.anInt5889 == Class507.aClass498_5930.anInt5889 ? 0 : 1, (byte) 53);
							Class123.method1506(var17, -1833177506);
							var17.addString(String.valueOf(613454132), (byte) -1);
							var17.method3807(Canvas_Sub1.anIntArray10, var5, var17.offset, (byte) -21);
							var17.method3772(var17.offset - var4, (byte) 124);
						} else {
							if (Class360.aBoolean3748) {
								var18 = Class227.aClass227_2421;
							} else {
								var18 = Class227.aClass227_2414;
							}
							var17.addByte(var18.anInt2422, (byte) 70);
							var17.addShort(0, (byte) 10);
							var4 = var17.offset;
							var5 = var17.offset;
							if (!Class360.aBoolean3748) {
								var17.addInt(742, 1965508160);
								var17.addInt(3, 1965508160);
								System.out.println("test2");
								var6 = Class81.method955(856910719);
								var17.method3749(var6.payload, 0, var6.offset, (byte) 24);
								var5 = var17.offset;
								var17.addByte(Class360.aLong3750 == -1L ? 1 : 0, (byte) 29);
								if (Class360.aLong3750 == -1L) {
									var17.addString(Class360.username, (byte) -99);
								} else {
									var17.method3802(Class360.aLong3750);
								}
								var17.addString(Class457.CreateUID.generateUID(), (byte) -1);
								var17.addString(method5659(), (byte) -1);
							}
							var17.addByte(client.aClass435_9146.anInt4417, (byte) 45);
							var17.addByte(Class429.aClass454_4369.method297((short) -8535), (byte) 73);
							Class511.method6182(var17, -1233819814);
							var17.addString(client.aString9111, (byte) -47);
							var6 = Class448.aClass330_Sub50_5555.method3861(482413784);
							var17.addByte(var6.offset, (byte) 118);
							var17.method3749(var6.payload, 0, var6.offset, (byte) 13);
							var7 = new Buffer(Class375.aClass330_Sub51_3933.method3864(264873516));
							Class375.aClass330_Sub51_3933.method3863(var7, -175418689);
							var17.method3749(var7.payload, 0, var7.payload.length, (byte) 54);
							var17.addString(Class18.aString237, (byte) -102);
							var17.addInt(client.anInt8956, 1965508160);
							var17.addInt(client.anInt8970, 1965508160);
							var17.addString(client.aString9126, (byte) -31);
							Class123.method1506(var17, 651876708);
							var17.method3807(Canvas_Sub1.anIntArray10, var5, var17.offset, (byte) -49);
							var17.method3772(var17.offset - var4, (byte) 88);
						}
						Class360.aClass1_3783.method378(var1, -112273618);
						Class360.aClass1_3783.method381(-879839950);
						Class360.aClass1_3783.aClass488_22 = new IsaacCipher(Canvas_Sub1.anIntArray10);
						for (int var22 = 0; var22 < 4; var22++) {
							Canvas_Sub1.anIntArray10[var22] += 50;
						}
						Class360.aClass1_3783.aClass488_24 = new IsaacCipher(Canvas_Sub1.anIntArray10);
						new IsaacCipher(Canvas_Sub1.anIntArray10);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.method3821(Class360.aClass1_3783.aClass488_24, -83343171);
						Canvas_Sub1.anIntArray10 = null;
						Class360.anInt3769 = 96;
					}
					if (Class360.anInt3769 == 96) {
						if (!Class360.aClass1_3783.method380(1299032066).method4194(1, -1020237123)) {
							return;
						}
						Class360.aClass1_3783.method380(267543701).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -1890851096);
						var14 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readUnsignedByte(1276765456);
						Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
						if (var14 == 21) {
							Class360.anInt3769 = 122;
						} else if (var14 == 29 || var14 == 45) {
							Class281.anInt2914 = var14;
							Class360.anInt3769 = 182;
						} else if (var14 == 1) {
							Class360.anInt3769 = 103;
							Class281.method2792(var14, -701837436);
							return;
						} else if (var14 == 52) {
							Class281.anInt2914 = var14;
							Class360.anInt3769 = 215;
						} else if (var14 == 2) {
							if (Class360.aBoolean3792) {
								Class360.aBoolean3792 = false;
								Class360.anInt3769 = 12;
								return;
							}
							Class360.anInt3769 = 137;
						} else if (var14 == 15) {
							Class360.aClass1_3783.anInt26 = -2;
							Class360.anInt3769 = 193;
						} else if (var14 == 23 && Class360.anInt3780 < 3) {
							Class360.anInt3779 = 0;
							Class360.anInt3780++;
							Class360.anInt3769 = 12;
							Class360.aClass1_3783.method379(1175619289);
							return;
						} else if (var14 == 42) {
							Class360.anInt3769 = 204;
							Class281.method2792(var14, -2006192096);
							return;
						} else if (Class360.anInt3791 == 108 && var14 == 49 && client.anInt8995 != 4) {
							if (Class360.anInt3781 != 52) {
								Class281.method2792(var14, -1507320647);
							}
							return;
						} else if (!Class360.aBoolean3773 || Class360.aBoolean3748 || Class360.anInt3749 == -1 || var14 != 35) {
							if (var14 != 53) {
								Class360.anInt3769 = 1;
								Class281.method2792(var14, 1701504355);
								Class360.aClass1_3783.method379(1175619289);
								Class325_Sub1.method3213(773685712);
								return;
							}
							Class360.anInt3769 = 236;
						} else {
							Class360.aBoolean3748 = true;
							Class360.anInt3779 = 0;
							Class360.anInt3769 = 12;
							Class360.aClass1_3783.method379(1175619289);
							return;
						}
					}
					if (Class360.anInt3769 == 115) {
						Class360.aClass1_3783.method382(-839811960);
						var1 = Class330_Sub39.method3548(810064148);
						var17 = var1.aClass330_Sub46_Sub2_7729;
						var17.method3821(Class360.aClass1_3783.aClass488_22, 792939362);
						var17.method3822(Class227.aClass227_2417.anInt2422, -1719594836);
						Class360.aClass1_3783.method378(var1, -1895370478);
						Class360.aClass1_3783.method381(1280953631);
						Class360.anInt3769 = 96;
					} else if (Class360.anInt3769 == 122) {
						if (Class360.aClass1_3783.method380(1641858379).method4194(1, -1020237123)) {
							Class360.aClass1_3783.method380(1222990119).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -534954945);
							var14 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF;
							Class360.anInt3786 = var14 * 50;
							Class360.anInt3769 = 1;
							Class281.method2792(21, -1161474341);
							Class360.aClass1_3783.method379(1175619289);
							Class325_Sub1.method3213(1704008364);
						}
					} else if (Class360.anInt3769 == 204) {
						if (Class360.aClass1_3783.method380(1641384405).method4194(2, -1020237123)) {
							Class360.aClass1_3783.method380(-742832422).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 2, -1945885844);
							Class360.anInt3753 = (Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[1] & 0xFF) + ((Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF) << 8);
							Class360.anInt3769 = 96;
						}
					} else if (Class360.anInt3769 == 236) {
						if (Class360.aClass1_3783.method380(-677534590).method4194(4, -1020237123)) {
							Class360.aClass1_3783.method380(791004373).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 4, 729890257);
							Class360.anInt3754 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readInt((byte) 70);
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
							Class360.anInt3769 = 1;
							Class281.method2792(53, 604105763);
							Class360.aClass1_3783.method379(1175619289);
							Class325_Sub1.method3213(871212528);
						}
					} else if (Class360.anInt3769 == 182) {
						if (Class281.anInt2914 == 29) {
							if (!Class360.aClass1_3783.method380(996646290).method4194(1, -1020237123)) {
								return;
							}
							Class360.aClass1_3783.method380(-1754975387).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -988390377);
							Class360.anInt3756 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF;
						} else if (Class281.anInt2914 == 45) {
							if (!Class360.aClass1_3783.method380(1304817520).method4194(3, -1020237123)) {
								return;
							}
							Class360.aClass1_3783.method380(744622410).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 3, -514821000);
							Class360.anInt3756 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF;
							Class360.anInt3787 = ((Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[1] & 0xFF) << 8) + (Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[2] & 0xFF);
						} else {
							throw new IllegalStateException();
						}
						Class360.anInt3769 = 1;
						Class281.method2792(Class281.anInt2914, 1658376037);
						Class360.aClass1_3783.method379(1175619289);
						Class325_Sub1.method3213(-985424899);
					} else if (Class360.anInt3769 == 215) {
						if (Class360.aClass1_3783.method380(-1018897271).method4194(2, -1020237123)) {
							Class360.aClass1_3783.method380(-1003903477).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 2, -462647216);
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
							Class281.anInt2918 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readUnsignedShort(-374986520);
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
							Class360.anInt3769 = 227;
						}
					} else if (Class360.anInt3769 == 227) {
						if (Class360.aClass1_3783.method380(800707088).method4194(Class281.anInt2918, -1020237123)) {
							Class360.aClass1_3783.method380(-698877628).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, Class281.anInt2918, -1951085431);
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
							byte[] var19 = new byte[Class281.anInt2918 + 1];
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.method3828(var19, 0, Class281.anInt2918, 1689124730);
							Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
							Buffer var20 = new Buffer(var19);
							String var23 = var20.readString(306297361);
							Class532.openLink(var23, true, Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-2141526723) == 5, client.aBoolean9042, client.aBoolean8966, 620544610);
							Class281.method2792(Class281.anInt2914, 1443001188);
							if (Class360.anInt3791 == 108 && client.anInt8995 != 4) {
								Class360.anInt3769 = 96;
							} else {
								Class360.anInt3769 = 1;
								Class360.aClass1_3783.method379(1175619289);
								Class325_Sub1.method3213(145027019);
							}
						}
					} else if (Class360.anInt3769 != 137) {
						Class330_Sub46_Sub2 var21;
						if (Class360.anInt3769 == 140) {
							var21 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17;
							if (Class360.anInt3791 == 288) {
								if (!Class360.aClass1_3783.method380(2103971117).method4194(Class263.anInt2735, -1020237123)) {
									return;
								}
								Class360.aClass1_3783.method380(661426385).method4195(var21.payload, 0, Class263.anInt2735, -1086764901);
								var21.offset = 0;
								client.anInt9182 = var21.readUnsignedByte(-302637734);
								client.anInt9125 = var21.readUnsignedByte(862319604);
								client.aBoolean9083 = var21.readUnsignedByte(-246685711) == 1;
								client.aBoolean9228 = var21.readUnsignedByte(1199993519) == 1;
								client.aBoolean9128 = var21.readUnsignedByte(1579761375) == 1;
								client.aBoolean9073 = var21.readUnsignedByte(290530952) == 1;
								client.anInt9121 = var21.readUnsignedShort(1219559122);
								client.aBoolean9122 = var21.readUnsignedByte(1531850288) == 1;
								Class284.anInt2928 = var21.readTriByte(-131022599);
								client.aBoolean9123 = var21.readUnsignedByte(502014974) == 1;
								Class503.aString5915 = var21.readString(-1557385269);
								client.aClass304_9030.method3025((byte) 13).method5706(client.aBoolean9123, (byte) 1);
								Class43.aClass276_10073.method2721((byte) 108).method3025((byte) 13).method5706(client.aBoolean9123, (byte) 1);
								Class556.aClass510_6392.method6169(client.aBoolean9123, (byte) -19);
								Class158_Sub3.aClass553_8875.method6387(client.aBoolean9123, 1505656975);
							} else if (Class360.aClass1_3783.method380(-1507233152).method4194(Class263.anInt2735, -1020237123)) {
								Class360.aClass1_3783.method380(-27177834).method4195(var21.payload, 0, Class263.anInt2735, -448619483);
								var21.offset = 0;
								client.anInt9182 = var21.readUnsignedByte(1498583836);
								client.anInt9125 = var21.readUnsignedByte(1706852843);
								client.aBoolean9083 = var21.readUnsignedByte(-13971382) == 1;
								Class284.anInt2928 = var21.readTriByte(-696669348);
								Class263_Sub2.myPlayer.female = (byte) var21.readUnsignedByte(1899620635);
								client.aBoolean9228 = var21.readUnsignedByte(1362998978) == 1;
								client.aBoolean9128 = var21.readUnsignedByte(323305584) == 1;
								Class490.aLong5854 = var21.readLong(-1845238664);
								Class158_Sub3.aLong8876 = Class490.aLong5854 - Class312.method3111((byte) 79) - var21.method3810(581027374);
								var2 = var21.readUnsignedByte(-64113411);
								client.aBoolean9122 = (var2 & 0x1) != 0;
								Class561.aBoolean6982 = (var2 & 0x2) != 0;
								Class243.anInt6988 = var21.readInt((byte) 59);
								Class330_Sub36.aBoolean7737 = var21.readUnsignedByte(235922821) == 1;
								Class330_Sub10.anInt7590 = var21.readInt((byte) 123);
								Class404.anInt4161 = var21.readUnsignedShort(1818492458);
								Class103.anInt984 = var21.readUnsignedShort(798301524);
								Class240.anInt2605 = var21.readUnsignedShort(1723592189);
								Class412.anInt4256 = var21.readInt((byte) 45);
								Class101.aClass148_6458 = new Class148(Class412.anInt4256);
								(new Thread(Class101.aClass148_6458)).start();
								Class473.anInt5695 = var21.readUnsignedByte(504046011);
								Class263_Sub3.anInt7386 = var21.readUnsignedShort(-163699656);
								Class435.anInt4424 = var21.readUnsignedShort(-384361536);
								Class370.aBoolean6771 = var21.readUnsignedByte(737330331) == 1;
								Class263_Sub2.myPlayer.aString10221 = Class263_Sub2.myPlayer.displayName = RuntimeException_Sub2.aString6440 = var21.readJagString((byte) 6);
								Class95_Sub17.anInt7193 = var21.readUnsignedByte(195936943);
								Class413.anInt4260 = var21.readInt((byte) 56);
								client.aBoolean9120 = var21.readUnsignedByte(572513208) == 1;
								Class507.aClass498_5929 = new Class498();
								Class507.aClass498_5929.anInt5889 = var21.readUnsignedShort(629008504);
								if (Class507.aClass498_5929.anInt5889 == 65535) {
									Class507.aClass498_5929.anInt5889 = -1;
								}
								Class507.aClass498_5929.aString5886 = var21.readJagString((byte) 6);
								if (aClass457_6834 != Class404.aClass457_4162) {
									Class507.aClass498_5929.anInt5887 = Class507.aClass498_5929.anInt5889 * 1467410725 + 1405932864;
									Class507.aClass498_5929.anInt5885 = Class507.aClass498_5929.anInt5889 * -1473668237 + 1047080176;
								}
								if (Class404.aClass457_4162 != aClass457_6837 && (Class404.aClass457_4162 != aClass457_6840 || client.anInt9182 < 2) && Class507.aClass498_5930.method6108(Class507.aClass498_5932, (byte) -24)) {
									Class525.method6255(-234853306);
								}
							} else {
								return;
							}
							if (client.aBoolean9083 && !client.aBoolean9128 || client.aBoolean9122) {
								try {
									Class492.method6078(Class293.anApplet6804, "zap", (byte) 1);
								} catch (Throwable var10) {
									if (client.aBoolean8954) {
										try {
											Class293.anApplet6804.getAppletContext().showDocument(new URL(Class293.anApplet6804.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception var9) {
										}
									}
								}
							} else {
								try {
									Class492.method6078(Class293.anApplet6804, "unzap", (byte) 1);
								} catch (Throwable var8) {
								}
							}
							if (Class404.aClass457_4162 == aClass457_6834) {
								Class232.aClass232_2449.method2357(1575343242);
							}
							if (Class360.anInt3791 != 288) {
								Class360.anInt3769 = 1;
								Class281.method2792(2, -656865069);
								Class460.method5689((byte) 1);
								Class227.method2311(15, -1188873169);
								Class360.aClass1_3783.currentIncomingPacket = null;
								return;
							}
							Class360.anInt3769 = 168;
						}
						if (Class360.anInt3769 == 168) {
							if (!Class360.aClass1_3783.method380(555335777).method4194(3, -1020237123)) {
								return;
							}
							Class360.aClass1_3783.method380(-1899376815).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 3, -766933868);
							Class360.anInt3769 = 172;
						}
						if (Class360.anInt3769 == 172) {
							var21 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17;
							var21.offset = 0;
							if (var21.method3825((byte) 88)) {
								if (!Class360.aClass1_3783.method380(-813159626).method4194(1, -1020237123)) {
									return;
								}
								Class360.aClass1_3783.method380(-10705482).method4195(var21.payload, 3, 1, 830888019);
							}
							Class360.aClass1_3783.currentIncomingPacket = Class386.method4431(1154287061)[var21.method3826(1001348608)];
							Class360.aClass1_3783.anInt26 = var21.readUnsignedShort(1875253654);
							Class360.anInt3769 = 155;
						}
						if (Class360.anInt3769 == 155) {
							if (Class360.aClass1_3783.method380(1068594197).method4194(Class360.aClass1_3783.anInt26, -1020237123)) {
								Class360.aClass1_3783.method380(278778224).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, Class360.aClass1_3783.anInt26, 1426872765);
								Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
								var14 = Class360.aClass1_3783.anInt26;
								Class360.anInt3769 = 1;
								Class281.method2792(2, 1040761483);
								Class158.method1846(1826366115);
								Class203.method2178(Class360.aClass1_3783.aClass330_Sub46_Sub2_17, 1940521029);
								var2 = var14 - Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset;
								Class330_Sub46_Sub2 var24 = new Class330_Sub46_Sub2(var2);
								System.arraycopy(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset, var24.payload, 0, var2);
								Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset += var2;
								if (IncomingPacket.DYNAMIC_MAP_REGION_PACKET == Class360.aClass1_3783.currentIncomingPacket) {
									client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3209, var24), 1851139680);
								} else {
									client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3210, var24), 1557662016);
								}
								if (var14 != Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset) {
									throw new RuntimeException(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset + " " + var14);
								}
								Class360.aClass1_3783.currentIncomingPacket = null;
							}
						} else if (Class360.anInt3769 == 193) {
							if (Class360.aClass1_3783.anInt26 == -2) {
								if (!Class360.aClass1_3783.method380(998827665).method4194(2, -1020237123)) {
									return;
								}
								Class360.aClass1_3783.method380(-180812947).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 2, 1461134676);
								Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
								Class360.aClass1_3783.anInt26 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.readUnsignedShort(962160314);
							}
							if (Class360.aClass1_3783.method380(704734087).method4194(Class360.aClass1_3783.anInt26, -1020237123)) {
								Class360.aClass1_3783.method380(1633889072).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, Class360.aClass1_3783.anInt26, -863325233);
								Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset = 0;
								var14 = Class360.aClass1_3783.anInt26;
								Class360.anInt3769 = 1;
								Class281.method2792(15, -1852386469);
								Class112.method1376(-1066304221);
								Class203.method2178(Class360.aClass1_3783.aClass330_Sub46_Sub2_17, 848569285);
								if (var14 != Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset) {
									throw new RuntimeException(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.offset + " " + var14);
								}
								Class360.aClass1_3783.currentIncomingPacket = null;
							}
						}
					} else if (Class360.aClass1_3783.method380(-940300323).method4194(1, -1020237123)) {
						Class360.aClass1_3783.method380(51662580).method4195(Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload, 0, 1, -1483079269);
						Class263.anInt2735 = Class360.aClass1_3783.aClass330_Sub46_Sub2_17.payload[0] & 0xFF;
						Class360.anInt3769 = 140;
					}
				} catch (IOException var11) {
					Class360.aClass1_3783.method379(1175619289);
					if (Class360.anInt3780 < 3) {
						if (Class360.anInt3791 == 288) {
							Class507.aClass498_5930.method6107(640016784);
						} else {
							Class507.aClass498_5937.method6107(1631743803);
						}
						Class360.anInt3779 = 0;
						Class360.anInt3780++;
						Class360.anInt3769 = 12;
					} else {
						Class360.anInt3769 = 1;
						Class281.method2792(-4, -646080748);
						Class325_Sub1.method3213(-1363752261);
					}
				} catch (Exception var12) {
					var12.printStackTrace();
				}
			}
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "sx.e(" + ')');
		}
	}

	public static String method5659() {
		String var0 = "";
		try {
			InetAddress var1 = InetAddress.getLocalHost();
			NetworkInterface var2 = NetworkInterface.getByInetAddress(var1);
			byte[] var3 = var2.getHardwareAddress();
			StringBuilder var4 = new StringBuilder();
			for (int var5 = 0; var5 < var3.length; var5++) {
				var4.append(String.format("%02X%s", var3[var5], var5 < var3.length - 1 ? "-" : ""));
			}
			var0 = var4.toString();
		} catch (SocketException var6) {
			var6.printStackTrace();
		} catch (UnknownHostException var7) {
			var7.printStackTrace();
		}
		return var0;
	}

	public static Class330_Sub40_Sub2 method5660(Class330_Sub40_Sub2 arg0, int arg1) {
		try {
			Class330_Sub40_Sub2 var2 = arg0 == null ? new Class330_Sub40_Sub2() : new Class330_Sub40_Sub2(arg0);
			var2.method3596(9, 128, -1706195171);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sx.j(" + ')');
		}
	}

	public static final void method5661(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, short arg3) {
		try {
			arg0.anInt1226 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 1804433878);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sx.dh(" + ')');
		}
	}

	public static boolean method5662(Class457 arg0, int arg1) {
		try {
			return arg0 == aClass457_6838 || arg0 == aClass457_6840 || aClass457_6839 == arg0 || aClass457_6835 == arg0 || aClass457_6836 == arg0 || aClass457_6833 == arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sx.i(" + ')');
		}
	}

	public static void method5663(short arg0) {
		try {
			Class393.aClass397_Sub1_4067.method4669(-1518364686);
			Class393.aClass397_Sub2_4069.method4669(-163554511);
			Class393.aLong4065 = -1L;
			Class393.aBoolean4066 = true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "sx.i(" + ')');
		}
	}

	public static final void method5664(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class260 var4 = Class260.method2577((float) var2, (float) var2, (float) var2);
			if (-1.0F == var4.aFloat2716) {
				var4.aFloat2716 = Float.POSITIVE_INFINITY;
			}
			if (-1.0F == var4.aFloat2715) {
				var4.aFloat2715 = Float.POSITIVE_INFINITY;
			}
			if (-1.0F == var4.aFloat2711) {
				var4.aFloat2711 = Float.POSITIVE_INFINITY;
			}
			Class401_Sub1.aClass145_Sub1_8249.method1676(var4, -401805930);
			Class401_Sub1.aClass145_Sub1_8249.method1675((float) var3 / 1000.0F, 1225817787);
			var4.method2550();
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sx.ahd(" + ')');
		}
	}

	public static Class195[] method5665(int arg0) {
		try {
			return new Class195[] { Class195.aClass195_1889, Class195.aClass195_1888, Class195.aClass195_1887 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "sx.r(" + ')');
		}
	}

	public static final void method5666(Class430 arg0, short arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1308947032);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class429.method5326(var3, var4, arg0, -1787960951);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sx.oi(" + ')');
		}
	}

	public static class CreateUID {

		public static final String CLASS_Win32_BIOS = "Win32_BIOS";

		public static final String CLASS_Win32_OperatingSystem = "Win32_OperatingSystem";

		public static final String CRLF = "\r\n";

		public static String getWMIValue(String arg0, String arg1) throws Exception {
			String var2 = getVBScript(arg0, arg1);
			String var3 = getEnvVar("TEMP").trim();
			String var4 = var3 + File.separator + "jwmi.vbs";
			writeStrToFile(var4, var2);
			String var5 = execute(new String[] { "cmd.exe", "/C", "cscript.exe", var4 });
			(new File(var4)).delete();
			return var5.trim();
		}

		public static String getVBScript(String arg0, String arg1) {
			String var2 = "Dim oWMI : Set oWMI = GetObject(\"winmgmts:\")\r\n";
			String var5 = var2 + "Dim classComponent : Set classComponent = oWMI.ExecQuery(\"" + arg0 + "\")" + "\r\n";
			String var6 = var5 + "Dim obj, strData\r\n";
			var2 = var6 + "For Each obj in classComponent\r\n";
			String[] var3 = arg1.split(",");
			for (int var4 = 0; var4 < var3.length; var4++) {
				var2 = var2 + "  strData = strData & obj." + var3[var4] + " & VBCrLf" + "\r\n";
			}
			var2 = var2 + "Next\r\n";
			return var2 + "wscript.echo strData\r\n";
		}

		public static String getEnvVar(String arg0) throws Exception {
			String var1 = "%" + arg0 + "%";
			String var2 = execute(new String[] { "cmd.exe", "/C", "echo " + var1 });
			if (var2.equals(var1)) {
				throw new Exception("Environment variable '" + arg0 + "' does not exist!");
			}
			return var2;
		}

		public static void writeStrToFile(String arg0, String arg1) throws Exception {
			FileWriter var2 = new FileWriter(arg0);
			var2.write(arg1);
			var2.flush();
			var2.close();
			Object var3 = null;
		}

		public static String execute(String[] arg0) throws Exception {
			Process var1 = Runtime.getRuntime().exec(arg0);
			BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
			String var3 = "";
			String var4 = "";
			String var5;
			while ((var5 = var2.readLine()) != null) {
				if (!var5.contains("Microsoft") && !var5.equals("")) {
					var3 = var3 + var5 + "\r\n";
				}
			}
			var1.destroy();
			var1 = null;
			return var3.trim();
		}

		public static String generateUID() throws Exception {
            String var1 = getWMIValue("SELECT SerialNumber FROM Win32_BIOS", "SerialNumber");
            String var2 = getWMIValue("Select InstallDate from Win32_OperatingSystem", "InstallDate");
            return var1.concat(var2);
		}
	}
}
