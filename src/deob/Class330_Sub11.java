package deob;

public class Class330_Sub11 extends Class330 {

	public Class330_Sub29_Sub1[] aClass330_Sub29_Sub1Array7592 = new Class330_Sub29_Sub1[128];

	public short[] aShortArray7593 = new short[128];

	public byte[] aByteArray7597 = new byte[128];

	public byte[] aByteArray7595 = new byte[128];

	public Class116[] aClass116Array7591 = new Class116[128];

	public byte[] aByteArray7596 = new byte[128];

	public int[] anIntArray7598 = new int[128];

	public int anInt7594;

	public Class330_Sub11(byte[] arg0) {
		Buffer var2 = new Buffer(arg0);
		int var3;
		for (var3 = 0; var2.payload[var3 + var2.offset] != 0; var3++) {
		}
		byte[] var4 = new byte[var3];
		int var5;
		for (var5 = 0; var5 < var3; var5++) {
			var4[var5] = var2.readByte((byte) -16);
		}
		var2.offset++;
		var3++;
		var5 = var2.offset;
		var2.offset += var3;
		int var6;
		for (var6 = 0; var2.payload[var2.offset + var6] != 0; var6++) {
		}
		byte[] var7 = new byte[var6];
		int var8;
		for (var8 = 0; var8 < var6; var8++) {
			var7[var8] = var2.readByte((byte) 10);
		}
		var2.offset++;
		var6++;
		var8 = var2.offset;
		var2.offset += var6;
		int var9;
		for (var9 = 0; var2.payload[var2.offset + var9] != 0; var9++) {
		}
		byte[] var10 = new byte[var9];
		for (int var11 = 0; var11 < var9; var11++) {
			var10[var11] = var2.readByte((byte) -1);
		}
		var2.offset++;
		var9++;
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;
			for (var14 = 2; var14 < var9; var14++) {
				int var15 = var2.readUnsignedByte(690097612);
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						var15--;
					}
					var13 = var15;
				}
				var36[var14] = (byte) var13;
			}
		} else {
			var12 = var9;
		}
		Class116[] var37 = new Class116[var12];
		for (var14 = 0; var14 < var37.length; var14++) {
			Class116 var38 = var37[var14] = new Class116();
			int var16 = var2.readUnsignedByte(238247461);
			if (var16 > 0) {
				var38.aByteArray1373 = new byte[var16 * 2];
			}
			var16 = var2.readUnsignedByte(-22284680);
			if (var16 > 0) {
				var38.aByteArray1370 = new byte[var16 * 2 + 2];
				var38.aByteArray1370[1] = 64;
			}
		}
		var14 = var2.readUnsignedByte(-278253109);
		byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte(1470730538);
		byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;
		int var17;
		for (var17 = 0; var2.payload[var2.offset + var17] != 0; var17++) {
		}
		byte[] var18 = new byte[var17];
		int var19;
		for (var19 = 0; var19 < var17; var19++) {
			var18[var19] = var2.readByte((byte) -1);
		}
		var2.offset++;
		var17++;
		var19 = 0;
		int var20;
		for (var20 = 0; var20 < 128; var20++) {
			var19 += var2.readUnsignedByte(1029821946);
			this.aShortArray7593[var20] = (short) var19;
		}
		var19 = 0;
		for (var20 = 0; var20 < 128; var20++) {
			var19 += var2.readUnsignedByte(-196776432);
			this.aShortArray7593[var20] = (short) (this.aShortArray7593[var20] + (var19 << 8));
		}
		var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23;
		for (var23 = 0; var23 < 128; var23++) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}
				var22 = var2.method3770(485008648);
			}
			this.aShortArray7593[var23] = (short) (this.aShortArray7593[var23] + ((var22 - 1 & 0x2) << 14));
			this.anIntArray7598[var23] = var22;
			var20--;
		}
		var20 = 0;
		var21 = 0;
		var23 = 0;
		int var24;
		for (var24 = 0; var24 < 128; var24++) {
			if (this.anIntArray7598[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}
					var23 = var2.payload[var5++] - 1;
				}
				this.aByteArray7596[var24] = (byte) var23;
				var20--;
			}
		}
		var20 = 0;
		var21 = 0;
		var24 = 0;
		for (int var25 = 0; var25 < 128; var25++) {
			if (this.anIntArray7598[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}
					var24 = var2.payload[var8++] + 16 << 2;
				}
				this.aByteArray7595[var25] = (byte) var24;
				var20--;
			}
		}
		var20 = 0;
		var21 = 0;
		Class116 var41 = null;
		int var26;
		for (var26 = 0; var26 < 128; var26++) {
			if (this.anIntArray7598[var26] != 0) {
				if (var20 == 0) {
					var41 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}
				this.aClass116Array7591[var26] = var41;
				var20--;
			}
		}
		var20 = 0;
		var21 = 0;
		var26 = 0;
		int var27;
		for (var27 = 0; var27 < 128; var27++) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}
				if (this.anIntArray7598[var27] > 0) {
					var26 = var2.readUnsignedByte(1378245220) + 1;
				}
			}
			this.aByteArray7597[var27] = (byte) var26;
			var20--;
		}
		this.anInt7594 = var2.readUnsignedByte(1490073628) + 1;
		Class116 var28;
		int var29;
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.aByteArray1373 != null) {
				for (var29 = 1; var29 < var28.aByteArray1373.length; var29 += 2) {
					var28.aByteArray1373[var29] = var2.readByte((byte) 23);
				}
			}
			if (var28.aByteArray1370 != null) {
				for (var29 = 3; var29 < var28.aByteArray1370.length - 2; var29 += 2) {
					var28.aByteArray1370[var29] = var2.readByte((byte) -73);
				}
			}
		}
		if (var39 != null) {
			for (var27 = 1; var27 < var39.length; var27 += 2) {
				var39[var27] = var2.readByte((byte) 45);
			}
		}
		if (var40 != null) {
			for (var27 = 1; var27 < var40.length; var27 += 2) {
				var40[var27] = var2.readByte((byte) 31);
			}
		}
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.aByteArray1370 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var28.aByteArray1370.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte(778032866);
					var28.aByteArray1370[var29] = (byte) var19;
				}
			}
		}
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.aByteArray1373 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var28.aByteArray1373.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte(1166200370);
					var28.aByteArray1373[var29] = (byte) var19;
				}
			}
		}
		byte var30;
		int var32;
		int var33;
		int var34;
		byte var46;
		Object var47;
		if (var39 != null) {
			var19 = var2.readUnsignedByte(1714502074);
			var39[0] = (byte) var19;
			for (var27 = 2; var27 < var39.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte(1742716749);
				var39[var27] = (byte) var19;
			}
			var46 = var39[0];
			byte var42 = var39[1];
			for (var29 = 0; var29 < var46; var29++) {
				this.aByteArray7597[var29] = (byte) (var42 * this.aByteArray7597[var29] + 32 >> 6);
			}
			for (var29 = 2; var29 < var39.length; var29 += 2) {
				var30 = var39[var29];
				byte var31 = var39[var29 + 1];
				var32 = var42 * (var30 - var46) + (var30 - var46) / 2;
				for (var33 = var46; var33 < var30; var33++) {
					var34 = Class81.method950(var32, var30 - var46, (byte) 120);
					this.aByteArray7597[var33] = (byte) (this.aByteArray7597[var33] * var34 + 32 >> 6);
					var32 += var31 - var42;
				}
				var46 = var30;
				var42 = var31;
			}
			for (var29 = var46; var29 < 128; var29++) {
				this.aByteArray7597[var29] = (byte) (this.aByteArray7597[var29] * var42 + 32 >> 6);
			}
			var47 = null;
		}
		if (var40 != null) {
			var19 = var2.readUnsignedByte(276905052);
			var40[0] = (byte) var19;
			for (var27 = 2; var27 < var40.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte(1420437706);
				var40[var27] = (byte) var19;
			}
			var46 = var40[0];
			int var43 = var40[1] << 1;
			int var44;
			for (var29 = 0; var29 < var46; var29++) {
				var44 = var43 + (this.aByteArray7595[var29] & 0xFF);
				if (var44 < 0) {
					var44 = 0;
				}
				if (var44 > 128) {
					var44 = 128;
				}
				this.aByteArray7595[var29] = (byte) var44;
			}
			for (var29 = 2; var29 < var40.length; var29 += 2) {
				var30 = var40[var29];
				int var45 = var40[var29 + 1] << 1;
				var32 = var43 * (var30 - var46) + (var30 - var46) / 2;
				for (var33 = var46; var33 < var30; var33++) {
					var34 = Class81.method950(var32, var30 - var46, (byte) 13);
					int var35 = (this.aByteArray7595[var33] & 0xFF) + var34;
					if (var35 < 0) {
						var35 = 0;
					}
					if (var35 > 128) {
						var35 = 128;
					}
					this.aByteArray7595[var33] = (byte) var35;
					var32 += var45 - var43;
				}
				var46 = var30;
				var43 = var45;
			}
			for (var29 = var46; var29 < 128; var29++) {
				var44 = (this.aByteArray7595[var29] & 0xFF) + var43;
				if (var44 < 0) {
					var44 = 0;
				}
				if (var44 > 128) {
					var44 = 128;
				}
				this.aByteArray7595[var29] = (byte) var44;
			}
			var47 = null;
		}
		for (var27 = 0; var27 < var12; var27++) {
			var37[var27].anInt1367 = var2.readUnsignedByte(-258907808);
		}
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.aByteArray1373 != null) {
				var28.anInt1366 = var2.readUnsignedByte(429187381);
			}
			if (var28.aByteArray1370 != null) {
				var28.anInt1368 = var2.readUnsignedByte(1409936322);
			}
			if (var28.anInt1367 > 0) {
				var28.anInt1365 = var2.readUnsignedByte(-180137697);
			}
		}
		for (var27 = 0; var27 < var12; var27++) {
			var37[var27].anInt1372 = var2.readUnsignedByte(1153671048);
		}
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.anInt1372 > 0) {
				var28.anInt1371 = var2.readUnsignedByte(252376722);
			}
		}
		for (var27 = 0; var27 < var12; var27++) {
			var28 = var37[var27];
			if (var28.anInt1371 > 0) {
				var28.anInt1369 = var2.readUnsignedByte(1970920020);
			}
		}
	}

	public void method3289(int arg0) {
		try {
			this.anIntArray7598 = null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "acq.i(" + ')');
		}
	}

	public boolean method3290(Class305 arg0, byte[] arg1, int[] arg2, int arg3) {
		try {
			boolean var5 = true;
			int var6 = 0;
			Class330_Sub29_Sub1 var7 = null;
			for (int var8 = 0; var8 < 128; var8++) {
				if (arg1 == null || arg1[var8] != 0) {
					int var9 = this.anIntArray7598[var8];
					if (var9 != 0) {
						if (var9 != var6) {
							var6 = var9--;
							if ((var9 & 0x1) == 0) {
								var7 = arg0.method3041(var9 >> 2, arg2, 1116948326);
							} else {
								var7 = arg0.method3038(var9 >> 2, arg2, 1114172775);
							}
							if (var7 == null) {
								var5 = false;
							}
						}
						if (var7 != null) {
							this.aClass330_Sub29_Sub1Array7592[var8] = var7;
							this.anIntArray7598[var8] = 0;
						}
					} else if (arg3 >= -411270809) {
					}
				}
			}
			return var5;
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "acq.j(" + ')');
		}
	}

	public static void method3291(int arg0) {
		try {
			Class490 var1 = null;
			try {
				var1 = Preferences.loadPreferences("2", client.aClass435_9146.aString4422, true, 295846241);
				Buffer var2 = new Buffer(client.anInt9205 * 6 + 3);
				var2.addByte(1, (byte) 43);
				var2.addShort(client.anInt9205, (byte) 114);
				for (int var3 = 0; var3 < Class555.anIntArray6382.length; var3++) {
					if (Class330_Sub26.aBooleanArray7696[var3]) {
						var2.addShort(var3, (byte) 95);
						var2.addInt(Class555.anIntArray6382[var3], 1965508160);
					}
				}
				var1.method6068(var2.payload, 0, var2.offset, -1154489731);
			} catch (Exception var5) {
			}
			try {
				if (var1 != null) {
					var1.method6064(193439994);
				}
			} catch (Exception var4) {
			}
			client.aLong8990 = Class312.method3111((byte) 81);
			client.aBoolean9206 = false;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "acq.go(" + ')');
		}
	}

	public static void method3292(int arg0) {
		try {
			Class330_Sub36_Sub3.aClass497_9653.method6100(65280);
			Class330_Sub36_Sub3.aClass472_9652.method5889(-1769384691);
			Class330_Sub36_Sub3.aClass472_9625.method5889(-746858487);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "acq.j(" + ')');
		}
	}
}
