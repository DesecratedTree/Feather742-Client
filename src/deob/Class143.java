package deob;

public class Class143 {

	public int[] anIntArray1570;

	public byte[] aByteArray1569;

	public int[] anIntArray1571;

	public Class143(byte[] arg0) {
		int var2 = arg0.length;
		this.anIntArray1570 = new int[var2];
		this.aByteArray1569 = arg0;
		int[] var3 = new int[33];
		this.anIntArray1571 = new int[8];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = arg0[var5];
			if (var6 != 0) {
				int var7 = 0x1 << 32 - var6;
				int var8 = var3[var6];
				this.anIntArray1570[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) == 0) {
					var9 = var8 | var7;
					for (var10 = var6 - 1; var10 >= 1; var10--) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}
						var12 = 0x1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}
						var3[var10] = var11 | var12;
					}
				} else {
					var9 = var3[var6 - 1];
				}
				var3[var6] = var9;
				for (var10 = var6 + 1; var10 <= 32; var10++) {
					if (var3[var10] == var8) {
						var3[var10] = var9;
					}
				}
				var10 = 0;
				for (var11 = 0; var11 < var6; var11++) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) == 0) {
						var10++;
					} else {
						if (this.anIntArray1571[var10] == 0) {
							this.anIntArray1571[var10] = var4;
						}
						var10 = this.anIntArray1571[var10];
					}
					if (var10 >= this.anIntArray1571.length) {
						int[] var13 = new int[this.anIntArray1571.length * 2];
						for (int var14 = 0; var14 < this.anIntArray1571.length; var14++) {
							var13[var14] = this.anIntArray1571[var14];
						}
						this.anIntArray1571 = var13;
					}
					var12 >>>= 0x1;
				}
				this.anIntArray1571[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}
	}

	public int method1657(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg4 == 0) {
				return 0;
			}
			int var7 = 0;
			int var12 = arg4 + arg3;
			int var8 = arg1;
			while (true) {
				byte var9 = arg0[var8];
				if (var9 < 0) {
					var7 = this.anIntArray1571[var7];
				} else {
					var7++;
				}
				int var10;
				if ((var10 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var10;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
							throw new IllegalStateException();
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x40) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var13;
				if ((var13 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var13;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
							throw new IllegalStateException();
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x20) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var14;
				if ((var14 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var14;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x10) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var15;
				if ((var15 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var15;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
							throw new IllegalStateException();
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x8) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var16;
				if ((var16 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var16;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x4) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var17;
				if ((var17 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var17;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x2) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var18;
				if ((var18 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var18;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
							throw new IllegalStateException();
						}
						break;
					}
					var7 = 0;
				}
				if ((var9 & 0x1) == 0) {
					var7++;
				} else {
					var7 = this.anIntArray1571[var7];
				}
				int var19;
				if ((var19 = this.anIntArray1571[var7]) < 0) {
					arg2[arg3++] = (byte) ~var19;
					if (arg3 >= var12) {
						if (arg5 == -1776800485) {
						}
						break;
					}
					var7 = 0;
				}
				var8++;
			}
			return var8 + 1 - arg1;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "fu.j(" + ')');
		}
	}

	public int method1658(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
		try {
			int var7 = 0;
			int var8 = arg4 << 3;
			int var16 = arg2 + arg1;
			while (arg1 < var16) {
				int var9 = arg0[arg1] & 0xFF;
				int var10 = this.anIntArray1570[var9];
				byte var11 = this.aByteArray1569[var9];
				if (var11 == 0) {
					throw new RuntimeException("" + var9);
				}
				int var12 = var8 >> 3;
				int var13 = var8 & 0x7;
				var7 &= -var13 >> 31;
				int var14 = (var13 + var11 - 1 >> 3) + var12;
				int var17 = var13 + 24;
				arg3[var12] = (byte) (var7 |= var10 >>> var17);
				if (var12 < var14) {
					var12++;
					var13 = var17 - 8;
					arg3[var12] = (byte) (var7 = var10 >>> var13);
					if (var12 < var14) {
						var12++;
						var13 -= 8;
						arg3[var12] = (byte) (var7 = var10 >>> var13);
						if (var12 < var14) {
							var12++;
							var13 -= 8;
							arg3[var12] = (byte) (var7 = var10 >>> var13);
							if (var12 < var14) {
								var12++;
								var13 -= 8;
								arg3[var12] = (byte) (var7 = var10 << -var13);
							} else if (arg5 != -1731548060) {
								throw new IllegalStateException();
							}
						} else if (arg5 != -1731548060) {
						}
					} else if (arg5 != -1731548060) {
						throw new IllegalStateException();
					}
				} else if (arg5 != -1731548060) {
					throw new IllegalStateException();
				}
				var8 += var11;
				arg1++;
			}
			return (var8 + 7 >> 3) - arg4;
		} catch (RuntimeException var15) {
			throw Class476.method5964(var15, "fu.r(" + ')');
		}
	}

	public static final byte[] method1659(byte[] arg0, short arg1) {
		try {
			Buffer var2 = new Buffer(arg0);
			int var3 = var2.readUnsignedByte(426393987);
			int var4 = var2.readInt((byte) 5);
			if (var4 < 0 || IndexTable.anInt2893 != 0 && var4 > IndexTable.anInt2893) {
				throw new RuntimeException();
			} else if (var3 == 0) {
				byte[] var11 = new byte[var4];
				var2.readBytes(var11, 0, var4, 1274334002);
				return var11;
			} else {
				int var5 = var2.readInt((byte) 43);
				if (var5 < 0 || IndexTable.anInt2893 != 0 && var5 > IndexTable.anInt2893 || var5 >= 2000000) {
					return new byte[1];
				}
				byte[] var6 = new byte[var5];
				if (var3 == 1) {
					Class466.method5843(var6, var5, arg0, var4, 9);
				} else {
					Class557 var7 = IndexTable.aClass557_2895;
					synchronized (IndexTable.aClass557_2895) {
						IndexTable.aClass557_2895.method6453(var2, var6, 1115965302);
					}
				}
				return var6;
			}
		} catch (RuntimeException var10) {
			throw Class476.method5964(var10, "fu.ap(" + ')');
		}
	}

	public static final void method1660(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class201_Sub2.method2170(var3, var4, arg0, 516920560);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "fu.ev(" + ')');
		}
	}

	public static int method1661(Class401_Sub1 arg0, Class401_Sub1 arg1, int arg2, boolean arg3, int arg4, boolean arg5, short arg6) {
		try {
			int var7 = Class437.method5589(arg0, arg1, arg2, arg3, 733265167);
			if (var7 != 0) {
				return arg3 ? -var7 : var7;
			} else if (arg4 == -1) {
				return 0;
			} else {
				int var8 = Class437.method5589(arg0, arg1, arg4, arg5, 619379285);
				return arg5 ? -var8 : var8;
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "fu.l(" + ')');
		}
	}

	public static byte method1662(int arg0, int arg1, int arg2) {
		try {
			if (arg0 == Class476.aClass476_6902.anInt6882) {
				return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fu.bs(" + ')');
		}
	}

	public static final String method1663(int arg0, int arg1) {
		try {
			String var2 = Integer.toString(arg0);
			for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
				var2 = var2.substring(0, var3) + Class215.aString2081 + var2.substring(var3);
			}
			if (var2.length() > 9) {
				return " " + Class146.method1738(65408, -849826454) + var2.substring(0, var2.length() - 8) + Class526.aClass526_6174.method6257(Class429.aClass454_4369, 991479434) + " (" + var2 + ")" + Class215.aString2079;
			} else if (var2.length() > 6) {
				return " " + Class146.method1738(16777215, -849826454) + var2.substring(0, var2.length() - 4) + Class526.aClass526_6176.method6257(Class429.aClass454_4369, 991479434) + " (" + var2 + ")" + Class215.aString2079;
			} else {
				return " " + Class146.method1738(16776960, -849826454) + var2 + Class215.aString2079;
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "fu.ke(" + ')');
		}
	}
}
