package deob;

public class Class408 {

	public int anInt4210 = -1;

	public static int anInt4200 = Integer.MIN_VALUE;

	public static int anInt4201 = 1;

	public static int anInt4206 = 1073741824;

	public static int[] anIntArray4212 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	public static Class367 aClass367_4202 = new Class367(260);

	public static Class367 aClass367_4207 = new Class367(5);

	public int anInt4214;

	public long aLong4208;

	public long aLong4209;

	public boolean aBoolean4213;

	public int[] anIntArray4203;

	public int[] anIntArray4205;

	public ItemEquipDefinitions[] aClass518Array4204;

	public static short[][] modelColors;

	public static short[][][] modifiedModelColors;

	public void method4757(int arg0, int[] arg1, ItemEquipDefinitions[] arg2, int[] arg3, boolean arg4, int arg5, int arg6) {
		try {
			if (this.anInt4214 != arg0) {
				this.anInt4214 = arg0;
			}
			this.anIntArray4203 = arg1;
			this.aClass518Array4204 = arg2;
			this.anIntArray4205 = arg3;
			this.aBoolean4213 = arg4;
			this.anInt4210 = arg5;
			this.method4761(421989841);
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "qy.r(" + ')');
		}
	}

	public void method4758(int arg0, int arg1, int arg2) {
		try {
			this.anIntArray4205[arg0] = arg1;
			this.method4761(1029170245);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qy.i(" + ')');
		}
	}

	public Class387 method4759(Class_ra arg0, int arg1, Class169 arg2, Class436 arg3, Class477 arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			int var10 = arg4 == null ? arg1 : arg1 | arg4.method5975(-1598257004);
			long var11 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
			Class367 var14 = aClass367_4207;
			Class387 var13;
			synchronized (aClass367_4207) {
				var13 = (Class387) aClass367_4207.get(var11);
			}
			if (var13 == null || arg0.ct(var13.m(), var10) != 0) {
				if (var13 != null) {
					var10 = arg0.cd(var10, var13.m());
				}
				Model[] var15 = new Model[3];
				int var16 = 0;
				if (!arg2.method2031(arg5, (byte) -1).method1777((short) 22129) || !arg2.method2031(arg6, (byte) -1).method1777((short) -4092) || !arg2.method2031(arg7, (byte) -1).method1777((short) 20662)) {
					return null;
				}
				Model var17 = arg2.method2031(arg5, (byte) -1).method1778(-218128777);
				if (var17 != null) {
					var15[var16++] = var17;
				}
				var17 = arg2.method2031(arg6, (byte) -1).method1778(1772154646);
				if (var17 != null) {
					var15[var16++] = var17;
				}
				var17 = arg2.method2031(arg7, (byte) -1).method1778(-750129393);
				if (var17 != null) {
					var15[var16++] = var17;
				}
				var17 = new Model(var15, var16);
				int var24 = var10 | 0x4000;
				var13 = arg0.cb(var17, var24, Class132.anInt1506, 64, 768);
				for (int var18 = 0; var18 < 10; var18++) {
					for (int var19 = 0; var19 < modelColors[var18].length; var19++) {
						if (this.anIntArray4205[var18] < modifiedModelColors[var18][var19].length) {
							var13.color(modelColors[var18][var19], modifiedModelColors[var18][var19][this.anIntArray4205[var18]]);
						}
					}
				}
				var13.KA(var10);
				Class367 var25 = aClass367_4207;
				synchronized (aClass367_4207) {
					aClass367_4207.put(var13, var11);
				}
			}
			if (arg4 == null) {
				return var13;
			} else {
				var13 = var13.method4446((byte) 4, var10, true);
				arg4.method5976(var13, 0, 1902067144);
				return var13;
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "qy.w(" + ')');
		}
	}

	public void method4760(int arg0, int arg1, Class510 arg2, int arg3) {
		try {
			if (arg1 == -1) {
				this.anIntArray4203[arg0] = 0;
			} else if (arg2.getItemDefinitions(arg1, (byte) -123) != null) {
				this.anIntArray4203[arg0] = arg1 | 0x40000000;
				this.method4761(1297997246);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qy.o(" + ')');
		}
	}

	public void method4761(int arg0) {
		try {
			long[] var2 = Buffer.aLongArray7850;
			this.aLong4208 = -1L;
			this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.anInt4214 >> 8)) & 0xFFL)];
			this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) this.anInt4214) & 0xFFL)];
			int var3;
			for (var3 = 0; var3 < this.anIntArray4203.length; var3++) {
				this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.anIntArray4203[var3] >> 24)) & 0xFFL)];
				this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.anIntArray4203[var3] >> 16)) & 0xFFL)];
				this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.anIntArray4203[var3] >> 8)) & 0xFFL)];
				this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) this.anIntArray4203[var3]) & 0xFFL)];
			}
			if (this.aClass518Array4204 != null) {
				for (var3 = 0; var3 < this.aClass518Array4204.length; var3++) {
					if (this.aClass518Array4204[var3] != null) {
						int[] var4;
						int[] var5;
						if (this.aBoolean4213) {
							var4 = this.aClass518Array4204[var3].femaleEquipIds;
							var5 = this.aClass518Array4204[var3].archiveIds;
						} else {
							var4 = this.aClass518Array4204[var3].maleEquipIds;
							var5 = this.aClass518Array4204[var3].archiveIds2;
						}
						int var6;
						if (var4 != null) {
							for (var6 = 0; var6 < var4.length; var6++) {
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (var4[var6] >> 8)) & 0xFFL)];
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) var4[var6]) & 0xFFL)];
							}
						}
						if (var5 != null) {
							for (var6 = 0; var6 < var5.length; var6++) {
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (var5[var6] >> 8)) & 0xFFL)];
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) var5[var6]) & 0xFFL)];
							}
						}
						if (this.aClass518Array4204[var3].moreModifiedColors != null) {
							for (var6 = 0; var6 < this.aClass518Array4204[var3].moreModifiedColors.length; var6++) {
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.aClass518Array4204[var3].moreModifiedColors[var6] >> 8)) & 0xFFL)];
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) this.aClass518Array4204[var3].moreModifiedColors[var6]) & 0xFFL)];
							}
						}
						if (this.aClass518Array4204[var3].aShortArray6009 != null) {
							for (var6 = 0; var6 < this.aClass518Array4204[var3].aShortArray6009.length; var6++) {
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.aClass518Array4204[var3].aShortArray6009[var6] >> 8)) & 0xFFL)];
								this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) this.aClass518Array4204[var3].aShortArray6009[var6]) & 0xFFL)];
							}
						}
					}
				}
			}
			for (var3 = 0; var3 < 10; var3++) {
				this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) this.anIntArray4205[var3]) & 0xFFL)];
			}
			this.aLong4208 = this.aLong4208 >>> 8 ^ var2[(int) ((this.aLong4208 ^ (long) (this.aBoolean4213 ? 1 : 0)) & 0xFFL)];
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "qy.s(" + ')');
		}
	}

	public Class387 method4762(Class_ra arg0, int arg1, Class362 arg2, Class169 arg3, Class553 arg4, Class510 arg5, Class436 arg6, Interface29 arg7, Class477 arg8, Class477 arg9, Class477[] arg10, int[] arg11, int arg12, boolean arg13, Class421 arg14, byte arg15) {
		try {
			if (this.anInt4210 != -1) {
				return arg4.method6392(this.anInt4210, 353699731).method6366(arg0, arg1, arg2, arg7, arg8, arg9, arg10, arg11, arg12, null, 550173571);
			}
			int var17 = arg1;
			long var18 = this.aLong4208;
			int[] var20 = this.anIntArray4203;
			boolean var21 = false;
			boolean var22 = false;
			int var24;
			if (arg8 != null) {
				Class440 var23 = arg8.method5986((byte) -70);
				if (var23 != null && (var23.anInt4474 >= 0 || var23.anInt4462 >= 0)) {
					var20 = new int[this.anIntArray4203.length];
					for (var24 = 0; var24 < var20.length; var24++) {
						var20[var24] = this.anIntArray4203[var24];
					}
					if (var23.anInt4474 >= 0 && arg14.anInt4316 != -1) {
						var21 = true;
						if (var23.anInt4474 == 65535) {
							var20[arg14.anInt4316] = 0;
							for (var24 = 0; var24 < arg14.anIntArray4314.length; var24++) {
								var20[arg14.anIntArray4314[var24]] = 0;
							}
							var18 ^= 0xFFFFFFFF00000000L;
						} else {
							var20[arg14.anInt4316] = var23.anInt4474 | 0x40000000;
							for (var24 = 0; var24 < arg14.anIntArray4314.length; var24++) {
								var20[arg14.anIntArray4314[var24]] = 0;
							}
							var18 ^= (long) var20[arg14.anInt4316] << 32;
						}
					}
					if (var23.anInt4462 >= 0 && arg14.anInt4310 != -1) {
						var22 = true;
						if (var23.anInt4462 == 65535) {
							var20[arg14.anInt4310] = 0;
							for (var24 = 0; var24 < arg14.anIntArray4317.length; var24++) {
								var20[arg14.anIntArray4317[var24]] = 0;
							}
							var18 ^= 0xFFFFFFFFL;
						} else {
							var20[arg14.anInt4310] = var23.anInt4462 | 0x40000000;
							for (var24 = 0; var24 < arg14.anIntArray4317.length; var24++) {
								var20[arg14.anIntArray4317[var24]] = 0;
							}
							var18 ^= var20[arg14.anInt4310];
						}
					}
				}
			}
			boolean var43 = false;
			var24 = arg10 == null ? 0 : arg10.length;
			for (int var25 = 0; var25 < var24; var25++) {
				if (arg10[var25] != null) {
					var17 |= arg10[var25].method5975(-1188082523);
					var43 = true;
				}
			}
			if (arg8 != null) {
				var17 |= arg8.method5975(-1557620791);
				var43 = true;
			}
			if (arg9 != null) {
				var17 |= arg9.method5975(-1595693933);
				var43 = true;
			}
			boolean var44 = false;
			if (arg11 != null) {
				for (int var26 = 0; var26 < arg11.length; var26++) {
					if (arg11[var26] != -1) {
						var17 |= 0x20;
						var44 = true;
					}
				}
			}
			Class367 var27 = aClass367_4202;
			Class387 var45;
			synchronized (aClass367_4202) {
				var45 = (Class387) aClass367_4202.get(var18);
			}
			Class364 var46 = null;
			if (this.anInt4214 != -1) {
				var46 = arg2.method4254(this.anInt4214, 780247335);
			}
			int var30;
			int var31;
			if (var45 == null || arg0.ct(var45.m(), var17) != 0) {
				if (var45 != null) {
					var17 = arg0.cd(var17, var45.m());
				}
				boolean var29 = false;
				var30 = 0;
				while (true) {
					int var34;
					if (var30 >= var20.length) {
						if (var29) {
							if (this.aLong4209 != -1L) {
								Class367 var49 = aClass367_4202;
								synchronized (aClass367_4202) {
									var45 = (Class387) aClass367_4202.get(this.aLong4209);
								}
							}
							if (var45 == null || arg0.ct(var45.m(), var17) != 0) {
								return null;
							}
						} else {
							Model[] var50 = new Model[var20.length];
							int var52;
							for (var31 = 0; var31 < var20.length; var31++) {
								var52 = var20[var31];
								ItemEquipDefinitions var53 = null;
								boolean var55 = var31 == 5 && var21 || var31 == 3 && var22;
								Model var35;
								if ((var52 & 0x40000000) != 0) {
									if (!var55 && this.aClass518Array4204 != null && this.aClass518Array4204[var31] != null) {
										var53 = this.aClass518Array4204[var31];
									}
									var35 = arg5.getItemDefinitions(var52 & 0x3FFFFFFF, (byte) -117).getEquipmentInformation(this.aBoolean4213, var53, -439676113);
									if (var35 != null) {
										var50[var31] = var35;
									}
								} else if ((var52 & Integer.MIN_VALUE) != 0) {
									var35 = arg3.method2031(var52 & 0x3FFFFFFF, (byte) -1).method1779((byte) 1);
									if (var35 != null) {
										var50[var31] = var35;
									}
								}
							}
							int var58;
							if (var46 != null && var46.anIntArrayArray3807 != null) {
								for (var31 = 0; var31 < var46.anIntArrayArray3807.length; var31++) {
									if (var50[var31] != null) {
										var52 = 0;
										var58 = 0;
										var34 = 0;
										int var57 = 0;
										int var36 = 0;
										int var37 = 0;
										if (var46.anIntArrayArray3807[var31] != null) {
											var52 = var46.anIntArrayArray3807[var31][0];
											var58 = var46.anIntArrayArray3807[var31][1];
											var34 = var46.anIntArrayArray3807[var31][2];
											var57 = var46.anIntArrayArray3807[var31][3] << 3;
											var36 = var46.anIntArrayArray3807[var31][4] << 3;
											var37 = var46.anIntArrayArray3807[var31][5] << 3;
										}
										if (var57 != 0 || var36 != 0 || var37 != 0) {
											var50[var31].method1195(var57, var36, var37);
										}
										if (var52 != 0 || var58 != 0 || var34 != 0) {
											var50[var31].method1194(var52, var58, var34);
										}
									} else if (arg15 >= 0) {
									}
								}
							}
							Model var51 = new Model(var50, var50.length);
							int var28 = var17 | 0x4000;
							var45 = arg0.cb(var51, var28, Class132.anInt1506, 64, 850);
							for (var52 = 0; var52 < 10; var52++) {
								for (var58 = 0; var58 < modelColors[var52].length; var58++) {
									if (this.anIntArray4205[var52] < modifiedModelColors[var52][var58].length) {
										var45.color(modelColors[var52][var58], modifiedModelColors[var52][var58][this.anIntArray4205[var52]]);
									}
								}
							}
							if (arg13) {
								var45.KA(var17);
								Class367 var54 = aClass367_4202;
								synchronized (aClass367_4202) {
									aClass367_4202.put(var45, var18);
								}
								this.aLong4209 = var18;
							}
						}
						break;
					}
					var31 = var20[var30];
					ItemEquipDefinitions var32 = null;
					boolean var33 = false;
					if (var21) {
						if (var30 == arg14.anInt4316) {
							var33 = true;
						} else {
							for (var34 = 0; var34 < arg14.anIntArray4314.length; var34++) {
								if (arg14.anIntArray4314[var34] == var30) {
									var33 = true;
									break;
								}
							}
						}
					}
					if (var22) {
						if (var30 == arg14.anInt4310) {
							var33 = true;
						} else {
							for (var34 = 0; var34 < arg14.anIntArray4317.length; var34++) {
								if (arg14.anIntArray4317[var34] == var30) {
									var33 = true;
									break;
								}
							}
						}
					}
					if ((var31 & 0x40000000) != 0) {
						if (!var33 && this.aClass518Array4204 != null && this.aClass518Array4204[var30] != null) {
							var32 = this.aClass518Array4204[var30];
						}
						if (!arg5.getItemDefinitions(var31 & 0x3FFFFFFF, (byte) -104).missingFile(this.aBoolean4213, var32, 1146675429)) {
							var29 = true;
						}
					} else if ((var31 & Integer.MIN_VALUE) != 0 && !arg3.method2031(var31 & 0x3FFFFFFF, (byte) -1).method1776(-941507301)) {
						var29 = true;
					}
					var30++;
				}
			}
			Class387 var47 = var45.method4446((byte) 4, var17, true);
			if (!var43 && !var44) {
				return var47;
			}
			Class247[] var48 = null;
			if (var46 != null) {
				var48 = var46.method4265(-1913882430);
			}
			if (var44 && var48 != null) {
				for (var30 = 0; var30 < arg11.length; var30++) {
					if (var48[var30] != null) {
						var47.method4488(var48[var30], 0x1 << var30, true);
					}
				}
			}
			var30 = 0;
			var31 = 1;
			while (var30 < var24) {
				if (arg10[var30] != null) {
					arg10[var30].method5985(var47, 0, var31, -2115574067);
				}
				var30++;
				var31 <<= 0x1;
			}
			if (var44) {
				for (var30 = 0; var30 < arg11.length; var30++) {
					if (arg11[var30] != -1) {
						var31 = arg11[var30] - arg12;
						var31 &= 0x3FFF;
						Class247 var56 = new Class247();
						var56.method2473(0.0F, 1.0F, 0.0F, Class257.method2541(var31));
						var47.method4488(var56, 0x1 << var30, false);
					} else if (arg15 >= 0) {
						throw new IllegalStateException();
					}
				}
			}
			if (var44 && var48 != null) {
				for (var30 = 0; var30 < arg11.length; var30++) {
					if (var48[var30] != null) {
						var47.method4488(var48[var30], 0x1 << var30, false);
					}
				}
			}
			if (arg8 != null && arg9 != null) {
				Class111.method1368(var47, arg8, arg9, -962829138);
			} else if (arg8 != null) {
				arg8.method5976(var47, 0, 65988315);
			} else if (arg9 != null) {
				arg9.method5976(var47, 0, -755370773);
			}
			return var47;
		} catch (RuntimeException var42) {
			throw Class476.method5964(var42, "qy.f(" + ')');
		}
	}

	public void method4763(boolean arg0, int arg1) {
		try {
			this.aBoolean4213 = arg0;
			this.method4761(-578749264);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qy.p(" + ')');
		}
	}

	public Class387 method4764(Class_ra arg0, int arg1, Class169 arg2, Class553 arg3, Class510 arg4, Class436 arg5, Interface29 arg6, Class477 arg7, byte arg8) {
		try {
			if (this.anInt4210 == -1) {
				int var10 = arg7 == null ? arg1 : arg1 | arg7.method5975(-1183186333);
				Class367 var12 = aClass367_4207;
				Class387 var11;
				synchronized (aClass367_4207) {
					var11 = (Class387) aClass367_4207.get(this.aLong4208);
				}
				if (var11 == null || arg0.ct(var11.m(), var10) != 0) {
					if (var11 != null) {
						var10 = arg0.cd(var10, var11.m());
					}
					boolean var13 = false;
					int var15;
					for (int var14 = 0; var14 < this.anIntArray4203.length; var14++) {
						var15 = this.anIntArray4203[var14];
						ItemEquipDefinitions var16 = null;
						if ((var15 & 0x40000000) != 0) {
							if (this.aClass518Array4204 != null && this.aClass518Array4204[var14] != null) {
								var16 = this.aClass518Array4204[var14];
							}
							if (!arg4.getItemDefinitions(var15 & 0x3FFFFFFF, (byte) -49).method6286(this.aBoolean4213, var16, 1790195679)) {
								var13 = true;
							}
						} else if ((var15 & Integer.MIN_VALUE) != 0 && !arg2.method2031(var15 & 0x3FFFFFFF, (byte) -1).method1777((short) -583)) {
							var13 = true;
						}
					}
					if (var13) {
						return null;
					}
					Model[] var26 = new Model[this.anIntArray4203.length];
					var15 = 0;
					int var17;
					for (int var27 = 0; var27 < this.anIntArray4203.length; var27++) {
						var17 = this.anIntArray4203[var27];
						ItemEquipDefinitions var18 = null;
						Model var19;
						if ((var17 & 0x40000000) != 0) {
							if (this.aClass518Array4204 != null && this.aClass518Array4204[var27] != null) {
								var18 = this.aClass518Array4204[var27];
							}
							var19 = arg4.getItemDefinitions(var17 & 0x3FFFFFFF, (byte) -7).getEquipmentInformation2(this.aBoolean4213, var18, (byte) 47);
							if (var19 != null) {
								var26[var15++] = var19;
							}
						} else if ((var17 & Integer.MIN_VALUE) != 0) {
							var19 = arg2.method2031(var17 & 0x3FFFFFFF, (byte) -1).method1778(-1301059181);
							if (var19 != null) {
								var26[var15++] = var19;
							}
						}
					}
					Model var28 = new Model(var26, var15);
					int var24 = var10 | 0x4000;
					var11 = arg0.cb(var28, var24, Class132.anInt1506, 64, 768);
					for (var17 = 0; var17 < 10; var17++) {
						for (int var30 = 0; var30 < modelColors[var17].length; var30++) {
							if (this.anIntArray4205[var17] < modifiedModelColors[var17][var30].length) {
								var11.color(modelColors[var17][var30], modifiedModelColors[var17][var30][this.anIntArray4205[var17]]);
							}
						}
					}
					var11.KA(var10);
					Class367 var29 = aClass367_4207;
					synchronized (aClass367_4207) {
						aClass367_4207.put(var11, this.aLong4208);
					}
				}
				if (arg7 == null) {
					return var11;
				} else {
					Class387 var25 = var11.method4446((byte) 4, var10, true);
					arg7.method5976(var25, 0, 747808169);
					return var25;
				}
			} else if (arg8 >= 0) {
				throw new IllegalStateException();
			} else {
				return arg3.method6392(this.anInt4210, 152060119).method6368(arg0, arg1, arg6, arg7, null, 76438474);
			}
		} catch (RuntimeException var23) {
			throw Class476.method5964(var23, "qy.z(" + ')');
		}
	}

	public void method4765(int arg0, int arg1, Class169 arg2, int arg3) {
		try {
			int var5 = anIntArray4212[arg0];
			if (arg2.method2031(arg1, (byte) -1) != null) {
				this.anIntArray4203[var5] = arg1 | Integer.MIN_VALUE;
				this.method4761(1645436933);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qy.j(" + ')');
		}
	}

	public static void method4766(int arg0) {
		try {
			if (Class457.aClass457_6837 != Class404.aClass457_4162) {
				Class232.aClass232_2462.method2357(1209212315);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "qy.nz(" + ')');
		}
	}

	public static final void method4767(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class285.method2861(var3, var4, arg0, 2136294518);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qy.ll(" + ')');
		}
	}

	public static void method4768(Class330_Sub36_Sub13 arg0, int arg1) {
		try {
			boolean var2 = false;
			arg0.method3439((byte) -117);
			for (Class330_Sub36_Sub13 var3 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 22); var3 != null; var3 = (Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192)) {
				if (Class232.method2361(arg0.method3485((byte) 39), var3.method3485((byte) 20), 1853612053)) {
					Class215.method2239(arg0, var3, -1994032275);
					var2 = true;
					break;
				}
			}
			if (!var2) {
				Class484.aClass472_5793.method5883(arg0, -607920525);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qy.g(" + ')');
		}
	}

	public static final void method4769(Class430 arg0, byte arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class375.method4354(var3, var4, arg0, (byte) -75);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qy.fh(" + ')');
		}
	}
}
