package deob;

public class Class330 {

	public long aLong3341;

	public Class330 aClass330_3340;

	public Class330 aClass330_3342;

	public boolean method3251(int arg0) {
		try {
			return this.aClass330_3342 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nt.q(" + ')');
		}
	}

	public void method3252(int arg0) {
		try {
			if (this.aClass330_3342 != null) {
				this.aClass330_3342.aClass330_3340 = this.aClass330_3340;
				this.aClass330_3340.aClass330_3342 = this.aClass330_3342;
				this.aClass330_3340 = null;
				this.aClass330_3342 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nt.k(" + ')');
		}
	}

	public static final void method3253(Class430 arg0, int arg1) {
		try {
			Class330_Sub36_Sub12 var2 = Class354.method4083(arg0.anIntArray4387[--arg0.anInt4376]);
			if (var2 == null || var2.aString9705 == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2.aString9705;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "nt.aer(" + ')');
		}
	}

	public static final void method3254(Class432_Sub1_Sub1_Sub1 arg0, Class432_Sub1_Sub1_Sub1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var10 = arg1.method5435(-1957771775);
			if (var10 != -1) {
				Object var11 = null;
				Class61 var12 = (Class61) client.aClass367_8974.get((long) var10);
				if (var12 == null) {
					Class87[] var13 = Class53.method641(Class540.aClass280_6249, var10, 0);
					if (var13 == null) {
						return;
					}
					var12 = Class361.aClass_ra3793.bw(var13[0], true);
					client.aClass367_8974.put(var12, (long) var10);
				}
				Class260 var18 = arg0.method5346().aClass260_2606;
				Class208.method2205(arg0.aByte8658, (int) var18.aFloat2716, (int) var18.aFloat2711, arg0.method5453(-1438798617) * 256, 0, false, 1536669850);
				int var14 = (int) (client.aFloatArray9253[0] + (float) arg3 - 18.0F);
				int var15 = (int) (client.aFloatArray9253[1] + (float) arg4 - 16.0F - 54.0F);
				int var19 = var14 + arg2 / 4 * 18;
				int var20 = var15 + arg2 % 4 * 18;
				var12.method687(var19, var20);
				if (arg0 == arg1) {
					Class361.aClass_ra3793.method4788(var19 - 1, var20 - 1, 18, 18, -256, (byte) 45);
				}
				Class325_Sub1 var16 = Class_ra_Sub3.method5213(62408225);
				var16.aClass432_Sub1_Sub1_Sub1_7475 = arg1;
				var16.anInt7474 = var19;
				var16.anInt7473 = var20;
				var16.anInt7471 = var19 + 16;
				var16.anInt7477 = var20 + 16;
				client.aClass467_9096.method5852(var16, (byte) 1);
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "nt.js(" + ')');
		}
	}

	public static final void method3255(IComponentDefinitions[] arg0, int arg1, byte arg2) {
		try {
			for (int var3 = 0; var3 < arg0.length; var3++) {
				IComponentDefinitions var4 = arg0[var3];
				if (var4 == null) {
					if (arg2 <= 0) {
						throw new IllegalStateException();
					}
				} else if (arg1 == var4.anInt1211) {
					if (!client.method3918(var4)) {
						if (var4.anInt1198 == 0) {
							method3255(arg0, var4.anInt1196, (byte) 26);
							if (var4.aClass114Array1219 != null) {
								method3255(var4.aClass114Array1219, var4.anInt1196, (byte) 97);
							}
							Class330_Sub48 var5 = (Class330_Sub48) client.aClass497_9284.method6094((long) var4.anInt1196);
							if (var5 != null) {
								Class355_Sub1.method4131(var5.anInt7859, 525040242);
							}
						}
						if (var4.anInt1198 == 6 && var4.anInt1345 != -1) {
							if (var4.aClass477_1344 == null) {
								var4.aClass477_1344 = new Class477_Sub1();
								var4.aClass477_1344.method5988(var4.anInt1345, (byte) -49);
							}
							if (var4.aClass477_1344.method5981(client.anInt9210, 1936866212) && var4.aClass477_1344.method5978((byte) -78)) {
								var4.aClass477_1344.method5979((byte) 73);
							}
						}
					} else if (arg2 <= 0) {
						throw new IllegalStateException();
					}
				} else if (arg2 <= 0) {
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "nt.lf(" + ')');
		}
	}

	public static final void method3256(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1209;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "nt.pw(" + ')');
		}
	}

	public static String method3257(byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			char[] var4 = new char[arg2];
			int var5 = 0;
			int var6 = arg1;
			int var7 = arg2 + arg1;
			while (var6 < var7) {
				int var8 = arg0[var6++] & 0xFF;
				int var9;
				if (var8 < 128) {
					if (var8 == 0) {
						var9 = 65533;
					} else {
						var9 = var8;
					}
				} else if (var8 < 192) {
					var9 = 65533;
				} else if (var8 < 224) {
					if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
						var9 = (var8 & 0x1F) << 6 | arg0[var6++] & 0x3F;
						if (var9 < 128) {
							var9 = 65533;
						}
					} else {
						var9 = 65533;
					}
				} else if (var8 < 240) {
					if (var6 + 1 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
						var9 = (var8 & 0xF) << 12 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
						if (var9 < 2048) {
							var9 = 65533;
						}
					} else {
						var9 = 65533;
					}
				} else if (var8 >= 248) {
					var9 = 65533;
				} else if (var6 + 2 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
					var9 = (var8 & 0x7) << 18 | (arg0[var6++] & 0x3F) << 12 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
					if (var9 >= 65536 && var9 <= 1114111) {
						var9 = 65533;
					} else {
						var9 = 65533;
					}
				} else {
					var9 = 65533;
				}
				var4[var5++] = (char) var9;
			}
			return new String(var4, 0, var5);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "nt.i(" + ')');
		}
	}

	public static void method3258(int arg0, int arg1, int arg2) {
		try {
			if (Class396.aClass417_4108.aBoolean4285 || Class484.anInt5786 != 1 && (!Class211.aBoolean2061 || Class484.anInt5786 != 2 || !Class422.aClass330_Sub36_Sub10_4321.aString9689.equals(Class526.aClass526_6145.method6257(Class429.aClass454_4369, 991479434)))) {
				Class524 var3 = Class359.method4239((byte) 96);
				int var4 = var3.method6240(Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), -838393369);
				int var5;
				int var7;
				if (Class484.aBoolean5783) {
					for (Class330_Sub36_Sub13 var6 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 61); var6 != null; var6 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
						if (var6.anInt9715 == 1) {
							var7 = Class7.method409((Class330_Sub36_Sub10) var6.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735, var3, 936672521);
						} else {
							var7 = Class20.method465(var6, var3, (byte) -44);
						}
						if (var7 > var4) {
							var4 = var7;
						}
					}
					var4 += 8;
					var5 = Class484.anInt5790 * Class484.anInt5779 + 21;
					Class406.anInt4194 = (Class484.aBoolean5807 ? 26 : 22) + Class484.anInt5779 * Class484.anInt5790;
				} else {
					for (Class330_Sub36_Sub10 var9 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854); var9 != null; var9 = (Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -34)) {
						var7 = Class7.method409(var9, var3, 936672521);
						if (var7 > var4) {
							var4 = var7;
						}
					}
					var4 += 8;
					var5 = Class484.anInt5779 * Class484.anInt5786 + 21;
					Class406.anInt4194 = Class484.anInt5786 * Class484.anInt5779 + (Class484.aBoolean5807 ? 26 : 22);
				}
				var4 += 10;
				int var10 = arg0 - var4 / 2;
				if (var10 + var4 > Class300.anInt3058) {
					var10 = Class300.anInt3058 - var4;
				}
				if (var10 < 0) {
					var10 = 0;
				}
				var7 = arg1;
				if (var5 + arg1 > Class146.anInt1615) {
					var7 = Class146.anInt1615 - var5;
				}
				if (var7 < 0) {
					var7 = 0;
				}
				Class89.anInt736 = var10;
				Class85.anInt713 = var7;
				Class550.anInt6288 = var4;
				Class484.anInt5809 = (int) (Math.random() * 24.0D);
				Class484.aBoolean5782 = true;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "nt.n(" + ')');
		}
	}
}
