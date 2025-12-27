package deob;

import java.util.Iterator;

public class Class411 {

	public Interface20 anInterface20_4245;

	public Class411(IndexTable arg0) {
		byte[] var2 = arg0.method2761(Class420.aClass420_4306.anInt4307, 1806527147);
		this.method5224(new Buffer(var2), (byte) -93);
	}

	public void method5224(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-267421513);
				if (var3 == 0) {
					if (arg1 >= 0) {
					}
					return;
				}
				if (var3 == 1) {
					this.anInterface20_4245 = Class297.method2965(arg0, (byte) 61);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rc.r(" + ')');
		}
	}

	public static final void method5225(Class430 arg0, int arg1) {
		try {
			Class392.method4610((Class432_Sub1) arg0.anInterface2_4389, arg0, -2003260436);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rc.arp(" + ')');
		}
	}

	public static String method5226(CharSequence arg0, byte arg1) {
		try {
			int var2 = arg0.length();
			StringBuilder var3 = new StringBuilder(var2);
			for (int var4 = 0; var4 < var2; var4++) {
				char var5 = arg0.charAt(var4);
				if (var5 >= 'a' && var5 <= 'z' || !(var5 < 'A' || var5 > 'Z') || var5 >= '0' && var5 <= '9' || var5 == '.' || var5 == '-' || var5 == '*' || var5 == '_') {
					var3.append(var5);
				} else if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = ItemEquipDefinitions.method6216(var5, -947519049);
					var3.append('%');
					int var7 = var6 >> 4 & 0xF;
					if (var7 >= 10) {
						var3.append((char) (var7 + 55));
					} else {
						var3.append((char) (var7 + 48));
					}
					var7 = var6 & 0xF;
					if (var7 >= 10) {
						var3.append((char) (var7 + 55));
					} else {
						var3.append((char) (var7 + 48));
					}
				}
			}
			return var3.toString();
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "rc.j(" + ')');
		}
	}

	public static final void method5227(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			int var4 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var2.indexOf(var3, var4);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rc.aaz(" + ')');
		}
	}

	public static final void method5228(int arg0) {
		try {
			Iterator var1 = client.aClass497_9216.iterator();
			while (var1.hasNext()) {
				Class330_Sub36_Sub2 var2 = (Class330_Sub36_Sub2) var1.next();
				Class432_Sub1_Sub1_Sub4 var3 = var2.aClass432_Sub1_Sub1_Sub4_9624;
				if (client.aClass304_9030.method3023(-400722441) != null && var3.method5500(-1972963495)) {
					client.aClass304_9030.method3023(-400722441).method4145(var3, true, 2073556539);
				}
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rc.ju(" + ')');
		}
	}

	public static Class120 method5229(int arg0, int arg1) {
		try {
			return Class3.aClass120Array56[arg0 >> 16];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rc.i(" + ')');
		}
	}

	public static final void method5230(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class330_Sub36_Sub9 var3 = Class370.aClass268_6770.method2659(var2, 1089066090);
			if (var3.anIntArray9684 == null) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anIntArray9684.length;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rc.acc(" + ')');
		}
	}

	public static void method5231(int arg0, int arg1) {
		try {
			Class330_Sub36_Sub3 var2 = Class464_Sub4.method5750(21, (long) arg0);
			var2.method3444(1908091451);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rc.al(" + ')');
		}
	}

	public static boolean method5232(Class372 arg0, int arg1) {
		try {
			if (arg0 == null) {
				return false;
			} else if (!arg0.aBoolean3883) {
				return false;
			} else if (!arg0.method4327(Class354_Sub1.anInterface29_3496, (byte) 97)) {
				return false;
			} else if (Class354_Sub1.aClass497_7990.method6094((long) arg0.anInt3871) == null) {
				return Class354_Sub1.aClass497_7991.method6094((long) arg0.anInt3911) == null;
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "rc.cj(" + ')');
		}
	}

	public static void method5233(NPC arg0, boolean arg1, int arg2) {
		try {
			if (Class484.anInt5786 < 403) {
				Class551 var3 = arg0.aClass551_10251;
				String var4 = arg0.aString10259;
				if (var3.anIntArray6326 != null) {
					var3 = var3.method6371(Class158.aClass561_6474, (byte) 73);
					if (var3 == null) {
						return;
					}
					var4 = var3.aString6323;
				}
				if (var3.aBoolean6329) {
					if (arg0.anInt10258 != 0) {
						String var5 = client.aClass435_9146 == Class435.aClass435_4416 ? Class526.aClass526_6170.method6257(Class429.aClass454_4369, 991479434) : Class526.aClass526_6168.method6257(Class429.aClass454_4369, 991479434);
						var4 = var4 + Class557.method6454(arg0.anInt10258, Class263_Sub2.myPlayer.anInt10228, -1798420104) + Class215.aString2080 + var5 + arg0.anInt10258 + Class215.aString2078;
					}
					if (client.aBoolean9150 && !arg1) {
						Class537 var12 = OutgoingPacket.anInt2579 == -1 ? null : Class301.aClass543_3059.method6339(OutgoingPacket.anInt2579, -1323998072);
						if ((Class503.anInt5916 & 0x2) != 0 && (var12 == null || var3.method6370(OutgoingPacket.anInt2579, var12.anInt6235, (byte) 77) != var12.anInt6235)) {
							Class360.method4241(client.aString9152, client.aString9154 + " " + Class215.aString2082 + " " + Class146.method1738(16776960, -849826454) + var4, Class271.anInt2756, 8, -1, (long) arg0.anInt10008, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
						}
					}
					if (!arg1) {
						String[] var13 = var3.aStringArray6311;
						if (client.aBoolean9162) {
							var13 = Class95_Sub8.method1125(var13, -120931991);
						}
						if (var13 != null) {
							int var6;
							short var7;
							int var9;
							for (var6 = var13.length - 1; var6 >= 0; var6--) {
								if (var13[var6] != null && (var3.aByte6344 == 0 || !var13[var6].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434)) && !var13[var6].equalsIgnoreCase(Class526.aClass526_6068.method6257(Class429.aClass454_4369, 991479434)))) {
									var7 = 0;
									int var8 = client.anInt9148;
									if (var6 == 0) {
										var7 = 9;
									}
									if (var6 == 1) {
										var7 = 10;
									}
									if (var6 == 2) {
										var7 = 11;
									}
									if (var6 == 3) {
										var7 = 12;
									}
									if (var6 == 4) {
										var7 = 13;
									}
									if (var6 == 5) {
										var7 = 1003;
									}
									var9 = var3.method6377(var6, -90573207);
									if (var9 != -1) {
										var8 = var9;
									}
									Class360.method4241(var13[var6], Class146.method1738(16776960, -849826454) + var4, var13[var6].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434)) ? var3.anInt6313 : var8, var7, -1, (long) arg0.anInt10008, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
								}
							}
							if (var3.aByte6344 == 1) {
								for (var6 = 0; var6 < var13.length; var6++) {
									if (var13[var6] != null && (var13[var6].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434)) || var13[var6].equalsIgnoreCase(Class526.aClass526_6068.method6257(Class429.aClass454_4369, 991479434)))) {
										var7 = 0;
										if (arg0.anInt10258 > Class263_Sub2.myPlayer.anInt10228) {
											var7 = 2000;
										}
										short var14 = 0;
										var9 = client.anInt9148;
										if (var6 == 0) {
											var14 = 9;
										}
										if (var6 == 1) {
											var14 = 10;
										}
										if (var6 == 2) {
											var14 = 11;
										}
										if (var6 == 3) {
											var14 = 12;
										}
										if (var6 == 4) {
											var14 = 13;
										}
										if (var6 == 5) {
											var14 = 1003;
										}
										if (var14 != 0) {
											var14 += var7;
										}
										int var10 = var3.method6377(var6, -367856958);
										if (var10 != -1) {
											var9 = var10;
										}
										Class360.method4241(var13[var6], Class146.method1738(16776960, -849826454) + var4, var13[var6].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434)) ? var3.anInt6313 : var9, var14, -1, (long) arg0.anInt10008, 0, 0, true, false, (long) arg0.anInt10008, false, (short) 140);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "rc.be(" + ')');
		}
	}
}
