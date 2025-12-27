package deob;

public class Class416 {

	public Class367 aClass367_4267 = new Class367(64);

	public Class367 aClass367_4270 = new Class367(60);

	public IndexTable aClass280_4271;

	public IndexTable aClass280_4268;

	public int anInt4269;

	public Class416(Class435 arg0, Class454 arg1, IndexTable arg2, IndexTable arg3) {
		this.aClass280_4271 = arg2;
		this.aClass280_4268 = arg3;
		int var5 = this.aClass280_4271.method2764(2104710672) - 1;
		Class103.aClass103_927.method1226((byte) 0);
		this.aClass280_4271.method2763(var5, -2054015234);
	}

	public void method5250(int arg0, short arg1) {
		try {
			Class367 var3 = this.aClass367_4267;
			synchronized (this.aClass367_4267) {
				this.aClass367_4267.method4292(arg0, (byte) 118);
			}
			var3 = this.aClass367_4270;
			synchronized (this.aClass367_4270) {
				this.aClass367_4270.method4292(arg0, (byte) 113);
			}
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "rh.p(" + ')');
		}
	}

	public void method5251(int arg0, int arg1) {
		try {
			this.anInt4269 = arg0;
			Class367 var3 = this.aClass367_4270;
			synchronized (this.aClass367_4270) {
				this.aClass367_4270.method4298((byte) 79);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "rh.j(" + ')');
		}
	}

	public void method5252(int arg0) {
		try {
			Class367 var2 = this.aClass367_4267;
			synchronized (this.aClass367_4267) {
				this.aClass367_4267.method4296(-970046526);
			}
			var2 = this.aClass367_4270;
			synchronized (this.aClass367_4270) {
				this.aClass367_4270.method4296(-970674617);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "rh.o(" + ')');
		}
	}

	public void method5253(short arg0) {
		try {
			Class367 var2 = this.aClass367_4267;
			synchronized (this.aClass367_4267) {
				this.aClass367_4267.method4298((byte) 73);
			}
			var2 = this.aClass367_4270;
			synchronized (this.aClass367_4270) {
				this.aClass367_4270.method4298((byte) 114);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "rh.i(" + ')');
		}
	}

	public Class437 method5254(int arg0, int arg1) {
		try {
			Class367 var4 = this.aClass367_4267;
			Class437 var3;
			synchronized (this.aClass367_4267) {
				var3 = (Class437) this.aClass367_4267.get((long) arg0);
			}
			if (var3 != null) {
				return var3;
			}
			IndexTable var5 = this.aClass280_4271;
			byte[] var12;
			synchronized (this.aClass280_4271) {
				var12 = this.aClass280_4271.getFile(Class103.aClass103_927.method1228(arg0, 1491459717), Class103.aClass103_927.method1227(arg0, (byte) -32));
			}
			var3 = new Class437();
			var3.aClass416_4442 = this;
			var3.anInt4429 = arg0;
			if (var12 != null) {
				var3.method5580(new Buffer(var12), -1903137404);
			}
			Class367 var13 = this.aClass367_4267;
			synchronized (this.aClass367_4267) {
				this.aClass367_4267.put(var3, (long) arg0);
			}
			return var3;
		} catch (RuntimeException var11) {
			throw Class476.method5964(var11, "rh.r(" + ')');
		}
	}

	public static Class470[] method5255(int arg0) {
		try {
			return new Class470[] { Class470.aClass470_6864, Class470.aClass470_6866, Class470.aClass470_6865, Class470.aClass470_6869, Class470.aClass470_6863, Class470.aClass470_6871, Class470.aClass470_6867, Class470.aClass470_6868, Class470.aClass470_6873, Class470.aClass470_6876, Class470.aClass470_6870, Class470.aClass470_6872, Class470.aClass470_6874, Class470.aClass470_6875 };
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rh.r(" + ')');
		}
	}

	public static final void method5256(Class432_Sub1 arg0, int arg1, int arg2) {
		try {
			Class276.method2729(arg0, arg1, true, -2104233343);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rh.jm(" + ')');
		}
	}

	public static final void method5257(Class430 arg0, int arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class117 var3 = Class144.method1668(var2, (byte) 16);
			int var4 = -1;
			if (var3 != null) {
				var4 = var3.anInt1385;
			}
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var4;
		} catch (RuntimeException var5) {
			throw Class476.method5964(var5, "rh.acn(" + ')');
		}
	}

	public static final void method5258(int arg0) {
		try {
			Class141.aClass418_1566.method5272(5, (byte) 9);
			Class478.aClass499_5725.method6112(5, (byte) 0);
			Class425.aClass169_4344.method2028(5, -408081780);
			client.aClass304_9030.method3025((byte) 13).method5708(5, (byte) -4);
			Class158_Sub3.aClass553_8875.method6393(5, 1828251714);
			Class556.aClass510_6392.method6172(5, 1462668355);
			Class201.aClass436_6511.method5571(5, 807828311);
			Class136.aClass416_1527.method5250(5, (short) 25061);
			Class428.aClass370_4364.method4314(5, 1924694733);
			Class366_Sub4.aClass231_8007.method2348(5, -2123984948);
			Class499.aClass495_5893.method6088(5, -73159301);
			Class95_Sub10.aClass447_7170.method5623(5, 1560998046);
			Class95_Sub7.aClass536_7157.method6317(5, (byte) -122);
			Class128.aClass400_1478.method4701(5, 738589039);
			Class102.aClass362_924.method4252(5, (byte) -122);
			Class79.aClass380_666.method4389(5, (byte) 77);
			Class497.aClass552_5884.method6384(5, (short) -18019);
			Class301.aClass543_3059.method6341(5, (byte) -106);
			Class341.aClass342_3397.method3987(5, 1663084328);
			Class446.aClass131_5549.method1559(5, 1793975433);
			Class233.aClass519_2467.method6220(5, -2030717279);
			Class363.aClass527_3806.method6266(5, -554588865);
			Class142.aClass368_1568.method4307(5, (short) 5890);
			OutgoingPacket.aClass341_2578.method3975(5, (byte) 43);
			Class305.method3042(5, 1287718104);
			Class15.method445(50, -780447313);
			Class219.aClass230_2183.method2337(50, -1571685277);
			Class385.method4429(5, 2064578514);
			Class81.method953(5, (byte) -7);
			client.aClass367_8974.method4292(5, (byte) 53);
			Class484.aClass367_5788.method4292(5, (byte) 74);
			Class428.aClass367_4355.method4292(5, (byte) 124);
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rh.gf(" + ')');
		}
	}

	public static boolean method5259(byte arg0) {
		try {
			return Class110.anInt1152 == 0 ? Class110.aClass330_Sub40_Sub2_1155.method3595(-1841646113) : true;
		} catch (RuntimeException var2) {
			throw Class476.method5964(var2, "rh.k(" + ')');
		}
	}

	public static final void method5260(Class430 arg0, byte arg1) throws Exception_Sub4 {
		try {
			arg0.anInt4376 -= 2;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			float var3 = (float) arg0.anIntArray4387[arg0.anInt4376 + 1] / 1000.0F;
			Class401_Sub1.aClass145_Sub1_8249.method1683(var2, var3, -1426800827);
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "rh.aig(" + ')');
		}
	}

	public static final void method5261(Class430 arg0, short arg1) {
		try {
			arg0.anInt4376 -= 3;
			int var2 = arg0.anIntArray4387[arg0.anInt4376];
			int var3 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 2];
			Class141 var5 = Class217.method2247(var2, -585750078);
			float var6 = (float) var3;
			if (var5 == Class141.aClass141_1562 || Class141.aClass141_1559 == var5 || var5 == Class141.aClass141_1564) {
				var6 = Class257.method2541(var3);
			}
			Class330_Sub36_Sub15_Sub2 var7 = new Class330_Sub36_Sub15_Sub2(Class401_Sub1.aClass145_Sub1_8249.method1728(1009977096), var5, var6, (float) var4 / 1000.0F);
			Class401_Sub1.aClass145_Sub1_8249.method1702(var7, 261226932);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var7.anInt9720;
		} catch (RuntimeException var8) {
			throw Class476.method5964(var8, "rh.ahk(" + ')');
		}
	}
}
