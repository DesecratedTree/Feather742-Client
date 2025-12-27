package deob;

import java.util.Arrays;

public class Class473 {

	public String aString5618 = "null";

	public byte aByte5632 = 0;

	public int anInt5674 = 1;

	public int anInt5680 = 1;

	public int anInt5635 = 2;

	public boolean aBoolean5636 = true;

	public int anInt5637 = -1;

	public byte aByte5638 = 0;

	public int anInt5634 = -1;

	public boolean aBoolean5647 = false;

	public int anInt5641 = -1;

	public int anInt5642 = 960;

	public int anInt5643 = 0;

	public int[] anIntArray5644 = null;

	public int[] anIntArray5645 = null;

	public int anInt5646 = 64;

	public int anInt5639 = 0;

	public int anInt5691 = 0;

	public int anInt5651 = -1;

	public int anInt5652 = -1;

	public boolean aBoolean5653 = false;

	public int anInt5654 = 0;

	public boolean aBoolean5655 = false;

	public boolean aBoolean5656 = false;

	public boolean aBoolean5669 = true;

	public int anInt5658 = 128;

	public int anInt5659 = 128;

	public int anInt5660 = 128;

	public int anInt5686 = 0;

	public int anInt5619 = 0;

	public int anInt5663 = 0;

	public int anInt5664 = 0;

	public int anInt5665 = 0;

	public int anInt5666 = 0;

	public boolean aBoolean5667 = false;

	public boolean aBoolean5668 = false;

	public int anInt5640 = -1;

	public int anInt5670 = 0;

	public int anInt5672 = -1;

	public int anInt5673 = -1;

	public int anInt5650 = -1;

	public int anInt5675 = 0;

	public int anInt5676 = 0;

	public int anInt5677 = 255;

	public boolean aBoolean5615 = false;

	public int anInt5679 = 0;

	public int anInt5628 = 0;

	public boolean aBoolean5616 = false;

	public boolean aBoolean5648 = true;

	public boolean aBoolean5690 = false;

	public boolean aBoolean5685 = true;

	public boolean aBoolean5621 = false;

	public boolean aBoolean5688 = false;

	public int anInt5689 = 256;

	public int anInt5662 = 256;

	public boolean aBoolean5692 = false;

	public boolean aBoolean5683 = false;

	public static int anInt5620 = 6;

	public static short[] aShortArray5631 = new short[256];

	public static int anInt5694 = 1;

	public byte aByte5629;

	public byte aByte5630;

	public byte aByte5661;

	public int anInt5657;

	public static int anInt5695;

	public Class463 aClass463_5671;

	public Class497 aClass497_5687;

	public byte[] aByteArray5622;

	public byte[] aByteArray5624;

	public byte[] aByteArray5627;

	public byte[] aByteArray5633;

	public int[] anIntArray5617;

	public int[] anIntArray5678;

	public int[] anIntArray5681;

	public int[] anIntArray5693;

	public String[] aStringArray5649;

	public short[] aShortArray5623;

	public short[] aShortArray5625;

	public short[] aShortArray5626;

	public short[] aShortArray5682;

	public int[][] anIntArrayArray5684;

	public void method5893(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(558287874);
				if (var3 == 0) {
					if (arg1 < 1972979007) {
					}
					return;
				}
				this.method5894(arg0, var3, 561621539);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tp.r(" + ')');
		}
	}

