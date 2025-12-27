package deob;

public class Class82 {

	public static int anInt676;

	public static int anInt677;

	public static int anInt678;

	public static int anInt680;

	public static int anInt681;

	public static int anInt682;

	public static int anInt683;

	public static int[] anIntArray679;

	public static void method956(Class_ra arg0, int[] arg1, int arg2) {
		method963(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	public static void method957(Class_ra arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
		method963(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	public static void method958(int arg0, int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		int var2 = arg0;
		int var3 = anIntArray679[arg0];
		int var4 = anIntArray679[arg0 + 1];
		int var5 = anIntArray679[arg0 + 2];
		int var6 = anIntArray679[arg0 + 3];
		for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
			int var8 = anIntArray679[var7 + 1];
			if (var8 < var4) {
				anIntArray679[var2] = anIntArray679[var7];
				anIntArray679[var2 + 1] = var8;
				anIntArray679[var2 + 2] = anIntArray679[var7 + 2];
				anIntArray679[var2 + 3] = anIntArray679[var7 + 3];
				var2 += 4;
				anIntArray679[var7] = anIntArray679[var2];
				anIntArray679[var7 + 1] = anIntArray679[var2 + 1];
				anIntArray679[var7 + 2] = anIntArray679[var2 + 2];
				anIntArray679[var7 + 3] = anIntArray679[var2 + 3];
			}
		}
		anIntArray679[var2] = var3;
		anIntArray679[var2 + 1] = var4;
		anIntArray679[var2 + 2] = var5;
		anIntArray679[var2 + 3] = var6;
		method958(arg0, var2);
		method958(var2 + 4, arg1);
	}

	public static void method959() {
		anInt680 = 0;
	}

	public static boolean method960(int arg0) {
		int var1 = anInt676;
		int var2 = anInt683;
		int var3 = anInt681;
		while (var2 >= var1) {
			var3++;
			anInt681 = var3;
			if (var3 >= arg0) {
				return false;
			}
			int var4 = anInt678;
			int var5;
			int var6;
			while (var1 < anInt680) {
				var5 = anIntArray679[var1 + 1];
				if (var3 < var5) {
					break;
				}
				var6 = anIntArray679[var1];
				int var7 = anIntArray679[var1 + 2];
				int var8 = anIntArray679[var1 + 3];
				int var9 = (var7 - var6 << 16) / (var8 - var5);
				int var10 = (var6 << 16) + 32768;
				anIntArray679[var1] = var10;
				anIntArray679[var1 + 2] = var9;
				var1 += 4;
			}
			for (var5 = var4; var5 < var1; var5 += 4) {
				var6 = anIntArray679[var5 + 3];
				if (var3 >= var6) {
					anIntArray679[var5] = anIntArray679[var4];
					anIntArray679[var5 + 1] = anIntArray679[var4 + 1];
					anIntArray679[var5 + 2] = anIntArray679[var4 + 2];
					anIntArray679[var5 + 3] = anIntArray679[var4 + 3];
					var4 += 4;
				}
			}
			if (var4 == anInt680) {
				anInt680 = 0;
				return false;
			}
			method964(var4, var1);
			anInt678 = var4;
			anInt676 = var1;
			var2 = var4;
		}
		anInt677 = anIntArray679[var2] >> 16;
		anInt682 = anIntArray679[var2 + 4] >> 16;
		anIntArray679[var2] += anIntArray679[var2 + 2];
		anIntArray679[var2 + 4] += anIntArray679[var2 + 6];
		var2 += 8;
		anInt683 = var2;
		return true;
	}

	public static void method961(int arg0) {
		if (anInt680 < 0) {
			anInt683 = 0;
			anInt676 = 0;
			anInt678 = 0;
			anInt681 = 2147483646;
			return;
		}
		method958(0, anInt680);
		int var1 = anIntArray679[1];
		if (var1 < arg0) {
			var1 = arg0;
		}
		byte var2 = 0;
		int var3;
		for (var3 = 0; var3 < anInt680; var3 += 4) {
			int var4 = anIntArray679[var3 + 1];
			if (var1 < var4) {
				break;
			}
			int var5 = anIntArray679[var3];
			int var6 = anIntArray679[var3 + 2];
			int var7 = anIntArray679[var3 + 3];
			int var8 = (var6 - var5 << 16) / (var7 - var4);
			int var9 = (var5 << 16) + 32768;
			anIntArray679[var3] = var9 + (var1 - var4) * var8;
			anIntArray679[var3 + 2] = var8;
		}
		anInt678 = var2;
		anInt676 = var3;
		anInt683 = var3;
		anInt681 = var1 - 1;
	}

	public static void method962(int[] arg0, int arg1, int arg2) {
		int var3 = anInt680 + (arg2 << 1);
		int var5;
		if (anIntArray679 == null || anIntArray679.length < var3) {
			int[] var4 = new int[var3];
			for (var5 = 0; var5 < anInt680; var5++) {
				var4[var5] = anIntArray679[var5];
			}
			anIntArray679 = var4;
		}
		int var8 = arg2 + arg1;
		int var9 = var8 - 2;
		for (var5 = arg1; var5 < var8; var5 += 2) {
			int var6 = arg0[var9 + 1];
			int var7 = arg0[var5 + 1];
			if (var6 < var7) {
				anIntArray679[anInt680++] = arg0[var9];
				anIntArray679[anInt680++] = var6;
				anIntArray679[anInt680++] = arg0[var5];
				anIntArray679[anInt680++] = var7;
			} else if (var7 < var6) {
				anIntArray679[anInt680++] = arg0[var5];
				anIntArray679[anInt680++] = var7;
				anIntArray679[anInt680++] = arg0[var9];
				anIntArray679[anInt680++] = var6;
			}
			var9 = var5;
		}
	}

	public static void method963(Class_ra arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
		int[] var7 = new int[4];
		arg0.qa(var7);
		if (arg5 != null && var7[3] - var7[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method959();
		method962(arg1, arg2, arg3);
		method961(var7[1]);
		while (true) {
			int var8;
			int var9;
			int var10;
			do {
				if (!method960(var7[3])) {
					return;
				}
				var8 = anInt677;
				var9 = anInt682;
				var10 = anInt681;
				if (arg5 == null) {
					break;
				}
				int var11 = var10 - var7[1];
				if (var8 < arg5[var11] + var7[0]) {
					var8 = arg5[var11] + var7[0];
				}
				if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
					var9 = arg5[var11] + arg6[var11] + var7[0];
				}
			} while (var9 - var8 <= 0);
			arg0.XA(var8, var10, var9 - var8, arg4, 1);
		}
	}

	public Class82() throws Throwable {
		throw new Error();
	}

	public static void method964(int arg0, int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				boolean var2 = true;
				for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
					int var4 = anIntArray679[var3 - 4];
					int var5 = anIntArray679[var3];
					if (var4 > var5) {
						var2 = false;
						anIntArray679[var3 - 4] = var5;
						anIntArray679[var3] = var4;
						var4 = anIntArray679[var3 - 2];
						anIntArray679[var3 - 2] = anIntArray679[var3 + 2];
						anIntArray679[var3 + 2] = var4;
						var4 = anIntArray679[var3 - 1];
						anIntArray679[var3 - 1] = anIntArray679[var3 + 3];
						anIntArray679[var3 + 3] = var4;
					}
				}
				if (!var2) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}
}
