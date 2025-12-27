package deob;

public class Class405 {

	public int anInt4163;

	public int anInt4164;

	public int anInt4165;

	public int anInt4166;

	public int anInt4167;

	public int anInt4168;

	public int anInt4169;

	public int anInt4170;

	public int anInt4171;

	public int anInt4172;

	public int anInt4173;

	public int anInt4174;

	public boolean method4740(Class405 arg0, int arg1) {
		try {
			return this.anInt4165 == arg0.anInt4165 && arg0.anInt4173 == this.anInt4173 && arg0.anInt4169 == this.anInt4169;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qv.r(" + ')');
		}
	}

	public static final void method4741(IComponentDefinitions arg0, int arg1, byte[] arg2, byte[] arg3, Class430 arg4, int arg5) {
		try {
			if (arg0.aByteArrayArray1351 == null) {
				if (arg2 == null) {
					return;
				}
				arg0.aByteArrayArray1351 = new byte[11][];
				arg0.aByteArrayArray1276 = new byte[11][];
				arg0.anIntArray1277 = new int[11];
				arg0.anIntArray1278 = new int[11];
			}
			arg0.aByteArrayArray1351[arg1] = arg2;
			if (arg2 == null) {
				arg0.aBoolean1274 = false;
				for (int var6 = 0; var6 < arg0.aByteArrayArray1351.length; var6++) {
					if (arg0.aByteArrayArray1351[var6] != null || arg0.anIntArray1278[var6] > 0) {
						arg0.aBoolean1274 = true;
						break;
					}
				}
			} else {
				arg0.aBoolean1274 = true;
			}
			arg0.aByteArrayArray1276[arg1] = arg3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "qv.ku(" + ')');
		}
	}

	public static final void method4742(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 - var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qv.zc(" + ')');
		}
	}

