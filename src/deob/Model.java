package deob;

public class Model {

	public int anInt881 = 12;

	public int anInt897 = 0;

	public int anInt874 = 0;

	public int anInt904 = 0;

	public byte aByte891 = 0;

	public int anInt882 = 0;

	public Class93[] aClass93Array878;

	public Class64[] aClass64Array893;

	public Class94[] aClass94Array908;

	public byte[] aByteArray884;

	public byte[] aByteArray885;

	public byte[] aByteArray876;

	public byte[] aByteArray887;

	public short[] aShortArray896;

	public int[] anIntArray890;

	public int[] anIntArray875;

	public int[] anIntArray889;

	public int[] anIntArray877;

	public int[] anIntArray880;

	public short[] aShortArray879;

	public short[] aShortArray888;

	public short[] aShortArray907;

	public short[] aShortArray883;

	public short[] aShortArray873;

	public short[] aShortArray892;

	public byte[] aByteArray894;

	public short[] aShortArray895;

	public short[] aShortArray903;

	public short[] aShortArray886;

	public int[] anIntArray898;

	public int[] anIntArray899;

	public int[] anIntArray900;

	public byte[] aByteArray906;

	public byte[] aByteArray905;

	public int[] anIntArray901;

	public int[] anIntArray902;

	public int[] anIntArray872;

