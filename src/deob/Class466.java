package deob;

public class Class466 {

	public static int anInt5591 = 6;

	public static Class480 aClass480_5592 = new Class480();

	public static int anInt5593 = 16;

	public static int anInt5594 = 4096;

	public static int anInt5595 = 1;

	public static int anInt5596 = 23;

	public static int anInt5597 = 50;

	public static int anInt5598 = 0;

	public static int method5843(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		Class480 var5 = aClass480_5592;
		synchronized (aClass480_5592) {
			aClass480_5592.aByteArray5735 = arg2;
			aClass480_5592.anInt5749 = arg4;
			aClass480_5592.aByteArray5738 = arg0;
			aClass480_5592.anInt5739 = 0;
			aClass480_5592.anInt5740 = arg1;
			aClass480_5592.anInt5745 = 0;
			aClass480_5592.anInt5732 = 0;
			aClass480_5592.anInt5737 = 0;
			aClass480_5592.anInt5733 = 0;
			method5847(aClass480_5592);
			int var9 = arg1 - aClass480_5592.anInt5740;
			aClass480_5592.aByteArray5735 = null;
			aClass480_5592.aByteArray5738 = null;
			return var9;
		}
	}

	public static byte method5844(Class480 arg0) {
		return (byte) method5848(1, arg0);
	}

