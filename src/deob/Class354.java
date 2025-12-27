package deob;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Class354 {

	public static Class497 aClass497_3512 = new Class497(16);

	public static int anInt3500 = (int) (Math.random() * 11.0D) - 5;

	public static int anInt3501 = (int) (Math.random() * 17.0D) - 8;

	public static int[] anIntArray3504 = new int[1];

	public static byte[] aByteArray3505 = new byte[1];

	public static Class471 aClass471_3509 = new Class471();

	public static float aFloat3507;

	public static float aFloat3520;

	public static int anInt3494;

	public static int anInt3510;

	public static int anInt3511;

	public static int anInt3513;

	public static int anInt3514;

	public static int anInt3516;

	public static int anInt3521;

	public static int anInt3523;

	public static int anInt3524;

	public static int anInt3526;

	public static int anInt3527;

	public static int anInt3528;

	public static int anInt3530;

	public static Class330_Sub36_Sub12 aClass330_Sub36_Sub12_3497;

	public static Class351 aClass351_3508;

	public static Class380 aClass380_3529;

	public static Class418 aClass418_3517;

	public static Class463 aClass463_3515;

	public static Class499 aClass499_3492;

	public static Class552 aClass552_3493;

	public static IndexTable aClass280_3498;

	public static Interface29 anInterface29_3496;

	public static byte[] aByteArray3491;

	public static byte[] aByteArray3503;

	public static byte[] aByteArray3506;

	public static byte[] aByteArray3518;

	public static byte[] aByteArray3519;

	public static int[] anIntArray3499;

	public static Object[] anObjectArray3525;

	public static short[] aShortArray3495;

	public static byte[][][] aByteArrayArrayArray3502;

	public static ArrayList[][][] anArrayListArrayArrayArray3522;

	public static Class472 method4082(int arg0, int arg1) {
		Class472 var2 = new Class472();
		for (Class330_Sub36_Sub12 var3 = (Class330_Sub36_Sub12) aClass497_3512.method6099((byte) -14); var3 != null; var3 = (Class330_Sub36_Sub12) aClass497_3512.method6098((short) -32768)) {
			if (var3.aBoolean9713 && var3.method3480(arg0, arg1, 186068006)) {
				var2.method5883(var3, -2014201527);
			}
		}
		return var2;
	}

	public static Class330_Sub36_Sub12 method4083(int arg0) {
		return (Class330_Sub36_Sub12) aClass497_3512.method6094((long) arg0);
	}

	public static void method4084(Class_ra arg0, Buffer arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var8 = arg1.readUnsignedByte(1894579091);
		if ((var8 & 0x1) == 0) {
			boolean var9 = (var8 & 0x2) == 0;
			int var10 = var8 >> 2 & 0x3F;
			if (var10 != 62) {
				if (var10 == 63) {
					var10 = arg1.readUnsignedByte(1222543454);
				} else if (var9) {
					var10 = arg6[var10];
				} else {
					var10 = arg7[var10];
				}
				if (var9) {
					aByteArray3503[arg4 + arg5 * anInt3524] = (byte) var10;
					aByteArray3518[arg4 + arg5 * anInt3524] = 0;
				} else {
					aByteArray3518[arg4 + arg5 * anInt3524] = (byte) var10;
					aByteArray3519[arg4 + arg5 * anInt3524] = 0;
					aByteArray3503[arg4 + arg5 * anInt3524] = arg1.readByte((byte) -24);
				}
			}
			return;
		}
		int var20 = (var8 >> 1 & 0x3) + 1;
		boolean var21 = (var8 & 0x8) != 0;
		boolean var11 = (var8 & 0x10) != 0;
		for (int var12 = 0; var12 < var20; var12++) {
			int var13 = arg1.readUnsignedByte(971991338);
			int var14 = 0;
			int var15 = 0;
			if (var21) {
				var14 = arg1.readUnsignedByte(1500204813);
				var15 = arg1.readUnsignedByte(1789880578);
			}
			int var16 = 0;
			if (var11) {
				var16 = arg1.readUnsignedByte(70912409);
			}
			int[] var17;
			byte[] var18;
			int var19;
			if (var12 == 0) {
				aByteArray3503[arg4 + arg5 * anInt3524] = (byte) var13;
				aByteArray3518[arg4 + arg5 * anInt3524] = (byte) var14;
				aByteArray3519[arg4 + arg5 * anInt3524] = (byte) var15;
				if (var16 == 1) {
					anObjectArray3525[arg4 + arg5 * anInt3524] = Integer.valueOf(arg1.readBigSmart(-1416659845));
					aByteArray3491[arg4 + arg5 * anInt3524] = arg1.readByte((byte) 89);
				} else if (var16 > 1) {
					var17 = new int[var16];
					var18 = new byte[var16];
					for (var19 = 0; var19 < var16; var19++) {
						var17[var19] = arg1.readBigSmart(-1172089841);
						var18[var19] = arg1.readByte((byte) -75);
					}
					anObjectArray3525[arg4 + arg5 * anInt3524] = new Class330_Sub30(var17, var18);
				}
			} else {
				var17 = null;
				var18 = null;
				if (var16 > 0) {
					var17 = new int[var16];
					var18 = new byte[var16];
					for (var19 = 0; var19 < var16; var19++) {
						var17[var19] = arg1.readBigSmart(-754013505);
						var18[var19] = arg1.readByte((byte) 112);
					}
				}
				if (anArrayListArrayArrayArray3522[var12 - 1][arg2 - (anInt3510 >> 6)][arg3 - (anInt3516 >> 6)] == null) {
					anArrayListArrayArrayArray3522[var12 - 1][arg2 - (anInt3510 >> 6)][arg3 - (anInt3516 >> 6)] = new ArrayList();
				}
				Class322 var22 = new Class322(arg4 & 0x3F, arg5 & 0x3F, var13, var14, var15, var17, var18);
				anArrayListArrayArrayArray3522[var12 - 1][arg2 - (anInt3510 >> 6)][arg3 - (anInt3516 >> 6)].add(var22);
			}
		}
	}

	public static int method4085(Interface_ma arg0, int arg1, int arg2, int arg3) {
		Class425 var4 = aClass418_3517.method5271(arg1, -2022786456);
		if (var4 == null) {
			return 0;
		}
		int var5 = var4.anInt4331;
		if (var5 >= 0 && arg0.method221(var5, 1093520953).aBoolean533) {
			var5 = -1;
		}
		int var6;
		int var7;
		int var8;
		int var9;
		if (var4.anInt4340 >= 0) {
			var7 = var4.anInt4340;
			var8 = (var7 & 0x7F) + arg3;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 127) {
				var8 = 127;
			}
			var9 = (var7 + arg2 & 0xFC00) + (var7 & 0x380) + var8;
			var6 = Console.anIntArray4263[Class356.modifyColor(Class523.method6236(var9, 96, 1998005279), (byte) 1) & 0xFFFF] | 0xFF000000;
		} else if (var5 >= 0) {
			var6 = Console.anIntArray4263[Class356.modifyColor(Class523.method6236(arg0.method221(var5, 447964561).aShort523, 96, 1836836783), (byte) 1) & 0xFFFF] | 0xFF000000;
		} else if (var4.anInt4330 == -1) {
			var6 = 0;
		} else {
			var7 = var4.anInt4330;
			var8 = (var7 & 0x7F) + arg3;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 127) {
				var8 = 127;
			}
			var9 = (var7 + arg2 & 0xFC00) + (var7 & 0x380) + var8;
			var6 = Console.anIntArray4263[Class356.modifyColor(Class523.method6236(var9, 96, 2017441943), (byte) 1) & 0xFFFF] | 0xFF000000;
		}
		return var6;
	}

	public static byte[] getBytesFromFile(File arg0) {
		try {
			FileInputStream var1 = new FileInputStream(arg0);
			long var2 = arg0.length();
			if (var2 > 2147483647L) {
			}
			byte[] var4 = new byte[(int) var2];
			int var5 = 0;
			boolean var6 = false;
			int var8;
			while (var5 < var4.length && (var8 = var1.read(var4, var5, var4.length - var5)) >= 0) {
				var5 += var8;
			}
			if (var5 < var4.length) {
				var1.close();
				throw new IOException("Could not completely read file " + arg0.getName());
			} else {
				var1.close();
				return var4;
			}
		} catch (Exception var7) {
			return null;
		}
	}

	public static void loadMap(Class_ra arg0, int arg1, int arg2) {
		Buffer var3 = null;
		if (aClass330_Sub36_Sub12_3497.mapLocation.equals("main")) {
			try {
				DataInputStream var4 = new DataInputStream(ClientLoader.class.getResourceAsStream("main_area.dat"));
				byte[] var5 = new byte[var4.available()];
				var4.readFully(var5);
				var3 = new Buffer(var5);
			} catch (Exception var17) {
				var3 = new Buffer(aClass280_3498.method2780(aClass330_Sub36_Sub12_3497.mapLocation, "area"));
			}
		} else {
			var3 = new Buffer(aClass280_3498.method2780(aClass330_Sub36_Sub12_3497.mapLocation, "area"));
		}
		int var18 = var3.readUnsignedByte(153066050);
		int[] var19 = new int[var18];
		int var6;
		for (var6 = 0; var6 < var18; var6++) {
			var19[var6] = var3.readUnsignedByte(1525859959);
		}
		var6 = var3.readUnsignedByte(1763654871);
		int[] var7 = new int[var6];
		int var8;
		for (var8 = 0; var8 < var6; var8++) {
			var7[var8] = var3.readUnsignedByte(665850047);
		}
		while (true) {
			int var9;
			int var11;
			int var12;
			while (var3.offset < var3.payload.length) {
				int var10;
				int var13;
				if (var3.readUnsignedByte(-110501283) == 0) {
					var8 = var3.readUnsignedByte(1940128613);
					var9 = var3.readUnsignedByte(31366818);
					for (var10 = 0; var10 < 64; var10++) {
						for (var11 = 0; var11 < 64; var11++) {
							var12 = var8 * 64 + var10 - anInt3510;
							var13 = var9 * 64 + var11 - anInt3516;
							method4084(arg0, var3, var8, var9, var12, var13, var19, var7);
						}
					}
				} else {
					var8 = var3.readUnsignedByte(270237170);
					var9 = var3.readUnsignedByte(-207237399);
					var10 = var3.readUnsignedByte(2058177858);
					var11 = var3.readUnsignedByte(148329398);
					for (var12 = 0; var12 < 8; var12++) {
						for (var13 = 0; var13 < 8; var13++) {
							int var14 = var8 * 64 + var10 * 8 + var12 - anInt3510;
							int var15 = var9 * 64 + var11 * 8 + var13 - anInt3516;
							method4084(arg0, var3, var8, var9, var14, var15, var19, var7);
						}
					}
				}
			}
			Object var20 = null;
			aByteArray3506 = new byte[anInt3524 * anInt3513];
			aShortArray3495 = new short[anInt3524 * anInt3513];
			for (var9 = 0; var9 < 3; var9++) {
				byte[] var21 = new byte[anInt3524 * anInt3513];
				ArrayList var22;
				Iterator var23;
				Class322 var24;
				for (var11 = 0; var11 < anArrayListArrayArrayArray3522[var9].length; var11++) {
					for (var12 = 0; var12 < anArrayListArrayArrayArray3522[var9][0].length; var12++) {
						var22 = anArrayListArrayArrayArray3522[var9][var11][var12];
						if (var22 != null) {
							var23 = var22.iterator();
							while (var23.hasNext()) {
								var24 = (Class322) var23.next();
								var21[var11 * 64 + var24.aByte3293 + (var12 * 64 + var24.aByte3294) * anInt3524] = (byte) var24.anInt3291;
							}
						}
					}
				}
				method4088(var21, aByteArray3506, aShortArray3495, arg1, arg2);
				for (var11 = 0; var11 < anArrayListArrayArrayArray3522[var9].length; var11++) {
					for (var12 = 0; var12 < anArrayListArrayArrayArray3522[var9][0].length; var12++) {
						var22 = anArrayListArrayArrayArray3522[var9][var11][var12];
						if (var22 != null) {
							var23 = var22.iterator();
							while (var23.hasNext()) {
								var24 = (Class322) var23.next();
								int var16 = var11 * 64 + var24.aByte3293 + (var12 * 64 + var24.aByte3294) * anInt3524;
								var24.anInt3291 = (aByteArray3506[var16] & 0xFF) << 16 | aShortArray3495[var16] & 0xFFFF;
								if (var24.anInt3291 != 0) {
									var24.anInt3291 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method4088(aByteArray3503, aByteArray3506, aShortArray3495, arg1, arg2);
			aByteArray3503 = null;
			method4087();
			return;
		}
	}

	public static void method4087() {
		int var0;
		int var1;
		int var16;
		for (var0 = 0; var0 < anInt3524; var0++) {
			for (var1 = 0; var1 < anInt3513; var1++) {
				Object var2 = anObjectArray3525[var0 + var1 * anInt3524];
				if (var2 != null) {
					if (var2 instanceof Class330_Sub30) {
						Class330_Sub30 var11 = (Class330_Sub30) var2;
						if (var11 != null) {
							for (int var13 = 0; var13 < var11.anIntArray7722.length; var13++) {
								Class473 var15 = aClass463_3515.method5705(var11.anIntArray7722[var13], (byte) -11);
								var16 = var15.anInt5651;
								if (var15.anIntArray5678 != null) {
									var15 = var15.method5900(anInterface29_3496, (byte) -4);
									if (var15 != null) {
										var16 = var15.anInt5651;
									}
								}
								if (var16 != -1) {
									Class330_Sub38 var7 = new Class330_Sub38(var16);
									var7.anInt7756 = var0;
									var7.anInt7753 = var1;
									aClass471_3509.method5878(var7, (short) 8192);
								}
							}
						}
					} else {
						Integer var3 = (Integer) var2;
						Class473 var4 = aClass463_3515.method5705(var3, (byte) 19);
						int var5 = var4.anInt5651;
						if (var4.anIntArray5678 != null) {
							var4 = var4.method5900(anInterface29_3496, (byte) 67);
							if (var4 != null) {
								var5 = var4.anInt5651;
							}
						}
						if (var5 != -1) {
							Class330_Sub38 var6 = new Class330_Sub38(var5);
							var6.anInt7756 = var0;
							var6.anInt7753 = var1;
							aClass471_3509.method5878(var6, (short) 8192);
						}
					}
				}
			}
		}
		for (var0 = 0; var0 < 3; var0++) {
			for (var1 = 0; var1 < anArrayListArrayArrayArray3522[0].length; var1++) {
				label89: for (int var10 = 0; var10 < anArrayListArrayArrayArray3522[0][0].length; var10++) {
					ArrayList var12 = anArrayListArrayArrayArray3522[var0][var1][var10];
					if (var12 != null) {
						Iterator var14 = var12.iterator();
						while (true) {
							Class322 var17;
							do {
								if (!var14.hasNext()) {
									continue label89;
								}
								var17 = (Class322) var14.next();
							} while (var17.anIntArray3296 == null);
							for (var16 = 0; var16 < var17.anIntArray3296.length; var16++) {
								Class473 var18 = aClass463_3515.method5705(var17.anIntArray3296[var16], (byte) -119);
								int var8 = var18.anInt5651;
								if (var18.anIntArray5678 != null) {
									var18 = var18.method5900(anInterface29_3496, (byte) -40);
									if (var18 != null) {
										var8 = var18.anInt5651;
									}
								}
								if (var8 != -1) {
									Class330_Sub38 var9 = new Class330_Sub38(var8);
									var9.anInt7756 = (var1 + (anInt3510 >> 6)) * 64 + var17.aByte3293 - anInt3510;
									var9.anInt7753 = (var10 + (anInt3516 >> 6)) * 64 + var17.aByte3294 - anInt3516;
									aClass471_3509.method5878(var9, (short) 8192);
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method4088(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
		int[] var5 = new int[anInt3513];
		int[] var6 = new int[anInt3513];
		int[] var7 = new int[anInt3513];
		int[] var8 = new int[anInt3513];
		int[] var9 = new int[anInt3513];
		for (int var10 = -5; var10 < anInt3524; var10++) {
			int var11 = var10 + 5;
			int var12 = var10 - 5;
			int var13;
			int var14;
			for (var13 = 0; var13 < anInt3513; var13++) {
				Class491 var15;
				int var10002;
				if (var11 < anInt3524) {
					var14 = arg0[var11 + var13 * anInt3524] & 0xFF;
					if (var14 > 0) {
						var15 = aClass499_3492.method6111(var14 - 1, -1294922636);
						var5[var13] += var15.anInt5855;
						var6[var13] += var15.anInt5861;
						var7[var13] += var15.anInt5862;
						var8[var13] += var15.anInt5863;
						var10002 = var9[var13]++;
					}
				}
				if (var12 >= 0) {
					var14 = arg0[var12 + var13 * anInt3524] & 0xFF;
					if (var14 > 0) {
						var15 = aClass499_3492.method6111(var14 - 1, -641967869);
						var5[var13] -= var15.anInt5855;
						var6[var13] -= var15.anInt5861;
						var7[var13] -= var15.anInt5862;
						var8[var13] -= var15.anInt5863;
						var10002 = var9[var13]--;
					}
				}
			}
			if (var10 >= 0) {
				var13 = 0;
				var14 = 0;
				int var26 = 0;
				int var16 = 0;
				int var17 = 0;
				for (int var18 = -5; var18 < anInt3513; var18++) {
					int var19 = var18 + 5;
					if (var19 < anInt3513) {
						var13 += var5[var19];
						var14 += var6[var19];
						var26 += var7[var19];
						var16 += var8[var19];
						var17 += var9[var19];
					}
					int var20 = var18 - 5;
					if (var20 >= 0) {
						var13 -= var5[var20];
						var14 -= var6[var20];
						var26 -= var7[var20];
						var16 -= var8[var20];
						var17 -= var9[var20];
					}
					if (var18 >= 0 && var17 > 0) {
						int var21;
						if ((arg0[var10 + var18 * anInt3524] & 0xFF) == 0) {
							var21 = var10 + var18 * anInt3524;
							arg1[var21] = 0;
							arg2[var21] = 0;
						} else {
							var21 = var16 == 0 ? 0 : Class230.method2338(var13 * 256 / var16, var14 / var17, var26 / var17, 816171094);
							int var22 = (var21 & 0x7F) + arg4;
							if (var22 < 0) {
								var22 = 0;
							} else if (var22 > 127) {
								var22 = 127;
							}
							int var23 = (var21 + arg3 & 0xFC00) + (var21 & 0x380) + var22;
							int var24 = var10 + var18 * anInt3524;
							int var25 = Console.anIntArray4263[Class356.modifyColor(Class220.method2264(var23, 96, 49356574), (byte) 1) & 0xFFFF];
							arg1[var24] = (byte) (var25 >> 16 & 0xFF);
							arg2[var24] = (short) (var25 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	public static void method4089() {
		int[] var0 = new int[3];
		for (int var1 = 0; var1 < aClass351_3508.anInt3479; var1++) {
			boolean var2 = aClass330_Sub36_Sub12_3497.method3484(aClass351_3508.anIntArray3480[var1] >> 28 & 0x3, aClass351_3508.anIntArray3480[var1] >> 14 & 0x3FFF, aClass351_3508.anIntArray3480[var1] & 0x3FFF, var0, (byte) -60);
			if (var2) {
				Class330_Sub38 var3 = new Class330_Sub38(aClass351_3508.anIntArray3481[var1]);
				var3.anInt7756 = var0[1] - anInt3510;
				var3.anInt7753 = var0[2] - anInt3516;
				aClass471_3509.method5878(var3, (short) 8192);
			}
		}
	}

	public static void method4090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		anInt3523 = arg0 - anInt3510;
		anInt3494 = arg1 - anInt3516;
		anInt3514 = arg2 - anInt3510;
		anInt3526 = arg3 - anInt3516;
		anInt3527 = arg4;
		anInt3528 = arg5;
		anInt3511 = arg6;
		anInt3530 = arg7;
	}

	public static void method4091(Class_ra arg0) {
		int var1 = anInt3514 - anInt3523;
		int var2 = anInt3494 - anInt3526;
		int var3 = (anInt3511 - anInt3527 << 16) / var1;
		int var4 = (anInt3530 - anInt3528 << 16) / var2;
		method4092(arg0, var3, var4, 0, 0);
	}

	public static void method4092(Class_ra arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = anInt3514 - anInt3523;
		int var6 = anInt3494 - anInt3526;
		if (anInt3514 < anInt3524) {
			var5++;
		}
		if (anInt3494 < anInt3513) {
			var6++;
		}
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var19;
		for (var7 = 0; var7 < var5; var7++) {
			var8 = (arg3 + arg1 * var7 >> 16) + anInt3527;
			var9 = (arg3 + arg1 * (var7 + 1) >> 16) + anInt3527;
			var10 = var9 - var8;
			if (var10 > 0) {
				var11 = anInt3523 + var7;
				if (var11 >= 0 && var11 < anInt3524) {
					for (var12 = 0; var12 < var6; var12++) {
						var13 = anInt3530 - (arg4 + arg2 * (var12 + 1) >> 16);
						var14 = anInt3530 - (arg4 + arg2 * var12 >> 16);
						var15 = var14 - var13;
						if (var15 > 0) {
							var16 = var12 + anInt3526;
							int var17 = var11 + var16 * anInt3524;
							int var18 = 0;
							var19 = 0;
							Object var20 = null;
							if (var16 >= 0 && var16 < anInt3513) {
								var18 = (aByteArray3506[var17] & 0xFF) << 16 | aShortArray3495[var17] & 0xFFFF;
								if (var18 != 0) {
									var18 |= 0xFF000000;
								}
								var19 = aByteArray3518[var17] & 0xFF;
								var20 = anObjectArray3525[var17];
							}
							if (var18 == 0 && var19 == 0 && var20 == null) {
								if (aClass330_Sub36_Sub12_3497.anInt9707 != -1) {
									var18 = aClass330_Sub36_Sub12_3497.anInt9707 | 0xFF000000;
								} else if ((var7 + anInt3523 & 0x4) == (var12 + anInt3494 & 0x4)) {
									var18 = anIntArray3499[aClass418_3517.anInt4294 + 1];
								} else {
									var18 = -11840664;
								}
								if (var18 == 0) {
									var18 = -16777216;
								}
								arg0.B(var8, var13, var10, var15, var18, 0);
							} else if (var20 == null) {
								method4093(arg0, var8, var13, var10, var15, var18, var19, aByteArray3519[var17], null, null, true);
							} else if (var20 instanceof Class330_Sub30) {
								Class330_Sub30 var21 = (Class330_Sub30) var20;
								if (var21 != null) {
									method4093(arg0, var8, var13, var10, var15, var18, var19, aByteArray3519[var17], var21.anIntArray7722, var21.aByteArray7721, true);
								}
							} else {
								Integer var28 = (Integer) var20;
								anIntArray3504[0] = var28;
								aByteArray3505[0] = aByteArray3491[var17];
								method4093(arg0, var8, var13, var10, var15, var18, var19, aByteArray3519[var17], anIntArray3504, aByteArray3505, true);
							}
						}
					}
				} else {
					for (var12 = 0; var12 < var6; var12++) {
						var13 = anInt3530 - (arg4 + arg2 * (var12 + 1) >> 16);
						var14 = anInt3530 - (arg4 + arg2 * var12 >> 16);
						var15 = var14 - var13;
						if (aClass330_Sub36_Sub12_3497.anInt9707 != -1) {
							var16 = aClass330_Sub36_Sub12_3497.anInt9707 | 0xFF000000;
						} else if ((var7 + anInt3523 & 0x4) == (var12 + anInt3494 & 0x4)) {
							var16 = anIntArray3499[aClass418_3517.anInt4294 + 1];
						} else {
							var16 = -11840664;
						}
						if (var16 == 0) {
							var16 = -16777216;
						}
						arg0.B(var8, var13, var10, var15, var16, 0);
					}
				}
			}
		}
		for (var7 = -16; var7 < var5 + 16; var7++) {
			var8 = (arg3 + arg1 * var7 >> 16) + anInt3527;
			var9 = (arg3 + arg1 * (var7 + 1) >> 16) + anInt3527;
			var10 = var9 - var8;
			if (var10 > 0) {
				var11 = var7 + anInt3523;
				if (var11 >= 0 && var11 < anInt3524) {
					for (var12 = -16; var12 < var6 + 16; var12++) {
						var13 = anInt3530 - (arg4 + arg2 * (var12 + 1) >> 16);
						var14 = anInt3530 - (arg4 + arg2 * var12 >> 16);
						var15 = var14 - var13;
						if (var15 > 0) {
							var16 = var12 + anInt3526;
							if (var16 >= 0 && var16 < anInt3513) {
								Object var26 = anObjectArray3525[var11 + var16 * anInt3524];
								if (var26 == null) {
									method4094(arg0, var8, var13, var10, var15, null, null);
								} else if (var26 instanceof Class330_Sub30) {
									Class330_Sub30 var29 = (Class330_Sub30) var26;
									if (var29 != null) {
										method4094(arg0, var8, var13, var10, var15, var29.anIntArray7722, var29.aByteArray7721);
									}
								} else {
									Integer var31 = (Integer) var26;
									anIntArray3504[0] = var31;
									aByteArray3505[0] = aByteArray3491[var11 + var16 * anInt3524];
									method4094(arg0, var8, var13, var10, var15, anIntArray3504, aByteArray3505);
								}
							}
						}
					}
				}
			}
		}
		var7 = anInt3523 >> 6;
		var8 = anInt3526 >> 6;
		if (var7 < 0) {
			var7 = 0;
		}
		if (var8 < 0) {
			var8 = 0;
		}
		var9 = anInt3514 >> 6;
		var10 = anInt3494 >> 6;
		if (var9 >= anArrayListArrayArrayArray3522[0].length) {
			var9 = anArrayListArrayArrayArray3522[0].length - 1;
		}
		if (var10 >= anArrayListArrayArrayArray3522[0][0].length) {
			var10 = anArrayListArrayArrayArray3522[0][0].length - 1;
		}
		for (var11 = 0; var11 < 3; var11++) {
			int var22;
			int var23;
			int var24;
			ArrayList var25;
			Iterator var27;
			int var30;
			int var32;
			Class322 var33;
			for (var12 = var7; var12 <= var9; var12++) {
				for (var13 = var8; var13 <= var10; var13++) {
					var25 = anArrayListArrayArrayArray3522[var11][var12][var13];
					if (var25 != null) {
						var15 = (var12 + (anInt3510 >> 6)) * 64;
						var16 = (var13 + (anInt3516 >> 6)) * 64;
						var27 = var25.iterator();
						while (var27.hasNext()) {
							var33 = (Class322) var27.next();
							var19 = var15 + var33.aByte3293 - anInt3510 - anInt3523;
							var30 = var16 + var33.aByte3294 - anInt3516 - anInt3526;
							var32 = (arg3 + arg1 * var19 >> 16) + anInt3527;
							var22 = (arg3 + arg1 * (var19 + 1) >> 16) + anInt3527;
							var23 = anInt3530 - (arg4 + arg2 * (var30 + 1) >> 16);
							var24 = anInt3530 - (arg4 + arg2 * var30 >> 16);
							method4093(arg0, var32, var23, var22 - var32, var24 - var23, var33.anInt3291, var33.aByte3292 & 0xFF, var33.aByte3295, var33.anIntArray3296, var33.aByteArray3297, false);
						}
					}
				}
			}
			for (var12 = var7; var12 <= var9; var12++) {
				for (var13 = var8; var13 <= var10; var13++) {
					var25 = anArrayListArrayArrayArray3522[var11][var12][var13];
					if (var25 != null) {
						var15 = (var12 + (anInt3510 >> 6)) * 64;
						var16 = (var13 + (anInt3516 >> 6)) * 64;
						var27 = var25.iterator();
						while (var27.hasNext()) {
							var33 = (Class322) var27.next();
							var19 = var15 + var33.aByte3293 - anInt3510 - anInt3523;
							var30 = var16 + var33.aByte3294 - anInt3516 - anInt3526;
							var32 = (arg3 + arg1 * var19 >> 16) + anInt3527;
							var22 = (arg3 + arg1 * (var19 + 1) >> 16) + anInt3527;
							var23 = anInt3530 - (arg4 + arg2 * (var30 + 1) >> 16);
							var24 = anInt3530 - (arg4 + arg2 * var30 >> 16);
							method4094(arg0, var32, var23, var22 - var32, var24 - var23, var33.anIntArray3296, var33.aByteArray3297);
						}
					}
				}
			}
		}
	}

	public static void method4093(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, boolean arg10) {
		int var11;
		int var12;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.B(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				var11 = arg7 & 0x3F;
				if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
					var12 = anIntArray3499[arg6];
					if (arg10 || var12 != 0) {
						arg0.B(arg1, arg2, arg3, arg4, var12, 0);
					}
				} else {
					var12 = arg10 ? 0 : 1;
					Class464_Sub21.method5812(arg0, aByteArrayArrayArray3502, anInt3521, arg1, arg2, arg5, anIntArray3499[arg6], arg3, arg4, var11, arg7 >> 6 & 0x3, var12, (byte) 13);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			var11 = arg1;
		} else {
			var11 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			var12 = arg2;
		} else {
			var12 = arg2 + arg4 - 1;
		}
		for (int var13 = 0; var13 < arg8.length; var13++) {
			int var14 = arg9[var13] & 0x3F;
			if (var14 == Class476.aClass476_6883.anInt6882 || var14 == Class476.aClass476_6880.anInt6882 || var14 == Class476.aClass476_6881.anInt6882 || var14 == Class476.aClass476_6902.anInt6882) {
				Class473 var15 = aClass463_3515.method5705(arg8[var13], (byte) -55);
				if (var15.anInt5652 == -1) {
					int var16 = -3355444;
					if (var15.anInt5637 == 1) {
						var16 = -3407872;
					}
					int var17 = arg9[var13] >> 6 & 0x3;
					if (var14 == Class476.aClass476_6883.anInt6882) {
						if (var17 == 0) {
							arg0.G(arg1, arg2, arg4, var16, 0);
						} else if (var17 == 1) {
							arg0.XA(arg1, arg2, arg3, var16, 0);
						} else if (var17 == 2) {
							arg0.G(var11, arg2, arg4, var16, 0);
						} else {
							arg0.XA(arg1, var12, arg3, var16, 0);
						}
					} else if (var14 == Class476.aClass476_6880.anInt6882) {
						if (var17 == 0) {
							arg0.G(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, var16, 0);
						} else if (var17 == 1) {
							arg0.G(var11, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, var16, 0);
						} else if (var17 == 2) {
							arg0.G(var11, arg2, arg4, -1, 0);
							arg0.XA(arg1, var12, arg3, var16, 0);
						} else {
							arg0.G(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, var12, arg3, var16, 0);
						}
					} else if (var14 == Class476.aClass476_6881.anInt6882) {
						if (var17 == 0) {
							arg0.XA(arg1, arg2, 1, var16, 0);
						} else if (var17 == 1) {
							arg0.XA(var11, arg2, 1, var16, 0);
						} else if (var17 == 2) {
							arg0.XA(var11, var12, 1, var16, 0);
						} else {
							arg0.XA(arg1, var12, 1, var16, 0);
						}
					} else if (var14 == Class476.aClass476_6902.anInt6882) {
						int var18;
						if (var17 == 0 || var17 == 2) {
							for (var18 = 0; var18 < arg4; var18++) {
								arg0.XA(arg1 + var18, var12 - var18, 1, var16, 0);
							}
						} else {
							for (var18 = 0; var18 < arg4; var18++) {
								arg0.XA(arg1 + var18, arg2 + var18, 1, var16, 0);
							}
						}
					}
				}
			}
		}
	}

	public static void method4094(Class_ra arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (int var7 = 0; var7 < arg5.length; var7++) {
			Class473 var8 = aClass463_3515.method5705(arg5[var7], (byte) -3);
			int var9 = var8.anInt5652;
			if (var9 != -1) {
				Class522 var10 = aClass552_3493.method6382(var9, 1896915915);
				Class61 var11 = var10.method6227(arg0, var8.aBoolean5653 ? arg6[var7] >> 6 & 0x3 : 0, var8.aBoolean5655 ? var8.aBoolean5656 : false, (byte) 119);
				if (var11 != null) {
					int var12 = arg3 * var11.method318() >> 2;
					int var13 = arg4 * var11.method683() >> 2;
					if (var10.aBoolean6018) {
						int var14 = var8.anInt5674;
						int var15 = var8.anInt5680;
						if ((arg6[var7] >> 6 & 0x1) == 1) {
							int var16 = var14;
							var14 = var15;
							var15 = var16;
						}
						var12 = var14 * arg3;
						var13 = var15 * arg4;
					}
					if (var12 != 0 && var13 != 0) {
						if (var10.anInt6020 == 0) {
							var11.method690(arg1, arg2 - var13 + arg4, var12, var13);
						} else {
							var11.method691(arg1, arg2 - var13 + arg4, var12, var13, 0, var10.anInt6020 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	public static Class471 method4095(Class_ra arg0, int arg1, int arg2, int arg3, int arg4) {
		for (Class330_Sub38 var5 = (Class330_Sub38) aClass471_3509.method5869(539664854); var5 != null; var5 = (Class330_Sub38) aClass471_3509.method5873((byte) -24)) {
			method4101(arg0, var5, arg1, arg2, arg3, arg4);
		}
		return aClass471_3509;
	}

	public static void method4096(int arg0) {
		aClass330_Sub36_Sub12_3497 = (Class330_Sub36_Sub12) aClass497_3512.method6094((long) arg0);
	}

	public static void method4097(Class_ra arg0, Class330_Sub38 arg1, Class372 arg2) {
		if (arg2.anIntArray3897 == null) {
			return;
		}
		int[] var3 = new int[arg2.anIntArray3897.length];
		int var4;
		int var5;
		int var6;
		for (var4 = 0; var4 < var3.length / 2; var4++) {
			var5 = arg2.anIntArray3897[var4 * 2] + arg1.anInt7756;
			var6 = arg2.anIntArray3897[var4 * 2 + 1] + arg1.anInt7753;
			var3[var4 * 2] = anInt3527 + (anInt3511 - anInt3527) * (var5 - anInt3523) / (anInt3514 - anInt3523);
			var3[var4 * 2 + 1] = anInt3530 - (anInt3530 - anInt3528) * (var6 - anInt3526) / (anInt3494 - anInt3526);
		}
		Class82.method956(arg0, var3, arg2.anInt3900);
		if (arg2.anInt3875 <= 0) {
			for (var4 = 0; var4 < var3.length / 2 - 1; var4++) {
				arg0.method4791(var3[var4 * 2], var3[var4 * 2 + 1], var3[(var4 + 1) * 2], var3[(var4 + 1) * 2 + 1], arg2.anIntArray3908[arg2.aByteArray3912[var4] & 0xFF], (byte) -94);
			}
			arg0.method4791(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], arg2.anIntArray3908[arg2.aByteArray3912[arg2.aByteArray3912.length - 1] & 0xFF], (byte) -51);
			return;
		}
		int var7;
		int var8;
		int var9;
		for (var4 = 0; var4 < var3.length / 2 - 1; var4++) {
			var5 = var3[var4 * 2];
			var6 = var3[var4 * 2 + 1];
			var7 = var3[(var4 + 1) * 2];
			var8 = var3[(var4 + 1) * 2 + 1];
			if (var7 < var5) {
				var9 = var5;
				int var10 = var6;
				var5 = var7;
				var6 = var8;
				var7 = var9;
				var8 = var10;
			} else if (var7 == var5 && var8 < var6) {
				var9 = var6;
				var6 = var8;
				var8 = var9;
			}
			arg0.bz(var5, var6, var7, var8, arg2.anIntArray3908[arg2.aByteArray3912[var4] & 0xFF], 1, arg2.anInt3875, arg2.anInt3881, arg2.anInt3905);
		}
		var4 = var3[var3.length - 2];
		var5 = var3[var3.length - 1];
		var6 = var3[0];
		var7 = var3[1];
		if (var6 < var4) {
			var8 = var4;
			var9 = var5;
			var4 = var6;
			var5 = var7;
			var6 = var8;
			var7 = var9;
		} else if (var6 == var4 && var7 < var5) {
			var8 = var5;
			var5 = var7;
			var7 = var8;
		}
		arg0.bz(var4, var5, var6, var7, arg2.anIntArray3908[arg2.aByteArray3912[arg2.aByteArray3912.length - 1] & 0xFF], 1, arg2.anInt3875, arg2.anInt3881, arg2.anInt3905);
	}

	public static Class471 method4098(Class_ra arg0) {
		int var1 = anInt3514 - anInt3523;
		int var2 = anInt3494 - anInt3526;
		int var3 = (anInt3511 - anInt3527 << 16) / var1;
		int var4 = (anInt3530 - anInt3528 << 16) / var2;
		return method4095(arg0, var3, var4, 0, 0);
	}

	public static void method4099() {
		aByteArray3503 = new byte[anInt3524 * anInt3513];
		aByteArray3518 = new byte[anInt3524 * anInt3513];
		aByteArray3519 = new byte[anInt3524 * anInt3513];
		anObjectArray3525 = new Object[anInt3524 * anInt3513];
		aByteArray3491 = new byte[anInt3524 * anInt3513];
		anArrayListArrayArrayArray3522 = new ArrayList[3][anInt3524 >> 6][anInt3513 >> 6];
		anIntArray3499 = new int[aClass418_3517.anInt4295 + 1];
	}

	public static Class330_Sub36_Sub12 method4100(int arg0, int arg1) {
		for (Class330_Sub36_Sub12 var2 = (Class330_Sub36_Sub12) aClass497_3512.method6099((byte) 95); var2 != null; var2 = (Class330_Sub36_Sub12) aClass497_3512.method6098((short) -32768)) {
			if (var2.aBoolean9713 && var2.method3480(arg0, arg1, 1390104192)) {
				return var2;
			}
		}
		return null;
	}

	public static void method4101(Class_ra arg0, Class330_Sub38 arg1, int arg2, int arg3, int arg4, int arg5) {
		arg1.anInt7754 = anInt3527 + (arg4 + arg2 * (arg1.anInt7756 - anInt3523) >> 16);
		arg1.anInt7750 = anInt3530 - (arg5 + arg3 * (arg1.anInt7753 - anInt3526) >> 16);
	}

	public static void method4102(IndexTable arg0, Class418 arg1, Class499 arg2, Class463 arg3, Class380 arg4, Class552 arg5, Interface29 arg6) {
		aClass280_3498 = arg0;
		aClass418_3517 = arg1;
		aClass499_3492 = arg2;
		aClass463_3515 = arg3;
		aClass380_3529 = arg4;
		aClass552_3493 = arg5;
		anInterface29_3496 = arg6;
		aClass497_3512.method6100(65280);
		int var7 = aClass280_3498.method2754("details", 323600977);
		int[] var8 = aClass280_3498.method2762(var7, (byte) -46);
		if (var8 != null) {
			for (int var9 = 0; var9 < var8.length; var9++) {
				Class330_Sub36_Sub12 var10 = Class286.method2875(aClass280_3498, var7, var8[var9], (byte) -23);
				aClass497_3512.method6097(var10, (long) var10.anInt9708);
			}
		}
		Class318.method3166(true, false, -1368286637);
	}

	public static void method4103() {
		aByteArray3503 = null;
		aByteArray3506 = null;
		aShortArray3495 = null;
		aByteArray3518 = null;
		aByteArray3519 = null;
		anObjectArray3525 = null;
		aByteArray3491 = null;
		anArrayListArrayArrayArray3522 = null;
		anIntArray3499 = null;
	}

	public Class354() throws Throwable {
		throw new Error();
	}

	public static void method4104(Interface_ma arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < aClass418_3517.anInt4295; var3++) {
			anIntArray3499[var3 + 1] = method4085(arg0, var3, arg1, arg2);
		}
	}
}