	public void method5894(Buffer arg0, int arg1, int arg2) {
		try {
			int var4;
			int var5;
			int var6;
			int var7;
			if (arg1 == 1) {
				var4 = arg0.readUnsignedByte(679421791);
				this.aByteArray5633 = new byte[var4];
				this.anIntArrayArray5684 = new int[var4][];
				for (var5 = 0; var5 < var4; var5++) {
					this.aByteArray5633[var5] = arg0.readByte((byte) -16);
					var6 = arg0.readUnsignedByte(1000558998);
					this.anIntArrayArray5684[var5] = new int[var6];
					for (var7 = 0; var7 < var6; var7++) {
						this.anIntArrayArray5684[var5][var7] = arg0.readBigSmart(-1758367486);
					}
				}
			} else if (arg1 == 2) {
				this.aString5618 = arg0.readString(-846327259);
			} else if (arg1 == 14) {
				this.anInt5674 = arg0.readUnsignedByte(1920295740);
			} else if (arg1 == 15) {
				this.anInt5680 = arg0.readUnsignedByte(168163818);
			} else if (arg1 == 17) {
				this.anInt5635 = 0;
				this.aBoolean5636 = false;
			} else if (arg1 == 18) {
				this.aBoolean5636 = false;
			} else if (arg1 == 19) {
				this.anInt5637 = arg0.readUnsignedByte(2139937693);
			} else if (arg1 == 21) {
				this.aByte5638 = 1;
			} else if (arg1 == 22) {
				this.aBoolean5647 = true;
			} else if (arg1 == 23) {
				this.anInt5641 = 1;
			} else if (arg1 == 24) {
				var4 = arg0.readBigSmart(-2060811680);
				if (var4 != -1) {
					this.anIntArray5644 = new int[] { var4 };
				}
			} else if (arg1 == 27) {
				this.anInt5635 = 1;
			} else if (arg1 == 28) {
				this.anInt5646 = arg0.readUnsignedByte(413952470) << 2;
			} else if (arg1 == 29) {
				this.anInt5639 = arg0.readByte((byte) -85);
			} else if (arg1 == 39) {
				this.anInt5691 = arg0.readByte((byte) 21) * 5;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aStringArray5649[arg1 - 30] = arg0.readString(-1623546899);
			} else if (arg1 == 40) {
				var4 = arg0.readUnsignedByte(1109028870);
				this.aShortArray5682 = new short[var4];
				this.aShortArray5623 = new short[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aShortArray5682[var5] = (short) arg0.readUnsignedShort(1877074007);
					this.aShortArray5623[var5] = (short) arg0.readUnsignedShort(1512189943);
				}
			} else if (arg1 == 41) {
				var4 = arg0.readUnsignedByte(98548825);
				this.aShortArray5625 = new short[var4];
				this.aShortArray5626 = new short[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aShortArray5625[var5] = (short) arg0.readUnsignedShort(499841000);
					this.aShortArray5626[var5] = (short) arg0.readUnsignedShort(1519943345);
				}
			} else if (arg1 == 42) {
				var4 = arg0.readUnsignedByte(1458881202);
				this.aByteArray5624 = new byte[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.aByteArray5624[var5] = arg0.readByte((byte) 92);
				}
			} else {
				byte var10;
				if (arg1 == 44) {
					var4 = arg0.readUnsignedShort(1121534826);
					var5 = 0;
					for (var6 = var4; var6 > 0; var6 >>= 0x1) {
						var5++;
					}
					this.aByteArray5627 = new byte[var5];
					var10 = 0;
					for (var7 = 0; var7 < var5; var7++) {
						if ((var4 & 0x1 << var7) > 0) {
							this.aByteArray5627[var7] = var10++;
						} else {
							this.aByteArray5627[var7] = -1;
						}
					}
				} else if (arg1 == 45) {
					var4 = arg0.readUnsignedShort(-299297793);
					var5 = 0;
					for (var6 = var4; var6 > 0; var6 >>= 0x1) {
						var5++;
					}
					this.aByteArray5622 = new byte[var5];
					var10 = 0;
					for (var7 = 0; var7 < var5; var7++) {
						if ((var4 & 0x1 << var7) > 0) {
							this.aByteArray5622[var7] = var10++;
						} else {
							this.aByteArray5622[var7] = -1;
						}
					}
				} else if (arg1 == 62) {
					this.aBoolean5656 = true;
				} else if (arg1 == 64) {
					this.aBoolean5669 = false;
				} else if (arg1 == 65) {
					this.anInt5658 = arg0.readUnsignedShort(2020821427);
				} else if (arg1 == 66) {
					this.anInt5659 = arg0.readUnsignedShort(908750802);
				} else if (arg1 == 67) {
					this.anInt5660 = arg0.readUnsignedShort(1947475497);
				} else if (arg1 == 69) {
					arg0.readUnsignedByte(1076906878);
				} else if (arg1 == 70) {
					this.anInt5686 = arg0.readShort(-1100583751) << 2;
				} else if (arg1 == 71) {
					this.anInt5619 = arg0.readShort(-1100583751) << 2;
				} else if (arg1 == 72) {
					this.anInt5663 = arg0.readShort(-1100583751) << 2;
				} else if (arg1 == 73) {
					this.aBoolean5667 = true;
				} else if (arg1 == 74) {
					this.aBoolean5668 = true;
				} else if (arg1 == 75) {
					this.anInt5640 = arg0.readUnsignedByte(1909343902);
				} else if (arg1 == 77 || arg1 == 92) {
					this.anInt5672 = arg0.readUnsignedShort(1157819824);
					if (this.anInt5672 == 65535) {
						this.anInt5672 = -1;
					}
					this.anInt5673 = arg0.readUnsignedShort(1404924389);
					if (this.anInt5673 == 65535) {
						this.anInt5673 = -1;
					}
					var4 = -1;
					if (arg1 == 92) {
						var4 = arg0.readBigSmart(-1712777337);
					}
					var5 = arg0.readUnsignedByte(1000900380);
					this.anIntArray5678 = new int[var5 + 2];
					for (var6 = 0; var6 <= var5; var6++) {
						this.anIntArray5678[var6] = arg0.readBigSmart(-621821685);
					}
					this.anIntArray5678[var5 + 1] = var4;
				} else if (arg1 == 78) {
					this.anInt5650 = arg0.readUnsignedShort(1960488242);
					this.anInt5675 = arg0.readUnsignedByte(961576771);
				} else if (arg1 == 79) {
					this.anInt5679 = arg0.readUnsignedShort(149508987);
					this.anInt5628 = arg0.readUnsignedShort(1572546000);
					this.anInt5675 = arg0.readUnsignedByte(799669580);
					var4 = arg0.readUnsignedByte(498259176);
					this.anIntArray5681 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray5681[var5] = arg0.readUnsignedShort(-247196595);
					}
				} else if (arg1 == 81) {
					this.aByte5638 = 2;
					this.anInt5634 = arg0.readUnsignedByte(446148821) * 256;
				} else if (arg1 == 82) {
					this.aBoolean5690 = true;
				} else if (arg1 == 88) {
					this.aBoolean5685 = false;
				} else if (arg1 == 89) {
					this.aBoolean5648 = false;
				} else if (arg1 == 91) {
					this.aBoolean5621 = true;
				} else if (arg1 == 93) {
					this.aByte5638 = 3;
					this.anInt5634 = arg0.readUnsignedShort(1515863237);
				} else if (arg1 == 94) {
					this.aByte5638 = 4;
				} else if (arg1 == 95) {
					this.aByte5638 = 5;
					this.anInt5634 = arg0.readShort(-1100583751);
				} else if (arg1 == 97) {
					this.aBoolean5653 = true;
				} else if (arg1 == 98) {
					this.aBoolean5688 = true;
				} else if (arg1 == 99 || arg1 == 100) {
					arg0.readUnsignedByte(1197648028);
					arg0.readUnsignedShort(1880359968);
				} else if (arg1 == 101) {
					this.anInt5654 = arg0.readUnsignedByte(-32165944);
				} else if (arg1 == 102) {
					this.anInt5652 = arg0.readUnsignedShort(603603868);
				} else if (arg1 == 103) {
					this.anInt5641 = 0;
				} else if (arg1 == 104) {
					this.anInt5677 = arg0.readUnsignedByte(659384878);
				} else if (arg1 == 105) {
					this.aBoolean5655 = true;
				} else if (arg1 == 106) {
					var4 = arg0.readUnsignedByte(-259483933);
					var5 = 0;
					this.anIntArray5644 = new int[var4];
					this.anIntArray5645 = new int[var4];
					for (var6 = 0; var6 < var4; var6++) {
						this.anIntArray5644[var6] = arg0.readBigSmart(-782385596);
						var5 += this.anIntArray5645[var6] = arg0.readUnsignedByte(945032375);
					}
					for (var6 = 0; var6 < var4; var6++) {
						this.anIntArray5645[var6] = this.anIntArray5645[var6] * 65535 / var5;
					}
				} else if (arg1 == 107) {
					this.anInt5651 = arg0.readUnsignedShort(1383425123);
				} else if (arg1 >= 150 && arg1 < 155) {
					this.aStringArray5649[arg1 - 150] = arg0.readString(804302639);
					if (!this.aClass463_5671.aBoolean5584) {
						this.aStringArray5649[arg1 - 150] = null;
					}
				} else if (arg1 == 160) {
					var4 = arg0.readUnsignedByte(1012112626);
					this.anIntArray5693 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray5693[var5] = arg0.readUnsignedShort(356947477);
					}
				} else if (arg1 == 162) {
					this.aByte5638 = 3;
					this.anInt5634 = arg0.readInt((byte) 74);
				} else if (arg1 == 163) {
					this.aByte5629 = arg0.readByte((byte) -8);
					this.aByte5630 = arg0.readByte((byte) -2);
					this.aByte5661 = arg0.readByte((byte) -1);
					this.aByte5632 = arg0.readByte((byte) -101);
				} else if (arg1 == 164) {
					this.anInt5664 = arg0.readShort(-1100583751);
				} else if (arg1 == 165) {
					this.anInt5665 = arg0.readShort(-1100583751);
				} else if (arg1 == 166) {
					this.anInt5666 = arg0.readShort(-1100583751);
				} else if (arg1 == 167) {
					this.anInt5670 = arg0.readUnsignedShort(1684374579);
				} else if (arg1 == 168) {
					this.aBoolean5615 = true;
				} else if (arg1 == 169) {
					this.aBoolean5616 = true;
				} else if (arg1 == 170) {
					this.anInt5642 = arg0.readSmart(-1035546029);
				} else if (arg1 == 171) {
					this.anInt5643 = arg0.readSmart(-1442870272);
				} else if (arg1 == 173) {
					this.anInt5689 = arg0.readUnsignedShort(55858290);
					this.anInt5662 = arg0.readUnsignedShort(928442961);
				} else if (arg1 == 177) {
					this.aBoolean5692 = true;
				} else if (arg1 == 178) {
					this.anInt5676 = arg0.readUnsignedByte(1021320627);
				} else if (arg1 == 189) {
					this.aBoolean5683 = true;
				} else if (arg1 >= 190 && arg1 < 196) {
					if (this.anIntArray5617 == null) {
						this.anIntArray5617 = new int[6];
						Arrays.fill(this.anIntArray5617, -1);
					}
					this.anIntArray5617[arg1 - 190] = arg0.readUnsignedShort(20987896);
				} else if (arg1 == 249) {
					var4 = arg0.readUnsignedByte(-85137837);
					if (this.aClass497_5687 == null) {
						var5 = Class136.method1594(var4, 1909090493);
						this.aClass497_5687 = new Class497(var5);
					}
					for (var5 = 0; var5 < var4; var5++) {
						boolean var11 = arg0.readUnsignedByte(319633765) == 1;
						var7 = arg0.readUnsignedTriByte(-1401356047);
						Class330 var8;
						if (var11) {
							var8 = new Class330_Sub35(arg0.readString(-669082569));
						} else {
							var8 = new Class330_Sub23(arg0.readInt((byte) 69));
						}
						this.aClass497_5687.method6097(var8, (long) var7);
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "tp.j(" + ')');
		}
	}