	public static void method5845(Class480 arg0) {
		byte var1 = arg0.aByte5742;
		int var2 = arg0.anInt5743;
		int var3 = arg0.anInt5736;
		int var4 = arg0.anInt5730;
		int[] var5 = Class99.anIntArray917;
		int var6 = arg0.anInt5748;
		byte[] var7 = arg0.aByteArray5738;
		int var8 = arg0.anInt5739;
		int var9 = arg0.anInt5740;
		int var10 = var9;
		int var11 = arg0.anInt5766 + 1;
		label64: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label64;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label64;
						}
						var7[var8] = var1;
						var8++;
						var9--;
						break;
					}
					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}
			}
			while (var3 != var11) {
				var1 = (byte) var4;
				var6 = var5[var6];
				byte var12 = (byte) var6;
				var6 >>= 0x8;
				var3++;
				if (var12 == var4) {
					if (var3 != var11) {
						var2 = 2;
						var6 = var5[var6];
						var12 = (byte) var6;
						var6 >>= 0x8;
						var3++;
						if (var3 != var11) {
							if (var12 == var4) {
								var2 = 3;
								var6 = var5[var6];
								var12 = (byte) var6;
								var6 >>= 0x8;
								var3++;
								if (var3 != var11) {
									if (var12 == var4) {
										var6 = var5[var6];
										var12 = (byte) var6;
										var6 >>= 0x8;
										var3++;
										var2 = (var12 & 0xFF) + 4;
										var6 = var5[var6];
										var4 = (byte) var6;
										var6 >>= 0x8;
										var3++;
									} else {
										var4 = var12;
									}
								}
							} else {
								var4 = var12;
							}
						}
						continue label64;
					}
					if (var9 == 0) {
						var2 = 1;
						break label64;
					}
					var7[var8] = var1;
					var8++;
					var9--;
				} else {
					var4 = var12;
					if (var9 == 0) {
						var2 = 1;
						break label64;
					}
					var7[var8] = var1;
					var8++;
					var9--;
				}
			}
			var2 = 0;
			break;
		}
		int var13 = arg0.anInt5733;
		arg0.anInt5733 += var10 - var9;
		if (arg0.anInt5733 >= var13) {
		}
		arg0.aByte5742 = var1;
		arg0.anInt5743 = var2;
		arg0.anInt5736 = var3;
		arg0.anInt5730 = var4;
		Class99.anIntArray917 = var5;
		arg0.anInt5748 = var6;
		arg0.aByteArray5738 = var7;
		arg0.anInt5739 = var8;
		arg0.anInt5740 = var9;
	}

	public static byte method5846(Class480 arg0) {
		return (byte) method5848(8, arg0);
	}

	public static void method5847(Class480 arg0) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		int var19 = 0;
		int[] var20 = null;
		int[] var21 = null;
		int[] var22 = null;
		arg0.anInt5746 = 1;
		if (Class99.anIntArray917 == null) {
			Class99.anIntArray917 = new int[arg0.anInt5746 * 100000];
		}
		boolean var23 = true;
		while (var23) {
			byte var24 = method5846(arg0);
			if (var24 == 23) {
				break;
			}
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5846(arg0);
			var24 = method5844(arg0);
			if (var24 == 0) {
			}
			arg0.anInt5747 = 0;
			byte var25 = method5846(arg0);
			arg0.anInt5747 = arg0.anInt5747 << 8 | var25 & 0xFF;
			byte var45 = method5846(arg0);
			arg0.anInt5747 = arg0.anInt5747 << 8 | var45 & 0xFF;
			byte var46 = method5846(arg0);
			arg0.anInt5747 = arg0.anInt5747 << 8 | var46 & 0xFF;
			int var26;
			for (var26 = 0; var26 < 16; var26++) {
				var24 = method5844(arg0);
				if (var24 == 1) {
					arg0.aBooleanArray5755[var26] = true;
				} else {
					arg0.aBooleanArray5755[var26] = false;
				}
			}
			for (var26 = 0; var26 < 256; var26++) {
				arg0.aBooleanArray5754[var26] = false;
			}
			int var27;
			for (var26 = 0; var26 < 16; var26++) {
				if (arg0.aBooleanArray5755[var26]) {
					for (var27 = 0; var27 < 16; var27++) {
						var24 = method5844(arg0);
						if (var24 == 1) {
							arg0.aBooleanArray5754[var26 * 16 + var27] = true;
						}
					}
				}
			}
			method5849(arg0);
			var26 = arg0.anInt5729 + 2;
			var27 = method5848(3, arg0);
			int var28 = method5848(15, arg0);
			int var30;
			for (int var29 = 0; var29 < var28; var29++) {
				var30 = 0;
				while (true) {
					var24 = method5844(arg0);
					if (var24 == 0) {
						arg0.aByteArray5760[var29] = (byte) var30;
						break;
					}
					var30++;
				}
			}
			byte[] var47 = new byte[6];
			byte var48 = 0;
			while (var48 < var27) {
				var47[var48] = var48++;
			}
			byte var31;
			byte var32;
			for (var30 = 0; var30 < var28; var30++) {
				var31 = arg0.aByteArray5760[var30];
				var32 = var47[var31];
				while (var31 > 0) {
					var47[var31] = var47[var31 - 1];
					var31--;
				}
				var47[0] = var32;
				arg0.aByteArray5765[var30] = var32;
			}
			int var49;
			int var50;
			for (var30 = 0; var30 < var27; var30++) {
				var49 = method5848(5, arg0);
				for (var50 = 0; var50 < var26; var50++) {
					while (true) {
						var24 = method5844(arg0);
						if (var24 == 0) {
							arg0.aByteArrayArray5761[var30][var50] = (byte) var49;
							break;
						}
						var24 = method5844(arg0);
						if (var24 == 0) {
							var49++;
						} else {
							var49--;
						}
					}
				}
			}
			int var33;
			for (var30 = 0; var30 < var27; var30++) {
				var31 = 32;
				var32 = 0;
				for (var33 = 0; var33 < var26; var33++) {
					if (arg0.aByteArrayArray5761[var30][var33] > var32) {
						var32 = arg0.aByteArrayArray5761[var30][var33];
					}
					if (arg0.aByteArrayArray5761[var30][var33] < var31) {
						var31 = arg0.aByteArrayArray5761[var30][var33];
					}
				}
				method5850(arg0.anIntArrayArray5762[var30], arg0.anIntArrayArray5763[var30], arg0.anIntArrayArray5764[var30], arg0.aByteArrayArray5761[var30], var31, var32, var26);
				arg0.anIntArray5751[var30] = var31;
			}
			var30 = arg0.anInt5729 + 1;
			var49 = -1;
			byte var51 = 0;
			for (var33 = 0; var33 <= 255; var33++) {
				arg0.anIntArray5750[var33] = 0;
			}
			var33 = 4095;
			int var34;
			int var35;
			for (var34 = 15; var34 >= 0; var34--) {
				for (var35 = 15; var35 >= 0; var35--) {
					arg0.aByteArray5734[var33] = (byte) (var34 * 16 + var35);
					var33--;
				}
				arg0.anIntArray5758[var34] = var33 + 1;
			}
			var34 = 0;
			if (var51 == 0) {
				var49++;
				var51 = 50;
				byte var52 = arg0.aByteArray5765[var49];
				var19 = arg0.anIntArray5751[var52];
				var20 = arg0.anIntArrayArray5762[var52];
				var22 = arg0.anIntArrayArray5764[var52];
				var21 = arg0.anIntArrayArray5763[var52];
			}
			var50 = var51 - 1;
			var35 = var19;
			byte var36;
			int var37;
			for (var37 = method5848(var19, arg0); var37 > var20[var35]; var37 = var37 << 1 | var36) {
				var35++;
				var36 = method5844(arg0);
			}
			int var38 = var22[var37 - var21[var35]];
			while (true) {
				int var39;
				while (var38 != var30) {
					int var40;
					if (var38 == 0 || var38 == 1) {
						var39 = -1;
						var40 = 1;
						do {
							if (var38 == 0) {
								var39 += var40;
							} else if (var38 == 1) {
								var39 += var40 * 2;
							}
							var40 *= 2;
							if (var50 == 0) {
								var49++;
								var50 = 50;
								byte var41 = arg0.aByteArray5765[var49];
								var19 = arg0.anIntArray5751[var41];
								var20 = arg0.anIntArrayArray5762[var41];
								var22 = arg0.anIntArrayArray5764[var41];
								var21 = arg0.anIntArrayArray5763[var41];
							}
							var50--;
							var35 = var19;
							for (var37 = method5848(var19, arg0); var37 > var20[var35]; var37 = var37 << 1 | var36) {
								var35++;
								var36 = method5844(arg0);
							}
							var38 = var22[var37 - var21[var35]];
						} while (var38 == 0 || var38 == 1);
						var39++;
						var25 = arg0.aByteArray5756[arg0.aByteArray5734[arg0.anIntArray5758[0]] & 0xFF];
						arg0.anIntArray5750[var25 & 0xFF] += var39;
						while (var39 > 0) {
							Class99.anIntArray917[var34] = var25 & 0xFF;
							var34++;
							var39--;
						}
					} else {
						var39 = var38 - 1;
						int var53;
						if (var39 < 16) {
							var40 = arg0.anIntArray5758[0];
							var24 = arg0.aByteArray5734[var40 + var39];
							while (var39 > 3) {
								var53 = var40 + var39;
								arg0.aByteArray5734[var53] = arg0.aByteArray5734[var53 - 1];
								arg0.aByteArray5734[var53 - 1] = arg0.aByteArray5734[var53 - 2];
								arg0.aByteArray5734[var53 - 2] = arg0.aByteArray5734[var53 - 3];
								arg0.aByteArray5734[var53 - 3] = arg0.aByteArray5734[var53 - 4];
								var39 -= 4;
							}
							while (var39 > 0) {
								arg0.aByteArray5734[var40 + var39] = arg0.aByteArray5734[var40 + var39 - 1];
								var39--;
							}
							arg0.aByteArray5734[var40] = var24;
						} else {
							var40 = var39 / 16;
							var53 = var39 % 16;
							int var42 = arg0.anIntArray5758[var40] + var53;
							var24 = arg0.aByteArray5734[var42];
							while (var42 > arg0.anIntArray5758[var40]) {
								arg0.aByteArray5734[var42] = arg0.aByteArray5734[var42 - 1];
								var42--;
							}
							int var10002 = arg0.anIntArray5758[var40]++;
							while (var40 > 0) {
								var10002 = arg0.anIntArray5758[var40]--;
								arg0.aByteArray5734[arg0.anIntArray5758[var40]] = arg0.aByteArray5734[arg0.anIntArray5758[var40 - 1] + 16 - 1];
								var40--;
							}
							var10002 = arg0.anIntArray5758[0]--;
							arg0.aByteArray5734[arg0.anIntArray5758[0]] = var24;
							if (arg0.anIntArray5758[0] == 0) {
								var33 = 4095;
								for (int var43 = 15; var43 >= 0; var43--) {
									for (int var44 = 15; var44 >= 0; var44--) {
										arg0.aByteArray5734[var33] = arg0.aByteArray5734[arg0.anIntArray5758[var43] + var44];
										var33--;
									}
									arg0.anIntArray5758[var43] = var33 + 1;
								}
							}
						}
						arg0.anIntArray5750[arg0.aByteArray5756[var24 & 0xFF] & 0xFF]++;
						Class99.anIntArray917[var34] = arg0.aByteArray5756[var24 & 0xFF] & 0xFF;
						var34++;
						if (var50 == 0) {
							var49++;
							var50 = 50;
							byte var54 = arg0.aByteArray5765[var49];
							var19 = arg0.anIntArray5751[var54];
							var20 = arg0.anIntArrayArray5762[var54];
							var22 = arg0.anIntArrayArray5764[var54];
							var21 = arg0.anIntArrayArray5763[var54];
						}
						var50--;
						var35 = var19;
						for (var37 = method5848(var19, arg0); var37 > var20[var35]; var37 = var37 << 1 | var36) {
							var35++;
							var36 = method5844(arg0);
						}
						var38 = var22[var37 - var21[var35]];
					}
				}
				arg0.anInt5743 = 0;
				arg0.aByte5742 = 0;
				arg0.anIntArray5753[0] = 0;
				for (var39 = 1; var39 <= 256; var39++) {
					arg0.anIntArray5753[var39] = arg0.anIntArray5750[var39 - 1];
				}
				for (var39 = 1; var39 <= 256; var39++) {
					arg0.anIntArray5753[var39] += arg0.anIntArray5753[var39 - 1];
				}
				for (var39 = 0; var39 < var34; var39++) {
					var25 = (byte) (Class99.anIntArray917[var39] & 0xFF);
					Class99.anIntArray917[arg0.anIntArray5753[var25 & 0xFF]] |= var39 << 8;
					arg0.anIntArray5753[var25 & 0xFF]++;
				}
				arg0.anInt5748 = Class99.anIntArray917[arg0.anInt5747] >> 8;
				arg0.anInt5736 = 0;
				arg0.anInt5748 = Class99.anIntArray917[arg0.anInt5748];
				arg0.anInt5730 = (byte) (arg0.anInt5748 & 0xFF);
				arg0.anInt5748 >>= 0x8;
				arg0.anInt5736++;
				arg0.anInt5766 = var34;
				method5845(arg0);
				if (arg0.anInt5736 == arg0.anInt5766 + 1 && arg0.anInt5743 == 0) {
					var23 = true;
					break;
				}
				var23 = false;
				break;
			}
		}
	}

	public static int method5848(int arg0, Class480 arg1) {
		while (arg1.anInt5745 < arg0) {
			arg1.anInt5732 = arg1.anInt5732 << 8 | arg1.aByteArray5735[arg1.anInt5749] & 0xFF;
			arg1.anInt5745 += 8;
			arg1.anInt5749++;
			arg1.anInt5737++;
			if (arg1.anInt5737 == 0) {
			}
		}
		int var2 = arg1.anInt5732 >> arg1.anInt5745 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt5745 -= arg0;
		return var2;
	}

	public static void method5849(Class480 arg0) {
		arg0.anInt5729 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.aBooleanArray5754[var1]) {
				arg0.aByteArray5756[arg0.anInt5729] = (byte) var1;
				arg0.anInt5729++;
			}
		}
	}

	public static void method5850(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		int var8;
		int var9;
		for (var8 = arg4; var8 <= arg5; var8++) {
			for (var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}
		for (var8 = 0; var8 < 23; var8++) {
			arg1[var8] = 0;
		}
		for (var8 = 0; var8 < arg6; var8++) {
			arg1[arg3[var8] + 1]++;
		}
		for (var8 = 1; var8 < 23; var8++) {
			arg1[var8] += arg1[var8 - 1];
		}
		for (var8 = 0; var8 < 23; var8++) {
			arg0[var8] = 0;
		}
		var8 = 0;
		for (var9 = arg4; var9 <= arg5; var9++) {
			var8 += arg1[var9 + 1] - arg1[var9];
			arg0[var9] = var8 - 1;
			var8 <<= 0x1;
		}
		for (var9 = arg4 + 1; var9 <= arg5; var9++) {
			arg1[var9] = (arg0[var9 - 1] + 1 << 1) - arg1[var9];
		}
	}

	public Class466() throws Throwable {
		throw new Error();
	}
}
