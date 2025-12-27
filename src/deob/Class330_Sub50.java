package deob;

public class Class330_Sub50 extends Class330 {

	public static int anInt7869 = 245;

	public static int anInt7870 = 500;

	public static int anInt7878 = 40;

	public static int anInt7905 = 23;

	public static int anInt7911 = 27;

	public Class435 aClass435_7871;

	public Class483 aClass483_7867;

	public Class464_Sub23 aClass464_Sub23_7895;

	public Class464_Sub10 aClass464_Sub10_7873;

	public Class464_Sub11 aClass464_Sub11_7879;

	public Class464_Sub12 aClass464_Sub12_7906;

	public Class464_Sub13 aClass464_Sub13_7893;

	public Class464_Sub14 aClass464_Sub14_7884;

	public Class464_Sub15 aClass464_Sub15_7902;

	public Class464_Sub16 aClass464_Sub16_7900;

	public Class464_Sub17 aClass464_Sub17_7910;

	public Class464_Sub18 aClass464_Sub18_7877;

	public Class464_Sub19 aClass464_Sub19_7876;

	public Class464_Sub1 aClass464_Sub1_7886;

	public Class464_Sub20 aClass464_Sub20_7888;

	public Class464_Sub20 aClass464_Sub20_7889;

	public Class464_Sub21 aClass464_Sub21_7875;

	public Class464_Sub22 aClass464_Sub22_7892;

	public Class464_Sub23 aClass464_Sub23_7908;

	public Class464_Sub24 aClass464_Sub24_7904;

	public Class464_Sub25 aClass464_Sub25_7896;

	public Class464_Sub26 aClass464_Sub26_7901;

	public Class464_Sub27 aClass464_Sub27_7881;

	public Class464_Sub28 aClass464_Sub28_7885;

	public Class464_Sub29 aClass464_Sub29_7903;

	public Class464_Sub2 aClass464_Sub2_7868;

	public Class464_Sub30 aClass464_Sub30_7887;

	public Class464_Sub30 aClass464_Sub30_7894;

	public Class464_Sub30 aClass464_Sub30_7898;

	public Class464_Sub30 aClass464_Sub30_7907;

	public Class464_Sub30 aClass464_Sub30_7909;

	public Class464_Sub3 aClass464_Sub3_7880;

	public Class464_Sub4 aClass464_Sub4_7883;

	public Class464_Sub5 aClass464_Sub5_7890;

	public Class464_Sub6 aClass464_Sub6_7882;

	public Class464_Sub7 aClass464_Sub7_7891;

	public Class464_Sub8 aClass464_Sub8_7872;

	public Class464_Sub8 aClass464_Sub8_7897;

	public Class464_Sub9 aClass464_Sub9_7874;

	public Class464_Sub9 aClass464_Sub9_7899;