	public static final void method4743(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			int var3 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var3 == -1) {
				throw new RuntimeException("");
			}
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var2 + (char) var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qv.aay(" + ')');
		}
	}

	public static final void method4744(Class430 arg0, int arg1) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null) {
				Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-1280106931), -1, -1, false, -1772393953);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qv.afr(" + ')');
		}
	}

	public static final void method4745(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 945582861);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class13.method440(var3, var4, arg0, -1502402238);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qv.op(" + ')');
		}
	}

	public static final void method4746(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class475_Sub1.method5947(arg0.aClass330_Sub39_4395 == Class106.aClass330_Sub39_1009, var2, (byte) 1);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qv.yn(" + ')');
		}
	}

	public static void method4747(Class432_Sub1_Sub1_Sub1 arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			Class364 var5 = arg0.method5436(951426650);
			Class477_Sub3 var6 = arg0.aClass477_Sub3_10039;
			int var7 = arg0.anInt10015 - arg0.aClass238_10053.anInt2581 & 0x3FFF;
			if (Class299.aClass299_6809.aByte6805 == arg1) {
				if (var7 == 0 && arg0.anInt10050 <= 25) {
					if (!var6.aBoolean8752 || !var5.method4264(var6.method5967((byte) -59), 2088602327)) {
						var6.method5969(var5.method4268(2141235971), false, true, -1667772701);
						var6.aBoolean8752 = var6.method5966(-1177557398);
					}
				} else if (arg3 < 0 && var5.anInt3812 != -1) {
					var6.method5969(var5.anInt3812, false, true, -1358368698);
					var6.aBoolean8752 = false;
				} else if (arg3 > 0 && var5.anInt3829 != -1) {
					var6.method5969(var5.anInt3829, false, true, -1438575340);
					var6.aBoolean8752 = false;
				} else if (!var6.aBoolean8752 || !var5.method4264(var6.method5967((byte) -74), 1127211891)) {
					var6.method5969(var5.method4268(2139015436), false, true, 878793426);
					var6.aBoolean8752 = arg0.aClass477_Sub3_10039.method5966(-1328344406);
				}
			} else if (arg0.anInt10028 != -1 && (var7 >= 10240 || var7 <= 2048)) {
				int var8 = client.anIntArray9053[arg2] - arg0.aClass238_10053.anInt2581 & 0x3FFF;
				if (arg1 == Class299.aClass299_6808.aByte6805 && var5.anInt3818 != -1) {
					if (var8 > 2048 && var8 <= 6144 && var5.anInt3821 != -1) {
						var6.method5969(var5.anInt3821, false, true, -880448917);
					} else if (var8 >= 10240 && var8 < 14336 && var5.anInt3851 != -1) {
						var6.method5969(var5.anInt3851, false, true, -3822235);
					} else if (var8 <= 6144 || var8 >= 10240 || var5.anInt3819 == -1) {
						var6.method5969(var5.anInt3818, false, true, -1848068236);
					} else {
						var6.method5969(var5.anInt3819, false, true, -1714623943);
					}
				} else if (arg1 == Class299.aClass299_6806.aByte6805 && var5.anInt3822 != -1) {
					if (var8 > 2048 && var8 <= 6144 && var5.anInt3825 != -1) {
						var6.method5969(var5.anInt3825, false, true, 71509579);
					} else if (var8 >= 10240 && var8 < 14336 && var5.anInt3824 != -1) {
						var6.method5969(var5.anInt3824, false, true, 1630866811);
					} else if (var8 <= 6144 || var8 >= 10240 || var5.anInt3823 == -1) {
						var6.method5969(var5.anInt3822, false, true, -1856024186);
					} else {
						var6.method5969(var5.anInt3823, false, true, 1252235565);
					}
				} else if (var8 > 2048 && var8 <= 6144 && var5.anInt3817 != -1) {
					var6.method5969(var5.anInt3817, false, true, 1819226736);
				} else if (var8 >= 10240 && var8 < 14336 && var5.anInt3836 != -1) {
					var6.method5969(var5.anInt3836, false, true, -607420335);
				} else if (var8 <= 6144 || var8 >= 10240 || var5.anInt3815 == -1) {
					var6.method5969(var5.anInt3814, false, true, -1629074596);
				} else {
					var6.method5969(var5.anInt3815, false, true, -1203896768);
				}
				var6.aBoolean8752 = false;
			} else if (var7 == 0 && arg0.anInt10050 <= 25) {
				if (arg1 == Class299.aClass299_6808.aByte6805 && var5.anInt3818 != -1) {
					var6.method5969(var5.anInt3818, false, true, -349380316);
				} else if (Class299.aClass299_6806.aByte6805 == arg1 && var5.anInt3822 != -1) {
					var6.method5969(var5.anInt3822, false, true, 337295169);
				} else {
					var6.method5969(var5.anInt3814, false, true, -1225023720);
				}
				var6.aBoolean8752 = false;
			} else {
				if (Class299.aClass299_6808.aByte6805 == arg1 && var5.anInt3818 != -1) {
					if (arg3 < 0 && var5.anInt3828 != -1) {
						var6.method5969(var5.anInt3828, false, true, 1511634417);
					} else if (arg3 <= 0 || var5.anInt3840 == -1) {
						var6.method5969(var5.anInt3818, false, true, 870762897);
					} else {
						var6.method5969(var5.anInt3840, false, true, 1088422901);
					}
				} else if (arg1 == Class299.aClass299_6806.aByte6805 && var5.anInt3822 != -1) {
					if (arg3 < 0 && var5.anInt3826 != -1) {
						var6.method5969(var5.anInt3826, false, true, -484366516);
					} else if (arg3 <= 0 || var5.anInt3827 == -1) {
						var6.method5969(var5.anInt3822, false, true, 264346497);
					} else {
						var6.method5969(var5.anInt3827, false, true, -878022026);
					}
				} else if (arg3 < 0 && var5.anInt3830 != -1) {
					var6.method5969(var5.anInt3830, false, true, 1070948049);
				} else if (arg3 <= 0 || var5.anInt3831 == -1) {
					var6.method5969(var5.anInt3814, false, true, -1566341575);
				} else {
					var6.method5969(var5.anInt3831, false, true, 1826401721);
				}
				var6.aBoolean8752 = false;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "qv.ih(" + ')');
		}
	}
}
