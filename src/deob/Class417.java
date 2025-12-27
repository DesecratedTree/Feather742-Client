package deob;

import java.awt.Frame;

public class Class417 {

	public int anInt4273 = 4;

	public int[] anIntArray4274 = null;

	public int[] anIntArray4275 = null;

	public int anInt4290 = 4;

	public int anInt4278 = 4;

	public int anInt4279 = 7;

	public int anInt4282 = -1;

	public boolean aBoolean4285 = true;

	public boolean aBoolean4288 = true;

	public int anInt4289 = 2;

	public boolean aBoolean4276 = true;

	public int anInt4283 = 3;

	public int anInt4281 = -1;

	public int anInt4293 = -1;

	public static int anInt4277 = 4;

	public static int anInt4280 = 7;

	public static int anInt4291 = 4;

	public static int anInt4292 = 4;

	public int anInt4272;

	public int anInt4284;

	public short[][] aShortArrayArray4286;

	public short[][][] aShortArrayArrayArray4287;

	public Class417(IndexTable arg0) {
		byte[] var2 = arg0.method2761(Class420.aClass420_4301.anInt4307, 1734979603);
		this.method5262(new Buffer(var2), (byte) -35);
	}

	public void method5262(Buffer arg0, byte arg1) {
		try {
			boolean var3 = false;
			while (true) {
				while (true) {
					int var4 = arg0.readUnsignedByte(85719444);
					if (var4 == 0) {
						if (arg1 >= 1) {
							return;
						}
						if (!var3) {
							if (this.anIntArray4274 == null) {
								this.anInt4273 = 4;
								this.anIntArray4274 = new int[4];
								this.anIntArray4275 = new int[4];
							}
							for (var4 = 0; var4 < this.anIntArray4274.length; var4++) {
								this.anIntArray4274[var4] = 0;
								this.anIntArray4275[var4] = var4 * 20;
							}
						}
						return;
					}
					int var5;
					if (var4 == 1) {
						if (this.anIntArray4274 == null) {
							this.anInt4273 = 4;
							this.anIntArray4274 = new int[4];
							this.anIntArray4275 = new int[4];
						}
						for (var5 = 0; var5 < this.anIntArray4274.length; var5++) {
							this.anIntArray4274[var5] = arg0.readShort(-1100583751);
							this.anIntArray4275[var5] = arg0.readShort(-1100583751);
						}
						var3 = true;
					} else if (var4 == 2) {
						this.anInt4282 = arg0.readBigSmart(-1788835665);
					} else if (var4 == 3) {
						this.anInt4273 = arg0.readUnsignedByte(404441697);
						this.anIntArray4274 = new int[this.anInt4273];
						this.anIntArray4275 = new int[this.anInt4273];
					} else if (var4 == 4) {
						this.aBoolean4285 = false;
					} else if (var4 == 5) {
						this.anInt4272 = arg0.readUnsignedTriByte(-1401356047);
					} else if (var4 == 6) {
						this.anInt4284 = arg0.readUnsignedTriByte(-1401356047);
					} else if (var4 == 7) {
						this.aShortArrayArray4286 = new short[10][4];
						this.aShortArrayArrayArray4287 = new short[10][4][];
						for (var5 = 0; var5 < 10; var5++) {
							for (int var6 = 0; var6 < 4; var6++) {
								int var7 = arg0.readUnsignedShort(-293304983);
								if (var7 == 65535) {
									var7 = -1;
								}
								this.aShortArrayArray4286[var5][var6] = (short) var7;
								int var8 = arg0.readUnsignedShort(800949737);
								this.aShortArrayArrayArray4287[var5][var6] = new short[var8];
								for (int var9 = 0; var9 < var8; var9++) {
									int var10 = arg0.readUnsignedShort(1871490898);
									if (var10 == 65535) {
										var10 = -1;
									}
									this.aShortArrayArrayArray4287[var5][var6][var9] = (short) var10;
								}
							}
						}
					} else if (var4 == 8) {
						this.aBoolean4288 = false;
					} else if (var4 == 9) {
						this.anInt4289 = arg0.readUnsignedByte(1589153418);
					} else if (var4 == 10) {
						this.aBoolean4276 = false;
					} else if (var4 == 11) {
						this.anInt4283 = arg0.readUnsignedByte(1968251310);
					} else if (var4 == 12) {
						this.anInt4281 = arg0.readUnsignedShort(73008452);
						this.anInt4293 = arg0.readUnsignedShort(1532066223);
					} else if (var4 == 13) {
						this.anInt4278 = arg0.readUnsignedByte(286251521);
					} else if (var4 == 14) {
						this.anInt4290 = arg0.readUnsignedByte(1159722223);
					} else if (var4 == 15) {
						this.anInt4279 = arg0.readUnsignedByte(405436408);
					}
				}
			}
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "ri.r(" + ')');
		}
	}

	public static final void method5263(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			arg0.anObjectArray4386[++arg0.anInt4378 - 1] = Class556.aClass510_6392.getItemDefinitions(var2, (byte) -101).name;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ri.aap(" + ')');
		}
	}

	public static final void method5264(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = client.anInt9264;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ri.acz(" + ')');
		}
	}

	public static final void method5265(Class430 arg0, int arg1) {
		try {
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = Class363.method4260(728983736);
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "ri.aea(" + ')');
		}
	}

	public static void method5266(int arg0) {
		try {
			Class367 var1 = Class459.aClass367_5566;
			synchronized (Class459.aClass367_5566) {
				Class459.aClass367_5566.method4296(-897157363);
			}
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ri.o(" + ')');
		}
	}

	public static final void method5267(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			IComponentDefinitions var3 = Class95.method1101(var2, -1001187088);
			Class120 var4 = Class3.aClass120Array56[var2 >> 16];
			Class439.method5599(var3, var4, false, 1, arg0, (byte) 31);
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "ri.hd(" + ')');
		}
	}

	public static void method5268(Class504 arg0, Frame arg1, int arg2) {
		try {
			arg0.method6139(-870737308);
			arg1.setVisible(false);
			arg1.dispose();
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "ri.i(" + ')');
		}
	}
}
