package deob;

public class Class499 {

	public Class367 aClass367_5891 = new Class367(128);

	public IndexTable aClass280_5892;

	public static Class495 aClass495_5893;

	public Class499(Class435 arg0, Class454 arg1, IndexTable arg2) {
		this.aClass280_5892 = arg2;
		this.aClass280_5892.method2763(Class103.aClass103_979.anInt982, -2024697536);
	}

	public Class491 method6111(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_5891;
			Class491 var3;
			synchronized (this.aClass367_5891) {
				var3 = (Class491) this.aClass367_5891.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_5892;
			byte[] var13;
			synchronized (this.aClass280_5892) {
				var13 = this.aClass280_5892.getFile(Class103.aClass103_979.anInt982, arg0);
			}
			var3 = new Class491();
			if (var13 != null) {
				var3.method6072(new Buffer(var13), -666486656);
			}
			Class367 var12 = this.aClass367_5891;
			synchronized (this.aClass367_5891) {
				this.aClass367_5891.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "up.r(" + ')');
		}
	}

	public void method6112(int arg0, byte arg1) {
		try {
			Class367 var3 = this.aClass367_5891;
			synchronized (this.aClass367_5891) {
				this.aClass367_5891.method4292(arg0, (byte) 123);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "up.i(" + ')');
		}
	}

	public void method6113(byte arg0) {
		try {
			Class367 var2 = this.aClass367_5891;
			synchronized (this.aClass367_5891) {
				this.aClass367_5891.method4296(-1743767723);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "up.p(" + ')');
		}
	}

	public void method6114(int arg0) {
		try {
			Class367 var2 = this.aClass367_5891;
			synchronized (this.aClass367_5891) {
				this.aClass367_5891.method4298((byte) 10);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "up.j(" + ')');
		}
	}

