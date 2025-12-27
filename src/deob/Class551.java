package deob;

import java.util.Arrays;

public class Class551 {

	public static int anInt6294 = 6;

	public static int anInt6337 = 2;

	public static int anInt6345 = 1;

	public static short[] aShortArray6351 = new short[256];

	public String aString6323 = "null";

	public int anInt6295 = 1;

	public int anInt6338 = -1;

	public byte aByte6310 = 0;

	public int anInt6313 = -1;

	public boolean aBoolean6314 = true;

	public int anInt6348 = -1;

	public int anInt6316 = 128;

	public int anInt6352 = 128;

	public boolean aBoolean6318 = false;

	public boolean aBoolean6319 = false;

	public boolean aBoolean6308 = false;

	public int anInt6304 = 0;

	public int anInt6312 = 0;

	public int anInt6321 = -1;

	public int anInt6324 = -1;

	public int anInt6325 = 32;

	public int anInt6327 = -1;

	public int anInt6328 = -1;

	public boolean aBoolean6329 = true;

	public boolean aBoolean6330 = true;

	public boolean aBoolean6331 = true;

	public short aShort6332 = 0;

	public short aShort6333 = 0;

	public byte aByte6334 = -96;

	public byte aByte6335 = -16;

	public byte aByte6322 = 0;

	public int anInt6339 = -1;

	public int anInt6355 = -1;

	public int anInt6341 = -1;

	public int anInt6342 = -1;

	public int anInt6343 = 0;

	public int anInt6290 = 0;

	public int anInt6320 = 255;

	public int anInt6299 = -1;

	public Class293 aClass293_6315 = Class293.aClass293_6798;

	public int anInt6340 = -1;

	public byte aByte6344 = -1;

	public int anInt6353 = -1;

	public int anInt6354 = 256;

	public int anInt6350 = 256;

	public int anInt6356 = 0;

	public boolean aBoolean6357 = true;

	public byte aByte6305;

	public byte aByte6309;

	public byte aByte6317;

	public int anInt6293;

	public Class497 aClass497_6347;

	public Class553 aClass553_6292;

	public boolean aBoolean6346;

	public byte[] aByteArray6291;

	public byte[] aByteArray6302;

	public byte[] aByteArray6306;

	public int[] anIntArray6296;

	public int[] anIntArray6297;

	public int[] anIntArray6307;

	public int[] anIntArray6326;

	public int[] anIntArray6336;

	public String[] aStringArray6311;

	public short[] aShortArray6300;

	public short[] aShortArray6301;

	public short[] aShortArray6303;

	public short[] aShortArray6349;

	public int[][] anIntArrayArray6298;

	public void method6365(Buffer arg0, short arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(1475737705);
				if (var3 == 0) {
					if (arg1 > 16384) {
					}
					return;
				}
				this.method6373(arg0, var3, 1922895806);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wu.r(" + ')');
		}
	}