	public final boolean method5895(int arg0, byte arg1) {
		try {
			if (this.anIntArrayArray5684 == null) {
				return true;
			}
			boolean var3 = true;
			IndexTable var4 = this.aClass463_5671.aClass280_5575;
			synchronized (this.aClass463_5671.aClass280_5575) {
				for (int var5 = 0; var5 < this.aByteArray5633.length; var5++) {
					if (arg0 == this.aByteArray5633[var5]) {
						for (int var6 = 0; var6 < this.anIntArrayArray5684[var5].length; var6++) {
							if (!this.aClass463_5671.aClass280_5575.hasStoredFile(this.anIntArrayArray5684[var5][var6], 0, (byte) 32)) {
								var3 = false;
							}
						}
					}
				}
				return var3;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "tp.p(" + ')');
		}
	}

	public final boolean method5896(int arg0) {
		try {
			if (this.anIntArrayArray5684 == null) {
				return true;
			}
			boolean var2 = true;
			IndexTable var3 = this.aClass463_5671.aClass280_5575;
			synchronized (this.aClass463_5671.aClass280_5575) {
				for (int var4 = 0; var4 < this.anIntArrayArray5684.length; var4++) {
					for (int var5 = 0; var5 < this.anIntArrayArray5684[var4].length; var5++) {
						var2 &= this.aClass463_5671.aClass280_5575.hasStoredFile(this.anIntArrayArray5684[var4][var5], 0, (byte) 32);
					}
				}
				return var2;
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "tp.o(" + ')');
		}
	}

