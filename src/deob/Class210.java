package deob;

public class Class210 {

	public static int anInt1987 = 1;

	public static int anInt1988 = 2;

	public static Class367 aClass367_1994 = new Class367(64);

	public static int anInt2020 = -1;

	public static int anInt2046 = 0;

	public int anInt1997 = 0;

	public int anInt1999 = -1;

	public int anInt2014 = 100;

	public int anInt2024 = -1;

	public int anInt2004 = 100;

	public boolean aBoolean2007 = true;

	public int anInt2009 = 100;

	public int anInt2010 = 100;

	public int anInt2005 = -1;

	public int anInt2021 = -2;

	public int anInt2053 = -2;

	public int anInt2048 = 0;

	public boolean aBoolean2006 = true;

	public boolean aBoolean2025 = true;

	public int anInt2028 = -1;

	public int anInt2027 = -1;

	public int anInt1990 = 0;

	public boolean aBoolean2029 = true;

	public int anInt2030 = -1;

	public boolean aBoolean2031 = false;

	public boolean aBoolean2032 = true;

	public boolean aBoolean2026 = false;

	public boolean aBoolean2034 = true;

	public boolean aBoolean2035 = false;

	public int anInt1986;

	public int anInt1989;

	public int anInt1992;

	public int anInt1995;

	public int anInt1996;

	public int anInt1998;

	public int anInt2000;

	public int anInt2001;

	public int anInt2002;

	public int anInt2008;

	public int anInt2011;

	public int anInt2012;

	public int anInt2013;

	public int anInt2015;

	public int anInt2022;

	public int anInt2023;

	public int anInt2036;

	public int anInt2037;

	public int anInt2038;

	public int anInt2040;

	public int anInt2041;

	public int anInt2042;

	public int anInt2043;

	public int anInt2044;

	public int anInt2045;

	public int anInt2047;

	public int anInt2049;

	public int anInt2050;

	public int anInt2051;

	public int anInt2052;

	public int anInt2054;

	public int anInt2055;

	public int anInt2056;

	public int anInt2057;

	public static IndexTable aClass280_2033;

	public short aShort1991;

	public short aShort1993;

	public short aShort2003;

	public short aShort2039;

	public int[] anIntArray2016;

	public int[] anIntArray2017;

	public int[] anIntArray2018;

	public int[] anIntArray2019;

