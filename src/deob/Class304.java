package deob;

import java.util.Iterator;

public class Class304 {

	public Class381 aClass381_3071 = new Class381();

	public Class381 aClass381_3072 = new Class381();

	public Class312 aClass312_3084 = new Class312(0, 0, 0, 0);

	public Class307[] aClass307Array3087 = new Class307[4];

	public int anInt3110 = 0;

	public int anInt3093 = 1;

	public int anInt3078 = 0;

	public int anInt3095 = 1;

	public boolean aBoolean3098 = false;

	public boolean aBoolean3103;

	public float aFloat3085;

	public int anInt3065;

	public int anInt3073;

	public int anInt3074;

	public int anInt3076;

	public int anInt3080;

	public int anInt3108;

	public long aLong3109;

	public Class134 aClass134_3077;

	public Class270 aClass270_3091;

	public Class274_Sub1 aClass274_Sub1_3069;

	public Class274_Sub1 aClass274_Sub1_3070;

	public Class281 aClass281_3079;

	public Class330_Sub36_Sub12 aClass330_Sub36_Sub12_3082;

	public Class351 aClass351_3094;

	public Class356 aClass356_3100;

	public Class389 aClass389_3068;

	public Class463 aClass463_3081;

	public OutgoingPacketManager aClass310_3066;

	public OutgoingPacketManager aClass310_3083;

	public int[] anIntArray3067;

	public int[] anIntArray3075;

	public int[] anIntArray3097;

	public int[] anIntArray3099;

	public int[] anIntArray3101;

	public int[] anIntArray3107;

	public byte[][] aByteArrayArray3092;

	public byte[][] aByteArrayArray3096;

	public byte[][] aByteArrayArray3104;

	public byte[][] aByteArrayArray3105;

	public byte[][] aByteArrayArray3106;

	public int[][] anIntArrayArray3088;

	public int[][] anIntArrayArray3089;

	public int[][] anIntArrayArray3102;

	public byte[][][] aByteArrayArrayArray3090;

	public int[][][] anIntArrayArrayArray3086;

	public Class304(boolean arg0) {
		this.aBoolean3103 = arg0;
	}