	public final synchronized Class485 method5897(Class_ra arg0, int arg1, int arg2, int arg3, Class_xa arg4, Class_xa arg5, int arg6, int arg7, int arg8, boolean arg9, Class481 arg10, byte arg11) {
		try {
			if (Class432_Sub1_Sub1_Sub1.method5459(arg2, (byte) 0)) {
				arg2 = Class476.aClass476_6899.anInt6882;
			}
			long var13 = (long) ((this.anInt5657 << 10) + (arg2 << 3) + arg3);
			var13 |= arg0.anInt4226 << 29;
			if (arg10 != null) {
				var13 |= arg10.aLong5767 << 32;
			}
			int var15 = arg1;
			if (this.aByte5638 == 3) {
				var15 = arg1 | 0x7;
			} else {
				if (this.aByte5638 != 0 || this.anInt5665 != 0) {
					var15 = arg1 | 0x2;
				}
				if (this.anInt5664 != 0) {
					var15 |= 0x1;
				}
				if (this.anInt5666 != 0) {
					var15 |= 0x4;
				}
			}
			if (arg9) {
				var15 |= 0x40000;
			}
			boolean var16 = this.aByte5638 != 0 && (arg4 != null || arg5 != null);
			boolean var17 = this.anInt5664 != 0 || this.anInt5665 != 0 || this.anInt5666 != 0;
			Class367 var19 = this.aClass463_5671.aClass367_5579;
			Class485 var18;
			synchronized (this.aClass463_5671.aClass367_5579) {
				var18 = (Class485) this.aClass463_5671.aClass367_5579.get(var13);
			}
			Class387 var27 = (Class387) (var18 == null ? null : var18.anObject5824);
			Class_na var20 = null;
			if (var27 != null && arg0.ct(var27.m(), var15) == 0) {
				var20 = (Class_na) var18.anObject5823;
				if (arg9 && var20 == null && !var16 && !var17) {
					var20 = (Class_na) (var18.anObject5823 = var27.ga(null));
				}
			} else {
				if (var27 != null) {
					var15 = arg0.cd(var15, var27.m());
				}
				int var21 = var15;
				if (arg2 == Class476.aClass476_6898.anInt6882 && arg3 > 3) {
					var21 = var15 | 0x5;
				}
				var27 = this.method5899(arg0, var21, arg2, arg3, arg10, (byte) 15);
				if (var27 == null) {
					return null;
				}
				if (Class476.aClass476_6898.anInt6882 == arg2 && arg3 > 3) {
					var27.f(2048);
				}
				if (arg9 && !var16 && !var17) {
					var20 = var27.ga(null);
				}
				var27.KA(var15);
				var18 = new Class485(var27, var20);
				Class367 var22 = this.aClass463_5671.aClass367_5579;
				synchronized (this.aClass463_5671.aClass367_5579) {
					this.aClass463_5671.aClass367_5579.put(var18, var13);
				}
			}
			if (var16 || var17) {
				var27 = var27.method4446((byte) 0, var15, true);
				if (var16) {
					var27.pa(this.aByte5638, this.anInt5634, arg4, arg5, arg6, arg7, arg8);
				}
				if (var17) {
					var27.ia(this.anInt5664, this.anInt5665, this.anInt5666);
				}
				if (arg9) {
					var20 = var27.ga(null);
				}
				var27.KA(arg1);
			} else {
				var27 = var27.method4446((byte) 0, arg1, true);
			}
			this.aClass463_5671.aClass485_5582.anObject5824 = var27;
			this.aClass463_5671.aClass485_5582.anObject5823 = var20;
			return this.aClass463_5671.aClass485_5582;
		} catch (RuntimeException var26) {
			throw Class476.method5964(var26, "tp.s(" + ')');
		}
	}

