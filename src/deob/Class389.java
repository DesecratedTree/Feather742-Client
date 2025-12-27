package deob;

public class Class389 {

	public static int anInt4008 = -50;

	public static int anInt4009 = -60;

	public static float aFloat4011 = 0.69921875F;

	public static float aFloat4012 = 1.1523438F;

	public static int anInt4015 = -50;

	public static int anInt4016 = 0;

	public static int anInt4030 = 16777215;

	public static int anInt4032 = 13156520;

	public static float aFloat4033 = 1.2F;

	public static int anInt4020 = 5047;

	public int anInt4023 = 0;

	public int anInt4024 = -1;

	public long aLong4025 = 0L;

	public boolean aBoolean4026 = false;

	public Class260 aClass260_4013 = new Class260(-50.0F, -60.0F, -50.0F);

	public Class367 aClass367_4017 = new Class367(9);

	public Class367 aClass367_4014 = new Class367(9);

	public Class_ra aClass_ra4021;

	public Class394[][] aClass394ArrayArray4022;

	public Class394 aClass394_4027;

	public Class394 aClass394_4028;

	public Class394 aClass394_4029;

	public Class394 aClass394_4031;

	public static Class308 aClass308_4019;

	public static Class92 aClass92_4018;

	public static int[] anIntArray4010;

	public Class389(Class_ra arg0, int arg1, int arg2) {
		this.aClass_ra4021 = arg0;
		this.aClass394ArrayArray4022 = new Class394[arg1][arg2];
		if (anIntArray4010 != null) {
			aClass92_4018 = this.method4579(anIntArray4010[0], anIntArray4010[1], anIntArray4010[2], anIntArray4010[3], anIntArray4010[4], anIntArray4010[5], (byte) 33);
		}
		aClass308_4019 = null;
		this.aClass394_4027 = new Class394();
		this.aClass394_4028 = new Class394();
		this.aClass394_4029 = new Class394();
		this.aClass394_4031 = new Class394();
		this.method4582(793438864);
	}

