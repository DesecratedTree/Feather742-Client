package deob;

public class Class330_Sub6 extends Class330 {

	public byte[] aByteArray7543;

	public Class497 aClass497_7544;

	public Class330_Sub6(Buffer arg0) {
		arg0.offset = arg0.payload.length - 3;
		int var2 = arg0.readUnsignedByte(723967431);
		int var3 = arg0.readUnsignedShort(796380209);
		int var4 = var2 * 10 + 14;
		arg0.offset = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;
		int var13;
		int var14;
		int var15;
		for (var13 = 0; var13 < var2; var13++) {
			var14 = -1;
			while (true) {
				var15 = arg0.readUnsignedByte(1138115079);
				if (var15 != var14) {
					var4++;
				}
				var14 = var15 & 0xF;
				if (var15 == 7) {
					break;
				}
				if (var15 == 23) {
					var5++;
				} else if (var14 == 0) {
					var7++;
				} else if (var14 == 1) {
					var8++;
				} else if (var14 == 2) {
					var6++;
				} else if (var14 == 3) {
					var9++;
				} else if (var14 == 4) {
					var10++;
				} else if (var14 == 5) {
					var11++;
				} else if (var14 == 6) {
					var12++;
				} else {
					throw new RuntimeException();
				}
			}
		}
		var4 += var5 * 5;
		var4 += (var7 + var8 + var6 + var9 + var11) * 2;
		var4 += var10 + var12;
		var13 = arg0.offset;
		var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
		for (var15 = 0; var15 < var14; var15++) {
			arg0.method3770(485008648);
		}
		var4 += arg0.offset - var13;
		var15 = arg0.offset;
		int var16 = 0;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;
		int var29;
		for (var29 = 0; var29 < var6; var29++) {
			var28 = var28 + arg0.readUnsignedByte(1049473891) & 0x7F;
			if (var28 == 0 || var28 == 32) {
				var12++;
			} else if (var28 == 1) {
				var16++;
			} else if (var28 == 33) {
				var17++;
			} else if (var28 == 7) {
				var18++;
			} else if (var28 == 39) {
				var19++;
			} else if (var28 == 10) {
				var20++;
			} else if (var28 == 42) {
				var21++;
			} else if (var28 == 99) {
				var22++;
			} else if (var28 == 98) {
				var23++;
			} else if (var28 == 101) {
				var24++;
			} else if (var28 == 100) {
				var25++;
			} else if (var28 == 64 || var28 == 65 || var28 == 120 || var28 == 121 || var28 == 123) {
				var26++;
			} else {
				var27++;
			}
		}
		var29 = 0;
		int var30 = arg0.offset;
		arg0.offset += var26;
		int var31 = arg0.offset;
		arg0.offset += var11;
		int var32 = arg0.offset;
		arg0.offset += var10;
		int var33 = arg0.offset;
		arg0.offset += var9;
		int var34 = arg0.offset;
		arg0.offset += var16;
		int var35 = arg0.offset;
		arg0.offset += var18;
		int var36 = arg0.offset;
		arg0.offset += var20;
		int var37 = arg0.offset;
		arg0.offset += var7 + var8 + var11;
		int var38 = arg0.offset;
		arg0.offset += var7;
		int var39 = arg0.offset;
		arg0.offset += var27;
		int var40 = arg0.offset;
		arg0.offset += var8;
		int var41 = arg0.offset;
		arg0.offset += var17;
		int var42 = arg0.offset;
		arg0.offset += var19;
		int var43 = arg0.offset;
		arg0.offset += var21;
		int var44 = arg0.offset;
		arg0.offset += var12;
		int var45 = arg0.offset;
		arg0.offset += var9;
		int var46 = arg0.offset;
		arg0.offset += var22;
		int var47 = arg0.offset;
		arg0.offset += var23;
		int var48 = arg0.offset;
		arg0.offset += var24;
		int var49 = arg0.offset;
		arg0.offset += var25;
		int var50 = arg0.offset;
		arg0.offset += var5 * 3;
		this.aByteArray7543 = new byte[var4];
		Buffer var51 = new Buffer(this.aByteArray7543);
		var51.addInt(1297377380, 1965508160);
		var51.addInt(6, 1965508160);
		var51.addShort(var2 > 1 ? 1 : 0, (byte) 60);
		var51.addShort(var2, (byte) 107);
		var51.addShort(var3, (byte) 127);
		arg0.offset = var13;
		int var52 = 0;
		int var53 = 0;
		int var54 = 0;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58 = 0;
		int[] var59 = new int[128];
		var28 = 0;
		label225: for (int var60 = 0; var60 < var2; var60++) {
			var51.addInt(1297379947, 1965508160);
			var51.offset += 4;
			int var61 = var51.offset;
			int var62 = -1;
			while (true) {
				while (true) {
					int var63 = arg0.method3770(485008648);
					var51.method3753(var63, 1907737090);
					int var64 = arg0.payload[var29++] & 0xFF;
					boolean var65 = var64 != var62;
					var62 = var64 & 0xF;
					if (var64 == 7) {
						if (var65) {
							var51.addByte(255, (byte) 94);
						}
						var51.addByte(47, (byte) 2);
						var51.addByte(0, (byte) 58);
						var51.method3750(var51.offset - var61, -1266681606);
						continue label225;
					}
					if (var64 == 23) {
						if (var65) {
							var51.addByte(255, (byte) 50);
						}
						var51.addByte(81, (byte) 84);
						var51.addByte(3, (byte) 122);
						var51.addByte(arg0.payload[var50++], (byte) 122);
						var51.addByte(arg0.payload[var50++], (byte) 48);
						var51.addByte(arg0.payload[var50++], (byte) 119);
					} else {
						var52 ^= var64 >> 4;
						if (var62 == 0) {
							if (var65) {
								var51.addByte(var52 + 144, (byte) 94);
							}
							var53 += arg0.payload[var37++];
							var54 += arg0.payload[var38++];
							var51.addByte(var53 & 0x7F, (byte) 84);
							var51.addByte(var54 & 0x7F, (byte) 104);
						} else if (var62 == 1) {
							if (var65) {
								var51.addByte(var52 + 128, (byte) 9);
							}
							var53 += arg0.payload[var37++];
							var55 += arg0.payload[var40++];
							var51.addByte(var53 & 0x7F, (byte) 37);
							var51.addByte(var55 & 0x7F, (byte) 119);
						} else if (var62 == 2) {
							if (var65) {
								var51.addByte(var52 + 176, (byte) 23);
							}
							var28 = var28 + arg0.payload[var15++] & 0x7F;
							var51.addByte(var28, (byte) 108);
							byte var66;
							if (var28 == 0 || var28 == 32) {
								var66 = arg0.payload[var44++];
							} else if (var28 == 1) {
								var66 = arg0.payload[var34++];
							} else if (var28 == 33) {
								var66 = arg0.payload[var41++];
							} else if (var28 == 7) {
								var66 = arg0.payload[var35++];
							} else if (var28 == 39) {
								var66 = arg0.payload[var42++];
							} else if (var28 == 10) {
								var66 = arg0.payload[var36++];
							} else if (var28 == 42) {
								var66 = arg0.payload[var43++];
							} else if (var28 == 99) {
								var66 = arg0.payload[var46++];
							} else if (var28 == 98) {
								var66 = arg0.payload[var47++];
							} else if (var28 == 101) {
								var66 = arg0.payload[var48++];
							} else if (var28 == 100) {
								var66 = arg0.payload[var49++];
							} else if (var28 == 64 || var28 == 65 || var28 == 120 || var28 == 121 || var28 == 123) {
								var66 = arg0.payload[var30++];
							} else {
								var66 = arg0.payload[var39++];
							}
							int var67 = var66 + var59[var28];
							var59[var28] = var67;
							var51.addByte(var67 & 0x7F, (byte) 97);
						} else if (var62 == 3) {
							if (var65) {
								var51.addByte(var52 + 224, (byte) 120);
							}
							var56 += arg0.payload[var45++];
							var56 += arg0.payload[var33++] << 7;
							var51.addByte(var56 & 0x7F, (byte) 35);
							var51.addByte(var56 >> 7 & 0x7F, (byte) 94);
						} else if (var62 == 4) {
							if (var65) {
								var51.addByte(var52 + 208, (byte) 56);
							}
							var57 += arg0.payload[var32++];
							var51.addByte(var57 & 0x7F, (byte) 27);
						} else if (var62 == 5) {
							if (var65) {
								var51.addByte(var52 + 160, (byte) 94);
							}
							var53 += arg0.payload[var37++];
							var58 += arg0.payload[var31++];
							var51.addByte(var53 & 0x7F, (byte) 34);
							var51.addByte(var58 & 0x7F, (byte) 74);
						} else if (var62 == 6) {
							if (var65) {
								var51.addByte(var52 + 192, (byte) 88);
							}
							var51.addByte(arg0.payload[var44++], (byte) 60);
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
	}

	public void method3274() {
		if (this.aClass497_7544 != null) {
			return;
		}
		this.aClass497_7544 = new Class497(16);
		int[] var1 = new int[16];
		int[] var2 = new int[16];
		var2[9] = 128;
		var1[9] = 128;
		Class107 var4 = new Class107(this.aByteArray7543);
		int var5 = var4.method1328();
		int var6;
		for (var6 = 0; var6 < var5; var6++) {
			var4.method1333(var6);
			var4.method1334(var6);
			var4.method1340(var6);
		}
		label56: do {
			while (true) {
				var6 = var4.method1339();
				int var7 = var4.anIntArray1012[var6];
				while (var4.anIntArray1012[var6] == var7) {
					var4.method1333(var6);
					int var8 = var4.method1335(var6);
					if (var8 == 1) {
						var4.method1341();
						var4.method1340(var6);
						continue label56;
					}
					int var9 = var8 & 0xF0;
					int var10;
					int var11;
					int var12;
					if (var9 == 176) {
						var10 = var8 & 0xF;
						var11 = var8 >> 8 & 0x7F;
						var12 = var8 >> 16 & 0x7F;
						if (var11 == 0) {
							var1[var10] = (var1[var10] & 0xFFE03FFF) + (var12 << 14);
						}
						if (var11 == 32) {
							var1[var10] = (var1[var10] & 0xFFFFC07F) + (var12 << 7);
						}
					}
					if (var9 == 192) {
						var10 = var8 & 0xF;
						var11 = var8 >> 8 & 0x7F;
						var2[var10] = var1[var10] + var11;
					}
					if (var9 == 144) {
						var10 = var8 & 0xF;
						var11 = var8 >> 8 & 0x7F;
						var12 = var8 >> 16 & 0x7F;
						if (var12 > 0) {
							int var13 = var2[var10];
							Class330_Sub35 var14 = (Class330_Sub35) this.aClass497_7544.method6094((long) var13);
							if (var14 == null) {
								var14 = new Class330_Sub35(new byte[128]);
								this.aClass497_7544.method6097(var14, (long) var13);
							}
							((byte[]) var14.anObject7733)[var11] = 1;
						}
					}
					var4.method1334(var6);
					var4.method1340(var6);
				}
			}
		} while (!var4.method1338());
	}

	public void method3275() {
		this.aClass497_7544 = null;
	}

	public static Class330_Sub6 getFile(IndexTable arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : new Class330_Sub6(new Buffer(var3));
	}
}