	public final synchronized Class387 method5898(Class_ra arg0, int arg1, int arg2, int arg3, Class_xa arg4, Class_xa arg5, int arg6, int arg7, int arg8, Class477 arg9, Class481 arg10, int arg11) {
		try {
			if (Class432_Sub1_Sub1_Sub1.method5459(arg2, (byte) 0)) {
				arg2 = Class476.aClass476_6899.anInt6882;
			}
			long var13 = (long) (arg3 + (this.anInt5657 << 10) + (arg2 << 3));
			int var15 = arg1;
			var13 |= arg0.anInt4226 << 29;
			if (arg10 != null) {
				var13 |= arg10.aLong5767 << 32;
			}
			if (arg9 != null) {
				arg1 |= arg9.method5975(-13338400);
			}
			if (this.aByte5638 == 3) {
				arg1 |= 0x7;
			} else {
				if (this.aByte5638 != 0 || this.anInt5665 != 0) {
					arg1 |= 0x2;
				}
				if (this.anInt5664 != 0) {
					arg1 |= 0x1;
				}
				if (this.anInt5666 != 0) {
					arg1 |= 0x4;
				}
			}
			if (Class476.aClass476_6898.anInt6882 == arg2 && arg3 > 3) {
				arg1 |= 0x5;
			}
			Class367 var17 = this.aClass463_5671.aClass367_5574;
			Class387 var16;
			synchronized (this.aClass463_5671.aClass367_5574) {
				var16 = (Class387) this.aClass463_5671.aClass367_5574.get(var13);
			}
			if (var16 == null || arg0.ct(var16.m(), arg1) != 0) {
				if (var16 != null) {
					arg1 = arg0.cd(arg1, var16.m());
				}
				var16 = this.method5899(arg0, arg1, arg2, arg3, arg10, (byte) 15);
				if (var16 == null) {
					return null;
				}
				var17 = this.aClass463_5671.aClass367_5574;
				synchronized (this.aClass463_5671.aClass367_5574) {
					this.aClass463_5671.aClass367_5574.put(var16, var13);
				}
			}
			boolean var23 = false;
			if (arg9 != null) {
				var16 = var16.method4446((byte) 1, arg1, true);
				var23 = true;
				arg9.method5976(var16, arg3 & 0x3, -494881896);
			}
			if (Class476.aClass476_6898.anInt6882 == arg2 && arg3 > 3) {
				if (!var23) {
					var16 = var16.method4446((byte) 3, arg1, true);
					var23 = true;
				}
				var16.f(2048);
			}
			if (this.aByte5638 != 0) {
				if (!var23) {
					var16 = var16.method4446((byte) 3, arg1, true);
					var23 = true;
				}
				var16.pa(this.aByte5638, this.anInt5634, arg4, arg5, arg6, arg7, arg8);
			}
			if (this.anInt5664 != 0 || this.anInt5665 != 0 || this.anInt5666 != 0) {
				if (!var23) {
					var16 = var16.method4446((byte) 3, arg1, true);
					var23 = true;
				}
				var16.ia(this.anInt5664, this.anInt5665, this.anInt5666);
			}
			if (var23) {
				var16.KA(var15);
			}
			return var16;
		} catch (RuntimeException var22) {
			throw Class476.method5964(var22, "tp.f(" + ')');
		}
	}

