package deob;

public class Class500 {

	public char aChar5894;

	public void method6119(Buffer arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				this.aChar5894 = Class127.method1546(arg0.readByte((byte) 61), -1942091319);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "uq.j(" + ')');
		}
	}

	public void method6120(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(151562798);
				if (var3 == 0) {
					if (arg1 == 4) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method6119(arg0, var3, 877846450);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "uq.r(" + ')');
		}
	}

	public static final void method6121(byte arg0) {
		try {
			Class490.method6070(971985001);
			client.aClass304_9030.method3028(-952865634);
			int var1;
			for (var1 = 0; var1 < client.aClass3Array8986.length; var1++) {
				client.aClass3Array8986[var1] = null;
			}
			for (var1 = 0; var1 < client.aClass327Array8999.length; var1++) {
				client.aClass327Array8999[var1] = null;
			}
			Class429.method5327((byte) -93);
			for (var1 = 0; var1 < 2048; var1++) {
				client.players[var1] = null;
			}
			client.anInt9017 = 0;
			client.aClass497_9014.method6100(65280);
			client.anInt9232 = 0;
			client.aClass497_9138.method6100(65280);
			Class340.method3971(-1660984500);
			client.anInt9027 = 0;
			Class158.aClass561_6474.method6463((short) -7175);
			Class412.aClass154_4258 = null;
			CacheIndex.aClass154_1450 = null;
			Class_ra_Sub3.aClass330_Sub39_8652 = null;
			Class106.aClass330_Sub39_1009 = null;
			Class95_Sub5.aClass422_7146 = null;
			Class198.aLong1925 = 0L;
			Class513.method6194((byte) -16);
			Class_ta.method5676(-1158114613);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "uq.gq(" + ')');
		}
	}

	public static final void method6122(byte arg0) {
		try {
			for (int var1 = Class158.aClass561_6474.method6462(true, 1103662088); var1 != -1; var1 = Class158.aClass561_6474.method6462(false, 1103662088)) {
				Class334.method3934(var1, (byte) 22);
				client.anIntArray9185[++client.anInt9186 - 1 & 0x1F] = var1;
			}
			for (Class330_Sub36_Sub3 var12 = Class167.method2024(-848220559); var12 != null; var12 = Class167.method2024(-848220559)) {
				int var2 = var12.method3446((byte) 2);
				long var3 = var12.method3448(1898035200);
				if (var2 == 1) {
					Class555.anIntArray6382[(int) var3] = var12.anInt9629;
					client.aBoolean9206 |= Class330_Sub26.aBooleanArray7696[(int) var3];
					client.anIntArray9237[++client.anInt9192 - 1 & 0x1F] = (int) var3;
				} else if (var2 == 2) {
					Class258.aStringArray2710[(int) var3] = var12.aString9649;
					client.anIntArray9193[++client.anInt9142 - 1 & 0x1F] = (int) var3;
				} else {
					IComponentDefinitions var5;
					if (var2 == 3) {
						var5 = Class95.method1101((int) var3, 1601248574);
						if (var12 != null && var5 != null && !var12.aString9649.equals(var5.aString1266)) {
							var5.aString1266 = var12.aString9649;
							Class404.method4738(var5, 922283701);
						}
					} else if (var2 == 22) {
						var5 = Class95.method1101((int) var3, 199092072);
						if ((var12.anInt9629 == 1) != var5.aBoolean1357) {
							var5.aBoolean1357 = var12.anInt9629 == 1;
							Class404.method4738(var5, 469126614);
						}
					} else {
						int var6;
						int var7;
						int var8;
						if (var2 == 4) {
							var5 = Class95.method1101((int) var3, -1625063960);
							var6 = var12.anInt9629;
							var7 = var12.anInt9626;
							var8 = var12.anInt9627;
							if (var6 != var5.anInt1238 || var5.anInt1239 != var7 || var5.anInt1240 != var8) {
								var5.anInt1238 = var6;
								var5.anInt1239 = var7;
								var5.anInt1240 = var8;
								var5.aClass538_1362 = null;
								Class404.method4738(var5, 1208498697);
							}
						} else if (var2 == 5) {
							var5 = Class95.method1101((int) var3, -505975534);
							if (var12.anInt9629 != var5.anInt1345) {
								if (var12.anInt9629 == -1) {
									var5.aClass477_1344 = null;
								} else {
									if (var5.aClass477_1344 == null) {
										var5.aClass477_1344 = new Class477_Sub1();
									}
									var5.aClass477_1344.method5988(var12.anInt9629, (byte) 31);
								}
								var5.anInt1345 = var12.anInt9629;
								Class404.method4738(var5, 357465935);
							}
						} else if (var2 == 6) {
							int var14 = var12.anInt9629;
							var6 = var14 >> 10 & 0x1F;
							var7 = var14 >> 5 & 0x1F;
							var8 = var14 & 0x1F;
							int var9 = (var6 << 19) + (var7 << 11) + (var8 << 3);
							IComponentDefinitions var10 = Class95.method1101((int) var3, -1343592928);
							if (var10.anInt1224 != var9) {
								var10.anInt1224 = var9;
								Class404.method4738(var10, 773218967);
							}
						} else if (var2 == 7) {
							var5 = Class95.method1101((int) var3, 1025372923);
							boolean var13 = var12.anInt9629 == 1;
							if (var5.aBoolean1215 != var13) {
								var5.aBoolean1215 = var13;
								Class404.method4738(var5, 1609679141);
							}
						} else if (var2 == 8) {
							var5 = Class95.method1101((int) var3, 1837215512);
							if (var12.anInt9629 != var5.anInt1296 || var12.anInt9626 != var5.anInt1245 || var12.anInt9627 != var5.anInt1354) {
								var5.anInt1296 = var12.anInt9629;
								var5.anInt1245 = var12.anInt9626;
								var5.anInt1354 = var12.anInt9627;
								if (var5.anInt1335 != -1) {
									if (var5.anInt1290 > 0) {
										var5.anInt1354 = var5.anInt1354 * 32 / var5.anInt1290;
									} else if (var5.anInt1346 > 0) {
										var5.anInt1354 = var5.anInt1354 * 32 / var5.anInt1346;
									}
								}
								Class404.method4738(var5, 1216291359);
							}
						} else if (var2 == 9) {
							var5 = Class95.method1101((int) var3, 465014860);
							if (var12.anInt9629 != var5.anInt1335 || var12.anInt9626 != var5.anInt1336) {
								var5.anInt1335 = var12.anInt9629;
								var5.anInt1336 = var12.anInt9626;
								Class404.method4738(var5, 1343401842);
							}
						} else if (var2 == 10) {
							var5 = Class95.method1101((int) var3, -1006727191);
							if (var5.anInt1321 != var12.anInt9629 || var5.anInt1243 != var12.anInt9626 || var12.anInt9627 != var5.anInt1248) {
								var5.anInt1321 = var12.anInt9629;
								var5.anInt1243 = var12.anInt9626;
								var5.anInt1248 = var12.anInt9627;
								Class404.method4738(var5, 2001539798);
							}
						} else if (var2 == 11) {
							var5 = Class95.method1101((int) var3, -404958945);
							var5.aByte1200 = 0;
							var5.anInt1329 = var5.anInt1192 = var12.anInt9629;
							var5.aByte1201 = 0;
							var5.anInt1209 = var5.anInt1324 = var12.anInt9626;
							Class404.method4738(var5, 1999132746);
						} else if (var2 == 12) {
							var5 = Class95.method1101((int) var3, 1972991712);
							var6 = var12.anInt9629;
							if (var5 != null && var5.anInt1198 == 0) {
								if (var6 > var5.anInt1223 - var5.anInt1348) {
									var6 = var5.anInt1223 - var5.anInt1348;
								}
								if (var6 < 0) {
									var6 = 0;
								}
								if (var5.anInt1221 != var6) {
									var5.anInt1221 = var6;
									Class404.method4738(var5, 1833708129);
								}
							}
						} else if (var2 == 14) {
							var5 = Class95.method1101((int) var3, 943716427);
							var5.anInt1229 = var12.anInt9629;
						} else if (var2 == 15) {
							Class9.aBoolean141 = true;
							Class9.anInt146 = var12.anInt9629;
							Class9.anInt151 = var12.anInt9626;
						} else if (var2 == 16) {
							var5 = Class95.method1101((int) var3, -1367726127);
							var5.anInt1264 = var12.anInt9629;
						} else if (var2 == 20) {
							var5 = Class95.method1101((int) var3, 99913265);
							var5.aBoolean1265 = var12.anInt9629 == 1;
						} else if (var2 == 21) {
							var5 = Class95.method1101((int) var3, -96112799);
							var5.aBoolean1237 = var12.anInt9629 == 1;
						} else if (var2 == 17) {
							var5 = Class95.method1101((int) var3, 1787759762);
							var5.anInt1292 = var12.anInt9629;
						} else if (var2 == 18) {
							var5 = Class95.method1101((int) var3, 701545310);
							var6 = (int) (var3 >> 32);
							var5.method1391(var6, (short) var12.anInt9629, (short) var12.anInt9626, (byte) -81);
						} else if (var2 == 19) {
							var5 = Class95.method1101((int) var3, 952203099);
							var6 = (int) (var3 >> 32);
							var5.method1401(var6, (short) var12.anInt9629, (short) var12.anInt9626, 2002592125);
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "uq.gt(" + ')');
		}
	}
}
