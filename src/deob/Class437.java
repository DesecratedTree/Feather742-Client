package deob;

public class Class437 {

	public int anInt4431 = -1;

	public int anInt4438 = 128;

	public int anInt4434 = 128;

	public int anInt4440 = 0;

	public int anInt4441 = 0;

	public int anInt4437 = 0;

	public boolean aBoolean4443 = false;

	public byte aByte4444 = 0;

	public int anInt4445 = -1;

	public int anInt4429;

	public int anInt4430;

	public Class416 aClass416_4442;

	public byte[] aByteArray4428;

	public byte[] aByteArray4433;

	public short[] aShortArray4432;

	public short[] aShortArray4435;

	public short[] aShortArray4436;

	public short[] aShortArray4439;

	public void method5580(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(484941882);
				if (var3 == 0) {
					if (arg1 != -1903137404) {
						throw new IllegalStateException();
					}
					return;
				}
				this.method5582(arg0, var3, (byte) 1);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sc.r(" + ')');
		}
	}

	public final Class387 method5581(Class_ra arg0, int arg1, boolean arg2, Class_xa arg3, Class_xa arg4, int arg5, int arg6, int arg7, Class477 arg8, byte arg9, int arg10) {
		try {
			int var12 = arg1;
			boolean var21 = arg2 & this.aByte4444 != 0;
			if (arg8 != null) {
				var12 = arg1 | arg8.method5975(-1898478740);
			}
			if (var21) {
				var12 |= this.aByte4444 == 3 ? 7 : 2;
			}
			if (this.anInt4434 != 128) {
				var12 |= 0x2;
			}
			if (this.anInt4438 != 128 || this.anInt4440 != 0) {
				var12 |= 0x5;
			}
			Class367 var14 = this.aClass416_4442.aClass367_4270;
			Class387 var13;
			synchronized (this.aClass416_4442.aClass367_4270) {
				var13 = (Class387) this.aClass416_4442.aClass367_4270.get((long) (this.anInt4429 |= arg0.anInt4226 << 29));
			}
			if (var13 == null || arg0.ct(var13.m(), var12) != 0) {
				if (var13 != null) {
					var12 = arg0.cd(var12, var13.m());
				}
				int var22 = var12;
				if (this.aShortArray4439 != null) {
					var22 = var12 | 0x4000;
				}
				if (this.aShortArray4432 != null) {
					var22 |= 0x8000;
				}
				Model var15 = Model.loadModel(this.aClass416_4442.aClass280_4268, this.anInt4430, 0);
				if (var15 == null) {
					return null;
				}
				if (var15.anInt881 < 13) {
					var15.method1196(2);
				}
				var13 = arg0.cb(var15, var22, this.aClass416_4442.anInt4269, this.anInt4441 + 64, this.anInt4437 + 850);
				int var16;
				if (this.aShortArray4439 != null) {
					for (var16 = 0; var16 < this.aShortArray4439.length; var16++) {
						var13.color(this.aShortArray4439[var16], this.aShortArray4436[var16]);
					}
				}
				if (this.aShortArray4432 != null) {
					for (var16 = 0; var16 < this.aShortArray4432.length; var16++) {
						var13.paintTexture(this.aShortArray4432[var16], this.aShortArray4435[var16]);
					}
				}
				var13.KA(var12);
				Class367 var24 = this.aClass416_4442.aClass367_4270;
				synchronized (this.aClass416_4442.aClass367_4270) {
					this.aClass416_4442.aClass367_4270.put(var13, (long) (this.anInt4429 |= arg0.anInt4226 << 29));
				}
			}
			Class387 var23 = var13.method4446(arg9, var12, true);
			if (arg8 != null) {
				arg8.method5976(var23, 0, -1413412499);
			}
			if (this.anInt4438 != 128 || this.anInt4434 != 128) {
				var23.oa(this.anInt4438, this.anInt4434, this.anInt4438);
			}
			if (this.anInt4440 != 0) {
				if (this.anInt4440 == 90) {
					var23.f(4096);
				}
				if (this.anInt4440 == 180) {
					var23.f(8192);
				}
				if (this.anInt4440 == 270) {
					var23.f(12288);
				}
			}
			if (var21) {
				var23.pa(this.aByte4444, this.anInt4445, arg3, arg4, arg5, arg6, arg7);
			}
			var23.KA(arg1);
			return var23;
		} catch (RuntimeException var20) {
			throw Class476.method5964(var20, "sc.p(" + ')');
		}
	}

