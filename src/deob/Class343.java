package deob;

public class Class343 {

	public static int anInt3401 = 70;

	public int anInt3402 = 255;

	public int anInt3410 = 255;

	public int anInt3404 = -1;

	public int anInt3403 = 1;

	public int anInt3408 = 70;

	public int anInt3407 = -1;

	public int anInt3400 = -1;

	public int anInt3409 = -1;

	public int anInt3405 = -1;

	public Class341 aClass341_3406;

	public void method3992(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(942304020);
				if (var3 == 0) {
					if (arg1 >= 16711680) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method3998(arg0, var3, 2099435777);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oh.r(" + ')');
		}
	}

	public Class61 method3993(Class_ra arg0, int arg1) {
		try {
			if (this.anInt3407 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3407);
			if (var3 == null) {
				this.method3996(arg0, (byte) 70);
				var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3407);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oh.i(" + ')');
		}
	}

	public Class61 method3994(Class_ra arg0, byte arg1) {
		try {
			if (this.anInt3400 < 0) {
				return null;
			}
			Class61 var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3400);
			if (var3 == null) {
				this.method3996(arg0, (byte) 91);
				var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3400);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oh.p(" + ')');
		}
	}

	public Class61 method3995(Class_ra arg0, byte arg1) {
		try {
			if (this.anInt3405 < 0) {
				return this.method3994(arg0, (byte) 69);
			}
			Class61 var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3405);
			if (var3 == null) {
				this.method3996(arg0, (byte) 122);
				var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3405);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oh.s(" + ')');
		}
	}

	public void method3996(Class_ra arg0, byte arg1) {
		try {
			IndexTable var3 = this.aClass341_3406.aClass280_3396;
			Class87 var4;
			if (this.anInt3407 >= 0 && this.aClass341_3406.aClass367_3393.get((long) this.anInt3407) == null && var3.method2750(this.anInt3407, 5598017)) {
				var4 = Class53.method640(var3, this.anInt3407);
				this.aClass341_3406.aClass367_3393.put(arg0.bw(var4, true), (long) this.anInt3407);
			}
			if (this.anInt3400 >= 0 && this.aClass341_3406.aClass367_3393.get((long) this.anInt3400) == null && var3.method2750(this.anInt3400, 1178091840)) {
				var4 = Class53.method640(var3, this.anInt3400);
				this.aClass341_3406.aClass367_3393.put(arg0.bw(var4, true), (long) this.anInt3400);
			}
			if (this.anInt3409 >= 0 && this.aClass341_3406.aClass367_3393.get((long) this.anInt3409) == null && var3.method2750(this.anInt3409, 2057365049)) {
				var4 = Class53.method640(var3, this.anInt3409);
				this.aClass341_3406.aClass367_3393.put(arg0.bw(var4, true), (long) this.anInt3409);
			}
			if (this.anInt3405 >= 0 && this.aClass341_3406.aClass367_3393.get((long) this.anInt3405) == null && var3.method2750(this.anInt3405, -1397622600)) {
				var4 = Class53.method640(var3, this.anInt3405);
				this.aClass341_3406.aClass367_3393.put(arg0.bw(var4, true), (long) this.anInt3405);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "oh.f(" + ')');
		}
	}

	public Class61 method3997(Class_ra arg0, int arg1) {
		try {
			if (this.anInt3409 < 0) {
				return this.method3993(arg0, -1457902513);
			}
			Class61 var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3409);
			if (var3 == null) {
				this.method3996(arg0, (byte) 55);
				var3 = (Class61) this.aClass341_3406.aClass367_3393.get((long) this.anInt3409);
			}
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "oh.o(" + ')');
		}
	}

