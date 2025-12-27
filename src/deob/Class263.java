package deob;

import java.util.Iterator;
import java.util.Random;

public abstract class Class263 {

	public static int anInt2723 = 0;

	public static int anInt2724 = 0;

	public static int anInt2725 = -1;

	public static int anInt2726 = -1;

	public static int anInt2728 = 0;

	public static int anInt2730 = 0;

	public static int anInt2729 = 0;

	public static int anInt2722 = 0;

	public static int anInt2721 = 0;

	public static int anInt2732 = 0;

	public static String[] aStringArray2733 = new String[100];

	public Class_ra aClass_ra2731;

	public Class524 aClass524_2727;

	public static int anInt2735;

	public static Class321 aClass321_2734;

	public void method2594(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) 45);
				this.method2607(arg0, arg1, arg2, null, null, null, 0, 0, -1160061587);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "l.r(" + ')');
		}
	}

	public void method2595(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) -33);
				this.method2607(arg0, arg1 - this.aClass524_2727.method6240(arg0, -838393369) / 2, arg2, null, null, null, 0, 0, 621866132);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "l.i(" + ')');
		}
	}

	public int method2596(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Class61[] arg11, int[] arg12, Class_ta arg13, int arg14, int arg15, byte arg16) {
		try {
			if (arg0 == null) {
				return 0;
			}
			this.method2600(arg5, arg6, (byte) 59);
			if (arg9 == 0) {
				arg9 = this.aClass524_2727.anInt6030;
			}
			int[] var18;
			if (arg4 < this.aClass524_2727.anInt6033 + this.aClass524_2727.anInt6035 + arg9 && arg4 < arg9 + arg9) {
				var18 = null;
			} else {
				var18 = new int[] { arg3 };
			}
			int var19 = this.aClass524_2727.method6244(arg0, var18, aStringArray2733, arg11, 1021520411);
			if (arg10 == -1) {
				arg10 = arg4 / arg9;
				if (arg10 <= 0) {
					arg10 = 1;
				}
			}
			if (arg10 > 0 && var19 >= arg10) {
				aStringArray2733[arg10 - 1] = this.aClass524_2727.method6249(aStringArray2733[arg10 - 1], arg3, arg11, 1408471710);
				var19 = arg10;
			}
			if (arg8 == 3 && var19 == 1) {
				arg8 = 1;
			}
			int var20;
			int var21;
			if (arg8 == 0) {
				var20 = arg2 + this.aClass524_2727.anInt6033;
			} else if (arg8 == 1) {
				var20 = (arg4 - this.aClass524_2727.anInt6033 - this.aClass524_2727.anInt6035 - (var19 - 1) * arg9) / 2 + arg2 + this.aClass524_2727.anInt6033;
			} else if (arg8 == 2) {
				var20 = arg2 + arg4 - this.aClass524_2727.anInt6035 - (var19 - 1) * arg9;
			} else {
				var21 = (arg4 - this.aClass524_2727.anInt6033 - this.aClass524_2727.anInt6035 - arg9 * (var19 - 1)) / (var19 + 1);
				if (var21 < 0) {
					var21 = 0;
				}
				var20 = var21 + this.aClass524_2727.anInt6033 + arg2;
				arg9 += var21;
			}
			for (var21 = 0; var21 < var19; var21++) {
				if (arg7 == 0) {
					this.method2607(aStringArray2733[var21], arg1, var20, arg11, arg12, arg13, arg14, arg15, -552819683);
				} else if (arg7 == 1) {
					this.method2607(aStringArray2733[var21], arg1 + (arg3 - this.aClass524_2727.method6240(aStringArray2733[var21], -838393369)) / 2, var20, arg11, arg12, arg13, arg14, arg15, -1687849966);
				} else if (arg7 == 2) {
					this.method2607(aStringArray2733[var21], arg3 + arg1 - this.aClass524_2727.method6240(aStringArray2733[var21], -838393369), var20, arg11, arg12, arg13, arg14, arg15, -277672854);
				} else if (var19 - 1 == var21) {
					this.method2607(aStringArray2733[var21], arg1, var20, arg11, arg12, arg13, arg14, arg15, -1987569454);
				} else {
					this.method2605(aStringArray2733[var21], arg3, -1774757576);
					this.method2607(aStringArray2733[var21], arg1, var20, arg11, arg12, arg13, arg14, arg15, 816303199);
					anInt2721 = 0;
				}
				var20 += arg9;
			}
			return var19;
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "l.o(" + ')');
		}
	}

	public void method2597(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) -53);
				int var8 = arg0.length();
				int[] var9 = new int[var8];
				int[] var10 = new int[var8];
				for (int var11 = 0; var11 < var8; var11++) {
					var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
					var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
				}
				this.method2608(arg0, arg1 - this.aClass524_2727.method6240(arg0, -838393369) / 2, arg2, null, null, var9, var10, (short) 255);
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "l.f(" + ')');
		}
	}

	public void method2598(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, short arg7) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) -126);
				double var9 = 7.0D - (double) arg6 / 8.0D;
				if (var9 < 0.0D) {
					var9 = 0.0D;
				}
				int var11 = arg0.length();
				int[] var12 = new int[var11];
				for (int var13 = 0; var13 < var11; var13++) {
					var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5 / 1.0D) * var9);
				}
				this.method2608(arg0, arg1 - this.aClass524_2727.method6240(arg0, -838393369) / 2, arg2, null, null, null, var12, (short) 255);
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "l.z(" + ')');
		}
	}

	public void method2599(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) 15);
				int var8 = arg0.length();
				int[] var9 = new int[var8];
				for (int var10 = 0; var10 < var8; var10++) {
					var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
				}
				this.method2608(arg0, arg1 - this.aClass524_2727.method6240(arg0, -838393369) / 2, arg2, null, null, null, var9, (short) 255);
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "l.s(" + ')');
		}
	}

	public void method2600(int arg0, int arg1, byte arg2) {
		try {
			anInt2725 = -1;
			anInt2726 = -1;
			anInt2728 = arg0;
			anInt2730 = arg0;
			anInt2721 = 0;
			anInt2732 = 0;
			if (arg1 == -1) {
				arg1 = 0;
			}
			anInt2729 = arg1;
			anInt2722 = arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "l.b(" + ')');
		}
	}

	public void method2601(String arg0, int arg1) {
		try {
			try {
				if (arg0.startsWith("col=")) {
					anInt2730 = anInt2730 & 0xFF000000 | Class16.method449(arg0.substring(4), 16, 78957142) & 0xFFFFFF;
				} else if (arg0.equals("/col")) {
					anInt2730 = anInt2730 & 0xFF000000 | anInt2728 & 0xFFFFFF;
				}
				if (arg0.startsWith("argb=")) {
					anInt2730 = Class16.method449(arg0.substring(5), 16, -687237287);
				} else if (arg0.equals("/argb")) {
					anInt2730 = anInt2728;
				} else if (arg0.startsWith("str=")) {
					anInt2725 = anInt2730 & 0xFF000000 | Class16.method449(arg0.substring(4), 16, -170052481);
				} else if (arg0.equals("str")) {
					anInt2725 = anInt2730 & 0xFF000000 | 0x800000;
				} else if (arg0.equals("/str")) {
					anInt2725 = -1;
				} else if (arg0.startsWith("u=")) {
					anInt2726 = anInt2730 & 0xFF000000 | Class16.method449(arg0.substring(2), 16, -86571507);
				} else if (arg0.equals("u")) {
					anInt2726 = anInt2730 & 0xFF000000;
				} else if (arg0.equals("/u")) {
					anInt2726 = -1;
				} else if (arg0.equalsIgnoreCase("shad=-1")) {
					anInt2722 = 0;
				} else if (arg0.startsWith("shad=")) {
					anInt2722 = anInt2730 & 0xFF000000 | Class16.method449(arg0.substring(5), 16, -724394396);
				} else if (arg0.equals("shad")) {
					anInt2722 = anInt2730 & 0xFF000000;
				} else if (arg0.equals("/shad")) {
					anInt2722 = anInt2729;
				} else if (arg0.equals("br")) {
					this.method2600(anInt2728, anInt2729, (byte) 16);
				}
			} catch (Exception var4) {
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "l.k(" + ')');
		}
	}

	public Class263(Class_ra arg0, Class524 arg1) {
		this.aClass_ra2731 = arg0;
		this.aClass524_2727 = arg1;
	}

	public void method2605(String arg0, int arg1, int arg2) {
		try {
			int var4 = 0;
			boolean var5 = false;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 == '<') {
					var5 = true;
				} else if (var7 == '>') {
					var5 = false;
				} else if (!var5 && var7 == ' ') {
					var4++;
				}
			}
			if (var4 > 0) {
				anInt2721 = (arg1 - this.aClass524_2727.method6240(arg0, -838393369) << 8) / var4;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "l.q(" + ')');
		}
	}

	public int method2606(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6, Class61[] arg7, int[] arg8, int arg9) {
		try {
			if (arg0 == null) {
				return 0;
			}
			arg5.setSeed((long) arg6);
			int var11 = (arg5.nextInt() & 0x1F) + 192;
			this.method2600(var11 << 24 | arg3 & 0xFFFFFF, var11 << 24 | arg4 & 0xFFFFFF, (byte) 37);
			int var12 = arg0.length();
			int[] var13 = new int[var12];
			int var14 = 0;
			for (int var15 = 0; var15 < var12; var15++) {
				var13[var15] = var14;
				if ((arg5.nextInt() & 0x3) == 0) {
					var14++;
				}
			}
			this.method2608(arg0, arg1, arg2, arg7, arg8, var13, null, (short) 255);
			return var14;
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "l.w(" + ')');
		}
	}

	public void method2607(String arg0, int arg1, int arg2, Class61[] arg3, int[] arg4, Class_ta arg5, int arg6, int arg7, int arg8) {
		try {
			int var21 = arg2 - this.aClass524_2727.anInt6030;
			int var10 = -1;
			int var11 = -1;
			int var12 = arg0.length();
			for (int var13 = 0; var13 < var12; var13++) {
				char var14 = (char) (ItemEquipDefinitions.method6216(arg0.charAt(var13), -1206684179) & 0xFF);
				if (var14 == '<') {
					var10 = var13;
				} else {
					if (var14 == '>' && var10 != -1) {
						String var15 = arg0.substring(var10 + 1, var13);
						var10 = -1;
						if (var15.equals("lt")) {
							var14 = '<';
						} else if (var15.equals("gt")) {
							var14 = '>';
						} else if (var15.equals("nbsp")) {
							var14 = 160;
						} else if (var15.equals("shy")) {
							var14 = 173;
						} else if (var15.equals("times")) {
							var14 = 215;
						} else if (var15.equals("euro")) {
							var14 = 8364;
						} else if (var15.equals("copy")) {
							var14 = 169;
						} else {
							if (!var15.equals("reg")) {
								if (var15.startsWith("img=")) {
									try {
										int var16 = Class204.method2185(var15.substring(4), (byte) -22);
										Class61 var17 = arg3[var16];
										int var18 = arg4 == null ? var17.method683() : arg4[var16];
										if ((anInt2730 & -16777216) == -16777216) {
											var17.method688(arg1, var21 + this.aClass524_2727.anInt6030 - var18, 1, -1, 1);
										} else {
											var17.method688(arg1, var21 + this.aClass524_2727.anInt6030 - var18, 0, anInt2730 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += arg3[var16].method318();
										var11 = -1;
									} catch (Exception var19) {
									}
								} else {
									this.method2601(var15, 279865372);
								}
								continue;
							}
							var14 = 174;
						}
					}
					if (var10 == -1) {
						if (var11 != -1) {
							arg1 += this.aClass524_2727.method6250(var11, var14, (byte) -98);
						}
						if (var14 == ' ') {
							if (anInt2721 > 0) {
								anInt2732 += anInt2721;
								arg1 += anInt2732 >> 8;
								anInt2732 &= 0xFF;
							}
						} else if (arg5 == null) {
							if ((anInt2722 & 0xFF000000) != 0) {
								this.UA(var14, arg1 + 1, var21 + 1, anInt2722, true);
							}
							this.UA(var14, arg1, var21, anInt2730, false);
						} else {
							if ((anInt2722 & 0xFF000000) != 0) {
								this.method2602(var14, arg1 + 1, var21 + 1, anInt2722, true, arg5, arg6, arg7);
							}
							this.method2602(var14, arg1, var21, anInt2730, false, arg5, arg6, arg7);
						}
						int var22 = this.aClass524_2727.method6241(var14, -1638364719);
						if (anInt2725 != -1) {
							this.aClass_ra2731.method4792(arg1, (int) ((double) this.aClass524_2727.anInt6030 * 0.7D) + var21, var22, anInt2725, (short) 255);
						}
						if (anInt2726 != -1) {
							this.aClass_ra2731.method4792(arg1, var21 + 1 + this.aClass524_2727.anInt6030, var22, anInt2726, (short) 255);
						}
						arg1 += var22;
						var11 = var14;
					}
				}
			}
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "l.u(" + ')');
		}
	}

	public void method2608(String arg0, int arg1, int arg2, Class61[] arg3, int[] arg4, int[] arg5, int[] arg6, short arg7) {
		try {
			int var23 = arg2 - this.aClass524_2727.anInt6030;
			int var9 = -1;
			int var10 = -1;
			int var11 = 0;
			int var12 = arg0.length();
			for (int var13 = 0; var13 < var12; var13++) {
				char var14 = (char) (ItemEquipDefinitions.method6216(arg0.charAt(var13), -610719025) & 0xFF);
				if (var14 == '<') {
					var9 = var13;
				} else {
					int var16;
					int var17;
					if (var14 == '>' && var9 != -1) {
						String var15 = arg0.substring(var9 + 1, var13);
						var9 = -1;
						if (var15.equals("lt")) {
							var14 = '<';
						} else if (var15.equals("gt")) {
							var14 = '>';
						} else if (var15.equals("nbsp")) {
							var14 = 160;
						} else if (var15.equals("shy")) {
							var14 = 173;
						} else if (var15.equals("times")) {
							var14 = 215;
						} else if (var15.equals("euro")) {
							var14 = 8364;
						} else if (var15.equals("copy")) {
							var14 = 169;
						} else {
							if (!var15.equals("reg")) {
								if (var15.startsWith("img=")) {
									try {
										if (arg5 == null) {
											var16 = 0;
										} else {
											var16 = arg5[var11];
										}
										if (arg6 == null) {
											var17 = 0;
										} else {
											var17 = arg6[var11];
										}
										var11++;
										int var18 = Class204.method2185(var15.substring(4), (byte) -91);
										Class61 var19 = arg3[var18];
										int var20 = arg4 == null ? var19.method683() : arg4[var18];
										var19.method688(var16 + arg1, this.aClass524_2727.anInt6030 + var23 - var20 + var17, 1, -1, 1);
										arg1 += arg3[var18].method318();
										var10 = -1;
									} catch (Exception var21) {
									}
								} else {
									this.method2601(var15, 884546550);
								}
								continue;
							}
							var14 = 174;
						}
					}
					if (var9 == -1) {
						if (var10 != -1) {
							arg1 += this.aClass524_2727.method6250(var10, var14, (byte) 76);
						}
						int var24;
						if (arg5 == null) {
							var24 = 0;
						} else {
							var24 = arg5[var11];
						}
						if (arg6 == null) {
							var16 = 0;
						} else {
							var16 = arg6[var11];
						}
						var11++;
						if (var14 != ' ') {
							if ((anInt2722 & 0xFF000000) != 0) {
								this.UA(var14, var24 + 1 + arg1, var23 + 1 + var16, anInt2722, true);
							}
							this.UA(var14, arg1 + var24, var23 + var16, anInt2730, false);
						} else if (anInt2721 > 0) {
							anInt2732 += anInt2721;
							arg1 += anInt2732 >> 8;
							anInt2732 &= 0xFF;
						}
						var17 = this.aClass524_2727.method6241(var14, -1594412680);
						if (anInt2725 != -1) {
							this.aClass_ra2731.method4792(arg1, var23 + (int) ((double) this.aClass524_2727.anInt6030 * 0.7D), var17, anInt2725, (short) 255);
						}
						if (anInt2726 != -1) {
							this.aClass_ra2731.method4792(arg1, var23 + this.aClass524_2727.anInt6030, var17, anInt2726, (short) 255);
						}
						arg1 += var17;
						var10 = var14;
					}
				}
			}
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "l.g(" + ')');
		}
	}

	public int method2611(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11, Class61[] arg12, int[] arg13, int arg14) {
		try {
			if (arg0 == null) {
				return 0;
			}
			arg9.setSeed((long) arg10);
			int var16 = (arg9.nextInt() & 0x1F) + 192;
			this.method2600(var16 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : var16 << 24 | arg6 & 0xFFFFFF, (byte) -47);
			int var17 = arg0.length();
			int[] var18 = new int[var17];
			int var19 = 0;
			int var20;
			for (var20 = 0; var20 < var17; var20++) {
				var18[var20] = var19;
				if ((arg9.nextInt() & 0x3) == 0) {
					var19++;
				}
			}
			var20 = arg1;
			int var21 = arg2 + this.aClass524_2727.anInt6033;
			int var22 = -1;
			if (arg8 == 1) {
				var21 += (arg4 - this.aClass524_2727.anInt6033 - this.aClass524_2727.anInt6035) / 2;
			} else if (arg8 == 2) {
				var21 = arg2 + arg4 - this.aClass524_2727.anInt6035;
			}
			if (arg7 == 1) {
				var22 = this.aClass524_2727.method6240(arg0, -838393369) + var19;
				var20 = arg1 + (arg3 - var22) / 2;
			} else if (arg7 == 2) {
				var22 = this.aClass524_2727.method6240(arg0, -838393369) + var19;
				var20 = arg1 + (arg3 - var22);
			}
			this.method2608(arg0, var20, var21, arg12, arg13, var18, null, (short) 255);
			if (arg11 != null) {
				if (var22 == -1) {
					var22 = this.aClass524_2727.method6240(arg0, -838393369) + var19;
				}
				arg11[0] = var20;
				arg11[1] = var21 - this.aClass524_2727.anInt6033;
				arg11[2] = var22;
				arg11[3] = this.aClass524_2727.anInt6033 + this.aClass524_2727.anInt6035;
			}
			return var19;
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "l.l(" + ')');
		}
	}

	public void method2612(String arg0, int arg1, int arg2, int arg3, int arg4, short arg5) {
		try {
			if (arg0 != null) {
				this.method2600(arg3, arg4, (byte) -41);
				this.method2607(arg0, arg1 - this.aClass524_2727.method6240(arg0, -838393369), arg2, null, null, null, 0, 0, 613754622);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "l.j(" + ')');
		}
	}

	public int method2613(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Class61[] arg10, int[] arg11, Class_ta arg12, int arg13, int arg14, byte arg15) {
		try {
			return this.method2596(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, (byte) 57);
		} catch (RuntimeException var18) {
			throw Class476.method5964(var18, "l.p(" + ')');
		}
	}

	public static boolean method2614(char arg0, int arg1) {
		try {
			return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "l.u(" + ')');
		}
	}

	public static void method2615(Interface33 arg0, int arg1) {
		try {
			if (Class544.anInterface33_6256 != null) {
				throw new IllegalStateException("");
			}
			Class544.anInterface33_6256 = arg0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "l.r(" + ')');
		}
	}

	public static final void method2616(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (var2 > 255 || var2 < 0) {
				var2 = 0;
			}
			if (var2 != Class448.aClass330_Sub50_5555.aClass464_Sub15_7902.method5792(981226512)) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub15_7902, var2, 29066049);
				Class435.method5568(1135605581);
				client.aBoolean9194 = false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "l.ali(" + ')');
		}
	}

	public static final void method2617(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			Class381 var6 = client.aClass304_9030.method3022(-507443443);
			Class437.method5587((var2 >> 14 & 0x3FFF) - var6.gameSceneBaseX, (var2 & 0x3FFF) - var6.gameSceneBaseY, var3 << 2, var4, var5, false, (byte) 14);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "l.agd(" + ')');
		}
	}

	public static final void method2618(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			if (var2 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.length();
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "l.aar(" + ')');
		}
	}

	public static void method2619(Class_ra arg0, long arg1) {
		try {
			Class391.anInt4059 = Class391.anInt4058;
			Class391.anInt4058 = 0;
			Class312.method3111((byte) 102);
			Iterator var3 = Class391.aList4056.iterator();
			while (var3.hasNext()) {
				Class388 var4 = (Class388) var3.next();
				boolean var5 = var4.method4561(arg0, arg1);
				if (!var5) {
					var3.remove();
					Class50.aClass388Array482[Class391.anInt4057] = var4;
					Class391.anInt4057 = Class391.anInt4057 + 1 & Class91.anIntArray821[Class391.anInt4053];
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "l.j(" + ')');
		}
	}

	@ObfuscatedName("Class263.c(CIIIZ)V")
	public abstract void c(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("Class263.UA(CIIIZ)V")
	public abstract void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	public abstract void method2602(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	public abstract void method2603(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	public abstract void method2604(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	public abstract void method2609(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);

	public abstract void method2610(char arg0, int arg1, int arg2, int arg3, boolean arg4, Class_ta arg5, int arg6, int arg7);
}