	public static final void method6115(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			Class330_Sub34 var3 = Class238.method2377(OutgoingPacket.ENTER_LONG_PACKET, client.aClass1_9025.aClass488_22, 553502432);
			var3.aClass330_Sub46_Sub2_7729.addByte(var2.length() + 1, (byte) 51);
			var3.aClass330_Sub46_Sub2_7729.addString(var2, (byte) -94);
			client.aClass1_9025.method378(var3, -484648979);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "up.so(" + ')');
		}
	}

	public static boolean method6116(int arg0) {
		try {
			Class360.anInt3791 = 108;
			Class360.aClass1_3783 = client.aClass1_9060;
			return Class528.method6272(Class360.aLong3750 == -1L, true, "", "", Class360.aLong3750);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "up.c(" + ')');
		}
	}

	public static final void method6117(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			String var4 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
			if (Class278.method2740(var4, arg2, (byte) 0) != null) {
				var4 = var4.substring(0, var4.length() - 1);
			}
			arg0.anObjectArray1322 = Class288.method2886(var4, arg2, 1915163569);
			arg0.aBoolean1293 = true;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "up.ms(" + ')');
		}
	}

	public static void method6118(Class330_Sub46_Sub2 arg0, int arg1, int arg2) {
		try {
			Class381 var3 = client.aClass304_9030.method3022(-318680070);
			boolean var4 = arg0.readBits(1) == 1;
			if (var4) {
				Class15.anIntArray196[++Class15.anInt197 - 1] = arg1;
			}
			int var5 = arg0.readBits(2);
			Player var6 = client.players[arg1];
			if (var5 != 0) {
				int var8;
				int var9;
				int var15;
				if (var5 == 1) {
					var15 = arg0.readBits(3);
					var8 = var6.anIntArray10018[0];
					var9 = var6.anIntArray10059[0];
					if (var15 == 0) {
						var8--;
						var9--;
					} else if (var15 == 1) {
						var9--;
					} else if (var15 == 2) {
						var8++;
						var9--;
					} else if (var15 == 3) {
						var8--;
					} else if (var15 == 4) {
						var8++;
					} else if (var15 == 5) {
						var8--;
						var9++;
					} else if (var15 == 6) {
						var9++;
					} else if (var15 == 7) {
						var8++;
						var9++;
					}
					if (var4) {
						var6.anInt10244 = var8;
						var6.anInt10245 = var9;
						var6.aBoolean10243 = true;
					} else {
						var6.method5462(var8, var9, Class15.aByteArray190[arg1], -1717192951);
					}
				} else if (var5 == 2) {
					var15 = arg0.readBits(4);
					var8 = var6.anIntArray10018[0];
					var9 = var6.anIntArray10059[0];
					if (var15 == 0) {
						var8 -= 2;
						var9 -= 2;
					} else if (var15 == 1) {
						var8--;
						var9 -= 2;
					} else if (var15 == 2) {
						var9 -= 2;
					} else if (var15 == 3) {
						var8++;
						var9 -= 2;
					} else if (var15 == 4) {
						var8 += 2;
						var9 -= 2;
					} else if (var15 == 5) {
						var8 -= 2;
						var9--;
					} else if (var15 == 6) {
						var8 += 2;
						var9--;
					} else if (var15 == 7) {
						var8 -= 2;
					} else if (var15 == 8) {
						var8 += 2;
					} else if (var15 == 9) {
						var8 -= 2;
						var9++;
					} else if (var15 == 10) {
						var8 += 2;
						var9++;
					} else if (var15 == 11) {
						var8 -= 2;
						var9 += 2;
					} else if (var15 == 12) {
						var8--;
						var9 += 2;
					} else if (var15 == 13) {
						var9 += 2;
					} else if (var15 == 14) {
						var8++;
						var9 += 2;
					} else if (var15 == 15) {
						var8 += 2;
						var9 += 2;
					}
					if (var4) {
						var6.anInt10244 = var8;
						var6.anInt10245 = var9;
						var6.aBoolean10243 = true;
					} else {
						var6.method5462(var8, var9, Class15.aByteArray190[arg1], -110910597);
					}
				} else {
					var15 = arg0.readBits(1);
					int var10;
					int var11;
					int var12;
					int var13;
					if (var15 == 0) {
						var8 = arg0.readBits(12);
						var9 = var8 >> 10;
						var10 = var8 >> 5 & 0x1F;
						if (var10 > 15) {
							var10 -= 32;
						}
						var11 = var8 & 0x1F;
						if (var11 > 15) {
							var11 -= 32;
						}
						var12 = var10 + var6.anIntArray10018[0];
						var13 = var6.anIntArray10059[0] + var11;
						if (var4) {
							var6.anInt10244 = var12;
							var6.anInt10245 = var13;
							var6.aBoolean10243 = true;
						} else {
							var6.method5462(var12, var13, Class15.aByteArray190[arg1], 521036773);
						}
						var6.aByte8658 = var6.aByte8654 = (byte) (var6.aByte8658 + var9 & 0x3);
						if (client.aClass304_9030.method2995(738668836).method2788(var12, var13, (byte) 38)) {
							var6.aByte8654++;
						}
						if (client.anInt9121 == arg1 && var6.aByte8658 != Class85.anInt712) {
							Class85.anInt712 = var6.aByte8658;
						}
					} else {
						var8 = arg0.readBits(30);
						var9 = var8 >> 28;
						var10 = var8 >> 14 & 0x3FFF;
						var11 = var8 & 0x3FFF;
						var12 = (var6.anIntArray10018[0] + var3.gameSceneBaseX + var10 & 0x3FFF) - var3.gameSceneBaseX;
						var13 = (var6.anIntArray10059[0] + var3.gameSceneBaseY + var11 & 0x3FFF) - var3.gameSceneBaseY;
						if (var4) {
							var6.anInt10244 = var12;
							var6.anInt10245 = var13;
							var6.aBoolean10243 = true;
						} else {
							var6.method5462(var12, var13, Class15.aByteArray190[arg1], 1347933233);
						}
						var6.aByte8658 = var6.aByte8654 = (byte) (var6.aByte8658 + var9 & 0x3);
						if (client.aClass304_9030.method2995(749068925).method2788(var12, var13, (byte) -98)) {
							var6.aByte8654++;
						}
						if (arg1 == client.anInt9121) {
							Class85.anInt712 = var6.aByte8658;
						}
					}
				}
			} else if (var4) {
				var6.aBoolean10243 = false;
			} else if (arg1 == client.anInt9121) {
				throw new RuntimeException();
			} else {
				Class26 var7 = Class15.aClass26Array198[arg1] = new Class26();
				var7.anInt313 = (var6.anIntArray10059[0] + var3.gameSceneBaseY >> 6) + (var3.gameSceneBaseX + var6.anIntArray10018[0] >> 6 << 14) + (var6.aByte8658 << 28);
				if (var6.anInt10232 == -1) {
					var7.anInt310 = var6.aClass238_10053.method2370(1038569201);
				} else {
					var7.anInt310 = var6.anInt10232;
				}
				var7.anInt309 = var6.anInt10028;
				var7.aBoolean312 = var6.aBoolean10234;
				var7.aBoolean311 = var6.aBoolean10247;
				if (var6.anInt10236 > 0) {
					Class95_Sub13.method1145(var6, (byte) 6);
				}
				client.players[arg1] = null;
				if (arg0.readBits(1) != 0) {
					Class_ra_Sub3.method5218(arg0, arg1, 1447266133);
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "up.o(" + ')');
		}
	}
}