	public void method2212(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-233245665);
				if (var3 == 0) {
					if (arg1 == 10) {
					}
					return;
				}
				this.method2214(arg0, var3, (byte) 0);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iv.i(" + ')');
		}
	}

	public void method2213(int arg0) {
		try {
			if (this.anInt2021 > -2 || this.anInt2053 > -2) {
				this.aBoolean2035 = true;
			}
			this.anInt2036 = this.anInt2000 >> 16 & 0xFF;
			this.anInt2037 = this.anInt2008 >> 16 & 0xFF;
			this.anInt2038 = this.anInt2037 - this.anInt2036;
			this.anInt2047 = this.anInt2000 >> 8 & 0xFF;
			this.anInt2040 = this.anInt2008 >> 8 & 0xFF;
			this.anInt2012 = this.anInt2040 - this.anInt2047;
			this.anInt2011 = this.anInt2000 & 0xFF;
			this.anInt2043 = this.anInt2008 & 0xFF;
			this.anInt1992 = this.anInt2043 - this.anInt2011;
			this.anInt2045 = this.anInt2000 >> 24 & 0xFF;
			this.anInt2041 = this.anInt2008 >> 24 & 0xFF;
			this.anInt2049 = this.anInt2041 - this.anInt2045;
			if (this.anInt2044 != 0) {
				this.anInt2022 = this.anInt2013 * this.anInt2009 / 100;
				this.anInt2023 = this.anInt2010 * this.anInt2013 / 100;
				if (this.anInt2022 == 0) {
					this.anInt2022 = 1;
				}
				this.anInt2042 = ((this.anInt2044 >> 16 & 0xFF) - (this.anInt2038 / 2 + this.anInt2036) << 8) / this.anInt2022;
				this.anInt2051 = ((this.anInt2044 >> 8 & 0xFF) - (this.anInt2047 + this.anInt2012 / 2) << 8) / this.anInt2022;
				this.anInt2052 = ((this.anInt2044 & 0xFF) - (this.anInt1992 / 2 + this.anInt2011) << 8) / this.anInt2022;
				if (this.anInt2023 == 0) {
					this.anInt2023 = 1;
				}
				this.anInt1989 = ((this.anInt2044 >> 24 & 0xFF) - (this.anInt2049 / 2 + this.anInt2045) << 8) / this.anInt2023;
				this.anInt2042 += this.anInt2042 > 0 ? -4 : 4;
				this.anInt2051 += this.anInt2051 > 0 ? -4 : 4;
				this.anInt2052 += this.anInt2052 > 0 ? -4 : 4;
				this.anInt1989 += this.anInt1989 > 0 ? -4 : 4;
			}
			if (this.anInt1999 != -1) {
				this.anInt2054 = this.anInt2014 * this.anInt2013 / 100;
				if (this.anInt2054 == 0) {
					this.anInt2054 = 1;
				}
				this.anInt2055 = (this.anInt1999 - (this.anInt1995 + (this.anInt1996 - this.anInt1995) / 2)) / this.anInt2054;
			}
			if (this.anInt2024 != -1) {
				this.anInt2056 = this.anInt2004 * this.anInt2013 / 100;
				if (this.anInt2056 == 0) {
					this.anInt2056 = 1;
				}
				this.anInt2057 = (this.anInt2024 - (this.anInt1986 + (this.anInt2002 - this.anInt1986) / 2)) / this.anInt2056;
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "iv.o(" + ')');
		}
	}

	public void method2214(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.aShort1991 = (short) arg0.readUnsignedShort(393393282);
				this.aShort2003 = (short) arg0.readUnsignedShort(1369761756);
				this.aShort1993 = (short) arg0.readUnsignedShort(1838960566);
				this.aShort2039 = (short) arg0.readUnsignedShort(-196700195);
				byte var4 = 3;
				this.aShort1991 = (short) (this.aShort1991 << var4);
				this.aShort2003 = (short) (this.aShort2003 << var4);
				this.aShort1993 = (short) (this.aShort1993 << var4);
				this.aShort2039 = (short) (this.aShort2039 << var4);
			} else if (arg1 == 2) {
				arg0.readUnsignedByte(-249261642);
			} else if (arg1 == 3) {
				this.anInt1995 = arg0.readInt((byte) 109);
				this.anInt1996 = arg0.readInt((byte) 47);
			} else if (arg1 == 4) {
				this.anInt1997 = arg0.readUnsignedByte(889413190);
				this.anInt1998 = arg0.readByte((byte) -2);
			} else if (arg1 == 5) {
				this.anInt1986 = this.anInt2002 = arg0.readUnsignedShort(33522798) << 12 << 2;
			} else if (arg1 == 6) {
				this.anInt2000 = arg0.readInt((byte) 57);
				this.anInt2008 = arg0.readInt((byte) 109);
			} else if (arg1 == 7) {
				this.anInt2001 = arg0.readUnsignedShort(1144631034);
				this.anInt2013 = arg0.readUnsignedShort(1791693889);
			} else if (arg1 == 8) {
				this.anInt2050 = arg0.readUnsignedShort(659185960);
				this.anInt2015 = arg0.readUnsignedShort(430289528);
			} else {
				int var5;
				int var7;
				if (arg1 == 9) {
					var7 = arg0.readUnsignedByte(1231066002);
					this.anIntArray2016 = new int[var7];
					for (var5 = 0; var5 < var7; var5++) {
						this.anIntArray2016[var5] = arg0.readUnsignedShort(107660807);
					}
				} else if (arg1 == 10) {
					var7 = arg0.readUnsignedByte(1848287702);
					this.anIntArray2018 = new int[var7];
					for (var5 = 0; var5 < var7; var5++) {
						this.anIntArray2018[var5] = arg0.readUnsignedShort(-219137727);
					}
				} else if (arg1 == 12) {
					this.anInt2021 = arg0.readByte((byte) 78);
				} else if (arg1 == 13) {
					this.anInt2053 = arg0.readByte((byte) -42);
				} else if (arg1 == 14) {
					this.anInt2048 = arg0.readUnsignedShort(1632445672);
				} else if (arg1 == 15) {
					this.anInt2005 = arg0.readUnsignedShort(1785697819);
				} else if (arg1 == 16) {
					this.aBoolean2006 = arg0.readUnsignedByte(1253025856) == 1;
					this.anInt2028 = arg0.readUnsignedShort(-172047309);
					this.anInt2027 = arg0.readUnsignedShort(-411759954);
					this.aBoolean2025 = arg0.readUnsignedByte(1177842794) == 1;
				} else if (arg1 == 17) {
					this.anInt2030 = arg0.readUnsignedShort(771130293);
				} else if (arg1 == 18) {
					this.anInt2044 = arg0.readInt((byte) 20);
				} else if (arg1 == 19) {
					this.anInt1990 = arg0.readUnsignedByte(222531378);
				} else if (arg1 == 20) {
					this.anInt2009 = arg0.readUnsignedByte(1976085391);
				} else if (arg1 == 21) {
					this.anInt2010 = arg0.readUnsignedByte(2005243276);
				} else if (arg1 == 22) {
					this.anInt1999 = arg0.readInt((byte) 96);
				} else if (arg1 == 23) {
					this.anInt2014 = arg0.readUnsignedByte(1000891754);
				} else if (arg1 == 24) {
					this.aBoolean2007 = false;
				} else if (arg1 == 25) {
					var7 = arg0.readUnsignedByte(33966842);
					this.anIntArray2017 = new int[var7];
					for (var5 = 0; var5 < var7; var5++) {
						this.anIntArray2017[var5] = arg0.readUnsignedShort(946867597);
					}
				} else if (arg1 == 26) {
					this.aBoolean2029 = false;
				} else if (arg1 == 27) {
					this.anInt2024 = arg0.readUnsignedShort(-262799191) << 12 << 2;
				} else if (arg1 == 28) {
					this.anInt2004 = arg0.readUnsignedByte(1677182516);
				} else if (arg1 == 29) {
					arg0.readShort(-1100583751);
				} else if (arg1 == 30) {
					this.aBoolean2031 = true;
				} else if (arg1 == 31) {
					this.anInt1986 = arg0.readUnsignedShort(1625032309) << 12 << 2;
					this.anInt2002 = arg0.readUnsignedShort(698737260) << 12 << 2;
				} else if (arg1 == 32) {
					this.aBoolean2032 = false;
				} else if (arg1 == 33) {
					this.aBoolean2026 = true;
				} else if (arg1 == 34) {
					this.aBoolean2034 = false;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "iv.p(" + ')');
		}
	}

	public static final void method2215(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9201;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iv.vd(" + ')');
		}
	}

	public static void method2216(boolean arg0, int arg1) {
		try {
			if (arg0) {
				if (client.windowPaneId != -1) {
					Class308.method3091(client.windowPaneId, (byte) -16);
				}
				for (Class330_Sub48 var2 = (Class330_Sub48) client.aClass497_9284.method6099((byte) -17); var2 != null; var2 = (Class330_Sub48) client.aClass497_9284.method6098((short) -32768)) {
					if (!var2.method3251(122249317)) {
						var2 = (Class330_Sub48) client.aClass497_9284.method6099((byte) -58);
						if (var2 == null) {
							if (arg1 != 629730926) {
								throw new IllegalStateException();
							}
							break;
						}
					}
					Class75.method854(var2, true, false, 270242430);
				}
				client.windowPaneId = -1;
				client.aClass497_9284 = new Class497(8);
				Class470.method5865(16711680);
				client.windowPaneId = Class396.aClass417_4108.anInt4272;
				Class476.method5960(false, (short) 24068);
				Class464.method5726(-1555219229);
				Class460.method5692(client.windowPaneId, null, -1595734528);
			}
			Class106.method1320(1863638050);
			Class360.lobby = false;
			Class64.method777(-1293378275);
			client.anInt9147 = -1;
			Class373.method4339(client.anInt9215, (byte) -110);
			Class263_Sub2.myPlayer = new Player(null);
			Class263_Sub2.myPlayer.method5348((float) (client.aClass304_9030.method2990(-1888871881) * 512 / 2), 0.0F, (float) (client.aClass304_9030.method3033((byte) 10) * 512 / 2));
			Class263_Sub2.myPlayer.anIntArray10018[0] = client.aClass304_9030.method2990(-712030960) / 2;
			Class263_Sub2.myPlayer.anIntArray10059[0] = client.aClass304_9030.method3033((byte) -73) / 2;
			Class325_Sub3.anInt7484 = 0;
			Class471.anInt5612 = 0;
			if (Class147.anInt1621 == 3) {
				Class471.anInt5612 = Class204_Sub1.anInt8947 << 9;
				Class325_Sub3.anInt7484 = Class151.anInt6671 << 9;
			} else {
				Class353.method4078((byte) 51);
			}
			client.aClass304_9030.method3008(235582746).method4582(-1698016131);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iv.fl(" + ')');
		}
	}

	public static void method2217(int arg0) {
		try {
			if (Class360.anInt3769 == 103) {
				Class360.anInt3769 = 115;
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "iv.f(" + ')');
		}
	}

	public static final void method2218(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub48 var3 = (Class330_Sub48) client.aClass497_9284.method6094((long) var2);
			if (var3 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "iv.sj(" + ')');
		}
	}

	public static final void method2219(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9121;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "iv.vk(" + ')');
		}
	}

	public static int method2220(Buffer arg0, String arg1, int arg2) {
		try {
			int var3 = arg0.offset;
			byte[] var4 = Class132.method1567(arg1, -1433749028);
			arg0.method3752(var4.length, -2129086126);
			arg0.offset += Class142.aClass143_1567.method1658(var4, 0, var4.length, arg0.payload, arg0.offset, -1731548060);
			return arg0.offset - var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "iv.j(" + ')');
		}
	}
}
