package deob;

public class Class464_Sub3 extends Class464 {

	public static int anInt8665 = 1;

	public static int anInt8666 = 0;

	public void method5722(int arg0, byte arg1) {
		try {
			this.anInt5587 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afa.p(" + ')');
		}
	}

	public Class464_Sub3(int arg0, Class330_Sub50 arg1) {
		super(arg0, arg1);
	}

	public void method5741(int arg0) {
		try {
			if (this.anInt5587 != 0 && this.aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) != 1) {
				this.anInt5587 = 0;
			}
			if (this.anInt5587 != 0 && this.aClass330_Sub50_5589.aClass464_Sub10_7873.method5772(240448038) == 2) {
				this.anInt5587 = 0;
			}
			if (this.anInt5587 < 0 || this.anInt5587 > 1) {
				this.anInt5587 = this.method5715(1176490384);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afa.l(" + ')');
		}
	}

	public boolean method5742(int arg0) {
		try {
			return true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afa.b(" + ')');
		}
	}

	public int method5716(int arg0, int arg1) {
		try {
			if (arg0 != 0 && this.aClass330_Sub50_5589.aClass464_Sub10_7873.method5772(1199105348) == 2) {
				return 3;
			} else if (arg0 == 0 || this.aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1) {
				return 1;
			} else {
				return 2;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afa.j(" + ')');
		}
	}

	public int method5743(byte arg0) {
		try {
			return this.anInt5587;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afa.k(" + ')');
		}
	}

	public int method5718() {
		return 1;
	}

	public int method5714(int arg0) {
		if (arg0 != 0 && this.aClass330_Sub50_5589.aClass464_Sub10_7873.method5772(-95396381) == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	public void method5719(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5721(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public void method5720(int arg0) {
		this.anInt5587 = arg0 * 1558443671 * 295364903;
	}

	public int method5715(int arg0) {
		try {
			return 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afa.r(" + ')');
		}
	}

	public Class464_Sub3(Class330_Sub50 arg0) {
		super(arg0);
	}

	public static void method5744(IComponentDefinitions arg0, Class_ta arg1, int arg2, int arg3, int arg4, int arg5, Class61 arg6, byte arg7) {
		try {
			if (arg6 != null) {
				int var8;
				if (Class147.anInt1621 == 5) {
					var8 = (int) client.aFloat9141 & 0x3FFF;
				} else {
					var8 = client.anInt9149 + (int) client.aFloat9141 & 0x3FFF;
				}
				int var9 = Math.max(arg0.anInt1210 / 2, arg0.anInt1348 / 2) + 10;
				int var10 = arg5 * arg5 + arg4 * arg4;
				if (var10 <= var9 * var9) {
					int var11 = Class257.anIntArray2683[var8];
					int var12 = Class257.anIntArray2684[var8];
					if (Class147.anInt1621 != 5) {
						var11 = var11 * 256 / (client.anInt9063 + 256);
						var12 = var12 * 256 / (client.anInt9063 + 256);
					}
					int var13 = var11 * arg5 + var12 * arg4 >> 14;
					int var14 = arg5 * var12 - arg4 * var11 >> 14;
					arg6.method689(arg0.anInt1210 / 2 + arg2 + var13 - arg6.method318() / 2, arg0.anInt1348 / 2 + arg3 - var14 - arg6.method683() / 2, arg1, arg2, arg3);
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "afa.x(" + ')');
		}
	}

	public static final void method5745(Class430 arg0, int arg1) {
		try {
			if (Class355.aClass496_3639 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = -1;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class355.aClass496_3639.anInt5876;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "afa.acd(" + ')');
		}
	}

	public static final void method5746(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class99.method1206(var2, var3, false, (byte) 106);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "afa.tq(" + ')');
		}
	}

	public static Class109[] method5747(int arg0) {
		try {
			return new Class109[] { Class109.aClass109_1088, Class109.aClass109_1099, Class109.aClass109_1028, Class109.aClass109_1029, Class109.aClass109_1030, Class109.aClass109_1031, Class109.aClass109_1032, Class109.aClass109_1033, Class109.aClass109_1034, Class109.aClass109_1035, Class109.aClass109_1043, Class109.aClass109_1081, Class109.aClass109_1038, Class109.aClass109_1039, Class109.aClass109_1040, Class109.aClass109_1134, Class109.aClass109_1042, Class109.aClass109_1047, Class109.aClass109_1044, Class109.aClass109_1041, Class109.aClass109_1046, Class109.aClass109_1111, Class109.aClass109_1147, Class109.aClass109_1049, Class109.aClass109_1050, Class109.aClass109_1149, Class109.aClass109_1052, Class109.aClass109_1027, Class109.aClass109_1054, Class109.aClass109_1045, Class109.aClass109_1056, Class109.aClass109_1057, Class109.aClass109_1058, Class109.aClass109_1059, Class109.aClass109_1060, Class109.aClass109_1061, Class109.aClass109_1113, Class109.aClass109_1063, Class109.aClass109_1064, Class109.aClass109_1065, Class109.aClass109_1110, Class109.aClass109_1116, Class109.aClass109_1051, Class109.aClass109_1069, Class109.aClass109_1036, Class109.aClass109_1071, Class109.aClass109_1072, Class109.aClass109_1073, Class109.aClass109_1112, Class109.aClass109_1075, Class109.aClass109_1076, Class109.aClass109_1077, Class109.aClass109_1078, Class109.aClass109_1079, Class109.aClass109_1080, Class109.aClass109_1132, Class109.aClass109_1082, Class109.aClass109_1083, Class109.aClass109_1084, Class109.aClass109_1085, Class109.aClass109_1086, Class109.aClass109_1067, Class109.aClass109_1074, Class109.aClass109_1089, Class109.aClass109_1090, Class109.aClass109_1091, Class109.aClass109_1092, Class109.aClass109_1093, Class109.aClass109_1094, Class109.aClass109_1120, Class109.aClass109_1096, Class109.aClass109_1097, Class109.aClass109_1123, Class109.aClass109_1103, Class109.aClass109_1122, Class109.aClass109_1101, Class109.aClass109_1102, Class109.aClass109_1066, Class109.aClass109_1151, Class109.aClass109_1105, Class109.aClass109_1133, Class109.aClass109_1107, Class109.aClass109_1108, Class109.aClass109_1109, Class109.aClass109_1070, Class109.aClass109_1129, Class109.aClass109_1131, Class109.aClass109_1106, Class109.aClass109_1114, Class109.aClass109_1115, Class109.aClass109_1068, Class109.aClass109_1117, Class109.aClass109_1118, Class109.aClass109_1119, Class109.aClass109_1055, Class109.aClass109_1121, Class109.aClass109_1095, Class109.aClass109_1048, Class109.aClass109_1124, Class109.aClass109_1125, Class109.aClass109_1126, Class109.aClass109_1127, Class109.aClass109_1128, Class109.aClass109_1087, Class109.aClass109_1098, Class109.aClass109_1100, Class109.aClass109_1026, Class109.aClass109_1130, Class109.aClass109_1148, Class109.aClass109_1135, Class109.aClass109_1136, Class109.aClass109_1137, Class109.aClass109_1138, Class109.aClass109_1139, Class109.aClass109_1140, Class109.aClass109_1141, Class109.aClass109_1142, Class109.aClass109_1143, Class109.aClass109_1144, Class109.aClass109_1145, Class109.aClass109_1053, Class109.aClass109_1062, Class109.aClass109_1037, Class109.aClass109_1146, Class109.aClass109_1150 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "afa.r(" + ')');
		}
	}
}
