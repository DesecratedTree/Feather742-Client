package deob;

public class IsaacCipher {

	public static int anInt5829 = 256;

	public static int anInt5830 = 1020;

	public static int anInt5832 = 8;

	public int[] anIntArray5835 = new int[256];

	public int[] anIntArray5833 = new int[256];

	public int anInt5828;

	public int anInt5831;

	public int anInt5834;

	public int anInt5836;

	public static int anInt5837;

	public static IComponentDefinitions aClass114_5838;

	public IsaacCipher(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.anIntArray5833[var2] = arg0[var2];
		}
		this.method6044((byte) -31);
	}

	public final int method6042(int arg0) {
		try {
			if (this.anInt5831 == 0) {
				this.method6045(-548591214);
				this.anInt5831 = 256;
			}
			return ClientLoader.isaacDisabled ? 0 : this.anIntArray5833[this.anInt5831 - 1];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ue.j(" + ')');
		}
	}

	public final int method6043(int arg0) {
		try {
			if (this.anInt5831 == 0) {
				this.method6045(-548591214);
				this.anInt5831 = 256;
			}
			return ClientLoader.isaacDisabled ? 0 : this.anIntArray5833[--this.anInt5831];
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ue.r(" + ')');
		}
	}

	public final void method6044(byte arg0) {
		try {
			int var2 = -1640531527;
			int var3 = -1640531527;
			int var4 = -1640531527;
			int var5 = -1640531527;
			int var6 = -1640531527;
			int var7 = -1640531527;
			int var8 = -1640531527;
			int var9 = -1640531527;
			int var10;
			for (var10 = 0; var10 < 4; var10++) {
				var9 ^= var8 << 11;
				var6 += var9;
				var8 += var7;
				var8 ^= var7 >>> 2;
				var5 += var8;
				var7 += var6;
				var7 ^= var6 << 8;
				var4 += var7;
				var6 += var5;
				var6 ^= var5 >>> 16;
				var3 += var6;
				var5 += var4;
				var5 ^= var4 << 10;
				var2 += var5;
				var4 += var3;
				var4 ^= var3 >>> 4;
				var9 += var4;
				var3 += var2;
				var3 ^= var2 << 8;
				var8 += var3;
				var2 += var9;
				var2 ^= var9 >>> 9;
				var7 += var2;
				var9 += var8;
			}
			for (var10 = 0; var10 < 256; var10 += 8) {
				var9 += this.anIntArray5833[var10];
				var8 += this.anIntArray5833[var10 + 1];
				var7 += this.anIntArray5833[var10 + 2];
				var6 += this.anIntArray5833[var10 + 3];
				var5 += this.anIntArray5833[var10 + 4];
				var4 += this.anIntArray5833[var10 + 5];
				var3 += this.anIntArray5833[var10 + 6];
				var2 += this.anIntArray5833[var10 + 7];
				var9 ^= var8 << 11;
				var6 += var9;
				var8 += var7;
				var8 ^= var7 >>> 2;
				var5 += var8;
				var7 += var6;
				var7 ^= var6 << 8;
				var4 += var7;
				var6 += var5;
				var6 ^= var5 >>> 16;
				var3 += var6;
				var5 += var4;
				var5 ^= var4 << 10;
				var2 += var5;
				var4 += var3;
				var4 ^= var3 >>> 4;
				var9 += var4;
				var3 += var2;
				var3 ^= var2 << 8;
				var8 += var3;
				var2 += var9;
				var2 ^= var9 >>> 9;
				var7 += var2;
				var9 += var8;
				this.anIntArray5835[var10] = var9;
				this.anIntArray5835[var10 + 1] = var8;
				this.anIntArray5835[var10 + 2] = var7;
				this.anIntArray5835[var10 + 3] = var6;
				this.anIntArray5835[var10 + 4] = var5;
				this.anIntArray5835[var10 + 5] = var4;
				this.anIntArray5835[var10 + 6] = var3;
				this.anIntArray5835[var10 + 7] = var2;
			}
			for (var10 = 0; var10 < 256; var10 += 8) {
				var9 += this.anIntArray5835[var10];
				var8 += this.anIntArray5835[var10 + 1];
				var7 += this.anIntArray5835[var10 + 2];
				var6 += this.anIntArray5835[var10 + 3];
				var5 += this.anIntArray5835[var10 + 4];
				var4 += this.anIntArray5835[var10 + 5];
				var3 += this.anIntArray5835[var10 + 6];
				var2 += this.anIntArray5835[var10 + 7];
				var9 ^= var8 << 11;
				var6 += var9;
				var8 += var7;
				var8 ^= var7 >>> 2;
				var5 += var8;
				var7 += var6;
				var7 ^= var6 << 8;
				var4 += var7;
				var6 += var5;
				var6 ^= var5 >>> 16;
				var3 += var6;
				var5 += var4;
				var5 ^= var4 << 10;
				var2 += var5;
				var4 += var3;
				var4 ^= var3 >>> 4;
				var9 += var4;
				var3 += var2;
				var3 ^= var2 << 8;
				var8 += var3;
				var2 += var9;
				var2 ^= var9 >>> 9;
				var7 += var2;
				var9 += var8;
				this.anIntArray5835[var10] = var9;
				this.anIntArray5835[var10 + 1] = var8;
				this.anIntArray5835[var10 + 2] = var7;
				this.anIntArray5835[var10 + 3] = var6;
				this.anIntArray5835[var10 + 4] = var5;
				this.anIntArray5835[var10 + 5] = var4;
				this.anIntArray5835[var10 + 6] = var3;
				this.anIntArray5835[var10 + 7] = var2;
			}
			this.method6045(-548591214);
			this.anInt5831 = 256;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ue.p(" + ')');
		}
	}

	public final void method6045(int arg0) {
		try {
			this.anInt5828 += ++this.anInt5836;
			for (int var2 = 0; var2 < 256; var2++) {
				int var3 = this.anIntArray5835[var2];
				if ((var2 & 0x2) == 0) {
					if ((var2 & 0x1) == 0) {
						this.anInt5834 ^= this.anInt5834 << 13;
					} else {
						this.anInt5834 ^= this.anInt5834 >>> 6;
					}
				} else if ((var2 & 0x1) == 0) {
					this.anInt5834 ^= this.anInt5834 << 2;
				} else {
					this.anInt5834 ^= this.anInt5834 >>> 16;
				}
				this.anInt5834 += this.anIntArray5835[var2 + 128 & 0xFF];
				int var4;
				this.anIntArray5835[var2] = var4 = this.anInt5834 + this.anIntArray5835[var3 >> 2 & 0xFF] + this.anInt5828;
				this.anIntArray5833[var2] = this.anInt5828 = this.anIntArray5835[var4 >> 8 >> 2 & 0xFF] + var3;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ue.i(" + ')');
		}
	}

	public static int method6046(int arg0, int arg1) {
		try {
			int var4 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
			int var5 = (var4 & 0x33333333) + (var4 >>> 2 & 0x33333333);
			int var6 = var5 + (var5 >>> 4) & 0xF0F0F0F;
			int var7 = var6 + (var6 >>> 8);
			int var8 = var7 + (var7 >>> 16);
			return var8 & 0xFF;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ue.i(" + ')');
		}
	}

	public static IndexTable method6047(CacheIndex arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
		try {
			if (Class429.aClass282_Sub1Array4368 == null) {
				Class429.aClass282_Sub1Array4368 = new Class282_Sub1[Class158_Sub1.getCacheIndex(2008981379)];
			}
			Class339 var5 = null;
			int var6 = arg0.method1519((byte) 1);
			if (client.aClass489_6624 != null) {
				var5 = new Class339(var6, client.aClass489_6624, Class440.aClass489Array4481[var6], 1500000);
			}
			Class429.aClass282_Sub1Array4368[var6] = Class422.aClass277_4322.method2732(var6, var5, Class207.aClass339_1952, (short) -5102);
			Class429.aClass282_Sub1Array4368[var6].method2819(2027024279);
			return new IndexTable(Class429.aClass282_Sub1Array4368[var6], arg1, arg2);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "ue.ff(" + ')');
		}
	}

	public static void method6048(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		try {
			Class283.method2825(arg0, arg1, arg2, arg3, null, false, 12179920);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ue.mf(" + ')');
		}
	}

	public static long method6049(CharSequence arg0, int arg1) {
		try {
			int var2 = arg0.length();
			long var3 = 0L;
			for (int var5 = 0; var5 < var2; var5++) {
				var3 = (var3 << 5) - var3 + (long) arg0.charAt(var5);
			}
			return var3;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "ue.b(" + ')');
		}
	}

	public static final void method6050(Class_ra arg0, Interface_ma arg1, int arg2) {
		try {
			if (Class354_Sub1.aClass330_Sub36_Sub12_3497 != null) {
				Class312.method3111((byte) 98);
				Class312.method3111((byte) 20);
				if (Class354_Sub1.anInt7977 < 10) {
					if (!Class354_Sub1.aClass280_3498.method2773(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation, 553184423)) {
						Class354_Sub1.anInt7977 = Class434.aClass280_6560.method2775(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation, (byte) -79) / 10;
						return;
					}
					Class524.method6254((byte) -125);
					Class354_Sub1.anInt7977 = 10;
				}
				if (Class354_Sub1.anInt7977 == 10) {
					Class354_Sub1.anInt3510 = Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9709 >> 6 << 6;
					Class354_Sub1.anInt3516 = Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9704 >> 6 << 6;
					Class354_Sub1.anInt3524 = (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9706 >> 6 << 6) - Class354_Sub1.anInt3510 + 64;
					Class354_Sub1.anInt3513 = (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9712 >> 6 << 6) - Class354_Sub1.anInt3516 + 64;
					int[] var3 = new int[3];
					int var4 = -1;
					int var5 = -1;
					Class260 var6 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
					Class381 var7 = client.aClass304_9030.method3022(-1817830627);
					if (Class354_Sub1.aClass330_Sub36_Sub12_3497.method3484(Class263_Sub2.myPlayer.aByte8658, ((int) var6.aFloat2716 >> 9) + var7.gameSceneBaseX, var7.gameSceneBaseY + ((int) var6.aFloat2711 >> 9), var3, (byte) -30)) {
						var4 = var3[1] - Class354_Sub1.anInt3510;
						var5 = var3[2] - Class354_Sub1.anInt3516;
					}
					if (!Class354_Sub1.aBoolean7984 && var4 >= 0 && var4 < Class354_Sub1.anInt3524 && var5 >= 0 && var5 < Class354_Sub1.anInt3513) {
						var4 += (int) (Math.random() * 10.0D) - 5;
						var5 += (int) (Math.random() * 10.0D) - 5;
						Class204.anInt6517 = var4;
						Class149_Sub1.anInt8867 = var5;
					} else if (Class354_Sub1.anInt7982 == -1 || Class354_Sub1.anInt7978 == -1) {
						Class354_Sub1.aClass330_Sub36_Sub12_3497.method3481(Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9702 >> 14 & 0x3FFF, Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9702 & 0x3FFF, var3, (byte) 97);
						Class204.anInt6517 = var3[1] - Class354_Sub1.anInt3510;
						Class149_Sub1.anInt8867 = var3[2] - Class354_Sub1.anInt3516;
					} else {
						Class354_Sub1.aClass330_Sub36_Sub12_3497.method3481(Class354_Sub1.anInt7982, Class354_Sub1.anInt7978, var3, (byte) -82);
						if (var3 != null) {
							Class204.anInt6517 = var3[1] - Class354_Sub1.anInt3510;
							Class149_Sub1.anInt8867 = var3[2] - Class354_Sub1.anInt3516;
						}
						Class354_Sub1.anInt7978 = -1;
						Class354_Sub1.anInt7982 = -1;
						Class354_Sub1.aBoolean7984 = false;
					}
					if (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 == 37) {
						Class354_Sub1.aFloat3507 = 3.0F;
						Class354_Sub1.aFloat3520 = 3.0F;
					} else if (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 == 50) {
						Class354_Sub1.aFloat3507 = 4.0F;
						Class354_Sub1.aFloat3520 = 4.0F;
					} else if (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 == 75) {
						Class354_Sub1.aFloat3507 = 6.0F;
						Class354_Sub1.aFloat3520 = 6.0F;
					} else if (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 == 100) {
						Class354_Sub1.aFloat3507 = 8.0F;
						Class354_Sub1.aFloat3520 = 8.0F;
					} else if (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 == 200) {
						Class354_Sub1.aFloat3507 = 16.0F;
						Class354_Sub1.aFloat3520 = 16.0F;
					} else {
						Class354_Sub1.aFloat3507 = 8.0F;
						Class354_Sub1.aFloat3520 = 8.0F;
					}
					Class354_Sub1.anInt3521 = (int) Class354_Sub1.aFloat3507 >> 1;
					Class354_Sub1.aByteArrayArrayArray3502 = Class142.method1656(Class354_Sub1.anInt3521, 1573525299);
					Class541.method6331(271028029);
					Class354_Sub1.method4099();
					Class171.aClass471_1730 = new Class471();
					Class354_Sub1.anInt3500 += (int) (Math.random() * 5.0D) - 2;
					if (Class354_Sub1.anInt3500 < -8) {
						Class354_Sub1.anInt3500 = -8;
					}
					if (Class354_Sub1.anInt3500 > 8) {
						Class354_Sub1.anInt3500 = 8;
					}
					Class354_Sub1.anInt3501 += (int) (Math.random() * 5.0D) - 2;
					if (Class354_Sub1.anInt3501 < -16) {
						Class354_Sub1.anInt3501 = -16;
					}
					if (Class354_Sub1.anInt3501 > 16) {
						Class354_Sub1.anInt3501 = 16;
					}
					Class354_Sub1.method4104(arg1, Class354_Sub1.anInt3500 >> 2 << 10, Class354_Sub1.anInt3501 >> 1);
					Class354_Sub1.aClass380_3529.method4391(1024, 256, -1687792028);
					Class354_Sub1.aClass552_3493.method6383(256, 256, (byte) 32);
					Class354_Sub1.aClass463_3515.method5707(4096, -1631740600);
					Class428.aClass370_4364.method4316(256, (byte) -39);
					Class354_Sub1.anInt7977 = 20;
				} else if (Class354_Sub1.anInt7977 == 20) {
					Class475.method5944(true, -1503225972);
					Class354_Sub1.loadMap(arg0, Class354_Sub1.anInt3500, Class354_Sub1.anInt3501);
					Class354_Sub1.anInt7977 = 60;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -12);
				} else if (Class354_Sub1.anInt7977 == 60) {
					if (Class354_Sub1.aClass280_3498.method2769(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation + "_staticelements", -690425734)) {
						if (!Class354_Sub1.aClass280_3498.method2773(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation + "_staticelements", -336464278)) {
							return;
						}
						Class354_Sub1.aClass351_3508 = Class434.method5563(Class354_Sub1.aClass280_3498, Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation + "_staticelements", client.aBoolean9123, (byte) 0);
					} else {
						Class354_Sub1.aClass351_3508 = new Class351(0);
					}
					Class354_Sub1.method4089();
					Class354_Sub1.anInt7977 = 70;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -28);
				} else if (Class354_Sub1.anInt7977 == 70) {
					Class420.aClass8_4308 = new Class8(arg0, 11, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 73;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 87);
				} else if (Class354_Sub1.anInt7977 == 73) {
					Class440.aClass8_4483 = new Class8(arg0, 12, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 76;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -7);
				} else if (Class354_Sub1.anInt7977 == 76) {
					Class362.aClass8_3799 = new Class8(arg0, 14, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 79;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -41);
				} else if (Class354_Sub1.anInt7977 == 79) {
					Class354_Sub1.aClass8_7985 = new Class8(arg0, 17, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 82;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -117);
				} else if (Class354_Sub1.anInt7977 == 82) {
					Class533.aClass8_6915 = new Class8(arg0, 19, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 85;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 23);
				} else if (Class354_Sub1.anInt7977 == 85) {
					Class255.aClass8_2664 = new Class8(arg0, 22, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 88;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 69);
				} else if (Class354_Sub1.anInt7977 == 88) {
					Class555.aClass8_6383 = new Class8(arg0, 26, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 91;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 93);
				} else {
					Class152.aClass8_1630 = new Class8(arg0, 30, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 100;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -38);
					System.gc();
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "ue.bh(" + ')');
		}
	}

	public static ClientScript method6051(Class545 arg0, int arg1, int arg2, byte arg3) {
		try {
			int var4 = arg0.anInt6992 | arg1 << 10;
			ClientScript var5 = (ClientScript) Class424.aClass378_4326.method4377((long) var4 << 16);
			if (var5 != null) {
				return var5;
			}
			byte[] var6 = Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(var4, (byte) -61), 398431352);
			if (var6 == null) {
				var4 = arg0.anInt6992 | arg2 + 65536 << 10;
				var5 = (ClientScript) Class424.aClass378_4326.method4377((long) var4 << 16);
				if (var5 != null) {
					return var5;
				}
				var6 = Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(var4, (byte) -77), 1686902060);
				if (var6 == null) {
					var4 = arg0.anInt6992 | 0x3FFFC00;
					var5 = (ClientScript) Class424.aClass378_4326.method4377((long) var4 << 16);
					if (var5 != null) {
						return var5;
					}
					var6 = Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(var4, (byte) -88), 2035831625);
					if (var6 == null) {
						return null;
					} else if (var6.length <= 1) {
						return null;
					} else {
						try {
							var5 = Class403.method4730(var6, -2027109360);
						} catch (Exception var10) {
							throw new RuntimeException(var10.getMessage() + " " + var4);
						}
						var5.aClass545_9679 = arg0;
						Class424.aClass378_4326.method4378(var5, (long) var4 << 16);
						return var5;
					}
				} else if (var6.length <= 1) {
					return null;
				} else {
					try {
						var5 = Class403.method4730(var6, -2139308649);
					} catch (Exception var9) {
						throw new RuntimeException(var9.getMessage() + " " + var4);
					}
					var5.aClass545_9679 = arg0;
					Class424.aClass378_4326.method4378(var5, (long) var4 << 16);
					return var5;
				}
			} else if (var6.length <= 1) {
				return null;
			} else {
				try {
					var5 = Class403.method4730(var6, -2119755956);
				} catch (Exception var8) {
					throw new RuntimeException(var8.getMessage() + " " + var4);
				}
				var5.aClass545_9679 = arg0;
				Class424.aClass378_4326.method4378(var5, (long) var4 << 16);
				return var5;
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ue.i(" + ')');
		}
	}

	public static Class365 method6052(Buffer arg0, int arg1) {
		try {
			int var2 = arg0.readUnsignedByte(-185870809);
			int[] var3 = new int[var2];
			for (int var4 = 0; var4 < var2; var4++) {
				var3[var4] = arg0.readUnsignedByte(1026528737);
			}
			return new Class365(var3);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ue.o(" + ')');
		}
	}
}