	public Class387 method5899(Class_ra arg0, int arg1, int arg2, int arg3, Class481 arg4, byte arg5) {
		try {
			int var7 = this.anInt5639 + 64;
			int var8 = this.anInt5691 + 850;
			int var9 = arg1;
			boolean var10 = this.aBoolean5656 || Class476.aClass476_6880.anInt6882 == arg2 && arg3 > 3;
			if (var10) {
				arg1 |= 0x10;
			}
			if (arg3 == 0) {
				if (this.anInt5658 != 128 || this.anInt5686 != 0) {
					arg1 |= 0x1;
				}
				if (this.anInt5660 != 128 || this.anInt5663 != 0) {
					arg1 |= 0x4;
				}
			} else {
				arg1 |= 0xD;
			}
			if (this.anInt5659 != 128 || this.anInt5619 != 0) {
				arg1 |= 0x2;
			}
			if (this.aShortArray5682 != null) {
				arg1 |= 0x4000;
			}
			if (this.aShortArray5625 != null) {
				arg1 |= 0x8000;
			}
			if (this.aByte5632 != 0) {
				arg1 |= 0x80000;
			}
			Class387 var11 = null;
			int var14;
			if (this.aByteArray5633 != null) {
				int var12 = -1;
				for (int var13 = 0; var13 < this.aByteArray5633.length; var13++) {
					if (this.aByteArray5633[var13] == arg2) {
						var12 = var13;
						break;
					}
				}
				if (var12 == -1) {
					return null;
				}
				int[] var32 = arg4 == null || arg4.anIntArray5768 == null ? this.anIntArrayArray5684[var12] : arg4.anIntArray5768;
				var14 = var32.length;
				if (var14 > 0) {
					long var15 = (long) arg0.anInt4226;
					int var17;
					for (var17 = 0; var17 < var14; var17++) {
						var15 = var15 * 67783L + (long) var32[var17];
					}
					Class367 var34 = this.aClass463_5671.aClass367_5578;
					synchronized (this.aClass463_5671.aClass367_5578) {
						var11 = (Class387) this.aClass463_5671.aClass367_5578.get(var15);
					}
					if (var11 != null) {
						if (var7 != var11.c()) {
							arg1 |= 0x1000;
						}
						if (var8 != var11.Z()) {
							arg1 |= 0x2000;
						}
					}
					if (var11 == null || arg0.ct(var11.m(), arg1) != 0) {
						var17 = arg1 | 0x1F01F;
						if (var11 != null) {
							var17 = arg0.cd(var17, var11.m());
						}
						Model var18 = null;
						Model[] var19 = this.aClass463_5671.aClass98Array5583;
						synchronized (this.aClass463_5671.aClass98Array5583) {
							int var20 = 0;
							while (true) {
								if (var20 >= var14) {
									if (var14 > 1) {
										var18 = new Model(this.aClass463_5671.aClass98Array5583, var14);
									}
									break;
								}
								IndexTable var21 = this.aClass463_5671.aClass280_5575;
								synchronized (this.aClass463_5671.aClass280_5575) {
									var18 = Model.loadModel(this.aClass463_5671.aClass280_5575, var32[var20], 0);
								}
								if (var18 == null) {
									return null;
								}
								if (var18.anInt881 < 13) {
									var18.method1196(2);
								}
								if (var14 > 1) {
									this.aClass463_5671.aClass98Array5583[var20] = var18;
								}
								var20++;
							}
						}
						var11 = arg0.cb(var18, var17, this.aClass463_5671.anInt5581, var7, var8);
						Class367 var35 = this.aClass463_5671.aClass367_5578;
						synchronized (this.aClass463_5671.aClass367_5578) {
							this.aClass463_5671.aClass367_5578.put(var11, var15);
						}
					}
				}
			}
			if (var11 == null) {
				return null;
			}
			Class387 var31 = var11.method4446((byte) 0, arg1, true);
			if (var7 != var11.c()) {
				var31.p(var7);
			}
			if (var8 != var11.Z()) {
				var31.Q(var8);
			}
			if (var10) {
				var31.wa();
			}
			if (arg2 == Class476.aClass476_6899.anInt6882 && arg3 > 3) {
				var31.S(2048);
				var31.ia(180, 0, -180);
			}
			int var30 = arg3 & 0x3;
			if (var30 == 1) {
				var31.S(4096);
			} else if (var30 == 2) {
				var31.S(8192);
			} else if (var30 == 3) {
				var31.S(12288);
			}
			short[] var33;
			if (this.aShortArray5682 != null) {
				if (arg4 == null || arg4.aShortArray5769 == null) {
					var33 = this.aShortArray5623;
				} else {
					var33 = arg4.aShortArray5769;
				}
				for (var14 = 0; var14 < this.aShortArray5682.length; var14++) {
					if (this.aByteArray5624 == null || var14 >= this.aByteArray5624.length) {
						var31.color(this.aShortArray5682[var14], var33[var14]);
					} else {
						var31.color(this.aShortArray5682[var14], aShortArray5631[this.aByteArray5624[var14] & 0xFF]);
					}
				}
			}
			if (this.aShortArray5625 != null) {
				if (arg4 == null || arg4.aShortArray5770 == null) {
					var33 = this.aShortArray5626;
				} else {
					var33 = arg4.aShortArray5770;
				}
				for (var14 = 0; var14 < this.aShortArray5625.length; var14++) {
					var31.paintTexture(this.aShortArray5625[var14], var33[var14]);
				}
			}
			if (this.aByte5632 != 0) {
				var31.PA(this.aByte5629, this.aByte5630, this.aByte5661, this.aByte5632 & 0xFF);
			}
			if (this.anInt5658 != 128 || this.anInt5659 != 128 || this.anInt5660 != 128) {
				var31.oa(this.anInt5658, this.anInt5659, this.anInt5660);
			}
			if (this.anInt5686 != 0 || this.anInt5619 != 0 || this.anInt5663 != 0) {
				var31.ia(this.anInt5686, this.anInt5619, this.anInt5663);
			}
			var31.KA(var9);
			return var31;
		} catch (RuntimeException var29) {
			throw Class476.method5964(var29, "tp.z(" + ')');
		}
	}

