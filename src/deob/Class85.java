package deob;

public class Class85 {

	public boolean aBoolean705 = false;

	public NPC aClass432_Sub1_Sub1_Sub1_Sub2_708 = null;

	public Player aClass432_Sub1_Sub1_Sub1_Sub1_709 = null;

	public int anInt704;

	public int anInt707;

	public static int anInt706 = 25;

	public static int anInt712;

	public static int anInt713;

	public int[] anIntArray710;

	public static int[] anIntArray711;

	public Class85(Buffer arg0, int arg1) {
		this.anInt704 = arg1;
		int var3 = arg0.readUnsignedByte(-222833341);
		switch(var3) {
			case 0:
				this.anInt707 = arg0.readBigSmart(-1881489425);
				break;
			case 1:
				this.anInt707 = -1;
				break;
			default:
				this.anInt707 = -1;
		}
		arg0.readString(-117729603);
	}

	public boolean method969(short arg0) {
		try {
			if (this.anInt707 < 0) {
				return true;
			}
			Class551 var2 = Class158_Sub3.aClass553_8875.method6392(this.anInt707, 739964309);
			boolean var3 = var2.method6369(-859335134);
			if (this.anIntArray710 == null) {
				Class364 var4 = Class102.aClass362_924.method4254(var2.anInt6338, 1997266210);
				this.anIntArray710 = var4.method4266((byte) 3);
			}
			int[] var8 = this.anIntArray710;
			for (int var5 = 0; var5 < var8.length; var5++) {
				int var6 = var8[var5];
				var3 &= Class201.aClass436_6511.method5570(var6, 1283399417).method5600(1449102354);
			}
			return var3;
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "dk.o(" + ')');
		}
	}

	public void method970(byte arg0) {
		try {
			this.aClass432_Sub1_Sub1_Sub1_Sub2_708 = null;
			this.aClass432_Sub1_Sub1_Sub1_Sub1_709 = null;
			this.aBoolean705 = false;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dk.j(" + ')');
		}
	}

	public void method971(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (this.aClass432_Sub1_Sub1_Sub1_Sub2_708 == null) {
				this.aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8658 = this.aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8654 = (byte) arg0;
				this.aClass432_Sub1_Sub1_Sub1_Sub1_709.method5463(arg1, arg2, (short) 1007);
			} else {
				this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5478(arg0, arg1, arg2, true, this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5453(-1960016466), -1737258822);
			}
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "dk.i(" + ')');
		}
	}

	public void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (!this.aBoolean705) {
				this.aBoolean705 = true;
				if (this.anInt707 >= 0) {
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708 = new NPC(client.aClass304_9030.method3023(-400722441), 25);
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10008 = this.anInt704;
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10069 = client.anInt8981;
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5475(Class158_Sub3.aClass553_8875.method6392(this.anInt707, 1433387112), 1918950667);
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5420(this.aClass432_Sub1_Sub1_Sub1_Sub2_708.aClass551_10251.anInt6295, (short) -28377);
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10051 = this.aClass432_Sub1_Sub1_Sub1_Sub2_708.aClass551_10251.anInt6325 << 3;
					this.aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10052 = ++Class96.anInt858 - 1;
				} else {
					this.aClass432_Sub1_Sub1_Sub1_Sub1_709 = new Player(client.aClass304_9030.method3023(-400722441), 25);
					this.aClass432_Sub1_Sub1_Sub1_Sub1_709.sendAppearance(Class444.aClass330_Sub46_4496, 81081685);
					this.aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10008 = this.anInt704;
					this.aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10069 = client.anInt8981;
					this.aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10052 = ++Class96.anInt858 - 1;
				}
			}
			if (this.anInt707 >= 0) {
				this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5478(arg2, arg0, arg1, true, this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5453(-2096317917), -1737258822);
				this.aClass432_Sub1_Sub1_Sub1_Sub2_708.method5411(arg3, true, -415032903);
			} else {
				this.aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8658 = this.aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8654 = (byte) arg2;
				this.aClass432_Sub1_Sub1_Sub1_Sub1_709.method5463(arg0, arg1, (short) 1007);
				this.aClass432_Sub1_Sub1_Sub1_Sub1_709.method5411(arg3, true, 1712159134);
			}
		} catch (RuntimeException var7) {
			throw Class476.method5964(var7, "dk.r(" + ')');
		}
	}

	public Class432_Sub1_Sub1_Sub1 method973(int arg0) {
		try {
			return this.aClass432_Sub1_Sub1_Sub1_Sub2_708 == null ? this.aClass432_Sub1_Sub1_Sub1_Sub1_709 : this.aClass432_Sub1_Sub1_Sub1_Sub2_708;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dk.p(" + ')');
		}
	}

	public static Class210 method974(int arg0, int arg1) {
		try {
			Class210 var2 = (Class210) Class210.aClass367_1994.get((long) arg0);
			if (var2 != null) {
				return var2;
			}
			byte[] var3 = Class210.aClass280_2033.getFile(0, arg0);
			var2 = new Class210();
			if (var3 != null) {
				var2.method2212(new Buffer(var3), (byte) -69);
			}
			var2.method2213(-531050747);
			Class210.aClass367_1994.put(var2, (long) arg0);
			return var2;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dk.j(" + ')');
		}
	}

	public static final void method975(Class430 arg0, byte arg1) {
		try {
			int var2 = arg0.anIntArray4387[--arg0.anInt4376];
			Class372 var3 = Class79.aClass380_666.method4387(var2, (byte) -34);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var3.anInt3911;
		} catch (RuntimeException var4) {
			throw Class476.method5964(var4, "dk.aop(" + ')');
		}
	}

	public static void method976(Class430 arg0, byte arg1) {
		try {
			arg0.anIntArray4387[arg0.anInt4376 - 2] = Class131.aClass407_1502.method4752(arg0.anIntArray4387[arg0.anInt4376 - 2], -2081893146).anIntArrayArray4094[arg0.anIntArray4387[arg0.anInt4376 - 1]][0];
			arg0.anInt4376--;
		} catch (RuntimeException var3) {
			throw Class476.method5964(var3, "dk.k(" + ')');
		}
	}

	public static final void method977(Class430 arg0, int arg1) {
		try {
			String var2 = (String) arg0.anObjectArray4386[--arg0.anInt4378];
			arg0.anInt4376 -= 2;
			int var3 = arg0.anIntArray4387[arg0.anInt4376];
			int var4 = arg0.anIntArray4387[arg0.anInt4376 + 1];
			Class524 var5 = Class461.method5699(Class484.aClass280_5822, var4, 0, 1479980784);
			arg0.anIntArray4387[++arg0.anInt4376 - 1] = var5.method6246(var2, var3, Class57.aClass61Array6599, (byte) 21);
		} catch (RuntimeException var6) {
			throw Class476.method5964(var6, "dk.aal(" + ')');
		}
	}
}
