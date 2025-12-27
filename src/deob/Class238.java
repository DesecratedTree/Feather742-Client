package deob;

public class Class238 {

	public int anInt2581;

	public int anInt2582;

	public static Class355 aClass355_2583;

	public void method2369(int arg0, int arg1) {
		try {
			this.anInt2581 = arg0;
			this.anInt2582 = 0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "k.j(" + ')');
		}
	}

	public int method2370(int arg0) {
		try {
			return this.anInt2581 & 0x3FFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "k.i(" + ')');
		}
	}

	public void method2371(int arg0) {
		try {
			this.anInt2581 &= 0x3FFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "k.p(" + ')');
		}
	}

	public boolean method2372(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = this.anInt2582;
			if (this.anInt2581 == arg0 && this.anInt2582 == 0) {
				return false;
			}
			boolean var6;
			int var7;
			if (this.anInt2582 == 0) {
				if (arg0 > this.anInt2581 && arg0 <= this.anInt2581 + arg1 || arg0 < this.anInt2581 && arg0 >= this.anInt2581 - arg1) {
					this.anInt2581 = arg0;
					return false;
				}
				var6 = true;
			} else {
				int var8;
				if (this.anInt2582 > 0 && arg0 > this.anInt2581) {
					var7 = this.anInt2582 * this.anInt2582 / (arg1 * 2);
					var8 = var7 + this.anInt2581;
					if (var8 < arg0 && var8 >= this.anInt2581) {
						var6 = true;
					} else {
						var6 = false;
					}
				} else if (this.anInt2582 < 0 && arg0 < this.anInt2581) {
					var7 = this.anInt2582 * this.anInt2582 / (arg1 * 2);
					var8 = this.anInt2581 - var7;
					if (var8 > arg0 && var8 <= this.anInt2581) {
						var6 = true;
					} else {
						var6 = false;
					}
				} else {
					var6 = false;
				}
			}
			if (var6) {
				if (arg0 > this.anInt2581) {
					this.anInt2582 += arg1;
					if (arg2 != 0 && this.anInt2582 > arg2) {
						this.anInt2582 = arg2;
					}
				} else {
					this.anInt2582 -= arg1;
					if (arg2 != 0 && this.anInt2582 < -arg2) {
						this.anInt2582 = -arg2;
					}
				}
				if (var5 != this.anInt2582) {
					var7 = this.anInt2582 * this.anInt2582 / (arg1 * 2);
					if (arg0 > this.anInt2581) {
						if (this.anInt2581 + var7 > arg0) {
							this.anInt2582 = var5;
						}
					} else if (arg0 < this.anInt2581 && this.anInt2581 - var7 < arg0) {
						this.anInt2582 = var5;
					}
				}
			} else if (this.anInt2582 > 0) {
				this.anInt2582 -= arg1;
				if (this.anInt2582 < 0) {
					this.anInt2582 = 0;
				}
			} else {
				this.anInt2582 += arg1;
				if (this.anInt2582 > 0) {
					this.anInt2582 = 0;
				}
			}
			this.anInt2581 += var5 + this.anInt2582 >> 1;
			return var6;
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "k.r(" + ')');
		}
	}

	public static final void method2373(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 544580868);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class201_Sub2.method2170(var3, var4, arg0, 1612451864);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "k.ex(" + ')');
		}
	}

	public static final void method2374(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1230262886);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt1264;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "k.sb(" + ')');
		}
	}

	public static void method2375(Class_ra arg0, Interface_ma arg1, int arg2, int arg3, int arg4, int arg5, short arg6) {
		try {
			if (Class354_Sub1.anInt7977 < 100) {
				IsaacCipher.method6050(arg0, arg1, 1100916704);
			}
			arg0.r(arg2, arg3, arg4 + arg2, arg5 + arg3);
			int var8;
			int var9;
			if (Class354_Sub1.anInt7977 < 100) {
				byte var7 = 20;
				var8 = arg2 + arg4 / 2;
				var9 = arg5 / 2 + arg3 - 18 - var7;
				arg0.B(arg2, arg3, arg4, arg5, -16777216, 0);
				arg0.bl(var8 - 152, var9, 304, 34, client.aColorArray9006[client.anInt8957].getRGB(), 0);
				arg0.B(var8 - 150, var9 + 2, Class354_Sub1.anInt7977 * 3, 30, client.aColorArray9005[client.anInt8957].getRGB(), 0);
				Class166_Sub3_Sub2.aClass263_9483.method2595(Class526.aClass526_6154.method6257(Class429.aClass454_4369, 991479434), var8, var7 + var9, client.aColorArray9007[client.anInt8957].getRGB(), -1, 1346047438);
			} else {
				int var18 = Class204.anInt6517 - (int) ((float) arg4 / Class354_Sub1.aFloat3507);
				var8 = Class149_Sub1.anInt8867 + (int) ((float) arg5 / Class354_Sub1.aFloat3507);
				var9 = (int) ((float) arg4 / Class354_Sub1.aFloat3507) + Class204.anInt6517;
				int var10 = Class149_Sub1.anInt8867 - (int) ((float) arg5 / Class354_Sub1.aFloat3507);
				Class557.anInt6399 = Class204.anInt6517 - (int) ((float) arg4 / Class354_Sub1.aFloat3507);
				Class475.anInt5701 = Class149_Sub1.anInt8867 - (int) ((float) arg5 / Class354_Sub1.aFloat3507);
				Class379.anInt3953 = (int) ((float) (arg4 * 2) / Class354_Sub1.aFloat3507);
				Class525.anInt6037 = (int) ((float) (arg5 * 2) / Class354_Sub1.aFloat3507);
				Class354_Sub1.method4090(var18 + Class354_Sub1.anInt3510, var8 + Class354_Sub1.anInt3516, Class354_Sub1.anInt3510 + var9, var10 + Class354_Sub1.anInt3516, arg2, arg3, arg2 + arg4, arg3 + 1 + arg5);
				Class354_Sub1.method4091(arg0);
				Class471 var11 = Class354_Sub1.method4098(arg0);
				Class398.method4687(arg0, var11, 0, 0, (byte) 113);
				if (Class448.anInt5556 > 0) {
					Class101.anInt6456--;
					if (Class101.anInt6456 == 0) {
						Class448.anInt5556--;
						Class101.anInt6456 = 20;
					}
				}
				if (client.aBoolean8983) {
					int var12 = arg4 + arg2 - 5;
					int var13 = arg3 + arg5 - 8;
					Class464_Sub22.aClass263_8709.method2612("Fps:" + Class332.anInt6603, var12, var13, 16776960, -1, (short) 3376);
					int var19 = var13 - 15;
					Runtime var14 = Runtime.getRuntime();
					int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
					int var16 = 16776960;
					if (var15 > 65536) {
						var16 = 16711680;
					}
					Class464_Sub22.aClass263_8709.method2612("Mem:" + var15 + "k", var12, var19, var16, -1, (short) 1882);
					var13 = var19 - 15;
				}
			}
		} catch (RuntimeException var17) {
			throw Class476.method5964(var17, "k.ce(" + ')');
		}
	}

	public static boolean method2376(int arg0, int arg1) {
		try {
			return arg0 == 59 || arg0 == 2 || arg0 == 8 || arg0 == 17 || arg0 == 15 || arg0 == 16 || arg0 == 58;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "k.bn(" + ')');
		}
	}

	public static Class330_Sub34 method2377(OutgoingPacket arg0, IsaacCipher arg1, int arg2) {
		try {
			Class330_Sub34 var3 = Class239.method2383((byte) 64);
			var3.aClass234_7732 = arg0;
			var3.anInt7728 = arg0.anInt2577;
			if (var3.anInt7728 == -1) {
				var3.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(260);
			} else if (var3.anInt7728 == -2) {
				var3.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(10000);
			} else if (var3.anInt7728 <= 18) {
				var3.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(20);
			} else if (var3.anInt7728 <= 98) {
				var3.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(100);
			} else {
				var3.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(260);
			}
			var3.aClass330_Sub46_Sub2_7729.method3821(arg1, -398103403);
			var3.aClass330_Sub46_Sub2_7729.method3822(var3.aClass234_7732.anInt2576, -1034808700);
			var3.anInt7730 = 0;
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "k.j(" + ')');
		}
	}

	public static final void method2378(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class475_Sub5.method5958(client.anInt8995, 885477300) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "k.agk(" + ')');
		}
	}
}
