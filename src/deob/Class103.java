package deob;

public class Class103 {

	public static Class103 aClass103_979 = new Class103(1);

	public static Class103 aClass103_926 = new Class103(2);

	public static Class103 aClass103_950 = new Class103(3);

	public static Class103 aClass103_928 = new Class103(4);

	public static Class103 aClass103_929 = new Class103(5);

	public static Class103 aClass103_930 = new Class103(6, 8);

	public static Class103 aClass103_981 = new Class103(7);

	public static Class103 aClass103_932 = new Class103(8, 8);

	public static Class103 aClass103_940 = new Class103(9, 7);

	public static Class103 aClass103_934 = new Class103(10, 8);

	public static Class103 aClass103_935 = new Class103(11);

	public static Class103 aClass103_936 = new Class103(12, 7);

	public static Class103 aClass103_927 = new Class103(13, 8);

	public static Class103 aClass103_938 = new Class103(14, 10);

	public static Class103 aClass103_939 = new Class103(15);

	public static Class103 aClass103_933 = new Class103(16);

	public static Class103 aClass103_941 = new Class103(17);

	public static Class103 aClass103_966 = new Class103(18);

	public static Class103 aClass103_937 = new Class103(19);

	public static Class103 aClass103_944 = new Class103(20);

	public static Class103 aClass103_945 = new Class103(21);

	public static Class103 aClass103_946 = new Class103(22);

	public static Class103 aClass103_962 = new Class103(23);

	public static Class103 aClass103_948 = new Class103(24);

	public static Class103 aClass103_949 = new Class103(25);

	public static Class103 aClass103_963 = new Class103(26);

	public static Class103 aClass103_951 = new Class103(27);

	public static Class103 aClass103_970 = new Class103(28);

	public static Class103 aClass103_953 = new Class103(29);

	public static Class103 aClass103_947 = new Class103(30);

	public static Class103 aClass103_955 = new Class103(31);

	public static Class103 aClass103_956 = new Class103(32);

	public static Class103 aClass103_957 = new Class103(33);

	public static Class103 aClass103_958 = new Class103(34);

	public static Class103 aClass103_959 = new Class103(35);

	public static Class103 aClass103_960 = new Class103(36);

	public static Class103 aClass103_961 = new Class103(37);

	public static Class103 aClass103_980 = new Class103(38);

	public static Class103 aClass103_931 = new Class103(39);

	public static Class103 aClass103_964 = new Class103(40);

	public static Class103 aClass103_965 = new Class103(41);

	public static Class103 aClass103_976 = new Class103(42);

	public static Class103 aClass103_967 = new Class103(43);

	public static Class103 aClass103_968 = new Class103(44);

	public static Class103 aClass103_969 = new Class103(45);

	public static Class103 aClass103_954 = new Class103(46);

	public static Class103 aClass103_975 = new Class103(47);

	public static Class103 aClass103_972 = new Class103(48);

	public static Class103 aClass103_973 = new Class103(49);

	public static Class103 aClass103_974 = new Class103(50);

	public static Class103 aClass103_952 = new Class103(51);

	public static Class103 aClass103_943 = new Class103(53);

	public static Class103 aClass103_977 = new Class103(54);

	public static Class103 aClass103_978 = new Class103(70);

	public static Class103 aClass103_942 = new Class103(72);

	public static Class103 aClass103_925 = new Class103(73);

	public static Class103 aClass103_983 = new Class103(74);

	public int anInt982;

	public int anInt971;

	public static int anInt984;

	public Class103(int arg0, int arg1) {
		this.anInt982 = arg0;
		this.anInt971 = arg1;
	}

