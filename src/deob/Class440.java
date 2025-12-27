package deob;

public class Class440 {

	public static boolean aBoolean4457 = false;

	public int anInt4464 = -1;

	public int anInt4470 = 5;

	public int anInt4474 = -1;

	public int anInt4462 = -1;

	public int anInt4469 = 99;

	public int anInt4477 = -1;

	public int anInt4460 = -1;

	public int anInt4472 = 2;

	public boolean aBoolean4473 = false;

	public boolean aBoolean4479 = false;

	public boolean aBoolean4475 = false;

	public int anInt4480 = -1;

	public int anInt4459;

	public static int anInt4482;

	public Class436 aClass436_4458;

	public Class497 aClass497_4467;

	public static Class8 aClass8_4483;

	public int[] anIntArray4461;

	public int[] anIntArray4466;

	public int[] anIntArray4468;

	public int[] anIntArray4471;

	public int[] anIntArray4476;

	public int[] anIntArray4478;

	public static Class489[] aClass489Array4481;

	public boolean[] aBooleanArray4465;

	public int[][] anIntArrayArray4463;

	public boolean method5600(int arg0) {
		try {
			if (this.anIntArray4471 == null) {
				return true;
			}
			boolean var2 = true;
			int[] var3 = this.anIntArray4471;
			for (int var4 = 0; var4 < var3.length; var4++) {
				int var5 = var3[var4];
				if (this.aClass436_4458.method5574(var5 >>> 16, -107490936) == null) {
					var2 = false;
				}
			}
			return var2;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "sf.p(" + ')');
		}
	}

	public void method5601(Buffer arg0, int arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-222784225);
				if (var3 == 0) {
					if (arg1 != 1039140702) {
					}
					return;
				}
				this.method5602(arg0, var3, 723339666);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "sf.r(" + ')');
		}
	}

	public void method5602(Buffer arg0, int arg1, int arg2) {
		try {
			int var4;
			int var5;
			if (arg1 == 1) {
				var4 = arg0.readUnsignedShort(989694058);
				this.anIntArray4466 = new int[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray4466[var5] = arg0.readUnsignedShort(972028286);
				}
				this.anIntArray4471 = new int[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray4471[var5] = arg0.readUnsignedShort(-57869157);
				}
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray4471[var5] += arg0.readUnsignedShort(1770465606) << 16;
				}
			} else if (arg1 == 2) {
				this.anInt4464 = arg0.readUnsignedShort(1902356571);
			} else if (arg1 == 3) {
				this.aBooleanArray4465 = new boolean[256];
				var4 = arg0.readUnsignedByte(1784349458);
				for (var5 = 0; var5 < var4; var5++) {
					this.aBooleanArray4465[arg0.readUnsignedByte(-232329253)] = true;
				}
			} else if (arg1 == 5) {
				this.anInt4470 = arg0.readUnsignedByte(1202023527);
			} else if (arg1 == 6) {
				this.anInt4474 = arg0.readUnsignedShort(1897123831);
			} else if (arg1 == 7) {
				this.anInt4462 = arg0.readUnsignedShort(-67380386);
			} else if (arg1 == 8) {
				this.anInt4469 = arg0.readUnsignedByte(-137066199);
			} else if (arg1 == 9) {
				this.anInt4477 = arg0.readUnsignedByte(236030852);
			} else if (arg1 == 10) {
				this.anInt4460 = arg0.readUnsignedByte(1758772250);
			} else if (arg1 == 11) {
				this.anInt4472 = arg0.readUnsignedByte(-96444664);
			} else if (arg1 == 12) {
				var4 = arg0.readUnsignedByte(48551826);
				this.anIntArray4461 = new int[var4];
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray4461[var5] = arg0.readUnsignedShort(1681041407);
				}
				for (var5 = 0; var5 < var4; var5++) {
					this.anIntArray4461[var5] += arg0.readUnsignedShort(1188850609) << 16;
				}
			} else {
				int var7;
				if (arg1 == 13) {
					var4 = arg0.readUnsignedShort(-43639832);
					this.anIntArrayArray4463 = new int[var4][];
					for (var5 = 0; var5 < var4; var5++) {
						int var6 = arg0.readUnsignedByte(-120787933);
						if (var6 > 0) {
							this.anIntArrayArray4463[var5] = new int[var6];
							this.anIntArrayArray4463[var5][0] = arg0.readUnsignedTriByte(-1401356047);
							for (var7 = 1; var7 < var6; var7++) {
								this.anIntArrayArray4463[var5][var7] = arg0.readUnsignedShort(1333908566);
							}
						}
					}
				} else if (arg1 == 14) {
					this.aBoolean4473 = true;
				} else if (arg1 == 15) {
					this.aBoolean4479 = true;
				} else if (arg1 == 16) {
					if (arg2 <= 626970176) {
					}
				} else if (arg1 == 18) {
					this.aBoolean4475 = true;
				} else if (arg1 == 19) {
					if (this.anIntArray4476 == null) {
						this.anIntArray4476 = new int[this.anIntArrayArray4463.length];
						for (var4 = 0; var4 < this.anIntArrayArray4463.length; var4++) {
							this.anIntArray4476[var4] = 255;
						}
					}
					this.anIntArray4476[arg0.readUnsignedByte(917006959)] = arg0.readUnsignedByte(1143235980);
				} else if (arg1 == 20) {
					if (this.anIntArray4468 == null || this.anIntArray4478 == null) {
						this.anIntArray4468 = new int[this.anIntArrayArray4463.length];
						this.anIntArray4478 = new int[this.anIntArrayArray4463.length];
						for (var4 = 0; var4 < this.anIntArrayArray4463.length; var4++) {
							this.anIntArray4468[var4] = 256;
							this.anIntArray4478[var4] = 256;
						}
					}
					var4 = arg0.readUnsignedByte(-100838560);
					this.anIntArray4468[var4] = arg0.readUnsignedShort(621617751);
					this.anIntArray4478[var4] = arg0.readUnsignedShort(1404685210);
				} else if (arg1 == 22) {
					this.anInt4480 = arg0.readUnsignedByte(854434700);
				} else if (arg1 == 249) {
					var4 = arg0.readUnsignedByte(-213747423);
					if (this.aClass497_4467 == null) {
						var5 = Class136.method1594(var4, 2127338250);
						this.aClass497_4467 = new Class497(var5);
					}
					for (var5 = 0; var5 < var4; var5++) {
						boolean var10 = arg0.readUnsignedByte(831389514) == 1;
						var7 = arg0.readUnsignedTriByte(-1401356047);
						Class330 var8;
						if (var10) {
							var8 = new Class330_Sub35(arg0.readString(1374053223));
						} else {
							var8 = new Class330_Sub23(arg0.readInt((byte) 5));
						}
						this.aClass497_4467.method6097(var8, (long) var7);
					}
				}
			}
		} catch (RuntimeException var9) {
			throw Class476.method5964(var9, "sf.j(" + ')');
		}
	}

	public int method5603(int arg0, int arg1, int arg2) {
		try {
			if (this.aClass497_4467 == null) {
				return arg1;
			} else {
				Class330_Sub23 var4 = (Class330_Sub23) this.aClass497_4467.method6094((long) arg0);
				return var4 == null ? arg1 : var4.anInt7693;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sf.o(" + ')');
		}
	}

	public String method5604(int arg0, String arg1, int arg2) {
		try {
			if (this.aClass497_4467 == null) {
				return arg1;
			} else {
				Class330_Sub35 var4 = (Class330_Sub35) this.aClass497_4467.method6094((long) arg0);
				return var4 == null ? arg1 : (String) var4.anObject7733;
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sf.s(" + ')');
		}
	}

	public void method5605(int arg0) {
		try {
			if (this.anInt4477 == -1) {
				if (this.aBooleanArray4465 == null) {
					this.anInt4477 = 0;
				} else {
					this.anInt4477 = 2;
				}
			}
			if (this.anInt4460 == -1) {
				if (this.aBooleanArray4465 == null) {
					this.anInt4460 = 0;
				} else {
					this.anInt4460 = 2;
				}
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sf.i(" + ')');
		}
	}

	public static final void method5606(Class430 arg0, int arg1) {
		try {
			Class426 var2 = arg0.aBoolean4398 ? arg0.aClass426_4384 : arg0.aClass426_4370;
			IComponentDefinitions var3 = var2.aClass114_4345;
			Class120 var4 = var2.aClass120_4346;
			Class395.method4646(var3, var4, arg0, 1047843340);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sf.hq(" + ')');
		}
	}

	public static void method5607(int arg0) {
		try {
			Class9.anInt140 = 0;
			Class9.anInt138 = -1;
			Class9.anInt146 = -1;
			Class9.anInt151 = -1;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "sf.r(" + ')');
		}
	}

	public static final void method5608(Class430 arg0, byte arg1) {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			ItemDefinitions var4 = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -34);
			if (var3 < 1 || var3 > 5 || var4.inventoryOptions[var3 - 1] == null) {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = "";
			} else {
				arg0.anObjectArray4386[++arg0.anInt4378 - 1] = var4.inventoryOptions[var3 - 1];
			}
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "sf.abx(" + ')');
		}
	}

	public static final void method5609(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class474.method5920(-439994178);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "sf.acl(" + ')');
		}
	}
}
