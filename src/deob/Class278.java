package deob;

public class Class278 {

	public static int anInt2873 = 7;

	public int anInt2870;

	public byte[] aByteArray2881;

	public int anInt2874;

	public int anInt2883;

	public int archiveSize;

	public Class139 class139;

	public int[] anIntArray2872;

	public int[] anIntArray2875;

	public int[] anIntArray2878;

	public int[] anIntArray2880;

	public int[] anIntArray2885;

	public int[] archiveIds;

	public Class139[] class139s;

	public byte[][] aByteArrayArray2879;

	public int[][] anIntArrayArray2876;

	public int[][] anIntArrayArray2882;

	public Class278(byte[] arg0, int arg1, byte[] arg2) {
		this.anInt2870 = Class125.method1528(arg0, arg0.length, 283126520);
		if (this.anInt2870 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray2881 = Class562.method6473(arg0, 0, arg0.length, (byte) -59);
			for (int var4 = 0; var4 < 64; var4++) {
				if (this.aByteArray2881[var4] != arg2[var4]) {
					throw new RuntimeException();
				}
			}
		}
		this.method2737(arg0, -1152721345);
	}

	public void method2737(byte[] arg0, int arg1) {
		try {
			Buffer var3 = new Buffer(Class143.method1659(arg0, (short) -315));
			int var4 = var3.readUnsignedByte(2118019095);
			if (var4 < 5 || var4 > 7) {
				throw new RuntimeException();
			}
			if (var4 >= 6) {
				this.anInt2874 = var3.readInt((byte) 71);
			} else {
				this.anInt2874 = 0;
			}
			int var5 = var3.readUnsignedByte(447371117);
			boolean var6 = (var5 & 0x1) != 0;
			boolean var7 = (var5 & 0x2) != 0;
			if (var4 >= 7) {
				this.anInt2883 = var3.method3768(373696947);
			} else {
				this.anInt2883 = var3.readUnsignedShort(-295148049);
			}
			int var8 = 0;
			int var9 = -1;
			this.archiveIds = new int[this.anInt2883];
			int var10;
			if (var4 >= 7) {
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					this.archiveIds[var10] = var8 += var3.method3768(373696947);
					if (this.archiveIds[var10] > var9) {
						var9 = this.archiveIds[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					this.archiveIds[var10] = var8 += var3.readUnsignedShort(43030293);
					if (this.archiveIds[var10] > var9) {
						var9 = this.archiveIds[var10];
					}
				}
			}
			this.archiveSize = var9 + 1;
			this.anIntArray2878 = new int[this.archiveSize];
			if (var7) {
				this.aByteArrayArray2879 = new byte[this.archiveSize][];
			}
			this.anIntArray2880 = new int[this.archiveSize];
			this.anIntArray2872 = new int[this.archiveSize];
			this.anIntArrayArray2882 = new int[this.archiveSize][];
			this.anIntArray2885 = new int[this.archiveSize];
			if (var6) {
				this.anIntArray2875 = new int[this.archiveSize];
				for (var10 = 0; var10 < this.archiveSize; var10++) {
					this.anIntArray2875[var10] = -1;
				}
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					this.anIntArray2875[this.archiveIds[var10]] = var3.readInt((byte) 96);
				}
				this.class139 = new Class139(this.anIntArray2875);
			}
			for (var10 = 0; var10 < this.anInt2883; var10++) {
				this.anIntArray2878[this.archiveIds[var10]] = var3.readInt((byte) 33);
			}
			if (var7) {
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					byte[] var11 = new byte[64];
					var3.readBytes(var11, 0, 64, 1274334002);
					this.aByteArrayArray2879[this.archiveIds[var10]] = var11;
				}
			}
			for (var10 = 0; var10 < this.anInt2883; var10++) {
				this.anIntArray2880[this.archiveIds[var10]] = var3.readInt((byte) 28);
			}
			int var12;
			int var13;
			int var14;
			int var15;
			int var17;
			if (var4 >= 7) {
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					this.anIntArray2872[this.archiveIds[var10]] = var3.method3768(373696947);
				}
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					var17 = this.archiveIds[var10];
					var12 = this.anIntArray2872[var17];
					var8 = 0;
					var13 = -1;
					this.anIntArrayArray2882[var17] = new int[var12];
					for (var14 = 0; var14 < var12; var14++) {
						var15 = this.anIntArrayArray2882[var17][var14] = var8 += var3.method3768(373696947);
						if (var15 > var13) {
							var13 = var15;
						}
					}
					this.anIntArray2885[var17] = var13 + 1;
					if (var12 == var13 + 1) {
						this.anIntArrayArray2882[var17] = null;
					}
				}
			} else {
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					this.anIntArray2872[this.archiveIds[var10]] = var3.readUnsignedShort(1817748295);
				}
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					var17 = this.archiveIds[var10];
					var12 = this.anIntArray2872[var17];
					var8 = 0;
					var13 = -1;
					this.anIntArrayArray2882[var17] = new int[var12];
					for (var14 = 0; var14 < var12; var14++) {
						var15 = this.anIntArrayArray2882[var17][var14] = var8 += var3.readUnsignedShort(-195203348);
						if (var15 > var13) {
							var13 = var15;
						}
					}
					this.anIntArray2885[var17] = var13 + 1;
					if (var12 == var13 + 1) {
						this.anIntArrayArray2882[var17] = null;
					}
				}
			}
			if (var6) {
				this.anIntArrayArray2876 = new int[var9 + 1][];
				this.class139s = new Class139[var9 + 1];
				for (var10 = 0; var10 < this.anInt2883; var10++) {
					var17 = this.archiveIds[var10];
					var12 = this.anIntArray2872[var17];
					this.anIntArrayArray2876[var17] = new int[this.anIntArray2885[var17]];
					for (var13 = 0; var13 < this.anIntArray2885[var17]; var13++) {
						this.anIntArrayArray2876[var17][var13] = -1;
					}
					for (var13 = 0; var13 < var12; var13++) {
						if (this.anIntArrayArray2882[var17] == null) {
							var14 = var13;
						} else {
							var14 = this.anIntArrayArray2882[var17][var13];
						}
						this.anIntArrayArray2876[var17][var14] = var3.readInt((byte) 122);
					}
					this.class139s[var17] = new Class139(this.anIntArrayArray2876[var17]);
				}
			}
		} catch (RuntimeException var16) {
			throw Class476.method5964(var16, "lo.r(" + ')');
		}
	}

	public static void method2738(IndexTable arg0, IndexTable arg1, IndexTable arg2, IndexTable arg3, byte arg4) {
		try {
			Class330_Sub12_Sub9.aClass280_9534 = arg0;
			Class284.aClass280_2927 = arg1;
			Class26.aClass280_314 = arg2;
			Class3.aClass120Array56 = new Class120[Class330_Sub12_Sub9.aClass280_9534.method2764(1775235790)];
			Class382.aBooleanArray6678 = new boolean[Class330_Sub12_Sub9.aClass280_9534.method2764(1483518956)];
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "lo.r(" + ')');
		}
	}

	public static int method2739(int arg0, byte arg1) {
		try {
			return arg0 == 16711935 ? -1 : Class404.method4739(arg0, -1769481276);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lo.p(" + ')');
		}
	}

	public static final int[] method2740(String arg0, Class430 arg1, byte arg2) {
		try {
			int[] var3 = null;
			if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
				int var4 = arg1.anIntArray4387[--arg1.anInt4376];
				if (var4 > 0) {
					var3 = new int[var4];
					while (var4-- > 0) {
						var3[var4] = arg1.anIntArray4387[--arg1.anInt4376];
					}
				}
			}
			return var3;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "lo.kz(" + ')');
		}
	}

	public static final void method2741(Class430 arg0, int arg1) {
		try {
			arg0.anInt4378 -= 2;
			String var2 = (String) arg0.anObjectArray4386[arg0.anInt4378];
			String var3 = (String) arg0.anObjectArray4386[arg0.anInt4378 + 1];
			if (client.anInt9182 != 0 || (!client.aBoolean9083 || client.aBoolean9228) && !client.aBoolean9073) {
				Class1 var4 = Class426.method5317(1848002995);
				Class330_Sub34 var5 = Class238.method2377(OutgoingPacket.SEND_PM_PACKET, var4.aClass488_22, 793942574);
				var5.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 47);
				int var6 = var5.aClass330_Sub46_Sub2_7729.offset;
				var5.aClass330_Sub46_Sub2_7729.addString(var2, (byte) 0);
				Class210.method2220(var5.aClass330_Sub46_Sub2_7729, var3, -381654745);
				var5.aClass330_Sub46_Sub2_7729.method3772(var5.aClass330_Sub46_Sub2_7729.offset - var6, (byte) 47);
				var4.method378(var5, -923937685);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "lo.ack(" + ')');
		}
	}

	public static void method2742(byte arg0) {
		try {
			if (Class507.aBoolean5939) {
				if (Class507.anInt5931 < Class125.anInt1458) {
					Class507.anInt5931 = Class125.anInt1458;
				}
				while (true) {
					while (Class507.anInt5931 < Class509.anInt5946) {
						Class401_Sub1 var1 = Class23.method476(Class507.anInt5931, (byte) 88);
						if (var1 != null && var1.anInt8248 == -1) {
							if (Class507.aClass422_5938 == null) {
								Class507.aClass422_5938 = client.aClass423_9029.method5298(var1.aString8247, -1464772424);
							}
							int var2 = Class507.aClass422_5938.anInt4319;
							if (var2 == -1) {
								return;
							}
							var1.anInt8248 = var2;
							Class507.anInt5931++;
							Class507.aClass422_5938 = null;
						} else {
							Class507.anInt5931++;
						}
					}
					return;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "lo.r(" + ')');
		}
	}
}