	public final Class387 method6366(Class_ra arg0, int arg1, Class362 arg2, Interface29 arg3, Class477 arg4, Class477 arg5, Class477[] arg6, int[] arg7, int arg8, Class538 arg9, int arg10) {
		try {
			return this.method6367(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.anInt6338, true, -326113681);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "wu.p(" + ')');
		}
	}

	public final Class387 method6367(Class_ra arg0, int arg1, Class362 arg2, Interface29 arg3, Class477 arg4, Class477 arg5, Class477[] arg6, int[] arg7, int arg8, Class538 arg9, int arg10, boolean arg11, int arg12) {
		try {
			if (this.anIntArray6326 != null) {
				Class551 var39 = this.method6371(arg3, (byte) 121);
				return var39 == null ? null : var39.method6367(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, -94788529);
			}
			int var14 = arg1;
			if (this.anInt6352 != 128) {
				var14 = arg1 | 0x2;
			}
			if (this.anInt6316 != 128) {
				var14 |= 0x5;
			}
			boolean var15 = false;
			int var16 = arg6 == null ? 0 : arg6.length;
			for (int var17 = 0; var17 < var16; var17++) {
				if (arg6[var17] != null) {
					var14 |= arg6[var17].method5975(-521138286);
					var15 = true;
				}
			}
			if (arg4 != null) {
				var14 |= arg4.method5975(13912008);
				var15 = true;
			}
			if (arg5 != null) {
				var14 |= arg5.method5975(-482862605);
				var15 = true;
			}
			long var38 = (long) (this.anInt6293 | arg0.anInt4226 << 16);
			if (arg9 != null) {
				var38 |= arg9.aLong6242 << 24;
			}
			Class367 var20 = this.aClass553_6292.aClass367_6370;
			Class387 var19;
			synchronized (this.aClass553_6292.aClass367_6370) {
				var19 = (Class387) this.aClass553_6292.aClass367_6370.get(var38);
			}
			Class364 var40 = null;
			if (!arg11 && arg10 != -1) {
				var40 = arg2.method4254(arg10, 2092775193);
			} else if (this.anInt6338 != -1) {
				var40 = arg2.method4254(this.anInt6338, 1112094706);
			}
			int var25;
			if (var19 == null || (var19.m() & var14) != var14) {
				if (var19 != null) {
					var14 |= var19.m();
				}
				int var21 = var14;
				if (this.aShortArray6300 != null) {
					var21 = var14 | 0x4000;
				}
				if (this.aShortArray6303 != null) {
					var21 |= 0x8000;
				}
				if (this.aByte6310 != 0) {
					var21 |= 0x80000;
				}
				int[] var22 = arg9 == null || arg9.anIntArray6240 == null ? this.anIntArray6296 : arg9.anIntArray6240;
				boolean var23 = false;
				IndexTable var24 = this.aClass553_6292.aClass280_6368;
				synchronized (this.aClass553_6292.aClass280_6368) {
					for (var25 = 0; var25 < var22.length; var25++) {
						if (var22[var25] == -1) {
							if (arg12 >= 324769319) {
								throw new IllegalStateException();
							}
						} else if (!this.aClass553_6292.aClass280_6368.hasStoredFile(var22[var25], 0, (byte) 32)) {
							var23 = true;
						}
					}
				}
				if (var23) {
					return null;
				}
				Model[] var45 = new Model[var22.length];
				for (var25 = 0; var25 < var22.length; var25++) {
					if (var22[var25] != -1) {
						IndexTable var26 = this.aClass553_6292.aClass280_6368;
						synchronized (this.aClass553_6292.aClass280_6368) {
							var45[var25] = Model.loadModel(this.aClass553_6292.aClass280_6368, var22[var25], 0);
						}
						if (var45[var25] != null) {
							if (var45[var25].anInt881 < 13) {
								var45[var25].method1196(2);
							}
							if (this.anIntArrayArray6298 != null && this.anIntArrayArray6298[var25] != null) {
								var45[var25].method1194(this.anIntArrayArray6298[var25][0], this.anIntArrayArray6298[var25][1], this.anIntArrayArray6298[var25][2]);
							}
						}
					} else if (arg12 >= 324769319) {
						throw new IllegalStateException();
					}
				}
				int var27;
				if (var40 != null && var40.anIntArrayArray3807 != null) {
					for (var25 = 0; var25 < var40.anIntArrayArray3807.length; var25++) {
						if (var25 < var45.length) {
							if (var45[var25] != null) {
								int var47 = 0;
								var27 = 0;
								int var28 = 0;
								int var29 = 0;
								int var30 = 0;
								int var31 = 0;
								if (var40.anIntArrayArray3807[var25] != null) {
									var47 = var40.anIntArrayArray3807[var25][0];
									var27 = var40.anIntArrayArray3807[var25][1];
									var28 = var40.anIntArrayArray3807[var25][2];
									var29 = var40.anIntArrayArray3807[var25][3] << 3;
									var30 = var40.anIntArrayArray3807[var25][4] << 3;
									var31 = var40.anIntArrayArray3807[var25][5] << 3;
								}
								if (var29 != 0 || var30 != 0 || var31 != 0) {
									var45[var25].method1195(var29, var30, var31);
								}
								if (var47 != 0 || var27 != 0 || var28 != 0) {
									var45[var25].method1194(var47, var27, var28);
								}
							} else if (arg12 >= 324769319) {
							}
						}
					}
				}
				Model var48;
				if (var45.length == 1) {
					var48 = var45[0];
				} else {
					var48 = new Model(var45, var45.length);
				}
				var19 = arg0.cb(var48, var21, this.aClass553_6292.anInt6372, this.anInt6304 + 64, this.anInt6312 + 850);
				short[] var49;
				if (this.aShortArray6300 != null) {
					if (arg9 == null || arg9.aShortArray6241 == null) {
						var49 = this.aShortArray6301;
					} else {
						var49 = arg9.aShortArray6241;
					}
					for (var27 = 0; var27 < this.aShortArray6300.length; var27++) {
						if (this.aByteArray6302 == null || var27 >= this.aByteArray6302.length) {
							var19.color(this.aShortArray6300[var27], var49[var27]);
						} else {
							var19.color(this.aShortArray6300[var27], aShortArray6351[this.aByteArray6302[var27] & 0xFF]);
						}
					}
				}
				if (this.aShortArray6303 != null) {
					if (arg9 == null || arg9.aShortArray6239 == null) {
						var49 = this.aShortArray6349;
					} else {
						var49 = arg9.aShortArray6239;
					}
					for (var27 = 0; var27 < this.aShortArray6303.length; var27++) {
						var19.paintTexture(this.aShortArray6303[var27], var49[var27]);
					}
				}
				if (this.aByte6310 != 0) {
					var19.PA(this.aByte6317, this.aByte6305, this.aByte6309, this.aByte6310 & 0xFF);
				}
				var19.KA(var14);
				Class367 var50 = this.aClass553_6292.aClass367_6370;
				synchronized (this.aClass553_6292.aClass367_6370) {
					this.aClass553_6292.aClass367_6370.put(var19, var38);
				}
			}
			Class387 var42 = var19.method4446((byte) 4, var14, true);
			boolean var41 = false;
			if (arg7 != null) {
				for (int var43 = 0; var43 < 12; var43++) {
					if (arg7[var43] != -1) {
						var41 = true;
					}
				}
			}
			if (!var15 && !var41) {
				return var42;
			}
			Class247[] var44 = null;
			if (var40 != null) {
				var44 = var40.method4265(-635324641);
			}
			int var46;
			if (var41 && var44 != null) {
				for (var46 = 0; var46 < 12; var46++) {
					if (var44[var46] != null) {
						var42.method4488(var44[var46], 0x1 << var46, true);
					}
				}
			}
			var46 = 0;
			var25 = 1;
			while (var46 < var16) {
				if (arg6[var46] != null) {
					arg6[var46].method5985(var42, 0, var25, -2114260894);
				} else if (arg12 >= 324769319) {
				}
				var46++;
				var25 <<= 0x1;
			}
			if (var41) {
				for (var46 = 0; var46 < 12; var46++) {
					if (arg7[var46] != -1) {
						var25 = arg7[var46] - arg8;
						var25 &= 0x3FFF;
						Class247 var51 = new Class247();
						var51.method2473(0.0F, 1.0F, 0.0F, Class257.method2541(var25));
						var42.method4488(var51, 0x1 << var46, false);
					} else if (arg12 >= 324769319) {
						throw new IllegalStateException();
					}
				}
			}
			if (var41 && var44 != null) {
				for (var46 = 0; var46 < 12; var46++) {
					if (var44[var46] != null) {
						var42.method4488(var44[var46], 0x1 << var46, false);
					}
				}
			}
			if (arg4 != null && arg5 != null) {
				Class111.method1368(var42, arg4, arg5, -962829138);
			} else if (arg4 != null) {
				arg4.method5976(var42, 0, 419422254);
			} else if (arg5 != null) {
				arg5.method5976(var42, 0, 1608185694);
			}
			if (this.anInt6316 != 128 || this.anInt6352 != 128) {
				var42.oa(this.anInt6316, this.anInt6352, this.anInt6316);
			}
			var42.KA(arg1);
			return var42;
		} catch (RuntimeException var37) {
			throw Class476.method5964(var37, "wu.o(" + ')');
		}
	}

	public final Class387 method6368(Class_ra arg0, int arg1, Interface29 arg2, Class477 arg3, Class538 arg4, int arg5) {
		try {
			if (this.anIntArray6326 != null) {
				Class551 var24 = this.method6371(arg2, (byte) 24);
				return var24 == null ? null : var24.method6368(arg0, arg1, arg2, arg3, arg4, 76438474);
			} else if (this.anIntArray6297 == null && (arg4 == null || arg4.anIntArray6240 == null)) {
				return null;
			} else {
				int var7 = arg1;
				if (arg3 != null) {
					var7 = arg1 | arg3.method5975(-570515503);
				}
				long var8 = (long) (this.anInt6293 | arg0.anInt4226 << 16);
				if (arg4 != null) {
					var8 |= arg4.aLong6242 << 24;
				}
				Class367 var11 = this.aClass553_6292.aClass367_6367;
				Class387 var10;
				synchronized (this.aClass553_6292.aClass367_6367) {
					var10 = (Class387) this.aClass553_6292.aClass367_6367.get(var8);
				}
				if (var10 == null || (var10.m() & var7) != var7) {
					if (var10 != null) {
						var7 |= var10.m();
					}
					int var25 = var7;
					if (this.aShortArray6300 != null) {
						var25 = var7 | 0x4000;
					}
					if (this.aShortArray6303 != null) {
						var25 |= 0x8000;
					}
					if (this.aByte6310 != 0) {
						var25 |= 0x80000;
					}
					int[] var12 = arg4 == null || arg4.anIntArray6240 == null ? this.anIntArray6297 : arg4.anIntArray6240;
					boolean var13 = false;
					IndexTable var14 = this.aClass553_6292.aClass280_6368;
					int var15;
					synchronized (this.aClass553_6292.aClass280_6368) {
						for (var15 = 0; var15 < var12.length; var15++) {
							if (!this.aClass553_6292.aClass280_6368.hasStoredFile(var12[var15], 0, (byte) 32)) {
								var13 = true;
							}
						}
					}
					if (var13) {
						return null;
					}
					Model[] var26 = new Model[var12.length];
					IndexTable var27 = this.aClass553_6292.aClass280_6368;
					synchronized (this.aClass553_6292.aClass280_6368) {
						int var16 = 0;
						while (true) {
							if (var16 >= var12.length) {
								break;
							}
							var26[var16] = Model.loadModel(this.aClass553_6292.aClass280_6368, var12[var16], 0);
							var16++;
						}
					}
					for (var15 = 0; var15 < var12.length; var15++) {
						if (var26[var15] != null && var26[var15].anInt881 < 13) {
							var26[var15].method1196(2);
						}
					}
					Model var28;
					if (var26.length == 1) {
						var28 = var26[0];
					} else {
						var28 = new Model(var26, var26.length);
					}
					var10 = arg0.cb(var28, var25, this.aClass553_6292.anInt6372, 64, 768);
					int var17;
					short[] var29;
					if (this.aShortArray6300 != null) {
						if (arg4 == null || arg4.aShortArray6241 == null) {
							var29 = this.aShortArray6301;
						} else {
							var29 = arg4.aShortArray6241;
						}
						for (var17 = 0; var17 < this.aShortArray6300.length; var17++) {
							if (this.aByteArray6302 == null || var17 >= this.aByteArray6302.length) {
								var10.color(this.aShortArray6300[var17], var29[var17]);
							} else {
								var10.color(this.aShortArray6300[var17], aShortArray6351[this.aByteArray6302[var17] & 0xFF]);
							}
						}
					}
					if (this.aShortArray6303 != null) {
						if (arg4 == null || arg4.aShortArray6239 == null) {
							var29 = this.aShortArray6349;
						} else {
							var29 = arg4.aShortArray6239;
						}
						for (var17 = 0; var17 < this.aShortArray6303.length; var17++) {
							var10.paintTexture(this.aShortArray6303[var17], var29[var17]);
						}
					}
					if (this.aByte6310 != 0) {
						var10.PA(this.aByte6317, this.aByte6305, this.aByte6309, this.aByte6310 & 0xFF);
					}
					var10.KA(var7);
					Class367 var30 = this.aClass553_6292.aClass367_6367;
					synchronized (this.aClass553_6292.aClass367_6367) {
						this.aClass553_6292.aClass367_6367.put(var10, var8);
					}
				}
				if (arg3 != null) {
					var10 = var10.method4446((byte) 1, var7, true);
					arg3.method5976(var10, 0, 266829811);
				}
				var10.KA(arg1);
				return var10;
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "wu.s(" + ')');
		}
	}

	public final boolean method6369(int arg0) {
		try {
			if (this.anIntArray6296 == null) {
				return true;
			}
			boolean var2 = true;
			int[] var3 = this.anIntArray6296;
			for (int var4 = 0; var4 < var3.length; var4++) {
				int var5 = var3[var4];
				if (!this.aClass553_6292.aClass280_6368.hasStoredFile(var5, 0, (byte) 32)) {
					var2 = false;
				}
			}
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "wu.f(" + ')');
		}
	}

	public int method6370(int arg0, int arg1, byte arg2) {
		try {
			if (this.aClass497_6347 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_6347.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wu.z(" + ')');
		}
	}

	public final Class551 method6371(Interface29 arg0, byte arg1) {
		try {
			int var3 = -1;
			if (this.anInt6327 != -1) {
				var3 = arg0.method310(this.anInt6327, -1142236263);
			} else if (this.anInt6328 != -1) {
				var3 = arg0.method306(this.anInt6328, 1874006054);
			}
			if (var3 >= 0 && var3 < this.anIntArray6326.length - 1) {
				return this.anIntArray6326[var3] == -1 ? null : this.aClass553_6292.method6392(this.anIntArray6326[var3], 143121426);
			} else {
				int var4 = this.anIntArray6326[this.anIntArray6326.length - 1];
				return var4 == -1 ? null : this.aClass553_6292.method6392(var4, 1281974313);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wu.n(" + ')');
		}
	}

	public boolean method6372(byte arg0) {
		try {
			if (this.anIntArray6326 == null) {
				return this.anInt6339 != -1 || this.anInt6341 != -1 || this.anInt6342 != -1;
			}
			for (int var2 = 0; var2 < this.anIntArray6326.length; var2++) {
				if (this.anIntArray6326[var2] != -1) {
					Class551 var3 = this.aClass553_6292.method6392(this.anIntArray6326[var2], 1363655041);
					if (var3.anInt6339 != -1 || var3.anInt6341 != -1 || var3.anInt6342 != -1) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wu.b(" + ')');
		}
	}

	public void method6373(Buffer arg0, int arg1, int arg2) {
		try {
			int var4;
			int var5;
			if (arg1 == 1) {
				var4 = arg0.readUnsignedByte(321830034);
				this.anIntArray6296 = new int[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray6296[var5] = arg0.readBigSmart(-799971705);
				}
			} else if (arg1 == 2) {
				this.aString6323 = arg0.readString(-529191054);
			} else if (arg1 == 12) {
				this.anInt6295 = arg0.readUnsignedByte(-229231230);
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aStringArray6311[arg1 - 30] = arg0.readString(-142659655);
			} else if (arg1 == 40) {
				var4 = arg0.readUnsignedByte(1623069605);
				this.aShortArray6300 = new short[var4];
				this.aShortArray6301 = new short[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aShortArray6300[var5] = (short) arg0.readUnsignedShort(2058054360);
					this.aShortArray6301[var5] = (short) arg0.readUnsignedShort(768707700);
				}
			} else if (arg1 == 41) {
				var4 = arg0.readUnsignedByte(62108810);
				this.aShortArray6303 = new short[var4];
				this.aShortArray6349 = new short[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aShortArray6303[var5] = (short) arg0.readUnsignedShort(1115056775);
					this.aShortArray6349[var5] = (short) arg0.readUnsignedShort(1938176657);
				}
			} else if (arg1 == 42) {
				var4 = arg0.readUnsignedByte(1360093741);
				this.aByteArray6302 = new byte[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aByteArray6302[var5] = arg0.readByte((byte) -17);
				}
			} else {
				int var6;
				int var7;
				byte var10;
				if (arg1 == 44) {
					var4 = arg0.readUnsignedShort(1742323043);
					var5 = 0;
					for (var6 = var4; var6 > 0; var6 >>= 0x1) {
						var5++;
					}
					this.aByteArray6291 = new byte[var5];
					var10 = 0;
					for (var7 = 0; var7 < var5; var7++) {
						if ((var4 & 0x1 << var7) > 0) {
							this.aByteArray6291[var7] = var10++;
						} else {
							this.aByteArray6291[var7] = -1;
						}
					}
				} else if (arg1 == 45) {
					var4 = arg0.readUnsignedShort(1101995272);
					var5 = 0;
					for (var6 = var4; var6 > 0; var6 >>= 0x1) {
						var5++;
					}
					this.aByteArray6306 = new byte[var5];
					var10 = 0;
					for (var7 = 0; var7 < var5; var7++) {
						if ((var4 & 0x1 << var7) > 0) {
							this.aByteArray6306[var7] = var10++;
						} else {
							this.aByteArray6306[var7] = -1;
						}
					}
				} else if (arg1 == 60) {
					var4 = arg0.readUnsignedByte(1088971499);
					this.anIntArray6297 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray6297[var5] = arg0.readBigSmart(-523404175);
					}
				} else if (arg1 == 93) {
					this.aBoolean6314 = false;
				} else if (arg1 == 95) {
					this.anInt6348 = arg0.readUnsignedShort(1303622023);
				} else if (arg1 == 97) {
					this.anInt6316 = arg0.readUnsignedShort(-380251340);
				} else if (arg1 == 98) {
					this.anInt6352 = arg0.readUnsignedShort(578071546);
				} else if (arg1 == 99) {
					this.aBoolean6318 = true;
				} else if (arg1 == 100) {
					this.anInt6304 = arg0.readByte((byte) -65);
				} else if (arg1 == 101) {
					this.anInt6312 = arg0.readByte((byte) 37) * 5;
				} else if (arg1 == 102) {
					this.anInt6321 = arg0.readUnsignedShort(1204879437);
				} else if (arg1 == 103) {
					this.anInt6325 = arg0.readUnsignedShort(1962479815);
				} else if (arg1 == 106 || arg1 == 118) {
					this.anInt6327 = arg0.readUnsignedShort(1214687029);
					if (this.anInt6327 == 65535) {
						this.anInt6327 = -1;
					}
					this.anInt6328 = arg0.readUnsignedShort(1356373965);
					if (this.anInt6328 == 65535) {
						this.anInt6328 = -1;
					}
					var4 = -1;
					if (arg1 == 118) {
						var4 = arg0.readUnsignedShort(128559206);
						if (var4 == 65535) {
							var4 = -1;
						}
					}
					var5 = arg0.readUnsignedByte(600700587);
					this.anIntArray6326 = new int[var5 + 2];
					for (var6 = 0; var6 <= var5; var6++) {
						this.anIntArray6326[var6] = arg0.readUnsignedShort(1555762412);
						if (this.anIntArray6326[var6] == 65535) {
							this.anIntArray6326[var6] = -1;
						}
					}
					this.anIntArray6326[var5 + 1] = var4;
				} else if (arg1 == 107) {
					this.aBoolean6329 = false;
				} else if (arg1 == 109) {
					this.aBoolean6330 = false;
				} else if (arg1 == 111) {
					this.aBoolean6331 = false;
				} else if (arg1 == 113) {
					this.aShort6332 = (short) arg0.readUnsignedShort(323887);
					this.aShort6333 = (short) arg0.readUnsignedShort(1277075153);
				} else if (arg1 == 114) {
					this.aByte6334 = arg0.readByte((byte) -32);
					this.aByte6335 = arg0.readByte((byte) 0);
				} else if (arg1 == 119) {
					this.aByte6322 = arg0.readByte((byte) -44);
				} else if (arg1 == 121) {
					this.anIntArrayArray6298 = new int[this.anIntArray6296.length][];
					var4 = arg0.readUnsignedByte(6417905);
					for (var5 = 0; var5 < var4; var5++) {
						var6 = arg0.readUnsignedByte(384889471);
						int[] var11 = this.anIntArrayArray6298[var6] = new int[3];
						var11[0] = arg0.readByte((byte) 7);
						var11[1] = arg0.readByte((byte) 16);
						var11[2] = arg0.readByte((byte) -48);
					}
				} else if (arg1 == 123) {
					this.anInt6299 = arg0.readUnsignedShort(1191032372);
				} else if (arg1 == 125) {
					this.aClass293_6315 = (Class293) Class479.method6015(Class476.method5962(-1715692560), arg0.readByte((byte) -1), (byte) 43);
				} else if (arg1 == 127) {
					this.anInt6338 = arg0.readUnsignedShort(1911036068);
				} else if (arg1 == 128) {
					Class479.method6015(Class487_Sub1.method6040(298230347), arg0.readUnsignedByte(162213543), (byte) 2);
				} else if (arg1 == 134) {
					this.anInt6339 = arg0.readUnsignedShort(931471899);
					if (this.anInt6339 == 65535) {
						this.anInt6339 = -1;
					}
					this.anInt6355 = arg0.readUnsignedShort(1819902961);
					if (this.anInt6355 == 65535) {
						this.anInt6355 = -1;
					}
					this.anInt6341 = arg0.readUnsignedShort(125265806);
					if (this.anInt6341 == 65535) {
						this.anInt6341 = -1;
					}
					this.anInt6342 = arg0.readUnsignedShort(787333018);
					if (this.anInt6342 == 65535) {
						this.anInt6342 = -1;
					}
					this.anInt6343 = arg0.readUnsignedByte(-111917808);
				} else if (arg1 == 135 || arg1 == 136) {
					arg0.readUnsignedByte(1996675522);
					arg0.readUnsignedShort(-237983780);
				} else if (arg1 == 137) {
					this.anInt6313 = arg0.readUnsignedShort(1368912621);
				} else if (arg1 == 138) {
					this.anInt6324 = arg0.readBigSmart(-878599376);
				} else if (arg1 == 140) {
					this.anInt6320 = arg0.readUnsignedByte(1477308551);
				} else if (arg1 == 141) {
					this.aBoolean6308 = true;
				} else if (arg1 == 142) {
					this.anInt6340 = arg0.readUnsignedShort(1262250102);
				} else if (arg1 == 143) {
					this.aBoolean6319 = true;
				} else if (arg1 >= 150 && arg1 < 155) {
					this.aStringArray6311[arg1 - 150] = arg0.readString(2004353721);
					if (!this.aClass553_6292.aBoolean6366) {
						this.aStringArray6311[arg1 - 150] = null;
					}
				} else if (arg1 == 155) {
					this.aByte6317 = arg0.readByte((byte) -58);
					this.aByte6305 = arg0.readByte((byte) -101);
					this.aByte6309 = arg0.readByte((byte) 113);
					this.aByte6310 = arg0.readByte((byte) 1);
				} else if (arg1 == 158) {
					this.aByte6344 = 1;
				} else if (arg1 == 159) {
					this.aByte6344 = 0;
				} else if (arg1 == 160) {
					var4 = arg0.readUnsignedByte(2102111820);
					this.anIntArray6336 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray6336[var5] = arg0.readUnsignedShort(1619146285);
					}
				} else if (arg1 == 162) {
					this.aBoolean6346 = true;
				} else if (arg1 == 163) {
					this.anInt6353 = arg0.readUnsignedByte(-107010477);
				} else if (arg1 == 164) {
					this.anInt6354 = arg0.readUnsignedShort(575380044);
					this.anInt6350 = arg0.readUnsignedShort(1839780279);
				} else if (arg1 == 165) {
					this.anInt6356 = arg0.readUnsignedByte(1286810705);
				} else if (arg1 == 168) {
					this.anInt6290 = arg0.readUnsignedByte(861675360);
				} else if (arg1 == 169) {
					this.aBoolean6357 = false;
				} else if (arg1 >= 170 && arg1 < 176) {
					if (this.anIntArray6307 == null) {
						this.anIntArray6307 = new int[6];
						Arrays.fill(this.anIntArray6307, -1);
					}
					var4 = arg0.readUnsignedShort(838443585);
					if (var4 == 65535) {
						var4 = -1;
					}
					this.anIntArray6307[arg1 - 170] = var4;
				} else if (arg1 == 249) {
					var4 = arg0.readUnsignedByte(595449270);
					if (this.aClass497_6347 == null) {
						var5 = Class136.method1594(var4, 1940839529);
						this.aClass497_6347 = new Class497(var5);
					}
					for (var5 = 0; var5 < var4; var5++) {
						boolean var12 = arg0.readUnsignedByte(-6646822) == 1;
						var7 = arg0.readUnsignedTriByte(-1401356047);
						Class330 var8;
						if (var12) {
							var8 = new Class330_Sub35(arg0.readString(-1277658405));
						} else {
							var8 = new Class330_Sub23(arg0.readInt((byte) 114));
						}
						this.aClass497_6347.method6097(var8, (long) var7);
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "wu.j(" + ')');
		}
	}

	public boolean method6374(Interface29 arg0, byte arg1) {
		try {
			if (this.anIntArray6326 == null) {
				return true;
			}
			int var3 = -1;
			if (this.anInt6327 != -1) {
				var3 = arg0.method310(this.anInt6327, -876083746);
			} else if (this.anInt6328 != -1) {
				var3 = arg0.method306(this.anInt6328, 758010653);
			}
			if (var3 >= 0 && var3 < this.anIntArray6326.length - 1) {
				return this.anIntArray6326[var3] != -1;
			} else {
				int var4 = this.anIntArray6326[this.anIntArray6326.length - 1];
				return var4 != -1;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wu.l(" + ')');
		}
	}

	public void method6375(int arg0) {
		try {
			if (this.anIntArray6296 == null) {
				this.anIntArray6296 = new int[0];
			}
			if (this.aByte6344 == -1) {
				if (Class435.aClass435_4421 == this.aClass553_6292.aClass435_6369) {
					this.aByte6344 = 1;
				} else {
					this.aByte6344 = 0;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "wu.i(" + ')');
		}
	}

	public String method6376(int arg0, String arg1, int arg2) {
		try {
			if (this.aClass497_6347 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_6347.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wu.w(" + ')');
		}
	}

	public int method6377(int arg0, int arg1) {
		try {
			return this.anIntArray6307 == null ? -1 : this.anIntArray6307[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wu.k(" + ')');
		}
	}

	public static final void method6378(int arg0) {
		try {
			Class360.aLong3750 = -1L;
			Class360.aLong3776 = 0L;
			Class360.anInt3749 = -1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "wu.p(" + ')');
		}
	}

	public static final void method6379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			if (arg2 >= 1 && arg3 >= 1 && arg2 <= client.aClass304_9030.method2990(-688342294) - 2 && arg3 <= client.aClass304_9030.method3033((byte) -64) - 2) {
				int var9 = arg0;
				if (arg0 < 3 && client.aClass304_9030.method2995(1233922452).method2788(arg2, arg3, (byte) -8)) {
					var9 = arg0 + 1;
				}
				if (client.aClass304_9030.method3023(-400722441) != null) {
					client.aClass304_9030.method3001((byte) 65).method2706(Class361.aClass_ra3793, arg0, arg1, arg2, arg3, client.aClass304_9030.method2996(arg0, 1875135057), 2082517705);
					if (arg4 >= 0) {
						int var10 = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535);
						Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, 1, 712398265);
						client.aClass304_9030.method3001((byte) 59).method2711(Class361.aClass_ra3793, var9, arg0, arg2, arg3, arg4, arg5, arg6, client.aClass304_9030.method2996(arg0, 1875135057), arg7, 291744390);
						Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, var10, -1402163528);
					}
				}
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "wu.f(" + ')');
		}
	}

	public static final void method6380(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -17131347);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class384.method4422(var3, var4, arg0, -2137936648);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "wu.fv(" + ')');
		}
	}

	public static final void method6381(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 & var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "wu.zu(" + ')');
		}
	}
}
