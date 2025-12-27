package deob;

public class Class142 {

	public static Class143 aClass143_1567;

	public static Class368 aClass368_1568;

	public Class142() throws Throwable {
		throw new Error();
	}

	public static int method1649(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var6 = arg2 & 0x3;
			if (var6 == 0) {
				return arg0;
			} else if (var6 == 1) {
				return arg1;
			} else if (var6 == 2) {
				return 7 - arg0;
			} else {
				return 7 - arg1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ft.r(" + ')');
		}
	}

	public static final void method1650(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class152.method1788(var3, var4, arg0, -160154297);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ft.jq(" + ')');
		}
	}

	public static final void method1651(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (var2 == 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else if (var3 == 0) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = Integer.MAX_VALUE;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = (int) Math.pow((double) var2, 1.0D / (double) var3);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ft.zi(" + ')');
		}
	}

	public static final void method1652(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -3).anInt6736 == 1 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ft.abd(" + ')');
		}
	}

	public static final void method1653(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1763765593);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1229;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ft.rb(" + ')');
		}
	}

	public static final void method1654(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1384849724);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class121.method1445(var3, var4, arg0, 680050935);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ft.lq(" + ')');
		}
	}

	public static final void method1655(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class116.method1416(var3, var4, arg0, (byte) 123);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ft.id(" + ')');
		}
	}

	public static byte[][][] method1656(int arg0, int arg1) {
		try {
			byte[][][] var2 = new byte[8][4][];
			int var3 = arg0;
			int var4 = arg0;
			byte[] var5 = new byte[arg0 * arg0];
			int var6 = 0;
			int var7;
			int var8;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[0][0] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var4; var8++) {
					if (var8 <= var7) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[0][1] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[0][2] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[0][3] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[1][0] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var6 >= 0 && var6 < var5.length) {
						if (var8 >= var7 << 1) {
							var5[var6] = -1;
						}
						var6++;
					} else {
						var6++;
					}
				}
			}
			var2[1][1] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[1][2] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[1][3] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[2][0] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[2][1] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[2][2] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[2][3] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[3][0] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[3][1] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[3][2] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[3][3] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[4][0] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[4][1] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7 >> 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[4][2] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[4][3] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var3 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[5][0] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var7 <= var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[5][1] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var3 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[5][2] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var7 >= var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[5][3] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[6][0] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 <= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[6][1] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[6][2] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 <= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[6][3] = var5;
			var5 = new byte[var4 * var3];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[7][0] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = 0; var8 < var3; var8++) {
					if (var8 >= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[7][1] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = var4 - 1; var7 >= 0; var7--) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[7][2] = var5;
			var5 = new byte[var3 * var4];
			var6 = 0;
			for (var7 = 0; var7 < var4; var7++) {
				for (var8 = var3 - 1; var8 >= 0; var8--) {
					if (var8 >= var7 - var4 / 2) {
						var5[var6] = -1;
					}
					var6++;
				}
			}
			var2[7][3] = var5;
			return var2;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "ft.j(" + ')');
		}
	}
}
