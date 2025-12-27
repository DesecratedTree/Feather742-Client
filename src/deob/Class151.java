package deob;

public class Class151 implements Interface21 {

	public int[] anIntArray6668 = new int[] { -1, -1, -1, -1, -1 };

	public static int[] anIntArray6669 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	public static int[] anIntArray6667 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	public static int anInt6671;

	public Class169 aClass169_6661;

	public byte[] aByteArray6666;

	public byte[] aByteArray6670;

	public int[] anIntArray6665;

	public short[] aShortArray6660;

	public short[] aShortArray6662;

	public short[] aShortArray6663;

	public short[] aShortArray6664;

	public void method1774(Buffer arg0, byte arg1) {
		try {
			while (true) {
				int var3 = arg0.readUnsignedByte(-52970576);
				if (var3 == 0) {
					if (arg1 <= 16) {
					}
					return;
				}
				this.method1775(arg0, var3, (byte) 6);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "gd.r(" + ')');
		}
	}

	public void method1775(Buffer arg0, int arg1, byte arg2) {
		try {
			if (arg1 == 1) {
				arg0.readUnsignedByte(-166547034);
			} else {
				int var4;
				int var5;
				if (arg1 == 2) {
					var4 = arg0.readUnsignedByte(-272178801);
					this.anIntArray6665 = new int[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.anIntArray6665[var5] = arg0.readBigSmart(-1009147701);
					}
				} else if (arg1 == 3) {
					if (arg2 == 1) {
					}
				} else if (arg1 == 40) {
					var4 = arg0.readUnsignedByte(-310766364);
					this.aShortArray6662 = new short[var4];
					this.aShortArray6663 = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.aShortArray6662[var5] = (short) arg0.readUnsignedShort(-245223536);
						this.aShortArray6663[var5] = (short) arg0.readUnsignedShort(591825377);
					}
				} else if (arg1 == 41) {
					var4 = arg0.readUnsignedByte(2123149401);
					this.aShortArray6664 = new short[var4];
					this.aShortArray6660 = new short[var4];
					for (var5 = 0; var5 < var4; var5++) {
						this.aShortArray6664[var5] = (short) arg0.readUnsignedShort(1778287785);
						this.aShortArray6660[var5] = (short) arg0.readUnsignedShort(-76461780);
					}
				} else {
					int var6;
					int var7;
					byte var9;
					if (arg1 == 44) {
						var4 = arg0.readUnsignedShort(148486881);
						var5 = 0;
						for (var6 = var4; var6 > 0; var6 >>= 0x1) {
							var5++;
						}
						this.aByteArray6666 = new byte[var5];
						var9 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray6666[var7] = var9++;
							} else {
								this.aByteArray6666[var7] = -1;
							}
						}
					} else if (arg1 == 45) {
						var4 = arg0.readUnsignedShort(521654237);
						var5 = 0;
						for (var6 = var4; var6 > 0; var6 >>= 0x1) {
							var5++;
						}
						this.aByteArray6670 = new byte[var5];
						var9 = 0;
						for (var7 = 0; var7 < var5; var7++) {
							if ((var4 & 0x1 << var7) > 0) {
								this.aByteArray6670[var7] = var9++;
							} else {
								this.aByteArray6670[var7] = -1;
							}
						}
					} else if (arg1 >= 60 && arg1 < 70) {
						this.anIntArray6668[arg1 - 60] = arg0.readBigSmart(-1047249075);
					}
				}
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "gd.j(" + ')');
		}
	}

	public boolean method1776(int arg0) {
		try {
			if (this.anIntArray6665 == null) {
				return true;
			}
			boolean var2 = true;
			IndexTable var3 = this.aClass169_6661.aClass280_6761;
			synchronized (this.aClass169_6661.aClass280_6761) {
				for (int var4 = 0; var4 < this.anIntArray6665.length; var4++) {
					if (!this.aClass169_6661.aClass280_6761.hasStoredFile(this.anIntArray6665[var4], 0, (byte) 32)) {
						var2 = false;
					}
				}
				return var2;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gd.i(" + ')');
		}
	}

	public boolean method1777(short arg0) {
		try {
			boolean var2 = true;
			IndexTable var3 = this.aClass169_6661.aClass280_6761;
			synchronized (this.aClass169_6661.aClass280_6761) {
				for (int var4 = 0; var4 < 5; var4++) {
					if (this.anIntArray6668[var4] != -1 && !this.aClass169_6661.aClass280_6761.hasStoredFile(this.anIntArray6668[var4], 0, (byte) 32)) {
						var2 = false;
					}
				}
				return var2;
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gd.o(" + ')');
		}
	}

	public Model method1778(int arg0) {
		try {
			Model[] var2 = new Model[5];
			int var3 = 0;
			IndexTable var4 = this.aClass169_6661.aClass280_6761;
			int var5;
			synchronized (this.aClass169_6661.aClass280_6761) {
				var5 = 0;
				while (true) {
					if (var5 >= 5) {
						break;
					}
					if (this.anIntArray6668[var5] != -1) {
						var2[var3++] = Model.loadModel(this.aClass169_6661.aClass280_6761, this.anIntArray6668[var5], 0);
					}
					var5++;
				}
			}
			for (int var9 = 0; var9 < 5; var9++) {
				if (var2[var9] != null && var2[var9].anInt881 < 13) {
					var2[var9].method1196(2);
				}
			}
			Model var10 = new Model(var2, var3);
			if (this.aShortArray6662 != null) {
				for (var5 = 0; var5 < this.aShortArray6662.length; var5++) {
					var10.color(this.aShortArray6662[var5], this.aShortArray6663[var5]);
				}
			}
			if (this.aShortArray6664 != null) {
				for (var5 = 0; var5 < this.aShortArray6664.length; var5++) {
					var10.method1200(this.aShortArray6664[var5], this.aShortArray6660[var5]);
				}
			}
			return var10;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "gd.s(" + ')');
		}
	}

	public Model method1779(byte arg0) {
		try {
			if (this.anIntArray6665 == null) {
				return null;
			}
			Model[] var2 = new Model[this.anIntArray6665.length];
			IndexTable var3 = this.aClass169_6661.aClass280_6761;
			int var4;
			synchronized (this.aClass169_6661.aClass280_6761) {
				var4 = 0;
				while (true) {
					if (var4 >= this.anIntArray6665.length) {
						break;
					}
					var2[var4] = Model.loadModel(this.aClass169_6661.aClass280_6761, this.anIntArray6665[var4], 0);
					var4++;
				}
			}
			for (int var8 = 0; var8 < this.anIntArray6665.length; var8++) {
				if (var2[var8].anInt881 < 13) {
					var2[var8].method1196(2);
				}
			}
			Model var9;
			if (var2.length == 1) {
				var9 = var2[0];
			} else {
				var9 = new Model(var2, var2.length);
			}
			if (var9 == null) {
				return null;
			}
			if (this.aShortArray6662 != null) {
				for (var4 = 0; var4 < this.aShortArray6662.length; var4++) {
					var9.color(this.aShortArray6662[var4], this.aShortArray6663[var4]);
				}
			}
			if (this.aShortArray6664 != null) {
				for (var4 = 0; var4 < this.aShortArray6664.length; var4++) {
					var9.method1200(this.aShortArray6664[var4], this.aShortArray6660[var4]);
				}
			}
			return var9;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "gd.p(" + ')');
		}
	}

	public static final void method1780(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = arg0.aClass154_4391.aBoolean1642 ? 1 : 0;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gd.xw(" + ')');
		}
	}

	public static final void method1781(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			if (client.anInt9257 == 2 && var2 < client.anInt9256) {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.aClass99Array9259[var2].anInt911;
			} else {
				arg0.anIntArray4387[++arg0.anInt4376 - 1] = 0;
			}
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "gd.wv(" + ')');
		}
	}
}
