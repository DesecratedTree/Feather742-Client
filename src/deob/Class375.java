package deob;

public class Class375 {

	public static int anInt3913 = 70;

	public static int anInt3914 = -1;

	public static int anInt3915 = 0;

	public static int anInt3917 = 1;

	public static int anInt3918 = 1;

	public boolean aBoolean3919 = false;

	public int anInt3920 = -1;

	public int anInt3921 = 16777215;

	public int anInt3922 = 70;

	public int anInt3926 = -1;

	public int anInt3924 = -1;

	public int anInt3932 = -1;

	public int anInt3927 = -1;

	public int anInt3923 = 0;

	public int anInt3925 = 0;

	public int anInt3929 = -1;

	public String aString3930 = "";

	public int anInt3931 = -1;

	public int anInt3916 = 0;

	public static Class330_Sub51 aClass330_Sub51_3933;

	public Class368 aClass368_3928;

	public void method4346(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1703899005);
				if (var3 == 0) {
					if (arg1 != 1) {
					}
					return;
				}
				this.method4348(arg0, var3, 2063937262);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.r(" + ')');
		}
	}

	public String method4347(int arg0, int arg1) {
		try {
			String var3 = this.aString3930;
			while (true) {
				int var4 = var3.indexOf("%1");
				if (var4 < 0) {
					if (arg1 == 222966871) {
					}
					return var3;
				}
				var3 = var3.substring(0, var4) + Class76_Sub1.method886(arg0, false, 177889397) + var3.substring(var4 + 2);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pp.i(" + ')');
		}
	}

	public void method4348(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.anInt3920 = arg0.readBigSmart(-2078069175);
			} else if (arg1 == 2) {
				this.anInt3921 = arg0.readUnsignedTriByte(-1401356047);
				this.aBoolean3919 = true;
			} else if (arg1 == 3) {
				this.anInt3926 = arg0.readBigSmart(-1947376245);
			} else if (arg1 == 4) {
				this.anInt3932 = arg0.readBigSmart(-1199503832);
			} else if (arg1 == 5) {
				this.anInt3924 = arg0.readBigSmart(-807083553);
			} else if (arg1 == 6) {
				this.anInt3927 = arg0.readBigSmart(-1993789025);
			} else if (arg1 == 7) {
				this.anInt3923 = arg0.readShort(-1100583751);
			} else if (arg1 == 8) {
				this.aString3930 = arg0.readJagString((byte) 6);
			} else if (arg1 == 9) {
				this.anInt3922 = arg0.readUnsignedShort(-341402732);
			} else if (arg1 == 10) {
				this.anInt3925 = arg0.readShort(-1100583751);
			} else if (arg1 == 11) {
				this.anInt3929 = 0;
			} else if (arg1 == 12) {
				this.anInt3931 = arg0.readUnsignedByte(1881491178);
			} else if (arg1 == 13) {
				this.anInt3916 = arg0.readShort(-1100583751);
			} else if (arg1 == 14) {
				this.anInt3929 = arg0.readUnsignedShort(179940236);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pp.j(" + ')');
		}
	}

	public Class61 method4349(Class_ra arg0, int arg1) {
		try {
			if (this.anInt3932 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3932);
			if (var3 == null) {
				this.method4351(arg0, -1056264315);
				var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3932);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.s(" + ')');
		}
	}

	public Class61 method4350(Class_ra arg0, byte arg1) {
		try {
			if (this.anInt3927 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3927);
			if (var3 == null) {
				this.method4351(arg0, -1056264315);
				var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3927);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.f(" + ')');
		}
	}

	public void method4351(Class_ra arg0, int arg1) {
		try {
			IndexTable var3 = this.aClass368_3928.aClass280_3866;
			Class87 var4;
			if (this.anInt3926 >= 0 && this.aClass368_3928.aClass367_3868.get((long) this.anInt3926) == null && var3.method2750(this.anInt3926, -1250408718)) {
				var4 = Class53.method640(var3, this.anInt3926);
				this.aClass368_3928.aClass367_3868.put(arg0.bw(var4, true), (long) this.anInt3926);
			}
			if (this.anInt3924 >= 0 && this.aClass368_3928.aClass367_3868.get((long) this.anInt3924) == null && var3.method2750(this.anInt3924, 1787500949)) {
				var4 = Class53.method640(var3, this.anInt3924);
				this.aClass368_3928.aClass367_3868.put(arg0.bw(var4, true), (long) this.anInt3924);
			}
			if (this.anInt3932 >= 0 && this.aClass368_3928.aClass367_3868.get((long) this.anInt3932) == null && var3.method2750(this.anInt3932, -1710823701)) {
				var4 = Class53.method640(var3, this.anInt3932);
				this.aClass368_3928.aClass367_3868.put(arg0.bw(var4, true), (long) this.anInt3932);
			}
			if (this.anInt3927 >= 0 && this.aClass368_3928.aClass367_3868.get((long) this.anInt3927) == null && var3.method2750(this.anInt3927, 2060077652)) {
				var4 = Class53.method640(var3, this.anInt3927);
				this.aClass368_3928.aClass367_3868.put(arg0.bw(var4, true), (long) this.anInt3927);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pp.z(" + ')');
		}
	}

	public Class61 method4352(Class_ra arg0, int arg1) {
		try {
			if (this.anInt3926 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3926);
			if (var3 == null) {
				this.method4351(arg0, -1056264315);
				var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3926);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.p(" + ')');
		}
	}

	public Class61 method4353(Class_ra arg0, int arg1) {
		try {
			if (this.anInt3924 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3924);
			if (var3 == null) {
				this.method4351(arg0, -1056264315);
				var3 = (Class61) this.aClass368_3928.aClass367_3868.get((long) this.anInt3924);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.o(" + ')');
		}
	}

	public static final void method4354(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg2.anInt4376 -= 2;
			arg0.anInt1222 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1223 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			Class404.method4738(arg0, 1853630794);
			if (arg0.anInt1198 == 0) {
				Class156.method1829(arg1, arg0, false, -1108085448);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "pp.fy(" + ')');
		}
	}

	public static final void method4355(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (Class503.aString5915 != null && Class503.aString5915.equalsIgnoreCase(var2)) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pp.vn(" + ')');
		}
	}

	public static Class524 method4356(IndexTable arg0, int arg1, int arg2) {
		try {
			byte[] var3 = arg0.method2761(arg1, 835736041);
			return var3 == null ? null : new Class524(var3);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pp.j(" + ')');
		}
	}

	public static boolean method4357(int arg0, int arg1) {
		try {
			return arg0 == 6 || arg0 == 15 || arg0 == 11 || arg0 == 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pp.fr(" + ')');
		}
	}

	public static void method4358(Class_ra arg0, int arg1, int arg2, IComponentDefinitions arg3, int arg4, int arg5) {
		try {
			for (int var6 = 7; var6 >= 0; var6--) {
				for (int var7 = 127; var7 >= 0; var7--) {
					int var8 = (arg4 & 0x3F) << 10 | (var6 & 0x7) << 7 | var7 & 0x7F;
					Class318.method3166(false, true, -1368286637);
					int var9 = Console.colorArray[var8];
					Class95_Sub12.method1137(false, true, -1101523945);
					arg0.B((arg3.anInt1210 * var7 >> 7) + arg1, arg2 + ((7 - var6) * arg3.anInt1348 >> 3), (arg3.anInt1210 >> 7) + 1, (arg3.anInt1348 >> 3) + 1, var9 | 0xFF000000, 0);
				}
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "pp.j(" + ')');
		}
	}
}
