package deob;

import java.awt.Canvas;

public class Class372 {

	public int anInt3872 = -1;

	public int anInt3873 = -1;

	public int anInt3890 = -1;

	public int anInt3876 = 0;

	public boolean aBoolean3883 = true;

	public boolean aBoolean3884 = false;

	public boolean aBoolean3885 = true;

	public String[] aStringArray3886 = new String[5];

	public int anInt3888 = -1;

	public int anInt3891 = -1;

	public int anInt3874 = -1;

	public int anInt3895 = -1;

	public int anInt3896 = -1;

	public int anInt3898 = Integer.MAX_VALUE;

	public int anInt3899 = Integer.MAX_VALUE;

	public int anInt3870 = Integer.MIN_VALUE;

	public int anInt3892 = Integer.MIN_VALUE;

	public int anInt3875 = -1;

	public int anInt3881 = -1;

	public int anInt3905 = -1;

	public boolean aBoolean3910 = true;

	public int anInt3911 = -1;

	public static int anInt3878 = 0;

	public static int anInt3879 = 1;

	public static int anInt3880 = 2;

	public int anInt3871;

	public int anInt3877;

	public int anInt3882;

	public int anInt3889;

	public int anInt3893;

	public int anInt3894;

	public int anInt3900;

	public int anInt3901;

	public int anInt3902;

	public int anInt3903;

	public int anInt3906;

	public Class380 aClass380_3904;

	public Class497 aClass497_3907;

	public String aString3887;

	public String aString3909;

	public byte[] aByteArray3912;

	public int[] anIntArray3897;

	public int[] anIntArray3908;

	public void method4323(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(2000564667);
				if (var3 == 0) {
					if (arg1 <= -127654579) {
					}
					return;
				}
				this.method4330(arg0, var3, (byte) -32);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pm.r(" + ')');
		}
	}

