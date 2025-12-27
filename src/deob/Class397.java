package deob;

import java.util.Iterator;

public abstract class Class397 {

	public Class471 aClass471_4111 = new Class471();

	public long aLong4110 = -1L;

	public long aLong4109 = -1L;

	public int anInt4112 = -1;

	public int anInt4113 = -1;

	public void method4656(int arg0) {
		try {
			if (this.method4663(-136796357)) {
				Class330_Sub34 var2 = null;
				int var3 = 0;
				int var4 = 0;
				int var5 = 0;
				Iterator var6 = this.aClass471_4111.iterator();
				label108: while (true) {
					while (true) {
						if (!var6.hasNext()) {
							break label108;
						}
						Class330_Sub44 var7 = (Class330_Sub44) var6.next();
						if (var2 != null && var2.aClass330_Sub46_Sub2_7729.offset - var3 >= 252 - (this.method4660(733068164) + 6)) {
							if (arg0 == 35438517) {
							}
							break label108;
						}
						var7.method3252(-495503643);
						int var8 = var7.method3711(505802267);
						if (var8 < -1) {
							var8 = -1;
						} else if (var8 > 65534) {
							var8 = 65534;
						}
						int var9 = var7.method3710((byte) -92);
						if (var9 < -1) {
							var9 = -1;
						} else if (var9 > 65534) {
							var9 = 65534;
						}
						if (this.anInt4112 == var9 && this.anInt4113 == var8) {
							var7.method3714(-585860093);
						} else {
							if (var2 == null) {
								var2 = this.method4664(473915597);
								var2.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 53);
								var3 = var2.aClass330_Sub46_Sub2_7729.offset;
								var2.aClass330_Sub46_Sub2_7729.offset += 2;
								var4 = 0;
								var5 = 0;
							}
							int var10;
							int var11;
							int var12;
							if (this.aLong4109 == -1L) {
								var10 = var9;
								var11 = var8;
								var12 = Integer.MAX_VALUE;
							} else {
								var10 = var9 - this.anInt4112;
								var11 = var8 - this.anInt4113;
								var12 = (int) ((var7.method3724(-2040230020) - this.aLong4109) / 20L);
								var4 = (int) ((long) var4 + (var7.method3724(1639110254) - this.aLong4109) % 20L);
							}
							this.anInt4112 = var9;
							this.anInt4113 = var8;
							if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
								var10 += 32;
								var11 += 32;
								var2.aClass330_Sub46_Sub2_7729.addShort(var11 + (var10 << 6) + (var12 << 12), (byte) 63);
							} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
								var10 += 128;
								var11 += 128;
								var2.aClass330_Sub46_Sub2_7729.addByte(var12 + 128, (byte) 57);
								var2.aClass330_Sub46_Sub2_7729.addShort(var11 + (var10 << 8), (byte) 95);
							} else if (var12 < 32) {
								var2.aClass330_Sub46_Sub2_7729.addByte(var12 + 192, (byte) 37);
								if (var9 == -1 || var8 == -1) {
									var2.aClass330_Sub46_Sub2_7729.addInt(Integer.MIN_VALUE, 1965508160);
								} else {
									var2.aClass330_Sub46_Sub2_7729.addInt(var9 | var8 << 16, 1965508160);
								}
							} else {
								var2.aClass330_Sub46_Sub2_7729.addShort((var12 & 0x1FFF) + 57344, (byte) 24);
								if (var9 == -1 || var8 == -1) {
									var2.aClass330_Sub46_Sub2_7729.addInt(Integer.MIN_VALUE, 1965508160);
								} else {
									var2.aClass330_Sub46_Sub2_7729.addInt(var9 | var8 << 16, 1965508160);
								}
							}
							var5++;
							this.method4661(var2.aClass330_Sub46_Sub2_7729, var7, (byte) -65);
							this.aLong4109 = var7.method3724(178194263);
							var7.method3714(-1011690686);
						}
					}
				}
				if (var2 != null) {
					var2.aClass330_Sub46_Sub2_7729.method3751(var2.aClass330_Sub46_Sub2_7729.offset - var3, -681932400);
					int var14 = var2.aClass330_Sub46_Sub2_7729.offset;
					var2.aClass330_Sub46_Sub2_7729.offset = var3;
					var2.aClass330_Sub46_Sub2_7729.addByte(var4 / var5, (byte) 66);
					var2.aClass330_Sub46_Sub2_7729.addByte(var4 % var5, (byte) 62);
					var2.aClass330_Sub46_Sub2_7729.offset = var14;
					client.aClass1_9025.method378(var2, -862066837);
				}
			}
			this.method4662(579715627);
		} catch (RuntimeException var13) {
			throw Class476.method5964(var13, "qk.r(" + ')');
		}
	}

	public int method4659(Class330_Sub44 arg0, int arg1, int arg2) {
		try {
			long var4;
			if (this.aLong4110 == -1L) {
				var4 = arg1;
			} else {
				var4 = arg0.method3724(-1517548867) - this.aLong4110;
				if (var4 > (long) arg1) {
					var4 = arg1;
				}
			}
			this.aLong4110 = arg0.method3724(-534298900);
			return (int) var4;
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "qk.p(" + ')');
		}
	}

	public void method4669(int arg0) {
		try {
			this.aClass471_4111.method5866(613065745);
			this.aLong4110 = -1L;
			this.aLong4109 = -1L;
			this.anInt4112 = -1;
			this.anInt4113 = -1;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "qk.j(" + ')');
		}
	}

	public void method4673(Class330_Sub44 arg0, byte arg1) {
		try {
			this.aClass471_4111.method5878(arg0, (short) 8192);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qk.i(" + ')');
		}
	}

	public static final void method4677(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1535049165);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class404.method4734(var3, var4, arg0, 2137973521);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qk.eh(" + ')');
		}
	}

	public static Class487 method4678(String arg0, int arg1, int arg2) {
		try {
			Class487_Sub1 var3 = new Class487_Sub1();
			var3.aString5827 = arg0;
			var3.anInt5826 = arg1 * 844913665;
			return var3;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "qk.r(" + ')');
		}
	}

	public static short[][] method4679(float[][] arg0, short[][] arg1, byte arg2) {
		try {
			for (int var3 = 0; var3 < arg0.length; var3++) {
				for (int var4 = 0; var4 < arg1[var3].length; var4++) {
					arg1[var3][var4] = (short) (arg0[var3][var4] * 16383.0F);
				}
			}
			return arg1;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "qk.n(" + ')');
		}
	}

	public abstract Class330_Sub34 method4657();

	public abstract void method4658(Buffer arg0, Class330_Sub44 arg1);

	public abstract int method4660(int arg0);

	public abstract void method4661(Buffer arg0, Class330_Sub44 arg1, byte arg2);

	public abstract void method4662(int arg0);

	public abstract boolean method4663(int arg0);

	public abstract Class330_Sub34 method4664(int arg0);

	public abstract void method4665();

	public abstract void method4666();

	public abstract boolean method4667();

	public abstract boolean method4668();

	public abstract int method4670();

	public abstract int method4671();

	public abstract void method4672(Buffer arg0, Class330_Sub44 arg1);

	public abstract void method4674();

	public abstract Class330_Sub34 method4675();

	public abstract void method4676(Buffer arg0, Class330_Sub44 arg1);
}