	public void method4576(int arg0) {
		try {
			this.aClass_ra4021.IA(((float) Class448.aClass330_Sub50_5555.aClass464_Sub1_7886.method5731(-1260293133) * 0.1F + 0.7F + client.aClass304_9030.method2989(-2017390368)) * this.aClass394_4028.aFloat4071);
			this.aClass_ra4021.m(this.aClass394_4028.anInt4080, this.aClass394_4028.aFloat4072, this.aClass394_4028.aFloat4070, (float) ((int) this.aClass260_4013.aFloat2716 << 2), (float) ((int) this.aClass260_4013.aFloat2715 << 2), (float) ((int) this.aClass260_4013.aFloat2711 << 2));
			this.aClass_ra4021.cf(this.aClass394_4028.aClass92_4077);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.k(" + ')');
		}
	}

	public Class394 method4577(int arg0) {
		try {
			return this.aClass394_4028;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.j(" + ')');
		}
	}

	public void method4578(int arg0) {
		try {
			this.aClass367_4017.method4298((byte) 26);
			this.aClass367_4014.method4298((byte) 67);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.p(" + ')');
		}
	}

	public Class92 method4579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
		try {
			long var8 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
			Class92 var10 = (Class92) this.aClass367_4017.get(var8);
			if (var10 == null) {
				var10 = this.aClass_ra4021.cl(arg0, arg1, arg2, arg3, arg4, arg5);
				this.aClass367_4017.put(var10, var8);
				return var10;
			} else {
				return var10;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "qc.o(" + ')');
		}
	}

	public void method4580(int arg0, int arg1, int arg2, byte arg3) {
		try {
			Class394 var5 = this.aClass394ArrayArray4022[arg0][arg1];
			if (var5 == null) {
				var5 = this.aClass394_4027;
			}
			if (this.aBoolean4026) {
				this.aBoolean4026 = false;
				arg2 = 0;
			}
			if (!this.aClass394_4031.method4624(var5, (byte) -5)) {
				this.aClass394_4031.method4620(var5, (byte) -37);
				this.aLong4025 = Class312.method3111((byte) 111);
				this.anInt4023 = this.anInt4024 = arg2;
				if (this.anInt4023 != 0) {
					this.aClass394_4029.method4620(this.aClass394_4028, (byte) -85);
					if (this.aClass394_4028.aClass308_4081 != null) {
						if (this.aClass394_4028.aClass308_4081.method3088(-1485331701)) {
							this.aClass394_4028.aClass308_4081 = this.aClass394_4029.aClass308_4081 = this.aClass394_4028.aClass308_4081.method3081(1904519915);
						}
						if (this.aClass394_4028.aClass308_4081 != null && this.aClass394_4031.aClass308_4081 != this.aClass394_4028.aClass308_4081) {
							this.aClass394_4028.aClass308_4081.method3084(this.aClass394_4031.aClass308_4081, 1681245377);
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qc.n(" + ')');
		}
	}

	public void method4581(int arg0) {
		try {
			if (this.anInt4024 >= 0) {
				long var2 = Class312.method3111((byte) 1);
				this.anInt4024 = (int) ((long) (this.anInt4024 * -488756837) - (var2 - this.aLong4025) * -488756837L) * 1063916691;
				if (this.anInt4024 > 0) {
					this.aClass394_4028.method4626(this.aClass_ra4021, this.aClass394_4029, this.aClass394_4031, (float) (this.anInt4023 - this.anInt4024) / (float) this.anInt4023, 1153435902);
				} else {
					this.aClass394_4028.method4620(this.aClass394_4031, (byte) -63);
					if (this.aClass394_4028.aClass308_4081 != null) {
						this.aClass394_4028.aClass308_4081.method3079((byte) -1);
					}
					this.anInt4024 = -1;
				}
				this.aLong4025 = var2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.l(" + ')');
		}
	}

	public void method4582(int arg0) {
		try {
			this.aBoolean4026 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.b(" + ')');
		}
	}

	public void method4583(int arg0) {
		try {
			byte var2 = 0;
			int var3 = (this.aClass394_4028.anInt4076 + 256 << 2) + var2;
			this.aClass_ra4021.c(this.aClass394_4028.anInt4075, Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5743((byte) 9) == 1 ? var3 : -1, 0);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.q(" + ')');
		}
	}

	public void method4584(byte arg0) {
		try {
			this.aClass_ra4021.method4798(this.aClass394_4028.aFloat4078, this.aClass394_4028.aFloat4073, this.aClass394_4028.aFloat4079, -624670866);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.u(" + ')');
		}
	}

	public void method4585(short arg0) {
		try {
			this.aClass_ra4021.IA(((float) Class448.aClass330_Sub50_5555.aClass464_Sub1_7886.method5731(140856987) * 0.1F + 0.7F + client.aClass304_9030.method2989(-374367500)) * 1.1523438F);
			this.aClass_ra4021.m(anInt4030, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
			this.aClass_ra4021.c(anInt4032, -1, 0);
			this.aClass_ra4021.cf(aClass92_4018);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.x(" + ')');
		}
	}

	public void method4586(int arg0, int arg1, Class394 arg2, byte arg3) {
		try {
			this.aClass394ArrayArray4022[arg0][arg1] = arg2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qc.f(" + ')');
		}
	}

	public Class308 method4587(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			long var6 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
			Class308 var8 = (Class308) this.aClass367_4014.get(var6);
			if (var8 == null) {
				var8 = Class341.aClass342_3397.method3985(arg0, arg1, arg2, arg3, Class446.aClass131_5549, (byte) 64);
				this.aClass367_4014.put(var8, var6);
			}
			return var8;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "qc.s(" + ')');
		}
	}

	public void method4588(Class389 arg0, int arg1) {
		try {
			this.aClass394_4028.method4620(arg0.aClass394_4028, (byte) -44);
			this.aClass394_4029.method4620(arg0.aClass394_4029, (byte) -94);
			this.aClass394_4031.method4620(arg0.aClass394_4031, (byte) -59);
			this.aLong4025 = arg0.aLong4025;
			this.anInt4023 = arg0.anInt4023;
			this.anInt4024 = arg0.anInt4024;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.i(" + ')');
		}
	}

	public void method4589(Class304 arg0, int arg1) {
		try {
			if (Class522.method6230(client.anInt8995, 119437551) || Class226.method2307(client.anInt8995, (byte) 49)) {
				this.method4580(Class471.anInt5612 >> 12, Class325_Sub3.anInt7484 >> 12, anInt4020, (byte) -1);
			} else {
				int var3 = -1;
				int var4 = -1;
				if (Class263_Sub2.myPlayer != null) {
					var3 = Class263_Sub2.myPlayer.anIntArray10018[0] >> 3;
					var4 = Class263_Sub2.myPlayer.anIntArray10059[0] >> 3;
				}
				if (var3 >= 0 && var3 < arg0.method2990(-564384678) >> 3 && var4 >= 0 && var4 < arg0.method3033((byte) -1) >> 3) {
					this.method4580(var3, var4, anInt4020, (byte) -103);
				} else {
					this.method4580(arg0.method2990(-820090437) >> 4, arg0.method3033((byte) -24) >> 4, 0, (byte) -48);
				}
			}
			this.method4581(2071702064);
			this.method4576(-1083865652);
			this.method4584((byte) 35);
			this.method4583(509758307);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qc.r(" + ')');
		}
	}

	public void method4590(int arg0, int arg1, byte arg2) {
		try {
			Class394 var4 = this.aClass394ArrayArray4022[arg0][arg1];
			if (var4 != null) {
				this.aClass260_4013.method2582(var4.aClass260_4074);
			}
			this.method4576(242500053);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qc.w(" + ')');
		}
	}

	public void method4591(int arg0) {
		try {
			for (int var2 = 0; var2 < this.aClass394ArrayArray4022.length; var2++) {
				for (int var3 = 0; var3 < this.aClass394ArrayArray4022[var2].length; var3++) {
					this.aClass394ArrayArray4022[var2][var3] = this.aClass394_4027;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.z(" + ')');
		}
	}

	public static void method4592(String[] arg0, short[] arg1, int arg2) {
		try {
			Class201.method2162(arg0, arg1, 0, arg0.length - 1, -2041842046);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.r(" + ')');
		}
	}

	public static final void method4593(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			long var2 = (long) arg0.anIntArray4387[arg0.anInt4376];
			long var4 = (long) arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) (var4 * var2 / 100L + var2);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qc.zs(" + ')');
		}
	}

	public static final void method4594(Class430 arg0, int arg1) {
		try {
			if (client.aString8972 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = client.aString8972;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.ajl(" + ')');
		}
	}

	public static final void method4595(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1225357810);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class410.method5221(var3, var4, arg0, -1058742292);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qc.gd(" + ')');
		}
	}

	public static void method4596(int arg0, byte arg1) {
		try {
			Class317.anInt3274 = arg0;
			Class3.aClass367_45.method4298((byte) 41);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qc.j(" + ')');
		}
	}

	public static final void method4597(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class423.method5303(var2, var3, true, 170698964);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qc.uv(" + ')');
		}
	}

	public static void method4598(int arg0) {
		try {
			Class3.aClass367_45.method4296(-1020414121);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "qc.o(" + ')');
		}
	}

	public static int[] method4599(byte arg0) {
		try {
			return new int[] { Class125.anInt1451, Class125.anInt1452, Class125.anInt1453 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "qc.i(" + ')');
		}
	}
}
