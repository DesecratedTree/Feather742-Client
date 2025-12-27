package deob;

import java.awt.Point;

public class Class373 {

	public Class373() throws Throwable {
		throw new Error();
	}

	public static void method4336(float arg0, Class260 arg1, Class244 arg2, Class260 arg3, Class260 arg4, Class260 arg5, Class260 arg6, float arg7, float arg8, int arg9) {
		try {
			if (!arg3.method2555(arg1)) {
				Class260 var10 = Class260.method2577(0.0F, 0.0F, 0.0F);
				Class260 var11 = Class260.method2549(Class260.method2561(arg3, arg1));
				var11.method2570(arg2);
				Class260 var12 = Class260.method2561(var11, var10);
				float var13 = var12.method2565();
				if (arg7 > 0.0F) {
					arg5 = Class260.method2549(arg5);
					arg5.method2567(var13 / arg7 * arg8);
				}
				if (arg5.aFloat2716 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat2716) || var13 > 5120.0F) {
					arg1.method2582(arg3);
					arg4.method2554();
				} else {
					arg2.method2423();
					Class260 var14 = Class260.method2577(1.0F, 0.0F, 0.0F);
					Class260 var15 = Class260.method2577(0.0F, 1.0F, 0.0F);
					Class260 var16 = Class260.method2577(0.0F, 0.0F, 1.0F);
					var14.method2570(arg2);
					var15.method2570(arg2);
					var16.method2570(arg2);
					Class260 var17 = Class260.method2577(Class260.method2562(var14, arg4), Class260.method2562(var15, arg4), Class260.method2562(var16, arg4));
					Class260 var18 = Class260.method2549(var17);
					var18.method2551();
					Class260 var19 = Class260.method2568(Class260.method2566(var18, var18), Class260.method2574(arg5, 2.0F));
					Class260 var20 = Class260.method2549(var12);
					var20.method2551();
					Class260 var21 = Class260.method2549(var17);
					if (var19.aFloat2716 > var20.aFloat2716) {
						if (var12.aFloat2716 < 0.0F) {
							var21.aFloat2716 += arg0 * arg5.aFloat2716;
							if (var21.aFloat2716 > 0.0F) {
								var21.aFloat2716 = 0.0F;
							}
						} else {
							var21.aFloat2716 -= arg5.aFloat2716 * arg0;
							if (var21.aFloat2716 < 0.0F) {
								var21.aFloat2716 = 0.0F;
							}
						}
					} else if (var18.aFloat2716 < arg6.aFloat2716) {
						if (var12.aFloat2716 < 0.0F) {
							var21.aFloat2716 -= arg5.aFloat2716 * arg0;
							if (var21.aFloat2716 < -arg6.aFloat2716) {
								var21.aFloat2716 = -arg6.aFloat2716;
							}
						} else {
							var21.aFloat2716 += arg5.aFloat2716 * arg0;
							if (var21.aFloat2716 > arg6.aFloat2716) {
								var21.aFloat2716 = arg6.aFloat2716;
							}
						}
					}
					if (var19.aFloat2715 > var20.aFloat2715) {
						if (var12.aFloat2715 < 0.0F) {
							var21.aFloat2715 += arg0 * arg5.aFloat2715;
							if (var21.aFloat2715 > 0.0F) {
								var21.aFloat2715 = 0.0F;
							}
						} else {
							var21.aFloat2715 -= arg0 * arg5.aFloat2715;
							if (var21.aFloat2715 < 0.0F) {
								var21.aFloat2715 = 0.0F;
							}
						}
					} else if (var18.aFloat2715 < arg6.aFloat2715) {
						if (var12.aFloat2715 < 0.0F) {
							var21.aFloat2715 -= arg5.aFloat2715 * arg0;
							if (var21.aFloat2715 < -arg6.aFloat2715) {
								var21.aFloat2715 = -arg6.aFloat2715;
							}
						} else {
							var21.aFloat2715 += arg5.aFloat2715 * arg0;
							if (var21.aFloat2715 > arg6.aFloat2715) {
								var21.aFloat2715 = arg6.aFloat2715;
							}
						}
					}
					if (var19.aFloat2711 > var20.aFloat2711) {
						if (var12.aFloat2711 < 0.0F) {
							var21.aFloat2711 += arg0 * arg5.aFloat2711;
							if (var21.aFloat2711 > 0.0F) {
								var21.aFloat2711 = 0.0F;
							}
						} else {
							var21.aFloat2711 -= arg0 * arg5.aFloat2711;
							if (var21.aFloat2711 < 0.0F) {
								var21.aFloat2711 = 0.0F;
							}
						}
					} else if (var18.aFloat2711 < arg6.aFloat2711) {
						if (var12.aFloat2711 < 0.0F) {
							var21.aFloat2711 -= arg0 * arg5.aFloat2711;
							if (var21.aFloat2711 < -arg6.aFloat2711) {
								var21.aFloat2711 = -arg6.aFloat2711;
							}
						} else {
							var21.aFloat2711 += arg0 * arg5.aFloat2711;
							if (var21.aFloat2711 > arg6.aFloat2711) {
								var21.aFloat2711 = arg6.aFloat2711;
							}
						}
					}
					Class260 var22 = Class260.method2574(var14, var21.aFloat2716);
					var22.method2571(var15, var21.aFloat2715);
					var22.method2571(var16, var21.aFloat2711);
					arg4.method2572(var22, 0.8F);
					if (var13 < 10.0F) {
						arg1.method2582(arg3);
						arg4.method2554();
					} else {
						arg1.method2558(Class260.method2574(arg4, arg0));
					}
					var18.method2550();
					var21.method2550();
					var20.method2550();
				}
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "pn.r(" + ')');
		}
	}

	public static final void method4337(Class430 arg0, short arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aBoolean8958 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "pn.va(" + ')');
		}
	}

	public static void method4338(int arg0) {
		try {
			if (Class433.method5559(1659542781)) {
				Class396.method4654(new Class392(), 1602058384);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "pn.r(" + ')');
		}
	}

	public static void method4339(int arg0, byte arg1) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub29_7903.method5839((short) 255) == 0) {
				arg0 = -1;
			}
			if (arg0 != client.anInt9201) {
				if (arg0 != -1) {
					Class529 var2 = Class363.aClass527_3806.method6264(arg0, -1717317299);
					Class87 var3 = var2.method6275(-2096599180);
					if (var3 == null) {
						arg0 = -1;
					} else {
						Gfx.aClass323_577.method3179(Class475.aCanvas5700, var3.method1031(true), var3.method993(), var3.method1045(), new Point(var2.anInt6219, var2.anInt6221));
						client.anInt9201 = arg0;
					}
				}
				if (arg0 == -1 && client.anInt9201 != -1) {
					Gfx.aClass323_577.method3179(Class475.aCanvas5700, null, -1, -1, new Point());
					client.anInt9201 = -1;
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "pn.gw(" + ')');
		}
	}
}