	public void method3853(Buffer arg0, int arg1, int arg2) {
		try {
			this.aClass464_Sub1_7886 = new Class464_Sub1(arg0.readUnsignedByte(359541445), this);
			arg0.offset++;
			this.aClass464_Sub20_7888 = new Class464_Sub20(arg0.readUnsignedByte(801227724) + 1, this);
			this.aClass464_Sub6_7882 = new Class464_Sub6(arg0.readUnsignedByte(741727740), this);
			arg0.offset++;
			this.aClass464_Sub4_7883 = new Class464_Sub4(arg0.readUnsignedByte(1128114105), this);
			this.aClass464_Sub11_7879 = new Class464_Sub11(arg0.readUnsignedByte(342981228), this);
			arg0.readUnsignedByte(7493068);
			this.aClass464_Sub22_7892 = new Class464_Sub22(arg0.readUnsignedByte(1364342936), this);
			int var4 = arg0.readUnsignedByte(-92649089);
			int var5 = 0;
			if (arg1 >= 17) {
				var5 = arg0.readUnsignedByte(1530486823);
			}
			this.aClass464_Sub28_7885 = new Class464_Sub28(var4 > var5 ? var4 : var5, this);
			boolean var6 = true;
			boolean var7 = true;
			if (arg1 >= 2) {
				var6 = arg0.readUnsignedByte(953949440) == 1;
				if (arg1 >= 17) {
					var7 = arg0.readUnsignedByte(1189348947) == 1;
				}
			} else {
				var6 = arg0.readUnsignedByte(297776136) == 1;
				arg0.readUnsignedByte(-58241386);
			}
			this.aClass464_Sub2_7868 = new Class464_Sub2(var6 | var7 ? 1 : 0, this);
			this.aClass464_Sub25_7896 = new Class464_Sub25(arg0.readUnsignedByte(625550601), this);
			this.aClass464_Sub3_7880 = new Class464_Sub3(arg0.readUnsignedByte(1708472565), this);
			this.aClass464_Sub9_7899 = new Class464_Sub9(arg0.readUnsignedByte(1096263595), this);
			this.aClass464_Sub17_7910 = new Class464_Sub17(arg0.readUnsignedByte(1905236833), this);
			this.aClass464_Sub30_7894 = new Class464_Sub30(arg0.readUnsignedByte(1360160322), this);
			if (arg1 >= 20) {
				this.aClass464_Sub30_7907 = new Class464_Sub30(arg0.readUnsignedByte(-201677410), this);
			} else {
				this.aClass464_Sub30_7907 = new Class464_Sub30(this.aClass464_Sub30_7894.method5841(-2110789436), this);
			}
			this.aClass464_Sub30_7898 = new Class464_Sub30(arg0.readUnsignedByte(654952967), this);
			this.aClass464_Sub30_7887 = new Class464_Sub30(arg0.readUnsignedByte(2042543162), this);
			if (arg1 >= 21) {
				this.aClass464_Sub30_7909 = new Class464_Sub30(arg0.readUnsignedByte(1811411540), this);
			} else {
				this.aClass464_Sub30_7909 = new Class464_Sub30(this.aClass464_Sub30_7898.method5841(-2038418982), this);
			}
			if (arg1 >= 1) {
				arg0.readUnsignedShort(2071345475);
				arg0.readUnsignedShort(1069978728);
			}
			if (arg1 >= 3 && arg1 < 6) {
				arg0.readUnsignedByte(1652092999);
			}
			if (arg1 >= 4) {
				this.aClass464_Sub12_7906 = new Class464_Sub12(arg0.readUnsignedByte(503352072), this);
			}
			arg0.readInt((byte) 55);
			if (arg1 >= 6) {
				this.aClass464_Sub8_7897 = new Class464_Sub8(arg0.readUnsignedByte(237229624), this);
			}
			if (arg1 >= 7) {
				this.aClass464_Sub14_7884 = new Class464_Sub14(arg0.readUnsignedByte(1720092825), this);
			}
			if (arg1 >= 8) {
				arg0.readUnsignedByte(1418513279);
			}
			if (arg1 >= 9) {
				this.aClass464_Sub18_7877 = new Class464_Sub18(arg0.readUnsignedByte(476810525), this);
			}
			if (arg1 >= 10) {
				this.aClass464_Sub21_7875 = new Class464_Sub21(arg0.readUnsignedByte(1939161857), this);
			}
			if (arg1 >= 11) {
				this.aClass464_Sub29_7903 = new Class464_Sub29(arg0.readUnsignedByte(1961778346), this);
			}
			if (arg1 >= 12) {
				this.aClass464_Sub4_7883 = new Class464_Sub4(arg0.readUnsignedByte(-312052526), this);
			}
			if (arg1 >= 13) {
				this.aClass464_Sub27_7881 = new Class464_Sub27(arg0.readUnsignedByte(936430908), this);
			}
			if (arg1 >= 14) {
				this.aClass464_Sub23_7908 = new Class464_Sub23(arg0.readUnsignedByte(7650586), this);
			}
			if (arg1 >= 15) {
				this.aClass464_Sub26_7901 = new Class464_Sub26(arg0.readUnsignedByte(751983243), this);
			}
			if (arg1 >= 16) {
				this.aClass464_Sub13_7893 = new Class464_Sub13(arg0.readUnsignedByte(878318186), this);
			}
			if (arg1 >= 18) {
				this.aClass464_Sub16_7900 = new Class464_Sub16(arg0.readUnsignedByte(199989582), this);
			}
			if (arg1 >= 19) {
				this.aClass464_Sub5_7890 = new Class464_Sub5(arg0.readUnsignedByte(-237527713), this);
			}
			if (arg1 >= 22) {
				this.aClass464_Sub15_7902 = new Class464_Sub15(arg0.readUnsignedByte(1765764400), this);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "aeo.i(" + ')');
		}
	}