	public int method1226(byte arg0) {
		try {
			return 0x1 << this.anInt971;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ee.r(" + ')');
		}
	}

	public int method1227(int arg0, byte arg1) {
		try {
			return arg0 & (0x1 << this.anInt971) - 1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ee.i(" + ')');
		}
	}

	public Class103(int arg0) {
		this(arg0, 0);
	}

	public int method1228(int arg0, int arg1) {
		try {
			return arg0 >>> this.anInt971;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ee.j(" + ')');
		}
	}

	public static final void decodePlayerMasks(Class330_Sub46_Sub2 arg0, int arg1, Player arg2, int arg3, int arg4) {
		try {
			byte var5 = Class299.aClass299_6809.aByte6805;
			int var6;
			if ((arg3 & 0x20) != 0) {
				var6 = arg0.readUnsignedByteS(-400233324);
				byte[] var7 = new byte[var6];
				Buffer var8 = new Buffer(var7);
				arg0.readBytes(var7, 0, var6, 1274334002);
				Class15.aClass330_Sub46Array191[arg1] = var8;
				arg2.sendAppearance(var8, -2129426903);
			}
			if ((arg3 & 0x40000) != 0) {
				arg2.aByte10043 = arg0.readByteC(-2033909006);
				arg2.aByte10044 = arg0.readByteC(-2090972900);
				arg2.aByte10063 = arg0.readByteA(1519532308);
				arg2.aByte10025 = (byte) arg0.readUnsignedByteA(-741334169);
				arg2.anInt10041 = client.anInt8981 + arg0.readUnsignedLEShortA(1829321580);
				arg2.anInt10042 = client.anInt8981 + arg0.readUnsignedLEShortA(-1692324566);
			}
			int var9;
			int var10;
			boolean var11;
			int var15;
			int var16;
			if ((arg3 & 0x200000) != 0) {
				var6 = arg0.readUnsignedShort(870115027);
				var15 = arg0.readInt1((byte) 2);
				if (var6 == 65535) {
					var6 = -1;
				}
				var16 = arg0.readUnsignedByteA(-741334169);
				var9 = var16 & 0x7;
				var10 = var16 >> 3 & 0xF;
				if (var10 == 15) {
					var10 = -1;
				}
				var11 = (var16 >> 7 & 0x1) == 1;
				arg2.sendGraphics(var6, var15, var9, var10, var11, 2, (byte) -70);
			}
			if ((arg3 & 0x10) != 0) {
				var6 = arg0.readUnsignedLEShort(15163594);
				if (var6 == 65535) {
					var6 = -1;
				}
				arg2.anInt10028 = var6;
			}
			if ((arg3 & 0x80000) != 0) {
				arg2.aClass65_10249.method783((byte) 60);
				var6 = arg0.payload[++arg0.offset - 1] & 0xFF;
				for (var15 = 0; var15 < var6; var15++) {
					var16 = arg0.readUnsignedLEShort(15163594);
					var9 = arg0.readInt1((byte) 2);
					arg2.aClass65_10249.method781(var16, var9, (short) 8192);
				}
			}
			if ((arg3 & 0x400000) != 0) {
				var6 = arg0.readUnsignedLEShort(15163594);
				var15 = arg0.readInt((byte) 64);
				if (var6 == 65535) {
					var6 = -1;
				}
				var16 = arg0.readUnsignedByteA(-741334169);
				var9 = var16 & 0x7;
				var10 = var16 >> 3 & 0xF;
				if (var10 == 15) {
					var10 = -1;
				}
				var11 = (var16 >> 7 & 0x1) == 1;
				arg2.sendGraphics(var6, var15, var9, var10, var11, 3, (byte) -31);
			}
			int var20;
			if ((arg3 & 0x4) != 0) {
				var6 = arg0.readUnsignedByteA(-741334169);
				int var12;
				if (var6 > 0) {
					for (var15 = 0; var15 < var6; var15++) {
						var16 = -1;
						boolean var18 = true;
						var10 = -1;
						var20 = arg0.readSmart(-1970809253);
						if (var20 == 32767) {
							var20 = arg0.readSmart(216834725);
							var9 = arg0.readSmart(55364616);
							var16 = arg0.readSmart(-602036421);
							var10 = arg0.readSmart(-1223018494);
						} else if (var20 == 32766) {
							var20 = -1;
							var9 = arg0.readUnsignedByteA(-741334169);
						} else {
							var9 = arg0.readSmart(-1094732787);
						}
						var12 = arg0.readSmart(-1536960400);
						arg2.method5423(var20, var9, var16, var10, client.anInt8981, var12, 1428916200);
					}
				}
				var15 = arg0.readUnsignedByte(1054936279);
				if (var15 > 0) {
					for (var16 = 0; var16 < var15; var16++) {
						var9 = arg0.readSmart(-755318339);
						var10 = arg0.readSmart(-421666539);
						if (var10 == 32767) {
							arg2.method5418(var9, -384448259);
						} else {
							var20 = arg0.readSmart(-284835061);
							var12 = arg0.readUnsignedByteC(-243015761);
							int var13 = var10 > 0 ? arg0.readUnsignedByteS(-400233324) : var12;
							arg2.method5417(var9, client.anInt8981, var10, var20, var12, var13, -533815353);
						}
					}
				}
			}
			if ((arg3 & 0x40) != 0) {
				int[] var17 = new int[Class487_Sub1.method6040(1090771834).length];
				for (var15 = 0; var15 < Class487_Sub1.method6040(1542108191).length; var15++) {
					var17[var15] = arg0.readBigSmart(-2123435512);
				}
				var15 = arg0.readUnsignedByteA(-741334169);
				Class150_Sub2.method1772(arg2, var17, var15, false, (byte) 69);
			}
			if ((arg3 & 0x80) != 0) {
				Class15.aByteArray190[arg1] = arg0.readByteS((byte) 41);
			}
			String var19;
			if ((arg3 & 0x400) != 0) {
				var19 = arg0.readString(-1087530102);
				if (arg2 == Class263_Sub2.myPlayer) {
					Class556.method6406(2, 0, arg2.method5471(true, 1346143827), arg2.method5460(false, 798545240), arg2.displayName, var19, -1916381562);
				}
				arg2.method5466(var19, 0, 0, -1947216170);
			}
			if ((arg3 & 0x200) != 0) {
				arg2.anInt10034 = arg0.readByte((byte) -10);
				arg2.anInt10045 = arg0.readByteS((byte) -9);
				arg2.anInt10057 = arg0.readByteC(-2046267018);
				arg2.anInt10036 = arg0.readByteC(-2044532480);
				arg2.anInt10058 = arg0.readUnsignedShort(1796966271) + client.anInt8981;
				arg2.anInt10038 = arg0.readUnsignedLEShort(15163594) + client.anInt8981;
				arg2.anInt10040 = arg0.readUnsignedLEShort(15163594);
				if (arg2.aBoolean10243) {
					arg2.anInt10034 += arg2.anInt10244;
					arg2.anInt10045 += arg2.anInt10245;
					arg2.anInt10057 += arg2.anInt10244;
					arg2.anInt10036 += arg2.anInt10245;
					arg2.anInt10056 = 0;
				} else {
					arg2.anInt10034 += arg2.anIntArray10018[0];
					arg2.anInt10045 += arg2.anIntArray10059[0];
					arg2.anInt10057 += arg2.anIntArray10018[0];
					arg2.anInt10036 += arg2.anIntArray10059[0];
					arg2.anInt10056 = 1;
				}
				arg2.anInt10006 = 0;
			}
			if ((arg3 & 0x100000) != 0) {
				var6 = arg0.payload[++arg0.offset - 1] & 0xFF;
				for (var15 = 0; var15 < var6; var15++) {
					var16 = arg0.readUnsignedLEShortA(-1874462711);
					var9 = arg0.readInt1((byte) 2);
					arg2.aClass65_10249.method781(var16, var9, (short) 8192);
				}
			}
			if ((arg3 & 0x2) != 0) {
				arg2.anInt10232 = arg0.readUnsignedLEShort(15163594);
				if (arg2.anInt10056 == 0) {
					arg2.method5410(arg2.anInt10232, (byte) -23);
					arg2.anInt10232 = -1;
				}
			}
			if ((arg3 & 0x1000) != 0) {
				arg2.aBoolean10234 = arg0.readUnsignedByteC(-243015761) == 1;
			}
			if ((arg3 & 0x10000) != 0) {
				var19 = arg0.readString(-1135892615);
				var15 = arg0.readUnsignedByteA(-741334169);
				if ((var15 & 0x1) != 0) {
					Class556.method6406(2, var15, arg2.method5471(true, 1782241613), arg2.method5460(false, 1508868756), arg2.displayName, var19, -2062877770);
				}
				arg2.method5466(var19, 0, 0, -1947216170);
			}
			if ((arg3 & 0x800000) != 0) {
				arg2.aBoolean10247 = arg0.readUnsignedByte(592637561) == 1;
			}
			if ((arg3 & 0x100) != 0) {
				var6 = arg0.readUnsignedLEShortA(-1180315608);
				var15 = arg0.readInt1((byte) 2);
				if (var6 == 65535) {
					var6 = -1;
				}
				var16 = arg0.readUnsignedByteS(-400233324);
				var9 = var16 & 0x7;
				var10 = var16 >> 3 & 0xF;
				if (var10 == 15) {
					var10 = -1;
				}
				var11 = (var16 >> 7 & 0x1) == 1;
				arg2.sendGraphics(var6, var15, var9, var10, var11, 1, (byte) -94);
			}
			int[] var21;
			int[] var22;
			if ((arg3 & 0x4000) != 0) {
				var6 = arg0.readUnsignedByte(1541017621);
				var22 = new int[var6];
				var21 = new int[var6];
				int[] var23 = new int[var6];
				for (var10 = 0; var10 < var6; var10++) {
					var22[var10] = arg0.readBigSmart(-1616370089);
					var21[var10] = arg0.readUnsignedByte(489115);
					var23[var10] = arg0.readUnsignedLEShort(15163594);
				}
				Class110.method1363(arg2, var22, var21, var23, (byte) -120);
			}
			if ((arg3 & 0x8000) != 0) {
				var5 = arg0.readByteC(-2085009229);
			}
			if ((arg3 & 0x20000) != 0) {
				var6 = arg0.readUnsignedByteS(-400233324);
				var22 = new int[var6];
				var21 = new int[var6];
				for (var9 = 0; var9 < var6; var9++) {
					var10 = arg0.readUnsignedShort(151480112);
					if ((var10 & 0xC000) == 49152) {
						var20 = arg0.readUnsignedLEShort(15163594);
						var22[var9] = var10 << 16 | var20;
					} else {
						var22[var9] = var10;
					}
					var21[var9] = arg0.readUnsignedLEShortA(-1035463811);
				}
				arg2.method5413(var22, var21, (byte) 16);
			}
			if ((arg3 & 0x1) != 0) {
				var6 = arg0.readUnsignedShortA((byte) -52);
				var15 = arg0.readInt((byte) 77);
				if (var6 == 65535) {
					var6 = -1;
				}
				var16 = arg0.readUnsignedByteC(-243015761);
				var9 = var16 & 0x7;
				var10 = var16 >> 3 & 0xF;
				if (var10 == 15) {
					var10 = -1;
				}
				var11 = (var16 >> 7 & 0x1) == 1;
				arg2.sendGraphics(var6, var15, var9, var10, var11, 0, (byte) 3);
			}
			if (arg2.aBoolean10243) {
				if (var5 == 127) {
					arg2.method5463(arg2.anInt10244, arg2.anInt10245, (short) 1007);
				} else {
					byte var24;
					if (Class299.aClass299_6809.aByte6805 == var5) {
						var24 = Class15.aByteArray190[arg1];
					} else {
						var24 = var5;
					}
					Class285.method2863(arg2, var24, (byte) -117);
					arg2.method5462(arg2.anInt10244, arg2.anInt10245, var24, -881736194);
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "ee.z(" + ')');
		}
	}

	public static Class134 method1230(int arg0, int arg1) {
		try {
			Class134[] var2 = Class70.method813(-1988490872);
			for (int var3 = 0; var3 < var2.length; var3++) {
				Class134 var4 = var2[var3];
				if (var4.anInt1516 == arg0) {
					return var4;
				}
			}
			return null;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.j(" + ')');
		}
	}

	public static Class205 method1231(Buffer arg0, int arg1) {
		try {
			String var2 = arg0.readString(-1019058927);
			Class195 var3 = Class457.method5665(-1882618819)[arg0.readUnsignedByte(1460423099)];
			Class211 var4 = Class7.method412((byte) -82)[arg0.readUnsignedByte(744457138)];
			int var5 = arg0.readShort(-1100583751);
			int var6 = arg0.readShort(-1100583751);
			int var7 = arg0.readUnsignedByte(-200394345);
			int var8 = arg0.readUnsignedByte(1990176514);
			int var9 = arg0.readUnsignedByte(-230875951);
			int var10 = arg0.readUnsignedShort(1441652459);
			int var11 = arg0.readUnsignedShort(1860133248);
			int var12 = arg0.readBigSmart(-1827401245);
			int var13 = arg0.readInt((byte) 104);
			int var14 = arg0.readInt((byte) 61);
			return new Class205(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "ee.r(" + ')');
		}
	}

	public static final void method1232(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 635883441);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class422.method5296(var3, var4, arg0, 876316383);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.ib(" + ')');
		}
	}

	public static final void method1233(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			String var3 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2 == -1) {
				throw new RuntimeException();
			}
			Class506 var4 = Class211.aClass505_2062.method6140(var2, 1615605786);
			if (var4.aChar5921 != 's') {
				throw new RuntimeException();
			}
			int[] var5 = var4.method6147(var3, 16777472);
			int var6 = 0;
			if (var5 != null) {
				var6 = var5.length;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ee.vz(" + ')');
		}
	}

	public static final void method1234(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass99Array9259[var2].anInt916;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ee.wu(" + ')');
		}
	}

	public static final void method1235(Class430 arg0, int arg1) {
		try {
			if (Class412.aClass154_4258 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
				arg0.aClass154_4391 = Class412.aClass154_4258;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ee.xk(" + ')');
		}
	}

	public static final void method1236(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			IndexTable.aShortArray2907[arg0.anIntArray4387[arg0.anInt4376]] = (short) Class404.method4739(arg0.anIntArray4387[arg0.anInt4376 + 1], -1769481276);
			Class556.aClass510_6392.method6166(1132674639);
			Class556.aClass510_6392.method6171(2104413149);
			Class158_Sub3.aClass553_8875.method6389(-1098358360);
			Class464.method5726(-1370133006);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ee.afs(" + ')');
		}
	}

	public static final void method1237(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class78.method934(var3, var4, arg0, (byte) 7);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.mg(" + ')');
		}
	}

	public static final void method1238(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 100493802);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class419.method5276(var3, var4, arg0, 1921827876);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.fs(" + ')');
		}
	}

	public static void method1239(Class468 arg0, byte arg1) {
		try {
			Class357.aClass468_3702 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ee.l(" + ')');
		}
	}

	public static final void method1240(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class288.method2885(var3, var4, arg0, -1427069234);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.gk(" + ')');
		}
	}

	public static boolean method1241(int arg0) {
		try {
			try {
				if (Class110.anInt1152 == 2) {
					if (Class366.musicFile == null) {
						System.out.println("LOADING MUSIC: " + Class110.musicId + " " + Class369.anInt6819);
						Class366.musicFile = Class330_Sub6.getFile(Class110.aClass280_1161, Class110.musicId, Class369.anInt6819);
						if (Class366.musicFile == null) {
							return false;
						}
					}
					if (Class57.aClass305_6600 == null) {
						Class57.aClass305_6600 = new Class305(Class110.aClass280_1154, Class110.aClass280_1153);
					}
					Class330_Sub40_Sub2 var2 = Class110.aClass330_Sub40_Sub2_1155;
					if (Class288.aClass330_Sub40_Sub2_2955 != null) {
						var2 = Class288.aClass330_Sub40_Sub2_2955;
					}
					if (var2.method3615(Class366.musicFile, Class110.aClass280_1160, Class57.aClass305_6600, 22050, (short) 32191)) {
						Class110.aClass330_Sub40_Sub2_1155 = var2;
						Class110.aClass330_Sub40_Sub2_1155.method3613(-1903555119);
						int var3;
						if (Class559.anInt6433 > 0) {
							Class110.anInt1152 = 3;
							Class110.aClass330_Sub40_Sub2_1155.method3586(Class559.anInt6433 > Class121.volume ? Class121.volume : Class559.anInt6433, 2109696806);
							for (var3 = 0; var3 < Class85.anIntArray711.length; var3++) {
								Class110.aClass330_Sub40_Sub2_1155.method3589(var3, Class85.anIntArray711[var3], 999768506);
								Class85.anIntArray711[var3] = 255;
							}
						} else {
							Class110.anInt1152 = 0;
							Class110.aClass330_Sub40_Sub2_1155.method3586(Class121.volume, 1853037667);
							for (var3 = 0; var3 < Class85.anIntArray711.length; var3++) {
								Class110.aClass330_Sub40_Sub2_1155.method3589(var3, Class85.anIntArray711[var3], 2103681777);
								Class85.anIntArray711[var3] = 255;
							}
						}
						if (Class288.aClass330_Sub40_Sub2_2955 == null) {
							if (Class72.aLong621 > 0L) {
								Class110.aClass330_Sub40_Sub2_1155.method3593(Class366.musicFile, Class268.aBoolean2746, true, Class72.aLong621);
							} else {
								Class110.aClass330_Sub40_Sub2_1155.method3591(Class366.musicFile, Class268.aBoolean2746, -1543176376);
							}
							if (Class403.aClass111_4138 != null) {
								Class403.aClass111_4138.method1364(-130832991);
							}
						}
						if (Class539.aClass296_6244 != null) {
							Class539.aClass296_6244.method2935(Class110.aClass330_Sub40_Sub2_1155);
						}
						Class366.musicFile = null;
						Class57.aClass305_6600 = null;
						Class110.aClass280_1161 = null;
						Class72.aLong621 = 0L;
						Class288.aClass330_Sub40_Sub2_2955 = null;
						Class403.aClass111_4138 = null;
						boolean var1 = true;
						return var1;
					}
				}
			} catch (Exception var4) {
				var4.printStackTrace();
				Class110.aClass330_Sub40_Sub2_1155.method3594(-2080270116);
				Class121.method1448((byte) -9);
			}
			return false;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ee.x(" + ')');
		}
	}
}