	public void method4324(byte arg0) {
		try {
			if (this.anIntArray3897 != null) {
				for (int var2 = 0; var2 < this.anIntArray3897.length; var2 += 2) {
					if (this.anIntArray3897[var2] < this.anInt3898) {
						this.anInt3898 = this.anIntArray3897[var2];
					} else if (this.anIntArray3897[var2] > this.anInt3870) {
						this.anInt3870 = this.anIntArray3897[var2];
					}
					if (this.anIntArray3897[var2 + 1] < this.anInt3899) {
						this.anInt3899 = this.anIntArray3897[var2 + 1];
					} else if (this.anIntArray3897[var2 + 1] > this.anInt3892) {
						this.anInt3892 = this.anIntArray3897[var2 + 1];
					}
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pm.i(" + ')');
		}
	}

	public Class61 method4325(Class_ra arg0, boolean arg1, int arg2) {
		try {
			int var4 = arg1 ? this.anInt3873 : this.anInt3872;
			int var5 = var4 | arg0.anInt4226 << 29;
			Class61 var6 = (Class61) this.aClass380_3904.aClass367_3956.get((long) var5);
			if (var6 != null) {
				return var6;
			} else if (this.aClass380_3904.aClass280_3955.method2750(var4, -2047380682)) {
				Class87 var7 = Class53.method643(this.aClass380_3904.aClass280_3955, var4, 0);
				if (var7 != null) {
					var6 = arg0.bw(var7, true);
					this.aClass380_3904.aClass367_3956.put(var6, (long) var5);
				}
				return var6;
			} else {
				return null;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "pm.o(" + ')');
		}
	}

	public Class61 method4326(Class_ra arg0, int arg1) {
		try {
			Class61 var3 = (Class61) this.aClass380_3904.aClass367_3956.get((long) (this.anInt3888 | 0x20000 | arg0.anInt4226 << 29));
			if (var3 != null) {
				return var3;
			}
			this.aClass380_3904.aClass280_3955.method2750(this.anInt3888, -120682835);
			Class87 var4 = Class53.method643(this.aClass380_3904.aClass280_3955, this.anInt3888, 0);
			if (var4 != null) {
				var3 = arg0.bw(var4, true);
				this.aClass380_3904.aClass367_3956.put(var3, (long) (this.anInt3888 | 0x20000 | arg0.anInt4226 << 29));
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pm.s(" + ')');
		}
	}

	public boolean method4327(Interface29 arg0, byte arg1) {
		try {
			int var3;
			if (this.anInt3874 == -1) {
				if (this.anInt3891 == -1) {
					return true;
				}
				var3 = arg0.method310(this.anInt3891, -206932563);
			} else {
				var3 = arg0.method306(this.anInt3874, 1619870058);
			}
			if (var3 < this.anInt3889 || var3 > this.anInt3906) {
				return false;
			}
			boolean var4 = false;
			int var5;
			if (this.anInt3896 == -1) {
				if (this.anInt3895 == -1) {
					return true;
				}
				var5 = arg0.method310(this.anInt3895, -698312864);
			} else {
				var5 = arg0.method306(this.anInt3896, 1337149542);
			}
			return var5 >= this.anInt3893 && var5 <= this.anInt3894;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pm.p(" + ')');
		}
	}

	public String method4328(int arg0, String arg1, short arg2) {
		try {
			if (this.aClass497_3907 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_3907.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pm.z(" + ')');
		}
	}

	public int method4329(int arg0, int arg1, byte arg2) {
		try {
			if (this.aClass497_3907 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_3907.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pm.f(" + ')');
		}
	}

	public void method4330(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.anInt3872 = arg0.readBigSmart(-577601803);
			} else if (arg1 == 2) {
				this.anInt3873 = arg0.readBigSmart(-1908790669);
			} else if (arg1 == 3) {
				this.aString3909 = arg0.readString(325970162);
			} else if (arg1 == 4) {
				this.anInt3903 = arg0.readUnsignedTriByte(-1401356047);
			} else if (arg1 == 5) {
				this.anInt3890 = arg0.readUnsignedTriByte(-1401356047);
			} else if (arg1 == 6) {
				this.anInt3876 = arg0.readUnsignedByte(2014080775);
			} else {
				int var4;
				if (arg1 == 7) {
					var4 = arg0.readUnsignedByte(2143527396);
					if ((var4 & 0x1) == 0) {
						this.aBoolean3883 = false;
					}
					if ((var4 & 0x2) == 2) {
						this.aBoolean3884 = true;
					}
				} else if (arg1 == 8) {
					this.aBoolean3885 = arg0.readUnsignedByte(907770993) == 1;
				} else if (arg1 == 9) {
					this.anInt3891 = arg0.readUnsignedShort(1342964642);
					if (this.anInt3891 == 65535) {
						this.anInt3891 = -1;
					}
					this.anInt3874 = arg0.readUnsignedShort(170515208);
					if (this.anInt3874 == 65535) {
						this.anInt3874 = -1;
					}
					this.anInt3889 = arg0.readInt((byte) 111);
					this.anInt3906 = arg0.readInt((byte) 22);
				} else if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray3886[arg1 - 10] = arg0.readString(82855978);
				} else {
					int var5;
					if (arg1 == 15) {
						var4 = arg0.readUnsignedByte(153164434);
						this.anIntArray3897 = new int[var4 * 2];
						for (var5 = 0; var5 < var4 * 2; var5++) {
							this.anIntArray3897[var5] = arg0.readShort(-1100583751);
						}
						this.anInt3900 = arg0.readInt((byte) 14);
						var5 = arg0.readUnsignedByte(2105735674);
						this.anIntArray3908 = new int[var5];
						int var6;
						for (var6 = 0; var6 < this.anIntArray3908.length; var6++) {
							this.anIntArray3908[var6] = arg0.readInt((byte) 43);
						}
						this.aByteArray3912 = new byte[var4];
						for (var6 = 0; var6 < var4; var6++) {
							this.aByteArray3912[var6] = arg0.readByte((byte) 77);
						}
					} else if (arg1 == 16) {
						this.aBoolean3910 = false;
					} else if (arg1 == 17) {
						this.aString3887 = arg0.readString(502067190);
					} else if (arg1 == 18) {
						this.anInt3888 = arg0.readBigSmart(-569831587);
					} else if (arg1 == 19) {
						this.anInt3911 = arg0.readUnsignedShort(140069511);
					} else if (arg1 == 20) {
						this.anInt3895 = arg0.readUnsignedShort(180131240);
						if (this.anInt3895 == 65535) {
							this.anInt3895 = -1;
						}
						this.anInt3896 = arg0.readUnsignedShort(629494147);
						if (this.anInt3896 == 65535) {
							this.anInt3896 = -1;
						}
						this.anInt3893 = arg0.readInt((byte) 19);
						this.anInt3894 = arg0.readInt((byte) 123);
					} else if (arg1 == 21) {
						this.anInt3882 = arg0.readInt((byte) 44);
					} else if (arg1 == 22) {
						this.anInt3902 = arg0.readInt((byte) 59);
					} else if (arg1 == 23) {
						this.anInt3875 = arg0.readUnsignedByte(625213365);
						this.anInt3881 = arg0.readUnsignedByte(1729049609);
						this.anInt3905 = arg0.readUnsignedByte(1156429839);
					} else if (arg1 == 24) {
						this.anInt3901 = arg0.readShort(-1100583751);
						this.anInt3877 = arg0.readShort(-1100583751);
					} else if (arg1 == 249) {
						var4 = arg0.readUnsignedByte(333318408);
						if (this.aClass497_3907 == null) {
							var5 = Class136.method1594(var4, 1578674157);
							this.aClass497_3907 = new Class497(var5);
						}
						for (var5 = 0; var5 < var4; var5++) {
							boolean var10 = arg0.readUnsignedByte(1846155766) == 1;
							int var7 = arg0.readUnsignedTriByte(-1401356047);
							Class330 var8;
							if (var10) {
								var8 = new Class330_Sub35(arg0.readString(811077390));
							} else {
								var8 = new Class330_Sub23(arg0.readInt((byte) 33));
							}
							this.aClass497_3907.method6097(var8, (long) var7);
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "pm.j(" + ')');
		}
	}

	public static final void method4331(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4394[arg0.anInt4397];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = ((NPC) arg0.aClass432_Sub1_Sub1_Sub1_4396).aClass67_10260.method792(var2, (byte) -12);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pm.aw(" + ')');
		}
	}

	public static final void method4332(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 509679726);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, true, 1, arg0, (byte) 36);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pm.hx(" + ')');
		}
	}

	public static final void method4333(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class330_Sub36_Sub9 var4 = Class370.aClass268_6770.method2659(var2, 1405861724);
			int var5 = var4.anIntArray9684[var3];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pm.acu(" + ')');
		}
	}

	public static final void method4334(Class430 arg0, byte arg1) {
		try {
			Class401_Sub1.aClass145_Sub1_8249.method1686(-865924631);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pm.aiy(" + ')');
		}
	}

	public static int method4335(byte arg0) {
		try {
			Canvas var1 = new Canvas();
			var1.setSize(100, 100);
			Class_ra var2 = Class95_Sub22.method1173(0, var1, null, null, 0, -1927888963);
			long var3 = Class312.method3111((byte) 5);
			int var5;
			for (var5 = 0; var5 < 10000; var5++) {
				var2.bk(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
			}
			var5 = (int) (Class312.method3111((byte) 72) - var3);
			var2.method4789(0, 0, 100, 100, -16777216, 463754225);
			var2.method4781(628001038);
			return var5;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "pm.j(" + ')');
		}
	}
}
