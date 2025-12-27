package deob;

public class Class403 {

	public static Class111 aClass111_4138;

	public Class403() throws Throwable {
		throw new Error();
	}

	public static final void method4727(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			boolean var3 = arg0.anIntArray4387[arg0.anInt4376 + 1] == 1;
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, var2, -2004622175);
			if (!var3) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 0, 889855724);
			}
			Class435.method5568(1302531203);
			client.aBoolean9194 = false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qs.akv(" + ')');
		}
	}

	public static void method4728(int arg0) {
		try {
			Class520.aClass471_6016 = new Class471();
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "qs.r(" + ')');
		}
	}

	public static final void method4729(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, 1258927588);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class363.method4258(var3, var4, arg0, (byte) -119);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qs.lk(" + ')');
		}
	}

	public static ClientScript method4730(byte[] arg0, int arg1) {
		try {
			return new ClientScript(new Buffer(arg0));
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qs.p(" + ')');
		}
	}

	public static int method4731(byte arg0) {
		try {
			if (client.aClass114_9165 == null) {
				if (Class484.aBoolean5782) {
					Class524 var1 = Class359.method4239((byte) 52);
					int var2 = Class464_Sub23.aClass350_8712.method4030(34823472);
					int var3 = Class464_Sub23.aClass350_8712.method4031((short) 23726);
					int var4;
					int var5;
					int var6;
					Class330_Sub36_Sub10 var7;
					if (Class484.aBoolean5783) {
						Class479 var10;
						if (var2 > Class89.anInt736 && var2 < Class89.anInt736 + Class550.anInt6288) {
							var4 = -1;
							for (var5 = 0; var5 < Class484.anInt5790; var5++) {
								if (Class484.aBoolean5807) {
									var6 = var5 * Class484.anInt5779 + 1 + var1.anInt6033 + 20 + Class85.anInt713;
									if (var3 > var6 - var1.anInt6033 - 1 && var3 < var1.anInt6035 + var6) {
										var4 = var5;
									}
								} else {
									var6 = Class484.anInt5779 * var5 + 31 + Class85.anInt713;
									if (var3 > var6 - var1.anInt6033 - 1 && var3 < var6 + var1.anInt6035) {
										var4 = var5;
									}
								}
							}
							if (var4 != -1) {
								var5 = 0;
								var10 = new Class479(Class484.aClass472_5793);
								for (Class330_Sub36_Sub13 var11 = (Class330_Sub36_Sub13) var10.method6011((byte) 90); var11 != null; var11 = (Class330_Sub36_Sub13) var10.next()) {
									if (var5++ == var4) {
										return ((Class330_Sub36_Sub10) var11.aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735).anInt9690;
									}
								}
							}
						} else if (Class484.aClass330_Sub36_Sub13_5784 != null && var2 > Class62.anInt561 && var2 < Class62.anInt561 + Class116.anInt1374) {
							var4 = -1;
							for (var5 = 0; var5 < Class484.aClass330_Sub36_Sub13_5784.anInt9715; var5++) {
								if (Class484.aBoolean5807) {
									var6 = Class246.anInt6586 + 1 + 20 + var1.anInt6033 + Class484.anInt5779 * var5;
									if (var3 > var6 - var1.anInt6033 - 1 && var3 < var1.anInt6035 + var6) {
										var4 = var5;
									}
								} else {
									var6 = Class246.anInt6586 + 31 + var5 * Class484.anInt5779;
									if (var3 > var6 - var1.anInt6033 - 1 && var3 < var1.anInt6035 + var6) {
										var4 = var5;
									}
								}
							}
							if (var4 != -1) {
								var5 = 0;
								var10 = new Class479(Class484.aClass330_Sub36_Sub13_5784.aClass472_9716);
								for (var7 = (Class330_Sub36_Sub10) var10.method6011((byte) 23); var7 != null; var7 = (Class330_Sub36_Sub10) var10.next()) {
									if (var5++ == var4) {
										return var7.anInt9690;
									}
								}
							}
						}
					} else if (var2 > Class89.anInt736 && var2 < Class550.anInt6288 + Class89.anInt736) {
						var4 = -1;
						for (var5 = 0; var5 < Class484.anInt5786; var5++) {
							if (Class484.aBoolean5807) {
								var6 = (Class484.anInt5786 - 1 - var5) * Class484.anInt5779 + 1 + 20 + Class85.anInt713 + var1.anInt6033;
								if (var3 > var6 - var1.anInt6033 - 1 && var3 < var6 + var1.anInt6035) {
									var4 = var5;
								}
							} else {
								var6 = (Class484.anInt5786 - 1 - var5) * Class484.anInt5779 + Class85.anInt713 + 31;
								if (var3 > var6 - var1.anInt6033 - 1 && var3 < var6 + var1.anInt6035) {
									var4 = var5;
								}
							}
						}
						if (var4 != -1) {
							var5 = 0;
							Class474 var9 = new Class474(Class484.aClass471_5791);
							for (var7 = (Class330_Sub36_Sub10) var9.method5916(-1755972658); var7 != null; var7 = (Class330_Sub36_Sub10) var9.next()) {
								if (var5++ == var4) {
									return var7.anInt9690;
								}
							}
						}
					}
				} else if (Class534.aClass412_6788.aBoolean4255) {
					if (Class439.aClass330_Sub36_Sub10_4455 != null) {
						return Class439.aClass330_Sub36_Sub10_4455.anInt9690;
					}
				} else if (Class418.aClass330_Sub36_Sub10_4298 != null) {
					return Class418.aClass330_Sub36_Sub10_4298.anInt9690;
				}
			}
			return -1;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "qs.as(" + ')');
		}
	}

	public static Class549_Sub1 method4732(int arg0) {
		try {
			Class549_Sub1 var1 = new Class549_Sub1();
			boolean var2 = true;
			boolean var3 = false;
			boolean var4 = false;
			if (Class375.aClass330_Sub51_3933.anInt7946 * -140064631 < 512 && Class375.aClass330_Sub51_3933.anInt7946 * -140064631 != 0) {
				var2 = false;
				var1.method6361(128, -2127242190);
			}
			if (Class212.aString6533.startsWith("win")) {
				var4 = true;
				var3 = true;
			} else {
				var3 = true;
			}
			if (Class16.aBoolean212) {
				var1.method6361(8, -2128651558);
				var2 = false;
			}
			if (Class16.aBoolean204) {
				var1.method6361(16, -2135499950);
				var3 = false;
			}
			if (Class16.aBoolean214) {
				var1.method6361(32, -2128522125);
				var4 = false;
			}
			if (!var2 && !var3 && !var4) {
				Class494.method6085(var1, (byte) -29);
				return var1;
			}
			int var5 = -1;
			int var6 = -1;
			int var7 = -1;
			if (var2) {
				try {
					var5 = Class70.method817(2, 1000, (byte) 49);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(261126456) == 2) {
						var1.method6361(1, -2128546931);
					}
				} catch (Exception var14) {
					var1.method6361(1024, -2147184995);
				}
			}
			if (var4) {
				try {
					var7 = Class70.method817(3, 1000, (byte) 45);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(138738280) == 3) {
						var1.method6361(4, -2139705264);
						Class51 var8 = Class361.aClass_ra3793.f();
						long var9 = var8.aLong492 & 0xFFFFFFFFFFFFL;
						boolean var11;
						switch(var8.anInt488) {
							case 4098:
								var11 = var9 >= 60129613779L;
								var3 &= var11;
								if (!var11) {
									var1.method6361(512, -2146108865);
								}
								break;
							case 4318:
								var11 = var9 >= 64425238954L;
								var3 &= var11;
								if (!var11) {
									var1.method6361(256, -2142554279);
								}
						}
					}
				} catch (Exception var13) {
					var1.method6361(4096, -2130394968);
				}
			}
			if (var3) {
				try {
					var6 = Class70.method817(1, 1000, (byte) 51);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(1210166121) == 1) {
						var1.method6361(2, -2130491029);
					}
				} catch (Exception var12) {
					var1.method6361(2048, -2142251536);
				}
			}
			if (var5 == -1 && var6 == -1 && var7 == -1) {
				Class494.method6085(var1, (byte) -63);
				return var1;
			}
			var1.method6363(3, var7, (byte) 44);
			var1.method6363(1, var6, (byte) 10);
			var1.method6363(2, var5, (byte) 127);
			var7 = (int) ((float) var7 * 1.3F);
			var6 = (int) ((float) var6 * 1.1F);
			if (var5 > var7 && var5 > var6) {
				Class424.method5307(var1, var5, -1663605350);
			} else if (var7 > var6) {
				Class304.method3037(var1, 3, var7, 49769283);
			} else {
				Class304.method3037(var1, 1, var6, -2119344526);
			}
			return var1;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "qs.p(" + ')');
		}
	}

	public static final void method4733(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg0.aBoolean1244 = arg2.anIntArray4387[--arg2.anInt4376] == 1;
			Class404.method4738(arg0, 1491595431);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qs.fz(" + ')');
		}
	}
}
