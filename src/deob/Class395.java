package deob;

public class Class395 {

	public int anInt4088 = 0;

	public int anInt4097 = 0;

	public boolean aBoolean4101 = false;

	public int anInt4105 = -1;

	public int anInt4083;

	public int anInt4095;

	public Class407 aClass407_4090;

	public Class497 aClass497_4085;

	public String aString4084;

	public String aString4091;

	public int[] anIntArray4086;

	public int[] anIntArray4089;

	public int[] anIntArray4092;

	public int[] anIntArray4093;

	public int[] anIntArray4096;

	public int[] anIntArray4098;

	public int[] anIntArray4102;

	public int[] anIntArray4104;

	public String[] aStringArray4099;

	public String[] aStringArray4103;

	public int[][] anIntArrayArray4087;

	public int[][] anIntArrayArray4094;

	public int[][] anIntArrayArray4100;

	public boolean method4633(Interface29 arg0, byte arg1) {
		try {
			int var3;
			if (this.anIntArrayArray4100 != null) {
				for (var3 = 0; var3 < this.anIntArrayArray4100.length; var3++) {
					if (arg0.method306(this.anIntArrayArray4100[var3][0], 2101368483) >= this.anIntArrayArray4100[var3][1]) {
						return true;
					}
				}
			}
			if (this.anIntArrayArray4087 != null) {
				for (var3 = 0; var3 < this.anIntArrayArray4087.length; var3++) {
					if (arg0.method310(this.anIntArrayArray4087[var3][0], -1547822371) >= this.anIntArrayArray4087[var3][1]) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.s(" + ')');
		}
	}

	public String method4634(int arg0, String arg1, int arg2) {
		try {
			if (this.aClass497_4085 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_4085.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.o(" + ')');
		}
	}

	public void method4635(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(600115599);
				if (var3 == 0) {
					if (arg1 == -725567700) {
					}
					return;
				}
				this.method4644(arg0, var3, 2084569173);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.r(" + ')');
		}
	}

	public boolean method4636(Interface29 arg0, int arg1) {
		try {
			int var3;
			if (this.anIntArrayArray4100 != null) {
				for (var3 = 0; var3 < this.anIntArrayArray4100.length; var3++) {
					if (arg0.method306(this.anIntArrayArray4100[var3][0], 1469950036) >= this.anIntArrayArray4100[var3][2]) {
						return true;
					}
				}
			}
			if (this.anIntArrayArray4087 != null) {
				for (var3 = 0; var3 < this.anIntArrayArray4087.length; var3++) {
					if (arg0.method310(this.anIntArrayArray4087[var3][0], -1865448241) >= this.anIntArrayArray4087[var3][2]) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.f(" + ')');
		}
	}

	public boolean method4637(Interface29 arg0, int[] arg1, byte arg2) {
		try {
			if (this.aClass407_4090.method4753(arg0, 216426502) < this.anInt4095) {
				return false;
			}
			int var4;
			if (this.anIntArrayArray4094 != null) {
				for (var4 = 0; var4 < this.anIntArrayArray4094.length; var4++) {
					if (arg1[this.anIntArrayArray4094[var4][0]] < this.anIntArrayArray4094[var4][1]) {
						return false;
					}
				}
			}
			if (this.anIntArray4089 != null) {
				for (var4 = 0; var4 < this.anIntArray4089.length; var4++) {
					if (!this.aClass407_4090.method4752(this.anIntArray4089[var4], -1388697223).method4636(arg0, 1394770222)) {
						return false;
					}
				}
			}
			int var5;
			if (this.anIntArray4096 != null) {
				for (var4 = 0; var4 < this.anIntArray4096.length; var4++) {
					var5 = arg0.method306(this.anIntArray4096[var4], 1433527744);
					if (var5 < this.anIntArray4104[var4] || var5 > this.anIntArray4098[var4]) {
						return false;
					}
				}
			}
			if (this.anIntArray4093 != null) {
				for (var4 = 0; var4 < this.anIntArray4093.length; var4++) {
					var5 = arg0.method310(this.anIntArray4093[var4], -1985131301);
					if (var5 < this.anIntArray4086[var4] || var5 > this.anIntArray4102[var4]) {
						return false;
					}
				}
			}
			return true;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qi.z(" + ')');
		}
	}

	public boolean method4638(Interface29 arg0, int arg1) {
		try {
			return this.aClass407_4090.method4753(arg0, 1459163397) >= this.anInt4095;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.w(" + ')');
		}
	}

	public boolean method4639(int[] arg0, int arg1, byte arg2) {
		try {
			if (this.anIntArrayArray4094 == null || arg1 < 0 || arg1 >= this.anIntArrayArray4094.length) {
				return false;
			} else {
				return arg0[this.anIntArrayArray4094[arg1][0]] >= this.anIntArrayArray4094[arg1][1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.n(" + ')');
		}
	}

	public boolean method4640(Interface29 arg0, int arg1, int arg2) {
		try {
			if (this.anIntArray4096 == null || arg1 < 0 || arg1 >= this.anIntArray4096.length) {
				return false;
			} else {
				int var4 = arg0.method306(this.anIntArray4096[arg1], 856908869);
				return var4 >= this.anIntArray4104[arg1] && var4 <= this.anIntArray4098[arg1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.b(" + ')');
		}
	}

	public boolean method4641(Interface29 arg0, int arg1, int arg2) {
		try {
			if (this.anIntArray4093 == null || arg1 < 0 || arg1 >= this.anIntArray4093.length) {
				return false;
			} else {
				int var4 = arg0.method310(this.anIntArray4093[arg1], -731526083);
				return var4 >= this.anIntArray4086[arg1] && var4 <= this.anIntArray4102[arg1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.k(" + ')');
		}
	}

	public int method4642(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_4085 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_4085.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.p(" + ')');
		}
	}

	public boolean method4643(Interface29 arg0, int arg1, int arg2) {
		try {
			if (this.anIntArray4089 == null || arg1 < 0 || arg1 >= this.anIntArray4089.length) {
				return false;
			} else {
				return this.aClass407_4090.method4752(this.anIntArray4089[arg1], -1734068698).method4636(arg0, 1803825780);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.l(" + ')');
		}
	}

	public void method4644(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.aString4084 = arg0.readJagString((byte) 6);
			} else if (arg1 == 2) {
				this.aString4091 = arg0.readJagString((byte) 6);
			} else {
				int var4;
				int var5;
				if (arg1 == 3) {
					var4 = arg0.readUnsignedByte(-197176457);
					this.anIntArrayArray4100 = new int[var4][3];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArrayArray4100[var5][0] = arg0.readUnsignedShort(1610718739);
						this.anIntArrayArray4100[var5][1] = arg0.readInt((byte) 23);
						this.anIntArrayArray4100[var5][2] = arg0.readInt((byte) 116);
					}
				} else if (arg1 == 4) {
					var4 = arg0.readUnsignedByte(1096168014);
					this.anIntArrayArray4087 = new int[var4][3];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArrayArray4087[var5][0] = arg0.readUnsignedShort(302009230);
						this.anIntArrayArray4087[var5][1] = arg0.readInt((byte) 78);
						this.anIntArrayArray4087[var5][2] = arg0.readInt((byte) 3);
					}
				} else if (arg1 == 5) {
					arg0.readUnsignedShort(1669341329);
				} else if (arg1 == 6) {
					this.anInt4088 = arg0.readUnsignedByte(258407634);
				} else if (arg1 == 7) {
					this.anInt4097 = arg0.readUnsignedByte(-193324020);
				} else if (arg1 == 8) {
					this.aBoolean4101 = true;
				} else if (arg1 == 9) {
					this.anInt4083 = arg0.readUnsignedByte(901319918);
				} else if (arg1 == 10) {
					var4 = arg0.readUnsignedByte(270438124);
					this.anIntArray4092 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray4092[var5] = arg0.readInt((byte) 79);
					}
				} else if (arg1 == 12) {
					arg0.readInt((byte) 51);
				} else if (arg1 == 13) {
					var4 = arg0.readUnsignedByte(321928617);
					this.anIntArray4089 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray4089[var5] = arg0.readUnsignedShort(761656926);
					}
				} else if (arg1 == 14) {
					var4 = arg0.readUnsignedByte(2012420008);
					this.anIntArrayArray4094 = new int[var4][2];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArrayArray4094[var5][0] = arg0.readUnsignedByte(415329821);
						this.anIntArrayArray4094[var5][1] = arg0.readUnsignedByte(1553444329);
					}
				} else if (arg1 == 15) {
					this.anInt4095 = arg0.readUnsignedShort(1718158567);
				} else if (arg1 == 17) {
					this.anInt4105 = arg0.readBigSmart(-728949749);
				} else if (arg1 == 18) {
					var4 = arg0.readUnsignedByte(1252253691);
					this.anIntArray4096 = new int[var4];
					this.anIntArray4104 = new int[var4];
					this.anIntArray4098 = new int[var4];
					this.aStringArray4099 = new String[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray4096[var5] = arg0.readInt((byte) 109);
						this.anIntArray4104[var5] = arg0.readInt((byte) 66);
						this.anIntArray4098[var5] = arg0.readInt((byte) 85);
						this.aStringArray4099[var5] = arg0.readString(1532466241);
					}
				} else if (arg1 == 19) {
					var4 = arg0.readUnsignedByte(670460405);
					this.anIntArray4093 = new int[var4];
					this.anIntArray4086 = new int[var4];
					this.anIntArray4102 = new int[var4];
					this.aStringArray4103 = new String[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray4093[var5] = arg0.readInt((byte) 82);
						this.anIntArray4086[var5] = arg0.readInt((byte) 71);
						this.anIntArray4102[var5] = arg0.readInt((byte) 93);
						this.aStringArray4103[var5] = arg0.readString(1344346412);
					}
				} else if (arg1 == 249) {
					var4 = arg0.readUnsignedByte(-273471736);
					if (this.aClass497_4085 == null) {
						var5 = Class136.method1594(var4, 2072116951);
						this.aClass497_4085 = new Class497(var5);
					}
					for (var5 = 0; var5 < var4; var5++) {
						boolean var6 = arg0.readUnsignedByte(1532919942) == 1;
						int var7 = arg0.readUnsignedTriByte(-1401356047);
						Class330 var8;
						if (var6) {
							var8 = new Class330_Sub35(arg0.readString(-1215066705));
						} else {
							var8 = new Class330_Sub23(arg0.readInt((byte) 48));
						}
						this.aClass497_4085.method6097(var8, (long) var7);
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "qi.j(" + ')');
		}
	}

	public void method4645(int arg0) {
		try {
			if (this.aString4091 == null) {
				this.aString4091 = this.aString4084;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qi.i(" + ')');
		}
	}

	public static final void method4646(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1237 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1686568571);
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class411.method5231(arg0.anInt1196, -318977896);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qi.hv(" + ')');
		}
	}

	public static boolean method4647(int arg0) {
		try {
			Class360.anInt3791 = 288;
			Class360.aClass1_3783 = client.aClass1_9025;
			if (client.aByteArray8959 != null) {
				Buffer var1 = new Buffer(client.aByteArray8959);
				Class360.aLong3750 = var1.readLong(-653327152);
				Class360.aLong3776 = var1.readLong(627337622);
			}
			if (Class360.aLong3750 < 0L) {
				Class281.method2792(35, 111804978);
				return false;
			} else {
				return Class528.method6272(false, true, "", "", Class360.aLong3750);
			}
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "qi.g(" + ')');
		}
	}

	public static void method4648(float arg0, Class260 arg1, Class260 arg2, Class260 arg3, Class260 arg4, Class260 arg5, float arg6, float arg7, byte arg8) {
		try {
			if (!arg2.method2555(arg1)) {
				Class260 var9 = Class260.method2561(arg2, arg1);
				float var10 = var9.method2565();
				if (arg6 > 0.0F) {
					arg4 = Class260.method2549(arg4);
					arg4.method2567(arg7 * (var10 / arg6));
				}
				if (Float.POSITIVE_INFINITY == arg4.aFloat2716 || Float.isNaN(arg1.aFloat2716) || var10 > 5120.0F) {
					arg1.method2582(arg2);
					arg3.method2554();
				} else {
					Class260 var11 = Class260.method2549(arg3);
					var11.method2551();
					Class260 var12 = Class260.method2568(var11, arg4);
					Class260 var13 = Class260.method2566(var11, var12);
					Class260 var14 = Class260.method2549(arg3);
					Class260 var15 = Class260.method2549(var9);
					var15.method2551();
					if (var13.aFloat2716 > var15.aFloat2716) {
						if (var9.aFloat2716 < 0.0F) {
							var14.aFloat2716 += arg0 * arg4.aFloat2716;
							if (var14.aFloat2716 > 0.0F) {
								var14.aFloat2716 = 0.0F;
							}
						} else {
							var14.aFloat2716 -= arg0 * arg4.aFloat2716;
							if (var14.aFloat2716 < 0.0F) {
								var14.aFloat2716 = 0.0F;
							}
						}
					} else if (var11.aFloat2716 < arg5.aFloat2716) {
						if (var9.aFloat2716 < 0.0F) {
							var14.aFloat2716 -= arg4.aFloat2716 * arg0;
							if (var14.aFloat2716 < -arg5.aFloat2716) {
								var14.aFloat2716 = -arg5.aFloat2716;
							}
						} else {
							var14.aFloat2716 += arg4.aFloat2716 * arg0;
							if (var14.aFloat2716 > arg5.aFloat2716) {
								var14.aFloat2716 = arg5.aFloat2716;
							}
						}
					}
					if (var13.aFloat2715 > var15.aFloat2715) {
						if (var9.aFloat2715 < 0.0F) {
							var14.aFloat2715 += arg4.aFloat2715 * arg0;
							if (var14.aFloat2715 > 0.0F) {
								var14.aFloat2715 = 0.0F;
							}
						} else {
							var14.aFloat2715 -= arg4.aFloat2715 * arg0;
							if (var14.aFloat2715 < 0.0F) {
								var14.aFloat2715 = 0.0F;
							}
						}
					} else if (var11.aFloat2715 < arg5.aFloat2715) {
						if (var9.aFloat2715 < 0.0F) {
							var14.aFloat2715 -= arg4.aFloat2715 * arg0;
							if (var14.aFloat2715 < -arg5.aFloat2715) {
								var14.aFloat2715 = -arg5.aFloat2715;
							}
						} else {
							var14.aFloat2715 += arg0 * arg4.aFloat2715;
							if (var14.aFloat2715 > arg5.aFloat2715) {
								var14.aFloat2715 = arg5.aFloat2715;
							}
						}
					}
					if (var13.aFloat2711 > var15.aFloat2711) {
						if (var9.aFloat2711 < 0.0F) {
							var14.aFloat2711 += arg0 * arg4.aFloat2711;
							if (var14.aFloat2711 > 0.0F) {
								var14.aFloat2711 = 0.0F;
							}
						} else {
							var14.aFloat2711 -= arg4.aFloat2711 * arg0;
							if (var14.aFloat2711 < 0.0F) {
								var14.aFloat2711 = 0.0F;
							}
						}
					} else if (var11.aFloat2711 < arg5.aFloat2711) {
						if (var9.aFloat2711 < 0.0F) {
							var14.aFloat2711 -= arg0 * arg4.aFloat2711;
							if (var14.aFloat2711 < -arg5.aFloat2711) {
								var14.aFloat2711 = -arg5.aFloat2711;
							}
						} else {
							var14.aFloat2711 += arg4.aFloat2711 * arg0;
							if (var14.aFloat2711 > arg5.aFloat2711) {
								var14.aFloat2711 = arg5.aFloat2711;
							}
						}
					}
					arg3.method2572(var14, 0.8F);
					if (var10 < 10.0F && arg3.method2565() < 10.0F) {
						arg1.method2582(arg2);
						arg3.method2554();
					} else {
						arg1.method2558(Class260.method2574(arg3, arg0));
					}
					var11.method2550();
					var14.method2550();
					var15.method2550();
				}
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "qi.r(" + ')');
		}
	}

	public static final void method4649(Class430 arg0, int arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 4;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			int var5 = arg0.anIntArray4387[arg0.anInt4376 + 3];
			Class260 var6 = Class260.method2577((float) var2, (float) var3, (float) var4);
			if (var6.aFloat2716 == -1.0F) {
				var6.aFloat2716 = Float.POSITIVE_INFINITY;
			}
			if (var6.aFloat2715 == -1.0F) {
				var6.aFloat2715 = Float.POSITIVE_INFINITY;
			}
			if (-1.0F == var6.aFloat2711) {
				var6.aFloat2711 = Float.POSITIVE_INFINITY;
			}
			Class401_Sub1.aClass145_Sub1_8249.method1684(var6, (byte) -120);
			Class401_Sub1.aClass145_Sub1_8249.method1719((float) var5 / 1000.0F, -88299728);
			var6.method2550();
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "qi.aia(" + ')');
		}
	}

	public static final void method4650(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2 * var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.zn(" + ')');
		}
	}

	public static final void method4651(Class430 arg0, short arg1) throws Exception_Sub4 {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class144 var3 = Preferences.method2922(var2, 1287288894);
			if (var3 == null) {
				throw new RuntimeException();
			}
			Class401_Sub1.aClass145_Sub1_8249.method1692(var3, 2059508001);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qi.aip(" + ')');
		}
	}
}