	public OutgoingPacketManager method2985(int arg0) {
		try {
			return this.aClass310_3066;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.r(" + ')');
		}
	}

	public Class270 method2986(byte arg0) {
		try {
			return this.aClass270_3091;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.j(" + ')');
		}
	}

	public int method2987(int arg0) {
		try {
			return 100 - this.anInt3110 * 100 / this.anInt3093;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.i(" + ')');
		}
	}

	public int method2988(int arg0) {
		try {
			return 100 - this.anInt3078 * 100 / this.anInt3095;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.p(" + ')');
		}
	}

	public float method2989(int arg0) {
		try {
			return this.aFloat3085;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.n(" + ')');
		}
	}

	public int method2990(int arg0) {
		try {
			return this.anInt3108;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.s(" + ')');
		}
	}

	public void sendMapRegion(Class330_Sub46_Sub2 arg0, int arg1) {
		try {
			int var3 = arg0.readUnsignedByte(1366694690);
			int var4 = arg0.readUnsignedShort(1218738432);
			boolean var5 = arg0.readUnsignedByteS(-400233324) == 1;
			int var6 = arg0.readUnsignedLEShortA(503411274);
			if (!this.aBoolean3103) {
				this.method3013(-421274603);
			}
			this.method3012(Class103.method1230(var3, 1984950980), -2073494742);
			int var7 = (arg0.payload.length - arg0.offset) / 16;
			this.anIntArrayArray3102 = new int[var7][4];
			int var8;
			int var9;
			for (var8 = 0; var8 < var7; var8++) {
				for (var9 = 0; var9 < 4; var9++) {
					this.anIntArrayArray3102[var8][var9] = arg0.readInt((byte) 95);
				}
			}
			this.anIntArray3067 = new int[var7];
			this.anIntArray3097 = new int[var7];
			this.anIntArray3075 = new int[var7];
			this.anIntArray3099 = null;
			this.aByteArrayArray3096 = new byte[var7][];
			this.aByteArrayArray3104 = new byte[var7][];
			this.aByteArrayArray3105 = null;
			this.anIntArray3107 = new int[var7];
			this.anIntArray3101 = new int[var7];
			this.aByteArrayArray3106 = new byte[var7][];
			this.aByteArrayArray3092 = new byte[var7][];
			var7 = 0;
			for (var8 = (var6 - (this.anInt3108 >> 4)) / 8; var8 <= (var6 + (this.anInt3108 >> 4)) / 8; var8++) {
				for (var9 = (var4 - (this.anInt3076 >> 4)) / 8; var9 <= (var4 + (this.anInt3076 >> 4)) / 8; var9++) {
					this.anIntArray3067[var7] = var9 + (var8 << 8);
					this.anIntArray3097[var7] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, false, var8, var9, (byte) 4), 323600977);
					this.anIntArray3075[var7] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, false, var8, var9, (byte) 4), 323600977);
					this.anIntArray3107[var7] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, true, var8, var9, (byte) 4), 323600977);
					this.anIntArray3101[var7] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, true, var8, var9, (byte) 4), 323600977);
					var7++;
				}
			}
			this.method3014(var6, var4, 16, var5, (byte) 61);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "mr.as(" + ')');
		}
	}

	public int method2992(int arg0) {
		try {
			return this.anInt3080;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.l(" + ')');
		}
	}

	public int method2993(int arg0) {
		try {
			return this.anInt3065;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.b(" + ')');
		}
	}

	public byte[][] method2994(int arg0, int arg1) {
		try {
			return this.aClass274_Sub1_3070 == null || this.aClass274_Sub1_3070.aByteArrayArrayArray2824 == null || this.aClass274_Sub1_3070.aByteArrayArrayArray2824[arg0] == null ? (byte[][]) null : this.aClass274_Sub1_3070.aByteArrayArrayArray2824[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.q(" + ')');
		}
	}

	public Class281 method2995(int arg0) {
		try {
			return this.aClass281_3079;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.u(" + ')');
		}
	}

	public Class307 method2996(int arg0, int arg1) {
		try {
			return this.aClass307Array3087[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.x(" + ')');
		}
	}

	public int[][] method2997(byte arg0) {
		try {
			return this.anIntArrayArray3088;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.c(" + ')');
		}
	}

	public int[][] method2998(int arg0) {
		try {
			return this.anIntArrayArray3089;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.a(" + ')');
		}
	}

	public byte[][][] method2999(int arg0) {
		try {
			return this.aByteArrayArrayArray3090;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.e(" + ')');
		}
	}

	public void method3000(byte[][][] arg0, int arg1) {
		try {
			this.aByteArrayArrayArray3090 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.m(" + ')');
		}
	}

	public Class274_Sub1 method3001(byte arg0) {
		try {
			return this.aClass274_Sub1_3070;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.t(" + ')');
		}
	}

	public void method3002(Class463 arg0, int arg1) {
		try {
			this.aClass463_3081 = arg0;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.h(" + ')');
		}
	}

	public void method3003(int arg0) {
		try {
			if (this.aClass356_3100 != null) {
				Class110.method1357((byte) 18);
				this.aClass356_3100.aClass338_3697.method3959((byte) 0);
				this.aClass356_3100 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.v(" + ')');
		}
	}

	public void method3004(byte arg0) {
		try {
			this.aClass270_3091 = Class270.aClass270_2751;
			this.anInt3110 = 0;
			this.anInt3093 = 1;
			this.anInt3078 = 0;
			this.anInt3095 = 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.ay(" + ')');
		}
	}

	public void method3005(int arg0) {
		try {
			this.aClass389_3068 = new Class389(Class361.aClass_ra3793, this.anInt3108 >> 3, this.anInt3076 >> 3);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.ac(" + ')');
		}
	}

	public void method3006(int arg0) {
		try {
			this.anInt3080 = 200;
			this.anInt3065 = (int) ((double) this.anInt3108 * 34.46D);
			this.anInt3065 <<= 0x2;
			if (Class361.aClass_ra3793.at()) {
				this.anInt3065 += 512;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.al(" + ')');
		}
	}

	public void method3007(Class304 arg0, byte arg1) {
		try {
			boolean var3 = arg0.aBoolean3103;
			arg0.aBoolean3103 = this.aBoolean3103;
			this.aBoolean3103 = var3;
			OutgoingPacketManager var4 = arg0.aClass310_3083;
			arg0.aClass310_3083 = this.aClass310_3083;
			this.aClass310_3083 = var4;
			arg0.aClass381_3072 = this.aClass381_3071;
			this.aClass381_3072 = arg0.aClass381_3071;
			this.aClass389_3068.method4588(arg0.method3008(851431066), 1874433724);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mr.at(" + ')');
		}
	}

	public Class389 method3008(int arg0) {
		try {
			return this.aClass389_3068;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.g(" + ')');
		}
	}

	public void method3009(int arg0) {
		try {
			this.method3012(Class103.method1230(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877.method5801((byte) 7), 1955702852), 233923902);
			int var2 = this.aClass381_3071.gameSceneBaseX;
			int var3 = this.aClass381_3071.gameSceneBaseY;
			int var4 = (Class471.anInt5612 >> 12) + (var2 >> 3);
			int var5 = (var3 >> 3) + (Class325_Sub3.anInt7484 >> 12);
			Class263_Sub2.myPlayer.aByte8658 = 0;
			Class85.anInt712 = 0;
			Class263_Sub2.myPlayer.method5463(8, 8, (short) 1007);
			byte var6 = 18;
			this.anIntArrayArray3102 = new int[var6][4];
			this.anIntArray3067 = new int[var6];
			this.anIntArray3097 = new int[var6];
			this.anIntArray3075 = new int[var6];
			this.anIntArray3099 = new int[var6];
			this.aByteArrayArray3096 = new byte[var6][];
			this.aByteArrayArray3104 = new byte[var6][];
			this.aByteArrayArray3105 = new byte[var6][];
			this.anIntArray3107 = new int[var6];
			this.anIntArray3101 = new int[var6];
			this.aByteArrayArray3106 = new byte[var6][];
			this.aByteArrayArray3092 = new byte[var6][];
			int var11 = 0;
			int var7;
			for (var7 = (var4 - (this.anInt3108 >> 4)) / 8; var7 <= ((this.anInt3108 >> 4) + var4) / 8; var7++) {
				for (int var8 = (var5 - (this.anInt3076 >> 4)) / 8; var8 <= (var5 + (this.anInt3076 >> 4)) / 8; var8++) {
					int var9 = var8 + (var7 << 8);
					this.anIntArray3067[var11] = var9;
					this.anIntArray3097[var11] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, false, var7, var8, (byte) 4), 323600977);
					this.anIntArray3075[var11] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, false, var7, var8, (byte) 4), 323600977);
					this.anIntArray3099[var11] = ItemDefinitions.aClass280_6752.method2754("n" + var7 + '_' + var8, 323600977);
					this.anIntArray3107[var11] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, true, var7, var8, (byte) 4), 323600977);
					this.anIntArray3101[var11] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, true, var7, var8, (byte) 4), 323600977);
					if (this.anIntArray3099[var11] == -1) {
						this.anIntArray3097[var11] = -1;
						this.anIntArray3075[var11] = -1;
						this.anIntArray3107[var11] = -1;
						this.anIntArray3101[var11] = -1;
					}
					var11++;
				}
			}
			for (var7 = var11; var7 < this.anIntArray3099.length; var7++) {
				this.anIntArray3099[var7] = -1;
				this.anIntArray3097[var7] = -1;
				this.anIntArray3075[var7] = -1;
				this.anIntArray3107[var7] = -1;
				this.anIntArray3101[var7] = -1;
			}
			byte var12;
			if (client.anInt8995 == 6) {
				var12 = 5;
			} else if (client.anInt8995 == 11) {
				var12 = 7;
			} else if (client.anInt8995 == 15) {
				var12 = 19;
			} else if (client.anInt8995 == 14) {
				var12 = 17;
			} else {
				throw new RuntimeException("" + client.anInt8995);
			}
			this.method3014(var4, var5, var12, false, (byte) -32);
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "mr.ai(" + ')');
		}
	}

	public void method3010(Class330_Sub46_Sub2 arg0, int arg1) {
		try {
			int var3 = arg0.readUnsignedByteC(-243015761);
			if (var3 == 1) {
				this.aClass310_3066 = OutgoingPacketManager.aClass310_3209;
			} else if (var3 == 2) {
				this.aClass310_3066 = OutgoingPacketManager.aClass310_3214;
			} else if (var3 == 3) {
				this.aClass310_3066 = OutgoingPacketManager.aClass310_3211;
			} else if (var3 == 4) {
				this.aClass310_3066 = OutgoingPacketManager.aClass310_3208;
			}
			int var4 = arg0.readUnsignedLEShortA(623241511);
			int var5 = arg0.readUnsignedByteS(-400233324);
			boolean var6 = (var5 & 0x1) != 0;
			int var7 = arg0.readUnsignedByte(578584919);
			int var8 = arg0.readUnsignedShortA((byte) -17);
			if (!this.aBoolean3103) {
				this.method3013(-421274603);
			}
			this.method3012(Class103.method1230(var7, 1893328996), 228549929);
			arg0.method3820(894025231);
			int var9;
			int var10;
			int var11;
			int var12;
			for (var9 = 0; var9 < 4; var9++) {
				for (var10 = 0; var10 < this.anInt3108 >> 3; var10++) {
					for (var11 = 0; var11 < this.anInt3076 >> 3; var11++) {
						var12 = arg0.readBits(1);
						if (var12 == 1) {
							this.anIntArrayArrayArray3086[var9][var10][var11] = arg0.readBits(26);
						} else {
							this.anIntArrayArrayArray3086[var9][var10][var11] = -1;
						}
					}
				}
			}
			arg0.method3824(742824106);
			var9 = (arg0.payload.length - arg0.offset) / 16;
			this.anIntArrayArray3102 = new int[var9][4];
			for (var10 = 0; var10 < var9; var10++) {
				for (var11 = 0; var11 < 4; var11++) {
					this.anIntArrayArray3102[var10][var11] = arg0.readInt((byte) 60);
				}
			}
			this.anIntArray3067 = new int[var9];
			this.anIntArray3097 = new int[var9];
			this.anIntArray3075 = new int[var9];
			this.anIntArray3099 = null;
			this.aByteArrayArray3096 = new byte[var9][];
			this.aByteArrayArray3104 = new byte[var9][];
			this.aByteArrayArray3105 = null;
			this.anIntArray3107 = new int[var9];
			this.anIntArray3101 = new int[var9];
			this.aByteArrayArray3106 = new byte[var9][];
			this.aByteArrayArray3092 = new byte[var9][];
			var9 = 0;
			for (var10 = 0; var10 < 4; var10++) {
				for (var11 = 0; var11 < this.anInt3108 >> 3; var11++) {
					for (var12 = 0; var12 < this.anInt3076 >> 3; var12++) {
						int var13 = this.anIntArrayArrayArray3086[var10][var11][var12];
						if (var13 != -1) {
							int var14 = var13 >> 14 & 0x3FF;
							int var15 = var13 >> 3 & 0x7FF;
							int var16 = var15 / 8 + (var14 / 8 << 8);
							int var17;
							for (var17 = 0; var17 < var9; var17++) {
								if (var16 == this.anIntArray3067[var17]) {
									var16 = -1;
									break;
								}
							}
							if (var16 != -1) {
								this.anIntArray3067[var9] = var16;
								var17 = var16 >> 8 & 0xFF;
								int var18 = var16 & 0xFF;
								this.anIntArray3097[var9] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, false, var17, var18, (byte) 4), 323600977);
								this.anIntArray3075[var9] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, false, var17, var18, (byte) 4), 323600977);
								this.anIntArray3107[var9] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, true, var17, var18, (byte) 4), 323600977);
								this.anIntArray3101[var9] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, true, var17, var18, (byte) 4), 323600977);
								var9++;
							}
						}
					}
				}
			}
			this.method3014(var8, var4, 16, var6, (byte) 5);
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "mr.aj(" + ')');
		}
	}

	public void method3011(Class274_Sub1 arg0, byte[][] arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < arg0.anInt2774; var4++) {
				if (!this.aBoolean3103) {
					Class233.method2362((byte) 24);
				}
				for (int var5 = 0; var5 < this.anInt3108 >> 3; var5++) {
					for (int var6 = 0; var6 < this.anInt3076 >> 3; var6++) {
						int var7 = this.anIntArrayArrayArray3086[var4][var5][var6];
						if (var7 != -1) {
							int var8 = var7 >> 24 & 0x3;
							if (!arg0.aBoolean2777 || var8 == 0) {
								int var9 = var7 >> 1 & 0x3;
								int var10 = var7 >> 14 & 0x3FF;
								int var11 = var7 >> 3 & 0x7FF;
								int var12 = var11 / 8 + (var10 / 8 << 8);
								for (int var13 = 0; var13 < this.anIntArray3067.length; var13++) {
									if (var12 == this.anIntArray3067[var13] && arg1[var13] != null) {
										arg0.method2712(Class361.aClass_ra3793, arg1[var13], var4, var5 * 8, var6 * 8, var8, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var9, this.aClass307Array3087, -295315817);
										break;
									}
								}
							}
						}
						if (this.aBoolean3103) {
							this.method3018(5, -824780886);
						}
					}
				}
			}
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "mr.ar(" + ')');
		}
	}

	public void method3012(Class134 arg0, int arg1) {
		try {
			if (arg0 != this.aClass134_3077) {
				this.anInt3108 = this.anInt3076 = arg0.anInt1511;
				this.anIntArrayArrayArray3086 = new int[4][this.anInt3108 >> 3][this.anInt3076 >> 3];
				this.anIntArrayArray3088 = new int[this.anInt3108][this.anInt3076];
				this.anIntArrayArray3089 = new int[this.anInt3108][this.anInt3076];
				for (int var3 = 0; var3 < 4; var3++) {
					this.aClass307Array3087[var3] = Class123.method1505(this.anInt3108, this.anInt3076, 1219541411);
				}
				this.aByteArrayArrayArray3090 = new byte[4][this.anInt3108][this.anInt3076];
				this.aClass281_3079 = new Class281(4, this.anInt3108, this.anInt3076);
				this.method3005(1944727347);
				this.aClass134_3077 = arg0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.an(" + ')');
		}
	}

	public void method3013(int arg0) {
		try {
			if (OutgoingPacketManager.aClass310_3212 != this.aClass310_3066 && OutgoingPacketManager.aClass310_3212 != this.aClass310_3083) {
				if (this.aClass310_3066 == OutgoingPacketManager.aClass310_3209 || this.aClass310_3066 == OutgoingPacketManager.aClass310_3211 || this.aClass310_3066 != this.aClass310_3083 && (this.aClass310_3066 == OutgoingPacketManager.aClass310_3210 || OutgoingPacketManager.aClass310_3210 == this.aClass310_3083)) {
					client.anInt9017 = 0;
					client.anInt9232 = 0;
					client.aClass497_9014.method6100(65280);
				}
				this.aClass310_3083 = this.aClass310_3066;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.af(" + ')');
		}
	}

	public void method3014(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
		try {
			if (client.anInt8987 == 1) {
				if (this.aBoolean3103) {
					throw new IllegalStateException();
				}
				client.anInt8987 = 2;
				client.anInt9265 = -1;
			}
			if (arg3 || arg0 != this.anInt3073 || this.anInt3074 != arg1) {
				this.anInt3073 = arg0;
				this.anInt3074 = arg1;
				if (!this.aBoolean3103) {
					Class227.method2311(arg2, -1188873169);
					Class95_Sub22.method1175(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -468374783);
				}
				if (this.aClass381_3071 == null) {
					this.aClass381_3072 = new Class381(0, 0, 0);
				} else {
					this.aClass381_3072 = this.aClass381_3071;
				}
				this.aClass381_3071 = new Class381(0, (this.anInt3073 - (this.anInt3108 >> 4)) * 8, (this.anInt3074 - (this.anInt3076 >> 4)) * 8);
				this.aClass330_Sub36_Sub12_3082 = Class354.method4100(this.aClass381_3071.gameSceneBaseX, this.aClass381_3071.gameSceneBaseY);
				this.aClass351_3094 = null;
				if (!this.aBoolean3103) {
					this.method3015(arg2, 1581007294);
				}
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "mr.aq(" + ')');
		}
	}

	public void method3015(int arg0, int arg1) {
		try {
			int var3 = this.aClass381_3071.gameSceneBaseX - this.aClass381_3072.gameSceneBaseX;
			int var4 = this.aClass381_3071.gameSceneBaseY - this.aClass381_3072.gameSceneBaseY;
			int var5;
			int var8;
			int var16;
			int var18;
			if (arg0 == 16) {
				for (var5 = 0; var5 < client.anInt9232; var5++) {
					Class330_Sub35 var6 = client.aClass330_Sub35Array9015[var5];
					if (var6 != null) {
						NPC var7 = (NPC) var6.anObject7733;
						for (var8 = 0; var8 < var7.anIntArray10018.length; var8++) {
							var7.anIntArray10018[var8] -= var3;
							var7.anIntArray10059[var8] -= var4;
						}
						Class260 var22 = Class260.method2549(var7.method5346().aClass260_2606);
						var22.aFloat2716 -= var3 * 512;
						var22.aFloat2711 -= var4 * 512;
						var7.method5349(var22);
						var22.method2550();
					}
				}
			} else {
				boolean var15 = false;
				client.anInt9017 = 0;
				var16 = this.anInt3108 * 512 - 512;
				var18 = this.anInt3076 * 512 - 512;
				for (var8 = 0; var8 < client.anInt9232; var8++) {
					Class330_Sub35 var9 = client.aClass330_Sub35Array9015[var8];
					if (var9 != null) {
						NPC var10 = (NPC) var9.anObject7733;
						Class260 var11 = Class260.method2549(var10.method5346().aClass260_2606);
						var11.aFloat2716 -= var3 * 512;
						var11.aFloat2711 -= var4 * 512;
						var10.method5349(var11);
						if ((int) var11.aFloat2716 >= 0 && (int) var11.aFloat2716 <= var16 && (int) var11.aFloat2711 >= 0 && (int) var11.aFloat2711 <= var18) {
							boolean var12 = true;
							for (int var13 = 0; var13 < var10.anIntArray10018.length; var13++) {
								var10.anIntArray10018[var13] -= var3;
								var10.anIntArray10059[var13] -= var4;
								if (var10.anIntArray10018[var13] < 0 || var10.anIntArray10018[var13] >= this.anInt3108 || var10.anIntArray10059[var13] < 0 || var10.anIntArray10059[var13] >= this.anInt3076) {
									var12 = false;
								}
							}
							if (var12) {
								client.anIntArray9018[++client.anInt9017 - 1] = var10.anInt10008;
							} else {
								var10.method5475(null, 1918950667);
								var9.method3252(-359845100);
								var15 = true;
							}
						} else {
							var10.method5475(null, 1918950667);
							var9.method3252(1117404046);
							var15 = true;
						}
						var11.method2550();
					}
				}
				if (var15) {
					client.anInt9232 = client.aClass497_9014.method6096(-36658531);
					var8 = 0;
					Iterator var25 = client.aClass497_9014.iterator();
					while (var25.hasNext()) {
						Class330_Sub35 var27 = (Class330_Sub35) var25.next();
						client.aClass330_Sub35Array9015[var8++] = var27;
					}
				}
			}
			for (var5 = 0; var5 < 2048; var5++) {
				Player var17 = client.players[var5];
				if (var17 != null) {
					for (var18 = 0; var18 < var17.anIntArray10018.length; var18++) {
						var17.anIntArray10018[var18] -= var3;
						var17.anIntArray10059[var18] -= var4;
					}
					Class260 var21 = Class260.method2549(var17.method5346().aClass260_2606);
					var21.aFloat2716 -= var3 * 512;
					var21.aFloat2711 -= var4 * 512;
					var17.method5349(var21);
					var21.method2550();
				}
			}
			Class3[] var19 = client.aClass3Array8986;
			for (var16 = 0; var16 < var19.length; var16++) {
				Class3 var23 = var19[var16];
				if (var23 != null) {
					var23.anInt51 -= var3 * 512;
					var23.anInt50 -= var4 * 512;
				}
			}
			Class330_Sub10 var20;
			for (var20 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854); var20 != null; var20 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -76)) {
				var20.anInt7582 -= var3;
				var20.anInt7577 -= var4;
				if (this.aClass310_3066 != OutgoingPacketManager.aClass310_3208 && (var20.anInt7582 < 0 || var20.anInt7577 < 0 || var20.anInt7582 >= this.anInt3108 || var20.anInt7577 >= this.anInt3076)) {
					var20.method3252(141600088);
				}
			}
			for (var20 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854); var20 != null; var20 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -94)) {
				var20.anInt7582 -= var3;
				var20.anInt7577 -= var4;
				if (this.aClass310_3066 != OutgoingPacketManager.aClass310_3208 && (var20.anInt7582 < 0 || var20.anInt7577 < 0 || var20.anInt7582 >= this.anInt3108 || var20.anInt7577 >= this.anInt3076)) {
					var20.method3252(-1462156832);
				}
			}
			for (Class330_Sub9 var24 = (Class330_Sub9) client.aClass497_9138.method6099((byte) -13); var24 != null; var24 = (Class330_Sub9) client.aClass497_9138.method6098((short) -32768)) {
				var18 = (int) (var24.aLong3341 >> 28 & 0x3L);
				var8 = (int) (var24.aLong3341 & 0x3FFFL);
				int var26 = var8 - this.aClass381_3071.gameSceneBaseX;
				int var28 = (int) (var24.aLong3341 >> 14 & 0x3FFFL);
				int var29 = var28 - this.aClass381_3071.gameSceneBaseY;
				if (this.aClass356_3100 != null) {
					if (var26 >= 0 && var29 >= 0 && var26 < this.anInt3108 && var29 < this.anInt3076 && var26 < this.aClass356_3100.anInt3667 && var29 < this.aClass356_3100.anInt3654) {
						if (this.aClass356_3100.aClass340ArrayArrayArray3653 != null) {
							this.aClass356_3100.method4151(var18, var26, var29, -1355719328);
						}
					} else if (OutgoingPacketManager.aClass310_3208 != this.aClass310_3066) {
						var24.method3252(-1716082395);
					}
				}
			}
			if (Class9.anInt146 != 0) {
				Class9.anInt146 -= var3;
				Class9.anInt151 -= var4;
			}
			Class562.method6472((byte) 0);
			Class481.method6020(false, 1031914129);
			if (arg0 == 16) {
				client.anInt9068 -= var3 * 512;
				client.anInt9069 -= var4 * 512;
				IndexTable.anInt2906 -= var3 * 512;
				Class308.anInt3194 -= var4 * 512;
				if (Class147.anInt1621 != 5) {
					Class147.anInt1621 = 4;
					Class439.anInt4456 = -1;
					Class457.anInt6844 = -1;
				}
			} else {
				Class204_Sub1.anInt8947 -= var3;
				Class151.anInt6671 -= var4;
				Class150_Sub2.anInt7270 -= var3;
				Class330_Sub39.anInt7766 -= var4;
				Class471.anInt5612 -= var3 * 512;
				Class325_Sub3.anInt7484 -= var4 * 512;
				if (Math.abs(var3) > this.anInt3108 || Math.abs(var4) > this.anInt3076) {
					this.aClass389_3068.method4582(-426326148);
				}
			}
			Class330_Sub14.method3319((byte) 0);
			Class_ta.method5674((byte) 1);
			client.aClass497_9216.method6100(65280);
			client.aClass471_9139.method5866(613065745);
			client.aClass467_9061.method5851(65536);
			Class491.method6075(-1676046053);
		} catch (RuntimeException var14) {
			throw Class476.method5964(var14, "mr.aa(" + ')');
		}
	}

	public void method3016(int arg0) {
		try {
			this.aClass274_Sub1_3069 = null;
			this.aClass274_Sub1_3070 = null;
			for (int var2 = 0; var2 < 4; var2++) {
				if (this.aClass307Array3087[var2] != null) {
					this.aClass307Array3087[var2].method3067(1980764775);
				}
			}
			if (this.aClass281_3079 != null) {
				this.aClass281_3079.method2785((byte) 0);
			}
			if (this.aClass389_3068 != null) {
				this.aClass389_3068.method4591(-2057764547);
			}
			if (this.aClass356_3100 != null) {
				this.aClass356_3100.aClass338_3697.method3959((byte) 0);
				this.aClass356_3100 = null;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.ab(" + ')');
		}
	}

	public boolean method3017(int arg0) {
		try {
			if (!this.aBoolean3103) {
				Class475.method5944(false, -1503225972);
			}
			this.anInt3110 = 0;
			int var2;
			for (var2 = 0; var2 < this.aByteArrayArray3096.length; var2++) {
				if (this.anIntArray3097[var2] != -1 && this.aByteArrayArray3096[var2] == null) {
					this.aByteArrayArray3096[var2] = ItemDefinitions.aClass280_6752.getFile(this.anIntArray3097[var2], 0);
					if (this.aByteArrayArray3096[var2] == null) {
						this.anInt3110++;
					}
				}
				if (this.anIntArray3075[var2] != -1 && this.aByteArrayArray3104[var2] == null) {
					this.aByteArrayArray3104[var2] = ItemDefinitions.aClass280_6752.method2756(this.anIntArray3075[var2], 0, this.anIntArrayArray3102[var2], -1666669322);
					if (this.aByteArrayArray3104[var2] == null) {
						this.anInt3110++;
					}
				}
				if (this.anIntArray3107[var2] != -1 && this.aByteArrayArray3106[var2] == null) {
					this.aByteArrayArray3106[var2] = ItemDefinitions.aClass280_6752.getFile(this.anIntArray3107[var2], 0);
					if (this.aByteArrayArray3106[var2] == null) {
						this.anInt3110++;
					}
				}
				if (this.anIntArray3101[var2] != -1 && this.aByteArrayArray3092[var2] == null) {
					this.aByteArrayArray3092[var2] = ItemDefinitions.aClass280_6752.getFile(this.anIntArray3101[var2], 0);
					if (this.aByteArrayArray3092[var2] == null) {
						this.anInt3110++;
					}
				}
				if (this.anIntArray3099 != null && this.aByteArrayArray3105[var2] == null && this.anIntArray3099[var2] != -1) {
					this.aByteArrayArray3105[var2] = ItemDefinitions.aClass280_6752.method2756(this.anIntArray3099[var2], 0, this.anIntArrayArray3102[var2], 1046571839);
					if (this.aByteArrayArray3105[var2] == null) {
						this.anInt3110++;
					}
				}
			}
			if (this.aClass351_3094 == null) {
				if (this.aClass330_Sub36_Sub12_3082 == null || !Class434.aClass280_6560.method2769(this.aClass330_Sub36_Sub12_3082.mapLocation + "_staticelements", -1423601887)) {
					this.aClass351_3094 = new Class351(0);
				} else if (Class434.aClass280_6560.method2773(this.aClass330_Sub36_Sub12_3082.mapLocation + "_staticelements", 1375995397)) {
					this.aClass351_3094 = Class434.method5563(Class434.aClass280_6560, this.aClass330_Sub36_Sub12_3082.mapLocation + "_staticelements", client.aBoolean9123, (byte) 0);
				} else {
					this.anInt3110++;
				}
			}
			if (this.anInt3110 > 0) {
				if (this.anInt3093 < this.anInt3110) {
					this.anInt3093 = this.anInt3110;
				}
				this.aClass270_3091 = Class270.aClass270_2749;
				return false;
			}
			this.anInt3078 = 0;
			int var5;
			int var6;
			for (var2 = 0; var2 < this.aByteArrayArray3096.length; var2++) {
				byte[] var3 = this.aByteArrayArray3104[var2];
				int var4;
				if (var3 != null) {
					var4 = (this.anIntArray3067[var2] >> 8) * 64 - this.aClass381_3071.gameSceneBaseX;
					var5 = (this.anIntArray3067[var2] & 0xFF) * 64 - this.aClass381_3071.gameSceneBaseY;
					if (this.aClass310_3066.method3098((byte) 101)) {
						var4 = 10;
						var5 = 10;
					}
					var6 = Class144.method1670(this.aClass463_3081, var3, var4, var5, this.anInt3108, this.anInt3076, (byte) 23);
					if (var6 > 0) {
						this.anInt3078 += var6;
					}
				}
				var3 = this.aByteArrayArray3092[var2];
				if (var3 != null) {
					var4 = (this.anIntArray3067[var2] >> 8) * 64 - this.aClass381_3071.gameSceneBaseX;
					var5 = (this.anIntArray3067[var2] & 0xFF) * 64 - this.aClass381_3071.gameSceneBaseY;
					if (this.aClass310_3066.method3098((byte) 60)) {
						var4 = 10;
						var5 = 10;
					}
					var6 = Class144.method1670(this.aClass463_3081, var3, var4, var5, this.anInt3108, this.anInt3076, (byte) 57);
					if (var6 > 0) {
						this.anInt3078 += var6;
					}
				}
			}
			if (this.anInt3078 > 0) {
				if (this.anInt3095 < this.anInt3078) {
					this.anInt3095 = this.anInt3078;
				}
				this.aClass270_3091 = Class270.aClass270_2750;
				return false;
			}
			if (!this.aBoolean3103 && this.aClass270_3091 != Class270.aClass270_2751) {
				Class95_Sub22.method1175(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434) + Class215.aString2084 + "(100%)", true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, 20991783);
			}
			this.aClass270_3091 = Class270.aClass270_2752;
			if (!this.aBoolean3103) {
				Class233.method2362((byte) 108);
			}
			if (!this.aBoolean3103) {
				for (var2 = 0; var2 < 2048; var2++) {
					Player var16 = client.players[var2];
					if (var16 != null) {
						var16.aClass356_8655 = null;
					}
				}
				for (var2 = 0; var2 < client.aClass330_Sub35Array9015.length; var2++) {
					Class330_Sub35 var17 = client.aClass330_Sub35Array9015[var2];
					if (var17 != null) {
						((Class432_Sub1) var17.anObject7733).aClass356_8655 = null;
					}
				}
			}
			if (!this.aBoolean3103) {
				Class50.method632(true, (byte) 58);
			}
			if (!this.aBoolean3103) {
				Class479.method6012((byte) 89);
			}
			boolean var19 = false;
			int var18;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2) {
				for (var18 = 0; var18 < this.aByteArrayArray3096.length; var18++) {
					if (this.aByteArrayArray3092[var18] != null || this.aByteArrayArray3106[var18] != null) {
						var19 = true;
						break;
					}
				}
			}
			var18 = Class325_Sub4.method3226(Class448.aClass330_Sub50_5555.aClass464_Sub19_7876.method5804((short) 878), (byte) 1).anInt1616 * 8;
			if (Class361.aClass_ra3793.at()) {
				var18++;
			}
			this.method3006(-54076957);
			this.method3016(-1009803501);
			this.aClass356_3100 = new Class356(Class361.aClass_ra3793, 9, 4, this.anInt3108, this.anInt3076, var18, var19, Class361.aClass_ra3793.cr() > 0);
			this.aClass356_3100.method4134(false, (byte) 87);
			this.aClass356_3100.method4132(client.anInt8993, 590937471);
			if (client.anInt8993 == 0) {
				this.aClass356_3100.method4133(null, (byte) 1);
			} else {
				this.aClass356_3100.method4133(Class125.aClass263_1454, (byte) 1);
			}
			this.aClass312_3084 = new Class312();
			this.aFloat3085 = -0.05F + (float) (Math.random() / 10.0D);
			this.aClass274_Sub1_3070 = new Class274_Sub1(this.aClass356_3100, this.aClass463_3081, 4, this.anInt3108, this.anInt3076, false, this.aClass281_3079, this.aClass389_3068);
			this.aClass274_Sub1_3070.method2684(-649324936);
			this.aClass274_Sub1_3070.anInt2769 = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(719119529);
			this.aClass274_Sub1_3070.aBoolean2778 = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2;
			this.aClass274_Sub1_3070.aBoolean2771 = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1;
			this.aClass274_Sub1_3070.aBoolean2772 = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5833(16777215) == 1;
			this.aClass274_Sub1_3070.aBoolean2773 = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1200271171) == 1;
			if (this.aClass310_3066.method3098((byte) 25)) {
				this.method3030(this.aClass274_Sub1_3070, this.aByteArrayArray3096, -2081508232);
			} else {
				this.method3019(this.aClass274_Sub1_3070, this.aByteArrayArray3096, (byte) 1);
			}
			if (this.aBoolean3103) {
				this.method3018(50, -824780886);
			}
			this.aClass389_3068.method4590(this.anInt3108 >> 4, this.anInt3076 >> 4, (byte) -26);
			this.aClass389_3068.method4589(this, 1937805770);
			if (var19) {
				this.aClass356_3100.method4134(true, (byte) 118);
				this.aClass274_Sub1_3069 = new Class274_Sub1(this.aClass356_3100, this.aClass463_3081, 1, this.anInt3108, this.anInt3076, true, this.aClass281_3079, this.aClass389_3068);
				this.aClass274_Sub1_3069.method2684(-649324936);
				this.aClass274_Sub1_3069.anInt2769 = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(934517496);
				this.aClass274_Sub1_3069.aBoolean2778 = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2;
				this.aClass274_Sub1_3069.aBoolean2771 = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1;
				this.aClass274_Sub1_3069.aBoolean2772 = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5833(16777215) == 1;
				this.aClass274_Sub1_3069.aBoolean2773 = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1169857314) == 1;
				if (this.aClass310_3066.method3098((byte) 27)) {
					this.method3030(this.aClass274_Sub1_3069, this.aByteArrayArray3106, -2081508232);
					if (!this.aBoolean3103) {
						Class475.method5944(true, -1503225972);
					}
				} else {
					this.method3019(this.aClass274_Sub1_3069, this.aByteArrayArray3106, (byte) 1);
					if (!this.aBoolean3103) {
						Class475.method5944(true, -1503225972);
					}
				}
				this.aClass274_Sub1_3069.method2690(0, this.aClass274_Sub1_3070.anIntArrayArrayArray2793[0], 742260464);
				this.aClass274_Sub1_3069.method2691(Class361.aClass_ra3793, null, null, 713445039);
				this.aClass356_3100.method4134(false, (byte) 24);
				if (this.aBoolean3103) {
					this.method3018(50, -824780886);
				}
			}
			this.aClass274_Sub1_3070.method2691(Class361.aClass_ra3793, var19 ? this.aClass274_Sub1_3069.anIntArrayArrayArray2793 : (int[][][]) null, this.aClass307Array3087, 713445039);
			if (this.aClass310_3066.method3098((byte) 70)) {
				if (!this.aBoolean3103) {
					Class475.method5944(true, -1503225972);
				}
				this.method3011(this.aClass274_Sub1_3070, this.aByteArrayArray3104, -2036852831);
			} else {
				if (!this.aBoolean3103) {
					Class475.method5944(true, -1503225972);
				}
				this.method3021(this.aClass274_Sub1_3070, this.aByteArrayArray3104, -270218177);
				if (this.aByteArrayArray3105 != null) {
					this.method3020((short) -21957);
				}
			}
			if (!this.aBoolean3103) {
				Class475.method5944(true, -1503225972);
			}
			this.aClass274_Sub1_3070.method2692(Class361.aClass_ra3793, var19 ? this.aClass356_3100.aClass_xaArray3658[0] : null, null, -336472512);
			if (this.aBoolean3103) {
				this.method3018(75, -824780886);
			}
			this.aClass274_Sub1_3070.method2710(Class361.aClass_ra3793, false, (byte) 0);
			if (this.aBoolean3103) {
				this.method3018(75, -824780886);
			}
			if (!this.aBoolean3103) {
				Class475.method5944(true, -1503225972);
			}
			if (var19) {
				this.aClass356_3100.method4134(true, (byte) 32);
				if (!this.aBoolean3103) {
					Class475.method5944(true, -1503225972);
				}
				if (this.aClass310_3066.method3098((byte) 104)) {
					this.method3011(this.aClass274_Sub1_3069, this.aByteArrayArray3092, -2005371185);
				} else {
					this.method3021(this.aClass274_Sub1_3069, this.aByteArrayArray3092, -621308179);
				}
				if (!this.aBoolean3103) {
					Class475.method5944(true, -1503225972);
				}
				this.aClass274_Sub1_3069.method2692(Class361.aClass_ra3793, null, this.aClass356_3100.aClass_xaArray3701[0], 200434880);
				this.aClass274_Sub1_3069.method2710(Class361.aClass_ra3793, true, (byte) 0);
				if (!this.aBoolean3103) {
					Class475.method5944(true, -1503225972);
				}
				this.aClass356_3100.method4134(false, (byte) 7);
				if (this.aBoolean3103) {
					this.method3018(50, -824780886);
				}
			}
			this.aClass274_Sub1_3070.method2685(411186681);
			if (this.aClass274_Sub1_3069 != null) {
				this.aClass274_Sub1_3069.method2685(411186681);
			}
			this.aClass356_3100.method4135((byte) 5);
			if (this.aBoolean3103) {
				Class312.method3111((byte) 66);
				while (!Class361.aClass_ra3793.method4790((byte) -86)) {
					this.method3018(1, -824780886);
				}
			}
			boolean var20 = false;
			if (this.aBoolean3103) {
				Class304 var22 = client.aClass304_9030;
				this.method3007(var22, (byte) -20);
				Class43.aClass276_10073.method2722(var22, 1686232468);
				var20 = true;
				Class312.method3111((byte) 43);
				Object var21 = client.anObject9081;
				synchronized (client.anObject9081) {
					client.aBoolean9031 = true;
					try {
						client.anObject9081.wait();
					} catch (InterruptedException var13) {
					}
				}
				client.aClass304_9030 = this;
				var22.method3016(-160596144);
				this.method3015(16, 1972528594);
				this.method3013(-421274603);
			} else {
				Class233.method2362((byte) -84);
				this.aClass389_3068.method4583(-1560304679);
				Class376.method4367((byte) 3);
			}
			int var7;
			for (var5 = 0; var5 < 4; var5++) {
				for (var6 = 0; var6 < this.anInt3108; var6++) {
					for (var7 = 0; var7 < this.anInt3076; var7++) {
						Class343.method4001(var5, var6, var7, -334637075);
					}
				}
			}
			for (var5 = 0; var5 < client.aClass327Array8999.length; var5++) {
				if (client.aClass327Array8999[var5] != null) {
					client.aClass327Array8999[var5].method3233(this.aClass356_3100, (byte) 0);
				}
			}
			Class282.method2812(1470552195);
			Class305.method3048((byte) 53);
			Class330_Sub34 var23;
			if (Class147.method1739((byte) -48) == Class331.aClass331_3343 && client.aClass1_9025.method380(-1551151736) != null && client.anInt8995 == 16) {
				var23 = Class238.method2377(OutgoingPacket.aClass234_2476, client.aClass1_9025.aClass488_22, -490531725);
				var23.aClass330_Sub46_Sub2_7729.addInt(1057001181, 1965508160);
				client.aClass1_9025.method378(var23, -2127987691);
			}
			if (!this.aClass310_3066.method3098((byte) 52)) {
				var5 = (this.anInt3073 - (this.anInt3108 >> 4)) / 8;
				var6 = (this.anInt3073 + (this.anInt3108 >> 4)) / 8;
				var7 = (this.anInt3074 - (this.anInt3076 >> 4)) / 8;
				int var8 = ((this.anInt3076 >> 4) + this.anInt3074) / 8;
				for (int var9 = var5 - 1; var9 <= var6 + 1; var9++) {
					for (int var10 = var7 - 1; var10 <= var8 + 1; var10++) {
						if (var9 < var5 || var9 > var6 || var10 < var7 || var10 > var8) {
							ItemDefinitions.aClass280_6752.method2774(this.method3024(true, false, var9, var10, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(this.method3024(false, false, var9, var10, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(this.method3024(true, true, var9, var10, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(this.method3024(false, true, var9, var10, (byte) 4), 2065037001);
						} else if (arg0 != 186314141) {
						}
					}
				}
			}
			if (client.anInt8995 == 5) {
				Class227.method2311(6, -1188873169);
			} else if (client.anInt8995 == 19) {
				Class227.method2311(15, -1188873169);
			} else if (client.anInt8995 == 7) {
				Class227.method2311(11, -1188873169);
			} else if (client.anInt8995 == 17) {
				Class227.method2311(14, -1188873169);
			} else {
				Class227.method2311(1, -1188873169);
				if (client.aClass1_9025.method380(-957829122) != null) {
					var23 = Class238.method2377(OutgoingPacket.REGION_UPDATE_PACKET, client.aClass1_9025.aClass488_22, -544451447);
					client.aClass1_9025.method378(var23, -927877476);
				}
			}
			Class421.method5293((byte) 120);
			if (this.aBoolean3098) {
				Class56.panelBoxMessage(Long.toString(Class312.method3111((byte) 111) - this.aLong3109), -1728185520);
				this.aBoolean3098 = false;
			}
			if (var20) {
				Object var24 = client.anObject9032;
				synchronized (client.anObject9032) {
					client.anObject9032.notify();
				}
			}
			return true;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "mr.ak(" + ')');
		}
	}

	public void method3018(int arg0, int arg1) {
		try {
			try {
				Thread.sleep((long) arg0);
			} catch (InterruptedException var4) {
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mr.ag(" + ')');
		}
	}

	public void method3019(Class274_Sub1 arg0, byte[][] arg1, byte arg2) {
		try {
			int var4 = arg1.length;
			int var5;
			for (var5 = 0; var5 < var4; var5++) {
				byte[] var6 = arg1[var5];
				if (var6 != null) {
					Buffer var7 = new Buffer(var6);
					int var8 = this.anIntArray3067[var5] >> 8;
					int var9 = this.anIntArray3067[var5] & 0xFF;
					int var10 = var8 * 64 - this.aClass381_3071.gameSceneBaseX;
					int var11 = var9 * 64 - this.aClass381_3071.gameSceneBaseY;
					if (!this.aBoolean3103) {
						Class233.method2362((byte) 2);
					}
					arg0.method2688(var7, var10, var11, this.aClass381_3071.gameSceneBaseX, this.aClass381_3071.gameSceneBaseY, this.aClass307Array3087, (byte) -21);
					arg0.method2707(Class361.aClass_ra3793, var7, var10, var11, (byte) 1);
				}
			}
			for (var5 = 0; var5 < var4; var5++) {
				int var13 = (this.anIntArray3067[var5] >> 8) * 64 - this.aClass381_3071.gameSceneBaseX;
				int var14 = (this.anIntArray3067[var5] & 0xFF) * 64 - this.aClass381_3071.gameSceneBaseY;
				byte[] var15 = arg1[var5];
				if (var15 == null && this.anInt3074 < 800) {
					if (!this.aBoolean3103) {
						Class233.method2362((byte) 20);
					}
					arg0.method2686(var13, var14, 64, 64, 1540852282);
				}
			}
		} catch (RuntimeException var12) {
			throw Class476.method5964(var12, "mr.az(" + ')');
		}
	}

	public void method3020(short arg0) {
		try {
			int var2 = this.aByteArrayArray3105.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (this.aByteArrayArray3105[var3] != null) {
					int var4 = -1;
					for (int var5 = 0; var5 < client.anInt9035; var5++) {
						if (this.anIntArray3067[var3] == client.anIntArray9034[var5]) {
							var4 = var5;
							break;
						}
					}
					if (var4 == -1) {
						client.anIntArray9034[client.anInt9035] = this.anIntArray3067[var3];
						var4 = ++client.anInt9035 - 1;
					}
					Buffer var19 = new Buffer(this.aByteArrayArray3105[var3]);
					int var6 = 0;
					while (var19.offset < this.aByteArrayArray3105[var3].length && var6 < 511) {
						if (client.anInt9017 >= 1023) {
							if (arg0 >= 8192) {
								throw new IllegalStateException();
							}
							break;
						}
						int var7 = var4 | var6++ << 6;
						int var8 = var19.readUnsignedShort(117886083);
						int var9 = var8 >> 14;
						int var10 = var8 >> 7 & 0x3F;
						int var11 = var8 & 0x3F;
						int var12 = (this.anIntArray3067[var3] >> 8) * 64 - this.aClass381_3071.gameSceneBaseX + var10;
						int var13 = var11 + ((this.anIntArray3067[var3] & 0xFF) * 64 - this.aClass381_3071.gameSceneBaseY);
						Class551 var14 = Class158_Sub3.aClass553_8875.method6392(var19.readUnsignedShort(545001925), -903488850);
						Class330_Sub35 var15 = (Class330_Sub35) client.aClass497_9014.method6094((long) var7);
						if (var15 == null && (var14.aByte6322 & 0x1) > 0 && var12 >= 0 && var12 + var14.anInt6295 < this.anInt3108 && var13 >= 0 && var13 + var14.anInt6295 < this.anInt3076) {
							NPC var16 = new NPC(this.aClass356_3100);
							var16.anInt10008 = var7;
							Class330_Sub35 var17 = new Class330_Sub35(var16);
							client.aClass497_9014.method6097(var17, (long) var7);
							client.aClass330_Sub35Array9015[++client.anInt9232 - 1] = var17;
							client.anIntArray9018[++client.anInt9017 - 1] = var7;
							var16.anInt10069 = client.anInt8981;
							var16.method5475(var14, 1918950667);
							var16.method5420(var16.aClass551_10251.anInt6295, (short) -18855);
							var16.anInt10051 = var16.aClass551_10251.anInt6325 << 3;
							var16.method5411(var16.aClass551_10251.aClass293_6315.method2912((byte) -94).method297((short) -16073) << 11 & 0x3FFF, true, 272541087);
							var16.method5478(var9, var12, var13, true, var16.method5453(-954851024), -1737258822);
						}
					}
				} else if (arg0 >= 8192) {
					throw new IllegalStateException();
				}
			}
		} catch (RuntimeException var18) {
			throw Class476.method5964(var18, "mr.am(" + ')');
		}
	}

	public void method3021(Class274_Sub1 arg0, byte[][] arg1, int arg2) {
		try {
			int var4 = this.aByteArrayArray3096.length;
			for (int var5 = 0; var5 < var4; var5++) {
				byte[] var6 = arg1[var5];
				if (var6 != null) {
					int var7 = (this.anIntArray3067[var5] >> 8) * 64 - this.aClass381_3071.gameSceneBaseX;
					int var8 = (this.anIntArray3067[var5] & 0xFF) * 64 - this.aClass381_3071.gameSceneBaseY;
					if (!this.aBoolean3103) {
						Class233.method2362((byte) 21);
					}
					arg0.method2709(Class361.aClass_ra3793, var6, var7, var8, this.aClass307Array3087, 714454992);
					if (this.aBoolean3103) {
						this.method3018(10, -824780886);
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "mr.av(" + ')');
		}
	}

	public Class381 method3022(int arg0) {
		try {
			return this.aClass381_3071;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.o(" + ')');
		}
	}

	public Class356 method3023(int arg0) {
		try {
			return this.aClass356_3100;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.k(" + ')');
		}
	}

	public String method3024(boolean arg0, boolean arg1, int arg2, int arg3, byte arg4) {
		try {
			String var6 = "";
			if (arg0) {
				var6 = var6 + "m" + arg2 + '_' + arg3;
			} else {
				var6 = var6 + "l" + arg2 + '_' + arg3;
			}
			if (arg1) {
				var6 = 'u' + var6;
			}
			return var6;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "mr.ad(" + ')');
		}
	}

	public Class463 method3025(byte arg0) {
		try {
			return this.aClass463_3081;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.d(" + ')');
		}
	}

	public void method3026(Class300 arg0, int arg1) {
		try {
			this.aClass310_3066 = arg0.aClass310_3057;
			if (OutgoingPacketManager.aClass310_3215 == this.aClass310_3066) {
				this.method3009(1798838922);
			} else if (OutgoingPacketManager.aClass310_3210 == this.aClass310_3066) {
				this.sendMapRegion(arg0.aClass330_Sub46_Sub2_3056, 1343505300);
			} else if (OutgoingPacketManager.aClass310_3212 == this.aClass310_3066) {
				this.method3029(-255360127);
			} else if (this.aClass310_3066.method3098((byte) 91)) {
				this.method3010(arg0.aClass330_Sub46_Sub2_3056, 1143246584);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "mr.ap(" + ')');
		}
	}

	public Class312 method3027(byte arg0) {
		try {
			return this.aClass312_3084;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.w(" + ')');
		}
	}

	public void method3028(int arg0) {
		try {
			this.aClass381_3071 = new Class381();
			this.anInt3074 = 0;
			this.anInt3073 = 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.y(" + ')');
		}
	}

	public void method3029(int arg0) {
		try {
			this.aClass310_3083 = this.aClass310_3066;
			this.method3012(Class134.aClass134_1515, 2119844909);
			int var2;
			int var3;
			int var4;
			for (var2 = 0; var2 < 4; var2++) {
				for (var3 = 0; var3 < this.anInt3108 >> 3; var3++) {
					for (var4 = 0; var4 < this.anInt3076 >> 3; var4++) {
						this.anIntArrayArrayArray3086[var2][var3][var4] = -1;
					}
				}
			}
			int var5;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			for (Class330_Sub17 var21 = (Class330_Sub17) Class96.aClass471_856.method5869(539664854); var21 != null; var21 = (Class330_Sub17) Class96.aClass471_856.method5873((byte) -54)) {
				var3 = var21.anInt7629;
				boolean var23 = (var3 & 0x1) == 1;
				var5 = var21.anInt7622 >> 3;
				var6 = var21.anInt7627 >> 3;
				var7 = var21.anInt7623;
				var8 = var21.anInt7626;
				var9 = var21.anInt7625;
				var10 = var21.anInt7621;
				var11 = var21.anInt7624;
				int var12 = var21.anInt7628;
				int var13 = 0;
				int var14 = 0;
				byte var15 = 1;
				byte var16 = 1;
				if (var3 == 1) {
					var14 = var11 - 1;
					var15 = -1;
				} else if (var3 == 2) {
					var14 = var11 - 1;
					var13 = var12 - 1;
					var15 = -1;
					var16 = -1;
				} else if (var3 == 3) {
					var13 = var12 - 1;
					var15 = 1;
					var16 = -1;
				}
				int var17 = var6;
				while (var17 < var12 + var6) {
					int var18 = var14;
					int var19 = var5;
					while (var19 < var11 + var5) {
						if (var23) {
							this.anIntArrayArrayArray3086[var10][var13 + var7][var18 + var8] = (var17 << 3) + (var9 << 24) + (var19 << 14) + (var3 << 1);
						} else {
							this.anIntArrayArrayArray3086[var10][var7 + var18][var13 + var8] = (var3 << 1) + (var19 << 14) + (var9 << 24) + (var17 << 3);
						}
						var19++;
						var18 += var15;
					}
					var17++;
					var13 += var16;
				}
			}
			var2 = Class140_Sub1.anIntArrayArray7262.length;
			this.anIntArray3067 = new int[var2];
			this.anIntArray3097 = new int[var2];
			this.anIntArray3075 = new int[var2];
			this.anIntArray3099 = null;
			this.aByteArrayArray3096 = new byte[var2][];
			this.aByteArrayArray3104 = new byte[var2][];
			this.aByteArrayArray3105 = null;
			this.anIntArray3107 = new int[var2];
			this.anIntArray3101 = new int[var2];
			this.aByteArrayArray3106 = new byte[var2][];
			this.aByteArrayArray3092 = new byte[var2][];
			var2 = 0;
			for (Class330_Sub17 var22 = (Class330_Sub17) Class96.aClass471_856.method5869(539664854); var22 != null; var22 = (Class330_Sub17) Class96.aClass471_856.method5873((byte) 10)) {
				var4 = var22.anInt7622 >>> 3;
				var5 = var22.anInt7627 >>> 3;
				var6 = var4 + var22.anInt7624;
				if ((var6 & 0x7) == 0) {
					var6--;
				}
				var6 >>>= 0x3;
				var7 = var5 + var22.anInt7628;
				if ((var7 & 0x7) == 0) {
					var7--;
				}
				var7 >>>= 0x3;
				for (var8 = var4 >>> 3; var8 <= var6; var8++) {
					label89: for (var9 = var5 >>> 3; var9 <= var7; var9++) {
						var10 = var8 << 8 | var9;
						for (var11 = 0; var11 < var2; var11++) {
							if (var10 == this.anIntArray3067[var11]) {
								if (arg0 != -255360127) {
									throw new IllegalStateException();
								}
								continue label89;
							}
						}
						this.anIntArray3067[var2] = var10;
						this.anIntArray3097[var2] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, false, var8, var9, (byte) 4), 323600977);
						this.anIntArray3075[var2] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, false, var8, var9, (byte) 4), 323600977);
						this.anIntArray3107[var2] = ItemDefinitions.aClass280_6752.method2754(this.method3024(true, true, var8, var9, (byte) 4), 323600977);
						this.anIntArray3101[var2] = ItemDefinitions.aClass280_6752.method2754(this.method3024(false, true, var8, var9, (byte) 4), 323600977);
						var2++;
					}
				}
			}
			this.anIntArrayArray3102 = Class140_Sub1.anIntArrayArray7262;
			Class140_Sub1.anIntArrayArray7262 = null;
			this.method3014(this.anInt3108 >> 4, this.anInt3076 >> 4, 16, false, (byte) -16);
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "mr.ax(" + ')');
		}
	}

	public void method3030(Class274_Sub1 arg0, byte[][] arg1, int arg2) {
		try {
			int var4;
			int var5;
			int var6;
			int var7;
			for (var4 = 0; var4 < arg0.anInt2774; var4++) {
				if (!this.aBoolean3103) {
					Class233.method2362((byte) -14);
				}
				for (var5 = 0; var5 < this.anInt3108 >> 3; var5++) {
					for (var6 = 0; var6 < this.anInt3076 >> 3; var6++) {
						var7 = this.anIntArrayArrayArray3086[var4][var5][var6];
						if (var7 != -1) {
							int var8 = var7 >> 24 & 0x3;
							if (!arg0.aBoolean2777 || var8 == 0) {
								int var9 = var7 >> 1 & 0x3;
								int var10 = var7 >> 14 & 0x3FF;
								int var11 = var7 >> 3 & 0x7FF;
								int var12 = (var10 / 8 << 8) + var11 / 8;
								for (int var13 = 0; var13 < this.anIntArray3067.length; var13++) {
									if (this.anIntArray3067[var13] == var12 && arg1[var13] != null) {
										Buffer var14 = new Buffer(arg1[var13]);
										arg0.method2689(var14, var4, var5 * 8, var6 * 8, var8, var10, var11, var9, this.aClass307Array3087, -817388189);
										arg0.method2708(Class361.aClass_ra3793, var14, var4, var5 * 8, var6 * 8, var8, var10, var11, var9, 1926745313);
										break;
									}
								}
							}
						}
					}
				}
			}
			for (var4 = 0; var4 < arg0.anInt2774; var4++) {
				if (!this.aBoolean3103) {
					Class233.method2362((byte) 68);
				}
				for (var5 = 0; var5 < this.anInt3108 >> 3; var5++) {
					for (var6 = 0; var6 < this.anInt3076 >> 3; var6++) {
						var7 = this.anIntArrayArrayArray3086[var4][var5][var6];
						if (var7 == -1) {
							arg0.method2687(var4, var5 * 8, var6 * 8, 8, 8, (short) 24892);
						}
					}
				}
			}
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "mr.ah(" + ')');
		}
	}

	public Class351 method3031(byte arg0) {
		try {
			return this.aClass351_3094;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.z(" + ')');
		}
	}

	public void method3032(int arg0) {
		try {
			if (this.aBoolean3103) {
				this.method3004((byte) 24);
				Class517.method6212(true, -1340583301);
				Class304 var2 = client.aClass304_9030;
				this.anIntArray3067 = var2.anIntArray3067;
				this.anIntArray3097 = var2.anIntArray3097;
				this.anIntArray3075 = var2.anIntArray3075;
				this.anIntArray3099 = var2.anIntArray3099;
				this.anIntArray3107 = var2.anIntArray3107;
				this.anIntArray3101 = var2.anIntArray3101;
				this.anIntArrayArray3102 = var2.anIntArrayArray3102;
				this.aByteArrayArray3096 = var2.aByteArrayArray3096;
				this.aByteArrayArray3104 = var2.aByteArrayArray3104;
				this.aByteArrayArray3105 = var2.aByteArrayArray3105;
				this.aByteArrayArray3106 = var2.aByteArrayArray3106;
				this.aByteArrayArray3092 = var2.aByteArrayArray3092;
				this.aClass307Array3087 = var2.aClass307Array3087;
				this.aClass281_3079 = var2.aClass281_3079;
				this.aClass389_3068 = var2.aClass389_3068;
				this.anIntArrayArrayArray3086 = var2.anIntArrayArrayArray3086;
				this.anInt3080 = var2.anInt3080;
				this.anInt3065 = var2.anInt3065;
				this.aClass330_Sub36_Sub12_3082 = var2.aClass330_Sub36_Sub12_3082;
				this.aClass351_3094 = var2.aClass351_3094;
				this.anIntArrayArray3088 = var2.anIntArrayArray3088;
				this.anIntArrayArray3089 = var2.anIntArrayArray3089;
				this.aByteArrayArrayArray3090 = var2.aByteArrayArrayArray3090;
				this.aClass310_3066 = var2.aClass310_3066;
				this.aClass134_3077 = var2.aClass134_3077;
				this.aClass381_3071 = var2.aClass381_3071;
				this.aClass381_3072 = var2.aClass381_3072;
				this.anInt3073 = var2.anInt3073;
				this.anInt3074 = var2.anInt3074;
				this.anInt3108 = var2.anInt3108;
				this.anInt3076 = var2.anInt3076;
			} else if (client.anInt8995 == 6) {
				Class227.method2311(5, -1188873169);
			} else if (client.anInt8995 == 15) {
				Class227.method2311(19, -1188873169);
			} else if (client.anInt8995 == 11) {
				Class227.method2311(7, -1188873169);
			} else if (client.anInt8995 == 1) {
				Class227.method2311(16, -1188873169);
			} else if (client.anInt8995 == 14) {
				Class227.method2311(17, -1188873169);
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.aw(" + ')');
		}
	}

	public int method3033(byte arg0) {
		try {
			return this.anInt3076;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "mr.f(" + ')');
		}
	}

	public static final void method3034(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			if (Class3.aClass120Array56[var2] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				String var4 = Class3.aClass120Array56[var2].aClass114Array1400[var3].aString1360;
				if (var4 == null) {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
				} else {
					arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mr.anh(" + ')');
		}
	}

	public static final void method3035(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, byte arg3) {
		try {
			arg0.aString1283 = (String) arg2.anObjectArray4386[--arg2.anInt4378];
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mr.jt(" + ')');
		}
	}

	public static void method3036(Class_ra arg0, Class_ta arg1, IComponentDefinitions arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
		try {
			Class372 var9 = Class79.aClass380_666.method4387(arg7, (byte) -47);
			if (var9 != null && var9.aBoolean3884 && var9.method4327(Class158.aClass561_6474, (byte) 51)) {
				int var11;
				if (var9.anIntArray3897 != null) {
					int[] var10 = new int[var9.anIntArray3897.length];
					int var12;
					int var13;
					int var14;
					for (var11 = 0; var11 < var10.length / 2; var11++) {
						if (Class147.anInt1621 == 5) {
							var12 = (int) client.aFloat9141 & 0x3FFF;
						} else {
							var12 = (int) client.aFloat9141 + client.anInt9149 & 0x3FFF;
						}
						var13 = Class257.anIntArray2683[var12];
						var14 = Class257.anIntArray2684[var12];
						if (Class147.anInt1621 != 5) {
							var13 = var13 * 256 / (client.anInt9063 + 256);
							var14 = var14 * 256 / (client.anInt9063 + 256);
						}
						var10[var11 * 2] = (var14 * (var9.anIntArray3897[var11 * 2] * 4 + arg5) + var13 * (arg6 + var9.anIntArray3897[var11 * 2 + 1] * 4) >> 14) + arg3 + arg2.anInt1210 / 2;
						var10[var11 * 2 + 1] = arg4 + arg2.anInt1348 / 2 - (var14 * (var9.anIntArray3897[var11 * 2 + 1] * 4 + arg6) - var13 * (var9.anIntArray3897[var11 * 2] * 4 + arg5) >> 14);
					}
					Class122 var21 = arg2.method1396(arg0, (byte) -105);
					if (var21 != null) {
						Class82.method957(arg0, var10, var9.anInt3900, var21.anIntArray1404, var21.anIntArray1406);
					}
					if (var9.anInt3875 > 0) {
						int var15;
						int var16;
						int var17;
						for (var12 = 0; var12 < var10.length / 2 - 1; var12++) {
							var13 = var10[var12 * 2];
							var14 = var10[var12 * 2 + 1];
							var15 = var10[(var12 + 1) * 2];
							var16 = var10[(var12 + 1) * 2 + 1];
							if (var15 < var13) {
								var17 = var13;
								int var18 = var14;
								var13 = var15;
								var14 = var16;
								var15 = var17;
								var16 = var18;
							} else if (var13 == var15 && var16 < var14) {
								var17 = var14;
								var14 = var16;
								var16 = var17;
							}
							arg0.be(var13, var14, var15, var16, var9.anIntArray3908[var9.aByteArray3912[var12] & 0xFF], 1, arg1, arg3, arg4, var9.anInt3875, var9.anInt3881, var9.anInt3905);
						}
						var12 = var10[var10.length - 2];
						var13 = var10[var10.length - 1];
						var14 = var10[0];
						var15 = var10[1];
						if (var14 < var12) {
							var16 = var12;
							var17 = var13;
							var12 = var14;
							var13 = var15;
							var14 = var16;
							var15 = var17;
						} else if (var14 == var12 && var15 < var13) {
							var16 = var13;
							var13 = var15;
							var15 = var16;
						}
						arg0.be(var12, var13, var14, var15, var9.anIntArray3908[var9.aByteArray3912[var9.aByteArray3912.length - 1] & 0xFF], 1, arg1, arg3, arg4, var9.anInt3875, var9.anInt3881, var9.anInt3905);
					} else {
						for (var12 = 0; var12 < var10.length / 2 - 1; var12++) {
							arg0.bi(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.anIntArray3908[var9.aByteArray3912[var12] & 0xFF], 1, arg1, arg3, arg4);
						}
						arg0.bi(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.anIntArray3908[var9.aByteArray3912[var9.aByteArray3912.length - 1] & 0xFF], 1, arg1, arg3, arg4);
					}
				}
				Class61 var20 = null;
				if (var9.anInt3872 != -1) {
					var20 = var9.method4325(arg0, false, -1743466339);
					if (var20 != null) {
						Class464_Sub3.method5744(arg2, arg1, arg3, arg4, arg5, arg6, var20, (byte) 0);
					}
				}
				if (var9.aString3909 != null) {
					var11 = 0;
					if (var20 != null) {
						var11 = var20.method682();
					}
					Class263 var22 = Class125.aClass263_1454;
					Class524 var23 = Class543.aClass524_6254;
					if (var9.anInt3876 == 1) {
						var22 = Class464_Sub22.aClass263_8709;
						var23 = Class386.aClass524_3989;
					}
					if (var9.anInt3876 == 2) {
						var22 = Class166_Sub3_Sub2.aClass263_9483;
						var23 = Class477_Sub1.aClass524_8749;
					}
					Class315.method3139(arg2, arg1, arg3, arg4, arg5, arg6, var11, var9.aString3909, var22, var23, var9.anInt3903, -1367566886);
				}
			}
		} catch (RuntimeException var19) {
			throw Class476.method5964(var19, "mr.q(" + ')');
		}
	}

	public static void method3037(Class549_Sub1 arg0, int arg1, int arg2, int arg3) {
		try {
			arg0.method6362(arg1, (byte) -34);
			byte var4;
			if (arg2 > 20049) {
				Class283.method2828(1651757454);
				var4 = 4;
			} else if (arg2 > 10036) {
				Class95_Sub12_Sub1.method1141(-2137507047);
				var4 = 3;
			} else if (arg2 > 5025) {
				Class51.method634(1129678322);
				var4 = 2;
			} else {
				Class330_Sub18.method3342(true, -1779888560);
				var4 = 1;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1264441102) == arg1) {
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, 933751973);
			} else {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, arg1, 233119885);
				Class171.method2046(arg1, false, 375330234);
			}
			Class435.method5568(2017550207);
			arg0.method6360(var4, 95955317);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "mr.f(" + ')');
		}
	}
}
