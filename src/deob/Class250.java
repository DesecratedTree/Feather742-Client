package deob;

public class Class250 {

	public static int anInt2632 = 0;

	public static int anInt2634 = 0;

	public static Class517[] aClass517Array2633;

	public Class250() throws Throwable {
		throw new Error();
	}

	public static final void method2517(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.anInt1184 = arg2.anIntArray4387[--arg2.anInt4376];
			Class404.method4738(arg0, 686299640);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "kl.df(" + ')');
		}
	}

	public static final void method2518(Class430 arg0, int arg1) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub5_7890, arg0.anIntArray4387[--arg0.anInt4376], -1630172240);
			Class435.method5568(2128983981);
			client.aBoolean8992 = true;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kl.aka(" + ')');
		}
	}

	public static void method2519(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 2] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -1805071030).anIntArrayArray4094[arg0.anIntArray4387[arg0.anInt4376 - 1]][1];
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kl.q(" + ')');
		}
	}

	public static final void method2520(byte arg0) {
		try {
			int var1 = Class204_Sub1.anInt8947 * 512 + 256;
			int var2 = Class151.anInt6671 * 512 + 256;
			int var3 = Class431.method5342(var1, var2, Class85.anInt712, 1996761881) - Class432_Sub1_Sub5_Sub1.anInt9963;
			if (Class544.anInt6257 >= 100) {
				Class471.anInt5612 = Class204_Sub1.anInt8947 * 512 + 256;
				Class325_Sub3.anInt7484 = Class151.anInt6671 * 512 + 256;
				Gfx.anInt578 = Class431.method5342(Class471.anInt5612, Class325_Sub3.anInt7484, Class85.anInt712, 1996761881) - Class432_Sub1_Sub5_Sub1.anInt9963;
			} else {
				if (Class471.anInt5612 < var1) {
					Class471.anInt5612 += Class511.anInt5955 + (var1 - Class471.anInt5612) * Class544.anInt6257 / 1000;
					if (Class471.anInt5612 > var1) {
						Class471.anInt5612 = var1;
					}
				}
				if (Class471.anInt5612 > var1) {
					Class471.anInt5612 -= Class511.anInt5955 + Class544.anInt6257 * (Class471.anInt5612 - var1) / 1000;
					if (Class471.anInt5612 < var1) {
						Class471.anInt5612 = var1;
					}
				}
				if (Gfx.anInt578 < var3) {
					Gfx.anInt578 += (var3 - Gfx.anInt578) * Class544.anInt6257 / 1000 + Class511.anInt5955;
					if (Gfx.anInt578 > var3) {
						Gfx.anInt578 = var3;
					}
				}
				if (Gfx.anInt578 > var3) {
					Gfx.anInt578 -= Class511.anInt5955 + Class544.anInt6257 * (Gfx.anInt578 - var3) / 1000;
					if (Gfx.anInt578 < var3) {
						Gfx.anInt578 = var3;
					}
				}
				if (Class325_Sub3.anInt7484 < var2) {
					Class325_Sub3.anInt7484 += Class511.anInt5955 + Class544.anInt6257 * (var2 - Class325_Sub3.anInt7484) / 1000;
					if (Class325_Sub3.anInt7484 > var2) {
						Class325_Sub3.anInt7484 = var2;
					}
				}
				if (Class325_Sub3.anInt7484 > var2) {
					Class325_Sub3.anInt7484 -= Class511.anInt5955 + Class544.anInt6257 * (Class325_Sub3.anInt7484 - var2) / 1000;
					if (Class325_Sub3.anInt7484 < var2) {
						Class325_Sub3.anInt7484 = var2;
					}
				}
			}
			var1 = Class150_Sub2.anInt7270 * 512 + 256;
			var2 = Class330_Sub39.anInt7766 * 512 + 256;
			var3 = Class431.method5342(var1, var2, Class85.anInt712, 1996761881) - Class366.anInt3856;
			int var4 = var1 - Class471.anInt5612;
			int var5 = var3 - Gfx.anInt578;
			int var6 = var2 - Class325_Sub3.anInt7484;
			int var7 = (int) Math.sqrt((double) (var6 * var6 + var4 * var4));
			int var8 = (int) (Math.atan2((double) var5, (double) var7) * 2607.5945876176133D) & 0x3FFF;
			int var9 = (int) (Math.atan2((double) var4, (double) var6) * -2607.5945876176133D) & 0x3FFF;
			if (var8 < 1024) {
				var8 = 1024;
			}
			if (var8 > 3072) {
				var8 = 3072;
			}
			if (Class321.anInt7018 < var8) {
				Class321.anInt7018 += Class355.anInt3638 + Class18.anInt238 * (var8 - Class321.anInt7018 >> 3) / 1000 << 3;
				if (Class321.anInt7018 > var8) {
					Class321.anInt7018 = var8;
				}
			}
			if (Class321.anInt7018 > var8) {
				Class321.anInt7018 -= Class355.anInt3638 + (Class321.anInt7018 - var8 >> 3) * Class18.anInt238 / 1000 << 3;
				if (Class321.anInt7018 < var8) {
					Class321.anInt7018 = var8;
				}
			}
			int var10 = var9 - Class145_Sub1.anInt7266;
			if (var10 > 8192) {
				var10 -= 16384;
			}
			if (var10 < -8192) {
				var10 += 16384;
			}
			var10 >>= 0x3;
			if (var10 > 0) {
				Class145_Sub1.anInt7266 += Class355.anInt3638 + Class18.anInt238 * var10 / 1000 << 3;
				Class145_Sub1.anInt7266 &= 0x3FFF;
			}
			if (var10 < 0) {
				Class145_Sub1.anInt7266 -= -var10 * Class18.anInt238 / 1000 + Class355.anInt3638 << 3;
				Class145_Sub1.anInt7266 &= 0x3FFF;
			}
			int var11 = var9 - Class145_Sub1.anInt7266;
			if (var11 > 8192) {
				var11 -= 16384;
			}
			if (var11 < -8192) {
				var11 += 16384;
			}
			if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
				Class145_Sub1.anInt7266 = var9;
			}
			Class119.anInt1399 = 0;
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "kl.hi(" + ')');
		}
	}

	public static void method2521(int arg0, int arg1, int arg2, Class473 arg3, int arg4) {
		try {
			for (Class330_Sub20 var5 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5869(539664854); var5 != null; var5 = (Class330_Sub20) Class330_Sub20.aClass471_7649.method5873((byte) -124)) {
				if (arg0 == var5.anInt7652 && arg1 << 9 == var5.anInt7671 && arg2 << 9 == var5.anInt7654 && var5.aClass473_7682.anInt5657 == arg3.anInt5657) {
					if (var5.aClass330_Sub40_Sub3_7675 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(var5.aClass330_Sub40_Sub3_7675);
						var5.aClass330_Sub40_Sub3_7675 = null;
					}
					if (var5.aClass330_Sub40_Sub3_7683 != null) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(var5.aClass330_Sub40_Sub3_7683);
						var5.aClass330_Sub40_Sub3_7683 = null;
					}
					var5.method3252(-1325822971);
					break;
				}
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "kl.o(" + ')');
		}
	}

	public static final void method2522(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub23_7908.method5716(var2, 355597968);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "kl.aqq(" + ')');
		}
	}
}