	public void method5582(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				this.anInt4430 = arg0.readBigSmart(-1078653859);
			} else if (arg1 == 2) {
				this.anInt4431 = arg0.readBigSmart(-605738838);
			} else if (arg1 == 4) {
				this.anInt4438 = arg0.readUnsignedShort(1598413038);
			} else if (arg1 == 5) {
				this.anInt4434 = arg0.readUnsignedShort(2110142118);
			} else if (arg1 == 6) {
				this.anInt4440 = arg0.readUnsignedShort(1472025292);
			} else if (arg1 == 7) {
				this.anInt4441 = arg0.readUnsignedByte(739105383);
			} else if (arg1 == 8) {
				this.anInt4437 = arg0.readUnsignedByte(1269607296);
			} else if (arg1 == 9) {
				this.aByte4444 = 3;
				this.anInt4445 = 8224;
			} else if (arg1 == 10) {
				this.aBoolean4443 = true;
			} else if (arg1 == 11) {
				this.aByte4444 = 1;
			} else if (arg1 == 12) {
				this.aByte4444 = 4;
			} else if (arg1 == 13) {
				this.aByte4444 = 5;
			} else if (arg1 == 14) {
				this.aByte4444 = 2;
				this.anInt4445 = arg0.readUnsignedByte(146115784) * 256;
			} else if (arg1 == 15) {
				this.aByte4444 = 3;
				this.anInt4445 = arg0.readUnsignedShort(1226535303);
			} else if (arg1 == 16) {
				this.aByte4444 = 3;
				this.anInt4445 = arg0.readInt((byte) 55);
			} else {
				int var4;
				int var5;
				if (arg1 == 40) {
					var4 = arg0.readUnsignedByte(-81905362);
					this.aShortArray4439 = new short[var4];
					this.aShortArray4436 = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.aShortArray4439[var5] = (short) arg0.readUnsignedShort(2022578343);
						this.aShortArray4436[var5] = (short) arg0.readUnsignedShort(1264227146);
					}
				} else if (arg1 == 41) {
					var4 = arg0.readUnsignedByte(-155536163);
					this.aShortArray4432 = new short[var4];
					this.aShortArray4435 = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.aShortArray4432[var5] = (short) arg0.readUnsignedShort(1745293830);
						this.aShortArray4435[var5] = (short) arg0.readUnsignedShort(1615081081);
					}
				} else {
					int var6;
					int var7;
					byte var9;
					if (arg1 == 44) {
						var4 = arg0.readUnsignedShort(-139446380);
						var5 = 0;
						for (var6 = var4; var6 > 0; var6 >>= 0x1) {
							var5++;
						}
						this.aByteArray4428 = new byte[var5];
						var9 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray4428[var7] = var9++;
							} else {
								this.aByteArray4428[var7] = -1;
							}
						}
					} else if (arg1 == 45) {
						var4 = arg0.readUnsignedShort(2040826442);
						var5 = 0;
						for (var6 = var4; var6 > 0; var6 >>= 0x1) {
							var5++;
						}
						this.aByteArray4433 = new byte[var5];
						var9 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray4433[var7] = var9++;
							} else {
								this.aByteArray4433[var7] = -1;
							}
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "sc.j(" + ')');
		}
	}

	public final Class387 method5583(Class_ra arg0, int arg1, Class477 arg2, byte arg3, int arg4) {
		try {
			return this.method5581(arg0, arg1, false, null, null, 0, 0, 0, arg2, arg3, 1588941804);
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "sc.i(" + ')');
		}
	}

	public final boolean method5584(byte arg0) {
		try {
			return this.anInt4430 == -1 ? true : this.aClass416_4442.aClass280_4268.hasStoredFile(this.anInt4430, 0, (byte) 32);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sc.o(" + ')');
		}
	}

	public static int method5585(int arg0, int arg1, byte arg2) {
		try {
			int var3 = 1;
			while (arg1 > 1) {
				if ((arg1 & 0x1) != 0) {
					var3 *= arg0;
				}
				arg0 *= arg0;
				arg1 >>= 0x1;
			}
			if (arg1 == 1) {
				return arg0 * var3;
			} else {
				return var3;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sc.r(" + ')');
		}
	}

	public static final void method5586(Class430 arg0, int arg1) {
		try {
			arg0.anInt4380 -= 2;
			if (arg0.aLongArray4379[arg0.anInt4380] >= arg0.aLongArray4379[arg0.anInt4380 + 1]) {
				arg0.anInt4397 += arg0.anIntArray4394[arg0.anInt4397];
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sc.bz(" + ')');
		}
	}

	public static final void method5587(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
		try {
			Class204_Sub1.anInt8947 = arg0;
			Class151.anInt6671 = arg1;
			Class432_Sub1_Sub5_Sub1.anInt9963 = arg2;
			Class511.anInt5955 = arg3;
			Class544.anInt6257 = arg4;
			if (arg5 && Class544.anInt6257 >= 100) {
				Class471.anInt5612 = Class204_Sub1.anInt8947 * 512 + 256;
				Class325_Sub3.anInt7484 = Class151.anInt6671 * 512 + 256;
				Gfx.anInt578 = Class431.method5342(Class471.anInt5612, Class325_Sub3.anInt7484, Class85.anInt712, 1996761881) - Class432_Sub1_Sub5_Sub1.anInt9963;
			}
			Class147.anInt1621 = 3;
			Class439.anInt4456 = -1;
			Class457.anInt6844 = -1;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "sc.ho(" + ')');
		}
	}

	public static final void method5588(Class430 arg0, int arg1) {
		try {
			Class330_Sub18.method3342(true, -1060259017);
			client.aClass304_9030.method3032(2010795984);
			Class435.method5568(2080594140);
			client.aBoolean9194 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sc.apt(" + ')');
		}
	}

	public static int method5589(Class401_Sub1 arg0, Class401_Sub1 arg1, int arg2, boolean arg3, int arg4) {
		try {
			int var5;
			int var6;
			if (arg2 == 1) {
				var5 = arg0.anInt4133;
				var6 = arg1.anInt4133;
				if (!arg3) {
					if (var5 == -1) {
						var5 = 2001;
					}
					if (var6 == -1) {
						var6 = 2001;
					}
				}
				return var5 - var6;
			} else if (arg2 == 2) {
				return Class145.method1725(arg0.method4720(340999652).aString4107, arg1.method4720(399957554).aString4107, Class429.aClass454_4369, -976946917);
			} else if (arg2 == 3) {
				if (arg0.aString8246.equals("-")) {
					if (arg1.aString8246.equals("-")) {
						return 0;
					} else if (arg3) {
						return -1;
					} else {
						return 1;
					}
				} else if (arg1.aString8246.equals("-")) {
					return arg3 ? 1 : -1;
				} else {
					return Class145.method1725(arg0.aString8246, arg1.aString8246, Class429.aClass454_4369, -1686677015);
				}
			} else if (arg2 == 4) {
				return arg0.method4712((byte) 90) ? (arg1.method4712((byte) 6) ? 0 : 1) : (arg1.method4712((byte) -15) ? -1 : 0);
			} else if (arg2 == 5) {
				return arg0.method4709(-1921738938) ? (arg1.method4709(-1265694133) ? 0 : 1) : (arg1.method4709(-1311720046) ? -1 : 0);
			} else if (arg2 == 6) {
				return arg0.method4710((byte) 113) ? (arg1.method4710((byte) 113) ? 0 : 1) : (arg1.method4710((byte) 113) ? -1 : 0);
			} else if (arg2 == 7) {
				return arg0.method4711((byte) -64) ? (arg1.method4711((byte) -3) ? 0 : 1) : (arg1.method4711((byte) -33) ? -1 : 0);
			} else if (arg2 == 8) {
				var5 = arg0.anInt8248;
				var6 = arg1.anInt8248;
				if (arg3) {
					if (var5 == 1000) {
						var5 = -1;
					}
					if (var6 == 1000) {
						var6 = -1;
					}
				} else {
					if (var5 == -1) {
						var5 = 1000;
					}
					if (var6 == -1) {
						var6 = 1000;
					}
				}
				return var5 - var6;
			} else {
				return arg0.anInt8245 - arg1.anInt8245;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "sc.b(" + ')');
		}
	}

	public static final void method5590(Class430 arg0, int arg1) {
		try {
			arg0.anInt4376 -= 2;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sc.agi(" + ')');
		}
	}
}