	public void method3998(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				arg0.readUnsignedShort(1231399509);
			} else if (arg1 == 2) {
				this.anInt3402 = arg0.readUnsignedByte(1554118640);
			} else if (arg1 == 3) {
				this.anInt3410 = arg0.readUnsignedByte(204258058);
			} else if (arg1 == 4) {
				this.anInt3404 = 0;
			} else if (arg1 == 5) {
				this.anInt3408 = arg0.readUnsignedShort(546892687);
			} else if (arg1 == 6) {
				arg0.readUnsignedByte(544335161);
			} else if (arg1 == 7) {
				this.anInt3407 = arg0.readBigSmart(-539619645);
			} else if (arg1 == 8) {
				this.anInt3400 = arg0.readBigSmart(-1081524480);
			} else if (arg1 == 9) {
				this.anInt3409 = arg0.readBigSmart(-897982363);
			} else if (arg1 == 10) {
				this.anInt3405 = arg0.readBigSmart(-1541792050);
			} else if (arg1 == 11) {
				this.anInt3404 = arg0.readUnsignedShort(568650462);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "oh.j(" + ')');
		}
	}

	public static final void method3999(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class263.method2614((char) var2, -546641566) ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "oh.aae(" + ')');
		}
	}

	public static String method4000(long arg0, int arg1, int arg2) {
		try {
			Class452.method5637(arg0);
			int var4 = Class528.aCalendar6215.get(5);
			int var5 = Class528.aCalendar6215.get(2) + 1;
			int var6 = Class528.aCalendar6215.get(1);
			return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "oh.p(" + ')');
		}
	}

	public static void method4001(int arg0, int arg1, int arg2, int arg3) {
		try {
			Class381 var4 = client.aClass304_9030.method3022(1236678797);
			int var5 = arg1 + var4.gameSceneBaseX;
			int var6 = var4.gameSceneBaseY + arg2;
			if (client.aClass304_9030.method3023(-400722441) != null && client.aClass304_9030.method2985(-2137909458) != OutgoingPacketManager.aClass310_3212 && arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass304_9030.method2990(-1338682676) && arg2 < client.aClass304_9030.method3033((byte) -61)) {
				long var7 = (long) (arg0 << 28 | var6 << 14 | var5);
				Class330_Sub9 var9 = (Class330_Sub9) client.aClass497_9138.method6094(var7);
				if (var9 == null) {
					client.aClass304_9030.method3023(-400722441).method4151(arg0, arg1, arg2, 380985859);
				} else {
					Class330_Sub3 var10 = (Class330_Sub3) var9.aClass471_7573.method5869(539664854);
					if (var10 == null) {
						client.aClass304_9030.method3023(-400722441).method4151(arg0, arg1, arg2, 2017609898);
					} else {
						Class432_Sub1_Sub2_Sub1 var11 = (Class432_Sub1_Sub2_Sub1) client.aClass304_9030.method3023(-400722441).method4151(arg0, arg1, arg2, 1675110866);
						if (var11 == null) {
							var11 = new Class432_Sub1_Sub2_Sub1(client.aClass304_9030.method3023(-400722441), arg1 << 265, client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[arg0].method6417(arg1, arg2, 2111540853), arg2 << 265, arg0, arg0);
						} else {
							var11.anInt10211 = -1;
							var11.anInt10207 = -1;
							var11.aClass356_8655 = client.aClass304_9030.method3023(-400722441);
						}
						var11.anInt10217 = var10.anInt7513;
						var11.anInt10208 = var10.anInt7512;
						while (true) {
							Class330_Sub3 var12 = (Class330_Sub3) var9.aClass471_7573.method5873((byte) -72);
							if (var12 != null) {
								if (var12.anInt7513 == var11.anInt10217) {
									if (arg3 != -334637075) {
										return;
									}
									continue;
								}
								var11.anInt10207 = var12.anInt7513;
								var11.anInt10210 = var12.anInt7512;
								while (true) {
									Class330_Sub3 var13 = (Class330_Sub3) var9.aClass471_7573.method5873((byte) -4);
									if (var13 == null) {
										if (arg3 != -334637075) {
											return;
										}
										break;
									}
									if (var11.anInt10217 != var13.anInt7513) {
										if (var11.anInt10207 != var13.anInt7513) {
											var11.anInt10211 = var13.anInt7513;
											var11.anInt10212 = var13.anInt7512;
										} else if (arg3 != -334637075) {
										}
									}
								}
							} else if (arg3 != -334637075) {
								return;
							}
							int var15 = Class431.method5342((arg1 << 9) + 256, (arg2 << 9) + 256, arg0, 1996761881);
							var11.method5348((float) (arg1 << 265), (float) var15, (float) (arg2 << 265));
							var11.anInt10213 = 0;
							var11.aByte8658 = (byte) arg0;
							var11.aByte8654 = (byte) arg0;
							if (client.aClass304_9030.method2995(1945924571).method2788(arg1, arg2, (byte) -48)) {
								var11.aByte8654++;
							}
							client.aClass304_9030.method3023(-400722441).method4143(arg0, arg1, arg2, var15, var11, 1689004629);
							break;
						}
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "oh.jv(" + ')');
		}
	}
}