	public Model(byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1201(arg0);
		} else {
			this.method1199(arg0);
		}
	}

	public Model(Model[] arg0, int arg1) {
		this.anInt897 = 0;
		this.anInt904 = 0;
		this.anInt882 = 0;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		this.aByte891 = -1;
		int var12;
		for (var12 = 0; var12 < arg1; var12++) {
			Model var13 = arg0[var12];
			if (var13 != null) {
				this.anInt897 += var13.anInt897;
				this.anInt904 += var13.anInt904;
				this.anInt882 += var13.anInt882;
				if (var13.aClass93Array878 != null) {
					var3 += var13.aClass93Array878.length;
				}
				if (var13.aClass64Array893 != null) {
					var4 += var13.aClass64Array893.length;
				}
				if (var13.aClass94Array908 != null) {
					var5 += var13.aClass94Array908.length;
				}
				var6 |= var13.aByteArray884 != null;
				if (var13.aByteArray885 == null) {
					if (this.aByte891 == -1) {
						this.aByte891 = var13.aByte891;
					}
					if (this.aByte891 != var13.aByte891) {
						var7 = true;
					}
				} else {
					var7 = true;
				}
				var8 |= var13.aByteArray876 != null;
				var9 |= var13.aByteArray887 != null;
				var10 |= var13.aShortArray896 != null;
				var11 |= var13.anIntArray890 != null;
			}
		}
		this.anIntArray875 = new int[this.anInt897];
		this.anIntArray889 = new int[this.anInt897];
		this.anIntArray877 = new int[this.anInt897];
		this.anIntArray880 = new int[this.anInt897];
		this.aShortArray879 = new short[this.anInt897];
		this.aShortArray888 = new short[this.anInt904];
		this.aShortArray907 = new short[this.anInt904];
		this.aShortArray883 = new short[this.anInt904];
		if (var6) {
			this.aByteArray884 = new byte[this.anInt904];
		}
		if (var7) {
			this.aByteArray885 = new byte[this.anInt904];
		}
		if (var8) {
			this.aByteArray876 = new byte[this.anInt904];
		}
		if (var9) {
			this.aByteArray887 = new byte[this.anInt904];
		}
		this.aShortArray873 = new short[this.anInt904];
		if (var10) {
			this.aShortArray896 = new short[this.anInt904];
		}
		if (var11) {
			this.anIntArray890 = new int[this.anInt904];
		}
		this.aShortArray892 = new short[this.anInt904];
		if (this.anInt882 > 0) {
			this.aByteArray894 = new byte[this.anInt882];
			this.aShortArray895 = new short[this.anInt882];
			this.aShortArray903 = new short[this.anInt882];
			this.aShortArray886 = new short[this.anInt882];
			this.anIntArray898 = new int[this.anInt882];
			this.anIntArray899 = new int[this.anInt882];
			this.anIntArray900 = new int[this.anInt882];
			this.aByteArray906 = new byte[this.anInt882];
			this.aByteArray905 = new byte[this.anInt882];
			this.anIntArray901 = new int[this.anInt882];
			this.anIntArray902 = new int[this.anInt882];
			this.anIntArray872 = new int[this.anInt882];
		}
		if (var5 > 0) {
			this.aClass94Array908 = new Class94[var5];
		}
		if (var3 > 0) {
			this.aClass93Array878 = new Class93[var3];
		}
		if (var4 > 0) {
			this.aClass64Array893 = new Class64[var4];
		}
		this.anInt897 = 0;
		this.anInt904 = 0;
		this.anInt882 = 0;
		var3 = 0;
		var4 = 0;
		var5 = 0;
		int var22;
		for (var12 = 0; var12 < arg1; var12++) {
			short var19 = (short) (0x1 << var12);
			Model var14 = arg0[var12];
			if (var14 != null) {
				int var15;
				if (var14.aClass94Array908 != null) {
					for (var15 = 0; var15 < var14.aClass94Array908.length; var15++) {
						Class94 var16 = var14.aClass94Array908[var15];
						this.aClass94Array908[var5++] = var16.method1090(var16.anInt848 + this.anInt904, (byte) 64);
					}
				}
				for (var15 = 0; var15 < var14.anInt904; var15++) {
					if (var6 && var14.aByteArray884 != null) {
						this.aByteArray884[this.anInt904] = var14.aByteArray884[var15];
					}
					if (var7) {
						if (var14.aByteArray885 == null) {
							this.aByteArray885[this.anInt904] = var14.aByte891;
						} else {
							this.aByteArray885[this.anInt904] = var14.aByteArray885[var15];
						}
					}
					if (var8 && var14.aByteArray876 != null) {
						this.aByteArray876[this.anInt904] = var14.aByteArray876[var15];
					}
					if (var10) {
						if (var14.aShortArray896 == null) {
							this.aShortArray896[this.anInt904] = -1;
						} else {
							this.aShortArray896[this.anInt904] = var14.aShortArray896[var15];
						}
					}
					if (var11) {
						if (var14.anIntArray890 == null) {
							this.anIntArray890[this.anInt904] = -1;
						} else {
							this.anIntArray890[this.anInt904] = var14.anIntArray890[var15];
						}
					}
					this.aShortArray888[this.anInt904] = (short) this.method1186(var14, var14.aShortArray888[var15], var19);
					this.aShortArray907[this.anInt904] = (short) this.method1186(var14, var14.aShortArray907[var15], var19);
					this.aShortArray883[this.anInt904] = (short) this.method1186(var14, var14.aShortArray883[var15], var19);
					this.aShortArray892[this.anInt904] = var19;
					this.aShortArray873[this.anInt904] = var14.aShortArray873[var15];
					this.anInt904++;
				}
				if (var14.aClass93Array878 != null) {
					for (var15 = 0; var15 < var14.aClass93Array878.length; var15++) {
						var22 = this.method1186(var14, var14.aClass93Array878[var15].anInt841, var19);
						int var17 = this.method1186(var14, var14.aClass93Array878[var15].anInt835, var19);
						int var18 = this.method1186(var14, var14.aClass93Array878[var15].anInt836, var19);
						this.aClass93Array878[var3] = var14.aClass93Array878[var15].method1086(var22, var17, var18, -684124160);
						var3++;
					}
				}
				if (var14.aClass64Array893 != null) {
					for (var15 = 0; var15 < var14.aClass64Array893.length; var15++) {
						var22 = this.method1186(var14, var14.aClass64Array893[var15].anInt566, var19);
						this.aClass64Array893[var4] = var14.aClass64Array893[var15].method772(var22, 2139208707);
						var4++;
					}
				}
			}
		}
		var12 = 0;
		this.anInt874 = this.anInt897;
		for (int var20 = 0; var20 < arg1; var20++) {
			short var21 = (short) (0x1 << var20);
			Model var24 = arg0[var20];
			if (var24 != null) {
				for (var22 = 0; var22 < var24.anInt904; var22++) {
					if (var9) {
						this.aByteArray887[var12++] = (byte) (var24.aByteArray887 == null || var24.aByteArray887[var22] == -1 ? -1 : var24.aByteArray887[var22] + this.anInt882);
					}
				}
				for (var22 = 0; var22 < var24.anInt882; var22++) {
					byte var23 = this.aByteArray894[this.anInt882] = var24.aByteArray894[var22];
					if (var23 == 0) {
						this.aShortArray895[this.anInt882] = (short) this.method1186(var24, var24.aShortArray895[var22], var21);
						this.aShortArray903[this.anInt882] = (short) this.method1186(var24, var24.aShortArray903[var22], var21);
						this.aShortArray886[this.anInt882] = (short) this.method1186(var24, var24.aShortArray886[var22], var21);
					}
					if (var23 >= 1 && var23 <= 3) {
						this.aShortArray895[this.anInt882] = var24.aShortArray895[var22];
						this.aShortArray903[this.anInt882] = var24.aShortArray903[var22];
						this.aShortArray886[this.anInt882] = var24.aShortArray886[var22];
						this.anIntArray898[this.anInt882] = var24.anIntArray898[var22];
						this.anIntArray899[this.anInt882] = var24.anIntArray899[var22];
						this.anIntArray900[this.anInt882] = var24.anIntArray900[var22];
						this.aByteArray906[this.anInt882] = var24.aByteArray906[var22];
						this.aByteArray905[this.anInt882] = var24.aByteArray905[var22];
						this.anIntArray901[this.anInt882] = var24.anIntArray901[var22];
					}
					if (var23 == 2) {
						this.anIntArray902[this.anInt882] = var24.anIntArray902[var22];
						this.anIntArray872[this.anInt882] = var24.anIntArray872[var22];
					}
					this.anInt882++;
				}
			}
		}
	}

	public Model(int arg0, int arg1, int arg2) {
		this.anIntArray875 = new int[arg0];
		this.anIntArray889 = new int[arg0];
		this.anIntArray877 = new int[arg0];
		this.anIntArray880 = new int[arg0];
		this.aShortArray888 = new short[arg1];
		this.aShortArray907 = new short[arg1];
		this.aShortArray883 = new short[arg1];
		this.aByteArray884 = new byte[arg1];
		this.aByteArray885 = new byte[arg1];
		this.aByteArray876 = new byte[arg1];
		this.aByteArray887 = new byte[arg1];
		this.aShortArray873 = new short[arg1];
		this.aShortArray896 = new short[arg1];
		this.anIntArray890 = new int[arg1];
		if (arg2 > 0) {
			this.aByteArray894 = new byte[arg2];
			this.aShortArray895 = new short[arg2];
			this.aShortArray903 = new short[arg2];
			this.aShortArray886 = new short[arg2];
			this.anIntArray898 = new int[arg2];
			this.anIntArray899 = new int[arg2];
			this.anIntArray900 = new int[arg2];
			this.aByteArray906 = new byte[arg2];
			this.aByteArray905 = new byte[arg2];
			this.anIntArray901 = new int[arg2];
			this.anIntArray902 = new int[arg2];
			this.anIntArray872 = new int[arg2];
		}
	}

	public void color(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.anInt904; var3++) {
			if (this.aShortArray873[var3] == arg0) {
				this.aShortArray873[var3] = arg1;
			}
		}
	}

	public final int method1186(Model arg0, int arg1, short arg2) {
		int var4 = arg0.anIntArray875[arg1];
		int var5 = arg0.anIntArray889[arg1];
		int var6 = arg0.anIntArray877[arg1];
		for (int var7 = 0; var7 < this.anInt897; var7++) {
			if (var4 == this.anIntArray875[var7] && var5 == this.anIntArray889[var7] && var6 == this.anIntArray877[var7]) {
				this.aShortArray879[var7] |= arg2;
				return var7;
			}
		}
		this.anIntArray875[this.anInt897] = var4;
		this.anIntArray889[this.anInt897] = var5;
		this.anIntArray877[this.anInt897] = var6;
		this.aShortArray879[this.anInt897] = arg2;
		this.anIntArray880[this.anInt897] = arg0.anIntArray880 == null ? -1 : arg0.anIntArray880[arg1];
		return this.anInt897++;
	}

	public void method1187(Buffer arg0, Buffer arg1) {
		short var3 = 0;
		short var4 = 0;
		short var5 = 0;
		short var6 = 0;
		for (int var7 = 0; var7 < this.anInt904; var7++) {
			int var8 = arg1.readUnsignedByte(2142376075);
			if (var8 == 1) {
				var3 = (short) (arg0.method3764((byte) -115) + var6);
				var4 = (short) (arg0.method3764((byte) -76) + var3);
				var5 = (short) (arg0.method3764((byte) -73) + var4);
				var6 = var5;
				this.aShortArray888[var7] = var3;
				this.aShortArray907[var7] = var4;
				this.aShortArray883[var7] = var5;
				if (var3 > this.anInt874) {
					this.anInt874 = var3;
				}
				if (var4 > this.anInt874) {
					this.anInt874 = var4;
				}
				if (var5 > this.anInt874) {
					this.anInt874 = var5;
				}
			}
			if (var8 == 2) {
				var4 = var5;
				var5 = (short) (arg0.method3764((byte) -83) + var6);
				var6 = var5;
				this.aShortArray888[var7] = var3;
				this.aShortArray907[var7] = var4;
				this.aShortArray883[var7] = var5;
				if (var5 > this.anInt874) {
					this.anInt874 = var5;
				}
			}
			if (var8 == 3) {
				var3 = var5;
				var5 = (short) (arg0.method3764((byte) -16) + var6);
				var6 = var5;
				this.aShortArray888[var7] = var3;
				this.aShortArray907[var7] = var4;
				this.aShortArray883[var7] = var5;
				if (var5 > this.anInt874) {
					this.anInt874 = var5;
				}
			}
			if (var8 == 4) {
				short var9 = var3;
				var3 = var4;
				var4 = var9;
				var5 = (short) (arg0.method3764((byte) -48) + var6);
				var6 = var5;
				this.aShortArray888[var7] = var3;
				this.aShortArray907[var7] = var9;
				this.aShortArray883[var7] = var5;
				if (var5 > this.anInt874) {
					this.anInt874 = var5;
				}
			}
		}
		this.anInt874++;
	}

	public void method1188(Buffer arg0, Buffer arg1, Buffer arg2, Buffer arg3, Buffer arg4, Buffer arg5) {
		for (int var7 = 0; var7 < this.anInt882; var7++) {
			int var8 = this.aByteArray894[var7] & 0xFF;
			if (var8 == 0) {
				this.aShortArray895[var7] = (short) arg0.readUnsignedShort(2106544161);
				this.aShortArray903[var7] = (short) arg0.readUnsignedShort(-98434463);
				this.aShortArray886[var7] = (short) arg0.readUnsignedShort(429046454);
			}
			if (var8 == 1) {
				this.aShortArray895[var7] = (short) arg1.readUnsignedShort(-330637354);
				this.aShortArray903[var7] = (short) arg1.readUnsignedShort(295679632);
				this.aShortArray886[var7] = (short) arg1.readUnsignedShort(-14545206);
				if (this.anInt881 < 15) {
					this.anIntArray898[var7] = arg2.readUnsignedShort(1084220173);
					if (this.anInt881 < 14) {
						this.anIntArray899[var7] = arg2.readUnsignedShort(776846546);
					} else {
						this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					}
					this.anIntArray900[var7] = arg2.readUnsignedShort(971335567);
				} else {
					this.anIntArray898[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray900[var7] = arg2.readUnsignedTriByte(-1401356047);
				}
				this.aByteArray906[var7] = arg3.readByte((byte) 46);
				this.aByteArray905[var7] = arg4.readByte((byte) -24);
				this.anIntArray901[var7] = arg5.readByte((byte) -17);
			}
			if (var8 == 2) {
				this.aShortArray895[var7] = (short) arg1.readUnsignedShort(428050357);
				this.aShortArray903[var7] = (short) arg1.readUnsignedShort(1687213687);
				this.aShortArray886[var7] = (short) arg1.readUnsignedShort(1276651407);
				if (this.anInt881 < 15) {
					this.anIntArray898[var7] = arg2.readUnsignedShort(1389677726);
					if (this.anInt881 < 14) {
						this.anIntArray899[var7] = arg2.readUnsignedShort(499537125);
					} else {
						this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					}
					this.anIntArray900[var7] = arg2.readUnsignedShort(1190376554);
				} else {
					this.anIntArray898[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray900[var7] = arg2.readUnsignedTriByte(-1401356047);
				}
				this.aByteArray906[var7] = arg3.readByte((byte) 44);
				this.aByteArray905[var7] = arg4.readByte((byte) -23);
				this.anIntArray901[var7] = arg5.readByte((byte) -33);
				this.anIntArray902[var7] = arg5.readByte((byte) -36);
				this.anIntArray872[var7] = arg5.readByte((byte) 1);
			}
			if (var8 == 3) {
				this.aShortArray895[var7] = (short) arg1.readUnsignedShort(-422482628);
				this.aShortArray903[var7] = (short) arg1.readUnsignedShort(104799886);
				this.aShortArray886[var7] = (short) arg1.readUnsignedShort(1829755323);
				if (this.anInt881 < 15) {
					this.anIntArray898[var7] = arg2.readUnsignedShort(1986860333);
					if (this.anInt881 < 14) {
						this.anIntArray899[var7] = arg2.readUnsignedShort(-160592019);
					} else {
						this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					}
					this.anIntArray900[var7] = arg2.readUnsignedShort(834700309);
				} else {
					this.anIntArray898[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray899[var7] = arg2.readUnsignedTriByte(-1401356047);
					this.anIntArray900[var7] = arg2.readUnsignedTriByte(-1401356047);
				}
				this.aByteArray906[var7] = arg3.readByte((byte) -47);
				this.aByteArray905[var7] = arg4.readByte((byte) 90);
				this.anIntArray901[var7] = arg5.readByte((byte) 59);
			}
		}
	}

	public int method1189(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt897; var4++) {
			if (this.anIntArray875[var4] == arg0 && this.anIntArray889[var4] == arg1 && this.anIntArray877[var4] == arg2) {
				return var4;
			}
		}
		this.anIntArray875[this.anInt897] = arg0;
		this.anIntArray889[this.anInt897] = arg1;
		this.anIntArray877[this.anInt897] = arg2;
		this.anInt874 = this.anInt897 + 1;
		return this.anInt897++;
	}

	public int method1190(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, byte arg6, short arg7) {
		this.aShortArray888[this.anInt904] = (short) arg0;
		this.aShortArray907[this.anInt904] = (short) arg1;
		this.aShortArray883[this.anInt904] = (short) arg2;
		this.aByteArray884[this.anInt904] = arg3;
		this.aByteArray887[this.anInt904] = arg4;
		this.aShortArray873[this.anInt904] = arg5;
		this.aByteArray876[this.anInt904] = arg6;
		this.aShortArray896[this.anInt904] = arg7;
		return this.anInt904++;
	}

	public byte method1191(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, byte arg7, byte arg8) {
		if (this.anInt882 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray894[this.anInt882] = 3;
		this.aShortArray895[this.anInt882] = arg0;
		this.aShortArray903[this.anInt882] = arg1;
		this.aShortArray886[this.anInt882] = arg2;
		this.anIntArray898[this.anInt882] = arg3;
		this.anIntArray899[this.anInt882] = arg4;
		this.anIntArray900[this.anInt882] = arg5;
		this.aByteArray906[this.anInt882] = arg6;
		this.aByteArray905[this.anInt882] = arg7;
		this.anIntArray901[this.anInt882] = arg8;
		return (byte) this.anInt882++;
	}

	public int[][] method1192() {
		int[] var1 = new int[256];
		int var2 = 0;
		int var4;
		for (int var3 = 0; var3 < this.anInt904; var3++) {
			var4 = this.anIntArray890[var3];
			if (var4 >= 0) {
				int var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
		}
		int[][] var6 = new int[var2 + 1][];
		for (var4 = 0; var4 <= var2; var4++) {
			var6[var4] = new int[var1[var4]];
			var1[var4] = 0;
		}
		for (var4 = 0; var4 < this.anInt904; var4++) {
			int var5 = this.anIntArray890[var4];
			if (var5 >= 0) {
				var6[var5][var1[var5]++] = var4;
			}
		}
		return var6;
	}

	public int[][] method1193() {
		int[] var1 = new int[256];
		int var2 = 0;
		int var4;
		for (int var3 = 0; var3 < this.aClass94Array908.length; var3++) {
			var4 = this.aClass94Array908[var3].anInt847;
			if (var4 >= 0) {
				int var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
		}
		int[][] var6 = new int[var2 + 1][];
		for (var4 = 0; var4 <= var2; var4++) {
			var6[var4] = new int[var1[var4]];
			var1[var4] = 0;
		}
		for (var4 = 0; var4 < this.aClass94Array908.length; var4++) {
			int var5 = this.aClass94Array908[var4].anInt847;
			if (var5 >= 0) {
				var6[var5][var1[var5]++] = var4;
			}
		}
		return var6;
	}

	public void method1194(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.anInt897; var4++) {
			this.anIntArray875[var4] += arg0;
			this.anIntArray889[var4] += arg1;
			this.anIntArray877[var4] += arg2;
		}
	}

	public void method1195(int arg0, int arg1, int arg2) {
		int var4;
		int var5;
		int var6;
		int var7;
		if (arg2 != 0) {
			var4 = Class257.anIntArray2683[arg2];
			var5 = Class257.anIntArray2684[arg2];
			for (var6 = 0; var6 < this.anInt897; var6++) {
				var7 = this.anIntArray889[var6] * var4 + this.anIntArray875[var6] * var5 >> 14;
				this.anIntArray889[var6] = this.anIntArray889[var6] * var5 - this.anIntArray875[var6] * var4 >> 14;
				this.anIntArray875[var6] = var7;
			}
		}
		if (arg0 != 0) {
			var4 = Class257.anIntArray2683[arg0];
			var5 = Class257.anIntArray2684[arg0];
			for (var6 = 0; var6 < this.anInt897; var6++) {
				var7 = this.anIntArray889[var6] * var5 - this.anIntArray877[var6] * var4 >> 14;
				this.anIntArray877[var6] = this.anIntArray889[var6] * var4 + this.anIntArray877[var6] * var5 >> 14;
				this.anIntArray889[var6] = var7;
			}
		}
		if (arg1 == 0) {
			return;
		}
		var4 = Class257.anIntArray2683[arg1];
		var5 = Class257.anIntArray2684[arg1];
		for (var6 = 0; var6 < this.anInt897; var6++) {
			var7 = this.anIntArray877[var6] * var4 + this.anIntArray875[var6] * var5 >> 14;
			this.anIntArray877[var6] = this.anIntArray877[var6] * var5 - this.anIntArray875[var6] * var4 >> 14;
			this.anIntArray875[var6] = var7;
		}
	}

	public void method1196(int arg0) {
		int var2;
		for (var2 = 0; var2 < this.anInt897; var2++) {
			this.anIntArray875[var2] <<= arg0;
			this.anIntArray889[var2] <<= arg0;
			this.anIntArray877[var2] <<= arg0;
		}
		if (this.anInt882 <= 0 || this.anIntArray898 == null) {
			return;
		}
		for (var2 = 0; var2 < this.anIntArray898.length; var2++) {
			this.anIntArray898[var2] <<= arg0;
			this.anIntArray899[var2] <<= arg0;
			if (this.aByteArray894[var2] != 1) {
				this.anIntArray900[var2] <<= arg0;
			}
		}
	}

	public int[][] method1197(boolean arg0) {
		int[] var2 = new int[256];
		int var3 = 0;
		int var4 = arg0 ? this.anInt897 : this.anInt874;
		int var6;
		for (int var5 = 0; var5 < var4; var5++) {
			var6 = this.anIntArray880[var5];
			if (var6 >= 0) {
				int var10002 = var2[var6]++;
				if (var6 > var3) {
					var3 = var6;
				}
			}
		}
		int[][] var8 = new int[var3 + 1][];
		for (var6 = 0; var6 <= var3; var6++) {
			var8[var6] = new int[var2[var6]];
			var2[var6] = 0;
		}
		for (var6 = 0; var6 < var4; var6++) {
			int var7 = this.anIntArray880[var6];
			if (var7 >= 0) {
				var8[var7][var2[var7]++] = var6;
			}
		}
		return var8;
	}

	public static Model loadModel(IndexTable arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : new Model(var3);
	}

	public void method1199(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		Buffer var4 = new Buffer(arg0);
		Buffer var5 = new Buffer(arg0);
		Buffer var6 = new Buffer(arg0);
		Buffer var7 = new Buffer(arg0);
		Buffer var8 = new Buffer(arg0);
		var4.offset = arg0.length - 18;
		this.anInt897 = var4.readUnsignedShort(-337614095);
		this.anInt904 = var4.readUnsignedShort(1788131083);
		this.anInt882 = var4.readUnsignedByte(-240992681);
		int var9 = var4.readUnsignedByte(1659643237);
		int var10 = var4.readUnsignedByte(1195480174);
		int var11 = var4.readUnsignedByte(2143275570);
		int var12 = var4.readUnsignedByte(382337706);
		int var13 = var4.readUnsignedByte(1216838880);
		int var14 = var4.readUnsignedShort(619517959);
		int var15 = var4.readUnsignedShort(2050039188);
		int var16 = var4.readUnsignedShort(1791197088);
		int var17 = var4.readUnsignedShort(2085935111);
		byte var18 = 0;
		int var42 = var18 + this.anInt897;
		int var20 = var42;
		var42 += this.anInt904;
		int var21 = var42;
		if (var10 == 255) {
			var42 += this.anInt904;
		}
		int var22 = var42;
		if (var12 == 1) {
			var42 += this.anInt904;
		}
		int var23 = var42;
		if (var9 == 1) {
			var42 += this.anInt904;
		}
		int var24 = var42;
		if (var13 == 1) {
			var42 += this.anInt897;
		}
		int var25 = var42;
		if (var11 == 1) {
			var42 += this.anInt904;
		}
		int var26 = var42;
		var42 += var17;
		int var27 = var42;
		var42 += this.anInt904 * 2;
		int var28 = var42;
		var42 += this.anInt882 * 6;
		int var29 = var42;
		var42 += var14;
		int var30 = var42;
		var42 += var15;
		int var10000 = var42 + var16;
		this.anIntArray875 = new int[this.anInt897];
		this.anIntArray889 = new int[this.anInt897];
		this.anIntArray877 = new int[this.anInt897];
		this.aShortArray888 = new short[this.anInt904];
		this.aShortArray907 = new short[this.anInt904];
		this.aShortArray883 = new short[this.anInt904];
		if (this.anInt882 > 0) {
			this.aByteArray894 = new byte[this.anInt882];
			this.aShortArray895 = new short[this.anInt882];
			this.aShortArray903 = new short[this.anInt882];
			this.aShortArray886 = new short[this.anInt882];
		}
		if (var13 == 1) {
			this.anIntArray880 = new int[this.anInt897];
		}
		if (var9 == 1) {
			this.aByteArray884 = new byte[this.anInt904];
			this.aByteArray887 = new byte[this.anInt904];
			this.aShortArray896 = new short[this.anInt904];
		}
		if (var10 == 255) {
			this.aByteArray885 = new byte[this.anInt904];
		} else {
			this.aByte891 = (byte) var10;
		}
		if (var11 == 1) {
			this.aByteArray876 = new byte[this.anInt904];
		}
		if (var12 == 1) {
			this.anIntArray890 = new int[this.anInt904];
		}
		this.aShortArray873 = new short[this.anInt904];
		var4.offset = var18;
		var5.offset = var29;
		var6.offset = var30;
		var7.offset = var42;
		var8.offset = var24;
		int var32 = 0;
		int var33 = 0;
		int var34 = 0;
		int var35;
		int var36;
		int var39;
		for (var35 = 0; var35 < this.anInt897; var35++) {
			var36 = var4.readUnsignedByte(1891310221);
			int var37 = 0;
			if ((var36 & 0x1) != 0) {
				var37 = var5.method3764((byte) -97);
			}
			int var38 = 0;
			if ((var36 & 0x2) != 0) {
				var38 = var6.method3764((byte) -44);
			}
			var39 = 0;
			if ((var36 & 0x4) != 0) {
				var39 = var7.method3764((byte) -39);
			}
			this.anIntArray875[var35] = var32 + var37;
			this.anIntArray889[var35] = var33 + var38;
			this.anIntArray877[var35] = var34 + var39;
			var32 = this.anIntArray875[var35];
			var33 = this.anIntArray889[var35];
			var34 = this.anIntArray877[var35];
			if (var13 == 1) {
				this.anIntArray880[var35] = var8.readUnsignedByte(-62972647);
			}
		}
		var4.offset = var27;
		var5.offset = var23;
		var6.offset = var21;
		var7.offset = var25;
		var8.offset = var22;
		for (var35 = 0; var35 < this.anInt904; var35++) {
			this.aShortArray873[var35] = (short) var4.readUnsignedShort(537620520);
			if (var9 == 1) {
				var36 = var5.readUnsignedByte(122249945);
				if ((var36 & 0x1) == 1) {
					this.aByteArray884[var35] = 1;
					var2 = true;
				} else {
					this.aByteArray884[var35] = 0;
				}
				if ((var36 & 0x2) == 2) {
					this.aByteArray887[var35] = (byte) (var36 >> 2);
					this.aShortArray896[var35] = this.aShortArray873[var35];
					this.aShortArray873[var35] = 127;
					if (this.aShortArray896[var35] != -1) {
						var3 = true;
					}
				} else {
					this.aByteArray887[var35] = -1;
					this.aShortArray896[var35] = -1;
				}
			}
			if (var10 == 255) {
				this.aByteArray885[var35] = var6.readByte((byte) -30);
			}
			if (var11 == 1) {
				this.aByteArray876[var35] = var7.readByte((byte) -18);
			}
			if (var12 == 1) {
				this.anIntArray890[var35] = var8.readUnsignedByte(1070293671);
			}
		}
		this.anInt874 = -1;
		var4.offset = var26;
		var5.offset = var20;
		short var43 = 0;
		short var44 = 0;
		short var45 = 0;
		short var46 = 0;
		int var40;
		for (var39 = 0; var39 < this.anInt904; var39++) {
			var40 = var5.readUnsignedByte(1930748222);
			if (var40 == 1) {
				var43 = (short) (var4.method3764((byte) -46) + var46);
				var44 = (short) (var4.method3764((byte) -15) + var43);
				var45 = (short) (var4.method3764((byte) -102) + var44);
				var46 = var45;
				this.aShortArray888[var39] = var43;
				this.aShortArray907[var39] = var44;
				this.aShortArray883[var39] = var45;
				if (var43 > this.anInt874) {
					this.anInt874 = var43;
				}
				if (var44 > this.anInt874) {
					this.anInt874 = var44;
				}
				if (var45 > this.anInt874) {
					this.anInt874 = var45;
				}
			}
			if (var40 == 2) {
				var44 = var45;
				var45 = (short) (var4.method3764((byte) -14) + var46);
				var46 = var45;
				this.aShortArray888[var39] = var43;
				this.aShortArray907[var39] = var44;
				this.aShortArray883[var39] = var45;
				if (var45 > this.anInt874) {
					this.anInt874 = var45;
				}
			}
			if (var40 == 3) {
				var43 = var45;
				var45 = (short) (var4.method3764((byte) -38) + var46);
				var46 = var45;
				this.aShortArray888[var39] = var43;
				this.aShortArray907[var39] = var44;
				this.aShortArray883[var39] = var45;
				if (var45 > this.anInt874) {
					this.anInt874 = var45;
				}
			}
			if (var40 == 4) {
				short var41 = var43;
				var43 = var44;
				var44 = var41;
				var45 = (short) (var4.method3764((byte) -94) + var46);
				var46 = var45;
				this.aShortArray888[var39] = var43;
				this.aShortArray907[var39] = var41;
				this.aShortArray883[var39] = var45;
				if (var45 > this.anInt874) {
					this.anInt874 = var45;
				}
			}
		}
		this.anInt874++;
		var4.offset = var28;
		for (var39 = 0; var39 < this.anInt882; var39++) {
			this.aByteArray894[var39] = 0;
			this.aShortArray895[var39] = (short) var4.readUnsignedShort(1466689221);
			this.aShortArray903[var39] = (short) var4.readUnsignedShort(780151818);
			this.aShortArray886[var39] = (short) var4.readUnsignedShort(1649548031);
		}
		if (this.aByteArray887 != null) {
			boolean var47 = false;
			for (var40 = 0; var40 < this.anInt904; var40++) {
				int var48 = this.aByteArray887[var40] & 0xFF;
				if (var48 != 255) {
					if ((this.aShortArray895[var48] & 0xFFFF) == this.aShortArray888[var40] && (this.aShortArray903[var48] & 0xFFFF) == this.aShortArray907[var40] && (this.aShortArray886[var48] & 0xFFFF) == this.aShortArray883[var40]) {
						this.aByteArray887[var40] = -1;
					} else {
						var47 = true;
					}
				}
			}
			if (!var47) {
				this.aByteArray887 = null;
			}
		}
		if (!var3) {
			this.aShortArray896 = null;
		}
		if (!var2) {
			this.aByteArray884 = null;
		}
	}

	public void method1200(short arg0, short arg1) {
		if (this.aShortArray896 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.anInt904; var3++) {
			if (this.aShortArray896[var3] == arg0) {
				this.aShortArray896[var3] = arg1;
			}
		}
	}

	public void method1201(byte[] arg0) {
		Buffer var2 = new Buffer(arg0);
		Buffer var3 = new Buffer(arg0);
		Buffer var4 = new Buffer(arg0);
		Buffer var5 = new Buffer(arg0);
		Buffer var6 = new Buffer(arg0);
		Buffer var7 = new Buffer(arg0);
		Buffer var8 = new Buffer(arg0);
		var2.offset = arg0.length - 23;
		this.anInt897 = var2.readUnsignedShort(433365965);
		this.anInt904 = var2.readUnsignedShort(683679571);
		this.anInt882 = var2.readUnsignedByte(1518668569);
		int var9 = var2.readUnsignedByte(-58139969);
		boolean var10 = (var9 & 0x1) == 1;
		boolean var11 = (var9 & 0x2) == 2;
		boolean var12 = (var9 & 0x4) == 4;
		boolean var13 = (var9 & 0x8) == 8;
		boolean var14 = (var9 & 0x10) == 16;
		boolean var15 = (var9 & 0x20) == 32;
		boolean var16 = (var9 & 0x40) == 64;
		if (var13) {
			var2.offset -= 7;
			this.anInt881 = var2.readUnsignedByte(1701980003);
			var2.offset += 6;
		}
		int var17 = var2.readUnsignedByte(-218576769);
		int var18 = var2.readUnsignedByte(528636776);
		int var19 = var2.readUnsignedByte(1774304611);
		int var20 = var2.readUnsignedByte(656147885);
		int var21 = var2.readUnsignedByte(2045781703);
		int var22 = var2.readUnsignedShort(1878929232);
		int var23 = var2.readUnsignedShort(-241264153);
		int var24 = var2.readUnsignedShort(1307321827);
		int var25 = var2.readUnsignedShort(1562826396);
		int var26 = var2.readUnsignedShort(24298905);
		int var27;
		if (var14) {
			var27 = var2.readUnsignedShort(-196376343);
		} else if (var21 == 1) {
			var27 = this.anInt897;
		} else {
			var27 = 0;
		}
		int var28;
		if (var15) {
			var28 = var2.readUnsignedShort(-51588720);
		} else if (var19 == 1) {
			var28 = this.anInt904;
		} else {
			var28 = 0;
		}
		int var29 = 0;
		int var30 = 0;
		int var31 = 0;
		int var32;
		if (this.anInt882 > 0) {
			this.aByteArray894 = new byte[this.anInt882];
			var2.offset = 0;
			for (var32 = 0; var32 < this.anInt882; var32++) {
				byte var33 = this.aByteArray894[var32] = var2.readByte((byte) -8);
				if (var33 == 0) {
					var29++;
				}
				if (var33 >= 1 && var33 <= 3) {
					var30++;
				}
				if (var33 == 2) {
					var31++;
				}
			}
		}
		var32 = this.anInt882;
		int var64 = var32;
		var32 += this.anInt897;
		int var34 = var32;
		if (var10) {
			var32 += this.anInt904;
		}
		int var35 = var32;
		var32 += this.anInt904;
		int var36 = var32;
		if (var17 == 255) {
			var32 += this.anInt904;
		}
		int var37 = var32;
		var32 += var28;
		int var38 = var32;
		var32 += var27;
		int var39 = var32;
		if (var18 == 1) {
			var32 += this.anInt904;
		}
		int var40 = var32;
		var32 += var25;
		int var41 = var32;
		if (var20 == 1) {
			var32 += this.anInt904 * 2;
		}
		int var42 = var32;
		var32 += var26;
		int var43 = var32;
		var32 += this.anInt904 * 2;
		int var44 = var32;
		var32 += var22;
		int var45 = var32;
		var32 += var23;
		int var46 = var32;
		var32 += var24;
		int var47 = var32;
		var32 += var29 * 6;
		int var48 = var32;
		var32 += var30 * 6;
		byte var49 = 6;
		if (this.anInt881 == 14) {
			var49 = 7;
		} else if (this.anInt881 >= 15) {
			var49 = 9;
		}
		int var50 = var32;
		var32 += var30 * var49;
		int var51 = var32;
		var32 += var30;
		int var52 = var32;
		var32 += var30;
		int var53 = var32;
		var32 += var30 + var31 * 2;
		this.anIntArray875 = new int[this.anInt897];
		this.anIntArray889 = new int[this.anInt897];
		this.anIntArray877 = new int[this.anInt897];
		this.aShortArray888 = new short[this.anInt904];
		this.aShortArray907 = new short[this.anInt904];
		this.aShortArray883 = new short[this.anInt904];
		if (var21 == 1) {
			this.anIntArray880 = new int[this.anInt897];
		}
		if (var10) {
			this.aByteArray884 = new byte[this.anInt904];
		}
		if (var17 == 255) {
			this.aByteArray885 = new byte[this.anInt904];
		} else {
			this.aByte891 = (byte) var17;
		}
		if (var18 == 1) {
			this.aByteArray876 = new byte[this.anInt904];
		}
		if (var19 == 1) {
			this.anIntArray890 = new int[this.anInt904];
		}
		if (var20 == 1) {
			this.aShortArray896 = new short[this.anInt904];
		}
		if (var20 == 1 && this.anInt882 > 0) {
			this.aByteArray887 = new byte[this.anInt904];
		}
		this.aShortArray873 = new short[this.anInt904];
		if (this.anInt882 > 0) {
			this.aShortArray895 = new short[this.anInt882];
			this.aShortArray903 = new short[this.anInt882];
			this.aShortArray886 = new short[this.anInt882];
			if (var30 > 0) {
				this.anIntArray898 = new int[var30];
				this.anIntArray899 = new int[var30];
				this.anIntArray900 = new int[var30];
				this.aByteArray906 = new byte[var30];
				this.aByteArray905 = new byte[var30];
				this.anIntArray901 = new int[var30];
			}
			if (var31 > 0) {
				this.anIntArray902 = new int[var31];
				this.anIntArray872 = new int[var31];
			}
		}
		var2.offset = var64;
		var3.offset = var44;
		var4.offset = var45;
		var5.offset = var46;
		var6.offset = var38;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58;
		int var59;
		int var60;
		int var61;
		int var62;
		for (var58 = 0; var58 < this.anInt897; var58++) {
			var59 = var2.readUnsignedByte(1734337503);
			var60 = 0;
			if ((var59 & 0x1) != 0) {
				var60 = var3.method3764((byte) -66);
			}
			var61 = 0;
			if ((var59 & 0x2) != 0) {
				var61 = var4.method3764((byte) -52);
			}
			var62 = 0;
			if ((var59 & 0x4) != 0) {
				var62 = var5.method3764((byte) -8);
			}
			this.anIntArray875[var58] = var55 + var60;
			this.anIntArray889[var58] = var56 + var61;
			this.anIntArray877[var58] = var57 + var62;
			var55 = this.anIntArray875[var58];
			var56 = this.anIntArray889[var58];
			var57 = this.anIntArray877[var58];
			if (var21 == 1) {
				if (var14) {
					this.anIntArray880[var58] = var6.method3766(576644875);
				} else {
					this.anIntArray880[var58] = var6.readUnsignedByte(1320610501);
					if (this.anIntArray880[var58] == 255) {
						this.anIntArray880[var58] = -1;
					}
				}
			}
		}
		var2.offset = var43;
		var3.offset = var34;
		var4.offset = var36;
		var5.offset = var39;
		var6.offset = var37;
		var7.offset = var41;
		var8.offset = var42;
		for (var58 = 0; var58 < this.anInt904; var58++) {
			this.aShortArray873[var58] = (short) var2.readUnsignedShort(-36958518);
			if (var10) {
				this.aByteArray884[var58] = var3.readByte((byte) 123);
			}
			if (var17 == 255) {
				this.aByteArray885[var58] = var4.readByte((byte) 8);
			}
			if (var18 == 1) {
				this.aByteArray876[var58] = var5.readByte((byte) 52);
			}
			if (var19 == 1) {
				if (var15) {
					this.anIntArray890[var58] = var6.method3766(758954019);
				} else {
					this.anIntArray890[var58] = var6.readUnsignedByte(-195197649);
					if (this.anIntArray890[var58] == 255) {
						this.anIntArray890[var58] = -1;
					}
				}
			}
			if (var20 == 1) {
				this.aShortArray896[var58] = (short) (var7.readUnsignedShort(-13191811) - 1);
			}
			if (this.aByteArray887 != null) {
				if (this.aShortArray896[var58] == -1) {
					this.aByteArray887[var58] = -1;
				} else {
					this.aByteArray887[var58] = (byte) (var8.readUnsignedByte(552329779) - 1);
				}
			}
		}
		this.anInt874 = -1;
		var2.offset = var40;
		var3.offset = var35;
		this.method1187(var2, var3);
		var2.offset = var47;
		var3.offset = var48;
		var4.offset = var50;
		var5.offset = var51;
		var6.offset = var52;
		var7.offset = var53;
		this.method1188(var2, var3, var4, var5, var6, var7);
		var2.offset = var32;
		if (var11) {
			var58 = var2.readUnsignedByte(-68733198);
			if (var58 > 0) {
				this.aClass93Array878 = new Class93[var58];
				for (var59 = 0; var59 < var58; var59++) {
					var60 = var2.readUnsignedShort(1788677630);
					var61 = var2.readUnsignedShort(2109892113);
					byte var65;
					if (var17 == 255) {
						var65 = this.aByteArray885[var61];
					} else {
						var65 = (byte) var17;
					}
					this.aClass93Array878[var59] = new Class93(var60, this.aShortArray888[var61], this.aShortArray907[var61], this.aShortArray883[var61], var65);
				}
			}
			var59 = var2.readUnsignedByte(76580719);
			if (var59 > 0) {
				this.aClass64Array893 = new Class64[var59];
				for (var60 = 0; var60 < var59; var60++) {
					var61 = var2.readUnsignedShort(1700881713);
					var62 = var2.readUnsignedShort(717017163);
					this.aClass64Array893[var60] = new Class64(var61, var62);
				}
			}
		}
		if (!var12) {
			return;
		}
		var58 = var2.readUnsignedByte(1064194340);
		if (var58 <= 0) {
			return;
		}
		this.aClass94Array908 = new Class94[var58];
		for (var59 = 0; var59 < var58; var59++) {
			var60 = var2.readUnsignedShort(-31369305);
			var61 = var2.readUnsignedShort(1832190582);
			if (var16) {
				var62 = var2.method3766(-73764939);
			} else {
				var62 = var2.readUnsignedByte(-258315802);
				if (var62 == 255) {
					var62 = -1;
				}
			}
			byte var63 = var2.readByte((byte) -18);
			this.aClass94Array908[var59] = new Class94(var60, var61, var62, var63);
		}
	}
}