	public Class330_Sub50(Buffer arg0, Class435 arg1, int arg2) {
		this.aClass435_7871 = arg1;
		this.aClass483_7867 = new Class483(Class332.anInt6617, Class332.anInt6637, Class152.aString1629.indexOf("arm") != -1);
		this.aClass464_Sub23_7895 = new Class464_Sub23(arg2, this);
		this.method3854(arg0, (byte) 52);
	}

	public void method3854(Buffer arg0, byte arg1) {
		try {
			if (arg0 == null || arg0.payload == null) {
				this.method3855(true, (byte) 6);
			} else {
				int var3 = arg0.readUnsignedByte(-294192606);
				if (var3 < 23) {
					try {
						this.method3853(arg0, var3, 737556885);
					} catch (Exception var5) {
						this.method3855(true, (byte) 66);
					}
					this.method3855(false, (byte) 15);
				} else if (var3 > 27) {
					this.method3855(true, (byte) 72);
				} else {
					this.aClass464_Sub9_7899 = new Class464_Sub9(arg0.readUnsignedByte(1633464498), this);
					this.aClass464_Sub9_7874 = new Class464_Sub9(this.aClass464_Sub9_7899.method5766((byte) 1), this);
					this.aClass464_Sub21_7875 = new Class464_Sub21(arg0.readUnsignedByte(2001834762), this);
					this.aClass464_Sub1_7886 = new Class464_Sub1(arg0.readUnsignedByte(1726305058), this);
					this.aClass464_Sub18_7877 = new Class464_Sub18(arg0.readUnsignedByte(1155309598), this);
					if (var3 >= 27) {
						this.aClass464_Sub19_7876 = new Class464_Sub19(arg0.readUnsignedByte(106318818), this);
					}
					this.aClass464_Sub11_7879 = new Class464_Sub11(arg0.readUnsignedByte(-109088254), this);
					this.aClass464_Sub3_7880 = new Class464_Sub3(arg0.readUnsignedByte(1904677432), this);
					this.aClass464_Sub27_7881 = new Class464_Sub27(arg0.readUnsignedByte(1226557793), this);
					this.aClass464_Sub6_7882 = new Class464_Sub6(arg0.readUnsignedByte(-191753640), this);
					this.aClass464_Sub4_7883 = new Class464_Sub4(arg0.readUnsignedByte(2009813493), this);
					this.aClass464_Sub2_7868 = new Class464_Sub2(arg0.readUnsignedByte(546785625), this);
					this.aClass464_Sub28_7885 = new Class464_Sub28(arg0.readUnsignedByte(1943813311), this);
					if (var3 >= 24) {
						this.aClass464_Sub10_7873 = new Class464_Sub10(arg0.readUnsignedByte(358898788), this);
					}
					this.aClass464_Sub12_7906 = new Class464_Sub12(arg0.readUnsignedByte(774192229), this);
					this.aClass464_Sub20_7888 = new Class464_Sub20(arg0.readUnsignedByte(2038350211), this);
					this.aClass464_Sub20_7889 = new Class464_Sub20(this.aClass464_Sub20_7888.method5807((byte) 11), this);
					this.aClass464_Sub5_7890 = new Class464_Sub5(arg0.readUnsignedByte(1146110972), this);
					if (var3 >= 25) {
						this.aClass464_Sub7_7891 = new Class464_Sub7(arg0.readUnsignedByte(-116763348), this);
					}
					this.aClass464_Sub22_7892 = new Class464_Sub22(arg0.readUnsignedByte(1423139049), this);
					if (var3 <= 25) {
						arg0.offset++;
					}
					this.aClass464_Sub13_7893 = new Class464_Sub13(arg0.readUnsignedByte(1126433983), this);
					this.aClass464_Sub23_7908 = new Class464_Sub23(arg0.readUnsignedByte(1020292671), this);
					this.aClass464_Sub23_7895 = new Class464_Sub23(this.aClass464_Sub23_7908.method5819(1041402693), this);
					arg0.readUnsignedByte(2088526806);
					this.aClass464_Sub25_7896 = new Class464_Sub25(arg0.readUnsignedByte(1840795154), this);
					this.aClass464_Sub8_7897 = new Class464_Sub8(arg0.readUnsignedByte(1592519146), this);
					this.aClass464_Sub8_7872 = new Class464_Sub8(this.aClass464_Sub8_7897.method5763(-1176806847), this);
					this.aClass464_Sub29_7903 = new Class464_Sub29(arg0.readUnsignedByte(370920143), this);
					this.aClass464_Sub16_7900 = new Class464_Sub16(arg0.readUnsignedByte(63143921), this);
					this.aClass464_Sub26_7901 = new Class464_Sub26(arg0.readUnsignedByte(1240685851), this);
					this.aClass464_Sub15_7902 = new Class464_Sub15(arg0.readUnsignedByte(751333340), this);
					this.aClass464_Sub14_7884 = new Class464_Sub14(arg0.readUnsignedByte(783119909), this);
					if (var3 >= 26) {
						this.aClass464_Sub24_7904 = new Class464_Sub24(arg0.readUnsignedByte(2050629919), this);
					}
					this.aClass464_Sub30_7894 = new Class464_Sub30(arg0.readUnsignedByte(1873055246), this);
					this.aClass464_Sub30_7887 = new Class464_Sub30(arg0.readUnsignedByte(2035242040), this);
					this.aClass464_Sub30_7907 = new Class464_Sub30(arg0.readUnsignedByte(2006783953), this);
					this.aClass464_Sub30_7898 = new Class464_Sub30(arg0.readUnsignedByte(733901945), this);
					this.aClass464_Sub30_7909 = new Class464_Sub30(arg0.readUnsignedByte(39069785), this);
					this.aClass464_Sub17_7910 = new Class464_Sub17(arg0.readUnsignedByte(2084399683), this);
					this.method3855(false, (byte) 68);
				}
			}
			this.method3860(1596702092);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "aeo.r(" + ')');
		}
	}

	public void method3855(boolean arg0, byte arg1) {
		try {
			if (arg0 || this.aClass464_Sub9_7899 == null) {
				this.aClass464_Sub9_7899 = new Class464_Sub9(this);
			}
			if (arg0 || this.aClass464_Sub9_7874 == null) {
				this.aClass464_Sub9_7874 = new Class464_Sub9(this.aClass464_Sub9_7899.method5766((byte) 1), this);
			}
			if (arg0 || this.aClass464_Sub21_7875 == null) {
				this.aClass464_Sub21_7875 = new Class464_Sub21(this);
			}
			if (arg0 || this.aClass464_Sub1_7886 == null) {
				this.aClass464_Sub1_7886 = new Class464_Sub1(this);
			}
			if (arg0 || this.aClass464_Sub18_7877 == null) {
				this.aClass464_Sub18_7877 = new Class464_Sub18(this);
			}
			if (arg0 || this.aClass464_Sub19_7876 == null) {
				this.aClass464_Sub19_7876 = new Class464_Sub19(this);
			}
			if (arg0 || this.aClass464_Sub11_7879 == null) {
				this.aClass464_Sub11_7879 = new Class464_Sub11(this);
			}
			if (arg0 || this.aClass464_Sub3_7880 == null) {
				this.aClass464_Sub3_7880 = new Class464_Sub3(this);
			}
			if (arg0 || this.aClass464_Sub27_7881 == null) {
				this.aClass464_Sub27_7881 = new Class464_Sub27(this);
			}
			if (arg0 || this.aClass464_Sub6_7882 == null) {
				this.aClass464_Sub6_7882 = new Class464_Sub6(this);
			}
			if (arg0 || this.aClass464_Sub4_7883 == null) {
				this.aClass464_Sub4_7883 = new Class464_Sub4(this);
			}
			if (arg0 || this.aClass464_Sub2_7868 == null) {
				this.aClass464_Sub2_7868 = new Class464_Sub2(this);
			}
			if (arg0 || this.aClass464_Sub28_7885 == null) {
				this.aClass464_Sub28_7885 = new Class464_Sub28(this);
			}
			if (arg0 || this.aClass464_Sub10_7873 == null) {
				this.aClass464_Sub10_7873 = new Class464_Sub10(this);
			}
			if (arg0 || this.aClass464_Sub12_7906 == null) {
				this.aClass464_Sub12_7906 = new Class464_Sub12(this);
			}
			if (arg0 || this.aClass464_Sub20_7888 == null) {
				this.aClass464_Sub20_7888 = new Class464_Sub20(this);
			}
			if (arg0 || this.aClass464_Sub20_7889 == null) {
				this.aClass464_Sub20_7889 = new Class464_Sub20(this.aClass464_Sub20_7888.method5807((byte) 113), this);
			}
			if (arg0 || this.aClass464_Sub5_7890 == null) {
				this.aClass464_Sub5_7890 = new Class464_Sub5(this);
			}
			if (arg0 || this.aClass464_Sub7_7891 == null) {
				this.aClass464_Sub7_7891 = new Class464_Sub7(this);
			}
			if (arg0 || this.aClass464_Sub22_7892 == null) {
				this.aClass464_Sub22_7892 = new Class464_Sub22(this);
			}
			if (arg0 || this.aClass464_Sub13_7893 == null) {
				this.aClass464_Sub13_7893 = new Class464_Sub13(this);
			}
			if (arg0 || this.aClass464_Sub23_7908 == null) {
				this.aClass464_Sub23_7908 = new Class464_Sub23(this);
			}
			if (arg0 || this.aClass464_Sub23_7895 == null) {
				this.aClass464_Sub23_7895 = new Class464_Sub23(this.aClass464_Sub23_7908.method5819(-971305491), this);
			}
			if (arg0 || this.aClass464_Sub25_7896 == null) {
				this.aClass464_Sub25_7896 = new Class464_Sub25(this);
			}
			if (arg0 || this.aClass464_Sub8_7897 == null) {
				this.aClass464_Sub8_7897 = new Class464_Sub8(this);
			}
			if (arg0 || this.aClass464_Sub8_7872 == null) {
				this.aClass464_Sub8_7872 = new Class464_Sub8(this.aClass464_Sub8_7897.method5763(437239537), this);
			}
			if (arg0 || this.aClass464_Sub29_7903 == null) {
				this.aClass464_Sub29_7903 = new Class464_Sub29(this);
			}
			if (arg0 || this.aClass464_Sub16_7900 == null) {
				this.aClass464_Sub16_7900 = new Class464_Sub16(this);
			}
			if (arg0 || this.aClass464_Sub26_7901 == null) {
				this.aClass464_Sub26_7901 = new Class464_Sub26(this);
			}
			if (arg0 || this.aClass464_Sub15_7902 == null) {
				this.aClass464_Sub15_7902 = new Class464_Sub15(this);
			}
			if (arg0 || this.aClass464_Sub14_7884 == null) {
				this.aClass464_Sub14_7884 = new Class464_Sub14(this);
			}
			if (arg0 || this.aClass464_Sub24_7904 == null) {
				this.aClass464_Sub24_7904 = new Class464_Sub24(this);
			}
			if (arg0 || this.aClass464_Sub30_7894 == null) {
				this.aClass464_Sub30_7894 = new Class464_Sub30(this);
			}
			if (arg0 || this.aClass464_Sub30_7887 == null) {
				this.aClass464_Sub30_7887 = new Class464_Sub30(this);
			}
			if (arg0 || this.aClass464_Sub30_7907 == null) {
				this.aClass464_Sub30_7907 = new Class464_Sub30(this);
			}
			if (arg0 || this.aClass464_Sub30_7898 == null) {
				this.aClass464_Sub30_7898 = new Class464_Sub30(this);
			}
			if (arg0 || this.aClass464_Sub30_7909 == null) {
				this.aClass464_Sub30_7909 = new Class464_Sub30(this);
			}
			if (arg0 || this.aClass464_Sub17_7910 == null) {
				this.aClass464_Sub17_7910 = new Class464_Sub17(this);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "aeo.j(" + ')');
		}
	}

	public void method3856(Class464 arg0, int arg1, int arg2) {
		try {
			arg0.method5717(arg1, 1500765810);
			this.method3860(1596702092);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aeo.o(" + ')');
		}
	}

	public void method3857(Class464_Sub23 arg0, boolean arg1, int arg2) {
		try {
			arg0.method5818(arg1, -200284089);
			this.method3860(1596702092);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "aeo.s(" + ')');
		}
	}

	public Class435 method3858(byte arg0) {
		try {
			return this.aClass435_7871;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeo.z(" + ')');
		}
	}

	public Class483 method3859(int arg0) {
		try {
			return this.aClass483_7867;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeo.w(" + ')');
		}
	}

	public void method3860(int arg0) {
		try {
			this.aClass464_Sub9_7899.method5765(324399574);
			this.aClass464_Sub9_7874.method5765(209162773);
			this.aClass464_Sub21_7875.method5809(934064774);
			this.aClass464_Sub1_7886.method5730((byte) 115);
			this.aClass464_Sub18_7877.method5799(-1785347322);
			this.aClass464_Sub19_7876.method5803((byte) -11);
			this.aClass464_Sub11_7879.method5777((byte) 97);
			this.aClass464_Sub3_7880.method5741(-1883793259);
			this.aClass464_Sub27_7881.method5831(645204126);
			this.aClass464_Sub6_7882.method5756(1457027901);
			this.aClass464_Sub4_7883.method5749(258576800);
			this.aClass464_Sub2_7868.method5737(-660585536);
			this.aClass464_Sub28_7885.method5836(387214783);
			this.aClass464_Sub10_7873.method5770((byte) 1);
			this.aClass464_Sub12_7906.method5782(64571523);
			this.aClass464_Sub20_7888.method5806((byte) -62);
			this.aClass464_Sub20_7889.method5806((byte) -10);
			this.aClass464_Sub5_7890.method5752(-604059935);
			this.aClass464_Sub7_7891.method5761(-1442118944);
			this.aClass464_Sub22_7892.method5814(185874360);
			this.aClass464_Sub13_7893.method5786(-276553612);
			this.aClass464_Sub23_7908.method5817(-536774413);
			this.aClass464_Sub23_7895.method5817(-49755317);
			this.aClass464_Sub25_7896.method5826(-550900351);
			this.aClass464_Sub8_7897.method5762(-1961244746);
			this.aClass464_Sub8_7872.method5762(-1921823978);
			this.aClass464_Sub29_7903.method5838((byte) 18);
			this.aClass464_Sub16_7900.method5795((byte) -28);
			this.aClass464_Sub26_7901.method5829((byte) 1);
			this.aClass464_Sub15_7902.method5791(1652701473);
			this.aClass464_Sub14_7884.method5789(-770544740);
			this.aClass464_Sub24_7904.method5824(10611333);
			this.aClass464_Sub30_7894.method5840((byte) -4);
			this.aClass464_Sub30_7887.method5840((byte) -15);
			this.aClass464_Sub30_7907.method5840((byte) -40);
			this.aClass464_Sub30_7898.method5840((byte) 73);
			this.aClass464_Sub30_7909.method5840((byte) 64);
			this.aClass464_Sub17_7910.method5797((byte) -54);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeo.f(" + ')');
		}
	}

	public Class330_Sub50(Class435 arg0, int arg1) {
		this.aClass435_7871 = arg0;
		this.aClass483_7867 = new Class483(Class332.anInt6617, Class332.anInt6637, Class152.aString1629.toLowerCase().indexOf("arm") != -1);
		this.aClass464_Sub23_7895 = new Class464_Sub23(arg1, this);
		this.method3855(true, (byte) 56);
	}

	public Buffer method3861(int arg0) {
		try {
			Buffer var2 = new Buffer(40);
			var2.addByte(27, (byte) 35);
			var2.addByte(this.aClass464_Sub9_7899.method5766((byte) 1), (byte) 18);
			var2.addByte(this.aClass464_Sub21_7875.method5811(-1390004513), (byte) 109);
			var2.addByte(this.aClass464_Sub1_7886.method5731(1310210944), (byte) 78);
			var2.addByte(this.aClass464_Sub18_7877.method5801((byte) 7), (byte) 107);
			var2.addByte(this.aClass464_Sub19_7876.method5804((short) -18439), (byte) 5);
			var2.addByte(this.aClass464_Sub11_7879.method5778(-1856467020), (byte) 122);
			var2.addByte(this.aClass464_Sub3_7880.method5743((byte) 9), (byte) 47);
			var2.addByte(this.aClass464_Sub27_7881.method5833(16777215), (byte) 33);
			var2.addByte(this.aClass464_Sub6_7882.method5757(65535), (byte) 122);
			var2.addByte(this.aClass464_Sub4_7883.method5748(1567919007), (byte) 28);
			var2.addByte(this.aClass464_Sub2_7868.method5736((byte) 0), (byte) 96);
			var2.addByte(this.aClass464_Sub28_7885.method5837(1700842091), (byte) 94);
			var2.addByte(this.aClass464_Sub10_7873.method5772(494694394), (byte) 86);
			var2.addByte(this.aClass464_Sub12_7906.method5784(-2036681481), (byte) 109);
			var2.addByte(this.aClass464_Sub20_7888.method5807((byte) 50), (byte) 108);
			var2.addByte(this.aClass464_Sub5_7890.method5754(-2013751530), (byte) 26);
			var2.addByte(this.aClass464_Sub7_7891.method5760((byte) 111), (byte) 18);
			var2.addByte(this.aClass464_Sub22_7892.method5815((byte) -104), (byte) 22);
			var2.addByte(this.aClass464_Sub13_7893.method5787(1774077734), (byte) 68);
			var2.addByte(this.aClass464_Sub23_7908.method5819(1106075614), (byte) 67);
			var2.addByte(0, (byte) 108);
			var2.addByte(this.aClass464_Sub25_7896.method5827(502591542), (byte) 79);
			var2.addByte(this.aClass464_Sub8_7897.method5763(-420683085), (byte) 82);
			var2.addByte(this.aClass464_Sub29_7903.method5839((short) 255), (byte) 15);
			var2.addByte(this.aClass464_Sub16_7900.method5796(538619416), (byte) 101);
			var2.addByte(this.aClass464_Sub26_7901.method5830(746062603), (byte) 1);
			var2.addByte(this.aClass464_Sub15_7902.method5792(981226512), (byte) 122);
			var2.addByte(this.aClass464_Sub14_7884.method5790((short) -15457), (byte) 58);
			var2.addByte(this.aClass464_Sub24_7904.method5825((byte) -17), (byte) 58);
			var2.addByte(this.aClass464_Sub30_7894.method5841(-2064725696), (byte) 115);
			var2.addByte(this.aClass464_Sub30_7887.method5841(-2024097711), (byte) 79);
			var2.addByte(this.aClass464_Sub30_7907.method5841(-2062815109), (byte) 57);
			var2.addByte(this.aClass464_Sub30_7898.method5841(-1846771257), (byte) 123);
			var2.addByte(this.aClass464_Sub30_7909.method5841(-1864524826), (byte) 68);
			var2.addByte(this.aClass464_Sub17_7910.method5798((byte) -38), (byte) 57);
			return var2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "aeo.p(" + ')');
		}
	}
}