	public final Class473 method5900(Interface29 arg0, byte arg1) {
		try {
			int var3 = -1;
			if (this.anInt5672 != -1) {
				var3 = arg0.method310(this.anInt5672, -1792016667);
			} else if (this.anInt5673 != -1) {
				var3 = arg0.method306(this.anInt5673, 1964280124);
			}
			if (var3 >= 0 && var3 < this.anIntArray5678.length - 1) {
				return this.anIntArray5678[var3] == -1 ? null : this.aClass463_5671.method5705(this.anIntArray5678[var3], (byte) -64);
			} else {
				int var4 = this.anIntArray5678[this.anIntArray5678.length - 1];
				return var4 == -1 ? null : this.aClass463_5671.method5705(var4, (byte) -57);
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tp.w(" + ')');
		}
	}

	public int method5901(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_5687 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_5687.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tp.n(" + ')');
		}
	}

	public String method5902(int arg0, String arg1, int arg2) {
		try {
			if (this.aClass497_5687 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_5687.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tp.l(" + ')');
		}
	}

	public int method5903(int arg0) {
		try {
			if (this.anIntArray5644 != null) {
				if (this.anIntArray5644.length <= 1) {
					return this.anIntArray5644[0];
				}
				int var2 = (int) (Math.random() * 65535.0D);
				for (int var3 = 0; var3 < this.anIntArray5644.length; var3++) {
					if (var2 <= this.anIntArray5645[var3]) {
						return this.anIntArray5644[var3];
					}
					var2 -= this.anIntArray5645[var3];
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tp.u(" + ')');
		}
	}

	public boolean method5904(byte arg0) {
		try {
			return this.anIntArray5644 != null;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tp.k(" + ')');
		}
	}

	public int[] method5905(int arg0) {
		try {
			return this.anIntArray5644;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tp.x(" + ')');
		}
	}

	public boolean method5906(int arg0, int arg1) {
		try {
			if (this.anIntArray5644 != null && arg0 != -1) {
				for (int var3 = 0; var3 < this.anIntArray5644.length; var3++) {
					if (arg0 == this.anIntArray5644[var3]) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tp.g(" + ')');
		}
	}

	public boolean method5907(int arg0) {
		try {
			if (this.anIntArray5678 == null) {
				return this.anInt5650 != -1 || this.anIntArray5681 != null;
			}
			for (int var2 = 0; var2 < this.anIntArray5678.length; var2++) {
				if (this.anIntArray5678[var2] != -1) {
					Class473 var3 = this.aClass463_5671.method5705(this.anIntArray5678[var2], (byte) -96);
					if (var3.anInt5650 != -1 || var3.anIntArray5681 != null) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tp.b(" + ')');
		}
	}

	public int method5908(int arg0, int arg1) {
		try {
			return this.anIntArray5617 == null ? -1 : this.anIntArray5617[arg0];
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "tp.d(" + ')');
		}
	}

	public boolean method5909(byte arg0) {
		try {
			return this.anIntArray5644 != null && this.anIntArray5644.length > 1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tp.q(" + ')');
		}
	}

	public void method5910(int arg0) {
		try {
			if (this.anInt5637 == -1) {
				this.anInt5637 = 0;
				if (this.aByteArray5633 != null && this.aByteArray5633.length == 1 && Class476.aClass476_6898.anInt6882 == this.aByteArray5633[0]) {
					this.anInt5637 = 1;
				}
				for (int var2 = 0; var2 < 5; var2++) {
					if (this.aStringArray5649[var2] != null) {
						this.anInt5637 = 1;
						break;
					}
				}
			}
			if (this.anInt5640 == -1) {
				this.anInt5640 = this.anInt5635 == 0 ? 0 : 1;
			}
			if (this.method5904((byte) -29) || this.aBoolean5688 || this.anIntArray5678 != null) {
				this.aBoolean5692 = true;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tp.i(" + ')');
		}
	}

	public static String method5911(IComponentDefinitions arg0, int arg1) {
		try {
			if (client.method3924(arg0).method3265((byte) 1) == 0) {
				return null;
			} else if (arg0.aString1194 == null || arg0.aString1194.trim().length() == 0) {
				return client.aBoolean9161 ? "Hidden-use" : null;
			} else {
				return arg0.aString1194;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "tp.mh(" + ')');
		}
	}

	public static void method5912(int arg0, boolean arg1, int arg2) {
		try {
			Class330_Sub1 var3 = Class321.method3178(arg0, arg1, (short) 10814);
			if (var3 != null) {
				for (int var4 = 0; var4 < var3.anIntArray7500.length; var4++) {
					var3.anIntArray7500[var4] = -1;
					var3.anIntArray7497[var4] = 0;
				}
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "tp.z(" + ')');
		}
	}

	public static final void method5913(IComponentDefinitions arg0, Class120 arg1, Class430 arg2, int arg3) {
		try {
			arg2.anInt4376 -= 4;
			arg0.anInt1192 = arg2.anIntArray4387[arg2.anInt4376];
			arg0.anInt1324 = arg2.anIntArray4387[arg2.anInt4376 + 1];
			int var4 = arg2.anIntArray4387[arg2.anInt4376 + 2];
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > 5) {
				var4 = 5;
			}
			int var5 = arg2.anIntArray4387[arg2.anInt4376 + 3];
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 5) {
				var5 = 5;
			}
			arg0.aByte1200 = (byte) var4;
			arg0.aByte1201 = (byte) var5;
			Class404.method4738(arg0, 1149708019);
			Class544.method6345(arg1, arg0, (byte) -55);
			if (arg0.anInt1198 == 0) {
				Class156.method1829(arg1, arg0, false, -168449002);
			}
			if (arg0.anInt1287 == -1 && !arg1.aBoolean1402) {
				Class119.method1438(arg0.anInt1196, -592236977);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "tp.co(" + ')');
		}
	}

	public static void method5914(Class_ra arg0, int arg1, int arg2, IComponentDefinitions arg3, int arg4) {
		try {
			byte var5 = 63;
			byte var6 = 7;
			for (int var7 = 63; var7 >= 0; var7--) {
				int var8 = (var7 & 0x3F) << 10 | (var6 & 0x7) << 7 | var5 & 0x7F;
				Class318.method3166(false, true, -1368286637);
				int var9 = Console.colorArray[var8];
				Class95_Sub12.method1137(false, true, 1727231043);
				arg0.B(arg1, arg2 + ((63 - var7) * arg3.anInt1348 >> 6), arg3.anInt1210, (arg3.anInt1348 >> 6) + 1, var9 | 0xFF000000, 0);
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "tp.r(" + ')');
		}
	}
}
